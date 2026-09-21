# service184 candidate 0x1867b28 validation

Candidate ABI:
- +0x28 = 0xb00302 -> lea rax,[rdi+0x50]; ret
- +0x30 = 0x11ca6fe -> lea rax,[rdi+0xd0]; ret
- +0x38 = 0x135c758 sret-style
- exact service184 callers null-check +0x28 result, so an always-nonnull this+0x50 return is already semantically weak

## Candidate vtable
- +0x0: 0x135c70c FDE=(20301580, 20301637)
- +0x8: 0x135c746 FDE=(20301638, 20301656)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0xac3ae0 FDE=(11287264, 11287269)
- +0x28: 0xb00302 FDE=(11535106, 11535111)
- +0x30: 0x11ca6fe FDE=(18654974, 18654982)
- +0x38: 0x135c758 FDE=(20301656, 20301681)
- +0x40: 0x10d4edc FDE=(17649372, 17649397)
- +0x48: 0xbf7896 FDE=(12548246, 12548251)
- +0x50: 0x0 FDE=None
- +0x58: 0x0 FDE=None
- +0x60: 0x135c5b0 FDE=(20301232, 20301251)
- +0x68: 0x135c5c4 FDE=(20301252, 20301270)
- +0x70: 0x135c5d6 FDE=(20301270, 20301322)
- +0x78: 0x135c60a FDE=(20301322, 20301348)
- +0x80: 0x135c2fa FDE=(20300538, 20300547)
- +0x88: 0x135c304 FDE=(20300548, 20300570)

## +0x28 method body
  b00302:	48 8d 47 50          	lea    rax,[rdi+0x50]
  b00306:	c3                   	ret

## AP materializations: 2
### 0x135a7e1; FDE=(20293452, 20300282): lea    rcx,[rip+0x50d340]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>
     135a763:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
     135a76a:	00 
     135a76b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135a772:	00 00 
     135a774:	48 89 84 24 10 0d 00 	mov    QWORD PTR [rsp+0xd10],rax
     135a77b:	00 
     135a77c:	48 89 cf             	mov    rdi,rcx
     135a77f:	e8 fa b7 82 ff       	call   b85f7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2f1e>
     135a784:	49 89 c6             	mov    r14,rax
     135a787:	48 89 df             	mov    rdi,rbx
     135a78a:	e8 11 8b 80 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
     135a78f:	49 8b 4c 24 20       	mov    rcx,QWORD PTR [r12+0x20]
     135a794:	48 89 4c 24 58       	mov    QWORD PTR [rsp+0x58],rcx
     135a799:	4d 8b 7c 24 68       	mov    r15,QWORD PTR [r12+0x68]
     135a79e:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     135a7a1:	48 89 c7             	mov    rdi,rax
     135a7a4:	ff 51 28             	call   QWORD PTR [rcx+0x28]
     135a7a7:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     135a7ac:	4d 8b 6c 24 30       	mov    r13,QWORD PTR [r12+0x30]
     135a7b1:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]
     135a7b6:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     135a7bd:	00 
     135a7be:	4c 89 a4 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r12
     135a7c5:	00 
     135a7c6:	49 8b 84 24 80 00 00 	mov    rax,QWORD PTR [r12+0x80]
     135a7cd:	00 
     135a7ce:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     135a7d3:	bf e0 00 00 00       	mov    edi,0xe0
     135a7d8:	e8 23 37 49 00       	call   17edf00 <_Znwm@plt>
     135a7dd:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     135a7e1:	48 8d 0d 40 d3 50 00 	lea    rcx,[rip+0x50d340]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>
     135a7e8:	48 89 08             	mov    QWORD PTR [rax],rcx
     135a7eb:	66 0f ef c0          	pxor   xmm0,xmm0
     135a7ef:	66 0f 7f 40 10       	movdqa XMMWORD PTR [rax+0x10],xmm0
     135a7f4:	66 c7 40 20 00 01    	mov    WORD PTR [rax+0x20],0x100
     135a7fa:	48 8d 48 28          	lea    rcx,[rax+0x28]
     135a7fe:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
     135a803:	48 8d 48 50          	lea    rcx,[rax+0x50]
     135a807:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
     135a80e:	00 
     135a80f:	48 83 a0 90 00 00 00 	and    QWORD PTR [rax+0x90],0x0
     135a816:	00 
     135a817:	48 83 a0 c0 00 00 00 	and    QWORD PTR [rax+0xc0],0x0
     135a81e:	00 
     135a81f:	48 8d a8 d0 00 00 00 	lea    rbp,[rax+0xd0]
     135a826:	48 83 a0 d0 00 00 00 	and    QWORD PTR [rax+0xd0],0x0
     135a82d:	00 
     135a82e:	f3 0f 7f 40 28       	movdqu XMMWORD PTR [rax+0x28],xmm0
     135a833:	f3 0f 7f 40 38       	movdqu XMMWORD PTR [rax+0x38],xmm0
     135a838:	f3 0f 7f 40 48       	movdqu XMMWORD PTR [rax+0x48],xmm0
     135a83d:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     135a842:	f3 0f 7f 40 58       	movdqu XMMWORD PTR [rax+0x58],xmm0
     135a847:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     135a84b:	48 83 ec 10          	sub    rsp,0x10
     135a84f:	83 24 24 00          	and    DWORD PTR [rsp],0x0
     135a853:	bb 10 27 00 00       	mov    ebx,0x2710
     135a858:	89 5c 24 08          	mov    DWORD PTR [rsp+0x8],ebx
     135a85c:	48 8d 35 cd 25 08 ff 	lea    rsi,[rip+0xffffffffff0825cd]        # 3dce30 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x287f>
     135a863:	48 8d 0d e6 25 08 ff 	lea    rcx,[rip+0xffffffffff0825e6]        # 3dce50 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x289f>
     135a86a:	6a 18                	push   0x18
     135a86c:	41 5c                	pop    r12
     135a86e:	6a 2d                	push   0x2d
     135a870:	41 58                	pop    r8
     135a872:	4c 89 e2             	mov    rdx,r12
     135a875:	45 31 c9             	xor    r9d,r9d
     135a878:	e8 75 cd 28 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
     135a87d:	48 83 c4 10          	add    rsp,0x10
     135a881:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     135a885:	48 8d 35 f4 25 08 ff 	lea    rsi,[rip+0xffffffffff0825f4]        # 3dce80 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x28cf>
     135a88c:	48 8d 0d 0d 26 08 ff 	lea    rcx,[rip+0xffffffffff08260d]        # 3dcea0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x28ef>
     135a893:	6a 1a                	push   0x1a
     135a895:	41 58                	pop    r8
     135a897:	4c 89 e2             	mov    rdx,r12
     135a89a:	41 b9 ee 02 00 00    	mov    r9d,0x2ee
     135a8a0:	53                   	push   rbx
     135a8a1:	6a 00                	push   0x0
     135a8a3:	e8 4a cd 28 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
     135a8a8:	48 83 c4 10          	add    rsp,0x10
     135a8ac:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     135a8b0:	48 8d 35 09 26 08 ff 	lea    rsi,[rip+0xffffffffff082609]        # 3dcec0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x290f>
     135a8b7:	48 8d 0d 22 26 08 ff 	lea    rcx,[rip+0xffffffffff082622]        # 3dcee0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x292f>
     135a8be:	6a 22                	push   0x22
     135a8c0:	5b                   	pop    rbx
     135a8c1:	4c 89 e2             	mov    rdx,r12
     135a8c4:	49 89 d8             	mov    r8,rbx
     135a8c7:	45 31 c9             	xor    r9d,r9d
     135a8ca:	e8 8f cc 28 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
     135a8cf:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     135a8d3:	48 8d 35 36 26 08 ff 	lea    rsi,[rip+0xffffffffff082636]        # 3dcf10 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x295f>
     135a8da:	48 8d 0d 4f 26 08 ff 	lea    rcx,[rip+0xffffffffff08264f]        # 3dcf30 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x297f>
     135a8e1:	4c 89 e2             	mov    rdx,r12
     135a8e4:	49 89 d8             	mov    r8,rbx
     135a8e7:	45 31 c9             	xor    r9d,r9d
     135a8ea:	e8 6f cc 28 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
     135a8ef:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
     135a8f4:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     135a8f8:	48 8d 35 61 26 08 ff 	lea    rsi,[rip+0xffffffffff082661]        # 3dcf60 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x29af>
     135a8ff:	48 8d 0d 7a 26 08 ff 	lea    rcx,[rip+0xffffffffff08267a]        # 3dcf80 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x29cf>
     135a906:	6a 1f                	push   0x1f
     135a908:	41 58                	pop    r8
     135a90a:	6a 01                	push   0x1

### 0x135c710; FDE=(20301580, 20301637): lea    rax,[rip+0x50b411]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>
     135c6b8:	41 52                	push   r10
     135c6ba:	41 57                	push   r15
     135c6bc:	50                   	push   rax
     135c6bd:	ff 74 24 38          	push   QWORD PTR [rsp+0x38]
     135c6c1:	e8 54 d7 10 00       	call   1469e1a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2af39e>
     135c6c6:	48 83 c4 20          	add    rsp,0x20
     135c6ca:	31 ff                	xor    edi,edi
     135c6cc:	e8 4b 1d 74 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     135c6d1:	4c 89 23             	mov    QWORD PTR [rbx],r12
     135c6d4:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
     135c6d8:	31 ff                	xor    edi,edi
     135c6da:	e8 a7 1d 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135c6df:	48 89 d8             	mov    rax,rbx
     135c6e2:	48 83 c4 28          	add    rsp,0x28
     135c6e6:	5b                   	pop    rbx
     135c6e7:	41 5c                	pop    r12
     135c6e9:	41 5d                	pop    r13
     135c6eb:	41 5e                	pop    r14
     135c6ed:	41 5f                	pop    r15
     135c6ef:	5d                   	pop    rbp
     135c6f0:	c3                   	ret
     135c6f1:	48 89 c3             	mov    rbx,rax
     135c6f4:	4c 89 f7             	mov    rdi,r14
     135c6f7:	e8 14 19 49 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     135c6fc:	4c 89 f7             	mov    rdi,r14
     135c6ff:	e8 18 1d 74 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     135c704:	48 89 df             	mov    rdi,rbx
     135c707:	e8 c4 35 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     135c70c:	53                   	push   rbx
     135c70d:	48 89 fb             	mov    rbx,rdi
     135c710:	48 8d 05 11 b4 50 00 	lea    rax,[rip+0x50b411]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>
     135c717:	48 89 07             	mov    QWORD PTR [rdi],rax
     135c71a:	48 81 c7 d0 00 00 00 	add    rdi,0xd0
     135c721:	e8 58 fb ff ff       	call   135c27e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1802>
     135c726:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
     135c72a:	e8 3f bb 82 ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
     135c72f:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     135c733:	e8 d8 63 79 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
     135c738:	48 83 c3 28          	add    rbx,0x28
     135c73c:	48 89 df             	mov    rdi,rbx
     135c73f:	5b                   	pop    rbx
     135c740:	e9 e7 fa ff ff       	jmp    135c22c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a17b0>
     135c745:	cc                   	int3
     135c746:	53                   	push   rbx
     135c747:	48 89 fb             	mov    rbx,rdi
     135c74a:	e8 bd ff ff ff       	call   135c70c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1c90>
     135c74f:	48 89 df             	mov    rdi,rbx
     135c752:	5b                   	pop    rbx
     135c753:	e9 c8 17 49 00       	jmp    17edf20 <_ZdlPv@plt>
     135c758:	48 89 f8             	mov    rax,rdi
     135c75b:	48 8b 4e 48          	mov    rcx,QWORD PTR [rsi+0x48]
     135c75f:	0f 28 46 40          	movaps xmm0,XMMWORD PTR [rsi+0x40]
     135c763:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     135c766:	48 85 c9             	test   rcx,rcx
     135c769:	74 05                	je     135c770 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1cf4>
     135c76b:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     135c770:	c3                   	ret
     135c771:	cc                   	int3
     135c772:	48 8d 05 27 08 08 ff 	lea    rax,[rip+0xffffffffff080827]        # 3dcfa0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x29ef>
     135c779:	6a 01                	push   0x1
     135c77b:	5a                   	pop    rdx
     135c77c:	c3                   	ret
     135c77d:	cc                   	int3
     135c77e:	41 57                	push   r15
     135c780:	41 56                	push   r14
     135c782:	53                   	push   rbx
     135c783:	48 83 ec 20          	sub    rsp,0x20
     135c787:	49 89 ce             	mov    r14,rcx
     135c78a:	49 89 d7             	mov    r15,rdx
     135c78d:	48 89 fb             	mov    rbx,rdi
     135c790:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135c797:	00 00 
     135c799:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     135c79e:	48 8b 79 08          	mov    rdi,QWORD PTR [rcx+0x8]
     135c7a2:	48 8b 71 10          	mov    rsi,QWORD PTR [rcx+0x10]
     135c7a6:	ba b8 00 00 00       	mov    edx,0xb8
     135c7ab:	e8 2e 5b 80 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     135c7b0:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135c7b3:	4c 8b b0 c0 05 00 00 	mov    r14,QWORD PTR [rax+0x5c0]
     135c7ba:	4c 89 f7             	mov    rdi,r14
     135c7bd:	e8 d8 a4 a8 ff       	call   de6c9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3d20>
     135c7c2:	49 8b 8f 90 00 00 00 	mov    rcx,QWORD PTR [r15+0x90]
     135c7c9:	49 8b b7 38 01 00 00 	mov    rsi,QWORD PTR [r15+0x138]
     135c7d0:	49 83 c6 20          	add    r14,0x20
     135c7d4:	4c 8d 44 24 08       	lea    r8,[rsp+0x8]
     135c7d9:	49 83 20 00          	and    QWORD PTR [r8],0x0
     135c7dd:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     135c7e2:	4c 89 f2             	mov    rdx,r14
     135c7e5:	e8 21 3e 96 ff       	call   cc060b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20d5ab>
     135c7ea:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     135c7ef:	48 89 03             	mov    QWORD PTR [rbx],rax
     135c7f2:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     135c7f7:	48 83 64 24 08 00    	and    QWORD PTR [rsp+0x8],0x0
     135c7fd:	48 85 ff             	test   rdi,rdi
     135c800:	74 06                	je     135c808 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1d8c>
     135c802:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135c805:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135c808:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135c80f:	00 00 
     135c811:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     135c816:	75 3e                	jne    135c856 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1dda>

## Writes to +0x50 in candidate materializer FDEs
### 0x135a7fe: mov    QWORD PTR [rsp+0x50],rcx
     135a7c6:	49 8b 84 24 80 00 00 	mov    rax,QWORD PTR [r12+0x80]
     135a7cd:	00 
     135a7ce:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     135a7d3:	bf e0 00 00 00       	mov    edi,0xe0
     135a7d8:	e8 23 37 49 00       	call   17edf00 <_Znwm@plt>
     135a7dd:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     135a7e1:	48 8d 0d 40 d3 50 00 	lea    rcx,[rip+0x50d340]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>
     135a7e8:	48 89 08             	mov    QWORD PTR [rax],rcx
     135a7eb:	66 0f ef c0          	pxor   xmm0,xmm0
     135a7ef:	66 0f 7f 40 10       	movdqa XMMWORD PTR [rax+0x10],xmm0
     135a7f4:	66 c7 40 20 00 01    	mov    WORD PTR [rax+0x20],0x100
     135a7fa:	48 8d 48 28          	lea    rcx,[rax+0x28]
     135a7fe:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
     135a803:	48 8d 48 50          	lea    rcx,[rax+0x50]
     135a807:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
     135a80e:	00 
     135a80f:	48 83 a0 90 00 00 00 	and    QWORD PTR [rax+0x90],0x0
     135a816:	00 
     135a817:	48 83 a0 c0 00 00 00 	and    QWORD PTR [rax+0xc0],0x0
     135a81e:	00 
     135a81f:	48 8d a8 d0 00 00 00 	lea    rbp,[rax+0xd0]
     135a826:	48 83 a0 d0 00 00 00 	and    QWORD PTR [rax+0xd0],0x0
     135a82d:	00 
     135a82e:	f3 0f 7f 40 28       	movdqu XMMWORD PTR [rax+0x28],xmm0
     135a833:	f3 0f 7f 40 38       	movdqu XMMWORD PTR [rax+0x38],xmm0
     135a838:	f3 0f 7f 40 48       	movdqu XMMWORD PTR [rax+0x48],xmm0
     135a83d:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     135a842:	f3 0f 7f 40 58       	movdqu XMMWORD PTR [rax+0x58],xmm0
     135a847:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     135a84b:	48 83 ec 10          	sub    rsp,0x10
     135a84f:	83 24 24 00          	and    DWORD PTR [rsp],0x0
     135a853:	bb 10 27 00 00       	mov    ebx,0x2710
     135a858:	89 5c 24 08          	mov    DWORD PTR [rsp+0x8],ebx
     135a85c:	48 8d 35 cd 25 08 ff 	lea    rsi,[rip+0xffffffffff0825cd]        # 3dce30 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x287f>
     135a863:	48 8d 0d e6 25 08 ff 	lea    rcx,[rip+0xffffffffff0825e6]        # 3dce50 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x289f>
     135a86a:	6a 18                	push   0x18
     135a86c:	41 5c                	pop    r12
     135a86e:	6a 2d                	push   0x2d
     135a870:	41 58                	pop    r8

### 0x135ad69: movdqu XMMWORD PTR [r12+0x50],xmm0
     135ad2c:	f3 41 0f 7f 44 24 20 	movdqu XMMWORD PTR [r12+0x20],xmm0
     135ad33:	48 8d 05 26 a1 51 00 	lea    rax,[rip+0x51a126]        # 1874e60 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x31548>
     135ad3a:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
     135ad3f:	49 8d 7c 24 30       	lea    rdi,[r12+0x30]
     135ad44:	48 8b b4 24 e0 00 00 	mov    rsi,QWORD PTR [rsp+0xe0]
     135ad4b:	00 
     135ad4c:	e8 55 eb 28 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
     135ad51:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
     135ad56:	49 89 44 24 40       	mov    QWORD PTR [r12+0x40],rax
     135ad5b:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     135ad60:	49 89 44 24 48       	mov    QWORD PTR [r12+0x48],rax
     135ad65:	66 0f ef c0          	pxor   xmm0,xmm0
     135ad69:	f3 41 0f 7f 44 24 50 	movdqu XMMWORD PTR [r12+0x50],xmm0
     135ad70:	f3 41 0f 7f 44 24 60 	movdqu XMMWORD PTR [r12+0x60],xmm0
     135ad77:	f3 41 0f 7f 44 24 70 	movdqu XMMWORD PTR [r12+0x70],xmm0
     135ad7e:	f3 41 0f 7f 84 24 80 	movdqu XMMWORD PTR [r12+0x80],xmm0
     135ad85:	00 00 00 
     135ad88:	66 49 0f 6e cc       	movq   xmm1,r12
     135ad8d:	66 48 0f 6e c3       	movq   xmm0,rbx
     135ad92:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     135ad98:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
     135ad9d:	48 85 c0             	test   rax,rax
     135ada0:	74 0a                	je     135adac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0330>
     135ada2:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     135ada6:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
     135adaa:	75 34                	jne    135ade0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0364>
     135adac:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
     135adb2:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
     135adb8:	49 89 5c 24 20       	mov    QWORD PTR [r12+0x20],rbx
     135adbd:	49 8b 7c 24 28       	mov    rdi,QWORD PTR [r12+0x28]
     135adc2:	4d 89 64 24 28       	mov    QWORD PTR [r12+0x28],r12
     135adc7:	66 0f 7f 4c 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm1
     135adcd:	e8 e0 36 74 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     135add2:	4c 89 e7             	mov    rdi,r12
     135add5:	e8 ac 36 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135adda:	66 0f 6f 4c 24 40    	movdqa xmm1,XMMWORD PTR [rsp+0x40]
     135ade0:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     135ade6:	66 0f 6c c1          	punpcklqdq xmm0,xmm1
     135adea:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0

### 0x135b3b1: movups XMMWORD PTR [r13+0x50],xmm0
     135b382:	48 8b 84 24 68 02 00 	mov    rax,QWORD PTR [rsp+0x268]
     135b389:	00 
     135b38a:	0f 28 84 24 60 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x260]
     135b391:	00 
     135b392:	41 0f 11 45 40       	movups XMMWORD PTR [r13+0x40],xmm0
     135b397:	48 85 c0             	test   rax,rax
     135b39a:	74 05                	je     135b3a1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0925>
     135b39c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135b3a1:	48 8b 84 24 78 02 00 	mov    rax,QWORD PTR [rsp+0x278]
     135b3a8:	00 
     135b3a9:	0f 28 84 24 70 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x270]
     135b3b0:	00 
     135b3b1:	41 0f 11 45 50       	movups XMMWORD PTR [r13+0x50],xmm0
     135b3b6:	48 85 c0             	test   rax,rax
     135b3b9:	74 05                	je     135b3c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0944>
     135b3bb:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135b3c0:	48 8b 84 24 88 02 00 	mov    rax,QWORD PTR [rsp+0x288]
     135b3c7:	00 
     135b3c8:	0f 28 84 24 80 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x280]
     135b3cf:	00 
     135b3d0:	41 0f 11 45 60       	movups XMMWORD PTR [r13+0x60],xmm0
     135b3d5:	48 85 c0             	test   rax,rax
     135b3d8:	74 05                	je     135b3df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0963>
     135b3da:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135b3df:	48 89 5c 24 28       	mov    QWORD PTR [rsp+0x28],rbx
     135b3e4:	48 8d 84 24 a0 02 00 	lea    rax,[rsp+0x2a0]
     135b3eb:	00 
     135b3ec:	48 8b 48 f8          	mov    rcx,QWORD PTR [rax-0x8]
     135b3f0:	0f 28 40 f0          	movaps xmm0,XMMWORD PTR [rax-0x10]
     135b3f4:	41 0f 11 45 70       	movups XMMWORD PTR [r13+0x70],xmm0
     135b3f9:	48 85 c9             	test   rcx,rcx
     135b3fc:	74 05                	je     135b403 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0987>
     135b3fe:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     135b403:	48 8d 9c 24 f0 02 00 	lea    rbx,[rsp+0x2f0]
     135b40a:	00 
     135b40b:	0f 28 00             	movaps xmm0,XMMWORD PTR [rax]
     135b40e:	41 0f 29 85 80 00 00 	movaps XMMWORD PTR [r13+0x80],xmm0
     135b415:	00 
     135b416:	48 8b 43 c8          	mov    rax,QWORD PTR [rbx-0x38]

### 0x135bbff: mov    QWORD PTR [rax+0x50],rcx
     135bbd2:	00 
     135bbd3:	0f 10 84 24 b8 01 00 	movups xmm0,XMMWORD PTR [rsp+0x1b8]
     135bbda:	00 
     135bbdb:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
     135bbdf:	48 85 c9             	test   rcx,rcx
     135bbe2:	74 05                	je     135bbe9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a116d>
     135bbe4:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     135bbe9:	f3 0f 6f 84 24 c8 01 	movdqu xmm0,XMMWORD PTR [rsp+0x1c8]
     135bbf0:	00 00 
     135bbf2:	f3 0f 7f 40 40       	movdqu XMMWORD PTR [rax+0x40],xmm0
     135bbf7:	48 8b 8c 24 d8 01 00 	mov    rcx,QWORD PTR [rsp+0x1d8]
     135bbfe:	00 
     135bbff:	48 89 48 50          	mov    QWORD PTR [rax+0x50],rcx
     135bc03:	48 85 c9             	test   rcx,rcx
     135bc06:	74 05                	je     135bc0d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1191>
     135bc08:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     135bc0d:	48 89 84 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rax
     135bc14:	00 
     135bc15:	4c 89 b4 24 10 01 00 	mov    QWORD PTR [rsp+0x110],r14
     135bc1c:	00 
     135bc1d:	49 8b 5e 30          	mov    rbx,QWORD PTR [r14+0x30]
     135bc21:	48 89 9c 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rbx
     135bc28:	00 
     135bc29:	4d 8b 66 38          	mov    r12,QWORD PTR [r14+0x38]
     135bc2d:	4c 89 a4 24 20 01 00 	mov    QWORD PTR [rsp+0x120],r12
     135bc34:	00 
     135bc35:	4d 85 e4             	test   r12,r12
     135bc38:	74 06                	je     135bc40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a11c4>
     135bc3a:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
     135bc40:	4c 89 bc 24 28 01 00 	mov    QWORD PTR [rsp+0x128],r15
     135bc47:	00 
     135bc48:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     135bc4d:	48 89 84 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rax
     135bc54:	00 
     135bc55:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135bc5a:	4c 89 6c 24 28       	mov    QWORD PTR [rsp+0x28],r13
     135bc5f:	4c 89 ac 24 38 01 00 	mov    QWORD PTR [rsp+0x138],r13
     135bc66:	00 
     135bc67:	4c 8b ac 24 f8 00 00 	mov    r13,QWORD PTR [rsp+0xf8]

### 0x135bd23: mov    QWORD PTR [rax+0x50],rbp
     135bcf1:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     135bcf6:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
     135bcfa:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     135bcff:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     135bd04:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx
     135bd08:	4c 89 68 38          	mov    QWORD PTR [rax+0x38],r13
     135bd0c:	4d 85 ed             	test   r13,r13
     135bd0f:	74 05                	je     135bd16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a129a>
     135bd11:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
     135bd16:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     135bd1b:	48 89 48 40          	mov    QWORD PTR [rax+0x40],rcx
     135bd1f:	4c 89 70 48          	mov    QWORD PTR [rax+0x48],r14
     135bd23:	48 89 68 50          	mov    QWORD PTR [rax+0x50],rbp
     135bd27:	48 85 ed             	test   rbp,rbp
     135bd2a:	74 05                	je     135bd31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a12b5>
     135bd2c:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
     135bd31:	48 8d 9c 24 60 01 00 	lea    rbx,[rsp+0x160]
     135bd38:	00 
     135bd39:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
     135bd3d:	4c 8d a4 24 30 02 00 	lea    r12,[rsp+0x230]
     135bd44:	00 
     135bd45:	4c 8d bc 24 18 02 00 	lea    r15,[rsp+0x218]
     135bd4c:	00 
     135bd4d:	4c 8d ac 24 e0 01 00 	lea    r13,[rsp+0x1e0]
     135bd54:	00 
     135bd55:	4c 89 e7             	mov    rdi,r12
     135bd58:	4c 89 fe             	mov    rsi,r15
     135bd5b:	4c 89 ea             	mov    rdx,r13
     135bd5e:	48 89 d9             	mov    rcx,rbx
     135bd61:	e8 e0 c3 82 ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
     135bd66:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
     135bd6d:	00 
     135bd6e:	4c 89 e6             	mov    rsi,r12
     135bd71:	e8 16 c4 82 ff       	call   b8818c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd512c>
     135bd76:	4c 89 e7             	mov    rdi,r12
     135bd79:	e8 f0 c4 82 ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
     135bd7e:	48 89 df             	mov    rdi,rbx
     135bd81:	e8 e4 e1 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135bd86:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]

## Candidate dependency-vptr hypotheses around +0x50 stores
- +0x50 store @0x135a7fe; nearby high constant 0x1867b28: 135a7e1:	48 8d 0d 40 d3 50 00 	lea    rcx,[rip+0x50d340]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>
  candidate +0x68 -> 0x135c5c4; FDE=(20301252, 20301270)
- +0x50 store @0x135ad69; nearby high constant 0x1874e60: 135ad33:	48 8d 05 26 a1 51 00 	lea    rax,[rip+0x51a126]        # 1874e60 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x31548>
  candidate +0x68 -> 0x146f0a0; FDE=(21426336, 21426362)

## Known materializer windows
### 0x135a740..0x135a860
 135a740:	48 8d 05 e6 26 08 ff 	lea    rax,[rip+0xffffffffff0826e6]        # 3dce2d <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x287c>
 135a747:	6a 02                	push   0x2
 135a749:	5a                   	pop    rdx
 135a74a:	c3                   	ret
 135a74b:	cc                   	int3
 135a74c:	55                   	push   rbp
 135a74d:	41 57                	push   r15
 135a74f:	41 56                	push   r14
 135a751:	41 55                	push   r13
 135a753:	41 54                	push   r12
 135a755:	53                   	push   rbx
 135a756:	48 81 ec 18 0d 00 00 	sub    rsp,0xd18
 135a75d:	48 89 cb             	mov    rbx,rcx
 135a760:	49 89 d4             	mov    r12,rdx
 135a763:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
 135a76a:	00 
 135a76b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 135a772:	00 00 
 135a774:	48 89 84 24 10 0d 00 	mov    QWORD PTR [rsp+0xd10],rax
 135a77b:	00 
 135a77c:	48 89 cf             	mov    rdi,rcx
 135a77f:	e8 fa b7 82 ff       	call   b85f7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2f1e>
 135a784:	49 89 c6             	mov    r14,rax
 135a787:	48 89 df             	mov    rdi,rbx
 135a78a:	e8 11 8b 80 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
 135a78f:	49 8b 4c 24 20       	mov    rcx,QWORD PTR [r12+0x20]
 135a794:	48 89 4c 24 58       	mov    QWORD PTR [rsp+0x58],rcx
 135a799:	4d 8b 7c 24 68       	mov    r15,QWORD PTR [r12+0x68]
 135a79e:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 135a7a1:	48 89 c7             	mov    rdi,rax
 135a7a4:	ff 51 28             	call   QWORD PTR [rcx+0x28]
 135a7a7:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 135a7ac:	4d 8b 6c 24 30       	mov    r13,QWORD PTR [r12+0x30]
 135a7b1:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]
 135a7b6:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
 135a7bd:	00 
 135a7be:	4c 89 a4 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r12
 135a7c5:	00 
 135a7c6:	49 8b 84 24 80 00 00 	mov    rax,QWORD PTR [r12+0x80]
 135a7cd:	00 
 135a7ce:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 135a7d3:	bf e0 00 00 00       	mov    edi,0xe0
 135a7d8:	e8 23 37 49 00       	call   17edf00 <_Znwm@plt>
 135a7dd:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
 135a7e1:	48 8d 0d 40 d3 50 00 	lea    rcx,[rip+0x50d340]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>
 135a7e8:	48 89 08             	mov    QWORD PTR [rax],rcx
 135a7eb:	66 0f ef c0          	pxor   xmm0,xmm0
 135a7ef:	66 0f 7f 40 10       	movdqa XMMWORD PTR [rax+0x10],xmm0
 135a7f4:	66 c7 40 20 00 01    	mov    WORD PTR [rax+0x20],0x100
 135a7fa:	48 8d 48 28          	lea    rcx,[rax+0x28]
 135a7fe:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
 135a803:	48 8d 48 50          	lea    rcx,[rax+0x50]
 135a807:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
 135a80e:	00 
 135a80f:	48 83 a0 90 00 00 00 	and    QWORD PTR [rax+0x90],0x0
 135a816:	00 
 135a817:	48 83 a0 c0 00 00 00 	and    QWORD PTR [rax+0xc0],0x0
 135a81e:	00 
 135a81f:	48 8d a8 d0 00 00 00 	lea    rbp,[rax+0xd0]
 135a826:	48 83 a0 d0 00 00 00 	and    QWORD PTR [rax+0xd0],0x0
 135a82d:	00 
 135a82e:	f3 0f 7f 40 28       	movdqu XMMWORD PTR [rax+0x28],xmm0
 135a833:	f3 0f 7f 40 38       	movdqu XMMWORD PTR [rax+0x38],xmm0
 135a838:	f3 0f 7f 40 48       	movdqu XMMWORD PTR [rax+0x48],xmm0
 135a83d:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 135a842:	f3 0f 7f 40 58       	movdqu XMMWORD PTR [rax+0x58],xmm0
 135a847:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
 135a84b:	48 83 ec 10          	sub    rsp,0x10
 135a84f:	83 24 24 00          	and    DWORD PTR [rsp],0x0
 135a853:	bb 10 27 00 00       	mov    ebx,0x2710
 135a858:	89 5c 24 08          	mov    DWORD PTR [rsp+0x8],ebx
 135a85c:	48 8d 35 cd 25 08 ff 	lea    rsi,[rip+0xffffffffff0825cd]        # 3dce30 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x287f>

