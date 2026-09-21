# TimelineAds owner +0x28 / +0x40 producers

Saved handles:
- rsp+0x20 = &owner+0x28 at 0x1352626
- rsp+0x40 = &owner+0x40 at 0x1352641

## All uses of saved handle 0x20 = owner+0x28
### 0x1352626: mov    QWORD PTR [rsp+0x20],rax
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

### 0x13528e2: mov    rcx,QWORD PTR [rsp+0x20]
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

### 0x135298f: mov    rcx,QWORD PTR [rsp+0x20]
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

### 0x1352a13: mov    rcx,QWORD PTR [rsp+0x20]
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

### 0x1352a6b: mov    rcx,QWORD PTR [rsp+0x20]
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

### 0x1353404: mov    rdi,QWORD PTR [rsp+0x20]
     1353398:	49 83 c6 e0          	add    r14,0xffffffffffffffe0
     135339c:	75 ed                	jne    135338b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19890f>
     135339e:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     13533a5:	00 
     13533a6:	e8 15 b2 78 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     13533ab:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]
     13533b2:	00 
     13533b3:	e8 ce b0 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13533b8:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
     13533bf:	00 
     13533c0:	e8 c1 b0 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13533c5:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
     13533cc:	00 
     13533cd:	e8 b4 b0 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13533d2:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
     13533d7:	e8 4c 6a 72 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     13533dc:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     13533e1:	e8 5c 1c dd ff       	call   1125042 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ec458>
     13533e6:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     13533eb:	e8 38 6a 72 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     13533f0:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     13533f5:	e8 a2 01 00 00       	call   135359c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b20>
     13533fa:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     13533ff:	e8 70 01 00 00       	call   1353574 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198af8>
     1353404:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     1353409:	e8 1a 6a 72 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     135340e:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
     1353413:	e8 b2 00 00 00       	call   13534ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a4e>
     1353418:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
     135341d:	e8 d0 00 00 00       	call   13534f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a76>
     1353422:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     1353427:	e8 fc 69 72 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     135342c:	48 89 df             	mov    rdi,rbx
     135342f:	e8 ec aa 49 00       	call   17edf20 <_ZdlPv@plt>
     1353434:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135343b:	00 00 
     135343d:	48 3b 84 24 90 01 00 	cmp    rax,QWORD PTR [rsp+0x190]
     1353444:	00 
     1353445:	75 08                	jne    135344f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1989d3>
     1353447:	48 89 ef             	mov    rdi,rbp
     135344a:	e8 81 c8 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     135344f:	e8 5c c6 49 00       	call   17efab0 <__stack_chk_fail@plt>

- hits: 6

## All uses of saved handle 0x40 = owner+0x40
### 0x1352641: mov    QWORD PTR [rsp+0x40],rax
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

### 0x1352caf: mov    rcx,QWORD PTR [rsp+0x40]
     1352c4f:	00 00 
     1352c51:	f3 0f 7f 40 20       	movdqu XMMWORD PTR [rax+0x20],xmm0
     1352c56:	48 85 c9             	test   rcx,rcx
     1352c59:	74 05                	je     1352c60 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1981e4>
     1352c5b:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     1352c60:	48 89 50 30          	mov    QWORD PTR [rax+0x30],rdx
     1352c64:	4c 8d b4 24 50 01 00 	lea    r14,[rsp+0x150]
     1352c6b:	00 
     1352c6c:	49 83 26 00          	and    QWORD PTR [r14],0x0
     1352c70:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     1352c75:	48 89 c6             	mov    rsi,rax
     1352c78:	e8 ff 08 00 00       	call   135357c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b00>
     1352c7d:	4c 89 f7             	mov    rdi,r14
     1352c80:	e8 17 09 00 00       	call   135359c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b20>
     1352c85:	80 7c 24 0f 00       	cmp    BYTE PTR [rsp+0xf],0x0
     1352c8a:	74 48                	je     1352cd4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198258>
     1352c8c:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     1352c93:	00 
     1352c94:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     1352c99:	e8 76 64 0e 00       	call   1439114 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27e698>
     1352c9e:	48 8b 84 24 50 01 00 	mov    rax,QWORD PTR [rsp+0x150]
     1352ca5:	00 
     1352ca6:	48 83 a4 24 50 01 00 	and    QWORD PTR [rsp+0x150],0x0
     1352cad:	00 00 
     1352caf:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
     1352cb4:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     1352cb7:	48 89 01             	mov    QWORD PTR [rcx],rax
     1352cba:	48 85 ff             	test   rdi,rdi
     1352cbd:	74 06                	je     1352cc5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198249>
     1352cbf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1352cc2:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1352cc5:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     1352ccc:	00 
     1352ccd:	e8 28 08 00 00       	call   13534fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a7e>
     1352cd2:	eb 5d                	jmp    1352d31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1982b5>
     1352cd4:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     1352cd9:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     1352cdc:	6a 28                	push   0x28
     1352cde:	5f                   	pop    rdi
     1352cdf:	e8 1c b2 49 00       	call   17edf00 <_Znwm@plt>
     1352ce4:	48 8d 0d 45 e8 51 00 	lea    rcx,[rip+0x51e845]        # 1871530 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dc18>
     1352ceb:	48 89 08             	mov    QWORD PTR [rax],rcx
     1352cee:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     1352cf3:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     1352cf7:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
     1352cfb:	48 8b 8c 24 f8 00 00 	mov    rcx,QWORD PTR [rsp+0xf8]
     1352d02:	00 
     1352d03:	66 0f 6f 84 24 f0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xf0]
     1352d0a:	00 00 
     1352d0c:	f3 0f 7f 40 18       	movdqu XMMWORD PTR [rax+0x18],xmm0
     1352d11:	48 85 c9             	test   rcx,rcx
     1352d14:	74 05                	je     1352d1b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19829f>
     1352d16:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     1352d1b:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
     1352d20:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     1352d23:	48 89 01             	mov    QWORD PTR [rcx],rax
     1352d26:	48 85 ff             	test   rdi,rdi
     1352d29:	74 06                	je     1352d31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1982b5>
     1352d2b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1352d2e:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1352d31:	48 8d 35 8c a0 08 ff 	lea    rsi,[rip+0xffffffffff08a08c]        # 3dcdc4 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2813>
     1352d38:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     1352d3f:	00 
     1352d40:	6a 02                	push   0x2
     1352d42:	5a                   	pop    rdx
     1352d43:	e8 e4 6c d5 ff       	call   10a9a2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270e42>
     1352d48:	80 7c 24 0e 00       	cmp    BYTE PTR [rsp+0xe],0x0
     1352d4d:	74 6d                	je     1352dbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198340>
     1352d4f:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     1352d56:	00 

