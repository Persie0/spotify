# Service184 holder-source provenance

Proven chain:
- map lookup 0x1334d26 returns node N
- N+0xa0 is a shared-pointer-like pair
- object = [N+0xa0]
- service184 = [object+0x10], moved out at 0x1332fca/0x1332fce
- 0x1334dea wraps that pointer; tagged payload later installs it at serviceTable[184]

## Exact producer/consumer window
 1332f60:	48 85 ff             	test   rdi,rdi
 1332f63:	74 37                	je     1332f9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178520>
 1332f65:	e8 d6 b1 4b 00       	call   17ee140 <_ZNSt6__ndk119__shared_weak_count4lockEv@plt>
 1332f6a:	48 85 c0             	test   rax,rax
 1332f6d:	74 2d                	je     1332f9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178520>
 1332f6f:	48 89 c7             	mov    rdi,rax
 1332f72:	48 8b 83 a0 00 00 00 	mov    rax,QWORD PTR [rbx+0xa0]
 1332f79:	48 85 c0             	test   rax,rax
 1332f7c:	74 20                	je     1332f9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178522>
 1332f7e:	48 89 84 24 90 02 00 	mov    QWORD PTR [rsp+0x290],rax
 1332f85:	00 
 1332f86:	48 89 bc 24 98 02 00 	mov    QWORD PTR [rsp+0x298],rdi
 1332f8d:	00 
 1332f8e:	e9 b2 00 00 00       	jmp    1333045 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1785c9>
 1332f93:	49 83 26 00          	and    QWORD PTR [r14],0x0
 1332f97:	e9 7a 14 00 00       	jmp    1334416 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17999a>
 1332f9c:	31 ff                	xor    edi,edi
 1332f9e:	e8 e3 b4 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1332fa3:	49 8d 6e 58          	lea    rbp,[r14+0x58]
 1332fa7:	48 8d b4 24 10 04 00 	lea    rsi,[rsp+0x410]
 1332fae:	00 
 1332faf:	48 89 ef             	mov    rdi,rbp
 1332fb2:	e8 6f 1d 00 00       	call   1334d26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a2aa>
 1332fb7:	48 85 c0             	test   rax,rax
 1332fba:	0f 84 2e 05 00 00    	je     13334ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178a72>
 1332fc0:	49 89 c5             	mov    r13,rax
 1332fc3:	48 8b 80 a0 00 00 00 	mov    rax,QWORD PTR [rax+0xa0]
 1332fca:	48 8b 50 10          	mov    rdx,QWORD PTR [rax+0x10]
 1332fce:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
 1332fd3:	4c 89 eb             	mov    rbx,r13
 1332fd6:	48 83 c3 10          	add    rbx,0x10
 1332fda:	48 8d 8c 24 e0 02 00 	lea    rcx,[rsp+0x2e0]
 1332fe1:	00 
 1332fe2:	48 89 11             	mov    QWORD PTR [rcx],rdx
 1332fe5:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
 1332fec:	00 
 1332fed:	4c 89 f6             	mov    rsi,r14
 1332ff0:	48 89 da             	mov    rdx,rbx
 1332ff3:	e8 f2 1d 00 00       	call   1334dea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a36e>
 1332ff8:	48 8b bc 24 e0 02 00 	mov    rdi,QWORD PTR [rsp+0x2e0]
 1332fff:	00 
 1333000:	48 85 ff             	test   rdi,rdi
 1333003:	74 06                	je     133300b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17858f>
 1333005:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1333008:	ff 50 08             	call   QWORD PTR [rax+0x8]
 133300b:	4c 89 e7             	mov    rdi,r12
 133300e:	48 89 de             	mov    rsi,rbx
 1333011:	e8 b8 1f 00 00       	call   1334fce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a552>
 1333016:	0f 28 84 24 a0 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x3a0]
 133301d:	00 
 133301e:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
 1333023:	48 89 c7             	mov    rdi,rax
 1333026:	e8 df 68 7f ff       	call   b2990a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x768aa>
 133302b:	48 89 ef             	mov    rdi,rbp
 133302e:	4c 89 ee             	mov    rsi,r13
 1333031:	e8 3e 24 00 00       	call   1335474 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a9f8>
 1333036:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
 133303c:	66 0f 7f 84 24 90 02 	movdqa XMMWORD PTR [rsp+0x290],xmm0
 1333043:	00 00 
 1333045:	c7 84 24 a8 02 00 00 	mov    DWORD PTR [rsp+0x2a8],0x1

