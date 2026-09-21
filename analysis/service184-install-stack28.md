# Service184 install [rsp+0x28] producer trace

Install site: 0x1333835; FDE=(20131328, 20138970)

## All references to rsp+0x28 inside containing FDE
### 0x13330b5: mov    QWORD PTR [rsp+0x28],rax
     1333086:	e8 a3 22 39 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     133308b:	4c 8b 6c 24 50       	mov    r13,QWORD PTR [rsp+0x50]
     1333090:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     1333097:	00 
     1333098:	4c 89 ee             	mov    rsi,r13
     133309b:	e8 b2 e2 97 ff       	call   cb1352 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe2f2>
     13330a0:	31 c0                	xor    eax,eax
     13330a2:	48 8d 8c 24 90 02 00 	lea    rcx,[rsp+0x290]
     13330a9:	00 
     13330aa:	83 79 18 01          	cmp    DWORD PTR [rcx+0x18],0x1
     13330ae:	48 0f 45 c8          	cmovne rcx,rax
     13330b2:	48 8b 01             	mov    rax,QWORD PTR [rcx]
     13330b5:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     13330ba:	4c 8b 71 08          	mov    r14,QWORD PTR [rcx+0x8]
     13330be:	66 0f 6f 01          	movdqa xmm0,XMMWORD PTR [rcx]
     13330c2:	66 0f 7f 84 24 d0 00 	movdqa XMMWORD PTR [rsp+0xd0],xmm0
     13330c9:	00 00 
     13330cb:	66 0f ef c0          	pxor   xmm0,xmm0
     13330cf:	66 0f 7f 01          	movdqa XMMWORD PTR [rcx],xmm0
     13330d3:	49 8b 77 48          	mov    rsi,QWORD PTR [r15+0x48]
     13330d7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     13330da:	48 8d bc 24 d8 01 00 	lea    rdi,[rsp+0x1d8]
     13330e1:	00 
     13330e2:	31 d2                	xor    edx,edx
     13330e4:	ff 50 18             	call   QWORD PTR [rax+0x18]
     13330e7:	49 8b 77 28          	mov    rsi,QWORD PTR [r15+0x28]
     13330eb:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
     13330f2:	00 
     13330f3:	e8 4c 55 fe ff       	call   1318644 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15dbc8>
     13330f8:	49 8b 77 28          	mov    rsi,QWORD PTR [r15+0x28]
     13330fc:	4c 8b a4 24 18 04 00 	mov    r12,QWORD PTR [rsp+0x418]
     1333103:	00 
     1333104:	66 0f 6f 84 24 10 04 	movdqa xmm0,XMMWORD PTR [rsp+0x410]
     133310b:	00 00 
     133310d:	41 0f b6 97 cd 00 00 	movzx  edx,BYTE PTR [r15+0xcd]
     1333114:	00 
     1333115:	48 8d 9c 24 c0 01 00 	lea    rbx,[rsp+0x1c0]

### 0x133354e: mov    rsi,QWORD PTR [rsp+0x28]
     133351a:	48 8b 84 24 f0 01 00 	mov    rax,QWORD PTR [rsp+0x1f0]
     1333521:	00 
     1333522:	48 85 c0             	test   rax,rax
     1333525:	4c 8b 6c 24 50       	mov    r13,QWORD PTR [rsp+0x50]
     133352a:	0f 84 1f 0f 00 00    	je     133444f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1799d3>
     1333530:	0f b6 8c 24 a0 03 00 	movzx  ecx,BYTE PTR [rsp+0x3a0]
     1333537:	00 
     1333538:	f6 c1 01             	test   cl,0x1
     133353b:	0f 84 8a 0f 00 00    	je     13344cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179a4f>
     1333541:	48 8b 8c 24 a8 03 00 	mov    rcx,QWORD PTR [rsp+0x3a8]
     1333548:	00 
     1333549:	e9 7f 0f 00 00       	jmp    13344cd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179a51>
     133354e:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
     1333553:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1333556:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
     133355d:	00 
     133355e:	ff 50 38             	call   QWORD PTR [rax+0x38]
     1333561:	4d 89 ec             	mov    r12,r13
     1333564:	4c 8b ac 24 10 04 00 	mov    r13,QWORD PTR [rsp+0x410]
     133356b:	00 
     133356c:	4c 8b b4 24 18 04 00 	mov    r14,QWORD PTR [rsp+0x418]
     1333573:	00 
     1333574:	6a 04                	push   0x4
     1333576:	5a                   	pop    rdx
     1333577:	4c 89 ef             	mov    rdi,r13
     133357a:	4c 89 f6             	mov    rsi,r14
     133357d:	e8 56 38 eb ff       	call   11e6dd8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c35c>
     1333582:	41 b7 01             	mov    r15b,0x1
     1333585:	84 c0                	test   al,al
     1333587:	74 15                	je     133359e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178b22>
     1333589:	6a 3f                	push   0x3f
     133358b:	5a                   	pop    rdx
     133358c:	4c 89 ef             	mov    rdi,r13
     133358f:	4c 89 f6             	mov    rsi,r14
     1333592:	e8 41 38 eb ff       	call   11e6dd8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c35c>
     1333597:	41 89 c7             	mov    r15d,eax
     133359a:	41 80 f7 01          	xor    r15b,0x1

### 0x1333830: mov    rax,QWORD PTR [rsp+0x28]
     13337f6:	48 8d 83 40 05 00 00 	lea    rax,[rbx+0x540]
     13337fd:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     1333802:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     1333806:	48 89 ef             	mov    rdi,rbp
     1333809:	4c 89 bc 24 00 01 00 	mov    QWORD PTR [rsp+0x100],r15
     1333810:	00 
     1333811:	ff 50 50             	call   QWORD PTR [rax+0x50]
     1333814:	48 89 83 b0 05 00 00 	mov    QWORD PTR [rbx+0x5b0],rax
     133381b:	48 83 a4 24 e8 01 00 	and    QWORD PTR [rsp+0x1e8],0x0
     1333822:	00 00 
     1333824:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
     1333829:	48 89 83 b8 05 00 00 	mov    QWORD PTR [rbx+0x5b8],rax
     1333830:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     1333835:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax
     133383c:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
     1333841:	48 89 83 c8 05 00 00 	mov    QWORD PTR [rbx+0x5c8],rax
     1333848:	48 8d bb d0 05 00 00 	lea    rdi,[rbx+0x5d0]
     133384f:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
     1333854:	e8 9d 61 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1333859:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]
     1333860:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1333863:	ff 50 20             	call   QWORD PTR [rax+0x20]
     1333866:	4c 89 74 24 70       	mov    QWORD PTR [rsp+0x70],r14
     133386b:	34 01                	xor    al,0x1
     133386d:	88 83 e0 05 00 00    	mov    BYTE PTR [rbx+0x5e0],al
     1333873:	48 83 a3 e8 05 00 00 	and    QWORD PTR [rbx+0x5e8],0x0
     133387a:	00 
     133387b:	48 8d bb f0 05 00 00 	lea    rdi,[rbx+0x5f0]
     1333882:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
     1333887:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     133388c:	e8 31 de 48 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     1333891:	48 8d 35 48 92 0a ff 	lea    rsi,[rip+0xffffffffff0a9248]        # 3dcae0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x252f>
     1333898:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
     133389f:	00 
     13338a0:	e8 d9 61 74 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     13338a5:	4c 8d a4 24 f0 04 00 	lea    r12,[rsp+0x4f0]
     13338ac:	00 

