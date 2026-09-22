# Final readiness dependency methods

## Proven Restrictions source chain
- registry ID 0x9e = RestrictionsSetupImpl
- service AP 0x184ca90
- +0x28 -> [this+0x10]
- constructor installs AP 0x184da88 child into this+0x10
- child +0x38 -> b411a4 -> [child+0x18]
- child+0x18 is constructor rcx
- factory supplies constructor rcx from its input dependency bundle +0x30

## Restrictions factory call window

/tmp/rfinal/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000010ab800 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x272c16>:
 10ab800:	4c 89 f7             	mov    rdi,r14
 10ab803:	e8 48 5f b6 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
 10ab808:	49 89 c7             	mov    r15,rax
 10ab80b:	4c 89 f7             	mov    rdi,r14
 10ab80e:	e8 67 5f b6 ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
 10ab813:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 10ab817:	4c 89 f7             	mov    rdi,r14
 10ab81a:	e8 07 5f b6 ff       	call   c11726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6c6>
 10ab81f:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
 10ab824:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
 10ab828:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 10ab82d:	48 8b 43 60          	mov    rax,QWORD PTR [rbx+0x60]
 10ab831:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
 10ab836:	48 8b 83 98 00 00 00 	mov    rax,QWORD PTR [rbx+0x98]
 10ab83d:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 10ab842:	48 8b 6b 68          	mov    rbp,QWORD PTR [rbx+0x68]
 10ab846:	48 8d 35 0a 4a 2b ff 	lea    rsi,[rip+0xffffffffff2b4a0a]        # 360257 <_ZTSSt12bad_any_cast@@Base-0x2ff71>
 10ab84d:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
 10ab852:	4c 89 e7             	mov    rdi,r12
 10ab855:	e8 24 e2 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10ab85a:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
 10ab85e:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
 10ab865:	00 
 10ab866:	48 89 ee             	mov    rsi,rbp
 10ab869:	4c 89 e2             	mov    rdx,r12
 10ab86c:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10ab86f:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
 10ab873:	4c 89 ef             	mov    rdi,r13
 10ab876:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ab879:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
 10ab87e:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
 10ab882:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 10ab887:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10ab88a:	4c 89 ff             	mov    rdi,r15
 10ab88d:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ab890:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 10ab895:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
 10ab899:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10ab89e:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
 10ab8a2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ab8a5:	ff 50 30             	call   QWORD PTR [rax+0x30]
 10ab8a8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 10ab8ab:	48 89 c7             	mov    rdi,rax
 10ab8ae:	ff 91 78 01 00 00    	call   QWORD PTR [rcx+0x178]
 10ab8b4:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 10ab8b8:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
 10ab8bf:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 10ab8c4:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
 10ab8c9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ab8cc:	ff 50 40             	call   QWORD PTR [rax+0x40]
 10ab8cf:	48 89 c5             	mov    rbp,rax
 10ab8d2:	4c 89 f7             	mov    rdi,r14
 10ab8d5:	e8 b4 b3 c0 ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
 10ab8da:	49 89 c7             	mov    r15,rax
 10ab8dd:	4c 89 f7             	mov    rdi,r14
 10ab8e0:	e8 bb 79 ab ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
 10ab8e5:	49 89 c4             	mov    r12,rax
 10ab8e8:	4c 89 f7             	mov    rdi,r14
 10ab8eb:	e8 3e a4 ff ff       	call   10a5d2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d144>
 10ab8f0:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 10ab8f3:	48 89 c7             	mov    rdi,rax
 10ab8f6:	ff 51 28             	call   QWORD PTR [rcx+0x28]
 10ab8f9:	49 89 c5             	mov    r13,rax
 10ab8fc:	4c 89 f7             	mov    rdi,r14
 10ab8ff:	e8 b8 a0 fc ff       	call   10759bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23cdd2>
 10ab904:	49 89 c6             	mov    r14,rax
 10ab907:	bf 80 00 00 00       	mov    edi,0x80
 10ab90c:	e8 ef 25 74 00       	call   17edf00 <_Znwm@plt>
 10ab911:	48 89 c3             	mov    rbx,rax
 10ab914:	49 83 c6 10          	add    r14,0x10
 10ab918:	48 8d 05 99 59 78 00 	lea    rax,[rip+0x785999]        # 18312b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3250>
 10ab91f:	4c 8d 84 24 90 00 00 	lea    r8,[rsp+0x90]
 10ab926:	00 
 10ab927:	49 89 00             	mov    QWORD PTR [r8],rax
 10ab92a:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 10ab92f:	49 89 40 08          	mov    QWORD PTR [r8+0x8],rax
 10ab933:	4d 89 40 20          	mov    QWORD PTR [r8+0x20],r8
 10ab937:	41 0f b6 47 11       	movzx  eax,BYTE PTR [r15+0x11]
 10ab93c:	48 89 df             	mov    rdi,rbx
 10ab93f:	48 8b 74 24 58       	mov    rsi,QWORD PTR [rsp+0x58]
 10ab944:	48 8b 54 24 50       	mov    rdx,QWORD PTR [rsp+0x50]
 10ab949:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
 10ab94e:	4c 8b 4c 24 48       	mov    r9,QWORD PTR [rsp+0x48]
 10ab953:	41 56                	push   r14
 10ab955:	41 55                	push   r13
 10ab957:	41 54                	push   r12
 10ab959:	50                   	push   rax
 10ab95a:	55                   	push   rbp
 10ab95b:	ff 74 24 30          	push   QWORD PTR [rsp+0x30]
 10ab95f:	ff 74 24 30          	push   QWORD PTR [rsp+0x30]
 10ab963:	ff 74 24 48          	push   QWORD PTR [rsp+0x48]
 10ab967:	ff 74 24 58          	push   QWORD PTR [rsp+0x58]
 10ab96b:	ff 74 24 68          	push   QWORD PTR [rsp+0x68]
 10ab96f:	ff b4 24 88 00 00 00 	push   QWORD PTR [rsp+0x88]
 10ab976:	48 8d 84 24 d8 00 00 	lea    rax,[rsp+0xd8]
 10ab97d:	00 
 10ab97e:	50                   	push   rax
 10ab97f:	e8 b2 00 00 00       	call   10aba36 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x272e4c>
 10ab984:	48 83 c4 60          	add    rsp,0x60
 10ab988:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 10ab98f:	00 

