# TimelineAds readiness owner / wrapper interfaces

Known true-branch object graph:
- TimelineAdsSetupImpl factory 0x13524a4 allocates owner size 0x60, AP 0x1867340
- when AdsRuntime+0x1b8 != 0, allocates readiness state size 0x90 and installs it at owner+0x20
- then allocates wrapper size 0x10, AP 0x18678f8, wrapper+8 = readiness-state pointer, installs wrapper at owner+0x10
- exact Skip Ad export ABI later needs a pointer whose vtable +0x140 is this-only and scalar-return

## Address point candidate 0x1867340
- header[-0x10]=0 header[-0x8]=0
- +0x0: 0x1353b66 FDE=(20265830, 20266021)
- +0x8: 0x1353c26 FDE=(20266022, 20266040)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0xac3ae0 FDE=(11287264, 11287269)
- +0x28: 0xaa712a FDE=(11170090, 11170095)
- +0x30: 0xbf7896 FDE=(12548246, 12548251)
- +0x38: 0xaa7018 FDE=(11169816, 11169821)
- +0x40: 0x13539b4 FDE=(20265396, 20265404)
- +0x48: 0x13539bc FDE=(20265404, 20265412)
- +0x50: 0x9d7de0 FDE=(10321376, 10321377)
- +0x58: 0x1353a36 FDE=(20265526, 20265534)
- +0x60: 0x9d7de0 FDE=(10321376, 10321377)
- +0x68: 0x0 FDE=None
- +0x70: 0x0 FDE=None
- +0x78: 0xaae9b2 FDE=(11200946, 11200955)
- +0x80: 0xaae9bc FDE=(11200956, 11200978)
- +0x88: 0x1353c38 FDE=(20266040, 20266070)
- +0x90: 0x9d7de0 FDE=(10321376, 10321377)
- +0x98: 0x1353c56 FDE=(20266070, 20266269)
- +0xa0: 0x1353d1e FDE=(20266270, 20266469)
- +0xa8: 0x1353de6 FDE=(20266470, 20266669)
- +0xb0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc0: 0x1353eae FDE=(20266670, 20266881)
- +0xc8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd0: 0x1353f82 FDE=(20266882, 20267081)
- +0xd8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe0: 0x135404a FDE=(20267082, 20267317)
- +0xe8: 0x1354136 FDE=(20267318, 20267510)
- +0xf0: 0x0 FDE=None
- +0xf8: 0x0 FDE=None
- +0x100: 0xe438d4 FDE=(14956756, 14956779)
- +0x108: 0x13543fc FDE=(20268028, 20268046)
- +0x110: 0x135440e FDE=(20268046, 20268402)
- +0x118: 0x9d7de0 FDE=(10321376, 10321377)
- +0x120: 0x1354572 FDE=(20268402, 20268584)
- +0x128: 0x1354628 FDE=(20268584, 20268766)
- +0x130: 0x13546de FDE=(20268766, 20268960)
- +0x138: 0x9d7de0 FDE=(10321376, 10321377)
- +0x140: 0x13547a0 FDE=(20268960, 20269458)
- +0x148: 0x1354992 FDE=(20269458, 20269676)
- +0x150: 0x9d7de0 FDE=(10321376, 10321377)
- +0x158: 0x1354a6c FDE=(20269676, 20269869)
- +0x160: 0x1354b2e FDE=(20269870, 20270074)
- +0x168: 0x1354bfa FDE=(20270074, 20270277)
- +0x170: 0x1354cc6 FDE=(20270278, 20270328)
- +0x178: 0x0 FDE=None
### slot +0x0 target 0x1353b66
FDE=(20265830, 20266021)
     1353b66:	41 56                	push   r14
     1353b68:	53                   	push   rbx
     1353b69:	48 83 ec 28          	sub    rsp,0x28
     1353b6d:	48 89 fb             	mov    rbx,rdi
     1353b70:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1353b77:	00 00 
     1353b79:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     1353b7e:	48 8d 05 bb 37 51 00 	lea    rax,[rip+0x5137bb]        # 1867340 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23a28>
     1353b85:	48 89 07             	mov    QWORD PTR [rdi],rax
     1353b88:	48 8b 7f 58          	mov    rdi,QWORD PTR [rdi+0x58]
     1353b8c:	48 85 ff             	test   rdi,rdi
     1353b8f:	74 23                	je     1353bb4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199138>
     1353b91:	0f 57 c0             	xorps  xmm0,xmm0
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
     1353c00:	48 89 df             	mov    rdi,rbx
     1353c03:	e8 20 62 72 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1353c08:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1353c0f:	00 00 
     1353c11:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     1353c16:	75 08                	jne    1353c20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1991a4>
     1353c18:	48 83 c4 28          	add    rsp,0x28
     1353c1c:	5b                   	pop    rbx
     1353c1d:	41 5e                	pop    r14
     1353c1f:	c3                   	ret
     1353c20:	e8 8b be 49 00       	call   17efab0 <__stack_chk_fail@plt>
### slot +0x8 target 0x1353c26
FDE=(20266022, 20266040)
     1353c26:	53                   	push   rbx
     1353c27:	48 89 fb             	mov    rbx,rdi
     1353c2a:	e8 37 ff ff ff       	call   1353b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1990ea>
     1353c2f:	48 89 df             	mov    rdi,rbx
     1353c32:	5b                   	pop    rbx
     1353c33:	e9 e8 a2 49 00       	jmp    17edf20 <_ZdlPv@plt>
### slot +0x10 target 0x9d7de0
FDE=(10321376, 10321377)
      9d7de0:	c3                   	ret
### slot +0x18 target 0x9d7de0
FDE=(10321376, 10321377)
      9d7de0:	c3                   	ret
### slot +0x20 target 0xac3ae0
FDE=(11287264, 11287269)
      ac3ae0:	c6 47 08 00          	mov    BYTE PTR [rdi+0x8],0x0
      ac3ae4:	c3                   	ret
### slot +0x28 target 0xaa712a
FDE=(11170090, 11170095)
      aa712a:	48 8b 47 50          	mov    rax,QWORD PTR [rdi+0x50]
      aa712e:	c3                   	ret
### slot +0x98 target 0x1353c56
FDE=(20266070, 20266269)
     1353c56:	41 57                	push   r15
     1353c58:	41 56                	push   r14
     1353c5a:	53                   	push   rbx
     1353c5b:	48 81 ec c0 00 00 00 	sub    rsp,0xc0
     1353c62:	4c 89 c3             	mov    rbx,r8
     1353c65:	49 89 fe             	mov    r14,rdi
     1353c68:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1353c6f:	00 00 
     1353c71:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     1353c78:	00 
     1353c79:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
     1353c7e:	4c 89 ff             	mov    rdi,r15
     1353c81:	48 89 d6             	mov    rsi,rdx
     1353c84:	4c 89 c2             	mov    rdx,r8
     1353c87:	e8 6a 05 00 00       	call   13541f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19977a>
     1353c8c:	0f 10 83 80 00 00 00 	movups xmm0,XMMWORD PTR [rbx+0x80]
     1353c93:	48 8d 94 24 a0 00 00 	lea    rdx,[rsp+0xa0]
     1353c9a:	00 
     1353c9b:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
     1353c9e:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
     1353ca2:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
     1353ca7:	48 89 01             	mov    QWORD PTR [rcx],rax
     1353caa:	c6 41 08 01          	mov    BYTE PTR [rcx+0x8],0x1
     1353cae:	0f 10 43 10          	movups xmm0,XMMWORD PTR [rbx+0x10]
     1353cb2:	49 89 e0             	mov    r8,rsp
     1353cb5:	41 0f 29 00          	movaps XMMWORD PTR [r8],xmm0
     1353cb9:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     1353cbd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1353cc0:	4c 89 fe             	mov    rsi,r15
     1353cc3:	ff 50 30             	call   QWORD PTR [rax+0x30]
     1353cc6:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1353ccb:	e8 d4 06 00 00       	call   13543a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199928>
     1353cd0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1353cd7:	00 00 
     1353cd9:	48 3b 84 24 b8 00 00 	cmp    rax,QWORD PTR [rsp+0xb8]
     1353ce0:	00 
     1353ce1:	75 35                	jne    1353d18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19929c>
     1353ce3:	48 81 c4 c0 00 00 00 	add    rsp,0xc0
     1353cea:	5b                   	pop    rbx
     1353ceb:	41 5e                	pop    r14
     1353ced:	41 5f                	pop    r15
     1353cef:	c3                   	ret
     1353cf0:	48 89 c3             	mov    rbx,rax
     1353cf3:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1353cf8:	e8 a7 06 00 00       	call   13543a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199928>
     1353cfd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1353d04:	00 00 
     1353d06:	48 3b 84 24 b8 00 00 	cmp    rax,QWORD PTR [rsp+0xb8]
     1353d0d:	00 
     1353d0e:	75 08                	jne    1353d18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19929c>
     1353d10:	48 89 df             	mov    rdi,rbx
     1353d13:	e8 b8 bf 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1353d18:	e8 93 bd 49 00       	call   17efab0 <__stack_chk_fail@plt>
### slot +0x128 target 0x1354628
FDE=(20268584, 20268766)
     1354628:	41 56                	push   r14
     135462a:	53                   	push   rbx
     135462b:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
     1354632:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1354639:	00 00 
     135463b:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
     1354642:	00 
     1354643:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
     1354647:	49 8b 78 08          	mov    rdi,QWORD PTR [r8+0x8]
     135464b:	48 8d 44 24 10       	lea    rax,[rsp+0x10]
     1354650:	48 89 38             	mov    QWORD PTR [rax],rdi
     1354653:	c6 40 08 01          	mov    BYTE PTR [rax+0x8],0x1
     1354657:	4d 8d 48 10          	lea    r9,[r8+0x10]
     135465b:	31 ff                	xor    edi,edi
     135465d:	4c 8d 44 24 08       	lea    r8,[rsp+0x8]
     1354662:	41 88 38             	mov    BYTE PTR [r8],dil
     1354665:	41 88 78 04          	mov    BYTE PTR [r8+0x4],dil
     1354669:	4c 89 04 24          	mov    QWORD PTR [rsp],r8
     135466d:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     1354672:	4c 89 f7             	mov    rdi,r14
     1354675:	49 89 c0             	mov    r8,rax
     1354678:	e8 7b 06 00 00       	call   1354cf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a27c>
     135467d:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1354680:	48 89 df             	mov    rdi,rbx
     1354683:	4c 89 f6             	mov    rsi,r14
     1354686:	ff 50 40             	call   QWORD PTR [rax+0x40]
     1354689:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     135468e:	e8 27 08 00 00       	call   1354eba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a43e>
     1354693:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135469a:	00 00 
     135469c:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
     13546a3:	00 
     13546a4:	75 33                	jne    13546d9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199c5d>
     13546a6:	48 81 c4 f8 00 00 00 	add    rsp,0xf8
     13546ad:	5b                   	pop    rbx
     13546ae:	41 5e                	pop    r14
     13546b0:	c3                   	ret
     13546b1:	48 89 c3             	mov    rbx,rax
     13546b4:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     13546b9:	e8 fc 07 00 00       	call   1354eba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a43e>
     13546be:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13546c5:	00 00 
     13546c7:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
     13546ce:	00 
     13546cf:	75 08                	jne    13546d9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199c5d>
     13546d1:	48 89 df             	mov    rdi,rbx
     13546d4:	e8 f7 b5 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     13546d9:	e8 d2 b3 49 00       	call   17efab0 <__stack_chk_fail@plt>
### slot +0x140 target 0x13547a0
FDE=(20268960, 20269458)
     13547a0:	41 57                	push   r15
     13547a2:	41 56                	push   r14
     13547a4:	41 55                	push   r13
     13547a6:	41 54                	push   r12
     13547a8:	53                   	push   rbx
     13547a9:	48 81 ec 60 01 00 00 	sub    rsp,0x160
     13547b0:	4c 8b b4 24 90 01 00 	mov    r14,QWORD PTR [rsp+0x190]
     13547b7:	00 
     13547b8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13547bf:	00 00 
     13547c1:	48 89 84 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rax
     13547c8:	00 
     13547c9:	4d 85 f6             	test   r14,r14
     13547cc:	0f 84 32 01 00 00    	je     1354904 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199e88>
     13547d2:	41 83 be 90 02 00 00 	cmp    DWORD PTR [r14+0x290],0x0
     13547d9:	00 
     13547da:	0f 85 24 01 00 00    	jne    1354904 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199e88>
     13547e0:	41 80 be 80 00 00 00 	cmp    BYTE PTR [r14+0x80],0x0
     13547e7:	00 
     13547e8:	0f 85 16 01 00 00    	jne    1354904 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199e88>
     13547ee:	48 89 fb             	mov    rbx,rdi
     13547f1:	8b 84 24 98 01 00 00 	mov    eax,DWORD PTR [rsp+0x198]
     13547f8:	49 8b 79 08          	mov    rdi,QWORD PTR [r9+0x8]
     13547fc:	4c 8d 44 24 10       	lea    r8,[rsp+0x10]
     1354801:	49 89 38             	mov    QWORD PTR [r8],rdi
     1354804:	40 b7 01             	mov    dil,0x1
     1354807:	41 88 78 08          	mov    BYTE PTR [r8+0x8],dil
     135480b:	49 83 c1 10          	add    r9,0x10
     135480f:	4c 8d 94 24 80 00 00 	lea    r10,[rsp+0x80]
     1354816:	00 
     1354817:	41 89 02             	mov    DWORD PTR [r10],eax
     135481a:	41 88 7a 04          	mov    BYTE PTR [r10+0x4],dil
     135481e:	4c 89 14 24          	mov    QWORD PTR [rsp],r10
     1354822:	4c 8d bc 24 88 00 00 	lea    r15,[rsp+0x88]
     1354829:	00 
     135482a:	4c 89 ff             	mov    rdi,r15
     135482d:	e8 c6 04 00 00       	call   1354cf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a27c>
     1354832:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     1354836:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1354839:	4c 89 fe             	mov    rsi,r15
     135483c:	ff 50 30             	call   QWORD PTR [rax+0x30]
     135483f:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
     1354846:	00 
     1354847:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     135484c:	e8 ef 96 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1354851:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]
     1354856:	48 8d b4 24 c0 00 00 	lea    rsi,[rsp+0xc0]
     135485d:	00 
     135485e:	4c 89 ff             	mov    rdi,r15
     1354861:	e8 da 96 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1354866:	48 8d b4 24 e0 00 00 	lea    rsi,[rsp+0xe0]
     135486d:	00 
     135486e:	8a 46 f8             	mov    al,BYTE PTR [rsi-0x8]
     1354871:	4c 8d 6c 24 48       	lea    r13,[rsp+0x48]
     1354876:	41 88 45 f8          	mov    BYTE PTR [r13-0x8],al
     135487a:	4c 89 ef             	mov    rdi,r13
     135487d:	e8 be 96 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1354882:	4c 8d 64 24 60       	lea    r12,[rsp+0x60]
     1354887:	48 8d b4 24 f8 00 00 	lea    rsi,[rsp+0xf8]
     135488e:	00 
     135488f:	4c 89 e7             	mov    rdi,r12
     1354892:	e8 cf 7e 77 ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
     1354897:	4c 89 f7             	mov    rdi,r14
     135489a:	e8 36 fb ff ff       	call   13543d5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199959>
     135489f:	49 83 c6 68          	add    r14,0x68
     13548a3:	4c 89 e7             	mov    rdi,r12
     13548a6:	4c 89 f6             	mov    rsi,r14
     13548a9:	e8 8c da 7a ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
     13548ae:	48 8d 35 53 48 0e ff 	lea    rsi,[rip+0xffffffffff0e4853]        # 439108 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb57>
     13548b5:	4c 89 e7             	mov    rdi,r12
     13548b8:	e8 5b 5d ac ff       	call   e1a618 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe769e>
     13548bd:	84 c0                	test   al,al
     13548bf:	74 15                	je     13548d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199e5a>
     13548c1:	80 7b 30 00          	cmp    BYTE PTR [rbx+0x30],0x0
     13548c5:	74 0f                	je     13548d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199e5a>
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
    ...truncated...

