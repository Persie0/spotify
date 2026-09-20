# ContextPlayer native constructor / layout trace

Function range: 0x109917a..0x1099d71

This is the constructor path that initializes members at +0x418, +0x470, +0x4c8 and then calls ContextPlayer init 0x10a1440.

## Object identity anchors

     10997ea:	41 0f 11 85 08 04 00 	movups XMMWORD PTR [r13+0x408],xmm0
     10997f2:	49 8d 9d 18 04 00 00 	lea    rbx,[r13+0x418]
     10997fc:	e8 8d ea a8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1099801:	4d 8d b5 70 04 00 00 	lea    r14,[r13+0x470]
     109980b:	e8 7e ea a8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1099810:	4d 8d bd c8 04 00 00 	lea    r15,[r13+0x4c8]
     109981a:	e8 0b bf ac ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     1099822:	e8 19 7c 00 00       	call   10a1440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268856>

## Full constructor disassembly

     109917a:	55                   	push   rbp
     109917b:	41 57                	push   r15
     109917d:	41 56                	push   r14
     109917f:	41 55                	push   r13
     1099181:	41 54                	push   r12
     1099183:	53                   	push   rbx
     1099184:	48 81 ec 68 02 00 00 	sub    rsp,0x268
     109918b:	49 89 cc             	mov    r12,rcx
     109918e:	49 89 d6             	mov    r14,rdx
     1099191:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
     1099198:	00 
     1099199:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10991a0:	00 00 
     10991a2:	48 89 84 24 60 02 00 	mov    QWORD PTR [rsp+0x260],rax
     10991a9:	00 
     10991aa:	48 89 cf             	mov    rdi,rcx
     10991ad:	e8 3a 57 df ff       	call   e8e8ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55d02>
     10991b2:	48 89 c5             	mov    rbp,rax
     10991b5:	4c 89 e7             	mov    rdi,r12
     10991b8:	e8 df e2 c1 ff       	call   cb749c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20443c>
     10991bd:	49 89 c5             	mov    r13,rax
     10991c0:	49 8b 5e 68          	mov    rbx,QWORD PTR [r14+0x68]
     10991c4:	4c 89 e7             	mov    rdi,r12
     10991c7:	e8 c8 ed ae ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
     10991cc:	4c 89 e7             	mov    rdi,r12
     10991cf:	e8 cc a0 ac ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
     10991d4:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     10991d9:	4c 89 e7             	mov    rdi,r12
     10991dc:	e8 19 86 b7 ff       	call   c117fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e79a>
     10991e1:	49 89 c7             	mov    r15,rax
     10991e4:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
     10991e8:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     10991ef:	00 
     10991f0:	49 8b 76 58          	mov    rsi,QWORD PTR [r14+0x58]
     10991f4:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     10991f7:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
     10991fe:	00 
     10991ff:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1099202:	49 8b 46 60          	mov    rax,QWORD PTR [r14+0x60]
     1099206:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     109920d:	00 
     109920e:	49 8b 86 80 00 00 00 	mov    rax,QWORD PTR [r14+0x80]
     1099215:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     109921a:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     109921e:	48 89 ef             	mov    rdi,rbp
     1099221:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1099224:	48 89 c5             	mov    rbp,rax
     1099227:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     109922b:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     1099232:	00 
     1099233:	4c 89 ee             	mov    rsi,r13
     1099236:	ff 50 30             	call   QWORD PTR [rax+0x30]
     1099239:	0f 28 84 24 b0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xb0]
     1099240:	00 
     1099241:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     1099246:	4c 8b ac 24 b8 00 00 	mov    r13,QWORD PTR [rsp+0xb8]
     109924d:	00 
     109924e:	4d 85 ed             	test   r13,r13
     1099251:	74 05                	je     1099258 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26066e>
     1099253:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]
     1099258:	4c 89 e7             	mov    rdi,r12
     109925b:	e8 f0 85 b7 ff       	call   c11850 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e7f0>
     1099260:	49 89 c4             	mov    r12,rax
     1099263:	6a 30                	push   0x30
     1099265:	5f                   	pop    rdi
     1099266:	e8 95 4c 75 00       	call   17edf00 <_Znwm@plt>
     109926b:	48 8d 15 be 23 7b 00 	lea    rdx,[rip+0x7b23be]        # 184b630 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7d18>
     1099272:	48 8d 8c 24 a0 01 00 	lea    rcx,[rsp+0x1a0]
     1099279:	00 
     109927a:	48 89 11             	mov    QWORD PTR [rcx],rdx
     109927d:	48 89 69 08          	mov    QWORD PTR [rcx+0x8],rbp
     1099281:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     1099285:	48 8d 15 ec 23 7b 00 	lea    rdx,[rip+0x7b23ec]        # 184b678 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7d60>
     109928c:	48 8d 8c 24 70 01 00 	lea    rcx,[rsp+0x170]
     1099293:	00 
     1099294:	48 89 11             	mov    QWORD PTR [rcx],rdx
     1099297:	0f 28 44 24 30       	movaps xmm0,XMMWORD PTR [rsp+0x30]
     109929c:	0f 11 41 08          	movups XMMWORD PTR [rcx+0x8],xmm0
     10992a0:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     10992a4:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     10992a8:	48 8d 0d 11 24 7b 00 	lea    rcx,[rip+0x7b2411]        # 184b6c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7da8>
     10992af:	48 89 08             	mov    QWORD PTR [rax],rcx
     10992b2:	48 8d 48 10          	lea    rcx,[rax+0x10]
     10992b6:	48 89 4c 24 30       	mov    QWORD PTR [rsp+0x30],rcx
     10992bb:	48 8d 48 18          	lea    rcx,[rax+0x18]
     10992bf:	48 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],rcx
     10992c4:	48 89 c7             	mov    rdi,rax
     10992c7:	48 83 c7 20          	add    rdi,0x20
     10992cb:	0f 57 c0             	xorps  xmm0,xmm0
     10992ce:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     10992d3:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
     10992d7:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
     10992dc:	e8 15 07 74 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     10992e1:	41 0f 10 86 d8 00 00 	movups xmm0,XMMWORD PTR [r14+0xd8]
     10992e8:	00 
     10992e9:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
     10992f0:	00 
     10992f1:	e8 19 86 b7 ff       	call   c1190f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e8af>
     10992f6:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     10992fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10992fe:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1099301:	48 89 c5             	mov    rbp,rax
     1099304:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1099307:	4c 89 ff             	mov    rdi,r15
     109930a:	ff 50 28             	call   QWORD PTR [rax+0x28]
     109930d:	4c 8b 70 10          	mov    r14,QWORD PTR [rax+0x10]
     1099311:	48 8d 35 40 a8 2e ff 	lea    rsi,[rip+0xffffffffff2ea840]        # 383b58 <_ZTSSt12bad_any_cast@@Base-0xc670>
     1099318:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     109931f:	00 
     1099320:	e8 59 07 9e ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1099325:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1099328:	48 8d bc 24 08 01 00 	lea    rdi,[rsp+0x108]
     109932f:	00 
     1099330:	48 8d 94 24 f0 00 00 	lea    rdx,[rsp+0xf0]
     1099337:	00 
     1099338:	48 89 de             	mov    rsi,rbx
     109933b:	ff 50 18             	call   QWORD PTR [rax+0x18]
     109933e:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     1099342:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
     1099349:	00 
     109934a:	4c 89 e6             	mov    rsi,r12
     109934d:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1099350:	bf e0 04 00 00       	mov    edi,0x4e0
     1099355:	e8 a6 4b 75 00       	call   17edf00 <_Znwm@plt>
     109935a:	49 89 c5             	mov    r13,rax
     109935d:	48 8d 05 fc 2f 7b 00 	lea    rax,[rip+0x7b2ffc]        # 184c360 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8a48>
     1099364:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     1099368:	4d 8d 7d 08          	lea    r15,[r13+0x8]
     109936c:	48 8d b4 24 c8 00 00 	lea    rsi,[rsp+0xc8]
     1099373:	00 
     1099374:	4c 89 ff             	mov    rdi,r15
     1099377:	e8 c4 4b 75 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     109937c:	49 8d 5d 20          	lea    rbx,[r13+0x20]
     1099380:	48 8d b4 24 d0 01 00 	lea    rsi,[rsp+0x1d0]
     1099387:	00 
     1099388:	48 89 df             	mov    rdi,rbx
     109938b:	4c 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r15
     1099392:	00 
     1099393:	e8 f8 0e 9e ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     1099398:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     109939d:	49 89 45 50          	mov    QWORD PTR [r13+0x50],rax
     10993a1:	48 89 ac 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rbp
     10993a8:	00 
     10993a9:	49 89 6d 58          	mov    QWORD PTR [r13+0x58],rbp
     10993ad:	49 8d 7d 60          	lea    rdi,[r13+0x60]
     10993b1:	48 8b b4 24 08 01 00 	mov    rsi,QWORD PTR [rsp+0x108]
     10993b8:	00 
     10993b9:	e8 e8 04 55 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
     10993be:	48 8b 84 24 e8 00 00 	mov    rax,QWORD PTR [rsp+0xe8]
     10993c5:	00 
     10993c6:	0f 28 84 24 e0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xe0]
     10993cd:	00 
     10993ce:	41 0f 29 45 70       	movaps XMMWORD PTR [r13+0x70],xmm0
     10993d3:	48 85 c0             	test   rax,rax
     10993d6:	74 05                	je     10993dd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2607f3>
     10993d8:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     10993dd:	48 89 5c 24 78       	mov    QWORD PTR [rsp+0x78],rbx
     10993e2:	49 8d bd 80 00 00 00 	lea    rdi,[r13+0x80]
     10993e9:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
     10993ee:	31 f6                	xor    esi,esi
     10993f0:	e8 f1 e3 54 00       	call   15e77e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cd6a>
     10993f5:	49 8d bd f8 01 00 00 	lea    rdi,[r13+0x1f8]
     10993fc:	6a 01                	push   0x1
     10993fe:	5e                   	pop    rsi
     10993ff:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
     1099404:	e8 dd e3 54 00       	call   15e77e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cd6a>
     1099409:	bf c0 01 00 00       	mov    edi,0x1c0
     109940e:	e8 ed 4a 75 00       	call   17edf00 <_Znwm@plt>
     1099413:	48 89 c5             	mov    rbp,rax
     1099416:	48 8d 05 bb 2f 7b 00 	lea    rax,[rip+0x7b2fbb]        # 184c3d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8ac0>
     109941d:	48 8d 9c 24 30 02 00 	lea    rbx,[rsp+0x230]
     1099424:	00 
     1099425:	48 89 03             	mov    QWORD PTR [rbx],rax
     1099428:	4c 89 6b 08          	mov    QWORD PTR [rbx+0x8],r13
     109942c:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx
     1099430:	48 8d 05 e9 2f 7b 00 	lea    rax,[rip+0x7b2fe9]        # 184c420 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8b08>
     1099437:	48 8d 8c 24 00 02 00 	lea    rcx,[rsp+0x200]
     109943e:	00 
     109943f:	48 89 01             	mov    QWORD PTR [rcx],rax
     1099442:	4c 89 69 08          	mov    QWORD PTR [rcx+0x8],r13
     1099446:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     109944a:	4c 89 75 00          	mov    QWORD PTR [rbp+0x0],r14
     109944e:	4c 8d 75 10          	lea    r14,[rbp+0x10]
     1099452:	48 8d b4 24 a0 01 00 	lea    rsi,[rsp+0x1a0]
     1099459:	00 
     109945a:	4c 89 f7             	mov    rdi,r14
     109945d:	e8 2e 0e 9e ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     1099462:	48 8d 7d 40          	lea    rdi,[rbp+0x40]
     1099466:	48 8d b4 24 70 01 00 	lea    rsi,[rsp+0x170]
     109946d:	00 
     109946e:	48 89 7c 24 58       	mov    QWORD PTR [rsp+0x58],rdi
     1099473:	4c 89 74 24 60       	mov    QWORD PTR [rsp+0x60],r14
     1099478:	e8 13 0e 9e ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     109947d:	48 8d 75 70          	lea    rsi,[rbp+0x70]
     1099481:	48 8b 84 24 50 02 00 	mov    rax,QWORD PTR [rsp+0x250]
     1099488:	00 
     1099489:	48 85 c0             	test   rax,rax
     109948c:	4c 89 a4 24 88 00 00 	mov    QWORD PTR [rsp+0x88],r12
     1099493:	00 
     1099494:	48 89 74 24 50       	mov    QWORD PTR [rsp+0x50],rsi
     1099499:	74 16                	je     10994b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2608c7>
     109949b:	48 39 d8             	cmp    rax,rbx
     109949e:	74 1e                	je     10994be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2608d4>
     10994a0:	48 8d 8c 24 50 02 00 	lea    rcx,[rsp+0x250]
     10994a7:	00 
     10994a8:	48 89 85 90 00 00 00 	mov    QWORD PTR [rbp+0x90],rax
     10994af:	eb 07                	jmp    10994b8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2608ce>
     10994b1:	48 8d 8d 90 00 00 00 	lea    rcx,[rbp+0x90]
     10994b8:	48 83 21 00          	and    QWORD PTR [rcx],0x0
     10994bc:	eb 15                	jmp    10994d3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2608e9>
     10994be:	48 89 b5 90 00 00 00 	mov    QWORD PTR [rbp+0x90],rsi
     10994c5:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     10994cc:	00 
     10994cd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10994d0:	ff 50 18             	call   QWORD PTR [rax+0x18]
     10994d3:	48 8d bd a0 00 00 00 	lea    rdi,[rbp+0xa0]
     10994da:	48 8d b4 24 00 02 00 	lea    rsi,[rsp+0x200]
     10994e1:	00 
     10994e2:	48 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],rdi
     10994e7:	e8 1a 05 bd ff       	call   c69a06 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b69a6>
     10994ec:	4c 8d a5 d0 00 00 00 	lea    r12,[rbp+0xd0]
     10994f3:	4c 89 e7             	mov    rdi,r12
     10994f6:	e8 fb 04 74 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     10994fb:	4c 8d bd e0 00 00 00 	lea    r15,[rbp+0xe0]
     1099502:	4c 89 ff             	mov    rdi,r15
     1099505:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     109950a:	e8 b3 81 72 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     109950f:	83 a5 48 01 00 00 00 	and    DWORD PTR [rbp+0x148],0x0
     1099516:	48 8d 85 68 01 00 00 	lea    rax,[rbp+0x168]
     109951d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     1099522:	83 a5 a0 01 00 00 00 	and    DWORD PTR [rbp+0x1a0],0x0
     1099529:	0f 57 c0             	xorps  xmm0,xmm0
     109952c:	0f 11 85 68 01 00 00 	movups XMMWORD PTR [rbp+0x168],xmm0
     1099533:	0f 11 85 78 01 00 00 	movups XMMWORD PTR [rbp+0x178],xmm0
     109953a:	0f 11 85 88 01 00 00 	movups XMMWORD PTR [rbp+0x188],xmm0
     1099541:	0f 29 85 f0 00 00 00 	movaps XMMWORD PTR [rbp+0xf0],xmm0
     1099548:	0f 29 85 00 01 00 00 	movaps XMMWORD PTR [rbp+0x100],xmm0
     109954f:	0f 29 85 10 01 00 00 	movaps XMMWORD PTR [rbp+0x110],xmm0
     1099556:	0f 29 85 20 01 00 00 	movaps XMMWORD PTR [rbp+0x120],xmm0
     109955d:	0f 29 85 30 01 00 00 	movaps XMMWORD PTR [rbp+0x130],xmm0
     1099564:	48 8b 5d 00          	mov    rbx,QWORD PTR [rbp+0x0]
     1099568:	4c 8d 84 24 18 01 00 	lea    r8,[rsp+0x118]
     109956f:	00 
     1099570:	49 89 28             	mov    QWORD PTR [r8],rbp
     1099573:	48 8d 35 17 3b a0 ff 	lea    rsi,[rip+0xffffffffffa03b17]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     109957a:	48 8d 0d 91 a9 00 00 	lea    rcx,[rip+0xa991]        # 10a3f12 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b328>
     1099581:	4c 8d b4 24 30 01 00 	lea    r14,[rsp+0x130]
     1099588:	00 
     1099589:	6a 08                	push   0x8
     109958b:	41 59                	pop    r9
     109958d:	4c 89 f7             	mov    rdi,r14
     1099590:	31 d2                	xor    edx,edx
     1099592:	e8 fd 11 74 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     1099597:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     109959a:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
     10995a1:	00 
     10995a2:	48 89 de             	mov    rsi,rbx
     10995a5:	4c 89 f2             	mov    rdx,r14
     10995a8:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
     10995ae:	48 8d 9c 24 20 01 00 	lea    rbx,[rsp+0x120]
     10995b5:	00 
     10995b6:	4c 89 e7             	mov    rdi,r12
     10995b9:	48 89 de             	mov    rsi,rbx
     10995bc:	e8 31 06 74 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     10995c1:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     10995c5:	e8 bc 4e a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10995ca:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     10995d1:	00 
     10995d2:	e8 11 12 74 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     10995d7:	49 89 ad 70 03 00 00 	mov    QWORD PTR [r13+0x370],rbp
     10995de:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     10995e5:	00 
     10995e6:	e8 7f 09 9e ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     10995eb:	4c 8d b4 24 30 02 00 	lea    r14,[rsp+0x230]
     10995f2:	00 
     10995f3:	4c 89 f7             	mov    rdi,r14
     10995f6:	e8 6f 09 9e ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     10995fb:	bf 80 00 00 00       	mov    edi,0x80
     1099600:	e8 fb 48 75 00       	call   17edf00 <_Znwm@plt>
     1099605:	48 89 c3             	mov    rbx,rax
     1099608:	48 8d 05 59 2e 7b 00 	lea    rax,[rip+0x7b2e59]        # 184c468 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8b50>
     109960f:	48 89 84 24 30 02 00 	mov    QWORD PTR [rsp+0x230],rax
     1099616:	00 
     1099617:	4c 89 ac 24 38 02 00 	mov    QWORD PTR [rsp+0x238],r13
     109961e:	00 
     109961f:	4c 89 b4 24 50 02 00 	mov    QWORD PTR [rsp+0x250],r14
     1099626:	00 
     1099627:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     109962e:	00 
     109962f:	48 89 03             	mov    QWORD PTR [rbx],rax
     1099632:	4c 8d 7b 10          	lea    r15,[rbx+0x10]
     1099636:	4c 89 ff             	mov    rdi,r15
     1099639:	4c 89 f6             	mov    rsi,r14
     109963c:	48 8b 6c 24 30       	mov    rbp,QWORD PTR [rsp+0x30]
     1099641:	e8 4a 0c 9e ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     1099646:	4c 8d 73 40          	lea    r14,[rbx+0x40]
     109964a:	4c 89 f7             	mov    rdi,r14
     109964d:	e8 a4 03 74 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1099652:	0f 57 c0             	xorps  xmm0,xmm0
     1099655:	0f 29 43 60          	movaps XMMWORD PTR [rbx+0x60],xmm0
     1099659:	0f 29 43 50          	movaps XMMWORD PTR [rbx+0x50],xmm0
     109965d:	66 83 63 70 00       	and    WORD PTR [rbx+0x70],0x0
     1099662:	48 89 df             	mov    rdi,rbx
     1099665:	e8 28 b6 00 00       	call   10a4c92 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26c0a8>
     109966a:	4c 8b 23             	mov    r12,QWORD PTR [rbx]
     109966d:	4c 8d 84 24 20 01 00 	lea    r8,[rsp+0x120]
     1099674:	00 
     1099675:	49 89 18             	mov    QWORD PTR [r8],rbx
     1099678:	48 8d 35 12 3a a0 ff 	lea    rsi,[rip+0xffffffffffa03a12]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     109967f:	48 8d 0d 42 be 00 00 	lea    rcx,[rip+0xbe42]        # 10a54c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26c8de>
     1099686:	4c 8d bc 24 30 01 00 	lea    r15,[rsp+0x130]
     109968d:	00 
     109968e:	6a 08                	push   0x8
     1099690:	41 59                	pop    r9
     1099692:	4c 89 ff             	mov    rdi,r15
     1099695:	31 d2                	xor    edx,edx
     1099697:	e8 f8 10 74 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     109969c:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
     10996a0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     10996a3:	4c 8d a4 24 00 02 00 	lea    r12,[rsp+0x200]
     10996aa:	00 
     10996ab:	4c 89 e7             	mov    rdi,r12
     10996ae:	4c 89 fa             	mov    rdx,r15
     10996b1:	ff 50 10             	call   QWORD PTR [rax+0x10]
     10996b4:	4c 89 f7             	mov    rdi,r14
     10996b7:	4c 89 e6             	mov    rsi,r12
     10996ba:	e8 33 05 74 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     10996bf:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     10996c4:	e8 bd 4d a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10996c9:	4c 89 ff             	mov    rdi,r15
     10996cc:	e8 17 11 74 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     10996d1:	49 89 9d 78 03 00 00 	mov    QWORD PTR [r13+0x378],rbx
     10996d8:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     10996df:	00 
     10996e0:	e8 85 08 9e ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     10996e5:	41 c6 85 80 03 00 00 	mov    BYTE PTR [r13+0x380],0x0
     10996ec:	00 
     10996ed:	6a 60                	push   0x60
     10996ef:	5f                   	pop    rdi
     10996f0:	e8 0b 48 75 00       	call   17edf00 <_Znwm@plt>
     10996f5:	48 89 c3             	mov    rbx,rax
     10996f8:	0f 57 c0             	xorps  xmm0,xmm0
     10996fb:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     10996ff:	48 8d 05 aa 2d 7b 00 	lea    rax,[rip+0x7b2daa]        # 184c4b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8b98>
     1099706:	48 89 03             	mov    QWORD PTR [rbx],rax
     1099709:	48 89 d8             	mov    rax,rbx
     109970c:	48 83 c0 18          	add    rax,0x18
     1099710:	0f 11 43 38          	movups XMMWORD PTR [rbx+0x38],xmm0
     1099714:	0f 11 43 18          	movups XMMWORD PTR [rbx+0x18],xmm0
     1099718:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0
     109971c:	c7 43 38 00 00 80 3f 	mov    DWORD PTR [rbx+0x38],0x3f800000
     1099723:	48 83 63 58 00       	and    QWORD PTR [rbx+0x58],0x0
     1099728:	49 89 85 88 03 00 00 	mov    QWORD PTR [r13+0x388],rax
     109972f:	49 89 9d 90 03 00 00 	mov    QWORD PTR [r13+0x390],rbx
     1099736:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
     109973b:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
     1099740:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
     1099744:	48 89 5b 50          	mov    QWORD PTR [rbx+0x50],rbx
     1099748:	31 ff                	xor    edi,edi
     109974a:	e8 63 4d a0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     109974f:	48 89 df             	mov    rdi,rbx
     1099752:	e8 2f 4d a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1099757:	4c 8d 25 89 f5 29 ff 	lea    r12,[rip+0xffffffffff29f589]        # 338ce7 <_ZTSSt12bad_any_cast@@Base-0x574e1>
     109975e:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     1099765:	00 
     1099766:	4c 89 e6             	mov    rsi,r12
     1099769:	e8 10 03 9e ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     109976e:	48 8d 05 3b 0d 7f 00 	lea    rax,[rip+0x7f0d3b]        # 188a4b0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x3188>
     1099775:	49 89 85 98 03 00 00 	mov    QWORD PTR [r13+0x398],rax
     109977c:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
     1099783:	00 
     1099784:	49 89 85 a0 03 00 00 	mov    QWORD PTR [r13+0x3a0],rax
     109978b:	0f 57 c0             	xorps  xmm0,xmm0
     109978e:	41 0f 11 85 a8 03 00 	movups XMMWORD PTR [r13+0x3a8],xmm0
     1099795:	00 
     1099796:	41 0f 11 85 b8 03 00 	movups XMMWORD PTR [r13+0x3b8],xmm0
     109979d:	00 
     109979e:	41 c7 85 c8 03 00 00 	mov    DWORD PTR [r13+0x3c8],0x3f800000
     10997a5:	00 00 80 3f 
     10997a9:	41 0f 29 85 d0 03 00 	movaps XMMWORD PTR [r13+0x3d0],xmm0
     10997b0:	00 
     10997b1:	41 0f 11 85 d9 03 00 	movups XMMWORD PTR [r13+0x3d9],xmm0
     10997b8:	00 
     10997b9:	0f 57 c9             	xorps  xmm1,xmm1
     10997bc:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     10997c3:	00 
     10997c4:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     10997c8:	49 89 85 00 04 00 00 	mov    QWORD PTR [r13+0x400],rax
     10997cf:	0f 28 07             	movaps xmm0,XMMWORD PTR [rdi]
     10997d2:	41 0f 11 85 f0 03 00 	movups XMMWORD PTR [r13+0x3f0],xmm0
     10997d9:	00 
     10997da:	0f 29 0f             	movaps XMMWORD PTR [rdi],xmm1
     10997dd:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     10997e2:	e8 a9 46 75 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10997e7:	0f 57 c0             	xorps  xmm0,xmm0
     10997ea:	41 0f 11 85 08 04 00 	movups XMMWORD PTR [r13+0x408],xmm0
     10997f1:	00 
     10997f2:	49 8d 9d 18 04 00 00 	lea    rbx,[r13+0x418]
     10997f9:	48 89 df             	mov    rdi,rbx
     10997fc:	e8 8d ea a8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1099801:	4d 8d b5 70 04 00 00 	lea    r14,[r13+0x470]
     1099808:	4c 89 f7             	mov    rdi,r14
     109980b:	e8 7e ea a8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1099810:	4d 8d bd c8 04 00 00 	lea    r15,[r13+0x4c8]
     1099817:	4c 89 ff             	mov    rdi,r15
     109981a:	e8 0b bf ac ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     109981f:	4c 89 ef             	mov    rdi,r13
     1099822:	e8 19 7c 00 00       	call   10a1440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268856>
     1099827:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     109982b:	4c 89 6d 00          	mov    QWORD PTR [rbp+0x0],r13
     109982f:	48 85 ff             	test   rdi,rdi
     1099832:	74 06                	je     109983a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260c50>
     1099834:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1099837:	ff 50 08             	call   QWORD PTR [rax+0x8]
     109983a:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]
     1099841:	00 
     1099842:	e8 3f 4c a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1099847:	48 8b bc 24 10 01 00 	mov    rdi,QWORD PTR [rsp+0x110]
     109984e:	00 
     109984f:	e8 32 4c a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1099854:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     109985b:	00 
     109985c:	e8 2f 46 75 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1099861:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
     1099868:	00 
     1099869:	e8 fc 06 9e ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     109986e:	48 8b 5d 00          	mov    rbx,QWORD PTR [rbp+0x0]
     1099872:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     1099879:	00 
     109987a:	48 8b b4 24 a0 00 00 	mov    rsi,QWORD PTR [rsp+0xa0]
     1099881:	00 
     1099882:	e8 49 80 b7 ff       	call   c118d0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e870>
     1099887:	4c 8b b4 24 30 01 00 	mov    r14,QWORD PTR [rsp+0x130]
     109988e:	00 
     109988f:	4c 8b 7c 24 28       	mov    r15,QWORD PTR [rsp+0x28]
     1099894:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     1099897:	4d 89 37             	mov    QWORD PTR [r15],r14
     109989a:	48 85 ff             	test   rdi,rdi
     109989d:	74 09                	je     10998a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260cbe>
     109989f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10998a2:	ff 50 08             	call   QWORD PTR [rax+0x8]
     10998a5:	4d 8b 37             	mov    r14,QWORD PTR [r15]
     10998a8:	49 8b 06             	mov    rax,QWORD PTR [r14]
     10998ab:	4c 89 f7             	mov    rdi,r14
     10998ae:	ff 50 10             	call   QWORD PTR [rax+0x10]
     10998b1:	84 c0                	test   al,al
     10998b3:	74 0c                	je     10998c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260cd7>
     10998b5:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     10998b8:	6a 01                	push   0x1
     10998ba:	5e                   	pop    rsi
     10998bb:	48 89 df             	mov    rdi,rbx
     10998be:	ff 50 48             	call   QWORD PTR [rax+0x48]
     10998c1:	4d 8b 3f             	mov    r15,QWORD PTR [r15]
     10998c4:	4c 8d 84 24 00 02 00 	lea    r8,[rsp+0x200]
     10998cb:	00 
     10998cc:	49 89 18             	mov    QWORD PTR [r8],rbx
     10998cf:	4d 89 70 08          	mov    QWORD PTR [r8+0x8],r14
     10998d3:	48 8d 35 b7 37 a0 ff 	lea    rsi,[rip+0xffffffffffa037b7]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     10998da:	48 8d 0d 9d 07 00 00 	lea    rcx,[rip+0x79d]        # 109a07e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x261494>
     10998e1:	48 8d 9c 24 30 01 00 	lea    rbx,[rsp+0x130]
     10998e8:	00 
     10998e9:	6a 10                	push   0x10
     10998eb:	41 59                	pop    r9
     10998ed:	48 89 df             	mov    rdi,rbx
     10998f0:	31 d2                	xor    edx,edx
     10998f2:	e8 9d 0e 74 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     10998f7:	49 8b 07             	mov    rax,QWORD PTR [r15]
     10998fa:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     1099901:	00 
     1099902:	4c 89 fe             	mov    rsi,r15
     1099905:	48 89 da             	mov    rdx,rbx
     1099908:	ff 50 18             	call   QWORD PTR [rax+0x18]
     109990b:	48 8d 9c 24 30 02 00 	lea    rbx,[rsp+0x230]
     1099912:	00 
     1099913:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     1099918:	48 89 de             	mov    rsi,rbx
     109991b:	e8 d2 02 74 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     1099920:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     1099924:	e8 5d 4b a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1099929:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     1099930:	00 
     1099931:	e8 b2 0e 74 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     1099936:	48 8b b4 24 88 00 00 	mov    rsi,QWORD PTR [rsp+0x88]
     109993d:	00 
     109993e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1099941:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     1099948:	00 
     1099949:	ff 50 28             	call   QWORD PTR [rax+0x28]
     109994c:	6a 48                	push   0x48
     109994e:	5f                   	pop    rdi
     109994f:	e8 ac 45 75 00       	call   17edf00 <_Znwm@plt>
     1099954:	0f 57 c0             	xorps  xmm0,xmm0
     1099957:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     109995b:	48 8d 0d e6 1d 7b 00 	lea    rcx,[rip+0x7b1de6]        # 184b748 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7e30>
     1099962:	48 89 08             	mov    QWORD PTR [rax],rcx
     1099965:	48 89 c1             	mov    rcx,rax
     1099968:	48 83 c1 18          	add    rcx,0x18
     109996c:	4c 89 60 20          	mov    QWORD PTR [rax+0x20],r12
     1099970:	48 8d 15 f9 2c 7b 00 	lea    rdx,[rip+0x7b2cf9]        # 184c670 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8d58>
     1099977:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
     109997b:	48 8b 94 24 38 02 00 	mov    rdx,QWORD PTR [rsp+0x238]
     1099982:	00 
     1099983:	0f 28 8c 24 30 02 00 	movaps xmm1,XMMWORD PTR [rsp+0x230]
     109998a:	00 
     109998b:	0f 11 48 28          	movups XMMWORD PTR [rax+0x28],xmm1
     109998f:	48 85 d2             	test   rdx,rdx
     1099992:	74 05                	je     1099999 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260daf>
     1099994:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
     1099999:	0f 11 40 38          	movups XMMWORD PTR [rax+0x38],xmm0
     109999d:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
     10999a4:	00 
     10999a5:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     10999a8:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     10999ac:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     10999b1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10999b4:	ff 50 38             	call   QWORD PTR [rax+0x38]
     10999b7:	48 8b 9c 24 98 00 00 	mov    rbx,QWORD PTR [rsp+0x98]
     10999be:	00 
     10999bf:	48 8b bc 24 38 01 00 	mov    rdi,QWORD PTR [rsp+0x138]
     10999c6:	00 
     10999c7:	e8 ba 4a a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10999cc:	31 ff                	xor    edi,edi
     10999ce:	e8 b3 4a a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10999d3:	48 8b bc 24 38 02 00 	mov    rdi,QWORD PTR [rsp+0x238]
     10999da:	00 
     10999db:	e8 a6 4a a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10999e0:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
     10999e7:	00 
     10999e8:	e8 7d 05 9e ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     10999ed:	31 ff                	xor    edi,edi
     10999ef:	e8 be 4a a0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     10999f4:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
     10999fb:	00 
     10999fc:	e8 69 05 9e ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1099a01:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     1099a06:	48 89 03             	mov    QWORD PTR [rbx],rax
     1099a09:	31 ff                	xor    edi,edi
     1099a0b:	e8 a2 4a a0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     1099a10:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
     1099a17:	00 
     1099a18:	e8 69 4a a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1099a1d:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
     1099a24:	00 
     1099a25:	e8 66 44 75 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1099a2a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1099a31:	00 00 
     1099a33:	48 3b 84 24 60 02 00 	cmp    rax,QWORD PTR [rsp+0x260]
     1099a3a:	00 
     1099a3b:	0f 85 df 02 00 00    	jne    1099d20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x261136>
     1099a41:	48 89 d8             	mov    rax,rbx
     1099a44:	48 81 c4 68 02 00 00 	add    rsp,0x268
     1099a4b:	5b                   	pop    rbx
     1099a4c:	41 5c                	pop    r12
     1099a4e:	41 5d                	pop    r13
     1099a50:	41 5e                	pop    r14
     1099a52:	41 5f                	pop    r15
     1099a54:	5d                   	pop    rbp
     1099a55:	c3                   	ret
     1099a56:	48 89 c7             	mov    rdi,rax
     1099a59:	e8 47 00 9e ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1099a5e:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1099a63:	48 8b bc 24 38 01 00 	mov    rdi,QWORD PTR [rsp+0x138]
     1099a6a:	00 
     1099a6b:	e8 16 4a a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1099a70:	31 ff                	xor    edi,edi
     1099a72:	e8 0f 4a a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1099a77:	eb 05                	jmp    1099a7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260e94>
     1099a79:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1099a7e:	48 8b bc 24 38 02 00 	mov    rdi,QWORD PTR [rsp+0x238]
     1099a85:	00 
     1099a86:	e8 fb 49 a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1099a8b:	e9 05 02 00 00       	jmp    1099c95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2610ab>
     1099a90:	e9 c8 02 00 00       	jmp    1099d5d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x261173>
     1099a95:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1099a9a:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     1099aa1:	00 
     1099aa2:	e8 41 0d 74 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     1099aa7:	e9 e9 01 00 00       	jmp    1099c95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2610ab>
     1099aac:	e9 ac 02 00 00       	jmp    1099d5d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x261173>
     1099ab1:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1099ab6:	4c 89 ff             	mov    rdi,r15
     1099ab9:	e8 be 56 ad ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
     1099abe:	eb 05                	jmp    1099ac5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260edb>
     1099ac0:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1099ac5:	4d 8d bd 98 03 00 00 	lea    r15,[r13+0x398]
     1099acc:	4c 89 f7             	mov    rdi,r14
     1099acf:	e8 92 03 74 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     1099ad4:	48 89 df             	mov    rdi,rbx
     1099ad7:	e8 8a 03 74 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     1099adc:	49 8b bd 10 04 00 00 	mov    rdi,QWORD PTR [r13+0x410]
     1099ae3:	e8 9e 49 a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1099ae8:	4c 89 ff             	mov    rdi,r15
     1099aeb:	e8 7a ed 54 00       	call   15e886a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ddee>
     1099af0:	eb 05                	jmp    1099af7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260f0d>
     1099af2:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1099af7:	49 8d bd 88 03 00 00 	lea    rdi,[r13+0x388]
     1099afe:	e8 83 7a 00 00       	call   10a1586 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26899c>
     1099b03:	eb 05                	jmp    1099b0a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260f20>
     1099b05:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1099b0a:	49 8d bd 78 03 00 00 	lea    rdi,[r13+0x378]
     1099b11:	e8 8e 7a 00 00       	call   10a15a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2689ba>
     1099b16:	eb 44                	jmp    1099b5c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260f72>
     1099b18:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1099b1d:	48 89 df             	mov    rdi,rbx
     1099b20:	48 83 c7 58          	add    rdi,0x58
     1099b24:	e8 89 7c d5 ff       	call   df17b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe838>
     1099b29:	4c 89 f7             	mov    rdi,r14
     1099b2c:	e8 a3 00 74 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     1099b31:	4c 89 ff             	mov    rdi,r15
     1099b34:	e8 31 04 9e ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1099b39:	eb 05                	jmp    1099b40 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260f56>
     1099b3b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1099b40:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     1099b47:	00 
     1099b48:	e8 1d 04 9e ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1099b4d:	48 89 df             	mov    rdi,rbx
     1099b50:	e8 cb 43 75 00       	call   17edf20 <_ZdlPv@plt>
     1099b55:	eb 05                	jmp    1099b5c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260f72>
     1099b57:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1099b5c:	4c 89 ef             	mov    rdi,r13
     1099b5f:	48 81 c7 70 03 00 00 	add    rdi,0x370
     1099b66:	e8 6d 7a 00 00       	call   10a15d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2689ee>
     1099b6b:	e9 ac 00 00 00       	jmp    1099c1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x261032>
     1099b70:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1099b75:	48 8d 9d 10 01 00 00 	lea    rbx,[rbp+0x110]
     1099b7c:	49 89 ee             	mov    r14,rbp
     1099b7f:	49 81 c6 f8 00 00 00 	add    r14,0xf8
     1099b86:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     1099b8d:	00 
     1099b8e:	e8 55 0c 74 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     1099b93:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     1099b98:	e8 91 b7 62 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     1099b9d:	48 89 df             	mov    rdi,rbx
     1099ba0:	e8 89 b7 62 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     1099ba5:	4c 89 f7             	mov    rdi,r14
     1099ba8:	e8 05 7c d5 ff       	call   df17b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe838>
     1099bad:	4c 89 ff             	mov    rdi,r15
     1099bb0:	e8 91 7b 72 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
     1099bb5:	4c 89 e7             	mov    rdi,r12
     1099bb8:	e8 17 00 74 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     1099bbd:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     1099bc2:	e8 a3 03 9e ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1099bc7:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     1099bcc:	e8 99 03 9e ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1099bd1:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
     1099bd6:	e8 8f 03 9e ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1099bdb:	eb 05                	jmp    1099be2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260ff8>
     1099bdd:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1099be2:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     1099be7:	e8 7e 03 9e ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1099bec:	eb 05                	jmp    1099bf3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x261009>
     1099bee:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1099bf3:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     1099bfa:	00 
     1099bfb:	e8 6a 03 9e ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1099c00:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     1099c07:	00 
     1099c08:	e8 5d 03 9e ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1099c0d:	48 89 ef             	mov    rdi,rbp
     1099c10:	e8 0b 43 75 00       	call   17edf20 <_ZdlPv@plt>
     1099c15:	eb 05                	jmp    1099c1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x261032>
     1099c17:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1099c1c:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     1099c21:	e8 e0 dc 54 00       	call   15e7906 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ce8a>
     1099c26:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
     1099c2b:	e8 d6 dc 54 00       	call   15e7906 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ce8a>
     1099c30:	49 8b 7d 78          	mov    rdi,QWORD PTR [r13+0x78]
     1099c34:	e8 4d 48 a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1099c39:	49 8b 7d 68          	mov    rdi,QWORD PTR [r13+0x68]
     1099c3d:	e8 44 48 a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1099c42:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
     1099c47:	e8 1e 03 9e ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1099c4c:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
     1099c53:	00 
     1099c54:	e8 37 42 75 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1099c59:	4c 89 ef             	mov    rdi,r13
     1099c5c:	e8 bf 42 75 00       	call   17edf20 <_ZdlPv@plt>
     1099c61:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]
     1099c68:	00 
     1099c69:	e8 18 48 a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1099c6e:	48 8b bc 24 10 01 00 	mov    rdi,QWORD PTR [rsp+0x110]
     1099c75:	00 
     1099c76:	e8 0b 48 a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1099c7b:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     1099c82:	00 
     1099c83:	e8 08 42 75 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1099c88:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
     1099c8f:	00 
     1099c90:	e8 d5 02 9e ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1099c95:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     1099c9a:	e8 35 ff 73 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     1099c9f:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     1099ca4:	e8 7f 01 9e ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1099ca9:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     1099cae:	e8 75 01 9e ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1099cb3:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
     1099cba:	00 
     1099cbb:	e8 aa 02 9e ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1099cc0:	45 31 ed             	xor    r13d,r13d
     1099cc3:	31 ff                	xor    edi,edi
     1099cc5:	e8 e8 47 a0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     1099cca:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
     1099cd1:	00 
     1099cd2:	e8 93 02 9e ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1099cd7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     1099cdc:	e8 3f 42 75 00       	call   17edf20 <_ZdlPv@plt>
     1099ce1:	4c 89 ef             	mov    rdi,r13
     1099ce4:	e8 c9 47 a0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     1099ce9:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
     1099cf0:	00 
     1099cf1:	e8 90 47 a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1099cf6:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
     1099cfd:	00 
     1099cfe:	e8 8d 41 75 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1099d03:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1099d0a:	00 00 
     1099d0c:	48 3b 84 24 60 02 00 	cmp    rax,QWORD PTR [rsp+0x260]
     1099d13:	00 
     1099d14:	75 0a                	jne    1099d20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x261136>
     1099d16:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     1099d1b:	e8 b0 5f 9d ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1099d20:	e8 8b 5d 75 00       	call   17efab0 <__stack_chk_fail@plt>
     1099d25:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1099d2a:	e9 1d ff ff ff       	jmp    1099c4c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x261062>
     1099d2f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1099d34:	e9 20 ff ff ff       	jmp    1099c59 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26106f>
     1099d39:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1099d3e:	e9 1e ff ff ff       	jmp    1099c61 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x261077>
     1099d43:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1099d48:	e9 21 ff ff ff       	jmp    1099c6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x261084>
     1099d4d:	eb 18                	jmp    1099d67 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26117d>
     1099d4f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1099d54:	eb 8b                	jmp    1099ce1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2610f7>
     1099d56:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1099d5b:	eb 99                	jmp    1099cf6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26110c>
     1099d5d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1099d62:	e9 2e ff ff ff       	jmp    1099c95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2610ab>
     1099d67:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1099d6c:	e9 17 ff ff ff       	jmp    1099c88 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26109e>

