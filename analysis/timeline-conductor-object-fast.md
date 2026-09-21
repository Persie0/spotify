# TimelineConductorSetupImpl / service-object fast decode

## Descriptor identity
- provider ID: 0xb8
- descriptor AP: 0x1867c58
- +0x10 ID method: 0x135c85c -> 0xb8
- +0x18 metadata: ptr 0x347239, len 0x1a = TimelineConductorSetupImpl
- +0x28 factory: 0x135c878

## Factory allocation / construction window
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
     135cc60:	bb 38 02 00 00       	mov    ebx,0x238
     135cc65:	48 03 5d 00          	add    rbx,QWORD PTR [rbp+0x0]
     135cc69:	bf f0 00 00 00       	mov    edi,0xf0
     135cc6e:	e8 8d 12 49 00       	call   17edf00 <_Znwm@plt>
     135cc73:	49 89 c6             	mov    r14,rax
     135cc76:	49 8d b7 d8 01 00 00 	lea    rsi,[r15+0x1d8]
     135cc7d:	4c 8d a4 24 00 03 00 	lea    r12,[rsp+0x300]
     135cc84:	00 
     135cc85:	4c 89 e7             	mov    rdi,r12
     135cc88:	e8 c1 17 1b 00       	call   150e44e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3539d2>
     135cc8d:	4c 8b 8c 24 50 01 00 	mov    r9,QWORD PTR [rsp+0x150]
     135cc94:	00 
     135cc95:	49 8d 87 90 01 00 00 	lea    rax,[r15+0x190]
     135cc9c:	49 81 c7 c0 01 00 00 	add    r15,0x1c0
     135cca3:	4c 8b 84 24 70 01 00 	mov    r8,QWORD PTR [rsp+0x170]
     135ccaa:	00 
     135ccab:	49 8d 48 10          	lea    rcx,[r8+0x10]
     135ccaf:	49 83 c0 38          	add    r8,0x38
     135ccb3:	48 8b 94 24 18 02 00 	mov    rdx,QWORD PTR [rsp+0x218]
     135ccba:	00 
     135ccbb:	48 83 a4 24 18 02 00 	and    QWORD PTR [rsp+0x218],0x0
     135ccc2:	00 00 
     135ccc4:	48 8d b4 24 98 02 00 	lea    rsi,[rsp+0x298]
     135cccb:	00 
     135cccc:	48 89 16             	mov    QWORD PTR [rsi],rdx
     135cccf:	0f 28 84 24 d0 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x1d0]
     135ccd6:	00 
     135ccd7:	48 8d 94 24 80 02 00 	lea    rdx,[rsp+0x280]
     135ccde:	00 
     135ccdf:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
     135cce2:	48 8b bc 24 e0 01 00 	mov    rdi,QWORD PTR [rsp+0x1e0]
     135cce9:	00 
     135ccea:	48 89 7a 10          	mov    QWORD PTR [rdx+0x10],rdi
     135ccee:	0f 57 c0             	xorps  xmm0,xmm0
     135ccf1:	0f 29 84 24 d0 01 00 	movaps XMMWORD PTR [rsp+0x1d0],xmm0
     135ccf8:	00 
     135ccf9:	48 83 a4 24 e0 01 00 	and    QWORD PTR [rsp+0x1e0],0x0
     135cd00:	00 00 
     135cd02:	0f 10 03             	movups xmm0,XMMWORD PTR [rbx]
     135cd05:	0f 10 4b 10          	movups xmm1,XMMWORD PTR [rbx+0x10]
     135cd09:	0f 10 53 20          	movups xmm2,XMMWORD PTR [rbx+0x20]
     135cd0d:	0f 10 5b 30          	movups xmm3,XMMWORD PTR [rbx+0x30]
     135cd11:	0f 11 9c 24 f8 00 00 	movups XMMWORD PTR [rsp+0xf8],xmm3
     135cd18:	00 
     135cd19:	0f 11 94 24 e8 00 00 	movups XMMWORD PTR [rsp+0xe8],xmm2
     135cd20:	00 
     135cd21:	0f 11 8c 24 d8 00 00 	movups XMMWORD PTR [rsp+0xd8],xmm1
     135cd28:	00 
     135cd29:	0f 11 84 24 c8 00 00 	movups XMMWORD PTR [rsp+0xc8],xmm0
     135cd30:	00 
     135cd31:	4c 89 84 24 08 01 00 	mov    QWORD PTR [rsp+0x108],r8
     135cd38:	00 
     135cd39:	48 89 8c 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rcx
     135cd40:	00 
     135cd41:	48 89 94 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rdx
     135cd48:	00 
     135cd49:	48 8b 8c 24 78 01 00 	mov    rcx,QWORD PTR [rsp+0x178]
     135cd50:	00 
     135cd51:	48 89 8c 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rcx
     135cd58:	00 
     135cd59:	48 8b 8c 24 28 01 00 	mov    rcx,QWORD PTR [rsp+0x128]
     135cd60:	00 
     135cd61:	48 89 8c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rcx
     135cd68:	00 
     135cd69:	48 8b 8c 24 18 01 00 	mov    rcx,QWORD PTR [rsp+0x118]
     135cd70:	00 
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

