# TimelineAds owner+0x50 readiness bridge

## Established inputs
- TimelineAdsSetupImpl factory: 0x13524a4.
- AdsSetup/AdsRuntime +0x1b8 is sampled at 0x1352547.
- On the true branch, a readiness state is installed at TimelineAds owner+0x20 and AP 0x18678f8 wrapper is installed at owner+0x10.
- TimelineAds virtual +0x28 (0xaa712a) returns owner+0x50; TimelineConductor consumes that value.

## Owner field aliases and readiness installation

/tmp/tads50/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000013525f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197b74>:
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
 135289f:	48                   	rex.W

## owner+0x10 enters the intermediate collection

/tmp/tads50/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000001352d40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1982c4>:
 1352d40:	6a 02                	push   0x2
 1352d42:	5a                   	pop    rdx
 1352d43:	e8 e4 6c d5 ff       	call   10a9a2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270e42>
 1352d48:	80 7c 24 0e 00       	cmp    BYTE PTR [rsp+0xe],0x0
 1352d4d:	74 6d                	je     1352dbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198340>
 1352d4f:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
 1352d56:	00 
 1352d57:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
 1352d5e:	00 
 1352d5f:	6a 04                	push   0x4
 1352d61:	5a                   	pop    rdx
 1352d62:	e8 3d 6e d5 ff       	call   10a9ba4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270fba>
 1352d67:	48 83 38 00          	cmp    QWORD PTR [rax],0x0
 1352d6b:	75 4f                	jne    1352dbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198340>
 1352d6d:	49 89 c6             	mov    r14,rax
 1352d70:	6a 20                	push   0x20
 1352d72:	5f                   	pop    rdi
 1352d73:	e8 88 b1 49 00       	call   17edf00 <_Znwm@plt>
 1352d78:	48 8d 8c 24 c8 00 00 	lea    rcx,[rsp+0xc8]
 1352d7f:	00 
 1352d80:	4c 8d bc 24 50 01 00 	lea    r15,[rsp+0x150]
 1352d87:	00 
 1352d88:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
 1352d8c:	c6 40 19 04          	mov    BYTE PTR [rax+0x19],0x4
 1352d90:	41 c6 47 10 01       	mov    BYTE PTR [r15+0x10],0x1
 1352d95:	48 8b b4 24 30 01 00 	mov    rsi,QWORD PTR [rsp+0x130]
 1352d9c:	00 
 1352d9d:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
 1352da4:	00 
 1352da5:	4c 89 f2             	mov    rdx,r14
 1352da8:	48 89 c1             	mov    rcx,rax
 1352dab:	e8 bc cd 78 ff       	call   adfb6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cb0c>
 1352db0:	49 83 27 00          	and    QWORD PTR [r15],0x0
 1352db4:	4c 89 ff             	mov    rdi,r15
 1352db7:	e8 0e 75 72 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 1352dbc:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
 1352dc1:	48 8b 00             	mov    rax,QWORD PTR [rax]
 1352dc4:	4c 8d b4 24 58 01 00 	lea    r14,[rsp+0x158]
 1352dcb:	00 
 1352dcc:	49 89 46 f8          	mov    QWORD PTR [r14-0x8],rax
 1352dd0:	48 8d 35 ef 9f 08 ff 	lea    rsi,[rip+0xffffffffff089fef]        # 3dcdc6 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2815>
 1352dd7:	6a 01                	push   0x1
 1352dd9:	5a                   	pop    rdx
 1352dda:	4c 89 f7             	mov    rdi,r14
 1352ddd:	e8 4a 6c d5 ff       	call   10a9a2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270e42>
 1352de2:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 1352de7:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 1352dea:	48 8d 84 24 80 01 00 	lea    rax,[rsp+0x180]
 1352df1:	00 
 1352df2:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
 1352df6:	48 8b 94 24 c0 00 00 	mov    rdx,QWORD PTR [rsp+0xc0]
 1352dfd:	00 
 1352dfe:	48 8b 8c 24 c8 00 00 	mov    rcx,QWORD PTR [rsp+0xc8]
 1352e05:	00 
 1352e06:	48 89 50 f8          	mov    QWORD PTR [rax-0x8],rdx
 1352e0a:	48 89 08             	mov    QWORD PTR [rax],rcx
 1352e0d:	48 8b 94 24 d0 00 00 	mov    rdx,QWORD PTR [rsp+0xd0]
 1352e14:	00 
 1352e15:	48 89 50 08          	mov    QWORD PTR [rax+0x8],rdx
 1352e19:	48 85 d2             	test   rdx,rdx
 1352e1c:	74 1a                	je     1352e38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1983bc>
 1352e1e:	48 8d 94 24 c8 00 00 	lea    rdx,[rsp+0xc8]
 1352e25:	00 
 1352e26:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
 1352e2a:	48 89 52 f8          	mov    QWORD PTR [rdx-0x8],rdx
 1352e2e:	66 0f ef c0          	pxor   xmm0,xmm0
 1352e32:	f3 0f 7f 02          	movdqu XMMWORD PTR [rdx],xmm0
 1352e36:	eb 08                	jmp    1352e40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1983c4>
 1352e38:	48 89 84 24 78 01 00 	mov    QWORD PTR [rsp+0x178],rax
 1352e3f:	00 
 1352e40:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
 1352e47:	00 00 
 1352e49:	66 0f ef c0          	pxor   xmm0,xmm0
 1352e4d:	66 0f 7f 84 24 a0 00 	movdqa XMMWORD PTR [rsp+0xa0],xmm0
 1352e54:	00 00 
 1352e56:	48 8d 84 24 a0 00 00 	lea    rax,[rsp+0xa0]
 1352e5d:	00 
 1352e5e:	48 89 84 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rax
 1352e65:	00 
 1352e66:	c6 84 24 28 01 00 00 	mov    BYTE PTR [rsp+0x128],0x0
 1352e6d:	00 
 1352e6e:	6a 02                	push   0x2
 1352e70:	5f                   	pop    rdi
 1352e71:	e8 6d 34 79 ff       	call   ae62e3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x33283>
 1352e76:	49 89 c7             	mov    r15,rax
 1352e79:	48 8d 84 24 b0 00 00 	lea    rax,[rsp+0xb0]
 1352e80:	00 
 1352e81:	4c 89 78 f0          	mov    QWORD PTR [rax-0x10],r15
 1352e85:	4c 89 78 f8          	mov    QWORD PTR [rax-0x8],r15
 1352e89:	48 c1 e2 05          	shl    rdx,0x5
 1352e8d:	4c 01 fa             	add    rdx,r15
 1352e90:	48 89 10             	mov    QWORD PTR [rax],rdx
 1352e93:	48 8d 8c 24 18 01 00 	lea    rcx,[rsp+0x118]
 1352e9a:	00 
 1352e9b:	4c 89 39             	mov    QWORD PTR [rcx],r15
 1352e9e:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 1352ea5:	00 
 1352ea6:	4c 89 3a             	mov    QWORD PTR [rdx],r15
 1352ea9:	48 89 84 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rax
 1352eb0:	00 
 1352eb1:	48 89 94 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rdx
 1352eb8:	00 
 1352eb9:	48 89 8c 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rcx
 1352ec0:	00 
 1352ec1:	c6 84 24 48 01 00 00 	mov    BYTE PTR [rsp+0x148],0x0
 1352ec8:	00 
 1352ec9:	45 31 ed             	xor    r13d,r13d
 1352ecc:	4d 89 fc             	mov    r12,r15
 1352ecf:	4a 8b 84 2c 50 01 00 	mov    rax,QWORD PTR [rsp+r13*1+0x150]
 1352ed6:	00 
 1352ed7:	49 89 04 24          	mov    QWORD PTR [r12],rax
 1352edb:	49 83 c4 08          	add    r12,0x8
 1352edf:	4b 8d 34 2e          	lea    rsi,[r14+r13*1]
 1352ee3:	4c 89 e7             	mov    rdi,r12
 1352ee6:	e8 b9 06 00 00       	call   13535a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b28>
 1352eeb:	49 83 c5 20          	add    r13,0x20
 1352eef:	4c 8b a4 24 18 01 00 	mov    r12,QWORD PTR [rsp+0x118]
 1352ef6:	00 
 1352ef7:	49 83 c4 20          	add    r12,0x20
 1352efb:	4c 89 a4 24 18 01 00 	mov    QWORD PTR [rsp+0x118],r12
 1352f02:	00 
 1352f03:	49 83 fd 40          	cmp    r13,0x40
 1352f07:	75 c6                	jne    1352ecf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198453>
 1352f09:	40 b5 01             	mov    bpl,0x1
 1352f0c:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
 1352f13:	00 
 1352f14:	40 88 6f 18          	mov    BYTE PTR [rdi+0x18],bpl
 1352f18:	e8 c3 06 00 00       	call   13535e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b64>
 1352f1d:	4c 89 a4 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],r12
 1352f24:	00 
 1352f25:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
 1352f2c:	00 
 1352f2d:	40 88 6f 08          	mov    BYTE PTR [rdi+0x8],bpl
 1352f31:	e8 e0 06 00 00       	call   1353616 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b9a>
 1352f36:	6a 40                	push   0x40
 1352f38:	41 5e                	pop    r14
 1352f3a:	4a 8b bc 34 40 01 00 	mov    rdi,QWORD PTR [rsp+r14*1+0x140]
 1352f41:	00 
 1352f42:	e8 73 b6 78 ff       	call   ade5ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b55a>
 1352f47:	49 83 c6 e0          	add    r14,0xffffffffffffffe0
 1352f4b:	75 ed                	jne    1352f3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1984be>
 1352f4d:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
 1352f52:	48 8b 00             	mov    rax,QWORD PTR [rax]
 1352f55:	48 85 c0             	test   rax,rax
 1352f58:	48 8b 6c 24 70       	mov    rbp,QWORD PTR [rsp+0x70]
 1352f5d:	74 3a                	je     1352f99 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19851d>
 1352f5f:	48                   	rex.W

