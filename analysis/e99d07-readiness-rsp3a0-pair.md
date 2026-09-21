# e99d07 readiness caller rsp+0x3a0/+0x3a8 pair

Proven ABI mapping:
- e99d07 callee [rsp+0x1338] is incoming caller stack arg +0xf8
- caller 0xe95c3f pushes from its current [rsp+0x2a8]
- normalized to the caller stable frame, this is stable [rsp+0x3a8]
- therefore stable pair [rsp+0x3a0,+0x3a8] is the high-value producer target
- caller FDE=(15281964, 15306555)

## Every direct reference to stable rsp+0x398..0x3b0 before push sequence
### READ 0xe930e5: mov    rax,QWORD PTR [rsp+0x398]
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
      e93163:	4c 89 e2             	mov    rdx,r12

### READ 0xe93456: mov    rax,QWORD PTR [rsp+0x398]
      e9340e:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e93412:	66 0f 7f 8c 24 90 00 	movdqa XMMWORD PTR [rsp+0x90],xmm1
      e93419:	00 00 
      e9341b:	66 0f 7f 8c 24 80 03 	movdqa XMMWORD PTR [rsp+0x380],xmm1
      e93422:	00 00 
      e93424:	31 db                	xor    ebx,ebx
      e93426:	31 ff                	xor    edi,edi
      e93428:	e8 59 b0 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9342d:	31 ff                	xor    edi,edi
      e9342f:	e8 52 b0 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e93434:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e9343b:	00 
      e9343c:	e8 73 62 00 00       	call   e996b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60aca>
      e93441:	48 8d bc 24 20 0f 00 	lea    rdi,[rsp+0xf20]
      e93448:	00 
      e93449:	e8 1c 6b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9344e:	4c 8b b4 24 90 03 00 	mov    r14,QWORD PTR [rsp+0x390]
      e93455:	00 
      e93456:	48 8b 84 24 98 03 00 	mov    rax,QWORD PTR [rsp+0x398]
      e9345d:	00 
      e9345e:	48 85 c0             	test   rax,rax
      e93461:	74 0d                	je     e93470 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a886>
      e93463:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
      e93468:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
      e9346d:	48 89 c3             	mov    rbx,rax
      e93470:	66 0f ef c0          	pxor   xmm0,xmm0
      e93474:	48 83 a4 24 20 0e 00 	and    QWORD PTR [rsp+0xe20],0x0
      e9347b:	00 00 
      e9347d:	66 0f 7f 84 24 10 0e 	movdqa XMMWORD PTR [rsp+0xe10],xmm0
      e93484:	00 00 
      e93486:	4c 8d 84 24 30 0a 00 	lea    r8,[rsp+0xa30]
      e9348d:	00 
      e9348e:	4d 89 30             	mov    QWORD PTR [r8],r14
      e93491:	49 89 40 08          	mov    QWORD PTR [r8+0x8],rax
      e93495:	66 0f 6f 84 24 90 00 	movdqa xmm0,XMMWORD PTR [rsp+0x90]
      e9349c:	00 00 
      e9349e:	f3 41 0f 7f 40 10    	movdqu XMMWORD PTR [r8+0x10],xmm0
      e934a4:	f0 49 ff 45 00       	lock inc QWORD PTR [r13+0x0]
      e934a9:	48 8d 35 a2 6b f6 ff 	lea    rsi,[rip+0xfffffffffff66ba2]        # dfa052 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc70d8>
      e934b0:	48 8d 15 cf 6b f6 ff 	lea    rdx,[rip+0xfffffffffff66bcf]        # dfa086 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc710c>
      e934b7:	48 8d 0d 2c 62 00 00 	lea    rcx,[rip+0x622c]        # e996ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60b00>
      e934be:	4c 8d bc 24 e0 0b 00 	lea    r15,[rsp+0xbe0]
      e934c5:	00 
      e934c6:	6a 20                	push   0x20
      e934c8:	41 59                	pop    r9
      e934ca:	4c 89 ff             	mov    rdi,r15
      e934cd:	e8 c2 72 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e934d2:	49 8b 06             	mov    rax,QWORD PTR [r14]
      e934d5:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e934dc:	00 
      e934dd:	4c 89 f6             	mov    rsi,r14

### READ 0xe95099: mov    rax,QWORD PTR [rsp+0x398]
      e95050:	e8 31 94 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95055:	31 ff                	xor    edi,edi
      e95057:	e8 2a 94 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9505c:	4c 89 ff             	mov    rdi,r15
      e9505f:	e8 22 94 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95064:	31 ff                	xor    edi,edi
      e95066:	e8 1b 94 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9506b:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e95072:	00 
      e95073:	e8 a6 4b 00 00       	call   e99c1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61034>
      e95078:	48 8d bc 24 90 0e 00 	lea    rdi,[rsp+0xe90]
      e9507f:	00 
      e95080:	e8 e5 4e be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e95085:	0f 57 c0             	xorps  xmm0,xmm0
      e95088:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
      e9508c:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
      e95091:	4c 8b b4 24 90 03 00 	mov    r14,QWORD PTR [rsp+0x390]
      e95098:	00 
      e95099:	48 8b 84 24 98 03 00 	mov    rax,QWORD PTR [rsp+0x398]
      e950a0:	00 
      e950a1:	4c 89 33             	mov    QWORD PTR [rbx],r14
      e950a4:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
      e950a8:	48 85 c0             	test   rax,rax
      e950ab:	74 05                	je     e950b2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c4c8>
      e950ad:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
      e950b2:	4c 8d 84 24 30 0a 00 	lea    r8,[rsp+0xa30]
      e950b9:	00 
      e950ba:	66 0f 6f 44 24 70    	movdqa xmm0,XMMWORD PTR [rsp+0x70]
      e950c0:	f3 41 0f 7f 40 10    	movdqu XMMWORD PTR [r8+0x10],xmm0
      e950c6:	f0 48 ff 45 00       	lock inc QWORD PTR [rbp+0x0]
      e950cb:	48 8d 35 80 4f f6 ff 	lea    rsi,[rip+0xfffffffffff64f80]        # dfa052 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc70d8>
      e950d2:	48 8d 15 ad 4f f6 ff 	lea    rdx,[rip+0xfffffffffff64fad]        # dfa086 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc710c>
      e950d9:	48 8d 0d 74 4b 00 00 	lea    rcx,[rip+0x4b74]        # e99c54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6106a>
      e950e0:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]
      e950e7:	00 
      e950e8:	6a 20                	push   0x20
      e950ea:	41 59                	pop    r9
      e950ec:	48 89 df             	mov    rdi,rbx
      e950ef:	e8 a0 56 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e950f4:	49 8b 06             	mov    rax,QWORD PTR [r14]
      e950f7:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e950fe:	00 
      e950ff:	4c 89 f6             	mov    rsi,r14
      e95102:	48 89 da             	mov    rdx,rbx
      e95105:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
      e9510b:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
      e95110:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]
      e95115:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
      e9511c:	00 
      e9511d:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]
      e95124:	00 

### READ 0xe954c7: mov    rax,QWORD PTR [rsp+0x3a8]
      e9547a:	48 89 df             	mov    rdi,rbx
      e9547d:	e8 04 90 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95482:	31 ff                	xor    edi,edi
      e95484:	e8 fd 8f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95489:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
      e9548e:	e8 f3 8f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95493:	ba c0 00 00 00       	mov    edx,0xc0
      e95498:	4c 89 ff             	mov    rdi,r15
      e9549b:	31 f6                	xor    esi,esi
      e9549d:	e8 ee 96 95 00       	call   17eeb90 <memset@plt>
      e954a2:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
      e954a7:	48 8b 81 90 04 00 00 	mov    rax,QWORD PTR [rcx+0x490]
      e954ae:	0f 10 81 88 04 00 00 	movups xmm0,XMMWORD PTR [rcx+0x488]
      e954b5:	0f 29 84 24 e0 0b 00 	movaps XMMWORD PTR [rsp+0xbe0],xmm0
      e954bc:	00 
      e954bd:	48 85 c0             	test   rax,rax
      e954c0:	74 05                	je     e954c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c8dd>
      e954c2:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e954c7:	48 8b 84 24 a8 03 00 	mov    rax,QWORD PTR [rsp+0x3a8]
      e954ce:	00 
      e954cf:	f3 0f 6f 84 24 a0 03 	movdqu xmm0,XMMWORD PTR [rsp+0x3a0]
      e954d6:	00 00 
      e954d8:	66 0f 7f 84 24 f0 0b 	movdqa XMMWORD PTR [rsp+0xbf0],xmm0
      e954df:	00 00 
      e954e1:	48 85 c0             	test   rax,rax
      e954e4:	48 8b 5c 24 48       	mov    rbx,QWORD PTR [rsp+0x48]
      e954e9:	74 05                	je     e954f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c906>
      e954eb:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e954f0:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e954f7:	00 
      e954f8:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
      e954ff:	00 
      e95500:	6a 02                	push   0x2
      e95502:	5a                   	pop    rdx
      e95503:	e8 d6 97 c3 ff       	call   acecde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bc7e>
      e95508:	f3 0f 7e 84 24 f8 00 	movq   xmm0,QWORD PTR [rsp+0xf8]
      e9550f:	00 00 
      e95511:	66 49 0f 6e ce       	movq   xmm1,r14
      e95516:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9551a:	66 0f 7f 8c 24 c0 00 	movdqa XMMWORD PTR [rsp+0xc0],xmm1
      e95521:	00 00 
      e95523:	66 48 0f 6e c3       	movq   xmm0,rbx
      e95528:	f3 0f 7e 4c 24 20    	movq   xmm1,QWORD PTR [rsp+0x20]
      e9552e:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e95532:	66 0f 7f 8c 24 d0 00 	movdqa XMMWORD PTR [rsp+0xd0],xmm1
      e95539:	00 00 
      e9553b:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      e95540:	66 48 0f 6e c0       	movq   xmm0,rax
      e95545:	66 49 0f 6e cd       	movq   xmm1,r13
      e9554a:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9554e:	66 0f 7f 8c 24 50 02 	movdqa XMMWORD PTR [rsp+0x250],xmm1

### READ 0xe954cf: movdqu xmm0,XMMWORD PTR [rsp+0x3a0]
      e95482:	31 ff                	xor    edi,edi
      e95484:	e8 fd 8f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95489:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
      e9548e:	e8 f3 8f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95493:	ba c0 00 00 00       	mov    edx,0xc0
      e95498:	4c 89 ff             	mov    rdi,r15
      e9549b:	31 f6                	xor    esi,esi
      e9549d:	e8 ee 96 95 00       	call   17eeb90 <memset@plt>
      e954a2:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
      e954a7:	48 8b 81 90 04 00 00 	mov    rax,QWORD PTR [rcx+0x490]
      e954ae:	0f 10 81 88 04 00 00 	movups xmm0,XMMWORD PTR [rcx+0x488]
      e954b5:	0f 29 84 24 e0 0b 00 	movaps XMMWORD PTR [rsp+0xbe0],xmm0
      e954bc:	00 
      e954bd:	48 85 c0             	test   rax,rax
      e954c0:	74 05                	je     e954c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c8dd>
      e954c2:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e954c7:	48 8b 84 24 a8 03 00 	mov    rax,QWORD PTR [rsp+0x3a8]
      e954ce:	00 
      e954cf:	f3 0f 6f 84 24 a0 03 	movdqu xmm0,XMMWORD PTR [rsp+0x3a0]
      e954d6:	00 00 
      e954d8:	66 0f 7f 84 24 f0 0b 	movdqa XMMWORD PTR [rsp+0xbf0],xmm0
      e954df:	00 00 
      e954e1:	48 85 c0             	test   rax,rax
      e954e4:	48 8b 5c 24 48       	mov    rbx,QWORD PTR [rsp+0x48]
      e954e9:	74 05                	je     e954f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c906>
      e954eb:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e954f0:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e954f7:	00 
      e954f8:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
      e954ff:	00 
      e95500:	6a 02                	push   0x2
      e95502:	5a                   	pop    rdx
      e95503:	e8 d6 97 c3 ff       	call   acecde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bc7e>
      e95508:	f3 0f 7e 84 24 f8 00 	movq   xmm0,QWORD PTR [rsp+0xf8]
      e9550f:	00 00 
      e95511:	66 49 0f 6e ce       	movq   xmm1,r14
      e95516:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9551a:	66 0f 7f 8c 24 c0 00 	movdqa XMMWORD PTR [rsp+0xc0],xmm1
      e95521:	00 00 
      e95523:	66 48 0f 6e c3       	movq   xmm0,rbx
      e95528:	f3 0f 7e 4c 24 20    	movq   xmm1,QWORD PTR [rsp+0x20]
      e9552e:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e95532:	66 0f 7f 8c 24 d0 00 	movdqa XMMWORD PTR [rsp+0xd0],xmm1
      e95539:	00 00 
      e9553b:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      e95540:	66 48 0f 6e c0       	movq   xmm0,rax
      e95545:	66 49 0f 6e cd       	movq   xmm1,r13
      e9554a:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9554e:	66 0f 7f 8c 24 50 02 	movdqa XMMWORD PTR [rsp+0x250],xmm1
      e95555:	00 00 
      e95557:	48 8b 8c 24 90 00 00 	mov    rcx,QWORD PTR [rsp+0x90]