### 0x135c6d0..0x135c820
 135c6d1:	4c 89 23             	mov    QWORD PTR [rbx],r12
 135c6d4:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
 135c6d8:	31 ff                	xor    edi,edi
 135c6da:	e8 a7 1d 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 135c6df:	48 89 d8             	mov    rax,rbx
 135c6e2:	48 83 c4 28          	add    rsp,0x28
 135c6e6:	5b                   	pop    rbx
 135c6e7:	41 5c                	pop    r12
 135c6e9:	41 5d                	pop    r13
 135c6eb:	41 5e                	pop    r14
 135c6ed:	41 5f                	pop    r15
 135c6ef:	5d                   	pop    rbp
 135c6f0:	c3                   	ret
 135c6f1:	48 89 c3             	mov    rbx,rax
 135c6f4:	4c 89 f7             	mov    rdi,r14
 135c6f7:	e8 14 19 49 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
 135c6fc:	4c 89 f7             	mov    rdi,r14
 135c6ff:	e8 18 1d 74 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
 135c704:	48 89 df             	mov    rdi,rbx
 135c707:	e8 c4 35 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 135c70c:	53                   	push   rbx
 135c70d:	48 89 fb             	mov    rbx,rdi
 135c710:	48 8d 05 11 b4 50 00 	lea    rax,[rip+0x50b411]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>
 135c717:	48 89 07             	mov    QWORD PTR [rdi],rax
 135c71a:	48 81 c7 d0 00 00 00 	add    rdi,0xd0
 135c721:	e8 58 fb ff ff       	call   135c27e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1802>
 135c726:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
 135c72a:	e8 3f bb 82 ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
 135c72f:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
 135c733:	e8 d8 63 79 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
 135c738:	48 83 c3 28          	add    rbx,0x28
 135c73c:	48 89 df             	mov    rdi,rbx
 135c73f:	5b                   	pop    rbx
 135c740:	e9 e7 fa ff ff       	jmp    135c22c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a17b0>
 135c745:	cc                   	int3
 135c746:	53                   	push   rbx
 135c747:	48 89 fb             	mov    rbx,rdi
 135c74a:	e8 bd ff ff ff       	call   135c70c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1c90>
 135c74f:	48 89 df             	mov    rdi,rbx
 135c752:	5b                   	pop    rbx
 135c753:	e9 c8 17 49 00       	jmp    17edf20 <_ZdlPv@plt>
 135c758:	48 89 f8             	mov    rax,rdi
 135c75b:	48 8b 4e 48          	mov    rcx,QWORD PTR [rsi+0x48]
 135c75f:	0f 28 46 40          	movaps xmm0,XMMWORD PTR [rsi+0x40]
 135c763:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
 135c766:	48 85 c9             	test   rcx,rcx
 135c769:	74 05                	je     135c770 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1cf4>
 135c76b:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
 135c770:	c3                   	ret
 135c771:	cc                   	int3
 135c772:	48 8d 05 27 08 08 ff 	lea    rax,[rip+0xffffffffff080827]        # 3dcfa0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x29ef>
 135c779:	6a 01                	push   0x1
 135c77b:	5a                   	pop    rdx
 135c77c:	c3                   	ret
 135c77d:	cc                   	int3
 135c77e:	41 57                	push   r15
 135c780:	41 56                	push   r14
 135c782:	53                   	push   rbx
 135c783:	48 83 ec 20          	sub    rsp,0x20
 135c787:	49 89 ce             	mov    r14,rcx
 135c78a:	49 89 d7             	mov    r15,rdx
 135c78d:	48 89 fb             	mov    rbx,rdi
 135c790:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 135c797:	00 00 
 135c799:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 135c79e:	48 8b 79 08          	mov    rdi,QWORD PTR [rcx+0x8]
 135c7a2:	48 8b 71 10          	mov    rsi,QWORD PTR [rcx+0x10]
 135c7a6:	ba b8 00 00 00       	mov    edx,0xb8
 135c7ab:	e8 2e 5b 80 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
 135c7b0:	49 8b 06             	mov    rax,QWORD PTR [r14]
 135c7b3:	4c 8b b0 c0 05 00 00 	mov    r14,QWORD PTR [rax+0x5c0]
 135c7ba:	4c 89 f7             	mov    rdi,r14
 135c7bd:	e8 d8 a4 a8 ff       	call   de6c9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3d20>
 135c7c2:	49 8b 8f 90 00 00 00 	mov    rcx,QWORD PTR [r15+0x90]
 135c7c9:	49 8b b7 38 01 00 00 	mov    rsi,QWORD PTR [r15+0x138]
 135c7d0:	49 83 c6 20          	add    r14,0x20
 135c7d4:	4c 8d 44 24 08       	lea    r8,[rsp+0x8]
 135c7d9:	49 83 20 00          	and    QWORD PTR [r8],0x0
 135c7dd:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 135c7e2:	4c 89 f2             	mov    rdx,r14
 135c7e5:	e8 21 3e 96 ff       	call   cc060b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20d5ab>
 135c7ea:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 135c7ef:	48 89 03             	mov    QWORD PTR [rbx],rax
 135c7f2:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 135c7f7:	48 83 64 24 08 00    	and    QWORD PTR [rsp+0x8],0x0
 135c7fd:	48 85 ff             	test   rdi,rdi
 135c800:	74 06                	je     135c808 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1d8c>
 135c802:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 135c805:	ff 50 08             	call   QWORD PTR [rax+0x8]
 135c808:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 135c80f:	00 00 
 135c811:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 135c816:	75 3e                	jne    135c856 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1dda>
 135c818:	48 89 d8             	mov    rax,rbx
 135c81b:	48 83 c4 20          	add    rsp,0x20
 135c81f:	5b                   	pop    rbx

## Runtime uses of exact embedded address this+0x50 near candidate code family
### 0x135009f: mov    rax,QWORD PTR [rbx+0x50]
     135007e:	48 89 df             	mov    rdi,rbx
     1350081:	e8 74 06 00 00       	call   13506fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195c7e>
     1350086:	e9 c7 05 00 00       	jmp    1350652 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195bd6>
     135008b:	4c 8d 73 18          	lea    r14,[rbx+0x18]
     135008f:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
     1350096:	00 
     1350097:	48 89 df             	mov    rdi,rbx
     135009a:	e8 5b 06 00 00       	call   13506fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195c7e>
     135009f:	48 8b 43 50          	mov    rax,QWORD PTR [rbx+0x50]
     13500a3:	48 39 43 40          	cmp    QWORD PTR [rbx+0x40],rax
     13500a7:	75 3b                	jne    13500e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195668>
     13500a9:	48 85 c0             	test   rax,rax
     13500ac:	74 36                	je     13500e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195668>
     13500ae:	4c 8d 6c 24 50       	lea    r13,[rsp+0x50]
     13500b3:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
     13500b6:	48 83 c6 10          	add    rsi,0x10
     13500ba:	4c 89 f7             	mov    rdi,r14
     13500bd:	e8 a6 57 79 ff       	call   ae5868 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x32808>
     13500c2:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     13500c7:	48 8b 6b 50          	mov    rbp,QWORD PTR [rbx+0x50]
     13500cb:	48 89 df             	mov    rdi,rbx
     13500ce:	4c 89 ee             	mov    rsi,r13
     13500d1:	e8 24 06 00 00       	call   13506fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195c7e>
     13500d6:	48 8b 43 50          	mov    rax,QWORD PTR [rbx+0x50]
     13500da:	48 39 c5             	cmp    rbp,rax

### 0x13500ae: lea    r13,[rsp+0x50]
     1350096:	00 
     1350097:	48 89 df             	mov    rdi,rbx
     135009a:	e8 5b 06 00 00       	call   13506fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195c7e>
     135009f:	48 8b 43 50          	mov    rax,QWORD PTR [rbx+0x50]
     13500a3:	48 39 43 40          	cmp    QWORD PTR [rbx+0x40],rax
     13500a7:	75 3b                	jne    13500e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195668>
     13500a9:	48 85 c0             	test   rax,rax
     13500ac:	74 36                	je     13500e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195668>
     13500ae:	4c 8d 6c 24 50       	lea    r13,[rsp+0x50]
     13500b3:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
     13500b6:	48 83 c6 10          	add    rsi,0x10
     13500ba:	4c 89 f7             	mov    rdi,r14
     13500bd:	e8 a6 57 79 ff       	call   ae5868 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x32808>
     13500c2:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     13500c7:	48 8b 6b 50          	mov    rbp,QWORD PTR [rbx+0x50]
     13500cb:	48 89 df             	mov    rdi,rbx
     13500ce:	4c 89 ee             	mov    rsi,r13
     13500d1:	e8 24 06 00 00       	call   13506fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195c7e>
     13500d6:	48 8b 43 50          	mov    rax,QWORD PTR [rbx+0x50]
     13500da:	48 39 c5             	cmp    rbp,rax
     13500dd:	75 05                	jne    13500e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195668>
     13500df:	48 85 c0             	test   rax,rax
     13500e2:	75 cf                	jne    13500b3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195637>
     13500e4:	48 89 df             	mov    rdi,rbx
     13500e7:	4c 89 fe             	mov    rsi,r15

### 0x13500c2: mov    QWORD PTR [rsp+0x50],rax
     13500a7:	75 3b                	jne    13500e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195668>
     13500a9:	48 85 c0             	test   rax,rax
     13500ac:	74 36                	je     13500e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195668>
     13500ae:	4c 8d 6c 24 50       	lea    r13,[rsp+0x50]
     13500b3:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
     13500b6:	48 83 c6 10          	add    rsi,0x10
     13500ba:	4c 89 f7             	mov    rdi,r14
     13500bd:	e8 a6 57 79 ff       	call   ae5868 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x32808>
     13500c2:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     13500c7:	48 8b 6b 50          	mov    rbp,QWORD PTR [rbx+0x50]
     13500cb:	48 89 df             	mov    rdi,rbx
     13500ce:	4c 89 ee             	mov    rsi,r13
     13500d1:	e8 24 06 00 00       	call   13506fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195c7e>
     13500d6:	48 8b 43 50          	mov    rax,QWORD PTR [rbx+0x50]
     13500da:	48 39 c5             	cmp    rbp,rax
     13500dd:	75 05                	jne    13500e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195668>
     13500df:	48 85 c0             	test   rax,rax
     13500e2:	75 cf                	jne    13500b3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195637>
     13500e4:	48 89 df             	mov    rdi,rbx
     13500e7:	4c 89 fe             	mov    rsi,r15
     13500ea:	e8 79 2b b7 ff       	call   ec2c68 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a07e>
     13500ef:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
     13500f3:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     13500f7:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]
     13500fc:	4c 89 ef             	mov    rdi,r13

### 0x13500c7: mov    rbp,QWORD PTR [rbx+0x50]
     13500a9:	48 85 c0             	test   rax,rax
     13500ac:	74 36                	je     13500e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195668>
     13500ae:	4c 8d 6c 24 50       	lea    r13,[rsp+0x50]
     13500b3:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
     13500b6:	48 83 c6 10          	add    rsi,0x10
     13500ba:	4c 89 f7             	mov    rdi,r14
     13500bd:	e8 a6 57 79 ff       	call   ae5868 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x32808>
     13500c2:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     13500c7:	48 8b 6b 50          	mov    rbp,QWORD PTR [rbx+0x50]
     13500cb:	48 89 df             	mov    rdi,rbx
     13500ce:	4c 89 ee             	mov    rsi,r13
     13500d1:	e8 24 06 00 00       	call   13506fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195c7e>
     13500d6:	48 8b 43 50          	mov    rax,QWORD PTR [rbx+0x50]
     13500da:	48 39 c5             	cmp    rbp,rax
     13500dd:	75 05                	jne    13500e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195668>
     13500df:	48 85 c0             	test   rax,rax
     13500e2:	75 cf                	jne    13500b3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195637>
     13500e4:	48 89 df             	mov    rdi,rbx
     13500e7:	4c 89 fe             	mov    rsi,r15
     13500ea:	e8 79 2b b7 ff       	call   ec2c68 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a07e>
     13500ef:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
     13500f3:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     13500f7:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]
     13500fc:	4c 89 ef             	mov    rdi,r13
     13500ff:	4c 89 e6             	mov    rsi,r12

### 0x13500d6: mov    rax,QWORD PTR [rbx+0x50]
     13500b6:	48 83 c6 10          	add    rsi,0x10
     13500ba:	4c 89 f7             	mov    rdi,r14
     13500bd:	e8 a6 57 79 ff       	call   ae5868 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x32808>
     13500c2:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     13500c7:	48 8b 6b 50          	mov    rbp,QWORD PTR [rbx+0x50]
     13500cb:	48 89 df             	mov    rdi,rbx
     13500ce:	4c 89 ee             	mov    rsi,r13
     13500d1:	e8 24 06 00 00       	call   13506fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195c7e>
     13500d6:	48 8b 43 50          	mov    rax,QWORD PTR [rbx+0x50]
     13500da:	48 39 c5             	cmp    rbp,rax
     13500dd:	75 05                	jne    13500e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195668>
     13500df:	48 85 c0             	test   rax,rax
     13500e2:	75 cf                	jne    13500b3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195637>
     13500e4:	48 89 df             	mov    rdi,rbx
     13500e7:	4c 89 fe             	mov    rsi,r15
     13500ea:	e8 79 2b b7 ff       	call   ec2c68 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a07e>
     13500ef:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
     13500f3:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     13500f7:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]
     13500fc:	4c 89 ef             	mov    rdi,r13
     13500ff:	4c 89 e6             	mov    rsi,r12
     1350102:	e8 39 de 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1350107:	49 8b 44 24 18       	mov    rax,QWORD PTR [r12+0x18]
     135010c:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
     1350110:	4c 8d 6c 24 30       	lea    r13,[rsp+0x30]

### 0x135017c: lea    rdi,[rsp+0x50]
     1350159:	e8 e0 ce da ff       	call   10fd03e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c4454>
     135015e:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
     1350165:	00 
     1350166:	c6 47 08 01          	mov    BYTE PTR [rdi+0x8],0x1
     135016a:	e8 e9 5b ef ff       	call   1245d58 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8b2dc>
     135016f:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
     1350173:	48 89 4c 24 48       	mov    QWORD PTR [rsp+0x48],rcx
     1350178:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     135017c:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1350181:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
     1350185:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
     1350189:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
     135018c:	0f 57 db             	xorps  xmm3,xmm3
     135018f:	41 0f 11 1f          	movups XMMWORD PTR [r15],xmm3
     1350193:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     1350198:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
     135019d:	0f 28 4c 24 20       	movaps xmm1,XMMWORD PTR [rsp+0x20]
     13501a2:	0f 28 54 24 30       	movaps xmm2,XMMWORD PTR [rsp+0x30]
     13501a7:	0f 11 4f 28          	movups XMMWORD PTR [rdi+0x28],xmm1
     13501ab:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0
     13501af:	0f 29 5c 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm3
     13501b4:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
     13501ba:	0f 11 57 38          	movups XMMWORD PTR [rdi+0x38],xmm2
     13501be:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
     13501c3:	48 89 47 48          	mov    QWORD PTR [rdi+0x48],rax

### 0x13501d1: mov    QWORD PTR [rdi+0x50],rcx
     13501ab:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0
     13501af:	0f 29 5c 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm3
     13501b4:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
     13501ba:	0f 11 57 38          	movups XMMWORD PTR [rdi+0x38],xmm2
     13501be:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
     13501c3:	48 89 47 48          	mov    QWORD PTR [rdi+0x48],rax
     13501c7:	41 0f 11 5d 00       	movups XMMWORD PTR [r13+0x0],xmm3
     13501cc:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
     13501d1:	48 89 4f 50          	mov    QWORD PTR [rdi+0x50],rcx
     13501d5:	e8 e6 f4 74 ff       	call   a9f6c0 <JNI_OnUnload@@Base+0x26f8d>
     13501da:	49 89 c7             	mov    r15,rax
     13501dd:	48 8b 6b 20          	mov    rbp,QWORD PTR [rbx+0x20]
     13501e1:	48 85 ed             	test   rbp,rbp
     13501e4:	74 1b                	je     1350201 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195785>
     13501e6:	f3 48 0f b8 cd       	popcnt rcx,rbp
     13501eb:	48 89 c8             	mov    rax,rcx
     13501ee:	48 89 0c 24          	mov    QWORD PTR [rsp],rcx
     13501f2:	48 83 f9 01          	cmp    rcx,0x1
     13501f6:	77 0e                	ja     1350206 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19578a>
     13501f8:	4c 8d 65 ff          	lea    r12,[rbp-0x1]
     13501fc:	4d 21 fc             	and    r12,r15
     13501ff:	eb 18                	jmp    1350219 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19579d>
     1350201:	e9 83 00 00 00       	jmp    1350289 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19580d>
     1350206:	4d 89 fc             	mov    r12,r15
     1350209:	49 39 ef             	cmp    r15,rbp

### 0x1350249: lea    rsi,[rsp+0x50]
     135022e:	4d 85 ff             	test   r15,r15
     1350231:	74 50                	je     1350283 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195807>
     1350233:	48 8d 45 ff          	lea    rax,[rbp-0x1]
     1350237:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     135023c:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
     1350240:	4c 39 e0             	cmp    rax,r12
     1350243:	75 17                	jne    135025c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1957e0>
     1350245:	49 8d 7f 10          	lea    rdi,[r15+0x10]
     1350249:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     135024e:	e8 9b f4 74 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     1350253:	84 c0                	test   al,al
     1350255:	74 24                	je     135027b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1957ff>
     1350257:	e9 de 03 00 00       	jmp    135063a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195bbe>
     135025c:	83 3c 24 01          	cmp    DWORD PTR [rsp],0x1
     1350260:	77 07                	ja     1350269 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1957ed>
     1350262:	48 23 44 24 08       	and    rax,QWORD PTR [rsp+0x8]
     1350267:	eb 0d                	jmp    1350276 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1957fa>
     1350269:	48 39 e8             	cmp    rax,rbp
     135026c:	72 08                	jb     1350276 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1957fa>
     135026e:	31 d2                	xor    edx,edx
     1350270:	48 f7 f5             	div    rbp
     1350273:	48 89 d0             	mov    rax,rdx
     1350276:	4c 39 e8             	cmp    rax,r13
     1350279:	75 08                	jne    1350283 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195807>
     135027b:	4d 8b 3f             	mov    r15,QWORD PTR [r15]

### 0x13502c4: lea    rsi,[rsp+0x50]
     13502a4:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
     13502ab:	00 
     13502ac:	49 83 65 00 00       	and    QWORD PTR [r13+0x0],0x0
     13502b1:	c6 84 24 c8 00 00 00 	mov    BYTE PTR [rsp+0xc8],0x0
     13502b8:	00 
     13502b9:	4d 89 7d 08          	mov    QWORD PTR [r13+0x8],r15
     13502bd:	4c 89 ef             	mov    rdi,r13
     13502c0:	48 83 c7 10          	add    rdi,0x10
     13502c4:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     13502c9:	e8 72 dc 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     13502ce:	48 8d 44 24 68       	lea    rax,[rsp+0x68]
     13502d3:	48 8b 48 10          	mov    rcx,QWORD PTR [rax+0x10]
     13502d7:	49 89 4d 38          	mov    QWORD PTR [r13+0x38],rcx
     13502db:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     13502de:	41 0f 11 45 28       	movups XMMWORD PTR [r13+0x28],xmm0
     13502e3:	0f 57 c0             	xorps  xmm0,xmm0
     13502e6:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     13502eb:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     13502ee:	48 8b 48 18          	mov    rcx,QWORD PTR [rax+0x18]
     13502f2:	49 89 4d 40          	mov    QWORD PTR [r13+0x40],rcx
     13502f6:	0f 10 48 20          	movups xmm1,XMMWORD PTR [rax+0x20]
     13502fa:	41 0f 11 4d 48       	movups XMMWORD PTR [r13+0x48],xmm1
     13502ff:	48 8b 48 30          	mov    rcx,QWORD PTR [rax+0x30]
     1350303:	49 89 4d 58          	mov    QWORD PTR [r13+0x58],rcx
     1350307:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0

### 0x135063a: lea    rdi,[rsp+0x50]
     135061b:	48 c1 e0 03          	shl    rax,0x3
     135061f:	49 03 06             	add    rax,QWORD PTR [r14]
     1350622:	48 89 08             	mov    QWORD PTR [rax],rcx
     1350625:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
     135062c:	00 
     135062d:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     1350631:	48 ff 43 30          	inc    QWORD PTR [rbx+0x30]
     1350635:	e8 18 02 00 00       	call   1350852 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195dd6>
     135063a:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     135063f:	e8 24 f1 ff ff       	call   134f768 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194cec>
     1350644:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1350649:	e8 b6 ad da ff       	call   10fb404 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c281a>
     135064e:	48 ff 43 50          	inc    QWORD PTR [rbx+0x50]
     1350652:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1350659:	00 00 
     135065b:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]
     1350662:	00 
     1350663:	0f 85 8c 00 00 00    	jne    13506f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195c79>
     1350669:	48 81 c4 d8 00 00 00 	add    rsp,0xd8
     1350670:	5b                   	pop    rbx
     1350671:	41 5c                	pop    r12
     1350673:	41 5d                	pop    r13
     1350675:	41 5e                	pop    r14
     1350677:	41 5f                	pop    r15
     1350679:	5d                   	pop    rbp

### 0x135064e: inc    QWORD PTR [rbx+0x50]
     135062c:	00 
     135062d:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     1350631:	48 ff 43 30          	inc    QWORD PTR [rbx+0x30]
     1350635:	e8 18 02 00 00       	call   1350852 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195dd6>
     135063a:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     135063f:	e8 24 f1 ff ff       	call   134f768 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194cec>
     1350644:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1350649:	e8 b6 ad da ff       	call   10fb404 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c281a>
     135064e:	48 ff 43 50          	inc    QWORD PTR [rbx+0x50]
     1350652:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1350659:	00 00 
     135065b:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]
     1350662:	00 
     1350663:	0f 85 8c 00 00 00    	jne    13506f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195c79>
     1350669:	48 81 c4 d8 00 00 00 	add    rsp,0xd8
     1350670:	5b                   	pop    rbx
     1350671:	41 5c                	pop    r12
     1350673:	41 5d                	pop    r13
     1350675:	41 5e                	pop    r14
     1350677:	41 5f                	pop    r15
     1350679:	5d                   	pop    rbp
     135067a:	c3                   	ret
     135067b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1350682:	00 00 
     1350684:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]

### 0x13506aa: lea    rdi,[rsp+0x50]
     135068e:	e8 4c b0 72 ff       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>
     1350693:	eb 00                	jmp    1350695 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195c19>
     1350695:	48 89 c3             	mov    rbx,rax
     1350698:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
     135069f:	00 
     13506a0:	e8 ad 01 00 00       	call   1350852 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195dd6>
     13506a5:	eb 03                	jmp    13506aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195c2e>
     13506a7:	48 89 c3             	mov    rbx,rax
     13506aa:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     13506af:	e8 b4 f0 ff ff       	call   134f768 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194cec>
     13506b4:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     13506b9:	e8 46 ad da ff       	call   10fb404 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c281a>
     13506be:	eb 1a                	jmp    13506da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195c5e>
     13506c0:	48 89 c3             	mov    rbx,rax
     13506c3:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
     13506ca:	00 
     13506cb:	e8 88 56 ef ff       	call   1245d58 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8b2dc>
     13506d0:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     13506d5:	e8 b6 d7 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     13506da:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13506e1:	00 00 
     13506e3:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]
     13506ea:	00 
     13506eb:	75 08                	jne    13506f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195c79>
     13506ed:	48 89 df             	mov    rdi,rbx

### 0x1350721: dec    QWORD PTR [rdi+0x50]
     13506ff:	48 83 ec 20          	sub    rsp,0x20
     1350703:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135070a:	00 00 
     135070c:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     1350711:	48 83 3e 00          	cmp    QWORD PTR [rsi],0x0
     1350715:	0f 84 17 01 00 00    	je     1350832 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195db6>
     135071b:	49 89 f6             	mov    r14,rsi
     135071e:	48 89 fb             	mov    rbx,rdi
     1350721:	48 ff 4f 50          	dec    QWORD PTR [rdi+0x50]
     1350725:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1350728:	48 8b 70 60          	mov    rsi,QWORD PTR [rax+0x60]
     135072c:	e8 95 25 b7 ff       	call   ec2cc6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a0dc>
     1350731:	4d 8b 06             	mov    r8,QWORD PTR [r14]
     1350734:	49 8b 38             	mov    rdi,QWORD PTR [r8]
     1350737:	49 8b 48 08          	mov    rcx,QWORD PTR [r8+0x8]
     135073b:	4c 8b 4b 20          	mov    r9,QWORD PTR [rbx+0x20]
     135073f:	f3 4d 0f b8 f1       	popcnt r14,r9
     1350744:	49 83 fe 01          	cmp    r14,0x1
     1350748:	77 09                	ja     1350753 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195cd7>
     135074a:	49 8d 41 ff          	lea    rax,[r9-0x1]
     135074e:	48 21 c1             	and    rcx,rax
     1350751:	eb 10                	jmp    1350763 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195ce7>
     1350753:	4c 39 c9             	cmp    rcx,r9
     1350756:	72 0b                	jb     1350763 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195ce7>
     1350758:	48 89 c8             	mov    rax,rcx

### 0x1351481: call   QWORD PTR [rax+0x50]
     1351464:	49 89 f6             	mov    r14,rsi
     1351467:	48 89 fb             	mov    rbx,rdi
     135146a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1351471:	00 00 
     1351473:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
     135147a:	00 
     135147b:	48 8b 02             	mov    rax,QWORD PTR [rdx]
     135147e:	48 89 d7             	mov    rdi,rdx
     1351481:	ff 50 50             	call   QWORD PTR [rax+0x50]
     1351484:	84 c0                	test   al,al
     1351486:	0f 84 97 00 00 00    	je     1351523 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x196aa7>
     135148c:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135148f:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     1351494:	4c 89 fe             	mov    rsi,r15
     1351497:	ff 50 10             	call   QWORD PTR [rax+0x10]
     135149a:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135149d:	4c 89 ff             	mov    rdi,r15
     13514a0:	ff 50 40             	call   QWORD PTR [rax+0x40]
     13514a3:	83 7c 24 60 3e       	cmp    DWORD PTR [rsp+0x60],0x3e
     13514a8:	0f 85 a1 00 00 00    	jne    135154f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x196ad3>
     13514ae:	49 89 c7             	mov    r15,rax
     13514b1:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     13514b6:	48 8d 54 24 28       	lea    rdx,[rsp+0x28]
     13514bb:	6a 05                	push   0x5
     13514bd:	59                   	pop    rcx

### 0x135184c: call   QWORD PTR [rax+0x50]
     135182f:	49 89 f4             	mov    r12,rsi
     1351832:	48 89 fb             	mov    rbx,rdi
     1351835:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135183c:	00 00 
     135183e:	48 89 84 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rax
     1351845:	00 
     1351846:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1351849:	48 89 f7             	mov    rdi,rsi
     135184c:	ff 50 50             	call   QWORD PTR [rax+0x50]
     135184f:	89 c5                	mov    ebp,eax
     1351851:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     1351855:	4c 89 e7             	mov    rdi,r12
     1351858:	ff 50 40             	call   QWORD PTR [rax+0x40]
     135185b:	40 84 ed             	test   bpl,bpl
     135185e:	0f 84 e5 01 00 00    	je     1351a49 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x196fcd>
     1351864:	49 89 c4             	mov    r12,rax
     1351867:	c6 44 24 0f 00       	mov    BYTE PTR [rsp+0xf],0x0
     135186c:	4d 8d 6f 08          	lea    r13,[r15+0x8]
     1351870:	48 89 df             	mov    rdi,rbx
     1351873:	4c 89 ee             	mov    rsi,r13
     1351876:	e8 eb 85 37 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
     135187b:	4d 85 f6             	test   r14,r14
     135187e:	0f 84 9c 01 00 00    	je     1351a20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x196fa4>
     1351884:	41 80 bf c0 00 00 00 	cmp    BYTE PTR [r15+0xc0],0x0
     135188b:	00 

### 0x1351e16: mov    QWORD PTR [rsi+0x50],rdx
     1351df5:	48 8d 0d 24 53 51 00 	lea    rcx,[rip+0x515324]        # 1867120 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23808>
     1351dfc:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     1351dff:	0f 57 c0             	xorps  xmm0,xmm0
     1351e02:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
     1351e06:	48 89 56 20          	mov    QWORD PTR [rsi+0x20],rdx
     1351e0a:	0f 11 46 28          	movups XMMWORD PTR [rsi+0x28],xmm0
     1351e0e:	48 89 56 38          	mov    QWORD PTR [rsi+0x38],rdx
     1351e12:	0f 11 46 40          	movups XMMWORD PTR [rsi+0x40],xmm0
     1351e16:	48 89 56 50          	mov    QWORD PTR [rsi+0x50],rdx
     1351e1a:	83 66 58 00          	and    DWORD PTR [rsi+0x58],0x0
     1351e1e:	c3                   	ret
     1351e1f:	cc                   	int3
     1351e20:	48 89 f0             	mov    rax,rsi
     1351e23:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     1351e27:	48 8d 0d 72 52 51 00 	lea    rcx,[rip+0x515272]        # 18670a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23788>
     1351e2e:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     1351e31:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     1351e36:	48 8d 0d bb d9 0e ff 	lea    rcx,[rip+0xffffffffff0ed9bb]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     1351e3d:	48 89 4e 18          	mov    QWORD PTR [rsi+0x18],rcx
     1351e41:	c3                   	ret
     1351e42:	0f 18 0d 8f 9a 5c 00 	prefetcht0 BYTE PTR [rip+0x5c9a8f]        # 191b8d8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x62ce8>
     1351e49:	48 8d 05 88 9a 5c 00 	lea    rax,[rip+0x5c9a88]        # 191b8d8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x62ce8>
     1351e50:	48 8b 0d 89 9a 5c 00 	mov    rcx,QWORD PTR [rip+0x5c9a89]        # 191b8e0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x62cf0>
     1351e57:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
     1351e5a:	c3                   	ret

### 0x1351f23: mov    r14,QWORD PTR [rbx+0x50]
     1351eff:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
     1351f03:	e8 a0 39 41 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     1351f08:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
     1351f0c:	e8 97 39 41 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     1351f11:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
     1351f15:	e8 8e 39 41 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     1351f1a:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
     1351f1e:	e8 85 39 41 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     1351f23:	4c 8b 73 50          	mov    r14,QWORD PTR [rbx+0x50]
     1351f27:	4d 85 f6             	test   r14,r14
     1351f2a:	74 08                	je     1351f34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1974b8>
     1351f2c:	4c 89 f7             	mov    rdi,r14
     1351f2f:	e8 40 fe ff ff       	call   1351d74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1972f8>
     1351f34:	4c 89 f7             	mov    rdi,r14
     1351f37:	e8 e4 bf 49 00       	call   17edf20 <_ZdlPv@plt>
     1351f3c:	48 8b 5b 58          	mov    rbx,QWORD PTR [rbx+0x58]
     1351f40:	48 85 db             	test   rbx,rbx
     1351f43:	74 09                	je     1351f4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1974d2>
     1351f45:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
     1351f49:	e8 ba 8a 75 ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
     1351f4e:	48 89 df             	mov    rdi,rbx
     1351f51:	48 83 c4 08          	add    rsp,0x8
     1351f55:	5b                   	pop    rbx
     1351f56:	41 5e                	pop    r14
     1351f58:	e9 c3 bf 49 00       	jmp    17edf20 <_ZdlPv@plt>

### 0x1351fd7: movups XMMWORD PTR [rdi+0x50],xmm0
     1351fb8:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
     1351fbc:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax
     1351fc0:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
     1351fc4:	48 89 47 30          	mov    QWORD PTR [rdi+0x30],rax
     1351fc8:	48 89 47 38          	mov    QWORD PTR [rdi+0x38],rax
     1351fcc:	48 89 47 40          	mov    QWORD PTR [rdi+0x40],rax
     1351fd0:	48 89 47 48          	mov    QWORD PTR [rdi+0x48],rax
     1351fd4:	0f 57 c0             	xorps  xmm0,xmm0
     1351fd7:	0f 11 47 50          	movups XMMWORD PTR [rdi+0x50],xmm0
     1351fdb:	48 83 67 60 00       	and    QWORD PTR [rdi+0x60],0x0
     1351fe0:	c3                   	ret
     1351fe1:	cc                   	int3
     1351fe2:	53                   	push   rbx
     1351fe3:	48 89 fb             	mov    rbx,rdi
     1351fe6:	48 83 c7 08          	add    rdi,0x8
     1351fea:	e8 19 8a 75 ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
     1351fef:	48 83 7b 10 00       	cmp    QWORD PTR [rbx+0x10],0x0
     1351ff4:	74 0c                	je     1352002 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197586>
     1351ff6:	48 83 c3 10          	add    rbx,0x10
     1351ffa:	48 89 df             	mov    rdi,rbx
     1351ffd:	e8 82 04 43 00       	call   1782484 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1365f0>
     1352002:	5b                   	pop    rbx
     1352003:	c3                   	ret
     1352004:	48 89 c7             	mov    rdi,rax
     1352007:	e8 99 7a 72 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

### 0x1352242: lea    rdi,[rbx+0x50]
     135221d:	49 8d 76 78          	lea    rsi,[r14+0x78]
     1352221:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
     1352225:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     1352229:	f6 c2 01             	test   dl,0x1
     135222c:	0f 85 86 00 00 00    	jne    13522b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19783c>
     1352232:	e8 5b 35 41 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1352237:	80 4b 10 80          	or     BYTE PTR [rbx+0x10],0x80
     135223b:	49 8d b6 90 00 00 00 	lea    rsi,[r14+0x90]
     1352242:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
     1352246:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     135224a:	f6 c2 01             	test   dl,0x1
     135224d:	75 75                	jne    13522c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197848>
     135224f:	e8 3e 35 41 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1352254:	80 4b 11 01          	or     BYTE PTR [rbx+0x11],0x1
     1352258:	49 81 c6 a8 00 00 00 	add    r14,0xa8
     135225f:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
     1352263:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     1352267:	f6 c2 01             	test   dl,0x1
     135226a:	75 61                	jne    13522cd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197851>
     135226c:	4c 89 f6             	mov    rsi,r14
     135226f:	e8 1e 35 41 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1352274:	48 83 c4 08          	add    rsp,0x8
     1352278:	5b                   	pop    rbx
     1352279:	41 5e                	pop    r14
     135227b:	c3                   	ret

### 0x1352364: mov    rsi,QWORD PTR [r14+0x50]
     1352342:	49 8b 76 40          	mov    rsi,QWORD PTR [r14+0x40]
     1352346:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     135234a:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
     135234e:	e8 2d bd 49 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     1352353:	49 8b 76 48          	mov    rsi,QWORD PTR [r14+0x48]
     1352357:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     135235b:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
     135235f:	e8 1c bd 49 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     1352364:	49 8b 76 50          	mov    rsi,QWORD PTR [r14+0x50]
     1352368:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     135236c:	48 8d bb 90 00 00 00 	lea    rdi,[rbx+0x90]
     1352373:	e8 08 bd 49 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     1352378:	49 8b 76 58          	mov    rsi,QWORD PTR [r14+0x58]
     135237c:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     1352380:	48 8d bb a8 00 00 00 	lea    rdi,[rbx+0xa8]
     1352387:	e8 f4 bc 49 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     135238c:	48 83 c4 08          	add    rsp,0x8
     1352390:	5b                   	pop    rbx
     1352391:	41 5e                	pop    r14
     1352393:	c3                   	ret
     1352394:	49 89 c6             	mov    r14,rax
     1352397:	48 89 df             	mov    rdi,rbx
     135239a:	e8 f9 77 d3 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     135239f:	4c 89 f7             	mov    rdi,r14
     13523a2:	e8 29 d9 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>

