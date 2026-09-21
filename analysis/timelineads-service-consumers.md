# TimelineAds service ID 0xb7 consumer trace

Anchor:
- registry ID 0xb7 = TimelineAdsSetupImpl
- 0x135c943 loads table[0xb7] / +0x5b8
- 0x135c94a stores it into factory local [rsp+0x120]

## Containing TimelineConductor factory FDE=(20301944, 20303957)

## All [rsp+0x120] accesses
### WRITE 0x135c94a: mov    QWORD PTR [rsp+0x120],rax
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

### READ 0x135cbe5: mov    rdi,QWORD PTR [rsp+0x120]
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

### READ 0x135cdda: mov    rax,QWORD PTR [rsp+0x120]
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

## Register-forwarding from each read of [rsp+0x120]
### read 0x135cbe5: mov    rdi,QWORD PTR [rsp+0x120]; reg=rdi
     135cbe5:	48 8b bc 24 20 01 00 	mov    rdi,QWORD PTR [rsp+0x120]
     135cbed:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135cbf0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135cbf3:	48 89 c3             	mov    rbx,rax
     135cbf6:	48 8d 84 24 d0 01 00 	lea    rax,[rsp+0x1d0]
     135cc09:	48 89 84 24 00 03 00 	mov    QWORD PTR [rsp+0x300],rax
     135cc11:	c6 84 24 08 03 00 00 	mov    BYTE PTR [rsp+0x308],0x0
     135cc19:	6a 20                	push   0x20
     135cc1b:	5f                   	pop    rdi
     135cc1c:	e8 df 12 49 00       	call   17edf00 <_Znwm@plt>
     135cc21:	48 89 84 24 d0 01 00 	mov    QWORD PTR [rsp+0x1d0],rax
     135cc29:	48 89 c1             	mov    rcx,rax
     135cc30:	48 89 8c 24 e0 01 00 	mov    QWORD PTR [rsp+0x1e0],rcx
     135cc38:	4c 89 30             	mov    QWORD PTR [rax],r14
     135cc3b:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
     135cc3f:	4c 89 68 10          	mov    QWORD PTR [rax+0x10],r13
     135cc43:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx
     135cc47:	48 89 8c 24 d8 01 00 	mov    QWORD PTR [rsp+0x1d8],rcx
     135cc4f:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
     135cc57:	c6 47 08 01          	mov    BYTE PTR [rdi+0x8],0x1
     135cc5b:	e8 c2 ed 71 ff       	call   a7ba22 <JNI_OnUnload@@Base+0x32ef>
     135cc60:	bb 38 02 00 00       	mov    ebx,0x238
     135cc69:	bf f0 00 00 00       	mov    edi,0xf0
     135cc6e:	e8 8d 12 49 00       	call   17edf00 <_Znwm@plt>
     135cc73:	49 89 c6             	mov    r14,rax
     135cc76:	49 8d b7 d8 01 00 00 	lea    rsi,[r15+0x1d8]
     135cc7d:	4c 8d a4 24 00 03 00 	lea    r12,[rsp+0x300]
     135cc85:	4c 89 e7             	mov    rdi,r12
     135cc88:	e8 c1 17 1b 00       	call   150e44e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3539d2>
     135cc8d:	4c 8b 8c 24 50 01 00 	mov    r9,QWORD PTR [rsp+0x150]
     135cc95:	49 8d 87 90 01 00 00 	lea    rax,[r15+0x190]
     135cca3:	4c 8b 84 24 70 01 00 	mov    r8,QWORD PTR [rsp+0x170]
     135ccab:	49 8d 48 10          	lea    rcx,[r8+0x10]
     135ccb3:	48 8b 94 24 18 02 00 	mov    rdx,QWORD PTR [rsp+0x218]
     135ccc4:	48 8d b4 24 98 02 00 	lea    rsi,[rsp+0x298]
     135cccc:	48 89 16             	mov    QWORD PTR [rsi],rdx
     135ccd7:	48 8d 94 24 80 02 00 	lea    rdx,[rsp+0x280]
     135cce2:	48 8b bc 24 e0 01 00 	mov    rdi,QWORD PTR [rsp+0x1e0]
     135ccea:	48 89 7a 10          	mov    QWORD PTR [rdx+0x10],rdi
     135cd31:	4c 89 84 24 08 01 00 	mov    QWORD PTR [rsp+0x108],r8
     135cd39:	48 89 8c 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rcx
     135cd41:	48 89 94 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rdx
     135cd49:	48 8b 8c 24 78 01 00 	mov    rcx,QWORD PTR [rsp+0x178]
     135cd51:	48 89 8c 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rcx
     135cd59:	48 8b 8c 24 28 01 00 	mov    rcx,QWORD PTR [rsp+0x128]
     135cd61:	48 89 8c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rcx

