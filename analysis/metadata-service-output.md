# MetadataSetupImpl concrete service output

Factory 0xd498ce saves incoming output pointer rdi to [rsp+0xa0].

## Every reference to saved output slot rsp+0xa0
### 0xd498e2: mov    QWORD PTR [rsp+0xa0],rdi
  d498ce:	55                   	push   rbp
  d498cf:	41 57                	push   r15
  d498d1:	41 56                	push   r14
  d498d3:	41 55                	push   r13
  d498d5:	41 54                	push   r12
  d498d7:	53                   	push   rbx
  d498d8:	48 81 ec a8 01 00 00 	sub    rsp,0x1a8
  d498df:	48 89 d3             	mov    rbx,rdx
  d498e2:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
  d498e9:	00 
  d498ea:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  d498f1:	00 00 
  d498f3:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
  d498fa:	00 
  d498fb:	48 89 cf             	mov    rdi,rcx
  d498fe:	e8 9d 99 e1 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
  d49903:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
  d49908:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
  d4990c:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
  d49911:	48 8b 43 60          	mov    rax,QWORD PTR [rbx+0x60]
  d49915:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  d4991a:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
  d49921:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d49925:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
  d4992c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d4992f:	ff 50 10             	call   QWORD PTR [rax+0x10]
  d49932:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
  d49939:	00 
  d4993a:	4c 8b 33             	mov    r14,QWORD PTR [rbx]
  d4993d:	4c 8b 63 30          	mov    r12,QWORD PTR [rbx+0x30]
  d49941:	6a 40                	push   0x40
  d49943:	5f                   	pop    rdi
  d49944:	e8 b7 45 aa 00       	call   17edf00 <_Znwm@plt>
  d49949:	41 8b 4e 48          	mov    ecx,DWORD PTR [r14+0x48]
  d4994d:	89 4c 24 44          	mov    DWORD PTR [rsp+0x44],ecx
  d49951:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
  d49955:	48 8d 0d 44 b7 ad 00 	lea    rcx,[rip+0xadb744]        # 18250a0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x16d0>
  d4995c:	48 89 08             	mov    QWORD PTR [rax],rcx
  d4995f:	48 8d 48 10          	lea    rcx,[rax+0x10]
  d49963:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
  d49968:	48 8d 48 18          	lea    rcx,[rax+0x18]
  d4996c:	48 89 4c 24 30       	mov    QWORD PTR [rsp+0x30],rcx
  d49971:	48 8d 48 20          	lea    rcx,[rax+0x20]
  d49975:	48 89 4c 24 68       	mov    QWORD PTR [rsp+0x68],rcx
  d4997a:	48 8d 48 28          	lea    rcx,[rax+0x28]
  d4997e:	48 89 4c 24 60       	mov    QWORD PTR [rsp+0x60],rcx
  d49983:	48 8d 48 30          	lea    rcx,[rax+0x30]
  d49987:	48 89 4c 24 58       	mov    QWORD PTR [rsp+0x58],rcx
  d4998c:	48 8d 48 38          	lea    rcx,[rax+0x38]
  d49990:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
  d49995:	0f 57 c0             	xorps  xmm0,xmm0
  d49998:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
  d4999c:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0