## Address point candidate 0x18678f8
- header[-0x10]=0 header[-0x8]=0
- +0x0: 0x9d7de0 FDE=(10321376, 10321377)
- +0x8: 0xa50370 FDE=(10814320, 10814325)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0x9d7de0 FDE=(10321376, 10321377)
- +0x28: 0x9d7de0 FDE=(10321376, 10321377)
- +0x30: 0x9d7de0 FDE=(10321376, 10321377)
- +0x38: 0x9d7de0 FDE=(10321376, 10321377)
- +0x40: 0x1359a4c FDE=(20290124, 20290767)
- +0x48: 0x1359cd0 FDE=(20290768, 20290792)
- +0x50: 0x9d7de0 FDE=(10321376, 10321377)
- +0x58: 0x9d7de0 FDE=(10321376, 10321377)
- +0x60: 0x9d7de0 FDE=(10321376, 10321377)
- +0x68: 0x9d7de0 FDE=(10321376, 10321377)
- +0x70: 0x1359ce8 FDE=(20290792, 20291115)
- +0x78: 0x0 FDE=None
- +0x80: 0x0 FDE=None
- +0x88: 0x1359f1a FDE=(20291354, 20291473)
- +0x90: 0x1359f92 FDE=(20291474, 20291492)
- +0x98: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb8: 0x1359fa4 FDE=(20291492, 20291865)
- +0xc0: 0x135a11a FDE=(20291866, 20291871)
- +0xc8: 0x135a120 FDE=(20291872, 20291981)
- +0xd0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd8: 0x135a18e FDE=(20291982, 20292000)
- +0xe0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xf0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xf8: 0x9d7de0 FDE=(10321376, 10321377)
- +0x100: 0x9d7de0 FDE=(10321376, 10321377)
- +0x108: 0x9d7de0 FDE=(10321376, 10321377)
- +0x110: 0x9d7de0 FDE=(10321376, 10321377)
- +0x118: 0x135a49a FDE=(20292762, 20292778)
- +0x120: 0xa3fa60 FDE=(10746464, 10746467)
- +0x128: 0xa3fa60 FDE=(10746464, 10746467)
- +0x130: 0xa3fa60 FDE=(10746464, 10746467)
- +0x138: 0xa3fa60 FDE=(10746464, 10746467)
- +0x140: 0xa3fa60 FDE=(10746464, 10746467)
- +0x148: 0x135a49a FDE=(20292762, 20292778)
- +0x150: 0xa3fa60 FDE=(10746464, 10746467)
- +0x158: 0xa3fa60 FDE=(10746464, 10746467)
- +0x160: 0xa3fa60 FDE=(10746464, 10746467)
- +0x168: 0xa3fa60 FDE=(10746464, 10746467)
- +0x170: 0xa3fa60 FDE=(10746464, 10746467)
- +0x178: 0xa3fa60 FDE=(10746464, 10746467)
### slot +0x0 target 0x9d7de0
FDE=(10321376, 10321377)
      9d7de0:	c3                   	ret
### slot +0x8 target 0xa50370
FDE=(10814320, 10814325)
      a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>
### slot +0x10 target 0x9d7de0
FDE=(10321376, 10321377)
      9d7de0:	c3                   	ret
### slot +0x18 target 0x9d7de0
FDE=(10321376, 10321377)
      9d7de0:	c3                   	ret
### slot +0x20 target 0x9d7de0
FDE=(10321376, 10321377)
      9d7de0:	c3                   	ret
### slot +0x28 target 0x9d7de0
FDE=(10321376, 10321377)
      9d7de0:	c3                   	ret
### slot +0x70 target 0x1359ce8
FDE=(20290792, 20291115)
     1359ce8:	41 57                	push   r15
     1359cea:	41 56                	push   r14
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
     1359d49:	49 89 c7             	mov    r15,rax
     1359d4c:	83 b8 90 02 00 00 00 	cmp    DWORD PTR [rax+0x290],0x0
     1359d53:	0f 85 80 00 00 00    	jne    1359dd9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f35d>
     1359d59:	41 80 7f 60 00       	cmp    BYTE PTR [r15+0x60],0x0
     1359d5e:	74 79                	je     1359dd9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f35d>
     1359d60:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
     1359d64:	48 89 df             	mov    rdi,rbx
     1359d67:	e8 a1 78 1f 00       	call   155160d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396b91>
     1359d6c:	49 83 c7 48          	add    r15,0x48
     1359d70:	4c 89 f7             	mov    rdi,r14
     1359d73:	4c 89 fe             	mov    rsi,r15
     1359d76:	48 89 c2             	mov    rdx,rax
     1359d79:	31 c9                	xor    ecx,ecx
     1359d7b:	e8 da 21 0e 00       	call   143bf5a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2814de>
     1359d80:	eb 57                	jmp    1359dd9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f35d>
     1359d82:	83 bb 90 02 00 00 00 	cmp    DWORD PTR [rbx+0x290],0x0
     1359d89:	75 58                	jne    1359de3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f367>
     1359d8b:	80 7b 60 00          	cmp    BYTE PTR [rbx+0x60],0x0
     1359d8f:	74 52                	je     1359de3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f367>
     1359d91:	48 89 df             	mov    rdi,rbx
     1359d94:	e8 9e 77 1f 00       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     1359d99:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
     1359d9e:	4c 89 e7             	mov    rdi,r12
     1359da1:	48 89 c6             	mov    rsi,rax
     1359da4:	e8 a7 28 d3 ff       	call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>
     1359da9:	4c 89 ff             	mov    rdi,r15
     1359dac:	4c 89 e6             	mov    rsi,r12
     1359daf:	e8 ea ab 1f 00       	call   155499e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x399f22>
     1359db4:	48 85 c0             	test   rax,rax
     1359db7:	74 20                	je     1359dd9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f35d>
     1359db9:	83 b8 90 02 00 00 00 	cmp    DWORD PTR [rax+0x290],0x0
     1359dc0:	75 17                	jne    1359dd9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f35d>
     1359dc2:	48 83 c3 48          	add    rbx,0x48
     1359dc6:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
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
     1359e21:	e8 aa 5e 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1359e26:	e8 85 5c 49 00       	call   17efab0 <__stack_chk_fail@plt>
### slot +0x98 target 0x9d7de0
FDE=(10321376, 10321377)
      9d7de0:	c3                   	ret
### slot +0x128 target 0xa3fa60
FDE=(10746464, 10746467)
      a3fa60:	b0 01                	mov    al,0x1
      a3fa62:	c3                   	ret
### slot +0x140 target 0xa3fa60
FDE=(10746464, 10746467)
      a3fa60:	b0 01                	mov    al,0x1
      a3fa62:	c3                   	ret

## Address point candidate 0x1867870
- header[-0x10]=0 header[-0x8]=0
- +0x0: 0xe438d4 FDE=(14956756, 14956779)
- +0x8: 0x13543fc FDE=(20268028, 20268046)
- +0x10: 0x1359842 FDE=(20289602, 20289803)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0x9d7de0 FDE=(10321376, 10321377)
- +0x28: 0x9d7de0 FDE=(10321376, 10321377)
- +0x30: 0x135990c FDE=(20289804, 20289828)
- +0x38: 0x9d7de0 FDE=(10321376, 10321377)
- +0x40: 0x1359924 FDE=(20289828, 20290124)
- +0x48: 0x9d7de0 FDE=(10321376, 10321377)
- +0x50: 0x9d7de0 FDE=(10321376, 10321377)
- +0x58: 0x9d7de0 FDE=(10321376, 10321377)
- +0x60: 0x9d7de0 FDE=(10321376, 10321377)
- +0x68: 0x9d7de0 FDE=(10321376, 10321377)
- +0x70: 0x9d7de0 FDE=(10321376, 10321377)
- +0x78: 0x0 FDE=None
- +0x80: 0x0 FDE=None
- +0x88: 0x9d7de0 FDE=(10321376, 10321377)
- +0x90: 0xa50370 FDE=(10814320, 10814325)
- +0x98: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc8: 0x1359a4c FDE=(20290124, 20290767)
- +0xd0: 0x1359cd0 FDE=(20290768, 20290792)
- +0xd8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xf0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xf8: 0x1359ce8 FDE=(20290792, 20291115)
- +0x100: 0x0 FDE=None
- +0x108: 0x0 FDE=None
- +0x110: 0x1359f1a FDE=(20291354, 20291473)
- +0x118: 0x1359f92 FDE=(20291474, 20291492)
- +0x120: 0x9d7de0 FDE=(10321376, 10321377)
- +0x128: 0x9d7de0 FDE=(10321376, 10321377)
- +0x130: 0x9d7de0 FDE=(10321376, 10321377)
- +0x138: 0x9d7de0 FDE=(10321376, 10321377)
- +0x140: 0x1359fa4 FDE=(20291492, 20291865)
- +0x148: 0x135a11a FDE=(20291866, 20291871)
- +0x150: 0x135a120 FDE=(20291872, 20291981)
- +0x158: 0x9d7de0 FDE=(10321376, 10321377)
- +0x160: 0x135a18e FDE=(20291982, 20292000)
- +0x168: 0x9d7de0 FDE=(10321376, 10321377)
- +0x170: 0x9d7de0 FDE=(10321376, 10321377)
- +0x178: 0x9d7de0 FDE=(10321376, 10321377)
### slot +0x0 target 0xe438d4
FDE=(14956756, 14956779)
      e438d4:	53                   	push   rbx
      e438d5:	48 89 fb             	mov    rbx,rdi
      e438d8:	48 83 c7 18          	add    rdi,0x18
      e438dc:	e8 af a5 9a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e438e1:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      e438e5:	5b                   	pop    rbx
      e438e6:	e9 9b ab c5 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
### slot +0x8 target 0x13543fc
FDE=(20268028, 20268046)
     13543fc:	53                   	push   rbx
     13543fd:	48 89 fb             	mov    rbx,rdi
     1354400:	e8 cf f4 ae ff       	call   e438d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xacea>
     1354405:	48 89 df             	mov    rdi,rbx
     1354408:	5b                   	pop    rbx
     1354409:	e9 12 9b 49 00       	jmp    17edf20 <_ZdlPv@plt>
### slot +0x10 target 0x1359842
FDE=(20289602, 20289803)
     1359842:	41 57                	push   r15
     1359844:	41 56                	push   r14
     1359846:	53                   	push   rbx
     1359847:	48 83 ec 20          	sub    rsp,0x20
     135984b:	48 89 f3             	mov    rbx,rsi
     135984e:	49 89 fe             	mov    r14,rdi
     1359851:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1359858:	00 00 
     135985a:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     135985f:	48 81 c3 20 02 00 00 	add    rbx,0x220
     1359866:	4c 8d 7f 18          	lea    r15,[rdi+0x18]
     135986a:	4c 89 ff             	mov    rdi,r15
     135986d:	48 89 de             	mov    rsi,rbx
     1359870:	e8 79 5e 74 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     1359875:	84 c0                	test   al,al
     1359877:	75 1a                	jne    1359893 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ee17>
     1359879:	41 c6 46 30 00       	mov    BYTE PTR [r14+0x30],0x0
     135987e:	4c 89 ff             	mov    rdi,r15
     1359881:	48 89 de             	mov    rsi,rbx
     1359884:	e8 f7 47 49 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     1359889:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     135988d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1359890:	ff 50 40             	call   QWORD PTR [rax+0x40]
     1359893:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
     1359897:	48 8d 35 de 86 0f ff 	lea    rsi,[rip+0xffffffffff0f86de]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     135989e:	49 89 e7             	mov    r15,rsp
     13598a1:	4c 89 ff             	mov    rdi,r15
     13598a4:	e8 d5 01 72 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     13598a9:	49 8b 06             	mov    rax,QWORD PTR [r14]
     13598ac:	48 8d 35 55 f8 0d ff 	lea    rsi,[rip+0xffffffffff0df855]        # 439108 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb57>
     13598b3:	4c 89 f7             	mov    rdi,r14
     13598b6:	48 89 da             	mov    rdx,rbx
     13598b9:	31 c9                	xor    ecx,ecx
     13598bb:	4d 89 f8             	mov    r8,r15
     13598be:	ff 50 10             	call   QWORD PTR [rax+0x10]
     13598c1:	48 89 e7             	mov    rdi,rsp
     13598c4:	e8 c7 45 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     13598c9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13598d0:	00 00 
     13598d2:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     13598d7:	75 2d                	jne    1359906 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ee8a>
     13598d9:	48 83 c4 20          	add    rsp,0x20
     13598dd:	5b                   	pop    rbx
     13598de:	41 5e                	pop    r14
     13598e0:	41 5f                	pop    r15
     13598e2:	c3                   	ret
     13598e3:	48 89 c3             	mov    rbx,rax
     13598e6:	48 89 e7             	mov    rdi,rsp
     13598e9:	e8 a2 45 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     13598ee:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13598f5:	00 00 
     13598f7:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     13598fc:	75 08                	jne    1359906 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ee8a>
     13598fe:	48 89 df             	mov    rdi,rbx
     1359901:	e8 ca 63 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1359906:	e8 a5 61 49 00       	call   17efab0 <__stack_chk_fail@plt>
### slot +0x18 target 0x9d7de0
FDE=(10321376, 10321377)
      9d7de0:	c3                   	ret
### slot +0x20 target 0x9d7de0
FDE=(10321376, 10321377)
      9d7de0:	c3                   	ret
### slot +0x28 target 0x9d7de0
FDE=(10321376, 10321377)
      9d7de0:	c3                   	ret
### slot +0x70 target 0x9d7de0
FDE=(10321376, 10321377)
      9d7de0:	c3                   	ret
### slot +0x98 target 0x9d7de0
FDE=(10321376, 10321377)
      9d7de0:	c3                   	ret
### slot +0x128 target 0x9d7de0
FDE=(10321376, 10321377)
      9d7de0:	c3                   	ret
### slot +0x140 target 0x1359fa4
FDE=(20291492, 20291865)
     1359fa4:	55                   	push   rbp
     1359fa5:	41 57                	push   r15
     1359fa7:	41 56                	push   r14
     1359fa9:	41 55                	push   r13
     1359fab:	41 54                	push   r12
     1359fad:	53                   	push   rbx
     1359fae:	48 81 ec 28 01 00 00 	sub    rsp,0x128
     1359fb5:	49 89 f6             	mov    r14,rsi
     1359fb8:	48 89 fb             	mov    rbx,rdi
     1359fbb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1359fc2:	00 00 
     1359fc4:	48 89 84 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rax
     1359fcb:	00 
     1359fcc:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1359fd1:	48 89 ce             	mov    rsi,rcx
     1359fd4:	e8 7b c4 ff ff       	call   1356454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b9d8>
     1359fd9:	4c 8d 6b 30          	lea    r13,[rbx+0x30]
     1359fdd:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
     1359fe1:	4c 89 ed             	mov    rbp,r13
     1359fe4:	4d 89 ec             	mov    r12,r13
     1359fe7:	48 85 c0             	test   rax,rax
     1359fea:	74 43                	je     135a02f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f5b3>
     1359fec:	49 89 c4             	mov    r12,rax
     1359fef:	4c 8d 78 20          	lea    r15,[rax+0x20]
     1359ff3:	4c 89 f7             	mov    rdi,r14
     1359ff6:	4c 89 fe             	mov    rsi,r15
     1359ff9:	e8 b4 03 00 00       	call   135a3b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f936>
     1359ffe:	84 c0                	test   al,al
     135a000:	78 1f                	js     135a021 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f5a5>
     135a002:	4c 89 ff             	mov    rdi,r15
     135a005:	4c 89 f6             	mov    rsi,r14
     135a008:	e8 a5 03 00 00       	call   135a3b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f936>
     135a00d:	84 c0                	test   al,al
     135a00f:	0f 89 99 00 00 00    	jns    135a0ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f632>
     135a015:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]
     135a01a:	48 85 c0             	test   rax,rax
     135a01d:	75 cd                	jne    1359fec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f570>
     135a01f:	eb 09                	jmp    135a02a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f5ae>
     135a021:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     135a025:	4c 89 e5             	mov    rbp,r12
     135a028:	eb bd                	jmp    1359fe7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f56b>
     135a02a:	49 8d 6c 24 08       	lea    rbp,[r12+0x8]
     135a02f:	bf 78 01 00 00       	mov    edi,0x178
     135a034:	e8 c7 3e 49 00       	call   17edf00 <_Znwm@plt>
     135a039:	49 89 c7             	mov    r15,rax
     135a03c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     135a041:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
     135a046:	c6 44 24 18 00       	mov    BYTE PTR [rsp+0x18],0x0
     135a04b:	48 8d 78 20          	lea    rdi,[rax+0x20]
     135a04f:	4c 89 f6             	mov    rsi,r14
     135a052:	e8 6d 59 d5 ff       	call   10af9c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x276dda>
     135a057:	4c 89 ff             	mov    rdi,r15
     135a05a:	48 83 c7 78          	add    rdi,0x78
     135a05e:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     135a063:	e8 42 d3 ff ff       	call   13573aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c92e>
     135a068:	c6 44 24 18 01       	mov    BYTE PTR [rsp+0x18],0x1
     135a06d:	0f 57 c0             	xorps  xmm0,xmm0
     135a070:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
     135a074:	4d 89 67 10          	mov    QWORD PTR [r15+0x10],r12
     135a078:	4c 89 7d 00          	mov    QWORD PTR [rbp+0x0],r15
     135a07c:	48 8b 43 28          	mov    rax,QWORD PTR [rbx+0x28]
     135a080:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135a083:	48 85 c0             	test   rax,rax
     135a086:	74 08                	je     135a090 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f614>
     135a088:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
     135a08c:	4c 8b 7d 00          	mov    r15,QWORD PTR [rbp+0x0]
     135a090:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
     135a094:	4c 89 fe             	mov    rsi,r15
     135a097:	e8 82 ff 74 ff       	call   aaa01e <JNI_OnUnload@@Base+0x318eb>
     135a09c:	48 ff 43 38          	inc    QWORD PTR [rbx+0x38]
     135a0a0:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     135a0a5:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     135a0a9:	e8 96 03 00 00       	call   135a444 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f9c8>
     135a0ae:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     135a0b3:	e8 d6 c4 ff ff       	call   135658e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bb12>
     135a0b8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135a0bf:	00 00 
     135a0c1:	48 3b 84 24 20 01 00 	cmp    rax,QWORD PTR [rsp+0x120]
     135a0c8:	00 
     135a0c9:	75 49                	jne    135a114 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f698>
     135a0cb:	48 81 c4 28 01 00 00 	add    rsp,0x128
     135a0d2:	5b                   	pop    rbx
     135a0d3:	41 5c                	pop    r12
     135a0d5:	41 5d                	pop    r13
     135a0d7:	41 5e                	pop    r14
     135a0d9:	41 5f                	pop    r15
     135a0db:	5d                   	pop    rbp
     135a0dc:	c3                   	ret
     135a0dd:	48 89 c3             	mov    rbx,rax
     135a0e0:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
    ...truncated...