### read 0x135cdda: mov    rax,QWORD PTR [rsp+0x120]; reg=rax
     135cdda:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
     135cde2:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     135cde7:	48 8b 84 24 90 01 00 	mov    rax,QWORD PTR [rsp+0x190]
     135cdef:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     135cdf4:	48 8b 84 24 58 01 00 	mov    rax,QWORD PTR [rsp+0x158]
     135cdfc:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     135ce01:	48 8b 84 24 60 01 00 	mov    rax,QWORD PTR [rsp+0x160]
     135ce09:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     135ce0e:	48 8b 84 24 68 01 00 	mov    rax,QWORD PTR [rsp+0x168]
     135ce16:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     135ce1b:	4c 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],r9
     135ce20:	48 8b 84 24 40 01 00 	mov    rax,QWORD PTR [rsp+0x140]
     135ce28:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     135ce2d:	48 8d 84 24 20 02 00 	lea    rax,[rsp+0x220]
     135ce35:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     135ce3a:	48 8b 84 24 48 01 00 	mov    rax,QWORD PTR [rsp+0x148]
     135ce42:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     135ce47:	48 8b 84 24 98 01 00 	mov    rax,QWORD PTR [rsp+0x198]
     135ce4f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     135ce54:	48 8b 84 24 a0 01 00 	mov    rax,QWORD PTR [rsp+0x1a0]
     135ce5c:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     135ce60:	48 8d b4 24 30 02 00 	lea    rsi,[rsp+0x230]
     135ce68:	4c 8b 84 24 b0 01 00 	mov    r8,QWORD PTR [rsp+0x1b0]
     135ce70:	4c 8b 8c 24 a8 01 00 	mov    r9,QWORD PTR [rsp+0x1a8]
     135ce78:	4c 89 f7             	mov    rdi,r14
     135ce7b:	48 8b 94 24 c0 01 00 	mov    rdx,QWORD PTR [rsp+0x1c0]
     135ce83:	48 8b 8c 24 b8 01 00 	mov    rcx,QWORD PTR [rsp+0x1b8]
     135ce8b:	e8 c6 01 00 00       	call   135d056 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a25da>
     135ce90:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
     135ce98:	e8 8b e8 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135ce9d:	48 8d bc 24 98 02 00 	lea    rdi,[rsp+0x298]
     135cea5:	e8 62 85 47 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     135ceaa:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
     135ceb2:	e8 bd 9f 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
     135ceb7:	48 8b 84 24 88 01 00 	mov    rax,QWORD PTR [rsp+0x188]
     135cebf:	4c 89 30             	mov    QWORD PTR [rax],r14
     135cec2:	49 89 c6             	mov    r14,rax
     135cec5:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
     135cecd:	e8 56 e8 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135ced2:	48 8d bc 24 e8 01 00 	lea    rdi,[rsp+0x1e8]
     135ceda:	e8 81 9e 95 ff       	call   cb6d60 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203d00>
     135cedf:	6a 30                	push   0x30
     135cee2:	48 8d 3c 1c          	lea    rdi,[rsp+rbx*1]
     135ceed:	e8 78 d0 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135cef6:	48 83 fb d0          	cmp    rbx,0xffffffffffffffd0
     135cefc:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     135cf04:	e8 e5 a9 95 ff       	call   cb78ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20488e>
     135cf09:	48 8d bc 24 18 02 00 	lea    rdi,[rsp+0x218]
     135cf11:	e8 f6 84 47 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     135cf16:	48 8b bc 24 28 02 00 	mov    rdi,QWORD PTR [rsp+0x228]
     135cf1e:	e8 63 15 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135cf23:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135cf2c:	48 3b 84 24 60 03 00 	cmp    rax,QWORD PTR [rsp+0x360]
     135cf3a:	4c 89 f0             	mov    rax,r14
     135cf4f:	e8 6b d0 71 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
     135cf54:	e8 66 d0 71 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
     135cf59:	48 89 c3             	mov    rbx,rax

## Calls after TimelineAds lookup that receive local/derived value
### 0x135c95e: call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
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

### 0x135c96e: call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
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

### 0x135c979: call   cb74f2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x204492>
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