### 0x1352d1b: mov    rcx,QWORD PTR [rsp+0x40]
     1352cbf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1352cc2:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1352cc5:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     1352ccc:	00 
     1352ccd:	e8 28 08 00 00       	call   13534fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a7e>
     1352cd2:	eb 5d                	jmp    1352d31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1982b5>
     1352cd4:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     1352cd9:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     1352cdc:	6a 28                	push   0x28
     1352cde:	5f                   	pop    rdi
     1352cdf:	e8 1c b2 49 00       	call   17edf00 <_Znwm@plt>
     1352ce4:	48 8d 0d 45 e8 51 00 	lea    rcx,[rip+0x51e845]        # 1871530 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dc18>
     1352ceb:	48 89 08             	mov    QWORD PTR [rax],rcx
     1352cee:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     1352cf3:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     1352cf7:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
     1352cfb:	48 8b 8c 24 f8 00 00 	mov    rcx,QWORD PTR [rsp+0xf8]
     1352d02:	00 
     1352d03:	66 0f 6f 84 24 f0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xf0]
     1352d0a:	00 00 
     1352d0c:	f3 0f 7f 40 18       	movdqu XMMWORD PTR [rax+0x18],xmm0
     1352d11:	48 85 c9             	test   rcx,rcx
     1352d14:	74 05                	je     1352d1b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19829f>
     1352d16:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     1352d1b:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
     1352d20:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     1352d23:	48 89 01             	mov    QWORD PTR [rcx],rax
     1352d26:	48 85 ff             	test   rdi,rdi
     1352d29:	74 06                	je     1352d31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1982b5>
     1352d2b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1352d2e:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1352d31:	48 8d 35 8c a0 08 ff 	lea    rsi,[rip+0xffffffffff08a08c]        # 3dcdc4 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2813>
     1352d38:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     1352d3f:	00 
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

### 0x13533e6: mov    rdi,QWORD PTR [rsp+0x40]
     1353382:	e8 8f 02 00 00       	call   1353616 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b9a>
     1353387:	6a 40                	push   0x40
     1353389:	41 5e                	pop    r14
     135338b:	4a 8b bc 34 40 01 00 	mov    rdi,QWORD PTR [rsp+r14*1+0x140]
     1353392:	00 
     1353393:	e8 22 b2 78 ff       	call   ade5ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b55a>
     1353398:	49 83 c6 e0          	add    r14,0xffffffffffffffe0
     135339c:	75 ed                	jne    135338b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19890f>
     135339e:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     13533a5:	00 
     13533a6:	e8 15 b2 78 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     13533ab:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]
     13533b2:	00 
     13533b3:	e8 ce b0 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13533b8:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
     13533bf:	00 
     13533c0:	e8 c1 b0 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13533c5:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
     13533cc:	00 
     13533cd:	e8 b4 b0 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13533d2:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
     13533d7:	e8 4c 6a 72 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     13533dc:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     13533e1:	e8 5c 1c dd ff       	call   1125042 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ec458>
     13533e6:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     13533eb:	e8 38 6a 72 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     13533f0:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     13533f5:	e8 a2 01 00 00       	call   135359c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b20>
     13533fa:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     13533ff:	e8 70 01 00 00       	call   1353574 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198af8>
     1353404:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     1353409:	e8 1a 6a 72 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     135340e:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
     1353413:	e8 b2 00 00 00       	call   13534ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a4e>
     1353418:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
     135341d:	e8 d0 00 00 00       	call   13534f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a76>
     1353422:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     1353427:	e8 fc 69 72 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     135342c:	48 89 df             	mov    rdi,rbx
     135342f:	e8 ec aa 49 00       	call   17edf20 <_ZdlPv@plt>
     1353434:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135343b:	00 00 
     135343d:	48 3b 84 24 90 01 00 	cmp    rax,QWORD PTR [rsp+0x190]
     1353444:	00 
     1353445:	75 08                	jne    135344f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1989d3>
     1353447:	48 89 ef             	mov    rdi,rbp
     135344a:	e8 81 c8 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     135344f:	e8 5c c6 49 00       	call   17efab0 <__stack_chk_fail@plt>

- hits: 4