## Constructor 0x135d056
     135d056:	55                   	push   rbp
     135d057:	41 57                	push   r15
     135d059:	41 56                	push   r14
     135d05b:	41 55                	push   r13
     135d05d:	41 54                	push   r12
     135d05f:	53                   	push   rbx
     135d060:	48 81 ec 28 10 00 00 	sub    rsp,0x1028
     135d067:	4c 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],r9
     135d06c:	4c 89 c3             	mov    rbx,r8
     135d06f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135d076:	00 00 
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
     135d0dc:	f3 0f 7f 87 d0 00 00 	movdqu XMMWORD PTR [rdi+0xd0],xmm0
     135d0e3:	00 
     135d0e4:	f3 0f 7f 87 e0 00 00 	movdqu XMMWORD PTR [rdi+0xe0],xmm0
     135d0eb:	00 
     135d0ec:	38 06                	cmp    BYTE PTR [rsi],al
     135d0ee:	0f 84 1d 30 00 00    	je     1360111 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5695>
     135d0f4:	48 89 f5             	mov    rbp,rsi
     135d0f7:	48 89 4c 24 70       	mov    QWORD PTR [rsp+0x70],rcx
     135d0fc:	48 89 54 24 30       	mov    QWORD PTR [rsp+0x30],rdx
     135d101:	48 8b 8c 24 88 10 00 	mov    rcx,QWORD PTR [rsp+0x1088]
     135d108:	00 
     135d109:	4c 8d 6f 10          	lea    r13,[rdi+0x10]
     135d10d:	48 8d 47 20          	lea    rax,[rdi+0x20]
     135d111:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
     135d118:	00 
     135d119:	48 8d 87 80 00 00 00 	lea    rax,[rdi+0x80]
     135d120:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
     135d127:	00 
     135d128:	48 8d 87 88 00 00 00 	lea    rax,[rdi+0x88]
     135d12f:	48 89 84 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rax
     135d136:	00 
     135d137:	48 8d 87 a0 00 00 00 	lea    rax,[rdi+0xa0]
     135d13e:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
     135d145:	00 
     135d146:	48 8d 87 a8 00 00 00 	lea    rax,[rdi+0xa8]
     135d14d:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
     135d154:	00 
     135d155:	48 8d 87 b0 00 00 00 	lea    rax,[rdi+0xb0]
     135d15c:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     135d163:	00 
     135d164:	48 8d 87 b8 00 00 00 	lea    rax,[rdi+0xb8]
     135d16b:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     135d172:	00 
     135d173:	48 8d 87 c0 00 00 00 	lea    rax,[rdi+0xc0]
     135d17a:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
     135d181:	00 
     135d182:	48 8d 87 c8 00 00 00 	lea    rax,[rdi+0xc8]
     135d189:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     135d18e:	48 89 7c 24 78       	mov    QWORD PTR [rsp+0x78],rdi
     135d193:	48 8d 87 d8 00 00 00 	lea    rax,[rdi+0xd8]
     135d19a:	48 89 84 24 f8 00 00 	mov    QWORD PTR [rsp+0xf8],rax
     135d1a1:	00 
     135d1a2:	4c 8b 31             	mov    r14,QWORD PTR [rcx]
     135d1a5:	48 8d 35 19 92 fd fe 	lea    rsi,[rip+0xfffffffffefd9219]        # 3363c5 <_ZTSSt12bad_any_cast@@Base-0x59e03>
     135d1ac:	4c 8d bc 24 d0 0a 00 	lea    r15,[rsp+0xad0]
     135d1b3:	00 
     135d1b4:	4c 89 ff             	mov    rdi,r15
     135d1b7:	4c 89 ac 24 08 01 00 	mov    QWORD PTR [rsp+0x108],r13
     135d1be:	00 
     135d1bf:	e8 ba c8 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135d1c4:	4c 8d a4 24 e8 0a 00 	lea    r12,[rsp+0xae8]
     135d1cb:	00 
     135d1cc:	48 8d 35 7b 35 00 ff 	lea    rsi,[rip+0xffffffffff00357b]        # 36074e <_ZTSSt12bad_any_cast@@Base-0x2fa7a>
     135d1d3:	4c 89 e7             	mov    rdi,r12
     135d1d6:	e8 a3 c8 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135d1db:	4c 8d a4 24 00 0b 00 	lea    r12,[rsp+0xb00]
     135d1e2:	00 
     135d1e3:	48 8d 35 e8 2d fe fe 	lea    rsi,[rip+0xfffffffffefe2de8]        # 33ffd2 <_ZTSSt12bad_any_cast@@Base-0x501f6>
     135d1ea:	4c 89 e7             	mov    rdi,r12
     135d1ed:	e8 8c c8 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135d1f2:	4c 8d a4 24 18 0b 00 	lea    r12,[rsp+0xb18]
     135d1f9:	00 
     135d1fa:	48 8d 35 f1 7f fc fe 	lea    rsi,[rip+0xfffffffffefc7ff1]        # 3251f2 <_ZTSSt12bad_any_cast@@Base-0x6afd6>
     135d201:	4c 89 e7             	mov    rdi,r12
     135d204:	e8 75 c8 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135d209:	4c 8d a4 24 30 0b 00 	lea    r12,[rsp+0xb30]
     135d210:	00 
     135d211:	48 8d 35 b1 3d 02 ff 	lea    rsi,[rip+0xffffffffff023db1]        # 380fc9 <_ZTSSt12bad_any_cast@@Base-0xf1ff>
     135d218:	4c 89 e7             	mov    rdi,r12
     135d21b:	e8 5e c8 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135d220:	4c 8d a4 24 48 0b 00 	lea    r12,[rsp+0xb48]
     135d227:	00 
     135d228:	48 8d 35 1b 72 01 ff 	lea    rsi,[rip+0xffffffffff01721b]        # 37444a <_ZTSSt12bad_any_cast@@Base-0x1bd7e>
     135d22f:	4c 89 e7             	mov    rdi,r12
     135d232:	e8 47 c8 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135d237:	4c 8d a4 24 60 0b 00 	lea    r12,[rsp+0xb60]
     135d23e:	00 
     135d23f:	48 8d 35 7c ff 07 ff 	lea    rsi,[rip+0xffffffffff07ff7c]        # 3dd1c2 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2c11>
     135d246:	4c 89 e7             	mov    rdi,r12
     135d249:	e8 30 c8 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135d24e:	48 89 5c 24 68       	mov    QWORD PTR [rsp+0x68],rbx
     135d253:	4c 8d a4 24 a0 05 00 	lea    r12,[rsp+0x5a0]
     135d25a:	00 
     135d25b:	48 8d b4 24 d0 0a 00 	lea    rsi,[rsp+0xad0]
     135d262:	00 
     135d263:	6a 07                	push   0x7
     135d265:	5a                   	pop    rdx
     135d266:	4c 89 e7             	mov    rdi,r12
     135d269:	e8 ea a1 74 ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
     135d26e:	4c 8b bc 24 d0 10 00 	mov    r15,QWORD PTR [rsp+0x10d0]
     135d275:	00 
     135d276:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
     135d27b:	48 8d 48 18          	lea    rcx,[rax+0x18]
     135d27f:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     135d284:	48 05 e0 00 00 00    	add    rax,0xe0
     135d28a:	48 89 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rax
     135d291:	00 
     135d292:	bb 90 00 00 00       	mov    ebx,0x90
     135d297:	48 8d 3c 1c          	lea    rdi,[rsp+rbx*1]
     135d29b:	48 81 c7 d0 0a 00 00 	add    rdi,0xad0
     135d2a2:	e8 e9 0b 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     135d2a7:	48 83 c3 e8          	add    rbx,0xffffffffffffffe8
     135d2ab:	48 83 fb e8          	cmp    rbx,0xffffffffffffffe8
     135d2af:	75 e6                	jne    135d297 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a281b>
     135d2b1:	48 8d 35 d8 fe 07 ff 	lea    rsi,[rip+0xffffffffff07fed8]        # 3dd190 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2bdf>
     135d2b8:	48 8d 0d f1 fe 07 ff 	lea    rcx,[rip+0xffffffffff07fef1]        # 3dd1b0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2bff>
     135d2bf:	4c 8d 0d fc fe 07 ff 	lea    r9,[rip+0xffffffffff07fefc]        # 3dd1c2 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2c11>
     135d2c6:	6a 17                	push   0x17
     135d2c8:	5a                   	pop    rdx
     135d2c9:	6a 11                	push   0x11
     135d2cb:	41 58                	pop    r8
     135d2cd:	4c 89 f7             	mov    rdi,r14
     135d2d0:	41 54                	push   r12
     135d2d2:	6a 0b                	push   0xb
     135d2d4:	e8 b5 a3 28 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
     135d2d9:	58                   	pop    rax
     135d2da:	59                   	pop    rcx
     135d2db:	4c 89 e7             	mov    rdi,r12
     135d2de:	e8 05 e3 71 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     135d2e3:	48 83 a4 24 f0 01 00 	and    QWORD PTR [rsp+0x1f0],0x0
     135d2ea:	00 00 
     135d2ec:	66 0f ef c0          	pxor   xmm0,xmm0
     135d2f0:	66 0f 7f 84 24 e0 01 	movdqa XMMWORD PTR [rsp+0x1e0],xmm0
     135d2f7:	00 00 
     135d2f9:	49 8b 77 08          	mov    rsi,QWORD PTR [r15+0x8]
     135d2fd:	41 8b 3f             	mov    edi,DWORD PTR [r15]
     135d300:	e8 1b e5 71 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     135d305:	84 c0                	test   al,al
     135d307:	74 68                	je     135d371 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a28f5>
     135d309:	48 8b 84 24 88 10 00 	mov    rax,QWORD PTR [rsp+0x1088]
     135d310:	00 
     135d311:	48 8b 30             	mov    rsi,QWORD PTR [rax]
     135d314:	48 8d 15 75 fe 07 ff 	lea    rdx,[rip+0xffffffffff07fe75]        # 3dd190 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2bdf>
     135d31b:	4c 8d 05 8e fe 07 ff 	lea    r8,[rip+0xffffffffff07fe8e]        # 3dd1b0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2bff>
     135d322:	48 8d 9c 24 d0 0a 00 	lea    rbx,[rsp+0xad0]
     135d329:	00 
     135d32a:	6a 17                	push   0x17
     135d32c:	59                   	pop    rcx
     135d32d:	6a 11                	push   0x11
     135d32f:	41 59                	pop    r9
     135d331:	48 89 df             	mov    rdi,rbx
     135d334:	e8 8f a1 28 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
     135d339:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
     135d33d:	74 18                	je     135d357 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a28db>
     135d33f:	48 8d 35 7c fe 07 ff 	lea    rsi,[rip+0xffffffffff07fe7c]        # 3dd1c2 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2c11>
     135d346:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d34d:	00 
     135d34e:	e8 fc e4 71 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     135d353:	84 c0                	test   al,al
     135d355:	74 37                	je     135d38e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2912>
     135d357:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d35e:	00 
     135d35f:	e8 cc 99 74 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     135d364:	48 8b 9c 24 88 10 00 	mov    rbx,QWORD PTR [rsp+0x1088]
     135d36b:	00 
     135d36c:	e9 ed 00 00 00       	jmp    135d45e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a29e2>
     135d371:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     135d378:	00 
     135d379:	4c 89 fe             	mov    rsi,r15
     135d37c:	e8 ff 0c 49 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     135d381:	48 8b 9c 24 88 10 00 	mov    rbx,QWORD PTR [rsp+0x1088]
     135d388:	00 
     135d389:	e9 d0 00 00 00       	jmp    135d45e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a29e2>
     135d38e:	4c 8d 35 30 90 fd fe 	lea    r14,[rip+0xfffffffffefd9030]        # 3363c5 <_ZTSSt12bad_any_cast@@Base-0x59e03>
     135d395:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d39c:	00 
     135d39d:	4c 89 f6             	mov    rsi,r14
     135d3a0:	e8 aa e4 71 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     135d3a5:	84 c0                	test   al,al
     135d3a7:	74 1a                	je     135d3c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2947>
     135d3a9:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d3b0:	00 
     135d3b1:	e8 7a 99 74 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     135d3b6:	48 8b 9c 24 88 10 00 	mov    rbx,QWORD PTR [rsp+0x1088]
     135d3bd:	00 
     135d3be:	e9 8b 00 00 00       	jmp    135d44e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a29d2>
     135d3c3:	4c 8d 35 84 33 00 ff 	lea    r14,[rip+0xffffffffff003384]        # 36074e <_ZTSSt12bad_any_cast@@Base-0x2fa7a>
     135d3ca:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d3d1:	00 
     135d3d2:	4c 89 f6             	mov    rsi,r14
     135d3d5:	e8 75 e4 71 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     135d3da:	84 c0                	test   al,al
     135d3dc:	48 8b 9c 24 88 10 00 	mov    rbx,QWORD PTR [rsp+0x1088]
     135d3e3:	00 
     135d3e4:	74 02                	je     135d3e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a296c>
     135d3e6:	eb 59                	jmp    135d441 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a29c5>
     135d3e8:	4c 8d 35 e3 2b fe fe 	lea    r14,[rip+0xfffffffffefe2be3]        # 33ffd2 <_ZTSSt12bad_any_cast@@Base-0x501f6>
     135d3ef:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d3f6:	00 
     135d3f7:	4c 89 f6             	mov    rsi,r14
     135d3fa:	e8 50 e4 71 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     135d3ff:	84 c0                	test   al,al
     135d401:	74 02                	je     135d405 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2989>
     135d403:	eb 3c                	jmp    135d441 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a29c5>
     135d405:	4c 8d 35 e6 7d fc fe 	lea    r14,[rip+0xfffffffffefc7de6]        # 3251f2 <_ZTSSt12bad_any_cast@@Base-0x6afd6>
     135d40c:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d413:	00 
     135d414:	4c 89 f6             	mov    rsi,r14
     135d417:	e8 33 e4 71 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     135d41c:	84 c0                	test   al,al
     135d41e:	74 02                	je     135d422 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a29a6>
     135d420:	eb 1f                	jmp    135d441 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a29c5>
     135d422:	4c 8d 35 a0 3b 02 ff 	lea    r14,[rip+0xffffffffff023ba0]        # 380fc9 <_ZTSSt12bad_any_cast@@Base-0xf1ff>
     135d429:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d430:	00 
     135d431:	4c 89 f6             	mov    rsi,r14
     135d434:	e8 16 e4 71 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     135d439:	84 c0                	test   al,al
     135d43b:	0f 84 f9 2c 00 00    	je     136013a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a56be>
     135d441:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d448:	00 
     135d449:	e8 e2 98 74 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     135d44e:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     135d455:	00 
     135d456:	4c 89 f6             	mov    rsi,r14
     135d459:	e8 22 0b 49 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     135d45e:	48 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],rbp
     135d463:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d466:	e8 d9 fe 95 ff       	call   cbd344 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a2e4>
     135d46b:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d46e:	e8 b3 fe 95 ff       	call   cbd326 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a2c6>
     135d473:	41 89 c7             	mov    r15d,eax
     135d476:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d479:	e8 62 ff 95 ff       	call   cbd3e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a380>
     135d47e:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d481:	e8 dc fe 95 ff       	call   cbd362 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a302>
     135d486:	89 44 24 48          	mov    DWORD PTR [rsp+0x48],eax
     135d48a:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d48d:	e8 76 fe 95 ff       	call   cbd308 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a2a8>
     135d492:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d495:	e8 50 fe 95 ff       	call   cbd2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a28a>
     135d49a:	89 c5                	mov    ebp,eax
     135d49c:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d49f:	e8 d6 00 96 ff       	call   cbd57a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a51a>
     135d4a4:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d4a7:	e8 34 00 96 ff       	call   cbd4e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a480>
     135d4ac:	41 89 c4             	mov    r12d,eax
     135d4af:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d4b2:	e8 7d f6 95 ff       	call   cbcb34 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x209ad4>
     135d4b7:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d4ba:	e8 39 f9 95 ff       	call   cbcdf8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x209d98>
     135d4bf:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d4c2:	e8 f5 fb 95 ff       	call   cbd0bc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a05c>
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
     135d52e:	00 
     135d52f:	48 83 23 00          	and    QWORD PTR [rbx],0x0
     135d533:	4c 89 ef             	mov    rdi,r13
     135d536:	4c 89 f6             	mov    rsi,r14
     135d539:	e8 de 36 00 00       	call   1360c1c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a61a0>
     135d53e:	48 89 df             	mov    rdi,rbx
     135d541:	e8 00 37 00 00       	call   1360c46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a61ca>
     135d546:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d54d:	00 
     135d54e:	e8 17 ca 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135d553:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
     135d55a:	00 
     135d55b:	e8 30 09 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     135d560:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     135d564:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135d567:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135d56a:	48 8b 9c 24 88 10 00 	mov    rbx,QWORD PTR [rsp+0x1088]
     135d571:	00 
     135d572:	49 89 c6             	mov    r14,rax
     135d575:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     135d579:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135d57c:	ff 50 10             	call   QWORD PTR [rax+0x10]
     135d57f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d582:	e8 31 1e 96 ff       	call   cbf3b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20c358>
     135d587:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d58a:	e8 83 1d 96 ff       	call   cbf312 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20c2b2>
     135d58f:	83 f8 01             	cmp    eax,0x1
     135d592:	b9 00 77 01 00       	mov    ecx,0x17700
     135d597:	ba 80 bb 00 00       	mov    edx,0xbb80
     135d59c:	0f 44 d1             	cmove  edx,ecx
     135d59f:	83 f8 02             	cmp    eax,0x2
     135d5a2:	bb 00 ee 02 00       	mov    ebx,0x2ee00
     135d5a7:	0f 45 da             	cmovne ebx,edx
     135d5aa:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
     135d5b1:	00 
     135d5b2:	48 8b b4 24 d8 10 00 	mov    rsi,QWORD PTR [rsp+0x10d8]
     135d5b9:	00 
     135d5ba:	e8 27 0f 1b 00       	call   150e4e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x353a6a>
     135d5bf:	89 9c 24 b8 00 00 00 	mov    DWORD PTR [rsp+0xb8],ebx
     135d5c6:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     135d5cb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135d5ce:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135d5d1:	49 89 c5             	mov    r13,rax
     135d5d4:	48 8d 9c 24 a8 05 00 	lea    rbx,[rsp+0x5a8]
     135d5db:	00 
     135d5dc:	c7 43 f8 01 00 00 01 	mov    DWORD PTR [rbx-0x8],0x1000001
     135d5e3:	48 8d 35 1b d0 fe fe 	lea    rsi,[rip+0xfffffffffefed01b]        # 34a605 <_ZTSSt12bad_any_cast@@Base-0x45bc3>
     135d5ea:	48 89 df             	mov    rdi,rbx
     135d5ed:	e8 8c c4 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135d5f2:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     135d5f9:	00 
     135d5fa:	48 8d 35 b0 2f ff fe 	lea    rsi,[rip+0xfffffffffeff2fb0]        # 3505b1 <_ZTSSt12bad_any_cast@@Base-0x3fc17>
     135d601:	e8 78 c4 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135d606:	6a 64                	push   0x64
     135d608:	58                   	pop    rax
     135d609:	48 89 84 24 d8 05 00 	mov    QWORD PTR [rsp+0x5d8],rax
     135d610:	00 
     135d611:	66 0f 76 c0          	pcmpeqd xmm0,xmm0
     135d615:	f3 0f 7f 84 24 e0 05 	movdqu XMMWORD PTR [rsp+0x5e0],xmm0
     135d61c:	00 00 
     135d61e:	c6 84 24 f0 05 00 00 	mov    BYTE PTR [rsp+0x5f0],0x0
     135d625:	00 
     135d626:	66 0f ef c0          	pxor   xmm0,xmm0
     135d62a:	f3 0f 7f 84 24 f8 05 	movdqu XMMWORD PTR [rsp+0x5f8],xmm0
     135d631:	00 00 
     135d633:	83 a4 24 08 06 00 00 	and    DWORD PTR [rsp+0x608],0x0
     135d63a:	00 
     135d63b:	48 c7 84 24 10 06 00 	mov    QWORD PTR [rsp+0x610],0x3e8
     135d642:	00 e8 03 00 00 
     135d647:	48 c7 84 24 18 06 00 	mov    QWORD PTR [rsp+0x618],0xfa0
     135d64e:	00 a0 0f 00 00 
     135d653:	48 83 a4 24 20 06 00 	and    QWORD PTR [rsp+0x620],0x0
     135d65a:	00 00 
     135d65c:	83 a4 24 28 06 00 00 	and    DWORD PTR [rsp+0x628],0x0
     135d663:	00 
     135d664:	48 c7 84 24 30 06 00 	mov    QWORD PTR [rsp+0x630],0xfa
     135d66b:	00 fa 00 00 00 
     135d670:	48 89 84 24 38 06 00 	mov    QWORD PTR [rsp+0x638],rax
     135d677:	00 
     135d678:	40 88 ac 24 40 06 00 	mov    BYTE PTR [rsp+0x640],bpl
     135d67f:	00 
     135d680:	44 88 bc 24 41 06 00 	mov    BYTE PTR [rsp+0x641],r15b
     135d687:	00 
     135d688:	8b 44 24 48          	mov    eax,DWORD PTR [rsp+0x48]
     135d68c:	89 84 24 44 06 00 00 	mov    DWORD PTR [rsp+0x644],eax
     135d693:	44 89 a4 24 48 06 00 	mov    DWORD PTR [rsp+0x648],r12d
     135d69a:	00 
     135d69b:	c6 84 24 4c 06 00 00 	mov    BYTE PTR [rsp+0x64c],0x1
     135d6a2:	01 
     135d6a3:	48 8d 9c 24 d8 01 00 	lea    rbx,[rsp+0x1d8]
     135d6aa:	00 
     135d6ab:	48 89 df             	mov    rdi,rbx
     135d6ae:	48 8b b4 24 e0 10 00 	mov    rsi,QWORD PTR [rsp+0x10e0]
     135d6b5:	00 
     135d6b6:	e8 3f 7d 47 00       	call   17d53fa <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x121b>
     135d6bb:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135d6c2:	00 
     135d6c3:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     135d6c7:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
     135d6ca:	e8 53 7c 47 00       	call   17d5322 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1143>
     135d6cf:	4c 8d bc 24 f0 0a 00 	lea    r15,[rsp+0xaf0]
     135d6d6:	00 
     135d6d7:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
     135d6de:	00 
     135d6df:	49 89 47 e0          	mov    QWORD PTR [r15-0x20],rax
     135d6e3:	4d 89 77 e8          	mov    QWORD PTR [r15-0x18],r14
     135d6e7:	48 8b 84 24 70 10 00 	mov    rax,QWORD PTR [rsp+0x1070]
     135d6ee:	00 
     135d6ef:	49 89 47 f0          	mov    QWORD PTR [r15-0x10],rax
     135d6f3:	4d 89 6f f8          	mov    QWORD PTR [r15-0x8],r13
     135d6f7:	4c 89 ff             	mov    rdi,r15
     135d6fa:	48 8b b4 24 c8 10 00 	mov    rsi,QWORD PTR [rsp+0x10c8]