### 0x135c984: call   cb7548 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2044e8>
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

### 0x135c994: call   cb6d36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203cd6>
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

### 0x135c9ab: call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
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

### 0x135c9ca: call   b88014 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fb4>
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

### 0x135c9da: call   10759bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23cdd2>
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

### 0x135cac0: call   QWORD PTR [rax+0x10]
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

### 0x135cac9: call   QWORD PTR [rcx+0x28]
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

### 0x135cada: call   QWORD PTR [rax+0x30]
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

### 0x135cae3: call   QWORD PTR [rcx+0x178]
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

### 0x135cb1f: call   QWORD PTR [rax+0x10]
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

### 0x135cb2c: call   150d21e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3527a2>
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

### 0x135cb3a: call   150d322 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3528a6>
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

### 0x135cb50: call   cb75ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20454c>
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

### 0x135cb61: call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
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

### 0x135cb7d: call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
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

### 0x135cb92: call   cb77dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20477c>
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

### 0x135cbb1: call   QWORD PTR [rax+0x28]
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

### 0x135cbc2: call   QWORD PTR [rax+0x58]
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

### 0x135cbd3: call   QWORD PTR [rax+0x28]
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

### 0x135cbdf: call   QWORD PTR [rax+0x50]
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

### 0x135cbf0: call   QWORD PTR [rax+0x28]
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

### 0x135cc1c: call   17edf00 <_Znwm@plt>
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

### 0x135cc5b: call   a7ba22 <JNI_OnUnload@@Base+0x32ef>
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

### 0x135cc6e: call   17edf00 <_Znwm@plt>
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

### 0x135cc88: call   150e44e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3539d2>
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

### 0x135ce8b: call   135d056 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a25da>
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

### 0x135ce98: call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
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

### 0x135cea5: call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
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

### 0x135ceb2: call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
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

### 0x135cecd: call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
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

### 0x135ceda: call   cb6d60 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203d00>
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

### 0x135ceed: call   a79f6a <JNI_OnUnload@@Base+0x1837>
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

### 0x135cf04: call   cb78ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20488e>
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

### 0x135cf11: call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
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

### 0x135cf1e: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
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
     135cf5c:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]

### 0x135cf4f: call   a79fbf <JNI_OnUnload@@Base+0x188c>
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
     135cf5c:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
     135cf63:	00 
     135cf64:	e8 bf e7 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135cf69:	48 8d bc 24 98 02 00 	lea    rdi,[rsp+0x298]
     135cf70:	00 
     135cf71:	e8 96 84 47 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     135cf76:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
     135cf7d:	00 
     135cf7e:	e8 f1 9e 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
     135cf83:	eb 03                	jmp    135cf88 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a250c>
     135cf85:	48 89 c3             	mov    rbx,rax
     135cf88:	4c 89 f7             	mov    rdi,r14
     135cf8b:	e8 90 0f 49 00       	call   17edf20 <_ZdlPv@plt>
     135cf90:	eb 03                	jmp    135cf95 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2519>
     135cf92:	48 89 c3             	mov    rbx,rax
     135cf95:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]

### 0x135cf54: call   a79fbf <JNI_OnUnload@@Base+0x188c>
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
     135cf5c:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
     135cf63:	00 
     135cf64:	e8 bf e7 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135cf69:	48 8d bc 24 98 02 00 	lea    rdi,[rsp+0x298]
     135cf70:	00 
     135cf71:	e8 96 84 47 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     135cf76:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
     135cf7d:	00 
     135cf7e:	e8 f1 9e 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
     135cf83:	eb 03                	jmp    135cf88 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a250c>
     135cf85:	48 89 c3             	mov    rbx,rax
     135cf88:	4c 89 f7             	mov    rdi,r14
     135cf8b:	e8 90 0f 49 00       	call   17edf20 <_ZdlPv@plt>
     135cf90:	eb 03                	jmp    135cf95 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2519>
     135cf92:	48 89 c3             	mov    rbx,rax
     135cf95:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
     135cf9c:	00 