## First-insertion / map-value path near 0x1334519
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
 1334568:	0f 28 84 24 e0 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x2e0]
 133456f:	00 
 1334570:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
 1334575:	48 89 c7             	mov    rdi,rax
 1334578:	e8 8d 53 7f ff       	call   b2990a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x768aa>
 133457d:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
 1334583:	66 0f 7f 84 24 90 02 	movdqa XMMWORD PTR [rsp+0x290],xmm0
 133458a:	00 00 
 133458c:	c7 84 24 a8 02 00 00 	mov    DWORD PTR [rsp+0x2a8],0x1
 1334593:	01 00 00 00 
 1334597:	31 db                	xor    ebx,ebx
 1334599:	31 ff                	xor    edi,edi
 133459b:	e8 e6 9e 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

## Definitions relevant to RAX before 0x133452a
FDE=(20131328, 20138970)
 1332e17:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1332e36:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1332e6d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1332eef:	48 8b 84 24 90 01 00 	mov    rax,QWORD PTR [rsp+0x190]
 1332f21:	48 8b 84 24 70 01 00 	mov    rax,QWORD PTR [rsp+0x170]
 1332f72:	48 8b 83 a0 00 00 00 	mov    rax,QWORD PTR [rbx+0xa0]
 1332f7e:	48 89 84 24 90 02 00 	mov    QWORD PTR [rsp+0x290],rax
 1332f86:	48 89 bc 24 98 02 00 	mov    QWORD PTR [rsp+0x298],rdi
 1332fc3:	48 8b 80 a0 00 00 00 	mov    rax,QWORD PTR [rax+0xa0]
 1332fda:	48 8d 8c 24 e0 02 00 	lea    rcx,[rsp+0x2e0]
 1332ff8:	48 8b bc 24 e0 02 00 	mov    rdi,QWORD PTR [rsp+0x2e0]
 1333005:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 133303c:	66 0f 7f 84 24 90 02 	movdqa XMMWORD PTR [rsp+0x290],xmm0
 1333090:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
 13330a2:	48 8d 8c 24 90 02 00 	lea    rcx,[rsp+0x290]
 13330b2:	48 8b 01             	mov    rax,QWORD PTR [rcx]
 13330d7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 133313e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 133317d:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
 133318a:	49 8b 47 30          	mov    rax,QWORD PTR [r15+0x30]
 13331aa:	49 8b 47 70          	mov    rax,QWORD PTR [r15+0x70]
 13331b6:	49 8b 47 78          	mov    rax,QWORD PTR [r15+0x78]
 13331ce:	49 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [r15+0xb0]
 13331e8:	49 8b 87 b8 00 00 00 	mov    rax,QWORD PTR [r15+0xb8]
 1333209:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]
 1333226:	48 8b 84 24 c8 01 00 	mov    rax,QWORD PTR [rsp+0x1c8]
 133323d:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
 133325b:	49 8b 87 c0 00 00 00 	mov    rax,QWORD PTR [r15+0xc0]
 133326a:	48 8d 05 47 2d 53 00 	lea    rax,[rip+0x532d47]        # 1865fb8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x226a0>
 1333285:	48 8d 05 b4 2a 53 00 	lea    rax,[rip+0x532ab4]        # 1865d40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22428>
 133328f:	48 8d 05 8a 2b 53 00 	lea    rax,[rip+0x532b8a]        # 1865e20 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22508>
 133329a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 13332b2:	48 8b 84 24 a8 01 00 	mov    rax,QWORD PTR [rsp+0x1a8]
 133332a:	48 8d 83 78 02 00 00 	lea    rax,[rbx+0x278]
 13333a3:	48 09 c8             	or     rax,rcx
 13333ea:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 1333406:	48 8d 94 24 f0 04 00 	lea    rdx,[rsp+0x4f0]
 1333432:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 1333446:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 1333462:	48 8d 94 24 f0 04 00 	lea    rdx,[rsp+0x4f0]
 133348e:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 13334a2:	48 8b 83 70 03 00 00 	mov    rax,QWORD PTR [rbx+0x370]
 1333503:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
 133351a:	48 8b 84 24 f0 01 00 	mov    rax,QWORD PTR [rsp+0x1f0]
 1333553:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 13335b3:	48 8d 83 30 01 00 00 	lea    rax,[rbx+0x130]
 13335ea:	48 8d 83 90 03 00 00 	lea    rax,[rbx+0x390]
 1333677:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 1333683:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
 13337cf:	48 8d 83 d8 04 00 00 	lea    rax,[rbx+0x4d8]
 13337db:	48 8d 83 f8 04 00 00 	lea    rax,[rbx+0x4f8]
 13337e7:	48 8d 83 18 05 00 00 	lea    rax,[rbx+0x518]
 13337f6:	48 8d 83 40 05 00 00 	lea    rax,[rbx+0x540]
 1333802:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
 1333824:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
 1333830:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 133383c:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
 1333860:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 13338a5:	4c 8d a4 24 f0 04 00 	lea    r12,[rsp+0x4f0]
 13338b2:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 13338de:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 13338ea:	48 8b 84 24 48 01 00 	mov    rax,QWORD PTR [rsp+0x148]
 13338f9:	48 8d 83 18 06 00 00 	lea    rax,[rbx+0x618]
 1333981:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1333993:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 13339a4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 13339c3:	48 8d 05 16 25 53 00 	lea    rax,[rip+0x532516]        # 1865ee0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x225c8>
 13339f9:	48 8b 83 70 03 00 00 	mov    rax,QWORD PTR [rbx+0x370]
 1333a0e:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 1333a21:	48 89 8c 24 f0 04 00 	mov    QWORD PTR [rsp+0x4f0],rcx
 1333a60:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 1333afe:	4c 8d a4 24 f0 04 00 	lea    r12,[rsp+0x4f0]
 1333b14:	49 8b 07             	mov    rax,QWORD PTR [r15]
 1333b17:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
 1333b2c:	4c 8d bc 24 f0 01 00 	lea    r15,[rsp+0x1f0]
 1333b4a:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 1333bbe:	48 8d b4 24 f0 04 00 	lea    rsi,[rsp+0x4f0]
 1333be4:	48 8d b4 24 f0 04 00 	lea    rsi,[rsp+0x4f0]
 1333bfe:	48 8d b4 24 f0 04 00 	lea    rsi,[rsp+0x4f0]
 1333c2a:	66 0f 7f 84 24 f0 01 	movdqa XMMWORD PTR [rsp+0x1f0],xmm0
 1333c3a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1333c3d:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 1333c5b:	4c 8d a4 24 f0 01 00 	lea    r12,[rsp+0x1f0]
 1333c66:	48 8b bc 24 f0 04 00 	mov    rdi,QWORD PTR [rsp+0x4f0]
 1333c98:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 1333cbb:	48 8b 84 24 80 02 00 	mov    rax,QWORD PTR [rsp+0x280]
 1333ce5:	48 8d 8c 24 f0 01 00 	lea    rcx,[rsp+0x1f0]
 1333d33:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
 1333d58:	4c 8d bc 24 f0 04 00 	lea    r15,[rsp+0x4f0]
 1333d7c:	4c 8d a4 24 f0 01 00 	lea    r12,[rsp+0x1f0]
 1333dc6:	4c 8d bc 24 f0 04 00 	lea    r15,[rsp+0x4f0]
 1333dea:	4c 8d a4 24 f0 01 00 	lea    r12,[rsp+0x1f0]
 1333e34:	4c 8d bc 24 f0 04 00 	lea    r15,[rsp+0x4f0]
 1333e58:	4c 8d a4 24 f0 01 00 	lea    r12,[rsp+0x1f0]
 1333ea2:	4c 8d bc 24 f0 04 00 	lea    r15,[rsp+0x4f0]
 1333ec3:	4c 8d a4 24 f0 01 00 	lea    r12,[rsp+0x1f0]
 1333f12:	e8 14 5f 2a 00       	call   15d9e2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f3af>
 1333f28:	e8 fe 5e 2a 00       	call   15d9e2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f3af>
 1333f44:	e8 e2 5e 2a 00       	call   15d9e2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f3af>
 1333f59:	e8 cd 5e 2a 00       	call   15d9e2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f3af>
 1333f6f:	e8 b7 5e 2a 00       	call   15d9e2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f3af>
 1333f85:	e8 a1 5e 2a 00       	call   15d9e2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f3af>
 1333f9b:	e8 8b 5e 2a 00       	call   15d9e2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f3af>
 1333fbd:	e8 26 3f 83 ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>
 1333fe0:	e8 c7 51 84 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
 1333ffa:	4c 8d ac 24 f0 04 00 	lea    r13,[rsp+0x4f0]
 1334002:	4c 8d 84 24 f0 01 00 	lea    r8,[rsp+0x1f0]
 1334011:	e8 7e 67 4a 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 1334016:	49 8b 06             	mov    rax,QWORD PTR [r14]
 1334027:	ff 90 70 01 00 00    	call   QWORD PTR [rax+0x170]
 1334040:	e8 ad 5b 4a 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 1334049:	e8 38 a4 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 133404e:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 1334056:	e8 8d 67 4a 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 133405e:	e8 c3 ca 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 133406b:	e8 b6 ca 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 1334086:	e8 5d 3e 83 ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>
 13340aa:	e8 fd 50 84 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
 13340c4:	4c 8d ac 24 f0 04 00 	lea    r13,[rsp+0x4f0]
 13340cc:	4c 8d 84 24 f0 01 00 	lea    r8,[rsp+0x1f0]
 13340db:	e8 b4 66 4a 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 13340e0:	49 8b 06             	mov    rax,QWORD PTR [r14]
 13340f1:	ff 50 18             	call   QWORD PTR [rax+0x18]
 1334107:	e8 e6 5a 4a 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 1334110:	e8 71 a3 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1334115:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 133411d:	e8 c6 66 4a 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 1334125:	e8 fc c9 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 1334132:	e8 ef c9 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 1334151:	e8 92 3d 83 ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>
 1334174:	e8 33 50 84 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
 133418e:	4c 8d ac 24 f0 04 00 	lea    r13,[rsp+0x4f0]
 1334196:	4c 8d 84 24 f0 01 00 	lea    r8,[rsp+0x1f0]
 13341a5:	e8 ea 65 4a 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 13341aa:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 13341bf:	ff 50 10             	call   QWORD PTR [rax+0x10]
 13341cd:	e8 20 5a 4a 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 13341d6:	e8 ab a2 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 13341de:	e8 05 66 4a 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 13341e6:	e8 3b c9 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 13341f3:	e8 2e c9 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 1334218:	4c 8d b4 24 f0 04 00 	lea    r14,[rsp+0x4f0]
 1334229:	e8 66 65 4a 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 1334232:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1334235:	4c 8d a4 24 f0 01 00 	lea    r12,[rsp+0x1f0]
 1334243:	ff 50 10             	call   QWORD PTR [rax+0x10]
 1334251:	e8 9c 59 4a 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 133425b:	e8 26 a2 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1334263:	e8 80 65 4a 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 1334277:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 133427f:	e8 da d0 00 00       	call   134135e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1868e2>
 1334284:	48 8d b4 24 f0 04 00 	lea    rsi,[rsp+0x4f0]
 1334294:	e8 3d 44 fa ff       	call   12d86d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11dc5a>
 1334299:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 13342a1:	e8 e4 1a d6 ff       	call   1095d8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25d1a0>
 13342a9:	e8 70 d2 00 00       	call   134151e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x186aa2>
 13342b3:	48 8b 84 24 30 01 00 	mov    rax,QWORD PTR [rsp+0x130]
 13342be:	e8 f9 b5 fe ff       	call   131f8bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x164e40>
 13342f5:	4c 8d b4 24 f0 01 00 	lea    r14,[rsp+0x1f0]
 1334306:	e8 89 64 4a 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 133430b:	4c 8d a4 24 f0 04 00 	lea    r12,[rsp+0x4f0]
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
 13343fc:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
 1334404:	e8 25 0f 39 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
 1334409:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
 1334411:	e8 8e 12 00 00       	call   13356a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ac28>
 133441e:	e8 63 a0 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1334423:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 133443a:	4c 89 f0             	mov    rax,r14
 133444f:	48 8d 9c 24 f0 04 00 	lea    rbx,[rsp+0x4f0]
 1334462:	e8 c3 60 39 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
 133446e:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
 1334484:	e8 2e 5f 2a 00       	call   15da3b7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f93b>
 1334489:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
 133448d:	48 89 84 24 a0 02 00 	mov    QWORD PTR [rsp+0x2a0],rax
 133449a:	66 0f 7f 84 24 90 02 	movdqa XMMWORD PTR [rsp+0x290],xmm0
 13344bc:	e8 cf 99 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 13344c4:	e8 c7 99 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 13344d2:	48 8b 84 24 b0 03 00 	mov    rax,QWORD PTR [rsp+0x3b0]
 13344da:	48 89 84 24 a0 02 00 	mov    QWORD PTR [rsp+0x2a0],rax
 13344eb:	66 0f 7f 84 24 90 02 	movdqa XMMWORD PTR [rsp+0x290],xmm0
 1334501:	48 83 a4 24 b0 03 00 	and    QWORD PTR [rsp+0x3b0],0x0
 1334519:	48 83 a4 24 f0 01 00 	and    QWORD PTR [rsp+0x1f0],0x0
 1334522:	48 8d 8c 24 f0 04 00 	lea    rcx,[rsp+0x4f0]