## SIMD/direct writes overlapping rsp+0x3a0..0x3af
## LEA aliases formed to rsp+0x3a0 / nearby pair
## Alias uses until register redefinition
## Last 0x1400 bytes before outgoing push sequence
  e94700:	48 8d 94 24 50 0f 00 	lea    rdx,[rsp+0xf50]
  e94707:	00 
  e94708:	e8 cb 44 7e 00       	call   1678bd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cd44>
  e9470d:	48 8d bc 24 50 0f 00 	lea    rdi,[rsp+0xf50]
  e94714:	00 
  e94715:	e8 46 46 06 00       	call   ef8d60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0176>
  e9471a:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
  e94721:	00 
  e94722:	e8 a5 a0 c0 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
  e94727:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e9472e:	00 
  e9472f:	e8 36 58 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e94734:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
  e9473b:	00 
  e9473c:	e8 29 58 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e94741:	48 8d bc 24 d0 0f 00 	lea    rdi,[rsp+0xfd0]
  e94748:	00 
  e94749:	e8 1c 58 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9474e:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
  e94755:	00 
  e94756:	e8 0f 58 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9475b:	49 8b 85 28 04 00 00 	mov    rax,QWORD PTR [r13+0x428]
  e94762:	49 8b 8d 98 05 00 00 	mov    rcx,QWORD PTR [r13+0x598]
  e94769:	48 8d 15 c8 3c 9e 00 	lea    rdx,[rip+0x9e3cc8]        # 1878438 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x34b20>
  e94770:	48 8d b4 24 c0 0e 00 	lea    rsi,[rsp+0xec0]
  e94777:	00 
  e94778:	48 89 16             	mov    QWORD PTR [rsi],rdx
  e9477b:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  e9477f:	48 89 4e 10          	mov    QWORD PTR [rsi+0x10],rcx
  e94783:	48 89 76 20          	mov    QWORD PTR [rsi+0x20],rsi
  e94787:	49 8b b5 b8 03 00 00 	mov    rsi,QWORD PTR [r13+0x3b8]
  e9478e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e94791:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
  e94798:	00 
  e94799:	ff 50 10             	call   QWORD PTR [rax+0x10]
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
  e947e8:	66 0f 7f 84 24 30 0a 	movdqa XMMWORD PTR [rsp+0xa30],xmm0
  e947ef:	00 00 
  e947f1:	4c 8d 73 30          	lea    r14,[rbx+0x30]
  e947f5:	4c 89 73 30          	mov    QWORD PTR [rbx+0x30],r14
  e947f9:	4c 89 73 38          	mov    QWORD PTR [rbx+0x38],r14
  e947fd:	f3 0f 7f 43 40       	movdqu XMMWORD PTR [rbx+0x40],xmm0
  e94802:	f3 0f 7f 43 50       	movdqu XMMWORD PTR [rbx+0x50],xmm0
  e94807:	48 83 63 60 00       	and    QWORD PTR [rbx+0x60],0x0
  e9480c:	c7 43 68 00 00 80 3f 	mov    DWORD PTR [rbx+0x68],0x3f800000
  e94813:	b8 10 27 00 00       	mov    eax,0x2710
  e94818:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
  e9481c:	48 89 43 78          	mov    QWORD PTR [rbx+0x78],rax
  e94820:	f3 0f 7f 83 80 00 00 	movdqu XMMWORD PTR [rbx+0x80],xmm0
  e94827:	00 
  e94828:	f3 0f 7f 83 90 00 00 	movdqu XMMWORD PTR [rbx+0x90],xmm0
  e9482f:	00 
  e94830:	41 8a 6f 01          	mov    bpl,BYTE PTR [r15+0x1]
  e94834:	40 84 ed             	test   bpl,bpl
  e94837:	74 22                	je     e9485b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bc71>
  e94839:	4c 8d b4 24 50 0f 00 	lea    r14,[rsp+0xf50]
  e94840:	00 
  e94841:	4c 89 f7             	mov    rdi,r14
  e94844:	e8 ad 51 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  e94849:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e94850:	00 
  e94851:	4c 89 f6             	mov    rsi,r14
  e94854:	e8 e5 51 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e94859:	eb 51                	jmp    e948ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bcc2>
  e9485b:	4c 8d 84 24 10 0e 00 	lea    r8,[rsp+0xe10]
  e94862:	00 
  e94863:	4d 89 20             	mov    QWORD PTR [r8],r12
  e94866:	48 8d 35 24 88 c0 ff 	lea    rsi,[rip+0xffffffffffc08824]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
  e9486d:	48 8d 0d a2 08 03 00 	lea    rcx,[rip+0x308a2]        # ec5116 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c52c>
  e94874:	4c 8d bc 24 50 0f 00 	lea    r15,[rsp+0xf50]
  e9487b:	00 
  e9487c:	6a 08                	push   0x8
  e9487e:	41 59                	pop    r9
  e94880:	4c 89 ff             	mov    rdi,r15
  e94883:	31 d2                	xor    edx,edx
  e94885:	66 0f 7f 4c 24 70    	movdqa XMMWORD PTR [rsp+0x70],xmm1
  e9488b:	e8 04 5f 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e94890:	66 0f 6f 44 24 70    	movdqa xmm0,XMMWORD PTR [rsp+0x70]
  e94896:	66 48 0f 7e c6       	movq   rsi,xmm0
  e9489b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e9489e:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e948a5:	00 
  e948a6:	4c 89 fa             	mov    rdx,r15
  e948a9:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e948ac:	48 89 df             	mov    rdi,rbx
  e948af:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
  e948b6:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
  e948bd:	00 
  e948be:	4c 89 f6             	mov    rsi,r14
  e948c1:	e8 78 51 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e948c6:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
  e948ca:	e8 b7 9b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e948cf:	40 84 ed             	test   bpl,bpl
  e948d2:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]
  e948d7:	74 0f                	je     e948e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bcfe>
  e948d9:	48 8d bc 24 50 0f 00 	lea    rdi,[rsp+0xf50]
  e948e0:	00 
  e948e1:	e8 ee 52 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  e948e6:	eb 0d                	jmp    e948f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bd0b>
  e948e8:	48 8d bc 24 50 0f 00 	lea    rdi,[rsp+0xf50]
  e948ef:	00 
  e948f0:	e8 f3 5e 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e948f5:	31 ff                	xor    edi,edi
  e948f7:	e8 20 9b c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e948fc:	6a 58                	push   0x58
  e948fe:	5f                   	pop    rdi
  e948ff:	e8 fc 95 95 00       	call   17edf00 <_Znwm@plt>
  e94904:	49 89 c6             	mov    r14,rax
  e94907:	66 0f ef c0          	pxor   xmm0,xmm0
  e9490b:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e94910:	48 8d 05 59 d1 99 00 	lea    rax,[rip+0x99d159]        # 1831a70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a08>
  e94917:	49 89 06             	mov    QWORD PTR [r14],rax
  e9491a:	48 8d 05 d7 f2 9a 00 	lea    rax,[rip+0x9af2d7]        # 1843bf8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e0>
  e94921:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  e94925:	4d 89 66 20          	mov    QWORD PTR [r14+0x20],r12
  e94929:	49 89 5e 28          	mov    QWORD PTR [r14+0x28],rbx
  e9492d:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  e94932:	49 8d 7e 30          	lea    rdi,[r14+0x30]
  e94936:	48 8d 35 12 37 49 ff 	lea    rsi,[rip+0xffffffffff493712]        # 32804f <_ZTSSt12bad_any_cast@@Base-0x68179>
  e9493d:	6a 0a                	push   0xa
  e9493f:	5a                   	pop    rdx
  e94940:	e8 d5 80 c0 ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
  e94945:	49 8d 8d 70 04 00 00 	lea    rcx,[r13+0x470]
  e9494c:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
  e94950:	48 89 4c 24 60       	mov    QWORD PTR [rsp+0x60],rcx
  e94955:	66 0f 6f 01          	movdqa xmm0,XMMWORD PTR [rcx]
  e94959:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0
  e9495f:	48 85 c0             	test   rax,rax
  e94962:	74 05                	je     e94969 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bd7f>
  e94964:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e94969:	48 89 df             	mov    rdi,rbx
  e9496c:	e8 15 9b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e94971:	31 ff                	xor    edi,edi
  e94973:	e8 a4 9a c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e94978:	31 ff                	xor    edi,edi
  e9497a:	e8 07 9b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9497f:	48 8b bc 24 38 0a 00 	mov    rdi,QWORD PTR [rsp+0xa38]
  e94986:	00 
  e94987:	e8 fa 9a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9498c:	49 8b 9d e8 00 00 00 	mov    rbx,QWORD PTR [r13+0xe8]
  e94993:	6a 38                	push   0x38
  e94995:	5f                   	pop    rdi
  e94996:	4c 89 74 24 48       	mov    QWORD PTR [rsp+0x48],r14
  e9499b:	e8 60 95 95 00       	call   17edf00 <_Znwm@plt>
  e949a0:	49 89 c4             	mov    r12,rax
  e949a3:	66 0f ef c0          	pxor   xmm0,xmm0
  e949a7:	f3 41 0f 7f 44 24 08 	movdqu XMMWORD PTR [r12+0x8],xmm0
  e949ae:	48 8d 05 5b fa 9a 00 	lea    rax,[rip+0x9afa5b]        # 1844410 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xaf8>
  e949b5:	49 89 04 24          	mov    QWORD PTR [r12],rax
  e949b9:	48 8d 05 88 fa 9a 00 	lea    rax,[rip+0x9afa88]        # 1844448 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xb30>
  e949c0:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
  e949c5:	f3 41 0f 7f 44 24 20 	movdqu XMMWORD PTR [r12+0x20],xmm0
  e949cc:	4c 89 a4 24 18 01 00 	mov    QWORD PTR [rsp+0x118],r12
  e949d3:	00 
  e949d4:	49 89 5c 24 30       	mov    QWORD PTR [r12+0x30],rbx
  e949d9:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
  e949dd:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e949e0:	66 0f 7f 84 24 20 03 	movdqa XMMWORD PTR [rsp+0x320],xmm0
  e949e7:	00 00 
  e949e9:	66 0f 7f 84 24 00 03 	movdqa XMMWORD PTR [rsp+0x300],xmm0
  e949f0:	00 00 
  e949f2:	48 83 a4 24 10 03 00 	and    QWORD PTR [rsp+0x310],0x0
  e949f9:	00 00 
  e949fb:	48 8d 35 90 f6 53 ff 	lea    rsi,[rip+0xffffffffff53f690]        # 3d4092 <_ZTSN5boost17bad_function_callE@@Base+0x13d8>
  e94a02:	48 8d 0d 97 f6 53 ff 	lea    rcx,[rip+0xffffffffff53f697]        # 3d40a0 <_ZTSN5boost17bad_function_callE@@Base+0x13e6>
  e94a09:	6a 0b                	push   0xb
  e94a0b:	5a                   	pop    rdx
  e94a0c:	6a 1e                	push   0x1e
  e94a0e:	41 58                	pop    r8
  e94a10:	45 31 c9             	xor    r9d,r9d
  e94a13:	e8 72 29 75 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e94a18:	89 c5                	mov    ebp,eax
  e94a1a:	84 c0                	test   al,al
  e94a1c:	74 68                	je     e94a86 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5be9c>
  e94a1e:	49 8b 9d 78 05 00 00 	mov    rbx,QWORD PTR [r13+0x578]
  e94a25:	6a 28                	push   0x28
  e94a27:	5f                   	pop    rdi
  e94a28:	e8 d3 94 95 00       	call   17edf00 <_Znwm@plt>
  e94a2d:	66 0f ef c0          	pxor   xmm0,xmm0
  e94a31:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e94a36:	48 8d 0d 2b 8a 96 00 	lea    rcx,[rip+0x968a2b]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
  e94a3d:	48 89 08             	mov    QWORD PTR [rax],rcx
  e94a40:	48 89 c1             	mov    rcx,rax
  e94a43:	48 83 c1 18          	add    rcx,0x18
  e94a47:	48 8d 15 f2 fb 9a 00 	lea    rdx,[rip+0x9afbf2]        # 1844640 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xd28>
  e94a4e:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
  e94a52:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
  e94a56:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
  e94a5d:	00 
  e94a5e:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  e94a61:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  e94a65:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
  e94a6c:	00 
  e94a6d:	e8 3c 50 00 00       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
  e94a72:	48 8b bc 24 e8 0b 00 	mov    rdi,QWORD PTR [rsp+0xbe8]
  e94a79:	00 
  e94a7a:	e8 07 9a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e94a7f:	31 ff                	xor    edi,edi
  e94a81:	e8 00 9a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e94a86:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
  e94a8a:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e94a8d:	e8 6e 51 00 00       	call   e99c00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61016>
  e94a92:	84 c0                	test   al,al
  e94a94:	74 65                	je     e94afb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bf11>
  e94a96:	49 8b 5d 18          	mov    rbx,QWORD PTR [r13+0x18]
  e94a9a:	6a 28                	push   0x28
  e94a9c:	5f                   	pop    rdi
  e94a9d:	e8 5e 94 95 00       	call   17edf00 <_Znwm@plt>
  e94aa2:	66 0f ef c0          	pxor   xmm0,xmm0
  e94aa6:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e94aab:	48 8d 0d b6 89 96 00 	lea    rcx,[rip+0x9689b6]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
  e94ab2:	48 89 08             	mov    QWORD PTR [rax],rcx
  e94ab5:	48 89 c1             	mov    rcx,rax
  e94ab8:	48 83 c1 18          	add    rcx,0x18
  e94abc:	48 8d 15 ad fc 9a 00 	lea    rdx,[rip+0x9afcad]        # 1844770 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xe58>
  e94ac3:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
  e94ac7:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
  e94acb:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
  e94ad2:	00 
  e94ad3:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  e94ad6:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  e94ada:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
  e94ae1:	00 
  e94ae2:	e8 c7 4f 00 00       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
  e94ae7:	48 8b bc 24 e8 0b 00 	mov    rdi,QWORD PTR [rsp+0xbe8]
  e94aee:	00 
  e94aef:	e8 92 99 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e94af4:	31 ff                	xor    edi,edi
  e94af6:	e8 8b 99 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e94afb:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
  e94aff:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e94b02:	48 8d 35 b6 f5 53 ff 	lea    rsi,[rip+0xffffffffff53f5b6]        # 3d40bf <_ZTSN5boost17bad_function_callE@@Base+0x1405>
  e94b09:	48 8d 0d c0 f5 53 ff 	lea    rcx,[rip+0xffffffffff53f5c0]        # 3d40d0 <_ZTSN5boost17bad_function_callE@@Base+0x1416>
  e94b10:	6a 0b                	push   0xb
  e94b12:	5a                   	pop    rdx
  e94b13:	6a 21                	push   0x21
  e94b15:	41 58                	pop    r8
  e94b17:	45 31 c9             	xor    r9d,r9d
  e94b1a:	e8 6b 28 75 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e94b1f:	84 c0                	test   al,al
  e94b21:	74 75                	je     e94b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bfae>
  e94b23:	49 8b 5d 18          	mov    rbx,QWORD PTR [r13+0x18]
  e94b27:	4d 8b b5 78 05 00 00 	mov    r14,QWORD PTR [r13+0x578]
  e94b2e:	6a 30                	push   0x30
  e94b30:	5f                   	pop    rdi
  e94b31:	e8 ca 93 95 00       	call   17edf00 <_Znwm@plt>
  e94b36:	66 0f ef c0          	pxor   xmm0,xmm0
  e94b3a:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e94b3f:	48 8d 0d 22 89 96 00 	lea    rcx,[rip+0x968922]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
  e94b46:	48 89 08             	mov    QWORD PTR [rax],rcx
  e94b49:	48 89 c1             	mov    rcx,rax
  e94b4c:	48 83 c1 18          	add    rcx,0x18
  e94b50:	48 8d 15 49 fb 9a 00 	lea    rdx,[rip+0x9afb49]        # 18446a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xd88>
  e94b57:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
  e94b5b:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
  e94b5f:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14
  e94b63:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
  e94b6a:	00 
  e94b6b:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  e94b6e:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  e94b72:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
  e94b79:	00 
  e94b7a:	e8 2f 4f 00 00       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
  e94b7f:	48 8b bc 24 e8 0b 00 	mov    rdi,QWORD PTR [rsp+0xbe8]
  e94b86:	00 
  e94b87:	e8 fa 98 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e94b8c:	31 ff                	xor    edi,edi
  e94b8e:	e8 f3 98 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e94b93:	4c 8b 74 24 48       	mov    r14,QWORD PTR [rsp+0x48]
  e94b98:	49 8d 46 18          	lea    rax,[r14+0x18]
  e94b9c:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e94ba1:	49 8d 46 08          	lea    rax,[r14+0x8]
  e94ba5:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  e94baa:	49 83 c4 18          	add    r12,0x18
  e94bae:	4c 89 a4 24 88 01 00 	mov    QWORD PTR [rsp+0x188],r12
  e94bb5:	00 
  e94bb6:	48 8b 9c 24 00 03 00 	mov    rbx,QWORD PTR [rsp+0x300]
  e94bbd:	00 
  e94bbe:	4c 8b b4 24 08 03 00 	mov    r14,QWORD PTR [rsp+0x308]
  e94bc5:	00 
  e94bc6:	4c 39 f3             	cmp    rbx,r14
  e94bc9:	0f 84 ae 05 00 00    	je     e9517d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c593>
  e94bcf:	40 88 ac 24 88 00 00 	mov    BYTE PTR [rsp+0x88],bpl
  e94bd6:	00 
  e94bd7:	6a 38                	push   0x38
  e94bd9:	5f                   	pop    rdi
  e94bda:	e8 21 93 95 00       	call   17edf00 <_Znwm@plt>
  e94bdf:	66 0f ef c0          	pxor   xmm0,xmm0
  e94be3:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e94be8:	48 8d 15 79 88 96 00 	lea    rdx,[rip+0x968879]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
  e94bef:	48 8b 8c 24 10 03 00 	mov    rcx,QWORD PTR [rsp+0x310]
  e94bf6:	00 
  e94bf7:	48 83 a4 24 10 03 00 	and    QWORD PTR [rsp+0x310],0x0
  e94bfe:	00 00 
  e94c00:	48 89 10             	mov    QWORD PTR [rax],rdx
  e94c03:	66 0f 7f 84 24 00 03 	movdqa XMMWORD PTR [rsp+0x300],xmm0
  e94c0a:	00 00 
  e94c0c:	48 8d 15 b5 fa 9a 00 	lea    rdx,[rip+0x9afab5]        # 18446c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xdb0>
  e94c13:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
  e94c17:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
  e94c1b:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14
  e94c1f:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx
  e94c23:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
  e94c2a:	00 
  e94c2b:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
  e94c30:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
  e94c35:	49 89 c4             	mov    r12,rax
  e94c38:	4c 89 f7             	mov    rdi,r14
  e94c3b:	e8 e2 8e c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
  e94c40:	48 8d 84 24 90 0e 00 	lea    rax,[rsp+0xe90]
  e94c47:	00 
  e94c48:	48 8d 2d 91 9c 97 00 	lea    rbp,[rip+0x979c91]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
  e94c4f:	48 89 28             	mov    QWORD PTR [rax],rbp
  e94c52:	4c 8b 2d 47 ce a1 00 	mov    r13,QWORD PTR [rip+0xa1ce47]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
  e94c59:	4c 89 68 08          	mov    QWORD PTR [rax+0x8],r13
  e94c5d:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
  e94c61:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  e94c66:	48 8b 80 e8 00 00 00 	mov    rax,QWORD PTR [rax+0xe8]
  e94c6d:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
  e94c72:	bf 90 00 00 00       	mov    edi,0x90
  e94c77:	4c 89 a4 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],r12
  e94c7e:	00 
  e94c7f:	e8 7c 92 95 00       	call   17edf00 <_Znwm@plt>
  e94c84:	48 89 c3             	mov    rbx,rax
  e94c87:	4d 8d 7c 24 08       	lea    r15,[r12+0x8]
  e94c8c:	48 89 ac 24 e0 0b 00 	mov    QWORD PTR [rsp+0xbe0],rbp
  e94c93:	00 
  e94c94:	4c 89 ac 24 e8 0b 00 	mov    QWORD PTR [rsp+0xbe8],r13
  e94c9b:	00 
  e94c9c:	4c 89 b4 24 00 0c 00 	mov    QWORD PTR [rsp+0xc00],r14
  e94ca3:	00 
  e94ca4:	66 0f ef c0          	pxor   xmm0,xmm0
  e94ca8:	66 0f 7f 00          	movdqa XMMWORD PTR [rax],xmm0
  e94cac:	48 b8 00 00 00 00 00 	movabs rax,0x3ff0000000000000
  e94cb3:	00 f0 3f 
  e94cb6:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
  e94cba:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
  e94cbf:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
  e94cc3:	4c 89 f6             	mov    rsi,r14
  e94cc6:	e8 25 32 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
  e94ccb:	48 89 df             	mov    rdi,rbx
  e94cce:	48 83 ef 80          	sub    rdi,0xffffffffffffff80
  e94cd2:	48 8b 74 24 70       	mov    rsi,QWORD PTR [rsp+0x70]
  e94cd7:	e8 e6 c9 92 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
  e94cdc:	48 89 9c 24 50 10 00 	mov    QWORD PTR [rsp+0x1050],rbx
  e94ce3:	00 
  e94ce4:	4c 89 f7             	mov    rdi,r14
  e94ce7:	e8 7e 52 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e94cec:	f0 49 ff 07          	lock inc QWORD PTR [r15]
  e94cf0:	bf 00 01 00 00       	mov    edi,0x100
  e94cf5:	e8 06 92 95 00       	call   17edf00 <_Znwm@plt>
  e94cfa:	49 89 c7             	mov    r15,rax
  e94cfd:	4c 89 e0             	mov    rax,r12
  e94d00:	48 83 c0 18          	add    rax,0x18
  e94d04:	48 8d 0d 8d fa 9a 00 	lea    rcx,[rip+0x9afa8d]        # 1844798 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xe80>
  e94d0b:	49 89 0f             	mov    QWORD PTR [r15],rcx
  e94d0e:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
  e94d12:	4d 89 67 10          	mov    QWORD PTR [r15+0x10],r12
  e94d16:	66 0f ef c0          	pxor   xmm0,xmm0
  e94d1a:	f3 41 0f 7f 47 18    	movdqu XMMWORD PTR [r15+0x18],xmm0
  e94d20:	f3 41 0f 7f 47 28    	movdqu XMMWORD PTR [r15+0x28],xmm0
  e94d26:	49 83 67 38 00       	and    QWORD PTR [r15+0x38],0x0
  e94d2b:	4c 89 f8             	mov    rax,r15
  e94d2e:	48 83 c0 40          	add    rax,0x40
  e94d32:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
  e94d36:	49 89 47 48          	mov    QWORD PTR [r15+0x48],rax
  e94d3a:	66 41 0f 7f 47 50    	movdqa XMMWORD PTR [r15+0x50],xmm0
  e94d40:	66 41 0f 7f 47 60    	movdqa XMMWORD PTR [r15+0x60],xmm0
  e94d46:	49 83 67 70 00       	and    QWORD PTR [r15+0x70],0x0
  e94d4b:	b8 00 00 80 3f       	mov    eax,0x3f800000
  e94d50:	41 89 47 78          	mov    DWORD PTR [r15+0x78],eax
  e94d54:	6a 64                	push   0x64
  e94d56:	59                   	pop    rcx
  e94d57:	49 89 8f 80 00 00 00 	mov    QWORD PTR [r15+0x80],rcx
  e94d5e:	49 89 8f 88 00 00 00 	mov    QWORD PTR [r15+0x88],rcx
  e94d65:	49 83 a7 90 00 00 00 	and    QWORD PTR [r15+0x90],0x0
  e94d6c:	00 
  e94d6d:	49 83 a7 c0 00 00 00 	and    QWORD PTR [r15+0xc0],0x0
  e94d74:	00 
  e94d75:	66 41 0f 7f 87 d0 00 	movdqa XMMWORD PTR [r15+0xd0],xmm0
  e94d7c:	00 00 
  e94d7e:	66 41 0f 7f 87 e0 00 	movdqa XMMWORD PTR [r15+0xe0],xmm0
  e94d85:	00 00 
  e94d87:	41 89 87 f0 00 00 00 	mov    DWORD PTR [r15+0xf0],eax
  e94d8e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
  e94d93:	f0 48 ff 00          	lock inc QWORD PTR [rax]
  e94d97:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  e94d9c:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
  e94da0:	48 8b 30             	mov    rsi,QWORD PTR [rax]
  e94da3:	48 8d 15 48 f3 53 ff 	lea    rdx,[rip+0xffffffffff53f348]        # 3d40f2 <_ZTSN5boost17bad_function_callE@@Base+0x1438>
  e94daa:	4c 8d 05 4f f3 53 ff 	lea    r8,[rip+0xffffffffff53f34f]        # 3d4100 <_ZTSN5boost17bad_function_callE@@Base+0x1446>
  e94db1:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
  e94db8:	00 
  e94db9:	6a 0b                	push   0xb
  e94dbb:	59                   	pop    rcx
  e94dbc:	6a 25                	push   0x25
  e94dbe:	41 59                	pop    r9
  e94dc0:	4c 89 f7             	mov    rdi,r14
  e94dc3:	e8 00 27 75 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  e94dc8:	45 31 e4             	xor    r12d,r12d
  e94dcb:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
  e94dd0:	74 4e                	je     e94e20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c236>
  e94dd2:	48 8d 35 f7 3d 54 ff 	lea    rsi,[rip+0xffffffffff543df7]        # 3d8bd0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x37b5>
  e94dd9:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e94de0:	00 
  e94de1:	e8 69 6a be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  e94de6:	84 c0                	test   al,al
  e94de8:	74 06                	je     e94df0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c206>
  e94dea:	6a 02                	push   0x2
  e94dec:	41 5c                	pop    r12
  e94dee:	eb 30                	jmp    e94e20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c236>
  e94df0:	48 8d 35 2f f3 53 ff 	lea    rsi,[rip+0xffffffffff53f32f]        # 3d4126 <_ZTSN5boost17bad_function_callE@@Base+0x146c>
  e94df7:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e94dfe:	00 
  e94dff:	e8 4b 6a be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  e94e04:	84 c0                	test   al,al
  e94e06:	75 18                	jne    e94e20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c236>
  e94e08:	48 8d 35 a0 89 4d ff 	lea    rsi,[rip+0xffffffffff4d89a0]        # 36d7af <_ZTSSt12bad_any_cast@@Base-0x22a19>
  e94e0f:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e94e16:	00 
  e94e17:	e8 33 6a be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  e94e1c:	44 0f b6 e0          	movzx  r12d,al
  e94e20:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
  e94e27:	00 
  e94e28:	4c 89 f7             	mov    rdi,r14
  e94e2b:	e8 00 1f c1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  e94e30:	31 ed                	xor    ebp,ebp
  e94e32:	41 83 fc 01          	cmp    r12d,0x1
  e94e36:	40 0f 94 c5          	sete   bpl
  e94e3a:	41 83 fc 02          	cmp    r12d,0x2
  e94e3e:	41 0f 44 ec          	cmove  ebp,r12d
  e94e42:	bf 50 01 00 00       	mov    edi,0x150
  e94e47:	e8 b4 90 95 00       	call   17edf00 <_Znwm@plt>
  e94e4c:	49 89 c4             	mov    r12,rax
  e94e4f:	66 0f ef c0          	pxor   xmm0,xmm0
  e94e53:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e94e58:	48 8d 05 b9 f9 9a 00 	lea    rax,[rip+0x9af9b9]        # 1844818 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf00>
  e94e5f:	49 89 04 24          	mov    QWORD PTR [r12],rax
  e94e63:	4c 8d ac 24 10 0e 00 	lea    r13,[rsp+0xe10]
  e94e6a:	00 
  e94e6b:	48 8d b4 24 90 0e 00 	lea    rsi,[rsp+0xe90]
  e94e72:	00 
  e94e73:	4c 89 ef             	mov    rdi,r13
  e94e76:	e8 75 30 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
  e94e7b:	48 8d 05 ce f9 9a 00 	lea    rax,[rip+0x9af9ce]        # 1844850 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf38>
  e94e82:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
  e94e87:	48 b8 00 00 00 00 00 	movabs rax,0x3ff0000000000000
  e94e8e:	00 f0 3f 
  e94e91:	49 89 44 24 28       	mov    QWORD PTR [r12+0x28],rax
  e94e96:	31 c0                	xor    eax,eax
  e94e98:	41 88 44 24 30       	mov    BYTE PTR [r12+0x30],al
  e94e9d:	41 88 44 24 40       	mov    BYTE PTR [r12+0x40],al
  e94ea2:	49 83 64 24 58 00    	and    QWORD PTR [r12+0x58],0x0
  e94ea8:	66 0f ef c0          	pxor   xmm0,xmm0
  e94eac:	f3 41 0f 7f 44 24 48 	movdqu XMMWORD PTR [r12+0x48],xmm0
  e94eb3:	41 88 44 24 70       	mov    BYTE PTR [r12+0x70],al
  e94eb8:	49 8d bc 24 80 00 00 	lea    rdi,[r12+0x80]
  e94ebf:	00 
  e94ec0:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
  e94ec5:	4c 89 ee             	mov    rsi,r13
  e94ec8:	e8 23 30 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
  e94ecd:	48 83 a4 24 50 10 00 	and    QWORD PTR [rsp+0x1050],0x0
  e94ed4:	00 00 
  e94ed6:	49 89 9c 24 b0 00 00 	mov    QWORD PTR [r12+0xb0],rbx
  e94edd:	00 
  e94ede:	4d 89 bc 24 b8 00 00 	mov    QWORD PTR [r12+0xb8],r15
  e94ee5:	00 
  e94ee6:	49 8d 9c 24 c0 00 00 	lea    rbx,[r12+0xc0]
  e94eed:	00 
  e94eee:	48 89 df             	mov    rdi,rbx
  e94ef1:	e8 0c 4f 94 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  e94ef6:	4d 8d 6c 24 20       	lea    r13,[r12+0x20]
  e94efb:	49 8d 44 24 48       	lea    rax,[r12+0x48]
  e94f00:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  e94f07:	00 
  e94f08:	49 8d 84 24 b0 00 00 	lea    rax,[r12+0xb0]
  e94f0f:	00 
  e94f10:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
  e94f17:	00 
  e94f18:	49 8d 84 24 b8 00 00 	lea    rax,[r12+0xb8]
  e94f1f:	00 
  e94f20:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
  e94f27:	00 
  e94f28:	66 0f ef c0          	pxor   xmm0,xmm0
  e94f2c:	f3 41 0f 7f 84 24 18 	movdqu XMMWORD PTR [r12+0x118],xmm0
  e94f33:	01 00 00 
  e94f36:	48 8b 84 24 88 01 00 	mov    rax,QWORD PTR [rsp+0x188]
  e94f3d:	00 
  e94f3e:	49 89 84 24 28 01 00 	mov    QWORD PTR [r12+0x128],rax
  e94f45:	00 
  e94f46:	48 8b 84 24 18 01 00 	mov    rax,QWORD PTR [rsp+0x118]
  e94f4d:	00 
  e94f4e:	49 89 84 24 30 01 00 	mov    QWORD PTR [r12+0x130],rax
  e94f55:	00 
  e94f56:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e94f5b:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
  e94f60:	49 89 84 24 38 01 00 	mov    QWORD PTR [r12+0x138],rax
  e94f67:	00 
  e94f68:	4c 8b 7c 24 48       	mov    r15,QWORD PTR [rsp+0x48]
  e94f6d:	4d 89 bc 24 40 01 00 	mov    QWORD PTR [r12+0x140],r15
  e94f74:	00 
  e94f75:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
  e94f7a:	8a 84 24 88 00 00 00 	mov    al,BYTE PTR [rsp+0x88]
  e94f81:	41 88 84 24 48 01 00 	mov    BYTE PTR [r12+0x148],al
  e94f88:	00 
  e94f89:	41 89 ac 24 4c 01 00 	mov    DWORD PTR [r12+0x14c],ebp
  e94f90:	00 
  e94f91:	49 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [r12+0xb0]
  e94f98:	00 
  e94f99:	48 8d 05 f0 f8 9a 00 	lea    rax,[rip+0x9af8f0]        # 1844890 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf78>
  e94fa0:	48 89 84 24 e0 0b 00 	mov    QWORD PTR [rsp+0xbe0],rax
  e94fa7:	00 
  e94fa8:	4c 89 ac 24 e8 0b 00 	mov    QWORD PTR [rsp+0xbe8],r13
  e94faf:	00 
  e94fb0:	4c 89 b4 24 00 0c 00 	mov    QWORD PTR [rsp+0xc00],r14
  e94fb7:	00 
  e94fb8:	48 83 c7 20          	add    rdi,0x20
  e94fbc:	4c 89 f6             	mov    rsi,r14
  e94fbf:	e8 3a 3b 17 00       	call   1008afe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cff14>
  e94fc4:	4c 89 f7             	mov    rdi,r14
  e94fc7:	e8 9e 4f be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e94fcc:	49 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [r12+0xb8]
  e94fd3:	00 
  e94fd4:	48 8d 05 fd f8 9a 00 	lea    rax,[rip+0x9af8fd]        # 18448d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xfc0>
  e94fdb:	48 89 84 24 30 0a 00 	mov    QWORD PTR [rsp+0xa30],rax
  e94fe2:	00 
  e94fe3:	4c 89 ac 24 38 0a 00 	mov    QWORD PTR [rsp+0xa38],r13
  e94fea:	00 
  e94feb:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
  e94ff2:	00 
  e94ff3:	48 89 b4 24 50 0a 00 	mov    QWORD PTR [rsp+0xa50],rsi
  e94ffa:	00 
  e94ffb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e94ffe:	ff 50 20             	call   QWORD PTR [rax+0x20]
  e95001:	49 8d 6c 24 08       	lea    rbp,[r12+0x8]
  e95006:	48 8d 9c 24 30 0a 00 	lea    rbx,[rsp+0xa30]
  e9500d:	00 
  e9500e:	48 89 df             	mov    rdi,rbx
  e95011:	e8 54 4f be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e95016:	4c 8d b4 24 10 0e 00 	lea    r14,[rsp+0xe10]
  e9501d:	00 
  e9501e:	4c 89 f7             	mov    rdi,r14
  e95021:	e8 44 4f be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e95026:	66 49 0f 6e c4       	movq   xmm0,r12
  e9502b:	66 49 0f 6e cd       	movq   xmm1,r13
  e95030:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e95034:	66 0f 7f 4c 24 70    	movdqa XMMWORD PTR [rsp+0x70],xmm1
  e9503a:	31 ff                	xor    edi,edi
  e9503c:	e8 db 93 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e95041:	0f 28 44 24 70       	movaps xmm0,XMMWORD PTR [rsp+0x70]
  e95046:	0f 29 84 24 20 03 00 	movaps XMMWORD PTR [rsp+0x320],xmm0
  e9504d:	00 
  e9504e:	31 ff                	xor    edi,edi
  e95050:	e8 31 94 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e95055:	31 ff                	xor    edi,edi
  e95057:	e8 2a 94 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9505c:	4c 89 ff             	mov    rdi,r15
  e9505f:	e8 22 94 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e95064:	31 ff                	xor    edi,edi
  e95066:	e8 1b 94 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9506b:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
  e95072:	00 
  e95073:	e8 a6 4b 00 00       	call   e99c1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61034>
  e95078:	48 8d bc 24 90 0e 00 	lea    rdi,[rsp+0xe90]
  e9507f:	00 
  e95080:	e8 e5 4e be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e95085:	0f 57 c0             	xorps  xmm0,xmm0
  e95088:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
  e9508c:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
  e95091:	4c 8b b4 24 90 03 00 	mov    r14,QWORD PTR [rsp+0x390]
  e95098:	00 
  e95099:	48 8b 84 24 98 03 00 	mov    rax,QWORD PTR [rsp+0x398]
  e950a0:	00 
  e950a1:	4c 89 33             	mov    QWORD PTR [rbx],r14
  e950a4:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
  e950a8:	48 85 c0             	test   rax,rax
  e950ab:	74 05                	je     e950b2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c4c8>
  e950ad:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
  e950b2:	4c 8d 84 24 30 0a 00 	lea    r8,[rsp+0xa30]
  e950b9:	00 
  e950ba:	66 0f 6f 44 24 70    	movdqa xmm0,XMMWORD PTR [rsp+0x70]
  e950c0:	f3 41 0f 7f 40 10    	movdqu XMMWORD PTR [r8+0x10],xmm0
  e950c6:	f0 48 ff 45 00       	lock inc QWORD PTR [rbp+0x0]
  e950cb:	48 8d 35 80 4f f6 ff 	lea    rsi,[rip+0xfffffffffff64f80]        # dfa052 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc70d8>
  e950d2:	48 8d 15 ad 4f f6 ff 	lea    rdx,[rip+0xfffffffffff64fad]        # dfa086 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc710c>
  e950d9:	48 8d 0d 74 4b 00 00 	lea    rcx,[rip+0x4b74]        # e99c54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6106a>
  e950e0:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]
  e950e7:	00 
  e950e8:	6a 20                	push   0x20
  e950ea:	41 59                	pop    r9
  e950ec:	48 89 df             	mov    rdi,rbx
  e950ef:	e8 a0 56 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e950f4:	49 8b 06             	mov    rax,QWORD PTR [r14]
  e950f7:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
  e950fe:	00 
  e950ff:	4c 89 f6             	mov    rsi,r14
  e95102:	48 89 da             	mov    rdx,rbx
  e95105:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
  e9510b:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
  e95110:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]
  e95115:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
  e9511c:	00 
  e9511d:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]
  e95124:	00 
  e95125:	e8 a4 43 00 00       	call   e994ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608e4>
  e9512a:	48 8b bc 24 58 10 00 	mov    rdi,QWORD PTR [rsp+0x1058]
  e95131:	00 
  e95132:	e8 4f 93 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e95137:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e9513e:	00 
  e9513f:	e8 a4 56 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e95144:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
  e9514b:	00 
  e9514c:	e8 73 57 f6 ff       	call   dfa8c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc794a>
  e95151:	49 8d bd f8 03 00 00 	lea    rdi,[r13+0x3f8]
  e95158:	48 8d 9c 24 10 0e 00 	lea    rbx,[rsp+0xe10]
  e9515f:	00 
  e95160:	48 89 de             	mov    rsi,rbx
  e95163:	e8 f6 44 00 00       	call   e9965e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60a74>
  e95168:	48 89 df             	mov    rdi,rbx
  e9516b:	e8 f4 79 c2 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
  e95170:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
  e95177:	00 
  e95178:	e8 09 93 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9517d:	4d 85 ff             	test   r15,r15
  e95180:	74 05                	je     e95187 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c59d>
  e95182:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
  e95187:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
  e9518c:	f0 48 ff 00          	lock inc QWORD PTR [rax]
  e95190:	49 8b 85 70 05 00 00 	mov    rax,QWORD PTR [r13+0x570]
  e95197:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
  e9519e:	00 
  e9519f:	bf 98 00 00 00       	mov    edi,0x98
  e951a4:	e8 57 8d 95 00       	call   17edf00 <_Znwm@plt>
  e951a9:	49 89 c6             	mov    r14,rax
  e951ac:	66 0f ef c0          	pxor   xmm0,xmm0
  e951b0:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e951b5:	48 8d 05 ac 82 96 00 	lea    rax,[rip+0x9682ac]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
  e951bc:	49 89 06             	mov    QWORD PTR [r14],rax
  e951bf:	4d 8d 66 18          	lea    r12,[r14+0x18]
  e951c3:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
  e951ca:	00 
  e951cb:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
  e951d0:	48 89 06             	mov    QWORD PTR [rsi],rax
  e951d3:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
  e951d8:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  e951dc:	4c 89 e7             	mov    rdi,r12
  e951df:	e8 34 2a 03 00       	call   ec7c18 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8f02e>
  e951e4:	48 8b bc 24 e8 0b 00 	mov    rdi,QWORD PTR [rsp+0xbe8]
  e951eb:	00 
  e951ec:	e8 95 92 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e951f1:	31 ff                	xor    edi,edi
  e951f3:	e8 24 92 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e951f8:	bf f0 00 00 00       	mov    edi,0xf0
  e951fd:	4c 89 b4 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],r14
  e95204:	00 
  e95205:	e8 f6 8c 95 00       	call   17edf00 <_Znwm@plt>
  e9520a:	48 89 c3             	mov    rbx,rax
  e9520d:	4c 89 f0             	mov    rax,r14
  e95210:	48 83 c0 08          	add    rax,0x8
  e95214:	66 0f ef c0          	pxor   xmm0,xmm0
  e95218:	f3 0f 7f 43 08       	movdqu XMMWORD PTR [rbx+0x8],xmm0
  e9521d:	48 8d 0d a4 c1 99 00 	lea    rcx,[rip+0x99c1a4]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
  e95224:	48 89 0b             	mov    QWORD PTR [rbx],rcx
  e95227:	f0 48 ff 00          	lock inc QWORD PTR [rax]
  e9522b:	48 8d 05 2e da 99 00 	lea    rax,[rip+0x99da2e]        # 1832c60 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4bf8>
  e95232:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  e95236:	48 c7 43 20 32 00 00 	mov    QWORD PTR [rbx+0x20],0x32
  e9523d:	00 
  e9523e:	0f 28 84 24 00 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x100]
  e95245:	00 
  e95246:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0
  e9524a:	4d 85 ff             	test   r15,r15
  e9524d:	74 05                	je     e95254 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c66a>
  e9524f:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
  e95254:	4c 89 a4 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r12
  e9525b:	00 
  e9525c:	4c 89 63 38          	mov    QWORD PTR [rbx+0x38],r12
  e95260:	4c 89 73 40          	mov    QWORD PTR [rbx+0x40],r14
  e95264:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
  e95269:	66 0f 6f 84 24 00 01 	movdqa xmm0,XMMWORD PTR [rsp+0x100]
  e95270:	00 00 
  e95272:	66 49 0f 7e c4       	movq   r12,xmm0
  e95277:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  e9527b:	4c 89 e7             	mov    rdi,r12
  e9527e:	48 89 5c 24 70       	mov    QWORD PTR [rsp+0x70],rbx
  e95283:	ff 10                	call   QWORD PTR [rax]
  e95285:	49 89 c5             	mov    r13,rax
  e95288:	4c 8d 7b 48          	lea    r15,[rbx+0x48]
  e9528c:	66 0f ef c0          	pxor   xmm0,xmm0
  e95290:	f3 41 0f 7f 47 20    	movdqu XMMWORD PTR [r15+0x20],xmm0
  e95296:	f3 41 0f 7f 47 10    	movdqu XMMWORD PTR [r15+0x10],xmm0
  e9529c:	f3 41 0f 7f 07       	movdqu XMMWORD PTR [r15],xmm0
  e952a1:	48 89 c7             	mov    rdi,rax
  e952a4:	e8 51 47 ff ff       	call   e899fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50e10>
  e952a9:	48 89 c5             	mov    rbp,rax
  e952ac:	49 89 d6             	mov    r14,rdx
  e952af:	4c 89 ef             	mov    rdi,r13
  e952b2:	e8 6b 47 ff ff       	call   e89a22 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50e38>
  e952b7:	49 89 d0             	mov    r8,rdx
  e952ba:	4c 89 ff             	mov    rdi,r15
  e952bd:	48 89 ee             	mov    rsi,rbp
  e952c0:	4c 89 f2             	mov    rdx,r14
  e952c3:	48 89 c1             	mov    rcx,rax
  e952c6:	e8 09 0c 03 00       	call   ec5ed4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d2ea>
  e952cb:	4c 8d 6b 18          	lea    r13,[rbx+0x18]
  e952cf:	4c 8b b4 24 88 00 00 	mov    r14,QWORD PTR [rsp+0x88]
  e952d6:	00 
  e952d7:	41 8a 6e 01          	mov    bpl,BYTE PTR [r14+0x1]
  e952db:	40 84 ed             	test   bpl,bpl
  e952de:	74 22                	je     e95302 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c718>
  e952e0:	48 8d 9c 24 d0 0f 00 	lea    rbx,[rsp+0xfd0]
  e952e7:	00 
  e952e8:	48 89 df             	mov    rdi,rbx
  e952eb:	e8 06 47 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  e952f0:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e952f7:	00 
  e952f8:	48 89 de             	mov    rsi,rbx
  e952fb:	e8 3e 47 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e95300:	eb 44                	jmp    e95346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c75c>
  e95302:	4c 8d 84 24 30 0a 00 	lea    r8,[rsp+0xa30]
  e95309:	00 
  e9530a:	4d 89 28             	mov    QWORD PTR [r8],r13
  e9530d:	48 8d 35 7d 7d c0 ff 	lea    rsi,[rip+0xffffffffffc07d7d]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
  e95314:	48 8d 0d 95 10 03 00 	lea    rcx,[rip+0x31095]        # ec63b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d7c6>
  e9531b:	48 8d 9c 24 d0 0f 00 	lea    rbx,[rsp+0xfd0]
  e95322:	00 
  e95323:	6a 08                	push   0x8
  e95325:	41 59                	pop    r9
  e95327:	48 89 df             	mov    rdi,rbx
  e9532a:	31 d2                	xor    edx,edx
  e9532c:	e8 63 54 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e95331:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  e95335:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e9533c:	00 
  e9533d:	4c 89 e6             	mov    rsi,r12
  e95340:	48 89 da             	mov    rdx,rbx
  e95343:	ff 50 08             	call   QWORD PTR [rax+0x8]
  e95346:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
  e9534b:	4c 8d 60 78          	lea    r12,[rax+0x78]
  e9534f:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]
  e95356:	00 
  e95357:	4c 89 e7             	mov    rdi,r12
  e9535a:	48 89 de             	mov    rsi,rbx
  e9535d:	e8 dc 46 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e95362:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  e95366:	e8 1b 91 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9536b:	40 84 ed             	test   bpl,bpl
  e9536e:	74 0f                	je     e9537f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c795>
  e95370:	48 8d bc 24 d0 0f 00 	lea    rdi,[rsp+0xfd0]
  e95377:	00 
  e95378:	e8 57 48 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  e9537d:	eb 0d                	jmp    e9538c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c7a2>
  e9537f:	48 8d bc 24 d0 0f 00 	lea    rdi,[rsp+0xfd0]
  e95386:	00 
  e95387:	e8 5c 54 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e9538c:	41 8a 6e 01          	mov    bpl,BYTE PTR [r14+0x1]
  e95390:	40 84 ed             	test   bpl,bpl
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
  e9548e:	e8 f3 8f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e95493:	ba c0 00 00 00       	mov    edx,0xc0
  e95498:	4c 89 ff             	mov    rdi,r15
  e9549b:	31 f6                	xor    esi,esi
  e9549d:	e8 ee 96 95 00       	call   17eeb90 <memset@plt>
  e954a2:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
  e954a7:	48 8b 81 90 04 00 00 	mov    rax,QWORD PTR [rcx+0x490]
  e954ae:	0f 10 81 88 04 00 00 	movups xmm0,XMMWORD PTR [rcx+0x488]
  e954b5:	0f 29 84 24 e0 0b 00 	movaps XMMWORD PTR [rsp+0xbe0],xmm0
  e954bc:	00 
  e954bd:	48 85 c0             	test   rax,rax
  e954c0:	74 05                	je     e954c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c8dd>
  e954c2:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e954c7:	48 8b 84 24 a8 03 00 	mov    rax,QWORD PTR [rsp+0x3a8]
  e954ce:	00 
  e954cf:	f3 0f 6f 84 24 a0 03 	movdqu xmm0,XMMWORD PTR [rsp+0x3a0]
  e954d6:	00 00 
  e954d8:	66 0f 7f 84 24 f0 0b 	movdqa XMMWORD PTR [rsp+0xbf0],xmm0
  e954df:	00 00 
  e954e1:	48 85 c0             	test   rax,rax
  e954e4:	48 8b 5c 24 48       	mov    rbx,QWORD PTR [rsp+0x48]
  e954e9:	74 05                	je     e954f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c906>
  e954eb:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e954f0:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
  e954f7:	00 
  e954f8:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
  e954ff:	00 
  e95500:	6a 02                	push   0x2
  e95502:	5a                   	pop    rdx
  e95503:	e8 d6 97 c3 ff       	call   acecde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bc7e>
  e95508:	f3 0f 7e 84 24 f8 00 	movq   xmm0,QWORD PTR [rsp+0xf8]
  e9550f:	00 00 
  e95511:	66 49 0f 6e ce       	movq   xmm1,r14
  e95516:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e9551a:	66 0f 7f 8c 24 c0 00 	movdqa XMMWORD PTR [rsp+0xc0],xmm1
  e95521:	00 00 
  e95523:	66 48 0f 6e c3       	movq   xmm0,rbx
  e95528:	f3 0f 7e 4c 24 20    	movq   xmm1,QWORD PTR [rsp+0x20]
  e9552e:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e95532:	66 0f 7f 8c 24 d0 00 	movdqa XMMWORD PTR [rsp+0xd0],xmm1
  e95539:	00 00 
  e9553b:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
  e95540:	66 48 0f 6e c0       	movq   xmm0,rax
  e95545:	66 49 0f 6e cd       	movq   xmm1,r13
  e9554a:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e9554e:	66 0f 7f 8c 24 50 02 	movdqa XMMWORD PTR [rsp+0x250],xmm1
  e95555:	00 00 
  e95557:	48 8b 8c 24 90 00 00 	mov    rcx,QWORD PTR [rsp+0x90]
  e9555e:	00 
  e9555f:	48 83 c1 08          	add    rcx,0x8
  e95563:	48 89 8c 24 f8 01 00 	mov    QWORD PTR [rsp+0x1f8],rcx
  e9556a:	00 
  e9556b:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
  e95570:	49 8d 8c 24 38 01 00 	lea    rcx,[r12+0x138]
  e95577:	00 
  e95578:	48 89 8c 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rcx
  e9557f:	00 
  e95580:	49 8d ac 24 c8 00 00 	lea    rbp,[r12+0xc8]
  e95587:	00 
  e95588:	49 89 c5             	mov    r13,rax
  e9558b:	49 83 c5 08          	add    r13,0x8
  e9558f:	48 8d 9c 24 10 0e 00 	lea    rbx,[rsp+0xe10]
  e95596:	00 
  e95597:	4c 8d b4 24 30 0a 00 	lea    r14,[rsp+0xa30]
  e9559e:	00 
  e9559f:	48 89 df             	mov    rdi,rbx
  e955a2:	4c 89 f6             	mov    rsi,r14
  e955a5:	e8 0a a9 83 00       	call   16cfeb4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84020>
  e955aa:	49 8d bf a0 00 00 00 	lea    rdi,[r15+0xa0]
  e955b1:	48 89 de             	mov    rsi,rbx
  e955b4:	e8 63 42 c2 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  e955b9:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  e955bd:	e8 c4 8e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e955c2:	4c 89 f7             	mov    rdi,r14
  e955c5:	e8 7e f2 c1 ff       	call   ab4848 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17e8>
  e955ca:	6a 20                	push   0x20
  e955cc:	5b                   	pop    rbx
  e955cd:	48 8b bc 1c d8 0b 00 	mov    rdi,QWORD PTR [rsp+rbx*1+0xbd8]
  e955d4:	00 
  e955d5:	e8 ac 8e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e955da:	48 83 c3 f0          	add    rbx,0xfffffffffffffff0
  e955de:	75 ed                	jne    e955cd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c9e3>
  e955e0:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
  e955e5:	f0 48 ff 00          	lock inc QWORD PTR [rax]
  e955e9:	49 8b bf 98 00 00 00 	mov    rdi,QWORD PTR [r15+0x98]
  e955f0:	66 0f 6f 84 24 c0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xc0]
  e955f7:	00 00 
  e955f9:	f3 41 0f 7f 87 90 00 	movdqu XMMWORD PTR [r15+0x90],xmm0
  e95600:	00 00 
  e95602:	e8 7f 8e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e95607:	49 8b b4 24 b8 03 00 	mov    rsi,QWORD PTR [r12+0x3b8]
  e9560e:	00 
  e9560f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e95612:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
  e95619:	00 
  e9561a:	ff 50 10             	call   QWORD PTR [rax+0x10]
  e9561d:	4d 8b b4 24 e8 00 00 	mov    r14,QWORD PTR [r12+0xe8]
  e95624:	00 
  e95625:	bf 00 01 00 00       	mov    edi,0x100
  e9562a:	e8 d1 88 95 00       	call   17edf00 <_Znwm@plt>
  e9562f:	49 89 c4             	mov    r12,rax
  e95632:	48 89 ac 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rbp
  e95639:	00 
  e9563a:	4c 89 ac 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],r13
  e95641:	00 
  e95642:	66 0f ef c9          	pxor   xmm1,xmm1
  e95646:	f3 0f 7f 48 08       	movdqu XMMWORD PTR [rax+0x8],xmm1
  e9564b:	48 8d 05 16 7e 96 00 	lea    rax,[rip+0x967e16]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
  e95652:	49 89 04 24          	mov    QWORD PTR [r12],rax
  e95656:	66 0f 6f 84 24 10 0e 	movdqa xmm0,XMMWORD PTR [rsp+0xe10]
  e9565d:	00 00 
  e9565f:	66 0f 7f 8c 24 10 0e 	movdqa XMMWORD PTR [rsp+0xe10],xmm1
  e95666:	00 00 
  e95668:	48 8d 05 99 d4 99 00 	lea    rax,[rip+0x99d499]        # 1832b08 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4aa0>
  e9566f:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
  e95674:	f3 41 0f 7f 44 24 20 	movdqu XMMWORD PTR [r12+0x20],xmm0
  e9567b:	4d 89 74 24 30       	mov    QWORD PTR [r12+0x30],r14
  e95680:	48 8d 35 3d b7 4d ff 	lea    rsi,[rip+0xffffffffff4db73d]        # 370dc4 <_ZTSSt12bad_any_cast@@Base-0x1f404>
  e95687:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e9568e:	00 
  e9568f:	e8 ea 43 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  e95694:	4d 8d 7c 24 18       	lea    r15,[r12+0x18]
  e95699:	49 8d 5c 24 38       	lea    rbx,[r12+0x38]
  e9569e:	4c 8d ac 24 e0 0b 00 	lea    r13,[rsp+0xbe0]
  e956a5:	00 
  e956a6:	48 89 df             	mov    rdi,rbx
  e956a9:	4c 89 f6             	mov    rsi,r14
  e956ac:	4c 89 ea             	mov    rdx,r13
  e956af:	e8 66 c0 92 00       	call   17c171a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175886>
  e956b4:	4c 89 ef             	mov    rdi,r13
  e956b7:	e8 d4 87 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e956bc:	49 8d 44 24 48       	lea    rax,[r12+0x48]
  e956c1:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  e956c8:	00 
  e956c9:	66 0f ef c0          	pxor   xmm0,xmm0
  e956cd:	f3 41 0f 7f 44 24 58 	movdqu XMMWORD PTR [r12+0x58],xmm0
  e956d4:	f3 41 0f 7f 44 24 48 	movdqu XMMWORD PTR [r12+0x48],xmm0
  e956db:	bd 00 00 80 3f       	mov    ebp,0x3f800000
  e956e0:	41 89 6c 24 68       	mov    DWORD PTR [r12+0x68],ebp
  e956e5:	49 8d 7c 24 70       	lea    rdi,[r12+0x70]
  e956ea:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
  e956ef:	e8 02 43 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  e956f4:	49 8d bc 24 80 00 00 	lea    rdi,[r12+0x80]
  e956fb:	00 
  e956fc:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
  e95703:	00 
  e95704:	e8 85 2b c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
  e95709:	4d 89 e6             	mov    r14,r12
  e9570c:	49 81 c6 d8 00 00 00 	add    r14,0xd8
  e95713:	66 0f ef c0          	pxor   xmm0,xmm0
  e95717:	f3 41 0f 7f 84 24 e8 	movdqu XMMWORD PTR [r12+0xe8],xmm0
  e9571e:	00 00 00 
  e95721:	f3 41 0f 7f 84 24 d8 	movdqu XMMWORD PTR [r12+0xd8],xmm0
  e95728:	00 00 00 
  e9572b:	41 89 ac 24 f8 00 00 	mov    DWORD PTR [r12+0xf8],ebp
  e95732:	00 
  e95733:	48 8d 05 de c4 5b ff 	lea    rax,[rip+0xffffffffff5bc4de]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
  e9573a:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
  e95741:	00 
  e95742:	48 89 06             	mov    QWORD PTR [rsi],rax
  e95745:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  e95749:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
  e9574e:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15
  e95752:	48 8d 05 0b 6d be ff 	lea    rax,[rip+0xffffffffffbe6d0b]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
  e95759:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
  e9575d:	48 8d 05 ce d5 02 00 	lea    rax,[rip+0x2d5ce]        # ec2d32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a148>
  e95764:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
  e95768:	4c 8d ac 24 e0 0b 00 	lea    r13,[rsp+0xbe0]
  e9576f:	00 
  e95770:	b9 60 ea 00 00       	mov    ecx,0xea60
  e95775:	48 89 5c 24 58       	mov    QWORD PTR [rsp+0x58],rbx
  e9577a:	48 89 df             	mov    rdi,rbx
  e9577d:	4c 89 fb             	mov    rbx,r15
  e95780:	4c 89 ea             	mov    rdx,r13
  e95783:	e8 fc c0 92 00       	call   17c1884 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1759f0>
  e95788:	4c 89 ef             	mov    rdi,r13
  e9578b:	e8 0e 1b c1 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  e95790:	4d 8b 6c 24 20       	mov    r13,QWORD PTR [r12+0x20]
  e95795:	4c 8d 84 24 50 10 00 	lea    r8,[rsp+0x1050]
  e9579c:	00 
  e9579d:	4d 89 38             	mov    QWORD PTR [r8],r15
  e957a0:	48 8d 35 ea 78 c0 ff 	lea    rsi,[rip+0xffffffffffc078ea]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
  e957a7:	48 8d 0d 8c d5 02 00 	lea    rcx,[rip+0x2d58c]        # ec2d3a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a150>
  e957ae:	48 8d ac 24 e0 0b 00 	lea    rbp,[rsp+0xbe0]
  e957b5:	00 
  e957b6:	6a 08                	push   0x8
  e957b8:	41 59                	pop    r9
  e957ba:	48 89 ef             	mov    rdi,rbp
  e957bd:	31 d2                	xor    edx,edx
  e957bf:	e8 d0 4f 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e957c4:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e957c8:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
  e957cf:	00 
  e957d0:	4c 89 ee             	mov    rsi,r13
  e957d3:	48 89 ea             	mov    rdx,rbp
  e957d6:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e957d9:	4c 8d b4 24 30 0a 00 	lea    r14,[rsp+0xa30]
  e957e0:	00 
  e957e1:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
  e957e6:	4c 89 f6             	mov    rsi,r14
  e957e9:	e8 04 44 94 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
  e957ee:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
  e957f2:	e8 8f 8c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e957f7:	4c 8d ac 24 e0 0b 00 	lea    r13,[rsp+0xbe0]
  e957fe:	00 
  e957ff:	4c 89 ef             	mov    rdi,r13
  e95802:	e8 e1 4f 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e95807:	31 ff                	xor    edi,edi
  e95809:	e8 78 8c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9580e:	31 ff                	xor    edi,edi
  e95810:	e8 07 8c c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e95815:	6a 58                	push   0x58
  e95817:	5f                   	pop    rdi
  e95818:	e8 e3 86 95 00       	call   17edf00 <_Znwm@plt>
  e9581d:	49 89 c7             	mov    r15,rax
  e95820:	66 0f ef c0          	pxor   xmm0,xmm0
  e95824:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e95829:	48 8d 05 38 7c 96 00 	lea    rax,[rip+0x967c38]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
  e95830:	49 89 07             	mov    QWORD PTR [r15],rax
  e95833:	48 8d 05 86 e3 9a 00 	lea    rax,[rip+0x9ae386]        # 1843bc0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2a8>
  e9583a:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
  e9583e:	49 89 5f 20          	mov    QWORD PTR [r15+0x20],rbx
  e95842:	4d 89 67 28          	mov    QWORD PTR [r15+0x28],r12
  e95846:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
  e9584c:	49 8d 7f 30          	lea    rdi,[r15+0x30]
  e95850:	48 8d 35 e9 4b 4e ff 	lea    rsi,[rip+0xffffffffff4e4be9]        # 37a440 <_ZTSSt12bad_any_cast@@Base-0x15d88>
  e95857:	6a 08                	push   0x8
  e95859:	5a                   	pop    rdx
  e9585a:	e8 bb 71 c0 ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
  e9585f:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
  e95864:	4c 8b 35 35 c2 a1 00 	mov    r14,QWORD PTR [rip+0xa1c235]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
  e9586b:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
  e95870:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
  e95874:	66 0f 6f 01          	movdqa xmm0,XMMWORD PTR [rcx]
  e95878:	f3 41 0f 7f 47 48    	movdqu XMMWORD PTR [r15+0x48],xmm0
  e9587e:	48 85 c0             	test   rax,rax
  e95881:	74 05                	je     e95888 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5cc9e>
  e95883:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e95888:	4c 89 e7             	mov    rdi,r12
  e9588b:	e8 f6 8b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e95890:	31 ff                	xor    edi,edi
  e95892:	e8 85 8b c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e95897:	31 ff                	xor    edi,edi
  e95899:	e8 e8 8b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9589e:	48 8b bc 24 18 0e 00 	mov    rdi,QWORD PTR [rsp+0xe18]
  e958a5:	00 
  e958a6:	e8 db 8b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e958ab:	48 8d b3 30 02 00 00 	lea    rsi,[rbx+0x230]
  e958b2:	48 8d bc 24 f0 02 00 	lea    rdi,[rsp+0x2f0]
  e958b9:	00 
  e958ba:	4c 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r15
  e958c1:	00 
  e958c2:	e8 f7 63 c3 ff       	call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>
  e958c7:	6a 50                	push   0x50
  e958c9:	5f                   	pop    rdi
  e958ca:	e8 31 86 95 00       	call   17edf00 <_Znwm@plt>
  e958cf:	48 89 c5             	mov    rbp,rax
  e958d2:	66 0f ef c0          	pxor   xmm0,xmm0
  e958d6:	f3 0f 7f 45 08       	movdqu XMMWORD PTR [rbp+0x8],xmm0
  e958db:	48 8d 05 46 ba 96 00 	lea    rax,[rip+0x96ba46]        # 1801328 <_ZTIN4asio22service_already_existsE@@Base+0x2b10>
  e958e2:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
  e958e6:	48 89 6c 24 58       	mov    QWORD PTR [rsp+0x58],rbp
  e958eb:	48 83 65 40 00       	and    QWORD PTR [rbp+0x40],0x0
  e958f0:	4c 89 f8             	mov    rax,r15
  e958f3:	48 83 c0 18          	add    rax,0x18
  e958f7:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
  e958fa:	48 89 8c 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rcx
  e95901:	00 
  e95902:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
  e95906:	48 89 8c 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rcx
  e9590d:	00 
  e9590e:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
  e95912:	48 89 8c 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rcx
  e95919:	00 
  e9591a:	48 8b 8b d8 00 00 00 	mov    rcx,QWORD PTR [rbx+0xd8]
  e95921:	48 89 8c 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rcx
  e95928:	00 
  e95929:	48 8b 8b e0 00 00 00 	mov    rcx,QWORD PTR [rbx+0xe0]
  e95930:	48 89 8c 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rcx
  e95937:	00 
  e95938:	4c 8b 63 20          	mov    r12,QWORD PTR [rbx+0x20]
  e9593c:	48 8b 4b 28          	mov    rcx,QWORD PTR [rbx+0x28]
  e95940:	48 89 8c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rcx
  e95947:	00 
  e95948:	48 8b 4b 40          	mov    rcx,QWORD PTR [rbx+0x40]
  e9594c:	48 89 8c 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rcx
  e95953:	00 
  e95954:	48 89 84 24 30 0a 00 	mov    QWORD PTR [rsp+0xa30],rax
  e9595b:	00 
  e9595c:	4c 89 bc 24 38 0a 00 	mov    QWORD PTR [rsp+0xa38],r15
  e95963:	00 
  e95964:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
  e95969:	66 0f 6f 84 24 d0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xd0]
  e95970:	00 00 
  e95972:	66 0f 7f 84 24 50 10 	movdqa XMMWORD PTR [rsp+0x1050],xmm0
  e95979:	00 00 
  e9597b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
  e95980:	f0 48 ff 00          	lock inc QWORD PTR [rax]
  e95984:	48 8b 83 78 05 00 00 	mov    rax,QWORD PTR [rbx+0x578]
  e9598b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  e95990:	48 8d 05 49 8f 97 00 	lea    rax,[rip+0x978f49]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
  e95997:	48 89 84 24 e0 0b 00 	mov    QWORD PTR [rsp+0xbe0],rax
  e9599e:	00 
  e9599f:	4c 89 b4 24 e8 0b 00 	mov    QWORD PTR [rsp+0xbe8],r14
  e959a6:	00 
  e959a7:	4c 89 ac 24 00 0c 00 	mov    QWORD PTR [rsp+0xc00],r13
  e959ae:	00 
  e959af:	4c 8b b3 98 03 00 00 	mov    r14,QWORD PTR [rbx+0x398]
  e959b6:	4c 8b ab a0 03 00 00 	mov    r13,QWORD PTR [rbx+0x3a0]
  e959bd:	48 8b 83 a8 03 00 00 	mov    rax,QWORD PTR [rbx+0x3a8]
  e959c4:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
  e959cb:	00 
  e959cc:	48 8b 83 b0 03 00 00 	mov    rax,QWORD PTR [rbx+0x3b0]
  e959d3:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
  e959da:	00 
  e959db:	48 8b 83 e8 00 00 00 	mov    rax,QWORD PTR [rbx+0xe8]
  e959e2:	48 89 84 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rax
  e959e9:	00 
  e959ea:	48 8d bc 24 e0 0d 00 	lea    rdi,[rsp+0xde0]
  e959f1:	00 
  e959f2:	48 8d b4 24 f0 0e 00 	lea    rsi,[rsp+0xef0]
  e959f9:	00 
  e959fa:	e8 91 48 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e959ff:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
  e95a06:	00 
  e95a07:	48 8d b4 24 c0 0e 00 	lea    rsi,[rsp+0xec0]
  e95a0e:	00 
  e95a0f:	e8 7c 48 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e95a14:	48 8b 83 b0 02 00 00 	mov    rax,QWORD PTR [rbx+0x2b0]
  e95a1b:	48 89 84 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rax
  e95a22:	00 
  e95a23:	48 8b b4 24 f0 02 00 	mov    rsi,QWORD PTR [rsp+0x2f0]
  e95a2a:	00 
  e95a2b:	48 8b 94 24 f8 02 00 	mov    rdx,QWORD PTR [rsp+0x2f8]
  e95a32:	00 
  e95a33:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
  e95a3a:	00 
  e95a3b:	e8 de 49 7d 00       	call   166a41e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e58a>
  e95a40:	48 8d 4d 20          	lea    rcx,[rbp+0x20]
  e95a44:	48 8b 83 40 02 00 00 	mov    rax,QWORD PTR [rbx+0x240]
  e95a4b:	0f 10 83 38 02 00 00 	movups xmm0,XMMWORD PTR [rbx+0x238]
  e95a52:	0f 29 84 24 e0 02 00 	movaps XMMWORD PTR [rsp+0x2e0],xmm0
  e95a59:	00 
  e95a5a:	48 85 c0             	test   rax,rax
  e95a5d:	74 05                	je     e95a64 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ce7a>
  e95a5f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e95a64:	66 48 0f 6e cd       	movq   xmm1,rbp
  e95a69:	66 48 0f 6e c1       	movq   xmm0,rcx
  e95a6e:	48 8b 83 18 04 00 00 	mov    rax,QWORD PTR [rbx+0x418]
  e95a75:	48 89 84 24 30 02 00 	mov    QWORD PTR [rsp+0x230],rax
  e95a7c:	00 
  e95a7d:	48 8b 83 28 04 00 00 	mov    rax,QWORD PTR [rbx+0x428]
  e95a84:	48 89 84 24 28 02 00 	mov    QWORD PTR [rsp+0x228],rax
  e95a8b:	00 
  e95a8c:	48 8b 43 48          	mov    rax,QWORD PTR [rbx+0x48]
  e95a90:	48 89 84 24 20 02 00 	mov    QWORD PTR [rsp+0x220],rax
  e95a97:	00 
  e95a98:	48 8b 83 40 04 00 00 	mov    rax,QWORD PTR [rbx+0x440]
  e95a9f:	48 89 84 24 18 02 00 	mov    QWORD PTR [rsp+0x218],rax
  e95aa6:	00 
  e95aa7:	0f 57 d2             	xorps  xmm2,xmm2
  e95aaa:	80 bc 24 e8 00 00 00 	cmp    BYTE PTR [rsp+0xe8],0x0
  e95ab1:	00 
  e95ab2:	74 18                	je     e95acc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5cee2>
  e95ab4:	0f 10 93 58 04 00 00 	movups xmm2,XMMWORD PTR [rbx+0x458]
  e95abb:	48 8b 83 60 04 00 00 	mov    rax,QWORD PTR [rbx+0x460]
  e95ac2:	48 85 c0             	test   rax,rax
  e95ac5:	74 05                	je     e95acc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5cee2>
  e95ac7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e95acc:	4c 89 ac 24 48 02 00 	mov    QWORD PTR [rsp+0x248],r13
  e95ad3:	00 
  e95ad4:	4c 89 b4 24 20 01 00 	mov    QWORD PTR [rsp+0x120],r14
  e95adb:	00 
  e95adc:	0f 29 94 24 c0 01 00 	movaps XMMWORD PTR [rsp+0x1c0],xmm2
  e95ae3:	00 
  e95ae4:	4c 89 a4 24 28 01 00 	mov    QWORD PTR [rsp+0x128],r12
  e95aeb:	00 
  e95aec:	48 89 8c 24 f0 01 00 	mov    QWORD PTR [rsp+0x1f0],rcx
  e95af3:	00 
  e95af4:	48 83 c5 08          	add    rbp,0x8
  e95af8:	66 0f 6c c1          	punpcklqdq xmm0,xmm1
  e95afc:	48 8d b3 b0 01 00 00 	lea    rsi,[rbx+0x1b0]
  e95b03:	48 8d 43 30          	lea    rax,[rbx+0x30]
  e95b07:	48 89 84 24 40 02 00 	mov    QWORD PTR [rsp+0x240],rax
  e95b0e:	00 
  e95b0f:	48 8d 83 80 00 00 00 	lea    rax,[rbx+0x80]
  e95b16:	48 89 84 24 38 02 00 	mov    QWORD PTR [rsp+0x238],rax
  e95b1d:	00 
  e95b1e:	48 8d 83 50 02 00 00 	lea    rax,[rbx+0x250]
  e95b25:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e95b2a:	48 8d 83 50 03 00 00 	lea    rax,[rbx+0x350]
  e95b31:	48 89 84 24 10 02 00 	mov    QWORD PTR [rsp+0x210],rax
  e95b38:	00 
  e95b39:	48 8d 83 d0 03 00 00 	lea    rax,[rbx+0x3d0]
  e95b40:	48 89 84 24 08 02 00 	mov    QWORD PTR [rsp+0x208],rax
  e95b47:	00 
  e95b48:	48 8d 83 30 04 00 00 	lea    rax,[rbx+0x430]
  e95b4f:	48 89 84 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rax
  e95b56:	00 
  e95b57:	48 8d 83 48 04 00 00 	lea    rax,[rbx+0x448]
  e95b5e:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
  e95b65:	00 
  e95b66:	4c 8b 94 24 90 03 00 	mov    r10,QWORD PTR [rsp+0x390]
  e95b6d:	00 
  e95b6e:	4c 8b 9b b8 03 00 00 	mov    r11,QWORD PTR [rbx+0x3b8]
  e95b75:	48 89 d8             	mov    rax,rbx
  e95b78:	4c 8b ab 98 04 00 00 	mov    r13,QWORD PTR [rbx+0x498]
  e95b7f:	48 8b 9b a0 04 00 00 	mov    rbx,QWORD PTR [rbx+0x4a0]
  e95b86:	4c 8b b0 68 05 00 00 	mov    r14,QWORD PTR [rax+0x568]
  e95b8d:	4c 8b a0 70 05 00 00 	mov    r12,QWORD PTR [rax+0x570]
  e95b94:	48 8b 88 88 05 00 00 	mov    rcx,QWORD PTR [rax+0x588]
  e95b9b:	66 0f 6f 88 80 05 00 	movdqa xmm1,XMMWORD PTR [rax+0x580]
  e95ba2:	00 
  e95ba3:	66 0f 7f 8c 24 d0 02 	movdqa XMMWORD PTR [rsp+0x2d0],xmm1
  e95baa:	00 00 
  e95bac:	4c 8d b8 b8 04 00 00 	lea    r15,[rax+0x4b8]
  e95bb3:	48 85 c9             	test   rcx,rcx
  e95bb6:	74 05                	je     e95bbd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5cfd3>
  e95bb8:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  e95bbd:	48 8d 84 24 c0 02 00 	lea    rax,[rsp+0x2c0]
  e95bc4:	00 
  e95bc5:	66 0f 7f 00          	movdqa XMMWORD PTR [rax],xmm0
  e95bc9:	f0 48 ff 45 00       	lock inc QWORD PTR [rbp+0x0]