## High-address constants in constructor
- 0x135d085: lea    r8,[rip+0x50ac0c]        # 1867c98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24380> -> 0x1867c98

## Candidate vtable neighborhoods from constructor constants
### AP 0x1867c78; code-looking slots=14
- +0x0: 0x135c86c
- +0x8: 0x135c878
- +0x10: 0x0
- +0x18: 0x0
- +0x20: 0x1364a94
- +0x28: 0x1364b3c
- +0x30: 0x9d7de0
- +0x38: 0x9d7de0
- +0x40: 0x1364b4e
- +0x48: 0xc2e960
- +0x50: 0xc7ddb4
- +0x58: 0x1364c6e
- +0x60: 0x0
- +0x68: 0x0
- +0x70: 0x1364742
- +0x78: 0x1364756
- +0x80: 0x1364768
- +0x88: 0x136480a

### AP 0x1867c80; code-looking slots=14
- +0x0: 0x135c878
- +0x8: 0x0
- +0x10: 0x0
- +0x18: 0x1364a94
- +0x20: 0x1364b3c
- +0x28: 0x9d7de0
- +0x30: 0x9d7de0
- +0x38: 0x1364b4e
- +0x40: 0xc2e960
- +0x48: 0xc7ddb4
- +0x50: 0x1364c6e
- +0x58: 0x0
- +0x60: 0x0
- +0x68: 0x1364742
- +0x70: 0x1364756
- +0x78: 0x1364768
- +0x80: 0x136480a
- +0x88: 0x1364824

