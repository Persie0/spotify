# Smart Skip interval provider names

Proven final mapping:
- dependency+0xb08 <- constructor arg rcx <- factory [rsp+0x1b8]
- dependency+0xb10 <- constructor stack arg +0x48 <- factory [rsp+0x190]

## Factory slot rsp+0x1b8
### 0x135c8cb: mov    QWORD PTR [rsp+0x1b8],rax
     135c873:	6a 12                	push   0x12
     135c875:	5a                   	pop    rdx
     135c876:	c3                   	ret
     135c877:	cc                   	int3
     135c878:	55                   	push   rbp
     135c879:	41 57                	push   r15
     135c87b:	41 56                	push   r14
     135c87d:	41 55                	push   r13
     135c87f:	41 54                	push   r12
     135c881:	53                   	push   rbx
     135c882:	48 81 ec 68 03 00 00 	sub    rsp,0x368
     135c889:	49 89 cf             	mov    r15,rcx
     135c88c:	48 89 d5             	mov    rbp,rdx
     135c88f:	48 89 bc 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rdi
     135c896:	00 
     135c897:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135c89e:	00 00 
     135c8a0:	48 89 84 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rax
     135c8a7:	00 
     135c8a8:	48 89 cf             	mov    rdi,rcx
     135c8ab:	e8 de a3 95 ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
     135c8b0:	49 89 c4             	mov    r12,rax
     135c8b3:	4c 89 ff             	mov    rdi,r15
     135c8b6:	e8 8f 6f 8f ff       	call   c5384a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a07ea>
     135c8bb:	48 89 84 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],rax
     135c8c2:	00 
     135c8c3:	4c 89 ff             	mov    rdi,r15
     135c8c6:	e8 ff 69 80 ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
     135c8cb:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
     135c8d2:	00 
     135c8d3:	4c 89 ff             	mov    rdi,r15
     135c8d6:	e8 b9 b6 82 ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
     135c8db:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
     135c8e2:	00 
     135c8e3:	4c 89 ff             	mov    rdi,r15
     135c8e6:	e8 d3 b6 82 ff       	call   b87fbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f5e>
     135c8eb:	48 89 84 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rax
     135c8f2:	00 
     135c8f3:	4c 89 ff             	mov    rdi,r15
     135c8f6:	e8 55 4e 8b ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
     135c8fb:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
     135c902:	00 
     135c903:	4c 89 ff             	mov    rdi,r15
     135c906:	e8 69 6f 8f ff       	call   c53874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0814>
     135c90b:	48 89 84 24 98 01 00 	mov    QWORD PTR [rsp+0x198],rax
     135c912:	00 
     135c913:	4c 89 ff             	mov    rdi,r15
     135c916:	e8 ad ab 95 ff       	call   cb74c8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x204468>
     135c91b:	49 89 c5             	mov    r13,rax
     135c91e:	4c 89 ff             	mov    rdi,r15
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