## Printable strings referenced by constructor

- 0x1099311 -> 0x383b58: cpp-recently_played-recently_played_setup_impl
- 0x1099757 -> 0x338ce7: recently_played

## Direct calls into ContextPlayer 0x10a... region

- 0x1099665 -> 0x10a4c92 (0x10a4c92..0x10a54c8)
- 0x1099822 -> 0x10a1440 (0x10a1440..0x10a1585)
- 0x1099afe -> 0x10a1586 (0x10a1586..0x10a15a4)
- 0x1099b11 -> 0x10a15a4 (0x10a15a4..0x10a15d7)
- 0x1099b66 -> 0x10a15d8 (0x10a15d8..0x10a1653)

## +0x470 member lifecycle inside constructor

### reference @ 0x1099801
     10997cf:	0f 28 07             	movaps xmm0,XMMWORD PTR [rdi]
     10997d2:	41 0f 11 85 f0 03 00 	movups XMMWORD PTR [r13+0x3f0],xmm0
     10997d9:	00 
     10997da:	0f 29 0f             	movaps XMMWORD PTR [rdi],xmm1
     10997dd:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     10997e2:	e8 a9 46 75 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10997e7:	0f 57 c0             	xorps  xmm0,xmm0
     10997ea:	41 0f 11 85 08 04 00 	movups XMMWORD PTR [r13+0x408],xmm0
     10997f1:	00 
     10997f2:	49 8d 9d 18 04 00 00 	lea    rbx,[r13+0x418]
     10997f9:	48 89 df             	mov    rdi,rbx
     10997fc:	e8 8d ea a8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1099801:	4d 8d b5 70 04 00 00 	lea    r14,[r13+0x470]
     1099808:	4c 89 f7             	mov    rdi,r14
     109980b:	e8 7e ea a8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1099810:	4d 8d bd c8 04 00 00 	lea    r15,[r13+0x4c8]
     1099817:	4c 89 ff             	mov    rdi,r15
     109981a:	e8 0b bf ac ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     109981f:	4c 89 ef             	mov    rdi,r13
     1099822:	e8 19 7c 00 00       	call   10a1440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268856>
     1099827:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     109982b:	4c 89 6d 00          	mov    QWORD PTR [rbp+0x0],r13
     109982f:	48 85 ff             	test   rdi,rdi
     1099832:	74 06                	je     109983a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260c50>
     1099834:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1099837:	ff 50 08             	call   QWORD PTR [rax+0x8]
     109983a:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]
     1099841:	00 
     1099842:	e8 3f 4c a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1099847:	48 8b bc 24 10 01 00 	mov    rdi,QWORD PTR [rsp+0x110]
     109984e:	00 
     109984f:	e8 32 4c a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1099854:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     109985b:	00 
     109985c:	e8 2f 46 75 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1099861:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
     1099868:	00 
     1099869:	e8 fc 06 9e ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     109986e:	48 8b 5d 00          	mov    rbx,QWORD PTR [rbp+0x0]
     1099872:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     1099879:	00 
     109987a:	48 8b b4 24 a0 00 00 	mov    rsi,QWORD PTR [rsp+0xa0]
     1099881:	00 
     1099882:	e8 49 80 b7 ff       	call   c118d0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e870>
     1099887:	4c 8b b4 24 30 01 00 	mov    r14,QWORD PTR [rsp+0x130]
     109988e:	00 
     109988f:	4c 8b 7c 24 28       	mov    r15,QWORD PTR [rsp+0x28]