### AP 0x1867c88; code-looking slots=14
- +0x0: 0x0
- +0x8: 0x0
- +0x10: 0x1364a94
- +0x18: 0x1364b3c
- +0x20: 0x9d7de0
- +0x28: 0x9d7de0
- +0x30: 0x1364b4e
- +0x38: 0xc2e960
- +0x40: 0xc7ddb4
- +0x48: 0x1364c6e
- +0x50: 0x0
- +0x58: 0x0
- +0x60: 0x1364742
- +0x68: 0x1364756
- +0x70: 0x1364768
- +0x78: 0x136480a
- +0x80: 0x1364824
- +0x88: 0x136482e

### AP 0x1867c90; code-looking slots=15
- +0x0: 0x0
- +0x8: 0x1364a94
- +0x10: 0x1364b3c
- +0x18: 0x9d7de0
- +0x20: 0x9d7de0
- +0x28: 0x1364b4e
- +0x30: 0xc2e960
- +0x38: 0xc7ddb4
- +0x40: 0x1364c6e
- +0x48: 0x0
- +0x50: 0x0
- +0x58: 0x1364742
- +0x60: 0x1364756
- +0x68: 0x1364768
- +0x70: 0x136480a
- +0x78: 0x1364824
- +0x80: 0x136482e
- +0x88: 0x1364844

