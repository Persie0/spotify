# Compact Skip Ad execution dependency provenance

## Constructor window around 0x11f4142

/tmp/sasum/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000011f3d00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39284>:
 11f3d00:	8d b4 24 c0 02 00 00 	lea    esi,[rsp+0x2c0]
 11f3d07:	48 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],rdi
 11f3d0c:	e8 49 b3 05 00       	call   124f05a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x945de>
 11f3d11:	44 88 b3 a0 3a 00 00 	mov    BYTE PTR [rbx+0x3aa0],r14b
 11f3d18:	44 88 b3 50 4a 00 00 	mov    BYTE PTR [rbx+0x4a50],r14b
 11f3d1f:	4c 8d b4 24 20 05 00 	lea    r14,[rsp+0x520]
 11f3d26:	00 
 11f3d27:	4d 89 3e             	mov    QWORD PTR [r14],r15
 11f3d2a:	48 8d 35 60 93 8a ff 	lea    rsi,[rip+0xffffffffff8a9360]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 11f3d31:	48 8d 0d b4 54 06 00 	lea    rcx,[rip+0x654b4]        # 12591ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e770>
 11f3d38:	48 8d ac 24 c0 05 00 	lea    rbp,[rsp+0x5c0]
 11f3d3f:	00 
 11f3d40:	6a 08                	push   0x8
 11f3d42:	41 59                	pop    r9
 11f3d44:	48 89 ef             	mov    rdi,rbp
 11f3d47:	31 d2                	xor    edx,edx
 11f3d49:	4d 89 f0             	mov    r8,r14
 11f3d4c:	e8 43 6a 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 11f3d51:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 11f3d55:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11f3d58:	4c 8d a4 24 e0 04 00 	lea    r12,[rsp+0x4e0]
 11f3d5f:	00 
 11f3d60:	4c 89 e7             	mov    rdi,r12
 11f3d63:	48 89 ea             	mov    rdx,rbp
 11f3d66:	ff 50 10             	call   QWORD PTR [rax+0x10]
 11f3d69:	4c 89 ef             	mov    rdi,r13
 11f3d6c:	4c 89 e6             	mov    rsi,r12
 11f3d6f:	e8 7e 5e 5e 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 11f3d74:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
 11f3d79:	4d 89 fc             	mov    r12,r15
 11f3d7c:	e8 05 a7 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f3d81:	48 89 ef             	mov    rdi,rbp
 11f3d84:	e8 5f 6a 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 11f3d89:	4d 89 3e             	mov    QWORD PTR [r14],r15
 11f3d8c:	48 8d 0d 39 55 06 00 	lea    rcx,[rip+0x65539]        # 12592cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e850>
 11f3d93:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
 11f3d9a:	00 
 11f3d9b:	4c 8d 84 24 20 05 00 	lea    r8,[rsp+0x520]
 11f3da2:	00 
 11f3da3:	4c 89 ff             	mov    rdi,r15
 11f3da6:	48 8d 35 e4 92 8a ff 	lea    rsi,[rip+0xffffffffff8a92e4]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 11f3dad:	31 d2                	xor    edx,edx
 11f3daf:	6a 08                	push   0x8
 11f3db1:	41 59                	pop    r9
 11f3db3:	e8 dc 69 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 11f3db8:	48 8b b4 24 c8 06 00 	mov    rsi,QWORD PTR [rsp+0x6c8]
 11f3dbf:	00 
 11f3dc0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11f3dc3:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 11f3dca:	00 
 11f3dcb:	4c 89 fa             	mov    rdx,r15
 11f3dce:	ff 50 30             	call   QWORD PTR [rax+0x30]
 11f3dd1:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
 11f3dd8:	00 
 11f3dd9:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
 11f3dde:	4c 89 f6             	mov    rsi,r14
 11f3de1:	e8 0c 5e 5e 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 11f3de6:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 11f3dea:	e8 97 a6 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f3def:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
 11f3df6:	00 
 11f3df7:	e8 ec 69 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 11f3dfc:	4c 8d 84 24 20 05 00 	lea    r8,[rsp+0x520]
 11f3e03:	00 
 11f3e04:	4d 89 20             	mov    QWORD PTR [r8],r12
 11f3e07:	48 8d 35 83 92 8a ff 	lea    rsi,[rip+0xffffffffff8a9283]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 11f3e0e:	48 8d 0d 63 56 06 00 	lea    rcx,[rip+0x65663]        # 1259478 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e9fc>
 11f3e15:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]
 11f3e1c:	00 
 11f3e1d:	6a 08                	push   0x8
 11f3e1f:	41 59                	pop    r9
 11f3e21:	4c 89 f7             	mov    rdi,r14
 11f3e24:	31 d2                	xor    edx,edx
 11f3e26:	e8 69 69 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 11f3e2b:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
 11f3e30:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11f3e33:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 11f3e3a:	00 
 11f3e3b:	31 d2                	xor    edx,edx
 11f3e3d:	4c 89 f1             	mov    rcx,r14
 11f3e40:	ff 50 18             	call   QWORD PTR [rax+0x18]
 11f3e43:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
 11f3e4a:	00 
 11f3e4b:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
 11f3e50:	4c 89 f6             	mov    rsi,r14
 11f3e53:	e8 9a 5d 5e 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 11f3e58:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 11f3e5c:	e8 25 a6 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f3e61:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
 11f3e68:	00 
 11f3e69:	e8 7a 69 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 11f3e6e:	48 8d bc 24 c0 02 00 	lea    rdi,[rsp+0x2c0]
 11f3e75:	00 
 11f3e76:	e8 c1 25 00 00       	call   11f643c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b9c0>
 11f3e7b:	48 8b bc 24 58 05 00 	mov    rdi,QWORD PTR [rsp+0x558]
 11f3e82:	00 
 11f3e83:	e8 fe a5 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f3e88:	48 83 a3 58 4a 00 00 	and    QWORD PTR [rbx+0x4a58],0x0
 11f3e8f:	00 
 11f3e90:	6a 10                	push   0x10
 11f3e92:	5f                   	pop    rdi
 11f3e93:	e8 68 a0 5f 00       	call   17edf00 <_Znwm@plt>
 11f3e98:	4c 8d 7b 10          	lea    r15,[rbx+0x10]
 11f3e9c:	48 8d 0d 6d 7c 66 00 	lea    rcx,[rip+0x667c6d]        # 185bb10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x181f8>
 11f3ea3:	48 89 08             	mov    QWORD PTR [rax],rcx
 11f3ea6:	48 8b 4c 24 48       	mov    rcx,QWORD PTR [rsp+0x48]
 11f3eab:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 11f3eaf:	48 89 83 60 4a 00 00 	mov    QWORD PTR [rbx+0x4a60],rax
 11f3eb6:	4c 8d a3 68 4a 00 00 	lea    r12,[rbx+0x4a68]
 11f3ebd:	4c 8b ab d0 0e 00 00 	mov    r13,QWORD PTR [rbx+0xed0]
 11f3ec4:	48 8b bc 24 a0 06 00 	mov    rdi,QWORD PTR [rsp+0x6a0]
 11f3ecb:	00 
 11f3ecc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11f3ecf:	ff 50 30             	call   QWORD PTR [rax+0x30]
 11f3ed2:	49 89 c6             	mov    r14,rax
 11f3ed5:	48 8b bc 24 a8 06 00 	mov    rdi,QWORD PTR [rsp+0x6a8]
 11f3edc:	00 
 11f3edd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11f3ee0:	ff 50 30             	call   QWORD PTR [rax+0x30]
 11f3ee3:	4c 89 ab 68 4a 00 00 	mov    QWORD PTR [rbx+0x4a68],r13
 11f3eea:	4c 89 bb 70 4a 00 00 	mov    QWORD PTR [rbx+0x4a70],r15
 11f3ef1:	48 8b 8c 24 80 00 00 	mov    rcx,QWORD PTR [rsp+0x80]
 11f3ef8:	00 
 11f3ef9:	48 89 8b 78 4a 00 00 	mov    QWORD PTR [rbx+0x4a78],rcx
 11f3f00:	4c 89 b3 80 4a 00 00 	mov    QWORD PTR [rbx+0x4a80],r14
 11f3f07:	48 89 83 88 4a 00 00 	mov    QWORD PTR [rbx+0x4a88],rax
 11f3f0e:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
 11f3f13:	48 89 83 90 4a 00 00 	mov    QWORD PTR [rbx+0x4a90],rax
 11f3f1a:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
 11f3f21:	00 
 11f3f22:	48 89 83 98 4a 00 00 	mov    QWORD PTR [rbx+0x4a98],rax
 11f3f29:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
 11f3f2e:	48 89 83 a0 4a 00 00 	mov    QWORD PTR [rbx+0x4aa0],rax
 11f3f35:	4c 8d 84 24 50 05 00 	lea    r8,[rsp+0x550]
 11f3f3c:	00 
 11f3f3d:	4d 89 20             	mov    QWORD PTR [r8],r12
 11f3f40:	48 8d 35 4a 91 8a ff 	lea    rsi,[rip+0xffffffffff8a914a]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 11f3f47:	48 8d 0d 1e 1f 02 00 	lea    rcx,[rip+0x21f1e]        # 1215e6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b3f0>
 11f3f4e:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]
 11f3f55:	00 
 11f3f56:	6a 08                	push   0x8
 11f3f58:	41 59                	pop    r9
 11f3f5a:	4c 89 f7             	mov    rdi,r14
 11f3f5d:	31 d2                	xor    edx,edx
 11f3f5f:	e8 30 68 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 11f3f64:	48 8b 83 a8 05 00 00 	mov    rax,QWORD PTR [rbx+0x5a8]
 11f3f6b:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 11f3f72:	00 
 11f3f73:	6a 02                	push   0x2
 11f3f75:	5a                   	pop    rdx
 11f3f76:	4c 8b 64 24 18       	mov    r12,QWORD PTR [rsp+0x18]
 11f3f7b:	4c 89 e6             	mov    rsi,r12
 11f3f7e:	4c 89 f1             	mov    rcx,r14
 11f3f81:	ff 50 18             	call   QWORD PTR [rax+0x18]
 11f3f84:	4c 8b bc 24 40 07 00 	mov    r15,QWORD PTR [rsp+0x740]
 11f3f8b:	00 
 11f3f8c:	48 8d bb a8 4a 00 00 	lea    rdi,[rbx+0x4aa8]
 11f3f93:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
 11f3f9a:	00 
 11f3f9b:	4c 89 f6             	mov    rsi,r14
 11f3f9e:	e8 9b 5a 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
 11f3fa3:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 11f3fa7:	e8 da a4 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f3fac:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
 11f3fb3:	00 
 11f3fb4:	e8 2f 68 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 11f3fb9:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
 11f3fbd:	48 89 83 c8 4a 00 00 	mov    QWORD PTR [rbx+0x4ac8],rax
 11f3fc4:	f3 41 0f 6f 07       	movdqu xmm0,XMMWORD PTR [r15]
 11f3fc9:	f3 0f 7f 83 b8 4a 00 	movdqu XMMWORD PTR [rbx+0x4ab8],xmm0
 11f3fd0:	00 
 11f3fd1:	66 0f ef c0          	pxor   xmm0,xmm0
 11f3fd5:	f3 41 0f 7f 07       	movdqu XMMWORD PTR [r15],xmm0
 11f3fda:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
 11f3fdf:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
 11f3fe6:	00 
 11f3fe7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11f3fea:	4c 89 e6             	mov    rsi,r12
 11f3fed:	ff 50 30             	call   QWORD PTR [rax+0x30]
 11f3ff0:	48 8b b4 24 50 06 00 	mov    rsi,QWORD PTR [rsp+0x650]
 11f3ff7:	00 
 11f3ff8:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11f3ffb:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 11f4002:	00 
 11f4003:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
 11f4009:	4c 8b b4 24 a0 06 00 	mov    r14,QWORD PTR [rsp+0x6a0]
 11f4010:	00 
 11f4011:	49 8b 06             	mov    rax,QWORD PTR [r14]
 11f4014:	48 8d 94 24 e0 04 00 	lea    rdx,[rsp+0x4e0]
 11f401b:	00 
 11f401c:	4c 89 f7             	mov    rdi,r14
 11f401f:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
 11f4024:	ff 50 48             	call   QWORD PTR [rax+0x48]
 11f4027:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 11f402e:	00 
 11f402f:	e8 08 24 00 00       	call   11f643c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b9c0>
 11f4034:	49 8b 06             	mov    rax,QWORD PTR [r14]
 11f4037:	4c 89 f7             	mov    rdi,r14
 11f403a:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11f403d:	49 89 c6             	mov    r14,rax
 11f4040:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]
 11f4045:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11f4048:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
 11f404f:	00 
 11f4050:	ff 50 30             	call   QWORD PTR [rax+0x30]
 11f4053:	4c 8b ac 24 80 05 00 	mov    r13,QWORD PTR [rsp+0x580]
 11f405a:	00 
 11f405b:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
 11f4062:	00 
 11f4063:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11f4066:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11f4069:	49 89 c7             	mov    r15,rax
 11f406c:	48 8b bc 24 68 06 00 	mov    rdi,QWORD PTR [rsp+0x668]
 11f4073:	00 
 11f4074:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11f4077:	ff 50 38             	call   QWORD PTR [rax+0x38]
 11f407a:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 11f407f:	4c 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],r15
 11f4084:	48 8b 83 d0 0e 00 00 	mov    rax,QWORD PTR [rbx+0xed0]
 11f408b:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 11f4090:	48 83 a4 24 20 05 00 	and    QWORD PTR [rsp+0x520],0x0
 11f4097:	00 00 
 11f4099:	48 8d 05 40 3d 7e ff 	lea    rax,[rip+0xffffffffff7e3d40]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 11f40a0:	48 89 84 24 30 05 00 	mov    QWORD PTR [rsp+0x530],rax
 11f40a7:	00 
 11f40a8:	48 8d 05 cb ed 95 ff 	lea    rax,[rip+0xffffffffff95edcb]        # b52e7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9fe1a>
 11f40af:	48 89 84 24 38 05 00 	mov    QWORD PTR [rsp+0x538],rax
 11f40b6:	00 
 11f40b7:	48 8b 83 28 1a 00 00 	mov    rax,QWORD PTR [rbx+0x1a28]
 11f40be:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
 11f40c5:	00 
 11f40c6:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
 11f40cb:	41 0f b6 84 24 b1 00 	movzx  eax,BYTE PTR [r12+0xb1]
 11f40d2:	00 00 
 11f40d4:	89 84 24 80 00 00 00 	mov    DWORD PTR [rsp+0x80],eax
 11f40db:	bf 98 20 00 00       	mov    edi,0x2098
 11f40e0:	e8 1b 9e 5f 00       	call   17edf00 <_Znwm@plt>
 11f40e5:	49 89 c7             	mov    r15,rax
 11f40e8:	48 8d ab b8 4a 00 00 	lea    rbp,[rbx+0x4ab8]
 11f40ef:	66 0f ef c0          	pxor   xmm0,xmm0
 11f40f3:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
 11f40f8:	48 8d 05 81 79 66 00 	lea    rax,[rip+0x667981]        # 185ba80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18168>
 11f40ff:	49 89 07             	mov    QWORD PTR [r15],rax
 11f4102:	41 8a 84 24 88 00 00 	mov    al,BYTE PTR [r12+0x88]
 11f4109:	00 
 11f410a:	88 44 24 60          	mov    BYTE PTR [rsp+0x60],al
 11f410e:	41 8a 84 24 89 00 00 	mov    al,BYTE PTR [r12+0x89]
 11f4115:	00 
 11f4116:	88 84 24 b0 00 00 00 	mov    BYTE PTR [rsp+0xb0],al
 11f411d:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
 11f4124:	00 
 11f4125:	48 8d b4 24 20 05 00 	lea    rsi,[rsp+0x520]
 11f412c:	00 
 11f412d:	e8 34 1a 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
 11f4132:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 11f4139:	00 
 11f413a:	48 89 ee             	mov    rsi,rbp
 11f413d:	e8 fe 9d 5f 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 11f4142:	48 8d 05 3f 7e 66 00 	lea    rax,[rip+0x667e3f]        # 185bf88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18670>
 11f4149:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
 11f414d:	48 8b 84 24 50 06 00 	mov    rax,QWORD PTR [rsp+0x650]
 11f4154:	00 
 11f4155:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
 11f4159:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
 11f415e:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
 11f4162:	48 8d 83 88 5d 00 00 	lea    rax,[rbx+0x5d88]
 11f4169:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
 11f416d:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
 11f4172:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
 11f4176:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
 11f417d:	00 
 11f417e:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
 11f4182:	4d 89 77 48          	mov    QWORD PTR [r15+0x48],r14
 11f4186:	48 8d 83 f0 19 00 00 	lea    rax,[rbx+0x19f0]
 11f418d:	49 89 47 50          	mov    QWORD PTR [r15+0x50],rax
 11f4191:	48 8b 84 24 18 01 00 	mov    rax,QWORD PTR [rsp+0x118]
 11f4198:	00 
 11f4199:	49 89 47 58          	mov    QWORD PTR [r15+0x58],rax
 11f419d:	4d 89 6f 60          	mov    QWORD PTR [r15+0x60],r13
 11f41a1:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 11f41a6:	49 89 47 68          	mov    QWORD PTR [r15+0x68],rax
 11f41aa:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
 11f41af:	49 89 47 70          	mov    QWORD PTR [r15+0x70],rax
 11f41b3:	48 8b 84 24 40 06 00 	mov    rax,QWORD PTR [rsp+0x640]
 11f41ba:	00 
 11f41bb:	49 89 47 78          	mov    QWORD PTR [r15+0x78],rax
 11f41bf:	49 8d 6f 18          	lea    rbp,[r15+0x18]
 11f41c3:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 11f41c8:	49 89 87 80 00 00 00 	mov    QWORD PTR [r15+0x80],rax
 11f41cf:	48 8b 84 24 60 06 00 	mov    rax,QWORD PTR [rsp+0x660]
 11f41d6:	00 
 11f41d7:	49 89 87 88 00 00 00 	mov    QWORD PTR [r15+0x88],rax
 11f41de:	4d 8d a7 90 00 00 00 	lea    r12,[r15+0x90]
 11f41e5:	48 8d b4 24 50 05 00 	lea    rsi,[rsp+0x550]
 11f41ec:	00 
 11f41ed:	4c 89 e7             	mov    rdi,r12
 11f41f0:	e8 71 19 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
 11f41f5:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 11f41fa:	49 89 87 b0 00 00 00 	mov    QWORD PTR [r15+0xb0],rax
 11f4201:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
 11f4206:	49 89 87 b8 00 00 00 	mov    QWORD PTR [r15+0xb8],rax
 11f420d:	48 8b 84 24 c0 01 00 	mov    rax,QWORD PTR [rsp+0x1c0]
 11f4214:	00 
 11f4215:	49 89 87 d0 00 00 00 	mov    QWORD PTR [r15+0xd0],rax
 11f421c:	66 0f 6f 84 24 b0 01 	movdqa xmm0,XMMWORD PTR [rsp+0x1b0]
 11f4223:	00 00 
 11f4225:	f3 41 0f 7f 87 c0 00 	movdqu XMMWORD PTR [r15+0xc0],xmm0
 11f422c:	00 00 
 11f422e:	48                   	rex.W
 11f422f:	83                   	.byte 0x83