## Address point candidate 0x1871558
- header[-0x10]=0 header[-0x8]=0
- +0x0: 0x9d7de0 FDE=(10321376, 10321377)
- +0x8: 0xa50370 FDE=(10814320, 10814325)
- +0x10: 0x143b7ae FDE=(21215150, 21216006)
- +0x18: 0x0 FDE=None
- +0x20: 0x0 FDE=None
- +0x28: 0x143d498 FDE=(21222552, 21222571)
- +0x30: 0x143d4ac FDE=(21222572, 21222590)
- +0x38: 0x143d4be FDE=(21222590, 21222750)
- +0x40: 0x143d55e FDE=(21222750, 21222776)
- +0x48: 0xce39ae FDE=(13515182, 13515191)
- +0x50: 0xc9701c FDE=(13201436, 13201458)
- +0x58: 0x143d578 FDE=(21222776, 21223611)
- +0x60: 0x0 FDE=None
- +0x68: 0x0 FDE=None
- +0x70: 0x9d7de0 FDE=(10321376, 10321377)
- +0x78: 0xa50370 FDE=(10814320, 10814325)
- +0x80: 0x143dfec FDE=(21225452, 21225463)
- +0x88: 0x143dfec FDE=(21225452, 21225463)
- +0x90: 0x143dff8 FDE=(21225464, 21225475)
- +0x98: 0x143e004 FDE=(21225476, 21225487)
- +0xa0: 0x143e010 FDE=(21225488, 21225499)
- +0xa8: 0x143e01c FDE=(21225500, 21225511)
- +0xb0: 0x0 FDE=None
- +0xb8: 0x0 FDE=None
- +0xc0: 0x0 FDE=None
- +0xc8: 0xa0da20 FDE=(10541600, 10541618)
- +0xd0: 0x143e1d8 FDE=(21225944, 21225952)
- +0xd8: 0x0 FDE=None
- +0xe0: 0x0 FDE=None
- +0xe8: 0x0 FDE=None
- +0xf0: 0x143e1e0 FDE=(21225952, 21226080)
- +0xf8: 0x0 FDE=None
- +0x100: 0x0 FDE=None
- +0x108: 0x143e260 FDE=(21226080, 21226089)
- +0x110: 0x143e26a FDE=(21226090, 21226112)
- +0x118: 0x143e280 FDE=(21226112, 21226276)
- +0x120: 0x143e324 FDE=(21226276, 21226441)
- +0x128: 0x143e3ca FDE=(21226442, 21226606)
- +0x130: 0x143e46e FDE=(21226606, 21226771)
- +0x138: 0x143e514 FDE=(21226772, 21227562)
- +0x140: 0x143e82a FDE=(21227562, 21229178)
- +0x148: 0x143ee7a FDE=(21229178, 21230016)
- +0x150: 0x0 FDE=None
- +0x158: 0x0 FDE=None
- +0x160: 0x143f4f6 FDE=(21230838, 21230853)
- +0x168: 0x143f506 FDE=(21230854, 21230872)
- +0x170: 0xc6754a FDE=(13006154, 13006163)
- +0x178: 0x0 FDE=None
### slot +0x0 target 0x9d7de0
FDE=(10321376, 10321377)
      9d7de0:	c3                   	ret
### slot +0x8 target 0xa50370
FDE=(10814320, 10814325)
      a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>
### slot +0x10 target 0x143b7ae
FDE=(21215150, 21216006)
     143b7ae:	55                   	push   rbp
     143b7af:	41 57                	push   r15
     143b7b1:	41 56                	push   r14
     143b7b3:	41 55                	push   r13
     143b7b5:	41 54                	push   r12
     143b7b7:	53                   	push   rbx
     143b7b8:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
     143b7bf:	4d 89 c5             	mov    r13,r8
     143b7c2:	49 89 d6             	mov    r14,rdx
     143b7c5:	49 89 f4             	mov    r12,rsi
     143b7c8:	48 89 fb             	mov    rbx,rdi
     143b7cb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143b7d2:	00 00 
     143b7d4:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
     143b7db:	00 
     143b7dc:	e8 85 04 00 00       	call   143bc66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2811ea>
     143b7e1:	49 8b 6c 24 10       	mov    rbp,QWORD PTR [r12+0x10]
     143b7e6:	4c 8d 7c 24 68       	lea    r15,[rsp+0x68]
     143b7eb:	4d 89 67 f8          	mov    QWORD PTR [r15-0x8],r12
     143b7ef:	4c 89 ff             	mov    rdi,r15
     143b7f2:	4c 89 f6             	mov    rsi,r14
     143b7f5:	e8 46 27 3b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     143b7fa:	4c 8d a4 24 80 00 00 	lea    r12,[rsp+0x80]
     143b801:	00 
     143b802:	4c 89 e7             	mov    rdi,r12
     143b805:	4c 89 ee             	mov    rsi,r13
     143b808:	e8 c5 e6 ff ff       	call   1439ed2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27f456>
     143b80d:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
     143b811:	0f 10 03             	movups xmm0,XMMWORD PTR [rbx]
     143b814:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
     143b81a:	48 85 c0             	test   rax,rax
     143b81d:	74 05                	je     143b824 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280da8>
     143b81f:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     143b824:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     143b82b:	00 00 
     143b82d:	48 83 a4 24 c0 00 00 	and    QWORD PTR [rsp+0xc0],0x0
     143b834:	00 00 
     143b836:	6a 50                	push   0x50
     143b838:	5f                   	pop    rdi
     143b839:	e8 c2 26 3b 00       	call   17edf00 <_Znwm@plt>
     143b83e:	49 89 c5             	mov    r13,rax
     143b841:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     143b846:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     143b84a:	49 8d 7d 08          	lea    rdi,[r13+0x8]
     143b84e:	4c 89 fe             	mov    rsi,r15
     143b851:	e8 ea 26 3b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     143b856:	4c 8d bc 24 a0 00 00 	lea    r15,[rsp+0xa0]
     143b85d:	00 
     143b85e:	4c 89 ef             	mov    rdi,r13
     143b861:	48 83 c7 20          	add    rdi,0x20
     143b865:	4c 89 e6             	mov    rsi,r12
     143b868:	e8 65 e6 ff ff       	call   1439ed2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27f456>
     143b86d:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
     143b871:	41 0f 11 45 40       	movups XMMWORD PTR [r13+0x40],xmm0
     143b876:	0f 57 c0             	xorps  xmm0,xmm0
     143b879:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
     143b87d:	4c 89 ac 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],r13
     143b884:	00 
     143b885:	48 8d 05 e4 fc ff ff 	lea    rax,[rip+0xfffffffffffffce4]        # 143b570 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280af4>
     143b88c:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
     143b893:	00 
     143b894:	48 8d 05 6b 02 00 00 	lea    rax,[rip+0x26b]        # 143bb06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28108a>
     143b89b:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
     143b8a2:	00 
     143b8a3:	48 8d 35 5e d8 ff fe 	lea    rsi,[rip+0xfffffffffeffd85e]        # 439108 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb57>
     143b8aa:	4c 89 f7             	mov    rdi,r14
     143b8ad:	e8 3c 3e 66 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     143b8b2:	84 c0                	test   al,al
     143b8b4:	74 24                	je     143b8da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280e5e>
     143b8b6:	48 8b 75 20          	mov    rsi,QWORD PTR [rbp+0x20]
     143b8ba:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     143b8bd:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     143b8c4:	00 
     143b8c5:	ff 50 28             	call   QWORD PTR [rax+0x28]
     143b8c8:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     143b8cf:	00 
     143b8d0:	4c 8d b4 24 d0 00 00 	lea    r14,[rsp+0xd0]
     143b8d7:	00 
     143b8d8:	eb 72                	jmp    143b94c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280ed0>
     143b8da:	48 8d 7d 40          	lea    rdi,[rbp+0x40]
     143b8de:	4c 89 f6             	mov    rsi,r14
     143b8e1:	e8 6e 9f 6a ff       	call   ae5854 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x327f4>
     143b8e6:	48 85 c0             	test   rax,rax
     143b8e9:	74 4a                	je     143b935 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280eb9>
     143b8eb:	49 89 c7             	mov    r15,rax
     143b8ee:	48 83 78 40 00       	cmp    QWORD PTR [rax+0x40],0x0
     143b8f3:	0f 84 a7 00 00 00    	je     143b9a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280f24>
     143b8f9:	49 83 c7 40          	add    r15,0x40
     143b8fd:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
     143b901:	4c 8d 74 24 40       	lea    r14,[rsp+0x40]
    ...truncated...
### slot +0x28 target 0x143d498
FDE=(21222552, 21222571)
     143d498:	48 8d 05 e1 40 43 00 	lea    rax,[rip+0x4340e1]        # 1871580 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dc68>
     143d49f:	48 89 07             	mov    QWORD PTR [rdi],rax
     143d4a2:	48 83 c7 10          	add    rdi,0x10
     143d4a6:	e9 e5 09 3b 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
### slot +0x70 target 0x9d7de0
FDE=(10321376, 10321377)
      9d7de0:	c3                   	ret
### slot +0x98 target 0x143e004
FDE=(21225476, 21225487)
     143e004:	48 8d 05 7a d0 f3 fe 	lea    rax,[rip+0xfffffffffef3d07a]        # 37b085 <_ZTSSt12bad_any_cast@@Base-0x15143>
     143e00b:	6a 03                	push   0x3
     143e00d:	5a                   	pop    rdx
     143e00e:	c3                   	ret
### slot +0x128 target 0x143e3ca
FDE=(21226442, 21226606)
     143e3ca:	41 57                	push   r15
     143e3cc:	41 56                	push   r14
     143e3ce:	41 55                	push   r13
     143e3d0:	41 54                	push   r12
     143e3d2:	53                   	push   rbx
     143e3d3:	48 83 ec 30          	sub    rsp,0x30
     143e3d7:	49 89 ce             	mov    r14,rcx
     143e3da:	49 89 d7             	mov    r15,rdx
     143e3dd:	49 89 f4             	mov    r12,rsi
     143e3e0:	48 89 fb             	mov    rbx,rdi
     143e3e3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143e3ea:	00 00 
     143e3ec:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     143e3f1:	49 83 c7 48          	add    r15,0x48
     143e3f5:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
     143e3fa:	4c 89 ef             	mov    rdi,r13
     143e3fd:	4c 89 c6             	mov    rsi,r8
     143e400:	e8 9d 19 00 00       	call   143fda2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285326>
     143e405:	48 89 df             	mov    rdi,rbx
     143e408:	4c 89 e6             	mov    rsi,r12
     143e40b:	4c 89 fa             	mov    rdx,r15
     143e40e:	4c 89 f1             	mov    rcx,r14
     143e411:	4d 89 e8             	mov    r8,r13
     143e414:	e8 d1 19 00 00       	call   143fdea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28536e>
     143e419:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     143e41e:	e8 a5 f3 f5 ff       	call   139d7c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e2d4c>
     143e423:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143e42a:	00 00 
     143e42c:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
     143e431:	75 36                	jne    143e469 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2839ed>
     143e433:	48 89 d8             	mov    rax,rbx
     143e436:	48 83 c4 30          	add    rsp,0x30
     143e43a:	5b                   	pop    rbx
     143e43b:	41 5c                	pop    r12
     143e43d:	41 5d                	pop    r13
     143e43f:	41 5e                	pop    r14
     143e441:	41 5f                	pop    r15
     143e443:	c3                   	ret
     143e444:	48 89 c3             	mov    rbx,rax
     143e447:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     143e44c:	e8 77 f3 f5 ff       	call   139d7c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e2d4c>
     143e451:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143e458:	00 00 
     143e45a:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
     143e45f:	75 08                	jne    143e469 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2839ed>
     143e461:	48 89 df             	mov    rdi,rbx
     143e464:	e8 67 18 63 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     143e469:	e8 42 16 3b 00       	call   17efab0 <__stack_chk_fail@plt>