## 0x8e8 owner+0x50 object construction

/tmp/tads50/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000001352f40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1984c4>:
 1352f40:	00 00                	add    BYTE PTR [rax],al
 1352f42:	e8 73 b6 78 ff       	call   ade5ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b55a>
 1352f47:	49 83 c6 e0          	add    r14,0xffffffffffffffe0
 1352f4b:	75 ed                	jne    1352f3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1984be>
 1352f4d:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
 1352f52:	48 8b 00             	mov    rax,QWORD PTR [rax]
 1352f55:	48 85 c0             	test   rax,rax
 1352f58:	48 8b 6c 24 70       	mov    rbp,QWORD PTR [rsp+0x70]
 1352f5d:	74 3a                	je     1352f99 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19851d>
 1352f5f:	48 8d 8c 24 60 01 00 	lea    rcx,[rsp+0x160]
 1352f66:	00 
 1352f67:	48 89 41 f0          	mov    QWORD PTR [rcx-0x10],rax
 1352f6b:	66 0f ef c0          	pxor   xmm0,xmm0
 1352f6f:	f3 0f 7f 01          	movdqu XMMWORD PTR [rcx],xmm0
 1352f73:	48 89 49 f8          	mov    QWORD PTR [rcx-0x8],rcx
 1352f77:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
 1352f7e:	00 
 1352f7f:	48 8d b4 24 50 01 00 	lea    rsi,[rsp+0x150]
 1352f86:	00 
 1352f87:	e8 96 06 00 00       	call   1353622 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198ba6>
 1352f8c:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]
 1352f93:	00 
 1352f94:	e8 27 b6 78 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
 1352f99:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 1352f9e:	48 8b 00             	mov    rax,QWORD PTR [rax]
 1352fa1:	48 8d 8c 24 60 01 00 	lea    rcx,[rsp+0x160]
 1352fa8:	00 
 1352fa9:	48 89 41 f0          	mov    QWORD PTR [rcx-0x10],rax
 1352fad:	66 0f ef c0          	pxor   xmm0,xmm0
 1352fb1:	f3 0f 7f 01          	movdqu XMMWORD PTR [rcx],xmm0
 1352fb5:	48 89 49 f8          	mov    QWORD PTR [rcx-0x8],rcx
 1352fb9:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
 1352fc0:	00 
 1352fc1:	48 8d b4 24 50 01 00 	lea    rsi,[rsp+0x150]
 1352fc8:	00 
 1352fc9:	e8 54 06 00 00       	call   1353622 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198ba6>
 1352fce:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]
 1352fd5:	00 
 1352fd6:	e8 e5 b5 78 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
 1352fdb:	bf e8 08 00 00       	mov    edi,0x8e8
 1352fe0:	e8 1b af 49 00       	call   17edf00 <_Znwm@plt>
 1352fe5:	49 89 c6             	mov    r14,rax
 1352fe8:	0f 28 84 24 a0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xa0]
 1352fef:	00 
 1352ff0:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
 1352ff5:	0f 29 84 24 30 01 00 	movaps XMMWORD PTR [rsp+0x130],xmm0
 1352ffc:	00 
 1352ffd:	4c 8b ac 24 b0 00 00 	mov    r13,QWORD PTR [rsp+0xb0]
 1353004:	00 
 1353005:	0f 57 c0             	xorps  xmm0,xmm0
 1353008:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
 135300f:	00 
 1353010:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
 1353017:	00 00 
 1353019:	48 8d 05 a8 44 51 00 	lea    rax,[rip+0x5144a8]        # 18674c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23bb0>
 1353020:	49 89 06             	mov    QWORD PTR [r14],rax
 1353023:	48 8d 05 26 45 51 00 	lea    rax,[rip+0x514526]        # 1867550 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23c38>
 135302a:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
 135302e:	49 8d 46 10          	lea    rax,[r14+0x10]
 1353032:	48 8d 0d 47 49 51 00 	lea    rcx,[rip+0x514947]        # 1867980 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24068>
 1353039:	49 89 4e 10          	mov    QWORD PTR [r14+0x10],rcx
 135303d:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
 1353044:	00 
 1353045:	49 89 7e 18          	mov    QWORD PTR [r14+0x18],rdi
 1353049:	48 8b 8c 24 08 01 00 	mov    rcx,QWORD PTR [rsp+0x108]
 1353050:	00 
 1353051:	49 89 4e 20          	mov    QWORD PTR [r14+0x20],rcx
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
 13530bf:	41 0f 29 0c 24       	movaps XMMWORD PTR [r12],xmm1
 13530c4:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
 13530ca:	f3 41 0f 7f 46 58    	movdqu XMMWORD PTR [r14+0x58],xmm0
 13530d0:	4d 89 6e 68          	mov    QWORD PTR [r14+0x68],r13
 13530d4:	41 0f 29 0f          	movaps XMMWORD PTR [r15],xmm1
 13530d8:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
 13530dd:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
 13530e4:	00 
 13530e5:	e8 6a 06 00 00       	call   1353754 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198cd8>
 13530ea:	31 c0                	xor    eax,eax
 13530ec:	41 88 86 f0 03 00 00 	mov    BYTE PTR [r14+0x3f0],al
 13530f3:	41 88 86 f8 03 00 00 	mov    BYTE PTR [r14+0x3f8],al
 13530fa:	41 88 86 d8 08 00 00 	mov    BYTE PTR [r14+0x8d8],al
 1353101:	41 88 86 e0 08 00 00 	mov    BYTE PTR [r14+0x8e0],al
 1353108:	66 0f ef c0          	pxor   xmm0,xmm0
 135310c:	f3 41 0f 7f 46 70    	movdqu XMMWORD PTR [r14+0x70],xmm0
 1353112:	41 88 86 80 00 00 00 	mov    BYTE PTR [r14+0x80],al
 1353119:	4c 89 e7             	mov    rdi,r12
 135311c:	e8 33 06 00 00       	call   1353754 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198cd8>
 1353121:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
 1353126:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 1353129:	4c 89 30             	mov    QWORD PTR [rax],r14
 135312c:	48 85 ff             	test   rdi,rdi
 135312f:	74 06                	je     1353137 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1986bb>
 1353131:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1353134:	ff 50 08             	call   QWORD PTR [rax+0x8]
 1353137:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
 135313b:	48 89 ef             	mov    rdi,rbp
 135313e:	ff 50 48             	call   QWORD PTR [rax+0x48]
 1353141:	48 89 43 58          	mov    QWORD PTR [rbx+0x58],rax
 1353145:	4c 8d b4 24 50 01 00 	lea    r14,[rsp+0x150]
 135314c:	00 
 135314d:	49 89 1e             	mov    QWORD PTR [r14],rbx
 1353150:	48 8d 0d 0d 93 72 ff 	lea    rcx,[rip+0xffffffffff72930d]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 1353157:	49 89 4e 10          	mov    QWORD PTR [r14+0x10],rcx
 135315b:	48 8d 0d 2e 06 00 00 	lea    rcx,[rip+0x62e]        # 1353790 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198d14>
 1353162:	49 89 4e 18          	mov    QWORD PTR [r14+0x18],rcx
 1353166:	48 83 c0 68          	add    rax,0x68
 135316a:	48 89 c7             	mov    rdi,rax
 135316d:	4c 89 f6             	mov    rsi,r14
 1353170:	e8 e7 91 10 00       	call   145c35c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a18e0>
 1353175:	4c 89 f7             	mov    rdi,r14
 1353178:	e8 33 06 00 00       	call   13537b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198d34>
 135317d:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
 1353184:	00 
 1353185:	e8 ca 05 00 00       	call   1353754 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198cd8>
 135318a:	48                   	rex.W
 135318b:	8b                   	.byte 0x8b
 135318c:	bc                   	.byte 0xbc
 135318d:	24 c8                	and    al,0xc8
	...