### 0x135ce83: mov    rcx,QWORD PTR [rsp+0x1b8]
     135ce0e:	48 8b 84 24 68 01 00 	mov    rax,QWORD PTR [rsp+0x168]
     135ce15:	00 
     135ce16:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     135ce1b:	4c 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],r9
     135ce20:	48 8b 84 24 40 01 00 	mov    rax,QWORD PTR [rsp+0x140]
     135ce27:	00 
     135ce28:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     135ce2d:	48 8d 84 24 20 02 00 	lea    rax,[rsp+0x220]
     135ce34:	00 
     135ce35:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     135ce3a:	48 8b 84 24 48 01 00 	mov    rax,QWORD PTR [rsp+0x148]
     135ce41:	00 
     135ce42:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     135ce47:	48 8b 84 24 98 01 00 	mov    rax,QWORD PTR [rsp+0x198]
     135ce4e:	00 
     135ce4f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     135ce54:	48 8b 84 24 a0 01 00 	mov    rax,QWORD PTR [rsp+0x1a0]
     135ce5b:	00 
     135ce5c:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     135ce60:	48 8d b4 24 30 02 00 	lea    rsi,[rsp+0x230]
     135ce67:	00 
     135ce68:	4c 8b 84 24 b0 01 00 	mov    r8,QWORD PTR [rsp+0x1b0]
     135ce6f:	00 
     135ce70:	4c 8b 8c 24 a8 01 00 	mov    r9,QWORD PTR [rsp+0x1a8]
     135ce77:	00 
     135ce78:	4c 89 f7             	mov    rdi,r14
     135ce7b:	48 8b 94 24 c0 01 00 	mov    rdx,QWORD PTR [rsp+0x1c0]
     135ce82:	00 
     135ce83:	48 8b 8c 24 b8 01 00 	mov    rcx,QWORD PTR [rsp+0x1b8]
     135ce8a:	00 
     135ce8b:	e8 c6 01 00 00       	call   135d056 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a25da>
     135ce90:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
     135ce97:	00 
     135ce98:	e8 8b e8 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135ce9d:	48 8d bc 24 98 02 00 	lea    rdi,[rsp+0x298]
     135cea4:	00 
     135cea5:	e8 62 85 47 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     135ceaa:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
     135ceb1:	00 
     135ceb2:	e8 bd 9f 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
     135ceb7:	48 8b 84 24 88 01 00 	mov    rax,QWORD PTR [rsp+0x188]
     135cebe:	00 
     135cebf:	4c 89 30             	mov    QWORD PTR [rax],r14
     135cec2:	49 89 c6             	mov    r14,rax
     135cec5:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
     135cecc:	00 
     135cecd:	e8 56 e8 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135ced2:	48 8d bc 24 e8 01 00 	lea    rdi,[rsp+0x1e8]
     135ced9:	00 
     135ceda:	e8 81 9e 95 ff       	call   cb6d60 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203d00>
     135cedf:	6a 30                	push   0x30
     135cee1:	5b                   	pop    rbx
     135cee2:	48 8d 3c 1c          	lea    rdi,[rsp+rbx*1]
     135cee6:	48 81 c7 a0 02 00 00 	add    rdi,0x2a0
     135ceed:	e8 78 d0 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135cef2:	48 83 c3 d0          	add    rbx,0xffffffffffffffd0
     135cef6:	48 83 fb d0          	cmp    rbx,0xffffffffffffffd0
     135cefa:	75 e6                	jne    135cee2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2466>
     135cefc:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     135cf03:	00 
     135cf04:	e8 e5 a9 95 ff       	call   cb78ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20488e>
     135cf09:	48 8d bc 24 18 02 00 	lea    rdi,[rsp+0x218]
     135cf10:	00 
     135cf11:	e8 f6 84 47 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     135cf16:	48 8b bc 24 28 02 00 	mov    rdi,QWORD PTR [rsp+0x228]
     135cf1d:	00 
     135cf1e:	e8 63 15 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135cf23:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135cf2a:	00 00 
     135cf2c:	48 3b 84 24 60 03 00 	cmp    rax,QWORD PTR [rsp+0x360]
     135cf33:	00 
     135cf34:	0f 85 16 01 00 00    	jne    135d050 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a25d4>
     135cf3a:	4c 89 f0             	mov    rax,r14
     135cf3d:	48 81 c4 68 03 00 00 	add    rsp,0x368
     135cf44:	5b                   	pop    rbx
     135cf45:	41 5c                	pop    r12
     135cf47:	41 5d                	pop    r13
     135cf49:	41 5e                	pop    r14
     135cf4b:	41 5f                	pop    r15
     135cf4d:	5d                   	pop    rbp
     135cf4e:	c3                   	ret
     135cf4f:	e8 6b d0 71 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
     135cf54:	e8 66 d0 71 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
     135cf59:	48 89 c3             	mov    rbx,rax

## Factory slot rsp+0x190
### 0x135c926: mov    QWORD PTR [rsp+0x190],rax
     135c8b6:	e8 8f 6f 8f ff       	call   c5384a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a07ea>
     135c8bb:	48 89 84 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],rax
     135c8c2:	00 
     135c8c3:	4c 89 ff             	mov    rdi,r15
     135c8c6:	e8 ff 69 80 ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
     135c8cb:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
     135c8d2:	00 
     135c8d3:	4c 89 ff             	mov    rdi,r15
     135c8d6:	e8 b9 b6 82 ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
     135c8db:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
     135c8e2:	00 
     135c8e3:	4c 89 ff             	mov    rdi,r15
     135c8e6:	e8 d3 b6 82 ff       	call   b87fbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f5e>
     135c8eb:	48 89 84 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rax
     135c8f2:	00 
     135c8f3:	4c 89 ff             	mov    rdi,r15
     135c8f6:	e8 55 4e 8b ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
     135c8fb:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
     135c902:	00 
     135c903:	4c 89 ff             	mov    rdi,r15
     135c906:	e8 69 6f 8f ff       	call   c53874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0814>
     135c90b:	48 89 84 24 98 01 00 	mov    QWORD PTR [rsp+0x198],rax
     135c912:	00 
     135c913:	4c 89 ff             	mov    rdi,r15
     135c916:	e8 ad ab 95 ff       	call   cb74c8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x204468>
     135c91b:	49 89 c5             	mov    r13,rax
     135c91e:	4c 89 ff             	mov    rdi,r15
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

