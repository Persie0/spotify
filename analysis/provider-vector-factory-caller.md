# Provider vector factory caller

Expected factory ABI: hidden-sret output in rdi, provider descriptor in rsi, shared setup bundle in rdx, registry context in rcx, then provider virtual +0x28.
Provider descriptors are stored by addb16 in a vector {begin,end,cap} with 8-byte elements.

Candidates: 692
## rank 1: score=57 FDE=0x14cdc2a..0x14d4d4c features=stride8,begin-end,+10,+18,+20,sret=27
### +0x28 call 0x14d1c49
 14d1bdd:	31 d2                	xor    edx,edx
 14d1bdf:	6a 08                	push   0x8
 14d1be1:	41 59                	pop    r9
 14d1be3:	e8 ac 8b 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 14d1be8:	4c 8d bc 24 a0 03 00 	lea    r15,[rsp+0x3a0]
 14d1bef:	00 
 14d1bf0:	4c 89 ff             	mov    rdi,r15
 14d1bf3:	48 89 de             	mov    rsi,rbx
 14d1bf6:	4c 89 f2             	mov    rdx,r14
 14d1bf9:	e8 12 bf 01 00       	call   14edb10 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333094>
 14d1bfe:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
 14d1c05:	00 
 14d1c06:	4c 89 fe             	mov    rsi,r15
 14d1c09:	e8 e4 7f 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 14d1c0e:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
 14d1c12:	4d 89 ef             	mov    r15,r13
 14d1c15:	e8 6c c8 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14d1c1a:	4c 89 f7             	mov    rdi,r14
 14d1c1d:	e8 c6 8b 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 14d1c22:	49 8b b5 a0 00 00 00 	mov    rsi,QWORD PTR [r13+0xa0]
 14d1c29:	48 8d 05 50 92 3a 00 	lea    rax,[rip+0x3a9250]        # 187ae80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x37568>
 14d1c30:	49 89 06             	mov    QWORD PTR [r14],rax
 14d1c33:	49 89 6e 08          	mov    QWORD PTR [r14+0x8],rbp
 14d1c37:	4d 89 76 20          	mov    QWORD PTR [r14+0x20],r14
 14d1c3b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 14d1c3e:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
 14d1c45:	00 
 14d1c46:	4c 89 f2             	mov    rdx,r14
 14d1c49:	ff 50 28             	call   QWORD PTR [rax+0x28]
 14d1c4c:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
 14d1c53:	00 
 14d1c54:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
 14d1c5b:	00 
 14d1c5c:	48 89 de             	mov    rsi,rbx
 14d1c5f:	e8 8e 7f 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 14d1c64:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 14d1c68:	e8 19 c8 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14d1c6d:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
 14d1c74:	00 
 14d1c75:	48 89 df             	mov    rdi,rbx
 14d1c78:	e8 ed 82 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 14d1c7d:	49 8b b7 a0 00 00 00 	mov    rsi,QWORD PTR [r15+0xa0]
 14d1c84:	48 8d 05 3d 92 3a 00 	lea    rax,[rip+0x3a923d]        # 187aec8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x375b0>
 14d1c8b:	48 89 03             	mov    QWORD PTR [rbx],rax
 14d1c8e:	48 89 6b 08          	mov    QWORD PTR [rbx+0x8],rbp
 14d1c92:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx
 14d1c96:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 14d1c99:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
 14d1ca0:	00 
 14d1ca1:	48 89 da             	mov    rdx,rbx
 14d1ca4:	4d 89 fe             	mov    r14,r15
 14d1ca7:	4c 8b bc 24 08 01 00 	mov    r15,QWORD PTR [rsp+0x108]
 14d1cae:	00 
 14d1caf:	ff 50 28             	call   QWORD PTR [rax+0x28]
 14d1cb2:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
 14d1cb7:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
 14d1cbe:	00 
 14d1cbf:	4c 89 ff             	mov    rdi,r15
 14d1cc2:	48 89 de             	mov    rsi,rbx
 14d1cc5:	e8 28 7f 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 14d1cca:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 14d1cce:	e8 b3 c7 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14d1cd3:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
### +0x28 call 0x14cfd3d
 14cfcd2:	00 
 14cfcd3:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
 14cfcda:	00 
 14cfcdb:	48 89 de             	mov    rsi,rbx
 14cfcde:	e8 0f 9f 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 14cfce3:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 14cfce7:	e8 9a e7 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cfcec:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
 14cfcf3:	00 
 14cfcf4:	e8 ef aa 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 14cfcf9:	49 8b 5f 38          	mov    rbx,QWORD PTR [r15+0x38]
 14cfcfd:	4c 8d 84 24 30 02 00 	lea    r8,[rsp+0x230]
 14cfd04:	00 
 14cfd05:	4d 89 38             	mov    QWORD PTR [r8],r15
 14cfd08:	48 8d 35 82 d3 5c ff 	lea    rsi,[rip+0xffffffffff5cd382]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 14cfd0f:	48 8d 0d d2 2e 01 00 	lea    rcx,[rip+0x12ed2]        # 14e2be8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32816c>
 14cfd16:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
 14cfd1d:	00 
 14cfd1e:	6a 08                	push   0x8
 14cfd20:	41 59                	pop    r9
 14cfd22:	4c 89 f7             	mov    rdi,r14
 14cfd25:	31 d2                	xor    edx,edx
 14cfd27:	e8 68 aa 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 14cfd2c:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 14cfd2f:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
 14cfd36:	00 
 14cfd37:	48 89 de             	mov    rsi,rbx
 14cfd3a:	4c 89 f2             	mov    rdx,r14
 14cfd3d:	ff 50 28             	call   QWORD PTR [rax+0x28]
 14cfd40:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
 14cfd47:	00 
 14cfd48:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
 14cfd4f:	00 
 14cfd50:	48 89 de             	mov    rsi,rbx
 14cfd53:	e8 9a 9e 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 14cfd58:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 14cfd5c:	e8 25 e7 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cfd61:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
 14cfd68:	00 
 14cfd69:	e8 7a aa 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 14cfd6e:	49 8b 5f 18          	mov    rbx,QWORD PTR [r15+0x18]
 14cfd72:	4c 8d 84 24 30 02 00 	lea    r8,[rsp+0x230]
 14cfd79:	00 
 14cfd7a:	4d 89 38             	mov    QWORD PTR [r8],r15
 14cfd7d:	48 8d 35 0d d3 5c ff 	lea    rsi,[rip+0xffffffffff5cd30d]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 14cfd84:	48 8d 0d d7 33 01 00 	lea    rcx,[rip+0x133d7]        # 14e3162 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3286e6>
 14cfd8b:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
 14cfd92:	00 
 14cfd93:	6a 08                	push   0x8
 14cfd95:	41 59                	pop    r9
 14cfd97:	4c 89 f7             	mov    rdi,r14
 14cfd9a:	31 d2                	xor    edx,edx
 14cfd9c:	e8 f3 a9 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 14cfda1:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 14cfda4:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
 14cfdab:	00 
 14cfdac:	48 89 de             	mov    rsi,rbx
 14cfdaf:	4c 89 f2             	mov    rdx,r14
 14cfdb2:	ff 50 28             	call   QWORD PTR [rax+0x28]
 14cfdb5:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
 14cfdbc:	00 
 14cfdbd:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
 14cfdc4:	00 
### +0x28 call 0x14cfdb2
 14cfd47:	00 
 14cfd48:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
 14cfd4f:	00 
 14cfd50:	48 89 de             	mov    rsi,rbx
 14cfd53:	e8 9a 9e 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 14cfd58:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 14cfd5c:	e8 25 e7 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cfd61:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
 14cfd68:	00 
 14cfd69:	e8 7a aa 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 14cfd6e:	49 8b 5f 18          	mov    rbx,QWORD PTR [r15+0x18]
 14cfd72:	4c 8d 84 24 30 02 00 	lea    r8,[rsp+0x230]
 14cfd79:	00 
 14cfd7a:	4d 89 38             	mov    QWORD PTR [r8],r15
 14cfd7d:	48 8d 35 0d d3 5c ff 	lea    rsi,[rip+0xffffffffff5cd30d]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 14cfd84:	48 8d 0d d7 33 01 00 	lea    rcx,[rip+0x133d7]        # 14e3162 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3286e6>
 14cfd8b:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
 14cfd92:	00 
 14cfd93:	6a 08                	push   0x8
 14cfd95:	41 59                	pop    r9
 14cfd97:	4c 89 f7             	mov    rdi,r14
 14cfd9a:	31 d2                	xor    edx,edx
 14cfd9c:	e8 f3 a9 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 14cfda1:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 14cfda4:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
 14cfdab:	00 
 14cfdac:	48 89 de             	mov    rsi,rbx
 14cfdaf:	4c 89 f2             	mov    rdx,r14
 14cfdb2:	ff 50 28             	call   QWORD PTR [rax+0x28]
 14cfdb5:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
 14cfdbc:	00 
 14cfdbd:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
 14cfdc4:	00 
 14cfdc5:	48 89 de             	mov    rsi,rbx
 14cfdc8:	e8 25 9e 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 14cfdcd:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 14cfdd1:	e8 b0 e6 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cfdd6:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
 14cfddd:	00 
 14cfdde:	e8 05 aa 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 14cfde3:	48 8b bc 24 a8 03 00 	mov    rdi,QWORD PTR [rsp+0x3a8]
 14cfdea:	00 
 14cfdeb:	e8 c2 e6 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 14cfdf0:	48 8d 9c 24 80 03 00 	lea    rbx,[rsp+0x380]
 14cfdf7:	00 
 14cfdf8:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]
 14cfdfe:	66 0f 7f 03          	movdqa XMMWORD PTR [rbx],xmm0
 14cfe02:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
 14cfe07:	4c 89 ef             	mov    rdi,r13
 14cfe0a:	e8 77 e6 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cfe0f:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
 14cfe14:	49 8d 7d 10          	lea    rdi,[r13+0x10]
 14cfe18:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
 14cfe1d:	48 89 de             	mov    rsi,rbx
 14cfe20:	e8 f7 99 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
 14cfe25:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 14cfe29:	e8 58 e6 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14cfe2e:	4c 8b 74 24 28       	mov    r14,QWORD PTR [rsp+0x28]
 14cfe33:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
 14cfe37:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 14cfe3a:	48 8d 35 1a 85 f6 fe 	lea    rsi,[rip+0xfffffffffef6851a]        # 43835b <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5ddaa>
 14cfe41:	48 8d 0d 28 85 f6 fe 	lea    rcx,[rip+0xfffffffffef68528]        # 438370 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5ddbf>
 14cfe48:	6a 08                	push   0x8
### +0x28 call 0x14d06ad
 14d063a:	48 89 84 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rax
 14d0641:	00 
 14d0642:	4c 8d 63 50          	lea    r12,[rbx+0x50]
 14d0646:	4c 89 e7             	mov    rdi,r12
 14d0649:	e8 a8 93 30 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 14d064e:	4c 8d 6b 60          	lea    r13,[rbx+0x60]
 14d0652:	4c 89 ef             	mov    rdi,r13
 14d0655:	e8 9c 93 30 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 14d065a:	48 8d 7b 70          	lea    rdi,[rbx+0x70]
 14d065e:	48 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],rdi
 14d0663:	e8 8e 93 30 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 14d0668:	48 83 eb 80          	sub    rbx,0xffffffffffffff80
 14d066c:	48 89 df             	mov    rdi,rbx
 14d066f:	e8 1a 7c 65 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 14d0674:	41 c6 87 d8 00 00 00 	mov    BYTE PTR [r15+0xd8],0x0
 14d067b:	00 
 14d067c:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
 14d0680:	48 8d 05 b9 9b 3a 00 	lea    rax,[rip+0x3a9bb9]        # 187a240 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36928>
 14d0687:	48 89 84 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],rax
 14d068e:	00 
 14d068f:	48 89 ac 24 e8 02 00 	mov    QWORD PTR [rsp+0x2e8],rbp
 14d0696:	00 
 14d0697:	4c 89 b4 24 00 03 00 	mov    QWORD PTR [rsp+0x300],r14
 14d069e:	00 
 14d069f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 14d06a2:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
 14d06a9:	00 
 14d06aa:	4c 89 f2             	mov    rdx,r14
 14d06ad:	ff 50 28             	call   QWORD PTR [rax+0x28]
 14d06b0:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
 14d06b7:	00 
 14d06b8:	4c 89 e7             	mov    rdi,r12
 14d06bb:	4c 89 f6             	mov    rsi,r14
 14d06be:	e8 2f 95 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 14d06c3:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 14d06c7:	e8 ba dd 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14d06cc:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
 14d06d3:	00 
 14d06d4:	e8 91 98 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 14d06d9:	4d 8b 77 30          	mov    r14,QWORD PTR [r15+0x30]
 14d06dd:	4c 8d 84 24 80 03 00 	lea    r8,[rsp+0x380]
 14d06e4:	00 
 14d06e5:	49 89 28             	mov    QWORD PTR [r8],rbp
 14d06e8:	48 8d 35 a2 c9 5c ff 	lea    rsi,[rip+0xffffffffff5cc9a2]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 14d06ef:	48 8d 0d d2 d3 01 00 	lea    rcx,[rip+0x1d3d2]        # 14edac8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33304c>
 14d06f6:	4c 89 a4 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r12
 14d06fd:	00 
 14d06fe:	4c 8d a4 24 e0 02 00 	lea    r12,[rsp+0x2e0]
 14d0705:	00 
 14d0706:	6a 08                	push   0x8
 14d0708:	41 59                	pop    r9
 14d070a:	4c 89 e7             	mov    rdi,r12
 14d070d:	31 d2                	xor    edx,edx
 14d070f:	e8 80 a0 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 14d0714:	49 8b 06             	mov    rax,QWORD PTR [r14]
 14d0717:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
 14d071e:	00 
 14d071f:	6a 03                	push   0x3
 14d0721:	5a                   	pop    rdx
 14d0722:	4c 89 f6             	mov    rsi,r14
 14d0725:	4c 89 e1             	mov    rcx,r12
 14d0728:	ff 50 70             	call   QWORD PTR [rax+0x70]
 14d072b:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]

## rank 2: score=55 FDE=0xdda4fa..0xddbda1 features=stride8,begin-end,+10,+18,+20,sret=25
### +0x28 call 0xdda60d
  dda599:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
  dda59e:	49 8b 86 80 00 00 00 	mov    rax,QWORD PTR [r14+0x80]
  dda5a5:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
  dda5aa:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]
  dda5ae:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
  dda5b5:	00 
  dda5b6:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
  dda5ba:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  dda5bf:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
  dda5c3:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  dda5c8:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  dda5cc:	4c 89 6c 24 78       	mov    QWORD PTR [rsp+0x78],r13
  dda5d1:	4c 89 ef             	mov    rdi,r13
  dda5d4:	ff 50 28             	call   QWORD PTR [rax+0x28]
  dda5d7:	49 89 c5             	mov    r13,rax
  dda5da:	49 8b 07             	mov    rax,QWORD PTR [r15]
  dda5dd:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
  dda5e2:	4c 89 ff             	mov    rdi,r15
  dda5e5:	ff 50 28             	call   QWORD PTR [rax+0x28]
  dda5e8:	49 8b 4e 40          	mov    rcx,QWORD PTR [r14+0x40]
  dda5ec:	4c 8d 05 0d ff 5f ff 	lea    r8,[rip+0xffffffffff5fff0d]        # 3da500 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x50e5>
  dda5f3:	48 8d bc 24 e8 00 00 	lea    rdi,[rsp+0xe8]
  dda5fa:	00 
  dda5fb:	4c 89 ee             	mov    rsi,r13
  dda5fe:	48 89 c2             	mov    rdx,rax
  dda601:	e8 da 1b 00 00       	call   ddc1e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa9266>
  dda606:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  dda60a:	4c 89 e7             	mov    rdi,r12
  dda60d:	ff 50 28             	call   QWORD PTR [rax+0x28]
  dda610:	4c 8b 78 10          	mov    r15,QWORD PTR [rax+0x10]
  dda614:	6a 58                	push   0x58
  dda616:	5f                   	pop    rdi
  dda617:	e8 e4 38 a1 00       	call   17edf00 <_Znwm@plt>
  dda61c:	49 89 c6             	mov    r14,rax
  dda61f:	48 89 ac 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rbp
  dda626:	00 
  dda627:	48 8d 05 0a 03 a5 00 	lea    rax,[rip+0xa5030a]        # 182a938 <_ZTIN4asio2ip16bad_address_castE@@Base+0x6f68>
  dda62e:	48 8d 8c 24 60 01 00 	lea    rcx,[rsp+0x160]
  dda635:	00 
  dda636:	48 89 01             	mov    QWORD PTR [rcx],rax
  dda639:	48 89 59 08          	mov    QWORD PTR [rcx+0x8],rbx
  dda63d:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
  dda642:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
  dda646:	48 8b 84 24 e8 00 00 	mov    rax,QWORD PTR [rsp+0xe8]
  dda64d:	00 
  dda64e:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  dda652:	48 83 a4 24 e8 00 00 	and    QWORD PTR [rsp+0xe8],0x0
  dda659:	00 00 
  dda65b:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
  dda65f:	41 c6 46 08 00       	mov    BYTE PTR [r14+0x8],0x0
  dda664:	48 8d 05 15 03 a5 00 	lea    rax,[rip+0xa50315]        # 182a980 <_ZTIN4asio2ip16bad_address_castE@@Base+0x6fb0>
  dda66b:	49 89 06             	mov    QWORD PTR [r14],rax
  dda66e:	49 8d 46 10          	lea    rax,[r14+0x10]
  dda672:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
  dda677:	49 8d 46 18          	lea    rax,[r14+0x18]
  dda67b:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
  dda682:	00 
  dda683:	49 8d 46 20          	lea    rax,[r14+0x20]
  dda687:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
  dda68e:	00 
  dda68f:	49 8d 46 28          	lea    rax,[r14+0x28]
  dda693:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
  dda69a:	00 
### +0x28 call 0xdda5d4
  dda55d:	e8 3e 8d d8 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
  dda562:	49 89 c7             	mov    r15,rax
  dda565:	4c 89 e7             	mov    rdi,r12
  dda568:	e8 e3 72 e3 ff       	call   c11850 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e7f0>
  dda56d:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
  dda572:	4c 89 e7             	mov    rdi,r12
  dda575:	e8 1a da da ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
  dda57a:	49 89 c5             	mov    r13,rax
  dda57d:	4c 89 e7             	mov    rdi,r12
  dda580:	e8 cb 71 e3 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
  dda585:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  dda58a:	4c 89 e7             	mov    rdi,r12
  dda58d:	e8 68 72 e3 ff       	call   c117fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e79a>
  dda592:	49 89 c4             	mov    r12,rax
  dda595:	49 8b 46 60          	mov    rax,QWORD PTR [r14+0x60]
  dda599:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
  dda59e:	49 8b 86 80 00 00 00 	mov    rax,QWORD PTR [r14+0x80]
  dda5a5:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
  dda5aa:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]
  dda5ae:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
  dda5b5:	00 
  dda5b6:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
  dda5ba:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  dda5bf:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
  dda5c3:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  dda5c8:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  dda5cc:	4c 89 6c 24 78       	mov    QWORD PTR [rsp+0x78],r13
  dda5d1:	4c 89 ef             	mov    rdi,r13
  dda5d4:	ff 50 28             	call   QWORD PTR [rax+0x28]
  dda5d7:	49 89 c5             	mov    r13,rax
  dda5da:	49 8b 07             	mov    rax,QWORD PTR [r15]
  dda5dd:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
  dda5e2:	4c 89 ff             	mov    rdi,r15
  dda5e5:	ff 50 28             	call   QWORD PTR [rax+0x28]
  dda5e8:	49 8b 4e 40          	mov    rcx,QWORD PTR [r14+0x40]
  dda5ec:	4c 8d 05 0d ff 5f ff 	lea    r8,[rip+0xffffffffff5fff0d]        # 3da500 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x50e5>
  dda5f3:	48 8d bc 24 e8 00 00 	lea    rdi,[rsp+0xe8]
  dda5fa:	00 
  dda5fb:	4c 89 ee             	mov    rsi,r13
  dda5fe:	48 89 c2             	mov    rdx,rax
  dda601:	e8 da 1b 00 00       	call   ddc1e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa9266>
  dda606:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  dda60a:	4c 89 e7             	mov    rdi,r12
  dda60d:	ff 50 28             	call   QWORD PTR [rax+0x28]
  dda610:	4c 8b 78 10          	mov    r15,QWORD PTR [rax+0x10]
  dda614:	6a 58                	push   0x58
  dda616:	5f                   	pop    rdi
  dda617:	e8 e4 38 a1 00       	call   17edf00 <_Znwm@plt>
  dda61c:	49 89 c6             	mov    r14,rax
  dda61f:	48 89 ac 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rbp
  dda626:	00 
  dda627:	48 8d 05 0a 03 a5 00 	lea    rax,[rip+0xa5030a]        # 182a938 <_ZTIN4asio2ip16bad_address_castE@@Base+0x6f68>
  dda62e:	48 8d 8c 24 60 01 00 	lea    rcx,[rsp+0x160]
  dda635:	00 
  dda636:	48 89 01             	mov    QWORD PTR [rcx],rax
  dda639:	48 89 59 08          	mov    QWORD PTR [rcx+0x8],rbx
  dda63d:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
  dda642:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
  dda646:	48 8b 84 24 e8 00 00 	mov    rax,QWORD PTR [rsp+0xe8]
  dda64d:	00 
  dda64e:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  dda652:	48 83 a4 24 e8 00 00 	and    QWORD PTR [rsp+0xe8],0x0
  dda659:	00 00 
### +0x28 call 0xdda5e5
  dda572:	4c 89 e7             	mov    rdi,r12
  dda575:	e8 1a da da ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
  dda57a:	49 89 c5             	mov    r13,rax
  dda57d:	4c 89 e7             	mov    rdi,r12
  dda580:	e8 cb 71 e3 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
  dda585:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  dda58a:	4c 89 e7             	mov    rdi,r12
  dda58d:	e8 68 72 e3 ff       	call   c117fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e79a>
  dda592:	49 89 c4             	mov    r12,rax
  dda595:	49 8b 46 60          	mov    rax,QWORD PTR [r14+0x60]
  dda599:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
  dda59e:	49 8b 86 80 00 00 00 	mov    rax,QWORD PTR [r14+0x80]
  dda5a5:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
  dda5aa:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]
  dda5ae:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
  dda5b5:	00 
  dda5b6:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
  dda5ba:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  dda5bf:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
  dda5c3:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  dda5c8:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  dda5cc:	4c 89 6c 24 78       	mov    QWORD PTR [rsp+0x78],r13
  dda5d1:	4c 89 ef             	mov    rdi,r13
  dda5d4:	ff 50 28             	call   QWORD PTR [rax+0x28]
  dda5d7:	49 89 c5             	mov    r13,rax
  dda5da:	49 8b 07             	mov    rax,QWORD PTR [r15]
  dda5dd:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
  dda5e2:	4c 89 ff             	mov    rdi,r15
  dda5e5:	ff 50 28             	call   QWORD PTR [rax+0x28]
  dda5e8:	49 8b 4e 40          	mov    rcx,QWORD PTR [r14+0x40]
  dda5ec:	4c 8d 05 0d ff 5f ff 	lea    r8,[rip+0xffffffffff5fff0d]        # 3da500 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x50e5>
  dda5f3:	48 8d bc 24 e8 00 00 	lea    rdi,[rsp+0xe8]
  dda5fa:	00 
  dda5fb:	4c 89 ee             	mov    rsi,r13
  dda5fe:	48 89 c2             	mov    rdx,rax
  dda601:	e8 da 1b 00 00       	call   ddc1e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa9266>
  dda606:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  dda60a:	4c 89 e7             	mov    rdi,r12
  dda60d:	ff 50 28             	call   QWORD PTR [rax+0x28]
  dda610:	4c 8b 78 10          	mov    r15,QWORD PTR [rax+0x10]
  dda614:	6a 58                	push   0x58
  dda616:	5f                   	pop    rdi
  dda617:	e8 e4 38 a1 00       	call   17edf00 <_Znwm@plt>
  dda61c:	49 89 c6             	mov    r14,rax
  dda61f:	48 89 ac 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rbp
  dda626:	00 
  dda627:	48 8d 05 0a 03 a5 00 	lea    rax,[rip+0xa5030a]        # 182a938 <_ZTIN4asio2ip16bad_address_castE@@Base+0x6f68>
  dda62e:	48 8d 8c 24 60 01 00 	lea    rcx,[rsp+0x160]
  dda635:	00 
  dda636:	48 89 01             	mov    QWORD PTR [rcx],rax
  dda639:	48 89 59 08          	mov    QWORD PTR [rcx+0x8],rbx
  dda63d:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
  dda642:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
  dda646:	48 8b 84 24 e8 00 00 	mov    rax,QWORD PTR [rsp+0xe8]
  dda64d:	00 
  dda64e:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  dda652:	48 83 a4 24 e8 00 00 	and    QWORD PTR [rsp+0xe8],0x0
  dda659:	00 00 
  dda65b:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
  dda65f:	41 c6 46 08 00       	mov    BYTE PTR [r14+0x8],0x0
  dda664:	48 8d 05 15 03 a5 00 	lea    rax,[rip+0xa50315]        # 182a980 <_ZTIN4asio2ip16bad_address_castE@@Base+0x6fb0>
  dda66b:	49 89 06             	mov    QWORD PTR [r14],rax
  dda66e:	49 8d 46 10          	lea    rax,[r14+0x10]
### +0x28 call 0xddaaec
  ddaa74:	48 8d 35 b5 67 5f ff 	lea    rsi,[rip+0xffffffffff5f67b5]        # 3d1230 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2084>
  ddaa7b:	4c 89 e2             	mov    rdx,r12
  ddaa7e:	48 8d 0d db 67 5f ff 	lea    rcx,[rip+0xffffffffff5f67db]        # 3d1260 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x20b4>
  ddaa85:	6a 18                	push   0x18
  ddaa87:	41 58                	pop    r8
  ddaa89:	45 31 c9             	xor    r9d,r9d
  ddaa8c:	e8 f9 c8 80 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  ddaa91:	88 44 24 0c          	mov    BYTE PTR [rsp+0xc],al
  ddaa95:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  ddaa98:	48 8d 35 e1 67 5f ff 	lea    rsi,[rip+0xffffffffff5f67e1]        # 3d1280 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x20d4>
  ddaa9f:	4c 89 e2             	mov    rdx,r12
  ddaaa2:	48 8d 0d 07 68 5f ff 	lea    rcx,[rip+0xffffffffff5f6807]        # 3d12b0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2104>
  ddaaa9:	49 89 e8             	mov    r8,rbp
  ddaaac:	45 31 c9             	xor    r9d,r9d
  ddaaaf:	e8 76 c9 80 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  ddaab4:	89 84 24 94 00 00 00 	mov    DWORD PTR [rsp+0x94],eax
  ddaabb:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  ddaabe:	48 8d 35 0b 68 5f ff 	lea    rsi,[rip+0xffffffffff5f680b]        # 3d12d0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2124>
  ddaac5:	4c 89 e2             	mov    rdx,r12
  ddaac8:	48 8d 0d 31 68 5f ff 	lea    rcx,[rip+0xffffffffff5f6831]        # 3d1300 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2154>
  ddaacf:	49 89 e8             	mov    r8,rbp
  ddaad2:	45 31 c9             	xor    r9d,r9d
  ddaad5:	e8 50 c9 80 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  ddaada:	89 c3                	mov    ebx,eax
  ddaadc:	48 8b 74 24 40       	mov    rsi,QWORD PTR [rsp+0x40]
  ddaae1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  ddaae4:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
  ddaaeb:	00 
  ddaaec:	ff 50 28             	call   QWORD PTR [rax+0x28]
  ddaaef:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  ddaaf4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  ddaaf7:	ff 50 28             	call   QWORD PTR [rax+0x28]
  ddaafa:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
  ddab01:	00 
  ddab02:	4c 8b 74 24 50       	mov    r14,QWORD PTR [rsp+0x50]
  ddab07:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
  ddab0c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  ddab0f:	ff 50 28             	call   QWORD PTR [rax+0x28]
  ddab12:	48 89 c5             	mov    rbp,rax
  ddab15:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
  ddab1a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  ddab1d:	ff 50 28             	call   QWORD PTR [rax+0x28]
  ddab20:	49 89 c7             	mov    r15,rax
  ddab23:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  ddab28:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  ddab2b:	ff 50 28             	call   QWORD PTR [rax+0x28]
  ddab2e:	49 89 c5             	mov    r13,rax
  ddab31:	49 8b 06             	mov    rax,QWORD PTR [r14]
  ddab34:	4c 89 f7             	mov    rdi,r14
  ddab37:	ff 50 48             	call   QWORD PTR [rax+0x48]
  ddab3a:	48 8d 0d 87 fe a4 00 	lea    rcx,[rip+0xa4fe87]        # 182a9c8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x6ff8>
  ddab41:	4c 8d a4 24 30 02 00 	lea    r12,[rsp+0x230]
  ddab48:	00 
  ddab49:	49 89 0c 24          	mov    QWORD PTR [r12],rcx
  ddab4d:	48 83 a4 24 20 02 00 	and    QWORD PTR [rsp+0x220],0x0
  ddab54:	00 00 
  ddab56:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
  ddab5b:	4d 89 64 24 20       	mov    QWORD PTR [r12+0x20],r12
  ddab60:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
  ddab65:	48 89 84 24 e0 01 00 	mov    QWORD PTR [rsp+0x1e0],rax
  ddab6c:	00 
  ddab6d:	48 8d 05 f0 18 ca ff 	lea    rax,[rip+0xffffffffffca18f0]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
  ddab74:	48 89 84 24 f0 01 00 	mov    QWORD PTR [rsp+0x1f0],rax

## rank 3: score=52 FDE=0xc6c08a..0xc6e081 features=stride8,begin-end,+10,+18,+20,sret=22
### +0x28 call 0xc6c0f4
  c6c08b:	41 57                	push   r15
  c6c08d:	41 56                	push   r14
  c6c08f:	41 55                	push   r13
  c6c091:	41 54                	push   r12
  c6c093:	53                   	push   rbx
  c6c094:	48 81 ec e8 04 00 00 	sub    rsp,0x4e8
  c6c09b:	48 89 d3             	mov    rbx,rdx
  c6c09e:	49 89 fe             	mov    r14,rdi
  c6c0a1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  c6c0a8:	00 00 
  c6c0aa:	48 89 84 24 e0 04 00 	mov    QWORD PTR [rsp+0x4e0],rax
  c6c0b1:	00 
  c6c0b2:	48 8b 7a 38          	mov    rdi,QWORD PTR [rdx+0x38]
  c6c0b6:	48 8b 82 80 00 00 00 	mov    rax,QWORD PTR [rdx+0x80]
  c6c0bd:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
  c6c0c2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  c6c0c5:	ff 50 10             	call   QWORD PTR [rax+0x10]
  c6c0c8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  c6c0cb:	48 89 c7             	mov    rdi,rax
  c6c0ce:	ff 51 28             	call   QWORD PTR [rcx+0x28]
  c6c0d1:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  c6c0d6:	48 8b 6b 20          	mov    rbp,QWORD PTR [rbx+0x20]
  c6c0da:	4c 8b 63 60          	mov    r12,QWORD PTR [rbx+0x60]
  c6c0de:	4c 8b ab 90 00 00 00 	mov    r13,QWORD PTR [rbx+0x90]
  c6c0e5:	48 8b 73 58          	mov    rsi,QWORD PTR [rbx+0x58]
  c6c0e9:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  c6c0ec:	48 8d bc 24 08 01 00 	lea    rdi,[rsp+0x108]
  c6c0f3:	00 
  c6c0f4:	ff 50 28             	call   QWORD PTR [rax+0x28]
  c6c0f7:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
  c6c0fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  c6c0fe:	ff 50 10             	call   QWORD PTR [rax+0x10]
  c6c101:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
  c6c106:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
  c6c10a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  c6c10d:	ff 50 18             	call   QWORD PTR [rax+0x18]
  c6c110:	49 89 c7             	mov    r15,rax
  c6c113:	48 89 6c 24 40       	mov    QWORD PTR [rsp+0x40],rbp
  c6c118:	4c 89 ac 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],r13
  c6c11f:	00 
  c6c120:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
  c6c123:	48 83 c6 18          	add    rsi,0x18
  c6c127:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
  c6c12e:	00 
  c6c12f:	e8 0c 1e b8 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  c6c134:	4c 89 b4 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],r14
  c6c13b:	00 
  c6c13c:	4c 8b 6b 30          	mov    r13,QWORD PTR [rbx+0x30]
  c6c140:	6a 28                	push   0x28
  c6c142:	5f                   	pop    rdi
  c6c143:	e8 b8 1d b8 00       	call   17edf00 <_Znwm@plt>
  c6c148:	48 89 c5             	mov    rbp,rax
  c6c14b:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
  c6c14f:	48 8d 05 f2 e7 ba 00 	lea    rax,[rip+0xbae7f2]        # 181a948 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x10608>
  c6c156:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
  c6c15a:	48 8d 45 10          	lea    rax,[rbp+0x10]
  c6c15e:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
  c6c163:	48 8d 45 18          	lea    rax,[rbp+0x18]
  c6c167:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
  c6c16e:	00 
  c6c16f:	48 89 e8             	mov    rax,rbp
  c6c172:	48 83 c0 20          	add    rax,0x20
  c6c176:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
### +0x28 call 0xc6c0ce
  c6c08a:	55                   	push   rbp
  c6c08b:	41 57                	push   r15
  c6c08d:	41 56                	push   r14
  c6c08f:	41 55                	push   r13
  c6c091:	41 54                	push   r12
  c6c093:	53                   	push   rbx
  c6c094:	48 81 ec e8 04 00 00 	sub    rsp,0x4e8
  c6c09b:	48 89 d3             	mov    rbx,rdx
  c6c09e:	49 89 fe             	mov    r14,rdi
  c6c0a1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  c6c0a8:	00 00 
  c6c0aa:	48 89 84 24 e0 04 00 	mov    QWORD PTR [rsp+0x4e0],rax
  c6c0b1:	00 
  c6c0b2:	48 8b 7a 38          	mov    rdi,QWORD PTR [rdx+0x38]
  c6c0b6:	48 8b 82 80 00 00 00 	mov    rax,QWORD PTR [rdx+0x80]
  c6c0bd:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
  c6c0c2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  c6c0c5:	ff 50 10             	call   QWORD PTR [rax+0x10]
  c6c0c8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  c6c0cb:	48 89 c7             	mov    rdi,rax
  c6c0ce:	ff 51 28             	call   QWORD PTR [rcx+0x28]
  c6c0d1:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  c6c0d6:	48 8b 6b 20          	mov    rbp,QWORD PTR [rbx+0x20]
  c6c0da:	4c 8b 63 60          	mov    r12,QWORD PTR [rbx+0x60]
  c6c0de:	4c 8b ab 90 00 00 00 	mov    r13,QWORD PTR [rbx+0x90]
  c6c0e5:	48 8b 73 58          	mov    rsi,QWORD PTR [rbx+0x58]
  c6c0e9:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  c6c0ec:	48 8d bc 24 08 01 00 	lea    rdi,[rsp+0x108]
  c6c0f3:	00 
  c6c0f4:	ff 50 28             	call   QWORD PTR [rax+0x28]
  c6c0f7:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
  c6c0fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  c6c0fe:	ff 50 10             	call   QWORD PTR [rax+0x10]
  c6c101:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
  c6c106:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
  c6c10a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  c6c10d:	ff 50 18             	call   QWORD PTR [rax+0x18]
  c6c110:	49 89 c7             	mov    r15,rax
  c6c113:	48 89 6c 24 40       	mov    QWORD PTR [rsp+0x40],rbp
  c6c118:	4c 89 ac 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],r13
  c6c11f:	00 
  c6c120:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
  c6c123:	48 83 c6 18          	add    rsi,0x18
  c6c127:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
  c6c12e:	00 
  c6c12f:	e8 0c 1e b8 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  c6c134:	4c 89 b4 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],r14
  c6c13b:	00 
  c6c13c:	4c 8b 6b 30          	mov    r13,QWORD PTR [rbx+0x30]
  c6c140:	6a 28                	push   0x28
  c6c142:	5f                   	pop    rdi
  c6c143:	e8 b8 1d b8 00       	call   17edf00 <_Znwm@plt>
  c6c148:	48 89 c5             	mov    rbp,rax
  c6c14b:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
  c6c14f:	48 8d 05 f2 e7 ba 00 	lea    rax,[rip+0xbae7f2]        # 181a948 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x10608>
### +0x28 call 0xc6c8ea
  c6c878:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
  c6c87c:	4c 89 b4 24 20 01 00 	mov    QWORD PTR [rsp+0x120],r14
  c6c883:	00 
  c6c884:	0f 57 c0             	xorps  xmm0,xmm0
  c6c887:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
  c6c88b:	eb 08                	jmp    c6c895 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b9835>
  c6c88d:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
  c6c894:	00 
  c6c895:	48 8d 05 3c fc b9 00 	lea    rax,[rip+0xb9fc3c]        # 180c4d8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2198>
  c6c89c:	48 8d 8c 24 80 03 00 	lea    rcx,[rsp+0x380]
  c6c8a3:	00 
  c6c8a4:	48 89 01             	mov    QWORD PTR [rcx],rax
  c6c8a7:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
  c6c8ab:	48 8d 05 9e e6 ba 00 	lea    rax,[rip+0xbae69e]        # 181af50 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x10c10>
  c6c8b2:	48 8d 8c 24 50 03 00 	lea    rcx,[rsp+0x350]
  c6c8b9:	00 
  c6c8ba:	48 89 01             	mov    QWORD PTR [rcx],rax
  c6c8bd:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
  c6c8c1:	4d 85 ed             	test   r13,r13
  c6c8c4:	48 8d 35 b1 56 7e ff 	lea    rsi,[rip+0xffffffffff7e56b1]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
  c6c8cb:	49 0f 45 f5          	cmovne rsi,r13
  c6c8cf:	48 8d bc 24 f8 01 00 	lea    rdi,[rsp+0x1f8]
  c6c8d6:	00 
  c6c8d7:	e8 a2 d1 e0 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  c6c8dc:	49 8b 07             	mov    rax,QWORD PTR [r15]
  c6c8df:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
  c6c8e6:	00 
  c6c8e7:	4c 89 fe             	mov    rsi,r15
  c6c8ea:	ff 50 28             	call   QWORD PTR [rax+0x28]
  c6c8ed:	48 8d 9c 24 90 02 00 	lea    rbx,[rsp+0x290]
  c6c8f4:	00 
  c6c8f5:	48 8d b4 24 f8 01 00 	lea    rsi,[rsp+0x1f8]
  c6c8fc:	00 
  c6c8fd:	48 89 df             	mov    rdi,rbx
  c6c900:	e8 e9 2d e3 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
  c6c905:	89 c5                	mov    ebp,eax
  c6c907:	48 89 df             	mov    rdi,rbx
  c6c90a:	e8 81 15 b8 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  c6c90f:	40 84 ed             	test   bpl,bpl
  c6c912:	74 11                	je     c6c925 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b98c5>
  c6c914:	45 31 ed             	xor    r13d,r13d
  c6c917:	48 8b 2c 24          	mov    rbp,QWORD PTR [rsp]
  c6c91b:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
  c6c920:	e9 05 09 00 00       	jmp    c6d22a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ba1ca>
  c6c925:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
  c6c92c:	00 
  c6c92d:	48 8d b4 24 e0 01 00 	lea    rsi,[rsp+0x1e0]
  c6c934:	00 
  c6c935:	e8 2c 45 00 00       	call   c70e66 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bde06>
  c6c93a:	48 8d bc 24 c8 03 00 	lea    rdi,[rsp+0x3c8]
  c6c941:	00 
  c6c942:	48 8d b4 24 c8 01 00 	lea    rsi,[rsp+0x1c8]
  c6c949:	00 
  c6c94a:	e8 17 45 00 00       	call   c70e66 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bde06>
  c6c94f:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
  c6c956:	00 
  c6c957:	48 8d b4 24 b0 01 00 	lea    rsi,[rsp+0x1b0]
  c6c95e:	00 
  c6c95f:	e8 02 45 00 00       	call   c70e66 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bde06>
  c6c964:	bf 80 03 00 00       	mov    edi,0x380
  c6c969:	e8 92 15 b8 00       	call   17edf00 <_Znwm@plt>
  c6c96e:	49 89 c5             	mov    r13,rax
  c6c971:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
### +0x28 call 0xc6d638
  c6d5d6:	6a 10                	push   0x10
  c6d5d8:	41 5f                	pop    r15
  c6d5da:	31 c9                	xor    ecx,ecx
  c6d5dc:	45 31 f6             	xor    r14d,r14d
  c6d5df:	48 89 4c 24 40       	mov    QWORD PTR [rsp+0x40],rcx
  c6d5e4:	44 89 74 24 30       	mov    DWORD PTR [rsp+0x30],r14d
  c6d5e9:	44 89 f0             	mov    eax,r14d
  c6d5ec:	0f c8                	bswap  eax
  c6d5ee:	89 84 24 50 04 00 00 	mov    DWORD PTR [rsp+0x450],eax
  c6d5f5:	48 8d bc 24 50 04 00 	lea    rdi,[rsp+0x450]
  c6d5fc:	00 
  c6d5fd:	6a 04                	push   0x4
  c6d5ff:	5e                   	pop    rsi
  c6d600:	48 8d 94 24 68 04 00 	lea    rdx,[rsp+0x468]
  c6d607:	00 
  c6d608:	e8 3f 8c b3 00       	call   17a624c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a3b8>
  c6d60d:	48 8d ac 24 d0 04 00 	lea    rbp,[rsp+0x4d0]
  c6d614:	00 
  c6d615:	48 8d 9c 24 e0 04 00 	lea    rbx,[rsp+0x4e0]
  c6d61c:	00 
  c6d61d:	45 31 f6             	xor    r14d,r14d
  c6d620:	4c 8d 63 f0          	lea    r12,[rbx-0x10]
  c6d624:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
  c6d629:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  c6d62c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  c6d62f:	4c 89 e6             	mov    rsi,r12
  c6d632:	4c 89 e2             	mov    rdx,r12
  c6d635:	44 89 f9             	mov    ecx,r15d
  c6d638:	ff 50 28             	call   QWORD PTR [rax+0x28]
  c6d63b:	48 83 c3 e0          	add    rbx,0xffffffffffffffe0
  c6d63f:	49 83 fe 03          	cmp    r14,0x3
  c6d643:	48 8d 84 24 68 04 00 	lea    rax,[rsp+0x468]
  c6d64a:	00 
  c6d64b:	48 0f 44 d8          	cmove  rbx,rax
  c6d64f:	31 c0                	xor    eax,eax
  c6d651:	8a 0c 03             	mov    cl,BYTE PTR [rbx+rax*1]
  c6d654:	30 4c 05 00          	xor    BYTE PTR [rbp+rax*1+0x0],cl
  c6d658:	48 ff c0             	inc    rax
  c6d65b:	48 83 f8 10          	cmp    rax,0x10
  c6d65f:	75 f0                	jne    c6d651 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ba5f1>
  c6d661:	49 ff c6             	inc    r14
  c6d664:	48 83 c5 f0          	add    rbp,0xfffffffffffffff0
  c6d668:	4c 89 e3             	mov    rbx,r12
  c6d66b:	49 83 fe 04          	cmp    r14,0x4
  c6d66f:	75 af                	jne    c6d620 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ba5c0>
  c6d671:	0f b6 9c 24 bc 04 00 	movzx  ebx,BYTE PTR [rsp+0x4bc]
  c6d678:	00 
  c6d679:	48 8d bc 24 a4 04 00 	lea    rdi,[rsp+0x4a4]
  c6d680:	00 
  c6d681:	6a 3c                	push   0x3c
  c6d683:	5e                   	pop    rsi
  c6d684:	6a 01                	push   0x1
  c6d686:	5a                   	pop    rdx
  c6d687:	e8 4e c2 00 00       	call   c798da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c687a>
  c6d68c:	8b 8c 24 a0 04 00 00 	mov    ecx,DWORD PTR [rsp+0x4a0]
  c6d693:	0f c9                	bswap  ecx
  c6d695:	39 c8                	cmp    eax,ecx
  c6d697:	0f 85 d0 00 00 00    	jne    c6d76d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ba70d>
  c6d69d:	81 bc 24 a4 04 00 00 	cmp    DWORD PTR [rsp+0x4a4],0xefbeadde
  c6d6a4:	de ad be ef 
  c6d6a8:	0f 85 21 01 00 00    	jne    c6d7cf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ba76f>
  c6d6ae:	4c 8d 35 8b e9 75 ff 	lea    r14,[rip+0xffffffffff75e98b]        # 3cc040 <_ZTSN5boost9exceptionE@@Base+0x2ca22>
  c6d6b5:	4c 89 f7             	mov    rdi,r14

## rank 4: score=52 FDE=0xd4c6e4..0xd50266 features=stride8,begin-end,+10,+18,+20,sret=22
### +0x28 call 0xd4da44
  d4d9dc:	48 83 c1 30          	add    rcx,0x30
  d4d9e0:	4d 89 f7             	mov    r15,r14
  d4d9e3:	48 83 21 00          	and    QWORD PTR [rcx],0x0
  d4d9e7:	eb 1c                	jmp    d4da05 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa8b>
  d4d9e9:	4d 89 f7             	mov    r15,r14
  d4d9ec:	48 89 de             	mov    rsi,rbx
  d4d9ef:	48 83 c6 10          	add    rsi,0x10
  d4d9f3:	48 89 73 30          	mov    QWORD PTR [rbx+0x30],rsi
  d4d9f7:	48 8d bc 24 40 03 00 	lea    rdi,[rsp+0x340]
  d4d9fe:	00 
  d4d9ff:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d4da02:	ff 50 18             	call   QWORD PTR [rax+0x18]
  d4da05:	4d 89 ee             	mov    r14,r13
  d4da08:	48 8d 84 24 70 03 00 	lea    rax,[rsp+0x370]
  d4da0f:	00 
  d4da10:	48 8b 48 20          	mov    rcx,QWORD PTR [rax+0x20]
  d4da14:	48 89 4b 60          	mov    QWORD PTR [rbx+0x60],rcx
  d4da18:	66 0f 6f 00          	movdqa xmm0,XMMWORD PTR [rax]
  d4da1c:	0f 28 48 10          	movaps xmm1,XMMWORD PTR [rax+0x10]
  d4da20:	0f 29 4b 50          	movaps XMMWORD PTR [rbx+0x50],xmm1
  d4da24:	66 0f 7f 43 40       	movdqa XMMWORD PTR [rbx+0x40],xmm0
  d4da29:	48 89 9c 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rbx
  d4da30:	00 
  d4da31:	48 8b b4 24 50 06 00 	mov    rsi,QWORD PTR [rsp+0x650]
  d4da38:	00 
  d4da39:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  d4da3c:	48 8d bc 24 68 01 00 	lea    rdi,[rsp+0x168]
  d4da43:	00 
  d4da44:	ff 50 28             	call   QWORD PTR [rax+0x28]
  d4da47:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  d4da4b:	4c 89 e7             	mov    rdi,r12
  d4da4e:	ff 50 50             	call   QWORD PTR [rax+0x50]
  d4da51:	49 89 c5             	mov    r13,rax
  d4da54:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  d4da58:	48 8d 9c 24 00 03 00 	lea    rbx,[rsp+0x300]
  d4da5f:	00 
  d4da60:	48 89 df             	mov    rdi,rbx
  d4da63:	4c 89 e6             	mov    rsi,r12
  d4da66:	ff 50 60             	call   QWORD PTR [rax+0x60]
  d4da69:	48 8b 84 24 80 06 00 	mov    rax,QWORD PTR [rsp+0x680]
  d4da70:	00 
  d4da71:	48 8b 00             	mov    rax,QWORD PTR [rax]
  d4da74:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  d4da77:	e8 48 32 00 00       	call   d50cc4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1dd4a>
  d4da7c:	0f b6 4c 24 33       	movzx  ecx,BYTE PTR [rsp+0x33]
  d4da81:	0f b6 54 24 32       	movzx  edx,BYTE PTR [rsp+0x32]
  d4da86:	0f b6 74 24 31       	movzx  esi,BYTE PTR [rsp+0x31]
  d4da8b:	0f b6 7c 24 30       	movzx  edi,BYTE PTR [rsp+0x30]
  d4da90:	44 0f b6 44 24 2f    	movzx  r8d,BYTE PTR [rsp+0x2f]
  d4da96:	44 0f b6 4c 24 2a    	movzx  r9d,BYTE PTR [rsp+0x2a]
  d4da9c:	44 0f b6 54 24 27    	movzx  r10d,BYTE PTR [rsp+0x27]
  d4daa2:	66 0f 6e c1          	movd   xmm0,ecx
  d4daa6:	66 0f 3a 20 c2 01    	pinsrb xmm0,edx,0x1
  d4daac:	66 0f 3a 20 c6 02    	pinsrb xmm0,esi,0x2
  d4dab2:	66 0f 3a 20 c7 03    	pinsrb xmm0,edi,0x3
  d4dab8:	66 41 0f 3a 20 c0 04 	pinsrb xmm0,r8d,0x4
  d4dabf:	66 41 0f 3a 20 c1 05 	pinsrb xmm0,r9d,0x5
  d4dac6:	66 41 0f 3a 20 c2 06 	pinsrb xmm0,r10d,0x6
  d4dacd:	0f b6 4c 24 25       	movzx  ecx,BYTE PTR [rsp+0x25]
  d4dad2:	66 0f 3a 20 c1 07    	pinsrb xmm0,ecx,0x7
  d4dad8:	0f b6 4c 24 18       	movzx  ecx,BYTE PTR [rsp+0x18]
  d4dadd:	c1 e1 08             	shl    ecx,0x8
  d4dae0:	0f b6 7c 24 50       	movzx  edi,BYTE PTR [rsp+0x50]
### +0x28 call 0xd4cc8d
  d4cc22:	45 31 c9             	xor    r9d,r9d
  d4cc25:	e8 34 a9 89 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  d4cc2a:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  d4cc2e:	48 8d 35 db 34 68 ff 	lea    rsi,[rip+0xffffffffff6834db]        # 3d0110 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0xf64>
  d4cc35:	48 8d 0d e4 34 68 ff 	lea    rcx,[rip+0xffffffffff6834e4]        # 3d0120 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0xf74>
  d4cc3c:	4c 89 fa             	mov    rdx,r15
  d4cc3f:	6a 21                	push   0x21
  d4cc41:	41 58                	pop    r8
  d4cc43:	41 b9 88 13 00 00    	mov    r9d,0x1388
  d4cc49:	bb 60 ea 00 00       	mov    ebx,0xea60
  d4cc4e:	53                   	push   rbx
  d4cc4f:	6a 00                	push   0x0
  d4cc51:	e8 9c a9 89 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  d4cc56:	48 83 c4 10          	add    rsp,0x10
  d4cc5a:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  d4cc5e:	48 8d 35 7b 34 68 ff 	lea    rsi,[rip+0xffffffffff68347b]        # 3d00e0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0xf34>
  d4cc65:	48 8d 0d 84 34 68 ff 	lea    rcx,[rip+0xffffffffff683484]        # 3d00f0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0xf44>
  d4cc6c:	4c 89 fa             	mov    rdx,r15
  d4cc6f:	4d 89 e8             	mov    r8,r13
  d4cc72:	41 b9 88 13 00 00    	mov    r9d,0x1388
  d4cc78:	53                   	push   rbx
  d4cc79:	6a 00                	push   0x0
  d4cc7b:	e8 72 a9 89 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  d4cc80:	58                   	pop    rax
  d4cc81:	59                   	pop    rcx
  d4cc82:	48 8b bc 24 48 06 00 	mov    rdi,QWORD PTR [rsp+0x648]
  d4cc89:	00 
  d4cc8a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d4cc8d:	ff 50 28             	call   QWORD PTR [rax+0x28]
  d4cc90:	49 89 c6             	mov    r14,rax
  d4cc93:	48 8b 00             	mov    rax,QWORD PTR [rax]
  d4cc96:	4c 89 f7             	mov    rdi,r14
  d4cc99:	ff 50 78             	call   QWORD PTR [rax+0x78]
  d4cc9c:	4c 8b bc 24 90 06 00 	mov    r15,QWORD PTR [rsp+0x690]
  d4cca3:	00 
  d4cca4:	48 89 84 24 10 04 00 	mov    QWORD PTR [rsp+0x410],rax
  d4ccab:	00 
  d4ccac:	48 89 94 24 18 04 00 	mov    QWORD PTR [rsp+0x418],rdx
  d4ccb3:	00 
  d4ccb4:	48 8b bc 24 30 06 00 	mov    rdi,QWORD PTR [rsp+0x630]
  d4ccbb:	00 
  d4ccbc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d4ccbf:	ff 50 40             	call   QWORD PTR [rax+0x40]
  d4ccc2:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
  d4ccc7:	4c 8b a4 24 c8 06 00 	mov    r12,QWORD PTR [rsp+0x6c8]
  d4ccce:	00 
  d4cccf:	41 80 7c 24 30 00    	cmp    BYTE PTR [r12+0x30],0x0
  d4ccd5:	4c 89 74 24 70       	mov    QWORD PTR [rsp+0x70],r14
  d4ccda:	74 23                	je     d4ccff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d85>
  d4ccdc:	6a 30                	push   0x30
  d4ccde:	5f                   	pop    rdi
  d4ccdf:	e8 1c 12 aa 00       	call   17edf00 <_Znwm@plt>
  d4cce4:	48 89 c3             	mov    rbx,rax
  d4cce7:	48 89 c7             	mov    rdi,rax
  d4ccea:	4c 89 e6             	mov    rsi,r12
  d4cced:	e8 8e a9 d5 ff       	call   aa7680 <JNI_OnUnload@@Base+0x2ef4d>
  d4ccf2:	4c 8d b4 24 20 04 00 	lea    r14,[rsp+0x420]
  d4ccf9:	00 
  d4ccfa:	e9 df 01 00 00       	jmp    d4cede <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f64>
  d4ccff:	6a 30                	push   0x30
  d4cd01:	5f                   	pop    rdi
  d4cd02:	e8 f9 11 aa 00       	call   17edf00 <_Znwm@plt>
  d4cd07:	48 89 c3             	mov    rbx,rax
### +0x28 call 0xd4d788
  d4d71c:	88 44 24 26          	mov    BYTE PTR [rsp+0x26],al
  d4d720:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  d4d724:	48 8d 35 ab 25 68 ff 	lea    rsi,[rip+0xffffffffff6825ab]        # 3cfcd6 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0xb2a>
  d4d72b:	48 8d 0d be 25 68 ff 	lea    rcx,[rip+0xffffffffff6825be]        # 3cfcf0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0xb44>
  d4d732:	6a 25                	push   0x25
  d4d734:	41 59                	pop    r9
  d4d736:	48 89 da             	mov    rdx,rbx
  d4d739:	6a 14                	push   0x14
  d4d73b:	41 58                	pop    r8
  d4d73d:	e8 e8 9c 89 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  d4d742:	89 84 24 e4 00 00 00 	mov    DWORD PTR [rsp+0xe4],eax
  d4d749:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  d4d74d:	48 8d 35 b1 25 68 ff 	lea    rsi,[rip+0xffffffffff6825b1]        # 3cfd05 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0xb59>
  d4d754:	48 8d 0d c5 25 68 ff 	lea    rcx,[rip+0xffffffffff6825c5]        # 3cfd20 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0xb74>
  d4d75b:	48 89 da             	mov    rdx,rbx
  d4d75e:	6a 17                	push   0x17
  d4d760:	41 58                	pop    r8
  d4d762:	45 31 c9             	xor    r9d,r9d
  d4d765:	e8 20 9c 89 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  d4d76a:	89 c3                	mov    ebx,eax
  d4d76c:	48 8b bc 24 40 06 00 	mov    rdi,QWORD PTR [rsp+0x640]
  d4d773:	00 
  d4d774:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d4d777:	ff 50 30             	call   QWORD PTR [rax+0x30]
  d4d77a:	49 89 c5             	mov    r13,rax
  d4d77d:	48 8b bc 24 38 06 00 	mov    rdi,QWORD PTR [rsp+0x638]
  d4d784:	00 
  d4d785:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d4d788:	ff 50 28             	call   QWORD PTR [rax+0x28]
  d4d78b:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
  d4d790:	48 8b ac 24 98 00 00 	mov    rbp,QWORD PTR [rsp+0x98]
  d4d797:	00 
  d4d798:	49 89 c6             	mov    r14,rax
  d4d79b:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  d4d79f:	4c 89 e7             	mov    rdi,r12
  d4d7a2:	ff 50 30             	call   QWORD PTR [rax+0x30]
  d4d7a5:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  d4d7a8:	48 89 c7             	mov    rdi,rax
  d4d7ab:	ff 51 50             	call   QWORD PTR [rcx+0x50]
  d4d7ae:	88 84 24 86 01 00 00 	mov    BYTE PTR [rsp+0x186],al
  d4d7b5:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  d4d7b9:	4c 89 e7             	mov    rdi,r12
  d4d7bc:	ff 50 30             	call   QWORD PTR [rax+0x30]
  d4d7bf:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  d4d7c2:	48 89 c7             	mov    rdi,rax
  d4d7c5:	ff 51 58             	call   QWORD PTR [rcx+0x58]
  d4d7c8:	88 5c 24 24          	mov    BYTE PTR [rsp+0x24],bl
  d4d7cc:	88 84 24 87 01 00 00 	mov    BYTE PTR [rsp+0x187],al
  d4d7d3:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
  d4d7da:	00 
  d4d7db:	48 8b b4 24 c0 06 00 	mov    rsi,QWORD PTR [rsp+0x6c0]
  d4d7e2:	00 
  d4d7e3:	e8 58 07 aa 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  d4d7e8:	48 8b 84 24 d0 05 00 	mov    rax,QWORD PTR [rsp+0x5d0]
  d4d7ef:	00 
  d4d7f0:	48 89 84 24 90 04 00 	mov    QWORD PTR [rsp+0x490],rax
  d4d7f7:	00 
  d4d7f8:	66 0f 6f 84 24 c0 05 	movdqa xmm0,XMMWORD PTR [rsp+0x5c0]
  d4d7ff:	00 00 
  d4d801:	66 0f 7f 84 24 80 04 	movdqa XMMWORD PTR [rsp+0x480],xmm0
  d4d808:	00 00 
  d4d80a:	66 0f ef c0          	pxor   xmm0,xmm0
  d4d80e:	66 0f 7f 84 24 c0 05 	movdqa XMMWORD PTR [rsp+0x5c0],xmm0
### +0x28 call 0xd4d856
  d4d7e3:	e8 58 07 aa 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  d4d7e8:	48 8b 84 24 d0 05 00 	mov    rax,QWORD PTR [rsp+0x5d0]
  d4d7ef:	00 
  d4d7f0:	48 89 84 24 90 04 00 	mov    QWORD PTR [rsp+0x490],rax
  d4d7f7:	00 
  d4d7f8:	66 0f 6f 84 24 c0 05 	movdqa xmm0,XMMWORD PTR [rsp+0x5c0]
  d4d7ff:	00 00 
  d4d801:	66 0f 7f 84 24 80 04 	movdqa XMMWORD PTR [rsp+0x480],xmm0
  d4d808:	00 00 
  d4d80a:	66 0f ef c0          	pxor   xmm0,xmm0
  d4d80e:	66 0f 7f 84 24 c0 05 	movdqa XMMWORD PTR [rsp+0x5c0],xmm0
  d4d815:	00 00 
  d4d817:	48 83 a4 24 d0 05 00 	and    QWORD PTR [rsp+0x5d0],0x0
  d4d81e:	00 00 
  d4d820:	48 8d 9c 24 80 05 00 	lea    rbx,[rsp+0x580]
  d4d827:	00 
  d4d828:	48 8d b4 24 10 04 00 	lea    rsi,[rsp+0x410]
  d4d82f:	00 
  d4d830:	48 89 df             	mov    rdi,rbx
  d4d833:	e8 e8 6a e4 ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
  d4d838:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  d4d83f:	00 
  d4d840:	48 89 de             	mov    rsi,rbx
  d4d843:	e8 ce 17 f2 ff       	call   c6f016 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bbfb6>
  d4d848:	48 8b 9c 24 88 00 00 	mov    rbx,QWORD PTR [rsp+0x88]
  d4d84f:	00 
  d4d850:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  d4d853:	48 89 df             	mov    rdi,rbx
  d4d856:	ff 50 28             	call   QWORD PTR [rax+0x28]
  d4d859:	48 89 84 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rax
  d4d860:	00 
  d4d861:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  d4d864:	48 89 df             	mov    rdi,rbx
  d4d867:	ff 50 38             	call   QWORD PTR [rax+0x38]
  d4d86a:	48 89 c3             	mov    rbx,rax
  d4d86d:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
  d4d871:	48 89 ef             	mov    rdi,rbp
  d4d874:	ff 50 28             	call   QWORD PTR [rax+0x28]
  d4d877:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
  d4d87e:	00 
  d4d87f:	48 89 9c 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rbx
  d4d886:	00 
  d4d887:	4c 8d bc 24 d0 03 00 	lea    r15,[rsp+0x3d0]
  d4d88e:	00 
  d4d88f:	4c 89 ff             	mov    rdi,r15
  d4d892:	48 8b b4 24 e0 06 00 	mov    rsi,QWORD PTR [rsp+0x6e0]
  d4d899:	00 
  d4d89a:	e8 f1 c9 d2 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  d4d89f:	48 8b 84 24 90 06 00 	mov    rax,QWORD PTR [rsp+0x690]
  d4d8a6:	00 
  d4d8a7:	48 89 84 24 00 04 00 	mov    QWORD PTR [rsp+0x400],rax
  d4d8ae:	00 
  d4d8af:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
  d4d8b4:	48 89 84 24 08 04 00 	mov    QWORD PTR [rsp+0x408],rax
  d4d8bb:	00 
  d4d8bc:	48 83 a4 24 40 04 00 	and    QWORD PTR [rsp+0x440],0x0
  d4d8c3:	00 00 
  d4d8c5:	6a 50                	push   0x50
  d4d8c7:	5f                   	pop    rdi
  d4d8c8:	e8 33 06 aa 00       	call   17edf00 <_Znwm@plt>
  d4d8cd:	48 89 c3             	mov    rbx,rax
  d4d8d0:	48 8d 05 61 7b ad 00 	lea    rax,[rip+0xad7b61]        # 1825438 <_ZTIN4asio2ip16bad_address_castE@@Base+0x1a68>
  d4d8d7:	48 89 03             	mov    QWORD PTR [rbx],rax

## rank 5: score=52 FDE=0xdeb80c..0xdf1297 features=stride8,begin-end,+10,+18,+20,sret=22
### +0x28 call 0xdebb28
  debaa7:	48 89 bc 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rdi
  debaae:	00 
  debaaf:	e8 42 df 9e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  debab4:	49 8d bf 28 02 00 00 	lea    rdi,[r15+0x228]
  debabb:	48 89 bc 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rdi
  debac2:	00 
  debac3:	e8 2e df 9e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  debac8:	49 8d bf 38 02 00 00 	lea    rdi,[r15+0x238]
  debacf:	48 89 bc 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rdi
  debad6:	00 
  debad7:	e8 1a df 9e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  debadc:	49 89 9f 48 02 00 00 	mov    QWORD PTR [r15+0x248],rbx
  debae3:	41 88 af 50 02 00 00 	mov    BYTE PTR [r15+0x250],bpl
  debaea:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
  debaef:	48 89 df             	mov    rdi,rbx
  debaf2:	e8 3f fd c8 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  debaf7:	48 89 c7             	mov    rdi,rax
  debafa:	48 89 d6             	mov    rsi,rdx
  debafd:	e8 72 f5 9e 00       	call   17db074 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6e95>
  debb02:	48 89 df             	mov    rdi,rbx
  debb05:	48 89 c6             	mov    rsi,rax
  debb08:	e8 f3 d1 cb ff       	call   aa8d00 <JNI_OnUnload@@Base+0x305cd>
  debb0d:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
  debb12:	41 8b 9e 48 01 00 00 	mov    ebx,DWORD PTR [r14+0x148]
  debb19:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
  debb1d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  debb20:	48 8d bc 24 10 13 00 	lea    rdi,[rsp+0x1310]
  debb27:	00 
  debb28:	ff 50 28             	call   QWORD PTR [rax+0x28]
  debb2b:	4d 8d a6 28 01 00 00 	lea    r12,[r14+0x128]
  debb32:	48 8d bc 24 50 13 00 	lea    rdi,[rsp+0x1350]
  debb39:	00 
  debb3a:	48 8d b4 24 10 13 00 	lea    rsi,[rsp+0x1310]
  debb41:	00 
  debb42:	4c 89 e2             	mov    rdx,r12
  debb45:	e8 dc a7 d0 ff       	call   af6326 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x432c6>
  debb4a:	4d 8d 7e 18          	lea    r15,[r14+0x18]
  debb4e:	48 8b 84 24 60 13 00 	mov    rax,QWORD PTR [rsp+0x1360]
  debb55:	00 
  debb56:	48 89 84 24 f0 07 00 	mov    QWORD PTR [rsp+0x7f0],rax
  debb5d:	00 
  debb5e:	66 0f 6f 84 24 50 13 	movdqa xmm0,XMMWORD PTR [rsp+0x1350]
  debb65:	00 00 
  debb67:	66 0f 7f 84 24 e0 07 	movdqa XMMWORD PTR [rsp+0x7e0],xmm0
  debb6e:	00 00 
  debb70:	48 83 a4 24 60 13 00 	and    QWORD PTR [rsp+0x1360],0x0
  debb77:	00 00 
  debb79:	66 0f ef c0          	pxor   xmm0,xmm0
  debb7d:	66 0f 7f 84 24 50 13 	movdqa XMMWORD PTR [rsp+0x1350],xmm0
  debb84:	00 00 
  debb86:	c6 84 24 f8 07 00 00 	mov    BYTE PTR [rsp+0x7f8],0x1
  debb8d:	01 
  debb8e:	83 fb 01             	cmp    ebx,0x1
  debb91:	4c 89 a4 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r12
  debb98:	00 
  debb99:	74 3e                	je     debbd9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb8c5f>
  debb9b:	85 db                	test   ebx,ebx
  debb9d:	75 4c                	jne    debbeb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb8c71>
  debb9f:	48 8d bc 24 d0 11 00 	lea    rdi,[rsp+0x11d0]
  debba6:	00 
  debba7:	48 8d 94 24 e0 07 00 	lea    rdx,[rsp+0x7e0]
  debbae:	00 
  debbaf:	4c 89 fe             	mov    rsi,r15
### +0x28 call 0xdec504
  dec494:	e8 ed 1f cb ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  dec499:	48 8d bc 24 d0 11 00 	lea    rdi,[rsp+0x11d0]
  dec4a0:	00 
  dec4a1:	e8 c4 4f 00 00       	call   df146a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe4f0>
  dec4a6:	48 8d bc 24 a0 07 00 	lea    rdi,[rsp+0x7a0]
  dec4ad:	00 
  dec4ae:	e8 97 4f 00 00       	call   df144a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe4d0>
  dec4b3:	48 8d bc 24 50 13 00 	lea    rdi,[rsp+0x1350]
  dec4ba:	00 
  dec4bb:	e8 40 46 cb ff       	call   aa0b00 <JNI_OnUnload@@Base+0x283cd>
  dec4c0:	4c 89 33             	mov    QWORD PTR [rbx],r14
  dec4c3:	48 8d 35 c7 0b cb ff 	lea    rsi,[rip+0xffffffffffcb0bc7]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
  dec4ca:	48 8d 0d bf 4f 00 00 	lea    rcx,[rip+0x4fbf]        # df1490 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe516>
  dec4d1:	48 8d 9c 24 e0 07 00 	lea    rbx,[rsp+0x7e0]
  dec4d8:	00 
  dec4d9:	4c 8d bc 24 90 13 00 	lea    r15,[rsp+0x1390]
  dec4e0:	00 
  dec4e1:	6a 08                	push   0x8
  dec4e3:	41 59                	pop    r9
  dec4e5:	48 89 df             	mov    rdi,rbx
  dec4e8:	31 d2                	xor    edx,edx
  dec4ea:	4d 89 f8             	mov    r8,r15
  dec4ed:	e8 a2 e2 9e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  dec4f2:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
  dec4f6:	48 8d bc 24 d0 11 00 	lea    rdi,[rsp+0x11d0]
  dec4fd:	00 
  dec4fe:	48 89 ee             	mov    rsi,rbp
  dec501:	48 89 da             	mov    rdx,rbx
  dec504:	ff 50 28             	call   QWORD PTR [rax+0x28]
  dec507:	48 8d 9c 24 d0 11 00 	lea    rbx,[rsp+0x11d0]
  dec50e:	00 
  dec50f:	48 8b bc 24 98 01 00 	mov    rdi,QWORD PTR [rsp+0x198]
  dec516:	00 
  dec517:	48 89 de             	mov    rsi,rbx
  dec51a:	e8 d3 d6 9e 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
  dec51f:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  dec523:	e8 5e 1f cb ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  dec528:	48 8d bc 24 e0 07 00 	lea    rdi,[rsp+0x7e0]
  dec52f:	00 
  dec530:	e8 b3 e2 9e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  dec535:	48 8b 84 24 48 14 00 	mov    rax,QWORD PTR [rsp+0x1448]
  dec53c:	00 
  dec53d:	48 8b 30             	mov    rsi,QWORD PTR [rax]
  dec540:	48 8d bc 24 d0 11 00 	lea    rdi,[rsp+0x11d0]
  dec547:	00 
  dec548:	e8 59 d3 7f 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
  dec54d:	bf 08 05 00 00       	mov    edi,0x508
  dec552:	e8 a9 19 a0 00       	call   17edf00 <_Znwm@plt>
  dec557:	48 89 c3             	mov    rbx,rax
  dec55a:	48 8d bc 24 e0 07 00 	lea    rdi,[rsp+0x7e0]
  dec561:	00 
  dec562:	48 8b b4 24 50 14 00 	mov    rsi,QWORD PTR [rsp+0x1450]
  dec569:	00 
  dec56a:	e8 33 c7 ff ff       	call   de8ca2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5d28>
  dec56f:	48 8d 05 ca 12 a4 00 	lea    rax,[rip+0xa412ca]        # 182d840 <_ZTIN4asio2ip16bad_address_castE@@Base+0x9e70>
  dec576:	48 89 03             	mov    QWORD PTR [rbx],rax
  dec579:	4c 8b a4 24 30 14 00 	mov    r12,QWORD PTR [rsp+0x1430]
  dec580:	00 
  dec581:	4c 89 63 08          	mov    QWORD PTR [rbx+0x8],r12
  dec585:	66 0f 6f 84 24 d0 11 	movdqa xmm0,XMMWORD PTR [rsp+0x11d0]
  dec58c:	00 00 
  dec58e:	f3 0f 7f 43 10       	movdqu XMMWORD PTR [rbx+0x10],xmm0
  dec593:	66 0f ef c0          	pxor   xmm0,xmm0
### +0x28 call 0xded077
  ded000:	66 0f 6f 84 24 b0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xb0]
  ded007:	00 00 
  ded009:	f3 41 0f 7f 87 e0 00 	movdqu XMMWORD PTR [r15+0xe0],xmm0
  ded010:	00 00 
  ded012:	49 8d 87 f8 00 00 00 	lea    rax,[r15+0xf8]
  ded019:	66 0f ef c0          	pxor   xmm0,xmm0
  ded01d:	f3 41 0f 7f 87 f8 00 	movdqu XMMWORD PTR [r15+0xf8],xmm0
  ded024:	00 00 
  ded026:	49 89 87 f0 00 00 00 	mov    QWORD PTR [r15+0xf0],rax
  ded02d:	4d 8b 6f 20          	mov    r13,QWORD PTR [r15+0x20]
  ded031:	4c 8d 84 24 90 13 00 	lea    r8,[rsp+0x1390]
  ded038:	00 
  ded039:	4c 8b 64 24 40       	mov    r12,QWORD PTR [rsp+0x40]
  ded03e:	4d 89 20             	mov    QWORD PTR [r8],r12
  ded041:	48 8d 35 49 00 cb ff 	lea    rsi,[rip+0xffffffffffcb0049]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
  ded048:	48 8d 0d fd 6d 04 00 	lea    rcx,[rip+0x46dfd]        # e33e4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x100ed2>
  ded04f:	4c 8d b4 24 e0 07 00 	lea    r14,[rsp+0x7e0]
  ded056:	00 
  ded057:	6a 08                	push   0x8
  ded059:	41 59                	pop    r9
  ded05b:	4c 89 f7             	mov    rdi,r14
  ded05e:	31 d2                	xor    edx,edx
  ded060:	e8 2f d7 9e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  ded065:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  ded069:	48 8d bc 24 d0 11 00 	lea    rdi,[rsp+0x11d0]
  ded070:	00 
  ded071:	4c 89 ee             	mov    rsi,r13
  ded074:	4c 89 f2             	mov    rdx,r14
  ded077:	ff 50 28             	call   QWORD PTR [rax+0x28]
  ded07a:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
  ded07f:	4c 8d b0 28 01 00 00 	lea    r14,[rax+0x128]
  ded086:	48 8d 9c 24 d0 11 00 	lea    rbx,[rsp+0x11d0]
  ded08d:	00 
  ded08e:	48 89 ef             	mov    rdi,rbp
  ded091:	48 89 de             	mov    rsi,rbx
  ded094:	e8 59 cb 9e 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
  ded099:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  ded09d:	e8 e4 13 cb ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  ded0a2:	48 8d bc 24 e0 07 00 	lea    rdi,[rsp+0x7e0]
  ded0a9:	00 
  ded0aa:	e8 39 d7 9e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  ded0af:	31 ff                	xor    edi,edi
  ded0b1:	e8 d0 13 cb ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  ded0b6:	31 ff                	xor    edi,edi
  ded0b8:	e8 c9 13 cb ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  ded0bd:	66 49 0f 6e c7       	movq   xmm0,r15
  ded0c2:	66 49 0f 6e cc       	movq   xmm1,r12
  ded0c7:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  ded0cb:	66 0f 7f 4c 24 70    	movdqa XMMWORD PTR [rsp+0x70],xmm1
  ded0d1:	31 ff                	xor    edi,edi
  ded0d3:	e8 44 13 cb ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  ded0d8:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
  ded0dd:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
  ded0e1:	66 0f 6f 44 24 70    	movdqa xmm0,XMMWORD PTR [rsp+0x70]
  ded0e7:	f3 41 0f 7f 06       	movdqu XMMWORD PTR [r14],xmm0
  ded0ec:	e8 95 13 cb ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  ded0f1:	bf d0 00 00 00       	mov    edi,0xd0
  ded0f6:	4c 89 bc 24 28 01 00 	mov    QWORD PTR [rsp+0x128],r15
  ded0fd:	00 
  ded0fe:	e8 fd 0d a0 00       	call   17edf00 <_Znwm@plt>
  ded103:	49 89 c4             	mov    r12,rax
  ded106:	66 0f ef c0          	pxor   xmm0,xmm0
  ded10a:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
### +0x28 call 0xdee9d5
  dee96a:	4c 89 fe             	mov    rsi,r15
  dee96d:	e8 5a 2e 00 00       	call   df17cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe852>
  dee972:	4c 89 ff             	mov    rdi,r15
  dee975:	e8 16 f5 9f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  dee97a:	48 83 c3 1c          	add    rbx,0x1c
  dee97e:	4c 39 eb             	cmp    rbx,r13
  dee981:	75 9c                	jne    dee91f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbb9a5>
  dee983:	48 8b bc 24 58 13 00 	mov    rdi,QWORD PTR [rsp+0x1358]
  dee98a:	00 
  dee98b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  dee98e:	48 8d 9c 24 90 13 00 	lea    rbx,[rsp+0x1390]
  dee995:	00 
  dee996:	48 89 de             	mov    rsi,rbx
  dee999:	ff 50 60             	call   QWORD PTR [rax+0x60]
  dee99c:	48 89 df             	mov    rdi,rbx
  dee99f:	e8 0e 2e 00 00       	call   df17b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe838>
  dee9a4:	48 8d bc 24 e8 11 00 	lea    rdi,[rsp+0x11e8]
  dee9ab:	00 
  dee9ac:	e8 77 cd c8 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
  dee9b1:	48 8d bc 24 b0 06 00 	lea    rdi,[rsp+0x6b0]
  dee9b8:	00 
  dee9b9:	48 8b b4 24 88 14 00 	mov    rsi,QWORD PTR [rsp+0x1488]
  dee9c0:	00 
  dee9c1:	e8 ca b8 c8 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  dee9c6:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
  dee9ca:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  dee9cd:	48 8d bc 24 90 13 00 	lea    rdi,[rsp+0x1390]
  dee9d4:	00 
  dee9d5:	ff 50 28             	call   QWORD PTR [rax+0x28]
  dee9d8:	48 8b 6c 24 58       	mov    rbp,QWORD PTR [rsp+0x58]
  dee9dd:	48 8d bc 24 90 13 00 	lea    rdi,[rsp+0x1390]
  dee9e4:	00 
  dee9e5:	e8 4c ce c8 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  dee9ea:	49 89 c6             	mov    r14,rax
  dee9ed:	49 89 d7             	mov    r15,rdx
  dee9f0:	bf 70 04 00 00       	mov    edi,0x470
  dee9f5:	e8 06 f5 9f 00       	call   17edf00 <_Znwm@plt>
  dee9fa:	48 89 c3             	mov    rbx,rax
  dee9fd:	48 8d bc 24 e0 07 00 	lea    rdi,[rsp+0x7e0]
  deea04:	00 
  deea05:	48 8d b4 24 b0 06 00 	lea    rsi,[rsp+0x6b0]
  deea0c:	00 
  deea0d:	e8 9e 1c ee ff       	call   cd06b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21d650>
  deea12:	48 8d 05 4f 09 a4 00 	lea    rax,[rip+0xa4094f]        # 182f368 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x1300>
  deea19:	48 89 03             	mov    QWORD PTR [rbx],rax
  deea1c:	31 c0                	xor    eax,eax
  deea1e:	88 43 08             	mov    BYTE PTR [rbx+0x8],al
  deea21:	88 83 48 01 00 00    	mov    BYTE PTR [rbx+0x148],al
  deea27:	48 c7 83 50 01 00 00 	mov    QWORD PTR [rbx+0x150],0x7530
  deea2e:	30 75 00 00 
  deea32:	66 0f ef c0          	pxor   xmm0,xmm0
  deea36:	f3 0f 7f 83 58 01 00 	movdqu XMMWORD PTR [rbx+0x158],xmm0
  deea3d:	00 
  deea3e:	48 83 a3 68 01 00 00 	and    QWORD PTR [rbx+0x168],0x0
  deea45:	00 
  deea46:	48 8d bb 70 01 00 00 	lea    rdi,[rbx+0x170]
  deea4d:	e8 3c 98 d3 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
  deea52:	48 8d bb c8 01 00 00 	lea    rdi,[rbx+0x1c8]
  deea59:	e8 c0 d1 cc ff       	call   abbc1e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bbe>
  deea5e:	48 8d bb 20 02 00 00 	lea    rdi,[rbx+0x220]
  deea65:	e8 98 b3 9e 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  deea6a:	48 8d bb 78 02 00 00 	lea    rdi,[rbx+0x278]
  deea71:	e8 8c b3 9e 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>

## rank 6: score=52 FDE=0xe92f2c..0xe98f3b features=stride8,begin-end,+10,+18,+20,sret=22
### +0x28 call 0xe953fc
  e95393:	74 22                	je     e953b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c7cd>
  e95395:	48 8d 9c 24 90 0f 00 	lea    rbx,[rsp+0xf90]
  e9539c:	00 
  e9539d:	48 89 df             	mov    rdi,rbx
  e953a0:	e8 51 46 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  e953a5:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e953ac:	00 
  e953ad:	48 89 de             	mov    rsi,rbx
  e953b0:	e8 89 46 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e953b5:	eb 48                	jmp    e953ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c815>
  e953b7:	4c 8d 84 24 30 0a 00 	lea    r8,[rsp+0xa30]
  e953be:	00 
  e953bf:	4d 89 28             	mov    QWORD PTR [r8],r13
  e953c2:	48 8d 35 c8 7c c0 ff 	lea    rsi,[rip+0xffffffffffc07cc8]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
  e953c9:	48 8d 0d e0 0f 03 00 	lea    rcx,[rip+0x30fe0]        # ec63b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d7c6>
  e953d0:	48 8d 9c 24 90 0f 00 	lea    rbx,[rsp+0xf90]
  e953d7:	00 
  e953d8:	6a 08                	push   0x8
  e953da:	41 59                	pop    r9
  e953dc:	48 89 df             	mov    rdi,rbx
  e953df:	31 d2                	xor    edx,edx
  e953e1:	e8 ae 53 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e953e6:	48 8b b4 24 80 00 00 	mov    rsi,QWORD PTR [rsp+0x80]
  e953ed:	00 
  e953ee:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e953f1:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e953f8:	00 
  e953f9:	48 89 da             	mov    rdx,rbx
  e953fc:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e953ff:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
  e95404:	48 8d b8 88 00 00 00 	lea    rdi,[rax+0x88]
  e9540b:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]
  e95412:	00 
  e95413:	48 89 de             	mov    rsi,rbx
  e95416:	e8 23 46 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e9541b:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  e9541f:	e8 62 90 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e95424:	40 84 ed             	test   bpl,bpl
  e95427:	74 0f                	je     e95438 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c84e>
  e95429:	48 8d bc 24 90 0f 00 	lea    rdi,[rsp+0xf90]
  e95430:	00 
  e95431:	e8 9e 47 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  e95436:	eb 0d                	jmp    e95445 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c85b>
  e95438:	48 8d bc 24 90 0f 00 	lea    rdi,[rsp+0xf90]
  e9543f:	00 
  e95440:	e8 a3 53 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e95445:	4c 8b 7c 24 68       	mov    r15,QWORD PTR [rsp+0x68]
  e9544a:	4c 8b b4 24 c0 00 00 	mov    r14,QWORD PTR [rsp+0xc0]
  e95451:	00 
  e95452:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
  e95457:	48 8d b8 98 00 00 00 	lea    rdi,[rax+0x98]
  e9545e:	e8 2b 2e c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
  e95463:	48 8b 9c 24 d0 00 00 	mov    rbx,QWORD PTR [rsp+0xd0]
  e9546a:	00 
  e9546b:	48 89 df             	mov    rdi,rbx
  e9546e:	e8 13 90 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e95473:	31 ff                	xor    edi,edi
  e95475:	e8 a2 8f c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9547a:	48 89 df             	mov    rdi,rbx
  e9547d:	e8 04 90 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e95482:	31 ff                	xor    edi,edi
  e95484:	e8 fd 8f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e95489:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
### +0x28 call 0xe930da
  e9305a:	84 db                	test   bl,bl
  e9305c:	74 14                	je     e93072 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a488>
  e9305e:	48 8d 35 13 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c13]        # 43bc78 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1884>
  e93065:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9306c:	00 
  e9306d:	e8 fe a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e93072:	48 83 bc 24 00 04 00 	cmp    QWORD PTR [rsp+0x400],0x0
  e93079:	00 00 
  e9307b:	74 14                	je     e93091 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a4a7>
  e9307d:	48 8d 35 0c 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c0c]        # 43bc90 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x189c>
  e93084:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9308b:	00 
  e9308c:	e8 df a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e93091:	49 8b 85 70 05 00 00 	mov    rax,QWORD PTR [r13+0x570]
  e93098:	80 78 01 00          	cmp    BYTE PTR [rax+0x1],0x0
  e9309c:	48 8d 1d 3d b8 97 00 	lea    rbx,[rip+0x97b83d]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
  e930a3:	4c 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],r15
  e930a8:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
  e930ad:	0f 85 ca 01 00 00    	jne    e9327d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a693>
  e930b3:	4d 8b bd 10 04 00 00 	mov    r15,QWORD PTR [r13+0x410]
  e930ba:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
  e930c1:	00 
  e930c2:	48 89 1e             	mov    QWORD PTR [rsi],rbx
  e930c5:	48 8b 05 d4 e9 a1 00 	mov    rax,QWORD PTR [rip+0xa1e9d4]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
  e930cc:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  e930d0:	48 89 76 20          	mov    QWORD PTR [rsi+0x20],rsi
  e930d4:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e930d7:	4c 89 ff             	mov    rdi,r15
  e930da:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e930dd:	4c 8b b4 24 90 03 00 	mov    r14,QWORD PTR [rsp+0x390]
  e930e4:	00 
  e930e5:	48 8b 84 24 98 03 00 	mov    rax,QWORD PTR [rsp+0x398]
  e930ec:	00 
  e930ed:	48 85 c0             	test   rax,rax
  e930f0:	74 0f                	je     e93101 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a517>
  e930f2:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
  e930f7:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
  e930fc:	48 89 c3             	mov    rbx,rax
  e930ff:	eb 02                	jmp    e93103 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a519>
  e93101:	31 db                	xor    ebx,ebx
  e93103:	66 0f ef c0          	pxor   xmm0,xmm0
  e93107:	66 0f 7f 84 24 50 10 	movdqa XMMWORD PTR [rsp+0x1050],xmm0
  e9310e:	00 00 
  e93110:	48 83 a4 24 60 10 00 	and    QWORD PTR [rsp+0x1060],0x0
  e93117:	00 00 
  e93119:	4c 8d 84 24 10 0e 00 	lea    r8,[rsp+0xe10]
  e93120:	00 
  e93121:	4d 89 30             	mov    QWORD PTR [r8],r14
  e93124:	49 89 40 08          	mov    QWORD PTR [r8+0x8],rax
  e93128:	4d 89 78 10          	mov    QWORD PTR [r8+0x10],r15
  e9312c:	48 8d 35 43 67 c9 ff 	lea    rsi,[rip+0xffffffffffc96743]        # b29876 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x76816>
  e93133:	48 8d 15 af aa cf ff 	lea    rdx,[rip+0xffffffffffcfaaaf]        # b8dbe9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdab89>
  e9313a:	48 8d 0d cb 62 00 00 	lea    rcx,[rip+0x62cb]        # e9940c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60822>
  e93141:	4c 8d a4 24 e0 0b 00 	lea    r12,[rsp+0xbe0]
  e93148:	00 
  e93149:	6a 18                	push   0x18
  e9314b:	41 59                	pop    r9
  e9314d:	4c 89 e7             	mov    rdi,r12
  e93150:	e8 3f 76 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e93155:	49 8b 06             	mov    rax,QWORD PTR [r14]
  e93158:	48 8d bc 24 30 03 00 	lea    rdi,[rsp+0x330]
  e9315f:	00 
  e93160:	4c 89 f6             	mov    rsi,r14
### +0x28 call 0xe9706f
  e96ffe:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
  e97003:	49 89 5c 24 10       	mov    QWORD PTR [r12+0x10],rbx
  e97008:	4d 89 64 24 20       	mov    QWORD PTR [r12+0x20],r12
  e9700d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e97010:	4c 89 e6             	mov    rsi,r12
  e97013:	ff 50 10             	call   QWORD PTR [rax+0x10]
  e97016:	4c 89 e7             	mov    rdi,r12
  e97019:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
  e9701e:	e8 47 2f be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e97023:	31 ff                	xor    edi,edi
  e97025:	e8 88 74 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e9702a:	48 89 df             	mov    rdi,rbx
  e9702d:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
  e97032:	e8 7b 74 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e97037:	48 8b bc 24 58 10 00 	mov    rdi,QWORD PTR [rsp+0x1058]
  e9703e:	00 
  e9703f:	e8 42 74 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e97044:	48 8b bc 24 20 03 00 	mov    rdi,QWORD PTR [rsp+0x320]
  e9704b:	00 
  e9704c:	48 85 ff             	test   rdi,rdi
  e9704f:	74 30                	je     e97081 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e497>
  e97051:	4c 8d a4 24 50 10 00 	lea    r12,[rsp+0x1050]
  e97058:	00 
  e97059:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
  e9705f:	66 41 0f 7f 04 24    	movdqa XMMWORD PTR [r12],xmm0
  e97065:	f0 49 ff 06          	lock inc QWORD PTR [r14]
  e97069:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e9706c:	4c 89 e6             	mov    rsi,r12
  e9706f:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e97072:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
  e97077:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
  e9707c:	e8 05 74 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e97081:	48 8d 35 60 fa 4a ff 	lea    rsi,[rip+0xffffffffff4afa60]        # 346ae8 <_ZTSSt12bad_any_cast@@Base-0x496e0>
  e97088:	48 8d bc 24 00 08 00 	lea    rdi,[rsp+0x800]
  e9708f:	00 
  e97090:	e8 e9 29 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  e97095:	bf e0 00 00 00       	mov    edi,0xe0
  e9709a:	e8 61 6e 95 00       	call   17edf00 <_Znwm@plt>
  e9709f:	49 89 c6             	mov    r14,rax
  e970a2:	66 0f ef c0          	pxor   xmm0,xmm0
  e970a6:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e970ab:	48 8d 05 16 3d 97 00 	lea    rax,[rip+0x973d16]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
  e970b2:	49 89 06             	mov    QWORD PTR [r14],rax
  e970b5:	48 8b 4c 24 38       	mov    rcx,QWORD PTR [rsp+0x38]
  e970ba:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  e970bf:	48 8d 05 1a 78 97 00 	lea    rax,[rip+0x97781a]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
  e970c6:	48 89 84 24 50 10 00 	mov    QWORD PTR [rsp+0x1050],rax
  e970cd:	00 
  e970ce:	48 8d 05 a9 cb 5e 00 	lea    rax,[rip+0x5ecba9]        # 1483c7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c9202>
  e970d5:	48 89 84 24 58 10 00 	mov    QWORD PTR [rsp+0x1058],rax
  e970dc:	00 
  e970dd:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
  e970e4:	00 
  e970e5:	48 8d 05 84 ad 99 00 	lea    rax,[rip+0x99ad84]        # 1831e70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3e08>
  e970ec:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
  e970f0:	49 89 6e 28          	mov    QWORD PTR [r14+0x28],rbp
  e970f4:	49 89 4e 30          	mov    QWORD PTR [r14+0x30],rcx
  e970f8:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  e970fd:	48 8b 84 24 38 03 00 	mov    rax,QWORD PTR [rsp+0x338]
  e97104:	00 
  e97105:	0f 28 84 24 30 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x330]
  e9710c:	00 
  e9710d:	41 0f 11 46 38       	movups XMMWORD PTR [r14+0x38],xmm0

## rank 7: score=52 FDE=0x11ef334..0x11f5af4 features=stride8,begin-end,+10,+18,+20,sret=22
### +0x28 call 0x11efda9
 11efd35:	48 8b bc 24 28 05 00 	mov    rdi,QWORD PTR [rsp+0x528]
 11efd3c:	00 
 11efd3d:	e8 44 e7 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11efd42:	48 8b bc 24 d0 06 00 	mov    rdi,QWORD PTR [rsp+0x6d0]
 11efd49:	00 
 11efd4a:	e8 71 88 08 00       	call   12785c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbdb44>
 11efd4f:	48 89 83 f8 03 00 00 	mov    QWORD PTR [rbx+0x3f8],rax
 11efd56:	48 8d 35 6c 41 19 ff 	lea    rsi,[rip+0xffffffffff19416c]        # 383ec9 <_ZTSSt12bad_any_cast@@Base-0xc2ff>
 11efd5d:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 11efd64:	00 
 11efd65:	e8 14 9d 88 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 11efd6a:	48 8b b4 24 78 06 00 	mov    rsi,QWORD PTR [rsp+0x678]
 11efd71:	00 
 11efd72:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11efd75:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
 11efd7c:	00 
 11efd7d:	48 8d 94 24 e0 04 00 	lea    rdx,[rsp+0x4e0]
 11efd84:	00 
 11efd85:	ff 50 20             	call   QWORD PTR [rax+0x20]
 11efd88:	48 8b 84 24 88 06 00 	mov    rax,QWORD PTR [rsp+0x688]
 11efd8f:	00 
 11efd90:	48 8b 8c 24 80 06 00 	mov    rcx,QWORD PTR [rsp+0x680]
 11efd97:	00 
 11efd98:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
 11efd9f:	00 
 11efda0:	4c 8b 21             	mov    r12,QWORD PTR [rcx]
 11efda3:	4c 8b 28             	mov    r13,QWORD PTR [rax]
 11efda6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11efda9:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11efdac:	48 8b 94 24 c0 06 00 	mov    rdx,QWORD PTR [rsp+0x6c0]
 11efdb3:	00 
 11efdb4:	44 0f b7 b3 fc 03 00 	movzx  r14d,WORD PTR [rbx+0x3fc]
 11efdbb:	00 
 11efdbc:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 11efdc1:	44 8a 79 02          	mov    r15b,BYTE PTR [rcx+0x2]
 11efdc5:	48 8d 0d 84 ee 66 00 	lea    rcx,[rip+0x66ee84]        # 185ec50 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b338>
 11efdcc:	48 89 8b 00 04 00 00 	mov    QWORD PTR [rbx+0x400],rcx
 11efdd3:	48 8b 8c 24 40 02 00 	mov    rcx,QWORD PTR [rsp+0x240]
 11efdda:	00 
 11efddb:	48 89 8b 18 04 00 00 	mov    QWORD PTR [rbx+0x418],rcx
 11efde2:	66 0f 6f 84 24 30 02 	movdqa xmm0,XMMWORD PTR [rsp+0x230]
 11efde9:	00 00 
 11efdeb:	f3 0f 7f 83 08 04 00 	movdqu XMMWORD PTR [rbx+0x408],xmm0
 11efdf2:	00 
 11efdf3:	66 0f ef c0          	pxor   xmm0,xmm0
 11efdf7:	66 0f 7f 84 24 30 02 	movdqa XMMWORD PTR [rsp+0x230],xmm0
 11efdfe:	00 00 
 11efe00:	48 83 a4 24 40 02 00 	and    QWORD PTR [rsp+0x240],0x0
 11efe07:	00 00 
 11efe09:	4c 89 a3 20 04 00 00 	mov    QWORD PTR [rbx+0x420],r12
 11efe10:	4c 89 ab 28 04 00 00 	mov    QWORD PTR [rbx+0x428],r13
 11efe17:	48 89 93 30 04 00 00 	mov    QWORD PTR [rbx+0x430],rdx
 11efe1e:	48 89 83 38 04 00 00 	mov    QWORD PTR [rbx+0x438],rax
 11efe25:	4c 8d a3 40 04 00 00 	lea    r12,[rbx+0x440]
 11efe2c:	4c 89 e7             	mov    rdi,r12
 11efe2f:	e8 c2 9b 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 11efe34:	48 8d ab 50 04 00 00 	lea    rbp,[rbx+0x450]
 11efe3b:	48 89 ef             	mov    rdi,rbp
 11efe3e:	e8 b3 9b 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 11efe43:	48 8d bb 60 04 00 00 	lea    rdi,[rbx+0x460]
 11efe4a:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
 11efe4f:	e8 a2 9b 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 11efe54:	48 8d bb 70 04 00 00 	lea    rdi,[rbx+0x470]
### +0x28 call 0x11ef3d5
 11ef355:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
 11ef35a:	48 89 94 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rdx
 11ef361:	00 
 11ef362:	48 89 fb             	mov    rbx,rdi
 11ef365:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 11ef36c:	00 00 
 11ef36e:	48 89 84 24 00 06 00 	mov    QWORD PTR [rsp+0x600],rax
 11ef375:	00 
 11ef376:	c6 47 08 00          	mov    BYTE PTR [rdi+0x8],0x0
 11ef37a:	48 8d 05 c7 c5 66 00 	lea    rax,[rip+0x66c5c7]        # 185b948 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18030>
 11ef381:	48 89 07             	mov    QWORD PTR [rdi],rax
 11ef384:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 11ef389:	48 8b bc 24 68 06 00 	mov    rdi,QWORD PTR [rsp+0x668]
 11ef390:	00 
 11ef391:	48 8d 05 48 8a 7e ff 	lea    rax,[rip+0xffffffffff7e8a48]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 11ef398:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
 11ef39c:	48 8d 05 d7 3a 96 ff 	lea    rax,[rip+0xffffffffff963ad7]        # b52e7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9fe1a>
 11ef3a3:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
 11ef3a7:	48 8d 4b 30          	lea    rcx,[rbx+0x30]
 11ef3ab:	48 8d 05 16 c7 66 00 	lea    rax,[rip+0x66c716]        # 185bac8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x181b0>
 11ef3b2:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
 11ef3b6:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
 11ef3bd:	00 
 11ef3be:	48 89 4b 50          	mov    QWORD PTR [rbx+0x50],rcx
 11ef3c2:	48 89 74 24 10       	mov    QWORD PTR [rsp+0x10],rsi
 11ef3c7:	48 8b 86 fc 00 00 00 	mov    rax,QWORD PTR [rsi+0xfc]
 11ef3ce:	48 89 43 60          	mov    QWORD PTR [rbx+0x60],rax
 11ef3d2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11ef3d5:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11ef3d8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 11ef3db:	48 89 c7             	mov    rdi,rax
 11ef3de:	ff 51 38             	call   QWORD PTR [rcx+0x38]
 11ef3e1:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
 11ef3e6:	48 83 a4 24 c0 04 00 	and    QWORD PTR [rsp+0x4c0],0x0
 11ef3ed:	00 00 
 11ef3ef:	48 8d 05 ea 89 7e ff 	lea    rax,[rip+0xffffffffff7e89ea]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 11ef3f6:	48 89 84 24 d0 04 00 	mov    QWORD PTR [rsp+0x4d0],rax
 11ef3fd:	00 
 11ef3fe:	48 8d 05 45 1e a8 ff 	lea    rax,[rip+0xffffffffffa81e45]        # c7124a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1be1ea>
 11ef405:	48 89 84 24 d8 04 00 	mov    QWORD PTR [rsp+0x4d8],rax
 11ef40c:	00 
 11ef40d:	48 8d 35 76 e8 17 ff 	lea    rsi,[rip+0xffffffffff17e876]        # 36dc8a <_ZTSSt12bad_any_cast@@Base-0x2253e>
 11ef414:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
 11ef41b:	00 
 11ef41c:	e8 5d a6 88 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 11ef421:	48 8b b4 24 78 06 00 	mov    rsi,QWORD PTR [rsp+0x678]
 11ef428:	00 
 11ef429:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11ef42c:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 11ef433:	00 
 11ef434:	48 8d 94 24 a0 05 00 	lea    rdx,[rsp+0x5a0]
 11ef43b:	00 
 11ef43c:	ff 50 20             	call   QWORD PTR [rax+0x20]
 11ef43f:	48 8b ac 24 d0 06 00 	mov    rbp,QWORD PTR [rsp+0x6d0]
 11ef446:	00 
 11ef447:	48 8d 43 68          	lea    rax,[rbx+0x68]
 11ef44b:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 11ef450:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 11ef457:	00 
 11ef458:	e8 d9 c3 88 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 11ef45d:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
 11ef462:	48 89 54 24 70       	mov    QWORD PTR [rsp+0x70],rdx
 11ef467:	48 8d 8c 24 a0 04 00 	lea    rcx,[rsp+0x4a0]
### +0x28 call 0x11f02a6
 11f023b:	e8 26 59 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
 11f0240:	48 8d 05 91 3c 67 00 	lea    rax,[rip+0x673c91]        # 1863ed8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x205c0>
 11f0247:	49 89 06             	mov    QWORD PTR [r14],rax
 11f024a:	49 8d 7e 08          	lea    rdi,[r14+0x8]
 11f024e:	4c 89 fe             	mov    rsi,r15
 11f0251:	e8 10 59 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
 11f0256:	41 c7 46 28 3c 00 00 	mov    DWORD PTR [r14+0x28],0x3c
 11f025d:	00 
 11f025e:	31 c0                	xor    eax,eax
 11f0260:	41 88 46 30          	mov    BYTE PTR [r14+0x30],al
 11f0264:	41 88 46 40          	mov    BYTE PTR [r14+0x40],al
 11f0268:	4c 89 f7             	mov    rdi,r14
 11f026b:	48 83 c7 48          	add    rdi,0x48
 11f026f:	e8 1a 80 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 11f0274:	4c 89 b4 24 50 05 00 	mov    QWORD PTR [rsp+0x550],r14
 11f027b:	00 
 11f027c:	4c 89 ff             	mov    rdi,r15
 11f027f:	e8 2a 59 00 00       	call   11f5bae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b132>
 11f0284:	4c 89 e7             	mov    rdi,r12
 11f0287:	e8 22 59 00 00       	call   11f5bae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b132>
 11f028c:	4c 8b bc 24 70 06 00 	mov    r15,QWORD PTR [rsp+0x670]
 11f0293:	00 
 11f0294:	49 8b 07             	mov    rax,QWORD PTR [r15]
 11f0297:	4c 89 ff             	mov    rdi,r15
 11f029a:	4c 89 f6             	mov    rsi,r14
 11f029d:	ff 50 38             	call   QWORD PTR [rax+0x38]
 11f02a0:	49 8b 07             	mov    rax,QWORD PTR [r15]
 11f02a3:	4c 89 ff             	mov    rdi,r15
 11f02a6:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11f02a9:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
 11f02b0:	00 
 11f02b1:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 11f02b5:	48 8d 0d 7c 3c 67 00 	lea    rcx,[rip+0x673c7c]        # 1863f38 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20620>
 11f02bc:	48 89 8b 90 05 00 00 	mov    QWORD PTR [rbx+0x590],rcx
 11f02c3:	48 89 83 98 05 00 00 	mov    QWORD PTR [rbx+0x598],rax
 11f02ca:	4c 89 b3 a0 05 00 00 	mov    QWORD PTR [rbx+0x5a0],r14
 11f02d1:	e8 fe 58 00 00       	call   11f5bd4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b158>
 11f02d6:	48 8d 05 9b eb 66 00 	lea    rax,[rip+0x66eb9b]        # 185ee78 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b560>
 11f02dd:	48 89 83 a8 05 00 00 	mov    QWORD PTR [rbx+0x5a8],rax
 11f02e4:	4c 8d b3 b0 05 00 00 	lea    r14,[rbx+0x5b0]
 11f02eb:	4c 89 f7             	mov    rdi,r14
 11f02ee:	e8 0f 9b 5e 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
 11f02f3:	4c 8d a3 08 06 00 00 	lea    r12,[rbx+0x608]
 11f02fa:	66 0f ef c0          	pxor   xmm0,xmm0
 11f02fe:	f3 0f 7f 83 28 06 00 	movdqu XMMWORD PTR [rbx+0x628],xmm0
 11f0305:	00 
 11f0306:	f3 0f 7f 83 18 06 00 	movdqu XMMWORD PTR [rbx+0x618],xmm0
 11f030d:	00 
 11f030e:	f3 0f 7f 83 08 06 00 	movdqu XMMWORD PTR [rbx+0x608],xmm0
 11f0315:	00 
 11f0316:	bf c8 0f 00 00       	mov    edi,0xfc8
 11f031b:	e8 e0 db 5f 00       	call   17edf00 <_Znwm@plt>
 11f0320:	49 89 c7             	mov    r15,rax
 11f0323:	66 0f ef c0          	pxor   xmm0,xmm0
 11f0327:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
 11f032c:	48 8d 05 bd eb 66 00 	lea    rax,[rip+0x66ebbd]        # 185eef0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b5d8>
 11f0333:	49 89 07             	mov    QWORD PTR [r15],rax
 11f0336:	4d 89 fe             	mov    r14,r15
 11f0339:	49 83 c6 18          	add    r14,0x18
 11f033d:	ba b0 0f 00 00       	mov    edx,0xfb0
 11f0342:	4c 89 f7             	mov    rdi,r14
 11f0345:	31 f6                	xor    esi,esi
 11f0347:	e8 44 e8 5f 00       	call   17eeb90 <memset@plt>
### +0x28 call 0x11f041d
 11f03aa:	48 8d 35 e0 cc 8a ff 	lea    rsi,[rip+0xffffffffff8acce0]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 11f03b1:	48 8d 0d 3c 58 00 00 	lea    rcx,[rip+0x583c]        # 11f5bf4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b178>
 11f03b8:	4c 8d b4 24 f0 01 00 	lea    r14,[rsp+0x1f0]
 11f03bf:	00 
 11f03c0:	6a 08                	push   0x8
 11f03c2:	41 59                	pop    r9
 11f03c4:	4c 89 f7             	mov    rdi,r14
 11f03c7:	31 d2                	xor    edx,edx
 11f03c9:	e8 c6 a3 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 11f03ce:	49 8b 07             	mov    rax,QWORD PTR [r15]
 11f03d1:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
 11f03d8:	00 
 11f03d9:	4c 89 fe             	mov    rsi,r15
 11f03dc:	4c 89 f2             	mov    rdx,r14
 11f03df:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
 11f03e5:	48 8d bb c0 06 00 00 	lea    rdi,[rbx+0x6c0]
 11f03ec:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]
 11f03f3:	00 
 11f03f4:	4c 89 f6             	mov    rsi,r14
 11f03f7:	e8 42 96 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
 11f03fc:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 11f0400:	e8 81 e0 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f0405:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
 11f040c:	00 
 11f040d:	e8 d6 a3 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 11f0412:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
 11f0419:	00 
 11f041a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11f041d:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11f0420:	4c 8b b4 24 90 06 00 	mov    r14,QWORD PTR [rsp+0x690]
 11f0427:	00 
 11f0428:	48 8d 93 60 06 00 00 	lea    rdx,[rbx+0x660]
 11f042f:	48 8d 0d ca c5 66 00 	lea    rcx,[rip+0x66c5ca]        # 185ca00 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x190e8>
 11f0436:	48 89 8b d0 06 00 00 	mov    QWORD PTR [rbx+0x6d0],rcx
 11f043d:	48 89 83 d8 06 00 00 	mov    QWORD PTR [rbx+0x6d8],rax
 11f0444:	48 89 94 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rdx
 11f044b:	00 
 11f044c:	48 89 93 e0 06 00 00 	mov    QWORD PTR [rbx+0x6e0],rdx
 11f0453:	49 8b 06             	mov    rax,QWORD PTR [r14]
 11f0456:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
 11f045d:	00 
 11f045e:	4c 89 f6             	mov    rsi,r14
 11f0461:	ff 50 58             	call   QWORD PTR [rax+0x58]
 11f0464:	4c 8b a4 24 20 05 00 	mov    r12,QWORD PTR [rsp+0x520]
 11f046b:	00 
 11f046c:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
 11f0473:	00 
 11f0474:	48 8b b4 24 60 06 00 	mov    rsi,QWORD PTR [rsp+0x660]
 11f047b:	00 
 11f047c:	e8 41 12 5d 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 11f0481:	49 8b 06             	mov    rax,QWORD PTR [r14]
 11f0484:	4c 89 f7             	mov    rdi,r14
 11f0487:	ff 50 60             	call   QWORD PTR [rax+0x60]
 11f048a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 11f048f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 11f0494:	8a 80 aa 00 00 00    	mov    al,BYTE PTR [rax+0xaa]
 11f049a:	88 44 24 70          	mov    BYTE PTR [rsp+0x70],al
 11f049e:	48 8d 93 f0 06 00 00 	lea    rdx,[rbx+0x6f0]
 11f04a5:	48 8d 05 3c e6 66 00 	lea    rax,[rip+0x66e63c]        # 185eae8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b1d0>
 11f04ac:	48 89 83 e8 06 00 00 	mov    QWORD PTR [rbx+0x6e8],rax
 11f04b3:	48 8d 05 86 e6 66 00 	lea    rax,[rip+0x66e686]        # 185eb40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b228>
 11f04ba:	48 89 83 f0 06 00 00 	mov    QWORD PTR [rbx+0x6f0],rax
 11f04c1:	4c 89 a3 f8 06 00 00 	mov    QWORD PTR [rbx+0x6f8],r12

## rank 8: score=51 FDE=0xe8c65c..0xe8e898 features=stride8,begin-end,+18,+20,sret=27
### +0x28 call 0xe8c9fb
  e8c991:	4c 89 fe             	mov    rsi,r15
  e8c994:	ff 50 38             	call   QWORD PTR [rax+0x38]
  e8c997:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
  e8c99a:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
  e8c99e:	48 8d bc 24 68 03 00 	lea    rdi,[rsp+0x368]
  e8c9a5:	00 
  e8c9a6:	e8 73 da 7d 00       	call   166a41e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e58a>
  e8c9ab:	48 8b bc 24 48 06 00 	mov    rdi,QWORD PTR [rsp+0x648]
  e8c9b2:	00 
  e8c9b3:	e8 ce 1a c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8c9b8:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e8c9bb:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
  e8c9c2:	00 
  e8c9c3:	4c 89 fe             	mov    rsi,r15
  e8c9c6:	ff 50 40             	call   QWORD PTR [rax+0x40]
  e8c9c9:	48 8b 6c 24 50       	mov    rbp,QWORD PTR [rsp+0x50]
  e8c9ce:	4c 89 ef             	mov    rdi,r13
  e8c9d1:	e8 58 26 d0 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
  e8c9d6:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8c9d9:	48 8d bc 24 58 03 00 	lea    rdi,[rsp+0x358]
  e8c9e0:	00 
  e8c9e1:	48 89 c6             	mov    rsi,rax
  e8c9e4:	ff 51 38             	call   QWORD PTR [rcx+0x38]
  e8c9e7:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
  e8c9ec:	48 8b 75 58          	mov    rsi,QWORD PTR [rbp+0x58]
  e8c9f0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e8c9f3:	48 8d bc 24 40 03 00 	lea    rdi,[rsp+0x340]
  e8c9fa:	00 
  e8c9fb:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8c9fe:	48 8b 45 30          	mov    rax,QWORD PTR [rbp+0x30]
  e8ca02:	48 89 84 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],rax
  e8ca09:	00 
  e8ca0a:	48 8b 45 40          	mov    rax,QWORD PTR [rbp+0x40]
  e8ca0e:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
  e8ca13:	48 8b 45 68          	mov    rax,QWORD PTR [rbp+0x68]
  e8ca17:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
  e8ca1c:	48 8b 45 60          	mov    rax,QWORD PTR [rbp+0x60]
  e8ca20:	48 89 84 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rax
  e8ca27:	00 
  e8ca28:	f3 0f 6f 85 d8 00 00 	movdqu xmm0,XMMWORD PTR [rbp+0xd8]
  e8ca2f:	00 
  e8ca30:	48 8b bd e0 00 00 00 	mov    rdi,QWORD PTR [rbp+0xe0]
  e8ca37:	48 85 ff             	test   rdi,rdi
  e8ca3a:	74 0a                	je     e8ca46 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53e5c>
  e8ca3c:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
  e8ca41:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
  e8ca46:	48 8d 05 23 48 9a 00 	lea    rax,[rip+0x9a4823]        # 1831270 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3208>
  e8ca4d:	48 8d 8c 24 80 05 00 	lea    rcx,[rsp+0x580]
  e8ca54:	00 
  e8ca55:	48 89 01             	mov    QWORD PTR [rcx],rax
  e8ca58:	f3 0f 7f 41 08       	movdqu XMMWORD PTR [rcx+0x8],xmm0
  e8ca5d:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
  e8ca61:	e8 20 1a c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8ca66:	48 8b 9d 80 00 00 00 	mov    rbx,QWORD PTR [rbp+0x80]
  e8ca6d:	48 8b 85 90 00 00 00 	mov    rax,QWORD PTR [rbp+0x90]
  e8ca74:	48 89 84 24 98 01 00 	mov    QWORD PTR [rsp+0x198],rax
  e8ca7b:	00 
  e8ca7c:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
  e8ca80:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
  e8ca87:	00 
  e8ca88:	48 8b 45 20          	mov    rax,QWORD PTR [rbp+0x20]
  e8ca8c:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax
  e8ca93:	00 
### +0x28 call 0xe8c90c
  e8c89c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  e8c8a1:	4c 89 ef             	mov    rdi,r13
  e8c8a4:	e8 e5 a3 e2 ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
  e8c8a9:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
  e8c8ae:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  e8c8b2:	49 8b 75 10          	mov    rsi,QWORD PTR [r13+0x10]
  e8c8b6:	6a 78                	push   0x78
  e8c8b8:	5a                   	pop    rdx
  e8c8b9:	e8 20 5a cd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  e8c8be:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8c8c2:	4c 8b b0 c0 03 00 00 	mov    r14,QWORD PTR [rax+0x3c0]
  e8c8c9:	4d 85 f6             	test   r14,r14
  e8c8cc:	0f 84 da 19 00 00    	je     e8e2ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x556c2>
  e8c8d2:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  e8c8d6:	49 8b 75 10          	mov    rsi,QWORD PTR [r13+0x10]
  e8c8da:	6a 6e                	push   0x6e
  e8c8dc:	5a                   	pop    rdx
  e8c8dd:	e8 fc 59 cd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  e8c8e2:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8c8e6:	48 8b a8 70 03 00 00 	mov    rbp,QWORD PTR [rax+0x370]
  e8c8ed:	48 85 ed             	test   rbp,rbp
  e8c8f0:	0f 84 bb 19 00 00    	je     e8e2b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x556c7>
  e8c8f6:	4c 89 ef             	mov    rdi,r13
  e8c8f9:	e8 fe 4d d8 ff       	call   c116fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e69c>
  e8c8fe:	49 89 c7             	mov    r15,rax
  e8c901:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
  e8c908:	00 
  e8c909:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8c90c:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8c90f:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8c912:	48 89 c7             	mov    rdi,rax
  e8c915:	ff 51 48             	call   QWORD PTR [rcx+0x48]
  e8c918:	48 85 c0             	test   rax,rax
  e8c91b:	74 0f                	je     e8c92c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53d42>
  e8c91d:	49 8b 0f             	mov    rcx,QWORD PTR [r15]
  e8c920:	6a 0a                	push   0xa
  e8c922:	5e                   	pop    rsi
  e8c923:	4c 89 ff             	mov    rdi,r15
  e8c926:	48 89 c2             	mov    rdx,rax
  e8c929:	ff 51 28             	call   QWORD PTR [rcx+0x28]
  e8c92c:	48 89 9c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rbx
  e8c933:	00 
  e8c934:	48 8b 55 10          	mov    rdx,QWORD PTR [rbp+0x10]
  e8c938:	48 85 d2             	test   rdx,rdx
  e8c93b:	74 0c                	je     e8c949 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53d5f>
  e8c93d:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e8c940:	6a 14                	push   0x14
  e8c942:	5e                   	pop    rsi
  e8c943:	4c 89 ff             	mov    rdi,r15
  e8c946:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8c949:	48 83 7d 40 00       	cmp    QWORD PTR [rbp+0x40],0x0
  e8c94e:	74 33                	je     e8c983 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53d99>
  e8c950:	48 83 c5 20          	add    rbp,0x20
  e8c954:	48 8d 9c 24 e0 05 00 	lea    rbx,[rsp+0x5e0]
  e8c95b:	00 
  e8c95c:	48 89 df             	mov    rdi,rbx
  e8c95f:	48 89 ee             	mov    rsi,rbp
  e8c962:	e8 29 d9 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e8c967:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e8c96a:	6a 0a                	push   0xa
  e8c96c:	5e                   	pop    rsi
  e8c96d:	4c 89 ff             	mov    rdi,r15
  e8c970:	48 89 da             	mov    rdx,rbx
### +0x28 call 0xe8c929
  e8c8c9:	4d 85 f6             	test   r14,r14
  e8c8cc:	0f 84 da 19 00 00    	je     e8e2ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x556c2>
  e8c8d2:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  e8c8d6:	49 8b 75 10          	mov    rsi,QWORD PTR [r13+0x10]
  e8c8da:	6a 6e                	push   0x6e
  e8c8dc:	5a                   	pop    rdx
  e8c8dd:	e8 fc 59 cd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  e8c8e2:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8c8e6:	48 8b a8 70 03 00 00 	mov    rbp,QWORD PTR [rax+0x370]
  e8c8ed:	48 85 ed             	test   rbp,rbp
  e8c8f0:	0f 84 bb 19 00 00    	je     e8e2b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x556c7>
  e8c8f6:	4c 89 ef             	mov    rdi,r13
  e8c8f9:	e8 fe 4d d8 ff       	call   c116fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e69c>
  e8c8fe:	49 89 c7             	mov    r15,rax
  e8c901:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
  e8c908:	00 
  e8c909:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8c90c:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8c90f:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8c912:	48 89 c7             	mov    rdi,rax
  e8c915:	ff 51 48             	call   QWORD PTR [rcx+0x48]
  e8c918:	48 85 c0             	test   rax,rax
  e8c91b:	74 0f                	je     e8c92c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53d42>
  e8c91d:	49 8b 0f             	mov    rcx,QWORD PTR [r15]
  e8c920:	6a 0a                	push   0xa
  e8c922:	5e                   	pop    rsi
  e8c923:	4c 89 ff             	mov    rdi,r15
  e8c926:	48 89 c2             	mov    rdx,rax
  e8c929:	ff 51 28             	call   QWORD PTR [rcx+0x28]
  e8c92c:	48 89 9c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rbx
  e8c933:	00 
  e8c934:	48 8b 55 10          	mov    rdx,QWORD PTR [rbp+0x10]
  e8c938:	48 85 d2             	test   rdx,rdx
  e8c93b:	74 0c                	je     e8c949 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53d5f>
  e8c93d:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e8c940:	6a 14                	push   0x14
  e8c942:	5e                   	pop    rsi
  e8c943:	4c 89 ff             	mov    rdi,r15
  e8c946:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8c949:	48 83 7d 40 00       	cmp    QWORD PTR [rbp+0x40],0x0
  e8c94e:	74 33                	je     e8c983 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53d99>
  e8c950:	48 83 c5 20          	add    rbp,0x20
  e8c954:	48 8d 9c 24 e0 05 00 	lea    rbx,[rsp+0x5e0]
  e8c95b:	00 
  e8c95c:	48 89 df             	mov    rdi,rbx
  e8c95f:	48 89 ee             	mov    rsi,rbp
  e8c962:	e8 29 d9 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e8c967:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e8c96a:	6a 0a                	push   0xa
  e8c96c:	5e                   	pop    rsi
  e8c96d:	4c 89 ff             	mov    rdi,r15
  e8c970:	48 89 da             	mov    rdx,rbx
  e8c973:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e8c976:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]
  e8c97d:	00 
  e8c97e:	e8 e7 d5 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e8c983:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e8c986:	48 8d 9c 24 40 06 00 	lea    rbx,[rsp+0x640]
  e8c98d:	00 
  e8c98e:	48 89 df             	mov    rdi,rbx
  e8c991:	4c 89 fe             	mov    rsi,r15
  e8c994:	ff 50 38             	call   QWORD PTR [rax+0x38]
  e8c997:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
### +0x28 call 0xe8c946
  e8c8f0:	0f 84 bb 19 00 00    	je     e8e2b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x556c7>
  e8c8f6:	4c 89 ef             	mov    rdi,r13
  e8c8f9:	e8 fe 4d d8 ff       	call   c116fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e69c>
  e8c8fe:	49 89 c7             	mov    r15,rax
  e8c901:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
  e8c908:	00 
  e8c909:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8c90c:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8c90f:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8c912:	48 89 c7             	mov    rdi,rax
  e8c915:	ff 51 48             	call   QWORD PTR [rcx+0x48]
  e8c918:	48 85 c0             	test   rax,rax
  e8c91b:	74 0f                	je     e8c92c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53d42>
  e8c91d:	49 8b 0f             	mov    rcx,QWORD PTR [r15]
  e8c920:	6a 0a                	push   0xa
  e8c922:	5e                   	pop    rsi
  e8c923:	4c 89 ff             	mov    rdi,r15
  e8c926:	48 89 c2             	mov    rdx,rax
  e8c929:	ff 51 28             	call   QWORD PTR [rcx+0x28]
  e8c92c:	48 89 9c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rbx
  e8c933:	00 
  e8c934:	48 8b 55 10          	mov    rdx,QWORD PTR [rbp+0x10]
  e8c938:	48 85 d2             	test   rdx,rdx
  e8c93b:	74 0c                	je     e8c949 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53d5f>
  e8c93d:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e8c940:	6a 14                	push   0x14
  e8c942:	5e                   	pop    rsi
  e8c943:	4c 89 ff             	mov    rdi,r15
  e8c946:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8c949:	48 83 7d 40 00       	cmp    QWORD PTR [rbp+0x40],0x0
  e8c94e:	74 33                	je     e8c983 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53d99>
  e8c950:	48 83 c5 20          	add    rbp,0x20
  e8c954:	48 8d 9c 24 e0 05 00 	lea    rbx,[rsp+0x5e0]
  e8c95b:	00 
  e8c95c:	48 89 df             	mov    rdi,rbx
  e8c95f:	48 89 ee             	mov    rsi,rbp
  e8c962:	e8 29 d9 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e8c967:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e8c96a:	6a 0a                	push   0xa
  e8c96c:	5e                   	pop    rsi
  e8c96d:	4c 89 ff             	mov    rdi,r15
  e8c970:	48 89 da             	mov    rdx,rbx
  e8c973:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e8c976:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]
  e8c97d:	00 
  e8c97e:	e8 e7 d5 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e8c983:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e8c986:	48 8d 9c 24 40 06 00 	lea    rbx,[rsp+0x640]
  e8c98d:	00 
  e8c98e:	48 89 df             	mov    rdi,rbx
  e8c991:	4c 89 fe             	mov    rsi,r15
  e8c994:	ff 50 38             	call   QWORD PTR [rax+0x38]
  e8c997:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
  e8c99a:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
  e8c99e:	48 8d bc 24 68 03 00 	lea    rdi,[rsp+0x368]
  e8c9a5:	00 
  e8c9a6:	e8 73 da 7d 00       	call   166a41e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e58a>
  e8c9ab:	48 8b bc 24 48 06 00 	mov    rdi,QWORD PTR [rsp+0x648]
  e8c9b2:	00 
  e8c9b3:	e8 ce 1a c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8c9b8:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e8c9bb:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
  e8c9c2:	00 

## rank 9: score=51 FDE=0x15b1650..0x15b1ad1 features=stride8,begin-end,+10,+18,sret=27
### +0x28 call 0x15b1769
 15b16fa:	49 83 c7 48          	add    r15,0x48
 15b16fe:	4c 89 ff             	mov    rdi,r15
 15b1701:	e8 30 a1 4c ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 15b1706:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 15b170b:	48 89 c6             	mov    rsi,rax
 15b170e:	e8 3f e1 1c 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
 15b1713:	84 c0                	test   al,al
 15b1715:	0f 84 21 03 00 00    	je     15b1a3c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f6fc0>
 15b171b:	49 83 c6 18          	add    r14,0x18
 15b171f:	4c 8d 7b 09          	lea    r15,[rbx+0x9]
 15b1723:	f6 43 08 01          	test   BYTE PTR [rbx+0x8],0x1
 15b1727:	4d 89 f8             	mov    r8,r15
 15b172a:	74 04                	je     15b1730 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f6cb4>
 15b172c:	4c 8b 43 18          	mov    r8,QWORD PTR [rbx+0x18]
 15b1730:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
 15b1735:	45 8b 4c 24 20       	mov    r9d,DWORD PTR [r12+0x20]
 15b173a:	48 8d 35 3b 08 ea fe 	lea    rsi,[rip+0xfffffffffeea083b]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 15b1741:	48 8d 0d b1 9d db fe 	lea    rcx,[rip+0xfffffffffedb9db1]        # 36b4f9 <_ZTSSt12bad_any_cast@@Base-0x24ccf>
 15b1748:	6a 04                	push   0x4
 15b174a:	5f                   	pop    rdi
 15b174b:	ba 92 02 00 00       	mov    edx,0x292
 15b1750:	31 c0                	xor    eax,eax
 15b1752:	e8 7b 51 22 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
 15b1757:	48 8b 73 50          	mov    rsi,QWORD PTR [rbx+0x50]
 15b175b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 15b175e:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
 15b1763:	4c 89 e2             	mov    rdx,r12
 15b1766:	4c 89 f1             	mov    rcx,r14
 15b1769:	ff 50 28             	call   QWORD PTR [rax+0x28]
 15b176c:	48 83 7c 24 38 00    	cmp    QWORD PTR [rsp+0x38],0x0
 15b1772:	0f 84 97 00 00 00    	je     15b180f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f6d93>
 15b1778:	f6 43 08 01          	test   BYTE PTR [rbx+0x8],0x1
 15b177c:	74 04                	je     15b1782 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f6d06>
 15b177e:	4c 8b 7b 18          	mov    r15,QWORD PTR [rbx+0x18]
 15b1782:	48 8d 9c 24 80 00 00 	lea    rbx,[rsp+0x80]
 15b1789:	00 
 15b178a:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
 15b178f:	48 89 df             	mov    rdi,rbx
 15b1792:	e8 2f 95 0e 00       	call   169acc6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4ee32>
 15b1797:	f6 03 01             	test   BYTE PTR [rbx],0x1
 15b179a:	0f 84 a0 01 00 00    	je     15b1940 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f6ec4>
 15b17a0:	4c 8b 8c 24 90 00 00 	mov    r9,QWORD PTR [rsp+0x90]
 15b17a7:	00 
 15b17a8:	e9 9b 01 00 00       	jmp    15b1948 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f6ecc>
 15b17ad:	f6 43 08 01          	test   BYTE PTR [rbx+0x8],0x1
 15b17b1:	74 06                	je     15b17b9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f6d3d>
 15b17b3:	48 8b 5b 18          	mov    rbx,QWORD PTR [rbx+0x18]
 15b17b7:	eb 04                	jmp    15b17bd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f6d41>
 15b17b9:	48 83 c3 09          	add    rbx,0x9
 15b17bd:	89 ef                	mov    edi,ebp
 15b17bf:	e8 ba 03 05 00       	call   1601b7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x447102>
 15b17c4:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 15b17cb:	00 00 
 15b17cd:	48 3b 8c 24 a0 00 00 	cmp    rcx,QWORD PTR [rsp+0xa0]
 15b17d4:	00 
 15b17d5:	0f 85 90 02 00 00    	jne    15b1a6b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f6fef>
 15b17db:	48 8d 35 9a 07 ea fe 	lea    rsi,[rip+0xfffffffffeea079a]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 15b17e2:	48 8d 0d ea a3 dd fe 	lea    rcx,[rip+0xfffffffffedda3ea]        # 38bbd3 <_ZTSSt12bad_any_cast@@Base-0x45f5>
 15b17e9:	6a 04                	push   0x4
 15b17eb:	5f                   	pop    rdi
 15b17ec:	ba 86 02 00 00       	mov    edx,0x286
 15b17f1:	49 89 d8             	mov    r8,rbx
 15b17f4:	49 89 c1             	mov    r9,rax

## rank 10: score=50 FDE=0xaa1418..0xaa6ad6 features=stride8,begin-end,+10,+18,+20,sret=20
### +0x28 call 0xaa4f8b
  aa4f22:	48 8d 35 0c de 8c ff 	lea    rsi,[rip+0xffffffffff8cde0c]        # 372d35 <_ZTSSt12bad_any_cast@@Base-0x1d493>
  aa4f29:	48 8d 0d 54 c7 89 ff 	lea    rcx,[rip+0xffffffffff89c754]        # 341684 <_ZTSSt12bad_any_cast@@Base-0x4eb44>
  aa4f30:	6a 04                	push   0x4
  aa4f32:	5f                   	pop    rdi
  aa4f33:	6a 4b                	push   0x4b
  aa4f35:	5a                   	pop    rdx
  aa4f36:	31 c0                	xor    eax,eax
  aa4f38:	e8 95 19 d3 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
  aa4f3d:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
  aa4f44:	00 
  aa4f45:	e8 e6 1d 00 00       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  aa4f4a:	48 8b 5d 00          	mov    rbx,QWORD PTR [rbp+0x0]
  aa4f4e:	48 8d 35 3c 81 ff ff 	lea    rsi,[rip+0xffffffffffff813c]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
  aa4f55:	48 8d 0d d2 6c 01 00 	lea    rcx,[rip+0x16cd2]        # abbc2e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bce>
  aa4f5c:	4c 8d b4 24 10 08 00 	lea    r14,[rsp+0x810]
  aa4f63:	00 
  aa4f64:	4c 8d 84 24 70 02 00 	lea    r8,[rsp+0x270]
  aa4f6b:	00 
  aa4f6c:	6a 01                	push   0x1
  aa4f6e:	41 59                	pop    r9
  aa4f70:	4c 89 f7             	mov    rdi,r14
  aa4f73:	31 d2                	xor    edx,edx
  aa4f75:	e8 1a 58 d3 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  aa4f7a:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  aa4f7d:	48 8d bc 24 70 21 00 	lea    rdi,[rsp+0x2170]
  aa4f84:	00 
  aa4f85:	48 89 de             	mov    rsi,rbx
  aa4f88:	4c 89 f2             	mov    rdx,r14
  aa4f8b:	ff 50 28             	call   QWORD PTR [rax+0x28]
  aa4f8e:	48 8d 9d 20 02 00 00 	lea    rbx,[rbp+0x220]
  aa4f95:	48 8d b4 24 70 21 00 	lea    rsi,[rsp+0x2170]
  aa4f9c:	00 
  aa4f9d:	48 89 df             	mov    rdi,rbx
  aa4fa0:	e8 b5 6c 01 00       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>
  aa4fa5:	4c 8d ac 24 70 21 00 	lea    r13,[rsp+0x2170]
  aa4fac:	00 
  aa4fad:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  aa4fb1:	e8 d0 94 ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  aa4fb6:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
  aa4fbd:	00 
  aa4fbe:	e8 25 58 d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  aa4fc3:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
  aa4fc7:	48 8d 35 5a 95 89 ff 	lea    rsi,[rip+0xffffffffff89955a]        # 33e528 <_ZTSSt12bad_any_cast@@Base-0x51ca0>
  aa4fce:	4c 89 ef             	mov    rdi,r13
  aa4fd1:	e8 a8 4a fd ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  aa4fd6:	4c 8d 84 24 a8 02 00 	lea    r8,[rsp+0x2a8]
  aa4fdd:	00 
  aa4fde:	49 89 28             	mov    QWORD PTR [r8],rbp
  aa4fe1:	48 8d 35 a9 80 ff ff 	lea    rsi,[rip+0xffffffffffff80a9]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
  aa4fe8:	48 8d 0d 35 6d 01 00 	lea    rcx,[rip+0x16d35]        # abbd24 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8cc4>
  aa4fef:	4c 8d ac 24 10 08 00 	lea    r13,[rsp+0x810]
  aa4ff6:	00 
  aa4ff7:	6a 08                	push   0x8
  aa4ff9:	41 59                	pop    r9
  aa4ffb:	4c 89 ef             	mov    rdi,r13
  aa4ffe:	31 d2                	xor    edx,edx
  aa5000:	e8 8f 57 d3 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  aa5005:	49 8b 06             	mov    rax,QWORD PTR [r14]
  aa5008:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
  aa500f:	00 
  aa5010:	48 8d 94 24 70 21 00 	lea    rdx,[rsp+0x2170]
  aa5017:	00 
  aa5018:	6a 01                	push   0x1
### +0x28 call 0xaa4339
  aa42bc:	48 89 c3             	mov    rbx,rax
  aa42bf:	48 83 a4 24 00 02 00 	and    QWORD PTR [rsp+0x200],0x0
  aa42c6:	00 00 
  aa42c8:	4c 89 b4 24 10 08 00 	mov    QWORD PTR [rsp+0x810],r14
  aa42cf:	00 
  aa42d0:	48 8d 05 8d 81 fd ff 	lea    rax,[rip+0xfffffffffffd818d]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
  aa42d7:	48 89 84 24 20 08 00 	mov    QWORD PTR [rsp+0x820],rax
  aa42de:	00 
  aa42df:	48 8d 05 c0 81 70 00 	lea    rax,[rip+0x7081c0]        # 11ac4a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3738bc>
  aa42e6:	48 89 84 24 28 08 00 	mov    QWORD PTR [rsp+0x828],rax
  aa42ed:	00 
  aa42ee:	4c 89 b4 24 70 21 00 	mov    QWORD PTR [rsp+0x2170],r14
  aa42f5:	00 
  aa42f6:	48 8d 05 67 81 fd ff 	lea    rax,[rip+0xfffffffffffd8167]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
  aa42fd:	48 89 84 24 80 21 00 	mov    QWORD PTR [rsp+0x2180],rax
  aa4304:	00 
  aa4305:	48 8d 05 ee 81 70 00 	lea    rax,[rip+0x7081ee]        # 11ac4fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x373910>
  aa430c:	48 89 84 24 88 21 00 	mov    QWORD PTR [rsp+0x2188],rax
  aa4313:	00 
  aa4314:	48 8d 05 7d 5b db 00 	lea    rax,[rip+0xdb5b7d]        # 1859e98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x16580>
  aa431b:	48 89 03             	mov    QWORD PTR [rbx],rax
  aa431e:	4c 89 63 08          	mov    QWORD PTR [rbx+0x8],r12
  aa4322:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
  aa4327:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
  aa432b:	4c 89 73 18          	mov    QWORD PTR [rbx+0x18],r14
  aa432f:	4c 89 7b 20          	mov    QWORD PTR [rbx+0x20],r15
  aa4333:	49 8b 07             	mov    rax,QWORD PTR [r15]
  aa4336:	4c 89 ff             	mov    rdi,r15
  aa4339:	ff 50 28             	call   QWORD PTR [rax+0x28]
  aa433c:	49 89 c6             	mov    r14,rax
  aa433f:	48 8d 35 dd c8 8d ff 	lea    rsi,[rip+0xffffffffff8dc8dd]        # 380c23 <_ZTSSt12bad_any_cast@@Base-0xf5a5>
  aa4346:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
  aa434d:	00 
  aa434e:	e8 2b 57 fd ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  aa4353:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
  aa4357:	4c 8d bc 24 90 02 00 	lea    r15,[rsp+0x290]
  aa435e:	00 
  aa435f:	4c 89 f6             	mov    rsi,r14
  aa4362:	4c 89 fa             	mov    rdx,r15
  aa4365:	e8 b0 d3 d1 00       	call   17c171a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175886>
  aa436a:	4c 89 ff             	mov    rdi,r15
  aa436d:	e8 1e 9b d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa4372:	48 83 63 38 00       	and    QWORD PTR [rbx+0x38],0x0
  aa4377:	48 83 63 48 00       	and    QWORD PTR [rbx+0x48],0x0
  aa437c:	48 8b 84 24 20 08 00 	mov    rax,QWORD PTR [rsp+0x820]
  aa4383:	00 
  aa4384:	48 85 c0             	test   rax,rax
  aa4387:	74 2a                	je     aa43b3 <JNI_OnUnload@@Base+0x2bc80>
  aa4389:	48 8d 73 38          	lea    rsi,[rbx+0x38]
  aa438d:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
  aa4391:	6a 01                	push   0x1
  aa4393:	5f                   	pop    rdi
  aa4394:	48 8d 94 24 10 08 00 	lea    rdx,[rsp+0x810]
  aa439b:	00 
  aa439c:	ff d0                	call   rax
  aa439e:	48 8b 84 24 28 08 00 	mov    rax,QWORD PTR [rsp+0x828]
  aa43a5:	00 
  aa43a6:	48 89 43 50          	mov    QWORD PTR [rbx+0x50],rax
  aa43aa:	48 83 a4 24 20 08 00 	and    QWORD PTR [rsp+0x820],0x0
  aa43b1:	00 00 
  aa43b3:	48 83 63 58 00       	and    QWORD PTR [rbx+0x58],0x0
  aa43b8:	48 83 63 68 00       	and    QWORD PTR [rbx+0x68],0x0
  aa43bd:	48 8b 84 24 80 21 00 	mov    rax,QWORD PTR [rsp+0x2180]
### +0x28 call 0xaa56fc
  aa5689:	00 00 
  aa568b:	66 49 0f 3a 16 c7 01 	pextrq r15,xmm0,0x1
  aa5692:	4c 89 ff             	mov    rdi,r15
  aa5695:	e8 ec 8d ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  aa569a:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
  aa569d:	48 83 23 00          	and    QWORD PTR [rbx],0x0
  aa56a1:	48 8b bc 24 18 01 00 	mov    rdi,QWORD PTR [rsp+0x118]
  aa56a8:	00 
  aa56a9:	e8 e2 f3 00 00       	call   ab4a90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a30>
  aa56ae:	48 89 df             	mov    rdi,rbx
  aa56b1:	e8 78 f4 00 00       	call   ab4b2e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ace>
  aa56b6:	48 8d bc 24 b0 07 00 	lea    rdi,[rsp+0x7b0]
  aa56bd:	00 
  aa56be:	e8 a7 48 fd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  aa56c3:	4c 89 f7             	mov    rdi,r14
  aa56c6:	e8 bb 8d ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  aa56cb:	31 ff                	xor    edi,edi
  aa56cd:	e8 b4 8d ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  aa56d2:	48 8d bc 24 c8 01 00 	lea    rdi,[rsp+0x1c8]
  aa56d9:	00 
  aa56da:	e8 ff 14 00 00       	call   aa6bde <JNI_OnUnload@@Base+0x2e4ab>
  aa56df:	4c 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],r15
  aa56e4:	4c 89 ff             	mov    rdi,r15
  aa56e7:	e8 9a 8d ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  aa56ec:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  aa56f1:	e8 08 15 00 00       	call   aa6bfe <JNI_OnUnload@@Base+0x2e4cb>
  aa56f6:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  aa56f9:	48 89 c7             	mov    rdi,rax
  aa56fc:	ff 51 28             	call   QWORD PTR [rcx+0x28]
  aa56ff:	48 89 c3             	mov    rbx,rax
  aa5702:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  aa5707:	e8 08 15 00 00       	call   aa6c14 <JNI_OnUnload@@Base+0x2e4e1>
  aa570c:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  aa570f:	48 89 c7             	mov    rdi,rax
  aa5712:	ff 51 38             	call   QWORD PTR [rcx+0x38]
  aa5715:	49 89 c7             	mov    r15,rax
  aa5718:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  aa571d:	e8 08 15 00 00       	call   aa6c2a <JNI_OnUnload@@Base+0x2e4f7>
  aa5722:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  aa5725:	48 89 c7             	mov    rdi,rax
  aa5728:	ff 51 30             	call   QWORD PTR [rcx+0x30]
  aa572b:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
  aa5732:	00 
  aa5733:	48 89 c6             	mov    rsi,rax
  aa5736:	e8 55 4b fd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  aa573b:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  aa573f:	4c 8b 60 08          	mov    r12,QWORD PTR [rax+0x8]
  aa5743:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  aa5748:	e8 f5 14 00 00       	call   aa6c42 <JNI_OnUnload@@Base+0x2e50f>
  aa574d:	49 89 c6             	mov    r14,rax
  aa5750:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
  aa5754:	e8 f3 35 00 00       	call   aa8d4c <JNI_OnUnload@@Base+0x30619>
  aa5759:	41 89 c4             	mov    r12d,eax
  aa575c:	6a 60                	push   0x60
  aa575e:	5f                   	pop    rdi
  aa575f:	e8 9c 87 d4 00       	call   17edf00 <_Znwm@plt>
  aa5764:	49 89 c5             	mov    r13,rax
  aa5767:	49 83 c6 10          	add    r14,0x10
  aa576b:	48 8d ac 24 30 10 00 	lea    rbp,[rsp+0x1030]
  aa5772:	00 
  aa5773:	48 8d b4 24 10 08 00 	lea    rsi,[rsp+0x810]
  aa577a:	00 
  aa577b:	48 89 ef             	mov    rdi,rbp
### +0x28 call 0xaa5991
  aa5925:	48 8d bc 24 30 10 00 	lea    rdi,[rsp+0x1030]
  aa592c:	00 
  aa592d:	e8 26 13 00 00       	call   aa6c58 <JNI_OnUnload@@Base+0x2e525>
  aa5932:	48 8b 84 24 30 10 00 	mov    rax,QWORD PTR [rsp+0x1030]
  aa5939:	00 
  aa593a:	48 83 a4 24 30 10 00 	and    QWORD PTR [rsp+0x1030],0x0
  aa5941:	00 00 
  aa5943:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
  aa5948:	48 8d 79 38          	lea    rdi,[rcx+0x38]
  aa594c:	48 8d 9c 24 90 02 00 	lea    rbx,[rsp+0x290]
  aa5953:	00 
  aa5954:	48 89 03             	mov    QWORD PTR [rbx],rax
  aa5957:	48 89 bc 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rdi
  aa595e:	00 
  aa595f:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
  aa5964:	48 89 da             	mov    rdx,rbx
  aa5967:	e8 12 50 a0 00       	call   14aa97e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2eff02>
  aa596c:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  aa596f:	48 83 23 00          	and    QWORD PTR [rbx],0x0
  aa5973:	48 85 ff             	test   rdi,rdi
  aa5976:	74 06                	je     aa597e <JNI_OnUnload@@Base+0x2d24b>
  aa5978:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  aa597b:	ff 50 08             	call   QWORD PTR [rax+0x8]
  aa597e:	48 8d bc 24 30 10 00 	lea    rdi,[rsp+0x1030]
  aa5985:	00 
  aa5986:	e8 3f 49 fd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  aa598b:	49 8b 06             	mov    rax,QWORD PTR [r14]
  aa598e:	4c 89 f7             	mov    rdi,r14
  aa5991:	ff 50 28             	call   QWORD PTR [rax+0x28]
  aa5994:	48 89 c3             	mov    rbx,rax
  aa5997:	6a 30                	push   0x30
  aa5999:	5f                   	pop    rdi
  aa599a:	e8 61 85 d4 00       	call   17edf00 <_Znwm@plt>
  aa599f:	49 89 c6             	mov    r14,rax
  aa59a2:	48 8d 35 48 de 87 ff 	lea    rsi,[rip+0xffffffffff87de48]        # 3237f1 <_ZTSSt12bad_any_cast@@Base-0x6c9d7>
  aa59a9:	48 89 c7             	mov    rdi,rax
  aa59ac:	e8 1f e2 b3 00       	call   15e3bd0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x429154>
  aa59b1:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
  aa59b6:	48 8d 78 40          	lea    rdi,[rax+0x40]
  aa59ba:	48 8d 05 7f 86 d5 00 	lea    rax,[rip+0xd5867f]        # 17fe040 <_ZTINSt6__ndk117bad_function_callE@@Base+0x10e0>
  aa59c1:	49 89 06             	mov    QWORD PTR [r14],rax
  aa59c4:	49 89 5e 20          	mov    QWORD PTR [r14+0x20],rbx
  aa59c8:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
  aa59cd:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
  aa59d1:	48 8d 9c 24 70 02 00 	lea    rbx,[rsp+0x270]
  aa59d8:	00 
  aa59d9:	4c 89 33             	mov    QWORD PTR [rbx],r14
  aa59dc:	48 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],rdi
  aa59e1:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
  aa59e6:	48 89 da             	mov    rdx,rbx
  aa59e9:	e8 90 4f a0 00       	call   14aa97e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2eff02>
  aa59ee:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  aa59f1:	48 83 23 00          	and    QWORD PTR [rbx],0x0
  aa59f5:	48 85 ff             	test   rdi,rdi
  aa59f8:	74 06                	je     aa5a00 <JNI_OnUnload@@Base+0x2d2cd>
  aa59fa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  aa59fd:	ff 50 08             	call   QWORD PTR [rax+0x8]
  aa5a00:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  aa5a05:	e8 f4 11 00 00       	call   aa6bfe <JNI_OnUnload@@Base+0x2e4cb>
  aa5a0a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  aa5a0d:	48 89 c7             	mov    rdi,rax
  aa5a10:	ff 51 28             	call   QWORD PTR [rcx+0x28]
  aa5a13:	49 89 c5             	mov    r13,rax

## rank 11: score=50 FDE=0xc42eec..0xc43b7d features=stride8,begin-end,+10,+18,+20,sret=20
### +0x28 call 0xc42f71
  c42f03:	49 89 fd             	mov    r13,rdi
  c42f06:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  c42f0d:	00 00 
  c42f0f:	48 89 84 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rax
  c42f16:	00 
  c42f17:	48 89 cf             	mov    rdi,rcx
  c42f1a:	e8 ab 03 f2 ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
  c42f1f:	48 89 c5             	mov    rbp,rax
  c42f22:	4c 89 f7             	mov    rdi,r14
  c42f25:	e8 4a 03 f2 ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
  c42f2a:	49 89 c6             	mov    r14,rax
  c42f2d:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
  c42f34:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
  c42f3b:	00 
  c42f3c:	4c 8b 7b 68          	mov    r15,QWORD PTR [rbx+0x68]
  c42f40:	48 8d 35 4a ee 6f ff 	lea    rsi,[rip+0xffffffffff6fee4a]        # 341d91 <_ZTSSt12bad_any_cast@@Base-0x4e437>
  c42f47:	4c 8d a4 24 b0 00 00 	lea    r12,[rsp+0xb0]
  c42f4e:	00 
  c42f4f:	4c 89 e7             	mov    rdi,r12
  c42f52:	e8 27 6b e3 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  c42f57:	49 8b 07             	mov    rax,QWORD PTR [r15]
  c42f5a:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
  c42f61:	00 
  c42f62:	4c 89 fe             	mov    rsi,r15
  c42f65:	4c 89 e2             	mov    rdx,r12
  c42f68:	ff 50 18             	call   QWORD PTR [rax+0x18]
  c42f6b:	49 8b 06             	mov    rax,QWORD PTR [r14]
  c42f6e:	4c 89 f7             	mov    rdi,r14
  c42f71:	ff 50 28             	call   QWORD PTR [rax+0x28]
  c42f74:	49 89 c4             	mov    r12,rax
  c42f77:	48 8b 43 60          	mov    rax,QWORD PTR [rbx+0x60]
  c42f7b:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
  c42f82:	00 
  c42f83:	4c 8b bb 90 00 00 00 	mov    r15,QWORD PTR [rbx+0x90]
  c42f8a:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
  c42f8e:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  c42f92:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
  c42f96:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  c42f9b:	bf 20 01 00 00       	mov    edi,0x120
  c42fa0:	e8 5b af ba 00       	call   17edf00 <_Znwm@plt>
  c42fa5:	48 89 c3             	mov    rbx,rax
  c42fa8:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
  c42fac:	48 8d 05 5d 55 bd 00 	lea    rax,[rip+0xbd555d]        # 1818510 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe1d0>
  c42fb3:	48 89 03             	mov    QWORD PTR [rbx],rax
  c42fb6:	48 8d 43 10          	lea    rax,[rbx+0x10]
  c42fba:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
  c42fbf:	48 8d 43 18          	lea    rax,[rbx+0x18]
  c42fc3:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  c42fc8:	48 8d 43 20          	lea    rax,[rbx+0x20]
  c42fcc:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  c42fd3:	00 
  c42fd4:	48 8d 43 28          	lea    rax,[rbx+0x28]
  c42fd8:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
  c42fdd:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
  c42fe1:	0f 57 c0             	xorps  xmm0,xmm0
  c42fe4:	0f 29 43 10          	movaps XMMWORD PTR [rbx+0x10],xmm0
  c42fe8:	0f 29 43 20          	movaps XMMWORD PTR [rbx+0x20],xmm0
  c42fec:	48 89 7c 24 58       	mov    QWORD PTR [rsp+0x58],rdi
  c42ff1:	e8 00 6a b9 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  c42ff6:	48 8d 43 40          	lea    rax,[rbx+0x40]
  c42ffa:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
  c42fff:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
  c43004:	48 8d 43 50          	lea    rax,[rbx+0x50]

## rank 12: score=50 FDE=0xc804b6..0xc819dc features=stride8,begin-end,+10,+18,+20,sret=20
### +0x28 call 0xc80542
  c804d2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  c804d9:	00 00 
  c804db:	48 89 84 24 80 04 00 	mov    QWORD PTR [rsp+0x480],rax
  c804e2:	00 
  c804e3:	48 8b 7a 38          	mov    rdi,QWORD PTR [rdx+0x38]
  c804e7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  c804ea:	ff 50 10             	call   QWORD PTR [rax+0x10]
  c804ed:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  c804f0:	48 89 c7             	mov    rdi,rax
  c804f3:	ff 51 28             	call   QWORD PTR [rcx+0x28]
  c804f6:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  c804fb:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
  c804ff:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  c80506:	00 
  c80507:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
  c8050e:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  c80513:	4c 8b 7b 38          	mov    r15,QWORD PTR [rbx+0x38]
  c80517:	4c 8d 25 4e 14 6b ff 	lea    r12,[rip+0xffffffffff6b144e]        # 33196c <_ZTSSt12bad_any_cast@@Base-0x5e85c>
  c8051e:	4c 8d ac 24 b0 00 00 	lea    r13,[rsp+0xb0]
  c80525:	00 
  c80526:	4c 89 ef             	mov    rdi,r13
  c80529:	4c 89 e6             	mov    rsi,r12
  c8052c:	e8 4d 95 df ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  c80531:	49 8b 07             	mov    rax,QWORD PTR [r15]
  c80534:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
  c8053b:	00 
  c8053c:	4c 89 fe             	mov    rsi,r15
  c8053f:	4c 89 ea             	mov    rdx,r13
  c80542:	ff 50 28             	call   QWORD PTR [rax+0x28]
  c80545:	4c 8b 7b 68          	mov    r15,QWORD PTR [rbx+0x68]
  c80549:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
  c80550:	00 
  c80551:	4c 89 e6             	mov    rsi,r12
  c80554:	e8 25 95 df ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  c80559:	49 8b 07             	mov    rax,QWORD PTR [r15]
  c8055c:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
  c80563:	00 
  c80564:	48 8d 94 24 88 00 00 	lea    rdx,[rsp+0x88]
  c8056b:	00 
  c8056c:	4c 89 fe             	mov    rsi,r15
  c8056f:	ff 50 18             	call   QWORD PTR [rax+0x18]
  c80572:	4c 89 f7             	mov    rdi,r14
  c80575:	e8 fa 2c ee ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
  c8057a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  c8057d:	48 89 c7             	mov    rdi,rax
  c80580:	ff 51 28             	call   QWORD PTR [rcx+0x28]
  c80583:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  c80588:	4c 8b 63 20          	mov    r12,QWORD PTR [rbx+0x20]
  c8058c:	48 8b 6b 30          	mov    rbp,QWORD PTR [rbx+0x30]
  c80590:	4c 8b 6b 60          	mov    r13,QWORD PTR [rbx+0x60]
  c80594:	bf d0 00 00 00       	mov    edi,0xd0
  c80599:	e8 62 d9 b6 00       	call   17edf00 <_Znwm@plt>
  c8059e:	48 89 c3             	mov    rbx,rax
  c805a1:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
  c805a5:	48 8d 05 2c b7 b9 00 	lea    rax,[rip+0xb9b72c]        # 181bcd8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11998>
  c805ac:	48 89 03             	mov    QWORD PTR [rbx],rax
  c805af:	48 8d 43 10          	lea    rax,[rbx+0x10]
  c805b3:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
  c805b8:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
  c805bd:	48 8d 43 20          	lea    rax,[rbx+0x20]
  c805c1:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
  c805c6:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
  c805cb:	48 8d 43 50          	lea    rax,[rbx+0x50]
### +0x28 call 0xc804f3
  c804b6:	55                   	push   rbp
  c804b7:	41 57                	push   r15
  c804b9:	41 56                	push   r14
  c804bb:	41 55                	push   r13
  c804bd:	41 54                	push   r12
  c804bf:	53                   	push   rbx
  c804c0:	48 81 ec 88 04 00 00 	sub    rsp,0x488
  c804c7:	49 89 ce             	mov    r14,rcx
  c804ca:	48 89 d3             	mov    rbx,rdx
  c804cd:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
  c804d2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  c804d9:	00 00 
  c804db:	48 89 84 24 80 04 00 	mov    QWORD PTR [rsp+0x480],rax
  c804e2:	00 
  c804e3:	48 8b 7a 38          	mov    rdi,QWORD PTR [rdx+0x38]
  c804e7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  c804ea:	ff 50 10             	call   QWORD PTR [rax+0x10]
  c804ed:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  c804f0:	48 89 c7             	mov    rdi,rax
  c804f3:	ff 51 28             	call   QWORD PTR [rcx+0x28]
  c804f6:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  c804fb:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
  c804ff:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  c80506:	00 
  c80507:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
  c8050e:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  c80513:	4c 8b 7b 38          	mov    r15,QWORD PTR [rbx+0x38]
  c80517:	4c 8d 25 4e 14 6b ff 	lea    r12,[rip+0xffffffffff6b144e]        # 33196c <_ZTSSt12bad_any_cast@@Base-0x5e85c>
  c8051e:	4c 8d ac 24 b0 00 00 	lea    r13,[rsp+0xb0]
  c80525:	00 
  c80526:	4c 89 ef             	mov    rdi,r13
  c80529:	4c 89 e6             	mov    rsi,r12
  c8052c:	e8 4d 95 df ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  c80531:	49 8b 07             	mov    rax,QWORD PTR [r15]
  c80534:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
  c8053b:	00 
  c8053c:	4c 89 fe             	mov    rsi,r15
  c8053f:	4c 89 ea             	mov    rdx,r13
  c80542:	ff 50 28             	call   QWORD PTR [rax+0x28]
  c80545:	4c 8b 7b 68          	mov    r15,QWORD PTR [rbx+0x68]
  c80549:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
  c80550:	00 
  c80551:	4c 89 e6             	mov    rsi,r12
  c80554:	e8 25 95 df ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  c80559:	49 8b 07             	mov    rax,QWORD PTR [r15]
  c8055c:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
  c80563:	00 
  c80564:	48 8d 94 24 88 00 00 	lea    rdx,[rsp+0x88]
  c8056b:	00 
  c8056c:	4c 89 fe             	mov    rsi,r15
  c8056f:	ff 50 18             	call   QWORD PTR [rax+0x18]
  c80572:	4c 89 f7             	mov    rdi,r14
  c80575:	e8 fa 2c ee ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
  c8057a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
### +0x28 call 0xc80580
  c80517:	4c 8d 25 4e 14 6b ff 	lea    r12,[rip+0xffffffffff6b144e]        # 33196c <_ZTSSt12bad_any_cast@@Base-0x5e85c>
  c8051e:	4c 8d ac 24 b0 00 00 	lea    r13,[rsp+0xb0]
  c80525:	00 
  c80526:	4c 89 ef             	mov    rdi,r13
  c80529:	4c 89 e6             	mov    rsi,r12
  c8052c:	e8 4d 95 df ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  c80531:	49 8b 07             	mov    rax,QWORD PTR [r15]
  c80534:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
  c8053b:	00 
  c8053c:	4c 89 fe             	mov    rsi,r15
  c8053f:	4c 89 ea             	mov    rdx,r13
  c80542:	ff 50 28             	call   QWORD PTR [rax+0x28]
  c80545:	4c 8b 7b 68          	mov    r15,QWORD PTR [rbx+0x68]
  c80549:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
  c80550:	00 
  c80551:	4c 89 e6             	mov    rsi,r12
  c80554:	e8 25 95 df ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  c80559:	49 8b 07             	mov    rax,QWORD PTR [r15]
  c8055c:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
  c80563:	00 
  c80564:	48 8d 94 24 88 00 00 	lea    rdx,[rsp+0x88]
  c8056b:	00 
  c8056c:	4c 89 fe             	mov    rsi,r15
  c8056f:	ff 50 18             	call   QWORD PTR [rax+0x18]
  c80572:	4c 89 f7             	mov    rdi,r14
  c80575:	e8 fa 2c ee ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
  c8057a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  c8057d:	48 89 c7             	mov    rdi,rax
  c80580:	ff 51 28             	call   QWORD PTR [rcx+0x28]
  c80583:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  c80588:	4c 8b 63 20          	mov    r12,QWORD PTR [rbx+0x20]
  c8058c:	48 8b 6b 30          	mov    rbp,QWORD PTR [rbx+0x30]
  c80590:	4c 8b 6b 60          	mov    r13,QWORD PTR [rbx+0x60]
  c80594:	bf d0 00 00 00       	mov    edi,0xd0
  c80599:	e8 62 d9 b6 00       	call   17edf00 <_Znwm@plt>
  c8059e:	48 89 c3             	mov    rbx,rax
  c805a1:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
  c805a5:	48 8d 05 2c b7 b9 00 	lea    rax,[rip+0xb9b72c]        # 181bcd8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11998>
  c805ac:	48 89 03             	mov    QWORD PTR [rbx],rax
  c805af:	48 8d 43 10          	lea    rax,[rbx+0x10]
  c805b3:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
  c805b8:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
  c805bd:	48 8d 43 20          	lea    rax,[rbx+0x20]
  c805c1:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
  c805c6:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
  c805cb:	48 8d 43 50          	lea    rax,[rbx+0x50]
  c805cf:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
  c805d4:	48 83 63 70 00       	and    QWORD PTR [rbx+0x70],0x0
  c805d9:	48 8d 83 80 00 00 00 	lea    rax,[rbx+0x80]
  c805e0:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
  c805e5:	48 83 a3 a0 00 00 00 	and    QWORD PTR [rbx+0xa0],0x0
  c805ec:	00 
  c805ed:	48 8d 83 b0 00 00 00 	lea    rax,[rbx+0xb0]
  c805f4:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
  c805f9:	48 89 d8             	mov    rax,rbx
  c805fc:	48 05 b8 00 00 00    	add    rax,0xb8
  c80602:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
  c80607:	66 0f 57 c0          	xorpd  xmm0,xmm0
  c8060b:	66 0f 29 83 b0 00 00 	movapd XMMWORD PTR [rbx+0xb0],xmm0
  c80612:	00 
  c80613:	48 83 a3 c0 00 00 00 	and    QWORD PTR [rbx+0xc0],0x0
  c8061a:	00 
  c8061b:	48 8d 3d be 9a d5 00 	lea    rdi,[rip+0xd59abe]        # 19da0e0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0xa2d28>
### +0x28 call 0xc80b12
  c80aa1:	48 8d 94 24 80 03 00 	lea    rdx,[rsp+0x380]
  c80aa8:	00 
  c80aa9:	48 89 94 24 a0 03 00 	mov    QWORD PTR [rsp+0x3a0],rdx
  c80ab0:	00 
  c80ab1:	48 8d b4 24 90 02 00 	lea    rsi,[rsp+0x290]
  c80ab8:	00 
  c80ab9:	4c 89 f7             	mov    rdi,r14
  c80abc:	e8 63 1e 99 00       	call   1612924 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda92>
  c80ac1:	4c 8d bc 24 d0 01 00 	lea    r15,[rsp+0x1d0]
  c80ac8:	00 
  c80ac9:	49 83 27 00          	and    QWORD PTR [r15],0x0
  c80acd:	4c 8b 64 24 68       	mov    r12,QWORD PTR [rsp+0x68]
  c80ad2:	4c 89 e7             	mov    rdi,r12
  c80ad5:	4c 89 f6             	mov    rsi,r14
  c80ad8:	e8 ff 0e 00 00       	call   c819dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ce97c>
  c80add:	4c 89 ff             	mov    rdi,r15
  c80ae0:	e8 21 0f 00 00       	call   c81a06 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ce9a6>
  c80ae5:	48 8d bc 24 80 03 00 	lea    rdi,[rsp+0x380]
  c80aec:	00 
  c80aed:	e8 78 94 df ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  c80af2:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
  c80af9:	00 
  c80afa:	e8 91 d3 b6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  c80aff:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c80b03:	e8 06 0f 00 00       	call   c81a0e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ce9ae>
  c80b08:	41 89 c6             	mov    r14d,eax
  c80b0b:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
  c80b0f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  c80b12:	ff 50 28             	call   QWORD PTR [rax+0x28]
  c80b15:	49 89 c5             	mov    r13,rax
  c80b18:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c80b1c:	e8 0b 0f 00 00       	call   c81a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ce9cc>
  c80b21:	41 89 c7             	mov    r15d,eax
  c80b24:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c80b28:	48 8d 35 91 b8 74 ff 	lea    rsi,[rip+0xffffffffff74b891]        # 3cc3c0 <_ZTSN5boost9exceptionE@@Base+0x2cda2>
  c80b2f:	48 8d 0d aa b8 74 ff 	lea    rcx,[rip+0xffffffffff74b8aa]        # 3cc3e0 <_ZTSN5boost9exceptionE@@Base+0x2cdc2>
  c80b36:	6a 15                	push   0x15
  c80b38:	5a                   	pop    rdx
  c80b39:	6a 2d                	push   0x2d
  c80b3b:	41 58                	pop    r8
  c80b3d:	45 31 c9             	xor    r9d,r9d
  c80b40:	e8 45 68 96 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  c80b45:	88 44 24 28          	mov    BYTE PTR [rsp+0x28],al
  c80b49:	48 8b b4 24 c8 00 00 	mov    rsi,QWORD PTR [rsp+0xc8]
  c80b50:	00 
  c80b51:	4c 8d a4 24 90 02 00 	lea    r12,[rsp+0x290]
  c80b58:	00 
  c80b59:	4c 89 e7             	mov    rdi,r12
  c80b5c:	e8 45 8d 96 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
  c80b61:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
  c80b66:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
  c80b6b:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
  c80b70:	4d 89 6c 24 18       	mov    QWORD PTR [r12+0x18],r13
  c80b75:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
  c80b7a:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
  c80b7f:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
  c80b84:	49 89 44 24 28       	mov    QWORD PTR [r12+0x28],rax
  c80b89:	4c 8b 6c 24 78       	mov    r13,QWORD PTR [rsp+0x78]
  c80b8e:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
  c80b92:	66 41 0f 10 45 00    	movupd xmm0,XMMWORD PTR [r13+0x0]
  c80b98:	66 41 0f 11 44 24 30 	movupd XMMWORD PTR [r12+0x30],xmm0
  c80b9f:	48 85 c0             	test   rax,rax
  c80ba2:	74 05                	je     c80ba9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cdb49>

## rank 13: score=50 FDE=0xcb7a20..0xcbc937 features=stride8,begin-end,+10,+18,+20,sret=20
### +0x28 call 0xcbb7d5
  cbb760:	48 8b 9b b8 00 00 00 	mov    rbx,QWORD PTR [rbx+0xb8]
  cbb767:	48 8b 84 24 20 0a 00 	mov    rax,QWORD PTR [rsp+0xa20]
  cbb76e:	00 
  cbb76f:	48 89 84 24 10 08 00 	mov    QWORD PTR [rsp+0x810],rax
  cbb776:	00 
  cbb777:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
  cbb77c:	0f 11 84 24 18 08 00 	movups XMMWORD PTR [rsp+0x818],xmm0
  cbb783:	00 
  cbb784:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
  cbb789:	48 85 c0             	test   rax,rax
  cbb78c:	74 05                	je     cbb793 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x208733>
  cbb78e:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
  cbb793:	48 8d 35 d2 53 e8 ff 	lea    rsi,[rip+0xffffffffffe853d2]        # b40b6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8db0c>
  cbb79a:	48 8d 15 3b f7 de ff 	lea    rdx,[rip+0xffffffffffdef73b]        # aaaedc <JNI_OnUnload@@Base+0x327a9>
  cbb7a1:	48 8d 0d 52 2c 00 00 	lea    rcx,[rip+0x2c52]        # cbe3fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20b39a>
  cbb7a8:	4c 8d b4 24 d0 04 00 	lea    r14,[rsp+0x4d0]
  cbb7af:	00 
  cbb7b0:	4c 8d 84 24 10 08 00 	lea    r8,[rsp+0x810]
  cbb7b7:	00 
  cbb7b8:	6a 18                	push   0x18
  cbb7ba:	41 59                	pop    r9
  cbb7bc:	4c 89 f7             	mov    rdi,r14
  cbb7bf:	e8 d0 ef b1 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  cbb7c4:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  cbb7c7:	48 8d bc 24 80 07 00 	lea    rdi,[rsp+0x780]
  cbb7ce:	00 
  cbb7cf:	48 89 de             	mov    rsi,rbx
  cbb7d2:	4c 89 f2             	mov    rdx,r14
  cbb7d5:	ff 50 28             	call   QWORD PTR [rax+0x28]
  cbb7d8:	48 8d 9c 24 80 07 00 	lea    rbx,[rsp+0x780]
  cbb7df:	00 
  cbb7e0:	48 8b bc 24 b0 01 00 	mov    rdi,QWORD PTR [rsp+0x1b0]
  cbb7e7:	00 
  cbb7e8:	48 89 de             	mov    rsi,rbx
  cbb7eb:	e8 02 e4 b1 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
  cbb7f0:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  cbb7f4:	e8 8d 2c de ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  cbb7f9:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
  cbb800:	00 
  cbb801:	e8 e2 ef b1 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  cbb806:	48 8b bc 24 20 08 00 	mov    rdi,QWORD PTR [rsp+0x820]
  cbb80d:	00 
  cbb80e:	e8 9f 2c de ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  cbb813:	49 8b 1f             	mov    rbx,QWORD PTR [r15]
  cbb816:	48 8b 84 24 20 0a 00 	mov    rax,QWORD PTR [rsp+0xa20]
  cbb81d:	00 
  cbb81e:	48 89 84 24 10 08 00 	mov    QWORD PTR [rsp+0x810],rax
  cbb825:	00 
  cbb826:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
  cbb82b:	0f 11 84 24 18 08 00 	movups XMMWORD PTR [rsp+0x818],xmm0
  cbb832:	00 
  cbb833:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
  cbb838:	48 85 c0             	test   rax,rax
  cbb83b:	74 05                	je     cbb842 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2087e2>
  cbb83d:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
  cbb842:	48 8d 35 23 53 e8 ff 	lea    rsi,[rip+0xffffffffffe85323]        # b40b6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8db0c>
  cbb849:	48 8d 15 8c f6 de ff 	lea    rdx,[rip+0xffffffffffdef68c]        # aaaedc <JNI_OnUnload@@Base+0x327a9>
  cbb850:	48 8d 0d 37 2c 00 00 	lea    rcx,[rip+0x2c37]        # cbe48e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20b42e>
  cbb857:	4c 8d b4 24 d0 04 00 	lea    r14,[rsp+0x4d0]
  cbb85e:	00 
  cbb85f:	4c 8d 84 24 10 08 00 	lea    r8,[rsp+0x810]
  cbb866:	00 
  cbb867:	6a 18                	push   0x18
### +0x28 call 0xcb8116
  cb80a4:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
  cb80ab:	00 
  cb80ac:	e8 cd 19 dc ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  cb80b1:	48 8d 94 24 d0 04 00 	lea    rdx,[rsp+0x4d0]
  cb80b8:	00 
  cb80b9:	48 83 62 20 00       	and    QWORD PTR [rdx+0x20],0x0
  cb80be:	48 8d b4 24 10 08 00 	lea    rsi,[rsp+0x810]
  cb80c5:	00 
  cb80c6:	48 89 df             	mov    rdi,rbx
  cb80c9:	e8 56 a8 95 00       	call   1612924 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda92>
  cb80ce:	4c 8d b4 24 80 07 00 	lea    r14,[rsp+0x780]
  cb80d5:	00 
  cb80d6:	49 83 26 00          	and    QWORD PTR [r14],0x0
  cb80da:	4c 8d ac 24 18 02 00 	lea    r13,[rsp+0x218]
  cb80e1:	00 
  cb80e2:	4c 89 ef             	mov    rdi,r13
  cb80e5:	48 89 de             	mov    rsi,rbx
  cb80e8:	e8 f3 48 00 00       	call   cbc9e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x209980>
  cb80ed:	4c 89 f7             	mov    rdi,r14
  cb80f0:	e8 15 49 00 00       	call   cbca0a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2099aa>
  cb80f5:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
  cb80fc:	00 
  cb80fd:	e8 68 1e dc ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  cb8102:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
  cb8109:	00 
  cb810a:	e8 81 5d b3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  cb810f:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  cb8113:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  cb8116:	ff 50 28             	call   QWORD PTR [rax+0x28]
  cb8119:	49 89 c6             	mov    r14,rax
  cb811c:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]
  cb8123:	00 
  cb8124:	4c 89 e6             	mov    rsi,r12
  cb8127:	e8 ba 63 85 00       	call   150e4e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x353a6a>
  cb812c:	6a 01                	push   0x1
  cb812e:	5f                   	pop    rdi
  cb812f:	e8 cc 5d b3 00       	call   17edf00 <_Znwm@plt>
  cb8134:	c6 00 00             	mov    BYTE PTR [rax],0x0
  cb8137:	48 8d 9c 24 d0 04 00 	lea    rbx,[rsp+0x4d0]
  cb813e:	00 
  cb813f:	48 83 23 00          	and    QWORD PTR [rbx],0x0
  cb8143:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
  cb814a:	00 
  cb814b:	48 89 c6             	mov    rsi,rax
  cb814e:	e8 43 76 de ff       	call   a9f796 <JNI_OnUnload@@Base+0x27063>
  cb8153:	48 89 df             	mov    rdi,rbx
  cb8156:	e8 0b 4c df ff       	call   aacd66 <JNI_OnUnload@@Base+0x34633>
  cb815b:	bf c0 00 00 00       	mov    edi,0xc0
  cb8160:	e8 9b 5d b3 00       	call   17edf00 <_Znwm@plt>
  cb8165:	48 89 c3             	mov    rbx,rax
  cb8168:	4c 89 b4 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r14
  cb816f:	00 
  cb8170:	0f 57 c0             	xorps  xmm0,xmm0
  cb8173:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  cb8177:	48 8d 05 d2 71 b6 00 	lea    rax,[rip+0xb671d2]        # 181f350 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x15010>
  cb817e:	48 89 03             	mov    QWORD PTR [rbx],rax
  cb8181:	48 8d 05 88 85 b6 00 	lea    rax,[rip+0xb68588]        # 1820710 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x163d0>
  cb8188:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  cb818c:	48 8b 84 24 38 0a 00 	mov    rax,QWORD PTR [rsp+0xa38]
  cb8193:	00 
  cb8194:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
  cb8198:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0
  cb819c:	0f 11 43 38          	movups XMMWORD PTR [rbx+0x38],xmm0
### +0x28 call 0xcb850b
  cb849c:	6a 00                	push   0x0
  cb849e:	e8 4f f1 92 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  cb84a3:	48 83 c4 10          	add    rsp,0x10
  cb84a7:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  cb84ab:	4c 8d 35 3e 50 71 ff 	lea    r14,[rip+0xffffffffff71503e]        # 3cd4f0 <_ZTSN5boost9exceptionE@@Base+0x2ded2>
  cb84b2:	4c 8d 3d 57 50 71 ff 	lea    r15,[rip+0xffffffffff715057]        # 3cd510 <_ZTSN5boost9exceptionE@@Base+0x2def2>
  cb84b9:	6a 17                	push   0x17
  cb84bb:	41 5c                	pop    r12
  cb84bd:	4c 89 f6             	mov    rsi,r14
  cb84c0:	48 89 da             	mov    rdx,rbx
  cb84c3:	4c 89 f9             	mov    rcx,r15
  cb84c6:	4d 89 e0             	mov    r8,r12
  cb84c9:	41 b9 d0 07 00 00    	mov    r9d,0x7d0
  cb84cf:	e8 56 ef 92 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  cb84d4:	41 89 c5             	mov    r13d,eax
  cb84d7:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  cb84db:	4c 89 f6             	mov    rsi,r14
  cb84de:	48 89 da             	mov    rdx,rbx
  cb84e1:	4c 89 f9             	mov    rcx,r15
  cb84e4:	4d 89 e0             	mov    r8,r12
  cb84e7:	41 b9 d0 07 00 00    	mov    r9d,0x7d0
  cb84ed:	68 10 27 00 00       	push   0x2710
  cb84f2:	68 d0 07 00 00       	push   0x7d0
  cb84f7:	e8 f6 f0 92 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  cb84fc:	48 83 c4 10          	add    rsp,0x10
  cb8500:	48 8b bc 24 e8 09 00 	mov    rdi,QWORD PTR [rsp+0x9e8]
  cb8507:	00 
  cb8508:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  cb850b:	ff 50 28             	call   QWORD PTR [rax+0x28]
  cb850e:	48 89 c3             	mov    rbx,rax
  cb8511:	48 8b 75 00          	mov    rsi,QWORD PTR [rbp+0x0]
  cb8515:	48 8d 15 14 50 71 ff 	lea    rdx,[rip+0xffffffffff715014]        # 3cd530 <_ZTSN5boost9exceptionE@@Base+0x2df12>
  cb851c:	4c 8d 05 2d 50 71 ff 	lea    r8,[rip+0xffffffffff71502d]        # 3cd550 <_ZTSN5boost9exceptionE@@Base+0x2df32>
  cb8523:	4c 8d b4 24 d0 04 00 	lea    r14,[rsp+0x4d0]
  cb852a:	00 
  cb852b:	6a 1f                	push   0x1f
  cb852d:	59                   	pop    rcx
  cb852e:	6a 20                	push   0x20
  cb8530:	41 59                	pop    r9
  cb8532:	4c 89 f7             	mov    rdi,r14
  cb8535:	e8 8e ef 92 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  cb853a:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
  cb853f:	74 32                	je     cb8573 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x205513>
  cb8541:	48 8d 35 b5 a7 68 ff 	lea    rsi,[rip+0xffffffffff68a7b5]        # 342cfd <_ZTSSt12bad_any_cast@@Base-0x4d4cb>
  cb8548:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
  cb854f:	00 
  cb8550:	e8 fa 32 dc ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  cb8555:	b1 02                	mov    cl,0x2
  cb8557:	84 c0                	test   al,al
  cb8559:	75 32                	jne    cb858d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20552d>
  cb855b:	48 8d 35 1e 50 71 ff 	lea    rsi,[rip+0xffffffffff71501e]        # 3cd580 <_ZTSN5boost9exceptionE@@Base+0x2df62>
  cb8562:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
  cb8569:	00 
  cb856a:	e8 e0 32 dc ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  cb856f:	84 c0                	test   al,al
  cb8571:	74 04                	je     cb8577 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x205517>
  cb8573:	31 c9                	xor    ecx,ecx
  cb8575:	eb 16                	jmp    cb858d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20552d>
  cb8577:	48 8d 35 e5 f1 6b ff 	lea    rsi,[rip+0xffffffffff6bf1e5]        # 377763 <_ZTSSt12bad_any_cast@@Base-0x18a65>
  cb857e:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
  cb8585:	00 
  cb8586:	e8 c4 32 dc ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  cb858b:	89 c1                	mov    ecx,eax
### +0x28 call 0xcb9255
  cb91e8:	41 5f                	pop    r15
  cb91ea:	48 89 da             	mov    rdx,rbx
  cb91ed:	4d 89 e8             	mov    r8,r13
  cb91f0:	45 89 f9             	mov    r9d,r15d
  cb91f3:	e8 92 e1 92 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  cb91f8:	89 c5                	mov    ebp,eax
  cb91fa:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
  cb91fd:	48 8d 35 fc 48 71 ff 	lea    rsi,[rip+0xffffffffff7148fc]        # 3cdb00 <_ZTSN5boost9exceptionE@@Base+0x2e4e2>
  cb9204:	48 89 da             	mov    rdx,rbx
  cb9207:	48 8d 0d 12 49 71 ff 	lea    rcx,[rip+0xffffffffff714912]        # 3cdb20 <_ZTSN5boost9exceptionE@@Base+0x2e502>
  cb920e:	4d 89 e8             	mov    r8,r13
  cb9211:	45 89 f9             	mov    r9d,r15d
  cb9214:	e8 45 e3 92 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  cb9219:	40 0f b6 c5          	movzx  eax,bpl
  cb921d:	48 c1 e0 28          	shl    rax,0x28
  cb9221:	8b 4c 24 20          	mov    ecx,DWORD PTR [rsp+0x20]
  cb9225:	48 09 c1             	or     rcx,rax
  cb9228:	48 0f ba e9 30       	bts    rcx,0x30
  cb922d:	48 89 8c 24 00 07 00 	mov    QWORD PTR [rsp+0x700],rcx
  cb9234:	00 
  cb9235:	48 8d bc 24 e0 07 00 	lea    rdi,[rsp+0x7e0]
  cb923c:	00 
  cb923d:	48 8b b4 24 88 0a 00 	mov    rsi,QWORD PTR [rsp+0xa88]
  cb9244:	00 
  cb9245:	e8 06 45 00 00       	call   cbd750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a6f0>
  cb924a:	48 8b bc 24 e8 09 00 	mov    rdi,QWORD PTR [rsp+0x9e8]
  cb9251:	00 
  cb9252:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  cb9255:	ff 50 28             	call   QWORD PTR [rax+0x28]
  cb9258:	49 89 c6             	mov    r14,rax
  cb925b:	48 8b 84 24 58 01 00 	mov    rax,QWORD PTR [rsp+0x158]
  cb9262:	00 
  cb9263:	4c 8b 28             	mov    r13,QWORD PTR [rax]
  cb9266:	bf 60 01 00 00       	mov    edi,0x160
  cb926b:	e8 90 4c b3 00       	call   17edf00 <_Znwm@plt>
  cb9270:	48 8d 9c 24 80 07 00 	lea    rbx,[rsp+0x780]
  cb9277:	00 
  cb9278:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  cb927d:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
  cb9284:	00 
  cb9285:	48 8d b4 24 e0 03 00 	lea    rsi,[rsp+0x3e0]
  cb928c:	00 
  cb928d:	e8 fe 0f dc ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  cb9292:	4c 89 b4 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r14
  cb9299:	00 
  cb929a:	48 8d 05 3f 56 b5 00 	lea    rax,[rip+0xb5563f]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
  cb92a1:	48 89 84 24 10 08 00 	mov    QWORD PTR [rsp+0x810],rax
  cb92a8:	00 
  cb92a9:	48 8b 05 f8 87 bf 00 	mov    rax,QWORD PTR [rip+0xbf87f8]        # 18b1aa8 <_ZNSt6__ndk16chrono12steady_clock3nowEv@@Base+0xeaf8e8>
  cb92b0:	48 89 84 24 18 08 00 	mov    QWORD PTR [rsp+0x818],rax
  cb92b7:	00 
  cb92b8:	48 8d 84 24 10 08 00 	lea    rax,[rsp+0x810]
  cb92bf:	00 
  cb92c0:	48 89 84 24 30 08 00 	mov    QWORD PTR [rsp+0x830],rax
  cb92c7:	00 
  cb92c8:	48 8d 05 b9 60 b6 00 	lea    rax,[rip+0xb660b9]        # 181f388 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x15048>
  cb92cf:	48 89 84 24 80 07 00 	mov    QWORD PTR [rsp+0x780],rax
  cb92d6:	00 
  cb92d7:	48 89 9c 24 a0 07 00 	mov    QWORD PTR [rsp+0x7a0],rbx
  cb92de:	00 
  cb92df:	48 8b 9c 24 e0 07 00 	mov    rbx,QWORD PTR [rsp+0x7e0]
  cb92e6:	00 
  cb92e7:	4c 8b b4 24 e8 07 00 	mov    r14,QWORD PTR [rsp+0x7e8]

## rank 14: score=50 FDE=0x10d0e58..0x10d4cf6 features=stride8,begin-end,+10,+18,+20,sret=20
### +0x28 call 0x10d291a
 10d28a7:	00 
 10d28a8:	e8 3b 7f 70 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10d28ad:	48 8d 9d e8 06 00 00 	lea    rbx,[rbp+0x6e8]
 10d28b4:	48 89 df             	mov    rdi,rbx
 10d28b7:	e8 d2 59 a5 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 10d28bc:	4c 8d ad 40 07 00 00 	lea    r13,[rbp+0x740]
 10d28c3:	4c 89 ef             	mov    rdi,r13
 10d28c6:	e8 77 8f c5 ff       	call   d2b842 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2787e2>
 10d28cb:	4c 8b bd b8 06 00 00 	mov    r15,QWORD PTR [rbp+0x6b8]
 10d28d2:	4c 8d 84 24 70 03 00 	lea    r8,[rsp+0x370]
 10d28d9:	00 
 10d28da:	4c 89 a4 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r12
 10d28e1:	00 
 10d28e2:	4d 89 20             	mov    QWORD PTR [r8],r12
 10d28e5:	48 8d 35 a5 a7 9c ff 	lea    rsi,[rip+0xffffffffff9ca7a5]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 10d28ec:	48 8d 0d 33 c7 01 00 	lea    rcx,[rip+0x1c733]        # 10ef026 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b643c>
 10d28f3:	4c 8d b4 24 50 04 00 	lea    r14,[rsp+0x450]
 10d28fa:	00 
 10d28fb:	6a 08                	push   0x8
 10d28fd:	41 59                	pop    r9
 10d28ff:	4c 89 f7             	mov    rdi,r14
 10d2902:	31 d2                	xor    edx,edx
 10d2904:	e8 8b 7e 70 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 10d2909:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10d290c:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
 10d2913:	00 
 10d2914:	4c 89 fe             	mov    rsi,r15
 10d2917:	4c 89 f2             	mov    rdx,r14
 10d291a:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10d291d:	4c 8d bd 98 07 00 00 	lea    r15,[rbp+0x798]
 10d2924:	4c 8d b4 24 30 02 00 	lea    r14,[rsp+0x230]
 10d292b:	00 
 10d292c:	4c 89 ff             	mov    rdi,r15
 10d292f:	4c 89 f6             	mov    rsi,r14
 10d2932:	e8 07 71 70 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
 10d2937:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 10d293b:	e8 46 bb 9c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10d2940:	48 8d bc 24 50 04 00 	lea    rdi,[rsp+0x450]
 10d2947:	00 
 10d2948:	e8 9b 7e 70 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10d294d:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
 10d2952:	48 89 85 a8 07 00 00 	mov    QWORD PTR [rbp+0x7a8],rax
 10d2959:	48 8b 84 24 78 05 00 	mov    rax,QWORD PTR [rsp+0x578]
 10d2960:	00 
 10d2961:	48 89 85 b0 07 00 00 	mov    QWORD PTR [rbp+0x7b0],rax
 10d2968:	48 8d 35 21 08 29 ff 	lea    rsi,[rip+0xffffffffff290821]        # 363190 <_ZTSSt12bad_any_cast@@Base-0x2d038>
 10d296f:	48 8d bc 24 50 04 00 	lea    rdi,[rsp+0x450]
 10d2976:	00 
 10d2977:	e8 02 71 9a ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10d297c:	4c 8d 65 20          	lea    r12,[rbp+0x20]
 10d2980:	48 8d bd b8 07 00 00 	lea    rdi,[rbp+0x7b8]
 10d2987:	48 8d 9c 24 50 04 00 	lea    rbx,[rsp+0x450]
 10d298e:	00 
 10d298f:	48 8b 74 24 30       	mov    rsi,QWORD PTR [rsp+0x30]
 10d2994:	48 89 da             	mov    rdx,rbx
 10d2997:	e8 7e ed 6e 00       	call   17c171a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175886>
 10d299c:	48 89 df             	mov    rdi,rbx
 10d299f:	e8 ec b4 71 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10d29a4:	4c 8d bd c8 07 00 00 	lea    r15,[rbp+0x7c8]
 10d29ab:	4c 8d 84 24 70 03 00 	lea    r8,[rsp+0x370]
 10d29b2:	00 
 10d29b3:	4d 89 20             	mov    QWORD PTR [r8],r12
 10d29b6:	48 8d 35 d4 a6 9c ff 	lea    rsi,[rip+0xffffffffff9ca6d4]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
### +0x28 call 0x10d34e7
 10d3476:	48 8b 84 24 78 05 00 	mov    rax,QWORD PTR [rsp+0x578]
 10d347d:	00 
 10d347e:	49 89 46 48          	mov    QWORD PTR [r14+0x48],rax
 10d3482:	49 8d 7e 50          	lea    rdi,[r14+0x50]
 10d3486:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
 10d348b:	e8 72 69 70 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
 10d3490:	4d 8d 66 18          	lea    r12,[r14+0x18]
 10d3494:	49 8d 9e a8 00 00 00 	lea    rbx,[r14+0xa8]
 10d349b:	48 89 df             	mov    rdi,rbx
 10d349e:	e8 53 65 70 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 10d34a3:	4d 8b 7e 30          	mov    r15,QWORD PTR [r14+0x30]
 10d34a7:	4c 8d 84 24 e0 04 00 	lea    r8,[rsp+0x4e0]
 10d34ae:	00 
 10d34af:	4d 89 20             	mov    QWORD PTR [r8],r12
 10d34b2:	48 8d 35 d8 9b 9c ff 	lea    rsi,[rip+0xffffffffff9c9bd8]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 10d34b9:	48 8d 0d b8 1b 00 00 	lea    rcx,[rip+0x1bb8]        # 10d5078 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29c48e>
 10d34c0:	4c 8d ac 24 50 04 00 	lea    r13,[rsp+0x450]
 10d34c7:	00 
 10d34c8:	6a 08                	push   0x8
 10d34ca:	41 59                	pop    r9
 10d34cc:	4c 89 ef             	mov    rdi,r13
 10d34cf:	31 d2                	xor    edx,edx
 10d34d1:	e8 be 72 70 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 10d34d6:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10d34d9:	48 8d bc 24 90 03 00 	lea    rdi,[rsp+0x390]
 10d34e0:	00 
 10d34e1:	4c 89 fe             	mov    rsi,r15
 10d34e4:	4c 89 ea             	mov    rdx,r13
 10d34e7:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10d34ea:	4c 89 f7             	mov    rdi,r14
 10d34ed:	48 81 c7 b8 00 00 00 	add    rdi,0xb8
 10d34f4:	48 8d 9c 24 90 03 00 	lea    rbx,[rsp+0x390]
 10d34fb:	00 
 10d34fc:	48 89 de             	mov    rsi,rbx
 10d34ff:	e8 3a 65 70 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
 10d3504:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 10d3508:	e8 79 af 9c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10d350d:	48 8d bc 24 50 04 00 	lea    rdi,[rsp+0x450]
 10d3514:	00 
 10d3515:	e8 ce 72 70 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10d351a:	31 ff                	xor    edi,edi
 10d351c:	e8 65 af 9c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10d3521:	31 ff                	xor    edi,edi
 10d3523:	e8 5e af 9c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10d3528:	31 ff                	xor    edi,edi
 10d352a:	e8 ed ae 9c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
 10d352f:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
 10d3534:	4c 89 60 48          	mov    QWORD PTR [rax+0x48],r12
 10d3538:	49 89 c4             	mov    r12,rax
 10d353b:	48 8b 78 50          	mov    rdi,QWORD PTR [rax+0x50]
 10d353f:	4c 89 70 50          	mov    QWORD PTR [rax+0x50],r14
 10d3543:	e8 3e af 9c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10d3548:	66 48 0f 6e c5       	movq   xmm0,rbp
 10d354d:	f3 0f 7e 4c 24 30    	movq   xmm1,QWORD PTR [rsp+0x30]
 10d3553:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
 10d3557:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
 10d355d:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 10d3564:	00 
 10d3565:	e8 3a 82 b2 ff       	call   bfb7a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x148744>
 10d356a:	31 ff                	xor    edi,edi
 10d356c:	e8 15 af 9c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10d3571:	48 8b bc 24 48 01 00 	mov    rdi,QWORD PTR [rsp+0x148]
 10d3578:	00 
### +0x28 call 0x10d36ef
 10d3675:	4c 89 fa             	mov    rdx,r15
 10d3678:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10d367b:	48 89 df             	mov    rdi,rbx
 10d367e:	4c 89 ee             	mov    rsi,r13
 10d3681:	e8 b8 63 70 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
 10d3686:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
 10d368a:	e8 f7 ad 9c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10d368f:	4c 89 ff             	mov    rdi,r15
 10d3692:	e8 51 71 70 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10d3697:	4c 89 f7             	mov    rdi,r14
 10d369a:	e8 c1 19 00 00       	call   10d5060 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29c476>
 10d369f:	66 0f 6f 44 24 30    	movdqa xmm0,XMMWORD PTR [rsp+0x30]
 10d36a5:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
 10d36ac:	e8 01 ae 9c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 10d36b1:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
 10d36b7:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
 10d36be:	e8 ef ad 9c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 10d36c3:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
 10d36ca:	00 
 10d36cb:	49 83 26 00          	and    QWORD PTR [r14],0x0
 10d36cf:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
 10d36d6:	00 
 10d36d7:	48 89 de             	mov    rsi,rbx
 10d36da:	e8 31 f5 b6 ff       	call   c42c10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18fbb0>
 10d36df:	4c 89 f7             	mov    rdi,r14
 10d36e2:	e8 49 f5 b6 ff       	call   c42c30 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18fbd0>
 10d36e7:	49 8b 7c 24 30       	mov    rdi,QWORD PTR [r12+0x30]
 10d36ec:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10d36ef:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10d36f2:	80 7c 24 09 00       	cmp    BYTE PTR [rsp+0x9],0x0
 10d36f7:	48 8b b4 24 70 05 00 	mov    rsi,QWORD PTR [rsp+0x570]
 10d36fe:	00 
 10d36ff:	74 3d                	je     10d373e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29ab54>
 10d3701:	48 8d 9c 24 50 04 00 	lea    rbx,[rsp+0x450]
 10d3708:	00 
 10d3709:	48 89 df             	mov    rdi,rbx
 10d370c:	e8 12 d3 ff ff       	call   10d0a23 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x297e39>
 10d3711:	44 8a 33             	mov    r14b,BYTE PTR [rbx]
 10d3714:	0f 10 43 01          	movups xmm0,XMMWORD PTR [rbx+0x1]
 10d3718:	0f 29 84 24 60 02 00 	movaps XMMWORD PTR [rsp+0x260],xmm0
 10d371f:	00 
 10d3720:	f3 0f 6f 43 11       	movdqu xmm0,XMMWORD PTR [rbx+0x11]
 10d3725:	66 0f 7f 84 24 70 02 	movdqa XMMWORD PTR [rsp+0x270],xmm0
 10d372c:	00 00 
 10d372e:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
 10d3732:	48 89 84 24 7f 02 00 	mov    QWORD PTR [rsp+0x27f],rax
 10d3739:	00 
 10d373a:	b3 01                	mov    bl,0x1
 10d373c:	eb 05                	jmp    10d3743 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29ab59>
 10d373e:	45 31 f6             	xor    r14d,r14d
 10d3741:	31 db                	xor    ebx,ebx
 10d3743:	49 8b 7c 24 30       	mov    rdi,QWORD PTR [r12+0x30]
 10d3748:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10d374b:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10d374e:	49 89 c5             	mov    r13,rax
 10d3751:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 10d3755:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
 10d375c:	00 
 10d375d:	4c 89 e6             	mov    rsi,r12
 10d3760:	ff 50 40             	call   QWORD PTR [rax+0x40]
 10d3763:	4c 8d a4 24 90 04 00 	lea    r12,[rsp+0x490]
 10d376a:	00 
 10d376b:	8a 44 24 0f          	mov    al,BYTE PTR [rsp+0xf]

## rank 15: score=50 FDE=0x12cd240..0x12cf4c0 features=stride8,begin-end,+10,+18,+20,sret=20
### +0x28 call 0x12ce54c
 12ce4db:	4c 8d b4 24 40 02 00 	lea    r14,[rsp+0x240]
 12ce4e2:	00 
 12ce4e3:	4c 89 f6             	mov    rsi,r14
 12ce4e6:	e8 07 b7 50 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 12ce4eb:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 12ce4ef:	e8 92 ff 7c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 12ce4f4:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
 12ce4fb:	00 
 12ce4fc:	e8 69 ba 7a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 12ce501:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
 12ce505:	4c 8b b0 c0 00 00 00 	mov    r14,QWORD PTR [rax+0xc0]
 12ce50c:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
 12ce513:	00 
 12ce514:	49 89 18             	mov    QWORD PTR [r8],rbx
 12ce517:	48 8d 35 73 eb 7c ff 	lea    rsi,[rip+0xffffffffff7ceb73]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 12ce51e:	48 8d 0d 07 97 00 00 	lea    rcx,[rip+0x9707]        # 12d7c2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11d1b0>
 12ce525:	4c 8d bc 24 60 01 00 	lea    r15,[rsp+0x160]
 12ce52c:	00 
 12ce52d:	6a 08                	push   0x8
 12ce52f:	41 59                	pop    r9
 12ce531:	4c 89 ff             	mov    rdi,r15
 12ce534:	31 d2                	xor    edx,edx
 12ce536:	e8 59 c2 50 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 12ce53b:	49 8b 06             	mov    rax,QWORD PTR [r14]
 12ce53e:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 12ce545:	00 
 12ce546:	4c 89 f6             	mov    rsi,r14
 12ce549:	4c 89 fa             	mov    rdx,r15
 12ce54c:	ff 50 28             	call   QWORD PTR [rax+0x28]
 12ce54f:	48 8d bb 80 04 00 00 	lea    rdi,[rbx+0x480]
 12ce556:	4c 8d b4 24 40 02 00 	lea    r14,[rsp+0x240]
 12ce55d:	00 
 12ce55e:	4c 89 f6             	mov    rsi,r14
 12ce561:	e8 8c b6 50 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 12ce566:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 12ce56a:	e8 17 ff 7c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 12ce56f:	4c 8d b4 24 60 01 00 	lea    r14,[rsp+0x160]
 12ce576:	00 
 12ce577:	4c 89 f7             	mov    rdi,r14
 12ce57a:	e8 69 c2 50 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 12ce57f:	80 7c 24 50 00       	cmp    BYTE PTR [rsp+0x50],0x0
 12ce584:	0f 84 d4 00 00 00    	je     12ce65e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x113be2>
 12ce58a:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
 12ce58e:	48 8d 0d 13 42 59 00 	lea    rcx,[rip+0x594213]        # 18627a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ee90>
 12ce595:	48 89 8c 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rcx
 12ce59c:	00 
 12ce59d:	48 89 9c 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rbx
 12ce5a4:	00 
 12ce5a5:	4c 89 b4 24 80 01 00 	mov    QWORD PTR [rsp+0x180],r14
 12ce5ac:	00 
 12ce5ad:	48 8d b0 08 02 00 00 	lea    rsi,[rax+0x208]
 12ce5b4:	48 8d 8b 20 06 00 00 	lea    rcx,[rbx+0x620]
 12ce5bb:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 12ce5c2:	00 
 12ce5c3:	4c 89 f2             	mov    rdx,r14
 12ce5c6:	ff 90 20 02 00 00    	call   QWORD PTR [rax+0x220]
 12ce5cc:	48 8d bb 18 04 00 00 	lea    rdi,[rbx+0x418]
 12ce5d3:	4c 8d bc 24 40 02 00 	lea    r15,[rsp+0x240]
 12ce5da:	00 
 12ce5db:	4c 89 fe             	mov    rsi,r15
 12ce5de:	e8 0f b6 50 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 12ce5e3:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
 12ce5e7:	e8 9a fe 7c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
### +0x28 call 0x12cd92e
 12cd8b5:	e8 cc 0b 7d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 12cd8ba:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
 12cd8be:	48 8b 70 68          	mov    rsi,QWORD PTR [rax+0x68]
 12cd8c2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 12cd8c5:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
 12cd8cc:	00 
 12cd8cd:	6a 01                	push   0x1
 12cd8cf:	5a                   	pop    rdx
 12cd8d0:	ff 50 18             	call   QWORD PTR [rax+0x18]
 12cd8d3:	48 8d bb 70 06 00 00 	lea    rdi,[rbx+0x670]
 12cd8da:	4c 8d b4 24 60 01 00 	lea    r14,[rsp+0x160]
 12cd8e1:	00 
 12cd8e2:	4c 89 f6             	mov    rsi,r14
 12cd8e5:	e8 32 bf 7e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
 12cd8ea:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 12cd8ee:	e8 93 0b 7d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 12cd8f3:	48 83 bb 88 02 00 00 	cmp    QWORD PTR [rbx+0x288],0x0
 12cd8fa:	00 
 12cd8fb:	0f 84 83 01 00 00    	je     12cda84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x113008>
 12cd901:	48 8b bb 38 03 00 00 	mov    rdi,QWORD PTR [rbx+0x338]
 12cd908:	e8 5b c2 50 00       	call   17d9b68 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5989>
 12cd90d:	84 c0                	test   al,al
 12cd90f:	0f 85 6f 01 00 00    	jne    12cda84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x113008>
 12cd915:	44 88 64 24 30       	mov    BYTE PTR [rsp+0x30],r12b
 12cd91a:	44 88 7c 24 28       	mov    BYTE PTR [rsp+0x28],r15b
 12cd91f:	44 88 6c 24 20       	mov    BYTE PTR [rsp+0x20],r13b
 12cd924:	48 8b bb 38 02 00 00 	mov    rdi,QWORD PTR [rbx+0x238]
 12cd92b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12cd92e:	ff 50 28             	call   QWORD PTR [rax+0x28]
 12cd931:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
 12cd938:	00 
 12cd939:	48 89 c6             	mov    rsi,rax
 12cd93c:	e8 ff 05 52 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 12cd941:	48 8d ab 38 03 00 00 	lea    rbp,[rbx+0x338]
 12cd948:	41 bf c0 00 00 00    	mov    r15d,0xc0
 12cd94e:	4c 03 bb 88 02 00 00 	add    r15,QWORD PTR [rbx+0x288]
 12cd955:	48 8d 84 24 20 02 00 	lea    rax,[rsp+0x220]
 12cd95c:	00 
 12cd95d:	48 89 18             	mov    QWORD PTR [rax],rbx
 12cd960:	49 89 c0             	mov    r8,rax
 12cd963:	48 8d 35 27 f7 7c ff 	lea    rsi,[rip+0xffffffffff7cf727]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 12cd96a:	48 8d 0d 0b 9f 00 00 	lea    rcx,[rip+0x9f0b]        # 12d787c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11ce00>
 12cd971:	4c 8d b4 24 40 02 00 	lea    r14,[rsp+0x240]
 12cd978:	00 
 12cd979:	6a 08                	push   0x8
 12cd97b:	41 59                	pop    r9
 12cd97d:	4c 89 f7             	mov    rdi,r14
 12cd980:	31 d2                	xor    edx,edx
 12cd982:	e8 0d ce 50 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 12cd987:	4c 8d a4 24 60 01 00 	lea    r12,[rsp+0x160]
 12cd98e:	00 
 12cd98f:	4c 89 e7             	mov    rdi,r12
 12cd992:	4c 89 f6             	mov    rsi,r14
 12cd995:	e8 a0 cd 50 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
 12cd99a:	4c 8d ac 24 80 02 00 	lea    r13,[rsp+0x280]
 12cd9a1:	00 
 12cd9a2:	4c 89 ef             	mov    rdi,r13
 12cd9a5:	4c 89 fe             	mov    rsi,r15
 12cd9a8:	4c 89 e2             	mov    rdx,r12
 12cd9ab:	e8 1a c6 50 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
 12cd9b0:	4c 89 e7             	mov    rdi,r12
 12cd9b3:	e8 30 ce 50 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 12cd9b8:	48 89 ef             	mov    rdi,rbp

## rank 16: score=50 FDE=0x12d0bc4..0x12d38ce features=stride8,begin-end,+10,+18,+20,sret=20
### +0x28 call 0x12d2323
 12d22bb:	4c 8d 3d 5e 32 00 00 	lea    r15,[rip+0x325e]        # 12d5520 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11aaa4>
 12d22c2:	4c 8d a4 24 30 01 00 	lea    r12,[rsp+0x130]
 12d22c9:	00 
 12d22ca:	4c 89 f7             	mov    rdi,r14
 12d22cd:	4c 89 e6             	mov    rsi,r12
 12d22d0:	4c 89 fa             	mov    rdx,r15
 12d22d3:	e8 fe 6b 80 ff       	call   ad8ed6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25e76>
 12d22d8:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1
 12d22dc:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
 12d22e0:	f6 c2 01             	test   dl,0x1
 12d22e3:	75 1a                	jne    12d22ff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x117883>
 12d22e5:	48 83 c0 18          	add    rax,0x18
 12d22e9:	48 89 c7             	mov    rdi,rax
 12d22ec:	48 89 de             	mov    rsi,rbx
 12d22ef:	e8 9e 34 49 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
 12d22f4:	48 83 c3 18          	add    rbx,0x18
 12d22f8:	4c 39 eb             	cmp    rbx,r13
 12d22fb:	75 cd                	jne    12d22ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11784e>
 12d22fd:	eb 09                	jmp    12d2308 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11788c>
 12d22ff:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
 12d2303:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
 12d2306:	eb dd                	jmp    12d22e5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x117869>
 12d2308:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 12d230f:	00 
 12d2310:	e8 d3 92 7a ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 12d2315:	4c 8b 34 24          	mov    r14,QWORD PTR [rsp]
 12d2319:	49 8b be 38 02 00 00 	mov    rdi,QWORD PTR [r14+0x238]
 12d2320:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12d2323:	ff 50 28             	call   QWORD PTR [rax+0x28]
 12d2326:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
 12d232b:	48 89 c6             	mov    rsi,rax
 12d232e:	e8 0d bc 51 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 12d2333:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
 12d2337:	49 8b bf 38 02 00 00 	mov    rdi,QWORD PTR [r15+0x238]
 12d233e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12d2341:	ff 50 38             	call   QWORD PTR [rax+0x38]
 12d2344:	49 8b 4f 10          	mov    rcx,QWORD PTR [r15+0x10]
 12d2348:	4c 8b b1 c0 00 00 00 	mov    r14,QWORD PTR [rcx+0xc0]
 12d234f:	48 8d 5c 24 70       	lea    rbx,[rsp+0x70]
 12d2354:	48 8b 53 10          	mov    rdx,QWORD PTR [rbx+0x10]
 12d2358:	4c 8d a4 24 48 01 00 	lea    r12,[rsp+0x148]
 12d235f:	00 
 12d2360:	49 89 54 24 f8       	mov    QWORD PTR [r12-0x8],rdx
 12d2365:	0f 28 03             	movaps xmm0,XMMWORD PTR [rbx]
 12d2368:	41 0f 29 44 24 e8    	movaps XMMWORD PTR [r12-0x18],xmm0
 12d236e:	0f 57 c0             	xorps  xmm0,xmm0
 12d2371:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
 12d2374:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
 12d2379:	0f 28 41 60          	movaps xmm0,XMMWORD PTR [rcx+0x60]
 12d237d:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
 12d2382:	4c 89 e7             	mov    rdi,r12
 12d2385:	48 89 c6             	mov    rsi,rax
 12d2388:	e8 d9 7a 3f 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
 12d238d:	4d 89 74 24 58       	mov    QWORD PTR [r12+0x58],r14
 12d2392:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
 12d2397:	41 0f 11 44 24 60    	movups XMMWORD PTR [r12+0x60],xmm0
 12d239d:	0f 57 c0             	xorps  xmm0,xmm0
 12d23a0:	41 0f 11 44 24 70    	movups XMMWORD PTR [r12+0x70],xmm0
 12d23a6:	41 0f 11 84 24 80 00 	movups XMMWORD PTR [r12+0x80],xmm0
 12d23ad:	00 00 
 12d23af:	48 89 df             	mov    rdi,rbx
 12d23b2:	e8 d9 ba 51 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 12d23b7:	49 8b bf 28 02 00 00 	mov    rdi,QWORD PTR [r15+0x228]
### +0x28 call 0x12d2431
 12d23c1:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
 12d23c7:	83 f8 01             	cmp    eax,0x1
 12d23ca:	0f 94 84 24 ec 00 00 	sete   BYTE PTR [rsp+0xec]
 12d23d1:	00 
 12d23d2:	49 8d 57 20          	lea    rdx,[r15+0x20]
 12d23d6:	49 8b b7 28 02 00 00 	mov    rsi,QWORD PTR [r15+0x228]
 12d23dd:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 12d23e0:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
 12d23e7:	00 
 12d23e8:	ff 50 40             	call   QWORD PTR [rax+0x40]
 12d23eb:	48 8b bc 24 20 01 00 	mov    rdi,QWORD PTR [rsp+0x120]
 12d23f2:	00 
 12d23f3:	48 85 ff             	test   rdi,rdi
 12d23f6:	0f 84 b0 0f 00 00    	je     12d33ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x118930>
 12d23fc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12d23ff:	ff 50 20             	call   QWORD PTR [rax+0x20]
 12d2402:	48 83 44 24 08 18    	add    QWORD PTR [rsp+0x8],0x18
 12d2408:	48 8d 9c 24 50 03 00 	lea    rbx,[rsp+0x350]
 12d240f:	00 
 12d2410:	48 8b bc 24 20 01 00 	mov    rdi,QWORD PTR [rsp+0x120]
 12d2417:	00 
 12d2418:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12d241b:	ff 50 18             	call   QWORD PTR [rax+0x18]
 12d241e:	84 c0                	test   al,al
 12d2420:	0f 84 c5 0f 00 00    	je     12d33eb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11896f>
 12d2426:	48 8b bc 24 20 01 00 	mov    rdi,QWORD PTR [rsp+0x120]
 12d242d:	00 
 12d242e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12d2431:	ff 50 28             	call   QWORD PTR [rax+0x28]
 12d2434:	48 89 c7             	mov    rdi,rax
 12d2437:	48 8b 00             	mov    rax,QWORD PTR [rax]
 12d243a:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
 12d243f:	ff 50 40             	call   QWORD PTR [rax+0x40]
 12d2442:	83 78 38 00          	cmp    DWORD PTR [rax+0x38],0x0
 12d2446:	74 0d                	je     12d2455 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1179d9>
 12d2448:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 12d244d:	48 89 c6             	mov    rsi,rax
 12d2450:	e8 ed d7 97 ff       	call   c4fc42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19cbe2>
 12d2455:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 12d245a:	48 89 de             	mov    rsi,rbx
 12d245d:	48 8d 15 cd 30 00 00 	lea    rdx,[rip+0x30cd]        # 12d5531 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11aab5>
 12d2464:	e8 6d 6a 80 ff       	call   ad8ed6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25e76>
 12d2469:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 12d246e:	48 83 a4 24 50 03 00 	and    QWORD PTR [rsp+0x350],0x0
 12d2475:	00 00 
 12d2477:	48 83 a4 24 60 03 00 	and    QWORD PTR [rsp+0x360],0x0
 12d247e:	00 00 
 12d2480:	6a 18                	push   0x18
 12d2482:	5f                   	pop    rdi
 12d2483:	e8 78 ba 51 00       	call   17edf00 <_Znwm@plt>
 12d2488:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
 12d248c:	48 89 08             	mov    QWORD PTR [rax],rcx
 12d248f:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 12d2494:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 12d2498:	48 8d 8c 24 ec 00 00 	lea    rcx,[rsp+0xec]
 12d249f:	00 
 12d24a0:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
 12d24a4:	48 89 84 24 50 03 00 	mov    QWORD PTR [rsp+0x350],rax
 12d24ab:	00 
 12d24ac:	48 8d 05 5b fe 88 ff 	lea    rax,[rip+0xffffffffff88fe5b]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
 12d24b3:	48 89 84 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rax
 12d24ba:	00 
 12d24bb:	48 8d 05 80 30 00 00 	lea    rax,[rip+0x3080]        # 12d5542 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11aac6>

## rank 17: score=50 FDE=0x12dc63e..0x12dd3fb features=stride8,begin-end,+10,+18,+20,sret=20
### +0x28 call 0x12dd0e4
 12dd075:	ff 50 18             	call   QWORD PTR [rax+0x18]
 12dd078:	4c 8d b4 24 b0 01 00 	lea    r14,[rsp+0x1b0]
 12dd07f:	00 
 12dd080:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
 12dd085:	4c 89 f6             	mov    rsi,r14
 12dd088:	e8 65 cb 4f 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 12dd08d:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 12dd091:	e8 f0 13 7c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 12dd096:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
 12dd09d:	00 
 12dd09e:	e8 45 d7 4f 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 12dd0a3:	4c 8d 84 24 80 01 00 	lea    r8,[rsp+0x180]
 12dd0aa:	00 
 12dd0ab:	49 89 18             	mov    QWORD PTR [r8],rbx
 12dd0ae:	48 8d 35 dc ff 7b ff 	lea    rsi,[rip+0xffffffffff7bffdc]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 12dd0b5:	48 8d 0d aa 05 00 00 	lea    rcx,[rip+0x5aa]        # 12dd666 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x122bea>
 12dd0bc:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
 12dd0c3:	00 
 12dd0c4:	6a 08                	push   0x8
 12dd0c6:	41 59                	pop    r9
 12dd0c8:	4c 89 f7             	mov    rdi,r14
 12dd0cb:	31 d2                	xor    edx,edx
 12dd0cd:	e8 c2 d6 4f 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 12dd0d2:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
 12dd0d6:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 12dd0dd:	00 
 12dd0de:	48 89 ee             	mov    rsi,rbp
 12dd0e1:	4c 89 f2             	mov    rdx,r14
 12dd0e4:	ff 50 28             	call   QWORD PTR [rax+0x28]
 12dd0e7:	4c 8d b4 24 b0 01 00 	lea    r14,[rsp+0x1b0]
 12dd0ee:	00 
 12dd0ef:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
 12dd0f4:	4c 89 f6             	mov    rsi,r14
 12dd0f7:	e8 f6 ca 4f 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 12dd0fc:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 12dd100:	e8 81 13 7c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 12dd105:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
 12dd10c:	00 
 12dd10d:	e8 d6 d6 4f 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 12dd112:	48 8d 83 f0 08 00 00 	lea    rax,[rbx+0x8f0]
 12dd119:	80 38 00             	cmp    BYTE PTR [rax],0x0
 12dd11c:	74 08                	je     12dd126 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1226aa>
 12dd11e:	48 89 df             	mov    rdi,rbx
 12dd121:	e8 4e 05 00 00       	call   12dd674 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x122bf8>
 12dd126:	48 89 df             	mov    rdi,rbx
 12dd129:	e8 70 06 00 00       	call   12dd79e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x122d22>
 12dd12e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 12dd135:	00 00 
 12dd137:	48 3b 84 24 40 02 00 	cmp    rax,QWORD PTR [rsp+0x240]
 12dd13e:	00 
 12dd13f:	0f 85 b1 02 00 00    	jne    12dd3f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12297a>
 12dd145:	48 81 c4 48 02 00 00 	add    rsp,0x248
 12dd14c:	5b                   	pop    rbx
 12dd14d:	41 5c                	pop    r12
 12dd14f:	41 5d                	pop    r13
 12dd151:	41 5e                	pop    r14
 12dd153:	41 5f                	pop    r15
 12dd155:	5d                   	pop    rbp
 12dd156:	c3                   	ret
 12dd157:	e9 ef 00 00 00       	jmp    12dd24b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1227cf>
 12dd15c:	e9 ea 00 00 00       	jmp    12dd24b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1227cf>
 12dd161:	eb 00                	jmp    12dd163 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1226e7>
 12dd163:	49 89 c6             	mov    r14,rax

## rank 18: score=50 FDE=0x17536c4..0x1754a9b features=stride8,begin-end,+10,+18,+20,sret=20
### +0x28 call 0x1753ab4
 1753a4e:	00 
 1753a4f:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
 1753a56:	00 
 1753a57:	4c 89 ee             	mov    rsi,r13
 1753a5a:	48 8b 54 24 20       	mov    rdx,QWORD PTR [rsp+0x20]
 1753a5f:	e8 0e d4 fe ff       	call   1740e72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf4fde>
 1753a64:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
 1753a6b:	00 
 1753a6c:	e8 c5 7d 32 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 1753a71:	4c 89 e7             	mov    rdi,r12
 1753a74:	48 89 c6             	mov    rsi,rax
 1753a77:	e8 d6 bd 02 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
 1753a7c:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
 1753a81:	89 c5                	mov    ebp,eax
 1753a83:	84 c0                	test   al,al
 1753a85:	0f 84 fe 0d 00 00    	je     1754889 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1089f5>
 1753a8b:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1753a8e:	48 8d 35 9c 4c bf fe 	lea    rsi,[rip+0xfffffffffebf4c9c]        # 348731 <_ZTSSt12bad_any_cast@@Base-0x47a97>
 1753a95:	6a 01                	push   0x1
 1753a97:	5a                   	pop    rdx
 1753a98:	48 89 df             	mov    rdi,rbx
 1753a9b:	ff 50 28             	call   QWORD PTR [rax+0x28]
 1753a9e:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 1753aa5:	00 
 1753aa6:	e8 8b 7d 32 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 1753aab:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
 1753aae:	48 89 df             	mov    rdi,rbx
 1753ab1:	48 89 c6             	mov    rsi,rax
 1753ab4:	ff 51 28             	call   QWORD PTR [rcx+0x28]
 1753ab7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1753aba:	48 8d 35 e3 14 c1 fe 	lea    rsi,[rip+0xfffffffffec114e3]        # 364fa4 <_ZTSSt12bad_any_cast@@Base-0x2b224>
 1753ac1:	6a 01                	push   0x1
 1753ac3:	5a                   	pop    rdx
 1753ac4:	48 89 df             	mov    rdi,rbx
 1753ac7:	ff 50 28             	call   QWORD PTR [rax+0x28]
 1753aca:	48 8b b4 24 e0 00 00 	mov    rsi,QWORD PTR [rsp+0xe0]
 1753ad1:	00 
 1753ad2:	4c 89 ef             	mov    rdi,r13
 1753ad5:	e8 12 16 00 00       	call   17550ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x109258>
 1753ada:	49 89 c6             	mov    r14,rax
 1753add:	45 0f b6 45 04       	movzx  r8d,BYTE PTR [r13+0x4]
 1753ae2:	48 8b 00             	mov    rax,QWORD PTR [rax]
 1753ae5:	6a ff                	push   0xffffffffffffffff
 1753ae7:	5a                   	pop    rdx
 1753ae8:	4c 89 f7             	mov    rdi,r14
 1753aeb:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
 1753af0:	31 c9                	xor    ecx,ecx
 1753af2:	49 89 d9             	mov    r9,rbx
 1753af5:	ff 50 70             	call   QWORD PTR [rax+0x70]
 1753af8:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1753afb:	48 89 df             	mov    rdi,rbx
 1753afe:	ff 50 10             	call   QWORD PTR [rax+0x10]
 1753b01:	4c 89 ef             	mov    rdi,r13
 1753b04:	4c 89 e6             	mov    rsi,r12
 1753b07:	48 89 da             	mov    rdx,rbx
 1753b0a:	e8 b5 fb ff ff       	call   17536c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107830>
 1753b0f:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1753b12:	48 89 df             	mov    rdi,rbx
 1753b15:	ff 50 18             	call   QWORD PTR [rax+0x18]
 1753b18:	45 0f b6 45 04       	movzx  r8d,BYTE PTR [r13+0x4]
 1753b1d:	49 8b 06             	mov    rax,QWORD PTR [r14]
 1753b20:	6a ff                	push   0xffffffffffffffff
 1753b22:	5a                   	pop    rdx
### +0x28 call 0x1753a9b
 1753a2f:	48 83 67 38 00       	and    QWORD PTR [rdi+0x38],0x0
 1753a34:	48 89 c6             	mov    rsi,rax
 1753a37:	e8 4c 53 fe ff       	call   1738d88 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xecef4>
 1753a3c:	48 89 c7             	mov    rdi,rax
 1753a3f:	e8 02 e2 f8 ff       	call   16e1c46 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95db2>
 1753a44:	49 89 c4             	mov    r12,rax
 1753a47:	48 8b 8c 24 e0 00 00 	mov    rcx,QWORD PTR [rsp+0xe0]
 1753a4e:	00 
 1753a4f:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
 1753a56:	00 
 1753a57:	4c 89 ee             	mov    rsi,r13
 1753a5a:	48 8b 54 24 20       	mov    rdx,QWORD PTR [rsp+0x20]
 1753a5f:	e8 0e d4 fe ff       	call   1740e72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf4fde>
 1753a64:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
 1753a6b:	00 
 1753a6c:	e8 c5 7d 32 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 1753a71:	4c 89 e7             	mov    rdi,r12
 1753a74:	48 89 c6             	mov    rsi,rax
 1753a77:	e8 d6 bd 02 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
 1753a7c:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
 1753a81:	89 c5                	mov    ebp,eax
 1753a83:	84 c0                	test   al,al
 1753a85:	0f 84 fe 0d 00 00    	je     1754889 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1089f5>
 1753a8b:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1753a8e:	48 8d 35 9c 4c bf fe 	lea    rsi,[rip+0xfffffffffebf4c9c]        # 348731 <_ZTSSt12bad_any_cast@@Base-0x47a97>
 1753a95:	6a 01                	push   0x1
 1753a97:	5a                   	pop    rdx
 1753a98:	48 89 df             	mov    rdi,rbx
 1753a9b:	ff 50 28             	call   QWORD PTR [rax+0x28]
 1753a9e:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 1753aa5:	00 
 1753aa6:	e8 8b 7d 32 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 1753aab:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
 1753aae:	48 89 df             	mov    rdi,rbx
 1753ab1:	48 89 c6             	mov    rsi,rax
 1753ab4:	ff 51 28             	call   QWORD PTR [rcx+0x28]
 1753ab7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1753aba:	48 8d 35 e3 14 c1 fe 	lea    rsi,[rip+0xfffffffffec114e3]        # 364fa4 <_ZTSSt12bad_any_cast@@Base-0x2b224>
 1753ac1:	6a 01                	push   0x1
 1753ac3:	5a                   	pop    rdx
 1753ac4:	48 89 df             	mov    rdi,rbx
 1753ac7:	ff 50 28             	call   QWORD PTR [rax+0x28]
 1753aca:	48 8b b4 24 e0 00 00 	mov    rsi,QWORD PTR [rsp+0xe0]
 1753ad1:	00 
 1753ad2:	4c 89 ef             	mov    rdi,r13
 1753ad5:	e8 12 16 00 00       	call   17550ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x109258>
 1753ada:	49 89 c6             	mov    r14,rax
 1753add:	45 0f b6 45 04       	movzx  r8d,BYTE PTR [r13+0x4]
 1753ae2:	48 8b 00             	mov    rax,QWORD PTR [rax]
 1753ae5:	6a ff                	push   0xffffffffffffffff
 1753ae7:	5a                   	pop    rdx
 1753ae8:	4c 89 f7             	mov    rdi,r14
 1753aeb:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
 1753af0:	31 c9                	xor    ecx,ecx
 1753af2:	49 89 d9             	mov    r9,rbx
 1753af5:	ff 50 70             	call   QWORD PTR [rax+0x70]
 1753af8:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1753afb:	48 89 df             	mov    rdi,rbx
 1753afe:	ff 50 10             	call   QWORD PTR [rax+0x10]
 1753b01:	4c 89 ef             	mov    rdi,r13
 1753b04:	4c 89 e6             	mov    rsi,r12
 1753b07:	48 89 da             	mov    rdx,rbx
 1753b0a:	e8 b5 fb ff ff       	call   17536c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107830>
### +0x28 call 0x1753ac7
 1753a64:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
 1753a6b:	00 
 1753a6c:	e8 c5 7d 32 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 1753a71:	4c 89 e7             	mov    rdi,r12
 1753a74:	48 89 c6             	mov    rsi,rax
 1753a77:	e8 d6 bd 02 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
 1753a7c:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
 1753a81:	89 c5                	mov    ebp,eax
 1753a83:	84 c0                	test   al,al
 1753a85:	0f 84 fe 0d 00 00    	je     1754889 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1089f5>
 1753a8b:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1753a8e:	48 8d 35 9c 4c bf fe 	lea    rsi,[rip+0xfffffffffebf4c9c]        # 348731 <_ZTSSt12bad_any_cast@@Base-0x47a97>
 1753a95:	6a 01                	push   0x1
 1753a97:	5a                   	pop    rdx
 1753a98:	48 89 df             	mov    rdi,rbx
 1753a9b:	ff 50 28             	call   QWORD PTR [rax+0x28]
 1753a9e:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 1753aa5:	00 
 1753aa6:	e8 8b 7d 32 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 1753aab:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
 1753aae:	48 89 df             	mov    rdi,rbx
 1753ab1:	48 89 c6             	mov    rsi,rax
 1753ab4:	ff 51 28             	call   QWORD PTR [rcx+0x28]
 1753ab7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1753aba:	48 8d 35 e3 14 c1 fe 	lea    rsi,[rip+0xfffffffffec114e3]        # 364fa4 <_ZTSSt12bad_any_cast@@Base-0x2b224>
 1753ac1:	6a 01                	push   0x1
 1753ac3:	5a                   	pop    rdx
 1753ac4:	48 89 df             	mov    rdi,rbx
 1753ac7:	ff 50 28             	call   QWORD PTR [rax+0x28]
 1753aca:	48 8b b4 24 e0 00 00 	mov    rsi,QWORD PTR [rsp+0xe0]
 1753ad1:	00 
 1753ad2:	4c 89 ef             	mov    rdi,r13
 1753ad5:	e8 12 16 00 00       	call   17550ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x109258>
 1753ada:	49 89 c6             	mov    r14,rax
 1753add:	45 0f b6 45 04       	movzx  r8d,BYTE PTR [r13+0x4]
 1753ae2:	48 8b 00             	mov    rax,QWORD PTR [rax]
 1753ae5:	6a ff                	push   0xffffffffffffffff
 1753ae7:	5a                   	pop    rdx
 1753ae8:	4c 89 f7             	mov    rdi,r14
 1753aeb:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
 1753af0:	31 c9                	xor    ecx,ecx
 1753af2:	49 89 d9             	mov    r9,rbx
 1753af5:	ff 50 70             	call   QWORD PTR [rax+0x70]
 1753af8:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1753afb:	48 89 df             	mov    rdi,rbx
 1753afe:	ff 50 10             	call   QWORD PTR [rax+0x10]
 1753b01:	4c 89 ef             	mov    rdi,r13
 1753b04:	4c 89 e6             	mov    rsi,r12
 1753b07:	48 89 da             	mov    rdx,rbx
 1753b0a:	e8 b5 fb ff ff       	call   17536c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107830>
 1753b0f:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1753b12:	48 89 df             	mov    rdi,rbx
 1753b15:	ff 50 18             	call   QWORD PTR [rax+0x18]
 1753b18:	45 0f b6 45 04       	movzx  r8d,BYTE PTR [r13+0x4]
 1753b1d:	49 8b 06             	mov    rax,QWORD PTR [r14]
 1753b20:	6a ff                	push   0xffffffffffffffff
 1753b22:	5a                   	pop    rdx
 1753b23:	4c 89 f7             	mov    rdi,r14
 1753b26:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
 1753b2b:	31 c9                	xor    ecx,ecx
 1753b2d:	49 89 d9             	mov    r9,rbx
 1753b30:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
 1753b36:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
### +0x28 call 0x1753d8d
 1753d35:	48 89 1c 24          	mov    QWORD PTR [rsp],rbx
 1753d39:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 1753d3e:	4c 89 e6             	mov    rsi,r12
 1753d41:	6a ff                	push   0xffffffffffffffff
 1753d43:	5a                   	pop    rdx
 1753d44:	89 c1                	mov    ecx,eax
 1753d46:	4c 8b 44 24 18       	mov    r8,QWORD PTR [rsp+0x18]
 1753d4b:	4d 89 e9             	mov    r9,r13
 1753d4e:	e8 91 1b 00 00       	call   17558e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x109a50>
 1753d53:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1753d56:	48 89 df             	mov    rdi,rbx
 1753d59:	48 8d 35 c0 b4 c2 fe 	lea    rsi,[rip+0xfffffffffec2b4c0]        # 37f220 <_ZTSSt12bad_any_cast@@Base-0x10fa8>
 1753d60:	6a 02                	push   0x2
 1753d62:	5a                   	pop    rdx
 1753d63:	48 8d 0d c7 49 bf fe 	lea    rcx,[rip+0xfffffffffebf49c7]        # 348731 <_ZTSSt12bad_any_cast@@Base-0x47a97>
 1753d6a:	6a 01                	push   0x1
 1753d6c:	41 58                	pop    r8
 1753d6e:	ff 50 38             	call   QWORD PTR [rax+0x38]
 1753d71:	85 ed                	test   ebp,ebp
 1753d73:	7e 3e                	jle    1753db3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107f1f>
 1753d75:	45 31 f6             	xor    r14d,r14d
 1753d78:	45 85 f6             	test   r14d,r14d
 1753d7b:	74 13                	je     1753d90 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107efc>
 1753d7d:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1753d80:	48 89 df             	mov    rdi,rbx
 1753d83:	48 8d 35 78 37 be fe 	lea    rsi,[rip+0xfffffffffebe3778]        # 337502 <_ZTSSt12bad_any_cast@@Base-0x58cc6>
 1753d8a:	6a 02                	push   0x2
 1753d8c:	5a                   	pop    rdx
 1753d8d:	ff 50 28             	call   QWORD PTR [rax+0x28]
 1753d90:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 1753d95:	4c 89 e6             	mov    rsi,r12
 1753d98:	48 8b 54 24 18       	mov    rdx,QWORD PTR [rsp+0x18]
 1753d9d:	4c 89 e9             	mov    rcx,r13
 1753da0:	45 89 f0             	mov    r8d,r14d
 1753da3:	49 89 d9             	mov    r9,rbx
 1753da6:	e8 2b 1c 00 00       	call   17559d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x109b42>
 1753dab:	41 ff c6             	inc    r14d
 1753dae:	44 39 f5             	cmp    ebp,r14d
 1753db1:	75 c5                	jne    1753d78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107ee4>
 1753db3:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 1753db8:	80 78 04 00          	cmp    BYTE PTR [rax+0x4],0x0
 1753dbc:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1753dbf:	48 8d 35 b9 12 c1 fe 	lea    rsi,[rip+0xfffffffffec112b9]        # 36507f <_ZTSSt12bad_any_cast@@Base-0x2b149>
 1753dc6:	48 8d 0d e3 72 c0 fe 	lea    rcx,[rip+0xfffffffffec072e3]        # 35b0b0 <_ZTSSt12bad_any_cast@@Base-0x35118>
 1753dcd:	48 0f 44 f1          	cmove  rsi,rcx
 1753dd1:	48 89 df             	mov    rdi,rbx
 1753dd4:	6a 02                	push   0x2
 1753dd6:	5a                   	pop    rdx
 1753dd7:	ff 50 28             	call   QWORD PTR [rax+0x28]
 1753dda:	e9 26 04 00 00       	jmp    1754205 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108371>
 1753ddf:	a8 20                	test   al,0x20
 1753de1:	75 2d                	jne    1753e10 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107f7c>
 1753de3:	4c 89 f7             	mov    rdi,r14
 1753de6:	4c 89 e6             	mov    rsi,r12
 1753de9:	4c 89 ea             	mov    rdx,r13
 1753dec:	e8 35 9f fe ff       	call   173dd26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf1e92>
 1753df1:	84 c0                	test   al,al
 1753df3:	75 12                	jne    1753e07 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107f73>
 1753df5:	49 8b 45 20          	mov    rax,QWORD PTR [r13+0x20]
 1753df9:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
 1753dfd:	80 78 53 00          	cmp    BYTE PTR [rax+0x53],0x0
 1753e01:	0f 84 16 0a 00 00    	je     175481d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108989>
 1753e07:	6a 01                	push   0x1

## rank 19: score=49 FDE=0xe0267e..0xe03029 features=stride8,begin-end,+10,+18,sret=27
### +0x28 call 0xe02a18
  e029b2:	4c 8d a4 24 98 00 00 	lea    r12,[rsp+0x98]
  e029b9:	00 
  e029ba:	4c 89 e7             	mov    rdi,r12
  e029bd:	4c 89 fe             	mov    rsi,r15
  e029c0:	31 d2                	xor    edx,edx
  e029c2:	49 89 d9             	mov    r9,rbx
  e029c5:	e8 ca 7d 9d 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e029ca:	48 8b 75 08          	mov    rsi,QWORD PTR [rbp+0x8]
  e029ce:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e029d1:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  e029d8:	00 
  e029d9:	4c 89 e2             	mov    rdx,r12
  e029dc:	ff 50 38             	call   QWORD PTR [rax+0x38]
  e029df:	49 8b 2e             	mov    rbp,QWORD PTR [r14]
  e029e2:	4c 8d 44 24 38       	lea    r8,[rsp+0x38]
  e029e7:	4d 89 30             	mov    QWORD PTR [r8],r14
  e029ea:	48 8d 0d bb bf 05 00 	lea    rcx,[rip+0x5bfbb]        # e5e9ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25dc2>
  e029f1:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
  e029f6:	4c 89 e7             	mov    rdi,r12
  e029f9:	4c 89 fe             	mov    rsi,r15
  e029fc:	31 d2                	xor    edx,edx
  e029fe:	49 89 d9             	mov    r9,rbx
  e02a01:	e8 8e 7d 9d 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e02a06:	48 8b 75 08          	mov    rsi,QWORD PTR [rbp+0x8]
  e02a0a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e02a0d:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  e02a14:	00 
  e02a15:	4c 89 e2             	mov    rdx,r12
  e02a18:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e02a1b:	4d 8b a6 d8 01 00 00 	mov    r12,QWORD PTR [r14+0x1d8]
  e02a22:	bf 10 04 00 00       	mov    edi,0x410
  e02a27:	e8 d4 b4 9e 00       	call   17edf00 <_Znwm@plt>
  e02a2c:	48 89 c5             	mov    rbp,rax
  e02a2f:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
  e02a36:	00 
  e02a37:	48 8d b4 24 48 03 00 	lea    rsi,[rsp+0x348]
  e02a3e:	00 
  e02a3f:	e8 44 18 6a 00       	call   14a4288 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e980c>
  e02a44:	48 8d bc 24 50 06 00 	lea    rdi,[rsp+0x650]
  e02a4b:	00 
  e02a4c:	48 8d b4 24 28 03 00 	lea    rsi,[rsp+0x328]
  e02a53:	00 
  e02a54:	e8 01 e4 05 00       	call   e60e5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28270>
  e02a59:	48 8d bc 24 30 06 00 	lea    rdi,[rsp+0x630]
  e02a60:	00 
  e02a61:	48 8d b4 24 08 03 00 	lea    rsi,[rsp+0x308]
  e02a68:	00 
  e02a69:	e8 02 23 00 00       	call   e04d70 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd1df6>
  e02a6e:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
  e02a75:	00 
  e02a76:	48 8d b4 24 38 01 00 	lea    rsi,[rsp+0x138]
  e02a7d:	00 
  e02a7e:	e8 bb 6f 9d 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e02a83:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
  e02a8a:	00 
  e02a8b:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
  e02a92:	00 
  e02a93:	e8 a6 6f 9d 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e02a98:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
  e02a9f:	00 
  e02aa0:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
  e02aa7:	00 
  e02aa8:	e8 91 6f 9d 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>

## rank 20: score=49 FDE=0x11689c0..0x11694ee features=stride8,begin-end,+10,+18,sret=25
### +0x28 call 0x1168d72
 1168d02:	00 
 1168d03:	48 8d ac 24 e0 01 00 	lea    rbp,[rsp+0x1e0]
 1168d0a:	00 
 1168d0b:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0
 1168d12:	00 00 
 1168d14:	0f 57 c0             	xorps  xmm0,xmm0
 1168d17:	0f 29 84 24 00 01 00 	movaps XMMWORD PTR [rsp+0x100],xmm0
 1168d1e:	00 
 1168d1f:	48 83 a4 24 20 01 00 	and    QWORD PTR [rsp+0x120],0x0
 1168d26:	00 00 
 1168d28:	48 8d 05 39 05 6f 00 	lea    rax,[rip+0x6f0539]        # 1859268 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x15950>
 1168d2f:	48 89 84 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rax
 1168d36:	00 
 1168d37:	48 83 a4 24 30 01 00 	and    QWORD PTR [rsp+0x130],0x0
 1168d3e:	00 00 
 1168d40:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
 1168d47:	00 
 1168d48:	e8 03 0f 9f ff       	call   b59c50 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa6bf0>
 1168d4d:	49 8b 9f 18 01 00 00 	mov    rbx,QWORD PTR [r15+0x118]
 1168d54:	4d 8b bf 20 01 00 00 	mov    r15,QWORD PTR [r15+0x120]
 1168d5b:	4c 39 fb             	cmp    rbx,r15
 1168d5e:	74 74                	je     1168dd4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3301ea>
 1168d60:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 1168d63:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1168d66:	4c 89 f6             	mov    rsi,r14
 1168d69:	4c 89 e2             	mov    rdx,r12
 1168d6c:	4c 89 e9             	mov    rcx,r13
 1168d6f:	49 89 e8             	mov    r8,rbp
 1168d72:	ff 50 28             	call   QWORD PTR [rax+0x28]
 1168d75:	48 83 c3 08          	add    rbx,0x8
 1168d79:	84 c0                	test   al,al
 1168d7b:	74 de                	je     1168d5b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x330171>
 1168d7d:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
 1168d82:	48 2b 44 24 40       	sub    rax,QWORD PTR [rsp+0x40]
 1168d87:	48 99                	cqo
 1168d89:	6a 38                	push   0x38
 1168d8b:	59                   	pop    rcx
 1168d8c:	48 f7 f9             	idiv   rcx
 1168d8f:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
 1168d96:	00 
 1168d97:	48 89 c6             	mov    rsi,rax
 1168d9a:	e8 d1 a7 51 00       	call   1683570 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x376dc>
 1168d9f:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
 1168da6:	00 
 1168da7:	48 89 94 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],rdx
 1168dae:	00 
 1168daf:	48 8d 9c 24 00 01 00 	lea    rbx,[rsp+0x100]
 1168db6:	00 
 1168db7:	48 89 df             	mov    rdi,rbx
 1168dba:	48 8d b4 24 e0 00 00 	lea    rsi,[rsp+0xe0]
 1168dc1:	00 
 1168dc2:	e8 e1 d1 97 ff       	call   ae5fa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x32f48>
 1168dc7:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 1168dcc:	48 89 de             	mov    rsi,rbx
 1168dcf:	e8 fa e2 ff ff       	call   11670ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32e4e4>
 1168dd4:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
 1168ddb:	00 
 1168ddc:	e8 87 c2 ff ff       	call   1165068 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32c47e>
 1168de1:	49 83 c4 58          	add    r12,0x58
 1168de5:	4c 3b 64 24 10       	cmp    r12,QWORD PTR [rsp+0x10]
 1168dea:	4c 8b 7c 24 18       	mov    r15,QWORD PTR [rsp+0x18]
 1168def:	0f 85 16 ff ff ff    	jne    1168d0b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x330121>
 1168df5:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]

## rank 21: score=49 FDE=0x1175694..0x1175d79 features=begin-end,+10,+18,+20,sret=27
### +0x28 call 0x1175759
 11756e1:	41 80 bf a0 00 00 00 	cmp    BYTE PTR [r15+0xa0],0x0
 11756e8:	00 
 11756e9:	0f 85 9e 05 00 00    	jne    1175c8d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33d0a3>
 11756ef:	66 41 c7 87 a0 00 00 	mov    WORD PTR [r15+0xa0],0x1
 11756f6:	00 01 00 
 11756f9:	66 c7 44 24 40 00 01 	mov    WORD PTR [rsp+0x40],0x100
 1175700:	48 83 64 24 48 00    	and    QWORD PTR [rsp+0x48],0x0
 1175706:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
 117570d:	00 00 
 117570f:	0f 57 c0             	xorps  xmm0,xmm0
 1175712:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
 1175717:	48 8d 3d 1b 49 26 ff 	lea    rdi,[rip+0xffffffffff26491b]        # 3da039 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4c1e>
 117571e:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
 1175725:	00 
 1175726:	6a 0d                	push   0xd
 1175728:	5e                   	pop    rsi
 1175729:	e8 e2 8d 67 00       	call   17ee510 <__strlen_chk@plt>
 117572e:	4c 8d a4 24 a0 00 00 	lea    r12,[rsp+0xa0]
 1175735:	00 
 1175736:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
 117573b:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
 117573e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1175741:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
 1175748:	00 
 1175749:	4c 8d 6c 24 40       	lea    r13,[rsp+0x40]
 117574e:	4c 8d 44 24 70       	lea    r8,[rsp+0x70]
 1175753:	4c 89 ea             	mov    rdx,r13
 1175756:	4c 89 e1             	mov    rcx,r12
 1175759:	ff 50 28             	call   QWORD PTR [rax+0x28]
 117575c:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
 1175763:	00 
 1175764:	48 85 ff             	test   rdi,rdi
 1175767:	0f 84 b7 00 00 00    	je     1175824 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33cc3a>
 117576d:	31 ed                	xor    ebp,ebp
 117576f:	e9 00 01 00 00       	jmp    1175874 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33cc8a>
 1175774:	41 80 bf a1 00 00 00 	cmp    BYTE PTR [r15+0xa1],0x0
 117577b:	00 
 117577c:	0f 85 0b 05 00 00    	jne    1175c8d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33d0a3>
 1175782:	4d 8b 37             	mov    r14,QWORD PTR [r15]
 1175785:	49 8d be 08 01 00 00 	lea    rdi,[r14+0x108]
 117578c:	e8 51 99 9f ff       	call   b6f0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc082>
 1175791:	66 41 83 a6 00 01 00 	and    WORD PTR [r14+0x100],0x0
 1175798:	00 00 
 117579a:	49 8b 7e 68          	mov    rdi,QWORD PTR [r14+0x68]
 117579e:	e8 c5 43 66 00       	call   17d9b68 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5989>
 11757a3:	84 c0                	test   al,al
 11757a5:	74 09                	je     11757b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33cbc6>
 11757a7:	49 8b 7e 68          	mov    rdi,QWORD PTR [r14+0x68]
 11757ab:	e8 6e 43 66 00       	call   17d9b1e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x593f>
 11757b0:	66 41 c7 87 a0 00 00 	mov    WORD PTR [r15+0xa0],0x100
 11757b7:	00 00 01 
 11757ba:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
 11757c1:	00 
 11757c2:	4c 89 f7             	mov    rdi,r14
 11757c5:	e8 a6 05 52 00       	call   1695d70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49edc>
 11757ca:	4c 89 f7             	mov    rdi,r14
 11757cd:	31 f6                	xor    esi,esi
 11757cf:	e8 5a 10 00 00       	call   117682e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33dc44>
 11757d4:	49 8b 57 38          	mov    rdx,QWORD PTR [r15+0x38]
 11757d8:	49 8b 4f 40          	mov    rcx,QWORD PTR [r15+0x40]
 11757dc:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
 11757e3:	00 
 11757e4:	48 89 df             	mov    rdi,rbx

## rank 22: score=49 FDE=0x15c1190..0x15c1fd9 features=stride8,begin-end,+10,+18,sret=25
### +0x28 call 0x15c1628
 15c15c6:	00 
 15c15c7:	49 8b 06             	mov    rax,QWORD PTR [r14]
 15c15ca:	4c 89 f7             	mov    rdi,r14
 15c15cd:	ff 50 10             	call   QWORD PTR [rax+0x10]
 15c15d0:	84 c0                	test   al,al
 15c15d2:	0f 84 44 01 00 00    	je     15c171c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x406ca0>
 15c15d8:	49 8b 06             	mov    rax,QWORD PTR [r14]
 15c15db:	4c 89 f7             	mov    rdi,r14
 15c15de:	ff 50 38             	call   QWORD PTR [rax+0x38]
 15c15e1:	48 89 84 24 78 01 00 	mov    QWORD PTR [rsp+0x178],rax
 15c15e8:	00 
 15c15e9:	48 89 94 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rdx
 15c15f0:	00 
 15c15f1:	48 89 ef             	mov    rdi,rbp
 15c15f4:	4c 89 ee             	mov    rsi,r13
 15c15f7:	e8 ac 49 52 ff       	call   ae5fa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x32f48>
 15c15fc:	48 89 ef             	mov    rdi,rbp
 15c15ff:	e8 32 a2 4b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 15c1604:	4c 89 ef             	mov    rdi,r13
 15c1607:	48 89 c6             	mov    rsi,rax
 15c160a:	e8 19 3e 10 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
 15c160f:	49 8b 07             	mov    rax,QWORD PTR [r15]
 15c1612:	48 8d bc 24 08 01 00 	lea    rdi,[rsp+0x108]
 15c1619:	00 
 15c161a:	4c 89 fe             	mov    rsi,r15
 15c161d:	48 8b 54 24 20       	mov    rdx,QWORD PTR [rsp+0x20]
 15c1622:	48 89 e9             	mov    rcx,rbp
 15c1625:	4d 89 e8             	mov    r8,r13
 15c1628:	ff 50 28             	call   QWORD PTR [rax+0x28]
 15c162b:	48 8b 84 24 08 01 00 	mov    rax,QWORD PTR [rsp+0x108]
 15c1632:	00 
 15c1633:	48 85 c0             	test   rax,rax
 15c1636:	74 16                	je     15c164e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x406bd2>
 15c1638:	80 78 04 01          	cmp    BYTE PTR [rax+0x4],0x1
 15c163c:	75 10                	jne    15c164e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x406bd2>
 15c163e:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 15c1645:	00 
 15c1646:	4c 89 ee             	mov    rsi,r13
 15c1649:	e8 ec 1b 65 ff       	call   c1323a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1601da>
 15c164e:	48 8b 84 24 80 00 00 	mov    rax,QWORD PTR [rsp+0x80]
 15c1655:	00 
 15c1656:	66 0f 6f 44 24 70    	movdqa xmm0,XMMWORD PTR [rsp+0x70]
 15c165c:	0f 28 8c 24 50 01 00 	movaps xmm1,XMMWORD PTR [rsp+0x150]
 15c1663:	00 
 15c1664:	0f 29 4c 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm1
 15c1669:	48 8b 8c 24 60 01 00 	mov    rcx,QWORD PTR [rsp+0x160]
 15c1670:	00 
 15c1671:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
 15c1678:	00 
 15c1679:	66 0f 7f 84 24 50 01 	movdqa XMMWORD PTR [rsp+0x150],xmm0
 15c1680:	00 00 
 15c1682:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
 15c1689:	00 
 15c168a:	48 8b 8c 24 90 00 00 	mov    rcx,QWORD PTR [rsp+0x90]
 15c1691:	00 
 15c1692:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
 15c1699:	00 
 15c169a:	48 39 c1             	cmp    rcx,rax
 15c169d:	74 20                	je     15c16bf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x406c43>
 15c169f:	83 79 38 02          	cmp    DWORD PTR [rcx+0x38],0x2
 15c16a3:	be 00 01 00 00       	mov    esi,0x100
 15c16a8:	6a 20                	push   0x20
 15c16aa:	5a                   	pop    rdx

## rank 23: score=49 FDE=0x168a568..0x168c6b7 features=begin-end,+10,+18,+20,sret=27
### +0x28 call 0x168c19b
 168c12d:	41 80 be 84 00 00 00 	cmp    BYTE PTR [r14+0x84],0x0
 168c134:	00 
 168c135:	48 8b 54 24 20       	mov    rdx,QWORD PTR [rsp+0x20]
 168c13a:	0f 84 9c 00 00 00    	je     168c1dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40348>
 168c140:	83 7c 24 50 00       	cmp    DWORD PTR [rsp+0x50],0x0
 168c145:	0f 85 91 00 00 00    	jne    168c1dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40348>
 168c14b:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
 168c14f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 168c152:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
 168c159:	00 
 168c15a:	48 8d ac 24 90 02 00 	lea    rbp,[rsp+0x290]
 168c161:	00 
 168c162:	48 89 ea             	mov    rdx,rbp
 168c165:	48 8d 8c 24 18 02 00 	lea    rcx,[rsp+0x218]
 168c16c:	00 
 168c16d:	ff 50 68             	call   QWORD PTR [rax+0x68]
 168c170:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
 168c177:	00 
 168c178:	48 85 ff             	test   rdi,rdi
 168c17b:	74 07                	je     168c184 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x402f0>
 168c17d:	e8 6a a5 42 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
 168c182:	eb 44                	jmp    168c1c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40334>
 168c184:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
 168c188:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 168c18b:	48 8d bc 24 48 01 00 	lea    rdi,[rsp+0x148]
 168c192:	00 
 168c193:	48 89 ea             	mov    rdx,rbp
 168c196:	48 8b 4c 24 78       	mov    rcx,QWORD PTR [rsp+0x78]
 168c19b:	ff 50 28             	call   QWORD PTR [rax+0x28]
 168c19e:	4c 8b bc 24 48 01 00 	mov    r15,QWORD PTR [rsp+0x148]
 168c1a5:	00 
 168c1a6:	4c 89 ff             	mov    rdi,r15
 168c1a9:	e8 3e a5 42 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
 168c1ae:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
 168c1b5:	00 
 168c1b6:	e8 31 a5 42 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
 168c1bb:	4d 85 ff             	test   r15,r15
 168c1be:	0f 84 30 01 00 00    	je     168c2f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40460>
 168c1c4:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
 168c1c8:	4c 8d ac 24 28 02 00 	lea    r13,[rsp+0x228]
 168c1cf:	00 
 168c1d0:	eb 05                	jmp    168c1d7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40343>
 168c1d2:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
 168c1d7:	48 8b 54 24 20       	mov    rdx,QWORD PTR [rsp+0x20]
 168c1dc:	48 85 d2             	test   rdx,rdx
 168c1df:	74 54                	je     168c235 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x403a1>
 168c1e1:	48 83 bc 24 88 01 00 	cmp    QWORD PTR [rsp+0x188],0x0
 168c1e8:	00 00 
 168c1ea:	75 41                	jne    168c22d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40399>
 168c1ec:	48 8d bc 24 18 02 00 	lea    rdi,[rsp+0x218]
 168c1f3:	00 
 168c1f4:	4c 89 f6             	mov    rsi,r14
 168c1f7:	49 89 d4             	mov    r12,rdx
 168c1fa:	48 8d 8c 24 98 00 00 	lea    rcx,[rsp+0x98]
 168c201:	00 
 168c202:	45 31 c0             	xor    r8d,r8d
 168c205:	e8 bc de ff ff       	call   168a0c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e232>
 168c20a:	48 8b bc 24 88 01 00 	mov    rdi,QWORD PTR [rsp+0x188]
 168c211:	00 
 168c212:	48 8b 84 24 18 02 00 	mov    rax,QWORD PTR [rsp+0x218]
 168c219:	00 
 168c21a:	48 89 84 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rax
 168c221:	00 
### +0x28 call 0x168c5c2
 168c553:	4c 89 ff             	mov    rdi,r15
 168c556:	45 31 c0             	xor    r8d,r8d
 168c559:	e8 de d6 4c ff       	call   b59c3c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa6bdc>
 168c55e:	48 8b bc 24 88 01 00 	mov    rdi,QWORD PTR [rsp+0x188]
 168c565:	00 
 168c566:	49 8b 07             	mov    rax,QWORD PTR [r15]
 168c569:	48 89 84 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rax
 168c570:	00 
 168c571:	e8 76 a1 42 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
 168c576:	e9 20 f4 ff ff       	jmp    168b99b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fb07>
 168c57b:	48 8b 9c 24 b0 01 00 	mov    rbx,QWORD PTR [rsp+0x1b0]
 168c582:	00 
 168c583:	48 8b 45 20          	mov    rax,QWORD PTR [rbp+0x20]
 168c587:	4c 8b 78 48          	mov    r15,QWORD PTR [rax+0x48]
 168c58b:	31 ff                	xor    edi,edi
 168c58d:	e8 5a a1 42 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
 168c592:	4c 39 fb             	cmp    rbx,r15
 168c595:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
 168c59a:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
 168c59e:	0f 83 fe 00 00 00    	jae    168c6a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4080e>
 168c5a4:	48 8b 75 00          	mov    rsi,QWORD PTR [rbp+0x0]
 168c5a8:	48 8d 4d 68          	lea    rcx,[rbp+0x68]
 168c5ac:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 168c5af:	4c 8d bc 24 28 02 00 	lea    r15,[rsp+0x228]
 168c5b6:	00 
 168c5b7:	48 8d 94 24 70 01 00 	lea    rdx,[rsp+0x170]
 168c5be:	00 
 168c5bf:	4c 89 ff             	mov    rdi,r15
 168c5c2:	ff 50 28             	call   QWORD PTR [rax+0x28]
 168c5c5:	49 8b 1f             	mov    rbx,QWORD PTR [r15]
 168c5c8:	48 8b 45 20          	mov    rax,QWORD PTR [rbp+0x20]
 168c5cc:	4c 8b 78 18          	mov    r15,QWORD PTR [rax+0x18]
 168c5d0:	48 85 db             	test   rbx,rbx
 168c5d3:	74 29                	je     168c5fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4076a>
 168c5d5:	4c 8d a4 24 e8 02 00 	lea    r12,[rsp+0x2e8]
 168c5dc:	00 
 168c5dd:	48 8d b4 24 28 02 00 	lea    rsi,[rsp+0x228]
 168c5e4:	00 
 168c5e5:	4c 89 e7             	mov    rdi,r12
 168c5e8:	e8 d9 e6 00 00       	call   169acc6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4ee32>
 168c5ed:	41 f6 04 24 01       	test   BYTE PTR [r12],0x1
 168c5f2:	74 1e                	je     168c612 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4077e>
 168c5f4:	48 8b 94 24 f8 02 00 	mov    rdx,QWORD PTR [rsp+0x2f8]
 168c5fb:	00 
 168c5fc:	eb 1c                	jmp    168c61a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40786>
 168c5fe:	f6 84 24 70 01 00 00 	test   BYTE PTR [rsp+0x170],0x1
 168c605:	01 
 168c606:	74 2d                	je     168c635 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x407a1>
 168c608:	48 8b 94 24 80 01 00 	mov    rdx,QWORD PTR [rsp+0x180]
 168c60f:	00 
 168c610:	eb 2b                	jmp    168c63d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x407a9>
 168c612:	48 8d 94 24 e9 02 00 	lea    rdx,[rsp+0x2e9]
 168c619:	00 
 168c61a:	48 8d 35 14 4d cc fe 	lea    rsi,[rip+0xfffffffffecc4d14]        # 351335 <_ZTSSt12bad_any_cast@@Base-0x3ee93>
 168c621:	4c 89 ff             	mov    rdi,r15
 168c624:	31 c0                	xor    eax,eax
 168c626:	e8 2e e2 00 00       	call   169a859 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4e9c5>
 168c62b:	4c 89 e7             	mov    rdi,r12
 168c62e:	e8 5d 18 16 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 168c633:	eb 4d                	jmp    168c682 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x407ee>
 168c635:	48 8d 94 24 71 01 00 	lea    rdx,[rsp+0x171]
 168c63c:	00 
 168c63d:	48 8d 35 1f bf cd fe 	lea    rsi,[rip+0xfffffffffecdbf1f]        # 368563 <_ZTSSt12bad_any_cast@@Base-0x27c65>

## rank 24: score=48 FDE=0x10aba36..0x10adc15 features=stride8,begin-end,+10,+18,+20,sret=20
### +0x28 call 0x10ad474
 10ad40a:	4c 89 e7             	mov    rdi,r12
 10ad40d:	48 89 de             	mov    rsi,rbx
 10ad410:	e8 dd c7 72 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 10ad415:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 10ad419:	e8 68 10 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad41e:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad425:	00 
 10ad426:	e8 bd d3 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10ad42b:	4c 8b 7d 38          	mov    r15,QWORD PTR [rbp+0x38]
 10ad42f:	4d 85 ff             	test   r15,r15
 10ad432:	74 6e                	je     10ad4a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2748b8>
 10ad434:	4c 8d 84 24 d0 00 00 	lea    r8,[rsp+0xd0]
 10ad43b:	00 
 10ad43c:	49 89 28             	mov    QWORD PTR [r8],rbp
 10ad43f:	48 8d 35 4b fc 9e ff 	lea    rsi,[rip+0xffffffffff9efc4b]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 10ad446:	48 8d 0d f9 d2 00 00 	lea    rcx,[rip+0xd2f9]        # 10ba746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b5c>
 10ad44d:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10ad454:	00 
 10ad455:	6a 08                	push   0x8
 10ad457:	41 59                	pop    r9
 10ad459:	48 89 df             	mov    rdi,rbx
 10ad45c:	31 d2                	xor    edx,edx
 10ad45e:	e8 31 d3 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 10ad463:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10ad466:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 10ad46d:	00 
 10ad46e:	4c 89 fe             	mov    rsi,r15
 10ad471:	48 89 da             	mov    rdx,rbx
 10ad474:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ad477:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]
 10ad47e:	00 
 10ad47f:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
 10ad484:	48 89 de             	mov    rsi,rbx
 10ad487:	e8 66 c7 72 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 10ad48c:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 10ad490:	e8 f1 0f 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad495:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad49c:	00 
 10ad49d:	e8 46 d3 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10ad4a2:	6a 58                	push   0x58
 10ad4a4:	5f                   	pop    rdi
 10ad4a5:	e8 56 0a 74 00       	call   17edf00 <_Znwm@plt>
 10ad4aa:	49 89 c6             	mov    r14,rax
 10ad4ad:	48 8d 05 34 fb 79 00 	lea    rax,[rip+0x79fb34]        # 184cfe8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x96d0>
 10ad4b4:	49 89 06             	mov    QWORD PTR [r14],rax
 10ad4b7:	49 89 6e 08          	mov    QWORD PTR [r14+0x8],rbp
 10ad4bb:	48 8b 84 24 90 01 00 	mov    rax,QWORD PTR [rsp+0x190]
 10ad4c2:	00 
 10ad4c3:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
 10ad4c6:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
 10ad4cb:	0f 57 c0             	xorps  xmm0,xmm0
 10ad4ce:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 10ad4d1:	48 8b 84 24 c0 01 00 	mov    rax,QWORD PTR [rsp+0x1c0]
 10ad4d8:	00 
 10ad4d9:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
 10ad4dd:	49 83 66 48 00       	and    QWORD PTR [r14+0x48],0x0
 10ad4e2:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0
 10ad4e7:	49 83 66 38 00       	and    QWORD PTR [r14+0x38],0x0
 10ad4ec:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 10ad4f1:	48 8b 30             	mov    rsi,QWORD PTR [rax]
 10ad4f4:	48 8d 15 d5 a0 32 ff 	lea    rdx,[rip+0xffffffffff32a0d5]        # 3d75d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21b5>
 10ad4fb:	4c 8d 05 ee a0 32 ff 	lea    r8,[rip+0xffffffffff32a0ee]        # 3d75f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21d5>
 10ad502:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
### +0x28 call 0x10ac37a
 10ac2fd:	48 89 88 38 01 00 00 	mov    QWORD PTR [rax+0x138],rcx
 10ac304:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
 10ac309:	40 88 a8 40 01 00 00 	mov    BYTE PTR [rax+0x140],bpl
 10ac310:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
 10ac315:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 10ac319:	48 8d 15 00 b1 32 ff 	lea    rdx,[rip+0xffffffffff32b100]        # 3d7420 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2005>
 10ac320:	4c 8d 05 19 b1 32 ff 	lea    r8,[rip+0xffffffffff32b119]        # 3d7440 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2025>
 10ac327:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac32e:	00 
 10ac32f:	6a 11                	push   0x11
 10ac331:	59                   	pop    rcx
 10ac332:	6a 20                	push   0x20
 10ac334:	41 59                	pop    r9
 10ac336:	4c 89 f7             	mov    rdi,r14
 10ac339:	e8 8a b1 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ac33e:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
 10ac343:	0f 84 1a 01 00 00    	je     10ac463 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273879>
 10ac349:	48 8d 35 5b c5 32 ff 	lea    rsi,[rip+0xffffffffff32c55b]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ac350:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac357:	00 
 10ac358:	e8 f2 f4 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac35d:	84 c0                	test   al,al
 10ac35f:	0f 84 fe 00 00 00    	je     10ac463 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273879>
 10ac365:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac36c:	00 
 10ac36d:	e8 be a9 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac372:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10ac377:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac37a:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ac37d:	49 89 c6             	mov    r14,rax
 10ac380:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10ac383:	4c 89 ff             	mov    rdi,r15
 10ac386:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ac389:	49 89 c7             	mov    r15,rax
 10ac38c:	bf 80 00 00 00       	mov    edi,0x80
 10ac391:	e8 6a 1b 74 00       	call   17edf00 <_Znwm@plt>
 10ac396:	48 89 c1             	mov    rcx,rax
 10ac399:	48 8d 05 00 0d 7a 00 	lea    rax,[rip+0x7a0d00]        # 184d0a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9788>
 10ac3a0:	48 89 01             	mov    QWORD PTR [rcx],rax
 10ac3a3:	4c 89 71 08          	mov    QWORD PTR [rcx+0x8],r14
 10ac3a7:	4c 89 79 10          	mov    QWORD PTR [rcx+0x10],r15
 10ac3ab:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 10ac3b0:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 10ac3b4:	49 89 cf             	mov    r15,rcx
 10ac3b7:	e8 54 7d ab ff       	call   b64110 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb10b0>
 10ac3bc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
 10ac3c0:	49 89 57 28          	mov    QWORD PTR [r15+0x28],rdx
 10ac3c4:	41 c6 47 30 00       	mov    BYTE PTR [r15+0x30],0x0
 10ac3c9:	49 8d 7f 38          	lea    rdi,[r15+0x38]
 10ac3cd:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]
 10ac3d1:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac3d8:	00 
 10ac3d9:	4c 89 3a             	mov    QWORD PTR [rdx],r15
 10ac3dc:	48 8d 05 81 00 9d ff 	lea    rax,[rip+0xffffffffff9d0081]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac3e3:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
 10ac3e7:	48 8d 05 8e 69 00 00 	lea    rax,[rip+0x698e]        # 10b2d7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a192>
 10ac3ee:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax
 10ac3f2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ac3f5:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10ac3f8:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac3ff:	00 
 10ac400:	4c 89 f7             	mov    rdi,r14
 10ac403:	e8 22 19 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
### +0x28 call 0x10ac386
 10ac315:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 10ac319:	48 8d 15 00 b1 32 ff 	lea    rdx,[rip+0xffffffffff32b100]        # 3d7420 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2005>
 10ac320:	4c 8d 05 19 b1 32 ff 	lea    r8,[rip+0xffffffffff32b119]        # 3d7440 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2025>
 10ac327:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac32e:	00 
 10ac32f:	6a 11                	push   0x11
 10ac331:	59                   	pop    rcx
 10ac332:	6a 20                	push   0x20
 10ac334:	41 59                	pop    r9
 10ac336:	4c 89 f7             	mov    rdi,r14
 10ac339:	e8 8a b1 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ac33e:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
 10ac343:	0f 84 1a 01 00 00    	je     10ac463 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273879>
 10ac349:	48 8d 35 5b c5 32 ff 	lea    rsi,[rip+0xffffffffff32c55b]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ac350:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac357:	00 
 10ac358:	e8 f2 f4 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac35d:	84 c0                	test   al,al
 10ac35f:	0f 84 fe 00 00 00    	je     10ac463 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273879>
 10ac365:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac36c:	00 
 10ac36d:	e8 be a9 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac372:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10ac377:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac37a:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ac37d:	49 89 c6             	mov    r14,rax
 10ac380:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10ac383:	4c 89 ff             	mov    rdi,r15
 10ac386:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ac389:	49 89 c7             	mov    r15,rax
 10ac38c:	bf 80 00 00 00       	mov    edi,0x80
 10ac391:	e8 6a 1b 74 00       	call   17edf00 <_Znwm@plt>
 10ac396:	48 89 c1             	mov    rcx,rax
 10ac399:	48 8d 05 00 0d 7a 00 	lea    rax,[rip+0x7a0d00]        # 184d0a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9788>
 10ac3a0:	48 89 01             	mov    QWORD PTR [rcx],rax
 10ac3a3:	4c 89 71 08          	mov    QWORD PTR [rcx+0x8],r14
 10ac3a7:	4c 89 79 10          	mov    QWORD PTR [rcx+0x10],r15
 10ac3ab:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 10ac3b0:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 10ac3b4:	49 89 cf             	mov    r15,rcx
 10ac3b7:	e8 54 7d ab ff       	call   b64110 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb10b0>
 10ac3bc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
 10ac3c0:	49 89 57 28          	mov    QWORD PTR [r15+0x28],rdx
 10ac3c4:	41 c6 47 30 00       	mov    BYTE PTR [r15+0x30],0x0
 10ac3c9:	49 8d 7f 38          	lea    rdi,[r15+0x38]
 10ac3cd:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]
 10ac3d1:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac3d8:	00 
 10ac3d9:	4c 89 3a             	mov    QWORD PTR [rdx],r15
 10ac3dc:	48 8d 05 81 00 9d ff 	lea    rax,[rip+0xffffffffff9d0081]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac3e3:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
 10ac3e7:	48 8d 05 8e 69 00 00 	lea    rax,[rip+0x698e]        # 10b2d7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a192>
 10ac3ee:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax
 10ac3f2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ac3f5:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10ac3f8:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac3ff:	00 
 10ac400:	4c 89 f7             	mov    rdi,r14
 10ac403:	e8 22 19 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ac408:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]
 10ac40c:	4d 89 3e             	mov    QWORD PTR [r14],r15
 10ac40f:	48 8d 05 4e 00 9d ff 	lea    rax,[rip+0xffffffffff9d004e]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac416:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
### +0x28 call 0x10ac4ec
 10ac473:	e8 88 1a 74 00       	call   17edf00 <_Znwm@plt>
 10ac478:	48 8d 0d 71 0d 7a 00 	lea    rcx,[rip+0x7a0d71]        # 184d1f0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x98d8>
 10ac47f:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
 10ac484:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac487:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 10ac48b:	48 8d 15 de af 32 ff 	lea    rdx,[rip+0xffffffffff32afde]        # 3d7470 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2055>
 10ac492:	4c 8d 05 f7 af 32 ff 	lea    r8,[rip+0xffffffffff32aff7]        # 3d7490 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2075>
 10ac499:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac4a0:	00 
 10ac4a1:	6a 11                	push   0x11
 10ac4a3:	59                   	pop    rcx
 10ac4a4:	6a 19                	push   0x19
 10ac4a6:	41 59                	pop    r9
 10ac4a8:	4c 89 f7             	mov    rdi,r14
 10ac4ab:	e8 18 b0 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ac4b0:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
 10ac4b5:	0f 84 1f 01 00 00    	je     10ac5da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2739f0>
 10ac4bb:	48 8d 35 e9 c3 32 ff 	lea    rsi,[rip+0xffffffffff32c3e9]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ac4c2:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac4c9:	00 
 10ac4ca:	e8 80 f3 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac4cf:	84 c0                	test   al,al
 10ac4d1:	0f 84 03 01 00 00    	je     10ac5da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2739f0>
 10ac4d7:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac4de:	00 
 10ac4df:	e8 4c a8 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac4e4:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10ac4e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac4ec:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ac4ef:	49 89 c6             	mov    r14,rax
 10ac4f2:	bf d8 00 00 00       	mov    edi,0xd8
 10ac4f7:	e8 04 1a 74 00       	call   17edf00 <_Znwm@plt>
 10ac4fc:	48 8d 0d a5 14 7a 00 	lea    rcx,[rip+0x7a14a5]        # 184d9a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa090>
 10ac503:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac506:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
 10ac50a:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
 10ac50f:	48 89 70 10          	mov    QWORD PTR [rax+0x10],rsi
 10ac513:	c6 40 18 00          	mov    BYTE PTR [rax+0x18],0x0
 10ac517:	48 8d 78 20          	lea    rdi,[rax+0x20]
 10ac51b:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac522:	00 
 10ac523:	48 89 02             	mov    QWORD PTR [rdx],rax
 10ac526:	48 8d 0d 37 ff 9c ff 	lea    rcx,[rip+0xffffffffff9cff37]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac52d:	48 89 4a 10          	mov    QWORD PTR [rdx+0x10],rcx
 10ac531:	48 8d 0d fc 3c 01 00 	lea    rcx,[rip+0x13cfc]        # 10c0234 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28764a>
 10ac538:	48 89 4a 18          	mov    QWORD PTR [rdx+0x18],rcx
 10ac53c:	48 8b 0e             	mov    rcx,QWORD PTR [rsi]
 10ac53f:	49 89 c7             	mov    r15,rax
 10ac542:	ff 51 18             	call   QWORD PTR [rcx+0x18]
 10ac545:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac54c:	00 
 10ac54d:	4c 89 f7             	mov    rdi,r14
 10ac550:	e8 d5 17 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ac555:	4c 89 ff             	mov    rdi,r15
 10ac558:	48 83 c7 30          	add    rdi,0x30
 10ac55c:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
 10ac560:	4d 89 3e             	mov    QWORD PTR [r14],r15
 10ac563:	48 8d 05 fa fe 9c ff 	lea    rax,[rip+0xffffffffff9cfefa]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac56a:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
 10ac56e:	48 8d 05 39 3d 01 00 	lea    rax,[rip+0x13d39]        # 10c02ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2876c4>
 10ac575:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
 10ac579:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ac57c:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]

## rank 25: score=47 FDE=0xcfb0a0..0xcfb7bd features=stride8,begin-end,+10,+20,sret=22
### +0x28 call 0xcfb218
  cfb1b9:	e8 76 d0 da ff       	call   aa8234 <JNI_OnUnload@@Base+0x2fb01>
  cfb1be:	4c 8d 25 b7 6d 75 ff 	lea    r12,[rip+0xffffffffff756db7]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
  cfb1c5:	48 8d 0d 5f 43 66 ff 	lea    rcx,[rip+0xffffffffff66435f]        # 35f52b <_ZTSSt12bad_any_cast@@Base-0x30c9d>
  cfb1cc:	6a 04                	push   0x4
  cfb1ce:	5d                   	pop    rbp
  cfb1cf:	6a 70                	push   0x70
  cfb1d1:	5a                   	pop    rdx
  cfb1d2:	89 ef                	mov    edi,ebp
  cfb1d4:	4c 89 e6             	mov    rsi,r12
  cfb1d7:	4d 89 e8             	mov    r8,r13
  cfb1da:	31 c0                	xor    eax,eax
  cfb1dc:	e8 f1 b6 ad 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
  cfb1e1:	4c 8d 43 49          	lea    r8,[rbx+0x49]
  cfb1e5:	f6 43 48 01          	test   BYTE PTR [rbx+0x48],0x1
  cfb1e9:	4c 89 44 24 10       	mov    QWORD PTR [rsp+0x10],r8
  cfb1ee:	74 04                	je     cfb1f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x248194>
  cfb1f0:	4c 8b 43 58          	mov    r8,QWORD PTR [rbx+0x58]
  cfb1f4:	48 8d 0d 55 1c 67 ff 	lea    rcx,[rip+0xffffffffff671c55]        # 36ce50 <_ZTSSt12bad_any_cast@@Base-0x23378>
  cfb1fb:	6a 71                	push   0x71
  cfb1fd:	5a                   	pop    rdx
  cfb1fe:	89 ef                	mov    edi,ebp
  cfb200:	4c 89 e6             	mov    rsi,r12
  cfb203:	31 c0                	xor    eax,eax
  cfb205:	e8 c8 b6 ad 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
  cfb20a:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
  cfb20d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  cfb210:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
  cfb217:	00 
  cfb218:	ff 50 28             	call   QWORD PTR [rax+0x28]
  cfb21b:	bf 70 03 00 00       	mov    edi,0x370
  cfb220:	e8 db 2c af 00       	call   17edf00 <_Znwm@plt>
  cfb225:	49 89 c4             	mov    r12,rax
  cfb228:	0f 28 84 24 a0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xa0]
  cfb22f:	00 
  cfb230:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
  cfb234:	0f 57 c0             	xorps  xmm0,xmm0
  cfb237:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
  cfb23e:	00 
  cfb23f:	48 8d 05 5a f5 b8 00 	lea    rax,[rip+0xb8f55a]        # 188a7a0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x3478>
  cfb246:	49 89 04 24          	mov    QWORD PTR [r12],rax
  cfb24a:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  cfb24d:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
  cfb252:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
  cfb256:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
  cfb25b:	48 85 c0             	test   rax,rax
  cfb25e:	74 05                	je     cfb265 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x248205>
  cfb260:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  cfb265:	41 c7 44 24 18 01 00 	mov    DWORD PTR [r12+0x18],0x1
  cfb26c:	00 00 
  cfb26e:	49 83 64 24 30 00    	and    QWORD PTR [r12+0x30],0x0
  cfb274:	41 0f 29 44 24 20    	movaps XMMWORD PTR [r12+0x20],xmm0
  cfb27a:	49 8d 44 24 40       	lea    rax,[r12+0x40]
  cfb27f:	41 0f 29 44 24 40    	movaps XMMWORD PTR [r12+0x40],xmm0
  cfb285:	49 89 44 24 38       	mov    QWORD PTR [r12+0x38],rax
  cfb28a:	49 83 64 24 50 00    	and    QWORD PTR [r12+0x50],0x0
  cfb290:	31 c0                	xor    eax,eax
  cfb292:	41 88 44 24 58       	mov    BYTE PTR [r12+0x58],al
  cfb297:	49 83 64 24 60 00    	and    QWORD PTR [r12+0x60],0x0
  cfb29d:	41 88 44 24 68       	mov    BYTE PTR [r12+0x68],al
  cfb2a2:	41 88 84 24 80 00 00 	mov    BYTE PTR [r12+0x80],al
  cfb2a9:	00 
  cfb2aa:	41 0f 11 84 24 88 00 	movups XMMWORD PTR [r12+0x88],xmm0
  cfb2b1:	00 00 

## rank 26: score=47 FDE=0xe35e02..0xe366ee features=begin-end,+10,+18,+20,sret=27
### +0x28 call 0xe36146
  e360e0:	4c 89 f2             	mov    rdx,r14
  e360e3:	48 89 e9             	mov    rcx,rbp
  e360e6:	e8 95 57 c4 ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
  e360eb:	84 c0                	test   al,al
  e360ed:	75 1d                	jne    e3610c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103192>
  e360ef:	48 8d 3d a4 73 53 ff 	lea    rdi,[rip+0xffffffffff5373a4]        # 36d49a <_ZTSSt12bad_any_cast@@Base-0x22d2e>
  e360f6:	6a 12                	push   0x12
  e360f8:	5e                   	pop    rsi
  e360f9:	4c 89 f2             	mov    rdx,r14
  e360fc:	48 89 e9             	mov    rcx,rbp
  e360ff:	e8 7c 57 c4 ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
  e36104:	84 c0                	test   al,al
  e36106:	0f 84 3b 02 00 00    	je     e36347 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1033cd>
  e3610c:	41 80 bf e0 01 00 00 	cmp    BYTE PTR [r15+0x1e0],0x0
  e36113:	00 
  e36114:	0f 84 aa 01 00 00    	je     e362c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10334a>
  e3611a:	48 8d 3d 1f c9 50 ff 	lea    rdi,[rip+0xffffffffff50c91f]        # 342a40 <_ZTSSt12bad_any_cast@@Base-0x4d788>
  e36121:	6a 0b                	push   0xb
  e36123:	5e                   	pop    rsi
  e36124:	4c 89 f2             	mov    rdx,r14
  e36127:	48 89 e9             	mov    rcx,rbp
  e3612a:	e8 51 57 c4 ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
  e3612f:	84 c0                	test   al,al
  e36131:	0f 84 b7 03 00 00    	je     e364ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103574>
  e36137:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  e3613b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e3613e:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
  e36145:	00 
  e36146:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e36149:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
  e36150:	00 
  e36151:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
  e36156:	48 8d 94 24 00 02 00 	lea    rdx,[rsp+0x200]
  e3615d:	00 
  e3615e:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
  e36162:	e8 50 08 00 00       	call   e369b7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103a3d>
  e36167:	4c 8d b4 24 00 02 00 	lea    r14,[rsp+0x200]
  e3616e:	00 
  e3616f:	4c 89 f7             	mov    rdi,r14
  e36172:	e8 19 7d 9b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e36177:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
  e3617b:	48 8b 73 60          	mov    rsi,QWORD PTR [rbx+0x60]
  e3617f:	0f 28 84 24 80 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x180]
  e36186:	00 
  e36187:	0f 57 c9             	xorps  xmm1,xmm1
  e3618a:	0f 29 8c 24 80 01 00 	movaps XMMWORD PTR [rsp+0x180],xmm1
  e36191:	00 
  e36192:	48 8d 05 af 7c 9f 00 	lea    rax,[rip+0x9f7caf]        # 182de48 <_ZTIN4asio2ip16bad_address_castE@@Base+0xa478>
  e36199:	49 89 06             	mov    QWORD PTR [r14],rax
  e3619c:	41 0f 11 46 08       	movups XMMWORD PTR [r14+0x8],xmm0
  e361a1:	4d 89 76 20          	mov    QWORD PTR [r14+0x20],r14
  e361a5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e361a8:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  e361af:	00 
  e361b0:	4c 89 e2             	mov    rdx,r12
  e361b3:	4d 89 f0             	mov    r8,r14
  e361b6:	ff 50 20             	call   QWORD PTR [rax+0x20]
  e361b9:	48 83 c3 30          	add    rbx,0x30
  e361bd:	4c 8d b4 24 60 01 00 	lea    r14,[rsp+0x160]
  e361c4:	00 
  e361c5:	48 89 df             	mov    rdi,rbx
  e361c8:	4c 89 f6             	mov    rsi,r14
  e361cb:	e8 4c 36 c8 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
### +0x28 call 0xe36211
  e361a5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e361a8:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  e361af:	00 
  e361b0:	4c 89 e2             	mov    rdx,r12
  e361b3:	4d 89 f0             	mov    r8,r14
  e361b6:	ff 50 20             	call   QWORD PTR [rax+0x20]
  e361b9:	48 83 c3 30          	add    rbx,0x30
  e361bd:	4c 8d b4 24 60 01 00 	lea    r14,[rsp+0x160]
  e361c4:	00 
  e361c5:	48 89 df             	mov    rdi,rbx
  e361c8:	4c 89 f6             	mov    rsi,r14
  e361cb:	e8 4c 36 c8 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  e361d0:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
  e361d4:	e8 ad 82 c6 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e361d9:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
  e361e0:	00 
  e361e1:	e8 84 3d c4 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e361e6:	e9 cf 03 00 00       	jmp    e365ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103640>
  e361eb:	48 8d 35 2b 50 4f ff 	lea    rsi,[rip+0xffffffffff4f502b]        # 32b21d <_ZTSSt12bad_any_cast@@Base-0x64fab>
  e361f2:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
  e361f9:	00 
  e361fa:	6a 0a                	push   0xa
  e361fc:	5a                   	pop    rdx
  e361fd:	e8 18 68 c6 ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
  e36202:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  e36206:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e36209:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  e36210:	00 
  e36211:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e36214:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  e36219:	48 8d b4 24 00 02 00 	lea    rsi,[rsp+0x200]
  e36220:	00 
  e36221:	48 8d 94 24 60 01 00 	lea    rdx,[rsp+0x160]
  e36228:	00 
  e36229:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
  e3622d:	e8 a3 06 00 00       	call   e368d5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10395b>
  e36232:	49 81 c7 48 02 00 00 	add    r15,0x248
  e36239:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  e36240:	00 
  e36241:	e8 4a 7c 9b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e36246:	4c 8d b4 24 00 02 00 	lea    r14,[rsp+0x200]
  e3624d:	00 
  e3624e:	4c 89 f7             	mov    rdi,r14
  e36251:	e8 3a 7c 9b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e36256:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
  e3625a:	48 8b 73 60          	mov    rsi,QWORD PTR [rbx+0x60]
  e3625e:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]
  e36263:	0f 57 c9             	xorps  xmm1,xmm1
  e36266:	0f 29 4c 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm1
  e3626b:	48 8d 05 8e 7b 9f 00 	lea    rax,[rip+0x9f7b8e]        # 182de00 <_ZTIN4asio2ip16bad_address_castE@@Base+0xa430>
  e36272:	49 89 06             	mov    QWORD PTR [r14],rax
  e36275:	41 0f 11 46 08       	movups XMMWORD PTR [r14+0x8],xmm0
  e3627a:	4d 89 76 20          	mov    QWORD PTR [r14+0x20],r14
  e3627e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e36281:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  e36288:	00 
  e36289:	4c 89 fa             	mov    rdx,r15
  e3628c:	4d 89 f0             	mov    r8,r14
  e3628f:	ff 50 18             	call   QWORD PTR [rax+0x18]
  e36292:	48 83 c3 50          	add    rbx,0x50
  e36296:	4c 8d b4 24 60 01 00 	lea    r14,[rsp+0x160]
  e3629d:	00 
  e3629e:	48 89 df             	mov    rdi,rbx
### +0x28 call 0xe363a5
  e3633b:	88 03                	mov    BYTE PTR [rbx],al
  e3633d:	88 43 70             	mov    BYTE PTR [rbx+0x70],al
  e36340:	6a 08                	push   0x8
  e36342:	e9 31 03 00 00       	jmp    e36678 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1036fe>
  e36347:	48 8d 3d aa b1 52 ff 	lea    rdi,[rip+0xffffffffff52b1aa]        # 3614f8 <_ZTSSt12bad_any_cast@@Base-0x2ecd0>
  e3634e:	6a 07                	push   0x7
  e36350:	5e                   	pop    rsi
  e36351:	4c 89 f2             	mov    rdx,r14
  e36354:	48 89 e9             	mov    rcx,rbp
  e36357:	e8 24 55 c4 ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
  e3635c:	84 c0                	test   al,al
  e3635e:	0f 84 69 02 00 00    	je     e365cd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103653>
  e36364:	48 8b 6b 60          	mov    rbp,QWORD PTR [rbx+0x60]
  e36368:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
  e3636c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  e36371:	48 89 9c 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rbx
  e36378:	00 
  e36379:	0f 57 c0             	xorps  xmm0,xmm0
  e3637c:	48 8d 54 24 40       	lea    rdx,[rsp+0x40]
  e36381:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
  e36384:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
  e36389:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  e36390:	00 
  e36391:	4c 89 ee             	mov    rsi,r13
  e36394:	e8 a3 71 d5 ff       	call   b8d53c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda4dc>
  e36399:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  e3639d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e363a0:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
  e363a5:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e363a8:	4c 8d b4 24 08 02 00 	lea    r14,[rsp+0x208]
  e363af:	00 
  e363b0:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
  e363b7:	00 
  e363b8:	48 8d 54 24 28       	lea    rdx,[rsp+0x28]
  e363bd:	4c 89 f7             	mov    rdi,r14
  e363c0:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
  e363c4:	e8 0c 05 00 00       	call   e368d5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10395b>
  e363c9:	4c 8d ac 24 18 02 00 	lea    r13,[rsp+0x218]
  e363d0:	00 
  e363d1:	49 8d b7 10 01 00 00 	lea    rsi,[r15+0x110]
  e363d8:	4c 89 ef             	mov    rdi,r13
  e363db:	e8 60 7b 9b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  e363e0:	4c 8d a4 24 30 02 00 	lea    r12,[rsp+0x230]
  e363e7:	00 
  e363e8:	49 81 c7 58 01 00 00 	add    r15,0x158
  e363ef:	4c 89 e7             	mov    rdi,r12
  e363f2:	4c 89 fe             	mov    rsi,r15
  e363f5:	e8 46 7b 9b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  e363fa:	48 83 a4 24 a0 01 00 	and    QWORD PTR [rsp+0x1a0],0x0
  e36401:	00 00 
  e36403:	6a 50                	push   0x50
  e36405:	5f                   	pop    rdi
  e36406:	e8 f5 7a 9b 00       	call   17edf00 <_Znwm@plt>
  e3640b:	48 8d 0d c6 7a 9f 00 	lea    rcx,[rip+0x9f7ac6]        # 182ded8 <_ZTIN4asio2ip16bad_address_castE@@Base+0xa508>
  e36412:	48 89 08             	mov    QWORD PTR [rax],rcx
  e36415:	0f 28 84 24 00 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x200]
  e3641c:	00 
  e3641d:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  e36421:	48 8b 8c 24 10 02 00 	mov    rcx,QWORD PTR [rsp+0x210]
  e36428:	00 
  e36429:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
  e3642d:	0f 57 c0             	xorps  xmm0,xmm0
  e36430:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
### +0x28 call 0xe3651a
  e364a5:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
  e364a9:	e8 d8 7f c6 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e364ae:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
  e364b5:	00 
  e364b6:	e8 af 3a c4 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e364bb:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
  e364c2:	00 
  e364c3:	e8 ee 05 00 00       	call   e36ab6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103b3c>
  e364c8:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
  e364cd:	e8 be 79 9b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e364d2:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  e364d9:	00 
  e364da:	e8 b1 79 9b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e364df:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  e364e4:	e8 a7 79 9b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e364e9:	e9 b2 01 00 00       	jmp    e366a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103726>
  e364ee:	48 8d 3d a5 6f 53 ff 	lea    rdi,[rip+0xffffffffff536fa5]        # 36d49a <_ZTSSt12bad_any_cast@@Base-0x22d2e>
  e364f5:	6a 12                	push   0x12
  e364f7:	5e                   	pop    rsi
  e364f8:	4c 89 f2             	mov    rdx,r14
  e364fb:	48 89 e9             	mov    rcx,rbp
  e364fe:	e8 7d 53 c4 ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
  e36503:	84 c0                	test   al,al
  e36505:	0f 84 95 01 00 00    	je     e366a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103726>
  e3650b:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  e3650f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e36512:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
  e36519:	00 
  e3651a:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e3651d:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
  e36524:	00 
  e36525:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
  e3652a:	48 8d 94 24 00 02 00 	lea    rdx,[rsp+0x200]
  e36531:	00 
  e36532:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
  e36536:	e8 7c 04 00 00       	call   e369b7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103a3d>
  e3653b:	4c 8d b4 24 00 02 00 	lea    r14,[rsp+0x200]
  e36542:	00 
  e36543:	4c 89 f7             	mov    rdi,r14
  e36546:	e8 45 79 9b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e3654b:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
  e3654f:	48 8b 73 60          	mov    rsi,QWORD PTR [rbx+0x60]
  e36553:	0f 28 84 24 80 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x180]
  e3655a:	00 
  e3655b:	0f 57 c9             	xorps  xmm1,xmm1
  e3655e:	0f 29 8c 24 80 01 00 	movaps XMMWORD PTR [rsp+0x180],xmm1
  e36565:	00 
  e36566:	48 8d 05 23 79 9f 00 	lea    rax,[rip+0x9f7923]        # 182de90 <_ZTIN4asio2ip16bad_address_castE@@Base+0xa4c0>
  e3656d:	49 89 06             	mov    QWORD PTR [r14],rax
  e36570:	41 0f 11 46 08       	movups XMMWORD PTR [r14+0x8],xmm0
  e36575:	4d 89 76 20          	mov    QWORD PTR [r14+0x20],r14
  e36579:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e3657c:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  e36583:	00 
  e36584:	4c 89 e2             	mov    rdx,r12
  e36587:	4d 89 f0             	mov    r8,r14
  e3658a:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e3658d:	48 83 c3 40          	add    rbx,0x40
  e36591:	4c 8d b4 24 60 01 00 	lea    r14,[rsp+0x160]
  e36598:	00 
  e36599:	48 89 df             	mov    rdi,rbx
  e3659c:	4c 89 f6             	mov    rsi,r14
  e3659f:	e8 78 32 c8 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>

## rank 27: score=47 FDE=0x1178064..0x1178520 features=stride8,begin-end,+10,+18,+20,sret=17
### +0x28 call 0x11780f8
 1178088:	00 
 1178089:	80 7e 68 00          	cmp    BYTE PTR [rsi+0x68],0x0
 117808d:	74 09                	je     1178098 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33f4ae>
 117808f:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 1178093:	e9 dd 01 00 00       	jmp    1178275 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33f68b>
 1178098:	49 89 ce             	mov    r14,rcx
 117809b:	49 89 d4             	mov    r12,rdx
 117809e:	49 89 f7             	mov    r15,rsi
 11780a1:	48 83 64 24 38 00    	and    QWORD PTR [rsp+0x38],0x0
 11780a7:	66 c7 44 24 30 01 01 	mov    WORD PTR [rsp+0x30],0x101
 11780ae:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
 11780b4:	0f 57 c0             	xorps  xmm0,xmm0
 11780b7:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
 11780bc:	4c 8d 2d b0 26 1f ff 	lea    r13,[rip+0xffffffffff1f26b0]        # 36a773 <_ZTSSt12bad_any_cast@@Base-0x25a55>
 11780c3:	4c 89 ac 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],r13
 11780ca:	00 
 11780cb:	6a 14                	push   0x14
 11780cd:	5e                   	pop    rsi
 11780ce:	4c 89 ef             	mov    rdi,r13
 11780d1:	e8 3a 64 67 00       	call   17ee510 <__strlen_chk@plt>
 11780d6:	48 8d 8c 24 c0 00 00 	lea    rcx,[rsp+0xc0]
 11780dd:	00 
 11780de:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
 11780e2:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 11780e6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11780e9:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 11780ee:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
 11780f3:	4c 8d 44 24 10       	lea    r8,[rsp+0x10]
 11780f8:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11780fb:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 1178100:	48 85 c0             	test   rax,rax
 1178103:	74 14                	je     1178119 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33f52f>
 1178105:	80 78 04 01          	cmp    BYTE PTR [rax+0x4],0x1
 1178109:	74 3c                	je     1178147 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33f55d>
 117810b:	48 89 03             	mov    QWORD PTR [rbx],rax
 117810e:	48 83 64 24 08 00    	and    QWORD PTR [rsp+0x8],0x0
 1178114:	e9 48 01 00 00       	jmp    1178261 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33f677>
 1178119:	48 8d 35 5d 9e 2d ff 	lea    rsi,[rip+0xffffffffff2d9e5d]        # 451f7d <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b89>
 1178120:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 1178125:	e8 25 37 90 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 117812a:	84 c0                	test   al,al
 117812c:	75 19                	jne    1178147 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33f55d>
 117812e:	48 8d 35 3b f5 1b ff 	lea    rsi,[rip+0xffffffffff1bf53b]        # 337670 <_ZTSSt12bad_any_cast@@Base-0x58b58>
 1178135:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 117813a:	e8 10 37 90 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 117813f:	84 c0                	test   al,al
 1178141:	0f 84 57 01 00 00    	je     117829e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33f6b4>
 1178147:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
 117814b:	48 8b 70 78          	mov    rsi,QWORD PTR [rax+0x78]
 117814f:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
 1178156:	00 
 1178157:	e8 4c af 43 00       	call   15b30a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f862c>
 117815c:	4c 8b b4 24 88 00 00 	mov    r14,QWORD PTR [rsp+0x88]
 1178163:	00 
 1178164:	4d 85 f6             	test   r14,r14
 1178167:	0f 84 c9 00 00 00    	je     1178236 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33f64c>
 117816d:	49 8b 06             	mov    rax,QWORD PTR [r14]
 1178170:	4c 89 f7             	mov    rdi,r14
 1178173:	ff 50 18             	call   QWORD PTR [rax+0x18]
 1178176:	49 8b 06             	mov    rax,QWORD PTR [r14]
 1178179:	4c 89 f7             	mov    rdi,r14
 117817c:	ff 50 10             	call   QWORD PTR [rax+0x10]
 117817f:	84 c0                	test   al,al

## rank 28: score=46 FDE=0x107a02c..0x107e484 features=stride8,begin-end,+10,+18,sret=22
### +0x28 call 0x107b5e8
 107b56a:	41 88 46 70          	mov    BYTE PTR [r14+0x70],al
 107b56e:	41 88 86 d8 00 00 00 	mov    BYTE PTR [r14+0xd8],al
 107b575:	49 83 a6 e0 00 00 00 	and    QWORD PTR [r14+0xe0],0x0
 107b57c:	00 
 107b57d:	49 8b 4e 08          	mov    rcx,QWORD PTR [r14+0x8]
 107b581:	49 89 8e e8 00 00 00 	mov    QWORD PTR [r14+0xe8],rcx
 107b588:	41 88 86 f0 00 00 00 	mov    BYTE PTR [r14+0xf0],al
 107b58f:	49 83 a6 f8 00 00 00 	and    QWORD PTR [r14+0xf8],0x0
 107b596:	00 
 107b597:	4d 8d 7e 70          	lea    r15,[r14+0x70]
 107b59b:	4d 8d ae f8 00 00 00 	lea    r13,[r14+0xf8]
 107b5a2:	4c 89 f7             	mov    rdi,r14
 107b5a5:	48 81 c7 00 01 00 00 	add    rdi,0x100
 107b5ac:	e8 79 a1 ae ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
 107b5b1:	48 8d 9c 24 10 04 00 	lea    rbx,[rsp+0x410]
 107b5b8:	00 
 107b5b9:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 107b5bd:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]
 107b5c4:	00 
 107b5c5:	4c 89 f6             	mov    rsi,r14
 107b5c8:	e8 43 30 00 00       	call   107e610 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245a26>
 107b5cd:	48 89 df             	mov    rdi,rbx
 107b5d0:	e8 85 30 00 00       	call   107e65a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245a70>
 107b5d5:	48 8b b4 24 38 05 00 	mov    rsi,QWORD PTR [rsp+0x538]
 107b5dc:	00 
 107b5dd:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 107b5e0:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
 107b5e7:	00 
 107b5e8:	ff 50 28             	call   QWORD PTR [rax+0x28]
 107b5eb:	bf 40 01 00 00       	mov    edi,0x140
 107b5f0:	e8 0b 29 77 00       	call   17edf00 <_Znwm@plt>
 107b5f5:	4c 8b a4 24 10 05 00 	mov    r12,QWORD PTR [rsp+0x510]
 107b5fc:	00 
 107b5fd:	48 89 c3             	mov    rbx,rax
 107b600:	48 8d 05 89 8b 7e 00 	lea    rax,[rip+0x7e8b89]        # 1864190 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20878>
 107b607:	48 89 03             	mov    QWORD PTR [rbx],rax
 107b60a:	48 8b 84 24 18 04 00 	mov    rax,QWORD PTR [rsp+0x418]
 107b611:	00 
 107b612:	66 0f 6f 84 24 10 04 	movdqa xmm0,XMMWORD PTR [rsp+0x410]
 107b619:	00 00 
 107b61b:	f3 0f 7f 43 08       	movdqu XMMWORD PTR [rbx+0x8],xmm0
 107b620:	48 85 c0             	test   rax,rax
 107b623:	74 05                	je     107b62a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x242a40>
 107b625:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
 107b62a:	c6 43 20 00          	mov    BYTE PTR [rbx+0x20],0x0
 107b62e:	66 0f ef c0          	pxor   xmm0,xmm0
 107b632:	48 83 63 38 00       	and    QWORD PTR [rbx+0x38],0x0
 107b637:	f3 0f 7f 43 28       	movdqu XMMWORD PTR [rbx+0x28],xmm0
 107b63c:	48 8d 05 bd 11 79 00 	lea    rax,[rip+0x7911bd]        # 180c800 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x24c0>
 107b643:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 107b647:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
 107b64b:	48 8d 35 34 0f 36 ff 	lea    rsi,[rip+0xffffffffff360f34]        # 3dc586 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x1fd5>
 107b652:	48 8d 0d 30 0f 36 ff 	lea    rcx,[rip+0xffffffffff360f30]        # 3dc589 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x1fd8>
 107b659:	6a 02                	push   0x2
 107b65b:	5a                   	pop    rdx
 107b65c:	6a 03                	push   0x3
 107b65e:	41 58                	pop    r8
 107b660:	6a 01                	push   0x1
 107b662:	41 59                	pop    r9
 107b664:	e8 39 e4 ad ff       	call   b59aa2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa6a42>
 107b669:	66 0f ef c0          	pxor   xmm0,xmm0
 107b66d:	f3 0f 7f 83 c8 00 00 	movdqu XMMWORD PTR [rbx+0xc8],xmm0
 107b674:	00 
### +0x28 call 0x107a3aa
 107a33d:	4d 89 e8             	mov    r8,r13
 107a340:	4d 89 f1             	mov    r9,r14
 107a343:	e8 80 d1 56 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 107a348:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
 107a34c:	74 1b                	je     107a369 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24177f>
 107a34e:	48 8d 35 22 df 2a ff 	lea    rsi,[rip+0xffffffffff2adf22]        # 328277 <_ZTSSt12bad_any_cast@@Base-0x67f51>
 107a355:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
 107a35c:	00 
 107a35d:	e8 ed 14 a0 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 107a362:	89 c3                	mov    ebx,eax
 107a364:	80 f3 01             	xor    bl,0x1
 107a367:	eb 02                	jmp    107a36b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x241781>
 107a369:	b3 01                	mov    bl,0x1
 107a36b:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
 107a372:	00 
 107a373:	e8 b8 c9 a2 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 107a378:	84 db                	test   bl,bl
 107a37a:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
 107a37f:	0f 84 c8 01 00 00    	je     107a54d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x241963>
 107a385:	48 8b 84 24 48 05 00 	mov    rax,QWORD PTR [rsp+0x548]
 107a38c:	00 
 107a38d:	80 78 06 00          	cmp    BYTE PTR [rax+0x6],0x0
 107a391:	0f 84 b6 01 00 00    	je     107a54d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x241963>
 107a397:	48 8b b4 24 38 05 00 	mov    rsi,QWORD PTR [rsp+0x538]
 107a39e:	00 
 107a39f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 107a3a2:	48 8d bc 24 a0 04 00 	lea    rdi,[rsp+0x4a0]
 107a3a9:	00 
 107a3aa:	ff 50 28             	call   QWORD PTR [rax+0x28]
 107a3ad:	bf 10 05 00 00       	mov    edi,0x510
 107a3b2:	e8 49 3b 77 00       	call   17edf00 <_Znwm@plt>
 107a3b7:	49 89 c6             	mov    r14,rax
 107a3ba:	66 0f ef c9          	pxor   xmm1,xmm1
 107a3be:	f3 0f 7f 48 08       	movdqu XMMWORD PTR [rax+0x8],xmm1
 107a3c3:	48 8d 05 9e 30 78 00 	lea    rax,[rip+0x78309e]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
 107a3ca:	49 89 06             	mov    QWORD PTR [r14],rax
 107a3cd:	49 8d 46 18          	lea    rax,[r14+0x18]
 107a3d1:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 107a3d6:	0f 28 84 24 a0 04 00 	movaps xmm0,XMMWORD PTR [rsp+0x4a0]
 107a3dd:	00 
 107a3de:	66 0f 7f 8c 24 a0 04 	movdqa XMMWORD PTR [rsp+0x4a0],xmm1
 107a3e5:	00 00 
 107a3e7:	48 8d 05 6a 8a 80 00 	lea    rax,[rip+0x808a6a]        # 1882e58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3f540>
 107a3ee:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
 107a3f2:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
 107a3f7:	4d 8d 66 30          	lea    r12,[r14+0x30]
 107a3fb:	48 8d 35 01 75 30 ff 	lea    rsi,[rip+0xffffffffff307501]        # 381903 <_ZTSSt12bad_any_cast@@Base-0xe8c5>
 107a402:	6a 05                	push   0x5
 107a404:	5b                   	pop    rbx
 107a405:	4c 89 e7             	mov    rdi,r12
 107a408:	48 89 da             	mov    rdx,rbx
 107a40b:	e8 62 c9 51 00       	call   1596d72 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3dc2f6>
 107a410:	49 8d be b8 00 00 00 	lea    rdi,[r14+0xb8]
 107a417:	48 8d 35 59 fb 3b ff 	lea    rsi,[rip+0xffffffffff3bfb59]        # 439f77 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f9c6>
 107a41e:	48 89 da             	mov    rdx,rbx
 107a421:	e8 4c c9 51 00       	call   1596d72 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3dc2f6>
 107a426:	49 8d be 40 01 00 00 	lea    rdi,[r14+0x140]
 107a42d:	48 8d 1d 5c 44 30 ff 	lea    rbx,[rip+0xffffffffff30445c]        # 37e890 <_ZTSSt12bad_any_cast@@Base-0x11938>
 107a434:	6a 03                	push   0x3
 107a436:	41 5d                	pop    r13
 107a438:	48 89 de             	mov    rsi,rbx
 107a43b:	4c 89 ea             	mov    rdx,r13
 107a43e:	e8 2f c9 51 00       	call   1596d72 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3dc2f6>
### +0x28 call 0x107b070
 107b002:	4c 89 e9             	mov    rcx,r13
 107b005:	49 89 d8             	mov    r8,rbx
 107b008:	45 31 c9             	xor    r9d,r9d
 107b00b:	e8 4e c5 56 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
 107b010:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 107b014:	4c 89 e6             	mov    rsi,r12
 107b017:	4c 89 f2             	mov    rdx,r14
 107b01a:	4c 89 e9             	mov    rcx,r13
 107b01d:	49 89 d8             	mov    r8,rbx
 107b020:	45 31 c9             	xor    r9d,r9d
 107b023:	e8 62 c3 56 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
 107b028:	49 83 27 00          	and    QWORD PTR [r15],0x0
 107b02c:	41 88 07             	mov    BYTE PTR [r15],al
 107b02f:	48 8d 05 58 99 ba ff 	lea    rax,[rip+0xffffffffffba9958]        # c2498e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17192e>
 107b036:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
 107b03a:	48 8d 05 73 35 00 00 	lea    rax,[rip+0x3573]        # 107e5b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2459ca>
 107b041:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
 107b045:	48 8d 9c 24 10 04 00 	lea    rbx,[rsp+0x410]
 107b04c:	00 
 107b04d:	48 89 df             	mov    rdi,rbx
 107b050:	48 8b b4 24 a0 00 00 	mov    rsi,QWORD PTR [rsp+0xa0]
 107b057:	00 
 107b058:	e8 5f 34 00 00       	call   107e4bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2458d2>
 107b05d:	48 89 df             	mov    rdi,rbx
 107b060:	e8 29 35 00 00       	call   107e58e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2459a4>
 107b065:	48 8b bc 24 40 05 00 	mov    rdi,QWORD PTR [rsp+0x540]
 107b06c:	00 
 107b06d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 107b070:	ff 50 28             	call   QWORD PTR [rax+0x28]
 107b073:	48 89 c3             	mov    rbx,rax
 107b076:	48 83 a4 24 10 04 00 	and    QWORD PTR [rsp+0x410],0x0
 107b07d:	00 00 
 107b07f:	48 83 a4 24 20 04 00 	and    QWORD PTR [rsp+0x420],0x0
 107b086:	00 00 
 107b088:	6a 18                	push   0x18
 107b08a:	5f                   	pop    rdi
 107b08b:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
 107b090:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
 107b095:	e8 66 2e 77 00       	call   17edf00 <_Znwm@plt>
 107b09a:	48 89 18             	mov    QWORD PTR [rax],rbx
 107b09d:	48 8b 8c 24 a8 00 00 	mov    rcx,QWORD PTR [rsp+0xa8]
 107b0a4:	00 
 107b0a5:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 107b0a9:	48 8b 8c 24 a0 00 00 	mov    rcx,QWORD PTR [rsp+0xa0]
 107b0b0:	00 
 107b0b1:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
 107b0b5:	48 89 84 24 10 04 00 	mov    QWORD PTR [rsp+0x410],rax
 107b0bc:	00 
 107b0bd:	48 8d 15 4a 72 ae ff 	lea    rdx,[rip+0xffffffffffae724a]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
 107b0c4:	48 89 94 24 20 04 00 	mov    QWORD PTR [rsp+0x420],rdx
 107b0cb:	00 
 107b0cc:	48 8d 35 17 35 00 00 	lea    rsi,[rip+0x3517]        # 107e5ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245a00>
 107b0d3:	48 89 b4 24 28 04 00 	mov    QWORD PTR [rsp+0x428],rsi
 107b0da:	00 
 107b0db:	49 8b 8d d0 00 00 00 	mov    rcx,QWORD PTR [r13+0xd0]
 107b0e2:	48 85 c9             	test   rcx,rcx
 107b0e5:	74 53                	je     107b13a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x242550>
 107b0e7:	48 89 84 24 a0 04 00 	mov    QWORD PTR [rsp+0x4a0],rax
 107b0ee:	00 
 107b0ef:	6a 01                	push   0x1
 107b0f1:	5f                   	pop    rdi
 107b0f2:	48 8d b4 24 10 04 00 	lea    rsi,[rsp+0x410]
 107b0f9:	00 
### +0x28 call 0x107b91b
 107b8af:	84 c0                	test   al,al
 107b8b1:	74 12                	je     107b8c5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x242cdb>
 107b8b3:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
 107b8ba:	00 
 107b8bb:	e8 70 b4 a2 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 107b8c0:	45 31 ed             	xor    r13d,r13d
 107b8c3:	eb 39                	jmp    107b8fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x242d14>
 107b8c5:	48 8d 35 94 b2 35 ff 	lea    rsi,[rip+0xffffffffff35b294]        # 3d6b60 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1745>
 107b8cc:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
 107b8d3:	00 
 107b8d4:	e8 76 ff 9f ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 107b8d9:	84 c0                	test   al,al
 107b8db:	0f 84 ec 1c 00 00    	je     107d5cd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2449e3>
 107b8e1:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
 107b8e8:	00 
 107b8e9:	e8 42 b4 a2 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 107b8ee:	48 8b 84 24 48 05 00 	mov    rax,QWORD PTR [rsp+0x548]
 107b8f5:	00 
 107b8f6:	80 78 04 00          	cmp    BYTE PTR [rax+0x4],0x0
 107b8fa:	41 0f 95 c5          	setne  r13b
 107b8fe:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
 107b902:	4c 8b 30             	mov    r14,QWORD PTR [rax]
 107b905:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
 107b90c:	00 
 107b90d:	48 8b 28             	mov    rbp,QWORD PTR [rax]
 107b910:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
 107b917:	00 
 107b918:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 107b91b:	ff 50 28             	call   QWORD PTR [rax+0x28]
 107b91e:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
 107b925:	00 
 107b926:	48 8b bc 24 40 05 00 	mov    rdi,QWORD PTR [rsp+0x540]
 107b92d:	00 
 107b92e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 107b931:	ff 50 28             	call   QWORD PTR [rax+0x28]
 107b934:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
 107b93b:	00 
 107b93c:	48 8b 74 24 70       	mov    rsi,QWORD PTR [rsp+0x70]
 107b941:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 107b944:	48 8d 9c 24 00 02 00 	lea    rbx,[rsp+0x200]
 107b94b:	00 
 107b94c:	48 89 df             	mov    rdi,rbx
 107b94f:	ff 50 10             	call   QWORD PTR [rax+0x10]
 107b952:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
 107b956:	66 0f 7f 84 24 f0 00 	movdqa XMMWORD PTR [rsp+0xf0],xmm0
 107b95d:	00 00 
 107b95f:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
 107b963:	48 85 c0             	test   rax,rax
 107b966:	74 05                	je     107b96d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x242d83>
 107b968:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
 107b96d:	49 8b 87 10 01 00 00 	mov    rax,QWORD PTR [r15+0x110]
 107b974:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
 107b97b:	00 
 107b97c:	48 8d 05 25 df 7c 00 	lea    rax,[rip+0x7cdf25]        # 18498a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5f90>
 107b983:	48 8d 8c 24 50 03 00 	lea    rcx,[rsp+0x350]
 107b98a:	00 
 107b98b:	48 89 01             	mov    QWORD PTR [rcx],rax
 107b98e:	48 8b 84 24 28 05 00 	mov    rax,QWORD PTR [rsp+0x528]
 107b995:	00 
 107b996:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
 107b99a:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
 107b99e:	49 8b 47 58          	mov    rax,QWORD PTR [r15+0x58]
 107b9a2:	48 89 84 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rax

## rank 29: score=46 FDE=0x135d056..0x1360c1b features=stride8,begin-end,+10,+18,sret=22
### +0x28 call 0x135dd3c
 135dcdf:	48 89 01             	mov    QWORD PTR [rcx],rax
 135dce2:	48 85 ff             	test   rdi,rdi
 135dce5:	74 06                	je     135dced <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a3271>
 135dce7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 135dcea:	ff 50 08             	call   QWORD PTR [rax+0x8]
 135dced:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
 135dcf2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 135dcf5:	ff 50 28             	call   QWORD PTR [rax+0x28]
 135dcf8:	49 89 c4             	mov    r12,rax
 135dcfb:	49 8b 07             	mov    rax,QWORD PTR [r15]
 135dcfe:	4c 89 ff             	mov    rdi,r15
 135dd01:	ff 50 40             	call   QWORD PTR [rax+0x40]
 135dd04:	49 89 c5             	mov    r13,rax
 135dd07:	49 8b 07             	mov    rax,QWORD PTR [r15]
 135dd0a:	4c 89 ff             	mov    rdi,r15
 135dd0d:	ff 50 30             	call   QWORD PTR [rax+0x30]
 135dd10:	48 8d bc 24 b0 08 00 	lea    rdi,[rsp+0x8b0]
 135dd17:	00 
 135dd18:	48 89 c6             	mov    rsi,rax
 135dd1b:	e8 70 c5 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 135dd20:	48 8b b4 24 68 10 00 	mov    rsi,QWORD PTR [rsp+0x1068]
 135dd27:	00 
 135dd28:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 135dd2b:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
 135dd32:	00 
 135dd33:	ff 50 30             	call   QWORD PTR [rax+0x30]
 135dd36:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 135dd39:	48 89 df             	mov    rdi,rbx
 135dd3c:	ff 50 28             	call   QWORD PTR [rax+0x28]
 135dd3f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 135dd44:	48 8b bc 24 a8 10 00 	mov    rdi,QWORD PTR [rsp+0x10a8]
 135dd4b:	00 
 135dd4c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 135dd4f:	ff 50 28             	call   QWORD PTR [rax+0x28]
 135dd52:	49 89 c7             	mov    r15,rax
 135dd55:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 135dd58:	48 89 df             	mov    rdi,rbx
 135dd5b:	ff 50 38             	call   QWORD PTR [rax+0x38]
 135dd5e:	48 8d bc 24 50 08 00 	lea    rdi,[rsp+0x850]
 135dd65:	00 
 135dd66:	48 89 c6             	mov    rsi,rax
 135dd69:	e8 22 c5 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 135dd6e:	48 8b 9c 24 60 10 00 	mov    rbx,QWORD PTR [rsp+0x1060]
 135dd75:	00 
 135dd76:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 135dd79:	48 89 df             	mov    rdi,rbx
 135dd7c:	ff 50 30             	call   QWORD PTR [rax+0x30]
 135dd7f:	48 8d bc 24 80 08 00 	lea    rdi,[rsp+0x880]
 135dd86:	00 
 135dd87:	48 89 c6             	mov    rsi,rax
 135dd8a:	e8 01 c5 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 135dd8f:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 135dd92:	48 89 df             	mov    rdi,rbx
 135dd95:	ff 50 28             	call   QWORD PTR [rax+0x28]
 135dd98:	48 89 c3             	mov    rbx,rax
 135dd9b:	6a 10                	push   0x10
 135dd9d:	5f                   	pop    rdi
 135dd9e:	e8 5d 01 49 00       	call   17edf00 <_Znwm@plt>
 135dda3:	48 8d 0d 96 a1 50 00 	lea    rcx,[rip+0x50a196]        # 1867f40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24628>
 135ddaa:	48 89 08             	mov    QWORD PTR [rax],rcx
 135ddad:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
 135ddb1:	48 8b 8c 24 c0 00 00 	mov    rcx,QWORD PTR [rsp+0xc0]
 135ddb8:	00 
### +0x28 call 0x135d567
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
### +0x28 call 0x135d5ce
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
### +0x28 call 0x135d8f0
 135d86c:	5f                   	pop    rdi
 135d86d:	48 8b 5c 24 78       	mov    rbx,QWORD PTR [rsp+0x78]
 135d872:	e8 89 06 49 00       	call   17edf00 <_Znwm@plt>
 135d877:	66 0f ef c0          	pxor   xmm0,xmm0
 135d87b:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
 135d880:	48 8d 0d 49 30 4a 00 	lea    rcx,[rip+0x4a3049]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>
 135d887:	48 89 08             	mov    QWORD PTR [rax],rcx
 135d88a:	48 89 c1             	mov    rcx,rax
 135d88d:	48 83 c1 18          	add    rcx,0x18
 135d891:	48 8d 15 58 a5 50 00 	lea    rdx,[rip+0x50a558]        # 1867df0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x244d8>
 135d898:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
 135d89c:	48 89 8b 90 00 00 00 	mov    QWORD PTR [rbx+0x90],rcx
 135d8a3:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
 135d8aa:	48 89 83 98 00 00 00 	mov    QWORD PTR [rbx+0x98],rax
 135d8b1:	e8 d0 0b 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 135d8b6:	c7 84 24 d0 01 00 00 	mov    DWORD PTR [rsp+0x1d0],0x64
 135d8bd:	64 00 00 00 
 135d8c1:	66 c7 84 24 d4 01 00 	mov    WORD PTR [rsp+0x1d4],0x101
 135d8c8:	00 01 01 
 135d8cb:	c6 84 24 d6 01 00 00 	mov    BYTE PTR [rsp+0x1d6],0x0
 135d8d2:	00 
 135d8d3:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
 135d8da:	00 
 135d8db:	48 8b b4 24 f0 10 00 	mov    rsi,QWORD PTR [rsp+0x10f0]
 135d8e2:	00 
 135d8e3:	e8 68 fe 95 ff       	call   cbd750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a6f0>
 135d8e8:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 135d8ed:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 135d8f0:	ff 50 28             	call   QWORD PTR [rax+0x28]
 135d8f3:	48 89 c5             	mov    rbp,rax
 135d8f6:	bf 60 01 00 00       	mov    edi,0x160
 135d8fb:	e8 00 06 49 00       	call   17edf00 <_Znwm@plt>
 135d900:	49 89 c5             	mov    r13,rax
 135d903:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
 135d90a:	00 
 135d90b:	48 8d b4 24 a0 09 00 	lea    rsi,[rsp+0x9a0]
 135d912:	00 
 135d913:	e8 78 c9 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 135d918:	48 8d 05 c1 0f 4b 00 	lea    rax,[rip+0x4b0fc1]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
 135d91f:	48 89 84 24 a0 05 00 	mov    QWORD PTR [rsp+0x5a0],rax
 135d926:	00 
 135d927:	48 8b 05 7a 41 55 00 	mov    rax,QWORD PTR [rip+0x55417a]        # 18b1aa8 <_ZNSt6__ndk16chrono12steady_clock3nowEv@@Base+0xeaf8e8>
 135d92e:	48 89 84 24 a8 05 00 	mov    QWORD PTR [rsp+0x5a8],rax
 135d935:	00 
 135d936:	4c 89 b4 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],r14
 135d93d:	00 
 135d93e:	48 8d 05 6b a5 50 00 	lea    rax,[rip+0x50a56b]        # 1867eb0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24598>
 135d945:	48 89 84 24 60 0f 00 	mov    QWORD PTR [rsp+0xf60],rax
 135d94c:	00 
 135d94d:	4c 89 bc 24 80 0f 00 	mov    QWORD PTR [rsp+0xf80],r15
 135d954:	00 
 135d955:	48 8b 9c 24 b0 0d 00 	mov    rbx,QWORD PTR [rsp+0xdb0]
 135d95c:	00 
 135d95d:	4c 8b b4 24 b8 0d 00 	mov    r14,QWORD PTR [rsp+0xdb8]
 135d964:	00 
 135d965:	48 89 9c 24 20 03 00 	mov    QWORD PTR [rsp+0x320],rbx
 135d96c:	00 
 135d96d:	4c 89 b4 24 28 03 00 	mov    QWORD PTR [rsp+0x328],r14
 135d974:	00 
 135d975:	4c 8b a4 24 c0 0d 00 	mov    r12,QWORD PTR [rsp+0xdc0]
 135d97c:	00 
 135d97d:	4c 89 a4 24 30 03 00 	mov    QWORD PTR [rsp+0x330],r12
 135d984:	00 

## rank 30: score=46 FDE=0x15c037a..0x15c0b19 features=stride8,begin-end,+10,sret=25
### +0x28 call 0x15c0693
 15c062f:	4c 89 f7             	mov    rdi,r14
 15c0632:	ff 50 10             	call   QWORD PTR [rax+0x10]
 15c0635:	48 81 fb 00 01 00 00 	cmp    rbx,0x100
 15c063c:	0f 92 c1             	setb   cl
 15c063f:	20 c8                	and    al,cl
 15c0641:	3c 01                	cmp    al,0x1
 15c0643:	0f 85 f8 00 00 00    	jne    15c0741 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x405cc5>
 15c0649:	49 8b 06             	mov    rax,QWORD PTR [r14]
 15c064c:	4c 89 f7             	mov    rdi,r14
 15c064f:	ff 50 38             	call   QWORD PTR [rax+0x38]
 15c0652:	4c 89 ef             	mov    rdi,r13
 15c0655:	48 89 c6             	mov    rsi,rax
 15c0658:	e8 bd c3 4d ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
 15c065d:	4c 89 ef             	mov    rdi,r13
 15c0660:	e8 d1 b1 4b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 15c0665:	48 89 ef             	mov    rdi,rbp
 15c0668:	48 89 c6             	mov    rsi,rax
 15c066b:	e8 b8 4d 10 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
 15c0670:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
 15c0675:	e8 f0 5d ff ff       	call   15b646a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fb9ee>
 15c067a:	48 85 c0             	test   rax,rax
 15c067d:	74 22                	je     15c06a1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x405c25>
 15c067f:	4c 8b 08             	mov    r9,QWORD PTR [rax]
 15c0682:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
 15c0687:	48 89 c6             	mov    rsi,rax
 15c068a:	4c 89 e2             	mov    rdx,r12
 15c068d:	4c 89 e9             	mov    rcx,r13
 15c0690:	49 89 e8             	mov    r8,rbp
 15c0693:	41 ff 51 28          	call   QWORD PTR [r9+0x28]
 15c0697:	48 83 7c 24 78 00    	cmp    QWORD PTR [rsp+0x78],0x0
 15c069d:	75 5f                	jne    15c06fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x405c82>
 15c069f:	eb 06                	jmp    15c06a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x405c2b>
 15c06a1:	48 83 64 24 78 00    	and    QWORD PTR [rsp+0x78],0x0
 15c06a7:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 15c06ac:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
 15c06b0:	4c 89 ef             	mov    rdi,r13
 15c06b3:	e8 7e b1 4b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 15c06b8:	49 89 d0             	mov    r8,rdx
 15c06bb:	31 c9                	xor    ecx,ecx
 15c06bd:	88 8c 24 00 01 00 00 	mov    BYTE PTR [rsp+0x100],cl
 15c06c4:	88 8c 24 08 01 00 00 	mov    BYTE PTR [rsp+0x108],cl
 15c06cb:	49 8b 0e             	mov    rcx,QWORD PTR [r14]
 15c06ce:	4c 8b 51 20          	mov    r10,QWORD PTR [rcx+0x20]
 15c06d2:	0f 10 84 24 00 01 00 	movups xmm0,XMMWORD PTR [rsp+0x100]
 15c06d9:	00 
 15c06da:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
 15c06de:	4c 89 f7             	mov    rdi,r14
 15c06e1:	4c 89 e6             	mov    rsi,r12
 15c06e4:	48 8d 94 24 a8 00 00 	lea    rdx,[rsp+0xa8]
 15c06eb:	00 
 15c06ec:	48 89 c1             	mov    rcx,rax
 15c06ef:	4c 8b 4c 24 28       	mov    r9,QWORD PTR [rsp+0x28]
 15c06f4:	41 ff d2             	call   r10
 15c06f7:	41 80 e7 01          	and    r15b,0x1
 15c06fb:	41 08 c7             	or     r15b,al
 15c06fe:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
 15c0705:	00 
 15c0706:	4c 89 ee             	mov    rsi,r13
 15c0709:	e8 20 b3 4b ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
 15c070e:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
 15c0713:	e8 d4 5f 4f ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
 15c0718:	48 89 ef             	mov    rdi,rbp
 15c071b:	e8 0e 4c 10 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>

## rank 31: score=45 FDE=0xced49c..0xced7ef features=stride8,begin-end,+10,+18,+20,sret=15
### +0x28 call 0xced58e
  ced528:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  ced52b:	ff 50 50             	call   QWORD PTR [rax+0x50]
  ced52e:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
  ced533:	49 89 c5             	mov    r13,rax
  ced536:	48 8b 00             	mov    rax,QWORD PTR [rax]
  ced539:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  ced53e:	4c 89 ee             	mov    rsi,r13
  ced541:	ff 50 10             	call   QWORD PTR [rax+0x10]
  ced544:	4c 89 24 24          	mov    QWORD PTR [rsp],r12
  ced548:	4c 8b 63 08          	mov    r12,QWORD PTR [rbx+0x8]
  ced54c:	4c 89 fd             	mov    rbp,r15
  ced54f:	4c 8b 7b 10          	mov    r15,QWORD PTR [rbx+0x10]
  ced553:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  ced557:	4c 89 ef             	mov    rdi,r13
  ced55a:	ff 50 18             	call   QWORD PTR [rax+0x18]
  ced55d:	48 89 d1             	mov    rcx,rdx
  ced560:	4c 8d 6c 24 20       	lea    r13,[rsp+0x20]
  ced565:	4c 89 ef             	mov    rdi,r13
  ced568:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
  ced56d:	48 89 c2             	mov    rdx,rax
  ced570:	e8 03 65 fe ff       	call   cd3a78 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x220a18>
  ced575:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  ced579:	4c 89 e7             	mov    rdi,r12
  ced57c:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
  ced580:	4c 89 fe             	mov    rsi,r15
  ced583:	49 89 ef             	mov    r15,rbp
  ced586:	4c 89 ea             	mov    rdx,r13
  ced589:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
  ced58e:	ff 50 28             	call   QWORD PTR [rax+0x28]
  ced591:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
  ced595:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  ced598:	ff 50 40             	call   QWORD PTR [rax+0x40]
  ced59b:	89 c5                	mov    ebp,eax
  ced59d:	48 89 df             	mov    rdi,rbx
  ced5a0:	4c 89 e6             	mov    rsi,r12
  ced5a3:	e8 6e f0 ff ff       	call   cec616 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2395b6>
  ced5a8:	31 d2                	xor    edx,edx
  ced5aa:	48 85 c0             	test   rax,rax
  ced5ad:	0f 84 9d 00 00 00    	je     ced650 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23a5f0>
  ced5b3:	41 80 7f 10 00       	cmp    BYTE PTR [r15+0x10],0x0
  ced5b8:	0f 84 92 00 00 00    	je     ced650 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23a5f0>
  ced5be:	49 89 c4             	mov    r12,rax
  ced5c1:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  ced5c4:	49 8b 77 08          	mov    rsi,QWORD PTR [r15+0x8]
  ced5c8:	6a 01                	push   0x1
  ced5ca:	59                   	pop    rcx
  ced5cb:	31 d2                	xor    edx,edx
  ced5cd:	e8 78 c1 fe ff       	call   cd974a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2266ea>
  ced5d2:	84 c0                	test   al,al
  ced5d4:	74 05                	je     ced5db <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23a57b>
  ced5d6:	6a 01                	push   0x1
  ced5d8:	5a                   	pop    rdx
  ced5d9:	eb 75                	jmp    ced650 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23a5f0>
  ced5db:	89 2c 24             	mov    DWORD PTR [rsp],ebp
  ced5de:	4d 8b 6d 00          	mov    r13,QWORD PTR [r13+0x0]
  ced5e2:	41 b7 01             	mov    r15b,0x1
  ced5e5:	40 b5 01             	mov    bpl,0x1
  ced5e8:	4d 39 f5             	cmp    r13,r14
  ced5eb:	74 35                	je     ced622 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23a5c2>
  ced5ed:	31 ed                	xor    ebp,ebp
  ced5ef:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
  ced5f3:	49 8b 75 18          	mov    rsi,QWORD PTR [r13+0x18]
  ced5f7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
### +0x28 call 0xced764
  ced6f9:	4c 89 ff             	mov    rdi,r15
  ced6fc:	e8 65 f6 db ff       	call   aacd66 <JNI_OnUnload@@Base+0x34633>
  ced701:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
  ced706:	4d 89 3f             	mov    QWORD PTR [r15],r15
  ced709:	4d 89 7f 08          	mov    QWORD PTR [r15+0x8],r15
  ced70d:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
  ced712:	4c 8d 64 24 50       	lea    r12,[rsp+0x50]
  ced717:	4c 89 e7             	mov    rdi,r12
  ced71a:	4c 89 f6             	mov    rsi,r14
  ced71d:	4c 89 fa             	mov    rdx,r15
  ced720:	e8 ca 00 00 00       	call   ced7ef <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23a78f>
  ced725:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
  ced729:	4c 89 e6             	mov    rsi,r12
  ced72c:	e8 f1 00 00 00       	call   ced822 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23a7c2>
  ced731:	4c 89 e7             	mov    rdi,r12
  ced734:	e8 fb eb ff ff       	call   cec334 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2392d4>
  ced739:	4c 89 ff             	mov    rdi,r15
  ced73c:	e8 f3 eb ff ff       	call   cec334 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2392d4>
  ced741:	4c 8d 73 70          	lea    r14,[rbx+0x70]
  ced745:	48 8b 7b 70          	mov    rdi,QWORD PTR [rbx+0x70]
  ced749:	e8 72 0e df ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
  ced74e:	4c 89 73 68          	mov    QWORD PTR [rbx+0x68],r14
  ced752:	0f 57 c0             	xorps  xmm0,xmm0
  ced755:	0f 11 43 70          	movups XMMWORD PTR [rbx+0x70],xmm0
  ced759:	85 ed                	test   ebp,ebp
  ced75b:	75 0a                	jne    ced767 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23a707>
  ced75d:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
  ced761:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  ced764:	ff 50 28             	call   QWORD PTR [rax+0x28]
  ced767:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ced76e:	00 00 
  ced770:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
  ced777:	00 
  ced778:	75 70                	jne    ced7ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23a78a>
  ced77a:	48 81 c4 88 00 00 00 	add    rsp,0x88
  ced781:	5b                   	pop    rbx
  ced782:	41 5c                	pop    r12
  ced784:	41 5d                	pop    r13
  ced786:	41 5e                	pop    r14
  ced788:	41 5f                	pop    r15
  ced78a:	5d                   	pop    rbp
  ced78b:	c3                   	ret
  ced78c:	0f 57 c0             	xorps  xmm0,xmm0
  ced78f:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
  ced794:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
  ced798:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
  ced79d:	48 8d 35 e0 2a 68 ff 	lea    rsi,[rip+0xffffffffff682ae0]        # 370284 <_ZTSSt12bad_any_cast@@Base-0x1ff44>
  ced7a4:	4c 89 f7             	mov    rdi,r14
  ced7a7:	e8 46 88 ae 00       	call   17d5ff2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1e13>
  ced7ac:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  ced7b1:	48 c7 07 01 00 00 00 	mov    QWORD PTR [rdi],0x1
  ced7b8:	48 8d 05 bd 47 76 ff 	lea    rax,[rip+0xffffffffff7647bd]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
  ced7bf:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
  ced7c3:	48 8d 05 89 52 68 ff 	lea    rax,[rip+0xffffffffff685289]        # 372a53 <_ZTSSt12bad_any_cast@@Base-0x1d775>
  ced7ca:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
  ced7ce:	c7 47 18 88 00 00 00 	mov    DWORD PTR [rdi+0x18],0x88
  ced7d5:	4c 89 f6             	mov    rsi,r14
  ced7d8:	e8 cb c4 db ff       	call   aa9ca8 <JNI_OnUnload@@Base+0x31575>
  ced7dd:	4c 89 f7             	mov    rdi,r14
  ced7e0:	e8 ab 06 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  ced7e5:	e9 e8 fc ff ff       	jmp    ced4d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23a472>
  ced7ea:	e8 c1 22 b0 00       	call   17efab0 <__stack_chk_fail@plt>

## rank 32: score=45 FDE=0x11a4780..0x11a5adc features=stride8,begin-end,+10,+18,+20,sret=15
### +0x28 call 0x11a5786
 11a5709:	e8 82 87 64 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11a570e:	48 8d 35 f8 b4 1d ff 	lea    rsi,[rip+0xffffffffff1db4f8]        # 380c0d <_ZTSSt12bad_any_cast@@Base-0xf5bb>
 11a5715:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
 11a571c:	00 
 11a571d:	e8 5c 43 8d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 11a5722:	48 8d bc 24 48 02 00 	lea    rdi,[rsp+0x248]
 11a5729:	00 
 11a572a:	48 8d b4 24 a0 02 00 	lea    rsi,[rsp+0x2a0]
 11a5731:	00 
 11a5732:	e8 6f b6 4f 00       	call   16a0da6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54f12>
 11a5737:	48 8d 9c 24 48 02 00 	lea    rbx,[rsp+0x248]
 11a573e:	00 
 11a573f:	4c 89 ff             	mov    rdi,r15
 11a5742:	48 89 de             	mov    rsi,rbx
 11a5745:	e8 d2 40 91 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
 11a574a:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 11a574e:	e8 33 8d 8f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11a5753:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
 11a575a:	00 
 11a575b:	e8 30 87 64 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11a5760:	49 8b be d8 00 00 00 	mov    rdi,QWORD PTR [r14+0xd8]
 11a5767:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11a576a:	ff 50 30             	call   QWORD PTR [rax+0x30]
 11a576d:	84 c0                	test   al,al
 11a576f:	0f 84 fb 00 00 00    	je     11a5870 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36cc86>
 11a5775:	45 8b be 50 01 00 00 	mov    r15d,DWORD PTR [r14+0x150]
 11a577c:	49 8b be d8 00 00 00 	mov    rdi,QWORD PTR [r14+0xd8]
 11a5783:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11a5786:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11a5789:	84 c0                	test   al,al
 11a578b:	0f 84 0f 01 00 00    	je     11a58a0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ccb6>
 11a5791:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 11a5796:	4c 8b a0 b0 07 00 00 	mov    r12,QWORD PTR [rax+0x7b0]
 11a579d:	4c 8b b0 b8 07 00 00 	mov    r14,QWORD PTR [rax+0x7b8]
 11a57a4:	4d 85 f6             	test   r14,r14
 11a57a7:	74 0a                	je     11a57b3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36cbc9>
 11a57a9:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
 11a57ae:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
 11a57b3:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
 11a57b8:	49 8d bd 00 08 00 00 	lea    rdi,[r13+0x800]
 11a57bf:	e8 10 3a c3 ff       	call   dd91d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa625a>
 11a57c4:	89 c1                	mov    ecx,eax
 11a57c6:	80 f1 01             	xor    cl,0x1
 11a57c9:	0f b6 c9             	movzx  ecx,cl
 11a57cc:	41 8b 6c 8d 78       	mov    ebp,DWORD PTR [r13+rcx*4+0x78]
 11a57d1:	85 ed                	test   ebp,ebp
 11a57d3:	0f 8e 86 01 00 00    	jle    11a595f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36cd75>
 11a57d9:	44 0f b6 c8          	movzx  r9d,al
 11a57dd:	48 8d 35 98 c7 2a ff 	lea    rsi,[rip+0xffffffffff2ac798]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 11a57e4:	48 8d 0d f4 a1 19 ff 	lea    rcx,[rip+0xffffffffff19a1f4]        # 33f9df <_ZTSSt12bad_any_cast@@Base-0x507e9>
 11a57eb:	6a 04                	push   0x4
 11a57ed:	5f                   	pop    rdi
 11a57ee:	ba c1 03 00 00       	mov    edx,0x3c1
 11a57f3:	41 89 e8             	mov    r8d,ebp
 11a57f6:	31 c0                	xor    eax,eax
 11a57f8:	e8 d5 10 63 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
 11a57fd:	48 8d 05 14 c4 2a ff 	lea    rax,[rip+0xffffffffff2ac414]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
 11a5804:	48 89 84 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rax
 11a580b:	00 
 11a580c:	48 89 84 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rax
 11a5813:	00 
 11a5814:	48 83 a4 24 60 01 00 	and    QWORD PTR [rsp+0x160],0x0
 11a581b:	00 00 
### +0x28 call 0x11a4959
 11a48d6:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
 11a48dd:	00 
 11a48de:	49 8d 86 58 01 00 00 	lea    rax,[r14+0x158]
 11a48e5:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 11a48ea:	48 8d 86 98 00 00 00 	lea    rax,[rsi+0x98]
 11a48f1:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 11a48f6:	48 8d 86 d8 04 00 00 	lea    rax,[rsi+0x4d8]
 11a48fd:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
 11a4902:	49 8d 46 10          	lea    rax,[r14+0x10]
 11a4906:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
 11a490b:	48 8d 86 a8 00 00 00 	lea    rax,[rsi+0xa8]
 11a4912:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
 11a4917:	4c 8d ac 24 a0 02 00 	lea    r13,[rsp+0x2a0]
 11a491e:	00 
 11a491f:	c7 44 24 2c 00 00 00 	mov    DWORD PTR [rsp+0x2c],0x0
 11a4926:	00 
 11a4927:	c7 44 24 28 00 00 00 	mov    DWORD PTR [rsp+0x28],0x0
 11a492e:	00 
 11a492f:	c7 44 24 38 00 00 00 	mov    DWORD PTR [rsp+0x38],0x0
 11a4936:	00 
 11a4937:	c7 44 24 3c 00 00 00 	mov    DWORD PTR [rsp+0x3c],0x0
 11a493e:	00 
 11a493f:	c7 44 24 34 00 00 00 	mov    DWORD PTR [rsp+0x34],0x0
 11a4946:	00 
 11a4947:	c7 44 24 30 00 00 00 	mov    DWORD PTR [rsp+0x30],0x0
 11a494e:	00 
 11a494f:	49 8b be d8 00 00 00 	mov    rdi,QWORD PTR [r14+0xd8]
 11a4956:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11a4959:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11a495c:	84 c0                	test   al,al
 11a495e:	0f 84 12 0c 00 00    	je     11a5576 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36c98c>
 11a4964:	31 c0                	xor    eax,eax
 11a4966:	88 84 24 d0 00 00 00 	mov    BYTE PTR [rsp+0xd0],al
 11a496d:	88 84 24 e8 00 00 00 	mov    BYTE PTR [rsp+0xe8],al
 11a4974:	49 8b b6 d8 00 00 00 	mov    rsi,QWORD PTR [r14+0xd8]
 11a497b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11a497e:	4c 89 ef             	mov    rdi,r13
 11a4981:	ff 50 38             	call   QWORD PTR [rax+0x38]
 11a4984:	8a 9c 24 c0 02 00 00 	mov    bl,BYTE PTR [rsp+0x2c0]
 11a498b:	4c 89 ef             	mov    rdi,r13
 11a498e:	e8 2f 6b aa ff       	call   c4b4c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x198462>
 11a4993:	84 db                	test   bl,bl
 11a4995:	74 2d                	je     11a49c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36bdda>
 11a4997:	49 8b b6 d8 00 00 00 	mov    rsi,QWORD PTR [r14+0xd8]
 11a499e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11a49a1:	4c 89 ef             	mov    rdi,r13
 11a49a4:	ff 50 38             	call   QWORD PTR [rax+0x38]
 11a49a7:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 11a49ae:	00 
 11a49af:	48 8d b4 24 a8 02 00 	lea    rsi,[rsp+0x2a8]
 11a49b6:	00 
 11a49b7:	e8 a4 37 9a ff       	call   b48160 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x95100>
 11a49bc:	4c 89 ef             	mov    rdi,r13
 11a49bf:	e8 fe 6a aa ff       	call   c4b4c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x198462>
 11a49c4:	80 bc 24 e8 00 00 00 	cmp    BYTE PTR [rsp+0xe8],0x0
 11a49cb:	00 
 11a49cc:	0f 84 96 04 00 00    	je     11a4e68 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36c27e>
 11a49d2:	4c 8d a4 24 d0 00 00 	lea    r12,[rsp+0xd0]
 11a49d9:	00 
 11a49da:	4c 89 e7             	mov    rdi,r12
 11a49dd:	e8 54 6e 8d ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 11a49e2:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 11a49e9:	00 
### +0x28 call 0x11a593c
 11a58cc:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11a58cf:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
 11a58d6:	00 
 11a58d7:	ba d4 00 00 00       	mov    edx,0xd4
 11a58dc:	ff 50 40             	call   QWORD PTR [rax+0x40]
 11a58df:	48 8b 84 24 a0 02 00 	mov    rax,QWORD PTR [rsp+0x2a0]
 11a58e6:	00 
 11a58e7:	48 83 a4 24 a0 02 00 	and    QWORD PTR [rsp+0x2a0],0x0
 11a58ee:	00 00 
 11a58f0:	49 8b be d8 00 00 00 	mov    rdi,QWORD PTR [r14+0xd8]
 11a58f7:	49 89 86 d8 00 00 00 	mov    QWORD PTR [r14+0xd8],rax
 11a58fe:	48 85 ff             	test   rdi,rdi
 11a5901:	74 22                	je     11a5925 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36cd3b>
 11a5903:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11a5906:	ff 50 08             	call   QWORD PTR [rax+0x8]
 11a5909:	48 8b bc 24 a0 02 00 	mov    rdi,QWORD PTR [rsp+0x2a0]
 11a5910:	00 
 11a5911:	48 83 a4 24 a0 02 00 	and    QWORD PTR [rsp+0x2a0],0x0
 11a5918:	00 00 
 11a591a:	48 85 ff             	test   rdi,rdi
 11a591d:	74 06                	je     11a5925 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36cd3b>
 11a591f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11a5922:	ff 50 08             	call   QWORD PTR [rax+0x8]
 11a5925:	49 8b be d8 00 00 00 	mov    rdi,QWORD PTR [r14+0xd8]
 11a592c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11a592f:	ff 50 10             	call   QWORD PTR [rax+0x10]
 11a5932:	49 8b be d8 00 00 00 	mov    rdi,QWORD PTR [r14+0xd8]
 11a5939:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11a593c:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11a593f:	84 c0                	test   al,al
 11a5941:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 11a5946:	74 0d                	je     11a5955 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36cd6b>
 11a5948:	4c 89 f6             	mov    rsi,r14
 11a594b:	e8 30 ee ff ff       	call   11a4780 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36bb96>
 11a5950:	e9 94 00 00 00       	jmp    11a59e9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36cdff>
 11a5955:	e8 48 e5 ff ff       	call   11a3ea2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36b2b8>
 11a595a:	e9 8a 00 00 00       	jmp    11a59e9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36cdff>
 11a595f:	49 8b 9d 80 00 00 00 	mov    rbx,QWORD PTR [r13+0x80]
 11a5966:	48 8d 05 ab c2 2a ff 	lea    rax,[rip+0xffffffffff2ac2ab]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
 11a596d:	48 89 84 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rax
 11a5974:	00 
 11a5975:	48 89 84 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rax
 11a597c:	00 
 11a597d:	48 83 a4 24 60 01 00 	and    QWORD PTR [rsp+0x160],0x0
 11a5984:	00 00 
 11a5986:	48 8d b4 24 48 02 00 	lea    rsi,[rsp+0x248]
 11a598d:	00 
 11a598e:	4c 89 2e             	mov    QWORD PTR [rsi],r13
 11a5991:	4c 89 66 08          	mov    QWORD PTR [rsi+0x8],r12
 11a5995:	4c 89 76 10          	mov    QWORD PTR [rsi+0x10],r14
 11a5999:	44 89 7e 18          	mov    DWORD PTR [rsi+0x18],r15d
 11a599d:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
 11a59a4:	00 
 11a59a5:	e8 26 0b 00 00       	call   11a64d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36d8e6>
 11a59aa:	48 8d b4 24 50 01 00 	lea    rsi,[rsp+0x150]
 11a59b1:	00 
 11a59b2:	4c 8d bc 24 a0 02 00 	lea    r15,[rsp+0x2a0]
 11a59b9:	00 
 11a59ba:	48 89 df             	mov    rdi,rbx
 11a59bd:	4c 89 fa             	mov    rdx,r15
 11a59c0:	e8 c3 ba 61 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>
 11a59c5:	4c 89 ff             	mov    rdi,r15
 11a59c8:	e8 d1 18 90 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>

## rank 33: score=45 FDE=0x12123e0..0x12146ff features=stride8,begin-end,+10,+18,+20,sret=15
### +0x28 call 0x12129fd
 1212980:	4c 89 f6             	mov    rsi,r14
 1212983:	ff 50 20             	call   QWORD PTR [rax+0x20]
 1212986:	48 8b bb a8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xa8]
 121298d:	4c 89 f6             	mov    rsi,r14
 1212990:	31 d2                	xor    edx,edx
 1212992:	e8 11 42 05 00       	call   1266ba8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xac12c>
 1212997:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 121299c:	48 8b b8 90 00 00 00 	mov    rdi,QWORD PTR [rax+0x90]
 12129a3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12129a6:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
 12129ab:	ff 50 40             	call   QWORD PTR [rax+0x40]
 12129ae:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
 12129b3:	48 8b bb 60 01 00 00 	mov    rdi,QWORD PTR [rbx+0x160]
 12129ba:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12129bd:	4c 8b 74 24 20       	mov    r14,QWORD PTR [rsp+0x20]
 12129c2:	4c 89 f6             	mov    rsi,r14
 12129c5:	ff 50 10             	call   QWORD PTR [rax+0x10]
 12129c8:	bf e0 00 00 00       	mov    edi,0xe0
 12129cd:	48 03 bb 78 01 00 00 	add    rdi,QWORD PTR [rbx+0x178]
 12129d4:	4c 89 f6             	mov    rsi,r14
 12129d7:	e8 5e f9 8e ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
 12129dc:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
 12129e3:	00 
 12129e4:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
 12129e9:	e8 52 b5 5d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 12129ee:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
 12129f3:	49 8b bf 68 01 00 00 	mov    rdi,QWORD PTR [r15+0x168]
 12129fa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12129fd:	ff 50 28             	call   QWORD PTR [rax+0x28]
 1212a00:	84 c0                	test   al,al
 1212a02:	74 11                	je     1212a15 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57f99>
 1212a04:	49 8b 87 70 01 00 00 	mov    rax,QWORD PTR [r15+0x170]
 1212a0b:	48 89 84 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rax
 1212a12:	00 
 1212a13:	eb 08                	jmp    1212a1d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57fa1>
 1212a15:	83 a4 24 5c 01 00 00 	and    DWORD PTR [rsp+0x15c],0x0
 1212a1c:	00 
 1212a1d:	4c 8b 64 24 20       	mov    r12,QWORD PTR [rsp+0x20]
 1212a22:	49 8d 87 30 02 00 00 	lea    rax,[r15+0x230]
 1212a29:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 1212a2e:	41 80 bf 68 03 00 00 	cmp    BYTE PTR [r15+0x368],0x0
 1212a35:	00 
 1212a36:	0f 84 d8 01 00 00    	je     1212c14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58198>
 1212a3c:	41 80 bf 61 03 00 00 	cmp    BYTE PTR [r15+0x361],0x0
 1212a43:	00 
 1212a44:	0f 85 58 01 00 00    	jne    1212ba2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58126>
 1212a4a:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
 1212a51:	00 
 1212a52:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 1212a57:	e8 92 cc 88 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
 1212a5c:	84 c0                	test   al,al
 1212a5e:	0f 84 3e 01 00 00    	je     1212ba2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58126>
 1212a64:	49 8b bf 70 03 00 00 	mov    rdi,QWORD PTR [r15+0x370]
 1212a6b:	48 85 ff             	test   rdi,rdi
 1212a6e:	74 26                	je     1212a96 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5801a>
 1212a70:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1212a73:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
 1212a79:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 1212a7c:	48 89 c7             	mov    rdi,rax
 1212a7f:	ff 51 28             	call   QWORD PTR [rcx+0x28]
 1212a82:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 1212a87:	48 8d b9 48 02 00 00 	lea    rdi,[rcx+0x248]
 1212a8e:	48 89 c6             	mov    rsi,rax
### +0x28 call 0x1212a7f
 1212a04:	49 8b 87 70 01 00 00 	mov    rax,QWORD PTR [r15+0x170]
 1212a0b:	48 89 84 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rax
 1212a12:	00 
 1212a13:	eb 08                	jmp    1212a1d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57fa1>
 1212a15:	83 a4 24 5c 01 00 00 	and    DWORD PTR [rsp+0x15c],0x0
 1212a1c:	00 
 1212a1d:	4c 8b 64 24 20       	mov    r12,QWORD PTR [rsp+0x20]
 1212a22:	49 8d 87 30 02 00 00 	lea    rax,[r15+0x230]
 1212a29:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 1212a2e:	41 80 bf 68 03 00 00 	cmp    BYTE PTR [r15+0x368],0x0
 1212a35:	00 
 1212a36:	0f 84 d8 01 00 00    	je     1212c14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58198>
 1212a3c:	41 80 bf 61 03 00 00 	cmp    BYTE PTR [r15+0x361],0x0
 1212a43:	00 
 1212a44:	0f 85 58 01 00 00    	jne    1212ba2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58126>
 1212a4a:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
 1212a51:	00 
 1212a52:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 1212a57:	e8 92 cc 88 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
 1212a5c:	84 c0                	test   al,al
 1212a5e:	0f 84 3e 01 00 00    	je     1212ba2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58126>
 1212a64:	49 8b bf 70 03 00 00 	mov    rdi,QWORD PTR [r15+0x370]
 1212a6b:	48 85 ff             	test   rdi,rdi
 1212a6e:	74 26                	je     1212a96 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5801a>
 1212a70:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1212a73:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
 1212a79:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 1212a7c:	48 89 c7             	mov    rdi,rax
 1212a7f:	ff 51 28             	call   QWORD PTR [rcx+0x28]
 1212a82:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 1212a87:	48 8d b9 48 02 00 00 	lea    rdi,[rcx+0x248]
 1212a8e:	48 89 c6             	mov    rsi,rax
 1212a91:	e8 5c 77 e9 ff       	call   10aa1f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271608>
 1212a96:	bf 98 02 00 00       	mov    edi,0x298
 1212a9b:	e8 60 b4 5d 00       	call   17edf00 <_Znwm@plt>
 1212aa0:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 1212aa5:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
 1212aaa:	4c 8b 64 24 20       	mov    r12,QWORD PTR [rsp+0x20]
 1212aaf:	45 8a b4 24 7e 06 00 	mov    r14b,BYTE PTR [r12+0x67e]
 1212ab6:	00 
 1212ab7:	31 c0                	xor    eax,eax
 1212ab9:	88 84 24 30 03 00 00 	mov    BYTE PTR [rsp+0x330],al
 1212ac0:	88 84 24 58 03 00 00 	mov    BYTE PTR [rsp+0x358],al
 1212ac7:	41 38 84 24 68 08 00 	cmp    BYTE PTR [r12+0x868],al
 1212ace:	00 
 1212acf:	0f 84 0d 18 00 00    	je     12142e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59866>
 1212ad5:	49 8d bc 24 a8 07 00 	lea    rdi,[r12+0x7a8]
 1212adc:	00 
 1212add:	e8 14 45 00 00       	call   1216ff6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c57a>
 1212ae2:	41 8b 84 24 a8 07 00 	mov    eax,DWORD PTR [r12+0x7a8]
 1212ae9:	00 
 1212aea:	48 8d 9c 24 f8 01 00 	lea    rbx,[rsp+0x1f8]
 1212af1:	00 
 1212af2:	89 43 f8             	mov    DWORD PTR [rbx-0x8],eax
 1212af5:	49 8d b4 24 b0 07 00 	lea    rsi,[r12+0x7b0]
 1212afc:	00 
 1212afd:	49 8d 87 50 02 00 00 	lea    rax,[r15+0x250]
 1212b04:	41 80 bc 24 c8 07 00 	cmp    BYTE PTR [r12+0x7c8],0x0
 1212b0b:	00 00 
 1212b0d:	48 0f 44 f0          	cmove  rsi,rax
 1212b11:	48 89 df             	mov    rdi,rbx
 1212b14:	e8 4d 9c 8b ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
 1212b19:	4c 8d ac 24 18 02 00 	lea    r13,[rsp+0x218]
### +0x28 call 0x121303c
 1212fc5:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
 1212fcc:	00 
 1212fcd:	e8 80 6d e9 ff       	call   10a9d52 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271168>
 1212fd2:	48 8d bc 24 30 03 00 	lea    rdi,[rsp+0x330]
 1212fd9:	00 
 1212fda:	4c 89 e6             	mov    rsi,r12
 1212fdd:	e8 50 41 00 00       	call   1217132 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c6b6>
 1212fe2:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
 1212fe7:	48 81 c7 80 01 00 00 	add    rdi,0x180
 1212fee:	48 8d 9c 24 30 03 00 	lea    rbx,[rsp+0x330]
 1212ff5:	00 
 1212ff6:	48 89 de             	mov    rsi,rbx
 1212ff9:	e8 28 42 00 00       	call   1217226 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c7aa>
 1212ffe:	48 89 df             	mov    rdi,rbx
 1213001:	e8 8e e9 ff ff       	call   1211994 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56f18>
 1213006:	48 8d bc 24 50 0c 00 	lea    rdi,[rsp+0xc50]
 121300d:	00 
 121300e:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 1213012:	e8 71 42 00 00       	call   1217288 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c80c>
 1213017:	48 8d bc 24 30 03 00 	lea    rdi,[rsp+0x330]
 121301e:	00 
 121301f:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
 1213026:	00 
 1213027:	e8 14 af 5d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 121302c:	48 8d 9c 24 48 03 00 	lea    rbx,[rsp+0x348]
 1213033:	00 
 1213034:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
 1213039:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 121303c:	ff 50 28             	call   QWORD PTR [rax+0x28]
 121303f:	48 89 df             	mov    rdi,rbx
 1213042:	48 89 c6             	mov    rsi,rax
 1213045:	e8 cc 1f 00 00       	call   1215016 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a59a>
 121304a:	4c 8b 7c 24 18       	mov    r15,QWORD PTR [rsp+0x18]
 121304f:	49 8b 07             	mov    rax,QWORD PTR [r15]
 1213052:	4c 89 ff             	mov    rdi,r15
 1213055:	ff 50 30             	call   QWORD PTR [rax+0x30]
 1213058:	8b 00                	mov    eax,DWORD PTR [rax]
 121305a:	4c 8d b4 24 10 04 00 	lea    r14,[rsp+0x410]
 1213061:	00 
 1213062:	41 89 46 f8          	mov    DWORD PTR [r14-0x8],eax
 1213066:	49 8b 07             	mov    rax,QWORD PTR [r15]
 1213069:	4c 89 ff             	mov    rdi,r15
 121306c:	ff 50 38             	call   QWORD PTR [rax+0x38]
 121306f:	4c 89 f7             	mov    rdi,r14
 1213072:	48 89 c6             	mov    rsi,rax
 1213075:	e8 46 20 00 00       	call   12150c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a644>
 121307a:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 121307f:	8a 80 7d 06 00 00    	mov    al,BYTE PTR [rax+0x67d]
 1213085:	88 84 24 60 04 00 00 	mov    BYTE PTR [rsp+0x460],al
 121308c:	c6 84 24 61 04 00 00 	mov    BYTE PTR [rsp+0x461],0x0
 1213093:	00 
 1213094:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
 1213099:	41 80 bc 24 68 03 00 	cmp    BYTE PTR [r12+0x368],0x0
 12130a0:	00 00 
 12130a2:	74 4e                	je     12130f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58676>
 12130a4:	4c 8d ac 24 30 03 00 	lea    r13,[rsp+0x330]
 12130ab:	00 
 12130ac:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 12130b1:	4c 89 ee             	mov    rsi,r13
 12130b4:	e8 75 89 86 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
 12130b9:	49 8d bc 24 48 02 00 	lea    rdi,[r12+0x248]
 12130c0:	00 
 12130c1:	48 89 de             	mov    rsi,rbx

## rank 34: score=45 FDE=0x122adf6..0x122b764 features=stride8,begin-end,+10,+18,+20,sret=15
### +0x28 call 0x122b55e
 122b4e6:	48 c1 e2 20          	shl    rdx,0x20
 122b4ea:	48 8d 0d 57 8d 6e 00 	lea    rcx,[rip+0x6e8d57]        # 1914248 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5b658>
 122b4f1:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 122b4f8:	00 
 122b4f9:	48 8d b4 24 30 07 00 	lea    rsi,[rsp+0x730]
 122b500:	00 
 122b501:	e8 4a 24 ff ff       	call   121d950 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62ed4>
 122b506:	4c 89 f7             	mov    rdi,r14
 122b509:	e8 a4 2f 87 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 122b50e:	49 8b bf 20 07 00 00 	mov    rdi,QWORD PTR [r15+0x720]
 122b515:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 122b518:	ff 50 10             	call   QWORD PTR [rax+0x10]
 122b51b:	48 8d bc 24 30 07 00 	lea    rdi,[rsp+0x730]
 122b522:	00 
 122b523:	48 89 c6             	mov    rsi,rax
 122b526:	e8 a1 de 01 00       	call   12493cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8e950>
 122b52b:	49 8d bf 48 07 00 00 	lea    rdi,[r15+0x748]
 122b532:	48 8d 9c 24 30 07 00 	lea    rbx,[rsp+0x730]
 122b539:	00 
 122b53a:	48 89 de             	mov    rsi,rbx
 122b53d:	e8 dc 55 00 00       	call   1230b1e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x760a2>
 122b542:	48 89 df             	mov    rdi,rbx
 122b545:	e8 22 03 00 00       	call   122b86c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70df0>
 122b54a:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 122b551:	00 
 122b552:	e8 cf 26 ff ff       	call   121dc26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x631aa>
 122b557:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 122b55b:	4c 89 e7             	mov    rdi,r12
 122b55e:	ff 50 28             	call   QWORD PTR [rax+0x28]
 122b561:	84 c0                	test   al,al
 122b563:	0f 84 9b 00 00 00    	je     122b604 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70b88>
 122b569:	4d 8b b7 38 07 00 00 	mov    r14,QWORD PTR [r15+0x738]
 122b570:	41 0f 10 87 30 07 00 	movups xmm0,XMMWORD PTR [r15+0x730]
 122b577:	00 
 122b578:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
 122b57f:	00 
 122b580:	4d 85 f6             	test   r14,r14
 122b583:	74 05                	je     122b58a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70b0e>
 122b585:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
 122b58a:	41 0f b6 97 18 07 00 	movzx  edx,BYTE PTR [r15+0x718]
 122b591:	00 
 122b592:	48 c1 e2 20          	shl    rdx,0x20
 122b596:	48 83 ca 01          	or     rdx,0x1
 122b59a:	48 8d 0d a7 8c 6e 00 	lea    rcx,[rip+0x6e8ca7]        # 1914248 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5b658>
 122b5a1:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
 122b5a8:	00 
 122b5a9:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
 122b5b0:	00 
 122b5b1:	e8 9a 23 ff ff       	call   121d950 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62ed4>
 122b5b6:	4c 89 f7             	mov    rdi,r14
 122b5b9:	e8 f4 2e 87 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 122b5be:	49 8b bf 28 07 00 00 	mov    rdi,QWORD PTR [r15+0x728]
 122b5c5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 122b5c8:	ff 50 28             	call   QWORD PTR [rax+0x28]
 122b5cb:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 122b5d2:	00 
 122b5d3:	48 89 c6             	mov    rsi,rax
 122b5d6:	e8 3b 9a fe ff       	call   1215016 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a59a>
 122b5db:	48 8d 9c 24 90 00 00 	lea    rbx,[rsp+0x90]
 122b5e2:	00 
 122b5e3:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
 122b5e7:	48 89 de             	mov    rsi,rbx
 122b5ea:	e8 05 9b fe ff       	call   12150f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a678>
### +0x28 call 0x122b5c8
 122b552:	e8 cf 26 ff ff       	call   121dc26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x631aa>
 122b557:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 122b55b:	4c 89 e7             	mov    rdi,r12
 122b55e:	ff 50 28             	call   QWORD PTR [rax+0x28]
 122b561:	84 c0                	test   al,al
 122b563:	0f 84 9b 00 00 00    	je     122b604 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70b88>
 122b569:	4d 8b b7 38 07 00 00 	mov    r14,QWORD PTR [r15+0x738]
 122b570:	41 0f 10 87 30 07 00 	movups xmm0,XMMWORD PTR [r15+0x730]
 122b577:	00 
 122b578:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
 122b57f:	00 
 122b580:	4d 85 f6             	test   r14,r14
 122b583:	74 05                	je     122b58a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70b0e>
 122b585:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
 122b58a:	41 0f b6 97 18 07 00 	movzx  edx,BYTE PTR [r15+0x718]
 122b591:	00 
 122b592:	48 c1 e2 20          	shl    rdx,0x20
 122b596:	48 83 ca 01          	or     rdx,0x1
 122b59a:	48 8d 0d a7 8c 6e 00 	lea    rcx,[rip+0x6e8ca7]        # 1914248 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5b658>
 122b5a1:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
 122b5a8:	00 
 122b5a9:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
 122b5b0:	00 
 122b5b1:	e8 9a 23 ff ff       	call   121d950 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62ed4>
 122b5b6:	4c 89 f7             	mov    rdi,r14
 122b5b9:	e8 f4 2e 87 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 122b5be:	49 8b bf 28 07 00 00 	mov    rdi,QWORD PTR [r15+0x728]
 122b5c5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 122b5c8:	ff 50 28             	call   QWORD PTR [rax+0x28]
 122b5cb:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 122b5d2:	00 
 122b5d3:	48 89 c6             	mov    rsi,rax
 122b5d6:	e8 3b 9a fe ff       	call   1215016 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a59a>
 122b5db:	48 8d 9c 24 90 00 00 	lea    rbx,[rsp+0x90]
 122b5e2:	00 
 122b5e3:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
 122b5e7:	48 89 de             	mov    rsi,rbx
 122b5ea:	e8 05 9b fe ff       	call   12150f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a678>
 122b5ef:	48 89 df             	mov    rdi,rbx
 122b5f2:	e8 5b e7 e7 ff       	call   10a9d52 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271168>
 122b5f7:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
 122b5fe:	00 
 122b5ff:	e8 22 26 ff ff       	call   121dc26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x631aa>
 122b604:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 122b608:	4c 89 e7             	mov    rdi,r12
 122b60b:	ff 50 38             	call   QWORD PTR [rax+0x38]
 122b60e:	84 c0                	test   al,al
 122b610:	74 7e                	je     122b690 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70c14>
 122b612:	4d 8b b7 38 07 00 00 	mov    r14,QWORD PTR [r15+0x738]
 122b619:	41 0f 10 87 30 07 00 	movups xmm0,XMMWORD PTR [r15+0x730]
 122b620:	00 
 122b621:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
 122b626:	4d 85 f6             	test   r14,r14
 122b629:	74 05                	je     122b630 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70bb4>
 122b62b:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
 122b630:	41 0f b6 97 18 07 00 	movzx  edx,BYTE PTR [r15+0x718]
 122b637:	00 
 122b638:	48 c1 e2 20          	shl    rdx,0x20
 122b63c:	48 83 ca 04          	or     rdx,0x4
 122b640:	48 8d 0d 01 8c 6e 00 	lea    rcx,[rip+0x6e8c01]        # 1914248 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5b658>
 122b647:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
 122b64e:	00 
 122b64f:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]

## rank 35: score=45 FDE=0x122e1da..0x1230a86 features=stride8,begin-end,+10,+18,+20,sret=15
### +0x28 call 0x12306b7
 1230654:	48 8b 84 24 40 01 00 	mov    rax,QWORD PTR [rsp+0x140]
 123065b:	00 
 123065c:	49 89 86 a8 08 00 00 	mov    QWORD PTR [r14+0x8a8],rax
 1230663:	48 85 c9             	test   rcx,rcx
 1230666:	74 3b                	je     12306a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75c27>
 1230668:	48 8d 8c 24 40 01 00 	lea    rcx,[rsp+0x140]
 123066f:	00 
 1230670:	49 81 c6 a8 08 00 00 	add    r14,0x8a8
 1230677:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
 123067b:	48 8d 56 ff          	lea    rdx,[rsi-0x1]
 123067f:	48 85 d6             	test   rsi,rdx
 1230682:	75 05                	jne    1230689 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75c0d>
 1230684:	48 21 d0             	and    rax,rdx
 1230687:	eb 0d                	jmp    1230696 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75c1a>
 1230689:	48 39 f0             	cmp    rax,rsi
 123068c:	72 08                	jb     1230696 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75c1a>
 123068e:	31 d2                	xor    edx,edx
 1230690:	48 f7 f6             	div    rsi
 1230693:	48 89 d0             	mov    rax,rdx
 1230696:	48 8b 13             	mov    rdx,QWORD PTR [rbx]
 1230699:	4c 89 34 c2          	mov    QWORD PTR [rdx+rax*8],r14
 123069d:	0f 57 c0             	xorps  xmm0,xmm0
 12306a0:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
 12306a3:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
 12306aa:	00 
 12306ab:	e8 c2 c5 ff ff       	call   122cc72 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x721f6>
 12306b0:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 12306b4:	4c 89 e7             	mov    rdi,r12
 12306b7:	ff 50 28             	call   QWORD PTR [rax+0x28]
 12306ba:	84 c0                	test   al,al
 12306bc:	0f 84 31 01 00 00    	je     12307f3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75d77>
 12306c2:	0f b6 9d 50 07 00 00 	movzx  ebx,BYTE PTR [rbp+0x750]
 12306c9:	48 c1 e3 20          	shl    rbx,0x20
 12306cd:	48 83 cb 07          	or     rbx,0x7
 12306d1:	48 8b bd c8 07 00 00 	mov    rdi,QWORD PTR [rbp+0x7c8]
 12306d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12306db:	48 89 de             	mov    rsi,rbx
 12306de:	4c 8d 3d 3b 3b 6e 00 	lea    r15,[rip+0x6e3b3b]        # 1914220 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5b630>
 12306e5:	4c 89 fa             	mov    rdx,r15
 12306e8:	ff 50 10             	call   QWORD PTR [rax+0x10]
 12306eb:	c6 85 d3 08 00 00 01 	mov    BYTE PTR [rbp+0x8d3],0x1
 12306f2:	4c 8b b5 60 07 00 00 	mov    r14,QWORD PTR [rbp+0x760]
 12306f9:	4c 8d 84 24 a8 00 00 	lea    r8,[rsp+0xa8]
 1230700:	00 
 1230701:	49 89 18             	mov    QWORD PTR [r8],rbx
 1230704:	4d 89 78 08          	mov    QWORD PTR [r8+0x8],r15
 1230708:	49 89 68 10          	mov    QWORD PTR [r8+0x10],rbp
 123070c:	48 8d 35 7e c9 86 ff 	lea    rsi,[rip+0xffffffffff86c97e]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 1230713:	48 8d 0d f4 29 00 00 	lea    rcx,[rip+0x29f4]        # 123310e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x78692>
 123071a:	48 8d 9c 24 e0 01 00 	lea    rbx,[rsp+0x1e0]
 1230721:	00 
 1230722:	6a 18                	push   0x18
 1230724:	41 59                	pop    r9
 1230726:	48 89 df             	mov    rdi,rbx
 1230729:	31 d2                	xor    edx,edx
 123072b:	e8 64 a0 5a 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 1230730:	49 8b 06             	mov    rax,QWORD PTR [r14]
 1230733:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
 123073a:	00 
 123073b:	4c 89 f6             	mov    rsi,r14
 123073e:	48 89 da             	mov    rdx,rbx
 1230741:	ff 50 38             	call   QWORD PTR [rax+0x38]
 1230744:	48 8d bd 90 09 00 00 	lea    rdi,[rbp+0x990]
### +0x28 call 0x12307c1
 1230741:	ff 50 38             	call   QWORD PTR [rax+0x38]
 1230744:	48 8d bd 90 09 00 00 	lea    rdi,[rbp+0x990]
 123074b:	48 8d 9c 24 c0 00 00 	lea    rbx,[rsp+0xc0]
 1230752:	00 
 1230753:	48 89 de             	mov    rsi,rbx
 1230756:	e8 97 94 5a 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 123075b:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 123075f:	e8 22 dd 86 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1230764:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
 123076b:	00 
 123076c:	e8 77 a0 5a 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 1230771:	48 8b b5 60 07 00 00 	mov    rsi,QWORD PTR [rbp+0x760]
 1230778:	48 8d 95 b0 00 00 00 	lea    rdx,[rbp+0xb0]
 123077f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1230782:	48 8d 9c 24 e0 01 00 	lea    rbx,[rsp+0x1e0]
 1230789:	00 
 123078a:	48 89 df             	mov    rdi,rbx
 123078d:	ff 50 10             	call   QWORD PTR [rax+0x10]
 1230790:	48 8d bd 80 09 00 00 	lea    rdi,[rbp+0x980]
 1230797:	48 89 de             	mov    rsi,rbx
 123079a:	e8 7d 90 88 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
 123079f:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 12307a3:	e8 de dc 86 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 12307a8:	48 8d bd 98 08 00 00 	lea    rdi,[rbp+0x898]
 12307af:	e8 d2 02 00 00       	call   1230a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7600a>
 12307b4:	48 89 c3             	mov    rbx,rax
 12307b7:	48 8b bd 60 07 00 00 	mov    rdi,QWORD PTR [rbp+0x760]
 12307be:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12307c1:	ff 50 28             	call   QWORD PTR [rax+0x28]
 12307c4:	4c 8d b4 24 e0 01 00 	lea    r14,[rsp+0x1e0]
 12307cb:	00 
 12307cc:	4c 89 f7             	mov    rdi,r14
 12307cf:	48 89 c6             	mov    rsi,rax
 12307d2:	e8 bd 2a 00 00       	call   1233294 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x78818>
 12307d7:	48 83 c3 40          	add    rbx,0x40
 12307db:	48 89 df             	mov    rdi,rbx
 12307de:	4c 89 f6             	mov    rsi,r14
 12307e1:	e8 7c 2b 00 00       	call   1233362 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x788e6>
 12307e6:	48 8d bc 24 e8 01 00 	lea    rdi,[rsp+0x1e8]
 12307ed:	00 
 12307ee:	e8 15 86 bb ff       	call   de8e08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5e8e>
 12307f3:	48 89 ef             	mov    rdi,rbp
 12307f6:	e8 b5 2b 00 00       	call   12333b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x78934>
 12307fb:	48 89 ef             	mov    rdi,rbp
 12307fe:	31 f6                	xor    esi,esi
 1230800:	e8 bd 34 00 00       	call   1233cc2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79246>
 1230805:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 123080c:	00 00 
 123080e:	48 3b 84 24 50 05 00 	cmp    rax,QWORD PTR [rsp+0x550]
 1230815:	00 
 1230816:	0f 85 4d 02 00 00    	jne    1230a69 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75fed>
 123081c:	48 81 c4 58 05 00 00 	add    rsp,0x558
 1230823:	5b                   	pop    rbx
 1230824:	41 5c                	pop    r12
 1230826:	41 5d                	pop    r13
 1230828:	41 5e                	pop    r14
 123082a:	41 5f                	pop    r15
 123082c:	5d                   	pop    rbp
 123082d:	c3                   	ret
 123082e:	e9 75 01 00 00       	jmp    12309a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75f2c>
 1230833:	eb 4c                	jmp    1230881 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75e05>
 1230835:	48 89 c3             	mov    rbx,rax
 1230838:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]

## Exact hidden-sret +0x28 call shapes
### call 0xa11ef0
  a11e9a:	48 89 de             	mov    rsi,rbx
  a11e9d:	31 d2                	xor    edx,edx
  a11e9f:	e8 dc c9 dd 00       	call   17ee880 <_ZNSt6__ndk113basic_istreamIcNS_11char_traitsIcEEE6sentryC1ERS3_b@plt>
  a11ea4:	80 7c 24 0b 00       	cmp    BYTE PTR [rsp+0xb],0x0
  a11ea9:	74 6b                	je     a11f16 <_ZNSt6__ndk113basic_istreamIcNS_11char_traitsIcEEErsERx@@Base+0xa6>
  a11eab:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a11eae:	48 8b 70 e8          	mov    rsi,QWORD PTR [rax-0x18]
  a11eb2:	48 01 de             	add    rsi,rbx
  a11eb5:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  a11eba:	e8 61 c7 dd 00       	call   17ee620 <_ZNKSt6__ndk18ios_base6getlocEv@plt>
  a11ebf:	48 8b 35 aa 00 ea 00 	mov    rsi,QWORD PTR [rip+0xea00aa]        # 18b1f70 <_ZNSt6__ndk17num_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE2idE@@Base-0x12d998>
  a11ec6:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  a11ecb:	e8 a0 c7 dd 00       	call   17ee670 <_ZNKSt6__ndk16locale9use_facetERNS0_2idE@plt>
  a11ed0:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
  a11ed3:	48 8b 51 e8          	mov    rdx,QWORD PTR [rcx-0x18]
  a11ed7:	48 8d 0c 13          	lea    rcx,[rbx+rdx*1]
  a11edb:	48 8b 74 13 28       	mov    rsi,QWORD PTR [rbx+rdx*1+0x28]
  a11ee0:	4c 8b 10             	mov    r10,QWORD PTR [rax]
  a11ee3:	4c 8d 44 24 0c       	lea    r8,[rsp+0xc]
  a11ee8:	48 89 c7             	mov    rdi,rax
  a11eeb:	31 d2                	xor    edx,edx
  a11eed:	4d 89 f1             	mov    r9,r14
  a11ef0:	41 ff 52 28          	call   QWORD PTR [r10+0x28]
  a11ef4:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  a11ef9:	e8 32 c7 dd 00       	call   17ee630 <_ZNSt6__ndk16localeD1Ev@plt>
  a11efe:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a11f01:	48 8b 40 e8          	mov    rax,QWORD PTR [rax-0x18]
  a11f05:	48 8d 3c 03          	lea    rdi,[rbx+rax*1]
  a11f09:	8b 74 03 20          	mov    esi,DWORD PTR [rbx+rax*1+0x20]
  a11f0d:	0b 74 24 0c          	or     esi,DWORD PTR [rsp+0xc]
  a11f11:	e8 6a c7 dd 00       	call   17ee680 <_ZNSt6__ndk18ios_base5clearEj@plt>
  a11f16:	48 89 d8             	mov    rax,rbx
  a11f19:	48 83 c4 18          	add    rsp,0x18
  a11f1d:	5b                   	pop    rbx
  a11f1e:	41 5e                	pop    r14
  a11f20:	c3                   	ret
  a11f21:	49 89 c6             	mov    r14,rax
  a11f24:	eb 0d                	jmp    a11f33 <_ZNSt6__ndk113basic_istreamIcNS_11char_traitsIcEEErsERx@@Base+0xc3>
  a11f26:	49 89 c6             	mov    r14,rax
  a11f29:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  a11f2e:	e8 fd c6 dd 00       	call   17ee630 <_ZNSt6__ndk16localeD1Ev@plt>
  a11f33:	4c 89 f7             	mov    rdi,r14
  a11f36:	e8 35 bf dd 00       	call   17ede70 <__cxa_begin_catch@plt>
  a11f3b:	8b 44 24 0c          	mov    eax,DWORD PTR [rsp+0xc]
  a11f3f:	83 c8 01             	or     eax,0x1
  a11f42:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax

### call 0xa16140
  a160ea:	48 89 de             	mov    rsi,rbx
  a160ed:	31 d2                	xor    edx,edx
  a160ef:	e8 5c 9f dd 00       	call   17f0050 <_ZNSt6__ndk113basic_istreamIwNS_11char_traitsIwEEE6sentryC1ERS3_b@plt>
  a160f4:	80 7c 24 0b 00       	cmp    BYTE PTR [rsp+0xb],0x0
  a160f9:	74 6b                	je     a16166 <_ZNSt6__ndk113basic_istreamIwNS_11char_traitsIwEEErsERx@@Base+0xa6>
  a160fb:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a160fe:	48 8b 70 e8          	mov    rsi,QWORD PTR [rax-0x18]
  a16102:	48 01 de             	add    rsi,rbx
  a16105:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  a1610a:	e8 11 85 dd 00       	call   17ee620 <_ZNKSt6__ndk18ios_base6getlocEv@plt>
  a1610f:	48 8b 35 92 be e9 00 	mov    rsi,QWORD PTR [rip+0xe9be92]        # 18b1fa8 <_ZNSt6__ndk17num_getIwNS_19istreambuf_iteratorIwNS_11char_traitsIwEEEEE2idE@@Base-0x12d970>
  a16116:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  a1611b:	e8 50 85 dd 00       	call   17ee670 <_ZNKSt6__ndk16locale9use_facetERNS0_2idE@plt>
  a16120:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
  a16123:	48 8b 51 e8          	mov    rdx,QWORD PTR [rcx-0x18]
  a16127:	48 8d 0c 13          	lea    rcx,[rbx+rdx*1]
  a1612b:	48 8b 74 13 28       	mov    rsi,QWORD PTR [rbx+rdx*1+0x28]
  a16130:	4c 8b 10             	mov    r10,QWORD PTR [rax]
  a16133:	4c 8d 44 24 0c       	lea    r8,[rsp+0xc]
  a16138:	48 89 c7             	mov    rdi,rax
  a1613b:	31 d2                	xor    edx,edx
  a1613d:	4d 89 f1             	mov    r9,r14
  a16140:	41 ff 52 28          	call   QWORD PTR [r10+0x28]
  a16144:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  a16149:	e8 e2 84 dd 00       	call   17ee630 <_ZNSt6__ndk16localeD1Ev@plt>
  a1614e:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a16151:	48 8b 40 e8          	mov    rax,QWORD PTR [rax-0x18]
  a16155:	48 8d 3c 03          	lea    rdi,[rbx+rax*1]
  a16159:	8b 74 03 20          	mov    esi,DWORD PTR [rbx+rax*1+0x20]
  a1615d:	0b 74 24 0c          	or     esi,DWORD PTR [rsp+0xc]
  a16161:	e8 1a 85 dd 00       	call   17ee680 <_ZNSt6__ndk18ios_base5clearEj@plt>
  a16166:	48 89 d8             	mov    rax,rbx
  a16169:	48 83 c4 18          	add    rsp,0x18
  a1616d:	5b                   	pop    rbx
  a1616e:	41 5e                	pop    r14
  a16170:	c3                   	ret
  a16171:	49 89 c6             	mov    r14,rax
  a16174:	eb 0d                	jmp    a16183 <_ZNSt6__ndk113basic_istreamIwNS_11char_traitsIwEEErsERx@@Base+0xc3>
  a16176:	49 89 c6             	mov    r14,rax
  a16179:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  a1617e:	e8 ad 84 dd 00       	call   17ee630 <_ZNSt6__ndk16localeD1Ev@plt>
  a16183:	4c 89 f7             	mov    rdi,r14
  a16186:	e8 e5 7c dd 00       	call   17ede70 <__cxa_begin_catch@plt>
  a1618b:	8b 44 24 0c          	mov    eax,DWORD PTR [rsp+0xc]
  a1618f:	83 c8 01             	or     eax,0x1
  a16192:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax

### call 0xaaf890
  aaf833:	48 83 a4 24 98 00 00 	and    QWORD PTR [rsp+0x98],0x0
  aaf83a:	00 00 
  aaf83c:	8b 84 24 a0 00 00 00 	mov    eax,DWORD PTR [rsp+0xa0]
  aaf843:	83 a4 24 a0 00 00 00 	and    DWORD PTR [rsp+0xa0],0x0
  aaf84a:	00 
  aaf84b:	89 84 24 80 00 00 00 	mov    DWORD PTR [rsp+0x80],eax
  aaf852:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
  aaf859:	00 
  aaf85a:	48 89 94 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rdx
  aaf861:	00 
  aaf862:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
  aaf869:	00 
  aaf86a:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
  aaf86f:	4c 89 fe             	mov    rsi,r15
  aaf872:	e8 c2 b0 ff ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
  aaf877:	49 8b 06             	mov    rax,QWORD PTR [r14]
  aaf87a:	4c 8d 7c 24 70       	lea    r15,[rsp+0x70]
  aaf87f:	4c 8d 64 24 28       	lea    r12,[rsp+0x28]
  aaf884:	48 89 df             	mov    rdi,rbx
  aaf887:	4c 89 f6             	mov    rsi,r14
  aaf88a:	4c 89 fa             	mov    rdx,r15
  aaf88d:	4c 89 e1             	mov    rcx,r12
  aaf890:	ff 50 28             	call   QWORD PTR [rax+0x28]
  aaf893:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
  aaf898:	e8 e9 eb fe ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  aaf89d:	4c 89 ff             	mov    rdi,r15
  aaf8a0:	e8 c7 04 00 00       	call   aafd6c <JNI_OnUnload@@Base+0x37639>
  aaf8a5:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
  aaf8ac:	00 
  aaf8ad:	e8 ba 04 00 00       	call   aafd6c <JNI_OnUnload@@Base+0x37639>
  aaf8b2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  aaf8b9:	00 00 
  aaf8bb:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
  aaf8c2:	00 
  aaf8c3:	75 2d                	jne    aaf8f2 <JNI_OnUnload@@Base+0x371bf>
  aaf8c5:	48 89 d8             	mov    rax,rbx
  aaf8c8:	48 81 c4 b8 00 00 00 	add    rsp,0xb8
  aaf8cf:	5b                   	pop    rbx
  aaf8d0:	41 5c                	pop    r12
  aaf8d2:	41 5d                	pop    r13
  aaf8d4:	41 5e                	pop    r14
  aaf8d6:	41 5f                	pop    r15
  aaf8d8:	5d                   	pop    rbp
  aaf8d9:	c3                   	ret
  aaf8da:	48 83 e1 fe          	and    rcx,0xfffffffffffffffe
  aaf8de:	48 8b 09             	mov    rcx,QWORD PTR [rcx]

### call 0xb3c98c
  b3c935:	49 83 c4 30          	add    r12,0x30
  b3c939:	4c 89 e7             	mov    rdi,r12
  b3c93c:	e8 f5 ee f3 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  b3c941:	4c 89 ef             	mov    rdi,r13
  b3c944:	48 89 c6             	mov    rsi,rax
  b3c947:	e8 06 2f c4 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
  b3c94c:	84 c0                	test   al,al
  b3c94e:	0f 84 cd 01 00 00    	je     b3cb21 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x89ac1>
  b3c954:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
  b3c959:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
  b3c960:	00 
  b3c961:	e8 9a fd ff ff       	call   b3c700 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x896a0>
  b3c966:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
  b3c96b:	4c 89 fe             	mov    rsi,r15
  b3c96e:	e8 c6 df f6 ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
  b3c973:	49 8b 06             	mov    rax,QWORD PTR [r14]
  b3c976:	4c 8d 7c 24 70       	lea    r15,[rsp+0x70]
  b3c97b:	4c 8d 64 24 28       	lea    r12,[rsp+0x28]
  b3c980:	48 89 df             	mov    rdi,rbx
  b3c983:	4c 89 f6             	mov    rsi,r14
  b3c986:	4c 89 fa             	mov    rdx,r15
  b3c989:	4c 89 e1             	mov    rcx,r12
  b3c98c:	ff 50 28             	call   QWORD PTR [rax+0x28]
  b3c98f:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
  b3c994:	e8 ed 1a f6 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b3c999:	4c 89 ff             	mov    rdi,r15
  b3c99c:	e8 6d e1 f6 ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
  b3c9a1:	e9 81 01 00 00       	jmp    b3cb27 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x89ac7>
  b3c9a6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b3c9ad:	00 00 
  b3c9af:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
  b3c9b6:	00 
  b3c9b7:	0f 85 2a 02 00 00    	jne    b3cbe7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x89b87>
  b3c9bd:	0f 57 c0             	xorps  xmm0,xmm0
  b3c9c0:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
  b3c9c3:	e9 fe 01 00 00       	jmp    b3cbc6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x89b66>
  b3c9c8:	4c 8d ac 24 90 00 00 	lea    r13,[rsp+0x90]
  b3c9cf:	00 
  b3c9d0:	49 83 65 08 00       	and    QWORD PTR [r13+0x8],0x0
  b3c9d5:	41 83 65 10 00       	and    DWORD PTR [r13+0x10],0x0
  b3c9da:	48 8d 05 57 c3 d6 00 	lea    rax,[rip+0xd6c357]        # 18a8d38 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x15c78>
  b3c9e1:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
  b3c9e5:	49 83 c4 30          	add    r12,0x30
  b3c9e9:	4c 89 e7             	mov    rdi,r12
  b3c9ec:	e8 45 ee f3 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  b3c9f1:	4c 89 ef             	mov    rdi,r13

### call 0xb41fa4
  b41f4a:	48 8d 3d bf a4 d8 00 	lea    rdi,[rip+0xd8a4bf]        # 18cc410 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x13820>
  b41f51:	48 8b 05 c0 a4 d8 00 	mov    rax,QWORD PTR [rip+0xd8a4c0]        # 18cc418 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x13828>
  b41f58:	0f 18 08             	prefetcht0 BYTE PTR [rax]
  b41f5b:	e8 8a cc c0 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
  b41f60:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
  b41f67:	00 
  b41f68:	48 8d 84 24 90 00 00 	lea    rax,[rsp+0x90]
  b41f6f:	00 
  b41f70:	48 89 d7             	mov    rdi,rdx
  b41f73:	48 89 c2             	mov    rdx,rax
  b41f76:	e8 1f 82 bf 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
  b41f7b:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  b41f80:	4c 89 fe             	mov    rsi,r15
  b41f83:	e8 b1 89 f6 ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
  b41f88:	49 8b 06             	mov    rax,QWORD PTR [r14]
  b41f8b:	4c 8d bc 24 d8 00 00 	lea    r15,[rsp+0xd8]
  b41f92:	00 
  b41f93:	4c 8d 64 24 38       	lea    r12,[rsp+0x38]
  b41f98:	48 89 df             	mov    rdi,rbx
  b41f9b:	4c 89 f6             	mov    rsi,r14
  b41f9e:	4c 89 fa             	mov    rdx,r15
  b41fa1:	4c 89 e1             	mov    rcx,r12
  b41fa4:	ff 50 28             	call   QWORD PTR [rax+0x28]
  b41fa7:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
  b41fac:	e8 d5 c4 f5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b41fb1:	4c 89 ff             	mov    rdi,r15
  b41fb4:	e8 9d 01 00 00       	call   b42156 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8f0f6>
  b41fb9:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
  b41fc0:	00 
  b41fc1:	e8 90 01 00 00       	call   b42156 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8f0f6>
  b41fc6:	eb 7d                	jmp    b42045 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8efe5>
  b41fc8:	0f 18 0d e9 a6 d8 00 	prefetcht0 BYTE PTR [rip+0xd8a6e9]        # 18cc6b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x13ac8>
  b41fcf:	48 8d 3d e2 a6 d8 00 	lea    rdi,[rip+0xd8a6e2]        # 18cc6b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x13ac8>
  b41fd6:	48 8b 05 e3 a6 d8 00 	mov    rax,QWORD PTR [rip+0xd8a6e3]        # 18cc6c0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x13ad0>
  b41fdd:	0f 18 08             	prefetcht0 BYTE PTR [rax]
  b41fe0:	e8 05 cc c0 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
  b41fe5:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
  b41fea:	48 8d 84 24 90 00 00 	lea    rax,[rsp+0x90]
  b41ff1:	00 
  b41ff2:	48 89 d7             	mov    rdi,rdx
  b41ff5:	48 89 c2             	mov    rdx,rax
  b41ff8:	e8 9d 81 bf 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
  b41ffd:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  b42002:	4c 89 fe             	mov    rsi,r15
  b42005:	e8 2f 89 f6 ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
  b4200a:	49 8b 06             	mov    rax,QWORD PTR [r14]

### call 0xb47cbd
  b47c67:	4c 89 e7             	mov    rdi,r12
  b47c6a:	e8 c7 3b f3 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  b47c6f:	4c 89 ef             	mov    rdi,r13
  b47c72:	48 89 c6             	mov    rsi,rax
  b47c75:	e8 d8 7b c3 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
  b47c7a:	84 c0                	test   al,al
  b47c7c:	0f 84 e9 01 00 00    	je     b47e6b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x94e0b>
  b47c82:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  b47c89:	00 
  b47c8a:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
  b47c8f:	e8 70 7c f6 ff       	call   aaf904 <JNI_OnUnload@@Base+0x371d1>
  b47c94:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  b47c99:	4c 89 fe             	mov    rsi,r15
  b47c9c:	e8 98 2c f6 ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
  b47ca1:	49 8b 06             	mov    rax,QWORD PTR [r14]
  b47ca4:	4c 8d bc 24 d8 00 00 	lea    r15,[rsp+0xd8]
  b47cab:	00 
  b47cac:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
  b47cb1:	48 89 df             	mov    rdi,rbx
  b47cb4:	4c 89 f6             	mov    rsi,r14
  b47cb7:	4c 89 fa             	mov    rdx,r15
  b47cba:	4c 89 e1             	mov    rcx,r12
  b47cbd:	ff 50 28             	call   QWORD PTR [rax+0x28]
  b47cc0:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
  b47cc5:	e8 bc 67 f5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b47cca:	4c 89 ff             	mov    rdi,r15
  b47ccd:	e9 ce 00 00 00       	jmp    b47da0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x94d40>
  b47cd2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b47cd9:	00 00 
  b47cdb:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
  b47ce2:	00 
  b47ce3:	0f 85 40 02 00 00    	jne    b47f29 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x94ec9>
  b47ce9:	0f 57 c0             	xorps  xmm0,xmm0
  b47cec:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
  b47cef:	e9 14 02 00 00       	jmp    b47f08 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x94ea8>
  b47cf4:	4c 8d 6c 24 78       	lea    r13,[rsp+0x78]
  b47cf9:	49 83 65 08 00       	and    QWORD PTR [r13+0x8],0x0
  b47cfe:	41 83 65 10 00       	and    DWORD PTR [r13+0x10],0x0
  b47d03:	48 8d 05 2e 10 d6 00 	lea    rax,[rip+0xd6102e]        # 18a8d38 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x15c78>
  b47d0a:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
  b47d0e:	49 83 c4 30          	add    r12,0x30
  b47d12:	4c 89 e7             	mov    rdi,r12
  b47d15:	e8 1c 3b f3 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  b47d1a:	4c 89 ef             	mov    rdi,r13
  b47d1d:	48 89 c6             	mov    rsi,rax
  b47d20:	e8 2d 7b c3 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>

### call 0xb9220c
  b921b6:	48 89 84 24 40 02 00 	mov    QWORD PTR [rsp+0x240],rax
  b921bd:	00 
  b921be:	48 89 cf             	mov    rdi,rcx
  b921c1:	e8 04 11 fd ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
  b921c6:	49 89 c6             	mov    r14,rax
  b921c9:	4c 8b 7b 68          	mov    r15,QWORD PTR [rbx+0x68]
  b921cd:	48 8d 35 22 3d 7f ff 	lea    rsi,[rip+0xffffffffff7f3d22]        # 385ef6 <_ZTSSt12bad_any_cast@@Base-0xa2d2>
  b921d4:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
  b921d9:	4c 89 e7             	mov    rdi,r12
  b921dc:	e8 9d 78 ee ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  b921e1:	49 8b 07             	mov    rax,QWORD PTR [r15]
  b921e4:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  b921eb:	00 
  b921ec:	4c 89 fe             	mov    rsi,r15
  b921ef:	4c 89 e2             	mov    rdx,r12
  b921f2:	ff 50 18             	call   QWORD PTR [rax+0x18]
  b921f5:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
  b921f9:	4c 8b bb 80 00 00 00 	mov    r15,QWORD PTR [rbx+0x80]
  b92200:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  b92203:	ff 50 10             	call   QWORD PTR [rax+0x10]
  b92206:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  b92209:	48 89 c7             	mov    rdi,rax
  b9220c:	ff 51 28             	call   QWORD PTR [rcx+0x28]
  b9220f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  b92214:	49 8b 06             	mov    rax,QWORD PTR [r14]
  b92217:	4c 89 f7             	mov    rdi,r14
  b9221a:	ff 50 48             	call   QWORD PTR [rax+0x48]
  b9221d:	49 89 c6             	mov    r14,rax
  b92220:	4c 8b 63 20          	mov    r12,QWORD PTR [rbx+0x20]
  b92224:	4c 8b 6b 40          	mov    r13,QWORD PTR [rbx+0x40]
  b92228:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
  b9222f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  b92232:	ff 50 18             	call   QWORD PTR [rax+0x18]
  b92235:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  b9223a:	48 89 c6             	mov    rsi,rax
  b9223d:	e8 fe bc c5 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  b92242:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  b92245:	8b 70 48             	mov    esi,DWORD PTR [rax+0x48]
  b92248:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  b9224d:	e8 3e c4 c5 00       	call   17ee690 <_ZNSt6__ndk19to_stringEj@plt>
  b92252:	4c 89 74 24 28       	mov    QWORD PTR [rsp+0x28],r14
  b92257:	bf 80 00 00 00       	mov    edi,0x80
  b9225c:	e8 9f bc c5 00       	call   17edf00 <_Znwm@plt>
  b92261:	48 89 c3             	mov    rbx,rax
  b92264:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
  b92268:	48 8d 05 d1 c5 c7 00 	lea    rax,[rip+0xc7c5d1]        # 180e840 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4500>

### call 0xbc7867
  bc7816:	0f b7 4e 04          	movzx  ecx,WORD PTR [rsi+0x4]
  bc781a:	66 89 4f 14          	mov    WORD PTR [rdi+0x14],cx
  bc781e:	8b 0e                	mov    ecx,DWORD PTR [rsi]
  bc7820:	89 4f 10             	mov    DWORD PTR [rdi+0x10],ecx
  bc7823:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  bc7827:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
  bc782a:	48 89 c6             	mov    rsi,rax
  bc782d:	ff 51 10             	call   QWORD PTR [rcx+0x10]
  bc7830:	8b 73 10             	mov    esi,DWORD PTR [rbx+0x10]
  bc7833:	48 8b 53 38          	mov    rdx,QWORD PTR [rbx+0x38]
  bc7837:	48 8b 4b 40          	mov    rcx,QWORD PTR [rbx+0x40]
  bc783b:	4c 8b 43 48          	mov    r8,QWORD PTR [rbx+0x48]
  bc783f:	4c 8b 4b 50          	mov    r9,QWORD PTR [rbx+0x50]
  bc7843:	0f 10 43 58          	movups xmm0,XMMWORD PTR [rbx+0x58]
  bc7847:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
  bc784b:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
  bc7850:	4c 89 f7             	mov    rdi,r14
  bc7853:	e8 84 03 00 00       	call   bc7bdc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x114b7c>
  bc7858:	48 8b 73 20          	mov    rsi,QWORD PTR [rbx+0x20]
  bc785c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  bc785f:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  bc7864:	4c 89 f2             	mov    rdx,r14
  bc7867:	ff 50 28             	call   QWORD PTR [rax+0x28]
  bc786a:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
  bc786f:	4c 8d 74 24 38       	lea    r14,[rsp+0x38]
  bc7874:	49 89 06             	mov    QWORD PTR [r14],rax
  bc7877:	41 c7 46 08 01 00 00 	mov    DWORD PTR [r14+0x8],0x1
  bc787e:	00 
  bc787f:	48 8d bb 88 00 00 00 	lea    rdi,[rbx+0x88]
  bc7886:	4c 89 f6             	mov    rsi,r14
  bc7889:	e8 96 a4 fc ff       	call   b91d24 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdecc4>
  bc788e:	4c 89 f7             	mov    rdi,r14
  bc7891:	e8 20 5f ee ff       	call   aad7b6 <JNI_OnUnload@@Base+0x35083>
  bc7896:	c6 83 98 00 00 00 01 	mov    BYTE PTR [rbx+0x98],0x1
  bc789d:	48 8b 43 38          	mov    rax,QWORD PTR [rbx+0x38]
  bc78a1:	8b 00                	mov    eax,DWORD PTR [rax]
  bc78a3:	41 89 06             	mov    DWORD PTR [r14],eax
  bc78a6:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
  bc78aa:	8b 00                	mov    eax,DWORD PTR [rax]
  bc78ac:	41 89 46 04          	mov    DWORD PTR [r14+0x4],eax
  bc78b0:	48 8b 43 48          	mov    rax,QWORD PTR [rbx+0x48]
  bc78b4:	8b 00                	mov    eax,DWORD PTR [rax]
  bc78b6:	41 89 46 08          	mov    DWORD PTR [r14+0x8],eax
  bc78ba:	48 8b 43 50          	mov    rax,QWORD PTR [rbx+0x50]
  bc78be:	8b 00                	mov    eax,DWORD PTR [rax]
  bc78c0:	41 89 46 0c          	mov    DWORD PTR [r14+0xc],eax

### call 0xc597f1
  c59793:	0f 18 0d 56 38 c8 00 	prefetcht0 BYTE PTR [rip+0xc83856]        # 18dcff0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x24400>
  c5979a:	48 8d 3d 4f 38 c8 00 	lea    rdi,[rip+0xc8384f]        # 18dcff0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x24400>
  c597a1:	48 8b 05 50 38 c8 00 	mov    rax,QWORD PTR [rip+0xc83850]        # 18dcff8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x24408>
  c597a8:	0f 18 08             	prefetcht0 BYTE PTR [rax]
  c597ab:	e8 3a 54 af 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
  c597b0:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
  c597b7:	00 
  c597b8:	48 8d 44 24 68       	lea    rax,[rsp+0x68]
  c597bd:	48 89 d7             	mov    rdi,rdx
  c597c0:	48 89 c2             	mov    rdx,rax
  c597c3:	e8 d2 09 ae 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
  c597c8:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  c597cd:	4c 89 fe             	mov    rsi,r15
  c597d0:	e8 64 11 e5 ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
  c597d5:	49 8b 06             	mov    rax,QWORD PTR [r14]
  c597d8:	4c 8d bc 24 a8 00 00 	lea    r15,[rsp+0xa8]
  c597df:	00 
  c597e0:	4c 8d 64 24 18       	lea    r12,[rsp+0x18]
  c597e5:	48 89 df             	mov    rdi,rbx
  c597e8:	4c 89 f6             	mov    rsi,r14
  c597eb:	4c 89 fa             	mov    rdx,r15
  c597ee:	4c 89 e1             	mov    rcx,r12
  c597f1:	ff 50 28             	call   QWORD PTR [rax+0x28]
  c597f4:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
  c597f9:	e8 88 4c e4 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  c597fe:	4c 89 ff             	mov    rdi,r15
  c59801:	e8 56 03 00 00       	call   c59b5c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a6afc>
  c59806:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
  c5980b:	e8 4c 03 00 00       	call   c59b5c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a6afc>
  c59810:	eb 77                	jmp    c59889 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a6829>
  c59812:	0f 18 0d 07 39 c8 00 	prefetcht0 BYTE PTR [rip+0xc83907]        # 18dd120 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x24530>
  c59819:	48 8d 3d 00 39 c8 00 	lea    rdi,[rip+0xc83900]        # 18dd120 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x24530>
  c59820:	48 8b 05 01 39 c8 00 	mov    rax,QWORD PTR [rip+0xc83901]        # 18dd128 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x24538>
  c59827:	0f 18 08             	prefetcht0 BYTE PTR [rax]
  c5982a:	e8 bb 53 af 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
  c5982f:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
  c59834:	48 8d 44 24 68       	lea    rax,[rsp+0x68]
  c59839:	48 89 d7             	mov    rdi,rdx
  c5983c:	48 89 c2             	mov    rdx,rax
  c5983f:	e8 56 09 ae 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
  c59844:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  c59849:	4c 89 fe             	mov    rsi,r15
  c5984c:	e8 e8 10 e5 ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
  c59851:	49 8b 06             	mov    rax,QWORD PTR [r14]
  c59854:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]
  c59859:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]

### call 0xc86a85
  c86a33:	0f 18 08             	prefetcht0 BYTE PTR [rax]
  c86a36:	e8 af 81 ac 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
  c86a3b:	48 8d b4 24 60 03 00 	lea    rsi,[rsp+0x360]
  c86a42:	00 
  c86a43:	48 8d 84 24 08 03 00 	lea    rax,[rsp+0x308]
  c86a4a:	00 
  c86a4b:	48 89 d7             	mov    rdi,rdx
  c86a4e:	48 89 c2             	mov    rdx,rax
  c86a51:	e8 44 37 ab 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
  c86a56:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
  c86a5d:	00 
  c86a5e:	4c 89 fe             	mov    rsi,r15
  c86a61:	e8 d3 3e e2 ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
  c86a66:	49 8b 06             	mov    rax,QWORD PTR [r14]
  c86a69:	4c 8d bc 24 60 03 00 	lea    r15,[rsp+0x360]
  c86a70:	00 
  c86a71:	4c 8d a4 24 c0 00 00 	lea    r12,[rsp+0xc0]
  c86a78:	00 
  c86a79:	48 89 df             	mov    rdi,rbx
  c86a7c:	4c 89 f6             	mov    rsi,r14
  c86a7f:	4c 89 fa             	mov    rdx,r15
  c86a82:	4c 89 e1             	mov    rcx,r12
  c86a85:	ff 50 28             	call   QWORD PTR [rax+0x28]
  c86a88:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
  c86a8d:	e8 f4 79 e1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  c86a92:	4c 89 ff             	mov    rdi,r15
  c86a95:	e8 c2 41 e2 ff       	call   aaac5c <JNI_OnUnload@@Base+0x32529>
  c86a9a:	48 8d bc 24 08 03 00 	lea    rdi,[rsp+0x308]
  c86aa1:	00 
  c86aa2:	e8 b5 41 e2 ff       	call   aaac5c <JNI_OnUnload@@Base+0x32529>
  c86aa7:	e9 e4 02 00 00       	jmp    c86d90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d3d30>
  c86aac:	0f 18 0d e5 8a c5 00 	prefetcht0 BYTE PTR [rip+0xc58ae5]        # 18df598 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x269a8>
  c86ab3:	48 8d 3d de 8a c5 00 	lea    rdi,[rip+0xc58ade]        # 18df598 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x269a8>
  c86aba:	48 8b 05 df 8a c5 00 	mov    rax,QWORD PTR [rip+0xc58adf]        # 18df5a0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x269b0>
  c86ac1:	0f 18 08             	prefetcht0 BYTE PTR [rax]
  c86ac4:	e8 21 81 ac 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
  c86ac9:	48 8d b4 24 08 01 00 	lea    rsi,[rsp+0x108]
  c86ad0:	00 
  c86ad1:	48 8d 84 24 08 03 00 	lea    rax,[rsp+0x308]
  c86ad8:	00 
  c86ad9:	48 89 d7             	mov    rdi,rdx
  c86adc:	48 89 c2             	mov    rdx,rax
  c86adf:	e8 b6 36 ab 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
  c86ae4:	6a 40                	push   0x40
  c86ae6:	5f                   	pop    rdi
  c86ae7:	e8 14 74 b6 00       	call   17edf00 <_Znwm@plt>

### call 0xc88c32
  c88bd0:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
  c88bd3:	e9 ca 00 00 00       	jmp    c88ca2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d5c42>
  c88bd8:	0f 18 0d 69 77 c5 00 	prefetcht0 BYTE PTR [rip+0xc57769]        # 18e0348 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x27758>
  c88bdf:	48 8d 3d 62 77 c5 00 	lea    rdi,[rip+0xc57762]        # 18e0348 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x27758>
  c88be6:	48 8b 05 63 77 c5 00 	mov    rax,QWORD PTR [rip+0xc57763]        # 18e0350 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x27760>
  c88bed:	0f 18 08             	prefetcht0 BYTE PTR [rax]
  c88bf0:	e8 f5 5f ac 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
  c88bf5:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
  c88bfa:	48 8d 44 24 60       	lea    rax,[rsp+0x60]
  c88bff:	48 89 d7             	mov    rdi,rdx
  c88c02:	48 89 c2             	mov    rdx,rax
  c88c05:	e8 90 15 ab 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
  c88c0a:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  c88c0f:	4c 89 fe             	mov    rsi,r15
  c88c12:	e8 22 1d e2 ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
  c88c17:	4c 8d 7c 24 48       	lea    r15,[rsp+0x48]
  c88c1c:	49 8b 06             	mov    rax,QWORD PTR [r14]
  c88c1f:	48 8d 54 24 40       	lea    rdx,[rsp+0x40]
  c88c24:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
  c88c29:	48 89 df             	mov    rdi,rbx
  c88c2c:	4c 89 f6             	mov    rsi,r14
  c88c2f:	4c 89 e1             	mov    rcx,r12
  c88c32:	ff 50 28             	call   QWORD PTR [rax+0x28]
  c88c35:	eb 59                	jmp    c88c90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d5c30>
  c88c37:	0f 18 0d d2 77 c5 00 	prefetcht0 BYTE PTR [rip+0xc577d2]        # 18e0410 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x27820>
  c88c3e:	48 8d 3d cb 77 c5 00 	lea    rdi,[rip+0xc577cb]        # 18e0410 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x27820>
  c88c45:	48 8b 05 cc 77 c5 00 	mov    rax,QWORD PTR [rip+0xc577cc]        # 18e0418 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x27828>
  c88c4c:	0f 18 08             	prefetcht0 BYTE PTR [rax]
  c88c4f:	e8 96 5f ac 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
  c88c54:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
  c88c59:	48 8d 44 24 60       	lea    rax,[rsp+0x60]
  c88c5e:	48 89 d7             	mov    rdi,rdx
  c88c61:	48 89 c2             	mov    rdx,rax
  c88c64:	e8 31 15 ab 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
  c88c69:	48 89 e7             	mov    rdi,rsp
  c88c6c:	4c 89 fe             	mov    rsi,r15
  c88c6f:	e8 c5 1c e2 ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
  c88c74:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]
  c88c79:	49 8b 06             	mov    rax,QWORD PTR [r14]
  c88c7c:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
  c88c81:	49 89 e4             	mov    r12,rsp
  c88c84:	48 89 df             	mov    rdi,rbx
  c88c87:	4c 89 f6             	mov    rsi,r14
  c88c8a:	4c 89 e1             	mov    rcx,r12
  c88c8d:	ff 50 30             	call   QWORD PTR [rax+0x30]
  c88c90:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]

### call 0xc962d6
  c96276:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  c96279:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
  c9627e:	48 8d 54 24 60       	lea    rdx,[rsp+0x60]
  c96283:	48 8d 4c 24 48       	lea    rcx,[rsp+0x48]
  c96288:	e8 63 cd 97 00       	call   1612ff0 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe15e>
  c9628d:	4d 8b 37             	mov    r14,QWORD PTR [r15]
  c96290:	48 8d 35 86 8b 6a ff 	lea    rsi,[rip+0xffffffffff6a8b86]        # 33ee1d <_ZTSSt12bad_any_cast@@Base-0x513ab>
  c96297:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  c9629c:	e8 dd 37 de ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  c962a1:	48 8d 35 d4 bc 7b ff 	lea    rsi,[rip+0xffffffffff7bbcd4]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
  c962a8:	48 89 e7             	mov    rdi,rsp
  c962ab:	e8 ce 37 de ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  c962b0:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  c962b3:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
  c962b8:	48 8d 54 24 18       	lea    rdx,[rsp+0x18]
  c962bd:	48 89 e1             	mov    rcx,rsp
  c962c0:	4c 89 f7             	mov    rdi,r14
  c962c3:	e8 28 cd 97 00       	call   1612ff0 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe15e>
  c962c8:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  c962cb:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
  c962d0:	48 89 df             	mov    rdi,rbx
  c962d3:	4c 89 f2             	mov    rdx,r14
  c962d6:	ff 50 28             	call   QWORD PTR [rax+0x28]
  c962d9:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  c962de:	e8 ad 7b b5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  c962e3:	48 89 e7             	mov    rdi,rsp
  c962e6:	e8 a5 7b b5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  c962eb:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  c962f0:	e8 9b 7b b5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  c962f5:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
  c962fa:	e8 91 7b b5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  c962ff:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
  c96304:	e8 87 7b b5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  c96309:	48 8d 5c 24 60       	lea    rbx,[rsp+0x60]
  c9630e:	48 89 df             	mov    rdi,rbx
  c96311:	e8 7a 7b b5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  c96316:	4d 8b 27             	mov    r12,QWORD PTR [r15]
  c96319:	4d 8b 6f 08          	mov    r13,QWORD PTR [r15+0x8]
  c9631d:	48 8d 35 7c f7 6b ff 	lea    rsi,[rip+0xffffffffff6bf77c]        # 355aa0 <_ZTSSt12bad_any_cast@@Base-0x3a728>
  c96324:	4c 8d 74 24 78       	lea    r14,[rsp+0x78]
  c96329:	4c 89 f7             	mov    rdi,r14
  c9632c:	e8 4d 37 de ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  c96331:	c6 03 01             	mov    BYTE PTR [rbx],0x1
  c96334:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
  c96338:	48 8d 54 24 60       	lea    rdx,[rsp+0x60]
  c9633d:	4c 89 f6             	mov    rsi,r14

### call 0xdda60d
  dda5b6:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
  dda5ba:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  dda5bf:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
  dda5c3:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  dda5c8:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  dda5cc:	4c 89 6c 24 78       	mov    QWORD PTR [rsp+0x78],r13
  dda5d1:	4c 89 ef             	mov    rdi,r13
  dda5d4:	ff 50 28             	call   QWORD PTR [rax+0x28]
  dda5d7:	49 89 c5             	mov    r13,rax
  dda5da:	49 8b 07             	mov    rax,QWORD PTR [r15]
  dda5dd:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
  dda5e2:	4c 89 ff             	mov    rdi,r15
  dda5e5:	ff 50 28             	call   QWORD PTR [rax+0x28]
  dda5e8:	49 8b 4e 40          	mov    rcx,QWORD PTR [r14+0x40]
  dda5ec:	4c 8d 05 0d ff 5f ff 	lea    r8,[rip+0xffffffffff5fff0d]        # 3da500 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x50e5>
  dda5f3:	48 8d bc 24 e8 00 00 	lea    rdi,[rsp+0xe8]
  dda5fa:	00 
  dda5fb:	4c 89 ee             	mov    rsi,r13
  dda5fe:	48 89 c2             	mov    rdx,rax
  dda601:	e8 da 1b 00 00       	call   ddc1e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa9266>
  dda606:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  dda60a:	4c 89 e7             	mov    rdi,r12
  dda60d:	ff 50 28             	call   QWORD PTR [rax+0x28]
  dda610:	4c 8b 78 10          	mov    r15,QWORD PTR [rax+0x10]
  dda614:	6a 58                	push   0x58
  dda616:	5f                   	pop    rdi
  dda617:	e8 e4 38 a1 00       	call   17edf00 <_Znwm@plt>
  dda61c:	49 89 c6             	mov    r14,rax
  dda61f:	48 89 ac 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rbp
  dda626:	00 
  dda627:	48 8d 05 0a 03 a5 00 	lea    rax,[rip+0xa5030a]        # 182a938 <_ZTIN4asio2ip16bad_address_castE@@Base+0x6f68>
  dda62e:	48 8d 8c 24 60 01 00 	lea    rcx,[rsp+0x160]
  dda635:	00 
  dda636:	48 89 01             	mov    QWORD PTR [rcx],rax
  dda639:	48 89 59 08          	mov    QWORD PTR [rcx+0x8],rbx
  dda63d:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
  dda642:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
  dda646:	48 8b 84 24 e8 00 00 	mov    rax,QWORD PTR [rsp+0xe8]
  dda64d:	00 
  dda64e:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  dda652:	48 83 a4 24 e8 00 00 	and    QWORD PTR [rsp+0xe8],0x0
  dda659:	00 00 
  dda65b:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
  dda65f:	41 c6 46 08 00       	mov    BYTE PTR [r14+0x8],0x0
  dda664:	48 8d 05 15 03 a5 00 	lea    rax,[rip+0xa50315]        # 182a980 <_ZTIN4asio2ip16bad_address_castE@@Base+0x6fb0>
  dda66b:	49 89 06             	mov    QWORD PTR [r14],rax

### call 0xde223e
  de21de:	e9 ef 00 00 00       	jmp    de22d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaf358>
  de21e3:	0f 18 0d 7e 68 b3 00 	prefetcht0 BYTE PTR [rip+0xb3687e]        # 1918a68 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5fe78>
  de21ea:	48 8d 3d 77 68 b3 00 	lea    rdi,[rip+0xb36877]        # 1918a68 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5fe78>
  de21f1:	48 8b 05 78 68 b3 00 	mov    rax,QWORD PTR [rip+0xb36878]        # 1918a70 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5fe80>
  de21f8:	0f 18 08             	prefetcht0 BYTE PTR [rax]
  de21fb:	e8 ea c9 96 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
  de2200:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
  de2205:	48 8d 84 24 80 00 00 	lea    rax,[rsp+0x80]
  de220c:	00 
  de220d:	48 89 d7             	mov    rdi,rdx
  de2210:	48 89 c2             	mov    rdx,rax
  de2213:	e8 82 7f 95 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
  de2218:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  de221d:	4c 89 fe             	mov    rsi,r15
  de2220:	e8 14 87 cc ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
  de2225:	49 8b 06             	mov    rax,QWORD PTR [r14]
  de2228:	4c 8d 7c 24 50       	lea    r15,[rsp+0x50]
  de222d:	4c 8d 64 24 18       	lea    r12,[rsp+0x18]
  de2232:	48 89 df             	mov    rdi,rbx
  de2235:	4c 89 f6             	mov    rsi,r14
  de2238:	4c 89 fa             	mov    rdx,r15
  de223b:	4c 89 e1             	mov    rcx,r12
  de223e:	ff 50 28             	call   QWORD PTR [rax+0x28]
  de2241:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
  de2246:	e8 3b c2 cb ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  de224b:	4c 89 ff             	mov    rdi,r15
  de224e:	e8 7b cb cd ff       	call   abedce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbd6e>
  de2253:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  de225a:	00 
  de225b:	e8 6e cb cd ff       	call   abedce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbd6e>
  de2260:	eb 7d                	jmp    de22df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaf365>
  de2262:	0f 18 0d f7 68 b3 00 	prefetcht0 BYTE PTR [rip+0xb368f7]        # 1918b60 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5ff70>
  de2269:	48 8d 3d f0 68 b3 00 	lea    rdi,[rip+0xb368f0]        # 1918b60 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5ff70>
  de2270:	48 8b 05 f1 68 b3 00 	mov    rax,QWORD PTR [rip+0xb368f1]        # 1918b68 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5ff78>
  de2277:	0f 18 08             	prefetcht0 BYTE PTR [rax]
  de227a:	e8 6b c9 96 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
  de227f:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
  de2284:	48 8d 84 24 80 00 00 	lea    rax,[rsp+0x80]
  de228b:	00 
  de228c:	48 89 d7             	mov    rdi,rdx
  de228f:	48 89 c2             	mov    rdx,rax
  de2292:	e8 03 7f 95 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
  de2297:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  de229c:	4c 89 fe             	mov    rsi,r15
  de229f:	e8 95 86 cc ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
  de22a4:	49 8b 06             	mov    rax,QWORD PTR [r14]

### call 0xe36146
  e360f6:	6a 12                	push   0x12
  e360f8:	5e                   	pop    rsi
  e360f9:	4c 89 f2             	mov    rdx,r14
  e360fc:	48 89 e9             	mov    rcx,rbp
  e360ff:	e8 7c 57 c4 ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
  e36104:	84 c0                	test   al,al
  e36106:	0f 84 3b 02 00 00    	je     e36347 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1033cd>
  e3610c:	41 80 bf e0 01 00 00 	cmp    BYTE PTR [r15+0x1e0],0x0
  e36113:	00 
  e36114:	0f 84 aa 01 00 00    	je     e362c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10334a>
  e3611a:	48 8d 3d 1f c9 50 ff 	lea    rdi,[rip+0xffffffffff50c91f]        # 342a40 <_ZTSSt12bad_any_cast@@Base-0x4d788>
  e36121:	6a 0b                	push   0xb
  e36123:	5e                   	pop    rsi
  e36124:	4c 89 f2             	mov    rdx,r14
  e36127:	48 89 e9             	mov    rcx,rbp
  e3612a:	e8 51 57 c4 ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
  e3612f:	84 c0                	test   al,al
  e36131:	0f 84 b7 03 00 00    	je     e364ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103574>
  e36137:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  e3613b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e3613e:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
  e36145:	00 
  e36146:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e36149:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
  e36150:	00 
  e36151:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
  e36156:	48 8d 94 24 00 02 00 	lea    rdx,[rsp+0x200]
  e3615d:	00 
  e3615e:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
  e36162:	e8 50 08 00 00       	call   e369b7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103a3d>
  e36167:	4c 8d b4 24 00 02 00 	lea    r14,[rsp+0x200]
  e3616e:	00 
  e3616f:	4c 89 f7             	mov    rdi,r14
  e36172:	e8 19 7d 9b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e36177:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
  e3617b:	48 8b 73 60          	mov    rsi,QWORD PTR [rbx+0x60]
  e3617f:	0f 28 84 24 80 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x180]
  e36186:	00 
  e36187:	0f 57 c9             	xorps  xmm1,xmm1
  e3618a:	0f 29 8c 24 80 01 00 	movaps XMMWORD PTR [rsp+0x180],xmm1
  e36191:	00 
  e36192:	48 8d 05 af 7c 9f 00 	lea    rax,[rip+0x9f7caf]        # 182de48 <_ZTIN4asio2ip16bad_address_castE@@Base+0xa478>
  e36199:	49 89 06             	mov    QWORD PTR [r14],rax
  e3619c:	41 0f 11 46 08       	movups XMMWORD PTR [r14+0x8],xmm0
  e361a1:	4d 89 76 20          	mov    QWORD PTR [r14+0x20],r14
  e361a5:	48 8b 06             	mov    rax,QWORD PTR [rsi]

### call 0xe3651a
  e364c2:	00 
  e364c3:	e8 ee 05 00 00       	call   e36ab6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103b3c>
  e364c8:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
  e364cd:	e8 be 79 9b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e364d2:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  e364d9:	00 
  e364da:	e8 b1 79 9b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e364df:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  e364e4:	e8 a7 79 9b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e364e9:	e9 b2 01 00 00       	jmp    e366a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103726>
  e364ee:	48 8d 3d a5 6f 53 ff 	lea    rdi,[rip+0xffffffffff536fa5]        # 36d49a <_ZTSSt12bad_any_cast@@Base-0x22d2e>
  e364f5:	6a 12                	push   0x12
  e364f7:	5e                   	pop    rsi
  e364f8:	4c 89 f2             	mov    rdx,r14
  e364fb:	48 89 e9             	mov    rcx,rbp
  e364fe:	e8 7d 53 c4 ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
  e36503:	84 c0                	test   al,al
  e36505:	0f 84 95 01 00 00    	je     e366a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103726>
  e3650b:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  e3650f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e36512:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
  e36519:	00 
  e3651a:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e3651d:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
  e36524:	00 
  e36525:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
  e3652a:	48 8d 94 24 00 02 00 	lea    rdx,[rsp+0x200]
  e36531:	00 
  e36532:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
  e36536:	e8 7c 04 00 00       	call   e369b7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103a3d>
  e3653b:	4c 8d b4 24 00 02 00 	lea    r14,[rsp+0x200]
  e36542:	00 
  e36543:	4c 89 f7             	mov    rdi,r14
  e36546:	e8 45 79 9b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e3654b:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
  e3654f:	48 8b 73 60          	mov    rsi,QWORD PTR [rbx+0x60]
  e36553:	0f 28 84 24 80 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x180]
  e3655a:	00 
  e3655b:	0f 57 c9             	xorps  xmm1,xmm1
  e3655e:	0f 29 8c 24 80 01 00 	movaps XMMWORD PTR [rsp+0x180],xmm1
  e36565:	00 
  e36566:	48 8d 05 23 79 9f 00 	lea    rax,[rip+0x9f7923]        # 182de90 <_ZTIN4asio2ip16bad_address_castE@@Base+0xa4c0>
  e3656d:	49 89 06             	mov    QWORD PTR [r14],rax
  e36570:	41 0f 11 46 08       	movups XMMWORD PTR [r14+0x8],xmm0
  e36575:	4d 89 76 20          	mov    QWORD PTR [r14+0x20],r14
  e36579:	48 8b 06             	mov    rax,QWORD PTR [rsi]

### call 0xe3658a
  e36532:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
  e36536:	e8 7c 04 00 00       	call   e369b7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103a3d>
  e3653b:	4c 8d b4 24 00 02 00 	lea    r14,[rsp+0x200]
  e36542:	00 
  e36543:	4c 89 f7             	mov    rdi,r14
  e36546:	e8 45 79 9b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e3654b:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
  e3654f:	48 8b 73 60          	mov    rsi,QWORD PTR [rbx+0x60]
  e36553:	0f 28 84 24 80 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x180]
  e3655a:	00 
  e3655b:	0f 57 c9             	xorps  xmm1,xmm1
  e3655e:	0f 29 8c 24 80 01 00 	movaps XMMWORD PTR [rsp+0x180],xmm1
  e36565:	00 
  e36566:	48 8d 05 23 79 9f 00 	lea    rax,[rip+0x9f7923]        # 182de90 <_ZTIN4asio2ip16bad_address_castE@@Base+0xa4c0>
  e3656d:	49 89 06             	mov    QWORD PTR [r14],rax
  e36570:	41 0f 11 46 08       	movups XMMWORD PTR [r14+0x8],xmm0
  e36575:	4d 89 76 20          	mov    QWORD PTR [r14+0x20],r14
  e36579:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e3657c:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  e36583:	00 
  e36584:	4c 89 e2             	mov    rdx,r12
  e36587:	4d 89 f0             	mov    r8,r14
  e3658a:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e3658d:	48 83 c3 40          	add    rbx,0x40
  e36591:	4c 8d b4 24 60 01 00 	lea    r14,[rsp+0x160]
  e36598:	00 
  e36599:	48 89 df             	mov    rdi,rbx
  e3659c:	4c 89 f6             	mov    rsi,r14
  e3659f:	e8 78 32 c8 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  e365a4:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
  e365a8:	e8 d9 7e c6 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e365ad:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
  e365b4:	00 
  e365b5:	e8 b0 39 c4 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e365ba:	31 ff                	xor    edi,edi
  e365bc:	e8 c5 7e c6 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e365c1:	31 ff                	xor    edi,edi
  e365c3:	e8 be 7e c6 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e365c8:	e9 d3 00 00 00       	jmp    e366a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103726>
  e365cd:	f6 44 24 10 01       	test   BYTE PTR [rsp+0x10],0x1
  e365d2:	74 07                	je     e365db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103661>
  e365d4:	4c 8b 44 24 20       	mov    r8,QWORD PTR [rsp+0x20]
  e365d9:	eb 05                	jmp    e365e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103666>
  e365db:	4c 8d 44 24 11       	lea    r8,[rsp+0x11]
  e365e0:	48 8d 35 f1 a4 53 ff 	lea    rsi,[rip+0xffffffffff53a4f1]        # 370ad8 <_ZTSSt12bad_any_cast@@Base-0x1f6f0>
  e365e7:	48 8d 0d 76 b9 4f ff 	lea    rcx,[rip+0xffffffffff4fb976]        # 331f64 <_ZTSSt12bad_any_cast@@Base-0x5e264>

### call 0xe8b285
  e8b228:	eb 7d                	jmp    e8b2a7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x526bd>
  e8b22a:	0f 18 0d 37 47 a6 00 	prefetcht0 BYTE PTR [rip+0xa64737]        # 18ef968 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x36d78>
  e8b231:	48 8d 3d 30 47 a6 00 	lea    rdi,[rip+0xa64730]        # 18ef968 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x36d78>
  e8b238:	48 8b 05 31 47 a6 00 	mov    rax,QWORD PTR [rip+0xa64731]        # 18ef970 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x36d80>
  e8b23f:	0f 18 08             	prefetcht0 BYTE PTR [rax]
  e8b242:	e8 a3 39 8c 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
  e8b247:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
  e8b24c:	48 8d 84 24 98 00 00 	lea    rax,[rsp+0x98]
  e8b253:	00 
  e8b254:	48 89 d7             	mov    rdi,rdx
  e8b257:	48 89 c2             	mov    rdx,rax
  e8b25a:	e8 3b ef 8a 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
  e8b25f:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
  e8b264:	4c 89 fe             	mov    rsi,r15
  e8b267:	e8 cd f6 c1 ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
  e8b26c:	49 8b 06             	mov    rax,QWORD PTR [r14]
  e8b26f:	4c 8d 7c 24 70       	lea    r15,[rsp+0x70]
  e8b274:	4c 8d 64 24 28       	lea    r12,[rsp+0x28]
  e8b279:	48 89 df             	mov    rdi,rbx
  e8b27c:	4c 89 f6             	mov    rsi,r14
  e8b27f:	4c 89 fa             	mov    rdx,r15
  e8b282:	4c 89 e1             	mov    rcx,r12
  e8b285:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8b288:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
  e8b28d:	e8 f4 31 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8b292:	4c 89 ff             	mov    rdi,r15
  e8b295:	e8 4a 37 c3 ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
  e8b29a:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
  e8b2a1:	00 
  e8b2a2:	e8 3d 37 c3 ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
  e8b2a7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e8b2ae:	00 00 
  e8b2b0:	48 3b 84 24 c0 00 00 	cmp    rax,QWORD PTR [rsp+0xc0]
  e8b2b7:	00 
  e8b2b8:	75 2d                	jne    e8b2e7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x526fd>
  e8b2ba:	48 89 d8             	mov    rax,rbx
  e8b2bd:	48 81 c4 c8 00 00 00 	add    rsp,0xc8
  e8b2c4:	5b                   	pop    rbx
  e8b2c5:	41 5c                	pop    r12
  e8b2c7:	41 5d                	pop    r13
  e8b2c9:	41 5e                	pop    r14
  e8b2cb:	41 5f                	pop    r15
  e8b2cd:	5d                   	pop    rbp
  e8b2ce:	c3                   	ret
  e8b2cf:	48 83 e0 fe          	and    rax,0xfffffffffffffffe
  e8b2d3:	48 8b 00             	mov    rax,QWORD PTR [rax]

### call 0xff0b1a
  ff0ac9:	48 89 fb             	mov    rbx,rdi
  ff0acc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ff0ad3:	00 00 
  ff0ad5:	48 89 84 24 70 0c 00 	mov    QWORD PTR [rsp+0xc70],rax
  ff0adc:	00 
  ff0add:	48 8d 6c 24 18       	lea    rbp,[rsp+0x18]
  ff0ae2:	48 89 ef             	mov    rdi,rbp
  ff0ae5:	48 89 d6             	mov    rsi,rdx
  ff0ae8:	e8 03 68 67 00       	call   16672f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b45c>
  ff0aed:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  ff0af1:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  ff0af6:	4c 89 ee             	mov    rsi,r13
  ff0af9:	48 89 ea             	mov    rdx,rbp
  ff0afc:	4c 89 f1             	mov    rcx,r14
  ff0aff:	ff 50 10             	call   QWORD PTR [rax+0x10]
  ff0b02:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  ff0b06:	48 8d 4c 24 08       	lea    rcx,[rsp+0x8]
  ff0b0b:	48 89 df             	mov    rdi,rbx
  ff0b0e:	4c 89 ee             	mov    rsi,r13
  ff0b11:	4c 89 e2             	mov    rdx,r12
  ff0b14:	4d 89 f8             	mov    r8,r15
  ff0b17:	4d 89 f1             	mov    r9,r14
  ff0b1a:	ff 50 28             	call   QWORD PTR [rax+0x28]
  ff0b1d:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  ff0b22:	e8 5f d9 aa ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  ff0b27:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  ff0b2c:	e8 99 67 67 00       	call   16672ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b436>
  ff0b31:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ff0b38:	00 00 
  ff0b3a:	48 3b 84 24 70 0c 00 	cmp    rax,QWORD PTR [rsp+0xc70]
  ff0b41:	00 
  ff0b42:	75 4c                	jne    ff0b90 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7fa6>
  ff0b44:	48 89 d8             	mov    rax,rbx
  ff0b47:	48 81 c4 78 0c 00 00 	add    rsp,0xc78
  ff0b4e:	5b                   	pop    rbx
  ff0b4f:	41 5c                	pop    r12
  ff0b51:	41 5d                	pop    r13
  ff0b53:	41 5e                	pop    r14
  ff0b55:	41 5f                	pop    r15
  ff0b57:	5d                   	pop    rbp
  ff0b58:	c3                   	ret
  ff0b59:	48 89 c3             	mov    rbx,rax
  ff0b5c:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  ff0b61:	e8 20 d9 aa ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  ff0b66:	eb 03                	jmp    ff0b6b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7f81>
  ff0b68:	48 89 c3             	mov    rbx,rax

### call 0x1093413
 10933b9:	48 8d 3d 68 0e 86 00 	lea    rdi,[rip+0x860e68]        # 18f4228 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3b638>
 10933c0:	48 8b 05 69 0e 86 00 	mov    rax,QWORD PTR [rip+0x860e69]        # 18f4230 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3b640>
 10933c7:	0f 18 08             	prefetcht0 BYTE PTR [rax]
 10933ca:	e8 1b b8 6b 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
 10933cf:	48 8d b4 24 90 01 00 	lea    rsi,[rsp+0x190]
 10933d6:	00 
 10933d7:	48 8d 84 24 f8 00 00 	lea    rax,[rsp+0xf8]
 10933de:	00 
 10933df:	48 89 d7             	mov    rdi,rdx
 10933e2:	48 89 c2             	mov    rdx,rax
 10933e5:	e8 b0 6d 6a 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
 10933ea:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
 10933ef:	4c 89 fe             	mov    rsi,r15
 10933f2:	e8 42 75 a1 ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
 10933f7:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10933fa:	4c 8d bc 24 90 01 00 	lea    r15,[rsp+0x190]
 1093401:	00 
 1093402:	4c 8d 64 24 58       	lea    r12,[rsp+0x58]
 1093407:	48 89 df             	mov    rdi,rbx
 109340a:	4c 89 f6             	mov    rsi,r14
 109340d:	4c 89 fa             	mov    rdx,r15
 1093410:	4c 89 e1             	mov    rcx,r12
 1093413:	ff 50 28             	call   QWORD PTR [rax+0x28]
 1093416:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
 109341b:	e8 66 b0 a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1093420:	4c 89 ff             	mov    rdi,r15
 1093423:	e8 e6 76 a1 ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
 1093428:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
 109342f:	00 
 1093430:	e8 d9 76 a1 ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
 1093435:	e9 02 01 00 00       	jmp    109353c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25a952>
 109343a:	0f 18 0d ef 0c 86 00 	prefetcht0 BYTE PTR [rip+0x860cef]        # 18f4130 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3b540>
 1093441:	48 8d 3d e8 0c 86 00 	lea    rdi,[rip+0x860ce8]        # 18f4130 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3b540>
 1093448:	48 8b 05 e9 0c 86 00 	mov    rax,QWORD PTR [rip+0x860ce9]        # 18f4138 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3b548>
 109344f:	0f 18 08             	prefetcht0 BYTE PTR [rax]
 1093452:	e8 93 b7 6b 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
 1093457:	48 8d b4 24 58 01 00 	lea    rsi,[rsp+0x158]
 109345e:	00 
 109345f:	48 8d 84 24 f8 00 00 	lea    rax,[rsp+0xf8]
 1093466:	00 
 1093467:	48 89 d7             	mov    rdi,rdx
 109346a:	48 89 c2             	mov    rdx,rax
 109346d:	e8 28 6d 6a 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
 1093472:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
 1093477:	4c 89 fe             	mov    rsi,r15
 109347a:	e8 ba 74 a1 ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>

### call 0x111d2ab
 111d257:	48 89 c6             	mov    rsi,rax
 111d25a:	e8 f3 25 66 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
 111d25f:	84 c0                	test   al,al
 111d261:	0f 84 ac 02 00 00    	je     111d513 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e4929>
 111d267:	48 8d bc 24 58 03 00 	lea    rdi,[rsp+0x358]
 111d26e:	00 
 111d26f:	48 8d b4 24 d0 03 00 	lea    rsi,[rsp+0x3d0]
 111d276:	00 
 111d277:	e8 7e 06 00 00       	call   111d8fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e4d10>
 111d27c:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
 111d283:	00 
 111d284:	4c 89 fe             	mov    rsi,r15
 111d287:	e8 ad d6 98 ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
 111d28c:	49 8b 06             	mov    rax,QWORD PTR [r14]
 111d28f:	4c 8d bc 24 58 03 00 	lea    r15,[rsp+0x358]
 111d296:	00 
 111d297:	4c 8d a4 24 88 00 00 	lea    r12,[rsp+0x88]
 111d29e:	00 
 111d29f:	48 89 df             	mov    rdi,rbx
 111d2a2:	4c 89 f6             	mov    rsi,r14
 111d2a5:	4c 89 fa             	mov    rdx,r15
 111d2a8:	4c 89 e1             	mov    rcx,r12
 111d2ab:	ff 50 28             	call   QWORD PTR [rax+0x28]
 111d2ae:	e9 4c 02 00 00       	jmp    111d4ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e4915>
 111d2b3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 111d2ba:	00 00 
 111d2bc:	48 3b 84 24 48 04 00 	cmp    rax,QWORD PTR [rsp+0x448]
 111d2c3:	00 
 111d2c4:	0f 85 1a 06 00 00    	jne    111d8e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e4cfa>
 111d2ca:	0f 57 c0             	xorps  xmm0,xmm0
 111d2cd:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 111d2d0:	e9 fb 05 00 00       	jmp    111d8d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e4ce6>
 111d2d5:	4c 8d ac 24 d0 03 00 	lea    r13,[rsp+0x3d0]
 111d2dc:	00 
 111d2dd:	49 83 65 08 00       	and    QWORD PTR [r13+0x8],0x0
 111d2e2:	48 8d 05 7f 5f 73 00 	lea    rax,[rip+0x735f7f]        # 1853268 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf950>
 111d2e9:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
 111d2ed:	49 83 c4 30          	add    r12,0x30
 111d2f1:	0f 57 c0             	xorps  xmm0,xmm0
 111d2f4:	41 0f 11 45 10       	movups XMMWORD PTR [r13+0x10],xmm0
 111d2f9:	41 0f 11 45 20       	movups XMMWORD PTR [r13+0x20],xmm0
 111d2fe:	41 0f 11 45 30       	movups XMMWORD PTR [r13+0x30],xmm0
 111d303:	49 83 65 40 00       	and    QWORD PTR [r13+0x40],0x0
 111d308:	4c 89 e7             	mov    rdi,r12
 111d30b:	e8 26 e5 95 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 111d310:	4c 89 ef             	mov    rdi,r13

### call 0x1143a2d
 11439d3:	48 8d 3d 7e 06 7c 00 	lea    rdi,[rip+0x7c067e]        # 1904058 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x4b468>
 11439da:	48 8b 05 7f 06 7c 00 	mov    rax,QWORD PTR [rip+0x7c067f]        # 1904060 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x4b470>
 11439e1:	0f 18 08             	prefetcht0 BYTE PTR [rax]
 11439e4:	e8 01 b2 60 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
 11439e9:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
 11439f0:	00 
 11439f1:	48 8d 84 24 a8 00 00 	lea    rax,[rsp+0xa8]
 11439f8:	00 
 11439f9:	48 89 d7             	mov    rdi,rdx
 11439fc:	48 89 c2             	mov    rdx,rax
 11439ff:	e8 96 67 5f 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
 1143a04:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 1143a09:	4c 89 fe             	mov    rsi,r15
 1143a0c:	e8 28 6f 96 ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
 1143a11:	49 8b 06             	mov    rax,QWORD PTR [r14]
 1143a14:	4c 8d bc 24 80 00 00 	lea    r15,[rsp+0x80]
 1143a1b:	00 
 1143a1c:	4c 8d 64 24 28       	lea    r12,[rsp+0x28]
 1143a21:	48 89 df             	mov    rdi,rbx
 1143a24:	4c 89 f6             	mov    rsi,r14
 1143a27:	4c 89 fa             	mov    rdx,r15
 1143a2a:	4c 89 e1             	mov    rcx,r12
 1143a2d:	ff 50 28             	call   QWORD PTR [rax+0x28]
 1143a30:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
 1143a35:	e8 4c aa 95 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1143a3a:	4c 89 ff             	mov    rdi,r15
 1143a3d:	e8 cc 70 96 ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
 1143a42:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
 1143a49:	00 
 1143a4a:	e8 bf 70 96 ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
 1143a4f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1143a56:	00 00 
 1143a58:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]
 1143a5f:	00 
 1143a60:	75 39                	jne    1143a9b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30aeb1>
 1143a62:	48 89 d8             	mov    rax,rbx
 1143a65:	48 81 c4 d8 00 00 00 	add    rsp,0xd8
 1143a6c:	5b                   	pop    rbx
 1143a6d:	41 5c                	pop    r12
 1143a6f:	41 5d                	pop    r13
 1143a71:	41 5e                	pop    r14
 1143a73:	41 5f                	pop    r15
 1143a75:	5d                   	pop    rbp
 1143a76:	c3                   	ret
 1143a77:	48 83 e0 fe          	and    rax,0xfffffffffffffffe
 1143a7b:	48 8b 00             	mov    rax,QWORD PTR [rax]

### call 0x1146895
 114683b:	48 8d 3d 56 ef 7b 00 	lea    rdi,[rip+0x7bef56]        # 1905798 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x4cba8>
 1146842:	48 8b 05 57 ef 7b 00 	mov    rax,QWORD PTR [rip+0x7bef57]        # 19057a0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x4cbb0>
 1146849:	0f 18 08             	prefetcht0 BYTE PTR [rax]
 114684c:	e8 99 83 60 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
 1146851:	48 8d b4 24 60 03 00 	lea    rsi,[rsp+0x360]
 1146858:	00 
 1146859:	48 8d 84 24 98 04 00 	lea    rax,[rsp+0x498]
 1146860:	00 
 1146861:	48 89 d7             	mov    rdi,rdx
 1146864:	48 89 c2             	mov    rdx,rax
 1146867:	e8 2e 39 5f 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
 114686c:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
 1146871:	4c 89 fe             	mov    rsi,r15
 1146874:	e8 c0 40 96 ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
 1146879:	49 8b 06             	mov    rax,QWORD PTR [r14]
 114687c:	4c 8d bc 24 60 03 00 	lea    r15,[rsp+0x360]
 1146883:	00 
 1146884:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
 1146889:	48 89 df             	mov    rdi,rbx
 114688c:	4c 89 f6             	mov    rsi,r14
 114688f:	4c 89 fa             	mov    rdx,r15
 1146892:	4c 89 e1             	mov    rcx,r12
 1146895:	ff 50 28             	call   QWORD PTR [rax+0x28]
 1146898:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
 114689d:	e8 e4 7b 95 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11468a2:	4c 89 ff             	mov    rdi,r15
 11468a5:	e8 16 06 00 00       	call   1146ec0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e2d6>
 11468aa:	48 8d bc 24 98 04 00 	lea    rdi,[rsp+0x498]
 11468b1:	00 
 11468b2:	e8 09 06 00 00       	call   1146ec0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e2d6>
 11468b7:	e9 0b 01 00 00       	jmp    11469c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30dddd>
 11468bc:	0f 18 0d cd eb 7b 00 	prefetcht0 BYTE PTR [rip+0x7bebcd]        # 1905490 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x4c8a0>
 11468c3:	48 8d 3d c6 eb 7b 00 	lea    rdi,[rip+0x7bebc6]        # 1905490 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x4c8a0>
 11468ca:	48 8b 05 c7 eb 7b 00 	mov    rax,QWORD PTR [rip+0x7bebc7]        # 1905498 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x4c8a8>
 11468d1:	0f 18 08             	prefetcht0 BYTE PTR [rax]
 11468d4:	e8 11 83 60 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
 11468d9:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
 11468e0:	00 
 11468e1:	48 8d 84 24 98 04 00 	lea    rax,[rsp+0x498]
 11468e8:	00 
 11468e9:	48 89 d7             	mov    rdi,rdx
 11468ec:	48 89 c2             	mov    rdx,rax
 11468ef:	e8 a6 38 5f 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
 11468f4:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
 11468f9:	4c 89 fe             	mov    rsi,r15
 11468fc:	e8 38 40 96 ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>

### call 0x1168d72
 1168d17:	0f 29 84 24 00 01 00 	movaps XMMWORD PTR [rsp+0x100],xmm0
 1168d1e:	00 
 1168d1f:	48 83 a4 24 20 01 00 	and    QWORD PTR [rsp+0x120],0x0
 1168d26:	00 00 
 1168d28:	48 8d 05 39 05 6f 00 	lea    rax,[rip+0x6f0539]        # 1859268 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x15950>
 1168d2f:	48 89 84 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rax
 1168d36:	00 
 1168d37:	48 83 a4 24 30 01 00 	and    QWORD PTR [rsp+0x130],0x0
 1168d3e:	00 00 
 1168d40:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
 1168d47:	00 
 1168d48:	e8 03 0f 9f ff       	call   b59c50 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa6bf0>
 1168d4d:	49 8b 9f 18 01 00 00 	mov    rbx,QWORD PTR [r15+0x118]
 1168d54:	4d 8b bf 20 01 00 00 	mov    r15,QWORD PTR [r15+0x120]
 1168d5b:	4c 39 fb             	cmp    rbx,r15
 1168d5e:	74 74                	je     1168dd4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3301ea>
 1168d60:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 1168d63:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1168d66:	4c 89 f6             	mov    rsi,r14
 1168d69:	4c 89 e2             	mov    rdx,r12
 1168d6c:	4c 89 e9             	mov    rcx,r13
 1168d6f:	49 89 e8             	mov    r8,rbp
 1168d72:	ff 50 28             	call   QWORD PTR [rax+0x28]
 1168d75:	48 83 c3 08          	add    rbx,0x8
 1168d79:	84 c0                	test   al,al
 1168d7b:	74 de                	je     1168d5b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x330171>
 1168d7d:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
 1168d82:	48 2b 44 24 40       	sub    rax,QWORD PTR [rsp+0x40]
 1168d87:	48 99                	cqo
 1168d89:	6a 38                	push   0x38
 1168d8b:	59                   	pop    rcx
 1168d8c:	48 f7 f9             	idiv   rcx
 1168d8f:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
 1168d96:	00 
 1168d97:	48 89 c6             	mov    rsi,rax
 1168d9a:	e8 d1 a7 51 00       	call   1683570 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x376dc>
 1168d9f:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
 1168da6:	00 
 1168da7:	48 89 94 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],rdx
 1168dae:	00 
 1168daf:	48 8d 9c 24 00 01 00 	lea    rbx,[rsp+0x100]
 1168db6:	00 
 1168db7:	48 89 df             	mov    rdi,rbx
 1168dba:	48 8d b4 24 e0 00 00 	lea    rsi,[rsp+0xe0]
 1168dc1:	00 
 1168dc2:	e8 e1 d1 97 ff       	call   ae5fa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x32f48>

### call 0x1175759
 1175700:	48 83 64 24 48 00    	and    QWORD PTR [rsp+0x48],0x0
 1175706:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
 117570d:	00 00 
 117570f:	0f 57 c0             	xorps  xmm0,xmm0
 1175712:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
 1175717:	48 8d 3d 1b 49 26 ff 	lea    rdi,[rip+0xffffffffff26491b]        # 3da039 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4c1e>
 117571e:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
 1175725:	00 
 1175726:	6a 0d                	push   0xd
 1175728:	5e                   	pop    rsi
 1175729:	e8 e2 8d 67 00       	call   17ee510 <__strlen_chk@plt>
 117572e:	4c 8d a4 24 a0 00 00 	lea    r12,[rsp+0xa0]
 1175735:	00 
 1175736:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
 117573b:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
 117573e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1175741:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
 1175748:	00 
 1175749:	4c 8d 6c 24 40       	lea    r13,[rsp+0x40]
 117574e:	4c 8d 44 24 70       	lea    r8,[rsp+0x70]
 1175753:	4c 89 ea             	mov    rdx,r13
 1175756:	4c 89 e1             	mov    rcx,r12
 1175759:	ff 50 28             	call   QWORD PTR [rax+0x28]
 117575c:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
 1175763:	00 
 1175764:	48 85 ff             	test   rdi,rdi
 1175767:	0f 84 b7 00 00 00    	je     1175824 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33cc3a>
 117576d:	31 ed                	xor    ebp,ebp
 117576f:	e9 00 01 00 00       	jmp    1175874 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33cc8a>
 1175774:	41 80 bf a1 00 00 00 	cmp    BYTE PTR [r15+0xa1],0x0
 117577b:	00 
 117577c:	0f 85 0b 05 00 00    	jne    1175c8d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33d0a3>
 1175782:	4d 8b 37             	mov    r14,QWORD PTR [r15]
 1175785:	49 8d be 08 01 00 00 	lea    rdi,[r14+0x108]
 117578c:	e8 51 99 9f ff       	call   b6f0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc082>
 1175791:	66 41 83 a6 00 01 00 	and    WORD PTR [r14+0x100],0x0
 1175798:	00 00 
 117579a:	49 8b 7e 68          	mov    rdi,QWORD PTR [r14+0x68]
 117579e:	e8 c5 43 66 00       	call   17d9b68 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5989>
 11757a3:	84 c0                	test   al,al
 11757a5:	74 09                	je     11757b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33cbc6>
 11757a7:	49 8b 7e 68          	mov    rdi,QWORD PTR [r14+0x68]
 11757ab:	e8 6e 43 66 00       	call   17d9b1e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x593f>
 11757b0:	66 41 c7 87 a0 00 00 	mov    WORD PTR [r15+0xa0],0x100
 11757b7:	00 00 01 
 11757ba:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]

### call 0x119d702
 119d6ad:	e8 78 ce 52 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
 119d6b2:	4c 89 ef             	mov    rdi,r13
 119d6b5:	e8 7c e1 8d ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 119d6ba:	48 89 e6             	mov    rsi,rsp
 119d6bd:	48 89 06             	mov    QWORD PTR [rsi],rax
 119d6c0:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 119d6c4:	4c 89 e7             	mov    rdi,r12
 119d6c7:	e8 40 97 b0 ff       	call   ca6e0c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f3dac>
 119d6cc:	4c 89 ef             	mov    rdi,r13
 119d6cf:	e8 bc 07 65 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 119d6d4:	49 8b 46 38          	mov    rax,QWORD PTR [r14+0x38]
 119d6d8:	49 8b 4e 40          	mov    rcx,QWORD PTR [r14+0x40]
 119d6dc:	48 29 c1             	sub    rcx,rax
 119d6df:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
 119d6e3:	49 89 4d 08          	mov    QWORD PTR [r13+0x8],rcx
 119d6e7:	4d 8d 66 10          	lea    r12,[r14+0x10]
 119d6eb:	48 8b 75 00          	mov    rsi,QWORD PTR [rbp+0x0]
 119d6ef:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 119d6f2:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 119d6f7:	48 8d 4c 24 28       	lea    rcx,[rsp+0x28]
 119d6fc:	4c 89 fa             	mov    rdx,r15
 119d6ff:	4d 89 e0             	mov    r8,r12
 119d702:	ff 50 28             	call   QWORD PTR [rax+0x28]
 119d705:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 119d70a:	48 85 c0             	test   rax,rax
 119d70d:	75 6e                	jne    119d77d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x364b93>
 119d70f:	4d 8d be e8 00 00 00 	lea    r15,[r14+0xe8]
 119d716:	4c 89 e7             	mov    rdi,r12
 119d719:	e8 18 e1 8d ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 119d71e:	4c 89 ff             	mov    rdi,r15
 119d721:	48 89 c6             	mov    rsi,rax
 119d724:	e8 29 21 5e 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
 119d729:	84 c0                	test   al,al
 119d72b:	75 42                	jne    119d76f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x364b85>
 119d72d:	48 8d 3d 18 d0 1b ff 	lea    rdi,[rip+0xffffffffff1bd018]        # 35a74c <_ZTSSt12bad_any_cast@@Base-0x35a7c>
 119d734:	6a 0a                	push   0xa
 119d736:	5e                   	pop    rsi
 119d737:	e8 d4 0d 65 00       	call   17ee510 <__strlen_chk@plt>
 119d73c:	48 8d 35 09 d0 1b ff 	lea    rsi,[rip+0xffffffffff1bd009]        # 35a74c <_ZTSSt12bad_any_cast@@Base-0x35a7c>
 119d743:	48 8d 0d 32 48 2b ff 	lea    rcx,[rip+0xffffffffff2b4832]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 119d74a:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]
 119d74f:	4c 89 ff             	mov    rdi,r15
 119d752:	48 89 c2             	mov    rdx,rax
 119d755:	45 31 c0             	xor    r8d,r8d
 119d758:	e8 df c4 9b ff       	call   b59c3c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa6bdc>
 119d75d:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]

### call 0x11fc137
 11fc0e5:	e8 a8 96 56 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
 11fc0ea:	49 8b 7d 18          	mov    rdi,QWORD PTR [r13+0x18]
 11fc0ee:	31 c0                	xor    eax,eax
 11fc0f0:	48 89 e2             	mov    rdx,rsp
 11fc0f3:	88 02                	mov    BYTE PTR [rdx],al
 11fc0f5:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
 11fc0f8:	48 8d 8c 24 90 00 00 	lea    rcx,[rsp+0x90]
 11fc0ff:	00 
 11fc100:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
 11fc105:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
 11fc10a:	e8 13 8d 42 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
 11fc10f:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 11fc116:	00 
 11fc117:	e8 4e de 87 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 11fc11c:	48 89 e7             	mov    rdi,rsp
 11fc11f:	e8 0c ac 8a ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 11fc124:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
 11fc128:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11fc12b:	4c 89 e6             	mov    rsi,r12
 11fc12e:	4c 89 fa             	mov    rdx,r15
 11fc131:	4c 89 f1             	mov    rcx,r14
 11fc134:	49 89 d8             	mov    r8,rbx
 11fc137:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11fc13a:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 11fc13f:	e8 ca 3e 45 00       	call   165000e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x417a>
 11fc144:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 11fc14b:	00 00 
 11fc14d:	48 3b 84 24 c8 00 00 	cmp    rax,QWORD PTR [rsp+0xc8]
 11fc154:	00 
 11fc155:	75 73                	jne    11fc1ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4174e>
 11fc157:	48 81 c4 d0 00 00 00 	add    rsp,0xd0
 11fc15e:	5b                   	pop    rbx
 11fc15f:	41 5c                	pop    r12
 11fc161:	41 5d                	pop    r13
 11fc163:	41 5e                	pop    r14
 11fc165:	41 5f                	pop    r15
 11fc167:	c3                   	ret
 11fc168:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
 11fc16c:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
 11fc16f:	e9 6b ff ff ff       	jmp    11fc0df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41663>
 11fc174:	48 89 c3             	mov    rbx,rax
 11fc177:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 11fc17e:	00 
 11fc17f:	e8 e6 dd 87 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 11fc184:	48 89 e7             	mov    rdi,rsp
 11fc187:	e8 a4 ab 8a ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>

### call 0x125056d
 1250516:	48 89 df             	mov    rdi,rbx
 1250519:	e8 62 db 59 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 125051e:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 1250523:	e8 68 d9 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1250528:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
 125052c:	6a 0a                	push   0xa
 125052e:	5e                   	pop    rsi
 125052f:	48 89 da             	mov    rdx,rbx
 1250532:	4c 89 e1             	mov    rcx,r12
 1250535:	e8 42 41 00 00       	call   125467c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x99c00>
 125053a:	84 c0                	test   al,al
 125053c:	0f 84 d2 01 00 00    	je     1250714 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95c98>
 1250542:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 1250547:	4c 89 e6             	mov    rsi,r12
 125054a:	e8 ff e6 9b ff       	call   c0ec4e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15bbee>
 125054f:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
 1250554:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
 125055b:	00 
 125055c:	e8 df 42 41 00       	call   1664840 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x189ac>
 1250561:	49 8b 7f 18          	mov    rdi,QWORD PTR [r15+0x18]
 1250565:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1250568:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
 125056d:	ff 50 28             	call   QWORD PTR [rax+0x28]
 1250570:	89 c5                	mov    ebp,eax
 1250572:	0f b6 f0             	movzx  esi,al
 1250575:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
 125057c:	00 
 125057d:	e8 3c 25 c7 ff       	call   ec2abe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x89ed4>
 1250582:	48 8d 35 16 6a 0e ff 	lea    rsi,[rip+0xffffffffff0e6a16]        # 336f9f <_ZTSSt12bad_any_cast@@Base-0x59229>
 1250589:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 125058e:	e8 eb 94 82 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 1250593:	48 83 c3 30          	add    rbx,0x30
 1250597:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
 125059c:	48 89 df             	mov    rdi,rbx
 125059f:	e8 80 a3 c3 ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
 12505a4:	4c 8d b4 24 a8 00 00 	lea    r14,[rsp+0xa8]
 12505ab:	00 
 12505ac:	48 89 c7             	mov    rdi,rax
 12505af:	4c 89 f6             	mov    rsi,r14
 12505b2:	e8 77 b4 82 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
 12505b7:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 12505bc:	e8 cf d8 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 12505c1:	4c 89 f7             	mov    rdi,r14
 12505c4:	e8 c7 d8 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 12505c9:	b0 01                	mov    al,0x1
 12505cb:	40 84 ed             	test   bpl,bpl

### call 0x1262fa7
 1262f4a:	49 8b 55 08          	mov    rdx,QWORD PTR [r13+0x8]
 1262f4e:	f6 c2 01             	test   dl,0x1
 1262f51:	0f 85 a0 01 00 00    	jne    12630f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa867b>
 1262f57:	e8 36 28 50 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
 1262f5c:	41 80 bf 90 07 00 00 	cmp    BYTE PTR [r15+0x790],0x0
 1262f63:	00 
 1262f64:	74 25                	je     1262f8b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa850f>
 1262f66:	49 8d b7 78 07 00 00 	lea    rsi,[r15+0x778]
 1262f6d:	41 80 4d 10 04       	or     BYTE PTR [r13+0x10],0x4
 1262f72:	4c 89 ef             	mov    rdi,r13
 1262f75:	48 83 c7 40          	add    rdi,0x40
 1262f79:	49 8b 55 08          	mov    rdx,QWORD PTR [r13+0x8]
 1262f7d:	f6 c2 01             	test   dl,0x1
 1262f80:	0f 85 59 01 00 00    	jne    12630df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa8663>
 1262f86:	e8 07 28 50 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
 1262f8b:	49 8d 5e 10          	lea    rbx,[r14+0x10]
 1262f8f:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 1262f94:	e8 9d 88 81 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 1262f99:	48 89 d1             	mov    rcx,rdx
 1262f9c:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 1262fa1:	48 89 de             	mov    rsi,rbx
 1262fa4:	48 89 c2             	mov    rdx,rax
 1262fa7:	41 ff 56 28          	call   QWORD PTR [r14+0x28]
 1262fab:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
 1262faf:	e8 5e d3 fa ff       	call   1210312 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55896>
 1262fb4:	48 89 c3             	mov    rbx,rax
 1262fb7:	48 83 c3 18          	add    rbx,0x18
 1262fbb:	48 89 df             	mov    rdi,rbx
 1262fbe:	e8 8d 7f 8b ff       	call   b1af50 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67ef0>
 1262fc3:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]
 1262fc8:	4c 8b 6c 24 38       	mov    r13,QWORD PTR [rsp+0x38]
 1262fcd:	4d 39 ec             	cmp    r12,r13
 1262fd0:	74 11                	je     1262fe3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa8567>
 1262fd2:	48 89 df             	mov    rdi,rbx
 1262fd5:	4c 89 e6             	mov    rsi,r12
 1262fd8:	e8 4d 41 8a ff       	call   b0712a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x540ca>
 1262fdd:	49 83 c4 18          	add    r12,0x18
 1262fe1:	eb ea                	jmp    1262fcd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa8551>
 1262fe3:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 1262fe8:	e8 fb 85 81 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 1262fed:	41 8a af a0 08 00 00 	mov    bpl,BYTE PTR [r15+0x8a0]
 1262ff4:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
 1262ff8:	e8 15 d3 fa ff       	call   1210312 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55896>
 1262ffd:	48 89 c3             	mov    rbx,rax
 1263000:	40 84 ed             	test   bpl,bpl
 1263003:	74 26                	je     126302b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa85af>

### call 0x13a5aac
 13a5a54:	48 8b 05 fd 75 57 00 	mov    rax,QWORD PTR [rip+0x5775fd]        # 191d058 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x64468>
 13a5a5b:	0f 18 08             	prefetcht0 BYTE PTR [rax]
 13a5a5e:	e8 87 91 3a 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
 13a5a63:	48 8d b4 24 f0 00 00 	lea    rsi,[rsp+0xf0]
 13a5a6a:	00 
 13a5a6b:	48 8d 84 24 80 00 00 	lea    rax,[rsp+0x80]
 13a5a72:	00 
 13a5a73:	48 89 d7             	mov    rdi,rdx
 13a5a76:	48 89 c2             	mov    rdx,rax
 13a5a79:	e8 1c 47 39 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
 13a5a7e:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
 13a5a83:	4c 89 fe             	mov    rsi,r15
 13a5a86:	e8 ae 4e 70 ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
 13a5a8b:	4c 8d bc 24 f8 00 00 	lea    r15,[rsp+0xf8]
 13a5a92:	00 
 13a5a93:	49 8b 06             	mov    rax,QWORD PTR [r14]
 13a5a96:	48 8d 94 24 f0 00 00 	lea    rdx,[rsp+0xf0]
 13a5a9d:	00 
 13a5a9e:	4c 8d 64 24 48       	lea    r12,[rsp+0x48]
 13a5aa3:	48 89 df             	mov    rdi,rbx
 13a5aa6:	4c 89 f6             	mov    rsi,r14
 13a5aa9:	4c 89 e1             	mov    rcx,r12
 13a5aac:	ff 50 28             	call   QWORD PTR [rax+0x28]
 13a5aaf:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
 13a5ab4:	e8 cd 89 6f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 13a5ab9:	4c 89 ff             	mov    rdi,r15
 13a5abc:	e8 47 4f 70 ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 13a5ac1:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
 13a5ac8:	00 
 13a5ac9:	e8 3a 4f 70 ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 13a5ace:	eb 7d                	jmp    13a5b4d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1eb0d1>
 13a5ad0:	0f 18 0d c1 78 57 00 	prefetcht0 BYTE PTR [rip+0x5778c1]        # 191d398 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x647a8>
 13a5ad7:	48 8d 3d ba 78 57 00 	lea    rdi,[rip+0x5778ba]        # 191d398 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x647a8>
 13a5ade:	48 8b 05 bb 78 57 00 	mov    rax,QWORD PTR [rip+0x5778bb]        # 191d3a0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x647b0>
 13a5ae5:	0f 18 08             	prefetcht0 BYTE PTR [rax]
 13a5ae8:	e8 fd 90 3a 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
 13a5aed:	48 8d 74 24 58       	lea    rsi,[rsp+0x58]
 13a5af2:	48 8d 84 24 80 00 00 	lea    rax,[rsp+0x80]
 13a5af9:	00 
 13a5afa:	48 89 d7             	mov    rdi,rdx
 13a5afd:	48 89 c2             	mov    rdx,rax
 13a5b00:	e8 95 46 39 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
 13a5b05:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 13a5b0a:	4c 89 fe             	mov    rsi,r15
 13a5b0d:	e8 27 4e 70 ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
 13a5b12:	49 8b 06             	mov    rax,QWORD PTR [r14]

### call 0x144fe16
 144fdc0:	88 48 30             	mov    BYTE PTR [rax+0x30],cl
 144fdc3:	88 48 48             	mov    BYTE PTR [rax+0x48],cl
 144fdc6:	38 8c 24 90 00 00 00 	cmp    BYTE PTR [rsp+0x90],cl
 144fdcd:	74 23                	je     144fdf2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x295376>
 144fdcf:	48 89 c1             	mov    rcx,rax
 144fdd2:	48 83 c1 30          	add    rcx,0x30
 144fdd6:	49 8b 56 10          	mov    rdx,QWORD PTR [r14+0x10]
 144fdda:	48 89 51 10          	mov    QWORD PTR [rcx+0x10],rdx
 144fdde:	41 0f 10 0e          	movups xmm1,XMMWORD PTR [r14]
 144fde2:	0f 11 09             	movups XMMWORD PTR [rcx],xmm1
 144fde5:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
 144fde9:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
 144fdee:	c6 40 48 01          	mov    BYTE PTR [rax+0x48],0x1
 144fdf2:	48 8b 8c 24 98 00 00 	mov    rcx,QWORD PTR [rsp+0x98]
 144fdf9:	00 
 144fdfa:	48 89 48 50          	mov    QWORD PTR [rax+0x50],rcx
 144fdfe:	48 8d 94 24 c0 00 00 	lea    rdx,[rsp+0xc0]
 144fe05:	00 
 144fe06:	48 89 42 20          	mov    QWORD PTR [rdx+0x20],rax
 144fe0a:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 144fe0e:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 144fe13:	4c 89 e6             	mov    rsi,r12
 144fe16:	ff 50 28             	call   QWORD PTR [rax+0x28]
 144fe19:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 144fe1e:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
 144fe23:	e8 43 76 6f ff       	call   b4746b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9440b>
 144fe28:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
 144fe2d:	e8 54 e6 64 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 144fe32:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
 144fe39:	00 
 144fe3a:	e8 2b a1 62 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 144fe3f:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
 144fe44:	e8 cd 08 00 00       	call   1450716 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x295c9a>
 144fe49:	66 0f 6f 44 24 30    	movdqa xmm0,XMMWORD PTR [rsp+0x30]
 144fe4f:	4c 8b 74 24 38       	mov    r14,QWORD PTR [rsp+0x38]
 144fe54:	4d 85 f6             	test   r14,r14
 144fe57:	74 0a                	je     144fe63 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2953e7>
 144fe59:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
 144fe5e:	4c 8b 74 24 38       	mov    r14,QWORD PTR [rsp+0x38]
 144fe63:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
 144fe68:	4c 8d bc 24 c0 00 00 	lea    r15,[rsp+0xc0]
 144fe6f:	00 
 144fe70:	66 41 0f 7f 07       	movdqa XMMWORD PTR [r15],xmm0
 144fe75:	48 8d 05 78 ea 65 ff 	lea    rax,[rip+0xffffffffff65ea78]        # aae8f4 <JNI_OnUnload@@Base+0x361c1>
 144fe7c:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
 144fe80:	48 8d 05 59 7f 58 ff 	lea    rax,[rip+0xffffffffff587f59]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>

### call 0x1451b8d
 1451b3a:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
 1451b3e:	8b 38                	mov    edi,DWORD PTR [rax]
 1451b40:	48 89 0c 24          	mov    QWORD PTR [rsp],rcx
 1451b44:	e8 d7 9c 62 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
 1451b49:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
 1451b4d:	84 c0                	test   al,al
 1451b4f:	75 57                	jne    1451ba8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29712c>
 1451b51:	49 8d 47 18          	lea    rax,[r15+0x18]
 1451b55:	4d 8b 64 24 30       	mov    r12,QWORD PTR [r12+0x30]
 1451b5a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 1451b5d:	48 89 ce             	mov    rsi,rcx
 1451b60:	48 83 c6 07          	add    rsi,0x7
 1451b64:	f6 c1 01             	test   cl,0x1
 1451b67:	48 0f 44 f0          	cmove  rsi,rax
 1451b6b:	4a 8d 14 ee          	lea    rdx,[rsi+r13*8]
 1451b6f:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 1451b74:	e8 d1 ed 9d ff       	call   e3094a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfd9d0>
 1451b79:	49 8b 57 30          	mov    rdx,QWORD PTR [r15+0x30]
 1451b7d:	48 83 e2 fc          	and    rdx,0xfffffffffffffffc
 1451b81:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 1451b85:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
 1451b8a:	4c 89 e7             	mov    rdi,r12
 1451b8d:	ff 50 28             	call   QWORD PTR [rax+0x28]
 1451b90:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
 1451b95:	e8 4c 22 6e ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
 1451b9a:	8b 6c 24 30          	mov    ebp,DWORD PTR [rsp+0x30]
 1451b9e:	83 cd 01             	or     ebp,0x1
 1451ba1:	45 31 f6             	xor    r14d,r14d
 1451ba4:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
 1451ba8:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]
 1451bad:	45 89 77 10          	mov    DWORD PTR [r15+0x10],r14d
 1451bb1:	41 89 6f 08          	mov    DWORD PTR [r15+0x8],ebp
 1451bb5:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
 1451bb8:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
 1451bbd:	e8 9a fc 18 00       	call   15e185c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426de0>
 1451bc2:	48 89 df             	mov    rdi,rbx
 1451bc5:	e8 67 fb 18 00       	call   15e1731 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426cb5>
 1451bca:	4c 89 ff             	mov    rdi,r15
 1451bcd:	e8 36 8e 65 ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 1451bd2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1451bd9:	00 00 
 1451bdb:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
 1451be0:	75 12                	jne    1451bf4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x297178>
 1451be2:	48 89 d8             	mov    rax,rbx
 1451be5:	48 83 c4 48          	add    rsp,0x48
 1451be9:	5b                   	pop    rbx

### call 0x1457a9b
 1457a45:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
 1457a4c:	00 
 1457a4d:	e8 bc 30 65 ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
 1457a52:	e9 7c 01 00 00       	jmp    1457bd3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29d157>
 1457a57:	48 8d bc 24 b8 02 00 	lea    rdi,[rsp+0x2b8]
 1457a5e:	00 
 1457a5f:	48 8d b4 24 50 01 00 	lea    rsi,[rsp+0x150]
 1457a66:	00 
 1457a67:	e8 e4 1f 2e 00       	call   1739a50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xedbbc>
 1457a6c:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
 1457a73:	00 
 1457a74:	4c 89 fe             	mov    rsi,r15
 1457a77:	e8 bd 2e 65 ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
 1457a7c:	49 8b 06             	mov    rax,QWORD PTR [r14]
 1457a7f:	4c 8d bc 24 b8 02 00 	lea    r15,[rsp+0x2b8]
 1457a86:	00 
 1457a87:	4c 8d a4 24 a8 00 00 	lea    r12,[rsp+0xa8]
 1457a8e:	00 
 1457a8f:	48 89 df             	mov    rdi,rbx
 1457a92:	4c 89 f6             	mov    rsi,r14
 1457a95:	4c 89 fa             	mov    rdx,r15
 1457a98:	4c 89 e1             	mov    rcx,r12
 1457a9b:	ff 50 28             	call   QWORD PTR [rax+0x28]
 1457a9e:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
 1457aa3:	e8 de 69 64 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1457aa8:	4c 89 ff             	mov    rdi,r15
 1457aab:	e8 70 1f 2e 00       	call   1739a20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xedb8c>
 1457ab0:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
 1457ab7:	00 
 1457ab8:	e8 63 1f 2e 00       	call   1739a20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xedb8c>
 1457abd:	e9 11 01 00 00       	jmp    1457bd3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29d157>
 1457ac2:	0f 18 0d ff 98 4c 00 	prefetcht0 BYTE PTR [rip+0x4c98ff]        # 19213c8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x687d8>
 1457ac9:	48 8d 3d f8 98 4c 00 	lea    rdi,[rip+0x4c98f8]        # 19213c8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x687d8>
 1457ad0:	48 8b 05 f9 98 4c 00 	mov    rax,QWORD PTR [rip+0x4c98f9]        # 19213d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x687e0>
 1457ad7:	0f 18 08             	prefetcht0 BYTE PTR [rax]
 1457ada:	e8 0b 71 2f 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
 1457adf:	48 8d b4 24 60 02 00 	lea    rsi,[rsp+0x260]
 1457ae6:	00 
 1457ae7:	48 8d 84 24 50 01 00 	lea    rax,[rsp+0x150]
 1457aee:	00 
 1457aef:	48 89 d7             	mov    rdi,rdx
 1457af2:	48 89 c2             	mov    rdx,rax
 1457af5:	e8 a0 26 2e 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
 1457afa:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
 1457b01:	00 
 1457b02:	4c 89 fe             	mov    rsi,r15

### call 0x145907f
 1459025:	48 8d 3d 54 ac 4c 00 	lea    rdi,[rip+0x4cac54]        # 1923c80 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6b090>
 145902c:	48 8b 05 55 ac 4c 00 	mov    rax,QWORD PTR [rip+0x4cac55]        # 1923c88 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6b098>
 1459033:	0f 18 08             	prefetcht0 BYTE PTR [rax]
 1459036:	e8 af 5b 2f 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
 145903b:	48 8d b4 24 20 01 00 	lea    rsi,[rsp+0x120]
 1459042:	00 
 1459043:	48 8d 84 24 c0 00 00 	lea    rax,[rsp+0xc0]
 145904a:	00 
 145904b:	48 89 d7             	mov    rdi,rdx
 145904e:	48 89 c2             	mov    rdx,rax
 1459051:	e8 44 11 2e 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
 1459056:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
 145905b:	4c 89 fe             	mov    rsi,r15
 145905e:	e8 d6 18 65 ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
 1459063:	49 8b 06             	mov    rax,QWORD PTR [r14]
 1459066:	4c 8d bc 24 20 01 00 	lea    r15,[rsp+0x120]
 145906d:	00 
 145906e:	4c 8d 64 24 38       	lea    r12,[rsp+0x38]
 1459073:	48 89 df             	mov    rdi,rbx
 1459076:	4c 89 f6             	mov    rsi,r14
 1459079:	4c 89 fa             	mov    rdx,r15
 145907c:	4c 89 e1             	mov    rcx,r12
 145907f:	ff 50 28             	call   QWORD PTR [rax+0x28]
 1459082:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
 1459087:	e8 fa 53 64 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 145908c:	4c 89 ff             	mov    rdi,r15
 145908f:	e8 3a 5d 66 ff       	call   abedce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbd6e>
 1459094:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
 145909b:	00 
 145909c:	e8 2d 5d 66 ff       	call   abedce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbd6e>
 14590a1:	e9 df 00 00 00       	jmp    1459185 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29e709>
 14590a6:	48 8d bc 24 08 01 00 	lea    rdi,[rsp+0x108]
 14590ad:	00 
 14590ae:	48 8d b4 24 c0 00 00 	lea    rsi,[rsp+0xc0]
 14590b5:	00 
 14590b6:	e8 95 09 2e 00       	call   1739a50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xedbbc>
 14590bb:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 14590c0:	4c 89 fe             	mov    rsi,r15
 14590c3:	e8 71 18 65 ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
 14590c8:	49 8b 06             	mov    rax,QWORD PTR [r14]
 14590cb:	4c 8d bc 24 08 01 00 	lea    r15,[rsp+0x108]
 14590d2:	00 
 14590d3:	4c 8d 64 24 28       	lea    r12,[rsp+0x28]
 14590d8:	48 89 df             	mov    rdi,rbx
 14590db:	4c 89 f6             	mov    rsi,r14
 14590de:	4c 89 fa             	mov    rdx,r15

### call 0x1459589
 145952a:	eb 7f                	jmp    14595ab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29eb2f>
 145952c:	0f 18 0d 35 ad 4c 00 	prefetcht0 BYTE PTR [rip+0x4cad35]        # 1924268 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6b678>
 1459533:	48 8d 3d 2e ad 4c 00 	lea    rdi,[rip+0x4cad2e]        # 1924268 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6b678>
 145953a:	48 8b 05 2f ad 4c 00 	mov    rax,QWORD PTR [rip+0x4cad2f]        # 1924270 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6b680>
 1459541:	0f 18 08             	prefetcht0 BYTE PTR [rax]
 1459544:	e8 a1 56 2f 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
 1459549:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
 145954e:	48 8d 84 24 90 00 00 	lea    rax,[rsp+0x90]
 1459555:	00 
 1459556:	48 89 d7             	mov    rdi,rdx
 1459559:	48 89 c2             	mov    rdx,rax
 145955c:	e8 39 0c 2e 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
 1459561:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 1459566:	4c 89 fe             	mov    rsi,r15
 1459569:	e8 cb 13 65 ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
 145956e:	4c 8d 7c 24 78       	lea    r15,[rsp+0x78]
 1459573:	49 8b 06             	mov    rax,QWORD PTR [r14]
 1459576:	48 8d 54 24 70       	lea    rdx,[rsp+0x70]
 145957b:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
 1459580:	48 89 df             	mov    rdi,rbx
 1459583:	4c 89 f6             	mov    rsi,r14
 1459586:	4c 89 e1             	mov    rcx,r12
 1459589:	ff 50 28             	call   QWORD PTR [rax+0x28]
 145958c:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
 1459591:	e8 f0 4e 64 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1459596:	4c 89 ff             	mov    rdi,r15
 1459599:	e8 6a 14 65 ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 145959e:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
 14595a5:	00 
 14595a6:	e8 5d 14 65 ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 14595ab:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14595b2:	00 00 
 14595b4:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
 14595bb:	00 
 14595bc:	75 39                	jne    14595f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29eb7b>
 14595be:	48 89 d8             	mov    rax,rbx
 14595c1:	48 81 c4 b8 00 00 00 	add    rsp,0xb8
 14595c8:	5b                   	pop    rbx
 14595c9:	41 5c                	pop    r12
 14595cb:	41 5d                	pop    r13
 14595cd:	41 5e                	pop    r14
 14595cf:	41 5f                	pop    r15
 14595d1:	5d                   	pop    rbp
 14595d2:	c3                   	ret
 14595d3:	48 83 e0 fe          	and    rax,0xfffffffffffffffe
 14595d7:	48 8b 00             	mov    rax,QWORD PTR [rax]

### call 0x158d1d5
 158d181:	84 c0                	test   al,al
 158d183:	0f 84 97 00 00 00    	je     158d220 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d27a4>
 158d189:	4c 8b 7b 10          	mov    r15,QWORD PTR [rbx+0x10]
 158d18d:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
 158d190:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 158d193:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
 158d199:	4c 89 ff             	mov    rdi,r15
 158d19c:	48 89 c6             	mov    rsi,rax
 158d19f:	e8 fc e0 ff ff       	call   158b2a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d0824>
 158d1a4:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
 158d1a7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 158d1aa:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
 158d1b0:	49 89 c6             	mov    r14,rax
 158d1b3:	48 8b 5b 40          	mov    rbx,QWORD PTR [rbx+0x40]
 158d1b7:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
 158d1bc:	4c 89 ff             	mov    rdi,r15
 158d1bf:	e8 ac 8b 10 00       	call   1695d70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49edc>
 158d1c4:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 158d1c7:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 158d1cc:	48 89 de             	mov    rsi,rbx
 158d1cf:	4c 89 fa             	mov    rdx,r15
 158d1d2:	4c 89 f1             	mov    rcx,r14
 158d1d5:	ff 50 28             	call   QWORD PTR [rax+0x28]
 158d1d8:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 158d1dd:	48 85 ff             	test   rdi,rdi
 158d1e0:	75 2d                	jne    158d20f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d2793>
 158d1e2:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 158d1e5:	48 89 e7             	mov    rdi,rsp
 158d1e8:	48 8d 54 24 10       	lea    rdx,[rsp+0x10]
 158d1ed:	48 89 de             	mov    rsi,rbx
 158d1f0:	ff 50 30             	call   QWORD PTR [rax+0x30]
 158d1f3:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 158d1f8:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
 158d1fc:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 158d201:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
 158d205:	e8 e2 94 52 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
 158d20a:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 158d20f:	e8 d8 94 52 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
 158d214:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 158d219:	e8 72 0c 26 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 158d21e:	eb 7e                	jmp    158d29e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d2822>
 158d220:	49 8b 36             	mov    rsi,QWORD PTR [r14]
 158d223:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
 158d227:	e8 be 0b 00 00       	call   158ddea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d336e>
 158d22c:	48 85 c0             	test   rax,rax
 158d22f:	74 60                	je     158d291 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d2815>

### call 0x15b1769
 15b1713:	84 c0                	test   al,al
 15b1715:	0f 84 21 03 00 00    	je     15b1a3c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f6fc0>
 15b171b:	49 83 c6 18          	add    r14,0x18
 15b171f:	4c 8d 7b 09          	lea    r15,[rbx+0x9]
 15b1723:	f6 43 08 01          	test   BYTE PTR [rbx+0x8],0x1
 15b1727:	4d 89 f8             	mov    r8,r15
 15b172a:	74 04                	je     15b1730 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f6cb4>
 15b172c:	4c 8b 43 18          	mov    r8,QWORD PTR [rbx+0x18]
 15b1730:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
 15b1735:	45 8b 4c 24 20       	mov    r9d,DWORD PTR [r12+0x20]
 15b173a:	48 8d 35 3b 08 ea fe 	lea    rsi,[rip+0xfffffffffeea083b]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 15b1741:	48 8d 0d b1 9d db fe 	lea    rcx,[rip+0xfffffffffedb9db1]        # 36b4f9 <_ZTSSt12bad_any_cast@@Base-0x24ccf>
 15b1748:	6a 04                	push   0x4
 15b174a:	5f                   	pop    rdi
 15b174b:	ba 92 02 00 00       	mov    edx,0x292
 15b1750:	31 c0                	xor    eax,eax
 15b1752:	e8 7b 51 22 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
 15b1757:	48 8b 73 50          	mov    rsi,QWORD PTR [rbx+0x50]
 15b175b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 15b175e:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
 15b1763:	4c 89 e2             	mov    rdx,r12
 15b1766:	4c 89 f1             	mov    rcx,r14
 15b1769:	ff 50 28             	call   QWORD PTR [rax+0x28]
 15b176c:	48 83 7c 24 38 00    	cmp    QWORD PTR [rsp+0x38],0x0
 15b1772:	0f 84 97 00 00 00    	je     15b180f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f6d93>
 15b1778:	f6 43 08 01          	test   BYTE PTR [rbx+0x8],0x1
 15b177c:	74 04                	je     15b1782 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f6d06>
 15b177e:	4c 8b 7b 18          	mov    r15,QWORD PTR [rbx+0x18]
 15b1782:	48 8d 9c 24 80 00 00 	lea    rbx,[rsp+0x80]
 15b1789:	00 
 15b178a:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
 15b178f:	48 89 df             	mov    rdi,rbx
 15b1792:	e8 2f 95 0e 00       	call   169acc6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4ee32>
 15b1797:	f6 03 01             	test   BYTE PTR [rbx],0x1
 15b179a:	0f 84 a0 01 00 00    	je     15b1940 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f6ec4>
 15b17a0:	4c 8b 8c 24 90 00 00 	mov    r9,QWORD PTR [rsp+0x90]
 15b17a7:	00 
 15b17a8:	e9 9b 01 00 00       	jmp    15b1948 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f6ecc>
 15b17ad:	f6 43 08 01          	test   BYTE PTR [rbx+0x8],0x1
 15b17b1:	74 06                	je     15b17b9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f6d3d>
 15b17b3:	48 8b 5b 18          	mov    rbx,QWORD PTR [rbx+0x18]
 15b17b7:	eb 04                	jmp    15b17bd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f6d41>
 15b17b9:	48 83 c3 09          	add    rbx,0x9
 15b17bd:	89 ef                	mov    edi,ebp
 15b17bf:	e8 ba 03 05 00       	call   1601b7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x447102>
 15b17c4:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28

### call 0x15b41de
 15b417e:	48 8b 76 10          	mov    rsi,QWORD PTR [rsi+0x10]
 15b4182:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 15b4187:	e8 60 c3 0c 00       	call   16804ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34658>
 15b418c:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
 15b4191:	4d 85 ed             	test   r13,r13
 15b4194:	0f 84 81 00 00 00    	je     15b421b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f979f>
 15b419a:	4c 8d 7c 24 38       	lea    r15,[rsp+0x38]
 15b419f:	66 41 c7 07 00 01    	mov    WORD PTR [r15],0x100
 15b41a5:	49 83 67 08 00       	and    QWORD PTR [r15+0x8],0x0
 15b41aa:	48 89 df             	mov    rdi,rbx
 15b41ad:	e8 a8 44 4f ff       	call   aa865a <JNI_OnUnload@@Base+0x2ff27>
 15b41b2:	49 81 c6 70 01 00 00 	add    r14,0x170
 15b41b9:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
 15b41be:	4c 89 e7             	mov    rdi,r12
 15b41c1:	4c 89 f6             	mov    rsi,r14
 15b41c4:	e8 8d 1f 50 ff       	call   ab6156 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x30f6>
 15b41c9:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
 15b41cd:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 15b41d0:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 15b41d5:	4c 89 fa             	mov    rdx,r15
 15b41d8:	4c 89 e1             	mov    rcx,r12
 15b41db:	49 89 d8             	mov    r8,rbx
 15b41de:	ff 50 28             	call   QWORD PTR [rax+0x28]
 15b41e1:	48 8b 74 24 30       	mov    rsi,QWORD PTR [rsp+0x30]
 15b41e6:	48 85 f6             	test   rsi,rsi
 15b41e9:	74 0b                	je     15b41f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f977a>
 15b41eb:	80 7e 04 01          	cmp    BYTE PTR [rsi+0x4],0x1
 15b41ef:	75 05                	jne    15b41f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f977a>
 15b41f1:	45 31 f6             	xor    r14d,r14d
 15b41f4:	eb 15                	jmp    15b420b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f978f>
 15b41f6:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
 15b41fb:	4c 89 f7             	mov    rdi,r14
 15b41fe:	e8 65 7e 6d ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
 15b4203:	48 8b 74 24 30       	mov    rsi,QWORD PTR [rsp+0x30]
 15b4208:	4d 8b 36             	mov    r14,QWORD PTR [r14]
 15b420b:	48 89 f7             	mov    rdi,rsi
 15b420e:	e8 d9 24 50 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
 15b4213:	4c 89 f7             	mov    rdi,r14
 15b4216:	e8 d1 24 50 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
 15b421b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
 15b4220:	e8 61 a2 4e ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 15b4225:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 15b422c:	00 00 
 15b422e:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
 15b4233:	75 43                	jne    15b4278 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f97fc>
 15b4235:	48 89 d8             	mov    rax,rbx

### call 0x15c0693
 15c0643:	0f 85 f8 00 00 00    	jne    15c0741 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x405cc5>
 15c0649:	49 8b 06             	mov    rax,QWORD PTR [r14]
 15c064c:	4c 89 f7             	mov    rdi,r14
 15c064f:	ff 50 38             	call   QWORD PTR [rax+0x38]
 15c0652:	4c 89 ef             	mov    rdi,r13
 15c0655:	48 89 c6             	mov    rsi,rax
 15c0658:	e8 bd c3 4d ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
 15c065d:	4c 89 ef             	mov    rdi,r13
 15c0660:	e8 d1 b1 4b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 15c0665:	48 89 ef             	mov    rdi,rbp
 15c0668:	48 89 c6             	mov    rsi,rax
 15c066b:	e8 b8 4d 10 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
 15c0670:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
 15c0675:	e8 f0 5d ff ff       	call   15b646a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fb9ee>
 15c067a:	48 85 c0             	test   rax,rax
 15c067d:	74 22                	je     15c06a1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x405c25>
 15c067f:	4c 8b 08             	mov    r9,QWORD PTR [rax]
 15c0682:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
 15c0687:	48 89 c6             	mov    rsi,rax
 15c068a:	4c 89 e2             	mov    rdx,r12
 15c068d:	4c 89 e9             	mov    rcx,r13
 15c0690:	49 89 e8             	mov    r8,rbp
 15c0693:	41 ff 51 28          	call   QWORD PTR [r9+0x28]
 15c0697:	48 83 7c 24 78 00    	cmp    QWORD PTR [rsp+0x78],0x0
 15c069d:	75 5f                	jne    15c06fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x405c82>
 15c069f:	eb 06                	jmp    15c06a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x405c2b>
 15c06a1:	48 83 64 24 78 00    	and    QWORD PTR [rsp+0x78],0x0
 15c06a7:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 15c06ac:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
 15c06b0:	4c 89 ef             	mov    rdi,r13
 15c06b3:	e8 7e b1 4b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 15c06b8:	49 89 d0             	mov    r8,rdx
 15c06bb:	31 c9                	xor    ecx,ecx
 15c06bd:	88 8c 24 00 01 00 00 	mov    BYTE PTR [rsp+0x100],cl
 15c06c4:	88 8c 24 08 01 00 00 	mov    BYTE PTR [rsp+0x108],cl
 15c06cb:	49 8b 0e             	mov    rcx,QWORD PTR [r14]
 15c06ce:	4c 8b 51 20          	mov    r10,QWORD PTR [rcx+0x20]
 15c06d2:	0f 10 84 24 00 01 00 	movups xmm0,XMMWORD PTR [rsp+0x100]
 15c06d9:	00 
 15c06da:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
 15c06de:	4c 89 f7             	mov    rdi,r14
 15c06e1:	4c 89 e6             	mov    rsi,r12
 15c06e4:	48 8d 94 24 a8 00 00 	lea    rdx,[rsp+0xa8]
 15c06eb:	00 
 15c06ec:	48 89 c1             	mov    rcx,rax
 15c06ef:	4c 8b 4c 24 28       	mov    r9,QWORD PTR [rsp+0x28]

### call 0x15c1628
 15c15d8:	49 8b 06             	mov    rax,QWORD PTR [r14]
 15c15db:	4c 89 f7             	mov    rdi,r14
 15c15de:	ff 50 38             	call   QWORD PTR [rax+0x38]
 15c15e1:	48 89 84 24 78 01 00 	mov    QWORD PTR [rsp+0x178],rax
 15c15e8:	00 
 15c15e9:	48 89 94 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rdx
 15c15f0:	00 
 15c15f1:	48 89 ef             	mov    rdi,rbp
 15c15f4:	4c 89 ee             	mov    rsi,r13
 15c15f7:	e8 ac 49 52 ff       	call   ae5fa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x32f48>
 15c15fc:	48 89 ef             	mov    rdi,rbp
 15c15ff:	e8 32 a2 4b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 15c1604:	4c 89 ef             	mov    rdi,r13
 15c1607:	48 89 c6             	mov    rsi,rax
 15c160a:	e8 19 3e 10 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
 15c160f:	49 8b 07             	mov    rax,QWORD PTR [r15]
 15c1612:	48 8d bc 24 08 01 00 	lea    rdi,[rsp+0x108]
 15c1619:	00 
 15c161a:	4c 89 fe             	mov    rsi,r15
 15c161d:	48 8b 54 24 20       	mov    rdx,QWORD PTR [rsp+0x20]
 15c1622:	48 89 e9             	mov    rcx,rbp
 15c1625:	4d 89 e8             	mov    r8,r13
 15c1628:	ff 50 28             	call   QWORD PTR [rax+0x28]
 15c162b:	48 8b 84 24 08 01 00 	mov    rax,QWORD PTR [rsp+0x108]
 15c1632:	00 
 15c1633:	48 85 c0             	test   rax,rax
 15c1636:	74 16                	je     15c164e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x406bd2>
 15c1638:	80 78 04 01          	cmp    BYTE PTR [rax+0x4],0x1
 15c163c:	75 10                	jne    15c164e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x406bd2>
 15c163e:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 15c1645:	00 
 15c1646:	4c 89 ee             	mov    rsi,r13
 15c1649:	e8 ec 1b 65 ff       	call   c1323a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1601da>
 15c164e:	48 8b 84 24 80 00 00 	mov    rax,QWORD PTR [rsp+0x80]
 15c1655:	00 
 15c1656:	66 0f 6f 44 24 70    	movdqa xmm0,XMMWORD PTR [rsp+0x70]
 15c165c:	0f 28 8c 24 50 01 00 	movaps xmm1,XMMWORD PTR [rsp+0x150]
 15c1663:	00 
 15c1664:	0f 29 4c 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm1
 15c1669:	48 8b 8c 24 60 01 00 	mov    rcx,QWORD PTR [rsp+0x160]
 15c1670:	00 
 15c1671:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
 15c1678:	00 
 15c1679:	66 0f 7f 84 24 50 01 	movdqa XMMWORD PTR [rsp+0x150],xmm0
 15c1680:	00 00 
 15c1682:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax

### call 0x15cff0e
 15cfec7:	83 f8 29             	cmp    eax,0x29
 15cfeca:	74 05                	je     15cfed1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x415455>
 15cfecc:	83 f8 02             	cmp    eax,0x2
 15cfecf:	75 79                	jne    15cff4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4154ce>
 15cfed1:	48 8b 75 28          	mov    rsi,QWORD PTR [rbp+0x28]
 15cfed5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 15cfed8:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 15cfedd:	4c 89 ea             	mov    rdx,r13
 15cfee0:	4c 89 e1             	mov    rcx,r12
 15cfee3:	4d 89 f8             	mov    r8,r15
 15cfee6:	4d 89 f1             	mov    r9,r14
 15cfee9:	ff 50 20             	call   QWORD PTR [rax+0x20]
 15cfeec:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 15cfef1:	48 85 c0             	test   rax,rax
 15cfef4:	75 3e                	jne    15cff34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4154b8>
 15cfef6:	48 8b 75 30          	mov    rsi,QWORD PTR [rbp+0x30]
 15cfefa:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 15cfefd:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 15cff02:	4c 89 ea             	mov    rdx,r13
 15cff05:	4c 89 e1             	mov    rcx,r12
 15cff08:	4d 89 f8             	mov    r8,r15
 15cff0b:	4d 89 f1             	mov    r9,r14
 15cff0e:	ff 50 28             	call   QWORD PTR [rax+0x28]
 15cff11:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
 15cff16:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 15cff1b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 15cff20:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
 15cff25:	e8 c2 67 4e ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
 15cff2a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 15cff2f:	48 85 c0             	test   rax,rax
 15cff32:	74 5f                	je     15cff93 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x415517>
 15cff34:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
 15cff38:	48 89 03             	mov    QWORD PTR [rbx],rax
 15cff3b:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
 15cff41:	31 ff                	xor    edi,edi
 15cff43:	e8 a4 67 4e ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
 15cff48:	eb 1d                	jmp    15cff67 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4154eb>
 15cff4a:	48 8b 75 20          	mov    rsi,QWORD PTR [rbp+0x20]
 15cff4e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 15cff51:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
 15cff55:	48 89 df             	mov    rdi,rbx
 15cff58:	4c 89 ea             	mov    rdx,r13
 15cff5b:	4c 89 e1             	mov    rcx,r12
 15cff5e:	4d 89 f8             	mov    r8,r15
 15cff61:	4d 89 f1             	mov    r9,r14
 15cff64:	ff 50 20             	call   QWORD PTR [rax+0x20]

### call 0x163d7fe
 163d7b2:	ff 50 28             	call   QWORD PTR [rax+0x28]
 163d7b5:	48 8b 78 60          	mov    rdi,QWORD PTR [rax+0x60]
 163d7b9:	48 83 c7 20          	add    rdi,0x20
 163d7bd:	e8 74 e0 43 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 163d7c2:	48 89 d1             	mov    rcx,rdx
 163d7c5:	4c 89 e7             	mov    rdi,r12
 163d7c8:	4c 89 fe             	mov    rsi,r15
 163d7cb:	48 89 c2             	mov    rdx,rax
 163d7ce:	e8 ad e0 43 ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
 163d7d3:	89 c5                	mov    ebp,eax
 163d7d5:	84 c0                	test   al,al
 163d7d7:	75 71                	jne    163d84a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x389b8>
 163d7d9:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 163d7de:	4c 89 f6             	mov    rsi,r14
 163d7e1:	4c 89 e2             	mov    rdx,r12
 163d7e4:	4c 89 f9             	mov    rcx,r15
 163d7e7:	e8 de d0 ff ff       	call   163a8ca <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35a38>
 163d7ec:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 163d7ef:	48 89 df             	mov    rdi,rbx
 163d7f2:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
 163d7f8:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 163d7fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 163d7fe:	ff 50 28             	call   QWORD PTR [rax+0x28]
 163d801:	48 83 c0 30          	add    rax,0x30
 163d805:	48 89 c7             	mov    rdi,rax
 163d808:	e8 29 e0 43 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 163d80d:	49 89 d0             	mov    r8,rdx
 163d810:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 163d815:	48 8d 54 24 18       	lea    rdx,[rsp+0x18]
 163d81a:	4c 89 f6             	mov    rsi,r14
 163d81d:	48 89 c1             	mov    rcx,rax
 163d820:	e8 0f d6 ff ff       	call   163ae34 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35fa2>
 163d825:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 163d828:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
 163d82d:	48 89 df             	mov    rdi,rbx
 163d830:	ff 90 88 00 00 00    	call   QWORD PTR [rax+0x88]
 163d836:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
 163d83b:	e8 46 0c 46 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 163d840:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
 163d845:	e8 3c 0c 46 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 163d84a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 163d851:	00 00 
 163d853:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
 163d858:	75 47                	jne    163d8a1 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38a0f>
 163d85a:	40 80 f5 01          	xor    bpl,0x1
 163d85e:	89 e8                	mov    eax,ebp

### call 0x168c19b
 168c14b:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
 168c14f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 168c152:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
 168c159:	00 
 168c15a:	48 8d ac 24 90 02 00 	lea    rbp,[rsp+0x290]
 168c161:	00 
 168c162:	48 89 ea             	mov    rdx,rbp
 168c165:	48 8d 8c 24 18 02 00 	lea    rcx,[rsp+0x218]
 168c16c:	00 
 168c16d:	ff 50 68             	call   QWORD PTR [rax+0x68]
 168c170:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
 168c177:	00 
 168c178:	48 85 ff             	test   rdi,rdi
 168c17b:	74 07                	je     168c184 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x402f0>
 168c17d:	e8 6a a5 42 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
 168c182:	eb 44                	jmp    168c1c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40334>
 168c184:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
 168c188:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 168c18b:	48 8d bc 24 48 01 00 	lea    rdi,[rsp+0x148]
 168c192:	00 
 168c193:	48 89 ea             	mov    rdx,rbp
 168c196:	48 8b 4c 24 78       	mov    rcx,QWORD PTR [rsp+0x78]
 168c19b:	ff 50 28             	call   QWORD PTR [rax+0x28]
 168c19e:	4c 8b bc 24 48 01 00 	mov    r15,QWORD PTR [rsp+0x148]
 168c1a5:	00 
 168c1a6:	4c 89 ff             	mov    rdi,r15
 168c1a9:	e8 3e a5 42 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
 168c1ae:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
 168c1b5:	00 
 168c1b6:	e8 31 a5 42 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
 168c1bb:	4d 85 ff             	test   r15,r15
 168c1be:	0f 84 30 01 00 00    	je     168c2f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40460>
 168c1c4:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
 168c1c8:	4c 8d ac 24 28 02 00 	lea    r13,[rsp+0x228]
 168c1cf:	00 
 168c1d0:	eb 05                	jmp    168c1d7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40343>
 168c1d2:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
 168c1d7:	48 8b 54 24 20       	mov    rdx,QWORD PTR [rsp+0x20]
 168c1dc:	48 85 d2             	test   rdx,rdx
 168c1df:	74 54                	je     168c235 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x403a1>
 168c1e1:	48 83 bc 24 88 01 00 	cmp    QWORD PTR [rsp+0x188],0x0
 168c1e8:	00 00 
 168c1ea:	75 41                	jne    168c22d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40399>
 168c1ec:	48 8d bc 24 18 02 00 	lea    rdi,[rsp+0x218]
 168c1f3:	00 
 168c1f4:	4c 89 f6             	mov    rsi,r14

