# Service184 candidate 0x1867b28 and embedded execution dependency

Why this candidate matters:
- it is one of only two actually materialized vtables matching the proven real service184 +0x28/+0x30/+0x38 ABI
- its +0x38 implementation is at 0x135c758, directly adjacent to the independently proven real service184 consumer at 0x135c7b3
- its +0x28 method at 0xb00302 returns this+0x50

## Candidate vtable slots
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
- +0x90: 0x135c624 FDE=(20301348, 20301580)
- +0x98: 0x0 FDE=None
- +0xa0: 0x0 FDE=None
- +0xa8: 0x135c286 FDE=(20300422, 20300441)
- +0xb0: 0x135c29a FDE=(20300442, 20300460)
- +0xb8: 0x135c2ac FDE=(20300460, 20300512)
- +0xc0: 0x135c2e0 FDE=(20300512, 20300538)
- +0xc8: 0x135c2fa FDE=(20300538, 20300547)
- +0xd0: 0x135c304 FDE=(20300548, 20300570)
- +0xd8: 0x135c31a FDE=(20300570, 20301112)
- +0xe0: 0x0 FDE=None
- +0xe8: 0x0 FDE=None
- +0xf0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xf8: 0xa50370 FDE=(10814320, 10814325)

## Candidate methods +0x28/+0x30/+0x38/+0x68
### +0x28 -> 0xb00302
FDE=(11535106, 11535111)
      b00302:	48 8d 47 50          	lea    rax,[rdi+0x50]
      b00306:	c3                   	ret

### +0x30 -> 0x11ca6fe
FDE=(18654974, 18654982)
     11ca6fe:	48 8d 87 d0 00 00 00 	lea    rax,[rdi+0xd0]
     11ca705:	c3                   	ret

### +0x38 -> 0x135c758
FDE=(20301656, 20301681)
     135c758:	48 89 f8             	mov    rax,rdi
     135c75b:	48 8b 4e 48          	mov    rcx,QWORD PTR [rsi+0x48]
     135c75f:	0f 28 46 40          	movaps xmm0,XMMWORD PTR [rsi+0x40]
     135c763:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     135c766:	48 85 c9             	test   rcx,rcx
     135c769:	74 05                	je     135c770 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1cf4>
     135c76b:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     135c770:	c3                   	ret

### +0x68 -> 0x135c5c4
FDE=(20301252, 20301270)
     135c5c4:	53                   	push   rbx
     135c5c5:	48 89 fb             	mov    rbx,rdi
     135c5c8:	e8 e3 ff ff ff       	call   135c5b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1b34>
     135c5cd:	48 89 df             	mov    rdi,rbx
     135c5d0:	5b                   	pop    rbx
     135c5d1:	e9 4a 19 49 00       	jmp    17edf20 <_ZdlPv@plt>