## Direct writes to owner fields while owner base is still rbx
### 0x1352599: movdqu XMMWORD PTR [rbx+0x40],xmm0
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

## All vptr/high-address materializations near installs through saved handles
### 0x135257c: lea    rax,[rip+0x514dbd]        # 1867340 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23a28>
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

### 0x135268f: lea    rax,[rip+0x514d22]        # 18673b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23aa0>
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

### 0x135282c: lea    rcx,[rip+0x5150c5]        # 18678f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23fe0>
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

### 0x1352858: lea    rcx,[rip+0x515011]        # 1867870 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23f58>
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

### 0x1352937: lea    rax,[rip+0x514b02]        # 1867440 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23b28>
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

### 0x1352978: lea    rcx,[rip+0x51ebd9]        # 1871558 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dc40>
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

### 0x1352a40: lea    rcx,[rip+0x51eac1]        # 1871508 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dbf0>
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

### 0x1352c0c: lea    rcx,[rip+0x514b55]        # 1867768 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23e50>
     1352be6:	e8 2f 09 00 00       	call   135351a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a9e>
     1352beb:	4c 89 ff             	mov    rdi,r15
     1352bee:	e8 81 09 00 00       	call   1353574 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198af8>
     1352bf3:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     1352bfa:	00 
     1352bfb:	e8 86 b8 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1352c00:	4d 8b 34 24          	mov    r14,QWORD PTR [r12]
     1352c04:	6a 38                	push   0x38
     1352c06:	5f                   	pop    rdi
     1352c07:	e8 f4 b2 49 00       	call   17edf00 <_Znwm@plt>
     1352c0c:	48 8d 0d 55 4b 51 00 	lea    rcx,[rip+0x514b55]        # 1867768 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23e50>
     1352c13:	48 89 08             	mov    QWORD PTR [rax],rcx
     1352c16:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
     1352c1a:	48 8b 8c 24 f8 00 00 	mov    rcx,QWORD PTR [rsp+0xf8]
     1352c21:	00 
     1352c22:	0f 28 84 24 f0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xf0]
     1352c29:	00 
     1352c2a:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
     1352c2e:	48 85 c9             	test   rcx,rcx
     1352c31:	48 8b 94 24 90 00 00 	mov    rdx,QWORD PTR [rsp+0x90]
     1352c38:	00 
     1352c39:	74 05                	je     1352c40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1981c4>
     1352c3b:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     1352c40:	48 8b 8c 24 e8 00 00 	mov    rcx,QWORD PTR [rsp+0xe8]
     1352c47:	00 
     1352c48:	66 0f 6f 84 24 e0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xe0]
     1352c4f:	00 00 

### 0x1352ce4: lea    rcx,[rip+0x51e845]        # 1871530 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dc18>
     1352cc2:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1352cc5:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     1352ccc:	00 
     1352ccd:	e8 28 08 00 00       	call   13534fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a7e>
     1352cd2:	eb 5d                	jmp    1352d31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1982b5>
     1352cd4:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     1352cd9:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     1352cdc:	6a 28                	push   0x28
     1352cde:	5f                   	pop    rdi
     1352cdf:	e8 1c b2 49 00       	call   17edf00 <_Znwm@plt>
     1352ce4:	48 8d 0d 45 e8 51 00 	lea    rcx,[rip+0x51e845]        # 1871530 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dc18>
     1352ceb:	48 89 08             	mov    QWORD PTR [rax],rcx
     1352cee:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     1352cf3:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     1352cf7:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
     1352cfb:	48 8b 8c 24 f8 00 00 	mov    rcx,QWORD PTR [rsp+0xf8]
     1352d02:	00 
     1352d03:	66 0f 6f 84 24 f0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xf0]
     1352d0a:	00 00 
     1352d0c:	f3 0f 7f 40 18       	movdqu XMMWORD PTR [rax+0x18],xmm0
     1352d11:	48 85 c9             	test   rcx,rcx
     1352d14:	74 05                	je     1352d1b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19829f>
     1352d16:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     1352d1b:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
     1352d20:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     1352d23:	48 89 01             	mov    QWORD PTR [rcx],rax
     1352d26:	48 85 ff             	test   rdi,rdi


## Helper bodies used immediately around installs
### 0x1353454