### slot +0x140 target 0x143e82a
FDE=(21227562, 21229178)
     143e82a:	55                   	push   rbp
     143e82b:	41 57                	push   r15
     143e82d:	41 56                	push   r14
     143e82f:	41 55                	push   r13
     143e831:	41 54                	push   r12
     143e833:	53                   	push   rbx
     143e834:	48 81 ec 68 02 00 00 	sub    rsp,0x268
     143e83b:	4d 89 c6             	mov    r14,r8
     143e83e:	49 89 d4             	mov    r12,rdx
     143e841:	49 89 f7             	mov    r15,rsi
     143e844:	48 89 fb             	mov    rbx,rdi
     143e847:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143e84e:	00 00 
     143e850:	48 89 84 24 60 02 00 	mov    QWORD PTR [rsp+0x260],rax
     143e857:	00 
     143e858:	48 8b 69 08          	mov    rbp,QWORD PTR [rcx+0x8]
     143e85c:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
     143e85f:	0f 29 84 24 a0 01 00 	movaps XMMWORD PTR [rsp+0x1a0],xmm0
     143e866:	00 
     143e867:	48 85 ed             	test   rbp,rbp
     143e86a:	74 05                	je     143e871 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283df5>
     143e86c:	f0 48 ff 45 10       	lock inc QWORD PTR [rbp+0x10]
     143e871:	48 8d 0d 00 0d 4e 00 	lea    rcx,[rip+0x4e0d00]        # 191f578 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x66988>
     143e878:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     143e87d:	4c 8d ac 24 a0 01 00 	lea    r13,[rsp+0x1a0]
     143e884:	00 
     143e885:	48 ba 04 00 00 00 01 	movabs rdx,0x100000004
     143e88c:	00 00 00 
     143e88f:	4c 89 ee             	mov    rsi,r13
     143e892:	e8 b9 f0 dd ff       	call   121d950 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62ed4>
     143e897:	48 89 ef             	mov    rdi,rbp
     143e89a:	e8 13 fc 65 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     143e89f:	48 89 e7             	mov    rdi,rsp
     143e8a2:	e8 dd 09 00 00       	call   143f284 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284808>
     143e8a7:	0f 57 c0             	xorps  xmm0,xmm0
     143e8aa:	48 8d 84 24 b0 00 00 	lea    rax,[rsp+0xb0]
     143e8b1:	00 
     143e8b2:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     143e8b6:	48 8d 0d 13 76 43 00 	lea    rcx,[rip+0x437613]        # 1875ed0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x325b8>
     143e8bd:	48 89 08             	mov    QWORD PTR [rax],rcx
     143e8c0:	48 8d 2d 31 0f 00 ff 	lea    rbp,[rip+0xffffffffff000f31]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     143e8c7:	48 89 68 18          	mov    QWORD PTR [rax+0x18],rbp
     143e8cb:	83 60 38 00          	and    DWORD PTR [rax+0x38],0x0
     143e8cf:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
     143e8d3:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
     143e8da:	00 
     143e8db:	48 89 84 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rax
     143e8e2:	00 
     143e8e3:	41 8b 7c 24 60       	mov    edi,DWORD PTR [r12+0x60]
     143e8e8:	e8 5b 01 67 ff       	call   aaea48 <JNI_OnUnload@@Base+0x36315>
     143e8ed:	49 8d 74 24 48       	lea    rsi,[r12+0x48]
     143e8f2:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
     143e8f9:	00 
     143e8fa:	4c 89 2f             	mov    QWORD PTR [rdi],r13
     143e8fd:	41 8b 44 24 60       	mov    eax,DWORD PTR [r12+0x60]
     143e902:	b9 ff ff ff ff       	mov    ecx,0xffffffff
     143e907:	48 39 c8             	cmp    rax,rcx
     143e90a:	6a ff                	push   0xffffffffffffffff
     143e90c:	59                   	pop    rcx
     143e90d:	48 0f 45 c8          	cmovne rcx,rax
     143e911:	48 8d 05 18 2e 43 00 	lea    rax,[rip+0x432e18]        # 1871730 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2de18>
     143e918:	ff 14 c8             	call   QWORD PTR [rax+rcx*8]
     143e91b:	41 80 bc 24 c8 00 00 	cmp    BYTE PTR [r12+0xc8],0x0
     143e922:	00 00 
     143e924:	74 39                	je     143e95f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283ee3>
     143e926:	49 8d bc 24 b0 00 00 	lea    rdi,[r12+0xb0]
     143e92d:	00 
     143e92e:	4c 8d ac 24 a0 01 00 	lea    r13,[rsp+0x1a0]
     143e935:	00 
     143e936:	41 83 65 00 00       	and    DWORD PTR [r13+0x0],0x0
     143e93b:	e8 f6 ce 63 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     143e940:	48 89 c7             	mov    rdi,rax
     143e943:	48 89 d6             	mov    rsi,rdx
     143e946:	4c 89 ea             	mov    rdx,r13
     143e949:	e8 06 65 ab ff       	call   ef4e54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbc26a>
     143e94e:	8b 8c 24 a0 01 00 00 	mov    ecx,DWORD PTR [rsp+0x1a0]
     143e955:	85 c9                	test   ecx,ecx
     143e957:	6a 05                	push   0x5
     143e959:	58                   	pop    rax
     143e95a:	0f 45 c1             	cmovne eax,ecx
     143e95d:	eb 03                	jmp    143e962 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283ee6>
     143e95f:	6a 05                	push   0x5
     143e961:	58                   	pop    rax
     143e962:	89 84 24 d0 00 00 00 	mov    DWORD PTR [rsp+0xd0],eax
     143e969:	8b 8c 24 c0 00 00 00 	mov    ecx,DWORD PTR [rsp+0xc0]
     143e970:	83 c9 02             	or     ecx,0x2
     143e973:	89 8c 24 c0 00 00 00 	mov    DWORD PTR [rsp+0xc0],ecx
     143e97a:	41 80 bc 24 80 00 00 	cmp    BYTE PTR [r12+0x80],0x0
     143e981:	00 00 
     143e983:	74 28                	je     143e9ad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283f31>
    ...truncated...

## Address point candidate 0x1867440
- header[-0x10]=0 header[-0x8]=0
- +0x0: 0xe438d4 FDE=(14956756, 14956779)
- +0x8: 0x13543fc FDE=(20268028, 20268046)
- +0x10: 0x135440e FDE=(20268046, 20268402)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0x1354572 FDE=(20268402, 20268584)
- +0x28: 0x1354628 FDE=(20268584, 20268766)
- +0x30: 0x13546de FDE=(20268766, 20268960)
- +0x38: 0x9d7de0 FDE=(10321376, 10321377)
- +0x40: 0x13547a0 FDE=(20268960, 20269458)
- +0x48: 0x1354992 FDE=(20269458, 20269676)
- +0x50: 0x9d7de0 FDE=(10321376, 10321377)
- +0x58: 0x1354a6c FDE=(20269676, 20269869)
- +0x60: 0x1354b2e FDE=(20269870, 20270074)
- +0x68: 0x1354bfa FDE=(20270074, 20270277)
- +0x70: 0x1354cc6 FDE=(20270278, 20270328)
- +0x78: 0x0 FDE=None
- +0x80: 0x0 FDE=None
- +0x88: 0x1355040 FDE=(20271168, 20271257)
- +0x90: 0x135509a FDE=(20271258, 20271276)
- +0x98: 0x13550ac FDE=(20271276, 20271618)
- +0xa0: 0x1355202 FDE=(20271618, 20271734)
- +0xa8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb0: 0x1355276 FDE=(20271734, 20272071)
- +0xb8: 0x13553c8 FDE=(20272072, 20272077)
- +0xc0: 0x13553c8 FDE=(20272072, 20272077)
- +0xc8: 0x13553ce FDE=(20272078, 20272477)
- +0xd0: 0x135555e FDE=(20272478, 20272622)
- +0xd8: 0x13555ee FDE=(20272622, 20273124)
- +0xe0: 0x13557e4 FDE=(20273124, 20274451)
- +0xe8: 0x1355d14 FDE=(20274452, 20274765)
- +0xf0: 0x1355e4e FDE=(20274766, 20275184)
- +0xf8: 0x1355ff0 FDE=(20275184, 20275564)
- +0x100: 0xfffffffffffffff8 FDE=None
- +0x108: 0x0 FDE=None
- +0x110: 0x135616c FDE=(20275564, 20275573)
- +0x118: 0x1356176 FDE=(20275574, 20275583)
- +0x120: 0x1356180 FDE=(20275584, 20275593)
- +0x128: 0x9d7de0 FDE=(10321376, 10321377)
- +0x130: 0x135618a FDE=(20275594, 20275603)
- +0x138: 0x1356194 FDE=(20275604, 20275613)
- +0x140: 0x135619e FDE=(20275614, 20275623)
- +0x148: 0x13561a8 FDE=(20275624, 20275633)
- +0x150: 0x13561b2 FDE=(20275634, 20275643)
- +0x158: 0x9d7de0 FDE=(10321376, 10321377)
- +0x160: 0x13561bc FDE=(20275644, 20275653)
- +0x168: 0x9d7de0 FDE=(10321376, 10321377)
- +0x170: 0x9d7de0 FDE=(10321376, 10321377)
- +0x178: 0x13561c6 FDE=(20275654, 20275663)
### slot +0x0 target 0xe438d4
FDE=(14956756, 14956779)
      e438d4:	53                   	push   rbx
      e438d5:	48 89 fb             	mov    rbx,rdi
      e438d8:	48 83 c7 18          	add    rdi,0x18
      e438dc:	e8 af a5 9a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e438e1:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      e438e5:	5b                   	pop    rbx
      e438e6:	e9 9b ab c5 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
### slot +0x8 target 0x13543fc
FDE=(20268028, 20268046)
     13543fc:	53                   	push   rbx
     13543fd:	48 89 fb             	mov    rbx,rdi
     1354400:	e8 cf f4 ae ff       	call   e438d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xacea>
     1354405:	48 89 df             	mov    rdi,rbx
     1354408:	5b                   	pop    rbx
     1354409:	e9 12 9b 49 00       	jmp    17edf20 <_ZdlPv@plt>
### slot +0x10 target 0x135440e
FDE=(20268046, 20268402)
     135440e:	41 57                	push   r15
     1354410:	41 56                	push   r14
     1354412:	41 55                	push   r13
     1354414:	41 54                	push   r12
     1354416:	53                   	push   rbx
     1354417:	48 81 ec 70 03 00 00 	sub    rsp,0x370
     135441e:	48 89 d3             	mov    rbx,rdx
     1354421:	49 89 f7             	mov    r15,rsi
     1354424:	49 89 fe             	mov    r14,rdi
     1354427:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135442e:	00 00 
     1354430:	48 89 84 24 68 03 00 	mov    QWORD PTR [rsp+0x368],rax
     1354437:	00 
     1354438:	4c 8d a6 20 02 00 00 	lea    r12,[rsi+0x220]
     135443f:	4c 8d 6f 18          	lea    r13,[rdi+0x18]
     1354443:	4c 89 ef             	mov    rdi,r13
     1354446:	4c 89 e6             	mov    rsi,r12
     1354449:	e8 a0 b2 74 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     135444e:	84 c0                	test   al,al
     1354450:	75 10                	jne    1354462 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1999e6>
     1354452:	41 c6 46 30 00       	mov    BYTE PTR [r14+0x30],0x0
     1354457:	4c 89 ef             	mov    rdi,r13
     135445a:	4c 89 e6             	mov    rsi,r12
     135445d:	e8 1e 9c 49 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     1354462:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
     1354466:	48 89 df             	mov    rdi,rbx
     1354469:	e8 c9 d0 1f 00       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     135446e:	4c 8d a4 24 20 03 00 	lea    r12,[rsp+0x320]
     1354475:	00 
     1354476:	4c 89 e7             	mov    rdi,r12
     1354479:	48 89 c6             	mov    rsi,rax
     135447c:	e8 cf 81 d3 ff       	call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>
     1354481:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     1354488:	00 
     1354489:	4c 89 fe             	mov    rsi,r15
     135448c:	4c 89 e2             	mov    rdx,r12
     135448f:	e8 54 61 00 00       	call   135a5e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19fb6c>
     1354494:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
     1354499:	41 c6 44 24 f8 01    	mov    BYTE PTR [r12-0x8],0x1
     135449f:	48 8d 8c 24 80 00 00 	lea    rcx,[rsp+0x80]
     13544a6:	00 
     13544a7:	4c 89 e7             	mov    rdi,r12
     13544aa:	4c 89 fe             	mov    rsi,r15
     13544ad:	48 89 da             	mov    rdx,rbx
     13544b0:	e8 53 0a 00 00       	call   1354f08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a48c>
     13544b5:	83 bb 90 02 00 00 00 	cmp    DWORD PTR [rbx+0x290],0x0
     13544bc:	0f 94 c0             	sete   al
     13544bf:	80 bb 80 00 00 00 00 	cmp    BYTE PTR [rbx+0x80],0x0
     13544c6:	0f 94 c1             	sete   cl
     13544c9:	20 c1                	and    cl,al
     13544cb:	48 89 e3             	mov    rbx,rsp
     13544ce:	88 4b 78             	mov    BYTE PTR [rbx+0x78],cl
     13544d1:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     13544d8:	00 
     13544d9:	e8 5e 5b ed ff       	call   122a03c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6f5c0>
     13544de:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
     13544e5:	00 
     13544e6:	e8 e1 a2 74 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     13544eb:	49 8b 06             	mov    rax,QWORD PTR [r14]
     13544ee:	4c 89 f7             	mov    rdi,r14
     13544f1:	48 89 de             	mov    rsi,rbx
     13544f4:	ff 50 20             	call   QWORD PTR [rax+0x20]
     13544f7:	4c 89 e7             	mov    rdi,r12
     13544fa:	e8 e1 09 00 00       	call   1354ee0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a464>
     13544ff:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1354506:	00 00 
     1354508:	48 3b 84 24 68 03 00 	cmp    rax,QWORD PTR [rsp+0x368]
     135450f:	00 
     1354510:	75 5b                	jne    135456d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199af1>
     1354512:	48 81 c4 70 03 00 00 	add    rsp,0x370
     1354519:	5b                   	pop    rbx
     135451a:	41 5c                	pop    r12
     135451c:	41 5d                	pop    r13
     135451e:	41 5e                	pop    r14
     1354520:	41 5f                	pop    r15
     1354522:	c3                   	ret
     1354523:	48 89 c3             	mov    rbx,rax
     1354526:	4c 89 e7             	mov    rdi,r12
     1354529:	e8 b2 09 00 00       	call   1354ee0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a464>
     135452e:	eb 22                	jmp    1354552 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199ad6>
     1354530:	48 89 c3             	mov    rbx,rax
     1354533:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     135453a:	00 
     135453b:	e8 fc 5a ed ff       	call   122a03c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6f5c0>
     1354540:	eb 03                	jmp    1354545 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199ac9>
     1354542:	48 89 c3             	mov    rbx,rax
     1354545:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
     135454c:	00 
     135454d:	e8 7a a2 74 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1354552:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
    ...truncated...
### slot +0x18 target 0x9d7de0
FDE=(10321376, 10321377)
      9d7de0:	c3                   	ret
### slot +0x20 target 0x1354572
FDE=(20268402, 20268584)
     1354572:	41 56                	push   r14
     1354574:	53                   	push   rbx
     1354575:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
     135457c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1354583:	00 00 
     1354585:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
     135458c:	00 
     135458d:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
     1354591:	49 8b 78 08          	mov    rdi,QWORD PTR [r8+0x8]
     1354595:	48 8d 44 24 10       	lea    rax,[rsp+0x10]
     135459a:	48 89 38             	mov    QWORD PTR [rax],rdi
     135459d:	c6 40 08 01          	mov    BYTE PTR [rax+0x8],0x1
     13545a1:	4d 8d 48 10          	lea    r9,[r8+0x10]
     13545a5:	31 ff                	xor    edi,edi
     13545a7:	4c 8d 44 24 08       	lea    r8,[rsp+0x8]
     13545ac:	41 88 38             	mov    BYTE PTR [r8],dil
     13545af:	41 88 78 04          	mov    BYTE PTR [r8+0x4],dil
     13545b3:	4c 89 04 24          	mov    QWORD PTR [rsp],r8
     13545b7:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     13545bc:	4c 89 f7             	mov    rdi,r14
     13545bf:	49 89 c0             	mov    r8,rax
     13545c2:	e8 31 07 00 00       	call   1354cf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a27c>
     13545c7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     13545ca:	48 89 df             	mov    rdi,rbx
     13545cd:	4c 89 f6             	mov    rsi,r14
     13545d0:	ff 50 38             	call   QWORD PTR [rax+0x38]
     13545d3:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     13545d8:	e8 dd 08 00 00       	call   1354eba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a43e>
     13545dd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13545e4:	00 00 
     13545e6:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
     13545ed:	00 
     13545ee:	75 33                	jne    1354623 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199ba7>
     13545f0:	48 81 c4 f8 00 00 00 	add    rsp,0xf8
     13545f7:	5b                   	pop    rbx
     13545f8:	41 5e                	pop    r14
     13545fa:	c3                   	ret
     13545fb:	48 89 c3             	mov    rbx,rax
     13545fe:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1354603:	e8 b2 08 00 00       	call   1354eba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a43e>
     1354608:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135460f:	00 00 
     1354611:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
     1354618:	00 
     1354619:	75 08                	jne    1354623 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199ba7>
     135461b:	48 89 df             	mov    rdi,rbx
     135461e:	e8 ad b6 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1354623:	e8 88 b4 49 00       	call   17efab0 <__stack_chk_fail@plt>
### slot +0x28 target 0x1354628
FDE=(20268584, 20268766)
     1354628:	41 56                	push   r14
     135462a:	53                   	push   rbx
     135462b:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
     1354632:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1354639:	00 00 
     135463b:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
     1354642:	00 
     1354643:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
     1354647:	49 8b 78 08          	mov    rdi,QWORD PTR [r8+0x8]
     135464b:	48 8d 44 24 10       	lea    rax,[rsp+0x10]
     1354650:	48 89 38             	mov    QWORD PTR [rax],rdi
     1354653:	c6 40 08 01          	mov    BYTE PTR [rax+0x8],0x1
     1354657:	4d 8d 48 10          	lea    r9,[r8+0x10]
     135465b:	31 ff                	xor    edi,edi
     135465d:	4c 8d 44 24 08       	lea    r8,[rsp+0x8]
     1354662:	41 88 38             	mov    BYTE PTR [r8],dil
     1354665:	41 88 78 04          	mov    BYTE PTR [r8+0x4],dil
     1354669:	4c 89 04 24          	mov    QWORD PTR [rsp],r8
     135466d:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     1354672:	4c 89 f7             	mov    rdi,r14
     1354675:	49 89 c0             	mov    r8,rax
     1354678:	e8 7b 06 00 00       	call   1354cf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a27c>
     135467d:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1354680:	48 89 df             	mov    rdi,rbx
     1354683:	4c 89 f6             	mov    rsi,r14
     1354686:	ff 50 40             	call   QWORD PTR [rax+0x40]
     1354689:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     135468e:	e8 27 08 00 00       	call   1354eba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a43e>
     1354693:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135469a:	00 00 
     135469c:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
     13546a3:	00 
     13546a4:	75 33                	jne    13546d9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199c5d>
     13546a6:	48 81 c4 f8 00 00 00 	add    rsp,0xf8
     13546ad:	5b                   	pop    rbx
     13546ae:	41 5e                	pop    r14
     13546b0:	c3                   	ret
     13546b1:	48 89 c3             	mov    rbx,rax
     13546b4:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     13546b9:	e8 fc 07 00 00       	call   1354eba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a43e>
     13546be:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13546c5:	00 00 
     13546c7:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
     13546ce:	00 
     13546cf:	75 08                	jne    13546d9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199c5d>
     13546d1:	48 89 df             	mov    rdi,rbx
     13546d4:	e8 f7 b5 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     13546d9:	e8 d2 b3 49 00       	call   17efab0 <__stack_chk_fail@plt>