### 0x133384f: mov    QWORD PTR [rsp+0x28],rdi
     1333810:	00 
     1333811:	ff 50 50             	call   QWORD PTR [rax+0x50]
     1333814:	48 89 83 b0 05 00 00 	mov    QWORD PTR [rbx+0x5b0],rax
     133381b:	48 83 a4 24 e8 01 00 	and    QWORD PTR [rsp+0x1e8],0x0
     1333822:	00 00 
     1333824:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
     1333829:	48 89 83 b8 05 00 00 	mov    QWORD PTR [rbx+0x5b8],rax
     1333830:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     1333835:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax
     133383c:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
     1333841:	48 89 83 c8 05 00 00 	mov    QWORD PTR [rbx+0x5c8],rax
     1333848:	48 8d bb d0 05 00 00 	lea    rdi,[rbx+0x5d0]
     133384f:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
     1333854:	e8 9d 61 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1333859:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]
     1333860:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1333863:	ff 50 20             	call   QWORD PTR [rax+0x20]
     1333866:	4c 89 74 24 70       	mov    QWORD PTR [rsp+0x70],r14
     133386b:	34 01                	xor    al,0x1
     133386d:	88 83 e0 05 00 00    	mov    BYTE PTR [rbx+0x5e0],al
     1333873:	48 83 a3 e8 05 00 00 	and    QWORD PTR [rbx+0x5e8],0x0
     133387a:	00 
     133387b:	48 8d bb f0 05 00 00 	lea    rdi,[rbx+0x5f0]
     1333882:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
     1333887:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     133388c:	e8 31 de 48 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     1333891:	48 8d 35 48 92 0a ff 	lea    rsi,[rip+0xffffffffff0a9248]        # 3dcae0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x252f>
     1333898:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
     133389f:	00 
     13338a0:	e8 d9 61 74 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     13338a5:	4c 8d a4 24 f0 04 00 	lea    r12,[rsp+0x4f0]
     13338ac:	00 
     13338ad:	41 c6 04 24 00       	mov    BYTE PTR [r12],0x0
     13338b2:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     13338b7:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     13338ba:	4c 8d b4 24 10 04 00 	lea    r14,[rsp+0x410]
     13338c1:	00 

### 0x1333b34: mov    rdi,QWORD PTR [rsp+0x28]
     1333b0a:	4c 89 e7             	mov    rdi,r12
     1333b0d:	31 d2                	xor    edx,edx
     1333b0f:	e8 80 6c 4a 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     1333b14:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1333b17:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
     1333b1e:	00 
     1333b1f:	4c 89 fe             	mov    rsi,r15
     1333b22:	4c 89 e2             	mov    rdx,r12
     1333b25:	4c 89 2c 24          	mov    QWORD PTR [rsp],r13
     1333b29:	ff 50 30             	call   QWORD PTR [rax+0x30]
     1333b2c:	4c 8d bc 24 f0 01 00 	lea    r15,[rsp+0x1f0]
     1333b33:	00 
     1333b34:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     1333b39:	4c 89 fe             	mov    rsi,r15
     1333b3c:	e8 b1 60 4a 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     1333b41:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1333b45:	e8 3c a9 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1333b4a:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
     1333b51:	00 
     1333b52:	e8 91 6c 4a 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     1333b57:	48 83 a4 24 80 02 00 	and    QWORD PTR [rsp+0x280],0x0
     1333b5e:	00 00 
     1333b60:	66 0f ef c0          	pxor   xmm0,xmm0
     1333b64:	66 0f 7f 84 24 70 02 	movdqa XMMWORD PTR [rsp+0x270],xmm0
     1333b6b:	00 00 
     1333b6d:	80 bb 60 03 00 00 00 	cmp    BYTE PTR [rbx+0x360],0x0
     1333b74:	0f 84 9e 00 00 00    	je     1333c18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17919c>
     1333b7a:	80 bb 64 03 00 00 00 	cmp    BYTE PTR [rbx+0x364],0x0
     1333b81:	0f 84 91 00 00 00    	je     1333c18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17919c>
     1333b87:	4d 89 f5             	mov    r13,r14
     1333b8a:	4c 8b bb 68 03 00 00 	mov    r15,QWORD PTR [rbx+0x368]
     1333b91:	4c 8b b3 70 03 00 00 	mov    r14,QWORD PTR [rbx+0x370]
     1333b98:	4d 29 fe             	sub    r14,r15
     1333b9b:	4c 8d 25 b6 8f 0a ff 	lea    r12,[rip+0xffffffffff0a8fb6]        # 3dcb58 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x25a7>
     1333ba2:	4d 85 f6             	test   r14,r14
     1333ba5:	74 31                	je     1333bd8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17915c>
     1333ba7:	4c 89 ff             	mov    rdi,r15

### 0x1334978: mov    rdi,QWORD PTR [rsp+0x28]
     1334936:	e8 4b 41 00 00       	call   1338a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e00a>
     133493b:	48 8b bb 78 06 00 00 	mov    rdi,QWORD PTR [rbx+0x678]
     1334942:	e8 3f 9b 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1334947:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     133494c:	e8 2b a8 83 ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
     1334951:	48 8b bb 50 06 00 00 	mov    rdi,QWORD PTR [rbx+0x650]
     1334958:	e8 55 9b 76 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     133495d:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     1334962:	e8 6d 52 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     1334967:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     133496c:	e8 d5 cd 48 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
     1334971:	4c 8d bb b8 05 00 00 	lea    r15,[rbx+0x5b8]
     1334978:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     133497d:	e8 52 52 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     1334982:	48 8b bb c8 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c8]
     1334989:	e8 f8 9a 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     133498e:	4c 89 ff             	mov    rdi,r15
     1334991:	e8 74 59 fe ff       	call   131a30a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f88e>
     1334996:	66 0f ef c0          	pxor   xmm0,xmm0
     133499a:	66 0f 7f 84 24 d0 00 	movdqa XMMWORD PTR [rsp+0xd0],xmm0
     13349a1:	00 00 
     13349a3:	48 8b bb a8 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5a8]
     13349aa:	e8 d7 9a 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13349af:	48 89 df             	mov    rdi,rbx
     13349b2:	48 81 c7 78 05 00 00 	add    rdi,0x578
     13349b9:	e8 a8 dc 7a ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
     13349be:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     13349c3:	e8 ea 40 00 00       	call   1338ab2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e036>
     13349c8:	48 8b bc 24 f0 00 00 	mov    rdi,QWORD PTR [rsp+0xf0]
     13349cf:	00 
     13349d0:	e8 dd 40 00 00       	call   1338ab2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e036>
     13349d5:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     13349da:	e8 a5 77 ff ff       	call   132c184 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x171708>
     13349df:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
     13349e4:	e8 9b 77 ff ff       	call   132c184 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x171708>
     13349e9:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     13349f0:	00 