/tmp/ta2840/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000001353434 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1989b8>:
 1353434:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 135343b:	00 00 
 135343d:	48 3b 84 24 90 01 00 	cmp    rax,QWORD PTR [rsp+0x190]
 1353444:	00 
 1353445:	75 08                	jne    135344f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1989d3>
 1353447:	48 89 ef             	mov    rdi,rbp
 135344a:	e8 81 c8 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 135344f:	e8 5c c6 49 00       	call   17efab0 <__stack_chk_fail@plt>
 1353454:	41 57                	push   r15
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
 13534a9:	e8 d8 af 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 13534ae:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
 13534b2:	e8 cf af 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 13534b7:	48 89 df             	mov    rdi,rbx
 13534ba:	5b                   	pop    rbx
 13534bb:	41 5e                	pop    r14
 13534bd:	41 5f                	pop    r15
 13534bf:	e9 5c aa 49 00       	jmp    17edf20 <_ZdlPv@plt>
 13534c4:	5b                   	pop    rbx
 13534c5:	41 5e                	pop    r14
 13534c7:	41 5f                	pop    r15
 13534c9:	c3                   	ret
 13534ca:	31 f6                	xor    esi,esi
 13534cc:	e9 83 ff ff ff       	jmp    1353454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1989d8>
 13534d1:	cc                   	int3
 13534d2:	53                   	push   rbx
 13534d3:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 13534d6:	48 89 37             	mov    QWORD PTR [rdi],rsi
 13534d9:	48 85 db             	test   rbx,rbx
 13534dc:	74 11                	je     13534ef <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a73>
 13534de:	48 89 df             	mov    rdi,rbx
 13534e1:	e8 ee 03 af ff       	call   e438d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xacea>
 13534e6:	48 89 df             	mov    rdi,rbx
 13534e9:	5b                   	pop    rbx
 13534ea:	e9 31 aa 49 00       	jmp    17edf20 <_ZdlPv@plt>
 13534ef:	5b                   	pop    rbx
 13534f0:	c3                   	ret
 13534f1:	cc                   	int3
 13534f2:	31 f6                	xor    esi,esi
 13534f4:	e9 d9 ff ff ff       	jmp    13534d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a56>
 13534f9:	cc                   	int3
 13534fa:	53                   	push   rbx
 13534fb:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 13534fe:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 1353502:	48 85 db             	test   rbx,rbx
 1353505:	74 11                	je     1353518 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a9c>
 1353507:	48 89 df             	mov    rdi,rbx
 135350a:	e8 af 03 00 00       	call   13538be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198e42>
 135350f:	48 89 df             	mov    rdi,rbx
 1353512:	5b                   	pop    rbx
 1353513:	e9 08 aa 49 00       	jmp    17edf20 <_ZdlPv@plt>
 1353518:	5b                   	pop    rbx
 1353519:	c3                   	ret
 135351a:	53                   	push   rbx
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
### 0x13534ca

/tmp/ta2840/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000013534aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a2e>:
 13534aa:	d8 af 74 ff 48 8b    	fsubr  DWORD PTR [rdi-0x74b7008c]
 13534b0:	7b 28                	jnp    13534da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a5e>
 13534b2:	e8 cf af 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 13534b7:	48 89 df             	mov    rdi,rbx
 13534ba:	5b                   	pop    rbx
 13534bb:	41 5e                	pop    r14
 13534bd:	41 5f                	pop    r15
 13534bf:	e9 5c aa 49 00       	jmp    17edf20 <_ZdlPv@plt>
 13534c4:	5b                   	pop    rbx
 13534c5:	41 5e                	pop    r14
 13534c7:	41 5f                	pop    r15
 13534c9:	c3                   	ret
 13534ca:	31 f6                	xor    esi,esi
 13534cc:	e9 83 ff ff ff       	jmp    1353454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1989d8>
 13534d1:	cc                   	int3
 13534d2:	53                   	push   rbx
 13534d3:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 13534d6:	48 89 37             	mov    QWORD PTR [rdi],rsi
 13534d9:	48 85 db             	test   rbx,rbx
 13534dc:	74 11                	je     13534ef <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a73>
 13534de:	48 89 df             	mov    rdi,rbx
 13534e1:	e8 ee 03 af ff       	call   e438d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xacea>
 13534e6:	48 89 df             	mov    rdi,rbx
 13534e9:	5b                   	pop    rbx
 13534ea:	e9 31 aa 49 00       	jmp    17edf20 <_ZdlPv@plt>
 13534ef:	5b                   	pop    rbx
 13534f0:	c3                   	ret
 13534f1:	cc                   	int3
 13534f2:	31 f6                	xor    esi,esi
 13534f4:	e9 d9 ff ff ff       	jmp    13534d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a56>
 13534f9:	cc                   	int3
 13534fa:	53                   	push   rbx
 13534fb:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 13534fe:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 1353502:	48 85 db             	test   rbx,rbx
 1353505:	74 11                	je     1353518 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a9c>
 1353507:	48 89 df             	mov    rdi,rbx
 135350a:	e8 af 03 00 00       	call   13538be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198e42>
 135350f:	48 89 df             	mov    rdi,rbx
 1353512:	5b                   	pop    rbx
 1353513:	e9 08 aa 49 00       	jmp    17edf20 <_ZdlPv@plt>
 1353518:	5b                   	pop    rbx
 1353519:	c3                   	ret
 135351a:	53                   	push   rbx
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
 1353576:	e9 9f ff ff ff       	jmp    135351a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a9e>
 135357b:	cc                   	int3
 135357c:	53                   	push   rbx
 135357d:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 1353580:	48 89 37             	mov    QWORD PTR [rdi],rsi
 1353583:	48 85 db             	test   rbx,rbx
 1353586:	74 11                	je     1353599 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b1d>
 1353588:	48 89 df             	mov    rdi,rbx
 135358b:	e8 74 09 bb ff       	call   f03f04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcb31a>
 1353590:	48 89 df             	mov    rdi,rbx
 1353593:	5b                   	pop    rbx
 1353594:	e9 87 a9 49 00       	jmp    17edf20 <_ZdlPv@plt>
 1353599:	5b                   	pop    rbx
 135359a:	c3                   	ret
 135359b:	cc                   	int3
 135359c:	31 f6                	xor    esi,esi
 135359e:	e9 d9 ff ff ff       	jmp    135357c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b00>
 13535a3:	cc                   	int3
 13535a4:	41 56                	push   r14
 13535a6:	53                   	push   rbx
 13535a7:	50                   	push   rax
 13535a8:	4c 8d 77 08          	lea    r14,[rdi+0x8]
 13535ac:	0f 57 c0             	xorps  xmm0,xmm0
 13535af:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
 13535b3:	4c 89 37             	mov    QWORD PTR [rdi],r14
 13535b6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 13535b9:	48 8d 56 08          	lea    rdx,[rsi+0x8]
 13535bd:	48 89 c6             	mov    rsi,rax
 13535c0:	e8 a7 02 00 00       	call   135386c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198df0>
 13535c5:	48 83 c4 08          	add    rsp,0x8
 13535c9:	5b                   	pop    rbx
 13535ca:	41 5e                	pop    r14
 13535cc:	c3                   	ret
 13535cd:	48 89 c3             	mov    rbx,rax
 13535d0:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
 13535d3:	e8 e2 af 78 ff       	call   ade5ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b55a>
 13535d8:	48 89 df             	mov    rdi,rbx
 13535db:	e8 f0 c6 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 13535e0:	80 7f 18 00          	cmp    BYTE PTR [rdi+0x18],0x0
 13535e4:	74 01                	je     13535e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b6b>
 13535e6:	c3                   	ret
 13535e7:	41 56                	push   r14
 13535e9:	53                   	push   rbx