## Exact references to stack slot rsp+0x650 in 0x11f0000..0x1200000
### hit line 2294050
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
 11f034c:	4c 89 f7             	mov    rdi,r14
 11f034f:	e8 98 5c eb ff       	call   10a5fec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d402>
 11f0354:	4c 89 b3 38 06 00 00 	mov    QWORD PTR [rbx+0x638],r14
 11f035b:	4c 89 bb 40 06 00 00 	mov    QWORD PTR [rbx+0x640],r15
 11f0362:	31 ff                	xor    edi,edi
 11f0364:	e8 b3 e0 8a ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
 11f0369:	66 83 a3 58 06 00 00 	and    WORD PTR [rbx+0x658],0x0
 11f0370:	00 
 11f0371:	66 0f ef c0          	pxor   xmm0,xmm0
 11f0375:	f3 0f 7f 83 48 06 00 	movdqu XMMWORD PTR [rbx+0x648],xmm0
 11f037c:	00 
 11f037d:	48 8d 05 64 c5 66 00 	lea    rax,[rip+0x66c564]        # 185c8e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18fd0>
 11f0384:	48 89 83 60 06 00 00 	mov    QWORD PTR [rbx+0x660],rax
 11f038b:	48 8d bb 68 06 00 00 	lea    rdi,[rbx+0x668]
 11f0392:	e8 6b 9a 5e 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
 11f0397:	4c 8b bc 24 50 06 00 	mov    r15,QWORD PTR [rsp+0x650]
 11f039e:	00 
 11f039f:	4c 8d 84 24 e0 04 00 	lea    r8,[rsp+0x4e0]
 11f03a6:	00 
 11f03a7:	49 89 18             	mov    QWORD PTR [r8],rbx
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
### hit line 2294121
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
 11f04c8:	48 8b 84 24 40 06 00 	mov    rax,QWORD PTR [rsp+0x640]
 11f04cf:	00 
 11f04d0:	48 89 83 00 07 00 00 	mov    QWORD PTR [rbx+0x700],rax
 11f04d7:	48 8b b4 24 50 06 00 	mov    rsi,QWORD PTR [rsp+0x650]
 11f04de:	00 
 11f04df:	48 89 b3 08 07 00 00 	mov    QWORD PTR [rbx+0x708],rsi
 11f04e6:	48 8d bb 10 07 00 00 	lea    rdi,[rbx+0x710]
 11f04ed:	48 8d 84 24 e8 04 00 	lea    rax,[rsp+0x4e8]
 11f04f4:	00 
 11f04f5:	66 0f ef c0          	pxor   xmm0,xmm0
 11f04f9:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
 11f04fd:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
 11f0501:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11f0504:	6a 09                	push   0x9
 11f0506:	59                   	pop    rcx
 11f0507:	4c 8d 84 24 e0 04 00 	lea    r8,[rsp+0x4e0]
 11f050e:	00 
 11f050f:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
 11f0515:	48 8d ab a8 05 00 00 	lea    rbp,[rbx+0x5a8]
 11f051c:	4c 8d bb e8 06 00 00 	lea    r15,[rbx+0x6e8]
 11f0523:	48 8b bc 24 e8 04 00 	mov    rdi,QWORD PTR [rsp+0x4e8]
 11f052a:	00 
 11f052b:	e8 90 e0 8e ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
 11f0530:	4c 8d 84 24 b0 01 00 	lea    r8,[rsp+0x1b0]
 11f0537:	00 
 11f0538:	4d 89 38             	mov    QWORD PTR [r8],r15
 11f053b:	48 8d 35 4f cb 8a ff 	lea    rsi,[rip+0xffffffffff8acb4f]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 11f0542:	48 8d 0d 45 57 00 00 	lea    rcx,[rip+0x5745]        # 11f5c8e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b212>
 11f0549:	4c 8d ac 24 c0 05 00 	lea    r13,[rsp+0x5c0]
 11f0550:	00 
 11f0551:	6a 08                	push   0x8
 11f0553:	41 59                	pop    r9
 11f0555:	4c 89 ef             	mov    rdi,r13
 11f0558:	31 d2                	xor    edx,edx
 11f055a:	e8 35 a2 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 11f055f:	48 8b 83 a8 05 00 00 	mov    rax,QWORD PTR [rbx+0x5a8]
 11f0566:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
 11f056d:	00 
 11f056e:	6a 07                	push   0x7
 11f0570:	5a                   	pop    rdx
 11f0571:	48 89 6c 24 18       	mov    QWORD PTR [rsp+0x18],rbp
 11f0576:	48 89 ee             	mov    rsi,rbp
 11f0579:	4c 89 e9             	mov    rcx,r13
 11f057c:	ff 50 18             	call   QWORD PTR [rax+0x18]
 11f057f:	4c 8d ab 20 07 00 00 	lea    r13,[rbx+0x720]
 11f0586:	48 8d ac 24 50 05 00 	lea    rbp,[rsp+0x550]
 11f058d:	00 
 11f058e:	4c 89 ef             	mov    rdi,r13
 11f0591:	48 89 ee             	mov    rsi,rbp
 11f0594:	e8 a5 94 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
 11f0599:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
 11f059d:	e8 e4 de 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f05a2:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
 11f05a9:	00 
 11f05aa:	e8 39 a2 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 11f05af:	4c 8d 84 24 b0 01 00 	lea    r8,[rsp+0x1b0]
 11f05b6:	00 
 11f05b7:	4c 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],r15
 11f05bc:	4d 89 38             	mov    QWORD PTR [r8],r15
 11f05bf:	48 8d 35 cb ca 8a ff 	lea    rsi,[rip+0xffffffffff8acacb]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 11f05c6:	48 8d 0d d9 5c 00 00 	lea    rcx,[rip+0x5cd9]        # 11f62a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b82a>
 11f05cd:	48 8d ac 24 c0 05 00 	lea    rbp,[rsp+0x5c0]
 11f05d4:	00 
 11f05d5:	6a 08                	push   0x8