## Full constructor FDE containing 0x135a7e1
FDE=(20293452, 20300282)
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
     135a90c:	41 59                	pop    r9
     135a90e:	4c 89 e2             	mov    rdx,r12
     135a911:	e8 48 cc 28 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
     135a916:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135a919:	4c 89 f7             	mov    rdi,r14
     135a91c:	48 89 6c 24 78       	mov    QWORD PTR [rsp+0x78],rbp
     135a921:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135a924:	48 89 c3             	mov    rbx,rax
     135a927:	bf 88 00 00 00       	mov    edi,0x88
     135a92c:	e8 cf 35 49 00       	call   17edf00 <_Znwm@plt>
     135a931:	49 89 c5             	mov    r13,rax
     135a934:	48 8b 83 f0 00 00 00 	mov    rax,QWORD PTR [rbx+0xf0]
     135a93b:	f3 0f 6f 83 e8 00 00 	movdqu xmm0,XMMWORD PTR [rbx+0xe8]
     135a942:	00 
     135a943:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
     135a949:	48 85 c0             	test   rax,rax
     135a94c:	74 05                	je     135a953 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19fed7>
     135a94e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135a953:	4c 89 ef             	mov    rdi,r13
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
     135a9c0:	48 8d 94 24 c8 00 00 	lea    rdx,[rsp+0xc8]
     135a9c7:	00 
     135a9c8:	4c 89 fe             	mov    rsi,r15
     135a9cb:	ff 50 18             	call   QWORD PTR [rax+0x18]
     135a9ce:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135a9d1:	4c 89 f7             	mov    rdi,r14
     135a9d4:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135a9d7:	49 89 c5             	mov    r13,rax
     135a9da:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135a9dd:	4c 89 f7             	mov    rdi,r14
     135a9e0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135a9e3:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
     135a9ea:	00 
     135a9eb:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135a9ee:	4c 89 f7             	mov    rdi,r14
     135a9f1:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135a9f4:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     135a9f9:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135a9fc:	4c 89 f7             	mov    rdi,r14
     135a9ff:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135aa02:	49 8b 06             	mov    rax,QWORD PTR [r14]
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
     135aa60:	6a 29                	push   0x29
     135aa62:	41 58                	pop    r8
     135aa64:	4c 89 f2             	mov    rdx,r14
     135aa67:	45 31 c9             	xor    r9d,r9d
     135aa6a:	e8 ef ca 28 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
     135aa6f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135aa72:	48 8d 35 a7 b1 0d ff 	lea    rsi,[rip+0xffffffffff0db1a7]        # 435c20 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b66f>
     135aa79:	48 8d 0d c0 b1 0d ff 	lea    rcx,[rip+0xffffffffff0db1c0]        # 435c40 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b68f>
     135aa80:	6a 1a                	push   0x1a
     135aa82:	41 58                	pop    r8
     135aa84:	4c 89 f2             	mov    rdx,r14
     135aa87:	45 31 c9             	xor    r9d,r9d
     135aa8a:	68 80 96 98 00       	push   0x989680
     135aa8f:	6a 00                	push   0x0
     135aa91:	e8 5c cb 28 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
     135aa96:	48 83 c4 10          	add    rsp,0x10
     135aa9a:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135aa9d:	48 8d 35 bc b1 0d ff 	lea    rsi,[rip+0xffffffffff0db1bc]        # 435c60 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b6af>
     135aaa4:	48 8d 0d d5 b1 0d ff 	lea    rcx,[rip+0xffffffffff0db1d5]        # 435c80 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b6cf>
     135aaab:	6a 1b                	push   0x1b
     135aaad:	41 58                	pop    r8
     135aaaf:	4c 89 f2             	mov    rdx,r14
     135aab2:	45 31 c9             	xor    r9d,r9d
     135aab5:	e8 a4 ca 28 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
     135aaba:	48 8b 2b             	mov    rbp,QWORD PTR [rbx]
     135aabd:	48 8d 35 00 b1 0d ff 	lea    rsi,[rip+0xffffffffff0db100]        # 435bc4 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b613>
     135aac4:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     135aacb:	00 
     135aacc:	e8 ad ef 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135aad1:	48 8d bc 24 48 02 00 	lea    rdi,[rsp+0x248]
     135aad8:	00 
     135aad9:	48 8d 35 71 32 ff fe 	lea    rsi,[rip+0xfffffffffeff3271]        # 34dd51 <_ZTSSt12bad_any_cast@@Base-0x42477>
     135aae0:	e8 99 ef 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135aae5:	4c 8d b4 24 90 01 00 	lea    r14,[rsp+0x190]
     135aaec:	00 
     135aaed:	48 8d b4 24 30 02 00 	lea    rsi,[rsp+0x230]
     135aaf4:	00 
     135aaf5:	6a 02                	push   0x2
     135aaf7:	5a                   	pop    rdx
     135aaf8:	4c 89 f7             	mov    rdi,r14
     135aafb:	e8 58 c9 74 ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
     135ab00:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
     135ab05:	6a 18                	push   0x18
     135ab07:	5b                   	pop    rbx
     135ab08:	48 8d 3c 1c          	lea    rdi,[rsp+rbx*1]
     135ab0c:	48 81 c7 30 02 00 00 	add    rdi,0x230
     135ab13:	e8 78 33 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     135ab18:	48 83 c3 e8          	add    rbx,0xffffffffffffffe8
     135ab1c:	48 83 fb e8          	cmp    rbx,0xffffffffffffffe8
     135ab20:	75 e6                	jne    135ab08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a008c>
     135ab22:	48 8d 35 77 b1 0d ff 	lea    rsi,[rip+0xffffffffff0db177]        # 435ca0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b6ef>
     135ab29:	48 8d 0d 90 b1 0d ff 	lea    rcx,[rip+0xffffffffff0db190]        # 435cc0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b70f>
     135ab30:	4c 8d 0d 8d b0 0d ff 	lea    r9,[rip+0xffffffffff0db08d]        # 435bc4 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b613>
     135ab37:	6a 10                	push   0x10
     135ab39:	41 5c                	pop    r12
     135ab3b:	6a 11                	push   0x11
     135ab3d:	41 58                	pop    r8
     135ab3f:	48 89 ef             	mov    rdi,rbp
     135ab42:	4c 89 e2             	mov    rdx,r12
     135ab45:	41 56                	push   r14
     135ab47:	6a 08                	push   0x8
     135ab49:	e8 40 cb 28 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
     135ab4e:	58                   	pop    rax
     135ab4f:	59                   	pop    rcx
     135ab50:	4c 89 f7             	mov    rdi,r14
     135ab53:	e8 90 0a 72 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     135ab58:	4c 8b 7c 24 08       	mov    r15,QWORD PTR [rsp+0x8]
     135ab5d:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     135ab60:	48 8d 1d d9 af 0d ff 	lea    rbx,[rip+0xffffffffff0dafd9]        # 435b40 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b58f>
     135ab67:	48 8d 2d f2 af 0d ff 	lea    rbp,[rip+0xffffffffff0daff2]        # 435b60 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b5af>
     135ab6e:	6a 27                	push   0x27
     135ab70:	41 5e                	pop    r14
     135ab72:	48 89 de             	mov    rsi,rbx
     135ab75:	4c 89 e2             	mov    rdx,r12
     135ab78:	48 89 e9             	mov    rcx,rbp
     135ab7b:	4d 89 f0             	mov    r8,r14
     135ab7e:	45 31 c9             	xor    r9d,r9d
     135ab81:	e8 d8 c9 28 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
     135ab86:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     135ab89:	48 8d 35 00 b0 0d ff 	lea    rsi,[rip+0xffffffffff0db000]        # 435b90 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b5df>
     135ab90:	48 8d 0d 19 b0 0d ff 	lea    rcx,[rip+0xffffffffff0db019]        # 435bb0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b5ff>
     135ab97:	6a 13                	push   0x13
     135ab99:	41 58                	pop    r8
     135ab9b:	4c 89 e2             	mov    rdx,r12
     135ab9e:	45 31 c9             	xor    r9d,r9d
     135aba1:	e8 b8 c9 28 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
     135aba6:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     135aba9:	48 89 de             	mov    rsi,rbx
     135abac:	4c 89 e2             	mov    rdx,r12
     135abaf:	48 89 e9             	mov    rcx,rbp
     135abb2:	4d 89 f0             	mov    r8,r14
     135abb5:	45 31 c9             	xor    r9d,r9d
     135abb8:	e8 cd c7 28 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
     135abbd:	84 c0                	test   al,al
     135abbf:	74 64                	je     135ac25 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a01a9>
     135abc1:	bf a0 00 00 00       	mov    edi,0xa0
     135abc6:	e8 35 33 49 00       	call   17edf00 <_Znwm@plt>
     135abcb:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     135abd0:	66 0f ef c0          	pxor   xmm0,xmm0
     135abd4:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     135abd9:	48 8d 0d a8 95 51 00 	lea    rcx,[rip+0x5195a8]        # 1874188 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x30870>
     135abe0:	48 89 08             	mov    QWORD PTR [rax],rcx
     135abe3:	48 89 c1             	mov    rcx,rax
     135abe6:	48 83 c1 20          	add    rcx,0x20
     135abea:	48 8d 15 df a1 51 00 	lea    rdx,[rip+0x51a1df]        # 1874dd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x314b8>
     135abf1:	48 89 50 20          	mov    QWORD PTR [rax+0x20],rdx
     135abf5:	66 0f 7f 40 30       	movdqa XMMWORD PTR [rax+0x30],xmm0
     135abfa:	48 83 60 40 00       	and    QWORD PTR [rax+0x40],0x0
     135abff:	48 83 60 70 00       	and    QWORD PTR [rax+0x70],0x0
     135ac04:	48 8b 54 24 40       	mov    rdx,QWORD PTR [rsp+0x40]
     135ac09:	48 89 90 80 00 00 00 	mov    QWORD PTR [rax+0x80],rdx
     135ac10:	f3 0f 7f 80 88 00 00 	movdqu XMMWORD PTR [rax+0x88],xmm0
     135ac17:	00 
     135ac18:	48 83 a0 98 00 00 00 	and    QWORD PTR [rax+0x98],0x0
     135ac1f:	00 
     135ac20:	e9 88 00 00 00       	jmp    135acad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0231>
     135ac25:	bf f0 00 00 00       	mov    edi,0xf0
     135ac2a:	e8 d1 32 49 00       	call   17edf00 <_Znwm@plt>
     135ac2f:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     135ac34:	66 0f ef c0          	pxor   xmm0,xmm0
     135ac38:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     135ac3d:	48 8d 0d 7c 95 51 00 	lea    rcx,[rip+0x51957c]        # 18741c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x308a8>
     135ac44:	48 89 08             	mov    QWORD PTR [rax],rcx
     135ac47:	48 8d 0d a2 a0 51 00 	lea    rcx,[rip+0x51a0a2]        # 1874cf0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x313d8>
     135ac4e:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
     135ac52:	48 89 c1             	mov    rcx,rax
     135ac55:	48 83 c1 28          	add    rcx,0x28
     135ac59:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
     135ac5d:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx
     135ac61:	f3 0f 7f 40 38       	movdqu XMMWORD PTR [rax+0x38],xmm0
     135ac66:	48 83 60 58 00       	and    QWORD PTR [rax+0x58],0x0
     135ac6b:	f3 0f 7f 40 48       	movdqu XMMWORD PTR [rax+0x48],xmm0
     135ac70:	c7 40 60 00 00 80 3f 	mov    DWORD PTR [rax+0x60],0x3f800000
     135ac77:	b9 f4 01 00 00       	mov    ecx,0x1f4
     135ac7c:	48 89 48 68          	mov    QWORD PTR [rax+0x68],rcx
     135ac80:	48 89 48 70          	mov    QWORD PTR [rax+0x70],rcx
     135ac84:	48 83 a0 c0 00 00 00 	and    QWORD PTR [rax+0xc0],0x0
     135ac8b:	00 
     135ac8c:	48 83 a0 e0 00 00 00 	and    QWORD PTR [rax+0xe0],0x0
     135ac93:	00 
     135ac94:	48 8d 48 20          	lea    rcx,[rax+0x20]
     135ac98:	66 0f 7f 80 d0 00 00 	movdqa XMMWORD PTR [rax+0xd0],xmm0
     135ac9f:	00 
     135aca0:	f3 0f 7f 40 78       	movdqu XMMWORD PTR [rax+0x78],xmm0
     135aca5:	f3 0f 7f 80 88 00 00 	movdqu XMMWORD PTR [rax+0x88],xmm0
     135acac:	00 
     135acad:	66 48 0f 6e c0       	movq   xmm0,rax
     135acb2:	66 48 0f 6e c9       	movq   xmm1,rcx
     135acb7:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
     135acbb:	4c 8b 74 24 20       	mov    r14,QWORD PTR [rsp+0x20]
     135acc0:	49 8b 7e 48          	mov    rdi,QWORD PTR [r14+0x48]
     135acc4:	f3 41 0f 7f 4e 40    	movdqu XMMWORD PTR [r14+0x40],xmm1
     135acca:	e8 b7 37 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135accf:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     135acd4:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135acd7:	48 8d 35 12 ae 0d ff 	lea    rsi,[rip+0xffffffffff0dae12]        # 435af0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b53f>
     135acde:	48 8d 0d 2b ae 0d ff 	lea    rcx,[rip+0xffffffffff0dae2b]        # 435b10 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b55f>
     135ace5:	6a 10                	push   0x10
     135ace7:	5a                   	pop    rdx
     135ace8:	6a 29                	push   0x29
     135acea:	41 58                	pop    r8
     135acec:	45 31 c9             	xor    r9d,r9d
     135acef:	e8 96 c6 28 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
     135acf4:	66 0f ef c0          	pxor   xmm0,xmm0
     135acf8:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     135acfe:	84 c0                	test   al,al
     135ad00:	0f 84 f8 00 00 00    	je     135adfe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0382>
     135ad06:	bf 90 00 00 00       	mov    edi,0x90
     135ad0b:	e8 f0 31 49 00       	call   17edf00 <_Znwm@plt>
     135ad10:	49 89 c4             	mov    r12,rax
     135ad13:	66 0f ef c0          	pxor   xmm0,xmm0
     135ad17:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     135ad1c:	48 8d 05 45 27 4a 00 	lea    rax,[rip+0x4a2745]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     135ad23:	49 89 04 24          	mov    QWORD PTR [r12],rax
     135ad27:	49 8d 5c 24 18       	lea    rbx,[r12+0x18]
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
     135adf0:	31 ff                	xor    edi,edi
     135adf2:	e8 8f 36 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135adf7:	31 ff                	xor    edi,edi
     135adf9:	e8 88 36 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135adfe:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     135ae03:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135ae06:	48 8d 35 83 ad 0d ff 	lea    rsi,[rip+0xffffffffff0dad83]        # 435b90 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b5df>
     135ae0d:	48 8d 0d 9c ad 0d ff 	lea    rcx,[rip+0xffffffffff0dad9c]        # 435bb0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b5ff>
     135ae14:	6a 10                	push   0x10
     135ae16:	5a                   	pop    rdx
     135ae17:	6a 13                	push   0x13
     135ae19:	41 58                	pop    r8
     135ae1b:	45 31 c9             	xor    r9d,r9d
     135ae1e:	e8 67 c5 28 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
     135ae23:	88 84 24 30 02 00 00 	mov    BYTE PTR [rsp+0x230],al
     135ae2a:	49 8b b7 50 01 00 00 	mov    rsi,QWORD PTR [r15+0x150]
     135ae31:	48 85 f6             	test   rsi,rsi
     135ae34:	0f 84 5f 10 00 00    	je     135be99 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a141d>
     135ae3a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     135ae3d:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
     135ae44:	00 
     135ae45:	48 8d 94 24 30 02 00 	lea    rdx,[rsp+0x230]
     135ae4c:	00 
     135ae4d:	ff 50 30             	call   QWORD PTR [rax+0x30]
     135ae50:	bf 80 0c 00 00       	mov    edi,0xc80
     135ae55:	e8 a6 30 49 00       	call   17edf00 <_Znwm@plt>
     135ae5a:	49 89 c4             	mov    r12,rax
     135ae5d:	66 0f ef c0          	pxor   xmm0,xmm0
     135ae61:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     135ae66:	48 8d 05 5b ff 4a 00 	lea    rax,[rip+0x4aff5b]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
     135ae6d:	49 89 04 24          	mov    QWORD PTR [r12],rax
     135ae71:	48 8d 05 80 93 51 00 	lea    rax,[rip+0x519380]        # 18741f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x308e0>
     135ae78:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
     135ae7d:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     135ae82:	48 8b 81 e8 00 00 00 	mov    rax,QWORD PTR [rcx+0xe8]
     135ae89:	49 89 44 24 28       	mov    QWORD PTR [r12+0x28],rax
     135ae8e:	48 8b 81 f0 00 00 00 	mov    rax,QWORD PTR [rcx+0xf0]
     135ae95:	49 89 44 24 30       	mov    QWORD PTR [r12+0x30],rax
     135ae9a:	48 85 c0             	test   rax,rax
     135ae9d:	74 05                	je     135aea4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0428>
     135ae9f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135aea4:	49 8b 45 10          	mov    rax,QWORD PTR [r13+0x10]
     135aea8:	49 89 44 24 38       	mov    QWORD PTR [r12+0x38],rax
     135aead:	49 8b 45 18          	mov    rax,QWORD PTR [r13+0x18]
     135aeb1:	49 89 44 24 40       	mov    QWORD PTR [r12+0x40],rax
     135aeb6:	48 85 c0             	test   rax,rax
     135aeb9:	74 05                	je     135aec0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0444>
     135aebb:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135aec0:	49 8b 46 48          	mov    rax,QWORD PTR [r14+0x48]
     135aec4:	41 0f 10 46 40       	movups xmm0,XMMWORD PTR [r14+0x40]
     135aec9:	41 0f 11 44 24 48    	movups XMMWORD PTR [r12+0x48],xmm0
     135aecf:	48 85 c0             	test   rax,rax
     135aed2:	74 05                	je     135aed9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a045d>
     135aed4:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135aed9:	48 8b 84 24 f8 00 00 	mov    rax,QWORD PTR [rsp+0xf8]
     135aee0:	00 
     135aee1:	66 0f 6f 84 24 f0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xf0]
     135aee8:	00 00 
     135aeea:	f3 41 0f 7f 44 24 58 	movdqu XMMWORD PTR [r12+0x58],xmm0
     135aef1:	48 85 c0             	test   rax,rax
     135aef4:	4c 8d b4 24 90 01 00 	lea    r14,[rsp+0x190]
     135aefb:	00 
     135aefc:	74 05                	je     135af03 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0487>
     135aefe:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135af03:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     135af08:	49 89 44 24 68       	mov    QWORD PTR [r12+0x68],rax
     135af0d:	49 8d 7c 24 70       	lea    rdi,[r12+0x70]
     135af12:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
     135af17:	e8 72 d3 7c ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     135af1c:	49 8d bc 24 c8 00 00 	lea    rdi,[r12+0xc8]
     135af23:	00 
     135af24:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
     135af29:	e8 60 d3 7c ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     135af2e:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     135af33:	49 89 84 24 20 01 00 	mov    QWORD PTR [r12+0x120],rax
     135af3a:	00 
     135af3b:	49 8d 9c 24 30 01 00 	lea    rbx,[r12+0x130]
     135af42:	00 
     135af43:	48 8d 05 56 93 51 00 	lea    rax,[rip+0x519356]        # 18742a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x30988>
     135af4a:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax
     135af51:	00 
     135af52:	4c 89 b4 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],r14
     135af59:	00 
     135af5a:	66 0f ef c0          	pxor   xmm0,xmm0
     135af5e:	48 8d ac 24 48 02 00 	lea    rbp,[rsp+0x248]
     135af65:	00 
     135af66:	66 0f 7f 45 e8       	movdqa XMMWORD PTR [rbp-0x18],xmm0
     135af6b:	48 83 65 f8 00       	and    QWORD PTR [rbp-0x8],0x0
     135af70:	48 89 ef             	mov    rdi,rbp
     135af73:	e8 f0 e2 31 00       	call   1679268 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d3d4>
     135af78:	31 c0                	xor    eax,eax
     135af7a:	88 85 70 04 00 00    	mov    BYTE PTR [rbp+0x470],al
     135af80:	88 85 e0 08 00 00    	mov    BYTE PTR [rbp+0x8e0],al
     135af86:	88 85 e8 08 00 00    	mov    BYTE PTR [rbp+0x8e8],al
     135af8c:	88 85 00 09 00 00    	mov    BYTE PTR [rbp+0x900],al
     135af92:	83 a5 08 09 00 00 00 	and    DWORD PTR [rbp+0x908],0x0
     135af99:	88 85 90 09 00 00    	mov    BYTE PTR [rbp+0x990],al
     135af9f:	88 85 98 09 00 00    	mov    BYTE PTR [rbp+0x998],al
     135afa5:	88 85 00 0a 00 00    	mov    BYTE PTR [rbp+0xa00],al
     135afab:	83 a5 24 0a 00 00 00 	and    DWORD PTR [rbp+0xa24],0x0
     135afb2:	88 85 28 0a 00 00    	mov    BYTE PTR [rbp+0xa28],al
     135afb8:	66 0f ef c0          	pxor   xmm0,xmm0
     135afbc:	f3 0f 7f 85 60 0a 00 	movdqu XMMWORD PTR [rbp+0xa60],xmm0
     135afc3:	00 
     135afc4:	f3 0f 7f 85 70 0a 00 	movdqu XMMWORD PTR [rbp+0xa70],xmm0
     135afcb:	00 
     135afcc:	f3 0f 7f 85 10 09 00 	movdqu XMMWORD PTR [rbp+0x910],xmm0
     135afd3:	00 
     135afd4:	f3 0f 7f 85 19 09 00 	movdqu XMMWORD PTR [rbp+0x919],xmm0
     135afdb:	00 
     135afdc:	66 0f 7f 85 08 0a 00 	movdqa XMMWORD PTR [rbp+0xa08],xmm0
     135afe3:	00 
     135afe4:	f3 0f 7f 85 12 0a 00 	movdqu XMMWORD PTR [rbp+0xa12],xmm0
     135afeb:	00 
     135afec:	f3 0f 7f 85 30 0a 00 	movdqu XMMWORD PTR [rbp+0xa30],xmm0
     135aff3:	00 
     135aff4:	f3 0f 7f 85 40 0a 00 	movdqu XMMWORD PTR [rbp+0xa40],xmm0
     135affb:	00 
     135affc:	f3 0f 7f 85 49 0a 00 	movdqu XMMWORD PTR [rbp+0xa49],xmm0
     135b003:	00 
     135b004:	c7 85 80 0a 00 00 00 	mov    DWORD PTR [rbp+0xa80],0x3f800000
     135b00b:	00 80 3f 
     135b00e:	88 85 88 0a 00 00    	mov    BYTE PTR [rbp+0xa88],al
     135b014:	88 85 b8 0a 00 00    	mov    BYTE PTR [rbp+0xab8],al
     135b01a:	f3 0f 7f 85 90 0a 00 	movdqu XMMWORD PTR [rbp+0xa90],xmm0
     135b021:	00 
     135b022:	88 85 a0 0a 00 00    	mov    BYTE PTR [rbp+0xaa0],al
     135b028:	49 89 9c 24 50 01 00 	mov    QWORD PTR [r12+0x150],rbx
     135b02f:	00 
     135b030:	4c 89 f7             	mov    rdi,r14
     135b033:	48 89 5c 24 40       	mov    QWORD PTR [rsp+0x40],rbx
     135b038:	48 89 de             	mov    rsi,rbx
     135b03b:	e8 d6 71 10 00       	call   1462216 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a779a>
     135b040:	4d 8d b4 24 60 01 00 	lea    r14,[r12+0x160]
     135b047:	00 
     135b048:	49 83 a4 24 60 01 00 	and    QWORD PTR [r12+0x160],0x0
     135b04f:	00 00 
     135b051:	49 83 a4 24 70 01 00 	and    QWORD PTR [r12+0x170],0x0
     135b058:	00 00 
     135b05a:	49 8d bc 24 80 01 00 	lea    rdi,[r12+0x180]
     135b061:	00 
     135b062:	48 8d b4 24 30 02 00 	lea    rsi,[rsp+0x230]
     135b069:	00 
     135b06a:	e8 0d 15 10 00       	call   145c57c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a1b00>
     135b06f:	66 0f ef c0          	pxor   xmm0,xmm0
     135b073:	f3 41 0f 7f 84 24 58 	movdqu XMMWORD PTR [r12+0xc58],xmm0
     135b07a:	0c 00 00 
     135b07d:	49 83 a4 24 68 0c 00 	and    QWORD PTR [r12+0xc68],0x0
     135b084:	00 00 
     135b086:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     135b08d:	00 
     135b08e:	e8 8d 17 10 00       	call   145c820 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a1da4>
     135b093:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     135b09a:	00 
     135b09b:	e8 ca ee 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135b0a0:	49 8d bc 24 70 0c 00 	lea    rdi,[r12+0xc70]
     135b0a7:	00 
     135b0a8:	48 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],rdi
     135b0ad:	e8 44 e9 47 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     135b0b2:	e8 f0 26 17 00       	call   14cd7a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x312d2b>
     135b0b7:	49 8d 44 24 20       	lea    rax,[r12+0x20]
     135b0bc:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
     135b0c3:	00 
     135b0c4:	49 8d 84 24 58 0c 00 	lea    rax,[r12+0xc58]
     135b0cb:	00 
     135b0cc:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
     135b0d3:	00 
     135b0d4:	4c 8d 3d 35 47 69 00 	lea    r15,[rip+0x694735]        # 19ef810 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xf40>
     135b0db:	6a 01                	push   0x1
     135b0dd:	5d                   	pop    rbp
     135b0de:	4d 8b 3f             	mov    r15,QWORD PTR [r15]
     135b0e1:	4d 85 ff             	test   r15,r15
     135b0e4:	74 25                	je     135b10b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a068f>
     135b0e6:	49 8d 5f 10          	lea    rbx,[r15+0x10]
     135b0ea:	49 8b 7d 10          	mov    rdi,QWORD PTR [r13+0x10]
     135b0ee:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135b0f1:	48 89 de             	mov    rsi,rbx
     135b0f4:	ff 50 40             	call   QWORD PTR [rax+0x40]
     135b0f7:	49 8b 7d 10          	mov    rdi,QWORD PTR [r13+0x10]
     135b0fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135b0fe:	48 89 de             	mov    rsi,rbx
     135b101:	89 ea                	mov    edx,ebp
     135b103:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
     135b109:	eb d3                	jmp    135b0de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0662>
     135b10b:	49 8b 5c 24 38       	mov    rbx,QWORD PTR [r12+0x38]
     135b110:	48 8d ac 24 10 01 00 	lea    rbp,[rsp+0x110]
     135b117:	00 
     135b118:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     135b11d:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     135b121:	48 8d 35 69 1f 74 ff 	lea    rsi,[rip+0xffffffffff741f69]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     135b128:	48 8d 0d 8b 17 10 00 	lea    rcx,[rip+0x10178b]        # 145c8ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a1e3e>
     135b12f:	4c 8d bc 24 30 02 00 	lea    r15,[rsp+0x230]
     135b136:	00 
     135b137:	6a 08                	push   0x8
     135b139:	41 59                	pop    r9
     135b13b:	4c 89 ff             	mov    rdi,r15
     135b13e:	31 d2                	xor    edx,edx
     135b140:	49 89 e8             	mov    r8,rbp
     135b143:	e8 4c f6 47 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     135b148:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     135b14b:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     135b152:	00 
     135b153:	48 89 de             	mov    rsi,rbx
     135b156:	4c 89 fa             	mov    rdx,r15
     135b159:	ff 50 18             	call   QWORD PTR [rax+0x18]
     135b15c:	48 8d 9c 24 90 01 00 	lea    rbx,[rsp+0x190]
     135b163:	00 
     135b164:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     135b169:	48 89 de             	mov    rsi,rbx
     135b16c:	e8 81 ea 47 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     135b171:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     135b175:	e8 0c 33 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135b17a:	48 8d 9c 24 30 02 00 	lea    rbx,[rsp+0x230]
     135b181:	00 
     135b182:	48 89 df             	mov    rdi,rbx
     135b185:	e8 5e f6 47 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     135b18a:	48 8d 05 3f eb 4a 00 	lea    rax,[rip+0x4aeb3f]        # 1809cd0 <_ZTIN4asio22service_already_existsE@@Base+0xb4b8>
     135b191:	48 89 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rax
     135b198:	00 
     135b199:	48 89 ac 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rbp
     135b1a0:	00 
     135b1a1:	49 8b ac 24 20 01 00 	mov    rbp,QWORD PTR [r12+0x120]
     135b1a8:	00 
     135b1a9:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     135b1ae:	48 8b 41 48          	mov    rax,QWORD PTR [rcx+0x48]
     135b1b2:	0f 10 41 40          	movups xmm0,XMMWORD PTR [rcx+0x40]
     135b1b6:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
     135b1b9:	48 85 c0             	test   rax,rax
     135b1bc:	74 05                	je     135b1c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0747>
     135b1be:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135b1c3:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     135b1c9:	66 0f 7f 84 24 40 02 	movdqa XMMWORD PTR [rsp+0x240],xmm0
     135b1d0:	00 00 
     135b1d2:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
     135b1d9:	48 85 db             	test   rbx,rbx
     135b1dc:	74 05                	je     135b1e3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0767>
     135b1de:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
     135b1e3:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     135b1e8:	48 8b 81 f0 00 00 00 	mov    rax,QWORD PTR [rcx+0xf0]
     135b1ef:	0f 10 81 e8 00 00 00 	movups xmm0,XMMWORD PTR [rcx+0xe8]
     135b1f6:	0f 29 84 24 50 02 00 	movaps XMMWORD PTR [rsp+0x250],xmm0
     135b1fd:	00 
     135b1fe:	48 85 c0             	test   rax,rax
     135b201:	74 05                	je     135b208 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a078c>
     135b203:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135b208:	49 8b 45 18          	mov    rax,QWORD PTR [r13+0x18]
     135b20c:	41 0f 28 45 10       	movaps xmm0,XMMWORD PTR [r13+0x10]
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
     135b275:	0f 28 84 24 00 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x100]
     135b27c:	00 
     135b27d:	0f 29 84 24 90 02 00 	movaps XMMWORD PTR [rsp+0x290],xmm0
     135b284:	00 
     135b285:	48 85 c0             	test   rax,rax
     135b288:	74 05                	je     135b28f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0813>
     135b28a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135b28f:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     135b294:	48 89 84 24 a0 02 00 	mov    QWORD PTR [rsp+0x2a0],rax
     135b29b:	00 
     135b29c:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
     135b2a1:	48 89 84 24 a8 02 00 	mov    QWORD PTR [rsp+0x2a8],rax
     135b2a8:	00 
     135b2a9:	48 8b 8c 24 a8 00 00 	mov    rcx,QWORD PTR [rsp+0xa8]
     135b2b0:	00 
     135b2b1:	48 8b 41 48          	mov    rax,QWORD PTR [rcx+0x48]
     135b2b5:	66 0f 6f 41 40       	movdqa xmm0,XMMWORD PTR [rcx+0x40]
     135b2ba:	66 0f 7f 84 24 b0 02 	movdqa XMMWORD PTR [rsp+0x2b0],xmm0
     135b2c1:	00 00 
     135b2c3:	48 85 c0             	test   rax,rax
     135b2c6:	74 05                	je     135b2cd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0851>
     135b2c8:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135b2cd:	4c 8d bc 24 c0 02 00 	lea    r15,[rsp+0x2c0]
     135b2d4:	00 
     135b2d5:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
     135b2dc:	00 
     135b2dd:	4c 89 ff             	mov    rdi,r15
     135b2e0:	e8 c3 16 10 00       	call   145c9a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a1f2c>
     135b2e5:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
     135b2ea:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
     135b2ee:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
     135b2f3:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
     135b2f7:	49 89 6f 40          	mov    QWORD PTR [r15+0x40],rbp
     135b2fb:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     135b300:	49 89 47 48          	mov    QWORD PTR [r15+0x48],rax
     135b304:	48 83 a4 24 b0 01 00 	and    QWORD PTR [rsp+0x1b0],0x0
     135b30b:	00 00 
     135b30d:	bf f0 00 00 00       	mov    edi,0xf0
     135b312:	e8 e9 2b 49 00       	call   17edf00 <_Znwm@plt>
     135b317:	49 89 c5             	mov    r13,rax
     135b31a:	48 8d 05 87 93 51 00 	lea    rax,[rip+0x519387]        # 18746a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x30d90>
     135b321:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     135b325:	48 8b 84 24 38 02 00 	mov    rax,QWORD PTR [rsp+0x238]
     135b32c:	00 
     135b32d:	0f 28 84 24 30 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x230]
     135b334:	00 
     135b335:	41 0f 11 45 10       	movups XMMWORD PTR [r13+0x10],xmm0
     135b33a:	48 85 c0             	test   rax,rax
     135b33d:	74 05                	je     135b344 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a08c8>
     135b33f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135b344:	48 8b 84 24 48 02 00 	mov    rax,QWORD PTR [rsp+0x248]
     135b34b:	00 
     135b34c:	0f 28 84 24 40 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x240]
     135b353:	00 
     135b354:	41 0f 11 45 20       	movups XMMWORD PTR [r13+0x20],xmm0
     135b359:	48 85 c0             	test   rax,rax
     135b35c:	74 05                	je     135b363 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a08e7>
     135b35e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135b363:	48 8b 84 24 58 02 00 	mov    rax,QWORD PTR [rsp+0x258]
     135b36a:	00 
     135b36b:	0f 28 84 24 50 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x250]
     135b372:	00 
     135b373:	41 0f 11 45 30       	movups XMMWORD PTR [r13+0x30],xmm0
     135b378:	48 85 c0             	test   rax,rax
     135b37b:	74 05                	je     135b382 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0906>
     135b37d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
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
     135b41a:	0f 28 43 c0          	movaps xmm0,XMMWORD PTR [rbx-0x40]
     135b41e:	41 0f 11 85 90 00 00 	movups XMMWORD PTR [r13+0x90],xmm0
     135b425:	00 
     135b426:	48 85 c0             	test   rax,rax
     135b429:	74 05                	je     135b430 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a09b4>
     135b42b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135b430:	4c 89 ef             	mov    rdi,r13
     135b433:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
     135b43a:	4c 89 fe             	mov    rsi,r15
     135b43d:	e8 66 15 10 00       	call   145c9a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a1f2c>
     135b442:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
     135b446:	66 0f 6f 4b 10       	movdqa xmm1,XMMWORD PTR [rbx+0x10]
     135b44b:	66 41 0f 7f 8d e0 00 	movdqa XMMWORD PTR [r13+0xe0],xmm1
     135b452:	00 00 
     135b454:	66 41 0f 7f 85 d0 00 	movdqa XMMWORD PTR [r13+0xd0],xmm0
     135b45b:	00 00 
     135b45d:	4c 89 ac 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],r13
     135b464:	00 
     135b465:	48 8d 9c 24 30 02 00 	lea    rbx,[rsp+0x230]
     135b46c:	00 
     135b46d:	48 89 df             	mov    rdi,rbx
     135b470:	e8 77 15 10 00       	call   145c9ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a1f70>
     135b475:	48 8d 05 34 93 51 00 	lea    rax,[rip+0x519334]        # 18747b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x30e98>
     135b47c:	48 89 03             	mov    QWORD PTR [rbx],rax
     135b47f:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
     135b484:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
     135b488:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx
     135b48c:	48 8b b4 24 b0 01 00 	mov    rsi,QWORD PTR [rsp+0x1b0]
     135b493:	00 
     135b494:	48 85 f6             	test   rsi,rsi
     135b497:	0f 84 18 0a 00 00    	je     135beb5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1439>
     135b49d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     135b4a0:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     135b4a7:	00 
     135b4a8:	48 8d 94 24 30 02 00 	lea    rdx,[rsp+0x230]
     135b4af:	00 
     135b4b0:	ff 50 30             	call   QWORD PTR [rax+0x30]
     135b4b3:	48 83 a4 24 e0 01 00 	and    QWORD PTR [rsp+0x1e0],0x0
     135b4ba:	00 00 
     135b4bc:	48 83 a4 24 f0 01 00 	and    QWORD PTR [rsp+0x1f0],0x0
     135b4c3:	00 00 
     135b4c5:	48 8b 84 24 70 01 00 	mov    rax,QWORD PTR [rsp+0x170]
     135b4cc:	00 
     135b4cd:	48 85 c0             	test   rax,rax
     135b4d0:	74 3c                	je     135b50e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0a92>
     135b4d2:	48 8d b4 24 e0 01 00 	lea    rsi,[rsp+0x1e0]
     135b4d9:	00 
     135b4da:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
     135b4de:	6a 01                	push   0x1
     135b4e0:	5f                   	pop    rdi
     135b4e1:	48 8d 94 24 60 01 00 	lea    rdx,[rsp+0x160]
     135b4e8:	00 
     135b4e9:	ff d0                	call   rax
     135b4eb:	48 8b 84 24 78 01 00 	mov    rax,QWORD PTR [rsp+0x178]
     135b4f2:	00 
     135b4f3:	48 89 84 24 f8 01 00 	mov    QWORD PTR [rsp+0x1f8],rax
     135b4fa:	00 
     135b4fb:	48 83 a4 24 70 01 00 	and    QWORD PTR [rsp+0x170],0x0
     135b502:	00 00 
     135b504:	48 8b 84 24 f0 01 00 	mov    rax,QWORD PTR [rsp+0x1f0]
     135b50b:	00 
     135b50c:	eb 02                	jmp    135b510 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0a94>
     135b50e:	31 c0                	xor    eax,eax
     135b510:	48 8d 94 24 e0 01 00 	lea    rdx,[rsp+0x1e0]
     135b517:	00 
     135b518:	4d 89 f7             	mov    r15,r14
     135b51b:	49 89 d6             	mov    r14,rdx
     135b51e:	48 85 c0             	test   rax,rax
     135b521:	74 5f                	je     135b582 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0b06>
     135b523:	48 89 c1             	mov    rcx,rax
     135b526:	49 83 7f 10 00       	cmp    QWORD PTR [r15+0x10],0x0
     135b52b:	b8 00 00 00 00       	mov    eax,0x0
     135b530:	4c 89 fa             	mov    rdx,r15
     135b533:	74 e3                	je     135b518 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0a9c>
     135b535:	48 8d b4 24 18 02 00 	lea    rsi,[rsp+0x218]
     135b53c:	00 
     135b53d:	48 83 26 00          	and    QWORD PTR [rsi],0x0
     135b541:	6a 01                	push   0x1
     135b543:	5f                   	pop    rdi
     135b544:	4c 89 f2             	mov    rdx,r14
     135b547:	ff d1                	call   rcx
     135b549:	6a 01                	push   0x1
     135b54b:	5f                   	pop    rdi
     135b54c:	4c 89 f6             	mov    rsi,r14
     135b54f:	4c 89 fa             	mov    rdx,r15
     135b552:	41 ff 57 10          	call   QWORD PTR [r15+0x10]
     135b556:	6a 01                	push   0x1
     135b558:	5f                   	pop    rdi
     135b559:	48 8d 94 24 18 02 00 	lea    rdx,[rsp+0x218]
     135b560:	00 
     135b561:	4c 89 fe             	mov    rsi,r15
     135b564:	41 ff 56 10          	call   QWORD PTR [r14+0x10]
     135b568:	f3 41 0f 6f 47 10    	movdqu xmm0,XMMWORD PTR [r15+0x10]
     135b56e:	f3 41 0f 6f 4e 10    	movdqu xmm1,XMMWORD PTR [r14+0x10]
     135b574:	f3 41 0f 7f 46 10    	movdqu XMMWORD PTR [r14+0x10],xmm0
     135b57a:	f3 41 0f 7f 4f 10    	movdqu XMMWORD PTR [r15+0x10],xmm1
     135b580:	eb 25                	jmp    135b5a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0b2b>
     135b582:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     135b586:	48 85 c0             	test   rax,rax
     135b589:	74 1c                	je     135b5a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0b2b>
     135b58b:	6a 01                	push   0x1
     135b58d:	5f                   	pop    rdi
     135b58e:	4c 89 f6             	mov    rsi,r14
     135b591:	4c 89 fa             	mov    rdx,r15
     135b594:	ff d0                	call   rax
     135b596:	f3 41 0f 6f 47 10    	movdqu xmm0,XMMWORD PTR [r15+0x10]
     135b59c:	f3 41 0f 7f 46 10    	movdqu XMMWORD PTR [r14+0x10],xmm0
     135b5a2:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     135b5a7:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     135b5ae:	00 
     135b5af:	e8 46 12 10 00       	call   145c7fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a1d7e>
     135b5b4:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     135b5bb:	00 
     135b5bc:	e8 39 12 10 00       	call   145c7fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a1d7e>
     135b5c1:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     135b5c8:	00 
     135b5c9:	e8 9c e9 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135b5ce:	48 8d 9c 24 90 01 00 	lea    rbx,[rsp+0x190]
     135b5d5:	00 
     135b5d6:	48 89 df             	mov    rdi,rbx
     135b5d9:	e8 8c e9 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135b5de:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
     135b5e5:	00 
     135b5e6:	e8 7f e9 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135b5eb:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     135b5f0:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135b5f3:	48 8d 35 66 a6 0d ff 	lea    rsi,[rip+0xffffffffff0da666]        # 435c60 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b6af>
     135b5fa:	48 8d 0d 7f a6 0d ff 	lea    rcx,[rip+0xffffffffff0da67f]        # 435c80 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b6cf>
     135b601:	6a 10                	push   0x10
     135b603:	5a                   	pop    rdx
     135b604:	6a 1b                	push   0x1b
     135b606:	41 58                	pop    r8
     135b608:	45 31 c9             	xor    r9d,r9d
     135b60b:	e8 7a bd 28 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
     135b610:	89 c5                	mov    ebp,eax
     135b612:	48 8d 05 b7 e6 4a 00 	lea    rax,[rip+0x4ae6b7]        # 1809cd0 <_ZTIN4asio22service_already_existsE@@Base+0xb4b8>
     135b619:	48 89 03             	mov    QWORD PTR [rbx],rax
     135b61c:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx
     135b620:	4d 8b ac 24 60 0c 00 	mov    r13,QWORD PTR [r12+0xc60]
     135b627:	00 
     135b628:	49 8b 8c 24 68 0c 00 	mov    rcx,QWORD PTR [r12+0xc68]
     135b62f:	00 
     135b630:	49 39 cd             	cmp    r13,rcx
     135b633:	40 88 6c 24 38       	mov    BYTE PTR [rsp+0x38],bpl
     135b638:	73 21                	jae    135b65b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0bdf>
     135b63a:	48 8d b4 24 90 01 00 	lea    rsi,[rsp+0x190]
     135b641:	00 
     135b642:	4c 89 ef             	mov    rdi,r13
     135b645:	e8 46 ec 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135b64a:	49 83 c5 30          	add    r13,0x30
     135b64e:	4d 89 ac 24 60 0c 00 	mov    QWORD PTR [r12+0xc60],r13
     135b655:	00 
     135b656:	e9 9a 01 00 00       	jmp    135b7f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0d79>
     135b65b:	48 be 55 55 55 55 55 	movabs rsi,0x555555555555555
     135b662:	55 55 05 
     135b665:	48 8b 84 24 88 00 00 	mov    rax,QWORD PTR [rsp+0x88]
     135b66c:	00 
     135b66d:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135b670:	49 29 fd             	sub    r13,rdi
     135b673:	6a 30                	push   0x30
     135b675:	41 58                	pop    r8
     135b677:	4c 89 e8             	mov    rax,r13
     135b67a:	48 99                	cqo
     135b67c:	49 f7 f8             	idiv   r8
     135b67f:	48 8d 58 01          	lea    rbx,[rax+0x1]
     135b683:	48 39 f3             	cmp    rbx,rsi
     135b686:	0f 87 45 08 00 00    	ja     135bed1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1455>
     135b68c:	49 89 c7             	mov    r15,rax
     135b68f:	48 29 f9             	sub    rcx,rdi
     135b692:	48 89 c8             	mov    rax,rcx
     135b695:	48 99                	cqo
     135b697:	49 f7 f8             	idiv   r8
     135b69a:	48 8d 0c 00          	lea    rcx,[rax+rax*1]
     135b69e:	48 39 d9             	cmp    rcx,rbx
     135b6a1:	48 0f 47 d9          	cmova  rbx,rcx
     135b6a5:	49 8d 8c 24 68 0c 00 	lea    rcx,[r12+0xc68]
     135b6ac:	00 
     135b6ad:	48 ba aa aa aa aa aa 	movabs rdx,0x2aaaaaaaaaaaaaa
     135b6b4:	aa aa 02 
     135b6b7:	48 39 d0             	cmp    rax,rdx
     135b6ba:	48 0f 43 de          	cmovae rbx,rsi
     135b6be:	48 89 8c 24 50 02 00 	mov    QWORD PTR [rsp+0x250],rcx
     135b6c5:	00 
     135b6c6:	48 85 db             	test   rbx,rbx
     135b6c9:	74 14                	je     135b6df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0c63>
     135b6cb:	48 39 f3             	cmp    rbx,rsi
     135b6ce:	0f 87 19 08 00 00    	ja     135beed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1471>
     135b6d4:	48 6b fb 30          	imul   rdi,rbx,0x30
     135b6d8:	e8 23 28 49 00       	call   17edf00 <_Znwm@plt>
     135b6dd:	eb 02                	jmp    135b6e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0c65>
     135b6df:	31 c0                	xor    eax,eax
     135b6e1:	48 89 84 24 30 02 00 	mov    QWORD PTR [rsp+0x230],rax
     135b6e8:	00 
     135b6e9:	49 6b ff 30          	imul   rdi,r15,0x30
     135b6ed:	48 01 c7             	add    rdi,rax
     135b6f0:	48 89 bc 24 40 02 00 	mov    QWORD PTR [rsp+0x240],rdi
     135b6f7:	00 
     135b6f8:	48 89 bc 24 38 02 00 	mov    QWORD PTR [rsp+0x238],rdi
     135b6ff:	00 
     135b700:	48 6b cb 30          	imul   rcx,rbx,0x30
     135b704:	48 01 c1             	add    rcx,rax
     135b707:	48 89 8c 24 48 02 00 	mov    QWORD PTR [rsp+0x248],rcx
     135b70e:	00 
     135b70f:	48 8d b4 24 90 01 00 	lea    rsi,[rsp+0x190]
     135b716:	00 
     135b717:	e8 74 eb 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135b71c:	48 8b 84 24 38 02 00 	mov    rax,QWORD PTR [rsp+0x238]
     135b723:	00 
     135b724:	4c 8b ac 24 40 02 00 	mov    r13,QWORD PTR [rsp+0x240]
     135b72b:	00 
     135b72c:	49 83 c5 30          	add    r13,0x30
     135b730:	4c 89 ac 24 40 02 00 	mov    QWORD PTR [rsp+0x240],r13
     135b737:	00 
     135b738:	4d 8b b4 24 58 0c 00 	mov    r14,QWORD PTR [r12+0xc58]
     135b73f:	00 
     135b740:	49 8b 9c 24 60 0c 00 	mov    rbx,QWORD PTR [r12+0xc60]
     135b747:	00 
     135b748:	4c 39 f3             	cmp    rbx,r14
     135b74b:	74 62                	je     135b7af <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0d33>
     135b74d:	48 83 c3 f0          	add    rbx,0xfffffffffffffff0
     135b751:	4c 8d 78 d0          	lea    r15,[rax-0x30]
     135b755:	4c 8d 6b e0          	lea    r13,[rbx-0x20]
     135b759:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
     135b75c:	48 85 c9             	test   rcx,rcx
     135b75f:	74 0e                	je     135b76f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0cf3>
     135b761:	49 39 cd             	cmp    r13,rcx
     135b764:	74 13                	je     135b779 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0cfd>
     135b766:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
     135b76a:	48 89 d8             	mov    rax,rbx
     135b76d:	eb 04                	jmp    135b773 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0cf7>
     135b76f:	48 83 c0 f0          	add    rax,0xfffffffffffffff0
     135b773:	48 83 20 00          	and    QWORD PTR [rax],0x0
     135b777:	eb 10                	jmp    135b789 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0d0d>
     135b779:	4c 89 78 f0          	mov    QWORD PTR [rax-0x10],r15
     135b77d:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135b780:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135b783:	4c 89 fe             	mov    rsi,r15
     135b786:	ff 50 18             	call   QWORD PTR [rax+0x18]
     135b789:	48 83 c3 d0          	add    rbx,0xffffffffffffffd0
     135b78d:	4c 89 f8             	mov    rax,r15
     135b790:	4d 39 f5             	cmp    r13,r14
     135b793:	75 bc                	jne    135b751 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0cd5>
     135b795:	49 8b 8c 24 58 0c 00 	mov    rcx,QWORD PTR [r12+0xc58]
     135b79c:	00 
     135b79d:	49 8b 9c 24 60 0c 00 	mov    rbx,QWORD PTR [r12+0xc60]
     135b7a4:	00 
     135b7a5:	4c 8b ac 24 40 02 00 	mov    r13,QWORD PTR [rsp+0x240]
     135b7ac:	00 
     135b7ad:	eb 06                	jmp    135b7b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0d39>
     135b7af:	48 89 d9             	mov    rcx,rbx
     135b7b2:	49 89 c7             	mov    r15,rax
     135b7b5:	4d 89 bc 24 58 0c 00 	mov    QWORD PTR [r12+0xc58],r15
     135b7bc:	00 
     135b7bd:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     135b7c4:	00 
     135b7c5:	48 89 4f 08          	mov    QWORD PTR [rdi+0x8],rcx
     135b7c9:	4d 89 ac 24 60 0c 00 	mov    QWORD PTR [r12+0xc60],r13
     135b7d0:	00 
     135b7d1:	48 89 5f 10          	mov    QWORD PTR [rdi+0x10],rbx
     135b7d5:	49 8b 84 24 68 0c 00 	mov    rax,QWORD PTR [r12+0xc68]
     135b7dc:	00 
     135b7dd:	48 8b 57 18          	mov    rdx,QWORD PTR [rdi+0x18]
     135b7e1:	49 89 94 24 68 0c 00 	mov    QWORD PTR [r12+0xc68],rdx
     135b7e8:	00 
     135b7e9:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
     135b7ed:	48 89 0f             	mov    QWORD PTR [rdi],rcx
     135b7f0:	e8 bf 16 75 ff       	call   aaceb4 <JNI_OnUnload@@Base+0x34781>
     135b7f5:	4d 89 ac 24 60 0c 00 	mov    QWORD PTR [r12+0xc60],r13
     135b7fc:	00 
     135b7fd:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     135b804:	00 
     135b805:	e8 60 e7 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135b80a:	49 8b 84 24 20 01 00 	mov    rax,QWORD PTR [r12+0x120]
     135b811:	00 
     135b812:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135b815:	4c 8d 2d b4 a3 0d ff 	lea    r13,[rip+0xffffffffff0da3b4]        # 435bd0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b61f>
     135b81c:	4c 8d 3d cd a3 0d ff 	lea    r15,[rip+0xffffffffff0da3cd]        # 435bf0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b63f>
     135b823:	6a 10                	push   0x10
     135b825:	41 5e                	pop    r14
     135b827:	6a 20                	push   0x20
     135b829:	5d                   	pop    rbp
     135b82a:	4c 89 ee             	mov    rsi,r13
     135b82d:	4c 89 f2             	mov    rdx,r14
     135b830:	4c 89 f9             	mov    rcx,r15
     135b833:	49 89 e8             	mov    r8,rbp
     135b836:	45 31 c9             	xor    r9d,r9d
     135b839:	e8 20 bd 28 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
     135b83e:	49 8b 84 24 20 01 00 	mov    rax,QWORD PTR [r12+0x120]
     135b845:	00 
     135b846:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135b849:	48 8d 35 d0 a3 0d ff 	lea    rsi,[rip+0xffffffffff0da3d0]        # 435c20 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b66f>
     135b850:	48 8d 0d e9 a3 0d ff 	lea    rcx,[rip+0xffffffffff0da3e9]        # 435c40 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b68f>
     135b857:	6a 1a                	push   0x1a
     135b859:	41 58                	pop    r8
     135b85b:	4c 89 f2             	mov    rdx,r14
     135b85e:	45 31 c9             	xor    r9d,r9d
     135b861:	e8 c4 bb 28 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
     135b866:	89 c3                	mov    ebx,eax
     135b868:	49 8b 84 24 20 01 00 	mov    rax,QWORD PTR [r12+0x120]
     135b86f:	00 
     135b870:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135b873:	4c 89 ee             	mov    rsi,r13
     135b876:	4c 89 f2             	mov    rdx,r14
     135b879:	4c 89 f9             	mov    rcx,r15
     135b87c:	49 89 e8             	mov    r8,rbp
     135b87f:	45 31 c9             	xor    r9d,r9d
     135b882:	e8 03 bb 28 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
     135b887:	66 0f 6f 84 24 00 01 	movdqa xmm0,XMMWORD PTR [rsp+0x100]
     135b88e:	00 00 
     135b890:	48 8b ac 24 08 01 00 	mov    rbp,QWORD PTR [rsp+0x108]
     135b897:	00 
     135b898:	48 85 ed             	test   rbp,rbp
     135b89b:	74 05                	je     135b8a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0e26>
     135b89d:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
     135b8a2:	89 9c 24 38 02 00 00 	mov    DWORD PTR [rsp+0x238],ebx
     135b8a9:	8a 4c 24 38          	mov    cl,BYTE PTR [rsp+0x38]
     135b8ad:	88 8c 24 3c 02 00 00 	mov    BYTE PTR [rsp+0x23c],cl
     135b8b4:	88 84 24 3d 02 00 00 	mov    BYTE PTR [rsp+0x23d],al
     135b8bb:	f3 0f 7f 84 24 40 02 	movdqu XMMWORD PTR [rsp+0x240],xmm0
     135b8c2:	00 00 
     135b8c4:	48 85 ed             	test   rbp,rbp
     135b8c7:	4c 8b 74 24 20       	mov    r14,QWORD PTR [rsp+0x20]
     135b8cc:	74 05                	je     135b8d3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0e57>
     135b8ce:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
     135b8d3:	48 8d 9c 24 38 02 00 	lea    rbx,[rsp+0x238]
     135b8da:	00 
     135b8db:	c7 83 d8 04 00 00 10 	mov    DWORD PTR [rbx+0x4d8],0x10
     135b8e2:	00 00 00 
     135b8e5:	4c 8d ac 24 30 02 00 	lea    r13,[rsp+0x230]
     135b8ec:	00 
     135b8ed:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     135b8f2:	4c 89 ee             	mov    rsi,r13
     135b8f5:	e8 4e 11 10 00       	call   145ca48 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a1fcc>
     135b8fa:	48 89 df             	mov    rdi,rbx
     135b8fd:	e8 fa 15 10 00       	call   145cefc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a2480>
     135b902:	48 89 ef             	mov    rdi,rbp
     135b905:	e8 7c 2b 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135b90a:	66 49 0f 6e c4       	movq   xmm0,r12
     135b90f:	f3 0f 7e 8c 24 90 00 	movq   xmm1,QWORD PTR [rsp+0x90]
     135b916:	00 00 
     135b918:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
     135b91c:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
     135b922:	31 ff                	xor    edi,edi
     135b924:	e8 f3 2a 74 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     135b929:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]
     135b92d:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     135b933:	f3 41 0f 7f 46 30    	movdqu XMMWORD PTR [r14+0x30],xmm0
     135b939:	e8 48 2b 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135b93e:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
     135b945:	00 
     135b946:	e8 3b 2b 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135b94b:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     135b950:	e8 31 2b 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135b955:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]
     135b95c:	00 
     135b95d:	e8 24 2b 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135b962:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
     135b969:	00 
     135b96a:	e8 21 25 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     135b96f:	48 8b 6c 24 08       	mov    rbp,QWORD PTR [rsp+0x8]
     135b974:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     135b978:	48 8d 35 b1 14 08 ff 	lea    rsi,[rip+0xffffffffff0814b1]        # 3dce30 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x287f>
     135b97f:	48 8d 0d ca 14 08 ff 	lea    rcx,[rip+0xffffffffff0814ca]        # 3dce50 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x289f>
     135b986:	6a 18                	push   0x18
     135b988:	41 5e                	pop    r14
     135b98a:	6a 2d                	push   0x2d
     135b98c:	41 58                	pop    r8
     135b98e:	4c 89 f2             	mov    rdx,r14
     135b991:	45 31 c9             	xor    r9d,r9d
     135b994:	e8 91 ba 28 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
     135b999:	4c 63 f8             	movsxd r15,eax
     135b99c:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     135b9a0:	48 8d 35 d9 14 08 ff 	lea    rsi,[rip+0xffffffffff0814d9]        # 3dce80 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x28cf>
     135b9a7:	48 8d 0d f2 14 08 ff 	lea    rcx,[rip+0xffffffffff0814f2]        # 3dcea0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x28ef>
     135b9ae:	6a 1a                	push   0x1a
     135b9b0:	41 58                	pop    r8
     135b9b2:	4c 89 f2             	mov    rdx,r14
     135b9b5:	41 b9 ee 02 00 00    	mov    r9d,0x2ee
     135b9bb:	e8 6a ba 28 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
     135b9c0:	4c 63 e0             	movsxd r12,eax
     135b9c3:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     135b9c7:	48 8d 35 42 15 08 ff 	lea    rsi,[rip+0xffffffffff081542]        # 3dcf10 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x295f>
     135b9ce:	48 8d 0d 5b 15 08 ff 	lea    rcx,[rip+0xffffffffff08155b]        # 3dcf30 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x297f>
     135b9d5:	6a 22                	push   0x22
     135b9d7:	41 58                	pop    r8
     135b9d9:	4c 89 f2             	mov    rdx,r14
     135b9dc:	45 31 c9             	xor    r9d,r9d
     135b9df:	e8 a6 b9 28 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
     135b9e4:	89 c3                	mov    ebx,eax
     135b9e6:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     135b9ea:	48 8d 35 6f 15 08 ff 	lea    rsi,[rip+0xffffffffff08156f]        # 3dcf60 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x29af>
     135b9f1:	48 8d 0d 88 15 08 ff 	lea    rcx,[rip+0xffffffffff081588]        # 3dcf80 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x29cf>
     135b9f8:	6a 1f                	push   0x1f
     135b9fa:	41 58                	pop    r8
     135b9fc:	6a 01                	push   0x1
     135b9fe:	41 59                	pop    r9
     135ba00:	4c 89 f2             	mov    rdx,r14
     135ba03:	4c 8b 74 24 20       	mov    r14,QWORD PTR [rsp+0x20]
     135ba08:	e8 7d b9 28 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
     135ba0d:	4d 89 7e 10          	mov    QWORD PTR [r14+0x10],r15
     135ba11:	4d 89 66 18          	mov    QWORD PTR [r14+0x18],r12
     135ba15:	41 88 5e 20          	mov    BYTE PTR [r14+0x20],bl
     135ba19:	41 88 46 21          	mov    BYTE PTR [r14+0x21],al
     135ba1d:	4c 8b a4 24 b0 00 00 	mov    r12,QWORD PTR [rsp+0xb0]
     135ba24:	00 
     135ba25:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     135ba29:	48 8d 9c 24 90 01 00 	lea    rbx,[rsp+0x190]
     135ba30:	00 
     135ba31:	48 89 df             	mov    rdi,rbx
     135ba34:	4c 89 e6             	mov    rsi,r12
     135ba37:	ff 50 18             	call   QWORD PTR [rax+0x18]
     135ba3a:	8b 2b                	mov    ebp,DWORD PTR [rbx]
     135ba3c:	8b 5b 0c             	mov    ebx,DWORD PTR [rbx+0xc]
     135ba3f:	bf 80 00 00 00       	mov    edi,0x80
     135ba44:	e8 b7 24 49 00       	call   17edf00 <_Znwm@plt>
     135ba49:	ff cd                	dec    ebp
     135ba4b:	83 fd fe             	cmp    ebp,0xfffffffe
     135ba4e:	0f 92 c2             	setb   dl
     135ba51:	20 da                	and    dl,bl
     135ba53:	66 0f ef c0          	pxor   xmm0,xmm0
     135ba57:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     135ba5c:	48 8d 0d 65 f3 4a 00 	lea    rcx,[rip+0x4af365]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
     135ba63:	48 89 08             	mov    QWORD PTR [rax],rcx
     135ba66:	49 89 c7             	mov    r15,rax
     135ba69:	49 83 c7 20          	add    r15,0x20
     135ba6d:	48 8d 0d dc 22 4b 00 	lea    rcx,[rip+0x4b22dc]        # 180dd50 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3a10>
     135ba74:	48 89 8c 24 30 02 00 	mov    QWORD PTR [rsp+0x230],rcx
     135ba7b:	00 
     135ba7c:	4c 89 a4 24 38 02 00 	mov    QWORD PTR [rsp+0x238],r12
     135ba83:	00 
     135ba84:	4c 89 ac 24 50 02 00 	mov    QWORD PTR [rsp+0x250],r13
     135ba8b:	00 
     135ba8c:	0f b6 d2             	movzx  edx,dl
     135ba8f:	4c 89 ff             	mov    rdi,r15
     135ba92:	4c 89 ee             	mov    rsi,r13
     135ba95:	48 89 c3             	mov    rbx,rax
     135ba98:	e8 af c1 16 00       	call   14c7c4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d1d0>
     135ba9d:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     135baa4:	00 
     135baa5:	e8 c0 e4 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135baaa:	31 ff                	xor    edi,edi
     135baac:	e8 6b 29 74 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     135bab1:	48 8d bc 24 a8 01 00 	lea    rdi,[rsp+0x1a8]
     135bab8:	00 
     135bab9:	e8 6a fc 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135babe:	48 8d 35 82 4f 00 ff 	lea    rsi,[rip+0xffffffffff004f82]        # 360a47 <_ZTSSt12bad_any_cast@@Base-0x2f781>
     135bac5:	48 8d bc 24 18 02 00 	lea    rdi,[rsp+0x218]
     135bacc:	00 
     135bacd:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
     135bad2:	e8 a7 df 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135bad7:	48 8b ac 24 a0 00 00 	mov    rbp,QWORD PTR [rsp+0xa0]
     135bade:	00 
     135badf:	4c 89 b4 24 90 01 00 	mov    QWORD PTR [rsp+0x190],r14
     135bae6:	00 
     135bae7:	49 8b 46 38          	mov    rax,QWORD PTR [r14+0x38]
     135baeb:	41 0f 28 46 30       	movaps xmm0,XMMWORD PTR [r14+0x30]
     135baf0:	0f 11 84 24 98 01 00 	movups XMMWORD PTR [rsp+0x198],xmm0
     135baf7:	00 
     135baf8:	48 85 c0             	test   rax,rax
     135bafb:	74 05                	je     135bb02 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1086>
     135bafd:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135bb02:	4c 89 bc 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],r15
     135bb09:	00 
     135bb0a:	48 89 9c 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rbx
     135bb11:	00 
     135bb12:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
     135bb17:	4c 8b ac 24 f0 00 00 	mov    r13,QWORD PTR [rsp+0xf0]
     135bb1e:	00 
     135bb1f:	48 8b 84 24 f8 00 00 	mov    rax,QWORD PTR [rsp+0xf8]
     135bb26:	00 
     135bb27:	4c 89 ac 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],r13
     135bb2e:	00 
     135bb2f:	48 89 84 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],rax
     135bb36:	00 
     135bb37:	48 85 c0             	test   rax,rax
     135bb3a:	74 05                	je     135bb41 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a10c5>
     135bb3c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135bb41:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     135bb46:	48 89 84 24 c8 01 00 	mov    QWORD PTR [rsp+0x1c8],rax
     135bb4d:	00 
     135bb4e:	48 8b 85 48 01 00 00 	mov    rax,QWORD PTR [rbp+0x148]
     135bb55:	66 0f 6f 85 40 01 00 	movdqa xmm0,XMMWORD PTR [rbp+0x140]
     135bb5c:	00 
     135bb5d:	f3 0f 7f 84 24 d0 01 	movdqu XMMWORD PTR [rsp+0x1d0],xmm0
     135bb64:	00 00 
     135bb66:	48 85 c0             	test   rax,rax
     135bb69:	74 05                	je     135bb70 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a10f4>
     135bb6b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135bb70:	48 83 a4 24 00 02 00 	and    QWORD PTR [rsp+0x200],0x0
     135bb77:	00 00 
     135bb79:	6a 58                	push   0x58
     135bb7b:	5f                   	pop    rdi
     135bb7c:	e8 7f 23 49 00       	call   17edf00 <_Znwm@plt>
     135bb81:	48 8d 0d 00 c0 50 00 	lea    rcx,[rip+0x50c000]        # 1867b88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24270>
     135bb88:	48 89 08             	mov    QWORD PTR [rax],rcx
     135bb8b:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
     135bb8f:	48 8b 8c 24 a0 01 00 	mov    rcx,QWORD PTR [rsp+0x1a0]
     135bb96:	00 
     135bb97:	0f 10 84 24 98 01 00 	movups xmm0,XMMWORD PTR [rsp+0x198]
     135bb9e:	00 
     135bb9f:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
     135bba3:	48 85 c9             	test   rcx,rcx
     135bba6:	74 05                	je     135bbad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1131>
     135bba8:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     135bbad:	48 8b 8c 24 b0 01 00 	mov    rcx,QWORD PTR [rsp+0x1b0]
     135bbb4:	00 
     135bbb5:	0f 10 84 24 a8 01 00 	movups xmm0,XMMWORD PTR [rsp+0x1a8]
     135bbbc:	00 
     135bbbd:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
     135bbc1:	48 85 c9             	test   rcx,rcx
     135bbc4:	74 05                	je     135bbcb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a114f>
     135bbc6:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     135bbcb:	48 8b 8c 24 c0 01 00 	mov    rcx,QWORD PTR [rsp+0x1c0]
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
     135bc6e:	00 
     135bc6f:	4c 89 ac 24 40 01 00 	mov    QWORD PTR [rsp+0x140],r13
     135bc76:	00 
     135bc77:	4d 85 ed             	test   r13,r13
     135bc7a:	74 05                	je     135bc81 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1205>
     135bc7c:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
     135bc81:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     135bc86:	48 89 84 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rax
     135bc8d:	00 
     135bc8e:	4c 8b b5 40 01 00 00 	mov    r14,QWORD PTR [rbp+0x140]
     135bc95:	4c 89 b4 24 50 01 00 	mov    QWORD PTR [rsp+0x150],r14
     135bc9c:	00 
     135bc9d:	48 8b ad 48 01 00 00 	mov    rbp,QWORD PTR [rbp+0x148]
     135bca4:	48 89 ac 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rbp
     135bcab:	00 
     135bcac:	48 85 ed             	test   rbp,rbp
     135bcaf:	74 05                	je     135bcb6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a123a>
     135bcb1:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
     135bcb6:	48 83 a4 24 80 01 00 	and    QWORD PTR [rsp+0x180],0x0
     135bcbd:	00 00 
     135bcbf:	6a 58                	push   0x58
     135bcc1:	5f                   	pop    rdi
     135bcc2:	e8 39 22 49 00       	call   17edf00 <_Znwm@plt>
     135bcc7:	48 8d 0d 02 bf 50 00 	lea    rcx,[rip+0x50bf02]        # 1867bd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x242b8>
     135bcce:	48 89 08             	mov    QWORD PTR [rax],rcx
     135bcd1:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     135bcd6:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     135bcda:	48 89 58 10          	mov    QWORD PTR [rax+0x10],rbx
     135bcde:	4c 89 60 18          	mov    QWORD PTR [rax+0x18],r12
     135bce2:	4d 85 e4             	test   r12,r12
     135bce5:	74 06                	je     135bced <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1271>
     135bce7:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
     135bced:	4c 89 78 20          	mov    QWORD PTR [rax+0x20],r15
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
     135bd8d:	00 
     135bd8e:	e8 a1 04 00 00       	call   135c234 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a17b8>
     135bd93:	4c 89 ef             	mov    rdi,r13
     135bd96:	e8 cf e1 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135bd9b:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     135bda2:	00 
     135bda3:	e8 8c 04 00 00       	call   135c234 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a17b8>
     135bda8:	4c 89 ff             	mov    rdi,r15
     135bdab:	e8 e0 20 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     135bdb0:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     135bdb5:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135bdb8:	48 8d 35 01 11 08 ff 	lea    rsi,[rip+0xffffffffff081101]        # 3dcec0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x290f>
     135bdbf:	48 8d 0d 1a 11 08 ff 	lea    rcx,[rip+0xffffffffff08111a]        # 3dcee0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x292f>
     135bdc6:	6a 18                	push   0x18
     135bdc8:	5a                   	pop    rdx
     135bdc9:	6a 22                	push   0x22
     135bdcb:	41 58                	pop    r8
     135bdcd:	45 31 c9             	xor    r9d,r9d
     135bdd0:	e8 b5 b5 28 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
     135bdd5:	89 c5                	mov    ebp,eax
     135bdd7:	6a 38                	push   0x38
     135bdd9:	5f                   	pop    rdi
     135bdda:	4c 8b 74 24 20       	mov    r14,QWORD PTR [rsp+0x20]
     135bddf:	e8 1c 21 49 00       	call   17edf00 <_Znwm@plt>
     135bde4:	c7 40 08 14 00 01 00 	mov    DWORD PTR [rax+0x8],0x10014
     135bdeb:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     135bdf0:	41 8a 4e 20          	mov    cl,BYTE PTR [r14+0x20]
     135bdf4:	48 8d 15 25 90 51 00 	lea    rdx,[rip+0x519025]        # 1874e20 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x31508>
     135bdfb:	48 89 10             	mov    QWORD PTR [rax],rdx
     135bdfe:	49 8b 56 48          	mov    rdx,QWORD PTR [r14+0x48]
     135be02:	f3 41 0f 6f 46 40    	movdqu xmm0,XMMWORD PTR [r14+0x40]
     135be08:	f3 0f 7f 40 18       	movdqu XMMWORD PTR [rax+0x18],xmm0
     135be0d:	48 85 d2             	test   rdx,rdx
     135be10:	74 05                	je     135be17 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a139b>
     135be12:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
     135be17:	48 8b 54 24 58       	mov    rdx,QWORD PTR [rsp+0x58]
     135be1c:	48 89 50 28          	mov    QWORD PTR [rax+0x28],rdx
     135be20:	40 88 68 30          	mov    BYTE PTR [rax+0x30],bpl
     135be24:	88 48 31             	mov    BYTE PTR [rax+0x31],cl
     135be27:	66 c7 40 0a 01 01    	mov    WORD PTR [rax+0xa],0x101
     135be2d:	48 8d 9c 24 30 02 00 	lea    rbx,[rsp+0x230]
     135be34:	00 
     135be35:	48 83 23 00          	and    QWORD PTR [rbx],0x0
     135be39:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
     135be3e:	48 89 c6             	mov    rsi,rax
     135be41:	e8 18 04 00 00       	call   135c25e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a17e2>
     135be46:	48 89 df             	mov    rdi,rbx
     135be49:	e8 30 04 00 00       	call   135c27e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1802>
     135be4e:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     135be53:	e8 2e 26 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135be58:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
     135be5f:	00 
     135be60:	e8 21 26 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135be65:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
     135be6c:	00 
     135be6d:	4c 89 30             	mov    QWORD PTR [rax],r14
     135be70:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     135be77:	00 00 
     135be79:	48 3b 8c 24 10 0d 00 	cmp    rcx,QWORD PTR [rsp+0xd10]
     135be80:	00 
     135be81:	0f 85 6e 03 00 00    	jne    135c1f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1779>
     135be87:	48 81 c4 18 0d 00 00 	add    rsp,0xd18
     135be8e:	5b                   	pop    rbx
     135be8f:	41 5c                	pop    r12
     135be91:	41 5d                	pop    r13
     135be93:	41 5e                	pop    r14
     135be95:	41 5f                	pop    r15
     135be97:	5d                   	pop    rbp
     135be98:	c3                   	ret
     135be99:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135bea0:	00 00 
     135bea2:	48 3b 84 24 10 0d 00 	cmp    rax,QWORD PTR [rsp+0xd10]
     135bea9:	00 
     135beaa:	0f 85 45 03 00 00    	jne    135c1f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1779>
     135beb0:	e8 be e5 71 ff       	call   a7a473 <JNI_OnUnload@@Base+0x1d40>
     135beb5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135bebc:	00 00 
     135bebe:	48 3b 84 24 10 0d 00 	cmp    rax,QWORD PTR [rsp+0xd10]
     135bec5:	00 
     135bec6:	0f 85 29 03 00 00    	jne    135c1f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1779>
     135becc:	e8 a2 e5 71 ff       	call   a7a473 <JNI_OnUnload@@Base+0x1d40>
     135bed1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135bed8:	00 00 
     135beda:	48 3b 84 24 10 0d 00 	cmp    rax,QWORD PTR [rsp+0xd10]
     135bee1:	00 
     135bee2:	0f 85 0d 03 00 00    	jne    135c1f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1779>
     135bee8:	e8 d3 86 6a ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
     135beed:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135bef4:	00 00 
     135bef6:	48 3b 84 24 10 0d 00 	cmp    rax,QWORD PTR [rsp+0xd10]
     135befd:	00 
     135befe:	0f 85 f1 02 00 00    	jne    135c1f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1779>
     135bf04:	e8 d6 f7 71 ff       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>
     135bf09:	49 89 c7             	mov    r15,rax
     135bf0c:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     135bf13:	00 
     135bf14:	e8 9b 0f 75 ff       	call   aaceb4 <JNI_OnUnload@@Base+0x34781>
     135bf19:	e9 79 01 00 00       	jmp    135c097 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a161b>
     135bf1e:	49 89 c7             	mov    r15,rax
     135bf21:	4d 89 ac 24 60 0c 00 	mov    QWORD PTR [r12+0xc60],r13
     135bf28:	00 
     135bf29:	e9 69 01 00 00       	jmp    135c097 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a161b>
     135bf2e:	49 89 c7             	mov    r15,rax
     135bf31:	66 0f ef c0          	pxor   xmm0,xmm0
     135bf35:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     135bf3b:	e9 24 02 00 00       	jmp    135c164 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a16e8>
     135bf40:	e9 9f 01 00 00       	jmp    135c0e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1668>
     135bf45:	eb 3e                	jmp    135bf85 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1509>
     135bf47:	49 89 c7             	mov    r15,rax
     135bf4a:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
     135bf51:	00 
     135bf52:	e8 dd 02 00 00       	call   135c234 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a17b8>
     135bf57:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     135bf5e:	00 
     135bf5f:	e8 06 e0 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135bf64:	eb 03                	jmp    135bf69 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a14ed>
     135bf66:	49 89 c7             	mov    r15,rax
     135bf69:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     135bf70:	00 
     135bf71:	e8 be 02 00 00       	call   135c234 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a17b8>
     135bf76:	48 8d bc 24 18 02 00 	lea    rdi,[rsp+0x218]
     135bf7d:	00 
     135bf7e:	e8 0d 1f 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     135bf83:	eb 03                	jmp    135bf88 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a150c>
     135bf85:	49 89 c7             	mov    r15,rax
     135bf88:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     135bf8d:	e8 f4 24 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135bf92:	e9 f9 01 00 00       	jmp    135c190 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1714>
     135bf97:	49 89 c7             	mov    r15,rax
     135bf9a:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     135bfa1:	00 
     135bfa2:	e8 c3 df 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135bfa7:	48 89 df             	mov    rdi,rbx
     135bfaa:	e8 61 20 49 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     135bfaf:	48 89 df             	mov    rdi,rbx
     135bfb2:	e8 65 24 74 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     135bfb7:	eb 03                	jmp    135bfbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1540>
     135bfb9:	49 89 c7             	mov    r15,rax
     135bfbc:	48 8d bc 24 a8 01 00 	lea    rdi,[rsp+0x1a8]
     135bfc3:	00 
     135bfc4:	e8 5f f7 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135bfc9:	e9 c2 01 00 00       	jmp    135c190 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1714>
     135bfce:	49 89 c7             	mov    r15,rax
     135bfd1:	48 89 df             	mov    rdi,rbx
     135bfd4:	e8 23 0f 10 00       	call   145cefc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a2480>
     135bfd9:	48 89 ef             	mov    rdi,rbp
     135bfdc:	e8 a5 24 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135bfe1:	e9 11 01 00 00       	jmp    135c0f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a167b>
     135bfe6:	49 89 c7             	mov    r15,rax
     135bfe9:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     135bff0:	00 
     135bff1:	e8 f6 09 10 00       	call   145c9ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a1f70>
     135bff6:	e9 ca 00 00 00       	jmp    135c0c5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1649>
     135bffb:	49 89 c7             	mov    r15,rax
     135bffe:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     135c005:	00 
     135c006:	e8 dd e7 47 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     135c00b:	e9 e7 00 00 00       	jmp    135c0f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a167b>
     135c010:	e9 df 00 00 00       	jmp    135c0f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1678>
     135c015:	49 89 c7             	mov    r15,rax
     135c018:	4c 89 f7             	mov    rdi,r14
     135c01b:	e8 da 07 10 00       	call   145c7fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a1d7e>
     135c020:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     135c025:	e8 40 df 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135c02a:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     135c031:	00 
     135c032:	e8 e9 07 10 00       	call   145c820 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a1da4>
     135c037:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     135c03e:	00 
     135c03f:	e8 26 df 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135c044:	e9 c2 00 00 00       	jmp    135c10b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a168f>
     135c049:	49 89 c7             	mov    r15,rax
     135c04c:	e9 06 01 00 00       	jmp    135c157 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a16db>
     135c051:	49 89 c7             	mov    r15,rax
     135c054:	4a 8d 3c 24          	lea    rdi,[rsp+r12*1]
     135c058:	48 81 c7 30 02 00 00 	add    rdi,0x230
     135c05f:	e8 2c 1e 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     135c064:	49 83 c4 e8          	add    r12,0xffffffffffffffe8
     135c068:	49 83 fc e8          	cmp    r12,0xffffffffffffffe8
     135c06c:	75 e6                	jne    135c054 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a15d8>
     135c06e:	e9 03 01 00 00       	jmp    135c176 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a16fa>
     135c073:	49 89 c7             	mov    r15,rax
     135c076:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     135c07d:	00 
     135c07e:	e8 0d 1e 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     135c083:	e9 ee 00 00 00       	jmp    135c176 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a16fa>
     135c088:	49 89 c7             	mov    r15,rax
     135c08b:	e9 00 01 00 00       	jmp    135c190 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1714>
     135c090:	eb 4a                	jmp    135c0dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1660>
     135c092:	eb 50                	jmp    135c0e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1668>
     135c094:	49 89 c7             	mov    r15,rax
     135c097:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     135c09e:	00 
     135c09f:	e8 c6 de 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135c0a4:	eb 51                	jmp    135c0f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a167b>
     135c0a6:	eb 3c                	jmp    135c0e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1668>
     135c0a8:	49 89 c7             	mov    r15,rax
     135c0ab:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     135c0b2:	00 
     135c0b3:	e8 b2 de 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135c0b8:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     135c0bf:	00 
     135c0c0:	e8 a5 de 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135c0c5:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
     135c0cc:	00 
     135c0cd:	e8 98 de 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135c0d2:	eb 23                	jmp    135c0f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a167b>
     135c0d4:	49 89 c7             	mov    r15,rax
     135c0d7:	e9 88 00 00 00       	jmp    135c164 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a16e8>
     135c0dc:	49 89 c7             	mov    r15,rax
     135c0df:	e9 b9 00 00 00       	jmp    135c19d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1721>
     135c0e4:	48 89 c7             	mov    rdi,rax
     135c0e7:	e8 b9 d9 71 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     135c0ec:	49 89 c7             	mov    r15,rax
     135c0ef:	e9 82 00 00 00       	jmp    135c176 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a16fa>
     135c0f4:	49 89 c7             	mov    r15,rax
     135c0f7:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     135c0fc:	e8 d3 da 47 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
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
     135c17d:	00 
     135c17e:	e8 03 23 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135c183:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
     135c18a:	00 
     135c18b:	e8 00 1d 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     135c190:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
     135c197:	00 
     135c198:	e8 e9 22 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135c19d:	4c 8b 74 24 20       	mov    r14,QWORD PTR [rsp+0x20]
     135c1a2:	4c 89 f3             	mov    rbx,r14
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