## Focus: e953f0..e95540 around known pair read
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
  e9548e:	e8 f3 8f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e95493:	ba c0 00 00 00       	mov    edx,0xc0
  e95498:	4c 89 ff             	mov    rdi,r15
  e9549b:	31 f6                	xor    esi,esi
  e9549d:	e8 ee 96 95 00       	call   17eeb90 <memset@plt>
  e954a2:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
  e954a7:	48 8b 81 90 04 00 00 	mov    rax,QWORD PTR [rcx+0x490]
  e954ae:	0f 10 81 88 04 00 00 	movups xmm0,XMMWORD PTR [rcx+0x488]
  e954b5:	0f 29 84 24 e0 0b 00 	movaps XMMWORD PTR [rsp+0xbe0],xmm0
  e954bc:	00 
  e954bd:	48 85 c0             	test   rax,rax
  e954c0:	74 05                	je     e954c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c8dd>
  e954c2:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e954c7:	48 8b 84 24 a8 03 00 	mov    rax,QWORD PTR [rsp+0x3a8]
  e954ce:	00 
  e954cf:	f3 0f 6f 84 24 a0 03 	movdqu xmm0,XMMWORD PTR [rsp+0x3a0]
  e954d6:	00 00 
  e954d8:	66 0f 7f 84 24 f0 0b 	movdqa XMMWORD PTR [rsp+0xbf0],xmm0
  e954df:	00 00 
  e954e1:	48 85 c0             	test   rax,rax
  e954e4:	48 8b 5c 24 48       	mov    rbx,QWORD PTR [rsp+0x48]
  e954e9:	74 05                	je     e954f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c906>
  e954eb:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e954f0:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
  e954f7:	00 
  e954f8:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
  e954ff:	00 
  e95500:	6a 02                	push   0x2
  e95502:	5a                   	pop    rdx
  e95503:	e8 d6 97 c3 ff       	call   acecde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bc7e>
  e95508:	f3 0f 7e 84 24 f8 00 	movq   xmm0,QWORD PTR [rsp+0xf8]
  e9550f:	00 00 
  e95511:	66 49 0f 6e ce       	movq   xmm1,r14
  e95516:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e9551a:	66 0f 7f 8c 24 c0 00 	movdqa XMMWORD PTR [rsp+0xc0],xmm1
  e95521:	00 00 
  e95523:	66 48 0f 6e c3       	movq   xmm0,rbx
  e95528:	f3 0f 7e 4c 24 20    	movq   xmm1,QWORD PTR [rsp+0x20]
  e9552e:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e95532:	66 0f 7f 8c 24 d0 00 	movdqa XMMWORD PTR [rsp+0xd0],xmm1
  e95539:	00 00 
  e9553b:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]