## TimelineAds +0x28 getter used by TimelineConductor

/tmp/tads50/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000aa7110 <JNI_OnUnload@@Base+0x2e9dd>:
  aa7110:	df e8                	fucomip st,st(0)
  aa7112:	8f 29 fd ff          	(bad)
  aa7116:	50                   	push   rax
  aa7117:	48 83 c7 08          	add    rdi,0x8
  aa711b:	e8 8c dd 00 00       	call   ab4eac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e4c>
  aa7120:	58                   	pop    rax
  aa7121:	c3                   	ret
  aa7122:	48 89 c7             	mov    rdi,rax
  aa7125:	e8 7b 29 fd ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  aa712a:	48 8b 47 50          	mov    rax,QWORD PTR [rdi+0x50]
  aa712e:	c3                   	ret
  aa712f:	cc                   	int3
  aa7130:	53                   	push   rbx
  aa7131:	48 89 fb             	mov    rbx,rdi
  aa7134:	6a 10                	push   0x10
  aa7136:	5f                   	pop    rdi
  aa7137:	e8 c4 6d d4 00       	call   17edf00 <_Znwm@plt>
  aa713c:	48                   	rex.W
  aa713d:	8d                   	.byte 0x8d
  aa713e:	0d                   	.byte 0xd
  aa713f:	25                   	.byte 0x25