### slot +0x70 target 0x1354cc6
FDE=(20270278, 20270328)
     1354cc6:	49 8b 41 20          	mov    rax,QWORD PTR [r9+0x20]
     1354cca:	48 89 c6             	mov    rsi,rax
     1354ccd:	48 f7 de             	neg    rsi
     1354cd0:	48 0f 48 f0          	cmovs  rsi,rax
     1354cd4:	41 0f b6 41 38       	movzx  eax,BYTE PTR [r9+0x38]
     1354cd9:	83 f8 02             	cmp    eax,0x2
     1354cdc:	74 09                	je     1354ce7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a26b>
     1354cde:	83 f8 03             	cmp    eax,0x3
     1354ce1:	75 14                	jne    1354cf7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a27b>
     1354ce3:	6a 0d                	push   0xd
     1354ce5:	eb 02                	jmp    1354ce9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a26d>
     1354ce7:	6a 0c                	push   0xc
     1354ce9:	58                   	pop    rax
     1354cea:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     1354cee:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
     1354cf1:	48 8b 04 c1          	mov    rax,QWORD PTR [rcx+rax*8]
     1354cf5:	ff e0                	jmp    rax
     1354cf7:	c3                   	ret
### slot +0x98 target 0x13550ac
FDE=(20271276, 20271618)
     13550ac:	41 57                	push   r15
     13550ae:	41 56                	push   r14
     13550b0:	41 55                	push   r13
     13550b2:	41 54                	push   r12
     13550b4:	53                   	push   rbx
     13550b5:	48 83 ec 50          	sub    rsp,0x50
     13550b9:	49 89 f6             	mov    r14,rsi
     13550bc:	48 89 fb             	mov    rbx,rdi
     13550bf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13550c6:	00 00 
     13550c8:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     13550cd:	4c 8d 7f 10          	lea    r15,[rdi+0x10]
     13550d1:	48 8d 35 54 7d 08 ff 	lea    rsi,[rip+0xffffffffff087d54]        # 3dce2c <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x287b>
     13550d8:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
     13550dd:	6a 01                	push   0x1
     13550df:	5a                   	pop    rdx
     13550e0:	4c 89 e7             	mov    rdi,r12
     13550e3:	e8 44 49 d5 ff       	call   10a9a2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270e42>
     13550e8:	49 8b 06             	mov    rax,QWORD PTR [r14]
     13550eb:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     13550f0:	6a 01                	push   0x1
     13550f2:	59                   	pop    rcx
     13550f3:	4c 89 f6             	mov    rsi,r14
     13550f6:	4c 89 fa             	mov    rdx,r15
     13550f9:	4d 89 e0             	mov    r8,r12
     13550fc:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
     1355102:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
     1355106:	4c 8d 7c 24 38       	lea    r15,[rsp+0x38]
     135510b:	4c 89 fe             	mov    rsi,r15
     135510e:	e8 09 47 76 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     1355113:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1355117:	e8 6a 93 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135511c:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     1355121:	e8 9a 94 78 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     1355126:	48 8d 44 24 10       	lea    rax,[rsp+0x10]
     135512b:	0f 57 c0             	xorps  xmm0,xmm0
     135512e:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     1355131:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     1355135:	4c 8b 7b 58          	mov    r15,QWORD PTR [rbx+0x58]
     1355139:	4c 8b 6b 60          	mov    r13,QWORD PTR [rbx+0x60]
     135513d:	4d 39 ef             	cmp    r15,r13
     1355140:	74 28                	je     135516a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a6ee>
     1355142:	49 83 c7 10          	add    r15,0x10
     1355146:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
     135514b:	49 8b 77 f8          	mov    rsi,QWORD PTR [r15-0x8]
     135514f:	4c 89 e7             	mov    rdi,r12
     1355152:	4c 89 fa             	mov    rdx,r15
     1355155:	e8 12 e7 ff ff       	call   135386c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198df0>
     135515a:	49 8d 47 20          	lea    rax,[r15+0x20]
     135515e:	49 83 c7 10          	add    r15,0x10
     1355162:	4d 39 ef             	cmp    r15,r13
     1355165:	49 89 c7             	mov    r15,rax
     1355168:	75 e1                	jne    135514b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a6cf>
     135516a:	48 8d 53 08          	lea    rdx,[rbx+0x8]
     135516e:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1355171:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1355176:	6a 02                	push   0x2
     1355178:	59                   	pop    rcx
     1355179:	4c 8d 44 24 08       	lea    r8,[rsp+0x8]
     135517e:	4c 89 f6             	mov    rsi,r14
     1355181:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
     1355187:	48 83 c3 70          	add    rbx,0x70
     135518b:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     1355190:	48 89 df             	mov    rdi,rbx
     1355193:	4c 89 f6             	mov    rsi,r14
     1355196:	e8 81 46 76 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     135519b:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     135519f:	e8 e2 92 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13551a4:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     13551a9:	e8 12 94 78 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     13551ae:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13551b5:	00 00 
     13551b7:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
     13551bc:	75 3f                	jne    13551fd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a781>
     13551be:	48 83 c4 50          	add    rsp,0x50
     13551c2:	5b                   	pop    rbx
     13551c3:	41 5c                	pop    r12
     13551c5:	41 5d                	pop    r13
     13551c7:	41 5e                	pop    r14
     13551c9:	41 5f                	pop    r15
     13551cb:	c3                   	ret
     13551cc:	eb 0a                	jmp    13551d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a75c>
     13551ce:	48 89 c3             	mov    rbx,rax
     13551d1:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     13551d6:	eb 08                	jmp    13551e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a764>
     13551d8:	48 89 c3             	mov    rbx,rax
     13551db:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     13551e0:	e8 db 93 78 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     13551e5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13551ec:	00 00 
    ...truncated...
### slot +0x128 target 0x9d7de0
FDE=(10321376, 10321377)
      9d7de0:	c3                   	ret
### slot +0x140 target 0x135619e
FDE=(20275614, 20275623)
     135619e:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     13561a2:	e9 3d f6 ff ff       	jmp    13557e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad68>

## All materializations of TimelineAds owner/wrapper APs
### 0x135257c: lea    rax,[rip+0x514dbd]        # 1867340 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23a28>; FDE=(20260004, 20264020)
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

### 0x135282c: lea    rcx,[rip+0x5150c5]        # 18678f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23fe0>; FDE=(20260004, 20264020)
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

### 0x1352858: lea    rcx,[rip+0x515011]        # 1867870 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23f58>; FDE=(20260004, 20264020)
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

### 0x1352937: lea    rax,[rip+0x514b02]        # 1867440 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23b28>; FDE=(20260004, 20264020)
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

### 0x1352978: lea    rcx,[rip+0x51ebd9]        # 1871558 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dc40>; FDE=(20260004, 20264020)
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

### 0x1353b7e: lea    rax,[rip+0x5137bb]        # 1867340 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23a28>; FDE=(20265830, 20266021)
     1353b5d:	48 89 c7             	mov    rdi,rax
     1353b60:	e8 40 5f 72 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1353b65:	cc                   	int3
     1353b66:	41 56                	push   r14
     1353b68:	53                   	push   rbx
     1353b69:	48 83 ec 28          	sub    rsp,0x28
     1353b6d:	48 89 fb             	mov    rbx,rdi
     1353b70:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1353b77:	00 00 
     1353b79:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     1353b7e:	48 8d 05 bb 37 51 00 	lea    rax,[rip+0x5137bb]        # 1867340 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23a28>
     1353b85:	48 89 07             	mov    QWORD PTR [rdi],rax
     1353b88:	48 8b 7f 58          	mov    rdi,QWORD PTR [rdi+0x58]
     1353b8c:	48 85 ff             	test   rdi,rdi
     1353b8f:	74 23                	je     1353bb4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199138>
     1353b91:	0f 57 c0             	xorps  xmm0,xmm0
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

## TimelineAds factory tail / return behavior
- FDE=(20260004, 20264020)
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
     135318a:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     1353191:	00 
     1353192:	e8 29 b4 78 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     1353197:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]
     135319e:	00 
     135319f:	e8 e2 b2 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13531a4:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
     13531ab:	00 
     13531ac:	e8 d5 b2 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13531b1:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
     13531b8:	00 
     13531b9:	e8 c8 b2 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13531be:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
     13531c5:	00 
     13531c6:	48 89 18             	mov    QWORD PTR [rax],rbx
     13531c9:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     13531d0:	00 00 
     13531d2:	48 3b 8c 24 90 01 00 	cmp    rcx,QWORD PTR [rsp+0x190]
     13531d9:	00 
     13531da:	0f 85 6f 02 00 00    	jne    135344f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1989d3>
     13531e0:	48 81 c4 98 01 00 00 	add    rsp,0x198
     13531e7:	5b                   	pop    rbx
     13531e8:	41 5c                	pop    r12
     13531ea:	41 5d                	pop    r13
     13531ec:	41 5e                	pop    r14
     13531ee:	41 5f                	pop    r15
     13531f0:	5d                   	pop    rbp
     13531f1:	c3                   	ret
     13531f2:	e8 c8 6d 72 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
     13531f7:	eb 0a                	jmp    1353203 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198787>
     13531f9:	e9 9e 00 00 00       	jmp    135329c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198820>
     13531fe:	e9 5a 01 00 00       	jmp    135335d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1988e1>
     1353203:	48 89 c5             	mov    rbp,rax
     1353206:	eb 36                	jmp    135323e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1987c2>
     1353208:	e9 0f 01 00 00       	jmp    135331c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1988a0>
     135320d:	48 89 c5             	mov    rbp,rax
     1353210:	4c 89 ff             	mov    rdi,r15
     1353213:	e8 78 ac 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1353218:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
     135321c:	e8 65 b2 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1353221:	4c 89 f7             	mov    rdi,r14
     1353224:	e8 f7 ac 49 00       	call   17edf20 <_ZdlPv@plt>
     1353229:	eb 13                	jmp    135323e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1987c2>
     135322b:	48 89 c5             	mov    rbp,rax
     135322e:	66 0f 6f 84 24 80 00 	movdqa xmm0,XMMWORD PTR [rsp+0x80]
     1353235:	00 00 
     1353237:	66 49 0f 3a 16 c4 01 	pextrq r12,xmm0,0x1
     135323e:	4c 89 e7             	mov    rdi,r12
     1353241:	e8 40 b2 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1353246:	e9 7a 01 00 00       	jmp    13533c5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198949>
     135324b:	e9 0d 01 00 00       	jmp    135335d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1988e1>
     1353250:	e9 08 01 00 00       	jmp    135335d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1988e1>
     1353255:	eb 1b                	jmp    1353272 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1987f6>
     1353257:	e9 c0 00 00 00       	jmp    135331c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1988a0>
     135325c:	e9 fc 00 00 00       	jmp    135335d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1988e1>
     1353261:	e9 f7 00 00 00       	jmp    135335d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1988e1>
     1353266:	e9 f2 00 00 00       	jmp    135335d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1988e1>
     135326b:	eb 00                	jmp    135326d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1987f1>
     135326d:	48 89 c5             	mov    rbp,rax
     1353270:	eb 10                	jmp    1353282 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198806>
     1353272:	48 89 c5             	mov    rbp,rax
     1353275:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]
     135327c:	00 
     135327d:	e8 3e b3 78 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     1353282:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1353289:	00 
     135328a:	e8 c5 04 00 00       	call   1353754 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198cd8>
     135328f:	e9 0a 01 00 00       	jmp    135339e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198922>
     1353294:	48 89 c5             	mov    rbp,rax
     1353297:	e9 de 00 00 00       	jmp    135337a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1988fe>
     135329c:	48 89 c5             	mov    rbp,rax
     135329f:	e9 fa 00 00 00       	jmp    135339e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198922>
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
     1353307:	48 89 c5             	mov    rbp,rax
     135330a:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     1353311:	00 
     1353312:	e8 6f b1 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1353317:	e9 8f 00 00 00       	jmp    13533ab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19892f>
     135331c:	48 89 c5             	mov    rbp,rax
     135331f:	e9 87 00 00 00       	jmp    13533ab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19892f>
     1353324:	48 89 c5             	mov    rbp,rax
     1353327:	e9 8c 00 00 00       	jmp    13533b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19893c>
     135332c:	eb 2f                	jmp    135335d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1988e1>
     135332e:	48 89 c5             	mov    rbp,rax
     1353331:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
     1353335:	e8 4c b1 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135333a:	4c 89 f7             	mov    rdi,r14
     135333d:	e8 de ab 49 00       	call   17edf20 <_ZdlPv@plt>
     1353342:	eb 03                	jmp    1353347 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1988cb>
     1353344:	48 89 c5             	mov    rbp,rax
     1353347:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
     135334e:	00 
     135334f:	e8 32 b1 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1353354:	eb 6f                	jmp    13533c5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198949>
     1353356:	eb 05                	jmp    135335d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1988e1>
     1353358:	48 89 c5             	mov    rbp,rax
     135335b:	eb 75                	jmp    13533d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198956>
     135335d:	48 89 c5             	mov    rbp,rax
     1353360:	eb 63                	jmp    13533c5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198949>
     1353362:	48 89 c5             	mov    rbp,rax
     1353365:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     135336c:	00 
     135336d:	e8 6e 02 00 00       	call   13535e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b64>
     1353372:	4c 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],r15
     1353379:	00 
     135337a:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
     1353381:	00 
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

## Direct callers / relocation references to TimelineAds factory 0x13524a4
- relocation slots: 0x1867328

## Methods returning owner+0x10 / owner+0x20
### owner slot +0x0 -> 0x1353b66
     1353b66:	41 56                	push   r14
     1353b68:	53                   	push   rbx
     1353b69:	48 83 ec 28          	sub    rsp,0x28
     1353b6d:	48 89 fb             	mov    rbx,rdi
     1353b70:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1353b77:	00 00 
     1353b79:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     1353b7e:	48 8d 05 bb 37 51 00 	lea    rax,[rip+0x5137bb]        # 1867340 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23a28>
     1353b85:	48 89 07             	mov    QWORD PTR [rdi],rax
     1353b88:	48 8b 7f 58          	mov    rdi,QWORD PTR [rdi+0x58]
     1353b8c:	48 85 ff             	test   rdi,rdi
     1353b8f:	74 23                	je     1353bb4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199138>
     1353b91:	0f 57 c0             	xorps  xmm0,xmm0
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
     1353c00:	48 89 df             	mov    rdi,rbx
     1353c03:	e8 20 62 72 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1353c08:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1353c0f:	00 00 
     1353c11:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     1353c16:	75 08                	jne    1353c20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1991a4>
     1353c18:	48 83 c4 28          	add    rsp,0x28
     1353c1c:	5b                   	pop    rbx
     1353c1d:	41 5e                	pop    r14
     1353c1f:	c3                   	ret
     1353c20:	e8 8b be 49 00       	call   17efab0 <__stack_chk_fail@plt>

### owner slot +0x78 -> 0xaae9b2
      aae9b2:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aae9b6:	e9 cb fa fe ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>

### owner slot +0x80 -> 0xaae9bc
      aae9bc:	53                   	push   rbx
      aae9bd:	48 89 fb             	mov    rbx,rdi
      aae9c0:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aae9c4:	e8 bd fa fe ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      aae9c9:	48 89 df             	mov    rdi,rbx
      aae9cc:	5b                   	pop    rbx
      aae9cd:	e9 4e f5 d3 00       	jmp    17edf20 <_ZdlPv@plt>