### hit line 2294586
 11f0c09:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
 11f0c10:	00 
 11f0c11:	e8 7a d2 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11f0c16:	48 8b bc 24 68 06 00 	mov    rdi,QWORD PTR [rsp+0x668]
 11f0c1d:	00 
 11f0c1e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11f0c21:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11f0c24:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 11f0c27:	48 89 c7             	mov    rdi,rax
 11f0c2a:	ff 51 38             	call   QWORD PTR [rcx+0x38]
 11f0c2d:	48 8d b4 24 c0 05 00 	lea    rsi,[rsp+0x5c0]
 11f0c34:	00 
 11f0c35:	48 83 26 00          	and    QWORD PTR [rsi],0x0
 11f0c39:	48 8d 0d a0 71 7e ff 	lea    rcx,[rip+0xffffffffff7e71a0]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 11f0c40:	48 89 4e 10          	mov    QWORD PTR [rsi+0x10],rcx
 11f0c44:	48 83 a4 24 e0 04 00 	and    QWORD PTR [rsp+0x4e0],0x0
 11f0c4b:	00 00 
 11f0c4d:	48 8d 0d 8c 57 00 00 	lea    rcx,[rip+0x578c]        # 11f63e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b964>
 11f0c54:	48 89 4e 18          	mov    QWORD PTR [rsi+0x18],rcx
 11f0c58:	48 8d 0d 81 71 7e ff 	lea    rcx,[rip+0xffffffffff7e7181]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 11f0c5f:	48 89 8c 24 f0 04 00 	mov    QWORD PTR [rsp+0x4f0],rcx
 11f0c66:	00 
 11f0c67:	48 8d 0d 60 65 07 00 	lea    rcx,[rip+0x76560]        # 12671ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xac752>
 11f0c6e:	48 83 a4 24 50 05 00 	and    QWORD PTR [rsp+0x550],0x0
 11f0c75:	00 00 
 11f0c77:	48 89 8c 24 f8 04 00 	mov    QWORD PTR [rsp+0x4f8],rcx
 11f0c7e:	00 
 11f0c7f:	48 8d 0d 5a 71 7e ff 	lea    rcx,[rip+0xffffffffff7e715a]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 11f0c86:	48 89 8c 24 60 05 00 	mov    QWORD PTR [rsp+0x560],rcx
 11f0c8d:	00 
 11f0c8e:	48 8d 0d 93 66 07 00 	lea    rcx,[rip+0x76693]        # 1267328 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xac8ac>
 11f0c95:	48 89 8c 24 68 05 00 	mov    QWORD PTR [rsp+0x568],rcx
 11f0c9c:	00 
 11f0c9d:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 11f0ca2:	40 8a a9 dd 00 00 00 	mov    bpl,BYTE PTR [rcx+0xdd]
 11f0ca9:	48 89 83 68 0f 00 00 	mov    QWORD PTR [rbx+0xf68],rax
 11f0cb0:	48 8d bb 70 0f 00 00 	lea    rdi,[rbx+0xf70]
 11f0cb7:	e8 b0 0d 02 00       	call   1211a6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56ff0>
 11f0cbc:	48 83 a3 90 0f 00 00 	and    QWORD PTR [rbx+0xf90],0x0
 11f0cc3:	00 
 11f0cc4:	48 83 a3 a0 0f 00 00 	and    QWORD PTR [rbx+0xfa0],0x0
 11f0ccb:	00 
 11f0ccc:	48 8b 84 24 f0 04 00 	mov    rax,QWORD PTR [rsp+0x4f0]
 11f0cd3:	00 
 11f0cd4:	48 85 c0             	test   rax,rax
 11f0cd7:	4c 8b bc 24 50 06 00 	mov    r15,QWORD PTR [rsp+0x650]
 11f0cde:	00 
 11f0cdf:	74 33                	je     11f0d14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36298>
 11f0ce1:	48 8d b3 90 0f 00 00 	lea    rsi,[rbx+0xf90]
 11f0ce8:	48 89 83 a0 0f 00 00 	mov    QWORD PTR [rbx+0xfa0],rax
 11f0cef:	6a 01                	push   0x1
 11f0cf1:	5f                   	pop    rdi
 11f0cf2:	48 8d 94 24 e0 04 00 	lea    rdx,[rsp+0x4e0]
 11f0cf9:	00 
 11f0cfa:	ff d0                	call   rax
 11f0cfc:	48 8b 84 24 f8 04 00 	mov    rax,QWORD PTR [rsp+0x4f8]
 11f0d03:	00 
 11f0d04:	48 89 83 a8 0f 00 00 	mov    QWORD PTR [rbx+0xfa8],rax
 11f0d0b:	48 83 a4 24 f0 04 00 	and    QWORD PTR [rsp+0x4f0],0x0
 11f0d12:	00 00 
 11f0d14:	48 8d bb b0 0f 00 00 	lea    rdi,[rbx+0xfb0]
 11f0d1b:	4c 8d b4 24 50 05 00 	lea    r14,[rsp+0x550]
 11f0d22:	00 
 11f0d23:	4c 89 f6             	mov    rsi,r14
 11f0d26:	e8 13 37 ea ff       	call   109443e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b854>
 11f0d2b:	48 c7 83 d0 0f 00 00 	mov    QWORD PTR [rbx+0xfd0],0xf
 11f0d32:	0f 00 00 00 
 11f0d36:	48 c7 83 d8 0f 00 00 	mov    QWORD PTR [rbx+0xfd8],0xbb8
 11f0d3d:	b8 0b 00 00 
 11f0d41:	40 88 ab e0 0f 00 00 	mov    BYTE PTR [rbx+0xfe0],bpl
 11f0d48:	31 ed                	xor    ebp,ebp
 11f0d4a:	40 88 ab e8 0f 00 00 	mov    BYTE PTR [rbx+0xfe8],bpl
 11f0d51:	40 88 ab 18 10 00 00 	mov    BYTE PTR [rbx+0x1018],bpl
 11f0d58:	4c 89 f7             	mov    rdi,r14
 11f0d5b:	e8 9a 31 ea ff       	call   1093efa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b310>
 11f0d60:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 11f0d67:	00 
 11f0d68:	e8 83 56 00 00       	call   11f63f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b974>
 11f0d6d:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
 11f0d74:	00 
 11f0d75:	e8 9c 56 00 00       	call   11f6416 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b99a>
 11f0d7a:	66 0f ef c0          	pxor   xmm0,xmm0
 11f0d7e:	66 0f 7f 83 30 10 00 	movdqa XMMWORD PTR [rbx+0x1030],xmm0
 11f0d85:	00 
 11f0d86:	66 0f 7f 83 20 10 00 	movdqa XMMWORD PTR [rbx+0x1020],xmm0
 11f0d8d:	00 
 11f0d8e:	c7 83 40 10 00 00 00 	mov    DWORD PTR [rbx+0x1040],0x3f800000
 11f0d95:	00 80 3f 
 11f0d98:	40 88 ab 48 10 00 00 	mov    BYTE PTR [rbx+0x1048],bpl
 11f0d9f:	40 88 ab 48 11 00 00 	mov    BYTE PTR [rbx+0x1148],bpl
 11f0da6:	66 0f 7f 83 50 11 00 	movdqa XMMWORD PTR [rbx+0x1150],xmm0
 11f0dad:	00 
 11f0dae:	48 83 a3 60 11 00 00 	and    QWORD PTR [rbx+0x1160],0x0
 11f0db5:	00 
 11f0db6:	49 8b 07             	mov    rax,QWORD PTR [r15]
 11f0db9:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
 11f0dc0:	00 
 11f0dc1:	4c 89 fe             	mov    rsi,r15
 11f0dc4:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
 11f0dca:	48 8d 83 70 11 00 00 	lea    rax,[rbx+0x1170]
 11f0dd1:	66 0f ef c0          	pxor   xmm0,xmm0
 11f0dd5:	66 0f 7f 83 70 11 00 	movdqa XMMWORD PTR [rbx+0x1170],xmm0
 11f0ddc:	00 
 11f0ddd:	48 89 83 68 11 00 00 	mov    QWORD PTR [rbx+0x1168],rax
 11f0de4:	48 8d bb 80 11 00 00 	lea    rdi,[rbx+0x1180]
 11f0deb:	e8 9e 74 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
### hit line 2294801
 11f0ff3:	4c 8d ac 24 50 05 00 	lea    r13,[rsp+0x550]
 11f0ffa:	00 
 11f0ffb:	4c 89 ef             	mov    rdi,r13
 11f0ffe:	e8 8d ce 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11f1003:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 11f100a:	00 
 11f100b:	e8 40 81 00 00       	call   11f9150 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e6d4>
 11f1010:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
 11f1017:	00 
 11f1018:	e8 59 81 00 00       	call   11f9176 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e6fa>
 11f101d:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
 11f1024:	00 
 11f1025:	e8 66 ce 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11f102a:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 11f1031:	00 
 11f1032:	e8 59 ce 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11f1037:	48 83 a3 78 13 00 00 	and    QWORD PTR [rbx+0x1378],0x0
 11f103e:	00 
 11f103f:	48 8d ab 80 13 00 00 	lea    rbp,[rbx+0x1380]
 11f1046:	4c 89 b3 80 13 00 00 	mov    QWORD PTR [rbx+0x1380],r14
 11f104d:	4c 8d b3 88 13 00 00 	lea    r14,[rbx+0x1388]
 11f1054:	31 c0                	xor    eax,eax
 11f1056:	88 83 88 13 00 00    	mov    BYTE PTR [rbx+0x1388],al
 11f105c:	88 83 b0 14 00 00    	mov    BYTE PTR [rbx+0x14b0],al
 11f1062:	4c 8d bb b8 14 00 00 	lea    r15,[rbx+0x14b8]
 11f1069:	66 0f ef c0          	pxor   xmm0,xmm0
 11f106d:	f3 0f 7f 83 b8 14 00 	movdqu XMMWORD PTR [rbx+0x14b8],xmm0
 11f1074:	00 
 11f1075:	48 83 a3 c8 14 00 00 	and    QWORD PTR [rbx+0x14c8],0x0
 11f107c:	00 
 11f107d:	4c 8d a3 d0 14 00 00 	lea    r12,[rbx+0x14d0]
 11f1084:	4c 89 e7             	mov    rdi,r12
 11f1087:	e8 6a 89 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 11f108c:	49 89 6d 00          	mov    QWORD PTR [r13+0x0],rbp
 11f1090:	48 8d 35 fa bf 8a ff 	lea    rsi,[rip+0xffffffffff8abffa]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 11f1097:	48 8d 0d 4c 98 00 00 	lea    rcx,[rip+0x984c]        # 11fa8ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fe6e>
 11f109e:	4c 8d ac 24 c0 05 00 	lea    r13,[rsp+0x5c0]
 11f10a5:	00 
 11f10a6:	4c 8d 84 24 50 05 00 	lea    r8,[rsp+0x550]
 11f10ad:	00 
 11f10ae:	6a 08                	push   0x8
 11f10b0:	41 59                	pop    r9
 11f10b2:	4c 89 ef             	mov    rdi,r13
 11f10b5:	31 d2                	xor    edx,edx
 11f10b7:	e8 d8 96 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 11f10bc:	48 8b ac 24 50 06 00 	mov    rbp,QWORD PTR [rsp+0x650]
 11f10c3:	00 
 11f10c4:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
 11f10c8:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 11f10cf:	00 
 11f10d0:	48 89 ee             	mov    rsi,rbp
 11f10d3:	31 d2                	xor    edx,edx
 11f10d5:	4c 89 e9             	mov    rcx,r13
 11f10d8:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
 11f10de:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
 11f10e5:	00 
 11f10e6:	4c 89 e7             	mov    rdi,r12
 11f10e9:	4c 89 f6             	mov    rsi,r14
 11f10ec:	e8 01 8b 5e 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 11f10f1:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 11f10f5:	e8 8c d3 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f10fa:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
 11f1101:	00 
 11f1102:	e8 e1 96 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 11f1107:	48 8d 05 82 cb 66 00 	lea    rax,[rip+0x66cb82]        # 185dc90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a378>
 11f110e:	48 89 83 e0 14 00 00 	mov    QWORD PTR [rbx+0x14e0],rax
 11f1115:	83 a3 e8 14 00 00 00 	and    DWORD PTR [rbx+0x14e8],0x0
 11f111c:	4c 8d bb e0 14 00 00 	lea    r15,[rbx+0x14e0]
 11f1123:	48 8d bb f0 14 00 00 	lea    rdi,[rbx+0x14f0]
 11f112a:	45 31 f6             	xor    r14d,r14d
 11f112d:	44 88 b3 a0 15 00 00 	mov    BYTE PTR [rbx+0x15a0],r14b
 11f1134:	44 88 b3 a8 15 00 00 	mov    BYTE PTR [rbx+0x15a8],r14b
 11f113b:	44 88 b3 b0 15 00 00 	mov    BYTE PTR [rbx+0x15b0],r14b
 11f1142:	44 88 b3 b8 15 00 00 	mov    BYTE PTR [rbx+0x15b8],r14b
 11f1149:	44 88 b3 c0 15 00 00 	mov    BYTE PTR [rbx+0x15c0],r14b
 11f1150:	44 88 b3 c8 15 00 00 	mov    BYTE PTR [rbx+0x15c8],r14b
 11f1157:	44 88 b3 d0 15 00 00 	mov    BYTE PTR [rbx+0x15d0],r14b
 11f115e:	44 88 b3 d8 15 00 00 	mov    BYTE PTR [rbx+0x15d8],r14b
 11f1165:	ba a9 00 00 00       	mov    edx,0xa9
 11f116a:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
 11f116f:	31 f6                	xor    esi,esi
 11f1171:	e8 1a da 5f 00       	call   17eeb90 <memset@plt>
 11f1176:	44 88 b3 30 16 00 00 	mov    BYTE PTR [rbx+0x1630],r14b
 11f117d:	48 8d bb 38 16 00 00 	lea    rdi,[rbx+0x1638]
 11f1184:	66 0f ef c0          	pxor   xmm0,xmm0
 11f1188:	66 0f 7f 83 e0 15 00 	movdqa XMMWORD PTR [rbx+0x15e0],xmm0
 11f118f:	00 
 11f1190:	66 0f 7f 83 f0 15 00 	movdqa XMMWORD PTR [rbx+0x15f0],xmm0
 11f1197:	00 
 11f1198:	66 0f 7f 83 00 16 00 	movdqa XMMWORD PTR [rbx+0x1600],xmm0
 11f119f:	00 
 11f11a0:	44 88 b3 10 16 00 00 	mov    BYTE PTR [rbx+0x1610],r14b
 11f11a7:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
 11f11ae:	00 
 11f11af:	e8 da 70 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 11f11b4:	83 a3 90 16 00 00 00 	and    DWORD PTR [rbx+0x1690],0x0
 11f11bb:	48 89 ab 98 16 00 00 	mov    QWORD PTR [rbx+0x1698],rbp
 11f11c2:	4c 8d a3 a0 16 00 00 	lea    r12,[rbx+0x16a0]
 11f11c9:	4c 89 e7             	mov    rdi,r12
 11f11cc:	48 8b b4 24 60 06 00 	mov    rsi,QWORD PTR [rsp+0x660]
 11f11d3:	00 
 11f11d4:	e8 e9 04 5d 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 11f11d9:	4c 8d ab b0 16 00 00 	lea    r13,[rbx+0x16b0]
 11f11e0:	4c 89 ef             	mov    rdi,r13
 11f11e3:	e8 0e 88 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 11f11e8:	44 88 b3 e0 16 00 00 	mov    BYTE PTR [rbx+0x16e0],r14b