## Heap allocations in containing FDE before 0x133452a
### allocation call 0x13331f9
     13331cc:	00 00 
     13331ce:	49 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [r15+0xb0]
     13331d5:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     13331da:	45 8a af c8 00 00 00 	mov    r13b,BYTE PTR [r15+0xc8]
     13331e1:	45 8b b7 c9 00 00 00 	mov    r14d,DWORD PTR [r15+0xc9]
     13331e8:	49 8b 87 b8 00 00 00 	mov    rax,QWORD PTR [r15+0xb8]
     13331ef:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     13331f4:	bf 80 06 00 00       	mov    edi,0x680
     13331f9:	e8 02 ad 4b 00       	call   17edf00 <_Znwm@plt>
     13331fe:	48 89 c3             	mov    rbx,rax
     1333201:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     1333208:	00 
     1333209:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]
     1333210:	00 
     1333211:	e8 3c e1 97 ff       	call   cb1352 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe2f2>
     1333216:	0f 28 84 24 c0 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x1c0]
     133321d:	00 
     133321e:	0f 29 84 24 50 01 00 	movaps XMMWORD PTR [rsp+0x150],xmm0
     1333225:	00 
     1333226:	48 8b 84 24 c8 01 00 	mov    rax,QWORD PTR [rsp+0x1c8]
     133322d:	00 
     133322e:	48 85 c0             	test   rax,rax
     1333231:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
     1333236:	74 05                	je     133323d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1787c1>
     1333238:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     133323d:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
     1333244:	00 
     1333245:	48 83 a4 24 b8 01 00 	and    QWORD PTR [rsp+0x1b8],0x0
     133324c:	00 00 
     133324e:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     1333253:	48 89 84 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],rax
     133325a:	00 
     133325b:	49 8b 87 c0 00 00 00 	mov    rax,QWORD PTR [r15+0xc0]
     1333262:	48 89 84 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rax
     1333269:	00 
     133326a:	48 8d 05 47 2d 53 00 	lea    rax,[rip+0x532d47]        # 1865fb8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x226a0>