## Calls where immediately prior instructions form/pass rsp+0x3a0 address
## Backslice direct pair stores
## High-address/vptr materializations near final producer region
### 0xe94769: lea    rdx,[rip+0x9e3cc8]        # 1878438 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x34b20>
      e9474e:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e94755:	00 
      e94756:	e8 0f 58 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9475b:	49 8b 85 28 04 00 00 	mov    rax,QWORD PTR [r13+0x428]
      e94762:	49 8b 8d 98 05 00 00 	mov    rcx,QWORD PTR [r13+0x598]
      e94769:	48 8d 15 c8 3c 9e 00 	lea    rdx,[rip+0x9e3cc8]        # 1878438 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x34b20>
      e94770:	48 8d b4 24 c0 0e 00 	lea    rsi,[rsp+0xec0]
      e94777:	00 
      e94778:	48 89 16             	mov    QWORD PTR [rsi],rdx
      e9477b:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      e9477f:	48 89 4e 10          	mov    QWORD PTR [rsi+0x10],rcx
      e94783:	48 89 76 20          	mov    QWORD PTR [rsi+0x20],rsi
      e94787:	49 8b b5 b8 03 00 00 	mov    rsi,QWORD PTR [r13+0x3b8]
      e9478e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e94791:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e94798:	00 