### hit line 2297147
 11f3645:	74 05                	je     11f364c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38bd0>
 11f3647:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
 11f364c:	48 8b 83 d0 0e 00 00 	mov    rax,QWORD PTR [rbx+0xed0]
 11f3653:	48 89 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rax
 11f365a:	00 
 11f365b:	44 8b a9 ac 00 00 00 	mov    r13d,DWORD PTR [rcx+0xac]
 11f3662:	48 8b 83 28 1a 00 00 	mov    rax,QWORD PTR [rbx+0x1a28]
 11f3669:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
 11f3670:	00 
 11f3671:	8a 81 d0 00 00 00    	mov    al,BYTE PTR [rcx+0xd0]
 11f3677:	88 84 24 e0 00 00 00 	mov    BYTE PTR [rsp+0xe0],al
 11f367e:	48 8b 84 24 d0 06 00 	mov    rax,QWORD PTR [rsp+0x6d0]
 11f3685:	00 
 11f3686:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 11f3689:	e8 38 2c cb ff       	call   ea62c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6dc>
 11f368e:	89 84 24 dc 00 00 00 	mov    DWORD PTR [rsp+0xdc],eax
 11f3695:	4c 89 e8             	mov    rax,r13
 11f3698:	48 c1 e0 20          	shl    rax,0x20
 11f369c:	48 b9 00 00 00 00 01 	movabs rcx,0x100000000
 11f36a3:	00 00 00 
 11f36a6:	48 01 c1             	add    rcx,rax
 11f36a9:	41 83 fd 04          	cmp    r13d,0x4
 11f36ad:	49 bd 00 00 00 00 03 	movabs r13,0x300000000
 11f36b4:	00 00 00 
 11f36b7:	4c 0f 42 e9          	cmovb  r13,rcx
 11f36bb:	48 8b 84 24 10 07 00 	mov    rax,QWORD PTR [rsp+0x710]
 11f36c2:	00 
 11f36c3:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
 11f36c6:	0f 29 84 24 50 05 00 	movaps XMMWORD PTR [rsp+0x550],xmm0
 11f36cd:	00 
 11f36ce:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
 11f36d2:	48 89 84 24 60 05 00 	mov    QWORD PTR [rsp+0x560],rax
 11f36d9:	00 
 11f36da:	48 8d 05 67 92 66 00 	lea    rax,[rip+0x669267]        # 185c948 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19030>
 11f36e1:	48 89 83 20 1f 00 00 	mov    QWORD PTR [rbx+0x1f20],rax
 11f36e8:	48 89 ab 28 1f 00 00 	mov    QWORD PTR [rbx+0x1f28],rbp
 11f36ef:	4c 89 bb 30 1f 00 00 	mov    QWORD PTR [rbx+0x1f30],r15
 11f36f6:	48 8b 84 24 98 06 00 	mov    rax,QWORD PTR [rsp+0x698]
 11f36fd:	00 
 11f36fe:	48 89 83 38 1f 00 00 	mov    QWORD PTR [rbx+0x1f38],rax
 11f3705:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 11f370a:	48 89 83 40 1f 00 00 	mov    QWORD PTR [rbx+0x1f40],rax
 11f3711:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
 11f3718:	00 
 11f3719:	48 89 83 48 1f 00 00 	mov    QWORD PTR [rbx+0x1f48],rax
 11f3720:	48 8b 84 24 50 06 00 	mov    rax,QWORD PTR [rsp+0x650]
 11f3727:	00 
 11f3728:	48 89 83 50 1f 00 00 	mov    QWORD PTR [rbx+0x1f50],rax
 11f372f:	48 8d bb 58 1f 00 00 	lea    rdi,[rbx+0x1f58]
 11f3736:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
 11f373d:	00 
 11f373e:	e8 29 e3 01 00       	call   1211a6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56ff0>
 11f3743:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
 11f3748:	48 89 83 78 1f 00 00 	mov    QWORD PTR [rbx+0x1f78],rax
 11f374f:	48 8b 84 24 f8 00 00 	mov    rax,QWORD PTR [rsp+0xf8]
 11f3756:	00 
 11f3757:	48 89 83 80 1f 00 00 	mov    QWORD PTR [rbx+0x1f80],rax
 11f375e:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 11f3763:	48 89 83 88 1f 00 00 	mov    QWORD PTR [rbx+0x1f88],rax
 11f376a:	48 8b 84 24 b8 00 00 	mov    rax,QWORD PTR [rsp+0xb8]
 11f3771:	00 
 11f3772:	48 89 83 90 1f 00 00 	mov    QWORD PTR [rbx+0x1f90],rax
 11f3779:	48 8b 84 24 60 06 00 	mov    rax,QWORD PTR [rsp+0x660]
 11f3780:	00 
 11f3781:	48 89 83 98 1f 00 00 	mov    QWORD PTR [rbx+0x1f98],rax
 11f3788:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 11f378d:	48 89 83 a0 1f 00 00 	mov    QWORD PTR [rbx+0x1fa0],rax
 11f3794:	48 8b 84 24 b0 00 00 	mov    rax,QWORD PTR [rsp+0xb0]
 11f379b:	00 
 11f379c:	48 89 83 a8 1f 00 00 	mov    QWORD PTR [rbx+0x1fa8],rax
 11f37a3:	4c 89 a3 b0 1f 00 00 	mov    QWORD PTR [rbx+0x1fb0],r12
 11f37aa:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 11f37af:	48 89 83 b8 1f 00 00 	mov    QWORD PTR [rbx+0x1fb8],rax
 11f37b6:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 11f37bb:	48 89 83 c0 1f 00 00 	mov    QWORD PTR [rbx+0x1fc0],rax
 11f37c2:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
 11f37c7:	48 89 83 c8 1f 00 00 	mov    QWORD PTR [rbx+0x1fc8],rax
 11f37ce:	48 8b 84 24 e8 06 00 	mov    rax,QWORD PTR [rsp+0x6e8]
 11f37d5:	00 
 11f37d6:	48 89 83 d0 1f 00 00 	mov    QWORD PTR [rbx+0x1fd0],rax
 11f37dd:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
 11f37e2:	48 89 83 d8 1f 00 00 	mov    QWORD PTR [rbx+0x1fd8],rax
 11f37e9:	0f 10 84 24 39 03 00 	movups xmm0,XMMWORD PTR [rsp+0x339]
 11f37f0:	00 
 11f37f1:	0f 11 83 f9 1f 00 00 	movups XMMWORD PTR [rbx+0x1ff9],xmm0
 11f37f8:	66 0f 6f 84 24 20 03 	movdqa xmm0,XMMWORD PTR [rsp+0x320]
 11f37ff:	00 00 
 11f3801:	0f 28 8c 24 30 03 00 	movaps xmm1,XMMWORD PTR [rsp+0x330]
 11f3808:	00 
 11f3809:	0f 29 8b f0 1f 00 00 	movaps XMMWORD PTR [rbx+0x1ff0],xmm1
 11f3810:	66 0f 7f 83 e0 1f 00 	movdqa XMMWORD PTR [rbx+0x1fe0],xmm0
 11f3817:	00 
 11f3818:	48 8b bc 24 70 03 00 	mov    rdi,QWORD PTR [rsp+0x370]
 11f381f:	00 
 11f3820:	48 85 ff             	test   rdi,rdi
 11f3823:	74 0d                	je     11f3832 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38db6>
 11f3825:	4c 39 f7             	cmp    rdi,r14
 11f3828:	74 13                	je     11f383d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38dc1>
 11f382a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11f382d:	ff 50 10             	call   QWORD PTR [rax+0x10]
 11f3830:	eb 02                	jmp    11f3834 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38db8>
 11f3832:	31 c0                	xor    eax,eax
 11f3834:	48 89 83 30 20 00 00 	mov    QWORD PTR [rbx+0x2030],rax
 11f383b:	eb 1c                	jmp    11f3859 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38ddd>
 11f383d:	48 8d b3 10 20 00 00 	lea    rsi,[rbx+0x2010]
 11f3844:	48 89 b3 30 20 00 00 	mov    QWORD PTR [rbx+0x2030],rsi
### hit line 2297394
 11f3af8:	e8 f3 43 8e ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
 11f3afd:	48 8d 35 af 3f 18 ff 	lea    rsi,[rip+0xffffffffff183faf]        # 377ab3 <_ZTSSt12bad_any_cast@@Base-0x18715>
 11f3b04:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
 11f3b0b:	00 
 11f3b0c:	e8 6d 5f 88 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 11f3b11:	48 8d bb 30 23 00 00 	lea    rdi,[rbx+0x2330]
 11f3b18:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]
 11f3b1f:	00 
 11f3b20:	48 8b b4 24 60 06 00 	mov    rsi,QWORD PTR [rsp+0x660]
 11f3b27:	00 
 11f3b28:	4c 89 f2             	mov    rdx,r14
 11f3b2b:	e8 ea db 5c 00       	call   17c171a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175886>
 11f3b30:	4c 89 f7             	mov    rdi,r14
 11f3b33:	e8 58 a3 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11f3b38:	66 0f ef c0          	pxor   xmm0,xmm0
 11f3b3c:	66 0f 7f 83 40 23 00 	movdqa XMMWORD PTR [rbx+0x2340],xmm0
 11f3b43:	00 
 11f3b44:	48 8d bb 50 23 00 00 	lea    rdi,[rbx+0x2350]
 11f3b4b:	e8 8a 71 03 00       	call   122acda <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7025e>
 11f3b50:	48 8d bc 24 f0 02 00 	lea    rdi,[rsp+0x2f0]
 11f3b57:	00 
 11f3b58:	e8 0d 64 88 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 11f3b5d:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]
 11f3b62:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11f3b65:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
 11f3b6c:	00 
 11f3b6d:	ff 50 30             	call   QWORD PTR [rax+0x30]
 11f3b70:	48 8d 93 f0 22 00 00 	lea    rdx,[rbx+0x22f0]
 11f3b77:	48 8b 84 24 c0 05 00 	mov    rax,QWORD PTR [rsp+0x5c0]
 11f3b7e:	00 
 11f3b7f:	48 8d 0d 4a 7e 66 00 	lea    rcx,[rip+0x667e4a]        # 185b9d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x180b8>
 11f3b86:	48 89 8b f0 29 00 00 	mov    QWORD PTR [rbx+0x29f0],rcx
 11f3b8d:	48 89 54 24 38       	mov    QWORD PTR [rsp+0x38],rdx
 11f3b92:	48 89 93 f8 29 00 00 	mov    QWORD PTR [rbx+0x29f8],rdx
 11f3b99:	48 89 83 00 2a 00 00 	mov    QWORD PTR [rbx+0x2a00],rax
 11f3ba0:	48 8b bc 24 c8 05 00 	mov    rdi,QWORD PTR [rsp+0x5c8]
 11f3ba7:	00 
 11f3ba8:	e8 d9 a8 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f3bad:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]
 11f3bb2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11f3bb5:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
 11f3bbc:	00 
 11f3bbd:	ff 50 30             	call   QWORD PTR [rax+0x30]
 11f3bc0:	4c 8b b4 24 50 05 00 	mov    r14,QWORD PTR [rsp+0x550]
 11f3bc7:	00 
 11f3bc8:	48 8b b4 24 50 06 00 	mov    rsi,QWORD PTR [rsp+0x650]
 11f3bcf:	00 
 11f3bd0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11f3bd3:	48 8d bc 24 c0 02 00 	lea    rdi,[rsp+0x2c0]
 11f3bda:	00 
 11f3bdb:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
 11f3be1:	4c 89 b3 08 2a 00 00 	mov    QWORD PTR [rbx+0x2a08],r14
 11f3be8:	4c 8b a4 24 c0 06 00 	mov    r12,QWORD PTR [rsp+0x6c0]
 11f3bef:	00 
 11f3bf0:	4c 89 a3 10 2a 00 00 	mov    QWORD PTR [rbx+0x2a10],r12
 11f3bf7:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 11f3bfc:	8b 81 d4 00 00 00    	mov    eax,DWORD PTR [rcx+0xd4]
 11f3c02:	89 83 18 2a 00 00    	mov    DWORD PTR [rbx+0x2a18],eax
 11f3c08:	8b 81 d8 00 00 00    	mov    eax,DWORD PTR [rcx+0xd8]
 11f3c0e:	89 83 1c 2a 00 00    	mov    DWORD PTR [rbx+0x2a1c],eax
 11f3c14:	48 8d bb 20 2a 00 00 	lea    rdi,[rbx+0x2a20]
 11f3c1b:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
 11f3c20:	e8 d1 5d 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 11f3c25:	4c 8d ab 30 2a 00 00 	lea    r13,[rbx+0x2a30]
 11f3c2c:	4c 89 ef             	mov    rdi,r13
 11f3c2f:	e8 c2 5d 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 11f3c34:	48 8d bb 40 2a 00 00 	lea    rdi,[rbx+0x2a40]
 11f3c3b:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
 11f3c40:	e8 b1 5d 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 11f3c45:	66 0f ef c0          	pxor   xmm0,xmm0
 11f3c49:	66 0f 7f 83 80 2a 00 	movdqa XMMWORD PTR [rbx+0x2a80],xmm0
 11f3c50:	00 
 11f3c51:	66 0f 7f 83 70 2a 00 	movdqa XMMWORD PTR [rbx+0x2a70],xmm0
 11f3c58:	00 
 11f3c59:	66 0f 7f 83 60 2a 00 	movdqa XMMWORD PTR [rbx+0x2a60],xmm0
 11f3c60:	00 
 11f3c61:	66 0f 7f 83 50 2a 00 	movdqa XMMWORD PTR [rbx+0x2a50],xmm0
 11f3c68:	00 
 11f3c69:	48 83 a3 90 2a 00 00 	and    QWORD PTR [rbx+0x2a90],0x0
 11f3c70:	00 
 11f3c71:	48 8d 35 52 c7 13 ff 	lea    rsi,[rip+0xffffffffff13c752]        # 3303ca <_ZTSSt12bad_any_cast@@Base-0x5fdfe>
 11f3c78:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
 11f3c7f:	00 
 11f3c80:	4c 89 ac 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r13
 11f3c87:	00 
 11f3c88:	e8 f1 5d 88 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 11f3c8d:	4c 8d bb 08 2a 00 00 	lea    r15,[rbx+0x2a08]
 11f3c94:	48 8d 94 24 e0 04 00 	lea    rdx,[rsp+0x4e0]
 11f3c9b:	00 
 11f3c9c:	c6 02 01             	mov    BYTE PTR [rdx],0x1
 11f3c9f:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 11f3ca3:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]
 11f3caa:	00 
 11f3cab:	4c 89 f6             	mov    rsi,r14
 11f3cae:	e8 ab 9a 99 ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>
 11f3cb3:	89 c5                	mov    ebp,eax
 11f3cb5:	4c 89 f7             	mov    rdi,r14
 11f3cb8:	e8 d3 a1 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11f3cbd:	40 88 ab 98 2a 00 00 	mov    BYTE PTR [rbx+0x2a98],bpl
 11f3cc4:	66 83 a3 99 2a 00 00 	and    WORD PTR [rbx+0x2a99],0x0
 11f3ccb:	00 
 11f3ccc:	48 8b 84 24 c8 06 00 	mov    rax,QWORD PTR [rsp+0x6c8]
 11f3cd3:	00 
 11f3cd4:	48 89 83 a0 2a 00 00 	mov    QWORD PTR [rbx+0x2aa0],rax
 11f3cdb:	45 31 f6             	xor    r14d,r14d
 11f3cde:	44 88 b3 a8 2a 00 00 	mov    BYTE PTR [rbx+0x2aa8],r14b