### owner slot +0x88 -> 0x1353c38
     1353c38:	48 8d 86 20 02 00 00 	lea    rax,[rsi+0x220]
     1353c3f:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     1353c43:	48 8d 96 f8 02 00 00 	lea    rdx,[rsi+0x2f8]
     1353c4a:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
     1353c4d:	48 8b 49 20          	mov    rcx,QWORD PTR [rcx+0x20]
     1353c51:	48 89 c6             	mov    rsi,rax
     1353c54:	ff e1                	jmp    rcx

### owner slot +0x98 -> 0x1353c56
     1353c56:	41 57                	push   r15
     1353c58:	41 56                	push   r14
     1353c5a:	53                   	push   rbx
     1353c5b:	48 81 ec c0 00 00 00 	sub    rsp,0xc0
     1353c62:	4c 89 c3             	mov    rbx,r8
     1353c65:	49 89 fe             	mov    r14,rdi
     1353c68:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1353c6f:	00 00 
     1353c71:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     1353c78:	00 
     1353c79:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
     1353c7e:	4c 89 ff             	mov    rdi,r15
     1353c81:	48 89 d6             	mov    rsi,rdx
     1353c84:	4c 89 c2             	mov    rdx,r8
     1353c87:	e8 6a 05 00 00       	call   13541f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19977a>
     1353c8c:	0f 10 83 80 00 00 00 	movups xmm0,XMMWORD PTR [rbx+0x80]
     1353c93:	48 8d 94 24 a0 00 00 	lea    rdx,[rsp+0xa0]
     1353c9a:	00 
     1353c9b:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
     1353c9e:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
     1353ca2:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
     1353ca7:	48 89 01             	mov    QWORD PTR [rcx],rax
     1353caa:	c6 41 08 01          	mov    BYTE PTR [rcx+0x8],0x1
     1353cae:	0f 10 43 10          	movups xmm0,XMMWORD PTR [rbx+0x10]
     1353cb2:	49 89 e0             	mov    r8,rsp
     1353cb5:	41 0f 29 00          	movaps XMMWORD PTR [r8],xmm0
     1353cb9:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     1353cbd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1353cc0:	4c 89 fe             	mov    rsi,r15
     1353cc3:	ff 50 30             	call   QWORD PTR [rax+0x30]
     1353cc6:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1353ccb:	e8 d4 06 00 00       	call   13543a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199928>
     1353cd0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1353cd7:	00 00 
     1353cd9:	48 3b 84 24 b8 00 00 	cmp    rax,QWORD PTR [rsp+0xb8]
     1353ce0:	00 
     1353ce1:	75 35                	jne    1353d18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19929c>
     1353ce3:	48 81 c4 c0 00 00 00 	add    rsp,0xc0
     1353cea:	5b                   	pop    rbx
     1353ceb:	41 5e                	pop    r14
     1353ced:	41 5f                	pop    r15
     1353cef:	c3                   	ret
     1353cf0:	48 89 c3             	mov    rbx,rax
     1353cf3:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1353cf8:	e8 a7 06 00 00       	call   13543a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199928>
     1353cfd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1353d04:	00 00 
     1353d06:	48 3b 84 24 b8 00 00 	cmp    rax,QWORD PTR [rsp+0xb8]
     1353d0d:	00 
     1353d0e:	75 08                	jne    1353d18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19929c>
     1353d10:	48 89 df             	mov    rdi,rbx
     1353d13:	e8 b8 bf 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1353d18:	e8 93 bd 49 00       	call   17efab0 <__stack_chk_fail@plt>

### owner slot +0xa0 -> 0x1353d1e
     1353d1e:	41 57                	push   r15
     1353d20:	41 56                	push   r14
     1353d22:	53                   	push   rbx
     1353d23:	48 81 ec c0 00 00 00 	sub    rsp,0xc0
     1353d2a:	4c 89 c3             	mov    rbx,r8
     1353d2d:	49 89 fe             	mov    r14,rdi
     1353d30:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1353d37:	00 00 
     1353d39:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     1353d40:	00 
     1353d41:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
     1353d46:	4c 89 ff             	mov    rdi,r15
     1353d49:	48 89 d6             	mov    rsi,rdx
     1353d4c:	4c 89 c2             	mov    rdx,r8
     1353d4f:	e8 a2 04 00 00       	call   13541f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19977a>
     1353d54:	0f 10 83 80 00 00 00 	movups xmm0,XMMWORD PTR [rbx+0x80]
     1353d5b:	48 8d 94 24 a0 00 00 	lea    rdx,[rsp+0xa0]
     1353d62:	00 
     1353d63:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
     1353d66:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
     1353d6a:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
     1353d6f:	48 89 01             	mov    QWORD PTR [rcx],rax
     1353d72:	c6 41 08 01          	mov    BYTE PTR [rcx+0x8],0x1
     1353d76:	0f 10 43 10          	movups xmm0,XMMWORD PTR [rbx+0x10]
     1353d7a:	49 89 e0             	mov    r8,rsp
     1353d7d:	41 0f 29 00          	movaps XMMWORD PTR [r8],xmm0
     1353d81:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     1353d85:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1353d88:	4c 89 fe             	mov    rsi,r15
     1353d8b:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1353d8e:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1353d93:	e8 0c 06 00 00       	call   13543a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199928>
     1353d98:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1353d9f:	00 00 
     1353da1:	48 3b 84 24 b8 00 00 	cmp    rax,QWORD PTR [rsp+0xb8]
     1353da8:	00 
     1353da9:	75 35                	jne    1353de0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199364>
     1353dab:	48 81 c4 c0 00 00 00 	add    rsp,0xc0
     1353db2:	5b                   	pop    rbx
     1353db3:	41 5e                	pop    r14
     1353db5:	41 5f                	pop    r15
     1353db7:	c3                   	ret
     1353db8:	48 89 c3             	mov    rbx,rax
     1353dbb:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1353dc0:	e8 df 05 00 00       	call   13543a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199928>
     1353dc5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1353dcc:	00 00 
     1353dce:	48 3b 84 24 b8 00 00 	cmp    rax,QWORD PTR [rsp+0xb8]
     1353dd5:	00 
     1353dd6:	75 08                	jne    1353de0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199364>
     1353dd8:	48 89 df             	mov    rdi,rbx
     1353ddb:	e8 f0 be 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1353de0:	e8 cb bc 49 00       	call   17efab0 <__stack_chk_fail@plt>

### owner slot +0xa8 -> 0x1353de6
     1353de6:	41 57                	push   r15
     1353de8:	41 56                	push   r14
     1353dea:	53                   	push   rbx
     1353deb:	48 81 ec c0 00 00 00 	sub    rsp,0xc0
     1353df2:	4c 89 c3             	mov    rbx,r8
     1353df5:	49 89 fe             	mov    r14,rdi
     1353df8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1353dff:	00 00 
     1353e01:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     1353e08:	00 
     1353e09:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
     1353e0e:	4c 89 ff             	mov    rdi,r15
     1353e11:	48 89 d6             	mov    rsi,rdx
     1353e14:	4c 89 c2             	mov    rdx,r8
     1353e17:	e8 da 03 00 00       	call   13541f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19977a>
     1353e1c:	0f 10 83 80 00 00 00 	movups xmm0,XMMWORD PTR [rbx+0x80]
     1353e23:	48 8d 94 24 a0 00 00 	lea    rdx,[rsp+0xa0]
     1353e2a:	00 
     1353e2b:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
     1353e2e:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
     1353e32:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
     1353e37:	48 89 01             	mov    QWORD PTR [rcx],rax
     1353e3a:	c6 41 08 01          	mov    BYTE PTR [rcx+0x8],0x1
     1353e3e:	0f 10 43 10          	movups xmm0,XMMWORD PTR [rbx+0x10]
     1353e42:	49 89 e0             	mov    r8,rsp
     1353e45:	41 0f 29 00          	movaps XMMWORD PTR [r8],xmm0
     1353e49:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     1353e4d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1353e50:	4c 89 fe             	mov    rsi,r15
     1353e53:	ff 50 10             	call   QWORD PTR [rax+0x10]
     1353e56:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1353e5b:	e8 44 05 00 00       	call   13543a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199928>
     1353e60:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1353e67:	00 00 
     1353e69:	48 3b 84 24 b8 00 00 	cmp    rax,QWORD PTR [rsp+0xb8]
     1353e70:	00 
     1353e71:	75 35                	jne    1353ea8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19942c>
     1353e73:	48 81 c4 c0 00 00 00 	add    rsp,0xc0
     1353e7a:	5b                   	pop    rbx
     1353e7b:	41 5e                	pop    r14
     1353e7d:	41 5f                	pop    r15
     1353e7f:	c3                   	ret
     1353e80:	48 89 c3             	mov    rbx,rax
     1353e83:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1353e88:	e8 17 05 00 00       	call   13543a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199928>
     1353e8d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1353e94:	00 00 
     1353e96:	48 3b 84 24 b8 00 00 	cmp    rax,QWORD PTR [rsp+0xb8]
     1353e9d:	00 
     1353e9e:	75 08                	jne    1353ea8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19942c>
     1353ea0:	48 89 df             	mov    rdi,rbx
     1353ea3:	e8 28 be 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1353ea8:	e8 03 bc 49 00       	call   17efab0 <__stack_chk_fail@plt>

### owner slot +0xc0 -> 0x1353eae
     1353eae:	55                   	push   rbp
     1353eaf:	41 57                	push   r15
     1353eb1:	41 56                	push   r14
     1353eb3:	53                   	push   rbx
     1353eb4:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
     1353ebb:	4c 89 cb             	mov    rbx,r9
     1353ebe:	49 89 fe             	mov    r14,rdi
     1353ec1:	8b ac 24 e8 00 00 00 	mov    ebp,DWORD PTR [rsp+0xe8]
     1353ec8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1353ecf:	00 00 
     1353ed1:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     1353ed8:	00 
     1353ed9:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
     1353ede:	4c 89 ff             	mov    rdi,r15
     1353ee1:	48 89 d6             	mov    rsi,rdx
     1353ee4:	4c 89 ca             	mov    rdx,r9
     1353ee7:	e8 0a 03 00 00       	call   13541f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19977a>
     1353eec:	0f 10 83 80 00 00 00 	movups xmm0,XMMWORD PTR [rbx+0x80]
     1353ef3:	48 8d 94 24 a0 00 00 	lea    rdx,[rsp+0xa0]
     1353efa:	00 
     1353efb:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
     1353efe:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
     1353f02:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
     1353f07:	48 89 01             	mov    QWORD PTR [rcx],rax
     1353f0a:	c6 41 08 01          	mov    BYTE PTR [rcx+0x8],0x1
     1353f0e:	0f 10 43 10          	movups xmm0,XMMWORD PTR [rbx+0x10]
     1353f12:	49 89 e0             	mov    r8,rsp
     1353f15:	41 0f 29 00          	movaps XMMWORD PTR [r8],xmm0
     1353f19:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     1353f1d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1353f20:	4c 89 fe             	mov    rsi,r15
     1353f23:	41 89 e9             	mov    r9d,ebp
     1353f26:	ff 50 18             	call   QWORD PTR [rax+0x18]
     1353f29:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1353f2e:	e8 71 04 00 00       	call   13543a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199928>
     1353f33:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1353f3a:	00 00 
     1353f3c:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
     1353f43:	00 
     1353f44:	75 36                	jne    1353f7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199500>
     1353f46:	48 81 c4 b8 00 00 00 	add    rsp,0xb8
     1353f4d:	5b                   	pop    rbx
     1353f4e:	41 5e                	pop    r14
     1353f50:	41 5f                	pop    r15
     1353f52:	5d                   	pop    rbp
     1353f53:	c3                   	ret
     1353f54:	48 89 c3             	mov    rbx,rax
     1353f57:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1353f5c:	e8 43 04 00 00       	call   13543a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199928>
     1353f61:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1353f68:	00 00 
     1353f6a:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
     1353f71:	00 
     1353f72:	75 08                	jne    1353f7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199500>
     1353f74:	48 89 df             	mov    rdi,rbx
     1353f77:	e8 54 bd 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1353f7c:	e8 2f bb 49 00       	call   17efab0 <__stack_chk_fail@plt>

### owner slot +0xe0 -> 0x135404a
     135404a:	41 57                	push   r15
     135404c:	41 56                	push   r14
     135404e:	53                   	push   rbx
     135404f:	48 81 ec d0 00 00 00 	sub    rsp,0xd0
     1354056:	4c 89 cb             	mov    rbx,r9
     1354059:	4d 89 c6             	mov    r14,r8
     135405c:	49 89 ff             	mov    r15,rdi
     135405f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1354066:	00 00 
     1354068:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
     135406f:	00 
     1354070:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     1354075:	48 89 d6             	mov    rsi,rdx
     1354078:	4c 89 ca             	mov    rdx,r9
     135407b:	e8 76 01 00 00       	call   13541f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19977a>
     1354080:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
     1354084:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     1354089:	c6 44 24 40 01       	mov    BYTE PTR [rsp+0x40],0x1
     135408e:	0f 10 43 10          	movups xmm0,XMMWORD PTR [rbx+0x10]
     1354092:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
     1354097:	49 8b 5f 08          	mov    rbx,QWORD PTR [r15+0x8]
     135409b:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     13540a0:	4c 89 f6             	mov    rsi,r14
     13540a3:	e8 38 a4 49 00       	call   17ee4e0 <_ZNKSt6__ndk110error_code7messageEv@plt>
     13540a8:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     13540ab:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
     13540b0:	48 8d 54 24 38       	lea    rdx,[rsp+0x38]
     13540b5:	48 8d 4c 24 20       	lea    rcx,[rsp+0x20]
     13540ba:	4c 8d 44 24 08       	lea    r8,[rsp+0x8]
     13540bf:	48 89 df             	mov    rdi,rbx
     13540c2:	ff 50 48             	call   QWORD PTR [rax+0x48]
     13540c5:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     13540ca:	e8 c1 9d 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     13540cf:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     13540d4:	e8 cb 02 00 00       	call   13543a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199928>
     13540d9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13540e0:	00 00 
     13540e2:	48 3b 84 24 c8 00 00 	cmp    rax,QWORD PTR [rsp+0xc8]
     13540e9:	00 
     13540ea:	75 44                	jne    1354130 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1996b4>
     13540ec:	48 81 c4 d0 00 00 00 	add    rsp,0xd0
     13540f3:	5b                   	pop    rbx
     13540f4:	41 5e                	pop    r14
     13540f6:	41 5f                	pop    r15
     13540f8:	c3                   	ret
     13540f9:	48 89 c3             	mov    rbx,rax
     13540fc:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1354101:	e8 8a 9d 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1354106:	eb 03                	jmp    135410b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19968f>
     1354108:	48 89 c3             	mov    rbx,rax
     135410b:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     1354110:	e8 8f 02 00 00       	call   13543a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199928>
     1354115:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135411c:	00 00 
     135411e:	48 3b 84 24 c8 00 00 	cmp    rax,QWORD PTR [rsp+0xc8]
     1354125:	00 
     1354126:	75 08                	jne    1354130 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1996b4>
     1354128:	48 89 df             	mov    rdi,rbx
     135412b:	e8 a0 bb 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1354130:	e8 7b b9 49 00       	call   17efab0 <__stack_chk_fail@plt>

### owner slot +0xe8 -> 0x1354136
     1354136:	41 57                	push   r15
     1354138:	41 56                	push   r14
     135413a:	41 54                	push   r12
     135413c:	53                   	push   rbx
     135413d:	48 81 ec a8 00 00 00 	sub    rsp,0xa8
     1354144:	4c 89 cb             	mov    rbx,r9
     1354147:	4d 89 c6             	mov    r14,r8
     135414a:	49 89 ff             	mov    r15,rdi
     135414d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1354154:	00 00 
     1354156:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     135415d:	00 
     135415e:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
     1354163:	4c 89 e7             	mov    rdi,r12
     1354166:	48 89 d6             	mov    rsi,rdx
     1354169:	4c 89 c2             	mov    rdx,r8
     135416c:	e8 85 00 00 00       	call   13541f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19977a>
     1354171:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
     1354175:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
     135417a:	48 89 01             	mov    QWORD PTR [rcx],rax
     135417d:	c6 41 08 01          	mov    BYTE PTR [rcx+0x8],0x1
     1354181:	41 0f 10 46 10       	movups xmm0,XMMWORD PTR [r14+0x10]
     1354186:	49 89 e0             	mov    r8,rsp
     1354189:	41 0f 29 00          	movaps XMMWORD PTR [r8],xmm0
     135418d:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1354191:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1354194:	4c 89 e6             	mov    rsi,r12
     1354197:	48 89 da             	mov    rdx,rbx
     135419a:	ff 50 38             	call   QWORD PTR [rax+0x38]
     135419d:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     13541a2:	e8 fd 01 00 00       	call   13543a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199928>
     13541a7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13541ae:	00 00 
     13541b0:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
     13541b7:	00 
     13541b8:	75 37                	jne    13541f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199775>
     13541ba:	48 81 c4 a8 00 00 00 	add    rsp,0xa8
     13541c1:	5b                   	pop    rbx
     13541c2:	41 5c                	pop    r12
     13541c4:	41 5e                	pop    r14
     13541c6:	41 5f                	pop    r15
     13541c8:	c3                   	ret
     13541c9:	48 89 c3             	mov    rbx,rax
     13541cc:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     13541d1:	e8 ce 01 00 00       	call   13543a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199928>
     13541d6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13541dd:	00 00 
     13541df:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
     13541e6:	00 
     13541e7:	75 08                	jne    13541f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199775>
     13541e9:	48 89 df             	mov    rdi,rbx
     13541ec:	e8 df ba 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     13541f1:	e8 ba b8 49 00       	call   17efab0 <__stack_chk_fail@plt>