### 0x135cf64: call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
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
     135cf5c:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
     135cf63:	00 
     135cf64:	e8 bf e7 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135cf69:	48 8d bc 24 98 02 00 	lea    rdi,[rsp+0x298]
     135cf70:	00 
     135cf71:	e8 96 84 47 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     135cf76:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
     135cf7d:	00 
     135cf7e:	e8 f1 9e 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
     135cf83:	eb 03                	jmp    135cf88 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a250c>
     135cf85:	48 89 c3             	mov    rbx,rax
     135cf88:	4c 89 f7             	mov    rdi,r14
     135cf8b:	e8 90 0f 49 00       	call   17edf20 <_ZdlPv@plt>
     135cf90:	eb 03                	jmp    135cf95 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2519>
     135cf92:	48 89 c3             	mov    rbx,rax
     135cf95:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
     135cf9c:	00 
     135cf9d:	e8 86 e7 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135cfa2:	eb 3f                	jmp    135cfe3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2567>
     135cfa4:	48 89 c3             	mov    rbx,rax
     135cfa7:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]

### 0x135cf71: call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     135cf49:	41 5e                	pop    r14
     135cf4b:	41 5f                	pop    r15
     135cf4d:	5d                   	pop    rbp
     135cf4e:	c3                   	ret
     135cf4f:	e8 6b d0 71 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
     135cf54:	e8 66 d0 71 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
     135cf59:	48 89 c3             	mov    rbx,rax
     135cf5c:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
     135cf63:	00 
     135cf64:	e8 bf e7 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135cf69:	48 8d bc 24 98 02 00 	lea    rdi,[rsp+0x298]
     135cf70:	00 
     135cf71:	e8 96 84 47 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     135cf76:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
     135cf7d:	00 
     135cf7e:	e8 f1 9e 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
     135cf83:	eb 03                	jmp    135cf88 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a250c>
     135cf85:	48 89 c3             	mov    rbx,rax
     135cf88:	4c 89 f7             	mov    rdi,r14
     135cf8b:	e8 90 0f 49 00       	call   17edf20 <_ZdlPv@plt>
     135cf90:	eb 03                	jmp    135cf95 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2519>
     135cf92:	48 89 c3             	mov    rbx,rax
     135cf95:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
     135cf9c:	00 
     135cf9d:	e8 86 e7 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135cfa2:	eb 3f                	jmp    135cfe3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2567>
     135cfa4:	48 89 c3             	mov    rbx,rax
     135cfa7:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
     135cfae:	00 
     135cfaf:	e8 6e ea 71 ff       	call   a7ba22 <JNI_OnUnload@@Base+0x32ef>
     135cfb4:	eb 2d                	jmp    135cfe3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2567>

### 0x135cf7e: call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
     135cf4e:	c3                   	ret
     135cf4f:	e8 6b d0 71 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
     135cf54:	e8 66 d0 71 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
     135cf59:	48 89 c3             	mov    rbx,rax
     135cf5c:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
     135cf63:	00 
     135cf64:	e8 bf e7 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135cf69:	48 8d bc 24 98 02 00 	lea    rdi,[rsp+0x298]
     135cf70:	00 
     135cf71:	e8 96 84 47 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     135cf76:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
     135cf7d:	00 
     135cf7e:	e8 f1 9e 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
     135cf83:	eb 03                	jmp    135cf88 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a250c>
     135cf85:	48 89 c3             	mov    rbx,rax
     135cf88:	4c 89 f7             	mov    rdi,r14
     135cf8b:	e8 90 0f 49 00       	call   17edf20 <_ZdlPv@plt>
     135cf90:	eb 03                	jmp    135cf95 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2519>
     135cf92:	48 89 c3             	mov    rbx,rax
     135cf95:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
     135cf9c:	00 
     135cf9d:	e8 86 e7 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135cfa2:	eb 3f                	jmp    135cfe3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2567>
     135cfa4:	48 89 c3             	mov    rbx,rax
     135cfa7:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
     135cfae:	00 
     135cfaf:	e8 6e ea 71 ff       	call   a7ba22 <JNI_OnUnload@@Base+0x32ef>
     135cfb4:	eb 2d                	jmp    135cfe3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2567>
     135cfb6:	eb 28                	jmp    135cfe0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2564>
     135cfb8:	48 89 c3             	mov    rbx,rax
     135cfbb:	eb 33                	jmp    135cff0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2574>

