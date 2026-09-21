# Service184 holder +0x10 writer

## Exact 0x1333c40..0x1333d30 window

/tmp/s184plus10/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000001333c40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1791c4>:
 1333c40:	24 f0                	and    al,0xf0
 1333c42:	04 00                	add    al,0x0
 1333c44:	00 ff                	add    bh,bh
 1333c46:	50                   	push   rax
 1333c47:	38 4c 8b bb          	cmp    BYTE PTR [rbx+rcx*4-0x45],cl
 1333c4b:	70 01                	jo     1333c4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1791d2>
 1333c4d:	00 00                	add    BYTE PTR [rax],al
 1333c4f:	4c 8b b3 78 01 00 00 	mov    r14,QWORD PTR [rbx+0x178]
 1333c56:	4d 39 f7             	cmp    r15,r14
 1333c59:	74 38                	je     1333c93 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179217>
 1333c5b:	4c 8d a4 24 f0 01 00 	lea    r12,[rsp+0x1f0]
 1333c62:	00 
 1333c63:	41 8b 17             	mov    edx,DWORD PTR [r15]
 1333c66:	48 8b bc 24 f0 04 00 	mov    rdi,QWORD PTR [rsp+0x4f0]
 1333c6d:	00 
 1333c6e:	48 8b b4 24 f8 04 00 	mov    rsi,QWORD PTR [rsp+0x4f8]
 1333c75:	00 
 1333c76:	e8 5d 31 eb ff       	call   11e6dd8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c35c>
 1333c7b:	84 c0                	test   al,al
 1333c7d:	75 0b                	jne    1333c8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17920e>
 1333c7f:	4c 89 e7             	mov    rdi,r12
 1333c82:	4c 89 fe             	mov    rsi,r15
 1333c85:	e8 26 15 8b ff       	call   be51b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x132150>
 1333c8a:	49 83 c7 04          	add    r15,0x4
 1333c8e:	4d 39 f7             	cmp    r15,r14
 1333c91:	75 d0                	jne    1333c63 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1791e7>
 1333c93:	48 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],rbp
 1333c98:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 1333c9f:	00 
 1333ca0:	e8 83 b1 d4 ff       	call   107ee28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24623e>
 1333ca5:	66 0f 6f 84 24 70 02 	movdqa xmm0,XMMWORD PTR [rsp+0x270]
 1333cac:	00 00 
 1333cae:	4c 8d 84 24 50 02 00 	lea    r8,[rsp+0x250]
 1333cb5:	00 
 1333cb6:	66 41 0f 7f 00       	movdqa XMMWORD PTR [r8],xmm0
 1333cbb:	48 8b 84 24 80 02 00 	mov    rax,QWORD PTR [rsp+0x280]
 1333cc2:	00 
 1333cc3:	49 89 40 10          	mov    QWORD PTR [r8+0x10],rax
 1333cc7:	66 0f ef c0          	pxor   xmm0,xmm0
 1333ccb:	66 0f 7f 84 24 70 02 	movdqa XMMWORD PTR [rsp+0x270],xmm0
 1333cd2:	00 00 
 1333cd4:	48 83 a4 24 80 02 00 	and    QWORD PTR [rsp+0x280],0x0
 1333cdb:	00 00 
 1333cdd:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 1333ce4:	00 
 1333ce5:	48 8d 8c 24 f0 01 00 	lea    rcx,[rsp+0x1f0]
 1333cec:	00 
 1333ced:	48 8b b4 24 40 01 00 	mov    rsi,QWORD PTR [rsp+0x140]
 1333cf4:	00 
 1333cf5:	48 8b 94 24 38 01 00 	mov    rdx,QWORD PTR [rsp+0x138]
 1333cfc:	00 
 1333cfd:	e8 04 88 00 00       	call   133c506 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x181a8a>
 1333d02:	4c 8d bc 24 40 02 00 	lea    r15,[rsp+0x240]
 1333d09:	00 
 1333d0a:	49 8b 37             	mov    rsi,QWORD PTR [r15]
 1333d0d:	49 83 27 00          	and    QWORD PTR [r15],0x0
 1333d11:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
 1333d18:	00 
 1333d19:	e8 5e 3f 00 00       	call   1337c7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d200>
 1333d1e:	4c 89 ff             	mov    rdi,r15
 1333d21:	e8 d2 3f 00 00       	call   1337cf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d27c>
 1333d26:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
 1333d2d:	00 
 1333d2e:	e8                   	.byte 0xe8
 1333d2f:	f5                   	cmc

## Slightly wider 0x1333b80..0x1333dd0 context