### owner slot +0x100 -> 0xe438d4
      e438d4:	53                   	push   rbx
      e438d5:	48 89 fb             	mov    rbx,rdi
      e438d8:	48 83 c7 18          	add    rdi,0x18
      e438dc:	e8 af a5 9a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e438e1:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      e438e5:	5b                   	pop    rbx
      e438e6:	e9 9b ab c5 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>

### owner slot +0x110 -> 0x135440e
     135440e:	41 57                	push   r15
     1354410:	41 56                	push   r14
     1354412:	41 55                	push   r13
     1354414:	41 54                	push   r12
     1354416:	53                   	push   rbx
     1354417:	48 81 ec 70 03 00 00 	sub    rsp,0x370
     135441e:	48 89 d3             	mov    rbx,rdx
     1354421:	49 89 f7             	mov    r15,rsi
     1354424:	49 89 fe             	mov    r14,rdi
     1354427:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135442e:	00 00 
     1354430:	48 89 84 24 68 03 00 	mov    QWORD PTR [rsp+0x368],rax
     1354437:	00 
     1354438:	4c 8d a6 20 02 00 00 	lea    r12,[rsi+0x220]
     135443f:	4c 8d 6f 18          	lea    r13,[rdi+0x18]
     1354443:	4c 89 ef             	mov    rdi,r13
     1354446:	4c 89 e6             	mov    rsi,r12
     1354449:	e8 a0 b2 74 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     135444e:	84 c0                	test   al,al
     1354450:	75 10                	jne    1354462 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1999e6>
     1354452:	41 c6 46 30 00       	mov    BYTE PTR [r14+0x30],0x0
     1354457:	4c 89 ef             	mov    rdi,r13
     135445a:	4c 89 e6             	mov    rsi,r12
     135445d:	e8 1e 9c 49 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     1354462:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
     1354466:	48 89 df             	mov    rdi,rbx
     1354469:	e8 c9 d0 1f 00       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     135446e:	4c 8d a4 24 20 03 00 	lea    r12,[rsp+0x320]
     1354475:	00 
     1354476:	4c 89 e7             	mov    rdi,r12
     1354479:	48 89 c6             	mov    rsi,rax
     135447c:	e8 cf 81 d3 ff       	call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>
     1354481:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     1354488:	00 
     1354489:	4c 89 fe             	mov    rsi,r15
     135448c:	4c 89 e2             	mov    rdx,r12
     135448f:	e8 54 61 00 00       	call   135a5e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19fb6c>
     1354494:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
     1354499:	41 c6 44 24 f8 01    	mov    BYTE PTR [r12-0x8],0x1
     135449f:	48 8d 8c 24 80 00 00 	lea    rcx,[rsp+0x80]
     13544a6:	00 
     13544a7:	4c 89 e7             	mov    rdi,r12
     13544aa:	4c 89 fe             	mov    rsi,r15
     13544ad:	48 89 da             	mov    rdx,rbx
     13544b0:	e8 53 0a 00 00       	call   1354f08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a48c>
     13544b5:	83 bb 90 02 00 00 00 	cmp    DWORD PTR [rbx+0x290],0x0
     13544bc:	0f 94 c0             	sete   al
     13544bf:	80 bb 80 00 00 00 00 	cmp    BYTE PTR [rbx+0x80],0x0
     13544c6:	0f 94 c1             	sete   cl
     13544c9:	20 c1                	and    cl,al
     13544cb:	48 89 e3             	mov    rbx,rsp
     13544ce:	88 4b 78             	mov    BYTE PTR [rbx+0x78],cl
     13544d1:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     13544d8:	00 
     13544d9:	e8 5e 5b ed ff       	call   122a03c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6f5c0>
     13544de:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
     13544e5:	00 
     13544e6:	e8 e1 a2 74 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     13544eb:	49 8b 06             	mov    rax,QWORD PTR [r14]
     13544ee:	4c 89 f7             	mov    rdi,r14
     13544f1:	48 89 de             	mov    rsi,rbx
     13544f4:	ff 50 20             	call   QWORD PTR [rax+0x20]
     13544f7:	4c 89 e7             	mov    rdi,r12
     13544fa:	e8 e1 09 00 00       	call   1354ee0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a464>
     13544ff:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1354506:	00 00 
     1354508:	48 3b 84 24 68 03 00 	cmp    rax,QWORD PTR [rsp+0x368]
     135450f:	00 
     1354510:	75 5b                	jne    135456d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199af1>
     1354512:	48 81 c4 70 03 00 00 	add    rsp,0x370
     1354519:	5b                   	pop    rbx
     135451a:	41 5c                	pop    r12
     135451c:	41 5d                	pop    r13
     135451e:	41 5e                	pop    r14
     1354520:	41 5f                	pop    r15
     1354522:	c3                   	ret
     1354523:	48 89 c3             	mov    rbx,rax
     1354526:	4c 89 e7             	mov    rdi,r12
     1354529:	e8 b2 09 00 00       	call   1354ee0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a464>
     135452e:	eb 22                	jmp    1354552 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199ad6>
     1354530:	48 89 c3             	mov    rbx,rax
     1354533:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     135453a:	00 
     135453b:	e8 fc 5a ed ff       	call   122a03c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6f5c0>
     1354540:	eb 03                	jmp    1354545 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199ac9>
     1354542:	48 89 c3             	mov    rbx,rax
     1354545:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
     135454c:	00 
     135454d:	e8 7a a2 74 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1354552:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1354559:	00 00 
     135455b:	48 3b 84 24 68 03 00 	cmp    rax,QWORD PTR [rsp+0x368]
     1354562:	00 
     1354563:	75 08                	jne    135456d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199af1>
     1354565:	48 89 df             	mov    rdi,rbx
     1354568:	e8 63 b7 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     135456d:	e8 3e b5 49 00       	call   17efab0 <__stack_chk_fail@plt>

### owner slot +0x120 -> 0x1354572
     1354572:	41 56                	push   r14
     1354574:	53                   	push   rbx
     1354575:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
     135457c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1354583:	00 00 
     1354585:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
     135458c:	00 
     135458d:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
     1354591:	49 8b 78 08          	mov    rdi,QWORD PTR [r8+0x8]
     1354595:	48 8d 44 24 10       	lea    rax,[rsp+0x10]
     135459a:	48 89 38             	mov    QWORD PTR [rax],rdi
     135459d:	c6 40 08 01          	mov    BYTE PTR [rax+0x8],0x1
     13545a1:	4d 8d 48 10          	lea    r9,[r8+0x10]
     13545a5:	31 ff                	xor    edi,edi
     13545a7:	4c 8d 44 24 08       	lea    r8,[rsp+0x8]
     13545ac:	41 88 38             	mov    BYTE PTR [r8],dil
     13545af:	41 88 78 04          	mov    BYTE PTR [r8+0x4],dil
     13545b3:	4c 89 04 24          	mov    QWORD PTR [rsp],r8
     13545b7:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     13545bc:	4c 89 f7             	mov    rdi,r14
     13545bf:	49 89 c0             	mov    r8,rax
     13545c2:	e8 31 07 00 00       	call   1354cf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a27c>
     13545c7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     13545ca:	48 89 df             	mov    rdi,rbx
     13545cd:	4c 89 f6             	mov    rsi,r14
     13545d0:	ff 50 38             	call   QWORD PTR [rax+0x38]
     13545d3:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     13545d8:	e8 dd 08 00 00       	call   1354eba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a43e>
     13545dd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13545e4:	00 00 
     13545e6:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
     13545ed:	00 
     13545ee:	75 33                	jne    1354623 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199ba7>
     13545f0:	48 81 c4 f8 00 00 00 	add    rsp,0xf8
     13545f7:	5b                   	pop    rbx
     13545f8:	41 5e                	pop    r14
     13545fa:	c3                   	ret
     13545fb:	48 89 c3             	mov    rbx,rax
     13545fe:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1354603:	e8 b2 08 00 00       	call   1354eba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a43e>
     1354608:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135460f:	00 00 
     1354611:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
     1354618:	00 
     1354619:	75 08                	jne    1354623 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199ba7>
     135461b:	48 89 df             	mov    rdi,rbx
     135461e:	e8 ad b6 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1354623:	e8 88 b4 49 00       	call   17efab0 <__stack_chk_fail@plt>

### owner slot +0x128 -> 0x1354628
     1354628:	41 56                	push   r14
     135462a:	53                   	push   rbx
     135462b:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
     1354632:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1354639:	00 00 
     135463b:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
     1354642:	00 
     1354643:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
     1354647:	49 8b 78 08          	mov    rdi,QWORD PTR [r8+0x8]
     135464b:	48 8d 44 24 10       	lea    rax,[rsp+0x10]
     1354650:	48 89 38             	mov    QWORD PTR [rax],rdi
     1354653:	c6 40 08 01          	mov    BYTE PTR [rax+0x8],0x1
     1354657:	4d 8d 48 10          	lea    r9,[r8+0x10]
     135465b:	31 ff                	xor    edi,edi
     135465d:	4c 8d 44 24 08       	lea    r8,[rsp+0x8]
     1354662:	41 88 38             	mov    BYTE PTR [r8],dil
     1354665:	41 88 78 04          	mov    BYTE PTR [r8+0x4],dil
     1354669:	4c 89 04 24          	mov    QWORD PTR [rsp],r8
     135466d:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     1354672:	4c 89 f7             	mov    rdi,r14
     1354675:	49 89 c0             	mov    r8,rax
     1354678:	e8 7b 06 00 00       	call   1354cf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a27c>
     135467d:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1354680:	48 89 df             	mov    rdi,rbx
     1354683:	4c 89 f6             	mov    rsi,r14
     1354686:	ff 50 40             	call   QWORD PTR [rax+0x40]
     1354689:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     135468e:	e8 27 08 00 00       	call   1354eba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a43e>
     1354693:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135469a:	00 00 
     135469c:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
     13546a3:	00 
     13546a4:	75 33                	jne    13546d9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199c5d>
     13546a6:	48 81 c4 f8 00 00 00 	add    rsp,0xf8
     13546ad:	5b                   	pop    rbx
     13546ae:	41 5e                	pop    r14
     13546b0:	c3                   	ret
     13546b1:	48 89 c3             	mov    rbx,rax
     13546b4:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     13546b9:	e8 fc 07 00 00       	call   1354eba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a43e>
     13546be:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13546c5:	00 00 
     13546c7:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
     13546ce:	00 
     13546cf:	75 08                	jne    13546d9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199c5d>
     13546d1:	48 89 df             	mov    rdi,rbx
     13546d4:	e8 f7 b5 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     13546d9:	e8 d2 b3 49 00       	call   17efab0 <__stack_chk_fail@plt>

### owner slot +0x130 -> 0x13546de
     13546de:	41 56                	push   r14
     13546e0:	53                   	push   rbx
     13546e1:	48 81 ec 08 01 00 00 	sub    rsp,0x108
     13546e8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13546ef:	00 00 
     13546f1:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
     13546f8:	00 
     13546f9:	83 ba 90 02 00 00 00 	cmp    DWORD PTR [rdx+0x290],0x0
     1354700:	74 04                	je     1354706 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199c8a>
     1354702:	c6 47 30 01          	mov    BYTE PTR [rdi+0x30],0x1
     1354706:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
     135470a:	31 c0                	xor    eax,eax
     135470c:	4c 8d 44 24 20       	lea    r8,[rsp+0x20]
     1354711:	41 88 00             	mov    BYTE PTR [r8],al
     1354714:	41 88 40 08          	mov    BYTE PTR [r8+0x8],al
     1354718:	4c 8d 4c 24 10       	lea    r9,[rsp+0x10]
     135471d:	41 88 01             	mov    BYTE PTR [r9],al
     1354720:	41 88 41 08          	mov    BYTE PTR [r9+0x8],al
     1354724:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1354729:	88 07                	mov    BYTE PTR [rdi],al
     135472b:	88 47 04             	mov    BYTE PTR [rdi+0x4],al
     135472e:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
     1354732:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
     1354737:	4c 89 f7             	mov    rdi,r14
     135473a:	e8 b9 05 00 00       	call   1354cf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a27c>
     135473f:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1354742:	48 89 df             	mov    rdi,rbx
     1354745:	4c 89 f6             	mov    rsi,r14
     1354748:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135474b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1354750:	e8 65 07 00 00       	call   1354eba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a43e>
     1354755:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135475c:	00 00 
     135475e:	48 3b 84 24 00 01 00 	cmp    rax,QWORD PTR [rsp+0x100]
     1354765:	00 
     1354766:	75 33                	jne    135479b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199d1f>
     1354768:	48 81 c4 08 01 00 00 	add    rsp,0x108
     135476f:	5b                   	pop    rbx
     1354770:	41 5e                	pop    r14
     1354772:	c3                   	ret
     1354773:	48 89 c3             	mov    rbx,rax
     1354776:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     135477b:	e8 3a 07 00 00       	call   1354eba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a43e>
     1354780:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1354787:	00 00 
     1354789:	48 3b 84 24 00 01 00 	cmp    rax,QWORD PTR [rsp+0x100]
     1354790:	00 
     1354791:	75 08                	jne    135479b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199d1f>
     1354793:	48 89 df             	mov    rdi,rbx
     1354796:	e8 35 b5 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     135479b:	e8 10 b3 49 00       	call   17efab0 <__stack_chk_fail@plt>