## TimelineConductor factory b7 consumer

/tmp/tads50/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

000000000135c920 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1ea4>:
 135c920:	ff                   	jmp    (bad)
 135c921:	e8 e6 4b 83 ff       	call   b9150c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4ac>
 135c926:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax
 135c92d:	00 
 135c92e:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
 135c932:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
 135c936:	ba b7 00 00 00       	mov    edx,0xb7
 135c93b:	e8 9e 59 80 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
 135c940:	49 8b 07             	mov    rax,QWORD PTR [r15]
 135c943:	48 8b 80 b8 05 00 00 	mov    rax,QWORD PTR [rax+0x5b8]
 135c94a:	48 89 84 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rax
 135c951:	00 
 135c952:	48 85 c0             	test   rax,rax
 135c955:	0f 84 f4 05 00 00    	je     135cf4f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a24d3>
 135c95b:	4c 89 ff             	mov    rdi,r15
 135c95e:	e8 3d 69 80 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
 135c963:	48 89 84 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rax
 135c96a:	00 
 135c96b:	4c 89 ff             	mov    rdi,r15
 135c96e:	e8 07 4e 8b ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
 135c973:	48 89 c3             	mov    rbx,rax
 135c976:	4c 89 ff             	mov    rdi,r15
 135c979:	e8 74 ab 95 ff       	call   cb74f2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x204492>
 135c97e:	49 89 c6             	mov    r14,rax
 135c981:	4c 89 ff             	mov    rdi,r15
 135c984:	e8 bf ab 95 ff       	call   cb7548 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2044e8>
 135c989:	48 89 84 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rax
 135c990:	00 
 135c991:	4c 89 ff             	mov    rdi,r15
 135c994:	e8 9d a3 95 ff       	call   cb6d36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203cd6>
 135c999:	48 89 84 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rax
 135c9a0:	00 
 135c9a1:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
 135c9a5:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
 135c9a9:	31 d2                	xor    edx,edx
 135c9ab:	e8 2e 59 80 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
 135c9b0:	49 8b 07             	mov    rax,QWORD PTR [r15]
 135c9b3:	48 8b 00             	mov    rax,QWORD PTR [rax]
 135c9b6:	48 89 84 24 78 01 00 	mov    QWORD PTR [rsp+0x178],rax
 135c9bd:	00 
 135c9be:	48 85 c0             	test   rax,rax
 135c9c1:	0f 84 8d 05 00 00    	je     135cf54 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a24d8>
 135c9c7:	4c 89 ff             	mov    rdi,r15
 135c9ca:	e8 45 b6 82 ff       	call   b88014 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fb4>
 135c9cf:	48 89 84 24 c8 01 00 	mov    QWORD PTR [rsp+0x1c8],rax
 135c9d6:	00 
 135c9d7:	4c 89 ff             	mov    rdi,r15
 135c9da:	e8 dd 8f d1 ff       	call   10759bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23cdd2>
 135c9df:	48 89 84 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rax
 135c9e6:	00 
 135c9e7:	41 8a 44 24 11       	mov    al,BYTE PTR [r12+0x11]
 135c9ec:	88 84 24 30 02 00 00 	mov    BYTE PTR [rsp+0x230],al
 135c9f3:	41 8a 44 24 14       	mov    al,BYTE PTR [r12+0x14]
 135c9f8:	88 84 24 31 02 00 00 	mov    BYTE PTR [rsp+0x231],al
 135c9ff:	41 8a 84 24 9a 00 00 	mov    al,BYTE PTR [r12+0x9a]
 135ca06:	00 
 135ca07:	88 84 24 32 02 00 00 	mov    BYTE PTR [rsp+0x232],al
 135ca0e:	41 8a 84 24 9b 00 00 	mov    al,BYTE PTR [r12+0x9b]
 135ca15:	00 
 135ca16:	88 84 24 33 02 00 00 	mov    BYTE PTR [rsp+0x233],al
 135ca1d:	41 8a 84 24 9c 00 00 	mov    al,BYTE PTR [r12+0x9c]
 135ca24:	00 
 135ca25:	88 84 24 34 02 00 00 	mov    BYTE PTR [rsp+0x234],al
 135ca2c:	49 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [r12+0xa0]
 135ca33:	00 
 135ca34:	48 89 84 24 38 02 00 	mov    QWORD PTR [rsp+0x238],rax
 135ca3b:	00 
 135ca3c:	41 0f 10 44 24 20    	movups xmm0,XMMWORD PTR [r12+0x20]
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
 135caae:	48 8b 85 80 00 00 00 	mov    rax,QWORD PTR [rbp+0x80]
 135cab5:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
 135cabc:	00 
 135cabd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 135cac0:	ff 50 10             	call   QWORD PTR [rax+0x10]
 135cac3:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 135cac6:	48 89 c7             	mov    rdi,rax
 135cac9:	ff 51 28             	call   QWORD PTR [rcx+0x28]
 135cacc:	48 89 84 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rax
 135cad3:	00 
 135cad4:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 135cad7:	48 89 df             	mov    rdi,rbx
 135cada:	ff 50 30             	call   QWORD PTR [rax+0x30]
 135cadd:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 135cae0:	48 89 c7             	mov    rdi,rax
 135cae3:	ff 91 78 01 00 00    	call   QWORD PTR [rcx+0x178]
 135cae9:	48 89 84 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rax
 135caf0:	00 
 135caf1:	4c 89 ac 24 50 01 00 	mov    QWORD PTR [rsp+0x150],r13
 135caf8:	00 
 135caf9:	4c 89 a4 24 40 01 00 	mov    QWORD PTR [rsp+0x140],r12
 135cb00:	00 
 135cb01:	4c 89 bc 24 48 01 00 	mov    QWORD PTR [rsp+0x148],r15
 135cb08:	00 
 135cb09:	4c 8b 7d 00          	mov    r15,QWORD PTR [rbp+0x0]
 135cb0d:	48 8b b5 88 00 00 00 	mov    rsi,QWORD PTR [rbp+0x88]
 135cb14:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 135cb17:	48 8d bc 24 18 02 00 	lea    rdi,[rsp+0x218]
 135cb1e:	00 
 135cb1f:	ff 50 10             	call   QWORD PTR [rax+0x10]
 135cb22:	48 8b 9d 78 01 00 00 	mov    rbx,QWORD PTR [rbp+0x178]
 135cb29:	48 89 df             	mov    rdi,rbx
 135cb2c:	e8 ed 06 1b 00       	call   150d21e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3527a2>
 135cb31:	49 89 c4             	mov    r12,rax
 135cb34:	49 89 d5             	mov    r13,rdx
 135cb37:	48 89 df             	mov    rdi,rbx
 135cb3a:	e8 e3 07 1b 00       	call   150d322 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3528a6>
 135cb3f:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
 135cb46:	00 
 135cb47:	4c 89 e6             	mov    rsi,r12
 135cb4a:	4c 89 ea             	mov    rdx,r13
 135cb4d:	48 89 c1             	mov    rcx,rax
 135cb50:	e8 57 aa 95 ff       	call   cb75ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20454c>
 135cb55:	49 8d 76 70          	lea    rsi,[r14+0x70]
 135cb59:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
 135cb60:	00 
 135cb61:	e8 2a d7 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 135cb66:	48 8b 9c 24 c8 01 00 	mov    rbx,QWORD PTR [rsp+0x1c8]
 135cb6d:	00 
 135cb6e:	49 83 c6 40          	add    r14,0x40
 135cb72:	48 8d bc 24 d0 02 00 	lea    rdi,[rsp+0x2d0]
 135cb79:	00 
 135cb7a:	4c 89 f6             	mov    rsi,r14
 135cb7d:	e8 0e d7 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 135cb82:	48 8d bc 24 e8 01 00 	lea    rdi,[rsp+0x1e8]
 135cb89:	00 
 135cb8a:	48 8d b4 24 a0 02 00 	lea    rsi,[rsp+0x2a0]
 135cb91:	00 
 135cb92:	e8 45 ac 95 ff       	call   cb77dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20477c>
 135cb97:	48 8b 85 50 01 00 00 	mov    rax,QWORD PTR [rbp+0x150]
 135cb9e:	48 89 84 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rax
 135cba5:	00 
 135cba6:	48 8b bc 24 18 01 00 	mov    rdi,QWORD PTR [rsp+0x118]
 135cbad:	00 
 135cbae:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 135cbb1:	ff 50 28             	call   QWORD PTR [rax+0x28]
 135cbb4:	48 89 84 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rax
 135cbbb:	00 
 135cbbc:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 135cbbf:	48 89 df             	mov    rdi,rbx
 135cbc2:	ff 50 58             	call   QWORD PTR [rax+0x58]
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
 135cc1b:	5f                   	pop    rdi
 135cc1c:	e8 df 12 49 00       	call   17edf00 <_Znwm@plt>
 135cc21:	48 89 84 24 d0 01 00 	mov    QWORD PTR [rsp+0x1d0],rax
 135cc28:	00 
 135cc29:	48 89 c1             	mov    rcx,rax
 135cc2c:	48 83 c1 20          	add    rcx,0x20
 135cc30:	48 89 8c 24 e0 01 00 	mov    QWORD PTR [rsp+0x1e0],rcx
 135cc37:	00 
 135cc38:	4c 89 30             	mov    QWORD PTR [rax],r14
 135cc3b:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
 135cc3f:	4c 89 68 10          	mov    QWORD PTR [rax+0x10],r13
 135cc43:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx
 135cc47:	48 89 8c 24 d8 01 00 	mov    QWORD PTR [rsp+0x1d8],rcx
 135cc4e:	00 
 135cc4f:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
 135cc56:	00 
 135cc57:	c6 47 08 01          	mov    BYTE PTR [rdi+0x8],0x1
 135cc5b:	e8 c2 ed 71 ff       	call   a7ba22 <JNI_OnUnload@@Base+0x32ef>