### 0xd4a647: mov    rcx,QWORD PTR [rsp+0xa0]
  d4a5ff:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]
  d4a606:	00 
  d4a607:	48 83 a4 24 60 01 00 	and    QWORD PTR [rsp+0x160],0x0
  d4a60e:	00 00 
  d4a610:	48 85 ff             	test   rdi,rdi
  d4a613:	74 06                	je     d4a61b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176a1>
  d4a615:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d4a618:	ff 50 08             	call   QWORD PTR [rax+0x8]
  d4a61b:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
  d4a622:	00 
  d4a623:	e8 a0 05 00 00       	call   d4abc8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c4e>
  d4a628:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
  d4a62f:	00 
  d4a630:	e8 35 f9 d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  d4a635:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
  d4a63c:	00 
  d4a63d:	e8 28 f9 d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  d4a642:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
  d4a647:	48 8b 8c 24 a0 00 00 	mov    rcx,QWORD PTR [rsp+0xa0]
  d4a64e:	00 
  d4a64f:	48 89 01             	mov    QWORD PTR [rcx],rax
  d4a652:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  d4a659:	00 00 
  d4a65b:	48 3b 84 24 a0 01 00 	cmp    rax,QWORD PTR [rsp+0x1a0]
  d4a662:	00 
  d4a663:	0f 85 cb 03 00 00    	jne    d4aa34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aba>
  d4a669:	48 89 c8             	mov    rax,rcx
  d4a66c:	48 81 c4 a8 01 00 00 	add    rsp,0x1a8
  d4a673:	5b                   	pop    rbx
  d4a674:	41 5c                	pop    r12
  d4a676:	41 5d                	pop    r13
  d4a678:	41 5e                	pop    r14
  d4a67a:	41 5f                	pop    r15
  d4a67c:	5d                   	pop    rbp
  d4a67d:	c3                   	ret
  d4a67e:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a682:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]
  d4a689:	00 
  d4a68a:	48 83 a4 24 60 01 00 	and    QWORD PTR [rsp+0x160],0x0
  d4a691:	00 00 
  d4a693:	48 85 ff             	test   rdi,rdi
  d4a696:	74 06                	je     d4a69e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17724>
  d4a698:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d4a69b:	ff 50 08             	call   QWORD PTR [rax+0x8]
  d4a69e:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
  d4a6a5:	00 
  d4a6a6:	e8 1d 05 00 00       	call   d4abc8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c4e>
  d4a6ab:	e9 08 03 00 00       	jmp    d4a9b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a3e>
  d4a6b0:	e9 ff 02 00 00       	jmp    d4a9b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a3a>
  d4a6b5:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a6b9:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]
  d4a6c0:	00 
  d4a6c1:	48 83 a4 24 60 01 00 	and    QWORD PTR [rsp+0x160],0x0
  d4a6c8:	00 00 
  d4a6ca:	48 85 ff             	test   rdi,rdi
  d4a6cd:	74 06                	je     d4a6d5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1775b>
  d4a6cf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d4a6d2:	ff 50 08             	call   QWORD PTR [rax+0x8]
  d4a6d5:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
  d4a6dc:	00 
  d4a6dd:	e8 c4 04 00 00       	call   d4aba6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c2c>
  d4a6e2:	e9 d1 02 00 00       	jmp    d4a9b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a3e>
  d4a6e7:	e9 c8 02 00 00       	jmp    d4a9b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a3a>