### 0x13523f4: mov    rdi,QWORD PTR [rbx+0x50]
     13523d0:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
     13523d4:	e8 cf 34 41 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     13523d9:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
     13523dd:	e8 c6 34 41 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     13523e2:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
     13523e6:	e8 bd 34 41 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     13523eb:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
     13523ef:	e8 b4 34 41 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     13523f4:	48 8b 7b 50          	mov    rdi,QWORD PTR [rbx+0x50]
     13523f8:	e8 ab 34 41 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     13523fd:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
     1352401:	5b                   	pop    rbx
     1352402:	e9 a1 34 41 00       	jmp    17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     1352407:	cc                   	int3
     1352408:	53                   	push   rbx
     1352409:	48 89 fb             	mov    rbx,rdi
     135240c:	e8 97 ff ff ff       	call   13523a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19792c>
     1352411:	48 89 df             	mov    rdi,rbx
     1352414:	5b                   	pop    rbx
     1352415:	e9 06 bb 49 00       	jmp    17edf20 <_ZdlPv@plt>
     135241a:	0f 18 0d ef 9b 5c 00 	prefetcht0 BYTE PTR [rip+0x5c9bef]        # 191c010 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x63420>
     1352421:	48 8d 05 e8 9b 5c 00 	lea    rax,[rip+0x5c9be8]        # 191c010 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x63420>
     1352428:	48 8b 0d e9 9b 5c 00 	mov    rcx,QWORD PTR [rip+0x5c9be9]        # 191c018 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x63428>
     135242f:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
     1352432:	c3                   	ret

### 0x135247e: mov    QWORD PTR [rdi+0x50],rax
     135245b:	48 8d 05 96 d3 0e ff 	lea    rax,[rip+0xffffffffff0ed396]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     1352462:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
     1352466:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax
     135246a:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
     135246e:	48 89 47 30          	mov    QWORD PTR [rdi+0x30],rax
     1352472:	48 89 47 38          	mov    QWORD PTR [rdi+0x38],rax
     1352476:	48 89 47 40          	mov    QWORD PTR [rdi+0x40],rax
     135247a:	48 89 47 48          	mov    QWORD PTR [rdi+0x48],rax
     135247e:	48 89 47 50          	mov    QWORD PTR [rdi+0x50],rax
     1352482:	48 89 47 58          	mov    QWORD PTR [rdi+0x58],rax
     1352486:	c3                   	ret
     1352487:	cc                   	int3
     1352488:	b0 b7                	mov    al,0xb7
     135248a:	c3                   	ret
     135248b:	cc                   	int3
     135248c:	48 8d 05 21 eb 02 ff 	lea    rax,[rip+0xffffffffff02eb21]        # 380fb4 <_ZTSSt12bad_any_cast@@Base-0xf214>
     1352493:	6a 14                	push   0x14
     1352495:	5a                   	pop    rdx
     1352496:	c3                   	ret
     1352497:	cc                   	int3
     1352498:	48 8d 05 21 a9 08 ff 	lea    rax,[rip+0xffffffffff08a921]        # 3dcdc0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x280f>
     135249f:	6a 04                	push   0x4
     13524a1:	5a                   	pop    rdx
     13524a2:	c3                   	ret
     13524a3:	cc                   	int3

### 0x1352534: mov    QWORD PTR [rsp+0x50],rcx
     135250f:	4c 89 f7             	mov    rdi,r14
     1352512:	e8 77 47 96 ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
     1352517:	8a 88 88 00 00 00    	mov    cl,BYTE PTR [rax+0x88]
     135251d:	88 4c 24 28          	mov    BYTE PTR [rsp+0x28],cl
     1352521:	8a 88 89 00 00 00    	mov    cl,BYTE PTR [rax+0x89]
     1352527:	88 4c 24 0f          	mov    BYTE PTR [rsp+0xf],cl
     135252b:	4c 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],r13
     1352530:	49 8b 4d 10          	mov    rcx,QWORD PTR [r13+0x10]
     1352534:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
     1352539:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
     135253d:	40 8a 68 11          	mov    bpl,BYTE PTR [rax+0x11]
     1352541:	4c 89 e7             	mov    rdi,r12
     1352544:	ff 51 28             	call   QWORD PTR [rcx+0x28]
     1352547:	8a 80 b8 01 00 00    	mov    al,BYTE PTR [rax+0x1b8]
     135254d:	88 44 24 0e          	mov    BYTE PTR [rsp+0xe],al
     1352551:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
     1352558:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     135255d:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1352560:	4c 89 ff             	mov    rdi,r15
     1352563:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1352566:	49 89 c7             	mov    r15,rax
     1352569:	4c 8b 6b 30          	mov    r13,QWORD PTR [rbx+0x30]
     135256d:	6a 60                	push   0x60
     135256f:	5f                   	pop    rdi
     1352570:	e8 8b b9 49 00       	call   17edf00 <_Znwm@plt>

### 0x135259e: movdqu XMMWORD PTR [rbx+0x50],xmm0
     1352578:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     135257c:	48 8d 05 bd 4d 51 00 	lea    rax,[rip+0x514dbd]        # 1867340 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23a28>
     1352583:	48 89 03             	mov    QWORD PTR [rbx],rax
     1352586:	66 0f ef c0          	pxor   xmm0,xmm0
     135258a:	f3 0f 7f 43 10       	movdqu XMMWORD PTR [rbx+0x10],xmm0
     135258f:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
     1352594:	f3 0f 7f 43 30       	movdqu XMMWORD PTR [rbx+0x30],xmm0
     1352599:	f3 0f 7f 43 40       	movdqu XMMWORD PTR [rbx+0x40],xmm0
     135259e:	f3 0f 7f 43 50       	movdqu XMMWORD PTR [rbx+0x50],xmm0
     13525a3:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     13525a7:	48 8d 35 19 a8 08 ff 	lea    rsi,[rip+0xffffffffff08a819]        # 3dcdc7 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2816>
     13525ae:	48 8d 0d 1b a8 08 ff 	lea    rcx,[rip+0xffffffffff08a81b]        # 3dcdd0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x281f>
     13525b5:	6a 08                	push   0x8
     13525b7:	41 5e                	pop    r14
     13525b9:	6a 24                	push   0x24
     13525bb:	41 58                	pop    r8
     13525bd:	4c 89 f2             	mov    rdx,r14
     13525c0:	41 b9 dc 05 00 00    	mov    r9d,0x5dc
     13525c6:	68 10 27 00 00       	push   0x2710
     13525cb:	6a 64                	push   0x64
     13525cd:	e8 20 50 29 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
     13525d2:	48 83 c4 10          	add    rsp,0x10
     13525d6:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     13525da:	48 8d 35 14 a8 08 ff 	lea    rsi,[rip+0xffffffffff08a814]        # 3dcdf5 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2844>
     13525e1:	48 8d 0d 18 a8 08 ff 	lea    rcx,[rip+0xffffffffff08a818]        # 3dce00 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x284f>

### 0x13526c9: call   QWORD PTR [rax+0x50]
     13526b1:	48 85 c0             	test   rax,rax
     13526b4:	74 05                	je     13526bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197c3f>
     13526b6:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     13526bb:	4c 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],r15
     13526c2:	00 
     13526c3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13526c6:	6a 01                	push   0x1
     13526c8:	5e                   	pop    rsi
     13526c9:	ff 50 50             	call   QWORD PTR [rax+0x50]
     13526cc:	4c 8d bc 24 30 01 00 	lea    r15,[rsp+0x130]
     13526d3:	00 
     13526d4:	49 83 27 00          	and    QWORD PTR [r15],0x0
     13526d8:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     13526dd:	4c 89 f6             	mov    rsi,r14
     13526e0:	e8 cd 29 dd ff       	call   11250b2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ec4c8>
     13526e5:	4c 89 ff             	mov    rdi,r15
     13526e8:	e8 55 29 dd ff       	call   1125042 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ec458>
     13526ed:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
     13526f4:	00 
     13526f5:	e8 8c bd 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13526fa:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     13526fe:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     1352702:	80 7c 24 0e 00       	cmp    BYTE PTR [rsp+0xe],0x0
     1352707:	0f 84 fd 01 00 00    	je     135290a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197e8e>
     135270d:	4c 89 e7             	mov    rdi,r12

### 0x13527da: movdqu XMMWORD PTR [rax+0x50],xmm0
     13527b9:	66 41 0f 6f 87 c0 01 	movdqa xmm0,XMMWORD PTR [r15+0x1c0]
     13527c0:	00 00 
     13527c2:	f3 0f 7f 40 30       	movdqu XMMWORD PTR [rax+0x30],xmm0
     13527c7:	48 85 c9             	test   rcx,rcx
     13527ca:	48 8b 6c 24 70       	mov    rbp,QWORD PTR [rsp+0x70]
     13527cf:	74 05                	je     13527d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197d5a>
     13527d1:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     13527d6:	66 0f ef c0          	pxor   xmm0,xmm0
     13527da:	f3 0f 7f 40 50       	movdqu XMMWORD PTR [rax+0x50],xmm0
     13527df:	f3 0f 7f 40 40       	movdqu XMMWORD PTR [rax+0x40],xmm0
     13527e4:	c7 40 60 00 00 80 3f 	mov    DWORD PTR [rax+0x60],0x3f800000
     13527eb:	31 c9                	xor    ecx,ecx
     13527ed:	88 48 68             	mov    BYTE PTR [rax+0x68],cl
     13527f0:	88 88 80 00 00 00    	mov    BYTE PTR [rax+0x80],cl
     13527f6:	88 88 88 00 00 00    	mov    BYTE PTR [rax+0x88],cl
     13527fc:	4c 8d bc 24 50 01 00 	lea    r15,[rsp+0x150]
     1352803:	00 
     1352804:	49 83 27 00          	and    QWORD PTR [r15],0x0
     1352808:	4c 8b 64 24 38       	mov    r12,QWORD PTR [rsp+0x38]
     135280d:	4c 89 e7             	mov    rdi,r12
     1352810:	48 89 c6             	mov    rsi,rax
     1352813:	e8 3c 0c 00 00       	call   1353454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1989d8>
     1352818:	4c 89 ff             	mov    rdi,r15
     135281b:	e8 aa 0c 00 00       	call   13534ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a4e>
     1352820:	4d 8b 3c 24          	mov    r15,QWORD PTR [r12]

### 0x1352acc: mov    rax,QWORD PTR [rsp+0x50]
     1352aad:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     1352ab1:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     1352ab8:	00 
     1352ab9:	48 89 ee             	mov    rsi,rbp
     1352abc:	ff 50 40             	call   QWORD PTR [rax+0x40]
     1352abf:	bf b8 00 00 00       	mov    edi,0xb8
     1352ac4:	e8 37 b4 49 00       	call   17edf00 <_Znwm@plt>
     1352ac9:	49 89 c6             	mov    r14,rax
     1352acc:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
     1352ad1:	49 89 06             	mov    QWORD PTR [r14],rax
     1352ad4:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1352ad9:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
     1352add:	48 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [rsp+0xc8]
     1352ae4:	00 
     1352ae5:	66 0f 6f 84 24 c0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xc0]
     1352aec:	00 00 
     1352aee:	f3 41 0f 7f 46 10    	movdqu XMMWORD PTR [r14+0x10],xmm0
     1352af4:	48 85 c0             	test   rax,rax
     1352af7:	74 05                	je     1352afe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198082>
     1352af9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     1352afe:	4d 8d 7e 20          	lea    r15,[r14+0x20]
     1352b02:	4c 89 ff             	mov    rdi,r15
     1352b05:	e8 ec 6e 48 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1352b0a:	4d 8d 66 30          	lea    r12,[r14+0x30]
     1352b0e:	4c 89 e7             	mov    rdi,r12

### 0x1352b3c: mov    QWORD PTR [rsp+0x50],rcx
     1352b16:	e8 a7 eb 46 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     1352b1b:	31 c0                	xor    eax,eax
     1352b1d:	41 88 46 68          	mov    BYTE PTR [r14+0x68],al
     1352b21:	49 8d 4e 70          	lea    rcx,[r14+0x70]
     1352b25:	48 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],rcx
     1352b2a:	41 88 46 70          	mov    BYTE PTR [r14+0x70],al
     1352b2e:	41 88 86 88 00 00 00 	mov    BYTE PTR [r14+0x88],al
     1352b35:	49 8d 8e 90 00 00 00 	lea    rcx,[r14+0x90]
     1352b3c:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
     1352b41:	41 88 86 90 00 00 00 	mov    BYTE PTR [r14+0x90],al
     1352b48:	41 88 86 b0 00 00 00 	mov    BYTE PTR [r14+0xb0],al
     1352b4f:	66 0f ef c0          	pxor   xmm0,xmm0
     1352b53:	f3 41 0f 7f 46 40    	movdqu XMMWORD PTR [r14+0x40],xmm0
     1352b59:	41 88 46 50          	mov    BYTE PTR [r14+0x50],al
     1352b5d:	49 8b 6e 10          	mov    rbp,QWORD PTR [r14+0x10]
     1352b61:	4c 8d 84 24 a0 00 00 	lea    r8,[rsp+0xa0]
     1352b68:	00 
     1352b69:	4d 89 30             	mov    QWORD PTR [r8],r14
     1352b6c:	48 8d 35 1e a5 74 ff 	lea    rsi,[rip+0xffffffffff74a51e]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     1352b73:	48 8d 0d be b2 0e 00 	lea    rcx,[rip+0xeb2be]        # 143de38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2833bc>
     1352b7a:	4c 8d ac 24 50 01 00 	lea    r13,[rsp+0x150]
     1352b81:	00 
     1352b82:	6a 08                	push   0x8
     1352b84:	41 59                	pop    r9
     1352b86:	4c 89 ef             	mov    rdi,r13

### 0x1352b59: mov    BYTE PTR [r14+0x50],al
     1352b2a:	41 88 46 70          	mov    BYTE PTR [r14+0x70],al
     1352b2e:	41 88 86 88 00 00 00 	mov    BYTE PTR [r14+0x88],al
     1352b35:	49 8d 8e 90 00 00 00 	lea    rcx,[r14+0x90]
     1352b3c:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
     1352b41:	41 88 86 90 00 00 00 	mov    BYTE PTR [r14+0x90],al
     1352b48:	41 88 86 b0 00 00 00 	mov    BYTE PTR [r14+0xb0],al
     1352b4f:	66 0f ef c0          	pxor   xmm0,xmm0
     1352b53:	f3 41 0f 7f 46 40    	movdqu XMMWORD PTR [r14+0x40],xmm0
     1352b59:	41 88 46 50          	mov    BYTE PTR [r14+0x50],al
     1352b5d:	49 8b 6e 10          	mov    rbp,QWORD PTR [r14+0x10]
     1352b61:	4c 8d 84 24 a0 00 00 	lea    r8,[rsp+0xa0]
     1352b68:	00 
     1352b69:	4d 89 30             	mov    QWORD PTR [r8],r14
     1352b6c:	48 8d 35 1e a5 74 ff 	lea    rsi,[rip+0xffffffffff74a51e]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     1352b73:	48 8d 0d be b2 0e 00 	lea    rcx,[rip+0xeb2be]        # 143de38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2833bc>
     1352b7a:	4c 8d ac 24 50 01 00 	lea    r13,[rsp+0x150]
     1352b81:	00 
     1352b82:	6a 08                	push   0x8
     1352b84:	41 59                	pop    r9
     1352b86:	4c 89 ef             	mov    rdi,r13
     1352b89:	31 d2                	xor    edx,edx
     1352b8b:	e8 04 7c 48 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     1352b90:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     1352b94:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     1352b9b:	00 

### 0x1353074: and    QWORD PTR [r14+0x50],0x0
     1353055:	48 85 c9             	test   rcx,rcx
     1353058:	74 05                	je     135305f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1985e3>
     135305a:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     135305f:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0
     1353064:	4c 89 f1             	mov    rcx,r14
     1353067:	48 83 c1 40          	add    rcx,0x40
     135306b:	41 0f 11 46 40       	movups XMMWORD PTR [r14+0x40],xmm0
     1353070:	49 89 4e 38          	mov    QWORD PTR [r14+0x38],rcx
     1353074:	49 83 66 50 00       	and    QWORD PTR [r14+0x50],0x0
     1353079:	4c 8d bc 24 50 01 00 	lea    r15,[rsp+0x150]
     1353080:	00 
     1353081:	49 89 07             	mov    QWORD PTR [r15],rax
     1353084:	48 8d 05 d9 93 72 ff 	lea    rax,[rip+0xffffffffff7293d9]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     135308b:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     135308f:	48 8d 05 96 6d 00 00 	lea    rax,[rip+0x6d96]        # 1359e2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f3b0>
     1353096:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     135309a:	48 83 c7 30          	add    rdi,0x30
     135309e:	4c 89 fe             	mov    rsi,r15
     13530a1:	e8 8e 6d 00 00       	call   1359e34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f3b8>
     13530a6:	4c 89 ff             	mov    rdi,r15
     13530a9:	e8 aa 4f 83 ff       	call   b88058 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4ff8>
     13530ae:	4c 8d a4 24 30 01 00 	lea    r12,[rsp+0x130]
     13530b5:	00 
     13530b6:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0
     13530bc:	0f 57 c9             	xorps  xmm1,xmm1

### 0x13532bf: mov    rdi,QWORD PTR [rsp+0x50]
     13532a4:	eb 76                	jmp    135331c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1988a0>
     13532a6:	eb 74                	jmp    135331c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1988a0>
     13532a8:	48 89 c5             	mov    rbp,rax
     13532ab:	4d 89 f5             	mov    r13,r14
     13532ae:	49 83 c5 50          	add    r13,0x50
     13532b2:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     13532b9:	00 
     13532ba:	e8 29 75 48 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     13532bf:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     13532c4:	e8 e9 05 00 00       	call   13538b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198e36>
     13532c9:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     13532ce:	e8 5d 3a 75 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     13532d3:	4c 89 ef             	mov    rdi,r13
     13532d6:	e8 55 3a 75 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     13532db:	49 8b 7e 48          	mov    rdi,QWORD PTR [r14+0x48]
     13532df:	e8 a2 b1 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13532e4:	4c 89 e7             	mov    rdi,r12
     13532e7:	e8 5a e4 46 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
     13532ec:	4c 89 ff             	mov    rdi,r15
     13532ef:	e8 e0 68 48 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     13532f4:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
     13532f8:	e8 89 b1 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13532fd:	4c 89 f7             	mov    rdi,r14
     1353300:	e8 1b ac 49 00       	call   17edf20 <_ZdlPv@plt>
     1353305:	eb 03                	jmp    135330a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19888e>

### 0x135346d: mov    r14,QWORD PTR [rbx+0x50]
     1353456:	41 56                	push   r14
     1353458:	53                   	push   rbx
     1353459:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     135345c:	48 89 37             	mov    QWORD PTR [rdi],rsi
     135345f:	48 85 db             	test   rbx,rbx
     1353462:	74 60                	je     13534c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a48>
     1353464:	48 8d 7b 68          	lea    rdi,[rbx+0x68]
     1353468:	e8 c3 38 75 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     135346d:	4c 8b 73 50          	mov    r14,QWORD PTR [rbx+0x50]
     1353471:	4d 85 f6             	test   r14,r14
     1353474:	74 1c                	je     1353492 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a16>
     1353476:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
     1353479:	49 8d 7e 10          	lea    rdi,[r14+0x10]
     135347d:	e8 6a 06 00 00       	call   1353aec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199070>
     1353482:	4c 89 f7             	mov    rdi,r14
     1353485:	e8 96 aa 49 00       	call   17edf20 <_ZdlPv@plt>
     135348a:	4d 89 fe             	mov    r14,r15
     135348d:	4d 85 ff             	test   r15,r15
     1353490:	75 e4                	jne    1353476 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1989fa>
     1353492:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
     1353496:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
     135349b:	48 85 ff             	test   rdi,rdi
     135349e:	74 05                	je     13534a5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a29>
     13534a0:	e8 7b aa 49 00       	call   17edf20 <_ZdlPv@plt>
     13534a5:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]

### 0x135353b: lea    rdi,[rbx+0x50]
     135351b:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     135351e:	48 89 37             	mov    QWORD PTR [rdi],rsi
     1353521:	48 85 db             	test   rbx,rbx
     1353524:	74 4b                	je     1353571 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198af5>
     1353526:	48 8d bb 90 00 00 00 	lea    rdi,[rbx+0x90]
     135352d:	e8 80 03 00 00       	call   13538b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198e36>
     1353532:	48 8d 7b 70          	lea    rdi,[rbx+0x70]
     1353536:	e8 f5 37 75 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     135353b:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
     135353f:	e8 ec 37 75 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1353544:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
     1353548:	e8 39 af 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135354d:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     1353551:	e8 f0 e1 46 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
     1353556:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
     135355a:	e8 75 66 48 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     135355f:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
     1353563:	e8 1e af 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1353568:	48 89 df             	mov    rdi,rbx
     135356b:	5b                   	pop    rbx
     135356c:	e9 af a9 49 00       	jmp    17edf20 <_ZdlPv@plt>
     1353571:	5b                   	pop    rbx
     1353572:	c3                   	ret
     1353573:	cc                   	int3
     1353574:	31 f6                	xor    esi,esi

### 0x1353793: mov    rax,QWORD PTR [rax+0x50]
     1353776:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135377d:	00 00 
     135377f:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     1353784:	75 05                	jne    135378b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198d0f>
     1353786:	48 83 c4 18          	add    rsp,0x18
     135378a:	c3                   	ret
     135378b:	e8 20 c3 49 00       	call   17efab0 <__stack_chk_fail@plt>
     1353790:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1353793:	48 8b 40 50          	mov    rax,QWORD PTR [rax+0x50]
     1353797:	80 b8 d8 08 00 00 00 	cmp    BYTE PTR [rax+0x8d8],0x0
     135379e:	74 0a                	je     13537aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198d2e>
     13537a0:	48 8b 80 20 07 00 00 	mov    rax,QWORD PTR [rax+0x720]
     13537a7:	b2 01                	mov    dl,0x1
     13537a9:	c3                   	ret
     13537aa:	31 d2                	xor    edx,edx
     13537ac:	31 c0                	xor    eax,eax
     13537ae:	c3                   	ret
     13537af:	cc                   	int3
     13537b0:	53                   	push   rbx
     13537b1:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     13537b5:	48 85 c0             	test   rax,rax
     13537b8:	74 11                	je     13537cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198d4f>
     13537ba:	48 89 fb             	mov    rbx,rdi
     13537bd:	31 ff                	xor    edi,edi
     13537bf:	48 89 de             	mov    rsi,rbx

### 0x1353b0f: lea    rdi,[rbx+0x50]
     1353af4:	e8 09 00 00 00       	call   1353b02 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199086>
     1353af9:	48 89 df             	mov    rdi,rbx
     1353afc:	5b                   	pop    rbx
     1353afd:	e9 8e a3 49 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1353b02:	53                   	push   rbx
     1353b03:	48 89 fb             	mov    rbx,rdi
     1353b06:	48 83 c7 58          	add    rdi,0x58
     1353b0a:	e8 81 a3 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1353b0f:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
     1353b13:	e8 0a 4f 80 ff       	call   b58a22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa59c2>
     1353b18:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
     1353b1c:	e8 65 a9 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1353b21:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     1353b25:	e8 0a 00 00 00       	call   1353b34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1990b8>
     1353b2a:	48 89 df             	mov    rdi,rbx
     1353b2d:	5b                   	pop    rbx
     1353b2e:	e9 5d a3 49 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1353b33:	cc                   	int3
     1353b34:	80 7f 20 00          	cmp    BYTE PTR [rdi+0x20],0x0
     1353b38:	0f 85 02 00 00 00    	jne    1353b40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1990c4>
     1353b3e:	c3                   	ret
     1353b3f:	cc                   	int3
     1353b40:	53                   	push   rbx
     1353b41:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     1353b45:	48 85 c0             	test   rax,rax

### 0x1353bb4: lea    rdi,[rbx+0x50]
     1353b94:	49 89 e6             	mov    r14,rsp
     1353b97:	41 0f 29 46 10       	movaps XMMWORD PTR [r14+0x10],xmm0
     1353b9c:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
     1353ba0:	48 83 c7 68          	add    rdi,0x68
     1353ba4:	4c 89 f6             	mov    rsi,r14
     1353ba7:	e8 b0 87 10 00       	call   145c35c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a18e0>
     1353bac:	4c 89 f7             	mov    rdi,r14
     1353baf:	e8 fc fb ff ff       	call   13537b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198d34>
     1353bb4:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
     1353bb8:	e8 6b 62 72 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1353bbd:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
     1353bc1:	e8 7c 14 dd ff       	call   1125042 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ec458>
     1353bc6:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
     1353bca:	e8 59 62 72 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1353bcf:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
     1353bd3:	e8 c4 f9 ff ff       	call   135359c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b20>
     1353bd8:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     1353bdc:	e8 93 f9 ff ff       	call   1353574 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198af8>
     1353be1:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
     1353be5:	e8 3e 62 72 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1353bea:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
     1353bee:	e8 d7 f8 ff ff       	call   13534ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a4e>
     1353bf3:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     1353bf7:	e8 f6 f8 ff ff       	call   13534f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a76>
     1353bfc:	48 83 c3 10          	add    rbx,0x10

### 0x1354247: lea    rdi,[r14+0x50]
     1354227:	41 0f 94 c5          	sete   r13b
     135422b:	40 88 6c 24 20       	mov    BYTE PTR [rsp+0x20],bpl
     1354230:	40 88 6c 24 38       	mov    BYTE PTR [rsp+0x38],bpl
     1354235:	75 77                	jne    13542ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199832>
     1354237:	49 89 f7             	mov    r15,rsi
     135423a:	44 88 6c 24 07       	mov    BYTE PTR [rsp+0x7],r13b
     135423f:	48 89 f7             	mov    rdi,rsi
     1354242:	e8 8e 01 00 00       	call   13543d5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199959>
     1354247:	49 8d 7e 50          	lea    rdi,[r14+0x50]
     135424b:	e8 e6 75 72 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1354250:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
     1354255:	4c 89 e7             	mov    rdi,r12
     1354258:	48 89 c6             	mov    rsi,rax
     135425b:	e8 c8 11 37 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
     1354260:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
     1354267:	00 
     1354268:	4c 8d 6c 24 47       	lea    r13,[rsp+0x47]
     135426d:	4c 89 ef             	mov    rdi,r13
     1354270:	e8 ab 00 84 ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
     1354275:	48 8d 6c 24 08       	lea    rbp,[rsp+0x8]
     135427a:	48 89 ef             	mov    rdi,rbp
     135427d:	4c 89 ee             	mov    rsi,r13
     1354280:	e8 63 01 00 00       	call   13543e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19996c>
     1354285:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     135428a:	48 89 ee             	mov    rsi,rbp

### 0x13542ae: lea    rsi,[r14+0x50]
     135428a:	48 89 ee             	mov    rsi,rbp
     135428d:	e8 64 b0 77 ff       	call   acf2f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c296>
     1354292:	48 89 ef             	mov    rdi,rbp
     1354295:	e8 f6 9b 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     135429a:	41 8a af 80 00 00 00 	mov    bpl,BYTE PTR [r15+0x80]
     13542a1:	4c 89 e7             	mov    rdi,r12
     13542a4:	e8 85 10 37 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     13542a9:	44 8a 6c 24 07       	mov    r13b,BYTE PTR [rsp+0x7]
     13542ae:	49 8d 76 50          	lea    rsi,[r14+0x50]
     13542b2:	48 89 df             	mov    rdi,rbx
     13542b5:	e8 86 9c 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     13542ba:	4c 8d 7b 18          	lea    r15,[rbx+0x18]
     13542be:	48 8d 35 4d 5d 00 ff 	lea    rsi,[rip+0xffffffffff005d4d]        # 35a012 <_ZTSSt12bad_any_cast@@Base-0x361b6>
     13542c5:	4c 89 ff             	mov    rdi,r15
     13542c8:	e8 b1 57 72 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     13542cd:	4c 8d 63 30          	lea    r12,[rbx+0x30]
     13542d1:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     13542d6:	4c 89 e7             	mov    rdi,r12
     13542d9:	e8 88 84 77 ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
     13542de:	44 88 6b 50          	mov    BYTE PTR [rbx+0x50],r13b
     13542e2:	40 88 6b 51          	mov    BYTE PTR [rbx+0x51],bpl
     13542e6:	49 8b 86 f8 00 00 00 	mov    rax,QWORD PTR [r14+0xf8]
     13542ed:	41 0f 10 86 f0 00 00 	movups xmm0,XMMWORD PTR [r14+0xf0]
     13542f4:	00 
     13542f5:	0f 11 43 58          	movups XMMWORD PTR [rbx+0x58],xmm0

### 0x13542de: mov    BYTE PTR [rbx+0x50],r13b
     13542ba:	4c 8d 7b 18          	lea    r15,[rbx+0x18]
     13542be:	48 8d 35 4d 5d 00 ff 	lea    rsi,[rip+0xffffffffff005d4d]        # 35a012 <_ZTSSt12bad_any_cast@@Base-0x361b6>
     13542c5:	4c 89 ff             	mov    rdi,r15
     13542c8:	e8 b1 57 72 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     13542cd:	4c 8d 63 30          	lea    r12,[rbx+0x30]
     13542d1:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     13542d6:	4c 89 e7             	mov    rdi,r12
     13542d9:	e8 88 84 77 ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
     13542de:	44 88 6b 50          	mov    BYTE PTR [rbx+0x50],r13b
     13542e2:	40 88 6b 51          	mov    BYTE PTR [rbx+0x51],bpl
     13542e6:	49 8b 86 f8 00 00 00 	mov    rax,QWORD PTR [r14+0xf8]
     13542ed:	41 0f 10 86 f0 00 00 	movups xmm0,XMMWORD PTR [r14+0xf0]
     13542f4:	00 
     13542f5:	0f 11 43 58          	movups XMMWORD PTR [rbx+0x58],xmm0
     13542f9:	48 85 c0             	test   rax,rax
     13542fc:	74 05                	je     1354303 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199887>
     13542fe:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     1354303:	48 8d 7b 68          	lea    rdi,[rbx+0x68]
     1354307:	49 81 c6 90 00 00 00 	add    r14,0x90
     135430e:	4c 89 f6             	mov    rsi,r14
     1354311:	e8 2a 9c 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1354316:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     135431b:	e8 10 2a 75 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1354320:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1354327:	00 00 

### 0x13548ea: call   QWORD PTR [rax+0x50]
     13548c7:	48 8d 35 22 48 0e ff 	lea    rsi,[rip+0xffffffffff0e4822]        # 4390f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb3f>
     13548ce:	4c 89 e7             	mov    rdi,r12
     13548d1:	e8 64 da 7a ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
     13548d6:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     13548da:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13548dd:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     13548e2:	48 8d 94 24 88 00 00 	lea    rdx,[rsp+0x88]
     13548e9:	00 
     13548ea:	ff 50 50             	call   QWORD PTR [rax+0x50]
     13548ed:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     13548f2:	e8 e9 05 00 00       	call   1354ee0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a464>
     13548f7:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     13548fe:	00 
     13548ff:	e8 b6 05 00 00       	call   1354eba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a43e>
     1354904:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135490b:	00 00 
     135490d:	48 3b 84 24 58 01 00 	cmp    rax,QWORD PTR [rsp+0x158]
     1354914:	00 
     1354915:	75 76                	jne    135498d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199f11>
     1354917:	48 81 c4 60 01 00 00 	add    rsp,0x160
     135491e:	5b                   	pop    rbx
     135491f:	41 5c                	pop    r12
     1354921:	41 5d                	pop    r13
     1354923:	41 5e                	pop    r14
     1354925:	41 5f                	pop    r15

### 0x1354fbd: mov    BYTE PTR [rbx+0x50],al
     1354f9c:	c6 44 24 20 00       	mov    BYTE PTR [rsp+0x20],0x0
     1354fa1:	31 c0                	xor    eax,eax
     1354fa3:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     1354fa8:	88 46 18             	mov    BYTE PTR [rsi+0x18],al
     1354fab:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
     1354faf:	48 8d 15 c6 cf 0f ff 	lea    rdx,[rip+0xffffffffff0fcfc6]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     1354fb6:	e8 33 34 7f ff       	call   b483ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9538e>
     1354fbb:	31 c0                	xor    eax,eax
     1354fbd:	88 43 50             	mov    BYTE PTR [rbx+0x50],al
     1354fc0:	88 43 68             	mov    BYTE PTR [rbx+0x68],al
     1354fc3:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1354fc8:	e8 63 1d 75 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1354fcd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1354fd4:	00 00 
     1354fd6:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
     1354fdb:	75 49                	jne    1355026 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a5aa>
     1354fdd:	48 83 c4 50          	add    rsp,0x50
     1354fe1:	5b                   	pop    rbx
     1354fe2:	41 5e                	pop    r14
     1354fe4:	41 5f                	pop    r15
     1354fe6:	c3                   	ret
     1354fe7:	49 89 c7             	mov    r15,rax
     1354fea:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1354fef:	e8 3c 1d 75 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1354ff4:	eb 03                	jmp    1354ff9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a57d>