## +0x598 initialization/access inside constructor

- no direct +0x598 access in this constructor FDE

## Direct callers/jumpers of constructor function

- none
## Vptr / RTTI-looking stores in constructor

### 0x109926b loads data.rel.ro address 0x184b630
     1099263:	6a 30                	push   0x30
     1099265:	5f                   	pop    rdi
     1099266:	e8 95 4c 75 00       	call   17edf00 <_Znwm@plt>
     109926b:	48 8d 15 be 23 7b 00 	lea    rdx,[rip+0x7b23be]        # 184b630 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7d18>
     1099272:	48 8d 8c 24 a0 01 00 	lea    rcx,[rsp+0x1a0]
     1099279:	00 
     109927a:	48 89 11             	mov    QWORD PTR [rcx],rdx
     109927d:	48 89 69 08          	mov    QWORD PTR [rcx+0x8],rbp
     1099281:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     1099285:	48 8d 15 ec 23 7b 00 	lea    rdx,[rip+0x7b23ec]        # 184b678 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7d60>
     109928c:	48 8d 8c 24 70 01 00 	lea    rcx,[rsp+0x170]

### 0x1099285 loads data.rel.ro address 0x184b678
     109927a:	48 89 11             	mov    QWORD PTR [rcx],rdx
     109927d:	48 89 69 08          	mov    QWORD PTR [rcx+0x8],rbp
     1099281:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     1099285:	48 8d 15 ec 23 7b 00 	lea    rdx,[rip+0x7b23ec]        # 184b678 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7d60>
     109928c:	48 8d 8c 24 70 01 00 	lea    rcx,[rsp+0x170]
     1099293:	00 
     1099294:	48 89 11             	mov    QWORD PTR [rcx],rdx
     1099297:	0f 28 44 24 30       	movaps xmm0,XMMWORD PTR [rsp+0x30]
     109929c:	0f 11 41 08          	movups XMMWORD PTR [rcx+0x8],xmm0
     10992a0:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     10992a4:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0

