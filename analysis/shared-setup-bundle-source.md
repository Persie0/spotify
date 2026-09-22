# Shared setup bundle source trace

This report follows the likely shared provider-factory setup bundle used by the central provider-vector caller.

The previous `analysis/provider-vector-factory-caller.md` ranked FDE `0x14cdc2a..0x14d4d4c` first. In that region, provider factory calls use the ABI:

```text
rdi = hidden/sret output
rsi = provider descriptor
rdx = shared setup bundle
rcx = registry context
call provider +0x28
```

This run therefore treats `rdx` at provider `+0x28` call sites as authoritative and traces the source register/field that feeds it.

## Provider +0x28 calls using rdx as shared setup bundle
### call 0x14cfd3d
     14cfcc2:	48 89 de             	mov    rsi,rbx
     14cfcc5:	4c 89 f2             	mov    rdx,r14
     14cfcc8:	ff 50 60             	call   QWORD PTR [rax+0x60]
     14cfccb:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
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

### call 0x14cfdb2
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
     14cfdc5:	48 89 de             	mov    rsi,rbx
     14cfdc8:	e8 25 9e 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14cfdcd:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14cfdd1:	e8 b0 e6 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cfdd6:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14cfddd:	00 

### call 0x14d06ad
     14d0629:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
     14d0630:	48 85 c0             	test   rax,rax
     14d0633:	74 05                	je     14d063a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x315bbe>
     14d0635:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
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

### call 0x14d0cce
     14d0c4c:	00 
     14d0c4d:	e8 3e d2 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14d0c52:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14d0c59:	00 
     14d0c5a:	e8 31 d2 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14d0c5f:	49 8b 5c 24 10       	mov    rbx,QWORD PTR [r12+0x10]
     14d0c64:	48 8d 35 3d 84 f6 fe 	lea    rsi,[rip+0xfffffffffef6843d]        # 4390a8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eaf7>
     14d0c6b:	48 8d bc 24 80 03 00 	lea    rdi,[rsp+0x380]
     14d0c72:	00 
     14d0c73:	e8 c8 d2 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14d0c78:	66 0f ef c0          	pxor   xmm0,xmm0
     14d0c7c:	48 8d 8c 24 30 02 00 	lea    rcx,[rsp+0x230]
     14d0c83:	00 
     14d0c84:	66 0f 7f 01          	movdqa XMMWORD PTR [rcx],xmm0
     14d0c88:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
     14d0c8d:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d0c94:	00 
     14d0c95:	48 8d 94 24 80 03 00 	lea    rdx,[rsp+0x380]
     14d0c9c:	00 
     14d0c9d:	4c 89 e6             	mov    rsi,r12
     14d0ca0:	e8 91 5e 01 00       	call   14e6b36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32c0ba>
     14d0ca5:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d0cac:	00 
     14d0cad:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14d0cb4:	00 
     14d0cb5:	4c 89 f7             	mov    rdi,r14
     14d0cb8:	e8 bf 5e 01 00       	call   14e6b7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32c100>
     14d0cbd:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d0cc0:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
     14d0cc7:	00 
     14d0cc8:	48 89 de             	mov    rsi,rbx
     14d0ccb:	4c 89 f2             	mov    rdx,r14
     14d0cce:	ff 50 28             	call   QWORD PTR [rax+0x28]
     14d0cd1:	48 8d b4 24 10 02 00 	lea    rsi,[rsp+0x210]
     14d0cd8:	00 
     14d0cd9:	4c 89 ff             	mov    rdi,r15
     14d0cdc:	e8 79 af 5e ff       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>
     14d0ce1:	48 8b bc 24 18 02 00 	mov    rdi,QWORD PTR [rsp+0x218]
     14d0ce8:	00 
     14d0ce9:	e8 98 d7 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0cee:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d0cf5:	00 
     14d0cf6:	e8 ed 9a 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>

### call 0x14d0d6a
     14d0ce9:	e8 98 d7 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0cee:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d0cf5:	00 
     14d0cf6:	e8 ed 9a 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d0cfb:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d0d02:	00 
     14d0d03:	e8 a6 b6 5f ff       	call   acc3ae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1934e>
     14d0d08:	48 8d 9c 24 30 02 00 	lea    rbx,[rsp+0x230]
     14d0d0f:	00 
     14d0d10:	48 89 df             	mov    rdi,rbx
     14d0d13:	e8 78 d1 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14d0d18:	48 8d bc 24 80 03 00 	lea    rdi,[rsp+0x380]
     14d0d1f:	00 
     14d0d20:	e8 6b d1 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14d0d25:	4d 8b 74 24 10       	mov    r14,QWORD PTR [r12+0x10]
     14d0d2a:	4c 89 23             	mov    QWORD PTR [rbx],r12
     14d0d2d:	48 8d 35 5d c3 5c ff 	lea    rsi,[rip+0xffffffffff5cc35d]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d0d34:	48 8d 0d 63 5e 01 00 	lea    rcx,[rip+0x15e63]        # 14e6b9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32c122>
     14d0d3b:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14d0d42:	00 
     14d0d43:	4c 8d 84 24 30 02 00 	lea    r8,[rsp+0x230]
     14d0d4a:	00 
     14d0d4b:	6a 08                	push   0x8
     14d0d4d:	41 59                	pop    r9
     14d0d4f:	48 89 df             	mov    rdi,rbx
     14d0d52:	31 d2                	xor    edx,edx
     14d0d54:	e8 3b 9a 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d0d59:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d0d5c:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d0d63:	00 
     14d0d64:	4c 89 f6             	mov    rsi,r14
     14d0d67:	48 89 da             	mov    rdx,rbx
     14d0d6a:	ff 50 28             	call   QWORD PTR [rax+0x28]
     14d0d6d:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14d0d74:	00 
     14d0d75:	4c 89 ff             	mov    rdi,r15
     14d0d78:	e8 dd ae 5e ff       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>
     14d0d7d:	48 8b bc 24 a8 03 00 	mov    rdi,QWORD PTR [rsp+0x3a8]
     14d0d84:	00 
     14d0d85:	e8 fc d6 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0d8a:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d0d91:	00 
     14d0d92:	e8 51 9a 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>

### call 0x14d1c49
     14d1bcb:	4c 8d 84 24 80 03 00 	lea    r8,[rsp+0x380]
     14d1bd2:	00 
     14d1bd3:	4c 89 f7             	mov    rdi,r14
     14d1bd6:	48 8d 35 b4 b4 5c ff 	lea    rsi,[rip+0xffffffffff5cb4b4]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
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

### call 0x14d1caf
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
     14d1cda:	00 

### call 0x14d2a30
     14d29b2:	48 89 de             	mov    rsi,rbx
     14d29b5:	4c 89 f2             	mov    rdx,r14
     14d29b8:	ff 50 18             	call   QWORD PTR [rax+0x18]
     14d29bb:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d29c2:	00 
     14d29c3:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
     14d29ca:	00 
     14d29cb:	48 89 de             	mov    rsi,rbx
     14d29ce:	e8 1f 72 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d29d3:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d29d7:	e8 aa ba 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d29dc:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d29e3:	00 
     14d29e4:	e8 ff 7d 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d29e9:	48 8b 9d 98 00 00 00 	mov    rbx,QWORD PTR [rbp+0x98]
     14d29f0:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d29f7:	00 
     14d29f8:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d29fb:	48 8d 35 8f a6 5c ff 	lea    rsi,[rip+0xffffffffff5ca68f]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d2a02:	48 8d 0d 0b 8a 00 00 	lea    rcx,[rip+0x8a0b]        # 14db414 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x320998>
     14d2a09:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2a10:	00 
     14d2a11:	6a 08                	push   0x8
     14d2a13:	41 59                	pop    r9
     14d2a15:	4c 89 f7             	mov    rdi,r14
     14d2a18:	31 d2                	xor    edx,edx
     14d2a1a:	e8 75 7d 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2a1f:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d2a22:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d2a29:	00 
     14d2a2a:	48 89 de             	mov    rsi,rbx
     14d2a2d:	4c 89 f2             	mov    rdx,r14
     14d2a30:	ff 50 28             	call   QWORD PTR [rax+0x28]
     14d2a33:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d2a3a:	00 
     14d2a3b:	48 8b bc 24 30 01 00 	mov    rdi,QWORD PTR [rsp+0x130]
     14d2a42:	00 
     14d2a43:	48 89 de             	mov    rsi,rbx
     14d2a46:	e8 a7 71 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2a4b:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d2a4f:	e8 32 ba 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2a54:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d2a5b:	00 

Total provider-like +0x28 call sites in ranked FDE: 8

## r14/r15/r13/r12/rbx/rbp assignment points inside ranked FDE
### r14
     14cdc3e:	49 89 fe             	mov    r14,rdi
     14cdf76:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14ce02c:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     14ce0b6:	4d 8b 74 24 30       	mov    r14,QWORD PTR [r12+0x30]
     14ce20c:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14ce273:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14ce35a:	41 5e                	pop    r14
     14ce450:	4d 8d 77 38          	lea    r14,[r15+0x38]
     14ce4a6:	4d 8d 77 20          	lea    r14,[r15+0x20]
     14ce8a9:	4c 8d 73 18          	lea    r14,[rbx+0x18]
     14cea12:	4d 8d 75 50          	lea    r14,[r13+0x50]
     14ceac6:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     14cebd2:	4c 8b b4 24 f8 00 00 	mov    r14,QWORD PTR [rsp+0xf8]
     14cec30:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14cec88:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14ced31:	49 89 c6             	mov    r14,rax
     14cef68:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14cf013:	4d 8b 77 48          	mov    r14,QWORD PTR [r15+0x48]
     14cf224:	4d 8d b5 f8 01 00 00 	lea    r14,[r13+0x1f8]
     14cf288:	4d 8d b5 90 01 00 00 	lea    r14,[r13+0x190]
     14cf39a:	4d 8b 77 30          	mov    r14,QWORD PTR [r15+0x30]
     14cf46a:	4c 8d 73 18          	lea    r14,[rbx+0x18]
     14cf554:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14cf5ed:	49 89 c6             	mov    r14,rax
     14cf68e:	4c 8d b4 24 80 03 00 	lea    r14,[rsp+0x380]
     14cf849:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14cf884:	49 89 c6             	mov    r14,rax
     14cf97f:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14cf9b0:	4c 8b 70 30          	mov    r14,QWORD PTR [rax+0x30]
     14cfb8f:	4d 89 fe             	mov    r14,r15
     14cfbfd:	4d 8b 77 78          	mov    r14,QWORD PTR [r15+0x78]
     14cfc46:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14cfca1:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14cfd16:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14cfd8b:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14cfe2e:	4c 8b 74 24 28       	mov    r14,QWORD PTR [rsp+0x28]
     14cfee2:	4d 8b b6 58 01 00 00 	mov    r14,QWORD PTR [r14+0x158]
     14cff4a:	4c 8b 73 28          	mov    r14,QWORD PTR [rbx+0x28]
     14cff91:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14d0168:	4d 8d b7 88 00 00 00 	lea    r14,[r15+0x88]
     14d01cd:	49 89 ee             	mov    r14,rbp
     14d02ea:	4d 8d 77 58          	lea    r14,[r15+0x58]
     14d0366:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14d0406:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d0481:	49 89 c6             	mov    r14,rax
     14d0558:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14d058a:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d06b0:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14d06d9:	4d 8b 77 30          	mov    r14,QWORD PTR [r15+0x30]
     14d0771:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d07f1:	4c 8b 70 48          	mov    r14,QWORD PTR [rax+0x48]
     14d0859:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d0907:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     14d0989:	4c 8d b4 24 80 03 00 	lea    r14,[rsp+0x380]
     14d09a7:	4c 8b 70 48          	mov    r14,QWORD PTR [rax+0x48]
     14d0a5c:	4c 8b 33             	mov    r14,QWORD PTR [rbx]
     14d0ac9:	4c 8d b4 24 80 03 00 	lea    r14,[rsp+0x380]
     14d0be2:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d0ca5:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d0d25:	4d 8b 74 24 10       	mov    r14,QWORD PTR [r12+0x10]
     14d0ddd:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d0ea0:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d0f20:	4d 8b 74 24 10       	mov    r14,QWORD PTR [r12+0x10]
     14d0f96:	4d 8b 74 24 10       	mov    r14,QWORD PTR [r12+0x10]
     14d1030:	4c 8b 74 24 28       	mov    r14,QWORD PTR [rsp+0x28]
     14d1067:	4d 8b 76 48          	mov    r14,QWORD PTR [r14+0x48]
     14d119a:	4c 8b 70 10          	mov    r14,QWORD PTR [rax+0x10]
     14d11f1:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14d12dd:	4c 8d 73 18          	lea    r14,[rbx+0x18]
     14d13b5:	4c 8d 73 18          	lea    r14,[rbx+0x18]
     14d14a8:	4c 8b 70 28          	mov    r14,QWORD PTR [rax+0x28]
     14d159a:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     14d15dd:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14d18e7:	49 89 de             	mov    r14,rbx
     14d1b3c:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14d1bc3:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d1ca4:	4d 89 fe             	mov    r14,r15
     14d1cfd:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d1db2:	4d 8b 74 24 48       	mov    r14,QWORD PTR [r12+0x48]
     14d1f7b:	4d 8d b4 24 00 01 00 	lea    r14,[r12+0x100]
     14d20f3:	4d 8b 74 24 48       	mov    r14,QWORD PTR [r12+0x48]
     14d213b:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14d217f:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d21b4:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14d228f:	4c 8d b4 24 80 03 00 	lea    r14,[rsp+0x380]
     14d22de:	41 5e                	pop    r14
     14d24ec:	4c 8d b2 e0 00 00 00 	lea    r14,[rdx+0xe0]
     14d2572:	4d 8b 74 24 30       	mov    r14,QWORD PTR [r12+0x30]
     14d28a1:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2919:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2991:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2a09:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2a7e:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2afa:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2b76:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2bee:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2c3f:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2cb4:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2d35:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2d98:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     14d2f30:	49 89 c6             	mov    r14,rax
     14d2f65:	4c 8b 75 20          	mov    r14,QWORD PTR [rbp+0x20]
     14d2fb3:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14d2fde:	4c 8b 75 20          	mov    r14,QWORD PTR [rbp+0x20]
     14d302c:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14d305a:	4c 8b 75 30          	mov    r14,QWORD PTR [rbp+0x30]
     14d30a4:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14d310c:	4c 8b 70 48          	mov    r14,QWORD PTR [rax+0x48]
     14d31e5:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     14d3222:	49 89 c6             	mov    r14,rax
     14d330b:	4d 8b 74 24 48       	mov    r14,QWORD PTR [r12+0x48]
     14d3340:	4c 8d 75 28          	lea    r14,[rbp+0x28]
     14d33e6:	4d 89 fe             	mov    r14,r15
     14d351a:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d354b:	4c 8b b0 a8 00 00 00 	mov    r14,QWORD PTR [rax+0xa8]
     14d3584:	49 89 de             	mov    r14,rbx
     14d3662:	4c 8d b4 24 30 02 00 	lea    r14,[rsp+0x230]
     14d3740:	41 5e                	pop    r14
     14d3913:	4d 8d b5 90 00 00 00 	lea    r14,[r13+0x90]
     14d39b2:	4c 8d b3 80 00 00 00 	lea    r14,[rbx+0x80]
     14d3cae:	4d 89 fe             	mov    r14,r15
     14d3d5c:	4d 8d b4 24 b8 01 00 	lea    r14,[r12+0x1b8]
     14d3f92:	4d 8d b7 88 00 00 00 	lea    r14,[r15+0x88]
     14d3fdc:	4d 89 fe             	mov    r14,r15
     14d422b:	49 89 c6             	mov    r14,rax
     14d423d:	49 89 c6             	mov    r14,rax
     14d4470:	49 89 c6             	mov    r14,rax
     14d451e:	4c 8d b7 e0 00 00 00 	lea    r14,[rdi+0xe0]
     14d457b:	4c 8b b4 24 e8 00 00 	mov    r14,QWORD PTR [rsp+0xe8]
     14d47ff:	49 89 c6             	mov    r14,rax
     14d48ac:	49 89 ee             	mov    r14,rbp

### r15
     14cdc69:	41 5f                	pop    r15
     14cdf53:	49 89 df             	mov    r15,rbx
     14ce18a:	4d 89 ef             	mov    r15,r13
     14ce3a0:	49 89 c7             	mov    r15,rax
     14ce5a8:	4d 8d 7d 20          	lea    r15,[r13+0x20]
     14ce79b:	4c 8b bc 24 f8 02 00 	mov    r15,QWORD PTR [rsp+0x2f8]
     14ce85e:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
     14cea32:	4d 8d 7d 20          	lea    r15,[r13+0x20]
     14cebf8:	4c 8b 7c 24 18       	mov    r15,QWORD PTR [rsp+0x18]
     14cec99:	4c 8b 7c 24 28       	mov    r15,QWORD PTR [rsp+0x28]
     14ced1d:	4d 8b 7c 24 30       	mov    r15,QWORD PTR [r12+0x30]
     14cef5c:	4c 8d b8 00 01 00 00 	lea    r15,[rax+0x100]
     14cefc6:	4c 8b 7c 24 28       	mov    r15,QWORD PTR [rsp+0x28]
     14cf156:	4d 8d 7d 28          	lea    r15,[r13+0x28]
     14cf177:	4d 8d 7d 50          	lea    r15,[r13+0x50]
     14cf327:	49 89 c7             	mov    r15,rax
     14cf3e9:	4c 8d 7b 40          	lea    r15,[rbx+0x40]
     14cf92b:	4c 8d bc 24 e0 02 00 	lea    r15,[rsp+0x2e0]
     14cf956:	4c 8d bc 24 a0 03 00 	lea    r15,[rsp+0x3a0]
     14cf9be:	49 89 c7             	mov    r15,rax
     14cfef1:	49 89 c7             	mov    r15,rax
     14cffbd:	4c 8d bc 24 b0 02 00 	lea    r15,[rsp+0x2b0]
     14d0026:	49 89 c7             	mov    r15,rax
     14d0284:	49 89 c7             	mov    r15,rax
     14d0549:	4d 89 e7             	mov    r15,r12
     14d05b9:	49 89 c7             	mov    r15,rax
     14d081e:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]
     14d090a:	49 89 f7             	mov    r15,rsi
     14d097d:	4c 8b 7c 24 18       	mov    r15,QWORD PTR [rsp+0x18]
     14d0a40:	4c 8d bc 24 e0 02 00 	lea    r15,[rsp+0x2e0]
     14d0b51:	4c 8d 7d 20          	lea    r15,[rbp+0x20]
     14d1097:	49 89 c7             	mov    r15,rax
     14d14c3:	4c 8b b9 80 00 00 00 	mov    r15,QWORD PTR [rcx+0x80]
     14d1605:	41 5f                	pop    r15
     14d1906:	4c 8d bc 24 a0 03 00 	lea    r15,[rsp+0x3a0]
     14d1981:	4c 8d bc 24 a0 03 00 	lea    r15,[rsp+0x3a0]
     14d1a17:	4c 8d bc 24 a0 03 00 	lea    r15,[rsp+0x3a0]
     14d1aa7:	4c 8d bc 24 a0 03 00 	lea    r15,[rsp+0x3a0]
     14d1b61:	4c 8d bc 24 e0 02 00 	lea    r15,[rsp+0x2e0]
     14d1be8:	4c 8d bc 24 a0 03 00 	lea    r15,[rsp+0x3a0]
     14d1c12:	4d 89 ef             	mov    r15,r13
     14d1ca7:	4c 8b bc 24 08 01 00 	mov    r15,QWORD PTR [rsp+0x108]
     14d1d87:	4d 8b 7c 24 30       	mov    r15,QWORD PTR [r12+0x30]
     14d20c2:	4d 8d 7c 24 20       	lea    r15,[r12+0x20]
     14d2239:	4c 8b bc 24 80 03 00 	mov    r15,QWORD PTR [rsp+0x380]
     14d2322:	4d 8b 7d 48          	mov    r15,QWORD PTR [r13+0x48]
     14d24e9:	49 89 d7             	mov    r15,rdx
     14d287d:	4c 8d 7d 18          	lea    r15,[rbp+0x18]
     14d2f82:	4c 8d bc 24 e0 02 00 	lea    r15,[rsp+0x2e0]
     14d2ffb:	4c 8d bc 24 e0 02 00 	lea    r15,[rsp+0x2e0]
     14d3077:	4c 8d bc 24 e0 02 00 	lea    r15,[rsp+0x2e0]
     14d32b6:	4d 8d 7e 18          	lea    r15,[r14+0x18]
     14d334c:	4c 8d bd 80 00 00 00 	lea    r15,[rbp+0x80]
     14d33ae:	49 89 c7             	mov    r15,rax
     14d35a7:	4c 8d bc 24 e0 02 00 	lea    r15,[rsp+0x2e0]
     14d35cf:	4c 8d bc 24 a0 03 00 	lea    r15,[rsp+0x3a0]
     14d35fa:	4d 8b 7d 00          	mov    r15,QWORD PTR [r13+0x0]
     14d362d:	4c 8d bc 24 a0 03 00 	lea    r15,[rsp+0x3a0]
     14d3742:	41 5f                	pop    r15
     14d3b96:	4c 8b 7c 24 28       	mov    r15,QWORD PTR [rsp+0x28]
     14d3ca9:	4c 8b 7c 24 50       	mov    r15,QWORD PTR [rsp+0x50]
     14d3f59:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
     14d4214:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
     14d4360:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
     14d4525:	4c 8d bf 08 01 00 00 	lea    r15,[rdi+0x108]
     14d45d3:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
     14d4659:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
     14d4663:	49 89 c7             	mov    r15,rax
     14d469b:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
     14d481c:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
     14d4848:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
     14d49fe:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
     14d4a9a:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
     14d4bd2:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
     14d4c85:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]

### r13
     14cdc3b:	49 89 f5             	mov    r13,rsi
     14cdec1:	4d 8b 6d 38          	mov    r13,QWORD PTR [r13+0x38]
     14cdf93:	4c 8d ac 24 a0 03 00 	lea    r13,[rsp+0x3a0]
     14cdfcb:	4c 8d 2d 2e a7 f6 fe 	lea    r13,[rip+0xfffffffffef6a72e]        # 438700 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e14f>
     14ce005:	4c 8d 2d 0c a7 f6 fe 	lea    r13,[rip+0xfffffffffef6a70c]        # 438718 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e167>
     14ce0c5:	49 89 c5             	mov    r13,rax
     14ce2f9:	49 89 ed             	mov    r13,rbp
     14ce586:	49 89 c5             	mov    r13,rax
     14ce6d9:	49 89 c5             	mov    r13,rax
     14ce7de:	4c 8b 6c 24 78       	mov    r13,QWORD PTR [rsp+0x78]
     14ce9a9:	49 89 c5             	mov    r13,rax
     14cecb9:	41 5d                	pop    r13
     14ced0f:	4d 8b 6f 08          	mov    r13,QWORD PTR [r15+0x8]
     14cedad:	4d 8d 6e 60          	lea    r13,[r14+0x60]
     14cef70:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]
     14cf111:	49 89 c5             	mov    r13,rax
     14cf39e:	4d 8b 6f 48          	mov    r13,QWORD PTR [r15+0x48]
     14cf402:	4c 8d 6b 68          	lea    r13,[rbx+0x68]
     14cf89e:	4d 8d 6e 18          	lea    r13,[r14+0x18]
     14cfb6a:	49 89 c5             	mov    r13,rax
     14cfe0f:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
     14cff67:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]
     14cffad:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]
     14d0106:	49 89 dd             	mov    r13,rbx
     14d0183:	4d 8d af b0 00 00 00 	lea    r13,[r15+0xb0]
     14d01d4:	4d 89 fd             	mov    r13,r15
     14d033b:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]
     14d0472:	4c 8b a8 a0 00 00 00 	mov    r13,QWORD PTR [rax+0xa0]
     14d064e:	4c 8d 6b 60          	lea    r13,[rbx+0x60]
     14d08e8:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]
     14d0fb4:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]
     14d0fe9:	4c 8b 6c 24 40       	mov    r13,QWORD PTR [rsp+0x40]
     14d11b7:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]
     14d1214:	4c 8b 68 10          	mov    r13,QWORD PTR [rax+0x10]
     14d1279:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]
     14d1565:	4c 8b 6c 24 78       	mov    r13,QWORD PTR [rsp+0x78]
     14d18e3:	4c 8b 6b 60          	mov    r13,QWORD PTR [rbx+0x60]
     14d19bd:	4c 8d ac 24 80 03 00 	lea    r13,[rsp+0x380]
     14d1a4f:	4c 8d ac 24 80 03 00 	lea    r13,[rsp+0x380]
     14d1adf:	4c 8d ac 24 80 03 00 	lea    r13,[rsp+0x380]
     14d1b23:	4d 89 f5             	mov    r13,r14
     14d1d2e:	4c 8b 6c 24 40       	mov    r13,QWORD PTR [rsp+0x40]
     14d2111:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]
     14d22c2:	4c 8b 6c 24 28       	mov    r13,QWORD PTR [rsp+0x28]
     14d23a6:	4c 8b 6c 24 40       	mov    r13,QWORD PTR [rsp+0x40]
     14d335f:	4c 8d ad a0 00 00 00 	lea    r13,[rbp+0xa0]
     14d341c:	4c 8d ac 24 a0 03 00 	lea    r13,[rsp+0x3a0]
     14d359e:	4c 8b 6c 24 40       	mov    r13,QWORD PTR [rsp+0x40]
     14d373e:	41 5d                	pop    r13
     14d381b:	49 89 c5             	mov    r13,rax
     14d385a:	49 89 c5             	mov    r13,rax
     14d3ac7:	49 89 c5             	mov    r13,rax
     14d3ade:	49 89 c5             	mov    r13,rax
     14d3af8:	49 89 c5             	mov    r13,rax
     14d3b05:	49 89 c5             	mov    r13,rax
     14d3b12:	49 89 c5             	mov    r13,rax
     14d3b27:	49 89 c5             	mov    r13,rax
     14d3b40:	49 89 c5             	mov    r13,rax
     14d3b7d:	49 89 dd             	mov    r13,rbx
     14d3efe:	49 89 c5             	mov    r13,rax
     14d3f15:	49 89 c5             	mov    r13,rax
     14d3f2a:	49 89 c5             	mov    r13,rax
     14d3f32:	49 89 c5             	mov    r13,rax
     14d3f37:	49 89 c5             	mov    r13,rax
     14d3f99:	4d 8d af b0 00 00 00 	lea    r13,[r15+0xb0]
     14d402a:	49 89 c5             	mov    r13,rax
     14d403c:	49 89 c5             	mov    r13,rax
     14d405b:	49 89 c5             	mov    r13,rax
     14d407d:	49 89 c5             	mov    r13,rax
     14d408f:	49 89 c5             	mov    r13,rax
     14d40ae:	49 89 c5             	mov    r13,rax
     14d40d0:	49 89 c5             	mov    r13,rax
     14d40e2:	49 89 c5             	mov    r13,rax
     14d40f7:	49 89 c5             	mov    r13,rax
     14d4109:	49 89 c5             	mov    r13,rax
     14d4128:	49 89 c5             	mov    r13,rax
     14d4144:	49 89 c5             	mov    r13,rax
     14d4156:	49 89 c5             	mov    r13,rax
     14d4175:	49 89 c5             	mov    r13,rax
     14d4196:	49 89 c5             	mov    r13,rax
     14d41e1:	49 89 c5             	mov    r13,rax
     14d41ee:	49 89 c5             	mov    r13,rax
     14d41f3:	49 89 c5             	mov    r13,rax
     14d42a9:	49 89 c5             	mov    r13,rax
     14d42bb:	49 89 c5             	mov    r13,rax
     14d42c8:	49 89 c5             	mov    r13,rax
     14d42cd:	49 89 c5             	mov    r13,rax
     14d42ee:	49 89 c5             	mov    r13,rax
     14d4300:	49 89 c5             	mov    r13,rax
     14d435d:	49 89 c5             	mov    r13,rax
     14d442f:	49 89 c5             	mov    r13,rax
     14d4485:	49 89 c5             	mov    r13,rax
     14d449a:	49 89 c5             	mov    r13,rax
     14d44f1:	49 89 c5             	mov    r13,rax
     14d45e2:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
     14d4609:	49 89 c5             	mov    r13,rax
     14d4628:	49 89 c5             	mov    r13,rax
     14d463f:	49 89 c5             	mov    r13,rax
     14d4651:	49 89 c5             	mov    r13,rax
     14d468e:	4d 89 fd             	mov    r13,r15
     14d46a5:	49 89 c5             	mov    r13,rax
     14d46b2:	49 89 c5             	mov    r13,rax
     14d46bf:	49 89 c5             	mov    r13,rax
     14d46cc:	49 89 c5             	mov    r13,rax
     14d46d1:	49 89 c5             	mov    r13,rax
     14d46eb:	49 89 c5             	mov    r13,rax
     14d473f:	49 89 c5             	mov    r13,rax
     14d4759:	49 89 c5             	mov    r13,rax
     14d482b:	4d 89 f5             	mov    r13,r14
     14d4833:	49 89 c5             	mov    r13,rax
     14d485c:	49 89 c5             	mov    r13,rax
     14d4898:	49 89 c5             	mov    r13,rax
     14d4a0d:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
     14d4a19:	49 89 c5             	mov    r13,rax
     14d4aa4:	49 89 c5             	mov    r13,rax
     14d4ba6:	49 89 c5             	mov    r13,rax
     14d4bab:	49 89 c5             	mov    r13,rax
     14d4bb0:	49 89 c5             	mov    r13,rax
     14d4be6:	49 89 c5             	mov    r13,rax
     14d4beb:	49 89 c5             	mov    r13,rax
     14d4c43:	49 89 c5             	mov    r13,rax
     14d4c48:	49 89 c5             	mov    r13,rax

### r12
     14cdc94:	41 5c                	pop    r12
     14cdf17:	4c 8d a3 d8 00 00 00 	lea    r12,[rbx+0xd8]
     14ce052:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
     14ce1f1:	4c 8d 25 20 3a f8 fe 	lea    r12,[rip+0xfffffffffef83a20]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
     14ce2c3:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
     14ce4bf:	4c 8d a4 24 e0 02 00 	lea    r12,[rsp+0x2e0]
     14ce5d6:	4d 8d 65 48          	lea    r12,[r13+0x48]
     14ce7f2:	4c 8b a4 24 38 03 00 	mov    r12,QWORD PTR [rsp+0x338]
     14ce8fc:	49 89 c4             	mov    r12,rax
     14cecb5:	41 5c                	pop    r12
     14cece3:	4d 89 fc             	mov    r12,r15
     14ced22:	4d 8b 64 24 48       	mov    r12,QWORD PTR [r12+0x48]
     14cee8e:	4d 8d 66 20          	lea    r12,[r14+0x20]
     14d0270:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
     14d0329:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
     14d03c7:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
     14d046d:	4d 8b 64 24 48       	mov    r12,QWORD PTR [r12+0x48]
     14d04ab:	49 89 c4             	mov    r12,rax
     14d0567:	4c 8b 64 24 18       	mov    r12,QWORD PTR [rsp+0x18]
     14d0642:	4c 8d 63 50          	lea    r12,[rbx+0x50]
     14d06fe:	4c 8d a4 24 e0 02 00 	lea    r12,[rsp+0x2e0]
     14d0787:	4c 8d a4 24 a0 03 00 	lea    r12,[rsp+0x3a0]
     14d0834:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]
     14d08f0:	4c 8d a4 24 a0 03 00 	lea    r12,[rsp+0x3a0]
     14d0b0c:	49 89 c4             	mov    r12,rax
     14d10ff:	4d 8d 67 18          	lea    r12,[r15+0x18]
     14d14ca:	4c 8b a1 88 00 00 00 	mov    r12,QWORD PTR [rcx+0x88]
     14d1560:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
     14d191c:	4c 8d a4 24 e0 02 00 	lea    r12,[rsp+0x2e0]
     14d19aa:	4c 8d a4 24 e0 02 00 	lea    r12,[rsp+0x2e0]
     14d1a3c:	4c 8d a4 24 e0 02 00 	lea    r12,[rsp+0x2e0]
     14d1acc:	4c 8d a4 24 e0 02 00 	lea    r12,[rsp+0x2e0]
     14d1b74:	4c 8d a4 24 80 03 00 	lea    r12,[rsp+0x380]
     14d1cb2:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
     14d1e10:	49 89 c4             	mov    r12,rax
     14d2282:	4c 8b 64 24 18       	mov    r12,QWORD PTR [rsp+0x18]
     14d2419:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
     14d25cd:	49 89 cc             	mov    r12,rcx
     14d32aa:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
     14d3465:	49 89 dc             	mov    r12,rbx
     14d35a3:	4d 8b 65 00          	mov    r12,QWORD PTR [r13+0x0]
     14d35fe:	4c 8d a4 24 e0 02 00 	lea    r12,[rsp+0x2e0]
     14d373c:	41 5c                	pop    r12
     14d38d5:	4d 8d a5 c0 01 00 00 	lea    r12,[r13+0x1c0]
     14d39b9:	4c 8d a3 a8 00 00 00 	lea    r12,[rbx+0xa8]
     14d3f5e:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]
     14d4223:	4c 8b a4 24 98 00 00 	mov    r12,QWORD PTR [rsp+0x98]
     14d4303:	4d 89 fc             	mov    r12,r15
     14d45d8:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]
     14d4821:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]
     14d484d:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]
     14d4a03:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]
     14d4bd7:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]
     14d4c8a:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]

### rbx
     14cdc6d:	5b                   	pop    rbx
     14cdecf:	48 89 c3             	mov    rbx,rax
     14ce04b:	49 8b 9e f8 00 00 00 	mov    rbx,QWORD PTR [r14+0xf8]
     14ce12b:	49 8d 5d 60          	lea    rbx,[r13+0x60]
     14ce4d6:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14ce518:	48 8b 5c 24 28       	mov    rbx,QWORD PTR [rsp+0x28]
     14ce6f0:	4c 89 eb             	mov    rbx,r13
     14ce7a8:	48 8d 98 90 00 00 00 	lea    rbx,[rax+0x90]
     14ce801:	4b 8b 1c 3c          	mov    rbx,QWORD PTR [r12+r15*1]
     14ce829:	4c 89 eb             	mov    rbx,r13
     14ce893:	48 89 c3             	mov    rbx,rax
     14ce9f9:	49 8d 5d 28          	lea    rbx,[r13+0x28]
     14cea96:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14cebfd:	49 8b 9f f8 00 00 00 	mov    rbx,QWORD PTR [r15+0xf8]
     14cec5f:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14cec78:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14ced94:	49 8d 5e 48          	lea    rbx,[r14+0x48]
     14cef55:	48 8b 98 f8 00 00 00 	mov    rbx,QWORD PTR [rax+0xf8]
     14cefbe:	48 89 c3             	mov    rbx,rax
     14cf00f:	49 8b 5f 30          	mov    rbx,QWORD PTR [r15+0x30]
     14cf233:	49 8d 9d 50 02 00 00 	lea    rbx,[r13+0x250]
     14cf26a:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14cf285:	48 89 c3             	mov    rbx,rax
     14cf3ac:	48 89 c3             	mov    rbx,rax
     14cf613:	49 8b 5d 48          	mov    rbx,QWORD PTR [r13+0x48]
     14cf778:	48 8b 99 88 00 00 00 	mov    rbx,QWORD PTR [rcx+0x88]
     14cf793:	48 89 c3             	mov    rbx,rax
     14cf7f5:	48 89 c3             	mov    rbx,rax
     14cf887:	48 89 c3             	mov    rbx,rax
     14cfaac:	49 8d 9f 88 00 00 00 	lea    rbx,[r15+0x88]
     14cfc84:	49 8b 5f 48          	mov    rbx,QWORD PTR [r15+0x48]
     14cfccb:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
     14cfcf9:	49 8b 5f 38          	mov    rbx,QWORD PTR [r15+0x38]
     14cfd40:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
     14cfd6e:	49 8b 5f 18          	mov    rbx,QWORD PTR [r15+0x18]
     14cfdb5:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
     14cfdf0:	48 8d 9c 24 80 03 00 	lea    rbx,[rsp+0x380]
     14cfe4a:	5b                   	pop    rbx
     14cfef4:	48 89 c3             	mov    rbx,rax
     14cfffd:	48 8b 58 48          	mov    rbx,QWORD PTR [rax+0x48]
     14d022d:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
     14d0275:	49 8b 5c 24 48       	mov    rbx,QWORD PTR [r12+0x48]
     14d02de:	49 8d 5f 48          	lea    rbx,[r15+0x48]
     14d0382:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14d039d:	48 89 c3             	mov    rbx,rax
     14d05b6:	48 89 c3             	mov    rbx,rax
     14d072b:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d0754:	49 8b 5f 40          	mov    rbx,QWORD PTR [r15+0x40]
     14d07bc:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
     14d07fd:	48 89 c3             	mov    rbx,rax
     14d0896:	48 8b 58 48          	mov    rbx,QWORD PTR [rax+0x48]
     14d09b3:	48 89 c3             	mov    rbx,rax
     14d0b9c:	49 8b 5c 24 10       	mov    rbx,QWORD PTR [r12+0x10]
     14d0c5f:	49 8b 5c 24 10       	mov    rbx,QWORD PTR [r12+0x10]
     14d0d08:	48 8d 9c 24 30 02 00 	lea    rbx,[rsp+0x230]
     14d0d3b:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14d0d97:	49 8b 5c 24 10       	mov    rbx,QWORD PTR [r12+0x10]
     14d0e5a:	49 8b 5c 24 10       	mov    rbx,QWORD PTR [r12+0x10]
     14d0f03:	48 8d 9c 24 f0 01 00 	lea    rbx,[rsp+0x1f0]
     14d0f36:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14d0f78:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d1014:	48 8d 9c 24 a0 01 00 	lea    rbx,[rsp+0x1a0]
     14d104c:	5b                   	pop    rbx
     14d10d6:	49 8d 5f 50          	lea    rbx,[r15+0x50]
     14d12c7:	48 89 c3             	mov    rbx,rax
     14d139f:	48 89 c3             	mov    rbx,rax
     14d14a4:	48 8b 58 20          	mov    rbx,QWORD PTR [rax+0x20]
     14d158c:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14d164f:	48 89 c3             	mov    rbx,rax
     14d192f:	48 8d 9c 24 80 03 00 	lea    rbx,[rsp+0x380]
     14d196b:	49 8b 5e 60          	mov    rbx,QWORD PTR [r14+0x60]
     14d1a8e:	49 8b 9e 90 00 00 00 	mov    rbx,QWORD PTR [r14+0x90]
     14d1bb4:	49 8b 5d 60          	mov    rbx,QWORD PTR [r13+0x60]
     14d1c4c:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d1c6d:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14d1cb7:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d1ce0:	49 8b 5e 70          	mov    rbx,QWORD PTR [r14+0x70]
     14d1d33:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d1dca:	5b                   	pop    rbx
     14d1fa3:	49 8d 9c 24 28 01 00 	lea    rbx,[r12+0x128]
     14d2002:	49 8d 9c 24 68 01 00 	lea    rbx,[r12+0x168]
     14d21d0:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14d257f:	48 89 c3             	mov    rbx,rax
     14d2881:	48 8b 9d 98 00 00 00 	mov    rbx,QWORD PTR [rbp+0x98]
     14d28cb:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d28f9:	48 8b 9d 98 00 00 00 	mov    rbx,QWORD PTR [rbp+0x98]
     14d2943:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d2971:	48 8b 9d 98 00 00 00 	mov    rbx,QWORD PTR [rbp+0x98]
     14d29bb:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d29e9:	48 8b 9d 98 00 00 00 	mov    rbx,QWORD PTR [rbp+0x98]
     14d2a33:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d2a61:	48 8b 5d 30          	mov    rbx,QWORD PTR [rbp+0x30]
     14d2aaf:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d2add:	48 8b 5d 30          	mov    rbx,QWORD PTR [rbp+0x30]
     14d2b2b:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d2b59:	48 8b 5d 30          	mov    rbx,QWORD PTR [rbp+0x30]
     14d2ba7:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d2c22:	48 8b 5d 20          	mov    rbx,QWORD PTR [rbp+0x20]
     14d2c69:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
     14d2c97:	48 8b 5d 50          	mov    rbx,QWORD PTR [rbp+0x50]
     14d2ce1:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
     14d2d18:	48 8b 5d 70          	mov    rbx,QWORD PTR [rbp+0x70]
     14d2d66:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
     14d2f3b:	48 89 eb             	mov    rbx,rbp
     14d311a:	48 89 c3             	mov    rbx,rax
     14d31f1:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14d32e2:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14d345b:	48 89 c3             	mov    rbx,rax
     14d355a:	48 89 c3             	mov    rbx,rax
     14d373b:	5b                   	pop    rbx
     14d3746:	48 89 c3             	mov    rbx,rax
     14d390f:	49 8d 5d 68          	lea    rbx,[r13+0x68]
     14d3b4b:	48 89 c3             	mov    rbx,rax
     14d3b5d:	48 89 c3             	mov    rbx,rax
     14d3c05:	48 89 eb             	mov    rbx,rbp
     14d3f54:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d420f:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d436d:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d45ce:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d45ff:	48 8b 9c 24 b8 02 00 	mov    rbx,QWORD PTR [rsp+0x2b8]
     14d4654:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d4696:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d46a8:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d46b5:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d46e1:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d4742:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
     14d4769:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d4817:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d4843:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d48a5:	48 8d 9d 90 00 00 00 	lea    rbx,[rbp+0x90]
     14d49f9:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d4a73:	48 8b 5c 24 78       	mov    rbx,QWORD PTR [rsp+0x78]
     14d4a95:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d4b19:	48 8b 9c 24 88 00 00 	mov    rbx,QWORD PTR [rsp+0x88]
     14d4b89:	48 8b 9c 24 88 00 00 	mov    rbx,QWORD PTR [rsp+0x88]
     14d4bcd:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d4c80:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]

### rbp
     14cdee5:	48 8d 6b 18          	lea    rbp,[rbx+0x18]
     14ce165:	48 89 c5             	mov    rbp,rax
     14ce2d2:	48 89 c5             	mov    rbp,rax
     14ce5fe:	49 8d 6d 60          	lea    rbp,[r13+0x60]
     14ce956:	48 89 c5             	mov    rbp,rax
     14cee09:	49 8d ae b8 00 00 00 	lea    rbp,[r14+0xb8]
     14cef7a:	5d                   	pop    rbp
     14cf1b3:	49 8d ad 40 01 00 00 	lea    rbp,[r13+0x140]
     14cf5f5:	48 89 c5             	mov    rbp,rax
     14cf90e:	48 8b 6b 48          	mov    rbp,QWORD PTR [rbx+0x48]
     14cfc16:	48 8d ac 24 e0 02 00 	lea    rbp,[rsp+0x2e0]
     14cff0b:	49 8d 6f 18          	lea    rbp,[r15+0x18]
     14d000e:	48 8b 68 08          	mov    rbp,QWORD PTR [rax+0x8]
     14d01c8:	48 8b 6c 24 20       	mov    rbp,QWORD PTR [rsp+0x20]
     14d0616:	48 8d 6b 18          	lea    rbp,[rbx+0x18]
     14d0a48:	48 8d ac 24 a0 03 00 	lea    rbp,[rsp+0x3a0]
     14d0b09:	48 89 c5             	mov    rbp,rax
     14d1231:	48 8d ac 24 e0 02 00 	lea    rbp,[rsp+0x2e0]
     14d1262:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
     14d175f:	48 8d 6b 20          	lea    rbp,[rbx+0x20]
     14d1f02:	49 8d ac 24 a0 00 00 	lea    rbp,[r12+0xa0]
     14d205e:	49 8d ac 24 88 01 00 	lea    rbp,[r12+0x188]
     14d20b2:	49 8d ac 24 a0 01 00 	lea    rbp,[r12+0x1a0]
     14d25c5:	48 89 c5             	mov    rbp,rax
     14d2dc6:	48 89 c5             	mov    rbp,rax
     14d331a:	48 89 c5             	mov    rbp,rax
     14d3744:	5d                   	pop    rbp
     14d3fa0:	49 8d af f8 00 00 00 	lea    rbp,[r15+0xf8]
     14d45dd:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
     14d4826:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
     14d4852:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
     14d4a08:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
     14d4bdc:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
     14d4c8f:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]


## Direct references to r14 as candidate shared setup bundle
     14cdc2d:	41 56                	push   r14
     14cdc3e:	49 89 fe             	mov    r14,rdi
     14cde97:	4c 89 f7             	mov    rdi,r14
     14cdea6:	4c 89 74 24 18       	mov    QWORD PTR [rsp+0x18],r14
     14cdeab:	49 8d be a0 01 00 00 	lea    rdi,[r14+0x1a0]
     14cdf76:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14cdf82:	4c 89 f7             	mov    rdi,r14
     14cdf9e:	4c 89 f2             	mov    rdx,r14
     14cdfb8:	4c 89 f7             	mov    rdi,r14
     14cdfc4:	41 c6 06 00          	mov    BYTE PTR [r14],0x0
     14cdfe2:	41 89 c6             	mov    r14d,eax
     14cdff0:	44 88 30             	mov    BYTE PTR [rax],r14b
     14ce014:	41 89 c6             	mov    r14d,eax
     14ce022:	44 88 30             	mov    BYTE PTR [rax],r14b
     14ce02c:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     14ce031:	49 89 ae f8 00 00 00 	mov    QWORD PTR [r14+0xf8],rbp
     14ce038:	49 8b be 00 01 00 00 	mov    rdi,QWORD PTR [r14+0x100]
     14ce03f:	49 89 9e 00 01 00 00 	mov    QWORD PTR [r14+0x100],rbx
     14ce04b:	49 8b 9e f8 00 00 00 	mov    rbx,QWORD PTR [r14+0xf8]
     14ce0b6:	4d 8b 74 24 30       	mov    r14,QWORD PTR [r12+0x30]
     14ce127:	4d 89 75 58          	mov    QWORD PTR [r13+0x58],r14
     14ce132:	4c 89 f6             	mov    rsi,r14
     14ce20c:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14ce214:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
     14ce21f:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     14ce22a:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14ce22e:	4c 89 f2             	mov    rdx,r14
     14ce236:	4c 89 f7             	mov    rdi,r14
     14ce273:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14ce27b:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
     14ce287:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     14ce292:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14ce29e:	4c 89 f2             	mov    rdx,r14
     14ce2a6:	4c 89 f7             	mov    rdi,r14
     14ce35a:	41 5e                	pop    r14
     14ce364:	4c 89 f2             	mov    rdx,r14
     14ce38c:	4c 89 f2             	mov    rdx,r14
     14ce450:	4d 8d 77 38          	lea    r14,[r15+0x38]
     14ce4a6:	4d 8d 77 20          	lea    r14,[r15+0x20]
     14ce533:	4d 89 77 28          	mov    QWORD PTR [r15+0x28],r14
     14ce571:	4c 89 74 24 50       	mov    QWORD PTR [rsp+0x50],r14
     14ce78e:	44 8b b4 24 00 03 00 	mov    r14d,DWORD PTR [rsp+0x300]
     14ce796:	4d 85 f6             	test   r14,r14
     14ce7af:	49 c1 e6 03          	shl    r14,0x3
     14ce7d1:	4d 39 e6             	cmp    r14,r12
     14ce7e5:	44 8b b4 24 40 03 00 	mov    r14d,DWORD PTR [rsp+0x340]
     14ce7ed:	4d 85 f6             	test   r14,r14
     14ce7fa:	49 c1 e6 03          	shl    r14,0x3
     14ce824:	4d 39 fe             	cmp    r14,r15
     14ce8a9:	4c 8d 73 18          	lea    r14,[rbx+0x18]
     14ce8b2:	4c 89 f7             	mov    rdi,r14
     14ce8bc:	4c 89 f7             	mov    rdi,r14
     14ce913:	4d 89 74 24 18       	mov    QWORD PTR [r12+0x18],r14
     14cea12:	4d 8d 75 50          	lea    r14,[r13+0x50]
     14ceac6:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     14ceacb:	49 8b be 88 00 00 00 	mov    rdi,QWORD PTR [r14+0x88]
     14cead8:	66 41 0f 7f 86 80 00 	movdqa XMMWORD PTR [r14+0x80],xmm0
     14ceaeb:	49 8d b6 70 01 00 00 	lea    rsi,[r14+0x170]
     14cebd2:	4c 8b b4 24 f8 00 00 	mov    r14,QWORD PTR [rsp+0xf8]
     14cebda:	49 83 c6 08          	add    r14,0x8
     14cec17:	f0 49 ff 06          	lock inc QWORD PTR [r14]
     14cec30:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14cec3c:	4c 89 f7             	mov    rdi,r14
     14cec52:	4c 89 f2             	mov    rdx,r14
     14cec88:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14cec90:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14cecfc:	4c 89 f7             	mov    rdi,r14
     14ced31:	49 89 c6             	mov    r14,rax
     14ced44:	49 89 06             	mov    QWORD PTR [r14],rax
     14ced6b:	f3 41 0f 7f 46 28    	movdqu XMMWORD PTR [r14+0x28],xmm0
     14ced78:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
     14ced85:	f3 41 0f 7f 4e 38    	movdqu XMMWORD PTR [r14+0x38],xmm1
     14ced94:	49 8d 5e 48          	lea    rbx,[r14+0x48]
     14ceda0:	4c 89 b4 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],r14
     14cedad:	4d 8d 6e 60          	lea    r13,[r14+0x60]
     14cedcd:	4d 89 a6 90 00 00 00 	mov    QWORD PTR [r14+0x90],r12
     14cedd4:	4d 89 be 98 00 00 00 	mov    QWORD PTR [r14+0x98],r15
     14cedf4:	66 41 89 8e a0 00 00 	mov    WORD PTR [r14+0xa0],cx
     14cee00:	f3 41 0f 7f 86 a8 00 	movdqu XMMWORD PTR [r14+0xa8],xmm0
     14cee09:	49 8d ae b8 00 00 00 	lea    rbp,[r14+0xb8]
     14cee21:	66 41 0f 7f 86 f0 00 	movdqa XMMWORD PTR [r14+0xf0],xmm0
     14cee2a:	66 41 0f 7f 86 e0 00 	movdqa XMMWORD PTR [r14+0xe0],xmm0
     14cee33:	66 41 0f 7f 86 d0 00 	movdqa XMMWORD PTR [r14+0xd0],xmm0
     14cee41:	41 89 86 00 01 00 00 	mov    DWORD PTR [r14+0x100],eax
     14cee48:	f3 41 0f 7f 86 08 01 	movdqu XMMWORD PTR [r14+0x108],xmm0
     14cee51:	f3 41 0f 7f 86 18 01 	movdqu XMMWORD PTR [r14+0x118],xmm0
     14cee5a:	41 89 86 28 01 00 00 	mov    DWORD PTR [r14+0x128],eax
     14cee61:	66 41 0f 7f 86 30 01 	movdqa XMMWORD PTR [r14+0x130],xmm0
     14cee6a:	66 41 0f 7f 86 40 01 	movdqa XMMWORD PTR [r14+0x140],xmm0
     14cee73:	41 89 86 50 01 00 00 	mov    DWORD PTR [r14+0x150],eax
     14cee8e:	4d 8d 66 20          	lea    r12,[r14+0x20]
     14cef02:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
     14cef15:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
     14cef1a:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
     14cef1f:	4d 89 66 28          	mov    QWORD PTR [r14+0x28],r12
     14cef23:	4d 89 76 30          	mov    QWORD PTR [r14+0x30],r14
     14cef2c:	4c 89 f7             	mov    rdi,r14
     14cef68:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14cef7f:	4c 89 f7             	mov    rdi,r14
     14cef8a:	4c 89 f6             	mov    rsi,r14
     14cefae:	4c 89 f7             	mov    rdi,r14
     14cf013:	4d 8b 77 48          	mov    r14,QWORD PTR [r15+0x48]
     14cf16f:	4d 89 75 40          	mov    QWORD PTR [r13+0x40],r14
     14cf224:	4d 8d b5 f8 01 00 00 	lea    r14,[r13+0x1f8]
     14cf22b:	4c 89 f7             	mov    rdi,r14
     14cf288:	4d 8d b5 90 01 00 00 	lea    r14,[r13+0x190]
     14cf340:	4c 89 f7             	mov    rdi,r14
     14cf39a:	4d 8b 77 30          	mov    r14,QWORD PTR [r15+0x30]
     14cf3fe:	4c 89 73 60          	mov    QWORD PTR [rbx+0x60],r14
     14cf46a:	4c 8d 73 18          	lea    r14,[rbx+0x18]
     14cf476:	4c 89 f7             	mov    rdi,r14
     14cf4ac:	4c 89 f7             	mov    rdi,r14
     14cf4cb:	66 49 0f 6e c6       	movq   xmm0,r14
     14cf4f6:	4c 89 73 20          	mov    QWORD PTR [rbx+0x20],r14
     14cf554:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14cf55c:	49 83 66 08 00       	and    QWORD PTR [r14+0x8],0x0
     14cf568:	49 89 06             	mov    QWORD PTR [r14],rax
     14cf56f:	f3 41 0f 7f 46 10    	movdqu XMMWORD PTR [r14+0x10],xmm0
     14cf575:	41 c6 46 20 00       	mov    BYTE PTR [r14+0x20],0x0
     14cf587:	4c 89 f7             	mov    rdi,r14
     14cf5ed:	49 89 c6             	mov    r14,rax
     14cf68a:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14
     14cf68e:	4c 8d b4 24 80 03 00 	lea    r14,[rsp+0x380]
     14cf696:	49 89 06             	mov    QWORD PTR [r14],rax
     14cf6a0:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     14cf6ab:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14cf6ba:	4c 89 f2             	mov    rdx,r14
     14cf6c2:	4c 89 f7             	mov    rdi,r14
     14cf849:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14cf851:	49 89 06             	mov    QWORD PTR [r14],rax
     14cf854:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     14cf869:	4c 89 f6             	mov    rsi,r14
     14cf871:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14cf884:	49 89 c6             	mov    r14,rax
     14cf88e:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
     14cf89b:	49 89 06             	mov    QWORD PTR [r14],rax
     14cf89e:	4d 8d 6e 18          	lea    r13,[r14+0x18]
     14cf8a9:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14cf8ad:	f3 41 0f 7f 46 20    	movdqu XMMWORD PTR [r14+0x20],xmm0
     14cf8b3:	f3 41 0f 7f 46 30    	movdqu XMMWORD PTR [r14+0x30],xmm0
     14cf8b9:	41 c7 46 40 00 00 80 	mov    DWORD PTR [r14+0x40],0x3f800000
     14cf8ce:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0
     14cf8de:	49 8d 46 20          	lea    rax,[r14+0x20]
     14cf8e7:	49 8d 7e 58          	lea    rdi,[r14+0x58]
     14cf8f8:	49 81 c6 b0 00 00 00 	add    r14,0xb0
     14cf8ff:	4c 89 f7             	mov    rdi,r14
     14cf95e:	4c 89 f7             	mov    rdi,r14
     14cf97f:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14cf987:	4d 89 2e             	mov    QWORD PTR [r14],r13
     14cf98a:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     14cf99a:	4c 89 f6             	mov    rsi,r14
     14cf9a2:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14cf9b0:	4c 8b 70 30          	mov    r14,QWORD PTR [rax+0x30]
     14cfb4d:	4d 89 b7 80 01 00 00 	mov    QWORD PTR [r15+0x180],r14
     14cfb8f:	4d 89 fe             	mov    r14,r15
     14cfb92:	49 83 c6 08          	add    r14,0x8
     14cfbbd:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14cfbc7:	f3 41 0f 7f 06       	movdqu XMMWORD PTR [r14],xmm0
     14cfbe1:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
     14cfbe5:	f3 41 0f 6f 06       	movdqu xmm0,XMMWORD PTR [r14]
     14cfbfd:	4d 8b 77 78          	mov    r14,QWORD PTR [r15+0x78]
     14cfc32:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14cfc3d:	4c 89 f6             	mov    rsi,r14
     14cfc46:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14cfc51:	4c 89 f6             	mov    rsi,r14
     14cfc59:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14cfca1:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14cfcad:	4c 89 f7             	mov    rdi,r14
     14cfcc5:	4c 89 f2             	mov    rdx,r14
     14cfd16:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14cfd22:	4c 89 f7             	mov    rdi,r14
     14cfd3a:	4c 89 f2             	mov    rdx,r14
     14cfd8b:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14cfd97:	4c 89 f7             	mov    rdi,r14
     14cfdaf:	4c 89 f2             	mov    rdx,r14
     14cfe2e:	4c 8b 74 24 28       	mov    r14,QWORD PTR [rsp+0x28]
     14cfe33:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
     14cfe61:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
     14cfe8c:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
     14cfeb7:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
     14cfee2:	4d 8b b6 58 01 00 00 	mov    r14,QWORD PTR [r14+0x158]
     14cff1a:	4d 89 77 20          	mov    QWORD PTR [r15+0x20],r14
     14cff4a:	4c 8b 73 28          	mov    r14,QWORD PTR [rbx+0x28]
     14cff7d:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14cff88:	4c 89 f6             	mov    rsi,r14
     14cff91:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14cff9c:	4c 89 f6             	mov    rsi,r14
     14cffa4:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d00b6:	4c 89 b4 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],r14
     14d0168:	4d 8d b7 88 00 00 00 	lea    r14,[r15+0x88]
     14d016f:	4c 89 f7             	mov    rdi,r14
     14d01cd:	49 89 ee             	mov    r14,rbp
     14d01d0:	49 83 c6 08          	add    r14,0x8
     14d026c:	f0 49 ff 06          	lock inc QWORD PTR [r14]
     14d02ea:	4d 8d 77 58          	lea    r14,[r15+0x58]
     14d0366:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14d0371:	4c 89 f6             	mov    rsi,r14
     14d0379:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d0406:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d040e:	4c 89 f7             	mov    rdi,r14
     14d0445:	4c 89 b4 24 00 03 00 	mov    QWORD PTR [rsp+0x300],r14
     14d0450:	4c 89 f6             	mov    rsi,r14
     14d0481:	49 89 c6             	mov    r14,rax
     14d0491:	4d 89 66 18          	mov    QWORD PTR [r14+0x18],r12
     14d0495:	4d 89 6e 20          	mov    QWORD PTR [r14+0x20],r13
     14d0499:	4c 89 b4 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],r14
     14d053a:	4d 89 74 24 50       	mov    QWORD PTR [r12+0x50],r14
     14d0558:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14d0560:	4d 89 3e             	mov    QWORD PTR [r14],r15
     14d0563:	4d 89 66 08          	mov    QWORD PTR [r14+0x8],r12
     14d0579:	4c 89 f6             	mov    rsi,r14
     14d0581:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d058a:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d0592:	4c 89 f7             	mov    rdi,r14
     14d0697:	4c 89 b4 24 00 03 00 	mov    QWORD PTR [rsp+0x300],r14
     14d06aa:	4c 89 f2             	mov    rdx,r14
     14d06b0:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14d06bb:	4c 89 f6             	mov    rsi,r14
     14d06c3:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d06d9:	4d 8b 77 30          	mov    r14,QWORD PTR [r15+0x30]
     14d0714:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d0722:	4c 89 f6             	mov    rsi,r14
     14d0771:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d077d:	4c 89 f7             	mov    rdi,r14
     14d0795:	4c 89 f2             	mov    rdx,r14
     14d07b4:	4c 89 f7             	mov    rdi,r14
     14d07f1:	4c 8b 70 48          	mov    r14,QWORD PTR [rax+0x48]
     14d0840:	4c 89 73 30          	mov    QWORD PTR [rbx+0x30],r14
     14d0859:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d0861:	49 89 06             	mov    QWORD PTR [r14],rax
     14d0864:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     14d0880:	4c 89 f6             	mov    rsi,r14
     14d0888:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d0907:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     14d0939:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d093f:	4c 89 f6             	mov    rsi,r14
     14d0989:	4c 8d b4 24 80 03 00 	lea    r14,[rsp+0x380]
     14d0991:	49 83 26 00          	and    QWORD PTR [r14],0x0
     14d099a:	4c 89 f7             	mov    rdi,r14
     14d09a7:	4c 8b 70 48          	mov    r14,QWORD PTR [rax+0x48]
     14d0a09:	4c 89 73 20          	mov    QWORD PTR [rbx+0x20],r14
     14d0a5c:	4c 8b 33             	mov    r14,QWORD PTR [rbx]
     14d0a8b:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d0a91:	4c 89 f6             	mov    rsi,r14
     14d0ac9:	4c 8d b4 24 80 03 00 	lea    r14,[rsp+0x380]
     14d0ad1:	49 89 1e             	mov    QWORD PTR [r14],rbx
     14d0aed:	49 83 26 00          	and    QWORD PTR [r14],0x0
     14d0af9:	4c 89 f7             	mov    rdi,r14
     14d0be2:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d0bf2:	4c 89 f7             	mov    rdi,r14
     14d0c08:	4c 89 f2             	mov    rdx,r14
     14d0ca5:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d0cb5:	4c 89 f7             	mov    rdi,r14
     14d0ccb:	4c 89 f2             	mov    rdx,r14
     14d0d25:	4d 8b 74 24 10       	mov    r14,QWORD PTR [r12+0x10]
     14d0d59:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d0d64:	4c 89 f6             	mov    rsi,r14
     14d0ddd:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d0ded:	4c 89 f7             	mov    rdi,r14
     14d0e03:	4c 89 f2             	mov    rdx,r14
     14d0ea0:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d0eb0:	4c 89 f7             	mov    rdi,r14
     14d0ec6:	4c 89 f2             	mov    rdx,r14
     14d0f20:	4d 8b 74 24 10       	mov    r14,QWORD PTR [r12+0x10]
     14d0f54:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d0f5f:	4c 89 f6             	mov    rsi,r14
     14d0f96:	4d 8b 74 24 10       	mov    r14,QWORD PTR [r12+0x10]
     14d0fca:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d0fd0:	4c 89 f6             	mov    rsi,r14
     14d1030:	4c 8b 74 24 28       	mov    r14,QWORD PTR [rsp+0x28]
     14d1035:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
     14d1063:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
     14d1067:	4d 8b 76 48          	mov    r14,QWORD PTR [r14+0x48]
     14d10d2:	4d 89 77 30          	mov    QWORD PTR [r15+0x30],r14
     14d119a:	4c 8b 70 10          	mov    r14,QWORD PTR [rax+0x10]
     14d11cd:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d11d8:	4c 89 f6             	mov    rsi,r14
     14d11f1:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14d11f9:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d124b:	4c 89 f7             	mov    rdi,r14
     14d12dd:	4c 8d 73 18          	lea    r14,[rbx+0x18]
     14d133e:	4c 89 f7             	mov    rdi,r14
     14d137a:	66 49 0f 6e ce       	movq   xmm1,r14
     14d13b5:	4c 8d 73 18          	lea    r14,[rbx+0x18]
     14d1416:	4c 89 f7             	mov    rdi,r14
     14d1452:	66 49 0f 6e ce       	movq   xmm1,r14
     14d14a8:	4c 8b 70 28          	mov    r14,QWORD PTR [rax+0x28]
     14d14ac:	4d 85 f6             	test   r14,r14
     14d14b1:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
     14d14e9:	4c 89 b4 24 a8 03 00 	mov    QWORD PTR [rsp+0x3a8],r14
     14d153c:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
     14d159a:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     14d159f:	49 8b be 50 01 00 00 	mov    rdi,QWORD PTR [r14+0x150]
     14d15b4:	49 89 86 50 01 00 00 	mov    QWORD PTR [r14+0x150],rax
     14d15dd:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14d15e5:	4c 89 f7             	mov    rdi,r14
     14d1674:	4c 89 b4 24 d0 02 00 	mov    QWORD PTR [rsp+0x2d0],r14
     14d1693:	4c 89 f6             	mov    rsi,r14
     14d18e7:	49 89 de             	mov    r14,rbx
     14d196b:	49 8b 5e 60          	mov    rbx,QWORD PTR [r14+0x60]
     14d1a01:	49 03 5e 60          	add    rbx,QWORD PTR [r14+0x60]
     14d1a8e:	49 8b 9e 90 00 00 00 	mov    rbx,QWORD PTR [r14+0x90]
     14d1b23:	4d 89 f5             	mov    r13,r14
     14d1b26:	49 03 5e 60          	add    rbx,QWORD PTR [r14+0x60]
     14d1b3c:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14d1b4c:	4c 89 f7             	mov    rdi,r14
     14d1b6c:	4c 89 f6             	mov    rsi,r14
     14d1bac:	4c 89 f7             	mov    rdi,r14
     14d1bc3:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d1bd3:	4c 89 f7             	mov    rdi,r14
     14d1bf6:	4c 89 f2             	mov    rdx,r14
     14d1c1a:	4c 89 f7             	mov    rdi,r14
     14d1c30:	49 89 06             	mov    QWORD PTR [r14],rax
     14d1c33:	49 89 6e 08          	mov    QWORD PTR [r14+0x8],rbp
     14d1c37:	4d 89 76 20          	mov    QWORD PTR [r14+0x20],r14
     14d1c46:	4c 89 f2             	mov    rdx,r14
     14d1ca4:	4d 89 fe             	mov    r14,r15
     14d1ce0:	49 8b 5e 70          	mov    rbx,QWORD PTR [r14+0x70]
     14d1cfd:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d1d09:	4c 89 f7             	mov    rdi,r14
     14d1d28:	4c 89 f1             	mov    rcx,r14
     14d1db2:	4d 8b 74 24 48       	mov    r14,QWORD PTR [r12+0x48]
     14d1f1a:	4d 89 b4 24 d0 00 00 	mov    QWORD PTR [r12+0xd0],r14
     14d1f7b:	4d 8d b4 24 00 01 00 	lea    r14,[r12+0x100]
     14d1f83:	4c 89 f7             	mov    rdi,r14
     14d1fc1:	4c 89 b4 24 90 00 00 	mov    QWORD PTR [rsp+0x90],r14
     14d20f3:	4d 8b 74 24 48       	mov    r14,QWORD PTR [r12+0x48]
     14d2127:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d2132:	4c 89 f6             	mov    rsi,r14
     14d213b:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14d2148:	4c 89 f6             	mov    rsi,r14
     14d2150:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d217f:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d218b:	4c 89 f7             	mov    rdi,r14
     14d21ae:	4c 89 f2             	mov    rdx,r14
     14d21b4:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14d21bf:	4c 89 f6             	mov    rsi,r14
     14d21c7:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d228f:	4c 8d b4 24 80 03 00 	lea    r14,[rsp+0x380]
     14d2297:	4c 89 f6             	mov    rsi,r14
     14d229f:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d22de:	41 5e                	pop    r14
     14d22e4:	4c 89 f2             	mov    rdx,r14
     14d230c:	4c 89 f2             	mov    rdx,r14
     14d233b:	4c 89 f2             	mov    rdx,r14
     14d2361:	4c 89 f2             	mov    rdx,r14
     14d236c:	41 89 c6             	mov    r14d,eax
     14d23f3:	44 88 72 2a          	mov    BYTE PTR [rdx+0x2a],r14b
     14d24ec:	4c 8d b2 e0 00 00 00 	lea    r14,[rdx+0xe0]
     14d24fb:	4c 89 f7             	mov    rdi,r14
     14d2572:	4d 8b 74 24 30       	mov    r14,QWORD PTR [r12+0x30]
     14d258c:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
     14d28a1:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d28ad:	4c 89 f7             	mov    rdi,r14
     14d28c5:	4c 89 f2             	mov    rdx,r14
     14d2919:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2925:	4c 89 f7             	mov    rdi,r14
     14d293d:	4c 89 f2             	mov    rdx,r14
     14d2991:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d299d:	4c 89 f7             	mov    rdi,r14
     14d29b5:	4c 89 f2             	mov    rdx,r14
     14d2a09:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2a15:	4c 89 f7             	mov    rdi,r14
     14d2a2d:	4c 89 f2             	mov    rdx,r14
     14d2a7e:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2a8a:	4c 89 f7             	mov    rdi,r14
     14d2aa9:	4c 89 f1             	mov    rcx,r14
     14d2afa:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2b06:	4c 89 f7             	mov    rdi,r14
     14d2b25:	4c 89 f1             	mov    rcx,r14
     14d2b76:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2b82:	4c 89 f7             	mov    rdi,r14
     14d2ba1:	4c 89 f1             	mov    rcx,r14
     14d2bee:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2bf6:	4c 89 f7             	mov    rdi,r14
     14d2c09:	4c 89 f6             	mov    rsi,r14
     14d2c11:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d2c3f:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2c4b:	4c 89 f7             	mov    rdi,r14
     14d2c63:	4c 89 f2             	mov    rdx,r14
     14d2cb4:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2cc0:	4c 89 f7             	mov    rdi,r14
     14d2cd8:	4c 89 f2             	mov    rdx,r14
     14d2d35:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2d41:	4c 89 f7             	mov    rdi,r14
     14d2d60:	4c 89 f1             	mov    rcx,r14
     14d2d98:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     14d2d9d:	4d 89 7e 60          	mov    QWORD PTR [r14+0x60],r15
     14d2da1:	49 8b 7e 68          	mov    rdi,QWORD PTR [r14+0x68]
     14d2da5:	49 89 6e 68          	mov    QWORD PTR [r14+0x68],rbp
     14d2f30:	49 89 c6             	mov    r14,rax
     14d2f4c:	49 8b be a0 01 00 00 	mov    rdi,QWORD PTR [r14+0x1a0]
     14d2f53:	49 89 86 a0 01 00 00 	mov    QWORD PTR [r14+0x1a0],rax
     14d2f65:	4c 8b 75 20          	mov    r14,QWORD PTR [rbp+0x20]
     14d2f98:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d2faa:	4c 89 f6             	mov    rsi,r14
     14d2fb3:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14d2fc0:	4c 89 f6             	mov    rsi,r14
     14d2fc8:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d2fde:	4c 8b 75 20          	mov    r14,QWORD PTR [rbp+0x20]
     14d3011:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d3023:	4c 89 f6             	mov    rsi,r14
     14d302c:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14d303c:	4c 89 f6             	mov    rsi,r14
     14d3044:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d305a:	4c 8b 75 30          	mov    r14,QWORD PTR [rbp+0x30]
     14d308d:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d3098:	4c 89 f6             	mov    rsi,r14
     14d30a4:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14d30b4:	4c 89 f6             	mov    rsi,r14
     14d30bc:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d310c:	4c 8b 70 48          	mov    r14,QWORD PTR [rax+0x48]
     14d316b:	4c 89 73 48          	mov    QWORD PTR [rbx+0x48],r14
     14d31e5:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     14d31ea:	49 8d be c0 01 00 00 	lea    rdi,[r14+0x1c0]
     14d3211:	41 88 86 b8 01 00 00 	mov    BYTE PTR [r14+0x1b8],al
     14d3222:	49 89 c6             	mov    r14,rax
     14d3235:	49 89 06             	mov    QWORD PTR [r14],rax
     14d323f:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14d3256:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
     14d3265:	4d 89 66 30          	mov    QWORD PTR [r14+0x30],r12
     14d326e:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
     14d328a:	41 0f 11 46 40       	movups XMMWORD PTR [r14+0x40],xmm0
     14d32a2:	41 0f 11 46 50       	movups XMMWORD PTR [r14+0x50],xmm0
     14d32b6:	4d 8d 7e 18          	lea    r15,[r14+0x18]
     14d32c6:	f3 41 0f 7f 46 60    	movdqu XMMWORD PTR [r14+0x60],xmm0
     14d32d6:	4c 89 f7             	mov    rdi,r14
     14d32ed:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
     14d330b:	4d 8b 74 24 48       	mov    r14,QWORD PTR [r12+0x48]
     14d333c:	4c 89 75 20          	mov    QWORD PTR [rbp+0x20],r14
     14d3340:	4c 8d 75 28          	lea    r14,[rbp+0x28]
     14d33e6:	4d 89 fe             	mov    r14,r15
     14d33e9:	49 83 c6 28          	add    r14,0x28
     14d33ed:	4c 89 f7             	mov    rdi,r14
     14d342f:	4c 89 f7             	mov    rdi,r14
     14d351a:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d3522:	49 89 1e             	mov    QWORD PTR [r14],rbx
     14d3525:	4d 89 66 08          	mov    QWORD PTR [r14+0x8],r12
     14d3535:	4c 89 f6             	mov    rsi,r14
     14d353d:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d354b:	4c 8b b0 a8 00 00 00 	mov    r14,QWORD PTR [rax+0xa8]
     14d355d:	4c 89 30             	mov    QWORD PTR [rax],r14
     14d3584:	49 89 de             	mov    r14,rbx
     14d3587:	49 83 c6 30          	add    r14,0x30
     14d358b:	4c 89 f7             	mov    rdi,r14
     14d3635:	4c 89 f7             	mov    rdi,r14
     14d3662:	4c 8d b4 24 30 02 00 	lea    r14,[rsp+0x230]
     14d366a:	49 83 26 00          	and    QWORD PTR [r14],0x0
     14d3676:	4c 89 f7             	mov    rdi,r14
     14d3740:	41 5e                	pop    r14
     14d38e4:	4c 89 f7             	mov    rdi,r14
     14d3913:	4d 8d b5 90 00 00 00 	lea    r14,[r13+0x90]
     14d3931:	4c 89 f7             	mov    rdi,r14
     14d39b2:	4c 8d b3 80 00 00 00 	lea    r14,[rbx+0x80]
     14d39d7:	4c 89 f7             	mov    rdi,r14
     14d3bad:	4c 89 f7             	mov    rdi,r14
     14d3c2c:	4c 89 f7             	mov    rdi,r14
     14d3c9a:	4c 89 f7             	mov    rdi,r14
     14d3cae:	4d 89 fe             	mov    r14,r15
     14d3cb1:	49 83 c6 30          	add    r14,0x30
     14d3d0c:	4c 89 f7             	mov    rdi,r14
     14d3d5c:	4d 8d b4 24 b8 01 00 	lea    r14,[r12+0x1b8]
     14d3d8d:	4c 89 f7             	mov    rdi,r14
     14d3f92:	4d 8d b7 88 00 00 00 	lea    r14,[r15+0x88]
     14d3fc3:	4c 89 f7             	mov    rdi,r14
     14d3fdc:	4d 89 fe             	mov    r14,r15
     14d3fdf:	49 83 c6 38          	add    r14,0x38
     14d3feb:	4c 89 f7             	mov    rdi,r14
     14d422b:	49 89 c6             	mov    r14,rax
     14d423d:	49 89 c6             	mov    r14,rax
     14d42be:	4c 89 f7             	mov    rdi,r14
     14d431f:	4c 89 f7             	mov    rdi,r14
     14d4390:	4c 89 f7             	mov    rdi,r14
     14d4470:	49 89 c6             	mov    r14,rax
     14d44aa:	4c 89 f7             	mov    rdi,r14
     14d451e:	4c 8d b7 e0 00 00 00 	lea    r14,[rdi+0xe0]
     14d4540:	4c 89 f7             	mov    rdi,r14
     14d457b:	4c 8b b4 24 e8 00 00 	mov    r14,QWORD PTR [rsp+0xe8]
     14d4583:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
     14d458c:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
     14d45ab:	4c 89 f7             	mov    rdi,r14
     14d45b3:	4c 89 f7             	mov    rdi,r14
     14d4666:	4c 89 f7             	mov    rdi,r14
     14d46f7:	4c 89 f7             	mov    rdi,r14
     14d47ff:	49 89 c6             	mov    r14,rax
     14d482b:	4d 89 f5             	mov    r13,r14
     14d48ac:	49 89 ee             	mov    r14,rbp
     14d48af:	49 81 c6 d8 01 00 00 	add    r14,0x1d8
     14d48c0:	4c 89 f7             	mov    rdi,r14

## Stores into r14-relative fields
### 0x14cdfc4: mov    BYTE PTR [r14],0x0
     14cdf82:	4c 89 f7             	mov    rdi,r14
     14cdf85:	31 d2                	xor    edx,edx
     14cdf87:	e8 08 c8 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14cdf8c:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
     14cdf90:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     14cdf93:	4c 8d ac 24 a0 03 00 	lea    r13,[rsp+0x3a0]
     14cdf9a:	00 
     14cdf9b:	4c 89 ef             	mov    rdi,r13
     14cdf9e:	4c 89 f2             	mov    rdx,r14
     14cdfa1:	ff 50 10             	call   QWORD PTR [rax+0x10]
     14cdfa4:	4c 89 e7             	mov    rdi,r12
     14cdfa7:	4c 89 ee             	mov    rsi,r13
     14cdfaa:	e8 43 bc 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14cdfaf:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     14cdfb3:	e8 ce 04 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cdfb8:	4c 89 f7             	mov    rdi,r14
     14cdfbb:	e8 28 c8 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14cdfc0:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
     14cdfc4:	41 c6 06 00          	mov    BYTE PTR [r14],0x0
     14cdfc8:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     14cdfcb:	4c 8d 2d 2e a7 f6 fe 	lea    r13,[rip+0xfffffffffef6a72e]        # 438700 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e14f>
     14cdfd2:	48 8d 94 24 e0 02 00 	lea    rdx,[rsp+0x2e0]
     14cdfd9:	00 
     14cdfda:	4c 89 ee             	mov    rsi,r13
     14cdfdd:	e8 7c f7 6b ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>
     14cdfe2:	41 89 c6             	mov    r14d,eax
     14cdfe5:	4c 89 ff             	mov    rdi,r15
     14cdfe8:	4c 89 ee             	mov    rsi,r13
     14cdfeb:	e8 04 85 00 00       	call   14d64f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31ba78>
     14cdff0:	44 88 30             	mov    BYTE PTR [rax],r14b
     14cdff3:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
     14cdff7:	48 8d 94 24 e0 02 00 	lea    rdx,[rsp+0x2e0]
     14cdffe:	00 

### 0x14ce031: mov    QWORD PTR [r14+0xf8],rbp
     14cdfeb:	e8 04 85 00 00       	call   14d64f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31ba78>
     14cdff0:	44 88 30             	mov    BYTE PTR [rax],r14b
     14cdff3:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
     14cdff7:	48 8d 94 24 e0 02 00 	lea    rdx,[rsp+0x2e0]
     14cdffe:	00 
     14cdfff:	c6 02 00             	mov    BYTE PTR [rdx],0x0
     14ce002:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     14ce005:	4c 8d 2d 0c a7 f6 fe 	lea    r13,[rip+0xfffffffffef6a70c]        # 438718 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e167>
     14ce00c:	4c 89 ee             	mov    rsi,r13
     14ce00f:	e8 4a f7 6b ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>
     14ce014:	41 89 c6             	mov    r14d,eax
     14ce017:	4c 89 ff             	mov    rdi,r15
     14ce01a:	4c 89 ee             	mov    rsi,r13
     14ce01d:	e8 d2 84 00 00       	call   14d64f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31ba78>
     14ce022:	44 88 30             	mov    BYTE PTR [rax],r14b
     14ce025:	31 ff                	xor    edi,edi
     14ce027:	e8 f0 03 5d ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14ce02c:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     14ce031:	49 89 ae f8 00 00 00 	mov    QWORD PTR [r14+0xf8],rbp
     14ce038:	49 8b be 00 01 00 00 	mov    rdi,QWORD PTR [r14+0x100]
     14ce03f:	49 89 9e 00 01 00 00 	mov    QWORD PTR [r14+0x100],rbx
     14ce046:	e8 3b 04 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14ce04b:	49 8b 9e f8 00 00 00 	mov    rbx,QWORD PTR [r14+0xf8]
     14ce052:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
     14ce057:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]
     14ce05c:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     14ce05f:	48 8d 35 42 a2 f6 fe 	lea    rsi,[rip+0xfffffffffef6a242]        # 4382a8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5dcf7>
     14ce066:	48 8d 0d 53 a2 f6 fe 	lea    rcx,[rip+0xfffffffffef6a253]        # 4382c0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5dd0f>
     14ce06d:	6a 08                	push   0x8
     14ce06f:	5a                   	pop    rdx
     14ce070:	6a 19                	push   0x19
     14ce072:	41 58                	pop    r8
     14ce074:	6a 01                	push   0x1

### 0x14ce03f: mov    QWORD PTR [r14+0x100],rbx
     14cdff3:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
     14cdff7:	48 8d 94 24 e0 02 00 	lea    rdx,[rsp+0x2e0]
     14cdffe:	00 
     14cdfff:	c6 02 00             	mov    BYTE PTR [rdx],0x0
     14ce002:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     14ce005:	4c 8d 2d 0c a7 f6 fe 	lea    r13,[rip+0xfffffffffef6a70c]        # 438718 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e167>
     14ce00c:	4c 89 ee             	mov    rsi,r13
     14ce00f:	e8 4a f7 6b ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>
     14ce014:	41 89 c6             	mov    r14d,eax
     14ce017:	4c 89 ff             	mov    rdi,r15
     14ce01a:	4c 89 ee             	mov    rsi,r13
     14ce01d:	e8 d2 84 00 00       	call   14d64f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31ba78>
     14ce022:	44 88 30             	mov    BYTE PTR [rax],r14b
     14ce025:	31 ff                	xor    edi,edi
     14ce027:	e8 f0 03 5d ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14ce02c:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     14ce031:	49 89 ae f8 00 00 00 	mov    QWORD PTR [r14+0xf8],rbp
     14ce038:	49 8b be 00 01 00 00 	mov    rdi,QWORD PTR [r14+0x100]
     14ce03f:	49 89 9e 00 01 00 00 	mov    QWORD PTR [r14+0x100],rbx
     14ce046:	e8 3b 04 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14ce04b:	49 8b 9e f8 00 00 00 	mov    rbx,QWORD PTR [r14+0xf8]
     14ce052:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
     14ce057:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]
     14ce05c:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     14ce05f:	48 8d 35 42 a2 f6 fe 	lea    rsi,[rip+0xfffffffffef6a242]        # 4382a8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5dcf7>
     14ce066:	48 8d 0d 53 a2 f6 fe 	lea    rcx,[rip+0xfffffffffef6a253]        # 4382c0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5dd0f>
     14ce06d:	6a 08                	push   0x8
     14ce06f:	5a                   	pop    rdx
     14ce070:	6a 19                	push   0x19
     14ce072:	41 58                	pop    r8
     14ce074:	6a 01                	push   0x1
     14ce076:	41 59                	pop    r9
     14ce078:	e8 0d 93 11 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>

### 0x14ce214: movaps XMMWORD PTR [r14],xmm0
     14ce1c8:	f3 41 0f 7f 07       	movdqu XMMWORD PTR [r15],xmm0
     14ce1cd:	e8 e0 02 5d ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14ce1d2:	48 89 ef             	mov    rdi,rbp
     14ce1d5:	e8 ac 02 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14ce1da:	49 8b 7d 58          	mov    rdi,QWORD PTR [r13+0x58]
     14ce1de:	41 0f 10 45 08       	movups xmm0,XMMWORD PTR [r13+0x8]
     14ce1e3:	49 8b 45 10          	mov    rax,QWORD PTR [r13+0x10]
     14ce1e7:	48 85 c0             	test   rax,rax
     14ce1ea:	74 05                	je     14ce1f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313775>
     14ce1ec:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     14ce1f1:	4c 8d 25 20 3a f8 fe 	lea    r12,[rip+0xfffffffffef83a20]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
     14ce1f8:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14ce1ff:	00 
     14ce200:	4c 89 26             	mov    QWORD PTR [rsi],r12
     14ce203:	4c 89 66 08          	mov    QWORD PTR [rsi+0x8],r12
     14ce207:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     14ce20c:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14ce213:	00 
     14ce214:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
     14ce218:	48 8d 05 05 fd 62 ff 	lea    rax,[rip+0xffffffffff62fd05]        # afdf24 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4aec4>
     14ce21f:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     14ce223:	48 8d 05 f4 9c 03 00 	lea    rax,[rip+0x39cf4]        # 1507f1e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d4a2>
     14ce22a:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14ce22e:	4c 89 f2             	mov    rdx,r14
     14ce231:	e8 52 32 2f 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>
     14ce236:	4c 89 f7             	mov    rdi,r14
     14ce239:	e8 60 90 5d ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
     14ce23e:	31 ff                	xor    edi,edi
     14ce240:	e8 9f 13 61 ff       	call   adf5e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c584>
     14ce245:	31 ff                	xor    edi,edi
     14ce247:	e8 66 02 5d ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14ce24c:	f3 41 0f 6f 07       	movdqu xmm0,XMMWORD PTR [r15]
     14ce251:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]

### 0x14ce21f: mov    QWORD PTR [r14+0x10],rax
     14ce1d2:	48 89 ef             	mov    rdi,rbp
     14ce1d5:	e8 ac 02 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14ce1da:	49 8b 7d 58          	mov    rdi,QWORD PTR [r13+0x58]
     14ce1de:	41 0f 10 45 08       	movups xmm0,XMMWORD PTR [r13+0x8]
     14ce1e3:	49 8b 45 10          	mov    rax,QWORD PTR [r13+0x10]
     14ce1e7:	48 85 c0             	test   rax,rax
     14ce1ea:	74 05                	je     14ce1f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313775>
     14ce1ec:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     14ce1f1:	4c 8d 25 20 3a f8 fe 	lea    r12,[rip+0xfffffffffef83a20]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
     14ce1f8:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14ce1ff:	00 
     14ce200:	4c 89 26             	mov    QWORD PTR [rsi],r12
     14ce203:	4c 89 66 08          	mov    QWORD PTR [rsi+0x8],r12
     14ce207:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     14ce20c:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14ce213:	00 
     14ce214:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
     14ce218:	48 8d 05 05 fd 62 ff 	lea    rax,[rip+0xffffffffff62fd05]        # afdf24 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4aec4>
     14ce21f:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     14ce223:	48 8d 05 f4 9c 03 00 	lea    rax,[rip+0x39cf4]        # 1507f1e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d4a2>
     14ce22a:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14ce22e:	4c 89 f2             	mov    rdx,r14
     14ce231:	e8 52 32 2f 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>
     14ce236:	4c 89 f7             	mov    rdi,r14
     14ce239:	e8 60 90 5d ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
     14ce23e:	31 ff                	xor    edi,edi
     14ce240:	e8 9f 13 61 ff       	call   adf5e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c584>
     14ce245:	31 ff                	xor    edi,edi
     14ce247:	e8 66 02 5d ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14ce24c:	f3 41 0f 6f 07       	movdqu xmm0,XMMWORD PTR [r15]
     14ce251:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
     14ce255:	48 85 c0             	test   rax,rax
     14ce258:	74 05                	je     14ce25f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3137e3>

### 0x14ce22a: mov    QWORD PTR [r14+0x18],rax
     14ce1da:	49 8b 7d 58          	mov    rdi,QWORD PTR [r13+0x58]
     14ce1de:	41 0f 10 45 08       	movups xmm0,XMMWORD PTR [r13+0x8]
     14ce1e3:	49 8b 45 10          	mov    rax,QWORD PTR [r13+0x10]
     14ce1e7:	48 85 c0             	test   rax,rax
     14ce1ea:	74 05                	je     14ce1f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313775>
     14ce1ec:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     14ce1f1:	4c 8d 25 20 3a f8 fe 	lea    r12,[rip+0xfffffffffef83a20]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
     14ce1f8:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14ce1ff:	00 
     14ce200:	4c 89 26             	mov    QWORD PTR [rsi],r12
     14ce203:	4c 89 66 08          	mov    QWORD PTR [rsi+0x8],r12
     14ce207:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     14ce20c:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14ce213:	00 
     14ce214:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
     14ce218:	48 8d 05 05 fd 62 ff 	lea    rax,[rip+0xffffffffff62fd05]        # afdf24 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4aec4>
     14ce21f:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     14ce223:	48 8d 05 f4 9c 03 00 	lea    rax,[rip+0x39cf4]        # 1507f1e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d4a2>
     14ce22a:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14ce22e:	4c 89 f2             	mov    rdx,r14
     14ce231:	e8 52 32 2f 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>
     14ce236:	4c 89 f7             	mov    rdi,r14
     14ce239:	e8 60 90 5d ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
     14ce23e:	31 ff                	xor    edi,edi
     14ce240:	e8 9f 13 61 ff       	call   adf5e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c584>
     14ce245:	31 ff                	xor    edi,edi
     14ce247:	e8 66 02 5d ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14ce24c:	f3 41 0f 6f 07       	movdqu xmm0,XMMWORD PTR [r15]
     14ce251:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
     14ce255:	48 85 c0             	test   rax,rax
     14ce258:	74 05                	je     14ce25f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3137e3>
     14ce25a:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     14ce25f:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]

### 0x14ce27b: movdqa XMMWORD PTR [r14],xmm0
     14ce236:	4c 89 f7             	mov    rdi,r14
     14ce239:	e8 60 90 5d ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
     14ce23e:	31 ff                	xor    edi,edi
     14ce240:	e8 9f 13 61 ff       	call   adf5e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c584>
     14ce245:	31 ff                	xor    edi,edi
     14ce247:	e8 66 02 5d ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14ce24c:	f3 41 0f 6f 07       	movdqu xmm0,XMMWORD PTR [r15]
     14ce251:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
     14ce255:	48 85 c0             	test   rax,rax
     14ce258:	74 05                	je     14ce25f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3137e3>
     14ce25a:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     14ce25f:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14ce266:	00 
     14ce267:	4c 89 26             	mov    QWORD PTR [rsi],r12
     14ce26a:	4c 89 66 08          	mov    QWORD PTR [rsi+0x8],r12
     14ce26e:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     14ce273:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14ce27a:	00 
     14ce27b:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
     14ce280:	48 8d 05 9d fc 62 ff 	lea    rax,[rip+0xffffffffff62fc9d]        # afdf24 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4aec4>
     14ce287:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     14ce28b:	48 8d 05 16 99 03 00 	lea    rax,[rip+0x39916]        # 1507ba8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d12c>
     14ce292:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14ce296:	b9 e8 03 00 00       	mov    ecx,0x3e8
     14ce29b:	48 89 df             	mov    rdi,rbx
     14ce29e:	4c 89 f2             	mov    rdx,r14
     14ce2a1:	e8 de 35 2f 00       	call   17c1884 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1759f0>
     14ce2a6:	4c 89 f7             	mov    rdi,r14
     14ce2a9:	e8 f0 8f 5d ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
     14ce2ae:	31 ff                	xor    edi,edi
     14ce2b0:	e8 2f 13 61 ff       	call   adf5e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c584>
     14ce2b5:	31 ff                	xor    edi,edi
     14ce2b7:	e8 f6 01 5d ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>

### 0x14ce287: mov    QWORD PTR [r14+0x10],rax
     14ce23e:	31 ff                	xor    edi,edi
     14ce240:	e8 9f 13 61 ff       	call   adf5e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c584>
     14ce245:	31 ff                	xor    edi,edi
     14ce247:	e8 66 02 5d ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14ce24c:	f3 41 0f 6f 07       	movdqu xmm0,XMMWORD PTR [r15]
     14ce251:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
     14ce255:	48 85 c0             	test   rax,rax
     14ce258:	74 05                	je     14ce25f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3137e3>
     14ce25a:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     14ce25f:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14ce266:	00 
     14ce267:	4c 89 26             	mov    QWORD PTR [rsi],r12
     14ce26a:	4c 89 66 08          	mov    QWORD PTR [rsi+0x8],r12
     14ce26e:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     14ce273:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14ce27a:	00 
     14ce27b:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
     14ce280:	48 8d 05 9d fc 62 ff 	lea    rax,[rip+0xffffffffff62fc9d]        # afdf24 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4aec4>
     14ce287:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     14ce28b:	48 8d 05 16 99 03 00 	lea    rax,[rip+0x39916]        # 1507ba8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d12c>
     14ce292:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14ce296:	b9 e8 03 00 00       	mov    ecx,0x3e8
     14ce29b:	48 89 df             	mov    rdi,rbx
     14ce29e:	4c 89 f2             	mov    rdx,r14
     14ce2a1:	e8 de 35 2f 00       	call   17c1884 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1759f0>
     14ce2a6:	4c 89 f7             	mov    rdi,r14
     14ce2a9:	e8 f0 8f 5d ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
     14ce2ae:	31 ff                	xor    edi,edi
     14ce2b0:	e8 2f 13 61 ff       	call   adf5e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c584>
     14ce2b5:	31 ff                	xor    edi,edi
     14ce2b7:	e8 f6 01 5d ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14ce2bc:	31 ff                	xor    edi,edi
     14ce2be:	e8 c3 01 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### 0x14ce292: mov    QWORD PTR [r14+0x18],rax
     14ce245:	31 ff                	xor    edi,edi
     14ce247:	e8 66 02 5d ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14ce24c:	f3 41 0f 6f 07       	movdqu xmm0,XMMWORD PTR [r15]
     14ce251:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
     14ce255:	48 85 c0             	test   rax,rax
     14ce258:	74 05                	je     14ce25f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3137e3>
     14ce25a:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     14ce25f:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14ce266:	00 
     14ce267:	4c 89 26             	mov    QWORD PTR [rsi],r12
     14ce26a:	4c 89 66 08          	mov    QWORD PTR [rsi+0x8],r12
     14ce26e:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     14ce273:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14ce27a:	00 
     14ce27b:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
     14ce280:	48 8d 05 9d fc 62 ff 	lea    rax,[rip+0xffffffffff62fc9d]        # afdf24 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4aec4>
     14ce287:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     14ce28b:	48 8d 05 16 99 03 00 	lea    rax,[rip+0x39916]        # 1507ba8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d12c>
     14ce292:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14ce296:	b9 e8 03 00 00       	mov    ecx,0x3e8
     14ce29b:	48 89 df             	mov    rdi,rbx
     14ce29e:	4c 89 f2             	mov    rdx,r14
     14ce2a1:	e8 de 35 2f 00       	call   17c1884 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1759f0>
     14ce2a6:	4c 89 f7             	mov    rdi,r14
     14ce2a9:	e8 f0 8f 5d ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
     14ce2ae:	31 ff                	xor    edi,edi
     14ce2b0:	e8 2f 13 61 ff       	call   adf5e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c584>
     14ce2b5:	31 ff                	xor    edi,edi
     14ce2b7:	e8 f6 01 5d ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14ce2bc:	31 ff                	xor    edi,edi
     14ce2be:	e8 c3 01 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14ce2c3:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
     14ce2c8:	eb 48                	jmp    14ce312 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313896>

### 0x14cead8: movdqa XMMWORD PTR [r14+0x80],xmm0
     14cea7f:	41 c7 85 90 01 00 00 	mov    DWORD PTR [r13+0x190],0x3f800000
     14cea86:	00 00 80 3f 
     14cea8a:	49 8d bd 98 01 00 00 	lea    rdi,[r13+0x198]
     14cea91:	e8 f8 97 65 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     14cea96:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14cea9d:	00 
     14cea9e:	48 89 df             	mov    rdi,rbx
     14ceaa1:	e8 c4 b4 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14ceaa6:	66 49 0f 6e c5       	movq   xmm0,r13
     14ceaab:	66 49 0f 6e cf       	movq   xmm1,r15
     14ceab0:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
     14ceab4:	66 0f 7f 4c 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm1
     14ceaba:	31 ff                	xor    edi,edi
     14ceabc:	e8 5b f9 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14ceac1:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
     14ceac6:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     14ceacb:	49 8b be 88 00 00 00 	mov    rdi,QWORD PTR [r14+0x88]
     14cead2:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]
     14cead8:	66 41 0f 7f 86 80 00 	movdqa XMMWORD PTR [r14+0x80],xmm0
     14ceadf:	00 00 
     14ceae1:	e8 a0 f9 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14ceae6:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
     14ceaeb:	49 8d b6 70 01 00 00 	lea    rsi,[r14+0x170]
     14ceaf2:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
     14ceaf7:	48 8d 05 22 a8 3a 00 	lea    rax,[rip+0x3aa822]        # 1879320 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35a08>
     14ceafe:	48 89 03             	mov    QWORD PTR [rbx],rax
     14ceb01:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
     14ceb05:	4c 89 6b 10          	mov    QWORD PTR [rbx+0x10],r13
     14ceb09:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
     14ceb0e:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx
     14ceb12:	48 89 df             	mov    rdi,rbx
     14ceb15:	e8 50 6a 70 ff       	call   bd556a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12250a>
     14ceb1a:	48 89 df             	mov    rdi,rbx

### 0x14ced44: mov    QWORD PTR [r14],rax
     14cecf1:	88 84 24 d8 00 00 00 	mov    BYTE PTR [rsp+0xd8],al
     14cecf8:	49 8b 77 60          	mov    rsi,QWORD PTR [r15+0x60]
     14cecfc:	4c 89 f7             	mov    rdi,r14
     14cecff:	e8 a2 ab 11 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
     14ced04:	f3 41 0f 6f 07       	movdqu xmm0,XMMWORD PTR [r15]
     14ced09:	66 0f 7f 44 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm0
     14ced0f:	4d 8b 6f 08          	mov    r13,QWORD PTR [r15+0x8]
     14ced13:	4d 85 ed             	test   r13,r13
     14ced16:	74 05                	je     14ced1d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3142a1>
     14ced18:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
     14ced1d:	4d 8b 7c 24 30       	mov    r15,QWORD PTR [r12+0x30]
     14ced22:	4d 8b 64 24 48       	mov    r12,QWORD PTR [r12+0x48]
     14ced27:	bf 60 01 00 00       	mov    edi,0x160
     14ced2c:	e8 cf f1 31 00       	call   17edf00 <_Znwm@plt>
     14ced31:	49 89 c6             	mov    r14,rax
     14ced34:	66 0f ef c0          	pxor   xmm0,xmm0
     14ced38:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14ced3d:	48 8d 05 84 c0 33 00 	lea    rax,[rip+0x33c084]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
     14ced44:	49 89 06             	mov    QWORD PTR [r14],rax
     14ced47:	48 8d 05 1a a6 3a 00 	lea    rax,[rip+0x3aa61a]        # 1879368 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35a50>
     14ced4e:	48 89 84 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],rax
     14ced55:	00 
     14ced56:	0f 28 4c 24 40       	movaps xmm1,XMMWORD PTR [rsp+0x40]
     14ced5b:	0f 11 8c 24 e8 02 00 	movups XMMWORD PTR [rsp+0x2e8],xmm1
     14ced62:	00 
     14ced63:	48 89 9c 24 00 03 00 	mov    QWORD PTR [rsp+0x300],rbx
     14ced6a:	00 
     14ced6b:	f3 41 0f 7f 46 28    	movdqu XMMWORD PTR [r14+0x28],xmm0
     14ced71:	48 8d 05 60 bc 3a 00 	lea    rax,[rip+0x3abc60]        # 187a9d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x370c0>
     14ced78:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
     14ced7c:	66 0f 6f 8c 24 b0 02 	movdqa xmm1,XMMWORD PTR [rsp+0x2b0]
     14ced83:	00 00 
     14ced85:	f3 41 0f 7f 4e 38    	movdqu XMMWORD PTR [r14+0x38],xmm1

### 0x14ced6b: movdqu XMMWORD PTR [r14+0x28],xmm0
     14ced18:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
     14ced1d:	4d 8b 7c 24 30       	mov    r15,QWORD PTR [r12+0x30]
     14ced22:	4d 8b 64 24 48       	mov    r12,QWORD PTR [r12+0x48]
     14ced27:	bf 60 01 00 00       	mov    edi,0x160
     14ced2c:	e8 cf f1 31 00       	call   17edf00 <_Znwm@plt>
     14ced31:	49 89 c6             	mov    r14,rax
     14ced34:	66 0f ef c0          	pxor   xmm0,xmm0
     14ced38:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14ced3d:	48 8d 05 84 c0 33 00 	lea    rax,[rip+0x33c084]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
     14ced44:	49 89 06             	mov    QWORD PTR [r14],rax
     14ced47:	48 8d 05 1a a6 3a 00 	lea    rax,[rip+0x3aa61a]        # 1879368 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35a50>
     14ced4e:	48 89 84 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],rax
     14ced55:	00 
     14ced56:	0f 28 4c 24 40       	movaps xmm1,XMMWORD PTR [rsp+0x40]
     14ced5b:	0f 11 8c 24 e8 02 00 	movups XMMWORD PTR [rsp+0x2e8],xmm1
     14ced62:	00 
     14ced63:	48 89 9c 24 00 03 00 	mov    QWORD PTR [rsp+0x300],rbx
     14ced6a:	00 
     14ced6b:	f3 41 0f 7f 46 28    	movdqu XMMWORD PTR [r14+0x28],xmm0
     14ced71:	48 8d 05 60 bc 3a 00 	lea    rax,[rip+0x3abc60]        # 187a9d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x370c0>
     14ced78:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
     14ced7c:	66 0f 6f 8c 24 b0 02 	movdqa xmm1,XMMWORD PTR [rsp+0x2b0]
     14ced83:	00 00 
     14ced85:	f3 41 0f 7f 4e 38    	movdqu XMMWORD PTR [r14+0x38],xmm1
     14ced8b:	66 0f 7f 84 24 b0 02 	movdqa XMMWORD PTR [rsp+0x2b0],xmm0
     14ced92:	00 00 
     14ced94:	49 8d 5e 48          	lea    rbx,[r14+0x48]
     14ced98:	48 89 df             	mov    rdi,rbx
     14ced9b:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
     14ceda0:	4c 89 b4 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],r14
     14ceda7:	00 
     14ceda8:	e8 93 f1 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14cedad:	4d 8d 6e 60          	lea    r13,[r14+0x60]

### 0x14ced78: mov    QWORD PTR [r14+0x20],rax
     14ced22:	4d 8b 64 24 48       	mov    r12,QWORD PTR [r12+0x48]
     14ced27:	bf 60 01 00 00       	mov    edi,0x160
     14ced2c:	e8 cf f1 31 00       	call   17edf00 <_Znwm@plt>
     14ced31:	49 89 c6             	mov    r14,rax
     14ced34:	66 0f ef c0          	pxor   xmm0,xmm0
     14ced38:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14ced3d:	48 8d 05 84 c0 33 00 	lea    rax,[rip+0x33c084]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
     14ced44:	49 89 06             	mov    QWORD PTR [r14],rax
     14ced47:	48 8d 05 1a a6 3a 00 	lea    rax,[rip+0x3aa61a]        # 1879368 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35a50>
     14ced4e:	48 89 84 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],rax
     14ced55:	00 
     14ced56:	0f 28 4c 24 40       	movaps xmm1,XMMWORD PTR [rsp+0x40]
     14ced5b:	0f 11 8c 24 e8 02 00 	movups XMMWORD PTR [rsp+0x2e8],xmm1
     14ced62:	00 
     14ced63:	48 89 9c 24 00 03 00 	mov    QWORD PTR [rsp+0x300],rbx
     14ced6a:	00 
     14ced6b:	f3 41 0f 7f 46 28    	movdqu XMMWORD PTR [r14+0x28],xmm0
     14ced71:	48 8d 05 60 bc 3a 00 	lea    rax,[rip+0x3abc60]        # 187a9d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x370c0>
     14ced78:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
     14ced7c:	66 0f 6f 8c 24 b0 02 	movdqa xmm1,XMMWORD PTR [rsp+0x2b0]
     14ced83:	00 00 
     14ced85:	f3 41 0f 7f 4e 38    	movdqu XMMWORD PTR [r14+0x38],xmm1
     14ced8b:	66 0f 7f 84 24 b0 02 	movdqa XMMWORD PTR [rsp+0x2b0],xmm0
     14ced92:	00 00 
     14ced94:	49 8d 5e 48          	lea    rbx,[r14+0x48]
     14ced98:	48 89 df             	mov    rdi,rbx
     14ced9b:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
     14ceda0:	4c 89 b4 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],r14
     14ceda7:	00 
     14ceda8:	e8 93 f1 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14cedad:	4d 8d 6e 60          	lea    r13,[r14+0x60]
     14cedb1:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]
     14cedb8:	00 

### 0x14ced85: movdqu XMMWORD PTR [r14+0x38],xmm1
     14ced31:	49 89 c6             	mov    r14,rax
     14ced34:	66 0f ef c0          	pxor   xmm0,xmm0
     14ced38:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14ced3d:	48 8d 05 84 c0 33 00 	lea    rax,[rip+0x33c084]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
     14ced44:	49 89 06             	mov    QWORD PTR [r14],rax
     14ced47:	48 8d 05 1a a6 3a 00 	lea    rax,[rip+0x3aa61a]        # 1879368 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35a50>
     14ced4e:	48 89 84 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],rax
     14ced55:	00 
     14ced56:	0f 28 4c 24 40       	movaps xmm1,XMMWORD PTR [rsp+0x40]
     14ced5b:	0f 11 8c 24 e8 02 00 	movups XMMWORD PTR [rsp+0x2e8],xmm1
     14ced62:	00 
     14ced63:	48 89 9c 24 00 03 00 	mov    QWORD PTR [rsp+0x300],rbx
     14ced6a:	00 
     14ced6b:	f3 41 0f 7f 46 28    	movdqu XMMWORD PTR [r14+0x28],xmm0
     14ced71:	48 8d 05 60 bc 3a 00 	lea    rax,[rip+0x3abc60]        # 187a9d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x370c0>
     14ced78:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
     14ced7c:	66 0f 6f 8c 24 b0 02 	movdqa xmm1,XMMWORD PTR [rsp+0x2b0]
     14ced83:	00 00 
     14ced85:	f3 41 0f 7f 4e 38    	movdqu XMMWORD PTR [r14+0x38],xmm1
     14ced8b:	66 0f 7f 84 24 b0 02 	movdqa XMMWORD PTR [rsp+0x2b0],xmm0
     14ced92:	00 00 
     14ced94:	49 8d 5e 48          	lea    rbx,[r14+0x48]
     14ced98:	48 89 df             	mov    rdi,rbx
     14ced9b:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
     14ceda0:	4c 89 b4 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],r14
     14ceda7:	00 
     14ceda8:	e8 93 f1 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14cedad:	4d 8d 6e 60          	lea    r13,[r14+0x60]
     14cedb1:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]
     14cedb8:	00 
     14cedb9:	4c 89 ef             	mov    rdi,r13
     14cedbc:	e8 cf b4 5a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     14cedc1:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]

### 0x14cedcd: mov    QWORD PTR [r14+0x90],r12
     14ced7c:	66 0f 6f 8c 24 b0 02 	movdqa xmm1,XMMWORD PTR [rsp+0x2b0]
     14ced83:	00 00 
     14ced85:	f3 41 0f 7f 4e 38    	movdqu XMMWORD PTR [r14+0x38],xmm1
     14ced8b:	66 0f 7f 84 24 b0 02 	movdqa XMMWORD PTR [rsp+0x2b0],xmm0
     14ced92:	00 00 
     14ced94:	49 8d 5e 48          	lea    rbx,[r14+0x48]
     14ced98:	48 89 df             	mov    rdi,rbx
     14ced9b:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
     14ceda0:	4c 89 b4 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],r14
     14ceda7:	00 
     14ceda8:	e8 93 f1 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14cedad:	4d 8d 6e 60          	lea    r13,[r14+0x60]
     14cedb1:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]
     14cedb8:	00 
     14cedb9:	4c 89 ef             	mov    rdi,r13
     14cedbc:	e8 cf b4 5a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     14cedc1:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     14cedc6:	48 8d b0 28 01 00 00 	lea    rsi,[rax+0x128]
     14cedcd:	4d 89 a6 90 00 00 00 	mov    QWORD PTR [r14+0x90],r12
     14cedd4:	4d 89 be 98 00 00 00 	mov    QWORD PTR [r14+0x98],r15
     14ceddb:	0f b6 84 24 d8 00 00 	movzx  eax,BYTE PTR [rsp+0xd8]
     14cede2:	00 
     14cede3:	c1 e0 08             	shl    eax,0x8
     14cede6:	40 88 ac 24 30 01 00 	mov    BYTE PTR [rsp+0x130],bpl
     14ceded:	00 
     14cedee:	40 0f b6 cd          	movzx  ecx,bpl
     14cedf2:	09 c1                	or     ecx,eax
     14cedf4:	66 41 89 8e a0 00 00 	mov    WORD PTR [r14+0xa0],cx
     14cedfb:	00 
     14cedfc:	66 0f ef c0          	pxor   xmm0,xmm0
     14cee00:	f3 41 0f 7f 86 a8 00 	movdqu XMMWORD PTR [r14+0xa8],xmm0
     14cee07:	00 00 
     14cee09:	49 8d ae b8 00 00 00 	lea    rbp,[r14+0xb8]

### 0x14cedd4: mov    QWORD PTR [r14+0x98],r15
     14ced83:	00 00 
     14ced85:	f3 41 0f 7f 4e 38    	movdqu XMMWORD PTR [r14+0x38],xmm1
     14ced8b:	66 0f 7f 84 24 b0 02 	movdqa XMMWORD PTR [rsp+0x2b0],xmm0
     14ced92:	00 00 
     14ced94:	49 8d 5e 48          	lea    rbx,[r14+0x48]
     14ced98:	48 89 df             	mov    rdi,rbx
     14ced9b:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
     14ceda0:	4c 89 b4 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],r14
     14ceda7:	00 
     14ceda8:	e8 93 f1 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14cedad:	4d 8d 6e 60          	lea    r13,[r14+0x60]
     14cedb1:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]
     14cedb8:	00 
     14cedb9:	4c 89 ef             	mov    rdi,r13
     14cedbc:	e8 cf b4 5a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     14cedc1:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     14cedc6:	48 8d b0 28 01 00 00 	lea    rsi,[rax+0x128]
     14cedcd:	4d 89 a6 90 00 00 00 	mov    QWORD PTR [r14+0x90],r12
     14cedd4:	4d 89 be 98 00 00 00 	mov    QWORD PTR [r14+0x98],r15
     14ceddb:	0f b6 84 24 d8 00 00 	movzx  eax,BYTE PTR [rsp+0xd8]
     14cede2:	00 
     14cede3:	c1 e0 08             	shl    eax,0x8
     14cede6:	40 88 ac 24 30 01 00 	mov    BYTE PTR [rsp+0x130],bpl
     14ceded:	00 
     14cedee:	40 0f b6 cd          	movzx  ecx,bpl
     14cedf2:	09 c1                	or     ecx,eax
     14cedf4:	66 41 89 8e a0 00 00 	mov    WORD PTR [r14+0xa0],cx
     14cedfb:	00 
     14cedfc:	66 0f ef c0          	pxor   xmm0,xmm0
     14cee00:	f3 41 0f 7f 86 a8 00 	movdqu XMMWORD PTR [r14+0xa8],xmm0
     14cee07:	00 00 
     14cee09:	49 8d ae b8 00 00 00 	lea    rbp,[r14+0xb8]
     14cee10:	48 89 ef             	mov    rdi,rbp

### 0x14cedf4: mov    WORD PTR [r14+0xa0],cx
     14ceda7:	00 
     14ceda8:	e8 93 f1 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14cedad:	4d 8d 6e 60          	lea    r13,[r14+0x60]
     14cedb1:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]
     14cedb8:	00 
     14cedb9:	4c 89 ef             	mov    rdi,r13
     14cedbc:	e8 cf b4 5a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     14cedc1:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     14cedc6:	48 8d b0 28 01 00 00 	lea    rsi,[rax+0x128]
     14cedcd:	4d 89 a6 90 00 00 00 	mov    QWORD PTR [r14+0x90],r12
     14cedd4:	4d 89 be 98 00 00 00 	mov    QWORD PTR [r14+0x98],r15
     14ceddb:	0f b6 84 24 d8 00 00 	movzx  eax,BYTE PTR [rsp+0xd8]
     14cede2:	00 
     14cede3:	c1 e0 08             	shl    eax,0x8
     14cede6:	40 88 ac 24 30 01 00 	mov    BYTE PTR [rsp+0x130],bpl
     14ceded:	00 
     14cedee:	40 0f b6 cd          	movzx  ecx,bpl
     14cedf2:	09 c1                	or     ecx,eax
     14cedf4:	66 41 89 8e a0 00 00 	mov    WORD PTR [r14+0xa0],cx
     14cedfb:	00 
     14cedfc:	66 0f ef c0          	pxor   xmm0,xmm0
     14cee00:	f3 41 0f 7f 86 a8 00 	movdqu XMMWORD PTR [r14+0xa8],xmm0
     14cee07:	00 00 
     14cee09:	49 8d ae b8 00 00 00 	lea    rbp,[r14+0xb8]
     14cee10:	48 89 ef             	mov    rdi,rbp
     14cee13:	48 89 74 24 40       	mov    QWORD PTR [rsp+0x40],rsi
     14cee18:	e8 23 f1 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14cee1d:	66 0f ef c0          	pxor   xmm0,xmm0
     14cee21:	66 41 0f 7f 86 f0 00 	movdqa XMMWORD PTR [r14+0xf0],xmm0
     14cee28:	00 00 
     14cee2a:	66 41 0f 7f 86 e0 00 	movdqa XMMWORD PTR [r14+0xe0],xmm0
     14cee31:	00 00 
     14cee33:	66 41 0f 7f 86 d0 00 	movdqa XMMWORD PTR [r14+0xd0],xmm0

### 0x14cee00: movdqu XMMWORD PTR [r14+0xa8],xmm0
     14cedb1:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]
     14cedb8:	00 
     14cedb9:	4c 89 ef             	mov    rdi,r13
     14cedbc:	e8 cf b4 5a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     14cedc1:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     14cedc6:	48 8d b0 28 01 00 00 	lea    rsi,[rax+0x128]
     14cedcd:	4d 89 a6 90 00 00 00 	mov    QWORD PTR [r14+0x90],r12
     14cedd4:	4d 89 be 98 00 00 00 	mov    QWORD PTR [r14+0x98],r15
     14ceddb:	0f b6 84 24 d8 00 00 	movzx  eax,BYTE PTR [rsp+0xd8]
     14cede2:	00 
     14cede3:	c1 e0 08             	shl    eax,0x8
     14cede6:	40 88 ac 24 30 01 00 	mov    BYTE PTR [rsp+0x130],bpl
     14ceded:	00 
     14cedee:	40 0f b6 cd          	movzx  ecx,bpl
     14cedf2:	09 c1                	or     ecx,eax
     14cedf4:	66 41 89 8e a0 00 00 	mov    WORD PTR [r14+0xa0],cx
     14cedfb:	00 
     14cedfc:	66 0f ef c0          	pxor   xmm0,xmm0
     14cee00:	f3 41 0f 7f 86 a8 00 	movdqu XMMWORD PTR [r14+0xa8],xmm0
     14cee07:	00 00 
     14cee09:	49 8d ae b8 00 00 00 	lea    rbp,[r14+0xb8]
     14cee10:	48 89 ef             	mov    rdi,rbp
     14cee13:	48 89 74 24 40       	mov    QWORD PTR [rsp+0x40],rsi
     14cee18:	e8 23 f1 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14cee1d:	66 0f ef c0          	pxor   xmm0,xmm0
     14cee21:	66 41 0f 7f 86 f0 00 	movdqa XMMWORD PTR [r14+0xf0],xmm0
     14cee28:	00 00 
     14cee2a:	66 41 0f 7f 86 e0 00 	movdqa XMMWORD PTR [r14+0xe0],xmm0
     14cee31:	00 00 
     14cee33:	66 41 0f 7f 86 d0 00 	movdqa XMMWORD PTR [r14+0xd0],xmm0
     14cee3a:	00 00 
     14cee3c:	b8 00 00 80 3f       	mov    eax,0x3f800000
     14cee41:	41 89 86 00 01 00 00 	mov    DWORD PTR [r14+0x100],eax

### 0x14cee21: movdqa XMMWORD PTR [r14+0xf0],xmm0
     14cedd4:	4d 89 be 98 00 00 00 	mov    QWORD PTR [r14+0x98],r15
     14ceddb:	0f b6 84 24 d8 00 00 	movzx  eax,BYTE PTR [rsp+0xd8]
     14cede2:	00 
     14cede3:	c1 e0 08             	shl    eax,0x8
     14cede6:	40 88 ac 24 30 01 00 	mov    BYTE PTR [rsp+0x130],bpl
     14ceded:	00 
     14cedee:	40 0f b6 cd          	movzx  ecx,bpl
     14cedf2:	09 c1                	or     ecx,eax
     14cedf4:	66 41 89 8e a0 00 00 	mov    WORD PTR [r14+0xa0],cx
     14cedfb:	00 
     14cedfc:	66 0f ef c0          	pxor   xmm0,xmm0
     14cee00:	f3 41 0f 7f 86 a8 00 	movdqu XMMWORD PTR [r14+0xa8],xmm0
     14cee07:	00 00 
     14cee09:	49 8d ae b8 00 00 00 	lea    rbp,[r14+0xb8]
     14cee10:	48 89 ef             	mov    rdi,rbp
     14cee13:	48 89 74 24 40       	mov    QWORD PTR [rsp+0x40],rsi
     14cee18:	e8 23 f1 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14cee1d:	66 0f ef c0          	pxor   xmm0,xmm0
     14cee21:	66 41 0f 7f 86 f0 00 	movdqa XMMWORD PTR [r14+0xf0],xmm0
     14cee28:	00 00 
     14cee2a:	66 41 0f 7f 86 e0 00 	movdqa XMMWORD PTR [r14+0xe0],xmm0
     14cee31:	00 00 
     14cee33:	66 41 0f 7f 86 d0 00 	movdqa XMMWORD PTR [r14+0xd0],xmm0
     14cee3a:	00 00 
     14cee3c:	b8 00 00 80 3f       	mov    eax,0x3f800000
     14cee41:	41 89 86 00 01 00 00 	mov    DWORD PTR [r14+0x100],eax
     14cee48:	f3 41 0f 7f 86 08 01 	movdqu XMMWORD PTR [r14+0x108],xmm0
     14cee4f:	00 00 
     14cee51:	f3 41 0f 7f 86 18 01 	movdqu XMMWORD PTR [r14+0x118],xmm0
     14cee58:	00 00 
     14cee5a:	41 89 86 28 01 00 00 	mov    DWORD PTR [r14+0x128],eax
     14cee61:	66 41 0f 7f 86 30 01 	movdqa XMMWORD PTR [r14+0x130],xmm0
     14cee68:	00 00 

### 0x14cee2a: movdqa XMMWORD PTR [r14+0xe0],xmm0
     14cede2:	00 
     14cede3:	c1 e0 08             	shl    eax,0x8
     14cede6:	40 88 ac 24 30 01 00 	mov    BYTE PTR [rsp+0x130],bpl
     14ceded:	00 
     14cedee:	40 0f b6 cd          	movzx  ecx,bpl
     14cedf2:	09 c1                	or     ecx,eax
     14cedf4:	66 41 89 8e a0 00 00 	mov    WORD PTR [r14+0xa0],cx
     14cedfb:	00 
     14cedfc:	66 0f ef c0          	pxor   xmm0,xmm0
     14cee00:	f3 41 0f 7f 86 a8 00 	movdqu XMMWORD PTR [r14+0xa8],xmm0
     14cee07:	00 00 
     14cee09:	49 8d ae b8 00 00 00 	lea    rbp,[r14+0xb8]
     14cee10:	48 89 ef             	mov    rdi,rbp
     14cee13:	48 89 74 24 40       	mov    QWORD PTR [rsp+0x40],rsi
     14cee18:	e8 23 f1 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14cee1d:	66 0f ef c0          	pxor   xmm0,xmm0
     14cee21:	66 41 0f 7f 86 f0 00 	movdqa XMMWORD PTR [r14+0xf0],xmm0
     14cee28:	00 00 
     14cee2a:	66 41 0f 7f 86 e0 00 	movdqa XMMWORD PTR [r14+0xe0],xmm0
     14cee31:	00 00 
     14cee33:	66 41 0f 7f 86 d0 00 	movdqa XMMWORD PTR [r14+0xd0],xmm0
     14cee3a:	00 00 
     14cee3c:	b8 00 00 80 3f       	mov    eax,0x3f800000
     14cee41:	41 89 86 00 01 00 00 	mov    DWORD PTR [r14+0x100],eax
     14cee48:	f3 41 0f 7f 86 08 01 	movdqu XMMWORD PTR [r14+0x108],xmm0
     14cee4f:	00 00 
     14cee51:	f3 41 0f 7f 86 18 01 	movdqu XMMWORD PTR [r14+0x118],xmm0
     14cee58:	00 00 
     14cee5a:	41 89 86 28 01 00 00 	mov    DWORD PTR [r14+0x128],eax
     14cee61:	66 41 0f 7f 86 30 01 	movdqa XMMWORD PTR [r14+0x130],xmm0
     14cee68:	00 00 
     14cee6a:	66 41 0f 7f 86 40 01 	movdqa XMMWORD PTR [r14+0x140],xmm0
     14cee71:	00 00 

### 0x14cee33: movdqa XMMWORD PTR [r14+0xd0],xmm0
     14cede6:	40 88 ac 24 30 01 00 	mov    BYTE PTR [rsp+0x130],bpl
     14ceded:	00 
     14cedee:	40 0f b6 cd          	movzx  ecx,bpl
     14cedf2:	09 c1                	or     ecx,eax
     14cedf4:	66 41 89 8e a0 00 00 	mov    WORD PTR [r14+0xa0],cx
     14cedfb:	00 
     14cedfc:	66 0f ef c0          	pxor   xmm0,xmm0
     14cee00:	f3 41 0f 7f 86 a8 00 	movdqu XMMWORD PTR [r14+0xa8],xmm0
     14cee07:	00 00 
     14cee09:	49 8d ae b8 00 00 00 	lea    rbp,[r14+0xb8]
     14cee10:	48 89 ef             	mov    rdi,rbp
     14cee13:	48 89 74 24 40       	mov    QWORD PTR [rsp+0x40],rsi
     14cee18:	e8 23 f1 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14cee1d:	66 0f ef c0          	pxor   xmm0,xmm0
     14cee21:	66 41 0f 7f 86 f0 00 	movdqa XMMWORD PTR [r14+0xf0],xmm0
     14cee28:	00 00 
     14cee2a:	66 41 0f 7f 86 e0 00 	movdqa XMMWORD PTR [r14+0xe0],xmm0
     14cee31:	00 00 
     14cee33:	66 41 0f 7f 86 d0 00 	movdqa XMMWORD PTR [r14+0xd0],xmm0
     14cee3a:	00 00 
     14cee3c:	b8 00 00 80 3f       	mov    eax,0x3f800000
     14cee41:	41 89 86 00 01 00 00 	mov    DWORD PTR [r14+0x100],eax
     14cee48:	f3 41 0f 7f 86 08 01 	movdqu XMMWORD PTR [r14+0x108],xmm0
     14cee4f:	00 00 
     14cee51:	f3 41 0f 7f 86 18 01 	movdqu XMMWORD PTR [r14+0x118],xmm0
     14cee58:	00 00 
     14cee5a:	41 89 86 28 01 00 00 	mov    DWORD PTR [r14+0x128],eax
     14cee61:	66 41 0f 7f 86 30 01 	movdqa XMMWORD PTR [r14+0x130],xmm0
     14cee68:	00 00 
     14cee6a:	66 41 0f 7f 86 40 01 	movdqa XMMWORD PTR [r14+0x140],xmm0
     14cee71:	00 00 
     14cee73:	41 89 86 50 01 00 00 	mov    DWORD PTR [r14+0x150],eax
     14cee7a:	48 8d 35 9a c9 e9 fe 	lea    rsi,[rip+0xfffffffffee9c99a]        # 36b81b <_ZTSSt12bad_any_cast@@Base-0x249ad>

### 0x14cee41: mov    DWORD PTR [r14+0x100],eax
     14cedf2:	09 c1                	or     ecx,eax
     14cedf4:	66 41 89 8e a0 00 00 	mov    WORD PTR [r14+0xa0],cx
     14cedfb:	00 
     14cedfc:	66 0f ef c0          	pxor   xmm0,xmm0
     14cee00:	f3 41 0f 7f 86 a8 00 	movdqu XMMWORD PTR [r14+0xa8],xmm0
     14cee07:	00 00 
     14cee09:	49 8d ae b8 00 00 00 	lea    rbp,[r14+0xb8]
     14cee10:	48 89 ef             	mov    rdi,rbp
     14cee13:	48 89 74 24 40       	mov    QWORD PTR [rsp+0x40],rsi
     14cee18:	e8 23 f1 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14cee1d:	66 0f ef c0          	pxor   xmm0,xmm0
     14cee21:	66 41 0f 7f 86 f0 00 	movdqa XMMWORD PTR [r14+0xf0],xmm0
     14cee28:	00 00 
     14cee2a:	66 41 0f 7f 86 e0 00 	movdqa XMMWORD PTR [r14+0xe0],xmm0
     14cee31:	00 00 
     14cee33:	66 41 0f 7f 86 d0 00 	movdqa XMMWORD PTR [r14+0xd0],xmm0
     14cee3a:	00 00 
     14cee3c:	b8 00 00 80 3f       	mov    eax,0x3f800000
     14cee41:	41 89 86 00 01 00 00 	mov    DWORD PTR [r14+0x100],eax
     14cee48:	f3 41 0f 7f 86 08 01 	movdqu XMMWORD PTR [r14+0x108],xmm0
     14cee4f:	00 00 
     14cee51:	f3 41 0f 7f 86 18 01 	movdqu XMMWORD PTR [r14+0x118],xmm0
     14cee58:	00 00 
     14cee5a:	41 89 86 28 01 00 00 	mov    DWORD PTR [r14+0x128],eax
     14cee61:	66 41 0f 7f 86 30 01 	movdqa XMMWORD PTR [r14+0x130],xmm0
     14cee68:	00 00 
     14cee6a:	66 41 0f 7f 86 40 01 	movdqa XMMWORD PTR [r14+0x140],xmm0
     14cee71:	00 00 
     14cee73:	41 89 86 50 01 00 00 	mov    DWORD PTR [r14+0x150],eax
     14cee7a:	48 8d 35 9a c9 e9 fe 	lea    rsi,[rip+0xfffffffffee9c99a]        # 36b81b <_ZTSSt12bad_any_cast@@Base-0x249ad>
     14cee81:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14cee88:	00 
     14cee89:	e8 f0 ab 5a ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>

### 0x14cee48: movdqu XMMWORD PTR [r14+0x108],xmm0
     14cedf4:	66 41 89 8e a0 00 00 	mov    WORD PTR [r14+0xa0],cx
     14cedfb:	00 
     14cedfc:	66 0f ef c0          	pxor   xmm0,xmm0
     14cee00:	f3 41 0f 7f 86 a8 00 	movdqu XMMWORD PTR [r14+0xa8],xmm0
     14cee07:	00 00 
     14cee09:	49 8d ae b8 00 00 00 	lea    rbp,[r14+0xb8]
     14cee10:	48 89 ef             	mov    rdi,rbp
     14cee13:	48 89 74 24 40       	mov    QWORD PTR [rsp+0x40],rsi
     14cee18:	e8 23 f1 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14cee1d:	66 0f ef c0          	pxor   xmm0,xmm0
     14cee21:	66 41 0f 7f 86 f0 00 	movdqa XMMWORD PTR [r14+0xf0],xmm0
     14cee28:	00 00 
     14cee2a:	66 41 0f 7f 86 e0 00 	movdqa XMMWORD PTR [r14+0xe0],xmm0
     14cee31:	00 00 
     14cee33:	66 41 0f 7f 86 d0 00 	movdqa XMMWORD PTR [r14+0xd0],xmm0
     14cee3a:	00 00 
     14cee3c:	b8 00 00 80 3f       	mov    eax,0x3f800000
     14cee41:	41 89 86 00 01 00 00 	mov    DWORD PTR [r14+0x100],eax
     14cee48:	f3 41 0f 7f 86 08 01 	movdqu XMMWORD PTR [r14+0x108],xmm0
     14cee4f:	00 00 
     14cee51:	f3 41 0f 7f 86 18 01 	movdqu XMMWORD PTR [r14+0x118],xmm0
     14cee58:	00 00 
     14cee5a:	41 89 86 28 01 00 00 	mov    DWORD PTR [r14+0x128],eax
     14cee61:	66 41 0f 7f 86 30 01 	movdqa XMMWORD PTR [r14+0x130],xmm0
     14cee68:	00 00 
     14cee6a:	66 41 0f 7f 86 40 01 	movdqa XMMWORD PTR [r14+0x140],xmm0
     14cee71:	00 00 
     14cee73:	41 89 86 50 01 00 00 	mov    DWORD PTR [r14+0x150],eax
     14cee7a:	48 8d 35 9a c9 e9 fe 	lea    rsi,[rip+0xfffffffffee9c99a]        # 36b81b <_ZTSSt12bad_any_cast@@Base-0x249ad>
     14cee81:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14cee88:	00 
     14cee89:	e8 f0 ab 5a ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14cee8e:	4d 8d 66 20          	lea    r12,[r14+0x20]

### 0x14cee51: movdqu XMMWORD PTR [r14+0x118],xmm0
     14cedfc:	66 0f ef c0          	pxor   xmm0,xmm0
     14cee00:	f3 41 0f 7f 86 a8 00 	movdqu XMMWORD PTR [r14+0xa8],xmm0
     14cee07:	00 00 
     14cee09:	49 8d ae b8 00 00 00 	lea    rbp,[r14+0xb8]
     14cee10:	48 89 ef             	mov    rdi,rbp
     14cee13:	48 89 74 24 40       	mov    QWORD PTR [rsp+0x40],rsi
     14cee18:	e8 23 f1 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14cee1d:	66 0f ef c0          	pxor   xmm0,xmm0
     14cee21:	66 41 0f 7f 86 f0 00 	movdqa XMMWORD PTR [r14+0xf0],xmm0
     14cee28:	00 00 
     14cee2a:	66 41 0f 7f 86 e0 00 	movdqa XMMWORD PTR [r14+0xe0],xmm0
     14cee31:	00 00 
     14cee33:	66 41 0f 7f 86 d0 00 	movdqa XMMWORD PTR [r14+0xd0],xmm0
     14cee3a:	00 00 
     14cee3c:	b8 00 00 80 3f       	mov    eax,0x3f800000
     14cee41:	41 89 86 00 01 00 00 	mov    DWORD PTR [r14+0x100],eax
     14cee48:	f3 41 0f 7f 86 08 01 	movdqu XMMWORD PTR [r14+0x108],xmm0
     14cee4f:	00 00 
     14cee51:	f3 41 0f 7f 86 18 01 	movdqu XMMWORD PTR [r14+0x118],xmm0
     14cee58:	00 00 
     14cee5a:	41 89 86 28 01 00 00 	mov    DWORD PTR [r14+0x128],eax
     14cee61:	66 41 0f 7f 86 30 01 	movdqa XMMWORD PTR [r14+0x130],xmm0
     14cee68:	00 00 
     14cee6a:	66 41 0f 7f 86 40 01 	movdqa XMMWORD PTR [r14+0x140],xmm0
     14cee71:	00 00 
     14cee73:	41 89 86 50 01 00 00 	mov    DWORD PTR [r14+0x150],eax
     14cee7a:	48 8d 35 9a c9 e9 fe 	lea    rsi,[rip+0xfffffffffee9c99a]        # 36b81b <_ZTSSt12bad_any_cast@@Base-0x249ad>
     14cee81:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14cee88:	00 
     14cee89:	e8 f0 ab 5a ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14cee8e:	4d 8d 66 20          	lea    r12,[r14+0x20]
     14cee92:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     14cee96:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]

### 0x14cee5a: mov    DWORD PTR [r14+0x128],eax
     14cee07:	00 00 
     14cee09:	49 8d ae b8 00 00 00 	lea    rbp,[r14+0xb8]
     14cee10:	48 89 ef             	mov    rdi,rbp
     14cee13:	48 89 74 24 40       	mov    QWORD PTR [rsp+0x40],rsi
     14cee18:	e8 23 f1 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14cee1d:	66 0f ef c0          	pxor   xmm0,xmm0
     14cee21:	66 41 0f 7f 86 f0 00 	movdqa XMMWORD PTR [r14+0xf0],xmm0
     14cee28:	00 00 
     14cee2a:	66 41 0f 7f 86 e0 00 	movdqa XMMWORD PTR [r14+0xe0],xmm0
     14cee31:	00 00 
     14cee33:	66 41 0f 7f 86 d0 00 	movdqa XMMWORD PTR [r14+0xd0],xmm0
     14cee3a:	00 00 
     14cee3c:	b8 00 00 80 3f       	mov    eax,0x3f800000
     14cee41:	41 89 86 00 01 00 00 	mov    DWORD PTR [r14+0x100],eax
     14cee48:	f3 41 0f 7f 86 08 01 	movdqu XMMWORD PTR [r14+0x108],xmm0
     14cee4f:	00 00 
     14cee51:	f3 41 0f 7f 86 18 01 	movdqu XMMWORD PTR [r14+0x118],xmm0
     14cee58:	00 00 
     14cee5a:	41 89 86 28 01 00 00 	mov    DWORD PTR [r14+0x128],eax
     14cee61:	66 41 0f 7f 86 30 01 	movdqa XMMWORD PTR [r14+0x130],xmm0
     14cee68:	00 00 
     14cee6a:	66 41 0f 7f 86 40 01 	movdqa XMMWORD PTR [r14+0x140],xmm0
     14cee71:	00 00 
     14cee73:	41 89 86 50 01 00 00 	mov    DWORD PTR [r14+0x150],eax
     14cee7a:	48 8d 35 9a c9 e9 fe 	lea    rsi,[rip+0xfffffffffee9c99a]        # 36b81b <_ZTSSt12bad_any_cast@@Base-0x249ad>
     14cee81:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14cee88:	00 
     14cee89:	e8 f0 ab 5a ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14cee8e:	4d 8d 66 20          	lea    r12,[r14+0x20]
     14cee92:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     14cee96:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14cee9d:	00 
     14cee9e:	4c 89 e7             	mov    rdi,r12

### 0x14cee61: movdqa XMMWORD PTR [r14+0x130],xmm0
     14cee09:	49 8d ae b8 00 00 00 	lea    rbp,[r14+0xb8]
     14cee10:	48 89 ef             	mov    rdi,rbp
     14cee13:	48 89 74 24 40       	mov    QWORD PTR [rsp+0x40],rsi
     14cee18:	e8 23 f1 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14cee1d:	66 0f ef c0          	pxor   xmm0,xmm0
     14cee21:	66 41 0f 7f 86 f0 00 	movdqa XMMWORD PTR [r14+0xf0],xmm0
     14cee28:	00 00 
     14cee2a:	66 41 0f 7f 86 e0 00 	movdqa XMMWORD PTR [r14+0xe0],xmm0
     14cee31:	00 00 
     14cee33:	66 41 0f 7f 86 d0 00 	movdqa XMMWORD PTR [r14+0xd0],xmm0
     14cee3a:	00 00 
     14cee3c:	b8 00 00 80 3f       	mov    eax,0x3f800000
     14cee41:	41 89 86 00 01 00 00 	mov    DWORD PTR [r14+0x100],eax
     14cee48:	f3 41 0f 7f 86 08 01 	movdqu XMMWORD PTR [r14+0x108],xmm0
     14cee4f:	00 00 
     14cee51:	f3 41 0f 7f 86 18 01 	movdqu XMMWORD PTR [r14+0x118],xmm0
     14cee58:	00 00 
     14cee5a:	41 89 86 28 01 00 00 	mov    DWORD PTR [r14+0x128],eax
     14cee61:	66 41 0f 7f 86 30 01 	movdqa XMMWORD PTR [r14+0x130],xmm0
     14cee68:	00 00 
     14cee6a:	66 41 0f 7f 86 40 01 	movdqa XMMWORD PTR [r14+0x140],xmm0
     14cee71:	00 00 
     14cee73:	41 89 86 50 01 00 00 	mov    DWORD PTR [r14+0x150],eax
     14cee7a:	48 8d 35 9a c9 e9 fe 	lea    rsi,[rip+0xfffffffffee9c99a]        # 36b81b <_ZTSSt12bad_any_cast@@Base-0x249ad>
     14cee81:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14cee88:	00 
     14cee89:	e8 f0 ab 5a ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14cee8e:	4d 8d 66 20          	lea    r12,[r14+0x20]
     14cee92:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     14cee96:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14cee9d:	00 
     14cee9e:	4c 89 e7             	mov    rdi,r12
     14ceea1:	48 8b 54 24 68       	mov    rdx,QWORD PTR [rsp+0x68]

### 0x14cee6a: movdqa XMMWORD PTR [r14+0x140],xmm0
     14cee13:	48 89 74 24 40       	mov    QWORD PTR [rsp+0x40],rsi
     14cee18:	e8 23 f1 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14cee1d:	66 0f ef c0          	pxor   xmm0,xmm0
     14cee21:	66 41 0f 7f 86 f0 00 	movdqa XMMWORD PTR [r14+0xf0],xmm0
     14cee28:	00 00 
     14cee2a:	66 41 0f 7f 86 e0 00 	movdqa XMMWORD PTR [r14+0xe0],xmm0
     14cee31:	00 00 
     14cee33:	66 41 0f 7f 86 d0 00 	movdqa XMMWORD PTR [r14+0xd0],xmm0
     14cee3a:	00 00 
     14cee3c:	b8 00 00 80 3f       	mov    eax,0x3f800000
     14cee41:	41 89 86 00 01 00 00 	mov    DWORD PTR [r14+0x100],eax
     14cee48:	f3 41 0f 7f 86 08 01 	movdqu XMMWORD PTR [r14+0x108],xmm0
     14cee4f:	00 00 
     14cee51:	f3 41 0f 7f 86 18 01 	movdqu XMMWORD PTR [r14+0x118],xmm0
     14cee58:	00 00 
     14cee5a:	41 89 86 28 01 00 00 	mov    DWORD PTR [r14+0x128],eax
     14cee61:	66 41 0f 7f 86 30 01 	movdqa XMMWORD PTR [r14+0x130],xmm0
     14cee68:	00 00 
     14cee6a:	66 41 0f 7f 86 40 01 	movdqa XMMWORD PTR [r14+0x140],xmm0
     14cee71:	00 00 
     14cee73:	41 89 86 50 01 00 00 	mov    DWORD PTR [r14+0x150],eax
     14cee7a:	48 8d 35 9a c9 e9 fe 	lea    rsi,[rip+0xfffffffffee9c99a]        # 36b81b <_ZTSSt12bad_any_cast@@Base-0x249ad>
     14cee81:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14cee88:	00 
     14cee89:	e8 f0 ab 5a ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14cee8e:	4d 8d 66 20          	lea    r12,[r14+0x20]
     14cee92:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     14cee96:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14cee9d:	00 
     14cee9e:	4c 89 e7             	mov    rdi,r12
     14ceea1:	48 8b 54 24 68       	mov    rdx,QWORD PTR [rsp+0x68]
     14ceea6:	ff 50 30             	call   QWORD PTR [rax+0x30]
     14ceea9:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]

### 0x14cee73: mov    DWORD PTR [r14+0x150],eax
     14cee1d:	66 0f ef c0          	pxor   xmm0,xmm0
     14cee21:	66 41 0f 7f 86 f0 00 	movdqa XMMWORD PTR [r14+0xf0],xmm0
     14cee28:	00 00 
     14cee2a:	66 41 0f 7f 86 e0 00 	movdqa XMMWORD PTR [r14+0xe0],xmm0
     14cee31:	00 00 
     14cee33:	66 41 0f 7f 86 d0 00 	movdqa XMMWORD PTR [r14+0xd0],xmm0
     14cee3a:	00 00 
     14cee3c:	b8 00 00 80 3f       	mov    eax,0x3f800000
     14cee41:	41 89 86 00 01 00 00 	mov    DWORD PTR [r14+0x100],eax
     14cee48:	f3 41 0f 7f 86 08 01 	movdqu XMMWORD PTR [r14+0x108],xmm0
     14cee4f:	00 00 
     14cee51:	f3 41 0f 7f 86 18 01 	movdqu XMMWORD PTR [r14+0x118],xmm0
     14cee58:	00 00 
     14cee5a:	41 89 86 28 01 00 00 	mov    DWORD PTR [r14+0x128],eax
     14cee61:	66 41 0f 7f 86 30 01 	movdqa XMMWORD PTR [r14+0x130],xmm0
     14cee68:	00 00 
     14cee6a:	66 41 0f 7f 86 40 01 	movdqa XMMWORD PTR [r14+0x140],xmm0
     14cee71:	00 00 
     14cee73:	41 89 86 50 01 00 00 	mov    DWORD PTR [r14+0x150],eax
     14cee7a:	48 8d 35 9a c9 e9 fe 	lea    rsi,[rip+0xfffffffffee9c99a]        # 36b81b <_ZTSSt12bad_any_cast@@Base-0x249ad>
     14cee81:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14cee88:	00 
     14cee89:	e8 f0 ab 5a ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14cee8e:	4d 8d 66 20          	lea    r12,[r14+0x20]
     14cee92:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     14cee96:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14cee9d:	00 
     14cee9e:	4c 89 e7             	mov    rdi,r12
     14ceea1:	48 8b 54 24 68       	mov    rdx,QWORD PTR [rsp+0x68]
     14ceea6:	ff 50 30             	call   QWORD PTR [rax+0x30]
     14ceea9:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14ceeb0:	00 
     14ceeb1:	e8 da ef 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### 0x14cef1f: mov    QWORD PTR [r14+0x28],r12
     14ceed9:	48 8b 54 24 70       	mov    rdx,QWORD PTR [rsp+0x70]
     14ceede:	ff 50 30             	call   QWORD PTR [rax+0x30]
     14ceee1:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14ceee8:	00 
     14ceee9:	e8 a2 ef 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14ceeee:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14ceef5:	00 
     14ceef6:	e8 6f b0 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14ceefb:	31 ff                	xor    edi,edi
     14ceefd:	e8 84 f5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cef02:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
     14cef06:	48 85 ff             	test   rdi,rdi
     14cef09:	74 0a                	je     14cef15 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314499>
     14cef0b:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     14cef0f:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
     14cef13:	75 1f                	jne    14cef34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3144b8>
     14cef15:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
     14cef1a:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
     14cef1f:	4d 89 66 28          	mov    QWORD PTR [r14+0x28],r12
     14cef23:	4d 89 76 30          	mov    QWORD PTR [r14+0x30],r14
     14cef27:	e8 86 f5 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14cef2c:	4c 89 f7             	mov    rdi,r14
     14cef2f:	e8 52 f5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cef34:	31 ff                	xor    edi,edi
     14cef36:	e8 e1 f4 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14cef3b:	31 ff                	xor    edi,edi
     14cef3d:	e8 44 f5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cef42:	31 ff                	xor    edi,edi
     14cef44:	e8 3d f5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cef49:	31 ff                	xor    edi,edi
     14cef4b:	e8 36 f5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cef50:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     14cef55:	48 8b 98 f8 00 00 00 	mov    rbx,QWORD PTR [rax+0xf8]

### 0x14cef23: mov    QWORD PTR [r14+0x30],r14
     14ceede:	ff 50 30             	call   QWORD PTR [rax+0x30]
     14ceee1:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14ceee8:	00 
     14ceee9:	e8 a2 ef 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14ceeee:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14ceef5:	00 
     14ceef6:	e8 6f b0 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14ceefb:	31 ff                	xor    edi,edi
     14ceefd:	e8 84 f5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cef02:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
     14cef06:	48 85 ff             	test   rdi,rdi
     14cef09:	74 0a                	je     14cef15 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314499>
     14cef0b:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     14cef0f:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
     14cef13:	75 1f                	jne    14cef34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3144b8>
     14cef15:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
     14cef1a:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
     14cef1f:	4d 89 66 28          	mov    QWORD PTR [r14+0x28],r12
     14cef23:	4d 89 76 30          	mov    QWORD PTR [r14+0x30],r14
     14cef27:	e8 86 f5 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14cef2c:	4c 89 f7             	mov    rdi,r14
     14cef2f:	e8 52 f5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cef34:	31 ff                	xor    edi,edi
     14cef36:	e8 e1 f4 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14cef3b:	31 ff                	xor    edi,edi
     14cef3d:	e8 44 f5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cef42:	31 ff                	xor    edi,edi
     14cef44:	e8 3d f5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cef49:	31 ff                	xor    edi,edi
     14cef4b:	e8 36 f5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cef50:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     14cef55:	48 8b 98 f8 00 00 00 	mov    rbx,QWORD PTR [rax+0xf8]
     14cef5c:	4c 8d b8 00 01 00 00 	lea    r15,[rax+0x100]

### 0x14cf55c: and    QWORD PTR [r14+0x8],0x0
     14cf517:	66 0f 6f 84 24 10 01 	movdqa xmm0,XMMWORD PTR [rsp+0x110]
     14cf51e:	00 00 
     14cf520:	66 0f 6c c1          	punpcklqdq xmm0,xmm1
     14cf524:	66 0f 7f 84 24 10 01 	movdqa XMMWORD PTR [rsp+0x110],xmm0
     14cf52b:	00 00 
     14cf52d:	31 ff                	xor    edi,edi
     14cf52f:	e8 e8 ee 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14cf534:	31 ff                	xor    edi,edi
     14cf536:	e8 4b ef 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf53b:	31 ff                	xor    edi,edi
     14cf53d:	e8 44 ef 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf542:	31 ff                	xor    edi,edi
     14cf544:	e9 19 02 00 00       	jmp    14cf762 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314ce6>
     14cf549:	d1 e8                	shr    eax,1
     14cf54b:	48 85 c0             	test   rax,rax
     14cf54e:	0f 84 9d 01 00 00    	je     14cf6f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314c75>
     14cf554:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14cf55b:	00 
     14cf55c:	49 83 66 08 00       	and    QWORD PTR [r14+0x8],0x0
     14cf561:	48 8d 05 28 f6 3a 00 	lea    rax,[rip+0x3af628]        # 187eb90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3b278>
     14cf568:	49 89 06             	mov    QWORD PTR [r14],rax
     14cf56b:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf56f:	f3 41 0f 7f 46 10    	movdqu XMMWORD PTR [r14+0x10],xmm0
     14cf575:	41 c6 46 20 00       	mov    BYTE PTR [r14+0x20],0x0
     14cf57a:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     14cf581:	00 
     14cf582:	e8 af c2 5a ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     14cf587:	4c 89 f7             	mov    rdi,r14
     14cf58a:	48 89 c6             	mov    rsi,rax
     14cf58d:	e8 c0 02 2b 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
     14cf592:	84 c0                	test   al,al
     14cf594:	0f 84 40 01 00 00    	je     14cf6da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314c5e>
     14cf59a:	41 8a 85 b0 01 00 00 	mov    al,BYTE PTR [r13+0x1b0]

### 0x14cf568: mov    QWORD PTR [r14],rax
     14cf520:	66 0f 6c c1          	punpcklqdq xmm0,xmm1
     14cf524:	66 0f 7f 84 24 10 01 	movdqa XMMWORD PTR [rsp+0x110],xmm0
     14cf52b:	00 00 
     14cf52d:	31 ff                	xor    edi,edi
     14cf52f:	e8 e8 ee 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14cf534:	31 ff                	xor    edi,edi
     14cf536:	e8 4b ef 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf53b:	31 ff                	xor    edi,edi
     14cf53d:	e8 44 ef 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf542:	31 ff                	xor    edi,edi
     14cf544:	e9 19 02 00 00       	jmp    14cf762 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314ce6>
     14cf549:	d1 e8                	shr    eax,1
     14cf54b:	48 85 c0             	test   rax,rax
     14cf54e:	0f 84 9d 01 00 00    	je     14cf6f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314c75>
     14cf554:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14cf55b:	00 
     14cf55c:	49 83 66 08 00       	and    QWORD PTR [r14+0x8],0x0
     14cf561:	48 8d 05 28 f6 3a 00 	lea    rax,[rip+0x3af628]        # 187eb90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3b278>
     14cf568:	49 89 06             	mov    QWORD PTR [r14],rax
     14cf56b:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf56f:	f3 41 0f 7f 46 10    	movdqu XMMWORD PTR [r14+0x10],xmm0
     14cf575:	41 c6 46 20 00       	mov    BYTE PTR [r14+0x20],0x0
     14cf57a:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     14cf581:	00 
     14cf582:	e8 af c2 5a ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     14cf587:	4c 89 f7             	mov    rdi,r14
     14cf58a:	48 89 c6             	mov    rsi,rax
     14cf58d:	e8 c0 02 2b 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
     14cf592:	84 c0                	test   al,al
     14cf594:	0f 84 40 01 00 00    	je     14cf6da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314c5e>
     14cf59a:	41 8a 85 b0 01 00 00 	mov    al,BYTE PTR [r13+0x1b0]
     14cf5a1:	3a 84 24 c0 03 00 00 	cmp    al,BYTE PTR [rsp+0x3c0]
     14cf5a8:	0f 85 2c 01 00 00    	jne    14cf6da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314c5e>

### 0x14cf56f: movdqu XMMWORD PTR [r14+0x10],xmm0
     14cf52b:	00 00 
     14cf52d:	31 ff                	xor    edi,edi
     14cf52f:	e8 e8 ee 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14cf534:	31 ff                	xor    edi,edi
     14cf536:	e8 4b ef 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf53b:	31 ff                	xor    edi,edi
     14cf53d:	e8 44 ef 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf542:	31 ff                	xor    edi,edi
     14cf544:	e9 19 02 00 00       	jmp    14cf762 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314ce6>
     14cf549:	d1 e8                	shr    eax,1
     14cf54b:	48 85 c0             	test   rax,rax
     14cf54e:	0f 84 9d 01 00 00    	je     14cf6f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314c75>
     14cf554:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14cf55b:	00 
     14cf55c:	49 83 66 08 00       	and    QWORD PTR [r14+0x8],0x0
     14cf561:	48 8d 05 28 f6 3a 00 	lea    rax,[rip+0x3af628]        # 187eb90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3b278>
     14cf568:	49 89 06             	mov    QWORD PTR [r14],rax
     14cf56b:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf56f:	f3 41 0f 7f 46 10    	movdqu XMMWORD PTR [r14+0x10],xmm0
     14cf575:	41 c6 46 20 00       	mov    BYTE PTR [r14+0x20],0x0
     14cf57a:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     14cf581:	00 
     14cf582:	e8 af c2 5a ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     14cf587:	4c 89 f7             	mov    rdi,r14
     14cf58a:	48 89 c6             	mov    rsi,rax
     14cf58d:	e8 c0 02 2b 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
     14cf592:	84 c0                	test   al,al
     14cf594:	0f 84 40 01 00 00    	je     14cf6da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314c5e>
     14cf59a:	41 8a 85 b0 01 00 00 	mov    al,BYTE PTR [r13+0x1b0]
     14cf5a1:	3a 84 24 c0 03 00 00 	cmp    al,BYTE PTR [rsp+0x3c0]
     14cf5a8:	0f 85 2c 01 00 00    	jne    14cf6da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314c5e>
     14cf5ae:	48 8b 84 24 b8 03 00 	mov    rax,QWORD PTR [rsp+0x3b8]
     14cf5b5:	00 

### 0x14cf575: mov    BYTE PTR [r14+0x20],0x0
     14cf52d:	31 ff                	xor    edi,edi
     14cf52f:	e8 e8 ee 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14cf534:	31 ff                	xor    edi,edi
     14cf536:	e8 4b ef 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf53b:	31 ff                	xor    edi,edi
     14cf53d:	e8 44 ef 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf542:	31 ff                	xor    edi,edi
     14cf544:	e9 19 02 00 00       	jmp    14cf762 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314ce6>
     14cf549:	d1 e8                	shr    eax,1
     14cf54b:	48 85 c0             	test   rax,rax
     14cf54e:	0f 84 9d 01 00 00    	je     14cf6f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314c75>
     14cf554:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14cf55b:	00 
     14cf55c:	49 83 66 08 00       	and    QWORD PTR [r14+0x8],0x0
     14cf561:	48 8d 05 28 f6 3a 00 	lea    rax,[rip+0x3af628]        # 187eb90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3b278>
     14cf568:	49 89 06             	mov    QWORD PTR [r14],rax
     14cf56b:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf56f:	f3 41 0f 7f 46 10    	movdqu XMMWORD PTR [r14+0x10],xmm0
     14cf575:	41 c6 46 20 00       	mov    BYTE PTR [r14+0x20],0x0
     14cf57a:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     14cf581:	00 
     14cf582:	e8 af c2 5a ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     14cf587:	4c 89 f7             	mov    rdi,r14
     14cf58a:	48 89 c6             	mov    rsi,rax
     14cf58d:	e8 c0 02 2b 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
     14cf592:	84 c0                	test   al,al
     14cf594:	0f 84 40 01 00 00    	je     14cf6da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314c5e>
     14cf59a:	41 8a 85 b0 01 00 00 	mov    al,BYTE PTR [r13+0x1b0]
     14cf5a1:	3a 84 24 c0 03 00 00 	cmp    al,BYTE PTR [rsp+0x3c0]
     14cf5a8:	0f 85 2c 01 00 00    	jne    14cf6da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314c5e>
     14cf5ae:	48 8b 84 24 b8 03 00 	mov    rax,QWORD PTR [rsp+0x3b8]
     14cf5b5:	00 
     14cf5b6:	48 85 c0             	test   rax,rax

### 0x14cf696: mov    QWORD PTR [r14],rax
     14cf650:	00 00 
     14cf652:	48 83 a4 24 80 03 00 	and    QWORD PTR [rsp+0x380],0x0
     14cf659:	00 00 
     14cf65b:	48 83 a4 24 90 03 00 	and    QWORD PTR [rsp+0x390],0x0
     14cf662:	00 00 
     14cf664:	6a 30                	push   0x30
     14cf666:	5f                   	pop    rdi
     14cf667:	e8 94 e8 31 00       	call   17edf00 <_Znwm@plt>
     14cf66c:	66 0f 6f 84 24 a0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xa0]
     14cf673:	00 00 
     14cf675:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
     14cf679:	4c 89 78 10          	mov    QWORD PTR [rax+0x10],r15
     14cf67d:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
     14cf682:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
     14cf686:	48 89 68 20          	mov    QWORD PTR [rax+0x20],rbp
     14cf68a:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14
     14cf68e:	4c 8d b4 24 80 03 00 	lea    r14,[rsp+0x380]
     14cf695:	00 
     14cf696:	49 89 06             	mov    QWORD PTR [r14],rax
     14cf699:	48 8d 05 10 ff 60 ff 	lea    rax,[rip+0xffffffffff60ff10]        # adf5b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c550>
     14cf6a0:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     14cf6a4:	48 8d 05 f1 4c 03 00 	lea    rax,[rip+0x34cf1]        # 150439c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x349920>
     14cf6ab:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14cf6af:	48 8d b4 24 10 02 00 	lea    rsi,[rsp+0x210]
     14cf6b6:	00 
     14cf6b7:	48 89 df             	mov    rdi,rbx
     14cf6ba:	4c 89 f2             	mov    rdx,r14
     14cf6bd:	e8 c6 1d 2f 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>
     14cf6c2:	4c 89 f7             	mov    rdi,r14
     14cf6c5:	e8 d4 7b 5d ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
     14cf6ca:	31 ff                	xor    edi,edi
     14cf6cc:	e8 13 ff 60 ff       	call   adf5e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c584>
     14cf6d1:	31 ff                	xor    edi,edi

### 0x14cf6a0: mov    QWORD PTR [r14+0x10],rax
     14cf659:	00 00 
     14cf65b:	48 83 a4 24 90 03 00 	and    QWORD PTR [rsp+0x390],0x0
     14cf662:	00 00 
     14cf664:	6a 30                	push   0x30
     14cf666:	5f                   	pop    rdi
     14cf667:	e8 94 e8 31 00       	call   17edf00 <_Znwm@plt>
     14cf66c:	66 0f 6f 84 24 a0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xa0]
     14cf673:	00 00 
     14cf675:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
     14cf679:	4c 89 78 10          	mov    QWORD PTR [rax+0x10],r15
     14cf67d:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
     14cf682:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
     14cf686:	48 89 68 20          	mov    QWORD PTR [rax+0x20],rbp
     14cf68a:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14
     14cf68e:	4c 8d b4 24 80 03 00 	lea    r14,[rsp+0x380]
     14cf695:	00 
     14cf696:	49 89 06             	mov    QWORD PTR [r14],rax
     14cf699:	48 8d 05 10 ff 60 ff 	lea    rax,[rip+0xffffffffff60ff10]        # adf5b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c550>
     14cf6a0:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     14cf6a4:	48 8d 05 f1 4c 03 00 	lea    rax,[rip+0x34cf1]        # 150439c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x349920>
     14cf6ab:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14cf6af:	48 8d b4 24 10 02 00 	lea    rsi,[rsp+0x210]
     14cf6b6:	00 
     14cf6b7:	48 89 df             	mov    rdi,rbx
     14cf6ba:	4c 89 f2             	mov    rdx,r14
     14cf6bd:	e8 c6 1d 2f 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>
     14cf6c2:	4c 89 f7             	mov    rdi,r14
     14cf6c5:	e8 d4 7b 5d ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
     14cf6ca:	31 ff                	xor    edi,edi
     14cf6cc:	e8 13 ff 60 ff       	call   adf5e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c584>
     14cf6d1:	31 ff                	xor    edi,edi
     14cf6d3:	e8 da ed 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14cf6d8:	eb 0a                	jmp    14cf6e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314c68>

### 0x14cf6ab: mov    QWORD PTR [r14+0x18],rax
     14cf662:	00 00 
     14cf664:	6a 30                	push   0x30
     14cf666:	5f                   	pop    rdi
     14cf667:	e8 94 e8 31 00       	call   17edf00 <_Znwm@plt>
     14cf66c:	66 0f 6f 84 24 a0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xa0]
     14cf673:	00 00 
     14cf675:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
     14cf679:	4c 89 78 10          	mov    QWORD PTR [rax+0x10],r15
     14cf67d:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
     14cf682:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
     14cf686:	48 89 68 20          	mov    QWORD PTR [rax+0x20],rbp
     14cf68a:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14
     14cf68e:	4c 8d b4 24 80 03 00 	lea    r14,[rsp+0x380]
     14cf695:	00 
     14cf696:	49 89 06             	mov    QWORD PTR [r14],rax
     14cf699:	48 8d 05 10 ff 60 ff 	lea    rax,[rip+0xffffffffff60ff10]        # adf5b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c550>
     14cf6a0:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     14cf6a4:	48 8d 05 f1 4c 03 00 	lea    rax,[rip+0x34cf1]        # 150439c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x349920>
     14cf6ab:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14cf6af:	48 8d b4 24 10 02 00 	lea    rsi,[rsp+0x210]
     14cf6b6:	00 
     14cf6b7:	48 89 df             	mov    rdi,rbx
     14cf6ba:	4c 89 f2             	mov    rdx,r14
     14cf6bd:	e8 c6 1d 2f 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>
     14cf6c2:	4c 89 f7             	mov    rdi,r14
     14cf6c5:	e8 d4 7b 5d ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
     14cf6ca:	31 ff                	xor    edi,edi
     14cf6cc:	e8 13 ff 60 ff       	call   adf5e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c584>
     14cf6d1:	31 ff                	xor    edi,edi
     14cf6d3:	e8 da ed 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14cf6d8:	eb 0a                	jmp    14cf6e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314c68>
     14cf6da:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     14cf6df:	e8 3c 59 2f 00       	call   17c5020 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17918c>

### 0x14cf851: mov    QWORD PTR [r14],rax
     14cf801:	48 8d 05 a8 9b 3a 00 	lea    rax,[rip+0x3a9ba8]        # 18793b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35a98>
     14cf808:	48 89 03             	mov    QWORD PTR [rbx],rax
     14cf80b:	48 8d 43 20          	lea    rax,[rbx+0x20]
     14cf80f:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
     14cf814:	f3 0f 7f 43 30       	movdqu XMMWORD PTR [rbx+0x30],xmm0
     14cf819:	f3 0f 7f 43 40       	movdqu XMMWORD PTR [rbx+0x40],xmm0
     14cf81e:	f3 0f 7f 43 50       	movdqu XMMWORD PTR [rbx+0x50],xmm0
     14cf823:	48 83 a3 80 00 00 00 	and    QWORD PTR [rbx+0x80],0x0
     14cf82a:	00 
     14cf82b:	f3 0f 7f 43 60       	movdqu XMMWORD PTR [rbx+0x60],xmm0
     14cf830:	f3 0f 7f 43 70       	movdqu XMMWORD PTR [rbx+0x70],xmm0
     14cf835:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     14cf839:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     14cf83d:	e8 c0 a5 30 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     14cf842:	48 89 d8             	mov    rax,rbx
     14cf845:	48 83 c0 18          	add    rax,0x18
     14cf849:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14cf850:	00 
     14cf851:	49 89 06             	mov    QWORD PTR [r14],rax
     14cf854:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     14cf858:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14cf85d:	48 8d b8 08 01 00 00 	lea    rdi,[rax+0x108]
     14cf864:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
     14cf869:	4c 89 f6             	mov    rsi,r14
     14cf86c:	e8 ab 9f 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14cf871:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14cf875:	e8 0c ec 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf87a:	bf c8 00 00 00       	mov    edi,0xc8
     14cf87f:	e8 7c e6 31 00       	call   17edf00 <_Znwm@plt>
     14cf884:	49 89 c6             	mov    r14,rax
     14cf887:	48 89 c3             	mov    rbx,rax
     14cf88a:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf88e:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0

### 0x14cf854: mov    QWORD PTR [r14+0x8],rbx
     14cf808:	48 89 03             	mov    QWORD PTR [rbx],rax
     14cf80b:	48 8d 43 20          	lea    rax,[rbx+0x20]
     14cf80f:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
     14cf814:	f3 0f 7f 43 30       	movdqu XMMWORD PTR [rbx+0x30],xmm0
     14cf819:	f3 0f 7f 43 40       	movdqu XMMWORD PTR [rbx+0x40],xmm0
     14cf81e:	f3 0f 7f 43 50       	movdqu XMMWORD PTR [rbx+0x50],xmm0
     14cf823:	48 83 a3 80 00 00 00 	and    QWORD PTR [rbx+0x80],0x0
     14cf82a:	00 
     14cf82b:	f3 0f 7f 43 60       	movdqu XMMWORD PTR [rbx+0x60],xmm0
     14cf830:	f3 0f 7f 43 70       	movdqu XMMWORD PTR [rbx+0x70],xmm0
     14cf835:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     14cf839:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     14cf83d:	e8 c0 a5 30 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     14cf842:	48 89 d8             	mov    rax,rbx
     14cf845:	48 83 c0 18          	add    rax,0x18
     14cf849:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14cf850:	00 
     14cf851:	49 89 06             	mov    QWORD PTR [r14],rax
     14cf854:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     14cf858:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14cf85d:	48 8d b8 08 01 00 00 	lea    rdi,[rax+0x108]
     14cf864:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
     14cf869:	4c 89 f6             	mov    rsi,r14
     14cf86c:	e8 ab 9f 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14cf871:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14cf875:	e8 0c ec 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf87a:	bf c8 00 00 00       	mov    edi,0xc8
     14cf87f:	e8 7c e6 31 00       	call   17edf00 <_Znwm@plt>
     14cf884:	49 89 c6             	mov    r14,rax
     14cf887:	48 89 c3             	mov    rbx,rax
     14cf88a:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf88e:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
     14cf894:	48 8d 05 cd db 32 00 	lea    rax,[rip+0x32dbcd]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>

### 0x14cf88e: movdqu XMMWORD PTR [r14+0x8],xmm0
     14cf842:	48 89 d8             	mov    rax,rbx
     14cf845:	48 83 c0 18          	add    rax,0x18
     14cf849:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14cf850:	00 
     14cf851:	49 89 06             	mov    QWORD PTR [r14],rax
     14cf854:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     14cf858:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14cf85d:	48 8d b8 08 01 00 00 	lea    rdi,[rax+0x108]
     14cf864:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
     14cf869:	4c 89 f6             	mov    rsi,r14
     14cf86c:	e8 ab 9f 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14cf871:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14cf875:	e8 0c ec 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf87a:	bf c8 00 00 00       	mov    edi,0xc8
     14cf87f:	e8 7c e6 31 00       	call   17edf00 <_Znwm@plt>
     14cf884:	49 89 c6             	mov    r14,rax
     14cf887:	48 89 c3             	mov    rbx,rax
     14cf88a:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf88e:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
     14cf894:	48 8d 05 cd db 32 00 	lea    rax,[rip+0x32dbcd]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14cf89b:	49 89 06             	mov    QWORD PTR [r14],rax
     14cf89e:	4d 8d 6e 18          	lea    r13,[r14+0x18]
     14cf8a2:	48 8d 05 2f 9d 3a 00 	lea    rax,[rip+0x3a9d2f]        # 18795d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35cc0>
     14cf8a9:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14cf8ad:	f3 41 0f 7f 46 20    	movdqu XMMWORD PTR [r14+0x20],xmm0
     14cf8b3:	f3 41 0f 7f 46 30    	movdqu XMMWORD PTR [r14+0x30],xmm0
     14cf8b9:	41 c7 46 40 00 00 80 	mov    DWORD PTR [r14+0x40],0x3f800000
     14cf8c0:	3f 
     14cf8c1:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     14cf8c6:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     14cf8ca:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
     14cf8ce:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0
     14cf8d4:	48 85 c0             	test   rax,rax

### 0x14cf89b: mov    QWORD PTR [r14],rax
     14cf849:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14cf850:	00 
     14cf851:	49 89 06             	mov    QWORD PTR [r14],rax
     14cf854:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     14cf858:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14cf85d:	48 8d b8 08 01 00 00 	lea    rdi,[rax+0x108]
     14cf864:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
     14cf869:	4c 89 f6             	mov    rsi,r14
     14cf86c:	e8 ab 9f 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14cf871:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14cf875:	e8 0c ec 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf87a:	bf c8 00 00 00       	mov    edi,0xc8
     14cf87f:	e8 7c e6 31 00       	call   17edf00 <_Znwm@plt>
     14cf884:	49 89 c6             	mov    r14,rax
     14cf887:	48 89 c3             	mov    rbx,rax
     14cf88a:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf88e:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
     14cf894:	48 8d 05 cd db 32 00 	lea    rax,[rip+0x32dbcd]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14cf89b:	49 89 06             	mov    QWORD PTR [r14],rax
     14cf89e:	4d 8d 6e 18          	lea    r13,[r14+0x18]
     14cf8a2:	48 8d 05 2f 9d 3a 00 	lea    rax,[rip+0x3a9d2f]        # 18795d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35cc0>
     14cf8a9:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14cf8ad:	f3 41 0f 7f 46 20    	movdqu XMMWORD PTR [r14+0x20],xmm0
     14cf8b3:	f3 41 0f 7f 46 30    	movdqu XMMWORD PTR [r14+0x30],xmm0
     14cf8b9:	41 c7 46 40 00 00 80 	mov    DWORD PTR [r14+0x40],0x3f800000
     14cf8c0:	3f 
     14cf8c1:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     14cf8c6:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     14cf8ca:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
     14cf8ce:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0
     14cf8d4:	48 85 c0             	test   rax,rax
     14cf8d7:	74 05                	je     14cf8de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314e62>
     14cf8d9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]

### 0x14cf8a9: mov    QWORD PTR [r14+0x18],rax
     14cf854:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     14cf858:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14cf85d:	48 8d b8 08 01 00 00 	lea    rdi,[rax+0x108]
     14cf864:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
     14cf869:	4c 89 f6             	mov    rsi,r14
     14cf86c:	e8 ab 9f 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14cf871:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14cf875:	e8 0c ec 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf87a:	bf c8 00 00 00       	mov    edi,0xc8
     14cf87f:	e8 7c e6 31 00       	call   17edf00 <_Znwm@plt>
     14cf884:	49 89 c6             	mov    r14,rax
     14cf887:	48 89 c3             	mov    rbx,rax
     14cf88a:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf88e:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
     14cf894:	48 8d 05 cd db 32 00 	lea    rax,[rip+0x32dbcd]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14cf89b:	49 89 06             	mov    QWORD PTR [r14],rax
     14cf89e:	4d 8d 6e 18          	lea    r13,[r14+0x18]
     14cf8a2:	48 8d 05 2f 9d 3a 00 	lea    rax,[rip+0x3a9d2f]        # 18795d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35cc0>
     14cf8a9:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14cf8ad:	f3 41 0f 7f 46 20    	movdqu XMMWORD PTR [r14+0x20],xmm0
     14cf8b3:	f3 41 0f 7f 46 30    	movdqu XMMWORD PTR [r14+0x30],xmm0
     14cf8b9:	41 c7 46 40 00 00 80 	mov    DWORD PTR [r14+0x40],0x3f800000
     14cf8c0:	3f 
     14cf8c1:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     14cf8c6:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     14cf8ca:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
     14cf8ce:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0
     14cf8d4:	48 85 c0             	test   rax,rax
     14cf8d7:	74 05                	je     14cf8de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314e62>
     14cf8d9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14cf8de:	49 8d 46 20          	lea    rax,[r14+0x20]
     14cf8e2:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     14cf8e7:	49 8d 7e 58          	lea    rdi,[r14+0x58]

### 0x14cf8ad: movdqu XMMWORD PTR [r14+0x20],xmm0
     14cf858:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14cf85d:	48 8d b8 08 01 00 00 	lea    rdi,[rax+0x108]
     14cf864:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
     14cf869:	4c 89 f6             	mov    rsi,r14
     14cf86c:	e8 ab 9f 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14cf871:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14cf875:	e8 0c ec 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf87a:	bf c8 00 00 00       	mov    edi,0xc8
     14cf87f:	e8 7c e6 31 00       	call   17edf00 <_Znwm@plt>
     14cf884:	49 89 c6             	mov    r14,rax
     14cf887:	48 89 c3             	mov    rbx,rax
     14cf88a:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf88e:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
     14cf894:	48 8d 05 cd db 32 00 	lea    rax,[rip+0x32dbcd]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14cf89b:	49 89 06             	mov    QWORD PTR [r14],rax
     14cf89e:	4d 8d 6e 18          	lea    r13,[r14+0x18]
     14cf8a2:	48 8d 05 2f 9d 3a 00 	lea    rax,[rip+0x3a9d2f]        # 18795d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35cc0>
     14cf8a9:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14cf8ad:	f3 41 0f 7f 46 20    	movdqu XMMWORD PTR [r14+0x20],xmm0
     14cf8b3:	f3 41 0f 7f 46 30    	movdqu XMMWORD PTR [r14+0x30],xmm0
     14cf8b9:	41 c7 46 40 00 00 80 	mov    DWORD PTR [r14+0x40],0x3f800000
     14cf8c0:	3f 
     14cf8c1:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     14cf8c6:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     14cf8ca:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
     14cf8ce:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0
     14cf8d4:	48 85 c0             	test   rax,rax
     14cf8d7:	74 05                	je     14cf8de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314e62>
     14cf8d9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14cf8de:	49 8d 46 20          	lea    rax,[r14+0x20]
     14cf8e2:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     14cf8e7:	49 8d 7e 58          	lea    rdi,[r14+0x58]
     14cf8eb:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi

### 0x14cf8b3: movdqu XMMWORD PTR [r14+0x30],xmm0
     14cf85d:	48 8d b8 08 01 00 00 	lea    rdi,[rax+0x108]
     14cf864:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
     14cf869:	4c 89 f6             	mov    rsi,r14
     14cf86c:	e8 ab 9f 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14cf871:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14cf875:	e8 0c ec 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf87a:	bf c8 00 00 00       	mov    edi,0xc8
     14cf87f:	e8 7c e6 31 00       	call   17edf00 <_Znwm@plt>
     14cf884:	49 89 c6             	mov    r14,rax
     14cf887:	48 89 c3             	mov    rbx,rax
     14cf88a:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf88e:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
     14cf894:	48 8d 05 cd db 32 00 	lea    rax,[rip+0x32dbcd]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14cf89b:	49 89 06             	mov    QWORD PTR [r14],rax
     14cf89e:	4d 8d 6e 18          	lea    r13,[r14+0x18]
     14cf8a2:	48 8d 05 2f 9d 3a 00 	lea    rax,[rip+0x3a9d2f]        # 18795d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35cc0>
     14cf8a9:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14cf8ad:	f3 41 0f 7f 46 20    	movdqu XMMWORD PTR [r14+0x20],xmm0
     14cf8b3:	f3 41 0f 7f 46 30    	movdqu XMMWORD PTR [r14+0x30],xmm0
     14cf8b9:	41 c7 46 40 00 00 80 	mov    DWORD PTR [r14+0x40],0x3f800000
     14cf8c0:	3f 
     14cf8c1:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     14cf8c6:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     14cf8ca:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
     14cf8ce:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0
     14cf8d4:	48 85 c0             	test   rax,rax
     14cf8d7:	74 05                	je     14cf8de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314e62>
     14cf8d9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14cf8de:	49 8d 46 20          	lea    rax,[r14+0x20]
     14cf8e2:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     14cf8e7:	49 8d 7e 58          	lea    rdi,[r14+0x58]
     14cf8eb:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
     14cf8f2:	00 

### 0x14cf8b9: mov    DWORD PTR [r14+0x40],0x3f800000
     14cf864:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
     14cf869:	4c 89 f6             	mov    rsi,r14
     14cf86c:	e8 ab 9f 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14cf871:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14cf875:	e8 0c ec 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf87a:	bf c8 00 00 00       	mov    edi,0xc8
     14cf87f:	e8 7c e6 31 00       	call   17edf00 <_Znwm@plt>
     14cf884:	49 89 c6             	mov    r14,rax
     14cf887:	48 89 c3             	mov    rbx,rax
     14cf88a:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf88e:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
     14cf894:	48 8d 05 cd db 32 00 	lea    rax,[rip+0x32dbcd]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14cf89b:	49 89 06             	mov    QWORD PTR [r14],rax
     14cf89e:	4d 8d 6e 18          	lea    r13,[r14+0x18]
     14cf8a2:	48 8d 05 2f 9d 3a 00 	lea    rax,[rip+0x3a9d2f]        # 18795d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35cc0>
     14cf8a9:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14cf8ad:	f3 41 0f 7f 46 20    	movdqu XMMWORD PTR [r14+0x20],xmm0
     14cf8b3:	f3 41 0f 7f 46 30    	movdqu XMMWORD PTR [r14+0x30],xmm0
     14cf8b9:	41 c7 46 40 00 00 80 	mov    DWORD PTR [r14+0x40],0x3f800000
     14cf8c0:	3f 
     14cf8c1:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     14cf8c6:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     14cf8ca:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
     14cf8ce:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0
     14cf8d4:	48 85 c0             	test   rax,rax
     14cf8d7:	74 05                	je     14cf8de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314e62>
     14cf8d9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14cf8de:	49 8d 46 20          	lea    rax,[r14+0x20]
     14cf8e2:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     14cf8e7:	49 8d 7e 58          	lea    rdi,[r14+0x58]
     14cf8eb:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
     14cf8f2:	00 
     14cf8f3:	e8 08 71 00 00       	call   14d6a00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31bf84>

### 0x14cf8ce: movdqu XMMWORD PTR [r14+0x48],xmm0
     14cf87a:	bf c8 00 00 00       	mov    edi,0xc8
     14cf87f:	e8 7c e6 31 00       	call   17edf00 <_Znwm@plt>
     14cf884:	49 89 c6             	mov    r14,rax
     14cf887:	48 89 c3             	mov    rbx,rax
     14cf88a:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf88e:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
     14cf894:	48 8d 05 cd db 32 00 	lea    rax,[rip+0x32dbcd]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14cf89b:	49 89 06             	mov    QWORD PTR [r14],rax
     14cf89e:	4d 8d 6e 18          	lea    r13,[r14+0x18]
     14cf8a2:	48 8d 05 2f 9d 3a 00 	lea    rax,[rip+0x3a9d2f]        # 18795d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35cc0>
     14cf8a9:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14cf8ad:	f3 41 0f 7f 46 20    	movdqu XMMWORD PTR [r14+0x20],xmm0
     14cf8b3:	f3 41 0f 7f 46 30    	movdqu XMMWORD PTR [r14+0x30],xmm0
     14cf8b9:	41 c7 46 40 00 00 80 	mov    DWORD PTR [r14+0x40],0x3f800000
     14cf8c0:	3f 
     14cf8c1:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     14cf8c6:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     14cf8ca:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
     14cf8ce:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0
     14cf8d4:	48 85 c0             	test   rax,rax
     14cf8d7:	74 05                	je     14cf8de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314e62>
     14cf8d9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14cf8de:	49 8d 46 20          	lea    rax,[r14+0x20]
     14cf8e2:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     14cf8e7:	49 8d 7e 58          	lea    rdi,[r14+0x58]
     14cf8eb:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
     14cf8f2:	00 
     14cf8f3:	e8 08 71 00 00       	call   14d6a00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31bf84>
     14cf8f8:	49 81 c6 b0 00 00 00 	add    r14,0xb0
     14cf8ff:	4c 89 f7             	mov    rdi,r14
     14cf902:	e8 ef a0 30 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     14cf907:	c6 83 c0 00 00 00 01 	mov    BYTE PTR [rbx+0xc0],0x1
     14cf90e:	48 8b 6b 48          	mov    rbp,QWORD PTR [rbx+0x48]

### 0x14cf987: mov    QWORD PTR [r14],r13
     14cf941:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     14cf945:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14cf94c:	00 
     14cf94d:	48 89 ee             	mov    rsi,rbp
     14cf950:	4c 89 fa             	mov    rdx,r15
     14cf953:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14cf956:	4c 8d bc 24 a0 03 00 	lea    r15,[rsp+0x3a0]
     14cf95d:	00 
     14cf95e:	4c 89 f7             	mov    rdi,r14
     14cf961:	4c 89 fe             	mov    rsi,r15
     14cf964:	e8 89 a2 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14cf969:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     14cf96d:	e8 14 eb 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf972:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14cf979:	00 
     14cf97a:	e8 69 ae 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14cf97f:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14cf986:	00 
     14cf987:	4d 89 2e             	mov    QWORD PTR [r14],r13
     14cf98a:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     14cf98e:	31 ff                	xor    edi,edi
     14cf990:	e8 87 ea 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14cf995:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     14cf99a:	4c 89 f6             	mov    rsi,r14
     14cf99d:	e8 7a 9e 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14cf9a2:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14cf9a6:	e8 db ea 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf9ab:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     14cf9b0:	4c 8b 70 30          	mov    r14,QWORD PTR [rax+0x30]
     14cf9b4:	bf 90 01 00 00       	mov    edi,0x190
     14cf9b9:	e8 42 e5 31 00       	call   17edf00 <_Znwm@plt>
     14cf9be:	49 89 c7             	mov    r15,rax
     14cf9c1:	66 0f ef c0          	pxor   xmm0,xmm0

### 0x14cf98a: mov    QWORD PTR [r14+0x8],rbx
     14cf945:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14cf94c:	00 
     14cf94d:	48 89 ee             	mov    rsi,rbp
     14cf950:	4c 89 fa             	mov    rdx,r15
     14cf953:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14cf956:	4c 8d bc 24 a0 03 00 	lea    r15,[rsp+0x3a0]
     14cf95d:	00 
     14cf95e:	4c 89 f7             	mov    rdi,r14
     14cf961:	4c 89 fe             	mov    rsi,r15
     14cf964:	e8 89 a2 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14cf969:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     14cf96d:	e8 14 eb 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf972:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14cf979:	00 
     14cf97a:	e8 69 ae 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14cf97f:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14cf986:	00 
     14cf987:	4d 89 2e             	mov    QWORD PTR [r14],r13
     14cf98a:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     14cf98e:	31 ff                	xor    edi,edi
     14cf990:	e8 87 ea 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14cf995:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     14cf99a:	4c 89 f6             	mov    rsi,r14
     14cf99d:	e8 7a 9e 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14cf9a2:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14cf9a6:	e8 db ea 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf9ab:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     14cf9b0:	4c 8b 70 30          	mov    r14,QWORD PTR [rax+0x30]
     14cf9b4:	bf 90 01 00 00       	mov    edi,0x190
     14cf9b9:	e8 42 e5 31 00       	call   17edf00 <_Znwm@plt>
     14cf9be:	49 89 c7             	mov    r15,rax
     14cf9c1:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf9c5:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0

### 0x14cfbc7: movdqu XMMWORD PTR [r14],xmm0
     14cfb7d:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     14cfb81:	4d 89 7d 18          	mov    QWORD PTR [r13+0x18],r15
     14cfb85:	66 49 0f 6e c5       	movq   xmm0,r13
     14cfb8a:	66 49 0f 6e cf       	movq   xmm1,r15
     14cfb8f:	4d 89 fe             	mov    r14,r15
     14cfb92:	49 83 c6 08          	add    r14,0x8
     14cfb96:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
     14cfb9a:	66 0f 7f 4c 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm1
     14cfba0:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     14cfba4:	48 85 c0             	test   rax,rax
     14cfba7:	74 0a                	je     14cfbb3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x315137>
     14cfba9:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     14cfbad:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
     14cfbb1:	75 26                	jne    14cfbd9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31515d>
     14cfbb3:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
     14cfbb8:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]
     14cfbbd:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14cfbc1:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]
     14cfbc7:	f3 41 0f 7f 06       	movdqu XMMWORD PTR [r14],xmm0
     14cfbcc:	e8 e1 e8 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14cfbd1:	4c 89 ef             	mov    rdi,r13
     14cfbd4:	e8 ad e8 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cfbd9:	48 89 ac 24 98 01 00 	mov    QWORD PTR [rsp+0x198],rbp
     14cfbe0:	00 
     14cfbe1:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
     14cfbe5:	f3 41 0f 6f 06       	movdqu xmm0,XMMWORD PTR [r14]
     14cfbea:	66 0f 7f 84 24 a0 03 	movdqa XMMWORD PTR [rsp+0x3a0],xmm0
     14cfbf1:	00 00 
     14cfbf3:	48 85 c0             	test   rax,rax
     14cfbf6:	74 05                	je     14cfbfd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x315181>
     14cfbf8:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     14cfbfd:	4d 8b 77 78          	mov    r14,QWORD PTR [r15+0x78]
     14cfc01:	48 8d 35 c8 df 6b ff 	lea    rsi,[rip+0xffffffffff6bdfc8]        # b8dbd0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdab70>

### 0x14d0491: mov    QWORD PTR [r14+0x18],r12
     14d044d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14d0450:	4c 89 f6             	mov    rsi,r14
     14d0453:	ff 50 10             	call   QWORD PTR [rax+0x10]
     14d0456:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d045d:	00 
     14d045e:	e8 07 9b 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14d0463:	31 ff                	xor    edi,edi
     14d0465:	e8 48 e0 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14d046a:	4c 89 e0             	mov    rax,r12
     14d046d:	4d 8b 64 24 48       	mov    r12,QWORD PTR [r12+0x48]
     14d0472:	4c 8b a8 a0 00 00 00 	mov    r13,QWORD PTR [rax+0xa0]
     14d0479:	6a 28                	push   0x28
     14d047b:	5f                   	pop    rdi
     14d047c:	e8 7f da 31 00       	call   17edf00 <_Znwm@plt>
     14d0481:	49 89 c6             	mov    r14,rax
     14d0484:	48 89 c7             	mov    rdi,rax
     14d0487:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
     14d048c:	e8 af da 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14d0491:	4d 89 66 18          	mov    QWORD PTR [r14+0x18],r12
     14d0495:	4d 89 6e 20          	mov    QWORD PTR [r14+0x20],r13
     14d0499:	4c 89 b4 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],r14
     14d04a0:	00 
     14d04a1:	bf b0 00 00 00       	mov    edi,0xb0
     14d04a6:	e8 55 da 31 00       	call   17edf00 <_Znwm@plt>
     14d04ab:	49 89 c4             	mov    r12,rax
     14d04ae:	66 0f ef c0          	pxor   xmm0,xmm0
     14d04b2:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d04b7:	48 8d 05 aa cf 32 00 	lea    rax,[rip+0x32cfaa]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14d04be:	49 89 04 24          	mov    QWORD PTR [r12],rax
     14d04c2:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d04c7:	66 0f 6f 80 80 00 00 	movdqa xmm0,XMMWORD PTR [rax+0x80]
     14d04ce:	00 
     14d04cf:	48 8b 80 88 00 00 00 	mov    rax,QWORD PTR [rax+0x88]

### 0x14d0495: mov    QWORD PTR [r14+0x20],r13
     14d0450:	4c 89 f6             	mov    rsi,r14
     14d0453:	ff 50 10             	call   QWORD PTR [rax+0x10]
     14d0456:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d045d:	00 
     14d045e:	e8 07 9b 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14d0463:	31 ff                	xor    edi,edi
     14d0465:	e8 48 e0 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14d046a:	4c 89 e0             	mov    rax,r12
     14d046d:	4d 8b 64 24 48       	mov    r12,QWORD PTR [r12+0x48]
     14d0472:	4c 8b a8 a0 00 00 00 	mov    r13,QWORD PTR [rax+0xa0]
     14d0479:	6a 28                	push   0x28
     14d047b:	5f                   	pop    rdi
     14d047c:	e8 7f da 31 00       	call   17edf00 <_Znwm@plt>
     14d0481:	49 89 c6             	mov    r14,rax
     14d0484:	48 89 c7             	mov    rdi,rax
     14d0487:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
     14d048c:	e8 af da 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14d0491:	4d 89 66 18          	mov    QWORD PTR [r14+0x18],r12
     14d0495:	4d 89 6e 20          	mov    QWORD PTR [r14+0x20],r13
     14d0499:	4c 89 b4 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],r14
     14d04a0:	00 
     14d04a1:	bf b0 00 00 00       	mov    edi,0xb0
     14d04a6:	e8 55 da 31 00       	call   17edf00 <_Znwm@plt>
     14d04ab:	49 89 c4             	mov    r12,rax
     14d04ae:	66 0f ef c0          	pxor   xmm0,xmm0
     14d04b2:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d04b7:	48 8d 05 aa cf 32 00 	lea    rax,[rip+0x32cfaa]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14d04be:	49 89 04 24          	mov    QWORD PTR [r12],rax
     14d04c2:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d04c7:	66 0f 6f 80 80 00 00 	movdqa xmm0,XMMWORD PTR [rax+0x80]
     14d04ce:	00 
     14d04cf:	48 8b 80 88 00 00 00 	mov    rax,QWORD PTR [rax+0x88]
     14d04d6:	48 85 c0             	test   rax,rax

### 0x14d0560: mov    QWORD PTR [r14],r15
     14d0511:	66 49 0f 3a 16 c5 01 	pextrq r13,xmm0,0x1
     14d0518:	4d 85 ed             	test   r13,r13
     14d051b:	74 05                	je     14d0522 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x315aa6>
     14d051d:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
     14d0522:	4d 89 7c 24 40       	mov    QWORD PTR [r12+0x40],r15
     14d0527:	49 89 5c 24 48       	mov    QWORD PTR [r12+0x48],rbx
     14d052c:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
     14d0531:	48 83 a4 24 e0 02 00 	and    QWORD PTR [rsp+0x2e0],0x0
     14d0538:	00 00 
     14d053a:	4d 89 74 24 50       	mov    QWORD PTR [r12+0x50],r14
     14d053f:	49 8d 7c 24 58       	lea    rdi,[r12+0x58]
     14d0544:	e8 b9 98 30 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     14d0549:	4d 89 e7             	mov    r15,r12
     14d054c:	49 83 c7 18          	add    r15,0x18
     14d0550:	4c 89 ef             	mov    rdi,r13
     14d0553:	e8 2e df 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0558:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14d055f:	00 
     14d0560:	4d 89 3e             	mov    QWORD PTR [r14],r15
     14d0563:	4d 89 66 08          	mov    QWORD PTR [r14+0x8],r12
     14d0567:	4c 8b 64 24 18       	mov    r12,QWORD PTR [rsp+0x18]
     14d056c:	49 8d 7c 24 20       	lea    rdi,[r12+0x20]
     14d0571:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
     14d0578:	00 
     14d0579:	4c 89 f6             	mov    rsi,r14
     14d057c:	e8 9b 92 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14d0581:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d0585:	e8 fc de 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d058a:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d0591:	00 
     14d0592:	4c 89 f7             	mov    rdi,r14
     14d0595:	e8 68 48 00 00       	call   14d4e02 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a386>
     14d059a:	48 89 df             	mov    rdi,rbx

### 0x14d0563: mov    QWORD PTR [r14+0x8],r12
     14d0518:	4d 85 ed             	test   r13,r13
     14d051b:	74 05                	je     14d0522 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x315aa6>
     14d051d:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
     14d0522:	4d 89 7c 24 40       	mov    QWORD PTR [r12+0x40],r15
     14d0527:	49 89 5c 24 48       	mov    QWORD PTR [r12+0x48],rbx
     14d052c:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
     14d0531:	48 83 a4 24 e0 02 00 	and    QWORD PTR [rsp+0x2e0],0x0
     14d0538:	00 00 
     14d053a:	4d 89 74 24 50       	mov    QWORD PTR [r12+0x50],r14
     14d053f:	49 8d 7c 24 58       	lea    rdi,[r12+0x58]
     14d0544:	e8 b9 98 30 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     14d0549:	4d 89 e7             	mov    r15,r12
     14d054c:	49 83 c7 18          	add    r15,0x18
     14d0550:	4c 89 ef             	mov    rdi,r13
     14d0553:	e8 2e df 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0558:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14d055f:	00 
     14d0560:	4d 89 3e             	mov    QWORD PTR [r14],r15
     14d0563:	4d 89 66 08          	mov    QWORD PTR [r14+0x8],r12
     14d0567:	4c 8b 64 24 18       	mov    r12,QWORD PTR [rsp+0x18]
     14d056c:	49 8d 7c 24 20       	lea    rdi,[r12+0x20]
     14d0571:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
     14d0578:	00 
     14d0579:	4c 89 f6             	mov    rsi,r14
     14d057c:	e8 9b 92 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14d0581:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d0585:	e8 fc de 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d058a:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d0591:	00 
     14d0592:	4c 89 f7             	mov    rdi,r14
     14d0595:	e8 68 48 00 00       	call   14d4e02 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a386>
     14d059a:	48 89 df             	mov    rdi,rbx
     14d059d:	e8 e4 de 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### 0x14d0861: mov    QWORD PTR [r14],rax
     14d0813:	48 8d 05 8e 95 3a 00 	lea    rax,[rip+0x3a958e]        # 1879da8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36490>
     14d081a:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     14d081e:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]
     14d0823:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
     14d0827:	66 41 0f 6f 07       	movdqa xmm0,XMMWORD PTR [r15]
     14d082c:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
     14d0831:	48 85 c0             	test   rax,rax
     14d0834:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]
     14d0839:	74 05                	je     14d0840 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x315dc4>
     14d083b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d0840:	4c 89 73 30          	mov    QWORD PTR [rbx+0x30],r14
     14d0844:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
     14d0848:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
     14d084d:	e8 ee d6 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14d0852:	48 89 d8             	mov    rax,rbx
     14d0855:	48 83 c0 18          	add    rax,0x18
     14d0859:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d0860:	00 
     14d0861:	49 89 06             	mov    QWORD PTR [r14],rax
     14d0864:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     14d0868:	31 ff                	xor    edi,edi
     14d086a:	e8 ad db 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d086f:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d0874:	48 8d 78 40          	lea    rdi,[rax+0x40]
     14d0878:	48 89 bc 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rdi
     14d087f:	00 
     14d0880:	4c 89 f6             	mov    rsi,r14
     14d0883:	e8 94 8f 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14d0888:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d088c:	e8 f5 db 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0891:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     14d0896:	48 8b 58 48          	mov    rbx,QWORD PTR [rax+0x48]
     14d089a:	6a 30                	push   0x30

### 0x14d0864: mov    QWORD PTR [r14+0x8],rbx
     14d081a:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     14d081e:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]
     14d0823:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
     14d0827:	66 41 0f 6f 07       	movdqa xmm0,XMMWORD PTR [r15]
     14d082c:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
     14d0831:	48 85 c0             	test   rax,rax
     14d0834:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]
     14d0839:	74 05                	je     14d0840 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x315dc4>
     14d083b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d0840:	4c 89 73 30          	mov    QWORD PTR [rbx+0x30],r14
     14d0844:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
     14d0848:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
     14d084d:	e8 ee d6 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14d0852:	48 89 d8             	mov    rax,rbx
     14d0855:	48 83 c0 18          	add    rax,0x18
     14d0859:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d0860:	00 
     14d0861:	49 89 06             	mov    QWORD PTR [r14],rax
     14d0864:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     14d0868:	31 ff                	xor    edi,edi
     14d086a:	e8 ad db 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d086f:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d0874:	48 8d 78 40          	lea    rdi,[rax+0x40]
     14d0878:	48 89 bc 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rdi
     14d087f:	00 
     14d0880:	4c 89 f6             	mov    rsi,r14
     14d0883:	e8 94 8f 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14d0888:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d088c:	e8 f5 db 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0891:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     14d0896:	48 8b 58 48          	mov    rbx,QWORD PTR [rax+0x48]
     14d089a:	6a 30                	push   0x30
     14d089c:	5f                   	pop    rdi

### 0x14d0991: and    QWORD PTR [r14],0x0
     14d0944:	4c 89 e9             	mov    rcx,r13
     14d0947:	ff 50 70             	call   QWORD PTR [rax+0x70]
     14d094a:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     14d094f:	4c 89 e6             	mov    rsi,r12
     14d0952:	e8 03 b3 5e ff       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>
     14d0957:	48 8b bc 24 a8 03 00 	mov    rdi,QWORD PTR [rsp+0x3a8]
     14d095e:	00 
     14d095f:	e8 22 db 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0964:	4c 89 ef             	mov    rdi,r13
     14d0967:	e8 7c 9e 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d096c:	48 83 c3 04          	add    rbx,0x4
     14d0970:	48 83 fb 10          	cmp    rbx,0x10
     14d0974:	4c 89 fe             	mov    rsi,r15
     14d0977:	0f 85 7b ff ff ff    	jne    14d08f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x315e7c>
     14d097d:	4c 8b 7c 24 18       	mov    r15,QWORD PTR [rsp+0x18]
     14d0982:	49 8d bf b8 00 00 00 	lea    rdi,[r15+0xb8]
     14d0989:	4c 8d b4 24 80 03 00 	lea    r14,[rsp+0x380]
     14d0990:	00 
     14d0991:	49 83 26 00          	and    QWORD PTR [r14],0x0
     14d0995:	e8 a6 d1 ff ff       	call   14cdb40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3130c4>
     14d099a:	4c 89 f7             	mov    rdi,r14
     14d099d:	e8 40 d1 ff ff       	call   14cdae2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313066>
     14d09a2:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     14d09a7:	4c 8b 70 48          	mov    r14,QWORD PTR [rax+0x48]
     14d09ab:	6a 58                	push   0x58
     14d09ad:	5f                   	pop    rdi
     14d09ae:	e8 4d d5 31 00       	call   17edf00 <_Znwm@plt>
     14d09b3:	48 89 c3             	mov    rbx,rax
     14d09b6:	66 41 0f 6f 87 80 00 	movdqa xmm0,XMMWORD PTR [r15+0x80]
     14d09bd:	00 00 
     14d09bf:	49 8b 97 88 00 00 00 	mov    rdx,QWORD PTR [r15+0x88]
     14d09c6:	48 85 d2             	test   rdx,rdx
     14d09c9:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]

### 0x14d0ad1: mov    QWORD PTR [r14],rbx
     14d0a8e:	48 89 ef             	mov    rdi,rbp
     14d0a91:	4c 89 f6             	mov    rsi,r14
     14d0a94:	44 89 e2             	mov    edx,r12d
     14d0a97:	4c 89 f9             	mov    rcx,r15
     14d0a9a:	ff 50 70             	call   QWORD PTR [rax+0x70]
     14d0a9d:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     14d0aa2:	48 89 ee             	mov    rsi,rbp
     14d0aa5:	e8 b0 b1 5e ff       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>
     14d0aaa:	48 8b bc 24 a8 03 00 	mov    rdi,QWORD PTR [rsp+0x3a8]
     14d0ab1:	00 
     14d0ab2:	e8 cf d9 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0ab7:	4c 89 ff             	mov    rdi,r15
     14d0aba:	e8 29 9d 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d0abf:	49 83 c5 04          	add    r13,0x4
     14d0ac3:	49 83 fd 10          	cmp    r13,0x10
     14d0ac7:	75 87                	jne    14d0a50 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x315fd4>
     14d0ac9:	4c 8d b4 24 80 03 00 	lea    r14,[rsp+0x380]
     14d0ad0:	00 
     14d0ad1:	49 89 1e             	mov    QWORD PTR [r14],rbx
     14d0ad4:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
     14d0adb:	00 
     14d0adc:	e8 a5 d9 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0ae1:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d0ae6:	48 8d b8 c0 00 00 00 	lea    rdi,[rax+0xc0]
     14d0aed:	49 83 26 00          	and    QWORD PTR [r14],0x0
     14d0af1:	48 89 de             	mov    rsi,rbx
     14d0af4:	e8 71 d0 ff ff       	call   14cdb6a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3130ee>
     14d0af9:	4c 89 f7             	mov    rdi,r14
     14d0afc:	e8 d9 cf ff ff       	call   14cdada <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31305e>
     14d0b01:	6a 68                	push   0x68
     14d0b03:	5f                   	pop    rdi
     14d0b04:	e8 f7 d3 31 00       	call   17edf00 <_Znwm@plt>
     14d0b09:	48 89 c5             	mov    rbp,rax

### 0x14d0aed: and    QWORD PTR [r14],0x0
     14d0aa2:	48 89 ee             	mov    rsi,rbp
     14d0aa5:	e8 b0 b1 5e ff       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>
     14d0aaa:	48 8b bc 24 a8 03 00 	mov    rdi,QWORD PTR [rsp+0x3a8]
     14d0ab1:	00 
     14d0ab2:	e8 cf d9 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0ab7:	4c 89 ff             	mov    rdi,r15
     14d0aba:	e8 29 9d 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d0abf:	49 83 c5 04          	add    r13,0x4
     14d0ac3:	49 83 fd 10          	cmp    r13,0x10
     14d0ac7:	75 87                	jne    14d0a50 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x315fd4>
     14d0ac9:	4c 8d b4 24 80 03 00 	lea    r14,[rsp+0x380]
     14d0ad0:	00 
     14d0ad1:	49 89 1e             	mov    QWORD PTR [r14],rbx
     14d0ad4:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
     14d0adb:	00 
     14d0adc:	e8 a5 d9 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0ae1:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d0ae6:	48 8d b8 c0 00 00 00 	lea    rdi,[rax+0xc0]
     14d0aed:	49 83 26 00          	and    QWORD PTR [r14],0x0
     14d0af1:	48 89 de             	mov    rsi,rbx
     14d0af4:	e8 71 d0 ff ff       	call   14cdb6a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3130ee>
     14d0af9:	4c 89 f7             	mov    rdi,r14
     14d0afc:	e8 d9 cf ff ff       	call   14cdada <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31305e>
     14d0b01:	6a 68                	push   0x68
     14d0b03:	5f                   	pop    rdi
     14d0b04:	e8 f7 d3 31 00       	call   17edf00 <_Znwm@plt>
     14d0b09:	48 89 c5             	mov    rbp,rax
     14d0b0c:	49 89 c4             	mov    r12,rax
     14d0b0f:	48 8b 8c 24 a0 00 00 	mov    rcx,QWORD PTR [rsp+0xa0]
     14d0b16:	00 
     14d0b17:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     14d0b1b:	0f 28 01             	movaps xmm0,XMMWORD PTR [rcx]
     14d0b1e:	0f 11 45 00          	movups XMMWORD PTR [rbp+0x0],xmm0

### 0x14d15b4: mov    QWORD PTR [r14+0x150],rax
     14d156c:	48 8b 8e 50 01 00 00 	mov    rcx,QWORD PTR [rsi+0x150]
     14d1573:	48 39 f9             	cmp    rcx,rdi
     14d1576:	74 11                	je     14d1589 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x316b0d>
     14d1578:	48 89 8c 24 00 03 00 	mov    QWORD PTR [rsp+0x300],rcx
     14d157f:	00 
     14d1580:	48 89 86 50 01 00 00 	mov    QWORD PTR [rsi+0x150],rax
     14d1587:	eb 3a                	jmp    14d15c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x316b47>
     14d1589:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14d158c:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14d1593:	00 
     14d1594:	48 89 de             	mov    rsi,rbx
     14d1597:	ff 50 18             	call   QWORD PTR [rax+0x18]
     14d159a:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     14d159f:	49 8b be 50 01 00 00 	mov    rdi,QWORD PTR [r14+0x150]
     14d15a6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14d15a9:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14d15ac:	48 8b 84 24 00 03 00 	mov    rax,QWORD PTR [rsp+0x300]
     14d15b3:	00 
     14d15b4:	49 89 86 50 01 00 00 	mov    QWORD PTR [r14+0x150],rax
     14d15bb:	48 89 9c 24 00 03 00 	mov    QWORD PTR [rsp+0x300],rbx
     14d15c2:	00 
     14d15c3:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d15ca:	00 
     14d15cb:	e8 9a 89 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14d15d0:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d15d7:	00 
     14d15d8:	e8 33 15 62 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
     14d15dd:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14d15e4:	00 
     14d15e5:	4c 89 f7             	mov    rdi,r14
     14d15e8:	e8 23 15 62 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
     14d15ed:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]
     14d15f2:	48 8b 38             	mov    rdi,QWORD PTR [rax]

### 0x14d1c30: mov    QWORD PTR [r14],rax
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

### 0x14d1c33: mov    QWORD PTR [r14+0x8],rbp
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

### 0x14d1c37: mov    QWORD PTR [r14+0x20],r14
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

### 0x14d2d9d: mov    QWORD PTR [r14+0x60],r15
     14d2d55:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14d2d5c:	00 
     14d2d5d:	48 89 de             	mov    rsi,rbx
     14d2d60:	4c 89 f1             	mov    rcx,r14
     14d2d63:	ff 50 48             	call   QWORD PTR [rax+0x48]
     14d2d66:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
     14d2d6d:	00 
     14d2d6e:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
     14d2d73:	48 89 de             	mov    rsi,rbx
     14d2d76:	e8 77 6e 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2d7b:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d2d7f:	e8 02 b7 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2d84:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d2d8b:	00 
     14d2d8c:	e8 57 7a 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2d91:	31 ff                	xor    edi,edi
     14d2d93:	e8 84 b6 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d2d98:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     14d2d9d:	4d 89 7e 60          	mov    QWORD PTR [r14+0x60],r15
     14d2da1:	49 8b 7e 68          	mov    rdi,QWORD PTR [r14+0x68]
     14d2da5:	49 89 6e 68          	mov    QWORD PTR [r14+0x68],rbp
     14d2da9:	e8 d8 b6 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2dae:	80 bc 24 98 00 00 00 	cmp    BYTE PTR [rsp+0x98],0x0
     14d2db5:	00 
     14d2db6:	0f 84 4e 04 00 00    	je     14d320a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31878e>
     14d2dbc:	bf d0 00 00 00       	mov    edi,0xd0
     14d2dc1:	e8 3a b1 31 00       	call   17edf00 <_Znwm@plt>
     14d2dc6:	48 89 c5             	mov    rbp,rax
     14d2dc9:	66 0f ef c0          	pxor   xmm0,xmm0
     14d2dcd:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d2dd2:	48 8d 05 8f a6 32 00 	lea    rax,[rip+0x32a68f]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14d2dd9:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     14d2ddd:	48 8b 84 24 50 01 00 	mov    rax,QWORD PTR [rsp+0x150]

### 0x14d2da5: mov    QWORD PTR [r14+0x68],rbp
     14d2d5d:	48 89 de             	mov    rsi,rbx
     14d2d60:	4c 89 f1             	mov    rcx,r14
     14d2d63:	ff 50 48             	call   QWORD PTR [rax+0x48]
     14d2d66:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
     14d2d6d:	00 
     14d2d6e:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
     14d2d73:	48 89 de             	mov    rsi,rbx
     14d2d76:	e8 77 6e 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2d7b:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d2d7f:	e8 02 b7 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2d84:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d2d8b:	00 
     14d2d8c:	e8 57 7a 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2d91:	31 ff                	xor    edi,edi
     14d2d93:	e8 84 b6 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d2d98:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     14d2d9d:	4d 89 7e 60          	mov    QWORD PTR [r14+0x60],r15
     14d2da1:	49 8b 7e 68          	mov    rdi,QWORD PTR [r14+0x68]
     14d2da5:	49 89 6e 68          	mov    QWORD PTR [r14+0x68],rbp
     14d2da9:	e8 d8 b6 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2dae:	80 bc 24 98 00 00 00 	cmp    BYTE PTR [rsp+0x98],0x0
     14d2db5:	00 
     14d2db6:	0f 84 4e 04 00 00    	je     14d320a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31878e>
     14d2dbc:	bf d0 00 00 00       	mov    edi,0xd0
     14d2dc1:	e8 3a b1 31 00       	call   17edf00 <_Znwm@plt>
     14d2dc6:	48 89 c5             	mov    rbp,rax
     14d2dc9:	66 0f ef c0          	pxor   xmm0,xmm0
     14d2dcd:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d2dd2:	48 8d 05 8f a6 32 00 	lea    rax,[rip+0x32a68f]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14d2dd9:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     14d2ddd:	48 8b 84 24 50 01 00 	mov    rax,QWORD PTR [rsp+0x150]
     14d2de4:	00 
     14d2de5:	66 0f 6f 00          	movdqa xmm0,XMMWORD PTR [rax]

### 0x14d2f53: mov    QWORD PTR [r14+0x1a0],rax
     14d2f0b:	ff 50 40             	call   QWORD PTR [rax+0x40]
     14d2f0e:	48 8b 7d 20          	mov    rdi,QWORD PTR [rbp+0x20]
     14d2f12:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14d2f15:	48 8d 35 ec 61 f6 fe 	lea    rsi,[rip+0xfffffffffef661ec]        # 439108 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb57>
     14d2f1c:	ff 50 40             	call   QWORD PTR [rax+0x40]
     14d2f1f:	48 8b 7d 20          	mov    rdi,QWORD PTR [rbp+0x20]
     14d2f23:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14d2f26:	48 8d 35 c3 61 f6 fe 	lea    rsi,[rip+0xfffffffffef661c3]        # 4390f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb3f>
     14d2f2d:	ff 50 50             	call   QWORD PTR [rax+0x50]
     14d2f30:	49 89 c6             	mov    r14,rax
     14d2f33:	6a 08                	push   0x8
     14d2f35:	5f                   	pop    rdi
     14d2f36:	e8 c5 af 31 00       	call   17edf00 <_Znwm@plt>
     14d2f3b:	48 89 eb             	mov    rbx,rbp
     14d2f3e:	48 83 c3 18          	add    rbx,0x18
     14d2f42:	48 8d 0d 4f 74 3a 00 	lea    rcx,[rip+0x3a744f]        # 187a398 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36a80>
     14d2f49:	48 89 08             	mov    QWORD PTR [rax],rcx
     14d2f4c:	49 8b be a0 01 00 00 	mov    rdi,QWORD PTR [r14+0x1a0]
     14d2f53:	49 89 86 a0 01 00 00 	mov    QWORD PTR [r14+0x1a0],rax
     14d2f5a:	48 85 ff             	test   rdi,rdi
     14d2f5d:	74 06                	je     14d2f65 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3184e9>
     14d2f5f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14d2f62:	ff 50 08             	call   QWORD PTR [rax+0x8]
     14d2f65:	4c 8b 75 20          	mov    r14,QWORD PTR [rbp+0x20]
     14d2f69:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d2f70:	00 
     14d2f71:	49 89 18             	mov    QWORD PTR [r8],rbx
     14d2f74:	48 8d 35 16 a1 5c ff 	lea    rsi,[rip+0xffffffffff5ca116]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d2f7b:	48 8d 0d 32 c0 01 00 	lea    rcx,[rip+0x1c032]        # 14eefb4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x334538>
     14d2f82:	4c 8d bc 24 e0 02 00 	lea    r15,[rsp+0x2e0]
     14d2f89:	00 
     14d2f8a:	6a 08                	push   0x8
     14d2f8c:	41 59                	pop    r9

### 0x14d3211: mov    BYTE PTR [r14+0x1b8],al
     14d31bf:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
     14d31c4:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
     14d31c9:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     14d31cd:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx
     14d31d1:	e8 dc b2 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14d31d6:	48 89 df             	mov    rdi,rbx
     14d31d9:	e8 a8 b2 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d31de:	31 ff                	xor    edi,edi
     14d31e0:	e8 37 b2 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d31e5:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     14d31ea:	49 8d be c0 01 00 00 	lea    rdi,[r14+0x1c0]
     14d31f1:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14d31f8:	00 
     14d31f9:	48 89 de             	mov    rsi,rbx
     14d31fc:	e8 1b 66 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14d3201:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d3205:	e8 7c b2 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d320a:	8a 84 24 98 00 00 00 	mov    al,BYTE PTR [rsp+0x98]
     14d3211:	41 88 86 b8 01 00 00 	mov    BYTE PTR [r14+0x1b8],al
     14d3218:	bf 80 00 00 00       	mov    edi,0x80
     14d321d:	e8 de ac 31 00       	call   17edf00 <_Znwm@plt>
     14d3222:	49 89 c6             	mov    r14,rax
     14d3225:	66 0f ef c0          	pxor   xmm0,xmm0
     14d3229:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d322e:	48 8d 05 33 a2 32 00 	lea    rax,[rip+0x32a233]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14d3235:	49 89 06             	mov    QWORD PTR [r14],rax
     14d3238:	48 8d 05 79 66 3a 00 	lea    rax,[rip+0x3a6679]        # 18798b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35fa0>
     14d323f:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14d3243:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     14d3248:	48 8b 81 98 00 00 00 	mov    rax,QWORD PTR [rcx+0x98]
     14d324f:	0f 10 81 90 00 00 00 	movups xmm0,XMMWORD PTR [rcx+0x90]
     14d3256:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
     14d325b:	48 85 c0             	test   rax,rax

### 0x14d3235: mov    QWORD PTR [r14],rax
     14d31de:	31 ff                	xor    edi,edi
     14d31e0:	e8 37 b2 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d31e5:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     14d31ea:	49 8d be c0 01 00 00 	lea    rdi,[r14+0x1c0]
     14d31f1:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14d31f8:	00 
     14d31f9:	48 89 de             	mov    rsi,rbx
     14d31fc:	e8 1b 66 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14d3201:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d3205:	e8 7c b2 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d320a:	8a 84 24 98 00 00 00 	mov    al,BYTE PTR [rsp+0x98]
     14d3211:	41 88 86 b8 01 00 00 	mov    BYTE PTR [r14+0x1b8],al
     14d3218:	bf 80 00 00 00       	mov    edi,0x80
     14d321d:	e8 de ac 31 00       	call   17edf00 <_Znwm@plt>
     14d3222:	49 89 c6             	mov    r14,rax
     14d3225:	66 0f ef c0          	pxor   xmm0,xmm0
     14d3229:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d322e:	48 8d 05 33 a2 32 00 	lea    rax,[rip+0x32a233]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14d3235:	49 89 06             	mov    QWORD PTR [r14],rax
     14d3238:	48 8d 05 79 66 3a 00 	lea    rax,[rip+0x3a6679]        # 18798b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35fa0>
     14d323f:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14d3243:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     14d3248:	48 8b 81 98 00 00 00 	mov    rax,QWORD PTR [rcx+0x98]
     14d324f:	0f 10 81 90 00 00 00 	movups xmm0,XMMWORD PTR [rcx+0x90]
     14d3256:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
     14d325b:	48 85 c0             	test   rax,rax
     14d325e:	74 05                	je     14d3265 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3187e9>
     14d3260:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d3265:	4d 89 66 30          	mov    QWORD PTR [r14+0x30],r12
     14d3269:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
     14d326e:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
     14d3272:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d3277:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]

### 0x14d323f: mov    QWORD PTR [r14+0x18],rax
     14d31e5:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     14d31ea:	49 8d be c0 01 00 00 	lea    rdi,[r14+0x1c0]
     14d31f1:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14d31f8:	00 
     14d31f9:	48 89 de             	mov    rsi,rbx
     14d31fc:	e8 1b 66 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14d3201:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d3205:	e8 7c b2 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d320a:	8a 84 24 98 00 00 00 	mov    al,BYTE PTR [rsp+0x98]
     14d3211:	41 88 86 b8 01 00 00 	mov    BYTE PTR [r14+0x1b8],al
     14d3218:	bf 80 00 00 00       	mov    edi,0x80
     14d321d:	e8 de ac 31 00       	call   17edf00 <_Znwm@plt>
     14d3222:	49 89 c6             	mov    r14,rax
     14d3225:	66 0f ef c0          	pxor   xmm0,xmm0
     14d3229:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d322e:	48 8d 05 33 a2 32 00 	lea    rax,[rip+0x32a233]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14d3235:	49 89 06             	mov    QWORD PTR [r14],rax
     14d3238:	48 8d 05 79 66 3a 00 	lea    rax,[rip+0x3a6679]        # 18798b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35fa0>
     14d323f:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14d3243:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     14d3248:	48 8b 81 98 00 00 00 	mov    rax,QWORD PTR [rcx+0x98]
     14d324f:	0f 10 81 90 00 00 00 	movups xmm0,XMMWORD PTR [rcx+0x90]
     14d3256:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
     14d325b:	48 85 c0             	test   rax,rax
     14d325e:	74 05                	je     14d3265 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3187e9>
     14d3260:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d3265:	4d 89 66 30          	mov    QWORD PTR [r14+0x30],r12
     14d3269:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
     14d326e:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
     14d3272:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d3277:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14d327c:	48 8b 81 88 00 00 00 	mov    rax,QWORD PTR [rcx+0x88]
     14d3283:	0f 28 81 80 00 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x80]

### 0x14d3256: movups XMMWORD PTR [r14+0x20],xmm0
     14d31f9:	48 89 de             	mov    rsi,rbx
     14d31fc:	e8 1b 66 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14d3201:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d3205:	e8 7c b2 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d320a:	8a 84 24 98 00 00 00 	mov    al,BYTE PTR [rsp+0x98]
     14d3211:	41 88 86 b8 01 00 00 	mov    BYTE PTR [r14+0x1b8],al
     14d3218:	bf 80 00 00 00       	mov    edi,0x80
     14d321d:	e8 de ac 31 00       	call   17edf00 <_Znwm@plt>
     14d3222:	49 89 c6             	mov    r14,rax
     14d3225:	66 0f ef c0          	pxor   xmm0,xmm0
     14d3229:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d322e:	48 8d 05 33 a2 32 00 	lea    rax,[rip+0x32a233]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14d3235:	49 89 06             	mov    QWORD PTR [r14],rax
     14d3238:	48 8d 05 79 66 3a 00 	lea    rax,[rip+0x3a6679]        # 18798b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35fa0>
     14d323f:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14d3243:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     14d3248:	48 8b 81 98 00 00 00 	mov    rax,QWORD PTR [rcx+0x98]
     14d324f:	0f 10 81 90 00 00 00 	movups xmm0,XMMWORD PTR [rcx+0x90]
     14d3256:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
     14d325b:	48 85 c0             	test   rax,rax
     14d325e:	74 05                	je     14d3265 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3187e9>
     14d3260:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d3265:	4d 89 66 30          	mov    QWORD PTR [r14+0x30],r12
     14d3269:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
     14d326e:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
     14d3272:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d3277:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14d327c:	48 8b 81 88 00 00 00 	mov    rax,QWORD PTR [rcx+0x88]
     14d3283:	0f 28 81 80 00 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x80]
     14d328a:	41 0f 11 46 40       	movups XMMWORD PTR [r14+0x40],xmm0
     14d328f:	48 85 c0             	test   rax,rax
     14d3292:	74 05                	je     14d3299 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31881d>
     14d3294:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]

### 0x14d3265: mov    QWORD PTR [r14+0x30],r12
     14d320a:	8a 84 24 98 00 00 00 	mov    al,BYTE PTR [rsp+0x98]
     14d3211:	41 88 86 b8 01 00 00 	mov    BYTE PTR [r14+0x1b8],al
     14d3218:	bf 80 00 00 00       	mov    edi,0x80
     14d321d:	e8 de ac 31 00       	call   17edf00 <_Znwm@plt>
     14d3222:	49 89 c6             	mov    r14,rax
     14d3225:	66 0f ef c0          	pxor   xmm0,xmm0
     14d3229:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d322e:	48 8d 05 33 a2 32 00 	lea    rax,[rip+0x32a233]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14d3235:	49 89 06             	mov    QWORD PTR [r14],rax
     14d3238:	48 8d 05 79 66 3a 00 	lea    rax,[rip+0x3a6679]        # 18798b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35fa0>
     14d323f:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14d3243:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     14d3248:	48 8b 81 98 00 00 00 	mov    rax,QWORD PTR [rcx+0x98]
     14d324f:	0f 10 81 90 00 00 00 	movups xmm0,XMMWORD PTR [rcx+0x90]
     14d3256:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
     14d325b:	48 85 c0             	test   rax,rax
     14d325e:	74 05                	je     14d3265 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3187e9>
     14d3260:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d3265:	4d 89 66 30          	mov    QWORD PTR [r14+0x30],r12
     14d3269:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
     14d326e:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
     14d3272:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d3277:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14d327c:	48 8b 81 88 00 00 00 	mov    rax,QWORD PTR [rcx+0x88]
     14d3283:	0f 28 81 80 00 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x80]
     14d328a:	41 0f 11 46 40       	movups XMMWORD PTR [r14+0x40],xmm0
     14d328f:	48 85 c0             	test   rax,rax
     14d3292:	74 05                	je     14d3299 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31881d>
     14d3294:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d3299:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
     14d329d:	41 0f 28 45 00       	movaps xmm0,XMMWORD PTR [r13+0x0]
     14d32a2:	41 0f 11 46 50       	movups XMMWORD PTR [r14+0x50],xmm0
     14d32a7:	48 85 c0             	test   rax,rax

### 0x14d326e: mov    QWORD PTR [r14+0x38],rax
     14d3218:	bf 80 00 00 00       	mov    edi,0x80
     14d321d:	e8 de ac 31 00       	call   17edf00 <_Znwm@plt>
     14d3222:	49 89 c6             	mov    r14,rax
     14d3225:	66 0f ef c0          	pxor   xmm0,xmm0
     14d3229:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d322e:	48 8d 05 33 a2 32 00 	lea    rax,[rip+0x32a233]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14d3235:	49 89 06             	mov    QWORD PTR [r14],rax
     14d3238:	48 8d 05 79 66 3a 00 	lea    rax,[rip+0x3a6679]        # 18798b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35fa0>
     14d323f:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14d3243:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     14d3248:	48 8b 81 98 00 00 00 	mov    rax,QWORD PTR [rcx+0x98]
     14d324f:	0f 10 81 90 00 00 00 	movups xmm0,XMMWORD PTR [rcx+0x90]
     14d3256:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
     14d325b:	48 85 c0             	test   rax,rax
     14d325e:	74 05                	je     14d3265 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3187e9>
     14d3260:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d3265:	4d 89 66 30          	mov    QWORD PTR [r14+0x30],r12
     14d3269:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
     14d326e:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
     14d3272:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d3277:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14d327c:	48 8b 81 88 00 00 00 	mov    rax,QWORD PTR [rcx+0x88]
     14d3283:	0f 28 81 80 00 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x80]
     14d328a:	41 0f 11 46 40       	movups XMMWORD PTR [r14+0x40],xmm0
     14d328f:	48 85 c0             	test   rax,rax
     14d3292:	74 05                	je     14d3299 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31881d>
     14d3294:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d3299:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
     14d329d:	41 0f 28 45 00       	movaps xmm0,XMMWORD PTR [r13+0x0]
     14d32a2:	41 0f 11 46 50       	movups XMMWORD PTR [r14+0x50],xmm0
     14d32a7:	48 85 c0             	test   rax,rax
     14d32aa:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
     14d32af:	74 05                	je     14d32b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31883a>

### 0x14d328a: movups XMMWORD PTR [r14+0x40],xmm0
     14d322e:	48 8d 05 33 a2 32 00 	lea    rax,[rip+0x32a233]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14d3235:	49 89 06             	mov    QWORD PTR [r14],rax
     14d3238:	48 8d 05 79 66 3a 00 	lea    rax,[rip+0x3a6679]        # 18798b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35fa0>
     14d323f:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14d3243:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     14d3248:	48 8b 81 98 00 00 00 	mov    rax,QWORD PTR [rcx+0x98]
     14d324f:	0f 10 81 90 00 00 00 	movups xmm0,XMMWORD PTR [rcx+0x90]
     14d3256:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
     14d325b:	48 85 c0             	test   rax,rax
     14d325e:	74 05                	je     14d3265 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3187e9>
     14d3260:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d3265:	4d 89 66 30          	mov    QWORD PTR [r14+0x30],r12
     14d3269:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
     14d326e:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
     14d3272:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d3277:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14d327c:	48 8b 81 88 00 00 00 	mov    rax,QWORD PTR [rcx+0x88]
     14d3283:	0f 28 81 80 00 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x80]
     14d328a:	41 0f 11 46 40       	movups XMMWORD PTR [r14+0x40],xmm0
     14d328f:	48 85 c0             	test   rax,rax
     14d3292:	74 05                	je     14d3299 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31881d>
     14d3294:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d3299:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
     14d329d:	41 0f 28 45 00       	movaps xmm0,XMMWORD PTR [r13+0x0]
     14d32a2:	41 0f 11 46 50       	movups XMMWORD PTR [r14+0x50],xmm0
     14d32a7:	48 85 c0             	test   rax,rax
     14d32aa:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
     14d32af:	74 05                	je     14d32b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31883a>
     14d32b1:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d32b6:	4d 8d 7e 18          	lea    r15,[r14+0x18]
     14d32ba:	49 8b 44 24 18       	mov    rax,QWORD PTR [r12+0x18]
     14d32bf:	f3 41 0f 6f 44 24 10 	movdqu xmm0,XMMWORD PTR [r12+0x10]
     14d32c6:	f3 41 0f 7f 46 60    	movdqu XMMWORD PTR [r14+0x60],xmm0

### 0x14d32a2: movups XMMWORD PTR [r14+0x50],xmm0
     14d324f:	0f 10 81 90 00 00 00 	movups xmm0,XMMWORD PTR [rcx+0x90]
     14d3256:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
     14d325b:	48 85 c0             	test   rax,rax
     14d325e:	74 05                	je     14d3265 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3187e9>
     14d3260:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d3265:	4d 89 66 30          	mov    QWORD PTR [r14+0x30],r12
     14d3269:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
     14d326e:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
     14d3272:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d3277:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14d327c:	48 8b 81 88 00 00 00 	mov    rax,QWORD PTR [rcx+0x88]
     14d3283:	0f 28 81 80 00 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x80]
     14d328a:	41 0f 11 46 40       	movups XMMWORD PTR [r14+0x40],xmm0
     14d328f:	48 85 c0             	test   rax,rax
     14d3292:	74 05                	je     14d3299 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31881d>
     14d3294:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d3299:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
     14d329d:	41 0f 28 45 00       	movaps xmm0,XMMWORD PTR [r13+0x0]
     14d32a2:	41 0f 11 46 50       	movups XMMWORD PTR [r14+0x50],xmm0
     14d32a7:	48 85 c0             	test   rax,rax
     14d32aa:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
     14d32af:	74 05                	je     14d32b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31883a>
     14d32b1:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d32b6:	4d 8d 7e 18          	lea    r15,[r14+0x18]
     14d32ba:	49 8b 44 24 18       	mov    rax,QWORD PTR [r12+0x18]
     14d32bf:	f3 41 0f 6f 44 24 10 	movdqu xmm0,XMMWORD PTR [r12+0x10]
     14d32c6:	f3 41 0f 7f 46 60    	movdqu XMMWORD PTR [r14+0x60],xmm0
     14d32cc:	48 85 c0             	test   rax,rax
     14d32cf:	74 05                	je     14d32d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31885a>
     14d32d1:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d32d6:	4c 89 f7             	mov    rdi,r14
     14d32d9:	48 83 c7 70          	add    rdi,0x70
     14d32dd:	e8 14 67 30 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>

### 0x14d32c6: movdqu XMMWORD PTR [r14+0x60],xmm0
     14d3272:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d3277:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14d327c:	48 8b 81 88 00 00 00 	mov    rax,QWORD PTR [rcx+0x88]
     14d3283:	0f 28 81 80 00 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x80]
     14d328a:	41 0f 11 46 40       	movups XMMWORD PTR [r14+0x40],xmm0
     14d328f:	48 85 c0             	test   rax,rax
     14d3292:	74 05                	je     14d3299 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31881d>
     14d3294:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d3299:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
     14d329d:	41 0f 28 45 00       	movaps xmm0,XMMWORD PTR [r13+0x0]
     14d32a2:	41 0f 11 46 50       	movups XMMWORD PTR [r14+0x50],xmm0
     14d32a7:	48 85 c0             	test   rax,rax
     14d32aa:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
     14d32af:	74 05                	je     14d32b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31883a>
     14d32b1:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d32b6:	4d 8d 7e 18          	lea    r15,[r14+0x18]
     14d32ba:	49 8b 44 24 18       	mov    rax,QWORD PTR [r12+0x18]
     14d32bf:	f3 41 0f 6f 44 24 10 	movdqu xmm0,XMMWORD PTR [r12+0x10]
     14d32c6:	f3 41 0f 7f 46 60    	movdqu XMMWORD PTR [r14+0x60],xmm0
     14d32cc:	48 85 c0             	test   rax,rax
     14d32cf:	74 05                	je     14d32d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31885a>
     14d32d1:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d32d6:	4c 89 f7             	mov    rdi,r14
     14d32d9:	48 83 c7 70          	add    rdi,0x70
     14d32dd:	e8 14 67 30 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     14d32e2:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14d32e9:	00 
     14d32ea:	4c 89 3b             	mov    QWORD PTR [rbx],r15
     14d32ed:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
     14d32f1:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d32f6:	48 8d 78 70          	lea    rdi,[rax+0x70]
     14d32fa:	48 89 de             	mov    rsi,rbx
     14d32fd:	e8 1a 65 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>

### 0x14d3522: mov    QWORD PTR [r14],rbx
     14d34d4:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d34d9:	48 83 c3 18          	add    rbx,0x18
     14d34dd:	48 8b 8c 24 a0 00 00 	mov    rcx,QWORD PTR [rsp+0xa0]
     14d34e4:	00 
     14d34e5:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     14d34e9:	66 0f 6f 01          	movdqa xmm0,XMMWORD PTR [rcx]
     14d34ed:	f3 41 0f 7f 44 24 50 	movdqu XMMWORD PTR [r12+0x50],xmm0
     14d34f4:	48 85 c0             	test   rax,rax
     14d34f7:	74 05                	je     14d34fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x318a82>
     14d34f9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d34fe:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d3505:	00 
     14d3506:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     14d350a:	4d 89 7c 24 60       	mov    QWORD PTR [r12+0x60],r15
     14d350f:	41 c6 44 24 68 00    	mov    BYTE PTR [r12+0x68],0x0
     14d3515:	e8 fa 19 00 00       	call   14d4f14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a498>
     14d351a:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d3521:	00 
     14d3522:	49 89 1e             	mov    QWORD PTR [r14],rbx
     14d3525:	4d 89 66 08          	mov    QWORD PTR [r14+0x8],r12
     14d3529:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d352e:	48 8d b8 18 01 00 00 	lea    rdi,[rax+0x118]
     14d3535:	4c 89 f6             	mov    rsi,r14
     14d3538:	e8 df 62 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14d353d:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d3541:	e8 40 af 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d3546:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     14d354b:	4c 8b b0 a8 00 00 00 	mov    r14,QWORD PTR [rax+0xa8]
     14d3552:	6a 40                	push   0x40
     14d3554:	5f                   	pop    rdi
     14d3555:	e8 a6 a9 31 00       	call   17edf00 <_Znwm@plt>
     14d355a:	48 89 c3             	mov    rbx,rax
     14d355d:	4c 89 30             	mov    QWORD PTR [rax],r14

### 0x14d3525: mov    QWORD PTR [r14+0x8],r12
     14d34d9:	48 83 c3 18          	add    rbx,0x18
     14d34dd:	48 8b 8c 24 a0 00 00 	mov    rcx,QWORD PTR [rsp+0xa0]
     14d34e4:	00 
     14d34e5:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     14d34e9:	66 0f 6f 01          	movdqa xmm0,XMMWORD PTR [rcx]
     14d34ed:	f3 41 0f 7f 44 24 50 	movdqu XMMWORD PTR [r12+0x50],xmm0
     14d34f4:	48 85 c0             	test   rax,rax
     14d34f7:	74 05                	je     14d34fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x318a82>
     14d34f9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d34fe:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d3505:	00 
     14d3506:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     14d350a:	4d 89 7c 24 60       	mov    QWORD PTR [r12+0x60],r15
     14d350f:	41 c6 44 24 68 00    	mov    BYTE PTR [r12+0x68],0x0
     14d3515:	e8 fa 19 00 00       	call   14d4f14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a498>
     14d351a:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d3521:	00 
     14d3522:	49 89 1e             	mov    QWORD PTR [r14],rbx
     14d3525:	4d 89 66 08          	mov    QWORD PTR [r14+0x8],r12
     14d3529:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d352e:	48 8d b8 18 01 00 00 	lea    rdi,[rax+0x118]
     14d3535:	4c 89 f6             	mov    rsi,r14
     14d3538:	e8 df 62 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14d353d:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d3541:	e8 40 af 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d3546:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     14d354b:	4c 8b b0 a8 00 00 00 	mov    r14,QWORD PTR [rax+0xa8]
     14d3552:	6a 40                	push   0x40
     14d3554:	5f                   	pop    rdi
     14d3555:	e8 a6 a9 31 00       	call   17edf00 <_Znwm@plt>
     14d355a:	48 89 c3             	mov    rbx,rax
     14d355d:	4c 89 30             	mov    QWORD PTR [rax],r14
     14d3560:	48 83 c0 08          	add    rax,0x8

### 0x14d366a: and    QWORD PTR [r14],0x0
     14d3623:	5a                   	pop    rdx
     14d3624:	4c 89 fe             	mov    rsi,r15
     14d3627:	4c 89 e1             	mov    rcx,r12
     14d362a:	ff 50 70             	call   QWORD PTR [rax+0x70]
     14d362d:	4c 8d bc 24 a0 03 00 	lea    r15,[rsp+0x3a0]
     14d3634:	00 
     14d3635:	4c 89 f7             	mov    rdi,r14
     14d3638:	4c 89 fe             	mov    rsi,r15
     14d363b:	e8 b2 65 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d3640:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     14d3644:	e8 3d ae 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d3649:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d3650:	00 
     14d3651:	e8 92 71 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d3656:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     14d365b:	48 81 c7 28 01 00 00 	add    rdi,0x128
     14d3662:	4c 8d b4 24 30 02 00 	lea    r14,[rsp+0x230]
     14d3669:	00 
     14d366a:	49 83 26 00          	and    QWORD PTR [r14],0x0
     14d366e:	48 89 de             	mov    rsi,rbx
     14d3671:	e8 30 a5 ff ff       	call   14cdba6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31312a>
     14d3676:	4c 89 f7             	mov    rdi,r14
     14d3679:	e8 54 a4 ff ff       	call   14cdad2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313056>
     14d367e:	48 8d bc 24 80 03 00 	lea    rdi,[rsp+0x380]
     14d3685:	00 
     14d3686:	e8 89 18 00 00       	call   14d4f14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a498>
     14d368b:	48 89 ef             	mov    rdi,rbp
     14d368e:	e8 f3 ad 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d3693:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     14d3698:	e8 e9 ad 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d369d:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
     14d36a4:	00 
     14d36a5:	e8 dc ad 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>


## All references to candidate bundle offset +0x30 in ranked FDE
### 0x14ce0b6: mov    r14,QWORD PTR [r12+0x30]
     14ce076:	41 59                	pop    r9
     14ce078:	e8 0d 93 11 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
     14ce07d:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
     14ce080:	0f b6 f0             	movzx  esi,al
     14ce083:	48 89 df             	mov    rdi,rbx
     14ce086:	ff 51 40             	call   QWORD PTR [rcx+0x40]
     14ce089:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]
     14ce08e:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     14ce091:	48 8d 35 40 a4 f6 fe 	lea    rsi,[rip+0xfffffffffef6a440]        # 4384d8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5df27>
     14ce098:	48 8d 0d 51 a4 f6 fe 	lea    rcx,[rip+0xfffffffffef6a451]        # 4384f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5df3f>
     14ce09f:	6a 08                	push   0x8
     14ce0a1:	5a                   	pop    rdx
     14ce0a2:	6a 18                	push   0x18
     14ce0a4:	41 58                	pop    r8
     14ce0a6:	45 31 c9             	xor    r9d,r9d
     14ce0a9:	e8 dc 92 11 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
     14ce0ae:	84 c0                	test   al,al
     14ce0b0:	0f 84 14 02 00 00    	je     14ce2ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31384e>
     14ce0b6:	4d 8b 74 24 30       	mov    r14,QWORD PTR [r12+0x30]
     14ce0bb:	bf d0 00 00 00       	mov    edi,0xd0
     14ce0c0:	e8 3b fe 31 00       	call   17edf00 <_Znwm@plt>
     14ce0c5:	49 89 c5             	mov    r13,rax
     14ce0c8:	66 0f ef c0          	pxor   xmm0,xmm0
     14ce0cc:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14ce0d1:	48 8d 05 a8 ce 3a 00 	lea    rax,[rip+0x3acea8]        # 187af80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x37668>
     14ce0d8:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     14ce0dc:	f3 41 0f 7f 45 18    	movdqu XMMWORD PTR [r13+0x18],xmm0
     14ce0e2:	f3 41 0f 7f 45 28    	movdqu XMMWORD PTR [r13+0x28],xmm0
     14ce0e8:	49 83 65 38 00       	and    QWORD PTR [r13+0x38],0x0
     14ce0ed:	48 8d 35 b4 ce 3a 00 	lea    rsi,[rip+0x3aceb4]        # 187afa8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x37690>
     14ce0f4:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14ce0fb:	00 
     14ce0fc:	e8 f5 f3 6b ff       	call   b8d4f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda496>
     14ce101:	49 8d b4 24 b0 00 00 	lea    rsi,[r12+0xb0]
     14ce108:	00 
     14ce109:	49 8d 7d 40          	lea    rdi,[r13+0x40]
     14ce10d:	48 8d 94 24 e0 02 00 	lea    rdx,[rsp+0x2e0]

### 0x14ce31c: mov    rax,QWORD PTR [r12+0x30]
     14ce2cc:	5f                   	pop    rdi
     14ce2cd:	e8 2e fc 31 00       	call   17edf00 <_Znwm@plt>
     14ce2d2:	48 89 c5             	mov    rbp,rax
     14ce2d5:	66 0f ef c0          	pxor   xmm0,xmm0
     14ce2d9:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14ce2de:	48 8d 05 e3 ae 3a 00 	lea    rax,[rip+0x3aaee3]        # 18791c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x358b0>
     14ce2e5:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     14ce2e9:	48 8d 05 10 af 3a 00 	lea    rax,[rip+0x3aaf10]        # 1879200 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x358e8>
     14ce2f0:	48 89 45 18          	mov    QWORD PTR [rbp+0x18],rax
     14ce2f4:	66 48 0f 6e c5       	movq   xmm0,rbp
     14ce2f9:	49 89 ed             	mov    r13,rbp
     14ce2fc:	49 83 c5 18          	add    r13,0x18
     14ce300:	66 49 0f 6e cd       	movq   xmm1,r13
     14ce305:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
     14ce309:	66 0f 7f 8c 24 60 01 	movdqa XMMWORD PTR [rsp+0x160],xmm1
     14ce310:	00 00 
     14ce312:	48 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],rbp
     14ce317:	f0 48 ff 45 10       	lock inc QWORD PTR [rbp+0x10]
     14ce31c:	49 8b 44 24 30       	mov    rax,QWORD PTR [r12+0x30]
     14ce321:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     14ce326:	49 8b 44 24 48       	mov    rax,QWORD PTR [r12+0x48]
     14ce32b:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     14ce330:	49 8b 74 24 70       	mov    rsi,QWORD PTR [r12+0x70]
     14ce335:	48 8d bc 24 80 03 00 	lea    rdi,[rsp+0x380]
     14ce33c:	00 
     14ce33d:	e8 64 b5 11 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
     14ce342:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]
     14ce347:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     14ce34a:	48 8d 35 09 a2 f6 fe 	lea    rsi,[rip+0xfffffffffef6a209]        # 43855a <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5dfa9>
     14ce351:	48 8d 0d 18 a2 f6 fe 	lea    rcx,[rip+0xfffffffffef6a218]        # 438570 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5dfbf>
     14ce358:	6a 08                	push   0x8
     14ce35a:	41 5e                	pop    r14
     14ce35c:	6a 14                	push   0x14
     14ce35e:	41 58                	pop    r8
     14ce360:	6a 05                	push   0x5
     14ce362:	41 59                	pop    r9
     14ce364:	4c 89 f2             	mov    rdx,r14

### 0x14ce511: mov    rdi,QWORD PTR [r15+0x30]
     14ce4c7:	4c 89 e6             	mov    rsi,r12
     14ce4ca:	e8 73 bd 01 00       	call   14ea242 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32f7c6>
     14ce4cf:	49 8d bf d0 00 00 00 	lea    rdi,[r15+0xd0]
     14ce4d6:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14ce4dd:	00 
     14ce4de:	48 89 de             	mov    rsi,rbx
     14ce4e1:	e8 5c bd 01 00       	call   14ea242 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32f7c6>
     14ce4e6:	48 89 df             	mov    rdi,rbx
     14ce4e9:	e8 7c ba 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14ce4ee:	31 ff                	xor    edi,edi
     14ce4f0:	e8 bd ff 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14ce4f5:	4c 89 e7             	mov    rdi,r12
     14ce4f8:	e8 6d ba 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14ce4fd:	31 ff                	xor    edi,edi
     14ce4ff:	e8 ae ff 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14ce504:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14ce50b:	00 
     14ce50c:	e8 7f f9 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14ce511:	49 8b 7f 30          	mov    rdi,QWORD PTR [r15+0x30]
     14ce515:	48 85 ff             	test   rdi,rdi
     14ce518:	48 8b 5c 24 28       	mov    rbx,QWORD PTR [rsp+0x28]
     14ce51d:	74 0a                	je     14ce529 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313aad>
     14ce51f:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     14ce523:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
     14ce527:	75 1f                	jne    14ce548 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313acc>
     14ce529:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
     14ce52e:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
     14ce533:	4d 89 77 28          	mov    QWORD PTR [r15+0x28],r14
     14ce537:	4d 89 7f 30          	mov    QWORD PTR [r15+0x30],r15
     14ce53b:	e8 72 ff 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14ce540:	4c 89 ff             	mov    rdi,r15
     14ce543:	e8 3e ff 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14ce548:	31 ff                	xor    edi,edi
     14ce54a:	e8 cd fe 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14ce54f:	31 ff                	xor    edi,edi
     14ce551:	e8 30 ff 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14ce556:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]

### 0x14ce537: mov    QWORD PTR [r15+0x30],r15
     14ce4f0:	e8 bd ff 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14ce4f5:	4c 89 e7             	mov    rdi,r12
     14ce4f8:	e8 6d ba 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14ce4fd:	31 ff                	xor    edi,edi
     14ce4ff:	e8 ae ff 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14ce504:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14ce50b:	00 
     14ce50c:	e8 7f f9 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14ce511:	49 8b 7f 30          	mov    rdi,QWORD PTR [r15+0x30]
     14ce515:	48 85 ff             	test   rdi,rdi
     14ce518:	48 8b 5c 24 28       	mov    rbx,QWORD PTR [rsp+0x28]
     14ce51d:	74 0a                	je     14ce529 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313aad>
     14ce51f:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     14ce523:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
     14ce527:	75 1f                	jne    14ce548 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313acc>
     14ce529:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
     14ce52e:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
     14ce533:	4d 89 77 28          	mov    QWORD PTR [r15+0x28],r14
     14ce537:	4d 89 7f 30          	mov    QWORD PTR [r15+0x30],r15
     14ce53b:	e8 72 ff 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14ce540:	4c 89 ff             	mov    rdi,r15
     14ce543:	e8 3e ff 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14ce548:	31 ff                	xor    edi,edi
     14ce54a:	e8 cd fe 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14ce54f:	31 ff                	xor    edi,edi
     14ce551:	e8 30 ff 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14ce556:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14ce55b:	48 8b b8 f8 00 00 00 	mov    rdi,QWORD PTR [rax+0xf8]
     14ce562:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14ce565:	48 8d 35 ac a1 f6 fe 	lea    rsi,[rip+0xfffffffffef6a1ac]        # 438718 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e167>
     14ce56c:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14ce56f:	84 c0                	test   al,al
     14ce571:	4c 89 74 24 50       	mov    QWORD PTR [rsp+0x50],r14
     14ce576:	0f 84 55 01 00 00    	je     14ce6d1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313c55>
     14ce57c:	bf b8 00 00 00       	mov    edi,0xb8
     14ce581:	e8 7a f9 31 00       	call   17edf00 <_Znwm@plt>
     14ce586:	49 89 c5             	mov    r13,rax

### 0x14ce5b2: movdqu XMMWORD PTR [r13+0x30],xmm0
     14ce55b:	48 8b b8 f8 00 00 00 	mov    rdi,QWORD PTR [rax+0xf8]
     14ce562:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14ce565:	48 8d 35 ac a1 f6 fe 	lea    rsi,[rip+0xfffffffffef6a1ac]        # 438718 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e167>
     14ce56c:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14ce56f:	84 c0                	test   al,al
     14ce571:	4c 89 74 24 50       	mov    QWORD PTR [rsp+0x50],r14
     14ce576:	0f 84 55 01 00 00    	je     14ce6d1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313c55>
     14ce57c:	bf b8 00 00 00       	mov    edi,0xb8
     14ce581:	e8 7a f9 31 00       	call   17edf00 <_Znwm@plt>
     14ce586:	49 89 c5             	mov    r13,rax
     14ce589:	66 0f ef c0          	pxor   xmm0,xmm0
     14ce58d:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14ce592:	48 8d 05 e7 ac 3a 00 	lea    rax,[rip+0x3aace7]        # 1879280 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35968>
     14ce599:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     14ce59d:	48 8d 05 6c c9 3a 00 	lea    rax,[rip+0x3ac96c]        # 187af10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x375f8>
     14ce5a4:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
     14ce5a8:	4d 8d 7d 20          	lea    r15,[r13+0x20]
     14ce5ac:	f3 41 0f 7f 45 20    	movdqu XMMWORD PTR [r13+0x20],xmm0
     14ce5b2:	f3 41 0f 7f 45 30    	movdqu XMMWORD PTR [r13+0x30],xmm0
     14ce5b8:	49 83 65 40 00       	and    QWORD PTR [r13+0x40],0x0
     14ce5bd:	48 8d 35 a4 c9 3a 00 	lea    rsi,[rip+0x3ac9a4]        # 187af68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x37650>
     14ce5c4:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14ce5cb:	00 
     14ce5cc:	4c 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],r15
     14ce5d1:	e8 20 ef 6b ff       	call   b8d4f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda496>
     14ce5d6:	4d 8d 65 48          	lea    r12,[r13+0x48]
     14ce5da:	48 8d b3 b0 00 00 00 	lea    rsi,[rbx+0xb0]
     14ce5e1:	48 8d 94 24 e0 02 00 	lea    rdx,[rsp+0x2e0]
     14ce5e8:	00 
     14ce5e9:	4c 89 e7             	mov    rdi,r12
     14ce5ec:	e8 b6 9c 5d ff       	call   aa82a7 <JNI_OnUnload@@Base+0x2fb74>
     14ce5f1:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14ce5f8:	00 
     14ce5f9:	e8 92 f8 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14ce5fe:	49 8d 6d 60          	lea    rbp,[r13+0x60]
     14ce602:	66 0f ef c0          	pxor   xmm0,xmm0
     14ce606:	f3 41 0f 7f 45 70    	movdqu XMMWORD PTR [r13+0x70],xmm0

### 0x14ce7ba: movsxd r13,DWORD PTR [rsi+0x30]
     14ce76d:	e8 ca 28 19 00       	call   166103c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x151a8>
     14ce772:	84 c0                	test   al,al
     14ce774:	0f 84 af 00 00 00    	je     14ce829 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313dad>
     14ce77a:	48 63 84 24 30 03 00 	movsxd rax,DWORD PTR [rsp+0x330]
     14ce781:	00 
     14ce782:	4c 89 6c 24 78       	mov    QWORD PTR [rsp+0x78],r13
     14ce787:	49 89 85 88 00 00 00 	mov    QWORD PTR [r13+0x88],rax
     14ce78e:	44 8b b4 24 00 03 00 	mov    r14d,DWORD PTR [rsp+0x300]
     14ce795:	00 
     14ce796:	4d 85 f6             	test   r14,r14
     14ce799:	74 3b                	je     14ce7d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313d5a>
     14ce79b:	4c 8b bc 24 f8 02 00 	mov    r15,QWORD PTR [rsp+0x2f8]
     14ce7a2:	00 
     14ce7a3:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
     14ce7a8:	48 8d 98 90 00 00 00 	lea    rbx,[rax+0x90]
     14ce7af:	49 c1 e6 03          	shl    r14,0x3
     14ce7b3:	45 31 e4             	xor    r12d,r12d
     14ce7b6:	4b 8b 34 27          	mov    rsi,QWORD PTR [r15+r12*1]
     14ce7ba:	4c 63 6e 30          	movsxd r13,DWORD PTR [rsi+0x30]
     14ce7be:	48 83 c6 18          	add    rsi,0x18
     14ce7c2:	48 89 df             	mov    rdi,rbx
     14ce7c5:	e8 5a 8c 03 00       	call   1507424 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34c9a8>
     14ce7ca:	4c 89 28             	mov    QWORD PTR [rax],r13
     14ce7cd:	49 83 c4 08          	add    r12,0x8
     14ce7d1:	4d 39 e6             	cmp    r14,r12
     14ce7d4:	75 e0                	jne    14ce7b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313d3a>
     14ce7d6:	83 bc 24 70 03 00 00 	cmp    DWORD PTR [rsp+0x370],0x3
     14ce7dd:	03 
     14ce7de:	4c 8b 6c 24 78       	mov    r13,QWORD PTR [rsp+0x78]
     14ce7e3:	75 44                	jne    14ce829 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313dad>
     14ce7e5:	44 8b b4 24 40 03 00 	mov    r14d,DWORD PTR [rsp+0x340]
     14ce7ec:	00 
     14ce7ed:	4d 85 f6             	test   r14,r14
     14ce7f0:	74 37                	je     14ce829 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313dad>
     14ce7f2:	4c 8b a4 24 38 03 00 	mov    r12,QWORD PTR [rsp+0x338]
     14ce7f9:	00 
     14ce7fa:	49 c1 e6 03          	shl    r14,0x3

### 0x14ceb94: mov    QWORD PTR [rsp+0x30],r12
     14ceb48:	00 
     14ceb49:	e8 30 af 5a ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14ceb4e:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14ceb51:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]
     14ceb58:	00 
     14ceb59:	4c 89 ff             	mov    rdi,r15
     14ceb5c:	48 8b 54 24 68       	mov    rdx,QWORD PTR [rsp+0x68]
     14ceb61:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14ceb64:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14ceb6b:	00 
     14ceb6c:	e8 1f f3 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14ceb71:	48 8d 35 60 1a e7 fe 	lea    rsi,[rip+0xfffffffffee71a60]        # 3405d8 <_ZTSSt12bad_any_cast@@Base-0x4fbf0>
     14ceb78:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14ceb7f:	00 
     14ceb80:	e8 f9 ae 5a ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14ceb85:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14ceb8a:	48 8b b8 f8 00 00 00 	mov    rdi,QWORD PTR [rax+0xf8]
     14ceb91:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14ceb94:	4c 89 64 24 30       	mov    QWORD PTR [rsp+0x30],r12
     14ceb99:	48 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],rbp
     14ceb9e:	ff 50 30             	call   QWORD PTR [rax+0x30]
     14ceba1:	0f b6 f0             	movzx  esi,al
     14ceba4:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14cebab:	00 
     14cebac:	e8 0d 3f 9f ff       	call   ec2abe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x89ed4>
     14cebb1:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14cebb4:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]
     14cebbb:	00 
     14cebbc:	48 8d 94 24 a0 03 00 	lea    rdx,[rsp+0x3a0]
     14cebc3:	00 
     14cebc4:	4c 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r15
     14cebcb:	00 
     14cebcc:	4c 89 ff             	mov    rdi,r15
     14cebcf:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14cebd2:	4c 8b b4 24 f8 00 00 	mov    r14,QWORD PTR [rsp+0xf8]
     14cebd9:	00 
     14cebda:	49 83 c6 08          	add    r14,0x8

### 0x14ceb9e: call   QWORD PTR [rax+0x30]
     14ceb4e:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14ceb51:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]
     14ceb58:	00 
     14ceb59:	4c 89 ff             	mov    rdi,r15
     14ceb5c:	48 8b 54 24 68       	mov    rdx,QWORD PTR [rsp+0x68]
     14ceb61:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14ceb64:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14ceb6b:	00 
     14ceb6c:	e8 1f f3 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14ceb71:	48 8d 35 60 1a e7 fe 	lea    rsi,[rip+0xfffffffffee71a60]        # 3405d8 <_ZTSSt12bad_any_cast@@Base-0x4fbf0>
     14ceb78:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14ceb7f:	00 
     14ceb80:	e8 f9 ae 5a ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14ceb85:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14ceb8a:	48 8b b8 f8 00 00 00 	mov    rdi,QWORD PTR [rax+0xf8]
     14ceb91:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14ceb94:	4c 89 64 24 30       	mov    QWORD PTR [rsp+0x30],r12
     14ceb99:	48 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],rbp
     14ceb9e:	ff 50 30             	call   QWORD PTR [rax+0x30]
     14ceba1:	0f b6 f0             	movzx  esi,al
     14ceba4:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14cebab:	00 
     14cebac:	e8 0d 3f 9f ff       	call   ec2abe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x89ed4>
     14cebb1:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14cebb4:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]
     14cebbb:	00 
     14cebbc:	48 8d 94 24 a0 03 00 	lea    rdx,[rsp+0x3a0]
     14cebc3:	00 
     14cebc4:	4c 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r15
     14cebcb:	00 
     14cebcc:	4c 89 ff             	mov    rdi,r15
     14cebcf:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14cebd2:	4c 8b b4 24 f8 00 00 	mov    r14,QWORD PTR [rsp+0xf8]
     14cebd9:	00 
     14cebda:	49 83 c6 08          	add    r14,0x8
     14cebde:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14cebe5:	00 

### 0x14ced1d: mov    r15,QWORD PTR [r12+0x30]
     14ceccf:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     14cecd2:	48 8d 35 5b 98 f6 fe 	lea    rsi,[rip+0xfffffffffef6985b]        # 438534 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5df83>
     14cecd9:	48 8d 0d 60 98 f6 fe 	lea    rcx,[rip+0xfffffffffef69860]        # 438540 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5df8f>
     14cece0:	4c 89 e2             	mov    rdx,r12
     14cece3:	4d 89 fc             	mov    r12,r15
     14cece6:	4d 89 e8             	mov    r8,r13
     14cece9:	45 31 c9             	xor    r9d,r9d
     14cecec:	e8 99 86 11 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
     14cecf1:	88 84 24 d8 00 00 00 	mov    BYTE PTR [rsp+0xd8],al
     14cecf8:	49 8b 77 60          	mov    rsi,QWORD PTR [r15+0x60]
     14cecfc:	4c 89 f7             	mov    rdi,r14
     14cecff:	e8 a2 ab 11 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
     14ced04:	f3 41 0f 6f 07       	movdqu xmm0,XMMWORD PTR [r15]
     14ced09:	66 0f 7f 44 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm0
     14ced0f:	4d 8b 6f 08          	mov    r13,QWORD PTR [r15+0x8]
     14ced13:	4d 85 ed             	test   r13,r13
     14ced16:	74 05                	je     14ced1d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3142a1>
     14ced18:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
     14ced1d:	4d 8b 7c 24 30       	mov    r15,QWORD PTR [r12+0x30]
     14ced22:	4d 8b 64 24 48       	mov    r12,QWORD PTR [r12+0x48]
     14ced27:	bf 60 01 00 00       	mov    edi,0x160
     14ced2c:	e8 cf f1 31 00       	call   17edf00 <_Znwm@plt>
     14ced31:	49 89 c6             	mov    r14,rax
     14ced34:	66 0f ef c0          	pxor   xmm0,xmm0
     14ced38:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14ced3d:	48 8d 05 84 c0 33 00 	lea    rax,[rip+0x33c084]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
     14ced44:	49 89 06             	mov    QWORD PTR [r14],rax
     14ced47:	48 8d 05 1a a6 3a 00 	lea    rax,[rip+0x3aa61a]        # 1879368 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35a50>
     14ced4e:	48 89 84 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],rax
     14ced55:	00 
     14ced56:	0f 28 4c 24 40       	movaps xmm1,XMMWORD PTR [rsp+0x40]
     14ced5b:	0f 11 8c 24 e8 02 00 	movups XMMWORD PTR [rsp+0x2e8],xmm1
     14ced62:	00 
     14ced63:	48 89 9c 24 00 03 00 	mov    QWORD PTR [rsp+0x300],rbx
     14ced6a:	00 
     14ced6b:	f3 41 0f 7f 46 28    	movdqu XMMWORD PTR [r14+0x28],xmm0
     14ced71:	48 8d 05 60 bc 3a 00 	lea    rax,[rip+0x3abc60]        # 187a9d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x370c0>

### 0x14ceea6: call   QWORD PTR [rax+0x30]
     14cee51:	f3 41 0f 7f 86 18 01 	movdqu XMMWORD PTR [r14+0x118],xmm0
     14cee58:	00 00 
     14cee5a:	41 89 86 28 01 00 00 	mov    DWORD PTR [r14+0x128],eax
     14cee61:	66 41 0f 7f 86 30 01 	movdqa XMMWORD PTR [r14+0x130],xmm0
     14cee68:	00 00 
     14cee6a:	66 41 0f 7f 86 40 01 	movdqa XMMWORD PTR [r14+0x140],xmm0
     14cee71:	00 00 
     14cee73:	41 89 86 50 01 00 00 	mov    DWORD PTR [r14+0x150],eax
     14cee7a:	48 8d 35 9a c9 e9 fe 	lea    rsi,[rip+0xfffffffffee9c99a]        # 36b81b <_ZTSSt12bad_any_cast@@Base-0x249ad>
     14cee81:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14cee88:	00 
     14cee89:	e8 f0 ab 5a ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14cee8e:	4d 8d 66 20          	lea    r12,[r14+0x20]
     14cee92:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     14cee96:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14cee9d:	00 
     14cee9e:	4c 89 e7             	mov    rdi,r12
     14ceea1:	48 8b 54 24 68       	mov    rdx,QWORD PTR [rsp+0x68]
     14ceea6:	ff 50 30             	call   QWORD PTR [rax+0x30]
     14ceea9:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14ceeb0:	00 
     14ceeb1:	e8 da ef 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14ceeb6:	48 8d 35 d4 1d e9 fe 	lea    rsi,[rip+0xfffffffffee91dd4]        # 360c91 <_ZTSSt12bad_any_cast@@Base-0x2f537>
     14ceebd:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14ceec4:	00 
     14ceec5:	e8 b4 ab 5a ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14ceeca:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     14ceece:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14ceed5:	00 
     14ceed6:	4c 89 e7             	mov    rdi,r12
     14ceed9:	48 8b 54 24 70       	mov    rdx,QWORD PTR [rsp+0x70]
     14ceede:	ff 50 30             	call   QWORD PTR [rax+0x30]
     14ceee1:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14ceee8:	00 
     14ceee9:	e8 a2 ef 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14ceeee:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14ceef5:	00 

### 0x14ceede: call   QWORD PTR [rax+0x30]
     14cee92:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     14cee96:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14cee9d:	00 
     14cee9e:	4c 89 e7             	mov    rdi,r12
     14ceea1:	48 8b 54 24 68       	mov    rdx,QWORD PTR [rsp+0x68]
     14ceea6:	ff 50 30             	call   QWORD PTR [rax+0x30]
     14ceea9:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14ceeb0:	00 
     14ceeb1:	e8 da ef 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14ceeb6:	48 8d 35 d4 1d e9 fe 	lea    rsi,[rip+0xfffffffffee91dd4]        # 360c91 <_ZTSSt12bad_any_cast@@Base-0x2f537>
     14ceebd:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14ceec4:	00 
     14ceec5:	e8 b4 ab 5a ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14ceeca:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     14ceece:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14ceed5:	00 
     14ceed6:	4c 89 e7             	mov    rdi,r12
     14ceed9:	48 8b 54 24 70       	mov    rdx,QWORD PTR [rsp+0x70]
     14ceede:	ff 50 30             	call   QWORD PTR [rax+0x30]
     14ceee1:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14ceee8:	00 
     14ceee9:	e8 a2 ef 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14ceeee:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14ceef5:	00 
     14ceef6:	e8 6f b0 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14ceefb:	31 ff                	xor    edi,edi
     14ceefd:	e8 84 f5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cef02:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
     14cef06:	48 85 ff             	test   rdi,rdi
     14cef09:	74 0a                	je     14cef15 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314499>
     14cef0b:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     14cef0f:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
     14cef13:	75 1f                	jne    14cef34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3144b8>
     14cef15:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
     14cef1a:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
     14cef1f:	4d 89 66 28          	mov    QWORD PTR [r14+0x28],r12
     14cef23:	4d 89 76 30          	mov    QWORD PTR [r14+0x30],r14

### 0x14cef02: mov    rdi,QWORD PTR [r14+0x30]
     14ceeb6:	48 8d 35 d4 1d e9 fe 	lea    rsi,[rip+0xfffffffffee91dd4]        # 360c91 <_ZTSSt12bad_any_cast@@Base-0x2f537>
     14ceebd:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14ceec4:	00 
     14ceec5:	e8 b4 ab 5a ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14ceeca:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     14ceece:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14ceed5:	00 
     14ceed6:	4c 89 e7             	mov    rdi,r12
     14ceed9:	48 8b 54 24 70       	mov    rdx,QWORD PTR [rsp+0x70]
     14ceede:	ff 50 30             	call   QWORD PTR [rax+0x30]
     14ceee1:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14ceee8:	00 
     14ceee9:	e8 a2 ef 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14ceeee:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14ceef5:	00 
     14ceef6:	e8 6f b0 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14ceefb:	31 ff                	xor    edi,edi
     14ceefd:	e8 84 f5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cef02:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
     14cef06:	48 85 ff             	test   rdi,rdi
     14cef09:	74 0a                	je     14cef15 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314499>
     14cef0b:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     14cef0f:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
     14cef13:	75 1f                	jne    14cef34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3144b8>
     14cef15:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
     14cef1a:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
     14cef1f:	4d 89 66 28          	mov    QWORD PTR [r14+0x28],r12
     14cef23:	4d 89 76 30          	mov    QWORD PTR [r14+0x30],r14
     14cef27:	e8 86 f5 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14cef2c:	4c 89 f7             	mov    rdi,r14
     14cef2f:	e8 52 f5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cef34:	31 ff                	xor    edi,edi
     14cef36:	e8 e1 f4 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14cef3b:	31 ff                	xor    edi,edi
     14cef3d:	e8 44 f5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cef42:	31 ff                	xor    edi,edi
     14cef44:	e8 3d f5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### 0x14cef23: mov    QWORD PTR [r14+0x30],r14
     14ceede:	ff 50 30             	call   QWORD PTR [rax+0x30]
     14ceee1:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14ceee8:	00 
     14ceee9:	e8 a2 ef 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14ceeee:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14ceef5:	00 
     14ceef6:	e8 6f b0 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14ceefb:	31 ff                	xor    edi,edi
     14ceefd:	e8 84 f5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cef02:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
     14cef06:	48 85 ff             	test   rdi,rdi
     14cef09:	74 0a                	je     14cef15 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314499>
     14cef0b:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     14cef0f:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
     14cef13:	75 1f                	jne    14cef34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3144b8>
     14cef15:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
     14cef1a:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
     14cef1f:	4d 89 66 28          	mov    QWORD PTR [r14+0x28],r12
     14cef23:	4d 89 76 30          	mov    QWORD PTR [r14+0x30],r14
     14cef27:	e8 86 f5 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14cef2c:	4c 89 f7             	mov    rdi,r14
     14cef2f:	e8 52 f5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cef34:	31 ff                	xor    edi,edi
     14cef36:	e8 e1 f4 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14cef3b:	31 ff                	xor    edi,edi
     14cef3d:	e8 44 f5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cef42:	31 ff                	xor    edi,edi
     14cef44:	e8 3d f5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cef49:	31 ff                	xor    edi,edi
     14cef4b:	e8 36 f5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cef50:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     14cef55:	48 8b 98 f8 00 00 00 	mov    rbx,QWORD PTR [rax+0xf8]
     14cef5c:	4c 8d b8 00 01 00 00 	lea    r15,[rax+0x100]
     14cef63:	4c 39 fb             	cmp    rbx,r15
     14cef66:	74 5e                	je     14cefc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31454a>
     14cef68:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14cef6f:	00 

### 0x14cf00f: mov    rbx,QWORD PTR [r15+0x30]
     14cefc6:	4c 8b 7c 24 28       	mov    r15,QWORD PTR [rsp+0x28]
     14cefcb:	49 8b 47 40          	mov    rax,QWORD PTR [r15+0x40]
     14cefcf:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     14cefd2:	48 8d 35 b1 94 f6 fe 	lea    rsi,[rip+0xfffffffffef694b1]        # 43848a <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5ded9>
     14cefd9:	48 8d 0d c0 94 f6 fe 	lea    rcx,[rip+0xfffffffffef694c0]        # 4384a0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5deef>
     14cefe0:	6a 08                	push   0x8
     14cefe2:	5a                   	pop    rdx
     14cefe3:	6a 15                	push   0x15
     14cefe5:	41 58                	pop    r8
     14cefe7:	45 31 c9             	xor    r9d,r9d
     14cefea:	e8 9b 83 11 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
     14cefef:	88 84 24 e0 00 00 00 	mov    BYTE PTR [rsp+0xe0],al
     14ceff6:	84 c0                	test   al,al
     14ceff8:	0f 84 8b 03 00 00    	je     14cf389 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31490d>
     14ceffe:	49 8b 77 60          	mov    rsi,QWORD PTR [r15+0x60]
     14cf002:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     14cf009:	00 
     14cf00a:	e8 97 a8 11 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
     14cf00f:	49 8b 5f 30          	mov    rbx,QWORD PTR [r15+0x30]
     14cf013:	4d 8b 77 48          	mov    r14,QWORD PTR [r15+0x48]
     14cf017:	48 8b 94 24 f8 00 00 	mov    rdx,QWORD PTR [rsp+0xf8]
     14cf01e:	00 
     14cf01f:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
     14cf024:	48 8d 05 9d ef 33 00 	lea    rax,[rip+0x33ef9d]        # 180dfc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3c88>
     14cf02b:	48 8d 8c 24 80 02 00 	lea    rcx,[rsp+0x280]
     14cf032:	00 
     14cf033:	48 89 01             	mov    QWORD PTR [rcx],rax
     14cf036:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     14cf03d:	00 
     14cf03e:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
     14cf042:	48 89 51 10          	mov    QWORD PTR [rcx+0x10],rdx
     14cf046:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
     14cf04b:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     14cf04f:	49 8b 47 40          	mov    rax,QWORD PTR [r15+0x40]
     14cf053:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     14cf056:	48 8d 35 59 94 f6 fe 	lea    rsi,[rip+0xfffffffffef69459]        # 4384b6 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5df05>
     14cf05d:	48 8d 0d 5c 94 f6 fe 	lea    rcx,[rip+0xfffffffffef6945c]        # 4384c0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5df0f>

### 0x14cf0fd: call   QWORD PTR [rax+0x30]
     14cf0b0:	00 00 
     14cf0b2:	66 0f 7f 02          	movdqa XMMWORD PTR [rdx],xmm0
     14cf0b6:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf0ba:	66 0f 7f 84 24 a0 01 	movdqa XMMWORD PTR [rsp+0x1a0],xmm0
     14cf0c1:	00 00 
     14cf0c3:	48 83 a4 24 b0 01 00 	and    QWORD PTR [rsp+0x1b0],0x0
     14cf0ca:	00 00 
     14cf0cc:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
     14cf0d3:	00 
     14cf0d4:	e8 ce 91 5d ff       	call   aa82a7 <JNI_OnUnload@@Base+0x2fb74>
     14cf0d9:	48 8d bc 24 b8 02 00 	lea    rdi,[rsp+0x2b8]
     14cf0e0:	00 
     14cf0e1:	48 8d b4 24 f0 01 00 	lea    rsi,[rsp+0x1f0]
     14cf0e8:	00 
     14cf0e9:	e8 52 ee 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14cf0ee:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14cf0f3:	48 8b b8 f8 00 00 00 	mov    rdi,QWORD PTR [rax+0xf8]
     14cf0fa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14cf0fd:	ff 50 30             	call   QWORD PTR [rax+0x30]
     14cf100:	88 84 24 d0 02 00 00 	mov    BYTE PTR [rsp+0x2d0],al
     14cf107:	bf 30 16 00 00       	mov    edi,0x1630
     14cf10c:	e8 ef ed 31 00       	call   17edf00 <_Znwm@plt>
     14cf111:	49 89 c5             	mov    r13,rax
     14cf114:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14cf11b:	00 
     14cf11c:	48 8d b4 24 80 02 00 	lea    rsi,[rsp+0x280]
     14cf123:	00 
     14cf124:	e8 f9 4c 03 00       	call   1503e22 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3493a6>
     14cf129:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf12d:	f3 41 0f 7f 45 08    	movdqu XMMWORD PTR [r13+0x8],xmm0
     14cf133:	48 8d 05 ce bb 3a 00 	lea    rax,[rip+0x3abbce]        # 187ad08 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x373f0>
     14cf13a:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     14cf13e:	66 0f 6f 8c 24 e0 01 	movdqa xmm1,XMMWORD PTR [rsp+0x1e0]
     14cf145:	00 00 
     14cf147:	f3 41 0f 7f 4d 18    	movdqu XMMWORD PTR [r13+0x18],xmm1
     14cf14d:	66 0f 7f 84 24 e0 01 	movdqa XMMWORD PTR [rsp+0x1e0],xmm0
     14cf154:	00 00 

### 0x14cf39a: mov    r14,QWORD PTR [r15+0x30]
     14cf350:	48 8d b4 24 30 02 00 	lea    rsi,[rsp+0x230]
     14cf357:	00 
     14cf358:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     14cf35d:	31 d2                	xor    edx,edx
     14cf35f:	e8 78 5b 2f 00       	call   17c4edc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179048>
     14cf364:	84 c0                	test   al,al
     14cf366:	0f 84 85 03 00 00    	je     14cf6f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314c75>
     14cf36c:	0f b6 84 24 30 02 00 	movzx  eax,BYTE PTR [rsp+0x230]
     14cf373:	00 
     14cf374:	a8 01                	test   al,0x1
     14cf376:	0f 84 cd 01 00 00    	je     14cf549 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314acd>
     14cf37c:	48 8b 84 24 38 02 00 	mov    rax,QWORD PTR [rsp+0x238]
     14cf383:	00 
     14cf384:	e9 c2 01 00 00       	jmp    14cf54b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314acf>
     14cf389:	49 8b 77 60          	mov    rsi,QWORD PTR [r15+0x60]
     14cf38d:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14cf394:	00 
     14cf395:	e8 0c a5 11 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
     14cf39a:	4d 8b 77 30          	mov    r14,QWORD PTR [r15+0x30]
     14cf39e:	4d 8b 6f 48          	mov    r13,QWORD PTR [r15+0x48]
     14cf3a2:	bf 38 01 00 00       	mov    edi,0x138
     14cf3a7:	e8 54 eb 31 00       	call   17edf00 <_Znwm@plt>
     14cf3ac:	48 89 c3             	mov    rbx,rax
     14cf3af:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf3b3:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14cf3b8:	48 8d 05 a9 e0 32 00 	lea    rax,[rip+0x32e0a9]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14cf3bf:	48 89 03             	mov    QWORD PTR [rbx],rax
     14cf3c2:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
     14cf3c7:	48 8d 05 fa af 3a 00 	lea    rax,[rip+0x3aaffa]        # 187a3c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36ab0>
     14cf3ce:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     14cf3d2:	66 0f 6f 8c 24 a0 03 	movdqa xmm1,XMMWORD PTR [rsp+0x3a0]
     14cf3d9:	00 00 
     14cf3db:	f3 0f 7f 4b 30       	movdqu XMMWORD PTR [rbx+0x30],xmm1
     14cf3e0:	66 0f 7f 84 24 a0 03 	movdqa XMMWORD PTR [rsp+0x3a0],xmm0
     14cf3e7:	00 00 
     14cf3e9:	4c 8d 7b 40          	lea    r15,[rbx+0x40]
     14cf3ed:	4c 89 ff             	mov    rdi,r15

### 0x14cf3db: movdqu XMMWORD PTR [rbx+0x30],xmm1
     14cf389:	49 8b 77 60          	mov    rsi,QWORD PTR [r15+0x60]
     14cf38d:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14cf394:	00 
     14cf395:	e8 0c a5 11 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
     14cf39a:	4d 8b 77 30          	mov    r14,QWORD PTR [r15+0x30]
     14cf39e:	4d 8b 6f 48          	mov    r13,QWORD PTR [r15+0x48]
     14cf3a2:	bf 38 01 00 00       	mov    edi,0x138
     14cf3a7:	e8 54 eb 31 00       	call   17edf00 <_Znwm@plt>
     14cf3ac:	48 89 c3             	mov    rbx,rax
     14cf3af:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf3b3:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14cf3b8:	48 8d 05 a9 e0 32 00 	lea    rax,[rip+0x32e0a9]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14cf3bf:	48 89 03             	mov    QWORD PTR [rbx],rax
     14cf3c2:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
     14cf3c7:	48 8d 05 fa af 3a 00 	lea    rax,[rip+0x3aaffa]        # 187a3c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36ab0>
     14cf3ce:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     14cf3d2:	66 0f 6f 8c 24 a0 03 	movdqa xmm1,XMMWORD PTR [rsp+0x3a0]
     14cf3d9:	00 00 
     14cf3db:	f3 0f 7f 4b 30       	movdqu XMMWORD PTR [rbx+0x30],xmm1
     14cf3e0:	66 0f 7f 84 24 a0 03 	movdqa XMMWORD PTR [rsp+0x3a0],xmm0
     14cf3e7:	00 00 
     14cf3e9:	4c 8d 7b 40          	lea    r15,[rbx+0x40]
     14cf3ed:	4c 89 ff             	mov    rdi,r15
     14cf3f0:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
     14cf3f5:	e8 46 eb 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14cf3fa:	4c 89 6b 58          	mov    QWORD PTR [rbx+0x58],r13
     14cf3fe:	4c 89 73 60          	mov    QWORD PTR [rbx+0x60],r14
     14cf402:	4c 8d 6b 68          	lea    r13,[rbx+0x68]
     14cf406:	4c 89 ef             	mov    rdi,r13
     14cf409:	48 8b 74 24 40       	mov    rsi,QWORD PTR [rsp+0x40]
     14cf40e:	e8 2d eb 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14cf413:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf417:	f3 0f 7f 83 90 00 00 	movdqu XMMWORD PTR [rbx+0x90],xmm0
     14cf41e:	00 
     14cf41f:	f3 0f 7f 83 80 00 00 	movdqu XMMWORD PTR [rbx+0x80],xmm0
     14cf426:	00 
     14cf427:	b8 00 00 80 3f       	mov    eax,0x3f800000

### 0x14cf814: movdqu XMMWORD PTR [rbx+0x30],xmm0
     14cf7c0:	eb 02                	jmp    14cf7c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314d48>
     14cf7c2:	31 db                	xor    ebx,ebx
     14cf7c4:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14cf7c9:	48 89 81 e8 00 00 00 	mov    QWORD PTR [rcx+0xe8],rax
     14cf7d0:	48 8b b9 f0 00 00 00 	mov    rdi,QWORD PTR [rcx+0xf0]
     14cf7d7:	48 89 99 f0 00 00 00 	mov    QWORD PTR [rcx+0xf0],rbx
     14cf7de:	e8 a3 ec 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf7e3:	48 89 df             	mov    rdi,rbx
     14cf7e6:	e8 9b ec 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf7eb:	bf 88 00 00 00       	mov    edi,0x88
     14cf7f0:	e8 0b e7 31 00       	call   17edf00 <_Znwm@plt>
     14cf7f5:	48 89 c3             	mov    rbx,rax
     14cf7f8:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf7fc:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14cf801:	48 8d 05 a8 9b 3a 00 	lea    rax,[rip+0x3a9ba8]        # 18793b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35a98>
     14cf808:	48 89 03             	mov    QWORD PTR [rbx],rax
     14cf80b:	48 8d 43 20          	lea    rax,[rbx+0x20]
     14cf80f:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
     14cf814:	f3 0f 7f 43 30       	movdqu XMMWORD PTR [rbx+0x30],xmm0
     14cf819:	f3 0f 7f 43 40       	movdqu XMMWORD PTR [rbx+0x40],xmm0
     14cf81e:	f3 0f 7f 43 50       	movdqu XMMWORD PTR [rbx+0x50],xmm0
     14cf823:	48 83 a3 80 00 00 00 	and    QWORD PTR [rbx+0x80],0x0
     14cf82a:	00 
     14cf82b:	f3 0f 7f 43 60       	movdqu XMMWORD PTR [rbx+0x60],xmm0
     14cf830:	f3 0f 7f 43 70       	movdqu XMMWORD PTR [rbx+0x70],xmm0
     14cf835:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     14cf839:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     14cf83d:	e8 c0 a5 30 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     14cf842:	48 89 d8             	mov    rax,rbx
     14cf845:	48 83 c0 18          	add    rax,0x18
     14cf849:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14cf850:	00 
     14cf851:	49 89 06             	mov    QWORD PTR [r14],rax
     14cf854:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     14cf858:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14cf85d:	48 8d b8 08 01 00 00 	lea    rdi,[rax+0x108]
     14cf864:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi

### 0x14cf839: lea    rdi,[rbx+0x30]
     14cf7e6:	e8 9b ec 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf7eb:	bf 88 00 00 00       	mov    edi,0x88
     14cf7f0:	e8 0b e7 31 00       	call   17edf00 <_Znwm@plt>
     14cf7f5:	48 89 c3             	mov    rbx,rax
     14cf7f8:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf7fc:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14cf801:	48 8d 05 a8 9b 3a 00 	lea    rax,[rip+0x3a9ba8]        # 18793b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35a98>
     14cf808:	48 89 03             	mov    QWORD PTR [rbx],rax
     14cf80b:	48 8d 43 20          	lea    rax,[rbx+0x20]
     14cf80f:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
     14cf814:	f3 0f 7f 43 30       	movdqu XMMWORD PTR [rbx+0x30],xmm0
     14cf819:	f3 0f 7f 43 40       	movdqu XMMWORD PTR [rbx+0x40],xmm0
     14cf81e:	f3 0f 7f 43 50       	movdqu XMMWORD PTR [rbx+0x50],xmm0
     14cf823:	48 83 a3 80 00 00 00 	and    QWORD PTR [rbx+0x80],0x0
     14cf82a:	00 
     14cf82b:	f3 0f 7f 43 60       	movdqu XMMWORD PTR [rbx+0x60],xmm0
     14cf830:	f3 0f 7f 43 70       	movdqu XMMWORD PTR [rbx+0x70],xmm0
     14cf835:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     14cf839:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     14cf83d:	e8 c0 a5 30 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     14cf842:	48 89 d8             	mov    rax,rbx
     14cf845:	48 83 c0 18          	add    rax,0x18
     14cf849:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14cf850:	00 
     14cf851:	49 89 06             	mov    QWORD PTR [r14],rax
     14cf854:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     14cf858:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14cf85d:	48 8d b8 08 01 00 00 	lea    rdi,[rax+0x108]
     14cf864:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
     14cf869:	4c 89 f6             	mov    rsi,r14
     14cf86c:	e8 ab 9f 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14cf871:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14cf875:	e8 0c ec 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf87a:	bf c8 00 00 00       	mov    edi,0xc8
     14cf87f:	e8 7c e6 31 00       	call   17edf00 <_Znwm@plt>
     14cf884:	49 89 c6             	mov    r14,rax
     14cf887:	48 89 c3             	mov    rbx,rax

### 0x14cf8b3: movdqu XMMWORD PTR [r14+0x30],xmm0
     14cf85d:	48 8d b8 08 01 00 00 	lea    rdi,[rax+0x108]
     14cf864:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
     14cf869:	4c 89 f6             	mov    rsi,r14
     14cf86c:	e8 ab 9f 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14cf871:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14cf875:	e8 0c ec 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf87a:	bf c8 00 00 00       	mov    edi,0xc8
     14cf87f:	e8 7c e6 31 00       	call   17edf00 <_Znwm@plt>
     14cf884:	49 89 c6             	mov    r14,rax
     14cf887:	48 89 c3             	mov    rbx,rax
     14cf88a:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf88e:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
     14cf894:	48 8d 05 cd db 32 00 	lea    rax,[rip+0x32dbcd]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14cf89b:	49 89 06             	mov    QWORD PTR [r14],rax
     14cf89e:	4d 8d 6e 18          	lea    r13,[r14+0x18]
     14cf8a2:	48 8d 05 2f 9d 3a 00 	lea    rax,[rip+0x3a9d2f]        # 18795d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35cc0>
     14cf8a9:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14cf8ad:	f3 41 0f 7f 46 20    	movdqu XMMWORD PTR [r14+0x20],xmm0
     14cf8b3:	f3 41 0f 7f 46 30    	movdqu XMMWORD PTR [r14+0x30],xmm0
     14cf8b9:	41 c7 46 40 00 00 80 	mov    DWORD PTR [r14+0x40],0x3f800000
     14cf8c0:	3f 
     14cf8c1:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     14cf8c6:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     14cf8ca:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
     14cf8ce:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0
     14cf8d4:	48 85 c0             	test   rax,rax
     14cf8d7:	74 05                	je     14cf8de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314e62>
     14cf8d9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14cf8de:	49 8d 46 20          	lea    rax,[r14+0x20]
     14cf8e2:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     14cf8e7:	49 8d 7e 58          	lea    rdi,[r14+0x58]
     14cf8eb:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
     14cf8f2:	00 
     14cf8f3:	e8 08 71 00 00       	call   14d6a00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31bf84>
     14cf8f8:	49 81 c6 b0 00 00 00 	add    r14,0xb0
     14cf8ff:	4c 89 f7             	mov    rdi,r14
     14cf902:	e8 ef a0 30 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>

### 0x14cf9b0: mov    r14,QWORD PTR [rax+0x30]
     14cf964:	e8 89 a2 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14cf969:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     14cf96d:	e8 14 eb 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf972:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14cf979:	00 
     14cf97a:	e8 69 ae 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14cf97f:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14cf986:	00 
     14cf987:	4d 89 2e             	mov    QWORD PTR [r14],r13
     14cf98a:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     14cf98e:	31 ff                	xor    edi,edi
     14cf990:	e8 87 ea 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14cf995:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     14cf99a:	4c 89 f6             	mov    rsi,r14
     14cf99d:	e8 7a 9e 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14cf9a2:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14cf9a6:	e8 db ea 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf9ab:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     14cf9b0:	4c 8b 70 30          	mov    r14,QWORD PTR [rax+0x30]
     14cf9b4:	bf 90 01 00 00       	mov    edi,0x190
     14cf9b9:	e8 42 e5 31 00       	call   17edf00 <_Znwm@plt>
     14cf9be:	49 89 c7             	mov    r15,rax
     14cf9c1:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf9c5:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14cf9ca:	48 8d 05 87 a0 3a 00 	lea    rax,[rip+0x3aa087]        # 1879a58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36140>
     14cf9d1:	49 89 07             	mov    QWORD PTR [r15],rax
     14cf9d4:	66 0f 6f 84 24 10 01 	movdqa xmm0,XMMWORD PTR [rsp+0x110]
     14cf9db:	00 00 
     14cf9dd:	f3 41 0f 7f 47 18    	movdqu XMMWORD PTR [r15+0x18],xmm0
     14cf9e3:	66 48 0f 3a 16 c5 01 	pextrq rbp,xmm0,0x1
     14cf9ea:	48 85 ed             	test   rbp,rbp
     14cf9ed:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
     14cf9f2:	48 8b 8c 24 90 00 00 	mov    rcx,QWORD PTR [rsp+0x90]
     14cf9f9:	00 
     14cf9fa:	74 05                	je     14cfa01 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314f85>
     14cf9fc:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
     14cfa01:	49 89 4f 28          	mov    QWORD PTR [r15+0x28],rcx

### 0x14cfa05: mov    QWORD PTR [r15+0x30],rax
     14cf9b4:	bf 90 01 00 00       	mov    edi,0x190
     14cf9b9:	e8 42 e5 31 00       	call   17edf00 <_Znwm@plt>
     14cf9be:	49 89 c7             	mov    r15,rax
     14cf9c1:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf9c5:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14cf9ca:	48 8d 05 87 a0 3a 00 	lea    rax,[rip+0x3aa087]        # 1879a58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36140>
     14cf9d1:	49 89 07             	mov    QWORD PTR [r15],rax
     14cf9d4:	66 0f 6f 84 24 10 01 	movdqa xmm0,XMMWORD PTR [rsp+0x110]
     14cf9db:	00 00 
     14cf9dd:	f3 41 0f 7f 47 18    	movdqu XMMWORD PTR [r15+0x18],xmm0
     14cf9e3:	66 48 0f 3a 16 c5 01 	pextrq rbp,xmm0,0x1
     14cf9ea:	48 85 ed             	test   rbp,rbp
     14cf9ed:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
     14cf9f2:	48 8b 8c 24 90 00 00 	mov    rcx,QWORD PTR [rsp+0x90]
     14cf9f9:	00 
     14cf9fa:	74 05                	je     14cfa01 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314f85>
     14cf9fc:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
     14cfa01:	49 89 4f 28          	mov    QWORD PTR [r15+0x28],rcx
     14cfa05:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
     14cfa09:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14cfa0e:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14cfa13:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     14cfa17:	0f 28 01             	movaps xmm0,XMMWORD PTR [rcx]
     14cfa1a:	41 0f 11 47 38       	movups XMMWORD PTR [r15+0x38],xmm0
     14cfa1f:	48 85 c0             	test   rax,rax
     14cfa22:	74 05                	je     14cfa29 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314fad>
     14cfa24:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14cfa29:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14cfa2e:	48 8b 81 00 01 00 00 	mov    rax,QWORD PTR [rcx+0x100]
     14cfa35:	0f 10 81 f8 00 00 00 	movups xmm0,XMMWORD PTR [rcx+0xf8]
     14cfa3c:	41 0f 11 47 48       	movups XMMWORD PTR [r15+0x48],xmm0
     14cfa41:	48 85 c0             	test   rax,rax
     14cfa44:	74 05                	je     14cfa4b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314fcf>
     14cfa46:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14cfa4b:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     14cfa50:	48 8b 81 98 00 00 00 	mov    rax,QWORD PTR [rcx+0x98]
     14cfa57:	0f 10 81 90 00 00 00 	movups xmm0,XMMWORD PTR [rcx+0x90]

### 0x14d02ba: mov    QWORD PTR [r15+0x30],rbx
     14d026c:	f0 49 ff 06          	lock inc QWORD PTR [r14]
     14d0270:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
     14d0275:	49 8b 5c 24 48       	mov    rbx,QWORD PTR [r12+0x48]
     14d027a:	bf b0 00 00 00       	mov    edi,0xb0
     14d027f:	e8 7c dc 31 00       	call   17edf00 <_Znwm@plt>
     14d0284:	49 89 c7             	mov    r15,rax
     14d0287:	66 0f ef c0          	pxor   xmm0,xmm0
     14d028b:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
     14d028f:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
     14d0294:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     14d0298:	49 89 6f 18          	mov    QWORD PTR [r15+0x18],rbp
     14d029c:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
     14d02a1:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]
     14d02a6:	41 0f 10 04 24       	movups xmm0,XMMWORD PTR [r12]
     14d02ab:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
     14d02b0:	48 85 c0             	test   rax,rax
     14d02b3:	74 05                	je     14d02ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31583e>
     14d02b5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d02ba:	49 89 5f 30          	mov    QWORD PTR [r15+0x30],rbx
     14d02be:	66 0f 6f 84 24 60 01 	movdqa xmm0,XMMWORD PTR [rsp+0x160]
     14d02c5:	00 00 
     14d02c7:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0
     14d02cd:	66 48 0f 3a 16 c5 01 	pextrq rbp,xmm0,0x1
     14d02d4:	48 85 ed             	test   rbp,rbp
     14d02d7:	74 05                	je     14d02de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x315862>
     14d02d9:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
     14d02de:	49 8d 5f 48          	lea    rbx,[r15+0x48]
     14d02e2:	48 89 df             	mov    rdi,rbx
     14d02e5:	e8 0c 97 30 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     14d02ea:	4d 8d 77 58          	lea    r14,[r15+0x58]
     14d02ee:	66 0f ef c0          	pxor   xmm0,xmm0
     14d02f2:	f3 41 0f 7f 87 98 00 	movdqu XMMWORD PTR [r15+0x98],xmm0
     14d02f9:	00 00 
     14d02fb:	f3 41 0f 7f 87 88 00 	movdqu XMMWORD PTR [r15+0x88],xmm0
     14d0302:	00 00 
     14d0304:	f3 41 0f 7f 47 78    	movdqu XMMWORD PTR [r15+0x78],xmm0
     14d030a:	f3 41 0f 7f 47 68    	movdqu XMMWORD PTR [r15+0x68],xmm0

### 0x14d050a: movdqu XMMWORD PTR [r12+0x30],xmm0
     14d04b7:	48 8d 05 aa cf 32 00 	lea    rax,[rip+0x32cfaa]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14d04be:	49 89 04 24          	mov    QWORD PTR [r12],rax
     14d04c2:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d04c7:	66 0f 6f 80 80 00 00 	movdqa xmm0,XMMWORD PTR [rax+0x80]
     14d04ce:	00 
     14d04cf:	48 8b 80 88 00 00 00 	mov    rax,QWORD PTR [rax+0x88]
     14d04d6:	48 85 c0             	test   rax,rax
     14d04d9:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
     14d04de:	74 05                	je     14d04e5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x315a69>
     14d04e0:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d04e5:	48 8d 05 6c 98 3a 00 	lea    rax,[rip+0x3a986c]        # 1879d58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36440>
     14d04ec:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
     14d04f1:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     14d04f5:	66 0f 6f 09          	movdqa xmm1,XMMWORD PTR [rcx]
     14d04f9:	f3 41 0f 7f 4c 24 20 	movdqu XMMWORD PTR [r12+0x20],xmm1
     14d0500:	48 85 c0             	test   rax,rax
     14d0503:	74 05                	je     14d050a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x315a8e>
     14d0505:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d050a:	f3 41 0f 7f 44 24 30 	movdqu XMMWORD PTR [r12+0x30],xmm0
     14d0511:	66 49 0f 3a 16 c5 01 	pextrq r13,xmm0,0x1
     14d0518:	4d 85 ed             	test   r13,r13
     14d051b:	74 05                	je     14d0522 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x315aa6>
     14d051d:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
     14d0522:	4d 89 7c 24 40       	mov    QWORD PTR [r12+0x40],r15
     14d0527:	49 89 5c 24 48       	mov    QWORD PTR [r12+0x48],rbx
     14d052c:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
     14d0531:	48 83 a4 24 e0 02 00 	and    QWORD PTR [rsp+0x2e0],0x0
     14d0538:	00 00 
     14d053a:	4d 89 74 24 50       	mov    QWORD PTR [r12+0x50],r14
     14d053f:	49 8d 7c 24 58       	lea    rdi,[r12+0x58]
     14d0544:	e8 b9 98 30 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     14d0549:	4d 89 e7             	mov    r15,r12
     14d054c:	49 83 c7 18          	add    r15,0x18
     14d0550:	4c 89 ef             	mov    rdi,r13
     14d0553:	e8 2e df 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0558:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14d055f:	00 

### 0x14d0607: movups XMMWORD PTR [r15+0x30],xmm0
     14d05b9:	49 89 c7             	mov    r15,rax
     14d05bc:	66 0f ef c0          	pxor   xmm0,xmm0
     14d05c0:	f3 0f 7f 43 08       	movdqu XMMWORD PTR [rbx+0x8],xmm0
     14d05c5:	48 8d 05 9c ce 32 00 	lea    rax,[rip+0x32ce9c]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14d05cc:	48 89 03             	mov    QWORD PTR [rbx],rax
     14d05cf:	48 8d 05 3a 9c 3a 00 	lea    rax,[rip+0x3a9c3a]        # 187a210 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x368f8>
     14d05d6:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     14d05da:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
     14d05df:	41 0f 28 44 24 20    	movaps xmm0,XMMWORD PTR [r12+0x20]
     14d05e5:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
     14d05e9:	48 85 c0             	test   rax,rax
     14d05ec:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
     14d05f1:	74 05                	je     14d05f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x315b7c>
     14d05f3:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d05f8:	48 89 ac 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rbp
     14d05ff:	00 
     14d0600:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     14d0604:	0f 28 01             	movaps xmm0,XMMWORD PTR [rcx]
     14d0607:	41 0f 11 47 30       	movups XMMWORD PTR [r15+0x30],xmm0
     14d060c:	48 85 c0             	test   rax,rax
     14d060f:	74 05                	je     14d0616 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x315b9a>
     14d0611:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d0616:	48 8d 6b 18          	lea    rbp,[rbx+0x18]
     14d061a:	66 0f 6f 84 24 70 01 	movdqa xmm0,XMMWORD PTR [rsp+0x170]
     14d0621:	00 00 
     14d0623:	f3 41 0f 7f 47 40    	movdqu XMMWORD PTR [r15+0x40],xmm0
     14d0629:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
     14d0630:	48 85 c0             	test   rax,rax
     14d0633:	74 05                	je     14d063a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x315bbe>
     14d0635:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d063a:	48 89 84 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rax
     14d0641:	00 
     14d0642:	4c 8d 63 50          	lea    r12,[rbx+0x50]
     14d0646:	4c 89 e7             	mov    rdi,r12
     14d0649:	e8 a8 93 30 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     14d064e:	4c 8d 6b 60          	lea    r13,[rbx+0x60]
     14d0652:	4c 89 ef             	mov    rdi,r13

### 0x14d06d9: mov    r14,QWORD PTR [r15+0x30]
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

### 0x14d07d7: lea    rdi,[rax+0x30]
     14d078f:	4c 89 e7             	mov    rdi,r12
     14d0792:	48 89 de             	mov    rsi,rbx
     14d0795:	4c 89 f2             	mov    rdx,r14
     14d0798:	e8 73 d3 01 00       	call   14edb10 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333094>
     14d079d:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     14d07a2:	4c 89 e6             	mov    rsi,r12
     14d07a5:	e8 48 94 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d07aa:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     14d07af:	e8 d2 dc 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d07b4:	4c 89 f7             	mov    rdi,r14
     14d07b7:	e8 2c a0 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d07bc:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
     14d07c3:	00 
     14d07c4:	48 89 2b             	mov    QWORD PTR [rbx],rbp
     14d07c7:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
     14d07cb:	31 ff                	xor    edi,edi
     14d07cd:	e8 4a dc 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d07d2:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d07d7:	48 8d 78 30          	lea    rdi,[rax+0x30]
     14d07db:	48 89 de             	mov    rsi,rbx
     14d07de:	e8 39 90 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14d07e3:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d07e7:	e8 9a dc 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d07ec:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     14d07f1:	4c 8b 70 48          	mov    r14,QWORD PTR [rax+0x48]
     14d07f5:	6a 50                	push   0x50
     14d07f7:	5f                   	pop    rdi
     14d07f8:	e8 03 d7 31 00       	call   17edf00 <_Znwm@plt>
     14d07fd:	48 89 c3             	mov    rbx,rax
     14d0800:	66 0f ef c0          	pxor   xmm0,xmm0
     14d0804:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d0809:	48 8d 05 58 cc 32 00 	lea    rax,[rip+0x32cc58]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14d0810:	48 89 03             	mov    QWORD PTR [rbx],rax
     14d0813:	48 8d 05 8e 95 3a 00 	lea    rax,[rip+0x3a958e]        # 1879da8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36490>
     14d081a:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     14d081e:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]
     14d0823:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]

### 0x14d0834: mov    r12,QWORD PTR [rsp+0x30]
     14d07e7:	e8 9a dc 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d07ec:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     14d07f1:	4c 8b 70 48          	mov    r14,QWORD PTR [rax+0x48]
     14d07f5:	6a 50                	push   0x50
     14d07f7:	5f                   	pop    rdi
     14d07f8:	e8 03 d7 31 00       	call   17edf00 <_Znwm@plt>
     14d07fd:	48 89 c3             	mov    rbx,rax
     14d0800:	66 0f ef c0          	pxor   xmm0,xmm0
     14d0804:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d0809:	48 8d 05 58 cc 32 00 	lea    rax,[rip+0x32cc58]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14d0810:	48 89 03             	mov    QWORD PTR [rbx],rax
     14d0813:	48 8d 05 8e 95 3a 00 	lea    rax,[rip+0x3a958e]        # 1879da8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36490>
     14d081a:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     14d081e:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]
     14d0823:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
     14d0827:	66 41 0f 6f 07       	movdqa xmm0,XMMWORD PTR [r15]
     14d082c:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
     14d0831:	48 85 c0             	test   rax,rax
     14d0834:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]
     14d0839:	74 05                	je     14d0840 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x315dc4>
     14d083b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d0840:	4c 89 73 30          	mov    QWORD PTR [rbx+0x30],r14
     14d0844:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
     14d0848:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
     14d084d:	e8 ee d6 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14d0852:	48 89 d8             	mov    rax,rbx
     14d0855:	48 83 c0 18          	add    rax,0x18
     14d0859:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d0860:	00 
     14d0861:	49 89 06             	mov    QWORD PTR [r14],rax
     14d0864:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     14d0868:	31 ff                	xor    edi,edi
     14d086a:	e8 ad db 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d086f:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d0874:	48 8d 78 40          	lea    rdi,[rax+0x40]
     14d0878:	48 89 bc 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rdi
     14d087f:	00 

### 0x14d0840: mov    QWORD PTR [rbx+0x30],r14
     14d07f5:	6a 50                	push   0x50
     14d07f7:	5f                   	pop    rdi
     14d07f8:	e8 03 d7 31 00       	call   17edf00 <_Znwm@plt>
     14d07fd:	48 89 c3             	mov    rbx,rax
     14d0800:	66 0f ef c0          	pxor   xmm0,xmm0
     14d0804:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d0809:	48 8d 05 58 cc 32 00 	lea    rax,[rip+0x32cc58]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14d0810:	48 89 03             	mov    QWORD PTR [rbx],rax
     14d0813:	48 8d 05 8e 95 3a 00 	lea    rax,[rip+0x3a958e]        # 1879da8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36490>
     14d081a:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     14d081e:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]
     14d0823:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
     14d0827:	66 41 0f 6f 07       	movdqa xmm0,XMMWORD PTR [r15]
     14d082c:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
     14d0831:	48 85 c0             	test   rax,rax
     14d0834:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]
     14d0839:	74 05                	je     14d0840 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x315dc4>
     14d083b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d0840:	4c 89 73 30          	mov    QWORD PTR [rbx+0x30],r14
     14d0844:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
     14d0848:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
     14d084d:	e8 ee d6 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14d0852:	48 89 d8             	mov    rax,rbx
     14d0855:	48 83 c0 18          	add    rax,0x18
     14d0859:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d0860:	00 
     14d0861:	49 89 06             	mov    QWORD PTR [r14],rax
     14d0864:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     14d0868:	31 ff                	xor    edi,edi
     14d086a:	e8 ad db 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d086f:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d0874:	48 8d 78 40          	lea    rdi,[rax+0x40]
     14d0878:	48 89 bc 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rdi
     14d087f:	00 
     14d0880:	4c 89 f6             	mov    rsi,r14
     14d0883:	e8 94 8f 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14d0888:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]

### 0x14d0b60: and    QWORD PTR [r12+0x30],0x0
     14d0b16:	00 
     14d0b17:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     14d0b1b:	0f 28 01             	movaps xmm0,XMMWORD PTR [rcx]
     14d0b1e:	0f 11 45 00          	movups XMMWORD PTR [rbp+0x0],xmm0
     14d0b22:	48 85 c0             	test   rax,rax
     14d0b25:	74 05                	je     14d0b2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3160b0>
     14d0b27:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d0b2c:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14d0b31:	48 8b 81 f0 00 00 00 	mov    rax,QWORD PTR [rcx+0xf0]
     14d0b38:	f3 0f 6f 81 e8 00 00 	movdqu xmm0,XMMWORD PTR [rcx+0xe8]
     14d0b3f:	00 
     14d0b40:	f3 41 0f 7f 44 24 10 	movdqu XMMWORD PTR [r12+0x10],xmm0
     14d0b47:	48 85 c0             	test   rax,rax
     14d0b4a:	74 05                	je     14d0b51 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3160d5>
     14d0b4c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d0b51:	4c 8d 7d 20          	lea    r15,[rbp+0x20]
     14d0b55:	66 0f ef c0          	pxor   xmm0,xmm0
     14d0b59:	f3 41 0f 7f 44 24 20 	movdqu XMMWORD PTR [r12+0x20],xmm0
     14d0b60:	49 83 64 24 30 00    	and    QWORD PTR [r12+0x30],0x0
     14d0b66:	48 8d 7d 38          	lea    rdi,[rbp+0x38]
     14d0b6a:	48 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],rdi
     14d0b6f:	e8 82 8e 30 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     14d0b74:	48 8d 7d 48          	lea    rdi,[rbp+0x48]
     14d0b78:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
     14d0b7f:	00 
     14d0b80:	e8 71 8e 30 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     14d0b85:	48 83 c5 58          	add    rbp,0x58
     14d0b89:	48 89 ef             	mov    rdi,rbp
     14d0b8c:	e8 65 8e 30 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     14d0b91:	6a 07                	push   0x7
     14d0b93:	5e                   	pop    rsi
     14d0b94:	4c 89 ff             	mov    rdi,r15
     14d0b97:	e8 66 96 6b ff       	call   b8a202 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd71a2>
     14d0b9c:	49 8b 5c 24 10       	mov    rbx,QWORD PTR [r12+0x10]
     14d0ba1:	48 8d 35 78 7f f6 fe 	lea    rsi,[rip+0xfffffffffef67f78]        # 438b20 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e56f>
     14d0ba8:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14d0baf:	00 

### 0x14d0fd6: call   QWORD PTR [rax+0x30]
     14d0f91:	e8 52 98 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d0f96:	4d 8b 74 24 10       	mov    r14,QWORD PTR [r12+0x10]
     14d0f9b:	4c 8d 84 24 f0 01 00 	lea    r8,[rsp+0x1f0]
     14d0fa2:	00 
     14d0fa3:	4d 89 20             	mov    QWORD PTR [r8],r12
     14d0fa6:	48 8d 35 e4 c0 5c ff 	lea    rsi,[rip+0xffffffffff5cc0e4]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d0fad:	48 8d 0d ae 63 01 00 	lea    rcx,[rip+0x163ae]        # 14e7362 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32c8e6>
     14d0fb4:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]
     14d0fbb:	00 
     14d0fbc:	6a 08                	push   0x8
     14d0fbe:	41 59                	pop    r9
     14d0fc0:	4c 89 ef             	mov    rdi,r13
     14d0fc3:	31 d2                	xor    edx,edx
     14d0fc5:	e8 ca 97 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d0fca:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d0fcd:	48 89 df             	mov    rdi,rbx
     14d0fd0:	4c 89 f6             	mov    rsi,r14
     14d0fd3:	4c 89 ea             	mov    rdx,r13
     14d0fd6:	ff 50 30             	call   QWORD PTR [rax+0x30]
     14d0fd9:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14d0fe0:	00 
     14d0fe1:	4c 89 ff             	mov    rdi,r15
     14d0fe4:	e8 71 ac 5e ff       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>
     14d0fe9:	4c 8b 6c 24 40       	mov    r13,QWORD PTR [rsp+0x40]
     14d0fee:	48 8b bc 24 a8 03 00 	mov    rdi,QWORD PTR [rsp+0x3a8]
     14d0ff5:	00 
     14d0ff6:	e8 8b d4 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0ffb:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d1002:	00 
     14d1003:	e8 e0 97 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1008:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d100d:	48 8d b8 b0 00 00 00 	lea    rdi,[rax+0xb0]
     14d1014:	48 8d 9c 24 a0 01 00 	lea    rbx,[rsp+0x1a0]
     14d101b:	00 
     14d101c:	48 83 23 00          	and    QWORD PTR [rbx],0x0
     14d1020:	4c 89 e6             	mov    rsi,r12
     14d1023:	e8 ca ca ff ff       	call   14cdaf2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313076>

### 0x14d10d2: mov    QWORD PTR [r15+0x30],r14
     14d1083:	45 31 c9             	xor    r9d,r9d
     14d1086:	e8 ff 62 11 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
     14d108b:	89 c5                	mov    ebp,eax
     14d108d:	bf 28 01 00 00       	mov    edi,0x128
     14d1092:	e8 69 ce 31 00       	call   17edf00 <_Znwm@plt>
     14d1097:	49 89 c7             	mov    r15,rax
     14d109a:	66 0f ef c0          	pxor   xmm0,xmm0
     14d109e:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d10a3:	48 8d 05 3e 83 3a 00 	lea    rax,[rip+0x3a833e]        # 18793e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35ad0>
     14d10aa:	49 89 07             	mov    QWORD PTR [r15],rax
     14d10ad:	48 8d 05 64 85 3a 00 	lea    rax,[rip+0x3a8564]        # 1879618 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35d00>
     14d10b4:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     14d10b8:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
     14d10bc:	66 41 0f 6f 4d 00    	movdqa xmm1,XMMWORD PTR [r13+0x0]
     14d10c2:	f3 41 0f 7f 4f 20    	movdqu XMMWORD PTR [r15+0x20],xmm1
     14d10c8:	48 85 c0             	test   rax,rax
     14d10cb:	74 05                	je     14d10d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x316656>
     14d10cd:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d10d2:	4d 89 77 30          	mov    QWORD PTR [r15+0x30],r14
     14d10d6:	49 8d 5f 50          	lea    rbx,[r15+0x50]
     14d10da:	49 8d 7f 68          	lea    rdi,[r15+0x68]
     14d10de:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0
     14d10e4:	f3 41 0f 7f 47 48    	movdqu XMMWORD PTR [r15+0x48],xmm0
     14d10ea:	f3 41 0f 7f 47 58    	movdqu XMMWORD PTR [r15+0x58],xmm0
     14d10f0:	48 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],rdi
     14d10f5:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
     14d10fa:	e8 41 ce 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14d10ff:	4d 8d 67 18          	lea    r12,[r15+0x18]
     14d1103:	41 88 af 80 00 00 00 	mov    BYTE PTR [r15+0x80],bpl
     14d110a:	8a 84 24 88 00 00 00 	mov    al,BYTE PTR [rsp+0x88]
     14d1111:	41 88 87 81 00 00 00 	mov    BYTE PTR [r15+0x81],al
     14d1118:	31 c0                	xor    eax,eax
     14d111a:	41 88 87 82 00 00 00 	mov    BYTE PTR [r15+0x82],al
     14d1121:	8a 8c 24 c0 00 00 00 	mov    cl,BYTE PTR [rsp+0xc0]
     14d1128:	41 88 8f 83 00 00 00 	mov    BYTE PTR [r15+0x83],cl
     14d112f:	8a 8c 24 b8 00 00 00 	mov    cl,BYTE PTR [rsp+0xb8]
     14d1136:	41 88 8f 84 00 00 00 	mov    BYTE PTR [r15+0x84],cl

### 0x14d1254: call   QWORD PTR [rax+0x30]
     14d120f:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     14d1214:	4c 8b 68 10          	mov    r13,QWORD PTR [rax+0x10]
     14d1218:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d121f:	00 
     14d1220:	4d 89 20             	mov    QWORD PTR [r8],r12
     14d1223:	48 8d 35 67 be 5c ff 	lea    rsi,[rip+0xffffffffff5cbe67]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d122a:	48 8d 0d c5 70 00 00 	lea    rcx,[rip+0x70c5]        # 14d82f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31d87a>
     14d1231:	48 8d ac 24 e0 02 00 	lea    rbp,[rsp+0x2e0]
     14d1238:	00 
     14d1239:	6a 08                	push   0x8
     14d123b:	41 59                	pop    r9
     14d123d:	48 89 ef             	mov    rdi,rbp
     14d1240:	31 d2                	xor    edx,edx
     14d1242:	e8 4d 95 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d1247:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     14d124b:	4c 89 f7             	mov    rdi,r14
     14d124e:	4c 89 ee             	mov    rsi,r13
     14d1251:	48 89 ea             	mov    rdx,rbp
     14d1254:	ff 50 30             	call   QWORD PTR [rax+0x30]
     14d1257:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14d125e:	00 
     14d125f:	48 89 df             	mov    rdi,rbx
     14d1262:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
     14d1267:	e8 ee a9 5e ff       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>
     14d126c:	48 8b bc 24 a8 03 00 	mov    rdi,QWORD PTR [rsp+0x3a8]
     14d1273:	00 
     14d1274:	e8 0d d2 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d1279:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]
     14d1280:	00 
     14d1281:	4c 89 ef             	mov    rdi,r13
     14d1284:	e8 5f 95 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1289:	31 ff                	xor    edi,edi
     14d128b:	e8 8c d1 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d1290:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d1295:	4c 89 a0 90 00 00 00 	mov    QWORD PTR [rax+0x90],r12
     14d129c:	48 8b b8 98 00 00 00 	mov    rdi,QWORD PTR [rax+0x98]
     14d12a3:	4c 89 b8 98 00 00 00 	mov    QWORD PTR [rax+0x98],r15

### 0x14d1687: lea    rdi,[rbx+0x30]
     14d1637:	4c 89 fa             	mov    rdx,r15
     14d163a:	45 31 c9             	xor    r9d,r9d
     14d163d:	e8 48 5d 11 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
     14d1642:	41 89 c7             	mov    r15d,eax
     14d1645:	bf a0 01 00 00       	mov    edi,0x1a0
     14d164a:	e8 b1 c8 31 00       	call   17edf00 <_Znwm@plt>
     14d164f:	48 89 c3             	mov    rbx,rax
     14d1652:	66 0f ef c0          	pxor   xmm0,xmm0
     14d1656:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d165b:	48 8d 05 0e 51 36 00 	lea    rax,[rip+0x36510e]        # 1836770 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8708>
     14d1662:	48 89 03             	mov    QWORD PTR [rbx],rax
     14d1665:	48 8d 05 cc 74 37 00 	lea    rax,[rip+0x3774cc]        # 1848b38 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5220>
     14d166c:	48 89 84 24 b0 02 00 	mov    QWORD PTR [rsp+0x2b0],rax
     14d1673:	00 
     14d1674:	4c 89 b4 24 d0 02 00 	mov    QWORD PTR [rsp+0x2d0],r14
     14d167b:	00 
     14d167c:	48 8d 05 d5 97 3a 00 	lea    rax,[rip+0x3a97d5]        # 187ae58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x37540>
     14d1683:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
     14d1687:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     14d168b:	48 89 bc 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rdi
     14d1692:	00 
     14d1693:	4c 89 f6             	mov    rsi,r14
     14d1696:	48 89 9c 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rbx
     14d169d:	00 
     14d169e:	e8 ed 8b 5a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     14d16a3:	0f 28 84 24 70 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x170]
     14d16aa:	00 
     14d16ab:	0f 29 43 60          	movaps XMMWORD PTR [rbx+0x60],xmm0
     14d16af:	48 8b 84 24 58 01 00 	mov    rax,QWORD PTR [rsp+0x158]
     14d16b6:	00 
     14d16b7:	48 85 c0             	test   rax,rax
     14d16ba:	74 05                	je     14d16c1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x316c45>
     14d16bc:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d16c1:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14d16c6:	48 8b 81 88 00 00 00 	mov    rax,QWORD PTR [rcx+0x88]
     14d16cd:	0f 28 81 80 00 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x80]
     14d16d4:	0f 29 43 70          	movaps XMMWORD PTR [rbx+0x70],xmm0

### 0x14d1d87: mov    r15,QWORD PTR [r12+0x30]
     14d1d3b:	48 8b bc 24 20 01 00 	mov    rdi,QWORD PTR [rsp+0x120]
     14d1d42:	00 
     14d1d43:	48 89 de             	mov    rsi,rbx
     14d1d46:	e8 a7 7e 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d1d4b:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d1d4f:	e8 32 c7 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d1d54:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d1d5b:	00 
     14d1d5c:	e8 87 8a 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1d61:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14d1d68:	00 
     14d1d69:	e8 fc 81 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14d1d6e:	31 ff                	xor    edi,edi
     14d1d70:	e8 a7 c6 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d1d75:	49 8b 74 24 60       	mov    rsi,QWORD PTR [r12+0x60]
     14d1d7a:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     14d1d81:	00 
     14d1d82:	e8 1f 7b 11 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
     14d1d87:	4d 8b 7c 24 30       	mov    r15,QWORD PTR [r12+0x30]
     14d1d8c:	48 8d 84 24 50 02 00 	lea    rax,[rsp+0x250]
     14d1d93:	00 
     14d1d94:	48 8d 0d 45 cb 33 00 	lea    rcx,[rip+0x33cb45]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
     14d1d9b:	48 89 08             	mov    QWORD PTR [rax],rcx
     14d1d9e:	48 8b 0d 03 fd 3d 00 	mov    rcx,QWORD PTR [rip+0x3dfd03]        # 18b1aa8 <_ZNSt6__ndk16chrono12steady_clock3nowEv@@Base+0xeaf8e8>
     14d1da5:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     14d1da9:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
     14d1dad:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]
     14d1db2:	4d 8b 74 24 48       	mov    r14,QWORD PTR [r12+0x48]
     14d1db7:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     14d1dba:	48 8d 35 23 68 f6 fe 	lea    rsi,[rip+0xfffffffffef66823]        # 4385e4 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e033>
     14d1dc1:	48 8d 0d 28 68 f6 fe 	lea    rcx,[rip+0xfffffffffef66828]        # 4385f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e03f>
     14d1dc8:	6a 08                	push   0x8
     14d1dca:	5b                   	pop    rbx
     14d1dcb:	6a 23                	push   0x23
     14d1dcd:	41 58                	pop    r8
     14d1dcf:	6a 01                	push   0x1
     14d1dd1:	41 59                	pop    r9

### 0x14d21fd: mov    rax,QWORD PTR [r12+0x30]
     14d21b4:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14d21bb:	00 
     14d21bc:	48 89 df             	mov    rdi,rbx
     14d21bf:	4c 89 f6             	mov    rsi,r14
     14d21c2:	e8 2b 7a 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d21c7:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d21cb:	e8 b6 c2 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d21d0:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14d21d7:	00 
     14d21d8:	48 89 df             	mov    rdi,rbx
     14d21db:	e8 08 86 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d21e0:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d21e7:	00 
     14d21e8:	e8 7d 7d 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14d21ed:	4c 89 bc 24 80 03 00 	mov    QWORD PTR [rsp+0x380],r15
     14d21f4:	00 
     14d21f5:	4c 89 a4 24 88 03 00 	mov    QWORD PTR [rsp+0x388],r12
     14d21fc:	00 
     14d21fd:	49 8b 44 24 30       	mov    rax,QWORD PTR [r12+0x30]
     14d2202:	48 85 c0             	test   rax,rax
     14d2205:	74 0a                	je     14d2211 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x317795>
     14d2207:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     14d220b:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
     14d220f:	75 30                	jne    14d2241 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3177c5>
     14d2211:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
     14d2217:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
     14d221d:	4d 89 7c 24 28       	mov    QWORD PTR [r12+0x28],r15
     14d2222:	49 8b 7c 24 30       	mov    rdi,QWORD PTR [r12+0x30]
     14d2227:	4d 89 64 24 30       	mov    QWORD PTR [r12+0x30],r12
     14d222c:	e8 81 c2 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14d2231:	4c 89 e7             	mov    rdi,r12
     14d2234:	e8 4d c2 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2239:	4c 8b bc 24 80 03 00 	mov    r15,QWORD PTR [rsp+0x380]
     14d2240:	00 
     14d2241:	31 ff                	xor    edi,edi
     14d2243:	e8 d4 c1 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d2248:	41 80 bf 62 01 00 00 	cmp    BYTE PTR [r15+0x162],0x0

### 0x14d2222: mov    rdi,QWORD PTR [r12+0x30]
     14d21d8:	48 89 df             	mov    rdi,rbx
     14d21db:	e8 08 86 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d21e0:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d21e7:	00 
     14d21e8:	e8 7d 7d 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14d21ed:	4c 89 bc 24 80 03 00 	mov    QWORD PTR [rsp+0x380],r15
     14d21f4:	00 
     14d21f5:	4c 89 a4 24 88 03 00 	mov    QWORD PTR [rsp+0x388],r12
     14d21fc:	00 
     14d21fd:	49 8b 44 24 30       	mov    rax,QWORD PTR [r12+0x30]
     14d2202:	48 85 c0             	test   rax,rax
     14d2205:	74 0a                	je     14d2211 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x317795>
     14d2207:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     14d220b:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
     14d220f:	75 30                	jne    14d2241 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3177c5>
     14d2211:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
     14d2217:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
     14d221d:	4d 89 7c 24 28       	mov    QWORD PTR [r12+0x28],r15
     14d2222:	49 8b 7c 24 30       	mov    rdi,QWORD PTR [r12+0x30]
     14d2227:	4d 89 64 24 30       	mov    QWORD PTR [r12+0x30],r12
     14d222c:	e8 81 c2 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14d2231:	4c 89 e7             	mov    rdi,r12
     14d2234:	e8 4d c2 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2239:	4c 8b bc 24 80 03 00 	mov    r15,QWORD PTR [rsp+0x380]
     14d2240:	00 
     14d2241:	31 ff                	xor    edi,edi
     14d2243:	e8 d4 c1 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d2248:	41 80 bf 62 01 00 00 	cmp    BYTE PTR [r15+0x162],0x0
     14d224f:	00 
     14d2250:	75 30                	jne    14d2282 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x317806>
     14d2252:	49 8b 87 e0 00 00 00 	mov    rax,QWORD PTR [r15+0xe0]
     14d2259:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
     14d225d:	e8 4a f7 2e 00       	call   17c19ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175b18>
     14d2262:	84 c0                	test   al,al
     14d2264:	74 14                	je     14d227a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3177fe>
     14d2266:	49 8b bf e0 00 00 00 	mov    rdi,QWORD PTR [r15+0xe0]
     14d226d:	e8 c6 f6 2e 00       	call   17c1938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175aa4>

### 0x14d2227: mov    QWORD PTR [r12+0x30],r12
     14d21db:	e8 08 86 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d21e0:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d21e7:	00 
     14d21e8:	e8 7d 7d 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14d21ed:	4c 89 bc 24 80 03 00 	mov    QWORD PTR [rsp+0x380],r15
     14d21f4:	00 
     14d21f5:	4c 89 a4 24 88 03 00 	mov    QWORD PTR [rsp+0x388],r12
     14d21fc:	00 
     14d21fd:	49 8b 44 24 30       	mov    rax,QWORD PTR [r12+0x30]
     14d2202:	48 85 c0             	test   rax,rax
     14d2205:	74 0a                	je     14d2211 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x317795>
     14d2207:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     14d220b:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
     14d220f:	75 30                	jne    14d2241 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3177c5>
     14d2211:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
     14d2217:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
     14d221d:	4d 89 7c 24 28       	mov    QWORD PTR [r12+0x28],r15
     14d2222:	49 8b 7c 24 30       	mov    rdi,QWORD PTR [r12+0x30]
     14d2227:	4d 89 64 24 30       	mov    QWORD PTR [r12+0x30],r12
     14d222c:	e8 81 c2 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14d2231:	4c 89 e7             	mov    rdi,r12
     14d2234:	e8 4d c2 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2239:	4c 8b bc 24 80 03 00 	mov    r15,QWORD PTR [rsp+0x380]
     14d2240:	00 
     14d2241:	31 ff                	xor    edi,edi
     14d2243:	e8 d4 c1 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d2248:	41 80 bf 62 01 00 00 	cmp    BYTE PTR [r15+0x162],0x0
     14d224f:	00 
     14d2250:	75 30                	jne    14d2282 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x317806>
     14d2252:	49 8b 87 e0 00 00 00 	mov    rax,QWORD PTR [r15+0xe0]
     14d2259:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
     14d225d:	e8 4a f7 2e 00       	call   17c19ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175b18>
     14d2262:	84 c0                	test   al,al
     14d2264:	74 14                	je     14d227a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3177fe>
     14d2266:	49 8b bf e0 00 00 00 	mov    rdi,QWORD PTR [r15+0xe0]
     14d226d:	e8 c6 f6 2e 00       	call   17c1938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175aa4>
     14d2272:	41 83 a7 e8 00 00 00 	and    DWORD PTR [r15+0xe8],0x0

### 0x14d23f9: mov    BYTE PTR [rdx+0x30],al
     14d23ab:	74 05                	je     14d23b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x317936>
     14d23ad:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d23b2:	48 8d 05 27 c5 33 00 	lea    rax,[rip+0x33c527]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
     14d23b9:	48 89 84 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],rax
     14d23c0:	00 
     14d23c1:	48 8b 05 e0 f6 3d 00 	mov    rax,QWORD PTR [rip+0x3df6e0]        # 18b1aa8 <_ZNSt6__ndk16chrono12steady_clock3nowEv@@Base+0xeaf8e8>
     14d23c8:	48 89 84 24 e8 02 00 	mov    QWORD PTR [rsp+0x2e8],rax
     14d23cf:	00 
     14d23d0:	48 89 9c 24 00 03 00 	mov    QWORD PTR [rsp+0x300],rbx
     14d23d7:	00 
     14d23d8:	48 8d 05 61 72 3a 00 	lea    rax,[rip+0x3a7261]        # 1879640 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35d28>
     14d23df:	48 8b 54 24 50       	mov    rdx,QWORD PTR [rsp+0x50]
     14d23e4:	48 89 42 20          	mov    QWORD PTR [rdx+0x20],rax
     14d23e8:	8a 44 24 70          	mov    al,BYTE PTR [rsp+0x70]
     14d23ec:	88 42 28             	mov    BYTE PTR [rdx+0x28],al
     14d23ef:	40 88 6a 29          	mov    BYTE PTR [rdx+0x29],bpl
     14d23f3:	44 88 72 2a          	mov    BYTE PTR [rdx+0x2a],r14b
     14d23f7:	31 c0                	xor    eax,eax
     14d23f9:	88 42 30             	mov    BYTE PTR [rdx+0x30],al
     14d23fc:	88 42 48             	mov    BYTE PTR [rdx+0x48],al
     14d23ff:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14d2404:	48 8b 81 d0 00 00 00 	mov    rax,QWORD PTR [rcx+0xd0]
     14d240b:	0f 10 89 c8 00 00 00 	movups xmm1,XMMWORD PTR [rcx+0xc8]
     14d2412:	0f 29 4a 50          	movaps XMMWORD PTR [rdx+0x50],xmm1
     14d2416:	48 85 c0             	test   rax,rax
     14d2419:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
     14d241e:	74 05                	je     14d2425 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3179a9>
     14d2420:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d2425:	0f 57 c9             	xorps  xmm1,xmm1
     14d2428:	0f 29 4a 60          	movaps XMMWORD PTR [rdx+0x60],xmm1
     14d242c:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
     14d2430:	41 0f 28 4d 00       	movaps xmm1,XMMWORD PTR [r13+0x0]
     14d2435:	0f 29 4a 70          	movaps XMMWORD PTR [rdx+0x70],xmm1
     14d2439:	48 85 c0             	test   rax,rax
     14d243c:	74 05                	je     14d2443 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3179c7>
     14d243e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d2443:	48 8b 8c 24 c8 00 00 	mov    rcx,QWORD PTR [rsp+0xc8]

### 0x14d2572: mov    r14,QWORD PTR [r12+0x30]
     14d251e:	49 89 87 28 01 00 00 	mov    QWORD PTR [r15+0x128],rax
     14d2525:	31 c0                	xor    eax,eax
     14d2527:	41 88 87 30 01 00 00 	mov    BYTE PTR [r15+0x130],al
     14d252e:	41 88 87 48 01 00 00 	mov    BYTE PTR [r15+0x148],al
     14d2535:	66 0f ef c0          	pxor   xmm0,xmm0
     14d2539:	66 41 0f 7f 87 50 01 	movdqa XMMWORD PTR [r15+0x150],xmm0
     14d2540:	00 00 
     14d2542:	49 83 a7 60 01 00 00 	and    QWORD PTR [r15+0x160],0x0
     14d2549:	00 
     14d254a:	49 8d bf 68 01 00 00 	lea    rdi,[r15+0x168]
     14d2551:	e8 ac 78 30 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     14d2556:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d255d:	00 
     14d255e:	e8 07 7a 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14d2563:	48 89 df             	mov    rdi,rbx
     14d2566:	e8 1b bf 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d256b:	31 ff                	xor    edi,edi
     14d256d:	e8 aa be 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d2572:	4d 8b 74 24 30       	mov    r14,QWORD PTR [r12+0x30]
     14d2577:	6a 68                	push   0x68
     14d2579:	5f                   	pop    rdi
     14d257a:	e8 81 b9 31 00       	call   17edf00 <_Znwm@plt>
     14d257f:	48 89 c3             	mov    rbx,rax
     14d2582:	48 8d 05 c7 79 3a 00 	lea    rax,[rip+0x3a79c7]        # 1879f50 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36638>
     14d2589:	48 89 03             	mov    QWORD PTR [rbx],rax
     14d258c:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
     14d2590:	31 c0                	xor    eax,eax
     14d2592:	88 43 10             	mov    BYTE PTR [rbx+0x10],al
     14d2595:	88 43 18             	mov    BYTE PTR [rbx+0x18],al
     14d2598:	48 89 d8             	mov    rax,rbx
     14d259b:	48 83 c0 28          	add    rax,0x28
     14d259f:	66 0f ef c0          	pxor   xmm0,xmm0
     14d25a3:	f3 0f 7f 43 28       	movdqu XMMWORD PTR [rbx+0x28],xmm0
     14d25a8:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
     14d25ac:	f3 0f 7f 43 38       	movdqu XMMWORD PTR [rbx+0x38],xmm0
     14d25b1:	f3 0f 7f 43 48       	movdqu XMMWORD PTR [rbx+0x48],xmm0
     14d25b6:	f3 0f 7f 43 58       	movdqu XMMWORD PTR [rbx+0x58],xmm0

### 0x14d2609: movups XMMWORD PTR [rbp+0x30],xmm0
     14d25b6:	f3 0f 7f 43 58       	movdqu XMMWORD PTR [rbx+0x58],xmm0
     14d25bb:	bf 20 02 00 00       	mov    edi,0x220
     14d25c0:	e8 3b b9 31 00       	call   17edf00 <_Znwm@plt>
     14d25c5:	48 89 c5             	mov    rbp,rax
     14d25c8:	48 8b 4c 24 50       	mov    rcx,QWORD PTR [rsp+0x50]
     14d25cd:	49 89 cc             	mov    r12,rcx
     14d25d0:	49 83 c4 20          	add    r12,0x20
     14d25d4:	66 0f ef c0          	pxor   xmm0,xmm0
     14d25d8:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d25dd:	48 8d 05 84 ae 32 00 	lea    rax,[rip+0x32ae84]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14d25e4:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     14d25e8:	48 8d 05 d9 70 3a 00 	lea    rax,[rip+0x3a70d9]        # 18796c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35db0>
     14d25ef:	48 89 45 18          	mov    QWORD PTR [rbp+0x18],rax
     14d25f3:	4c 89 65 20          	mov    QWORD PTR [rbp+0x20],r12
     14d25f7:	48 89 4d 28          	mov    QWORD PTR [rbp+0x28],rcx
     14d25fb:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     14d2600:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
     14d2604:	41 0f 28 45 00       	movaps xmm0,XMMWORD PTR [r13+0x0]
     14d2609:	0f 11 45 30          	movups XMMWORD PTR [rbp+0x30],xmm0
     14d260d:	48 85 c0             	test   rax,rax
     14d2610:	74 05                	je     14d2617 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x317b9b>
     14d2612:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d2617:	48 8b 8c 24 a0 00 00 	mov    rcx,QWORD PTR [rsp+0xa0]
     14d261e:	00 
     14d261f:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     14d2623:	0f 28 01             	movaps xmm0,XMMWORD PTR [rcx]
     14d2626:	0f 11 45 40          	movups XMMWORD PTR [rbp+0x40],xmm0
     14d262a:	48 85 c0             	test   rax,rax
     14d262d:	74 05                	je     14d2634 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x317bb8>
     14d262f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d2634:	48 8b 8c 24 c8 00 00 	mov    rcx,QWORD PTR [rsp+0xc8]
     14d263b:	00 
     14d263c:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     14d2640:	0f 28 01             	movaps xmm0,XMMWORD PTR [rcx]
     14d2643:	0f 11 45 50          	movups XMMWORD PTR [rbp+0x50],xmm0
     14d2647:	48 85 c0             	test   rax,rax
     14d264a:	74 05                	je     14d2651 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x317bd5>

### 0x14d284a: mov    rdi,QWORD PTR [rbp+0x30]
     14d27f2:	e8 ff 71 30 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     14d27f7:	48 8d bd 78 01 00 00 	lea    rdi,[rbp+0x178]
     14d27fe:	48 89 bc 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rdi
     14d2805:	00 
     14d2806:	e8 83 5a 65 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     14d280b:	0f b6 84 24 e0 00 00 	movzx  eax,BYTE PTR [rsp+0xe0]
     14d2812:	00 
     14d2813:	c1 e0 08             	shl    eax,0x8
     14d2816:	0f b6 4c 24 70       	movzx  ecx,BYTE PTR [rsp+0x70]
     14d281b:	09 c1                	or     ecx,eax
     14d281d:	66 89 8d d0 01 00 00 	mov    WORD PTR [rbp+0x1d0],cx
     14d2824:	c6 85 d2 01 00 00 01 	mov    BYTE PTR [rbp+0x1d2],0x1
     14d282b:	31 c0                	xor    eax,eax
     14d282d:	88 85 d8 01 00 00    	mov    BYTE PTR [rbp+0x1d8],al
     14d2833:	88 85 08 02 00 00    	mov    BYTE PTR [rbp+0x208],al
     14d2839:	48 8d bd 10 02 00 00 	lea    rdi,[rbp+0x210]
     14d2840:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
     14d2845:	e8 ac 71 30 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     14d284a:	48 8b 7d 30          	mov    rdi,QWORD PTR [rbp+0x30]
     14d284e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14d2851:	48 8d 35 98 68 f6 fe 	lea    rsi,[rip+0xfffffffffef66898]        # 4390f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb3f>
     14d2858:	ff 50 40             	call   QWORD PTR [rax+0x40]
     14d285b:	48 8b 7d 30          	mov    rdi,QWORD PTR [rbp+0x30]
     14d285f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14d2862:	48 8d 35 9f 68 f6 fe 	lea    rsi,[rip+0xfffffffffef6689f]        # 439108 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb57>
     14d2869:	ff 50 40             	call   QWORD PTR [rax+0x40]
     14d286c:	48 8b 7d 30          	mov    rdi,QWORD PTR [rbp+0x30]
     14d2870:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14d2873:	48 8d 35 c6 5e f6 fe 	lea    rsi,[rip+0xfffffffffef65ec6]        # 438740 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e18f>
     14d287a:	ff 50 40             	call   QWORD PTR [rax+0x40]
     14d287d:	4c 8d 7d 18          	lea    r15,[rbp+0x18]
     14d2881:	48 8b 9d 98 00 00 00 	mov    rbx,QWORD PTR [rbp+0x98]
     14d2888:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d288f:	00 
     14d2890:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d2893:	48 8d 35 f7 a7 5c ff 	lea    rsi,[rip+0xffffffffff5ca7f7]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d289a:	48 8d 0d a7 88 00 00 	lea    rcx,[rip+0x88a7]        # 14db148 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3206cc>

### 0x14d285b: mov    rdi,QWORD PTR [rbp+0x30]
     14d2806:	e8 83 5a 65 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     14d280b:	0f b6 84 24 e0 00 00 	movzx  eax,BYTE PTR [rsp+0xe0]
     14d2812:	00 
     14d2813:	c1 e0 08             	shl    eax,0x8
     14d2816:	0f b6 4c 24 70       	movzx  ecx,BYTE PTR [rsp+0x70]
     14d281b:	09 c1                	or     ecx,eax
     14d281d:	66 89 8d d0 01 00 00 	mov    WORD PTR [rbp+0x1d0],cx
     14d2824:	c6 85 d2 01 00 00 01 	mov    BYTE PTR [rbp+0x1d2],0x1
     14d282b:	31 c0                	xor    eax,eax
     14d282d:	88 85 d8 01 00 00    	mov    BYTE PTR [rbp+0x1d8],al
     14d2833:	88 85 08 02 00 00    	mov    BYTE PTR [rbp+0x208],al
     14d2839:	48 8d bd 10 02 00 00 	lea    rdi,[rbp+0x210]
     14d2840:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
     14d2845:	e8 ac 71 30 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     14d284a:	48 8b 7d 30          	mov    rdi,QWORD PTR [rbp+0x30]
     14d284e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14d2851:	48 8d 35 98 68 f6 fe 	lea    rsi,[rip+0xfffffffffef66898]        # 4390f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb3f>
     14d2858:	ff 50 40             	call   QWORD PTR [rax+0x40]
     14d285b:	48 8b 7d 30          	mov    rdi,QWORD PTR [rbp+0x30]
     14d285f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14d2862:	48 8d 35 9f 68 f6 fe 	lea    rsi,[rip+0xfffffffffef6689f]        # 439108 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb57>
     14d2869:	ff 50 40             	call   QWORD PTR [rax+0x40]
     14d286c:	48 8b 7d 30          	mov    rdi,QWORD PTR [rbp+0x30]
     14d2870:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14d2873:	48 8d 35 c6 5e f6 fe 	lea    rsi,[rip+0xfffffffffef65ec6]        # 438740 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e18f>
     14d287a:	ff 50 40             	call   QWORD PTR [rax+0x40]
     14d287d:	4c 8d 7d 18          	lea    r15,[rbp+0x18]
     14d2881:	48 8b 9d 98 00 00 00 	mov    rbx,QWORD PTR [rbp+0x98]
     14d2888:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d288f:	00 
     14d2890:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d2893:	48 8d 35 f7 a7 5c ff 	lea    rsi,[rip+0xffffffffff5ca7f7]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d289a:	48 8d 0d a7 88 00 00 	lea    rcx,[rip+0x88a7]        # 14db148 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3206cc>
     14d28a1:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d28a8:	00 
     14d28a9:	6a 08                	push   0x8
     14d28ab:	41 59                	pop    r9

### 0x14d286c: mov    rdi,QWORD PTR [rbp+0x30]
     14d2816:	0f b6 4c 24 70       	movzx  ecx,BYTE PTR [rsp+0x70]
     14d281b:	09 c1                	or     ecx,eax
     14d281d:	66 89 8d d0 01 00 00 	mov    WORD PTR [rbp+0x1d0],cx
     14d2824:	c6 85 d2 01 00 00 01 	mov    BYTE PTR [rbp+0x1d2],0x1
     14d282b:	31 c0                	xor    eax,eax
     14d282d:	88 85 d8 01 00 00    	mov    BYTE PTR [rbp+0x1d8],al
     14d2833:	88 85 08 02 00 00    	mov    BYTE PTR [rbp+0x208],al
     14d2839:	48 8d bd 10 02 00 00 	lea    rdi,[rbp+0x210]
     14d2840:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
     14d2845:	e8 ac 71 30 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     14d284a:	48 8b 7d 30          	mov    rdi,QWORD PTR [rbp+0x30]
     14d284e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14d2851:	48 8d 35 98 68 f6 fe 	lea    rsi,[rip+0xfffffffffef66898]        # 4390f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb3f>
     14d2858:	ff 50 40             	call   QWORD PTR [rax+0x40]
     14d285b:	48 8b 7d 30          	mov    rdi,QWORD PTR [rbp+0x30]
     14d285f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14d2862:	48 8d 35 9f 68 f6 fe 	lea    rsi,[rip+0xfffffffffef6689f]        # 439108 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb57>
     14d2869:	ff 50 40             	call   QWORD PTR [rax+0x40]
     14d286c:	48 8b 7d 30          	mov    rdi,QWORD PTR [rbp+0x30]
     14d2870:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14d2873:	48 8d 35 c6 5e f6 fe 	lea    rsi,[rip+0xfffffffffef65ec6]        # 438740 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e18f>
     14d287a:	ff 50 40             	call   QWORD PTR [rax+0x40]
     14d287d:	4c 8d 7d 18          	lea    r15,[rbp+0x18]
     14d2881:	48 8b 9d 98 00 00 00 	mov    rbx,QWORD PTR [rbp+0x98]
     14d2888:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d288f:	00 
     14d2890:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d2893:	48 8d 35 f7 a7 5c ff 	lea    rsi,[rip+0xffffffffff5ca7f7]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d289a:	48 8d 0d a7 88 00 00 	lea    rcx,[rip+0x88a7]        # 14db148 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3206cc>
     14d28a1:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d28a8:	00 
     14d28a9:	6a 08                	push   0x8
     14d28ab:	41 59                	pop    r9
     14d28ad:	4c 89 f7             	mov    rdi,r14
     14d28b0:	31 d2                	xor    edx,edx
     14d28b2:	e8 dd 7e 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d28b7:	48 8b 03             	mov    rax,QWORD PTR [rbx]

### 0x14d2a61: mov    rbx,QWORD PTR [rbp+0x30]
     14d2a1a:	e8 75 7d 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2a1f:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d2a22:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d2a29:	00 
     14d2a2a:	48 89 de             	mov    rsi,rbx
     14d2a2d:	4c 89 f2             	mov    rdx,r14
     14d2a30:	ff 50 28             	call   QWORD PTR [rax+0x28]
     14d2a33:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d2a3a:	00 
     14d2a3b:	48 8b bc 24 30 01 00 	mov    rdi,QWORD PTR [rsp+0x130]
     14d2a42:	00 
     14d2a43:	48 89 de             	mov    rsi,rbx
     14d2a46:	e8 a7 71 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2a4b:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d2a4f:	e8 32 ba 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2a54:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d2a5b:	00 
     14d2a5c:	e8 87 7d 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2a61:	48 8b 5d 30          	mov    rbx,QWORD PTR [rbp+0x30]
     14d2a65:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d2a6c:	00 
     14d2a6d:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d2a70:	48 8d 35 1a a6 5c ff 	lea    rsi,[rip+0xffffffffff5ca61a]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d2a77:	48 8d 0d b6 8a 00 00 	lea    rcx,[rip+0x8ab6]        # 14db534 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x320ab8>
     14d2a7e:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2a85:	00 
     14d2a86:	6a 08                	push   0x8
     14d2a88:	41 59                	pop    r9
     14d2a8a:	4c 89 f7             	mov    rdi,r14
     14d2a8d:	31 d2                	xor    edx,edx
     14d2a8f:	e8 00 7d 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2a94:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d2a97:	48 8d 15 6a 66 f6 fe 	lea    rdx,[rip+0xfffffffffef6666a]        # 439108 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb57>
     14d2a9e:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d2aa5:	00 
     14d2aa6:	48 89 de             	mov    rsi,rbx
     14d2aa9:	4c 89 f1             	mov    rcx,r14

### 0x14d2add: mov    rbx,QWORD PTR [rbp+0x30]
     14d2a94:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d2a97:	48 8d 15 6a 66 f6 fe 	lea    rdx,[rip+0xfffffffffef6666a]        # 439108 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb57>
     14d2a9e:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d2aa5:	00 
     14d2aa6:	48 89 de             	mov    rsi,rbx
     14d2aa9:	4c 89 f1             	mov    rcx,r14
     14d2aac:	ff 50 60             	call   QWORD PTR [rax+0x60]
     14d2aaf:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d2ab6:	00 
     14d2ab7:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
     14d2abe:	00 
     14d2abf:	48 89 de             	mov    rsi,rbx
     14d2ac2:	e8 2b 71 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2ac7:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d2acb:	e8 b6 b9 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2ad0:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d2ad7:	00 
     14d2ad8:	e8 0b 7d 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2add:	48 8b 5d 30          	mov    rbx,QWORD PTR [rbp+0x30]
     14d2ae1:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d2ae8:	00 
     14d2ae9:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d2aec:	48 8d 35 9e a5 5c ff 	lea    rsi,[rip+0xffffffffff5ca59e]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d2af3:	48 8d 0d 3a 8a 00 00 	lea    rcx,[rip+0x8a3a]        # 14db534 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x320ab8>
     14d2afa:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2b01:	00 
     14d2b02:	6a 08                	push   0x8
     14d2b04:	41 59                	pop    r9
     14d2b06:	4c 89 f7             	mov    rdi,r14
     14d2b09:	31 d2                	xor    edx,edx
     14d2b0b:	e8 84 7c 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2b10:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d2b13:	48 8d 15 d6 65 f6 fe 	lea    rdx,[rip+0xfffffffffef665d6]        # 4390f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb3f>
     14d2b1a:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d2b21:	00 
     14d2b22:	48 89 de             	mov    rsi,rbx
     14d2b25:	4c 89 f1             	mov    rcx,r14

### 0x14d2b59: mov    rbx,QWORD PTR [rbp+0x30]
     14d2b10:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d2b13:	48 8d 15 d6 65 f6 fe 	lea    rdx,[rip+0xfffffffffef665d6]        # 4390f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb3f>
     14d2b1a:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d2b21:	00 
     14d2b22:	48 89 de             	mov    rsi,rbx
     14d2b25:	4c 89 f1             	mov    rcx,r14
     14d2b28:	ff 50 60             	call   QWORD PTR [rax+0x60]
     14d2b2b:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d2b32:	00 
     14d2b33:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
     14d2b3a:	00 
     14d2b3b:	48 89 de             	mov    rsi,rbx
     14d2b3e:	e8 af 70 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2b43:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d2b47:	e8 3a b9 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2b4c:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d2b53:	00 
     14d2b54:	e8 8f 7c 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2b59:	48 8b 5d 30          	mov    rbx,QWORD PTR [rbp+0x30]
     14d2b5d:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d2b64:	00 
     14d2b65:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d2b68:	48 8d 35 22 a5 5c ff 	lea    rsi,[rip+0xffffffffff5ca522]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d2b6f:	48 8d 0d be 89 00 00 	lea    rcx,[rip+0x89be]        # 14db534 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x320ab8>
     14d2b76:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2b7d:	00 
     14d2b7e:	6a 08                	push   0x8
     14d2b80:	41 59                	pop    r9
     14d2b82:	4c 89 f7             	mov    rdi,r14
     14d2b85:	31 d2                	xor    edx,edx
     14d2b87:	e8 08 7c 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2b8c:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d2b8f:	48 8d 15 aa 5b f6 fe 	lea    rdx,[rip+0xfffffffffef65baa]        # 438740 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e18f>
     14d2b96:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d2b9d:	00 
     14d2b9e:	48 89 de             	mov    rsi,rbx
     14d2ba1:	4c 89 f1             	mov    rcx,r14

### 0x14d2e28: movups XMMWORD PTR [rbp+0x30],xmm1
     14d2de4:	00 
     14d2de5:	66 0f 6f 00          	movdqa xmm0,XMMWORD PTR [rax]
     14d2de9:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     14d2ded:	48 85 c0             	test   rax,rax
     14d2df0:	74 05                	je     14d2df7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31837b>
     14d2df2:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d2df7:	48 8d 05 3a 75 3a 00 	lea    rax,[rip+0x3a753a]        # 187a338 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36a20>
     14d2dfe:	48 89 45 18          	mov    QWORD PTR [rbp+0x18],rax
     14d2e02:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
     14d2e06:	41 0f 28 4d 00       	movaps xmm1,XMMWORD PTR [r13+0x0]
     14d2e0b:	0f 11 4d 20          	movups XMMWORD PTR [rbp+0x20],xmm1
     14d2e0f:	48 85 c0             	test   rax,rax
     14d2e12:	74 05                	je     14d2e19 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31839d>
     14d2e14:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d2e19:	48 8b 8c 24 c8 00 00 	mov    rcx,QWORD PTR [rsp+0xc8]
     14d2e20:	00 
     14d2e21:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     14d2e25:	0f 28 09             	movaps xmm1,XMMWORD PTR [rcx]
     14d2e28:	0f 11 4d 30          	movups XMMWORD PTR [rbp+0x30],xmm1
     14d2e2c:	48 85 c0             	test   rax,rax
     14d2e2f:	74 05                	je     14d2e36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3183ba>
     14d2e31:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d2e36:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14d2e3b:	48 8b 81 88 00 00 00 	mov    rax,QWORD PTR [rcx+0x88]
     14d2e42:	0f 28 89 80 00 00 00 	movaps xmm1,XMMWORD PTR [rcx+0x80]
     14d2e49:	0f 11 4d 40          	movups XMMWORD PTR [rbp+0x40],xmm1
     14d2e4d:	48 85 c0             	test   rax,rax
     14d2e50:	74 05                	je     14d2e57 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3183db>
     14d2e52:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d2e57:	48 8b 8c 24 f0 00 00 	mov    rcx,QWORD PTR [rsp+0xf0]
     14d2e5e:	00 
     14d2e5f:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     14d2e63:	0f 10 09             	movups xmm1,XMMWORD PTR [rcx]
     14d2e66:	0f 11 4d 50          	movups XMMWORD PTR [rbp+0x50],xmm1
     14d2e6a:	48 85 c0             	test   rax,rax
     14d2e6d:	74 05                	je     14d2e74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3183f8>
     14d2e6f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]

### 0x14d305a: mov    r14,QWORD PTR [rbp+0x30]
     14d3011:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d3014:	48 8d 15 ed 60 f6 fe 	lea    rdx,[rip+0xfffffffffef660ed]        # 439108 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb57>
     14d301b:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d3022:	00 
     14d3023:	4c 89 f6             	mov    rsi,r14
     14d3026:	4c 89 f9             	mov    rcx,r15
     14d3029:	ff 50 60             	call   QWORD PTR [rax+0x60]
     14d302c:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14d3033:	00 
     14d3034:	48 8b bc 24 f0 00 00 	mov    rdi,QWORD PTR [rsp+0xf0]
     14d303b:	00 
     14d303c:	4c 89 f6             	mov    rsi,r14
     14d303f:	e8 ae 6b 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d3044:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d3048:	e8 39 b4 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d304d:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d3054:	00 
     14d3055:	e8 8e 77 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d305a:	4c 8b 75 30          	mov    r14,QWORD PTR [rbp+0x30]
     14d305e:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d3065:	00 
     14d3066:	49 89 18             	mov    QWORD PTR [r8],rbx
     14d3069:	48 8d 35 21 a0 5c ff 	lea    rsi,[rip+0xffffffffff5ca021]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d3070:	48 8d 0d 4f bf 01 00 	lea    rcx,[rip+0x1bf4f]        # 14eefc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33454a>
     14d3077:	4c 8d bc 24 e0 02 00 	lea    r15,[rsp+0x2e0]
     14d307e:	00 
     14d307f:	6a 08                	push   0x8
     14d3081:	41 59                	pop    r9
     14d3083:	4c 89 ff             	mov    rdi,r15
     14d3086:	31 d2                	xor    edx,edx
     14d3088:	e8 07 77 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d308d:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d3090:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d3097:	00 
     14d3098:	4c 89 f6             	mov    rsi,r14
     14d309b:	4c 89 fa             	mov    rdx,r15
     14d309e:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]

### 0x14d3265: mov    QWORD PTR [r14+0x30],r12
     14d320a:	8a 84 24 98 00 00 00 	mov    al,BYTE PTR [rsp+0x98]
     14d3211:	41 88 86 b8 01 00 00 	mov    BYTE PTR [r14+0x1b8],al
     14d3218:	bf 80 00 00 00       	mov    edi,0x80
     14d321d:	e8 de ac 31 00       	call   17edf00 <_Znwm@plt>
     14d3222:	49 89 c6             	mov    r14,rax
     14d3225:	66 0f ef c0          	pxor   xmm0,xmm0
     14d3229:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d322e:	48 8d 05 33 a2 32 00 	lea    rax,[rip+0x32a233]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14d3235:	49 89 06             	mov    QWORD PTR [r14],rax
     14d3238:	48 8d 05 79 66 3a 00 	lea    rax,[rip+0x3a6679]        # 18798b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35fa0>
     14d323f:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14d3243:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     14d3248:	48 8b 81 98 00 00 00 	mov    rax,QWORD PTR [rcx+0x98]
     14d324f:	0f 10 81 90 00 00 00 	movups xmm0,XMMWORD PTR [rcx+0x90]
     14d3256:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
     14d325b:	48 85 c0             	test   rax,rax
     14d325e:	74 05                	je     14d3265 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3187e9>
     14d3260:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d3265:	4d 89 66 30          	mov    QWORD PTR [r14+0x30],r12
     14d3269:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
     14d326e:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
     14d3272:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d3277:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14d327c:	48 8b 81 88 00 00 00 	mov    rax,QWORD PTR [rcx+0x88]
     14d3283:	0f 28 81 80 00 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x80]
     14d328a:	41 0f 11 46 40       	movups XMMWORD PTR [r14+0x40],xmm0
     14d328f:	48 85 c0             	test   rax,rax
     14d3292:	74 05                	je     14d3299 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31881d>
     14d3294:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d3299:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
     14d329d:	41 0f 28 45 00       	movaps xmm0,XMMWORD PTR [r13+0x0]
     14d32a2:	41 0f 11 46 50       	movups XMMWORD PTR [r14+0x50],xmm0
     14d32a7:	48 85 c0             	test   rax,rax
     14d32aa:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
     14d32af:	74 05                	je     14d32b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31883a>
     14d32b1:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d32b6:	4d 8d 7e 18          	lea    r15,[r14+0x18]

### 0x14d34a3: mov    rcx,QWORD PTR [rsp+0x30]
     14d3456:	e8 a5 aa 31 00       	call   17edf00 <_Znwm@plt>
     14d345b:	48 89 c3             	mov    rbx,rax
     14d345e:	48 89 e8             	mov    rax,rbp
     14d3461:	48 83 c0 18          	add    rax,0x18
     14d3465:	49 89 dc             	mov    r12,rbx
     14d3468:	66 0f ef c0          	pxor   xmm0,xmm0
     14d346c:	f3 0f 7f 43 08       	movdqu XMMWORD PTR [rbx+0x8],xmm0
     14d3471:	48 8d 0d f0 9f 32 00 	lea    rcx,[rip+0x329ff0]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14d3478:	48 89 0b             	mov    QWORD PTR [rbx],rcx
     14d347b:	48 83 a4 24 80 03 00 	and    QWORD PTR [rsp+0x380],0x0
     14d3482:	00 00 
     14d3484:	4c 89 bc 24 a0 03 00 	mov    QWORD PTR [rsp+0x3a0],r15
     14d348b:	00 
     14d348c:	48 8d 0d 3d 6e 3a 00 	lea    rcx,[rip+0x3a6e3d]        # 187a2d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x369b8>
     14d3493:	48 89 4b 18          	mov    QWORD PTR [rbx+0x18],rcx
     14d3497:	48 8b 8c 24 88 01 00 	mov    rcx,QWORD PTR [rsp+0x188]
     14d349e:	00 
     14d349f:	48 89 4b 20          	mov    QWORD PTR [rbx+0x20],rcx
     14d34a3:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     14d34a8:	48 89 4b 28          	mov    QWORD PTR [rbx+0x28],rcx
     14d34ac:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     14d34b1:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     14d34b5:	48 89 6b 38          	mov    QWORD PTR [rbx+0x38],rbp
     14d34b9:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
     14d34be:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     14d34c3:	48 8b 41 18          	mov    rax,QWORD PTR [rcx+0x18]
     14d34c7:	0f 10 41 10          	movups xmm0,XMMWORD PTR [rcx+0x10]
     14d34cb:	0f 11 43 40          	movups XMMWORD PTR [rbx+0x40],xmm0
     14d34cf:	48 85 c0             	test   rax,rax
     14d34d2:	74 05                	je     14d34d9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x318a5d>
     14d34d4:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d34d9:	48 83 c3 18          	add    rbx,0x18
     14d34dd:	48 8b 8c 24 a0 00 00 	mov    rcx,QWORD PTR [rsp+0xa0]
     14d34e4:	00 
     14d34e5:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     14d34e9:	66 0f 6f 01          	movdqa xmm0,XMMWORD PTR [rcx]
     14d34ed:	f3 41 0f 7f 44 24 50 	movdqu XMMWORD PTR [r12+0x50],xmm0

### 0x14d34b1: mov    QWORD PTR [rbx+0x30],rax
     14d3461:	48 83 c0 18          	add    rax,0x18
     14d3465:	49 89 dc             	mov    r12,rbx
     14d3468:	66 0f ef c0          	pxor   xmm0,xmm0
     14d346c:	f3 0f 7f 43 08       	movdqu XMMWORD PTR [rbx+0x8],xmm0
     14d3471:	48 8d 0d f0 9f 32 00 	lea    rcx,[rip+0x329ff0]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14d3478:	48 89 0b             	mov    QWORD PTR [rbx],rcx
     14d347b:	48 83 a4 24 80 03 00 	and    QWORD PTR [rsp+0x380],0x0
     14d3482:	00 00 
     14d3484:	4c 89 bc 24 a0 03 00 	mov    QWORD PTR [rsp+0x3a0],r15
     14d348b:	00 
     14d348c:	48 8d 0d 3d 6e 3a 00 	lea    rcx,[rip+0x3a6e3d]        # 187a2d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x369b8>
     14d3493:	48 89 4b 18          	mov    QWORD PTR [rbx+0x18],rcx
     14d3497:	48 8b 8c 24 88 01 00 	mov    rcx,QWORD PTR [rsp+0x188]
     14d349e:	00 
     14d349f:	48 89 4b 20          	mov    QWORD PTR [rbx+0x20],rcx
     14d34a3:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     14d34a8:	48 89 4b 28          	mov    QWORD PTR [rbx+0x28],rcx
     14d34ac:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     14d34b1:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     14d34b5:	48 89 6b 38          	mov    QWORD PTR [rbx+0x38],rbp
     14d34b9:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
     14d34be:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     14d34c3:	48 8b 41 18          	mov    rax,QWORD PTR [rcx+0x18]
     14d34c7:	0f 10 41 10          	movups xmm0,XMMWORD PTR [rcx+0x10]
     14d34cb:	0f 11 43 40          	movups XMMWORD PTR [rbx+0x40],xmm0
     14d34cf:	48 85 c0             	test   rax,rax
     14d34d2:	74 05                	je     14d34d9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x318a5d>
     14d34d4:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d34d9:	48 83 c3 18          	add    rbx,0x18
     14d34dd:	48 8b 8c 24 a0 00 00 	mov    rcx,QWORD PTR [rsp+0xa0]
     14d34e4:	00 
     14d34e5:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     14d34e9:	66 0f 6f 01          	movdqa xmm0,XMMWORD PTR [rcx]
     14d34ed:	f3 41 0f 7f 44 24 50 	movdqu XMMWORD PTR [r12+0x50],xmm0
     14d34f4:	48 85 c0             	test   rax,rax
     14d34f7:	74 05                	je     14d34fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x318a82>
     14d34f9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]

### 0x14d36e8: mov    rdi,QWORD PTR [rsp+0x30]
     14d3698:	e8 e9 ad 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d369d:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
     14d36a4:	00 
     14d36a5:	e8 dc ad 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d36aa:	48 8b bc 24 98 01 00 	mov    rdi,QWORD PTR [rsp+0x198]
     14d36b1:	00 
     14d36b2:	e8 cf ad 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d36b7:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]
     14d36be:	00 
     14d36bf:	e8 c2 ad 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d36c4:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
     14d36cb:	00 
     14d36cc:	e8 b5 ad 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d36d1:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
     14d36d6:	e8 ab ad 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d36db:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
     14d36e2:	00 
     14d36e3:	e8 9e ad 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d36e8:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     14d36ed:	e8 94 ad 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d36f2:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
     14d36f7:	e8 8a ad 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d36fc:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     14d3701:	e8 80 ad 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d3706:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     14d370b:	e8 a2 ad 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14d3710:	48 8b bc 24 90 01 00 	mov    rdi,QWORD PTR [rsp+0x190]
     14d3717:	00 
     14d3718:	e8 69 ad 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d371d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14d3724:	00 00 
     14d3726:	48 3b 84 24 e0 03 00 	cmp    rax,QWORD PTR [rsp+0x3e0]
     14d372d:	00 
     14d372e:	0f 85 13 16 00 00    	jne    14d4d47 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a2cb>
     14d3734:	48 81 c4 e8 03 00 00 	add    rsp,0x3e8
     14d373b:	5b                   	pop    rbx
     14d373c:	41 5c                	pop    r12

### 0x14d37ca: mov    rdi,QWORD PTR [rbx+0x30]
     14d3777:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     14d377c:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     14d3783:	00 
     14d3784:	e8 07 a7 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14d3789:	48 89 df             	mov    rdi,rbx
     14d378c:	e8 f5 ac 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d3791:	e9 58 02 00 00       	jmp    14d39ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x318f72>
     14d3796:	4c 89 6c 24 78       	mov    QWORD PTR [rsp+0x78],r13
     14d379b:	e9 79 12 00 00       	jmp    14d4a19 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319f9d>
     14d37a0:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     14d37a5:	48 8b bc 24 88 03 00 	mov    rdi,QWORD PTR [rsp+0x388]
     14d37ac:	00 
     14d37ad:	e8 d4 ac 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d37b2:	e9 e8 06 00 00       	jmp    14d3e9f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319423>
     14d37b7:	e9 35 0d 00 00       	jmp    14d44f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319a75>
     14d37bc:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     14d37c1:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
     14d37c5:	e8 bc ac 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d37ca:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
     14d37ce:	e8 b3 ac 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d37d3:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
     14d37d7:	e8 d6 ac 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14d37dc:	48 89 df             	mov    rdi,rbx
     14d37df:	e8 2c a8 31 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     14d37e4:	48 89 df             	mov    rdi,rbx
     14d37e7:	e8 30 ac 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d37ec:	e9 f1 11 00 00       	jmp    14d49e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319f66>
     14d37f1:	e9 90 04 00 00       	jmp    14d3c86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31920a>
     14d37f6:	eb 02                	jmp    14d37fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x318d7e>
     14d37f8:	eb 00                	jmp    14d37fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x318d7e>
     14d37fa:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     14d37ff:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d3806:	00 
     14d3807:	e8 dc 6f 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d380c:	e9 6c 0f 00 00       	jmp    14d477d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319d01>
     14d3811:	e9 62 0f 00 00       	jmp    14d4778 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319cfc>
     14d3816:	e9 6b 04 00 00       	jmp    14d3c86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31920a>

### 0x14d3e78: mov    rdi,QWORD PTR [r12+0x30]
     14d3e24:	e8 5d a6 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d3e29:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
     14d3e30:	00 
     14d3e31:	e8 34 61 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14d3e36:	49 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [r12+0x90]
     14d3e3d:	00 
     14d3e3e:	e8 43 a6 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d3e43:	49 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [r12+0x80]
     14d3e4a:	00 
     14d3e4b:	e8 36 a6 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d3e50:	49 8b 7c 24 70       	mov    rdi,QWORD PTR [r12+0x70]
     14d3e55:	e8 2c a6 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d3e5a:	49 8b 7c 24 60       	mov    rdi,QWORD PTR [r12+0x60]
     14d3e5f:	e8 22 a6 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d3e64:	49 8b 7c 24 50       	mov    rdi,QWORD PTR [r12+0x50]
     14d3e69:	e8 18 a6 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d3e6e:	49 8b 7c 24 40       	mov    rdi,QWORD PTR [r12+0x40]
     14d3e73:	e8 0e a6 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d3e78:	49 8b 7c 24 30       	mov    rdi,QWORD PTR [r12+0x30]
     14d3e7d:	e8 30 a6 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14d3e82:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d3e89:	00 
     14d3e8a:	e8 db 60 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14d3e8f:	4c 89 e7             	mov    rdi,r12
     14d3e92:	e8 79 a1 31 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     14d3e97:	4c 89 e7             	mov    rdi,r12
     14d3e9a:	e8 7d a5 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d3e9f:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
     14d3ea6:	00 
     14d3ea7:	e8 be 60 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14d3eac:	48 8b bc 24 38 02 00 	mov    rdi,QWORD PTR [rsp+0x238]
     14d3eb3:	00 
     14d3eb4:	e8 cd a5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d3eb9:	e9 2e 0b 00 00       	jmp    14d49ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319f70>
     14d3ebe:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     14d3ec3:	e9 0e ff ff ff       	jmp    14d3dd6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31935a>
     14d3ec8:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax

### 0x14d3f5e: mov    r12,QWORD PTR [rsp+0x30]
     14d3f15:	49 89 c5             	mov    r13,rax
     14d3f18:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d3f1f:	00 
     14d3f20:	e8 45 60 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14d3f25:	e9 7d 0b 00 00       	jmp    14d4aa7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a02b>
     14d3f2a:	49 89 c5             	mov    r13,rax
     14d3f2d:	e9 4a 0c 00 00       	jmp    14d4b7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a100>
     14d3f32:	49 89 c5             	mov    r13,rax
     14d3f35:	eb 1d                	jmp    14d3f54 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3194d8>
     14d3f37:	49 89 c5             	mov    r13,rax
     14d3f3a:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d3f41:	00 
     14d3f42:	e8 c9 eb 61 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
     14d3f47:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14d3f4e:	00 
     14d3f4f:	e8 bc eb 61 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
     14d3f54:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d3f59:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
     14d3f5e:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]
     14d3f63:	e9 2c 0d 00 00       	jmp    14d4c94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a218>
     14d3f68:	eb 02                	jmp    14d3f6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3194f0>
     14d3f6a:	eb 14                	jmp    14d3f80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319504>
     14d3f6c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     14d3f71:	48 8b bc 24 a8 03 00 	mov    rdi,QWORD PTR [rsp+0x3a8]
     14d3f78:	00 
     14d3f79:	e8 08 a5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d3f7e:	eb 05                	jmp    14d3f85 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319509>
     14d3f80:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     14d3f85:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d3f8c:	00 
     14d3f8d:	e8 56 68 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d3f92:	4d 8d b7 88 00 00 00 	lea    r14,[r15+0x88]
     14d3f99:	4d 8d af b0 00 00 00 	lea    r13,[r15+0xb0]
     14d3fa0:	49 8d af f8 00 00 00 	lea    rbp,[r15+0xf8]
     14d3fa7:	49 8d bf 10 01 00 00 	lea    rdi,[r15+0x110]
     14d3fae:	e8 dd 9e 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14d3fb3:	48 89 ef             	mov    rdi,rbp

### 0x14d43cf: mov    rdi,QWORD PTR [r15+0x30]
     14d4381:	4c 89 ef             	mov    rdi,r13
     14d4384:	e8 e1 5b 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14d4389:	eb 05                	jmp    14d4390 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319914>
     14d438b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     14d4390:	4c 89 f7             	mov    rdi,r14
     14d4393:	e8 f8 9a 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14d4398:	eb 05                	jmp    14d439f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319923>
     14d439a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     14d439f:	49 8b bf 80 00 00 00 	mov    rdi,QWORD PTR [r15+0x80]
     14d43a6:	e8 db a0 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d43ab:	49 8b 7f 70          	mov    rdi,QWORD PTR [r15+0x70]
     14d43af:	e8 d2 a0 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d43b4:	49 8b 7f 60          	mov    rdi,QWORD PTR [r15+0x60]
     14d43b8:	e8 c9 a0 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d43bd:	49 8b 7f 50          	mov    rdi,QWORD PTR [r15+0x50]
     14d43c1:	e8 c0 a0 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d43c6:	49 8b 7f 40          	mov    rdi,QWORD PTR [r15+0x40]
     14d43ca:	e8 b7 a0 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d43cf:	49 8b 7f 30          	mov    rdi,QWORD PTR [r15+0x30]
     14d43d3:	e8 ae a0 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d43d8:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d43df:	00 
     14d43e0:	e8 85 5b 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14d43e5:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d43ec:	00 
     14d43ed:	e8 78 5b 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14d43f2:	31 ed                	xor    ebp,ebp
     14d43f4:	31 ff                	xor    edi,edi
     14d43f6:	e8 8b a0 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d43fb:	4c 89 e7             	mov    rdi,r12
     14d43fe:	e8 83 a0 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d4403:	48 89 df             	mov    rdi,rbx
     14d4406:	e8 7b a0 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d440b:	4c 89 ff             	mov    rdi,r15
     14d440e:	e8 fd 9b 31 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     14d4413:	4c 89 ff             	mov    rdi,r15
     14d4416:	e8 01 a0 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>

### 0x14d4447: mov    rdi,QWORD PTR [rbx+0x30]
     14d43fe:	e8 83 a0 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d4403:	48 89 df             	mov    rdi,rbx
     14d4406:	e8 7b a0 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d440b:	4c 89 ff             	mov    rdi,r15
     14d440e:	e8 fd 9b 31 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     14d4413:	4c 89 ff             	mov    rdi,r15
     14d4416:	e8 01 a0 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d441b:	eb 05                	jmp    14d4422 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3199a6>
     14d441d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     14d4422:	48 89 ef             	mov    rdi,rbp
     14d4425:	e8 5c a0 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d442a:	e9 ca 05 00 00       	jmp    14d49f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319f7d>
     14d442f:	49 89 c5             	mov    r13,rax
     14d4432:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d4439:	00 
     14d443a:	e8 a9 63 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d443f:	4c 89 ff             	mov    rdi,r15
     14d4442:	e8 8d 57 30 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     14d4447:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
     14d444b:	e8 36 a0 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d4450:	48 89 df             	mov    rdi,rbx
     14d4453:	e8 b8 9b 31 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     14d4458:	48 89 df             	mov    rdi,rbx
     14d445b:	e8 bc 9f 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d4460:	e9 1b 08 00 00       	jmp    14d4c80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a204>
     14d4465:	e9 87 00 00 00       	jmp    14d44f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319a75>
     14d446a:	eb 04                	jmp    14d4470 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3199f4>
     14d446c:	eb 02                	jmp    14d4470 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3199f4>
     14d446e:	eb 00                	jmp    14d4470 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3199f4>
     14d4470:	49 89 c6             	mov    r14,rax
     14d4473:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d447a:	00 
     14d447b:	e8 68 63 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d4480:	e9 7d 03 00 00       	jmp    14d4802 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319d86>
     14d4485:	49 89 c5             	mov    r13,rax
     14d4488:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14d448b:	4c 89 ff             	mov    rdi,r15

### 0x14d458c: mov    rdi,QWORD PTR [r14+0x30]
     14d4540:	4c 89 f7             	mov    rdi,r14
     14d4543:	e8 b0 78 02 00       	call   14fbdf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34137c>
     14d4548:	48 89 ef             	mov    rdi,rbp
     14d454b:	e8 40 99 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14d4550:	eb 05                	jmp    14d4557 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319adb>
     14d4552:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     14d4557:	48 8b 84 24 e8 00 00 	mov    rax,QWORD PTR [rsp+0xe8]
     14d455e:	00 
     14d455f:	48 8b b8 b0 00 00 00 	mov    rdi,QWORD PTR [rax+0xb0]
     14d4566:	e8 1b 9f 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d456b:	4c 89 ef             	mov    rdi,r13
     14d456e:	e8 f7 59 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14d4573:	48 89 df             	mov    rdi,rbx
     14d4576:	e8 15 99 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14d457b:	4c 8b b4 24 e8 00 00 	mov    r14,QWORD PTR [rsp+0xe8]
     14d4582:	00 
     14d4583:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
     14d4587:	e8 fa 9e 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d458c:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
     14d4590:	e8 1d 9f 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14d4595:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d459c:	00 
     14d459d:	e8 c8 59 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14d45a2:	31 db                	xor    ebx,ebx
     14d45a4:	31 ff                	xor    edi,edi
     14d45a6:	e8 db 9e 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d45ab:	4c 89 f7             	mov    rdi,r14
     14d45ae:	e8 5d 9a 31 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     14d45b3:	4c 89 f7             	mov    rdi,r14
     14d45b6:	e8 61 9e 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d45bb:	45 31 ed             	xor    r13d,r13d
     14d45be:	4c 89 ef             	mov    rdi,r13
     14d45c1:	e8 c0 9e 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d45c6:	48 89 df             	mov    rdi,rbx
     14d45c9:	e8 b8 9e 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d45ce:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d45d3:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]

### 0x14d45d8: mov    r12,QWORD PTR [rsp+0x30]
     14d4590:	e8 1d 9f 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14d4595:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d459c:	00 
     14d459d:	e8 c8 59 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14d45a2:	31 db                	xor    ebx,ebx
     14d45a4:	31 ff                	xor    edi,edi
     14d45a6:	e8 db 9e 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d45ab:	4c 89 f7             	mov    rdi,r14
     14d45ae:	e8 5d 9a 31 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     14d45b3:	4c 89 f7             	mov    rdi,r14
     14d45b6:	e8 61 9e 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d45bb:	45 31 ed             	xor    r13d,r13d
     14d45be:	4c 89 ef             	mov    rdi,r13
     14d45c1:	e8 c0 9e 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d45c6:	48 89 df             	mov    rdi,rbx
     14d45c9:	e8 b8 9e 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d45ce:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d45d3:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
     14d45d8:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]
     14d45dd:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
     14d45e2:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
     14d45e7:	e9 ca 06 00 00       	jmp    14d4cb6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a23a>
     14d45ec:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     14d45f1:	eb 80                	jmp    14d4573 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319af7>
     14d45f3:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     14d45f8:	eb 81                	jmp    14d457b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319aff>
     14d45fa:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     14d45ff:	48 8b 9c 24 b8 02 00 	mov    rbx,QWORD PTR [rsp+0x2b8]
     14d4606:	00 
     14d4607:	eb b5                	jmp    14d45be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319b42>
     14d4609:	49 89 c5             	mov    r13,rax
     14d460c:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d4613:	00 
     14d4614:	e8 cf 61 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d4619:	48 8b bc 24 b8 02 00 	mov    rdi,QWORD PTR [rsp+0x2b8]
     14d4620:	00 
     14d4621:	e8 60 9e 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### 0x14d46ff: mov    rdi,QWORD PTR [r15+0x30]
     14d46ba:	e9 0c 06 00 00       	jmp    14d4ccb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a24f>
     14d46bf:	49 89 c5             	mov    r13,rax
     14d46c2:	48 89 df             	mov    rdi,rbx
     14d46c5:	e8 bc 9d 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d46ca:	eb 15                	jmp    14d46e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319c65>
     14d46cc:	49 89 c5             	mov    r13,rax
     14d46cf:	eb 10                	jmp    14d46e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319c65>
     14d46d1:	49 89 c5             	mov    r13,rax
     14d46d4:	66 0f ef c0          	pxor   xmm0,xmm0
     14d46d8:	66 0f 7f 84 24 40 01 	movdqa XMMWORD PTR [rsp+0x140],xmm0
     14d46df:	00 00 
     14d46e1:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d46e6:	e9 fd 05 00 00       	jmp    14d4ce8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a26c>
     14d46eb:	49 89 c5             	mov    r13,rax
     14d46ee:	49 8b 7f 78          	mov    rdi,QWORD PTR [r15+0x78]
     14d46f2:	e8 8f 9d 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d46f7:	4c 89 f7             	mov    rdi,r14
     14d46fa:	e8 f7 e7 9e ff       	call   ec2ef6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a30c>
     14d46ff:	49 8b 7f 30          	mov    rdi,QWORD PTR [r15+0x30]
     14d4703:	e8 aa 9d 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14d4708:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d470f:	00 
     14d4710:	e8 55 58 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14d4715:	31 ff                	xor    edi,edi
     14d4717:	e8 96 9d 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14d471c:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d4723:	00 
     14d4724:	e8 41 58 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14d4729:	31 ff                	xor    edi,edi
     14d472b:	e8 82 9d 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14d4730:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14d4737:	00 
     14d4738:	e8 53 97 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14d473d:	eb 03                	jmp    14d4742 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319cc6>
     14d473f:	49 89 c5             	mov    r13,rax
     14d4742:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
     14d4747:	48 89 df             	mov    rdi,rbx

### 0x14d4821: mov    r12,QWORD PTR [rsp+0x30]
     14d47d5:	e8 ac 9c 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d47da:	48 8b 7d 28          	mov    rdi,QWORD PTR [rbp+0x28]
     14d47de:	e8 a3 9c 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d47e3:	31 ff                	xor    edi,edi
     14d47e5:	e8 9c 9c 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d47ea:	48 89 ef             	mov    rdi,rbp
     14d47ed:	e8 1e 98 31 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     14d47f2:	48 89 ef             	mov    rdi,rbp
     14d47f5:	e8 22 9c 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d47fa:	e9 e3 01 00 00       	jmp    14d49e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319f66>
     14d47ff:	49 89 c6             	mov    r14,rax
     14d4802:	48 8b bc 24 a8 03 00 	mov    rdi,QWORD PTR [rsp+0x3a8]
     14d4809:	00 
     14d480a:	e8 a3 9c 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14d480f:	4c 89 ef             	mov    rdi,r13
     14d4812:	e8 6f 9c 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d4817:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d481c:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
     14d4821:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]
     14d4826:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
     14d482b:	4d 89 f5             	mov    r13,r14
     14d482e:	e9 61 04 00 00       	jmp    14d4c94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a218>
     14d4833:	49 89 c5             	mov    r13,rax
     14d4836:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d483d:	00 
     14d483e:	e8 4d 96 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14d4843:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d4848:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
     14d484d:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]
     14d4852:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
     14d4857:	e9 5a 04 00 00       	jmp    14d4cb6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a23a>
     14d485c:	49 89 c5             	mov    r13,rax
     14d485f:	4c 89 ff             	mov    rdi,r15
     14d4862:	e8 ff dd 60 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
     14d4867:	4c 89 e7             	mov    rdi,r12
     14d486a:	e8 65 53 30 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     14d486f:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]

### 0x14d484d: mov    r12,QWORD PTR [rsp+0x30]
     14d47ff:	49 89 c6             	mov    r14,rax
     14d4802:	48 8b bc 24 a8 03 00 	mov    rdi,QWORD PTR [rsp+0x3a8]
     14d4809:	00 
     14d480a:	e8 a3 9c 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14d480f:	4c 89 ef             	mov    rdi,r13
     14d4812:	e8 6f 9c 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d4817:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d481c:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
     14d4821:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]
     14d4826:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
     14d482b:	4d 89 f5             	mov    r13,r14
     14d482e:	e9 61 04 00 00       	jmp    14d4c94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a218>
     14d4833:	49 89 c5             	mov    r13,rax
     14d4836:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d483d:	00 
     14d483e:	e8 4d 96 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14d4843:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d4848:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
     14d484d:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]
     14d4852:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
     14d4857:	e9 5a 04 00 00       	jmp    14d4cb6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a23a>
     14d485c:	49 89 c5             	mov    r13,rax
     14d485f:	4c 89 ff             	mov    rdi,r15
     14d4862:	e8 ff dd 60 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
     14d4867:	4c 89 e7             	mov    rdi,r12
     14d486a:	e8 65 53 30 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     14d486f:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     14d4874:	e8 ed 55 30 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     14d4879:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     14d487e:	e8 e3 55 30 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     14d4883:	48 89 df             	mov    rdi,rbx
     14d4886:	e8 85 97 31 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     14d488b:	48 89 df             	mov    rdi,rbx
     14d488e:	e8 89 9b 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d4893:	e9 8a 04 00 00       	jmp    14d4d22 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a2a6>
     14d4898:	49 89 c5             	mov    r13,rax
     14d489b:	e9 82 04 00 00       	jmp    14d4d22 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a2a6>

### 0x14d4a03: mov    r12,QWORD PTR [rsp+0x30]
     14d49b2:	e8 cf 9a 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d49b7:	48 8b 7d 48          	mov    rdi,QWORD PTR [rbp+0x48]
     14d49bb:	e8 c6 9a 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d49c0:	48 8b 7d 38          	mov    rdi,QWORD PTR [rbp+0x38]
     14d49c4:	e8 bd 9a 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d49c9:	48 8b 7d 28          	mov    rdi,QWORD PTR [rbp+0x28]
     14d49cd:	e8 b4 9a 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d49d2:	48 89 ef             	mov    rdi,rbp
     14d49d5:	e8 36 96 31 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     14d49da:	48 89 ef             	mov    rdi,rbp
     14d49dd:	e8 3a 9a 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d49e2:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     14d49e7:	e8 9a 9a 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d49ec:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
     14d49f3:	00 
     14d49f4:	e8 8d 9a 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d49f9:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d49fe:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
     14d4a03:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]
     14d4a08:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
     14d4a0d:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
     14d4a12:	e9 7d 02 00 00       	jmp    14d4c94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a218>
     14d4a17:	eb 00                	jmp    14d4a19 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319f9d>
     14d4a19:	49 89 c5             	mov    r13,rax
     14d4a1c:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     14d4a23:	00 
     14d4a24:	e8 6f 93 2d 00       	call   17add98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161f04>
     14d4a29:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d4a30:	00 
     14d4a31:	e8 a4 80 06 00       	call   153cada <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38205e>
     14d4a36:	48 8d bc 24 80 03 00 	lea    rdi,[rsp+0x380]
     14d4a3d:	00 
     14d4a3e:	e8 ed 73 5d ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
     14d4a43:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
     14d4a48:	48 81 c7 90 00 00 00 	add    rdi,0x90
     14d4a4f:	e8 12 dc 60 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
     14d4a54:	48 89 ef             	mov    rdi,rbp

### 0x14d4bd7: mov    r12,QWORD PTR [rsp+0x30]
     14d4b91:	48 89 df             	mov    rdi,rbx
     14d4b94:	e8 77 94 31 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     14d4b99:	48 89 df             	mov    rdi,rbx
     14d4b9c:	e8 7b 98 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d4ba1:	e9 da 00 00 00       	jmp    14d4c80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a204>
     14d4ba6:	49 89 c5             	mov    r13,rax
     14d4ba9:	eb 22                	jmp    14d4bcd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a151>
     14d4bab:	49 89 c5             	mov    r13,rax
     14d4bae:	eb 10                	jmp    14d4bc0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a144>
     14d4bb0:	49 89 c5             	mov    r13,rax
     14d4bb3:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d4bba:	00 
     14d4bbb:	e8 28 6a 5a ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     14d4bc0:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d4bc7:	00 
     14d4bc8:	e8 c3 92 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14d4bcd:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d4bd2:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
     14d4bd7:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]
     14d4bdc:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
     14d4be1:	e9 c3 00 00 00       	jmp    14d4ca9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a22d>
     14d4be6:	49 89 c5             	mov    r13,rax
     14d4be9:	eb 10                	jmp    14d4bfb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a17f>
     14d4beb:	49 89 c5             	mov    r13,rax
     14d4bee:	48 8b bc 24 a8 03 00 	mov    rdi,QWORD PTR [rsp+0x3a8]
     14d4bf5:	00 
     14d4bf6:	e8 8b 98 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d4bfb:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d4c02:	00 
     14d4c03:	e8 e0 5b 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d4c08:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
     14d4c0f:	00 
     14d4c10:	e8 7b 92 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14d4c15:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     14d4c1a:	e8 ef 2a 5e ff       	call   ab770e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x46ae>
     14d4c1f:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
     14d4c23:	e8 5e 98 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### 0x14d4c8a: mov    r12,QWORD PTR [rsp+0x30]
     14d4c41:	eb 38                	jmp    14d4c7b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a1ff>
     14d4c43:	49 89 c5             	mov    r13,rax
     14d4c46:	eb 10                	jmp    14d4c58 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a1dc>
     14d4c48:	49 89 c5             	mov    r13,rax
     14d4c4b:	48 8b bc 24 a8 03 00 	mov    rdi,QWORD PTR [rsp+0x3a8]
     14d4c52:	00 
     14d4c53:	e8 2e 98 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d4c58:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d4c5f:	00 
     14d4c60:	e8 83 5b 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d4c65:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     14d4c6a:	e8 9f 2a 5e ff       	call   ab770e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x46ae>
     14d4c6f:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     14d4c73:	e8 0e 98 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d4c78:	4c 89 ff             	mov    rdi,r15
     14d4c7b:	e8 a0 92 31 00       	call   17edf20 <_ZdlPv@plt>
     14d4c80:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d4c85:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
     14d4c8a:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]
     14d4c8f:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
     14d4c94:	66 0f 6f 84 24 10 01 	movdqa xmm0,XMMWORD PTR [rsp+0x110]
     14d4c9b:	00 00 
     14d4c9d:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
     14d4ca4:	e8 dd 97 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d4ca9:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]
     14d4cb0:	00 
     14d4cb1:	e8 d0 97 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d4cb6:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
     14d4cbd:	00 
     14d4cbe:	e8 c3 97 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d4cc3:	48 89 ef             	mov    rdi,rbp
     14d4cc6:	e8 bb 97 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d4ccb:	66 0f 6f 84 24 70 01 	movdqa xmm0,XMMWORD PTR [rsp+0x170]
     14d4cd2:	00 00 
     14d4cd4:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
     14d4cdb:	e8 a6 97 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d4ce0:	4c 89 e7             	mov    rdi,r12


## Provider descriptor vector / context fingerprints
### uses containing `+0xa0]`
     14ce4b8:	49 8d bf a0 00 00 00 	lea    rdi,[r15+0xa0]
     14ce652:	4c 89 a4 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r12
     14cebc4:	4c 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r15
     14cedf4:	66 41 89 8e a0 00 00 	mov    WORD PTR [r14+0xa0],cx
     14cf036:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     14cf167:	4c 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r15
     14cf42c:	89 83 a0 00 00 00    	mov    DWORD PTR [rbx+0xa0],eax
     14cf61c:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
     14cf66c:	66 0f 6f 84 24 a0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xa0]
     14cf8eb:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
     14cfac2:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
     14cfcd3:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     14d0005:	66 0f 7f 84 24 a0 00 	movdqa XMMWORD PTR [rsp+0xa0],xmm0
     14d0080:	0f 28 94 24 a0 00 00 	movaps xmm2,XMMWORD PTR [rsp+0xa0]
     14d017c:	4d 89 af a0 00 00 00 	mov    QWORD PTR [r15+0xa0],r13
     14d0472:	4c 8b a8 a0 00 00 00 	mov    r13,QWORD PTR [rax+0xa0]
     14d0571:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
     14d0b0f:	48 8b 8c 24 a0 00 00 	mov    rcx,QWORD PTR [rsp+0xa0]
     14d1341:	48 8b 8c 24 a0 00 00 	mov    rcx,QWORD PTR [rsp+0xa0]
     14d1419:	48 8b 8c 24 a0 00 00 	mov    rcx,QWORD PTR [rsp+0xa0]
     14d1718:	48 8b 8c 24 a0 00 00 	mov    rcx,QWORD PTR [rsp+0xa0]
     14d1727:	0f 29 83 a0 00 00 00 	movaps XMMWORD PTR [rbx+0xa0],xmm0
     14d1c22:	49 8b b5 a0 00 00 00 	mov    rsi,QWORD PTR [r13+0xa0]
     14d1c7d:	49 8b b7 a0 00 00 00 	mov    rsi,QWORD PTR [r15+0xa0]
     14d1f02:	49 8d ac 24 a0 00 00 	lea    rbp,[r12+0xa0]
     14d2287:	49 8d bc 24 a0 00 00 	lea    rdi,[r12+0xa0]
     14d2487:	66 0f 7f 82 a0 00 00 	movdqa XMMWORD PTR [rdx+0xa0],xmm0
     14d2617:	48 8b 8c 24 a0 00 00 	mov    rcx,QWORD PTR [rsp+0xa0]
     14d2ebb:	48 8d bd a0 00 00 00 	lea    rdi,[rbp+0xa0]
     14d335f:	4c 8d ad a0 00 00 00 	lea    r13,[rbp+0xa0]
     14d336d:	f3 0f 7f 85 a0 00 00 	movdqu XMMWORD PTR [rbp+0xa0],xmm0
     14d34dd:	48 8b 8c 24 a0 00 00 	mov    rcx,QWORD PTR [rsp+0xa0]
     14d3952:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     14d44b2:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     14d497c:	48 8b bd a0 00 00 00 	mov    rdi,QWORD PTR [rbp+0xa0]
     14d4a5c:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]

### uses containing `+0x38]`
     14cdec1:	4d 8b 6d 38          	mov    r13,QWORD PTR [r13+0x38]
     14ce0e8:	49 83 65 38 00       	and    QWORD PTR [r13+0x38],0x0
     14ce450:	4d 8d 77 38          	lea    r14,[r15+0x38]
     14ce454:	f3 41 0f 7f 4f 38    	movdqu XMMWORD PTR [r15+0x38],xmm1
     14ce97e:	f3 0f 7f 45 38       	movdqu XMMWORD PTR [rbp+0x38],xmm0
     14cea03:	f3 41 0f 7f 45 38    	movdqu XMMWORD PTR [r13+0x38],xmm0
     14ceb99:	48 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],rbp
     14ced85:	f3 41 0f 7f 4e 38    	movdqu XMMWORD PTR [r14+0x38],xmm1
     14cef95:	48 8d 53 38          	lea    rdx,[rbx+0x38]
     14cfa1a:	41 0f 11 47 38       	movups XMMWORD PTR [r15+0x38],xmm0
     14cfcf9:	49 8b 5f 38          	mov    rbx,QWORD PTR [r15+0x38]
     14d00f7:	41 0f 11 57 38       	movups XMMWORD PTR [r15+0x38],xmm2
     14d02c7:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0
     14d0416:	49 8b 7f 38          	mov    rdi,QWORD PTR [r15+0x38]
     14d0844:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
     14d0a1f:	48 83 63 38 00       	and    QWORD PTR [rbx+0x38],0x0
     14d0b66:	48 8d 7d 38          	lea    rdi,[rbp+0x38]
     14d0e06:	ff 50 38             	call   QWORD PTR [rax+0x38]
     14d10de:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0
     14d1262:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
     14d1e5b:	41 0f 11 44 24 38    	movups XMMWORD PTR [r12+0x38],xmm0
     14d2138:	ff 50 38             	call   QWORD PTR [rax+0x38]
     14d25ac:	f3 0f 7f 43 38       	movdqu XMMWORD PTR [rbx+0x38],xmm0
     14d315c:	f3 0f 7f 43 38       	movdqu XMMWORD PTR [rbx+0x38],xmm0
     14d326e:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
     14d34b5:	48 89 6b 38          	mov    QWORD PTR [rbx+0x38],rbp
     14d36d1:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
     14d3a53:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
     14d4278:	49 8b 7f 38          	mov    rdi,QWORD PTR [r15+0x38]
     14d45dd:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
     14d47d1:	48 8b 7d 38          	mov    rdi,QWORD PTR [rbp+0x38]
     14d4826:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
     14d4852:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
     14d49c0:	48 8b 7d 38          	mov    rdi,QWORD PTR [rbp+0x38]
     14d4a08:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
     14d4bdc:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
     14d4c8f:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]

### uses containing `+0x18]`
     14cdea6:	4c 89 74 24 18       	mov    QWORD PTR [rsp+0x18],r14
     14cdee5:	48 8d 6b 18          	lea    rbp,[rbx+0x18]
     14cdef0:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     14ce02c:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     14ce0dc:	f3 41 0f 7f 45 18    	movdqu XMMWORD PTR [r13+0x18],xmm0
     14ce17c:	4c 89 6d 18          	mov    QWORD PTR [rbp+0x18],r13
     14ce22a:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14ce292:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14ce2f0:	48 89 45 18          	mov    QWORD PTR [rbp+0x18],rax
     14ce556:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14ce5a4:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
     14ce6fe:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
     14ce805:	48 8d 73 18          	lea    rsi,[rbx+0x18]
     14ce8a9:	4c 8d 73 18          	lea    r14,[rbx+0x18]
     14ce913:	4d 89 74 24 18       	mov    QWORD PTR [r12+0x18],r14
     14ce92a:	f3 41 0f 6f 44 24 18 	movdqu xmm0,XMMWORD PTR [r12+0x18]
     14ce974:	f3 0f 7f 45 18       	movdqu XMMWORD PTR [rbp+0x18],xmm0
     14ceac6:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     14ceb85:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14cebf8:	4c 8b 7c 24 18       	mov    r15,QWORD PTR [rsp+0x18]
     14cf0ee:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14cf147:	f3 41 0f 7f 4d 18    	movdqu XMMWORD PTR [r13+0x18],xmm1
     14cf2a2:	4c 89 6b 18          	mov    QWORD PTR [rbx+0x18],r13
     14cf3ce:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     14cf46a:	4c 8d 73 18          	lea    r14,[rbx+0x18]
     14cf682:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
     14cf6ab:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14cf7b7:	48 89 4b 18          	mov    QWORD PTR [rbx+0x18],rcx
     14cf7c4:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14cf835:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     14cf858:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14cf89e:	4d 8d 6e 18          	lea    r13,[r14+0x18]
     14cf8a9:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14cf995:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     14cf9dd:	f3 41 0f 7f 47 18    	movdqu XMMWORD PTR [r15+0x18],xmm0
     14cfa0e:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14cfa29:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14cfa6d:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14cfb81:	4d 89 7d 18          	mov    QWORD PTR [r13+0x18],r15
     14cfd6e:	49 8b 5f 18          	mov    rbx,QWORD PTR [r15+0x18]
     14cfe0f:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
     14cff0b:	49 8d 6f 18          	lea    rbp,[r15+0x18]
     14cff16:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     14cffd3:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d0053:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d00e4:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14d0109:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14d0243:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d0298:	49 89 6f 18          	mov    QWORD PTR [r15+0x18],rbp
     14d03bc:	4c 89 7b 18          	mov    QWORD PTR [rbx+0x18],r15
     14d0491:	4d 89 66 18          	mov    QWORD PTR [r14+0x18],r12
     14d04c2:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d04ec:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
     14d0567:	4c 8b 64 24 18       	mov    r12,QWORD PTR [rsp+0x18]
     14d05d6:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     14d0616:	48 8d 6b 18          	lea    rbp,[rbx+0x18]
     14d07d2:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d081a:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     14d086f:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d08dc:	f3 0f 7f 46 18       	movdqu XMMWORD PTR [rsi+0x18],xmm0
     14d097d:	4c 8b 7c 24 18       	mov    r15,QWORD PTR [rsp+0x18]
     14d0ae1:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d0b2c:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14d0c0b:	ff 50 18             	call   QWORD PTR [rax+0x18]
     14d1008:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d10b4:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     14d10ff:	4d 8d 67 18          	lea    r12,[r15+0x18]
     14d1290:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d12dd:	4c 8d 73 18          	lea    r14,[rbx+0x18]
     14d12ff:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14d13b5:	4c 8d 73 18          	lea    r14,[rbx+0x18]
     14d13d7:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14d1468:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d149f:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d14be:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14d1522:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     14d1549:	4c 89 78 18          	mov    QWORD PTR [rax+0x18],r15
     14d1597:	ff 50 18             	call   QWORD PTR [rax+0x18]
     14d159a:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     14d16c1:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
    ... truncated after 80 matches

### uses containing `+0x20]`
     14cdef4:	4c 89 6b 20          	mov    QWORD PTR [rbx+0x20],r13
     14cdfc0:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
     14cdff3:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
     14ce3cb:	4c 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],r15
     14ce44c:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
     14ce4a6:	4d 8d 77 20          	lea    r14,[r15+0x20]
     14ce56c:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14ce5a8:	4d 8d 7d 20          	lea    r15,[r13+0x20]
     14ce5ac:	f3 41 0f 7f 45 20    	movdqu XMMWORD PTR [r13+0x20],xmm0
     14ce68d:	83 61 20 00          	and    DWORD PTR [rcx+0x20],0x0
     14ce6a5:	83 61 20 00          	and    DWORD PTR [rcx+0x20],0x0
     14ce85e:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
     14ce918:	49 89 5c 24 20       	mov    QWORD PTR [r12+0x20],rbx
     14ce93a:	49 8b 44 24 20       	mov    rax,QWORD PTR [r12+0x20]
     14ce9f5:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax
     14cea32:	4d 8d 7d 20          	lea    r15,[r13+0x20]
     14ceb0e:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx
     14ceb61:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14cebcf:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14ced78:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
     14cee8e:	4d 8d 66 20          	lea    r12,[r14+0x20]
     14cef7b:	48 8d 73 20          	lea    rsi,[rbx+0x20]
     14cf04b:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     14cf3c2:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
     14cf4f6:	4c 89 73 20          	mov    QWORD PTR [rbx+0x20],r14
     14cf575:	41 c6 46 20 00       	mov    BYTE PTR [r14+0x20],0x0
     14cf5c4:	83 7e 20 00          	cmp    DWORD PTR [rsi+0x20],0x0
     14cf686:	48 89 68 20          	mov    QWORD PTR [rax+0x20],rbp
     14cf80b:	48 8d 43 20          	lea    rax,[rbx+0x20]
     14cf80f:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
     14cf8ad:	f3 41 0f 7f 46 20    	movdqu XMMWORD PTR [r14+0x20],xmm0
     14cf8de:	49 8d 46 20          	lea    rax,[r14+0x20]
     14cf953:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14cfc43:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14cff1a:	4d 89 77 20          	mov    QWORD PTR [r15+0x20],r14
     14d00c5:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
     14d01c8:	48 8b 6c 24 20       	mov    rbp,QWORD PTR [rsp+0x20]
     14d02ab:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
     14d0363:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14d0495:	4d 89 6e 20          	mov    QWORD PTR [r14+0x20],r13
     14d04f9:	f3 41 0f 7f 4c 24 20 	movdqu XMMWORD PTR [r12+0x20],xmm1
     14d056c:	49 8d 7c 24 20       	lea    rdi,[r12+0x20]
     14d05a2:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     14d05df:	41 0f 28 44 24 20    	movaps xmm0,XMMWORD PTR [r12+0x20]
     14d05e5:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
     14d067c:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
     14d082c:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
     14d0a09:	4c 89 73 20          	mov    QWORD PTR [rbx+0x20],r14
     14d0b51:	4c 8d 7d 20          	lea    r15,[rbp+0x20]
     14d0b59:	f3 41 0f 7f 44 24 20 	movdqu XMMWORD PTR [r12+0x20],xmm0
     14d10c2:	f3 41 0f 7f 4f 20    	movdqu XMMWORD PTR [r15+0x20],xmm1
     14d11de:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14d14a4:	48 8b 58 20          	mov    rbx,QWORD PTR [rax+0x20]
     14d154d:	4c 89 60 20          	mov    QWORD PTR [rax+0x20],r12
     14d15a9:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14d1683:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
     14d175f:	48 8d 6b 20          	lea    rbp,[rbx+0x20]
     14d1c37:	4d 89 76 20          	mov    QWORD PTR [r14+0x20],r14
     14d1c92:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx
     14d1da9:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
     14d1e4e:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
     14d20c2:	4d 8d 7c 24 20       	lea    r15,[r12+0x20]
     14d21b1:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14d23e4:	48 89 42 20          	mov    QWORD PTR [rdx+0x20],rax
     14d25a8:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
     14d25f3:	4c 89 65 20          	mov    QWORD PTR [rbp+0x20],r12
     14d2704:	f3 0f 6f 41 20       	movdqu xmm0,XMMWORD PTR [rcx+0x20]
     14d2bea:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx
     14d2c22:	48 8b 5d 20          	mov    rbx,QWORD PTR [rbp+0x20]
     14d2e0b:	0f 11 4d 20          	movups XMMWORD PTR [rbp+0x20],xmm1
     14d2e7d:	f3 0f 6f 49 20       	movdqu xmm1,XMMWORD PTR [rcx+0x20]
     14d2efd:	48 8b 7d 20          	mov    rdi,QWORD PTR [rbp+0x20]
     14d2f0e:	48 8b 7d 20          	mov    rdi,QWORD PTR [rbp+0x20]
     14d2f1f:	48 8b 7d 20          	mov    rdi,QWORD PTR [rbp+0x20]
     14d2f65:	4c 8b 75 20          	mov    r14,QWORD PTR [rbp+0x20]
     14d2fde:	4c 8b 75 20          	mov    r14,QWORD PTR [rbp+0x20]
     14d31ac:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
     14d31cd:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx
     14d3256:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
     14d333c:	4c 89 75 20          	mov    QWORD PTR [rbp+0x20],r14
    ... truncated after 80 matches

### uses containing `+0x10]`
     14cdfa1:	ff 50 10             	call   QWORD PTR [rax+0x10]
     14ce19e:	49 8b 45 10          	mov    rax,QWORD PTR [r13+0x10]
     14ce1b6:	f0 48 ff 45 10       	lock inc QWORD PTR [rbp+0x10]
     14ce1e3:	49 8b 45 10          	mov    rax,QWORD PTR [r13+0x10]
     14ce1ec:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     14ce207:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     14ce21f:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     14ce25a:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     14ce26e:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     14ce287:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     14ce312:	48 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],rbp
     14ce317:	f0 48 ff 45 10       	lock inc QWORD PTR [rbp+0x10]
     14ce3d5:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     14ce3da:	f0 48 ff 41 10       	lock inc QWORD PTR [rcx+0x10]
     14ce3f7:	f0 48 ff 41 10       	lock inc QWORD PTR [rcx+0x10]
     14ce52e:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
     14ce753:	83 78 10 ff          	cmp    DWORD PTR [rax+0x10],0xffffffff
     14ceb05:	4c 89 6b 10          	mov    QWORD PTR [rbx+0x10],r13
     14cef1a:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
     14cf042:	48 89 51 10          	mov    QWORD PTR [rcx+0x10],rdx
     14cf0a5:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
     14cf2c6:	49 8b 45 10          	mov    rax,QWORD PTR [r13+0x10]
     14cf2de:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
     14cf4f1:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
     14cf56f:	f3 41 0f 7f 46 10    	movdqu XMMWORD PTR [r14+0x10],xmm0
     14cf624:	49 8b 45 10          	mov    rax,QWORD PTR [r13+0x10]
     14cf62d:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     14cf679:	4c 89 78 10          	mov    QWORD PTR [rax+0x10],r15
     14cf6a0:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     14cfba0:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     14cfbb8:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]
     14cfbf8:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     14cfc76:	ff 50 10             	call   QWORD PTR [rax+0x10]
     14cfe14:	49 8d 7d 10          	lea    rdi,[r13+0x10]
     14d0294:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     14d03e2:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
     14d0428:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     14d0453:	ff 50 10             	call   QWORD PTR [rax+0x10]
     14d08c8:	48 89 5e 10          	mov    QWORD PTR [rsi+0x10],rbx
     14d09eb:	f3 0f 7f 43 10       	movdqu XMMWORD PTR [rbx+0x10],xmm0
     14d0b40:	f3 41 0f 7f 44 24 10 	movdqu XMMWORD PTR [r12+0x10],xmm0
     14d0b9c:	49 8b 5c 24 10       	mov    rbx,QWORD PTR [r12+0x10]
     14d0bc5:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
     14d0c5f:	49 8b 5c 24 10       	mov    rbx,QWORD PTR [r12+0x10]
     14d0c88:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
     14d0d25:	4d 8b 74 24 10       	mov    r14,QWORD PTR [r12+0x10]
     14d0d97:	49 8b 5c 24 10       	mov    rbx,QWORD PTR [r12+0x10]
     14d0dc0:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
     14d0e5a:	49 8b 5c 24 10       	mov    rbx,QWORD PTR [r12+0x10]
     14d0e83:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
     14d0f20:	4d 8b 74 24 10       	mov    r14,QWORD PTR [r12+0x10]
     14d0f96:	4d 8b 74 24 10       	mov    r14,QWORD PTR [r12+0x10]
     14d119a:	4c 8b 70 10          	mov    r14,QWORD PTR [rax+0x10]
     14d1214:	4c 8b 68 10          	mov    r13,QWORD PTR [rax+0x10]
     14d153c:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
     14d2217:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
     14d2592:	88 43 10             	mov    BYTE PTR [rbx+0x10],al
     14d28c8:	ff 50 10             	call   QWORD PTR [rax+0x10]
     14d31c4:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
     14d32bf:	f3 41 0f 6f 44 24 10 	movdqu xmm0,XMMWORD PTR [r12+0x10]
     14d33e2:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     14d34c7:	0f 10 41 10          	movups xmm0,XMMWORD PTR [rcx+0x10]
     14d356d:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
     14d3706:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     14d3971:	49 8b 7d 10          	mov    rdi,QWORD PTR [r13+0x10]
     14d3b6c:	49 8b 7d 10          	mov    rdi,QWORD PTR [r13+0x10]
     14d3f54:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d420f:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d436d:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d45ce:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d4654:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d4696:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d46a8:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d46b5:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d46e1:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d4769:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d4817:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d4843:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d49f9:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     14d4a95:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
    ... truncated after 80 matches


## Callers of ranked provider-vector FDE
### 0xb86d94: call   14cdc2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3131ae>
      b86cd4:	4c 89 63 f0          	mov    QWORD PTR [rbx-0x10],r12
      b86cd8:	4c 89 6b f8          	mov    QWORD PTR [rbx-0x8],r13
      b86cdc:	48 89 df             	mov    rdi,rbx
      b86cdf:	48 8b b4 24 b0 00 00 	mov    rsi,QWORD PTR [rsp+0xb0]
      b86ce6:	00 
      b86ce7:	e8 54 72 c6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      b86cec:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
      b86cf3:	00 
      b86cf4:	48 8d b4 24 28 01 00 	lea    rsi,[rsp+0x128]
      b86cfb:	00 
      b86cfc:	e8 3f 72 c6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      b86d01:	48 8d bc 24 b8 03 00 	lea    rdi,[rsp+0x3b8]
      b86d08:	00 
      b86d09:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
      b86d10:	00 
      b86d11:	e8 2a 72 c6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      b86d16:	48 8d b5 40 01 00 00 	lea    rsi,[rbp+0x140]
      b86d1d:	48 8d bc 24 d0 03 00 	lea    rdi,[rsp+0x3d0]
      b86d24:	00 
      b86d25:	e8 18 1b fc ff       	call   b48842 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x957e2>
      b86d2a:	48 8d b5 58 01 00 00 	lea    rsi,[rbp+0x158]
      b86d31:	4c 8d a4 24 e8 03 00 	lea    r12,[rsp+0x3e8]
      b86d38:	00 
      b86d39:	4c 89 e7             	mov    rdi,r12
      b86d3c:	e8 ff 71 c6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      b86d41:	48 81 c5 70 01 00 00 	add    rbp,0x170
      b86d48:	4c 8d ac 24 00 04 00 	lea    r13,[rsp+0x400]
      b86d4f:	00 
      b86d50:	4c 89 ef             	mov    rdi,r13
      b86d53:	48 89 ee             	mov    rsi,rbp
      b86d56:	e8 e5 71 c6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      b86d5b:	48 8d bc 24 18 04 00 	lea    rdi,[rsp+0x418]
      b86d62:	00 
      b86d63:	48 8d b4 24 38 04 00 	lea    rsi,[rsp+0x438]
      b86d6a:	00 
      b86d6b:	e8 d0 71 c6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      b86d70:	48 8d 9c 24 d8 02 00 	lea    rbx,[rsp+0x2d8]
      b86d77:	00 
      b86d78:	4c 89 bb 58 01 00 00 	mov    QWORD PTR [rbx+0x158],r15
      b86d7f:	31 ff                	xor    edi,edi
      b86d81:	e8 00 77 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86d86:	48 8d ac 24 70 06 00 	lea    rbp,[rsp+0x670]
      b86d8d:	00 
      b86d8e:	48 89 ef             	mov    rdi,rbp
      b86d91:	48 89 de             	mov    rsi,rbx
      b86d94:	e8 91 6e 94 00       	call   14cdc2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3131ae>
      b86d99:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      b86da0:	00 
      b86da1:	48 89 ee             	mov    rsi,rbp
      b86da4:	e8 73 2a f3 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      b86da9:	49 8d 7e 20          	lea    rdi,[r14+0x20]
      b86dad:	48 8d b4 24 80 06 00 	lea    rsi,[rsp+0x680]
      b86db4:	00 
      b86db5:	e8 62 2a f3 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      b86dba:	49 8d 7e 30          	lea    rdi,[r14+0x30]
      b86dbe:	48 8d b4 24 90 06 00 	lea    rsi,[rsp+0x690]
      b86dc5:	00 
      b86dc6:	e8 51 2a f3 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      b86dcb:	4d 8d 6e 40          	lea    r13,[r14+0x40]
      b86dcf:	48 8d b4 24 a0 06 00 	lea    rsi,[rsp+0x6a0]
      b86dd6:	00 
      b86dd7:	4c 89 ef             	mov    rdi,r13
      b86dda:	e8 3d 2a f3 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      b86ddf:	49 8d 7e 50          	lea    rdi,[r14+0x50]
      b86de3:	48 8d b4 24 b0 06 00 	lea    rsi,[rsp+0x6b0]
      b86dea:	00 
      b86deb:	e8 2c 2a f3 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      b86df0:	49 8d 7e 60          	lea    rdi,[r14+0x60]
      b86df4:	48 8d 9c 24 c0 06 00 	lea    rbx,[rsp+0x6c0]
      b86dfb:	00 
      b86dfc:	48 89 de             	mov    rsi,rbx
      b86dff:	e8 18 2a f3 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      b86e04:	0f 28 43 10          	movaps xmm0,XMMWORD PTR [rbx+0x10]
      b86e08:	66 0f ef c9          	pxor   xmm1,xmm1
      b86e0c:	66 0f 7f 4b 10       	movdqa XMMWORD PTR [rbx+0x10],xmm1
      b86e11:	49 8b 7e 78          	mov    rdi,QWORD PTR [r14+0x78]
      b86e15:	41 0f 11 46 70       	movups XMMWORD PTR [r14+0x70],xmm0
      b86e1a:	e8 67 76 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>


## Potential setup-bundle construction calls near callers
### 0x14c03c8: call   17edf00 <_Znwm@plt>
     14c039c:	e8 e3 ff ff ff       	call   14c0384 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x305908>
     14c03a1:	48 89 df             	mov    rdi,rbx
     14c03a4:	5b                   	pop    rbx
     14c03a5:	e9 76 db 32 00       	jmp    17edf20 <_ZdlPv@plt>
     14c03aa:	41 56                	push   r14
     14c03ac:	53                   	push   rbx
     14c03ad:	48 83 ec 28          	sub    rsp,0x28
     14c03b1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c03b8:	00 00 
     14c03ba:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     14c03bf:	4c 8d 77 10          	lea    r14,[rdi+0x10]
     14c03c3:	bf 20 02 00 00       	mov    edi,0x220
     14c03c8:	e8 33 db 32 00       	call   17edf00 <_Znwm@plt>
     14c03cd:	48 89 c3             	mov    rbx,rax
     14c03d0:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     14c03d4:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
     14c03d9:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     14c03de:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
     14c03e5:	00 00 
     14c03e7:	48 8d 05 b2 82 3b 00 	lea    rax,[rip+0x3b82b2]        # 18786a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x34d88>
     14c03ee:	48 89 03             	mov    QWORD PTR [rbx],rax

### 0x14c04cf: call   17edf00 <_Znwm@plt>
     14c049c:	49 89 f7             	mov    r15,rsi
     14c049f:	49 89 fe             	mov    r14,rdi
     14c04a2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c04a9:	00 00 
     14c04ab:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
     14c04b2:	00 
     14c04b3:	48 8b 6e 10          	mov    rbp,QWORD PTR [rsi+0x10]
     14c04b7:	48 8b be 10 01 00 00 	mov    rdi,QWORD PTR [rsi+0x110]
     14c04be:	e8 9f 9f 5b ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
     14c04c3:	49 89 c5             	mov    r13,rax
     14c04c6:	4d 8b 67 18          	mov    r12,QWORD PTR [r15+0x18]
     14c04ca:	bf 40 03 00 00       	mov    edi,0x340
     14c04cf:	e8 2c da 32 00       	call   17edf00 <_Znwm@plt>
     14c04d4:	48 89 c3             	mov    rbx,rax
     14c04d7:	66 0f ef c0          	pxor   xmm0,xmm0
     14c04db:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14c04e0:	48 8d 05 e1 a8 34 00 	lea    rax,[rip+0x34a8e1]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
     14c04e7:	48 89 03             	mov    QWORD PTR [rbx],rax
     14c04ea:	41 8b 87 00 02 00 00 	mov    eax,DWORD PTR [r15+0x200]
     14c04f1:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     14c04f8:	00 

### 0x14c07e6: call   17edf00 <_Znwm@plt>
     14c07b7:	e8 4d b3 ff ff       	call   14bbb09 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30108d>
     14c07bc:	58                   	pop    rax
     14c07bd:	59                   	pop    rcx
     14c07be:	4c 8d a4 24 30 01 00 	lea    r12,[rsp+0x130]
     14c07c5:	00 
     14c07c6:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
     14c07ca:	49 83 24 24 00       	and    QWORD PTR [r12],0x0
     14c07cf:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
     14c07d4:	e8 93 b5 ff ff       	call   14bbd6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3012f0>
     14c07d9:	4c 89 e7             	mov    rdi,r12
     14c07dc:	e8 e7 b5 ff ff       	call   14bbdc8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30134c>
     14c07e1:	bf c0 00 00 00       	mov    edi,0xc0
     14c07e6:	e8 15 d7 32 00       	call   17edf00 <_Znwm@plt>
     14c07eb:	49 89 c5             	mov    r13,rax
     14c07ee:	66 41 0f 6f 87 40 01 	movdqa xmm0,XMMWORD PTR [r15+0x140]
     14c07f5:	00 00 
     14c07f7:	66 0f 7f 44 24 30    	movdqa XMMWORD PTR [rsp+0x30],xmm0
     14c07fd:	49 8b 87 48 01 00 00 	mov    rax,QWORD PTR [r15+0x148]
     14c0804:	48 85 c0             	test   rax,rax
     14c0807:	74 05                	je     14c080e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x305d92>
     14c0809:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]

### 0x14c0943: call   17edf00 <_Znwm@plt>
     14c0911:	e8 54 96 5b ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14c0916:	31 ff                	xor    edi,edi
     14c0918:	e8 69 db 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14c091d:	4c 8d b4 24 c0 00 00 	lea    r14,[rsp+0xc0]
     14c0924:	00 
     14c0925:	49 83 26 00          	and    QWORD PTR [r14],0x0
     14c0929:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     14c092e:	4c 89 ee             	mov    rsi,r13
     14c0931:	e8 ca b4 ff ff       	call   14bbe00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x301384>
     14c0936:	4c 89 f7             	mov    rdi,r14
     14c0939:	e8 00 b5 ff ff       	call   14bbe3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3013c2>
     14c093e:	bf 90 02 00 00       	mov    edi,0x290
     14c0943:	e8 b8 d5 32 00       	call   17edf00 <_Znwm@plt>
     14c0948:	49 89 c6             	mov    r14,rax
     14c094b:	4d 8d 87 a8 00 00 00 	lea    r8,[r15+0xa8]
     14c0952:	49 8d 87 70 01 00 00 	lea    rax,[r15+0x170]
     14c0959:	49 81 c7 08 02 00 00 	add    r15,0x208
     14c0960:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     14c0965:	4c 8d 91 18 04 00 00 	lea    r10,[rcx+0x418]
     14c096c:	48 8b 54 24 20       	mov    rdx,QWORD PTR [rsp+0x20]
     14c0971:	48 8b 4a 08          	mov    rcx,QWORD PTR [rdx+0x8]

### 0x14c0f1b: call   17edf00 <_Znwm@plt>
     14c0ef3:	48 8b bb 90 00 00 00 	mov    rdi,QWORD PTR [rbx+0x90]
     14c0efa:	e8 87 d5 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14c0eff:	4c 89 ff             	mov    rdi,r15
     14c0f02:	e8 c9 ed 5a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     14c0f07:	41 56                	push   r14
     14c0f09:	53                   	push   rbx
     14c0f0a:	48 83 ec 18          	sub    rsp,0x18
     14c0f0e:	49 89 f6             	mov    r14,rsi
     14c0f11:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
     14c0f15:	48 89 fb             	mov    rbx,rdi
     14c0f18:	6a 40                	push   0x40
     14c0f1a:	5f                   	pop    rdi
     14c0f1b:	e8 e0 cf 32 00       	call   17edf00 <_Znwm@plt>
     14c0f20:	48 89 c1             	mov    rcx,rax
     14c0f23:	0f 57 c0             	xorps  xmm0,xmm0
     14c0f26:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     14c0f2a:	48 8d 15 37 c5 33 00 	lea    rdx,[rip+0x33c537]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14c0f31:	48 89 10             	mov    QWORD PTR [rax],rdx
     14c0f34:	48 8d 15 cd 79 3b 00 	lea    rdx,[rip+0x3b79cd]        # 1878908 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x34ff0>
     14c0f3b:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
     14c0f3f:	66 0f 6f 04 24       	movdqa xmm0,XMMWORD PTR [rsp]

### 0x14c13cb: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14c139c:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14c139f:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     14c13a4:	4c 89 f6             	mov    rsi,r14
     14c13a7:	4c 89 fa             	mov    rdx,r15
     14c13aa:	ff 50 10             	call   QWORD PTR [rax+0x10]
     14c13ad:	4c 8d 74 24 48       	lea    r14,[rsp+0x48]
     14c13b2:	48 89 df             	mov    rdi,rbx
     14c13b5:	4c 89 f6             	mov    rsi,r14
     14c13b8:	e8 81 86 31 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     14c13bd:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14c13c1:	e8 c0 d0 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14c13c6:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     14c13cb:	e8 18 94 31 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14c13d0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c13d7:	00 00 
     14c13d9:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
     14c13de:	75 32                	jne    14c1412 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306996>
     14c13e0:	48 89 d8             	mov    rax,rbx
     14c13e3:	48 83 c4 60          	add    rsp,0x60
     14c13e7:	5b                   	pop    rbx
     14c13e8:	41 5e                	pop    r14

### 0x14c13f5: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14c13d0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c13d7:	00 00 
     14c13d9:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
     14c13de:	75 32                	jne    14c1412 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306996>
     14c13e0:	48 89 d8             	mov    rax,rbx
     14c13e3:	48 83 c4 60          	add    rsp,0x60
     14c13e7:	5b                   	pop    rbx
     14c13e8:	41 5e                	pop    r14
     14c13ea:	41 5f                	pop    r15
     14c13ec:	c3                   	ret
     14c13ed:	48 89 c3             	mov    rbx,rax
     14c13f0:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     14c13f5:	e8 ee 93 31 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14c13fa:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c1401:	00 00 
     14c1403:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
     14c1408:	75 08                	jne    14c1412 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306996>
     14c140a:	48 89 df             	mov    rdi,rbx
     14c140d:	e8 be e8 5a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     14c1412:	e8 99 e6 32 00       	call   17efab0 <__stack_chk_fail@plt>
     14c1417:	cc                   	int3

### 0x14c1475: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14c1446:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14c1449:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     14c144e:	4c 89 f6             	mov    rsi,r14
     14c1451:	4c 89 fa             	mov    rdx,r15
     14c1454:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14c1457:	4c 8d 74 24 48       	lea    r14,[rsp+0x48]
     14c145c:	48 89 df             	mov    rdi,rbx
     14c145f:	4c 89 f6             	mov    rsi,r14
     14c1462:	e8 d7 85 31 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     14c1467:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14c146b:	e8 16 d0 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14c1470:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     14c1475:	e8 6e 93 31 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14c147a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c1481:	00 00 
     14c1483:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
     14c1488:	75 32                	jne    14c14bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306a40>
     14c148a:	48 89 d8             	mov    rax,rbx
     14c148d:	48 83 c4 60          	add    rsp,0x60
     14c1491:	5b                   	pop    rbx
     14c1492:	41 5e                	pop    r14

### 0x14c149f: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14c147a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c1481:	00 00 
     14c1483:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
     14c1488:	75 32                	jne    14c14bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306a40>
     14c148a:	48 89 d8             	mov    rax,rbx
     14c148d:	48 83 c4 60          	add    rsp,0x60
     14c1491:	5b                   	pop    rbx
     14c1492:	41 5e                	pop    r14
     14c1494:	41 5f                	pop    r15
     14c1496:	c3                   	ret
     14c1497:	48 89 c3             	mov    rbx,rax
     14c149a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     14c149f:	e8 44 93 31 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14c14a4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c14ab:	00 00 
     14c14ad:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
     14c14b2:	75 08                	jne    14c14bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306a40>
     14c14b4:	48 89 df             	mov    rdi,rbx
     14c14b7:	e8 14 e8 5a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     14c14bc:	e8 ef e5 32 00       	call   17efab0 <__stack_chk_fail@plt>
     14c14c1:	cc                   	int3

### 0x14c156b: call   17edf00 <_Znwm@plt>
     14c1546:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c154d:	00 00 
     14c154f:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     14c1554:	75 08                	jne    14c155e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306ae2>
     14c1556:	4c 89 f7             	mov    rdi,r14
     14c1559:	e8 72 e7 5a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     14c155e:	e8 4d e5 32 00       	call   17efab0 <__stack_chk_fail@plt>
     14c1563:	cc                   	int3
     14c1564:	53                   	push   rbx
     14c1565:	48 89 fb             	mov    rbx,rdi
     14c1568:	6a 10                	push   0x10
     14c156a:	5f                   	pop    rdi
     14c156b:	e8 90 c9 32 00       	call   17edf00 <_Znwm@plt>
     14c1570:	48 8d 0d d9 73 3b 00 	lea    rcx,[rip+0x3b73d9]        # 1878950 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35038>
     14c1577:	48 89 08             	mov    QWORD PTR [rax],rcx
     14c157a:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
     14c157e:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     14c1582:	5b                   	pop    rbx
     14c1583:	c3                   	ret
     14c1584:	48 8d 05 c5 73 3b 00 	lea    rax,[rip+0x3b73c5]        # 1878950 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35038>
     14c158b:	48 89 06             	mov    QWORD PTR [rsi],rax

### 0x14c1d9c: call   17edf00 <_Znwm@plt>
     14c1d77:	48 89 df             	mov    rdi,rbx
     14c1d7a:	5b                   	pop    rbx
     14c1d7b:	e9 a0 c1 32 00       	jmp    17edf20 <_ZdlPv@plt>
     14c1d80:	41 56                	push   r14
     14c1d82:	53                   	push   rbx
     14c1d83:	48 83 ec 28          	sub    rsp,0x28
     14c1d87:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c1d8e:	00 00 
     14c1d90:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     14c1d95:	4c 8d 77 10          	lea    r14,[rdi+0x10]
     14c1d99:	6a 70                	push   0x70
     14c1d9b:	5f                   	pop    rdi
     14c1d9c:	e8 5f c1 32 00       	call   17edf00 <_Znwm@plt>
     14c1da1:	48 89 c3             	mov    rbx,rax
     14c1da4:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     14c1da8:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
     14c1dad:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     14c1db2:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
     14c1db9:	00 00 
     14c1dbb:	48 8d 05 d6 6b 3b 00 	lea    rax,[rip+0x3b6bd6]        # 1878998 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35080>
     14c1dc2:	48 89 03             	mov    QWORD PTR [rbx],rax

### 0x14c1e62: call   17edf00 <_Znwm@plt>
     14c1e3a:	41 57                	push   r15
     14c1e3c:	41 56                	push   r14
     14c1e3e:	41 54                	push   r12
     14c1e40:	53                   	push   rbx
     14c1e41:	48 83 ec 68          	sub    rsp,0x68
     14c1e45:	49 89 f7             	mov    r15,rsi
     14c1e48:	49 89 fe             	mov    r14,rdi
     14c1e4b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c1e52:	00 00 
     14c1e54:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     14c1e59:	4c 8d 66 10          	lea    r12,[rsi+0x10]
     14c1e5d:	bf 50 02 00 00       	mov    edi,0x250
     14c1e62:	e8 99 c0 32 00       	call   17edf00 <_Znwm@plt>
     14c1e67:	48 89 c3             	mov    rbx,rax
     14c1e6a:	0f 57 c0             	xorps  xmm0,xmm0
     14c1e6d:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     14c1e71:	48 8d 05 50 8f 34 00 	lea    rax,[rip+0x348f50]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
     14c1e78:	48 89 03             	mov    QWORD PTR [rbx],rax
     14c1e7b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     14c1e80:	4c 89 e6             	mov    rsi,r12
     14c1e83:	e8 08 84 5b ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>

### 0x14c23fc: call   17edf00 <_Znwm@plt>
     14c23e1:	c3                   	ret
     14c23e2:	53                   	push   rbx
     14c23e3:	48 85 ff             	test   rdi,rdi
     14c23e6:	74 11                	je     14c23f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30797d>
     14c23e8:	48 89 fb             	mov    rbx,rdi
     14c23eb:	6a 28                	push   0x28
     14c23ed:	5e                   	pop    rsi
     14c23ee:	e8 39 80 2c 00       	call   178a42c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e598>
     14c23f3:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
     14c23f7:	eb 0d                	jmp    14c2406 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30798a>
     14c23f9:	6a 28                	push   0x28
     14c23fb:	5f                   	pop    rdi
     14c23fc:	e8 ff ba 32 00       	call   17edf00 <_Znwm@plt>
     14c2401:	48 83 60 08 00       	and    QWORD PTR [rax+0x8],0x0
     14c2406:	48 8d 0d bb 91 3d 00 	lea    rcx,[rip+0x3d91bb]        # 189b5c8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x8508>
     14c240d:	48 89 08             	mov    QWORD PTR [rax],rcx
     14c2410:	0f 57 c0             	xorps  xmm0,xmm0
     14c2413:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
     14c2417:	83 60 20 00          	and    DWORD PTR [rax+0x20],0x0
     14c241b:	5b                   	pop    rbx
     14c241c:	c3                   	ret

### 0x14c2437: call   17edf00 <_Znwm@plt>
     14c241d:	cc                   	int3
     14c241e:	53                   	push   rbx
     14c241f:	48 89 fb             	mov    rbx,rdi
     14c2422:	48 85 ff             	test   rdi,rdi
     14c2425:	74 0d                	je     14c2434 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3079b8>
     14c2427:	6a 28                	push   0x28
     14c2429:	5e                   	pop    rsi
     14c242a:	48 89 df             	mov    rdi,rbx
     14c242d:	e8 fa 7f 2c 00       	call   178a42c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e598>
     14c2432:	eb 08                	jmp    14c243c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3079c0>
     14c2434:	6a 28                	push   0x28
     14c2436:	5f                   	pop    rdi
     14c2437:	e8 c4 ba 32 00       	call   17edf00 <_Znwm@plt>
     14c243c:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
     14c2440:	48 8d 0d c1 9a 3d 00 	lea    rcx,[rip+0x3d9ac1]        # 189bf08 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x8e48>
     14c2447:	48 89 08             	mov    QWORD PTR [rax],rcx
     14c244a:	0f 57 c0             	xorps  xmm0,xmm0
     14c244d:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
     14c2451:	48 83 60 20 00       	and    QWORD PTR [rax+0x20],0x0
     14c2456:	5b                   	pop    rbx
     14c2457:	c3                   	ret

### 0x14c2481: call   17edf00 <_Znwm@plt>
     14c2458:	41 57                	push   r15
     14c245a:	41 56                	push   r14
     14c245c:	41 55                	push   r13
     14c245e:	41 54                	push   r12
     14c2460:	53                   	push   rbx
     14c2461:	48 81 ec f0 00 00 00 	sub    rsp,0xf0
     14c2468:	48 89 fb             	mov    rbx,rdi
     14c246b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c2472:	00 00 
     14c2474:	48 89 84 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],rax
     14c247b:	00 
     14c247c:	bf b8 00 00 00       	mov    edi,0xb8
     14c2481:	e8 7a ba 32 00       	call   17edf00 <_Znwm@plt>
     14c2486:	49 89 c6             	mov    r14,rax
     14c2489:	0f 57 c0             	xorps  xmm0,xmm0
     14c248c:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     14c2490:	48 8d 05 21 67 3b 00 	lea    rax,[rip+0x3b6721]        # 1878bb8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x352a0>
     14c2497:	49 89 06             	mov    QWORD PTR [r14],rax
     14c249a:	4d 89 f7             	mov    r15,r14
     14c249d:	49 83 c7 18          	add    r15,0x18
     14c24a1:	31 c0                	xor    eax,eax

### 0x14c2541: call   17edf00 <_Znwm@plt>
     14c2520:	41 5d                	pop    r13
     14c2522:	41 5e                	pop    r14
     14c2524:	41 5f                	pop    r15
     14c2526:	c3                   	ret
     14c2527:	e8 84 d5 32 00       	call   17efab0 <__stack_chk_fail@plt>
     14c252c:	48 89 c7             	mov    rdi,rax
     14c252f:	e8 71 75 5b ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     14c2534:	41 57                	push   r15
     14c2536:	41 56                	push   r14
     14c2538:	53                   	push   rbx
     14c2539:	48 89 fb             	mov    rbx,rdi
     14c253c:	bf b8 00 00 00       	mov    edi,0xb8
     14c2541:	e8 ba b9 32 00       	call   17edf00 <_Znwm@plt>
     14c2546:	49 89 c6             	mov    r14,rax
     14c2549:	0f 57 c0             	xorps  xmm0,xmm0
     14c254c:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     14c2550:	48 8d 05 61 66 3b 00 	lea    rax,[rip+0x3b6661]        # 1878bb8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x352a0>
     14c2557:	49 89 06             	mov    QWORD PTR [r14],rax
     14c255a:	4d 8d 7e 18          	lea    r15,[r14+0x18]
     14c255e:	ba a0 00 00 00       	mov    edx,0xa0
     14c2563:	4c 89 ff             	mov    rdi,r15

### 0x14c27e6: call   17edf00 <_Znwm@plt>
     14c27b3:	00 
     14c27b4:	0f 84 51 02 00 00    	je     14c2a0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x307f8f>
     14c27ba:	48 89 2c 24          	mov    QWORD PTR [rsp],rbp
     14c27be:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     14c27c3:	e8 e9 d8 a3 ff       	call   f000b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc74c7>
     14c27c8:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
     14c27cd:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     14c27d2:	4c 8b 7c 24 48       	mov    r15,QWORD PTR [rsp+0x48]
     14c27d7:	4d 85 ff             	test   r15,r15
     14c27da:	74 05                	je     14c27e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x307d65>
     14c27dc:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
     14c27e1:	bf 80 00 00 00       	mov    edi,0x80
     14c27e6:	e8 15 b7 32 00       	call   17edf00 <_Znwm@plt>
     14c27eb:	48 89 c5             	mov    rbp,rax
     14c27ee:	49 83 c4 28          	add    r12,0x28
     14c27f2:	66 0f ef c0          	pxor   xmm0,xmm0
     14c27f6:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14c27fb:	48 8d 05 ee 63 3b 00 	lea    rax,[rip+0x3b63ee]        # 1878bf0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x352d8>
     14c2802:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     14c2806:	49 89 ed             	mov    r13,rbp
     14c2809:	49 83 c5 18          	add    r13,0x18

### 0x14c289b: call   17edf00 <_Znwm@plt>
     14c2867:	00 
     14c2868:	e8 61 11 00 00       	call   14c39ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x308f52>
     14c286d:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     14c2871:	4c 8b a0 60 01 00 00 	mov    r12,QWORD PTR [rax+0x160]
     14c2878:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     14c287f:	00 
     14c2880:	48 8d b4 24 40 10 00 	lea    rsi,[rsp+0x1040]
     14c2887:	00 
     14c2888:	e8 55 12 00 00       	call   14c3ae2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x309066>
     14c288d:	48 83 a4 24 30 10 00 	and    QWORD PTR [rsp+0x1030],0x0
     14c2894:	00 00 
     14c2896:	bf 20 0f 00 00       	mov    edi,0xf20
     14c289b:	e8 60 b6 32 00       	call   17edf00 <_Znwm@plt>
     14c28a0:	49 89 c5             	mov    r13,rax
     14c28a3:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     14c28a8:	48 8d 84 24 87 00 00 	lea    rax,[rsp+0x87]
     14c28af:	00 
     14c28b0:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     14c28b5:	48 c7 44 24 70 01 00 	mov    QWORD PTR [rsp+0x70],0x1
     14c28bc:	00 00 
     14c28be:	48 8d 05 63 63 3b 00 	lea    rax,[rip+0x3b6363]        # 1878c28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35310>

### 0x14c2938: call   17edf00 <_Znwm@plt>
     14c290e:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     14c2912:	48 8d ac 24 10 10 00 	lea    rbp,[rsp+0x1010]
     14c2919:	00 
     14c291a:	4c 89 6d 20          	mov    QWORD PTR [rbp+0x20],r13
     14c291e:	e8 a7 79 5b ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     14c2923:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     14c2927:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     14c292c:	4c 89 e6             	mov    rsi,r12
     14c292f:	48 89 ea             	mov    rdx,rbp
     14c2932:	ff 50 28             	call   QWORD PTR [rax+0x28]
     14c2935:	6a 28                	push   0x28
     14c2937:	5f                   	pop    rdi
     14c2938:	e8 c3 b5 32 00       	call   17edf00 <_Znwm@plt>
     14c293d:	49 89 c4             	mov    r12,rax
     14c2940:	66 0f ef c0          	pxor   xmm0,xmm0
     14c2944:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14c2949:	48 8d 05 68 63 3b 00 	lea    rax,[rip+0x3b6368]        # 1878cb8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x353a0>
     14c2950:	49 89 04 24          	mov    QWORD PTR [r12],rax
     14c2954:	4d 89 e5             	mov    r13,r12
     14c2957:	49 83 c5 18          	add    r13,0x18
     14c295b:	48 8d 6c 24 50       	lea    rbp,[rsp+0x50]

### 0x14c2a68: call   17edf00 <_Znwm@plt>
     14c2a43:	00 
     14c2a44:	4d 85 ff             	test   r15,r15
     14c2a47:	74 0f                	je     14c2a58 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x307fdc>
     14c2a49:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
     14c2a4e:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
     14c2a53:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
     14c2a58:	4c 8b a4 24 10 10 00 	mov    r12,QWORD PTR [rsp+0x1010]
     14c2a5f:	00 
     14c2a60:	4d 85 e4             	test   r12,r12
     14c2a63:	74 7f                	je     14c2ae4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x308068>
     14c2a65:	6a 20                	push   0x20
     14c2a67:	5f                   	pop    rdi
     14c2a68:	e8 93 b4 32 00       	call   17edf00 <_Znwm@plt>
     14c2a6d:	4c 89 68 10          	mov    QWORD PTR [rax+0x10],r13
     14c2a71:	4c 89 78 18          	mov    QWORD PTR [rax+0x18],r15
     14c2a75:	48 8d 0d fa 10 00 00 	lea    rcx,[rip+0x10fa]        # 14c3b76 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3090fa>
     14c2a7c:	48 89 08             	mov    QWORD PTR [rax],rcx
     14c2a7f:	48 8d 0d 32 ce 67 ff 	lea    rcx,[rip+0xffffffffff67ce32]        # b3f8b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c858>
     14c2a86:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     14c2a8a:	4c 89 e7             	mov    rdi,r12
     14c2a8d:	48 89 c6             	mov    rsi,rax

### 0x14c2beb: call   17edf00 <_Znwm@plt>
     14c2bc1:	8b 6c 24 20          	mov    ebp,DWORD PTR [rsp+0x20]
     14c2bc5:	f3 41 0f 6f 06       	movdqu xmm0,XMMWORD PTR [r14]
     14c2bca:	66 0f 7f 44 24 20    	movdqa XMMWORD PTR [rsp+0x20],xmm0
     14c2bd0:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
     14c2bd4:	4d 85 f6             	test   r14,r14
     14c2bd7:	74 05                	je     14c2bde <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x308162>
     14c2bd9:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
     14c2bde:	4c 8b 7c 24 60       	mov    r15,QWORD PTR [rsp+0x60]
     14c2be3:	4d 85 ff             	test   r15,r15
     14c2be6:	74 7e                	je     14c2c66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3081ea>
     14c2be8:	6a 28                	push   0x28
     14c2bea:	5f                   	pop    rdi
     14c2beb:	e8 10 b3 32 00       	call   17edf00 <_Znwm@plt>
     14c2bf0:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
     14c2bf6:	f3 0f 7f 40 10       	movdqu XMMWORD PTR [rax+0x10],xmm0
     14c2bfb:	4d 85 f6             	test   r14,r14
     14c2bfe:	74 05                	je     14c2c05 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x308189>
     14c2c00:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
     14c2c05:	40 88 68 20          	mov    BYTE PTR [rax+0x20],bpl
     14c2c09:	48 8d 0d 18 10 00 00 	lea    rcx,[rip+0x1018]        # 14c3c28 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3091ac>
     14c2c10:	48 89 08             	mov    QWORD PTR [rax],rcx

### 0x14c339f: call   17edf00 <_Znwm@plt>
     14c3377:	49 8b 4d 08          	mov    rcx,QWORD PTR [r13+0x8]
     14c337b:	48 29 ce             	sub    rsi,rcx
     14c337e:	49 8b 55 18          	mov    rdx,QWORD PTR [r13+0x18]
     14c3382:	48 89 d7             	mov    rdi,rdx
     14c3385:	48 29 c7             	sub    rdi,rax
     14c3388:	6a 2a                	push   0x2a
     14c338a:	41 5e                	pop    r14
     14c338c:	48 39 fe             	cmp    rsi,rdi
     14c338f:	73 28                	jae    14c33b9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30893d>
     14c3391:	48 39 c1             	cmp    rcx,rax
     14c3394:	0f 84 d1 01 00 00    	je     14c356b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x308aef>
     14c339a:	bf f0 0f 00 00       	mov    edi,0xff0
     14c339f:	e8 5c ab 32 00       	call   17edf00 <_Znwm@plt>
     14c33a4:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
     14c33a9:	48 89 06             	mov    QWORD PTR [rsi],rax
     14c33ac:	4c 89 ef             	mov    rdi,r13
     14c33af:	e8 06 ae 68 ff       	call   b4e1ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b15a>
     14c33b4:	e9 ec 01 00 00       	jmp    14c35a5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x308b29>
     14c33b9:	49 8d 4d 18          	lea    rcx,[r13+0x18]
     14c33bd:	48 c1 ff 02          	sar    rdi,0x2
     14c33c1:	48 39 c2             	cmp    rdx,rax

### 0x14c33f2: call   17edf00 <_Znwm@plt>
     14c33c1:	48 39 c2             	cmp    rdx,rax
     14c33c4:	6a 01                	push   0x1
     14c33c6:	58                   	pop    rax
     14c33c7:	48 0f 44 f8          	cmove  rdi,rax
     14c33cb:	48 89 4c 24 60       	mov    QWORD PTR [rsp+0x60],rcx
     14c33d0:	e8 4d c5 5d ff       	call   a9f922 <JNI_OnUnload@@Base+0x271ef>
     14c33d5:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     14c33da:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     14c33df:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     14c33e4:	48 8d 04 d0          	lea    rax,[rax+rdx*8]
     14c33e8:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     14c33ed:	bf f0 0f 00 00       	mov    edi,0xff0
     14c33f2:	e8 09 ab 32 00       	call   17edf00 <_Znwm@plt>
     14c33f7:	49 8d 4d 28          	lea    rcx,[r13+0x28]
     14c33fb:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     14c3400:	48 89 4c 24 30       	mov    QWORD PTR [rsp+0x30],rcx
     14c3405:	48 c7 44 24 38 55 00 	mov    QWORD PTR [rsp+0x38],0x55
     14c340c:	00 00 
     14c340e:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
     14c3413:	48 89 06             	mov    QWORD PTR [rsi],rax
     14c3416:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]

### 0x14c3570: call   17edf00 <_Znwm@plt>
     14c353e:	e8 5b c4 5d ff       	call   a9f99e <JNI_OnUnload@@Base+0x2726b>
     14c3543:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14c3546:	49 89 06             	mov    QWORD PTR [r14],rax
     14c3549:	4c 8b 74 24 50       	mov    r14,QWORD PTR [rsp+0x50]
     14c354e:	49 83 c6 08          	add    r14,0x8
     14c3552:	4c 89 74 24 50       	mov    QWORD PTR [rsp+0x50],r14
     14c3557:	49 83 c7 08          	add    r15,0x8
     14c355b:	4d 3b 7d 10          	cmp    r15,QWORD PTR [r13+0x10]
     14c355f:	0f 85 d4 fe ff ff    	jne    14c3439 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3089bd>
     14c3565:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
     14c3569:	eb 5b                	jmp    14c35c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x308b4a>
     14c356b:	bf f0 0f 00 00       	mov    edi,0xff0
     14c3570:	e8 8b a9 32 00       	call   17edf00 <_Znwm@plt>
     14c3575:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
     14c357a:	48 89 06             	mov    QWORD PTR [rsi],rax
     14c357d:	4c 89 ef             	mov    rdi,r13
     14c3580:	e8 6d ad 68 ff       	call   b4e2f2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b292>
     14c3585:	49 8b 45 10          	mov    rax,QWORD PTR [r13+0x10]
     14c3589:	48 8b 48 f8          	mov    rcx,QWORD PTR [rax-0x8]
     14c358d:	48 83 c0 f8          	add    rax,0xfffffffffffffff8
     14c3591:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]

### 0x14c3e68: call   17edf00 <_Znwm@plt>
     14c3e3c:	e8 e3 ff ff ff       	call   14c3e24 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3093a8>
     14c3e41:	48 89 df             	mov    rdi,rbx
     14c3e44:	5b                   	pop    rbx
     14c3e45:	e9 d6 a0 32 00       	jmp    17edf20 <_ZdlPv@plt>
     14c3e4a:	41 56                	push   r14
     14c3e4c:	53                   	push   rbx
     14c3e4d:	48 83 ec 28          	sub    rsp,0x28
     14c3e51:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c3e58:	00 00 
     14c3e5a:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     14c3e5f:	4c 8d 77 08          	lea    r14,[rdi+0x8]
     14c3e63:	bf 20 0f 00 00       	mov    edi,0xf20
     14c3e68:	e8 93 a0 32 00       	call   17edf00 <_Znwm@plt>
     14c3e6d:	48 89 c3             	mov    rbx,rax
     14c3e70:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     14c3e74:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
     14c3e79:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     14c3e7e:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
     14c3e85:	00 00 
     14c3e87:	48 8d 05 9a 4d 3b 00 	lea    rax,[rip+0x3b4d9a]        # 1878c28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35310>
     14c3e8e:	48 89 03             	mov    QWORD PTR [rbx],rax

### 0x14c53ea: call   17edf00 <_Znwm@plt>
     14c53bc:	49 39 cd             	cmp    r13,rcx
     14c53bf:	4c 0f 46 e9          	cmovbe r13,rcx
     14c53c3:	48 b9 f8 ff ff ff ff 	movabs rcx,0x7ffffffffffffff8
     14c53ca:	ff ff 7f 
     14c53cd:	48 39 c8             	cmp    rax,rcx
     14c53d0:	4c 0f 43 ea          	cmovae r13,rdx
     14c53d4:	4d 85 ed             	test   r13,r13
     14c53d7:	74 18                	je     14c53f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30a975>
     14c53d9:	49 39 d5             	cmp    r13,rdx
     14c53dc:	0f 87 18 02 00 00    	ja     14c55fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30ab7e>
     14c53e2:	4a 8d 3c ed 00 00 00 	lea    rdi,[r13*8+0x0]
     14c53e9:	00 
     14c53ea:	e8 11 8b 32 00       	call   17edf00 <_Znwm@plt>
     14c53ef:	eb 02                	jmp    14c53f3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30a977>
     14c53f1:	31 c0                	xor    eax,eax
     14c53f3:	4e 8d 34 f0          	lea    r14,[rax+r14*8]
     14c53f7:	49 89 2e             	mov    QWORD PTR [r14],rbp
     14c53fa:	4c 89 f1             	mov    rcx,r14
     14c53fd:	4d 39 e7             	cmp    r15,r12
     14c5400:	74 1a                	je     14c541c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30a9a0>
     14c5402:	49 8b 57 f8          	mov    rdx,QWORD PTR [r15-0x8]

### 0x14c5af5: call   17edf00 <_Znwm@plt>
     14c5ade:	5b                   	pop    rbx
     14c5adf:	41 5c                	pop    r12
     14c5ae1:	41 5d                	pop    r13
     14c5ae3:	41 5e                	pop    r14
     14c5ae5:	41 5f                	pop    r15
     14c5ae7:	5d                   	pop    rbp
     14c5ae8:	c3                   	ret
     14c5ae9:	e8 c2 9f 32 00       	call   17efab0 <__stack_chk_fail@plt>
     14c5aee:	53                   	push   rbx
     14c5aef:	48 89 fb             	mov    rbx,rdi
     14c5af2:	6a 18                	push   0x18
     14c5af4:	5f                   	pop    rdi
     14c5af5:	e8 06 84 32 00       	call   17edf00 <_Znwm@plt>
     14c5afa:	48 8d 0d 6f 31 3b 00 	lea    rcx,[rip+0x3b316f]        # 1878c70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35358>
     14c5b01:	48 89 08             	mov    QWORD PTR [rax],rcx
     14c5b04:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
     14c5b08:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     14c5b0c:	5b                   	pop    rbx
     14c5b0d:	c3                   	ret
     14c5b0e:	48 8d 05 5b 31 3b 00 	lea    rax,[rip+0x3b315b]        # 1878c70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35358>
     14c5b15:	48 89 06             	mov    QWORD PTR [rsi],rax

### 0x14c5d55: call   17edf00 <_Znwm@plt>
     14c5d34:	00 00 
     14c5d36:	48 3b 84 24 c0 06 00 	cmp    rax,QWORD PTR [rsp+0x6c0]
     14c5d3d:	00 
     14c5d3e:	75 08                	jne    14c5d48 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30b2cc>
     14c5d40:	48 89 df             	mov    rdi,rbx
     14c5d43:	e8 88 9f 5a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     14c5d48:	e8 63 9d 32 00       	call   17efab0 <__stack_chk_fail@plt>
     14c5d4d:	cc                   	int3
     14c5d4e:	53                   	push   rbx
     14c5d4f:	48 89 fb             	mov    rbx,rdi
     14c5d52:	6a 18                	push   0x18
     14c5d54:	5f                   	pop    rdi
     14c5d55:	e8 a6 81 32 00       	call   17edf00 <_Znwm@plt>
     14c5d5a:	48 8d 0d 0f 2e 3b 00 	lea    rcx,[rip+0x3b2e0f]        # 1878b70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35258>
     14c5d61:	48 89 08             	mov    QWORD PTR [rax],rcx
     14c5d64:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
     14c5d68:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     14c5d6c:	5b                   	pop    rbx
     14c5d6d:	c3                   	ret
     14c5d6e:	48 8d 05 fb 2d 3b 00 	lea    rax,[rip+0x3b2dfb]        # 1878b70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35258>
     14c5d75:	48 89 06             	mov    QWORD PTR [rsi],rax

### 0x14c6a1a: call   17edf00 <_Znwm@plt>
     14c69f4:	00 00 
     14c69f6:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     14c69fb:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     14c6a00:	4c 89 e2             	mov    rdx,r12
     14c6a03:	e8 1a 51 63 ff       	call   afbb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x48ac2>
     14c6a08:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     14c6a0b:	48 85 db             	test   rbx,rbx
     14c6a0e:	75 67                	jne    14c6a77 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30bffb>
     14c6a10:	49 89 c7             	mov    r15,rax
     14c6a13:	4d 8d 6e 08          	lea    r13,[r14+0x8]
     14c6a17:	6a 68                	push   0x68
     14c6a19:	5f                   	pop    rdi
     14c6a1a:	e8 e1 74 32 00       	call   17edf00 <_Znwm@plt>
     14c6a1f:	48 89 c3             	mov    rbx,rax
     14c6a22:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     14c6a27:	4c 89 6c 24 18       	mov    QWORD PTR [rsp+0x18],r13
     14c6a2c:	c6 44 24 20 00       	mov    BYTE PTR [rsp+0x20],0x0
     14c6a31:	48 8d 78 20          	lea    rdi,[rax+0x20]
     14c6a35:	4c 89 e6             	mov    rsi,r12
     14c6a38:	e8 03 75 32 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14c6a3d:	0f 57 c0             	xorps  xmm0,xmm0

### 0x14c7108: call   17efad0 <memcpy@plt>
     14c70de:	4c 0f 43 f0          	cmovae r14,rax
     14c70e2:	4d 89 65 00          	mov    QWORD PTR [r13+0x0],r12
     14c70e6:	45 85 ff             	test   r15d,r15d
     14c70e9:	7e 22                	jle    14c710d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30c691>
     14c70eb:	49 8d 7d 08          	lea    rdi,[r13+0x8]
     14c70ef:	48 8d 43 08          	lea    rax,[rbx+0x8]
     14c70f3:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
     14c70f6:	48 83 e6 f8          	and    rsi,0xfffffffffffffff8
     14c70fa:	40 84 ed             	test   bpl,bpl
     14c70fd:	48 0f 45 f0          	cmovne rsi,rax
     14c7101:	44 89 fa             	mov    edx,r15d
     14c7104:	48 c1 e2 03          	shl    rdx,0x3
     14c7108:	e8 c3 89 32 00       	call   17efad0 <memcpy@plt>
     14c710d:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
     14c7110:	40 84 ed             	test   bpl,bpl
     14c7113:	74 08                	je     14c711d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30c6a1>
     14c7115:	83 e6 03             	and    esi,0x3
     14c7118:	89 73 08             	mov    DWORD PTR [rbx+0x8],esi
     14c711b:	eb 2f                	jmp    14c714c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30c6d0>
     14c711d:	48 83 e6 f8          	and    rsi,0xfffffffffffffff8
     14c7121:	48 8b 46 f8          	mov    rax,QWORD PTR [rsi-0x8]

### 0x14c71df: call   17edf00 <_Znwm@plt>
     14c71c5:	cc                   	int3
     14c71c6:	53                   	push   rbx
     14c71c7:	48 89 fb             	mov    rbx,rdi
     14c71ca:	48 85 ff             	test   rdi,rdi
     14c71cd:	74 0d                	je     14c71dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30c760>
     14c71cf:	6a 28                	push   0x28
     14c71d1:	5e                   	pop    rsi
     14c71d2:	48 89 df             	mov    rdi,rbx
     14c71d5:	e8 52 32 2c 00       	call   178a42c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e598>
     14c71da:	eb 08                	jmp    14c71e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30c768>
     14c71dc:	6a 28                	push   0x28
     14c71de:	5f                   	pop    rdi
     14c71df:	e8 1c 6d 32 00       	call   17edf00 <_Znwm@plt>
     14c71e4:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
     14c71e8:	48 8d 0d 81 44 3d 00 	lea    rcx,[rip+0x3d4481]        # 189b670 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x85b0>
     14c71ef:	48 89 08             	mov    QWORD PTR [rax],rcx
     14c71f2:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     14c71f7:	48 8d 0d fa 85 f7 fe 	lea    rcx,[rip+0xfffffffffef785fa]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     14c71fe:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
     14c7202:	48 83 60 20 00       	and    QWORD PTR [rax+0x20],0x0
     14c7207:	5b                   	pop    rbx

### 0x14c76bd: call   17edf00 <_Znwm@plt>
     14c76a2:	eb ec                	jmp    14c7690 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30cc14>
     14c76a4:	53                   	push   rbx
     14c76a5:	48 89 fb             	mov    rbx,rdi
     14c76a8:	48 85 ff             	test   rdi,rdi
     14c76ab:	74 0d                	je     14c76ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30cc3e>
     14c76ad:	6a 28                	push   0x28
     14c76af:	5e                   	pop    rsi
     14c76b0:	48 89 df             	mov    rdi,rbx
     14c76b3:	e8 74 2d 2c 00       	call   178a42c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e598>
     14c76b8:	eb 08                	jmp    14c76c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30cc46>
     14c76ba:	6a 28                	push   0x28
     14c76bc:	5f                   	pop    rdi
     14c76bd:	e8 3e 68 32 00       	call   17edf00 <_Znwm@plt>
     14c76c2:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
     14c76c6:	48 8d 0d e3 3f 3d 00 	lea    rcx,[rip+0x3d3fe3]        # 189b6b0 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x85f0>
     14c76cd:	48 89 08             	mov    QWORD PTR [rax],rcx
     14c76d0:	48 89 58 10          	mov    QWORD PTR [rax+0x10],rbx
     14c76d4:	83 60 20 00          	and    DWORD PTR [rax+0x20],0x0
     14c76d8:	5b                   	pop    rbx
     14c76d9:	c3                   	ret
     14c76da:	41 56                	push   r14

### 0x14c76f6: call   17edf00 <_Znwm@plt>
     14c76dc:	53                   	push   rbx
     14c76dd:	50                   	push   rax
     14c76de:	48 89 fb             	mov    rbx,rdi
     14c76e1:	48 85 ff             	test   rdi,rdi
     14c76e4:	74 0d                	je     14c76f3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30cc77>
     14c76e6:	6a 50                	push   0x50
     14c76e8:	5e                   	pop    rsi
     14c76e9:	48 89 df             	mov    rdi,rbx
     14c76ec:	e8 3b 2d 2c 00       	call   178a42c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e598>
     14c76f1:	eb 08                	jmp    14c76fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30cc7f>
     14c76f3:	6a 50                	push   0x50
     14c76f5:	5f                   	pop    rdi
     14c76f6:	e8 05 68 32 00       	call   17edf00 <_Znwm@plt>
     14c76fb:	49 89 c6             	mov    r14,rax
     14c76fe:	48 89 c7             	mov    rdi,rax
     14c7701:	48 89 de             	mov    rsi,rbx
     14c7704:	e8 89 c1 1d 00       	call   16a3892 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x579fe>
     14c7709:	4c 89 f0             	mov    rax,r14
     14c770c:	48 83 c4 08          	add    rsp,0x8
     14c7710:	5b                   	pop    rbx
     14c7711:	41 5e                	pop    r14

### 0x14c7ce2: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14c7cb4:	4d 8d 7e 48          	lea    r15,[r14+0x48]
     14c7cb8:	4c 89 ff             	mov    rdi,r15
     14c7cbb:	e8 36 1d 31 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     14c7cc0:	49 89 e0             	mov    r8,rsp
     14c7cc3:	4d 89 30             	mov    QWORD PTR [r8],r14
     14c7cc6:	48 8d 35 c4 53 5d ff 	lea    rsi,[rip+0xffffffffff5d53c4]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14c7ccd:	48 8d 0d 9e 00 00 00 	lea    rcx,[rip+0x9e]        # 14c7d72 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d2f6>
     14c7cd4:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
     14c7cd9:	6a 08                	push   0x8
     14c7cdb:	41 59                	pop    r9
     14c7cdd:	4c 89 e7             	mov    rdi,r12
     14c7ce0:	31 d2                	xor    edx,edx
     14c7ce2:	e8 ad 2a 31 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14c7ce7:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14c7cea:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     14c7cef:	4c 89 f6             	mov    rsi,r14
     14c7cf2:	4c 89 e2             	mov    rdx,r12
     14c7cf5:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14c7cf8:	48 8d 5c 24 48       	lea    rbx,[rsp+0x48]
     14c7cfd:	4c 89 ff             	mov    rdi,r15
     14c7d00:	48 89 de             	mov    rsi,rbx

### 0x14c7d03: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14c7cdb:	41 59                	pop    r9
     14c7cdd:	4c 89 e7             	mov    rdi,r12
     14c7ce0:	31 d2                	xor    edx,edx
     14c7ce2:	e8 ad 2a 31 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14c7ce7:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14c7cea:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     14c7cef:	4c 89 f6             	mov    rsi,r14
     14c7cf2:	4c 89 e2             	mov    rdx,r12
     14c7cf5:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14c7cf8:	48 8d 5c 24 48       	lea    rbx,[rsp+0x48]
     14c7cfd:	4c 89 ff             	mov    rdi,r15
     14c7d00:	48 89 de             	mov    rsi,rbx
     14c7d03:	e8 ea 1e 31 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14c7d08:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14c7d0c:	e8 75 67 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14c7d11:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     14c7d16:	e8 cd 2a 31 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14c7d1b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c7d22:	00 00 
     14c7d24:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
     14c7d29:	75 42                	jne    14c7d6d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d2f1>

### 0x14c7d16: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14c7ce7:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14c7cea:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     14c7cef:	4c 89 f6             	mov    rsi,r14
     14c7cf2:	4c 89 e2             	mov    rdx,r12
     14c7cf5:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14c7cf8:	48 8d 5c 24 48       	lea    rbx,[rsp+0x48]
     14c7cfd:	4c 89 ff             	mov    rdi,r15
     14c7d00:	48 89 de             	mov    rsi,rbx
     14c7d03:	e8 ea 1e 31 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14c7d08:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14c7d0c:	e8 75 67 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14c7d11:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     14c7d16:	e8 cd 2a 31 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14c7d1b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c7d22:	00 00 
     14c7d24:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
     14c7d29:	75 42                	jne    14c7d6d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d2f1>
     14c7d2b:	48 83 c4 60          	add    rsp,0x60
     14c7d2f:	5b                   	pop    rbx
     14c7d30:	41 5c                	pop    r12
     14c7d32:	41 5e                	pop    r14

### 0x14c7d40: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14c7d22:	00 00 
     14c7d24:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
     14c7d29:	75 42                	jne    14c7d6d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d2f1>
     14c7d2b:	48 83 c4 60          	add    rsp,0x60
     14c7d2f:	5b                   	pop    rbx
     14c7d30:	41 5c                	pop    r12
     14c7d32:	41 5e                	pop    r14
     14c7d34:	41 5f                	pop    r15
     14c7d36:	5d                   	pop    rbp
     14c7d37:	c3                   	ret
     14c7d38:	49 89 c6             	mov    r14,rax
     14c7d3b:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     14c7d40:	e8 a3 2a 31 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14c7d45:	4c 89 ff             	mov    rdi,r15
     14c7d48:	e8 87 1e 31 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     14c7d4d:	48 89 df             	mov    rdi,rbx
     14c7d50:	e8 15 22 5b ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14c7d55:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c7d5c:	00 00 
     14c7d5e:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
     14c7d63:	75 08                	jne    14c7d6d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d2f1>

### 0x14c883a: call   17edf00 <_Znwm@plt>
     14c880e:	49 89 97 a8 00 00 00 	mov    QWORD PTR [r15+0xa8],rdx
     14c8815:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]
     14c881b:	e8 16 63 61 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
     14c8820:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     14c8824:	4c 89 e7             	mov    rdi,r12
     14c8827:	4c 89 fe             	mov    rsi,r15
     14c882a:	4c 89 f2             	mov    rdx,r14
     14c882d:	ff 50 40             	call   QWORD PTR [rax+0x40]
     14c8830:	49 8b 47 18          	mov    rax,QWORD PTR [r15+0x18]
     14c8834:	4c 8b 20             	mov    r12,QWORD PTR [rax]
     14c8837:	6a 28                	push   0x28
     14c8839:	5f                   	pop    rdi
     14c883a:	e8 c1 56 32 00       	call   17edf00 <_Znwm@plt>
     14c883f:	49 8d 8f a0 00 00 00 	lea    rcx,[r15+0xa0]
     14c8846:	49 8d 94 24 58 02 00 	lea    rdx,[r12+0x258]
     14c884d:	00 
     14c884e:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     14c8855:	00 
     14c8856:	48 89 54 24 50       	mov    QWORD PTR [rsp+0x50],rdx
     14c885b:	48 89 94 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rdx
     14c8862:	00 

### 0x14c8b61: call   17edf00 <_Znwm@plt>
     14c8b37:	31 d2                	xor    edx,edx
     14c8b39:	49 f7 f2             	div    r10
     14c8b3c:	48 89 d0             	mov    rax,rdx
     14c8b3f:	49 8b 08             	mov    rcx,QWORD PTR [r8]
     14c8b42:	48 89 3c c1          	mov    QWORD PTR [rcx+rax*8],rdi
     14c8b46:	48 ff 86 60 02 00 00 	inc    QWORD PTR [rsi+0x260]
     14c8b4d:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     14c8b54:	00 
     14c8b55:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     14c8b59:	e8 6c 17 5b ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     14c8b5e:	6a 20                	push   0x20
     14c8b60:	5f                   	pop    rdi
     14c8b61:	e8 9a 53 32 00       	call   17edf00 <_Znwm@plt>
     14c8b66:	49 89 c4             	mov    r12,rax
     14c8b69:	0f 57 c0             	xorps  xmm0,xmm0
     14c8b6c:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     14c8b70:	48 8d 05 b9 49 33 00 	lea    rax,[rip+0x3349b9]        # 17fd530 <_ZNSt6__ndk119__shared_weak_countD2Ev@@Base+0xe25750>
     14c8b77:	49 89 04 24          	mov    QWORD PTR [r12],rax
     14c8b7b:	4d 89 74 24 18       	mov    QWORD PTR [r12+0x18],r14
     14c8b80:	66 49 0f 6e c4       	movq   xmm0,r12
     14c8b85:	66 49 0f 6e ce       	movq   xmm1,r14

### 0x14c8c72: call   17edf00 <_Znwm@plt>
     14c8c55:	48 39 d8             	cmp    rax,rbx
     14c8c58:	72 08                	jb     14c8c62 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e1e6>
     14c8c5a:	31 d2                	xor    edx,edx
     14c8c5c:	48 f7 f3             	div    rbx
     14c8c5f:	48 89 d0             	mov    rax,rdx
     14c8c62:	4c 39 f0             	cmp    rax,r14
     14c8c65:	75 08                	jne    14c8c6f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e1f3>
     14c8c67:	4d 8b 3f             	mov    r15,QWORD PTR [r15]
     14c8c6a:	4d 85 ff             	test   r15,r15
     14c8c6d:	75 bb                	jne    14c8c2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e1ae>
     14c8c6f:	6a 38                	push   0x38
     14c8c71:	5f                   	pop    rdi
     14c8c72:	e8 89 52 32 00       	call   17edf00 <_Znwm@plt>
     14c8c77:	49 89 c7             	mov    r15,rax
     14c8c7a:	48 8b 6c 24 08       	mov    rbp,QWORD PTR [rsp+0x8]
     14c8c7f:	48 8d 45 20          	lea    rax,[rbp+0x20]
     14c8c83:	4c 89 bc 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],r15
     14c8c8a:	00 
     14c8c8b:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     14c8c8f:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     14c8c96:	00 

### 0x14c94c9: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14c9497:	74 05                	je     14c949e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30ea22>
     14c9499:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14c949e:	4c 8b b3 d0 01 00 00 	mov    r14,QWORD PTR [rbx+0x1d0]
     14c94a5:	4c 8d 44 24 08       	lea    r8,[rsp+0x8]
     14c94aa:	49 89 18             	mov    QWORD PTR [r8],rbx
     14c94ad:	48 8d 35 dd 3b 5d ff 	lea    rsi,[rip+0xffffffffff5d3bdd]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14c94b4:	48 8d 0d d9 db 9f ff 	lea    rcx,[rip+0xffffffffff9fdbd9]        # ec7094 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8e4aa>
     14c94bb:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]
     14c94c0:	6a 08                	push   0x8
     14c94c2:	41 59                	pop    r9
     14c94c4:	4c 89 ef             	mov    rdi,r13
     14c94c7:	31 d2                	xor    edx,edx
     14c94c9:	e8 c6 12 31 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14c94ce:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14c94d1:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     14c94d6:	4c 89 f6             	mov    rsi,r14
     14c94d9:	4c 89 ea             	mov    rdx,r13
     14c94dc:	ff 50 18             	call   QWORD PTR [rax+0x18]
     14c94df:	4c 8d ab f0 01 00 00 	lea    r13,[rbx+0x1f0]
     14c94e6:	4c 8d 74 24 50       	lea    r14,[rsp+0x50]
     14c94eb:	4c 89 ef             	mov    rdi,r13

### 0x14c9504: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14c94d1:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     14c94d6:	4c 89 f6             	mov    rsi,r14
     14c94d9:	4c 89 ea             	mov    rdx,r13
     14c94dc:	ff 50 18             	call   QWORD PTR [rax+0x18]
     14c94df:	4c 8d ab f0 01 00 00 	lea    r13,[rbx+0x1f0]
     14c94e6:	4c 8d 74 24 50       	lea    r14,[rsp+0x50]
     14c94eb:	4c 89 ef             	mov    rdi,r13
     14c94ee:	4c 89 f6             	mov    rsi,r14
     14c94f1:	e8 48 05 31 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     14c94f6:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14c94fa:	e8 87 4f 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14c94ff:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     14c9504:	e8 df 12 31 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14c9509:	4c 8b b3 e0 01 00 00 	mov    r14,QWORD PTR [rbx+0x1e0]
     14c9510:	4c 8d 44 24 08       	lea    r8,[rsp+0x8]
     14c9515:	49 89 18             	mov    QWORD PTR [r8],rbx
     14c9518:	48 8d 35 72 3b 5d ff 	lea    rsi,[rip+0xffffffffff5d3b72]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14c951f:	48 8d 0d 6e db 9f ff 	lea    rcx,[rip+0xffffffffff9fdb6e]        # ec7094 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8e4aa>
     14c9526:	48 8d 6c 24 10       	lea    rbp,[rsp+0x10]
     14c952b:	6a 08                	push   0x8
     14c952d:	41 59                	pop    r9

### 0x14c9534: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14c94ff:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     14c9504:	e8 df 12 31 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14c9509:	4c 8b b3 e0 01 00 00 	mov    r14,QWORD PTR [rbx+0x1e0]
     14c9510:	4c 8d 44 24 08       	lea    r8,[rsp+0x8]
     14c9515:	49 89 18             	mov    QWORD PTR [r8],rbx
     14c9518:	48 8d 35 72 3b 5d ff 	lea    rsi,[rip+0xffffffffff5d3b72]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14c951f:	48 8d 0d 6e db 9f ff 	lea    rcx,[rip+0xffffffffff9fdb6e]        # ec7094 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8e4aa>
     14c9526:	48 8d 6c 24 10       	lea    rbp,[rsp+0x10]
     14c952b:	6a 08                	push   0x8
     14c952d:	41 59                	pop    r9
     14c952f:	48 89 ef             	mov    rdi,rbp
     14c9532:	31 d2                	xor    edx,edx
     14c9534:	e8 5b 12 31 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14c9539:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14c953c:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     14c9541:	4c 89 f6             	mov    rsi,r14
     14c9544:	48 89 ea             	mov    rdx,rbp
     14c9547:	ff 50 10             	call   QWORD PTR [rax+0x10]
     14c954a:	4c 8b ac 24 a0 00 00 	mov    r13,QWORD PTR [rsp+0xa0]
     14c9551:	00 
     14c9552:	48 8d bb 00 02 00 00 	lea    rdi,[rbx+0x200]

### 0x14c9574: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14c9541:	4c 89 f6             	mov    rsi,r14
     14c9544:	48 89 ea             	mov    rdx,rbp
     14c9547:	ff 50 10             	call   QWORD PTR [rax+0x10]
     14c954a:	4c 8b ac 24 a0 00 00 	mov    r13,QWORD PTR [rsp+0xa0]
     14c9551:	00 
     14c9552:	48 8d bb 00 02 00 00 	lea    rdi,[rbx+0x200]
     14c9559:	4c 8d 74 24 50       	lea    r14,[rsp+0x50]
     14c955e:	4c 89 f6             	mov    rsi,r14
     14c9561:	e8 d8 04 31 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     14c9566:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14c956a:	e8 17 4f 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14c956f:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     14c9574:	e8 6f 12 31 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14c9579:	48 8d bb 10 02 00 00 	lea    rdi,[rbx+0x210]
     14c9580:	e8 71 04 31 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     14c9585:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     14c9589:	48 89 83 20 02 00 00 	mov    QWORD PTR [rbx+0x220],rax
     14c9590:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]
     14c9595:	48 89 83 28 02 00 00 	mov    QWORD PTR [rbx+0x228],rax
     14c959c:	48 85 c0             	test   rax,rax
     14c959f:	74 05                	je     14c95a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30eb2a>

### 0x14c96a5: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14c9687:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
     14c968c:	75 7a                	jne    14c9708 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30ec8c>
     14c968e:	48 83 c4 68          	add    rsp,0x68
     14c9692:	5b                   	pop    rbx
     14c9693:	41 5c                	pop    r12
     14c9695:	41 5d                	pop    r13
     14c9697:	41 5e                	pop    r14
     14c9699:	41 5f                	pop    r15
     14c969b:	5d                   	pop    rbp
     14c969c:	c3                   	ret
     14c969d:	49 89 c6             	mov    r14,rax
     14c96a0:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     14c96a5:	e8 3e 11 31 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14c96aa:	4c 89 ef             	mov    rdi,r13
     14c96ad:	e8 22 05 31 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     14c96b2:	eb 0d                	jmp    14c96c1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30ec45>
     14c96b4:	49 89 c6             	mov    r14,rax
     14c96b7:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     14c96bc:	e8 27 11 31 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14c96c1:	48 8b bb e8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1e8]
     14c96c8:	e8 b9 4d 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### 0x14c96bc: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14c9697:	41 5e                	pop    r14
     14c9699:	41 5f                	pop    r15
     14c969b:	5d                   	pop    rbp
     14c969c:	c3                   	ret
     14c969d:	49 89 c6             	mov    r14,rax
     14c96a0:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     14c96a5:	e8 3e 11 31 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14c96aa:	4c 89 ef             	mov    rdi,r13
     14c96ad:	e8 22 05 31 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     14c96b2:	eb 0d                	jmp    14c96c1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30ec45>
     14c96b4:	49 89 c6             	mov    r14,rax
     14c96b7:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     14c96bc:	e8 27 11 31 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14c96c1:	48 8b bb e8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1e8]
     14c96c8:	e8 b9 4d 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14c96cd:	48 8b bb d8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1d8]
     14c96d4:	e8 ad 4d 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14c96d9:	48 89 df             	mov    rdi,rbx
     14c96dc:	e8 8b d3 9f ff       	call   ec6a6c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8de82>
     14c96e1:	eb 0d                	jmp    14c96f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30ec74>
     14c96e3:	49 89 c6             	mov    r14,rax

### 0x14caf99: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14caf6a:	00 00 
     14caf6c:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     14caf71:	48 81 c3 18 01 00 00 	add    rbx,0x118
     14caf78:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
     14caf7d:	4c 89 ff             	mov    rdi,r15
     14caf80:	48 89 d6             	mov    rsi,rdx
     14caf83:	e8 b2 f7 30 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
     14caf88:	4c 89 f7             	mov    rdi,r14
     14caf8b:	48 89 de             	mov    rsi,rbx
     14caf8e:	4c 89 fa             	mov    rdx,r15
     14caf91:	e8 34 f0 30 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
     14caf96:	4c 89 ff             	mov    rdi,r15
     14caf99:	e8 4a f8 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14caf9e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14cafa5:	00 00 
     14cafa7:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
     14cafac:	75 0a                	jne    14cafb8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31053c>
     14cafae:	48 83 c4 50          	add    rsp,0x50
     14cafb2:	5b                   	pop    rbx
     14cafb3:	41 5e                	pop    r14
     14cafb5:	41 5f                	pop    r15

### 0x14caffe: call   17edf00 <_Znwm@plt>
     14cafd2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14cafd9:	00 00 
     14cafdb:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     14cafe0:	8b 16                	mov    edx,DWORD PTR [rsi]
     14cafe2:	48 89 e6             	mov    rsi,rsp
     14cafe5:	e8 76 4f 72 ff       	call   beff60 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13cf00>
     14cafea:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     14cafed:	48 85 db             	test   rbx,rbx
     14caff0:	75 51                	jne    14cb043 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3105c7>
     14caff2:	49 89 c7             	mov    r15,rax
     14caff5:	49 8d 6e 08          	lea    rbp,[r14+0x8]
     14caff9:	bf 80 00 00 00       	mov    edi,0x80
     14caffe:	e8 fd 2e 32 00       	call   17edf00 <_Znwm@plt>
     14cb003:	48 89 c3             	mov    rbx,rax
     14cb006:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
     14cb00b:	49 89 6d 08          	mov    QWORD PTR [r13+0x8],rbp
     14cb00f:	41 8b 04 24          	mov    eax,DWORD PTR [r12]
     14cb013:	89 43 20             	mov    DWORD PTR [rbx+0x20],eax
     14cb016:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
     14cb01a:	e8 d5 fd ff ff       	call   14cadf4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x310378>
     14cb01f:	41 c6 45 10 01       	mov    BYTE PTR [r13+0x10],0x1

### 0x14ccb0e: call   17edf00 <_Znwm@plt>
     14ccae5:	4c 8b 37             	mov    r14,QWORD PTR [rdi]
     14ccae8:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
     14ccaec:	49 89 ec             	mov    r12,rbp
     14ccaef:	49 29 dc             	sub    r12,rbx
     14ccaf2:	4c 8d 6f 18          	lea    r13,[rdi+0x18]
     14ccaf6:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
     14ccafa:	4c 8b 7f 18          	mov    r15,QWORD PTR [rdi+0x18]
     14ccafe:	4c 89 ff             	mov    rdi,r15
     14ccb01:	4c 29 f7             	sub    rdi,r14
     14ccb04:	49 39 fc             	cmp    r12,rdi
     14ccb07:	73 28                	jae    14ccb31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3120b5>
     14ccb09:	bf f0 0f 00 00       	mov    edi,0xff0
     14ccb0e:	e8 ed 13 32 00       	call   17edf00 <_Znwm@plt>
     14ccb13:	49 89 c4             	mov    r12,rax
     14ccb16:	49 39 ef             	cmp    r15,rbp
     14ccb19:	0f 84 9a 00 00 00    	je     14ccbb9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31213d>
     14ccb1f:	4c 89 65 00          	mov    QWORD PTR [rbp+0x0],r12
     14ccb23:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     14ccb27:	48 83 40 10 08       	add    QWORD PTR [rax+0x10],0x8
     14ccb2c:	e9 85 03 00 00       	jmp    14cceb6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31243a>
     14ccb31:	48 c1 ff 02          	sar    rdi,0x2

### 0x14ccb6a: call   17edf00 <_Znwm@plt>
     14ccb38:	6a 01                	push   0x1
     14ccb3a:	58                   	pop    rax
     14ccb3b:	48 0f 44 f8          	cmove  rdi,rax
     14ccb3f:	4c 89 6c 24 50       	mov    QWORD PTR [rsp+0x50],r13
     14ccb44:	e8 d9 2d 5d ff       	call   a9f922 <JNI_OnUnload@@Base+0x271ef>
     14ccb49:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     14ccb4e:	4e 8d 34 20          	lea    r14,[rax+r12*1]
     14ccb52:	4c 89 74 24 40       	mov    QWORD PTR [rsp+0x40],r14
     14ccb57:	4c 89 74 24 38       	mov    QWORD PTR [rsp+0x38],r14
     14ccb5c:	4c 8d 3c d0          	lea    r15,[rax+rdx*8]
     14ccb60:	4c 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],r15
     14ccb65:	bf f0 0f 00 00       	mov    edi,0xff0
     14ccb6a:	e8 91 13 32 00       	call   17edf00 <_Znwm@plt>
     14ccb6f:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
     14ccb73:	48 8d 4e 28          	lea    rcx,[rsi+0x28]
     14ccb77:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     14ccb7c:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
     14ccb81:	48 c7 44 24 28 55 00 	mov    QWORD PTR [rsp+0x28],0x55
     14ccb88:	00 00 
     14ccb8a:	4d 39 fe             	cmp    r14,r15
     14ccb8d:	0f 85 7b 01 00 00    	jne    14ccd0e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x312292>

### 0x14cd24f: call   17edf00 <_Znwm@plt>
     14cd22a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14cd231:	00 00 
     14cd233:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     14cd238:	75 08                	jne    14cd242 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3127c6>
     14cd23a:	48 89 df             	mov    rdi,rbx
     14cd23d:	e8 8e 2a 5a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     14cd242:	e8 69 28 32 00       	call   17efab0 <__stack_chk_fail@plt>
     14cd247:	cc                   	int3
     14cd248:	53                   	push   rbx
     14cd249:	48 89 fb             	mov    rbx,rdi
     14cd24c:	6a 20                	push   0x20
     14cd24e:	5f                   	pop    rdi
     14cd24f:	e8 ac 0c 32 00       	call   17edf00 <_Znwm@plt>
     14cd254:	48 8d 0d bd be 3a 00 	lea    rcx,[rip+0x3abebd]        # 1879118 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35800>
     14cd25b:	48 89 08             	mov    QWORD PTR [rax],rcx
     14cd25e:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
     14cd262:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     14cd266:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
     14cd26a:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
     14cd26e:	5b                   	pop    rbx
     14cd26f:	c3                   	ret

### 0x14cdeca: call   17edf00 <_Znwm@plt>
     14cde8f:	45 31 c9             	xor    r9d,r9d
     14cde92:	e8 c7 96 11 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
     14cde97:	4c 89 f7             	mov    rdi,r14
     14cde9a:	e8 a7 fa ff ff       	call   14cd946 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x312eca>
     14cde9f:	49 8d b5 40 01 00 00 	lea    rsi,[r13+0x140]
     14cdea6:	4c 89 74 24 18       	mov    QWORD PTR [rsp+0x18],r14
     14cdeab:	49 8d be a0 01 00 00 	lea    rdi,[r14+0x1a0]
     14cdeb2:	48 89 74 24 68       	mov    QWORD PTR [rsp+0x68],rsi
     14cdeb7:	e8 c4 01 32 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     14cdebc:	4c 89 6c 24 28       	mov    QWORD PTR [rsp+0x28],r13
     14cdec1:	4d 8b 6d 38          	mov    r13,QWORD PTR [r13+0x38]
     14cdec5:	bf 20 01 00 00       	mov    edi,0x120
     14cdeca:	e8 31 00 32 00       	call   17edf00 <_Znwm@plt>
     14cdecf:	48 89 c3             	mov    rbx,rax
     14cded2:	66 0f ef c0          	pxor   xmm0,xmm0
     14cded6:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14cdedb:	48 8d 05 86 f5 32 00 	lea    rax,[rip+0x32f586]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14cdee2:	48 89 03             	mov    QWORD PTR [rbx],rax
     14cdee5:	48 8d 6b 18          	lea    rbp,[rbx+0x18]
     14cdee9:	48 8d 05 68 b6 3a 00 	lea    rax,[rip+0x3ab668]        # 1879558 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35c40>
     14cdef0:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax

### 0x14cdf87: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14cdf56:	49 81 c7 e8 00 00 00 	add    r15,0xe8
     14cdf5d:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14cdf64:	00 
     14cdf65:	49 89 28             	mov    QWORD PTR [r8],rbp
     14cdf68:	48 8d 35 22 f1 5c ff 	lea    rsi,[rip+0xffffffffff5cf122]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14cdf6f:	48 8d 0d fa 84 00 00 	lea    rcx,[rip+0x84fa]        # 14d6470 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31b9f4>
     14cdf76:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14cdf7d:	00 
     14cdf7e:	6a 08                	push   0x8
     14cdf80:	41 59                	pop    r9
     14cdf82:	4c 89 f7             	mov    rdi,r14
     14cdf85:	31 d2                	xor    edx,edx
     14cdf87:	e8 08 c8 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14cdf8c:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
     14cdf90:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     14cdf93:	4c 8d ac 24 a0 03 00 	lea    r13,[rsp+0x3a0]
     14cdf9a:	00 
     14cdf9b:	4c 89 ef             	mov    rdi,r13
     14cdf9e:	4c 89 f2             	mov    rdx,r14
     14cdfa1:	ff 50 10             	call   QWORD PTR [rax+0x10]
     14cdfa4:	4c 89 e7             	mov    rdi,r12

### 0x14cdfaa: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14cdf82:	4c 89 f7             	mov    rdi,r14
     14cdf85:	31 d2                	xor    edx,edx
     14cdf87:	e8 08 c8 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14cdf8c:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
     14cdf90:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     14cdf93:	4c 8d ac 24 a0 03 00 	lea    r13,[rsp+0x3a0]
     14cdf9a:	00 
     14cdf9b:	4c 89 ef             	mov    rdi,r13
     14cdf9e:	4c 89 f2             	mov    rdx,r14
     14cdfa1:	ff 50 10             	call   QWORD PTR [rax+0x10]
     14cdfa4:	4c 89 e7             	mov    rdi,r12
     14cdfa7:	4c 89 ee             	mov    rsi,r13
     14cdfaa:	e8 43 bc 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14cdfaf:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     14cdfb3:	e8 ce 04 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cdfb8:	4c 89 f7             	mov    rdi,r14
     14cdfbb:	e8 28 c8 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14cdfc0:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
     14cdfc4:	41 c6 06 00          	mov    BYTE PTR [r14],0x0
     14cdfc8:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     14cdfcb:	4c 8d 2d 2e a7 f6 fe 	lea    r13,[rip+0xfffffffffef6a72e]        # 438700 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e14f>

### 0x14cdfbb: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14cdf90:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     14cdf93:	4c 8d ac 24 a0 03 00 	lea    r13,[rsp+0x3a0]
     14cdf9a:	00 
     14cdf9b:	4c 89 ef             	mov    rdi,r13
     14cdf9e:	4c 89 f2             	mov    rdx,r14
     14cdfa1:	ff 50 10             	call   QWORD PTR [rax+0x10]
     14cdfa4:	4c 89 e7             	mov    rdi,r12
     14cdfa7:	4c 89 ee             	mov    rsi,r13
     14cdfaa:	e8 43 bc 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14cdfaf:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     14cdfb3:	e8 ce 04 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cdfb8:	4c 89 f7             	mov    rdi,r14
     14cdfbb:	e8 28 c8 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14cdfc0:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
     14cdfc4:	41 c6 06 00          	mov    BYTE PTR [r14],0x0
     14cdfc8:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     14cdfcb:	4c 8d 2d 2e a7 f6 fe 	lea    r13,[rip+0xfffffffffef6a72e]        # 438700 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e14f>
     14cdfd2:	48 8d 94 24 e0 02 00 	lea    rdx,[rsp+0x2e0]
     14cdfd9:	00 
     14cdfda:	4c 89 ee             	mov    rsi,r13
     14cdfdd:	e8 7c f7 6b ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>

### 0x14ce0c0: call   17edf00 <_Znwm@plt>
     14ce091:	48 8d 35 40 a4 f6 fe 	lea    rsi,[rip+0xfffffffffef6a440]        # 4384d8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5df27>
     14ce098:	48 8d 0d 51 a4 f6 fe 	lea    rcx,[rip+0xfffffffffef6a451]        # 4384f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5df3f>
     14ce09f:	6a 08                	push   0x8
     14ce0a1:	5a                   	pop    rdx
     14ce0a2:	6a 18                	push   0x18
     14ce0a4:	41 58                	pop    r8
     14ce0a6:	45 31 c9             	xor    r9d,r9d
     14ce0a9:	e8 dc 92 11 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
     14ce0ae:	84 c0                	test   al,al
     14ce0b0:	0f 84 14 02 00 00    	je     14ce2ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31384e>
     14ce0b6:	4d 8b 74 24 30       	mov    r14,QWORD PTR [r12+0x30]
     14ce0bb:	bf d0 00 00 00       	mov    edi,0xd0
     14ce0c0:	e8 3b fe 31 00       	call   17edf00 <_Znwm@plt>
     14ce0c5:	49 89 c5             	mov    r13,rax
     14ce0c8:	66 0f ef c0          	pxor   xmm0,xmm0
     14ce0cc:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14ce0d1:	48 8d 05 a8 ce 3a 00 	lea    rax,[rip+0x3acea8]        # 187af80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x37668>
     14ce0d8:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     14ce0dc:	f3 41 0f 7f 45 18    	movdqu XMMWORD PTR [r13+0x18],xmm0
     14ce0e2:	f3 41 0f 7f 45 28    	movdqu XMMWORD PTR [r13+0x28],xmm0
     14ce0e8:	49 83 65 38 00       	and    QWORD PTR [r13+0x38],0x0

### 0x14ce160: call   17edf00 <_Znwm@plt>
     14ce132:	4c 89 f6             	mov    rsi,r14
     14ce135:	e8 88 35 2f 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     14ce13a:	66 0f ef c0          	pxor   xmm0,xmm0
     14ce13e:	49 83 a5 80 00 00 00 	and    QWORD PTR [r13+0x80],0x0
     14ce145:	00 
     14ce146:	66 41 0f 7f 45 70    	movdqa XMMWORD PTR [r13+0x70],xmm0
     14ce14c:	49 83 a5 b0 00 00 00 	and    QWORD PTR [r13+0xb0],0x0
     14ce153:	00 
     14ce154:	66 41 83 a5 c0 00 00 	and    WORD PTR [r13+0xc0],0x0
     14ce15b:	00 00 
     14ce15d:	6a 20                	push   0x20
     14ce15f:	5f                   	pop    rdi
     14ce160:	e8 9b fd 31 00       	call   17edf00 <_Znwm@plt>
     14ce165:	48 89 c5             	mov    rbp,rax
     14ce168:	66 0f ef c0          	pxor   xmm0,xmm0
     14ce16c:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14ce171:	48 8d 05 90 4b 34 00 	lea    rax,[rip+0x344b90]        # 1812d08 <_ZNSt6__ndk119__shared_weak_countD2Ev@@Base+0xe3af28>
     14ce178:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     14ce17c:	4c 89 6d 18          	mov    QWORD PTR [rbp+0x18],r13
     14ce180:	66 48 0f 6e c5       	movq   xmm0,rbp
     14ce185:	66 49 0f 6e cd       	movq   xmm1,r13

### 0x14ce2cd: call   17edf00 <_Znwm@plt>
     14ce2a6:	4c 89 f7             	mov    rdi,r14
     14ce2a9:	e8 f0 8f 5d ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
     14ce2ae:	31 ff                	xor    edi,edi
     14ce2b0:	e8 2f 13 61 ff       	call   adf5e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c584>
     14ce2b5:	31 ff                	xor    edi,edi
     14ce2b7:	e8 f6 01 5d ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14ce2bc:	31 ff                	xor    edi,edi
     14ce2be:	e8 c3 01 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14ce2c3:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
     14ce2c8:	eb 48                	jmp    14ce312 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313896>
     14ce2ca:	6a 20                	push   0x20
     14ce2cc:	5f                   	pop    rdi
     14ce2cd:	e8 2e fc 31 00       	call   17edf00 <_Znwm@plt>
     14ce2d2:	48 89 c5             	mov    rbp,rax
     14ce2d5:	66 0f ef c0          	pxor   xmm0,xmm0
     14ce2d9:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14ce2de:	48 8d 05 e3 ae 3a 00 	lea    rax,[rip+0x3aaee3]        # 18791c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x358b0>
     14ce2e5:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     14ce2e9:	48 8d 05 10 af 3a 00 	lea    rax,[rip+0x3aaf10]        # 1879200 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x358e8>
     14ce2f0:	48 89 45 18          	mov    QWORD PTR [rbp+0x18],rax
     14ce2f4:	66 48 0f 6e c5       	movq   xmm0,rbp

### 0x14ce39b: call   17edf00 <_Znwm@plt>
     14ce36e:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]
     14ce373:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     14ce376:	48 8d 35 08 a2 f6 fe 	lea    rsi,[rip+0xfffffffffef6a208]        # 438585 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5dfd4>
     14ce37d:	48 8d 0d 0c a2 f6 fe 	lea    rcx,[rip+0xfffffffffef6a20c]        # 438590 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5dfdf>
     14ce384:	6a 18                	push   0x18
     14ce386:	41 58                	pop    r8
     14ce388:	6a 02                	push   0x2
     14ce38a:	41 59                	pop    r9
     14ce38c:	4c 89 f2             	mov    rdx,r14
     14ce38f:	e8 96 90 11 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
     14ce394:	89 c5                	mov    ebp,eax
     14ce396:	bf 00 01 00 00       	mov    edi,0x100
     14ce39b:	e8 60 fb 31 00       	call   17edf00 <_Znwm@plt>
     14ce3a0:	49 89 c7             	mov    r15,rax
     14ce3a3:	49 8d b4 24 e0 00 00 	lea    rsi,[r12+0xe0]
     14ce3aa:	00 
     14ce3ab:	66 0f ef c0          	pxor   xmm0,xmm0
     14ce3af:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14ce3b4:	48 8d 05 b5 83 36 00 	lea    rax,[rip+0x3683b5]        # 1836770 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8708>
     14ce3bb:	49 89 07             	mov    QWORD PTR [r15],rax
     14ce3be:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]

### 0x14ce581: call   17edf00 <_Znwm@plt>
     14ce54a:	e8 cd fe 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14ce54f:	31 ff                	xor    edi,edi
     14ce551:	e8 30 ff 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14ce556:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14ce55b:	48 8b b8 f8 00 00 00 	mov    rdi,QWORD PTR [rax+0xf8]
     14ce562:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14ce565:	48 8d 35 ac a1 f6 fe 	lea    rsi,[rip+0xfffffffffef6a1ac]        # 438718 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e167>
     14ce56c:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14ce56f:	84 c0                	test   al,al
     14ce571:	4c 89 74 24 50       	mov    QWORD PTR [rsp+0x50],r14
     14ce576:	0f 84 55 01 00 00    	je     14ce6d1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313c55>
     14ce57c:	bf b8 00 00 00       	mov    edi,0xb8
     14ce581:	e8 7a f9 31 00       	call   17edf00 <_Znwm@plt>
     14ce586:	49 89 c5             	mov    r13,rax
     14ce589:	66 0f ef c0          	pxor   xmm0,xmm0
     14ce58d:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14ce592:	48 8d 05 e7 ac 3a 00 	lea    rax,[rip+0x3aace7]        # 1879280 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35968>
     14ce599:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     14ce59d:	48 8d 05 6c c9 3a 00 	lea    rax,[rip+0x3ac96c]        # 187af10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x375f8>
     14ce5a4:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
     14ce5a8:	4d 8d 7d 20          	lea    r15,[r13+0x20]

### 0x14ce6d4: call   17edf00 <_Znwm@plt>
     14ce6ad:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14ce6b4:	00 
     14ce6b5:	4c 89 e6             	mov    rsi,r12
     14ce6b8:	e8 83 f8 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14ce6bd:	f6 84 24 b0 02 00 00 	test   BYTE PTR [rsp+0x2b0],0x1
     14ce6c4:	01 
     14ce6c5:	74 40                	je     14ce707 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313c8b>
     14ce6c7:	48 8b b4 24 c0 02 00 	mov    rsi,QWORD PTR [rsp+0x2c0]
     14ce6ce:	00 
     14ce6cf:	eb 3e                	jmp    14ce70f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313c93>
     14ce6d1:	6a 20                	push   0x20
     14ce6d3:	5f                   	pop    rdi
     14ce6d4:	e8 27 f8 31 00       	call   17edf00 <_Znwm@plt>
     14ce6d9:	49 89 c5             	mov    r13,rax
     14ce6dc:	66 0f ef c0          	pxor   xmm0,xmm0
     14ce6e0:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14ce6e5:	48 8d 05 94 ab 3a 00 	lea    rax,[rip+0x3aab94]        # 1879280 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35968>
     14ce6ec:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     14ce6f0:	4c 89 eb             	mov    rbx,r13
     14ce6f3:	48 83 c3 18          	add    rbx,0x18
     14ce6f7:	48 8d 05 ba ab 3a 00 	lea    rax,[rip+0x3aabba]        # 18792b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x359a0>

### 0x14ce88e: call   17edf00 <_Znwm@plt>
     14ce859:	e8 be fb 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14ce85e:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
     14ce863:	66 49 0f 6e c5       	movq   xmm0,r13
     14ce868:	48 89 9c 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rbx
     14ce86f:	00 
     14ce870:	66 48 0f 6e cb       	movq   xmm1,rbx
     14ce875:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
     14ce879:	66 0f 7f 8c 24 40 01 	movdqa XMMWORD PTR [rsp+0x140],xmm1
     14ce880:	00 00 
     14ce882:	31 ff                	xor    edi,edi
     14ce884:	e8 fd fb 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14ce889:	bf d0 01 00 00       	mov    edi,0x1d0
     14ce88e:	e8 6d f6 31 00       	call   17edf00 <_Znwm@plt>
     14ce893:	48 89 c3             	mov    rbx,rax
     14ce896:	66 0f ef c0          	pxor   xmm0,xmm0
     14ce89a:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14ce89f:	48 8d 05 ea a8 3a 00 	lea    rax,[rip+0x3aa8ea]        # 1879190 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35878>
     14ce8a6:	48 89 03             	mov    QWORD PTR [rbx],rax
     14ce8a9:	4c 8d 73 18          	lea    r14,[rbx+0x18]
     14ce8ad:	ba b8 01 00 00       	mov    edx,0x1b8
     14ce8b2:	4c 89 f7             	mov    rdi,r14

### 0x14ce8f7: call   17edf00 <_Znwm@plt>
     14ce8bf:	e8 ca 99 65 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     14ce8c4:	48 8d 7b 70          	lea    rdi,[rbx+0x70]
     14ce8c8:	e8 c1 99 65 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     14ce8cd:	48 8d bb c8 00 00 00 	lea    rdi,[rbx+0xc8]
     14ce8d4:	e8 b5 99 65 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     14ce8d9:	48 8d bb 20 01 00 00 	lea    rdi,[rbx+0x120]
     14ce8e0:	e8 67 64 00 00       	call   14d4d4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a2d0>
     14ce8e5:	48 89 df             	mov    rdi,rbx
     14ce8e8:	48 81 c7 78 01 00 00 	add    rdi,0x178
     14ce8ef:	e8 9a 99 65 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     14ce8f4:	6a 28                	push   0x28
     14ce8f6:	5f                   	pop    rdi
     14ce8f7:	e8 04 f6 31 00       	call   17edf00 <_Znwm@plt>
     14ce8fc:	49 89 c4             	mov    r12,rax
     14ce8ff:	66 0f ef c0          	pxor   xmm0,xmm0
     14ce903:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14ce908:	48 8d 05 71 27 33 00 	lea    rax,[rip+0x332771]        # 1801080 <_ZTIN4asio22service_already_existsE@@Base+0x2868>
     14ce90f:	49 89 04 24          	mov    QWORD PTR [r12],rax
     14ce913:	4d 89 74 24 18       	mov    QWORD PTR [r12+0x18],r14
     14ce918:	49 89 5c 24 20       	mov    QWORD PTR [r12+0x20],rbx
     14ce91d:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]

### 0x14ce951: call   17edf00 <_Znwm@plt>
     14ce922:	48 89 df             	mov    rdi,rbx
     14ce925:	e8 5c fb 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14ce92a:	f3 41 0f 6f 44 24 18 	movdqu xmm0,XMMWORD PTR [r12+0x18]
     14ce931:	66 0f 7f 84 24 70 01 	movdqa XMMWORD PTR [rsp+0x170],xmm0
     14ce938:	00 00 
     14ce93a:	49 8b 44 24 20       	mov    rax,QWORD PTR [r12+0x20]
     14ce93f:	48 85 c0             	test   rax,rax
     14ce942:	74 05                	je     14ce949 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313ecd>
     14ce944:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14ce949:	4c 89 6c 24 78       	mov    QWORD PTR [rsp+0x78],r13
     14ce94e:	6a 70                	push   0x70
     14ce950:	5f                   	pop    rdi
     14ce951:	e8 aa f5 31 00       	call   17edf00 <_Znwm@plt>
     14ce956:	48 89 c5             	mov    rbp,rax
     14ce959:	66 0f ef c0          	pxor   xmm0,xmm0
     14ce95d:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14ce962:	48 8d 05 ef 00 33 00 	lea    rax,[rip+0x3300ef]        # 17fea58 <_ZTIN4asio22service_already_existsE@@Base+0x240>
     14ce969:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     14ce96d:	48 89 ef             	mov    rdi,rbp
     14ce970:	48 83 c7 18          	add    rdi,0x18
     14ce974:	f3 0f 7f 45 18       	movdqu XMMWORD PTR [rbp+0x18],xmm0

### 0x14ce9a4: call   17edf00 <_Znwm@plt>
     14ce96d:	48 89 ef             	mov    rdi,rbp
     14ce970:	48 83 c7 18          	add    rdi,0x18
     14ce974:	f3 0f 7f 45 18       	movdqu XMMWORD PTR [rbp+0x18],xmm0
     14ce979:	f3 0f 7f 45 28       	movdqu XMMWORD PTR [rbp+0x28],xmm0
     14ce97e:	f3 0f 7f 45 38       	movdqu XMMWORD PTR [rbp+0x38],xmm0
     14ce983:	f3 0f 7f 45 48       	movdqu XMMWORD PTR [rbp+0x48],xmm0
     14ce988:	f3 0f 7f 45 58       	movdqu XMMWORD PTR [rbp+0x58],xmm0
     14ce98d:	48 83 65 68 00       	and    QWORD PTR [rbp+0x68],0x0
     14ce992:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
     14ce999:	00 
     14ce99a:	e8 ef 98 65 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     14ce99f:	bf f0 01 00 00       	mov    edi,0x1f0
     14ce9a4:	e8 57 f5 31 00       	call   17edf00 <_Znwm@plt>
     14ce9a9:	49 89 c5             	mov    r13,rax
     14ce9ac:	66 0f ef c0          	pxor   xmm0,xmm0
     14ce9b0:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14ce9b5:	48 8d 05 0c c4 33 00 	lea    rax,[rip+0x33c40c]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
     14ce9bc:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     14ce9c0:	48 8d 05 19 ff 33 00 	lea    rax,[rip+0x33ff19]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
     14ce9c7:	48 89 84 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],rax
     14ce9ce:	00 

### 0x14cec3f: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14cec0b:	00 
     14cec0c:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]
     14cec12:	66 41 0f 7f 00       	movdqa XMMWORD PTR [r8],xmm0
     14cec17:	f0 49 ff 06          	lock inc QWORD PTR [r14]
     14cec1b:	48 8d 35 02 b0 5e ff 	lea    rsi,[rip+0xffffffffff5eb002]        # ab9c24 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6bc4>
     14cec22:	48 8d 15 15 b0 5e ff 	lea    rdx,[rip+0xffffffffff5eb015]        # ab9c3e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6bde>
     14cec29:	48 8d 0d 2c 61 00 00 	lea    rcx,[rip+0x612c]        # 14d4d5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a2e0>
     14cec30:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14cec37:	00 
     14cec38:	6a 10                	push   0x10
     14cec3a:	41 59                	pop    r9
     14cec3c:	4c 89 f7             	mov    rdi,r14
     14cec3f:	e8 50 bb 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14cec44:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14cec47:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14cec4e:	00 
     14cec4f:	48 89 de             	mov    rsi,rbx
     14cec52:	4c 89 f2             	mov    rdx,r14
     14cec55:	ff 50 60             	call   QWORD PTR [rax+0x60]
     14cec58:	49 8d bf 60 01 00 00 	lea    rdi,[r15+0x160]
     14cec5f:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]

### 0x14cec6a: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14cec3c:	4c 89 f7             	mov    rdi,r14
     14cec3f:	e8 50 bb 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14cec44:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14cec47:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14cec4e:	00 
     14cec4f:	48 89 de             	mov    rsi,rbx
     14cec52:	4c 89 f2             	mov    rdx,r14
     14cec55:	ff 50 60             	call   QWORD PTR [rax+0x60]
     14cec58:	49 8d bf 60 01 00 00 	lea    rdi,[r15+0x160]
     14cec5f:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14cec66:	00 
     14cec67:	48 89 de             	mov    rsi,rbx
     14cec6a:	e8 83 af 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14cec6f:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14cec73:	e8 0e f8 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cec78:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14cec7f:	00 
     14cec80:	48 89 df             	mov    rdi,rbx
     14cec83:	e8 60 bb 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14cec88:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14cec8f:	00 

### 0x14cec83: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14cec52:	4c 89 f2             	mov    rdx,r14
     14cec55:	ff 50 60             	call   QWORD PTR [rax+0x60]
     14cec58:	49 8d bf 60 01 00 00 	lea    rdi,[r15+0x160]
     14cec5f:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14cec66:	00 
     14cec67:	48 89 de             	mov    rsi,rbx
     14cec6a:	e8 83 af 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14cec6f:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14cec73:	e8 0e f8 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cec78:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14cec7f:	00 
     14cec80:	48 89 df             	mov    rdi,rbx
     14cec83:	e8 60 bb 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14cec88:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14cec8f:	00 
     14cec90:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14cec94:	e8 ed f7 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cec99:	4c 8b 7c 24 28       	mov    r15,QWORD PTR [rsp+0x28]
     14cec9e:	49 8b 47 40          	mov    rax,QWORD PTR [r15+0x40]
     14ceca2:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     14ceca5:	48 8d 35 b5 97 f6 fe 	lea    rsi,[rip+0xfffffffffef697b5]        # 438461 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5deb0>

### 0x14ced2c: call   17edf00 <_Znwm@plt>
     14cecf8:	49 8b 77 60          	mov    rsi,QWORD PTR [r15+0x60]
     14cecfc:	4c 89 f7             	mov    rdi,r14
     14cecff:	e8 a2 ab 11 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
     14ced04:	f3 41 0f 6f 07       	movdqu xmm0,XMMWORD PTR [r15]
     14ced09:	66 0f 7f 44 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm0
     14ced0f:	4d 8b 6f 08          	mov    r13,QWORD PTR [r15+0x8]
     14ced13:	4d 85 ed             	test   r13,r13
     14ced16:	74 05                	je     14ced1d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3142a1>
     14ced18:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
     14ced1d:	4d 8b 7c 24 30       	mov    r15,QWORD PTR [r12+0x30]
     14ced22:	4d 8b 64 24 48       	mov    r12,QWORD PTR [r12+0x48]
     14ced27:	bf 60 01 00 00       	mov    edi,0x160
     14ced2c:	e8 cf f1 31 00       	call   17edf00 <_Znwm@plt>
     14ced31:	49 89 c6             	mov    r14,rax
     14ced34:	66 0f ef c0          	pxor   xmm0,xmm0
     14ced38:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14ced3d:	48 8d 05 84 c0 33 00 	lea    rax,[rip+0x33c084]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
     14ced44:	49 89 06             	mov    QWORD PTR [r14],rax
     14ced47:	48 8d 05 1a a6 3a 00 	lea    rax,[rip+0x3aa61a]        # 1879368 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35a50>
     14ced4e:	48 89 84 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],rax
     14ced55:	00 

### 0x14cf10c: call   17edf00 <_Znwm@plt>
     14cf0d4:	e8 ce 91 5d ff       	call   aa82a7 <JNI_OnUnload@@Base+0x2fb74>
     14cf0d9:	48 8d bc 24 b8 02 00 	lea    rdi,[rsp+0x2b8]
     14cf0e0:	00 
     14cf0e1:	48 8d b4 24 f0 01 00 	lea    rsi,[rsp+0x1f0]
     14cf0e8:	00 
     14cf0e9:	e8 52 ee 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14cf0ee:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14cf0f3:	48 8b b8 f8 00 00 00 	mov    rdi,QWORD PTR [rax+0xf8]
     14cf0fa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14cf0fd:	ff 50 30             	call   QWORD PTR [rax+0x30]
     14cf100:	88 84 24 d0 02 00 00 	mov    BYTE PTR [rsp+0x2d0],al
     14cf107:	bf 30 16 00 00       	mov    edi,0x1630
     14cf10c:	e8 ef ed 31 00       	call   17edf00 <_Znwm@plt>
     14cf111:	49 89 c5             	mov    r13,rax
     14cf114:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14cf11b:	00 
     14cf11c:	48 8d b4 24 80 02 00 	lea    rsi,[rsp+0x280]
     14cf123:	00 
     14cf124:	e8 f9 4c 03 00       	call   1503e22 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3493a6>
     14cf129:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf12d:	f3 41 0f 7f 45 08    	movdqu XMMWORD PTR [r13+0x8],xmm0

### 0x14cf280: call   17edf00 <_Znwm@plt>
     14cf256:	00 
     14cf257:	e8 b4 ee 31 00       	call   17ee110 <_ZNSt6__ndk113random_deviceclEv@plt>
     14cf25c:	49 8d bd a8 02 00 00 	lea    rdi,[r13+0x2a8]
     14cf263:	89 c6                	mov    esi,eax
     14cf265:	e8 3c 38 62 ff       	call   af2aa6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fa46>
     14cf26a:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14cf271:	00 
     14cf272:	48 89 df             	mov    rdi,rbx
     14cf275:	e8 a6 ee 31 00       	call   17ee120 <_ZNSt6__ndk113random_deviceD1Ev@plt>
     14cf27a:	4c 89 2b             	mov    QWORD PTR [rbx],r13
     14cf27d:	6a 20                	push   0x20
     14cf27f:	5f                   	pop    rdi
     14cf280:	e8 7b ec 31 00       	call   17edf00 <_Znwm@plt>
     14cf285:	48 89 c3             	mov    rbx,rax
     14cf288:	4d 8d b5 90 01 00 00 	lea    r14,[r13+0x190]
     14cf28f:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf293:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14cf298:	48 8d 05 c1 ba 3a 00 	lea    rax,[rip+0x3abac1]        # 187ad60 <_ZNSt6__ndk119__shared_weak_countD2Ev@@Base+0xea2f80>
     14cf29f:	48 89 03             	mov    QWORD PTR [rbx],rax
     14cf2a2:	4c 89 6b 18          	mov    QWORD PTR [rbx+0x18],r13
     14cf2a6:	66 48 0f 6e c3       	movq   xmm0,rbx

### 0x14cf3a7: call   17edf00 <_Znwm@plt>
     14cf374:	a8 01                	test   al,0x1
     14cf376:	0f 84 cd 01 00 00    	je     14cf549 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314acd>
     14cf37c:	48 8b 84 24 38 02 00 	mov    rax,QWORD PTR [rsp+0x238]
     14cf383:	00 
     14cf384:	e9 c2 01 00 00       	jmp    14cf54b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314acf>
     14cf389:	49 8b 77 60          	mov    rsi,QWORD PTR [r15+0x60]
     14cf38d:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14cf394:	00 
     14cf395:	e8 0c a5 11 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
     14cf39a:	4d 8b 77 30          	mov    r14,QWORD PTR [r15+0x30]
     14cf39e:	4d 8b 6f 48          	mov    r13,QWORD PTR [r15+0x48]
     14cf3a2:	bf 38 01 00 00       	mov    edi,0x138
     14cf3a7:	e8 54 eb 31 00       	call   17edf00 <_Znwm@plt>
     14cf3ac:	48 89 c3             	mov    rbx,rax
     14cf3af:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf3b3:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14cf3b8:	48 8d 05 a9 e0 32 00 	lea    rax,[rip+0x32e0a9]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14cf3bf:	48 89 03             	mov    QWORD PTR [rbx],rax
     14cf3c2:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
     14cf3c7:	48 8d 05 fa af 3a 00 	lea    rax,[rip+0x3aaffa]        # 187a3c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36ab0>
     14cf3ce:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax

### 0x14cf667: call   17edf00 <_Znwm@plt>
     14cf639:	48 89 84 24 10 02 00 	mov    QWORD PTR [rsp+0x210],rax
     14cf640:	00 
     14cf641:	48 89 84 24 18 02 00 	mov    QWORD PTR [rsp+0x218],rax
     14cf648:	00 
     14cf649:	48 83 a4 24 20 02 00 	and    QWORD PTR [rsp+0x220],0x0
     14cf650:	00 00 
     14cf652:	48 83 a4 24 80 03 00 	and    QWORD PTR [rsp+0x380],0x0
     14cf659:	00 00 
     14cf65b:	48 83 a4 24 90 03 00 	and    QWORD PTR [rsp+0x390],0x0
     14cf662:	00 00 
     14cf664:	6a 30                	push   0x30
     14cf666:	5f                   	pop    rdi
     14cf667:	e8 94 e8 31 00       	call   17edf00 <_Znwm@plt>
     14cf66c:	66 0f 6f 84 24 a0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xa0]
     14cf673:	00 00 
     14cf675:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
     14cf679:	4c 89 78 10          	mov    QWORD PTR [rax+0x10],r15
     14cf67d:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
     14cf682:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
     14cf686:	48 89 68 20          	mov    QWORD PTR [rax+0x20],rbp
     14cf68a:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14

### 0x14cf78e: call   17edf00 <_Znwm@plt>
     14cf762:	e8 1f ed 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf767:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     14cf76c:	48 8b 81 80 00 00 00 	mov    rax,QWORD PTR [rcx+0x80]
     14cf773:	48 85 c0             	test   rax,rax
     14cf776:	74 13                	je     14cf78b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314d0f>
     14cf778:	48 8b 99 88 00 00 00 	mov    rbx,QWORD PTR [rcx+0x88]
     14cf77f:	48 85 db             	test   rbx,rbx
     14cf782:	74 3e                	je     14cf7c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314d46>
     14cf784:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
     14cf789:	eb 30                	jmp    14cf7bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314d3f>
     14cf78b:	6a 20                	push   0x20
     14cf78d:	5f                   	pop    rdi
     14cf78e:	e8 6d e7 31 00       	call   17edf00 <_Znwm@plt>
     14cf793:	48 89 c3             	mov    rbx,rax
     14cf796:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf79a:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14cf79f:	48 8d 05 c2 dc 32 00 	lea    rax,[rip+0x32dcc2]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14cf7a6:	48 89 03             	mov    QWORD PTR [rbx],rax
     14cf7a9:	48 89 d8             	mov    rax,rbx
     14cf7ac:	48 83 c0 18          	add    rax,0x18
     14cf7b0:	48 8d 0d 21 a7 3a 00 	lea    rcx,[rip+0x3aa721]        # 1879ed8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x365c0>

### 0x14cf7f0: call   17edf00 <_Znwm@plt>
     14cf7b7:	48 89 4b 18          	mov    QWORD PTR [rbx+0x18],rcx
     14cf7bb:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
     14cf7c0:	eb 02                	jmp    14cf7c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314d48>
     14cf7c2:	31 db                	xor    ebx,ebx
     14cf7c4:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14cf7c9:	48 89 81 e8 00 00 00 	mov    QWORD PTR [rcx+0xe8],rax
     14cf7d0:	48 8b b9 f0 00 00 00 	mov    rdi,QWORD PTR [rcx+0xf0]
     14cf7d7:	48 89 99 f0 00 00 00 	mov    QWORD PTR [rcx+0xf0],rbx
     14cf7de:	e8 a3 ec 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf7e3:	48 89 df             	mov    rdi,rbx
     14cf7e6:	e8 9b ec 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf7eb:	bf 88 00 00 00       	mov    edi,0x88
     14cf7f0:	e8 0b e7 31 00       	call   17edf00 <_Znwm@plt>
     14cf7f5:	48 89 c3             	mov    rbx,rax
     14cf7f8:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf7fc:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14cf801:	48 8d 05 a8 9b 3a 00 	lea    rax,[rip+0x3a9ba8]        # 18793b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35a98>
     14cf808:	48 89 03             	mov    QWORD PTR [rbx],rax
     14cf80b:	48 8d 43 20          	lea    rax,[rbx+0x20]
     14cf80f:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
     14cf814:	f3 0f 7f 43 30       	movdqu XMMWORD PTR [rbx+0x30],xmm0

### 0x14cf87f: call   17edf00 <_Znwm@plt>
     14cf849:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14cf850:	00 
     14cf851:	49 89 06             	mov    QWORD PTR [r14],rax
     14cf854:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     14cf858:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14cf85d:	48 8d b8 08 01 00 00 	lea    rdi,[rax+0x108]
     14cf864:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
     14cf869:	4c 89 f6             	mov    rsi,r14
     14cf86c:	e8 ab 9f 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14cf871:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14cf875:	e8 0c ec 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf87a:	bf c8 00 00 00       	mov    edi,0xc8
     14cf87f:	e8 7c e6 31 00       	call   17edf00 <_Znwm@plt>
     14cf884:	49 89 c6             	mov    r14,rax
     14cf887:	48 89 c3             	mov    rbx,rax
     14cf88a:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf88e:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
     14cf894:	48 8d 05 cd db 32 00 	lea    rax,[rip+0x32dbcd]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14cf89b:	49 89 06             	mov    QWORD PTR [r14],rax
     14cf89e:	4d 8d 6e 18          	lea    r13,[r14+0x18]
     14cf8a2:	48 8d 05 2f 9d 3a 00 	lea    rax,[rip+0x3a9d2f]        # 18795d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35cc0>

### 0x14cf93c: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14cf90e:	48 8b 6b 48          	mov    rbp,QWORD PTR [rbx+0x48]
     14cf912:	4c 8d 84 24 80 03 00 	lea    r8,[rsp+0x380]
     14cf919:	00 
     14cf91a:	4d 89 28             	mov    QWORD PTR [r8],r13
     14cf91d:	48 8d 35 6d d7 5c ff 	lea    rsi,[rip+0xffffffffff5cd76d]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14cf924:	48 8d 0d e5 70 00 00 	lea    rcx,[rip+0x70e5]        # 14d6a10 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31bf94>
     14cf92b:	4c 8d bc 24 e0 02 00 	lea    r15,[rsp+0x2e0]
     14cf932:	00 
     14cf933:	6a 08                	push   0x8
     14cf935:	41 59                	pop    r9
     14cf937:	4c 89 ff             	mov    rdi,r15
     14cf93a:	31 d2                	xor    edx,edx
     14cf93c:	e8 53 ae 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14cf941:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     14cf945:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14cf94c:	00 
     14cf94d:	48 89 ee             	mov    rsi,rbp
     14cf950:	4c 89 fa             	mov    rdx,r15
     14cf953:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14cf956:	4c 8d bc 24 a0 03 00 	lea    r15,[rsp+0x3a0]
     14cf95d:	00 

### 0x14cf964: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14cf93a:	31 d2                	xor    edx,edx
     14cf93c:	e8 53 ae 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14cf941:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     14cf945:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14cf94c:	00 
     14cf94d:	48 89 ee             	mov    rsi,rbp
     14cf950:	4c 89 fa             	mov    rdx,r15
     14cf953:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14cf956:	4c 8d bc 24 a0 03 00 	lea    r15,[rsp+0x3a0]
     14cf95d:	00 
     14cf95e:	4c 89 f7             	mov    rdi,r14
     14cf961:	4c 89 fe             	mov    rsi,r15
     14cf964:	e8 89 a2 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14cf969:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     14cf96d:	e8 14 eb 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf972:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14cf979:	00 
     14cf97a:	e8 69 ae 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14cf97f:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14cf986:	00 
     14cf987:	4d 89 2e             	mov    QWORD PTR [r14],r13

### 0x14cf97a: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14cf94d:	48 89 ee             	mov    rsi,rbp
     14cf950:	4c 89 fa             	mov    rdx,r15
     14cf953:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14cf956:	4c 8d bc 24 a0 03 00 	lea    r15,[rsp+0x3a0]
     14cf95d:	00 
     14cf95e:	4c 89 f7             	mov    rdi,r14
     14cf961:	4c 89 fe             	mov    rsi,r15
     14cf964:	e8 89 a2 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14cf969:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     14cf96d:	e8 14 eb 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf972:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14cf979:	00 
     14cf97a:	e8 69 ae 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14cf97f:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14cf986:	00 
     14cf987:	4d 89 2e             	mov    QWORD PTR [r14],r13
     14cf98a:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     14cf98e:	31 ff                	xor    edi,edi
     14cf990:	e8 87 ea 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14cf995:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     14cf99a:	4c 89 f6             	mov    rsi,r14

### 0x14cf9b9: call   17edf00 <_Znwm@plt>
     14cf987:	4d 89 2e             	mov    QWORD PTR [r14],r13
     14cf98a:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     14cf98e:	31 ff                	xor    edi,edi
     14cf990:	e8 87 ea 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14cf995:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     14cf99a:	4c 89 f6             	mov    rsi,r14
     14cf99d:	e8 7a 9e 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14cf9a2:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14cf9a6:	e8 db ea 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cf9ab:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     14cf9b0:	4c 8b 70 30          	mov    r14,QWORD PTR [rax+0x30]
     14cf9b4:	bf 90 01 00 00       	mov    edi,0x190
     14cf9b9:	e8 42 e5 31 00       	call   17edf00 <_Znwm@plt>
     14cf9be:	49 89 c7             	mov    r15,rax
     14cf9c1:	66 0f ef c0          	pxor   xmm0,xmm0
     14cf9c5:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14cf9ca:	48 8d 05 87 a0 3a 00 	lea    rax,[rip+0x3aa087]        # 1879a58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36140>
     14cf9d1:	49 89 07             	mov    QWORD PTR [r15],rax
     14cf9d4:	66 0f 6f 84 24 10 01 	movdqa xmm0,XMMWORD PTR [rsp+0x110]
     14cf9db:	00 00 
     14cf9dd:	f3 41 0f 7f 47 18    	movdqu XMMWORD PTR [r15+0x18],xmm0

### 0x14cfb65: call   17edf00 <_Znwm@plt>
     14cfb26:	00 00 80 3f 
     14cfb2a:	49 8d 87 18 01 00 00 	lea    rax,[r15+0x118]
     14cfb31:	f3 41 0f 7f 87 18 01 	movdqu XMMWORD PTR [r15+0x118],xmm0
     14cfb38:	00 00 
     14cfb3a:	49 89 87 10 01 00 00 	mov    QWORD PTR [r15+0x110],rax
     14cfb41:	49 8d bf 28 01 00 00 	lea    rdi,[r15+0x128]
     14cfb48:	e8 b5 a2 30 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     14cfb4d:	4d 89 b7 80 01 00 00 	mov    QWORD PTR [r15+0x180],r14
     14cfb54:	8a 84 24 e0 00 00 00 	mov    al,BYTE PTR [rsp+0xe0]
     14cfb5b:	41 88 87 88 01 00 00 	mov    BYTE PTR [r15+0x188],al
     14cfb62:	6a 20                	push   0x20
     14cfb64:	5f                   	pop    rdi
     14cfb65:	e8 96 e3 31 00       	call   17edf00 <_Znwm@plt>
     14cfb6a:	49 89 c5             	mov    r13,rax
     14cfb6d:	66 0f ef c0          	pxor   xmm0,xmm0
     14cfb71:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14cfb76:	48 8d 05 b3 d9 32 00 	lea    rax,[rip+0x32d9b3]        # 17fd530 <_ZNSt6__ndk119__shared_weak_countD2Ev@@Base+0xe25750>
     14cfb7d:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     14cfb81:	4d 89 7d 18          	mov    QWORD PTR [r13+0x18],r15
     14cfb85:	66 49 0f 6e c5       	movq   xmm0,r13
     14cfb8a:	66 49 0f 6e cf       	movq   xmm1,r15

### 0x14cfc2d: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14cfbf8:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     14cfbfd:	4d 8b 77 78          	mov    r14,QWORD PTR [r15+0x78]
     14cfc01:	48 8d 35 c8 df 6b ff 	lea    rsi,[rip+0xffffffffff6bdfc8]        # b8dbd0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdab70>
     14cfc08:	48 8d 15 da df 6b ff 	lea    rdx,[rip+0xffffffffff6bdfda]        # b8dbe9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdab89>
     14cfc0f:	48 8d 0d e6 2d 01 00 	lea    rcx,[rip+0x12de6]        # 14e29fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327f80>
     14cfc16:	48 8d ac 24 e0 02 00 	lea    rbp,[rsp+0x2e0]
     14cfc1d:	00 
     14cfc1e:	4c 8d 84 24 a0 03 00 	lea    r8,[rsp+0x3a0]
     14cfc25:	00 
     14cfc26:	6a 10                	push   0x10
     14cfc28:	41 59                	pop    r9
     14cfc2a:	48 89 ef             	mov    rdi,rbp
     14cfc2d:	e8 62 ab 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14cfc32:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14cfc35:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14cfc3c:	00 
     14cfc3d:	4c 89 f6             	mov    rsi,r14
     14cfc40:	48 89 ea             	mov    rdx,rbp
     14cfc43:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14cfc46:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14cfc4d:	00 

### 0x14cfc54: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14cfc2a:	48 89 ef             	mov    rdi,rbp
     14cfc2d:	e8 62 ab 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14cfc32:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14cfc35:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14cfc3c:	00 
     14cfc3d:	4c 89 f6             	mov    rsi,r14
     14cfc40:	48 89 ea             	mov    rdx,rbp
     14cfc43:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14cfc46:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14cfc4d:	00 
     14cfc4e:	48 89 df             	mov    rdi,rbx
     14cfc51:	4c 89 f6             	mov    rsi,r14
     14cfc54:	e8 99 9f 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14cfc59:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14cfc5d:	e8 24 e8 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cfc62:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14cfc69:	00 
     14cfc6a:	e8 79 ab 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14cfc6f:	49 8b 7f 78          	mov    rdi,QWORD PTR [r15+0x78]
     14cfc73:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14cfc76:	ff 50 10             	call   QWORD PTR [rax+0x10]

### 0x14cfc6a: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14cfc3d:	4c 89 f6             	mov    rsi,r14
     14cfc40:	48 89 ea             	mov    rdx,rbp
     14cfc43:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14cfc46:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14cfc4d:	00 
     14cfc4e:	48 89 df             	mov    rdi,rbx
     14cfc51:	4c 89 f6             	mov    rsi,r14
     14cfc54:	e8 99 9f 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14cfc59:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14cfc5d:	e8 24 e8 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cfc62:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14cfc69:	00 
     14cfc6a:	e8 79 ab 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14cfc6f:	49 8b 7f 78          	mov    rdi,QWORD PTR [r15+0x78]
     14cfc73:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14cfc76:	ff 50 10             	call   QWORD PTR [rax+0x10]
     14cfc79:	0f b6 f0             	movzx  esi,al
     14cfc7c:	4c 89 ff             	mov    rdi,r15
     14cfc7f:	e8 2e 2e 01 00       	call   14e2ab2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x328036>
     14cfc84:	49 8b 5f 48          	mov    rbx,QWORD PTR [r15+0x48]
     14cfc88:	4c 8d 84 24 30 02 00 	lea    r8,[rsp+0x230]

### 0x14cfcb2: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14cfc84:	49 8b 5f 48          	mov    rbx,QWORD PTR [r15+0x48]
     14cfc88:	4c 8d 84 24 30 02 00 	lea    r8,[rsp+0x230]
     14cfc8f:	00 
     14cfc90:	4d 89 38             	mov    QWORD PTR [r8],r15
     14cfc93:	48 8d 35 f7 d3 5c ff 	lea    rsi,[rip+0xffffffffff5cd3f7]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14cfc9a:	48 8d 0d c3 2e 01 00 	lea    rcx,[rip+0x12ec3]        # 14e2b64 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3280e8>
     14cfca1:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14cfca8:	00 
     14cfca9:	6a 08                	push   0x8
     14cfcab:	41 59                	pop    r9
     14cfcad:	4c 89 f7             	mov    rdi,r14
     14cfcb0:	31 d2                	xor    edx,edx
     14cfcb2:	e8 dd aa 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14cfcb7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14cfcba:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14cfcc1:	00 
     14cfcc2:	48 89 de             	mov    rsi,rbx
     14cfcc5:	4c 89 f2             	mov    rdx,r14
     14cfcc8:	ff 50 60             	call   QWORD PTR [rax+0x60]
     14cfccb:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
     14cfcd2:	00 

### 0x14cfcde: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14cfcb2:	e8 dd aa 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14cfcb7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14cfcba:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14cfcc1:	00 
     14cfcc2:	48 89 de             	mov    rsi,rbx
     14cfcc5:	4c 89 f2             	mov    rdx,r14
     14cfcc8:	ff 50 60             	call   QWORD PTR [rax+0x60]
     14cfccb:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
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

### 0x14cfcf4: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14cfcc5:	4c 89 f2             	mov    rdx,r14
     14cfcc8:	ff 50 60             	call   QWORD PTR [rax+0x60]
     14cfccb:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
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

### 0x14cfd27: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
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

### 0x14cfd53: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
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

### 0x14cfd69: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
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

### 0x14cfd9c: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
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

### 0x14cfdc8: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
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

### 0x14cfdde: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
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

### 0x14cfeec: call   17edf00 <_Znwm@plt>
     14cfebb:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     14cfebe:	48 8d 35 35 85 f6 fe 	lea    rsi,[rip+0xfffffffffef68535]        # 4383fa <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5de49>
     14cfec5:	48 8d 0d 44 85 f6 fe 	lea    rcx,[rip+0xfffffffffef68544]        # 438410 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5de5f>
     14cfecc:	6a 1e                	push   0x1e
     14cfece:	41 58                	pop    r8
     14cfed0:	48 89 da             	mov    rdx,rbx
     14cfed3:	45 31 c9             	xor    r9d,r9d
     14cfed6:	e8 af 74 11 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
     14cfedb:	88 84 24 b8 00 00 00 	mov    BYTE PTR [rsp+0xb8],al
     14cfee2:	4d 8b b6 58 01 00 00 	mov    r14,QWORD PTR [r14+0x158]
     14cfee9:	6a 48                	push   0x48
     14cfeeb:	5f                   	pop    rdi
     14cfeec:	e8 0f e0 31 00       	call   17edf00 <_Znwm@plt>
     14cfef1:	49 89 c7             	mov    r15,rax
     14cfef4:	48 89 c3             	mov    rbx,rax
     14cfef7:	66 0f ef c0          	pxor   xmm0,xmm0
     14cfefb:	f3 41 0f 7f 47 08    	movdqu XMMWORD PTR [r15+0x8],xmm0
     14cff01:	48 8d 05 60 d5 32 00 	lea    rax,[rip+0x32d560]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14cff08:	49 89 07             	mov    QWORD PTR [r15],rax
     14cff0b:	49 8d 6f 18          	lea    rbp,[r15+0x18]
     14cff0f:	48 8d 05 d2 9c 3a 00 	lea    rax,[rip+0x3a9cd2]        # 1879be8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x362d0>

### 0x14cff78: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14cff4a:	4c 8b 73 28          	mov    r14,QWORD PTR [rbx+0x28]
     14cff4e:	4c 8d 84 24 80 03 00 	lea    r8,[rsp+0x380]
     14cff55:	00 
     14cff56:	49 89 28             	mov    QWORD PTR [r8],rbp
     14cff59:	48 8d 35 31 d1 5c ff 	lea    rsi,[rip+0xffffffffff5cd131]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14cff60:	48 8d 0d 83 5a 01 00 	lea    rcx,[rip+0x15a83]        # 14e59ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32af6e>
     14cff67:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]
     14cff6e:	00 
     14cff6f:	6a 08                	push   0x8
     14cff71:	41 59                	pop    r9
     14cff73:	4c 89 ef             	mov    rdi,r13
     14cff76:	31 d2                	xor    edx,edx
     14cff78:	e8 17 a8 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14cff7d:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14cff80:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14cff87:	00 
     14cff88:	4c 89 f6             	mov    rsi,r14
     14cff8b:	4c 89 ea             	mov    rdx,r13
     14cff8e:	ff 50 50             	call   QWORD PTR [rax+0x50]
     14cff91:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14cff98:	00 

### 0x14cff9f: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14cff76:	31 d2                	xor    edx,edx
     14cff78:	e8 17 a8 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14cff7d:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14cff80:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14cff87:	00 
     14cff88:	4c 89 f6             	mov    rsi,r14
     14cff8b:	4c 89 ea             	mov    rdx,r13
     14cff8e:	ff 50 50             	call   QWORD PTR [rax+0x50]
     14cff91:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14cff98:	00 
     14cff99:	4c 89 ff             	mov    rdi,r15
     14cff9c:	4c 89 f6             	mov    rsi,r14
     14cff9f:	e8 4e 9c 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14cffa4:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14cffa8:	e8 d9 e4 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cffad:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]
     14cffb4:	00 
     14cffb5:	4c 89 ef             	mov    rdi,r13
     14cffb8:	e8 2b a8 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14cffbd:	4c 8d bc 24 b0 02 00 	lea    r15,[rsp+0x2b0]
     14cffc4:	00 

### 0x14cffb8: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14cff8b:	4c 89 ea             	mov    rdx,r13
     14cff8e:	ff 50 50             	call   QWORD PTR [rax+0x50]
     14cff91:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14cff98:	00 
     14cff99:	4c 89 ff             	mov    rdi,r15
     14cff9c:	4c 89 f6             	mov    rsi,r14
     14cff9f:	e8 4e 9c 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14cffa4:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14cffa8:	e8 d9 e4 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cffad:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]
     14cffb4:	00 
     14cffb5:	4c 89 ef             	mov    rdi,r13
     14cffb8:	e8 2b a8 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14cffbd:	4c 8d bc 24 b0 02 00 	lea    r15,[rsp+0x2b0]
     14cffc4:	00 
     14cffc5:	49 89 2f             	mov    QWORD PTR [r15],rbp
     14cffc8:	49 89 5f 08          	mov    QWORD PTR [r15+0x8],rbx
     14cffcc:	31 ff                	xor    edi,edi
     14cffce:	e8 49 e4 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14cffd3:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14cffd8:	48 8d b8 d8 00 00 00 	lea    rdi,[rax+0xd8]

### 0x14d0021: call   17edf00 <_Znwm@plt>
     14cffef:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     14cfff3:	e8 8e e4 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cfff8:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     14cfffd:	48 8b 58 48          	mov    rbx,QWORD PTR [rax+0x48]
     14d0001:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
     14d0005:	66 0f 7f 84 24 a0 00 	movdqa XMMWORD PTR [rsp+0xa0],xmm0
     14d000c:	00 00 
     14d000e:	48 8b 68 08          	mov    rbp,QWORD PTR [rax+0x8]
     14d0012:	48 85 ed             	test   rbp,rbp
     14d0015:	74 05                	je     14d001c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3155a0>
     14d0017:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
     14d001c:	bf a0 01 00 00       	mov    edi,0x1a0
     14d0021:	e8 da de 31 00       	call   17edf00 <_Znwm@plt>
     14d0026:	49 89 c7             	mov    r15,rax
     14d0029:	66 0f ef c0          	pxor   xmm0,xmm0
     14d002d:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d0032:	48 8d 05 8f ad 33 00 	lea    rax,[rip+0x33ad8f]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
     14d0039:	49 89 07             	mov    QWORD PTR [r15],rax
     14d003c:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     14d0041:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
     14d0045:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]

### 0x14d027f: call   17edf00 <_Znwm@plt>
     14d024c:	48 89 bc 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rdi
     14d0253:	00 
     14d0254:	48 89 de             	mov    rsi,rbx
     14d0257:	e8 c0 95 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14d025c:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d0260:	e8 21 e2 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0265:	31 ff                	xor    edi,edi
     14d0267:	e8 1a e2 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d026c:	f0 49 ff 06          	lock inc QWORD PTR [r14]
     14d0270:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
     14d0275:	49 8b 5c 24 48       	mov    rbx,QWORD PTR [r12+0x48]
     14d027a:	bf b0 00 00 00       	mov    edi,0xb0
     14d027f:	e8 7c dc 31 00       	call   17edf00 <_Znwm@plt>
     14d0284:	49 89 c7             	mov    r15,rax
     14d0287:	66 0f ef c0          	pxor   xmm0,xmm0
     14d028b:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
     14d028f:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
     14d0294:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     14d0298:	49 89 6f 18          	mov    QWORD PTR [r15+0x18],rbp
     14d029c:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
     14d02a1:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]

### 0x14d034c: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d031e:	4c 8d 84 24 80 03 00 	lea    r8,[rsp+0x380]
     14d0325:	00 
     14d0326:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d0329:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
     14d032d:	48 8d 35 5d cd 5c ff 	lea    rsi,[rip+0xffffffffff5ccd5d]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d0334:	48 8d 0d 7b 5e 00 00 	lea    rcx,[rip+0x5e7b]        # 14d61b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31b73a>
     14d033b:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]
     14d0342:	00 
     14d0343:	6a 08                	push   0x8
     14d0345:	41 59                	pop    r9
     14d0347:	4c 89 ef             	mov    rdi,r13
     14d034a:	31 d2                	xor    edx,edx
     14d034c:	e8 43 a4 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d0351:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     14d0355:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d035c:	00 
     14d035d:	4c 89 e6             	mov    rsi,r12
     14d0360:	4c 89 ea             	mov    rdx,r13
     14d0363:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14d0366:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14d036d:	00 

### 0x14d0374: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d034a:	31 d2                	xor    edx,edx
     14d034c:	e8 43 a4 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d0351:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     14d0355:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d035c:	00 
     14d035d:	4c 89 e6             	mov    rsi,r12
     14d0360:	4c 89 ea             	mov    rdx,r13
     14d0363:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14d0366:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14d036d:	00 
     14d036e:	48 89 df             	mov    rdi,rbx
     14d0371:	4c 89 f6             	mov    rsi,r14
     14d0374:	e8 79 98 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d0379:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d037d:	e8 04 e1 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0382:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14d0389:	00 
     14d038a:	48 89 df             	mov    rdi,rbx
     14d038d:	e8 56 a4 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d0392:	4c 89 3b             	mov    QWORD PTR [rbx],r15
     14d0395:	6a 20                	push   0x20

### 0x14d038d: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d0360:	4c 89 ea             	mov    rdx,r13
     14d0363:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14d0366:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14d036d:	00 
     14d036e:	48 89 df             	mov    rdi,rbx
     14d0371:	4c 89 f6             	mov    rsi,r14
     14d0374:	e8 79 98 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d0379:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d037d:	e8 04 e1 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0382:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14d0389:	00 
     14d038a:	48 89 df             	mov    rdi,rbx
     14d038d:	e8 56 a4 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d0392:	4c 89 3b             	mov    QWORD PTR [rbx],r15
     14d0395:	6a 20                	push   0x20
     14d0397:	5f                   	pop    rdi
     14d0398:	e8 63 db 31 00       	call   17edf00 <_Znwm@plt>
     14d039d:	48 89 c3             	mov    rbx,rax
     14d03a0:	66 0f ef c0          	pxor   xmm0,xmm0
     14d03a4:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d03a9:	48 8d 05 f0 90 3a 00 	lea    rax,[rip+0x3a90f0]        # 18794a0 <_ZNSt6__ndk119__shared_weak_countD2Ev@@Base+0xea16c0>

### 0x14d0398: call   17edf00 <_Znwm@plt>
     14d036e:	48 89 df             	mov    rdi,rbx
     14d0371:	4c 89 f6             	mov    rsi,r14
     14d0374:	e8 79 98 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d0379:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d037d:	e8 04 e1 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0382:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14d0389:	00 
     14d038a:	48 89 df             	mov    rdi,rbx
     14d038d:	e8 56 a4 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d0392:	4c 89 3b             	mov    QWORD PTR [rbx],r15
     14d0395:	6a 20                	push   0x20
     14d0397:	5f                   	pop    rdi
     14d0398:	e8 63 db 31 00       	call   17edf00 <_Znwm@plt>
     14d039d:	48 89 c3             	mov    rbx,rax
     14d03a0:	66 0f ef c0          	pxor   xmm0,xmm0
     14d03a4:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d03a9:	48 8d 05 f0 90 3a 00 	lea    rax,[rip+0x3a90f0]        # 18794a0 <_ZNSt6__ndk119__shared_weak_countD2Ev@@Base+0xea16c0>
     14d03b0:	48 83 a4 24 e0 02 00 	and    QWORD PTR [rsp+0x2e0],0x0
     14d03b7:	00 00 
     14d03b9:	48 89 03             	mov    QWORD PTR [rbx],rax
     14d03bc:	4c 89 7b 18          	mov    QWORD PTR [rbx+0x18],r15

### 0x14d047c: call   17edf00 <_Znwm@plt>
     14d0450:	4c 89 f6             	mov    rsi,r14
     14d0453:	ff 50 10             	call   QWORD PTR [rax+0x10]
     14d0456:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d045d:	00 
     14d045e:	e8 07 9b 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14d0463:	31 ff                	xor    edi,edi
     14d0465:	e8 48 e0 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14d046a:	4c 89 e0             	mov    rax,r12
     14d046d:	4d 8b 64 24 48       	mov    r12,QWORD PTR [r12+0x48]
     14d0472:	4c 8b a8 a0 00 00 00 	mov    r13,QWORD PTR [rax+0xa0]
     14d0479:	6a 28                	push   0x28
     14d047b:	5f                   	pop    rdi
     14d047c:	e8 7f da 31 00       	call   17edf00 <_Znwm@plt>
     14d0481:	49 89 c6             	mov    r14,rax
     14d0484:	48 89 c7             	mov    rdi,rax
     14d0487:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
     14d048c:	e8 af da 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14d0491:	4d 89 66 18          	mov    QWORD PTR [r14+0x18],r12
     14d0495:	4d 89 6e 20          	mov    QWORD PTR [r14+0x20],r13
     14d0499:	4c 89 b4 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],r14
     14d04a0:	00 

### 0x14d04a6: call   17edf00 <_Znwm@plt>
     14d0479:	6a 28                	push   0x28
     14d047b:	5f                   	pop    rdi
     14d047c:	e8 7f da 31 00       	call   17edf00 <_Znwm@plt>
     14d0481:	49 89 c6             	mov    r14,rax
     14d0484:	48 89 c7             	mov    rdi,rax
     14d0487:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
     14d048c:	e8 af da 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14d0491:	4d 89 66 18          	mov    QWORD PTR [r14+0x18],r12
     14d0495:	4d 89 6e 20          	mov    QWORD PTR [r14+0x20],r13
     14d0499:	4c 89 b4 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],r14
     14d04a0:	00 
     14d04a1:	bf b0 00 00 00       	mov    edi,0xb0
     14d04a6:	e8 55 da 31 00       	call   17edf00 <_Znwm@plt>
     14d04ab:	49 89 c4             	mov    r12,rax
     14d04ae:	66 0f ef c0          	pxor   xmm0,xmm0
     14d04b2:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d04b7:	48 8d 05 aa cf 32 00 	lea    rax,[rip+0x32cfaa]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14d04be:	49 89 04 24          	mov    QWORD PTR [r12],rax
     14d04c2:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d04c7:	66 0f 6f 80 80 00 00 	movdqa xmm0,XMMWORD PTR [rax+0x80]
     14d04ce:	00 

### 0x14d05b1: call   17edf00 <_Znwm@plt>
     14d057c:	e8 9b 92 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14d0581:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d0585:	e8 fc de 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d058a:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d0591:	00 
     14d0592:	4c 89 f7             	mov    rdi,r14
     14d0595:	e8 68 48 00 00       	call   14d4e02 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a386>
     14d059a:	48 89 df             	mov    rdi,rbx
     14d059d:	e8 e4 de 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d05a2:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     14d05a7:	e8 da de 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d05ac:	bf e0 00 00 00       	mov    edi,0xe0
     14d05b1:	e8 4a d9 31 00       	call   17edf00 <_Znwm@plt>
     14d05b6:	48 89 c3             	mov    rbx,rax
     14d05b9:	49 89 c7             	mov    r15,rax
     14d05bc:	66 0f ef c0          	pxor   xmm0,xmm0
     14d05c0:	f3 0f 7f 43 08       	movdqu XMMWORD PTR [rbx+0x8],xmm0
     14d05c5:	48 8d 05 9c ce 32 00 	lea    rax,[rip+0x32ce9c]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14d05cc:	48 89 03             	mov    QWORD PTR [rbx],rax
     14d05cf:	48 8d 05 3a 9c 3a 00 	lea    rax,[rip+0x3a9c3a]        # 187a210 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x368f8>
     14d05d6:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax

### 0x14d06be: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
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

### 0x14d070f: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
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

### 0x14d0739: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d0714:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d0717:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d071e:	00 
     14d071f:	6a 03                	push   0x3
     14d0721:	5a                   	pop    rdx
     14d0722:	4c 89 f6             	mov    rsi,r14
     14d0725:	4c 89 e1             	mov    rcx,r12
     14d0728:	ff 50 70             	call   QWORD PTR [rax+0x70]
     14d072b:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d0732:	00 
     14d0733:	4c 89 ef             	mov    rdi,r13
     14d0736:	48 89 de             	mov    rsi,rbx
     14d0739:	e8 b4 94 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d073e:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d0742:	e8 3f dd 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0747:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d074e:	00 
     14d074f:	e8 94 a0 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d0754:	49 8b 5f 40          	mov    rbx,QWORD PTR [r15+0x40]
     14d0758:	4c 8d 84 24 80 03 00 	lea    r8,[rsp+0x380]
     14d075f:	00 

### 0x14d074f: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d0722:	4c 89 f6             	mov    rsi,r14
     14d0725:	4c 89 e1             	mov    rcx,r12
     14d0728:	ff 50 70             	call   QWORD PTR [rax+0x70]
     14d072b:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d0732:	00 
     14d0733:	4c 89 ef             	mov    rdi,r13
     14d0736:	48 89 de             	mov    rsi,rbx
     14d0739:	e8 b4 94 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d073e:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d0742:	e8 3f dd 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0747:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d074e:	00 
     14d074f:	e8 94 a0 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d0754:	49 8b 5f 40          	mov    rbx,QWORD PTR [r15+0x40]
     14d0758:	4c 8d 84 24 80 03 00 	lea    r8,[rsp+0x380]
     14d075f:	00 
     14d0760:	49 89 28             	mov    QWORD PTR [r8],rbp
     14d0763:	48 8d 35 27 c9 5c ff 	lea    rsi,[rip+0xffffffffff5cc927]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d076a:	48 8d 0d 95 d3 01 00 	lea    rcx,[rip+0x1d395]        # 14edb06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33308a>
     14d0771:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d0778:	00 

### 0x14d0782: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d0754:	49 8b 5f 40          	mov    rbx,QWORD PTR [r15+0x40]
     14d0758:	4c 8d 84 24 80 03 00 	lea    r8,[rsp+0x380]
     14d075f:	00 
     14d0760:	49 89 28             	mov    QWORD PTR [r8],rbp
     14d0763:	48 8d 35 27 c9 5c ff 	lea    rsi,[rip+0xffffffffff5cc927]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d076a:	48 8d 0d 95 d3 01 00 	lea    rcx,[rip+0x1d395]        # 14edb06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33308a>
     14d0771:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d0778:	00 
     14d0779:	6a 08                	push   0x8
     14d077b:	41 59                	pop    r9
     14d077d:	4c 89 f7             	mov    rdi,r14
     14d0780:	31 d2                	xor    edx,edx
     14d0782:	e8 0d a0 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d0787:	4c 8d a4 24 a0 03 00 	lea    r12,[rsp+0x3a0]
     14d078e:	00 
     14d078f:	4c 89 e7             	mov    rdi,r12
     14d0792:	48 89 de             	mov    rsi,rbx
     14d0795:	4c 89 f2             	mov    rdx,r14
     14d0798:	e8 73 d3 01 00       	call   14edb10 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333094>
     14d079d:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     14d07a2:	4c 89 e6             	mov    rsi,r12

### 0x14d0798: call   14edb10 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333094>
     14d0771:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d0778:	00 
     14d0779:	6a 08                	push   0x8
     14d077b:	41 59                	pop    r9
     14d077d:	4c 89 f7             	mov    rdi,r14
     14d0780:	31 d2                	xor    edx,edx
     14d0782:	e8 0d a0 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d0787:	4c 8d a4 24 a0 03 00 	lea    r12,[rsp+0x3a0]
     14d078e:	00 
     14d078f:	4c 89 e7             	mov    rdi,r12
     14d0792:	48 89 de             	mov    rsi,rbx
     14d0795:	4c 89 f2             	mov    rdx,r14
     14d0798:	e8 73 d3 01 00       	call   14edb10 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333094>
     14d079d:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     14d07a2:	4c 89 e6             	mov    rsi,r12
     14d07a5:	e8 48 94 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d07aa:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     14d07af:	e8 d2 dc 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d07b4:	4c 89 f7             	mov    rdi,r14
     14d07b7:	e8 2c a0 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d07bc:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]

### 0x14d07a5: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d077b:	41 59                	pop    r9
     14d077d:	4c 89 f7             	mov    rdi,r14
     14d0780:	31 d2                	xor    edx,edx
     14d0782:	e8 0d a0 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d0787:	4c 8d a4 24 a0 03 00 	lea    r12,[rsp+0x3a0]
     14d078e:	00 
     14d078f:	4c 89 e7             	mov    rdi,r12
     14d0792:	48 89 de             	mov    rsi,rbx
     14d0795:	4c 89 f2             	mov    rdx,r14
     14d0798:	e8 73 d3 01 00       	call   14edb10 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333094>
     14d079d:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     14d07a2:	4c 89 e6             	mov    rsi,r12
     14d07a5:	e8 48 94 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d07aa:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     14d07af:	e8 d2 dc 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d07b4:	4c 89 f7             	mov    rdi,r14
     14d07b7:	e8 2c a0 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d07bc:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
     14d07c3:	00 
     14d07c4:	48 89 2b             	mov    QWORD PTR [rbx],rbp
     14d07c7:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15

### 0x14d07b7: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d0787:	4c 8d a4 24 a0 03 00 	lea    r12,[rsp+0x3a0]
     14d078e:	00 
     14d078f:	4c 89 e7             	mov    rdi,r12
     14d0792:	48 89 de             	mov    rsi,rbx
     14d0795:	4c 89 f2             	mov    rdx,r14
     14d0798:	e8 73 d3 01 00       	call   14edb10 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333094>
     14d079d:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     14d07a2:	4c 89 e6             	mov    rsi,r12
     14d07a5:	e8 48 94 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d07aa:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     14d07af:	e8 d2 dc 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d07b4:	4c 89 f7             	mov    rdi,r14
     14d07b7:	e8 2c a0 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d07bc:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
     14d07c3:	00 
     14d07c4:	48 89 2b             	mov    QWORD PTR [rbx],rbp
     14d07c7:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
     14d07cb:	31 ff                	xor    edi,edi
     14d07cd:	e8 4a dc 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d07d2:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d07d7:	48 8d 78 30          	lea    rdi,[rax+0x30]

### 0x14d07f8: call   17edf00 <_Znwm@plt>
     14d07cb:	31 ff                	xor    edi,edi
     14d07cd:	e8 4a dc 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d07d2:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d07d7:	48 8d 78 30          	lea    rdi,[rax+0x30]
     14d07db:	48 89 de             	mov    rsi,rbx
     14d07de:	e8 39 90 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14d07e3:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d07e7:	e8 9a dc 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d07ec:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     14d07f1:	4c 8b 70 48          	mov    r14,QWORD PTR [rax+0x48]
     14d07f5:	6a 50                	push   0x50
     14d07f7:	5f                   	pop    rdi
     14d07f8:	e8 03 d7 31 00       	call   17edf00 <_Znwm@plt>
     14d07fd:	48 89 c3             	mov    rbx,rax
     14d0800:	66 0f ef c0          	pxor   xmm0,xmm0
     14d0804:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d0809:	48 8d 05 58 cc 32 00 	lea    rax,[rip+0x32cc58]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14d0810:	48 89 03             	mov    QWORD PTR [rbx],rax
     14d0813:	48 8d 05 8e 95 3a 00 	lea    rax,[rip+0x3a958e]        # 1879da8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36490>
     14d081a:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     14d081e:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]

### 0x14d089d: call   17edf00 <_Znwm@plt>
     14d086f:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d0874:	48 8d 78 40          	lea    rdi,[rax+0x40]
     14d0878:	48 89 bc 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rdi
     14d087f:	00 
     14d0880:	4c 89 f6             	mov    rsi,r14
     14d0883:	e8 94 8f 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14d0888:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d088c:	e8 f5 db 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0891:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     14d0896:	48 8b 58 48          	mov    rbx,QWORD PTR [rax+0x48]
     14d089a:	6a 30                	push   0x30
     14d089c:	5f                   	pop    rdi
     14d089d:	e8 5e d6 31 00       	call   17edf00 <_Znwm@plt>
     14d08a2:	48 89 c6             	mov    rsi,rax
     14d08a5:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
     14d08a9:	66 41 0f 6f 07       	movdqa xmm0,XMMWORD PTR [r15]
     14d08ae:	f3 0f 7f 06          	movdqu XMMWORD PTR [rsi],xmm0
     14d08b2:	48 85 c0             	test   rax,rax
     14d08b5:	74 05                	je     14d08bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x315e40>
     14d08b7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d08bc:	49 83 c4 18          	add    r12,0x18

### 0x14d0934: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d0907:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     14d090a:	49 89 f7             	mov    r15,rsi
     14d090d:	48 89 b4 24 b0 02 00 	mov    QWORD PTR [rsp+0x2b0],rsi
     14d0914:	00 
     14d0915:	4c 89 ef             	mov    rdi,r13
     14d0918:	48 8d 35 72 c7 5c ff 	lea    rsi,[rip+0xffffffffff5cc772]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d091f:	31 d2                	xor    edx,edx
     14d0921:	48 8d 0d 5a 75 01 00 	lea    rcx,[rip+0x1755a]        # 14e7e82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32d406>
     14d0928:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d092f:	00 
     14d0930:	6a 08                	push   0x8
     14d0932:	41 59                	pop    r9
     14d0934:	e8 5b 9e 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d0939:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d093c:	4c 89 e7             	mov    rdi,r12
     14d093f:	4c 89 f6             	mov    rsi,r14
     14d0942:	89 ea                	mov    edx,ebp
     14d0944:	4c 89 e9             	mov    rcx,r13
     14d0947:	ff 50 70             	call   QWORD PTR [rax+0x70]
     14d094a:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     14d094f:	4c 89 e6             	mov    rsi,r12

### 0x14d0967: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d093c:	4c 89 e7             	mov    rdi,r12
     14d093f:	4c 89 f6             	mov    rsi,r14
     14d0942:	89 ea                	mov    edx,ebp
     14d0944:	4c 89 e9             	mov    rcx,r13
     14d0947:	ff 50 70             	call   QWORD PTR [rax+0x70]
     14d094a:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     14d094f:	4c 89 e6             	mov    rsi,r12
     14d0952:	e8 03 b3 5e ff       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>
     14d0957:	48 8b bc 24 a8 03 00 	mov    rdi,QWORD PTR [rsp+0x3a8]
     14d095e:	00 
     14d095f:	e8 22 db 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0964:	4c 89 ef             	mov    rdi,r13
     14d0967:	e8 7c 9e 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d096c:	48 83 c3 04          	add    rbx,0x4
     14d0970:	48 83 fb 10          	cmp    rbx,0x10
     14d0974:	4c 89 fe             	mov    rsi,r15
     14d0977:	0f 85 7b ff ff ff    	jne    14d08f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x315e7c>
     14d097d:	4c 8b 7c 24 18       	mov    r15,QWORD PTR [rsp+0x18]
     14d0982:	49 8d bf b8 00 00 00 	lea    rdi,[r15+0xb8]
     14d0989:	4c 8d b4 24 80 03 00 	lea    r14,[rsp+0x380]
     14d0990:	00 

### 0x14d09ae: call   17edf00 <_Znwm@plt>
     14d097d:	4c 8b 7c 24 18       	mov    r15,QWORD PTR [rsp+0x18]
     14d0982:	49 8d bf b8 00 00 00 	lea    rdi,[r15+0xb8]
     14d0989:	4c 8d b4 24 80 03 00 	lea    r14,[rsp+0x380]
     14d0990:	00 
     14d0991:	49 83 26 00          	and    QWORD PTR [r14],0x0
     14d0995:	e8 a6 d1 ff ff       	call   14cdb40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3130c4>
     14d099a:	4c 89 f7             	mov    rdi,r14
     14d099d:	e8 40 d1 ff ff       	call   14cdae2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313066>
     14d09a2:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     14d09a7:	4c 8b 70 48          	mov    r14,QWORD PTR [rax+0x48]
     14d09ab:	6a 58                	push   0x58
     14d09ad:	5f                   	pop    rdi
     14d09ae:	e8 4d d5 31 00       	call   17edf00 <_Znwm@plt>
     14d09b3:	48 89 c3             	mov    rbx,rax
     14d09b6:	66 41 0f 6f 87 80 00 	movdqa xmm0,XMMWORD PTR [r15+0x80]
     14d09bd:	00 00 
     14d09bf:	49 8b 97 88 00 00 00 	mov    rdx,QWORD PTR [r15+0x88]
     14d09c6:	48 85 d2             	test   rdx,rdx
     14d09c9:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
     14d09ce:	74 05                	je     14d09d5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x315f59>
     14d09d0:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]

### 0x14d0a86: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d0a57:	45 8b 64 05 00       	mov    r12d,DWORD PTR [r13+rax*1+0x0]
     14d0a5c:	4c 8b 33             	mov    r14,QWORD PTR [rbx]
     14d0a5f:	48 89 9c 24 b0 02 00 	mov    QWORD PTR [rsp+0x2b0],rbx
     14d0a66:	00 
     14d0a67:	4c 89 ff             	mov    rdi,r15
     14d0a6a:	48 8d 35 20 c6 5c ff 	lea    rsi,[rip+0xffffffffff5cc620]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d0a71:	31 d2                	xor    edx,edx
     14d0a73:	48 8d 0d 3c 93 01 00 	lea    rcx,[rip+0x1933c]        # 14e9db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32f33a>
     14d0a7a:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d0a81:	00 
     14d0a82:	6a 08                	push   0x8
     14d0a84:	41 59                	pop    r9
     14d0a86:	e8 09 9d 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d0a8b:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d0a8e:	48 89 ef             	mov    rdi,rbp
     14d0a91:	4c 89 f6             	mov    rsi,r14
     14d0a94:	44 89 e2             	mov    edx,r12d
     14d0a97:	4c 89 f9             	mov    rcx,r15
     14d0a9a:	ff 50 70             	call   QWORD PTR [rax+0x70]
     14d0a9d:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     14d0aa2:	48 89 ee             	mov    rsi,rbp

### 0x14d0aba: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d0a8e:	48 89 ef             	mov    rdi,rbp
     14d0a91:	4c 89 f6             	mov    rsi,r14
     14d0a94:	44 89 e2             	mov    edx,r12d
     14d0a97:	4c 89 f9             	mov    rcx,r15
     14d0a9a:	ff 50 70             	call   QWORD PTR [rax+0x70]
     14d0a9d:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     14d0aa2:	48 89 ee             	mov    rsi,rbp
     14d0aa5:	e8 b0 b1 5e ff       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>
     14d0aaa:	48 8b bc 24 a8 03 00 	mov    rdi,QWORD PTR [rsp+0x3a8]
     14d0ab1:	00 
     14d0ab2:	e8 cf d9 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0ab7:	4c 89 ff             	mov    rdi,r15
     14d0aba:	e8 29 9d 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d0abf:	49 83 c5 04          	add    r13,0x4
     14d0ac3:	49 83 fd 10          	cmp    r13,0x10
     14d0ac7:	75 87                	jne    14d0a50 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x315fd4>
     14d0ac9:	4c 8d b4 24 80 03 00 	lea    r14,[rsp+0x380]
     14d0ad0:	00 
     14d0ad1:	49 89 1e             	mov    QWORD PTR [r14],rbx
     14d0ad4:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
     14d0adb:	00 

### 0x14d0b04: call   17edf00 <_Znwm@plt>
     14d0ad4:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
     14d0adb:	00 
     14d0adc:	e8 a5 d9 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0ae1:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d0ae6:	48 8d b8 c0 00 00 00 	lea    rdi,[rax+0xc0]
     14d0aed:	49 83 26 00          	and    QWORD PTR [r14],0x0
     14d0af1:	48 89 de             	mov    rsi,rbx
     14d0af4:	e8 71 d0 ff ff       	call   14cdb6a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3130ee>
     14d0af9:	4c 89 f7             	mov    rdi,r14
     14d0afc:	e8 d9 cf ff ff       	call   14cdada <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31305e>
     14d0b01:	6a 68                	push   0x68
     14d0b03:	5f                   	pop    rdi
     14d0b04:	e8 f7 d3 31 00       	call   17edf00 <_Znwm@plt>
     14d0b09:	48 89 c5             	mov    rbp,rax
     14d0b0c:	49 89 c4             	mov    r12,rax
     14d0b0f:	48 8b 8c 24 a0 00 00 	mov    rcx,QWORD PTR [rsp+0xa0]
     14d0b16:	00 
     14d0b17:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     14d0b1b:	0f 28 01             	movaps xmm0,XMMWORD PTR [rcx]
     14d0b1e:	0f 11 45 00          	movups XMMWORD PTR [rbp+0x0],xmm0
     14d0b22:	48 85 c0             	test   rax,rax

### 0x14d0c33: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d0c05:	48 89 de             	mov    rsi,rbx
     14d0c08:	4c 89 f2             	mov    rdx,r14
     14d0c0b:	ff 50 18             	call   QWORD PTR [rax+0x18]
     14d0c0e:	48 8d b4 24 30 02 00 	lea    rsi,[rsp+0x230]
     14d0c15:	00 
     14d0c16:	4c 89 ff             	mov    rdi,r15
     14d0c19:	e8 3c b0 5e ff       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>
     14d0c1e:	48 8b bc 24 38 02 00 	mov    rdi,QWORD PTR [rsp+0x238]
     14d0c25:	00 
     14d0c26:	e8 5b d8 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0c2b:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d0c32:	00 
     14d0c33:	e8 b0 9b 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d0c38:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d0c3f:	00 
     14d0c40:	e8 69 b7 5f ff       	call   acc3ae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1934e>
     14d0c45:	48 8d bc 24 80 03 00 	lea    rdi,[rsp+0x380]
     14d0c4c:	00 
     14d0c4d:	e8 3e d2 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14d0c52:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14d0c59:	00 

### 0x14d0cf6: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d0cc8:	48 89 de             	mov    rsi,rbx
     14d0ccb:	4c 89 f2             	mov    rdx,r14
     14d0cce:	ff 50 28             	call   QWORD PTR [rax+0x28]
     14d0cd1:	48 8d b4 24 10 02 00 	lea    rsi,[rsp+0x210]
     14d0cd8:	00 
     14d0cd9:	4c 89 ff             	mov    rdi,r15
     14d0cdc:	e8 79 af 5e ff       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>
     14d0ce1:	48 8b bc 24 18 02 00 	mov    rdi,QWORD PTR [rsp+0x218]
     14d0ce8:	00 
     14d0ce9:	e8 98 d7 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0cee:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d0cf5:	00 
     14d0cf6:	e8 ed 9a 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d0cfb:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d0d02:	00 
     14d0d03:	e8 a6 b6 5f ff       	call   acc3ae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1934e>
     14d0d08:	48 8d 9c 24 30 02 00 	lea    rbx,[rsp+0x230]
     14d0d0f:	00 
     14d0d10:	48 89 df             	mov    rdi,rbx
     14d0d13:	e8 78 d1 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14d0d18:	48 8d bc 24 80 03 00 	lea    rdi,[rsp+0x380]

### 0x14d0d54: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d0d25:	4d 8b 74 24 10       	mov    r14,QWORD PTR [r12+0x10]
     14d0d2a:	4c 89 23             	mov    QWORD PTR [rbx],r12
     14d0d2d:	48 8d 35 5d c3 5c ff 	lea    rsi,[rip+0xffffffffff5cc35d]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d0d34:	48 8d 0d 63 5e 01 00 	lea    rcx,[rip+0x15e63]        # 14e6b9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32c122>
     14d0d3b:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14d0d42:	00 
     14d0d43:	4c 8d 84 24 30 02 00 	lea    r8,[rsp+0x230]
     14d0d4a:	00 
     14d0d4b:	6a 08                	push   0x8
     14d0d4d:	41 59                	pop    r9
     14d0d4f:	48 89 df             	mov    rdi,rbx
     14d0d52:	31 d2                	xor    edx,edx
     14d0d54:	e8 3b 9a 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d0d59:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d0d5c:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d0d63:	00 
     14d0d64:	4c 89 f6             	mov    rsi,r14
     14d0d67:	48 89 da             	mov    rdx,rbx
     14d0d6a:	ff 50 28             	call   QWORD PTR [rax+0x28]
     14d0d6d:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14d0d74:	00 

### 0x14d0d92: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d0d64:	4c 89 f6             	mov    rsi,r14
     14d0d67:	48 89 da             	mov    rdx,rbx
     14d0d6a:	ff 50 28             	call   QWORD PTR [rax+0x28]
     14d0d6d:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14d0d74:	00 
     14d0d75:	4c 89 ff             	mov    rdi,r15
     14d0d78:	e8 dd ae 5e ff       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>
     14d0d7d:	48 8b bc 24 a8 03 00 	mov    rdi,QWORD PTR [rsp+0x3a8]
     14d0d84:	00 
     14d0d85:	e8 fc d6 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0d8a:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d0d91:	00 
     14d0d92:	e8 51 9a 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d0d97:	49 8b 5c 24 10       	mov    rbx,QWORD PTR [r12+0x10]
     14d0d9c:	48 8d 35 95 7d f6 fe 	lea    rsi,[rip+0xfffffffffef67d95]        # 438b38 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e587>
     14d0da3:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     14d0daa:	00 
     14d0dab:	e8 90 d1 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14d0db0:	66 0f ef c0          	pxor   xmm0,xmm0
     14d0db4:	48 8d 8c 24 10 02 00 	lea    rcx,[rsp+0x210]
     14d0dbb:	00 

### 0x14d0e2e: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d0e00:	48 89 de             	mov    rsi,rbx
     14d0e03:	4c 89 f2             	mov    rdx,r14
     14d0e06:	ff 50 38             	call   QWORD PTR [rax+0x38]
     14d0e09:	48 8d b4 24 f0 01 00 	lea    rsi,[rsp+0x1f0]
     14d0e10:	00 
     14d0e11:	4c 89 ff             	mov    rdi,r15
     14d0e14:	e8 41 ae 5e ff       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>
     14d0e19:	48 8b bc 24 f8 01 00 	mov    rdi,QWORD PTR [rsp+0x1f8]
     14d0e20:	00 
     14d0e21:	e8 60 d6 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0e26:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d0e2d:	00 
     14d0e2e:	e8 b5 99 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d0e33:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d0e3a:	00 
     14d0e3b:	e8 6e b5 5f ff       	call   acc3ae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1934e>
     14d0e40:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
     14d0e47:	00 
     14d0e48:	e8 43 d0 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14d0e4d:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     14d0e54:	00 

### 0x14d0ef1: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d0ec3:	48 89 de             	mov    rsi,rbx
     14d0ec6:	4c 89 f2             	mov    rdx,r14
     14d0ec9:	ff 50 40             	call   QWORD PTR [rax+0x40]
     14d0ecc:	48 8d b4 24 c0 01 00 	lea    rsi,[rsp+0x1c0]
     14d0ed3:	00 
     14d0ed4:	4c 89 ff             	mov    rdi,r15
     14d0ed7:	e8 7e ad 5e ff       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>
     14d0edc:	48 8b bc 24 c8 01 00 	mov    rdi,QWORD PTR [rsp+0x1c8]
     14d0ee3:	00 
     14d0ee4:	e8 9d d5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0ee9:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d0ef0:	00 
     14d0ef1:	e8 f2 98 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d0ef6:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d0efd:	00 
     14d0efe:	e8 ab b4 5f ff       	call   acc3ae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1934e>
     14d0f03:	48 8d 9c 24 f0 01 00 	lea    rbx,[rsp+0x1f0]
     14d0f0a:	00 
     14d0f0b:	48 89 df             	mov    rdi,rbx
     14d0f0e:	e8 7d cf 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14d0f13:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]

### 0x14d0f4f: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d0f20:	4d 8b 74 24 10       	mov    r14,QWORD PTR [r12+0x10]
     14d0f25:	4c 89 23             	mov    QWORD PTR [rbx],r12
     14d0f28:	48 8d 35 62 c1 5c ff 	lea    rsi,[rip+0xffffffffff5cc162]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d0f2f:	48 8d 0d 3a 62 01 00 	lea    rcx,[rip+0x1623a]        # 14e7170 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32c6f4>
     14d0f36:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14d0f3d:	00 
     14d0f3e:	4c 8d 84 24 f0 01 00 	lea    r8,[rsp+0x1f0]
     14d0f45:	00 
     14d0f46:	6a 08                	push   0x8
     14d0f48:	41 59                	pop    r9
     14d0f4a:	48 89 df             	mov    rdi,rbx
     14d0f4d:	31 d2                	xor    edx,edx
     14d0f4f:	e8 40 98 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d0f54:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d0f57:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d0f5e:	00 
     14d0f5f:	4c 89 f6             	mov    rsi,r14
     14d0f62:	48 89 da             	mov    rdx,rbx
     14d0f65:	ff 50 48             	call   QWORD PTR [rax+0x48]
     14d0f68:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14d0f6f:	00 

### 0x14d0f91: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d0f62:	48 89 da             	mov    rdx,rbx
     14d0f65:	ff 50 48             	call   QWORD PTR [rax+0x48]
     14d0f68:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14d0f6f:	00 
     14d0f70:	4c 89 ff             	mov    rdi,r15
     14d0f73:	e8 e2 ac 5e ff       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>
     14d0f78:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d0f7f:	00 
     14d0f80:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d0f84:	e8 fd d4 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0f89:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d0f90:	00 
     14d0f91:	e8 52 98 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d0f96:	4d 8b 74 24 10       	mov    r14,QWORD PTR [r12+0x10]
     14d0f9b:	4c 8d 84 24 f0 01 00 	lea    r8,[rsp+0x1f0]
     14d0fa2:	00 
     14d0fa3:	4d 89 20             	mov    QWORD PTR [r8],r12
     14d0fa6:	48 8d 35 e4 c0 5c ff 	lea    rsi,[rip+0xffffffffff5cc0e4]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d0fad:	48 8d 0d ae 63 01 00 	lea    rcx,[rip+0x163ae]        # 14e7362 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32c8e6>
     14d0fb4:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]
     14d0fbb:	00 

### 0x14d0fc5: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d0f96:	4d 8b 74 24 10       	mov    r14,QWORD PTR [r12+0x10]
     14d0f9b:	4c 8d 84 24 f0 01 00 	lea    r8,[rsp+0x1f0]
     14d0fa2:	00 
     14d0fa3:	4d 89 20             	mov    QWORD PTR [r8],r12
     14d0fa6:	48 8d 35 e4 c0 5c ff 	lea    rsi,[rip+0xffffffffff5cc0e4]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d0fad:	48 8d 0d ae 63 01 00 	lea    rcx,[rip+0x163ae]        # 14e7362 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32c8e6>
     14d0fb4:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]
     14d0fbb:	00 
     14d0fbc:	6a 08                	push   0x8
     14d0fbe:	41 59                	pop    r9
     14d0fc0:	4c 89 ef             	mov    rdi,r13
     14d0fc3:	31 d2                	xor    edx,edx
     14d0fc5:	e8 ca 97 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d0fca:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d0fcd:	48 89 df             	mov    rdi,rbx
     14d0fd0:	4c 89 f6             	mov    rsi,r14
     14d0fd3:	4c 89 ea             	mov    rdx,r13
     14d0fd6:	ff 50 30             	call   QWORD PTR [rax+0x30]
     14d0fd9:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14d0fe0:	00 
     14d0fe1:	4c 89 ff             	mov    rdi,r15

### 0x14d1003: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d0fd3:	4c 89 ea             	mov    rdx,r13
     14d0fd6:	ff 50 30             	call   QWORD PTR [rax+0x30]
     14d0fd9:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14d0fe0:	00 
     14d0fe1:	4c 89 ff             	mov    rdi,r15
     14d0fe4:	e8 71 ac 5e ff       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>
     14d0fe9:	4c 8b 6c 24 40       	mov    r13,QWORD PTR [rsp+0x40]
     14d0fee:	48 8b bc 24 a8 03 00 	mov    rdi,QWORD PTR [rsp+0x3a8]
     14d0ff5:	00 
     14d0ff6:	e8 8b d4 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d0ffb:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d1002:	00 
     14d1003:	e8 e0 97 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1008:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d100d:	48 8d b8 b0 00 00 00 	lea    rdi,[rax+0xb0]
     14d1014:	48 8d 9c 24 a0 01 00 	lea    rbx,[rsp+0x1a0]
     14d101b:	00 
     14d101c:	48 83 23 00          	and    QWORD PTR [rbx],0x0
     14d1020:	4c 89 e6             	mov    rsi,r12
     14d1023:	e8 ca ca ff ff       	call   14cdaf2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313076>
     14d1028:	48 89 df             	mov    rdi,rbx

### 0x14d1092: call   17edf00 <_Znwm@plt>
     14d1063:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
     14d1067:	4d 8b 76 48          	mov    r14,QWORD PTR [r14+0x48]
     14d106b:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     14d106e:	48 8d 35 54 73 f6 fe 	lea    rsi,[rip+0xfffffffffef67354]        # 4383c9 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5de18>
     14d1075:	48 8d 0d 64 73 f6 fe 	lea    rcx,[rip+0xfffffffffef67364]        # 4383e0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5de2f>
     14d107c:	6a 19                	push   0x19
     14d107e:	41 58                	pop    r8
     14d1080:	48 89 da             	mov    rdx,rbx
     14d1083:	45 31 c9             	xor    r9d,r9d
     14d1086:	e8 ff 62 11 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
     14d108b:	89 c5                	mov    ebp,eax
     14d108d:	bf 28 01 00 00       	mov    edi,0x128
     14d1092:	e8 69 ce 31 00       	call   17edf00 <_Znwm@plt>
     14d1097:	49 89 c7             	mov    r15,rax
     14d109a:	66 0f ef c0          	pxor   xmm0,xmm0
     14d109e:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d10a3:	48 8d 05 3e 83 3a 00 	lea    rax,[rip+0x3a833e]        # 18793e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35ad0>
     14d10aa:	49 89 07             	mov    QWORD PTR [r15],rax
     14d10ad:	48 8d 05 64 85 3a 00 	lea    rax,[rip+0x3a8564]        # 1879618 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35d00>
     14d10b4:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     14d10b8:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]

### 0x14d11c8: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d119a:	4c 8b 70 10          	mov    r14,QWORD PTR [rax+0x10]
     14d119e:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d11a5:	00 
     14d11a6:	4d 89 20             	mov    QWORD PTR [r8],r12
     14d11a9:	48 8d 35 e1 be 5c ff 	lea    rsi,[rip+0xffffffffff5cbee1]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d11b0:	48 8d 0d 29 5d 00 00 	lea    rcx,[rip+0x5d29]        # 14d6ee0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31c464>
     14d11b7:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]
     14d11be:	00 
     14d11bf:	6a 08                	push   0x8
     14d11c1:	41 59                	pop    r9
     14d11c3:	4c 89 ef             	mov    rdi,r13
     14d11c6:	31 d2                	xor    edx,edx
     14d11c8:	e8 c7 95 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d11cd:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d11d0:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d11d7:	00 
     14d11d8:	4c 89 f6             	mov    rsi,r14
     14d11db:	4c 89 ea             	mov    rdx,r13
     14d11de:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14d11e1:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14d11e8:	00 

### 0x14d120a: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d11db:	4c 89 ea             	mov    rdx,r13
     14d11de:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14d11e1:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14d11e8:	00 
     14d11e9:	48 89 df             	mov    rdi,rbx
     14d11ec:	e8 69 aa 5e ff       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>
     14d11f1:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14d11f8:	00 
     14d11f9:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d11fd:	e8 84 d2 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d1202:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d1209:	00 
     14d120a:	e8 d9 95 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d120f:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     14d1214:	4c 8b 68 10          	mov    r13,QWORD PTR [rax+0x10]
     14d1218:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d121f:	00 
     14d1220:	4d 89 20             	mov    QWORD PTR [r8],r12
     14d1223:	48 8d 35 67 be 5c ff 	lea    rsi,[rip+0xffffffffff5cbe67]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d122a:	48 8d 0d c5 70 00 00 	lea    rcx,[rip+0x70c5]        # 14d82f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31d87a>
     14d1231:	48 8d ac 24 e0 02 00 	lea    rbp,[rsp+0x2e0]

### 0x14d1242: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d1214:	4c 8b 68 10          	mov    r13,QWORD PTR [rax+0x10]
     14d1218:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d121f:	00 
     14d1220:	4d 89 20             	mov    QWORD PTR [r8],r12
     14d1223:	48 8d 35 67 be 5c ff 	lea    rsi,[rip+0xffffffffff5cbe67]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d122a:	48 8d 0d c5 70 00 00 	lea    rcx,[rip+0x70c5]        # 14d82f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31d87a>
     14d1231:	48 8d ac 24 e0 02 00 	lea    rbp,[rsp+0x2e0]
     14d1238:	00 
     14d1239:	6a 08                	push   0x8
     14d123b:	41 59                	pop    r9
     14d123d:	48 89 ef             	mov    rdi,rbp
     14d1240:	31 d2                	xor    edx,edx
     14d1242:	e8 4d 95 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d1247:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     14d124b:	4c 89 f7             	mov    rdi,r14
     14d124e:	4c 89 ee             	mov    rsi,r13
     14d1251:	48 89 ea             	mov    rdx,rbp
     14d1254:	ff 50 30             	call   QWORD PTR [rax+0x30]
     14d1257:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14d125e:	00 
     14d125f:	48 89 df             	mov    rdi,rbx

### 0x14d1284: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1254:	ff 50 30             	call   QWORD PTR [rax+0x30]
     14d1257:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14d125e:	00 
     14d125f:	48 89 df             	mov    rdi,rbx
     14d1262:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
     14d1267:	e8 ee a9 5e ff       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>
     14d126c:	48 8b bc 24 a8 03 00 	mov    rdi,QWORD PTR [rsp+0x3a8]
     14d1273:	00 
     14d1274:	e8 0d d2 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d1279:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]
     14d1280:	00 
     14d1281:	4c 89 ef             	mov    rdi,r13
     14d1284:	e8 5f 95 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1289:	31 ff                	xor    edi,edi
     14d128b:	e8 8c d1 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d1290:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d1295:	4c 89 a0 90 00 00 00 	mov    QWORD PTR [rax+0x90],r12
     14d129c:	48 8b b8 98 00 00 00 	mov    rdi,QWORD PTR [rax+0x98]
     14d12a3:	4c 89 b8 98 00 00 00 	mov    QWORD PTR [rax+0x98],r15
     14d12aa:	e8 d7 d1 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d12af:	80 bc 24 88 00 00 00 	cmp    BYTE PTR [rsp+0x88],0x0

### 0x14d12c2: call   17edf00 <_Znwm@plt>
     14d1284:	e8 5f 95 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1289:	31 ff                	xor    edi,edi
     14d128b:	e8 8c d1 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d1290:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14d1295:	4c 89 a0 90 00 00 00 	mov    QWORD PTR [rax+0x90],r12
     14d129c:	48 8b b8 98 00 00 00 	mov    rdi,QWORD PTR [rax+0x98]
     14d12a3:	4c 89 b8 98 00 00 00 	mov    QWORD PTR [rax+0x98],r15
     14d12aa:	e8 d7 d1 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d12af:	80 bc 24 88 00 00 00 	cmp    BYTE PTR [rsp+0x88],0x0
     14d12b6:	00 
     14d12b7:	0f 84 d8 00 00 00    	je     14d1395 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x316919>
     14d12bd:	bf e8 00 00 00       	mov    edi,0xe8
     14d12c2:	e8 39 cc 31 00       	call   17edf00 <_Znwm@plt>
     14d12c7:	48 89 c3             	mov    rbx,rax
     14d12ca:	66 0f ef c0          	pxor   xmm0,xmm0
     14d12ce:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d12d3:	48 8d 05 a6 7f 3a 00 	lea    rax,[rip+0x3a7fa6]        # 1879280 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35968>
     14d12da:	48 89 03             	mov    QWORD PTR [rbx],rax
     14d12dd:	4c 8d 73 18          	lea    r14,[rbx+0x18]
     14d12e1:	31 c0                	xor    eax,eax
     14d12e3:	88 84 24 e0 02 00 00 	mov    BYTE PTR [rsp+0x2e0],al

### 0x14d139a: call   17edf00 <_Znwm@plt>
     14d1363:	e8 c8 59 5d ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     14d1368:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d136f:	00 
     14d1370:	e8 ed bc f8 ff       	call   145d062 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a25e6>
     14d1375:	66 48 0f 6e c3       	movq   xmm0,rbx
     14d137a:	66 49 0f 6e ce       	movq   xmm1,r14
     14d137f:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
     14d1383:	66 0f 7f 4c 24 50    	movdqa XMMWORD PTR [rsp+0x50],xmm1
     14d1389:	31 ff                	xor    edi,edi
     14d138b:	e8 8c d0 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d1390:	e9 d3 00 00 00       	jmp    14d1468 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3169ec>
     14d1395:	bf b8 00 00 00       	mov    edi,0xb8
     14d139a:	e8 61 cb 31 00       	call   17edf00 <_Znwm@plt>
     14d139f:	48 89 c3             	mov    rbx,rax
     14d13a2:	66 0f ef c0          	pxor   xmm0,xmm0
     14d13a6:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d13ab:	48 8d 05 ce 7e 3a 00 	lea    rax,[rip+0x3a7ece]        # 1879280 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35968>
     14d13b2:	48 89 03             	mov    QWORD PTR [rbx],rax
     14d13b5:	4c 8d 73 18          	lea    r14,[rbx+0x18]
     14d13b9:	31 c0                	xor    eax,eax
     14d13bb:	88 84 24 e0 02 00 00 	mov    BYTE PTR [rsp+0x2e0],al

### 0x14d1515: call   17edf00 <_Znwm@plt>
     14d14e9:	4c 89 b4 24 a8 03 00 	mov    QWORD PTR [rsp+0x3a8],r14
     14d14f0:	00 
     14d14f1:	66 0f ef c0          	pxor   xmm0,xmm0
     14d14f5:	66 0f 7f 84 24 b0 02 	movdqa XMMWORD PTR [rsp+0x2b0],xmm0
     14d14fc:	00 00 
     14d14fe:	4c 89 bc 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],r15
     14d1505:	00 
     14d1506:	4c 89 a4 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],r12
     14d150d:	00 
     14d150e:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
     14d1512:	6a 28                	push   0x28
     14d1514:	5f                   	pop    rdi
     14d1515:	e8 e6 c9 31 00       	call   17edf00 <_Znwm@plt>
     14d151a:	48 8d 8c 24 b0 03 00 	lea    rcx,[rsp+0x3b0]
     14d1521:	00 
     14d1522:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     14d1527:	48 8d be 30 01 00 00 	lea    rdi,[rsi+0x130]
     14d152e:	48 8d 15 eb 7e 3a 00 	lea    rdx,[rip+0x3a7eeb]        # 1879420 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35b08>
     14d1535:	48 89 10             	mov    QWORD PTR [rax],rdx
     14d1538:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
     14d153c:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14

### 0x14d164a: call   17edf00 <_Znwm@plt>
     14d1616:	88 84 24 28 01 00 00 	mov    BYTE PTR [rsp+0x128],al
     14d161d:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]
     14d1622:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     14d1625:	48 8d 35 7d 6f f6 fe 	lea    rsi,[rip+0xfffffffffef66f7d]        # 4385a9 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5dff8>
     14d162c:	48 8d 0d 8d 6f f6 fe 	lea    rcx,[rip+0xfffffffffef66f8d]        # 4385c0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e00f>
     14d1633:	6a 23                	push   0x23
     14d1635:	41 58                	pop    r8
     14d1637:	4c 89 fa             	mov    rdx,r15
     14d163a:	45 31 c9             	xor    r9d,r9d
     14d163d:	e8 48 5d 11 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
     14d1642:	41 89 c7             	mov    r15d,eax
     14d1645:	bf a0 01 00 00       	mov    edi,0x1a0
     14d164a:	e8 b1 c8 31 00       	call   17edf00 <_Znwm@plt>
     14d164f:	48 89 c3             	mov    rbx,rax
     14d1652:	66 0f ef c0          	pxor   xmm0,xmm0
     14d1656:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d165b:	48 8d 05 0e 51 36 00 	lea    rax,[rip+0x36510e]        # 1836770 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8708>
     14d1662:	48 89 03             	mov    QWORD PTR [rbx],rax
     14d1665:	48 8d 05 cc 74 37 00 	lea    rax,[rip+0x3774cc]        # 1848b38 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5220>
     14d166c:	48 89 84 24 b0 02 00 	mov    QWORD PTR [rsp+0x2b0],rax
     14d1673:	00 

### 0x14d1917: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d18ea:	48 8d 84 24 30 02 00 	lea    rax,[rsp+0x230]
     14d18f1:	00 
     14d18f2:	48 89 28             	mov    QWORD PTR [rax],rbp
     14d18f5:	49 89 c0             	mov    r8,rax
     14d18f8:	48 8d 35 92 b7 5c ff 	lea    rsi,[rip+0xffffffffff5cb792]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d18ff:	48 8d 0d 9e 52 03 00 	lea    rcx,[rip+0x3529e]        # 1506ba4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34c128>
     14d1906:	4c 8d bc 24 a0 03 00 	lea    r15,[rsp+0x3a0]
     14d190d:	00 
     14d190e:	6a 08                	push   0x8
     14d1910:	41 59                	pop    r9
     14d1912:	4c 89 ff             	mov    rdi,r15
     14d1915:	31 d2                	xor    edx,edx
     14d1917:	e8 78 8e 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d191c:	4c 8d a4 24 e0 02 00 	lea    r12,[rsp+0x2e0]
     14d1923:	00 
     14d1924:	4c 89 e7             	mov    rdi,r12
     14d1927:	4c 89 fe             	mov    rsi,r15
     14d192a:	e8 0b 8e 30 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
     14d192f:	48 8d 9c 24 80 03 00 	lea    rbx,[rsp+0x380]
     14d1936:	00 
     14d1937:	48 89 df             	mov    rdi,rbx

### 0x14d1948: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d191c:	4c 8d a4 24 e0 02 00 	lea    r12,[rsp+0x2e0]
     14d1923:	00 
     14d1924:	4c 89 e7             	mov    rdi,r12
     14d1927:	4c 89 fe             	mov    rsi,r15
     14d192a:	e8 0b 8e 30 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
     14d192f:	48 8d 9c 24 80 03 00 	lea    rbx,[rsp+0x380]
     14d1936:	00 
     14d1937:	48 89 df             	mov    rdi,rbx
     14d193a:	4c 89 ee             	mov    rsi,r13
     14d193d:	4c 89 e2             	mov    rdx,r12
     14d1940:	e8 85 86 30 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
     14d1945:	4c 89 e7             	mov    rdi,r12
     14d1948:	e8 9b 8e 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d194d:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     14d1952:	48 89 de             	mov    rsi,rbx
     14d1955:	e8 98 82 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d195a:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d195e:	e8 23 cb 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d1963:	4c 89 ff             	mov    rdi,r15
     14d1966:	e8 7d 8e 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d196b:	49 8b 5e 60          	mov    rbx,QWORD PTR [r14+0x60]

### 0x14d1955: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d1927:	4c 89 fe             	mov    rsi,r15
     14d192a:	e8 0b 8e 30 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
     14d192f:	48 8d 9c 24 80 03 00 	lea    rbx,[rsp+0x380]
     14d1936:	00 
     14d1937:	48 89 df             	mov    rdi,rbx
     14d193a:	4c 89 ee             	mov    rsi,r13
     14d193d:	4c 89 e2             	mov    rdx,r12
     14d1940:	e8 85 86 30 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
     14d1945:	4c 89 e7             	mov    rdi,r12
     14d1948:	e8 9b 8e 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d194d:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     14d1952:	48 89 de             	mov    rsi,rbx
     14d1955:	e8 98 82 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d195a:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d195e:	e8 23 cb 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d1963:	4c 89 ff             	mov    rdi,r15
     14d1966:	e8 7d 8e 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d196b:	49 8b 5e 60          	mov    rbx,QWORD PTR [r14+0x60]
     14d196f:	48 8d 84 24 30 02 00 	lea    rax,[rsp+0x230]
     14d1976:	00 
     14d1977:	48 89 28             	mov    QWORD PTR [rax],rbp

### 0x14d1966: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1937:	48 89 df             	mov    rdi,rbx
     14d193a:	4c 89 ee             	mov    rsi,r13
     14d193d:	4c 89 e2             	mov    rdx,r12
     14d1940:	e8 85 86 30 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
     14d1945:	4c 89 e7             	mov    rdi,r12
     14d1948:	e8 9b 8e 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d194d:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     14d1952:	48 89 de             	mov    rsi,rbx
     14d1955:	e8 98 82 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d195a:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d195e:	e8 23 cb 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d1963:	4c 89 ff             	mov    rdi,r15
     14d1966:	e8 7d 8e 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d196b:	49 8b 5e 60          	mov    rbx,QWORD PTR [r14+0x60]
     14d196f:	48 8d 84 24 30 02 00 	lea    rax,[rsp+0x230]
     14d1976:	00 
     14d1977:	48 89 28             	mov    QWORD PTR [rax],rbp
     14d197a:	48 8d 0d 33 52 03 00 	lea    rcx,[rip+0x35233]        # 1506bb4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34c138>
     14d1981:	4c 8d bc 24 a0 03 00 	lea    r15,[rsp+0x3a0]
     14d1988:	00 
     14d1989:	4c 8d 84 24 30 02 00 	lea    r8,[rsp+0x230]

### 0x14d19a1: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d1976:	00 
     14d1977:	48 89 28             	mov    QWORD PTR [rax],rbp
     14d197a:	48 8d 0d 33 52 03 00 	lea    rcx,[rip+0x35233]        # 1506bb4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34c138>
     14d1981:	4c 8d bc 24 a0 03 00 	lea    r15,[rsp+0x3a0]
     14d1988:	00 
     14d1989:	4c 8d 84 24 30 02 00 	lea    r8,[rsp+0x230]
     14d1990:	00 
     14d1991:	4c 89 ff             	mov    rdi,r15
     14d1994:	48 8d 35 f6 b6 5c ff 	lea    rsi,[rip+0xffffffffff5cb6f6]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d199b:	31 d2                	xor    edx,edx
     14d199d:	6a 08                	push   0x8
     14d199f:	41 59                	pop    r9
     14d19a1:	e8 ee 8d 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d19a6:	48 83 c3 58          	add    rbx,0x58
     14d19aa:	4c 8d a4 24 e0 02 00 	lea    r12,[rsp+0x2e0]
     14d19b1:	00 
     14d19b2:	4c 89 e7             	mov    rdi,r12
     14d19b5:	4c 89 fe             	mov    rsi,r15
     14d19b8:	e8 7d 8d 30 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
     14d19bd:	4c 8d ac 24 80 03 00 	lea    r13,[rsp+0x380]
     14d19c4:	00 

### 0x14d19d6: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d19aa:	4c 8d a4 24 e0 02 00 	lea    r12,[rsp+0x2e0]
     14d19b1:	00 
     14d19b2:	4c 89 e7             	mov    rdi,r12
     14d19b5:	4c 89 fe             	mov    rsi,r15
     14d19b8:	e8 7d 8d 30 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
     14d19bd:	4c 8d ac 24 80 03 00 	lea    r13,[rsp+0x380]
     14d19c4:	00 
     14d19c5:	4c 89 ef             	mov    rdi,r13
     14d19c8:	48 89 de             	mov    rsi,rbx
     14d19cb:	4c 89 e2             	mov    rdx,r12
     14d19ce:	e8 f7 85 30 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
     14d19d3:	4c 89 e7             	mov    rdi,r12
     14d19d6:	e8 0d 8e 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d19db:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
     14d19e2:	00 
     14d19e3:	4c 89 ee             	mov    rsi,r13
     14d19e6:	e8 07 82 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d19eb:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     14d19ef:	e8 92 ca 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d19f4:	4c 89 ff             	mov    rdi,r15
     14d19f7:	e8 ec 8d 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>

### 0x14d19e6: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d19b8:	e8 7d 8d 30 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
     14d19bd:	4c 8d ac 24 80 03 00 	lea    r13,[rsp+0x380]
     14d19c4:	00 
     14d19c5:	4c 89 ef             	mov    rdi,r13
     14d19c8:	48 89 de             	mov    rsi,rbx
     14d19cb:	4c 89 e2             	mov    rdx,r12
     14d19ce:	e8 f7 85 30 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
     14d19d3:	4c 89 e7             	mov    rdi,r12
     14d19d6:	e8 0d 8e 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d19db:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
     14d19e2:	00 
     14d19e3:	4c 89 ee             	mov    rsi,r13
     14d19e6:	e8 07 82 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d19eb:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     14d19ef:	e8 92 ca 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d19f4:	4c 89 ff             	mov    rdi,r15
     14d19f7:	e8 ec 8d 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d19fc:	bb b0 00 00 00       	mov    ebx,0xb0
     14d1a01:	49 03 5e 60          	add    rbx,QWORD PTR [r14+0x60]
     14d1a05:	48 8d 84 24 30 02 00 	lea    rax,[rsp+0x230]
     14d1a0c:	00 

### 0x14d19f7: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d19c8:	48 89 de             	mov    rsi,rbx
     14d19cb:	4c 89 e2             	mov    rdx,r12
     14d19ce:	e8 f7 85 30 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
     14d19d3:	4c 89 e7             	mov    rdi,r12
     14d19d6:	e8 0d 8e 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d19db:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
     14d19e2:	00 
     14d19e3:	4c 89 ee             	mov    rsi,r13
     14d19e6:	e8 07 82 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d19eb:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     14d19ef:	e8 92 ca 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d19f4:	4c 89 ff             	mov    rdi,r15
     14d19f7:	e8 ec 8d 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d19fc:	bb b0 00 00 00       	mov    ebx,0xb0
     14d1a01:	49 03 5e 60          	add    rbx,QWORD PTR [r14+0x60]
     14d1a05:	48 8d 84 24 30 02 00 	lea    rax,[rsp+0x230]
     14d1a0c:	00 
     14d1a0d:	48 89 28             	mov    QWORD PTR [rax],rbp
     14d1a10:	48 8d 0d ab 51 03 00 	lea    rcx,[rip+0x351ab]        # 1506bc2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34c146>
     14d1a17:	4c 8d bc 24 a0 03 00 	lea    r15,[rsp+0x3a0]
     14d1a1e:	00 

### 0x14d1a37: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d1a0c:	00 
     14d1a0d:	48 89 28             	mov    QWORD PTR [rax],rbp
     14d1a10:	48 8d 0d ab 51 03 00 	lea    rcx,[rip+0x351ab]        # 1506bc2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34c146>
     14d1a17:	4c 8d bc 24 a0 03 00 	lea    r15,[rsp+0x3a0]
     14d1a1e:	00 
     14d1a1f:	4c 8d 84 24 30 02 00 	lea    r8,[rsp+0x230]
     14d1a26:	00 
     14d1a27:	4c 89 ff             	mov    rdi,r15
     14d1a2a:	48 8d 35 60 b6 5c ff 	lea    rsi,[rip+0xffffffffff5cb660]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d1a31:	31 d2                	xor    edx,edx
     14d1a33:	6a 08                	push   0x8
     14d1a35:	41 59                	pop    r9
     14d1a37:	e8 58 8d 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d1a3c:	4c 8d a4 24 e0 02 00 	lea    r12,[rsp+0x2e0]
     14d1a43:	00 
     14d1a44:	4c 89 e7             	mov    rdi,r12
     14d1a47:	4c 89 fe             	mov    rsi,r15
     14d1a4a:	e8 eb 8c 30 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
     14d1a4f:	4c 8d ac 24 80 03 00 	lea    r13,[rsp+0x380]
     14d1a56:	00 
     14d1a57:	4c 89 ef             	mov    rdi,r13

### 0x14d1a68: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1a3c:	4c 8d a4 24 e0 02 00 	lea    r12,[rsp+0x2e0]
     14d1a43:	00 
     14d1a44:	4c 89 e7             	mov    rdi,r12
     14d1a47:	4c 89 fe             	mov    rsi,r15
     14d1a4a:	e8 eb 8c 30 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
     14d1a4f:	4c 8d ac 24 80 03 00 	lea    r13,[rsp+0x380]
     14d1a56:	00 
     14d1a57:	4c 89 ef             	mov    rdi,r13
     14d1a5a:	48 89 de             	mov    rsi,rbx
     14d1a5d:	4c 89 e2             	mov    rdx,r12
     14d1a60:	e8 65 85 30 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
     14d1a65:	4c 89 e7             	mov    rdi,r12
     14d1a68:	e8 7b 8d 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1a6d:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
     14d1a74:	00 
     14d1a75:	4c 89 ee             	mov    rsi,r13
     14d1a78:	e8 75 81 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d1a7d:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     14d1a81:	e8 00 ca 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d1a86:	4c 89 ff             	mov    rdi,r15
     14d1a89:	e8 5a 8d 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>

### 0x14d1a78: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d1a4a:	e8 eb 8c 30 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
     14d1a4f:	4c 8d ac 24 80 03 00 	lea    r13,[rsp+0x380]
     14d1a56:	00 
     14d1a57:	4c 89 ef             	mov    rdi,r13
     14d1a5a:	48 89 de             	mov    rsi,rbx
     14d1a5d:	4c 89 e2             	mov    rdx,r12
     14d1a60:	e8 65 85 30 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
     14d1a65:	4c 89 e7             	mov    rdi,r12
     14d1a68:	e8 7b 8d 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1a6d:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
     14d1a74:	00 
     14d1a75:	4c 89 ee             	mov    rsi,r13
     14d1a78:	e8 75 81 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d1a7d:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     14d1a81:	e8 00 ca 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d1a86:	4c 89 ff             	mov    rdi,r15
     14d1a89:	e8 5a 8d 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1a8e:	49 8b 9e 90 00 00 00 	mov    rbx,QWORD PTR [r14+0x90]
     14d1a95:	48 8d 84 24 30 02 00 	lea    rax,[rsp+0x230]
     14d1a9c:	00 
     14d1a9d:	48 89 28             	mov    QWORD PTR [rax],rbp

### 0x14d1a89: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1a5a:	48 89 de             	mov    rsi,rbx
     14d1a5d:	4c 89 e2             	mov    rdx,r12
     14d1a60:	e8 65 85 30 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
     14d1a65:	4c 89 e7             	mov    rdi,r12
     14d1a68:	e8 7b 8d 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1a6d:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
     14d1a74:	00 
     14d1a75:	4c 89 ee             	mov    rsi,r13
     14d1a78:	e8 75 81 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d1a7d:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     14d1a81:	e8 00 ca 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d1a86:	4c 89 ff             	mov    rdi,r15
     14d1a89:	e8 5a 8d 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1a8e:	49 8b 9e 90 00 00 00 	mov    rbx,QWORD PTR [r14+0x90]
     14d1a95:	48 8d 84 24 30 02 00 	lea    rax,[rsp+0x230]
     14d1a9c:	00 
     14d1a9d:	48 89 28             	mov    QWORD PTR [rax],rbp
     14d1aa0:	48 8d 0d 35 51 03 00 	lea    rcx,[rip+0x35135]        # 1506bdc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34c160>
     14d1aa7:	4c 8d bc 24 a0 03 00 	lea    r15,[rsp+0x3a0]
     14d1aae:	00 
     14d1aaf:	4c 8d 84 24 30 02 00 	lea    r8,[rsp+0x230]

### 0x14d1ac7: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d1a9c:	00 
     14d1a9d:	48 89 28             	mov    QWORD PTR [rax],rbp
     14d1aa0:	48 8d 0d 35 51 03 00 	lea    rcx,[rip+0x35135]        # 1506bdc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34c160>
     14d1aa7:	4c 8d bc 24 a0 03 00 	lea    r15,[rsp+0x3a0]
     14d1aae:	00 
     14d1aaf:	4c 8d 84 24 30 02 00 	lea    r8,[rsp+0x230]
     14d1ab6:	00 
     14d1ab7:	4c 89 ff             	mov    rdi,r15
     14d1aba:	48 8d 35 d0 b5 5c ff 	lea    rsi,[rip+0xffffffffff5cb5d0]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d1ac1:	31 d2                	xor    edx,edx
     14d1ac3:	6a 08                	push   0x8
     14d1ac5:	41 59                	pop    r9
     14d1ac7:	e8 c8 8c 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d1acc:	4c 8d a4 24 e0 02 00 	lea    r12,[rsp+0x2e0]
     14d1ad3:	00 
     14d1ad4:	4c 89 e7             	mov    rdi,r12
     14d1ad7:	4c 89 fe             	mov    rsi,r15
     14d1ada:	e8 5b 8c 30 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
     14d1adf:	4c 8d ac 24 80 03 00 	lea    r13,[rsp+0x380]
     14d1ae6:	00 
     14d1ae7:	4c 89 ef             	mov    rdi,r13

### 0x14d1af8: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1acc:	4c 8d a4 24 e0 02 00 	lea    r12,[rsp+0x2e0]
     14d1ad3:	00 
     14d1ad4:	4c 89 e7             	mov    rdi,r12
     14d1ad7:	4c 89 fe             	mov    rsi,r15
     14d1ada:	e8 5b 8c 30 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
     14d1adf:	4c 8d ac 24 80 03 00 	lea    r13,[rsp+0x380]
     14d1ae6:	00 
     14d1ae7:	4c 89 ef             	mov    rdi,r13
     14d1aea:	48 89 de             	mov    rsi,rbx
     14d1aed:	4c 89 e2             	mov    rdx,r12
     14d1af0:	e8 d5 84 30 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
     14d1af5:	4c 89 e7             	mov    rdi,r12
     14d1af8:	e8 eb 8c 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1afd:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
     14d1b04:	00 
     14d1b05:	4c 89 ee             	mov    rsi,r13
     14d1b08:	e8 e5 80 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d1b0d:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     14d1b11:	e8 70 c9 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d1b16:	4c 89 ff             	mov    rdi,r15
     14d1b19:	e8 ca 8c 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>

### 0x14d1b08: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d1ada:	e8 5b 8c 30 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
     14d1adf:	4c 8d ac 24 80 03 00 	lea    r13,[rsp+0x380]
     14d1ae6:	00 
     14d1ae7:	4c 89 ef             	mov    rdi,r13
     14d1aea:	48 89 de             	mov    rsi,rbx
     14d1aed:	4c 89 e2             	mov    rdx,r12
     14d1af0:	e8 d5 84 30 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
     14d1af5:	4c 89 e7             	mov    rdi,r12
     14d1af8:	e8 eb 8c 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1afd:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
     14d1b04:	00 
     14d1b05:	4c 89 ee             	mov    rsi,r13
     14d1b08:	e8 e5 80 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d1b0d:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     14d1b11:	e8 70 c9 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d1b16:	4c 89 ff             	mov    rdi,r15
     14d1b19:	e8 ca 8c 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1b1e:	bb 08 01 00 00       	mov    ebx,0x108
     14d1b23:	4d 89 f5             	mov    r13,r14
     14d1b26:	49 03 5e 60          	add    rbx,QWORD PTR [r14+0x60]
     14d1b2a:	48 8d 84 24 30 02 00 	lea    rax,[rsp+0x230]

### 0x14d1b19: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1aea:	48 89 de             	mov    rsi,rbx
     14d1aed:	4c 89 e2             	mov    rdx,r12
     14d1af0:	e8 d5 84 30 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
     14d1af5:	4c 89 e7             	mov    rdi,r12
     14d1af8:	e8 eb 8c 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1afd:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
     14d1b04:	00 
     14d1b05:	4c 89 ee             	mov    rsi,r13
     14d1b08:	e8 e5 80 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d1b0d:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     14d1b11:	e8 70 c9 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d1b16:	4c 89 ff             	mov    rdi,r15
     14d1b19:	e8 ca 8c 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1b1e:	bb 08 01 00 00       	mov    ebx,0x108
     14d1b23:	4d 89 f5             	mov    r13,r14
     14d1b26:	49 03 5e 60          	add    rbx,QWORD PTR [r14+0x60]
     14d1b2a:	48 8d 84 24 30 02 00 	lea    rax,[rsp+0x230]
     14d1b31:	00 
     14d1b32:	48 89 28             	mov    QWORD PTR [rax],rbp
     14d1b35:	48 8d 0d f0 50 03 00 	lea    rcx,[rip+0x350f0]        # 1506c2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34c1b0>
     14d1b3c:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]

### 0x14d1b5c: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d1b31:	00 
     14d1b32:	48 89 28             	mov    QWORD PTR [rax],rbp
     14d1b35:	48 8d 0d f0 50 03 00 	lea    rcx,[rip+0x350f0]        # 1506c2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34c1b0>
     14d1b3c:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14d1b43:	00 
     14d1b44:	4c 8d 84 24 30 02 00 	lea    r8,[rsp+0x230]
     14d1b4b:	00 
     14d1b4c:	4c 89 f7             	mov    rdi,r14
     14d1b4f:	48 8d 35 3b b5 5c ff 	lea    rsi,[rip+0xffffffffff5cb53b]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d1b56:	31 d2                	xor    edx,edx
     14d1b58:	6a 08                	push   0x8
     14d1b5a:	41 59                	pop    r9
     14d1b5c:	e8 33 8c 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d1b61:	4c 8d bc 24 e0 02 00 	lea    r15,[rsp+0x2e0]
     14d1b68:	00 
     14d1b69:	4c 89 ff             	mov    rdi,r15
     14d1b6c:	4c 89 f6             	mov    rsi,r14
     14d1b6f:	e8 c6 8b 30 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
     14d1b74:	4c 8d a4 24 80 03 00 	lea    r12,[rsp+0x380]
     14d1b7b:	00 
     14d1b7c:	4c 89 e7             	mov    rdi,r12

### 0x14d1b8d: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1b61:	4c 8d bc 24 e0 02 00 	lea    r15,[rsp+0x2e0]
     14d1b68:	00 
     14d1b69:	4c 89 ff             	mov    rdi,r15
     14d1b6c:	4c 89 f6             	mov    rsi,r14
     14d1b6f:	e8 c6 8b 30 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
     14d1b74:	4c 8d a4 24 80 03 00 	lea    r12,[rsp+0x380]
     14d1b7b:	00 
     14d1b7c:	4c 89 e7             	mov    rdi,r12
     14d1b7f:	48 89 de             	mov    rsi,rbx
     14d1b82:	4c 89 fa             	mov    rdx,r15
     14d1b85:	e8 40 84 30 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
     14d1b8a:	4c 89 ff             	mov    rdi,r15
     14d1b8d:	e8 56 8c 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1b92:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
     14d1b99:	00 
     14d1b9a:	4c 89 e6             	mov    rsi,r12
     14d1b9d:	e8 50 80 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d1ba2:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     14d1ba7:	e8 da c8 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d1bac:	4c 89 f7             	mov    rdi,r14
     14d1baf:	e8 34 8c 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>

### 0x14d1b9d: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d1b6f:	e8 c6 8b 30 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
     14d1b74:	4c 8d a4 24 80 03 00 	lea    r12,[rsp+0x380]
     14d1b7b:	00 
     14d1b7c:	4c 89 e7             	mov    rdi,r12
     14d1b7f:	48 89 de             	mov    rsi,rbx
     14d1b82:	4c 89 fa             	mov    rdx,r15
     14d1b85:	e8 40 84 30 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
     14d1b8a:	4c 89 ff             	mov    rdi,r15
     14d1b8d:	e8 56 8c 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1b92:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
     14d1b99:	00 
     14d1b9a:	4c 89 e6             	mov    rsi,r12
     14d1b9d:	e8 50 80 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d1ba2:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     14d1ba7:	e8 da c8 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d1bac:	4c 89 f7             	mov    rdi,r14
     14d1baf:	e8 34 8c 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1bb4:	49 8b 5d 60          	mov    rbx,QWORD PTR [r13+0x60]
     14d1bb8:	49 89 2c 24          	mov    QWORD PTR [r12],rbp
     14d1bbc:	48 8d 0d 03 51 03 00 	lea    rcx,[rip+0x35103]        # 1506cc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34c24a>
     14d1bc3:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]

### 0x14d1baf: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1b7f:	48 89 de             	mov    rsi,rbx
     14d1b82:	4c 89 fa             	mov    rdx,r15
     14d1b85:	e8 40 84 30 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
     14d1b8a:	4c 89 ff             	mov    rdi,r15
     14d1b8d:	e8 56 8c 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1b92:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
     14d1b99:	00 
     14d1b9a:	4c 89 e6             	mov    rsi,r12
     14d1b9d:	e8 50 80 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d1ba2:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     14d1ba7:	e8 da c8 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d1bac:	4c 89 f7             	mov    rdi,r14
     14d1baf:	e8 34 8c 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1bb4:	49 8b 5d 60          	mov    rbx,QWORD PTR [r13+0x60]
     14d1bb8:	49 89 2c 24          	mov    QWORD PTR [r12],rbp
     14d1bbc:	48 8d 0d 03 51 03 00 	lea    rcx,[rip+0x35103]        # 1506cc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34c24a>
     14d1bc3:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d1bca:	00 
     14d1bcb:	4c 8d 84 24 80 03 00 	lea    r8,[rsp+0x380]
     14d1bd2:	00 
     14d1bd3:	4c 89 f7             	mov    rdi,r14

### 0x14d1be3: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d1bb4:	49 8b 5d 60          	mov    rbx,QWORD PTR [r13+0x60]
     14d1bb8:	49 89 2c 24          	mov    QWORD PTR [r12],rbp
     14d1bbc:	48 8d 0d 03 51 03 00 	lea    rcx,[rip+0x35103]        # 1506cc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34c24a>
     14d1bc3:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d1bca:	00 
     14d1bcb:	4c 8d 84 24 80 03 00 	lea    r8,[rsp+0x380]
     14d1bd2:	00 
     14d1bd3:	4c 89 f7             	mov    rdi,r14
     14d1bd6:	48 8d 35 b4 b4 5c ff 	lea    rsi,[rip+0xffffffffff5cb4b4]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
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

### 0x14d1bf9: call   14edb10 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333094>
     14d1bd2:	00 
     14d1bd3:	4c 89 f7             	mov    rdi,r14
     14d1bd6:	48 8d 35 b4 b4 5c ff 	lea    rsi,[rip+0xffffffffff5cb4b4]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
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

### 0x14d1c09: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
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

### 0x14d1c1d: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
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

### 0x14d1c5f: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
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

### 0x14d1cc5: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
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
     14d1cda:	00 
     14d1cdb:	e8 8a 82 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14d1ce0:	49 8b 5e 70          	mov    rbx,QWORD PTR [r14+0x70]
     14d1ce4:	4c 8d 84 24 80 03 00 	lea    r8,[rsp+0x380]
     14d1ceb:	00 

### 0x14d1d0e: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d1ce0:	49 8b 5e 70          	mov    rbx,QWORD PTR [r14+0x70]
     14d1ce4:	4c 8d 84 24 80 03 00 	lea    r8,[rsp+0x380]
     14d1ceb:	00 
     14d1cec:	49 89 28             	mov    QWORD PTR [r8],rbp
     14d1cef:	48 8d 35 9b b3 5c ff 	lea    rsi,[rip+0xffffffffff5cb39b]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d1cf6:	48 8d 0d d1 4f 03 00 	lea    rcx,[rip+0x34fd1]        # 1506cce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34c252>
     14d1cfd:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d1d04:	00 
     14d1d05:	6a 08                	push   0x8
     14d1d07:	41 59                	pop    r9
     14d1d09:	4c 89 f7             	mov    rdi,r14
     14d1d0c:	31 d2                	xor    edx,edx
     14d1d0e:	e8 81 8a 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d1d13:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d1d16:	48 8d 15 33 74 f6 fe 	lea    rdx,[rip+0xfffffffffef67433]        # 439150 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb9f>
     14d1d1d:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d1d24:	00 
     14d1d25:	48 89 de             	mov    rsi,rbx
     14d1d28:	4c 89 f1             	mov    rcx,r14
     14d1d2b:	ff 50 48             	call   QWORD PTR [rax+0x48]
     14d1d2e:	4c 8b 6c 24 40       	mov    r13,QWORD PTR [rsp+0x40]

### 0x14d1d46: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d1d16:	48 8d 15 33 74 f6 fe 	lea    rdx,[rip+0xfffffffffef67433]        # 439150 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb9f>
     14d1d1d:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d1d24:	00 
     14d1d25:	48 89 de             	mov    rsi,rbx
     14d1d28:	4c 89 f1             	mov    rcx,r14
     14d1d2b:	ff 50 48             	call   QWORD PTR [rax+0x48]
     14d1d2e:	4c 8b 6c 24 40       	mov    r13,QWORD PTR [rsp+0x40]
     14d1d33:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d1d3a:	00 
     14d1d3b:	48 8b bc 24 20 01 00 	mov    rdi,QWORD PTR [rsp+0x120]
     14d1d42:	00 
     14d1d43:	48 89 de             	mov    rsi,rbx
     14d1d46:	e8 a7 7e 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d1d4b:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d1d4f:	e8 32 c7 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d1d54:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d1d5b:	00 
     14d1d5c:	e8 87 8a 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1d61:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14d1d68:	00 
     14d1d69:	e8 fc 81 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### 0x14d1d5c: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1d2b:	ff 50 48             	call   QWORD PTR [rax+0x48]
     14d1d2e:	4c 8b 6c 24 40       	mov    r13,QWORD PTR [rsp+0x40]
     14d1d33:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d1d3a:	00 
     14d1d3b:	48 8b bc 24 20 01 00 	mov    rdi,QWORD PTR [rsp+0x120]
     14d1d42:	00 
     14d1d43:	48 89 de             	mov    rsi,rbx
     14d1d46:	e8 a7 7e 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d1d4b:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d1d4f:	e8 32 c7 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d1d54:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d1d5b:	00 
     14d1d5c:	e8 87 8a 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d1d61:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14d1d68:	00 
     14d1d69:	e8 fc 81 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14d1d6e:	31 ff                	xor    edi,edi
     14d1d70:	e8 a7 c6 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d1d75:	49 8b 74 24 60       	mov    rsi,QWORD PTR [r12+0x60]
     14d1d7a:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     14d1d81:	00 

### 0x14d1e0b: call   17edf00 <_Znwm@plt>
     14d1ddb:	88 44 24 50          	mov    BYTE PTR [rsp+0x50],al
     14d1ddf:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]
     14d1de4:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     14d1de7:	48 8d 35 26 68 f6 fe 	lea    rsi,[rip+0xfffffffffef66826]        # 438614 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e063>
     14d1dee:	48 8d 0d 2b 68 f6 fe 	lea    rcx,[rip+0xfffffffffef6682b]        # 438620 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e06f>
     14d1df5:	6a 20                	push   0x20
     14d1df7:	41 58                	pop    r8
     14d1df9:	48 89 da             	mov    rdx,rbx
     14d1dfc:	45 31 c9             	xor    r9d,r9d
     14d1dff:	e8 86 55 11 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
     14d1e04:	89 c3                	mov    ebx,eax
     14d1e06:	bf 00 02 00 00       	mov    edi,0x200
     14d1e0b:	e8 f0 c0 31 00       	call   17edf00 <_Znwm@plt>
     14d1e10:	49 89 c4             	mov    r12,rax
     14d1e13:	66 0f ef c0          	pxor   xmm0,xmm0
     14d1e17:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d1e1c:	48 8d 05 a5 8f 33 00 	lea    rax,[rip+0x338fa5]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
     14d1e23:	49 89 04 24          	mov    QWORD PTR [r12],rax
     14d1e27:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d1e2e:	00 
     14d1e2f:	48 8d b4 24 50 02 00 	lea    rsi,[rsp+0x250]

### 0x14d2122: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d20f3:	4d 8b 74 24 48       	mov    r14,QWORD PTR [r12+0x48]
     14d20f8:	4c 8d 84 24 10 02 00 	lea    r8,[rsp+0x210]
     14d20ff:	00 
     14d2100:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d2103:	48 8d 35 87 af 5c ff 	lea    rsi,[rip+0xffffffffff5caf87]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d210a:	48 8d 0d 1b 24 02 00 	lea    rcx,[rip+0x2241b]        # 14f452c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x339ab0>
     14d2111:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]
     14d2118:	00 
     14d2119:	6a 08                	push   0x8
     14d211b:	41 59                	pop    r9
     14d211d:	4c 89 ef             	mov    rdi,r13
     14d2120:	31 d2                	xor    edx,edx
     14d2122:	e8 6d 86 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2127:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d212a:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14d2131:	00 
     14d2132:	4c 89 f6             	mov    rsi,r14
     14d2135:	4c 89 ea             	mov    rdx,r13
     14d2138:	ff 50 38             	call   QWORD PTR [rax+0x38]
     14d213b:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14d2142:	00 

### 0x14d214b: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2120:	31 d2                	xor    edx,edx
     14d2122:	e8 6d 86 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2127:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d212a:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14d2131:	00 
     14d2132:	4c 89 f6             	mov    rsi,r14
     14d2135:	4c 89 ea             	mov    rdx,r13
     14d2138:	ff 50 38             	call   QWORD PTR [rax+0x38]
     14d213b:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14d2142:	00 
     14d2143:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
     14d2148:	4c 89 f6             	mov    rsi,r14
     14d214b:	e8 a2 7a 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2150:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d2154:	e8 2d c3 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2159:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d2160:	00 
     14d2161:	e8 82 86 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2166:	4c 8d 84 24 10 02 00 	lea    r8,[rsp+0x210]
     14d216d:	00 
     14d216e:	4d 89 38             	mov    QWORD PTR [r8],r15

### 0x14d2161: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2132:	4c 89 f6             	mov    rsi,r14
     14d2135:	4c 89 ea             	mov    rdx,r13
     14d2138:	ff 50 38             	call   QWORD PTR [rax+0x38]
     14d213b:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14d2142:	00 
     14d2143:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
     14d2148:	4c 89 f6             	mov    rsi,r14
     14d214b:	e8 a2 7a 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2150:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d2154:	e8 2d c3 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2159:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d2160:	00 
     14d2161:	e8 82 86 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2166:	4c 8d 84 24 10 02 00 	lea    r8,[rsp+0x210]
     14d216d:	00 
     14d216e:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d2171:	48 8d 35 19 af 5c ff 	lea    rsi,[rip+0xffffffffff5caf19]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d2178:	48 8d 0d 51 24 02 00 	lea    rcx,[rip+0x22451]        # 14f45d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x339b54>
     14d217f:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2186:	00 
     14d2187:	6a 08                	push   0x8

### 0x14d2190: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2161:	e8 82 86 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2166:	4c 8d 84 24 10 02 00 	lea    r8,[rsp+0x210]
     14d216d:	00 
     14d216e:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d2171:	48 8d 35 19 af 5c ff 	lea    rsi,[rip+0xffffffffff5caf19]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d2178:	48 8d 0d 51 24 02 00 	lea    rcx,[rip+0x22451]        # 14f45d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x339b54>
     14d217f:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2186:	00 
     14d2187:	6a 08                	push   0x8
     14d2189:	41 59                	pop    r9
     14d218b:	4c 89 f7             	mov    rdi,r14
     14d218e:	31 d2                	xor    edx,edx
     14d2190:	e8 ff 85 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2195:	66 0f 6f 84 24 10 01 	movdqa xmm0,XMMWORD PTR [rsp+0x110]
     14d219c:	00 00 
     14d219e:	66 48 0f 7e c6       	movq   rsi,xmm0
     14d21a3:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     14d21a6:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14d21ad:	00 
     14d21ae:	4c 89 f2             	mov    rdx,r14
     14d21b1:	ff 50 20             	call   QWORD PTR [rax+0x20]

### 0x14d21c2: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2195:	66 0f 6f 84 24 10 01 	movdqa xmm0,XMMWORD PTR [rsp+0x110]
     14d219c:	00 00 
     14d219e:	66 48 0f 7e c6       	movq   rsi,xmm0
     14d21a3:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     14d21a6:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14d21ad:	00 
     14d21ae:	4c 89 f2             	mov    rdx,r14
     14d21b1:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14d21b4:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14d21bb:	00 
     14d21bc:	48 89 df             	mov    rdi,rbx
     14d21bf:	4c 89 f6             	mov    rsi,r14
     14d21c2:	e8 2b 7a 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d21c7:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d21cb:	e8 b6 c2 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d21d0:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14d21d7:	00 
     14d21d8:	48 89 df             	mov    rdi,rbx
     14d21db:	e8 08 86 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d21e0:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d21e7:	00 

### 0x14d21db: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d21ae:	4c 89 f2             	mov    rdx,r14
     14d21b1:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14d21b4:	4c 8d b4 24 b0 02 00 	lea    r14,[rsp+0x2b0]
     14d21bb:	00 
     14d21bc:	48 89 df             	mov    rdi,rbx
     14d21bf:	4c 89 f6             	mov    rsi,r14
     14d21c2:	e8 2b 7a 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d21c7:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d21cb:	e8 b6 c2 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d21d0:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14d21d7:	00 
     14d21d8:	48 89 df             	mov    rdi,rbx
     14d21db:	e8 08 86 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d21e0:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d21e7:	00 
     14d21e8:	e8 7d 7d 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14d21ed:	4c 89 bc 24 80 03 00 	mov    QWORD PTR [rsp+0x380],r15
     14d21f4:	00 
     14d21f5:	4c 89 a4 24 88 03 00 	mov    QWORD PTR [rsp+0x388],r12
     14d21fc:	00 
     14d21fd:	49 8b 44 24 30       	mov    rax,QWORD PTR [r12+0x30]

### 0x14d2374: call   17edf00 <_Znwm@plt>
     14d2346:	89 c5                	mov    ebp,eax
     14d2348:	49 8b 45 40          	mov    rax,QWORD PTR [r13+0x40]
     14d234c:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     14d234f:	48 8d 35 d4 5f f6 fe 	lea    rsi,[rip+0xfffffffffef65fd4]        # 43832a <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5dd79>
     14d2356:	48 8d 0d e3 5f f6 fe 	lea    rcx,[rip+0xfffffffffef65fe3]        # 438340 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5dd8f>
     14d235d:	6a 1a                	push   0x1a
     14d235f:	41 58                	pop    r8
     14d2361:	4c 89 f2             	mov    rdx,r14
     14d2364:	45 31 c9             	xor    r9d,r9d
     14d2367:	e8 1e 50 11 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
     14d236c:	41 89 c6             	mov    r14d,eax
     14d236f:	bf c0 01 00 00       	mov    edi,0x1c0
     14d2374:	e8 87 bb 31 00       	call   17edf00 <_Znwm@plt>
     14d2379:	66 0f ef c0          	pxor   xmm0,xmm0
     14d237d:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d2382:	48 8d 0d 3f 8a 33 00 	lea    rcx,[rip+0x338a3f]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
     14d2389:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     14d238e:	48 89 08             	mov    QWORD PTR [rax],rcx
     14d2391:	66 41 0f 6f 84 24 80 	movdqa xmm0,XMMWORD PTR [r12+0x80]
     14d2398:	00 00 00 
     14d239b:	49 8b 84 24 88 00 00 	mov    rax,QWORD PTR [r12+0x88]

### 0x14d257a: call   17edf00 <_Znwm@plt>
     14d254a:	49 8d bf 68 01 00 00 	lea    rdi,[r15+0x168]
     14d2551:	e8 ac 78 30 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     14d2556:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d255d:	00 
     14d255e:	e8 07 7a 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14d2563:	48 89 df             	mov    rdi,rbx
     14d2566:	e8 1b bf 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d256b:	31 ff                	xor    edi,edi
     14d256d:	e8 aa be 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d2572:	4d 8b 74 24 30       	mov    r14,QWORD PTR [r12+0x30]
     14d2577:	6a 68                	push   0x68
     14d2579:	5f                   	pop    rdi
     14d257a:	e8 81 b9 31 00       	call   17edf00 <_Znwm@plt>
     14d257f:	48 89 c3             	mov    rbx,rax
     14d2582:	48 8d 05 c7 79 3a 00 	lea    rax,[rip+0x3a79c7]        # 1879f50 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36638>
     14d2589:	48 89 03             	mov    QWORD PTR [rbx],rax
     14d258c:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
     14d2590:	31 c0                	xor    eax,eax
     14d2592:	88 43 10             	mov    BYTE PTR [rbx+0x10],al
     14d2595:	88 43 18             	mov    BYTE PTR [rbx+0x18],al
     14d2598:	48 89 d8             	mov    rax,rbx

### 0x14d25c0: call   17edf00 <_Znwm@plt>
     14d2590:	31 c0                	xor    eax,eax
     14d2592:	88 43 10             	mov    BYTE PTR [rbx+0x10],al
     14d2595:	88 43 18             	mov    BYTE PTR [rbx+0x18],al
     14d2598:	48 89 d8             	mov    rax,rbx
     14d259b:	48 83 c0 28          	add    rax,0x28
     14d259f:	66 0f ef c0          	pxor   xmm0,xmm0
     14d25a3:	f3 0f 7f 43 28       	movdqu XMMWORD PTR [rbx+0x28],xmm0
     14d25a8:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
     14d25ac:	f3 0f 7f 43 38       	movdqu XMMWORD PTR [rbx+0x38],xmm0
     14d25b1:	f3 0f 7f 43 48       	movdqu XMMWORD PTR [rbx+0x48],xmm0
     14d25b6:	f3 0f 7f 43 58       	movdqu XMMWORD PTR [rbx+0x58],xmm0
     14d25bb:	bf 20 02 00 00       	mov    edi,0x220
     14d25c0:	e8 3b b9 31 00       	call   17edf00 <_Znwm@plt>
     14d25c5:	48 89 c5             	mov    rbp,rax
     14d25c8:	48 8b 4c 24 50       	mov    rcx,QWORD PTR [rsp+0x50]
     14d25cd:	49 89 cc             	mov    r12,rcx
     14d25d0:	49 83 c4 20          	add    r12,0x20
     14d25d4:	66 0f ef c0          	pxor   xmm0,xmm0
     14d25d8:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d25dd:	48 8d 05 84 ae 32 00 	lea    rax,[rip+0x32ae84]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14d25e4:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax

### 0x14d28b2: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2881:	48 8b 9d 98 00 00 00 	mov    rbx,QWORD PTR [rbp+0x98]
     14d2888:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d288f:	00 
     14d2890:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d2893:	48 8d 35 f7 a7 5c ff 	lea    rsi,[rip+0xffffffffff5ca7f7]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d289a:	48 8d 0d a7 88 00 00 	lea    rcx,[rip+0x88a7]        # 14db148 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3206cc>
     14d28a1:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d28a8:	00 
     14d28a9:	6a 08                	push   0x8
     14d28ab:	41 59                	pop    r9
     14d28ad:	4c 89 f7             	mov    rdi,r14
     14d28b0:	31 d2                	xor    edx,edx
     14d28b2:	e8 dd 7e 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d28b7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d28ba:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d28c1:	00 
     14d28c2:	48 89 de             	mov    rsi,rbx
     14d28c5:	4c 89 f2             	mov    rdx,r14
     14d28c8:	ff 50 10             	call   QWORD PTR [rax+0x10]
     14d28cb:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d28d2:	00 

### 0x14d28de: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d28b2:	e8 dd 7e 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d28b7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d28ba:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d28c1:	00 
     14d28c2:	48 89 de             	mov    rsi,rbx
     14d28c5:	4c 89 f2             	mov    rdx,r14
     14d28c8:	ff 50 10             	call   QWORD PTR [rax+0x10]
     14d28cb:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d28d2:	00 
     14d28d3:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
     14d28da:	00 
     14d28db:	48 89 de             	mov    rsi,rbx
     14d28de:	e8 0f 73 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d28e3:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d28e7:	e8 9a bb 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d28ec:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d28f3:	00 
     14d28f4:	e8 ef 7e 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d28f9:	48 8b 9d 98 00 00 00 	mov    rbx,QWORD PTR [rbp+0x98]
     14d2900:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d2907:	00 

### 0x14d28f4: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d28c5:	4c 89 f2             	mov    rdx,r14
     14d28c8:	ff 50 10             	call   QWORD PTR [rax+0x10]
     14d28cb:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d28d2:	00 
     14d28d3:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
     14d28da:	00 
     14d28db:	48 89 de             	mov    rsi,rbx
     14d28de:	e8 0f 73 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d28e3:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d28e7:	e8 9a bb 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d28ec:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d28f3:	00 
     14d28f4:	e8 ef 7e 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d28f9:	48 8b 9d 98 00 00 00 	mov    rbx,QWORD PTR [rbp+0x98]
     14d2900:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d2907:	00 
     14d2908:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d290b:	48 8d 35 7f a7 5c ff 	lea    rsi,[rip+0xffffffffff5ca77f]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d2912:	48 8d 0d 3d 88 00 00 	lea    rcx,[rip+0x883d]        # 14db156 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3206da>
     14d2919:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2920:	00 

### 0x14d292a: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d28f9:	48 8b 9d 98 00 00 00 	mov    rbx,QWORD PTR [rbp+0x98]
     14d2900:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d2907:	00 
     14d2908:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d290b:	48 8d 35 7f a7 5c ff 	lea    rsi,[rip+0xffffffffff5ca77f]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d2912:	48 8d 0d 3d 88 00 00 	lea    rcx,[rip+0x883d]        # 14db156 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3206da>
     14d2919:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2920:	00 
     14d2921:	6a 08                	push   0x8
     14d2923:	41 59                	pop    r9
     14d2925:	4c 89 f7             	mov    rdi,r14
     14d2928:	31 d2                	xor    edx,edx
     14d292a:	e8 65 7e 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d292f:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d2932:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d2939:	00 
     14d293a:	48 89 de             	mov    rsi,rbx
     14d293d:	4c 89 f2             	mov    rdx,r14
     14d2940:	ff 50 48             	call   QWORD PTR [rax+0x48]
     14d2943:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d294a:	00 

### 0x14d2956: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d292a:	e8 65 7e 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d292f:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d2932:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d2939:	00 
     14d293a:	48 89 de             	mov    rsi,rbx
     14d293d:	4c 89 f2             	mov    rdx,r14
     14d2940:	ff 50 48             	call   QWORD PTR [rax+0x48]
     14d2943:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d294a:	00 
     14d294b:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
     14d2952:	00 
     14d2953:	48 89 de             	mov    rsi,rbx
     14d2956:	e8 97 72 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d295b:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d295f:	e8 22 bb 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2964:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d296b:	00 
     14d296c:	e8 77 7e 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2971:	48 8b 9d 98 00 00 00 	mov    rbx,QWORD PTR [rbp+0x98]
     14d2978:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d297f:	00 

### 0x14d296c: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d293d:	4c 89 f2             	mov    rdx,r14
     14d2940:	ff 50 48             	call   QWORD PTR [rax+0x48]
     14d2943:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d294a:	00 
     14d294b:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
     14d2952:	00 
     14d2953:	48 89 de             	mov    rsi,rbx
     14d2956:	e8 97 72 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d295b:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d295f:	e8 22 bb 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2964:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d296b:	00 
     14d296c:	e8 77 7e 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2971:	48 8b 9d 98 00 00 00 	mov    rbx,QWORD PTR [rbp+0x98]
     14d2978:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d297f:	00 
     14d2980:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d2983:	48 8d 35 07 a7 5c ff 	lea    rsi,[rip+0xffffffffff5ca707]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d298a:	48 8d 0d 5d 89 00 00 	lea    rcx,[rip+0x895d]        # 14db2ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x320872>
     14d2991:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2998:	00 

### 0x14d29a2: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2971:	48 8b 9d 98 00 00 00 	mov    rbx,QWORD PTR [rbp+0x98]
     14d2978:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d297f:	00 
     14d2980:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d2983:	48 8d 35 07 a7 5c ff 	lea    rsi,[rip+0xffffffffff5ca707]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d298a:	48 8d 0d 5d 89 00 00 	lea    rcx,[rip+0x895d]        # 14db2ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x320872>
     14d2991:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2998:	00 
     14d2999:	6a 08                	push   0x8
     14d299b:	41 59                	pop    r9
     14d299d:	4c 89 f7             	mov    rdi,r14
     14d29a0:	31 d2                	xor    edx,edx
     14d29a2:	e8 ed 7d 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d29a7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d29aa:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d29b1:	00 
     14d29b2:	48 89 de             	mov    rsi,rbx
     14d29b5:	4c 89 f2             	mov    rdx,r14
     14d29b8:	ff 50 18             	call   QWORD PTR [rax+0x18]
     14d29bb:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d29c2:	00 

### 0x14d29ce: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d29a2:	e8 ed 7d 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d29a7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d29aa:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d29b1:	00 
     14d29b2:	48 89 de             	mov    rsi,rbx
     14d29b5:	4c 89 f2             	mov    rdx,r14
     14d29b8:	ff 50 18             	call   QWORD PTR [rax+0x18]
     14d29bb:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d29c2:	00 
     14d29c3:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
     14d29ca:	00 
     14d29cb:	48 89 de             	mov    rsi,rbx
     14d29ce:	e8 1f 72 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d29d3:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d29d7:	e8 aa ba 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d29dc:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d29e3:	00 
     14d29e4:	e8 ff 7d 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d29e9:	48 8b 9d 98 00 00 00 	mov    rbx,QWORD PTR [rbp+0x98]
     14d29f0:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d29f7:	00 

### 0x14d29e4: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d29b5:	4c 89 f2             	mov    rdx,r14
     14d29b8:	ff 50 18             	call   QWORD PTR [rax+0x18]
     14d29bb:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d29c2:	00 
     14d29c3:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
     14d29ca:	00 
     14d29cb:	48 89 de             	mov    rsi,rbx
     14d29ce:	e8 1f 72 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d29d3:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d29d7:	e8 aa ba 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d29dc:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d29e3:	00 
     14d29e4:	e8 ff 7d 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d29e9:	48 8b 9d 98 00 00 00 	mov    rbx,QWORD PTR [rbp+0x98]
     14d29f0:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d29f7:	00 
     14d29f8:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d29fb:	48 8d 35 8f a6 5c ff 	lea    rsi,[rip+0xffffffffff5ca68f]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d2a02:	48 8d 0d 0b 8a 00 00 	lea    rcx,[rip+0x8a0b]        # 14db414 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x320998>
     14d2a09:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2a10:	00 

### 0x14d2a1a: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d29e9:	48 8b 9d 98 00 00 00 	mov    rbx,QWORD PTR [rbp+0x98]
     14d29f0:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d29f7:	00 
     14d29f8:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d29fb:	48 8d 35 8f a6 5c ff 	lea    rsi,[rip+0xffffffffff5ca68f]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d2a02:	48 8d 0d 0b 8a 00 00 	lea    rcx,[rip+0x8a0b]        # 14db414 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x320998>
     14d2a09:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2a10:	00 
     14d2a11:	6a 08                	push   0x8
     14d2a13:	41 59                	pop    r9
     14d2a15:	4c 89 f7             	mov    rdi,r14
     14d2a18:	31 d2                	xor    edx,edx
     14d2a1a:	e8 75 7d 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2a1f:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d2a22:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d2a29:	00 
     14d2a2a:	48 89 de             	mov    rsi,rbx
     14d2a2d:	4c 89 f2             	mov    rdx,r14
     14d2a30:	ff 50 28             	call   QWORD PTR [rax+0x28]
     14d2a33:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d2a3a:	00 

### 0x14d2a46: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2a1a:	e8 75 7d 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2a1f:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d2a22:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d2a29:	00 
     14d2a2a:	48 89 de             	mov    rsi,rbx
     14d2a2d:	4c 89 f2             	mov    rdx,r14
     14d2a30:	ff 50 28             	call   QWORD PTR [rax+0x28]
     14d2a33:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d2a3a:	00 
     14d2a3b:	48 8b bc 24 30 01 00 	mov    rdi,QWORD PTR [rsp+0x130]
     14d2a42:	00 
     14d2a43:	48 89 de             	mov    rsi,rbx
     14d2a46:	e8 a7 71 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2a4b:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d2a4f:	e8 32 ba 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2a54:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d2a5b:	00 
     14d2a5c:	e8 87 7d 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2a61:	48 8b 5d 30          	mov    rbx,QWORD PTR [rbp+0x30]
     14d2a65:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d2a6c:	00 

### 0x14d2a5c: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2a2d:	4c 89 f2             	mov    rdx,r14
     14d2a30:	ff 50 28             	call   QWORD PTR [rax+0x28]
     14d2a33:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d2a3a:	00 
     14d2a3b:	48 8b bc 24 30 01 00 	mov    rdi,QWORD PTR [rsp+0x130]
     14d2a42:	00 
     14d2a43:	48 89 de             	mov    rsi,rbx
     14d2a46:	e8 a7 71 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2a4b:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d2a4f:	e8 32 ba 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2a54:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d2a5b:	00 
     14d2a5c:	e8 87 7d 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2a61:	48 8b 5d 30          	mov    rbx,QWORD PTR [rbp+0x30]
     14d2a65:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d2a6c:	00 
     14d2a6d:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d2a70:	48 8d 35 1a a6 5c ff 	lea    rsi,[rip+0xffffffffff5ca61a]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d2a77:	48 8d 0d b6 8a 00 00 	lea    rcx,[rip+0x8ab6]        # 14db534 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x320ab8>
     14d2a7e:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2a85:	00 

### 0x14d2a8f: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2a61:	48 8b 5d 30          	mov    rbx,QWORD PTR [rbp+0x30]
     14d2a65:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d2a6c:	00 
     14d2a6d:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d2a70:	48 8d 35 1a a6 5c ff 	lea    rsi,[rip+0xffffffffff5ca61a]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d2a77:	48 8d 0d b6 8a 00 00 	lea    rcx,[rip+0x8ab6]        # 14db534 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x320ab8>
     14d2a7e:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2a85:	00 
     14d2a86:	6a 08                	push   0x8
     14d2a88:	41 59                	pop    r9
     14d2a8a:	4c 89 f7             	mov    rdi,r14
     14d2a8d:	31 d2                	xor    edx,edx
     14d2a8f:	e8 00 7d 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2a94:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d2a97:	48 8d 15 6a 66 f6 fe 	lea    rdx,[rip+0xfffffffffef6666a]        # 439108 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb57>
     14d2a9e:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d2aa5:	00 
     14d2aa6:	48 89 de             	mov    rsi,rbx
     14d2aa9:	4c 89 f1             	mov    rcx,r14
     14d2aac:	ff 50 60             	call   QWORD PTR [rax+0x60]
     14d2aaf:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]

### 0x14d2ac2: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2a94:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d2a97:	48 8d 15 6a 66 f6 fe 	lea    rdx,[rip+0xfffffffffef6666a]        # 439108 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb57>
     14d2a9e:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d2aa5:	00 
     14d2aa6:	48 89 de             	mov    rsi,rbx
     14d2aa9:	4c 89 f1             	mov    rcx,r14
     14d2aac:	ff 50 60             	call   QWORD PTR [rax+0x60]
     14d2aaf:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d2ab6:	00 
     14d2ab7:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
     14d2abe:	00 
     14d2abf:	48 89 de             	mov    rsi,rbx
     14d2ac2:	e8 2b 71 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2ac7:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d2acb:	e8 b6 b9 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2ad0:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d2ad7:	00 
     14d2ad8:	e8 0b 7d 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2add:	48 8b 5d 30          	mov    rbx,QWORD PTR [rbp+0x30]
     14d2ae1:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d2ae8:	00 

### 0x14d2ad8: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2aa9:	4c 89 f1             	mov    rcx,r14
     14d2aac:	ff 50 60             	call   QWORD PTR [rax+0x60]
     14d2aaf:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d2ab6:	00 
     14d2ab7:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
     14d2abe:	00 
     14d2abf:	48 89 de             	mov    rsi,rbx
     14d2ac2:	e8 2b 71 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2ac7:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d2acb:	e8 b6 b9 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2ad0:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d2ad7:	00 
     14d2ad8:	e8 0b 7d 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2add:	48 8b 5d 30          	mov    rbx,QWORD PTR [rbp+0x30]
     14d2ae1:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d2ae8:	00 
     14d2ae9:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d2aec:	48 8d 35 9e a5 5c ff 	lea    rsi,[rip+0xffffffffff5ca59e]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d2af3:	48 8d 0d 3a 8a 00 00 	lea    rcx,[rip+0x8a3a]        # 14db534 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x320ab8>
     14d2afa:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2b01:	00 

### 0x14d2b0b: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2add:	48 8b 5d 30          	mov    rbx,QWORD PTR [rbp+0x30]
     14d2ae1:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d2ae8:	00 
     14d2ae9:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d2aec:	48 8d 35 9e a5 5c ff 	lea    rsi,[rip+0xffffffffff5ca59e]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d2af3:	48 8d 0d 3a 8a 00 00 	lea    rcx,[rip+0x8a3a]        # 14db534 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x320ab8>
     14d2afa:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2b01:	00 
     14d2b02:	6a 08                	push   0x8
     14d2b04:	41 59                	pop    r9
     14d2b06:	4c 89 f7             	mov    rdi,r14
     14d2b09:	31 d2                	xor    edx,edx
     14d2b0b:	e8 84 7c 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2b10:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d2b13:	48 8d 15 d6 65 f6 fe 	lea    rdx,[rip+0xfffffffffef665d6]        # 4390f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb3f>
     14d2b1a:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d2b21:	00 
     14d2b22:	48 89 de             	mov    rsi,rbx
     14d2b25:	4c 89 f1             	mov    rcx,r14
     14d2b28:	ff 50 60             	call   QWORD PTR [rax+0x60]
     14d2b2b:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]

### 0x14d2b3e: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2b10:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d2b13:	48 8d 15 d6 65 f6 fe 	lea    rdx,[rip+0xfffffffffef665d6]        # 4390f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb3f>
     14d2b1a:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d2b21:	00 
     14d2b22:	48 89 de             	mov    rsi,rbx
     14d2b25:	4c 89 f1             	mov    rcx,r14
     14d2b28:	ff 50 60             	call   QWORD PTR [rax+0x60]
     14d2b2b:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d2b32:	00 
     14d2b33:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
     14d2b3a:	00 
     14d2b3b:	48 89 de             	mov    rsi,rbx
     14d2b3e:	e8 af 70 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2b43:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d2b47:	e8 3a b9 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2b4c:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d2b53:	00 
     14d2b54:	e8 8f 7c 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2b59:	48 8b 5d 30          	mov    rbx,QWORD PTR [rbp+0x30]
     14d2b5d:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d2b64:	00 

### 0x14d2b54: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2b25:	4c 89 f1             	mov    rcx,r14
     14d2b28:	ff 50 60             	call   QWORD PTR [rax+0x60]
     14d2b2b:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d2b32:	00 
     14d2b33:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
     14d2b3a:	00 
     14d2b3b:	48 89 de             	mov    rsi,rbx
     14d2b3e:	e8 af 70 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2b43:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d2b47:	e8 3a b9 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2b4c:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d2b53:	00 
     14d2b54:	e8 8f 7c 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2b59:	48 8b 5d 30          	mov    rbx,QWORD PTR [rbp+0x30]
     14d2b5d:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d2b64:	00 
     14d2b65:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d2b68:	48 8d 35 22 a5 5c ff 	lea    rsi,[rip+0xffffffffff5ca522]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d2b6f:	48 8d 0d be 89 00 00 	lea    rcx,[rip+0x89be]        # 14db534 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x320ab8>
     14d2b76:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2b7d:	00 

### 0x14d2b87: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2b59:	48 8b 5d 30          	mov    rbx,QWORD PTR [rbp+0x30]
     14d2b5d:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d2b64:	00 
     14d2b65:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d2b68:	48 8d 35 22 a5 5c ff 	lea    rsi,[rip+0xffffffffff5ca522]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d2b6f:	48 8d 0d be 89 00 00 	lea    rcx,[rip+0x89be]        # 14db534 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x320ab8>
     14d2b76:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2b7d:	00 
     14d2b7e:	6a 08                	push   0x8
     14d2b80:	41 59                	pop    r9
     14d2b82:	4c 89 f7             	mov    rdi,r14
     14d2b85:	31 d2                	xor    edx,edx
     14d2b87:	e8 08 7c 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2b8c:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d2b8f:	48 8d 15 aa 5b f6 fe 	lea    rdx,[rip+0xfffffffffef65baa]        # 438740 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e18f>
     14d2b96:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d2b9d:	00 
     14d2b9e:	48 89 de             	mov    rsi,rbx
     14d2ba1:	4c 89 f1             	mov    rcx,r14
     14d2ba4:	ff 50 60             	call   QWORD PTR [rax+0x60]
     14d2ba7:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]

### 0x14d2bba: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2b8c:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d2b8f:	48 8d 15 aa 5b f6 fe 	lea    rdx,[rip+0xfffffffffef65baa]        # 438740 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e18f>
     14d2b96:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d2b9d:	00 
     14d2b9e:	48 89 de             	mov    rsi,rbx
     14d2ba1:	4c 89 f1             	mov    rcx,r14
     14d2ba4:	ff 50 60             	call   QWORD PTR [rax+0x60]
     14d2ba7:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d2bae:	00 
     14d2baf:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
     14d2bb6:	00 
     14d2bb7:	48 89 de             	mov    rsi,rbx
     14d2bba:	e8 33 70 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2bbf:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d2bc3:	e8 be b8 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2bc8:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d2bcf:	00 
     14d2bd0:	e8 13 7c 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2bd5:	48 8b b5 a8 00 00 00 	mov    rsi,QWORD PTR [rbp+0xa8]
     14d2bdc:	48 8d 05 6d 6b 3a 00 	lea    rax,[rip+0x3a6b6d]        # 1879750 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35e38>
     14d2be3:	48 89 03             	mov    QWORD PTR [rbx],rax

### 0x14d2bd0: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2ba1:	4c 89 f1             	mov    rcx,r14
     14d2ba4:	ff 50 60             	call   QWORD PTR [rax+0x60]
     14d2ba7:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d2bae:	00 
     14d2baf:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
     14d2bb6:	00 
     14d2bb7:	48 89 de             	mov    rsi,rbx
     14d2bba:	e8 33 70 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2bbf:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d2bc3:	e8 be b8 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2bc8:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d2bcf:	00 
     14d2bd0:	e8 13 7c 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2bd5:	48 8b b5 a8 00 00 00 	mov    rsi,QWORD PTR [rbp+0xa8]
     14d2bdc:	48 8d 05 6d 6b 3a 00 	lea    rax,[rip+0x3a6b6d]        # 1879750 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35e38>
     14d2be3:	48 89 03             	mov    QWORD PTR [rbx],rax
     14d2be6:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
     14d2bea:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx
     14d2bee:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2bf5:	00 
     14d2bf6:	4c 89 f7             	mov    rdi,r14

### 0x14d2c0c: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2bdc:	48 8d 05 6d 6b 3a 00 	lea    rax,[rip+0x3a6b6d]        # 1879750 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35e38>
     14d2be3:	48 89 03             	mov    QWORD PTR [rbx],rax
     14d2be6:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
     14d2bea:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx
     14d2bee:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2bf5:	00 
     14d2bf6:	4c 89 f7             	mov    rdi,r14
     14d2bf9:	48 89 da             	mov    rdx,rbx
     14d2bfc:	e8 83 11 03 00       	call   1503d84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x349308>
     14d2c01:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
     14d2c08:	00 
     14d2c09:	4c 89 f6             	mov    rsi,r14
     14d2c0c:	e8 e1 6f 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2c11:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d2c15:	e8 6c b8 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2c1a:	48 89 df             	mov    rdi,rbx
     14d2c1d:	e8 48 73 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14d2c22:	48 8b 5d 20          	mov    rbx,QWORD PTR [rbp+0x20]
     14d2c26:	4c 8d 84 24 80 03 00 	lea    r8,[rsp+0x380]
     14d2c2d:	00 
     14d2c2e:	4d 89 38             	mov    QWORD PTR [r8],r15

### 0x14d2c50: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2c22:	48 8b 5d 20          	mov    rbx,QWORD PTR [rbp+0x20]
     14d2c26:	4c 8d 84 24 80 03 00 	lea    r8,[rsp+0x380]
     14d2c2d:	00 
     14d2c2e:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d2c31:	48 8d 35 59 a4 5c ff 	lea    rsi,[rip+0xffffffffff5ca459]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d2c38:	48 8d 0d 07 89 00 00 	lea    rcx,[rip+0x8907]        # 14db546 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x320aca>
     14d2c3f:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2c46:	00 
     14d2c47:	6a 08                	push   0x8
     14d2c49:	41 59                	pop    r9
     14d2c4b:	4c 89 f7             	mov    rdi,r14
     14d2c4e:	31 d2                	xor    edx,edx
     14d2c50:	e8 3f 7b 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2c55:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d2c58:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14d2c5f:	00 
     14d2c60:	48 89 de             	mov    rsi,rbx
     14d2c63:	4c 89 f2             	mov    rdx,r14
     14d2c66:	ff 50 58             	call   QWORD PTR [rax+0x58]
     14d2c69:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
     14d2c70:	00 

### 0x14d2c7c: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2c50:	e8 3f 7b 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2c55:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d2c58:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14d2c5f:	00 
     14d2c60:	48 89 de             	mov    rsi,rbx
     14d2c63:	4c 89 f2             	mov    rdx,r14
     14d2c66:	ff 50 58             	call   QWORD PTR [rax+0x58]
     14d2c69:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
     14d2c70:	00 
     14d2c71:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     14d2c78:	00 
     14d2c79:	48 89 de             	mov    rsi,rbx
     14d2c7c:	e8 71 6f 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2c81:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d2c85:	e8 fc b7 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2c8a:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d2c91:	00 
     14d2c92:	e8 51 7b 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2c97:	48 8b 5d 50          	mov    rbx,QWORD PTR [rbp+0x50]
     14d2c9b:	4c 8d 84 24 80 03 00 	lea    r8,[rsp+0x380]
     14d2ca2:	00 

### 0x14d2c92: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2c63:	4c 89 f2             	mov    rdx,r14
     14d2c66:	ff 50 58             	call   QWORD PTR [rax+0x58]
     14d2c69:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
     14d2c70:	00 
     14d2c71:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     14d2c78:	00 
     14d2c79:	48 89 de             	mov    rsi,rbx
     14d2c7c:	e8 71 6f 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2c81:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d2c85:	e8 fc b7 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2c8a:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d2c91:	00 
     14d2c92:	e8 51 7b 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2c97:	48 8b 5d 50          	mov    rbx,QWORD PTR [rbp+0x50]
     14d2c9b:	4c 8d 84 24 80 03 00 	lea    r8,[rsp+0x380]
     14d2ca2:	00 
     14d2ca3:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d2ca6:	48 8d 35 e4 a3 5c ff 	lea    rsi,[rip+0xffffffffff5ca3e4]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d2cad:	48 8d 0d 5e 89 00 00 	lea    rcx,[rip+0x895e]        # 14db612 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x320b96>
     14d2cb4:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2cbb:	00 

### 0x14d2cc5: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2c97:	48 8b 5d 50          	mov    rbx,QWORD PTR [rbp+0x50]
     14d2c9b:	4c 8d 84 24 80 03 00 	lea    r8,[rsp+0x380]
     14d2ca2:	00 
     14d2ca3:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d2ca6:	48 8d 35 e4 a3 5c ff 	lea    rsi,[rip+0xffffffffff5ca3e4]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d2cad:	48 8d 0d 5e 89 00 00 	lea    rcx,[rip+0x895e]        # 14db612 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x320b96>
     14d2cb4:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2cbb:	00 
     14d2cbc:	6a 08                	push   0x8
     14d2cbe:	41 59                	pop    r9
     14d2cc0:	4c 89 f7             	mov    rdi,r14
     14d2cc3:	31 d2                	xor    edx,edx
     14d2cc5:	e8 ca 7a 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2cca:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d2ccd:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14d2cd4:	00 
     14d2cd5:	48 89 de             	mov    rsi,rbx
     14d2cd8:	4c 89 f2             	mov    rdx,r14
     14d2cdb:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
     14d2ce1:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
     14d2ce8:	00 

### 0x14d2cf4: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2cc5:	e8 ca 7a 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2cca:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d2ccd:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14d2cd4:	00 
     14d2cd5:	48 89 de             	mov    rsi,rbx
     14d2cd8:	4c 89 f2             	mov    rdx,r14
     14d2cdb:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
     14d2ce1:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
     14d2ce8:	00 
     14d2ce9:	48 8b bc 24 28 01 00 	mov    rdi,QWORD PTR [rsp+0x128]
     14d2cf0:	00 
     14d2cf1:	48 89 de             	mov    rsi,rbx
     14d2cf4:	e8 f9 6e 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2cf9:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d2cfd:	e8 84 b7 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2d02:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d2d09:	00 
     14d2d0a:	e8 d9 7a 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2d0f:	80 bd d1 01 00 00 00 	cmp    BYTE PTR [rbp+0x1d1],0x0
     14d2d16:	74 79                	je     14d2d91 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x318315>
     14d2d18:	48 8b 5d 70          	mov    rbx,QWORD PTR [rbp+0x70]

### 0x14d2d0a: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2cd8:	4c 89 f2             	mov    rdx,r14
     14d2cdb:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
     14d2ce1:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
     14d2ce8:	00 
     14d2ce9:	48 8b bc 24 28 01 00 	mov    rdi,QWORD PTR [rsp+0x128]
     14d2cf0:	00 
     14d2cf1:	48 89 de             	mov    rsi,rbx
     14d2cf4:	e8 f9 6e 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2cf9:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d2cfd:	e8 84 b7 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2d02:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d2d09:	00 
     14d2d0a:	e8 d9 7a 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2d0f:	80 bd d1 01 00 00 00 	cmp    BYTE PTR [rbp+0x1d1],0x0
     14d2d16:	74 79                	je     14d2d91 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x318315>
     14d2d18:	48 8b 5d 70          	mov    rbx,QWORD PTR [rbp+0x70]
     14d2d1c:	4c 8d 84 24 80 03 00 	lea    r8,[rsp+0x380]
     14d2d23:	00 
     14d2d24:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d2d27:	48 8d 35 63 a3 5c ff 	lea    rsi,[rip+0xffffffffff5ca363]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d2d2e:	48 8d 0d f1 88 00 00 	lea    rcx,[rip+0x88f1]        # 14db626 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x320baa>

### 0x14d2d46: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2d18:	48 8b 5d 70          	mov    rbx,QWORD PTR [rbp+0x70]
     14d2d1c:	4c 8d 84 24 80 03 00 	lea    r8,[rsp+0x380]
     14d2d23:	00 
     14d2d24:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d2d27:	48 8d 35 63 a3 5c ff 	lea    rsi,[rip+0xffffffffff5ca363]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d2d2e:	48 8d 0d f1 88 00 00 	lea    rcx,[rip+0x88f1]        # 14db626 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x320baa>
     14d2d35:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14d2d3c:	00 
     14d2d3d:	6a 08                	push   0x8
     14d2d3f:	41 59                	pop    r9
     14d2d41:	4c 89 f7             	mov    rdi,r14
     14d2d44:	31 d2                	xor    edx,edx
     14d2d46:	e8 49 7a 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2d4b:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d2d4e:	48 8d 15 1b 5d f6 fe 	lea    rdx,[rip+0xfffffffffef65d1b]        # 438a70 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e4bf>
     14d2d55:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14d2d5c:	00 
     14d2d5d:	48 89 de             	mov    rsi,rbx
     14d2d60:	4c 89 f1             	mov    rcx,r14
     14d2d63:	ff 50 48             	call   QWORD PTR [rax+0x48]
     14d2d66:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]

### 0x14d2d76: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2d46:	e8 49 7a 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2d4b:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d2d4e:	48 8d 15 1b 5d f6 fe 	lea    rdx,[rip+0xfffffffffef65d1b]        # 438a70 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e4bf>
     14d2d55:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14d2d5c:	00 
     14d2d5d:	48 89 de             	mov    rsi,rbx
     14d2d60:	4c 89 f1             	mov    rcx,r14
     14d2d63:	ff 50 48             	call   QWORD PTR [rax+0x48]
     14d2d66:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
     14d2d6d:	00 
     14d2d6e:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
     14d2d73:	48 89 de             	mov    rsi,rbx
     14d2d76:	e8 77 6e 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2d7b:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d2d7f:	e8 02 b7 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2d84:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d2d8b:	00 
     14d2d8c:	e8 57 7a 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2d91:	31 ff                	xor    edi,edi
     14d2d93:	e8 84 b6 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d2d98:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]

### 0x14d2d8c: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2d5d:	48 89 de             	mov    rsi,rbx
     14d2d60:	4c 89 f1             	mov    rcx,r14
     14d2d63:	ff 50 48             	call   QWORD PTR [rax+0x48]
     14d2d66:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
     14d2d6d:	00 
     14d2d6e:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
     14d2d73:	48 89 de             	mov    rsi,rbx
     14d2d76:	e8 77 6e 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2d7b:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d2d7f:	e8 02 b7 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2d84:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d2d8b:	00 
     14d2d8c:	e8 57 7a 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2d91:	31 ff                	xor    edi,edi
     14d2d93:	e8 84 b6 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d2d98:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     14d2d9d:	4d 89 7e 60          	mov    QWORD PTR [r14+0x60],r15
     14d2da1:	49 8b 7e 68          	mov    rdi,QWORD PTR [r14+0x68]
     14d2da5:	49 89 6e 68          	mov    QWORD PTR [r14+0x68],rbp
     14d2da9:	e8 d8 b6 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2dae:	80 bc 24 98 00 00 00 	cmp    BYTE PTR [rsp+0x98],0x0

### 0x14d2dc1: call   17edf00 <_Znwm@plt>
     14d2d8c:	e8 57 7a 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2d91:	31 ff                	xor    edi,edi
     14d2d93:	e8 84 b6 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d2d98:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     14d2d9d:	4d 89 7e 60          	mov    QWORD PTR [r14+0x60],r15
     14d2da1:	49 8b 7e 68          	mov    rdi,QWORD PTR [r14+0x68]
     14d2da5:	49 89 6e 68          	mov    QWORD PTR [r14+0x68],rbp
     14d2da9:	e8 d8 b6 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2dae:	80 bc 24 98 00 00 00 	cmp    BYTE PTR [rsp+0x98],0x0
     14d2db5:	00 
     14d2db6:	0f 84 4e 04 00 00    	je     14d320a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31878e>
     14d2dbc:	bf d0 00 00 00       	mov    edi,0xd0
     14d2dc1:	e8 3a b1 31 00       	call   17edf00 <_Znwm@plt>
     14d2dc6:	48 89 c5             	mov    rbp,rax
     14d2dc9:	66 0f ef c0          	pxor   xmm0,xmm0
     14d2dcd:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d2dd2:	48 8d 05 8f a6 32 00 	lea    rax,[rip+0x32a68f]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14d2dd9:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     14d2ddd:	48 8b 84 24 50 01 00 	mov    rax,QWORD PTR [rsp+0x150]
     14d2de4:	00 
     14d2de5:	66 0f 6f 00          	movdqa xmm0,XMMWORD PTR [rax]

### 0x14d2f36: call   17edf00 <_Znwm@plt>
     14d2f0b:	ff 50 40             	call   QWORD PTR [rax+0x40]
     14d2f0e:	48 8b 7d 20          	mov    rdi,QWORD PTR [rbp+0x20]
     14d2f12:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14d2f15:	48 8d 35 ec 61 f6 fe 	lea    rsi,[rip+0xfffffffffef661ec]        # 439108 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb57>
     14d2f1c:	ff 50 40             	call   QWORD PTR [rax+0x40]
     14d2f1f:	48 8b 7d 20          	mov    rdi,QWORD PTR [rbp+0x20]
     14d2f23:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14d2f26:	48 8d 35 c3 61 f6 fe 	lea    rsi,[rip+0xfffffffffef661c3]        # 4390f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb3f>
     14d2f2d:	ff 50 50             	call   QWORD PTR [rax+0x50]
     14d2f30:	49 89 c6             	mov    r14,rax
     14d2f33:	6a 08                	push   0x8
     14d2f35:	5f                   	pop    rdi
     14d2f36:	e8 c5 af 31 00       	call   17edf00 <_Znwm@plt>
     14d2f3b:	48 89 eb             	mov    rbx,rbp
     14d2f3e:	48 83 c3 18          	add    rbx,0x18
     14d2f42:	48 8d 0d 4f 74 3a 00 	lea    rcx,[rip+0x3a744f]        # 187a398 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36a80>
     14d2f49:	48 89 08             	mov    QWORD PTR [rax],rcx
     14d2f4c:	49 8b be a0 01 00 00 	mov    rdi,QWORD PTR [r14+0x1a0]
     14d2f53:	49 89 86 a0 01 00 00 	mov    QWORD PTR [r14+0x1a0],rax
     14d2f5a:	48 85 ff             	test   rdi,rdi
     14d2f5d:	74 06                	je     14d2f65 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3184e9>

### 0x14d2f93: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2f65:	4c 8b 75 20          	mov    r14,QWORD PTR [rbp+0x20]
     14d2f69:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d2f70:	00 
     14d2f71:	49 89 18             	mov    QWORD PTR [r8],rbx
     14d2f74:	48 8d 35 16 a1 5c ff 	lea    rsi,[rip+0xffffffffff5ca116]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d2f7b:	48 8d 0d 32 c0 01 00 	lea    rcx,[rip+0x1c032]        # 14eefb4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x334538>
     14d2f82:	4c 8d bc 24 e0 02 00 	lea    r15,[rsp+0x2e0]
     14d2f89:	00 
     14d2f8a:	6a 08                	push   0x8
     14d2f8c:	41 59                	pop    r9
     14d2f8e:	4c 89 ff             	mov    rdi,r15
     14d2f91:	31 d2                	xor    edx,edx
     14d2f93:	e8 fc 77 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2f98:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d2f9b:	48 8d 15 4e 61 f6 fe 	lea    rdx,[rip+0xfffffffffef6614e]        # 4390f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb3f>
     14d2fa2:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d2fa9:	00 
     14d2faa:	4c 89 f6             	mov    rsi,r14
     14d2fad:	4c 89 f9             	mov    rcx,r15
     14d2fb0:	ff 50 60             	call   QWORD PTR [rax+0x60]
     14d2fb3:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]

### 0x14d2fc3: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2f93:	e8 fc 77 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2f98:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d2f9b:	48 8d 15 4e 61 f6 fe 	lea    rdx,[rip+0xfffffffffef6614e]        # 4390f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb3f>
     14d2fa2:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d2fa9:	00 
     14d2faa:	4c 89 f6             	mov    rsi,r14
     14d2fad:	4c 89 f9             	mov    rcx,r15
     14d2fb0:	ff 50 60             	call   QWORD PTR [rax+0x60]
     14d2fb3:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14d2fba:	00 
     14d2fbb:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
     14d2fc0:	4c 89 f6             	mov    rsi,r14
     14d2fc3:	e8 2a 6c 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2fc8:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d2fcc:	e8 b5 b4 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2fd1:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d2fd8:	00 
     14d2fd9:	e8 0a 78 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2fde:	4c 8b 75 20          	mov    r14,QWORD PTR [rbp+0x20]
     14d2fe2:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d2fe9:	00 

### 0x14d2fd9: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2faa:	4c 89 f6             	mov    rsi,r14
     14d2fad:	4c 89 f9             	mov    rcx,r15
     14d2fb0:	ff 50 60             	call   QWORD PTR [rax+0x60]
     14d2fb3:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14d2fba:	00 
     14d2fbb:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
     14d2fc0:	4c 89 f6             	mov    rsi,r14
     14d2fc3:	e8 2a 6c 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d2fc8:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d2fcc:	e8 b5 b4 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d2fd1:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d2fd8:	00 
     14d2fd9:	e8 0a 78 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d2fde:	4c 8b 75 20          	mov    r14,QWORD PTR [rbp+0x20]
     14d2fe2:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d2fe9:	00 
     14d2fea:	49 89 18             	mov    QWORD PTR [r8],rbx
     14d2fed:	48 8d 35 9d a0 5c ff 	lea    rsi,[rip+0xffffffffff5ca09d]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d2ff4:	48 8d 0d b9 bf 01 00 	lea    rcx,[rip+0x1bfb9]        # 14eefb4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x334538>
     14d2ffb:	4c 8d bc 24 e0 02 00 	lea    r15,[rsp+0x2e0]
     14d3002:	00 

### 0x14d300c: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2fde:	4c 8b 75 20          	mov    r14,QWORD PTR [rbp+0x20]
     14d2fe2:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d2fe9:	00 
     14d2fea:	49 89 18             	mov    QWORD PTR [r8],rbx
     14d2fed:	48 8d 35 9d a0 5c ff 	lea    rsi,[rip+0xffffffffff5ca09d]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d2ff4:	48 8d 0d b9 bf 01 00 	lea    rcx,[rip+0x1bfb9]        # 14eefb4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x334538>
     14d2ffb:	4c 8d bc 24 e0 02 00 	lea    r15,[rsp+0x2e0]
     14d3002:	00 
     14d3003:	6a 08                	push   0x8
     14d3005:	41 59                	pop    r9
     14d3007:	4c 89 ff             	mov    rdi,r15
     14d300a:	31 d2                	xor    edx,edx
     14d300c:	e8 83 77 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d3011:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d3014:	48 8d 15 ed 60 f6 fe 	lea    rdx,[rip+0xfffffffffef660ed]        # 439108 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb57>
     14d301b:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d3022:	00 
     14d3023:	4c 89 f6             	mov    rsi,r14
     14d3026:	4c 89 f9             	mov    rcx,r15
     14d3029:	ff 50 60             	call   QWORD PTR [rax+0x60]
     14d302c:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]

### 0x14d303f: call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d3011:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d3014:	48 8d 15 ed 60 f6 fe 	lea    rdx,[rip+0xfffffffffef660ed]        # 439108 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb57>
     14d301b:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d3022:	00 
     14d3023:	4c 89 f6             	mov    rsi,r14
     14d3026:	4c 89 f9             	mov    rcx,r15
     14d3029:	ff 50 60             	call   QWORD PTR [rax+0x60]
     14d302c:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14d3033:	00 
     14d3034:	48 8b bc 24 f0 00 00 	mov    rdi,QWORD PTR [rsp+0xf0]
     14d303b:	00 
     14d303c:	4c 89 f6             	mov    rsi,r14
     14d303f:	e8 ae 6b 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d3044:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d3048:	e8 39 b4 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d304d:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d3054:	00 
     14d3055:	e8 8e 77 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d305a:	4c 8b 75 30          	mov    r14,QWORD PTR [rbp+0x30]
     14d305e:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d3065:	00 

### 0x14d3055: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d3026:	4c 89 f9             	mov    rcx,r15
     14d3029:	ff 50 60             	call   QWORD PTR [rax+0x60]
     14d302c:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14d3033:	00 
     14d3034:	48 8b bc 24 f0 00 00 	mov    rdi,QWORD PTR [rsp+0xf0]
     14d303b:	00 
     14d303c:	4c 89 f6             	mov    rsi,r14
     14d303f:	e8 ae 6b 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14d3044:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14d3048:	e8 39 b4 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d304d:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d3054:	00 
     14d3055:	e8 8e 77 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d305a:	4c 8b 75 30          	mov    r14,QWORD PTR [rbp+0x30]
     14d305e:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d3065:	00 
     14d3066:	49 89 18             	mov    QWORD PTR [r8],rbx
     14d3069:	48 8d 35 21 a0 5c ff 	lea    rsi,[rip+0xffffffffff5ca021]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d3070:	48 8d 0d 4f bf 01 00 	lea    rcx,[rip+0x1bf4f]        # 14eefc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33454a>
     14d3077:	4c 8d bc 24 e0 02 00 	lea    r15,[rsp+0x2e0]
     14d307e:	00 

### 0x14d3088: call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d305a:	4c 8b 75 30          	mov    r14,QWORD PTR [rbp+0x30]
     14d305e:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d3065:	00 
     14d3066:	49 89 18             	mov    QWORD PTR [r8],rbx
     14d3069:	48 8d 35 21 a0 5c ff 	lea    rsi,[rip+0xffffffffff5ca021]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d3070:	48 8d 0d 4f bf 01 00 	lea    rcx,[rip+0x1bf4f]        # 14eefc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33454a>
     14d3077:	4c 8d bc 24 e0 02 00 	lea    r15,[rsp+0x2e0]
     14d307e:	00 
     14d307f:	6a 08                	push   0x8
     14d3081:	41 59                	pop    r9
     14d3083:	4c 89 ff             	mov    rdi,r15
     14d3086:	31 d2                	xor    edx,edx
     14d3088:	e8 07 77 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d308d:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d3090:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d3097:	00 
     14d3098:	4c 89 f6             	mov    rsi,r14
     14d309b:	4c 89 fa             	mov    rdx,r15
     14d309e:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
     14d30a4:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14d30ab:	00 