## All stack-slot writes rsp+0x20..0x78 before install
 1332e9f:	48 89 6c 24 50       	mov    QWORD PTR [rsp+0x50],rbp
 1332ea4:	4c 89 6c 24 48       	mov    QWORD PTR [rsp+0x48],r13
 1332ea9:	4c 89 64 24 78       	mov    QWORD PTR [rsp+0x78],r12
 133308b:	4c 8b 6c 24 50       	mov    r13,QWORD PTR [rsp+0x50]
 13330b5:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
 1333125:	4c 89 74 24 70       	mov    QWORD PTR [rsp+0x70],r14
 133318e:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
 13331a5:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
 13331ba:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 13331d5:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 13331ef:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
 133324e:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
 13332a6:	0f 28 44 24 50       	movaps xmm0,XMMWORD PTR [rsp+0x50]
 13332e4:	48 8b 74 24 48       	mov    rsi,QWORD PTR [rsp+0x48]
 133338e:	48 8b 74 24 38       	mov    rsi,QWORD PTR [rsp+0x38]
 1333525:	4c 8b 6c 24 50       	mov    r13,QWORD PTR [rsp+0x50]
 133354e:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
 13335d0:	48 8b 74 24 40       	mov    rsi,QWORD PTR [rsp+0x40]
 133362d:	66 0f 6f 44 24 50    	movdqa xmm0,XMMWORD PTR [rsp+0x50]
 1333677:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 1333683:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
 13337ca:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 13337d6:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
 13337e2:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
 13337fd:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 1333824:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
 1333830:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]

## Calls in last 0x1200 bytes before install
 1332e4f:	ff 50 40             	call   QWORD PTR [rax+0x40]
 1332e70:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
 1332e8a:	e8 d7 6f 39 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
 1332e9a:	e8 41 91 9d ff       	call   d0bfe0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x258f80>
 1332ebd:	e8 7e b0 4b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 1332edc:	e8 53 75 39 00       	call   16ca434 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e5a0>
 1332f4c:	e8 d5 1d 00 00       	call   1334d26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a2aa>
 1332f65:	e8 d6 b1 4b 00       	call   17ee140 <_ZNSt6__ndk119__shared_weak_count4lockEv@plt>
 1332f9e:	e8 e3 b4 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1332fb2:	e8 6f 1d 00 00       	call   1334d26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a2aa>
 1332ff3:	e8 f2 1d 00 00       	call   1334dea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a36e>
 1333008:	ff 50 08             	call   QWORD PTR [rax+0x8]
 1333011:	e8 b8 1f 00 00       	call   1334fce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a552>
 1333026:	e8 df 68 7f ff       	call   b2990a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x768aa>
 1333031:	e8 3e 24 00 00       	call   1335474 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a9f8>
 1333052:	e8 2f b4 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 133305f:	e8 88 1c 00 00       	call   1334cec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a270>
 133306c:	e8 1f ae 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1333079:	e8 4c 32 8f ff       	call   c262ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17326a>
 1333086:	e8 a3 22 39 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
 133309b:	e8 b2 e2 97 ff       	call   cb1352 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe2f2>
 13330e4:	ff 50 18             	call   QWORD PTR [rax+0x18]
 13330f3:	e8 4c 55 fe ff       	call   1318644 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15dbc8>
 1333120:	e8 82 24 00 00       	call   13355a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ab2b>
 133312d:	e8 54 b3 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1333141:	ff 50 50             	call   QWORD PTR [rax+0x50]
 1333174:	e8 96 24 00 00       	call   133560f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ab93>
 13331f9:	e8 02 ad 4b 00       	call   17edf00 <_Znwm@plt>
 1333211:	e8 3c e1 97 ff       	call   cb1352 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe2f2>
 1333280:	e8 cb 46 00 00       	call   1337950 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ced4>
 13332e9:	e8 28 c7 f4 ff       	call   127fa16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4f9a>
 1333313:	e8 bc c9 f4 ff       	call   127fcd4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5258>
 1333369:	e8 22 6f 74 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 1333393:	e8 4e b7 01 00       	call   134eae6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19406a>
 13333d5:	e8 80 b6 9d ff       	call   d0ea5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25b9fa>
 13333f2:	e8 87 66 74 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 1333410:	e8 d9 92 9d ff       	call   d0c6ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25968e>
 1333420:	e8 01 93 9d ff       	call   d0c726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2596c6>
 133342d:	e8 9a b3 76 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
 133343a:	e8 51 aa 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 133344e:	e8 2b 66 74 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 133346c:	e8 7d 92 9d ff       	call   d0c6ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25968e>
 133347c:	e8 a5 92 9d ff       	call   d0c726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2596c6>
 1333489:	e8 3e b3 76 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
 1333496:	e8 f5 a9 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 13334d6:	e8 c9 44 00 00       	call   13379a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17cf28>
 1333516:	41 ff 56 18          	call   QWORD PTR [r14+0x18]
 133355e:	ff 50 38             	call   QWORD PTR [rax+0x38]
 133357d:	e8 56 38 eb ff       	call   11e6dd8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c35c>
 1333592:	e8 41 38 eb ff       	call   11e6dd8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c35c>
 13335a6:	e8 7d b8 d4 ff       	call   107ee28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24623e>
 13335d8:	e8 bb c7 00 00       	call   133fd98 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18531c>
 13335e5:	e8 3e b8 d4 ff       	call   107ee28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24623e>
 1333619:	e8 66 88 f9 ff       	call   12cbe84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x111408>
 1333640:	e8 c9 42 fa ff       	call   12d790e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11ce92>
 1333672:	e8 db dc 97 ff       	call   cb1352 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe2f2>
 13336bb:	e8 36 63 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 13336cf:	e8 22 63 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 13336e3:	e8 0e 63 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 13336f7:	e8 fa 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 133370b:	e8 e6 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 133371f:	e8 d2 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 1333733:	e8 be 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 1333747:	e8 aa 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 1333811:	ff 50 50             	call   QWORD PTR [rax+0x50]