### 0x10992a8 loads data.rel.ro address 0x184b6c0
     109929c:	0f 11 41 08          	movups XMMWORD PTR [rcx+0x8],xmm0
     10992a0:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     10992a4:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     10992a8:	48 8d 0d 11 24 7b 00 	lea    rcx,[rip+0x7b2411]        # 184b6c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7da8>
     10992af:	48 89 08             	mov    QWORD PTR [rax],rcx
     10992b2:	48 8d 48 10          	lea    rcx,[rax+0x10]
     10992b6:	48 89 4c 24 30       	mov    QWORD PTR [rsp+0x30],rcx
     10992bb:	48 8d 48 18          	lea    rcx,[rax+0x18]
     10992bf:	48 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],rcx
     10992c4:	48 89 c7             	mov    rdi,rax
     10992c7:	48 83 c7 20          	add    rdi,0x20

### 0x109935d loads data.rel.ro address 0x184c360
     1099350:	bf e0 04 00 00       	mov    edi,0x4e0
     1099355:	e8 a6 4b 75 00       	call   17edf00 <_Znwm@plt>
     109935a:	49 89 c5             	mov    r13,rax
     109935d:	48 8d 05 fc 2f 7b 00 	lea    rax,[rip+0x7b2ffc]        # 184c360 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8a48>
     1099364:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     1099368:	4d 8d 7d 08          	lea    r15,[r13+0x8]
     109936c:	48 8d b4 24 c8 00 00 	lea    rsi,[rsp+0xc8]
     1099373:	00 
     1099374:	4c 89 ff             	mov    rdi,r15
     1099377:	e8 c4 4b 75 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     109937c:	49 8d 5d 20          	lea    rbx,[r13+0x20]