/tmp/s184plus10/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000001333b80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179104>:
 1333b80:	00 0f                	add    BYTE PTR [rdi],cl
 1333b82:	84 91 00 00 00 4d    	test   BYTE PTR [rcx+0x4d000000],dl
 1333b88:	89 f5                	mov    ebp,esi
 1333b8a:	4c 8b bb 68 03 00 00 	mov    r15,QWORD PTR [rbx+0x368]
 1333b91:	4c 8b b3 70 03 00 00 	mov    r14,QWORD PTR [rbx+0x370]
 1333b98:	4d 29 fe             	sub    r14,r15
 1333b9b:	4c 8d 25 b6 8f 0a ff 	lea    r12,[rip+0xffffffffff0a8fb6]        # 3dcb58 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x25a7>
 1333ba2:	4d 85 f6             	test   r14,r14
 1333ba5:	74 31                	je     1333bd8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17915c>
 1333ba7:	4c 89 ff             	mov    rdi,r15
 1333baa:	4c 89 e6             	mov    rsi,r12
 1333bad:	e8 3c bb 76 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
 1333bb2:	49 83 c7 38          	add    r15,0x38
 1333bb6:	49 83 c6 c8          	add    r14,0xffffffffffffffc8
 1333bba:	84 c0                	test   al,al
 1333bbc:	74 e4                	je     1333ba2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179126>
 1333bbe:	48 8d b4 24 f0 04 00 	lea    rsi,[rsp+0x4f0]
 1333bc5:	00 
 1333bc6:	66 c7 06 d4 00       	mov    WORD PTR [rsi],0xd4
 1333bcb:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
 1333bd2:	00 
 1333bd3:	e8 40 83 aa ff       	call   ddbf18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa8f9e>
 1333bd8:	80 bb d0 01 00 00 00 	cmp    BYTE PTR [rbx+0x1d0],0x0
 1333bdf:	4d 89 ee             	mov    r14,r13
 1333be2:	74 34                	je     1333c18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17919c>
 1333be4:	48 8d b4 24 f0 04 00 	lea    rsi,[rsp+0x4f0]
 1333beb:	00 
 1333bec:	66 c7 06 b6 00       	mov    WORD PTR [rsi],0xb6
 1333bf1:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
 1333bf8:	00 
 1333bf9:	e8 1a 83 aa ff       	call   ddbf18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa8f9e>
 1333bfe:	48 8d b4 24 f0 04 00 	lea    rsi,[rsp+0x4f0]
 1333c05:	00 
 1333c06:	66 c7 06 d4 00       	mov    WORD PTR [rsi],0xd4
 1333c0b:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
 1333c12:	00 
 1333c13:	e8 00 83 aa ff       	call   ddbf18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa8f9e>
 1333c18:	4c 89 74 24 60       	mov    QWORD PTR [rsp+0x60],r14
 1333c1d:	48 83 a4 24 00 02 00 	and    QWORD PTR [rsp+0x200],0x0
 1333c24:	00 00 
 1333c26:	66 0f ef c0          	pxor   xmm0,xmm0
 1333c2a:	66 0f 7f 84 24 f0 01 	movdqa XMMWORD PTR [rsp+0x1f0],xmm0
 1333c31:	00 00 
 1333c33:	48 8b b3 c0 05 00 00 	mov    rsi,QWORD PTR [rbx+0x5c0]
 1333c3a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1333c3d:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 1333c44:	00 
 1333c45:	ff 50 38             	call   QWORD PTR [rax+0x38]
 1333c48:	4c 8b bb 70 01 00 00 	mov    r15,QWORD PTR [rbx+0x170]
 1333c4f:	4c 8b b3 78 01 00 00 	mov    r14,QWORD PTR [rbx+0x178]
 1333c56:	4d 39 f7             	cmp    r15,r14
 1333c59:	74 38                	je     1333c93 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179217>
 1333c5b:	4c 8d a4 24 f0 01 00 	lea    r12,[rsp+0x1f0]
 1333c62:	00 
 1333c63:	41 8b 17             	mov    edx,DWORD PTR [r15]
 1333c66:	48 8b bc 24 f0 04 00 	mov    rdi,QWORD PTR [rsp+0x4f0]
 1333c6d:	00 
 1333c6e:	48 8b b4 24 f8 04 00 	mov    rsi,QWORD PTR [rsp+0x4f8]
 1333c75:	00 
 1333c76:	e8 5d 31 eb ff       	call   11e6dd8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c35c>
 1333c7b:	84 c0                	test   al,al
 1333c7d:	75 0b                	jne    1333c8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17920e>
 1333c7f:	4c 89 e7             	mov    rdi,r12
 1333c82:	4c 89 fe             	mov    rsi,r15
 1333c85:	e8 26 15 8b ff       	call   be51b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x132150>
 1333c8a:	49 83 c7 04          	add    r15,0x4
 1333c8e:	4d 39 f7             	cmp    r15,r14
 1333c91:	75 d0                	jne    1333c63 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1791e7>
 1333c93:	48 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],rbp
 1333c98:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 1333c9f:	00 
 1333ca0:	e8 83 b1 d4 ff       	call   107ee28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24623e>
 1333ca5:	66 0f 6f 84 24 70 02 	movdqa xmm0,XMMWORD PTR [rsp+0x270]
 1333cac:	00 00 
 1333cae:	4c 8d 84 24 50 02 00 	lea    r8,[rsp+0x250]
 1333cb5:	00 
 1333cb6:	66 41 0f 7f 00       	movdqa XMMWORD PTR [r8],xmm0
 1333cbb:	48 8b 84 24 80 02 00 	mov    rax,QWORD PTR [rsp+0x280]
 1333cc2:	00 
 1333cc3:	49 89 40 10          	mov    QWORD PTR [r8+0x10],rax
 1333cc7:	66 0f ef c0          	pxor   xmm0,xmm0
 1333ccb:	66 0f 7f 84 24 70 02 	movdqa XMMWORD PTR [rsp+0x270],xmm0
 1333cd2:	00 00 
 1333cd4:	48 83 a4 24 80 02 00 	and    QWORD PTR [rsp+0x280],0x0
 1333cdb:	00 00 
 1333cdd:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 1333ce4:	00 
 1333ce5:	48 8d 8c 24 f0 01 00 	lea    rcx,[rsp+0x1f0]
 1333cec:	00 
 1333ced:	48 8b b4 24 40 01 00 	mov    rsi,QWORD PTR [rsp+0x140]
 1333cf4:	00 
 1333cf5:	48 8b 94 24 38 01 00 	mov    rdx,QWORD PTR [rsp+0x138]
 1333cfc:	00 
 1333cfd:	e8 04 88 00 00       	call   133c506 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x181a8a>
 1333d02:	4c 8d bc 24 40 02 00 	lea    r15,[rsp+0x240]
 1333d09:	00 
 1333d0a:	49 8b 37             	mov    rsi,QWORD PTR [r15]
 1333d0d:	49 83 27 00          	and    QWORD PTR [r15],0x0
 1333d11:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
 1333d18:	00 
 1333d19:	e8 5e 3f 00 00       	call   1337c7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d200>
 1333d1e:	4c 89 ff             	mov    rdi,r15
 1333d21:	e8 d2 3f 00 00       	call   1337cf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d27c>
 1333d26:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
 1333d2d:	00 
 1333d2e:	e8 f5 79 74 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 1333d33:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
 1333d3a:	00 
 1333d3b:	e8 e8 79 74 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 1333d40:	4c 8b b3 90 03 00 00 	mov    r14,QWORD PTR [rbx+0x390]
 1333d47:	49 89 1f             	mov    QWORD PTR [r15],rbx
 1333d4a:	48 8d 2d 40 93 76 ff 	lea    rbp,[rip+0xffffffffff769340]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 1333d51:	48 8d 0d a8 3f 00 00 	lea    rcx,[rip+0x3fa8]        # 1337d00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d284>
 1333d58:	4c 8d bc 24 f0 04 00 	lea    r15,[rsp+0x4f0]
 1333d5f:	00 
 1333d60:	4c 8d ac 24 40 02 00 	lea    r13,[rsp+0x240]
 1333d67:	00 
 1333d68:	6a 08                	push   0x8
 1333d6a:	41 59                	pop    r9
 1333d6c:	4c 89 ff             	mov    rdi,r15
 1333d6f:	48 89 ee             	mov    rsi,rbp
 1333d72:	31 d2                	xor    edx,edx
 1333d74:	4d 89 e8             	mov    r8,r13
 1333d77:	e8 18 6a 4a 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 1333d7c:	4c 8d a4 24 f0 01 00 	lea    r12,[rsp+0x1f0]
 1333d83:	00 
 1333d84:	4c 89 e7             	mov    rdi,r12
 1333d87:	4c 89 f6             	mov    rsi,r14
 1333d8a:	4c 89 fa             	mov    rdx,r15
 1333d8d:	e8 8a b5 fe ff       	call   131f31c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1648a0>
 1333d92:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
 1333d99:	00 
 1333d9a:	4c 89 e6             	mov    rsi,r12
 1333d9d:	e8 50 5e 4a 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 1333da2:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
 1333da7:	e8 da a6 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1333dac:	4c 89 ff             	mov    rdi,r15
 1333daf:	e8 34 6a 4a 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 1333db4:	4c 8b b3 80 03 00 00 	mov    r14,QWORD PTR [rbx+0x380]
 1333dbb:	49 89 5d 00          	mov    QWORD PTR [r13+0x0],rbx
 1333dbf:	48 8d 0d 50 3f 00 00 	lea    rcx,[rip+0x3f50]        # 1337d16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d29a>
 1333dc6:	4c 8d bc 24 f0 04 00 	lea    r15,[rsp+0x4f0]
 1333dcd:	00 
 1333dce:	4c                   	rex.WR
 1333dcf:	8d                   	.byte 0x8d