### 0x1355a89: mov    rax,QWORD PTR [rax+0x50]
     1355a66:	48 39 c3             	cmp    rbx,rax
     1355a69:	74 4f                	je     1355aba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b03e>
     1355a6b:	49 8d 85 18 07 00 00 	lea    rax,[r13+0x718]
     1355a72:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     1355a77:	49 8d 85 90 06 00 00 	lea    rax,[r13+0x690]
     1355a7e:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     1355a83:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     1355a86:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1355a89:	48 8b 40 50          	mov    rax,QWORD PTR [rax+0x50]
     1355a8d:	48 89 ee             	mov    rsi,rbp
     1355a90:	4c 89 fa             	mov    rdx,r15
     1355a93:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     1355a98:	4c 8d 84 24 00 05 00 	lea    r8,[rsp+0x500]
     1355a9f:	00 
     1355aa0:	4c 8b 4c 24 18       	mov    r9,QWORD PTR [rsp+0x18]
     1355aa5:	ff 74 24 08          	push   QWORD PTR [rsp+0x8]
     1355aa9:	41 54                	push   r12
     1355aab:	ff d0                	call   rax
     1355aad:	58                   	pop    rax
     1355aae:	59                   	pop    rcx
     1355aaf:	48 83 c3 20          	add    rbx,0x20
     1355ab3:	48 3b 5c 24 20       	cmp    rbx,QWORD PTR [rsp+0x20]
     1355ab8:	75 c9                	jne    1355a83 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b007>
     1355aba:	48 8d bc 24 00 05 00 	lea    rdi,[rsp+0x500]
     1355ac1:	00 

### 0x13563a2: mov    QWORD PTR [rsp+0x50],rax
     1356387:	e8 44 99 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     135638c:	e8 1f 97 49 00       	call   17efab0 <__stack_chk_fail@plt>
     1356391:	cc                   	int3
     1356392:	41 56                	push   r14
     1356394:	53                   	push   rbx
     1356395:	48 83 ec 58          	sub    rsp,0x58
     1356399:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13563a0:	00 00 
     13563a2:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     13563a7:	80 bf f0 03 00 00 00 	cmp    BYTE PTR [rdi+0x3f0],0x0
     13563ae:	74 2c                	je     13563dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b960>
     13563b0:	48 89 fb             	mov    rbx,rdi
     13563b3:	48 83 eb 80          	sub    rbx,0xffffffffffffff80
     13563b7:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     13563bc:	4c 89 f7             	mov    rdi,r14
     13563bf:	e8 0e 14 17 00       	call   14c77d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30cd56>
     13563c4:	48 89 df             	mov    rdi,rbx
     13563c7:	4c 89 f6             	mov    rsi,r14
     13563ca:	e8 f5 e5 1f 00       	call   15549c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x399f48>
     13563cf:	48 89 c3             	mov    rbx,rax
     13563d2:	4c 89 f7             	mov    rdi,r14
     13563d5:	e8 f2 83 74 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     13563da:	eb 02                	jmp    13563de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b962>
     13563dc:	31 db                	xor    ebx,ebx
     13563de:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### 0x13563e7: cmp    rax,QWORD PTR [rsp+0x50]
     13563ca:	e8 f5 e5 1f 00       	call   15549c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x399f48>
     13563cf:	48 89 c3             	mov    rbx,rax
     13563d2:	4c 89 f7             	mov    rdi,r14
     13563d5:	e8 f2 83 74 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     13563da:	eb 02                	jmp    13563de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b962>
     13563dc:	31 db                	xor    ebx,ebx
     13563de:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13563e5:	00 00 
     13563e7:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
     13563ec:	75 0b                	jne    13563f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b97d>
     13563ee:	48 89 d8             	mov    rax,rbx
     13563f1:	48 83 c4 58          	add    rsp,0x58
     13563f5:	5b                   	pop    rbx
     13563f6:	41 5e                	pop    r14
     13563f8:	c3                   	ret
     13563f9:	e8 b2 96 49 00       	call   17efab0 <__stack_chk_fail@plt>
     13563fe:	41 57                	push   r15
     1356400:	41 56                	push   r14
     1356402:	53                   	push   rbx
     1356403:	49 89 f7             	mov    r15,rsi
     1356406:	48 89 fb             	mov    rbx,rdi
     1356409:	e8 b6 95 d5 ff       	call   10af9c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x276dda>
     135640e:	4c 8d 73 58          	lea    r14,[rbx+0x58]
     1356412:	49 8d 77 58          	lea    rsi,[r15+0x58]
     1356416:	4c 89 f7             	mov    rdi,r14

### 0x1356494: lea    r14,[r15+0x50]
     1356474:	0f 11 4f 10          	movups XMMWORD PTR [rdi+0x10],xmm1
     1356478:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     135647b:	48 8d 5f 30          	lea    rbx,[rdi+0x30]
     135647f:	48 83 c6 30          	add    rsi,0x30
     1356483:	48 89 df             	mov    rdi,rbx
     1356486:	e8 b5 7a 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     135648b:	41 8b 44 24 48       	mov    eax,DWORD PTR [r12+0x48]
     1356490:	41 89 47 48          	mov    DWORD PTR [r15+0x48],eax
     1356494:	4d 8d 77 50          	lea    r14,[r15+0x50]
     1356498:	49 8d 74 24 50       	lea    rsi,[r12+0x50]
     135649d:	4c 89 f7             	mov    rdi,r14
     13564a0:	e8 9b 7a 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     13564a5:	4d 8d 6f 68          	lea    r13,[r15+0x68]
     13564a9:	49 8d 74 24 68       	lea    rsi,[r12+0x68]
     13564ae:	4c 89 ef             	mov    rdi,r13
     13564b1:	e8 8a 7a 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     13564b6:	41 0f 10 84 24 80 00 	movups xmm0,XMMWORD PTR [r12+0x80]
     13564bd:	00 00 
     13564bf:	41 0f 11 87 80 00 00 	movups XMMWORD PTR [r15+0x80],xmm0
     13564c6:	00 
     13564c7:	be 90 00 00 00       	mov    esi,0x90
     13564cc:	49 8d 2c 37          	lea    rbp,[r15+rsi*1]
     13564d0:	4c 01 e6             	add    rsi,r12
     13564d3:	48 89 ef             	mov    rdi,rbp
     13564d6:	e8 65 7a 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>

### 0x1356498: lea    rsi,[r12+0x50]
     1356478:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     135647b:	48 8d 5f 30          	lea    rbx,[rdi+0x30]
     135647f:	48 83 c6 30          	add    rsi,0x30
     1356483:	48 89 df             	mov    rdi,rbx
     1356486:	e8 b5 7a 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     135648b:	41 8b 44 24 48       	mov    eax,DWORD PTR [r12+0x48]
     1356490:	41 89 47 48          	mov    DWORD PTR [r15+0x48],eax
     1356494:	4d 8d 77 50          	lea    r14,[r15+0x50]
     1356498:	49 8d 74 24 50       	lea    rsi,[r12+0x50]
     135649d:	4c 89 f7             	mov    rdi,r14
     13564a0:	e8 9b 7a 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     13564a5:	4d 8d 6f 68          	lea    r13,[r15+0x68]
     13564a9:	49 8d 74 24 68       	lea    rsi,[r12+0x68]
     13564ae:	4c 89 ef             	mov    rdi,r13
     13564b1:	e8 8a 7a 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     13564b6:	41 0f 10 84 24 80 00 	movups xmm0,XMMWORD PTR [r12+0x80]
     13564bd:	00 00 
     13564bf:	41 0f 11 87 80 00 00 	movups XMMWORD PTR [r15+0x80],xmm0
     13564c6:	00 
     13564c7:	be 90 00 00 00       	mov    esi,0x90
     13564cc:	49 8d 2c 37          	lea    rbp,[r15+rsi*1]
     13564d0:	4c 01 e6             	add    rsi,r12
     13564d3:	48 89 ef             	mov    rdi,rbp
     13564d6:	e8 65 7a 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     13564db:	49 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [r12+0xa8]

### 0x13565bf: lea    rdi,[rbx+0x50]
     1356592:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
     1356599:	e8 e8 7e 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135659e:	48 8d bb b0 00 00 00 	lea    rdi,[rbx+0xb0]
     13565a5:	e8 86 07 75 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     13565aa:	48 8d bb 90 00 00 00 	lea    rdi,[rbx+0x90]
     13565b1:	e8 da 78 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     13565b6:	48 8d 7b 68          	lea    rdi,[rbx+0x68]
     13565ba:	e8 d1 78 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     13565bf:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
     13565c3:	e8 c8 78 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     13565c8:	48 83 c3 30          	add    rbx,0x30
     13565cc:	48 89 df             	mov    rdi,rbx
     13565cf:	5b                   	pop    rbx
     13565d0:	e9 bb 78 49 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     13565d5:	cc                   	int3
     13565d6:	53                   	push   rbx
     13565d7:	48 89 fb             	mov    rbx,rdi
     13565da:	48 83 c7 70          	add    rdi,0x70
     13565de:	e8 ad 78 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     13565e3:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
     13565e7:	e8 a4 78 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     13565ec:	48 89 df             	mov    rdi,rbx
     13565ef:	5b                   	pop    rbx
     13565f0:	e9 d7 81 74 ff       	jmp    a9e7cc <JNI_OnUnload@@Base+0x26099>
     13565f5:	cc                   	int3

### 0x1356f58: movups xmm0,XMMWORD PTR [rbx+0x50]
     1356f3d:	49 89 fe             	mov    r14,rdi
     1356f40:	8b 06                	mov    eax,DWORD PTR [rsi]
     1356f42:	89 07                	mov    DWORD PTR [rdi],eax
     1356f44:	48 83 c7 08          	add    rdi,0x8
     1356f48:	48 83 c6 08          	add    rsi,0x8
     1356f4c:	e8 ff 56 d3 ff       	call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>
     1356f51:	8a 43 60             	mov    al,BYTE PTR [rbx+0x60]
     1356f54:	41 88 46 60          	mov    BYTE PTR [r14+0x60],al
     1356f58:	0f 10 43 50          	movups xmm0,XMMWORD PTR [rbx+0x50]
     1356f5c:	41 0f 11 46 50       	movups XMMWORD PTR [r14+0x50],xmm0
     1356f61:	48 83 c4 08          	add    rsp,0x8
     1356f65:	5b                   	pop    rbx
     1356f66:	41 5e                	pop    r14
     1356f68:	c3                   	ret
     1356f69:	cc                   	int3
     1356f6a:	55                   	push   rbp
     1356f6b:	41 57                	push   r15
     1356f6d:	41 56                	push   r14
     1356f6f:	41 55                	push   r13
     1356f71:	41 54                	push   r12
     1356f73:	53                   	push   rbx
     1356f74:	48 83 ec 18          	sub    rsp,0x18
     1356f78:	48 89 fb             	mov    rbx,rdi
     1356f7b:	bd 98 02 00 00       	mov    ebp,0x298
     1356f80:	48 8d 04 2f          	lea    rax,[rdi+rbp*1]

### 0x1356f5c: movups XMMWORD PTR [r14+0x50],xmm0
     1356f40:	8b 06                	mov    eax,DWORD PTR [rsi]
     1356f42:	89 07                	mov    DWORD PTR [rdi],eax
     1356f44:	48 83 c7 08          	add    rdi,0x8
     1356f48:	48 83 c6 08          	add    rsi,0x8
     1356f4c:	e8 ff 56 d3 ff       	call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>
     1356f51:	8a 43 60             	mov    al,BYTE PTR [rbx+0x60]
     1356f54:	41 88 46 60          	mov    BYTE PTR [r14+0x60],al
     1356f58:	0f 10 43 50          	movups xmm0,XMMWORD PTR [rbx+0x50]
     1356f5c:	41 0f 11 46 50       	movups XMMWORD PTR [r14+0x50],xmm0
     1356f61:	48 83 c4 08          	add    rsp,0x8
     1356f65:	5b                   	pop    rbx
     1356f66:	41 5e                	pop    r14
     1356f68:	c3                   	ret
     1356f69:	cc                   	int3
     1356f6a:	55                   	push   rbp
     1356f6b:	41 57                	push   r15
     1356f6d:	41 56                	push   r14
     1356f6f:	41 55                	push   r13
     1356f71:	41 54                	push   r12
     1356f73:	53                   	push   rbx
     1356f74:	48 83 ec 18          	sub    rsp,0x18
     1356f78:	48 89 fb             	mov    rbx,rdi
     1356f7b:	bd 98 02 00 00       	mov    ebp,0x298
     1356f80:	48 8d 04 2f          	lea    rax,[rdi+rbp*1]
     1356f84:	48 89 04 24          	mov    QWORD PTR [rsp],rax

### 0x1357158: lea    rdi,[rbx+0x50]
     1357139:	0f 11 57 1e          	movups XMMWORD PTR [rdi+0x1e],xmm2
     135713d:	0f 11 4f 10          	movups XMMWORD PTR [rdi+0x10],xmm1
     1357141:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     1357144:	48 83 c7 30          	add    rdi,0x30
     1357148:	48 83 c6 30          	add    rsi,0x30
     135714c:	e8 dd 48 72 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1357151:	41 8b 46 48          	mov    eax,DWORD PTR [r14+0x48]
     1357155:	89 43 48             	mov    DWORD PTR [rbx+0x48],eax
     1357158:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
     135715c:	49 8d 76 50          	lea    rsi,[r14+0x50]
     1357160:	e8 c9 48 72 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1357165:	48 8d 7b 68          	lea    rdi,[rbx+0x68]
     1357169:	49 8d 76 68          	lea    rsi,[r14+0x68]
     135716d:	e8 bc 48 72 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1357172:	41 0f 10 86 80 00 00 	movups xmm0,XMMWORD PTR [r14+0x80]
     1357179:	00 
     135717a:	0f 11 83 80 00 00 00 	movups XMMWORD PTR [rbx+0x80],xmm0
     1357181:	be 90 00 00 00       	mov    esi,0x90
     1357186:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     135718a:	4c 01 f6             	add    rsi,r14
     135718d:	e8 9c 48 72 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1357192:	49 8b 86 a8 00 00 00 	mov    rax,QWORD PTR [r14+0xa8]
     1357199:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
     13571a0:	be b0 00 00 00       	mov    esi,0xb0
     13571a5:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]

### 0x135715c: lea    rsi,[r14+0x50]
     135713d:	0f 11 4f 10          	movups XMMWORD PTR [rdi+0x10],xmm1
     1357141:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     1357144:	48 83 c7 30          	add    rdi,0x30
     1357148:	48 83 c6 30          	add    rsi,0x30
     135714c:	e8 dd 48 72 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1357151:	41 8b 46 48          	mov    eax,DWORD PTR [r14+0x48]
     1357155:	89 43 48             	mov    DWORD PTR [rbx+0x48],eax
     1357158:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
     135715c:	49 8d 76 50          	lea    rsi,[r14+0x50]
     1357160:	e8 c9 48 72 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1357165:	48 8d 7b 68          	lea    rdi,[rbx+0x68]
     1357169:	49 8d 76 68          	lea    rsi,[r14+0x68]
     135716d:	e8 bc 48 72 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1357172:	41 0f 10 86 80 00 00 	movups xmm0,XMMWORD PTR [r14+0x80]
     1357179:	00 
     135717a:	0f 11 83 80 00 00 00 	movups XMMWORD PTR [rbx+0x80],xmm0
     1357181:	be 90 00 00 00       	mov    esi,0x90
     1357186:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     135718a:	4c 01 f6             	add    rsi,r14
     135718d:	e8 9c 48 72 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1357192:	49 8b 86 a8 00 00 00 	mov    rax,QWORD PTR [r14+0xa8]
     1357199:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
     13571a0:	be b0 00 00 00       	mov    esi,0xb0
     13571a5:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     13571a9:	4c 01 f6             	add    rsi,r14

### 0x1357358: mov    al,BYTE PTR [rsi+0x50]
     1357337:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     135733c:	0f 11 06             	movups XMMWORD PTR [rsi],xmm0
     135733f:	48 8b 46 28          	mov    rax,QWORD PTR [rsi+0x28]
     1357343:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
     1357347:	0f 10 4e 18          	movups xmm1,XMMWORD PTR [rsi+0x18]
     135734b:	0f 11 4f 18          	movups XMMWORD PTR [rdi+0x18],xmm1
     135734f:	48 83 66 28 00       	and    QWORD PTR [rsi+0x28],0x0
     1357354:	0f 11 46 18          	movups XMMWORD PTR [rsi+0x18],xmm0
     1357358:	8a 46 50             	mov    al,BYTE PTR [rsi+0x50]
     135735b:	88 47 50             	mov    BYTE PTR [rdi+0x50],al
     135735e:	0f 10 4e 30          	movups xmm1,XMMWORD PTR [rsi+0x30]
     1357362:	0f 10 56 40          	movups xmm2,XMMWORD PTR [rsi+0x40]
     1357366:	0f 11 57 40          	movups XMMWORD PTR [rdi+0x40],xmm2
     135736a:	0f 11 4f 30          	movups XMMWORD PTR [rdi+0x30],xmm1
     135736e:	48 8b 46 68          	mov    rax,QWORD PTR [rsi+0x68]
     1357372:	48 89 47 68          	mov    QWORD PTR [rdi+0x68],rax
     1357376:	0f 10 4e 58          	movups xmm1,XMMWORD PTR [rsi+0x58]
     135737a:	0f 11 4f 58          	movups XMMWORD PTR [rdi+0x58],xmm1
     135737e:	0f 11 46 58          	movups XMMWORD PTR [rsi+0x58],xmm0
     1357382:	48 83 66 68 00       	and    QWORD PTR [rsi+0x68],0x0
     1357387:	48 8b 86 80 00 00 00 	mov    rax,QWORD PTR [rsi+0x80]
     135738e:	48 89 87 80 00 00 00 	mov    QWORD PTR [rdi+0x80],rax
     1357395:	0f 10 4e 70          	movups xmm1,XMMWORD PTR [rsi+0x70]
     1357399:	0f 11 4f 70          	movups XMMWORD PTR [rdi+0x70],xmm1
     135739d:	0f 11 46 70          	movups XMMWORD PTR [rsi+0x70],xmm0

### 0x135735b: mov    BYTE PTR [rdi+0x50],al
     135733c:	0f 11 06             	movups XMMWORD PTR [rsi],xmm0
     135733f:	48 8b 46 28          	mov    rax,QWORD PTR [rsi+0x28]
     1357343:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
     1357347:	0f 10 4e 18          	movups xmm1,XMMWORD PTR [rsi+0x18]
     135734b:	0f 11 4f 18          	movups XMMWORD PTR [rdi+0x18],xmm1
     135734f:	48 83 66 28 00       	and    QWORD PTR [rsi+0x28],0x0
     1357354:	0f 11 46 18          	movups XMMWORD PTR [rsi+0x18],xmm0
     1357358:	8a 46 50             	mov    al,BYTE PTR [rsi+0x50]
     135735b:	88 47 50             	mov    BYTE PTR [rdi+0x50],al
     135735e:	0f 10 4e 30          	movups xmm1,XMMWORD PTR [rsi+0x30]
     1357362:	0f 10 56 40          	movups xmm2,XMMWORD PTR [rsi+0x40]
     1357366:	0f 11 57 40          	movups XMMWORD PTR [rdi+0x40],xmm2
     135736a:	0f 11 4f 30          	movups XMMWORD PTR [rdi+0x30],xmm1
     135736e:	48 8b 46 68          	mov    rax,QWORD PTR [rsi+0x68]
     1357372:	48 89 47 68          	mov    QWORD PTR [rdi+0x68],rax
     1357376:	0f 10 4e 58          	movups xmm1,XMMWORD PTR [rsi+0x58]
     135737a:	0f 11 4f 58          	movups XMMWORD PTR [rdi+0x58],xmm1
     135737e:	0f 11 46 58          	movups XMMWORD PTR [rsi+0x58],xmm0
     1357382:	48 83 66 68 00       	and    QWORD PTR [rsi+0x68],0x0
     1357387:	48 8b 86 80 00 00 00 	mov    rax,QWORD PTR [rsi+0x80]
     135738e:	48 89 87 80 00 00 00 	mov    QWORD PTR [rdi+0x80],rax
     1357395:	0f 10 4e 70          	movups xmm1,XMMWORD PTR [rsi+0x70]
     1357399:	0f 11 4f 70          	movups XMMWORD PTR [rdi+0x70],xmm1
     135739d:	0f 11 46 70          	movups XMMWORD PTR [rsi+0x70],xmm0
     13573a1:	48 83 a6 80 00 00 00 	and    QWORD PTR [rsi+0x80],0x0

### 0x13573ea: movups xmm1,XMMWORD PTR [rsi+0x50]
     13573cc:	0f 11 47 30          	movups XMMWORD PTR [rdi+0x30],xmm0
     13573d0:	0f 57 c0             	xorps  xmm0,xmm0
     13573d3:	48 83 66 40 00       	and    QWORD PTR [rsi+0x40],0x0
     13573d8:	0f 11 46 30          	movups XMMWORD PTR [rsi+0x30],xmm0
     13573dc:	8b 46 48             	mov    eax,DWORD PTR [rsi+0x48]
     13573df:	89 47 48             	mov    DWORD PTR [rdi+0x48],eax
     13573e2:	48 8b 46 60          	mov    rax,QWORD PTR [rsi+0x60]
     13573e6:	48 89 47 60          	mov    QWORD PTR [rdi+0x60],rax
     13573ea:	0f 10 4e 50          	movups xmm1,XMMWORD PTR [rsi+0x50]
     13573ee:	0f 11 4f 50          	movups XMMWORD PTR [rdi+0x50],xmm1
     13573f2:	0f 11 46 50          	movups XMMWORD PTR [rsi+0x50],xmm0
     13573f6:	48 83 66 60 00       	and    QWORD PTR [rsi+0x60],0x0
     13573fb:	48 8b 46 78          	mov    rax,QWORD PTR [rsi+0x78]
     13573ff:	48 89 47 78          	mov    QWORD PTR [rdi+0x78],rax
     1357403:	0f 10 4e 68          	movups xmm1,XMMWORD PTR [rsi+0x68]
     1357407:	0f 11 4f 68          	movups XMMWORD PTR [rdi+0x68],xmm1
     135740b:	0f 11 46 68          	movups XMMWORD PTR [rsi+0x68],xmm0
     135740f:	48 83 66 78 00       	and    QWORD PTR [rsi+0x78],0x0
     1357414:	0f 10 8e 80 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x80]
     135741b:	0f 11 8f 80 00 00 00 	movups XMMWORD PTR [rdi+0x80],xmm1
     1357422:	48 8b 86 a0 00 00 00 	mov    rax,QWORD PTR [rsi+0xa0]
     1357429:	48 89 87 a0 00 00 00 	mov    QWORD PTR [rdi+0xa0],rax
     1357430:	0f 10 8e 90 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x90]
     1357437:	0f 11 8f 90 00 00 00 	movups XMMWORD PTR [rdi+0x90],xmm1
     135743e:	48 83 a6 a0 00 00 00 	and    QWORD PTR [rsi+0xa0],0x0

### 0x13573ee: movups XMMWORD PTR [rdi+0x50],xmm1
     13573d0:	0f 57 c0             	xorps  xmm0,xmm0
     13573d3:	48 83 66 40 00       	and    QWORD PTR [rsi+0x40],0x0
     13573d8:	0f 11 46 30          	movups XMMWORD PTR [rsi+0x30],xmm0
     13573dc:	8b 46 48             	mov    eax,DWORD PTR [rsi+0x48]
     13573df:	89 47 48             	mov    DWORD PTR [rdi+0x48],eax
     13573e2:	48 8b 46 60          	mov    rax,QWORD PTR [rsi+0x60]
     13573e6:	48 89 47 60          	mov    QWORD PTR [rdi+0x60],rax
     13573ea:	0f 10 4e 50          	movups xmm1,XMMWORD PTR [rsi+0x50]
     13573ee:	0f 11 4f 50          	movups XMMWORD PTR [rdi+0x50],xmm1
     13573f2:	0f 11 46 50          	movups XMMWORD PTR [rsi+0x50],xmm0
     13573f6:	48 83 66 60 00       	and    QWORD PTR [rsi+0x60],0x0
     13573fb:	48 8b 46 78          	mov    rax,QWORD PTR [rsi+0x78]
     13573ff:	48 89 47 78          	mov    QWORD PTR [rdi+0x78],rax
     1357403:	0f 10 4e 68          	movups xmm1,XMMWORD PTR [rsi+0x68]
     1357407:	0f 11 4f 68          	movups XMMWORD PTR [rdi+0x68],xmm1
     135740b:	0f 11 46 68          	movups XMMWORD PTR [rsi+0x68],xmm0
     135740f:	48 83 66 78 00       	and    QWORD PTR [rsi+0x78],0x0
     1357414:	0f 10 8e 80 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x80]
     135741b:	0f 11 8f 80 00 00 00 	movups XMMWORD PTR [rdi+0x80],xmm1
     1357422:	48 8b 86 a0 00 00 00 	mov    rax,QWORD PTR [rsi+0xa0]
     1357429:	48 89 87 a0 00 00 00 	mov    QWORD PTR [rdi+0xa0],rax
     1357430:	0f 10 8e 90 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x90]
     1357437:	0f 11 8f 90 00 00 00 	movups XMMWORD PTR [rdi+0x90],xmm1
     135743e:	48 83 a6 a0 00 00 00 	and    QWORD PTR [rsi+0xa0],0x0
     1357445:	00 

### 0x13573f2: movups XMMWORD PTR [rsi+0x50],xmm0
     13573d3:	48 83 66 40 00       	and    QWORD PTR [rsi+0x40],0x0
     13573d8:	0f 11 46 30          	movups XMMWORD PTR [rsi+0x30],xmm0
     13573dc:	8b 46 48             	mov    eax,DWORD PTR [rsi+0x48]
     13573df:	89 47 48             	mov    DWORD PTR [rdi+0x48],eax
     13573e2:	48 8b 46 60          	mov    rax,QWORD PTR [rsi+0x60]
     13573e6:	48 89 47 60          	mov    QWORD PTR [rdi+0x60],rax
     13573ea:	0f 10 4e 50          	movups xmm1,XMMWORD PTR [rsi+0x50]
     13573ee:	0f 11 4f 50          	movups XMMWORD PTR [rdi+0x50],xmm1
     13573f2:	0f 11 46 50          	movups XMMWORD PTR [rsi+0x50],xmm0
     13573f6:	48 83 66 60 00       	and    QWORD PTR [rsi+0x60],0x0
     13573fb:	48 8b 46 78          	mov    rax,QWORD PTR [rsi+0x78]
     13573ff:	48 89 47 78          	mov    QWORD PTR [rdi+0x78],rax
     1357403:	0f 10 4e 68          	movups xmm1,XMMWORD PTR [rsi+0x68]
     1357407:	0f 11 4f 68          	movups XMMWORD PTR [rdi+0x68],xmm1
     135740b:	0f 11 46 68          	movups XMMWORD PTR [rsi+0x68],xmm0
     135740f:	48 83 66 78 00       	and    QWORD PTR [rsi+0x78],0x0
     1357414:	0f 10 8e 80 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x80]
     135741b:	0f 11 8f 80 00 00 00 	movups XMMWORD PTR [rdi+0x80],xmm1
     1357422:	48 8b 86 a0 00 00 00 	mov    rax,QWORD PTR [rsi+0xa0]
     1357429:	48 89 87 a0 00 00 00 	mov    QWORD PTR [rdi+0xa0],rax
     1357430:	0f 10 8e 90 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x90]
     1357437:	0f 11 8f 90 00 00 00 	movups XMMWORD PTR [rdi+0x90],xmm1
     135743e:	48 83 a6 a0 00 00 00 	and    QWORD PTR [rsi+0xa0],0x0
     1357445:	00 
     1357446:	0f 11 86 90 00 00 00 	movups XMMWORD PTR [rsi+0x90],xmm0

### 0x1357617: movups xmm0,XMMWORD PTR [rdx+0x50]
     13575fa:	0f 11 42 20          	movups XMMWORD PTR [rdx+0x20],xmm0
     13575fe:	48 83 62 30 00       	and    QWORD PTR [rdx+0x30],0x0
     1357603:	8a 42 48             	mov    al,BYTE PTR [rdx+0x48]
     1357606:	88 46 48             	mov    BYTE PTR [rsi+0x48],al
     1357609:	0f 10 42 38          	movups xmm0,XMMWORD PTR [rdx+0x38]
     135760d:	0f 11 46 38          	movups XMMWORD PTR [rsi+0x38],xmm0
     1357611:	8a 42 60             	mov    al,BYTE PTR [rdx+0x60]
     1357614:	88 46 60             	mov    BYTE PTR [rsi+0x60],al
     1357617:	0f 10 42 50          	movups xmm0,XMMWORD PTR [rdx+0x50]
     135761b:	0f 11 46 50          	movups XMMWORD PTR [rsi+0x50],xmm0
     135761f:	c3                   	ret
     1357620:	48 89 f7             	mov    rdi,rsi
     1357623:	48 89 d6             	mov    rsi,rdx
     1357626:	e9 31 00 00 00       	jmp    135765c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19cbe0>
     135762b:	cc                   	int3
     135762c:	48 89 f7             	mov    rdi,rsi
     135762f:	48 89 d6             	mov    rsi,rdx
     1357632:	e9 b5 31 ed ff       	jmp    122a7ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6fd70>
     1357637:	cc                   	int3
     1357638:	48 89 f7             	mov    rdi,rsi
     135763b:	48 89 d6             	mov    rsi,rdx
     135763e:	e9 03 31 ed ff       	jmp    122a746 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6fcca>
     1357643:	cc                   	int3
     1357644:	48 89 f7             	mov    rdi,rsi
     1357647:	48 89 d6             	mov    rsi,rdx

### 0x135761b: movups XMMWORD PTR [rsi+0x50],xmm0
     13575fe:	48 83 62 30 00       	and    QWORD PTR [rdx+0x30],0x0
     1357603:	8a 42 48             	mov    al,BYTE PTR [rdx+0x48]
     1357606:	88 46 48             	mov    BYTE PTR [rsi+0x48],al
     1357609:	0f 10 42 38          	movups xmm0,XMMWORD PTR [rdx+0x38]
     135760d:	0f 11 46 38          	movups XMMWORD PTR [rsi+0x38],xmm0
     1357611:	8a 42 60             	mov    al,BYTE PTR [rdx+0x60]
     1357614:	88 46 60             	mov    BYTE PTR [rsi+0x60],al
     1357617:	0f 10 42 50          	movups xmm0,XMMWORD PTR [rdx+0x50]
     135761b:	0f 11 46 50          	movups XMMWORD PTR [rsi+0x50],xmm0
     135761f:	c3                   	ret
     1357620:	48 89 f7             	mov    rdi,rsi
     1357623:	48 89 d6             	mov    rsi,rdx
     1357626:	e9 31 00 00 00       	jmp    135765c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19cbe0>
     135762b:	cc                   	int3
     135762c:	48 89 f7             	mov    rdi,rsi
     135762f:	48 89 d6             	mov    rsi,rdx
     1357632:	e9 b5 31 ed ff       	jmp    122a7ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6fd70>
     1357637:	cc                   	int3
     1357638:	48 89 f7             	mov    rdi,rsi
     135763b:	48 89 d6             	mov    rsi,rdx
     135763e:	e9 03 31 ed ff       	jmp    122a746 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6fcca>
     1357643:	cc                   	int3
     1357644:	48 89 f7             	mov    rdi,rsi
     1357647:	48 89 d6             	mov    rsi,rdx
     135764a:	e9 67 2b ed ff       	jmp    122a1b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6f73a>

### 0x1357808: movups xmm0,XMMWORD PTR [rbx+0x50]
     13577ee:	83 7f 68 01          	cmp    DWORD PTR [rdi+0x68],0x1
     13577f2:	75 2c                	jne    1357820 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19cda4>
     13577f4:	49 89 f6             	mov    r14,rsi
     13577f7:	8b 03                	mov    eax,DWORD PTR [rbx]
     13577f9:	89 06                	mov    DWORD PTR [rsi],eax
     13577fb:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
     13577ff:	48 8d 73 08          	lea    rsi,[rbx+0x8]
     1357803:	e8 94 e3 eb ff       	call   1215b9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b120>
     1357808:	0f 10 43 50          	movups xmm0,XMMWORD PTR [rbx+0x50]
     135780c:	41 0f 11 46 50       	movups XMMWORD PTR [r14+0x50],xmm0
     1357811:	8a 43 60             	mov    al,BYTE PTR [rbx+0x60]
     1357814:	41 88 46 60          	mov    BYTE PTR [r14+0x60],al
     1357818:	48 83 c4 08          	add    rsp,0x8
     135781c:	5b                   	pop    rbx
     135781d:	41 5e                	pop    r14
     135781f:	c3                   	ret
     1357820:	48 89 de             	mov    rsi,rbx
     1357823:	48 83 c4 08          	add    rsp,0x8
     1357827:	5b                   	pop    rbx
     1357828:	41 5e                	pop    r14
     135782a:	e9 c1 00 00 00       	jmp    13578f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ce74>
     135782f:	cc                   	int3
     1357830:	41 56                	push   r14
     1357832:	53                   	push   rbx
     1357833:	50                   	push   rax

### 0x135780c: movups XMMWORD PTR [r14+0x50],xmm0
     13577f2:	75 2c                	jne    1357820 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19cda4>
     13577f4:	49 89 f6             	mov    r14,rsi
     13577f7:	8b 03                	mov    eax,DWORD PTR [rbx]
     13577f9:	89 06                	mov    DWORD PTR [rsi],eax
     13577fb:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
     13577ff:	48 8d 73 08          	lea    rsi,[rbx+0x8]
     1357803:	e8 94 e3 eb ff       	call   1215b9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b120>
     1357808:	0f 10 43 50          	movups xmm0,XMMWORD PTR [rbx+0x50]
     135780c:	41 0f 11 46 50       	movups XMMWORD PTR [r14+0x50],xmm0
     1357811:	8a 43 60             	mov    al,BYTE PTR [rbx+0x60]
     1357814:	41 88 46 60          	mov    BYTE PTR [r14+0x60],al
     1357818:	48 83 c4 08          	add    rsp,0x8
     135781c:	5b                   	pop    rbx
     135781d:	41 5e                	pop    r14
     135781f:	c3                   	ret
     1357820:	48 89 de             	mov    rsi,rbx
     1357823:	48 83 c4 08          	add    rsp,0x8
     1357827:	5b                   	pop    rbx
     1357828:	41 5e                	pop    r14
     135782a:	e9 c1 00 00 00       	jmp    13578f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ce74>
     135782f:	cc                   	int3
     1357830:	41 56                	push   r14
     1357832:	53                   	push   rbx
     1357833:	50                   	push   rax
     1357834:	48 89 d3             	mov    rbx,rdx

