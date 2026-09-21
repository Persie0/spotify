# adObject+0x1b8-gated state owner

Known:
- when adObject+0x1b8 != 0, a 0x90-byte state object is built
- 0x1352813 calls 0x1353454(destination=[rsp+0x38], state)
- 0x1353454 swaps the state into destination

## Containing factory FDE: (20260004, 20264020)

## Every rsp+0x38 reference
### WRITE 0x135261d: mov    QWORD PTR [rsp+0x38],rax
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

### READ 0x1352808: mov    r12,QWORD PTR [rsp+0x38]
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

### READ 0x1352968: mov    rax,QWORD PTR [rsp+0x38]
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

### READ 0x135340e: mov    rdi,QWORD PTR [rsp+0x38]
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

## Definition reaching rsp+0x38 before install
- 0x135261d: mov    QWORD PTR [rsp+0x38],rax
### nearest definition
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

## 1353454 swap helper
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

## Address-producing LEAs assigned into rsp+0x38 aliases
### 0x1352607: lea    rax,[rbx+0x10]
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

### 0x1352610: lea    rax,[rbx+0x18]
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

### 0x1352619: lea    rax,[rbx+0x20]
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

## Consumers of helper 1353454
### caller 0x1352813; FDE=(20260004, 20264020)
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