### 0x135cde7: mov    rax,QWORD PTR [rsp+0x190]
     135cd71:	48 89 8c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rcx
     135cd78:	00 
     135cd79:	48 8b 8c 24 30 01 00 	mov    rcx,QWORD PTR [rsp+0x130]
     135cd80:	00 
     135cd81:	48 89 8c 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rcx
     135cd88:	00 
     135cd89:	48 8d 8c 24 e8 01 00 	lea    rcx,[rsp+0x1e8]
     135cd90:	00 
     135cd91:	48 89 8c 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rcx
     135cd98:	00 
     135cd99:	48 8d 8c 24 00 02 00 	lea    rcx,[rsp+0x200]
     135cda0:	00 
     135cda1:	48 89 8c 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rcx
     135cda8:	00 
     135cda9:	48 89 b4 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rsi
     135cdb0:	00 
     135cdb1:	4c 89 64 24 78       	mov    QWORD PTR [rsp+0x78],r12
     135cdb6:	4c 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],r15
     135cdbb:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
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
     135ce2d:	48 8d 84 24 20 02 00 	lea    rax,[rsp+0x220]
     135ce34:	00 
     135ce35:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     135ce3a:	48 8b 84 24 48 01 00 	mov    rax,QWORD PTR [rsp+0x148]
     135ce41:	00 
     135ce42:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     135ce47:	48 8b 84 24 98 01 00 	mov    rax,QWORD PTR [rsp+0x198]
     135ce4e:	00 
     135ce4f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     135ce54:	48 8b 84 24 a0 01 00 	mov    rax,QWORD PTR [rsp+0x1a0]
     135ce5b:	00 
     135ce5c:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     135ce60:	48 8d b4 24 30 02 00 	lea    rsi,[rsp+0x230]
     135ce67:	00 
     135ce68:	4c 8b 84 24 b0 01 00 	mov    r8,QWORD PTR [rsp+0x1b0]
     135ce6f:	00 
     135ce70:	4c 8b 8c 24 a8 01 00 	mov    r9,QWORD PTR [rsp+0x1a8]
     135ce77:	00 
     135ce78:	4c 89 f7             	mov    rdi,r14
     135ce7b:	48 8b 94 24 c0 01 00 	mov    rdx,QWORD PTR [rsp+0x1c0]
     135ce82:	00 
     135ce83:	48 8b 8c 24 b8 01 00 	mov    rcx,QWORD PTR [rsp+0x1b8]
     135ce8a:	00 
     135ce8b:	e8 c6 01 00 00       	call   135d056 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a25da>
     135ce90:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
     135ce97:	00 
     135ce98:	e8 8b e8 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135ce9d:	48 8d bc 24 98 02 00 	lea    rdi,[rsp+0x298]
     135cea4:	00 
     135cea5:	e8 62 85 47 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     135ceaa:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
     135ceb1:	00 
     135ceb2:	e8 bd 9f 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
     135ceb7:	48 8b 84 24 88 01 00 	mov    rax,QWORD PTR [rsp+0x188]
     135cebe:	00 
     135cebf:	4c 89 30             	mov    QWORD PTR [rax],r14
     135cec2:	49 89 c6             	mov    r14,rax
     135cec5:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
     135cecc:	00 
     135cecd:	e8 56 e8 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>

## Definitions of provider slots
### slot 0x1b8 write @0x135c8cb: mov    QWORD PTR [rsp+0x1b8],rax
- source register: rax
- nearest producer @0x135c8c6: call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
     135c897:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135c89e:	00 00 
     135c8a0:	48 89 84 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rax
     135c8a7:	00 
     135c8a8:	48 89 cf             	mov    rdi,rcx
     135c8ab:	e8 de a3 95 ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
     135c8b0:	49 89 c4             	mov    r12,rax
     135c8b3:	4c 89 ff             	mov    rdi,r15
     135c8b6:	e8 8f 6f 8f ff       	call   c5384a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a07ea>
     135c8bb:	48 89 84 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],rax
     135c8c2:	00 
     135c8c3:	4c 89 ff             	mov    rdi,r15
     135c8c6:	e8 ff 69 80 ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
     135c8cb:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
     135c8d2:	00 
     135c8d3:	4c 89 ff             	mov    rdi,r15
     135c8d6:	e8 b9 b6 82 ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
     135c8db:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
     135c8e2:	00 
     135c8e3:	4c 89 ff             	mov    rdi,r15
     135c8e6:	e8 d3 b6 82 ff       	call   b87fbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f5e>
     135c8eb:	48 89 84 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rax
     135c8f2:	00 
     135c8f3:	4c 89 ff             	mov    rdi,r15
     135c8f6:	e8 55 4e 8b ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
     135c8fb:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
     135c902:	00 
     135c903:	4c 89 ff             	mov    rdi,r15
     135c906:	e8 69 6f 8f ff       	call   c53874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0814>
     135c90b:	48 89 84 24 98 01 00 	mov    QWORD PTR [rsp+0x198],rax
     135c912:	00 
     135c913:	4c 89 ff             	mov    rdi,r15
     135c916:	e8 ad ab 95 ff       	call   cb74c8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x204468>
     135c91b:	49 89 c5             	mov    r13,rax
     135c91e:	4c 89 ff             	mov    rdi,r15