### hit line 2297640
 11f3f3c:	00 
 11f3f3d:	4d 89 20             	mov    QWORD PTR [r8],r12
 11f3f40:	48 8d 35 4a 91 8a ff 	lea    rsi,[rip+0xffffffffff8a914a]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 11f3f47:	48 8d 0d 1e 1f 02 00 	lea    rcx,[rip+0x21f1e]        # 1215e6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b3f0>
 11f3f4e:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]
 11f3f55:	00 
 11f3f56:	6a 08                	push   0x8
 11f3f58:	41 59                	pop    r9
 11f3f5a:	4c 89 f7             	mov    rdi,r14
 11f3f5d:	31 d2                	xor    edx,edx
 11f3f5f:	e8 30 68 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 11f3f64:	48 8b 83 a8 05 00 00 	mov    rax,QWORD PTR [rbx+0x5a8]
 11f3f6b:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 11f3f72:	00 
 11f3f73:	6a 02                	push   0x2
 11f3f75:	5a                   	pop    rdx
 11f3f76:	4c 8b 64 24 18       	mov    r12,QWORD PTR [rsp+0x18]
 11f3f7b:	4c 89 e6             	mov    rsi,r12
 11f3f7e:	4c 89 f1             	mov    rcx,r14
 11f3f81:	ff 50 18             	call   QWORD PTR [rax+0x18]
 11f3f84:	4c 8b bc 24 40 07 00 	mov    r15,QWORD PTR [rsp+0x740]
 11f3f8b:	00 
 11f3f8c:	48 8d bb a8 4a 00 00 	lea    rdi,[rbx+0x4aa8]
 11f3f93:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
 11f3f9a:	00 
 11f3f9b:	4c 89 f6             	mov    rsi,r14
 11f3f9e:	e8 9b 5a 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
 11f3fa3:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 11f3fa7:	e8 da a4 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f3fac:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
 11f3fb3:	00 
 11f3fb4:	e8 2f 68 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 11f3fb9:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
 11f3fbd:	48 89 83 c8 4a 00 00 	mov    QWORD PTR [rbx+0x4ac8],rax
 11f3fc4:	f3 41 0f 6f 07       	movdqu xmm0,XMMWORD PTR [r15]
 11f3fc9:	f3 0f 7f 83 b8 4a 00 	movdqu XMMWORD PTR [rbx+0x4ab8],xmm0
 11f3fd0:	00 
 11f3fd1:	66 0f ef c0          	pxor   xmm0,xmm0
 11f3fd5:	f3 41 0f 7f 07       	movdqu XMMWORD PTR [r15],xmm0
 11f3fda:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
 11f3fdf:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
 11f3fe6:	00 
 11f3fe7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11f3fea:	4c 89 e6             	mov    rsi,r12
 11f3fed:	ff 50 30             	call   QWORD PTR [rax+0x30]
 11f3ff0:	48 8b b4 24 50 06 00 	mov    rsi,QWORD PTR [rsp+0x650]
 11f3ff7:	00 
 11f3ff8:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11f3ffb:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 11f4002:	00 
 11f4003:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
 11f4009:	4c 8b b4 24 a0 06 00 	mov    r14,QWORD PTR [rsp+0x6a0]
 11f4010:	00 
 11f4011:	49 8b 06             	mov    rax,QWORD PTR [r14]
 11f4014:	48 8d 94 24 e0 04 00 	lea    rdx,[rsp+0x4e0]
 11f401b:	00 
 11f401c:	4c 89 f7             	mov    rdi,r14
 11f401f:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
 11f4024:	ff 50 48             	call   QWORD PTR [rax+0x48]
 11f4027:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 11f402e:	00 
 11f402f:	e8 08 24 00 00       	call   11f643c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b9c0>
 11f4034:	49 8b 06             	mov    rax,QWORD PTR [r14]
 11f4037:	4c 89 f7             	mov    rdi,r14
 11f403a:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11f403d:	49 89 c6             	mov    r14,rax
 11f4040:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]
 11f4045:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11f4048:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
 11f404f:	00 
 11f4050:	ff 50 30             	call   QWORD PTR [rax+0x30]
 11f4053:	4c 8b ac 24 80 05 00 	mov    r13,QWORD PTR [rsp+0x580]
 11f405a:	00 
 11f405b:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
 11f4062:	00 
 11f4063:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11f4066:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11f4069:	49 89 c7             	mov    r15,rax
 11f406c:	48 8b bc 24 68 06 00 	mov    rdi,QWORD PTR [rsp+0x668]
 11f4073:	00 
 11f4074:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11f4077:	ff 50 38             	call   QWORD PTR [rax+0x38]
 11f407a:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 11f407f:	4c 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],r15
 11f4084:	48 8b 83 d0 0e 00 00 	mov    rax,QWORD PTR [rbx+0xed0]
 11f408b:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 11f4090:	48 83 a4 24 20 05 00 	and    QWORD PTR [rsp+0x520],0x0
 11f4097:	00 00 
 11f4099:	48 8d 05 40 3d 7e ff 	lea    rax,[rip+0xffffffffff7e3d40]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 11f40a0:	48 89 84 24 30 05 00 	mov    QWORD PTR [rsp+0x530],rax
 11f40a7:	00 
 11f40a8:	48 8d 05 cb ed 95 ff 	lea    rax,[rip+0xffffffffff95edcb]        # b52e7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9fe1a>
 11f40af:	48 89 84 24 38 05 00 	mov    QWORD PTR [rsp+0x538],rax
 11f40b6:	00 
 11f40b7:	48 8b 83 28 1a 00 00 	mov    rax,QWORD PTR [rbx+0x1a28]
 11f40be:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
 11f40c5:	00 
 11f40c6:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
 11f40cb:	41 0f b6 84 24 b1 00 	movzx  eax,BYTE PTR [r12+0xb1]
 11f40d2:	00 00 
 11f40d4:	89 84 24 80 00 00 00 	mov    DWORD PTR [rsp+0x80],eax
 11f40db:	bf 98 20 00 00       	mov    edi,0x2098
 11f40e0:	e8 1b 9e 5f 00       	call   17edf00 <_Znwm@plt>
 11f40e5:	49 89 c7             	mov    r15,rax
 11f40e8:	48 8d ab b8 4a 00 00 	lea    rbp,[rbx+0x4ab8]
 11f40ef:	66 0f ef c0          	pxor   xmm0,xmm0
### hit line 2297721
 11f4077:	ff 50 38             	call   QWORD PTR [rax+0x38]
 11f407a:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 11f407f:	4c 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],r15
 11f4084:	48 8b 83 d0 0e 00 00 	mov    rax,QWORD PTR [rbx+0xed0]
 11f408b:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 11f4090:	48 83 a4 24 20 05 00 	and    QWORD PTR [rsp+0x520],0x0
 11f4097:	00 00 
 11f4099:	48 8d 05 40 3d 7e ff 	lea    rax,[rip+0xffffffffff7e3d40]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 11f40a0:	48 89 84 24 30 05 00 	mov    QWORD PTR [rsp+0x530],rax
 11f40a7:	00 
 11f40a8:	48 8d 05 cb ed 95 ff 	lea    rax,[rip+0xffffffffff95edcb]        # b52e7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9fe1a>
 11f40af:	48 89 84 24 38 05 00 	mov    QWORD PTR [rsp+0x538],rax
 11f40b6:	00 
 11f40b7:	48 8b 83 28 1a 00 00 	mov    rax,QWORD PTR [rbx+0x1a28]
 11f40be:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
 11f40c5:	00 
 11f40c6:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
 11f40cb:	41 0f b6 84 24 b1 00 	movzx  eax,BYTE PTR [r12+0xb1]
 11f40d2:	00 00 
 11f40d4:	89 84 24 80 00 00 00 	mov    DWORD PTR [rsp+0x80],eax
 11f40db:	bf 98 20 00 00       	mov    edi,0x2098
 11f40e0:	e8 1b 9e 5f 00       	call   17edf00 <_Znwm@plt>
 11f40e5:	49 89 c7             	mov    r15,rax
 11f40e8:	48 8d ab b8 4a 00 00 	lea    rbp,[rbx+0x4ab8]
 11f40ef:	66 0f ef c0          	pxor   xmm0,xmm0
 11f40f3:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
 11f40f8:	48 8d 05 81 79 66 00 	lea    rax,[rip+0x667981]        # 185ba80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18168>
 11f40ff:	49 89 07             	mov    QWORD PTR [r15],rax
 11f4102:	41 8a 84 24 88 00 00 	mov    al,BYTE PTR [r12+0x88]
 11f4109:	00 
 11f410a:	88 44 24 60          	mov    BYTE PTR [rsp+0x60],al
 11f410e:	41 8a 84 24 89 00 00 	mov    al,BYTE PTR [r12+0x89]
 11f4115:	00 
 11f4116:	88 84 24 b0 00 00 00 	mov    BYTE PTR [rsp+0xb0],al
 11f411d:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
 11f4124:	00 
 11f4125:	48 8d b4 24 20 05 00 	lea    rsi,[rsp+0x520]
 11f412c:	00 
 11f412d:	e8 34 1a 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
 11f4132:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 11f4139:	00 
 11f413a:	48 89 ee             	mov    rsi,rbp
 11f413d:	e8 fe 9d 5f 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 11f4142:	48 8d 05 3f 7e 66 00 	lea    rax,[rip+0x667e3f]        # 185bf88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18670>
 11f4149:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
 11f414d:	48 8b 84 24 50 06 00 	mov    rax,QWORD PTR [rsp+0x650]
 11f4154:	00 
 11f4155:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
 11f4159:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
 11f415e:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
 11f4162:	48 8d 83 88 5d 00 00 	lea    rax,[rbx+0x5d88]
 11f4169:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
 11f416d:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
 11f4172:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
 11f4176:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
 11f417d:	00 
 11f417e:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
 11f4182:	4d 89 77 48          	mov    QWORD PTR [r15+0x48],r14
 11f4186:	48 8d 83 f0 19 00 00 	lea    rax,[rbx+0x19f0]
 11f418d:	49 89 47 50          	mov    QWORD PTR [r15+0x50],rax
 11f4191:	48 8b 84 24 18 01 00 	mov    rax,QWORD PTR [rsp+0x118]
 11f4198:	00 
 11f4199:	49 89 47 58          	mov    QWORD PTR [r15+0x58],rax
 11f419d:	4d 89 6f 60          	mov    QWORD PTR [r15+0x60],r13
 11f41a1:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 11f41a6:	49 89 47 68          	mov    QWORD PTR [r15+0x68],rax
 11f41aa:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
 11f41af:	49 89 47 70          	mov    QWORD PTR [r15+0x70],rax
 11f41b3:	48 8b 84 24 40 06 00 	mov    rax,QWORD PTR [rsp+0x640]
 11f41ba:	00 
 11f41bb:	49 89 47 78          	mov    QWORD PTR [r15+0x78],rax
 11f41bf:	49 8d 6f 18          	lea    rbp,[r15+0x18]
 11f41c3:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 11f41c8:	49 89 87 80 00 00 00 	mov    QWORD PTR [r15+0x80],rax
 11f41cf:	48 8b 84 24 60 06 00 	mov    rax,QWORD PTR [rsp+0x660]
 11f41d6:	00 
 11f41d7:	49 89 87 88 00 00 00 	mov    QWORD PTR [r15+0x88],rax
 11f41de:	4d 8d a7 90 00 00 00 	lea    r12,[r15+0x90]
 11f41e5:	48 8d b4 24 50 05 00 	lea    rsi,[rsp+0x550]
 11f41ec:	00 
 11f41ed:	4c 89 e7             	mov    rdi,r12
 11f41f0:	e8 71 19 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
 11f41f5:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 11f41fa:	49 89 87 b0 00 00 00 	mov    QWORD PTR [r15+0xb0],rax
 11f4201:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
 11f4206:	49 89 87 b8 00 00 00 	mov    QWORD PTR [r15+0xb8],rax
 11f420d:	48 8b 84 24 c0 01 00 	mov    rax,QWORD PTR [rsp+0x1c0]
 11f4214:	00 
 11f4215:	49 89 87 d0 00 00 00 	mov    QWORD PTR [r15+0xd0],rax
 11f421c:	66 0f 6f 84 24 b0 01 	movdqa xmm0,XMMWORD PTR [rsp+0x1b0]
 11f4223:	00 00 
 11f4225:	f3 41 0f 7f 87 c0 00 	movdqu XMMWORD PTR [r15+0xc0],xmm0
 11f422c:	00 00 
 11f422e:	48 83 a4 24 c0 01 00 	and    QWORD PTR [rsp+0x1c0],0x0
 11f4235:	00 00 
 11f4237:	66 0f ef c0          	pxor   xmm0,xmm0
 11f423b:	66 0f 7f 84 24 b0 01 	movdqa XMMWORD PTR [rsp+0x1b0],xmm0
 11f4242:	00 00 
 11f4244:	8b 84 24 80 00 00 00 	mov    eax,DWORD PTR [rsp+0x80]
 11f424b:	41 89 87 d8 00 00 00 	mov    DWORD PTR [r15+0xd8],eax
 11f4252:	f3 41 0f 7f 87 e0 00 	movdqu XMMWORD PTR [r15+0xe0],xmm0
 11f4259:	00 00 
 11f425b:	49 8d bf f0 00 00 00 	lea    rdi,[r15+0xf0]
 11f4262:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
 11f4269:	00 
 11f426a:	e8 bb 68 47 00       	call   166ab2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ec96>