### 0x1357954: movups xmm0,XMMWORD PTR [r14+0x50]
     1357933:	49 83 66 30 00       	and    QWORD PTR [r14+0x30],0x0
     1357938:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
     135793d:	41 0f 10 46 38       	movups xmm0,XMMWORD PTR [r14+0x38]
     1357942:	0f 11 43 38          	movups XMMWORD PTR [rbx+0x38],xmm0
     1357946:	41 8a 46 48          	mov    al,BYTE PTR [r14+0x48]
     135794a:	88 43 48             	mov    BYTE PTR [rbx+0x48],al
     135794d:	41 8a 46 60          	mov    al,BYTE PTR [r14+0x60]
     1357951:	88 43 60             	mov    BYTE PTR [rbx+0x60],al
     1357954:	41 0f 10 46 50       	movups xmm0,XMMWORD PTR [r14+0x50]
     1357959:	0f 11 43 50          	movups XMMWORD PTR [rbx+0x50],xmm0
     135795d:	c7 43 68 01 00 00 00 	mov    DWORD PTR [rbx+0x68],0x1
     1357964:	48 89 d8             	mov    rax,rbx
     1357967:	48 83 c4 08          	add    rsp,0x8
     135796b:	5b                   	pop    rbx
     135796c:	41 5e                	pop    r14
     135796e:	c3                   	ret
     135796f:	cc                   	int3
     1357970:	41 56                	push   r14
     1357972:	53                   	push   rbx
     1357973:	50                   	push   rax
     1357974:	48 89 f3             	mov    rbx,rsi
     1357977:	49 89 fe             	mov    r14,rdi
     135797a:	e8 af 40 72 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     135797f:	49 8d 7e 18          	lea    rdi,[r14+0x18]
     1357983:	48 83 c3 18          	add    rbx,0x18

### 0x1357959: movups XMMWORD PTR [rbx+0x50],xmm0
     1357938:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
     135793d:	41 0f 10 46 38       	movups xmm0,XMMWORD PTR [r14+0x38]
     1357942:	0f 11 43 38          	movups XMMWORD PTR [rbx+0x38],xmm0
     1357946:	41 8a 46 48          	mov    al,BYTE PTR [r14+0x48]
     135794a:	88 43 48             	mov    BYTE PTR [rbx+0x48],al
     135794d:	41 8a 46 60          	mov    al,BYTE PTR [r14+0x60]
     1357951:	88 43 60             	mov    BYTE PTR [rbx+0x60],al
     1357954:	41 0f 10 46 50       	movups xmm0,XMMWORD PTR [r14+0x50]
     1357959:	0f 11 43 50          	movups XMMWORD PTR [rbx+0x50],xmm0
     135795d:	c7 43 68 01 00 00 00 	mov    DWORD PTR [rbx+0x68],0x1
     1357964:	48 89 d8             	mov    rax,rbx
     1357967:	48 83 c4 08          	add    rsp,0x8
     135796b:	5b                   	pop    rbx
     135796c:	41 5e                	pop    r14
     135796e:	c3                   	ret
     135796f:	cc                   	int3
     1357970:	41 56                	push   r14
     1357972:	53                   	push   rbx
     1357973:	50                   	push   rax
     1357974:	48 89 f3             	mov    rbx,rsi
     1357977:	49 89 fe             	mov    r14,rdi
     135797a:	e8 af 40 72 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     135797f:	49 8d 7e 18          	lea    rdi,[r14+0x18]
     1357983:	48 83 c3 18          	add    rbx,0x18
     1357987:	48 89 de             	mov    rsi,rbx

### 0x13594d4: lea    rsi,[rcx+0x50]
     13594b8:	53                   	push   rbx
     13594b9:	48 83 ec 50          	sub    rsp,0x50
     13594bd:	4d 89 c6             	mov    r14,r8
     13594c0:	49 89 f7             	mov    r15,rsi
     13594c3:	48 89 fb             	mov    rbx,rdi
     13594c6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13594cd:	00 00 
     13594cf:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     13594d4:	48 8d 71 50          	lea    rsi,[rcx+0x50]
     13594d8:	48 8d 42 58          	lea    rax,[rdx+0x58]
     13594dc:	80 b9 00 01 00 00 00 	cmp    BYTE PTR [rcx+0x100],0x0
     13594e3:	48 0f 44 f0          	cmove  rsi,rax
     13594e7:	e8 2e fa 31 00       	call   1678f1a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d086>
     13594ec:	41 83 bf 90 02 00 00 	cmp    DWORD PTR [r15+0x290],0x0
     13594f3:	00 
     13594f4:	75 57                	jne    135954d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ead1>
     13594f6:	4c 89 ff             	mov    rdi,r15
     13594f9:	e8 d7 ae ff ff       	call   13543d5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199959>
     13594fe:	41 80 bf 80 00 00 00 	cmp    BYTE PTR [r15+0x80],0x0
     1359505:	00 
     1359506:	74 45                	je     135954d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ead1>
     1359508:	48 8d 35 27 f3 02 ff 	lea    rsi,[rip+0xffffffffff02f327]        # 388836 <_ZTSSt12bad_any_cast@@Base-0x7992>
     135950f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     1359514:	6a 18                	push   0x18
     1359516:	5a                   	pop    rdx

### 0x1359d05: mov    QWORD PTR [rsp+0x50],rax
     1359cec:	41 54                	push   r12
     1359cee:	53                   	push   rbx
     1359cef:	48 83 ec 58          	sub    rsp,0x58
     1359cf3:	48 89 d3             	mov    rbx,rdx
     1359cf6:	49 89 f7             	mov    r15,rsi
     1359cf9:	49 89 fe             	mov    r14,rdi
     1359cfc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1359d03:	00 00 
     1359d05:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     1359d0a:	41 0f b6 41 38       	movzx  eax,BYTE PTR [r9+0x38]
     1359d0f:	83 f8 04             	cmp    eax,0x4
     1359d12:	74 6e                	je     1359d82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f306>
     1359d14:	83 f8 03             	cmp    eax,0x3
     1359d17:	0f 85 c6 00 00 00    	jne    1359de3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f367>
     1359d1d:	48 89 df             	mov    rdi,rbx
     1359d20:	e8 12 78 1f 00       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     1359d25:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
     1359d2a:	4c 89 e7             	mov    rdi,r12
     1359d2d:	48 89 c6             	mov    rsi,rax
     1359d30:	e8 1b 29 d3 ff       	call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>
     1359d35:	4c 89 ff             	mov    rdi,r15
     1359d38:	4c 89 e6             	mov    rsi,r12
     1359d3b:	e8 5e ac 1f 00       	call   155499e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x399f22>
     1359d40:	48 85 c0             	test   rax,rax
     1359d43:	0f 84 90 00 00 00    	je     1359dd9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f35d>

### 0x1359dec: cmp    rax,QWORD PTR [rsp+0x50]
     1359dca:	48 8b 70 30          	mov    rsi,QWORD PTR [rax+0x30]
     1359dce:	8b 78 08             	mov    edi,DWORD PTR [rax+0x8]
     1359dd1:	48 89 da             	mov    rdx,rbx
     1359dd4:	e8 2d 3e 0e 00       	call   143dc06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28318a>
     1359dd9:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1359dde:	e8 e9 49 74 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1359de3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1359dea:	00 00 
     1359dec:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
     1359df1:	75 33                	jne    1359e26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f3aa>
     1359df3:	48 83 c4 58          	add    rsp,0x58
     1359df7:	5b                   	pop    rbx
     1359df8:	41 5c                	pop    r12
     1359dfa:	41 5e                	pop    r14
     1359dfc:	41 5f                	pop    r15
     1359dfe:	c3                   	ret
     1359dff:	eb 00                	jmp    1359e01 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f385>
     1359e01:	48 89 c3             	mov    rbx,rax
     1359e04:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1359e09:	e8 be 49 74 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1359e0e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1359e15:	00 00 
     1359e17:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
     1359e1c:	75 08                	jne    1359e26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f3aa>
     1359e1e:	48 89 df             	mov    rdi,rbx

### 0x1359e17: cmp    rax,QWORD PTR [rsp+0x50]
     1359dfc:	41 5f                	pop    r15
     1359dfe:	c3                   	ret
     1359dff:	eb 00                	jmp    1359e01 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f385>
     1359e01:	48 89 c3             	mov    rbx,rax
     1359e04:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1359e09:	e8 be 49 74 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1359e0e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1359e15:	00 00 
     1359e17:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
     1359e1c:	75 08                	jne    1359e26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f3aa>
     1359e1e:	48 89 df             	mov    rdi,rbx
     1359e21:	e8 aa 5e 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1359e26:	e8 85 5c 49 00       	call   17efab0 <__stack_chk_fail@plt>
     1359e2b:	cc                   	int3
     1359e2c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1359e2f:	48 8b 40 40          	mov    rax,QWORD PTR [rax+0x40]
     1359e33:	c3                   	ret
     1359e34:	41 57                	push   r15
     1359e36:	41 56                	push   r14
     1359e38:	41 54                	push   r12
     1359e3a:	53                   	push   rbx
     1359e3b:	48 83 ec 38          	sub    rsp,0x38
     1359e3f:	48 89 fb             	mov    rbx,rdi
     1359e42:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1359e49:	00 00 

### 0x135a290: lea    rsi,[rbx+0x50]
     135a26a:	0f 11 55 1e          	movups XMMWORD PTR [rbp+0x1e],xmm2
     135a26e:	0f 11 4d 10          	movups XMMWORD PTR [rbp+0x10],xmm1
     135a272:	0f 11 45 00          	movups XMMWORD PTR [rbp+0x0],xmm0
     135a276:	49 8d be a8 00 00 00 	lea    rdi,[r14+0xa8]
     135a27d:	48 8d 73 30          	lea    rsi,[rbx+0x30]
     135a281:	e8 fa 3d 49 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     135a286:	8b 43 48             	mov    eax,DWORD PTR [rbx+0x48]
     135a289:	41 89 86 c0 00 00 00 	mov    DWORD PTR [r14+0xc0],eax
     135a290:	48 8d 73 50          	lea    rsi,[rbx+0x50]
     135a294:	4c 89 ef             	mov    rdi,r13
     135a297:	e8 e4 3d 49 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     135a29c:	49 8d be e0 00 00 00 	lea    rdi,[r14+0xe0]
     135a2a3:	48 8d 73 68          	lea    rsi,[rbx+0x68]
     135a2a7:	e8 d4 3d 49 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     135a2ac:	0f 10 83 80 00 00 00 	movups xmm0,XMMWORD PTR [rbx+0x80]
     135a2b3:	41 0f 11 86 f8 00 00 	movups XMMWORD PTR [r14+0xf8],xmm0
     135a2ba:	00 
     135a2bb:	49 8d be 08 01 00 00 	lea    rdi,[r14+0x108]
     135a2c2:	48 8d b3 90 00 00 00 	lea    rsi,[rbx+0x90]
     135a2c9:	e8 b2 3d 49 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     135a2ce:	48 8b 83 a8 00 00 00 	mov    rax,QWORD PTR [rbx+0xa8]
     135a2d5:	49 89 86 20 01 00 00 	mov    QWORD PTR [r14+0x120],rax
     135a2dc:	49 8d be 28 01 00 00 	lea    rdi,[r14+0x128]
     135a2e3:	48 8d b3 b0 00 00 00 	lea    rsi,[rbx+0xb0]
     135a2ea:	e8 6b b1 77 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>

### 0x135a608: mov    QWORD PTR [rsp+0x50],rax
     135a5ef:	41 54                	push   r12
     135a5f1:	53                   	push   rbx
     135a5f2:	48 83 ec 58          	sub    rsp,0x58
     135a5f6:	49 89 d7             	mov    r15,rdx
     135a5f9:	49 89 f6             	mov    r14,rsi
     135a5fc:	48 89 fb             	mov    rbx,rdi
     135a5ff:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135a606:	00 00 
     135a608:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     135a60d:	48 89 f7             	mov    rdi,rsi
     135a610:	48 89 d6             	mov    rsi,rdx
     135a613:	e8 ac a3 1f 00       	call   15549c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x399f48>
     135a618:	48 85 c0             	test   rax,rax
     135a61b:	74 09                	je     135a626 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19fbaa>
     135a61d:	83 b8 90 02 00 00 00 	cmp    DWORD PTR [rax+0x290],0x0
     135a624:	74 5b                	je     135a681 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19fc05>
     135a626:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
     135a62b:	4c 89 e7             	mov    rdi,r12
     135a62e:	4c 89 fe             	mov    rsi,r15
     135a631:	e8 1a 20 d3 ff       	call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>
     135a636:	4c 8d 6c 24 20       	lea    r13,[rsp+0x20]
     135a63b:	49 83 c7 18          	add    r15,0x18
     135a63f:	4c 89 f7             	mov    rdi,r14
     135a642:	4c 89 e6             	mov    rsi,r12
     135a645:	e8 54 a3 1f 00       	call   155499e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x399f22>

### 0x135a6dc: cmp    rax,QWORD PTR [rsp+0x50]
     135a6bd:	eb d2                	jmp    135a691 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19fc15>
     135a6bf:	31 c0                	xor    eax,eax
     135a6c1:	88 03                	mov    BYTE PTR [rbx],al
     135a6c3:	88 83 98 02 00 00    	mov    BYTE PTR [rbx+0x298],al
     135a6c9:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     135a6ce:	e8 f9 40 74 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     135a6d3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135a6da:	00 00 
     135a6dc:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
     135a6e1:	75 47                	jne    135a72a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19fcae>
     135a6e3:	48 83 c4 58          	add    rsp,0x58
     135a6e7:	5b                   	pop    rbx
     135a6e8:	41 5c                	pop    r12
     135a6ea:	41 5d                	pop    r13
     135a6ec:	41 5e                	pop    r14
     135a6ee:	41 5f                	pop    r15
     135a6f0:	5d                   	pop    rbp
     135a6f1:	c3                   	ret
     135a6f2:	48 89 df             	mov    rdi,rbx
     135a6f5:	48 89 c6             	mov    rsi,rax
     135a6f8:	e8 07 dd ff ff       	call   1358404 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d988>
     135a6fd:	eb ca                	jmp    135a6c9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19fc4d>
     135a6ff:	eb 04                	jmp    135a705 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19fc89>
     135a701:	eb 02                	jmp    135a705 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19fc89>
     135a703:	eb 00                	jmp    135a705 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19fc89>

### 0x135a71b: cmp    rax,QWORD PTR [rsp+0x50]
     135a6ff:	eb 04                	jmp    135a705 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19fc89>
     135a701:	eb 02                	jmp    135a705 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19fc89>
     135a703:	eb 00                	jmp    135a705 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19fc89>
     135a705:	48 89 c3             	mov    rbx,rax
     135a708:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     135a70d:	e8 ba 40 74 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     135a712:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135a719:	00 00 
     135a71b:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
     135a720:	75 08                	jne    135a72a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19fcae>
     135a722:	48 89 df             	mov    rdi,rbx
     135a725:	e8 a6 55 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     135a72a:	e8 81 53 49 00       	call   17efab0 <__stack_chk_fail@plt>
     135a72f:	cc                   	int3
     135a730:	b0 89                	mov    al,0x89
     135a732:	c3                   	ret
     135a733:	cc                   	int3
     135a734:	48 8d 05 c8 ea fd fe 	lea    rax,[rip+0xfffffffffefdeac8]        # 339203 <_ZTSSt12bad_any_cast@@Base-0x56fc5>
     135a73b:	6a 13                	push   0x13
     135a73d:	5a                   	pop    rdx
     135a73e:	c3                   	ret
     135a73f:	cc                   	int3
     135a740:	48 8d 05 e6 26 08 ff 	lea    rax,[rip+0xffffffffff0826e6]        # 3dce2d <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x287c>
     135a747:	6a 02                	push   0x2
     135a749:	5a                   	pop    rdx

### 0x135a7fe: mov    QWORD PTR [rsp+0x50],rcx
     135a7d8:	e8 23 37 49 00       	call   17edf00 <_Znwm@plt>
     135a7dd:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     135a7e1:	48 8d 0d 40 d3 50 00 	lea    rcx,[rip+0x50d340]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>
     135a7e8:	48 89 08             	mov    QWORD PTR [rax],rcx
     135a7eb:	66 0f ef c0          	pxor   xmm0,xmm0
     135a7ef:	66 0f 7f 40 10       	movdqa XMMWORD PTR [rax+0x10],xmm0
     135a7f4:	66 c7 40 20 00 01    	mov    WORD PTR [rax+0x20],0x100
     135a7fa:	48 8d 48 28          	lea    rcx,[rax+0x28]
     135a7fe:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
     135a803:	48 8d 48 50          	lea    rcx,[rax+0x50]
     135a807:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
     135a80e:	00 
     135a80f:	48 83 a0 90 00 00 00 	and    QWORD PTR [rax+0x90],0x0
     135a816:	00 
     135a817:	48 83 a0 c0 00 00 00 	and    QWORD PTR [rax+0xc0],0x0
     135a81e:	00 
     135a81f:	48 8d a8 d0 00 00 00 	lea    rbp,[rax+0xd0]
     135a826:	48 83 a0 d0 00 00 00 	and    QWORD PTR [rax+0xd0],0x0
     135a82d:	00 
     135a82e:	f3 0f 7f 40 28       	movdqu XMMWORD PTR [rax+0x28],xmm0
     135a833:	f3 0f 7f 40 38       	movdqu XMMWORD PTR [rax+0x38],xmm0
     135a838:	f3 0f 7f 40 48       	movdqu XMMWORD PTR [rax+0x48],xmm0
     135a83d:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     135a842:	f3 0f 7f 40 58       	movdqu XMMWORD PTR [rax+0x58],xmm0
     135a847:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]

### 0x135a803: lea    rcx,[rax+0x50]
     135a7dd:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     135a7e1:	48 8d 0d 40 d3 50 00 	lea    rcx,[rip+0x50d340]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>
     135a7e8:	48 89 08             	mov    QWORD PTR [rax],rcx
     135a7eb:	66 0f ef c0          	pxor   xmm0,xmm0
     135a7ef:	66 0f 7f 40 10       	movdqa XMMWORD PTR [rax+0x10],xmm0
     135a7f4:	66 c7 40 20 00 01    	mov    WORD PTR [rax+0x20],0x100
     135a7fa:	48 8d 48 28          	lea    rcx,[rax+0x28]
     135a7fe:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
     135a803:	48 8d 48 50          	lea    rcx,[rax+0x50]
     135a807:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
     135a80e:	00 
     135a80f:	48 83 a0 90 00 00 00 	and    QWORD PTR [rax+0x90],0x0
     135a816:	00 
     135a817:	48 83 a0 c0 00 00 00 	and    QWORD PTR [rax+0xc0],0x0
     135a81e:	00 
     135a81f:	48 8d a8 d0 00 00 00 	lea    rbp,[rax+0xd0]
     135a826:	48 83 a0 d0 00 00 00 	and    QWORD PTR [rax+0xd0],0x0
     135a82d:	00 
     135a82e:	f3 0f 7f 40 28       	movdqu XMMWORD PTR [rax+0x28],xmm0
     135a833:	f3 0f 7f 40 38       	movdqu XMMWORD PTR [rax+0x38],xmm0
     135a838:	f3 0f 7f 40 48       	movdqu XMMWORD PTR [rax+0x48],xmm0
     135a83d:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     135a842:	f3 0f 7f 40 58       	movdqu XMMWORD PTR [rax+0x58],xmm0
     135a847:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     135a84b:	48 83 ec 10          	sub    rsp,0x10

### 0x135a97b: mov    rdi,QWORD PTR [rsp+0x50]
     135a956:	48 83 c7 10          	add    rdi,0x10
     135a95a:	e8 a3 f4 47 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     135a95f:	66 0f ef c0          	pxor   xmm0,xmm0
     135a963:	f3 41 0f 7f 45 78    	movdqu XMMWORD PTR [r13+0x78],xmm0
     135a969:	f3 41 0f 7f 45 68    	movdqu XMMWORD PTR [r13+0x68],xmm0
     135a96f:	48 8d 9c 24 30 02 00 	lea    rbx,[rsp+0x230]
     135a976:	00 
     135a977:	48 83 23 00          	and    QWORD PTR [rbx],0x0
     135a97b:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     135a980:	4c 89 ee             	mov    rsi,r13
     135a983:	e8 72 18 00 00       	call   135c1fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a177e>
     135a988:	48 89 df             	mov    rdi,rbx
     135a98b:	e8 9c 18 00 00       	call   135c22c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a17b0>
     135a990:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135a993:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     135a99a:	00 
     135a99b:	4c 89 f6             	mov    rsi,r14
     135a99e:	ff 50 48             	call   QWORD PTR [rax+0x48]
     135a9a1:	48 8d 35 41 6b 01 ff 	lea    rsi,[rip+0xffffffffff016b41]        # 3714e9 <_ZTSSt12bad_any_cast@@Base-0x1ecdf>
     135a9a8:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
     135a9af:	00 
     135a9b0:	e8 c9 f0 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135a9b5:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135a9b8:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
     135a9bf:	00 

### 0x135aa1f: mov    rax,QWORD PTR [rsp+0x50]
     135aa05:	4c 89 f7             	mov    rdi,r14
     135aa08:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135aa0b:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     135aa12:	00 
     135aa13:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135aa16:	4c 89 f7             	mov    rdi,r14
     135aa19:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135aa1c:	49 89 c7             	mov    r15,rax
     135aa1f:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
     135aa24:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135aa27:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     135aa2c:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135aa2f:	4c 89 f7             	mov    rdi,r14
     135aa32:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135aa35:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135aa38:	4c 89 f7             	mov    rdi,r14
     135aa3b:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135aa3e:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     135aa45:	00 
     135aa46:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     135aa4b:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135aa4e:	48 8d 35 9b b0 0d ff 	lea    rsi,[rip+0xffffffffff0db09b]        # 435af0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b53f>
     135aa55:	48 8d 0d b4 b0 0d ff 	lea    rcx,[rip+0xffffffffff0db0b4]        # 435b10 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b55f>
     135aa5c:	6a 10                	push   0x10
     135aa5e:	41 5e                	pop    r14

### 0x135ad69: movdqu XMMWORD PTR [r12+0x50],xmm0
     135ad44:	48 8b b4 24 e0 00 00 	mov    rsi,QWORD PTR [rsp+0xe0]
     135ad4b:	00 
     135ad4c:	e8 55 eb 28 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
     135ad51:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
     135ad56:	49 89 44 24 40       	mov    QWORD PTR [r12+0x40],rax
     135ad5b:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     135ad60:	49 89 44 24 48       	mov    QWORD PTR [r12+0x48],rax
     135ad65:	66 0f ef c0          	pxor   xmm0,xmm0
     135ad69:	f3 41 0f 7f 44 24 50 	movdqu XMMWORD PTR [r12+0x50],xmm0
     135ad70:	f3 41 0f 7f 44 24 60 	movdqu XMMWORD PTR [r12+0x60],xmm0
     135ad77:	f3 41 0f 7f 44 24 70 	movdqu XMMWORD PTR [r12+0x70],xmm0
     135ad7e:	f3 41 0f 7f 84 24 80 	movdqu XMMWORD PTR [r12+0x80],xmm0
     135ad85:	00 00 00 
     135ad88:	66 49 0f 6e cc       	movq   xmm1,r12
     135ad8d:	66 48 0f 6e c3       	movq   xmm0,rbx
     135ad92:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     135ad98:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
     135ad9d:	48 85 c0             	test   rax,rax
     135ada0:	74 0a                	je     135adac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0330>
     135ada2:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     135ada6:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
     135adaa:	75 34                	jne    135ade0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0364>
     135adac:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
     135adb2:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
     135adb8:	49 89 5c 24 20       	mov    QWORD PTR [r12+0x20],rbx

### 0x135b22f: movaps xmm0,XMMWORD PTR [rcx+0x50]
     135b211:	0f 29 84 24 60 02 00 	movaps XMMWORD PTR [rsp+0x260],xmm0
     135b218:	00 
     135b219:	48 85 c0             	test   rax,rax
     135b21c:	74 05                	je     135b223 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a07a7>
     135b21e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135b223:	48 8b 8c 24 c0 00 00 	mov    rcx,QWORD PTR [rsp+0xc0]
     135b22a:	00 
     135b22b:	48 8b 41 58          	mov    rax,QWORD PTR [rcx+0x58]
     135b22f:	0f 28 41 50          	movaps xmm0,XMMWORD PTR [rcx+0x50]
     135b233:	0f 29 84 24 70 02 00 	movaps XMMWORD PTR [rsp+0x270],xmm0
     135b23a:	00 
     135b23b:	48 85 c0             	test   rax,rax
     135b23e:	74 05                	je     135b245 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a07c9>
     135b240:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135b245:	48 8b 8c 24 b8 00 00 	mov    rcx,QWORD PTR [rsp+0xb8]
     135b24c:	00 
     135b24d:	48 8b 81 88 00 00 00 	mov    rax,QWORD PTR [rcx+0x88]
     135b254:	0f 28 81 80 00 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x80]
     135b25b:	0f 29 84 24 80 02 00 	movaps XMMWORD PTR [rsp+0x280],xmm0
     135b262:	00 
     135b263:	48 85 c0             	test   rax,rax
     135b266:	74 05                	je     135b26d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a07f1>
     135b268:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135b26d:	48 8b 84 24 08 01 00 	mov    rax,QWORD PTR [rsp+0x108]
     135b274:	00 

### 0x135b3b1: movups XMMWORD PTR [r13+0x50],xmm0
     135b392:	41 0f 11 45 40       	movups XMMWORD PTR [r13+0x40],xmm0
     135b397:	48 85 c0             	test   rax,rax
     135b39a:	74 05                	je     135b3a1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0925>
     135b39c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135b3a1:	48 8b 84 24 78 02 00 	mov    rax,QWORD PTR [rsp+0x278]
     135b3a8:	00 
     135b3a9:	0f 28 84 24 70 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x270]
     135b3b0:	00 
     135b3b1:	41 0f 11 45 50       	movups XMMWORD PTR [r13+0x50],xmm0
     135b3b6:	48 85 c0             	test   rax,rax
     135b3b9:	74 05                	je     135b3c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0944>
     135b3bb:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135b3c0:	48 8b 84 24 88 02 00 	mov    rax,QWORD PTR [rsp+0x288]
     135b3c7:	00 
     135b3c8:	0f 28 84 24 80 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x280]
     135b3cf:	00 
     135b3d0:	41 0f 11 45 60       	movups XMMWORD PTR [r13+0x60],xmm0
     135b3d5:	48 85 c0             	test   rax,rax
     135b3d8:	74 05                	je     135b3df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0963>
     135b3da:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135b3df:	48 89 5c 24 28       	mov    QWORD PTR [rsp+0x28],rbx
     135b3e4:	48 8d 84 24 a0 02 00 	lea    rax,[rsp+0x2a0]
     135b3eb:	00 
     135b3ec:	48 8b 48 f8          	mov    rcx,QWORD PTR [rax-0x8]
     135b3f0:	0f 28 40 f0          	movaps xmm0,XMMWORD PTR [rax-0x10]

### 0x135bbff: mov    QWORD PTR [rax+0x50],rcx
     135bbdf:	48 85 c9             	test   rcx,rcx
     135bbe2:	74 05                	je     135bbe9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a116d>
     135bbe4:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     135bbe9:	f3 0f 6f 84 24 c8 01 	movdqu xmm0,XMMWORD PTR [rsp+0x1c8]
     135bbf0:	00 00 
     135bbf2:	f3 0f 7f 40 40       	movdqu XMMWORD PTR [rax+0x40],xmm0
     135bbf7:	48 8b 8c 24 d8 01 00 	mov    rcx,QWORD PTR [rsp+0x1d8]
     135bbfe:	00 
     135bbff:	48 89 48 50          	mov    QWORD PTR [rax+0x50],rcx
     135bc03:	48 85 c9             	test   rcx,rcx
     135bc06:	74 05                	je     135bc0d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1191>
     135bc08:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     135bc0d:	48 89 84 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rax
     135bc14:	00 
     135bc15:	4c 89 b4 24 10 01 00 	mov    QWORD PTR [rsp+0x110],r14
     135bc1c:	00 
     135bc1d:	49 8b 5e 30          	mov    rbx,QWORD PTR [r14+0x30]
     135bc21:	48 89 9c 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rbx
     135bc28:	00 
     135bc29:	4d 8b 66 38          	mov    r12,QWORD PTR [r14+0x38]
     135bc2d:	4c 89 a4 24 20 01 00 	mov    QWORD PTR [rsp+0x120],r12
     135bc34:	00 
     135bc35:	4d 85 e4             	test   r12,r12
     135bc38:	74 06                	je     135bc40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a11c4>
     135bc3a:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]

### 0x135bd23: mov    QWORD PTR [rax+0x50],rbp
     135bd04:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx
     135bd08:	4c 89 68 38          	mov    QWORD PTR [rax+0x38],r13
     135bd0c:	4d 85 ed             	test   r13,r13
     135bd0f:	74 05                	je     135bd16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a129a>
     135bd11:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
     135bd16:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     135bd1b:	48 89 48 40          	mov    QWORD PTR [rax+0x40],rcx
     135bd1f:	4c 89 70 48          	mov    QWORD PTR [rax+0x48],r14
     135bd23:	48 89 68 50          	mov    QWORD PTR [rax+0x50],rbp
     135bd27:	48 85 ed             	test   rbp,rbp
     135bd2a:	74 05                	je     135bd31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a12b5>
     135bd2c:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
     135bd31:	48 8d 9c 24 60 01 00 	lea    rbx,[rsp+0x160]
     135bd38:	00 
     135bd39:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
     135bd3d:	4c 8d a4 24 30 02 00 	lea    r12,[rsp+0x230]
     135bd44:	00 
     135bd45:	4c 8d bc 24 18 02 00 	lea    r15,[rsp+0x218]
     135bd4c:	00 
     135bd4d:	4c 8d ac 24 e0 01 00 	lea    r13,[rsp+0x1e0]
     135bd54:	00 
     135bd55:	4c 89 e7             	mov    rdi,r12
     135bd58:	4c 89 fe             	mov    rsi,r15
     135bd5b:	4c 89 ea             	mov    rdx,r13
     135bd5e:	48 89 d9             	mov    rcx,rbx

### 0x135c129: mov    rdi,QWORD PTR [r12+0x50]
     135c101:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     135c106:	e8 53 0e 10 00       	call   145cf5e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a24e2>
     135c10b:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     135c110:	e8 51 dd 47 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     135c115:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
     135c11a:	e8 47 dd 47 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     135c11f:	49 8b 7c 24 60       	mov    rdi,QWORD PTR [r12+0x60]
     135c124:	e8 5d 23 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135c129:	49 8b 7c 24 50       	mov    rdi,QWORD PTR [r12+0x50]
     135c12e:	e8 53 23 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135c133:	49 8b 7c 24 40       	mov    rdi,QWORD PTR [r12+0x40]
     135c138:	e8 49 23 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135c13d:	49 8b 7c 24 30       	mov    rdi,QWORD PTR [r12+0x30]
     135c142:	e8 3f 23 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135c147:	4c 89 e7             	mov    rdi,r12
     135c14a:	e8 c1 1e 49 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     135c14f:	4c 89 e7             	mov    rdi,r12
     135c152:	e8 c5 22 74 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     135c157:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
     135c15e:	00 
     135c15f:	e8 22 23 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135c164:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     135c16a:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
     135c171:	e8 10 23 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135c176:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]

### 0x135c1c8: mov    rdi,QWORD PTR [rsp+0x50]
     135c1a5:	48 83 c3 30          	add    rbx,0x30
     135c1a9:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
     135c1ae:	e8 cb 00 00 00       	call   135c27e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1802>
     135c1b3:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
     135c1ba:	00 
     135c1bb:	e8 ae c0 82 ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
     135c1c0:	48 89 df             	mov    rdi,rbx
     135c1c3:	e8 48 69 79 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
     135c1c8:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     135c1cd:	e8 5a 00 00 00       	call   135c22c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a17b0>
     135c1d2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135c1d9:	00 00 
     135c1db:	48 3b 84 24 10 0d 00 	cmp    rax,QWORD PTR [rsp+0xd10]
     135c1e2:	00 
     135c1e3:	75 10                	jne    135c1f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1779>
     135c1e5:	4c 89 f7             	mov    rdi,r14
     135c1e8:	e8 33 1d 49 00       	call   17edf20 <_ZdlPv@plt>
     135c1ed:	4c 89 ff             	mov    rdi,r15
     135c1f0:	e8 db 3a 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     135c1f5:	e8 b6 38 49 00       	call   17efab0 <__stack_chk_fail@plt>
     135c1fa:	53                   	push   rbx
     135c1fb:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     135c1fe:	48 89 37             	mov    QWORD PTR [rdi],rsi
     135c201:	48 85 db             	test   rbx,rbx
     135c204:	74 24                	je     135c22a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a17ae>