### owner slot +0x140 -> 0x13547a0
     13547a0:	41 57                	push   r15
     13547a2:	41 56                	push   r14
     13547a4:	41 55                	push   r13
     13547a6:	41 54                	push   r12
     13547a8:	53                   	push   rbx
     13547a9:	48 81 ec 60 01 00 00 	sub    rsp,0x160
     13547b0:	4c 8b b4 24 90 01 00 	mov    r14,QWORD PTR [rsp+0x190]
     13547b7:	00 
     13547b8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13547bf:	00 00 
     13547c1:	48 89 84 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rax
     13547c8:	00 
     13547c9:	4d 85 f6             	test   r14,r14
     13547cc:	0f 84 32 01 00 00    	je     1354904 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199e88>
     13547d2:	41 83 be 90 02 00 00 	cmp    DWORD PTR [r14+0x290],0x0
     13547d9:	00 
     13547da:	0f 85 24 01 00 00    	jne    1354904 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199e88>
     13547e0:	41 80 be 80 00 00 00 	cmp    BYTE PTR [r14+0x80],0x0
     13547e7:	00 
     13547e8:	0f 85 16 01 00 00    	jne    1354904 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199e88>
     13547ee:	48 89 fb             	mov    rbx,rdi
     13547f1:	8b 84 24 98 01 00 00 	mov    eax,DWORD PTR [rsp+0x198]
     13547f8:	49 8b 79 08          	mov    rdi,QWORD PTR [r9+0x8]
     13547fc:	4c 8d 44 24 10       	lea    r8,[rsp+0x10]
     1354801:	49 89 38             	mov    QWORD PTR [r8],rdi
     1354804:	40 b7 01             	mov    dil,0x1
     1354807:	41 88 78 08          	mov    BYTE PTR [r8+0x8],dil
     135480b:	49 83 c1 10          	add    r9,0x10
     135480f:	4c 8d 94 24 80 00 00 	lea    r10,[rsp+0x80]
     1354816:	00 
     1354817:	41 89 02             	mov    DWORD PTR [r10],eax
     135481a:	41 88 7a 04          	mov    BYTE PTR [r10+0x4],dil
     135481e:	4c 89 14 24          	mov    QWORD PTR [rsp],r10
     1354822:	4c 8d bc 24 88 00 00 	lea    r15,[rsp+0x88]
     1354829:	00 
     135482a:	4c 89 ff             	mov    rdi,r15
     135482d:	e8 c6 04 00 00       	call   1354cf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a27c>
     1354832:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     1354836:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1354839:	4c 89 fe             	mov    rsi,r15
     135483c:	ff 50 30             	call   QWORD PTR [rax+0x30]
     135483f:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
     1354846:	00 
     1354847:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     135484c:	e8 ef 96 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1354851:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]
     1354856:	48 8d b4 24 c0 00 00 	lea    rsi,[rsp+0xc0]
     135485d:	00 
     135485e:	4c 89 ff             	mov    rdi,r15
     1354861:	e8 da 96 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1354866:	48 8d b4 24 e0 00 00 	lea    rsi,[rsp+0xe0]
     135486d:	00 
     135486e:	8a 46 f8             	mov    al,BYTE PTR [rsi-0x8]
     1354871:	4c 8d 6c 24 48       	lea    r13,[rsp+0x48]
     1354876:	41 88 45 f8          	mov    BYTE PTR [r13-0x8],al
     135487a:	4c 89 ef             	mov    rdi,r13
     135487d:	e8 be 96 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1354882:	4c 8d 64 24 60       	lea    r12,[rsp+0x60]
     1354887:	48 8d b4 24 f8 00 00 	lea    rsi,[rsp+0xf8]
     135488e:	00 
     135488f:	4c 89 e7             	mov    rdi,r12
     1354892:	e8 cf 7e 77 ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
     1354897:	4c 89 f7             	mov    rdi,r14
     135489a:	e8 36 fb ff ff       	call   13543d5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199959>
     135489f:	49 83 c6 68          	add    r14,0x68
     13548a3:	4c 89 e7             	mov    rdi,r12
     13548a6:	4c 89 f6             	mov    rsi,r14
     13548a9:	e8 8c da 7a ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
     13548ae:	48 8d 35 53 48 0e ff 	lea    rsi,[rip+0xffffffffff0e4853]        # 439108 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb57>
     13548b5:	4c 89 e7             	mov    rdi,r12
     13548b8:	e8 5b 5d ac ff       	call   e1a618 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe769e>
     13548bd:	84 c0                	test   al,al
     13548bf:	74 15                	je     13548d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199e5a>
     13548c1:	80 7b 30 00          	cmp    BYTE PTR [rbx+0x30],0x0
     13548c5:	74 0f                	je     13548d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199e5a>
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
     1354927:	c3                   	ret
     1354928:	48 89 c3             	mov    rbx,rax
     135492b:	4c 89 ef             	mov    rdi,r13
     135492e:	e8 5d 95 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1354933:	eb 03                	jmp    1354938 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199ebc>
     1354935:	48 89 c3             	mov    rbx,rax
     1354938:	4c 89 ff             	mov    rdi,r15
     135493b:	e8 50 95 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1354940:	eb 03                	jmp    1354945 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199ec9>
     1354942:	48 89 c3             	mov    rbx,rax
     1354945:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     135494a:	e8 41 95 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     135494f:	eb 14                	jmp    1354965 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199ee9>
     1354951:	eb 00                	jmp    1354953 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199ed7>
     1354953:	48 89 c3             	mov    rbx,rax
     1354956:	eb 0d                	jmp    1354965 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199ee9>
     1354958:	48 89 c3             	mov    rbx,rax
     135495b:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1354960:	e8 7b 05 00 00       	call   1354ee0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a464>
     1354965:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]

### owner slot +0x148 -> 0x1354992
     1354992:	41 56                	push   r14
     1354994:	53                   	push   rbx
     1354995:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
     135499c:	48 89 fb             	mov    rbx,rdi
     135499f:	48 8b 84 24 10 01 00 	mov    rax,QWORD PTR [rsp+0x110]
     13549a6:	00 
     13549a7:	64 48 8b 3c 25 28 00 	mov    rdi,QWORD PTR fs:0x28
     13549ae:	00 00 
     13549b0:	48 89 bc 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rdi
     13549b7:	00 
     13549b8:	48 85 c0             	test   rax,rax
     13549bb:	74 12                	je     13549cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199f53>
     13549bd:	83 b8 90 02 00 00 00 	cmp    DWORD PTR [rax+0x290],0x0
     13549c4:	75 09                	jne    13549cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199f53>
     13549c6:	80 b8 80 00 00 00 00 	cmp    BYTE PTR [rax+0x80],0x0
     13549cd:	74 52                	je     1354a21 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199fa5>
     13549cf:	8b 84 24 18 01 00 00 	mov    eax,DWORD PTR [rsp+0x118]
     13549d6:	49 8b 79 08          	mov    rdi,QWORD PTR [r9+0x8]
     13549da:	4c 8d 44 24 10       	lea    r8,[rsp+0x10]
     13549df:	49 89 38             	mov    QWORD PTR [r8],rdi
     13549e2:	40 b7 01             	mov    dil,0x1
     13549e5:	41 88 78 08          	mov    BYTE PTR [r8+0x8],dil
     13549e9:	49 83 c1 10          	add    r9,0x10
     13549ed:	4c 8d 54 24 08       	lea    r10,[rsp+0x8]
     13549f2:	41 89 02             	mov    DWORD PTR [r10],eax
     13549f5:	41 88 7a 04          	mov    BYTE PTR [r10+0x4],dil
     13549f9:	4c 89 14 24          	mov    QWORD PTR [rsp],r10
     13549fd:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     1354a02:	4c 89 f7             	mov    rdi,r14
     1354a05:	e8 ee 02 00 00       	call   1354cf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a27c>
     1354a0a:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     1354a0e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1354a11:	4c 89 f6             	mov    rsi,r14
     1354a14:	ff 50 30             	call   QWORD PTR [rax+0x30]
     1354a17:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1354a1c:	e8 99 04 00 00       	call   1354eba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a43e>
     1354a21:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1354a28:	00 00 
     1354a2a:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
     1354a31:	00 
     1354a32:	75 33                	jne    1354a67 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199feb>
     1354a34:	48 81 c4 f8 00 00 00 	add    rsp,0xf8
     1354a3b:	5b                   	pop    rbx
     1354a3c:	41 5e                	pop    r14
     1354a3e:	c3                   	ret
     1354a3f:	48 89 c3             	mov    rbx,rax
     1354a42:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1354a47:	e8 6e 04 00 00       	call   1354eba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a43e>
     1354a4c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1354a53:	00 00 
     1354a55:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
     1354a5c:	00 
     1354a5d:	75 08                	jne    1354a67 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199feb>
     1354a5f:	48 89 df             	mov    rdi,rbx
     1354a62:	e8 69 b2 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1354a67:	e8 44 b0 49 00       	call   17efab0 <__stack_chk_fail@plt>

### owner slot +0x158 -> 0x1354a6c
     1354a6c:	41 56                	push   r14
     1354a6e:	53                   	push   rbx
     1354a6f:	48 81 ec 08 01 00 00 	sub    rsp,0x108
     1354a76:	48 89 fb             	mov    rbx,rdi
     1354a79:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
     1354a80:	00 
     1354a81:	64 48 8b 3c 25 28 00 	mov    rdi,QWORD PTR fs:0x28
     1354a88:	00 00 
     1354a8a:	48 89 bc 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rdi
     1354a91:	00 
     1354a92:	48 8b 00             	mov    rax,QWORD PTR [rax]
     1354a95:	4c 8d 44 24 20       	lea    r8,[rsp+0x20]
     1354a9a:	49 89 00             	mov    QWORD PTR [r8],rax
     1354a9d:	41 c6 40 08 01       	mov    BYTE PTR [r8+0x8],0x1
     1354aa2:	31 c0                	xor    eax,eax
     1354aa4:	4c 8d 4c 24 10       	lea    r9,[rsp+0x10]
     1354aa9:	41 88 01             	mov    BYTE PTR [r9],al
     1354aac:	41 88 41 08          	mov    BYTE PTR [r9+0x8],al
     1354ab0:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1354ab5:	88 07                	mov    BYTE PTR [rdi],al
     1354ab7:	88 47 04             	mov    BYTE PTR [rdi+0x4],al
     1354aba:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
     1354abe:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
     1354ac3:	4c 89 f7             	mov    rdi,r14
     1354ac6:	e8 2d 02 00 00       	call   1354cf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a27c>
     1354acb:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     1354acf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1354ad2:	4c 89 f6             	mov    rsi,r14
     1354ad5:	ff 50 48             	call   QWORD PTR [rax+0x48]
     1354ad8:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1354add:	e8 d8 03 00 00       	call   1354eba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a43e>
     1354ae2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1354ae9:	00 00 
     1354aeb:	48 3b 84 24 00 01 00 	cmp    rax,QWORD PTR [rsp+0x100]
     1354af2:	00 
     1354af3:	75 33                	jne    1354b28 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a0ac>
     1354af5:	48 81 c4 08 01 00 00 	add    rsp,0x108
     1354afc:	5b                   	pop    rbx
     1354afd:	41 5e                	pop    r14
     1354aff:	c3                   	ret
     1354b00:	48 89 c3             	mov    rbx,rax
     1354b03:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1354b08:	e8 ad 03 00 00       	call   1354eba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a43e>
     1354b0d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1354b14:	00 00 
     1354b16:	48 3b 84 24 00 01 00 	cmp    rax,QWORD PTR [rsp+0x100]
     1354b1d:	00 
     1354b1e:	75 08                	jne    1354b28 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a0ac>
     1354b20:	48 89 df             	mov    rdi,rbx
     1354b23:	e8 a8 b1 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1354b28:	e8 83 af 49 00       	call   17efab0 <__stack_chk_fail@plt>

### owner slot +0x160 -> 0x1354b2e
     1354b2e:	41 56                	push   r14
     1354b30:	53                   	push   rbx
     1354b31:	48 81 ec 08 01 00 00 	sub    rsp,0x108
     1354b38:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1354b3f:	00 00 
     1354b41:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
     1354b48:	00 
     1354b49:	41 f7 d1             	not    r9d
     1354b4c:	66 41 f7 c1 01 01    	test   r9w,0x101
     1354b52:	75 5b                	jne    1354baf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a133>
     1354b54:	48 89 fb             	mov    rbx,rdi
     1354b57:	31 c0                	xor    eax,eax
     1354b59:	4c 8d 44 24 20       	lea    r8,[rsp+0x20]
     1354b5e:	41 88 00             	mov    BYTE PTR [r8],al
     1354b61:	41 88 40 08          	mov    BYTE PTR [r8+0x8],al
     1354b65:	4c 8d 4c 24 10       	lea    r9,[rsp+0x10]
     1354b6a:	41 88 01             	mov    BYTE PTR [r9],al
     1354b6d:	41 88 41 08          	mov    BYTE PTR [r9+0x8],al
     1354b71:	48 8d 05 a4 82 08 ff 	lea    rax,[rip+0xffffffffff0882a4]        # 3dce1c <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x286b>
     1354b78:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     1354b7c:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
     1354b81:	4c 89 f7             	mov    rdi,r14
     1354b84:	e8 6f 01 00 00       	call   1354cf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a27c>
     1354b89:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     1354b8d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1354b90:	4c 89 f6             	mov    rsi,r14
     1354b93:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1354b96:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     1354b9a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1354b9d:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     1354ba2:	ff 50 30             	call   QWORD PTR [rax+0x30]
     1354ba5:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1354baa:	e8 0b 03 00 00       	call   1354eba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a43e>
     1354baf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1354bb6:	00 00 
     1354bb8:	48 3b 84 24 00 01 00 	cmp    rax,QWORD PTR [rsp+0x100]
     1354bbf:	00 
     1354bc0:	75 33                	jne    1354bf5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a179>
     1354bc2:	48 81 c4 08 01 00 00 	add    rsp,0x108
     1354bc9:	5b                   	pop    rbx
     1354bca:	41 5e                	pop    r14
     1354bcc:	c3                   	ret
     1354bcd:	48 89 c3             	mov    rbx,rax
     1354bd0:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1354bd5:	e8 e0 02 00 00       	call   1354eba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a43e>
     1354bda:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1354be1:	00 00 
     1354be3:	48 3b 84 24 00 01 00 	cmp    rax,QWORD PTR [rsp+0x100]
     1354bea:	00 
     1354beb:	75 08                	jne    1354bf5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a179>
     1354bed:	48 89 df             	mov    rdi,rbx
     1354bf0:	e8 db b0 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1354bf5:	e8 b6 ae 49 00       	call   17efab0 <__stack_chk_fail@plt>

### owner slot +0x168 -> 0x1354bfa
     1354bfa:	41 56                	push   r14
     1354bfc:	53                   	push   rbx
     1354bfd:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
     1354c04:	48 89 fb             	mov    rbx,rdi
     1354c07:	8b 84 24 10 01 00 00 	mov    eax,DWORD PTR [rsp+0x110]
     1354c0e:	64 48 8b 3c 25 28 00 	mov    rdi,QWORD PTR fs:0x28
     1354c15:	00 00 
     1354c17:	48 89 bc 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rdi
     1354c1e:	00 
     1354c1f:	f7 d0                	not    eax
     1354c21:	66 a9 01 01          	test   ax,0x101
     1354c25:	75 53                	jne    1354c7a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a1fe>
     1354c27:	49 8b 41 08          	mov    rax,QWORD PTR [r9+0x8]
     1354c2b:	4c 8d 44 24 10       	lea    r8,[rsp+0x10]
     1354c30:	49 89 00             	mov    QWORD PTR [r8],rax
     1354c33:	41 c6 40 08 01       	mov    BYTE PTR [r8+0x8],0x1
     1354c38:	49 83 c1 10          	add    r9,0x10
     1354c3c:	48 8d 05 e1 81 08 ff 	lea    rax,[rip+0xffffffffff0881e1]        # 3dce24 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2873>
     1354c43:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     1354c47:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     1354c4c:	4c 89 f7             	mov    rdi,r14
     1354c4f:	e8 a4 00 00 00       	call   1354cf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a27c>
     1354c54:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     1354c58:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1354c5b:	4c 89 f6             	mov    rsi,r14
     1354c5e:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1354c61:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     1354c65:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1354c68:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     1354c6d:	ff 50 30             	call   QWORD PTR [rax+0x30]
     1354c70:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1354c75:	e8 40 02 00 00       	call   1354eba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a43e>
     1354c7a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1354c81:	00 00 
     1354c83:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
     1354c8a:	00 
     1354c8b:	75 33                	jne    1354cc0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a244>
     1354c8d:	48 81 c4 f8 00 00 00 	add    rsp,0xf8
     1354c94:	5b                   	pop    rbx
     1354c95:	41 5e                	pop    r14
     1354c97:	c3                   	ret
     1354c98:	48 89 c3             	mov    rbx,rax
     1354c9b:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1354ca0:	e8 15 02 00 00       	call   1354eba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a43e>
     1354ca5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1354cac:	00 00 
     1354cae:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
     1354cb5:	00 
     1354cb6:	75 08                	jne    1354cc0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a244>
     1354cb8:	48 89 df             	mov    rdi,rbx
     1354cbb:	e8 10 b0 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1354cc0:	e8 eb ad 49 00       	call   17efab0 <__stack_chk_fail@plt>

### owner slot +0x170 -> 0x1354cc6
     1354cc6:	49 8b 41 20          	mov    rax,QWORD PTR [r9+0x20]
     1354cca:	48 89 c6             	mov    rsi,rax
     1354ccd:	48 f7 de             	neg    rsi
     1354cd0:	48 0f 48 f0          	cmovs  rsi,rax
     1354cd4:	41 0f b6 41 38       	movzx  eax,BYTE PTR [r9+0x38]
     1354cd9:	83 f8 02             	cmp    eax,0x2
     1354cdc:	74 09                	je     1354ce7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a26b>
     1354cde:	83 f8 03             	cmp    eax,0x3
     1354ce1:	75 14                	jne    1354cf7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a27b>
     1354ce3:	6a 0d                	push   0xd
     1354ce5:	eb 02                	jmp    1354ce9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a26d>
     1354ce7:	6a 0c                	push   0xc
     1354ce9:	58                   	pop    rax
     1354cea:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     1354cee:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
     1354cf1:	48 8b 04 c1          	mov    rax,QWORD PTR [rcx+rax*8]
     1354cf5:	ff e0                	jmp    rax
     1354cf7:	c3                   	ret

## Signal-state constructor callers with second-arg setup
- readiness constructor FDE=(15700428, 15722027)