### hit line 2297938
 11f4445:	e8 ac 55 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 11f444a:	31 c0                	xor    eax,eax
 11f444c:	41 88 87 d8 11 00 00 	mov    BYTE PTR [r15+0x11d8],al
 11f4453:	66 0f ef c0          	pxor   xmm0,xmm0
 11f4457:	f3 41 0f 7f 87 b8 11 	movdqu XMMWORD PTR [r15+0x11b8],xmm0
 11f445e:	00 00 
 11f4460:	f3 41 0f 7f 87 c1 11 	movdqu XMMWORD PTR [r15+0x11c1],xmm0
 11f4467:	00 00 
 11f4469:	8a 4c 24 60          	mov    cl,BYTE PTR [rsp+0x60]
 11f446d:	41 88 8f e0 11 00 00 	mov    BYTE PTR [r15+0x11e0],cl
 11f4474:	8a 8c 24 b0 00 00 00 	mov    cl,BYTE PTR [rsp+0xb0]
 11f447b:	41 88 8f e1 11 00 00 	mov    BYTE PTR [r15+0x11e1],cl
 11f4482:	48 8b 8c 24 c0 00 00 	mov    rcx,QWORD PTR [rsp+0xc0]
 11f4489:	00 
 11f448a:	49 89 8f e8 11 00 00 	mov    QWORD PTR [r15+0x11e8],rcx
 11f4491:	48 8b 8c 24 98 00 00 	mov    rcx,QWORD PTR [rsp+0x98]
 11f4498:	00 
 11f4499:	49 89 8f f0 11 00 00 	mov    QWORD PTR [r15+0x11f0],rcx
 11f44a0:	48 8b 8c 24 a0 00 00 	mov    rcx,QWORD PTR [rsp+0xa0]
 11f44a7:	00 
 11f44a8:	49 89 8f f8 11 00 00 	mov    QWORD PTR [r15+0x11f8],rcx
 11f44af:	4d 89 a7 00 12 00 00 	mov    QWORD PTR [r15+0x1200],r12
 11f44b6:	41 88 87 80 1f 00 00 	mov    BYTE PTR [r15+0x1f80],al
 11f44bd:	41 88 87 e8 1f 00 00 	mov    BYTE PTR [r15+0x1fe8],al
 11f44c4:	41 88 87 f0 1f 00 00 	mov    BYTE PTR [r15+0x1ff0],al
 11f44cb:	f3 41 0f 7f 87 f8 1f 	movdqu XMMWORD PTR [r15+0x1ff8],xmm0
 11f44d2:	00 00 
 11f44d4:	f3 41 0f 7f 87 08 20 	movdqu XMMWORD PTR [r15+0x2008],xmm0
 11f44db:	00 00 
 11f44dd:	f3 41 0f 7f 87 18 20 	movdqu XMMWORD PTR [r15+0x2018],xmm0
 11f44e4:	00 00 
 11f44e6:	4d 8d b7 28 20 00 00 	lea    r14,[r15+0x2028]
 11f44ed:	f3 41 0f 7f 87 08 12 	movdqu XMMWORD PTR [r15+0x1208],xmm0
 11f44f4:	00 00 
 11f44f6:	41 88 87 18 12 00 00 	mov    BYTE PTR [r15+0x1218],al
 11f44fd:	41 88 87 b8 1f 00 00 	mov    BYTE PTR [r15+0x1fb8],al
 11f4504:	f3 41 0f 7f 87 a8 1f 	movdqu XMMWORD PTR [r15+0x1fa8],xmm0
 11f450b:	00 00 
 11f450d:	f3 41 0f 7f 87 98 1f 	movdqu XMMWORD PTR [r15+0x1f98],xmm0
 11f4514:	00 00 
 11f4516:	f3 41 0f 7f 87 88 1f 	movdqu XMMWORD PTR [r15+0x1f88],xmm0
 11f451d:	00 00 
 11f451f:	4c 89 f7             	mov    rdi,r14
 11f4522:	e8 03 12 97 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
 11f4527:	4d 8d a7 38 20 00 00 	lea    r12,[r15+0x2038]
 11f452e:	4c 8b ac 24 50 06 00 	mov    r13,QWORD PTR [rsp+0x650]
 11f4535:	00 
 11f4536:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
 11f453a:	4c 89 e7             	mov    rdi,r12
 11f453d:	4c 89 ee             	mov    rsi,r13
 11f4540:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
 11f4546:	49 8d bf 68 20 00 00 	lea    rdi,[r15+0x2068]
 11f454d:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
 11f4551:	4c 89 ee             	mov    rsi,r13
 11f4554:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
 11f455a:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 11f4561:	00 
 11f4562:	e8 29 99 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11f4567:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
 11f456e:	00 
 11f456f:	e8 3a 16 00 00       	call   11f5bae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b132>
 11f4574:	48 89 ab d0 4a 00 00 	mov    QWORD PTR [rbx+0x4ad0],rbp
 11f457b:	4c 89 bb d8 4a 00 00 	mov    QWORD PTR [rbx+0x4ad8],r15
 11f4582:	31 ff                	xor    edi,edi
 11f4584:	e8 93 9e 8a ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
 11f4589:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
 11f4590:	00 
 11f4591:	e8 18 16 00 00       	call   11f5bae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b132>
 11f4596:	48 8b bc 24 88 05 00 	mov    rdi,QWORD PTR [rsp+0x588]
 11f459d:	00 
 11f459e:	e8 e3 9e 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f45a3:	4c 8d ab e0 4a 00 00 	lea    r13,[rbx+0x4ae0]
 11f45aa:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 11f45af:	80 b8 b0 00 00 00 00 	cmp    BYTE PTR [rax+0xb0],0x0
 11f45b6:	0f 84 f9 00 00 00    	je     11f46b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39c39>
 11f45bc:	48 83 a4 24 e0 04 00 	and    QWORD PTR [rsp+0x4e0],0x0
 11f45c3:	00 00 
 11f45c5:	48 8d 05 14 38 7e ff 	lea    rax,[rip+0xffffffffff7e3814]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 11f45cc:	48 89 84 24 f0 04 00 	mov    QWORD PTR [rsp+0x4f0],rax
 11f45d3:	00 
 11f45d4:	48 8d 05 9f e8 95 ff 	lea    rax,[rip+0xffffffffff95e89f]        # b52e7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9fe1a>
 11f45db:	48 89 84 24 f8 04 00 	mov    QWORD PTR [rsp+0x4f8],rax
 11f45e2:	00 
 11f45e3:	6a 60                	push   0x60
 11f45e5:	5f                   	pop    rdi
 11f45e6:	e8 15 99 5f 00       	call   17edf00 <_Znwm@plt>
 11f45eb:	49 89 c6             	mov    r14,rax
 11f45ee:	66 0f ef c0          	pxor   xmm0,xmm0
 11f45f2:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
 11f45f7:	48 8d 05 52 75 66 00 	lea    rax,[rip+0x667552]        # 185bb50 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18238>
 11f45fe:	49 89 06             	mov    QWORD PTR [r14],rax
 11f4601:	0f 28 83 d0 4a 00 00 	movaps xmm0,XMMWORD PTR [rbx+0x4ad0]
 11f4608:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
 11f460f:	00 
 11f4610:	48 8b 83 d8 4a 00 00 	mov    rax,QWORD PTR [rbx+0x4ad8]
 11f4617:	48 85 c0             	test   rax,rax
 11f461a:	74 05                	je     11f4621 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39ba5>
 11f461c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
 11f4621:	49 8d 6e 18          	lea    rbp,[r14+0x18]
 11f4625:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 11f462a:	44 8a b8 88 00 00 00 	mov    r15b,BYTE PTR [rax+0x88]
 11f4631:	4c 8d a4 24 c0 05 00 	lea    r12,[rsp+0x5c0]
 11f4638:	00 
 11f4639:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
 11f4640:	00 
 11f4641:	4c 89 e7             	mov    rdi,r12

## Writes to object/subobject +0x20 near constructor family
 11f30e8:	4c 89 f6             	mov    rsi,r14
 11f30eb:	4c 89 fa             	mov    rdx,r15
 11f30ee:	ff 90 00 01 00 00    	call   QWORD PTR [rax+0x100]
 11f30f4:	4c 89 e7             	mov    rdi,r12
 11f30f7:	4c 89 ee             	mov    rsi,r13
 11f30fa:	e8 3f 69 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
 11f30ff:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
 11f3103:	e8 7e b3 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f3108:	4c 89 ff             	mov    rdi,r15
 11f310b:	e8 d8 76 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 11f3110:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
 11f3117:	00 
 11f3118:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11f311b:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11f311e:	49 89 c4             	mov    r12,rax
 11f3121:	48 8d bc 24 d0 03 00 	lea    rdi,[rsp+0x3d0]
 11f3128:	00 
 11f3129:	48 8b b4 24 80 00 00 	mov    rsi,QWORD PTR [rsp+0x80]
 11f3130:	00 
 11f3131:	e8 5a 71 88 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 11f3136:	48 8d 05 13 7e 62 00 	lea    rax,[rip+0x627e13]        # 181af50 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x10c10>
 11f313d:	48 8d 8c 24 a0 03 00 	lea    rcx,[rsp+0x3a0]
 11f3144:	00 
 11f3145:	48 89 01             	mov    QWORD PTR [rcx],rax
 11f3148:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
 11f314c:	48 8d 35 d1 02 17 ff 	lea    rsi,[rip+0xffffffffff1702d1]        # 363424 <_ZTSSt12bad_any_cast@@Base-0x2cda4>
 11f3153:	48 8d bc 24 98 01 00 	lea    rdi,[rsp+0x198]
 11f315a:	00 
 11f315b:	e8 1e 69 88 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 11f3160:	48 8b b4 24 78 06 00 	mov    rsi,QWORD PTR [rsp+0x678]
 11f3167:	00 
 11f3168:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11f316b:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 11f3172:	00 
 11f3173:	48 8d 94 24 98 01 00 	lea    rdx,[rsp+0x198]
 11f317a:	00 
 11f317b:	ff 50 20             	call   QWORD PTR [rax+0x20]
 11f317e:	4c 8d bb 20 1d 00 00 	lea    r15,[rbx+0x1d20]
 11f3185:	4c 8d b4 24 b0 01 00 	lea    r14,[rsp+0x1b0]
 11f318c:	00 
 11f318d:	49 c7 46 18 20 bf 02 	mov    QWORD PTR [r14+0x18],0x2bf20
 11f3194:	00 
 11f3195:	49 c7 46 20 b8 0b 00 	mov    QWORD PTR [r14+0x20],0xbb8
 11f319c:	00 
 11f319d:	4c 89 bc 24 a0 05 00 	mov    QWORD PTR [rsp+0x5a0],r15
 11f31a4:	00 
 11f31a5:	48 8d 05 b8 92 88 ff 	lea    rax,[rip+0xffffffffff8892b8]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 11f31ac:	48 89 84 24 b0 05 00 	mov    QWORD PTR [rsp+0x5b0],rax
 11f31b3:	00 
 11f31b4:	48 8d 05 27 8f 05 00 	lea    rax,[rip+0x58f27]        # 124c0e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x91666>
 11f31bb:	48 89 84 24 b8 05 00 	mov    QWORD PTR [rsp+0x5b8],rax
 11f31c2:	00 
 11f31c3:	4c 89 bc 24 80 05 00 	mov    QWORD PTR [rsp+0x580],r15
 11f31ca:	00 
 11f31cb:	48 8d 05 92 92 88 ff 	lea    rax,[rip+0xffffffffff889292]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 11f31d2:	48 89 84 24 90 05 00 	mov    QWORD PTR [rsp+0x590],rax
 11f31d9:	00 
 11f31da:	48 8d 05 1f 8f 05 00 	lea    rax,[rip+0x58f1f]        # 124c100 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x91684>
 11f31e1:	48 89 84 24 98 05 00 	mov    QWORD PTR [rsp+0x598],rax
 11f31e8:	00 
 11f31e9:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 11f31f0:	00 
 11f31f1:	48 8d b4 24 d0 03 00 	lea    rsi,[rsp+0x3d0]
 11f31f8:	00 
 11f31f9:	e8 f8 8d e7 ff       	call   106bff6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23340c>
 11f31fe:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
 11f3205:	00 
 11f3206:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
 11f320d:	00 
 11f320e:	e8 6d 4d a7 ff       	call   c67f80 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b4f20>
 11f3213:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
 11f321a:	00 
 11f321b:	4c 89 f6             	mov    rsi,r14
 11f321e:	e8 1d ad 5f 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 11f3223:	48 8d 84 24 c8 01 00 	lea    rax,[rsp+0x1c8]
 11f322a:	00 
 11f322b:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
 11f322e:	0f 11 84 24 38 05 00 	movups XMMWORD PTR [rsp+0x538],xmm0
 11f3235:	00 
--
 11f35ba:	4c 89 f7             	mov    rdi,r14
 11f35bd:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11f35c0:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
 11f35c7:	00 
 11f35c8:	49 8b 06             	mov    rax,QWORD PTR [r14]
 11f35cb:	4c 89 f7             	mov    rdi,r14
 11f35ce:	ff 50 30             	call   QWORD PTR [rax+0x30]
 11f35d1:	49 89 c4             	mov    r12,rax
 11f35d4:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 11f35d9:	8a 41 04             	mov    al,BYTE PTR [rcx+0x4]
 11f35dc:	4c 8d b4 24 50 03 00 	lea    r14,[rsp+0x350]
 11f35e3:	00 
 11f35e4:	41 88 46 d0          	mov    BYTE PTR [r14-0x30],al
 11f35e8:	0f 10 81 e0 00 00 00 	movups xmm0,XMMWORD PTR [rcx+0xe0]
 11f35ef:	41 0f 11 46 d4       	movups XMMWORD PTR [r14-0x2c],xmm0
 11f35f4:	41 c7 46 e4 05 00 00 	mov    DWORD PTR [r14-0x1c],0x5
 11f35fb:	00 
 11f35fc:	49 c7 46 e8 88 13 00 	mov    QWORD PTR [r14-0x18],0x1388
 11f3603:	00 
 11f3604:	48 8b 41 70          	mov    rax,QWORD PTR [rcx+0x70]
 11f3608:	49 89 46 f0          	mov    QWORD PTR [r14-0x10],rax
 11f360c:	41 c6 46 f8 00       	mov    BYTE PTR [r14-0x8],0x0
 11f3611:	48 8d 05 48 d2 68 00 	lea    rax,[rip+0x68d248]        # 1880860 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3cf48>
 11f3618:	49 89 06             	mov    QWORD PTR [r14],rax
 11f361b:	4d 89 76 20          	mov    QWORD PTR [r14+0x20],r14
 11f361f:	0f 10 41 50          	movups xmm0,XMMWORD PTR [rcx+0x50]
 11f3623:	41 0f 29 46 30       	movaps XMMWORD PTR [r14+0x30],xmm0
 11f3628:	0f 10 41 60          	movups xmm0,XMMWORD PTR [rcx+0x60]
 11f362c:	41 0f 29 46 40       	movaps XMMWORD PTR [r14+0x40],xmm0
 11f3631:	41 0f 10 45 00       	movups xmm0,XMMWORD PTR [r13+0x0]
 11f3636:	0f 29 84 24 30 01 00 	movaps XMMWORD PTR [rsp+0x130],xmm0
 11f363d:	00 
 11f363e:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
 11f3642:	48 85 c0             	test   rax,rax
 11f3645:	74 05                	je     11f364c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38bd0>
 11f3647:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
 11f364c:	48 8b 83 d0 0e 00 00 	mov    rax,QWORD PTR [rbx+0xed0]
 11f3653:	48 89 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rax
 11f365a:	00 
 11f365b:	44 8b a9 ac 00 00 00 	mov    r13d,DWORD PTR [rcx+0xac]
 11f3662:	48 8b 83 28 1a 00 00 	mov    rax,QWORD PTR [rbx+0x1a28]
 11f3669:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
 11f3670:	00 
 11f3671:	8a 81 d0 00 00 00    	mov    al,BYTE PTR [rcx+0xd0]
 11f3677:	88 84 24 e0 00 00 00 	mov    BYTE PTR [rsp+0xe0],al
 11f367e:	48 8b 84 24 d0 06 00 	mov    rax,QWORD PTR [rsp+0x6d0]
 11f3685:	00 
 11f3686:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 11f3689:	e8 38 2c cb ff       	call   ea62c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6dc>
 11f368e:	89 84 24 dc 00 00 00 	mov    DWORD PTR [rsp+0xdc],eax
 11f3695:	4c 89 e8             	mov    rax,r13
 11f3698:	48 c1 e0 20          	shl    rax,0x20
 11f369c:	48 b9 00 00 00 00 01 	movabs rcx,0x100000000
 11f36a3:	00 00 00 
 11f36a6:	48 01 c1             	add    rcx,rax
 11f36a9:	41 83 fd 04          	cmp    r13d,0x4
 11f36ad:	49 bd 00 00 00 00 03 	movabs r13,0x300000000
 11f36b4:	00 00 00 
 11f36b7:	4c 0f 42 e9          	cmovb  r13,rcx
 11f36bb:	48 8b 84 24 10 07 00 	mov    rax,QWORD PTR [rsp+0x710]
 11f36c2:	00 