### 0xe947c1: lea    rax,[rip+0x99d2a8]        # 1831a70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a08>
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
      e947e8:	66 0f 7f 84 24 30 0a 	movdqa XMMWORD PTR [rsp+0xa30],xmm0
      e947ef:	00 00 
      e947f1:	4c 8d 73 30          	lea    r14,[rbx+0x30]

### 0xe947cf: lea    rax,[rip+0x99e412]        # 1832be8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4b80>
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
      e947e8:	66 0f 7f 84 24 30 0a 	movdqa XMMWORD PTR [rsp+0xa30],xmm0
      e947ef:	00 00 
      e947f1:	4c 8d 73 30          	lea    r14,[rbx+0x30]
      e947f5:	4c 89 73 30          	mov    QWORD PTR [rbx+0x30],r14
      e947f9:	4c 89 73 38          	mov    QWORD PTR [rbx+0x38],r14
      e947fd:	f3 0f 7f 43 40       	movdqu XMMWORD PTR [rbx+0x40],xmm0

### 0xe94910: lea    rax,[rip+0x99d159]        # 1831a70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a08>
      e948fe:	5f                   	pop    rdi
      e948ff:	e8 fc 95 95 00       	call   17edf00 <_Znwm@plt>
      e94904:	49 89 c6             	mov    r14,rax
      e94907:	66 0f ef c0          	pxor   xmm0,xmm0
      e9490b:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e94910:	48 8d 05 59 d1 99 00 	lea    rax,[rip+0x99d159]        # 1831a70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a08>
      e94917:	49 89 06             	mov    QWORD PTR [r14],rax
      e9491a:	48 8d 05 d7 f2 9a 00 	lea    rax,[rip+0x9af2d7]        # 1843bf8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e0>
      e94921:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      e94925:	4d 89 66 20          	mov    QWORD PTR [r14+0x20],r12
      e94929:	49 89 5e 28          	mov    QWORD PTR [r14+0x28],rbx
      e9492d:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e94932:	49 8d 7e 30          	lea    rdi,[r14+0x30]
      e94936:	48 8d 35 12 37 49 ff 	lea    rsi,[rip+0xffffffffff493712]        # 32804f <_ZTSSt12bad_any_cast@@Base-0x68179>
      e9493d:	6a 0a                	push   0xa
      e9493f:	5a                   	pop    rdx