### 0x135cf8b: call   17edf20 <_ZdlPv@plt>
     135cf5c:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
     135cf63:	00 
     135cf64:	e8 bf e7 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135cf69:	48 8d bc 24 98 02 00 	lea    rdi,[rsp+0x298]
     135cf70:	00 
     135cf71:	e8 96 84 47 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     135cf76:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
     135cf7d:	00 
     135cf7e:	e8 f1 9e 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
     135cf83:	eb 03                	jmp    135cf88 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a250c>
     135cf85:	48 89 c3             	mov    rbx,rax
     135cf88:	4c 89 f7             	mov    rdi,r14
     135cf8b:	e8 90 0f 49 00       	call   17edf20 <_ZdlPv@plt>
     135cf90:	eb 03                	jmp    135cf95 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2519>
     135cf92:	48 89 c3             	mov    rbx,rax
     135cf95:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
     135cf9c:	00 
     135cf9d:	e8 86 e7 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135cfa2:	eb 3f                	jmp    135cfe3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2567>
     135cfa4:	48 89 c3             	mov    rbx,rax
     135cfa7:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
     135cfae:	00 
     135cfaf:	e8 6e ea 71 ff       	call   a7ba22 <JNI_OnUnload@@Base+0x32ef>
     135cfb4:	eb 2d                	jmp    135cfe3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2567>
     135cfb6:	eb 28                	jmp    135cfe0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2564>
     135cfb8:	48 89 c3             	mov    rbx,rax
     135cfbb:	eb 33                	jmp    135cff0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2574>
     135cfbd:	48 89 c3             	mov    rbx,rax
     135cfc0:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
     135cfc7:	00 
     135cfc8:	e8 9d cf 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### 0x135cf9d: call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135cf71:	e8 96 84 47 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     135cf76:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
     135cf7d:	00 
     135cf7e:	e8 f1 9e 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
     135cf83:	eb 03                	jmp    135cf88 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a250c>
     135cf85:	48 89 c3             	mov    rbx,rax
     135cf88:	4c 89 f7             	mov    rdi,r14
     135cf8b:	e8 90 0f 49 00       	call   17edf20 <_ZdlPv@plt>
     135cf90:	eb 03                	jmp    135cf95 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2519>
     135cf92:	48 89 c3             	mov    rbx,rax
     135cf95:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
     135cf9c:	00 
     135cf9d:	e8 86 e7 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135cfa2:	eb 3f                	jmp    135cfe3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2567>
     135cfa4:	48 89 c3             	mov    rbx,rax
     135cfa7:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
     135cfae:	00 
     135cfaf:	e8 6e ea 71 ff       	call   a7ba22 <JNI_OnUnload@@Base+0x32ef>
     135cfb4:	eb 2d                	jmp    135cfe3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2567>
     135cfb6:	eb 28                	jmp    135cfe0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2564>
     135cfb8:	48 89 c3             	mov    rbx,rax
     135cfbb:	eb 33                	jmp    135cff0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2574>
     135cfbd:	48 89 c3             	mov    rbx,rax
     135cfc0:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
     135cfc7:	00 
     135cfc8:	e8 9d cf 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135cfcd:	eb 3f                	jmp    135d00e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2592>
     135cfcf:	48 89 c3             	mov    rbx,rax
     135cfd2:	eb 3a                	jmp    135d00e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2592>
     135cfd4:	48 89 c3             	mov    rbx,rax
     135cfd7:	eb 42                	jmp    135d01b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a259f>

### 0x135cfaf: call   a7ba22 <JNI_OnUnload@@Base+0x32ef>
     135cf85:	48 89 c3             	mov    rbx,rax
     135cf88:	4c 89 f7             	mov    rdi,r14
     135cf8b:	e8 90 0f 49 00       	call   17edf20 <_ZdlPv@plt>
     135cf90:	eb 03                	jmp    135cf95 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2519>
     135cf92:	48 89 c3             	mov    rbx,rax
     135cf95:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
     135cf9c:	00 
     135cf9d:	e8 86 e7 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135cfa2:	eb 3f                	jmp    135cfe3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2567>
     135cfa4:	48 89 c3             	mov    rbx,rax
     135cfa7:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
     135cfae:	00 
     135cfaf:	e8 6e ea 71 ff       	call   a7ba22 <JNI_OnUnload@@Base+0x32ef>
     135cfb4:	eb 2d                	jmp    135cfe3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2567>
     135cfb6:	eb 28                	jmp    135cfe0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2564>
     135cfb8:	48 89 c3             	mov    rbx,rax
     135cfbb:	eb 33                	jmp    135cff0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2574>
     135cfbd:	48 89 c3             	mov    rbx,rax
     135cfc0:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
     135cfc7:	00 
     135cfc8:	e8 9d cf 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135cfcd:	eb 3f                	jmp    135d00e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2592>
     135cfcf:	48 89 c3             	mov    rbx,rax
     135cfd2:	eb 3a                	jmp    135d00e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2592>
     135cfd4:	48 89 c3             	mov    rbx,rax
     135cfd7:	eb 42                	jmp    135d01b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a259f>
     135cfd9:	eb 00                	jmp    135cfdb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a255f>
     135cfdb:	48 89 c3             	mov    rbx,rax
     135cfde:	eb 48                	jmp    135d028 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a25ac>
     135cfe0:	48 89 c3             	mov    rbx,rax
     135cfe3:	48 8d bc 24 e8 01 00 	lea    rdi,[rsp+0x1e8]