### 0x135c726: lea    rdi,[rbx+0x50]
     135c704:	48 89 df             	mov    rdi,rbx
     135c707:	e8 c4 35 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     135c70c:	53                   	push   rbx
     135c70d:	48 89 fb             	mov    rbx,rdi
     135c710:	48 8d 05 11 b4 50 00 	lea    rax,[rip+0x50b411]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>
     135c717:	48 89 07             	mov    QWORD PTR [rdi],rax
     135c71a:	48 81 c7 d0 00 00 00 	add    rdi,0xd0
     135c721:	e8 58 fb ff ff       	call   135c27e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1802>
     135c726:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
     135c72a:	e8 3f bb 82 ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
     135c72f:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     135c733:	e8 d8 63 79 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
     135c738:	48 83 c3 28          	add    rbx,0x28
     135c73c:	48 89 df             	mov    rdi,rbx
     135c73f:	5b                   	pop    rbx
     135c740:	e9 e7 fa ff ff       	jmp    135c22c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a17b0>
     135c745:	cc                   	int3
     135c746:	53                   	push   rbx
     135c747:	48 89 fb             	mov    rbx,rdi
     135c74a:	e8 bd ff ff ff       	call   135c70c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1c90>
     135c74f:	48 89 df             	mov    rdi,rbx
     135c752:	5b                   	pop    rbx
     135c753:	e9 c8 17 49 00       	jmp    17edf20 <_ZdlPv@plt>
     135c758:	48 89 f8             	mov    rax,rdi
     135c75b:	48 8b 4e 48          	mov    rcx,QWORD PTR [rsi+0x48]

### 0x135ca66: movups xmm0,XMMWORD PTR [r12+0x50]
     135ca42:	0f 11 84 24 40 02 00 	movups XMMWORD PTR [rsp+0x240],xmm0
     135ca49:	00 
     135ca4a:	41 0f 10 44 24 30    	movups xmm0,XMMWORD PTR [r12+0x30]
     135ca50:	0f 11 84 24 50 02 00 	movups XMMWORD PTR [rsp+0x250],xmm0
     135ca57:	00 
     135ca58:	41 0f 10 44 24 40    	movups xmm0,XMMWORD PTR [r12+0x40]
     135ca5e:	0f 11 84 24 60 02 00 	movups XMMWORD PTR [rsp+0x260],xmm0
     135ca65:	00 
     135ca66:	41 0f 10 44 24 50    	movups xmm0,XMMWORD PTR [r12+0x50]
     135ca6c:	0f 11 84 24 70 02 00 	movups XMMWORD PTR [rsp+0x270],xmm0
     135ca73:	00 
     135ca74:	4c 8b 7d 20          	mov    r15,QWORD PTR [rbp+0x20]
     135ca78:	49 8b 45 18          	mov    rax,QWORD PTR [r13+0x18]
     135ca7c:	41 0f 10 45 10       	movups xmm0,XMMWORD PTR [r13+0x10]
     135ca81:	0f 29 84 24 20 02 00 	movaps XMMWORD PTR [rsp+0x220],xmm0
     135ca88:	00 
     135ca89:	48 85 c0             	test   rax,rax
     135ca8c:	74 05                	je     135ca93 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2017>
     135ca8e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135ca93:	4c 8b 65 40          	mov    r12,QWORD PTR [rbp+0x40]
     135ca97:	4c 8b 6d 30          	mov    r13,QWORD PTR [rbp+0x30]
     135ca9b:	48 8b 7d 38          	mov    rdi,QWORD PTR [rbp+0x38]
     135ca9f:	48 8b 85 90 00 00 00 	mov    rax,QWORD PTR [rbp+0x90]
     135caa6:	48 89 84 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rax
     135caad:	00 

### 0x135cbdf: call   QWORD PTR [rax+0x50]
     135cbc5:	49 89 c6             	mov    r14,rax
     135cbc8:	48 8b bc 24 28 01 00 	mov    rdi,QWORD PTR [rsp+0x128]
     135cbcf:	00 
     135cbd0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135cbd3:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135cbd6:	49 89 c4             	mov    r12,rax
     135cbd9:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     135cbdc:	48 89 df             	mov    rdi,rbx
     135cbdf:	ff 50 50             	call   QWORD PTR [rax+0x50]
     135cbe2:	49 89 c5             	mov    r13,rax
     135cbe5:	48 8b bc 24 20 01 00 	mov    rdi,QWORD PTR [rsp+0x120]
     135cbec:	00 
     135cbed:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135cbf0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135cbf3:	48 89 c3             	mov    rbx,rax
     135cbf6:	48 8d 84 24 d0 01 00 	lea    rax,[rsp+0x1d0]
     135cbfd:	00 
     135cbfe:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     135cc03:	0f 57 c0             	xorps  xmm0,xmm0
     135cc06:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
     135cc09:	48 89 84 24 00 03 00 	mov    QWORD PTR [rsp+0x300],rax
     135cc10:	00 
     135cc11:	c6 84 24 08 03 00 00 	mov    BYTE PTR [rsp+0x308],0x0
     135cc18:	00 
     135cc19:	6a 20                	push   0x20

### 0x135cde2: mov    QWORD PTR [rsp+0x50],rax
     135cdc0:	48 8b 84 24 38 01 00 	mov    rax,QWORD PTR [rsp+0x138]
     135cdc7:	00 
     135cdc8:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     135cdcd:	48 8b 84 24 80 01 00 	mov    rax,QWORD PTR [rsp+0x180]
     135cdd4:	00 
     135cdd5:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     135cdda:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
     135cde1:	00 
     135cde2:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     135cde7:	48 8b 84 24 90 01 00 	mov    rax,QWORD PTR [rsp+0x190]
     135cdee:	00 
     135cdef:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     135cdf4:	48 8b 84 24 58 01 00 	mov    rax,QWORD PTR [rsp+0x158]
     135cdfb:	00 
     135cdfc:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     135ce01:	48 8b 84 24 60 01 00 	mov    rax,QWORD PTR [rsp+0x160]
     135ce08:	00 
     135ce09:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     135ce0e:	48 8b 84 24 68 01 00 	mov    rax,QWORD PTR [rsp+0x168]
     135ce15:	00 
     135ce16:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     135ce1b:	4c 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],r9
     135ce20:	48 8b 84 24 40 01 00 	mov    rax,QWORD PTR [rsp+0x140]
     135ce27:	00 
     135ce28:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax

### 0x135d097: mov    BYTE PTR [rdi+0x50],al
     135d078:	48 89 84 24 20 10 00 	mov    QWORD PTR [rsp+0x1020],rax
     135d07f:	00 
     135d080:	31 c0                	xor    eax,eax
     135d082:	88 47 08             	mov    BYTE PTR [rdi+0x8],al
     135d085:	4c 8d 05 0c ac 50 00 	lea    r8,[rip+0x50ac0c]        # 1867c98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24380>
     135d08c:	4c 89 07             	mov    QWORD PTR [rdi],r8
     135d08f:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     135d094:	88 47 18             	mov    BYTE PTR [rdi+0x18],al
     135d097:	88 47 50             	mov    BYTE PTR [rdi+0x50],al
     135d09a:	88 47 68             	mov    BYTE PTR [rdi+0x68],al
     135d09d:	83 67 78 00          	and    DWORD PTR [rdi+0x78],0x0
     135d0a1:	66 0f ef c0          	pxor   xmm0,xmm0
     135d0a5:	f3 0f 7f 47 20       	movdqu XMMWORD PTR [rdi+0x20],xmm0
     135d0aa:	f3 0f 7f 47 30       	movdqu XMMWORD PTR [rdi+0x30],xmm0
     135d0af:	f3 0f 7f 47 3d       	movdqu XMMWORD PTR [rdi+0x3d],xmm0
     135d0b4:	f3 0f 7f 87 80 00 00 	movdqu XMMWORD PTR [rdi+0x80],xmm0
     135d0bb:	00 
     135d0bc:	f3 0f 7f 87 90 00 00 	movdqu XMMWORD PTR [rdi+0x90],xmm0
     135d0c3:	00 
     135d0c4:	f3 0f 7f 87 a0 00 00 	movdqu XMMWORD PTR [rdi+0xa0],xmm0
     135d0cb:	00 
     135d0cc:	f3 0f 7f 87 b0 00 00 	movdqu XMMWORD PTR [rdi+0xb0],xmm0
     135d0d3:	00 
     135d0d4:	f3 0f 7f 87 c0 00 00 	movdqu XMMWORD PTR [rdi+0xc0],xmm0
     135d0db:	00 

### 0x135d4e7: mov    DWORD PTR [rsp+0x50],eax
     135d4c7:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d4ca:	e8 43 f5 95 ff       	call   cbca12 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2099b2>
     135d4cf:	89 44 24 40          	mov    DWORD PTR [rsp+0x40],eax
     135d4d3:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d4d6:	e8 fb f7 95 ff       	call   cbccd6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x209c76>
     135d4db:	89 44 24 58          	mov    DWORD PTR [rsp+0x58],eax
     135d4df:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d4e2:	e8 b3 fa 95 ff       	call   cbcf9a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x209f3a>
     135d4e7:	89 44 24 50          	mov    DWORD PTR [rsp+0x50],eax
     135d4eb:	6a 10                	push   0x10
     135d4ed:	5f                   	pop    rdi
     135d4ee:	e8 0d 0a 49 00       	call   17edf00 <_Znwm@plt>
     135d4f3:	49 89 c6             	mov    r14,rax
     135d4f6:	48 8d 35 75 a1 00 ff 	lea    rsi,[rip+0xffffffffff00a175]        # 367672 <_ZTSSt12bad_any_cast@@Base-0x28b56>
     135d4fd:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
     135d504:	00 
     135d505:	e8 74 c5 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135d50a:	48 8d 94 24 d0 0a 00 	lea    rdx,[rsp+0xad0]
     135d511:	00 
     135d512:	48 83 62 20 00       	and    QWORD PTR [rdx+0x20],0x0
     135d517:	48 8d b4 24 a0 05 00 	lea    rsi,[rsp+0x5a0]
     135d51e:	00 
     135d51f:	4c 89 f7             	mov    rdi,r14
     135d522:	e8 fd 53 2b 00       	call   1612924 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda92>
     135d527:	48 8d 9c 24 60 0f 00 	lea    rbx,[rsp+0xf60]

### 0x135db10: mov    eax,DWORD PTR [rsp+0x50]
     135daed:	00 00 00 
     135daf0:	49 89 44 24 c8       	mov    QWORD PTR [r12-0x38],rax
     135daf5:	41 c7 44 24 d0 fa 00 	mov    DWORD PTR [r12-0x30],0xfa
     135dafc:	00 00 
     135dafe:	8b 44 24 40          	mov    eax,DWORD PTR [rsp+0x40]
     135db02:	41 88 44 24 d4       	mov    BYTE PTR [r12-0x2c],al
     135db07:	8b 44 24 58          	mov    eax,DWORD PTR [rsp+0x58]
     135db0b:	41 88 44 24 d5       	mov    BYTE PTR [r12-0x2b],al
     135db10:	8b 44 24 50          	mov    eax,DWORD PTR [rsp+0x50]
     135db14:	41 88 44 24 d6       	mov    BYTE PTR [r12-0x2a],al
     135db19:	66 bb 01 01          	mov    bx,0x101
     135db1d:	66 41 89 5c 24 d7    	mov    WORD PTR [r12-0x29],bx
     135db23:	41 c6 44 24 d9 01    	mov    BYTE PTR [r12-0x27],0x1
     135db29:	f3 0f 7e 05 8f f5 02 	movq   xmm0,QWORD PTR [rip+0xffffffffff02f58f]        # 38d0c0 <_ZTSSt12bad_any_cast@@Base-0x3108>
     135db30:	ff 
     135db31:	66 41 0f d6 44 24 dc 	movq   QWORD PTR [r12-0x24],xmm0
     135db38:	49 c7 44 24 e8 d0 07 	mov    QWORD PTR [r12-0x18],0x7d0
     135db3f:	00 00 
     135db41:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
     135db48:	00 
     135db49:	49 89 44 24 f0       	mov    QWORD PTR [r12-0x10],rax
     135db4e:	48 8d b4 24 e0 08 00 	lea    rsi,[rsp+0x8e0]
     135db55:	00 
     135db56:	4c 89 e7             	mov    rdi,r12
     135db59:	e8 40 14 97 ff       	call   ccef9e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21bf3e>

### 0x135e57b: movdqa XMMWORD PTR [r12+0x50],xmm0
     135e552:	e8 39 bd 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135e557:	48 8d 05 1a a7 50 00 	lea    rax,[rip+0x50a71a]        # 1868c78 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x25360>
     135e55e:	49 89 04 24          	mov    QWORD PTR [r12],rax
     135e562:	66 0f ef c0          	pxor   xmm0,xmm0
     135e566:	f3 41 0f 7f 44 24 08 	movdqu XMMWORD PTR [r12+0x8],xmm0
     135e56d:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
     135e572:	e8 35 aa cf ff       	call   1058fac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2203c2>
     135e577:	66 0f ef c0          	pxor   xmm0,xmm0
     135e57b:	66 41 0f 7f 44 24 50 	movdqa XMMWORD PTR [r12+0x50],xmm0
     135e582:	66 41 0f 7f 44 24 40 	movdqa XMMWORD PTR [r12+0x40],xmm0
     135e589:	f3 41 0f 7f 44 24 28 	movdqu XMMWORD PTR [r12+0x28],xmm0
     135e590:	41 83 64 24 38 00    	and    DWORD PTR [r12+0x38],0x0
     135e596:	41 c7 44 24 60 00 00 	mov    DWORD PTR [r12+0x60],0x3f800000
     135e59d:	80 3f 
     135e59f:	31 db                	xor    ebx,ebx
     135e5a1:	41 88 5c 24 68       	mov    BYTE PTR [r12+0x68],bl
     135e5a6:	41 88 9c 24 98 00 00 	mov    BYTE PTR [r12+0x98],bl
     135e5ad:	00 
     135e5ae:	48 8b 84 24 70 10 00 	mov    rax,QWORD PTR [rsp+0x1070]
     135e5b5:	00 
     135e5b6:	49 89 84 24 a0 00 00 	mov    QWORD PTR [r12+0xa0],rax
     135e5bd:	00 
     135e5be:	48 8b 84 24 90 10 00 	mov    rax,QWORD PTR [rsp+0x1090]
     135e5c5:	00 
     135e5c6:	49 89 84 24 a8 00 00 	mov    QWORD PTR [r12+0xa8],rax

### 0x135ed33: movdqa XMMWORD PTR [rbx+0x50],xmm0
     135ed16:	00 
     135ed17:	4c 89 ac 24 f0 0a 00 	mov    QWORD PTR [rsp+0xaf0],r13
     135ed1e:	00 
     135ed1f:	48 8d 73 10          	lea    rsi,[rbx+0x10]
     135ed23:	48 89 73 30          	mov    QWORD PTR [rbx+0x30],rsi
     135ed27:	4c 89 ef             	mov    rdi,r13
     135ed2a:	e8 01 2e 04 00       	call   13a1b30 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e70b4>
     135ed2f:	66 0f ef c0          	pxor   xmm0,xmm0
     135ed33:	66 0f 7f 43 50       	movdqa XMMWORD PTR [rbx+0x50],xmm0
     135ed38:	48 83 63 60 00       	and    QWORD PTR [rbx+0x60],0x0
     135ed3d:	66 0f 7f 43 40       	movdqa XMMWORD PTR [rbx+0x40],xmm0
     135ed42:	48 89 d8             	mov    rax,rbx
     135ed45:	48 83 c0 68          	add    rax,0x68
     135ed49:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
     135ed4d:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
     135ed51:	48 83 a3 98 00 00 00 	and    QWORD PTR [rbx+0x98],0x0
     135ed58:	00 
     135ed59:	f3 0f 7f 43 78       	movdqu XMMWORD PTR [rbx+0x78],xmm0
     135ed5e:	f3 0f 7f 83 88 00 00 	movdqu XMMWORD PTR [rbx+0x88],xmm0
     135ed65:	00 
     135ed66:	c7 83 a0 00 00 00 00 	mov    DWORD PTR [rbx+0xa0],0x3f800000
     135ed6d:	00 80 3f 
     135ed70:	6a 64                	push   0x64
     135ed72:	58                   	pop    rax
     135ed73:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax

### 0x135ee31: movdqa XMMWORD PTR [rbx+0x50],xmm0
     135ee14:	00 
     135ee15:	4c 89 ac 24 f0 0a 00 	mov    QWORD PTR [rsp+0xaf0],r13
     135ee1c:	00 
     135ee1d:	48 8d 73 10          	lea    rsi,[rbx+0x10]
     135ee21:	48 89 73 30          	mov    QWORD PTR [rbx+0x30],rsi
     135ee25:	4c 89 ef             	mov    rdi,r13
     135ee28:	e8 39 4d 04 00       	call   13a3b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e90ea>
     135ee2d:	66 0f ef c0          	pxor   xmm0,xmm0
     135ee31:	66 0f 7f 43 50       	movdqa XMMWORD PTR [rbx+0x50],xmm0
     135ee36:	48 83 63 60 00       	and    QWORD PTR [rbx+0x60],0x0
     135ee3b:	66 0f 7f 43 40       	movdqa XMMWORD PTR [rbx+0x40],xmm0
     135ee40:	48 89 d8             	mov    rax,rbx
     135ee43:	48 83 c0 68          	add    rax,0x68
     135ee47:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
     135ee4b:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
     135ee4f:	48 83 a3 98 00 00 00 	and    QWORD PTR [rbx+0x98],0x0
     135ee56:	00 
     135ee57:	f3 0f 7f 43 78       	movdqu XMMWORD PTR [rbx+0x78],xmm0
     135ee5c:	f3 0f 7f 83 88 00 00 	movdqu XMMWORD PTR [rbx+0x88],xmm0
     135ee63:	00 
     135ee64:	c7 83 a0 00 00 00 00 	mov    DWORD PTR [rbx+0xa0],0x3f800000
     135ee6b:	00 80 3f 
     135ee6e:	6a 64                	push   0x64
     135ee70:	58                   	pop    rax
     135ee71:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax

### 0x135ef50: mov    eax,DWORD PTR [rsp+0x50]
     135ef27:	48 89 84 24 58 03 00 	mov    QWORD PTR [rsp+0x358],rax
     135ef2e:	00 
     135ef2f:	c7 84 24 60 03 00 00 	mov    DWORD PTR [rsp+0x360],0xfa
     135ef36:	fa 00 00 00 
     135ef3a:	8b 44 24 40          	mov    eax,DWORD PTR [rsp+0x40]
     135ef3e:	88 84 24 64 03 00 00 	mov    BYTE PTR [rsp+0x364],al
     135ef45:	8b 44 24 58          	mov    eax,DWORD PTR [rsp+0x58]
     135ef49:	88 84 24 65 03 00 00 	mov    BYTE PTR [rsp+0x365],al
     135ef50:	8b 44 24 50          	mov    eax,DWORD PTR [rsp+0x50]
     135ef54:	88 84 24 66 03 00 00 	mov    BYTE PTR [rsp+0x366],al
     135ef5b:	66 c7 84 24 67 03 00 	mov    WORD PTR [rsp+0x367],0x101
     135ef62:	00 01 01 
     135ef65:	c6 84 24 69 03 00 00 	mov    BYTE PTR [rsp+0x369],0x1
     135ef6c:	01 
     135ef6d:	f3 0f 7e 05 4b e1 02 	movq   xmm0,QWORD PTR [rip+0xffffffffff02e14b]        # 38d0c0 <_ZTSSt12bad_any_cast@@Base-0x3108>
     135ef74:	ff 
     135ef75:	66 0f d6 84 24 6c 03 	movq   QWORD PTR [rsp+0x36c],xmm0
     135ef7c:	00 00 
     135ef7e:	48 c7 84 24 78 03 00 	mov    QWORD PTR [rsp+0x378],0x7d0
     135ef85:	00 d0 07 00 00 
     135ef8a:	8a 45 04             	mov    al,BYTE PTR [rbp+0x4]
     135ef8d:	88 84 24 80 03 00 00 	mov    BYTE PTR [rsp+0x380],al
     135ef94:	48 8b 45 38          	mov    rax,QWORD PTR [rbp+0x38]
     135ef98:	48 8d b4 24 f0 02 00 	lea    rsi,[rsp+0x2f0]
     135ef9f:	00 

### 0x135f29e: mov    QWORD PTR [rsp+0x50],rax
     135f280:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135f283:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     135f288:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     135f28f:	00 
     135f290:	48 8b 28             	mov    rbp,QWORD PTR [rax]
     135f293:	48 8b 84 24 c0 00 00 	mov    rax,QWORD PTR [rsp+0xc0]
     135f29a:	00 
     135f29b:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135f29e:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     135f2a3:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     135f2aa:	00 
     135f2ab:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135f2ae:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     135f2b3:	bf d0 0b 00 00       	mov    edi,0xbd0
     135f2b8:	e8 43 ec 48 00       	call   17edf00 <_Znwm@plt>
     135f2bd:	49 89 c6             	mov    r14,rax
     135f2c0:	48 8b 84 24 78 10 00 	mov    rax,QWORD PTR [rsp+0x1078]
     135f2c7:	00 
     135f2c8:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
     135f2cc:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     135f2d2:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     135f2d6:	48 85 c0             	test   rax,rax
     135f2d9:	74 05                	je     135f2e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4864>
     135f2db:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135f2e0:	48 89 5c 24 30       	mov    QWORD PTR [rsp+0x30],rbx

### 0x135f838: mov    rax,QWORD PTR [rsp+0x50]
     135f812:	48 89 43 b8          	mov    QWORD PTR [rbx-0x48],rax
     135f816:	49 8b 86 38 07 00 00 	mov    rax,QWORD PTR [r14+0x738]
     135f81d:	48 89 43 c0          	mov    QWORD PTR [rbx-0x40],rax
     135f821:	48 8b 84 24 00 11 00 	mov    rax,QWORD PTR [rsp+0x1100]
     135f828:	00 
     135f829:	48 89 43 c8          	mov    QWORD PTR [rbx-0x38],rax
     135f82d:	49 8b 86 c8 00 00 00 	mov    rax,QWORD PTR [r14+0xc8]
     135f834:	48 89 43 d0          	mov    QWORD PTR [rbx-0x30],rax
     135f838:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
     135f83d:	48 89 43 d8          	mov    QWORD PTR [rbx-0x28],rax
     135f841:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     135f847:	66 0f 7f 43 e0       	movdqa XMMWORD PTR [rbx-0x20],xmm0
     135f84c:	48 8b 84 24 20 11 00 	mov    rax,QWORD PTR [rsp+0x1120]
     135f853:	00 
     135f854:	48 89 43 f0          	mov    QWORD PTR [rbx-0x10],rax
     135f858:	48 89 df             	mov    rdi,rbx
     135f85b:	4c 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],r15
     135f860:	4c 89 fe             	mov    rsi,r15
     135f863:	e8 28 aa 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135f868:	4d 8d a6 80 07 00 00 	lea    r12,[r14+0x780]
     135f86f:	4c 8d bc 24 a0 0f 00 	lea    r15,[rsp+0xfa0]
     135f876:	00 
     135f877:	49 8b 86 70 07 00 00 	mov    rax,QWORD PTR [r14+0x770]
     135f87e:	49 89 47 50          	mov    QWORD PTR [r15+0x50],rax
     135f882:	41 0f 10 46 58       	movups xmm0,XMMWORD PTR [r14+0x58]

### 0x135f85b: mov    QWORD PTR [rsp+0x50],r15
     135f838:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
     135f83d:	48 89 43 d8          	mov    QWORD PTR [rbx-0x28],rax
     135f841:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     135f847:	66 0f 7f 43 e0       	movdqa XMMWORD PTR [rbx-0x20],xmm0
     135f84c:	48 8b 84 24 20 11 00 	mov    rax,QWORD PTR [rsp+0x1120]
     135f853:	00 
     135f854:	48 89 43 f0          	mov    QWORD PTR [rbx-0x10],rax
     135f858:	48 89 df             	mov    rdi,rbx
     135f85b:	4c 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],r15
     135f860:	4c 89 fe             	mov    rsi,r15
     135f863:	e8 28 aa 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135f868:	4d 8d a6 80 07 00 00 	lea    r12,[r14+0x780]
     135f86f:	4c 8d bc 24 a0 0f 00 	lea    r15,[rsp+0xfa0]
     135f876:	00 
     135f877:	49 8b 86 70 07 00 00 	mov    rax,QWORD PTR [r14+0x770]
     135f87e:	49 89 47 50          	mov    QWORD PTR [r15+0x50],rax
     135f882:	41 0f 10 46 58       	movups xmm0,XMMWORD PTR [r14+0x58]
     135f887:	41 0f 10 4e 68       	movups xmm1,XMMWORD PTR [r14+0x68]
     135f88c:	41 0f 11 47 58       	movups XMMWORD PTR [r15+0x58],xmm0
     135f891:	41 0f 11 4f 68       	movups XMMWORD PTR [r15+0x68],xmm1
     135f896:	49 8b 46 78          	mov    rax,QWORD PTR [r14+0x78]
     135f89a:	49 89 47 78          	mov    QWORD PTR [r15+0x78],rax
     135f89e:	41 0f 28 47 c0       	movaps xmm0,XMMWORD PTR [r15-0x40]
     135f8a3:	41 0f 28 4f d0       	movaps xmm1,XMMWORD PTR [r15-0x30]
     135f8a8:	41 0f 28 57 e0       	movaps xmm2,XMMWORD PTR [r15-0x20]

### 0x135f87e: mov    QWORD PTR [r15+0x50],rax
     135f858:	48 89 df             	mov    rdi,rbx
     135f85b:	4c 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],r15
     135f860:	4c 89 fe             	mov    rsi,r15
     135f863:	e8 28 aa 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135f868:	4d 8d a6 80 07 00 00 	lea    r12,[r14+0x780]
     135f86f:	4c 8d bc 24 a0 0f 00 	lea    r15,[rsp+0xfa0]
     135f876:	00 
     135f877:	49 8b 86 70 07 00 00 	mov    rax,QWORD PTR [r14+0x770]
     135f87e:	49 89 47 50          	mov    QWORD PTR [r15+0x50],rax
     135f882:	41 0f 10 46 58       	movups xmm0,XMMWORD PTR [r14+0x58]
     135f887:	41 0f 10 4e 68       	movups xmm1,XMMWORD PTR [r14+0x68]
     135f88c:	41 0f 11 47 58       	movups XMMWORD PTR [r15+0x58],xmm0
     135f891:	41 0f 11 4f 68       	movups XMMWORD PTR [r15+0x68],xmm1
     135f896:	49 8b 46 78          	mov    rax,QWORD PTR [r14+0x78]
     135f89a:	49 89 47 78          	mov    QWORD PTR [r15+0x78],rax
     135f89e:	41 0f 28 47 c0       	movaps xmm0,XMMWORD PTR [r15-0x40]
     135f8a3:	41 0f 28 4f d0       	movaps xmm1,XMMWORD PTR [r15-0x30]
     135f8a8:	41 0f 28 57 e0       	movaps xmm2,XMMWORD PTR [r15-0x20]
     135f8ad:	41 0f 28 5f f0       	movaps xmm3,XMMWORD PTR [r15-0x10]
     135f8b2:	41 0f 29 5c 24 30    	movaps XMMWORD PTR [r12+0x30],xmm3
     135f8b8:	41 0f 29 54 24 20    	movaps XMMWORD PTR [r12+0x20],xmm2
     135f8be:	41 0f 29 4c 24 10    	movaps XMMWORD PTR [r12+0x10],xmm1
     135f8c4:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
     135f8c9:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
     135f8cd:	41 0f 29 86 c0 07 00 	movaps XMMWORD PTR [r14+0x7c0],xmm0

### 0x135f8f6: movdqa xmm0,XMMWORD PTR [r15+0x50]
     135f8d4:	00 
     135f8d5:	0f 57 c0             	xorps  xmm0,xmm0
     135f8d8:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
     135f8dc:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     135f8e0:	49 89 86 d0 07 00 00 	mov    QWORD PTR [r14+0x7d0],rax
     135f8e7:	49 8d be e0 07 00 00 	lea    rdi,[r14+0x7e0]
     135f8ee:	48 89 de             	mov    rsi,rbx
     135f8f1:	e8 e4 3c 97 ff       	call   cd35da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22057a>
     135f8f6:	66 41 0f 6f 47 50    	movdqa xmm0,XMMWORD PTR [r15+0x50]
     135f8fc:	41 0f 28 4f 60       	movaps xmm1,XMMWORD PTR [r15+0x60]
     135f901:	41 0f 28 57 70       	movaps xmm2,XMMWORD PTR [r15+0x70]
     135f906:	41 0f 29 96 30 08 00 	movaps XMMWORD PTR [r14+0x830],xmm2
     135f90d:	00 
     135f90e:	41 0f 29 8e 20 08 00 	movaps XMMWORD PTR [r14+0x820],xmm1
     135f915:	00 
     135f916:	66 41 0f 7f 86 10 08 	movdqa XMMWORD PTR [r14+0x810],xmm0
     135f91d:	00 00 
     135f91f:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     135f926:	00 
     135f927:	e8 de 60 00 00       	call   1365a0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aaf8e>
     135f92c:	4d 8d be 40 08 00 00 	lea    r15,[r14+0x840]
     135f933:	48 8b 84 24 c0 0a 00 	mov    rax,QWORD PTR [rsp+0xac0]
     135f93a:	00 
     135f93b:	48 85 c0             	test   rax,rax
     135f93e:	74 23                	je     135f963 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4ee7>

### 0x136035f: mov    rdi,QWORD PTR [rsp+0x50]
     136032d:	49 8d 86 e8 05 00 00 	lea    rax,[r14+0x5e8]
     1360334:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     1360339:	4d 8d ae 30 06 00 00 	lea    r13,[r14+0x630]
     1360340:	49 8d ae 50 06 00 00 	lea    rbp,[r14+0x650]
     1360347:	4d 8d be 98 06 00 00 	lea    r15,[r14+0x698]
     136034e:	4d 8d a6 b8 06 00 00 	lea    r12,[r14+0x6b8]
     1360355:	4c 89 f3             	mov    rbx,r14
     1360358:	48 81 c3 38 07 00 00 	add    rbx,0x738
     136035f:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     1360364:	e8 01 9c 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1360369:	48 89 df             	mov    rdi,rbx
     136036c:	e8 b7 9a 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360371:	49 8b be 28 07 00 00 	mov    rdi,QWORD PTR [r14+0x728]
     1360378:	e8 f9 e3 73 ff       	call   a9e776 <JNI_OnUnload@@Base+0x26043>
     136037d:	4c 89 e7             	mov    rdi,r12
     1360380:	e8 2d 6e 00 00       	call   13671b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac736>
     1360385:	49 8b be a8 06 00 00 	mov    rdi,QWORD PTR [r14+0x6a8]
     136038c:	e8 2d 6e 00 00       	call   13671be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac742>
     1360391:	4c 89 ff             	mov    rdi,r15
     1360394:	e8 8f 9a 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360399:	49 8b be 88 06 00 00 	mov    rdi,QWORD PTR [r14+0x688]
     13603a0:	e8 e1 e0 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13603a5:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
     13603aa:	e8 47 42 9c ff       	call   d245f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x271596>
     13603af:	48 89 ef             	mov    rdi,rbp

### 0x1360c8e: lea    rdi,[r14+0x50]
     1360c7e:	41 56                	push   r14
     1360c80:	53                   	push   rbx
     1360c81:	50                   	push   rax
     1360c82:	48 89 f3             	mov    rbx,rsi
     1360c85:	49 89 fe             	mov    r14,rdi
     1360c88:	6a 09                	push   0x9
     1360c8a:	59                   	pop    rcx
     1360c8b:	f3 48 a5             	rep movs QWORD PTR es:[rdi],QWORD PTR ds:[rsi]
     1360c8e:	49 8d 7e 50          	lea    rdi,[r14+0x50]
     1360c92:	48 8d 73 50          	lea    rsi,[rbx+0x50]
     1360c96:	e8 03 e3 96 ff       	call   ccef9e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21bf3e>
     1360c9b:	48 8b 83 10 01 00 00 	mov    rax,QWORD PTR [rbx+0x110]
     1360ca2:	49 89 86 10 01 00 00 	mov    QWORD PTR [r14+0x110],rax
     1360ca9:	48 83 c4 08          	add    rsp,0x8
     1360cad:	5b                   	pop    rbx
     1360cae:	41 5e                	pop    r14
     1360cb0:	c3                   	ret
     1360cb1:	cc                   	int3
     1360cb2:	53                   	push   rbx
     1360cb3:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     1360cb6:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     1360cba:	48 85 db             	test   rbx,rbx
     1360cbd:	74 11                	je     1360cd0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6254>
     1360cbf:	48 89 df             	mov    rdi,rbx
     1360cc2:	e8 2d d9 0c 00       	call   142e5f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273b78>

### 0x1360c92: lea    rsi,[rbx+0x50]
     1360c80:	53                   	push   rbx
     1360c81:	50                   	push   rax
     1360c82:	48 89 f3             	mov    rbx,rsi
     1360c85:	49 89 fe             	mov    r14,rdi
     1360c88:	6a 09                	push   0x9
     1360c8a:	59                   	pop    rcx
     1360c8b:	f3 48 a5             	rep movs QWORD PTR es:[rdi],QWORD PTR ds:[rsi]
     1360c8e:	49 8d 7e 50          	lea    rdi,[r14+0x50]
     1360c92:	48 8d 73 50          	lea    rsi,[rbx+0x50]
     1360c96:	e8 03 e3 96 ff       	call   ccef9e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21bf3e>
     1360c9b:	48 8b 83 10 01 00 00 	mov    rax,QWORD PTR [rbx+0x110]
     1360ca2:	49 89 86 10 01 00 00 	mov    QWORD PTR [r14+0x110],rax
     1360ca9:	48 83 c4 08          	add    rsp,0x8
     1360cad:	5b                   	pop    rbx
     1360cae:	41 5e                	pop    r14
     1360cb0:	c3                   	ret
     1360cb1:	cc                   	int3
     1360cb2:	53                   	push   rbx
     1360cb3:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     1360cb6:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     1360cba:	48 85 db             	test   rbx,rbx
     1360cbd:	74 11                	je     1360cd0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6254>
     1360cbf:	48 89 df             	mov    rdi,rbx
     1360cc2:	e8 2d d9 0c 00       	call   142e5f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273b78>
     1360cc7:	48 89 df             	mov    rdi,rbx