### AP 0x1867c98; code-looking slots=15
- +0x0: 0x1364a94
- +0x8: 0x1364b3c
- +0x10: 0x9d7de0
- +0x18: 0x9d7de0
- +0x20: 0x1364b4e
- +0x28: 0xc2e960
- +0x30: 0xc7ddb4
- +0x38: 0x1364c6e
- +0x40: 0x0
- +0x48: 0x0
- +0x50: 0x1364742
- +0x58: 0x1364756
- +0x60: 0x1364768
- +0x68: 0x136480a
- +0x70: 0x1364824
- +0x78: 0x136482e
- +0x80: 0x1364844
- +0x88: 0x0

### AP 0x1867ca0; code-looking slots=14
- +0x0: 0x1364b3c
- +0x8: 0x9d7de0
- +0x10: 0x9d7de0
- +0x18: 0x1364b4e
- +0x20: 0xc2e960
- +0x28: 0xc7ddb4
- +0x30: 0x1364c6e
- +0x38: 0x0
- +0x40: 0x0
- +0x48: 0x1364742
- +0x50: 0x1364756
- +0x58: 0x1364768
- +0x60: 0x136480a
- +0x68: 0x1364824
- +0x70: 0x136482e
- +0x78: 0x1364844
- +0x80: 0x0
- +0x88: 0x0