## Focused construction window 0x135a780..0x135ad80
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
     135a90c:	41 59                	pop    r9
     135a90e:	4c 89 e2             	mov    rdx,r12
     135a911:	e8 48 cc 28 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
     135a916:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135a919:	4c 89 f7             	mov    rdi,r14
     135a91c:	48 89 6c 24 78       	mov    QWORD PTR [rsp+0x78],rbp
     135a921:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135a924:	48 89 c3             	mov    rbx,rax
     135a927:	bf 88 00 00 00       	mov    edi,0x88
     135a92c:	e8 cf 35 49 00       	call   17edf00 <_Znwm@plt>
     135a931:	49 89 c5             	mov    r13,rax
     135a934:	48 8b 83 f0 00 00 00 	mov    rax,QWORD PTR [rbx+0xf0]
     135a93b:	f3 0f 6f 83 e8 00 00 	movdqu xmm0,XMMWORD PTR [rbx+0xe8]
     135a942:	00 
     135a943:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
     135a949:	48 85 c0             	test   rax,rax
     135a94c:	74 05                	je     135a953 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19fed7>
     135a94e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135a953:	4c 89 ef             	mov    rdi,r13
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
     135a9c0:	48 8d 94 24 c8 00 00 	lea    rdx,[rsp+0xc8]
     135a9c7:	00 
     135a9c8:	4c 89 fe             	mov    rsi,r15
     135a9cb:	ff 50 18             	call   QWORD PTR [rax+0x18]
     135a9ce:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135a9d1:	4c 89 f7             	mov    rdi,r14
     135a9d4:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135a9d7:	49 89 c5             	mov    r13,rax
     135a9da:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135a9dd:	4c 89 f7             	mov    rdi,r14
     135a9e0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135a9e3:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
     135a9ea:	00 
     135a9eb:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135a9ee:	4c 89 f7             	mov    rdi,r14
     135a9f1:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135a9f4:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     135a9f9:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135a9fc:	4c 89 f7             	mov    rdi,r14
     135a9ff:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135aa02:	49 8b 06             	mov    rax,QWORD PTR [r14]
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
     135aa60:	6a 29                	push   0x29
     135aa62:	41 58                	pop    r8
     135aa64:	4c 89 f2             	mov    rdx,r14
     135aa67:	45 31 c9             	xor    r9d,r9d
     135aa6a:	e8 ef ca 28 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
     135aa6f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135aa72:	48 8d 35 a7 b1 0d ff 	lea    rsi,[rip+0xffffffffff0db1a7]        # 435c20 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b66f>
     135aa79:	48 8d 0d c0 b1 0d ff 	lea    rcx,[rip+0xffffffffff0db1c0]        # 435c40 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b68f>
     135aa80:	6a 1a                	push   0x1a
     135aa82:	41 58                	pop    r8
     135aa84:	4c 89 f2             	mov    rdx,r14
     135aa87:	45 31 c9             	xor    r9d,r9d
     135aa8a:	68 80 96 98 00       	push   0x989680
     135aa8f:	6a 00                	push   0x0
     135aa91:	e8 5c cb 28 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
     135aa96:	48 83 c4 10          	add    rsp,0x10
     135aa9a:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135aa9d:	48 8d 35 bc b1 0d ff 	lea    rsi,[rip+0xffffffffff0db1bc]        # 435c60 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b6af>
     135aaa4:	48 8d 0d d5 b1 0d ff 	lea    rcx,[rip+0xffffffffff0db1d5]        # 435c80 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b6cf>
     135aaab:	6a 1b                	push   0x1b
     135aaad:	41 58                	pop    r8
     135aaaf:	4c 89 f2             	mov    rdx,r14
     135aab2:	45 31 c9             	xor    r9d,r9d
     135aab5:	e8 a4 ca 28 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
     135aaba:	48 8b 2b             	mov    rbp,QWORD PTR [rbx]
     135aabd:	48 8d 35 00 b1 0d ff 	lea    rsi,[rip+0xffffffffff0db100]        # 435bc4 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b613>
     135aac4:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     135aacb:	00 
     135aacc:	e8 ad ef 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135aad1:	48 8d bc 24 48 02 00 	lea    rdi,[rsp+0x248]
     135aad8:	00 
     135aad9:	48 8d 35 71 32 ff fe 	lea    rsi,[rip+0xfffffffffeff3271]        # 34dd51 <_ZTSSt12bad_any_cast@@Base-0x42477>
     135aae0:	e8 99 ef 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135aae5:	4c 8d b4 24 90 01 00 	lea    r14,[rsp+0x190]
     135aaec:	00 
     135aaed:	48 8d b4 24 30 02 00 	lea    rsi,[rsp+0x230]
     135aaf4:	00 
     135aaf5:	6a 02                	push   0x2
     135aaf7:	5a                   	pop    rdx
     135aaf8:	4c 89 f7             	mov    rdi,r14
     135aafb:	e8 58 c9 74 ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
     135ab00:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
     135ab05:	6a 18                	push   0x18
     135ab07:	5b                   	pop    rbx
     135ab08:	48 8d 3c 1c          	lea    rdi,[rsp+rbx*1]
     135ab0c:	48 81 c7 30 02 00 00 	add    rdi,0x230
     135ab13:	e8 78 33 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     135ab18:	48 83 c3 e8          	add    rbx,0xffffffffffffffe8
     135ab1c:	48 83 fb e8          	cmp    rbx,0xffffffffffffffe8
     135ab20:	75 e6                	jne    135ab08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a008c>
     135ab22:	48 8d 35 77 b1 0d ff 	lea    rsi,[rip+0xffffffffff0db177]        # 435ca0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b6ef>
     135ab29:	48 8d 0d 90 b1 0d ff 	lea    rcx,[rip+0xffffffffff0db190]        # 435cc0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b70f>
     135ab30:	4c 8d 0d 8d b0 0d ff 	lea    r9,[rip+0xffffffffff0db08d]        # 435bc4 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b613>
     135ab37:	6a 10                	push   0x10
     135ab39:	41 5c                	pop    r12
     135ab3b:	6a 11                	push   0x11
     135ab3d:	41 58                	pop    r8
     135ab3f:	48 89 ef             	mov    rdi,rbp
     135ab42:	4c 89 e2             	mov    rdx,r12
     135ab45:	41 56                	push   r14
     135ab47:	6a 08                	push   0x8
     135ab49:	e8 40 cb 28 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
     135ab4e:	58                   	pop    rax
     135ab4f:	59                   	pop    rcx
     135ab50:	4c 89 f7             	mov    rdi,r14
     135ab53:	e8 90 0a 72 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     135ab58:	4c 8b 7c 24 08       	mov    r15,QWORD PTR [rsp+0x8]
     135ab5d:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     135ab60:	48 8d 1d d9 af 0d ff 	lea    rbx,[rip+0xffffffffff0dafd9]        # 435b40 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b58f>
     135ab67:	48 8d 2d f2 af 0d ff 	lea    rbp,[rip+0xffffffffff0daff2]        # 435b60 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b5af>
     135ab6e:	6a 27                	push   0x27
     135ab70:	41 5e                	pop    r14
     135ab72:	48 89 de             	mov    rsi,rbx
     135ab75:	4c 89 e2             	mov    rdx,r12
     135ab78:	48 89 e9             	mov    rcx,rbp
     135ab7b:	4d 89 f0             	mov    r8,r14
     135ab7e:	45 31 c9             	xor    r9d,r9d
     135ab81:	e8 d8 c9 28 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
     135ab86:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     135ab89:	48 8d 35 00 b0 0d ff 	lea    rsi,[rip+0xffffffffff0db000]        # 435b90 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b5df>
     135ab90:	48 8d 0d 19 b0 0d ff 	lea    rcx,[rip+0xffffffffff0db019]        # 435bb0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b5ff>
     135ab97:	6a 13                	push   0x13
     135ab99:	41 58                	pop    r8
     135ab9b:	4c 89 e2             	mov    rdx,r12
     135ab9e:	45 31 c9             	xor    r9d,r9d
     135aba1:	e8 b8 c9 28 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
     135aba6:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     135aba9:	48 89 de             	mov    rsi,rbx
     135abac:	4c 89 e2             	mov    rdx,r12
     135abaf:	48 89 e9             	mov    rcx,rbp
     135abb2:	4d 89 f0             	mov    r8,r14
     135abb5:	45 31 c9             	xor    r9d,r9d
     135abb8:	e8 cd c7 28 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
     135abbd:	84 c0                	test   al,al
     135abbf:	74 64                	je     135ac25 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a01a9>
     135abc1:	bf a0 00 00 00       	mov    edi,0xa0
     135abc6:	e8 35 33 49 00       	call   17edf00 <_Znwm@plt>
     135abcb:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     135abd0:	66 0f ef c0          	pxor   xmm0,xmm0
     135abd4:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     135abd9:	48 8d 0d a8 95 51 00 	lea    rcx,[rip+0x5195a8]        # 1874188 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x30870>
     135abe0:	48 89 08             	mov    QWORD PTR [rax],rcx
     135abe3:	48 89 c1             	mov    rcx,rax
     135abe6:	48 83 c1 20          	add    rcx,0x20
     135abea:	48 8d 15 df a1 51 00 	lea    rdx,[rip+0x51a1df]        # 1874dd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x314b8>
     135abf1:	48 89 50 20          	mov    QWORD PTR [rax+0x20],rdx
     135abf5:	66 0f 7f 40 30       	movdqa XMMWORD PTR [rax+0x30],xmm0
     135abfa:	48 83 60 40 00       	and    QWORD PTR [rax+0x40],0x0
     135abff:	48 83 60 70 00       	and    QWORD PTR [rax+0x70],0x0
     135ac04:	48 8b 54 24 40       	mov    rdx,QWORD PTR [rsp+0x40]
     135ac09:	48 89 90 80 00 00 00 	mov    QWORD PTR [rax+0x80],rdx
     135ac10:	f3 0f 7f 80 88 00 00 	movdqu XMMWORD PTR [rax+0x88],xmm0
     135ac17:	00 
     135ac18:	48 83 a0 98 00 00 00 	and    QWORD PTR [rax+0x98],0x0
     135ac1f:	00 
     135ac20:	e9 88 00 00 00       	jmp    135acad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0231>
     135ac25:	bf f0 00 00 00       	mov    edi,0xf0
     135ac2a:	e8 d1 32 49 00       	call   17edf00 <_Znwm@plt>
     135ac2f:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     135ac34:	66 0f ef c0          	pxor   xmm0,xmm0
     135ac38:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     135ac3d:	48 8d 0d 7c 95 51 00 	lea    rcx,[rip+0x51957c]        # 18741c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x308a8>
     135ac44:	48 89 08             	mov    QWORD PTR [rax],rcx
     135ac47:	48 8d 0d a2 a0 51 00 	lea    rcx,[rip+0x51a0a2]        # 1874cf0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x313d8>
     135ac4e:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
     135ac52:	48 89 c1             	mov    rcx,rax
     135ac55:	48 83 c1 28          	add    rcx,0x28
     135ac59:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
     135ac5d:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx
     135ac61:	f3 0f 7f 40 38       	movdqu XMMWORD PTR [rax+0x38],xmm0
     135ac66:	48 83 60 58 00       	and    QWORD PTR [rax+0x58],0x0
     135ac6b:	f3 0f 7f 40 48       	movdqu XMMWORD PTR [rax+0x48],xmm0
     135ac70:	c7 40 60 00 00 80 3f 	mov    DWORD PTR [rax+0x60],0x3f800000
     135ac77:	b9 f4 01 00 00       	mov    ecx,0x1f4
     135ac7c:	48 89 48 68          	mov    QWORD PTR [rax+0x68],rcx
     135ac80:	48 89 48 70          	mov    QWORD PTR [rax+0x70],rcx
     135ac84:	48 83 a0 c0 00 00 00 	and    QWORD PTR [rax+0xc0],0x0
     135ac8b:	00 
     135ac8c:	48 83 a0 e0 00 00 00 	and    QWORD PTR [rax+0xe0],0x0
     135ac93:	00 
     135ac94:	48 8d 48 20          	lea    rcx,[rax+0x20]
     135ac98:	66 0f 7f 80 d0 00 00 	movdqa XMMWORD PTR [rax+0xd0],xmm0
     135ac9f:	00 
     135aca0:	f3 0f 7f 40 78       	movdqu XMMWORD PTR [rax+0x78],xmm0
     135aca5:	f3 0f 7f 80 88 00 00 	movdqu XMMWORD PTR [rax+0x88],xmm0
     135acac:	00 
     135acad:	66 48 0f 6e c0       	movq   xmm0,rax
     135acb2:	66 48 0f 6e c9       	movq   xmm1,rcx
     135acb7:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
     135acbb:	4c 8b 74 24 20       	mov    r14,QWORD PTR [rsp+0x20]
     135acc0:	49 8b 7e 48          	mov    rdi,QWORD PTR [r14+0x48]
     135acc4:	f3 41 0f 7f 4e 40    	movdqu XMMWORD PTR [r14+0x40],xmm1
     135acca:	e8 b7 37 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135accf:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     135acd4:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135acd7:	48 8d 35 12 ae 0d ff 	lea    rsi,[rip+0xffffffffff0dae12]        # 435af0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b53f>
     135acde:	48 8d 0d 2b ae 0d ff 	lea    rcx,[rip+0xffffffffff0dae2b]        # 435b10 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b55f>
     135ace5:	6a 10                	push   0x10
     135ace7:	5a                   	pop    rdx
     135ace8:	6a 29                	push   0x29
     135acea:	41 58                	pop    r8
     135acec:	45 31 c9             	xor    r9d,r9d
     135acef:	e8 96 c6 28 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
     135acf4:	66 0f ef c0          	pxor   xmm0,xmm0
     135acf8:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     135acfe:	84 c0                	test   al,al
     135ad00:	0f 84 f8 00 00 00    	je     135adfe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0382>
     135ad06:	bf 90 00 00 00       	mov    edi,0x90
     135ad0b:	e8 f0 31 49 00       	call   17edf00 <_Znwm@plt>
     135ad10:	49 89 c4             	mov    r12,rax
     135ad13:	66 0f ef c0          	pxor   xmm0,xmm0
     135ad17:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     135ad1c:	48 8d 05 45 27 4a 00 	lea    rax,[rip+0x4a2745]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     135ad23:	49 89 04 24          	mov    QWORD PTR [r12],rax
     135ad27:	49 8d 5c 24 18       	lea    rbx,[r12+0x18]
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