## Vtable slices for owner+0x50 object
### AP 0x18674c8
00000000018674c8  0000000000000008 R_X86_64_RELATIVE                         1355040
00000000018674d0  0000000000000008 R_X86_64_RELATIVE                         135509a
00000000018674d8  0000000000000008 R_X86_64_RELATIVE                         13550ac
00000000018674e0  0000000000000008 R_X86_64_RELATIVE                         1355202
00000000018674e8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
00000000018674f0  0000000000000008 R_X86_64_RELATIVE                         1355276
00000000018674f8  0000000000000008 R_X86_64_RELATIVE                         13553c8
0000000001867500  0000000000000008 R_X86_64_RELATIVE                         13553c8
0000000001867508  0000000000000008 R_X86_64_RELATIVE                         13553ce
0000000001867510  0000000000000008 R_X86_64_RELATIVE                         135555e
0000000001867518  0000000000000008 R_X86_64_RELATIVE                         13555ee
0000000001867520  0000000000000008 R_X86_64_RELATIVE                         13557e4
0000000001867528  0000000000000008 R_X86_64_RELATIVE                         1355d14
0000000001867530  0000000000000008 R_X86_64_RELATIVE                         1355e4e
0000000001867538  0000000000000008 R_X86_64_RELATIVE                         1355ff0
### AP 0x1867550
0000000001867550  0000000000000008 R_X86_64_RELATIVE                         135616c
0000000001867558  0000000000000008 R_X86_64_RELATIVE                         1356176
0000000001867560  0000000000000008 R_X86_64_RELATIVE                         1356180
0000000001867568  0000000000000008 R_X86_64_RELATIVE                         9d7de0
0000000001867570  0000000000000008 R_X86_64_RELATIVE                         135618a
0000000001867578  0000000000000008 R_X86_64_RELATIVE                         1356194
0000000001867580  0000000000000008 R_X86_64_RELATIVE                         135619e
0000000001867588  0000000000000008 R_X86_64_RELATIVE                         13561a8
0000000001867590  0000000000000008 R_X86_64_RELATIVE                         13561b2
0000000001867598  0000000000000008 R_X86_64_RELATIVE                         9d7de0
00000000018675a0  0000000000000008 R_X86_64_RELATIVE                         13561bc
00000000018675a8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
00000000018675b0  0000000000000008 R_X86_64_RELATIVE                         9d7de0
00000000018675b8  0000000000000008 R_X86_64_RELATIVE                         13561c6
00000000018675c0  0000000000000008 R_X86_64_RELATIVE                         9d7de0
### AP 0x1867980
0000000001867980  0000000000000008 R_X86_64_RELATIVE                         1359f1a
0000000001867988  0000000000000008 R_X86_64_RELATIVE                         1359f92
0000000001867990  0000000000000008 R_X86_64_RELATIVE                         9d7de0
0000000001867998  0000000000000008 R_X86_64_RELATIVE                         9d7de0
00000000018679a0  0000000000000008 R_X86_64_RELATIVE                         9d7de0
00000000018679a8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
00000000018679b0  0000000000000008 R_X86_64_RELATIVE                         1359fa4
00000000018679b8  0000000000000008 R_X86_64_RELATIVE                         135a11a
00000000018679c0  0000000000000008 R_X86_64_RELATIVE                         135a120
00000000018679c8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
00000000018679d0  0000000000000008 R_X86_64_RELATIVE                         135a18e
00000000018679d8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
00000000018679e0  0000000000000008 R_X86_64_RELATIVE                         9d7de0
00000000018679e8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
00000000018679f0  0000000000000008 R_X86_64_RELATIVE                         9d7de0