### AP 0x1867ca8; code-looking slots=14
- +0x0: 0x9d7de0
- +0x8: 0x9d7de0
- +0x10: 0x1364b4e
- +0x18: 0xc2e960
- +0x20: 0xc7ddb4
- +0x28: 0x1364c6e
- +0x30: 0x0
- +0x38: 0x0
- +0x40: 0x1364742
- +0x48: 0x1364756
- +0x50: 0x1364768
- +0x58: 0x136480a
- +0x60: 0x1364824
- +0x68: 0x136482e
- +0x70: 0x1364844
- +0x78: 0x0
- +0x80: 0x0
- +0x88: 0x9d7de0

### AP 0x1867cb0; code-looking slots=14
- +0x0: 0x9d7de0
- +0x8: 0x1364b4e
- +0x10: 0xc2e960
- +0x18: 0xc7ddb4
- +0x20: 0x1364c6e
- +0x28: 0x0
- +0x30: 0x0
- +0x38: 0x1364742
- +0x40: 0x1364756
- +0x48: 0x1364768
- +0x50: 0x136480a
- +0x58: 0x1364824
- +0x60: 0x136482e
- +0x68: 0x1364844
- +0x70: 0x0
- +0x78: 0x0
- +0x80: 0x9d7de0
- +0x88: 0xa50370