### 0x13534d2

/tmp/ta2840/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000013534b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a36>:
 13534b2:	e8 cf af 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 13534b7:	48 89 df             	mov    rdi,rbx
 13534ba:	5b                   	pop    rbx
 13534bb:	41 5e                	pop    r14
 13534bd:	41 5f                	pop    r15
 13534bf:	e9 5c aa 49 00       	jmp    17edf20 <_ZdlPv@plt>
 13534c4:	5b                   	pop    rbx
 13534c5:	41 5e                	pop    r14
 13534c7:	41 5f                	pop    r15
 13534c9:	c3                   	ret
 13534ca:	31 f6                	xor    esi,esi
 13534cc:	e9 83 ff ff ff       	jmp    1353454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1989d8>
 13534d1:	cc                   	int3
 13534d2:	53                   	push   rbx
 13534d3:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 13534d6:	48 89 37             	mov    QWORD PTR [rdi],rsi
 13534d9:	48 85 db             	test   rbx,rbx
 13534dc:	74 11                	je     13534ef <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a73>
 13534de:	48 89 df             	mov    rdi,rbx
 13534e1:	e8 ee 03 af ff       	call   e438d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xacea>
 13534e6:	48 89 df             	mov    rdi,rbx
 13534e9:	5b                   	pop    rbx
 13534ea:	e9 31 aa 49 00       	jmp    17edf20 <_ZdlPv@plt>
 13534ef:	5b                   	pop    rbx
 13534f0:	c3                   	ret
 13534f1:	cc                   	int3
 13534f2:	31 f6                	xor    esi,esi
 13534f4:	e9 d9 ff ff ff       	jmp    13534d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a56>
 13534f9:	cc                   	int3
 13534fa:	53                   	push   rbx
 13534fb:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 13534fe:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 1353502:	48 85 db             	test   rbx,rbx
 1353505:	74 11                	je     1353518 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a9c>
 1353507:	48 89 df             	mov    rdi,rbx
 135350a:	e8 af 03 00 00       	call   13538be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198e42>
 135350f:	48 89 df             	mov    rdi,rbx
 1353512:	5b                   	pop    rbx
 1353513:	e9 08 aa 49 00       	jmp    17edf20 <_ZdlPv@plt>
 1353518:	5b                   	pop    rbx
 1353519:	c3                   	ret
 135351a:	53                   	push   rbx
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
 1353576:	e9 9f ff ff ff       	jmp    135351a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a9e>
 135357b:	cc                   	int3
 135357c:	53                   	push   rbx
 135357d:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 1353580:	48 89 37             	mov    QWORD PTR [rdi],rsi
 1353583:	48 85 db             	test   rbx,rbx
 1353586:	74 11                	je     1353599 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b1d>
 1353588:	48 89 df             	mov    rdi,rbx
 135358b:	e8 74 09 bb ff       	call   f03f04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcb31a>
 1353590:	48 89 df             	mov    rdi,rbx
 1353593:	5b                   	pop    rbx
 1353594:	e9 87 a9 49 00       	jmp    17edf20 <_ZdlPv@plt>
 1353599:	5b                   	pop    rbx
 135359a:	c3                   	ret
 135359b:	cc                   	int3
 135359c:	31 f6                	xor    esi,esi
 135359e:	e9 d9 ff ff ff       	jmp    135357c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b00>
 13535a3:	cc                   	int3
 13535a4:	41 56                	push   r14
 13535a6:	53                   	push   rbx
 13535a7:	50                   	push   rax
 13535a8:	4c 8d 77 08          	lea    r14,[rdi+0x8]
 13535ac:	0f 57 c0             	xorps  xmm0,xmm0
 13535af:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
 13535b3:	4c 89 37             	mov    QWORD PTR [rdi],r14
 13535b6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 13535b9:	48 8d 56 08          	lea    rdx,[rsi+0x8]
 13535bd:	48 89 c6             	mov    rsi,rax
 13535c0:	e8 a7 02 00 00       	call   135386c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198df0>
 13535c5:	48 83 c4 08          	add    rsp,0x8
 13535c9:	5b                   	pop    rbx
 13535ca:	41 5e                	pop    r14
 13535cc:	c3                   	ret
 13535cd:	48 89 c3             	mov    rbx,rax
 13535d0:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
 13535d3:	e8 e2 af 78 ff       	call   ade5ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b55a>
 13535d8:	48 89 df             	mov    rdi,rbx
 13535db:	e8 f0 c6 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 13535e0:	80 7f 18 00          	cmp    BYTE PTR [rdi+0x18],0x0
 13535e4:	74 01                	je     13535e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b6b>
 13535e6:	c3                   	ret
 13535e7:	41 56                	push   r14
 13535e9:	53                   	push   rbx
 13535ea:	50                   	push   rax
 13535eb:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 13535ef:	48                   	rex.W
 13535f0:	8b                   	.byte 0x8b
 13535f1:	4f                   	rex.WRXB