### 0x1099416 loads data.rel.ro address 0x184c3d8
     1099409:	bf c0 01 00 00       	mov    edi,0x1c0
     109940e:	e8 ed 4a 75 00       	call   17edf00 <_Znwm@plt>
     1099413:	48 89 c5             	mov    rbp,rax
     1099416:	48 8d 05 bb 2f 7b 00 	lea    rax,[rip+0x7b2fbb]        # 184c3d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8ac0>
     109941d:	48 8d 9c 24 30 02 00 	lea    rbx,[rsp+0x230]
     1099424:	00 
     1099425:	48 89 03             	mov    QWORD PTR [rbx],rax
     1099428:	4c 89 6b 08          	mov    QWORD PTR [rbx+0x8],r13
     109942c:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx
     1099430:	48 8d 05 e9 2f 7b 00 	lea    rax,[rip+0x7b2fe9]        # 184c420 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8b08>
     1099437:	48 8d 8c 24 00 02 00 	lea    rcx,[rsp+0x200]

### 0x1099430 loads data.rel.ro address 0x184c420
     1099425:	48 89 03             	mov    QWORD PTR [rbx],rax
     1099428:	4c 89 6b 08          	mov    QWORD PTR [rbx+0x8],r13
     109942c:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx
     1099430:	48 8d 05 e9 2f 7b 00 	lea    rax,[rip+0x7b2fe9]        # 184c420 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8b08>
     1099437:	48 8d 8c 24 00 02 00 	lea    rcx,[rsp+0x200]
     109943e:	00 
     109943f:	48 89 01             	mov    QWORD PTR [rcx],rax
     1099442:	4c 89 69 08          	mov    QWORD PTR [rcx+0x8],r13
     1099446:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     109944a:	4c 89 75 00          	mov    QWORD PTR [rbp+0x0],r14
     109944e:	4c 8d 75 10          	lea    r14,[rbp+0x10]