### 0x135cfc8: call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135cfa2:	eb 3f                	jmp    135cfe3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2567>
     135cfa4:	48 89 c3             	mov    rbx,rax
     135cfa7:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
     135cfae:	00 
     135cfaf:	e8 6e ea 71 ff       	call   a7ba22 <JNI_OnUnload@@Base+0x32ef>
     135cfb4:	eb 2d                	jmp    135cfe3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2567>
     135cfb6:	eb 28                	jmp    135cfe0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2564>
     135cfb8:	48 89 c3             	mov    rbx,rax
     135cfbb:	eb 33                	jmp    135cff0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2574>
     135cfbd:	48 89 c3             	mov    rbx,rax
     135cfc0:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
     135cfc7:	00 
     135cfc8:	e8 9d cf 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135cfcd:	eb 3f                	jmp    135d00e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2592>
     135cfcf:	48 89 c3             	mov    rbx,rax
     135cfd2:	eb 3a                	jmp    135d00e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2592>
     135cfd4:	48 89 c3             	mov    rbx,rax
     135cfd7:	eb 42                	jmp    135d01b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a259f>
     135cfd9:	eb 00                	jmp    135cfdb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a255f>
     135cfdb:	48 89 c3             	mov    rbx,rax
     135cfde:	eb 48                	jmp    135d028 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a25ac>
     135cfe0:	48 89 c3             	mov    rbx,rax
     135cfe3:	48 8d bc 24 e8 01 00 	lea    rdi,[rsp+0x1e8]
     135cfea:	00 
     135cfeb:	e8 70 9d 95 ff       	call   cb6d60 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203d00>
     135cff0:	6a 30                	push   0x30
     135cff2:	41 5e                	pop    r14
     135cff4:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
     135cff8:	48 81 c7 a0 02 00 00 	add    rdi,0x2a0
     135cfff:	e8 66 cf 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135d004:	49 83 c6 d0          	add    r14,0xffffffffffffffd0

### 0x135cfeb: call   cb6d60 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203d00>
     135cfc8:	e8 9d cf 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135cfcd:	eb 3f                	jmp    135d00e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2592>
     135cfcf:	48 89 c3             	mov    rbx,rax
     135cfd2:	eb 3a                	jmp    135d00e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2592>
     135cfd4:	48 89 c3             	mov    rbx,rax
     135cfd7:	eb 42                	jmp    135d01b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a259f>
     135cfd9:	eb 00                	jmp    135cfdb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a255f>
     135cfdb:	48 89 c3             	mov    rbx,rax
     135cfde:	eb 48                	jmp    135d028 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a25ac>
     135cfe0:	48 89 c3             	mov    rbx,rax
     135cfe3:	48 8d bc 24 e8 01 00 	lea    rdi,[rsp+0x1e8]
     135cfea:	00 
     135cfeb:	e8 70 9d 95 ff       	call   cb6d60 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203d00>
     135cff0:	6a 30                	push   0x30
     135cff2:	41 5e                	pop    r14
     135cff4:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
     135cff8:	48 81 c7 a0 02 00 00 	add    rdi,0x2a0
     135cfff:	e8 66 cf 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135d004:	49 83 c6 d0          	add    r14,0xffffffffffffffd0
     135d008:	49 83 fe d0          	cmp    r14,0xffffffffffffffd0
     135d00c:	75 e6                	jne    135cff4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2578>
     135d00e:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     135d015:	00 
     135d016:	e8 d3 a8 95 ff       	call   cb78ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20488e>
     135d01b:	48 8d bc 24 18 02 00 	lea    rdi,[rsp+0x218]
     135d022:	00 
     135d023:	e8 e4 83 47 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     135d028:	48 8b bc 24 28 02 00 	mov    rdi,QWORD PTR [rsp+0x228]
     135d02f:	00 
     135d030:	e8 51 14 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135d035:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### 0x135cfff: call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135cfd7:	eb 42                	jmp    135d01b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a259f>
     135cfd9:	eb 00                	jmp    135cfdb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a255f>
     135cfdb:	48 89 c3             	mov    rbx,rax
     135cfde:	eb 48                	jmp    135d028 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a25ac>
     135cfe0:	48 89 c3             	mov    rbx,rax
     135cfe3:	48 8d bc 24 e8 01 00 	lea    rdi,[rsp+0x1e8]
     135cfea:	00 
     135cfeb:	e8 70 9d 95 ff       	call   cb6d60 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203d00>
     135cff0:	6a 30                	push   0x30
     135cff2:	41 5e                	pop    r14
     135cff4:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
     135cff8:	48 81 c7 a0 02 00 00 	add    rdi,0x2a0
     135cfff:	e8 66 cf 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135d004:	49 83 c6 d0          	add    r14,0xffffffffffffffd0
     135d008:	49 83 fe d0          	cmp    r14,0xffffffffffffffd0
     135d00c:	75 e6                	jne    135cff4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2578>
     135d00e:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     135d015:	00 
     135d016:	e8 d3 a8 95 ff       	call   cb78ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20488e>
     135d01b:	48 8d bc 24 18 02 00 	lea    rdi,[rsp+0x218]
     135d022:	00 
     135d023:	e8 e4 83 47 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     135d028:	48 8b bc 24 28 02 00 	mov    rdi,QWORD PTR [rsp+0x228]
     135d02f:	00 
     135d030:	e8 51 14 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135d035:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135d03c:	00 00 
     135d03e:	48 3b 84 24 60 03 00 	cmp    rax,QWORD PTR [rsp+0x360]
     135d045:	00 
     135d046:	75 08                	jne    135d050 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a25d4>
     135d048:	48 89 df             	mov    rdi,rbx