## Restrictions child AP 0x184da88 table through +0x180
### AP 0x184da88
- +0x0: 0x10c09c6
- +0x8: 0x10c0a66
- +0x10: 0xe750be
- +0x18: 0xa55cb0
- +0x20: 0xa7a004
- +0x28: 0xaa7024
- +0x30: 0xbf7896
- +0x38: 0xb411a4
- +0x40: 0xb04950
- +0x48: 0xaa7012
- +0x50: NO_RELOC
- +0x58: NO_RELOC
- +0x60: 0x10c0a78
- +0x68: 0x10c0a92
- +0x70: 0x10c0aa4
- +0x78: 0x10c0b66
- +0x80: 0x10c0bae
- +0x88: 0x10c0bf2
- +0x90: 0x10c0c3a
- +0x98: 0x10c0c7a
- +0xa0: 0x10c0cba
- +0xa8: NO_RELOC
- +0xb0: NO_RELOC
- +0xb8: 0x10c0ce6
- +0xc0: 0x10c0cf0
- +0xc8: 0x9d7de0
- +0xd0: 0x9d7de0
- +0xd8: 0x9d7de0
- +0xe0: 0x9d7de0
- +0xe8: 0x10c0cfa
- +0xf0: 0x9d7de0
- +0xf8: 0x10c0d04
- +0x100: 0x9d7de0
- +0x108: 0x10c0d0e
- +0x110: 0x10c0d18
- +0x118: 0x10c0d22
- +0x120: 0x9d7de0
- +0x128: 0x9d7de0
- +0x130: 0x9d7de0
- +0x138: 0x9d7de0
- +0x140: 0x10c0d2c
- +0x148: NO_RELOC
- +0x150: NO_RELOC
- +0x158: 0x9d7de0
- +0x160: 0xa50370
- +0x168: 0x9d7de0
- +0x170: 0x9d81d0
- +0x178: 0x1066dbe
- +0x180: 0x1066dbe
### AP 0x1875b78
- +0x0: 0x9d7de0
- +0x8: 0xa50370
- +0x10: 0x1493622
- +0x18: 0x149362e
- +0x20: 0x149363a
- +0x28: 0x1493680
- +0x30: 0x1493692
- +0x38: 0x14936a4
- +0x40: 0x14936f6
- +0x48: 0x1493704
- +0x50: 0x1493712
- +0x58: 0x1493768
- +0x60: 0x149377e
- +0x68: 0x1493794
- +0x70: 0x14937e6
- +0x78: 0x14937f2
- +0x80: 0x1493800
- +0x88: 0x1493852
- +0x90: 0x1493864
- +0x98: 0x149387a
- +0xa0: 0x14938c8
- +0xa8: 0x1493970
- +0xb0: 0x1493a18
- +0xb8: 0x1493ac0
- +0xc0: 0x1493ad6
- +0xc8: 0x1493aec
- +0xd0: 0x1493b04
- +0xd8: 0x1493b0c
- +0xe0: 0x1493b1c
- +0xe8: 0x1493bc4
- +0xf0: 0x1493bd4
- +0xf8: 0x1493c7c
- +0x100: 0x1493c84
- +0x108: 0x1493c8c
- +0x110: 0x1493cb6
- +0x118: 0x1493cc6
- +0x120: 0x1493cd6
- +0x128: 0x1493cee
- +0x130: 0x1493dc0
- +0x138: 0x1493dd0
- +0x140: 0x1493eaa
- +0x148: NO_RELOC
- +0x150: NO_RELOC
- +0x158: 0xaaa9b2
- +0x160: 0xaaa9bc
- +0x168: 0x174ec6a
- +0x170: 0x174f1dc
- +0x178: 0x149d776
- +0x180: 0x174ef82

## Automix +0x30 exact getter

/tmp/rfinal/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000c07290 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x154230>:
  c07290:	c6                   	(bad)
  c07291:	10 ba b0 00 00 00    	adc    BYTE PTR [rdx+0xb0],bh
  c07297:	e8 34 88 be 00       	call   17efad0 <memcpy@plt>
  c0729c:	48 89 d8             	mov    rax,rbx
  c0729f:	5b                   	pop    rbx
  c072a0:	c3                   	ret
  c072a1:	cc                   	int3
  c072a2:	48 8b 87 c0 00 00 00 	mov    rax,QWORD PTR [rdi+0xc0]
  c072a9:	c3                   	ret
  c072aa:	31 f6                	xor    esi,esi
  c072ac:	e9                   	.byte 0xe9
  c072ad:	01 00                	add    DWORD PTR [rax],eax
	...

## Automix +0xc0 object +0x28 exact body

/tmp/rfinal/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000001493660 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d8be4>:
 1493660:	00 00                	add    BYTE PTR [rax],al
 1493662:	00 85 f6 74 0e 48    	add    BYTE PTR [rbp+0x480e74f6],al
 1493668:	c1 ef 20             	shr    edi,0x20
 149366b:	89 ce                	mov    esi,ecx
 149366d:	4c 89 c2             	mov    rdx,r8
 1493670:	e9 df 7d 00 00       	jmp    149b454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e09d8>
 1493675:	89 ce                	mov    esi,ecx
 1493677:	4c 89 c2             	mov    rdx,r8
 149367a:	e9 2a 7d 00 00       	jmp    149b3a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e092d>
 149367f:	cc                   	int3
 1493680:	53                   	push   rbx
 1493681:	48 89 fb             	mov    rbx,rdi
 1493684:	89 d6                	mov    esi,edx
 1493686:	89 ca                	mov    edx,ecx
 1493688:	e8 76 74 00 00       	call   149ab03 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e0087>
 149368d:	48 89 d8             	mov    rax,rbx
 1493690:	5b                   	pop    rbx
 1493691:	c3                   	ret
 1493692:	53                   	push   rbx
 1493693:	48 89 fb             	mov    rbx,rdi
 1493696:	89 d6                	mov    esi,edx
 1493698:	89 ca                	mov    edx,ecx
 149369a:	e8 37 6c 00 00       	call   149a2d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2df85a>
 149369f:	48                   	rex.W

## Wider FDE-like neighborhood for 0x1493680

/tmp/rfinal/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000014935f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d8b74>:
 14935f0:	48 8b 04 25 28 00 00 	mov    rax,QWORD PTR ds:0x28
 14935f7:	00 
 14935f8:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
 14935ff:	00 
 1493600:	75 08                	jne    149360a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d8b8e>
 1493602:	4c 89 f7             	mov    rdi,r14
 1493605:	e8 c6 c6 5d ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 149360a:	e8 a1 c4 35 00       	call   17efab0 <__stack_chk_fail@plt>
 149360f:	cc                   	int3
 1493610:	53                   	push   rbx
 1493611:	48 89 fb             	mov    rbx,rdi
 1493614:	6a 04                	push   0x4
 1493616:	5a                   	pop    rdx
 1493617:	e8 c6 2a 31 00       	call   17a60e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a24e>
 149361c:	48 89 d8             	mov    rax,rbx
 149361f:	5b                   	pop    rbx
 1493620:	c3                   	ret
 1493621:	cc                   	int3
 1493622:	89 f7                	mov    edi,esi
 1493624:	89 d6                	mov    esi,edx
 1493626:	48 89 ca             	mov    rdx,rcx
 1493629:	e9 26 7e 00 00       	jmp    149b454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e09d8>
 149362e:	89 f7                	mov    edi,esi
 1493630:	89 d6                	mov    esi,edx
 1493632:	48 89 ca             	mov    rdx,rcx
 1493635:	e9 6f 7d 00 00       	jmp    149b3a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e092d>
 149363a:	83 fa 0d             	cmp    edx,0xd
 149363d:	77 1a                	ja     1493659 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d8bdd>
 149363f:	89 d0                	mov    eax,edx
 1493641:	48 8d 15 30 3f fa fe 	lea    rdx,[rip+0xfffffffffefa3f30]        # 437578 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5cfc7>
 1493648:	48 8d 3d 99 3f fa fe 	lea    rdi,[rip+0xfffffffffefa3f99]        # 4375e8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5d037>
 149364f:	48 8b 3c c7          	mov    rdi,QWORD PTR [rdi+rax*8]
 1493653:	48 0b 3c c2          	or     rdi,QWORD PTR [rdx+rax*8]
 1493657:	eb 0a                	jmp    1493663 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d8be7>
 1493659:	48 bf 01 00 00 00 01 	movabs rdi,0x100000001
 1493660:	00 00 00 
 1493663:	85 f6                	test   esi,esi
 1493665:	74 0e                	je     1493675 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d8bf9>
 1493667:	48 c1 ef 20          	shr    rdi,0x20
 149366b:	89 ce                	mov    esi,ecx
 149366d:	4c 89 c2             	mov    rdx,r8
 1493670:	e9 df 7d 00 00       	jmp    149b454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e09d8>
 1493675:	89 ce                	mov    esi,ecx
 1493677:	4c 89 c2             	mov    rdx,r8
 149367a:	e9 2a 7d 00 00       	jmp    149b3a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e092d>
 149367f:	cc                   	int3
 1493680:	53                   	push   rbx
 1493681:	48 89 fb             	mov    rbx,rdi
 1493684:	89 d6                	mov    esi,edx
 1493686:	89 ca                	mov    edx,ecx
 1493688:	e8 76 74 00 00       	call   149ab03 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e0087>
 149368d:	48 89 d8             	mov    rax,rbx
 1493690:	5b                   	pop    rbx
 1493691:	c3                   	ret
 1493692:	53                   	push   rbx
 1493693:	48 89 fb             	mov    rbx,rdi
 1493696:	89 d6                	mov    esi,edx
 1493698:	89 ca                	mov    edx,ecx
 149369a:	e8 37 6c 00 00       	call   149a2d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2df85a>
 149369f:	48 89 d8             	mov    rax,rbx
 14936a2:	5b                   	pop    rbx
 14936a3:	c3                   	ret
 14936a4:	53                   	push   rbx
 14936a5:	48 89 fb             	mov    rbx,rdi
 14936a8:	83 f9 0d             	cmp    ecx,0xd
 14936ab:	77 1a                	ja     14936c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d8c4b>
 14936ad:	89 c8                	mov    eax,ecx
 14936af:	48 8d 0d c2 3e fa fe 	lea    rcx,[rip+0xfffffffffefa3ec2]        # 437578 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5cfc7>
 14936b6:	48 8d 35 2b 3f fa fe 	lea    rsi,[rip+0xfffffffffefa3f2b]        # 4375e8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5d037>
 14936bd:	48 8b 34 c6          	mov    rsi,QWORD PTR [rsi+rax*8]
 14936c1:	48 0b 34 c1          	or     rsi,QWORD PTR [rcx+rax*8]
 14936c5:	eb 0a                	jmp    14936d1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d8c55>
 14936c7:	48 be 01 00 00 00 01 	movabs rsi,0x100000001
 14936ce:	00 00 00 
 14936d1:	85 d2                	test   edx,edx
 14936d3:	74 11                	je     14936e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d8c6a>
 14936d5:	48 c1 ee 20          	shr    rsi,0x20
 14936d9:	48 89 df             	mov    rdi,rbx
 14936dc:	44 89 c2             	mov    edx,r8d
 14936df:	e8 1f 74 00 00       	call   149ab03 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e0087>
 14936e4:	eb 0b                	jmp    14936f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d8c75>
 14936e6:	48 89 df             	mov    rdi,rbx
 14936e9:	44 89 c2             	mov    edx,r8d
 14936ec:	e8 e5 6b 00 00       	call   149a2d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2df85a>
 14936f1:	48 89 d8             	mov    rax,rbx
 14936f4:	5b                   	pop    rbx
 14936f5:	c3                   	ret
 14936f6:	89 f7                	mov    edi,esi
 14936f8:	89 d6                	mov    esi,edx
 14936fa:	89 ca                	mov    edx,ecx
 14936fc:	4c 89 c1             	mov    rcx,r8
 14936ff:	e9 25 6b 00 00       	jmp    149a229 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2df7ad>
 1493704:	89 f7                	mov    edi,esi
 1493706:	89 d6                	mov    esi,edx
 1493708:	89 ca                	mov    edx,ecx
 149370a:	4c 89 c1             	mov    rcx,r8
 149370d:	e9 6a 6a 00 00       	jmp    149a17c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2df700>
 1493712:	55                   	push   rbp
 1493713:	41 57                	push   r15
 1493715:	41 56                	push   r14
 1493717:	53                   	push   rbx
 1493718:	50                   	push   rax
 1493719:	4c 89 cb             	mov    rbx,r9
 149371c:	44 89 c5             	mov    ebp,r8d
 149371f:	41                   	rex.B

## AP/materialization refs for 0x1875b78
630957-  c07050:	0f 5b c3             	cvtdq2ps xmm0,xmm3
630958-  c07053:	0f 5e c6             	divps  xmm0,xmm6
630959-  c07056:	0f 11 83 90 00 00 00 	movups XMMWORD PTR [rbx+0x90],xmm0
630960-  c0705d:	0f 5b c4             	cvtdq2ps xmm0,xmm4
630961-  c07060:	0f 5e 05 09 6e 78 ff 	divps  xmm0,XMMWORD PTR [rip+0xffffffffff786e09]        # 38de70 <_ZTSSt12bad_any_cast@@Base-0x2358>
630962-  c07067:	0f 13 83 a0 00 00 00 	movlps QWORD PTR [rbx+0xa0],xmm0
630963-  c0706e:	8a 4c 24 03          	mov    cl,BYTE PTR [rsp+0x3]
630964-  c07072:	88 8b a8 00 00 00    	mov    BYTE PTR [rbx+0xa8],cl
630965-  c07078:	48 98                	cdqe
630966-  c0707a:	f3 0f 10 44 24 18    	movss  xmm0,DWORD PTR [rsp+0x18]
630967-  c07080:	f3 0f 11 83 ac 00 00 	movss  DWORD PTR [rbx+0xac],xmm0
630968-  c07087:	00 
630969-  c07088:	66 0f 7e ab b0 00 00 	movd   DWORD PTR [rbx+0xb0],xmm5
630970-  c0708f:	00 
630971-  c07090:	48 89 83 b8 00 00 00 	mov    QWORD PTR [rbx+0xb8],rax
630972-  c07097:	bf b8 00 00 00       	mov    edi,0xb8
630973-  c0709c:	e8 5f 6e be 00       	call   17edf00 <_Znwm@plt>
630974-  c070a1:	49 89 c6             	mov    r14,rax
630975:  c070a4:	48 8d 05 cd ea c6 00 	lea    rax,[rip+0xc6eacd]        # 1875b78 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32260>
630976-  c070ab:	49 89 06             	mov    QWORD PTR [r14],rax
630977-  c070ae:	4c 89 f7             	mov    rdi,r14
630978-  c070b1:	48 83 c7 08          	add    rdi,0x8
630979-  c070b5:	ba b0 00 00 00       	mov    edx,0xb0
630980-  c070ba:	48 8b b4 24 a0 00 00 	mov    rsi,QWORD PTR [rsp+0xa0]
630981-  c070c1:	00 
630982-  c070c2:	e8 09 8a be 00       	call   17efad0 <memcpy@plt>
630983-  c070c7:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
630984-  c070ce:	00 
630985-  c070cf:	48 8b 38             	mov    rdi,QWORD PTR [rax]
630986-  c070d2:	4c 89 30             	mov    QWORD PTR [rax],r14
630987-  c070d5:	48 85 ff             	test   rdi,rdi
630988-  c070d8:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
630989-  c070dd:	74 06                	je     c070e5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x154085>
630990-  c070df:	48 8b 07             	mov    rax,QWORD PTR [rdi]
630991-  c070e2:	ff 50 08             	call   QWORD PTR [rax+0x8]
630992-  c070e5:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
630993-  c070ec:	00 
630994-  c070ed:	48 83 a4 24 b8 00 00 	and    QWORD PTR [rsp+0xb8],0x0
630995-  c070f4:	00 00 
630996-  c070f6:	48 85 ff             	test   rdi,rdi
630997-  c070f9:	74 06                	je     c07101 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1540a1>
630998-  c070fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
630999-  c070fe:	ff 50 08             	call   QWORD PTR [rax+0x8]
631000-  c07101:	49 89 1e             	mov    QWORD PTR [r14],rbx
631001-  c07104:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
631002-  c0710b:	00 00 
631003-  c0710d:	48 3b 84 24 20 01 00 	cmp    rax,QWORD PTR [rsp+0x120]
631004-  c07114:	00 
631005-  c07115:	0f 85 2e 01 00 00    	jne    c07249 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1541e9>
631006-  c0711b:	4c 89 f0             	mov    rax,r14
631007-  c0711e:	48 81 c4 28 01 00 00 	add    rsp,0x128
631008-  c07125:	5b                   	pop    rbx
631009-  c07126:	41 5c                	pop    r12
631010-  c07128:	41 5d                	pop    r13

## Direct callers/refs to 0x1493680