--
 11f3859:	48 8b 84 24 58 07 00 	mov    rax,QWORD PTR [rsp+0x758]
 11f3860:	00 
 11f3861:	48 8b 94 24 08 07 00 	mov    rdx,QWORD PTR [rsp+0x708]
 11f3868:	00 
 11f3869:	4c 8b 8c 24 c8 06 00 	mov    r9,QWORD PTR [rsp+0x6c8]
 11f3870:	00 
 11f3871:	48 8d bb 30 1a 00 00 	lea    rdi,[rbx+0x1a30]
 11f3878:	4c 8d 83 90 1a 00 00 	lea    r8,[rbx+0x1a90]
 11f387f:	48 8d b4 24 80 03 00 	lea    rsi,[rsp+0x380]
 11f3886:	00 
 11f3887:	48 63 8c 24 dc 00 00 	movsxd rcx,DWORD PTR [rsp+0xdc]
 11f388e:	00 
 11f388f:	0f 28 06             	movaps xmm0,XMMWORD PTR [rsi]
 11f3892:	0f 28 4e 10          	movaps xmm1,XMMWORD PTR [rsi+0x10]
 11f3896:	0f 29 8b 50 20 00 00 	movaps XMMWORD PTR [rbx+0x2050],xmm1
 11f389d:	0f 29 83 40 20 00 00 	movaps XMMWORD PTR [rbx+0x2040],xmm0
 11f38a4:	66 0f 6f 84 24 30 01 	movdqa xmm0,XMMWORD PTR [rsp+0x130]
 11f38ab:	00 00 
 11f38ad:	66 0f 7f 83 60 20 00 	movdqa XMMWORD PTR [rbx+0x2060],xmm0
 11f38b4:	00 
 11f38b5:	66 48 0f 3a 16 c6 01 	pextrq rsi,xmm0,0x1
 11f38bc:	48 85 f6             	test   rsi,rsi
 11f38bf:	74 05                	je     11f38c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38e4a>
 11f38c1:	f0 48 ff 46 08       	lock inc QWORD PTR [rsi+0x8]
 11f38c6:	48 89 74 24 20       	mov    QWORD PTR [rsp+0x20],rsi
 11f38cb:	48 89 93 70 20 00 00 	mov    QWORD PTR [rbx+0x2070],rdx
 11f38d2:	48 8b 94 24 10 01 00 	mov    rdx,QWORD PTR [rsp+0x110]
 11f38d9:	00 
 11f38da:	48 89 93 78 20 00 00 	mov    QWORD PTR [rbx+0x2078],rdx
 11f38e1:	48 8b 54 24 28       	mov    rdx,QWORD PTR [rsp+0x28]
 11f38e6:	48 89 93 80 20 00 00 	mov    QWORD PTR [rbx+0x2080],rdx
 11f38ed:	4c 89 8b 88 20 00 00 	mov    QWORD PTR [rbx+0x2088],r9
 11f38f4:	4c 89 ab 90 20 00 00 	mov    QWORD PTR [rbx+0x2090],r13
 11f38fb:	48 8b 54 24 40       	mov    rdx,QWORD PTR [rsp+0x40]
 11f3900:	48 89 93 98 20 00 00 	mov    QWORD PTR [rbx+0x2098],rdx
 11f3907:	48 8b 94 24 c8 00 00 	mov    rdx,QWORD PTR [rsp+0xc8]
 11f390e:	00 
 11f390f:	48 89 93 a0 20 00 00 	mov    QWORD PTR [rbx+0x20a0],rdx
 11f3916:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
 11f391b:	48 89 bb a8 20 00 00 	mov    QWORD PTR [rbx+0x20a8],rdi
 11f3922:	4c 89 44 24 40       	mov    QWORD PTR [rsp+0x40],r8
 11f3927:	4c 89 83 b0 20 00 00 	mov    QWORD PTR [rbx+0x20b0],r8
 11f392e:	48 8b 94 24 c0 06 00 	mov    rdx,QWORD PTR [rsp+0x6c0]
 11f3935:	00 
 11f3936:	48 89 93 b8 20 00 00 	mov    QWORD PTR [rbx+0x20b8],rdx
 11f393d:	48 8b 54 24 38       	mov    rdx,QWORD PTR [rsp+0x38]
 11f3942:	48 89 93 c0 20 00 00 	mov    QWORD PTR [rbx+0x20c0],rdx
 11f3949:	8a 94 24 e0 00 00 00 	mov    dl,BYTE PTR [rsp+0xe0]
 11f3950:	88 93 c8 20 00 00    	mov    BYTE PTR [rbx+0x20c8],dl
 11f3956:	8b 94 24 80 05 00 00 	mov    edx,DWORD PTR [rsp+0x580]
 11f395d:	8b b4 24 83 05 00 00 	mov    esi,DWORD PTR [rsp+0x583]
 11f3964:	89 93 c9 20 00 00    	mov    DWORD PTR [rbx+0x20c9],edx
 11f396a:	89 b3 cc 20 00 00    	mov    DWORD PTR [rbx+0x20cc],esi
 11f3970:	48 89 8b d0 20 00 00 	mov    QWORD PTR [rbx+0x20d0],rcx
 11f3977:	66 0f 6f 84 24 50 05 	movdqa xmm0,XMMWORD PTR [rsp+0x550]
 11f397e:	00 00 
 11f3980:	f3 0f 7f 83 d8 20 00 	movdqu XMMWORD PTR [rbx+0x20d8],xmm0
 11f3987:	00 
 11f3988:	48 8b 8c 24 60 05 00 	mov    rcx,QWORD PTR [rsp+0x560]
 11f398f:	00 
 11f3990:	48 89 8b e8 20 00 00 	mov    QWORD PTR [rbx+0x20e8],rcx
--
 11f3bc0:	4c 8b b4 24 50 05 00 	mov    r14,QWORD PTR [rsp+0x550]
 11f3bc7:	00 
 11f3bc8:	48 8b b4 24 50 06 00 	mov    rsi,QWORD PTR [rsp+0x650]
 11f3bcf:	00 
 11f3bd0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11f3bd3:	48 8d bc 24 c0 02 00 	lea    rdi,[rsp+0x2c0]
 11f3bda:	00 
 11f3bdb:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
 11f3be1:	4c 89 b3 08 2a 00 00 	mov    QWORD PTR [rbx+0x2a08],r14
 11f3be8:	4c 8b a4 24 c0 06 00 	mov    r12,QWORD PTR [rsp+0x6c0]
 11f3bef:	00 
 11f3bf0:	4c 89 a3 10 2a 00 00 	mov    QWORD PTR [rbx+0x2a10],r12
 11f3bf7:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 11f3bfc:	8b 81 d4 00 00 00    	mov    eax,DWORD PTR [rcx+0xd4]
 11f3c02:	89 83 18 2a 00 00    	mov    DWORD PTR [rbx+0x2a18],eax
 11f3c08:	8b 81 d8 00 00 00    	mov    eax,DWORD PTR [rcx+0xd8]
 11f3c0e:	89 83 1c 2a 00 00    	mov    DWORD PTR [rbx+0x2a1c],eax
 11f3c14:	48 8d bb 20 2a 00 00 	lea    rdi,[rbx+0x2a20]
 11f3c1b:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
 11f3c20:	e8 d1 5d 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 11f3c25:	4c 8d ab 30 2a 00 00 	lea    r13,[rbx+0x2a30]
 11f3c2c:	4c 89 ef             	mov    rdi,r13
 11f3c2f:	e8 c2 5d 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 11f3c34:	48 8d bb 40 2a 00 00 	lea    rdi,[rbx+0x2a40]
 11f3c3b:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
 11f3c40:	e8 b1 5d 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 11f3c45:	66 0f ef c0          	pxor   xmm0,xmm0
 11f3c49:	66 0f 7f 83 80 2a 00 	movdqa XMMWORD PTR [rbx+0x2a80],xmm0
 11f3c50:	00 
 11f3c51:	66 0f 7f 83 70 2a 00 	movdqa XMMWORD PTR [rbx+0x2a70],xmm0
 11f3c58:	00 
 11f3c59:	66 0f 7f 83 60 2a 00 	movdqa XMMWORD PTR [rbx+0x2a60],xmm0
 11f3c60:	00 
 11f3c61:	66 0f 7f 83 50 2a 00 	movdqa XMMWORD PTR [rbx+0x2a50],xmm0
 11f3c68:	00 
 11f3c69:	48 83 a3 90 2a 00 00 	and    QWORD PTR [rbx+0x2a90],0x0
 11f3c70:	00 
 11f3c71:	48 8d 35 52 c7 13 ff 	lea    rsi,[rip+0xffffffffff13c752]        # 3303ca <_ZTSSt12bad_any_cast@@Base-0x5fdfe>
 11f3c78:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
 11f3c7f:	00 
 11f3c80:	4c 89 ac 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r13
 11f3c87:	00 
 11f3c88:	e8 f1 5d 88 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 11f3c8d:	4c 8d bb 08 2a 00 00 	lea    r15,[rbx+0x2a08]
 11f3c94:	48 8d 94 24 e0 04 00 	lea    rdx,[rsp+0x4e0]
 11f3c9b:	00 
 11f3c9c:	c6 02 01             	mov    BYTE PTR [rdx],0x1
 11f3c9f:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 11f3ca3:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]
 11f3caa:	00 
 11f3cab:	4c 89 f6             	mov    rsi,r14
 11f3cae:	e8 ab 9a 99 ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>
 11f3cb3:	89 c5                	mov    ebp,eax
 11f3cb5:	4c 89 f7             	mov    rdi,r14
 11f3cb8:	e8 d3 a1 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11f3cbd:	40 88 ab 98 2a 00 00 	mov    BYTE PTR [rbx+0x2a98],bpl
 11f3cc4:	66 83 a3 99 2a 00 00 	and    WORD PTR [rbx+0x2a99],0x0
 11f3ccb:	00 
 11f3ccc:	48 8b 84 24 c8 06 00 	mov    rax,QWORD PTR [rsp+0x6c8]
 11f3cd3:	00 
 11f3cd4:	48 89 83 a0 2a 00 00 	mov    QWORD PTR [rbx+0x2aa0],rax
--
 11f4027:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 11f402e:	00 
 11f402f:	e8 08 24 00 00       	call   11f643c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b9c0>
 11f4034:	49 8b 06             	mov    rax,QWORD PTR [r14]
 11f4037:	4c 89 f7             	mov    rdi,r14
 11f403a:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11f403d:	49 89 c6             	mov    r14,rax
 11f4040:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]
 11f4045:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11f4048:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
 11f404f:	00 
 11f4050:	ff 50 30             	call   QWORD PTR [rax+0x30]
 11f4053:	4c 8b ac 24 80 05 00 	mov    r13,QWORD PTR [rsp+0x580]
 11f405a:	00 
 11f405b:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
 11f4062:	00 
 11f4063:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11f4066:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11f4069:	49 89 c7             	mov    r15,rax
 11f406c:	48 8b bc 24 68 06 00 	mov    rdi,QWORD PTR [rsp+0x668]
 11f4073:	00 
 11f4074:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11f4077:	ff 50 38             	call   QWORD PTR [rax+0x38]
 11f407a:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 11f407f:	4c 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],r15
 11f4084:	48 8b 83 d0 0e 00 00 	mov    rax,QWORD PTR [rbx+0xed0]
 11f408b:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 11f4090:	48 83 a4 24 20 05 00 	and    QWORD PTR [rsp+0x520],0x0
 11f4097:	00 00 
 11f4099:	48 8d 05 40 3d 7e ff 	lea    rax,[rip+0xffffffffff7e3d40]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 11f40a0:	48 89 84 24 30 05 00 	mov    QWORD PTR [rsp+0x530],rax
 11f40a7:	00 
 11f40a8:	48 8d 05 cb ed 95 ff 	lea    rax,[rip+0xffffffffff95edcb]        # b52e7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9fe1a>
 11f40af:	48 89 84 24 38 05 00 	mov    QWORD PTR [rsp+0x538],rax
 11f40b6:	00 
 11f40b7:	48 8b 83 28 1a 00 00 	mov    rax,QWORD PTR [rbx+0x1a28]
 11f40be:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
 11f40c5:	00 
 11f40c6:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
 11f40cb:	41 0f b6 84 24 b1 00 	movzx  eax,BYTE PTR [r12+0xb1]
 11f40d2:	00 00 
 11f40d4:	89 84 24 80 00 00 00 	mov    DWORD PTR [rsp+0x80],eax
 11f40db:	bf 98 20 00 00       	mov    edi,0x2098
 11f40e0:	e8 1b 9e 5f 00       	call   17edf00 <_Znwm@plt>
 11f40e5:	49 89 c7             	mov    r15,rax
 11f40e8:	48 8d ab b8 4a 00 00 	lea    rbp,[rbx+0x4ab8]
 11f40ef:	66 0f ef c0          	pxor   xmm0,xmm0
 11f40f3:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
 11f40f8:	48 8d 05 81 79 66 00 	lea    rax,[rip+0x667981]        # 185ba80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18168>
 11f40ff:	49 89 07             	mov    QWORD PTR [r15],rax
 11f4102:	41 8a 84 24 88 00 00 	mov    al,BYTE PTR [r12+0x88]
 11f4109:	00 
 11f410a:	88 44 24 60          	mov    BYTE PTR [rsp+0x60],al
 11f410e:	41 8a 84 24 89 00 00 	mov    al,BYTE PTR [r12+0x89]
 11f4115:	00 
 11f4116:	88 84 24 b0 00 00 00 	mov    BYTE PTR [rsp+0xb0],al
 11f411d:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
 11f4124:	00 
 11f4125:	48 8d b4 24 20 05 00 	lea    rsi,[rsp+0x520]
 11f412c:	00 
 11f412d:	e8 34 1a 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
 11f4132:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 11f4139:	00 
 11f413a:	48 89 ee             	mov    rsi,rbp
 11f413d:	e8 fe 9d 5f 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 11f4142:	48 8d 05 3f 7e 66 00 	lea    rax,[rip+0x667e3f]        # 185bf88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18670>
 11f4149:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
 11f414d:	48 8b 84 24 50 06 00 	mov    rax,QWORD PTR [rsp+0x650]
 11f4154:	00 
 11f4155:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
 11f4159:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
 11f415e:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
 11f4162:	48 8d 83 88 5d 00 00 	lea    rax,[rbx+0x5d88]
 11f4169:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
 11f416d:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
 11f4172:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
 11f4176:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
 11f417d:	00 
 11f417e:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
 11f4182:	4d 89 77 48          	mov    QWORD PTR [r15+0x48],r14
 11f4186:	48 8d 83 f0 19 00 00 	lea    rax,[rbx+0x19f0]
 11f418d:	49 89 47 50          	mov    QWORD PTR [r15+0x50],rax
 11f4191:	48 8b 84 24 18 01 00 	mov    rax,QWORD PTR [rsp+0x118]
 11f4198:	00 
 11f4199:	49 89 47 58          	mov    QWORD PTR [r15+0x58],rax
 11f419d:	4d 89 6f 60          	mov    QWORD PTR [r15+0x60],r13
 11f41a1:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 11f41a6:	49 89 47 68          	mov    QWORD PTR [r15+0x68],rax
 11f41aa:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
 11f41af:	49 89 47 70          	mov    QWORD PTR [r15+0x70],rax
 11f41b3:	48 8b 84 24 40 06 00 	mov    rax,QWORD PTR [rsp+0x640]
 11f41ba:	00 
 11f41bb:	49 89 47 78          	mov    QWORD PTR [r15+0x78],rax
 11f41bf:	49 8d 6f 18          	lea    rbp,[r15+0x18]
 11f41c3:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 11f41c8:	49 89 87 80 00 00 00 	mov    QWORD PTR [r15+0x80],rax
 11f41cf:	48 8b 84 24 60 06 00 	mov    rax,QWORD PTR [rsp+0x660]
 11f41d6:	00 
 11f41d7:	49 89 87 88 00 00 00 	mov    QWORD PTR [r15+0x88],rax
 11f41de:	4d 8d a7 90 00 00 00 	lea    r12,[r15+0x90]
 11f41e5:	48 8d b4 24 50 05 00 	lea    rsi,[rsp+0x550]
 11f41ec:	00 
 11f41ed:	4c 89 e7             	mov    rdi,r12
 11f41f0:	e8 71 19 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
 11f41f5:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 11f41fa:	49 89 87 b0 00 00 00 	mov    QWORD PTR [r15+0xb0],rax