### 0x1099608 loads data.rel.ro address 0x184c468
     10995fb:	bf 80 00 00 00       	mov    edi,0x80
     1099600:	e8 fb 48 75 00       	call   17edf00 <_Znwm@plt>
     1099605:	48 89 c3             	mov    rbx,rax
     1099608:	48 8d 05 59 2e 7b 00 	lea    rax,[rip+0x7b2e59]        # 184c468 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8b50>
     109960f:	48 89 84 24 30 02 00 	mov    QWORD PTR [rsp+0x230],rax
     1099616:	00 
     1099617:	4c 89 ac 24 38 02 00 	mov    QWORD PTR [rsp+0x238],r13
     109961e:	00 
     109961f:	4c 89 b4 24 50 02 00 	mov    QWORD PTR [rsp+0x250],r14
     1099626:	00 
     1099627:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]

### 0x10996ff loads data.rel.ro address 0x184c4b0
     10996f5:	48 89 c3             	mov    rbx,rax
     10996f8:	0f 57 c0             	xorps  xmm0,xmm0
     10996fb:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     10996ff:	48 8d 05 aa 2d 7b 00 	lea    rax,[rip+0x7b2daa]        # 184c4b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8b98>
     1099706:	48 89 03             	mov    QWORD PTR [rbx],rax
     1099709:	48 89 d8             	mov    rax,rbx
     109970c:	48 83 c0 18          	add    rax,0x18
     1099710:	0f 11 43 38          	movups XMMWORD PTR [rbx+0x38],xmm0
     1099714:	0f 11 43 18          	movups XMMWORD PTR [rbx+0x18],xmm0
     1099718:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0
     109971c:	c7 43 38 00 00 80 3f 	mov    DWORD PTR [rbx+0x38],0x3f800000

### 0x109976e loads data.rel.ro address 0x188a4b0
     1099765:	00 
     1099766:	4c 89 e6             	mov    rsi,r12
     1099769:	e8 10 03 9e ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     109976e:	48 8d 05 3b 0d 7f 00 	lea    rax,[rip+0x7f0d3b]        # 188a4b0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x3188>
     1099775:	49 89 85 98 03 00 00 	mov    QWORD PTR [r13+0x398],rax
     109977c:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
     1099783:	00 
     1099784:	49 89 85 a0 03 00 00 	mov    QWORD PTR [r13+0x3a0],rax
     109978b:	0f 57 c0             	xorps  xmm0,xmm0
     109978e:	41 0f 11 85 a8 03 00 	movups XMMWORD PTR [r13+0x3a8],xmm0
     1099795:	00 

### 0x109995b loads data.rel.ro address 0x184b748
     109994f:	e8 ac 45 75 00       	call   17edf00 <_Znwm@plt>
     1099954:	0f 57 c0             	xorps  xmm0,xmm0
     1099957:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     109995b:	48 8d 0d e6 1d 7b 00 	lea    rcx,[rip+0x7b1de6]        # 184b748 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7e30>
     1099962:	48 89 08             	mov    QWORD PTR [rax],rcx
     1099965:	48 89 c1             	mov    rcx,rax
     1099968:	48 83 c1 18          	add    rcx,0x18
     109996c:	4c 89 60 20          	mov    QWORD PTR [rax+0x20],r12
     1099970:	48 8d 15 f9 2c 7b 00 	lea    rdx,[rip+0x7b2cf9]        # 184c670 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8d58>
     1099977:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
     109997b:	48 8b 94 24 38 02 00 	mov    rdx,QWORD PTR [rsp+0x238]

### 0x1099970 loads data.rel.ro address 0x184c670
     1099965:	48 89 c1             	mov    rcx,rax
     1099968:	48 83 c1 18          	add    rcx,0x18
     109996c:	4c 89 60 20          	mov    QWORD PTR [rax+0x20],r12
     1099970:	48 8d 15 f9 2c 7b 00 	lea    rdx,[rip+0x7b2cf9]        # 184c670 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8d58>
     1099977:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
     109997b:	48 8b 94 24 38 02 00 	mov    rdx,QWORD PTR [rsp+0x238]
     1099982:	00 
     1099983:	0f 28 8c 24 30 02 00 	movaps xmm1,XMMWORD PTR [rsp+0x230]
     109998a:	00 
     109998b:	0f 11 48 28          	movups XMMWORD PTR [rax+0x28],xmm1
     109998f:	48 85 d2             	test   rdx,rdx