## Full final 0x900 bytes before install
 1332f37:	00 00 
 1332f39:	48 83 a4 24 70 01 00 	and    QWORD PTR [rsp+0x170],0x0
 1332f40:	00 00 
 1332f42:	4d 8d 66 30          	lea    r12,[r14+0x30]
 1332f46:	4c 89 e7             	mov    rdi,r12
 1332f49:	48 89 de             	mov    rsi,rbx
 1332f4c:	e8 d5 1d 00 00       	call   1334d26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a2aa>
 1332f51:	48 85 c0             	test   rax,rax
 1332f54:	74 4d                	je     1332fa3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178527>
 1332f56:	48 89 c3             	mov    rbx,rax
 1332f59:	48 8b b8 a8 00 00 00 	mov    rdi,QWORD PTR [rax+0xa8]
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
 133304c:	01 00 00 00 
 1333050:	31 ff                	xor    edi,edi
 1333052:	e8 2f b4 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1333057:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
 133305e:	00 
 133305f:	e8 88 1c 00 00       	call   1334cec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a270>
 1333064:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
 133306b:	00 
 133306c:	e8 1f ae 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1333071:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
 1333078:	00 
 1333079:	e8 4c 32 8f ff       	call   c262ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17326a>
 133307e:	48 8d bc 24 48 03 00 	lea    rdi,[rsp+0x348]
 1333085:	00 
 1333086:	e8 a3 22 39 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
 133308b:	4c 8b 6c 24 50       	mov    r13,QWORD PTR [rsp+0x50]
 1333090:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
 1333097:	00 
 1333098:	4c 89 ee             	mov    rsi,r13
 133309b:	e8 b2 e2 97 ff       	call   cb1352 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe2f2>
 13330a0:	31 c0                	xor    eax,eax
 13330a2:	48 8d 8c 24 90 02 00 	lea    rcx,[rsp+0x290]
 13330a9:	00 
 13330aa:	83 79 18 01          	cmp    DWORD PTR [rcx+0x18],0x1
 13330ae:	48 0f 45 c8          	cmovne rcx,rax
 13330b2:	48 8b 01             	mov    rax,QWORD PTR [rcx]
 13330b5:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
 13330ba:	4c 8b 71 08          	mov    r14,QWORD PTR [rcx+0x8]
 13330be:	66 0f 6f 01          	movdqa xmm0,XMMWORD PTR [rcx]
 13330c2:	66 0f 7f 84 24 d0 00 	movdqa XMMWORD PTR [rsp+0xd0],xmm0
 13330c9:	00 00 
 13330cb:	66 0f ef c0          	pxor   xmm0,xmm0
 13330cf:	66 0f 7f 01          	movdqa XMMWORD PTR [rcx],xmm0
 13330d3:	49 8b 77 48          	mov    rsi,QWORD PTR [r15+0x48]
 13330d7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 13330da:	48 8d bc 24 d8 01 00 	lea    rdi,[rsp+0x1d8]
 13330e1:	00 
 13330e2:	31 d2                	xor    edx,edx
 13330e4:	ff 50 18             	call   QWORD PTR [rax+0x18]
 13330e7:	49 8b 77 28          	mov    rsi,QWORD PTR [r15+0x28]
 13330eb:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
 13330f2:	00 
 13330f3:	e8 4c 55 fe ff       	call   1318644 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15dbc8>
 13330f8:	49 8b 77 28          	mov    rsi,QWORD PTR [r15+0x28]
 13330fc:	4c 8b a4 24 18 04 00 	mov    r12,QWORD PTR [rsp+0x418]
 1333103:	00 
 1333104:	66 0f 6f 84 24 10 04 	movdqa xmm0,XMMWORD PTR [rsp+0x410]
 133310b:	00 00 
 133310d:	41 0f b6 97 cd 00 00 	movzx  edx,BYTE PTR [r15+0xcd]
 1333114:	00 
 1333115:	48 8d 9c 24 c0 01 00 	lea    rbx,[rsp+0x1c0]
 133311c:	00 
 133311d:	48 89 df             	mov    rdi,rbx
 1333120:	e8 82 24 00 00       	call   13355a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ab2b>
 1333125:	4c 89 74 24 70       	mov    QWORD PTR [rsp+0x70],r14
 133312a:	4c 89 e7             	mov    rdi,r12
 133312d:	e8 54 b3 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1333132:	49 8b 7f 28          	mov    rdi,QWORD PTR [r15+0x28]
 1333136:	4d 8b 77 38          	mov    r14,QWORD PTR [r15+0x38]
 133313a:	4d 8b 67 40          	mov    r12,QWORD PTR [r15+0x40]
 133313e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1333141:	ff 50 50             	call   QWORD PTR [rax+0x50]
 1333144:	4d 8b 4f 50          	mov    r9,QWORD PTR [r15+0x50]
 1333148:	4d 8b 47 68          	mov    r8,QWORD PTR [r15+0x68]
 133314c:	66 0f 6f 84 24 a0 01 	movdqa xmm0,XMMWORD PTR [rsp+0x1a0]
 1333153:	00 00 
 1333155:	48 83 ec 20          	sub    rsp,0x20
 1333159:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
 133315e:	f3 0f 7f 04 24       	movdqu XMMWORD PTR [rsp],xmm0
 1333163:	48 8d bc 24 d8 01 00 	lea    rdi,[rsp+0x1d8]
 133316a:	00 
 133316b:	4c 89 f6             	mov    rsi,r14
 133316e:	4c 89 e2             	mov    rdx,r12
 1333171:	48 89 c1             	mov    rcx,rax
 1333174:	e8 96 24 00 00       	call   133560f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ab93>
 1333179:	48 83 c4 20          	add    rsp,0x20
 133317d:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
 1333181:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 1333186:	49 8b 6f 28          	mov    rbp,QWORD PTR [r15+0x28]
 133318a:	49 8b 47 30          	mov    rax,QWORD PTR [r15+0x30]
 133318e:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
 1333193:	41 0f 10 47 38       	movups xmm0,XMMWORD PTR [r15+0x38]
 1333198:	0f 29 84 24 f0 00 00 	movaps XMMWORD PTR [rsp+0xf0],xmm0
 133319f:	00 
 13331a0:	41 0f 28 47 50       	movaps xmm0,XMMWORD PTR [r15+0x50]
 13331a5:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
 13331aa:	49 8b 47 70          	mov    rax,QWORD PTR [r15+0x70]
 13331ae:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax
 13331b5:	00 
 13331b6:	49 8b 47 78          	mov    rax,QWORD PTR [r15+0x78]
 13331ba:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 13331bf:	66 41 0f 6f 47 60    	movdqa xmm0,XMMWORD PTR [r15+0x60]
 13331c5:	66 0f 7f 84 24 e0 00 	movdqa XMMWORD PTR [rsp+0xe0],xmm0
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
 1333271:	48 89 03             	mov    QWORD PTR [rbx],rax
 1333274:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
 1333278:	48 89 bc 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rdi
 133327f:	00 
 1333280:	e8 cb 46 00 00       	call   1337950 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ced4>
 1333285:	48 8d 05 b4 2a 53 00 	lea    rax,[rip+0x532ab4]        # 1865d40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22428>
 133328c:	48 89 03             	mov    QWORD PTR [rbx],rax
 133328f:	48 8d 05 8a 2b 53 00 	lea    rax,[rip+0x532b8a]        # 1865e20 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22508>
 1333296:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
 133329a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 133329f:	48 89 83 18 01 00 00 	mov    QWORD PTR [rbx+0x118],rax
 13332a6:	0f 28 44 24 50       	movaps xmm0,XMMWORD PTR [rsp+0x50]
 13332ab:	0f 29 83 20 01 00 00 	movaps XMMWORD PTR [rbx+0x120],xmm0
 13332b2:	48 8b 84 24 a8 01 00 	mov    rax,QWORD PTR [rsp+0x1a8]
 13332b9:	00 
 13332ba:	66 0f 6f 84 24 a0 01 	movdqa xmm0,XMMWORD PTR [rsp+0x1a0]
 13332c1:	00 00 
 13332c3:	66 0f 7f 83 30 01 00 	movdqa XMMWORD PTR [rbx+0x130],xmm0
 13332ca:	00 
 13332cb:	48 85 c0             	test   rax,rax
 13332ce:	74 05                	je     13332d5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178859>
 13332d0:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
 13332d5:	48 8d bb 40 01 00 00 	lea    rdi,[rbx+0x140]
 13332dc:	48 89 bc 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rdi
 13332e3:	00 
 13332e4:	48 8b 74 24 48       	mov    rsi,QWORD PTR [rsp+0x48]
 13332e9:	e8 28 c7 f4 ff       	call   127fa16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4f9a>
 13332ee:	41 8b 84 24 a8 00 00 	mov    eax,DWORD PTR [r12+0xa8]
 13332f5:	00 
 13332f6:	89 83 50 02 00 00    	mov    DWORD PTR [rbx+0x250],eax
 13332fc:	48 8d bb 58 02 00 00 	lea    rdi,[rbx+0x258]
 1333303:	49 8d b4 24 b8 00 00 	lea    rsi,[r12+0xb8]
 133330a:	00 
 133330b:	48 89 bc 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rdi
 1333312:	00 
 1333313:	e8 bc c9 f4 ff       	call   127fcd4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5258>
 1333318:	49 83 ef 80          	sub    r15,0xffffffffffffff80
 133331c:	41 8b 84 24 ac 00 00 	mov    eax,DWORD PTR [r12+0xac]
 1333323:	00 
 1333324:	89 83 70 02 00 00    	mov    DWORD PTR [rbx+0x270],eax
 133332a:	48 8d 83 78 02 00 00 	lea    rax,[rbx+0x278]
 1333331:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
 1333338:	00 
 1333339:	66 0f ef c0          	pxor   xmm0,xmm0
 133333d:	f3 0f 7f 83 78 02 00 	movdqu XMMWORD PTR [rbx+0x278],xmm0
 1333344:	00 
 1333345:	f3 0f 7f 83 88 02 00 	movdqu XMMWORD PTR [rbx+0x288],xmm0
 133334c:	00 
 133334d:	c7 83 98 02 00 00 00 	mov    DWORD PTR [rbx+0x298],0x3f800000
 1333354:	00 80 3f 
 1333357:	48 8d bb a0 02 00 00 	lea    rdi,[rbx+0x2a0]
 133335e:	48 89 bc 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rdi
 1333365:	00 
 1333366:	4c 89 fe             	mov    rsi,r15
 1333369:	e8 22 6f 74 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 133336e:	66 0f 6f 84 24 f0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xf0]
 1333375:	00 00 
 1333377:	66 0f 7f 83 d0 02 00 	movdqa XMMWORD PTR [rbx+0x2d0],xmm0
 133337e:	00 
 133337f:	48 8d bb e0 02 00 00 	lea    rdi,[rbx+0x2e0]
 1333386:	48 89 bc 24 08 01 00 	mov    QWORD PTR [rsp+0x108],rdi
 133338d:	00 
 133338e:	48 8b 74 24 38       	mov    rsi,QWORD PTR [rsp+0x38]
 1333393:	e8 4e b7 01 00       	call   134eae6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19406a>
 1333398:	41 0f b6 c5          	movzx  eax,r13b
 133339c:	4c 89 f1             	mov    rcx,r14
 133339f:	48 c1 e1 08          	shl    rcx,0x8
 13333a3:	48 09 c8             	or     rax,rcx
 13333a6:	41 8a 8c 24 b0 00 00 	mov    cl,BYTE PTR [r12+0xb0]
 13333ad:	00 
 13333ae:	88 8b 60 03 00 00    	mov    BYTE PTR [rbx+0x360],cl
 13333b4:	89 83 61 03 00 00    	mov    DWORD PTR [rbx+0x361],eax
 13333ba:	48 c1 e8 20          	shr    rax,0x20
 13333be:	88 83 65 03 00 00    	mov    BYTE PTR [rbx+0x365],al
 13333c4:	4c 8d ab 68 03 00 00 	lea    r13,[rbx+0x368]
 13333cb:	48 8d b3 58 01 00 00 	lea    rsi,[rbx+0x158]
 13333d2:	4c 89 ef             	mov    rdi,r13
 13333d5:	e8 80 b6 9d ff       	call   d0ea5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25b9fa>
 13333da:	45 84 f6             	test   r14b,r14b
 13333dd:	0f 84 b8 00 00 00    	je     133349b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178a1f>
 13333e3:	48 8d 35 3b e8 11 ff 	lea    rsi,[rip+0xffffffffff11e83b]        # 451c25 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17831>
 13333ea:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 13333f1:	00 
 13333f2:	e8 87 66 74 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 13333f7:	48 8d 35 8a 97 0a ff 	lea    rsi,[rip+0xffffffffff0a978a]        # 3dcb88 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x25d7>
 13333fe:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
 1333405:	00 
 1333406:	48 8d 94 24 f0 04 00 	lea    rdx,[rsp+0x4f0]
 133340d:	00 
 133340e:	31 c9                	xor    ecx,ecx
 1333410:	e8 d9 92 9d ff       	call   d0c6ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25968e>
 1333415:	48 8d b4 24 10 04 00 	lea    rsi,[rsp+0x410]
 133341c:	00 
 133341d:	4c 89 ef             	mov    rdi,r13
 1333420:	e8 01 93 9d ff       	call   d0c726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2596c6>
 1333425:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
 133342c:	00 
 133342d:	e8 9a b3 76 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
 1333432:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 1333439:	00 
 133343a:	e8 51 aa 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 133343f:	48 8d 35 df e7 11 ff 	lea    rsi,[rip+0xffffffffff11e7df]        # 451c25 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17831>
 1333446:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 133344d:	00 
 133344e:	e8 2b 66 74 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 1333453:	48 8d 35 46 97 0a ff 	lea    rsi,[rip+0xffffffffff0a9746]        # 3dcba0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x25ef>
 133345a:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
 1333461:	00 
 1333462:	48 8d 94 24 f0 04 00 	lea    rdx,[rsp+0x4f0]
 1333469:	00 
 133346a:	31 c9                	xor    ecx,ecx
 133346c:	e8 7d 92 9d ff       	call   d0c6ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25968e>
 1333471:	48 8d b4 24 10 04 00 	lea    rsi,[rsp+0x410]
 1333478:	00 
 1333479:	4c 89 ef             	mov    rdi,r13
 133347c:	e8 a5 92 9d ff       	call   d0c726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2596c6>
 1333481:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
 1333488:	00 
 1333489:	e8 3e b3 76 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
 133348e:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 1333495:	00 
 1333496:	e8 f5 a9 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 133349b:	48 8b b3 68 03 00 00 	mov    rsi,QWORD PTR [rbx+0x368]
 13334a2:	48 8b 83 70 03 00 00 	mov    rax,QWORD PTR [rbx+0x370]
 13334a9:	48 29 f0             	sub    rax,rsi
 13334ac:	6a 38                	push   0x38
 13334ae:	59                   	pop    rcx
 13334af:	48 99                	cqo
 13334b1:	48 f7 f9             	idiv   rcx
 13334b4:	0f b6 8b d0 01 00 00 	movzx  ecx,BYTE PTR [rbx+0x1d0]
 13334bb:	44 0f b6 83 65 03 00 	movzx  r8d,BYTE PTR [rbx+0x365]
 13334c2:	00 
 13334c3:	44 0f b6 8b 40 02 00 	movzx  r9d,BYTE PTR [rbx+0x240]
 13334ca:	00 
 13334cb:	48 8d bc 24 b8 02 00 	lea    rdi,[rsp+0x2b8]
 13334d2:	00 
 13334d3:	48 89 c2             	mov    rdx,rax
 13334d6:	e8 c9 44 00 00       	call   13379a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17cf28>
 13334db:	41 80 bc 24 61 01 00 	cmp    BYTE PTR [r12+0x161],0x0
 13334e2:	00 00 
 13334e4:	74 68                	je     133354e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178ad2>
 13334e6:	45 31 ff             	xor    r15d,r15d
 13334e9:	e9 c5 00 00 00       	jmp    13335b3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178b37>
 13334ee:	66 0f ef c0          	pxor   xmm0,xmm0
 13334f2:	48 8d 8c 24 a0 03 00 	lea    rcx,[rsp+0x3a0]
 13334f9:	00 
 13334fa:	66 0f 7f 01          	movdqa XMMWORD PTR [rcx],xmm0
 13334fe:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
 1333503:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
 133350a:	00 
 133350b:	48 8d 94 24 10 04 00 	lea    rdx,[rsp+0x410]
 1333512:	00 
 1333513:	4c 89 f6             	mov    rsi,r14
 1333516:	41 ff 56 18          	call   QWORD PTR [r14+0x18]
 133351a:	48 8b 84 24 f0 01 00 	mov    rax,QWORD PTR [rsp+0x1f0]
 1333521:	00 
 1333522:	48 85 c0             	test   rax,rax
 1333525:	4c 8b 6c 24 50       	mov    r13,QWORD PTR [rsp+0x50]
 133352a:	0f 84 1f 0f 00 00    	je     133444f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1799d3>
 1333530:	0f b6 8c 24 a0 03 00 	movzx  ecx,BYTE PTR [rsp+0x3a0]
 1333537:	00 
 1333538:	f6 c1 01             	test   cl,0x1
 133353b:	0f 84 8a 0f 00 00    	je     13344cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179a4f>
 1333541:	48 8b 8c 24 a8 03 00 	mov    rcx,QWORD PTR [rsp+0x3a8]
 1333548:	00 
 1333549:	e9 7f 0f 00 00       	jmp    13344cd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179a51>
 133354e:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
 1333553:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1333556:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
 133355d:	00 
 133355e:	ff 50 38             	call   QWORD PTR [rax+0x38]
 1333561:	4d 89 ec             	mov    r12,r13
 1333564:	4c 8b ac 24 10 04 00 	mov    r13,QWORD PTR [rsp+0x410]
 133356b:	00 
 133356c:	4c 8b b4 24 18 04 00 	mov    r14,QWORD PTR [rsp+0x418]
 1333573:	00 
 1333574:	6a 04                	push   0x4
 1333576:	5a                   	pop    rdx
 1333577:	4c 89 ef             	mov    rdi,r13
 133357a:	4c 89 f6             	mov    rsi,r14
 133357d:	e8 56 38 eb ff       	call   11e6dd8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c35c>
 1333582:	41 b7 01             	mov    r15b,0x1
 1333585:	84 c0                	test   al,al
 1333587:	74 15                	je     133359e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178b22>
 1333589:	6a 3f                	push   0x3f
 133358b:	5a                   	pop    rdx
 133358c:	4c 89 ef             	mov    rdi,r13
 133358f:	4c 89 f6             	mov    rsi,r14
 1333592:	e8 41 38 eb ff       	call   11e6dd8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c35c>
 1333597:	41 89 c7             	mov    r15d,eax
 133359a:	41 80 f7 01          	xor    r15b,0x1
 133359e:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
 13335a5:	00 
 13335a6:	e8 7d b8 d4 ff       	call   107ee28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24623e>
 13335ab:	4d 89 e5             	mov    r13,r12
 13335ae:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
 13335b3:	48 8d 83 30 01 00 00 	lea    rax,[rbx+0x130]
 13335ba:	48 8d bb 80 03 00 00 	lea    rdi,[rbx+0x380]
 13335c1:	45 0f b6 c7          	movzx  r8d,r15b
 13335c5:	49 89 c7             	mov    r15,rax
 13335c8:	48 8d 8c 24 b8 02 00 	lea    rcx,[rsp+0x2b8]
 13335cf:	00 
 13335d0:	48 8b 74 24 40       	mov    rsi,QWORD PTR [rsp+0x40]
 13335d5:	48 89 c2             	mov    rdx,rax
 13335d8:	e8 bb c7 00 00       	call   133fd98 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18531c>
 13335dd:	48 8d bc 24 b8 02 00 	lea    rdi,[rsp+0x2b8]
 13335e4:	00 
 13335e5:	e8 3e b8 d4 ff       	call   107ee28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24623e>
 13335ea:	48 8d 83 90 03 00 00 	lea    rax,[rbx+0x390]
 13335f1:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
 13335f8:	00 
 13335f9:	48 83 a3 90 03 00 00 	and    QWORD PTR [rbx+0x390],0x0
 1333600:	00 
 1333601:	4c 8d b3 98 03 00 00 	lea    r14,[rbx+0x398]
 1333608:	6a 01                	push   0x1
 133360a:	59                   	pop    rcx
 133360b:	4c 89 f7             	mov    rdi,r14
 133360e:	4c 89 fe             	mov    rsi,r15
 1333611:	89 ca                	mov    edx,ecx
 1333613:	41 89 c8             	mov    r8d,ecx
 1333616:	49 89 e9             	mov    r9,rbp
 1333619:	e8 66 88 f9 ff       	call   12cbe84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x111408>
 133361e:	4c 89 bc 24 38 01 00 	mov    QWORD PTR [rsp+0x138],r15
 1333625:	00 
 1333626:	48 8d bb a8 03 00 00 	lea    rdi,[rbx+0x3a8]
 133362d:	66 0f 6f 44 24 50    	movdqa xmm0,XMMWORD PTR [rsp+0x50]
 1333633:	66 48 0f 7e c6       	movq   rsi,xmm0
 1333638:	48 89 bc 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rdi
 133363f:	00 
 1333640:	e8 c9 42 fa ff       	call   12d790e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11ce92>
 1333645:	66 0f ef c0          	pxor   xmm0,xmm0
 1333649:	f3 0f 7f 83 b8 03 00 	movdqu XMMWORD PTR [rbx+0x3b8],xmm0
 1333650:	00 
 1333651:	0f 28 84 24 e0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xe0]
 1333658:	00 
 1333659:	0f 11 83 c8 03 00 00 	movups XMMWORD PTR [rbx+0x3c8],xmm0
 1333660:	4c 8d bb d8 03 00 00 	lea    r15,[rbx+0x3d8]
 1333667:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
 133366e:	00 
 133366f:	4c 89 ff             	mov    rdi,r15
 1333672:	e8 db dc 97 ff       	call   cb1352 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe2f2>
 1333677:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 133367c:	48 89 83 40 04 00 00 	mov    QWORD PTR [rbx+0x440],rax
 1333683:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
 1333688:	48 89 83 48 04 00 00 	mov    QWORD PTR [rbx+0x448],rax
 133368f:	83 a3 50 04 00 00 00 	and    DWORD PTR [rbx+0x450],0x0
 1333696:	41 8a 84 24 61 01 00 	mov    al,BYTE PTR [r12+0x161]
 133369d:	00 
 133369e:	88 83 54 04 00 00    	mov    BYTE PTR [rbx+0x454],al
 13336a4:	66 83 a3 55 04 00 00 	and    WORD PTR [rbx+0x455],0x0
 13336ab:	00 
 13336ac:	48 8d bb 58 04 00 00 	lea    rdi,[rbx+0x458]
 13336b3:	48 89 bc 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rdi
 13336ba:	00 
 13336bb:	e8 36 63 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 13336c0:	48 8d bb 68 04 00 00 	lea    rdi,[rbx+0x468]
 13336c7:	48 89 bc 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rdi
 13336ce:	00 
 13336cf:	e8 22 63 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 13336d4:	48 8d bb 78 04 00 00 	lea    rdi,[rbx+0x478]
 13336db:	48 89 bc 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rdi
 13336e2:	00 
 13336e3:	e8 0e 63 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 13336e8:	48 8d bb 88 04 00 00 	lea    rdi,[rbx+0x488]
 13336ef:	48 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rdi
 13336f6:	00 
 13336f7:	e8 fa 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 13336fc:	48 8d bb 98 04 00 00 	lea    rdi,[rbx+0x498]
 1333703:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
 133370a:	00 
 133370b:	e8 e6 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 1333710:	48 8d bb a8 04 00 00 	lea    rdi,[rbx+0x4a8]
 1333717:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
 133371e:	00 
 133371f:	e8 d2 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 1333724:	48 8d bb b8 04 00 00 	lea    rdi,[rbx+0x4b8]
 133372b:	48 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdi
 1333732:	00 
 1333733:	e8 be 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 1333738:	48 8d bb c8 04 00 00 	lea    rdi,[rbx+0x4c8]
 133373f:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
 1333746:	00 
 1333747:	e8 aa 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 133374c:	48 83 a3 d8 04 00 00 	and    QWORD PTR [rbx+0x4d8],0x0
 1333753:	00 
 1333754:	48 83 a3 e8 04 00 00 	and    QWORD PTR [rbx+0x4e8],0x0
 133375b:	00 
 133375c:	48 83 a3 f8 04 00 00 	and    QWORD PTR [rbx+0x4f8],0x0
 1333763:	00 
 1333764:	48 83 a3 08 05 00 00 	and    QWORD PTR [rbx+0x508],0x0
 133376b:	00 
 133376c:	31 c0                	xor    eax,eax
 133376e:	88 83 18 05 00 00    	mov    BYTE PTR [rbx+0x518],al
 1333774:	88 83 38 05 00 00    	mov    BYTE PTR [rbx+0x538],al
 133377a:	88 83 40 05 00 00    	mov    BYTE PTR [rbx+0x540],al
 1333780:	88 83 60 05 00 00    	mov    BYTE PTR [rbx+0x560],al
 1333786:	0f 57 c0             	xorps  xmm0,xmm0
 1333789:	0f 11 83 68 05 00 00 	movups XMMWORD PTR [rbx+0x568],xmm0
 1333790:	0f 11 83 78 05 00 00 	movups XMMWORD PTR [rbx+0x578],xmm0
 1333797:	0f 11 83 88 05 00 00 	movups XMMWORD PTR [rbx+0x588],xmm0
 133379e:	c7 83 98 05 00 00 00 	mov    DWORD PTR [rbx+0x598],0x3f800000
 13337a5:	00 80 3f 
 13337a8:	66 0f 6f 84 24 50 01 	movdqa xmm0,XMMWORD PTR [rsp+0x150]
 13337af:	00 00 
 13337b1:	66 0f 7f 83 a0 05 00 	movdqa XMMWORD PTR [rbx+0x5a0],xmm0
 13337b8:	00 
 13337b9:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
 13337c0:	48 85 c0             	test   rax,rax
 13337c3:	74 05                	je     13337ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178d4e>
 13337c5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
 13337ca:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 13337cf:	48 8d 83 d8 04 00 00 	lea    rax,[rbx+0x4d8]
 13337d6:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
 13337db:	48 8d 83 f8 04 00 00 	lea    rax,[rbx+0x4f8]
 13337e2:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
 13337e7:	48 8d 83 18 05 00 00 	lea    rax,[rbx+0x518]
 13337ee:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
 13337f5:	00 
 13337f6:	48 8d 83 40 05 00 00 	lea    rax,[rbx+0x540]
 13337fd:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 1333802:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
 1333806:	48 89 ef             	mov    rdi,rbp
 1333809:	4c 89 bc 24 00 01 00 	mov    QWORD PTR [rsp+0x100],r15
 1333810:	00 
 1333811:	ff 50 50             	call   QWORD PTR [rax+0x50]
 1333814:	48 89 83 b0 05 00 00 	mov    QWORD PTR [rbx+0x5b0],rax
 133381b:	48 83 a4 24 e8 01 00 	and    QWORD PTR [rsp+0x1e8],0x0
 1333822:	00 00 
 1333824:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
 1333829:	48 89 83 b8 05 00 00 	mov    QWORD PTR [rbx+0x5b8],rax
 1333830:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 1333835:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax
 133383c:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
 1333841:	48 89 83 c8 05 00 00 	mov    QWORD PTR [rbx+0x5c8],rax
 1333848:	48 8d bb d0 05 00 00 	lea    rdi,[rbx+0x5d0]
 133384f:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
 1333854:	e8 9d 61 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 1333859:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]
 1333860:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1333863:	ff 50 20             	call   QWORD PTR [rax+0x20]
 1333866:	4c 89 74 24 70       	mov    QWORD PTR [rsp+0x70],r14
 133386b:	34 01                	xor    al,0x1
 133386d:	88 83 e0 05 00 00    	mov    BYTE PTR [rbx+0x5e0],al
 1333873:	48 83 a3 e8 05 00 00 	and    QWORD PTR [rbx+0x5e8],0x0
 133387a:	00 
 133387b:	48 8d bb f0 05 00 00 	lea    rdi,[rbx+0x5f0]
 1333882:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
 1333887:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
 133388c:	e8 31 de 48 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 1333891:	48 8d 35 48 92 0a ff 	lea    rsi,[rip+0xffffffffff0a9248]        # 3dcae0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x252f>
 1333898:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
 133389f:	00 
 13338a0:	e8 d9 61 74 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 13338a5:	4c 8d a4 24 f0 04 00 	lea    r12,[rsp+0x4f0]
 13338ac:	00 
 13338ad:	41 c6 04 24 00       	mov    BYTE PTR [r12],0x0
 13338b2:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]