### 0x135d016: call   cb78ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20488e>
     135cfea:	00 
     135cfeb:	e8 70 9d 95 ff       	call   cb6d60 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203d00>
     135cff0:	6a 30                	push   0x30
     135cff2:	41 5e                	pop    r14
     135cff4:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
     135cff8:	48 81 c7 a0 02 00 00 	add    rdi,0x2a0
     135cfff:	e8 66 cf 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135d004:	49 83 c6 d0          	add    r14,0xffffffffffffffd0
     135d008:	49 83 fe d0          	cmp    r14,0xffffffffffffffd0
     135d00c:	75 e6                	jne    135cff4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2578>
     135d00e:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     135d015:	00 
     135d016:	e8 d3 a8 95 ff       	call   cb78ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20488e>
     135d01b:	48 8d bc 24 18 02 00 	lea    rdi,[rsp+0x218]
     135d022:	00 
     135d023:	e8 e4 83 47 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     135d028:	48 8b bc 24 28 02 00 	mov    rdi,QWORD PTR [rsp+0x228]
     135d02f:	00 
     135d030:	e8 51 14 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135d035:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135d03c:	00 00 
     135d03e:	48 3b 84 24 60 03 00 	cmp    rax,QWORD PTR [rsp+0x360]
     135d045:	00 
     135d046:	75 08                	jne    135d050 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a25d4>
     135d048:	48 89 df             	mov    rdi,rbx
     135d04b:	e8 80 2c 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     135d050:	e8 5b 2a 49 00       	call   17efab0 <__stack_chk_fail@plt>
     135d055:	cc                   	int3
     135d056:	55                   	push   rbp
     135d057:	41 57                	push   r15
     135d059:	41 56                	push   r14

### 0x135d023: call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     135cff2:	41 5e                	pop    r14
     135cff4:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
     135cff8:	48 81 c7 a0 02 00 00 	add    rdi,0x2a0
     135cfff:	e8 66 cf 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135d004:	49 83 c6 d0          	add    r14,0xffffffffffffffd0
     135d008:	49 83 fe d0          	cmp    r14,0xffffffffffffffd0
     135d00c:	75 e6                	jne    135cff4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2578>
     135d00e:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     135d015:	00 
     135d016:	e8 d3 a8 95 ff       	call   cb78ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20488e>
     135d01b:	48 8d bc 24 18 02 00 	lea    rdi,[rsp+0x218]
     135d022:	00 
     135d023:	e8 e4 83 47 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     135d028:	48 8b bc 24 28 02 00 	mov    rdi,QWORD PTR [rsp+0x228]
     135d02f:	00 
     135d030:	e8 51 14 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135d035:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135d03c:	00 00 
     135d03e:	48 3b 84 24 60 03 00 	cmp    rax,QWORD PTR [rsp+0x360]
     135d045:	00 
     135d046:	75 08                	jne    135d050 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a25d4>
     135d048:	48 89 df             	mov    rdi,rbx
     135d04b:	e8 80 2c 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     135d050:	e8 5b 2a 49 00       	call   17efab0 <__stack_chk_fail@plt>
     135d055:	cc                   	int3
     135d056:	55                   	push   rbp
     135d057:	41 57                	push   r15
     135d059:	41 56                	push   r14
     135d05b:	41 55                	push   r13
     135d05d:	41 54                	push   r12
     135d05f:	53                   	push   rbx