## Last 220 instructions of factory
  d4a6ca:	48 85 ff             	test   rdi,rdi
  d4a6cd:	74 06                	je     d4a6d5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1775b>
  d4a6cf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d4a6d2:	ff 50 08             	call   QWORD PTR [rax+0x8]
  d4a6d5:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
  d4a6dc:	00 
  d4a6dd:	e8 c4 04 00 00       	call   d4aba6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c2c>
  d4a6e2:	e9 d1 02 00 00       	jmp    d4a9b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a3e>
  d4a6e7:	e9 c8 02 00 00       	jmp    d4a9b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a3a>
  d4a6ec:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a6f0:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]
  d4a6f7:	00 
  d4a6f8:	48 83 a4 24 60 01 00 	and    QWORD PTR [rsp+0x160],0x0
  d4a6ff:	00 00 
  d4a701:	48 85 ff             	test   rdi,rdi
  d4a704:	74 06                	je     d4a70c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17792>
  d4a706:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d4a709:	ff 50 08             	call   QWORD PTR [rax+0x8]
  d4a70c:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
  d4a713:	00 
  d4a714:	e8 6b 04 00 00       	call   d4ab84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c0a>
  d4a719:	e9 9a 02 00 00       	jmp    d4a9b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a3e>
  d4a71e:	e9 91 02 00 00       	jmp    d4a9b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a3a>
  d4a723:	e9 8c 02 00 00       	jmp    d4a9b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a3a>
  d4a728:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a72c:	4c 89 ff             	mov    rdi,r15
  d4a72f:	e8 36 f8 d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  d4a734:	eb 04                	jmp    d4a73a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177c0>
  d4a736:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a73a:	4c 89 f7             	mov    rdi,r14
  d4a73d:	e8 4e 37 aa 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  d4a742:	eb 04                	jmp    d4a748 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177ce>
  d4a744:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a748:	48 89 df             	mov    rdi,rbx
  d4a74b:	e8 d0 37 aa 00       	call   17edf20 <_ZdlPv@plt>
  d4a750:	eb 04                	jmp    d4a756 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177dc>
  d4a752:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a756:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  d4a75d:	00 
  d4a75e:	e8 2d 37 aa 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  d4a763:	eb 04                	jmp    d4a769 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177ef>
  d4a765:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a769:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
  d4a770:	00 
  d4a771:	e8 1a 37 aa 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  d4a776:	eb 06                	jmp    d4a77e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17804>
  d4a778:	eb 00                	jmp    d4a77a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17800>
  d4a77a:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a77e:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
  d4a785:	00 
  d4a786:	e8 05 37 aa 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  d4a78b:	e9 28 02 00 00       	jmp    d4a9b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a3e>
  d4a790:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a794:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  d4a79b:	00 
  d4a79c:	e8 c9 f7 d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  d4a7a1:	eb 11                	jmp    d4a7b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1783a>
  d4a7a3:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a7a7:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  d4a7ae:	00 
  d4a7af:	e8 b6 f7 d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  d4a7b4:	49 89 dc             	mov    r12,rbx
  d4a7b7:	49 83 c4 58          	add    r12,0x58
  d4a7bb:	4c 89 ff             	mov    rdi,r15
  d4a7be:	e8 83 6f a7 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
  d4a7c3:	4c 89 e7             	mov    rdi,r12
  d4a7c6:	e8 9d e4 8e 00       	call   1638c68 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33dd6>
  d4a7cb:	4c 89 f7             	mov    rdi,r14
  d4a7ce:	e8 85 d0 ef ff       	call   c47858 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1947f8>
  d4a7d3:	e9 bf 01 00 00       	jmp    d4a997 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a1d>
  d4a7d8:	eb 6c                	jmp    d4a846 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178cc>
  d4a7da:	e9 d5 01 00 00       	jmp    d4a9b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a3a>
  d4a7df:	eb 65                	jmp    d4a846 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178cc>
  d4a7e1:	e9 ce 01 00 00       	jmp    d4a9b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a3a>
  d4a7e6:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a7ea:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  d4a7f1:	00 
  d4a7f2:	e8 73 f7 d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  d4a7f7:	e9 bc 01 00 00       	jmp    d4a9b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a3e>
  d4a7fc:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a800:	48 89 ef             	mov    rdi,rbp
  d4a803:	e8 3e 6f a7 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
  d4a808:	4c 89 ef             	mov    rdi,r13
  d4a80b:	e8 36 6f a7 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
  d4a810:	4c 89 e7             	mov    rdi,r12
  d4a813:	e8 2e 6f a7 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
  d4a818:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  d4a81d:	e8 8c 6e 30 00       	call   10516ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x218ac4>
  d4a822:	4c 89 f7             	mov    rdi,r14
  d4a825:	e8 0e ad d8 ff       	call   ad5538 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x224d8>
  d4a82a:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  d4a82e:	e8 53 3c d5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  d4a833:	eb 04                	jmp    d4a839 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178bf>
  d4a835:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a839:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  d4a840:	00 
  d4a841:	e9 4c 01 00 00       	jmp    d4a992 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a18>
  d4a846:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a84a:	e9 48 01 00 00       	jmp    d4a997 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a1d>
  d4a84f:	e9 60 01 00 00       	jmp    d4a9b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a3a>
  d4a854:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a858:	4c 89 f7             	mov    rdi,r14
  d4a85b:	e8 0a f7 d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  d4a860:	eb 04                	jmp    d4a866 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178ec>
  d4a862:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a866:	48 89 df             	mov    rdi,rbx
  d4a869:	e8 b2 36 aa 00       	call   17edf20 <_ZdlPv@plt>
  d4a86e:	eb 04                	jmp    d4a874 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178fa>
  d4a870:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a874:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  d4a87b:	00 
  d4a87c:	e8 4b 3f d5 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
  d4a881:	e9 32 01 00 00       	jmp    d4a9b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a3e>
  d4a886:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a88a:	4c 89 ef             	mov    rdi,r13
  d4a88d:	e8 4c 37 e3 ff       	call   b7dfde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcaf7e>
  d4a892:	eb 04                	jmp    d4a898 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1791e>
  d4a894:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a898:	48 89 df             	mov    rdi,rbx
  d4a89b:	e8 3e 37 e3 ff       	call   b7dfde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcaf7e>
  d4a8a0:	eb 04                	jmp    d4a8a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1792c>
  d4a8a2:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a8a6:	4c 89 ff             	mov    rdi,r15
  d4a8a9:	e8 30 37 e3 ff       	call   b7dfde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcaf7e>
  d4a8ae:	eb 04                	jmp    d4a8b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1793a>
  d4a8b0:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a8b4:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
  d4a8b9:	e8 1a b1 ec ff       	call   c159d8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162978>
  d4a8be:	eb 04                	jmp    d4a8c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1794a>
  d4a8c0:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a8c4:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
  d4a8cb:	00 
  d4a8cc:	e8 0d 37 e3 ff       	call   b7dfde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcaf7e>
  d4a8d1:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
  d4a8d8:	00 
  d4a8d9:	e8 00 37 e3 ff       	call   b7dfde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcaf7e>
  d4a8de:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
  d4a8e5:	00 
  d4a8e6:	e8 f3 36 e3 ff       	call   b7dfde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcaf7e>
  d4a8eb:	49 8d 9e d0 00 00 00 	lea    rbx,[r14+0xd0]
  d4a8f2:	4d 8d be a0 00 00 00 	lea    r15,[r14+0xa0]
  d4a8f9:	4d 8d 6e 70          	lea    r13,[r14+0x70]
  d4a8fd:	4c 89 f5             	mov    rbp,r14
  d4a900:	48 83 c5 40          	add    rbp,0x40
  d4a904:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
  d4a90b:	00 
  d4a90c:	e8 55 f5 a8 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  d4a911:	48 89 df             	mov    rdi,rbx
  d4a914:	e8 51 f6 d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  d4a919:	4c 89 ff             	mov    rdi,r15
  d4a91c:	e8 49 f6 d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  d4a921:	4c 89 ef             	mov    rdi,r13
  d4a924:	e8 41 f6 d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  d4a929:	48 89 ef             	mov    rdi,rbp
  d4a92c:	e8 39 f6 d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  d4a931:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
  d4a935:	e8 4c 3b d5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  d4a93a:	4c 89 f7             	mov    rdi,r14
  d4a93d:	e8 de 35 aa 00       	call   17edf20 <_ZdlPv@plt>
  d4a942:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  d4a947:	eb 51                	jmp    d4a99a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a20>
  d4a949:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a94d:	eb 82                	jmp    d4a8d1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17957>
  d4a94f:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a953:	eb 89                	jmp    d4a8de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17964>
  d4a955:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a959:	eb df                	jmp    d4a93a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179c0>
  d4a95b:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a95f:	eb e1                	jmp    d4a942 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179c8>
  d4a961:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a965:	4c 89 ff             	mov    rdi,r15
  d4a968:	e8 67 f2 a8 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  d4a96d:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
  d4a972:	e8 5d f2 a8 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  d4a977:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  d4a97c:	e8 b7 ab d8 ff       	call   ad5538 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x224d8>
  d4a981:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
  d4a986:	48 83 20 00          	and    QWORD PTR [rax],0x0
  d4a98a:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
  d4a991:	00 
  d4a992:	e8 a1 ab d8 ff       	call   ad5538 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x224d8>
  d4a997:	48 89 df             	mov    rdi,rbx
  d4a99a:	e8 81 35 aa 00       	call   17edf20 <_ZdlPv@plt>
  d4a99f:	eb 17                	jmp    d4a9b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a3e>
  d4a9a1:	eb 11                	jmp    d4a9b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a3a>
  d4a9a3:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a9a7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  d4a9aa:	48 89 df             	mov    rdi,rbx
  d4a9ad:	ff 50 08             	call   QWORD PTR [rax+0x8]
  d4a9b0:	eb 06                	jmp    d4a9b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a3e>
  d4a9b2:	eb 00                	jmp    d4a9b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a3a>
  d4a9b4:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a9b8:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
  d4a9bf:	00 
  d4a9c0:	e8 a5 f5 d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  d4a9c5:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
  d4a9cc:	00 
  d4a9cd:	e8 98 f5 d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  d4a9d2:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
  d4a9d7:	e8 4c f4 d2 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
  d4a9dc:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
  d4a9e1:	e8 42 f4 d2 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
  d4a9e6:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
  d4a9eb:	e8 8c 01 00 00       	call   d4ab7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c02>
  d4a9f0:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
  d4a9f5:	e8 48 01 00 00       	call   d4ab42 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17bc8>
  d4a9fa:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
  d4a9ff:	e8 24 f4 d2 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
  d4aa04:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  d4aa09:	e8 d6 00 00 00       	call   d4aae4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b6a>
  d4aa0e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  d4aa15:	00 00 
  d4aa17:	48 3b 84 24 a0 01 00 	cmp    rax,QWORD PTR [rsp+0x1a0]
  d4aa1e:	00 
  d4aa1f:	75 13                	jne    d4aa34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aba>
  d4aa21:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
  d4aa26:	e8 f5 34 aa 00       	call   17edf20 <_ZdlPv@plt>
  d4aa2b:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
  d4aa2f:	e8 9c 52 d2 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  d4aa34:	e8 77 50 aa 00       	call   17efab0 <__stack_chk_fail@plt>

## Stores through registers loaded from rsp+0xa0
### load at 0xd4a647: rcx
  d4a64f:	48 89 01             	mov    QWORD PTR [rcx],rax

## Vtable/AP materializations in final 0x500 bytes
  d4a54c:	48 8d 05 e5 83 b4 00 	lea    rax,[rip+0xb483e5]        # 1892938 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xb610>
  d4a5c8:	48 8d 05 91 83 b4 00 	lea    rax,[rip+0xb48391]        # 1892960 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xb638>