## Exact install neighborhood
     13336e2:	00 
     13336e3:	e8 0e 63 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     13336e8:	48 8d bb 88 04 00 00 	lea    rdi,[rbx+0x488]
     13336ef:	48 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rdi
     13336f6:	00 
     13336f7:	e8 fa 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     13336fc:	48 8d bb 98 04 00 00 	lea    rdi,[rbx+0x498]
     1333703:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
     133370a:	00 
     133370b:	e8 e6 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1333710:	48 8d bb a8 04 00 00 	lea    rdi,[rbx+0x4a8]
     1333717:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
     133371e:	00 
     133371f:	e8 d2 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1333724:	48 8d bb b8 04 00 00 	lea    rdi,[rbx+0x4b8]
     133372b:	48 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdi
     1333732:	00 
     1333733:	e8 be 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1333738:	48 8d bb c8 04 00 00 	lea    rdi,[rbx+0x4c8]
     133373f:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
     1333746:	00 
     1333747:	e8 aa 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     133374c:	48 83 a3 d8 04 00 00 	and    QWORD PTR [rbx+0x4d8],0x0
     1333753:	00 
     1333754:	48 83 a3 e8 04 00 00 	and    QWORD PTR [rbx+0x4e8],0x0
     133375b:	00 
     133375c:	48 83 a3 f8 04 00 00 	and    QWORD PTR [rbx+0x4f8],0x0
     1333763:	00 
     1333764:	48 83 a3 08 05 00 00 	and    QWORD PTR [rbx+0x508],0x0
     133376b:	00 
     133376c:	31 c0                	xor    eax,eax
     133376e:	88 83 18 05 00 00    	mov    BYTE PTR [rbx+0x518],al
     1333774:	88 83 38 05 00 00    	mov    BYTE PTR [rbx+0x538],al
     133377a:	88 83 40 05 00 00    	mov    BYTE PTR [rbx+0x540],al
     1333780:	88 83 60 05 00 00    	mov    BYTE PTR [rbx+0x560],al
     1333786:	0f 57 c0             	xorps  xmm0,xmm0
     1333789:	0f 11 83 68 05 00 00 	movups XMMWORD PTR [rbx+0x568],xmm0
     1333790:	0f 11 83 78 05 00 00 	movups XMMWORD PTR [rbx+0x578],xmm0
     1333797:	0f 11 83 88 05 00 00 	movups XMMWORD PTR [rbx+0x588],xmm0
     133379e:	c7 83 98 05 00 00 00 	mov    DWORD PTR [rbx+0x598],0x3f800000
     13337a5:	00 80 3f 
     13337a8:	66 0f 6f 84 24 50 01 	movdqa xmm0,XMMWORD PTR [rsp+0x150]
     13337af:	00 00 
     13337b1:	66 0f 7f 83 a0 05 00 	movdqa XMMWORD PTR [rbx+0x5a0],xmm0
     13337b8:	00 
     13337b9:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
     13337c0:	48 85 c0             	test   rax,rax
     13337c3:	74 05                	je     13337ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178d4e>
     13337c5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     13337ca:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     13337cf:	48 8d 83 d8 04 00 00 	lea    rax,[rbx+0x4d8]
     13337d6:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     13337db:	48 8d 83 f8 04 00 00 	lea    rax,[rbx+0x4f8]
     13337e2:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     13337e7:	48 8d 83 18 05 00 00 	lea    rax,[rbx+0x518]
     13337ee:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
     13337f5:	00 
     13337f6:	48 8d 83 40 05 00 00 	lea    rax,[rbx+0x540]
     13337fd:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     1333802:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     1333806:	48 89 ef             	mov    rdi,rbp
     1333809:	4c 89 bc 24 00 01 00 	mov    QWORD PTR [rsp+0x100],r15
     1333810:	00 
     1333811:	ff 50 50             	call   QWORD PTR [rax+0x50]
     1333814:	48 89 83 b0 05 00 00 	mov    QWORD PTR [rbx+0x5b0],rax
     133381b:	48 83 a4 24 e8 01 00 	and    QWORD PTR [rsp+0x1e8],0x0
     1333822:	00 00 
     1333824:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
     1333829:	48 89 83 b8 05 00 00 	mov    QWORD PTR [rbx+0x5b8],rax
     1333830:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     1333835:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax
     133383c:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
     1333841:	48 89 83 c8 05 00 00 	mov    QWORD PTR [rbx+0x5c8],rax
     1333848:	48 8d bb d0 05 00 00 	lea    rdi,[rbx+0x5d0]
     133384f:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
     1333854:	e8 9d 61 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1333859:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]
     1333860:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1333863:	ff 50 20             	call   QWORD PTR [rax+0x20]
     1333866:	4c 89 74 24 70       	mov    QWORD PTR [rsp+0x70],r14
     133386b:	34 01                	xor    al,0x1
     133386d:	88 83 e0 05 00 00    	mov    BYTE PTR [rbx+0x5e0],al
     1333873:	48 83 a3 e8 05 00 00 	and    QWORD PTR [rbx+0x5e8],0x0
     133387a:	00 
     133387b:	48 8d bb f0 05 00 00 	lea    rdi,[rbx+0x5f0]
     1333882:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
     1333887:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     133388c:	e8 31 de 48 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     1333891:	48 8d 35 48 92 0a ff 	lea    rsi,[rip+0xffffffffff0a9248]        # 3dcae0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x252f>
     1333898:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
     133389f:	00 
     13338a0:	e8 d9 61 74 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     13338a5:	4c 8d a4 24 f0 04 00 	lea    r12,[rsp+0x4f0]
     13338ac:	00 
     13338ad:	41 c6 04 24 00       	mov    BYTE PTR [r12],0x0
     13338b2:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     13338b7:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     13338ba:	4c 8d b4 24 10 04 00 	lea    r14,[rsp+0x410]
     13338c1:	00 
     13338c2:	4c 89 f6             	mov    rsi,r14
     13338c5:	4c 89 e2             	mov    rdx,r12
     13338c8:	e8 91 9e 85 ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>
     13338cd:	89 c5                	mov    ebp,eax
     13338cf:	4c 89 f7             	mov    rdi,r14
     13338d2:	e8 b9 a5 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     13338d7:	40 88 ab 00 06 00 00 	mov    BYTE PTR [rbx+0x600],bpl
     13338de:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     13338e3:	48 89 83 08 06 00 00 	mov    QWORD PTR [rbx+0x608],rax
     13338ea:	48 8b 84 24 48 01 00 	mov    rax,QWORD PTR [rsp+0x148]
     13338f1:	00 
     13338f2:	48 89 83 10 06 00 00 	mov    QWORD PTR [rbx+0x610],rax
     13338f9:	48 8d 83 18 06 00 00 	lea    rax,[rbx+0x618]
     1333900:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     1333905:	80 b9 50 01 00 00 00 	cmp    BYTE PTR [rcx+0x150],0x0
     133390c:	74 0c                	je     133391a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178e9e>
     133390e:	66 0f ef c0          	pxor   xmm0,xmm0
     1333912:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
     1333916:	b0 01                	mov    al,0x1
     1333918:	eb 05                	jmp    133391f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178ea3>
     133391a:	c6 00 00             	mov    BYTE PTR [rax],0x0
     133391d:	31 c0                	xor    eax,eax
     133391f:	88 83 28 06 00 00    	mov    BYTE PTR [rbx+0x628],al
     1333925:	83 a3 30 06 00 00 00 	and    DWORD PTR [rbx+0x630],0x0
     133392c:	48 8d bb 38 06 00 00 	lea    rdi,[rbx+0x638]
     1333933:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
     1333938:	e8 b9 60 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