## All uses of exact embedded dependency address stored at rsp+0x80
### 0x135a807: mov    QWORD PTR [rsp+0x80],rcx
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

### 0x135bd66: mov    rdi,QWORD PTR [rsp+0x80]
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
     135bd8d:	00 
     135bd8e:	e8 a1 04 00 00       	call   135c234 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a17b8>
     135bd93:	4c 89 ef             	mov    rdi,r13
     135bd96:	e8 cf e1 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135bd9b:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     135bda2:	00 
     135bda3:	e8 8c 04 00 00       	call   135c234 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a17b8>
     135bda8:	4c 89 ff             	mov    rdi,r15
     135bdab:	e8 e0 20 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     135bdb0:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     135bdb5:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135bdb8:	48 8d 35 01 11 08 ff 	lea    rsi,[rip+0xffffffffff081101]        # 3dcec0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x290f>
     135bdbf:	48 8d 0d 1a 11 08 ff 	lea    rcx,[rip+0xffffffffff08111a]        # 3dcee0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x292f>

### 0x135c1b3: mov    rdi,QWORD PTR [rsp+0x80]
     135c17e:	e8 03 23 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135c183:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
     135c18a:	00 
     135c18b:	e8 00 1d 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     135c190:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
     135c197:	00 
     135c198:	e8 e9 22 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135c19d:	4c 8b 74 24 20       	mov    r14,QWORD PTR [rsp+0x20]
     135c1a2:	4c 89 f3             	mov    rbx,r14
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