## Vptr/address-point writes in containing FDE before 0x133452a
     133326a:	48 8d 05 47 2d 53 00 	lea    rax,[rip+0x532d47]        # 1865fb8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x226a0>
     1333271:	48 89 03             	mov    QWORD PTR [rbx],rax
     1333274:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
     1333278:	48 89 bc 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rdi
     133327f:	00 
     1333280:	e8 cb 46 00 00       	call   1337950 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ced4>
     1333285:	48 8d 05 b4 2a 53 00 	lea    rax,[rip+0x532ab4]        # 1865d40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22428>

     1333285:	48 8d 05 b4 2a 53 00 	lea    rax,[rip+0x532ab4]        # 1865d40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22428>
     133328c:	48 89 03             	mov    QWORD PTR [rbx],rax
     133328f:	48 8d 05 8a 2b 53 00 	lea    rax,[rip+0x532b8a]        # 1865e20 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22508>
     1333296:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
     133329a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     133329f:	48 89 83 18 01 00 00 	mov    QWORD PTR [rbx+0x118],rax
     13332a6:	0f 28 44 24 50       	movaps xmm0,XMMWORD PTR [rsp+0x50]

     133328f:	48 8d 05 8a 2b 53 00 	lea    rax,[rip+0x532b8a]        # 1865e20 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22508>
     1333296:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
     133329a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     133329f:	48 89 83 18 01 00 00 	mov    QWORD PTR [rbx+0x118],rax
     13332a6:	0f 28 44 24 50       	movaps xmm0,XMMWORD PTR [rsp+0x50]
     13332ab:	0f 29 83 20 01 00 00 	movaps XMMWORD PTR [rbx+0x120],xmm0
     13332b2:	48 8b 84 24 a8 01 00 	mov    rax,QWORD PTR [rsp+0x1a8]

     13339c3:	48 8d 05 16 25 53 00 	lea    rax,[rip+0x532516]        # 1865ee0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x225c8>
     13339ca:	48 8d 94 24 c0 04 00 	lea    rdx,[rsp+0x4c0]
     13339d1:	00 
     13339d2:	48 89 02             	mov    QWORD PTR [rdx],rax
     13339d5:	48 89 5a 08          	mov    QWORD PTR [rdx+0x8],rbx
     13339d9:	48 89 52 20          	mov    QWORD PTR [rdx+0x20],rdx
     13339dd:	4c 89 fe             	mov    rsi,r15

     1333a1a:	48 8d 0d 07 25 53 00 	lea    rcx,[rip+0x532507]        # 1865f28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22610>
     1333a21:	48 89 8c 24 f0 04 00 	mov    QWORD PTR [rsp+0x4f0],rcx
     1333a28:	00 
     1333a29:	48 89 9c 24 f8 04 00 	mov    QWORD PTR [rsp+0x4f8],rbx
     1333a30:	00 
     1333a31:	4c 89 a4 24 10 05 00 	mov    QWORD PTR [rsp+0x510],r12
     1333a38:	00 