### 0x13534f2

/tmp/ta2840/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000013534d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a56>:
 13534d2:	53                   	push   rbx
 13534d3:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 13534d6:	48 89 37             	mov    QWORD PTR [rdi],rsi
 13534d9:	48 85 db             	test   rbx,rbx
 13534dc:	74 11                	je     13534ef <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a73>
 13534de:	48 89 df             	mov    rdi,rbx
 13534e1:	e8 ee 03 af ff       	call   e438d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xacea>
 13534e6:	48 89 df             	mov    rdi,rbx
 13534e9:	5b                   	pop    rbx
 13534ea:	e9 31 aa 49 00       	jmp    17edf20 <_ZdlPv@plt>
 13534ef:	5b                   	pop    rbx
 13534f0:	c3                   	ret
 13534f1:	cc                   	int3
 13534f2:	31 f6                	xor    esi,esi
 13534f4:	e9 d9 ff ff ff       	jmp    13534d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a56>
 13534f9:	cc                   	int3
 13534fa:	53                   	push   rbx
 13534fb:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 13534fe:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 1353502:	48 85 db             	test   rbx,rbx
 1353505:	74 11                	je     1353518 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a9c>
 1353507:	48 89 df             	mov    rdi,rbx
 135350a:	e8 af 03 00 00       	call   13538be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198e42>
 135350f:	48 89 df             	mov    rdi,rbx
 1353512:	5b                   	pop    rbx
 1353513:	e9 08 aa 49 00       	jmp    17edf20 <_ZdlPv@plt>
 1353518:	5b                   	pop    rbx
 1353519:	c3                   	ret
 135351a:	53                   	push   rbx
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
 1353576:	e9 9f ff ff ff       	jmp    135351a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a9e>
 135357b:	cc                   	int3
 135357c:	53                   	push   rbx
 135357d:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 1353580:	48 89 37             	mov    QWORD PTR [rdi],rsi
 1353583:	48 85 db             	test   rbx,rbx
 1353586:	74 11                	je     1353599 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b1d>
 1353588:	48 89 df             	mov    rdi,rbx
 135358b:	e8 74 09 bb ff       	call   f03f04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcb31a>
 1353590:	48 89 df             	mov    rdi,rbx
 1353593:	5b                   	pop    rbx
 1353594:	e9 87 a9 49 00       	jmp    17edf20 <_ZdlPv@plt>
 1353599:	5b                   	pop    rbx
 135359a:	c3                   	ret
 135359b:	cc                   	int3
 135359c:	31 f6                	xor    esi,esi
 135359e:	e9 d9 ff ff ff       	jmp    135357c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b00>
 13535a3:	cc                   	int3
 13535a4:	41 56                	push   r14
 13535a6:	53                   	push   rbx
 13535a7:	50                   	push   rax
 13535a8:	4c 8d 77 08          	lea    r14,[rdi+0x8]
 13535ac:	0f 57 c0             	xorps  xmm0,xmm0
 13535af:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
 13535b3:	4c 89 37             	mov    QWORD PTR [rdi],r14
 13535b6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 13535b9:	48 8d 56 08          	lea    rdx,[rsi+0x8]
 13535bd:	48 89 c6             	mov    rsi,rax
 13535c0:	e8 a7 02 00 00       	call   135386c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198df0>
 13535c5:	48 83 c4 08          	add    rsp,0x8
 13535c9:	5b                   	pop    rbx
 13535ca:	41 5e                	pop    r14
 13535cc:	c3                   	ret
 13535cd:	48 89 c3             	mov    rbx,rax
 13535d0:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
 13535d3:	e8 e2 af 78 ff       	call   ade5ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b55a>
 13535d8:	48 89 df             	mov    rdi,rbx
 13535db:	e8 f0 c6 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 13535e0:	80 7f 18 00          	cmp    BYTE PTR [rdi+0x18],0x0
 13535e4:	74 01                	je     13535e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b6b>
 13535e6:	c3                   	ret
 13535e7:	41 56                	push   r14
 13535e9:	53                   	push   rbx
 13535ea:	50                   	push   rax
 13535eb:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 13535ef:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
 13535f3:	48 8b 19             	mov    rbx,QWORD PTR [rcx]
 13535f6:	4c 8b 30             	mov    r14,QWORD PTR [rax]
 13535f9:	4c 39 f3             	cmp    rbx,r14
 13535fc:	74 0f                	je     135360d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b91>
 13535fe:	48 8b 7b f0          	mov    rdi,QWORD PTR [rbx-0x10]
 1353602:	48 83 c3 e0          	add    rbx,0xffffffffffffffe0
 1353606:	e8 af af 78 ff       	call   ade5ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b55a>
 135360b:	eb ec                	jmp    13535f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b7d>
 135360d:	48 83 c4 08          	add    rsp,0x8
 1353611:	5b                   	pop    rbx
### 0x13534fa