### 0x1360f1b: mov    rcx,QWORD PTR [r14+0x50]
     1360f06:	e8 a5 eb 48 00       	call   17efab0 <__stack_chk_fail@plt>
     1360f0b:	cc                   	int3
     1360f0c:	41 56                	push   r14
     1360f0e:	53                   	push   rbx
     1360f0f:	50                   	push   rax
     1360f10:	49 89 f6             	mov    r14,rsi
     1360f13:	48 89 fb             	mov    rbx,rdi
     1360f16:	e8 19 40 8e ff       	call   c44f34 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x191ed4>
     1360f1b:	49 8b 4e 50          	mov    rcx,QWORD PTR [r14+0x50]
     1360f1f:	48 85 c9             	test   rcx,rcx
     1360f22:	74 13                	je     1360f37 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64bb>
     1360f24:	49 8d 46 50          	lea    rax,[r14+0x50]
     1360f28:	49 83 c6 30          	add    r14,0x30
     1360f2c:	4c 39 f1             	cmp    rcx,r14
     1360f2f:	74 13                	je     1360f44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64c8>
     1360f31:	48 89 4b 50          	mov    QWORD PTR [rbx+0x50],rcx
     1360f35:	eb 07                	jmp    1360f3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64c2>
     1360f37:	48 83 c3 50          	add    rbx,0x50
     1360f3b:	48 89 d8             	mov    rax,rbx
     1360f3e:	48 83 20 00          	and    QWORD PTR [rax],0x0
     1360f42:	eb 11                	jmp    1360f55 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64d9>
     1360f44:	48 8d 73 30          	lea    rsi,[rbx+0x30]
     1360f48:	48 89 73 50          	mov    QWORD PTR [rbx+0x50],rsi
     1360f4c:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     1360f4f:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### 0x1360f24: lea    rax,[r14+0x50]
     1360f0e:	53                   	push   rbx
     1360f0f:	50                   	push   rax
     1360f10:	49 89 f6             	mov    r14,rsi
     1360f13:	48 89 fb             	mov    rbx,rdi
     1360f16:	e8 19 40 8e ff       	call   c44f34 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x191ed4>
     1360f1b:	49 8b 4e 50          	mov    rcx,QWORD PTR [r14+0x50]
     1360f1f:	48 85 c9             	test   rcx,rcx
     1360f22:	74 13                	je     1360f37 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64bb>
     1360f24:	49 8d 46 50          	lea    rax,[r14+0x50]
     1360f28:	49 83 c6 30          	add    r14,0x30
     1360f2c:	4c 39 f1             	cmp    rcx,r14
     1360f2f:	74 13                	je     1360f44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64c8>
     1360f31:	48 89 4b 50          	mov    QWORD PTR [rbx+0x50],rcx
     1360f35:	eb 07                	jmp    1360f3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64c2>
     1360f37:	48 83 c3 50          	add    rbx,0x50
     1360f3b:	48 89 d8             	mov    rax,rbx
     1360f3e:	48 83 20 00          	and    QWORD PTR [rax],0x0
     1360f42:	eb 11                	jmp    1360f55 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64d9>
     1360f44:	48 8d 73 30          	lea    rsi,[rbx+0x30]
     1360f48:	48 89 73 50          	mov    QWORD PTR [rbx+0x50],rsi
     1360f4c:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     1360f4f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1360f52:	ff 50 18             	call   QWORD PTR [rax+0x18]
     1360f55:	48 83 c4 08          	add    rsp,0x8
     1360f59:	5b                   	pop    rbx

### 0x1360f31: mov    QWORD PTR [rbx+0x50],rcx
     1360f16:	e8 19 40 8e ff       	call   c44f34 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x191ed4>
     1360f1b:	49 8b 4e 50          	mov    rcx,QWORD PTR [r14+0x50]
     1360f1f:	48 85 c9             	test   rcx,rcx
     1360f22:	74 13                	je     1360f37 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64bb>
     1360f24:	49 8d 46 50          	lea    rax,[r14+0x50]
     1360f28:	49 83 c6 30          	add    r14,0x30
     1360f2c:	4c 39 f1             	cmp    rcx,r14
     1360f2f:	74 13                	je     1360f44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64c8>
     1360f31:	48 89 4b 50          	mov    QWORD PTR [rbx+0x50],rcx
     1360f35:	eb 07                	jmp    1360f3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64c2>
     1360f37:	48 83 c3 50          	add    rbx,0x50
     1360f3b:	48 89 d8             	mov    rax,rbx
     1360f3e:	48 83 20 00          	and    QWORD PTR [rax],0x0
     1360f42:	eb 11                	jmp    1360f55 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64d9>
     1360f44:	48 8d 73 30          	lea    rsi,[rbx+0x30]
     1360f48:	48 89 73 50          	mov    QWORD PTR [rbx+0x50],rsi
     1360f4c:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     1360f4f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1360f52:	ff 50 18             	call   QWORD PTR [rax+0x18]
     1360f55:	48 83 c4 08          	add    rsp,0x8
     1360f59:	5b                   	pop    rbx
     1360f5a:	41 5e                	pop    r14
     1360f5c:	c3                   	ret
     1360f5d:	48 89 c7             	mov    rdi,rax
     1360f60:	e8 40 8b 71 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

### 0x1360f48: mov    QWORD PTR [rbx+0x50],rsi
     1360f2f:	74 13                	je     1360f44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64c8>
     1360f31:	48 89 4b 50          	mov    QWORD PTR [rbx+0x50],rcx
     1360f35:	eb 07                	jmp    1360f3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64c2>
     1360f37:	48 83 c3 50          	add    rbx,0x50
     1360f3b:	48 89 d8             	mov    rax,rbx
     1360f3e:	48 83 20 00          	and    QWORD PTR [rax],0x0
     1360f42:	eb 11                	jmp    1360f55 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64d9>
     1360f44:	48 8d 73 30          	lea    rsi,[rbx+0x30]
     1360f48:	48 89 73 50          	mov    QWORD PTR [rbx+0x50],rsi
     1360f4c:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     1360f4f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1360f52:	ff 50 18             	call   QWORD PTR [rax+0x18]
     1360f55:	48 83 c4 08          	add    rsp,0x8
     1360f59:	5b                   	pop    rbx
     1360f5a:	41 5e                	pop    r14
     1360f5c:	c3                   	ret
     1360f5d:	48 89 c7             	mov    rdi,rax
     1360f60:	e8 40 8b 71 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1360f65:	cc                   	int3
     1360f66:	41 57                	push   r15
     1360f68:	41 56                	push   r14
     1360f6a:	41 54                	push   r12
     1360f6c:	53                   	push   rbx
     1360f6d:	50                   	push   rax
     1360f6e:	49 89 f6             	mov    r14,rsi

### 0x1360fba: lea    r12,[rdi+0x50]
     1360f9b:	0f 29 4f 20          	movaps XMMWORD PTR [rdi+0x20],xmm1
     1360f9f:	0f 29 47 10          	movaps XMMWORD PTR [rdi+0x10],xmm0
     1360fa3:	48 8b 46 38          	mov    rax,QWORD PTR [rsi+0x38]
     1360fa7:	48 89 47 38          	mov    QWORD PTR [rdi+0x38],rax
     1360fab:	48 8b 46 40          	mov    rax,QWORD PTR [rsi+0x40]
     1360faf:	48 89 47 40          	mov    QWORD PTR [rdi+0x40],rax
     1360fb3:	0f 57 c0             	xorps  xmm0,xmm0
     1360fb6:	0f 11 46 38          	movups XMMWORD PTR [rsi+0x38],xmm0
     1360fba:	4c 8d 67 50          	lea    r12,[rdi+0x50]
     1360fbe:	48 83 c6 50          	add    rsi,0x50
     1360fc2:	4c 89 e7             	mov    rdi,r12
     1360fc5:	e8 b8 1c 92 ff       	call   c82c82 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cfc22>
     1360fca:	be 80 00 00 00       	mov    esi,0x80
     1360fcf:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     1360fd3:	4c 01 f6             	add    rsi,r14
     1360fd6:	e8 0b c0 74 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
     1360fdb:	49 8b 86 40 01 00 00 	mov    rax,QWORD PTR [r14+0x140]
     1360fe2:	48 89 83 40 01 00 00 	mov    QWORD PTR [rbx+0x140],rax
     1360fe9:	0f 57 c0             	xorps  xmm0,xmm0
     1360fec:	0f 11 83 48 01 00 00 	movups XMMWORD PTR [rbx+0x148],xmm0
     1360ff3:	48 83 a3 58 01 00 00 	and    QWORD PTR [rbx+0x158],0x0
     1360ffa:	00 
     1360ffb:	49 8b 86 48 01 00 00 	mov    rax,QWORD PTR [r14+0x148]
     1361002:	48 89 83 48 01 00 00 	mov    QWORD PTR [rbx+0x148],rax
     1361009:	49 8b 86 50 01 00 00 	mov    rax,QWORD PTR [r14+0x150]

### 0x13610de: lea    rdi,[rbx+0x50]
     13610b6:	53                   	push   rbx
     13610b7:	48 89 fb             	mov    rbx,rdi
     13610ba:	48 8b bf a0 02 00 00 	mov    rdi,QWORD PTR [rdi+0x2a0]
     13610c1:	e8 c0 d3 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13610c6:	48 8d bb 48 01 00 00 	lea    rdi,[rbx+0x148]
     13610cd:	e8 1c 68 95 ff       	call   cb78ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20488e>
     13610d2:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
     13610d9:	e8 88 bf 74 ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
     13610de:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
     13610e2:	e8 83 8e 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     13610e7:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
     13610eb:	e8 96 d3 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13610f0:	48 83 c3 08          	add    rbx,0x8
     13610f4:	48 89 df             	mov    rdi,rbx
     13610f7:	5b                   	pop    rbx
     13610f8:	e9 0f 43 47 00       	jmp    17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     13610fd:	cc                   	int3
     13610fe:	53                   	push   rbx
     13610ff:	48 89 fb             	mov    rbx,rdi
     1361102:	48 81 c7 80 00 00 00 	add    rdi,0x80
     1361109:	e8 1a a6 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     136110e:	48 83 c3 68          	add    rbx,0x68
     1361112:	48 89 df             	mov    rdi,rbx
     1361115:	5b                   	pop    rbx
     1361116:	e9 0d a6 71 ff       	jmp    a7b728 <JNI_OnUnload@@Base+0x2ff5>

### 0x1361177: and    WORD PTR [r14+0x50],0x0
     1361155:	48 8d 35 26 e3 fc fe 	lea    rsi,[rip+0xfffffffffefce326]        # 32f482 <_ZTSSt12bad_any_cast@@Base-0x60d46>
     136115c:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     1361161:	4c 89 f7             	mov    rdi,r14
     1361164:	e8 15 89 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1361169:	31 c0                	xor    eax,eax
     136116b:	41 88 46 38          	mov    BYTE PTR [r14+0x38],al
     136116f:	41 88 46 40          	mov    BYTE PTR [r14+0x40],al
     1361173:	41 88 46 48          	mov    BYTE PTR [r14+0x48],al
     1361177:	66 41 83 66 50 00    	and    WORD PTR [r14+0x50],0x0
     136117d:	0f 57 c0             	xorps  xmm0,xmm0
     1361180:	41 0f 11 46 18       	movups XMMWORD PTR [r14+0x18],xmm0
     1361185:	41 0f 11 46 21       	movups XMMWORD PTR [r14+0x21],xmm0
     136118a:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     136118d:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     1361192:	48 89 de             	mov    rsi,rbx
     1361195:	4c 89 f2             	mov    rdx,r14
     1361198:	ff 50 28             	call   QWORD PTR [rax+0x28]
     136119b:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     13611a0:	e8 41 2c 7d ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     13611a5:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     13611aa:	e8 1d d6 73 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     13611af:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13611b6:	00 00 
     13611b8:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
     13611bf:	00 

### 0x1361432: mov    sil,BYTE PTR [rcx+0x50]
     1361413:	00 
     1361414:	48 8b 94 24 08 03 00 	mov    rdx,QWORD PTR [rsp+0x308]
     136141b:	00 
     136141c:	0f 10 49 18          	movups xmm1,XMMWORD PTR [rcx+0x18]
     1361420:	0f 11 8c 24 38 01 00 	movups XMMWORD PTR [rsp+0x138],xmm1
     1361427:	00 
     1361428:	f3 0f 7f 41 18       	movdqu XMMWORD PTR [rcx+0x18],xmm0
     136142d:	48 83 61 28 00       	and    QWORD PTR [rcx+0x28],0x0
     1361432:	40 8a 71 50          	mov    sil,BYTE PTR [rcx+0x50]
     1361436:	40 88 b4 24 70 01 00 	mov    BYTE PTR [rsp+0x170],sil
     136143d:	00 
     136143e:	0f 10 49 30          	movups xmm1,XMMWORD PTR [rcx+0x30]
     1361442:	0f 10 51 40          	movups xmm2,XMMWORD PTR [rcx+0x40]
     1361446:	48 8b 8c 24 00 03 00 	mov    rcx,QWORD PTR [rsp+0x300]
     136144d:	00 
     136144e:	0f 29 94 24 60 01 00 	movaps XMMWORD PTR [rsp+0x160],xmm2
     1361455:	00 
     1361456:	0f 29 8c 24 50 01 00 	movaps XMMWORD PTR [rsp+0x150],xmm1
     136145d:	00 
     136145e:	41 0f 10 08          	movups xmm1,XMMWORD PTR [r8]
     1361462:	0f 29 4c 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm1
     1361467:	f3 0f 10 09          	movss  xmm1,DWORD PTR [rcx]
     136146b:	f3 0f 11 0c 24       	movss  DWORD PTR [rsp],xmm1
     1361470:	8a 0a                	mov    cl,BYTE PTR [rdx]
     1361472:	88 4c 24 08          	mov    BYTE PTR [rsp+0x8],cl

### 0x1361bd6: mov    r8b,BYTE PTR [rdx+0x50]
     1361bb5:	4c 8b 42 28          	mov    r8,QWORD PTR [rdx+0x28]
     1361bb9:	4c 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r8
     1361bc0:	00 
     1361bc1:	0f 10 42 18          	movups xmm0,XMMWORD PTR [rdx+0x18]
     1361bc5:	0f 11 84 24 88 00 00 	movups XMMWORD PTR [rsp+0x88],xmm0
     1361bcc:	00 
     1361bcd:	48 83 62 28 00       	and    QWORD PTR [rdx+0x28],0x0
     1361bd2:	0f 11 52 18          	movups XMMWORD PTR [rdx+0x18],xmm2
     1361bd6:	44 8a 42 50          	mov    r8b,BYTE PTR [rdx+0x50]
     1361bda:	44 88 84 24 c0 00 00 	mov    BYTE PTR [rsp+0xc0],r8b
     1361be1:	00 
     1361be2:	0f 10 42 30          	movups xmm0,XMMWORD PTR [rdx+0x30]
     1361be6:	0f 10 4a 40          	movups xmm1,XMMWORD PTR [rdx+0x40]
     1361bea:	0f 29 8c 24 b0 00 00 	movaps XMMWORD PTR [rsp+0xb0],xmm1
     1361bf1:	00 
     1361bf2:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
     1361bf9:	00 
     1361bfa:	4c 8b 27             	mov    r12,QWORD PTR [rdi]
     1361bfd:	44 8b 36             	mov    r14d,DWORD PTR [rsi]
     1361c00:	8b 09                	mov    ecx,DWORD PTR [rcx]
     1361c02:	89 4c 24 0c          	mov    DWORD PTR [rsp+0xc],ecx
     1361c06:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     1361c09:	48 89 5c 24 30       	mov    QWORD PTR [rsp+0x30],rbx
     1361c0e:	4c 8b 68 08          	mov    r13,QWORD PTR [rax+0x8]
     1361c12:	4c 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],r13

### 0x1361ca3: mov    QWORD PTR [r15+0x50],rax
     1361c80:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
     1361c84:	4d 89 fc             	mov    r12,r15
     1361c87:	49 89 5f 38          	mov    QWORD PTR [r15+0x38],rbx
     1361c8b:	4d 89 6f 40          	mov    QWORD PTR [r15+0x40],r13
     1361c8f:	48 83 64 24 60 00    	and    QWORD PTR [rsp+0x60],0x0
     1361c95:	49 89 6f 48          	mov    QWORD PTR [r15+0x48],rbp
     1361c99:	48 b8 00 00 00 00 00 	movabs rax,0x8000000000000000
     1361ca0:	00 00 80 
     1361ca3:	49 89 47 50          	mov    QWORD PTR [r15+0x50],rax
     1361ca7:	48 b8 00 00 00 00 00 	movabs rax,0x3ff0000000000000
     1361cae:	00 f0 3f 
     1361cb1:	49 89 47 58          	mov    QWORD PTR [r15+0x58],rax
     1361cb5:	49 83 67 60 00       	and    QWORD PTR [r15+0x60],0x0
     1361cba:	6a 01                	push   0x1
     1361cbc:	58                   	pop    rax
     1361cbd:	49 89 47 68          	mov    QWORD PTR [r15+0x68],rax
     1361cc1:	31 c9                	xor    ecx,ecx
     1361cc3:	41 88 4f 70          	mov    BYTE PTR [r15+0x70],cl
     1361cc7:	41 88 8f 80 00 00 00 	mov    BYTE PTR [r15+0x80],cl
     1361cce:	49 83 a7 88 00 00 00 	and    QWORD PTR [r15+0x88],0x0
     1361cd5:	00 
     1361cd6:	49 83 c4 38          	add    r12,0x38
     1361cda:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
     1361cdf:	49 89 87 90 00 00 00 	mov    QWORD PTR [r15+0x90],rax
     1361ce6:	41 88 8f 98 00 00 00 	mov    BYTE PTR [r15+0x98],cl

### 0x1361cda: movaps XMMWORD PTR [rsp+0x50],xmm0
     1361cbc:	58                   	pop    rax
     1361cbd:	49 89 47 68          	mov    QWORD PTR [r15+0x68],rax
     1361cc1:	31 c9                	xor    ecx,ecx
     1361cc3:	41 88 4f 70          	mov    BYTE PTR [r15+0x70],cl
     1361cc7:	41 88 8f 80 00 00 00 	mov    BYTE PTR [r15+0x80],cl
     1361cce:	49 83 a7 88 00 00 00 	and    QWORD PTR [r15+0x88],0x0
     1361cd5:	00 
     1361cd6:	49 83 c4 38          	add    r12,0x38
     1361cda:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
     1361cdf:	49 89 87 90 00 00 00 	mov    QWORD PTR [r15+0x90],rax
     1361ce6:	41 88 8f 98 00 00 00 	mov    BYTE PTR [r15+0x98],cl
     1361ced:	41 88 8f a0 00 00 00 	mov    BYTE PTR [r15+0xa0],cl
     1361cf4:	41 88 8f a8 00 00 00 	mov    BYTE PTR [r15+0xa8],cl
     1361cfb:	41 88 8f b8 00 00 00 	mov    BYTE PTR [r15+0xb8],cl
     1361d02:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1361d05:	6a 01                	push   0x1
     1361d07:	5e                   	pop    rsi
     1361d08:	ff 90 98 01 00 00    	call   QWORD PTR [rax+0x198]
     1361d0e:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     1361d13:	4c 89 3b             	mov    QWORD PTR [rbx],r15
     1361d16:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1361d1b:	e8 08 9a 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     1361d20:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1361d25:	e8 fe 99 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     1361d2a:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]

### 0x1361d16: lea    rdi,[rsp+0x50]
     1361cf4:	41 88 8f a8 00 00 00 	mov    BYTE PTR [r15+0xa8],cl
     1361cfb:	41 88 8f b8 00 00 00 	mov    BYTE PTR [r15+0xb8],cl
     1361d02:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1361d05:	6a 01                	push   0x1
     1361d07:	5e                   	pop    rsi
     1361d08:	ff 90 98 01 00 00    	call   QWORD PTR [rax+0x198]
     1361d0e:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     1361d13:	4c 89 3b             	mov    QWORD PTR [rbx],r15
     1361d16:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1361d1b:	e8 08 9a 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     1361d20:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1361d25:	e8 fe 99 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     1361d2a:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     1361d2f:	e8 98 ca 73 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1361d34:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1361d3b:	00 00 
     1361d3d:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]
     1361d44:	00 
     1361d45:	75 66                	jne    1361dad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a7331>
     1361d47:	48 89 d8             	mov    rax,rbx
     1361d4a:	48 81 c4 d8 00 00 00 	add    rsp,0xd8
     1361d51:	5b                   	pop    rbx
     1361d52:	41 5c                	pop    r12
     1361d54:	41 5d                	pop    r13
     1361d56:	41 5e                	pop    r14

### 0x1361d67: lea    rdi,[rsp+0x50]
     1361d54:	41 5d                	pop    r13
     1361d56:	41 5e                	pop    r14
     1361d58:	41 5f                	pop    r15
     1361d5a:	5d                   	pop    rbp
     1361d5b:	c3                   	ret
     1361d5c:	48 89 c3             	mov    rbx,rax
     1361d5f:	4c 89 e7             	mov    rdi,r12
     1361d62:	e8 c1 99 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     1361d67:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1361d6c:	e8 b7 99 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     1361d71:	4c 89 ff             	mov    rdi,r15
     1361d74:	e8 a7 c1 48 00       	call   17edf20 <_ZdlPv@plt>
     1361d79:	eb 03                	jmp    1361d7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a7302>
     1361d7b:	48 89 c3             	mov    rbx,rax
     1361d7e:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1361d83:	e8 a0 99 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     1361d88:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     1361d8d:	e8 3a ca 73 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1361d92:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1361d99:	00 00 
     1361d9b:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]
     1361da2:	00 
     1361da3:	75 08                	jne    1361dad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a7331>
     1361da5:	48 89 df             	mov    rdi,rbx
     1361da8:	e8 23 df 70 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>

### 0x1361f77: lea    r10,[rsp+0x50]
     1361f56:	0f 57 c0             	xorps  xmm0,xmm0
     1361f59:	4c 8d 8c 24 70 04 00 	lea    r9,[rsp+0x470]
     1361f60:	00 
     1361f61:	49 83 61 10 00       	and    QWORD PTR [r9+0x10],0x0
     1361f66:	48 8d 44 24 60       	lea    rax,[rsp+0x60]
     1361f6b:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     1361f70:	41 0f 29 01          	movaps XMMWORD PTR [r9],xmm0
     1361f74:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
     1361f77:	4c 8d 54 24 50       	lea    r10,[rsp+0x50]
     1361f7c:	41 0f 29 02          	movaps XMMWORD PTR [r10],xmm0
     1361f80:	48 8d 0d a6 b3 07 ff 	lea    rcx,[rip+0xffffffffff07b3a6]        # 3dd32d <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2d7c>
     1361f87:	4c 8d 05 b2 b3 07 ff 	lea    r8,[rip+0xffffffffff07b3b2]        # 3dd340 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2d8f>
     1361f8e:	48 8d bc 24 58 08 00 	lea    rdi,[rsp+0x858]
     1361f95:	00 
     1361f96:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
     1361f9d:	00 
     1361f9e:	41 52                	push   r10
     1361fa0:	50                   	push   rax
     1361fa1:	e8 00 a4 1a 00       	call   150c3a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35192a>
     1361fa6:	58                   	pop    rax
     1361fa7:	59                   	pop    rcx
     1361fa8:	31 ff                	xor    edi,edi
     1361faa:	e8 d7 c4 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1361faf:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     1361fb4:	e8 79 b1 74 ff       	call   aad132 <JNI_OnUnload@@Base+0x349ff>

### 0x136223d: mov    rax,QWORD PTR [r14+0x50]
     136221e:	00 
     136221f:	e8 c2 04 00 00       	call   13626e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a7c6a>
     1362224:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
     136222b:	00 
     136222c:	48 83 a4 24 90 00 00 	and    QWORD PTR [rsp+0x90],0x0
     1362233:	00 00 
     1362235:	48 89 84 24 88 04 00 	mov    QWORD PTR [rsp+0x488],rax
     136223c:	00 
     136223d:	49 8b 46 50          	mov    rax,QWORD PTR [r14+0x50]
     1362241:	41 0f 10 46 48       	movups xmm0,XMMWORD PTR [r14+0x48]
     1362246:	0f 29 84 24 90 04 00 	movaps XMMWORD PTR [rsp+0x490],xmm0
     136224d:	00 
     136224e:	48 85 c0             	test   rax,rax
     1362251:	74 05                	je     1362258 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a77dc>
     1362253:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     1362258:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
     136225c:	48 89 84 24 a0 04 00 	mov    QWORD PTR [rsp+0x4a0],rax
     1362263:	00 
     1362264:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     1362268:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     136226b:	ff 50 10             	call   QWORD PTR [rax+0x10]
     136226e:	48 8d ac 24 a8 04 00 	lea    rbp,[rsp+0x4a8]
     1362275:	00 
     1362276:	48 89 ef             	mov    rdi,rbp
     1362279:	48 89 c6             	mov    rsi,rax

### 0x136281f: lea    r12,[rbx+0x50]
     1362801:	0f 29 43 10          	movaps XMMWORD PTR [rbx+0x10],xmm0
     1362805:	49 8b 47 38          	mov    rax,QWORD PTR [r15+0x38]
     1362809:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
     136280d:	49 8b 47 40          	mov    rax,QWORD PTR [r15+0x40]
     1362811:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
     1362815:	48 85 c0             	test   rax,rax
     1362818:	74 05                	je     136281f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a7da3>
     136281a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     136281f:	4c 8d 63 50          	lea    r12,[rbx+0x50]
     1362823:	49 8d 77 50          	lea    rsi,[r15+0x50]
     1362827:	4c 89 e7             	mov    rdi,r12
     136282a:	e8 61 7a 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     136282f:	be 80 00 00 00       	mov    esi,0x80
     1362834:	4c 8d 2c 33          	lea    r13,[rbx+rsi*1]
     1362838:	4c 01 fe             	add    rsi,r15
     136283b:	4c 89 ef             	mov    rdi,r13
     136283e:	e8 a3 a7 74 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
     1362843:	49 8b 87 40 01 00 00 	mov    rax,QWORD PTR [r15+0x140]
     136284a:	48 89 83 40 01 00 00 	mov    QWORD PTR [rbx+0x140],rax
     1362851:	be 48 01 00 00       	mov    esi,0x148
     1362856:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     136285a:	4c 01 fe             	add    rsi,r15
     136285d:	e8 32 a2 96 ff       	call   ccca94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x219a34>
     1362862:	be 60 01 00 00       	mov    esi,0x160
     1362867:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]

### 0x1362823: lea    rsi,[r15+0x50]
     1362805:	49 8b 47 38          	mov    rax,QWORD PTR [r15+0x38]
     1362809:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
     136280d:	49 8b 47 40          	mov    rax,QWORD PTR [r15+0x40]
     1362811:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
     1362815:	48 85 c0             	test   rax,rax
     1362818:	74 05                	je     136281f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a7da3>
     136281a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     136281f:	4c 8d 63 50          	lea    r12,[rbx+0x50]
     1362823:	49 8d 77 50          	lea    rsi,[r15+0x50]
     1362827:	4c 89 e7             	mov    rdi,r12
     136282a:	e8 61 7a 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     136282f:	be 80 00 00 00       	mov    esi,0x80
     1362834:	4c 8d 2c 33          	lea    r13,[rbx+rsi*1]
     1362838:	4c 01 fe             	add    rsi,r15
     136283b:	4c 89 ef             	mov    rdi,r13
     136283e:	e8 a3 a7 74 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
     1362843:	49 8b 87 40 01 00 00 	mov    rax,QWORD PTR [r15+0x140]
     136284a:	48 89 83 40 01 00 00 	mov    QWORD PTR [rbx+0x140],rax
     1362851:	be 48 01 00 00       	mov    esi,0x148
     1362856:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     136285a:	4c 01 fe             	add    rsi,r15
     136285d:	e8 32 a2 96 ff       	call   ccca94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x219a34>
     1362862:	be 60 01 00 00       	mov    esi,0x160
     1362867:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     136286b:	4c 01 fe             	add    rsi,r15

### 0x13632af: mov    rax,QWORD PTR [rsi+0x50]
     136328f:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
     1363294:	49 89 f7             	mov    r15,rsi
     1363297:	48 89 fb             	mov    rbx,rdi
     136329a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13632a1:	00 00 
     13632a3:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax
     13632aa:	00 
     13632ab:	4c 8b 76 20          	mov    r14,QWORD PTR [rsi+0x20]
     13632af:	48 8b 46 50          	mov    rax,QWORD PTR [rsi+0x50]
     13632b3:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     13632b7:	48 83 c6 60          	add    rsi,0x60
     13632bb:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     13632c0:	e8 21 9d 74 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
     13632c5:	4d 8b af 20 01 00 00 	mov    r13,QWORD PTR [r15+0x120]
     13632cc:	bf 20 01 00 00       	mov    edi,0x120
     13632d1:	e8 2a ac 48 00       	call   17edf00 <_Znwm@plt>
     13632d6:	49 89 c4             	mov    r12,rax
     13632d9:	48 8d ac 24 d0 00 00 	lea    rbp,[rsp+0xd0]
     13632e0:	00 
     13632e1:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     13632e6:	48 89 ef             	mov    rdi,rbp
     13632e9:	e8 b0 bc 96 ff       	call   ccef9e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21bf3e>
     13632ee:	48 8d 05 cb 4a 50 00 	lea    rax,[rip+0x504acb]        # 1867dc0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x244a8>
     13632f5:	49 89 04 24          	mov    QWORD PTR [r12],rax
     13632f9:	41 0f 10 47 10       	movups xmm0,XMMWORD PTR [r15+0x10]

### 0x13634a6: movaps XMMWORD PTR [rsp+0x50],xmm0
     1363486:	ff 50 10             	call   QWORD PTR [rax+0x10]
     1363489:	48 8d 84 24 c0 01 00 	lea    rax,[rsp+0x1c0]
     1363490:	00 
     1363491:	48 8b 48 20          	mov    rcx,QWORD PTR [rax+0x20]
     1363495:	48 89 4c 24 70       	mov    QWORD PTR [rsp+0x70],rcx
     136349a:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     136349d:	0f 10 48 10          	movups xmm1,XMMWORD PTR [rax+0x10]
     13634a1:	0f 29 4c 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm1
     13634a6:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
     13634ab:	48 8d 5c 24 38       	lea    rbx,[rsp+0x38]
     13634b0:	48 8d 94 24 c0 00 00 	lea    rdx,[rsp+0xc0]
     13634b7:	00 
     13634b8:	48 89 df             	mov    rdi,rbx
     13634bb:	89 ee                	mov    esi,ebp
     13634bd:	e8 b7 fb 0b 00       	call   1423079 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2685fd>
     13634c2:	49 8d 76 08          	lea    rsi,[r14+0x8]
     13634c6:	49 83 c6 20          	add    r14,0x20
     13634ca:	48 8d 44 24 40       	lea    rax,[rsp+0x40]
     13634cf:	4c 8d 54 24 50       	lea    r10,[rsp+0x50]
     13634d4:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     13634d9:	4c 8d 8c 24 c0 00 00 	lea    r9,[rsp+0xc0]
     13634e0:	00 
     13634e1:	4c 89 e2             	mov    rdx,r12
     13634e4:	4c 89 f1             	mov    rcx,r14
     13634e7:	4d 89 f8             	mov    r8,r15

### 0x13634cf: lea    r10,[rsp+0x50]
     13634b0:	48 8d 94 24 c0 00 00 	lea    rdx,[rsp+0xc0]
     13634b7:	00 
     13634b8:	48 89 df             	mov    rdi,rbx
     13634bb:	89 ee                	mov    esi,ebp
     13634bd:	e8 b7 fb 0b 00       	call   1423079 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2685fd>
     13634c2:	49 8d 76 08          	lea    rsi,[r14+0x8]
     13634c6:	49 83 c6 20          	add    r14,0x20
     13634ca:	48 8d 44 24 40       	lea    rax,[rsp+0x40]
     13634cf:	4c 8d 54 24 50       	lea    r10,[rsp+0x50]
     13634d4:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     13634d9:	4c 8d 8c 24 c0 00 00 	lea    r9,[rsp+0xc0]
     13634e0:	00 
     13634e1:	4c 89 e2             	mov    rdx,r12
     13634e4:	4c 89 f1             	mov    rcx,r14
     13634e7:	4d 89 f8             	mov    r8,r15
     13634ea:	41 55                	push   r13
     13634ec:	53                   	push   rbx
     13634ed:	4c 8d 9c 24 88 00 00 	lea    r11,[rsp+0x88]
     13634f4:	00 
     13634f5:	41 53                	push   r11
     13634f7:	50                   	push   rax
     13634f8:	41 52                	push   r10
     13634fa:	ff 74 24 30          	push   QWORD PTR [rsp+0x30]
     13634fe:	e8 f4 00 00 00       	call   13635f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a8b7b>
     1363503:	48 83 c4 30          	add    rsp,0x30