### AP 0x1867cb8; code-looking slots=14
- +0x0: 0x1364b4e
- +0x8: 0xc2e960
- +0x10: 0xc7ddb4
- +0x18: 0x1364c6e
- +0x20: 0x0
- +0x28: 0x0
- +0x30: 0x1364742
- +0x38: 0x1364756
- +0x40: 0x1364768
- +0x48: 0x136480a
- +0x50: 0x1364824
- +0x58: 0x136482e
- +0x60: 0x1364844
- +0x68: 0x0
- +0x70: 0x0
- +0x78: 0x9d7de0
- +0x80: 0xa50370
- +0x88: 0x136432c

## Exact stores of high constants into object first word/subobjects
### high 0x1867c98 loaded @0x135d085, stored @0x135d08c: mov    QWORD PTR [rdi],r8
     135d06c:	4c 89 c3             	mov    rbx,r8
     135d06f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135d076:	00 00 
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

## Factory output stores
     135c92e:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     135c932:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     135c940:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135c9a1:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     135c9a5:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     135c9b0:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135cabd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135cad4:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     135cbae:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135cbbc:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     135cbd0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135cbd9:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     135cbed:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135cc57:	c6 47 08 01          	mov    BYTE PTR [rdi+0x8],0x1
     135cd02:	0f 10 03             	movups xmm0,XMMWORD PTR [rbx]
     135cd05:	0f 10 4b 10          	movups xmm1,XMMWORD PTR [rbx+0x10]
     135cd09:	0f 10 53 20          	movups xmm2,XMMWORD PTR [rbx+0x20]
     135cd0d:	0f 10 5b 30          	movups xmm3,XMMWORD PTR [rbx+0x30]