## Writes or initialization touching candidate object +0x50..+0x8f
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

### 0x135a842: movdqu XMMWORD PTR [rax+0x58],xmm0
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

### 0x135a963: movdqu XMMWORD PTR [r13+0x78],xmm0
     135a943:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
     135a949:	48 85 c0             	test   rax,rax
     135a94c:	74 05                	je     135a953 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19fed7>
     135a94e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135a953:	4c 89 ef             	mov    rdi,r13
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

### 0x135a969: movdqu XMMWORD PTR [r13+0x68],xmm0
     135a949:	48 85 c0             	test   rax,rax
     135a94c:	74 05                	je     135a953 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19fed7>
     135a94e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135a953:	4c 89 ef             	mov    rdi,r13
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

### 0x135abff: and    QWORD PTR [rax+0x70],0x0
     135abd9:	48 8d 0d a8 95 51 00 	lea    rcx,[rip+0x5195a8]        # 1874188 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x30870>
     135abe0:	48 89 08             	mov    QWORD PTR [rax],rcx
     135abe3:	48 89 c1             	mov    rcx,rax
     135abe6:	48 83 c1 20          	add    rcx,0x20
     135abea:	48 8d 15 df a1 51 00 	lea    rdx,[rip+0x51a1df]        # 1874dd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x314b8>
     135abf1:	48 89 50 20          	mov    QWORD PTR [rax+0x20],rdx
     135abf5:	66 0f 7f 40 30       	movdqa XMMWORD PTR [rax+0x30],xmm0
     135abfa:	48 83 60 40 00       	and    QWORD PTR [rax+0x40],0x0
     135abff:	48 83 60 70 00       	and    QWORD PTR [rax+0x70],0x0
     135ac04:	48 8b 54 24 40       	mov    rdx,QWORD PTR [rsp+0x40]
     135ac09:	48 89 90 80 00 00 00 	mov    QWORD PTR [rax+0x80],rdx
     135ac10:	f3 0f 7f 80 88 00 00 	movdqu XMMWORD PTR [rax+0x88],xmm0
     135ac17:	00 
     135ac18:	48 83 a0 98 00 00 00 	and    QWORD PTR [rax+0x98],0x0
     135ac1f:	00 
     135ac20:	e9 88 00 00 00       	jmp    135acad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0231>
     135ac25:	bf f0 00 00 00       	mov    edi,0xf0
     135ac2a:	e8 d1 32 49 00       	call   17edf00 <_Znwm@plt>
     135ac2f:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     135ac34:	66 0f ef c0          	pxor   xmm0,xmm0