## Stores to object +0x10 in containing FDE
 1332fca:	48 8b 50 10          	mov    rdx,QWORD PTR [rax+0x10]
 1332fce:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
 133301e:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
 1333036:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
 1333159:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
 1333181:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 133329a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 13334fe:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
 1333887:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
 1333950:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
 1333cc3:	49 89 40 10          	mov    QWORD PTR [r8+0x10],rax
 1333fb8:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
 1334081:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
 133414c:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
 1334489:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
 13344a7:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
 1334570:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
 133457d:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
 1334947:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

## 0x1334dea output construction
 1334dea:	55                   	push   rbp
 1334deb:	41 57                	push   r15
 1334ded:	41 56                	push   r14
 1334def:	41 55                	push   r13
 1334df1:	41 54                	push   r12
 1334df3:	53                   	push   rbx
 1334df4:	48 81 ec 18 02 00 00 	sub    rsp,0x218
 1334dfb:	49 89 cc             	mov    r12,rcx
 1334dfe:	49 89 d7             	mov    r15,rdx
 1334e01:	49 89 f5             	mov    r13,rsi
 1334e04:	49 89 fe             	mov    r14,rdi
 1334e07:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1334e0e:	00 00 
 1334e10:	48 89 84 24 10 02 00 	mov    QWORD PTR [rsp+0x210],rax
 1334e17:	00 
 1334e18:	48 81 c6 80 00 00 00 	add    rsi,0x80
 1334e1f:	48 89 e5             	mov    rbp,rsp
 1334e22:	48 89 ef             	mov    rdi,rbp
 1334e25:	e8 be 30 83 ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>
 1334e2a:	49 8b 1c 24          	mov    rbx,QWORD PTR [r12]
 1334e2e:	49 83 24 24 00       	and    QWORD PTR [r12],0x0
 1334e33:	4c 8d 64 24 18       	lea    r12,[rsp+0x18]
 1334e38:	4d 89 6c 24 f8       	mov    QWORD PTR [r12-0x8],r13
 1334e3d:	4c 89 e7             	mov    rdi,r12
 1334e40:	48 89 ee             	mov    rsi,rbp
 1334e43:	e8 64 43 84 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
 1334e48:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 1334e4d:	4c 89 fe             	mov    rsi,r15
 1334e50:	e8 37 09 00 00       	call   133578c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ad10>
 1334e55:	49 89 1e             	mov    QWORD PTR [r14],rbx
 1334e58:	bf c8 00 00 00       	mov    edi,0xc8
 1334e5d:	e8 9e 90 4b 00       	call   17edf00 <_Znwm@plt>
 1334e62:	49 89 c7             	mov    r15,rax
 1334e65:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
 1334e6c:	00 
 1334e6d:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
 1334e72:	e8 9b 09 00 00       	call   1335812 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ad96>
 1334e77:	0f 57 c0             	xorps  xmm0,xmm0
 1334e7a:	41 0f 11 47 08       	movups XMMWORD PTR [r15+0x8],xmm0
 1334e7f:	48 8d 05 4a 0e 53 00 	lea    rax,[rip+0x530e4a]        # 1865cd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x223b8>
 1334e86:	49 89 07             	mov    QWORD PTR [r15],rax
 1334e89:	4c 8d a4 24 68 01 00 	lea    r12,[rsp+0x168]
 1334e90:	00 
 1334e91:	49 89 5c 24 f8       	mov    QWORD PTR [r12-0x8],rbx
 1334e96:	48 8d b4 24 b8 00 00 	lea    rsi,[rsp+0xb8]
 1334e9d:	00 
 1334e9e:	4c 89 e7             	mov    rdi,r12
 1334ea1:	e8 6c 09 00 00       	call   1335812 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ad96>
 1334ea6:	48 8b 84 24 60 01 00 	mov    rax,QWORD PTR [rsp+0x160]
 1334ead:	00 
 1334eae:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
 1334eb2:	4c 89 ff             	mov    rdi,r15
 1334eb5:	48 83 c7 20          	add    rdi,0x20
 1334eb9:	4c 89 e6             	mov    rsi,r12
 1334ebc:	e8 51 09 00 00       	call   1335812 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ad96>
 1334ec1:	4c 89 e7             	mov    rdi,r12
 1334ec4:	e8 97 09 00 00       	call   1335860 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ade4>
 1334ec9:	4d 89 7e 08          	mov    QWORD PTR [r14+0x8],r15
 1334ecd:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
 1334ed4:	00 
 1334ed5:	e8 86 09 00 00       	call   1335860 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ade4>
 1334eda:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 1334edf:	e8 7c 09 00 00       	call   1335860 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ade4>
 1334ee4:	48 89 e7             	mov    rdi,rsp
 1334ee7:	e8 3a bc 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 1334eec:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1334ef3:	00 00 
 1334ef5:	48 3b 84 24 10 02 00 	cmp    rax,QWORD PTR [rsp+0x210]
 1334efc:	00 
 1334efd:	0f 85 bd 00 00 00    	jne    1334fc0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a544>
 1334f03:	48 81 c4 18 02 00 00 	add    rsp,0x218
 1334f0a:	5b                   	pop    rbx
 1334f0b:	41 5c                	pop    r12
 1334f0d:	41 5d                	pop    r13
 1334f0f:	41 5e                	pop    r14
 1334f11:	41 5f                	pop    r15
 1334f13:	5d                   	pop    rbp
 1334f14:	c3                   	ret
 1334f15:	49 89 c6             	mov    r14,rax
 1334f18:	4c 89 e7             	mov    rdi,r12
 1334f1b:	e8 40 09 00 00       	call   1335860 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ade4>
 1334f20:	eb 03                	jmp    1334f25 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a4a9>
 1334f22:	49 89 c6             	mov    r14,rax
 1334f25:	4c 89 ff             	mov    rdi,r15
 1334f28:	e8 e3 90 4b 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
 1334f2d:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
 1334f34:	00 
 1334f35:	e8 26 09 00 00       	call   1335860 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ade4>
 1334f3a:	eb 03                	jmp    1334f3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a4c3>
 1334f3c:	49 89 c6             	mov    r14,rax
 1334f3f:	4c 89 ff             	mov    rdi,r15
 1334f42:	e8 d9 8f 4b 00       	call   17edf20 <_ZdlPv@plt>
 1334f47:	eb 03                	jmp    1334f4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a4d0>
 1334f49:	49 89 c6             	mov    r14,rax
 1334f4c:	4c 89 f7             	mov    rdi,r14
 1334f4f:	e8 1c 8f 4b 00       	call   17ede70 <__cxa_begin_catch@plt>
 1334f54:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 1334f59:	48 89 de             	mov    rsi,rbx
 1334f5c:	e8 19 09 00 00       	call   133587a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17adfe>
 1334f61:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1334f68:	00 00 
 1334f6a:	48 3b 84 24 10 02 00 	cmp    rax,QWORD PTR [rsp+0x210]
 1334f71:	00 
 1334f72:	75 4c                	jne    1334fc0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a544>
 1334f74:	e8 27 98 4b 00       	call   17ee7a0 <__cxa_rethrow@plt>
 1334f79:	48 89 c3             	mov    rbx,rax
 1334f7c:	4c 89 e7             	mov    rdi,r12
 1334f7f:	e8 a2 bb 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 1334f84:	eb 17                	jmp    1334f9d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a521>
 1334f86:	48 89 c3             	mov    rbx,rax
 1334f89:	eb 12                	jmp    1334f9d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a521>
 1334f8b:	48 89 c3             	mov    rbx,rax
 1334f8e:	e8 fd 95 4b 00       	call   17ee590 <__cxa_end_catch@plt>
 1334f93:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 1334f98:	e8 c3 08 00 00       	call   1335860 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ade4>
 1334f9d:	48 89 e7             	mov    rdi,rsp
 1334fa0:	e8 81 bb 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 1334fa5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1334fac:	00 00 
 1334fae:	48 3b 84 24 10 02 00 	cmp    rax,QWORD PTR [rsp+0x210]
 1334fb5:	00 
 1334fb6:	75 08                	jne    1334fc0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a544>
 1334fb8:	48 89 df             	mov    rdi,rbx
 1334fbb:	e8 10 ad 73 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 1334fc0:	e8 eb aa 4b 00       	call   17efab0 <__stack_chk_fail@plt>
 1334fc5:	48 89 c7             	mov    rdi,rax
 1334fc8:	e8 d8 4a 74 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 1334fcd:	cc                   	int3