## Mechanical bridge summary
-  1352547:	8a 80 b8 01 00 00    	mov    al,BYTE PTR [rax+0x1b8]
-  1352607:	48 8d 43 10          	lea    rax,[rbx+0x10]
-  1352619:	48 8d 43 20          	lea    rax,[rbx+0x20]
-  1352656:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
-  1352813:	e8 3c 0c 00 00       	call   1353454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1989d8>
-  1352820:	4d 8b 3c 24          	mov    r15,QWORD PTR [r12]
-  1352827:	e8 d4 b6 49 00       	call   17edf00 <_Znwm@plt>
-  1352833:	48 89 08             	mov    QWORD PTR [rax],rcx
-  1352836:	4c 89 78 08          	mov    QWORD PTR [rax+0x8],r15
-  1352842:	48 89 01             	mov    QWORD PTR [rcx],rax
-  1352de2:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
-  1352de7:	48 8b 08             	mov    rcx,QWORD PTR [rax]
-  1352df2:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
-  1352ecf:	4a 8b 84 2c 50 01 00 	mov    rax,QWORD PTR [rsp+r13*1+0x150]
-  1352ed7:	49 89 04 24          	mov    QWORD PTR [r12],rax
-  1352edf:	4b 8d 34 2e          	lea    rsi,[r14+r13*1]
-  1352ee6:	e8 b9 06 00 00       	call   13535a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b28>
-  1352fe0:	e8 1b af 49 00       	call   17edf00 <_Znwm@plt>
-  1353019:	48 8d 05 a8 44 51 00 	lea    rax,[rip+0x5144a8]        # 18674c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23bb0>
-  1353023:	48 8d 05 26 45 51 00 	lea    rax,[rip+0x514526]        # 1867550 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23c38>
-  1353032:	48 8d 0d 47 49 51 00 	lea    rcx,[rip+0x514947]        # 1867980 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24068>
-  1353039:	49 89 4e 10          	mov    QWORD PTR [r14+0x10],rcx
-  13530c4:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
-  13530ca:	f3 41 0f 7f 46 58    	movdqu XMMWORD PTR [r14+0x58],xmm0
-  13530d0:	4d 89 6e 68          	mov    QWORD PTR [r14+0x68],r13
-  1353121:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
-  1353129:	4c 89 30             	mov    QWORD PTR [rax],r14
-   aa712a:	48 8b 47 50          	mov    rax,QWORD PTR [rdi+0x50]
-  135c936:	ba b7 00 00 00       	mov    edx,0xb7
-  135c943:	48 8b 80 b8 05 00 00 	mov    rax,QWORD PTR [rax+0x5b8]
-  135cbe5:	48 8b bc 24 20 01 00 	mov    rdi,QWORD PTR [rsp+0x120]
-  135cbf0:	ff 50 28             	call   QWORD PTR [rax+0x28]

### Proven pointer flow
1. owner+0x10 address is saved at [rsp+0x30] (0x1352607..0x135260b).
2. true readiness branch installs AP 0x18678f8 wrapper into owner+0x10 (0x1352827..0x1352842).
3. 0x1352de2 reloads owner+0x10 through [rsp+0x30]; 0x1352de7 reads the wrapper pointer; 0x1352df2 stores it at stack+0x170.
4. The 0x1352ecf loop runs twice (r13 = 0, 0x20) over stack+0x150 and stack+0x170, so the owner+0x10 wrapper is the head pointer of the second 0x20-byte intermediate element.
5. That two-element intermediate is normalized into stack+0xa0 before the 0x8e8 allocation; stack+0xa0 is copied to stack+0x10 at 0x1352fe8.. and then to largeObject+0x58 at 0x13530c4..0x13530ca, with associated word to +0x68.
6. largeObject is installed into TimelineAds owner+0x50 at 0x1353121..0x1353129.
7. TimelineAds virtual +0x28 (0xaa712a) returns owner+0x50, and TimelineConductor factory invokes it at 0x135cbe5..0x135cbf0.