### 0x136377e: mov    QWORD PTR [rsp+0x50],rdi
     136374e:	45 31 ff             	xor    r15d,r15d
     1363751:	80 bb 18 01 00 00 00 	cmp    BYTE PTR [rbx+0x118],0x0
     1363758:	49 0f 44 c7          	cmove  rax,r15
     136375c:	48 83 64 24 70 00    	and    QWORD PTR [rsp+0x70],0x0
     1363762:	48 89 83 28 01 00 00 	mov    QWORD PTR [rbx+0x128],rax
     1363769:	4c 89 b3 30 01 00 00 	mov    QWORD PTR [rbx+0x130],r14
     1363770:	4c 89 a3 38 01 00 00 	mov    QWORD PTR [rbx+0x138],r12
     1363777:	48 8d bb 40 01 00 00 	lea    rdi,[rbx+0x140]
     136377e:	48 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],rdi
     1363783:	48 8d b4 24 68 01 00 	lea    rsi,[rsp+0x168]
     136378a:	00 
     136378b:	e8 d0 0a 00 00       	call   1364260 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a97e4>
     1363790:	48 8b 84 24 10 03 00 	mov    rax,QWORD PTR [rsp+0x310]
     1363797:	00 
     1363798:	48 89 83 88 01 00 00 	mov    QWORD PTR [rbx+0x188],rax
     136379f:	80 bb 18 01 00 00 00 	cmp    BYTE PTR [rbx+0x118],0x0
     13637a6:	74 29                	je     13637d1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a8d55>
     13637a8:	48 63 83 30 01 00 00 	movsxd rax,DWORD PTR [rbx+0x130]
     13637af:	4c 8b bb 08 01 00 00 	mov    r15,QWORD PTR [rbx+0x108]
     13637b6:	48 8b 8b 10 01 00 00 	mov    rcx,QWORD PTR [rbx+0x110]
     13637bd:	48 39 c1             	cmp    rcx,rax
     13637c0:	74 0f                	je     13637d1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a8d55>
     13637c2:	4c 0f af f8          	imul   r15,rax
     13637c6:	4c 89 f8             	mov    rax,r15
     13637c9:	48 99                	cqo

### 0x1364163: mov    rdi,QWORD PTR [rsp+0x50]
     1364142:	e8 f3 00 97 ff       	call   cd423a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2211da>
     1364147:	eb 03                	jmp    136414c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a96d0>
     1364149:	49 89 c6             	mov    r14,rax
     136414c:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     1364153:	00 
     1364154:	e8 65 55 0a 00       	call   14096be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ec42>
     1364159:	49 89 df             	mov    r15,rbx
     136415c:	49 81 c7 38 01 00 00 	add    r15,0x138
     1364163:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     1364168:	e8 b5 00 00 00       	call   1364222 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a97a6>
     136416d:	4c 89 ff             	mov    rdi,r15
     1364170:	e8 67 5f 8f ff       	call   c5a0dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a707c>
     1364175:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
     136417a:	e8 e7 8e 74 ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
     136417f:	48 83 7c 24 20 00    	cmp    QWORD PTR [rsp+0x20],0x0
     1364185:	74 0b                	je     1364192 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a9716>
     1364187:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     136418c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     136418f:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1364192:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     1364197:	e8 40 5f 8f ff       	call   c5a0dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a707c>
     136419c:	48 8d bc 24 68 01 00 	lea    rdi,[rsp+0x168]
     13641a3:	00 
     13641a4:	e8 79 00 00 00       	call   1364222 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a97a6>
     13641a9:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]

### 0x1364308: lea    rdi,[r14+0x50]
     13642f8:	41 56                	push   r14
     13642fa:	53                   	push   rbx
     13642fb:	50                   	push   rax
     13642fc:	48 89 f3             	mov    rbx,rsi
     13642ff:	49 89 fe             	mov    r14,rdi
     1364302:	6a 09                	push   0x9
     1364304:	59                   	pop    rcx
     1364305:	f3 48 a5             	rep movs QWORD PTR es:[rdi],QWORD PTR ds:[rsi]
     1364308:	49 8d 7e 50          	lea    rdi,[r14+0x50]
     136430c:	48 8d 73 50          	lea    rsi,[rbx+0x50]
     1364310:	e8 d1 8c 74 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
     1364315:	48 8b 83 10 01 00 00 	mov    rax,QWORD PTR [rbx+0x110]
     136431c:	49 89 86 10 01 00 00 	mov    QWORD PTR [r14+0x110],rax
     1364323:	48 83 c4 08          	add    rsp,0x8
     1364327:	5b                   	pop    rbx
     1364328:	41 5e                	pop    r14
     136432a:	c3                   	ret
     136432b:	cc                   	int3
     136432c:	50                   	push   rax
     136432d:	6a 10                	push   0x10
     136432f:	5f                   	pop    rdi
     1364330:	e8 cb 9b 48 00       	call   17edf00 <_Znwm@plt>
     1364335:	48 8d 0d f4 39 50 00 	lea    rcx,[rip+0x5039f4]        # 1867d30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24418>
     136433c:	48 89 08             	mov    QWORD PTR [rax],rcx
     136433f:	59                   	pop    rcx

### 0x136430c: lea    rsi,[rbx+0x50]
     13642fa:	53                   	push   rbx
     13642fb:	50                   	push   rax
     13642fc:	48 89 f3             	mov    rbx,rsi
     13642ff:	49 89 fe             	mov    r14,rdi
     1364302:	6a 09                	push   0x9
     1364304:	59                   	pop    rcx
     1364305:	f3 48 a5             	rep movs QWORD PTR es:[rdi],QWORD PTR ds:[rsi]
     1364308:	49 8d 7e 50          	lea    rdi,[r14+0x50]
     136430c:	48 8d 73 50          	lea    rsi,[rbx+0x50]
     1364310:	e8 d1 8c 74 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
     1364315:	48 8b 83 10 01 00 00 	mov    rax,QWORD PTR [rbx+0x110]
     136431c:	49 89 86 10 01 00 00 	mov    QWORD PTR [r14+0x110],rax
     1364323:	48 83 c4 08          	add    rsp,0x8
     1364327:	5b                   	pop    rbx
     1364328:	41 5e                	pop    r14
     136432a:	c3                   	ret
     136432b:	cc                   	int3
     136432c:	50                   	push   rax
     136432d:	6a 10                	push   0x10
     136432f:	5f                   	pop    rdi
     1364330:	e8 cb 9b 48 00       	call   17edf00 <_Znwm@plt>
     1364335:	48 8d 0d f4 39 50 00 	lea    rcx,[rip+0x5039f4]        # 1867d30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24418>
     136433c:	48 89 08             	mov    QWORD PTR [rax],rcx
     136433f:	59                   	pop    rcx
     1364340:	c3                   	ret

### 0x1364590: mov    QWORD PTR [rsp+0x50],rax
     1364565:	4c 89 ef             	mov    rdi,r13
     1364568:	48 8d 35 ec c1 ff fe 	lea    rsi,[rip+0xfffffffffeffc1ec]        # 36075b <_ZTSSt12bad_any_cast@@Base-0x2fa6d>
     136456f:	e8 7e 1a 47 00       	call   17d5ff2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1e13>
     1364574:	48 c7 44 24 40 01 00 	mov    QWORD PTR [rsp+0x40],0x1
     136457b:	00 00 
     136457d:	48 8d 05 f8 d9 0e ff 	lea    rax,[rip+0xffffffffff0ed9f8]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     1364584:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     1364589:	48 8d 05 c3 e4 00 ff 	lea    rax,[rip+0xffffffffff00e4c3]        # 372a53 <_ZTSSt12bad_any_cast@@Base-0x1d775>
     1364590:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     1364595:	c7 44 24 58 33 02 00 	mov    DWORD PTR [rsp+0x58],0x233
     136459c:	00 
     136459d:	4c 89 ff             	mov    rdi,r15
     13645a0:	4c 89 ee             	mov    rsi,r13
     13645a3:	e8 00 57 74 ff       	call   aa9ca8 <JNI_OnUnload@@Base+0x31575>
     13645a8:	4c 89 ef             	mov    rdi,r13
     13645ab:	4d 89 fd             	mov    r13,r15
     13645ae:	49 89 ef             	mov    r15,rbp
     13645b1:	44 89 f5             	mov    ebp,r14d
     13645b4:	4d 89 e6             	mov    r14,r12
     13645b7:	4c 8d 64 24 60       	lea    r12,[rsp+0x60]
     13645bc:	e8 cf 98 48 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     13645c1:	4c 89 e7             	mov    rdi,r12
     13645c4:	e8 5f b6 95 ff       	call   cbfc28 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20cbc8>
     13645c9:	48 83 c3 30          	add    rbx,0x30
     13645cd:	4c 39 f3             	cmp    rbx,r14

### 0x136467d: mov    QWORD PTR [rsp+0x50],rax
     1364668:	c3                   	ret
     1364669:	cc                   	int3
     136466a:	41 56                	push   r14
     136466c:	53                   	push   rbx
     136466d:	48 83 ec 58          	sub    rsp,0x58
     1364671:	49 89 fe             	mov    r14,rdi
     1364674:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     136467b:	00 00 
     136467d:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     1364682:	6a 18                	push   0x18
     1364684:	5f                   	pop    rdi
     1364685:	e8 76 98 48 00       	call   17edf00 <_Znwm@plt>
     136468a:	48 89 c3             	mov    rbx,rax
     136468d:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     1364692:	0f 57 c0             	xorps  xmm0,xmm0
     1364695:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
     1364698:	48 8d 05 31 ad 4b 00 	lea    rax,[rip+0x4bad31]        # 181f3d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x15090>
     136469f:	48 89 03             	mov    QWORD PTR [rbx],rax
     13646a2:	48 8d 35 56 56 ff fe 	lea    rsi,[rip+0xfffffffffeff5656]        # 359cff <_ZTSSt12bad_any_cast@@Base-0x364c9>
     13646a9:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     13646ae:	e8 cb 53 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     13646b3:	48 89 df             	mov    rdi,rbx
     13646b6:	48 83 c7 08          	add    rdi,0x8
     13646ba:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
     13646bf:	48 83 62 20 00       	and    QWORD PTR [rdx+0x20],0x0

### 0x13646ee: cmp    rax,QWORD PTR [rsp+0x50]
     13646c9:	e8 56 e2 2a 00       	call   1612924 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda92>
     13646ce:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     13646d3:	e8 92 58 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     13646d8:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     13646dd:	e8 ae 97 48 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     13646e2:	49 89 1e             	mov    QWORD PTR [r14],rbx
     13646e5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13646ec:	00 00 
     13646ee:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
     13646f3:	75 47                	jne    136473c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a9cc0>
     13646f5:	4c 89 f0             	mov    rax,r14
     13646f8:	48 83 c4 58          	add    rsp,0x58
     13646fc:	5b                   	pop    rbx
     13646fd:	41 5e                	pop    r14
     13646ff:	c3                   	ret
     1364700:	49 89 c6             	mov    r14,rax
     1364703:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1364708:	e8 5d 58 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     136470d:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1364712:	e8 79 97 48 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1364717:	eb 03                	jmp    136471c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a9ca0>
     1364719:	49 89 c6             	mov    r14,rax
     136471c:	48 89 df             	mov    rdi,rbx
     136471f:	e8 fc 97 48 00       	call   17edf20 <_ZdlPv@plt>
     1364724:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### 0x136472d: cmp    rax,QWORD PTR [rsp+0x50]
     136470d:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1364712:	e8 79 97 48 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1364717:	eb 03                	jmp    136471c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a9ca0>
     1364719:	49 89 c6             	mov    r14,rax
     136471c:	48 89 df             	mov    rdi,rbx
     136471f:	e8 fc 97 48 00       	call   17edf20 <_ZdlPv@plt>
     1364724:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     136472b:	00 00 
     136472d:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
     1364732:	75 08                	jne    136473c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a9cc0>
     1364734:	4c 89 f7             	mov    rdi,r14
     1364737:	e8 94 b5 70 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     136473c:	e8 6f b3 48 00       	call   17efab0 <__stack_chk_fail@plt>
     1364741:	cc                   	int3
     1364742:	48 8d 05 9f 35 50 00 	lea    rax,[rip+0x50359f]        # 1867ce8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x243d0>
     1364749:	48 89 07             	mov    QWORD PTR [rdi],rax
     136474c:	48 83 c7 10          	add    rdi,0x10
     1364750:	e9 f9 c4 ff ff       	jmp    1360c4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a61d2>
     1364755:	cc                   	int3
     1364756:	53                   	push   rbx
     1364757:	48 89 fb             	mov    rbx,rdi
     136475a:	e8 e3 ff ff ff       	call   1364742 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a9cc6>
     136475f:	48 89 df             	mov    rdi,rbx
     1364762:	5b                   	pop    rbx
     1364763:	e9 b8 97 48 00       	jmp    17edf20 <_ZdlPv@plt>

### 0x1364869: cmp    QWORD PTR [rsi+0x50],0x0
     136484a:	53                   	push   rbx
     136484b:	48 81 ec 18 01 00 00 	sub    rsp,0x118
     1364852:	49 89 f6             	mov    r14,rsi
     1364855:	48 89 fb             	mov    rbx,rdi
     1364858:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     136485f:	00 00 
     1364861:	48 89 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rax
     1364868:	00 
     1364869:	48 83 7e 50 00       	cmp    QWORD PTR [rsi+0x50],0x0
     136486e:	0f 84 8d 00 00 00    	je     1364901 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a9e85>
     1364874:	41 0f 28 46 10       	movaps xmm0,XMMWORD PTR [r14+0x10]
     1364879:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
     136487e:	41 0f 29 47 e0       	movaps XMMWORD PTR [r15-0x20],xmm0
     1364883:	41 0f 28 46 20       	movaps xmm0,XMMWORD PTR [r14+0x20]
     1364888:	41 0f 29 47 f0       	movaps XMMWORD PTR [r15-0x10],xmm0
     136488d:	49 8d 76 68          	lea    rsi,[r14+0x68]
     1364891:	4c 89 ff             	mov    rdi,r15
     1364894:	e8 a7 96 48 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1364899:	49 8b 46 60          	mov    rax,QWORD PTR [r14+0x60]
     136489d:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     13648a1:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
     13648a6:	49 8d b6 38 01 00 00 	lea    rsi,[r14+0x138]
     13648ad:	4c 89 e7             	mov    rdi,r12
     13648b0:	e8 45 0b 47 00       	call   17d53fa <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x121b>
     13648b5:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]

### 0x13648e1: mov    rsi,QWORD PTR [r14+0x50]
     13648b5:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     13648ba:	49 8d b6 80 00 00 00 	lea    rsi,[r14+0x80]
     13648c1:	e8 d8 8d 95 ff       	call   cbd69e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a63e>
     13648c6:	49 8b 86 30 01 00 00 	mov    rax,QWORD PTR [r14+0x130]
     13648cd:	48 89 e2             	mov    rdx,rsp
     13648d0:	48 89 82 f8 00 00 00 	mov    QWORD PTR [rdx+0xf8],rax
     13648d7:	0f 57 c0             	xorps  xmm0,xmm0
     13648da:	0f 29 82 00 01 00 00 	movaps XMMWORD PTR [rdx+0x100],xmm0
     13648e1:	49 8b 76 50          	mov    rsi,QWORD PTR [r14+0x50]
     13648e5:	48 89 df             	mov    rdi,rbx
     13648e8:	e8 cd 87 74 ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
     13648ed:	48 89 e7             	mov    rdi,rsp
     13648f0:	e8 77 b8 95 ff       	call   cc016c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20d10c>
     13648f5:	48 83 3b 00          	cmp    QWORD PTR [rbx],0x0
     13648f9:	0f 85 8b 00 00 00    	jne    136498a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a9f0e>
     13648ff:	eb 04                	jmp    1364905 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a9e89>
     1364901:	48 83 23 00          	and    QWORD PTR [rbx],0x0
     1364905:	48 89 df             	mov    rdi,rbx
     1364908:	e8 13 5d 7c ff       	call   b2a620 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x775c0>
     136490d:	41 0f 28 46 10       	movaps xmm0,XMMWORD PTR [r14+0x10]
     1364912:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
     1364917:	41 0f 29 47 e0       	movaps XMMWORD PTR [r15-0x20],xmm0
     136491c:	41 0f 28 46 20       	movaps xmm0,XMMWORD PTR [r14+0x20]
     1364921:	41 0f 29 47 f0       	movaps XMMWORD PTR [r15-0x10],xmm0
     1364926:	49 8d 76 68          	lea    rsi,[r14+0x68]

### 0x1364a20: mov    rax,QWORD PTR [r14+0x50]
     1364a02:	0f 28 06             	movaps xmm0,XMMWORD PTR [rsi]
     1364a05:	0f 28 4e 10          	movaps xmm1,XMMWORD PTR [rsi+0x10]
     1364a09:	0f 29 4f 10          	movaps XMMWORD PTR [rdi+0x10],xmm1
     1364a0d:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
     1364a10:	48 8d 5f 20          	lea    rbx,[rdi+0x20]
     1364a14:	48 83 c6 20          	add    rsi,0x20
     1364a18:	48 89 df             	mov    rdi,rbx
     1364a1b:	e8 70 58 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     1364a20:	49 8b 46 50          	mov    rax,QWORD PTR [r14+0x50]
     1364a24:	49 89 47 50          	mov    QWORD PTR [r15+0x50],rax
     1364a28:	4d 8d 67 58          	lea    r12,[r15+0x58]
     1364a2c:	49 8d 76 58          	lea    rsi,[r14+0x58]
     1364a30:	4c 89 e7             	mov    rdi,r12
     1364a33:	e8 08 95 48 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1364a38:	49 8d 7f 70          	lea    rdi,[r15+0x70]
     1364a3c:	49 8d 76 70          	lea    rsi,[r14+0x70]
     1364a40:	e8 59 8c 95 ff       	call   cbd69e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a63e>
     1364a45:	49 8b 86 20 01 00 00 	mov    rax,QWORD PTR [r14+0x120]
     1364a4c:	49 89 87 20 01 00 00 	mov    QWORD PTR [r15+0x120],rax
     1364a53:	b8 28 01 00 00       	mov    eax,0x128
     1364a58:	49 01 c7             	add    r15,rax
     1364a5b:	49 01 c6             	add    r14,rax
     1364a5e:	4c 89 ff             	mov    rdi,r15
     1364a61:	4c 89 f6             	mov    rsi,r14
     1364a64:	48 83 c4 08          	add    rsp,0x8

### 0x1364a24: mov    QWORD PTR [r15+0x50],rax
     1364a05:	0f 28 4e 10          	movaps xmm1,XMMWORD PTR [rsi+0x10]
     1364a09:	0f 29 4f 10          	movaps XMMWORD PTR [rdi+0x10],xmm1
     1364a0d:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
     1364a10:	48 8d 5f 20          	lea    rbx,[rdi+0x20]
     1364a14:	48 83 c6 20          	add    rsi,0x20
     1364a18:	48 89 df             	mov    rdi,rbx
     1364a1b:	e8 70 58 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     1364a20:	49 8b 46 50          	mov    rax,QWORD PTR [r14+0x50]
     1364a24:	49 89 47 50          	mov    QWORD PTR [r15+0x50],rax
     1364a28:	4d 8d 67 58          	lea    r12,[r15+0x58]
     1364a2c:	49 8d 76 58          	lea    rsi,[r14+0x58]
     1364a30:	4c 89 e7             	mov    rdi,r12
     1364a33:	e8 08 95 48 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1364a38:	49 8d 7f 70          	lea    rdi,[r15+0x70]
     1364a3c:	49 8d 76 70          	lea    rsi,[r14+0x70]
     1364a40:	e8 59 8c 95 ff       	call   cbd69e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a63e>
     1364a45:	49 8b 86 20 01 00 00 	mov    rax,QWORD PTR [r14+0x120]
     1364a4c:	49 89 87 20 01 00 00 	mov    QWORD PTR [r15+0x120],rax
     1364a53:	b8 28 01 00 00       	mov    eax,0x128
     1364a58:	49 01 c7             	add    r15,rax
     1364a5b:	49 01 c6             	add    r14,rax
     1364a5e:	4c 89 ff             	mov    rdi,r15
     1364a61:	4c 89 f6             	mov    rsi,r14
     1364a64:	48 83 c4 08          	add    rsp,0x8
     1364a68:	5b                   	pop    rbx

### 0x1364cf2: mov    r12,QWORD PTR [rsi+0x50]
     1364cd1:	49 89 f6             	mov    r14,rsi
     1364cd4:	48 89 fb             	mov    rbx,rdi
     1364cd7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1364cde:	00 00 
     1364ce0:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     1364ce7:	00 
     1364ce8:	49 bd 01 00 00 00 00 	movabs r13,0x8000000000000001
     1364cef:	00 00 80 
     1364cf2:	4c 8b 66 50          	mov    r12,QWORD PTR [rsi+0x50]
     1364cf6:	4d 39 ec             	cmp    r12,r13
     1364cf9:	7e 20                	jle    1364d1b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa29f>
     1364cfb:	49 63 46 20          	movsxd rax,DWORD PTR [r14+0x20]
     1364cff:	4c 89 23             	mov    QWORD PTR [rbx],r12
     1364d02:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
     1364d06:	b1 01                	mov    cl,0x1
     1364d08:	88 4b 10             	mov    BYTE PTR [rbx+0x10],cl
     1364d0b:	4c 89 63 18          	mov    QWORD PTR [rbx+0x18],r12
     1364d0f:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
     1364d13:	88 4b 28             	mov    BYTE PTR [rbx+0x28],cl
     1364d16:	e9 66 01 00 00       	jmp    1364e81 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa405>
     1364d1b:	48 8d 3d be 53 67 00 	lea    rdi,[rip+0x6753be]        # 19da0e0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0xa2d28>
     1364d22:	e8 59 be 48 00       	call   17f0b80 <__emutls_get_address@plt>
     1364d27:	48 8b 00             	mov    rax,QWORD PTR [rax]
     1364d2a:	49 3b 46 08          	cmp    rax,QWORD PTR [r14+0x8]
     1364d2e:	74 1e                	je     1364d4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa2d2>

### 0x1364d44: movaps XMMWORD PTR [rsp+0x50],xmm0
     1364d22:	e8 59 be 48 00       	call   17f0b80 <__emutls_get_address@plt>
     1364d27:	48 8b 00             	mov    rax,QWORD PTR [rax]
     1364d2a:	49 3b 46 08          	cmp    rax,QWORD PTR [r14+0x8]
     1364d2e:	74 1e                	je     1364d4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa2d2>
     1364d30:	49 8b 86 b8 00 00 00 	mov    rax,QWORD PTR [r14+0xb8]
     1364d37:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     1364d3c:	41 0f 10 86 a8 00 00 	movups xmm0,XMMWORD PTR [r14+0xa8]
     1364d43:	00 
     1364d44:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
     1364d49:	e9 f0 00 00 00       	jmp    1364e3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa3c2>
     1364d4e:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
     1364d52:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1364d55:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
     1364d5b:	66 0f 28 c8          	movapd xmm1,xmm0
     1364d5f:	f2 0f c2 0d 40 a7 02 	cmpltsd xmm1,QWORD PTR [rip+0xffffffffff02a740]        # 38f4a8 <_ZTSSt12bad_any_cast@@Base-0xd20>
     1364d66:	ff 01 
     1364d68:	f2 0f 10 15 d8 a2 02 	movsd  xmm2,QWORD PTR [rip+0xffffffffff02a2d8]        # 38f048 <_ZTSSt12bad_any_cast@@Base-0x1180>
     1364d6f:	ff 
     1364d70:	66 0f 54 d1          	andpd  xmm2,xmm1
     1364d74:	66 0f 55 c8          	andnpd xmm1,xmm0
     1364d78:	66 0f 56 d1          	orpd   xmm2,xmm1
     1364d7c:	66 0f 29 54 24 40    	movapd XMMWORD PTR [rsp+0x40],xmm2
     1364d82:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
     1364d86:	48 8b 78 18          	mov    rdi,QWORD PTR [rax+0x18]
     1364d8a:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### 0x1364de7: mov    QWORD PTR [rsp+0x50],rax
     1364dc4:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
     1364dc8:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     1364dcd:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]
     1364dd2:	48 89 c2             	mov    rdx,rax
     1364dd5:	e8 59 08 00 00       	call   1365633 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aabb7>
     1364dda:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
     1364dde:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1364de1:	ff 90 20 01 00 00    	call   QWORD PTR [rax+0x120]
     1364de7:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     1364dec:	88 54 24 58          	mov    BYTE PTR [rsp+0x58],dl
     1364df0:	84 d2                	test   dl,dl
     1364df2:	74 12                	je     1364e06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa38a>
     1364df4:	49 89 c7             	mov    r15,rax
     1364df7:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1364dfc:	e8 71 0d 7e ff       	call   b45b72 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92b12>
     1364e01:	40 b6 01             	mov    sil,0x1
     1364e04:	eb 05                	jmp    1364e0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa38f>
     1364e06:	31 f6                	xor    esi,esi
     1364e08:	45 31 ff             	xor    r15d,r15d
     1364e0b:	49 8d 4e 20          	lea    rcx,[r14+0x20]
     1364e0f:	4d 8b 4e 38          	mov    r9,QWORD PTR [r14+0x38]
     1364e13:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
     1364e17:	4c 29 c8             	sub    rax,r9
     1364e1a:	48 99                	cqo
     1364e1c:	48 f7 fd             	idiv   rbp

### 0x1364df7: lea    rdi,[rsp+0x50]
     1364dda:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
     1364dde:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1364de1:	ff 90 20 01 00 00    	call   QWORD PTR [rax+0x120]
     1364de7:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     1364dec:	88 54 24 58          	mov    BYTE PTR [rsp+0x58],dl
     1364df0:	84 d2                	test   dl,dl
     1364df2:	74 12                	je     1364e06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa38a>
     1364df4:	49 89 c7             	mov    r15,rax
     1364df7:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1364dfc:	e8 71 0d 7e ff       	call   b45b72 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92b12>
     1364e01:	40 b6 01             	mov    sil,0x1
     1364e04:	eb 05                	jmp    1364e0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa38f>
     1364e06:	31 f6                	xor    esi,esi
     1364e08:	45 31 ff             	xor    r15d,r15d
     1364e0b:	49 8d 4e 20          	lea    rcx,[r14+0x20]
     1364e0f:	4d 8b 4e 38          	mov    r9,QWORD PTR [r14+0x38]
     1364e13:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
     1364e17:	4c 29 c8             	sub    rax,r9
     1364e1a:	48 99                	cqo
     1364e1c:	48 f7 fd             	idiv   rbp
     1364e1f:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     1364e23:	40 0f b6 d6          	movzx  edx,sil
     1364e27:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1364e2c:	4c 8d 44 24 68       	lea    r8,[rsp+0x68]
     1364e31:	4c 89 fe             	mov    rsi,r15

### 0x1364e27: lea    rdi,[rsp+0x50]
     1364e0b:	49 8d 4e 20          	lea    rcx,[r14+0x20]
     1364e0f:	4d 8b 4e 38          	mov    r9,QWORD PTR [r14+0x38]
     1364e13:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
     1364e17:	4c 29 c8             	sub    rax,r9
     1364e1a:	48 99                	cqo
     1364e1c:	48 f7 fd             	idiv   rbp
     1364e1f:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     1364e23:	40 0f b6 d6          	movzx  edx,sil
     1364e27:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1364e2c:	4c 8d 44 24 68       	lea    r8,[rsp+0x68]
     1364e31:	4c 89 fe             	mov    rsi,r15
     1364e34:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]
     1364e39:	e8 4e 09 00 00       	call   136578c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aad10>
     1364e3e:	31 c0                	xor    eax,eax
     1364e40:	80 7c 24 60 00       	cmp    BYTE PTR [rsp+0x60],0x0
     1364e45:	6a 01                	push   0x1
     1364e47:	59                   	pop    rcx
     1364e48:	48 0f 45 4c 24 58    	cmovne rcx,QWORD PTR [rsp+0x58]
     1364e4e:	48 0f 45 44 24 50    	cmovne rax,QWORD PTR [rsp+0x50]
     1364e54:	48 89 03             	mov    QWORD PTR [rbx],rax
     1364e57:	48 89 4b 08          	mov    QWORD PTR [rbx+0x8],rcx
     1364e5b:	c6 43 10 01          	mov    BYTE PTR [rbx+0x10],0x1
     1364e5f:	4d 39 ec             	cmp    r12,r13
     1364e62:	75 0a                	jne    1364e6e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa3f2>
     1364e64:	31 c0                	xor    eax,eax

### 0x1364e4e: cmovne rax,QWORD PTR [rsp+0x50]
     1364e31:	4c 89 fe             	mov    rsi,r15
     1364e34:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]
     1364e39:	e8 4e 09 00 00       	call   136578c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aad10>
     1364e3e:	31 c0                	xor    eax,eax
     1364e40:	80 7c 24 60 00       	cmp    BYTE PTR [rsp+0x60],0x0
     1364e45:	6a 01                	push   0x1
     1364e47:	59                   	pop    rcx
     1364e48:	48 0f 45 4c 24 58    	cmovne rcx,QWORD PTR [rsp+0x58]
     1364e4e:	48 0f 45 44 24 50    	cmovne rax,QWORD PTR [rsp+0x50]
     1364e54:	48 89 03             	mov    QWORD PTR [rbx],rax
     1364e57:	48 89 4b 08          	mov    QWORD PTR [rbx+0x8],rcx
     1364e5b:	c6 43 10 01          	mov    BYTE PTR [rbx+0x10],0x1
     1364e5f:	4d 39 ec             	cmp    r12,r13
     1364e62:	75 0a                	jne    1364e6e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa3f2>
     1364e64:	31 c0                	xor    eax,eax
     1364e66:	88 43 18             	mov    BYTE PTR [rbx+0x18],al
     1364e69:	88 43 28             	mov    BYTE PTR [rbx+0x28],al
     1364e6c:	eb 13                	jmp    1364e81 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa405>
     1364e6e:	48 8d 43 18          	lea    rax,[rbx+0x18]
     1364e72:	8a 4c 24 60          	mov    cl,BYTE PTR [rsp+0x60]
     1364e76:	88 48 10             	mov    BYTE PTR [rax+0x10],cl
     1364e79:	0f 28 44 24 50       	movaps xmm0,XMMWORD PTR [rsp+0x50]
     1364e7e:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     1364e81:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1364e88:	00 00 

### 0x1364e79: movaps xmm0,XMMWORD PTR [rsp+0x50]
     1364e62:	75 0a                	jne    1364e6e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa3f2>
     1364e64:	31 c0                	xor    eax,eax
     1364e66:	88 43 18             	mov    BYTE PTR [rbx+0x18],al
     1364e69:	88 43 28             	mov    BYTE PTR [rbx+0x28],al
     1364e6c:	eb 13                	jmp    1364e81 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa405>
     1364e6e:	48 8d 43 18          	lea    rax,[rbx+0x18]
     1364e72:	8a 4c 24 60          	mov    cl,BYTE PTR [rsp+0x60]
     1364e76:	88 48 10             	mov    BYTE PTR [rax+0x10],cl
     1364e79:	0f 28 44 24 50       	movaps xmm0,XMMWORD PTR [rsp+0x50]
     1364e7e:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     1364e81:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1364e88:	00 00 
     1364e8a:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
     1364e91:	00 
     1364e92:	75 15                	jne    1364ea9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa42d>
     1364e94:	48 89 d8             	mov    rax,rbx
     1364e97:	48 81 c4 a8 00 00 00 	add    rsp,0xa8
     1364e9e:	5b                   	pop    rbx
     1364e9f:	41 5c                	pop    r12
     1364ea1:	41 5d                	pop    r13
     1364ea3:	41 5e                	pop    r14
     1364ea5:	41 5f                	pop    r15
     1364ea7:	5d                   	pop    rbp
     1364ea8:	c3                   	ret
     1364ea9:	e8 02 ac 48 00       	call   17efab0 <__stack_chk_fail@plt>

### 0x1364f46: movapd XMMWORD PTR [rsp+0x50],xmm1
     1364f1e:	48 3b 43 08          	cmp    rax,QWORD PTR [rbx+0x8]
     1364f22:	74 33                	je     1364f57 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa4db>
     1364f24:	48 8b 83 90 00 00 00 	mov    rax,QWORD PTR [rbx+0x90]
     1364f2b:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
     1364f30:	66 0f 10 43 60       	movupd xmm0,XMMWORD PTR [rbx+0x60]
     1364f35:	66 0f 10 4b 70       	movupd xmm1,XMMWORD PTR [rbx+0x70]
     1364f3a:	0f 10 93 80 00 00 00 	movups xmm2,XMMWORD PTR [rbx+0x80]
     1364f41:	0f 29 54 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm2
     1364f46:	66 0f 29 4c 24 50    	movapd XMMWORD PTR [rsp+0x50],xmm1
     1364f4c:	66 0f 29 44 24 40    	movapd XMMWORD PTR [rsp+0x40],xmm0
     1364f52:	e9 c4 00 00 00       	jmp    136501b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa59f>
     1364f57:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
     1364f5b:	48 8b 78 18          	mov    rdi,QWORD PTR [rax+0x18]
     1364f5f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1364f62:	ff 50 10             	call   QWORD PTR [rax+0x10]
     1364f65:	66 0f 10 00          	movupd xmm0,XMMWORD PTR [rax]
     1364f69:	0f 10 48 10          	movups xmm1,XMMWORD PTR [rax+0x10]
     1364f6d:	0f 10 50 20          	movups xmm2,XMMWORD PTR [rax+0x20]
     1364f71:	66 0f 29 84 24 80 00 	movapd XMMWORD PTR [rsp+0x80],xmm0
     1364f78:	00 00 
     1364f7a:	0f 29 8c 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm1
     1364f81:	00 
     1364f82:	0f 29 94 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm2
     1364f89:	00 
     1364f8a:	48 8b 40 30          	mov    rax,QWORD PTR [rax+0x30]

## Decision criteria
- Reject if this+0x50 is ordinary state/container data or its first word is not a stable vptr.
- Reject if dependency vtable +0x68 is destructor/delete.
- Even a live +0x68 operation does not prove identity without table[184] population dataflow.