### 0xe9491a: lea    rax,[rip+0x9af2d7]        # 1843bf8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e0>
      e94904:	49 89 c6             	mov    r14,rax
      e94907:	66 0f ef c0          	pxor   xmm0,xmm0
      e9490b:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e94910:	48 8d 05 59 d1 99 00 	lea    rax,[rip+0x99d159]        # 1831a70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a08>
      e94917:	49 89 06             	mov    QWORD PTR [r14],rax
      e9491a:	48 8d 05 d7 f2 9a 00 	lea    rax,[rip+0x9af2d7]        # 1843bf8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e0>
      e94921:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      e94925:	4d 89 66 20          	mov    QWORD PTR [r14+0x20],r12
      e94929:	49 89 5e 28          	mov    QWORD PTR [r14+0x28],rbx
      e9492d:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e94932:	49 8d 7e 30          	lea    rdi,[r14+0x30]
      e94936:	48 8d 35 12 37 49 ff 	lea    rsi,[rip+0xffffffffff493712]        # 32804f <_ZTSSt12bad_any_cast@@Base-0x68179>
      e9493d:	6a 0a                	push   0xa
      e9493f:	5a                   	pop    rdx
      e94940:	e8 d5 80 c0 ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
      e94945:	49 8d 8d 70 04 00 00 	lea    rcx,[r13+0x470]