### slot 0x190 write @0x135c926: mov    QWORD PTR [rsp+0x190],rax
- source register: rax
- nearest producer @0x135c921: call   b9150c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4ac>
     135c8f3:	4c 89 ff             	mov    rdi,r15
     135c8f6:	e8 55 4e 8b ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
     135c8fb:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
     135c902:	00 
     135c903:	4c 89 ff             	mov    rdi,r15
     135c906:	e8 69 6f 8f ff       	call   c53874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0814>
     135c90b:	48 89 84 24 98 01 00 	mov    QWORD PTR [rsp+0x198],rax
     135c912:	00 
     135c913:	4c 89 ff             	mov    rdi,r15
     135c916:	e8 ad ab 95 ff       	call   cb74c8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x204468>
     135c91b:	49 89 c5             	mov    r13,rax
     135c91e:	4c 89 ff             	mov    rdi,r15
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

## Candidate provider-producing calls and nearby strings
### slot 0x1b8 write @0x135c8cb
- call @0x135c8ab: call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
- call @0x135c8b6: call   c5384a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a07ea>
- call @0x135c8c6: call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>

### slot 0x190 write @0x135c926
- call @0x135c8ab: call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
- call @0x135c8b6: call   c5384a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a07ea>
- call @0x135c8c6: call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
- call @0x135c8d6: call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
- call @0x135c8e6: call   b87fbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f5e>
- call @0x135c8f6: call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
- call @0x135c906: call   c53874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0814>
- call @0x135c916: call   cb74c8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x204468>
- call @0x135c921: call   b9150c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4ac>

## Registry/service ID accesses in factory
### ID setup @0x135c936: mov    edx,0xb7
     135c916:	e8 ad ab 95 ff       	call   cb74c8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x204468>
     135c91b:	49 89 c5             	mov    r13,rax
     135c91e:	4c 89 ff             	mov    rdi,r15
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

### registry ID check @0x135c93b
     135c90b:	48 89 84 24 98 01 00 	mov    QWORD PTR [rsp+0x198],rax
     135c912:	00 
     135c913:	4c 89 ff             	mov    rdi,r15
     135c916:	e8 ad ab 95 ff       	call   cb74c8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x204468>
     135c91b:	49 89 c5             	mov    r13,rax
     135c91e:	4c 89 ff             	mov    rdi,r15
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

### registry ID check @0x135c9ab
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

## Stack-slot assignment table in factory
- 0x135c88f: stack+0x188 <- rdi
- 0x135c8bb: stack+0x1c0 <- rax
- 0x135c8cb: stack+0x1b8 <- rax
- 0x135c8db: stack+0x1b0 <- rax
- 0x135c8eb: stack+0x1a8 <- rax
- 0x135c8fb: stack+0x1a0 <- rax
- 0x135c90b: stack+0x198 <- rax
- 0x135c926: stack+0x190 <- rax
- 0x135c94a: stack+0x120 <- rax
- 0x135c963: stack+0x180 <- rax
- 0x135c989: stack+0x118 <- rax
- 0x135c999: stack+0x128 <- rax
- 0x135c9b6: stack+0x178 <- rax
- 0x135c9cf: stack+0x1c8 <- rax
- 0x135c9df: stack+0x170 <- rax
- 0x135caa6: stack+0x168 <- rax
- 0x135cab5: stack+0x160 <- rax
- 0x135cacc: stack+0x158 <- rax
- 0x135cae9: stack+0x138 <- rax
- 0x135caf1: stack+0x150 <- r13
- 0x135caf9: stack+0x140 <- r12
- 0x135cb01: stack+0x148 <- r15
- 0x135cb9e: stack+0x130 <- rax
- 0x135cbb4: stack+0x118 <- rax
- 0x135cc21: stack+0x1d0 <- rax
- 0x135cd31: stack+0x108 <- r8

## Factory string literals