### 0x135ac09: mov    QWORD PTR [rax+0x80],rdx
     135abe3:	48 89 c1             	mov    rcx,rax
     135abe6:	48 83 c1 20          	add    rcx,0x20
     135abea:	48 8d 15 df a1 51 00 	lea    rdx,[rip+0x51a1df]        # 1874dd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x314b8>
     135abf1:	48 89 50 20          	mov    QWORD PTR [rax+0x20],rdx
     135abf5:	66 0f 7f 40 30       	movdqa XMMWORD PTR [rax+0x30],xmm0
     135abfa:	48 83 60 40 00       	and    QWORD PTR [rax+0x40],0x0
     135abff:	48 83 60 70 00       	and    QWORD PTR [rax+0x70],0x0
     135ac04:	48 8b 54 24 40       	mov    rdx,QWORD PTR [rsp+0x40]
     135ac09:	48 89 90 80 00 00 00 	mov    QWORD PTR [rax+0x80],rdx
     135ac10:	f3 0f 7f 80 88 00 00 	movdqu XMMWORD PTR [rax+0x88],xmm0
     135ac17:	00 
     135ac18:	48 83 a0 98 00 00 00 	and    QWORD PTR [rax+0x98],0x0
     135ac1f:	00 
     135ac20:	e9 88 00 00 00       	jmp    135acad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0231>
     135ac25:	bf f0 00 00 00       	mov    edi,0xf0
     135ac2a:	e8 d1 32 49 00       	call   17edf00 <_Znwm@plt>
     135ac2f:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     135ac34:	66 0f ef c0          	pxor   xmm0,xmm0
     135ac38:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     135ac3d:	48 8d 0d 7c 95 51 00 	lea    rcx,[rip+0x51957c]        # 18741c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x308a8>