### 0x135d030: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135cfff:	e8 66 cf 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135d004:	49 83 c6 d0          	add    r14,0xffffffffffffffd0
     135d008:	49 83 fe d0          	cmp    r14,0xffffffffffffffd0
     135d00c:	75 e6                	jne    135cff4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2578>
     135d00e:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     135d015:	00 
     135d016:	e8 d3 a8 95 ff       	call   cb78ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20488e>
     135d01b:	48 8d bc 24 18 02 00 	lea    rdi,[rsp+0x218]
     135d022:	00 
     135d023:	e8 e4 83 47 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     135d028:	48 8b bc 24 28 02 00 	mov    rdi,QWORD PTR [rsp+0x228]
     135d02f:	00 
     135d030:	e8 51 14 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135d035:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135d03c:	00 00 
     135d03e:	48 3b 84 24 60 03 00 	cmp    rax,QWORD PTR [rsp+0x360]
     135d045:	00 
     135d046:	75 08                	jne    135d050 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a25d4>
     135d048:	48 89 df             	mov    rdi,rbx
     135d04b:	e8 80 2c 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     135d050:	e8 5b 2a 49 00       	call   17efab0 <__stack_chk_fail@plt>
     135d055:	cc                   	int3
     135d056:	55                   	push   rbp
     135d057:	41 57                	push   r15
     135d059:	41 56                	push   r14
     135d05b:	41 55                	push   r13
     135d05d:	41 54                	push   r12
     135d05f:	53                   	push   rbx
     135d060:	48 81 ec 28 10 00 00 	sub    rsp,0x1028
     135d067:	4c 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],r9
     135d06c:	4c 89 c3             	mov    rbx,r8

### 0x135d04b: call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     135d01b:	48 8d bc 24 18 02 00 	lea    rdi,[rsp+0x218]
     135d022:	00 
     135d023:	e8 e4 83 47 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     135d028:	48 8b bc 24 28 02 00 	mov    rdi,QWORD PTR [rsp+0x228]
     135d02f:	00 
     135d030:	e8 51 14 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135d035:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135d03c:	00 00 
     135d03e:	48 3b 84 24 60 03 00 	cmp    rax,QWORD PTR [rsp+0x360]
     135d045:	00 
     135d046:	75 08                	jne    135d050 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a25d4>
     135d048:	48 89 df             	mov    rdi,rbx
     135d04b:	e8 80 2c 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     135d050:	e8 5b 2a 49 00       	call   17efab0 <__stack_chk_fail@plt>
     135d055:	cc                   	int3
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

### 0x135d050: call   17efab0 <__stack_chk_fail@plt>
     135d022:	00 
     135d023:	e8 e4 83 47 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     135d028:	48 8b bc 24 28 02 00 	mov    rdi,QWORD PTR [rsp+0x228]
     135d02f:	00 
     135d030:	e8 51 14 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135d035:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135d03c:	00 00 
     135d03e:	48 3b 84 24 60 03 00 	cmp    rax,QWORD PTR [rsp+0x360]
     135d045:	00 
     135d046:	75 08                	jne    135d050 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a25d4>
     135d048:	48 89 df             	mov    rdi,rbx
     135d04b:	e8 80 2c 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     135d050:	e8 5b 2a 49 00       	call   17efab0 <__stack_chk_fail@plt>
     135d055:	cc                   	int3
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

## Writes to newly allocated TimelineConductor/service objects using TimelineAds-derived regs
### source reg rdi @0x135cbe5
     135cc57:	c6 47 08 01          	mov    BYTE PTR [rdi+0x8],0x1
     135ccea:	48 89 7a 10          	mov    QWORD PTR [rdx+0x10],rdi

### source reg rax @0x135cdda
     135cde2:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     135cdef:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     135cdfc:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     135ce09:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     135ce16:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     135ce28:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     135ce35:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     135ce42:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     135ce4f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     135ce5c:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     135cebf:	4c 89 30             	mov    QWORD PTR [rax],r14

## Registry 0xb7 access context
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