/tmp/ta2840/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000013534da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a5e>:
 13534da:	85 db                	test   ebx,ebx
 13534dc:	74 11                	je     13534ef <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a73>
 13534de:	48 89 df             	mov    rdi,rbx
 13534e1:	e8 ee 03 af ff       	call   e438d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xacea>
 13534e6:	48 89 df             	mov    rdi,rbx
 13534e9:	5b                   	pop    rbx
 13534ea:	e9 31 aa 49 00       	jmp    17edf20 <_ZdlPv@plt>
 13534ef:	5b                   	pop    rbx
 13534f0:	c3                   	ret
 13534f1:	cc                   	int3
 13534f2:	31 f6                	xor    esi,esi
 13534f4:	e9 d9 ff ff ff       	jmp    13534d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a56>
 13534f9:	cc                   	int3
 13534fa:	53                   	push   rbx
 13534fb:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 13534fe:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 1353502:	48 85 db             	test   rbx,rbx
 1353505:	74 11                	je     1353518 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a9c>
 1353507:	48 89 df             	mov    rdi,rbx
 135350a:	e8 af 03 00 00       	call   13538be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198e42>
 135350f:	48 89 df             	mov    rdi,rbx
 1353512:	5b                   	pop    rbx
 1353513:	e9 08 aa 49 00       	jmp    17edf20 <_ZdlPv@plt>
 1353518:	5b                   	pop    rbx
 1353519:	c3                   	ret
 135351a:	53                   	push   rbx
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
 1353576:	e9 9f ff ff ff       	jmp    135351a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a9e>
 135357b:	cc                   	int3
 135357c:	53                   	push   rbx
 135357d:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 1353580:	48 89 37             	mov    QWORD PTR [rdi],rsi
 1353583:	48 85 db             	test   rbx,rbx
 1353586:	74 11                	je     1353599 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b1d>
 1353588:	48 89 df             	mov    rdi,rbx
 135358b:	e8 74 09 bb ff       	call   f03f04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcb31a>
 1353590:	48 89 df             	mov    rdi,rbx
 1353593:	5b                   	pop    rbx
 1353594:	e9 87 a9 49 00       	jmp    17edf20 <_ZdlPv@plt>
 1353599:	5b                   	pop    rbx
 135359a:	c3                   	ret
 135359b:	cc                   	int3
 135359c:	31 f6                	xor    esi,esi
 135359e:	e9 d9 ff ff ff       	jmp    135357c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b00>
 13535a3:	cc                   	int3
 13535a4:	41 56                	push   r14
 13535a6:	53                   	push   rbx
 13535a7:	50                   	push   rax
 13535a8:	4c 8d 77 08          	lea    r14,[rdi+0x8]
 13535ac:	0f 57 c0             	xorps  xmm0,xmm0
 13535af:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
 13535b3:	4c 89 37             	mov    QWORD PTR [rdi],r14
 13535b6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 13535b9:	48 8d 56 08          	lea    rdx,[rsi+0x8]
 13535bd:	48 89 c6             	mov    rsi,rax
 13535c0:	e8 a7 02 00 00       	call   135386c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198df0>
 13535c5:	48 83 c4 08          	add    rsp,0x8
 13535c9:	5b                   	pop    rbx
 13535ca:	41 5e                	pop    r14
 13535cc:	c3                   	ret
 13535cd:	48 89 c3             	mov    rbx,rax
 13535d0:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
 13535d3:	e8 e2 af 78 ff       	call   ade5ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b55a>
 13535d8:	48 89 df             	mov    rdi,rbx
 13535db:	e8 f0 c6 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 13535e0:	80 7f 18 00          	cmp    BYTE PTR [rdi+0x18],0x0
 13535e4:	74 01                	je     13535e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b6b>
 13535e6:	c3                   	ret
 13535e7:	41 56                	push   r14
 13535e9:	53                   	push   rbx
 13535ea:	50                   	push   rax
 13535eb:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 13535ef:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
 13535f3:	48 8b 19             	mov    rbx,QWORD PTR [rcx]
 13535f6:	4c 8b 30             	mov    r14,QWORD PTR [rax]
 13535f9:	4c 39 f3             	cmp    rbx,r14
 13535fc:	74 0f                	je     135360d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b91>
 13535fe:	48 8b 7b f0          	mov    rdi,QWORD PTR [rbx-0x10]
 1353602:	48 83 c3 e0          	add    rbx,0xffffffffffffffe0
 1353606:	e8 af af 78 ff       	call   ade5ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b55a>
 135360b:	eb ec                	jmp    13535f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b7d>
 135360d:	48 83 c4 08          	add    rsp,0x8
 1353611:	5b                   	pop    rbx
 1353612:	41 5e                	pop    r14
 1353614:	c3                   	ret
 1353615:	cc                   	int3
 1353616:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0
### 0x1439114