### 0x135ac10: movdqu XMMWORD PTR [rax+0x88],xmm0
     135abe6:	48 83 c1 20          	add    rcx,0x20
     135abea:	48 8d 15 df a1 51 00 	lea    rdx,[rip+0x51a1df]        # 1874dd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x314b8>
     135abf1:	48 89 50 20          	mov    QWORD PTR [rax+0x20],rdx
     135abf5:	66 0f 7f 40 30       	movdqa XMMWORD PTR [rax+0x30],xmm0
     135abfa:	48 83 60 40 00       	and    QWORD PTR [rax+0x40],0x0
     135abff:	48 83 60 70 00       	and    QWORD PTR [rax+0x70],0x0
     135ac04:	48 8b 54 24 40       	mov    rdx,QWORD PTR [rsp+0x40]
     135ac09:	48 89 90 80 00 00 00 	mov    QWORD PTR [rax+0x80],rdx
     135ac10:	f3 0f 7f 80 88 00 00 	movdqu XMMWORD PTR [rax+0x88],xmm0
     135ac17:	00 
     135ac18:	48 83 a0 98 00 00 00 	and    QWORD PTR [rax+0x98],0x0
     135ac1f:	00 
     135ac20:	e9 88 00 00 00       	jmp    135acad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0231>
     135ac25:	bf f0 00 00 00       	mov    edi,0xf0
     135ac2a:	e8 d1 32 49 00       	call   17edf00 <_Znwm@plt>
     135ac2f:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     135ac34:	66 0f ef c0          	pxor   xmm0,xmm0
     135ac38:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     135ac3d:	48 8d 0d 7c 95 51 00 	lea    rcx,[rip+0x51957c]        # 18741c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x308a8>
     135ac44:	48 89 08             	mov    QWORD PTR [rax],rcx

### 0x135ac66: and    QWORD PTR [rax+0x58],0x0
     135ac44:	48 89 08             	mov    QWORD PTR [rax],rcx
     135ac47:	48 8d 0d a2 a0 51 00 	lea    rcx,[rip+0x51a0a2]        # 1874cf0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x313d8>
     135ac4e:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
     135ac52:	48 89 c1             	mov    rcx,rax
     135ac55:	48 83 c1 28          	add    rcx,0x28
     135ac59:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
     135ac5d:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx
     135ac61:	f3 0f 7f 40 38       	movdqu XMMWORD PTR [rax+0x38],xmm0
     135ac66:	48 83 60 58 00       	and    QWORD PTR [rax+0x58],0x0
     135ac6b:	f3 0f 7f 40 48       	movdqu XMMWORD PTR [rax+0x48],xmm0
     135ac70:	c7 40 60 00 00 80 3f 	mov    DWORD PTR [rax+0x60],0x3f800000
     135ac77:	b9 f4 01 00 00       	mov    ecx,0x1f4
     135ac7c:	48 89 48 68          	mov    QWORD PTR [rax+0x68],rcx
     135ac80:	48 89 48 70          	mov    QWORD PTR [rax+0x70],rcx
     135ac84:	48 83 a0 c0 00 00 00 	and    QWORD PTR [rax+0xc0],0x0
     135ac8b:	00 
     135ac8c:	48 83 a0 e0 00 00 00 	and    QWORD PTR [rax+0xe0],0x0
     135ac93:	00 
     135ac94:	48 8d 48 20          	lea    rcx,[rax+0x20]
     135ac98:	66 0f 7f 80 d0 00 00 	movdqa XMMWORD PTR [rax+0xd0],xmm0

