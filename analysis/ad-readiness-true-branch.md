# adObject+0x1b8 readiness true branch

Anchor: 0x1352547 reads [adObject+0x1b8] and 0x1352702 branches on it.

## Exact branch 0x13526e0..0x1352920

/tmp/adready/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000013526e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197c64>:
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
 1352710:	ff d0                	call   rax
 1352712:	49 89 c6             	mov    r14,rax
 1352715:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
 1352719:	48 8d 35 a7 a6 08 ff 	lea    rsi,[rip+0xffffffffff08a6a7]        # 3dcdc7 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2816>
 1352720:	48 8d 0d a9 a6 08 ff 	lea    rcx,[rip+0xffffffffff08a6a9]        # 3dcdd0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x281f>
 1352727:	6a 08                	push   0x8
 1352729:	41 5f                	pop    r15
 135272b:	6a 24                	push   0x24
 135272d:	41 58                	pop    r8
 135272f:	4c 89 fa             	mov    rdx,r15
 1352732:	41 b9 dc 05 00 00    	mov    r9d,0x5dc
 1352738:	e8 ed 4c 29 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
 135273d:	89 c5                	mov    ebp,eax
 135273f:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
 1352743:	48 8d 35 ab a6 08 ff 	lea    rsi,[rip+0xffffffffff08a6ab]        # 3dcdf5 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2844>
 135274a:	48 8d 0d af a6 08 ff 	lea    rcx,[rip+0xffffffffff08a6af]        # 3dce00 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x284f>
 1352751:	6a 18                	push   0x18
 1352753:	41 58                	pop    r8
 1352755:	6a 0a                	push   0xa
 1352757:	41 59                	pop    r9
 1352759:	4c 89 fa             	mov    rdx,r15
 135275c:	e8 c9 4c 29 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
 1352761:	41 89 c5             	mov    r13d,eax
 1352764:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 1352768:	4c 89 e7             	mov    rdi,r12
 135276b:	ff 50 28             	call   QWORD PTR [rax+0x28]
 135276e:	49 89 c7             	mov    r15,rax
 1352771:	bf 90 00 00 00       	mov    edi,0x90
 1352776:	e8 85 b7 49 00       	call   17edf00 <_Znwm@plt>
 135277b:	48 63 cd             	movsxd rcx,ebp
 135277e:	49 63 d5             	movsxd rdx,r13d
 1352781:	48 89 08             	mov    QWORD PTR [rax],rcx
 1352784:	c6 40 08 01          	mov    BYTE PTR [rax+0x8],0x1
 1352788:	48 89 50 10          	mov    QWORD PTR [rax+0x10],rdx
 135278c:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 1352791:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
 1352795:	49 8b 8e d8 01 00 00 	mov    rcx,QWORD PTR [r14+0x1d8]
 135279c:	41 0f 28 86 d0 01 00 	movaps xmm0,XMMWORD PTR [r14+0x1d0]
 13527a3:	00 
 13527a4:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
 13527a8:	48 85 c9             	test   rcx,rcx
 13527ab:	74 05                	je     13527b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197d36>
 13527ad:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
 13527b2:	49 8b 8f c8 01 00 00 	mov    rcx,QWORD PTR [r15+0x1c8]
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
 1352824:	6a 10                	push   0x10
 1352826:	5f                   	pop    rdi
 1352827:	e8 d4 b6 49 00       	call   17edf00 <_Znwm@plt>
 135282c:	48 8d 0d c5 50 51 00 	lea    rcx,[rip+0x5150c5]        # 18678f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23fe0>
 1352833:	48 89 08             	mov    QWORD PTR [rax],rcx
 1352836:	4c 89 78 08          	mov    QWORD PTR [rax+0x8],r15
 135283a:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
 135283f:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
 1352842:	48 89 01             	mov    QWORD PTR [rcx],rax
 1352845:	48 85 ff             	test   rdi,rdi
 1352848:	74 06                	je     1352850 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197dd4>
 135284a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 135284d:	ff 50 08             	call   QWORD PTR [rax+0x8]
 1352850:	6a 38                	push   0x38
 1352852:	5f                   	pop    rdi
 1352853:	e8 a8 b6 49 00       	call   17edf00 <_Znwm@plt>
 1352858:	48 8d 0d 11 50 51 00 	lea    rcx,[rip+0x515011]        # 1867870 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23f58>
 135285f:	48 89 08             	mov    QWORD PTR [rax],rcx
 1352862:	49 8b 8e d8 01 00 00 	mov    rcx,QWORD PTR [r14+0x1d8]
 1352869:	66 41 0f 6f 86 d0 01 	movdqa xmm0,XMMWORD PTR [r14+0x1d0]
 1352870:	00 00 
 1352872:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
 1352877:	48 85 c9             	test   rcx,rcx
 135287a:	74 05                	je     1352881 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197e05>
 135287c:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
 1352881:	66 0f ef c0          	pxor   xmm0,xmm0
 1352885:	f3 0f 7f 40 18       	movdqu XMMWORD PTR [rax+0x18],xmm0
 135288a:	48 83 60 28 00       	and    QWORD PTR [rax+0x28],0x0
 135288f:	c6 40 30 01          	mov    BYTE PTR [rax+0x30],0x1
 1352893:	4c 8d b4 24 50 01 00 	lea    r14,[rsp+0x150]
 135289a:	00 
 135289b:	49 83 26 00          	and    QWORD PTR [r14],0x0
 135289f:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
 13528a4:	48 89 c6             	mov    rsi,rax
 13528a7:	e8 26 0c 00 00       	call   13534d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a56>
 13528ac:	4c 89 f7             	mov    rdi,r14
 13528af:	e8 3e 0c 00 00       	call   13534f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a76>
 13528b4:	80 7c 24 28 00       	cmp    BYTE PTR [rsp+0x28],0x0
 13528b9:	0f 84 a9 00 00 00    	je     1352968 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197eec>
 13528bf:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
 13528c6:	00 
 13528c7:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
 13528cc:	e8 43 68 0e 00       	call   1439114 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27e698>
 13528d1:	48 8b 84 24 50 01 00 	mov    rax,QWORD PTR [rsp+0x150]
 13528d8:	00 
 13528d9:	48 83 a4 24 50 01 00 	and    QWORD PTR [rsp+0x150],0x0
 13528e0:	00 00 
 13528e2:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
 13528e7:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
 13528ea:	48 89 01             	mov    QWORD PTR [rcx],rax
 13528ed:	48 85 ff             	test   rdi,rdi
 13528f0:	74 06                	je     13528f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197e7c>
 13528f2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 13528f5:	ff 50 08             	call   QWORD PTR [rax+0x8]
 13528f8:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
 13528ff:	00 
 1352900:	e8 f5 0b 00 00       	call   13534fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a7e>
 1352905:	e9 7f 01 00 00       	jmp    1352a89 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19800d>
 135290a:	4c 89 e7             	mov    rdi,r12
 135290d:	ff d0                	call   rax
 135290f:	0f 28 40 60          	movaps xmm0,XMMWORD PTR [rax+0x60]
 1352913:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
 135291a:	00 
 135291b:	4c 8b 68 68          	mov    r13,QWORD PTR [rax+0x68]
 135291f:	4d                   	rex.WRB

