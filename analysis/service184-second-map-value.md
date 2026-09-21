# Service184 second-map value writer

Proven read path:
- second map base = r14+0x58
- lookup 0x1334d26 returns node
- node+0xa0 -> intermediate object
- intermediate+0x10 -> service184 pointer, then intermediate+0x10 is cleared

## Owning FDE (20131328, 20138970)
     1332eea:	f3 0f 7f 43 58       	movdqu XMMWORD PTR [rbx+0x58],xmm0
     1332f42:	4d 8d 66 30          	lea    r12,[r14+0x30]
     1332f4c:	e8 d5 1d 00 00       	call   1334d26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a2aa>
     1332f59:	48 8b b8 a8 00 00 00 	mov    rdi,QWORD PTR [rax+0xa8]
     1332f72:	48 8b 83 a0 00 00 00 	mov    rax,QWORD PTR [rbx+0xa0]
     1332fa3:	49 8d 6e 58          	lea    rbp,[r14+0x58]
     1332fb2:	e8 6f 1d 00 00       	call   1334d26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a2aa>
     1332fc3:	48 8b 80 a0 00 00 00 	mov    rax,QWORD PTR [rax+0xa0]
     1332fda:	48 8d 8c 24 e0 02 00 	lea    rcx,[rsp+0x2e0]
     1332fe5:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     1332ff3:	e8 f2 1d 00 00       	call   1334dea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a36e>
     1332ff8:	48 8b bc 24 e0 02 00 	mov    rdi,QWORD PTR [rsp+0x2e0]
     1333011:	e8 b8 1f 00 00       	call   1334fce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a552>
     1333016:	0f 28 84 24 a0 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x3a0]
     1333090:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     133318a:	49 8b 47 30          	mov    rax,QWORD PTR [r15+0x30]
     13331d5:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     1333201:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     1333209:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]
     13332ee:	41 8b 84 24 a8 00 00 	mov    eax,DWORD PTR [r12+0xa8]
     13334f2:	48 8d 8c 24 a0 03 00 	lea    rcx,[rsp+0x3a0]
     1333530:	0f b6 8c 24 a0 03 00 	movzx  ecx,BYTE PTR [rsp+0x3a0]
     1333667:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     1333677:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     13336ef:	48 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rdi
     133373f:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
     13338b2:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     1333933:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
     1333984:	ff 50 30             	call   QWORD PTR [rax+0x30]
     13339b2:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     1333b29:	ff 50 30             	call   QWORD PTR [rax+0x30]
     1333ed9:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1334246:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     133433c:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     13343b6:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     13343fc:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     133446e:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     1334476:	48 8d 8c 24 a0 03 00 	lea    rcx,[rsp+0x3a0]
     13344e2:	66 0f 6f 84 24 a0 03 	movdqa xmm0,XMMWORD PTR [rsp+0x3a0]
     13344f8:	66 0f 7f 84 24 a0 03 	movdqa XMMWORD PTR [rsp+0x3a0],xmm0
     133452d:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     1334540:	e8 a5 08 00 00       	call   1334dea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a36e>
     1334563:	e8 66 0a 00 00       	call   1334fce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a552>
     1334568:	0f 28 84 24 e0 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x2e0]
     13345bc:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     13346ee:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     133478f:	48 8b bc 24 e0 02 00 	mov    rdi,QWORD PTR [rsp+0x2e0]
     133495d:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     13349e9:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     1334a1d:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1334b35:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     1334b93:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]

## All callers of 0x1334fce and immediate return dataflow
### call@0x1333011, FDE=(20131328, 20138970)
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

### call@0x1334563, FDE=(20131328, 20138970)
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
     13345a0:	48 8b bc 24 f0 01 00 	mov    rdi,QWORD PTR [rsp+0x1f0]
     13345a7:	00 
     13345a8:	48 83 a4 24 f0 01 00 	and    QWORD PTR [rsp+0x1f0],0x0
     13345af:	00 00 
     13345b1:	48 85 ff             	test   rdi,rdi
     13345b4:	74 06                	je     13345bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179b40>
     13345b6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13345b9:	ff 50 08             	call   QWORD PTR [rax+0x8]
     13345bc:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     13345c3:	00 
     13345c4:	e8 c7 98 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     13345c9:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
     13345d0:	00 
     13345d1:	e8 16 07 00 00       	call   1334cec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a270>
     13345d6:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     13345dd:	00 
     13345de:	e8 ad 98 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     13345e3:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
     13345ea:	00 
     13345eb:	e8 da 1c 8f ff       	call   c262ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17326a>
     13345f0:	48 8d bc 24 48 03 00 	lea    rdi,[rsp+0x348]
     13345f7:	00 
     13345f8:	e8 31 0d 39 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     13345fd:	84 db                	test   bl,bl
     13345ff:	0f 84 8b ea ff ff    	je     1333090 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178614>
     1334605:	4c 8b b4 24 c8 00 00 	mov    r14,QWORD PTR [rsp+0xc8]
     133460c:	00 
     133460d:	49 83 26 00          	and    QWORD PTR [r14],0x0
     1334611:	e9 f3 fd ff ff       	jmp    1334409 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17998d>
     1334616:	49 89 c6             	mov    r14,rax
     1334619:	48 8b bc 24 e8 02 00 	mov    rdi,QWORD PTR [rsp+0x2e8]
     1334620:	00 
     1334621:	e8 60 9e 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1334626:	eb 16                	jmp    133463e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179bc2>
     1334628:	49 89 c6             	mov    r14,rax
     133462b:	48 8b bc 24 f0 04 00 	mov    rdi,QWORD PTR [rsp+0x4f0]
     1334632:	00 
     1334633:	48 85 ff             	test   rdi,rdi
     1334636:	74 06                	je     133463e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179bc2>
     1334638:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     133463b:	ff 50 08             	call   QWORD PTR [rax+0x8]
     133463e:	48 8b bc 24 f0 01 00 	mov    rdi,QWORD PTR [rsp+0x1f0]

## All callers of lookup 0x1334d26
### call@0x1332f4c, FDE=(20131328, 20138970)
     1332f11:	40 88 6b 70          	mov    BYTE PTR [rbx+0x70],bpl
     1332f15:	0f 28 8c 24 60 01 00 	movaps xmm1,XMMWORD PTR [rsp+0x160]
     1332f1c:	00 
     1332f1d:	0f 11 4b 78          	movups XMMWORD PTR [rbx+0x78],xmm1
     1332f21:	48 8b 84 24 70 01 00 	mov    rax,QWORD PTR [rsp+0x170]
     1332f28:	00 
     1332f29:	48 89 83 88 00 00 00 	mov    QWORD PTR [rbx+0x88],rax
     1332f30:	66 0f 7f 84 24 60 01 	movdqa XMMWORD PTR [rsp+0x160],xmm0
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

### call@0x1332fb2, FDE=(20131328, 20138970)
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

### call@0x13358fe, FDE=(20142202, 20144284)
     13358d3:	0f 85 be 07 00 00    	jne    1336097 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b61b>
     13358d9:	4c 89 f7             	mov    rdi,r14
     13358dc:	48 81 c4 c8 01 00 00 	add    rsp,0x1c8
     13358e3:	5b                   	pop    rbx
     13358e4:	41 5c                	pop    r12
     13358e6:	41 5d                	pop    r13
     13358e8:	41 5e                	pop    r14
     13358ea:	41 5f                	pop    r15
     13358ec:	5d                   	pop    rbp
     13358ed:	ff e0                	jmp    rax
     13358ef:	4d 8d 7c 24 30       	lea    r15,[r12+0x30]
     13358f4:	48 83 c5 18          	add    rbp,0x18
     13358f8:	4c 89 ff             	mov    rdi,r15
     13358fb:	48 89 ee             	mov    rsi,rbp
     13358fe:	e8 23 f4 ff ff       	call   1334d26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a2aa>
     1335903:	48 85 c0             	test   rax,rax
     1335906:	4c 89 64 24 08       	mov    QWORD PTR [rsp+0x8],r12
     133590b:	0f 84 0e 01 00 00    	je     1335a1f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17afa3>
     1335911:	48 89 c1             	mov    rcx,rax
     1335914:	4c 8b 00             	mov    r8,QWORD PTR [rax]
     1335917:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
     133591b:	4d 8b 4c 24 38       	mov    r9,QWORD PTR [r12+0x38]
     1335920:	f3 49 0f b8 d9       	popcnt rbx,r9
     1335925:	48 83 fb 01          	cmp    rbx,0x1
     1335929:	77 09                	ja     1335934 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aeb8>
     133592b:	49 8d 41 ff          	lea    rax,[r9-0x1]
     133592f:	48 21 c6             	and    rsi,rax
     1335932:	eb 10                	jmp    1335944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aec8>
     1335934:	4c 39 ce             	cmp    rsi,r9
     1335937:	72 0b                	jb     1335944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aec8>
     1335939:	48 89 f0             	mov    rax,rsi
     133593c:	31 d2                	xor    edx,edx
     133593e:	49 f7 f1             	div    r9
     1335941:	48 89 d6             	mov    rsi,rdx
     1335944:	4d 8b 27             	mov    r12,QWORD PTR [r15]
     1335947:	49 8b 04 f4          	mov    rax,QWORD PTR [r12+rsi*8]
     133594b:	49 89 c2             	mov    r10,rax
     133594e:	48 8b 00             	mov    rax,QWORD PTR [rax]
     1335951:	48 39 c8             	cmp    rax,rcx
     1335954:	75 f5                	jne    133594b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17aecf>
     1335956:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     133595b:	4c 8d 58 40          	lea    r11,[rax+0x40]
     133595f:	4d 39 da             	cmp    r10,r11

### call@0x1336147, FDE=(20144418, 20144499)
     1336121:	cc                   	int3
     1336122:	41 56                	push   r14
     1336124:	53                   	push   rbx
     1336125:	50                   	push   rax
     1336126:	49 89 fe             	mov    r14,rdi
     1336129:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     133612c:	48 83 c7 08          	add    rdi,0x8
     1336130:	e8 09 22 83 ff       	call   b6833e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb52de>
     1336135:	84 c0                	test   al,al
     1336137:	75 2a                	jne    1336163 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b6e7>
     1336139:	48 83 c3 58          	add    rbx,0x58
     133613d:	49 83 c6 18          	add    r14,0x18
     1336141:	48 89 df             	mov    rdi,rbx
     1336144:	4c 89 f6             	mov    rsi,r14
     1336147:	e8 da eb ff ff       	call   1334d26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a2aa>
     133614c:	48 85 c0             	test   rax,rax
     133614f:	74 12                	je     1336163 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b6e7>
     1336151:	48 89 df             	mov    rdi,rbx
     1336154:	48 89 c6             	mov    rsi,rax
     1336157:	48 83 c4 08          	add    rsp,0x8
     133615b:	5b                   	pop    rbx
     133615c:	41 5e                	pop    r14
     133615e:	e9 11 f3 ff ff       	jmp    1335474 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a9f8>
     1336163:	48 83 c4 08          	add    rsp,0x8
     1336167:	5b                   	pop    rbx
     1336168:	41 5e                	pop    r14
     133616a:	c3                   	ret
     133616b:	48 89 c7             	mov    rdi,rax
     133616e:	e8 32 39 74 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1336173:	cc                   	int3
     1336174:	53                   	push   rbx
     1336175:	48 89 fb             	mov    rbx,rdi
     1336178:	48 8d 05 51 fb 52 00 	lea    rax,[rip+0x52fb51]        # 1865cd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x223b8>
     133617f:	48 89 07             	mov    QWORD PTR [rdi],rax
     1336182:	48 83 c7 20          	add    rdi,0x20
     1336186:	e8 d5 f6 ff ff       	call   1335860 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ade4>
     133618b:	48 89 df             	mov    rdi,rbx
     133618e:	5b                   	pop    rbx
     133618f:	e9 7c 7e 4b 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     1336194:	53                   	push   rbx
     1336195:	48 89 fb             	mov    rbx,rdi
     1336198:	e8 d7 ff ff ff       	call   1336174 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b6f8>
     133619d:	48 89 df             	mov    rdi,rbx

## +0xa0/+0xa8 accesses in 0x1332e00 constructor FDE
### 0x1332f59: mov    rdi,QWORD PTR [rax+0xa8]
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

### 0x1332f72: mov    rax,QWORD PTR [rbx+0xa0]
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

### 0x1332fc3: mov    rax,QWORD PTR [rax+0xa0]
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

### 0x13332ee: mov    eax,DWORD PTR [r12+0xa8]
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

### 0x13336ef: mov    QWORD PTR [rsp+0xa8],rdi
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

### 0x133373f: mov    QWORD PTR [rsp+0xa0],rdi
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

### 0x13339b2: call   QWORD PTR [rax+0xa8]
     1333996:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1333999:	a8 02                	test   al,0x2
     133399b:	75 1b                	jne    13339b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178f3c>
     133399d:	48 8b bb c8 03 00 00 	mov    rdi,QWORD PTR [rbx+0x3c8]
     13339a4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13339a7:	48 8d b4 24 a0 01 00 	lea    rsi,[rsp+0x1a0]
     13339ae:	00 
     13339af:	4c 89 fa             	mov    rdx,r15
     13339b2:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     13339b8:	48 8b bb b8 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5b8]
     13339bf:	4c 8d 7b 10          	lea    r15,[rbx+0x10]
     13339c3:	48 8d 05 16 25 53 00 	lea    rax,[rip+0x532516]        # 1865ee0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x225c8>
     13339ca:	48 8d 94 24 c0 04 00 	lea    rdx,[rsp+0x4c0]
     13339d1:	00 
     13339d2:	48 89 02             	mov    QWORD PTR [rdx],rax
     13339d5:	48 89 5a 08          	mov    QWORD PTR [rdx+0x8],rbx
     13339d9:	48 89 52 20          	mov    QWORD PTR [rdx+0x20],rdx
     13339dd:	4c 89 fe             	mov    rsi,r15
     13339e0:	e8 4f 2d ff ff       	call   1326734 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16bcb8>
     13339e5:	48 8d bc 24 c0 04 00 	lea    rdi,[rsp+0x4c0]
     13339ec:	00 

### 0x1333ed9: mov    rdi,QWORD PTR [rsp+0xa8]
     1333ebc:	41 59                	pop    r9
     1333ebe:	e8 d1 68 4a 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     1333ec3:	4c 8d a4 24 f0 01 00 	lea    r12,[rsp+0x1f0]
     1333eca:	00 
     1333ecb:	4c 89 e7             	mov    rdi,r12
     1333ece:	4c 89 f6             	mov    rsi,r14
     1333ed1:	4c 89 fa             	mov    rdx,r15
     1333ed4:	e8 15 c8 b9 ff       	call   ed06ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x97b04>
     1333ed9:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1333ee0:	00 
     1333ee1:	4c 89 e6             	mov    rsi,r12
     1333ee4:	e8 09 5d 4a 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     1333ee9:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     1333eee:	e8 93 a5 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1333ef3:	4c 89 ff             	mov    rdi,r15
     1333ef6:	e8 ed 68 4a 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     1333efb:	48 8d 15 6e 8c 0a ff 	lea    rdx,[rip+0xffffffffff0a8c6e]        # 3dcb70 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x25bf>
     1333f02:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
     1333f07:	4c 89 ef             	mov    rdi,r13
     1333f0a:	4c 8b 74 24 60       	mov    r14,QWORD PTR [rsp+0x60]
     1333f0f:	4c 89 f6             	mov    rsi,r14

### 0x1334246: mov    rdi,QWORD PTR [rsp+0xa0]
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

### 0x13349e9: mov    rdi,QWORD PTR [rsp+0xa0]
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
     13349f1:	e8 de 51 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     13349f6:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
     13349fd:	00 
     13349fe:	e8 d1 51 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     1334a03:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
     1334a0a:	00 
     1334a0b:	e8 c4 51 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     1334a10:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
     1334a17:	00 
     1334a18:	e8 b7 51 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     1334a1d:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]

### 0x1334a1d: mov    rdi,QWORD PTR [rsp+0xa8]
     13349fd:	00 
     13349fe:	e8 d1 51 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     1334a03:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
     1334a0a:	00 
     1334a0b:	e8 c4 51 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     1334a10:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
     1334a17:	00 
     1334a18:	e8 b7 51 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     1334a1d:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1334a24:	00 
     1334a25:	e8 aa 51 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     1334a2a:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
     1334a31:	00 
     1334a32:	e8 9d 51 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     1334a37:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
     1334a3e:	00 
     1334a3f:	e8 90 51 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     1334a44:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
     1334a4b:	00 
     1334a4c:	e8 83 51 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     1334a51:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]

## Candidate writers through returned map-value pointer
## New-node +0xa0/+0xa8 initialization/writes
### node allocation call@0xa9e129, FDE=(11132896, 11133693)
      a9e119:	e8 8a 02 00 00       	call   a9e3a8 <JNI_OnUnload@@Base+0x25c75>
      a9e11e:	49 89 c4             	mov    r12,rax
      a9e121:	49 89 d5             	mov    r13,rdx
      a9e124:	bf b0 00 00 00       	mov    edi,0xb0
      a9e129:	e8 d2 fd d4 00       	call   17edf00 <_Znwm@plt>
      a9e12e:	49 89 c6             	mov    r14,rax
      a9e131:	0f 57 c0             	xorps  xmm0,xmm0
      a9e134:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      a9e138:	48 8d 05 29 f3 d5 00 	lea    rax,[rip+0xd5f329]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      a9e13f:	49 89 06             	mov    QWORD PTR [r14],rax
      a9e142:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      a9e147:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
      a9e14c:	e8 ef fd d4 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      a9e151:	0f 57 c9             	xorps  xmm1,xmm1
      a9e154:	41 0f 11 4e 20       	movups XMMWORD PTR [r14+0x20],xmm1
      a9e159:	48 8d 05 58 c8 df 00 	lea    rax,[rip+0xdfc858]        # 189a9b8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x78f8>
      a9e1b6:	41 0f 11 8e a0 00 00 	movups XMMWORD PTR [r14+0xa0],xmm1

### node allocation call@0xabc995, FDE=(11258245, 11258412)
      abc989:	53                   	push   rbx
      abc98a:	49 89 f7             	mov    r15,rsi
      abc98d:	48 89 fb             	mov    rbx,rdi
      abc990:	bf b0 00 00 00       	mov    edi,0xb0
      abc995:	e8 66 15 d3 00       	call   17edf00 <_Znwm@plt>
      abc99a:	49 89 c6             	mov    r14,rax
      abc99d:	48 8d 05 84 f2 de 00 	lea    rax,[rip+0xdef284]        # 18abc28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x18b68>
      abc9a4:	49 89 06             	mov    QWORD PTR [r14],rax
      abc9a7:	41 83 66 08 00       	and    DWORD PTR [r14+0x8],0x0
      abc9ac:	4d 89 7e 10          	mov    QWORD PTR [r14+0x10],r15
      abc9b0:	41 83 a6 88 00 00 00 	and    DWORD PTR [r14+0x88],0x0
      abc9b7:	00 
      abc9b8:	49 83 a6 a8 00 00 00 	and    QWORD PTR [r14+0xa8],0x0
      abc9bf:	00 
      abc9c0:	49 83 66 18 00       	and    QWORD PTR [r14+0x18],0x0
      abc9c5:	41 83 66 20 00       	and    DWORD PTR [r14+0x20],0x0
      abc9ca:	49 83 66 28 00       	and    QWORD PTR [r14+0x28],0x0
      abc9e1:	49 c7 86 a0 00 00 00 	mov    QWORD PTR [r14+0xa0],0x10000

### node allocation call@0xabdf90, FDE=(11263396, 11264275)
      abdf80:	49 39 d7             	cmp    r15,rdx
      abdf83:	0f 87 5f 01 00 00    	ja     abe0e8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb088>
      abdf89:	49 c1 e7 04          	shl    r15,0x4
      abdf8d:	4c 89 ff             	mov    rdi,r15
      abdf90:	e8 6b ff d2 00       	call   17edf00 <_Znwm@plt>
      abdf95:	4c 89 34 18          	mov    QWORD PTR [rax+rbx*1],r14
      abdf99:	49 c1 e5 04          	shl    r13,0x4
      abdf9d:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      abdfa3:	66 4a 0f 3a 16 44 28 	pextrq QWORD PTR [rax+r13*1+0x8],xmm0,0x1
      abdfaa:	08 01 
      abdfac:	4c 8d 2c 18          	lea    r13,[rax+rbx*1]
      abdfb0:	49 39 ec             	cmp    r12,rbp
      abdfb3:	74 41                	je     abdff6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf96>
      abdfb5:	66 0f ef c0          	pxor   xmm0,xmm0
      abdfb9:	4c 89 e9             	mov    rcx,r13
      abdfbc:	49 8b 54 24 f0       	mov    rdx,QWORD PTR [r12-0x10]
      abdfc1:	48 89 51 f0          	mov    QWORD PTR [rcx-0x10],rdx
      abdfc5:	49 8b 54 24 f8       	mov    rdx,QWORD PTR [r12-0x8]

### node allocation call@0xac1e49, FDE=(11278045, 11286889)
      ac1e36:	e8 55 c0 d2 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ac1e3b:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
      ac1e42:	00 00 
      ac1e44:	bf 08 02 00 00       	mov    edi,0x208
      ac1e49:	e8 b2 c0 d2 00       	call   17edf00 <_Znwm@plt>
      ac1e4e:	49 89 c6             	mov    r14,rax
      ac1e51:	48 8d 05 80 ab d4 00 	lea    rax,[rip+0xd4ab80]        # 180c9d8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2698>
      ac1e58:	49 89 06             	mov    QWORD PTR [r14],rax
      ac1e5b:	4d 8d 66 08          	lea    r12,[r14+0x8]
      ac1e5f:	4c 89 e7             	mov    rdi,r12
      ac1e62:	e8 71 ee 00 00       	call   ad0cd8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1dc78>
      ac1e67:	e8 c4 cb d2 00       	call   17eea30 <getpid@plt>
      ac1e6c:	41 89 46 30          	mov    DWORD PTR [r14+0x30],eax
      ac1e70:	e8 eb c2 d2 00       	call   17ee160 <_ZNSt6__ndk16chrono12steady_clock3nowEv@plt>
      ac1e75:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
      ac1e79:	49 83 66 50 00       	and    QWORD PTR [r14+0x50],0x0
      ac1e7e:	66 0f ef c0          	pxor   xmm0,xmm0
      ac1f40:	49 8d be a0 00 00 00 	lea    rdi,[r14+0xa0]

### node allocation call@0xacb54a, FDE=(11312454, 11320510)
      acb532:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      acb537:	48 8d 05 c2 e3 d3 00 	lea    rax,[rip+0xd3e3c2]        # 1809900 <_ZTIN4asio22service_already_existsE@@Base+0xb0e8>
      acb53e:	49 89 86 60 03 00 00 	mov    QWORD PTR [r14+0x360],rax
      acb545:	bf f0 00 00 00       	mov    edi,0xf0
      acb54a:	e8 b1 29 d2 00       	call   17edf00 <_Znwm@plt>
      acb54f:	48 89 c5             	mov    rbp,rax
      acb552:	4d 85 ff             	test   r15,r15
      acb555:	74 05                	je     acb55c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x184fc>
      acb557:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      acb55c:	4c 8d bc 24 f0 03 00 	lea    r15,[rsp+0x3f0]
      acb563:	00 
      acb564:	4c 89 ff             	mov    rdi,r15
      acb567:	e8 63 5b fe ff       	call   ab10cf <JNI_OnUnload@@Base+0x3899c>
      acb56c:	48 8b b4 24 f0 03 00 	mov    rsi,QWORD PTR [rsp+0x3f0]
      acb573:	00 
      acb574:	48 89 75 00          	mov    QWORD PTR [rbp+0x0],rsi
      acb578:	48 8d 05 b9 e3 d3 00 	lea    rax,[rip+0xd3e3b9]        # 1809938 <_ZTIN4asio22service_already_existsE@@Base+0xb120>
      acb57f:	48 89 84 24 f0 03 00 	mov    QWORD PTR [rsp+0x3f0],rax
      acb6c2:	48 89 85 a0 00 00 00 	mov    QWORD PTR [rbp+0xa0],rax

### node allocation call@0xacdcfa, FDE=(11323428, 11332417)
      acdce8:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
      acdcef:	00 
      acdcf0:	e8 b1 bb b1 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
      acdcf5:	bf b0 00 00 00       	mov    edi,0xb0
      acdcfa:	e8 01 02 d2 00       	call   17edf00 <_Znwm@plt>
      acdcff:	48 89 c3             	mov    rbx,rax
      acdd02:	66 0f ef c0          	pxor   xmm0,xmm0
      acdd06:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      acdd0b:	48 8d 05 f6 e2 d3 00 	lea    rax,[rip+0xd3e2f6]        # 180c008 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x1cc8>
      acdd12:	48 89 03             	mov    QWORD PTR [rbx],rax
      acdd15:	f3 0f 7f 43 18       	movdqu XMMWORD PTR [rbx+0x18],xmm0
      acdd1a:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
      acdd1f:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
      acdd23:	48 8d 35 26 cd 96 ff 	lea    rsi,[rip+0xffffffffff96cd26]        # 43aa50 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x65c>
      acdd2a:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]

### node allocation call@0xad014e, FDE=(11335022, 11340014)
      ad013e:	00 
      ad013f:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      ad0144:	e8 f7 dd d1 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ad0149:	bf b0 00 00 00       	mov    edi,0xb0
      ad014e:	e8 ad dd d1 00       	call   17edf00 <_Znwm@plt>
      ad0153:	49 89 c4             	mov    r12,rax
      ad0156:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
      ad015b:	48 8d 84 24 30 01 00 	lea    rax,[rsp+0x130]
      ad0162:	00 
      ad0163:	48 83 60 20 00       	and    QWORD PTR [rax+0x20],0x0
      ad0168:	48 89 c6             	mov    rsi,rax
      ad016b:	48 8d 05 6e 2e d3 00 	lea    rax,[rip+0xd32e6e]        # 1802fe0 <_ZTIN4asio22service_already_existsE@@Base+0x47c8>
      ad0172:	49 89 04 24          	mov    QWORD PTR [r12],rax
      ad0176:	4c 8d bc 24 00 02 00 	lea    r15,[rsp+0x200]
      ad017d:	00 
      ad017e:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
      ad0182:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
      ad02b6:	48 8b b4 24 a8 00 00 	mov    rsi,QWORD PTR [rsp+0xa8]
      ad02be:	48 83 a4 24 a8 00 00 	and    QWORD PTR [rsp+0xa8],0x0

### node allocation call@0xad30c5, FDE=(11344500, 11358295)
      ad30b3:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
      ad30ba:	00 
      ad30bb:	e8 4c 24 00 00       	call   ad550c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x224ac>
      ad30c0:	bf c0 01 00 00       	mov    edi,0x1c0
      ad30c5:	e8 36 ae d1 00       	call   17edf00 <_Znwm@plt>
      ad30ca:	49 89 c4             	mov    r12,rax
      ad30cd:	48 8b 84 24 e0 00 00 	mov    rax,QWORD PTR [rsp+0xe0]
      ad30d4:	00 
      ad30d5:	48 89 84 24 30 04 00 	mov    QWORD PTR [rsp+0x430],rax
      ad30dc:	00 
      ad30dd:	66 0f 6f 84 24 d0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xd0]
      ad30e4:	00 00 
      ad30e6:	66 0f 7f 84 24 20 04 	movdqa XMMWORD PTR [rsp+0x420],xmm0
      ad30ed:	00 00 
      ad30ef:	66 0f ef c0          	pxor   xmm0,xmm0
      ad30f3:	66 0f 7f 84 24 d0 00 	movdqa XMMWORD PTR [rsp+0xd0],xmm0
      ad30fa:	00 00 

### node allocation call@0xb68be2, FDE=(11963246, 11963527)
      b68bd6:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
      b68bdd:	00 00 
      b68bdf:	6a 40                	push   0x40
      b68be1:	5f                   	pop    rdi
      b68be2:	e8 19 53 c8 00       	call   17edf00 <_Znwm@plt>
      b68be7:	49 89 c6             	mov    r14,rax
      b68bea:	4c 8d 7c 24 60       	lea    r15,[rsp+0x60]
      b68bef:	48 89 c7             	mov    rdi,rax
      b68bf2:	4c 89 fe             	mov    rsi,r15
      b68bf5:	e8 8e 00 00 00       	call   b68c88 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5c28>
      b68bfa:	4c 8d a4 24 a0 00 00 	lea    r12,[rsp+0xa0]
      b68c01:	00 
      b68c02:	4d 89 34 24          	mov    QWORD PTR [r12],r14
      b68c06:	48 8d 05 a1 18 f9 ff 	lea    rax,[rip+0xfffffffffff918a1]        # afa4ae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4744e>
      b68c0d:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      b68c12:	48 8d 05 8f 00 00 00 	lea    rax,[rip+0x8f]        # b68ca8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5c48>
      b68c72:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]

### node allocation call@0xb69ae6, FDE=(11966862, 11967636)
      b69ada:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
      b69ae1:	00 00 
      b69ae3:	6a 78                	push   0x78
      b69ae5:	5f                   	pop    rdi
      b69ae6:	e8 15 44 c8 00       	call   17edf00 <_Znwm@plt>
      b69aeb:	49 89 c4             	mov    r12,rax
      b69aee:	48 8d 9c 24 90 00 00 	lea    rbx,[rsp+0x90]
      b69af5:	00 
      b69af6:	48 8b 43 98          	mov    rax,QWORD PTR [rbx-0x68]
      b69afa:	49 89 04 24          	mov    QWORD PTR [r12],rax
      b69afe:	4c 89 e7             	mov    rdi,r12
      b69b01:	48 83 c7 08          	add    rdi,0x8
      b69b05:	4c 89 fe             	mov    rsi,r15
      b69b08:	e8 27 09 b6 00       	call   16ca434 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e5a0>
      b69b0d:	8b 43 f8             	mov    eax,DWORD PTR [rbx-0x8]
      b69b10:	41 89 44 24 60       	mov    DWORD PTR [r12+0x60],eax
      b69b15:	f3 0f 6f 03          	movdqu xmm0,XMMWORD PTR [rbx]
      b69b19:	f3 41 0f 7f 44 24 68 	movdqu XMMWORD PTR [r12+0x68],xmm0
      b69b28:	4c 8d bc 24 a0 00 00 	lea    r15,[rsp+0xa0]
      b69c0d:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]

### node allocation call@0xbcfec2, FDE=(12385942, 12389145)
      bcfeb3:	00 00 
      bcfeb5:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
      bcfebc:	00 
      bcfebd:	bf b0 00 00 00       	mov    edi,0xb0
      bcfec2:	e8 39 e0 c1 00       	call   17edf00 <_Znwm@plt>
      bcfec7:	49 89 c5             	mov    r13,rax
      bcfeca:	48 89 c7             	mov    rdi,rax
      bcfecd:	31 f6                	xor    esi,esi
      bcfecf:	e8 16 fd a7 00       	call   164fbea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d56>
      bcfed4:	48 8d 44 24 28       	lea    rax,[rsp+0x28]
      bcfed9:	4c 89 28             	mov    QWORD PTR [rax],r13
      bcfedc:	4d 8d 77 50          	lea    r14,[r15+0x50]
      bcfee0:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      bcfee4:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
      bcfee9:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
      bcfeef:	0f 57 c0             	xorps  xmm0,xmm0
      bcfef2:	41 80 4d 10 20       	or     BYTE PTR [r13+0x10],0x20
      bcfef7:	0f 11 44 24 10       	movups XMMWORD PTR [rsp+0x10],xmm0

### node allocation call@0xbf7de6, FDE=(12548726, 12550203)
      bf7dd4:	4c 89 2c 24          	mov    QWORD PTR [rsp],r13
      bf7dd8:	48 83 a4 24 a0 02 00 	and    QWORD PTR [rsp+0x2a0],0x0
      bf7ddf:	00 00 
      bf7de1:	bf b0 00 00 00       	mov    edi,0xb0
      bf7de6:	e8 15 61 bf 00       	call   17edf00 <_Znwm@plt>
      bf7deb:	49 89 c7             	mov    r15,rax
      bf7dee:	48 8d 05 13 b9 c1 00 	lea    rax,[rip+0xc1b913]        # 1813708 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x93c8>
      bf7df5:	49 89 07             	mov    QWORD PTR [r15],rax
      bf7df8:	49 8d 7f 10          	lea    rdi,[r15+0x10]
      bf7dfc:	4c 8d ac 24 e0 01 00 	lea    r13,[rsp+0x1e0]
      bf7e03:	00 
      bf7e04:	4c 89 ee             	mov    rsi,r13
      bf7e07:	e8 0c 0f 00 00       	call   bf8d18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x145cb8>
      bf7e0c:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
      bf7e11:	49 89 47 50          	mov    QWORD PTR [r15+0x50],rax
      bf7e15:	41 0f 28 04 24       	movaps xmm0,XMMWORD PTR [r12]
      bf7e1a:	41 0f 29 47 40       	movaps XMMWORD PTR [r15+0x40],xmm0

### node allocation call@0xbf8e36, FDE=(12553752, 12553914)
      bf8e26:	00 00 
      bf8e28:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      bf8e2d:	4c 8d 77 10          	lea    r14,[rdi+0x10]
      bf8e31:	bf b0 00 00 00       	mov    edi,0xb0
      bf8e36:	e8 c5 50 bf 00       	call   17edf00 <_Znwm@plt>
      bf8e3b:	48 89 c3             	mov    rbx,rax
      bf8e3e:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      bf8e42:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
      bf8e47:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      bf8e4c:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
      bf8e53:	00 00 
      bf8e55:	48 8d 05 ac a8 c1 00 	lea    rax,[rip+0xc1a8ac]        # 1813708 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x93c8>
      bf8e5c:	48 89 03             	mov    QWORD PTR [rbx],rax
      bf8e5f:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
      bf8e63:	4c 89 f6             	mov    rsi,r14
      bf8e66:	e8 b1 04 00 00       	call   bf931c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1462bc>
      bf8e6b:	48 89 e7             	mov    rdi,rsp

### node allocation call@0xc0709c, FDE=(12606752, 12612174)
      c07088:	66 0f 7e ab b0 00 00 	movd   DWORD PTR [rbx+0xb0],xmm5
      c0708f:	00 
      c07090:	48 89 83 b8 00 00 00 	mov    QWORD PTR [rbx+0xb8],rax
      c07097:	bf b8 00 00 00       	mov    edi,0xb8
      c0709c:	e8 5f 6e be 00       	call   17edf00 <_Znwm@plt>
      c070a1:	49 89 c6             	mov    r14,rax
      c070a4:	48 8d 05 cd ea c6 00 	lea    rax,[rip+0xc6eacd]        # 1875b78 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32260>
      c070ab:	49 89 06             	mov    QWORD PTR [r14],rax
      c070ae:	4c 89 f7             	mov    rdi,r14
      c070b1:	48 83 c7 08          	add    rdi,0x8
      c070b5:	ba b0 00 00 00       	mov    edx,0xb0
      c070ba:	48 8b b4 24 a0 00 00 	mov    rsi,QWORD PTR [rsp+0xa0]
      c070c1:	00 
      c070c2:	e8 09 8a be 00       	call   17efad0 <memcpy@plt>
      c070c7:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
      c070ce:	00 
      c070cf:	48 8b 38             	mov    rdi,QWORD PTR [rax]

### node allocation call@0xc080d6, FDE=(12613480, 12617340)
      c080c6:	00 00 
      c080c8:	48 85 db             	test   rbx,rbx
      c080cb:	0f 84 7e 04 00 00    	je     c0854f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1554ef>
      c080d1:	bf b0 00 00 00       	mov    edi,0xb0
      c080d6:	e8 25 5e be 00       	call   17edf00 <_Znwm@plt>
      c080db:	49 89 c6             	mov    r14,rax
      c080de:	48 89 18             	mov    QWORD PTR [rax],rbx
      c080e1:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
      c080e5:	49 89 c7             	mov    r15,rax
      c080e8:	49 81 c7 98 00 00 00 	add    r15,0x98
      c080ef:	66 0f ef c0          	pxor   xmm0,xmm0
      c080f3:	f3 0f 7f 80 98 00 00 	movdqu XMMWORD PTR [rax+0x98],xmm0
      c080fa:	00 
      c080fb:	48 83 a0 a8 00 00 00 	and    QWORD PTR [rax+0xa8],0x0
      c08102:	00 
      c08103:	48 89 df             	mov    rdi,rbx
      c08106:	e8 68 0f 00 00       	call   c09073 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x156013>
      c0810b:	85 c0                	test   eax,eax
      c08128:	4c 8d bc 24 a0 00 00 	lea    r15,[rsp+0xa0]
      c0815e:	4c 8d ac 24 a8 00 00 	lea    r13,[rsp+0xa8]

### node allocation call@0xc10e26, FDE=(12651816, 12654332)
      c10e1b:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      c10e22:	00 
      c10e23:	6a 60                	push   0x60
      c10e25:	5f                   	pop    rdi
      c10e26:	e8 d5 d0 bd 00       	call   17edf00 <_Znwm@plt>
      c10e2b:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
      c10e2f:	48 8d 0d 22 4d c0 00 	lea    rcx,[rip+0xc04d22]        # 1815b58 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xb818>
      c10e36:	48 89 08             	mov    QWORD PTR [rax],rcx
      c10e39:	48 8d 48 10          	lea    rcx,[rax+0x10]
      c10e3d:	48 89 4c 24 68       	mov    QWORD PTR [rsp+0x68],rcx
      c10e42:	4c 8d 70 18          	lea    r14,[rax+0x18]
      c10e46:	48 8d 48 20          	lea    rcx,[rax+0x20]
      c10e4a:	48 89 4c 24 60       	mov    QWORD PTR [rsp+0x60],rcx
      c10e4f:	48 89 c1             	mov    rcx,rax
      c10e52:	48 83 c1 30          	add    rcx,0x30
      c10e56:	48 89 4c 24 58       	mov    QWORD PTR [rsp+0x58],rcx
      c10e5b:	48 83 60 50 00       	and    QWORD PTR [rax+0x50],0x0
      c10f56:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
      c10f75:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax

### node allocation call@0xc1bd60, FDE=(12696890, 12696957)
      c1bd53:	48 89 c7             	mov    rdi,rax
      c1bd56:	4c 89 f6             	mov    rsi,r14
      c1bd59:	eb 12                	jmp    c1bd6d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x168d0d>
      c1bd5b:	bf b0 00 00 00       	mov    edi,0xb0
      c1bd60:	e8 9b 21 bd 00       	call   17edf00 <_Znwm@plt>
      c1bd65:	48 89 c3             	mov    rbx,rax
      c1bd68:	48 89 c7             	mov    rdi,rax
      c1bd6b:	31 f6                	xor    esi,esi
      c1bd6d:	e8 ce 01 aa 00       	call   16bbf40 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x700ac>
      c1bd72:	48 89 d8             	mov    rax,rbx
      c1bd75:	48 83 c4 08          	add    rsp,0x8
      c1bd79:	5b                   	pop    rbx
      c1bd7a:	41 5e                	pop    r14
      c1bd7c:	c3                   	ret

### node allocation call@0xc2c0ac, FDE=(12763280, 12763683)
      c2c099:	48 89 fb             	mov    rbx,rdi
      c2c09c:	0f 18 4f 40          	prefetcht0 BYTE PTR [rdi+0x40]
      c2c0a0:	0f 18 8f 80 00 00 00 	prefetcht0 BYTE PTR [rdi+0x80]
      c2c0a7:	bf b0 00 00 00       	mov    edi,0xb0
      c2c0ac:	e8 4f 1e bc 00       	call   17edf00 <_Znwm@plt>
      c2c0b1:	49 89 c4             	mov    r12,rax
      c2c0b4:	49 89 c6             	mov    r14,rax
      c2c0b7:	48 83 60 08 00       	and    QWORD PTR [rax+0x8],0x0
      c2c0bc:	48 8d 05 75 8a c7 00 	lea    rax,[rip+0xc78a75]        # 18a4b38 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x11a78>
      c2c0c3:	49 89 04 24          	mov    QWORD PTR [r12],rax
      c2c0c7:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
      c2c0cb:	40 f6 c6 01          	test   sil,0x1
      c2c0cf:	74 12                	je     c2c0e3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179083>
      c2c0d1:	49 8d 7c 24 08       	lea    rdi,[r12+0x8]
      c2c0d6:	48 83 e6 fe          	and    rsi,0xfffffffffffffffe
      c2c0da:	48 83 c6 08          	add    rsi,0x8
      c2c0de:	e8 1d 24 b2 00       	call   174e500 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10266c>
      c2c1da:	0f 10 83 a0 00 00 00 	movups xmm0,XMMWORD PTR [rbx+0xa0]
      c2c1e1:	41 0f 11 86 a0 00 00 	movups XMMWORD PTR [r14+0xa0],xmm0

### node allocation call@0xc317ae, FDE=(12785532, 12785637)
      c3179f:	5d 74 01 
      c317a2:	49 39 c6             	cmp    r14,rax
      c317a5:	73 39                	jae    c317e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17e780>
      c317a7:	49 69 fe b0 00 00 00 	imul   rdi,r14,0xb0
      c317ae:	e8 4d c7 bb 00       	call   17edf00 <_Znwm@plt>
      c317b3:	eb 02                	jmp    c317b7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17e757>
      c317b5:	31 c0                	xor    eax,eax
      c317b7:	48 89 03             	mov    QWORD PTR [rbx],rax
      c317ba:	49 69 cf b0 00 00 00 	imul   rcx,r15,0xb0
      c317c1:	48 01 c1             	add    rcx,rax
      c317c4:	48 89 4b 10          	mov    QWORD PTR [rbx+0x10],rcx
      c317c8:	48 89 4b 08          	mov    QWORD PTR [rbx+0x8],rcx
      c317cc:	49 69 ce b0 00 00 00 	imul   rcx,r14,0xb0
      c317d3:	48 01 c1             	add    rcx,rax
      c317d6:	48 89 4b 18          	mov    QWORD PTR [rbx+0x18],rcx
      c317da:	5b                   	pop    rbx
      c317db:	41 5e                	pop    r14
      c317dd:	41 5f                	pop    r15
      c317df:	c3                   	ret
      c317e0:	e8 fa 9e e4 ff       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>

### node allocation call@0xc47d6b, FDE=(12877108, 12879381)
      c47d5c:	00 00 
      c47d5e:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
      c47d65:	00 
      c47d66:	bf b0 00 00 00       	mov    edi,0xb0
      c47d6b:	e8 90 61 ba 00       	call   17edf00 <_Znwm@plt>
      c47d70:	49 89 c6             	mov    r14,rax
      c47d73:	49 89 c5             	mov    r13,rax
      c47d76:	0f 57 c0             	xorps  xmm0,xmm0
      c47d79:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      c47d7d:	48 8d 05 44 30 bc 00 	lea    rax,[rip+0xbc3044]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
      c47d84:	49 89 06             	mov    QWORD PTR [r14],rax
      c47d87:	4d 8d 7e 20          	lea    r15,[r14+0x20]
      c47d8b:	ba 90 00 00 00       	mov    edx,0x90
      c47d90:	4c 89 ff             	mov    rdi,r15
      c47d93:	31 f6                	xor    esi,esi
      c47d95:	e8 f6 6d ba 00       	call   17eeb90 <memset@plt>
      c47d9a:	48 8d 05 67 10 bd 00 	lea    rax,[rip+0xbd1067]        # 1818e08 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xeac8>
      c47dd3:	4d 89 b6 a0 00 00 00 	mov    QWORD PTR [r14+0xa0],r14

### node allocation call@0xc7ce98, FDE=(13094498, 13094835)
      c7ce87:	4c 8b 78 20          	mov    r15,QWORD PTR [rax+0x20]
      c7ce8b:	4c 8b 60 28          	mov    r12,QWORD PTR [rax+0x28]
      c7ce8f:	48 8b 58 30          	mov    rbx,QWORD PTR [rax+0x30]
      c7ce93:	bf b0 00 00 00       	mov    edi,0xb0
      c7ce98:	e8 63 10 b7 00       	call   17edf00 <_Znwm@plt>
      c7ce9d:	49 89 c6             	mov    r14,rax
      c7cea0:	4d 8b 3f             	mov    r15,QWORD PTR [r15]
      c7cea3:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
      c7cea7:	48 8d 35 49 71 6a ff 	lea    rsi,[rip+0xffffffffff6a7149]        # 323ff7 <_ZTSSt12bad_any_cast@@Base-0x6c1d1>
      c7ceae:	48 89 c7             	mov    rdi,rax
      c7ceb1:	e8 1a 6d 96 00       	call   15e3bd0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x429154>
      c7ceb6:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
      c7cebb:	48 8d 05 9e f0 b9 00 	lea    rax,[rip+0xb9f09e]        # 181bf60 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11c20>
      c7cec2:	49 89 06             	mov    QWORD PTR [r14],rax
      c7cec5:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
      c7ceca:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
      c7cf1e:	41 0f 11 86 a0 00 00 	movups XMMWORD PTR [r14+0xa0],xmm0

### node allocation call@0xca19f9, FDE=(13243220, 13246437)
      ca19e9:	49 89 ef             	mov    r15,rbp
      ca19ec:	48 8d ac 24 70 01 00 	lea    rbp,[rsp+0x170]
      ca19f3:	00 
      ca19f4:	bf b0 00 00 00       	mov    edi,0xb0
      ca19f9:	e8 02 c5 b4 00       	call   17edf00 <_Znwm@plt>
      ca19fe:	49 89 c6             	mov    r14,rax
      ca1a01:	49 8d 44 24 28       	lea    rax,[r12+0x28]
      ca1a06:	49 83 26 00          	and    QWORD PTR [r14],0x0
      ca1a0a:	4c 89 b4 24 88 01 00 	mov    QWORD PTR [rsp+0x188],r14
      ca1a11:	00 
      ca1a12:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ca1a17:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax
      ca1a1e:	00 
      ca1a1f:	4d 89 7e 08          	mov    QWORD PTR [r14+0x8],r15
      ca1a23:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
      ca1a28:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      ca1a2c:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
      ca1aa8:	49 89 86 a8 00 00 00 	mov    QWORD PTR [r14+0xa8],rax

### node allocation call@0xcd08fc, FDE=(13437026, 13440523)
      cd08ea:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
      cd08f0:	48 89 c3             	mov    rbx,rax
      cd08f3:	49 8b 6e 18          	mov    rbp,QWORD PTR [r14+0x18]
      cd08f7:	bf 80 00 00 00       	mov    edi,0x80
      cd08fc:	e8 ff d5 b1 00       	call   17edf00 <_Znwm@plt>
      cd0901:	49 89 c7             	mov    r15,rax
      cd0904:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      cd090b:	00 
      cd090c:	4c 89 e6             	mov    rsi,r12
      cd090f:	e8 7c 99 da ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      cd0914:	4c 8b a4 24 b0 09 00 	mov    r12,QWORD PTR [rsp+0x9b0]
      cd091b:	00 
      cd091c:	48 8b 8c 24 98 09 00 	mov    rcx,QWORD PTR [rsp+0x998]
      cd0923:	00 
      cd0924:	48 8d 05 ed f1 b4 00 	lea    rax,[rip+0xb4f1ed]        # 181fb18 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x157d8>
      cd092b:	49 89 07             	mov    QWORD PTR [r15],rax
      cd092e:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
      cd0992:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
      cd09a8:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax

### node allocation call@0xcf610e, FDE=(13590398, 13591214)
      cf6102:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
      cf6109:	00 00 
      cf610b:	6a 50                	push   0x50
      cf610d:	5f                   	pop    rdi
      cf610e:	e8 ed 7d af 00       	call   17edf00 <_Znwm@plt>
      cf6113:	49 89 c5             	mov    r13,rax
      cf6116:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      cf611b:	48 8d 44 24 67       	lea    rax,[rsp+0x67]
      cf6120:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
      cf6125:	48 c7 44 24 58 01 00 	mov    QWORD PTR [rsp+0x58],0x1
      cf612c:	00 00 
      cf612e:	48 8d 05 eb af b2 00 	lea    rax,[rip+0xb2afeb]        # 1821120 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x16de0>
      cf6135:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      cf6139:	4c 89 ef             	mov    rdi,r13
      cf613c:	48 83 c7 10          	add    rdi,0x10
      cf6140:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
      cf61af:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]

### node allocation call@0xd3b0ef, FDE=(13873330, 13873958)
      d3b0e0:	00 00 
      d3b0e2:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
      d3b0e9:	00 
      d3b0ea:	bf b0 00 00 00       	mov    edi,0xb0
      d3b0ef:	e8 0c 2e ab 00       	call   17edf00 <_Znwm@plt>
      d3b0f4:	49 89 c7             	mov    r15,rax
      d3b0f7:	0f 57 c0             	xorps  xmm0,xmm0
      d3b0fa:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      d3b0fe:	48 8d 05 fb 92 ae 00 	lea    rax,[rip+0xae92fb]        # 1824400 <_ZTIN4asio2ip16bad_address_castE@@Base+0xa30>
      d3b105:	49 89 07             	mov    QWORD PTR [r15],rax
      d3b108:	41 0f 29 47 30       	movaps XMMWORD PTR [r15+0x30],xmm0
      d3b10d:	41 0f 29 47 40       	movaps XMMWORD PTR [r15+0x40],xmm0
      d3b112:	41 0f 29 47 50       	movaps XMMWORD PTR [r15+0x50],xmm0
      d3b117:	41 0f 29 47 60       	movaps XMMWORD PTR [r15+0x60],xmm0
      d3b11c:	41 0f 29 47 70       	movaps XMMWORD PTR [r15+0x70],xmm0
      d3b121:	41 0f 29 87 80 00 00 	movaps XMMWORD PTR [r15+0x80],xmm0
      d3b131:	41 0f 29 87 a0 00 00 	movaps XMMWORD PTR [r15+0xa0],xmm0

### node allocation call@0xd45a0f, FDE=(13916678, 13916752)

### node allocation call@0xd461b3, FDE=(13918634, 13918708)

### node allocation call@0xd606f7, FDE=(14026384, 14027153)
      d606eb:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
      d606f2:	00 00 
      d606f4:	6a 50                	push   0x50
      d606f6:	5f                   	pop    rdi
      d606f7:	e8 04 d8 a8 00       	call   17edf00 <_Znwm@plt>
      d606fc:	49 89 c4             	mov    r12,rax
      d606ff:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
      d60704:	48 8d 44 24 24       	lea    rax,[rsp+0x24]
      d60709:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
      d6070e:	48 c7 44 24 38 01 00 	mov    QWORD PTR [rsp+0x38],0x1
      d60715:	00 00 
      d60717:	48 8d 05 0a 5a ac 00 	lea    rax,[rip+0xac5a0a]        # 1826128 <_ZTIN4asio2ip16bad_address_castE@@Base+0x2758>
      d6071e:	49 89 04 24          	mov    QWORD PTR [r12],rax
      d60722:	4c 8d 74 24 60       	lea    r14,[rsp+0x60]
      d60727:	49 8b 46 f0          	mov    rax,QWORD PTR [r14-0x10]
      d6072b:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      d607b7:	41 c6 87 a8 00 00 00 	mov    BYTE PTR [r15+0xa8],0x1

### node allocation call@0xd64be0, FDE=(14043990, 14044418)
      d64bd4:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
      d64bdb:	00 00 
      d64bdd:	6a 50                	push   0x50
      d64bdf:	5f                   	pop    rdi
      d64be0:	e8 1b 93 a8 00       	call   17edf00 <_Znwm@plt>
      d64be5:	49 89 c7             	mov    r15,rax
      d64be8:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
      d64bed:	48 8d 44 24 4f       	lea    rax,[rsp+0x4f]
      d64bf2:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
      d64bf7:	48 c7 44 24 40 01 00 	mov    QWORD PTR [rsp+0x40],0x1
      d64bfe:	00 00 
      d64c00:	48 8d 05 11 1b ac 00 	lea    rax,[rip+0xac1b11]        # 1826718 <_ZTIN4asio2ip16bad_address_castE@@Base+0x2d48>
      d64c07:	49 89 07             	mov    QWORD PTR [r15],rax
      d64c0a:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
      d64c0f:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
      d64c13:	4c 89 ff             	mov    rdi,r15

### node allocation call@0xda0b7f, FDE=(14289412, 14290282)
      da0b73:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
      da0b7a:	00 00 
      da0b7c:	6a 50                	push   0x50
      da0b7e:	5f                   	pop    rdi
      da0b7f:	e8 7c d3 a4 00       	call   17edf00 <_Znwm@plt>
      da0b84:	49 89 c4             	mov    r12,rax
      da0b87:	48 8d 44 24 58       	lea    rax,[rsp+0x58]
      da0b8c:	0f 28 40 f8          	movaps xmm0,XMMWORD PTR [rax-0x8]
      da0b90:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
      da0b95:	48 8b 48 08          	mov    rcx,QWORD PTR [rax+0x8]
      da0b99:	49 89 4c 24 10       	mov    QWORD PTR [r12+0x10],rcx
      da0b9e:	0f 57 c0             	xorps  xmm0,xmm0
      da0ba1:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      da0ba4:	4c 89 e7             	mov    rdi,r12
      da0ba7:	48 83 c7 20          	add    rdi,0x20
      da0bab:	4c 89 ee             	mov    rsi,r13
      da0bae:	e8 dd 96 cd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      da0bb3:	4c 89 a4 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r12
      da0be1:	48 8d 8c 24 a0 00 00 	lea    rcx,[rsp+0xa0]
      da0c2b:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
      da0ccf:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]

### node allocation call@0xdebdad, FDE=(14596108, 14619287)
      debd9b:	48 8d bc 24 e0 07 00 	lea    rdi,[rsp+0x7e0]
      debda2:	00 
      debda3:	e8 fe da 7f 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
      debda8:	bf b0 00 00 00       	mov    edi,0xb0
      debdad:	e8 4e 21 a0 00       	call   17edf00 <_Znwm@plt>
      debdb2:	49 89 c4             	mov    r12,rax
      debdb5:	48 8b 9c 24 78 14 00 	mov    rbx,QWORD PTR [rsp+0x1478]
      debdbc:	00 
      debdbd:	4c 8b b4 24 30 14 00 	mov    r14,QWORD PTR [rsp+0x1430]
      debdc4:	00 
      debdc5:	66 0f ef c0          	pxor   xmm0,xmm0
      debdc9:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      debdce:	48 8d 05 6b fb a3 00 	lea    rax,[rip+0xa3fb6b]        # 182b940 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7f70>
      debdd5:	49 89 04 24          	mov    QWORD PTR [r12],rax
      debdd9:	49 8d 6c 24 18       	lea    rbp,[r12+0x18]
      debdde:	4d 89 74 24 18       	mov    QWORD PTR [r12+0x18],r14
      debe38:	49 8d bc 24 a0 00 00 	lea    rdi,[r12+0xa0]
      debee7:	48 8b 9c 24 a8 00 00 	mov    rbx,QWORD PTR [rsp+0xa8]

### node allocation call@0xded1d7, FDE=(14596108, 14619287)
      ded1c3:	41 88 85 f8 02 00 00 	mov    BYTE PTR [r13+0x2f8],al
      ded1ca:	bf 40 16 00 00       	mov    edi,0x1640
      ded1cf:	4c 89 ac 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],r13
      ded1d6:	00 
      ded1d7:	e8 24 0d a0 00       	call   17edf00 <_Znwm@plt>
      ded1dc:	48 89 c5             	mov    rbp,rax
      ded1df:	4c 89 f1             	mov    rcx,r14
      ded1e2:	48 83 c1 08          	add    rcx,0x8
      ded1e6:	66 0f ef c0          	pxor   xmm0,xmm0
      ded1ea:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      ded1ef:	48 8d 05 d2 db a1 00 	lea    rax,[rip+0xa1dbd2]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
      ded1f6:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
      ded1fa:	48 89 8c 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rcx
      ded201:	00 
      ded202:	f0 48 ff 01          	lock inc QWORD PTR [rcx]
      ded206:	4c 89 f8             	mov    rax,r15
      ded209:	48 8b 8c 24 a0 00 00 	mov    rcx,QWORD PTR [rsp+0xa0]
      ded247:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
      ded342:	48 8d bd a0 00 00 00 	lea    rdi,[rbp+0xa0]

### node allocation call@0xe14f02, FDE=(14765174, 14767580)
      e14ef2:	00 00 
      e14ef4:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
      e14efb:	00 00 
      e14efd:	bf 50 0f 00 00       	mov    edi,0xf50
      e14f02:	e8 f9 8f 9d 00       	call   17edf00 <_Znwm@plt>
      e14f07:	49 89 c6             	mov    r14,rax
      e14f0a:	48 81 c3 68 12 00 00 	add    rbx,0x1268
      e14f11:	4c 8d bc 24 20 1f 00 	lea    r15,[rsp+0x1f20]
      e14f18:	00 
      e14f19:	48 89 c7             	mov    rdi,rax
      e14f1c:	4c 89 fe             	mov    rsi,r15
      e14f1f:	e8 18 08 00 00       	call   e1573c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe27c2>
      e14f24:	4c 8d a4 24 a0 00 00 	lea    r12,[rsp+0xa0]
      e14f2b:	00 
      e14f2c:	4d 89 34 24          	mov    QWORD PTR [r12],r14
      e14f30:	48 8d 05 a3 08 00 00 	lea    rax,[rip+0x8a3]        # e157da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe2860>
      e14f37:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      e15071:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]

### node allocation call@0xe252d1, FDE=(14830970, 14834141)
      e252c1:	00 00 
      e252c3:	48 83 a4 24 00 03 00 	and    QWORD PTR [rsp+0x300],0x0
      e252ca:	00 00 
      e252cc:	bf b0 00 00 00       	mov    edi,0xb0
      e252d1:	e8 2a 8c 9c 00       	call   17edf00 <_Znwm@plt>
      e252d6:	48 89 c5             	mov    rbp,rax
      e252d9:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
      e252de:	48 89 c7             	mov    rdi,rax
      e252e1:	e8 94 09 00 00       	call   e25c7a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf2d00>
      e252e6:	48 8d 9c 24 f0 02 00 	lea    rbx,[rsp+0x2f0]
      e252ed:	00 
      e252ee:	48 89 2b             	mov    QWORD PTR [rbx],rbp
      e252f1:	48 8d 05 00 0b 00 00 	lea    rax,[rip+0xb00]        # e25df8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf2e7e>
      e252f8:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      e252fc:	48 8d 05 21 0b 00 00 	lea    rax,[rip+0xb21]        # e25e24 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf2eaa>
      e25303:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax

### node allocation call@0xe2c7cc, FDE=(14862246, 14862313)
      e2c7bf:	48 89 c7             	mov    rdi,rax
      e2c7c2:	4c 89 f6             	mov    rsi,r14
      e2c7c5:	eb 12                	jmp    e2c7d9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf985f>
      e2c7c7:	bf b0 00 00 00       	mov    edi,0xb0
      e2c7cc:	e8 2f 17 9c 00       	call   17edf00 <_Znwm@plt>
      e2c7d1:	48 89 c3             	mov    rbx,rax
      e2c7d4:	48 89 c7             	mov    rdi,rax
      e2c7d7:	31 f6                	xor    esi,esi
      e2c7d9:	e8 e2 39 6e 00       	call   15101c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x355744>
      e2c7de:	48 89 d8             	mov    rax,rbx
      e2c7e1:	48 83 c4 08          	add    rsp,0x8
      e2c7e5:	5b                   	pop    rbx
      e2c7e6:	41 5e                	pop    r14
      e2c7e8:	c3                   	ret

### node allocation call@0xe3a4e1, FDE=(14918829, 14919177)
      e3a4cf:	49 89 c7             	mov    r15,rax
      e3a4d2:	48 8d 05 6f 3a 9f 00 	lea    rax,[rip+0x9f3a6f]        # 182df48 <_ZTIN4asio2ip16bad_address_castE@@Base+0xa578>
      e3a4d9:	49 89 07             	mov    QWORD PTR [r15],rax
      e3a4dc:	bf b0 00 00 00       	mov    edi,0xb0
      e3a4e1:	e8 1a 3a 9b 00       	call   17edf00 <_Znwm@plt>
      e3a4e6:	49 89 c6             	mov    r14,rax
      e3a4e9:	48 8d 05 80 3a 9f 00 	lea    rax,[rip+0x9f3a80]        # 182df70 <_ZTIN4asio2ip16bad_address_castE@@Base+0xa5a0>
      e3a4f0:	49 89 06             	mov    QWORD PTR [r14],rax
      e3a4f3:	4d 89 7e 08          	mov    QWORD PTR [r14+0x8],r15
      e3a4f7:	4d 8d 7e 10          	lea    r15,[r14+0x10]
      e3a4fb:	4c 89 ff             	mov    rdi,r15
      e3a4fe:	e8 c9 72 c7 ff       	call   ab17cc <JNI_OnUnload@@Base+0x39099>
      e3a503:	4d 89 7e 20          	mov    QWORD PTR [r14+0x20],r15
      e3a507:	41 c6 46 28 01       	mov    BYTE PTR [r14+0x28],0x1
      e3a50c:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
      e3a510:	f0 48 ff 80 d0 00 00 	lock inc QWORD PTR [rax+0xd0]

### node allocation call@0xe93cdb, FDE=(15281964, 15306555)
      e93ccc:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
      e93cd1:	49 8b 9e b0 00 00 00 	mov    rbx,QWORD PTR [r14+0xb0]
      e93cd8:	6a 28                	push   0x28
      e93cda:	5f                   	pop    rdi
      e93cdb:	e8 20 a2 95 00       	call   17edf00 <_Znwm@plt>
      e93ce0:	66 0f ef c0          	pxor   xmm0,xmm0
      e93ce4:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e93ce9:	48 8d 0d e0 cb 96 00 	lea    rcx,[rip+0x96cbe0]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>
      e93cf0:	48 89 08             	mov    QWORD PTR [rax],rcx
      e93cf3:	48 8d 0d ae dd 99 00 	lea    rcx,[rip+0x99ddae]        # 1831aa8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a40>
      e93cfa:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
      e93cfe:	48 89 84 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rax
      e93d05:	00 
      e93d06:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
      e93d0a:	49 8b 86 b0 02 00 00 	mov    rax,QWORD PTR [r14+0x2b0]

### node allocation call@0xe947b0, FDE=(15281964, 15306555)
      e9479c:	48 89 ac 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rbp
      e947a3:	00 
      e947a4:	4d 8b bd 70 05 00 00 	mov    r15,QWORD PTR [r13+0x570]
      e947ab:	bf b0 00 00 00       	mov    edi,0xb0
      e947b0:	e8 4b 97 95 00       	call   17edf00 <_Znwm@plt>
      e947b5:	48 89 c3             	mov    rbx,rax
      e947b8:	66 0f ef c0          	pxor   xmm0,xmm0
      e947bc:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e947c1:	48 8d 05 a8 d2 99 00 	lea    rax,[rip+0x99d2a8]        # 1831a70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a08>
      e947c8:	48 89 03             	mov    QWORD PTR [rbx],rax
      e947cb:	4c 8d 63 18          	lea    r12,[rbx+0x18]
      e947cf:	48 8d 05 12 e4 99 00 	lea    rax,[rip+0x99e412]        # 1832be8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4b80>
      e947d6:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      e947da:	66 0f 6f 8c 24 30 0a 	movdqa xmm1,XMMWORD PTR [rsp+0xa30]
      e947e1:	00 00 
      e947e3:	f3 0f 7f 4b 20       	movdqu XMMWORD PTR [rbx+0x20],xmm1

### node allocation call@0xe9d9ce, FDE=(15310087, 15343400)
      e9d9be:	49 63 dd             	movsxd rbx,r13d
      e9d9c1:	48 89 9c 24 00 08 00 	mov    QWORD PTR [rsp+0x800],rbx
      e9d9c8:	00 
      e9d9c9:	bf b0 00 00 00       	mov    edi,0xb0
      e9d9ce:	e8 2d 05 95 00       	call   17edf00 <_Znwm@plt>
      e9d9d3:	49 89 c4             	mov    r12,rax
      e9d9d6:	48 8d 05 33 c0 99 00 	lea    rax,[rip+0x99c033]        # 1839a10 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xb9a8>
      e9d9dd:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e9d9e1:	49 8d 7c 24 10       	lea    rdi,[r12+0x10]
      e9d9e6:	4c 8d ac 24 70 07 00 	lea    r13,[rsp+0x770]
      e9d9ed:	00 
      e9d9ee:	4c 89 ee             	mov    rsi,r13
      e9d9f1:	e8 0e 8b 00 00       	call   ea6504 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d91a>
      e9d9f6:	49 8d 7c 24 40       	lea    rdi,[r12+0x40]
      e9d9fb:	4c 89 f6             	mov    rsi,r14
      e9d9fe:	e8 bf 2e 08 00       	call   f208c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe7cd8>
      e9da03:	4c 89 e7             	mov    rdi,r12
      e9da19:	49 89 84 24 a0 00 00 	mov    QWORD PTR [r12+0xa0],rax
      e9daca:	49 89 84 24 a0 00 00 	mov    QWORD PTR [r12+0xa0],rax

### node allocation call@0xe9da7f, FDE=(15310087, 15343400)
      e9da6e:	4c 89 ff             	mov    rdi,r15
      e9da71:	e8 8a 89 e2 ff       	call   cc6400 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2133a0>
      e9da76:	49 89 5f 30          	mov    QWORD PTR [r15+0x30],rbx
      e9da7a:	bf b0 00 00 00       	mov    edi,0xb0
      e9da7f:	e8 7c 04 95 00       	call   17edf00 <_Znwm@plt>
      e9da84:	49 89 c4             	mov    r12,rax
      e9da87:	48 8d 05 ca bf 99 00 	lea    rax,[rip+0x99bfca]        # 1839a58 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xb9f0>
      e9da8e:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e9da92:	49 8d 7c 24 10       	lea    rdi,[r12+0x10]
      e9da97:	4c 8d ac 24 60 10 00 	lea    r13,[rsp+0x1060]
      e9da9e:	00 
      e9da9f:	4c 89 ee             	mov    rsi,r13
      e9daa2:	e8 5d 8a 00 00       	call   ea6504 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d91a>
      e9daa7:	49 8d 7c 24 40       	lea    rdi,[r12+0x40]
      e9daac:	4c 89 f6             	mov    rsi,r14
      e9daaf:	e8 0e 2e 08 00       	call   f208c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe7cd8>
      e9dab4:	4c 89 e7             	mov    rdi,r12
      e9daca:	49 89 84 24 a0 00 00 	mov    QWORD PTR [r12+0xa0],rax

### node allocation call@0xeb4bc9, FDE=(15420310, 15420701)
      eb4bbe:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      eb4bc5:	00 
      eb4bc6:	6a 70                	push   0x70
      eb4bc8:	5f                   	pop    rdi
      eb4bc9:	e8 32 93 93 00       	call   17edf00 <_Znwm@plt>
      eb4bce:	48 89 c3             	mov    rbx,rax
      eb4bd1:	0f 57 c0             	xorps  xmm0,xmm0
      eb4bd4:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      eb4bd8:	48 8d 05 49 d6 97 00 	lea    rax,[rip+0x97d649]        # 1832228 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x41c0>
      eb4bdf:	48 89 03             	mov    QWORD PTR [rbx],rax
      eb4be2:	49 8b 07             	mov    rax,QWORD PTR [r15]
      eb4be5:	49 83 27 00          	and    QWORD PTR [r15],0x0
      eb4be9:	4c 8d 7b 18          	lea    r15,[rbx+0x18]
      eb4bed:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
      eb4bf2:	48 89 06             	mov    QWORD PTR [rsi],rax
      eb4bf5:	4d 8b 65 00          	mov    r12,QWORD PTR [r13+0x0]
      eb4bf9:	4c 89 ff             	mov    rdi,r15
      eb4bfc:	e8 57 ed e2 ff       	call   ce3958 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2308f8>

### node allocation call@0xefa978, FDE=(15700428, 15722027)
      efa969:	48 85 c0             	test   rax,rax
      efa96c:	74 05                	je     efa973 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1d89>
      efa96e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efa973:	bf b0 00 00 00       	mov    edi,0xb0
      efa978:	e8 83 35 8f 00       	call   17edf00 <_Znwm@plt>
      efa97d:	49 89 c7             	mov    r15,rax
      efa980:	0f 57 c0             	xorps  xmm0,xmm0
      efa983:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      efa987:	48 8d 05 da 2a 90 00 	lea    rax,[rip+0x902ada]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      efa98e:	49 89 07             	mov    QWORD PTR [r15],rax
      efa991:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
      efa996:	48 8d 05 33 a1 94 00 	lea    rax,[rip+0x94a133]        # 1844ad0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x11b8>
      efa99d:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efa9a1:	0f 28 44 24 70       	movaps xmm0,XMMWORD PTR [rsp+0x70]
      efa9a6:	41 0f 11 47 30       	movups XMMWORD PTR [r15+0x30],xmm0
      efa9ab:	0f 28 84 24 d0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xd0]
      efaa08:	f3 41 0f 7f 87 a0 00 	movdqu XMMWORD PTR [r15+0xa0],xmm0

### node allocation call@0xf000be, FDE=(15728817, 15728893)
      f000b3:	41 56                	push   r14
      f000b5:	53                   	push   rbx
      f000b6:	48 89 fb             	mov    rbx,rdi
      f000b9:	bf b0 00 00 00       	mov    edi,0xb0
      f000be:	e8 3d de 8e 00       	call   17edf00 <_Znwm@plt>
      f000c3:	49 89 c6             	mov    r14,rax
      f000c6:	0f 57 c0             	xorps  xmm0,xmm0
      f000c9:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f000cd:	48 8d 05 d4 66 93 00 	lea    rax,[rip+0x9366d4]        # 18367a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8740>
      f000d4:	49 89 06             	mov    QWORD PTR [r14],rax
      f000d7:	4d 8d 7e 18          	lea    r15,[r14+0x18]
      f000db:	ba 98 00 00 00       	mov    edx,0x98
      f000e0:	4c 89 ff             	mov    rdi,r15
      f000e3:	31 f6                	xor    esi,esi
      f000e5:	e8 a6 ea 8e 00       	call   17eeb90 <memset@plt>
      f000ea:	4c 89 3b             	mov    QWORD PTR [rbx],r15
      f000ed:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
      f000f1:	31 ff                	xor    edi,edi
      f000f3:	5b                   	pop    rbx

### node allocation call@0xf0035e, FDE=(15729458, 15729685)
      f0034f:	00 00 
      f00351:	48 89 84 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rax
      f00358:	00 
      f00359:	bf b0 00 00 00       	mov    edi,0xb0
      f0035e:	e8 9d db 8e 00       	call   17edf00 <_Znwm@plt>
      f00363:	49 89 c6             	mov    r14,rax
      f00366:	0f 57 c0             	xorps  xmm0,xmm0
      f00369:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f0036d:	48 8d 05 34 64 93 00 	lea    rax,[rip+0x936434]        # 18367a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8740>
      f00374:	49 89 06             	mov    QWORD PTR [r14],rax
      f00377:	4d 89 f7             	mov    r15,r14
      f0037a:	49 83 c7 18          	add    r15,0x18
      f0037e:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
      f00383:	4c 89 ef             	mov    rdi,r13
      f00386:	4c 89 e6             	mov    rsi,r12
      f00389:	e8 56 04 7d 00       	call   16d07e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84950>
      f0038e:	41 c6 86 a8 00 00 00 	mov    BYTE PTR [r14+0xa8],0x0

### node allocation call@0xf0f414, FDE=(15791044, 15791432)
      f0f408:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
      f0f40f:	00 00 
      f0f411:	6a 28                	push   0x28
      f0f413:	5f                   	pop    rdi
      f0f414:	e8 e7 ea 8d 00       	call   17edf00 <_Znwm@plt>
      f0f419:	49 89 c7             	mov    r15,rax
      f0f41c:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      f0f421:	48 8d 44 24 2f       	lea    rax,[rsp+0x2f]
      f0f426:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
      f0f42b:	48 c7 44 24 70 01 00 	mov    QWORD PTR [rsp+0x70],0x1
      f0f432:	00 00 
      f0f434:	48 8d 05 3d 92 92 00 	lea    rax,[rip+0x92923d]        # 1838678 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xa610>
      f0f43b:	49 89 07             	mov    QWORD PTR [r15],rax
      f0f43e:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      f0f443:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
      f0f447:	4c 89 ff             	mov    rdi,r15

### node allocation call@0xf1294a, FDE=(15804532, 15805036)
      f1293e:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
      f12945:	00 00 
      f12947:	6a 20                	push   0x20
      f12949:	5f                   	pop    rdi
      f1294a:	e8 b1 b5 8d 00       	call   17edf00 <_Znwm@plt>
      f1294f:	48 8d 0d a2 61 92 00 	lea    rcx,[rip+0x9261a2]        # 1838af8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xaa90>
      f12956:	48 89 08             	mov    QWORD PTR [rax],rcx
      f12959:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
      f1295d:	66 0f 6f 04 24       	movdqa xmm0,XMMWORD PTR [rsp]
      f12962:	f3 0f 7f 40 10       	movdqu XMMWORD PTR [rax+0x10],xmm0
      f12967:	48 8d 94 24 90 00 00 	lea    rdx,[rsp+0x90]
      f1296e:	00 
      f1296f:	48 89 42 20          	mov    QWORD PTR [rdx+0x20],rax
      f12973:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
      f12978:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      f1297d:	48 8d 35 9c 76 43 ff 	lea    rsi,[rip+0xffffffffff43769c]        # 34a020 <_ZTSSt12bad_any_cast@@Base-0x461a8>

### node allocation call@0xf2094a, FDE=(15862060, 15862222)
      f2093a:	00 00 
      f2093c:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      f20941:	4c 8d 77 10          	lea    r14,[rdi+0x10]
      f20945:	bf b0 00 00 00       	mov    edi,0xb0
      f2094a:	e8 b1 d5 8c 00       	call   17edf00 <_Znwm@plt>
      f2094f:	48 89 c3             	mov    rbx,rax
      f20952:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      f20956:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
      f2095b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      f20960:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
      f20967:	00 00 
      f20969:	48 8d 05 e8 90 91 00 	lea    rax,[rip+0x9190e8]        # 1839a58 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xb9f0>
      f20970:	48 89 03             	mov    QWORD PTR [rbx],rax
      f20973:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
      f20977:	4c 89 f6             	mov    rsi,r14
      f2097a:	e8 cb 13 00 00       	call   f21d4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe9160>
      f2097f:	48 89 e7             	mov    rdi,rsp

### node allocation call@0xf21df0, FDE=(15867346, 15867508)
      f21de0:	00 00 
      f21de2:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      f21de7:	4c 8d 77 10          	lea    r14,[rdi+0x10]
      f21deb:	bf b0 00 00 00       	mov    edi,0xb0
      f21df0:	e8 0b c1 8c 00       	call   17edf00 <_Znwm@plt>
      f21df5:	48 89 c3             	mov    rbx,rax
      f21df8:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      f21dfc:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
      f21e01:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      f21e06:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
      f21e0d:	00 00 
      f21e0f:	48 8d 05 fa 7b 91 00 	lea    rax,[rip+0x917bfa]        # 1839a10 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xb9a8>
      f21e16:	48 89 03             	mov    QWORD PTR [rbx],rax
      f21e19:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
      f21e1d:	4c 89 f6             	mov    rsi,r14
      f21e20:	e8 81 03 00 00       	call   f221a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe95bc>
      f21e25:	48 89 e7             	mov    rdi,rsp

### node allocation call@0xf5b344, FDE=(16101741, 16104200)
      f5b336:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
      f5b33a:	4d 85 e4             	test   r12,r12
      f5b33d:	75 b7                	jne    f5b2f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12270c>
      f5b33f:	bf b0 00 00 00       	mov    edi,0xb0
      f5b344:	e8 b7 2b 89 00       	call   17edf00 <_Znwm@plt>
      f5b349:	48 89 c3             	mov    rbx,rax
      f5b34c:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
      f5b351:	48 83 20 00          	and    QWORD PTR [rax],0x0
      f5b355:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      f5b35a:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      f5b35f:	c6 44 24 68 00       	mov    BYTE PTR [rsp+0x68],0x0
      f5b364:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
      f5b368:	4c 8d 63 10          	lea    r12,[rbx+0x10]
      f5b36c:	4c 89 e7             	mov    rdi,r12
      f5b36f:	48 89 ee             	mov    rsi,rbp
      f5b372:	e8 c9 2b 89 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      f5b377:	48 83 c3 28          	add    rbx,0x28

### node allocation call@0xf5d258, FDE=(16108396, 16111151)
      f5d248:	4c 89 ef             	mov    rdi,r13
      f5d24b:	4c 89 e6             	mov    rsi,r12
      f5d24e:	e8 63 1a ff ff       	call   f4ecb6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1160cc>
      f5d253:	bf b0 00 00 00       	mov    edi,0xb0
      f5d258:	e8 a3 0c 89 00       	call   17edf00 <_Znwm@plt>
      f5d25d:	49 89 c4             	mov    r12,rax
      f5d260:	48 8d 84 24 40 05 00 	lea    rax,[rsp+0x540]
      f5d267:	00 
      f5d268:	48 8b 48 f0          	mov    rcx,QWORD PTR [rax-0x10]
      f5d26c:	49 89 4c 24 10       	mov    QWORD PTR [r12+0x10],rcx
      f5d271:	48 8b 48 f8          	mov    rcx,QWORD PTR [rax-0x8]
      f5d275:	49 89 4c 24 18       	mov    QWORD PTR [r12+0x18],rcx
      f5d27a:	48 85 c9             	test   rcx,rcx
      f5d27d:	74 05                	je     f5d284 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12469a>
      f5d27f:	f0 48 ff 41 10       	lock inc QWORD PTR [rcx+0x10]
      f5d284:	0f 10 84 24 40 05 00 	movups xmm0,XMMWORD PTR [rsp+0x540]
      f5d28b:	00 
      f5d28c:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0

### node allocation call@0xf62f2d, FDE=(16133549, 16134512)
      f62f1e:	4d 85 e4             	test   r12,r12
      f62f21:	75 b7                	jne    f62eda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12a2f0>
      f62f23:	48 8b 6c 24 08       	mov    rbp,QWORD PTR [rsp+0x8]
      f62f28:	bf b0 00 00 00       	mov    edi,0xb0
      f62f2d:	e8 ce af 88 00       	call   17edf00 <_Znwm@plt>
      f62f32:	49 89 c4             	mov    r12,rax
      f62f35:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
      f62f3a:	48 83 20 00          	and    QWORD PTR [rax],0x0
      f62f3e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      f62f43:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      f62f48:	c6 44 24 48 00       	mov    BYTE PTR [rsp+0x48],0x0
      f62f4d:	4d 89 6c 24 08       	mov    QWORD PTR [r12+0x8],r13
      f62f52:	49 8d 7c 24 10       	lea    rdi,[r12+0x10]
      f62f57:	4c 89 f6             	mov    rsi,r14
      f62f5a:	e8 e1 af 88 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      f62f5f:	4c 89 e7             	mov    rdi,r12
      f62f62:	48 83 c7 28          	add    rdi,0x28

### node allocation call@0xf8f50e, FDE=(16314068, 16316836)
      f8f503:	4c 8b b4 24 b0 00 00 	mov    r14,QWORD PTR [rsp+0xb0]
      f8f50a:	00 
      f8f50b:	6a 38                	push   0x38
      f8f50d:	5f                   	pop    rdi
      f8f50e:	e8 ed e9 85 00       	call   17edf00 <_Znwm@plt>
      f8f513:	4c 89 78 10          	mov    QWORD PTR [rax+0x10],r15
      f8f517:	4c 89 68 18          	mov    QWORD PTR [rax+0x18],r13
      f8f51b:	4d 85 ed             	test   r13,r13
      f8f51e:	74 05                	je     f8f525 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15693b>
      f8f520:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]
      f8f525:	8a 8c 24 20 01 00 00 	mov    cl,BYTE PTR [rsp+0x120]
      f8f52c:	88 48 30             	mov    BYTE PTR [rax+0x30],cl
      f8f52f:	0f 10 84 24 10 01 00 	movups xmm0,XMMWORD PTR [rsp+0x110]
      f8f536:	00 
      f8f537:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
      f8f53b:	88 58 31             	mov    BYTE PTR [rax+0x31],bl
      f8f53e:	48 8d 0d ef 12 00 00 	lea    rcx,[rip+0x12ef]        # f90834 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x157c4a>

### node allocation call@0x10053f9, FDE=(16798406, 16799064)
     10053e7:	4c 8b 34 24          	mov    r14,QWORD PTR [rsp]
     10053eb:	4d 85 f6             	test   r14,r14
     10053ee:	0f 84 87 00 00 00    	je     100547b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cc891>
     10053f4:	bf b0 00 00 00       	mov    edi,0xb0
     10053f9:	e8 02 8b 7e 00       	call   17edf00 <_Znwm@plt>
     10053fe:	49 89 c4             	mov    r12,rax
     1005401:	48 8d 78 10          	lea    rdi,[rax+0x10]
     1005405:	48 8d b4 24 e0 00 00 	lea    rsi,[rsp+0xe0]
     100540c:	00 
     100540d:	e8 40 da ff ff       	call   1002e52 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ca268>
     1005412:	4c 89 e7             	mov    rdi,r12
     1005415:	48 83 c7 40          	add    rdi,0x40
     1005419:	4c 89 fe             	mov    rsi,r15
     100541c:	e8 87 e2 ff ff       	call   10036a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1caabe>
     1005421:	48 8d 05 30 01 00 00 	lea    rax,[rip+0x130]        # 1005558 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cc96e>
     1005428:	49 89 04 24          	mov    QWORD PTR [r12],rax
     100542c:	48 8d 05 53 03 00 00 	lea    rax,[rip+0x353]        # 1005786 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ccb9c>

### node allocation call@0x100ef52, FDE=(16837476, 16839784)
     100ef42:	48 89 df             	mov    rdi,rbx
     100ef45:	4c 89 f6             	mov    rsi,r14
     100ef48:	e8 61 e2 ff ff       	call   100d1ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d45c4>
     100ef4d:	bf b0 00 00 00       	mov    edi,0xb0
     100ef52:	e8 a9 ef 7d 00       	call   17edf00 <_Znwm@plt>
     100ef57:	49 89 c7             	mov    r15,rax
     100ef5a:	0f 57 c0             	xorps  xmm0,xmm0
     100ef5d:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     100ef61:	48 8d 05 b0 5e 83 00 	lea    rax,[rip+0x835eb0]        # 1844e18 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1500>
     100ef68:	49 89 07             	mov    QWORD PTR [r15],rax
     100ef6b:	4d 8d 67 18          	lea    r12,[r15+0x18]
     100ef6f:	ba 98 00 00 00       	mov    edx,0x98
     100ef74:	4c 89 e7             	mov    rdi,r12
     100ef77:	31 f6                	xor    esi,esi
     100ef79:	e8 12 fc 7d 00       	call   17eeb90 <memset@plt>
     100ef7e:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
     100ef83:	bf a8 00 00 00       	mov    edi,0xa8
     100f000:	49 83 a5 a0 00 00 00 	and    QWORD PTR [r13+0xa0],0x0

### node allocation call@0x1012f00, FDE=(16853692, 16855744)
     1012eee:	48 89 df             	mov    rdi,rbx
     1012ef1:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
     1012ef6:	e8 b3 a2 ff ff       	call   100d1ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d45c4>
     1012efb:	bf b0 00 00 00       	mov    edi,0xb0
     1012f00:	e8 fb af 7d 00       	call   17edf00 <_Znwm@plt>
     1012f05:	49 89 c6             	mov    r14,rax
     1012f08:	0f 57 c0             	xorps  xmm0,xmm0
     1012f0b:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     1012f0f:	48 8d 05 52 21 83 00 	lea    rax,[rip+0x832152]        # 1845068 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1750>
     1012f16:	49 89 06             	mov    QWORD PTR [r14],rax
     1012f19:	4d 8d 7e 18          	lea    r15,[r14+0x18]
     1012f1d:	ba 98 00 00 00       	mov    edx,0x98
     1012f22:	4c 89 ff             	mov    rdi,r15
     1012f25:	31 f6                	xor    esi,esi
     1012f27:	e8 64 bc 7d 00       	call   17eeb90 <memset@plt>
     1012f2c:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
     1012f31:	bf 88 00 00 00       	mov    edi,0x88
     1013006:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1013013:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     1013031:	0f 28 84 24 a0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xa0]
     101303e:	4c 8b bc 24 a8 00 00 	mov    r15,QWORD PTR [rsp+0xa8]

### node allocation call@0x1021336, FDE=(16912877, 16914113)
     1021328:	00 
     1021329:	4c 89 fe             	mov    rsi,r15
     102132c:	e8 7d be fe ff       	call   100d1ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d45c4>
     1021331:	bf b0 00 00 00       	mov    edi,0xb0
     1021336:	e8 c5 cb 7c 00       	call   17edf00 <_Znwm@plt>
     102133b:	49 89 c6             	mov    r14,rax
     102133e:	0f 57 c0             	xorps  xmm0,xmm0
     1021341:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     1021345:	48 8d 05 5c 46 82 00 	lea    rax,[rip+0x82465c]        # 18459a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2090>
     102134c:	49 89 06             	mov    QWORD PTR [r14],rax
     102134f:	4d 8d 7e 18          	lea    r15,[r14+0x18]
     1021353:	ba 98 00 00 00       	mov    edx,0x98
     1021358:	4c 89 ff             	mov    rdi,r15
     102135b:	31 f6                	xor    esi,esi
     102135d:	e8 2e d8 7c 00       	call   17eeb90 <memset@plt>
     1021362:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
     1021367:	bf e8 00 00 00       	mov    edi,0xe8

### node allocation call@0x1057540, FDE=(17134890, 17135033)
     1057535:	e8 66 bd b0 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
     105753a:	49 89 c7             	mov    r15,rax
     105753d:	6a 18                	push   0x18
     105753f:	5f                   	pop    rdi
     1057540:	e8 bb 69 79 00       	call   17edf00 <_Znwm@plt>
     1057545:	49 89 c6             	mov    r14,rax
     1057548:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     105754c:	48 8d 05 fd 6b 7b 00 	lea    rax,[rip+0x7b6bfd]        # 180e150 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3e10>
     1057553:	49 89 06             	mov    QWORD PTR [r14],rax
     1057556:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1057559:	4c 89 ff             	mov    rdi,r15
     105755c:	ff 50 28             	call   QWORD PTR [rax+0x28]
     105755f:	49 89 c7             	mov    r15,rax
     1057562:	6a 60                	push   0x60
     1057564:	5f                   	pop    rdi
     1057565:	e8 96 69 79 00       	call   17edf00 <_Znwm@plt>
     105756a:	48 8d 0d a7 5b 7f 00 	lea    rcx,[rip+0x7f5ba7]        # 184d118 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9800>
     1057571:	48 89 08             	mov    QWORD PTR [rax],rcx
     1057574:	4c 89 78 08          	mov    QWORD PTR [rax+0x8],r15

### node allocation call@0x106b1e0, FDE=(17214946, 17216924)
     106b1d0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     106b1d3:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     106b1d8:	ff 50 30             	call   QWORD PTR [rax+0x30]
     106b1db:	bf b0 00 00 00       	mov    edi,0xb0
     106b1e0:	e8 1b 2d 78 00       	call   17edf00 <_Znwm@plt>
     106b1e5:	49 89 c7             	mov    r15,rax
     106b1e8:	f3 41 0f 6f 45 18    	movdqu xmm0,XMMWORD PTR [r13+0x18]
     106b1ee:	49 8b 45 20          	mov    rax,QWORD PTR [r13+0x20]
     106b1f2:	48 85 c0             	test   rax,rax
     106b1f5:	74 05                	je     106b1fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x232612>
     106b1f7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     106b1fc:	45 89 f4             	mov    r12d,r14d
     106b1ff:	66 0f 6f 4c 24 60    	movdqa xmm1,XMMWORD PTR [rsp+0x60]
     106b205:	0f 57 d2             	xorps  xmm2,xmm2
     106b208:	0f 29 54 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm2
     106b20d:	48 8d 05 c4 12 7a 00 	lea    rax,[rip+0x7a12c4]        # 180c4d8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2198>
     106b214:	48 8d 8c 24 20 01 00 	lea    rcx,[rsp+0x120]
     106b314:	49 83 a7 a8 00 00 00 	and    QWORD PTR [r15+0xa8],0x0

### node allocation call@0x106e52c, FDE=(17228512, 17230671)
     106e51c:	ff 50 30             	call   QWORD PTR [rax+0x30]
     106e51f:	4c 8b bc 24 10 01 00 	mov    r15,QWORD PTR [rsp+0x110]
     106e526:	00 
     106e527:	bf b0 00 00 00       	mov    edi,0xb0
     106e52c:	e8 cf f9 77 00       	call   17edf00 <_Znwm@plt>
     106e531:	49 89 c6             	mov    r14,rax
     106e534:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     106e53b:	00 
     106e53c:	48 8d b4 24 98 00 00 	lea    rsi,[rsp+0x98]
     106e543:	00 
     106e544:	e8 f7 f9 77 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     106e549:	48 8d 05 b0 aa 7d 00 	lea    rax,[rip+0x7daab0]        # 1849000 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x56e8>
     106e550:	49 89 06             	mov    QWORD PTR [r14],rax
     106e553:	4d 8d 66 08          	lea    r12,[r14+0x8]
     106e557:	48 8b 84 24 50 01 00 	mov    rax,QWORD PTR [rsp+0x150]
     106e55e:	00 
     106e55f:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     106e5b0:	41 c7 86 a8 00 00 00 	mov    DWORD PTR [r14+0xa8],0x3f800000

### node allocation call@0x106e806, FDE=(17228512, 17230671)
     106e7f6:	ff 50 28             	call   QWORD PTR [rax+0x28]
     106e7f9:	48 8b 9c 24 b0 00 00 	mov    rbx,QWORD PTR [rsp+0xb0]
     106e800:	00 
     106e801:	bf 90 00 00 00       	mov    edi,0x90
     106e806:	e8 f5 f6 77 00       	call   17edf00 <_Znwm@plt>
     106e80b:	49 89 c4             	mov    r12,rax
     106e80e:	48 8d ac 24 40 01 00 	lea    rbp,[rsp+0x140]
     106e815:	00 
     106e816:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
     106e81d:	00 
     106e81e:	48 89 ef             	mov    rdi,rbp
     106e821:	e8 0a 94 25 00       	call   12c7c30 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d1b4>
     106e826:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     106e82b:	49 89 04 24          	mov    QWORD PTR [r12],rax
     106e82f:	4d 89 6c 24 08       	mov    QWORD PTR [r12+0x8],r13
     106e834:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     106e839:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax

### node allocation call@0x1071bf3, FDE=(17242860, 17244578)
     1071be2:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     1071be6:	4c 8d 60 30          	lea    r12,[rax+0x30]
     1071bea:	48 8b 68 20          	mov    rbp,QWORD PTR [rax+0x20]
     1071bee:	bf b0 00 00 00       	mov    edi,0xb0
     1071bf3:	e8 08 c3 77 00       	call   17edf00 <_Znwm@plt>
     1071bf8:	49 89 c6             	mov    r14,rax
     1071bfb:	48 8d 5c 24 28       	lea    rbx,[rsp+0x28]
     1071c00:	48 89 df             	mov    rdi,rbx
     1071c03:	4c 89 ee             	mov    rsi,r13
     1071c06:	e8 5b 82 65 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
     1071c0b:	48 8d 05 56 74 7d 00 	lea    rax,[rip+0x7d7456]        # 1849068 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5750>
     1071c12:	49 89 06             	mov    QWORD PTR [r14],rax
     1071c15:	4d 89 66 08          	mov    QWORD PTR [r14+0x8],r12
     1071c19:	49 89 6e 10          	mov    QWORD PTR [r14+0x10],rbp
     1071c1d:	4d 8d 66 18          	lea    r12,[r14+0x18]
     1071c21:	4c 89 e7             	mov    rdi,r12
     1071c24:	48 89 de             	mov    rsi,rbx
     1071c27:	e8 08 88 65 00       	call   16ca434 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e5a0>

### node allocation call@0x1077f4d, FDE=(17268398, 17273006)
     1077f3d:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
     1077f44:	00 
     1077f45:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1077f48:	bf b0 00 00 00       	mov    edi,0xb0
     1077f4d:	e8 ae 5f 77 00       	call   17edf00 <_Znwm@plt>
     1077f52:	48 89 5c 24 40       	mov    QWORD PTR [rsp+0x40],rbx
     1077f57:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     1077f5b:	48 8d 0d 46 17 7d 00 	lea    rcx,[rip+0x7d1746]        # 18496a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5d90>
     1077f62:	48 89 08             	mov    QWORD PTR [rax],rcx
     1077f65:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     1077f6a:	48 8d 48 10          	lea    rcx,[rax+0x10]
     1077f6e:	48 89 4c 24 68       	mov    QWORD PTR [rsp+0x68],rcx
     1077f73:	48 83 60 40 00       	and    QWORD PTR [rax+0x40],0x0
     1077f78:	48 8d 48 50          	lea    rcx,[rax+0x50]
     1077f7c:	48 89 4c 24 70       	mov    QWORD PTR [rsp+0x70],rcx
     1077f81:	48 83 60 50 00       	and    QWORD PTR [rax+0x50],0x0

### node allocation call@0x107a8f2, FDE=(17276972, 17294468)
     107a8e0:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
     107a8e7:	00 
     107a8e8:	e8 43 c4 a2 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     107a8ed:	bf b0 00 00 00       	mov    edi,0xb0
     107a8f2:	e8 09 36 77 00       	call   17edf00 <_Znwm@plt>
     107a8f7:	49 89 c7             	mov    r15,rax
     107a8fa:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
     107a901:	00 
     107a902:	48 8d b4 24 b0 03 00 	lea    rsi,[rsp+0x3b0]
     107a909:	00 
     107a90a:	e8 81 f9 9f ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     107a90f:	48 8d 05 4a ef 7c 00 	lea    rax,[rip+0x7cef4a]        # 1849860 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5f48>
     107a916:	48 89 84 24 a0 04 00 	mov    QWORD PTR [rsp+0x4a0],rax
     107a91d:	00 
     107a91e:	89 9c 24 a8 04 00 00 	mov    DWORD PTR [rsp+0x4a8],ebx
     107a925:	4c 89 b4 24 c0 04 00 	mov    QWORD PTR [rsp+0x4c0],r14
     107a9a5:	49 89 87 a0 00 00 00 	mov    QWORD PTR [r15+0xa0],rax
     107a9b5:	49 89 b7 a0 00 00 00 	mov    QWORD PTR [r15+0xa0],rsi

### node allocation call@0x1093a52, FDE=(17381718, 17383143)
     1093a46:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     1093a4d:	00 00 
     1093a4f:	6a 18                	push   0x18
     1093a51:	5f                   	pop    rdi
     1093a52:	e8 a9 a4 75 00       	call   17edf00 <_Znwm@plt>
     1093a57:	48 89 c3             	mov    rbx,rax
     1093a5a:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
     1093a61:	00 
     1093a62:	48 89 c7             	mov    rdi,rax
     1093a65:	e8 d6 a4 75 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1093a6a:	4c 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],r15
     1093a6f:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
     1093a76:	00 
     1093a77:	48 8d 05 1c 10 d9 ff 	lea    rax,[rip+0xffffffffffd9101c]        # e24a9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf1b20>
     1093a7e:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     1093a85:	00 
     1093a86:	48 8d 05 5b 04 00 00 	lea    rax,[rip+0x45b]        # 1093ee8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b2fe>
     1093aa8:	4c 8d bc 24 a0 00 00 	lea    r15,[rsp+0xa0]

### node allocation call@0x1095536, FDE=(17388692, 17389258)
     1095527:	4c 89 fe             	mov    rsi,r15
     109552a:	ff 50 10             	call   QWORD PTR [rax+0x10]
     109552d:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
     1095531:	bf b0 00 00 00       	mov    edi,0xb0
     1095536:	e8 c5 89 75 00       	call   17edf00 <_Znwm@plt>
     109553b:	49 89 c7             	mov    r15,rax
     109553e:	48 8d 05 73 5e 7b 00 	lea    rax,[rip+0x7b5e73]        # 184b3b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7aa0>
     1095545:	49 89 07             	mov    QWORD PTR [r15],rax
     1095548:	49 89 6f 08          	mov    QWORD PTR [r15+0x8],rbp
     109554c:	0f 28 44 24 30       	movaps xmm0,XMMWORD PTR [rsp+0x30]
     1095551:	41 0f 11 47 10       	movups XMMWORD PTR [r15+0x10],xmm0
     1095556:	0f 57 c0             	xorps  xmm0,xmm0
     1095559:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     109555e:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
     1095563:	4d 89 6f 30          	mov    QWORD PTR [r15+0x30],r13
     1095567:	41 0f 11 47 38       	movups XMMWORD PTR [r15+0x38],xmm0
     1095612:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]

### node allocation call@0x1099091, FDE=(17403914, 17404253)
     109907d:	e8 4e ab 54 00       	call   15e3bd0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x429154>
     1099082:	48 8d 05 f7 26 7b 00 	lea    rax,[rip+0x7b26f7]        # 184b780 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7e68>
     1099089:	48 89 03             	mov    QWORD PTR [rbx],rax
     109908c:	bf b0 00 00 00       	mov    edi,0xb0
     1099091:	e8 6a 4e 75 00       	call   17edf00 <_Znwm@plt>
     1099096:	49 89 c4             	mov    r12,rax
     1099099:	48 89 c7             	mov    rdi,rax
     109909c:	4c 89 f6             	mov    rsi,r14
     109909f:	e8 9c 4e 75 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     10990a4:	0f 28 44 24 60       	movaps xmm0,XMMWORD PTR [rsp+0x60]
     10990a9:	41 0f 11 44 24 18    	movups XMMWORD PTR [r12+0x18],xmm0
     10990af:	0f 28 44 24 50       	movaps xmm0,XMMWORD PTR [rsp+0x50]
     10990b4:	41 0f 11 44 24 28    	movups XMMWORD PTR [r12+0x28],xmm0
     10990ba:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]
     10990bf:	41 0f 11 44 24 38    	movups XMMWORD PTR [r12+0x38],xmm0
     10990c5:	0f 28 44 24 30       	movaps xmm0,XMMWORD PTR [rsp+0x30]
     10990ef:	4d 89 bc 24 a0 00 00 	mov    QWORD PTR [r12+0xa0],r15

### node allocation call@0x10d3c0b, FDE=(17632856, 17648886)
     10d3bf9:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
     10d3c00:	00 
     10d3c01:	e8 88 a9 fa ff       	call   107e58e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2459a4>
     10d3c06:	bf b0 00 00 00       	mov    edi,0xb0
     10d3c0b:	e8 f0 a2 71 00       	call   17edf00 <_Znwm@plt>
     10d3c10:	48 89 c5             	mov    rbp,rax
     10d3c13:	49 89 dd             	mov    r13,rbx
     10d3c16:	66 0f ef c0          	pxor   xmm0,xmm0
     10d3c1a:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     10d3c1f:	48 8d 05 a2 71 73 00 	lea    rax,[rip+0x7371a2]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
     10d3c26:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     10d3c2a:	0f 28 84 24 30 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x130]
     10d3c31:	00 
     10d3c32:	48 8b 84 24 38 01 00 	mov    rax,QWORD PTR [rsp+0x138]
     10d3c39:	00 
     10d3c3a:	48 85 c0             	test   rax,rax
     10d3c3d:	74 05                	je     10d3c44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29b05a>
     10d3c3f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]

### node allocation call@0x10d6b6b, FDE=(17656632, 17657177)
     10d6b58:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     10d6b5d:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
     10d6b61:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     10d6b66:	bf b0 00 00 00       	mov    edi,0xb0
     10d6b6b:	e8 90 73 71 00       	call   17edf00 <_Znwm@plt>
     10d6b70:	48 89 c3             	mov    rbx,rax
     10d6b73:	0f 57 c0             	xorps  xmm0,xmm0
     10d6b76:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     10d6b7a:	48 8d 05 e7 68 72 00 	lea    rax,[rip+0x7268e7]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     10d6b81:	48 89 03             	mov    QWORD PTR [rbx],rax
     10d6b84:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     10d6b88:	44 8a 6d 30          	mov    r13b,BYTE PTR [rbp+0x30]
     10d6b8c:	44 8a b5 99 00 00 00 	mov    r14b,BYTE PTR [rbp+0x99]
     10d6b93:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
     10d6b97:	e8 be 01 00 00       	call   10d6d5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29e170>
     10d6b9c:	48 8d 05 4d 81 77 00 	lea    rax,[rip+0x77814d]        # 184ecf0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xb3d8>

### node allocation call@0x10df1fb, FDE=(17691092, 17691404)
     10df1e8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10df1ef:	00 00 
     10df1f1:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     10df1f6:	bf b0 00 00 00       	mov    edi,0xb0
     10df1fb:	e8 00 ed 70 00       	call   17edf00 <_Znwm@plt>
     10df200:	48 89 c3             	mov    rbx,rax
     10df203:	0f 57 c0             	xorps  xmm0,xmm0
     10df206:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     10df20a:	48 8d 05 57 e2 71 00 	lea    rax,[rip+0x71e257]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     10df211:	48 89 03             	mov    QWORD PTR [rbx],rax
     10df214:	4c 8d 73 18          	lea    r14,[rbx+0x18]
     10df218:	4c 89 f7             	mov    rdi,r14
     10df21b:	e8 3a 7b ff ff       	call   10d6d5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29e170>
     10df220:	48 8d 05 c9 fa 76 00 	lea    rax,[rip+0x76fac9]        # 184ecf0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xb3d8>
     10df227:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     10df22b:	49 89 dd             	mov    r13,rbx
     10df22e:	49 83 c5 68          	add    r13,0x68

### node allocation call@0x10e127a, FDE=(17699392, 17700152)
     10e1269:	0f 85 e1 01 00 00    	jne    10e1450 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a8866>
     10e126f:	49 89 d7             	mov    r15,rdx
     10e1272:	49 89 f6             	mov    r14,rsi
     10e1275:	bf b0 00 00 00       	mov    edi,0xb0
     10e127a:	e8 81 cc 70 00       	call   17edf00 <_Znwm@plt>
     10e127f:	49 89 c4             	mov    r12,rax
     10e1282:	0f 57 c0             	xorps  xmm0,xmm0
     10e1285:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     10e1289:	48 8d 05 d8 c1 71 00 	lea    rax,[rip+0x71c1d8]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     10e1290:	49 89 04 24          	mov    QWORD PTR [r12],rax
     10e1294:	4d 8d 6c 24 18       	lea    r13,[r12+0x18]
     10e1299:	ba 98 00 00 00       	mov    edx,0x98
     10e129e:	4c 89 ef             	mov    rdi,r13
     10e12a1:	31 f6                	xor    esi,esi
     10e12a3:	e8 e8 d8 70 00       	call   17eeb90 <memset@plt>
     10e12a8:	4c 89 ef             	mov    rdi,r13
     10e12ab:	e8 aa 5a ff ff       	call   10d6d5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29e170>

### node allocation call@0x10f2e2c, FDE=(17771718, 17772422)
     10f2e20:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     10f2e27:	00 00 
     10f2e29:	6a 60                	push   0x60
     10f2e2b:	5f                   	pop    rdi
     10f2e2c:	e8 cf b0 6f 00       	call   17edf00 <_Znwm@plt>
     10f2e31:	49 89 c4             	mov    r12,rax
     10f2e34:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
     10f2e39:	49 89 04 24          	mov    QWORD PTR [r12],rax
     10f2e3d:	4c 89 e7             	mov    rdi,r12
     10f2e40:	48 83 c7 08          	add    rdi,0x8
     10f2e44:	4c 89 ee             	mov    rsi,r13
     10f2e47:	e8 1a 70 5d 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
     10f2e4c:	4c 89 a4 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r12
     10f2e53:	00 
     10f2e54:	48 8d 05 79 04 b7 ff 	lea    rax,[rip+0xffffffffffb70479]        # c632d4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b0274>
     10f2e5b:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     10f2e91:	48 8d 94 24 a0 00 00 	lea    rdx,[rsp+0xa0]
     10f2eb1:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     10f2f23:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]

### node allocation call@0x10f3764, FDE=(17773812, 17774765)
     10f3758:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     10f375f:	00 00 
     10f3761:	6a 38                	push   0x38
     10f3763:	5f                   	pop    rdi
     10f3764:	e8 97 a7 6f 00       	call   17edf00 <_Znwm@plt>
     10f3769:	48 8b 5c 24 28       	mov    rbx,QWORD PTR [rsp+0x28]
     10f376e:	49 89 c6             	mov    r14,rax
     10f3771:	48 8d 44 24 70       	lea    rax,[rsp+0x70]
     10f3776:	0f 28 40 f0          	movaps xmm0,XMMWORD PTR [rax-0x10]
     10f377a:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     10f377e:	0f 57 c0             	xorps  xmm0,xmm0
     10f3781:	0f 29 40 f0          	movaps XMMWORD PTR [rax-0x10],xmm0
     10f3785:	8b 08                	mov    ecx,DWORD PTR [rax]
     10f3787:	8b 40 03             	mov    eax,DWORD PTR [rax+0x3]
     10f378a:	41 89 46 13          	mov    DWORD PTR [r14+0x13],eax
     10f378e:	41 89 4e 10          	mov    DWORD PTR [r14+0x10],ecx
     10f3792:	4c 89 f7             	mov    rdi,r14
     10f3795:	48 83 c7 18          	add    rdi,0x18
     10f3799:	4c 89 fe             	mov    rsi,r15
     10f37a1:	48 8d 94 24 a0 00 00 	lea    rdx,[rsp+0xa0]
     10f37d3:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     10f3855:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     10f3871:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]

### node allocation call@0x112bd87, FDE=(18005214, 18006176)
     112bd72:	e8 71 c1 a3 ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>
     112bd77:	4d 8b 66 38          	mov    r12,QWORD PTR [r14+0x38]
     112bd7b:	4d 8b ae e0 00 00 00 	mov    r13,QWORD PTR [r14+0xe0]
     112bd82:	bf b0 00 00 00       	mov    edi,0xb0
     112bd87:	e8 74 21 6c 00       	call   17edf00 <_Znwm@plt>
     112bd8c:	48 89 c3             	mov    rbx,rax
     112bd8f:	48 8d 05 ba 65 72 00 	lea    rax,[rip+0x7265ba]        # 1852350 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xea38>
     112bd96:	48 89 03             	mov    QWORD PTR [rbx],rax
     112bd99:	4c 89 63 08          	mov    QWORD PTR [rbx+0x8],r12
     112bd9d:	4c 89 6b 10          	mov    QWORD PTR [rbx+0x10],r13
     112bda1:	0f 57 c0             	xorps  xmm0,xmm0
     112bda4:	0f 11 43 58          	movups XMMWORD PTR [rbx+0x58],xmm0
     112bda8:	0f 11 43 68          	movups XMMWORD PTR [rbx+0x68],xmm0
     112bdac:	0f 11 43 18          	movups XMMWORD PTR [rbx+0x18],xmm0
     112bdb0:	31 c0                	xor    eax,eax
     112bdb2:	88 43 28             	mov    BYTE PTR [rbx+0x28],al
     112bdb5:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
     112bdb9:	0f 11 43 40          	movups XMMWORD PTR [rbx+0x40],xmm0

### node allocation call@0x113393e, FDE=(18036606, 18037465)
     1133932:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     1133939:	00 00 
     113393b:	6a 20                	push   0x20
     113393d:	5f                   	pop    rdi
     113393e:	e8 bd a5 6b 00       	call   17edf00 <_Znwm@plt>
     1133943:	49 89 c6             	mov    r14,rax
     1133946:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
     113394b:	48 8d 84 24 8f 00 00 	lea    rax,[rsp+0x8f]
     1133952:	00 
     1133953:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
     1133958:	48 c7 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],0x1
     113395f:	00 01 00 00 00 
     1133964:	48 8d 05 7d f2 71 00 	lea    rax,[rip+0x71f27d]        # 1852be8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf2d0>
     113396b:	49 89 06             	mov    QWORD PTR [r14],rax
     113396e:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     1133973:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax

### node allocation call@0x113fd96, FDE=(18087216, 18089107)
     113fd83:	4c 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],r15
     113fd88:	4c 89 64 24 08       	mov    QWORD PTR [rsp+0x8],r12
     113fd8d:	4d 8b 2c 24          	mov    r13,QWORD PTR [r12]
     113fd91:	bf b0 00 00 00       	mov    edi,0xb0
     113fd96:	e8 65 e1 6a 00       	call   17edf00 <_Znwm@plt>
     113fd9b:	49 89 c4             	mov    r12,rax
     113fd9e:	4c 89 28             	mov    QWORD PTR [rax],r13
     113fda1:	48 8d 78 08          	lea    rdi,[rax+0x8]
     113fda5:	31 f6                	xor    esi,esi
     113fda7:	e8 c6 3c 51 00       	call   1653a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7bde>
     113fdac:	0f 57 c0             	xorps  xmm0,xmm0
     113fdaf:	41 0f 11 84 24 99 00 	movups XMMWORD PTR [r12+0x99],xmm0
     113fdb6:	00 00 
     113fdb8:	41 0f 11 84 24 90 00 	movups XMMWORD PTR [r12+0x90],xmm0
     113fdbf:	00 00 
     113fdc1:	41 0f 11 84 24 80 00 	movups XMMWORD PTR [r12+0x80],xmm0
     113fdc8:	00 00 
     113fdca:	41 c6 84 24 a9 00 00 	mov    BYTE PTR [r12+0xa9],0x1
     113fe13:	49 89 84 24 a0 00 00 	mov    QWORD PTR [r12+0xa0],rax

### node allocation call@0x114ab9c, FDE=(18131754, 18132174)
     114ab8c:	74 05                	je     114ab93 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x311fa9>
     114ab8e:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
     114ab93:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
     114ab97:	bf b0 00 00 00       	mov    edi,0xb0
     114ab9c:	e8 5f 33 6a 00       	call   17edf00 <_Znwm@plt>
     114aba1:	49 89 c7             	mov    r15,rax
     114aba4:	0f 57 c0             	xorps  xmm0,xmm0
     114aba7:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     114abab:	48 8d 05 16 a6 70 00 	lea    rax,[rip+0x70a616]        # 18551c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x118b0>
     114abb2:	49 89 07             	mov    QWORD PTR [r15],rax
     114abb5:	4d 89 fc             	mov    r12,r15
     114abb8:	49 83 c4 20          	add    r12,0x20
     114abbc:	48 8d 05 35 a4 6c 00 	lea    rax,[rip+0x6ca435]        # 1814ff8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xacb8>
     114abc3:	4c 8d 54 24 30       	lea    r10,[rsp+0x30]
     114abc8:	49 89 02             	mov    QWORD PTR [r10],rax
     114abcb:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
     114abd0:	41 0f 11 42 08       	movups XMMWORD PTR [r10+0x8],xmm0

### node allocation call@0x114b0ee, FDE=(18133116, 18133536)
     114b0de:	74 05                	je     114b0e5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3124fb>
     114b0e0:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
     114b0e5:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
     114b0e9:	bf b0 00 00 00       	mov    edi,0xb0
     114b0ee:	e8 0d 2e 6a 00       	call   17edf00 <_Znwm@plt>
     114b0f3:	49 89 c7             	mov    r15,rax
     114b0f6:	0f 57 c0             	xorps  xmm0,xmm0
     114b0f9:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     114b0fd:	48 8d 05 c4 a0 70 00 	lea    rax,[rip+0x70a0c4]        # 18551c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x118b0>
     114b104:	49 89 07             	mov    QWORD PTR [r15],rax
     114b107:	4d 89 fc             	mov    r12,r15
     114b10a:	49 83 c4 20          	add    r12,0x20
     114b10e:	48 8d 05 e3 9e 6c 00 	lea    rax,[rip+0x6c9ee3]        # 1814ff8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xacb8>
     114b115:	4c 8d 54 24 30       	lea    r10,[rsp+0x30]
     114b11a:	49 89 02             	mov    QWORD PTR [r10],rax
     114b11d:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
     114b122:	41 0f 11 42 08       	movups XMMWORD PTR [r10+0x8],xmm0

### node allocation call@0x116fe45, FDE=(18283370, 18284725)
     116fe34:	31 d2                	xor    edx,edx
     116fe36:	ff 50 18             	call   QWORD PTR [rax+0x18]
     116fe39:	4c 8b ab a8 00 00 00 	mov    r13,QWORD PTR [rbx+0xa8]
     116fe40:	bf b0 00 00 00       	mov    edi,0xb0
     116fe45:	e8 b6 e0 67 00       	call   17edf00 <_Znwm@plt>
     116fe4a:	49 89 c4             	mov    r12,rax
     116fe4d:	48 89 ac 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbp
     116fe54:	00 
     116fe55:	48 89 9c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rbx
     116fe5c:	00 
     116fe5d:	4c 89 bc 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],r15
     116fe64:	00 
     116fe65:	48 8d 54 24 70       	lea    rdx,[rsp+0x70]
     116fe6a:	48 89 c7             	mov    rdi,rax
     116fe6d:	4c 89 fe             	mov    rsi,r15
     116fe70:	4c 89 e9             	mov    rcx,r13
     116fe73:	e8 7a 50 02 00       	call   1194ef2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35c308>
     116fe78:	4c 8d 6c 24 20       	lea    r13,[rsp+0x20]
     116fe81:	4c 8d bc 24 a0 00 00 	lea    r15,[rsp+0xa0]
     116fee1:	4c 8b ab a8 00 00 00 	mov    r13,QWORD PTR [rbx+0xa8]
     116fef5:	48 89 ac 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbp
     116fefd:	48 89 9c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rbx
     116ff2d:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]

### node allocation call@0x11783a3, FDE=(18317412, 18318624)
     1178397:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     117839e:	00 00 
     11783a0:	6a 20                	push   0x20
     11783a2:	5f                   	pop    rdi
     11783a3:	e8 58 5b 67 00       	call   17edf00 <_Znwm@plt>
     11783a8:	49 89 c7             	mov    r15,rax
     11783ab:	48 8d 05 4e ed 6d 00 	lea    rax,[rip+0x6ded4e]        # 1857100 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x137e8>
     11783b2:	49 89 07             	mov    QWORD PTR [r15],rax
     11783b5:	4c 89 ff             	mov    rdi,r15
     11783b8:	48 83 c7 08          	add    rdi,0x8
     11783bc:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
     11783c1:	4c 89 e6             	mov    rsi,r12
     11783c4:	e8 ef fb 9e ff       	call   b67fb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4f58>
     11783c9:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
     11783ce:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     11783d2:	48 8d 8c 24 90 00 00 	lea    rcx,[rsp+0x90]

### node allocation call@0x117b9e7, FDE=(18329960, 18339592)
     117b9d7:	ff 50 18             	call   QWORD PTR [rax+0x18]
     117b9da:	e8 71 27 67 00       	call   17ee150 <_ZNSt6__ndk16chrono12system_clock3nowEv@plt>
     117b9df:	49 89 c4             	mov    r12,rax
     117b9e2:	bf b0 00 00 00       	mov    edi,0xb0
     117b9e7:	e8 14 25 67 00       	call   17edf00 <_Znwm@plt>
     117b9ec:	48 8d 9c 24 f0 02 00 	lea    rbx,[rsp+0x2f0]
     117b9f3:	00 
     117b9f4:	49 89 c6             	mov    r14,rax
     117b9f7:	48 89 df             	mov    rdi,rbx
     117b9fa:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     117b9ff:	e8 8c e8 8f ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     117ba04:	0f 28 84 24 c0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xc0]
     117ba0b:	00 
     117ba0c:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     117ba11:	0f 57 c0             	xorps  xmm0,xmm0
     117ba14:	0f 29 84 24 c0 00 00 	movaps XMMWORD PTR [rsp+0xc0],xmm0
     117ba1b:	00 
     117ba1c:	4c 89 ef             	mov    rdi,r13
     117bad9:	49 89 86 a0 00 00 00 	mov    QWORD PTR [r14+0xa0],rax
     117bae0:	4d 89 a6 a8 00 00 00 	mov    QWORD PTR [r14+0xa8],r12

### node allocation call@0x117bd78, FDE=(18329960, 18339592)
     117bd6d:	6a 0b                	push   0xb
     117bd6f:	5a                   	pop    rdx
     117bd70:	ff 50 18             	call   QWORD PTR [rax+0x18]
     117bd73:	bf b0 00 00 00       	mov    edi,0xb0
     117bd78:	e8 83 21 67 00       	call   17edf00 <_Znwm@plt>
     117bd7d:	48 8d 9c 24 f0 02 00 	lea    rbx,[rsp+0x2f0]
     117bd84:	00 
     117bd85:	49 89 c6             	mov    r14,rax
     117bd88:	48 89 df             	mov    rdi,rbx
     117bd8b:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     117bd90:	e8 fb e4 8f ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     117bd95:	4c 89 ef             	mov    rdi,r13
     117bd98:	48 89 de             	mov    rsi,rbx
     117bd9b:	e8 f0 e4 8f ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     117bda0:	4c 89 f7             	mov    rdi,r14
     117bda3:	4c 89 ee             	mov    rsi,r13
     117bda6:	e8 65 30 02 00       	call   119ee10 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366226>
     117bdab:	4c 89 ed             	mov    rbp,r13
     117be65:	49 89 86 a0 00 00 00 	mov    QWORD PTR [r14+0xa0],rax

### node allocation call@0x117bed4, FDE=(18329960, 18339592)
     117bec4:	ff 50 18             	call   QWORD PTR [rax+0x18]
     117bec7:	e8 84 22 67 00       	call   17ee150 <_ZNSt6__ndk16chrono12system_clock3nowEv@plt>
     117becc:	49 89 c4             	mov    r12,rax
     117becf:	bf b0 00 00 00       	mov    edi,0xb0
     117bed4:	e8 27 20 67 00       	call   17edf00 <_Znwm@plt>
     117bed9:	48 8d 9c 24 f0 02 00 	lea    rbx,[rsp+0x2f0]
     117bee0:	00 
     117bee1:	49 89 c6             	mov    r14,rax
     117bee4:	48 89 df             	mov    rdi,rbx
     117bee7:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     117beec:	e8 9f e3 8f ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     117bef1:	0f 28 84 24 c0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xc0]
     117bef8:	00 
     117bef9:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     117befe:	0f 57 c0             	xorps  xmm0,xmm0
     117bf01:	0f 29 84 24 c0 00 00 	movaps XMMWORD PTR [rsp+0xc0],xmm0
     117bf08:	00 
     117bf09:	4c 89 ef             	mov    rdi,r13
     117bfc6:	49 89 86 a0 00 00 00 	mov    QWORD PTR [r14+0xa0],rax
     117bfcd:	4d 89 a6 a8 00 00 00 	mov    QWORD PTR [r14+0xa8],r12

### node allocation call@0x117c05f, FDE=(18329960, 18339592)
     117c052:	4c 89 ef             	mov    rdi,r13
     117c055:	31 d2                	xor    edx,edx
     117c057:	ff 50 18             	call   QWORD PTR [rax+0x18]
     117c05a:	bf b0 00 00 00       	mov    edi,0xb0
     117c05f:	e8 9c 1e 67 00       	call   17edf00 <_Znwm@plt>
     117c064:	49 89 c6             	mov    r14,rax
     117c067:	48 8d ac 24 70 02 00 	lea    rbp,[rsp+0x270]
     117c06e:	00 
     117c06f:	48 89 ef             	mov    rdi,rbp
     117c072:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     117c077:	e8 14 e2 8f ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     117c07c:	4c 89 f7             	mov    rdi,r14
     117c07f:	48 89 ee             	mov    rsi,rbp
     117c082:	4c 89 ea             	mov    rdx,r13
     117c085:	48 8b 8c 24 68 03 00 	mov    rcx,QWORD PTR [rsp+0x368]
     117c08c:	00 
     117c08d:	e8 60 8e 01 00       	call   1194ef2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35c308>
     117c092:	4c 89 b4 24 f0 02 00 	mov    QWORD PTR [rsp+0x2f0],r14
     117c1a6:	49 8d 9e a0 00 00 00 	lea    rbx,[r14+0xa0]

### node allocation call@0x117c2fd, FDE=(18329960, 18339592)
     117c2f2:	6a 01                	push   0x1
     117c2f4:	5a                   	pop    rdx
     117c2f5:	ff 50 18             	call   QWORD PTR [rax+0x18]
     117c2f8:	bf b0 00 00 00       	mov    edi,0xb0
     117c2fd:	e8 fe 1b 67 00       	call   17edf00 <_Znwm@plt>
     117c302:	48 8d 9c 24 f0 02 00 	lea    rbx,[rsp+0x2f0]
     117c309:	00 
     117c30a:	49 89 c6             	mov    r14,rax
     117c30d:	48 89 df             	mov    rdi,rbx
     117c310:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     117c315:	e8 76 df 8f ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     117c31a:	4c 89 ef             	mov    rdi,r13
     117c31d:	48 89 de             	mov    rsi,rbx
     117c320:	e8 6b df 8f ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     117c325:	4c 89 f7             	mov    rdi,r14
     117c328:	4c 89 ee             	mov    rsi,r13
     117c32b:	e8 e0 2a 02 00       	call   119ee10 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366226>
     117c330:	4c 89 ef             	mov    rdi,r13
     117c3e7:	49 89 86 a0 00 00 00 	mov    QWORD PTR [r14+0xa0],rax

### node allocation call@0x117c453, FDE=(18329960, 18339592)
     117c443:	ff 50 18             	call   QWORD PTR [rax+0x18]
     117c446:	e8 05 1d 67 00       	call   17ee150 <_ZNSt6__ndk16chrono12system_clock3nowEv@plt>
     117c44b:	49 89 c4             	mov    r12,rax
     117c44e:	bf b0 00 00 00       	mov    edi,0xb0
     117c453:	e8 a8 1a 67 00       	call   17edf00 <_Znwm@plt>
     117c458:	48 8d 9c 24 f0 02 00 	lea    rbx,[rsp+0x2f0]
     117c45f:	00 
     117c460:	49 89 c6             	mov    r14,rax
     117c463:	48 89 df             	mov    rdi,rbx
     117c466:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     117c46b:	e8 20 de 8f ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     117c470:	0f 28 84 24 c0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xc0]
     117c477:	00 
     117c478:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     117c47d:	0f 57 c0             	xorps  xmm0,xmm0
     117c480:	0f 29 84 24 c0 00 00 	movaps XMMWORD PTR [rsp+0xc0],xmm0
     117c487:	00 
     117c488:	4c 89 ef             	mov    rdi,r13
     117c545:	49 89 86 a0 00 00 00 	mov    QWORD PTR [r14+0xa0],rax
     117c54c:	4d 89 a6 a8 00 00 00 	mov    QWORD PTR [r14+0xa8],r12

### node allocation call@0x1192c21, FDE=(18425606, 18428153)
     1192c0f:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     1192c16:	00 
     1192c17:	e8 0c 8b 8e ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     1192c1c:	bf 08 01 00 00       	mov    edi,0x108
     1192c21:	e8 da b2 65 00       	call   17edf00 <_Znwm@plt>
     1192c26:	48 89 c3             	mov    rbx,rax
     1192c29:	48 8d 35 de 98 1a ff 	lea    rsi,[rip+0xffffffffff1a98de]        # 33c50e <_ZTSSt12bad_any_cast@@Base-0x53cba>
     1192c30:	48 8d 15 9c 4c 1e ff 	lea    rdx,[rip+0xffffffffff1e4c9c]        # 3778d3 <_ZTSSt12bad_any_cast@@Base-0x188f5>
     1192c37:	48 89 c7             	mov    rdi,rax
     1192c3a:	e8 31 d0 00 00       	call   119fc70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x367086>
     1192c3f:	48 8d 05 1a 55 6c 00 	lea    rax,[rip+0x6c551a]        # 1858160 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x14848>
     1192c46:	48 89 03             	mov    QWORD PTR [rbx],rax
     1192c49:	4c 8d b4 24 90 00 00 	lea    r14,[rsp+0x90]
     1192c50:	00 
     1192c51:	41 0f 28 06          	movaps xmm0,XMMWORD PTR [r14]
     1192c55:	0f 11 83 e8 00 00 00 	movups XMMWORD PTR [rbx+0xe8],xmm0

### node allocation call@0x11cb9c6, FDE=(18654982, 18667010)
     11cb9b4:	00 
     11cb9b5:	48 c7 84 24 98 05 00 	mov    QWORD PTR [rsp+0x598],0x3e8
     11cb9bc:	00 e8 03 00 00 
     11cb9c1:	bf b0 00 00 00       	mov    edi,0xb0
     11cb9c6:	e8 35 25 62 00       	call   17edf00 <_Znwm@plt>
     11cb9cb:	49 89 c6             	mov    r14,rax
     11cb9ce:	48 8b 84 24 60 0f 00 	mov    rax,QWORD PTR [rsp+0xf60]
     11cb9d5:	00 
     11cb9d6:	4c 8b 2c 24          	mov    r13,QWORD PTR [rsp]
     11cb9da:	4d 89 6e 08          	mov    QWORD PTR [r14+0x8],r13
     11cb9de:	4d 89 6e 10          	mov    QWORD PTR [r14+0x10],r13
     11cb9e2:	4d 89 6e 18          	mov    QWORD PTR [r14+0x18],r13
     11cb9e6:	4d 89 6e 20          	mov    QWORD PTR [r14+0x20],r13
     11cb9ea:	4d 89 6e 28          	mov    QWORD PTR [r14+0x28],r13
     11cb9ee:	4d 89 6e 30          	mov    QWORD PTR [r14+0x30],r13
     11cb9f2:	4d 89 6e 38          	mov    QWORD PTR [r14+0x38],r13
     11cb9f6:	4d 89 6e 40          	mov    QWORD PTR [r14+0x40],r13
     11cb9fa:	4d 89 6e 48          	mov    QWORD PTR [r14+0x48],r13
     11cba32:	4d 89 ae a0 00 00 00 	mov    QWORD PTR [r14+0xa0],r13
     11cba39:	4d 89 ae a8 00 00 00 	mov    QWORD PTR [r14+0xa8],r13

### node allocation call@0x11f1a92, FDE=(18805556, 18832116)
     11f1a7e:	48 8d 05 e9 4a 00 00 	lea    rax,[rip+0x4ae9]        # 11f656e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3baf2>
     11f1a85:	48 89 84 24 18 04 00 	mov    QWORD PTR [rsp+0x418],rax
     11f1a8c:	00 
     11f1a8d:	bf b0 00 00 00       	mov    edi,0xb0
     11f1a92:	e8 69 c4 5f 00       	call   17edf00 <_Znwm@plt>
     11f1a97:	49 89 c6             	mov    r14,rax
     11f1a9a:	48 8d 05 e7 cd 66 00 	lea    rax,[rip+0x66cde7]        # 185e888 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1af70>
     11f1aa1:	49 89 06             	mov    QWORD PTR [r14],rax
     11f1aa4:	4d 89 66 08          	mov    QWORD PTR [r14+0x8],r12
     11f1aa8:	49 89 6e 10          	mov    QWORD PTR [r14+0x10],rbp
     11f1aac:	49 8d 6e 18          	lea    rbp,[r14+0x18]
     11f1ab0:	4d 85 ed             	test   r13,r13
     11f1ab3:	4c 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],r15
     11f1ab8:	74 39                	je     11f1af3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37077>
     11f1aba:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     11f1abe:	4c 89 ef             	mov    rdi,r13
     11f1ac1:	ff 50 18             	call   QWORD PTR [rax+0x18]
     11f1ac4:	48 89 ef             	mov    rdi,rbp
     11f1ac7:	48 89 c6             	mov    rsi,rax

### node allocation call@0x1208319, FDE=(18907604, 18908148)
     120830d:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     1208314:	00 00 
     1208316:	6a 20                	push   0x20
     1208318:	5f                   	pop    rdi
     1208319:	e8 e2 5b 5e 00       	call   17edf00 <_Znwm@plt>
     120831e:	49 89 c6             	mov    r14,rax
     1208321:	4c 8d 64 24 60       	lea    r12,[rsp+0x60]
     1208326:	4c 8d 7c 24 50       	lea    r15,[rsp+0x50]
     120832b:	48 89 c7             	mov    rdi,rax
     120832e:	4c 89 fe             	mov    rsi,r15
     1208331:	e8 08 17 5d 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     1208336:	41 0f 10 47 10       	movups xmm0,XMMWORD PTR [r15+0x10]
     120833b:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
     1208340:	0f 57 c0             	xorps  xmm0,xmm0
     1208343:	41 0f 11 04 24       	movups XMMWORD PTR [r12],xmm0
     1208348:	4c 8d a4 24 a0 00 00 	lea    r12,[rsp+0xa0]
     12083da:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]

### node allocation call@0x12177fa, FDE=(18969364, 18971614)
     12177ef:	4c 8d ac 24 b0 00 00 	lea    r13,[rsp+0xb0]
     12177f6:	00 
     12177f7:	6a 30                	push   0x30
     12177f9:	5f                   	pop    rdi
     12177fa:	e8 01 67 5d 00       	call   17edf00 <_Znwm@plt>
     12177ff:	48 89 c3             	mov    rbx,rax
     1217802:	49 8d 76 10          	lea    rsi,[r14+0x10]
     1217806:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     121780d:	00 
     121780e:	4c 89 a4 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],r12
     1217815:	00 
     1217816:	c6 84 24 c0 00 00 00 	mov    BYTE PTR [rsp+0xc0],0x0
     121781d:	00 
     121781e:	48 89 c5             	mov    rbp,rax
     1217821:	48 83 c5 10          	add    rbp,0x10
     1217825:	0f 57 c0             	xorps  xmm0,xmm0
     1217828:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     121782b:	48 89 ef             	mov    rdi,rbp
     121782e:	e8 2d 5d 97 ff       	call   b8d560 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda500>

### node allocation call@0x126adf1, FDE=(19312088, 19312149)
     126ade7:	e8 40 f6 51 00       	call   178a42c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e598>
     126adec:	eb 08                	jmp    126adf6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb037a>
     126adee:	6a 30                	push   0x30
     126adf0:	5f                   	pop    rdi
     126adf1:	e8 0a 31 58 00       	call   17edf00 <_Znwm@plt>
     126adf6:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
     126adfa:	48 8d 0d 67 4c 5f 00 	lea    rcx,[rip+0x5f4c67]        # 185fa68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1c150>
     126ae01:	48 89 08             	mov    QWORD PTR [rax],rcx
     126ae04:	0f 57 c0             	xorps  xmm0,xmm0
     126ae07:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
     126ae0b:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
     126ae0f:	83 60 28 00          	and    DWORD PTR [rax+0x28],0x0
     126ae13:	5b                   	pop    rbx
     126ae14:	c3                   	ret

### node allocation call@0x126ae3f, FDE=(19312166, 19312236)
     126ae35:	e8 f2 f5 51 00       	call   178a42c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e598>
     126ae3a:	eb 08                	jmp    126ae44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb03c8>
     126ae3c:	6a 30                	push   0x30
     126ae3e:	5f                   	pop    rdi
     126ae3f:	e8 bc 30 58 00       	call   17edf00 <_Znwm@plt>
     126ae44:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
     126ae48:	48 8d 0d d9 4b 5f 00 	lea    rcx,[rip+0x5f4bd9]        # 185fa28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1c110>
     126ae4f:	48 89 08             	mov    QWORD PTR [rax],rcx
     126ae52:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     126ae57:	48 8d 0d 9a 49 1d ff 	lea    rcx,[rip+0xffffffffff1d499a]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     126ae5e:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
     126ae62:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
     126ae66:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
     126ae6a:	5b                   	pop    rbx
     126ae6b:	c3                   	ret

### node allocation call@0x12a19d6, FDE=(19536218, 19538817)
     12a19c6:	41 b5 01             	mov    r13b,0x1
     12a19c9:	48 8b 6e 20          	mov    rbp,QWORD PTR [rsi+0x20]
     12a19cd:	44 8b 60 18          	mov    r12d,DWORD PTR [rax+0x18]
     12a19d1:	bf b0 00 00 00       	mov    edi,0xb0
     12a19d6:	e8 25 c5 54 00       	call   17edf00 <_Znwm@plt>
     12a19db:	49 89 c6             	mov    r14,rax
     12a19de:	4d 85 ff             	test   r15,r15
     12a19e1:	74 05                	je     12a19e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe6f6c>
     12a19e3:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
     12a19e8:	0f 28 44 24 50       	movaps xmm0,XMMWORD PTR [rsp+0x50]
     12a19ed:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     12a19f1:	49 89 6e 10          	mov    QWORD PTR [r14+0x10],rbp
     12a19f5:	45 89 66 18          	mov    DWORD PTR [r14+0x18],r12d
     12a19f9:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     12a19fe:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
     12a1a02:	45 88 6e 28          	mov    BYTE PTR [r14+0x28],r13b
     12a1a06:	4d 8d 7e 30          	lea    r15,[r14+0x30]
     12a1a0a:	49 8d be a0 00 00 00 	lea    rdi,[r14+0xa0]

### node allocation call@0x12a6ebc, FDE=(19557624, 19558928)
     12a6eb0:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     12a6eb7:	00 00 
     12a6eb9:	6a 30                	push   0x30
     12a6ebb:	5f                   	pop    rdi
     12a6ebc:	e8 3f 70 54 00       	call   17edf00 <_Znwm@plt>
     12a6ec1:	49 89 c5             	mov    r13,rax
     12a6ec4:	48 8d 05 95 aa 5b 00 	lea    rax,[rip+0x5baa95]        # 1861960 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1e048>
     12a6ecb:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     12a6ecf:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
     12a6ed4:	41 0f 11 45 08       	movups XMMWORD PTR [r13+0x8],xmm0
     12a6ed9:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     12a6ede:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
     12a6ee2:	48 85 c0             	test   rax,rax
     12a6ee5:	74 05                	je     12a6eec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>
     12a6ee7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     12a6eec:	49 89 dc             	mov    r12,rbx
     12a6eef:	49 83 c4 30          	add    r12,0x30

### node allocation call@0x12bd845, FDE=(19649682, 19651774)
     12bd839:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     12bd840:	00 00 
     12bd842:	6a 20                	push   0x20
     12bd844:	5f                   	pop    rdi
     12bd845:	e8 b6 06 53 00       	call   17edf00 <_Znwm@plt>
     12bd84a:	48 89 c5             	mov    rbp,rax
     12bd84d:	4d 89 f7             	mov    r15,r14
     12bd850:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
     12bd855:	48 8d 84 24 8f 00 00 	lea    rax,[rsp+0x8f]
     12bd85c:	00 
     12bd85d:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
     12bd862:	48 c7 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],0x1
     12bd869:	00 01 00 00 00 
     12bd86e:	48 8d 05 cb 48 5a 00 	lea    rax,[rip+0x5a48cb]        # 1862140 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1e828>
     12bd875:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     12bd879:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]

### node allocation call@0x12c26a5, FDE=(19669874, 19672347)
     12c2695:	00 00 
     12c2697:	48 83 a4 24 90 01 00 	and    QWORD PTR [rsp+0x190],0x0
     12c269e:	00 00 
     12c26a0:	bf b0 00 00 00       	mov    edi,0xb0
     12c26a5:	e8 56 b8 52 00       	call   17edf00 <_Znwm@plt>
     12c26aa:	49 89 c6             	mov    r14,rax
     12c26ad:	0f 10 84 24 d0 00 00 	movups xmm0,XMMWORD PTR [rsp+0xd0]
     12c26b4:	00 
     12c26b5:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     12c26b8:	4c 8d 60 10          	lea    r12,[rax+0x10]
     12c26bc:	4c 89 e7             	mov    rdi,r12
     12c26bf:	48 89 ee             	mov    rsi,rbp
     12c26c2:	e8 e5 6a 8b ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     12c26c7:	48 8b 84 24 f8 00 00 	mov    rax,QWORD PTR [rsp+0xf8]
     12c26ce:	00 
     12c26cf:	0f 10 84 24 f0 00 00 	movups xmm0,XMMWORD PTR [rsp+0xf0]
     12c26d6:	00 
     12c26d7:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0

### node allocation call@0x13350a3, FDE=(20139982, 20141171)
     1335095:	4d 85 ed             	test   r13,r13
     1335098:	75 b5                	jne    133504f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a5d3>
     133509a:	4c 8d 73 10          	lea    r14,[rbx+0x10]
     133509e:	bf b0 00 00 00       	mov    edi,0xb0
     13350a3:	e8 58 8e 4b 00       	call   17edf00 <_Znwm@plt>
     13350a8:	49 89 c5             	mov    r13,rax
     13350ab:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     13350b0:	48 83 20 00          	and    QWORD PTR [rax],0x0
     13350b4:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
     13350b9:	4c 89 74 24 20       	mov    QWORD PTR [rsp+0x20],r14
     13350be:	c6 44 24 28 00       	mov    BYTE PTR [rsp+0x28],0x0
     13350c3:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     13350c8:	49 89 45 08          	mov    QWORD PTR [r13+0x8],rax
     13350cc:	49 8d 7d 10          	lea    rdi,[r13+0x10]
     13350d0:	4c 89 e6             	mov    rsi,r12
     13350d3:	e8 b4 06 00 00       	call   133578c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ad10>
     13350d8:	0f 57 c0             	xorps  xmm0,xmm0
     13350db:	41 0f 11 85 a0 00 00 	movups XMMWORD PTR [r13+0xa0],xmm0

### node allocation call@0x133cb34, FDE=(20171126, 20172593)
     133cb28:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     133cb2f:	00 00 
     133cb31:	6a 18                	push   0x18
     133cb33:	5f                   	pop    rdi
     133cb34:	e8 c7 13 4b 00       	call   17edf00 <_Znwm@plt>
     133cb39:	49 89 c7             	mov    r15,rax
     133cb3c:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
     133cb41:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
     133cb46:	48 89 c7             	mov    rdi,rax
     133cb49:	4c 89 e6             	mov    rsi,r12
     133cb4c:	e8 67 b4 82 ff       	call   b67fb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4f58>
     133cb51:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
     133cb56:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     133cb5a:	4c 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r15
     133cb61:	00 
     133cb62:	48 8d 05 d1 b7 8e ff 	lea    rax,[rip+0xffffffffff8eb7d1]        # c2833a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1752da>
     133cb69:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax

### node allocation call@0x133ee15, FDE=(20179748, 20182332)
     133ee09:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     133ee10:	00 00 
     133ee12:	6a 18                	push   0x18
     133ee14:	5f                   	pop    rdi
     133ee15:	e8 e6 f0 4a 00       	call   17edf00 <_Znwm@plt>
     133ee1a:	4c 89 20             	mov    QWORD PTR [rax],r12
     133ee1d:	48 8d 8c 24 80 00 00 	lea    rcx,[rsp+0x80]
     133ee24:	00 
     133ee25:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     133ee29:	48 8d 4c 24 7f       	lea    rcx,[rsp+0x7f]
     133ee2e:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
     133ee32:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     133ee39:	00 
     133ee3a:	49 89 06             	mov    QWORD PTR [r14],rax
     133ee3d:	48 8d 05 ca 34 82 ff 	lea    rax,[rip+0xffffffffff8234ca]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
     133ee44:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     133ee48:	48 8d 05 ed 06 00 00 	lea    rax,[rip+0x6ed]        # 133f53c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184ac0>
     133ee5d:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     133ee76:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
     133ee95:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     133eecc:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     133eefd:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]

### node allocation call@0x133f059, FDE=(20179748, 20182332)
     133f04d:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     133f054:	00 00 
     133f056:	6a 18                	push   0x18
     133f058:	5f                   	pop    rdi
     133f059:	e8 a2 ee 4a 00       	call   17edf00 <_Znwm@plt>
     133f05e:	4c 89 20             	mov    QWORD PTR [rax],r12
     133f061:	48 8d 8c 24 80 00 00 	lea    rcx,[rsp+0x80]
     133f068:	00 
     133f069:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     133f06d:	48 8d 4c 24 7f       	lea    rcx,[rsp+0x7f]
     133f072:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
     133f076:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     133f07d:	00 
     133f07e:	49 89 06             	mov    QWORD PTR [r14],rax
     133f081:	48 8d 05 86 32 82 ff 	lea    rax,[rip+0xffffffffff823286]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
     133f088:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     133f08c:	48 8d 05 0b 06 00 00 	lea    rax,[rip+0x60b]        # 133f69e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184c22>
     133f0c2:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     133f11e:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     133f162:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     133f19d:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     133f1ac:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]

### node allocation call@0x133f32b, FDE=(20179748, 20182332)
     133f31f:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     133f326:	00 00 
     133f328:	6a 18                	push   0x18
     133f32a:	5f                   	pop    rdi
     133f32b:	e8 d0 eb 4a 00       	call   17edf00 <_Znwm@plt>
     133f330:	49 89 c4             	mov    r12,rax
     133f333:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     133f338:	49 89 04 24          	mov    QWORD PTR [r12],rax
     133f33c:	4c 89 e7             	mov    rdi,r12
     133f33f:	48 83 c7 08          	add    rdi,0x8
     133f343:	4c 89 f6             	mov    rsi,r14
     133f346:	e8 6d 8c 82 ff       	call   b67fb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4f58>
     133f34b:	48 8d 84 24 a0 00 00 	lea    rax,[rsp+0xa0]
     133f352:	00 
     133f353:	4c 89 20             	mov    QWORD PTR [rax],r12
     133f356:	48 8d 0d 7d ae 8d ff 	lea    rcx,[rip+0xffffffffff8dae7d]        # c1a1da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16717a>
     133f35d:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
     133f3b7:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     133f431:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     133f446:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
     133f455:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     133f46a:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]

### node allocation call@0x13408fb, FDE=(20186652, 20188035)
     13408eb:	4c 89 f7             	mov    rdi,r14
     13408ee:	44 89 e2             	mov    edx,r12d
     13408f1:	e8 f0 bd 26 00       	call   15ac6e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f1c6a>
     13408f6:	bf b0 00 00 00       	mov    edi,0xb0
     13408fb:	e8 00 d6 4a 00       	call   17edf00 <_Znwm@plt>
     1340900:	49 89 c5             	mov    r13,rax
     1340903:	48 89 c7             	mov    rdi,rax
     1340906:	48 89 ee             	mov    rsi,rbp
     1340909:	4c 89 f2             	mov    rdx,r14
     134090c:	44 89 e1             	mov    ecx,r12d
     134090f:	4d 89 f8             	mov    r8,r15
     1340912:	e8 cb 03 00 00       	call   1340ce2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x186266>
     1340917:	4c 89 f7             	mov    rdi,r14
     134091a:	e8 71 d5 4a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     134091f:	48 8b 43 38          	mov    rax,QWORD PTR [rbx+0x38]
     1340923:	48 8d 48 f8          	lea    rcx,[rax-0x8]
     1340927:	48 39 43 30          	cmp    QWORD PTR [rbx+0x30],rax
     134092b:	48 0f 44 0c 24       	cmove  rcx,QWORD PTR [rsp]
     1340930:	48 8b 39             	mov    rdi,QWORD PTR [rcx]

### node allocation call@0x1340e0c, FDE=(20188584, 20188891)
     1340dfa:	4d 8d 65 50          	lea    r12,[r13+0x50]
     1340dfe:	49 8d 45 10          	lea    rax,[r13+0x10]
     1340e02:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     1340e07:	bf b0 00 00 00       	mov    edi,0xb0
     1340e0c:	e8 ef d0 4a 00       	call   17edf00 <_Znwm@plt>
     1340e11:	48 89 c5             	mov    rbp,rax
     1340e14:	49 8b 75 48          	mov    rsi,QWORD PTR [r13+0x48]
     1340e18:	41 8b 4d 0c          	mov    ecx,DWORD PTR [r13+0xc]
     1340e1c:	48 89 c7             	mov    rdi,rax
     1340e1f:	4c 89 e2             	mov    rdx,r12
     1340e22:	4c 8b 44 24 10       	mov    r8,QWORD PTR [rsp+0x10]
     1340e27:	e8 b6 fe ff ff       	call   1340ce2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x186266>
     1340e2c:	48 89 ef             	mov    rdi,rbp
     1340e2f:	4c 89 ee             	mov    rsi,r13
     1340e32:	e8 a5 00 00 00       	call   1340edc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x186460>
     1340e37:	48 89 6c 24 18       	mov    QWORD PTR [rsp+0x18],rbp
     1340e3c:	48 89 df             	mov    rdi,rbx
     1340e3f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]

### node allocation call@0x1362d5e, FDE=(20327472, 20328601)
     1362d53:	49 83 a5 b0 00 00 00 	and    QWORD PTR [r13+0xb0],0x0
     1362d5a:	00 
     1362d5b:	6a 30                	push   0x30
     1362d5d:	5f                   	pop    rdi
     1362d5e:	e8 9d b1 48 00       	call   17edf00 <_Znwm@plt>
     1362d63:	49 89 c5             	mov    r13,rax
     1362d66:	48 89 c7             	mov    rdi,rax
     1362d69:	4c 89 e6             	mov    rsi,r12
     1362d6c:	e8 1f 75 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     1362d71:	4c 8d a4 24 c8 04 00 	lea    r12,[rsp+0x4c8]
     1362d78:	00 
     1362d79:	4d 89 6c 24 d8       	mov    QWORD PTR [r12-0x28],r13
     1362d7e:	48 8d 05 55 0c 76 ff 	lea    rax,[rip+0xffffffffff760c55]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
     1362d85:	49 89 44 24 e8       	mov    QWORD PTR [r12-0x18],rax
     1362d8a:	48 8d 05 09 03 00 00 	lea    rax,[rip+0x309]        # 136309a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a861e>
     1362d91:	49 89 44 24 f0       	mov    QWORD PTR [r12-0x10],rax
     1362dbe:	41 0f 29 84 24 a8 00 	movaps XMMWORD PTR [r12+0xa8],xmm0
     1362e4a:	41 0f 11 85 a0 00 00 	movups XMMWORD PTR [r13+0xa0],xmm0

### node allocation call@0x13690fa, FDE=(20349868, 20354448)
     13690ea:	00 00 
     13690ec:	48 83 a4 24 b8 01 00 	and    QWORD PTR [rsp+0x1b8],0x0
     13690f3:	00 00 
     13690f5:	bf b0 00 00 00       	mov    edi,0xb0
     13690fa:	e8 01 4e 48 00       	call   17edf00 <_Znwm@plt>
     13690ff:	49 89 c4             	mov    r12,rax
     1369102:	4c 8d ac 24 08 05 00 	lea    r13,[rsp+0x508]
     1369109:	00 
     136910a:	41 0f 10 45 c0       	movups xmm0,XMMWORD PTR [r13-0x40]
     136910f:	41 0f 10 4d d0       	movups xmm1,XMMWORD PTR [r13-0x30]
     1369114:	41 0f 10 55 e0       	movups xmm2,XMMWORD PTR [r13-0x20]
     1369119:	41 0f 10 5d f0       	movups xmm3,XMMWORD PTR [r13-0x10]
     136911e:	0f 11 58 30          	movups XMMWORD PTR [rax+0x30],xmm3
     1369122:	0f 11 50 20          	movups XMMWORD PTR [rax+0x20],xmm2
     1369126:	0f 11 48 10          	movups XMMWORD PTR [rax+0x10],xmm1
     136912a:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     136912d:	41 0f 10 45 00       	movups xmm0,XMMWORD PTR [r13+0x0]

### node allocation call@0x13a2ee7, FDE=(20589724, 20591443)
     13a2ed8:	4d 85 ed             	test   r13,r13
     13a2edb:	75 b4                	jne    13a2e91 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8415>
     13a2edd:	4c 89 64 24 08       	mov    QWORD PTR [rsp+0x8],r12
     13a2ee2:	bf b0 00 00 00       	mov    edi,0xb0
     13a2ee7:	e8 14 b0 44 00       	call   17edf00 <_Znwm@plt>
     13a2eec:	49 89 c5             	mov    r13,rax
     13a2eef:	4c 8d a4 24 e8 00 00 	lea    r12,[rsp+0xe8]
     13a2ef6:	00 
     13a2ef7:	48 8d 43 28          	lea    rax,[rbx+0x28]
     13a2efb:	4c 89 6c 24 28       	mov    QWORD PTR [rsp+0x28],r13
     13a2f00:	49 83 65 00 00       	and    QWORD PTR [r13+0x0],0x0
     13a2f05:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     13a2f0a:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     13a2f0f:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     13a2f14:	49 89 45 08          	mov    QWORD PTR [r13+0x8],rax
     13a2f18:	4c 89 ef             	mov    rdi,r13
     13a2f1b:	48 83 c7 10          	add    rdi,0x10
     13a2f65:	41 88 85 a0 00 00 00 	mov    BYTE PTR [r13+0xa0],al
     13a2f7f:	49 89 85 a8 00 00 00 	mov    QWORD PTR [r13+0xa8],rax

### node allocation call@0x13aba89, FDE=(20625578, 20627949)
     13aba77:	41 0f 10 45 28       	movups xmm0,XMMWORD PTR [r13+0x28]
     13aba7c:	0f 29 84 24 b0 00 00 	movaps XMMWORD PTR [rsp+0xb0],xmm0
     13aba83:	00 
     13aba84:	bf 00 03 00 00       	mov    edi,0x300
     13aba89:	e8 72 24 44 00       	call   17edf00 <_Znwm@plt>
     13aba8e:	48 89 c3             	mov    rbx,rax
     13aba91:	48 83 a4 24 d0 01 00 	and    QWORD PTR [rsp+0x1d0],0x0
     13aba98:	00 00 
     13aba9a:	6a 28                	push   0x28
     13aba9c:	5f                   	pop    rdi
     13aba9d:	e8 5e 24 44 00       	call   17edf00 <_Znwm@plt>
     13abaa2:	49 8d 8d 10 02 00 00 	lea    rcx,[r13+0x210]
     13abaa9:	48 8d 15 08 f1 4b 00 	lea    rdx,[rip+0x4bf108]        # 186abb8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x272a0>
     13abab0:	48 89 10             	mov    QWORD PTR [rax],rdx
     13abab3:	40 88 68 08          	mov    BYTE PTR [rax+0x8],bpl
     13abab7:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
     13ababb:	44 89 60 18          	mov    DWORD PTR [rax+0x18],r12d
     13abb47:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi

### node allocation call@0x13d9ad0, FDE=(20813234, 20814987)
     13d9ac4:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     13d9acb:	00 00 
     13d9acd:	6a 20                	push   0x20
     13d9acf:	5f                   	pop    rdi
     13d9ad0:	e8 2b 44 41 00       	call   17edf00 <_Znwm@plt>
     13d9ad5:	48 8d bb 40 18 00 00 	lea    rdi,[rbx+0x1840]
     13d9adc:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
     13d9ae1:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     13d9ae4:	44 89 70 10          	mov    DWORD PTR [rax+0x10],r14d
     13d9ae8:	4c 89 60 18          	mov    QWORD PTR [rax+0x18],r12
     13d9aec:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     13d9af3:	00 
     13d9af4:	49 89 06             	mov    QWORD PTR [r14],rax
     13d9af7:	48 8d 05 6e 08 00 00 	lea    rax,[rip+0x86e]        # 13da36c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21f8f0>
     13d9afe:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     13d9b02:	48 8d 05 8f 08 00 00 	lea    rax,[rip+0x88f]        # 13da398 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21f91c>
     13d9bd3:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]

### node allocation call@0x140a542, FDE=(21010190, 21015028)
     140a531:	48 89 df             	mov    rdi,rbx
     140a534:	48 83 c7 08          	add    rdi,0x8
     140a538:	e8 cb 32 00 00       	call   140d808 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252d8c>
     140a53d:	bf b0 00 00 00       	mov    edi,0xb0
     140a542:	e8 b9 39 3e 00       	call   17edf00 <_Znwm@plt>
     140a547:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     140a54c:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
     140a550:	4c 89 78 18          	mov    QWORD PTR [rax+0x18],r15
     140a554:	4c 89 60 20          	mov    QWORD PTR [rax+0x20],r12
     140a558:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     140a55d:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
     140a561:	4c 89 70 30          	mov    QWORD PTR [rax+0x30],r14
     140a565:	48 8b 4c 24 38       	mov    rcx,QWORD PTR [rsp+0x38]
     140a56a:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
     140a56e:	4c 89 68 40          	mov    QWORD PTR [rax+0x40],r13
     140a572:	48 89 58 48          	mov    QWORD PTR [rax+0x48],rbx
     140a576:	48 8d 0d 33 60 46 00 	lea    rcx,[rip+0x466033]        # 18705b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2cc98>
     140a5d5:	88 90 a0 00 00 00    	mov    BYTE PTR [rax+0xa0],dl
     140a5db:	89 88 a8 00 00 00    	mov    DWORD PTR [rax+0xa8],ecx

### node allocation call@0x14d027f, FDE=(21814314, 21843276)
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
     14d0310:	49 83 a7 a8 00 00 00 	and    QWORD PTR [r15+0xa8],0x0

### node allocation call@0x14d04a6, FDE=(21814314, 21843276)
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
     14d04d9:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
     14d0571:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi

### node allocation call@0x15491b3, FDE=(22319368, 22320512)
     15491a7:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     15491ae:	00 00 
     15491b0:	6a 70                	push   0x70
     15491b2:	5f                   	pop    rdi
     15491b3:	e8 48 4d 2a 00       	call   17edf00 <_Znwm@plt>
     15491b8:	49 89 c4             	mov    r12,rax
     15491bb:	48 8d 05 fe 5e 33 00 	lea    rax,[rip+0x335efe]        # 187f0c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3b7a8>
     15491c2:	49 89 04 24          	mov    QWORD PTR [r12],rax
     15491c6:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     15491cb:	48 85 c0             	test   rax,rax
     15491ce:	74 18                	je     15491e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38e76c>
     15491d0:	4c 39 f8             	cmp    rax,r15
     15491d3:	74 20                	je     15491f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38e779>
     15491d5:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
     15491da:	49 89 44 24 40       	mov    QWORD PTR [r12+0x40],rax
     15491df:	eb 0e                	jmp    15491ef <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38e773>
     15491e1:	31 db                	xor    ebx,ebx
     15491e3:	e9 95 02 00 00       	jmp    154947d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38ea01>
     15491e8:	4c 89 e1             	mov    rcx,r12

### node allocation call@0x1552802, FDE=(22357812, 22358503)
     15527f4:	4d 85 f6             	test   r14,r14
     15527f7:	75 b9                	jne    15527b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397d36>
     15527f9:	4c 8d 63 10          	lea    r12,[rbx+0x10]
     15527fd:	bf b0 00 00 00       	mov    edi,0xb0
     1552802:	e8 f9 b6 29 00       	call   17edf00 <_Znwm@plt>
     1552807:	49 89 c6             	mov    r14,rax
     155280a:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     155280f:	48 83 20 00          	and    QWORD PTR [rax],0x0
     1552813:	4c 89 64 24 20       	mov    QWORD PTR [rsp+0x20],r12
     1552818:	c6 44 24 28 00       	mov    BYTE PTR [rsp+0x28],0x0
     155281d:	4c 89 78 08          	mov    QWORD PTR [rax+0x8],r15
     1552821:	48 8d 78 10          	lea    rdi,[rax+0x10]
     1552825:	4c 89 ee             	mov    rsi,r13
     1552828:	e8 23 9e b3 ff       	call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>
     155282d:	0f 57 c0             	xorps  xmm0,xmm0
     1552830:	41 0f 11 86 98 00 00 	movups XMMWORD PTR [r14+0x98],xmm0
     1552837:	00 
     155284a:	41 83 a6 a8 00 00 00 	and    DWORD PTR [r14+0xa8],0x0

### node allocation call@0x1554394, FDE=(22364806, 22365677)
     1554386:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
     155438a:	4d 85 e4             	test   r12,r12
     155438d:	75 b6                	jne    1554345 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3998c9>
     155438f:	bf b0 00 00 00       	mov    edi,0xb0
     1554394:	e8 67 9b 29 00       	call   17edf00 <_Znwm@plt>
     1554399:	49 89 c4             	mov    r12,rax
     155439c:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     15543a1:	48 83 20 00          	and    QWORD PTR [rax],0x0
     15543a5:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     15543aa:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     15543af:	c6 44 24 38 00       	mov    BYTE PTR [rsp+0x38],0x0
     15543b4:	4d 89 7c 24 08       	mov    QWORD PTR [r12+0x8],r15
     15543b9:	4d 8d 74 24 10       	lea    r14,[r12+0x10]
     15543be:	4c 89 f7             	mov    rdi,r14
     15543c1:	48 89 ee             	mov    rsi,rbp
     15543c4:	e8 87 82 b3 ff       	call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>
     15543c9:	4c 89 e5             	mov    rbp,r12
     15543d6:	41 83 8c 24 a8 00 00 	or     DWORD PTR [r12+0xa8],0xffffffff
     15543e7:	83 bb a8 00 00 00 ff 	cmp    DWORD PTR [rbx+0xa8],0xffffffff
     15543fc:	48 8b 83 a0 00 00 00 	mov    rax,QWORD PTR [rbx+0xa0]
     1554403:	49 89 84 24 a0 00 00 	mov    QWORD PTR [r12+0xa0],rax
     155440b:	8b 83 a8 00 00 00    	mov    eax,DWORD PTR [rbx+0xa8]
     1554411:	41 89 84 24 a8 00 00 	mov    DWORD PTR [r12+0xa8],eax

### node allocation call@0x1563c15, FDE=(22428606, 22429130)
     1563c09:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     1563c10:	00 00 
     1563c12:	6a 20                	push   0x20
     1563c14:	5f                   	pop    rdi
     1563c15:	e8 e6 a2 28 00       	call   17edf00 <_Znwm@plt>
     1563c1a:	49 89 c7             	mov    r15,rax
     1563c1d:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     1563c22:	48 8d 44 24 40       	lea    rax,[rsp+0x40]
     1563c27:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     1563c2c:	48 c7 44 24 70 01 00 	mov    QWORD PTR [rsp+0x70],0x1
     1563c33:	00 00 
     1563c35:	48 8d 05 ec d2 31 00 	lea    rax,[rip+0x31d2ec]        # 1880f28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3d610>
     1563c3c:	49 89 07             	mov    QWORD PTR [r15],rax
     1563c3f:	4c 89 ff             	mov    rdi,r15
     1563c42:	48 83 c7 08          	add    rdi,0x8
     1563c46:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]

### node allocation call@0x156ab80, FDE=(22457184, 22457246)
     156ab71:	48 89 df             	mov    rdi,rbx
     156ab74:	e8 b3 f8 21 00       	call   178a42c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e598>
     156ab79:	eb 0a                	jmp    156ab85 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0109>
     156ab7b:	bf b0 00 00 00       	mov    edi,0xb0
     156ab80:	e8 7b 33 28 00       	call   17edf00 <_Znwm@plt>
     156ab85:	49 89 c6             	mov    r14,rax
     156ab88:	48 89 c7             	mov    rdi,rax
     156ab8b:	48 89 de             	mov    rsi,rbx
     156ab8e:	e8 af 2b 15 00       	call   16bd742 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x718ae>
     156ab93:	4c 89 f0             	mov    rax,r14
     156ab96:	48 83 c4 08          	add    rsp,0x8
     156ab9a:	5b                   	pop    rbx
     156ab9b:	41 5e                	pop    r14
     156ab9d:	c3                   	ret

### node allocation call@0x1588bd3, FDE=(22579690, 22580744)
     1588bc0:	e8 cb 16 4f ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     1588bc5:	48 83 a4 24 f0 00 00 	and    QWORD PTR [rsp+0xf0],0x0
     1588bcc:	00 00 
     1588bce:	bf b0 00 00 00       	mov    edi,0xb0
     1588bd3:	e8 28 53 26 00       	call   17edf00 <_Znwm@plt>
     1588bd8:	49 89 c5             	mov    r13,rax
     1588bdb:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     1588be0:	48 8d 44 24 5f       	lea    rax,[rsp+0x5f]
     1588be5:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     1588bea:	48 c7 44 24 50 01 00 	mov    QWORD PTR [rsp+0x50],0x1
     1588bf1:	00 00 
     1588bf3:	48 8d 05 8e 93 2f 00 	lea    rax,[rip+0x2f938e]        # 1881f88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3e670>
     1588bfa:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     1588bfe:	48 8b 84 24 50 01 00 	mov    rax,QWORD PTR [rsp+0x150]
     1588c05:	00 
     1588c06:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
     1588ce2:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]

### node allocation call@0x15895c2, FDE=(22582692, 22582854)
     15895b2:	00 00 
     15895b4:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     15895b9:	4c 8d 77 10          	lea    r14,[rdi+0x10]
     15895bd:	bf b0 00 00 00       	mov    edi,0xb0
     15895c2:	e8 39 49 26 00       	call   17edf00 <_Znwm@plt>
     15895c7:	48 89 c3             	mov    rbx,rax
     15895ca:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     15895ce:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
     15895d3:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     15895d8:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
     15895df:	00 00 
     15895e1:	48 8d 05 a0 89 2f 00 	lea    rax,[rip+0x2f89a0]        # 1881f88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3e670>
     15895e8:	48 89 03             	mov    QWORD PTR [rbx],rax
     15895eb:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
     15895ef:	4c 89 f6             	mov    rsi,r14
     15895f2:	e8 9d 03 00 00       	call   1589994 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cef18>
     15895f7:	48 89 e7             	mov    rdi,rsp

### node allocation call@0x15d2cfa, FDE=(22883268, 22884036)
     15d2cee:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     15d2cf5:	00 00 
     15d2cf7:	6a 50                	push   0x50
     15d2cf9:	5f                   	pop    rdi
     15d2cfa:	e8 01 b2 21 00       	call   17edf00 <_Znwm@plt>
     15d2cff:	49 89 c4             	mov    r12,rax
     15d2d02:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     15d2d07:	48 89 c7             	mov    rdi,rax
     15d2d0a:	e8 9d 64 5a ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     15d2d0f:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     15d2d14:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
     15d2d19:	4c 89 e7             	mov    rdi,r12
     15d2d1c:	48 83 c7 18          	add    rdi,0x18
     15d2d20:	4c 89 f6             	mov    rsi,r14
     15d2d23:	e8 aa 44 4d ff       	call   aa71d2 <JNI_OnUnload@@Base+0x2ea9f>
     15d2d28:	0f 10 84 24 88 00 00 	movups xmm0,XMMWORD PTR [rsp+0x88]
     15d2d2f:	00 
     15d2d4f:	48 8d 84 24 a0 00 00 	lea    rax,[rsp+0xa0]
     15d2dbb:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]

### node allocation call@0x15d814d, FDE=(22905056, 22905314)
     15d813d:	4c 89 c7             	mov    rdi,r8
     15d8140:	e8 f1 e0 0b 00       	call   1696236 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a3a2>
     15d8145:	49 89 c7             	mov    r15,rax
     15d8148:	bf b0 00 00 00       	mov    edi,0xb0
     15d814d:	e8 ae 5d 21 00       	call   17edf00 <_Znwm@plt>
     15d8152:	49 89 c4             	mov    r12,rax
     15d8155:	49 83 c6 20          	add    r14,0x20
     15d8159:	48 8d 05 28 ec 2a 00 	lea    rax,[rip+0x2aec28]        # 1886d88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x43470>
     15d8160:	49 89 04 24          	mov    QWORD PTR [r12],rax
     15d8164:	4d 89 7c 24 08       	mov    QWORD PTR [r12+0x8],r15
     15d8169:	49 8d 7c 24 10       	lea    rdi,[r12+0x10]
     15d816e:	4c 89 f6             	mov    rsi,r14
     15d8171:	e8 1a 22 58 ff       	call   b5a390 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa7330>
     15d8176:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15d817d:	00 00 
     15d817f:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]

### node allocation call@0x15e240c, FDE=(22946604, 22947068)
     15e2400:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     15e2407:	00 00 
     15e2409:	6a 30                	push   0x30
     15e240b:	5f                   	pop    rdi
     15e240c:	e8 ef ba 20 00       	call   17edf00 <_Znwm@plt>
     15e2411:	49 89 c5             	mov    r13,rax
     15e2414:	48 8d 44 24 70       	lea    rax,[rsp+0x70]
     15e2419:	0f 28 00             	movaps xmm0,XMMWORD PTR [rax]
     15e241c:	41 0f 11 45 00       	movups XMMWORD PTR [r13+0x0],xmm0
     15e2421:	0f 57 c0             	xorps  xmm0,xmm0
     15e2424:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
     15e2427:	4c 89 ef             	mov    rdi,r13
     15e242a:	48 83 c7 10          	add    rdi,0x10
     15e242e:	4c 89 e6             	mov    rsi,r12
     15e2431:	e8 8a 96 ec ff       	call   14abac0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f1044>
     15e2436:	4c 8d a4 24 a0 00 00 	lea    r12,[rsp+0xa0]
     15e243d:	00 
     15e243e:	4d 89 2c 24          	mov    QWORD PTR [r12],r13
     15e24e2:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]

### node allocation call@0x15e2fdf, FDE=(22949616, 22950096)
     15e2fd3:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     15e2fda:	00 00 
     15e2fdc:	6a 50                	push   0x50
     15e2fde:	5f                   	pop    rdi
     15e2fdf:	e8 1c af 20 00       	call   17edf00 <_Znwm@plt>
     15e2fe4:	48 8d 4c 24 70       	lea    rcx,[rsp+0x70]
     15e2fe9:	4c 89 20             	mov    QWORD PTR [rax],r12
     15e2fec:	49 8b 56 10          	mov    rdx,QWORD PTR [r14+0x10]
     15e2ff0:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
     15e2ff4:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
     15e2ff8:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     15e2ffd:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     15e3001:	0f 57 c9             	xorps  xmm1,xmm1
     15e3004:	41 0f 11 0e          	movups XMMWORD PTR [r14],xmm1
     15e3008:	48 8b 51 10          	mov    rdx,QWORD PTR [rcx+0x10]
     15e300c:	48 89 50 30          	mov    QWORD PTR [rax+0x30],rdx
     15e3010:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
     15e3013:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
     15e3038:	48 8d 8c 24 a0 00 00 	lea    rcx,[rsp+0xa0]
     15e3067:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     15e30b3:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]

### node allocation call@0x15e31bf, FDE=(22950096, 22950576)
     15e31b3:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     15e31ba:	00 00 
     15e31bc:	6a 50                	push   0x50
     15e31be:	5f                   	pop    rdi
     15e31bf:	e8 3c ad 20 00       	call   17edf00 <_Znwm@plt>
     15e31c4:	48 8d 4c 24 70       	lea    rcx,[rsp+0x70]
     15e31c9:	4c 89 20             	mov    QWORD PTR [rax],r12
     15e31cc:	49 8b 56 10          	mov    rdx,QWORD PTR [r14+0x10]
     15e31d0:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
     15e31d4:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
     15e31d8:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     15e31dd:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     15e31e1:	0f 57 c9             	xorps  xmm1,xmm1
     15e31e4:	41 0f 11 0e          	movups XMMWORD PTR [r14],xmm1
     15e31e8:	48 8b 51 10          	mov    rdx,QWORD PTR [rcx+0x10]
     15e31ec:	48 89 50 30          	mov    QWORD PTR [rax+0x30],rdx
     15e31f0:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
     15e31f3:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
     15e3218:	48 8d 8c 24 a0 00 00 	lea    rcx,[rsp+0xa0]
     15e3247:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     15e3293:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]

### node allocation call@0x15ee047, FDE=(22993550, 22998261)
     15ee035:	48 8d b4 24 70 02 00 	lea    rsi,[rsp+0x270]
     15ee03c:	00 
     15ee03d:	e8 66 0f 00 00       	call   15eefa8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43452c>
     15ee042:	bf b0 00 00 00       	mov    edi,0xb0
     15ee047:	e8 b4 fe 1f 00       	call   17edf00 <_Znwm@plt>
     15ee04c:	48 89 c3             	mov    rbx,rax
     15ee04f:	48 89 84 24 40 02 00 	mov    QWORD PTR [rsp+0x240],rax
     15ee056:	00 
     15ee057:	48 8d 84 24 10 02 00 	lea    rax,[rsp+0x210]
     15ee05e:	00 
     15ee05f:	48 89 84 24 48 02 00 	mov    QWORD PTR [rsp+0x248],rax
     15ee066:	00 
     15ee067:	48 c7 84 24 50 02 00 	mov    QWORD PTR [rsp+0x250],0x1
     15ee06e:	00 01 00 00 00 
     15ee073:	48 8d 05 de c9 29 00 	lea    rax,[rip+0x29c9de]        # 188aa58 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x3730>
     15ee07a:	48 89 03             	mov    QWORD PTR [rbx],rax

### node allocation call@0x15f050e, FDE=(23004400, 23004562)
     15f04fe:	00 00 
     15f0500:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     15f0505:	4c 8d 77 10          	lea    r14,[rdi+0x10]
     15f0509:	bf b0 00 00 00       	mov    edi,0xb0
     15f050e:	e8 ed d9 1f 00       	call   17edf00 <_Znwm@plt>
     15f0513:	48 89 c3             	mov    rbx,rax
     15f0516:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     15f051a:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
     15f051f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     15f0524:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
     15f052b:	00 00 
     15f052d:	48 8d 05 24 a5 29 00 	lea    rax,[rip+0x29a524]        # 188aa58 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x3730>
     15f0534:	48 89 03             	mov    QWORD PTR [rbx],rax
     15f0537:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
     15f053b:	4c 89 f6             	mov    rsi,r14
     15f053e:	e8 a1 01 00 00       	call   15f06e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x435c68>
     15f0543:	48 89 e7             	mov    rdi,rsp

### node allocation call@0x15f5530, FDE=(23023428, 23025542)
     15f551d:	e8 9c 02 00 00       	call   15f57be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43ad42>
     15f5522:	48 83 a4 24 50 03 00 	and    QWORD PTR [rsp+0x350],0x0
     15f5529:	00 00 
     15f552b:	bf b0 00 00 00       	mov    edi,0xb0
     15f5530:	e8 cb 89 1f 00       	call   17edf00 <_Znwm@plt>
     15f5535:	49 89 c4             	mov    r12,rax
     15f5538:	48 8d 05 31 5a 29 00 	lea    rax,[rip+0x295a31]        # 188af70 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x3c48>
     15f553f:	49 89 04 24          	mov    QWORD PTR [r12],rax
     15f5543:	4c 89 e7             	mov    rdi,r12
     15f5546:	48 83 c7 10          	add    rdi,0x10
     15f554a:	48 8d b4 24 e0 00 00 	lea    rsi,[rsp+0xe0]
     15f5551:	00 
     15f5552:	e8 67 02 00 00       	call   15f57be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43ad42>
     15f5557:	4c 89 a4 24 50 03 00 	mov    QWORD PTR [rsp+0x350],r12
     15f555e:	00 
     15f555f:	48 8b b4 24 20 03 00 	mov    rsi,QWORD PTR [rsp+0x320]

### node allocation call@0x15f58b2, FDE=(23025812, 23025974)
     15f58a2:	00 00 
     15f58a4:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     15f58a9:	4c 8d 77 10          	lea    r14,[rdi+0x10]
     15f58ad:	bf b0 00 00 00       	mov    edi,0xb0
     15f58b2:	e8 49 86 1f 00       	call   17edf00 <_Znwm@plt>
     15f58b7:	48 89 c3             	mov    rbx,rax
     15f58ba:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     15f58be:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
     15f58c3:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     15f58c8:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
     15f58cf:	00 00 
     15f58d1:	48 8d 05 98 56 29 00 	lea    rax,[rip+0x295698]        # 188af70 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x3c48>
     15f58d8:	48 89 03             	mov    QWORD PTR [rbx],rax
     15f58db:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
     15f58df:	4c 89 f6             	mov    rsi,r14
     15f58e2:	e8 6b 0a 00 00       	call   15f6352 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43b8d6>
     15f58e7:	48 89 e7             	mov    rdi,rsp

### node allocation call@0x160ae3d, FDE=(23113264, 23113330)
     160ae32:	53                   	push   rbx
     160ae33:	50                   	push   rax
     160ae34:	4c 8d 77 10          	lea    r14,[rdi+0x10]
     160ae38:	bf b0 00 00 00       	mov    edi,0xb0
     160ae3d:	e8 be 30 1e 00       	call   17edf00 <_Znwm@plt>
     160ae42:	48 89 c3             	mov    rbx,rax
     160ae45:	48 89 c7             	mov    rdi,rax
     160ae48:	4c 89 f6             	mov    rsi,r14
     160ae4b:	e8 d4 03 00 00       	call   160b224 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6392>
     160ae50:	48 83 c3 28          	add    rbx,0x28
     160ae54:	48 89 d8             	mov    rax,rbx
     160ae57:	48 83 c4 08          	add    rsp,0x8
     160ae5b:	5b                   	pop    rbx
     160ae5c:	41 5e                	pop    r14
     160ae5e:	c3                   	ret
     160ae5f:	49 89 c6             	mov    r14,rax
     160ae62:	48 89 df             	mov    rdi,rbx
     160ae65:	e8 b6 30 1e 00       	call   17edf20 <_ZdlPv@plt>
     160ae6a:	4c 89 f7             	mov    rdi,r14
     160ae6d:	e8 5e 4e 46 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>

### node allocation call@0x160af83, FDE=(23113524, 23113777)
     160af73:	48 83 7b 30 00       	cmp    QWORD PTR [rbx+0x30],0x0
     160af78:	74 44                	je     160afbe <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x612c>
     160af7a:	4c 8b 63 08          	mov    r12,QWORD PTR [rbx+0x8]
     160af7e:	bf b0 00 00 00       	mov    edi,0xb0
     160af83:	e8 78 2f 1e 00       	call   17edf00 <_Znwm@plt>
     160af88:	49 89 c7             	mov    r15,rax
     160af8b:	48 89 c7             	mov    rdi,rax
     160af8e:	4c 89 e6             	mov    rsi,r12
     160af91:	e8 8e 02 00 00       	call   160b224 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6392>
     160af96:	89 ef                	mov    edi,ebp
     160af98:	e8 01 27 00 00       	call   160d69e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x880c>
     160af9d:	41 89 6f 10          	mov    DWORD PTR [r15+0x10],ebp
     160afa1:	4c 89 ff             	mov    rdi,r15
     160afa4:	e8 39 27 00 00       	call   160d6e2 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8850>
     160afa9:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
     160afad:	49 83 c7 28          	add    r15,0x28
     160afb1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     160afb4:	4c 89 fe             	mov    rsi,r15
     160afb7:	4c 89 f2             	mov    rdx,r14
     160afec:	48 3b 84 24 a8 00 00 	cmp    rax,QWORD PTR [rsp+0xa8]
     160b01a:	48 3b 84 24 a8 00 00 	cmp    rax,QWORD PTR [rsp+0xa8]

### node allocation call@0x1669c72, FDE=(23501546, 23502306)
     1669c5d:	e8 70 6c 06 00       	call   16d08d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84a3e>
     1669c62:	41 8a 46 51          	mov    al,BYTE PTR [r14+0x51]
     1669c66:	88 84 24 98 01 00 00 	mov    BYTE PTR [rsp+0x198],al
     1669c6d:	bf b0 00 00 00       	mov    edi,0xb0
     1669c72:	e8 89 42 18 00       	call   17edf00 <_Znwm@plt>
     1669c77:	49 89 c4             	mov    r12,rax
     1669c7a:	49 83 c6 10          	add    r14,0x10
     1669c7e:	48 8d 05 ab eb 22 00 	lea    rax,[rip+0x22ebab]        # 1898830 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x5770>
     1669c85:	49 89 04 24          	mov    QWORD PTR [r12],rax
     1669c89:	49 8d 7c 24 10       	lea    rdi,[r12+0x10]
     1669c8e:	4c 8d ac 24 00 01 00 	lea    r13,[rsp+0x100]
     1669c95:	00 
     1669c96:	4c 89 ee             	mov    rsi,r13
     1669c99:	e8 5a 54 c4 ff       	call   12af0f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf467c>
     1669c9e:	4c 89 e7             	mov    rdi,r12
     1669ca1:	48 83 c7 40          	add    rdi,0x40
     1669ca5:	4c 89 fe             	mov    rsi,r15
     1669cb4:	41 88 84 24 a8 00 00 	mov    BYTE PTR [r12+0xa8],al

### node allocation call@0x1669e3c, FDE=(23502366, 23502528)
     1669e2c:	00 00 
     1669e2e:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     1669e33:	4c 8d 77 10          	lea    r14,[rdi+0x10]
     1669e37:	bf b0 00 00 00       	mov    edi,0xb0
     1669e3c:	e8 bf 40 18 00       	call   17edf00 <_Znwm@plt>
     1669e41:	48 89 c3             	mov    rbx,rax
     1669e44:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     1669e48:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
     1669e4d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1669e52:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
     1669e59:	00 00 
     1669e5b:	48 8d 05 ce e9 22 00 	lea    rax,[rip+0x22e9ce]        # 1898830 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x5770>
     1669e62:	48 89 03             	mov    QWORD PTR [rbx],rax
     1669e65:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
     1669e69:	4c 89 f6             	mov    rsi,r14
     1669e6c:	e8 15 05 00 00       	call   166a386 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e4f2>
     1669e71:	48 89 e7             	mov    rdi,rsp

### node allocation call@0x1682827, FDE=(23603156, 23603404)
     168281b:	74 65                	je     1682882 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x369ee>
     168281d:	4c 8d b3 b0 00 00 00 	lea    r14,[rbx+0xb0]
     1682824:	6a 48                	push   0x48
     1682826:	5f                   	pop    rdi
     1682827:	e8 d4 b6 16 00       	call   17edf00 <_Znwm@plt>
     168282c:	49 89 c7             	mov    r15,rax
     168282f:	48 81 c3 a8 00 00 00 	add    rbx,0xa8
     1682836:	48 83 60 08 00       	and    QWORD PTR [rax+0x8],0x0
     168283b:	0f 57 c0             	xorps  xmm0,xmm0
     168283e:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
     1682842:	48 8d 05 8f 6c 21 00 	lea    rax,[rip+0x216c8f]        # 18994d8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x6418>
     1682849:	49 89 07             	mov    QWORD PTR [r15],rax
     168284c:	48 89 df             	mov    rdi,rbx
     168284f:	e8 e2 39 01 00       	call   1696236 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a3a2>
     1682854:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
     1682858:	66 41 c7 47 38 00 01 	mov    WORD PTR [r15+0x38],0x100

### node allocation call@0x168a855, FDE=(23635304, 23643831)
     168a844:	ba b0 00 00 00       	mov    edx,0xb0
     168a849:	31 f6                	xor    esi,esi
     168a84b:	e8 40 43 16 00       	call   17eeb90 <memset@plt>
     168a850:	bf e8 00 00 00       	mov    edi,0xe8
     168a855:	e8 a6 36 16 00       	call   17edf00 <_Znwm@plt>
     168a85a:	49 89 c7             	mov    r15,rax
     168a85d:	4c 89 28             	mov    QWORD PTR [rax],r13
     168a860:	48 89 40 08          	mov    QWORD PTR [rax+0x8],rax
     168a864:	48 89 40 10          	mov    QWORD PTR [rax+0x10],rax
     168a868:	83 60 18 00          	and    DWORD PTR [rax+0x18],0x0
     168a86c:	48 8d 78 20          	lea    rdi,[rax+0x20]
     168a870:	ba b0 00 00 00       	mov    edx,0xb0
     168a875:	31 f6                	xor    esi,esi
     168a877:	e8 14 43 16 00       	call   17eeb90 <memset@plt>
     168a87c:	41 83 8f d0 00 00 00 	or     DWORD PTR [r15+0xd0],0xffffffff
     168a883:	ff 
     168a884:	4d 89 a7 d8 00 00 00 	mov    QWORD PTR [r15+0xd8],r12

### node allocation call@0x16a0681, FDE=(23725588, 23726148)
     16a0670:	f3 0f 7f 0b          	movdqu XMMWORD PTR [rbx],xmm1
     16a0674:	e9 58 01 00 00       	jmp    16a07d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5493d>
     16a0679:	49 89 f7             	mov    r15,rsi
     16a067c:	bf b0 00 00 00       	mov    edi,0xb0
     16a0681:	e8 7a d8 14 00       	call   17edf00 <_Znwm@plt>
     16a0686:	49 89 c6             	mov    r14,rax
     16a0689:	0f 57 c0             	xorps  xmm0,xmm0
     16a068c:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     16a0690:	48 8d 05 d1 cd 15 00 	lea    rax,[rip+0x15cdd1]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     16a0697:	49 89 06             	mov    QWORD PTR [r14],rax
     16a069a:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     16a069f:	4c 89 fe             	mov    rsi,r15
     16a06a2:	e8 99 d8 14 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     16a06a7:	66 0f ef c9          	pxor   xmm1,xmm1
     16a06ab:	f3 41 0f 7f 4e 20    	movdqu XMMWORD PTR [r14+0x20],xmm1
     16a06b1:	48 8d 05 00 a3 1f 00 	lea    rax,[rip+0x1fa300]        # 189a9b8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x78f8>
     16a0746:	f3 41 0f 7f 86 a0 00 	movdqu XMMWORD PTR [r14+0xa0],xmm0

### node allocation call@0x16fa969, FDE=(24094122, 24101943)
     16fa95a:	74 17                	je     16fa973 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaeadf>
     16fa95c:	49 39 f6             	cmp    r14,rsi
     16fa95f:	0f 87 4b 19 00 00    	ja     16fc2b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb041c>
     16fa965:	49 6b fe 14          	imul   rdi,r14,0x14
     16fa969:	e8 92 35 0f 00       	call   17edf00 <_Znwm@plt>
     16fa96e:	48 89 c3             	mov    rbx,rax
     16fa971:	eb 02                	jmp    16fa975 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaeae1>
     16fa973:	31 db                	xor    ebx,ebx
     16fa975:	48 6b ed 14          	imul   rbp,rbp,0x14
     16fa979:	48 01 dd             	add    rbp,rbx
     16fa97c:	48 89 ef             	mov    rdi,rbp
     16fa97f:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     16fa984:	e8 03 2e 00 00       	call   16fd78c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb18f8>
     16fa989:	48 89 e8             	mov    rax,rbp
     16fa98c:	4d 39 e5             	cmp    r13,r12
     16fa98f:	74 31                	je     16fa9c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaeb2e>
     16fa991:	41 8b 4d fc          	mov    ecx,DWORD PTR [r13-0x4]
     16fa995:	89 48 fc             	mov    DWORD PTR [rax-0x4],ecx
     16fa998:	f3 41 0f 6f 45 ec    	movdqu xmm0,XMMWORD PTR [r13-0x14]
     16fa99e:	49 8d 4d ec          	lea    rcx,[r13-0x14]

### node allocation call@0x16fc4cd, FDE=(24101982, 24103905)
     16fc4c6:	85 c0                	test   eax,eax
     16fc4c8:	74 c0                	je     16fc48a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb05f6>
     16fc4ca:	6a 78                	push   0x78
     16fc4cc:	5f                   	pop    rdi
     16fc4cd:	e8 2e 1a 0f 00       	call   17edf00 <_Znwm@plt>
     16fc4d2:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     16fc4d6:	e8 53 b3 02 00       	call   172782e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdb99a>
     16fc4db:	48 89 c3             	mov    rbx,rax
     16fc4de:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     16fc4e2:	48 83 20 00          	and    QWORD PTR [rax],0x0
     16fc4e6:	6a 20                	push   0x20
     16fc4e8:	5f                   	pop    rdi
     16fc4e9:	e8 12 1a 0f 00       	call   17edf00 <_Znwm@plt>
     16fc4ee:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
     16fc4f2:	48 83 c1 08          	add    rcx,0x8
     16fc4f6:	66 0f ef c0          	pxor   xmm0,xmm0
     16fc4fa:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
     16fc4fe:	48 89 4c 24 68       	mov    QWORD PTR [rsp+0x68],rcx
     16fc570:	f3 0f 7f 81 a8 00 00 	movdqu XMMWORD PTR [rcx+0xa8],xmm0
     16fc613:	48 8d ac 24 a0 00 00 	lea    rbp,[rsp+0xa0]

### node allocation call@0x1727810, FDE=(24279024, 24279086)
     1727801:	48 89 df             	mov    rdi,rbx
     1727804:	e8 23 2c 06 00       	call   178a42c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e598>
     1727809:	eb 0a                	jmp    1727815 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdb981>
     172780b:	bf b0 00 00 00       	mov    edi,0xb0
     1727810:	e8 eb 66 0c 00       	call   17edf00 <_Znwm@plt>
     1727815:	49 89 c6             	mov    r14,rax
     1727818:	48 89 c7             	mov    rdi,rax
     172781b:	48 89 de             	mov    rsi,rbx
     172781e:	e8 0d 6e 00 00       	call   172e630 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe279c>
     1727823:	4c 89 f0             	mov    rax,r14
     1727826:	48 83 c4 08          	add    rsp,0x8
     172782a:	5b                   	pop    rbx
     172782b:	41 5e                	pop    r14
     172782d:	c3                   	ret

### node allocation call@0x1733853, FDE=(24328222, 24328305)
     1733846:	48 89 c7             	mov    rdi,rax
     1733849:	4c 89 fe             	mov    rsi,r15
     173384c:	eb 12                	jmp    1733860 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe79cc>
     173384e:	bf b0 00 00 00       	mov    edi,0xb0
     1733853:	e8 a8 a6 0b 00       	call   17edf00 <_Znwm@plt>
     1733858:	49 89 c6             	mov    r14,rax
     173385b:	48 89 c7             	mov    rdi,rax
     173385e:	31 f6                	xor    esi,esi
     1733860:	48 89 da             	mov    rdx,rbx
     1733863:	e8 c6 00 00 00       	call   173392e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe7a9a>
     1733868:	4c 89 f0             	mov    rax,r14
     173386b:	5b                   	pop    rbx
     173386c:	41 5e                	pop    r14
     173386e:	41 5f                	pop    r15
     1733870:	c3                   	ret

## All writes to +0xa0/+0xa8 in 0x1330000..0x1340000
### 0x1331d2b, FDE=(20126670, 20131289): mov    QWORD PTR [rsp+0xa8],rax
     1331d02:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]
     1331d06:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     1331d0b:	48 8b 45 28          	mov    rax,QWORD PTR [rbp+0x28]
     1331d0f:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     1331d14:	4c 8b 65 30          	mov    r12,QWORD PTR [rbp+0x30]
     1331d18:	f3 0f 6f 45 38       	movdqu xmm0,XMMWORD PTR [rbp+0x38]
     1331d1d:	66 0f 7f 44 24 20    	movdqa XMMWORD PTR [rsp+0x20],xmm0
     1331d23:	48 8b 5d 50          	mov    rbx,QWORD PTR [rbp+0x50]
     1331d27:	48 8b 45 70          	mov    rax,QWORD PTR [rbp+0x70]
     1331d2b:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     1331d32:	00 
     1331d33:	4c 8b 7d 78          	mov    r15,QWORD PTR [rbp+0x78]
     1331d37:	bf e0 02 00 00       	mov    edi,0x2e0
     1331d3c:	e8 bf c1 4b 00       	call   17edf00 <_Znwm@plt>
     1331d41:	48 89 c5             	mov    rbp,rax
     1331d44:	49 83 c5 58          	add    r13,0x58
     1331d48:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
     1331d4f:	00 
     1331d50:	4c 89 ee             	mov    rsi,r13
     1331d53:	e8 88 a2 9d ff       	call   d0bfe0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x258f80>
     1331d58:	0f 28 84 24 00 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x100]
     1331d5f:	00 
     1331d60:	0f 29 84 24 c0 00 00 	movaps XMMWORD PTR [rsp+0xc0],xmm0
     1331d67:	00 
     1331d68:	48 8b 84 24 08 01 00 	mov    rax,QWORD PTR [rsp+0x108]

### 0x1331eda, FDE=(20126670, 20131289): mov    QWORD PTR [rsp+0xa0],rbx
     1331eb4:	48 8d 85 18 02 00 00 	lea    rax,[rbp+0x218]
     1331ebb:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     1331ec0:	48 83 a5 18 02 00 00 	and    QWORD PTR [rbp+0x218],0x0
     1331ec7:	00 
     1331ec8:	48 8d bd 20 02 00 00 	lea    rdi,[rbp+0x220]
     1331ecf:	6a 01                	push   0x1
     1331ed1:	59                   	pop    rcx
     1331ed2:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
     1331ed9:	00 
     1331eda:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
     1331ee1:	00 
     1331ee2:	48 89 de             	mov    rsi,rbx
     1331ee5:	89 ca                	mov    edx,ecx
     1331ee7:	41 89 c8             	mov    r8d,ecx
     1331eea:	4c 8b 4c 24 40       	mov    r9,QWORD PTR [rsp+0x40]
     1331eef:	e8 90 9f f9 ff       	call   12cbe84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x111408>
     1331ef4:	83 a5 30 02 00 00 00 	and    DWORD PTR [rbp+0x230],0x0
     1331efb:	66 83 a5 34 02 00 00 	and    WORD PTR [rbp+0x234],0x0
     1331f02:	00 
     1331f03:	4c 8b bd 38 01 00 00 	mov    r15,QWORD PTR [rbp+0x138]
     1331f0a:	48 8b 9d 40 01 00 00 	mov    rbx,QWORD PTR [rbp+0x140]
     1331f11:	4c 29 fb             	sub    rbx,r15
     1331f14:	0f 84 a7 00 00 00    	je     1331fc1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177545>
     1331f1a:	4c 89 74 24 38       	mov    QWORD PTR [rsp+0x38],r14
     1331f1f:	48 89 6c 24 20       	mov    QWORD PTR [rsp+0x20],rbp

### 0x13336ef, FDE=(20131328, 20138970): mov    QWORD PTR [rsp+0xa8],rdi
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

### 0x133373f, FDE=(20131328, 20138970): mov    QWORD PTR [rsp+0xa0],rdi
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

### 0x13339b2, FDE=(20131328, 20138970): call   QWORD PTR [rax+0xa8]
     1333993:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1333996:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1333999:	a8 02                	test   al,0x2
     133399b:	75 1b                	jne    13339b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178f3c>
     133399d:	48 8b bb c8 03 00 00 	mov    rdi,QWORD PTR [rbx+0x3c8]
     13339a4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13339a7:	48 8d b4 24 a0 01 00 	lea    rsi,[rsp+0x1a0]
     13339ae:	00 
     13339af:	4c 89 fa             	mov    rdx,r15
     13339b2:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     13339b8:	48 8b bb b8 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5b8]
     13339bf:	4c 8d 7b 10          	lea    r15,[rbx+0x10]
     13339c3:	48 8d 05 16 25 53 00 	lea    rax,[rip+0x532516]        # 1865ee0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x225c8>
     13339ca:	48 8d 94 24 c0 04 00 	lea    rdx,[rsp+0x4c0]
     13339d1:	00 
     13339d2:	48 89 02             	mov    QWORD PTR [rdx],rax
     13339d5:	48 89 5a 08          	mov    QWORD PTR [rdx+0x8],rbx
     13339d9:	48 89 52 20          	mov    QWORD PTR [rdx+0x20],rdx
     13339dd:	4c 89 fe             	mov    rsi,r15
     13339e0:	e8 4f 2d ff ff       	call   1326734 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16bcb8>
     13339e5:	48 8d bc 24 c0 04 00 	lea    rdi,[rsp+0x4c0]
     13339ec:	00 
     13339ed:	e8 78 65 74 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     13339f2:	48 8b ab 68 03 00 00 	mov    rbp,QWORD PTR [rbx+0x368]
     13339f9:	48 8b 83 70 03 00 00 	mov    rax,QWORD PTR [rbx+0x370]

### 0x13350db, FDE=(20139982, 20141171): movups XMMWORD PTR [r13+0xa0],xmm0
     13350b4:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
     13350b9:	4c 89 74 24 20       	mov    QWORD PTR [rsp+0x20],r14
     13350be:	c6 44 24 28 00       	mov    BYTE PTR [rsp+0x28],0x0
     13350c3:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     13350c8:	49 89 45 08          	mov    QWORD PTR [r13+0x8],rax
     13350cc:	49 8d 7d 10          	lea    rdi,[r13+0x10]
     13350d0:	4c 89 e6             	mov    rsi,r12
     13350d3:	e8 b4 06 00 00       	call   133578c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ad10>
     13350d8:	0f 57 c0             	xorps  xmm0,xmm0
     13350db:	41 0f 11 85 a0 00 00 	movups XMMWORD PTR [r13+0xa0],xmm0
     13350e2:	00 
     13350e3:	c6 44 24 28 01       	mov    BYTE PTR [rsp+0x28],0x1
     13350e8:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]
     13350ec:	48 ff c0             	inc    rax
     13350ef:	78 07                	js     13350f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a67c>
     13350f1:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     13350f6:	eb 15                	jmp    133510d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a691>
     13350f8:	48 89 c1             	mov    rcx,rax
     13350fb:	48 d1 e9             	shr    rcx,1
     13350fe:	83 e0 01             	and    eax,0x1
     1335101:	48 09 c8             	or     rax,rcx
     1335104:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     1335109:	f3 0f 58 c0          	addss  xmm0,xmm0
     133510d:	48 89 e9             	mov    rcx,rbp
     1335110:	48 d1 e9             	shr    rcx,1

### 0x1335b59, FDE=(20142202, 20144284): and    QWORD PTR [r13+0xa0],0x0
     1335b34:	49 83 65 00 00       	and    QWORD PTR [r13+0x0],0x0
     1335b39:	c6 84 24 08 01 00 00 	mov    BYTE PTR [rsp+0x108],0x0
     1335b40:	00 
     1335b41:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1335b46:	49 89 45 08          	mov    QWORD PTR [r13+0x8],rax
     1335b4a:	4c 89 ef             	mov    rdi,r13
     1335b4d:	48 83 c7 10          	add    rdi,0x10
     1335b51:	48 89 ee             	mov    rsi,rbp
     1335b54:	e8 33 fc ff ff       	call   133578c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ad10>
     1335b59:	49 83 a5 a0 00 00 00 	and    QWORD PTR [r13+0xa0],0x0
     1335b60:	00 
     1335b61:	c6 84 24 08 01 00 00 	mov    BYTE PTR [rsp+0x108],0x1
     1335b68:	01 
     1335b69:	49 8b 47 70          	mov    rax,QWORD PTR [r15+0x70]
     1335b6d:	48 ff c0             	inc    rax
     1335b70:	78 07                	js     1335b79 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b0fd>
     1335b72:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     1335b77:	eb 15                	jmp    1335b8e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b112>
     1335b79:	48 89 c1             	mov    rcx,rax
     1335b7c:	48 d1 e9             	shr    rcx,1
     1335b7f:	83 e0 01             	and    eax,0x1
     1335b82:	48 09 c8             	or     rax,rcx
     1335b85:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     1335b8a:	f3 0f 58 c0          	addss  xmm0,xmm0
     1335b8e:	48 8b 54 24 20       	mov    rdx,QWORD PTR [rsp+0x20]

### 0x133627f, FDE=(20144732, 20145944): mov    QWORD PTR [rsp+0xa0],rax
     1336261:	41 55                	push   r13
     1336263:	41 54                	push   r12
     1336265:	53                   	push   rbx
     1336266:	48 81 ec a8 00 00 00 	sub    rsp,0xa8
     133626d:	49 89 d6             	mov    r14,rdx
     1336270:	49 89 f7             	mov    r15,rsi
     1336273:	48 89 fd             	mov    rbp,rdi
     1336276:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     133627d:	00 00 
     133627f:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     1336286:	00 
     1336287:	80 ba 50 01 00 00 00 	cmp    BYTE PTR [rdx+0x150],0x0
     133628e:	0f 84 c1 00 00 00    	je     1336355 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b8d9>
     1336294:	48 89 2c 24          	mov    QWORD PTR [rsp],rbp
     1336298:	4d 8b a7 d8 00 00 00 	mov    r12,QWORD PTR [r15+0xd8]
     133629f:	4c 89 74 24 60       	mov    QWORD PTR [rsp+0x60],r14
     13362a4:	49 8b 5c 24 40       	mov    rbx,QWORD PTR [r12+0x40]
     13362a9:	48 85 db             	test   rbx,rbx
     13362ac:	74 52                	je     1336300 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b884>
     13362ae:	4c 8d ac 24 80 00 00 	lea    r13,[rsp+0x80]
     13362b5:	00 
     13362b6:	48 8d 6c 24 60       	lea    rbp,[rsp+0x60]
     13362bb:	48 8d b3 00 02 00 00 	lea    rsi,[rbx+0x200]
     13362c2:	4c 89 ef             	mov    rdi,r13
     13362c5:	e8 66 50 77 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>

### 0x133798a, FDE=(20150608, 20150692): movups XMMWORD PTR [rdi+0xa0],xmm0
     1337964:	48 83 a7 80 00 00 00 	and    QWORD PTR [rdi+0x80],0x0
     133796b:	00 
     133796c:	0f 57 c0             	xorps  xmm0,xmm0
     133796f:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
     1337973:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0
     1337977:	0f 11 47 28          	movups XMMWORD PTR [rdi+0x28],xmm0
     133797b:	0f 11 47 38          	movups XMMWORD PTR [rdi+0x38],xmm0
     133797f:	0f 11 47 48          	movups XMMWORD PTR [rdi+0x48],xmm0
     1337983:	0f 11 87 90 00 00 00 	movups XMMWORD PTR [rdi+0x90],xmm0
     133798a:	0f 11 87 a0 00 00 00 	movups XMMWORD PTR [rdi+0xa0],xmm0
     1337991:	c6 87 b0 00 00 00 01 	mov    BYTE PTR [rdi+0xb0],0x1
     1337998:	48 81 c7 b8 00 00 00 	add    rdi,0xb8
     133799f:	e9 ea 08 7f ff       	jmp    b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     13379a4:	55                   	push   rbp
     13379a5:	41 57                	push   r15
     13379a7:	41 56                	push   r14
     13379a9:	41 55                	push   r13
     13379ab:	41 54                	push   r12
     13379ad:	53                   	push   rbx
     13379ae:	48 83 ec 18          	sub    rsp,0x18
     13379b2:	45 89 ce             	mov    r14d,r9d
     13379b5:	45 89 c5             	mov    r13d,r8d
     13379b8:	89 cd                	mov    ebp,ecx
     13379ba:	49 89 d7             	mov    r15,rdx
     13379bd:	49 89 f4             	mov    r12,rsi

### 0x1338a8a, FDE=(20155014, 20155058): cmp    BYTE PTR [rdi+0xa8],0x0
     1338a6e:	48 3b 84 24 c0 00 00 	cmp    rax,QWORD PTR [rsp+0xc0]
     1338a75:	00 
     1338a76:	75 08                	jne    1338a80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e004>
     1338a78:	48 89 df             	mov    rdi,rbx
     1338a7b:	e8 50 72 73 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1338a80:	e8 2b 70 4b 00       	call   17efab0 <__stack_chk_fail@plt>
     1338a85:	cc                   	int3
     1338a86:	53                   	push   rbx
     1338a87:	48 89 fb             	mov    rbx,rdi
     1338a8a:	80 bf a8 00 00 00 00 	cmp    BYTE PTR [rdi+0xa8],0x0
     1338a91:	74 09                	je     1338a9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e020>
     1338a93:	48 8d 7b 68          	lea    rdi,[rbx+0x68]
     1338a97:	e8 c2 01 00 00       	call   1338c5e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e1e2>
     1338a9c:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
     1338aa0:	e8 b9 01 00 00       	call   1338c5e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e1e2>
     1338aa5:	48 83 c3 08          	add    rbx,0x8
     1338aa9:	48 89 df             	mov    rdi,rbx
     1338aac:	5b                   	pop    rbx
     1338aad:	e9 64 36 ff ff       	jmp    132c116 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17169a>
     1338ab2:	80 7f 20 00          	cmp    BYTE PTR [rdi+0x20],0x0
     1338ab6:	0f 85 c8 36 ff ff    	jne    132c184 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x171708>
     1338abc:	c3                   	ret
     1338abd:	cc                   	int3
     1338abe:	53                   	push   rbx
     1338abf:	48 89 fb             	mov    rbx,rdi

### 0x13391c9, FDE=(20156600, 20158873): mov    QWORD PTR [rsp+0xa0],rcx
     13391a6:	48 8d 94 24 08 02 00 	lea    rdx,[rsp+0x208]
     13391ad:	00 
     13391ae:	48 89 02             	mov    QWORD PTR [rdx],rax
     13391b1:	48 89 8c 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rcx
     13391b8:	00 
     13391b9:	48 89 94 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdx
     13391c0:	00 
     13391c1:	48 8d 8c 24 20 02 00 	lea    rcx,[rsp+0x220]
     13391c8:	00 
     13391c9:	48 89 8c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rcx
     13391d0:	00 
     13391d1:	49 6b cf 18          	imul   rcx,r15,0x18
     13391d5:	31 ff                	xor    edi,edi
     13391d7:	48 8d 15 02 d7 52 00 	lea    rdx,[rip+0x52d702]        # 18668e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22fc8>
     13391de:	48 89 fe             	mov    rsi,rdi
     13391e1:	48 89 14 38          	mov    QWORD PTR [rax+rdi*1],rdx
     13391e5:	49 8b 7c 3e 08       	mov    rdi,QWORD PTR [r14+rdi*1+0x8]
     13391ea:	48 89 7c 30 08       	mov    QWORD PTR [rax+rsi*1+0x8],rdi
     13391ef:	49 8b 7c 36 10       	mov    rdi,QWORD PTR [r14+rsi*1+0x10]
     13391f4:	48 89 7c 30 10       	mov    QWORD PTR [rax+rsi*1+0x10],rdi
     13391f9:	48 85 ff             	test   rdi,rdi
     13391fc:	74 05                	je     1339203 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e787>
     13391fe:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
     1339203:	48 8d 7e 18          	lea    rdi,[rsi+0x18]
     1339207:	48 39 f9             	cmp    rcx,rdi

### 0x13394b7, FDE=(20156600, 20158873): mov    QWORD PTR [r15+0xa0],rax
     1339480:	49 89 87 80 00 00 00 	mov    QWORD PTR [r15+0x80],rax
     1339487:	48 8d 84 24 20 02 00 	lea    rax,[rsp+0x220]
     133948e:	00 
     133948f:	49 89 87 88 00 00 00 	mov    QWORD PTR [r15+0x88],rax
     1339496:	48 8d 83 98 00 00 00 	lea    rax,[rbx+0x98]
     133949d:	49 89 87 90 00 00 00 	mov    QWORD PTR [r15+0x90],rax
     13394a4:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     13394a9:	49 89 87 98 00 00 00 	mov    QWORD PTR [r15+0x98],rax
     13394b0:	48 8d 83 78 05 00 00 	lea    rax,[rbx+0x578]
     13394b7:	49 89 87 a0 00 00 00 	mov    QWORD PTR [r15+0xa0],rax
     13394be:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     13394c3:	49 89 87 a8 00 00 00 	mov    QWORD PTR [r15+0xa8],rax
     13394ca:	f2 41 0f 10 47 e8    	movsd  xmm0,QWORD PTR [r15-0x18]
     13394d0:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     13394d5:	41 0f 10 47 f0       	movups xmm0,XMMWORD PTR [r15-0x10]
     13394da:	0f 11 84 24 0c 02 00 	movups XMMWORD PTR [rsp+0x20c],xmm0
     13394e1:	00 
     13394e2:	f2 41 0f 10 07       	movsd  xmm0,QWORD PTR [r15]
     13394e7:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     13394ec:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13394ef:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
     13394f5:	48 85 c0             	test   rax,rax
     13394f8:	74 06                	je     1339500 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ea84>
     13394fa:	44 8a 68 5b          	mov    r13b,BYTE PTR [rax+0x5b]
     13394fe:	eb 03                	jmp    1339503 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ea87>

### 0x13394c3, FDE=(20156600, 20158873): mov    QWORD PTR [r15+0xa8],rax
     133948e:	00 
     133948f:	49 89 87 88 00 00 00 	mov    QWORD PTR [r15+0x88],rax
     1339496:	48 8d 83 98 00 00 00 	lea    rax,[rbx+0x98]
     133949d:	49 89 87 90 00 00 00 	mov    QWORD PTR [r15+0x90],rax
     13394a4:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     13394a9:	49 89 87 98 00 00 00 	mov    QWORD PTR [r15+0x98],rax
     13394b0:	48 8d 83 78 05 00 00 	lea    rax,[rbx+0x578]
     13394b7:	49 89 87 a0 00 00 00 	mov    QWORD PTR [r15+0xa0],rax
     13394be:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     13394c3:	49 89 87 a8 00 00 00 	mov    QWORD PTR [r15+0xa8],rax
     13394ca:	f2 41 0f 10 47 e8    	movsd  xmm0,QWORD PTR [r15-0x18]
     13394d0:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     13394d5:	41 0f 10 47 f0       	movups xmm0,XMMWORD PTR [r15-0x10]
     13394da:	0f 11 84 24 0c 02 00 	movups XMMWORD PTR [rsp+0x20c],xmm0
     13394e1:	00 
     13394e2:	f2 41 0f 10 07       	movsd  xmm0,QWORD PTR [r15]
     13394e7:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     13394ec:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13394ef:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
     13394f5:	48 85 c0             	test   rax,rax
     13394f8:	74 06                	je     1339500 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ea84>
     13394fa:	44 8a 68 5b          	mov    r13b,BYTE PTR [rax+0x5b]
     13394fe:	eb 03                	jmp    1339503 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ea87>
     1339500:	45 31 ed             	xor    r13d,r13d
     1339503:	44 8a bc 24 d0 00 00 	mov    r15b,BYTE PTR [rsp+0xd0]

### 0x133a3d5, FDE=(20161470, 20161521): call   QWORD PTR [rax+0xa0]
     133a3b6:	41 5e                	pop    r14
     133a3b8:	c3                   	ret
     133a3b9:	e8 f2 56 4b 00       	call   17efab0 <__stack_chk_fail@plt>
     133a3be:	53                   	push   rbx
     133a3bf:	80 bf b8 00 00 00 00 	cmp    BYTE PTR [rdi+0xb8],0x0
     133a3c6:	75 17                	jne    133a3df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f963>
     133a3c8:	48 89 fb             	mov    rbx,rdi
     133a3cb:	48 8b bf 30 01 00 00 	mov    rdi,QWORD PTR [rdi+0x130]
     133a3d2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     133a3d5:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
     133a3db:	84 c0                	test   al,al
     133a3dd:	74 04                	je     133a3e3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f967>
     133a3df:	b0 01                	mov    al,0x1
     133a3e1:	5b                   	pop    rbx
     133a3e2:	c3                   	ret
     133a3e3:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]
     133a3ea:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     133a3ed:	5b                   	pop    rbx
     133a3ee:	ff 60 20             	jmp    QWORD PTR [rax+0x20]
     133a3f1:	cc                   	int3
     133a3f2:	53                   	push   rbx
     133a3f3:	48 89 fb             	mov    rbx,rdi
     133a3f6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     133a3f9:	ff 50 50             	call   QWORD PTR [rax+0x50]
     133a3fc:	89 c1                	mov    ecx,eax

### 0x133aa52, FDE=(20163062, 20163781): mov    BYTE PTR [rbx+0xa8],al
     133aa2c:	48 83 67 28 00       	and    QWORD PTR [rdi+0x28],0x0
     133aa31:	48 89 f7             	mov    rdi,rsi
     133aa34:	48 83 63 38 00       	and    QWORD PTR [rbx+0x38],0x0
     133aa39:	48 83 63 48 00       	and    QWORD PTR [rbx+0x48],0x0
     133aa3e:	48 83 63 58 00       	and    QWORD PTR [rbx+0x58],0x0
     133aa43:	44 8a b4 24 90 00 00 	mov    r14b,BYTE PTR [rsp+0x90]
     133aa4a:	00 
     133aa4b:	4c 8d 53 28          	lea    r10,[rbx+0x28]
     133aa4f:	88 43 68             	mov    BYTE PTR [rbx+0x68],al
     133aa52:	88 83 a8 00 00 00    	mov    BYTE PTR [rbx+0xa8],al
     133aa58:	48 83 ec 08          	sub    rsp,0x8
     133aa5c:	45 0f b6 ce          	movzx  r9d,r14b
     133aa60:	48 89 74 24 10       	mov    QWORD PTR [rsp+0x10],rsi
     133aa65:	48 89 54 24 18       	mov    QWORD PTR [rsp+0x18],rdx
     133aa6a:	48 89 d6             	mov    rsi,rdx
     133aa6d:	48 89 ca             	mov    rdx,rcx
     133aa70:	4c 89 c1             	mov    rcx,r8
     133aa73:	4d 89 e0             	mov    r8,r12
     133aa76:	44 89 4c 24 24       	mov    DWORD PTR [rsp+0x24],r9d
     133aa7b:	ff b4 24 b0 00 00 00 	push   QWORD PTR [rsp+0xb0]
     133aa82:	41 52                	push   r10
     133aa84:	ff b4 24 b8 00 00 00 	push   QWORD PTR [rsp+0xb8]
     133aa8b:	e8 35 02 00 00       	call   133acc5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180249>
     133aa90:	48 83 c4 20          	add    rsp,0x20
     133aa94:	88 03                	mov    BYTE PTR [rbx],al

### 0x133aad3, FDE=(20163062, 20163781): push   QWORD PTR [rsp+0xa8]
     133aaaf:	4c 8d 4c 24 30       	lea    r9,[rsp+0x30]
     133aab4:	49 83 21 00          	and    QWORD PTR [r9],0x0
     133aab8:	49 83 61 10 00       	and    QWORD PTR [r9+0x10],0x0
     133aabd:	48 83 ec 08          	sub    rsp,0x8
     133aac1:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     133aac6:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     133aacb:	4c 89 ea             	mov    rdx,r13
     133aace:	31 c9                	xor    ecx,ecx
     133aad0:	45 31 c0             	xor    r8d,r8d
     133aad3:	ff b4 24 a8 00 00 00 	push   QWORD PTR [rsp+0xa8]
     133aada:	ff b4 24 b8 00 00 00 	push   QWORD PTR [rsp+0xb8]
     133aae1:	50                   	push   rax
     133aae2:	e8 a8 03 00 00       	call   133ae8f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180413>
     133aae7:	48 83 c4 20          	add    rsp,0x20
     133aaeb:	41 89 c7             	mov    r15d,eax
     133aaee:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     133aaf3:	e8 8c 16 ff ff       	call   132c184 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x171708>
     133aaf8:	eb 20                	jmp    133ab1a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18009e>
     133aafa:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     133aaff:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     133ab04:	4c 89 ea             	mov    rdx,r13
     133ab07:	48 89 c1             	mov    rcx,rax
     133ab0a:	4c 8b 84 24 a8 00 00 	mov    r8,QWORD PTR [rsp+0xa8]
     133ab11:	00 
     133ab12:	e8 eb 08 00 00       	call   133b402 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180986>

### 0x133abbf, FDE=(20163062, 20163781): cmp    BYTE PTR [rbx+0xa8],0x0
     133aba0:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     133aba5:	48 29 c8             	sub    rax,rcx
     133aba8:	6a 38                	push   0x38
     133abaa:	41 5e                	pop    r14
     133abac:	48 99                	cqo
     133abae:	49 f7 fe             	idiv   r14
     133abb1:	4c 39 e0             	cmp    rax,r12
     133abb4:	4c 8b 7c 24 28       	mov    r15,QWORD PTR [rsp+0x28]
     133abb9:	0f 83 93 00 00 00    	jae    133ac52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1801d6>
     133abbf:	80 bb a8 00 00 00 00 	cmp    BYTE PTR [rbx+0xa8],0x0
     133abc6:	74 28                	je     133abf0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180174>
     133abc8:	4c 8b 64 24 20       	mov    r12,QWORD PTR [rsp+0x20]
     133abcd:	4c 89 e7             	mov    rdi,r12
     133abd0:	e8 89 e0 ff ff       	call   1338c5e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e1e2>
     133abd5:	c6 83 a8 00 00 00 00 	mov    BYTE PTR [rbx+0xa8],0x0
     133abdc:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     133abe1:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     133abe6:	48 29 c8             	sub    rax,rcx
     133abe9:	48 99                	cqo
     133abeb:	49 f7 fe             	idiv   r14
     133abee:	eb 05                	jmp    133abf5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180179>
     133abf0:	4c 8b 64 24 20       	mov    r12,QWORD PTR [rsp+0x20]
     133abf5:	0f 57 c0             	xorps  xmm0,xmm0
     133abf8:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0
     133abfe:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0

### 0x133abd5, FDE=(20163062, 20163781): mov    BYTE PTR [rbx+0xa8],0x0
     133abae:	49 f7 fe             	idiv   r14
     133abb1:	4c 39 e0             	cmp    rax,r12
     133abb4:	4c 8b 7c 24 28       	mov    r15,QWORD PTR [rsp+0x28]
     133abb9:	0f 83 93 00 00 00    	jae    133ac52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1801d6>
     133abbf:	80 bb a8 00 00 00 00 	cmp    BYTE PTR [rbx+0xa8],0x0
     133abc6:	74 28                	je     133abf0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180174>
     133abc8:	4c 8b 64 24 20       	mov    r12,QWORD PTR [rsp+0x20]
     133abcd:	4c 89 e7             	mov    rdi,r12
     133abd0:	e8 89 e0 ff ff       	call   1338c5e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e1e2>
     133abd5:	c6 83 a8 00 00 00 00 	mov    BYTE PTR [rbx+0xa8],0x0
     133abdc:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     133abe1:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     133abe6:	48 29 c8             	sub    rax,rcx
     133abe9:	48 99                	cqo
     133abeb:	49 f7 fe             	idiv   r14
     133abee:	eb 05                	jmp    133abf5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180179>
     133abf0:	4c 8b 64 24 20       	mov    r12,QWORD PTR [rsp+0x20]
     133abf5:	0f 57 c0             	xorps  xmm0,xmm0
     133abf8:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0
     133abfe:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
     133ac04:	41 0f 11 44 24 10    	movups XMMWORD PTR [r12+0x10],xmm0
     133ac0a:	41 0f 11 04 24       	movups XMMWORD PTR [r12],xmm0
     133ac0f:	c6 83 a8 00 00 00 01 	mov    BYTE PTR [rbx+0xa8],0x1
     133ac16:	48 83 ec 08          	sub    rsp,0x8
     133ac1a:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

### 0x133ac0f, FDE=(20163062, 20163781): mov    BYTE PTR [rbx+0xa8],0x1
     133abe9:	48 99                	cqo
     133abeb:	49 f7 fe             	idiv   r14
     133abee:	eb 05                	jmp    133abf5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180179>
     133abf0:	4c 8b 64 24 20       	mov    r12,QWORD PTR [rsp+0x20]
     133abf5:	0f 57 c0             	xorps  xmm0,xmm0
     133abf8:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0
     133abfe:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
     133ac04:	41 0f 11 44 24 10    	movups XMMWORD PTR [r12+0x10],xmm0
     133ac0a:	41 0f 11 04 24       	movups XMMWORD PTR [r12],xmm0
     133ac0f:	c6 83 a8 00 00 00 01 	mov    BYTE PTR [rbx+0xa8],0x1
     133ac16:	48 83 ec 08          	sub    rsp,0x8
     133ac1a:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     133ac1f:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     133ac24:	4c 89 fa             	mov    rdx,r15
     133ac27:	49 89 c0             	mov    r8,rax
     133ac2a:	44 8b 4c 24 24       	mov    r9d,DWORD PTR [rsp+0x24]
     133ac2f:	ff b4 24 b0 00 00 00 	push   QWORD PTR [rsp+0xb0]
     133ac36:	41 54                	push   r12
     133ac38:	ff b4 24 b8 00 00 00 	push   QWORD PTR [rsp+0xb8]
     133ac3f:	e8 81 00 00 00       	call   133acc5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180249>
     133ac44:	48 83 c4 20          	add    rsp,0x20
     133ac48:	80 3b 00             	cmp    BYTE PTR [rbx],0x0
     133ac4b:	0f 95 c1             	setne  cl
     133ac4e:	20 c8                	and    al,cl
     133ac50:	88 03                	mov    BYTE PTR [rbx],al

### 0x133cb1a, FDE=(20171126, 20172593): and    QWORD PTR [rsp+0xa0],0x0
     133caf1:	84 c0                	test   al,al
     133caf3:	0f 85 5f 03 00 00    	jne    133ce58 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1823dc>
     133caf9:	80 bc 24 85 00 00 00 	cmp    BYTE PTR [rsp+0x85],0x0
     133cb00:	00 
     133cb01:	0f 84 31 03 00 00    	je     133ce38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1823bc>
     133cb07:	4c 8b 6b 40          	mov    r13,QWORD PTR [rbx+0x40]
     133cb0b:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     133cb10:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
     133cb15:	e8 92 c6 83 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     133cb1a:	48 83 a4 24 a0 00 00 	and    QWORD PTR [rsp+0xa0],0x0
     133cb21:	00 00 
     133cb23:	48 89 5c 24 30       	mov    QWORD PTR [rsp+0x30],rbx
     133cb28:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     133cb2f:	00 00 
     133cb31:	6a 18                	push   0x18
     133cb33:	5f                   	pop    rdi
     133cb34:	e8 c7 13 4b 00       	call   17edf00 <_Znwm@plt>
     133cb39:	49 89 c7             	mov    r15,rax
     133cb3c:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
     133cb41:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
     133cb46:	48 89 c7             	mov    rdi,rax
     133cb49:	4c 89 e6             	mov    rsi,r12
     133cb4c:	e8 67 b4 82 ff       	call   b67fb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4f58>
     133cb51:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
     133cb56:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax

### 0x133cb5a, FDE=(20171126, 20172593): mov    QWORD PTR [rsp+0xa0],r15
     133cb34:	e8 c7 13 4b 00       	call   17edf00 <_Znwm@plt>
     133cb39:	49 89 c7             	mov    r15,rax
     133cb3c:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
     133cb41:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
     133cb46:	48 89 c7             	mov    rdi,rax
     133cb49:	4c 89 e6             	mov    rsi,r12
     133cb4c:	e8 67 b4 82 ff       	call   b67fb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4f58>
     133cb51:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
     133cb56:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     133cb5a:	4c 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r15
     133cb61:	00 
     133cb62:	48 8d 05 d1 b7 8e ff 	lea    rax,[rip+0xffffffffff8eb7d1]        # c2833a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1752da>
     133cb69:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     133cb70:	00 
     133cb71:	48 8d 05 a6 07 00 00 	lea    rax,[rip+0x7a6]        # 133d31e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1828a2>
     133cb78:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     133cb7f:	00 
     133cb80:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     133cb84:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     133cb87:	ff 50 50             	call   QWORD PTR [rax+0x50]
     133cb8a:	49 89 c7             	mov    r15,rax
     133cb8d:	48 89 c7             	mov    rdi,rax
     133cb90:	48 81 c7 d0 09 00 00 	add    rdi,0x9d0
     133cb97:	ff 90 e8 09 00 00    	call   QWORD PTR [rax+0x9e8]
     133cb9d:	49 69 8f 00 0a 00 00 	imul   rcx,QWORD PTR [r15+0xa00],0x3e8

### 0x133d1f8, FDE=(20173284, 20173598): mov    QWORD PTR [rsp+0xa8],rcx
     133d1d6:	48 89 df             	mov    rdi,rbx
     133d1d9:	e8 f2 2a 73 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     133d1de:	e8 cd 28 4b 00       	call   17efab0 <__stack_chk_fail@plt>
     133d1e3:	cc                   	int3
     133d1e4:	53                   	push   rbx
     133d1e5:	48 81 ec b0 00 00 00 	sub    rsp,0xb0
     133d1ec:	48 89 f8             	mov    rax,rdi
     133d1ef:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     133d1f6:	00 00 
     133d1f8:	48 89 8c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rcx
     133d1ff:	00 
     133d200:	66 89 b4 24 a4 00 00 	mov    WORD PTR [rsp+0xa4],si
     133d207:	00 
     133d208:	c1 ee 10             	shr    esi,0x10
     133d20b:	40 88 b4 24 a6 00 00 	mov    BYTE PTR [rsp+0xa6],sil
     133d212:	00 
     133d213:	0f 57 c0             	xorps  xmm0,xmm0
     133d216:	48 8d 94 24 80 00 00 	lea    rdx,[rsp+0x80]
     133d21d:	00 
     133d21e:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
     133d221:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
     133d226:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     133d22b:	48 89 c6             	mov    rsi,rax
     133d22e:	e8 d7 d1 49 00       	call   17da40a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x622b>
     133d233:	48 8d 84 24 a4 00 00 	lea    rax,[rsp+0xa4]

### 0x133d7b9, FDE=(20174180, 20176212): movaps XMMWORD PTR [rsp+0xa0],xmm0
     133d799:	00 
     133d79a:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
     133d79e:	48 8b 8c 24 b0 00 00 	mov    rcx,QWORD PTR [rsp+0xb0]
     133d7a5:	00 
     133d7a6:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
     133d7aa:	0f 28 84 24 a0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xa0]
     133d7b1:	00 
     133d7b2:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
     133d7b6:	0f 57 c0             	xorps  xmm0,xmm0
     133d7b9:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
     133d7c0:	00 
     133d7c1:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     133d7c8:	00 00 
     133d7ca:	0f b7 8c 24 b8 00 00 	movzx  ecx,WORD PTR [rsp+0xb8]
     133d7d1:	00 
     133d7d2:	66 89 48 28          	mov    WORD PTR [rax+0x28],cx
     133d7d6:	48 83 60 30 00       	and    QWORD PTR [rax+0x30],0x0
     133d7db:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     133d7e0:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
     133d7e7:	00 
     133d7e8:	c6 84 24 d8 00 00 00 	mov    BYTE PTR [rsp+0xd8],0x1
     133d7ef:	01 
     133d7f0:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
     133d7f4:	48 ff c0             	inc    rax
     133d7f7:	78 07                	js     133d800 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x182d84>

### 0x133ed4f, FDE=(20179748, 20182332): cmp    BYTE PTR [rsp+0xa0],0x4
     133ed34:	4c 89 f7             	mov    rdi,r14
     133ed37:	4c 89 e6             	mov    rsi,r12
     133ed3a:	6a 0a                	push   0xa
     133ed3c:	5a                   	pop    rdx
     133ed3d:	48 89 c1             	mov    rcx,rax
     133ed40:	41 ff 51 28          	call   QWORD PTR [r9+0x28]
     133ed44:	49 89 ec             	mov    r12,rbp
     133ed47:	48 89 ef             	mov    rdi,rbp
     133ed4a:	e8 41 f1 4a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     133ed4f:	80 bc 24 a0 00 00 00 	cmp    BYTE PTR [rsp+0xa0],0x4
     133ed56:	04 
     133ed57:	74 32                	je     133ed8b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18430f>
     133ed59:	40 8a ac 24 e1 00 00 	mov    bpl,BYTE PTR [rsp+0xe1]
     133ed60:	00 
     133ed61:	80 bc 24 e0 00 00 00 	cmp    BYTE PTR [rsp+0xe0],0x0
     133ed68:	00 
     133ed69:	0f 94 c0             	sete   al
     133ed6c:	40 84 ed             	test   bpl,bpl
     133ed6f:	74 05                	je     133ed76 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1842fa>
     133ed71:	41 20 c7             	and    r15b,al
     133ed74:	74 10                	je     133ed86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18430a>
     133ed76:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     133ed7d:	00 
     133ed7e:	4c 89 ee             	mov    rsi,r13
     133ed81:	e8 b4 44 8d ff       	call   c1323a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1601da>

### 0x133ee00, FDE=(20179748, 20182332): and    QWORD PTR [rsp+0xa0],0x0
     133edd6:	e9 07 01 00 00       	jmp    133eee2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184466>
     133eddb:	84 c0                	test   al,al
     133eddd:	0f 84 c8 02 00 00    	je     133f0ab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18462f>
     133ede3:	49 8b 7c 24 18       	mov    rdi,QWORD PTR [r12+0x18]
     133ede8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     133edeb:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
     133edf1:	83 78 38 02          	cmp    DWORD PTR [rax+0x38],0x2
     133edf5:	49 8b 5c 24 18       	mov    rbx,QWORD PTR [r12+0x18]
     133edfa:	0f 85 44 02 00 00    	jne    133f044 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1845c8>
     133ee00:	48 83 a4 24 a0 00 00 	and    QWORD PTR [rsp+0xa0],0x0
     133ee07:	00 00 
     133ee09:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     133ee10:	00 00 
     133ee12:	6a 18                	push   0x18
     133ee14:	5f                   	pop    rdi
     133ee15:	e8 e6 f0 4a 00       	call   17edf00 <_Znwm@plt>
     133ee1a:	4c 89 20             	mov    QWORD PTR [rax],r12
     133ee1d:	48 8d 8c 24 80 00 00 	lea    rcx,[rsp+0x80]
     133ee24:	00 
     133ee25:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     133ee29:	48 8d 4c 24 7f       	lea    rcx,[rsp+0x7f]
     133ee2e:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
     133ee32:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     133ee39:	00 
     133ee3a:	49 89 06             	mov    QWORD PTR [r14],rax

### 0x133ee76, FDE=(20179748, 20182332): movaps XMMWORD PTR [rsp+0xa0],xmm0
     133ee4f:	e9 3f 02 00 00       	jmp    133f093 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184617>
     133ee54:	49 39 dd             	cmp    r13,rbx
     133ee57:	0f 84 85 00 00 00    	je     133eee2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184466>
     133ee5d:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     133ee64:	00 
     133ee65:	41 bc 09 04 00 00    	mov    r12d,0x409
     133ee6b:	4c 8d bc 24 80 00 00 	lea    r15,[rsp+0x80]
     133ee72:	00 
     133ee73:	0f 57 c0             	xorps  xmm0,xmm0
     133ee76:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
     133ee7d:	00 
     133ee7e:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     133ee82:	48 8b 78 50          	mov    rdi,QWORD PTR [rax+0x50]
     133ee86:	4c 89 ee             	mov    rsi,r13
     133ee89:	31 d2                	xor    edx,edx
     133ee8b:	4c 89 f1             	mov    rcx,r14
     133ee8e:	e8 b5 f2 2f 00       	call   163e148 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x392b6>
     133ee93:	89 c5                	mov    ebp,eax
     133ee95:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     133ee9c:	00 
     133ee9d:	48 85 ff             	test   rdi,rdi
     133eea0:	74 0f                	je     133eeb1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184435>
     133eea2:	80 7f 38 00          	cmp    BYTE PTR [rdi+0x38],0x0
     133eea6:	75 24                	jne    133eecc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184450>
     133eea8:	e8 33 21 9d ff       	call   d10fe0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25df80>

### 0x133efb5, FDE=(20179748, 20182332): cmp    BYTE PTR [rsp+0xa0],0x4
     133ef94:	44 0f b7 e5          	movzx  r12d,bp
     133ef98:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     133ef9f:	00 
     133efa0:	48 89 de             	mov    rsi,rbx
     133efa3:	44 89 e2             	mov    edx,r12d
     133efa6:	48 89 c1             	mov    rcx,rax
     133efa9:	41 ff 51 28          	call   QWORD PTR [r9+0x28]
     133efad:	4c 89 ef             	mov    rdi,r13
     133efb0:	e8 db ee 4a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     133efb5:	80 bc 24 a0 00 00 00 	cmp    BYTE PTR [rsp+0xa0],0x4
     133efbc:	04 
     133efbd:	74 54                	je     133f013 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184597>
     133efbf:	40 8a ac 24 e1 00 00 	mov    bpl,BYTE PTR [rsp+0xe1]
     133efc6:	00 
     133efc7:	80 bc 24 e0 00 00 00 	cmp    BYTE PTR [rsp+0xe0],0x0
     133efce:	00 
     133efcf:	0f 94 c0             	sete   al
     133efd2:	40 84 ed             	test   bpl,bpl
     133efd5:	74 06                	je     133efdd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184561>
     133efd7:	22 44 24 08          	and    al,BYTE PTR [rsp+0x8]
     133efdb:	74 31                	je     133f00e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184592>
     133efdd:	48 8b 5c 24 70       	mov    rbx,QWORD PTR [rsp+0x70]
     133efe2:	4c 89 ef             	mov    rdi,r13
     133efe5:	4c 89 fe             	mov    rsi,r15
     133efe8:	e8 3d b5 38 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>

### 0x133f044, FDE=(20179748, 20182332): and    QWORD PTR [rsp+0xa0],0x0
     133f01b:	e8 70 ee 4a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     133f020:	4d 8b 36             	mov    r14,QWORD PTR [r14]
     133f023:	4d 85 f6             	test   r14,r14
     133f026:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
     133f02a:	0f 85 41 ff ff ff    	jne    133ef71 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1844f5>
     133f030:	49 83 c7 58          	add    r15,0x58
     133f034:	4c 3b 7c 24 28       	cmp    r15,QWORD PTR [rsp+0x28]
     133f039:	0f 85 09 ff ff ff    	jne    133ef48 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1844cc>
     133f03f:	e9 0f 01 00 00       	jmp    133f153 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1846d7>
     133f044:	48 83 a4 24 a0 00 00 	and    QWORD PTR [rsp+0xa0],0x0
     133f04b:	00 00 
     133f04d:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     133f054:	00 00 
     133f056:	6a 18                	push   0x18
     133f058:	5f                   	pop    rdi
     133f059:	e8 a2 ee 4a 00       	call   17edf00 <_Znwm@plt>
     133f05e:	4c 89 20             	mov    QWORD PTR [rax],r12
     133f061:	48 8d 8c 24 80 00 00 	lea    rcx,[rsp+0x80]
     133f068:	00 
     133f069:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     133f06d:	48 8d 4c 24 7f       	lea    rcx,[rsp+0x7f]
     133f072:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
     133f076:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     133f07d:	00 
     133f07e:	49 89 06             	mov    QWORD PTR [r14],rax

### 0x133f316, FDE=(20179748, 20182332): and    QWORD PTR [rsp+0xa0],0x0
     133f2ef:	41 c6 84 24 e1 03 00 	mov    BYTE PTR [r12+0x3e1],0x1
     133f2f6:	00 01 
     133f2f8:	4d 8b 7c 24 58       	mov    r15,QWORD PTR [r12+0x58]
     133f2fd:	4c 8d 74 24 50       	lea    r14,[rsp+0x50]
     133f302:	4d 89 66 f8          	mov    QWORD PTR [r14-0x8],r12
     133f306:	49 8d b4 24 40 04 00 	lea    rsi,[r12+0x440]
     133f30d:	00 
     133f30e:	4c 89 f7             	mov    rdi,r14
     133f311:	e8 d2 8b 82 ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>
     133f316:	48 83 a4 24 a0 00 00 	and    QWORD PTR [rsp+0xa0],0x0
     133f31d:	00 00 
     133f31f:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     133f326:	00 00 
     133f328:	6a 18                	push   0x18
     133f32a:	5f                   	pop    rdi
     133f32b:	e8 d0 eb 4a 00       	call   17edf00 <_Znwm@plt>
     133f330:	49 89 c4             	mov    r12,rax
     133f333:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     133f338:	49 89 04 24          	mov    QWORD PTR [r12],rax
     133f33c:	4c 89 e7             	mov    rdi,r12
     133f33f:	48 83 c7 08          	add    rdi,0x8
     133f343:	4c 89 f6             	mov    rsi,r14
     133f346:	e8 6d 8c 82 ff       	call   b67fb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4f58>
     133f34b:	48 8d 84 24 a0 00 00 	lea    rax,[rsp+0xa0]
     133f352:	00 

### 0x133f554, FDE=(20182332, 20182685): mov    QWORD PTR [rsp+0xa8],rax
     133f537:	e8 74 05 4b 00       	call   17efab0 <__stack_chk_fail@plt>
     133f53c:	55                   	push   rbp
     133f53d:	41 57                	push   r15
     133f53f:	41 56                	push   r14
     133f541:	41 54                	push   r12
     133f543:	53                   	push   rbx
     133f544:	48 81 ec b0 00 00 00 	sub    rsp,0xb0
     133f54b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     133f552:	00 00 
     133f554:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     133f55b:	00 
     133f55c:	4c 8b 3f             	mov    r15,QWORD PTR [rdi]
     133f55f:	48 8b 1a             	mov    rbx,QWORD PTR [rdx]
     133f562:	80 7b 38 00          	cmp    BYTE PTR [rbx+0x38],0x0
     133f566:	0f 84 cd 00 00 00    	je     133f639 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184bbd>
     133f56c:	4d 8b 27             	mov    r12,QWORD PTR [r15]
     133f56f:	49 8b 74 24 60       	mov    rsi,QWORD PTR [r12+0x60]
     133f574:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     133f577:	4c 8d 74 24 50       	lea    r14,[rsp+0x50]
     133f57c:	4c 89 f7             	mov    rdi,r14
     133f57f:	ff 50 18             	call   QWORD PTR [rax+0x18]
     133f582:	41 8b 06             	mov    eax,DWORD PTR [r14]
     133f585:	ff c8                	dec    eax
     133f587:	83 f8 fe             	cmp    eax,0xfffffffe
     133f58a:	40 0f 92 c5          	setb   bpl

## Move-out patterns from object+0x10 in 0x133xxxx
### 0x1330197, FDE=(20119676, 20122233)
     1330174:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
     1330179:	48 89 de             	mov    rsi,rbx
     133017c:	4c 89 fa             	mov    rdx,r15
     133017f:	e8 dc 10 00 00       	call   1331260 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1767e4>
     1330184:	48 89 ef             	mov    rdi,rbp
     1330187:	48 89 de             	mov    rsi,rbx
     133018a:	e8 76 b6 df ff       	call   112b805 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f2c1b>
     133018f:	eb 10                	jmp    13301a1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175725>
     1330191:	48 89 df             	mov    rdi,rbx
     1330194:	48 89 ee             	mov    rsi,rbp
     1330197:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     133019c:	e8 bf 10 00 00       	call   1331260 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1767e4>
     13301a1:	49 ff ce             	dec    r14
     13301a4:	80 7c 24 1c 00       	cmp    BYTE PTR [rsp+0x1c],0x0
     13301a9:	75 14                	jne    13301bf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175743>
     13301ab:	48 8d 7d c8          	lea    rdi,[rbp-0x38]
     13301af:	48 89 ee             	mov    rsi,rbp
     13301b2:	e8 4d 10 00 00       	call   1331204 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176788>
     13301b7:	84 c0                	test   al,al
     13301b9:	0f 84 6c 01 00 00    	je     133032b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758af>
     13301bf:	4c 89 74 24 20       	mov    QWORD PTR [rsp+0x20],r14
     13301c4:	48 8b 45 10          	mov    rax,QWORD PTR [rbp+0x10]
     13301c8:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
     13301cf:	00 
     13301d0:	0f 10 45 00          	movups xmm0,XMMWORD PTR [rbp+0x0]
     13301d4:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
     13301db:	00 
     13301dc:	48 83 65 10 00       	and    QWORD PTR [rbp+0x10],0x0
     13301e1:	0f 57 c9             	xorps  xmm1,xmm1

### 0x13301c4, FDE=(20119676, 20122233)
     133019c:	e8 bf 10 00 00       	call   1331260 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1767e4>
     13301a1:	49 ff ce             	dec    r14
     13301a4:	80 7c 24 1c 00       	cmp    BYTE PTR [rsp+0x1c],0x0
     13301a9:	75 14                	jne    13301bf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175743>
     13301ab:	48 8d 7d c8          	lea    rdi,[rbp-0x38]
     13301af:	48 89 ee             	mov    rsi,rbp
     13301b2:	e8 4d 10 00 00       	call   1331204 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176788>
     13301b7:	84 c0                	test   al,al
     13301b9:	0f 84 6c 01 00 00    	je     133032b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758af>
     13301bf:	4c 89 74 24 20       	mov    QWORD PTR [rsp+0x20],r14
     13301c4:	48 8b 45 10          	mov    rax,QWORD PTR [rbp+0x10]
     13301c8:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
     13301cf:	00 
     13301d0:	0f 10 45 00          	movups xmm0,XMMWORD PTR [rbp+0x0]
     13301d4:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
     13301db:	00 
     13301dc:	48 83 65 10 00       	and    QWORD PTR [rbp+0x10],0x0
     13301e1:	0f 57 c9             	xorps  xmm1,xmm1
     13301e4:	0f 11 4d 00          	movups XMMWORD PTR [rbp+0x0],xmm1
     13301e8:	48 8b 45 28          	mov    rax,QWORD PTR [rbp+0x28]
     13301ec:	48 8d 8c 24 98 00 00 	lea    rcx,[rsp+0x98]
     13301f3:	00 
     13301f4:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
     13301f8:	0f 10 45 18          	movups xmm0,XMMWORD PTR [rbp+0x18]
     13301fc:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
     13301ff:	48 83 65 28 00       	and    QWORD PTR [rbp+0x28],0x0
     1330204:	0f 11 4d 18          	movups XMMWORD PTR [rbp+0x18],xmm1
     1330208:	8b 45 30             	mov    eax,DWORD PTR [rbp+0x30]
     133020b:	89 84 24 b0 00 00 00 	mov    DWORD PTR [rsp+0xb0],eax

### 0x133032b, FDE=(20119676, 20122233)
     1330304:	31 c9                	xor    ecx,ecx
     1330306:	80 7c 24 1c 00       	cmp    BYTE PTR [rsp+0x1c],0x0
     133030b:	0f 95 c1             	setne  cl
     133030e:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     1330313:	4c 89 fe             	mov    rsi,r15
     1330316:	4c 89 f2             	mov    rdx,r14
     1330319:	e8 5e fd ff ff       	call   133007c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175600>
     133031e:	c7 44 24 1c 00 00 00 	mov    DWORD PTR [rsp+0x1c],0x0
     1330325:	00 
     1330326:	e9 b5 fd ff ff       	jmp    13300e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175664>
     133032b:	48 8b 45 10          	mov    rax,QWORD PTR [rbp+0x10]
     133032f:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
     1330336:	00 
     1330337:	0f 10 45 00          	movups xmm0,XMMWORD PTR [rbp+0x0]
     133033b:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
     1330342:	00 
     1330343:	48 83 65 10 00       	and    QWORD PTR [rbp+0x10],0x0
     1330348:	0f 57 c9             	xorps  xmm1,xmm1
     133034b:	0f 11 4d 00          	movups XMMWORD PTR [rbp+0x0],xmm1
     133034f:	48 8b 45 28          	mov    rax,QWORD PTR [rbp+0x28]
     1330353:	48 8d 8c 24 98 00 00 	lea    rcx,[rsp+0x98]
     133035a:	00 
     133035b:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
     133035f:	0f 10 45 18          	movups xmm0,XMMWORD PTR [rbp+0x18]
     1330363:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
     1330366:	48 83 65 28 00       	and    QWORD PTR [rbp+0x28],0x0
     133036b:	0f 11 4d 18          	movups XMMWORD PTR [rbp+0x18],xmm1
     133036f:	8b 45 30             	mov    eax,DWORD PTR [rbp+0x30]
     1330372:	89 84 24 b0 00 00 00 	mov    DWORD PTR [rsp+0xb0],eax

### 0x13304b9, FDE=(20119676, 20122233)
     1330488:	e9 eb 04 00 00       	jmp    1330978 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175efc>
     133048d:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     1330492:	48 8d 77 38          	lea    rsi,[rdi+0x38]
     1330496:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     133049b:	e8 c0 0d 00 00       	call   1331260 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1767e4>
     13304a0:	e9 d3 04 00 00       	jmp    1330978 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175efc>
     13304a5:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     13304aa:	48 8d 77 38          	lea    rsi,[rdi+0x38]
     13304ae:	48 8d 57 70          	lea    rdx,[rdi+0x70]
     13304b2:	48 8d 8f a8 00 00 00 	lea    rcx,[rdi+0xa8]
     13304b9:	4c 8b 44 24 10       	mov    r8,QWORD PTR [rsp+0x10]
     13304be:	e8 ac 0e 00 00       	call   133136f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1768f3>
     13304c3:	e9 b0 04 00 00       	jmp    1330978 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175efc>
     13304c8:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     13304cd:	48 8d 77 38          	lea    rsi,[rdi+0x38]
     13304d1:	48 8d 57 70          	lea    rdx,[rdi+0x70]
     13304d5:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     13304da:	e8 12 0e 00 00       	call   13312f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176875>
     13304df:	e9 94 04 00 00       	jmp    1330978 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175efc>
     13304e4:	80 7c 24 1c 00       	cmp    BYTE PTR [rsp+0x1c],0x0
     13304e9:	0f 84 b2 04 00 00    	je     13309a1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f25>
     13304ef:	4c 39 e5             	cmp    rbp,r12
     13304f2:	0f 84 80 04 00 00    	je     1330978 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175efc>
     13304f8:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     13304fd:	48 83 c0 38          	add    rax,0x38
     1330501:	4c 39 e0             	cmp    rax,r12
     1330504:	0f 84 6e 04 00 00    	je     1330978 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175efc>
     133050a:	45 31 ff             	xor    r15d,r15d
     133050d:	48 8d 9c 24 80 00 00 	lea    rbx,[rsp+0x80]

### 0x13304d5, FDE=(20119676, 20122233)
     13304a5:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     13304aa:	48 8d 77 38          	lea    rsi,[rdi+0x38]
     13304ae:	48 8d 57 70          	lea    rdx,[rdi+0x70]
     13304b2:	48 8d 8f a8 00 00 00 	lea    rcx,[rdi+0xa8]
     13304b9:	4c 8b 44 24 10       	mov    r8,QWORD PTR [rsp+0x10]
     13304be:	e8 ac 0e 00 00       	call   133136f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1768f3>
     13304c3:	e9 b0 04 00 00       	jmp    1330978 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175efc>
     13304c8:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     13304cd:	48 8d 77 38          	lea    rsi,[rdi+0x38]
     13304d1:	48 8d 57 70          	lea    rdx,[rdi+0x70]
     13304d5:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     13304da:	e8 12 0e 00 00       	call   13312f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176875>
     13304df:	e9 94 04 00 00       	jmp    1330978 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175efc>
     13304e4:	80 7c 24 1c 00       	cmp    BYTE PTR [rsp+0x1c],0x0
     13304e9:	0f 84 b2 04 00 00    	je     13309a1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f25>
     13304ef:	4c 39 e5             	cmp    rbp,r12
     13304f2:	0f 84 80 04 00 00    	je     1330978 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175efc>
     13304f8:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     13304fd:	48 83 c0 38          	add    rax,0x38
     1330501:	4c 39 e0             	cmp    rax,r12
     1330504:	0f 84 6e 04 00 00    	je     1330978 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175efc>
     133050a:	45 31 ff             	xor    r15d,r15d
     133050d:	48 8d 9c 24 80 00 00 	lea    rbx,[rsp+0x80]
     1330514:	00 
     1330515:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
     133051a:	49 89 c6             	mov    r14,rax
     133051d:	48 89 c7             	mov    rdi,rax
     1330520:	4c 89 ee             	mov    rsi,r13
     1330523:	e8 dc 0c 00 00       	call   1331204 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176788>

### 0x1330533, FDE=(20119676, 20122233)
     133050d:	48 8d 9c 24 80 00 00 	lea    rbx,[rsp+0x80]
     1330514:	00 
     1330515:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
     133051a:	49 89 c6             	mov    r14,rax
     133051d:	48 89 c7             	mov    rdi,rax
     1330520:	4c 89 ee             	mov    rsi,r13
     1330523:	e8 dc 0c 00 00       	call   1331204 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176788>
     1330528:	84 c0                	test   al,al
     133052a:	0f 84 a0 00 00 00    	je     13305d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175b54>
     1330530:	4c 89 e5             	mov    rbp,r12
     1330533:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     1330537:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
     133053e:	00 
     133053f:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
     1330543:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
     133054a:	00 
     133054b:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     1330550:	0f 57 c9             	xorps  xmm1,xmm1
     1330553:	41 0f 11 0e          	movups XMMWORD PTR [r14],xmm1
     1330557:	49 8b 45 60          	mov    rax,QWORD PTR [r13+0x60]
     133055b:	48 8d 8c 24 98 00 00 	lea    rcx,[rsp+0x98]
     1330562:	00 
     1330563:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
     1330567:	41 0f 10 45 50       	movups xmm0,XMMWORD PTR [r13+0x50]
     133056c:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
     133056f:	49 83 65 60 00       	and    QWORD PTR [r13+0x60],0x0
     1330574:	41 0f 11 4d 50       	movups XMMWORD PTR [r13+0x50],xmm1
     1330579:	41 8b 45 68          	mov    eax,DWORD PTR [r13+0x68]
     133057d:	89 84 24 b0 00 00 00 	mov    DWORD PTR [rsp+0xb0],eax

### 0x133066b, FDE=(20119676, 20122233)
     1330642:	49 0f 45 dc          	cmovne rbx,r12
     1330646:	4d 6b e5 38          	imul   r12,r13,0x38
     133064a:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     133064f:	4e 8d 3c 20          	lea    r15,[rax+r12*1]
     1330653:	4c 89 f7             	mov    rdi,r14
     1330656:	4c 89 fe             	mov    rsi,r15
     1330659:	e8 a6 0b 00 00       	call   1331204 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176788>
     133065e:	84 c0                	test   al,al
     1330660:	0f 85 ec 00 00 00    	jne    1330752 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175cd6>
     1330666:	4c 89 6c 24 20       	mov    QWORD PTR [rsp+0x20],r13
     133066b:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     133066f:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
     1330676:	00 
     1330677:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
     133067b:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
     1330682:	00 
     1330683:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     1330688:	0f 57 c9             	xorps  xmm1,xmm1
     133068b:	41 0f 11 0f          	movups XMMWORD PTR [r15],xmm1
     133068f:	48 8b 54 24 08       	mov    rdx,QWORD PTR [rsp+0x8]
     1330694:	4a 8b 44 22 28       	mov    rax,QWORD PTR [rdx+r12*1+0x28]
     1330699:	48 8d 8c 24 98 00 00 	lea    rcx,[rsp+0x98]
     13306a0:	00 
     13306a1:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
     13306a5:	42 0f 10 44 22 18    	movups xmm0,XMMWORD PTR [rdx+r12*1+0x18]
     13306ab:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
     13306ae:	4a 83 64 22 28 00    	and    QWORD PTR [rdx+r12*1+0x28],0x0
     13306b4:	42 0f 11 4c 22 18    	movups XMMWORD PTR [rdx+r12*1+0x18],xmm1
     13306ba:	42 8b 44 22 30       	mov    eax,DWORD PTR [rdx+r12*1+0x30]

### 0x1330775, FDE=(20119676, 20122233)
     1330748:	e8 7f e0 76 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     133074d:	4c 8b 6c 24 20       	mov    r13,QWORD PTR [rsp+0x20]
     1330752:	49 8d 45 ff          	lea    rax,[r13-0x1]
     1330756:	4d 85 ed             	test   r13,r13
     1330759:	49 89 c5             	mov    r13,rax
     133075c:	0f 8f a2 fe ff ff    	jg     1330604 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175b88>
     1330762:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1330767:	48 83 c0 18          	add    rax,0x18
     133076b:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     1330770:	48 8b 6c 24 28       	mov    rbp,QWORD PTR [rsp+0x28]
     1330775:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     133077a:	48 89 6c 24 28       	mov    QWORD PTR [rsp+0x28],rbp
     133077f:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     1330784:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     1330788:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     133078d:	0f 10 03             	movups xmm0,XMMWORD PTR [rbx]
     1330790:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     1330795:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     133079a:	0f 57 c9             	xorps  xmm1,xmm1
     133079d:	0f 11 0b             	movups XMMWORD PTR [rbx],xmm1
     13307a0:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
     13307a5:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
     13307a9:	48 8d 54 24 58       	lea    rdx,[rsp+0x58]
     13307ae:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
     13307b2:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
     13307b5:	0f 11 02             	movups XMMWORD PTR [rdx],xmm0
     13307b8:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     13307bd:	0f 11 0e             	movups XMMWORD PTR [rsi],xmm1
     13307c0:	8b 43 30             	mov    eax,DWORD PTR [rbx+0x30]

### 0x1330784, FDE=(20119676, 20122233)
     1330756:	4d 85 ed             	test   r13,r13
     1330759:	49 89 c5             	mov    r13,rax
     133075c:	0f 8f a2 fe ff ff    	jg     1330604 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175b88>
     1330762:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1330767:	48 83 c0 18          	add    rax,0x18
     133076b:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     1330770:	48 8b 6c 24 28       	mov    rbp,QWORD PTR [rsp+0x28]
     1330775:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     133077a:	48 89 6c 24 28       	mov    QWORD PTR [rsp+0x28],rbp
     133077f:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     1330784:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     1330788:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     133078d:	0f 10 03             	movups xmm0,XMMWORD PTR [rbx]
     1330790:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     1330795:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     133079a:	0f 57 c9             	xorps  xmm1,xmm1
     133079d:	0f 11 0b             	movups XMMWORD PTR [rbx],xmm1
     13307a0:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
     13307a5:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
     13307a9:	48 8d 54 24 58       	lea    rdx,[rsp+0x58]
     13307ae:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
     13307b2:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
     13307b5:	0f 11 02             	movups XMMWORD PTR [rdx],xmm0
     13307b8:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     13307bd:	0f 11 0e             	movups XMMWORD PTR [rsi],xmm1
     13307c0:	8b 43 30             	mov    eax,DWORD PTR [rbx+0x30]
     13307c3:	89 44 24 70          	mov    DWORD PTR [rsp+0x70],eax
     13307c7:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     13307cc:	4c 8d 79 fe          	lea    r15,[rcx-0x2]

### 0x13307a5, FDE=(20119676, 20122233)
     133077a:	48 89 6c 24 28       	mov    QWORD PTR [rsp+0x28],rbp
     133077f:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     1330784:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     1330788:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     133078d:	0f 10 03             	movups xmm0,XMMWORD PTR [rbx]
     1330790:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     1330795:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     133079a:	0f 57 c9             	xorps  xmm1,xmm1
     133079d:	0f 11 0b             	movups XMMWORD PTR [rbx],xmm1
     13307a0:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
     13307a5:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
     13307a9:	48 8d 54 24 58       	lea    rdx,[rsp+0x58]
     13307ae:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
     13307b2:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
     13307b5:	0f 11 02             	movups XMMWORD PTR [rdx],xmm0
     13307b8:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     13307bd:	0f 11 0e             	movups XMMWORD PTR [rsi],xmm1
     13307c0:	8b 43 30             	mov    eax,DWORD PTR [rbx+0x30]
     13307c3:	89 44 24 70          	mov    DWORD PTR [rsp+0x70],eax
     13307c7:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     13307cc:	4c 8d 79 fe          	lea    r15,[rcx-0x2]
     13307d0:	49 d1 ef             	shr    r15,1
     13307d3:	31 c0                	xor    eax,eax
     13307d5:	4c 6b f0 38          	imul   r14,rax,0x38
     13307d9:	4e 8d 2c 33          	lea    r13,[rbx+r14*1]
     13307dd:	49 83 c5 38          	add    r13,0x38
     13307e1:	4c 8d 24 45 01 00 00 	lea    r12,[rax*2+0x1]
     13307e8:	00 
     13307e9:	48 8d 2c 45 02 00 00 	lea    rbp,[rax*2+0x2]

### 0x13308a1, FDE=(20119676, 20122233)
     133087b:	48 89 c3             	mov    rbx,rax
     133087e:	48 83 c3 fe          	add    rbx,0xfffffffffffffffe
     1330882:	48 d1 eb             	shr    rbx,1
     1330885:	4c 6b fb 38          	imul   r15,rbx,0x38
     1330889:	4c 03 7c 24 08       	add    r15,QWORD PTR [rsp+0x8]
     133088e:	4c 89 ff             	mov    rdi,r15
     1330891:	4c 89 ee             	mov    rsi,r13
     1330894:	e8 6b 09 00 00       	call   1331204 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176788>
     1330899:	84 c0                	test   al,al
     133089b:	0f 84 b9 00 00 00    	je     133095a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175ede>
     13308a1:	49 8b 45 10          	mov    rax,QWORD PTR [r13+0x10]
     13308a5:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
     13308ac:	00 
     13308ad:	41 0f 10 45 00       	movups xmm0,XMMWORD PTR [r13+0x0]
     13308b2:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
     13308b9:	00 
     13308ba:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
     13308bf:	0f 57 c9             	xorps  xmm1,xmm1
     13308c2:	41 0f 11 4d 00       	movups XMMWORD PTR [r13+0x0],xmm1
     13308c7:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
     13308cb:	48 8d 8c 24 98 00 00 	lea    rcx,[rsp+0x98]
     13308d2:	00 
     13308d3:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
     13308d7:	41 0f 10 45 18       	movups xmm0,XMMWORD PTR [r13+0x18]
     13308dc:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
     13308df:	49 83 65 28 00       	and    QWORD PTR [r13+0x28],0x0
     13308e4:	41 0f 11 4d 18       	movups XMMWORD PTR [r13+0x18],xmm1
     13308e9:	41 8b 45 30          	mov    eax,DWORD PTR [r13+0x30]
     13308ed:	89 84 24 b0 00 00 00 	mov    DWORD PTR [rsp+0xb0],eax

### 0x13309d7, FDE=(20119676, 20122233)
     13309b2:	74 c4                	je     1330978 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175efc>
     13309b4:	48 8d 9c 24 80 00 00 	lea    rbx,[rsp+0x80]
     13309bb:	00 
     13309bc:	49 89 c6             	mov    r14,rax
     13309bf:	48 89 c7             	mov    rdi,rax
     13309c2:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
     13309c7:	4c 89 ee             	mov    rsi,r13
     13309ca:	e8 35 08 00 00       	call   1331204 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176788>
     13309cf:	84 c0                	test   al,al
     13309d1:	0f 84 86 00 00 00    	je     1330a5d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175fe1>
     13309d7:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     13309db:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
     13309e2:	00 
     13309e3:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
     13309e7:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
     13309ee:	00 
     13309ef:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     13309f4:	0f 57 c9             	xorps  xmm1,xmm1
     13309f7:	41 0f 11 0e          	movups XMMWORD PTR [r14],xmm1
     13309fb:	49 8b 45 60          	mov    rax,QWORD PTR [r13+0x60]
     13309ff:	48 8d 8c 24 98 00 00 	lea    rcx,[rsp+0x98]
     1330a06:	00 
     1330a07:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
     1330a0b:	41 0f 10 45 50       	movups xmm0,XMMWORD PTR [r13+0x50]
     1330a10:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
     1330a13:	49 83 65 60 00       	and    QWORD PTR [r13+0x60],0x0
     1330a18:	41 0f 11 4d 50       	movups XMMWORD PTR [r13+0x50],xmm1
     1330a1d:	41 8b 45 68          	mov    eax,DWORD PTR [r13+0x68]
     1330a21:	89 84 24 b0 00 00 00 	mov    DWORD PTR [rsp+0xb0],eax

### 0x1330b61, FDE=(20122233, 20123627)
     1330b40:	4c 89 f6             	mov    rsi,r14
     1330b43:	4c 89 ea             	mov    rdx,r13
     1330b46:	e8 a0 04 00 00       	call   1330feb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17656f>
     1330b4b:	8b 45 00             	mov    eax,DWORD PTR [rbp+0x0]
     1330b4e:	41 8b 4d fc          	mov    ecx,DWORD PTR [r13-0x4]
     1330b52:	89 4d 00             	mov    DWORD PTR [rbp+0x0],ecx
     1330b55:	41 89 45 fc          	mov    DWORD PTR [r13-0x4],eax
     1330b59:	eb 10                	jmp    1330b6b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1760ef>
     1330b5b:	4c 89 f7             	mov    rdi,r14
     1330b5e:	48 89 ee             	mov    rsi,rbp
     1330b61:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     1330b66:	e8 80 04 00 00       	call   1330feb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17656f>
     1330b6b:	49 ff cc             	dec    r12
     1330b6e:	8b 45 00             	mov    eax,DWORD PTR [rbp+0x0]
     1330b71:	48 89 e9             	mov    rcx,rbp
     1330b74:	80 7c 24 0c 00       	cmp    BYTE PTR [rsp+0xc],0x0
     1330b79:	75 08                	jne    1330b83 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176107>
     1330b7b:	48 89 e9             	mov    rcx,rbp
     1330b7e:	39 45 fc             	cmp    DWORD PTR [rbp-0x4],eax
     1330b81:	7d 3b                	jge    1330bbe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176142>
     1330b83:	49 89 ce             	mov    r14,rcx
     1330b86:	48 83 c1 04          	add    rcx,0x4
     1330b8a:	41 8b 56 04          	mov    edx,DWORD PTR [r14+0x4]
     1330b8e:	39 c2                	cmp    edx,eax
     1330b90:	7c f1                	jl     1330b83 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176107>
     1330b92:	48 89 df             	mov    rdi,rbx
     1330b95:	49 39 ee             	cmp    r14,rbp
     1330b98:	74 0e                	je     1330ba8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17612c>
     1330b9a:	48 8d 77 fc          	lea    rsi,[rdi-0x4]

### 0x1330d14, FDE=(20122233, 20123627)
     1330cec:	89 01                	mov    DWORD PTR [rcx],eax
     1330cee:	e9 bf fd ff ff       	jmp    1330ab2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176036>
     1330cf3:	4c 89 f3             	mov    rbx,r14
     1330cf6:	45 84 ff             	test   r15b,r15b
     1330cf9:	0f 84 95 fd ff ff    	je     1330a94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176018>
     1330cff:	e9 d8 02 00 00       	jmp    1330fdc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176560>
     1330d04:	48 8d 0d 69 71 06 ff 	lea    rcx,[rip+0xffffffffff067169]        # 397e74 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x4a55>
     1330d0b:	48 63 04 81          	movsxd rax,DWORD PTR [rcx+rax*4]
     1330d0f:	48 01 c8             	add    rax,rcx
     1330d12:	ff e0                	jmp    rax
     1330d14:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1330d19:	8b 00                	mov    eax,DWORD PTR [rax]
     1330d1b:	8b 4d 00             	mov    ecx,DWORD PTR [rbp+0x0]
     1330d1e:	39 c8                	cmp    eax,ecx
     1330d20:	0f 8d b6 02 00 00    	jge    1330fdc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176560>
     1330d26:	89 45 00             	mov    DWORD PTR [rbp+0x0],eax
     1330d29:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1330d2e:	89 08                	mov    DWORD PTR [rax],ecx
     1330d30:	e9 a7 02 00 00       	jmp    1330fdc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176560>
     1330d35:	48 8d 75 04          	lea    rsi,[rbp+0x4]
     1330d39:	48 89 ef             	mov    rdi,rbp
     1330d3c:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     1330d41:	48 83 c4 28          	add    rsp,0x28
     1330d45:	5b                   	pop    rbx
     1330d46:	41 5c                	pop    r12
     1330d48:	41 5d                	pop    r13
     1330d4a:	41 5e                	pop    r14
     1330d4c:	41 5f                	pop    r15
     1330d4e:	5d                   	pop    rbp

### 0x1330d86, FDE=(20122233, 20123627)
     1330d6c:	5b                   	pop    rbx
     1330d6d:	41 5c                	pop    r12
     1330d6f:	41 5d                	pop    r13
     1330d71:	41 5e                	pop    r14
     1330d73:	41 5f                	pop    r15
     1330d75:	5d                   	pop    rbp
     1330d76:	e9 fe 02 00 00       	jmp    1331079 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1765fd>
     1330d7b:	48 8d 75 04          	lea    rsi,[rbp+0x4]
     1330d7f:	48 8d 55 08          	lea    rdx,[rbp+0x8]
     1330d83:	48 89 ef             	mov    rdi,rbp
     1330d86:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     1330d8b:	48 83 c4 28          	add    rsp,0x28
     1330d8f:	5b                   	pop    rbx
     1330d90:	41 5c                	pop    r12
     1330d92:	41 5d                	pop    r13
     1330d94:	41 5e                	pop    r14
     1330d96:	41 5f                	pop    r15
     1330d98:	5d                   	pop    rbp
     1330d99:	e9 88 02 00 00       	jmp    1331026 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1765aa>
     1330d9e:	48 39 dd             	cmp    rbp,rbx
     1330da1:	0f 94 c2             	sete   dl
     1330da4:	48 8d 4d 04          	lea    rcx,[rbp+0x4]
     1330da8:	48 39 d9             	cmp    rcx,rbx
     1330dab:	0f 94 c0             	sete   al
     1330dae:	08 d0                	or     al,dl
     1330db0:	80 7c 24 0c 00       	cmp    BYTE PTR [rsp+0xc],0x0
     1330db5:	0f 84 f5 01 00 00    	je     1330fb0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176534>
     1330dbb:	84 c0                	test   al,al
     1330dbd:	0f 85 19 02 00 00    	jne    1330fdc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176560>

### 0x13314fb, FDE=(20124679, 20125186)
     13314d8:	31 db                	xor    ebx,ebx
     13314da:	6a 90                	push   0xffffffffffffff90
     13314dc:	41 5e                	pop    r14
     13314de:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]
     13314e3:	4c 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],r15
     13314e8:	4c 89 e7             	mov    rdi,r12
     13314eb:	48 89 ee             	mov    rsi,rbp
     13314ee:	e8 11 fd ff ff       	call   1331204 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176788>
     13314f3:	84 c0                	test   al,al
     13314f5:	0f 84 a2 00 00 00    	je     133159d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176b21>
     13314fb:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
     1331500:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     1331505:	41 0f 10 04 24       	movups xmm0,XMMWORD PTR [r12]
     133150a:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     133150f:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0
     1331515:	0f 57 c9             	xorps  xmm1,xmm1
     1331518:	41 0f 11 0c 24       	movups XMMWORD PTR [r12],xmm1
     133151d:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
     1331522:	48 8d 4c 24 28       	lea    rcx,[rsp+0x28]
     1331527:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
     133152b:	41 0f 10 44 24 18    	movups xmm0,XMMWORD PTR [r12+0x18]
     1331531:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
     1331534:	49 83 64 24 28 00    	and    QWORD PTR [r12+0x28],0x0
     133153a:	41 0f 11 4c 24 18    	movups XMMWORD PTR [r12+0x18],xmm1
     1331540:	41 8b 44 24 30       	mov    eax,DWORD PTR [r12+0x30]
     1331545:	89 44 24 40          	mov    DWORD PTR [rsp+0x40],eax
     1331549:	4d 89 f7             	mov    r15,r14
     133154c:	48 8d 7d 38          	lea    rdi,[rbp+0x38]
     1331550:	48 89 ee             	mov    rsi,rbp

### 0x133228e, FDE=(20126670, 20131289)
     1332262:	00 00 
     1332264:	66 0f 7f 84 24 90 01 	movdqa XMMWORD PTR [rsp+0x190],xmm0
     133226b:	00 00 
     133226d:	c7 84 24 b0 01 00 00 	mov    DWORD PTR [rsp+0x1b0],0x3f800000
     1332274:	00 00 80 3f 
     1332278:	48 8b 9c 24 d0 01 00 	mov    rbx,QWORD PTR [rsp+0x1d0]
     133227f:	00 
     1332280:	48 85 db             	test   rbx,rbx
     1332283:	0f 84 d3 04 00 00    	je     133275c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177ce0>
     1332289:	48 89 6c 24 20       	mov    QWORD PTR [rsp+0x20],rbp
     133228e:	4c 8b 7b 10          	mov    r15,QWORD PTR [rbx+0x10]
     1332292:	4d 63 e7             	movsxd r12,r15d
     1332295:	48 8b ac 24 98 01 00 	mov    rbp,QWORD PTR [rsp+0x198]
     133229c:	00 
     133229d:	48 85 ed             	test   rbp,rbp
     13322a0:	74 7c                	je     133231e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1778a2>
     13322a2:	f3 48 0f b8 cd       	popcnt rcx,rbp
     13322a7:	48 83 f9 01          	cmp    rcx,0x1
     13322ab:	77 09                	ja     13322b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17783a>
     13322ad:	4c 8d 6d ff          	lea    r13,[rbp-0x1]
     13322b1:	4d 21 e5             	and    r13,r12
     13322b4:	eb 13                	jmp    13322c9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17784d>
     13322b6:	4d 89 e5             	mov    r13,r12
     13322b9:	4c 39 e5             	cmp    rbp,r12
     13322bc:	77 0b                	ja     13322c9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17784d>
     13322be:	4c 89 e0             	mov    rax,r12
     13322c1:	31 d2                	xor    edx,edx
     13322c3:	48 f7 f5             	div    rbp
     13322c6:	49 89 d5             	mov    r13,rdx

### 0x1332ddb, FDE=(20131290, 20131327)
     1332db9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1332dc0:	00 00 
     1332dc2:	48 3b 84 24 30 03 00 	cmp    rax,QWORD PTR [rsp+0x330]
     1332dc9:	00 
     1332dca:	75 08                	jne    1332dd4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178358>
     1332dcc:	4c 89 f7             	mov    rdi,r14
     1332dcf:	e8 fc ce 73 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1332dd4:	e8 d7 cc 4b 00       	call   17efab0 <__stack_chk_fail@plt>
     1332dd9:	cc                   	int3
     1332dda:	53                   	push   rbx
     1332ddb:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     1332ddf:	48 85 c0             	test   rax,rax
     1332de2:	74 11                	je     1332df5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178379>
     1332de4:	48 89 fb             	mov    rbx,rdi
     1332de7:	31 ff                	xor    edi,edi
     1332de9:	48 89 de             	mov    rsi,rbx
     1332dec:	31 d2                	xor    edx,edx
     1332dee:	ff d0                	call   rax
     1332df0:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     1332df5:	5b                   	pop    rbx
     1332df6:	c3                   	ret
     1332df7:	48 89 c7             	mov    rdi,rax
     1332dfa:	e8 a6 6c 74 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1332dff:	cc                   	int3
     1332e00:	55                   	push   rbp
     1332e01:	41 57                	push   r15
     1332e03:	41 56                	push   r14
     1332e05:	41 55                	push   r13
     1332e07:	41 54                	push   r12

### 0x1332fca, FDE=(20131328, 20138970)
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

### 0x1333887, FDE=(20131328, 20138970)
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

### 0x1334489, FDE=(20131328, 20138970)
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

### 0x1334bdb, FDE=(20138970, 20139007)
     1334bb5:	e8 cc 98 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1334bba:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1334bc1:	00 00 
     1334bc3:	48 3b 84 24 30 05 00 	cmp    rax,QWORD PTR [rsp+0x530]
     1334bca:	00 
     1334bcb:	75 08                	jne    1334bd5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a159>
     1334bcd:	4c 89 f7             	mov    rdi,r14
     1334bd0:	e8 fb b0 73 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1334bd5:	e8 d6 ae 4b 00       	call   17efab0 <__stack_chk_fail@plt>
     1334bda:	53                   	push   rbx
     1334bdb:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     1334bdf:	48 85 c0             	test   rax,rax
     1334be2:	74 11                	je     1334bf5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a179>
     1334be4:	48 89 fb             	mov    rbx,rdi
     1334be7:	31 ff                	xor    edi,edi
     1334be9:	48 89 de             	mov    rsi,rbx
     1334bec:	31 d2                	xor    edx,edx
     1334bee:	ff d0                	call   rax
     1334bf0:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     1334bf5:	5b                   	pop    rbx
     1334bf6:	c3                   	ret
     1334bf7:	48 89 c7             	mov    rdi,rax
     1334bfa:	e8 a6 4e 74 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1334bff:	cc                   	int3
     1334c00:	53                   	push   rbx
     1334c01:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     1334c04:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     1334c08:	48 85 db             	test   rbx,rbx
     1334c0b:	74 2f                	je     1334c3c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a1c0>

### 0x1334c46, FDE=(20139070, 20139143)
     1334c2e:	e8 a7 e1 ff ff       	call   1332dda <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17835e>
     1334c33:	48 89 df             	mov    rdi,rbx
     1334c36:	5b                   	pop    rbx
     1334c37:	e9 e4 92 4b 00       	jmp    17edf20 <_ZdlPv@plt>
     1334c3c:	5b                   	pop    rbx
     1334c3d:	c3                   	ret
     1334c3e:	41 57                	push   r15
     1334c40:	41 56                	push   r14
     1334c42:	53                   	push   rbx
     1334c43:	48 89 fb             	mov    rbx,rdi
     1334c46:	4c 8b 77 10          	mov    r14,QWORD PTR [rdi+0x10]
     1334c4a:	4d 85 f6             	test   r14,r14
     1334c4d:	74 1c                	je     1334c6b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a1ef>
     1334c4f:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
     1334c52:	49 8d 7e 10          	lea    rdi,[r14+0x10]
     1334c56:	e8 b1 00 00 00       	call   1334d0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a290>
     1334c5b:	4c 89 f7             	mov    rdi,r14
     1334c5e:	e8 bd 92 4b 00       	call   17edf20 <_ZdlPv@plt>
     1334c63:	4d 89 fe             	mov    r14,r15
     1334c66:	4d 85 ff             	test   r15,r15
     1334c69:	75 e4                	jne    1334c4f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a1d3>
     1334c6b:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     1334c6e:	48 83 23 00          	and    QWORD PTR [rbx],0x0
     1334c72:	48 85 ff             	test   rdi,rdi
     1334c75:	74 0a                	je     1334c81 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a205>
     1334c77:	5b                   	pop    rbx
     1334c78:	41 5e                	pop    r14
     1334c7a:	41 5f                	pop    r15
     1334c7c:	e9 9f 92 4b 00       	jmp    17edf20 <_ZdlPv@plt>

### 0x1334c90, FDE=(20139144, 20139217)
     1334c7c:	e9 9f 92 4b 00       	jmp    17edf20 <_ZdlPv@plt>
     1334c81:	5b                   	pop    rbx
     1334c82:	41 5e                	pop    r14
     1334c84:	41 5f                	pop    r15
     1334c86:	c3                   	ret
     1334c87:	cc                   	int3
     1334c88:	41 57                	push   r15
     1334c8a:	41 56                	push   r14
     1334c8c:	53                   	push   rbx
     1334c8d:	48 89 fb             	mov    rbx,rdi
     1334c90:	4c 8b 77 10          	mov    r14,QWORD PTR [rdi+0x10]
     1334c94:	4d 85 f6             	test   r14,r14
     1334c97:	74 1c                	je     1334cb5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a239>
     1334c99:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
     1334c9c:	49 8d 7e 10          	lea    rdi,[r14+0x10]
     1334ca0:	e8 2d 00 00 00       	call   1334cd2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a256>
     1334ca5:	4c 89 f7             	mov    rdi,r14
     1334ca8:	e8 73 92 4b 00       	call   17edf20 <_ZdlPv@plt>
     1334cad:	4d 89 fe             	mov    r14,r15
     1334cb0:	4d 85 ff             	test   r15,r15
     1334cb3:	75 e4                	jne    1334c99 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a21d>
     1334cb5:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     1334cb8:	48 83 23 00          	and    QWORD PTR [rbx],0x0
     1334cbc:	48 85 ff             	test   rdi,rdi
     1334cbf:	74 0a                	je     1334ccb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a24f>
     1334cc1:	5b                   	pop    rbx
     1334cc2:	41 5e                	pop    r14
     1334cc4:	41 5f                	pop    r15
     1334cc6:	e9 55 92 4b 00       	jmp    17edf20 <_ZdlPv@plt>

### 0x1335064, FDE=(20139982, 20141171)
     1335041:	4d 85 ed             	test   r13,r13
     1335044:	74 54                	je     133509a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a61e>
     1335046:	48 8d 45 ff          	lea    rax,[rbp-0x1]
     133504a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     133504f:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
     1335053:	48 39 c8             	cmp    rax,rcx
     1335056:	75 1a                	jne    1335072 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a5f6>
     1335058:	49 8d 7d 10          	lea    rdi,[r13+0x10]
     133505c:	4c 89 e6             	mov    rsi,r12
     133505f:	e8 c4 06 00 00       	call   1335728 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17acac>
     1335064:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     1335069:	84 c0                	test   al,al
     133506b:	74 24                	je     1335091 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a615>
     133506d:	e9 97 03 00 00       	jmp    1335409 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a98d>
     1335072:	41 83 fe 01          	cmp    r14d,0x1
     1335076:	77 07                	ja     133507f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a603>
     1335078:	48 23 44 24 08       	and    rax,QWORD PTR [rsp+0x8]
     133507d:	eb 0d                	jmp    133508c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a610>
     133507f:	48 39 e8             	cmp    rax,rbp
     1335082:	72 08                	jb     133508c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a610>
     1335084:	31 d2                	xor    edx,edx
     1335086:	48 f7 f5             	div    rbp
     1335089:	48 89 d0             	mov    rax,rdx
     133508c:	4c 39 f8             	cmp    rax,r15
     133508f:	75 09                	jne    133509a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a61e>
     1335091:	4d 8b 6d 00          	mov    r13,QWORD PTR [r13+0x0]
     1335095:	4d 85 ed             	test   r13,r13
     1335098:	75 b5                	jne    133504f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a5d3>
     133509a:	4c 8d 73 10          	lea    r14,[rbx+0x10]

### 0x1335374, FDE=(20139982, 20141171)
     133534f:	4d 85 ff             	test   r15,r15
     1335352:	0f 85 63 fe ff ff    	jne    13351bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a73f>
     1335358:	48 89 df             	mov    rdi,rbx
     133535b:	31 f6                	xor    esi,esi
     133535d:	e8 34 a4 76 ff       	call   a9f796 <JNI_OnUnload@@Base+0x27063>
     1335362:	48 83 63 08 00       	and    QWORD PTR [rbx+0x8],0x0
     1335367:	48 8b 6b 08          	mov    rbp,QWORD PTR [rbx+0x8]
     133536b:	48 8d 45 ff          	lea    rax,[rbp-0x1]
     133536f:	48 85 c5             	test   rbp,rax
     1335372:	75 0a                	jne    133537e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a902>
     1335374:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     1335379:	49 21 c7             	and    r15,rax
     133537c:	eb 15                	jmp    1335393 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a917>
     133537e:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     1335383:	49 39 ef             	cmp    r15,rbp
     1335386:	72 0b                	jb     1335393 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a917>
     1335388:	4c 89 f8             	mov    rax,r15
     133538b:	31 d2                	xor    edx,edx
     133538d:	48 f7 f5             	div    rbp
     1335390:	49 89 d7             	mov    r15,rdx
     1335393:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1335396:	4a 8b 04 f8          	mov    rax,QWORD PTR [rax+r15*8]
     133539a:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
     133539f:	48 85 c0             	test   rax,rax
     13353a2:	74 09                	je     13353ad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a931>
     13353a4:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     13353a7:	49 89 4d 00          	mov    QWORD PTR [r13+0x0],rcx
     13353ab:	eb 47                	jmp    13353f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a978>
     13353ad:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]

### 0x133537e, FDE=(20139982, 20141171)
     133535b:	31 f6                	xor    esi,esi
     133535d:	e8 34 a4 76 ff       	call   a9f796 <JNI_OnUnload@@Base+0x27063>
     1335362:	48 83 63 08 00       	and    QWORD PTR [rbx+0x8],0x0
     1335367:	48 8b 6b 08          	mov    rbp,QWORD PTR [rbx+0x8]
     133536b:	48 8d 45 ff          	lea    rax,[rbp-0x1]
     133536f:	48 85 c5             	test   rbp,rax
     1335372:	75 0a                	jne    133537e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a902>
     1335374:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     1335379:	49 21 c7             	and    r15,rax
     133537c:	eb 15                	jmp    1335393 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a917>
     133537e:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     1335383:	49 39 ef             	cmp    r15,rbp
     1335386:	72 0b                	jb     1335393 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a917>
     1335388:	4c 89 f8             	mov    rax,r15
     133538b:	31 d2                	xor    edx,edx
     133538d:	48 f7 f5             	div    rbp
     1335390:	49 89 d7             	mov    r15,rdx
     1335393:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1335396:	4a 8b 04 f8          	mov    rax,QWORD PTR [rax+r15*8]
     133539a:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
     133539f:	48 85 c0             	test   rax,rax
     13353a2:	74 09                	je     13353ad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a931>
     13353a4:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     13353a7:	49 89 4d 00          	mov    QWORD PTR [r13+0x0],rcx
     13353ab:	eb 47                	jmp    13353f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a978>
     13353ad:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     13353b1:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     13353b5:	4c 89 6b 10          	mov    QWORD PTR [rbx+0x10],r13
     13353b9:	48 8b 03             	mov    rax,QWORD PTR [rbx]

### 0x13353ad, FDE=(20139982, 20141171)
     133538d:	48 f7 f5             	div    rbp
     1335390:	49 89 d7             	mov    r15,rdx
     1335393:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1335396:	4a 8b 04 f8          	mov    rax,QWORD PTR [rax+r15*8]
     133539a:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
     133539f:	48 85 c0             	test   rax,rax
     13353a2:	74 09                	je     13353ad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a931>
     13353a4:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     13353a7:	49 89 4d 00          	mov    QWORD PTR [r13+0x0],rcx
     13353ab:	eb 47                	jmp    13353f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a978>
     13353ad:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     13353b1:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     13353b5:	4c 89 6b 10          	mov    QWORD PTR [rbx+0x10],r13
     13353b9:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     13353bc:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     13353c1:	4a 89 0c f8          	mov    QWORD PTR [rax+r15*8],rcx
     13353c5:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     13353c9:	48 85 c0             	test   rax,rax
     13353cc:	74 29                	je     13353f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a97b>
     13353ce:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     13353d2:	48 8d 4d ff          	lea    rcx,[rbp-0x1]
     13353d6:	48 85 cd             	test   rbp,rcx
     13353d9:	75 05                	jne    13353e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a964>
     13353db:	48 21 c8             	and    rax,rcx
     13353de:	eb 0d                	jmp    13353ed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a971>
     13353e0:	48 39 e8             	cmp    rax,rbp
     13353e3:	72 08                	jb     13353ed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a971>
     13353e5:	31 d2                	xor    edx,edx
     13353e7:	48 f7 f5             	div    rbp

### 0x1335b41, FDE=(20142202, 20144284)
     1335b18:	49 89 c5             	mov    r13,rax
     1335b1b:	49 8d 47 68          	lea    rax,[r15+0x68]
     1335b1f:	4c 89 ac 24 f8 00 00 	mov    QWORD PTR [rsp+0xf8],r13
     1335b26:	00 
     1335b27:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     1335b2c:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
     1335b33:	00 
     1335b34:	49 83 65 00 00       	and    QWORD PTR [r13+0x0],0x0
     1335b39:	c6 84 24 08 01 00 00 	mov    BYTE PTR [rsp+0x108],0x0
     1335b40:	00 
     1335b41:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1335b46:	49 89 45 08          	mov    QWORD PTR [r13+0x8],rax
     1335b4a:	4c 89 ef             	mov    rdi,r13
     1335b4d:	48 83 c7 10          	add    rdi,0x10
     1335b51:	48 89 ee             	mov    rsi,rbp
     1335b54:	e8 33 fc ff ff       	call   133578c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ad10>
     1335b59:	49 83 a5 a0 00 00 00 	and    QWORD PTR [r13+0xa0],0x0
     1335b60:	00 
     1335b61:	c6 84 24 08 01 00 00 	mov    BYTE PTR [rsp+0x108],0x1
     1335b68:	01 
     1335b69:	49 8b 47 70          	mov    rax,QWORD PTR [r15+0x70]
     1335b6d:	48 ff c0             	inc    rax
     1335b70:	78 07                	js     1335b79 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b0fd>
     1335b72:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     1335b77:	eb 15                	jmp    1335b8e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b112>
     1335b79:	48 89 c1             	mov    rcx,rax
     1335b7c:	48 d1 e9             	shr    rcx,1
     1335b7f:	83 e0 01             	and    eax,0x1
     1335b82:	48 09 c8             	or     rax,rcx

### 0x1335e0a, FDE=(20142202, 20144284)
     1335de5:	4d 85 e4             	test   r12,r12
     1335de8:	0f 85 53 fe ff ff    	jne    1335c41 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b1c5>
     1335dee:	4c 89 f7             	mov    rdi,r14
     1335df1:	31 f6                	xor    esi,esi
     1335df3:	e8 9e 99 76 ff       	call   a9f796 <JNI_OnUnload@@Base+0x27063>
     1335df8:	49 83 67 60 00       	and    QWORD PTR [r15+0x60],0x0
     1335dfd:	49 8b 5f 60          	mov    rbx,QWORD PTR [r15+0x60]
     1335e01:	48 8d 43 ff          	lea    rax,[rbx-0x1]
     1335e05:	48 85 c3             	test   rbx,rax
     1335e08:	75 0a                	jne    1335e14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b398>
     1335e0a:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     1335e0f:	48 21 c2             	and    rdx,rax
     1335e12:	eb 12                	jmp    1335e26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b3aa>
     1335e14:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     1335e19:	48 39 da             	cmp    rdx,rbx
     1335e1c:	72 08                	jb     1335e26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b3aa>
     1335e1e:	48 89 d0             	mov    rax,rdx
     1335e21:	31 d2                	xor    edx,edx
     1335e23:	48 f7 f3             	div    rbx
     1335e26:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1335e29:	48 8b 04 d0          	mov    rax,QWORD PTR [rax+rdx*8]
     1335e2d:	4c 8b bc 24 f8 00 00 	mov    r15,QWORD PTR [rsp+0xf8]
     1335e34:	00 
     1335e35:	48 85 c0             	test   rax,rax
     1335e38:	74 08                	je     1335e42 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b3c6>
     1335e3a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     1335e3d:	49 89 0f             	mov    QWORD PTR [r15],rcx
     1335e40:	eb 43                	jmp    1335e85 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b409>
     1335e42:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]

### 0x1336530, FDE=(20144732, 20145944)
     1336504:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]
     1336509:	4c 89 ff             	mov    rdi,r15
     133650c:	4c 89 f6             	mov    rsi,r14
     133650f:	e8 16 40 39 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     1336514:	48 8d 35 19 8f ff fe 	lea    rsi,[rip+0xfffffffffeff8f19]        # 32f434 <_ZTSSt12bad_any_cast@@Base-0x60d94>
     133651b:	4c 8d 74 24 40       	lea    r14,[rsp+0x40]
     1336520:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
     1336525:	4c 89 f7             	mov    rdi,r14
     1336528:	4c 89 fa             	mov    rdx,r15
     133652b:	e8 87 3e 2a 00       	call   15da3b7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f93b>
     1336530:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     1336534:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
     133653b:	00 
     133653c:	41 0f 28 06          	movaps xmm0,XMMWORD PTR [r14]
     1336540:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
     1336547:	00 
     1336548:	0f 57 c0             	xorps  xmm0,xmm0
     133654b:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     1336550:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
     1336554:	83 a4 24 98 00 00 00 	and    DWORD PTR [rsp+0x98],0x0
     133655b:	00 
     133655c:	4c 89 f7             	mov    rdi,r14
     133655f:	e8 2c 79 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1336564:	4c 89 ff             	mov    rdi,r15
     1336567:	e8 24 79 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     133656c:	eb 37                	jmp    13365a5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17bb29>
     133656e:	d1 e9                	shr    ecx,1
     1336570:	48 85 c9             	test   rcx,rcx
     1336573:	74 34                	je     13365a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17bb2d>

### 0x1336772, FDE=(20145996, 20146210)
     133674e:	41 56                	push   r14
     1336750:	41 54                	push   r12
     1336752:	53                   	push   rbx
     1336753:	48 83 ec 18          	sub    rsp,0x18
     1336757:	48 89 d3             	mov    rbx,rdx
     133675a:	49 89 f6             	mov    r14,rsi
     133675d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1336764:	00 00 
     1336766:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     133676b:	48 8b 82 00 02 00 00 	mov    rax,QWORD PTR [rdx+0x200]
     1336772:	48 8b 50 10          	mov    rdx,QWORD PTR [rax+0x10]
     1336776:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     133677b:	49 89 ff             	mov    r15,rdi
     133677e:	4c 8d 63 10          	lea    r12,[rbx+0x10]
     1336782:	48 8d 4c 24 08       	lea    rcx,[rsp+0x8]
     1336787:	48 89 11             	mov    QWORD PTR [rcx],rdx
     133678a:	4c 89 e2             	mov    rdx,r12
     133678d:	e8 90 00 00 00       	call   1336822 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17bda6>
     1336792:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     1336797:	48 85 ff             	test   rdi,rdi
     133679a:	74 06                	je     13367a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17bd26>
     133679c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     133679f:	ff 50 08             	call   QWORD PTR [rax+0x8]
     13367a2:	49 8d 7e 30          	lea    rdi,[r14+0x30]
     13367a6:	4c 89 e6             	mov    rsi,r12
     13367a9:	e8 58 02 00 00       	call   1336a06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17bf8a>
     13367ae:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
     13367b2:	48 89 c7             	mov    rdi,rax
     13367b5:	e8 50 31 7f ff       	call   b2990a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x768aa>

### 0x1336a9c, FDE=(20146694, 20147883)
     1336a79:	4d 85 ed             	test   r13,r13
     1336a7c:	74 54                	je     1336ad2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c056>
     1336a7e:	48 8d 45 ff          	lea    rax,[rbp-0x1]
     1336a82:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1336a87:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
     1336a8b:	48 39 c8             	cmp    rax,rcx
     1336a8e:	75 1a                	jne    1336aaa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c02e>
     1336a90:	49 8d 7d 10          	lea    rdi,[r13+0x10]
     1336a94:	4c 89 e6             	mov    rsi,r12
     1336a97:	e8 28 6a f7 ff       	call   12ad4c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf2a48>
     1336a9c:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     1336aa1:	84 c0                	test   al,al
     1336aa3:	74 24                	je     1336ac9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c04d>
     1336aa5:	e9 97 03 00 00       	jmp    1336e41 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c3c5>
     1336aaa:	41 83 fe 01          	cmp    r14d,0x1
     1336aae:	77 07                	ja     1336ab7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c03b>
     1336ab0:	48 23 44 24 08       	and    rax,QWORD PTR [rsp+0x8]
     1336ab5:	eb 0d                	jmp    1336ac4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c048>
     1336ab7:	48 39 e8             	cmp    rax,rbp
     1336aba:	72 08                	jb     1336ac4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c048>
     1336abc:	31 d2                	xor    edx,edx
     1336abe:	48 f7 f5             	div    rbp
     1336ac1:	48 89 d0             	mov    rax,rdx
     1336ac4:	4c 39 f8             	cmp    rax,r15
     1336ac7:	75 09                	jne    1336ad2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c056>
     1336ac9:	4d 8b 6d 00          	mov    r13,QWORD PTR [r13+0x0]
     1336acd:	4d 85 ed             	test   r13,r13
     1336ad0:	75 b5                	jne    1336a87 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c00b>
     1336ad2:	4c 8d 73 10          	lea    r14,[rbx+0x10]

### 0x1336dac, FDE=(20146694, 20147883)
     1336d87:	4d 85 ff             	test   r15,r15
     1336d8a:	0f 85 63 fe ff ff    	jne    1336bf3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c177>
     1336d90:	48 89 df             	mov    rdi,rbx
     1336d93:	31 f6                	xor    esi,esi
     1336d95:	e8 fc 89 76 ff       	call   a9f796 <JNI_OnUnload@@Base+0x27063>
     1336d9a:	48 83 63 08 00       	and    QWORD PTR [rbx+0x8],0x0
     1336d9f:	48 8b 6b 08          	mov    rbp,QWORD PTR [rbx+0x8]
     1336da3:	48 8d 45 ff          	lea    rax,[rbp-0x1]
     1336da7:	48 85 c5             	test   rbp,rax
     1336daa:	75 0a                	jne    1336db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c33a>
     1336dac:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     1336db1:	49 21 c7             	and    r15,rax
     1336db4:	eb 15                	jmp    1336dcb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c34f>
     1336db6:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     1336dbb:	49 39 ef             	cmp    r15,rbp
     1336dbe:	72 0b                	jb     1336dcb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c34f>
     1336dc0:	4c 89 f8             	mov    rax,r15
     1336dc3:	31 d2                	xor    edx,edx
     1336dc5:	48 f7 f5             	div    rbp
     1336dc8:	49 89 d7             	mov    r15,rdx
     1336dcb:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1336dce:	4a 8b 04 f8          	mov    rax,QWORD PTR [rax+r15*8]
     1336dd2:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
     1336dd7:	48 85 c0             	test   rax,rax
     1336dda:	74 09                	je     1336de5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c369>
     1336ddc:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     1336ddf:	49 89 4d 00          	mov    QWORD PTR [r13+0x0],rcx
     1336de3:	eb 47                	jmp    1336e2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c3b0>
     1336de5:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]

### 0x1336db6, FDE=(20146694, 20147883)
     1336d93:	31 f6                	xor    esi,esi
     1336d95:	e8 fc 89 76 ff       	call   a9f796 <JNI_OnUnload@@Base+0x27063>
     1336d9a:	48 83 63 08 00       	and    QWORD PTR [rbx+0x8],0x0
     1336d9f:	48 8b 6b 08          	mov    rbp,QWORD PTR [rbx+0x8]
     1336da3:	48 8d 45 ff          	lea    rax,[rbp-0x1]
     1336da7:	48 85 c5             	test   rbp,rax
     1336daa:	75 0a                	jne    1336db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c33a>
     1336dac:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     1336db1:	49 21 c7             	and    r15,rax
     1336db4:	eb 15                	jmp    1336dcb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c34f>
     1336db6:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     1336dbb:	49 39 ef             	cmp    r15,rbp
     1336dbe:	72 0b                	jb     1336dcb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c34f>
     1336dc0:	4c 89 f8             	mov    rax,r15
     1336dc3:	31 d2                	xor    edx,edx
     1336dc5:	48 f7 f5             	div    rbp
     1336dc8:	49 89 d7             	mov    r15,rdx
     1336dcb:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1336dce:	4a 8b 04 f8          	mov    rax,QWORD PTR [rax+r15*8]
     1336dd2:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
     1336dd7:	48 85 c0             	test   rax,rax
     1336dda:	74 09                	je     1336de5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c369>
     1336ddc:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     1336ddf:	49 89 4d 00          	mov    QWORD PTR [r13+0x0],rcx
     1336de3:	eb 47                	jmp    1336e2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c3b0>
     1336de5:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     1336de9:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     1336ded:	4c 89 6b 10          	mov    QWORD PTR [rbx+0x10],r13
     1336df1:	48 8b 03             	mov    rax,QWORD PTR [rbx]

### 0x1336de5, FDE=(20146694, 20147883)
     1336dc5:	48 f7 f5             	div    rbp
     1336dc8:	49 89 d7             	mov    r15,rdx
     1336dcb:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1336dce:	4a 8b 04 f8          	mov    rax,QWORD PTR [rax+r15*8]
     1336dd2:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
     1336dd7:	48 85 c0             	test   rax,rax
     1336dda:	74 09                	je     1336de5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c369>
     1336ddc:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     1336ddf:	49 89 4d 00          	mov    QWORD PTR [r13+0x0],rcx
     1336de3:	eb 47                	jmp    1336e2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c3b0>
     1336de5:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     1336de9:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     1336ded:	4c 89 6b 10          	mov    QWORD PTR [rbx+0x10],r13
     1336df1:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1336df4:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     1336df9:	4a 89 0c f8          	mov    QWORD PTR [rax+r15*8],rcx
     1336dfd:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     1336e01:	48 85 c0             	test   rax,rax
     1336e04:	74 29                	je     1336e2f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c3b3>
     1336e06:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     1336e0a:	48 8d 4d ff          	lea    rcx,[rbp-0x1]
     1336e0e:	48 85 cd             	test   rbp,rcx
     1336e11:	75 05                	jne    1336e18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c39c>
     1336e13:	48 21 c8             	and    rax,rcx
     1336e16:	eb 0d                	jmp    1336e25 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c3a9>
     1336e18:	48 39 e8             	cmp    rax,rbp
     1336e1b:	72 08                	jb     1336e25 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c3a9>
     1336e1d:	31 d2                	xor    edx,edx
     1336e1f:	48 f7 f5             	div    rbp

### 0x13371c1, FDE=(20147962, 20150044)
     1337198:	49 89 c5             	mov    r13,rax
     133719b:	49 8d 47 68          	lea    rax,[r15+0x68]
     133719f:	4c 89 ac 24 60 02 00 	mov    QWORD PTR [rsp+0x260],r13
     13371a6:	00 
     13371a7:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     13371ac:	48 89 84 24 68 02 00 	mov    QWORD PTR [rsp+0x268],rax
     13371b3:	00 
     13371b4:	49 83 65 00 00       	and    QWORD PTR [r13+0x0],0x0
     13371b9:	c6 84 24 70 02 00 00 	mov    BYTE PTR [rsp+0x270],0x0
     13371c0:	00 
     13371c1:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     13371c6:	49 89 45 08          	mov    QWORD PTR [r13+0x8],rax
     13371ca:	4c 89 ef             	mov    rdi,r13
     13371cd:	48 83 c7 10          	add    rdi,0x10
     13371d1:	48 89 ee             	mov    rsi,rbp
     13371d4:	e8 35 63 f7 ff       	call   12ad50e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf2a92>
     13371d9:	49 83 a5 00 02 00 00 	and    QWORD PTR [r13+0x200],0x0
     13371e0:	00 
     13371e1:	c6 84 24 70 02 00 00 	mov    BYTE PTR [rsp+0x270],0x1
     13371e8:	01 
     13371e9:	49 8b 47 70          	mov    rax,QWORD PTR [r15+0x70]
     13371ed:	48 ff c0             	inc    rax
     13371f0:	78 07                	js     13371f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c77d>
     13371f2:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     13371f7:	eb 15                	jmp    133720e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c792>
     13371f9:	48 89 c1             	mov    rcx,rax
     13371fc:	48 d1 e9             	shr    rcx,1
     13371ff:	83 e0 01             	and    eax,0x1
     1337202:	48 09 c8             	or     rax,rcx

### 0x133748a, FDE=(20147962, 20150044)
     1337465:	4d 85 e4             	test   r12,r12
     1337468:	0f 85 53 fe ff ff    	jne    13372c1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c845>
     133746e:	4c 89 f7             	mov    rdi,r14
     1337471:	31 f6                	xor    esi,esi
     1337473:	e8 1e 83 76 ff       	call   a9f796 <JNI_OnUnload@@Base+0x27063>
     1337478:	49 83 67 60 00       	and    QWORD PTR [r15+0x60],0x0
     133747d:	49 8b 5f 60          	mov    rbx,QWORD PTR [r15+0x60]
     1337481:	48 8d 43 ff          	lea    rax,[rbx-0x1]
     1337485:	48 85 c3             	test   rbx,rax
     1337488:	75 0a                	jne    1337494 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ca18>
     133748a:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     133748f:	48 21 c2             	and    rdx,rax
     1337492:	eb 12                	jmp    13374a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ca2a>
     1337494:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     1337499:	48 39 da             	cmp    rdx,rbx
     133749c:	72 08                	jb     13374a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ca2a>
     133749e:	48 89 d0             	mov    rax,rdx
     13374a1:	31 d2                	xor    edx,edx
     13374a3:	48 f7 f3             	div    rbx
     13374a6:	49 8b 06             	mov    rax,QWORD PTR [r14]
     13374a9:	48 8b 04 d0          	mov    rax,QWORD PTR [rax+rdx*8]
     13374ad:	4c 8b bc 24 60 02 00 	mov    r15,QWORD PTR [rsp+0x260]
     13374b4:	00 
     13374b5:	48 85 c0             	test   rax,rax
     13374b8:	74 08                	je     13374c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ca46>
     13374ba:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     13374bd:	49 89 0f             	mov    QWORD PTR [r15],rcx
     13374c0:	eb 43                	jmp    1337505 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ca89>
     13374c2:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]

### 0x133854e, FDE=(20152988, 20155013)
     1338525:	0f 28 84 24 80 00 00 	movaps xmm0,XMMWORD PTR [rsp+0x80]
     133852c:	00 
     133852d:	41 0f 11 45 00       	movups XMMWORD PTR [r13+0x0],xmm0
     1338532:	48 83 a4 24 90 00 00 	and    QWORD PTR [rsp+0x90],0x0
     1338539:	00 00 
     133853b:	0f 57 c9             	xorps  xmm1,xmm1
     133853e:	0f 29 8c 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm1
     1338545:	00 
     1338546:	48 8d 8c 24 98 00 00 	lea    rcx,[rsp+0x98]
     133854d:	00 
     133854e:	48 8b 41 10          	mov    rax,QWORD PTR [rcx+0x10]
     1338552:	49 89 45 28          	mov    QWORD PTR [r13+0x28],rax
     1338556:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
     1338559:	41 0f 11 45 18       	movups XMMWORD PTR [r13+0x18],xmm0
     133855e:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
     1338563:	0f 11 09             	movups XMMWORD PTR [rcx],xmm1
     1338566:	8a 84 24 b0 00 00 00 	mov    al,BYTE PTR [rsp+0xb0]
     133856d:	41 88 45 30          	mov    BYTE PTR [r13+0x30],al
     1338571:	49 83 c5 38          	add    r13,0x38
     1338575:	e9 ed 00 00 00       	jmp    1338667 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17dbeb>
     133857a:	4c 8b 44 24 10       	mov    r8,QWORD PTR [rsp+0x10]
     133857f:	4d 29 c5             	sub    r13,r8
     1338582:	4c 89 e8             	mov    rax,r13
     1338585:	48 99                	cqo
     1338587:	49 f7 fc             	idiv   r12
     133858a:	48 89 c1             	mov    rcx,rax
     133858d:	48 8d 70 01          	lea    rsi,[rax+0x1]
     1338591:	48 b8 92 24 49 92 24 	movabs rax,0x492492492492492
     1338598:	49 92 04 

### 0x1338623, FDE=(20152988, 20155013)
     13385fc:	0f 28 84 24 80 00 00 	movaps xmm0,XMMWORD PTR [rsp+0x80]
     1338603:	00 
     1338604:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     1338607:	0f 57 c9             	xorps  xmm1,xmm1
     133860a:	0f 29 8c 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm1
     1338611:	00 
     1338612:	48 83 a4 24 90 00 00 	and    QWORD PTR [rsp+0x90],0x0
     1338619:	00 00 
     133861b:	48 8d 94 24 98 00 00 	lea    rdx,[rsp+0x98]
     1338622:	00 
     1338623:	48 8b 4a 10          	mov    rcx,QWORD PTR [rdx+0x10]
     1338627:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
     133862b:	0f 10 02             	movups xmm0,XMMWORD PTR [rdx]
     133862e:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
     1338632:	0f 11 0a             	movups XMMWORD PTR [rdx],xmm1
     1338635:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
     133863a:	8a 8c 24 b0 00 00 00 	mov    cl,BYTE PTR [rsp+0xb0]
     1338641:	88 48 30             	mov    BYTE PTR [rax+0x30],cl
     1338644:	48 83 c0 38          	add    rax,0x38
     1338648:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     133864d:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1338652:	4c 89 ee             	mov    rsi,r13
     1338655:	e8 54 07 00 00       	call   1338dae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e332>
     133865a:	4c 89 ef             	mov    rdi,r13
     133865d:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
     1338662:	e8 2d 43 9d ff       	call   d0c994 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x259934>
     1338667:	4c 89 6c 24 18       	mov    QWORD PTR [rsp+0x18],r13
     133866c:	4c 89 ff             	mov    rdi,r15
     133866f:	e8 58 61 76 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>

### 0x13386a2, FDE=(20152988, 20155013)
     1338674:	49 83 c6 18          	add    r14,0x18
     1338678:	48 83 c5 e8          	add    rbp,0xffffffffffffffe8
     133867c:	0f 85 14 fe ff ff    	jne    1338496 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17da1a>
     1338682:	48 8b bb 30 01 00 00 	mov    rdi,QWORD PTR [rbx+0x130]
     1338689:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     133868c:	ff 90 90 00 00 00    	call   QWORD PTR [rax+0x90]
     1338692:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     1338699:	00 
     133869a:	48 89 c6             	mov    rsi,rax
     133869d:	e8 9e 58 4b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     13386a2:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     13386a7:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     13386ac:	48 8d 8c 24 80 00 00 	lea    rcx,[rsp+0x80]
     13386b3:	00 
     13386b4:	48 89 51 18          	mov    QWORD PTR [rcx+0x18],rdx
     13386b8:	48 29 d0             	sub    rax,rdx
     13386bb:	48 99                	cqo
     13386bd:	49 f7 fc             	idiv   r12
     13386c0:	48 89 41 20          	mov    QWORD PTR [rcx+0x20],rax
     13386c4:	c6 41 28 00          	mov    BYTE PTR [rcx+0x28],0x0
     13386c8:	48 8b b3 00 02 00 00 	mov    rsi,QWORD PTR [rbx+0x200]
     13386cf:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     13386d4:	48 89 ca             	mov    rdx,rcx
     13386d7:	e8 de 49 77 ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
     13386dc:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
     13386e0:	4c 8d b4 24 80 00 00 	lea    r14,[rsp+0x80]
     13386e7:	00 
     13386e8:	4c 89 f7             	mov    rdi,r14
     13386eb:	e8 a0 57 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### 0x1338fa3, FDE=(20156296, 20156342)
     1338f83:	e8 1d 0b 74 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1338f88:	53                   	push   rbx
     1338f89:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     1338f8c:	48 8b 3e             	mov    rdi,QWORD PTR [rsi]
     1338f8f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1338f92:	ff 50 68             	call   QWORD PTR [rax+0x68]
     1338f95:	48 8d 4b 08          	lea    rcx,[rbx+0x8]
     1338f99:	48 85 c0             	test   rax,rax
     1338f9c:	48 0f 44 cb          	cmove  rcx,rbx
     1338fa0:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     1338fa3:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
     1338fa7:	e8 8e a2 8d ff       	call   c1323a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1601da>
     1338fac:	5b                   	pop    rbx
     1338fad:	c3                   	ret
     1338fae:	48 89 c7             	mov    rdi,rax
     1338fb1:	e8 ef 0a 74 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1338fb6:	41 57                	push   r15
     1338fb8:	41 56                	push   r14
     1338fba:	41 54                	push   r12
     1338fbc:	53                   	push   rbx
     1338fbd:	50                   	push   rax
     1338fbe:	4c 8b 37             	mov    r14,QWORD PTR [rdi]
     1338fc1:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1338fc4:	83 78 08 00          	cmp    DWORD PTR [rax+0x8],0x0
     1338fc8:	7e 41                	jle    133900b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e58f>
     1338fca:	48 89 f3             	mov    rbx,rsi
     1338fcd:	45 31 ff             	xor    r15d,r15d
     1338fd0:	45 31 e4             	xor    r12d,r12d
     1338fd3:	48 8b 38             	mov    rdi,QWORD PTR [rax]

### 0x13399a9, FDE=(20158874, 20158936)
     133998f:	e8 3c 63 73 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1339994:	e8 17 61 4b 00       	call   17efab0 <__stack_chk_fail@plt>
     1339999:	cc                   	int3
     133999a:	80 7f 18 00          	cmp    BYTE PTR [rdi+0x18],0x0
     133999e:	74 01                	je     13399a1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ef25>
     13399a0:	c3                   	ret
     13399a1:	41 56                	push   r14
     13399a3:	53                   	push   rbx
     13399a4:	50                   	push   rax
     13399a5:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     13399a9:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
     13399ad:	48 8b 19             	mov    rbx,QWORD PTR [rcx]
     13399b0:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     13399b3:	4c 39 f3             	cmp    rbx,r14
     13399b6:	74 18                	je     13399d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ef54>
     13399b8:	48 83 c3 e8          	add    rbx,0xffffffffffffffe8
     13399bc:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     13399bf:	48 89 df             	mov    rdi,rbx
     13399c2:	ff 10                	call   QWORD PTR [rax]
     13399c4:	48 8d 43 e8          	lea    rax,[rbx-0x18]
     13399c8:	4c 39 f3             	cmp    rbx,r14
     13399cb:	48 89 c3             	mov    rbx,rax
     13399ce:	75 ec                	jne    13399bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ef40>
     13399d0:	48 83 c4 08          	add    rsp,0x8
     13399d4:	5b                   	pop    rbx
     13399d5:	41 5e                	pop    r14
     13399d7:	c3                   	ret
     13399d8:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0
     13399dc:	0f 84 a0 f1 ff ff    	je     1338b82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e106>

### 0x1339cde, FDE=(20159684, 20159733)
     1339cbf:	c3                   	ret
     1339cc0:	48 89 c8             	mov    rax,rcx
     1339cc3:	c3                   	ret
     1339cc4:	48 89 f8             	mov    rax,rdi
     1339cc7:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     1339ccb:	48 85 ff             	test   rdi,rdi
     1339cce:	74 1e                	je     1339cee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f272>
     1339cd0:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]
     1339cd4:	48 83 f9 ff          	cmp    rcx,0xffffffffffffffff
     1339cd8:	0f 84 d4 47 76 ff    	je     a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     1339cde:	48 8b 48 10          	mov    rcx,QWORD PTR [rax+0x10]
     1339ce2:	c6 01 00             	mov    BYTE PTR [rcx],0x0
     1339ce5:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
     1339ce9:	e9 c4 47 76 ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     1339cee:	31 ff                	xor    edi,edi
     1339cf0:	e9 bd 47 76 ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     1339cf5:	cc                   	int3
     1339cf6:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     1339cf9:	e9 00 00 00 00       	jmp    1339cfe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f282>
     1339cfe:	53                   	push   rbx
     1339cff:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     1339d02:	48 83 c7 08          	add    rdi,0x8
     1339d06:	e8 33 e6 82 ff       	call   b6833e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb52de>
     1339d0b:	84 c0                	test   al,al
     1339d0d:	75 08                	jne    1339d17 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f29b>
     1339d0f:	48 89 df             	mov    rdi,rbx
     1339d12:	e8 85 e5 ff ff       	call   133829c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d820>
     1339d17:	5b                   	pop    rbx
     1339d18:	c3                   	ret

### 0x1339db3, FDE=(20159910, 20159982)
     1339d9b:	5b                   	pop    rbx
     1339d9c:	c3                   	ret
     1339d9d:	48 89 c7             	mov    rdi,rax
     1339da0:	e8 00 fd 73 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1339da5:	cc                   	int3
     1339da6:	41 56                	push   r14
     1339da8:	53                   	push   rbx
     1339da9:	50                   	push   rax
     1339daa:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     1339dae:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     1339db3:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
     1339db7:	48 85 c0             	test   rax,rax
     1339dba:	74 22                	je     1339dde <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f362>
     1339dbc:	48 89 fb             	mov    rbx,rdi
     1339dbf:	49 89 f6             	mov    r14,rsi
     1339dc2:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
     1339dc6:	6a 01                	push   0x1
     1339dc8:	5f                   	pop    rdi
     1339dc9:	48 89 de             	mov    rsi,rbx
     1339dcc:	4c 89 f2             	mov    rdx,r14
     1339dcf:	ff d0                	call   rax
     1339dd1:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
     1339dd5:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     1339dd9:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     1339dde:	48 83 c4 08          	add    rsp,0x8
     1339de2:	5b                   	pop    rbx
     1339de3:	41 5e                	pop    r14
     1339de5:	c3                   	ret
     1339de6:	48 89 c7             	mov    rdi,rax

### 0x1339e06, FDE=(20159982, 20160191)
     1339de5:	c3                   	ret
     1339de6:	48 89 c7             	mov    rdi,rax
     1339de9:	e8 b7 fc 73 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1339dee:	41 56                	push   r14
     1339df0:	53                   	push   rbx
     1339df1:	48 83 ec 18          	sub    rsp,0x18
     1339df5:	48 89 f3             	mov    rbx,rsi
     1339df8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1339dff:	00 00 
     1339e01:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     1339e06:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
     1339e0a:	49 89 de             	mov    r14,rbx
     1339e0d:	48 89 fb             	mov    rbx,rdi
     1339e10:	48 85 c9             	test   rcx,rcx
     1339e13:	74 5c                	je     1339e71 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f3f5>
     1339e15:	48 89 c8             	mov    rax,rcx
     1339e18:	49 83 7e 10 00       	cmp    QWORD PTR [r14+0x10],0x0
     1339e1d:	b9 00 00 00 00       	mov    ecx,0x0
     1339e22:	4c 89 f7             	mov    rdi,r14
     1339e25:	74 e3                	je     1339e0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f38e>
     1339e27:	48 89 e6             	mov    rsi,rsp
     1339e2a:	48 83 26 00          	and    QWORD PTR [rsi],0x0
     1339e2e:	6a 01                	push   0x1
     1339e30:	5f                   	pop    rdi
     1339e31:	48 89 da             	mov    rdx,rbx
     1339e34:	ff d0                	call   rax
     1339e36:	6a 01                	push   0x1
     1339e38:	5f                   	pop    rdi
     1339e39:	48 89 de             	mov    rsi,rbx

### 0x1339e71, FDE=(20159982, 20160191)
     1339e4c:	ff 53 10             	call   QWORD PTR [rbx+0x10]
     1339e4f:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     1339e53:	49 8b 4e 10          	mov    rcx,QWORD PTR [r14+0x10]
     1339e57:	48 89 4b 10          	mov    QWORD PTR [rbx+0x10],rcx
     1339e5b:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     1339e5f:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]
     1339e63:	49 8b 4e 18          	mov    rcx,QWORD PTR [r14+0x18]
     1339e67:	48 89 4b 18          	mov    QWORD PTR [rbx+0x18],rcx
     1339e6b:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     1339e6f:	eb 29                	jmp    1339e9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f41e>
     1339e71:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     1339e75:	48 85 c0             	test   rax,rax
     1339e78:	74 20                	je     1339e9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f41e>
     1339e7a:	6a 01                	push   0x1
     1339e7c:	5f                   	pop    rdi
     1339e7d:	48 89 de             	mov    rsi,rbx
     1339e80:	4c 89 f2             	mov    rdx,r14
     1339e83:	ff d0                	call   rax
     1339e85:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     1339e89:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
     1339e8d:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
     1339e91:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     1339e95:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     1339e9a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1339ea1:	00 00 
     1339ea3:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     1339ea8:	75 08                	jne    1339eb2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f436>
     1339eaa:	48 83 c4 18          	add    rsp,0x18
     1339eae:	5b                   	pop    rbx

### 0x1339e85, FDE=(20159982, 20160191)
     1339e6b:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     1339e6f:	eb 29                	jmp    1339e9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f41e>
     1339e71:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     1339e75:	48 85 c0             	test   rax,rax
     1339e78:	74 20                	je     1339e9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f41e>
     1339e7a:	6a 01                	push   0x1
     1339e7c:	5f                   	pop    rdi
     1339e7d:	48 89 de             	mov    rsi,rbx
     1339e80:	4c 89 f2             	mov    rdx,r14
     1339e83:	ff d0                	call   rax
     1339e85:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     1339e89:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
     1339e8d:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
     1339e91:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     1339e95:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     1339e9a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1339ea1:	00 00 
     1339ea3:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     1339ea8:	75 08                	jne    1339eb2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f436>
     1339eaa:	48 83 c4 18          	add    rsp,0x18
     1339eae:	5b                   	pop    rbx
     1339eaf:	41 5e                	pop    r14
     1339eb1:	c3                   	ret
     1339eb2:	e8 f9 5b 4b 00       	call   17efab0 <__stack_chk_fail@plt>
     1339eb7:	48 89 c7             	mov    rdi,rax
     1339eba:	e8 e6 fb 73 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1339ebf:	cc                   	int3
     1339ec0:	53                   	push   rbx
     1339ec1:	48 89 fb             	mov    rbx,rdi

### 0x133aaff, FDE=(20163062, 20163781)
     133aad3:	ff b4 24 a8 00 00 00 	push   QWORD PTR [rsp+0xa8]
     133aada:	ff b4 24 b8 00 00 00 	push   QWORD PTR [rsp+0xb8]
     133aae1:	50                   	push   rax
     133aae2:	e8 a8 03 00 00       	call   133ae8f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180413>
     133aae7:	48 83 c4 20          	add    rsp,0x20
     133aaeb:	41 89 c7             	mov    r15d,eax
     133aaee:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     133aaf3:	e8 8c 16 ff ff       	call   132c184 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x171708>
     133aaf8:	eb 20                	jmp    133ab1a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18009e>
     133aafa:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     133aaff:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     133ab04:	4c 89 ea             	mov    rdx,r13
     133ab07:	48 89 c1             	mov    rcx,rax
     133ab0a:	4c 8b 84 24 a8 00 00 	mov    r8,QWORD PTR [rsp+0xa8]
     133ab11:	00 
     133ab12:	e8 eb 08 00 00       	call   133b402 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180986>
     133ab17:	41 89 c7             	mov    r15d,eax
     133ab1a:	44 88 3b             	mov    BYTE PTR [rbx],r15b
     133ab1d:	41 80 f7 01          	xor    r15b,0x1
     133ab21:	45 84 ff             	test   r15b,r15b
     133ab24:	0f 85 32 01 00 00    	jne    133ac5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1801e0>
     133ab2a:	80 bc 24 98 00 00 00 	cmp    BYTE PTR [rsp+0x98],0x0
     133ab31:	00 
     133ab32:	0f 84 24 01 00 00    	je     133ac5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1801e0>
     133ab38:	4d 85 e4             	test   r12,r12
     133ab3b:	0f 84 1b 01 00 00    	je     133ac5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1801e0>
     133ab41:	4c 89 6c 24 28       	mov    QWORD PTR [rsp+0x28],r13
     133ab46:	0f 57 c0             	xorps  xmm0,xmm0
     133ab49:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]

### 0x133ac1a, FDE=(20163062, 20163781)
     133abeb:	49 f7 fe             	idiv   r14
     133abee:	eb 05                	jmp    133abf5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180179>
     133abf0:	4c 8b 64 24 20       	mov    r12,QWORD PTR [rsp+0x20]
     133abf5:	0f 57 c0             	xorps  xmm0,xmm0
     133abf8:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0
     133abfe:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
     133ac04:	41 0f 11 44 24 10    	movups XMMWORD PTR [r12+0x10],xmm0
     133ac0a:	41 0f 11 04 24       	movups XMMWORD PTR [r12],xmm0
     133ac0f:	c6 83 a8 00 00 00 01 	mov    BYTE PTR [rbx+0xa8],0x1
     133ac16:	48 83 ec 08          	sub    rsp,0x8
     133ac1a:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     133ac1f:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     133ac24:	4c 89 fa             	mov    rdx,r15
     133ac27:	49 89 c0             	mov    r8,rax
     133ac2a:	44 8b 4c 24 24       	mov    r9d,DWORD PTR [rsp+0x24]
     133ac2f:	ff b4 24 b0 00 00 00 	push   QWORD PTR [rsp+0xb0]
     133ac36:	41 54                	push   r12
     133ac38:	ff b4 24 b8 00 00 00 	push   QWORD PTR [rsp+0xb8]
     133ac3f:	e8 81 00 00 00       	call   133acc5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180249>
     133ac44:	48 83 c4 20          	add    rsp,0x20
     133ac48:	80 3b 00             	cmp    BYTE PTR [rbx],0x0
     133ac4b:	0f 95 c1             	setne  cl
     133ac4e:	20 c8                	and    al,cl
     133ac50:	88 03                	mov    BYTE PTR [rbx],al
     133ac52:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     133ac57:	e8 66 b2 8e ff       	call   c25ec2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x172e62>
     133ac5c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     133ac63:	00 00 
     133ac65:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]

### 0x133b12e, FDE=(20164239, 20165634)
     133b106:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     133b10d:	00 
     133b10e:	4c 89 fe             	mov    rsi,r15
     133b111:	e8 7a f1 73 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     133b116:	48 8b 9c 24 90 01 00 	mov    rbx,QWORD PTR [rsp+0x190]
     133b11d:	00 
     133b11e:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     133b123:	0f 28 07             	movaps xmm0,XMMWORD PTR [rdi]
     133b126:	0f 29 84 24 f0 00 00 	movaps XMMWORD PTR [rsp+0xf0],xmm0
     133b12d:	00 
     133b12e:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     133b132:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
     133b139:	00 
     133b13a:	0f 57 c0             	xorps  xmm0,xmm0
     133b13d:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
     133b140:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     133b145:	e8 de 05 74 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     133b14a:	4d 85 f6             	test   r14,r14
     133b14d:	0f 84 0c 01 00 00    	je     133b25f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1807e3>
     133b153:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     133b158:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
     133b15f:	00 
     133b160:	e8 bf 07 00 00       	call   133b924 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180ea8>
     133b165:	4c 8d 74 24 70       	lea    r14,[rsp+0x70]
     133b16a:	48 8d b4 24 c0 00 00 	lea    rsi,[rsp+0xc0]
     133b171:	00 
     133b172:	4c 89 f7             	mov    rdi,r14
     133b175:	e8 5a 0f 00 00       	call   133c0d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x181658>
     133b17a:	48 83 a4 24 30 01 00 	and    QWORD PTR [rsp+0x130],0x0

### 0x133b905, FDE=(20166884, 20166947)
     133b8e6:	53                   	push   rbx
     133b8e7:	50                   	push   rax
     133b8e8:	48 89 fb             	mov    rbx,rdi
     133b8eb:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
     133b8ef:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
     133b8f3:	4c 39 f7             	cmp    rdi,r14
     133b8f6:	74 13                	je     133b90b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180e8f>
     133b8f8:	48 83 c7 e0          	add    rdi,0xffffffffffffffe0
     133b8fc:	48 89 7b 10          	mov    QWORD PTR [rbx+0x10],rdi
     133b900:	e8 11 08 ff ff       	call   132c116 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17169a>
     133b905:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     133b909:	eb e8                	jmp    133b8f3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180e77>
     133b90b:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     133b90e:	48 83 c4 08          	add    rsp,0x8
     133b912:	48 85 ff             	test   rdi,rdi
     133b915:	74 08                	je     133b91f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180ea3>
     133b917:	5b                   	pop    rbx
     133b918:	41 5e                	pop    r14
     133b91a:	e9 01 26 4b 00       	jmp    17edf20 <_ZdlPv@plt>
     133b91f:	5b                   	pop    rbx
     133b920:	41 5e                	pop    r14
     133b922:	c3                   	ret
     133b923:	cc                   	int3
     133b924:	41 56                	push   r14
     133b926:	53                   	push   rbx
     133b927:	50                   	push   rax
     133b928:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     133b92c:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     133b931:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]

### 0x133b931, FDE=(20166948, 20167020)
     133b91a:	e9 01 26 4b 00       	jmp    17edf20 <_ZdlPv@plt>
     133b91f:	5b                   	pop    rbx
     133b920:	41 5e                	pop    r14
     133b922:	c3                   	ret
     133b923:	cc                   	int3
     133b924:	41 56                	push   r14
     133b926:	53                   	push   rbx
     133b927:	50                   	push   rax
     133b928:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     133b92c:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     133b931:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
     133b935:	48 85 c0             	test   rax,rax
     133b938:	74 22                	je     133b95c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180ee0>
     133b93a:	48 89 fb             	mov    rbx,rdi
     133b93d:	49 89 f6             	mov    r14,rsi
     133b940:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
     133b944:	6a 01                	push   0x1
     133b946:	5f                   	pop    rdi
     133b947:	48 89 de             	mov    rsi,rbx
     133b94a:	4c 89 f2             	mov    rdx,r14
     133b94d:	ff d0                	call   rax
     133b94f:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
     133b953:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     133b957:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     133b95c:	48 83 c4 08          	add    rsp,0x8
     133b960:	5b                   	pop    rbx
     133b961:	41 5e                	pop    r14
     133b963:	c3                   	ret
     133b964:	48 89 c7             	mov    rdi,rax

### 0x133b9f2, FDE=(20167130, 20167339)
     133b9d3:	48 8b 02             	mov    rax,QWORD PTR [rdx]
     133b9d6:	48 89 06             	mov    QWORD PTR [rsi],rax
     133b9d9:	c3                   	ret
     133b9da:	41 56                	push   r14
     133b9dc:	53                   	push   rbx
     133b9dd:	48 83 ec 18          	sub    rsp,0x18
     133b9e1:	48 89 f3             	mov    rbx,rsi
     133b9e4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     133b9eb:	00 00 
     133b9ed:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     133b9f2:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
     133b9f6:	49 89 de             	mov    r14,rbx
     133b9f9:	48 89 fb             	mov    rbx,rdi
     133b9fc:	48 85 c9             	test   rcx,rcx
     133b9ff:	74 5c                	je     133ba5d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180fe1>
     133ba01:	48 89 c8             	mov    rax,rcx
     133ba04:	49 83 7e 10 00       	cmp    QWORD PTR [r14+0x10],0x0
     133ba09:	b9 00 00 00 00       	mov    ecx,0x0
     133ba0e:	4c 89 f7             	mov    rdi,r14
     133ba11:	74 e3                	je     133b9f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180f7a>
     133ba13:	48 89 e6             	mov    rsi,rsp
     133ba16:	48 83 26 00          	and    QWORD PTR [rsi],0x0
     133ba1a:	6a 01                	push   0x1
     133ba1c:	5f                   	pop    rdi
     133ba1d:	48 89 da             	mov    rdx,rbx
     133ba20:	ff d0                	call   rax
     133ba22:	6a 01                	push   0x1
     133ba24:	5f                   	pop    rdi
     133ba25:	48 89 de             	mov    rsi,rbx

### 0x133ba5d, FDE=(20167130, 20167339)
     133ba38:	ff 53 10             	call   QWORD PTR [rbx+0x10]
     133ba3b:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     133ba3f:	49 8b 4e 10          	mov    rcx,QWORD PTR [r14+0x10]
     133ba43:	48 89 4b 10          	mov    QWORD PTR [rbx+0x10],rcx
     133ba47:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     133ba4b:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]
     133ba4f:	49 8b 4e 18          	mov    rcx,QWORD PTR [r14+0x18]
     133ba53:	48 89 4b 18          	mov    QWORD PTR [rbx+0x18],rcx
     133ba57:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     133ba5b:	eb 29                	jmp    133ba86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18100a>
     133ba5d:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     133ba61:	48 85 c0             	test   rax,rax
     133ba64:	74 20                	je     133ba86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18100a>
     133ba66:	6a 01                	push   0x1
     133ba68:	5f                   	pop    rdi
     133ba69:	48 89 de             	mov    rsi,rbx
     133ba6c:	4c 89 f2             	mov    rdx,r14
     133ba6f:	ff d0                	call   rax
     133ba71:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     133ba75:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
     133ba79:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
     133ba7d:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     133ba81:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     133ba86:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     133ba8d:	00 00 
     133ba8f:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     133ba94:	75 08                	jne    133ba9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x181022>
     133ba96:	48 83 c4 18          	add    rsp,0x18
     133ba9a:	5b                   	pop    rbx

### 0x133ba71, FDE=(20167130, 20167339)
     133ba57:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     133ba5b:	eb 29                	jmp    133ba86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18100a>
     133ba5d:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     133ba61:	48 85 c0             	test   rax,rax
     133ba64:	74 20                	je     133ba86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18100a>
     133ba66:	6a 01                	push   0x1
     133ba68:	5f                   	pop    rdi
     133ba69:	48 89 de             	mov    rsi,rbx
     133ba6c:	4c 89 f2             	mov    rdx,r14
     133ba6f:	ff d0                	call   rax
     133ba71:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     133ba75:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
     133ba79:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
     133ba7d:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     133ba81:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     133ba86:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     133ba8d:	00 00 
     133ba8f:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     133ba94:	75 08                	jne    133ba9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x181022>
     133ba96:	48 83 c4 18          	add    rsp,0x18
     133ba9a:	5b                   	pop    rbx
     133ba9b:	41 5e                	pop    r14
     133ba9d:	c3                   	ret
     133ba9e:	e8 0d 40 4b 00       	call   17efab0 <__stack_chk_fail@plt>
     133baa3:	48 89 c7             	mov    rdi,rax
     133baa6:	e8 fa df 73 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     133baab:	cc                   	int3
     133baac:	55                   	push   rbp
     133baad:	41 57                	push   r15

### 0x133bee4, FDE=(20168388, 20168476)
     133bec6:	53                   	push   rbx
     133bec7:	50                   	push   rax
     133bec8:	48 89 fb             	mov    rbx,rdi
     133becb:	0f 57 c0             	xorps  xmm0,xmm0
     133bece:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
     133bed1:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     133bed6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     133bed9:	48 89 07             	mov    QWORD PTR [rdi],rax
     133bedc:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
     133bee0:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
     133bee4:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
     133bee8:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
     133beec:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     133bef1:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
     133bef4:	48 83 c7 20          	add    rdi,0x20
     133bef8:	48 83 c6 20          	add    rsi,0x20
     133befc:	e8 8f e3 73 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     133bf01:	48 83 c4 08          	add    rsp,0x8
     133bf05:	5b                   	pop    rbx
     133bf06:	41 5e                	pop    r14
     133bf08:	c3                   	ret
     133bf09:	49 89 c6             	mov    r14,rax
     133bf0c:	48 89 df             	mov    rdi,rbx
     133bf0f:	e8 04 04 c2 ff       	call   f5c318 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12372e>
     133bf14:	4c 89 f7             	mov    rdi,r14
     133bf17:	e8 b4 3d 73 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     133bf1c:	53                   	push   rbx
     133bf1d:	48 89 fb             	mov    rbx,rdi
     133bf20:	48 83 c7 20          	add    rdi,0x20

### 0x133c5f9, FDE=(20169990, 20170642)
     133c5d2:	75 92                	jne    133c566 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x181aea>
     133c5d4:	bf 28 01 00 00       	mov    edi,0x128
     133c5d9:	e8 22 19 4b 00       	call   17edf00 <_Znwm@plt>
     133c5de:	49 89 c6             	mov    r14,rax
     133c5e1:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     133c5e5:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     133c5e8:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     133c5ed:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     133c5f0:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
     133c5f4:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     133c5f9:	4c 8b 60 10          	mov    r12,QWORD PTR [rax+0x10]
     133c5fd:	4c 89 64 24 40       	mov    QWORD PTR [rsp+0x40],r12
     133c602:	0f 57 c0             	xorps  xmm0,xmm0
     133c605:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     133c608:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     133c60d:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     133c612:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     133c616:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
     133c619:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     133c61d:	48 85 c0             	test   rax,rax
     133c620:	74 05                	je     133c627 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x181bab>
     133c622:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     133c627:	41 83 66 10 00       	and    DWORD PTR [r14+0x10],0x0
     133c62c:	4d 8d 7e 18          	lea    r15,[r14+0x18]
     133c630:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     133c635:	4c 89 ff             	mov    rdi,r15
     133c638:	e8 c9 29 d3 ff       	call   106f006 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23641c>
     133c63d:	49 89 5e 40          	mov    QWORD PTR [r14+0x40],rbx
     133c641:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]

### 0x133cb51, FDE=(20171126, 20172593)
     133cb2f:	00 00 
     133cb31:	6a 18                	push   0x18
     133cb33:	5f                   	pop    rdi
     133cb34:	e8 c7 13 4b 00       	call   17edf00 <_Znwm@plt>
     133cb39:	49 89 c7             	mov    r15,rax
     133cb3c:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
     133cb41:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
     133cb46:	48 89 c7             	mov    rdi,rax
     133cb49:	4c 89 e6             	mov    rsi,r12
     133cb4c:	e8 67 b4 82 ff       	call   b67fb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4f58>
     133cb51:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
     133cb56:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     133cb5a:	4c 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r15
     133cb61:	00 
     133cb62:	48 8d 05 d1 b7 8e ff 	lea    rax,[rip+0xffffffffff8eb7d1]        # c2833a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1752da>
     133cb69:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     133cb70:	00 
     133cb71:	48 8d 05 a6 07 00 00 	lea    rax,[rip+0x7a6]        # 133d31e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1828a2>
     133cb78:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     133cb7f:	00 
     133cb80:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     133cb84:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     133cb87:	ff 50 50             	call   QWORD PTR [rax+0x50]
     133cb8a:	49 89 c7             	mov    r15,rax
     133cb8d:	48 89 c7             	mov    rdi,rax
     133cb90:	48 81 c7 d0 09 00 00 	add    rdi,0x9d0
     133cb97:	ff 90 e8 09 00 00    	call   QWORD PTR [rax+0x9e8]
     133cb9d:	49 69 8f 00 0a 00 00 	imul   rcx,QWORD PTR [r15+0xa00],0x3e8
     133cba4:	e8 03 00 00 

### 0x133d333, FDE=(20173598, 20173714)
     133d311:	48 89 df             	mov    rdi,rbx
     133d314:	e8 b7 29 73 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     133d319:	e8 92 27 4b 00       	call   17efab0 <__stack_chk_fail@plt>
     133d31e:	53                   	push   rbx
     133d31f:	48 83 ec 10          	sub    rsp,0x10
     133d323:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     133d326:	0f 10 02             	movups xmm0,XMMWORD PTR [rdx]
     133d329:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
     133d32d:	0f 57 c0             	xorps  xmm0,xmm0
     133d330:	0f 11 02             	movups XMMWORD PTR [rdx],xmm0
     133d333:	48 8b 5f 10          	mov    rbx,QWORD PTR [rdi+0x10]
     133d337:	e8 02 b0 82 ff       	call   b6833e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb52de>
     133d33c:	84 c0                	test   al,al
     133d33e:	75 34                	jne    133d374 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1828f8>
     133d340:	83 7b 78 03          	cmp    DWORD PTR [rbx+0x78],0x3
     133d344:	75 0e                	jne    133d354 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1828d8>
     133d346:	83 63 78 00          	and    DWORD PTR [rbx+0x78],0x0
     133d34a:	48 89 df             	mov    rdi,rbx
     133d34d:	e8 24 f6 ff ff       	call   133c976 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x181efa>
     133d352:	eb 20                	jmp    133d374 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1828f8>
     133d354:	48 89 df             	mov    rdi,rbx
     133d357:	e8 36 f4 ff ff       	call   133c792 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x181d16>
     133d35c:	83 63 78 00          	and    DWORD PTR [rbx+0x78],0x0
     133d360:	48 81 c3 90 00 00 00 	add    rbx,0x90
     133d367:	48 89 df             	mov    rdi,rbx
     133d36a:	be 00 01 00 00       	mov    esi,0x100
     133d36f:	e8 70 fe ff ff       	call   133d1e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x182768>
     133d374:	66 0f 6f 04 24       	movdqa xmm0,XMMWORD PTR [rsp]
     133d379:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1

### 0x133d699, FDE=(20174180, 20176212)
     133d675:	0f b7 58 28          	movzx  ebx,WORD PTR [rax+0x28]
     133d679:	83 f9 63             	cmp    ecx,0x63
     133d67c:	77 3c                	ja     133d6ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x182c3e>
     133d67e:	4c 89 ef             	mov    rdi,r13
     133d681:	e8 ba 08 4b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     133d686:	66 89 9c 24 b8 00 00 	mov    WORD PTR [rsp+0xb8],bx
     133d68d:	00 
     133d68e:	4c 89 ef             	mov    rdi,r13
     133d691:	e8 84 97 95 ff       	call   c96e1a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e3dba>
     133d696:	49 89 c6             	mov    r14,rax
     133d699:	4d 8b 6f 10          	mov    r13,QWORD PTR [r15+0x10]
     133d69d:	4d 85 ed             	test   r13,r13
     133d6a0:	0f 84 e0 00 00 00    	je     133d786 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x182d0a>
     133d6a6:	f3 4d 0f b8 fd       	popcnt r15,r13
     133d6ab:	49 83 ff 01          	cmp    r15,0x1
     133d6af:	77 56                	ja     133d707 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x182c8b>
     133d6b1:	49 8d 6d ff          	lea    rbp,[r13-0x1]
     133d6b5:	4c 21 f5             	and    rbp,r14
     133d6b8:	eb 60                	jmp    133d71a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x182c9e>
     133d6ba:	4c 89 ef             	mov    rdi,r13
     133d6bd:	e8 7e 08 4b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     133d6c2:	66 89 9c 24 b8 00 00 	mov    WORD PTR [rsp+0xb8],bx
     133d6c9:	00 
     133d6ca:	4c 89 e7             	mov    rdi,r12
     133d6cd:	4c 89 ee             	mov    rsi,r13
     133d6d0:	e8 81 96 95 ff       	call   c96d56 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e3cf6>
     133d6d5:	48 85 c0             	test   rax,rax
     133d6d8:	0f 84 82 05 00 00    	je     133dc60 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1831e4>
     133d6de:	48 89 c1             	mov    rcx,rax

### 0x133d6e8, FDE=(20174180, 20176212)
     133d6c2:	66 89 9c 24 b8 00 00 	mov    WORD PTR [rsp+0xb8],bx
     133d6c9:	00 
     133d6ca:	4c 89 e7             	mov    rdi,r12
     133d6cd:	4c 89 ee             	mov    rsi,r13
     133d6d0:	e8 81 96 95 ff       	call   c96d56 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e3cf6>
     133d6d5:	48 85 c0             	test   rax,rax
     133d6d8:	0f 84 82 05 00 00    	je     133dc60 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1831e4>
     133d6de:	48 89 c1             	mov    rcx,rax
     133d6e1:	4c 8b 00             	mov    r8,QWORD PTR [rax]
     133d6e4:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
     133d6e8:	4d 8b 4f 10          	mov    r9,QWORD PTR [r15+0x10]
     133d6ec:	f3 4d 0f b8 d9       	popcnt r11,r9
     133d6f1:	49 83 fb 01          	cmp    r11,0x1
     133d6f5:	0f 87 ac 01 00 00    	ja     133d8a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x182e2b>
     133d6fb:	49 8d 41 ff          	lea    rax,[r9-0x1]
     133d6ff:	48 21 c6             	and    rsi,rax
     133d702:	e9 b0 01 00 00       	jmp    133d8b7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x182e3b>
     133d707:	4c 89 f5             	mov    rbp,r14
     133d70a:	4d 39 ee             	cmp    r14,r13
     133d70d:	72 0b                	jb     133d71a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x182c9e>
     133d70f:	4c 89 f0             	mov    rax,r14
     133d712:	31 d2                	xor    edx,edx
     133d714:	49 f7 f5             	div    r13
     133d717:	48 89 d5             	mov    rbp,rdx
     133d71a:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     133d71e:	48 8b 04 e8          	mov    rax,QWORD PTR [rax+rbp*8]
     133d722:	48 85 c0             	test   rax,rax
     133d725:	74 5b                	je     133d782 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x182d06>
     133d727:	48 8b 18             	mov    rbx,QWORD PTR [rax]

### 0x133d903, FDE=(20174180, 20176212)
     133d8dd:	0f 87 b5 00 00 00    	ja     133d998 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x182f1c>
     133d8e3:	49 8d 51 ff          	lea    rdx,[r9-0x1]
     133d8e7:	48 21 d0             	and    rax,rdx
     133d8ea:	e9 b6 00 00 00       	jmp    133d9a5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x182f29>
     133d8ef:	48 8d 43 ff          	lea    rax,[rbx-0x1]
     133d8f3:	48 85 c3             	test   rbx,rax
     133d8f6:	74 0f                	je     133d907 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x182e8b>
     133d8f8:	48 89 df             	mov    rdi,rbx
     133d8fb:	e8 e0 06 4b 00       	call   17edfe0 <_ZNSt6__ndk112__next_primeEm@plt>
     133d900:	48 89 c3             	mov    rbx,rax
     133d903:	4d 8b 6f 10          	mov    r13,QWORD PTR [r15+0x10]
     133d907:	4c 39 eb             	cmp    rbx,r13
     133d90a:	76 6f                	jbe    133d97b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x182eff>
     133d90c:	48 89 dd             	mov    rbp,rbx
     133d90f:	48 89 e8             	mov    rax,rbp
     133d912:	48 c1 e8 3d          	shr    rax,0x3d
     133d916:	0f 85 e8 03 00 00    	jne    133dd04 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183288>
     133d91c:	48 8d 3c ed 00 00 00 	lea    rdi,[rbp*8+0x0]
     133d923:	00 
     133d924:	e8 d7 05 4b 00       	call   17edf00 <_Znwm@plt>
     133d929:	4c 89 e7             	mov    rdi,r12
     133d92c:	48 89 c6             	mov    rsi,rax
     133d92f:	e8 62 1e 76 ff       	call   a9f796 <JNI_OnUnload@@Base+0x27063>
     133d934:	49 89 6f 10          	mov    QWORD PTR [r15+0x10],rbp
     133d938:	31 c0                	xor    eax,eax
     133d93a:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
     133d93e:	48 83 24 c1 00       	and    QWORD PTR [rcx+rax*8],0x0
     133d943:	48 ff c0             	inc    rax
     133d946:	48 39 c5             	cmp    rbp,rax

### 0x133daef, FDE=(20174180, 20176212)
     133dacf:	48 89 c8             	mov    rax,rcx
     133dad2:	4c 89 c7             	mov    rdi,r8
     133dad5:	4d 8b 00             	mov    r8,QWORD PTR [r8]
     133dad8:	48 89 c1             	mov    rcx,rax
     133dadb:	4d 85 c0             	test   r8,r8
     133dade:	75 a2                	jne    133da82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183006>
     133dae0:	e9 b3 00 00 00       	jmp    133db98 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18311c>
     133dae5:	48 89 3c c2          	mov    QWORD PTR [rdx+rax*8],rdi
     133dae9:	eb e7                	jmp    133dad2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183056>
     133daeb:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
     133daef:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
     133daf4:	41 be 0c fe ff ff    	mov    r14d,0xfffffe0c
     133dafa:	e9 50 01 00 00       	jmp    133dc4f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1831d3>
     133daff:	48 89 c1             	mov    rcx,rax
     133db02:	48 d1 e9             	shr    rcx,1
     133db05:	83 e0 01             	and    eax,0x1
     133db08:	48 09 c8             	or     rax,rcx
     133db0b:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     133db10:	f3 0f 58 c0          	addss  xmm0,xmm0
     133db14:	f3 41 0f 5e 47 28    	divss  xmm0,DWORD PTR [r15+0x28]
     133db1a:	66 0f 3a 0a c0 0a    	roundss xmm0,xmm0,0xa
     133db20:	f3 48 0f 2c c0       	cvttss2si rax,xmm0
     133db25:	48 89 c1             	mov    rcx,rax
     133db28:	f3 0f 5c 05 ec 0c 05 	subss  xmm0,DWORD PTR [rip+0xffffffffff050cec]        # 38e81c <_ZTSSt12bad_any_cast@@Base-0x19ac>
     133db2f:	ff 
     133db30:	f3 48 0f 2c f8       	cvttss2si rdi,xmm0
     133db35:	48 c1 f9 3f          	sar    rcx,0x3f
     133db39:	48 21 cf             	and    rdi,rcx
     133db3c:	48 09 c7             	or     rdi,rax

### 0x133db98, FDE=(20174180, 20176212)
     133db74:	48 39 eb             	cmp    rbx,rbp
     133db77:	48 0f 47 eb          	cmova  rbp,rbx
     133db7b:	4c 39 ed             	cmp    rbp,r13
     133db7e:	73 18                	jae    133db98 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18311c>
     133db80:	48 85 ed             	test   rbp,rbp
     133db83:	0f 85 86 fd ff ff    	jne    133d90f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x182e93>
     133db89:	4c 89 e7             	mov    rdi,r12
     133db8c:	31 f6                	xor    esi,esi
     133db8e:	e8 03 1c 76 ff       	call   a9f796 <JNI_OnUnload@@Base+0x27063>
     133db93:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     133db98:	4d 8b 6f 10          	mov    r13,QWORD PTR [r15+0x10]
     133db9c:	49 8d 45 ff          	lea    rax,[r13-0x1]
     133dba0:	49 85 c5             	test   r13,rax
     133dba3:	75 61                	jne    133dc06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18318a>
     133dba5:	49 21 c6             	and    r14,rax
     133dba8:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
     133dbad:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     133dbb1:	4a 8b 04 f0          	mov    rax,QWORD PTR [rax+r14*8]
     133dbb5:	48 8b 9c 24 c8 00 00 	mov    rbx,QWORD PTR [rsp+0xc8]
     133dbbc:	00 
     133dbbd:	48 85 c0             	test   rax,rax
     133dbc0:	74 0e                	je     133dbd0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183154>
     133dbc2:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     133dbc5:	48 89 0b             	mov    QWORD PTR [rbx],rcx
     133dbc8:	41 be 0c fe ff ff    	mov    r14d,0xfffffe0c
     133dbce:	eb 62                	jmp    133dc32 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1831b6>
     133dbd0:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     133dbd5:	48 8b 01             	mov    rax,QWORD PTR [rcx]
     133dbd8:	48 89 03             	mov    QWORD PTR [rbx],rax

### 0x133dc09, FDE=(20174180, 20176212)
     133dbe9:	48 85 c0             	test   rax,rax
     133dbec:	41 be 0c fe ff ff    	mov    r14d,0xfffffe0c
     133dbf2:	74 41                	je     133dc35 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1831b9>
     133dbf4:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     133dbf8:	49 8d 4d ff          	lea    rcx,[r13-0x1]
     133dbfc:	49 85 cd             	test   r13,rcx
     133dbff:	75 1c                	jne    133dc1d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1831a1>
     133dc01:	48 21 c8             	and    rax,rcx
     133dc04:	eb 24                	jmp    133dc2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1831ae>
     133dc06:	4d 39 ee             	cmp    r14,r13
     133dc09:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
     133dc0e:	72 9d                	jb     133dbad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183131>
     133dc10:	4c 89 f0             	mov    rax,r14
     133dc13:	31 d2                	xor    edx,edx
     133dc15:	49 f7 f5             	div    r13
     133dc18:	49 89 d6             	mov    r14,rdx
     133dc1b:	eb 90                	jmp    133dbad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183131>
     133dc1d:	4c 39 e8             	cmp    rax,r13
     133dc20:	72 08                	jb     133dc2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1831ae>
     133dc22:	31 d2                	xor    edx,edx
     133dc24:	49 f7 f5             	div    r13
     133dc27:	48 89 d0             	mov    rax,rdx
     133dc2a:	48 c1 e0 03          	shl    rax,0x3
     133dc2e:	49 03 04 24          	add    rax,QWORD PTR [r12]
     133dc32:	48 89 18             	mov    QWORD PTR [rax],rbx
     133dc35:	48 83 a4 24 c8 00 00 	and    QWORD PTR [rsp+0xc8],0x0
     133dc3c:	00 00 
     133dc3e:	49 ff 47 20          	inc    QWORD PTR [r15+0x20]
     133dc42:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]

### 0x133debc, FDE=(20176212, 20177902)
     133de95:	48 8d 05 7e 06 00 00 	lea    rax,[rip+0x67e]        # 133e51a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183a9e>
     133de9c:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
     133dea0:	49 8b 06             	mov    rax,QWORD PTR [r14]
     133dea3:	4c 89 f7             	mov    rdi,r14
     133dea6:	ff 50 10             	call   QWORD PTR [rax+0x10]
     133dea9:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     133deae:	e8 eb 21 a9 ff       	call   dd009e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d124>
     133deb3:	48 89 e7             	mov    rdi,rsp
     133deb6:	0f 28 07             	movaps xmm0,XMMWORD PTR [rdi]
     133deb9:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     133debc:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     133dec0:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
     133dec4:	0f 57 c0             	xorps  xmm0,xmm0
     133dec7:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
     133deca:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     133decf:	c7 43 18 02 00 00 00 	mov    DWORD PTR [rbx+0x18],0x2
     133ded6:	e9 a8 03 00 00       	jmp    133e283 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183807>
     133dedb:	49 8b 06             	mov    rax,QWORD PTR [r14]
     133dede:	4c 89 f7             	mov    rdi,r14
     133dee1:	ff 50 40             	call   QWORD PTR [rax+0x40]
     133dee4:	83 78 38 09          	cmp    DWORD PTR [rax+0x38],0x9
     133dee8:	e9 b0 00 00 00       	jmp    133df9d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183521>
     133deed:	48 89 e0             	mov    rax,rsp
     133def0:	c6 00 00             	mov    BYTE PTR [rax],0x0
     133def3:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
     133def8:	48 89 06             	mov    QWORD PTR [rsi],rax
     133defb:	48 8d 05 62 e5 73 ff 	lea    rax,[rip+0xffffffffff73e562]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     133df02:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
     133df06:	48 8d 05 17 05 00 00 	lea    rax,[rip+0x517]        # 133e424 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1839a8>

### 0x133e0c8, FDE=(20176212, 20177902)
     133e098:	48 89 06             	mov    QWORD PTR [rsi],rax
     133e09b:	48 8d 05 c2 e3 73 ff 	lea    rax,[rip+0xffffffffff73e3c2]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     133e0a2:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
     133e0a6:	48 8d 05 41 03 00 00 	lea    rax,[rip+0x341]        # 133e3ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183972>
     133e0ad:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
     133e0b1:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     133e0b6:	e8 17 d5 fd ff       	call   131b5d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x160b56>
     133e0bb:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     133e0c0:	e8 c9 3f ab ff       	call   df208e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf114>
     133e0c5:	48 89 e7             	mov    rdi,rsp
     133e0c8:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     133e0cc:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
     133e0d0:	0f 28 07             	movaps xmm0,XMMWORD PTR [rdi]
     133e0d3:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     133e0d6:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     133e0db:	0f 57 c0             	xorps  xmm0,xmm0
     133e0de:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
     133e0e1:	83 63 18 00          	and    DWORD PTR [rbx+0x18],0x0
     133e0e5:	e9 43 02 00 00       	jmp    133e32d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1838b1>
     133e0ea:	48 89 e0             	mov    rax,rsp
     133e0ed:	48 83 20 00          	and    QWORD PTR [rax],0x0
     133e0f1:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
     133e0f6:	48 89 06             	mov    QWORD PTR [rsi],rax
     133e0f9:	48 8d 05 64 e3 73 ff 	lea    rax,[rip+0xffffffffff73e364]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     133e100:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
     133e104:	48 8d 05 f7 02 00 00 	lea    rax,[rip+0x2f7]        # 133e402 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183986>
     133e10b:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
     133e10f:	49 8b 06             	mov    rax,QWORD PTR [r14]
     133e112:	4c 89 f7             	mov    rdi,r14

### 0x133e137, FDE=(20176212, 20177902)
     133e115:	ff 50 18             	call   QWORD PTR [rax+0x18]
     133e118:	e9 b0 00 00 00       	jmp    133e1cd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183751>
     133e11d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     133e120:	ff 50 78             	call   QWORD PTR [rax+0x78]
     133e123:	49 8b 0e             	mov    rcx,QWORD PTR [r14]
     133e126:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
     133e12b:	4c 89 ff             	mov    rdi,r15
     133e12e:	4c 89 f6             	mov    rsi,r14
     133e131:	48 89 c2             	mov    rdx,rax
     133e134:	ff 51 70             	call   QWORD PTR [rcx+0x70]
     133e137:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     133e13b:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
     133e13f:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
     133e143:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     133e146:	0f 57 c0             	xorps  xmm0,xmm0
     133e149:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     133e14e:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
     133e152:	83 63 18 00          	and    DWORD PTR [rbx+0x18],0x0
     133e156:	4c 89 ff             	mov    rdi,r15
     133e159:	e9 cf 01 00 00       	jmp    133e32d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1838b1>
     133e15e:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     133e163:	e8 de db fd ff       	call   131bd46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1612ca>
     133e168:	e9 a3 01 00 00       	jmp    133e310 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183894>
     133e16d:	48 8b b4 24 c0 00 00 	mov    rsi,QWORD PTR [rsp+0xc0]
     133e174:	00 
     133e175:	48 8b 8c 24 b8 00 00 	mov    rcx,QWORD PTR [rsp+0xb8]
     133e17c:	00 
     133e17d:	48 8b 94 24 b0 00 00 	mov    rdx,QWORD PTR [rsp+0xb0]
     133e184:	00 

### 0x133e265, FDE=(20176212, 20177902)
     133e239:	48 89 03             	mov    QWORD PTR [rbx],rax
     133e23c:	48 89 53 08          	mov    QWORD PTR [rbx+0x8],rdx
     133e240:	c7 43 18 01 00 00 00 	mov    DWORD PTR [rbx+0x18],0x1
     133e247:	e9 dc 00 00 00       	jmp    133e328 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1838ac>
     133e24c:	4c 8d 74 24 40       	lea    r14,[rsp+0x40]
     133e251:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     133e256:	4c 89 f7             	mov    rdi,r14
     133e259:	e8 16 d7 fd ff       	call   131b974 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x160ef8>
     133e25e:	41 0f 28 06          	movaps xmm0,XMMWORD PTR [r14]
     133e262:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     133e265:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     133e269:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
     133e26d:	0f 57 c0             	xorps  xmm0,xmm0
     133e270:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
     133e274:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     133e279:	c7 43 18 02 00 00 00 	mov    DWORD PTR [rbx+0x18],0x2
     133e280:	4c 89 f7             	mov    rdi,r14
     133e283:	e8 a0 d4 73 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     133e288:	e9 a5 00 00 00       	jmp    133e332 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1838b6>
     133e28d:	49 8b 06             	mov    rax,QWORD PTR [r14]
     133e290:	4c 89 f7             	mov    rdi,r14
     133e293:	ff 50 60             	call   QWORD PTR [rax+0x60]
     133e296:	48 89 c7             	mov    rdi,rax
     133e299:	e8 98 d5 73 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     133e29e:	48 89 03             	mov    QWORD PTR [rbx],rax
     133e2a1:	48 89 53 08          	mov    QWORD PTR [rbx+0x8],rdx
     133e2a5:	c7 43 18 01 00 00 00 	mov    DWORD PTR [rbx+0x18],0x1
     133e2ac:	e9 81 00 00 00       	jmp    133e332 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1838b6>
     133e2b1:	c6 03 00             	mov    BYTE PTR [rbx],0x0

### 0x133e5cb, FDE=(20178348, 20178521)
     133e5ab:	cc                   	int3
     133e5ac:	41 56                	push   r14
     133e5ae:	53                   	push   rbx
     133e5af:	48 83 ec 38          	sub    rsp,0x38
     133e5b3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     133e5ba:	00 00 
     133e5bc:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     133e5c1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     133e5c4:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     133e5c7:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
     133e5cb:	4c 8b 70 10          	mov    r14,QWORD PTR [rax+0x10]
     133e5cf:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
     133e5d5:	48 89 f3             	mov    rbx,rsi
     133e5d8:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
     133e5de:	6a 18                	push   0x18
     133e5e0:	5f                   	pop    rdi
     133e5e1:	e8 1a f9 4a 00       	call   17edf00 <_Znwm@plt>
     133e5e6:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
     133e5ea:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
     133e5ed:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
     133e5f1:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     133e5f6:	48 89 06             	mov    QWORD PTR [rsi],rax
     133e5f9:	48 8d 05 0e 3d 82 ff 	lea    rax,[rip+0xffffffffff823d0e]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
     133e600:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
     133e604:	48 8d 05 5b 01 00 00 	lea    rax,[rip+0x15b]        # 133e766 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183cea>
     133e60b:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
     133e60f:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     133e612:	48 89 df             	mov    rdi,rbx
     133e615:	ff 50 48             	call   QWORD PTR [rax+0x48]

### 0x133e792, FDE=(20178790, 20178913)
     133e769:	48 83 ec 68          	sub    rsp,0x68
     133e76d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     133e774:	00 00 
     133e776:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     133e77b:	4c 8b 37             	mov    r14,QWORD PTR [rdi]
     133e77e:	49 8b 5e 08          	mov    rbx,QWORD PTR [r14+0x8]
     133e782:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
     133e786:	48 83 c6 10          	add    rsi,0x10
     133e78a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     133e78f:	ff 50 10             	call   QWORD PTR [rax+0x10]
     133e792:	49 8b 56 10          	mov    rdx,QWORD PTR [r14+0x10]
     133e796:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     133e799:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     133e79e:	48 89 df             	mov    rdi,rbx
     133e7a1:	ff 50 50             	call   QWORD PTR [rax+0x50]
     133e7a4:	49 8b 0e             	mov    rcx,QWORD PTR [r14]
     133e7a7:	88 01                	mov    BYTE PTR [rcx],al
     133e7a9:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     133e7ae:	e8 7b 6b 38 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     133e7b3:	49 8b 06             	mov    rax,QWORD PTR [r14]
     133e7b6:	80 38 00             	cmp    BYTE PTR [rax],0x0
     133e7b9:	0f 94 c0             	sete   al
     133e7bc:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     133e7c3:	00 00 
     133e7c5:	48 3b 4c 24 60       	cmp    rcx,QWORD PTR [rsp+0x60]
     133e7ca:	75 08                	jne    133e7d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183d58>
     133e7cc:	48 83 c4 68          	add    rsp,0x68
     133e7d0:	5b                   	pop    rbx
     133e7d1:	41 5e                	pop    r14

### 0x133e889, FDE=(20178914, 20179105)
     133e856:	48 8b bb c8 03 00 00 	mov    rdi,QWORD PTR [rbx+0x3c8]
     133e85d:	e8 24 fc 75 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     133e862:	48 8d bb 98 00 00 00 	lea    rdi,[rbx+0x98]
     133e869:	e8 d6 00 00 00       	call   133e944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183ec8>
     133e86e:	48 8d 7b 68          	lea    rdi,[rbx+0x68]
     133e872:	e8 b1 05 d4 ff       	call   107ee28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24623e>
     133e877:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     133e87b:	e8 8c 4b 8d ff       	call   c1340c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1603ac>
     133e880:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
     133e884:	e8 fd fb 75 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     133e889:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     133e88d:	48 83 c4 08          	add    rsp,0x8
     133e891:	5b                   	pop    rbx
     133e892:	41 5e                	pop    r14
     133e894:	e9 19 fc 75 ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     133e899:	48 89 c7             	mov    rdi,rax
     133e89c:	e8 04 b2 73 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     133e8a1:	cc                   	int3
     133e8a2:	41 56                	push   r14
     133e8a4:	53                   	push   rbx
     133e8a5:	48 83 ec 18          	sub    rsp,0x18
     133e8a9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     133e8b0:	00 00 
     133e8b2:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     133e8b7:	80 bf 78 04 00 00 00 	cmp    BYTE PTR [rdi+0x478],0x0
     133e8be:	74 42                	je     133e902 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183e86>
     133e8c0:	48 89 fb             	mov    rbx,rdi
     133e8c3:	c6 87 78 04 00 00 00 	mov    BYTE PTR [rdi+0x478],0x0
     133e8ca:	48 8d b7 50 04 00 00 	lea    rsi,[rdi+0x450]

### 0x133f626, FDE=(20182332, 20182685)
     133f5ff:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     133f602:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     133f607:	48 89 de             	mov    rsi,rbx
     133f60a:	31 d2                	xor    edx,edx
     133f60c:	ff 50 10             	call   QWORD PTR [rax+0x10]
     133f60f:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     133f614:	4c 89 f7             	mov    rdi,r14
     133f617:	e8 48 47 8d ff       	call   c13d64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x160d04>
     133f61c:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     133f621:	e8 08 5d 38 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     133f626:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     133f62a:	44 20 20             	and    BYTE PTR [rax],r12b
     133f62d:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     133f632:	e8 59 e8 4a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     133f637:	eb 32                	jmp    133f66b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184bef>
     133f639:	4d 8b 77 08          	mov    r14,QWORD PTR [r15+0x8]
     133f63d:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     133f640:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     133f645:	48 89 de             	mov    rsi,rbx
     133f648:	31 d2                	xor    edx,edx
     133f64a:	ff 50 10             	call   QWORD PTR [rax+0x10]
     133f64d:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     133f652:	4c 89 f7             	mov    rdi,r14
     133f655:	e8 0a 47 8d ff       	call   c13d64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x160d04>
     133f65a:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     133f65f:	e8 ca 5c 38 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     133f664:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     133f668:	c6 00 00             	mov    BYTE PTR [rax],0x0
     133f66b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### 0x133f664, FDE=(20182332, 20182685)
     133f63d:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     133f640:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     133f645:	48 89 de             	mov    rsi,rbx
     133f648:	31 d2                	xor    edx,edx
     133f64a:	ff 50 10             	call   QWORD PTR [rax+0x10]
     133f64d:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     133f652:	4c 89 f7             	mov    rdi,r14
     133f655:	e8 0a 47 8d ff       	call   c13d64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x160d04>
     133f65a:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     133f65f:	e8 ca 5c 38 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     133f664:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     133f668:	c6 00 00             	mov    BYTE PTR [rax],0x0
     133f66b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     133f672:	00 00 
     133f674:	48 3b 84 24 a8 00 00 	cmp    rax,QWORD PTR [rsp+0xa8]
     133f67b:	00 
     133f67c:	75 12                	jne    133f690 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184c14>
     133f67e:	b0 01                	mov    al,0x1
     133f680:	48 81 c4 b0 00 00 00 	add    rsp,0xb0
     133f687:	5b                   	pop    rbx
     133f688:	41 5c                	pop    r12
     133f68a:	41 5e                	pop    r14
     133f68c:	41 5f                	pop    r15
     133f68e:	5d                   	pop    rbp
     133f68f:	c3                   	ret
     133f690:	e8 1b 04 4b 00       	call   17efab0 <__stack_chk_fail@plt>
     133f695:	48 89 c7             	mov    rdi,rax
     133f698:	e8 08 a4 73 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     133f69d:	cc                   	int3

### 0x133f74c, FDE=(20182686, 20182919)
     133f725:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     133f728:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     133f72d:	48 89 de             	mov    rsi,rbx
     133f730:	31 d2                	xor    edx,edx
     133f732:	ff 50 10             	call   QWORD PTR [rax+0x10]
     133f735:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     133f73a:	4c 89 f7             	mov    rdi,r14
     133f73d:	e8 22 46 8d ff       	call   c13d64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x160d04>
     133f742:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     133f747:	e8 e2 5b 38 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     133f74c:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     133f750:	c6 00 00             	mov    BYTE PTR [rax],0x0
     133f753:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     133f758:	e8 29 ed 75 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     133f75d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     133f764:	00 00 
     133f766:	48 3b 44 24 70       	cmp    rax,QWORD PTR [rsp+0x70]
     133f76b:	75 0d                	jne    133f77a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184cfe>
     133f76d:	b0 01                	mov    al,0x1
     133f76f:	48 83 c4 78          	add    rsp,0x78
     133f773:	5b                   	pop    rbx
     133f774:	41 5e                	pop    r14
     133f776:	41 5f                	pop    r15
     133f778:	5d                   	pop    rbp
     133f779:	c3                   	ret
     133f77a:	e8 31 03 4b 00       	call   17efab0 <__stack_chk_fail@plt>
     133f77f:	48 89 c7             	mov    rdi,rax
     133f782:	e8 1e a3 73 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     133f787:	cc                   	int3