### 0x135ac70: mov    DWORD PTR [rax+0x60],0x3f800000
     135ac4e:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
     135ac52:	48 89 c1             	mov    rcx,rax
     135ac55:	48 83 c1 28          	add    rcx,0x28
     135ac59:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
     135ac5d:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx
     135ac61:	f3 0f 7f 40 38       	movdqu XMMWORD PTR [rax+0x38],xmm0
     135ac66:	48 83 60 58 00       	and    QWORD PTR [rax+0x58],0x0
     135ac6b:	f3 0f 7f 40 48       	movdqu XMMWORD PTR [rax+0x48],xmm0
     135ac70:	c7 40 60 00 00 80 3f 	mov    DWORD PTR [rax+0x60],0x3f800000
     135ac77:	b9 f4 01 00 00       	mov    ecx,0x1f4
     135ac7c:	48 89 48 68          	mov    QWORD PTR [rax+0x68],rcx
     135ac80:	48 89 48 70          	mov    QWORD PTR [rax+0x70],rcx
     135ac84:	48 83 a0 c0 00 00 00 	and    QWORD PTR [rax+0xc0],0x0
     135ac8b:	00 
     135ac8c:	48 83 a0 e0 00 00 00 	and    QWORD PTR [rax+0xe0],0x0
     135ac93:	00 
     135ac94:	48 8d 48 20          	lea    rcx,[rax+0x20]
     135ac98:	66 0f 7f 80 d0 00 00 	movdqa XMMWORD PTR [rax+0xd0],xmm0
     135ac9f:	00 
     135aca0:	f3 0f 7f 40 78       	movdqu XMMWORD PTR [rax+0x78],xmm0

### 0x135ac7c: mov    QWORD PTR [rax+0x68],rcx
     135ac55:	48 83 c1 28          	add    rcx,0x28
     135ac59:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
     135ac5d:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx
     135ac61:	f3 0f 7f 40 38       	movdqu XMMWORD PTR [rax+0x38],xmm0
     135ac66:	48 83 60 58 00       	and    QWORD PTR [rax+0x58],0x0
     135ac6b:	f3 0f 7f 40 48       	movdqu XMMWORD PTR [rax+0x48],xmm0
     135ac70:	c7 40 60 00 00 80 3f 	mov    DWORD PTR [rax+0x60],0x3f800000
     135ac77:	b9 f4 01 00 00       	mov    ecx,0x1f4
     135ac7c:	48 89 48 68          	mov    QWORD PTR [rax+0x68],rcx
     135ac80:	48 89 48 70          	mov    QWORD PTR [rax+0x70],rcx
     135ac84:	48 83 a0 c0 00 00 00 	and    QWORD PTR [rax+0xc0],0x0
     135ac8b:	00 
     135ac8c:	48 83 a0 e0 00 00 00 	and    QWORD PTR [rax+0xe0],0x0
     135ac93:	00 
     135ac94:	48 8d 48 20          	lea    rcx,[rax+0x20]
     135ac98:	66 0f 7f 80 d0 00 00 	movdqa XMMWORD PTR [rax+0xd0],xmm0
     135ac9f:	00 
     135aca0:	f3 0f 7f 40 78       	movdqu XMMWORD PTR [rax+0x78],xmm0
     135aca5:	f3 0f 7f 80 88 00 00 	movdqu XMMWORD PTR [rax+0x88],xmm0
     135acac:	00 

### 0x135ac80: mov    QWORD PTR [rax+0x70],rcx
     135ac59:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
     135ac5d:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx
     135ac61:	f3 0f 7f 40 38       	movdqu XMMWORD PTR [rax+0x38],xmm0
     135ac66:	48 83 60 58 00       	and    QWORD PTR [rax+0x58],0x0
     135ac6b:	f3 0f 7f 40 48       	movdqu XMMWORD PTR [rax+0x48],xmm0
     135ac70:	c7 40 60 00 00 80 3f 	mov    DWORD PTR [rax+0x60],0x3f800000
     135ac77:	b9 f4 01 00 00       	mov    ecx,0x1f4
     135ac7c:	48 89 48 68          	mov    QWORD PTR [rax+0x68],rcx
     135ac80:	48 89 48 70          	mov    QWORD PTR [rax+0x70],rcx
     135ac84:	48 83 a0 c0 00 00 00 	and    QWORD PTR [rax+0xc0],0x0
     135ac8b:	00 
     135ac8c:	48 83 a0 e0 00 00 00 	and    QWORD PTR [rax+0xe0],0x0
     135ac93:	00 
     135ac94:	48 8d 48 20          	lea    rcx,[rax+0x20]
     135ac98:	66 0f 7f 80 d0 00 00 	movdqa XMMWORD PTR [rax+0xd0],xmm0
     135ac9f:	00 
     135aca0:	f3 0f 7f 40 78       	movdqu XMMWORD PTR [rax+0x78],xmm0
     135aca5:	f3 0f 7f 80 88 00 00 	movdqu XMMWORD PTR [rax+0x88],xmm0
     135acac:	00 
     135acad:	66 48 0f 6e c0       	movq   xmm0,rax

### 0x135aca0: movdqu XMMWORD PTR [rax+0x78],xmm0
     135ac80:	48 89 48 70          	mov    QWORD PTR [rax+0x70],rcx
     135ac84:	48 83 a0 c0 00 00 00 	and    QWORD PTR [rax+0xc0],0x0
     135ac8b:	00 
     135ac8c:	48 83 a0 e0 00 00 00 	and    QWORD PTR [rax+0xe0],0x0
     135ac93:	00 
     135ac94:	48 8d 48 20          	lea    rcx,[rax+0x20]
     135ac98:	66 0f 7f 80 d0 00 00 	movdqa XMMWORD PTR [rax+0xd0],xmm0
     135ac9f:	00 
     135aca0:	f3 0f 7f 40 78       	movdqu XMMWORD PTR [rax+0x78],xmm0
     135aca5:	f3 0f 7f 80 88 00 00 	movdqu XMMWORD PTR [rax+0x88],xmm0
     135acac:	00 
     135acad:	66 48 0f 6e c0       	movq   xmm0,rax
     135acb2:	66 48 0f 6e c9       	movq   xmm1,rcx
     135acb7:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
     135acbb:	4c 8b 74 24 20       	mov    r14,QWORD PTR [rsp+0x20]
     135acc0:	49 8b 7e 48          	mov    rdi,QWORD PTR [r14+0x48]
     135acc4:	f3 41 0f 7f 4e 40    	movdqu XMMWORD PTR [r14+0x40],xmm1
     135acca:	e8 b7 37 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135accf:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     135acd4:	48 8b 38             	mov    rdi,QWORD PTR [rax]

### 0x135aca5: movdqu XMMWORD PTR [rax+0x88],xmm0
     135ac84:	48 83 a0 c0 00 00 00 	and    QWORD PTR [rax+0xc0],0x0
     135ac8b:	00 
     135ac8c:	48 83 a0 e0 00 00 00 	and    QWORD PTR [rax+0xe0],0x0
     135ac93:	00 
     135ac94:	48 8d 48 20          	lea    rcx,[rax+0x20]
     135ac98:	66 0f 7f 80 d0 00 00 	movdqa XMMWORD PTR [rax+0xd0],xmm0
     135ac9f:	00 
     135aca0:	f3 0f 7f 40 78       	movdqu XMMWORD PTR [rax+0x78],xmm0
     135aca5:	f3 0f 7f 80 88 00 00 	movdqu XMMWORD PTR [rax+0x88],xmm0
     135acac:	00 
     135acad:	66 48 0f 6e c0       	movq   xmm0,rax
     135acb2:	66 48 0f 6e c9       	movq   xmm1,rcx
     135acb7:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
     135acbb:	4c 8b 74 24 20       	mov    r14,QWORD PTR [rsp+0x20]
     135acc0:	49 8b 7e 48          	mov    rdi,QWORD PTR [r14+0x48]
     135acc4:	f3 41 0f 7f 4e 40    	movdqu XMMWORD PTR [r14+0x40],xmm1
     135acca:	e8 b7 37 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135accf:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     135acd4:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135acd7:	48 8d 35 12 ae 0d ff 	lea    rsi,[rip+0xffffffffff0dae12]        # 435af0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b53f>

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

### 0x135ad70: movdqu XMMWORD PTR [r12+0x60],xmm0
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

### 0x135ad77: movdqu XMMWORD PTR [r12+0x70],xmm0
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

### 0x135ad7e: movdqu XMMWORD PTR [r12+0x80],xmm0
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

### 0x135aeea: movdqu XMMWORD PTR [r12+0x58],xmm0
     135aec9:	41 0f 11 44 24 48    	movups XMMWORD PTR [r12+0x48],xmm0
     135aecf:	48 85 c0             	test   rax,rax
     135aed2:	74 05                	je     135aed9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a045d>
     135aed4:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135aed9:	48 8b 84 24 f8 00 00 	mov    rax,QWORD PTR [rsp+0xf8]
     135aee0:	00 
     135aee1:	66 0f 6f 84 24 f0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xf0]
     135aee8:	00 00 
     135aeea:	f3 41 0f 7f 44 24 58 	movdqu XMMWORD PTR [r12+0x58],xmm0
     135aef1:	48 85 c0             	test   rax,rax
     135aef4:	4c 8d b4 24 90 01 00 	lea    r14,[rsp+0x190]
     135aefb:	00 
     135aefc:	74 05                	je     135af03 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0487>
     135aefe:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135af03:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     135af08:	49 89 44 24 68       	mov    QWORD PTR [r12+0x68],rax
     135af0d:	49 8d 7c 24 70       	lea    rdi,[r12+0x70]
     135af12:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
     135af17:	e8 72 d3 7c ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     135af1c:	49 8d bc 24 c8 00 00 	lea    rdi,[r12+0xc8]

### 0x135af08: mov    QWORD PTR [r12+0x68],rax
     135aee8:	00 00 
     135aeea:	f3 41 0f 7f 44 24 58 	movdqu XMMWORD PTR [r12+0x58],xmm0
     135aef1:	48 85 c0             	test   rax,rax
     135aef4:	4c 8d b4 24 90 01 00 	lea    r14,[rsp+0x190]
     135aefb:	00 
     135aefc:	74 05                	je     135af03 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0487>
     135aefe:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135af03:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     135af08:	49 89 44 24 68       	mov    QWORD PTR [r12+0x68],rax
     135af0d:	49 8d 7c 24 70       	lea    rdi,[r12+0x70]
     135af12:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
     135af17:	e8 72 d3 7c ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     135af1c:	49 8d bc 24 c8 00 00 	lea    rdi,[r12+0xc8]
     135af23:	00 
     135af24:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
     135af29:	e8 60 d3 7c ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     135af2e:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     135af33:	49 89 84 24 20 01 00 	mov    QWORD PTR [r12+0x120],rax
     135af3a:	00 
     135af3b:	49 8d 9c 24 30 01 00 	lea    rbx,[r12+0x130]

### 0x135af0d: lea    rdi,[r12+0x70]
     135aeea:	f3 41 0f 7f 44 24 58 	movdqu XMMWORD PTR [r12+0x58],xmm0
     135aef1:	48 85 c0             	test   rax,rax
     135aef4:	4c 8d b4 24 90 01 00 	lea    r14,[rsp+0x190]
     135aefb:	00 
     135aefc:	74 05                	je     135af03 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0487>
     135aefe:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135af03:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     135af08:	49 89 44 24 68       	mov    QWORD PTR [r12+0x68],rax
     135af0d:	49 8d 7c 24 70       	lea    rdi,[r12+0x70]
     135af12:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
     135af17:	e8 72 d3 7c ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     135af1c:	49 8d bc 24 c8 00 00 	lea    rdi,[r12+0xc8]
     135af23:	00 
     135af24:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
     135af29:	e8 60 d3 7c ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     135af2e:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     135af33:	49 89 84 24 20 01 00 	mov    QWORD PTR [r12+0x120],rax
     135af3a:	00 
     135af3b:	49 8d 9c 24 30 01 00 	lea    rbx,[r12+0x130]
     135af42:	00 

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

### 0x135b3d0: movups XMMWORD PTR [r13+0x60],xmm0
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

### 0x135b3f4: movups XMMWORD PTR [r13+0x70],xmm0
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
     135b41a:	0f 28 43 c0          	movaps xmm0,XMMWORD PTR [rbx-0x40]
     135b41e:	41 0f 11 85 90 00 00 	movups XMMWORD PTR [r13+0x90],xmm0

### 0x135b40e: movaps XMMWORD PTR [r13+0x80],xmm0
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
     135b41a:	0f 28 43 c0          	movaps xmm0,XMMWORD PTR [rbx-0x40]
     135b41e:	41 0f 11 85 90 00 00 	movups XMMWORD PTR [r13+0x90],xmm0
     135b425:	00 
     135b426:	48 85 c0             	test   rax,rax
     135b429:	74 05                	je     135b430 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a09b4>
     135b42b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135b430:	4c 89 ef             	mov    rdi,r13
     135b433:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
     135b43a:	4c 89 fe             	mov    rsi,r15

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

### 0x135c11f: mov    rdi,QWORD PTR [r12+0x60]
     135c0f7:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     135c0fc:	e8 d3 da 47 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
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

## Calls immediately using rsp+0x80 as argument
### source 0x135bd66 -> call 0x135bd71: call   b8818c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd512c>
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
     135bd8d:	00 
     135bd8e:	e8 a1 04 00 00       	call   135c234 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a17b8>
     135bd93:	4c 89 ef             	mov    rdi,r13
     135bd96:	e8 cf e1 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135bd9b:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     135bda2:	00 
     135bda3:	e8 8c 04 00 00       	call   135c234 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a17b8>
     135bda8:	4c 89 ff             	mov    rdi,r15
     135bdab:	e8 e0 20 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### source 0x135c1b3 -> call 0x135c1bb: call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
     135c19d:	4c 8b 74 24 20       	mov    r14,QWORD PTR [rsp+0x20]
     135c1a2:	4c 89 f3             	mov    rbx,r14
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

## Registration evidence for ID 0xb8 near candidate construction family
### 0x135c7a6 FDE=(20301694, 20301915): mov    edx,0xb8
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

## All materializations of candidate vptr
### 0x135a7e1 FDE=(20293452, 20300282)
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

### 0x135c710 FDE=(20301580, 20301637)
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

## Destruction/copy methods around 0x135c70c
     135c653:	4c 8b 6e 08          	mov    r13,QWORD PTR [rsi+0x8]
     135c657:	48 8b 46 40          	mov    rax,QWORD PTR [rsi+0x40]
     135c65b:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     135c65f:	49 8d 6d 10          	lea    rbp,[r13+0x10]
     135c663:	49 8d 45 18          	lea    rax,[r13+0x18]
     135c667:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     135c66c:	49 83 c7 48          	add    r15,0x48
     135c670:	bf 28 07 00 00       	mov    edi,0x728
     135c675:	e8 86 18 49 00       	call   17edf00 <_Znwm@plt>
     135c67a:	49 89 c6             	mov    r14,rax
     135c67d:	0f 57 c0             	xorps  xmm0,xmm0
     135c680:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     135c684:	48 8d 05 dd 0d 4a 00 	lea    rax,[rip+0x4a0ddd]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     135c68b:	49 89 06             	mov    QWORD PTR [r14],rax
     135c68e:	4d 89 f4             	mov    r12,r14
     135c691:	49 83 c4 18          	add    r12,0x18
     135c695:	41 0f b6 45 20       	movzx  eax,BYTE PTR [r13+0x20]
     135c69a:	45 0f b6 55 21       	movzx  r10d,BYTE PTR [r13+0x21]
     135c69f:	4c 89 e7             	mov    rdi,r12
     135c6a2:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     135c6a7:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     135c6ac:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     135c6b1:	4c 8b 04 24          	mov    r8,QWORD PTR [rsp]
     135c6b5:	49 89 e9             	mov    r9,rbp
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