/tmp/ta2840/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000014390f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27e678>:
 14390f4:	00 0f                	add    BYTE PTR [rdi],cl
 14390f6:	18 09                	sbb    BYTE PTR [rcx],cl
 14390f8:	c3                   	ret
 14390f9:	cc                   	int3
 14390fa:	48 89 f0             	mov    rax,rsi
 14390fd:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 1439101:	48 8d 0d e0 82 43 00 	lea    rcx,[rip+0x4382e0]        # 18713e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dad0>
 1439108:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 143910b:	0f 57 c0             	xorps  xmm0,xmm0
 143910e:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
 1439112:	c3                   	ret
 1439113:	cc                   	int3
 1439114:	55                   	push   rbp
 1439115:	41 57                	push   r15
 1439117:	41 56                	push   r14
 1439119:	41 55                	push   r13
 143911b:	41 54                	push   r12
 143911d:	53                   	push   rbx
 143911e:	48 81 ec b8 04 00 00 	sub    rsp,0x4b8
 1439125:	49 89 f6             	mov    r14,rsi
 1439128:	49 89 fc             	mov    r12,rdi
 143912b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1439132:	00 00 
 1439134:	48 89 84 24 b0 04 00 	mov    QWORD PTR [rsp+0x4b0],rax
 143913b:	00 
 143913c:	0f 57 c0             	xorps  xmm0,xmm0
 143913f:	0f 29 84 24 f0 02 00 	movaps XMMWORD PTR [rsp+0x2f0],xmm0
 1439146:	00 
 1439147:	0f 29 84 24 b0 02 00 	movaps XMMWORD PTR [rsp+0x2b0],xmm0
 143914e:	00 
 143914f:	0f 29 84 24 a0 02 00 	movaps XMMWORD PTR [rsp+0x2a0],xmm0
 1439156:	00 
 1439157:	0f 29 84 24 90 02 00 	movaps XMMWORD PTR [rsp+0x290],xmm0
 143915e:	00 
 143915f:	c7 84 24 c8 02 00 00 	mov    DWORD PTR [rsp+0x2c8],0xc
 1439166:	0c 00 00 00 
 143916a:	4c 8d 7c 24 60       	lea    r15,[rsp+0x60]
 143916f:	49 83 67 d8 00       	and    QWORD PTR [r15-0x28],0x0
 1439174:	0f 29 84 24 d0 02 00 	movaps XMMWORD PTR [rsp+0x2d0],xmm0
 143917b:	00 
 143917c:	48 8d 05 e5 ed 45 00 	lea    rax,[rip+0x45ede5]        # 1897f68 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4ea8>
 1439183:	49 89 47 d0          	mov    QWORD PTR [r15-0x30],rax
 1439187:	41 0f 11 47 e0       	movups XMMWORD PTR [r15-0x20],xmm0
 143918c:	41 0f 11 47 f0       	movups XMMWORD PTR [r15-0x10],xmm0
 1439191:	48 8d 05 60 66 00 ff 	lea    rax,[rip+0xffffffffff006660]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
 1439198:	49 89 07             	mov    QWORD PTR [r15],rax
 143919b:	41 0f 11 47 08       	movups XMMWORD PTR [r15+0x8],xmm0
 14391a0:	48 8d 35 56 3d f0 fe 	lea    rsi,[rip+0xfffffffffef03d56]        # 33cefd <_ZTSSt12bad_any_cast@@Base-0x532cb>
 14391a7:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
 14391ae:	00 
 14391af:	6a 16                	push   0x16
 14391b1:	5a                   	pop    rdx
 14391b2:	e8 2e ea 39 00       	call   17d7be5 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3a06>
 14391b7:	84 c0                	test   al,al
 14391b9:	74 29                	je     14391e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27e768>
 14391bb:	8a 9c 24 00 03 00 00 	mov    bl,BYTE PTR [rsp+0x300]
 14391c2:	48 8b 84 24 01 03 00 	mov    rax,QWORD PTR [rsp+0x301]
 14391c9:	00 
 14391ca:	48 89 84 24 80 02 00 	mov    QWORD PTR [rsp+0x280],rax
 14391d1:	00 
 14391d2:	48 8b 84 24 08 03 00 	mov    rax,QWORD PTR [rsp+0x308]
 14391d9:	00 
 14391da:	48 89 84 24 87 02 00 	mov    QWORD PTR [rsp+0x287],rax
 14391e1:	00 
 14391e2:	eb 02                	jmp    14391e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27e76a>
 14391e4:	31 db                	xor    ebx,ebx
 14391e6:	48 8d 35 e8 b7 f3 fe 	lea    rsi,[rip+0xfffffffffef3b7e8]        # 3749d5 <_ZTSSt12bad_any_cast@@Base-0x1b7f3>
 14391ed:	48 8d bc 24 6b 02 00 	lea    rdi,[rsp+0x26b]
 14391f4:	00 
 14391f5:	6a 28                	push   0x28
 14391f7:	5a                   	pop    rdx
 14391f8:	e8 ed 40 81 ff       	call   c4d2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19a28a>
 14391fd:	48 8d b4 24 00 03 00 	lea    rsi,[rsp+0x300]
 1439204:	00 
 1439205:	88 5e 01             	mov    BYTE PTR [rsi+0x1],bl
 1439208:	48 8b 84 24 80 02 00 	mov    rax,QWORD PTR [rsp+0x280]
 143920f:	00 
 1439210:	48 8b 8c 24 87 02 00 	mov    rcx,QWORD PTR [rsp+0x287]
 1439217:	00 
 1439218:	48 89 46 02          	mov    QWORD PTR [rsi+0x2],rax
 143921c:	48 89 4e 09          	mov    QWORD PTR [rsi+0x9],rcx
 1439220:	c7 44 24 40 01 00 00 	mov    DWORD PTR [rsp+0x40],0x1
 1439227:	00 
 1439228:	c6 06 20             	mov    BYTE PTR [rsi],0x20
 143922b:	c6 46 11 00          	mov    BYTE PTR [rsi+0x11],0x0
 143922f:	4c 89 ff             	mov    rdi,r15
 1439232:	31 d2                	xor    edx,edx