## Descriptor AP materialization
### 0xb60cd3
      b60c96:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60c99:	6a 08                	push   0x8
      b60c9b:	5f                   	pop    rdi
      b60c9c:	e8 5f d2 c8 00       	call   17edf00 <_Znwm@plt>
      b60ca1:	48 8d 0d 60 9b cf 00 	lea    rcx,[rip+0xcf9b60]        # 185a808 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x16ef0>
      b60ca8:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60cab:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60cb0:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60cb3:	48 89 e7             	mov    rdi,rsp
      b60cb6:	e8 5b ce f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60cbb:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60cc0:	48 85 ff             	test   rdi,rdi
      b60cc3:	74 06                	je     b60ccb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadc6b>
      b60cc5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60cc8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60ccb:	6a 08                	push   0x8
      b60ccd:	5f                   	pop    rdi
      b60cce:	e8 2d d2 c8 00       	call   17edf00 <_Znwm@plt>
      b60cd3:	48 8d 0d 7e 6f d0 00 	lea    rcx,[rip+0xd06f7e]        # 1867c58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24340>
      b60cda:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60cdd:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60ce2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60ce5:	48 89 e7             	mov    rdi,rsp
      b60ce8:	e8 29 ce f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60ced:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60cf2:	48 85 ff             	test   rdi,rdi
      b60cf5:	74 06                	je     b60cfd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadc9d>
      b60cf7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60cfa:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60cfd:	6a 08                	push   0x8
      b60cff:	5f                   	pop    rdi
      b60d00:	e8 fb d1 c8 00       	call   17edf00 <_Znwm@plt>
      b60d05:	48 8d 0d 8c 0a d1 00 	lea    rcx,[rip+0xd10a8c]        # 1871798 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2de80>
      b60d0c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60d0f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60d14:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60d17:	48 89 e7             	mov    rdi,rsp