### 0xe949ae: lea    rax,[rip+0x9afa5b]        # 1844410 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xaf8>
      e94996:	4c 89 74 24 48       	mov    QWORD PTR [rsp+0x48],r14
      e9499b:	e8 60 95 95 00       	call   17edf00 <_Znwm@plt>
      e949a0:	49 89 c4             	mov    r12,rax
      e949a3:	66 0f ef c0          	pxor   xmm0,xmm0
      e949a7:	f3 41 0f 7f 44 24 08 	movdqu XMMWORD PTR [r12+0x8],xmm0
      e949ae:	48 8d 05 5b fa 9a 00 	lea    rax,[rip+0x9afa5b]        # 1844410 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xaf8>
      e949b5:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e949b9:	48 8d 05 88 fa 9a 00 	lea    rax,[rip+0x9afa88]        # 1844448 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xb30>
      e949c0:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
      e949c5:	f3 41 0f 7f 44 24 20 	movdqu XMMWORD PTR [r12+0x20],xmm0
      e949cc:	4c 89 a4 24 18 01 00 	mov    QWORD PTR [rsp+0x118],r12
      e949d3:	00 
      e949d4:	49 89 5c 24 30       	mov    QWORD PTR [r12+0x30],rbx
      e949d9:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
      e949dd:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      e949e0:	66 0f 7f 84 24 20 03 	movdqa XMMWORD PTR [rsp+0x320],xmm0

### 0xe949b9: lea    rax,[rip+0x9afa88]        # 1844448 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xb30>
      e949a0:	49 89 c4             	mov    r12,rax
      e949a3:	66 0f ef c0          	pxor   xmm0,xmm0
      e949a7:	f3 41 0f 7f 44 24 08 	movdqu XMMWORD PTR [r12+0x8],xmm0
      e949ae:	48 8d 05 5b fa 9a 00 	lea    rax,[rip+0x9afa5b]        # 1844410 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xaf8>
      e949b5:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e949b9:	48 8d 05 88 fa 9a 00 	lea    rax,[rip+0x9afa88]        # 1844448 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xb30>
      e949c0:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
      e949c5:	f3 41 0f 7f 44 24 20 	movdqu XMMWORD PTR [r12+0x20],xmm0
      e949cc:	4c 89 a4 24 18 01 00 	mov    QWORD PTR [rsp+0x118],r12
      e949d3:	00 
      e949d4:	49 89 5c 24 30       	mov    QWORD PTR [r12+0x30],rbx
      e949d9:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
      e949dd:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      e949e0:	66 0f 7f 84 24 20 03 	movdqa XMMWORD PTR [rsp+0x320],xmm0
      e949e7:	00 00 
      e949e9:	66 0f 7f 84 24 00 03 	movdqa XMMWORD PTR [rsp+0x300],xmm0

### 0xe94a47: lea    rdx,[rip+0x9afbf2]        # 1844640 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xd28>
      e94a31:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e94a36:	48 8d 0d 2b 8a 96 00 	lea    rcx,[rip+0x968a2b]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e94a3d:	48 89 08             	mov    QWORD PTR [rax],rcx
      e94a40:	48 89 c1             	mov    rcx,rax
      e94a43:	48 83 c1 18          	add    rcx,0x18
      e94a47:	48 8d 15 f2 fb 9a 00 	lea    rdx,[rip+0x9afbf2]        # 1844640 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xd28>
      e94a4e:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      e94a52:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
      e94a56:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
      e94a5d:	00 
      e94a5e:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      e94a61:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      e94a65:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
      e94a6c:	00 
      e94a6d:	e8 3c 50 00 00       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e94a72:	48 8b bc 24 e8 0b 00 	mov    rdi,QWORD PTR [rsp+0xbe8]

### 0xe94abc: lea    rdx,[rip+0x9afcad]        # 1844770 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xe58>
      e94aa6:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e94aab:	48 8d 0d b6 89 96 00 	lea    rcx,[rip+0x9689b6]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e94ab2:	48 89 08             	mov    QWORD PTR [rax],rcx
      e94ab5:	48 89 c1             	mov    rcx,rax
      e94ab8:	48 83 c1 18          	add    rcx,0x18
      e94abc:	48 8d 15 ad fc 9a 00 	lea    rdx,[rip+0x9afcad]        # 1844770 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xe58>
      e94ac3:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      e94ac7:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
      e94acb:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
      e94ad2:	00 
      e94ad3:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      e94ad6:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      e94ada:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
      e94ae1:	00 
      e94ae2:	e8 c7 4f 00 00       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e94ae7:	48 8b bc 24 e8 0b 00 	mov    rdi,QWORD PTR [rsp+0xbe8]

### 0xe94b50: lea    rdx,[rip+0x9afb49]        # 18446a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xd88>
      e94b3a:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e94b3f:	48 8d 0d 22 89 96 00 	lea    rcx,[rip+0x968922]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e94b46:	48 89 08             	mov    QWORD PTR [rax],rcx
      e94b49:	48 89 c1             	mov    rcx,rax
      e94b4c:	48 83 c1 18          	add    rcx,0x18
      e94b50:	48 8d 15 49 fb 9a 00 	lea    rdx,[rip+0x9afb49]        # 18446a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xd88>
      e94b57:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      e94b5b:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
      e94b5f:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14
      e94b63:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
      e94b6a:	00 
      e94b6b:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      e94b6e:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      e94b72:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
      e94b79:	00 
      e94b7a:	e8 2f 4f 00 00       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>

### 0xe94c0c: lea    rdx,[rip+0x9afab5]        # 18446c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xdb0>
      e94bf7:	48 83 a4 24 10 03 00 	and    QWORD PTR [rsp+0x310],0x0
      e94bfe:	00 00 
      e94c00:	48 89 10             	mov    QWORD PTR [rax],rdx
      e94c03:	66 0f 7f 84 24 00 03 	movdqa XMMWORD PTR [rsp+0x300],xmm0
      e94c0a:	00 00 
      e94c0c:	48 8d 15 b5 fa 9a 00 	lea    rdx,[rip+0x9afab5]        # 18446c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xdb0>
      e94c13:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      e94c17:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
      e94c1b:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14
      e94c1f:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx
      e94c23:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
      e94c2a:	00 
      e94c2b:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
      e94c30:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
      e94c35:	49 89 c4             	mov    r12,rax
      e94c38:	4c 89 f7             	mov    rdi,r14

### 0xe94c48: lea    rbp,[rip+0x979c91]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e94c35:	49 89 c4             	mov    r12,rax
      e94c38:	4c 89 f7             	mov    rdi,r14
      e94c3b:	e8 e2 8e c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e94c40:	48 8d 84 24 90 0e 00 	lea    rax,[rsp+0xe90]
      e94c47:	00 
      e94c48:	48 8d 2d 91 9c 97 00 	lea    rbp,[rip+0x979c91]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e94c4f:	48 89 28             	mov    QWORD PTR [rax],rbp
      e94c52:	4c 8b 2d 47 ce a1 00 	mov    r13,QWORD PTR [rip+0xa1ce47]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e94c59:	4c 89 68 08          	mov    QWORD PTR [rax+0x8],r13
      e94c5d:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e94c61:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e94c66:	48 8b 80 e8 00 00 00 	mov    rax,QWORD PTR [rax+0xe8]
      e94c6d:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      e94c72:	bf 90 00 00 00       	mov    edi,0x90
      e94c77:	4c 89 a4 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],r12
      e94c7e:	00 

### 0xe94c52: mov    r13,QWORD PTR [rip+0xa1ce47]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e94c3b:	e8 e2 8e c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e94c40:	48 8d 84 24 90 0e 00 	lea    rax,[rsp+0xe90]
      e94c47:	00 
      e94c48:	48 8d 2d 91 9c 97 00 	lea    rbp,[rip+0x979c91]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e94c4f:	48 89 28             	mov    QWORD PTR [rax],rbp
      e94c52:	4c 8b 2d 47 ce a1 00 	mov    r13,QWORD PTR [rip+0xa1ce47]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e94c59:	4c 89 68 08          	mov    QWORD PTR [rax+0x8],r13
      e94c5d:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e94c61:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e94c66:	48 8b 80 e8 00 00 00 	mov    rax,QWORD PTR [rax+0xe8]
      e94c6d:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      e94c72:	bf 90 00 00 00       	mov    edi,0x90
      e94c77:	4c 89 a4 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],r12
      e94c7e:	00 
      e94c7f:	e8 7c 92 95 00       	call   17edf00 <_Znwm@plt>
      e94c84:	48 89 c3             	mov    rbx,rax