## Wider object build 0x13524c0..0x1352b20

/tmp/adready/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000013524c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197a44>:
 13524c0:	00 00                	add    BYTE PTR [rax],al
 13524c2:	00 64 48 8b          	add    BYTE PTR [rax+rcx*2-0x75],ah
 13524c6:	04 25                	add    al,0x25
 13524c8:	28 00                	sub    BYTE PTR [rax],al
 13524ca:	00 00                	add    BYTE PTR [rax],al
 13524cc:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax
 13524d3:	00 
 13524d4:	48 89 cf             	mov    rdi,rcx
 13524d7:	e8 a2 3a 83 ff       	call   b85f7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2f1e>
 13524dc:	49 89 c4             	mov    r12,rax
 13524df:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 13524e3:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]
 13524e7:	ba 89 00 00 00       	mov    edx,0x89
 13524ec:	e8 ed fd 80 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
 13524f1:	49 8b 06             	mov    rax,QWORD PTR [r14]
 13524f4:	4c 8b a8 48 04 00 00 	mov    r13,QWORD PTR [rax+0x448]
 13524fb:	4d 85 ed             	test   r13,r13
 13524fe:	0f 84 ee 0c 00 00    	je     13531f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198776>
 1352504:	4c 89 f7             	mov    rdi,r14
 1352507:	e8 94 0d 81 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
 135250c:	49 89 c7             	mov    r15,rax
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
 1352575:	48 89 c3             	mov    rbx,rax
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
 13525e8:	6a 18                	push   0x18
 13525ea:	41 58                	pop    r8
 13525ec:	6a 0a                	push   0xa
 13525ee:	41 59                	pop    r9
 13525f0:	4c 89 f2             	mov    rdx,r14
 13525f3:	6a 0a                	push   0xa
 13525f5:	6a 01                	push   0x1
 13525f7:	e8 f6 4f 29 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 13525fc:	58                   	pop    rax
 13525fd:	59                   	pop    rcx
 13525fe:	40 84 ed             	test   bpl,bpl
 1352601:	0f 84 b7 0b 00 00    	je     13531be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198742>
 1352607:	48 8d 43 10          	lea    rax,[rbx+0x10]
 135260b:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 1352610:	48 8d 43 18          	lea    rax,[rbx+0x18]
 1352614:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 1352619:	48 8d 43 20          	lea    rax,[rbx+0x20]
 135261d:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
 1352622:	48 8d 43 28          	lea    rax,[rbx+0x28]
 1352626:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 135262b:	48 8d 43 30          	lea    rax,[rbx+0x30]
 135262f:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
 1352634:	48 8d 43 38          	lea    rax,[rbx+0x38]
 1352638:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
 135263d:	48 8d 43 40          	lea    rax,[rbx+0x40]
 1352641:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 1352646:	48 8d 43 48          	lea    rax,[rbx+0x48]
 135264a:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
 135264f:	48 89 d8             	mov    rax,rbx
 1352652:	48 83 c0 50          	add    rax,0x50
 1352656:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
 135265b:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 135265f:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
 1352666:	00 
 1352667:	4c 89 e6             	mov    rsi,r12
 135266a:	ff 50 58             	call   QWORD PTR [rax+0x58]
 135266d:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 1352671:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
 1352678:	00 
 1352679:	4c 89 e6             	mov    rsi,r12
 135267c:	ff 50 60             	call   QWORD PTR [rax+0x60]
 135267f:	48 8b 6c 24 70       	mov    rbp,QWORD PTR [rsp+0x70]
 1352684:	6a 18                	push   0x18
 1352686:	5f                   	pop    rdi
 1352687:	e8 74 b8 49 00       	call   17edf00 <_Znwm@plt>
 135268c:	49 89 c6             	mov    r14,rax
 135268f:	48 8d 05 22 4d 51 00 	lea    rax,[rip+0x514d22]        # 18673b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23aa0>
 1352696:	49 89 06             	mov    QWORD PTR [r14],rax
 1352699:	48 8b bc 24 50 01 00 	mov    rdi,QWORD PTR [rsp+0x150]
 13526a0:	00 
 13526a1:	49 89 7e 08          	mov    QWORD PTR [r14+0x8],rdi
 13526a5:	48 8b 84 24 58 01 00 	mov    rax,QWORD PTR [rsp+0x158]
 13526ac:	00 
 13526ad:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
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
 1352710:	ff d0                	call   rax
 1352712:	49 89 c6             	mov    r14,rax
 1352715:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
 1352719:	48 8d 35 a7 a6 08 ff 	lea    rsi,[rip+0xffffffffff08a6a7]        # 3dcdc7 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2816>
 1352720:	48 8d 0d a9 a6 08 ff 	lea    rcx,[rip+0xffffffffff08a6a9]        # 3dcdd0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x281f>
 1352727:	6a 08                	push   0x8
 1352729:	41 5f                	pop    r15
 135272b:	6a 24                	push   0x24
 135272d:	41 58                	pop    r8
 135272f:	4c 89 fa             	mov    rdx,r15
 1352732:	41 b9 dc 05 00 00    	mov    r9d,0x5dc
 1352738:	e8 ed 4c 29 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
 135273d:	89 c5                	mov    ebp,eax
 135273f:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
 1352743:	48 8d 35 ab a6 08 ff 	lea    rsi,[rip+0xffffffffff08a6ab]        # 3dcdf5 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2844>
 135274a:	48 8d 0d af a6 08 ff 	lea    rcx,[rip+0xffffffffff08a6af]        # 3dce00 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x284f>
 1352751:	6a 18                	push   0x18
 1352753:	41 58                	pop    r8
 1352755:	6a 0a                	push   0xa
 1352757:	41 59                	pop    r9
 1352759:	4c 89 fa             	mov    rdx,r15
 135275c:	e8 c9 4c 29 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
 1352761:	41 89 c5             	mov    r13d,eax
 1352764:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 1352768:	4c 89 e7             	mov    rdi,r12
 135276b:	ff 50 28             	call   QWORD PTR [rax+0x28]
 135276e:	49 89 c7             	mov    r15,rax
 1352771:	bf 90 00 00 00       	mov    edi,0x90
 1352776:	e8 85 b7 49 00       	call   17edf00 <_Znwm@plt>
 135277b:	48 63 cd             	movsxd rcx,ebp
 135277e:	49 63 d5             	movsxd rdx,r13d
 1352781:	48 89 08             	mov    QWORD PTR [rax],rcx
 1352784:	c6 40 08 01          	mov    BYTE PTR [rax+0x8],0x1
 1352788:	48 89 50 10          	mov    QWORD PTR [rax+0x10],rdx
 135278c:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 1352791:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
 1352795:	49 8b 8e d8 01 00 00 	mov    rcx,QWORD PTR [r14+0x1d8]
 135279c:	41 0f 28 86 d0 01 00 	movaps xmm0,XMMWORD PTR [r14+0x1d0]
 13527a3:	00 
 13527a4:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
 13527a8:	48 85 c9             	test   rcx,rcx
 13527ab:	74 05                	je     13527b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197d36>
 13527ad:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
 13527b2:	49 8b 8f c8 01 00 00 	mov    rcx,QWORD PTR [r15+0x1c8]
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
 1352824:	6a 10                	push   0x10
 1352826:	5f                   	pop    rdi
 1352827:	e8 d4 b6 49 00       	call   17edf00 <_Znwm@plt>
 135282c:	48 8d 0d c5 50 51 00 	lea    rcx,[rip+0x5150c5]        # 18678f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23fe0>
 1352833:	48 89 08             	mov    QWORD PTR [rax],rcx
 1352836:	4c 89 78 08          	mov    QWORD PTR [rax+0x8],r15
 135283a:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
 135283f:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
 1352842:	48 89 01             	mov    QWORD PTR [rcx],rax
 1352845:	48 85 ff             	test   rdi,rdi
 1352848:	74 06                	je     1352850 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197dd4>
 135284a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 135284d:	ff 50 08             	call   QWORD PTR [rax+0x8]
 1352850:	6a 38                	push   0x38
 1352852:	5f                   	pop    rdi
 1352853:	e8 a8 b6 49 00       	call   17edf00 <_Znwm@plt>
 1352858:	48 8d 0d 11 50 51 00 	lea    rcx,[rip+0x515011]        # 1867870 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23f58>
 135285f:	48 89 08             	mov    QWORD PTR [rax],rcx
 1352862:	49 8b 8e d8 01 00 00 	mov    rcx,QWORD PTR [r14+0x1d8]
 1352869:	66 41 0f 6f 86 d0 01 	movdqa xmm0,XMMWORD PTR [r14+0x1d0]
 1352870:	00 00 
 1352872:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
 1352877:	48 85 c9             	test   rcx,rcx
 135287a:	74 05                	je     1352881 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197e05>
 135287c:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
 1352881:	66 0f ef c0          	pxor   xmm0,xmm0
 1352885:	f3 0f 7f 40 18       	movdqu XMMWORD PTR [rax+0x18],xmm0
 135288a:	48 83 60 28 00       	and    QWORD PTR [rax+0x28],0x0
 135288f:	c6 40 30 01          	mov    BYTE PTR [rax+0x30],0x1
 1352893:	4c 8d b4 24 50 01 00 	lea    r14,[rsp+0x150]
 135289a:	00 
 135289b:	49 83 26 00          	and    QWORD PTR [r14],0x0
 135289f:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
 13528a4:	48 89 c6             	mov    rsi,rax
 13528a7:	e8 26 0c 00 00       	call   13534d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a56>
 13528ac:	4c 89 f7             	mov    rdi,r14
 13528af:	e8 3e 0c 00 00       	call   13534f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a76>
 13528b4:	80 7c 24 28 00       	cmp    BYTE PTR [rsp+0x28],0x0
 13528b9:	0f 84 a9 00 00 00    	je     1352968 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197eec>
 13528bf:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
 13528c6:	00 
 13528c7:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
 13528cc:	e8 43 68 0e 00       	call   1439114 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27e698>
 13528d1:	48 8b 84 24 50 01 00 	mov    rax,QWORD PTR [rsp+0x150]
 13528d8:	00 
 13528d9:	48 83 a4 24 50 01 00 	and    QWORD PTR [rsp+0x150],0x0
 13528e0:	00 00 
 13528e2:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
 13528e7:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
 13528ea:	48 89 01             	mov    QWORD PTR [rcx],rax
 13528ed:	48 85 ff             	test   rdi,rdi
 13528f0:	74 06                	je     13528f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197e7c>
 13528f2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 13528f5:	ff 50 08             	call   QWORD PTR [rax+0x8]
 13528f8:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
 13528ff:	00 
 1352900:	e8 f5 0b 00 00       	call   13534fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a7e>
 1352905:	e9 7f 01 00 00       	jmp    1352a89 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19800d>
 135290a:	4c 89 e7             	mov    rdi,r12
 135290d:	ff d0                	call   rax
 135290f:	0f 28 40 60          	movaps xmm0,XMMWORD PTR [rax+0x60]
 1352913:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
 135291a:	00 
 135291b:	4c 8b 68 68          	mov    r13,QWORD PTR [rax+0x68]
 135291f:	4d 85 ed             	test   r13,r13
 1352922:	74 05                	je     1352929 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197ead>
 1352924:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
 1352929:	6a 38                	push   0x38
 135292b:	5f                   	pop    rdi
 135292c:	e8 cf b5 49 00       	call   17edf00 <_Znwm@plt>
 1352931:	49 89 c7             	mov    r15,rax
 1352934:	49 89 c6             	mov    r14,rax
 1352937:	48 8d 05 02 4b 51 00 	lea    rax,[rip+0x514b02]        # 1867440 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23b28>
 135293e:	49 89 07             	mov    QWORD PTR [r15],rax
 1352941:	66 0f 6f 84 24 80 00 	movdqa xmm0,XMMWORD PTR [rsp+0x80]
 1352948:	00 00 
 135294a:	f3 41 0f 7f 47 08    	movdqu XMMWORD PTR [r15+0x8],xmm0
 1352950:	66 49 0f 3a 16 c4 01 	pextrq r12,xmm0,0x1
 1352957:	4d 85 e4             	test   r12,r12
 135295a:	74 52                	je     13529ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197f32>
 135295c:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
 1352962:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 1352966:	eb 4b                	jmp    13529b3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197f37>
 1352968:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
 135296d:	4c 8b 30             	mov    r14,QWORD PTR [rax]
 1352970:	6a 18                	push   0x18
 1352972:	5f                   	pop    rdi
 1352973:	e8 88 b5 49 00       	call   17edf00 <_Znwm@plt>
 1352978:	48 8d 0d d9 eb 51 00 	lea    rcx,[rip+0x51ebd9]        # 1871558 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dc40>
 135297f:	48 89 08             	mov    QWORD PTR [rax],rcx
 1352982:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 1352987:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 135298b:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
 135298f:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
 1352994:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
 1352997:	48 89 01             	mov    QWORD PTR [rcx],rax
 135299a:	48 85 ff             	test   rdi,rdi
 135299d:	0f 84 e6 00 00 00    	je     1352a89 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19800d>
 13529a3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 13529a6:	ff 50 08             	call   QWORD PTR [rax+0x8]
 13529a9:	e9 db 00 00 00       	jmp    1352a89 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19800d>
 13529ae:	66 48 0f 7e c7       	movq   rdi,xmm0
 13529b3:	49 83 c7 18          	add    r15,0x18
 13529b7:	49 83 66 28 00       	and    QWORD PTR [r14+0x28],0x0
 13529bc:	66 0f ef c0          	pxor   xmm0,xmm0
 13529c0:	f3 41 0f 7f 46 18    	movdqu XMMWORD PTR [r14+0x18],xmm0
 13529c6:	41 c6 46 30 01       	mov    BYTE PTR [r14+0x30],0x1
 13529cb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 13529ce:	31 f6                	xor    esi,esi
 13529d0:	ff 50 70             	call   QWORD PTR [rax+0x70]
 13529d3:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 13529d8:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 13529db:	4c 89 30             	mov    QWORD PTR [rax],r14
 13529de:	48 85 ff             	test   rdi,rdi
 13529e1:	74 06                	je     13529e9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197f6d>
 13529e3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 13529e6:	ff 50 08             	call   QWORD PTR [rax+0x8]
 13529e9:	80 7c 24 28 00       	cmp    BYTE PTR [rsp+0x28],0x0
 13529ee:	74 48                	je     1352a38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197fbc>
 13529f0:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
 13529f7:	00 
 13529f8:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
 13529fd:	e8 12 67 0e 00       	call   1439114 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27e698>
 1352a02:	48 8b 84 24 50 01 00 	mov    rax,QWORD PTR [rsp+0x150]
 1352a09:	00 
 1352a0a:	48 83 a4 24 50 01 00 	and    QWORD PTR [rsp+0x150],0x0
 1352a11:	00 00 
 1352a13:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
 1352a18:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
 1352a1b:	48 89 01             	mov    QWORD PTR [rcx],rax
 1352a1e:	48 85 ff             	test   rdi,rdi
 1352a21:	74 06                	je     1352a29 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197fad>
 1352a23:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1352a26:	ff 50 08             	call   QWORD PTR [rax+0x8]
 1352a29:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
 1352a30:	00 
 1352a31:	e8 c4 0a 00 00       	call   13534fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a7e>
 1352a36:	eb 49                	jmp    1352a81 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198005>
 1352a38:	6a 20                	push   0x20
 1352a3a:	5f                   	pop    rdi
 1352a3b:	e8 c0 b4 49 00       	call   17edf00 <_Znwm@plt>
 1352a40:	48 8d 0d c1 ea 51 00 	lea    rcx,[rip+0x51eac1]        # 1871508 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dbf0>
 1352a47:	48 89 08             	mov    QWORD PTR [rax],rcx
 1352a4a:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 1352a4f:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 1352a53:	66 0f 6f 84 24 80 00 	movdqa xmm0,XMMWORD PTR [rsp+0x80]
 1352a5a:	00 00 
 1352a5c:	f3 0f 7f 40 10       	movdqu XMMWORD PTR [rax+0x10],xmm0
 1352a61:	4d 85 ed             	test   r13,r13
 1352a64:	74 05                	je     1352a6b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197fef>
 1352a66:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
 1352a6b:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
 1352a70:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
 1352a73:	48 89 01             	mov    QWORD PTR [rcx],rax
 1352a76:	48 85 ff             	test   rdi,rdi
 1352a79:	74 06                	je     1352a81 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198005>
 1352a7b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1352a7e:	ff 50 08             	call   QWORD PTR [rax+0x8]
 1352a81:	4c 89 e7             	mov    rdi,r12
 1352a84:	e8 fd b9 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1352a89:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
 1352a8d:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 1352a94:	00 
 1352a95:	48 89 ee             	mov    rsi,rbp
 1352a98:	ff 50 40             	call   QWORD PTR [rax+0x40]
 1352a9b:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
 1352a9f:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
 1352aa6:	00 
 1352aa7:	48 89 ee             	mov    rsi,rbp
 1352aaa:	ff 50 38             	call   QWORD PTR [rax+0x38]
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
 1352b11:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
 1352b16:	e8 a7 eb 46 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 1352b1b:	31 c0                	xor    eax,eax
 1352b1d:	41                   	rex.B
 1352b1e:	88                   	.byte 0x88
 1352b1f:	46                   	rex.RX

## String references from branch
 1352719:	48 8d 35 a7 a6 08 ff 	lea    rsi,[rip+0xffffffffff08a6a7]        # 3dcdc7 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2816>
 1352720:	48 8d 0d a9 a6 08 ff 	lea    rcx,[rip+0xffffffffff08a6a9]        # 3dcdd0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x281f>
 1352743:	48 8d 35 ab a6 08 ff 	lea    rsi,[rip+0xffffffffff08a6ab]        # 3dcdf5 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2844>
 135274a:	48 8d 0d af a6 08 ff 	lea    rcx,[rip+0xffffffffff08a6af]        # 3dce00 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x284f>

## Direct callees in true branch
 1352710:	ff d0                	call   rax
 1352738:	e8 ed 4c 29 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
 135275c:	e8 c9 4c 29 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
 135276b:	ff 50 28             	call   QWORD PTR [rax+0x28]
 1352776:	e8 85 b7 49 00       	call   17edf00 <_Znwm@plt>
 1352813:	e8 3c 0c 00 00       	call   1353454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1989d8>
 135281b:	e8 aa 0c 00 00       	call   13534ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a4e>
 1352827:	e8 d4 b6 49 00       	call   17edf00 <_Znwm@plt>
 135284d:	ff 50 08             	call   QWORD PTR [rax+0x8]
 1352853:	e8 a8 b6 49 00       	call   17edf00 <_Znwm@plt>
 13528a7:	e8 26 0c 00 00       	call   13534d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a56>
 13528af:	e8 3e 0c 00 00       	call   13534f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a76>
 13528cc:	e8 43 68 0e 00       	call   1439114 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27e698>
 13528f5:	ff 50 08             	call   QWORD PTR [rax+0x8]
 1352900:	e8 f5 0b 00 00       	call   13534fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a7e>