--
 11f4280:	31 c0                	xor    eax,eax
 11f4282:	41 88 87 a0 10 00 00 	mov    BYTE PTR [r15+0x10a0],al
 11f4289:	41 88 87 b8 10 00 00 	mov    BYTE PTR [r15+0x10b8],al
 11f4290:	49 83 a7 c0 10 00 00 	and    QWORD PTR [r15+0x10c0],0x0
 11f4297:	00 
 11f4298:	4c 8d 84 24 98 01 00 	lea    r8,[rsp+0x198]
 11f429f:	00 
 11f42a0:	49 89 28             	mov    QWORD PTR [r8],rbp
 11f42a3:	48 8d 35 e7 8d 8a ff 	lea    rsi,[rip+0xffffffffff8a8de7]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 11f42aa:	48 8d 0d 01 a9 00 00 	lea    rcx,[rip+0xa901]        # 11febb2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44136>
 11f42b1:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]
 11f42b8:	00 
 11f42b9:	6a 08                	push   0x8
 11f42bb:	41 59                	pop    r9
 11f42bd:	4c 89 f7             	mov    rdi,r14
 11f42c0:	31 d2                	xor    edx,edx
 11f42c2:	e8 cd 64 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 11f42c7:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
 11f42cc:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11f42cf:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
 11f42d6:	00 
 11f42d7:	6a 01                	push   0x1
 11f42d9:	5a                   	pop    rdx
 11f42da:	4c 89 f1             	mov    rcx,r14
 11f42dd:	4c 89 64 24 20       	mov    QWORD PTR [rsp+0x20],r12
 11f42e2:	ff 50 20             	call   QWORD PTR [rax+0x20]
 11f42e5:	49 8d bf c8 10 00 00 	lea    rdi,[r15+0x10c8]
 11f42ec:	4c 8d b4 24 a0 05 00 	lea    r14,[rsp+0x5a0]
 11f42f3:	00 
 11f42f4:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
 11f42f9:	4c 89 f6             	mov    rsi,r14
 11f42fc:	e8 3d 57 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
 11f4301:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 11f4305:	e8 7c a1 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f430a:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
 11f4311:	00 
 11f4312:	e8 d1 64 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 11f4317:	4c 8d 84 24 98 01 00 	lea    r8,[rsp+0x198]
 11f431e:	00 
 11f431f:	49 89 28             	mov    QWORD PTR [r8],rbp
 11f4322:	48 8d 35 68 8d 8a ff 	lea    rsi,[rip+0xffffffffff8a8d68]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 11f4329:	48 8d 0d 20 a9 00 00 	lea    rcx,[rip+0xa920]        # 11fec50 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x441d4>
 11f4330:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]
 11f4337:	00 
 11f4338:	6a 08                	push   0x8
 11f433a:	41 59                	pop    r9
 11f433c:	4c 89 f7             	mov    rdi,r14
 11f433f:	31 d2                	xor    edx,edx
 11f4341:	e8 4e 64 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 11f4346:	48 8b b4 24 b8 00 00 	mov    rsi,QWORD PTR [rsp+0xb8]
 11f434d:	00 
 11f434e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11f4351:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
 11f4358:	00 
 11f4359:	4c 89 f2             	mov    rdx,r14
 11f435c:	ff 50 10             	call   QWORD PTR [rax+0x10]
 11f435f:	49 8d bf d8 10 00 00 	lea    rdi,[r15+0x10d8]
 11f4366:	4c 8d b4 24 a0 05 00 	lea    r14,[rsp+0x5a0]
 11f436d:	00 
 11f436e:	48 89 bc 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rdi
 11f4375:	00 
--
 11f4709:	66 0f 7f 84 24 c0 05 	movdqa XMMWORD PTR [rsp+0x5c0],xmm0
 11f4710:	00 00 
 11f4712:	48 85 c9             	test   rcx,rcx
 11f4715:	74 05                	je     11f471c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39ca0>
 11f4717:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
 11f471c:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
 11f4720:	48 8d 94 24 c0 05 00 	lea    rdx,[rsp+0x5c0]
 11f4727:	00 
 11f4728:	4c 89 f7             	mov    rdi,r14
 11f472b:	e8 8a 89 8b ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
 11f4730:	48 8b bc 24 c8 05 00 	mov    rdi,QWORD PTR [rsp+0x5c8]
 11f4737:	00 
 11f4738:	e8 49 9d 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f473d:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
 11f4740:	bf 98 0f 00 00       	mov    edi,0xf98
 11f4745:	e8 b6 97 5f 00       	call   17edf00 <_Znwm@plt>
 11f474a:	49 89 c6             	mov    r14,rax
 11f474d:	66 0f ef c0          	pxor   xmm0,xmm0
 11f4751:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
 11f4756:	48 8d 05 2b 74 66 00 	lea    rax,[rip+0x66742b]        # 185bb88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18270>
 11f475d:	49 89 06             	mov    QWORD PTR [r14],rax
 11f4760:	4d 8d 6e 18          	lea    r13,[r14+0x18]
 11f4764:	48 8d 05 bd 75 66 00 	lea    rax,[rip+0x6675bd]        # 185bd28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18410>
 11f476b:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
 11f476f:	4d 89 7e 20          	mov    QWORD PTR [r14+0x20],r15
 11f4773:	48 8b 84 24 08 01 00 	mov    rax,QWORD PTR [rsp+0x108]
 11f477a:	00 
 11f477b:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
 11f477f:	4c 8d 84 24 50 05 00 	lea    r8,[rsp+0x550]
 11f4786:	00 
 11f4787:	4d 89 28             	mov    QWORD PTR [r8],r13
 11f478a:	48 8d 35 00 89 8a ff 	lea    rsi,[rip+0xffffffffff8a8900]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 11f4791:	48 8d 0d 70 68 00 00 	lea    rcx,[rip+0x6870]        # 11fb008 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4058c>
 11f4798:	4c 8d a4 24 c0 05 00 	lea    r12,[rsp+0x5c0]
 11f479f:	00 
 11f47a0:	6a 08                	push   0x8
 11f47a2:	41 59                	pop    r9
 11f47a4:	4c 89 e7             	mov    rdi,r12
 11f47a7:	31 d2                	xor    edx,edx
 11f47a9:	e8 e6 5f 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 11f47ae:	49 8b 07             	mov    rax,QWORD PTR [r15]
 11f47b1:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 11f47b8:	00 
 11f47b9:	4c 89 fe             	mov    rsi,r15
 11f47bc:	4c 89 e2             	mov    rdx,r12
 11f47bf:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
 11f47c5:	49 8d 7e 30          	lea    rdi,[r14+0x30]
 11f47c9:	4c 8d a4 24 e0 04 00 	lea    r12,[rsp+0x4e0]
 11f47d0:	00 
 11f47d1:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
 11f47d8:	00 
 11f47d9:	4c 89 e6             	mov    rsi,r12
 11f47dc:	e8 5d 52 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
 11f47e1:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
 11f47e6:	e8 9b 9c 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f47eb:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
 11f47f2:	00 
 11f47f3:	e8 f0 5f 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 11f47f8:	4d 8b 66 28          	mov    r12,QWORD PTR [r14+0x28]
 11f47fc:	4c 8d 84 24 50 05 00 	lea    r8,[rsp+0x550]
 11f4803:	00 
--
 11f49be:	00 
 11f49bf:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
 11f49c3:	49 89 4e 10          	mov    QWORD PTR [r14+0x10],rcx
 11f49c7:	66 0f 6f 07          	movdqa xmm0,XMMWORD PTR [rdi]
 11f49cb:	f3 41 0f 7f 06       	movdqu XMMWORD PTR [r14],xmm0
 11f49d0:	66 0f ef c0          	pxor   xmm0,xmm0
 11f49d4:	66 0f 7f 07          	movdqa XMMWORD PTR [rdi],xmm0
 11f49d8:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 11f49dd:	88 83 38 4c 00 00    	mov    BYTE PTR [rbx+0x4c38],al
 11f49e3:	e8 a8 94 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11f49e8:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
 11f49ef:	00 
 11f49f0:	e8 9b 94 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11f49f5:	6a 38                	push   0x38
 11f49f7:	5f                   	pop    rdi
 11f49f8:	e8 03 95 5f 00       	call   17edf00 <_Znwm@plt>
 11f49fd:	48 8d ab 00 4c 00 00 	lea    rbp,[rbx+0x4c00]
 11f4a04:	66 0f ef c0          	pxor   xmm0,xmm0
 11f4a08:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
 11f4a0d:	48 8d 0d bc be 60 00 	lea    rcx,[rip+0x60bebc]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>
 11f4a14:	48 89 08             	mov    QWORD PTR [rax],rcx
 11f4a17:	48 89 c1             	mov    rcx,rax
 11f4a1a:	48 8d 15 3f a5 66 00 	lea    rdx,[rip+0x66a53f]        # 185ef60 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b648>
 11f4a21:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
 11f4a25:	48 89 68 20          	mov    QWORD PTR [rax+0x20],rbp
 11f4a29:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14
 11f4a2d:	83 60 30 00          	and    DWORD PTR [rax+0x30],0x0
 11f4a31:	48 83 c1 18          	add    rcx,0x18
 11f4a35:	48 89 8b 40 4c 00 00 	mov    QWORD PTR [rbx+0x4c40],rcx
 11f4a3c:	48 89 83 48 4c 00 00 	mov    QWORD PTR [rbx+0x4c48],rax
 11f4a43:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]
 11f4a48:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11f4a4b:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
 11f4a52:	00 
 11f4a53:	ff 50 30             	call   QWORD PTR [rax+0x30]
 11f4a56:	48 8d 83 10 4b 00 00 	lea    rax,[rbx+0x4b10]
 11f4a5d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 11f4a62:	4c 8b bc 24 c0 05 00 	mov    r15,QWORD PTR [rsp+0x5c0]
 11f4a69:	00 
 11f4a6a:	4c 89 b4 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r14
 11f4a71:	00 
 11f4a72:	4c 8d b4 24 a0 02 00 	lea    r14,[rsp+0x2a0]
 11f4a79:	00 
 11f4a7a:	4d 89 3e             	mov    QWORD PTR [r14],r15
 11f4a7d:	4c 8d 2d 10 1f 00 00 	lea    r13,[rip+0x1f10]        # 11f6994 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bf18>
 11f4a84:	4d 89 6e 18          	mov    QWORD PTR [r14+0x18],r13
 11f4a88:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
 11f4a8f:	00 
 11f4a90:	48 8b b4 24 60 06 00 	mov    rsi,QWORD PTR [rsp+0x660]
 11f4a97:	00 
 11f4a98:	e8 25 cc 5c 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 11f4a9d:	48 8b 84 24 38 07 00 	mov    rax,QWORD PTR [rsp+0x738]
 11f4aa4:	00 
 11f4aa5:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
 11f4aa9:	4c 8d a4 24 70 02 00 	lea    r12,[rsp+0x270]
 11f4ab0:	00 
 11f4ab1:	4c 89 e7             	mov    rdi,r12
 11f4ab4:	e8 56 ce a1 ff       	call   c1190f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e8af>
 11f4ab9:	48 89 ab 50 4c 00 00 	mov    QWORD PTR [rbx+0x4c50],rbp
 11f4ac0:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 11f4ac5:	48 89 83 58 4c 00 00 	mov    QWORD PTR [rbx+0x4c58],rax

## Secondary Skip Ad branch

/tmp/sasum/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000012044d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49a54>:
 12044d0:	23 00                	and    eax,DWORD PTR [rax]
 12044d2:	00 e9                	add    cl,ch
 12044d4:	be fe ff ff 48       	mov    esi,0x48fffffe
 12044d9:	8d 35 ab 2b 14 ff    	lea    esi,[rip+0xffffffffff142bab]        # 34708a <_ZTSSt12bad_any_cast@@Base-0x4913e>
 12044df:	48 89 df             	mov    rdi,rbx
 12044e2:	e8 68 73 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 12044e7:	84 c0                	test   al,al
 12044e9:	74 4b                	je     1204536 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49aba>
 12044eb:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
 12044ef:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12044f2:	ff 50 68             	call   QWORD PTR [rax+0x68]
 12044f5:	e8 cd 63 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
 12044fa:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
 1204501:	00 
 1204502:	83 60 e8 00          	and    DWORD PTR [rax-0x18],0x0
 1204506:	48 8d 0d 43 e9 77 00 	lea    rcx,[rip+0x77e943]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
 120450d:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
 1204511:	0f 57 c0             	xorps  xmm0,xmm0
 1204514:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 1204517:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
 120451b:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 1204520:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
 1204524:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
 120452b:	00 
 120452c:	e8 5f 98 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
 1204531:	e9 53 fe ff ff       	jmp    1204389 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4990d>
 1204536:	48                   	rex.W
 1204537:	8d                   	.byte 0x8d

## Relocation neighborhood of secondary dispatcher address point 0x185bf88