### 0xe94d04: lea    rcx,[rip+0x9afa8d]        # 1844798 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xe80>
      e94cf0:	bf 00 01 00 00       	mov    edi,0x100
      e94cf5:	e8 06 92 95 00       	call   17edf00 <_Znwm@plt>
      e94cfa:	49 89 c7             	mov    r15,rax
      e94cfd:	4c 89 e0             	mov    rax,r12
      e94d00:	48 83 c0 18          	add    rax,0x18
      e94d04:	48 8d 0d 8d fa 9a 00 	lea    rcx,[rip+0x9afa8d]        # 1844798 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xe80>
      e94d0b:	49 89 0f             	mov    QWORD PTR [r15],rcx
      e94d0e:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
      e94d12:	4d 89 67 10          	mov    QWORD PTR [r15+0x10],r12
      e94d16:	66 0f ef c0          	pxor   xmm0,xmm0
      e94d1a:	f3 41 0f 7f 47 18    	movdqu XMMWORD PTR [r15+0x18],xmm0
      e94d20:	f3 41 0f 7f 47 28    	movdqu XMMWORD PTR [r15+0x28],xmm0
      e94d26:	49 83 67 38 00       	and    QWORD PTR [r15+0x38],0x0
      e94d2b:	4c 89 f8             	mov    rax,r15
      e94d2e:	48 83 c0 40          	add    rax,0x40
      e94d32:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax

### 0xe94e58: lea    rax,[rip+0x9af9b9]        # 1844818 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf00>
      e94e42:	bf 50 01 00 00       	mov    edi,0x150
      e94e47:	e8 b4 90 95 00       	call   17edf00 <_Znwm@plt>
      e94e4c:	49 89 c4             	mov    r12,rax
      e94e4f:	66 0f ef c0          	pxor   xmm0,xmm0
      e94e53:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e94e58:	48 8d 05 b9 f9 9a 00 	lea    rax,[rip+0x9af9b9]        # 1844818 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf00>
      e94e5f:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e94e63:	4c 8d ac 24 10 0e 00 	lea    r13,[rsp+0xe10]
      e94e6a:	00 
      e94e6b:	48 8d b4 24 90 0e 00 	lea    rsi,[rsp+0xe90]
      e94e72:	00 
      e94e73:	4c 89 ef             	mov    rdi,r13
      e94e76:	e8 75 30 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e94e7b:	48 8d 05 ce f9 9a 00 	lea    rax,[rip+0x9af9ce]        # 1844850 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf38>
      e94e82:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
      e94e87:	48 b8 00 00 00 00 00 	movabs rax,0x3ff0000000000000

### 0xe94e7b: lea    rax,[rip+0x9af9ce]        # 1844850 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf38>
      e94e6a:	00 
      e94e6b:	48 8d b4 24 90 0e 00 	lea    rsi,[rsp+0xe90]
      e94e72:	00 
      e94e73:	4c 89 ef             	mov    rdi,r13
      e94e76:	e8 75 30 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e94e7b:	48 8d 05 ce f9 9a 00 	lea    rax,[rip+0x9af9ce]        # 1844850 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf38>
      e94e82:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
      e94e87:	48 b8 00 00 00 00 00 	movabs rax,0x3ff0000000000000
      e94e8e:	00 f0 3f 
      e94e91:	49 89 44 24 28       	mov    QWORD PTR [r12+0x28],rax
      e94e96:	31 c0                	xor    eax,eax
      e94e98:	41 88 44 24 30       	mov    BYTE PTR [r12+0x30],al
      e94e9d:	41 88 44 24 40       	mov    BYTE PTR [r12+0x40],al
      e94ea2:	49 83 64 24 58 00    	and    QWORD PTR [r12+0x58],0x0
      e94ea8:	66 0f ef c0          	pxor   xmm0,xmm0
      e94eac:	f3 41 0f 7f 44 24 48 	movdqu XMMWORD PTR [r12+0x48],xmm0

### 0xe94f99: lea    rax,[rip+0x9af8f0]        # 1844890 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf78>
      e94f88:	00 
      e94f89:	41 89 ac 24 4c 01 00 	mov    DWORD PTR [r12+0x14c],ebp
      e94f90:	00 
      e94f91:	49 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [r12+0xb0]
      e94f98:	00 
      e94f99:	48 8d 05 f0 f8 9a 00 	lea    rax,[rip+0x9af8f0]        # 1844890 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf78>
      e94fa0:	48 89 84 24 e0 0b 00 	mov    QWORD PTR [rsp+0xbe0],rax
      e94fa7:	00 
      e94fa8:	4c 89 ac 24 e8 0b 00 	mov    QWORD PTR [rsp+0xbe8],r13
      e94faf:	00 
      e94fb0:	4c 89 b4 24 00 0c 00 	mov    QWORD PTR [rsp+0xc00],r14
      e94fb7:	00 
      e94fb8:	48 83 c7 20          	add    rdi,0x20
      e94fbc:	4c 89 f6             	mov    rsi,r14
      e94fbf:	e8 3a 3b 17 00       	call   1008afe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cff14>
      e94fc4:	4c 89 f7             	mov    rdi,r14

### 0xe94fd4: lea    rax,[rip+0x9af8fd]        # 18448d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xfc0>
      e94fbf:	e8 3a 3b 17 00       	call   1008afe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cff14>
      e94fc4:	4c 89 f7             	mov    rdi,r14
      e94fc7:	e8 9e 4f be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e94fcc:	49 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [r12+0xb8]
      e94fd3:	00 
      e94fd4:	48 8d 05 fd f8 9a 00 	lea    rax,[rip+0x9af8fd]        # 18448d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xfc0>
      e94fdb:	48 89 84 24 30 0a 00 	mov    QWORD PTR [rsp+0xa30],rax
      e94fe2:	00 
      e94fe3:	4c 89 ac 24 38 0a 00 	mov    QWORD PTR [rsp+0xa38],r13
      e94fea:	00 
      e94feb:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
      e94ff2:	00 
      e94ff3:	48 89 b4 24 50 0a 00 	mov    QWORD PTR [rsp+0xa50],rsi
      e94ffa:	00 
      e94ffb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e94ffe:	ff 50 20             	call   QWORD PTR [rax+0x20]

### 0xe9521d: lea    rcx,[rip+0x99c1a4]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
      e9520a:	48 89 c3             	mov    rbx,rax
      e9520d:	4c 89 f0             	mov    rax,r14
      e95210:	48 83 c0 08          	add    rax,0x8
      e95214:	66 0f ef c0          	pxor   xmm0,xmm0
      e95218:	f3 0f 7f 43 08       	movdqu XMMWORD PTR [rbx+0x8],xmm0
      e9521d:	48 8d 0d a4 c1 99 00 	lea    rcx,[rip+0x99c1a4]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
      e95224:	48 89 0b             	mov    QWORD PTR [rbx],rcx
      e95227:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e9522b:	48 8d 05 2e da 99 00 	lea    rax,[rip+0x99da2e]        # 1832c60 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4bf8>
      e95232:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      e95236:	48 c7 43 20 32 00 00 	mov    QWORD PTR [rbx+0x20],0x32
      e9523d:	00 
      e9523e:	0f 28 84 24 00 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x100]
      e95245:	00 
      e95246:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0
      e9524a:	4d 85 ff             	test   r15,r15

### 0xe9522b: lea    rax,[rip+0x99da2e]        # 1832c60 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4bf8>
      e95214:	66 0f ef c0          	pxor   xmm0,xmm0
      e95218:	f3 0f 7f 43 08       	movdqu XMMWORD PTR [rbx+0x8],xmm0
      e9521d:	48 8d 0d a4 c1 99 00 	lea    rcx,[rip+0x99c1a4]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
      e95224:	48 89 0b             	mov    QWORD PTR [rbx],rcx
      e95227:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e9522b:	48 8d 05 2e da 99 00 	lea    rax,[rip+0x99da2e]        # 1832c60 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4bf8>
      e95232:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      e95236:	48 c7 43 20 32 00 00 	mov    QWORD PTR [rbx+0x20],0x32
      e9523d:	00 
      e9523e:	0f 28 84 24 00 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x100]
      e95245:	00 
      e95246:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0
      e9524a:	4d 85 ff             	test   r15,r15
      e9524d:	74 05                	je     e95254 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c66a>
      e9524f:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e95254:	4c 89 a4 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r12

### 0xe95668: lea    rax,[rip+0x99d499]        # 1832b08 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4aa0>
      e95652:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e95656:	66 0f 6f 84 24 10 0e 	movdqa xmm0,XMMWORD PTR [rsp+0xe10]
      e9565d:	00 00 
      e9565f:	66 0f 7f 8c 24 10 0e 	movdqa XMMWORD PTR [rsp+0xe10],xmm1
      e95666:	00 00 
      e95668:	48 8d 05 99 d4 99 00 	lea    rax,[rip+0x99d499]        # 1832b08 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4aa0>
      e9566f:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
      e95674:	f3 41 0f 7f 44 24 20 	movdqu XMMWORD PTR [r12+0x20],xmm0
      e9567b:	4d 89 74 24 30       	mov    QWORD PTR [r12+0x30],r14
      e95680:	48 8d 35 3d b7 4d ff 	lea    rsi,[rip+0xffffffffff4db73d]        # 370dc4 <_ZTSSt12bad_any_cast@@Base-0x1f404>
      e95687:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e9568e:	00 
      e9568f:	e8 ea 43 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e95694:	4d 8d 7c 24 18       	lea    r15,[r12+0x18]
      e95699:	49 8d 5c 24 38       	lea    rbx,[r12+0x38]
      e9569e:	4c 8d ac 24 e0 0b 00 	lea    r13,[rsp+0xbe0]

### 0xe95833: lea    rax,[rip+0x9ae386]        # 1843bc0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2a8>
      e9581d:	49 89 c7             	mov    r15,rax
      e95820:	66 0f ef c0          	pxor   xmm0,xmm0
      e95824:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e95829:	48 8d 05 38 7c 96 00 	lea    rax,[rip+0x967c38]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e95830:	49 89 07             	mov    QWORD PTR [r15],rax
      e95833:	48 8d 05 86 e3 9a 00 	lea    rax,[rip+0x9ae386]        # 1843bc0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2a8>
      e9583a:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      e9583e:	49 89 5f 20          	mov    QWORD PTR [r15+0x20],rbx
      e95842:	4d 89 67 28          	mov    QWORD PTR [r15+0x28],r12
      e95846:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      e9584c:	49 8d 7f 30          	lea    rdi,[r15+0x30]
      e95850:	48 8d 35 e9 4b 4e ff 	lea    rsi,[rip+0xffffffffff4e4be9]        # 37a440 <_ZTSSt12bad_any_cast@@Base-0x15d88>
      e95857:	6a 08                	push   0x8
      e95859:	5a                   	pop    rdx
      e9585a:	e8 bb 71 c0 ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
      e9585f:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]

### 0xe95864: mov    r14,QWORD PTR [rip+0xa1c235]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e95850:	48 8d 35 e9 4b 4e ff 	lea    rsi,[rip+0xffffffffff4e4be9]        # 37a440 <_ZTSSt12bad_any_cast@@Base-0x15d88>
      e95857:	6a 08                	push   0x8
      e95859:	5a                   	pop    rdx
      e9585a:	e8 bb 71 c0 ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
      e9585f:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      e95864:	4c 8b 35 35 c2 a1 00 	mov    r14,QWORD PTR [rip+0xa1c235]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e9586b:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      e95870:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e95874:	66 0f 6f 01          	movdqa xmm0,XMMWORD PTR [rcx]
      e95878:	f3 41 0f 7f 47 48    	movdqu XMMWORD PTR [r15+0x48],xmm0
      e9587e:	48 85 c0             	test   rax,rax
      e95881:	74 05                	je     e95888 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5cc9e>
      e95883:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e95888:	4c 89 e7             	mov    rdi,r12
      e9588b:	e8 f6 8b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95890:	31 ff                	xor    edi,edi

### 0xe958db: lea    rax,[rip+0x96ba46]        # 1801328 <_ZTIN4asio22service_already_existsE@@Base+0x2b10>
      e958c9:	5f                   	pop    rdi
      e958ca:	e8 31 86 95 00       	call   17edf00 <_Znwm@plt>
      e958cf:	48 89 c5             	mov    rbp,rax
      e958d2:	66 0f ef c0          	pxor   xmm0,xmm0
      e958d6:	f3 0f 7f 45 08       	movdqu XMMWORD PTR [rbp+0x8],xmm0
      e958db:	48 8d 05 46 ba 96 00 	lea    rax,[rip+0x96ba46]        # 1801328 <_ZTIN4asio22service_already_existsE@@Base+0x2b10>
      e958e2:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
      e958e6:	48 89 6c 24 58       	mov    QWORD PTR [rsp+0x58],rbp
      e958eb:	48 83 65 40 00       	and    QWORD PTR [rbp+0x40],0x0
      e958f0:	4c 89 f8             	mov    rax,r15
      e958f3:	48 83 c0 18          	add    rax,0x18
      e958f7:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
      e958fa:	48 89 8c 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rcx
      e95901:	00 
      e95902:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      e95906:	48 89 8c 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rcx

### 0xe95990: lea    rax,[rip+0x978f49]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e95979:	00 00 
      e9597b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e95980:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e95984:	48 8b 83 78 05 00 00 	mov    rax,QWORD PTR [rbx+0x578]
      e9598b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      e95990:	48 8d 05 49 8f 97 00 	lea    rax,[rip+0x978f49]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e95997:	48 89 84 24 e0 0b 00 	mov    QWORD PTR [rsp+0xbe0],rax
      e9599e:	00 
      e9599f:	4c 89 b4 24 e8 0b 00 	mov    QWORD PTR [rsp+0xbe8],r14
      e959a6:	00 
      e959a7:	4c 89 ac 24 00 0c 00 	mov    QWORD PTR [rsp+0xc00],r13
      e959ae:	00 
      e959af:	4c 8b b3 98 03 00 00 	mov    r14,QWORD PTR [rbx+0x398]
      e959b6:	4c 8b ab a0 03 00 00 	mov    r13,QWORD PTR [rbx+0x3a0]
      e959bd:	48 8b 83 a8 03 00 00 	mov    rax,QWORD PTR [rbx+0x3a8]
      e959c4:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax

