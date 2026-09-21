# Service184 holder CFG

## Tight block

/tmp/s184cfg/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000001333f00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179484>:
 1333f00:	0a ff                	or     bh,bh
 1333f02:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
 1333f07:	4c 89 ef             	mov    rdi,r13
 1333f0a:	4c 8b 74 24 60       	mov    r14,QWORD PTR [rsp+0x60]
 1333f0f:	4c 89 f6             	mov    rsi,r14
 1333f12:	e8 14 5f 2a 00       	call   15d9e2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f3af>
 1333f17:	88 44 24 78          	mov    BYTE PTR [rsp+0x78],al
 1333f1b:	48 8d 15 66 8c 0a ff 	lea    rdx,[rip+0xffffffffff0a8c66]        # 3dcb88 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x25d7>
 1333f22:	4c 89 ef             	mov    rdi,r13
 1333f25:	4c 89 f6             	mov    rsi,r14
 1333f28:	e8 fe 5e 2a 00       	call   15d9e2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f3af>
 1333f2d:	41 b4 01             	mov    r12b,0x1
 1333f30:	41 b7 01             	mov    r15b,0x1
 1333f33:	84 c0                	test   al,al
 1333f35:	75 15                	jne    1333f4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1794d0>
 1333f37:	48 8d 15 62 8c 0a ff 	lea    rdx,[rip+0xffffffffff0a8c62]        # 3dcba0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x25ef>
 1333f3e:	4c 89 ef             	mov    rdi,r13
 1333f41:	4c 89 f6             	mov    rsi,r14
 1333f44:	e8 e2 5e 2a 00       	call   15d9e2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f3af>
 1333f49:	41 89 c7             	mov    r15d,eax
 1333f4c:	48 8d 15 bd 8b 0a ff 	lea    rdx,[rip+0xffffffffff0a8bbd]        # 3dcb10 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x255f>
 1333f53:	4c 89 ef             	mov    rdi,r13
 1333f56:	4c 89 f6             	mov    rsi,r14
 1333f59:	e8 cd 5e 2a 00       	call   15d9e2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f3af>
 1333f5e:	84 c0                	test   al,al
 1333f60:	75 41                	jne    1333fa3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179527>
 1333f62:	48 8d 15 8f 8b 0a ff 	lea    rdx,[rip+0xffffffffff0a8b8f]        # 3dcaf8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2547>
 1333f69:	4c 89 ef             	mov    rdi,r13
 1333f6c:	4c 89 f6             	mov    rsi,r14
 1333f6f:	e8 b7 5e 2a 00       	call   15d9e2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f3af>
 1333f74:	84 c0                	test   al,al
 1333f76:	75 2b                	jne    1333fa3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179527>
 1333f78:	48 8d 15 a9 8b 0a ff 	lea    rdx,[rip+0xffffffffff0a8ba9]        # 3dcb28 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2577>
 1333f7f:	4c 89 ef             	mov    rdi,r13
 1333f82:	4c 89 f6             	mov    rsi,r14
 1333f85:	e8 a1 5e 2a 00       	call   15d9e2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f3af>
 1333f8a:	84 c0                	test   al,al
 1333f8c:	75 15                	jne    1333fa3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179527>
 1333f8e:	48 8d 15 33 70 6b 00 	lea    rdx,[rip+0x6b7033]        # 19eafc8 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x1c00>
 1333f95:	4c 89 ef             	mov    rdi,r13
 1333f98:	4c 89 f6             	mov    rsi,r14
 1333f9b:	e8 8b 5e 2a 00       	call   15d9e2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f3af>
 1333fa0:	41 89 c4             	mov    r12d,eax
 1333fa3:	80 bb d0 01 00 00 00 	cmp    BYTE PTR [rbx+0x1d0],0x0
 1333faa:	0f 84 c0 00 00 00    	je     1334070 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1795f4>
 1333fb0:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 1333fb7:	00 
 1333fb8:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
 1333fbd:	e8 26 3f 83 ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>
 1333fc2:	4c 8b b3 08 06 00 00 	mov    r14,QWORD PTR [rbx+0x608]
 1333fc9:	48 8d ac 24 f8 01 00 	lea    rbp,[rsp+0x1f8]
 1333fd0:	00 
 1333fd1:	48 89 5d f8          	mov    QWORD PTR [rbp-0x8],rbx
 1333fd5:	48 8d b4 24 40 02 00 	lea    rsi,[rsp+0x240]
 1333fdc:	00 
 1333fdd:	48 89 ef             	mov    rdi,rbp
 1333fe0:	e8 c7 51 84 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
 1333fe5:	48 8d 35 b4 5a 84 ff 	lea    rsi,[rip+0xffffffffff845ab4]        # b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>
 1333fec:	48 8d 15 3d ea 85 ff 	lea    rdx,[rip+0xffffffffff85ea3d]        # b92a30 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdf9d0>
 1333ff3:	48 8d 0d 4e 3d 00 00 	lea    rcx,[rip+0x3d4e]        # 1337d48 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d2cc>
 1333ffa:	4c 8d ac 24 f0 04 00 	lea    r13,[rsp+0x4f0]
 1334001:	00 
 1334002:	4c 8d 84 24 f0 01 00 	lea    r8,[rsp+0x1f0]
 1334009:	00 
 133400a:	6a 18                	push   0x18
 133400c:	41 59                	pop    r9
 133400e:	4c 89 ef             	mov    rdi,r13
 1334011:	e8 7e 67 4a 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 1334016:	49 8b 06             	mov    rax,QWORD PTR [r14]
 1334019:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
 1334020:	00 
 1334021:	4c 89 f6             	mov    rsi,r14
 1334024:	4c 89 ea             	mov    rdx,r13
 1334027:	ff 90 70 01 00 00    	call   QWORD PTR [rax+0x170]
 133402d:	4c 8d b4 24 30 02 00 	lea    r14,[rsp+0x230]
 1334034:	00 
 1334035:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
 133403c:	00 
 133403d:	4c 89 f6             	mov    rsi,r14
 1334040:	e8 ad 5b 4a 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 1334045:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 1334049:	e8 38 a4 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 133404e:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 1334055:	00 
 1334056:	e8 8d 67 4a 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 133405b:	48 89 ef             	mov    rdi,rbp
 133405e:	e8 c3 ca 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 1334063:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 133406a:	00 
 133406b:	e8 b6 ca 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 1334070:	45 84 e4             	test   r12b,r12b
 1334073:	0f 84 be 00 00 00    	je     1334137 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1796bb>
 1334079:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 1334080:	00 
 1334081:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
 1334086:	e8 5d 3e 83 ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>
 133408b:	4c 8b b3 d0 03 00 00 	mov    r14,QWORD PTR [rbx+0x3d0]
 1334092:	4c 8d a4 24 f8 01 00 	lea    r12,[rsp+0x1f8]
 1334099:	00 
 133409a:	49 89 5c 24 f8       	mov    QWORD PTR [r12-0x8],rbx
 133409f:	48 8d b4 24 40 02 00 	lea    rsi,[rsp+0x240]
 13340a6:	00 
 13340a7:	4c 89 e7             	mov    rdi,r12
 13340aa:	e8 fd 50 84 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
 13340af:	48 8d 35 ea 59 84 ff 	lea    rsi,[rip+0xffffffffff8459ea]        # b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>
 13340b6:	48 8d 15 73 e9 85 ff 	lea    rdx,[rip+0xffffffffff85e973]        # b92a30 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdf9d0>
 13340bd:	48 8d 0d 88 3d 00 00 	lea    rcx,[rip+0x3d88]        # 1337e4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d3d0>
 13340c4:	4c 8d ac 24 f0 04 00 	lea    r13,[rsp+0x4f0]
 13340cb:	00 
 13340cc:	4c 8d 84 24 f0 01 00 	lea    r8,[rsp+0x1f0]
 13340d3:	00 
 13340d4:	6a 18                	push   0x18
 13340d6:	41 59                	pop    r9
 13340d8:	4c 89 ef             	mov    rdi,r13
 13340db:	e8 b4 66 4a 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 13340e0:	49 8b 06             	mov    rax,QWORD PTR [r14]
 13340e3:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
 13340ea:	00 
 13340eb:	4c 89 f6             	mov    rsi,r14
 13340ee:	4c 89 ea             	mov    rdx,r13
 13340f1:	ff 50 18             	call   QWORD PTR [rax+0x18]
 13340f4:	4c 8d b4 24 30 02 00 	lea    r14,[rsp+0x230]
 13340fb:	00 
 13340fc:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
 1334103:	00 
 1334104:	4c 89 f6             	mov    rsi,r14
 1334107:	e8 e6 5a 4a 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 133410c:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 1334110:	e8 71 a3 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1334115:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 133411c:	00 
 133411d:	e8 c6 66 4a 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 1334122:	4c 89 e7             	mov    rdi,r12
 1334125:	e8 fc c9 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 133412a:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 1334131:	00 
 1334132:	e8 ef c9 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 1334137:	80 bb d0 01 00 00 00 	cmp    BYTE PTR [rbx+0x1d0],0x0
 133413e:	0f 84 b4 00 00 00    	je     13341f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17977c>
 1334144:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 133414b:	00 
 133414c:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
 1334151:	e8 92 3d 83 ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>
 1334156:	4c 8b a3 48 04 00 00 	mov    r12,QWORD PTR [rbx+0x448]
 133415d:	4c 8d b4 24 f8 01 00 	lea    r14,[rsp+0x1f8]
 1334164:	00 
 1334165:	49 89 5e f8          	mov    QWORD PTR [r14-0x8],rbx
 1334169:	48 8d b4 24 40 02 00 	lea    rsi,[rsp+0x240]
 1334170:	00 
 1334171:	4c 89 f7             	mov    rdi,r14
 1334174:	e8 33 50 84 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
 1334179:	48 8d 35 20 59 84 ff 	lea    rsi,[rip+0xffffffffff845920]        # b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>
 1334180:	48 8d 15 a9 e8 85 ff 	lea    rdx,[rip+0xffffffffff85e8a9]        # b92a30 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdf9d0>
 1334187:	48 8d 0d c2 3d 00 00 	lea    rcx,[rip+0x3dc2]        # 1337f50 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d4d4>
 133418e:	4c 8d ac 24 f0 04 00 	lea    r13,[rsp+0x4f0]
 1334195:	00 
 1334196:	4c 8d 84 24 f0 01 00 	lea    r8,[rsp+0x1f0]
 133419d:	00 
 133419e:	6a 18                	push   0x18
 13341a0:	41 59                	pop    r9
 13341a2:	4c 89 ef             	mov    rdi,r13
 13341a5:	e8 ea 65 4a 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 13341aa:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 13341ae:	48 8d ac 24 30 02 00 	lea    rbp,[rsp+0x230]
 13341b5:	00 
 13341b6:	48 89 ef             	mov    rdi,rbp
 13341b9:	4c 89 e6             	mov    rsi,r12
 13341bc:	4c 89 ea             	mov    rdx,r13
 13341bf:	ff 50 10             	call   QWORD PTR [rax+0x10]
 13341c2:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
 13341c9:	00 
 13341ca:	48 89 ee             	mov    rsi,rbp
 13341cd:	e8 20 5a 4a 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 13341d2:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
 13341d6:	e8 ab a2 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 13341db:	4c 89 ef             	mov    rdi,r13
 13341de:	e8 05 66 4a 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 13341e3:	4c 89 f7             	mov    rdi,r14
 13341e6:	e8 3b c9 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 13341eb:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 13341f2:	00 
 13341f3:	e8 2e c9 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 13341f8:	4c 8b a3 40 04 00 00 	mov    r12,QWORD PTR [rbx+0x440]
 13341ff:	4c 8d 84 24 40 02 00 	lea    r8,[rsp+0x240]
 1334206:	00 
 1334207:	49 89 18             	mov    QWORD PTR [r8],rbx
 133420a:	48 8d 35 80 8e 76 ff 	lea    rsi,[rip+0xffffffffff768e80]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 1334211:	48 8d 0d 6e 3e 00 00 	lea    rcx,[rip+0x3e6e]        # 1338086 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d60a>
 1334218:	4c 8d b4 24 f0 04 00 	lea    r14,[rsp+0x4f0]
 133421f:	00 
 1334220:	6a 08                	push   0x8
 1334222:	41 59                	pop    r9
 1334224:	4c 89 f7             	mov    rdi,r14
 1334227:	31 d2                	xor    edx,edx
 1334229:	e8 66 65 4a 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 133422e:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 1334232:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1334235:	4c 8d a4 24 f0 01 00 	lea    r12,[rsp+0x1f0]
 133423c:	00 
 133423d:	4c 89 e7             	mov    rdi,r12
 1334240:	4c 89 f2             	mov    rdx,r14
 1334243:	ff 50 10             	call   QWORD PTR [rax+0x10]
 1334246:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
 133424d:	00 
 133424e:	4c 89 e6             	mov    rsi,r12
 1334251:	e8 9c 59 4a 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 1334256:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
 133425b:	e8 26 a2 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1334260:	4c 89 f7             	mov    rdi,r14
 1334263:	e8 80 65 4a 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 1334268:	80 7c 24 78 00       	cmp    BYTE PTR [rsp+0x78],0x0
 133426d:	74 3f                	je     13342ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179832>
 133426f:	4c 8b 74 24 70       	mov    r14,QWORD PTR [rsp+0x70]
 1334274:	49 8b 36             	mov    rsi,QWORD PTR [r14]
 1334277:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 133427e:	00 
 133427f:	e8 da d0 00 00       	call   134135e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1868e2>
 1334284:	48 8d b4 24 f0 04 00 	lea    rsi,[rsp+0x4f0]
 133428b:	00 
 133428c:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
 1334293:	00 
 1334294:	e8 3d 44 fa ff       	call   12d86d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11dc5a>
 1334299:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 13342a0:	00 
 13342a1:	e8 e4 1a d6 ff       	call   1095d8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25d1a0>
 13342a6:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
 13342a9:	e8 70 d2 00 00       	call   134151e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x186aa2>
 13342ae:	45 84 ff             	test   r15b,r15b
 13342b1:	74 10                	je     13342c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179847>
 13342b3:	48 8b 84 24 30 01 00 	mov    rax,QWORD PTR [rsp+0x130]
 13342ba:	00 
 13342bb:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 13342be:	e8 f9 b5 fe ff       	call   131f8bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x164e40>
 13342c3:	80 bb 30 02 00 00 00 	cmp    BYTE PTR [rbx+0x230],0x0
 13342ca:	0f 84 8a 00 00 00    	je     133435a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1798de>
 13342d0:	4c 8b bb 18 02 00 00 	mov    r15,QWORD PTR [rbx+0x218]
 13342d7:	4d 85 ff             	test   r15,r15
 13342da:	74 7e                	je     133435a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1798de>
 13342dc:	4c 8d 84 24 30 02 00 	lea    r8,[rsp+0x230]
 13342e3:	00 
 13342e4:	49 89 18             	mov    QWORD PTR [r8],rbx
 13342e7:	48 8d 35 a3 8d 76 ff 	lea    rsi,[rip+0xffffffffff768da3]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 13342ee:	48 8d 0d 41 3e 00 00 	lea    rcx,[rip+0x3e41]        # 1338136 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d6ba>
 13342f5:	4c 8d b4 24 f0 01 00 	lea    r14,[rsp+0x1f0]
 13342fc:	00 
 13342fd:	6a 08                	push   0x8
 13342ff:	41 59                	pop    r9
 1334301:	4c 89 f7             	mov    rdi,r14
 1334304:	31 d2                	xor    edx,edx
 1334306:	e8 89 64 4a 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 133430b:	4c 8d a4 24 f0 04 00 	lea    r12,[rsp+0x4f0]
 1334312:	00 
 1334313:	4c 89 e7             	mov    rdi,r12
 1334316:	4c 89 f6             	mov    rsi,r14
 1334319:	e8 1c 64 4a 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
 133431e:	4c 8d ac 24 40 02 00 	lea    r13,[rsp+0x240]
 1334325:	00 
 1334326:	4c 89 ef             	mov    rdi,r13
 1334329:	4c 89 fe             	mov    rsi,r15
 133432c:	4c 89 e2             	mov    rdx,r12
 133432f:	e8 96 5c 4a 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
 1334334:	4c 89 e7             	mov    rdi,r12
 1334337:	e8 ac 64 4a 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 133433c:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
 1334341:	4c 89 ee             	mov    rsi,r13
 1334344:	e8 a9 58 4a 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 1334349:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
 133434d:	e8 34 a1 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1334352:	4c 89 f7             	mov    rdi,r14
 1334355:	e8 8e 64 4a 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 133435a:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]
 1334361:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1334364:	ff 50 20             	call   QWORD PTR [rax+0x20]
 1334367:	89 c1                	mov    ecx,eax
 1334369:	80 f1 01             	xor    cl,0x1
 133436c:	88 8b e0 05 00 00    	mov    BYTE PTR [rbx+0x5e0],cl
 1334372:	84 c0                	test   al,al
 1334374:	75 08                	jne    133437e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179902>
 1334376:	48 89 df             	mov    rdi,rbx
 1334379:	e8 1e 3f 00 00       	call   133829c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d820>
 133437e:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
 1334385:	00 
 1334386:	e8 9d 73 74 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 133438b:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
 1334392:	00 
 1334393:	e8 ee 46 00 00       	call   1338a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e00a>
 1334398:	31 ff                	xor    edi,edi
 133439a:	e8 e7 a0 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 133439f:	48 8d bc 24 e8 01 00 	lea    rdi,[rsp+0x1e8]
 13343a6:	00 
 13343a7:	e8 5e 5f fe ff       	call   131a30a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f88e>
 13343ac:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
 13343b1:	e8 d0 a0 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 13343b6:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
 13343bd:	00 
 13343be:	e8 6b 0f 39 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
 13343c3:	4c 8b b4 24 c8 00 00 	mov    r14,QWORD PTR [rsp+0xc8]
 13343ca:	00 
 13343cb:	49 89 1e             	mov    QWORD PTR [r14],rbx
 13343ce:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
 13343d5:	00 
 13343d6:	e8 2f 5f fe ff       	call   131a30a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f88e>
 13343db:	48 8b bc 24 c8 01 00 	mov    rdi,QWORD PTR [rsp+0x1c8]
 13343e2:	00 
 13343e3:	e8 9e a0 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 13343e8:	48 8b bc 24 e0 01 00 	mov    rdi,QWORD PTR [rsp+0x1e0]
 13343ef:	00 
 13343f0:	e8 91 a0 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 13343f5:	31 ff                	xor    edi,edi
 13343f7:	e8 8a a0 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 13343fc:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
 1334403:	00 
 1334404:	e8 25 0f 39 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
 1334409:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
 1334410:	00 
 1334411:	e8 8e 12 00 00       	call   13356a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ac28>
 1334416:	48 8b bc 24 a8 01 00 	mov    rdi,QWORD PTR [rsp+0x1a8]
 133441d:	00 
 133441e:	e8 63 a0 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1334423:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 133442a:	00 00 
 133442c:	48 3b 84 24 30 05 00 	cmp    rax,QWORD PTR [rsp+0x530]
 1334433:	00 
 1334434:	0f 85 9b 07 00 00    	jne    1334bd5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a159>
 133443a:	4c 89 f0             	mov    rax,r14
 133443d:	48 81 c4 38 05 00 00 	add    rsp,0x538
 1334444:	5b                   	pop    rbx
 1334445:	41 5c                	pop    r12
 1334447:	41 5d                	pop    r13
 1334449:	41 5e                	pop    r14
 133444b:	41 5f                	pop    r15
 133444d:	5d                   	pop    rbp
 133444e:	c3                   	ret
 133444f:	48 8d 9c 24 f0 04 00 	lea    rbx,[rsp+0x4f0]
 1334456:	00 
 1334457:	48 8d b4 24 10 04 00 	lea    rsi,[rsp+0x410]
 133445e:	00 
 133445f:	48 89 df             	mov    rdi,rbx
 1334462:	e8 c3 60 39 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
 1334467:	48 8d 35 c6 af ff fe 	lea    rsi,[rip+0xfffffffffeffafc6]        # 32f434 <_ZTSSt12bad_any_cast@@Base-0x60d94>
 133446e:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
 1334475:	00 
 1334476:	48 8d 8c 24 a0 03 00 	lea    rcx,[rsp+0x3a0]
 133447d:	00 
 133447e:	4c 89 f7             	mov    rdi,r14
 1334481:	48 89 da             	mov    rdx,rbx
 1334484:	e8 2e 5f 2a 00       	call   15da3b7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f93b>
 1334489:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
 133448d:	48 89 84 24 a0 02 00 	mov    QWORD PTR [rsp+0x2a0],rax
 1334494:	00 
 1334495:	66 41 0f 6f 06       	movdqa xmm0,XMMWORD PTR [r14]
 133449a:	66 0f 7f 84 24 90 02 	movdqa XMMWORD PTR [rsp+0x290],xmm0
 13344a1:	00 00 
 13344a3:	66 0f ef c0          	pxor   xmm0,xmm0
 13344a7:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
 13344ac:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
 13344b1:	83 a4 24 a8 02 00 00 	and    DWORD PTR [rsp+0x2a8],0x0
 13344b8:	00 
 13344b9:	4c 89 f7             	mov    rdi,r14
 13344bc:	e8 cf 99 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 13344c1:	48 89 df             	mov    rdi,rbx
 13344c4:	e8 c7 99 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 13344c9:	eb 47                	jmp    1334512 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179a96>
 13344cb:	d1 e9                	shr    ecx,1
 13344cd:	48 85 c9             	test   rcx,rcx
 13344d0:	74 47                	je     1334519 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179a9d>
 13344d2:	48 8b 84 24 b0 03 00 	mov    rax,QWORD PTR [rsp+0x3b0]
 13344d9:	00 
 13344da:	48 89 84 24 a0 02 00 	mov    QWORD PTR [rsp+0x2a0],rax
 13344e1:	00 
 13344e2:	66 0f 6f 84 24 a0 03 	movdqa xmm0,XMMWORD PTR [rsp+0x3a0]
 13344e9:	00 00 
 13344eb:	66 0f 7f 84 24 90 02 	movdqa XMMWORD PTR [rsp+0x290],xmm0
 13344f2:	00 00 
 13344f4:	66 0f ef c0          	pxor   xmm0,xmm0
 13344f8:	66 0f 7f 84 24 a0 03 	movdqa XMMWORD PTR [rsp+0x3a0],xmm0
 13344ff:	00 00 
 1334501:	48 83 a4 24 b0 03 00 	and    QWORD PTR [rsp+0x3b0],0x0
 1334508:	00 00 
 133450a:	83 a4 24 a8 02 00 00 	and    DWORD PTR [rsp+0x2a8],0x0
 1334511:	00 
 1334512:	b3 01                	mov    bl,0x1
 1334514:	e9 87 00 00 00       	jmp    13345a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179b24>
 1334519:	48 83 a4 24 f0 01 00 	and    QWORD PTR [rsp+0x1f0],0x0
 1334520:	00 00 
 1334522:	48 8d 8c 24 f0 04 00 	lea    rcx,[rsp+0x4f0]
 1334529:	00 
 133452a:	48 89 01             	mov    QWORD PTR [rcx],rax
 133452d:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
 1334534:	00 
 1334535:	48 8d 94 24 10 04 00 	lea    rdx,[rsp+0x410]
 133453c:	00 
 133453d:	4c 89 f6             	mov    rsi,r14
 1334540:	e8 a5 08 00 00       	call   1334dea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a36e>
 1334545:	48 8b bc 24 f0 04 00 	mov    rdi,QWORD PTR [rsp+0x4f0]
 133454c:	00 
 133454d:	48 85 ff             	test   rdi,rdi
 1334550:	74 06                	je     1334558 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179adc>
 1334552:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1334555:	ff 50 08             	call   QWORD PTR [rax+0x8]
 1334558:	48 8d b4 24 10 04 00 	lea    rsi,[rsp+0x410]
 133455f:	00 
 1334560:	4c 89 e7             	mov    rdi,r12
 1334563:	e8 66 0a 00 00       	call   1334fce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a552>

## Direct branch/call references to cold targets
### target 133444f
2646022: 133352a:	0f 84 1f 0f 00 00    	je     133444f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1799d3>
### target 13344cb
2646026: 133353b:	0f 84 8a 0f 00 00    	je     13344cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179a4f>
### target 1334512
2646974: 13344c9:	eb 47                	jmp    1334512 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179a96>
### target 1334519
2646977: 13344d0:	74 47                	je     1334519 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179a9d>
### target 133452a

## Every branch in owning range into 0x1334400..0x1334568
 1332f97:	e9 7a 14 00 00       	jmp    1334416 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17999a>
 133352a:	0f 84 1f 0f 00 00    	je     133444f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1799d3>
 133353b:	0f 84 8a 0f 00 00    	je     13344cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179a4f>
 1333549:	e9 7f 0f 00 00       	jmp    13344cd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179a51>
 13344c9:	eb 47                	jmp    1334512 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179a96>
 13344d0:	74 47                	je     1334519 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179a9d>
 1334550:	74 06                	je     1334558 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179adc>
 1334611:	e9 f3 fd ff ff       	jmp    1334409 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17998d>

## RAX/RCX definitions in 0x1333f00..0x133452a
 1333f12:	e8 14 5f 2a 00       	call   15d9e2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f3af>
 1333f28:	e8 fe 5e 2a 00       	call   15d9e2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f3af>
 1333f44:	e8 e2 5e 2a 00       	call   15d9e2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f3af>
 1333f59:	e8 cd 5e 2a 00       	call   15d9e2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f3af>
 1333f6f:	e8 b7 5e 2a 00       	call   15d9e2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f3af>
 1333f85:	e8 a1 5e 2a 00       	call   15d9e2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f3af>
 1333f9b:	e8 8b 5e 2a 00       	call   15d9e2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f3af>
 1333fbd:	e8 26 3f 83 ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>
 1333fe0:	e8 c7 51 84 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
 1333ff3:	48 8d 0d 4e 3d 00 00 	lea    rcx,[rip+0x3d4e]        # 1337d48 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d2cc>
 1334011:	e8 7e 67 4a 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 1334016:	49 8b 06             	mov    rax,QWORD PTR [r14]
 1334027:	ff 90 70 01 00 00    	call   QWORD PTR [rax+0x170]
 1334040:	e8 ad 5b 4a 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 1334049:	e8 38 a4 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1334056:	e8 8d 67 4a 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 133405e:	e8 c3 ca 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 133406b:	e8 b6 ca 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 1334086:	e8 5d 3e 83 ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>
 13340aa:	e8 fd 50 84 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
 13340bd:	48 8d 0d 88 3d 00 00 	lea    rcx,[rip+0x3d88]        # 1337e4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d3d0>
 13340db:	e8 b4 66 4a 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 13340e0:	49 8b 06             	mov    rax,QWORD PTR [r14]
 13340f1:	ff 50 18             	call   QWORD PTR [rax+0x18]
 1334107:	e8 e6 5a 4a 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 1334110:	e8 71 a3 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 133411d:	e8 c6 66 4a 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 1334125:	e8 fc c9 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 1334132:	e8 ef c9 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 1334151:	e8 92 3d 83 ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>
 1334174:	e8 33 50 84 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
 1334187:	48 8d 0d c2 3d 00 00 	lea    rcx,[rip+0x3dc2]        # 1337f50 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d4d4>
 13341a5:	e8 ea 65 4a 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 13341aa:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 13341bf:	ff 50 10             	call   QWORD PTR [rax+0x10]
 13341cd:	e8 20 5a 4a 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 13341d6:	e8 ab a2 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 13341de:	e8 05 66 4a 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 13341e6:	e8 3b c9 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 13341f3:	e8 2e c9 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 1334211:	48 8d 0d 6e 3e 00 00 	lea    rcx,[rip+0x3e6e]        # 1338086 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d60a>
 1334229:	e8 66 65 4a 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 1334232:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1334243:	ff 50 10             	call   QWORD PTR [rax+0x10]
 1334251:	e8 9c 59 4a 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 133425b:	e8 26 a2 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1334263:	e8 80 65 4a 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 133427f:	e8 da d0 00 00       	call   134135e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1868e2>
 1334294:	e8 3d 44 fa ff       	call   12d86d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11dc5a>
 13342a1:	e8 e4 1a d6 ff       	call   1095d8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25d1a0>
 13342a9:	e8 70 d2 00 00       	call   134151e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x186aa2>
 13342b3:	48 8b 84 24 30 01 00 	mov    rax,QWORD PTR [rsp+0x130]
 13342be:	e8 f9 b5 fe ff       	call   131f8bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x164e40>
 13342ee:	48 8d 0d 41 3e 00 00 	lea    rcx,[rip+0x3e41]        # 1338136 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d6ba>
 1334306:	e8 89 64 4a 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 1334319:	e8 1c 64 4a 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
 133432f:	e8 96 5c 4a 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
 1334337:	e8 ac 64 4a 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 1334344:	e8 a9 58 4a 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 133434d:	e8 34 a1 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1334355:	e8 8e 64 4a 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 1334361:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1334364:	ff 50 20             	call   QWORD PTR [rax+0x20]
 1334379:	e8 1e 3f 00 00       	call   133829c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d820>
 1334386:	e8 9d 73 74 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 1334393:	e8 ee 46 00 00       	call   1338a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e00a>
 133439a:	e8 e7 a0 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 13343a7:	e8 5e 5f fe ff       	call   131a30a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f88e>
 13343b1:	e8 d0 a0 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 13343be:	e8 6b 0f 39 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
 13343d6:	e8 2f 5f fe ff       	call   131a30a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f88e>
 13343e3:	e8 9e a0 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 13343f0:	e8 91 a0 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 13343f7:	e8 8a a0 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1334404:	e8 25 0f 39 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
 1334411:	e8 8e 12 00 00       	call   13356a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ac28>
 133441e:	e8 63 a0 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1334423:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 133443a:	4c 89 f0             	mov    rax,r14
 1334462:	e8 c3 60 39 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
 1334476:	48 8d 8c 24 a0 03 00 	lea    rcx,[rsp+0x3a0]
 1334484:	e8 2e 5f 2a 00       	call   15da3b7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f93b>
 1334489:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
 13344bc:	e8 cf 99 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 13344c4:	e8 c7 99 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 13344d2:	48 8b 84 24 b0 03 00 	mov    rax,QWORD PTR [rsp+0x3b0]
 1334522:	48 8d 8c 24 f0 04 00 	lea    rcx,[rsp+0x4f0]