## Relocations in constructor-associated data addresses

    000000000184b540  0000000000000008 R_X86_64_RELATIVE                         1098b90
    000000000184b548  0000000000000008 R_X86_64_RELATIVE                         1098bba
    000000000184b550  0000000000000008 R_X86_64_RELATIVE                         174ec6a
    000000000184b558  0000000000000008 R_X86_64_RELATIVE                         174f1dc
    000000000184b560  0000000000000008 R_X86_64_RELATIVE                         1098bcc
    000000000184b568  0000000000000008 R_X86_64_RELATIVE                         174ef82
    000000000184b570  0000000000000008 R_X86_64_RELATIVE                         194fcc8
    000000000184b580  0000000000000008 R_X86_64_RELATIVE                         18f4cc8
    000000000184b588  0000000000000008 R_X86_64_RELATIVE                         18f4d40
    000000000184b590  0000000000000008 R_X86_64_RELATIVE                         18f4d18
    000000000184b598  0000000000000008 R_X86_64_RELATIVE                         18f4cf8
    000000000184b5b0  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184b5b8  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184b5c0  0000000000000008 R_X86_64_RELATIVE                         1098c48
    000000000184b5c8  0000000000000008 R_X86_64_RELATIVE                         1098c4c
    000000000184b5d0  0000000000000008 R_X86_64_RELATIVE                         1098c58
    000000000184b5d8  0000000000000008 R_X86_64_RELATIVE                         1098c64
    000000000184b5f0  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184b5f8  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184b600  0000000000000008 R_X86_64_RELATIVE                         109915e
    000000000184b608  0000000000000008 R_X86_64_RELATIVE                         1099162
    000000000184b610  0000000000000008 R_X86_64_RELATIVE                         109916e
    000000000184b618  0000000000000008 R_X86_64_RELATIVE                         109917a
    000000000184b630  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184b638  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184b640  0000000000000008 R_X86_64_RELATIVE                         1099e8c
    000000000184b648  0000000000000008 R_X86_64_RELATIVE                         1099eac
    000000000184b650  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184b658  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184b660  0000000000000008 R_X86_64_RELATIVE                         b7d29e
    000000000184b678  0000000000000008 R_X86_64_RELATIVE                         1099d72
    000000000184b680  0000000000000008 R_X86_64_RELATIVE                         1099d86
    000000000184b688  0000000000000008 R_X86_64_RELATIVE                         1099d98
    000000000184b690  0000000000000008 R_X86_64_RELATIVE                         1099dc6
    000000000184b698  0000000000000008 R_X86_64_RELATIVE                         aaaedc
    000000000184b6a0  0000000000000008 R_X86_64_RELATIVE                         aaaee6
    000000000184b6a8  0000000000000008 R_X86_64_RELATIVE                         1099dec
    000000000184b6c0  0000000000000008 R_X86_64_RELATIVE                         109a0ce
    000000000184b6c8  0000000000000008 R_X86_64_RELATIVE                         109a0fc
    000000000184b6d0  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184b6d8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184b6e0  0000000000000008 R_X86_64_RELATIVE                         109a10e
    000000000184b6e8  0000000000000008 R_X86_64_RELATIVE                         a7a004
    000000000184b700  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184b708  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184b710  0000000000000008 R_X86_64_RELATIVE                         1099ec0
    000000000184b718  0000000000000008 R_X86_64_RELATIVE                         1099ee0
    000000000184b720  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184b728  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184b730  0000000000000008 R_X86_64_RELATIVE                         1099ef4
    000000000184b748  0000000000000008 R_X86_64_RELATIVE                         109a0a2
    000000000184b750  0000000000000008 R_X86_64_RELATIVE                         109a0b2
    000000000184b758  0000000000000008 R_X86_64_RELATIVE                         109a0c4
    000000000184b768  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184b780  0000000000000008 R_X86_64_RELATIVE                         109a118
    000000000184b788  0000000000000008 R_X86_64_RELATIVE                         109a160
    000000000184b790  0000000000000008 R_X86_64_RELATIVE                         109fd12
    000000000184b798  0000000000000008 R_X86_64_RELATIVE                         aa8e00
    000000000184b7a0  0000000000000008 R_X86_64_RELATIVE                         1066dbe
    000000000184b7a8  0000000000000008 R_X86_64_RELATIVE                         109a172
    000000000184b7b0  0000000000000008 R_X86_64_RELATIVE                         109a93c
    000000000184b7c8  0000000000000008 R_X86_64_RELATIVE                         109d796
    000000000184b7d0  0000000000000008 R_X86_64_RELATIVE                         109d86e
    000000000184b7d8  0000000000000008 R_X86_64_RELATIVE                         109d880
    000000000184b7e0  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184b7f8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184b800  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184b808  0000000000000008 R_X86_64_RELATIVE                         109d6c2
    000000000184b810  0000000000000008 R_X86_64_RELATIVE                         109d6e2
    000000000184b818  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184b820  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184b828  0000000000000008 R_X86_64_RELATIVE                         109d6f6
    000000000184b840  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184b848  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184c260  0000000000000008 R_X86_64_RELATIVE                         174ec6a
    000000000184c268  0000000000000008 R_X86_64_RELATIVE                         174f1dc
    000000000184c270  0000000000000008 R_X86_64_RELATIVE                         10a1138
    000000000184c278  0000000000000008 R_X86_64_RELATIVE                         174ef82
    000000000184c280  0000000000000008 R_X86_64_RELATIVE                         19be480
    000000000184c288  0000000000000008 R_X86_64_RELATIVE                         19be5c0
    000000000184c290  0000000000000008 R_X86_64_RELATIVE                         19be7f8
    000000000184c298  0000000000000008 R_X86_64_RELATIVE                         19be980
    000000000184c2a0  0000000000000008 R_X86_64_RELATIVE                         19beac0
    000000000184c2a8  0000000000000008 R_X86_64_RELATIVE                         19bc2a8
    000000000184c2b0  0000000000000008 R_X86_64_RELATIVE                         19bc6d8
    000000000184c2b8  0000000000000008 R_X86_64_RELATIVE                         19bc968
    000000000184c2c0  0000000000000008 R_X86_64_RELATIVE                         19bd1b8
    000000000184c2c8  0000000000000008 R_X86_64_RELATIVE                         19bd8a8
    000000000184c2d0  0000000000000008 R_X86_64_RELATIVE                         19bec58
    000000000184c2d8  0000000000000008 R_X86_64_RELATIVE                         19bee60
    000000000184c2e0  0000000000000008 R_X86_64_RELATIVE                         19bf0c0
    000000000184c2e8  0000000000000008 R_X86_64_RELATIVE                         19bb220
    000000000184c2f0  0000000000000008 R_X86_64_RELATIVE                         19bf290
    000000000184c2f8  0000000000000008 R_X86_64_RELATIVE                         19bf468
    000000000184c300  0000000000000008 R_X86_64_RELATIVE                         19bf640
    000000000184c308  0000000000000008 R_X86_64_RELATIVE                         19bf7e0
    000000000184c310  0000000000000008 R_X86_64_RELATIVE                         18f70b0
    000000000184c318  0000000000000008 R_X86_64_RELATIVE                         18f70f0
    000000000184c320  0000000000000008 R_X86_64_RELATIVE                         18f7138
    000000000184c328  0000000000000008 R_X86_64_RELATIVE                         18f7038
    000000000184c330  0000000000000008 R_X86_64_RELATIVE                         18f7180
    000000000184c338  0000000000000008 R_X86_64_RELATIVE                         18f6fc0
    000000000184c340  0000000000000008 R_X86_64_RELATIVE                         18f7078
    000000000184c348  0000000000000008 R_X86_64_RELATIVE                         18f7008
    000000000184c360  0000000000000008 R_X86_64_RELATIVE                         10a2082
    000000000184c368  0000000000000008 R_X86_64_RELATIVE                         10a2130
    000000000184c370  0000000000000008 R_X86_64_RELATIVE                         10a2142
    000000000184c378  0000000000000008 R_X86_64_RELATIVE                         10a21de
    000000000184c380  0000000000000008 R_X86_64_RELATIVE                         10a227e
    000000000184c388  0000000000000008 R_X86_64_RELATIVE                         10a228a
    000000000184c390  0000000000000008 R_X86_64_RELATIVE                         d16f8e
    000000000184c398  0000000000000008 R_X86_64_RELATIVE                         d16ffa
    000000000184c3a0  0000000000000008 R_X86_64_RELATIVE                         10a2296
    000000000184c3a8  0000000000000008 R_X86_64_RELATIVE                         10a229e
    000000000184c3b0  0000000000000008 R_X86_64_RELATIVE                         10a2bc4
    000000000184c3b8  0000000000000008 R_X86_64_RELATIVE                         10a2c64
    000000000184c3c0  0000000000000008 R_X86_64_RELATIVE                         10a2c70
    000000000184c3d8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c3e0  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184c3e8  0000000000000008 R_X86_64_RELATIVE                         10a1838
    000000000184c3f0  0000000000000008 R_X86_64_RELATIVE                         10a1858
    000000000184c3f8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c400  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184c408  0000000000000008 R_X86_64_RELATIVE                         10a186c
    000000000184c420  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c428  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184c430  0000000000000008 R_X86_64_RELATIVE                         10a170c
    000000000184c438  0000000000000008 R_X86_64_RELATIVE                         10a172c
    000000000184c440  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c448  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184c450  0000000000000008 R_X86_64_RELATIVE                         10a1740
    000000000184c468  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c470  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184c478  0000000000000008 R_X86_64_RELATIVE                         10a16c4
    000000000184c480  0000000000000008 R_X86_64_RELATIVE                         10a16e4
    000000000184c488  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c490  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184c498  0000000000000008 R_X86_64_RELATIVE                         10a16f8
    000000000184c4b0  0000000000000008 R_X86_64_RELATIVE                         10a1674
    000000000184c4b8  0000000000000008 R_X86_64_RELATIVE                         10a1684
    000000000184c4c0  0000000000000008 R_X86_64_RELATIVE                         10a1696
    000000000184c4d0  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184c4e8  0000000000000008 R_X86_64_RELATIVE                         10a3c3a
    000000000184c4f0  0000000000000008 R_X86_64_RELATIVE                         10a3c8c
    000000000184c508  0000000000000008 R_X86_64_RELATIVE                         10a3c9e
    000000000184c510  0000000000000008 R_X86_64_RELATIVE                         10a3cb2
    000000000184c528  0000000000000008 R_X86_64_RELATIVE                         10a44d0
    000000000184c530  0000000000000008 R_X86_64_RELATIVE                         10a44f6
    000000000184c538  0000000000000008 R_X86_64_RELATIVE                         10a4508
    000000000184c540  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c558  0000000000000008 R_X86_64_RELATIVE                         10a443c
    000000000184c560  0000000000000008 R_X86_64_RELATIVE                         a02220
    000000000184c570  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c588  0000000000000008 R_X86_64_RELATIVE                         10a4954
    000000000184c590  0000000000000008 R_X86_64_RELATIVE                         10a4968
    000000000184c598  0000000000000008 R_X86_64_RELATIVE                         10a497a
    000000000184c5a0  0000000000000008 R_X86_64_RELATIVE                         10a4a1a
    000000000184c5a8  0000000000000008 R_X86_64_RELATIVE                         b79962
    000000000184c5b0  0000000000000008 R_X86_64_RELATIVE                         b7996c
    000000000184c5b8  0000000000000008 R_X86_64_RELATIVE                         10a4a34
    000000000184c5d0  0000000000000008 R_X86_64_RELATIVE                         10a481c
    000000000184c5d8  0000000000000008 R_X86_64_RELATIVE                         10a4830
    000000000184c5e0  0000000000000008 R_X86_64_RELATIVE                         10a4842
    000000000184c5e8  0000000000000008 R_X86_64_RELATIVE                         10a48e2
    000000000184c5f0  0000000000000008 R_X86_64_RELATIVE                         b79962
    000000000184c5f8  0000000000000008 R_X86_64_RELATIVE                         b7996c
    000000000184c600  0000000000000008 R_X86_64_RELATIVE                         10a48fc
    000000000184c618  0000000000000008 R_X86_64_RELATIVE                         10a4460
    000000000184c620  0000000000000008 R_X86_64_RELATIVE                         10a4470
    000000000184c628  0000000000000008 R_X86_64_RELATIVE                         10a4482
    000000000184c638  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184c640  0000000000000008 R_X86_64_RELATIVE                         335c78
    000000000184c648  0000000000000008 R_X86_64_RELATIVE                         350131
    000000000184c650  0000000000000008 R_X86_64_RELATIVE                         36024a
    000000000184c658  0000000000000008 R_X86_64_RELATIVE                         34a262
    000000000184c670  0000000000000008 R_X86_64_RELATIVE                         10a54ea
    000000000184c678  0000000000000008 R_X86_64_RELATIVE                         10a550a
    000000000184c680  0000000000000008 R_X86_64_RELATIVE                         10a551c
    000000000184c688  0000000000000008 R_X86_64_RELATIVE                         10a55b6
    000000000184c690  0000000000000008 R_X86_64_RELATIVE                         10a55ca
    000000000184c6a8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c6b0  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184c6b8  0000000000000008 R_X86_64_RELATIVE                         10a576e
    000000000184c6c0  0000000000000008 R_X86_64_RELATIVE                         10a5772
    000000000184c6c8  0000000000000008 R_X86_64_RELATIVE                         10a577e
    000000000184c6d0  0000000000000008 R_X86_64_RELATIVE                         10a578a
    000000000184c6e8  0000000000000008 R_X86_64_RELATIVE                         10a5ddc
    000000000184c6f0  0000000000000008 R_X86_64_RELATIVE                         10a5e0a
    000000000184c6f8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c700  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c708  0000000000000008 R_X86_64_RELATIVE                         ac3ae0
    000000000184c710  0000000000000008 R_X86_64_RELATIVE                         10a5e1c
    000000000184c718  0000000000000008 R_X86_64_RELATIVE                         10a5e2a
    000000000184c720  0000000000000008 R_X86_64_RELATIVE                         10a5ef6
    000000000184c738  0000000000000008 R_X86_64_RELATIVE                         10a8812
    000000000184c740  0000000000000008 R_X86_64_RELATIVE                         10a88e0
    000000000184c748  0000000000000008 R_X86_64_RELATIVE                         10a88f2
    000000000184c750  0000000000000008 R_X86_64_RELATIVE                         10a89b6
    000000000184c758  0000000000000008 R_X86_64_RELATIVE                         10a8aae
    000000000184c760  0000000000000008 R_X86_64_RELATIVE                         10a8da4
    000000000184c768  0000000000000008 R_X86_64_RELATIVE                         10a8dac
    000000000184c770  0000000000000008 R_X86_64_RELATIVE                         10a8db4
    000000000188a3b0  0000000000000008 R_X86_64_RELATIVE                         15e7982
    000000000188a3d8  0000000000000008 R_X86_64_RELATIVE                         aaab0e
    000000000188a3e0  0000000000000008 R_X86_64_RELATIVE                         aaab26
    000000000188a3e8  0000000000000008 R_X86_64_RELATIVE                         174ec6a
    000000000188a3f0  0000000000000008 R_X86_64_RELATIVE                         174f1dc
    000000000188a3f8  0000000000000008 R_X86_64_RELATIVE                         15e8768
    000000000188a400  0000000000000008 R_X86_64_RELATIVE                         174ef82
    000000000188a408  0000000000000008 R_X86_64_RELATIVE                         194f6f8
    000000000188a420  0000000000000008 R_X86_64_RELATIVE                         aaab0e
    000000000188a428  0000000000000008 R_X86_64_RELATIVE                         aaab26
    000000000188a430  0000000000000008 R_X86_64_RELATIVE                         174ec6a
    000000000188a438  0000000000000008 R_X86_64_RELATIVE                         174f1dc
    000000000188a440  0000000000000008 R_X86_64_RELATIVE                         15e8850
    000000000188a448  0000000000000008 R_X86_64_RELATIVE                         174ef82
    000000000188a460  0000000000000008 R_X86_64_RELATIVE                         15e87aa
    000000000188a468  0000000000000008 R_X86_64_RELATIVE                         15e87d4
    000000000188a470  0000000000000008 R_X86_64_RELATIVE                         174ec6a
    000000000188a478  0000000000000008 R_X86_64_RELATIVE                         174f1dc
    000000000188a480  0000000000000008 R_X86_64_RELATIVE                         15e87e6
    000000000188a488  0000000000000008 R_X86_64_RELATIVE                         174ef82
    000000000188a490  0000000000000008 R_X86_64_RELATIVE                         194f888
    000000000188a498  0000000000000008 R_X86_64_RELATIVE                         194f8b0
    000000000188a4b0  0000000000000008 R_X86_64_RELATIVE                         15e886a
    000000000188a4b8  0000000000000008 R_X86_64_RELATIVE                         15e8898
    000000000188a4d0  0000000000000008 R_X86_64_RELATIVE                         aaab0e
    000000000188a4d8  0000000000000008 R_X86_64_RELATIVE                         aaab26
    000000000188a4e0  0000000000000008 R_X86_64_RELATIVE                         174ec6a
    000000000188a4e8  0000000000000008 R_X86_64_RELATIVE                         174f1dc
    000000000188a4f0  0000000000000008 R_X86_64_RELATIVE                         15e9238
    000000000188a4f8  0000000000000008 R_X86_64_RELATIVE                         174ef82
    000000000188a510  0000000000000008 R_X86_64_RELATIVE                         15e928a
    000000000188a518  0000000000000008 R_X86_64_RELATIVE                         15e94fa
    000000000188a520  0000000000000008 R_X86_64_RELATIVE                         174ec6a
    000000000188a528  0000000000000008 R_X86_64_RELATIVE                         174f1dc
    000000000188a530  0000000000000008 R_X86_64_RELATIVE                         15e950c
    000000000188a538  0000000000000008 R_X86_64_RELATIVE                         174ef82
    000000000188a550  0000000000000008 R_X86_64_RELATIVE                         15e9526
    000000000188a558  0000000000000008 R_X86_64_RELATIVE                         15e9570
    000000000188a560  0000000000000008 R_X86_64_RELATIVE                         174ec6a
    000000000188a568  0000000000000008 R_X86_64_RELATIVE                         174f1dc
    000000000188a570  0000000000000008 R_X86_64_RELATIVE                         15e9582
    000000000188a578  0000000000000008 R_X86_64_RELATIVE                         174ef82
    000000000188a590  0000000000000008 R_X86_64_RELATIVE                         15e918c
    000000000188a598  0000000000000008 R_X86_64_RELATIVE                         15e91bc
    000000000188a5a0  0000000000000008 R_X86_64_RELATIVE                         174ec6a
    000000000188a5a8  0000000000000008 R_X86_64_RELATIVE                         174f1dc
    000000000188a5b0  0000000000000008 R_X86_64_RELATIVE                         15e91ce
    000000000184b760  000006bb00000001 R_X86_64_64            00000000009d81d0 _ZNKSt6__ndk119__shared_weak_count13__get_deleterERKSt9type_info + 0
    000000000184c4c8  000006bb00000001 R_X86_64_64            00000000009d81d0 _ZNKSt6__ndk119__shared_weak_count13__get_deleterERKSt9type_info + 0
    000000000184c630  000006bb00000001 R_X86_64_64            00000000009d81d0 _ZNKSt6__ndk119__shared_weak_count13__get_deleterERKSt9type_info + 0
    000000000184c568  000007ea00000001 R_X86_64_64            0000000000a55b50 __cxa_pure_virtual + 0
    000000000188a3b8  000007ea00000001 R_X86_64_64            0000000000a55b50 __cxa_pure_virtual + 0
    000000000188a3c0  000007ea00000001 R_X86_64_64            0000000000a55b50 __cxa_pure_virtual + 0

## Known downstream consumer

Restriction builder 0x10a6464 reads byte [this+0x598] and byte [this+0x470] before adding ad_disallow to skip-next.
This report should be used to establish object identity before treating any other +0x470/+0x598 writer as relevant.
