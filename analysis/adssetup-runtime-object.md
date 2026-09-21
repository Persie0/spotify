# AdsSetupImpl runtime object identity

## AdsSetupImpl factory 0xb86086 FDE=(12083334, 12091202)
      b86086:	55                   	push   rbp
      b86087:	41 57                	push   r15
      b86089:	41 56                	push   r14
      b8608b:	41 55                	push   r13
      b8608d:	41 54                	push   r12
      b8608f:	53                   	push   rbx
      b86090:	48 81 ec 58 08 00 00 	sub    rsp,0x858
      b86097:	48 89 cb             	mov    rbx,rcx
      b8609a:	49 89 d6             	mov    r14,rdx
      b8609d:	49 89 fd             	mov    r13,rdi
      b860a0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b860a7:	00 00 
      b860a9:	48 89 84 24 50 08 00 	mov    QWORD PTR [rsp+0x850],rax
      b860b0:	00 
      b860b1:	48 89 cf             	mov    rdi,rcx
      b860b4:	e8 89 1e 00 00       	call   b87f42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4ee2>
      b860b9:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      b860be:	48 89 df             	mov    rdi,rbx
      b860c1:	e8 a4 1e 00 00       	call   b87f6a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f0a>
      b860c6:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
      b860cd:	00 
      b860ce:	48 89 df             	mov    rdi,rbx
      b860d1:	e8 be 1e 00 00       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
      b860d6:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
      b860db:	48 89 df             	mov    rdi,rbx
      b860de:	e8 db 1e 00 00       	call   b87fbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f5e>
      b860e3:	48 89 c5             	mov    rbp,rax
      b860e6:	48 89 df             	mov    rdi,rbx
      b860e9:	e8 fa 1e 00 00       	call   b87fe8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f88>
      b860ee:	48 89 84 24 08 01 00 	mov    QWORD PTR [rsp+0x108],rax
      b860f5:	00 
      b860f6:	48 89 df             	mov    rdi,rbx
      b860f9:	e8 16 1f 00 00       	call   b88014 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fb4>
      b860fe:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      b86103:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]
      b86107:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
      b8610e:	00 
      b8610f:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
      b86113:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
      b8611a:	00 
      b8611b:	4d 8b 66 60          	mov    r12,QWORD PTR [r14+0x60]
      b8611f:	49 8b 76 38          	mov    rsi,QWORD PTR [r14+0x38]
      b86123:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      b86126:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
      b8612d:	00 
      b8612e:	ff 50 20             	call   QWORD PTR [rax+0x20]
      b86131:	49 8b 5e 68          	mov    rbx,QWORD PTR [r14+0x68]
      b86135:	48 8d 35 f2 34 7e ff 	lea    rsi,[rip+0xffffffffff7e34f2]        # 36962e <_ZTSSt12bad_any_cast@@Base-0x26b9a>
      b8613c:	48 8d bc 24 68 01 00 	lea    rdi,[rsp+0x168]
      b86143:	00 
      b86144:	e8 35 39 ef ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      b86149:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      b8614c:	4c 8d bc 24 80 01 00 	lea    r15,[rsp+0x180]
      b86153:	00 
      b86154:	48 8d 94 24 68 01 00 	lea    rdx,[rsp+0x168]
      b8615b:	00 
      b8615c:	4c 89 ff             	mov    rdi,r15
      b8615f:	48 89 de             	mov    rsi,rbx
      b86162:	ff 50 18             	call   QWORD PTR [rax+0x18]
      b86165:	49 8d 86 80 01 00 00 	lea    rax,[r14+0x180]
      b8616c:	48 8d 0d 1d 7b c8 00 	lea    rcx,[rip+0xc87b1d]        # 180dc90 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3950>
      b86173:	48 8d b4 24 50 04 00 	lea    rsi,[rsp+0x450]
      b8617a:	00 
      b8617b:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      b8617e:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      b86182:	48 89 76 20          	mov    QWORD PTR [rsi+0x20],rsi
      b86186:	48 8d 9c 24 80 04 00 	lea    rbx,[rsp+0x480]
      b8618d:	00 
      b8618e:	48 89 df             	mov    rdi,rbx
      b86191:	e8 48 a3 2f 00       	call   e804de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x478f4>
      b86196:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      b86199:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b8619c:	48 89 de             	mov    rsi,rbx
      b8619f:	ff 50 60             	call   QWORD PTR [rax+0x60]
      b861a2:	49 8b 5e 38          	mov    rbx,QWORD PTR [r14+0x38]
      b861a6:	48 8d 35 81 34 7e ff 	lea    rsi,[rip+0xffffffffff7e3481]        # 36962e <_ZTSSt12bad_any_cast@@Base-0x26b9a>
      b861ad:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
      b861b4:	00 
      b861b5:	e8 c4 38 ef ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      b861ba:	4c 89 a4 24 00 01 00 	mov    QWORD PTR [rsp+0x100],r12
      b861c1:	00 
      b861c2:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      b861c5:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
      b861cc:	00 
      b861cd:	48 8d 94 24 40 01 00 	lea    rdx,[rsp+0x140]
      b861d4:	00 
      b861d5:	48 89 de             	mov    rsi,rbx
      b861d8:	ff 50 28             	call   QWORD PTR [rax+0x28]
      b861db:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      b861e0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b861e3:	ff 50 40             	call   QWORD PTR [rax+0x40]
      b861e6:	49 89 c7             	mov    r15,rax
      b861e9:	bf 40 03 00 00       	mov    edi,0x340
      b861ee:	e8 0d 7d c6 00       	call   17edf00 <_Znwm@plt>
      b861f3:	48 89 c3             	mov    rbx,rax
      b861f6:	66 0f ef c0          	pxor   xmm0,xmm0
      b861fa:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      b861ff:	48 8d 05 62 72 c7 00 	lea    rax,[rip+0xc77262]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      b86206:	48 89 03             	mov    QWORD PTR [rbx],rax
      b86209:	48 8d 05 00 7e c8 00 	lea    rax,[rip+0xc87e00]        # 180e010 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3cd0>
      b86210:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      b86214:	4c 89 7b 20          	mov    QWORD PTR [rbx+0x20],r15
      b86218:	4c 8d 7b 28          	lea    r15,[rbx+0x28]
      b8621c:	4c 89 ff             	mov    rdi,r15
      b8621f:	e8 d2 37 c5 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      b86224:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
      b86228:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
      b8622d:	e8 c4 37 c5 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      b86232:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
      b86236:	48 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],rdi
      b8623b:	e8 b6 37 c5 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      b86240:	4c 8d 63 58          	lea    r12,[rbx+0x58]
      b86244:	4c 89 e7             	mov    rdi,r12
      b86247:	e8 aa 37 c5 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      b8624c:	48 8d 43 70          	lea    rax,[rbx+0x70]
      b86250:	66 0f ef c0          	pxor   xmm0,xmm0
      b86254:	f3 0f 7f 43 70       	movdqu XMMWORD PTR [rbx+0x70],xmm0
      b86259:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
      b8625d:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
      b86264:	48 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdi
      b8626b:	00 
      b8626c:	e8 1d 20 fa ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      b86271:	48 8d bb d8 00 00 00 	lea    rdi,[rbx+0xd8]
      b86278:	48 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],rdi
      b8627d:	e8 42 34 00 00       	call   b896c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6664>
      b86282:	48 8d bb 30 01 00 00 	lea    rdi,[rbx+0x130]
      b86289:	48 89 bc 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rdi
      b86290:	00 
      b86291:	e8 2e 34 00 00       	call   b896c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6664>
      b86296:	48 8d bb 88 01 00 00 	lea    rdi,[rbx+0x188]
      b8629d:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
      b862a4:	00 
      b862a5:	e8 1a 34 00 00       	call   b896c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6664>
      b862aa:	48 8d bb e0 01 00 00 	lea    rdi,[rbx+0x1e0]
      b862b1:	48 89 7c 24 78       	mov    QWORD PTR [rsp+0x78],rdi
      b862b6:	e8 09 34 00 00       	call   b896c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6664>
      b862bb:	48 8d bb 38 02 00 00 	lea    rdi,[rbx+0x238]
      b862c2:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
      b862c7:	e8 f8 33 00 00       	call   b896c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6664>
      b862cc:	48 8d bb 90 02 00 00 	lea    rdi,[rbx+0x290]
      b862d3:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
      b862d8:	e8 25 3b c5 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      b862dd:	4c 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],r15
      b862e2:	48 89 ac 24 f8 00 00 	mov    QWORD PTR [rsp+0xf8],rbp
      b862e9:	00 
      b862ea:	4c 89 ac 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],r13
      b862f1:	00 
      b862f2:	48 8d bb e8 02 00 00 	lea    rdi,[rbx+0x2e8]
      b862f9:	48 89 bc 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rdi
      b86300:	00 
      b86301:	e8 fc 3a c5 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      b86306:	4c 8d 7b 18          	lea    r15,[rbx+0x18]
      b8630a:	4c 8b 6b 20          	mov    r13,QWORD PTR [rbx+0x20]
      b8630e:	4c 8d 84 24 40 02 00 	lea    r8,[rsp+0x240]
      b86315:	00 
      b86316:	4d 89 38             	mov    QWORD PTR [r8],r15
      b86319:	48 8d 35 71 6d f1 ff 	lea    rsi,[rip+0xfffffffffff16d71]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      b86320:	48 8d 0d ad 33 00 00 	lea    rcx,[rip+0x33ad]        # b896d4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6674>
      b86327:	48 8d ac 24 70 06 00 	lea    rbp,[rsp+0x670]
      b8632e:	00 
      b8632f:	6a 08                	push   0x8
      b86331:	41 59                	pop    r9
      b86333:	48 89 ef             	mov    rdi,rbp
      b86336:	31 d2                	xor    edx,edx
      b86338:	e8 57 44 c5 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      b8633d:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      b86341:	48 8d bc 24 d8 02 00 	lea    rdi,[rsp+0x2d8]
      b86348:	00 
      b86349:	4c 89 ee             	mov    rsi,r13
      b8634c:	48 89 ea             	mov    rdx,rbp
      b8634f:	ff 50 10             	call   QWORD PTR [rax+0x10]
      b86352:	4c 8d ac 24 d8 02 00 	lea    r13,[rsp+0x2d8]
      b86359:	00 
      b8635a:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b8635f:	4c 89 ee             	mov    rsi,r13
      b86362:	e8 8b 38 c5 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
      b86367:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      b8636b:	e8 16 81 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86370:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      b86377:	00 
      b86378:	e8 6b 44 c5 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      b8637d:	4c 8b 6b 20          	mov    r13,QWORD PTR [rbx+0x20]
      b86381:	4c 8d 84 24 40 02 00 	lea    r8,[rsp+0x240]
      b86388:	00 
      b86389:	4d 89 38             	mov    QWORD PTR [r8],r15
      b8638c:	48 8d 35 fe 6c f1 ff 	lea    rsi,[rip+0xfffffffffff16cfe]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      b86393:	48 8d 0d ac 35 00 00 	lea    rcx,[rip+0x35ac]        # b89946 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd68e6>
      b8639a:	48 8d ac 24 70 06 00 	lea    rbp,[rsp+0x670]
      b863a1:	00 
      b863a2:	6a 08                	push   0x8
      b863a4:	41 59                	pop    r9
      b863a6:	48 89 ef             	mov    rdi,rbp
      b863a9:	31 d2                	xor    edx,edx
      b863ab:	e8 e4 43 c5 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      b863b0:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      b863b4:	48 8d bc 24 d8 02 00 	lea    rdi,[rsp+0x2d8]
      b863bb:	00 
      b863bc:	4c 89 ee             	mov    rsi,r13
      b863bf:	48 89 ea             	mov    rdx,rbp
      b863c2:	ff 50 18             	call   QWORD PTR [rax+0x18]
      b863c5:	4c 8d ac 24 d8 02 00 	lea    r13,[rsp+0x2d8]
      b863cc:	00 
      b863cd:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      b863d2:	4c 89 ee             	mov    rsi,r13
      b863d5:	e8 18 38 c5 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
      b863da:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      b863de:	e8 a3 80 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b863e3:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      b863ea:	00 
      b863eb:	e8 f8 43 c5 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      b863f0:	4c 8b 6b 20          	mov    r13,QWORD PTR [rbx+0x20]
      b863f4:	4c 8d 84 24 40 02 00 	lea    r8,[rsp+0x240]
      b863fb:	00 
      b863fc:	4d 89 38             	mov    QWORD PTR [r8],r15
      b863ff:	48 8d 35 8b 6c f1 ff 	lea    rsi,[rip+0xfffffffffff16c8b]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      b86406:	48 8d 0d b7 35 00 00 	lea    rcx,[rip+0x35b7]        # b899c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6964>
      b8640d:	48 8d ac 24 70 06 00 	lea    rbp,[rsp+0x670]
      b86414:	00 
      b86415:	6a 08                	push   0x8
      b86417:	41 59                	pop    r9
      b86419:	48 89 ef             	mov    rdi,rbp
      b8641c:	31 d2                	xor    edx,edx
      b8641e:	e8 71 43 c5 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      b86423:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      b86427:	48 8d bc 24 d8 02 00 	lea    rdi,[rsp+0x2d8]
      b8642e:	00 
      b8642f:	4c 89 ee             	mov    rsi,r13
      b86432:	48 89 ea             	mov    rdx,rbp
      b86435:	ff 50 38             	call   QWORD PTR [rax+0x38]
      b86438:	4c 8d ac 24 d8 02 00 	lea    r13,[rsp+0x2d8]
      b8643f:	00 
      b86440:	4c 89 e7             	mov    rdi,r12
      b86443:	4c 89 ee             	mov    rsi,r13
      b86446:	e8 a7 37 c5 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
      b8644b:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      b8644f:	e8 32 80 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86454:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      b8645b:	00 
      b8645c:	e8 87 43 c5 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      b86461:	4c 8b 6b 20          	mov    r13,QWORD PTR [rbx+0x20]
      b86465:	4c 8d 84 24 40 02 00 	lea    r8,[rsp+0x240]
      b8646c:	00 
      b8646d:	4c 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],r15
      b86472:	4d 89 38             	mov    QWORD PTR [r8],r15
      b86475:	48 8d 35 15 6c f1 ff 	lea    rsi,[rip+0xfffffffffff16c15]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      b8647c:	48 8d 0d dd 37 00 00 	lea    rcx,[rip+0x37dd]        # b89c60 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6c00>
      b86483:	48 8d ac 24 70 06 00 	lea    rbp,[rsp+0x670]
      b8648a:	00 
      b8648b:	6a 08                	push   0x8
      b8648d:	41 59                	pop    r9
      b8648f:	48 89 ef             	mov    rdi,rbp
      b86492:	31 d2                	xor    edx,edx
      b86494:	e8 fb 42 c5 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      b86499:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      b8649d:	48 8d bc 24 d8 02 00 	lea    rdi,[rsp+0x2d8]
      b864a4:	00 
      b864a5:	4c 89 ee             	mov    rsi,r13
      b864a8:	48 89 ea             	mov    rdx,rbp
      b864ab:	ff 50 50             	call   QWORD PTR [rax+0x50]
      b864ae:	4c 8d bc 24 d8 02 00 	lea    r15,[rsp+0x2d8]
      b864b5:	00 
      b864b6:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
      b864bb:	4c 89 fe             	mov    rsi,r15
      b864be:	e8 2f 37 c5 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
      b864c3:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      b864c7:	e8 ba 7f f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b864cc:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      b864d3:	00 
      b864d4:	e8 0f 43 c5 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      b864d9:	31 ff                	xor    edi,edi
      b864db:	e8 3c 7f f1 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      b864e0:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
      b864e4:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      b864e9:	49 8b 86 80 00 00 00 	mov    rax,QWORD PTR [r14+0x80]
      b864f0:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
      b864f5:	49 8b be 98 00 00 00 	mov    rdi,QWORD PTR [r14+0x98]
      b864fc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b864ff:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
      b86506:	00 
      b86507:	ff 50 18             	call   QWORD PTR [rax+0x18]
      b8650a:	49 89 c7             	mov    r15,rax
      b8650d:	49 8b 76 58          	mov    rsi,QWORD PTR [r14+0x58]
      b86511:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      b86514:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
      b8651b:	00 
      b8651c:	ff 50 28             	call   QWORD PTR [rax+0x28]
      b8651f:	49 8b 06             	mov    rax,QWORD PTR [r14]
      b86522:	8b 68 48             	mov    ebp,DWORD PTR [rax+0x48]
      b86525:	66 0f ef c0          	pxor   xmm0,xmm0
      b86529:	66 0f 7f 84 24 10 01 	movdqa XMMWORD PTR [rsp+0x110],xmm0
      b86530:	00 00 
      b86532:	48 83 a4 24 20 01 00 	and    QWORD PTR [rsp+0x120],0x0
      b86539:	00 00 
      b8653b:	e8 87 49 9b 00       	call   153aec7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38044b>
      b86540:	49 89 c4             	mov    r12,rax
      b86543:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      b8654a:	00 
      b8654b:	66 0f ef c0          	pxor   xmm0,xmm0
      b8654f:	66 0f 7f 47 60       	movdqa XMMWORD PTR [rdi+0x60],xmm0
      b86554:	66 0f 7f 47 50       	movdqa XMMWORD PTR [rdi+0x50],xmm0
      b86559:	66 0f 7f 47 40       	movdqa XMMWORD PTR [rdi+0x40],xmm0
      b8655e:	66 0f 7f 47 30       	movdqa XMMWORD PTR [rdi+0x30],xmm0
      b86563:	66 0f 7f 47 20       	movdqa XMMWORD PTR [rdi+0x20],xmm0
      b86568:	66 0f 7f 47 10       	movdqa XMMWORD PTR [rdi+0x10],xmm0
      b8656d:	66 0f 7f 07          	movdqa XMMWORD PTR [rdi],xmm0
      b86571:	48 83 67 70 00       	and    QWORD PTR [rdi+0x70],0x0
      b86576:	e8 c2 48 9b 00       	call   153ae3d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3803c1>
      b8657b:	4c 89 bc 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],r15
      b86582:	00 
      b86583:	49 c1 ec 20          	shr    r12,0x20
      b86587:	f6 84 24 88 06 00 00 	test   BYTE PTR [rsp+0x688],0x1
      b8658e:	01 
      b8658f:	74 0a                	je     b8659b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd353b>
      b86591:	4c 8b bc 24 98 06 00 	mov    r15,QWORD PTR [rsp+0x698]
      b86598:	00 
      b86599:	eb 08                	jmp    b865a3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd3543>
      b8659b:	4c 8d bc 24 89 06 00 	lea    r15,[rsp+0x689]
      b865a2:	00 
      b865a3:	f6 84 24 a0 06 00 00 	test   BYTE PTR [rsp+0x6a0],0x1
      b865aa:	01 
      b865ab:	74 0c                	je     b865b9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd3559>
      b865ad:	89 ea                	mov    edx,ebp
      b865af:	4c 8b ac 24 b0 06 00 	mov    r13,QWORD PTR [rsp+0x6b0]
      b865b6:	00 
      b865b7:	eb 0a                	jmp    b865c3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd3563>
      b865b9:	89 ea                	mov    edx,ebp
      b865bb:	4c 8d ac 24 a1 06 00 	lea    r13,[rsp+0x6a1]
      b865c2:	00 
      b865c3:	80 bc 24 ec 06 00 00 	cmp    BYTE PTR [rsp+0x6ec],0x0
      b865ca:	00 
      b865cb:	48 8d 05 23 bb 7d ff 	lea    rax,[rip+0xffffffffff7dbb23]        # 3620f5 <_ZTSSt12bad_any_cast@@Base-0x2e0d3>
      b865d2:	48 8d 2d a3 b9 8c ff 	lea    rbp,[rip+0xffffffffff8cb9a3]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      b865d9:	48 0f 44 e8          	cmove  rbp,rax
      b865dd:	45 0f b6 cc          	movzx  r9d,r12b
      b865e1:	48 8d 35 00 18 7b ff 	lea    rsi,[rip+0xffffffffff7b1800]        # 337de8 <_ZTSSt12bad_any_cast@@Base-0x583e0>
      b865e8:	4c 8d a4 24 40 02 00 	lea    r12,[rsp+0x240]
      b865ef:	00 
      b865f0:	6a 06                	push   0x6
      b865f2:	59                   	pop    rcx
      b865f3:	6a 02                	push   0x2
      b865f5:	41 58                	pop    r8
      b865f7:	4c 89 e7             	mov    rdi,r12
      b865fa:	31 c0                	xor    eax,eax
      b865fc:	e8 99 56 c5 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      b86601:	41 f6 04 24 01       	test   BYTE PTR [r12],0x1
      b86606:	74 0a                	je     b86612 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd35b2>
      b86608:	4c 8b 8c 24 50 02 00 	mov    r9,QWORD PTR [rsp+0x250]
      b8660f:	00 
      b86610:	eb 08                	jmp    b8661a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd35ba>
      b86612:	4c 8d 8c 24 41 02 00 	lea    r9,[rsp+0x241]
      b86619:	00 
      b8661a:	48 8d 35 db ff 7e ff 	lea    rsi,[rip+0xffffffffff7effdb]        # 3765fc <_ZTSSt12bad_any_cast@@Base-0x19bcc>
      b86621:	48 8d 9c 24 d8 02 00 	lea    rbx,[rsp+0x2d8]
      b86628:	00 
      b86629:	48 89 df             	mov    rdi,rbx
      b8662c:	4c 89 fa             	mov    rdx,r15
      b8662f:	4c 89 e9             	mov    rcx,r13
      b86632:	49 89 e8             	mov    r8,rbp
      b86635:	31 c0                	xor    eax,eax
      b86637:	e8 5e 56 c5 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      b8663c:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
      b86643:	00 
      b86644:	48 89 de             	mov    rsi,rbx
      b86647:	e8 e2 53 ef ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      b8664c:	48 89 df             	mov    rdi,rbx
      b8664f:	e8 3c 78 c6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b86654:	4c 89 e7             	mov    rdi,r12
      b86657:	e8 34 78 c6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b8665c:	4c 8d bc 24 70 06 00 	lea    r15,[rsp+0x670]
      b86663:	00 
      b86664:	4c 89 ff             	mov    rdi,r15
      b86667:	e8 f2 22 f4 ff       	call   ac895e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x158fe>
      b8666c:	49 8b 2e             	mov    rbp,QWORD PTR [r14]
      b8666f:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
      b86674:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b86677:	ff 50 28             	call   QWORD PTR [rax+0x28]
      b8667a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      b8667d:	48 89 c7             	mov    rdi,rax
      b86680:	ff 51 40             	call   QWORD PTR [rcx+0x40]
      b86683:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
      b8668a:	00 
      b8668b:	bf 70 03 00 00       	mov    edi,0x370
      b86690:	e8 6b 78 c6 00       	call   17edf00 <_Znwm@plt>
      b86695:	49 89 c6             	mov    r14,rax
      b86698:	0f 28 84 24 80 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x180]
      b8669f:	00 
      b866a0:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
      b866a5:	0f 57 c0             	xorps  xmm0,xmm0
      b866a8:	0f 29 84 24 80 01 00 	movaps XMMWORD PTR [rsp+0x180],xmm0
      b866af:	00 
      b866b0:	f3 0f 7e 84 24 a0 00 	movq   xmm0,QWORD PTR [rsp+0xa0]
      b866b7:	00 00 
      b866b9:	f3 0f 7e 4c 24 40    	movq   xmm1,QWORD PTR [rsp+0x40]
      b866bf:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      b866c3:	66 0f 7f 8c 24 e0 00 	movdqa XMMWORD PTR [rsp+0xe0],xmm1
      b866ca:	00 00 
      b866cc:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      b866d1:	48 89 84 24 d0 04 00 	mov    QWORD PTR [rsp+0x4d0],rax
      b866d8:	00 
      b866d9:	48 8d 05 84 5d ef ff 	lea    rax,[rip+0xffffffffffef5d84]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      b866e0:	48 89 84 24 e0 04 00 	mov    QWORD PTR [rsp+0x4e0],rax
      b866e7:	00 
      b866e8:	48 8d 05 51 19 00 00 	lea    rax,[rip+0x1951]        # b88040 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fe0>
      b866ef:	48 89 84 24 e8 04 00 	mov    QWORD PTR [rsp+0x4e8],rax
      b866f6:	00 
      b866f7:	41 c6 46 08 00       	mov    BYTE PTR [r14+0x8],0x0
      b866fc:	48 8d 05 d5 75 c8 00 	lea    rax,[rip+0xc875d5]        # 180dcd8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3998>
      b86703:	49 89 06             	mov    QWORD PTR [r14],rax
      b86706:	49 8d 7e 10          	lea    rdi,[r14+0x10]
      b8670a:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
      b86711:	00 
      b86712:	e8 2f 72 94 00       	call   14cd946 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x312eca>
      b86717:	49 83 a6 00 02 00 00 	and    QWORD PTR [r14+0x200],0x0
      b8671e:	00 
      b8671f:	66 0f ef c0          	pxor   xmm0,xmm0
      b86723:	66 41 0f 7f 86 f0 01 	movdqa XMMWORD PTR [r14+0x1f0],xmm0
      b8672a:	00 00 
      b8672c:	49 83 a6 30 02 00 00 	and    QWORD PTR [r14+0x230],0x0
      b86733:	00 
      b86734:	49 83 a6 60 02 00 00 	and    QWORD PTR [r14+0x260],0x0
      b8673b:	00 
      b8673c:	49 8d 86 f0 01 00 00 	lea    rax,[r14+0x1f0]
      b86743:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
      b86748:	49 83 a6 80 02 00 00 	and    QWORD PTR [r14+0x280],0x0
      b8674f:	00 
      b86750:	66 41 0f 7f 86 70 02 	movdqa XMMWORD PTR [r14+0x270],xmm0
      b86757:	00 00 
      b86759:	49 83 a6 b0 02 00 00 	and    QWORD PTR [r14+0x2b0],0x0
      b86760:	00 
      b86761:	49 8d 86 70 02 00 00 	lea    rax,[r14+0x270]
      b86768:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
      b8676d:	49 83 a6 e0 02 00 00 	and    QWORD PTR [r14+0x2e0],0x0
      b86774:	00 
      b86775:	49 8d 86 f0 02 00 00 	lea    rax,[r14+0x2f0]
      b8677c:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      b86781:	49 83 a6 10 03 00 00 	and    QWORD PTR [r14+0x310],0x0
      b86788:	00 
      b86789:	49 8d 86 30 03 00 00 	lea    rax,[r14+0x330]
      b86790:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
      b86797:	00 
      b86798:	66 41 0f 7f 86 20 03 	movdqa XMMWORD PTR [r14+0x320],xmm0
      b8679f:	00 00 
      b867a1:	66 41 0f 7f 86 30 03 	movdqa XMMWORD PTR [r14+0x330],xmm0
      b867a8:	00 00 
      b867aa:	66 41 0f 7f 86 40 03 	movdqa XMMWORD PTR [r14+0x340],xmm0
      b867b1:	00 00 
      b867b3:	66 41 0f 7f 86 50 03 	movdqa XMMWORD PTR [r14+0x350],xmm0
      b867ba:	00 00 
      b867bc:	49 83 a6 60 03 00 00 	and    QWORD PTR [r14+0x360],0x0
      b867c3:	00 
      b867c4:	48 8d bc 24 38 04 00 	lea    rdi,[rsp+0x438]
      b867cb:	00 
      b867cc:	e8 68 bd b1 00       	call   16a2539 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x566a5>
      b867d1:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
      b867d6:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      b867da:	83 24 24 00          	and    DWORD PTR [rsp],0x0
      b867de:	c7 44 24 08 10 27 00 	mov    DWORD PTR [rsp+0x8],0x2710
      b867e5:	00 
      b867e6:	48 8d 35 9a 95 81 ff 	lea    rsi,[rip+0xffffffffff81959a]        # 39fd87 <_ZTSN5boost9exceptionE@@Base+0x769>
      b867ed:	48 8d 0d 9c 95 81 ff 	lea    rcx,[rip+0xffffffffff81959c]        # 39fd90 <_ZTSN5boost9exceptionE@@Base+0x772>
      b867f4:	6a 08                	push   0x8
      b867f6:	41 5c                	pop    r12
      b867f8:	6a 27                	push   0x27
      b867fa:	41 58                	pop    r8
      b867fc:	4c 89 e2             	mov    rdx,r12
      b867ff:	45 31 c9             	xor    r9d,r9d
      b86802:	e8 eb 0d a6 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
      b86807:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      b8680b:	48 8d 35 a6 95 81 ff 	lea    rsi,[rip+0xffffffffff8195a6]        # 39fdb8 <_ZTSN5boost9exceptionE@@Base+0x79a>
      b86812:	48 8d 0d b7 95 81 ff 	lea    rcx,[rip+0xffffffffff8195b7]        # 39fdd0 <_ZTSN5boost9exceptionE@@Base+0x7b2>
      b86819:	6a 1e                	push   0x1e
      b8681b:	41 58                	pop    r8
      b8681d:	4c 89 e2             	mov    rdx,r12
      b86820:	45 31 c9             	xor    r9d,r9d
      b86823:	e8 36 0d a6 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
      b86828:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      b8682c:	c7 44 24 08 e8 03 00 	mov    DWORD PTR [rsp+0x8],0x3e8
      b86833:	00 
      b86834:	c7 04 24 01 00 00 00 	mov    DWORD PTR [rsp],0x1
      b8683b:	48 8d 35 ad 95 81 ff 	lea    rsi,[rip+0xffffffffff8195ad]        # 39fdef <_ZTSN5boost9exceptionE@@Base+0x7d1>
      b86842:	48 8d 0d b7 95 81 ff 	lea    rcx,[rip+0xffffffffff8195b7]        # 39fe00 <_ZTSN5boost9exceptionE@@Base+0x7e2>
      b86849:	6a 18                	push   0x18
      b8684b:	5b                   	pop    rbx
      b8684c:	4c 89 e2             	mov    rdx,r12
      b8684f:	49 89 d8             	mov    r8,rbx
      b86852:	41 b9 be 00 00 00    	mov    r9d,0xbe
      b86858:	e8 95 0d a6 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
      b8685d:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      b86861:	48 8d 35 b1 95 81 ff 	lea    rsi,[rip+0xffffffffff8195b1]        # 39fe19 <_ZTSN5boost9exceptionE@@Base+0x7fb>
      b86868:	48 8d 0d c1 95 81 ff 	lea    rcx,[rip+0xffffffffff8195c1]        # 39fe30 <_ZTSN5boost9exceptionE@@Base+0x812>
      b8686f:	4c 89 e2             	mov    rdx,r12
      b86872:	49 89 d8             	mov    r8,rbx
      b86875:	45 31 c9             	xor    r9d,r9d
      b86878:	e8 e1 0c a6 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
      b8687d:	4c 8b ac 24 c0 00 00 	mov    r13,QWORD PTR [rsp+0xc0]
      b86884:	00 
      b86885:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      b86889:	48 8d 9c 24 d8 02 00 	lea    rbx,[rsp+0x2d8]
      b86890:	00 
      b86891:	48 89 df             	mov    rdi,rbx
      b86894:	4c 89 ee             	mov    rsi,r13
      b86897:	ff 50 18             	call   QWORD PTR [rax+0x18]
      b8689a:	44 8b 23             	mov    r12d,DWORD PTR [rbx]
      b8689d:	8b 5b 0c             	mov    ebx,DWORD PTR [rbx+0xc]
      b868a0:	bf 80 00 00 00       	mov    edi,0x80
      b868a5:	e8 56 76 c6 00       	call   17edf00 <_Znwm@plt>
      b868aa:	41 ff cc             	dec    r12d
      b868ad:	41 83 fc fe          	cmp    r12d,0xfffffffe
      b868b1:	0f 92 c2             	setb   dl
      b868b4:	20 da                	and    dl,bl
      b868b6:	66 0f ef c0          	pxor   xmm0,xmm0
      b868ba:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      b868bf:	48 8d 0d 02 45 c8 00 	lea    rcx,[rip+0xc84502]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
      b868c6:	48 89 08             	mov    QWORD PTR [rax],rcx
      b868c9:	48 89 c7             	mov    rdi,rax
      b868cc:	48 83 c7 20          	add    rdi,0x20
      b868d0:	48 8d 0d 79 74 c8 00 	lea    rcx,[rip+0xc87479]        # 180dd50 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3a10>
      b868d7:	48 89 8c 24 70 06 00 	mov    QWORD PTR [rsp+0x670],rcx
      b868de:	00 
      b868df:	4c 89 ac 24 78 06 00 	mov    QWORD PTR [rsp+0x678],r13
      b868e6:	00 
      b868e7:	4c 89 bc 24 90 06 00 	mov    QWORD PTR [rsp+0x690],r15
      b868ee:	00 
      b868ef:	0f b6 d2             	movzx  edx,dl
      b868f2:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
      b868f7:	4c 89 fe             	mov    rsi,r15
      b868fa:	48 89 c3             	mov    rbx,rax
      b868fd:	e8 4a 13 94 00       	call   14c7c4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d1d0>
      b86902:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      b86909:	00 
      b8690a:	e8 5b 36 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b8690f:	31 ff                	xor    edi,edi
      b86911:	e8 06 7b f1 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      b86916:	48 8d bc 24 f0 02 00 	lea    rdi,[rsp+0x2f0]
      b8691d:	00 
      b8691e:	e8 05 4e ef ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
      b86923:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
      b86928:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b8692b:	48 89 5c 24 20       	mov    QWORD PTR [rsp+0x20],rbx
      b86930:	ff 50 28             	call   QWORD PTR [rax+0x28]
      b86933:	49 89 c7             	mov    r15,rax
      b86936:	6a 50                	push   0x50
      b86938:	5f                   	pop    rdi
      b86939:	e8 c2 75 c6 00       	call   17edf00 <_Znwm@plt>
      b8693e:	66 0f ef c0          	pxor   xmm0,xmm0
      b86942:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      b86947:	48 8d 0d 82 25 cf 00 	lea    rcx,[rip+0xcf2582]        # 1878ed0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x355b8>
      b8694e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b86951:	48 8d 0d b0 25 cf 00 	lea    rcx,[rip+0xcf25b0]        # 1878f08 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x355f0>
      b86958:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
      b8695c:	4c 89 78 20          	mov    QWORD PTR [rax+0x20],r15
      b86960:	f3 0f 7f 40 28       	movdqu XMMWORD PTR [rax+0x28],xmm0
      b86965:	f3 0f 7f 40 38       	movdqu XMMWORD PTR [rax+0x38],xmm0
      b8696a:	c7 40 48 00 00 80 3f 	mov    DWORD PTR [rax+0x48],0x3f800000
      b86971:	66 48 0f 6e c0       	movq   xmm0,rax
      b86976:	48 83 c0 18          	add    rax,0x18
      b8697a:	66 48 0f 6e c8       	movq   xmm1,rax
      b8697f:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      b86983:	49 8b be 28 03 00 00 	mov    rdi,QWORD PTR [r14+0x328]
      b8698a:	66 41 0f 7f 8e 20 03 	movdqa XMMWORD PTR [r14+0x320],xmm1
      b86991:	00 00 
      b86993:	e8 ee 7a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86998:	31 ff                	xor    edi,edi
      b8699a:	e8 e7 7a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b8699f:	bf 38 01 00 00       	mov    edi,0x138
      b869a4:	e8 57 75 c6 00       	call   17edf00 <_Znwm@plt>
      b869a9:	49 89 c7             	mov    r15,rax
      b869ac:	66 0f ef c0          	pxor   xmm0,xmm0
      b869b0:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      b869b5:	48 8d 05 ac 6a c7 00 	lea    rax,[rip+0xc76aac]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      b869bc:	49 89 07             	mov    QWORD PTR [r15],rax
      b869bf:	49 8d 5f 18          	lea    rbx,[r15+0x18]
      b869c3:	48 8d 05 be 38 cf 00 	lea    rax,[rip+0xcf38be]        # 187a288 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36970>
      b869ca:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      b869ce:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
      b869d5:	00 
      b869d6:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      b869da:	49 8d 7f 28          	lea    rdi,[r15+0x28]
      b869de:	e8 69 e3 94 00       	call   14d4d4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a2d0>
      b869e3:	49 8d bf 80 00 00 00 	lea    rdi,[r15+0x80]
      b869ea:	e8 5d e3 94 00       	call   14d4d4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a2d0>
      b869ef:	4c 89 ff             	mov    rdi,r15
      b869f2:	48 81 c7 d8 00 00 00 	add    rdi,0xd8
      b869f9:	e8 04 68 f3 ff       	call   abd202 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1a2>
      b869fe:	41 c6 87 30 01 00 00 	mov    BYTE PTR [r15+0x130],0x0
      b86a05:	00 
      b86a06:	49 89 9e 38 03 00 00 	mov    QWORD PTR [r14+0x338],rbx
      b86a0d:	49 8b be 40 03 00 00 	mov    rdi,QWORD PTR [r14+0x340]
      b86a14:	4d 89 be 40 03 00 00 	mov    QWORD PTR [r14+0x340],r15
      b86a1b:	e8 66 7a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86a20:	31 ff                	xor    edi,edi
      b86a22:	e8 5f 7a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86a27:	6a 20                	push   0x20
      b86a29:	5f                   	pop    rdi
      b86a2a:	e8 d1 74 c6 00       	call   17edf00 <_Znwm@plt>
      b86a2f:	49 89 c7             	mov    r15,rax
      b86a32:	48 89 c7             	mov    rdi,rax
      b86a35:	e8 bc 2f c5 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      b86a3a:	66 0f ef c0          	pxor   xmm0,xmm0
      b86a3e:	f3 41 0f 7f 47 10    	movdqu XMMWORD PTR [r15+0x10],xmm0
      b86a44:	4d 8b a6 38 03 00 00 	mov    r12,QWORD PTR [r14+0x338]
      b86a4b:	4c 89 bc 24 d8 02 00 	mov    QWORD PTR [rsp+0x2d8],r15
      b86a52:	00 
      b86a53:	49 8b 86 28 03 00 00 	mov    rax,QWORD PTR [r14+0x328]
      b86a5a:	f3 41 0f 6f 86 20 03 	movdqu xmm0,XMMWORD PTR [r14+0x320]
      b86a61:	00 00 
      b86a63:	f3 0f 7f 84 24 e0 02 	movdqu XMMWORD PTR [rsp+0x2e0],xmm0
      b86a6a:	00 00 
      b86a6c:	48 85 c0             	test   rax,rax
      b86a6f:	74 05                	je     b86a76 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd3a16>
      b86a71:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b86a76:	48 8d 35 1b d2 f6 ff 	lea    rsi,[rip+0xfffffffffff6d21b]        # af3c98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x40c38>
      b86a7d:	48 8d 15 2e 7f f2 ff 	lea    rdx,[rip+0xfffffffffff27f2e]        # aae9b2 <JNI_OnUnload@@Base+0x3627f>
      b86a84:	48 8d 0d 2f 29 94 00 	lea    rcx,[rip+0x94292f]        # 14c93ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e93e>
      b86a8b:	48 8d 9c 24 70 06 00 	lea    rbx,[rsp+0x670]
      b86a92:	00 
      b86a93:	4c 8d 84 24 d8 02 00 	lea    r8,[rsp+0x2d8]
      b86a9a:	00 
      b86a9b:	6a 18                	push   0x18
      b86a9d:	41 59                	pop    r9
      b86a9f:	48 89 df             	mov    rdi,rbx
      b86aa2:	e8 ed 3c c5 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      b86aa7:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      b86aab:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      b86ab2:	00 
      b86ab3:	4c 89 e6             	mov    rsi,r12
      b86ab6:	48 89 da             	mov    rdx,rbx
      b86ab9:	ff 50 28             	call   QWORD PTR [rax+0x28]
      b86abc:	48 8d 9c 24 40 02 00 	lea    rbx,[rsp+0x240]
      b86ac3:	00 
      b86ac4:	4c 89 ff             	mov    rdi,r15
      b86ac7:	48 89 de             	mov    rsi,rbx
      b86aca:	e8 23 31 c5 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
      b86acf:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      b86ad3:	e8 ae 79 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86ad8:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      b86adf:	00 
      b86ae0:	e8 03 3d c5 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      b86ae5:	48 8b bc 24 e8 02 00 	mov    rdi,QWORD PTR [rsp+0x2e8]
      b86aec:	00 
      b86aed:	e8 94 79 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86af2:	48 8d 9c 24 c0 01 00 	lea    rbx,[rsp+0x1c0]
      b86af9:	00 
      b86afa:	48 83 23 00          	and    QWORD PTR [rbx],0x0
      b86afe:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      b86b05:	00 
      b86b06:	4c 89 fe             	mov    rsi,r15
      b86b09:	e8 c0 15 00 00       	call   b880ce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd506e>
      b86b0e:	48 89 df             	mov    rdi,rbx
      b86b11:	e8 e0 15 00 00       	call   b880f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5096>
      b86b16:	6a 68                	push   0x68
      b86b18:	5f                   	pop    rdi
      b86b19:	e8 e2 73 c6 00       	call   17edf00 <_Znwm@plt>
      b86b1e:	49 89 c7             	mov    r15,rax
      b86b21:	66 0f ef c0          	pxor   xmm0,xmm0
      b86b25:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      b86b2a:	48 8d 05 67 72 c8 00 	lea    rax,[rip+0xc87267]        # 180dd98 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3a58>
      b86b31:	49 89 07             	mov    QWORD PTR [r15],rax
      b86b34:	49 8d 5f 18          	lea    rbx,[r15+0x18]
      b86b38:	4c 89 ff             	mov    rdi,r15
      b86b3b:	48 83 c7 28          	add    rdi,0x28
      b86b3f:	f3 41 0f 7f 47 18    	movdqu XMMWORD PTR [r15+0x18],xmm0
      b86b45:	48 8d b4 24 d0 04 00 	lea    rsi,[rsp+0x4d0]
      b86b4c:	00 
      b86b4d:	e8 ac 15 00 00       	call   b880fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd509e>
      b86b52:	49 83 67 48 00       	and    QWORD PTR [r15+0x48],0x0
      b86b57:	49 83 67 58 00       	and    QWORD PTR [r15+0x58],0x0
      b86b5c:	49 89 9e 48 03 00 00 	mov    QWORD PTR [r14+0x348],rbx
      b86b63:	49 8b be 50 03 00 00 	mov    rdi,QWORD PTR [r14+0x350]
      b86b6a:	4d 89 be 50 03 00 00 	mov    QWORD PTR [r14+0x350],r15
      b86b71:	e8 10 79 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86b76:	31 ff                	xor    edi,edi
      b86b78:	e8 09 79 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86b7d:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
      b86b84:	00 
      b86b85:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b86b88:	ff 50 28             	call   QWORD PTR [rax+0x28]
      b86b8b:	49 89 c4             	mov    r12,rax
      b86b8e:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
      b86b95:	00 
      b86b96:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b86b99:	ff 50 30             	call   QWORD PTR [rax+0x30]
      b86b9c:	49 89 c5             	mov    r13,rax
      b86b9f:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
      b86ba4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b86ba7:	ff 50 28             	call   QWORD PTR [rax+0x28]
      b86baa:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      b86bad:	48 89 c7             	mov    rdi,rax
      b86bb0:	ff 51 28             	call   QWORD PTR [rcx+0x28]
      b86bb3:	49 89 c7             	mov    r15,rax
      b86bb6:	49 8d 8e 20 03 00 00 	lea    rcx,[r14+0x320]
      b86bbd:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
      b86bc2:	48 89 84 24 d8 02 00 	mov    QWORD PTR [rsp+0x2d8],rax
      b86bc9:	00 
      b86bca:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      b86bcf:	48 89 84 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],rax
      b86bd6:	00 
      b86bd7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b86bdc:	49 8b 86 40 03 00 00 	mov    rax,QWORD PTR [r14+0x340]
      b86be3:	41 0f 10 86 38 03 00 	movups xmm0,XMMWORD PTR [r14+0x338]
      b86bea:	00 
      b86beb:	0f 11 84 24 e8 02 00 	movups XMMWORD PTR [rsp+0x2e8],xmm0
      b86bf2:	00 
      b86bf3:	48 85 c0             	test   rax,rax
      b86bf6:	74 05                	je     b86bfd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd3b9d>
      b86bf8:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b86bfd:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      b86c01:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
      b86c04:	0f 11 84 24 f8 02 00 	movups XMMWORD PTR [rsp+0x2f8],xmm0
      b86c0b:	00 
      b86c0c:	48 85 c0             	test   rax,rax
      b86c0f:	74 05                	je     b86c16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd3bb6>
      b86c11:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b86c16:	48 89 4c 24 48       	mov    QWORD PTR [rsp+0x48],rcx
      b86c1b:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
      b86c20:	48 89 84 24 08 03 00 	mov    QWORD PTR [rsp+0x308],rax
      b86c27:	00 
      b86c28:	48 8b 84 24 00 01 00 	mov    rax,QWORD PTR [rsp+0x100]
      b86c2f:	00 
      b86c30:	48 89 84 24 10 03 00 	mov    QWORD PTR [rsp+0x310],rax
      b86c37:	00 
      b86c38:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
      b86c3d:	48 89 84 24 18 03 00 	mov    QWORD PTR [rsp+0x318],rax
      b86c44:	00 
      b86c45:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
      b86c4c:	00 
      b86c4d:	48 89 84 24 20 03 00 	mov    QWORD PTR [rsp+0x320],rax
      b86c54:	00 
      b86c55:	48 8b 84 24 98 01 00 	mov    rax,QWORD PTR [rsp+0x198]
      b86c5c:	00 
      b86c5d:	0f 28 84 24 90 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x190]
      b86c64:	00 
      b86c65:	0f 11 84 24 28 03 00 	movups XMMWORD PTR [rsp+0x328],xmm0
      b86c6c:	00 
      b86c6d:	48 85 c0             	test   rax,rax
      b86c70:	74 05                	je     b86c77 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd3c17>
      b86c72:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b86c77:	48 8d 9c 24 48 03 00 	lea    rbx,[rsp+0x348]
      b86c7e:	00 
      b86c7f:	0f 28 44 24 50       	movaps xmm0,XMMWORD PTR [rsp+0x50]
      b86c84:	0f 11 43 f0          	movups XMMWORD PTR [rbx-0x10],xmm0
      b86c88:	48 8b b4 24 58 01 00 	mov    rsi,QWORD PTR [rsp+0x158]
      b86c8f:	00 
      b86c90:	48 89 df             	mov    rdi,rbx
      b86c93:	e8 0e 2c a6 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
      b86c98:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
      b86c9d:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      b86ca1:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
      b86ca8:	00 
      b86ca9:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      b86cad:	49 8b 86 50 03 00 00 	mov    rax,QWORD PTR [r14+0x350]
      b86cb4:	f3 41 0f 6f 86 48 03 	movdqu xmm0,XMMWORD PTR [r14+0x348]
      b86cbb:	00 00 
      b86cbd:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
      b86cc2:	48 85 c0             	test   rax,rax
      b86cc5:	74 05                	je     b86ccc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd3c6c>
      b86cc7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b86ccc:	48 8d 9c 24 88 03 00 	lea    rbx,[rsp+0x388]
      b86cd3:	00 
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
      b86e1f:	49 8d be 80 00 00 00 	lea    rdi,[r14+0x80]
      b86e26:	48 8d 9c 24 e0 06 00 	lea    rbx,[rsp+0x6e0]
      b86e2d:	00 
      b86e2e:	48 89 de             	mov    rsi,rbx
      b86e31:	e8 e6 29 f3 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      b86e36:	0f 28 43 10          	movaps xmm0,XMMWORD PTR [rbx+0x10]
      b86e3a:	66 0f ef c9          	pxor   xmm1,xmm1
      b86e3e:	66 0f 7f 4b 10       	movdqa XMMWORD PTR [rbx+0x10],xmm1
      b86e43:	49 8b be 98 00 00 00 	mov    rdi,QWORD PTR [r14+0x98]
      b86e4a:	41 0f 11 86 90 00 00 	movups XMMWORD PTR [r14+0x90],xmm0
      b86e51:	00 
      b86e52:	e8 2f 76 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86e57:	0f 28 43 20          	movaps xmm0,XMMWORD PTR [rbx+0x20]
      b86e5b:	66 0f ef c9          	pxor   xmm1,xmm1
      b86e5f:	66 0f 7f 4b 20       	movdqa XMMWORD PTR [rbx+0x20],xmm1
      b86e64:	49 8b be a8 00 00 00 	mov    rdi,QWORD PTR [r14+0xa8]
      b86e6b:	41 0f 11 86 a0 00 00 	movups XMMWORD PTR [r14+0xa0],xmm0
      b86e72:	00 
      b86e73:	e8 0e 76 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86e78:	49 8d be b0 00 00 00 	lea    rdi,[r14+0xb0]
      b86e7f:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      b86e86:	00 
      b86e87:	48 89 de             	mov    rsi,rbx
      b86e8a:	e8 8d 29 f3 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      b86e8f:	49 8d be c0 00 00 00 	lea    rdi,[r14+0xc0]
      b86e96:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
      b86e9a:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
      b86e9f:	e8 4e 6c 94 00       	call   14cdaf2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313076>
      b86ea4:	41 bf c8 00 00 00    	mov    r15d,0xc8
      b86eaa:	4b 8d 3c 3e          	lea    rdi,[r14+r15*1]
      b86eae:	48 8b 73 18          	mov    rsi,QWORD PTR [rbx+0x18]
      b86eb2:	48 83 63 18 00       	and    QWORD PTR [rbx+0x18],0x0
      b86eb7:	e8 84 6c 94 00       	call   14cdb40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3130c4>
      b86ebc:	49 8d be d0 00 00 00 	lea    rdi,[r14+0xd0]
      b86ec3:	48 8b 73 20          	mov    rsi,QWORD PTR [rbx+0x20]
      b86ec7:	48 83 63 20 00       	and    QWORD PTR [rbx+0x20],0x0
      b86ecc:	e8 99 6c 94 00       	call   14cdb6a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3130ee>
      b86ed1:	41 bc d8 00 00 00    	mov    r12d,0xd8
      b86ed7:	4b 8d 3c 26          	lea    rdi,[r14+r12*1]
      b86edb:	49 01 ef             	add    r15,rbp
      b86ede:	4c 89 fe             	mov    rsi,r15
      b86ee1:	e8 36 29 f3 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      b86ee6:	49 8d be e8 00 00 00 	lea    rdi,[r14+0xe8]
      b86eed:	49 01 ec             	add    r12,rbp
      b86ef0:	4c 89 e6             	mov    rsi,r12
      b86ef3:	e8 24 29 f3 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      b86ef8:	0f 10 43 48          	movups xmm0,XMMWORD PTR [rbx+0x48]
      b86efc:	66 0f ef c9          	pxor   xmm1,xmm1
      b86f00:	f3 0f 7f 4b 48       	movdqu XMMWORD PTR [rbx+0x48],xmm1
      b86f05:	49 8b be 00 01 00 00 	mov    rdi,QWORD PTR [r14+0x100]
      b86f0c:	41 0f 11 86 f8 00 00 	movups XMMWORD PTR [r14+0xf8],xmm0
      b86f13:	00 
      b86f14:	e8 6d 75 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86f19:	f3 0f 6f 43 58       	movdqu xmm0,XMMWORD PTR [rbx+0x58]
      b86f1e:	66 0f ef c9          	pxor   xmm1,xmm1
      b86f22:	f3 0f 7f 4b 58       	movdqu XMMWORD PTR [rbx+0x58],xmm1
      b86f27:	49 8b be 10 01 00 00 	mov    rdi,QWORD PTR [r14+0x110]
      b86f2e:	f3 41 0f 7f 86 08 01 	movdqu XMMWORD PTR [r14+0x108],xmm0
      b86f35:	00 00 
      b86f37:	e8 4a 75 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86f3c:	bb 18 01 00 00       	mov    ebx,0x118
      b86f41:	49 8d 3c 1e          	lea    rdi,[r14+rbx*1]
      b86f45:	4c 8d bc 24 78 07 00 	lea    r15,[rsp+0x778]
      b86f4c:	00 
      b86f4d:	4c 89 fe             	mov    rsi,r15
      b86f50:	e8 c7 28 f3 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      b86f55:	4d 8d a6 28 01 00 00 	lea    r12,[r14+0x128]
      b86f5c:	48 01 eb             	add    rbx,rbp
      b86f5f:	4c 89 e7             	mov    rdi,r12
      b86f62:	48 89 de             	mov    rsi,rbx
      b86f65:	e8 b2 28 f3 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      b86f6a:	49 8d be 38 01 00 00 	lea    rdi,[r14+0x138]
      b86f71:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
      b86f75:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      b86f7a:	e8 27 6c 94 00       	call   14cdba6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31312a>
      b86f7f:	49 8d 9e 40 01 00 00 	lea    rbx,[r14+0x140]
      b86f86:	49 8b be 60 01 00 00 	mov    rdi,QWORD PTR [r14+0x160]
      b86f8d:	49 83 a6 60 01 00 00 	and    QWORD PTR [r14+0x160],0x0
      b86f94:	00 
      b86f95:	48 39 df             	cmp    rdi,rbx
      b86f98:	74 0a                	je     b86fa4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd3f44>
      b86f9a:	48 85 ff             	test   rdi,rdi
      b86f9d:	74 11                	je     b86fb0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd3f50>
      b86f9f:	6a 05                	push   0x5
      b86fa1:	58                   	pop    rax
      b86fa2:	eb 06                	jmp    b86faa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd3f4a>
      b86fa4:	6a 04                	push   0x4
      b86fa6:	58                   	pop    rax
      b86fa7:	48 89 df             	mov    rdi,rbx
      b86faa:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
      b86fad:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
      b86fb0:	49 8d 86 60 01 00 00 	lea    rax,[r14+0x160]
      b86fb7:	48 8b 8c 24 c0 07 00 	mov    rcx,QWORD PTR [rsp+0x7c0]
      b86fbe:	00 
      b86fbf:	48 85 c9             	test   rcx,rcx
      b86fc2:	74 18                	je     b86fdc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd3f7c>
      b86fc4:	48 8d bc 24 a0 07 00 	lea    rdi,[rsp+0x7a0]
      b86fcb:	00 
      b86fcc:	48 39 f9             	cmp    rcx,rdi
      b86fcf:	74 11                	je     b86fe2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd3f82>
      b86fd1:	48 89 08             	mov    QWORD PTR [rax],rcx
      b86fd4:	48 8d 84 24 c0 07 00 	lea    rax,[rsp+0x7c0]
      b86fdb:	00 
      b86fdc:	48 83 20 00          	and    QWORD PTR [rax],0x0
      b86fe0:	eb 11                	jmp    b86ff3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd3f93>
      b86fe2:	48 89 18             	mov    QWORD PTR [rax],rbx
      b86fe5:	48 8b 84 24 a0 07 00 	mov    rax,QWORD PTR [rsp+0x7a0]
      b86fec:	00 
      b86fed:	48 89 de             	mov    rsi,rbx
      b86ff0:	ff 50 18             	call   QWORD PTR [rax+0x18]
      b86ff3:	bb 70 01 00 00       	mov    ebx,0x170
      b86ff8:	49 8d 3c 1e          	lea    rdi,[r14+rbx*1]
      b86ffc:	48 8d b4 24 d0 07 00 	lea    rsi,[rsp+0x7d0]
      b87003:	00 
      b87004:	e8 e9 2b c5 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
      b87009:	4d 8d be 80 01 00 00 	lea    r15,[r14+0x180]
      b87010:	49 8b be a0 01 00 00 	mov    rdi,QWORD PTR [r14+0x1a0]
      b87017:	49 83 a6 a0 01 00 00 	and    QWORD PTR [r14+0x1a0],0x0
      b8701e:	00 
      b8701f:	4c 39 ff             	cmp    rdi,r15
      b87022:	74 0a                	je     b8702e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd3fce>
      b87024:	48 85 ff             	test   rdi,rdi
      b87027:	74 11                	je     b8703a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd3fda>
      b87029:	6a 05                	push   0x5
      b8702b:	58                   	pop    rax
      b8702c:	eb 06                	jmp    b87034 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd3fd4>
      b8702e:	6a 04                	push   0x4
      b87030:	58                   	pop    rax
      b87031:	4c 89 ff             	mov    rdi,r15
      b87034:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
      b87037:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
      b8703a:	49 8d 86 a0 01 00 00 	lea    rax,[r14+0x1a0]
      b87041:	48 8b 8c 24 00 08 00 	mov    rcx,QWORD PTR [rsp+0x800]
      b87048:	00 
      b87049:	48 85 c9             	test   rcx,rcx
      b8704c:	74 13                	je     b87061 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4001>
      b8704e:	48 01 dd             	add    rbp,rbx
      b87051:	48 39 e9             	cmp    rcx,rbp
      b87054:	74 11                	je     b87067 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4007>
      b87056:	48 89 08             	mov    QWORD PTR [rax],rcx
      b87059:	48 8d 84 24 00 08 00 	lea    rax,[rsp+0x800]
      b87060:	00 
      b87061:	48 83 20 00          	and    QWORD PTR [rax],0x0
      b87065:	eb 14                	jmp    b8707b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd401b>
      b87067:	4c 89 38             	mov    QWORD PTR [rax],r15
      b8706a:	48 8b 84 24 e0 07 00 	mov    rax,QWORD PTR [rsp+0x7e0]
      b87071:	00 
      b87072:	48 89 ef             	mov    rdi,rbp
      b87075:	4c 89 fe             	mov    rsi,r15
      b87078:	ff 50 18             	call   QWORD PTR [rax+0x18]
      b8707b:	49 8d be b0 01 00 00 	lea    rdi,[r14+0x1b0]
      b87082:	48 8d 9c 24 10 08 00 	lea    rbx,[rsp+0x810]
      b87089:	00 
      b8708a:	48 89 de             	mov    rsi,rbx
      b8708d:	e8 9c 49 ef ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      b87092:	8a 43 18             	mov    al,BYTE PTR [rbx+0x18]
      b87095:	41 88 86 c8 01 00 00 	mov    BYTE PTR [r14+0x1c8],al
      b8709c:	4c 89 f7             	mov    rdi,r14
      b8709f:	48 81 c7 d0 01 00 00 	add    rdi,0x1d0
      b870a6:	48 8d 9c 24 30 08 00 	lea    rbx,[rsp+0x830]
      b870ad:	00 
      b870ae:	48 89 de             	mov    rsi,rbx
      b870b1:	e8 66 27 f3 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      b870b6:	0f 28 43 10          	movaps xmm0,XMMWORD PTR [rbx+0x10]
      b870ba:	66 0f ef c9          	pxor   xmm1,xmm1
      b870be:	66 0f 7f 4b 10       	movdqa XMMWORD PTR [rbx+0x10],xmm1
      b870c3:	49 8b be e8 01 00 00 	mov    rdi,QWORD PTR [r14+0x1e8]
      b870ca:	41 0f 11 86 e0 01 00 	movups XMMWORD PTR [r14+0x1e0],xmm0
      b870d1:	00 
      b870d2:	e8 af 73 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b870d7:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      b870de:	00 
      b870df:	e8 bc 68 94 00       	call   14cd9a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x312f24>
      b870e4:	41 0f 28 46 70       	movaps xmm0,XMMWORD PTR [r14+0x70]
      b870e9:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
      b870f0:	00 
      b870f1:	49 8b 46 78          	mov    rax,QWORD PTR [r14+0x78]
      b870f5:	48 85 c0             	test   rax,rax
      b870f8:	74 05                	je     b870ff <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd409f>
      b870fa:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b870ff:	4c 89 6c 24 28       	mov    QWORD PTR [rsp+0x28],r13
      b87104:	4c 89 bc 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],r15
      b8710b:	00 
      b8710c:	f3 41 0f 6f 04 24    	movdqu xmm0,XMMWORD PTR [r12]
      b87112:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]
      b87117:	48 85 c0             	test   rax,rax
      b8711a:	74 05                	je     b87121 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd40c1>
      b8711c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b87121:	49 8b be 60 03 00 00 	mov    rdi,QWORD PTR [r14+0x360]
      b87128:	f3 41 0f 7f 86 58 03 	movdqu XMMWORD PTR [r14+0x358],xmm0
      b8712f:	00 00 
      b87131:	e8 50 73 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87136:	4c 8b 64 24 18       	mov    r12,QWORD PTR [rsp+0x18]
      b8713b:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
      b8713f:	48 8d 35 03 8d 81 ff 	lea    rsi,[rip+0xffffffffff818d03]        # 39fe49 <_ZTSN5boost9exceptionE@@Base+0x82b>
      b87146:	48 8d 0d 13 8d 81 ff 	lea    rcx,[rip+0xffffffffff818d13]        # 39fe60 <_ZTSN5boost9exceptionE@@Base+0x842>
      b8714d:	6a 08                	push   0x8
      b8714f:	5b                   	pop    rbx
      b87150:	6a 28                	push   0x28
      b87152:	41 58                	pop    r8
      b87154:	48 89 da             	mov    rdx,rbx
      b87157:	45 31 c9             	xor    r9d,r9d
      b8715a:	e8 2b 02 a6 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      b8715f:	88 44 24 40          	mov    BYTE PTR [rsp+0x40],al
      b87163:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
      b87167:	48 8d 35 4a 8c 81 ff 	lea    rsi,[rip+0xffffffffff818c4a]        # 39fdb8 <_ZTSN5boost9exceptionE@@Base+0x79a>
      b8716e:	48 8d 0d 5b 8c 81 ff 	lea    rcx,[rip+0xffffffffff818c5b]        # 39fdd0 <_ZTSN5boost9exceptionE@@Base+0x7b2>
      b87175:	6a 1e                	push   0x1e
      b87177:	41 58                	pop    r8
      b87179:	48 89 da             	mov    rdx,rbx
      b8717c:	45 31 c9             	xor    r9d,r9d
      b8717f:	e8 06 02 a6 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      b87184:	88 44 24 50          	mov    BYTE PTR [rsp+0x50],al
      b87188:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
      b8718c:	48 8d 35 5c 8c 81 ff 	lea    rsi,[rip+0xffffffffff818c5c]        # 39fdef <_ZTSN5boost9exceptionE@@Base+0x7d1>
      b87193:	48 8d 0d 66 8c 81 ff 	lea    rcx,[rip+0xffffffffff818c66]        # 39fe00 <_ZTSN5boost9exceptionE@@Base+0x7e2>
      b8719a:	6a 18                	push   0x18
      b8719c:	41 5f                	pop    r15
      b8719e:	48 89 da             	mov    rdx,rbx
      b871a1:	4d 89 f8             	mov    r8,r15
      b871a4:	41 b9 be 00 00 00    	mov    r9d,0xbe
      b871aa:	e8 7b 02 a6 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
      b871af:	89 c5                	mov    ebp,eax
      b871b1:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
      b871b5:	48 8d 35 cb 8b 81 ff 	lea    rsi,[rip+0xffffffffff818bcb]        # 39fd87 <_ZTSN5boost9exceptionE@@Base+0x769>
      b871bc:	48 8d 0d cd 8b 81 ff 	lea    rcx,[rip+0xffffffffff818bcd]        # 39fd90 <_ZTSN5boost9exceptionE@@Base+0x772>
      b871c3:	6a 27                	push   0x27
      b871c5:	41 58                	pop    r8
      b871c7:	48 89 da             	mov    rdx,rbx
      b871ca:	45 31 c9             	xor    r9d,r9d
      b871cd:	e8 58 02 a6 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
      b871d2:	41 89 c5             	mov    r13d,eax
      b871d5:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
      b871d9:	48 8d 35 39 8c 81 ff 	lea    rsi,[rip+0xffffffffff818c39]        # 39fe19 <_ZTSN5boost9exceptionE@@Base+0x7fb>
      b871e0:	48 8d 0d 49 8c 81 ff 	lea    rcx,[rip+0xffffffffff818c49]        # 39fe30 <_ZTSN5boost9exceptionE@@Base+0x812>
      b871e7:	48 89 da             	mov    rdx,rbx
      b871ea:	4d 89 f8             	mov    r8,r15
      b871ed:	45 31 c9             	xor    r9d,r9d
      b871f0:	e8 95 01 a6 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      b871f5:	41 89 c7             	mov    r15d,eax
      b871f8:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
      b871ff:	00 
      b87200:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b87203:	ff 50 38             	call   QWORD PTR [rax+0x38]
      b87206:	48 89 c3             	mov    rbx,rax
      b87209:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
      b8720e:	0f 28 00             	movaps xmm0,XMMWORD PTR [rax]
      b87211:	0f 29 84 24 c0 00 00 	movaps XMMWORD PTR [rsp+0xc0],xmm0
      b87218:	00 
      b87219:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      b8721d:	48 85 c0             	test   rax,rax
      b87220:	74 05                	je     b87227 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd41c7>
      b87222:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b87227:	48 8d 35 22 15 7e ff 	lea    rsi,[rip+0xffffffffff7e1522]        # 368750 <_ZTSSt12bad_any_cast@@Base-0x27a78>
      b8722e:	48 8d bc 24 c0 02 00 	lea    rdi,[rsp+0x2c0]
      b87235:	00 
      b87236:	e8 43 28 ef ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      b8723b:	4d 8b a6 20 03 00 00 	mov    r12,QWORD PTR [r14+0x320]
      b87242:	4c 89 a4 24 40 02 00 	mov    QWORD PTR [rsp+0x240],r12
      b87249:	00 
      b8724a:	49 8b 86 28 03 00 00 	mov    rax,QWORD PTR [r14+0x328]
      b87251:	48 89 84 24 48 02 00 	mov    QWORD PTR [rsp+0x248],rax
      b87258:	00 
      b87259:	48 85 c0             	test   rax,rax
      b8725c:	74 05                	je     b87263 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4203>
      b8725e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b87263:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
      b8726a:	00 
      b8726b:	48 89 84 24 50 02 00 	mov    QWORD PTR [rsp+0x250],rax
      b87272:	00 
      b87273:	66 0f 6f 84 24 a0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xa0]
      b8727a:	00 00 
      b8727c:	f3 0f 7f 84 24 58 02 	movdqu XMMWORD PTR [rsp+0x258],xmm0
      b87283:	00 00 
      b87285:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
      b8728c:	48 85 c0             	test   rax,rax
      b8728f:	74 05                	je     b87296 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4236>
      b87291:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b87296:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
      b8729b:	48 63 ed             	movsxd rbp,ebp
      b8729e:	4d 63 ed             	movsxd r13,r13d
      b872a1:	66 0f 6f 84 24 c0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xc0]
      b872a8:	00 00 
      b872aa:	f3 0f 7f 84 24 68 02 	movdqu XMMWORD PTR [rsp+0x268],xmm0
      b872b1:	00 00 
      b872b3:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
      b872ba:	48 85 c0             	test   rax,rax
      b872bd:	74 05                	je     b872c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4264>
      b872bf:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b872c4:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      b872c9:	8a 44 24 40          	mov    al,BYTE PTR [rsp+0x40]
      b872cd:	88 84 24 78 02 00 00 	mov    BYTE PTR [rsp+0x278],al
      b872d4:	8a 44 24 50          	mov    al,BYTE PTR [rsp+0x50]
      b872d8:	88 84 24 79 02 00 00 	mov    BYTE PTR [rsp+0x279],al
      b872df:	48 89 ac 24 80 02 00 	mov    QWORD PTR [rsp+0x280],rbp
      b872e6:	00 
      b872e7:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
      b872ee:	00 
      b872ef:	48 89 84 24 88 02 00 	mov    QWORD PTR [rsp+0x288],rax
      b872f6:	00 
      b872f7:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
      b872fc:	48 89 84 24 90 02 00 	mov    QWORD PTR [rsp+0x290],rax
      b87303:	00 
      b87304:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      b87309:	48 89 84 24 98 02 00 	mov    QWORD PTR [rsp+0x298],rax
      b87310:	00 
      b87311:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b87316:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
      b8731b:	48 89 84 24 a0 02 00 	mov    QWORD PTR [rsp+0x2a0],rax
      b87322:	00 
      b87323:	4c 89 ac 24 a8 02 00 	mov    QWORD PTR [rsp+0x2a8],r13
      b8732a:	00 
      b8732b:	44 88 bc 24 b0 02 00 	mov    BYTE PTR [rsp+0x2b0],r15b
      b87332:	00 
      b87333:	48 89 9c 24 b8 02 00 	mov    QWORD PTR [rsp+0x2b8],rbx
      b8733a:	00 
      b8733b:	48 83 a4 24 60 06 00 	and    QWORD PTR [rsp+0x660],0x0
      b87342:	00 00 
      b87344:	bf 88 00 00 00       	mov    edi,0x88
      b87349:	e8 b2 6b c6 00       	call   17edf00 <_Znwm@plt>
      b8734e:	48 8d 0d 7b 6a c8 00 	lea    rcx,[rip+0xc86a7b]        # 180ddd0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3a90>
      b87355:	48 89 08             	mov    QWORD PTR [rax],rcx
      b87358:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
      b8735c:	48 8b 8c 24 48 02 00 	mov    rcx,QWORD PTR [rsp+0x248]
      b87363:	00 
      b87364:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
      b87368:	48 85 c9             	test   rcx,rcx
      b8736b:	74 05                	je     b87372 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4312>
      b8736d:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b87372:	0f 10 84 24 50 02 00 	movups xmm0,XMMWORD PTR [rsp+0x250]
      b87379:	00 
      b8737a:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
      b8737e:	48 8b 8c 24 60 02 00 	mov    rcx,QWORD PTR [rsp+0x260]
      b87385:	00 
      b87386:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
      b8738a:	48 85 c9             	test   rcx,rcx
      b8738d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b87392:	74 05                	je     b87399 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4339>
      b87394:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b87399:	48 8d 94 24 78 02 00 	lea    rdx,[rsp+0x278]
      b873a0:	00 
      b873a1:	48 8b 4a f8          	mov    rcx,QWORD PTR [rdx-0x8]
      b873a5:	0f 10 42 f0          	movups xmm0,XMMWORD PTR [rdx-0x10]
      b873a9:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
      b873ad:	48 85 c9             	test   rcx,rcx
      b873b0:	74 05                	je     b873b7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4357>
      b873b2:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b873b7:	48 8d 8c 24 a0 02 00 	lea    rcx,[rsp+0x2a0]
      b873be:	00 
      b873bf:	48 8b 72 10          	mov    rsi,QWORD PTR [rdx+0x10]
      b873c3:	48 89 70 50          	mov    QWORD PTR [rax+0x50],rsi
      b873c7:	0f 10 02             	movups xmm0,XMMWORD PTR [rdx]
      b873ca:	0f 11 40 40          	movups XMMWORD PTR [rax+0x40],xmm0
      b873ce:	48 8b 51 f8          	mov    rdx,QWORD PTR [rcx-0x8]
      b873d2:	0f 10 41 f0          	movups xmm0,XMMWORD PTR [rcx-0x10]
      b873d6:	0f 11 40 58          	movups XMMWORD PTR [rax+0x58],xmm0
      b873da:	48 85 d2             	test   rdx,rdx
      b873dd:	74 05                	je     b873e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4384>
      b873df:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
      b873e4:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
      b873e7:	f3 0f 6f 49 10       	movdqu xmm1,XMMWORD PTR [rcx+0x10]
      b873ec:	f3 0f 7f 48 78       	movdqu XMMWORD PTR [rax+0x78],xmm1
      b873f1:	0f 11 40 68          	movups XMMWORD PTR [rax+0x68],xmm0
      b873f5:	48 89 84 24 60 06 00 	mov    QWORD PTR [rsp+0x660],rax
      b873fc:	00 
      b873fd:	4d 8b a6 20 03 00 00 	mov    r12,QWORD PTR [r14+0x320]
      b87404:	4c 89 a4 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],r12
      b8740b:	00 
      b8740c:	49 8b 86 28 03 00 00 	mov    rax,QWORD PTR [r14+0x328]
      b87413:	48 89 84 24 c8 01 00 	mov    QWORD PTR [rsp+0x1c8],rax
      b8741a:	00 
      b8741b:	48 85 c0             	test   rax,rax
      b8741e:	74 05                	je     b87425 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd43c5>
      b87420:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b87425:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
      b8742c:	00 
      b8742d:	48 89 84 24 d0 01 00 	mov    QWORD PTR [rsp+0x1d0],rax
      b87434:	00 
      b87435:	0f 28 84 24 a0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xa0]
      b8743c:	00 
      b8743d:	0f 11 84 24 d8 01 00 	movups XMMWORD PTR [rsp+0x1d8],xmm0
      b87444:	00 
      b87445:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
      b8744a:	48 85 c0             	test   rax,rax
      b8744d:	74 05                	je     b87454 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd43f4>
      b8744f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b87454:	66 0f 6f 84 24 c0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xc0]
      b8745b:	00 00 
      b8745d:	f3 0f 7f 84 24 e8 01 	movdqu XMMWORD PTR [rsp+0x1e8],xmm0
      b87464:	00 00 
      b87466:	48 85 ff             	test   rdi,rdi
      b87469:	74 05                	je     b87470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4410>
      b8746b:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      b87470:	8a 44 24 40          	mov    al,BYTE PTR [rsp+0x40]
      b87474:	88 84 24 f8 01 00 00 	mov    BYTE PTR [rsp+0x1f8],al
      b8747b:	8a 44 24 50          	mov    al,BYTE PTR [rsp+0x50]
      b8747f:	88 84 24 f9 01 00 00 	mov    BYTE PTR [rsp+0x1f9],al
      b87486:	48 89 ac 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rbp
      b8748d:	00 
      b8748e:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
      b87495:	00 
      b87496:	48 89 84 24 08 02 00 	mov    QWORD PTR [rsp+0x208],rax
      b8749d:	00 
      b8749e:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
      b874a3:	48 89 84 24 10 02 00 	mov    QWORD PTR [rsp+0x210],rax
      b874aa:	00 
      b874ab:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      b874b0:	48 89 84 24 18 02 00 	mov    QWORD PTR [rsp+0x218],rax
      b874b7:	00 
      b874b8:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b874bd:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
      b874c2:	48 89 84 24 20 02 00 	mov    QWORD PTR [rsp+0x220],rax
      b874c9:	00 
      b874ca:	4c 89 ac 24 28 02 00 	mov    QWORD PTR [rsp+0x228],r13
      b874d1:	00 
      b874d2:	44 88 bc 24 30 02 00 	mov    BYTE PTR [rsp+0x230],r15b
      b874d9:	00 
      b874da:	48 89 9c 24 38 02 00 	mov    QWORD PTR [rsp+0x238],rbx
      b874e1:	00 
      b874e2:	48 83 a4 24 30 06 00 	and    QWORD PTR [rsp+0x630],0x0
      b874e9:	00 00 
      b874eb:	bf 88 00 00 00       	mov    edi,0x88
      b874f0:	e8 0b 6a c6 00       	call   17edf00 <_Znwm@plt>
      b874f5:	48 8d 0d 64 69 c8 00 	lea    rcx,[rip+0xc86964]        # 180de60 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3b20>
      b874fc:	48 89 08             	mov    QWORD PTR [rax],rcx
      b874ff:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
      b87503:	48 8b 8c 24 c8 01 00 	mov    rcx,QWORD PTR [rsp+0x1c8]
      b8750a:	00 
      b8750b:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
      b8750f:	48 85 c9             	test   rcx,rcx
      b87512:	74 05                	je     b87519 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd44b9>
      b87514:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b87519:	0f 10 84 24 d0 01 00 	movups xmm0,XMMWORD PTR [rsp+0x1d0]
      b87520:	00 
      b87521:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
      b87525:	48 8b 8c 24 e0 01 00 	mov    rcx,QWORD PTR [rsp+0x1e0]
      b8752c:	00 
      b8752d:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
      b87531:	48 85 c9             	test   rcx,rcx
      b87534:	74 05                	je     b8753b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd44db>
      b87536:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b8753b:	48 8d 94 24 f8 01 00 	lea    rdx,[rsp+0x1f8]
      b87542:	00 
      b87543:	48 8b 4a f8          	mov    rcx,QWORD PTR [rdx-0x8]
      b87547:	0f 10 42 f0          	movups xmm0,XMMWORD PTR [rdx-0x10]
      b8754b:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
      b8754f:	48 85 c9             	test   rcx,rcx
      b87552:	74 05                	je     b87559 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd44f9>
      b87554:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b87559:	48 8d 8c 24 20 02 00 	lea    rcx,[rsp+0x220]
      b87560:	00 
      b87561:	48 8b 72 10          	mov    rsi,QWORD PTR [rdx+0x10]
      b87565:	48 89 70 50          	mov    QWORD PTR [rax+0x50],rsi
      b87569:	0f 10 02             	movups xmm0,XMMWORD PTR [rdx]
      b8756c:	0f 11 40 40          	movups XMMWORD PTR [rax+0x40],xmm0
      b87570:	48 8b 51 f8          	mov    rdx,QWORD PTR [rcx-0x8]
      b87574:	0f 10 41 f0          	movups xmm0,XMMWORD PTR [rcx-0x10]
      b87578:	0f 11 40 58          	movups XMMWORD PTR [rax+0x58],xmm0
      b8757c:	48 85 d2             	test   rdx,rdx
      b8757f:	74 05                	je     b87586 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4526>
      b87581:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
      b87586:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      b8758a:	f3 0f 6f 49 10       	movdqu xmm1,XMMWORD PTR [rcx+0x10]
      b8758f:	f3 0f 7f 48 78       	movdqu XMMWORD PTR [rax+0x78],xmm1
      b87594:	f3 0f 7f 40 68       	movdqu XMMWORD PTR [rax+0x68],xmm0
      b87599:	4c 8d bc 24 10 06 00 	lea    r15,[rsp+0x610]
      b875a0:	00 
      b875a1:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      b875a5:	4c 8d a4 24 70 06 00 	lea    r12,[rsp+0x670]
      b875ac:	00 
      b875ad:	48 8d 9c 24 c0 02 00 	lea    rbx,[rsp+0x2c0]
      b875b4:	00 
      b875b5:	4c 8d ac 24 40 06 00 	lea    r13,[rsp+0x640]
      b875bc:	00 
      b875bd:	4c 89 e7             	mov    rdi,r12
      b875c0:	48 89 de             	mov    rsi,rbx
      b875c3:	4c 89 ea             	mov    rdx,r13
      b875c6:	4c 89 f9             	mov    rcx,r15
      b875c9:	e8 78 0b 00 00       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      b875ce:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      b875d3:	4c 89 e6             	mov    rsi,r12
      b875d6:	e8 b1 0b 00 00       	call   b8818c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd512c>
      b875db:	4c 89 e7             	mov    rdi,r12
      b875de:	e8 8b 0c 00 00       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      b875e3:	4c 89 ff             	mov    rdi,r15
      b875e6:	e8 7f 29 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b875eb:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      b875f2:	00 
      b875f3:	e8 96 0c 00 00       	call   b8828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd522e>
      b875f8:	4c 89 ef             	mov    rdi,r13
      b875fb:	e8 6a 29 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b87600:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      b87607:	00 
      b87608:	e8 81 0c 00 00       	call   b8828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd522e>
      b8760d:	48 89 df             	mov    rdi,rbx
      b87610:	e8 7b 68 c6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b87615:	48 8d 35 93 0b 80 ff 	lea    rsi,[rip+0xffffffffff800b93]        # 3881af <_ZTSSt12bad_any_cast@@Base-0x8019>
      b8761c:	48 8d bc 24 a8 01 00 	lea    rdi,[rsp+0x1a8]
      b87623:	00 
      b87624:	e8 55 24 ef ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      b87629:	48 8b 4c 24 48       	mov    rcx,QWORD PTR [rsp+0x48]
      b8762e:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      b87632:	0f 28 01             	movaps xmm0,XMMWORD PTR [rcx]
      b87635:	0f 29 84 24 80 05 00 	movaps XMMWORD PTR [rsp+0x580],xmm0
      b8763c:	00 
      b8763d:	48 85 c0             	test   rax,rax
      b87640:	4c 8b a4 24 b8 00 00 	mov    r12,QWORD PTR [rsp+0xb8]
      b87647:	00 
      b87648:	74 05                	je     b8764f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd45ef>
      b8764a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b8764f:	49 8b 86 60 03 00 00 	mov    rax,QWORD PTR [r14+0x360]
      b87656:	41 0f 10 86 58 03 00 	movups xmm0,XMMWORD PTR [r14+0x358]
      b8765d:	00 
      b8765e:	0f 29 84 24 90 05 00 	movaps XMMWORD PTR [rsp+0x590],xmm0
      b87665:	00 
      b87666:	48 85 c0             	test   rax,rax
      b87669:	74 05                	je     b87670 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4610>
      b8766b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b87670:	49 8b 86 a8 00 00 00 	mov    rax,QWORD PTR [r14+0xa8]
      b87677:	66 41 0f 6f 86 a0 00 	movdqa xmm0,XMMWORD PTR [r14+0xa0]
      b8767e:	00 00 
      b87680:	66 0f 7f 84 24 a0 05 	movdqa XMMWORD PTR [rsp+0x5a0],xmm0
      b87687:	00 00 
      b87689:	48 85 c0             	test   rax,rax
      b8768c:	74 05                	je     b87693 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4633>
      b8768e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b87693:	48 8d 9c 24 b0 05 00 	lea    rbx,[rsp+0x5b0]
      b8769a:	00 
      b8769b:	48 89 df             	mov    rdi,rbx
      b8769e:	4c 89 e6             	mov    rsi,r12
      b876a1:	e8 ea 2b ef ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      b876a6:	48 83 a4 24 00 06 00 	and    QWORD PTR [rsp+0x600],0x0
      b876ad:	00 00 
      b876af:	6a 70                	push   0x70
      b876b1:	5f                   	pop    rdi
      b876b2:	e8 49 68 c6 00       	call   17edf00 <_Znwm@plt>
      b876b7:	49 89 c7             	mov    r15,rax
      b876ba:	48 8d 84 24 90 05 00 	lea    rax,[rsp+0x590]
      b876c1:	00 
      b876c2:	48 8d 0d df 67 c8 00 	lea    rcx,[rip+0xc867df]        # 180dea8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3b68>
      b876c9:	49 89 0f             	mov    QWORD PTR [r15],rcx
      b876cc:	48 8b 48 f8          	mov    rcx,QWORD PTR [rax-0x8]
      b876d0:	0f 28 40 f0          	movaps xmm0,XMMWORD PTR [rax-0x10]
      b876d4:	41 0f 11 47 10       	movups XMMWORD PTR [r15+0x10],xmm0
      b876d9:	48 85 c9             	test   rcx,rcx
      b876dc:	74 05                	je     b876e3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4683>
      b876de:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b876e3:	0f 28 84 24 90 05 00 	movaps xmm0,XMMWORD PTR [rsp+0x590]
      b876ea:	00 
      b876eb:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
      b876f0:	0f 57 c0             	xorps  xmm0,xmm0
      b876f3:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
      b876f6:	66 0f 6f 8c 24 a0 05 	movdqa xmm1,XMMWORD PTR [rsp+0x5a0]
      b876fd:	00 00 
      b876ff:	f3 41 0f 7f 4f 30    	movdqu XMMWORD PTR [r15+0x30],xmm1
      b87705:	0f 29 40 10          	movaps XMMWORD PTR [rax+0x10],xmm0
      b87709:	4c 89 ff             	mov    rdi,r15
      b8770c:	48 83 c7 40          	add    rdi,0x40
      b87710:	48 89 de             	mov    rsi,rbx
      b87713:	e8 a0 0b 00 00       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
      b87718:	4c 89 bc 24 00 06 00 	mov    QWORD PTR [rsp+0x600],r15
      b8771f:	00 
      b87720:	48 8b 4c 24 48       	mov    rcx,QWORD PTR [rsp+0x48]
      b87725:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      b87729:	0f 28 01             	movaps xmm0,XMMWORD PTR [rcx]
      b8772c:	0f 29 84 24 f0 04 00 	movaps XMMWORD PTR [rsp+0x4f0],xmm0
      b87733:	00 
      b87734:	48 85 c0             	test   rax,rax
      b87737:	74 05                	je     b8773e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd46de>
      b87739:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b8773e:	49 8b 86 60 03 00 00 	mov    rax,QWORD PTR [r14+0x360]
      b87745:	41 0f 10 86 58 03 00 	movups xmm0,XMMWORD PTR [r14+0x358]
      b8774c:	00 
      b8774d:	0f 29 84 24 00 05 00 	movaps XMMWORD PTR [rsp+0x500],xmm0
      b87754:	00 
      b87755:	48 85 c0             	test   rax,rax
      b87758:	74 05                	je     b8775f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd46ff>
      b8775a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b8775f:	49 8b 86 a8 00 00 00 	mov    rax,QWORD PTR [r14+0xa8]
      b87766:	66 41 0f 6f 86 a0 00 	movdqa xmm0,XMMWORD PTR [r14+0xa0]
      b8776d:	00 00 
      b8776f:	66 0f 7f 84 24 10 05 	movdqa XMMWORD PTR [rsp+0x510],xmm0
      b87776:	00 00 
      b87778:	48 85 c0             	test   rax,rax
      b8777b:	74 05                	je     b87782 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4722>
      b8777d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b87782:	48 8d 9c 24 20 05 00 	lea    rbx,[rsp+0x520]
      b87789:	00 
      b8778a:	48 89 df             	mov    rdi,rbx
      b8778d:	4c 89 e6             	mov    rsi,r12
      b87790:	e8 fb 2a ef ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      b87795:	6a 70                	push   0x70
      b87797:	5f                   	pop    rdi
      b87798:	e8 63 67 c6 00       	call   17edf00 <_Znwm@plt>
      b8779d:	49 89 c4             	mov    r12,rax
      b877a0:	48 8d 84 24 00 05 00 	lea    rax,[rsp+0x500]
      b877a7:	00 
      b877a8:	48 8d 0d 89 67 c8 00 	lea    rcx,[rip+0xc86789]        # 180df38 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3bf8>
      b877af:	49 89 0c 24          	mov    QWORD PTR [r12],rcx
      b877b3:	48 8b 48 f8          	mov    rcx,QWORD PTR [rax-0x8]
      b877b7:	0f 28 40 f0          	movaps xmm0,XMMWORD PTR [rax-0x10]
      b877bb:	41 0f 11 44 24 10    	movups XMMWORD PTR [r12+0x10],xmm0
      b877c1:	48 85 c9             	test   rcx,rcx
      b877c4:	74 05                	je     b877cb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd476b>
      b877c6:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b877cb:	4c 8d bc 24 f0 04 00 	lea    r15,[rsp+0x4f0]
      b877d2:	00 
      b877d3:	66 41 0f 6f 47 10    	movdqa xmm0,XMMWORD PTR [r15+0x10]
      b877d9:	f3 41 0f 7f 44 24 20 	movdqu XMMWORD PTR [r12+0x20],xmm0
      b877e0:	66 0f ef c0          	pxor   xmm0,xmm0
      b877e4:	66 0f 7f 00          	movdqa XMMWORD PTR [rax],xmm0
      b877e8:	66 41 0f 6f 4f 20    	movdqa xmm1,XMMWORD PTR [r15+0x20]
      b877ee:	f3 41 0f 7f 4c 24 30 	movdqu XMMWORD PTR [r12+0x30],xmm1
      b877f5:	66 0f 7f 40 10       	movdqa XMMWORD PTR [rax+0x10],xmm0
      b877fa:	4c 89 e7             	mov    rdi,r12
      b877fd:	48 83 c7 40          	add    rdi,0x40
      b87801:	48 89 de             	mov    rsi,rbx
      b87804:	e8 af 0a 00 00       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
      b87809:	4c 8d ac 24 50 05 00 	lea    r13,[rsp+0x550]
      b87810:	00 
      b87811:	4d 89 65 20          	mov    QWORD PTR [r13+0x20],r12
      b87815:	48 8d 9c 24 70 06 00 	lea    rbx,[rsp+0x670]
      b8781c:	00 
      b8781d:	4c 8d a4 24 a8 01 00 	lea    r12,[rsp+0x1a8]
      b87824:	00 
      b87825:	48 8d ac 24 e0 05 00 	lea    rbp,[rsp+0x5e0]
      b8782c:	00 
      b8782d:	48 89 df             	mov    rdi,rbx
      b87830:	4c 89 e6             	mov    rsi,r12
      b87833:	48 89 ea             	mov    rdx,rbp
      b87836:	4c 89 e9             	mov    rcx,r13
      b87839:	e8 08 09 00 00       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      b8783e:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
      b87843:	48 89 de             	mov    rsi,rbx
      b87846:	e8 41 09 00 00       	call   b8818c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd512c>
      b8784b:	48 89 df             	mov    rdi,rbx
      b8784e:	e8 1b 0a 00 00       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      b87853:	4c 89 ef             	mov    rdi,r13
      b87856:	e8 0f 27 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b8785b:	4c 89 ff             	mov    rdi,r15
      b8785e:	e8 99 0a 00 00       	call   b882fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd529c>
      b87863:	48 89 ef             	mov    rdi,rbp
      b87866:	e8 ff 26 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b8786b:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
      b87872:	00 
      b87873:	e8 84 0a 00 00       	call   b882fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd529c>
      b87878:	4c 89 e7             	mov    rdi,r12
      b8787b:	e8 10 66 c6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b87880:	49 8b 86 20 03 00 00 	mov    rax,QWORD PTR [r14+0x320]
      b87887:	4d 8b be 28 03 00 00 	mov    r15,QWORD PTR [r14+0x328]
      b8788e:	4d 85 ff             	test   r15,r15
      b87891:	74 24                	je     b878b7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4857>
      b87893:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      b87898:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      b8789d:	48 89 84 24 78 06 00 	mov    QWORD PTR [rsp+0x678],rax
      b878a4:	00 
      b878a5:	4c 89 bc 24 80 06 00 	mov    QWORD PTR [rsp+0x680],r15
      b878ac:	00 
      b878ad:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      b878b2:	4d 89 fc             	mov    r12,r15
      b878b5:	eb 14                	jmp    b878cb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd486b>
      b878b7:	48 89 84 24 78 06 00 	mov    QWORD PTR [rsp+0x678],rax
      b878be:	00 
      b878bf:	48 83 a4 24 80 06 00 	and    QWORD PTR [rsp+0x680],0x0
      b878c6:	00 00 
      b878c8:	45 31 e4             	xor    r12d,r12d
      b878cb:	4c 8b ac 24 d8 00 00 	mov    r13,QWORD PTR [rsp+0xd8]
      b878d2:	00 
      b878d3:	48 8d 05 ee 66 c8 00 	lea    rax,[rip+0xc866ee]        # 180dfc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3c88>
      b878da:	48 89 84 24 70 06 00 	mov    QWORD PTR [rsp+0x670],rax
      b878e1:	00 
      b878e2:	48 89 9c 24 90 06 00 	mov    QWORD PTR [rsp+0x690],rbx
      b878e9:	00 
      b878ea:	48 89 df             	mov    rdi,rbx
      b878ed:	48 8b 74 24 70       	mov    rsi,QWORD PTR [rsp+0x70]
      b878f2:	e8 2f 0a 00 00       	call   b88326 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd52c6>
      b878f7:	48 89 df             	mov    rdi,rbx
      b878fa:	e8 6b 26 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b878ff:	4c 89 e7             	mov    rdi,r12
      b87902:	e8 7f 6b f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87907:	4c 89 ff             	mov    rdi,r15
      b8790a:	e8 77 6b f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b8790f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b87914:	e8 6d 6b f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87919:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
      b8791e:	e8 63 6b f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87923:	48 8d bc 24 d8 02 00 	lea    rdi,[rsp+0x2d8]
      b8792a:	00 
      b8792b:	e8 fc 0a 00 00       	call   b8842c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd53cc>
      b87930:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      b87935:	e8 4c 6b f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b8793a:	48 8d bc 24 38 04 00 	lea    rdi,[rsp+0x438]
      b87941:	00 
      b87942:	e8 49 65 c6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b87947:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
      b8794e:	00 
      b8794f:	e8 04 07 00 00       	call   b88058 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4ff8>
      b87954:	31 ff                	xor    edi,edi
      b87956:	e8 2b 6b f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b8795b:	31 ff                	xor    edi,edi
      b8795d:	e8 24 6b f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87962:	4d 89 75 00          	mov    QWORD PTR [r13+0x0],r14
      b87966:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
      b8796d:	00 
      b8796e:	e8 1d 65 c6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b87973:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
      b8797a:	00 
      b8797b:	e8 10 65 c6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b87980:	31 ff                	xor    edi,edi
      b87982:	e8 ff 6a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87987:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]
      b8798e:	00 
      b8798f:	e8 f2 6a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87994:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
      b8799b:	00 
      b8799c:	e8 ef 64 c6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b879a1:	48 8d bc 24 80 04 00 	lea    rdi,[rsp+0x480]
      b879a8:	00 
      b879a9:	e8 7c 9e f4 ff       	call   ad182a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e7ca>
      b879ae:	48 8d bc 24 50 04 00 	lea    rdi,[rsp+0x450]
      b879b5:	00 
      b879b6:	e8 af 25 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b879bb:	48 8b bc 24 88 01 00 	mov    rdi,QWORD PTR [rsp+0x188]
      b879c2:	00 
      b879c3:	e8 be 6a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b879c8:	48 8d bc 24 68 01 00 	lea    rdi,[rsp+0x168]
      b879cf:	00 
      b879d0:	e8 bb 64 c6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b879d5:	48 8b bc 24 98 01 00 	mov    rdi,QWORD PTR [rsp+0x198]
      b879dc:	00 
      b879dd:	e8 a4 6a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b879e2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b879e9:	00 00 
      b879eb:	48 3b 84 24 50 08 00 	cmp    rax,QWORD PTR [rsp+0x850]
      b879f2:	00 
      b879f3:	0f 85 44 05 00 00    	jne    b87f3d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4edd>
      b879f9:	4c 89 e8             	mov    rax,r13
      b879fc:	48 81 c4 58 08 00 00 	add    rsp,0x858
      b87a03:	5b                   	pop    rbx
      b87a04:	41 5c                	pop    r12
      b87a06:	41 5d                	pop    r13
      b87a08:	41 5e                	pop    r14
      b87a0a:	41 5f                	pop    r15
      b87a0c:	5d                   	pop    rbp
      b87a0d:	c3                   	ret
      b87a0e:	e9 76 03 00 00       	jmp    b87d89 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4d29>
      b87a13:	e9 71 03 00 00       	jmp    b87d89 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4d29>
      b87a18:	48 89 c5             	mov    rbp,rax
      b87a1b:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
      b87a22:	00 
      b87a23:	e8 d4 08 00 00       	call   b882fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd529c>
      b87a28:	eb 2a                	jmp    b87a54 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd49f4>
      b87a2a:	48 89 c5             	mov    rbp,rax
      b87a2d:	48 8b bc 24 18 05 00 	mov    rdi,QWORD PTR [rsp+0x518]
      b87a34:	00 
      b87a35:	e8 4c 6a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87a3a:	48 8b bc 24 08 05 00 	mov    rdi,QWORD PTR [rsp+0x508]
      b87a41:	00 
      b87a42:	e8 3f 6a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87a47:	48 8b bc 24 f8 04 00 	mov    rdi,QWORD PTR [rsp+0x4f8]
      b87a4e:	00 
      b87a4f:	e8 32 6a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87a54:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]
      b87a5b:	00 
      b87a5c:	e8 09 25 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b87a61:	eb 03                	jmp    b87a66 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4a06>
      b87a63:	48 89 c5             	mov    rbp,rax
      b87a66:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
      b87a6d:	00 
      b87a6e:	e8 89 08 00 00       	call   b882fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd529c>
      b87a73:	eb 2a                	jmp    b87a9f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4a3f>
      b87a75:	48 89 c5             	mov    rbp,rax
      b87a78:	48 8b bc 24 a8 05 00 	mov    rdi,QWORD PTR [rsp+0x5a8]
      b87a7f:	00 
      b87a80:	e8 01 6a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87a85:	48 8b bc 24 98 05 00 	mov    rdi,QWORD PTR [rsp+0x598]
      b87a8c:	00 
      b87a8d:	e8 f4 69 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87a92:	48 8b bc 24 88 05 00 	mov    rdi,QWORD PTR [rsp+0x588]
      b87a99:	00 
      b87a9a:	e8 e7 69 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87a9f:	48 8d bc 24 a8 01 00 	lea    rdi,[rsp+0x1a8]
      b87aa6:	00 
      b87aa7:	eb 3c                	jmp    b87ae5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4a85>
      b87aa9:	48 89 c5             	mov    rbp,rax
      b87aac:	eb 3c                	jmp    b87aea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4a8a>
      b87aae:	48 89 c5             	mov    rbp,rax
      b87ab1:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      b87ab8:	00 
      b87ab9:	e8 d0 07 00 00       	call   b8828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd522e>
      b87abe:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
      b87ac5:	00 
      b87ac6:	e8 9f 24 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b87acb:	eb 03                	jmp    b87ad0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4a70>
      b87acd:	48 89 c5             	mov    rbp,rax
      b87ad0:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      b87ad7:	00 
      b87ad8:	e8 b1 07 00 00       	call   b8828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd522e>
      b87add:	48 8d bc 24 c0 02 00 	lea    rdi,[rsp+0x2c0]
      b87ae4:	00 
      b87ae5:	e8 a6 63 c6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b87aea:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b87aef:	e8 92 69 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87af4:	66 0f 6f 84 24 a0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xa0]
      b87afb:	00 00 
      b87afd:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      b87b04:	e8 7d 69 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87b09:	48 8d bc 24 d8 02 00 	lea    rdi,[rsp+0x2d8]
      b87b10:	00 
      b87b11:	e8 16 09 00 00       	call   b8842c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd53cc>
      b87b16:	66 0f ef c0          	pxor   xmm0,xmm0
      b87b1a:	66 0f 7f 44 24 50    	movdqa XMMWORD PTR [rsp+0x50],xmm0
      b87b20:	e9 a9 02 00 00       	jmp    b87dce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4d6e>
      b87b25:	48 89 c5             	mov    rbp,rax
      b87b28:	66 0f 6f 84 24 c0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xc0]
      b87b2f:	00 00 
      b87b31:	66 48 0f 3a 16 44 24 	pextrq QWORD PTR [rsp+0x18],xmm0,0x1
      b87b38:	18 01 
      b87b3a:	eb ae                	jmp    b87aea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4a8a>
      b87b3c:	48 89 c5             	mov    rbp,rax
      b87b3f:	eb b3                	jmp    b87af4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4a94>
      b87b41:	48 89 c5             	mov    rbp,rax
      b87b44:	eb c3                	jmp    b87b09 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4aa9>
      b87b46:	48 89 c5             	mov    rbp,rax
      b87b49:	4c 89 ef             	mov    rdi,r13
      b87b4c:	e8 3f 63 c6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b87b51:	eb 03                	jmp    b87b56 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4af6>
      b87b53:	48 89 c5             	mov    rbp,rax
      b87b56:	4c 89 e7             	mov    rdi,r12
      b87b59:	e8 32 63 c6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b87b5e:	eb 03                	jmp    b87b63 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4b03>
      b87b60:	48 89 c5             	mov    rbp,rax
      b87b63:	48 8b bc 24 d8 03 00 	mov    rdi,QWORD PTR [rsp+0x3d8]
      b87b6a:	00 
      b87b6b:	e8 2e 6c f1 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
      b87b70:	eb 03                	jmp    b87b75 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4b15>
      b87b72:	48 89 c5             	mov    rbp,rax
      b87b75:	48 8d bc 24 b8 03 00 	lea    rdi,[rsp+0x3b8]
      b87b7c:	00 
      b87b7d:	e8 0e 63 c6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b87b82:	eb 03                	jmp    b87b87 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4b27>
      b87b84:	48 89 c5             	mov    rbp,rax
      b87b87:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
      b87b8e:	00 
      b87b8f:	e8 fc 62 c6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b87b94:	48 89 df             	mov    rdi,rbx
      b87b97:	e8 f4 62 c6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b87b9c:	48 8b bc 24 70 03 00 	mov    rdi,QWORD PTR [rsp+0x370]
      b87ba3:	00 
      b87ba4:	e8 dd 68 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87ba9:	48 8b bc 24 60 03 00 	mov    rdi,QWORD PTR [rsp+0x360]
      b87bb0:	00 
      b87bb1:	e8 d0 68 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87bb6:	48 8b bc 24 50 03 00 	mov    rdi,QWORD PTR [rsp+0x350]
      b87bbd:	00 
      b87bbe:	e8 c3 68 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87bc3:	48 8b bc 24 40 03 00 	mov    rdi,QWORD PTR [rsp+0x340]
      b87bca:	00 
      b87bcb:	e8 b6 68 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87bd0:	48 8b bc 24 30 03 00 	mov    rdi,QWORD PTR [rsp+0x330]
      b87bd7:	00 
      b87bd8:	e8 a9 68 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87bdd:	48 8b bc 24 00 03 00 	mov    rdi,QWORD PTR [rsp+0x300]
      b87be4:	00 
      b87be5:	e8 9c 68 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87bea:	48 8b bc 24 f0 02 00 	mov    rdi,QWORD PTR [rsp+0x2f0]
      b87bf1:	00 
      b87bf2:	e8 8f 68 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87bf7:	48 8b bc 24 e0 02 00 	mov    rdi,QWORD PTR [rsp+0x2e0]
      b87bfe:	00 
      b87bff:	e8 82 68 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87c04:	66 0f ef c0          	pxor   xmm0,xmm0
      b87c08:	66 0f 7f 84 24 e0 00 	movdqa XMMWORD PTR [rsp+0xe0],xmm0
      b87c0f:	00 00 
      b87c11:	66 0f 7f 44 24 50    	movdqa XMMWORD PTR [rsp+0x50],xmm0
      b87c17:	e9 9d 01 00 00       	jmp    b87db9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4d59>
      b87c1c:	48 89 c5             	mov    rbp,rax
      b87c1f:	e9 70 ff ff ff       	jmp    b87b94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4b34>
      b87c24:	48 89 c5             	mov    rbp,rax
      b87c27:	e9 70 ff ff ff       	jmp    b87b9c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4b3c>
      b87c2c:	e9 70 01 00 00       	jmp    b87da1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4d41>
      b87c31:	48 89 c5             	mov    rbp,rax
      b87c34:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      b87c3b:	00 
      b87c3c:	e8 a7 2b c5 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      b87c41:	48 8b bc 24 e8 02 00 	mov    rdi,QWORD PTR [rsp+0x2e8]
      b87c48:	00 
      b87c49:	e8 38 68 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87c4e:	49 8b 7f 18          	mov    rdi,QWORD PTR [r15+0x18]
      b87c52:	e8 2f 68 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87c57:	4c 89 ff             	mov    rdi,r15
      b87c5a:	e8 75 1f c5 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      b87c5f:	4c 89 ff             	mov    rdi,r15
      b87c62:	e8 b9 62 c6 00       	call   17edf20 <_ZdlPv@plt>
      b87c67:	e9 6f 01 00 00       	jmp    b87ddb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4d7b>
      b87c6c:	e9 30 01 00 00       	jmp    b87da1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4d41>
      b87c71:	e9 2b 01 00 00       	jmp    b87da1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4d41>
      b87c76:	48 89 c5             	mov    rbp,rax
      b87c79:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      b87c80:	00 
      b87c81:	e8 e4 22 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b87c86:	48 89 df             	mov    rdi,rbx
      b87c89:	e8 82 63 c6 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      b87c8e:	48 89 df             	mov    rdi,rbx
      b87c91:	e8 86 67 f1 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      b87c96:	eb 03                	jmp    b87c9b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4c3b>
      b87c98:	48 89 c5             	mov    rbp,rax
      b87c9b:	48 8d bc 24 f0 02 00 	lea    rdi,[rsp+0x2f0]
      b87ca2:	00 
      b87ca3:	e8 80 3a ef ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
      b87ca8:	e9 38 01 00 00       	jmp    b87de5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4d85>
      b87cad:	48 89 c5             	mov    rbp,rax
      b87cb0:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      b87cb7:	00 
      b87cb8:	e8 a1 0c f4 ff       	call   ac895e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x158fe>
      b87cbd:	e9 de 01 00 00       	jmp    b87ea0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4e40>
      b87cc2:	e9 e7 00 00 00       	jmp    b87dae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4d4e>
      b87cc7:	eb 00                	jmp    b87cc9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4c69>
      b87cc9:	48 89 c5             	mov    rbp,rax
      b87ccc:	e9 e9 01 00 00       	jmp    b87eba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4e5a>
      b87cd1:	eb 04                	jmp    b87cd7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4c77>
      b87cd3:	eb 02                	jmp    b87cd7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4c77>
      b87cd5:	eb 00                	jmp    b87cd7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4c77>
      b87cd7:	48 89 c5             	mov    rbp,rax
      b87cda:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      b87ce1:	00 
      b87ce2:	e8 01 2b c5 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      b87ce7:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
      b87cee:	00 
      b87cef:	e8 72 21 c5 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      b87cf4:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
      b87cf9:	e8 68 21 c5 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      b87cfe:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
      b87d03:	e8 5e 21 c5 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      b87d08:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      b87d0d:	e8 54 21 c5 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      b87d12:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      b87d19:	00 
      b87d1a:	e8 47 21 c5 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      b87d1f:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      b87d26:	00 
      b87d27:	e8 3a 21 c5 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      b87d2c:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
      b87d31:	e8 30 21 c5 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      b87d36:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
      b87d3d:	00 
      b87d3e:	e8 23 21 c5 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      b87d43:	48 8b 7b 70          	mov    rdi,QWORD PTR [rbx+0x70]
      b87d47:	e8 20 1f 00 00       	call   b89c6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6c0c>
      b87d4c:	4c 89 e7             	mov    rdi,r12
      b87d4f:	e8 80 1e c5 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      b87d54:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      b87d59:	e8 76 1e c5 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      b87d5e:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b87d63:	e8 6c 1e c5 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      b87d68:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
      b87d6d:	e8 62 1e c5 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      b87d72:	48 89 df             	mov    rdi,rbx
      b87d75:	e8 96 62 c6 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      b87d7a:	48 89 df             	mov    rdi,rbx
      b87d7d:	e8 9a 66 f1 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      b87d82:	e9 40 01 00 00       	jmp    b87ec7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4e67>
      b87d87:	eb 00                	jmp    b87d89 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4d29>
      b87d89:	48 89 c7             	mov    rdi,rax
      b87d8c:	e8 14 1d ef ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      b87d91:	48 89 c5             	mov    rbp,rax
      b87d94:	e9 48 01 00 00       	jmp    b87ee1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4e81>
      b87d99:	48 89 c5             	mov    rbp,rax
      b87d9c:	e9 74 01 00 00       	jmp    b87f15 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4eb5>
      b87da1:	48 89 c5             	mov    rbp,rax
      b87da4:	eb 35                	jmp    b87ddb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4d7b>
      b87da6:	48 89 c5             	mov    rbp,rax
      b87da9:	e9 19 01 00 00       	jmp    b87ec7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4e67>
      b87dae:	48 89 c5             	mov    rbp,rax
      b87db1:	e9 ea 00 00 00       	jmp    b87ea0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4e40>
      b87db6:	48 89 c5             	mov    rbp,rax
      b87db9:	66 0f 6f 84 24 e0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xe0]
      b87dc0:	00 00 
      b87dc2:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      b87dc9:	e8 b8 66 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87dce:	66 0f ef c0          	pxor   xmm0,xmm0
      b87dd2:	66 0f 7f 84 24 e0 00 	movdqa XMMWORD PTR [rsp+0xe0],xmm0
      b87dd9:	00 00 
      b87ddb:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      b87de0:	e8 a1 66 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87de5:	48 8d bc 24 38 04 00 	lea    rdi,[rsp+0x438]
      b87dec:	00 
      b87ded:	e8 9e 60 c6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b87df2:	49 8b be 60 03 00 00 	mov    rdi,QWORD PTR [r14+0x360]
      b87df9:	e8 88 66 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87dfe:	49 8b be 50 03 00 00 	mov    rdi,QWORD PTR [r14+0x350]
      b87e05:	e8 7c 66 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87e0a:	49 8b be 40 03 00 00 	mov    rdi,QWORD PTR [r14+0x340]
      b87e11:	e8 70 66 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87e16:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      b87e1d:	00 
      b87e1e:	e8 d3 02 00 00       	call   b880f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5096>
      b87e23:	49 8b be 28 03 00 00 	mov    rdi,QWORD PTR [r14+0x328]
      b87e2a:	e8 57 66 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87e2f:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
      b87e34:	e8 31 21 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b87e39:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
      b87e3e:	e8 2b 04 00 00       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      b87e43:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      b87e48:	e8 21 04 00 00       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      b87e4d:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      b87e54:	00 
      b87e55:	e8 46 5b 94 00       	call   14cd9a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x312f24>
      b87e5a:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
      b87e61:	00 
      b87e62:	e8 f1 01 00 00       	call   b88058 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4ff8>
      b87e67:	66 0f 6f 84 24 e0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xe0]
      b87e6e:	00 00 
      b87e70:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      b87e77:	e8 0a 66 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87e7c:	66 0f 6f 44 24 50    	movdqa xmm0,XMMWORD PTR [rsp+0x50]
      b87e82:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      b87e89:	e8 f8 65 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87e8e:	4c 89 f7             	mov    rdi,r14
      b87e91:	e8 8a 60 c6 00       	call   17edf20 <_ZdlPv@plt>
      b87e96:	31 c0                	xor    eax,eax
      b87e98:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
      b87e9f:	00 
      b87ea0:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
      b87ea7:	00 
      b87ea8:	e8 e3 5f c6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b87ead:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
      b87eb4:	00 
      b87eb5:	e8 d6 5f c6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b87eba:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      b87ec1:	00 
      b87ec2:	e8 bf 65 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87ec7:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]
      b87ece:	00 
      b87ecf:	e8 b2 65 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87ed4:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
      b87edb:	00 
      b87edc:	e8 af 5f c6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b87ee1:	48 8d bc 24 80 04 00 	lea    rdi,[rsp+0x480]
      b87ee8:	00 
      b87ee9:	e8 3c 99 f4 ff       	call   ad182a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e7ca>
      b87eee:	48 8d bc 24 50 04 00 	lea    rdi,[rsp+0x450]
      b87ef5:	00 
      b87ef6:	e8 6f 20 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b87efb:	48 8b bc 24 88 01 00 	mov    rdi,QWORD PTR [rsp+0x188]
      b87f02:	00 
      b87f03:	e8 7e 65 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87f08:	48 8d bc 24 68 01 00 	lea    rdi,[rsp+0x168]
      b87f0f:	00 
      b87f10:	e8 7b 5f c6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b87f15:	48 8b bc 24 98 01 00 	mov    rdi,QWORD PTR [rsp+0x198]
      b87f1c:	00 
      b87f1d:	e8 64 65 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b87f22:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b87f29:	00 00 
      b87f2b:	48 3b 84 24 50 08 00 	cmp    rax,QWORD PTR [rsp+0x850]
      b87f32:	00 
      b87f33:	75 08                	jne    b87f3d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4edd>
      b87f35:	48 89 ef             	mov    rdi,rbp
      b87f38:	e8 93 7d ee ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      b87f3d:	e8 6e 7b c6 00       	call   17efab0 <__stack_chk_fail@plt>

## Allocations and nearby vptr stores
### allocation @0xb861ee
      b861c2:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      b861c5:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
      b861cc:	00 
      b861cd:	48 8d 94 24 40 01 00 	lea    rdx,[rsp+0x140]
      b861d4:	00 
      b861d5:	48 89 de             	mov    rsi,rbx
      b861d8:	ff 50 28             	call   QWORD PTR [rax+0x28]
      b861db:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      b861e0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b861e3:	ff 50 40             	call   QWORD PTR [rax+0x40]
      b861e6:	49 89 c7             	mov    r15,rax
      b861e9:	bf 40 03 00 00       	mov    edi,0x340
      b861ee:	e8 0d 7d c6 00       	call   17edf00 <_Znwm@plt>
      b861f3:	48 89 c3             	mov    rbx,rax
      b861f6:	66 0f ef c0          	pxor   xmm0,xmm0
      b861fa:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      b861ff:	48 8d 05 62 72 c7 00 	lea    rax,[rip+0xc77262]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      b86206:	48 89 03             	mov    QWORD PTR [rbx],rax
      b86209:	48 8d 05 00 7e c8 00 	lea    rax,[rip+0xc87e00]        # 180e010 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3cd0>
      b86210:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      b86214:	4c 89 7b 20          	mov    QWORD PTR [rbx+0x20],r15
      b86218:	4c 8d 7b 28          	lea    r15,[rbx+0x28]
      b8621c:	4c 89 ff             	mov    rdi,r15
      b8621f:	e8 d2 37 c5 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      b86224:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
      b86228:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
      b8622d:	e8 c4 37 c5 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      b86232:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
      b86236:	48 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],rdi
      b8623b:	e8 b6 37 c5 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      b86240:	4c 8d 63 58          	lea    r12,[rbx+0x58]
      b86244:	4c 89 e7             	mov    rdi,r12
      b86247:	e8 aa 37 c5 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      b8624c:	48 8d 43 70          	lea    rax,[rbx+0x70]
      b86250:	66 0f ef c0          	pxor   xmm0,xmm0
      b86254:	f3 0f 7f 43 70       	movdqu XMMWORD PTR [rbx+0x70],xmm0
      b86259:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
      b8625d:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
      b86264:	48 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdi
      b8626b:	00 
      b8626c:	e8 1d 20 fa ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      b86271:	48 8d bb d8 00 00 00 	lea    rdi,[rbx+0xd8]
      b86278:	48 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],rdi
      b8627d:	e8 42 34 00 00       	call   b896c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6664>

### allocation @0xb86690
      b86664:	4c 89 ff             	mov    rdi,r15
      b86667:	e8 f2 22 f4 ff       	call   ac895e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x158fe>
      b8666c:	49 8b 2e             	mov    rbp,QWORD PTR [r14]
      b8666f:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
      b86674:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b86677:	ff 50 28             	call   QWORD PTR [rax+0x28]
      b8667a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      b8667d:	48 89 c7             	mov    rdi,rax
      b86680:	ff 51 40             	call   QWORD PTR [rcx+0x40]
      b86683:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
      b8668a:	00 
      b8668b:	bf 70 03 00 00       	mov    edi,0x370
      b86690:	e8 6b 78 c6 00       	call   17edf00 <_Znwm@plt>
      b86695:	49 89 c6             	mov    r14,rax
      b86698:	0f 28 84 24 80 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x180]
      b8669f:	00 
      b866a0:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
      b866a5:	0f 57 c0             	xorps  xmm0,xmm0
      b866a8:	0f 29 84 24 80 01 00 	movaps XMMWORD PTR [rsp+0x180],xmm0
      b866af:	00 
      b866b0:	f3 0f 7e 84 24 a0 00 	movq   xmm0,QWORD PTR [rsp+0xa0]
      b866b7:	00 00 
      b866b9:	f3 0f 7e 4c 24 40    	movq   xmm1,QWORD PTR [rsp+0x40]
      b866bf:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      b866c3:	66 0f 7f 8c 24 e0 00 	movdqa XMMWORD PTR [rsp+0xe0],xmm1
      b866ca:	00 00 
      b866cc:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      b866d1:	48 89 84 24 d0 04 00 	mov    QWORD PTR [rsp+0x4d0],rax
      b866d8:	00 
      b866d9:	48 8d 05 84 5d ef ff 	lea    rax,[rip+0xffffffffffef5d84]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      b866e0:	48 89 84 24 e0 04 00 	mov    QWORD PTR [rsp+0x4e0],rax
      b866e7:	00 
      b866e8:	48 8d 05 51 19 00 00 	lea    rax,[rip+0x1951]        # b88040 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fe0>
      b866ef:	48 89 84 24 e8 04 00 	mov    QWORD PTR [rsp+0x4e8],rax
      b866f6:	00 
      b866f7:	41 c6 46 08 00       	mov    BYTE PTR [r14+0x8],0x0
      b866fc:	48 8d 05 d5 75 c8 00 	lea    rax,[rip+0xc875d5]        # 180dcd8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3998>
      b86703:	49 89 06             	mov    QWORD PTR [r14],rax
      b86706:	49 8d 7e 10          	lea    rdi,[r14+0x10]
      b8670a:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
      b86711:	00 
      b86712:	e8 2f 72 94 00       	call   14cd946 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x312eca>
      b86717:	49 83 a6 00 02 00 00 	and    QWORD PTR [r14+0x200],0x0
      b8671e:	00 

### allocation @0xb868a5
      b86878:	e8 e1 0c a6 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
      b8687d:	4c 8b ac 24 c0 00 00 	mov    r13,QWORD PTR [rsp+0xc0]
      b86884:	00 
      b86885:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      b86889:	48 8d 9c 24 d8 02 00 	lea    rbx,[rsp+0x2d8]
      b86890:	00 
      b86891:	48 89 df             	mov    rdi,rbx
      b86894:	4c 89 ee             	mov    rsi,r13
      b86897:	ff 50 18             	call   QWORD PTR [rax+0x18]
      b8689a:	44 8b 23             	mov    r12d,DWORD PTR [rbx]
      b8689d:	8b 5b 0c             	mov    ebx,DWORD PTR [rbx+0xc]
      b868a0:	bf 80 00 00 00       	mov    edi,0x80
      b868a5:	e8 56 76 c6 00       	call   17edf00 <_Znwm@plt>
      b868aa:	41 ff cc             	dec    r12d
      b868ad:	41 83 fc fe          	cmp    r12d,0xfffffffe
      b868b1:	0f 92 c2             	setb   dl
      b868b4:	20 da                	and    dl,bl
      b868b6:	66 0f ef c0          	pxor   xmm0,xmm0
      b868ba:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      b868bf:	48 8d 0d 02 45 c8 00 	lea    rcx,[rip+0xc84502]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
      b868c6:	48 89 08             	mov    QWORD PTR [rax],rcx
      b868c9:	48 89 c7             	mov    rdi,rax
      b868cc:	48 83 c7 20          	add    rdi,0x20
      b868d0:	48 8d 0d 79 74 c8 00 	lea    rcx,[rip+0xc87479]        # 180dd50 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3a10>
      b868d7:	48 89 8c 24 70 06 00 	mov    QWORD PTR [rsp+0x670],rcx
      b868de:	00 
      b868df:	4c 89 ac 24 78 06 00 	mov    QWORD PTR [rsp+0x678],r13
      b868e6:	00 
      b868e7:	4c 89 bc 24 90 06 00 	mov    QWORD PTR [rsp+0x690],r15
      b868ee:	00 
      b868ef:	0f b6 d2             	movzx  edx,dl
      b868f2:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
      b868f7:	4c 89 fe             	mov    rsi,r15
      b868fa:	48 89 c3             	mov    rbx,rax
      b868fd:	e8 4a 13 94 00       	call   14c7c4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d1d0>
      b86902:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      b86909:	00 
      b8690a:	e8 5b 36 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b8690f:	31 ff                	xor    edi,edi
      b86911:	e8 06 7b f1 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      b86916:	48 8d bc 24 f0 02 00 	lea    rdi,[rsp+0x2f0]
      b8691d:	00 
      b8691e:	e8 05 4e ef ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
      b86923:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]

### allocation @0xb86939
      b8690f:	31 ff                	xor    edi,edi
      b86911:	e8 06 7b f1 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      b86916:	48 8d bc 24 f0 02 00 	lea    rdi,[rsp+0x2f0]
      b8691d:	00 
      b8691e:	e8 05 4e ef ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
      b86923:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
      b86928:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b8692b:	48 89 5c 24 20       	mov    QWORD PTR [rsp+0x20],rbx
      b86930:	ff 50 28             	call   QWORD PTR [rax+0x28]
      b86933:	49 89 c7             	mov    r15,rax
      b86936:	6a 50                	push   0x50
      b86938:	5f                   	pop    rdi
      b86939:	e8 c2 75 c6 00       	call   17edf00 <_Znwm@plt>
      b8693e:	66 0f ef c0          	pxor   xmm0,xmm0
      b86942:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      b86947:	48 8d 0d 82 25 cf 00 	lea    rcx,[rip+0xcf2582]        # 1878ed0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x355b8>
      b8694e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b86951:	48 8d 0d b0 25 cf 00 	lea    rcx,[rip+0xcf25b0]        # 1878f08 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x355f0>
      b86958:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
      b8695c:	4c 89 78 20          	mov    QWORD PTR [rax+0x20],r15
      b86960:	f3 0f 7f 40 28       	movdqu XMMWORD PTR [rax+0x28],xmm0
      b86965:	f3 0f 7f 40 38       	movdqu XMMWORD PTR [rax+0x38],xmm0
      b8696a:	c7 40 48 00 00 80 3f 	mov    DWORD PTR [rax+0x48],0x3f800000
      b86971:	66 48 0f 6e c0       	movq   xmm0,rax
      b86976:	48 83 c0 18          	add    rax,0x18
      b8697a:	66 48 0f 6e c8       	movq   xmm1,rax
      b8697f:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      b86983:	49 8b be 28 03 00 00 	mov    rdi,QWORD PTR [r14+0x328]
      b8698a:	66 41 0f 7f 8e 20 03 	movdqa XMMWORD PTR [r14+0x320],xmm1
      b86991:	00 00 
      b86993:	e8 ee 7a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86998:	31 ff                	xor    edi,edi
      b8699a:	e8 e7 7a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b8699f:	bf 38 01 00 00       	mov    edi,0x138
      b869a4:	e8 57 75 c6 00       	call   17edf00 <_Znwm@plt>
      b869a9:	49 89 c7             	mov    r15,rax
      b869ac:	66 0f ef c0          	pxor   xmm0,xmm0
      b869b0:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      b869b5:	48 8d 05 ac 6a c7 00 	lea    rax,[rip+0xc76aac]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      b869bc:	49 89 07             	mov    QWORD PTR [r15],rax
      b869bf:	49 8d 5f 18          	lea    rbx,[r15+0x18]
      b869c3:	48 8d 05 be 38 cf 00 	lea    rax,[rip+0xcf38be]        # 187a288 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36970>
      b869ca:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      b869ce:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]

### allocation @0xb869a4
      b8696a:	c7 40 48 00 00 80 3f 	mov    DWORD PTR [rax+0x48],0x3f800000
      b86971:	66 48 0f 6e c0       	movq   xmm0,rax
      b86976:	48 83 c0 18          	add    rax,0x18
      b8697a:	66 48 0f 6e c8       	movq   xmm1,rax
      b8697f:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      b86983:	49 8b be 28 03 00 00 	mov    rdi,QWORD PTR [r14+0x328]
      b8698a:	66 41 0f 7f 8e 20 03 	movdqa XMMWORD PTR [r14+0x320],xmm1
      b86991:	00 00 
      b86993:	e8 ee 7a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86998:	31 ff                	xor    edi,edi
      b8699a:	e8 e7 7a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b8699f:	bf 38 01 00 00       	mov    edi,0x138
      b869a4:	e8 57 75 c6 00       	call   17edf00 <_Znwm@plt>
      b869a9:	49 89 c7             	mov    r15,rax
      b869ac:	66 0f ef c0          	pxor   xmm0,xmm0
      b869b0:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      b869b5:	48 8d 05 ac 6a c7 00 	lea    rax,[rip+0xc76aac]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      b869bc:	49 89 07             	mov    QWORD PTR [r15],rax
      b869bf:	49 8d 5f 18          	lea    rbx,[r15+0x18]
      b869c3:	48 8d 05 be 38 cf 00 	lea    rax,[rip+0xcf38be]        # 187a288 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36970>
      b869ca:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      b869ce:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
      b869d5:	00 
      b869d6:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      b869da:	49 8d 7f 28          	lea    rdi,[r15+0x28]
      b869de:	e8 69 e3 94 00       	call   14d4d4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a2d0>
      b869e3:	49 8d bf 80 00 00 00 	lea    rdi,[r15+0x80]
      b869ea:	e8 5d e3 94 00       	call   14d4d4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a2d0>
      b869ef:	4c 89 ff             	mov    rdi,r15
      b869f2:	48 81 c7 d8 00 00 00 	add    rdi,0xd8
      b869f9:	e8 04 68 f3 ff       	call   abd202 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1a2>
      b869fe:	41 c6 87 30 01 00 00 	mov    BYTE PTR [r15+0x130],0x0
      b86a05:	00 
      b86a06:	49 89 9e 38 03 00 00 	mov    QWORD PTR [r14+0x338],rbx
      b86a0d:	49 8b be 40 03 00 00 	mov    rdi,QWORD PTR [r14+0x340]
      b86a14:	4d 89 be 40 03 00 00 	mov    QWORD PTR [r14+0x340],r15
      b86a1b:	e8 66 7a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86a20:	31 ff                	xor    edi,edi
      b86a22:	e8 5f 7a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86a27:	6a 20                	push   0x20
      b86a29:	5f                   	pop    rdi
      b86a2a:	e8 d1 74 c6 00       	call   17edf00 <_Znwm@plt>
      b86a2f:	49 89 c7             	mov    r15,rax
      b86a32:	48 89 c7             	mov    rdi,rax

### allocation @0xb86a2a
      b869f2:	48 81 c7 d8 00 00 00 	add    rdi,0xd8
      b869f9:	e8 04 68 f3 ff       	call   abd202 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1a2>
      b869fe:	41 c6 87 30 01 00 00 	mov    BYTE PTR [r15+0x130],0x0
      b86a05:	00 
      b86a06:	49 89 9e 38 03 00 00 	mov    QWORD PTR [r14+0x338],rbx
      b86a0d:	49 8b be 40 03 00 00 	mov    rdi,QWORD PTR [r14+0x340]
      b86a14:	4d 89 be 40 03 00 00 	mov    QWORD PTR [r14+0x340],r15
      b86a1b:	e8 66 7a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86a20:	31 ff                	xor    edi,edi
      b86a22:	e8 5f 7a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86a27:	6a 20                	push   0x20
      b86a29:	5f                   	pop    rdi
      b86a2a:	e8 d1 74 c6 00       	call   17edf00 <_Znwm@plt>
      b86a2f:	49 89 c7             	mov    r15,rax
      b86a32:	48 89 c7             	mov    rdi,rax
      b86a35:	e8 bc 2f c5 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      b86a3a:	66 0f ef c0          	pxor   xmm0,xmm0
      b86a3e:	f3 41 0f 7f 47 10    	movdqu XMMWORD PTR [r15+0x10],xmm0
      b86a44:	4d 8b a6 38 03 00 00 	mov    r12,QWORD PTR [r14+0x338]
      b86a4b:	4c 89 bc 24 d8 02 00 	mov    QWORD PTR [rsp+0x2d8],r15
      b86a52:	00 
      b86a53:	49 8b 86 28 03 00 00 	mov    rax,QWORD PTR [r14+0x328]
      b86a5a:	f3 41 0f 6f 86 20 03 	movdqu xmm0,XMMWORD PTR [r14+0x320]
      b86a61:	00 00 
      b86a63:	f3 0f 7f 84 24 e0 02 	movdqu XMMWORD PTR [rsp+0x2e0],xmm0
      b86a6a:	00 00 
      b86a6c:	48 85 c0             	test   rax,rax
      b86a6f:	74 05                	je     b86a76 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd3a16>
      b86a71:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b86a76:	48 8d 35 1b d2 f6 ff 	lea    rsi,[rip+0xfffffffffff6d21b]        # af3c98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x40c38>
      b86a7d:	48 8d 15 2e 7f f2 ff 	lea    rdx,[rip+0xfffffffffff27f2e]        # aae9b2 <JNI_OnUnload@@Base+0x3627f>
      b86a84:	48 8d 0d 2f 29 94 00 	lea    rcx,[rip+0x94292f]        # 14c93ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e93e>
      b86a8b:	48 8d 9c 24 70 06 00 	lea    rbx,[rsp+0x670]
      b86a92:	00 
      b86a93:	4c 8d 84 24 d8 02 00 	lea    r8,[rsp+0x2d8]
      b86a9a:	00 
      b86a9b:	6a 18                	push   0x18
      b86a9d:	41 59                	pop    r9
      b86a9f:	48 89 df             	mov    rdi,rbx
      b86aa2:	e8 ed 3c c5 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      b86aa7:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      b86aab:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      b86ab2:	00 
      b86ab3:	4c 89 e6             	mov    rsi,r12

### allocation @0xb86b19
      b86aed:	e8 94 79 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86af2:	48 8d 9c 24 c0 01 00 	lea    rbx,[rsp+0x1c0]
      b86af9:	00 
      b86afa:	48 83 23 00          	and    QWORD PTR [rbx],0x0
      b86afe:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      b86b05:	00 
      b86b06:	4c 89 fe             	mov    rsi,r15
      b86b09:	e8 c0 15 00 00       	call   b880ce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd506e>
      b86b0e:	48 89 df             	mov    rdi,rbx
      b86b11:	e8 e0 15 00 00       	call   b880f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5096>
      b86b16:	6a 68                	push   0x68
      b86b18:	5f                   	pop    rdi
      b86b19:	e8 e2 73 c6 00       	call   17edf00 <_Znwm@plt>
      b86b1e:	49 89 c7             	mov    r15,rax
      b86b21:	66 0f ef c0          	pxor   xmm0,xmm0
      b86b25:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      b86b2a:	48 8d 05 67 72 c8 00 	lea    rax,[rip+0xc87267]        # 180dd98 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3a58>
      b86b31:	49 89 07             	mov    QWORD PTR [r15],rax
      b86b34:	49 8d 5f 18          	lea    rbx,[r15+0x18]
      b86b38:	4c 89 ff             	mov    rdi,r15
      b86b3b:	48 83 c7 28          	add    rdi,0x28
      b86b3f:	f3 41 0f 7f 47 18    	movdqu XMMWORD PTR [r15+0x18],xmm0
      b86b45:	48 8d b4 24 d0 04 00 	lea    rsi,[rsp+0x4d0]
      b86b4c:	00 
      b86b4d:	e8 ac 15 00 00       	call   b880fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd509e>
      b86b52:	49 83 67 48 00       	and    QWORD PTR [r15+0x48],0x0
      b86b57:	49 83 67 58 00       	and    QWORD PTR [r15+0x58],0x0
      b86b5c:	49 89 9e 48 03 00 00 	mov    QWORD PTR [r14+0x348],rbx
      b86b63:	49 8b be 50 03 00 00 	mov    rdi,QWORD PTR [r14+0x350]
      b86b6a:	4d 89 be 50 03 00 00 	mov    QWORD PTR [r14+0x350],r15
      b86b71:	e8 10 79 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86b76:	31 ff                	xor    edi,edi
      b86b78:	e8 09 79 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86b7d:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
      b86b84:	00 
      b86b85:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b86b88:	ff 50 28             	call   QWORD PTR [rax+0x28]
      b86b8b:	49 89 c4             	mov    r12,rax
      b86b8e:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
      b86b95:	00 
      b86b96:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b86b99:	ff 50 30             	call   QWORD PTR [rax+0x30]
      b86b9c:	49 89 c5             	mov    r13,rax
      b86b9f:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]

### allocation @0xb87349
      b87316:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
      b8731b:	48 89 84 24 a0 02 00 	mov    QWORD PTR [rsp+0x2a0],rax
      b87322:	00 
      b87323:	4c 89 ac 24 a8 02 00 	mov    QWORD PTR [rsp+0x2a8],r13
      b8732a:	00 
      b8732b:	44 88 bc 24 b0 02 00 	mov    BYTE PTR [rsp+0x2b0],r15b
      b87332:	00 
      b87333:	48 89 9c 24 b8 02 00 	mov    QWORD PTR [rsp+0x2b8],rbx
      b8733a:	00 
      b8733b:	48 83 a4 24 60 06 00 	and    QWORD PTR [rsp+0x660],0x0
      b87342:	00 00 
      b87344:	bf 88 00 00 00       	mov    edi,0x88
      b87349:	e8 b2 6b c6 00       	call   17edf00 <_Znwm@plt>
      b8734e:	48 8d 0d 7b 6a c8 00 	lea    rcx,[rip+0xc86a7b]        # 180ddd0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3a90>
      b87355:	48 89 08             	mov    QWORD PTR [rax],rcx
      b87358:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
      b8735c:	48 8b 8c 24 48 02 00 	mov    rcx,QWORD PTR [rsp+0x248]
      b87363:	00 
      b87364:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
      b87368:	48 85 c9             	test   rcx,rcx
      b8736b:	74 05                	je     b87372 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4312>
      b8736d:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b87372:	0f 10 84 24 50 02 00 	movups xmm0,XMMWORD PTR [rsp+0x250]
      b87379:	00 
      b8737a:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
      b8737e:	48 8b 8c 24 60 02 00 	mov    rcx,QWORD PTR [rsp+0x260]
      b87385:	00 
      b87386:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
      b8738a:	48 85 c9             	test   rcx,rcx
      b8738d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b87392:	74 05                	je     b87399 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4339>
      b87394:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b87399:	48 8d 94 24 78 02 00 	lea    rdx,[rsp+0x278]
      b873a0:	00 
      b873a1:	48 8b 4a f8          	mov    rcx,QWORD PTR [rdx-0x8]
      b873a5:	0f 10 42 f0          	movups xmm0,XMMWORD PTR [rdx-0x10]
      b873a9:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
      b873ad:	48 85 c9             	test   rcx,rcx
      b873b0:	74 05                	je     b873b7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4357>
      b873b2:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b873b7:	48 8d 8c 24 a0 02 00 	lea    rcx,[rsp+0x2a0]
      b873be:	00 
      b873bf:	48 8b 72 10          	mov    rsi,QWORD PTR [rdx+0x10]
      b873c3:	48 89 70 50          	mov    QWORD PTR [rax+0x50],rsi

### allocation @0xb874f0
      b874bd:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
      b874c2:	48 89 84 24 20 02 00 	mov    QWORD PTR [rsp+0x220],rax
      b874c9:	00 
      b874ca:	4c 89 ac 24 28 02 00 	mov    QWORD PTR [rsp+0x228],r13
      b874d1:	00 
      b874d2:	44 88 bc 24 30 02 00 	mov    BYTE PTR [rsp+0x230],r15b
      b874d9:	00 
      b874da:	48 89 9c 24 38 02 00 	mov    QWORD PTR [rsp+0x238],rbx
      b874e1:	00 
      b874e2:	48 83 a4 24 30 06 00 	and    QWORD PTR [rsp+0x630],0x0
      b874e9:	00 00 
      b874eb:	bf 88 00 00 00       	mov    edi,0x88
      b874f0:	e8 0b 6a c6 00       	call   17edf00 <_Znwm@plt>
      b874f5:	48 8d 0d 64 69 c8 00 	lea    rcx,[rip+0xc86964]        # 180de60 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3b20>
      b874fc:	48 89 08             	mov    QWORD PTR [rax],rcx
      b874ff:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
      b87503:	48 8b 8c 24 c8 01 00 	mov    rcx,QWORD PTR [rsp+0x1c8]
      b8750a:	00 
      b8750b:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
      b8750f:	48 85 c9             	test   rcx,rcx
      b87512:	74 05                	je     b87519 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd44b9>
      b87514:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b87519:	0f 10 84 24 d0 01 00 	movups xmm0,XMMWORD PTR [rsp+0x1d0]
      b87520:	00 
      b87521:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
      b87525:	48 8b 8c 24 e0 01 00 	mov    rcx,QWORD PTR [rsp+0x1e0]
      b8752c:	00 
      b8752d:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
      b87531:	48 85 c9             	test   rcx,rcx
      b87534:	74 05                	je     b8753b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd44db>
      b87536:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b8753b:	48 8d 94 24 f8 01 00 	lea    rdx,[rsp+0x1f8]
      b87542:	00 
      b87543:	48 8b 4a f8          	mov    rcx,QWORD PTR [rdx-0x8]
      b87547:	0f 10 42 f0          	movups xmm0,XMMWORD PTR [rdx-0x10]
      b8754b:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
      b8754f:	48 85 c9             	test   rcx,rcx
      b87552:	74 05                	je     b87559 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd44f9>
      b87554:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b87559:	48 8d 8c 24 20 02 00 	lea    rcx,[rsp+0x220]
      b87560:	00 
      b87561:	48 8b 72 10          	mov    rsi,QWORD PTR [rdx+0x10]
      b87565:	48 89 70 50          	mov    QWORD PTR [rax+0x50],rsi
      b87569:	0f 10 02             	movups xmm0,XMMWORD PTR [rdx]

### allocation @0xb876b2
      b87689:	48 85 c0             	test   rax,rax
      b8768c:	74 05                	je     b87693 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4633>
      b8768e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b87693:	48 8d 9c 24 b0 05 00 	lea    rbx,[rsp+0x5b0]
      b8769a:	00 
      b8769b:	48 89 df             	mov    rdi,rbx
      b8769e:	4c 89 e6             	mov    rsi,r12
      b876a1:	e8 ea 2b ef ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      b876a6:	48 83 a4 24 00 06 00 	and    QWORD PTR [rsp+0x600],0x0
      b876ad:	00 00 
      b876af:	6a 70                	push   0x70
      b876b1:	5f                   	pop    rdi
      b876b2:	e8 49 68 c6 00       	call   17edf00 <_Znwm@plt>
      b876b7:	49 89 c7             	mov    r15,rax
      b876ba:	48 8d 84 24 90 05 00 	lea    rax,[rsp+0x590]
      b876c1:	00 
      b876c2:	48 8d 0d df 67 c8 00 	lea    rcx,[rip+0xc867df]        # 180dea8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3b68>
      b876c9:	49 89 0f             	mov    QWORD PTR [r15],rcx
      b876cc:	48 8b 48 f8          	mov    rcx,QWORD PTR [rax-0x8]
      b876d0:	0f 28 40 f0          	movaps xmm0,XMMWORD PTR [rax-0x10]
      b876d4:	41 0f 11 47 10       	movups XMMWORD PTR [r15+0x10],xmm0
      b876d9:	48 85 c9             	test   rcx,rcx
      b876dc:	74 05                	je     b876e3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4683>
      b876de:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b876e3:	0f 28 84 24 90 05 00 	movaps xmm0,XMMWORD PTR [rsp+0x590]
      b876ea:	00 
      b876eb:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
      b876f0:	0f 57 c0             	xorps  xmm0,xmm0
      b876f3:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
      b876f6:	66 0f 6f 8c 24 a0 05 	movdqa xmm1,XMMWORD PTR [rsp+0x5a0]
      b876fd:	00 00 
      b876ff:	f3 41 0f 7f 4f 30    	movdqu XMMWORD PTR [r15+0x30],xmm1
      b87705:	0f 29 40 10          	movaps XMMWORD PTR [rax+0x10],xmm0
      b87709:	4c 89 ff             	mov    rdi,r15
      b8770c:	48 83 c7 40          	add    rdi,0x40
      b87710:	48 89 de             	mov    rsi,rbx
      b87713:	e8 a0 0b 00 00       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
      b87718:	4c 89 bc 24 00 06 00 	mov    QWORD PTR [rsp+0x600],r15
      b8771f:	00 
      b87720:	48 8b 4c 24 48       	mov    rcx,QWORD PTR [rsp+0x48]
      b87725:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      b87729:	0f 28 01             	movaps xmm0,XMMWORD PTR [rcx]
      b8772c:	0f 29 84 24 f0 04 00 	movaps XMMWORD PTR [rsp+0x4f0],xmm0
      b87733:	00 

### allocation @0xb87798
      b8776f:	66 0f 7f 84 24 10 05 	movdqa XMMWORD PTR [rsp+0x510],xmm0
      b87776:	00 00 
      b87778:	48 85 c0             	test   rax,rax
      b8777b:	74 05                	je     b87782 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4722>
      b8777d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b87782:	48 8d 9c 24 20 05 00 	lea    rbx,[rsp+0x520]
      b87789:	00 
      b8778a:	48 89 df             	mov    rdi,rbx
      b8778d:	4c 89 e6             	mov    rsi,r12
      b87790:	e8 fb 2a ef ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      b87795:	6a 70                	push   0x70
      b87797:	5f                   	pop    rdi
      b87798:	e8 63 67 c6 00       	call   17edf00 <_Znwm@plt>
      b8779d:	49 89 c4             	mov    r12,rax
      b877a0:	48 8d 84 24 00 05 00 	lea    rax,[rsp+0x500]
      b877a7:	00 
      b877a8:	48 8d 0d 89 67 c8 00 	lea    rcx,[rip+0xc86789]        # 180df38 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3bf8>
      b877af:	49 89 0c 24          	mov    QWORD PTR [r12],rcx
      b877b3:	48 8b 48 f8          	mov    rcx,QWORD PTR [rax-0x8]
      b877b7:	0f 28 40 f0          	movaps xmm0,XMMWORD PTR [rax-0x10]
      b877bb:	41 0f 11 44 24 10    	movups XMMWORD PTR [r12+0x10],xmm0
      b877c1:	48 85 c9             	test   rcx,rcx
      b877c4:	74 05                	je     b877cb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd476b>
      b877c6:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b877cb:	4c 8d bc 24 f0 04 00 	lea    r15,[rsp+0x4f0]
      b877d2:	00 
      b877d3:	66 41 0f 6f 47 10    	movdqa xmm0,XMMWORD PTR [r15+0x10]
      b877d9:	f3 41 0f 7f 44 24 20 	movdqu XMMWORD PTR [r12+0x20],xmm0
      b877e0:	66 0f ef c0          	pxor   xmm0,xmm0
      b877e4:	66 0f 7f 00          	movdqa XMMWORD PTR [rax],xmm0
      b877e8:	66 41 0f 6f 4f 20    	movdqa xmm1,XMMWORD PTR [r15+0x20]
      b877ee:	f3 41 0f 7f 4c 24 30 	movdqu XMMWORD PTR [r12+0x30],xmm1
      b877f5:	66 0f 7f 40 10       	movdqa XMMWORD PTR [rax+0x10],xmm0
      b877fa:	4c 89 e7             	mov    rdi,r12
      b877fd:	48 83 c7 40          	add    rdi,0x40
      b87801:	48 89 de             	mov    rsi,rbx
      b87804:	e8 af 0a 00 00       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
      b87809:	4c 8d ac 24 50 05 00 	lea    r13,[rsp+0x550]
      b87810:	00 
      b87811:	4d 89 65 20          	mov    QWORD PTR [r13+0x20],r12
      b87815:	48 8d 9c 24 70 06 00 	lea    rbx,[rsp+0x670]
      b8781c:	00 
      b8781d:	4c 8d a4 24 a8 01 00 	lea    r12,[rsp+0x1a8]
      b87824:	00 

## High-address constants in factory
- 0xb8616c: lea    rcx,[rip+0xc87b1d]        # 180dc90 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3950> -> 0x180dc90
- 0xb86209: lea    rax,[rip+0xc87e00]        # 180e010 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3cd0> -> 0x180e010
- 0xb866fc: lea    rax,[rip+0xc875d5]        # 180dcd8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3998> -> 0x180dcd8
- 0xb868bf: lea    rcx,[rip+0xc84502]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88> -> 0x180adc8
- 0xb868d0: lea    rcx,[rip+0xc87479]        # 180dd50 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3a10> -> 0x180dd50
- 0xb86947: lea    rcx,[rip+0xcf2582]        # 1878ed0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x355b8> -> 0x1878ed0
- 0xb86951: lea    rcx,[rip+0xcf25b0]        # 1878f08 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x355f0> -> 0x1878f08
- 0xb869c3: lea    rax,[rip+0xcf38be]        # 187a288 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36970> -> 0x187a288
- 0xb86b2a: lea    rax,[rip+0xc87267]        # 180dd98 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3a58> -> 0x180dd98
- 0xb8734e: lea    rcx,[rip+0xc86a7b]        # 180ddd0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3a90> -> 0x180ddd0
- 0xb874f5: lea    rcx,[rip+0xc86964]        # 180de60 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3b20> -> 0x180de60
- 0xb876c2: lea    rcx,[rip+0xc867df]        # 180dea8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3b68> -> 0x180dea8
- 0xb877a8: lea    rcx,[rip+0xc86789]        # 180df38 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3bf8> -> 0x180df38
- 0xb878d3: lea    rax,[rip+0xc866ee]        # 180dfc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3c88> -> 0x180dfc8

## Candidate vtables referenced by factory
### AP 0x180ada8 codeSlots=32
- +0x0: 0x9d7de0 FDE=(10321376, 10321377)
- +0x8: 0xb3b070 FDE=(11776112, 11776838)
- +0x10: 0x0 FDE=None
- +0x18: 0x0 FDE=None
- +0x20: 0xb3b85c FDE=(11778140, 11778155)
- +0x28: 0xb3b86c FDE=(11778156, 11778174)
- +0x30: 0xb3b87e FDE=(11778174, 11778184)
- +0x38: 0x0 FDE=None
- +0x40: 0xa50370 FDE=(10814320, 10814325)
- +0x48: 0x0 FDE=None
- +0x50: 0x0 FDE=None
- +0x58: 0xabe9e4 FDE=(11266532, 11266564)
- +0x60: 0xabea04 FDE=(11266564, 11266582)
- +0x68: 0x174ec6a FDE=(24439914, 24439919)
- +0x70: 0x174f1dc FDE=(24441308, 24442309)
- +0x78: 0xb3bf70 FDE=(11779952, 11779977)
- +0x80: 0x174ef82 FDE=(24440706, 24441307)
- +0x88: 0x0 FDE=None
- +0x90: 0x0 FDE=None
- +0x98: 0xb3be9c FDE=(11779740, 11779791)
- +0xa0: 0xb3bed0 FDE=(11779792, 11779810)
- +0xa8: 0x174ec6a FDE=(24439914, 24439919)
- +0xb0: 0x174f1dc FDE=(24441308, 24442309)
- +0xb8: 0xb3bee2 FDE=(11779810, 11779835)
- +0xc0: 0x174ef82 FDE=(24440706, 24441307)
- +0xc8: 0x18cb2f0 FDE=None
- +0xd0: 0x18cb368 FDE=None
- +0xd8: 0x0 FDE=None
- +0xe0: 0x0 FDE=None
- +0xe8: 0x15e3be4 FDE=(22952932, 22952951)
- +0xf0: 0xaae5e8 FDE=(11199976, 11199994)
- +0xf8: 0xb3c8a2 FDE=(11782306, 11783158)
- +0x100: 0xaa8e00 FDE=(11177472, 11177626)
- +0x108: 0x1066dbe FDE=(17198526, 17198537)
- +0x110: 0xb3bf8a FDE=(11779978, 11780189)
- +0x118: 0xb3c05e FDE=(11780190, 11780397)
- +0x120: 0xb3c12e FDE=(11780398, 11780705)
- +0x128: 0x0 FDE=None
- +0x130: 0x0 FDE=None
- +0x138: 0xaaab0e FDE=(11184910, 11184933)
- +0x140: 0xaaab26 FDE=(11184934, 11184952)
- +0x148: 0x174ec6a FDE=(24439914, 24439919)
- +0x150: 0x174f1dc FDE=(24441308, 24442309)
- +0x158: 0xb3cbf6 FDE=(11783158, 11783183)
- +0x160: 0x174ef82 FDE=(24440706, 24441307)
- +0x168: 0x18cb890 FDE=None
- +0x170: 0x0 FDE=None
#### +0x28 body
      b3b86c:	53                   	push   rbx
      b3b86d:	48 89 fb             	mov    rbx,rdi
      b3b870:	e8 e7 ff ff ff       	call   b3b85c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x887fc>
      b3b875:	48 89 df             	mov    rdi,rbx
      b3b878:	5b                   	pop    rbx
      b3b879:	e9 a2 26 cb 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x180adb0 codeSlots=32
- +0x0: 0xb3b070 FDE=(11776112, 11776838)
- +0x8: 0x0 FDE=None
- +0x10: 0x0 FDE=None
- +0x18: 0xb3b85c FDE=(11778140, 11778155)
- +0x20: 0xb3b86c FDE=(11778156, 11778174)
- +0x28: 0xb3b87e FDE=(11778174, 11778184)
- +0x30: 0x0 FDE=None
- +0x38: 0xa50370 FDE=(10814320, 10814325)
- +0x40: 0x0 FDE=None
- +0x48: 0x0 FDE=None
- +0x50: 0xabe9e4 FDE=(11266532, 11266564)
- +0x58: 0xabea04 FDE=(11266564, 11266582)
- +0x60: 0x174ec6a FDE=(24439914, 24439919)
- +0x68: 0x174f1dc FDE=(24441308, 24442309)
- +0x70: 0xb3bf70 FDE=(11779952, 11779977)
- +0x78: 0x174ef82 FDE=(24440706, 24441307)
- +0x80: 0x0 FDE=None
- +0x88: 0x0 FDE=None
- +0x90: 0xb3be9c FDE=(11779740, 11779791)
- +0x98: 0xb3bed0 FDE=(11779792, 11779810)
- +0xa0: 0x174ec6a FDE=(24439914, 24439919)
- +0xa8: 0x174f1dc FDE=(24441308, 24442309)
- +0xb0: 0xb3bee2 FDE=(11779810, 11779835)
- +0xb8: 0x174ef82 FDE=(24440706, 24441307)
- +0xc0: 0x18cb2f0 FDE=None
- +0xc8: 0x18cb368 FDE=None
- +0xd0: 0x0 FDE=None
- +0xd8: 0x0 FDE=None
- +0xe0: 0x15e3be4 FDE=(22952932, 22952951)
- +0xe8: 0xaae5e8 FDE=(11199976, 11199994)
- +0xf0: 0xb3c8a2 FDE=(11782306, 11783158)
- +0xf8: 0xaa8e00 FDE=(11177472, 11177626)
- +0x100: 0x1066dbe FDE=(17198526, 17198537)
- +0x108: 0xb3bf8a FDE=(11779978, 11780189)
- +0x110: 0xb3c05e FDE=(11780190, 11780397)
- +0x118: 0xb3c12e FDE=(11780398, 11780705)
- +0x120: 0x0 FDE=None
- +0x128: 0x0 FDE=None
- +0x130: 0xaaab0e FDE=(11184910, 11184933)
- +0x138: 0xaaab26 FDE=(11184934, 11184952)
- +0x140: 0x174ec6a FDE=(24439914, 24439919)
- +0x148: 0x174f1dc FDE=(24441308, 24442309)
- +0x150: 0xb3cbf6 FDE=(11783158, 11783183)
- +0x158: 0x174ef82 FDE=(24440706, 24441307)
- +0x160: 0x18cb890 FDE=None
- +0x168: 0x0 FDE=None
- +0x170: 0x0 FDE=None
#### +0x28 body
      b3b87e:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
      b3b882:	48 83 c7 20          	add    rdi,0x20
      b3b886:	ff 20                	jmp    QWORD PTR [rax]

### AP 0x180adb8 codeSlots=32
- +0x0: 0x0 FDE=None
- +0x8: 0x0 FDE=None
- +0x10: 0xb3b85c FDE=(11778140, 11778155)
- +0x18: 0xb3b86c FDE=(11778156, 11778174)
- +0x20: 0xb3b87e FDE=(11778174, 11778184)
- +0x28: 0x0 FDE=None
- +0x30: 0xa50370 FDE=(10814320, 10814325)
- +0x38: 0x0 FDE=None
- +0x40: 0x0 FDE=None
- +0x48: 0xabe9e4 FDE=(11266532, 11266564)
- +0x50: 0xabea04 FDE=(11266564, 11266582)
- +0x58: 0x174ec6a FDE=(24439914, 24439919)
- +0x60: 0x174f1dc FDE=(24441308, 24442309)
- +0x68: 0xb3bf70 FDE=(11779952, 11779977)
- +0x70: 0x174ef82 FDE=(24440706, 24441307)
- +0x78: 0x0 FDE=None
- +0x80: 0x0 FDE=None
- +0x88: 0xb3be9c FDE=(11779740, 11779791)
- +0x90: 0xb3bed0 FDE=(11779792, 11779810)
- +0x98: 0x174ec6a FDE=(24439914, 24439919)
- +0xa0: 0x174f1dc FDE=(24441308, 24442309)
- +0xa8: 0xb3bee2 FDE=(11779810, 11779835)
- +0xb0: 0x174ef82 FDE=(24440706, 24441307)
- +0xb8: 0x18cb2f0 FDE=None
- +0xc0: 0x18cb368 FDE=None
- +0xc8: 0x0 FDE=None
- +0xd0: 0x0 FDE=None
- +0xd8: 0x15e3be4 FDE=(22952932, 22952951)
- +0xe0: 0xaae5e8 FDE=(11199976, 11199994)
- +0xe8: 0xb3c8a2 FDE=(11782306, 11783158)
- +0xf0: 0xaa8e00 FDE=(11177472, 11177626)
- +0xf8: 0x1066dbe FDE=(17198526, 17198537)
- +0x100: 0xb3bf8a FDE=(11779978, 11780189)
- +0x108: 0xb3c05e FDE=(11780190, 11780397)
- +0x110: 0xb3c12e FDE=(11780398, 11780705)
- +0x118: 0x0 FDE=None
- +0x120: 0x0 FDE=None
- +0x128: 0xaaab0e FDE=(11184910, 11184933)
- +0x130: 0xaaab26 FDE=(11184934, 11184952)
- +0x138: 0x174ec6a FDE=(24439914, 24439919)
- +0x140: 0x174f1dc FDE=(24441308, 24442309)
- +0x148: 0xb3cbf6 FDE=(11783158, 11783183)
- +0x150: 0x174ef82 FDE=(24440706, 24441307)
- +0x158: 0x18cb890 FDE=None
- +0x160: 0x0 FDE=None
- +0x168: 0x0 FDE=None
- +0x170: 0xaaab0e FDE=(11184910, 11184933)

### AP 0x180adc0 codeSlots=33
- +0x0: 0x0 FDE=None
- +0x8: 0xb3b85c FDE=(11778140, 11778155)
- +0x10: 0xb3b86c FDE=(11778156, 11778174)
- +0x18: 0xb3b87e FDE=(11778174, 11778184)
- +0x20: 0x0 FDE=None
- +0x28: 0xa50370 FDE=(10814320, 10814325)
- +0x30: 0x0 FDE=None
- +0x38: 0x0 FDE=None
- +0x40: 0xabe9e4 FDE=(11266532, 11266564)
- +0x48: 0xabea04 FDE=(11266564, 11266582)
- +0x50: 0x174ec6a FDE=(24439914, 24439919)
- +0x58: 0x174f1dc FDE=(24441308, 24442309)
- +0x60: 0xb3bf70 FDE=(11779952, 11779977)
- +0x68: 0x174ef82 FDE=(24440706, 24441307)
- +0x70: 0x0 FDE=None
- +0x78: 0x0 FDE=None
- +0x80: 0xb3be9c FDE=(11779740, 11779791)
- +0x88: 0xb3bed0 FDE=(11779792, 11779810)
- +0x90: 0x174ec6a FDE=(24439914, 24439919)
- +0x98: 0x174f1dc FDE=(24441308, 24442309)
- +0xa0: 0xb3bee2 FDE=(11779810, 11779835)
- +0xa8: 0x174ef82 FDE=(24440706, 24441307)
- +0xb0: 0x18cb2f0 FDE=None
- +0xb8: 0x18cb368 FDE=None
- +0xc0: 0x0 FDE=None
- +0xc8: 0x0 FDE=None
- +0xd0: 0x15e3be4 FDE=(22952932, 22952951)
- +0xd8: 0xaae5e8 FDE=(11199976, 11199994)
- +0xe0: 0xb3c8a2 FDE=(11782306, 11783158)
- +0xe8: 0xaa8e00 FDE=(11177472, 11177626)
- +0xf0: 0x1066dbe FDE=(17198526, 17198537)
- +0xf8: 0xb3bf8a FDE=(11779978, 11780189)
- +0x100: 0xb3c05e FDE=(11780190, 11780397)
- +0x108: 0xb3c12e FDE=(11780398, 11780705)
- +0x110: 0x0 FDE=None
- +0x118: 0x0 FDE=None
- +0x120: 0xaaab0e FDE=(11184910, 11184933)
- +0x128: 0xaaab26 FDE=(11184934, 11184952)
- +0x130: 0x174ec6a FDE=(24439914, 24439919)
- +0x138: 0x174f1dc FDE=(24441308, 24442309)
- +0x140: 0xb3cbf6 FDE=(11783158, 11783183)
- +0x148: 0x174ef82 FDE=(24440706, 24441307)
- +0x150: 0x18cb890 FDE=None
- +0x158: 0x0 FDE=None
- +0x160: 0x0 FDE=None
- +0x168: 0xaaab0e FDE=(11184910, 11184933)
- +0x170: 0xaaab26 FDE=(11184934, 11184952)
#### +0x28 body
      a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x180adc8 codeSlots=34
- +0x0: 0xb3b85c FDE=(11778140, 11778155)
- +0x8: 0xb3b86c FDE=(11778156, 11778174)
- +0x10: 0xb3b87e FDE=(11778174, 11778184)
- +0x18: 0x0 FDE=None
- +0x20: 0xa50370 FDE=(10814320, 10814325)
- +0x28: 0x0 FDE=None
- +0x30: 0x0 FDE=None
- +0x38: 0xabe9e4 FDE=(11266532, 11266564)
- +0x40: 0xabea04 FDE=(11266564, 11266582)
- +0x48: 0x174ec6a FDE=(24439914, 24439919)
- +0x50: 0x174f1dc FDE=(24441308, 24442309)
- +0x58: 0xb3bf70 FDE=(11779952, 11779977)
- +0x60: 0x174ef82 FDE=(24440706, 24441307)
- +0x68: 0x0 FDE=None
- +0x70: 0x0 FDE=None
- +0x78: 0xb3be9c FDE=(11779740, 11779791)
- +0x80: 0xb3bed0 FDE=(11779792, 11779810)
- +0x88: 0x174ec6a FDE=(24439914, 24439919)
- +0x90: 0x174f1dc FDE=(24441308, 24442309)
- +0x98: 0xb3bee2 FDE=(11779810, 11779835)
- +0xa0: 0x174ef82 FDE=(24440706, 24441307)
- +0xa8: 0x18cb2f0 FDE=None
- +0xb0: 0x18cb368 FDE=None
- +0xb8: 0x0 FDE=None
- +0xc0: 0x0 FDE=None
- +0xc8: 0x15e3be4 FDE=(22952932, 22952951)
- +0xd0: 0xaae5e8 FDE=(11199976, 11199994)
- +0xd8: 0xb3c8a2 FDE=(11782306, 11783158)
- +0xe0: 0xaa8e00 FDE=(11177472, 11177626)
- +0xe8: 0x1066dbe FDE=(17198526, 17198537)
- +0xf0: 0xb3bf8a FDE=(11779978, 11780189)
- +0xf8: 0xb3c05e FDE=(11780190, 11780397)
- +0x100: 0xb3c12e FDE=(11780398, 11780705)
- +0x108: 0x0 FDE=None
- +0x110: 0x0 FDE=None
- +0x118: 0xaaab0e FDE=(11184910, 11184933)
- +0x120: 0xaaab26 FDE=(11184934, 11184952)
- +0x128: 0x174ec6a FDE=(24439914, 24439919)
- +0x130: 0x174f1dc FDE=(24441308, 24442309)
- +0x138: 0xb3cbf6 FDE=(11783158, 11783183)
- +0x140: 0x174ef82 FDE=(24440706, 24441307)
- +0x148: 0x18cb890 FDE=None
- +0x150: 0x0 FDE=None
- +0x158: 0x0 FDE=None
- +0x160: 0xaaab0e FDE=(11184910, 11184933)
- +0x168: 0xaaab26 FDE=(11184934, 11184952)
- +0x170: 0x174ec6a FDE=(24439914, 24439919)

### AP 0x180add0 codeSlots=34
- +0x0: 0xb3b86c FDE=(11778156, 11778174)
- +0x8: 0xb3b87e FDE=(11778174, 11778184)
- +0x10: 0x0 FDE=None
- +0x18: 0xa50370 FDE=(10814320, 10814325)
- +0x20: 0x0 FDE=None
- +0x28: 0x0 FDE=None
- +0x30: 0xabe9e4 FDE=(11266532, 11266564)
- +0x38: 0xabea04 FDE=(11266564, 11266582)
- +0x40: 0x174ec6a FDE=(24439914, 24439919)
- +0x48: 0x174f1dc FDE=(24441308, 24442309)
- +0x50: 0xb3bf70 FDE=(11779952, 11779977)
- +0x58: 0x174ef82 FDE=(24440706, 24441307)
- +0x60: 0x0 FDE=None
- +0x68: 0x0 FDE=None
- +0x70: 0xb3be9c FDE=(11779740, 11779791)
- +0x78: 0xb3bed0 FDE=(11779792, 11779810)
- +0x80: 0x174ec6a FDE=(24439914, 24439919)
- +0x88: 0x174f1dc FDE=(24441308, 24442309)
- +0x90: 0xb3bee2 FDE=(11779810, 11779835)
- +0x98: 0x174ef82 FDE=(24440706, 24441307)
- +0xa0: 0x18cb2f0 FDE=None
- +0xa8: 0x18cb368 FDE=None
- +0xb0: 0x0 FDE=None
- +0xb8: 0x0 FDE=None
- +0xc0: 0x15e3be4 FDE=(22952932, 22952951)
- +0xc8: 0xaae5e8 FDE=(11199976, 11199994)
- +0xd0: 0xb3c8a2 FDE=(11782306, 11783158)
- +0xd8: 0xaa8e00 FDE=(11177472, 11177626)
- +0xe0: 0x1066dbe FDE=(17198526, 17198537)
- +0xe8: 0xb3bf8a FDE=(11779978, 11780189)
- +0xf0: 0xb3c05e FDE=(11780190, 11780397)
- +0xf8: 0xb3c12e FDE=(11780398, 11780705)
- +0x100: 0x0 FDE=None
- +0x108: 0x0 FDE=None
- +0x110: 0xaaab0e FDE=(11184910, 11184933)
- +0x118: 0xaaab26 FDE=(11184934, 11184952)
- +0x120: 0x174ec6a FDE=(24439914, 24439919)
- +0x128: 0x174f1dc FDE=(24441308, 24442309)
- +0x130: 0xb3cbf6 FDE=(11783158, 11783183)
- +0x138: 0x174ef82 FDE=(24440706, 24441307)
- +0x140: 0x18cb890 FDE=None
- +0x148: 0x0 FDE=None
- +0x150: 0x0 FDE=None
- +0x158: 0xaaab0e FDE=(11184910, 11184933)
- +0x160: 0xaaab26 FDE=(11184934, 11184952)
- +0x168: 0x174ec6a FDE=(24439914, 24439919)
- +0x170: 0x174f1dc FDE=(24441308, 24442309)

### AP 0x180add8 codeSlots=34
- +0x0: 0xb3b87e FDE=(11778174, 11778184)
- +0x8: 0x0 FDE=None
- +0x10: 0xa50370 FDE=(10814320, 10814325)
- +0x18: 0x0 FDE=None
- +0x20: 0x0 FDE=None
- +0x28: 0xabe9e4 FDE=(11266532, 11266564)
- +0x30: 0xabea04 FDE=(11266564, 11266582)
- +0x38: 0x174ec6a FDE=(24439914, 24439919)
- +0x40: 0x174f1dc FDE=(24441308, 24442309)
- +0x48: 0xb3bf70 FDE=(11779952, 11779977)
- +0x50: 0x174ef82 FDE=(24440706, 24441307)
- +0x58: 0x0 FDE=None
- +0x60: 0x0 FDE=None
- +0x68: 0xb3be9c FDE=(11779740, 11779791)
- +0x70: 0xb3bed0 FDE=(11779792, 11779810)
- +0x78: 0x174ec6a FDE=(24439914, 24439919)
- +0x80: 0x174f1dc FDE=(24441308, 24442309)
- +0x88: 0xb3bee2 FDE=(11779810, 11779835)
- +0x90: 0x174ef82 FDE=(24440706, 24441307)
- +0x98: 0x18cb2f0 FDE=None
- +0xa0: 0x18cb368 FDE=None
- +0xa8: 0x0 FDE=None
- +0xb0: 0x0 FDE=None
- +0xb8: 0x15e3be4 FDE=(22952932, 22952951)
- +0xc0: 0xaae5e8 FDE=(11199976, 11199994)
- +0xc8: 0xb3c8a2 FDE=(11782306, 11783158)
- +0xd0: 0xaa8e00 FDE=(11177472, 11177626)
- +0xd8: 0x1066dbe FDE=(17198526, 17198537)
- +0xe0: 0xb3bf8a FDE=(11779978, 11780189)
- +0xe8: 0xb3c05e FDE=(11780190, 11780397)
- +0xf0: 0xb3c12e FDE=(11780398, 11780705)
- +0xf8: 0x0 FDE=None
- +0x100: 0x0 FDE=None
- +0x108: 0xaaab0e FDE=(11184910, 11184933)
- +0x110: 0xaaab26 FDE=(11184934, 11184952)
- +0x118: 0x174ec6a FDE=(24439914, 24439919)
- +0x120: 0x174f1dc FDE=(24441308, 24442309)
- +0x128: 0xb3cbf6 FDE=(11783158, 11783183)
- +0x130: 0x174ef82 FDE=(24440706, 24441307)
- +0x138: 0x18cb890 FDE=None
- +0x140: 0x0 FDE=None
- +0x148: 0x0 FDE=None
- +0x150: 0xaaab0e FDE=(11184910, 11184933)
- +0x158: 0xaaab26 FDE=(11184934, 11184952)
- +0x160: 0x174ec6a FDE=(24439914, 24439919)
- +0x168: 0x174f1dc FDE=(24441308, 24442309)
- +0x170: 0xb3cc32 FDE=(11783218, 11783243)
#### +0x28 body
      abe9e4:	53                   	push   rbx
      abe9e5:	48 89 fb             	mov    rbx,rdi
      abe9e8:	48 83 c7 08          	add    rdi,0x8
      abe9ec:	e8 17 c0 fe ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
      abe9f1:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
      abe9f5:	e8 ae 6e ca 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
      abe9fa:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
      abe9fe:	5b                   	pop    rbx
      abe9ff:	e9 a4 6e ca 00       	jmp    17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>

### AP 0x180ade0 codeSlots=33
- +0x0: 0x0 FDE=None
- +0x8: 0xa50370 FDE=(10814320, 10814325)
- +0x10: 0x0 FDE=None
- +0x18: 0x0 FDE=None
- +0x20: 0xabe9e4 FDE=(11266532, 11266564)
- +0x28: 0xabea04 FDE=(11266564, 11266582)
- +0x30: 0x174ec6a FDE=(24439914, 24439919)
- +0x38: 0x174f1dc FDE=(24441308, 24442309)
- +0x40: 0xb3bf70 FDE=(11779952, 11779977)
- +0x48: 0x174ef82 FDE=(24440706, 24441307)
- +0x50: 0x0 FDE=None
- +0x58: 0x0 FDE=None
- +0x60: 0xb3be9c FDE=(11779740, 11779791)
- +0x68: 0xb3bed0 FDE=(11779792, 11779810)
- +0x70: 0x174ec6a FDE=(24439914, 24439919)
- +0x78: 0x174f1dc FDE=(24441308, 24442309)
- +0x80: 0xb3bee2 FDE=(11779810, 11779835)
- +0x88: 0x174ef82 FDE=(24440706, 24441307)
- +0x90: 0x18cb2f0 FDE=None
- +0x98: 0x18cb368 FDE=None
- +0xa0: 0x0 FDE=None
- +0xa8: 0x0 FDE=None
- +0xb0: 0x15e3be4 FDE=(22952932, 22952951)
- +0xb8: 0xaae5e8 FDE=(11199976, 11199994)
- +0xc0: 0xb3c8a2 FDE=(11782306, 11783158)
- +0xc8: 0xaa8e00 FDE=(11177472, 11177626)
- +0xd0: 0x1066dbe FDE=(17198526, 17198537)
- +0xd8: 0xb3bf8a FDE=(11779978, 11780189)
- +0xe0: 0xb3c05e FDE=(11780190, 11780397)
- +0xe8: 0xb3c12e FDE=(11780398, 11780705)
- +0xf0: 0x0 FDE=None
- +0xf8: 0x0 FDE=None
- +0x100: 0xaaab0e FDE=(11184910, 11184933)
- +0x108: 0xaaab26 FDE=(11184934, 11184952)
- +0x110: 0x174ec6a FDE=(24439914, 24439919)
- +0x118: 0x174f1dc FDE=(24441308, 24442309)
- +0x120: 0xb3cbf6 FDE=(11783158, 11783183)
- +0x128: 0x174ef82 FDE=(24440706, 24441307)
- +0x130: 0x18cb890 FDE=None
- +0x138: 0x0 FDE=None
- +0x140: 0x0 FDE=None
- +0x148: 0xaaab0e FDE=(11184910, 11184933)
- +0x150: 0xaaab26 FDE=(11184934, 11184952)
- +0x158: 0x174ec6a FDE=(24439914, 24439919)
- +0x160: 0x174f1dc FDE=(24441308, 24442309)
- +0x168: 0xb3cc32 FDE=(11783218, 11783243)
- +0x170: 0x174ef82 FDE=(24440706, 24441307)
#### +0x28 body
      abea04:	53                   	push   rbx
      abea05:	48 89 fb             	mov    rbx,rdi
      abea08:	e8 d7 ff ff ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
      abea0d:	48 89 df             	mov    rdi,rbx
      abea10:	5b                   	pop    rbx
      abea11:	e9 0a f5 d2 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x180ade8 codeSlots=33
- +0x0: 0xa50370 FDE=(10814320, 10814325)
- +0x8: 0x0 FDE=None
- +0x10: 0x0 FDE=None
- +0x18: 0xabe9e4 FDE=(11266532, 11266564)
- +0x20: 0xabea04 FDE=(11266564, 11266582)
- +0x28: 0x174ec6a FDE=(24439914, 24439919)
- +0x30: 0x174f1dc FDE=(24441308, 24442309)
- +0x38: 0xb3bf70 FDE=(11779952, 11779977)
- +0x40: 0x174ef82 FDE=(24440706, 24441307)
- +0x48: 0x0 FDE=None
- +0x50: 0x0 FDE=None
- +0x58: 0xb3be9c FDE=(11779740, 11779791)
- +0x60: 0xb3bed0 FDE=(11779792, 11779810)
- +0x68: 0x174ec6a FDE=(24439914, 24439919)
- +0x70: 0x174f1dc FDE=(24441308, 24442309)
- +0x78: 0xb3bee2 FDE=(11779810, 11779835)
- +0x80: 0x174ef82 FDE=(24440706, 24441307)
- +0x88: 0x18cb2f0 FDE=None
- +0x90: 0x18cb368 FDE=None
- +0x98: 0x0 FDE=None
- +0xa0: 0x0 FDE=None
- +0xa8: 0x15e3be4 FDE=(22952932, 22952951)
- +0xb0: 0xaae5e8 FDE=(11199976, 11199994)
- +0xb8: 0xb3c8a2 FDE=(11782306, 11783158)
- +0xc0: 0xaa8e00 FDE=(11177472, 11177626)
- +0xc8: 0x1066dbe FDE=(17198526, 17198537)
- +0xd0: 0xb3bf8a FDE=(11779978, 11780189)
- +0xd8: 0xb3c05e FDE=(11780190, 11780397)
- +0xe0: 0xb3c12e FDE=(11780398, 11780705)
- +0xe8: 0x0 FDE=None
- +0xf0: 0x0 FDE=None
- +0xf8: 0xaaab0e FDE=(11184910, 11184933)
- +0x100: 0xaaab26 FDE=(11184934, 11184952)
- +0x108: 0x174ec6a FDE=(24439914, 24439919)
- +0x110: 0x174f1dc FDE=(24441308, 24442309)
- +0x118: 0xb3cbf6 FDE=(11783158, 11783183)
- +0x120: 0x174ef82 FDE=(24440706, 24441307)
- +0x128: 0x18cb890 FDE=None
- +0x130: 0x0 FDE=None
- +0x138: 0x0 FDE=None
- +0x140: 0xaaab0e FDE=(11184910, 11184933)
- +0x148: 0xaaab26 FDE=(11184934, 11184952)
- +0x150: 0x174ec6a FDE=(24439914, 24439919)
- +0x158: 0x174f1dc FDE=(24441308, 24442309)
- +0x160: 0xb3cc32 FDE=(11783218, 11783243)
- +0x168: 0x174ef82 FDE=(24440706, 24441307)
- +0x170: 0x18cba10 FDE=None
#### +0x28 body
     174ec6a:	e9 3f 31 00 00       	jmp    1751dae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x105f1a>

### AP 0x180dc70 codeSlots=37
- +0x0: 0xb8607a FDE=(12083322, 12083333)
- +0x8: 0xb86086 FDE=(12083334, 12091202)
- +0x10: 0x0 FDE=None
- +0x18: 0x0 FDE=None
- +0x20: 0x9d7de0 FDE=(10321376, 10321377)
- +0x28: 0xa50370 FDE=(10814320, 10814325)
- +0x30: 0xb8807e FDE=(12091518, 12091550)
- +0x38: 0xb8809e FDE=(12091550, 12091569)
- +0x40: 0x9d7de0 FDE=(10321376, 10321377)
- +0x48: 0xa50370 FDE=(10814320, 10814325)
- +0x50: 0xb880b2 FDE=(12091570, 12091598)
- +0x58: 0x0 FDE=None
- +0x60: 0x0 FDE=None
- +0x68: 0xb8959e FDE=(12096926, 12097049)
- +0x70: 0xb8961a FDE=(12097050, 12097068)
- +0x78: 0x9d7de0 FDE=(10321376, 10321377)
- +0x80: 0x9d7de0 FDE=(10321376, 10321377)
- +0x88: 0xac3ae0 FDE=(11287264, 11287269)
- +0x90: 0xa4b8e0 FDE=(10795232, 10795237)
- +0x98: 0xb8962c FDE=(12097068, 12097076)
- +0xa0: 0xb89634 FDE=(12097076, 12097084)
- +0xa8: 0xb8963c FDE=(12097084, 12097092)
- +0xb0: 0xb89644 FDE=(12097092, 12097123)
- +0xb8: 0xb89664 FDE=(12097124, 12097155)
- +0xc0: 0xb89684 FDE=(12097156, 12097187)
- +0xc8: 0xb896a4 FDE=(12097188, 12097219)
- +0xd0: 0x0 FDE=None
- +0xd8: 0x0 FDE=None
- +0xe0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe8: 0xa50370 FDE=(10814320, 10814325)
- +0xf0: 0xb8956a FDE=(12096874, 12096906)
- +0xf8: 0xb8958a FDE=(12096906, 12096925)
- +0x100: 0x9d7de0 FDE=(10321376, 10321377)
- +0x108: 0xa50370 FDE=(10814320, 10814325)
- +0x110: 0xb7d28a FDE=(12046986, 12047005)
- +0x118: 0x0 FDE=None
- +0x120: 0x0 FDE=None
- +0x128: 0xb8952e FDE=(12096814, 12096829)
- +0x130: 0xb8953e FDE=(12096830, 12096848)
- +0x138: 0xb89550 FDE=(12096848, 12096874)
- +0x140: 0x0 FDE=None
- +0x148: 0xa50370 FDE=(10814320, 10814325)
- +0x150: 0x0 FDE=None
- +0x158: 0x0 FDE=None
- +0x160: 0xb8930a FDE=(12096266, 12096285)
- +0x168: 0xb8931e FDE=(12096286, 12096304)
- +0x170: 0xb89330 FDE=(12096304, 12096358)
#### +0x28 body
      a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x180dc78 codeSlots=37
- +0x0: 0xb86086 FDE=(12083334, 12091202)
- +0x8: 0x0 FDE=None
- +0x10: 0x0 FDE=None
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0xa50370 FDE=(10814320, 10814325)
- +0x28: 0xb8807e FDE=(12091518, 12091550)
- +0x30: 0xb8809e FDE=(12091550, 12091569)
- +0x38: 0x9d7de0 FDE=(10321376, 10321377)
- +0x40: 0xa50370 FDE=(10814320, 10814325)
- +0x48: 0xb880b2 FDE=(12091570, 12091598)
- +0x50: 0x0 FDE=None
- +0x58: 0x0 FDE=None
- +0x60: 0xb8959e FDE=(12096926, 12097049)
- +0x68: 0xb8961a FDE=(12097050, 12097068)
- +0x70: 0x9d7de0 FDE=(10321376, 10321377)
- +0x78: 0x9d7de0 FDE=(10321376, 10321377)
- +0x80: 0xac3ae0 FDE=(11287264, 11287269)
- +0x88: 0xa4b8e0 FDE=(10795232, 10795237)
- +0x90: 0xb8962c FDE=(12097068, 12097076)
- +0x98: 0xb89634 FDE=(12097076, 12097084)
- +0xa0: 0xb8963c FDE=(12097084, 12097092)
- +0xa8: 0xb89644 FDE=(12097092, 12097123)
- +0xb0: 0xb89664 FDE=(12097124, 12097155)
- +0xb8: 0xb89684 FDE=(12097156, 12097187)
- +0xc0: 0xb896a4 FDE=(12097188, 12097219)
- +0xc8: 0x0 FDE=None
- +0xd0: 0x0 FDE=None
- +0xd8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe0: 0xa50370 FDE=(10814320, 10814325)
- +0xe8: 0xb8956a FDE=(12096874, 12096906)
- +0xf0: 0xb8958a FDE=(12096906, 12096925)
- +0xf8: 0x9d7de0 FDE=(10321376, 10321377)
- +0x100: 0xa50370 FDE=(10814320, 10814325)
- +0x108: 0xb7d28a FDE=(12046986, 12047005)
- +0x110: 0x0 FDE=None
- +0x118: 0x0 FDE=None
- +0x120: 0xb8952e FDE=(12096814, 12096829)
- +0x128: 0xb8953e FDE=(12096830, 12096848)
- +0x130: 0xb89550 FDE=(12096848, 12096874)
- +0x138: 0x0 FDE=None
- +0x140: 0xa50370 FDE=(10814320, 10814325)
- +0x148: 0x0 FDE=None
- +0x150: 0x0 FDE=None
- +0x158: 0xb8930a FDE=(12096266, 12096285)
- +0x160: 0xb8931e FDE=(12096286, 12096304)
- +0x168: 0xb89330 FDE=(12096304, 12096358)
- +0x170: 0xb89366 FDE=(12096358, 12096384)
#### +0x28 body
      b8807e:	53                   	push   rbx
      b8807f:	48 89 fb             	mov    rbx,rdi
      b88082:	6a 10                	push   0x10
      b88084:	5f                   	pop    rdi
      b88085:	e8 76 5e c6 00       	call   17edf00 <_Znwm@plt>
      b8808a:	48 8d 0d ff 5b c8 00 	lea    rcx,[rip+0xc85bff]        # 180dc90 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3950>
      b88091:	48 89 08             	mov    QWORD PTR [rax],rcx
      b88094:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
      b88098:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      b8809c:	5b                   	pop    rbx
      b8809d:	c3                   	ret

### AP 0x180dc80 codeSlots=37
- +0x0: 0x0 FDE=None
- +0x8: 0x0 FDE=None
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0xa50370 FDE=(10814320, 10814325)
- +0x20: 0xb8807e FDE=(12091518, 12091550)
- +0x28: 0xb8809e FDE=(12091550, 12091569)
- +0x30: 0x9d7de0 FDE=(10321376, 10321377)
- +0x38: 0xa50370 FDE=(10814320, 10814325)
- +0x40: 0xb880b2 FDE=(12091570, 12091598)
- +0x48: 0x0 FDE=None
- +0x50: 0x0 FDE=None
- +0x58: 0xb8959e FDE=(12096926, 12097049)
- +0x60: 0xb8961a FDE=(12097050, 12097068)
- +0x68: 0x9d7de0 FDE=(10321376, 10321377)
- +0x70: 0x9d7de0 FDE=(10321376, 10321377)
- +0x78: 0xac3ae0 FDE=(11287264, 11287269)
- +0x80: 0xa4b8e0 FDE=(10795232, 10795237)
- +0x88: 0xb8962c FDE=(12097068, 12097076)
- +0x90: 0xb89634 FDE=(12097076, 12097084)
- +0x98: 0xb8963c FDE=(12097084, 12097092)
- +0xa0: 0xb89644 FDE=(12097092, 12097123)
- +0xa8: 0xb89664 FDE=(12097124, 12097155)
- +0xb0: 0xb89684 FDE=(12097156, 12097187)
- +0xb8: 0xb896a4 FDE=(12097188, 12097219)
- +0xc0: 0x0 FDE=None
- +0xc8: 0x0 FDE=None
- +0xd0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd8: 0xa50370 FDE=(10814320, 10814325)
- +0xe0: 0xb8956a FDE=(12096874, 12096906)
- +0xe8: 0xb8958a FDE=(12096906, 12096925)
- +0xf0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xf8: 0xa50370 FDE=(10814320, 10814325)
- +0x100: 0xb7d28a FDE=(12046986, 12047005)
- +0x108: 0x0 FDE=None
- +0x110: 0x0 FDE=None
- +0x118: 0xb8952e FDE=(12096814, 12096829)
- +0x120: 0xb8953e FDE=(12096830, 12096848)
- +0x128: 0xb89550 FDE=(12096848, 12096874)
- +0x130: 0x0 FDE=None
- +0x138: 0xa50370 FDE=(10814320, 10814325)
- +0x140: 0x0 FDE=None
- +0x148: 0x0 FDE=None
- +0x150: 0xb8930a FDE=(12096266, 12096285)
- +0x158: 0xb8931e FDE=(12096286, 12096304)
- +0x160: 0xb89330 FDE=(12096304, 12096358)
- +0x168: 0xb89366 FDE=(12096358, 12096384)
- +0x170: 0xb88f10 FDE=(12095248, 12095257)
#### +0x28 body
      b8809e:	48 8d 05 eb 5b c8 00 	lea    rax,[rip+0xc85beb]        # 180dc90 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3950>
      b880a5:	48 89 06             	mov    QWORD PTR [rsi],rax
      b880a8:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      b880ac:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      b880b0:	c3                   	ret

### AP 0x180dc88 codeSlots=38
- +0x0: 0x0 FDE=None
- +0x8: 0x9d7de0 FDE=(10321376, 10321377)
- +0x10: 0xa50370 FDE=(10814320, 10814325)
- +0x18: 0xb8807e FDE=(12091518, 12091550)
- +0x20: 0xb8809e FDE=(12091550, 12091569)
- +0x28: 0x9d7de0 FDE=(10321376, 10321377)
- +0x30: 0xa50370 FDE=(10814320, 10814325)
- +0x38: 0xb880b2 FDE=(12091570, 12091598)
- +0x40: 0x0 FDE=None
- +0x48: 0x0 FDE=None
- +0x50: 0xb8959e FDE=(12096926, 12097049)
- +0x58: 0xb8961a FDE=(12097050, 12097068)
- +0x60: 0x9d7de0 FDE=(10321376, 10321377)
- +0x68: 0x9d7de0 FDE=(10321376, 10321377)
- +0x70: 0xac3ae0 FDE=(11287264, 11287269)
- +0x78: 0xa4b8e0 FDE=(10795232, 10795237)
- +0x80: 0xb8962c FDE=(12097068, 12097076)
- +0x88: 0xb89634 FDE=(12097076, 12097084)
- +0x90: 0xb8963c FDE=(12097084, 12097092)
- +0x98: 0xb89644 FDE=(12097092, 12097123)
- +0xa0: 0xb89664 FDE=(12097124, 12097155)
- +0xa8: 0xb89684 FDE=(12097156, 12097187)
- +0xb0: 0xb896a4 FDE=(12097188, 12097219)
- +0xb8: 0x0 FDE=None
- +0xc0: 0x0 FDE=None
- +0xc8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd0: 0xa50370 FDE=(10814320, 10814325)
- +0xd8: 0xb8956a FDE=(12096874, 12096906)
- +0xe0: 0xb8958a FDE=(12096906, 12096925)
- +0xe8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xf0: 0xa50370 FDE=(10814320, 10814325)
- +0xf8: 0xb7d28a FDE=(12046986, 12047005)
- +0x100: 0x0 FDE=None
- +0x108: 0x0 FDE=None
- +0x110: 0xb8952e FDE=(12096814, 12096829)
- +0x118: 0xb8953e FDE=(12096830, 12096848)
- +0x120: 0xb89550 FDE=(12096848, 12096874)
- +0x128: 0x0 FDE=None
- +0x130: 0xa50370 FDE=(10814320, 10814325)
- +0x138: 0x0 FDE=None
- +0x140: 0x0 FDE=None
- +0x148: 0xb8930a FDE=(12096266, 12096285)
- +0x150: 0xb8931e FDE=(12096286, 12096304)
- +0x158: 0xb89330 FDE=(12096304, 12096358)
- +0x160: 0xb89366 FDE=(12096358, 12096384)
- +0x168: 0xb88f10 FDE=(12095248, 12095257)
- +0x170: 0xb88f1a FDE=(12095258, 12095280)
#### +0x28 body
      9d7de0:	c3                   	ret

### AP 0x180dc90 codeSlots=38
- +0x0: 0x9d7de0 FDE=(10321376, 10321377)
- +0x8: 0xa50370 FDE=(10814320, 10814325)
- +0x10: 0xb8807e FDE=(12091518, 12091550)
- +0x18: 0xb8809e FDE=(12091550, 12091569)
- +0x20: 0x9d7de0 FDE=(10321376, 10321377)
- +0x28: 0xa50370 FDE=(10814320, 10814325)
- +0x30: 0xb880b2 FDE=(12091570, 12091598)
- +0x38: 0x0 FDE=None
- +0x40: 0x0 FDE=None
- +0x48: 0xb8959e FDE=(12096926, 12097049)
- +0x50: 0xb8961a FDE=(12097050, 12097068)
- +0x58: 0x9d7de0 FDE=(10321376, 10321377)
- +0x60: 0x9d7de0 FDE=(10321376, 10321377)
- +0x68: 0xac3ae0 FDE=(11287264, 11287269)
- +0x70: 0xa4b8e0 FDE=(10795232, 10795237)
- +0x78: 0xb8962c FDE=(12097068, 12097076)
- +0x80: 0xb89634 FDE=(12097076, 12097084)
- +0x88: 0xb8963c FDE=(12097084, 12097092)
- +0x90: 0xb89644 FDE=(12097092, 12097123)
- +0x98: 0xb89664 FDE=(12097124, 12097155)
- +0xa0: 0xb89684 FDE=(12097156, 12097187)
- +0xa8: 0xb896a4 FDE=(12097188, 12097219)
- +0xb0: 0x0 FDE=None
- +0xb8: 0x0 FDE=None
- +0xc0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc8: 0xa50370 FDE=(10814320, 10814325)
- +0xd0: 0xb8956a FDE=(12096874, 12096906)
- +0xd8: 0xb8958a FDE=(12096906, 12096925)
- +0xe0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe8: 0xa50370 FDE=(10814320, 10814325)
- +0xf0: 0xb7d28a FDE=(12046986, 12047005)
- +0xf8: 0x0 FDE=None
- +0x100: 0x0 FDE=None
- +0x108: 0xb8952e FDE=(12096814, 12096829)
- +0x110: 0xb8953e FDE=(12096830, 12096848)
- +0x118: 0xb89550 FDE=(12096848, 12096874)
- +0x120: 0x0 FDE=None
- +0x128: 0xa50370 FDE=(10814320, 10814325)
- +0x130: 0x0 FDE=None
- +0x138: 0x0 FDE=None
- +0x140: 0xb8930a FDE=(12096266, 12096285)
- +0x148: 0xb8931e FDE=(12096286, 12096304)
- +0x150: 0xb89330 FDE=(12096304, 12096358)
- +0x158: 0xb89366 FDE=(12096358, 12096384)
- +0x160: 0xb88f10 FDE=(12095248, 12095257)
- +0x168: 0xb88f1a FDE=(12095258, 12095280)
- +0x170: 0xb89380 FDE=(12096384, 12096813)
#### +0x28 body
      a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x180dc98 codeSlots=37
- +0x0: 0xa50370 FDE=(10814320, 10814325)
- +0x8: 0xb8807e FDE=(12091518, 12091550)
- +0x10: 0xb8809e FDE=(12091550, 12091569)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0xa50370 FDE=(10814320, 10814325)
- +0x28: 0xb880b2 FDE=(12091570, 12091598)
- +0x30: 0x0 FDE=None
- +0x38: 0x0 FDE=None
- +0x40: 0xb8959e FDE=(12096926, 12097049)
- +0x48: 0xb8961a FDE=(12097050, 12097068)
- +0x50: 0x9d7de0 FDE=(10321376, 10321377)
- +0x58: 0x9d7de0 FDE=(10321376, 10321377)
- +0x60: 0xac3ae0 FDE=(11287264, 11287269)
- +0x68: 0xa4b8e0 FDE=(10795232, 10795237)
- +0x70: 0xb8962c FDE=(12097068, 12097076)
- +0x78: 0xb89634 FDE=(12097076, 12097084)
- +0x80: 0xb8963c FDE=(12097084, 12097092)
- +0x88: 0xb89644 FDE=(12097092, 12097123)
- +0x90: 0xb89664 FDE=(12097124, 12097155)
- +0x98: 0xb89684 FDE=(12097156, 12097187)
- +0xa0: 0xb896a4 FDE=(12097188, 12097219)
- +0xa8: 0x0 FDE=None
- +0xb0: 0x0 FDE=None
- +0xb8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc0: 0xa50370 FDE=(10814320, 10814325)
- +0xc8: 0xb8956a FDE=(12096874, 12096906)
- +0xd0: 0xb8958a FDE=(12096906, 12096925)
- +0xd8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe0: 0xa50370 FDE=(10814320, 10814325)
- +0xe8: 0xb7d28a FDE=(12046986, 12047005)
- +0xf0: 0x0 FDE=None
- +0xf8: 0x0 FDE=None
- +0x100: 0xb8952e FDE=(12096814, 12096829)
- +0x108: 0xb8953e FDE=(12096830, 12096848)
- +0x110: 0xb89550 FDE=(12096848, 12096874)
- +0x118: 0x0 FDE=None
- +0x120: 0xa50370 FDE=(10814320, 10814325)
- +0x128: 0x0 FDE=None
- +0x130: 0x0 FDE=None
- +0x138: 0xb8930a FDE=(12096266, 12096285)
- +0x140: 0xb8931e FDE=(12096286, 12096304)
- +0x148: 0xb89330 FDE=(12096304, 12096358)
- +0x150: 0xb89366 FDE=(12096358, 12096384)
- +0x158: 0xb88f10 FDE=(12095248, 12095257)
- +0x160: 0xb88f1a FDE=(12095258, 12095280)
- +0x168: 0xb89380 FDE=(12096384, 12096813)
- +0x170: 0x0 FDE=None
#### +0x28 body
      b880b2:	48 89 f8             	mov    rax,rdi
      b880b5:	48 8b 56 08          	mov    rdx,QWORD PTR [rsi+0x8]
      b880b9:	48 8b 4a 08          	mov    rcx,QWORD PTR [rdx+0x8]
      b880bd:	0f 10 02             	movups xmm0,XMMWORD PTR [rdx]
      b880c0:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      b880c3:	48 85 c9             	test   rcx,rcx
      b880c6:	74 05                	je     b880cd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd506d>
      b880c8:	f0 48 ff 41 10       	lock inc QWORD PTR [rcx+0x10]
      b880cd:	c3                   	ret

### AP 0x180dca0 codeSlots=37
- +0x0: 0xb8807e FDE=(12091518, 12091550)
- +0x8: 0xb8809e FDE=(12091550, 12091569)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0xa50370 FDE=(10814320, 10814325)
- +0x20: 0xb880b2 FDE=(12091570, 12091598)
- +0x28: 0x0 FDE=None
- +0x30: 0x0 FDE=None
- +0x38: 0xb8959e FDE=(12096926, 12097049)
- +0x40: 0xb8961a FDE=(12097050, 12097068)
- +0x48: 0x9d7de0 FDE=(10321376, 10321377)
- +0x50: 0x9d7de0 FDE=(10321376, 10321377)
- +0x58: 0xac3ae0 FDE=(11287264, 11287269)
- +0x60: 0xa4b8e0 FDE=(10795232, 10795237)
- +0x68: 0xb8962c FDE=(12097068, 12097076)
- +0x70: 0xb89634 FDE=(12097076, 12097084)
- +0x78: 0xb8963c FDE=(12097084, 12097092)
- +0x80: 0xb89644 FDE=(12097092, 12097123)
- +0x88: 0xb89664 FDE=(12097124, 12097155)
- +0x90: 0xb89684 FDE=(12097156, 12097187)
- +0x98: 0xb896a4 FDE=(12097188, 12097219)
- +0xa0: 0x0 FDE=None
- +0xa8: 0x0 FDE=None
- +0xb0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb8: 0xa50370 FDE=(10814320, 10814325)
- +0xc0: 0xb8956a FDE=(12096874, 12096906)
- +0xc8: 0xb8958a FDE=(12096906, 12096925)
- +0xd0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd8: 0xa50370 FDE=(10814320, 10814325)
- +0xe0: 0xb7d28a FDE=(12046986, 12047005)
- +0xe8: 0x0 FDE=None
- +0xf0: 0x0 FDE=None
- +0xf8: 0xb8952e FDE=(12096814, 12096829)
- +0x100: 0xb8953e FDE=(12096830, 12096848)
- +0x108: 0xb89550 FDE=(12096848, 12096874)
- +0x110: 0x0 FDE=None
- +0x118: 0xa50370 FDE=(10814320, 10814325)
- +0x120: 0x0 FDE=None
- +0x128: 0x0 FDE=None
- +0x130: 0xb8930a FDE=(12096266, 12096285)
- +0x138: 0xb8931e FDE=(12096286, 12096304)
- +0x140: 0xb89330 FDE=(12096304, 12096358)
- +0x148: 0xb89366 FDE=(12096358, 12096384)
- +0x150: 0xb88f10 FDE=(12095248, 12095257)
- +0x158: 0xb88f1a FDE=(12095258, 12095280)
- +0x160: 0xb89380 FDE=(12096384, 12096813)
- +0x168: 0x0 FDE=None
- +0x170: 0x0 FDE=None

### AP 0x180dca8 codeSlots=37
- +0x0: 0xb8809e FDE=(12091550, 12091569)
- +0x8: 0x9d7de0 FDE=(10321376, 10321377)
- +0x10: 0xa50370 FDE=(10814320, 10814325)
- +0x18: 0xb880b2 FDE=(12091570, 12091598)
- +0x20: 0x0 FDE=None
- +0x28: 0x0 FDE=None
- +0x30: 0xb8959e FDE=(12096926, 12097049)
- +0x38: 0xb8961a FDE=(12097050, 12097068)
- +0x40: 0x9d7de0 FDE=(10321376, 10321377)
- +0x48: 0x9d7de0 FDE=(10321376, 10321377)
- +0x50: 0xac3ae0 FDE=(11287264, 11287269)
- +0x58: 0xa4b8e0 FDE=(10795232, 10795237)
- +0x60: 0xb8962c FDE=(12097068, 12097076)
- +0x68: 0xb89634 FDE=(12097076, 12097084)
- +0x70: 0xb8963c FDE=(12097084, 12097092)
- +0x78: 0xb89644 FDE=(12097092, 12097123)
- +0x80: 0xb89664 FDE=(12097124, 12097155)
- +0x88: 0xb89684 FDE=(12097156, 12097187)
- +0x90: 0xb896a4 FDE=(12097188, 12097219)
- +0x98: 0x0 FDE=None
- +0xa0: 0x0 FDE=None
- +0xa8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb0: 0xa50370 FDE=(10814320, 10814325)
- +0xb8: 0xb8956a FDE=(12096874, 12096906)
- +0xc0: 0xb8958a FDE=(12096906, 12096925)
- +0xc8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd0: 0xa50370 FDE=(10814320, 10814325)
- +0xd8: 0xb7d28a FDE=(12046986, 12047005)
- +0xe0: 0x0 FDE=None
- +0xe8: 0x0 FDE=None
- +0xf0: 0xb8952e FDE=(12096814, 12096829)
- +0xf8: 0xb8953e FDE=(12096830, 12096848)
- +0x100: 0xb89550 FDE=(12096848, 12096874)
- +0x108: 0x0 FDE=None
- +0x110: 0xa50370 FDE=(10814320, 10814325)
- +0x118: 0x0 FDE=None
- +0x120: 0x0 FDE=None
- +0x128: 0xb8930a FDE=(12096266, 12096285)
- +0x130: 0xb8931e FDE=(12096286, 12096304)
- +0x138: 0xb89330 FDE=(12096304, 12096358)
- +0x140: 0xb89366 FDE=(12096358, 12096384)
- +0x148: 0xb88f10 FDE=(12095248, 12095257)
- +0x150: 0xb88f1a FDE=(12095258, 12095280)
- +0x158: 0xb89380 FDE=(12096384, 12096813)
- +0x160: 0x0 FDE=None
- +0x168: 0x0 FDE=None
- +0x170: 0x9d7de0 FDE=(10321376, 10321377)

### AP 0x180dcb0 codeSlots=37
- +0x0: 0x9d7de0 FDE=(10321376, 10321377)
- +0x8: 0xa50370 FDE=(10814320, 10814325)
- +0x10: 0xb880b2 FDE=(12091570, 12091598)
- +0x18: 0x0 FDE=None
- +0x20: 0x0 FDE=None
- +0x28: 0xb8959e FDE=(12096926, 12097049)
- +0x30: 0xb8961a FDE=(12097050, 12097068)
- +0x38: 0x9d7de0 FDE=(10321376, 10321377)
- +0x40: 0x9d7de0 FDE=(10321376, 10321377)
- +0x48: 0xac3ae0 FDE=(11287264, 11287269)
- +0x50: 0xa4b8e0 FDE=(10795232, 10795237)
- +0x58: 0xb8962c FDE=(12097068, 12097076)
- +0x60: 0xb89634 FDE=(12097076, 12097084)
- +0x68: 0xb8963c FDE=(12097084, 12097092)
- +0x70: 0xb89644 FDE=(12097092, 12097123)
- +0x78: 0xb89664 FDE=(12097124, 12097155)
- +0x80: 0xb89684 FDE=(12097156, 12097187)
- +0x88: 0xb896a4 FDE=(12097188, 12097219)
- +0x90: 0x0 FDE=None
- +0x98: 0x0 FDE=None
- +0xa0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa8: 0xa50370 FDE=(10814320, 10814325)
- +0xb0: 0xb8956a FDE=(12096874, 12096906)
- +0xb8: 0xb8958a FDE=(12096906, 12096925)
- +0xc0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc8: 0xa50370 FDE=(10814320, 10814325)
- +0xd0: 0xb7d28a FDE=(12046986, 12047005)
- +0xd8: 0x0 FDE=None
- +0xe0: 0x0 FDE=None
- +0xe8: 0xb8952e FDE=(12096814, 12096829)
- +0xf0: 0xb8953e FDE=(12096830, 12096848)
- +0xf8: 0xb89550 FDE=(12096848, 12096874)
- +0x100: 0x0 FDE=None
- +0x108: 0xa50370 FDE=(10814320, 10814325)
- +0x110: 0x0 FDE=None
- +0x118: 0x0 FDE=None
- +0x120: 0xb8930a FDE=(12096266, 12096285)
- +0x128: 0xb8931e FDE=(12096286, 12096304)
- +0x130: 0xb89330 FDE=(12096304, 12096358)
- +0x138: 0xb89366 FDE=(12096358, 12096384)
- +0x140: 0xb88f10 FDE=(12095248, 12095257)
- +0x148: 0xb88f1a FDE=(12095258, 12095280)
- +0x150: 0xb89380 FDE=(12096384, 12096813)
- +0x158: 0x0 FDE=None
- +0x160: 0x0 FDE=None
- +0x168: 0x9d7de0 FDE=(10321376, 10321377)
- +0x170: 0xa50370 FDE=(10814320, 10814325)
#### +0x28 body
      b8959e:	53                   	push   rbx
      b8959f:	48 89 fb             	mov    rbx,rdi
      b895a2:	48 8d 05 2f 47 c8 00 	lea    rax,[rip+0xc8472f]        # 180dcd8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3998>
      b895a9:	48 89 07             	mov    QWORD PTR [rdi],rax
      b895ac:	48 8b bf 60 03 00 00 	mov    rdi,QWORD PTR [rdi+0x360]
      b895b3:	e8 ce 4e f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b895b8:	48 8b bb 50 03 00 00 	mov    rdi,QWORD PTR [rbx+0x350]
      b895bf:	e8 c2 4e f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b895c4:	48 8b bb 40 03 00 00 	mov    rdi,QWORD PTR [rbx+0x340]
      b895cb:	e8 b6 4e f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b895d0:	48 8d bb 30 03 00 00 	lea    rdi,[rbx+0x330]
      b895d7:	e8 1a eb ff ff       	call   b880f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5096>
      b895dc:	48 8b bb 28 03 00 00 	mov    rdi,QWORD PTR [rbx+0x328]
      b895e3:	e8 9e 4e f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b895e8:	48 8d bb f0 02 00 00 	lea    rdi,[rbx+0x2f0]
      b895ef:	e8 76 09 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b895f4:	48 8d bb 70 02 00 00 	lea    rdi,[rbx+0x270]
      b895fb:	e8 6e ec ff ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      b89600:	48 8d bb f0 01 00 00 	lea    rdi,[rbx+0x1f0]
      b89607:	e8 62 ec ff ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      b8960c:	48 83 c3 10          	add    rbx,0x10
      b89610:	48 89 df             	mov    rdi,rbx
      b89613:	5b                   	pop    rbx
      b89614:	e9 87 43 94 00       	jmp    14cd9a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x312f24>

### AP 0x180dcb8 codeSlots=37
- +0x0: 0xa50370 FDE=(10814320, 10814325)
- +0x8: 0xb880b2 FDE=(12091570, 12091598)
- +0x10: 0x0 FDE=None
- +0x18: 0x0 FDE=None
- +0x20: 0xb8959e FDE=(12096926, 12097049)
- +0x28: 0xb8961a FDE=(12097050, 12097068)
- +0x30: 0x9d7de0 FDE=(10321376, 10321377)
- +0x38: 0x9d7de0 FDE=(10321376, 10321377)
- +0x40: 0xac3ae0 FDE=(11287264, 11287269)
- +0x48: 0xa4b8e0 FDE=(10795232, 10795237)
- +0x50: 0xb8962c FDE=(12097068, 12097076)
- +0x58: 0xb89634 FDE=(12097076, 12097084)
- +0x60: 0xb8963c FDE=(12097084, 12097092)
- +0x68: 0xb89644 FDE=(12097092, 12097123)
- +0x70: 0xb89664 FDE=(12097124, 12097155)
- +0x78: 0xb89684 FDE=(12097156, 12097187)
- +0x80: 0xb896a4 FDE=(12097188, 12097219)
- +0x88: 0x0 FDE=None
- +0x90: 0x0 FDE=None
- +0x98: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa0: 0xa50370 FDE=(10814320, 10814325)
- +0xa8: 0xb8956a FDE=(12096874, 12096906)
- +0xb0: 0xb8958a FDE=(12096906, 12096925)
- +0xb8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc0: 0xa50370 FDE=(10814320, 10814325)
- +0xc8: 0xb7d28a FDE=(12046986, 12047005)
- +0xd0: 0x0 FDE=None
- +0xd8: 0x0 FDE=None
- +0xe0: 0xb8952e FDE=(12096814, 12096829)
- +0xe8: 0xb8953e FDE=(12096830, 12096848)
- +0xf0: 0xb89550 FDE=(12096848, 12096874)
- +0xf8: 0x0 FDE=None
- +0x100: 0xa50370 FDE=(10814320, 10814325)
- +0x108: 0x0 FDE=None
- +0x110: 0x0 FDE=None
- +0x118: 0xb8930a FDE=(12096266, 12096285)
- +0x120: 0xb8931e FDE=(12096286, 12096304)
- +0x128: 0xb89330 FDE=(12096304, 12096358)
- +0x130: 0xb89366 FDE=(12096358, 12096384)
- +0x138: 0xb88f10 FDE=(12095248, 12095257)
- +0x140: 0xb88f1a FDE=(12095258, 12095280)
- +0x148: 0xb89380 FDE=(12096384, 12096813)
- +0x150: 0x0 FDE=None
- +0x158: 0x0 FDE=None
- +0x160: 0x9d7de0 FDE=(10321376, 10321377)
- +0x168: 0xa50370 FDE=(10814320, 10814325)
- +0x170: 0xb8923c FDE=(12096060, 12096092)
#### +0x28 body
      b8961a:	53                   	push   rbx
      b8961b:	48 89 fb             	mov    rbx,rdi
      b8961e:	e8 7b ff ff ff       	call   b8959e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd653e>
      b89623:	48 89 df             	mov    rdi,rbx
      b89626:	5b                   	pop    rbx
      b89627:	e9 f4 48 c6 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x180dcc0 codeSlots=37
- +0x0: 0xb880b2 FDE=(12091570, 12091598)
- +0x8: 0x0 FDE=None
- +0x10: 0x0 FDE=None
- +0x18: 0xb8959e FDE=(12096926, 12097049)
- +0x20: 0xb8961a FDE=(12097050, 12097068)
- +0x28: 0x9d7de0 FDE=(10321376, 10321377)
- +0x30: 0x9d7de0 FDE=(10321376, 10321377)
- +0x38: 0xac3ae0 FDE=(11287264, 11287269)
- +0x40: 0xa4b8e0 FDE=(10795232, 10795237)
- +0x48: 0xb8962c FDE=(12097068, 12097076)
- +0x50: 0xb89634 FDE=(12097076, 12097084)
- +0x58: 0xb8963c FDE=(12097084, 12097092)
- +0x60: 0xb89644 FDE=(12097092, 12097123)
- +0x68: 0xb89664 FDE=(12097124, 12097155)
- +0x70: 0xb89684 FDE=(12097156, 12097187)
- +0x78: 0xb896a4 FDE=(12097188, 12097219)
- +0x80: 0x0 FDE=None
- +0x88: 0x0 FDE=None
- +0x90: 0x9d7de0 FDE=(10321376, 10321377)
- +0x98: 0xa50370 FDE=(10814320, 10814325)
- +0xa0: 0xb8956a FDE=(12096874, 12096906)
- +0xa8: 0xb8958a FDE=(12096906, 12096925)
- +0xb0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb8: 0xa50370 FDE=(10814320, 10814325)
- +0xc0: 0xb7d28a FDE=(12046986, 12047005)
- +0xc8: 0x0 FDE=None
- +0xd0: 0x0 FDE=None
- +0xd8: 0xb8952e FDE=(12096814, 12096829)
- +0xe0: 0xb8953e FDE=(12096830, 12096848)
- +0xe8: 0xb89550 FDE=(12096848, 12096874)
- +0xf0: 0x0 FDE=None
- +0xf8: 0xa50370 FDE=(10814320, 10814325)
- +0x100: 0x0 FDE=None
- +0x108: 0x0 FDE=None
- +0x110: 0xb8930a FDE=(12096266, 12096285)
- +0x118: 0xb8931e FDE=(12096286, 12096304)
- +0x120: 0xb89330 FDE=(12096304, 12096358)
- +0x128: 0xb89366 FDE=(12096358, 12096384)
- +0x130: 0xb88f10 FDE=(12095248, 12095257)
- +0x138: 0xb88f1a FDE=(12095258, 12095280)
- +0x140: 0xb89380 FDE=(12096384, 12096813)
- +0x148: 0x0 FDE=None
- +0x150: 0x0 FDE=None
- +0x158: 0x9d7de0 FDE=(10321376, 10321377)
- +0x160: 0xa50370 FDE=(10814320, 10814325)
- +0x168: 0xb8923c FDE=(12096060, 12096092)
- +0x170: 0xb8925c FDE=(12096092, 12096111)
#### +0x28 body
      9d7de0:	c3                   	ret

### AP 0x180dcc8 codeSlots=37
- +0x0: 0x0 FDE=None
- +0x8: 0x0 FDE=None
- +0x10: 0xb8959e FDE=(12096926, 12097049)
- +0x18: 0xb8961a FDE=(12097050, 12097068)
- +0x20: 0x9d7de0 FDE=(10321376, 10321377)
- +0x28: 0x9d7de0 FDE=(10321376, 10321377)
- +0x30: 0xac3ae0 FDE=(11287264, 11287269)
- +0x38: 0xa4b8e0 FDE=(10795232, 10795237)
- +0x40: 0xb8962c FDE=(12097068, 12097076)
- +0x48: 0xb89634 FDE=(12097076, 12097084)
- +0x50: 0xb8963c FDE=(12097084, 12097092)
- +0x58: 0xb89644 FDE=(12097092, 12097123)
- +0x60: 0xb89664 FDE=(12097124, 12097155)
- +0x68: 0xb89684 FDE=(12097156, 12097187)
- +0x70: 0xb896a4 FDE=(12097188, 12097219)
- +0x78: 0x0 FDE=None
- +0x80: 0x0 FDE=None
- +0x88: 0x9d7de0 FDE=(10321376, 10321377)
- +0x90: 0xa50370 FDE=(10814320, 10814325)
- +0x98: 0xb8956a FDE=(12096874, 12096906)
- +0xa0: 0xb8958a FDE=(12096906, 12096925)
- +0xa8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb0: 0xa50370 FDE=(10814320, 10814325)
- +0xb8: 0xb7d28a FDE=(12046986, 12047005)
- +0xc0: 0x0 FDE=None
- +0xc8: 0x0 FDE=None
- +0xd0: 0xb8952e FDE=(12096814, 12096829)
- +0xd8: 0xb8953e FDE=(12096830, 12096848)
- +0xe0: 0xb89550 FDE=(12096848, 12096874)
- +0xe8: 0x0 FDE=None
- +0xf0: 0xa50370 FDE=(10814320, 10814325)
- +0xf8: 0x0 FDE=None
- +0x100: 0x0 FDE=None
- +0x108: 0xb8930a FDE=(12096266, 12096285)
- +0x110: 0xb8931e FDE=(12096286, 12096304)
- +0x118: 0xb89330 FDE=(12096304, 12096358)
- +0x120: 0xb89366 FDE=(12096358, 12096384)
- +0x128: 0xb88f10 FDE=(12095248, 12095257)
- +0x130: 0xb88f1a FDE=(12095258, 12095280)
- +0x138: 0xb89380 FDE=(12096384, 12096813)
- +0x140: 0x0 FDE=None
- +0x148: 0x0 FDE=None
- +0x150: 0x9d7de0 FDE=(10321376, 10321377)
- +0x158: 0xa50370 FDE=(10814320, 10814325)
- +0x160: 0xb8923c FDE=(12096060, 12096092)
- +0x168: 0xb8925c FDE=(12096092, 12096111)
- +0x170: 0x9d7de0 FDE=(10321376, 10321377)
#### +0x28 body
      9d7de0:	c3                   	ret

### AP 0x180dcd0 codeSlots=38
- +0x0: 0x0 FDE=None
- +0x8: 0xb8959e FDE=(12096926, 12097049)
- +0x10: 0xb8961a FDE=(12097050, 12097068)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0x9d7de0 FDE=(10321376, 10321377)
- +0x28: 0xac3ae0 FDE=(11287264, 11287269)
- +0x30: 0xa4b8e0 FDE=(10795232, 10795237)
- +0x38: 0xb8962c FDE=(12097068, 12097076)
- +0x40: 0xb89634 FDE=(12097076, 12097084)
- +0x48: 0xb8963c FDE=(12097084, 12097092)
- +0x50: 0xb89644 FDE=(12097092, 12097123)
- +0x58: 0xb89664 FDE=(12097124, 12097155)
- +0x60: 0xb89684 FDE=(12097156, 12097187)
- +0x68: 0xb896a4 FDE=(12097188, 12097219)
- +0x70: 0x0 FDE=None
- +0x78: 0x0 FDE=None
- +0x80: 0x9d7de0 FDE=(10321376, 10321377)
- +0x88: 0xa50370 FDE=(10814320, 10814325)
- +0x90: 0xb8956a FDE=(12096874, 12096906)
- +0x98: 0xb8958a FDE=(12096906, 12096925)
- +0xa0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa8: 0xa50370 FDE=(10814320, 10814325)
- +0xb0: 0xb7d28a FDE=(12046986, 12047005)
- +0xb8: 0x0 FDE=None
- +0xc0: 0x0 FDE=None
- +0xc8: 0xb8952e FDE=(12096814, 12096829)
- +0xd0: 0xb8953e FDE=(12096830, 12096848)
- +0xd8: 0xb89550 FDE=(12096848, 12096874)
- +0xe0: 0x0 FDE=None
- +0xe8: 0xa50370 FDE=(10814320, 10814325)
- +0xf0: 0x0 FDE=None
- +0xf8: 0x0 FDE=None
- +0x100: 0xb8930a FDE=(12096266, 12096285)
- +0x108: 0xb8931e FDE=(12096286, 12096304)
- +0x110: 0xb89330 FDE=(12096304, 12096358)
- +0x118: 0xb89366 FDE=(12096358, 12096384)
- +0x120: 0xb88f10 FDE=(12095248, 12095257)
- +0x128: 0xb88f1a FDE=(12095258, 12095280)
- +0x130: 0xb89380 FDE=(12096384, 12096813)
- +0x138: 0x0 FDE=None
- +0x140: 0x0 FDE=None
- +0x148: 0x9d7de0 FDE=(10321376, 10321377)
- +0x150: 0xa50370 FDE=(10814320, 10814325)
- +0x158: 0xb8923c FDE=(12096060, 12096092)
- +0x160: 0xb8925c FDE=(12096092, 12096111)
- +0x168: 0x9d7de0 FDE=(10321376, 10321377)
- +0x170: 0xa50370 FDE=(10814320, 10814325)
#### +0x28 body
      ac3ae0:	c6 47 08 00          	mov    BYTE PTR [rdi+0x8],0x0
      ac3ae4:	c3                   	ret

### AP 0x180dcd8 codeSlots=38
- +0x0: 0xb8959e FDE=(12096926, 12097049)
- +0x8: 0xb8961a FDE=(12097050, 12097068)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0xac3ae0 FDE=(11287264, 11287269)
- +0x28: 0xa4b8e0 FDE=(10795232, 10795237)
- +0x30: 0xb8962c FDE=(12097068, 12097076)
- +0x38: 0xb89634 FDE=(12097076, 12097084)
- +0x40: 0xb8963c FDE=(12097084, 12097092)
- +0x48: 0xb89644 FDE=(12097092, 12097123)
- +0x50: 0xb89664 FDE=(12097124, 12097155)
- +0x58: 0xb89684 FDE=(12097156, 12097187)
- +0x60: 0xb896a4 FDE=(12097188, 12097219)
- +0x68: 0x0 FDE=None
- +0x70: 0x0 FDE=None
- +0x78: 0x9d7de0 FDE=(10321376, 10321377)
- +0x80: 0xa50370 FDE=(10814320, 10814325)
- +0x88: 0xb8956a FDE=(12096874, 12096906)
- +0x90: 0xb8958a FDE=(12096906, 12096925)
- +0x98: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa0: 0xa50370 FDE=(10814320, 10814325)
- +0xa8: 0xb7d28a FDE=(12046986, 12047005)
- +0xb0: 0x0 FDE=None
- +0xb8: 0x0 FDE=None
- +0xc0: 0xb8952e FDE=(12096814, 12096829)
- +0xc8: 0xb8953e FDE=(12096830, 12096848)
- +0xd0: 0xb89550 FDE=(12096848, 12096874)
- +0xd8: 0x0 FDE=None
- +0xe0: 0xa50370 FDE=(10814320, 10814325)
- +0xe8: 0x0 FDE=None
- +0xf0: 0x0 FDE=None
- +0xf8: 0xb8930a FDE=(12096266, 12096285)
- +0x100: 0xb8931e FDE=(12096286, 12096304)
- +0x108: 0xb89330 FDE=(12096304, 12096358)
- +0x110: 0xb89366 FDE=(12096358, 12096384)
- +0x118: 0xb88f10 FDE=(12095248, 12095257)
- +0x120: 0xb88f1a FDE=(12095258, 12095280)
- +0x128: 0xb89380 FDE=(12096384, 12096813)
- +0x130: 0x0 FDE=None
- +0x138: 0x0 FDE=None
- +0x140: 0x9d7de0 FDE=(10321376, 10321377)
- +0x148: 0xa50370 FDE=(10814320, 10814325)
- +0x150: 0xb8923c FDE=(12096060, 12096092)
- +0x158: 0xb8925c FDE=(12096092, 12096111)
- +0x160: 0x9d7de0 FDE=(10321376, 10321377)
- +0x168: 0xa50370 FDE=(10814320, 10814325)
- +0x170: 0xb89270 FDE=(12096112, 12096122)
#### +0x28 body
      a4b8e0:	48 8d 47 10          	lea    rax,[rdi+0x10]
      a4b8e4:	c3                   	ret

### AP 0x180dce0 codeSlots=37
- +0x0: 0xb8961a FDE=(12097050, 12097068)
- +0x8: 0x9d7de0 FDE=(10321376, 10321377)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0xac3ae0 FDE=(11287264, 11287269)
- +0x20: 0xa4b8e0 FDE=(10795232, 10795237)
- +0x28: 0xb8962c FDE=(12097068, 12097076)
- +0x30: 0xb89634 FDE=(12097076, 12097084)
- +0x38: 0xb8963c FDE=(12097084, 12097092)
- +0x40: 0xb89644 FDE=(12097092, 12097123)
- +0x48: 0xb89664 FDE=(12097124, 12097155)
- +0x50: 0xb89684 FDE=(12097156, 12097187)
- +0x58: 0xb896a4 FDE=(12097188, 12097219)
- +0x60: 0x0 FDE=None
- +0x68: 0x0 FDE=None
- +0x70: 0x9d7de0 FDE=(10321376, 10321377)
- +0x78: 0xa50370 FDE=(10814320, 10814325)
- +0x80: 0xb8956a FDE=(12096874, 12096906)
- +0x88: 0xb8958a FDE=(12096906, 12096925)
- +0x90: 0x9d7de0 FDE=(10321376, 10321377)
- +0x98: 0xa50370 FDE=(10814320, 10814325)
- +0xa0: 0xb7d28a FDE=(12046986, 12047005)
- +0xa8: 0x0 FDE=None
- +0xb0: 0x0 FDE=None
- +0xb8: 0xb8952e FDE=(12096814, 12096829)
- +0xc0: 0xb8953e FDE=(12096830, 12096848)
- +0xc8: 0xb89550 FDE=(12096848, 12096874)
- +0xd0: 0x0 FDE=None
- +0xd8: 0xa50370 FDE=(10814320, 10814325)
- +0xe0: 0x0 FDE=None
- +0xe8: 0x0 FDE=None
- +0xf0: 0xb8930a FDE=(12096266, 12096285)
- +0xf8: 0xb8931e FDE=(12096286, 12096304)
- +0x100: 0xb89330 FDE=(12096304, 12096358)
- +0x108: 0xb89366 FDE=(12096358, 12096384)
- +0x110: 0xb88f10 FDE=(12095248, 12095257)
- +0x118: 0xb88f1a FDE=(12095258, 12095280)
- +0x120: 0xb89380 FDE=(12096384, 12096813)
- +0x128: 0x0 FDE=None
- +0x130: 0x0 FDE=None
- +0x138: 0x9d7de0 FDE=(10321376, 10321377)
- +0x140: 0xa50370 FDE=(10814320, 10814325)
- +0x148: 0xb8923c FDE=(12096060, 12096092)
- +0x150: 0xb8925c FDE=(12096092, 12096111)
- +0x158: 0x9d7de0 FDE=(10321376, 10321377)
- +0x160: 0xa50370 FDE=(10814320, 10814325)
- +0x168: 0xb89270 FDE=(12096112, 12096122)
- +0x170: 0x0 FDE=None
#### +0x28 body
      b8962c:	48 8d 87 f0 01 00 00 	lea    rax,[rdi+0x1f0]
      b89633:	c3                   	ret

### AP 0x180dce8 codeSlots=37
- +0x0: 0x9d7de0 FDE=(10321376, 10321377)
- +0x8: 0x9d7de0 FDE=(10321376, 10321377)
- +0x10: 0xac3ae0 FDE=(11287264, 11287269)
- +0x18: 0xa4b8e0 FDE=(10795232, 10795237)
- +0x20: 0xb8962c FDE=(12097068, 12097076)
- +0x28: 0xb89634 FDE=(12097076, 12097084)
- +0x30: 0xb8963c FDE=(12097084, 12097092)
- +0x38: 0xb89644 FDE=(12097092, 12097123)
- +0x40: 0xb89664 FDE=(12097124, 12097155)
- +0x48: 0xb89684 FDE=(12097156, 12097187)
- +0x50: 0xb896a4 FDE=(12097188, 12097219)
- +0x58: 0x0 FDE=None
- +0x60: 0x0 FDE=None
- +0x68: 0x9d7de0 FDE=(10321376, 10321377)
- +0x70: 0xa50370 FDE=(10814320, 10814325)
- +0x78: 0xb8956a FDE=(12096874, 12096906)
- +0x80: 0xb8958a FDE=(12096906, 12096925)
- +0x88: 0x9d7de0 FDE=(10321376, 10321377)
- +0x90: 0xa50370 FDE=(10814320, 10814325)
- +0x98: 0xb7d28a FDE=(12046986, 12047005)
- +0xa0: 0x0 FDE=None
- +0xa8: 0x0 FDE=None
- +0xb0: 0xb8952e FDE=(12096814, 12096829)
- +0xb8: 0xb8953e FDE=(12096830, 12096848)
- +0xc0: 0xb89550 FDE=(12096848, 12096874)
- +0xc8: 0x0 FDE=None
- +0xd0: 0xa50370 FDE=(10814320, 10814325)
- +0xd8: 0x0 FDE=None
- +0xe0: 0x0 FDE=None
- +0xe8: 0xb8930a FDE=(12096266, 12096285)
- +0xf0: 0xb8931e FDE=(12096286, 12096304)
- +0xf8: 0xb89330 FDE=(12096304, 12096358)
- +0x100: 0xb89366 FDE=(12096358, 12096384)
- +0x108: 0xb88f10 FDE=(12095248, 12095257)
- +0x110: 0xb88f1a FDE=(12095258, 12095280)
- +0x118: 0xb89380 FDE=(12096384, 12096813)
- +0x120: 0x0 FDE=None
- +0x128: 0x0 FDE=None
- +0x130: 0x9d7de0 FDE=(10321376, 10321377)
- +0x138: 0xa50370 FDE=(10814320, 10814325)
- +0x140: 0xb8923c FDE=(12096060, 12096092)
- +0x148: 0xb8925c FDE=(12096092, 12096111)
- +0x150: 0x9d7de0 FDE=(10321376, 10321377)
- +0x158: 0xa50370 FDE=(10814320, 10814325)
- +0x160: 0xb89270 FDE=(12096112, 12096122)
- +0x168: 0x0 FDE=None
- +0x170: 0x0 FDE=None
#### +0x28 body
      b89634:	48 8d 87 70 02 00 00 	lea    rax,[rdi+0x270]
      b8963b:	c3                   	ret

### AP 0x180dcf0 codeSlots=37
- +0x0: 0x9d7de0 FDE=(10321376, 10321377)
- +0x8: 0xac3ae0 FDE=(11287264, 11287269)
- +0x10: 0xa4b8e0 FDE=(10795232, 10795237)
- +0x18: 0xb8962c FDE=(12097068, 12097076)
- +0x20: 0xb89634 FDE=(12097076, 12097084)
- +0x28: 0xb8963c FDE=(12097084, 12097092)
- +0x30: 0xb89644 FDE=(12097092, 12097123)
- +0x38: 0xb89664 FDE=(12097124, 12097155)
- +0x40: 0xb89684 FDE=(12097156, 12097187)
- +0x48: 0xb896a4 FDE=(12097188, 12097219)
- +0x50: 0x0 FDE=None
- +0x58: 0x0 FDE=None
- +0x60: 0x9d7de0 FDE=(10321376, 10321377)
- +0x68: 0xa50370 FDE=(10814320, 10814325)
- +0x70: 0xb8956a FDE=(12096874, 12096906)
- +0x78: 0xb8958a FDE=(12096906, 12096925)
- +0x80: 0x9d7de0 FDE=(10321376, 10321377)
- +0x88: 0xa50370 FDE=(10814320, 10814325)
- +0x90: 0xb7d28a FDE=(12046986, 12047005)
- +0x98: 0x0 FDE=None
- +0xa0: 0x0 FDE=None
- +0xa8: 0xb8952e FDE=(12096814, 12096829)
- +0xb0: 0xb8953e FDE=(12096830, 12096848)
- +0xb8: 0xb89550 FDE=(12096848, 12096874)
- +0xc0: 0x0 FDE=None
- +0xc8: 0xa50370 FDE=(10814320, 10814325)
- +0xd0: 0x0 FDE=None
- +0xd8: 0x0 FDE=None
- +0xe0: 0xb8930a FDE=(12096266, 12096285)
- +0xe8: 0xb8931e FDE=(12096286, 12096304)
- +0xf0: 0xb89330 FDE=(12096304, 12096358)
- +0xf8: 0xb89366 FDE=(12096358, 12096384)
- +0x100: 0xb88f10 FDE=(12095248, 12095257)
- +0x108: 0xb88f1a FDE=(12095258, 12095280)
- +0x110: 0xb89380 FDE=(12096384, 12096813)
- +0x118: 0x0 FDE=None
- +0x120: 0x0 FDE=None
- +0x128: 0x9d7de0 FDE=(10321376, 10321377)
- +0x130: 0xa50370 FDE=(10814320, 10814325)
- +0x138: 0xb8923c FDE=(12096060, 12096092)
- +0x140: 0xb8925c FDE=(12096092, 12096111)
- +0x148: 0x9d7de0 FDE=(10321376, 10321377)
- +0x150: 0xa50370 FDE=(10814320, 10814325)
- +0x158: 0xb89270 FDE=(12096112, 12096122)
- +0x160: 0x0 FDE=None
- +0x168: 0x0 FDE=None
- +0x170: 0xb88e9a FDE=(12095130, 12095149)
#### +0x28 body
      b8963c:	48 8d 87 f0 02 00 00 	lea    rax,[rdi+0x2f0]
      b89643:	c3                   	ret

### AP 0x180dcf8 codeSlots=37
- +0x0: 0xac3ae0 FDE=(11287264, 11287269)
- +0x8: 0xa4b8e0 FDE=(10795232, 10795237)
- +0x10: 0xb8962c FDE=(12097068, 12097076)
- +0x18: 0xb89634 FDE=(12097076, 12097084)
- +0x20: 0xb8963c FDE=(12097084, 12097092)
- +0x28: 0xb89644 FDE=(12097092, 12097123)
- +0x30: 0xb89664 FDE=(12097124, 12097155)
- +0x38: 0xb89684 FDE=(12097156, 12097187)
- +0x40: 0xb896a4 FDE=(12097188, 12097219)
- +0x48: 0x0 FDE=None
- +0x50: 0x0 FDE=None
- +0x58: 0x9d7de0 FDE=(10321376, 10321377)
- +0x60: 0xa50370 FDE=(10814320, 10814325)
- +0x68: 0xb8956a FDE=(12096874, 12096906)
- +0x70: 0xb8958a FDE=(12096906, 12096925)
- +0x78: 0x9d7de0 FDE=(10321376, 10321377)
- +0x80: 0xa50370 FDE=(10814320, 10814325)
- +0x88: 0xb7d28a FDE=(12046986, 12047005)
- +0x90: 0x0 FDE=None
- +0x98: 0x0 FDE=None
- +0xa0: 0xb8952e FDE=(12096814, 12096829)
- +0xa8: 0xb8953e FDE=(12096830, 12096848)
- +0xb0: 0xb89550 FDE=(12096848, 12096874)
- +0xb8: 0x0 FDE=None
- +0xc0: 0xa50370 FDE=(10814320, 10814325)
- +0xc8: 0x0 FDE=None
- +0xd0: 0x0 FDE=None
- +0xd8: 0xb8930a FDE=(12096266, 12096285)
- +0xe0: 0xb8931e FDE=(12096286, 12096304)
- +0xe8: 0xb89330 FDE=(12096304, 12096358)
- +0xf0: 0xb89366 FDE=(12096358, 12096384)
- +0xf8: 0xb88f10 FDE=(12095248, 12095257)
- +0x100: 0xb88f1a FDE=(12095258, 12095280)
- +0x108: 0xb89380 FDE=(12096384, 12096813)
- +0x110: 0x0 FDE=None
- +0x118: 0x0 FDE=None
- +0x120: 0x9d7de0 FDE=(10321376, 10321377)
- +0x128: 0xa50370 FDE=(10814320, 10814325)
- +0x130: 0xb8923c FDE=(12096060, 12096092)
- +0x138: 0xb8925c FDE=(12096092, 12096111)
- +0x140: 0x9d7de0 FDE=(10321376, 10321377)
- +0x148: 0xa50370 FDE=(10814320, 10814325)
- +0x150: 0xb89270 FDE=(12096112, 12096122)
- +0x158: 0x0 FDE=None
- +0x160: 0x0 FDE=None
- +0x168: 0xb88e9a FDE=(12095130, 12095149)
- +0x170: 0xb88eae FDE=(12095150, 12095168)
#### +0x28 body
      b89644:	48 89 f8             	mov    rax,rdi
      b89647:	48 8b 8e 28 03 00 00 	mov    rcx,QWORD PTR [rsi+0x328]
      b8964e:	0f 28 86 20 03 00 00 	movaps xmm0,XMMWORD PTR [rsi+0x320]
      b89655:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      b89658:	48 85 c9             	test   rcx,rcx
      b8965b:	74 05                	je     b89662 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6602>
      b8965d:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b89662:	c3                   	ret

### AP 0x180dd30 codeSlots=35
- +0x0: 0xb89684 FDE=(12097156, 12097187)
- +0x8: 0xb896a4 FDE=(12097188, 12097219)
- +0x10: 0x0 FDE=None
- +0x18: 0x0 FDE=None
- +0x20: 0x9d7de0 FDE=(10321376, 10321377)
- +0x28: 0xa50370 FDE=(10814320, 10814325)
- +0x30: 0xb8956a FDE=(12096874, 12096906)
- +0x38: 0xb8958a FDE=(12096906, 12096925)
- +0x40: 0x9d7de0 FDE=(10321376, 10321377)
- +0x48: 0xa50370 FDE=(10814320, 10814325)
- +0x50: 0xb7d28a FDE=(12046986, 12047005)
- +0x58: 0x0 FDE=None
- +0x60: 0x0 FDE=None
- +0x68: 0xb8952e FDE=(12096814, 12096829)
- +0x70: 0xb8953e FDE=(12096830, 12096848)
- +0x78: 0xb89550 FDE=(12096848, 12096874)
- +0x80: 0x0 FDE=None
- +0x88: 0xa50370 FDE=(10814320, 10814325)
- +0x90: 0x0 FDE=None
- +0x98: 0x0 FDE=None
- +0xa0: 0xb8930a FDE=(12096266, 12096285)
- +0xa8: 0xb8931e FDE=(12096286, 12096304)
- +0xb0: 0xb89330 FDE=(12096304, 12096358)
- +0xb8: 0xb89366 FDE=(12096358, 12096384)
- +0xc0: 0xb88f10 FDE=(12095248, 12095257)
- +0xc8: 0xb88f1a FDE=(12095258, 12095280)
- +0xd0: 0xb89380 FDE=(12096384, 12096813)
- +0xd8: 0x0 FDE=None
- +0xe0: 0x0 FDE=None
- +0xe8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xf0: 0xa50370 FDE=(10814320, 10814325)
- +0xf8: 0xb8923c FDE=(12096060, 12096092)
- +0x100: 0xb8925c FDE=(12096092, 12096111)
- +0x108: 0x9d7de0 FDE=(10321376, 10321377)
- +0x110: 0xa50370 FDE=(10814320, 10814325)
- +0x118: 0xb89270 FDE=(12096112, 12096122)
- +0x120: 0x0 FDE=None
- +0x128: 0x0 FDE=None
- +0x130: 0xb88e9a FDE=(12095130, 12095149)
- +0x138: 0xb88eae FDE=(12095150, 12095168)
- +0x140: 0xb88ec0 FDE=(12095168, 12095222)
- +0x148: 0xb88ef6 FDE=(12095222, 12095248)
- +0x150: 0xb88f10 FDE=(12095248, 12095257)
- +0x158: 0xb88f1a FDE=(12095258, 12095280)
- +0x160: 0xb88f30 FDE=(12095280, 12095992)
- +0x168: 0x0 FDE=None
- +0x170: 0x0 FDE=None
#### +0x28 body
      a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x180dd38 codeSlots=35
- +0x0: 0xb896a4 FDE=(12097188, 12097219)
- +0x8: 0x0 FDE=None
- +0x10: 0x0 FDE=None
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0xa50370 FDE=(10814320, 10814325)
- +0x28: 0xb8956a FDE=(12096874, 12096906)
- +0x30: 0xb8958a FDE=(12096906, 12096925)
- +0x38: 0x9d7de0 FDE=(10321376, 10321377)
- +0x40: 0xa50370 FDE=(10814320, 10814325)
- +0x48: 0xb7d28a FDE=(12046986, 12047005)
- +0x50: 0x0 FDE=None
- +0x58: 0x0 FDE=None
- +0x60: 0xb8952e FDE=(12096814, 12096829)
- +0x68: 0xb8953e FDE=(12096830, 12096848)
- +0x70: 0xb89550 FDE=(12096848, 12096874)
- +0x78: 0x0 FDE=None
- +0x80: 0xa50370 FDE=(10814320, 10814325)
- +0x88: 0x0 FDE=None
- +0x90: 0x0 FDE=None
- +0x98: 0xb8930a FDE=(12096266, 12096285)
- +0xa0: 0xb8931e FDE=(12096286, 12096304)
- +0xa8: 0xb89330 FDE=(12096304, 12096358)
- +0xb0: 0xb89366 FDE=(12096358, 12096384)
- +0xb8: 0xb88f10 FDE=(12095248, 12095257)
- +0xc0: 0xb88f1a FDE=(12095258, 12095280)
- +0xc8: 0xb89380 FDE=(12096384, 12096813)
- +0xd0: 0x0 FDE=None
- +0xd8: 0x0 FDE=None
- +0xe0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe8: 0xa50370 FDE=(10814320, 10814325)
- +0xf0: 0xb8923c FDE=(12096060, 12096092)
- +0xf8: 0xb8925c FDE=(12096092, 12096111)
- +0x100: 0x9d7de0 FDE=(10321376, 10321377)
- +0x108: 0xa50370 FDE=(10814320, 10814325)
- +0x110: 0xb89270 FDE=(12096112, 12096122)
- +0x118: 0x0 FDE=None
- +0x120: 0x0 FDE=None
- +0x128: 0xb88e9a FDE=(12095130, 12095149)
- +0x130: 0xb88eae FDE=(12095150, 12095168)
- +0x138: 0xb88ec0 FDE=(12095168, 12095222)
- +0x140: 0xb88ef6 FDE=(12095222, 12095248)
- +0x148: 0xb88f10 FDE=(12095248, 12095257)
- +0x150: 0xb88f1a FDE=(12095258, 12095280)
- +0x158: 0xb88f30 FDE=(12095280, 12095992)
- +0x160: 0x0 FDE=None
- +0x168: 0x0 FDE=None
- +0x170: 0xb88a44 FDE=(12094020, 12094039)
#### +0x28 body
      b8956a:	53                   	push   rbx
      b8956b:	48 89 fb             	mov    rbx,rdi
      b8956e:	6a 10                	push   0x10
      b89570:	5f                   	pop    rdi
      b89571:	e8 8a 49 c6 00       	call   17edf00 <_Znwm@plt>
      b89576:	48 8d 0d d3 47 c8 00 	lea    rcx,[rip+0xc847d3]        # 180dd50 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3a10>
      b8957d:	48 89 08             	mov    QWORD PTR [rax],rcx
      b89580:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
      b89584:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      b89588:	5b                   	pop    rbx
      b89589:	c3                   	ret

### AP 0x180dd40 codeSlots=35
- +0x0: 0x0 FDE=None
- +0x8: 0x0 FDE=None
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0xa50370 FDE=(10814320, 10814325)
- +0x20: 0xb8956a FDE=(12096874, 12096906)
- +0x28: 0xb8958a FDE=(12096906, 12096925)
- +0x30: 0x9d7de0 FDE=(10321376, 10321377)
- +0x38: 0xa50370 FDE=(10814320, 10814325)
- +0x40: 0xb7d28a FDE=(12046986, 12047005)
- +0x48: 0x0 FDE=None
- +0x50: 0x0 FDE=None
- +0x58: 0xb8952e FDE=(12096814, 12096829)
- +0x60: 0xb8953e FDE=(12096830, 12096848)
- +0x68: 0xb89550 FDE=(12096848, 12096874)
- +0x70: 0x0 FDE=None
- +0x78: 0xa50370 FDE=(10814320, 10814325)
- +0x80: 0x0 FDE=None
- +0x88: 0x0 FDE=None
- +0x90: 0xb8930a FDE=(12096266, 12096285)
- +0x98: 0xb8931e FDE=(12096286, 12096304)
- +0xa0: 0xb89330 FDE=(12096304, 12096358)
- +0xa8: 0xb89366 FDE=(12096358, 12096384)
- +0xb0: 0xb88f10 FDE=(12095248, 12095257)
- +0xb8: 0xb88f1a FDE=(12095258, 12095280)
- +0xc0: 0xb89380 FDE=(12096384, 12096813)
- +0xc8: 0x0 FDE=None
- +0xd0: 0x0 FDE=None
- +0xd8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe0: 0xa50370 FDE=(10814320, 10814325)
- +0xe8: 0xb8923c FDE=(12096060, 12096092)
- +0xf0: 0xb8925c FDE=(12096092, 12096111)
- +0xf8: 0x9d7de0 FDE=(10321376, 10321377)
- +0x100: 0xa50370 FDE=(10814320, 10814325)
- +0x108: 0xb89270 FDE=(12096112, 12096122)
- +0x110: 0x0 FDE=None
- +0x118: 0x0 FDE=None
- +0x120: 0xb88e9a FDE=(12095130, 12095149)
- +0x128: 0xb88eae FDE=(12095150, 12095168)
- +0x130: 0xb88ec0 FDE=(12095168, 12095222)
- +0x138: 0xb88ef6 FDE=(12095222, 12095248)
- +0x140: 0xb88f10 FDE=(12095248, 12095257)
- +0x148: 0xb88f1a FDE=(12095258, 12095280)
- +0x150: 0xb88f30 FDE=(12095280, 12095992)
- +0x158: 0x0 FDE=None
- +0x160: 0x0 FDE=None
- +0x168: 0xb88a44 FDE=(12094020, 12094039)
- +0x170: 0xb88a58 FDE=(12094040, 12094058)
#### +0x28 body
      b8958a:	48 8d 05 bf 47 c8 00 	lea    rax,[rip+0xc847bf]        # 180dd50 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3a10>
      b89591:	48 89 06             	mov    QWORD PTR [rsi],rax
      b89594:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      b89598:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      b8959c:	c3                   	ret

### AP 0x180dd48 codeSlots=36
- +0x0: 0x0 FDE=None
- +0x8: 0x9d7de0 FDE=(10321376, 10321377)
- +0x10: 0xa50370 FDE=(10814320, 10814325)
- +0x18: 0xb8956a FDE=(12096874, 12096906)
- +0x20: 0xb8958a FDE=(12096906, 12096925)
- +0x28: 0x9d7de0 FDE=(10321376, 10321377)
- +0x30: 0xa50370 FDE=(10814320, 10814325)
- +0x38: 0xb7d28a FDE=(12046986, 12047005)
- +0x40: 0x0 FDE=None
- +0x48: 0x0 FDE=None
- +0x50: 0xb8952e FDE=(12096814, 12096829)
- +0x58: 0xb8953e FDE=(12096830, 12096848)
- +0x60: 0xb89550 FDE=(12096848, 12096874)
- +0x68: 0x0 FDE=None
- +0x70: 0xa50370 FDE=(10814320, 10814325)
- +0x78: 0x0 FDE=None
- +0x80: 0x0 FDE=None
- +0x88: 0xb8930a FDE=(12096266, 12096285)
- +0x90: 0xb8931e FDE=(12096286, 12096304)
- +0x98: 0xb89330 FDE=(12096304, 12096358)
- +0xa0: 0xb89366 FDE=(12096358, 12096384)
- +0xa8: 0xb88f10 FDE=(12095248, 12095257)
- +0xb0: 0xb88f1a FDE=(12095258, 12095280)
- +0xb8: 0xb89380 FDE=(12096384, 12096813)
- +0xc0: 0x0 FDE=None
- +0xc8: 0x0 FDE=None
- +0xd0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd8: 0xa50370 FDE=(10814320, 10814325)
- +0xe0: 0xb8923c FDE=(12096060, 12096092)
- +0xe8: 0xb8925c FDE=(12096092, 12096111)
- +0xf0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xf8: 0xa50370 FDE=(10814320, 10814325)
- +0x100: 0xb89270 FDE=(12096112, 12096122)
- +0x108: 0x0 FDE=None
- +0x110: 0x0 FDE=None
- +0x118: 0xb88e9a FDE=(12095130, 12095149)
- +0x120: 0xb88eae FDE=(12095150, 12095168)
- +0x128: 0xb88ec0 FDE=(12095168, 12095222)
- +0x130: 0xb88ef6 FDE=(12095222, 12095248)
- +0x138: 0xb88f10 FDE=(12095248, 12095257)
- +0x140: 0xb88f1a FDE=(12095258, 12095280)
- +0x148: 0xb88f30 FDE=(12095280, 12095992)
- +0x150: 0x0 FDE=None
- +0x158: 0x0 FDE=None
- +0x160: 0xb88a44 FDE=(12094020, 12094039)
- +0x168: 0xb88a58 FDE=(12094040, 12094058)
- +0x170: 0xb88a6a FDE=(12094058, 12094218)
#### +0x28 body
      9d7de0:	c3                   	ret

### AP 0x180dd50 codeSlots=37
- +0x0: 0x9d7de0 FDE=(10321376, 10321377)
- +0x8: 0xa50370 FDE=(10814320, 10814325)
- +0x10: 0xb8956a FDE=(12096874, 12096906)
- +0x18: 0xb8958a FDE=(12096906, 12096925)
- +0x20: 0x9d7de0 FDE=(10321376, 10321377)
- +0x28: 0xa50370 FDE=(10814320, 10814325)
- +0x30: 0xb7d28a FDE=(12046986, 12047005)
- +0x38: 0x0 FDE=None
- +0x40: 0x0 FDE=None
- +0x48: 0xb8952e FDE=(12096814, 12096829)
- +0x50: 0xb8953e FDE=(12096830, 12096848)
- +0x58: 0xb89550 FDE=(12096848, 12096874)
- +0x60: 0x0 FDE=None
- +0x68: 0xa50370 FDE=(10814320, 10814325)
- +0x70: 0x0 FDE=None
- +0x78: 0x0 FDE=None
- +0x80: 0xb8930a FDE=(12096266, 12096285)
- +0x88: 0xb8931e FDE=(12096286, 12096304)
- +0x90: 0xb89330 FDE=(12096304, 12096358)
- +0x98: 0xb89366 FDE=(12096358, 12096384)
- +0xa0: 0xb88f10 FDE=(12095248, 12095257)
- +0xa8: 0xb88f1a FDE=(12095258, 12095280)
- +0xb0: 0xb89380 FDE=(12096384, 12096813)
- +0xb8: 0x0 FDE=None
- +0xc0: 0x0 FDE=None
- +0xc8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd0: 0xa50370 FDE=(10814320, 10814325)
- +0xd8: 0xb8923c FDE=(12096060, 12096092)
- +0xe0: 0xb8925c FDE=(12096092, 12096111)
- +0xe8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xf0: 0xa50370 FDE=(10814320, 10814325)
- +0xf8: 0xb89270 FDE=(12096112, 12096122)
- +0x100: 0x0 FDE=None
- +0x108: 0x0 FDE=None
- +0x110: 0xb88e9a FDE=(12095130, 12095149)
- +0x118: 0xb88eae FDE=(12095150, 12095168)
- +0x120: 0xb88ec0 FDE=(12095168, 12095222)
- +0x128: 0xb88ef6 FDE=(12095222, 12095248)
- +0x130: 0xb88f10 FDE=(12095248, 12095257)
- +0x138: 0xb88f1a FDE=(12095258, 12095280)
- +0x140: 0xb88f30 FDE=(12095280, 12095992)
- +0x148: 0x0 FDE=None
- +0x150: 0x0 FDE=None
- +0x158: 0xb88a44 FDE=(12094020, 12094039)
- +0x160: 0xb88a58 FDE=(12094040, 12094058)
- +0x168: 0xb88a6a FDE=(12094058, 12094218)
- +0x170: 0xb88b0a FDE=(12094218, 12094244)
#### +0x28 body
      a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x180dd58 codeSlots=37
- +0x0: 0xa50370 FDE=(10814320, 10814325)
- +0x8: 0xb8956a FDE=(12096874, 12096906)
- +0x10: 0xb8958a FDE=(12096906, 12096925)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0xa50370 FDE=(10814320, 10814325)
- +0x28: 0xb7d28a FDE=(12046986, 12047005)
- +0x30: 0x0 FDE=None
- +0x38: 0x0 FDE=None
- +0x40: 0xb8952e FDE=(12096814, 12096829)
- +0x48: 0xb8953e FDE=(12096830, 12096848)
- +0x50: 0xb89550 FDE=(12096848, 12096874)
- +0x58: 0x0 FDE=None
- +0x60: 0xa50370 FDE=(10814320, 10814325)
- +0x68: 0x0 FDE=None
- +0x70: 0x0 FDE=None
- +0x78: 0xb8930a FDE=(12096266, 12096285)
- +0x80: 0xb8931e FDE=(12096286, 12096304)
- +0x88: 0xb89330 FDE=(12096304, 12096358)
- +0x90: 0xb89366 FDE=(12096358, 12096384)
- +0x98: 0xb88f10 FDE=(12095248, 12095257)
- +0xa0: 0xb88f1a FDE=(12095258, 12095280)
- +0xa8: 0xb89380 FDE=(12096384, 12096813)
- +0xb0: 0x0 FDE=None
- +0xb8: 0x0 FDE=None
- +0xc0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc8: 0xa50370 FDE=(10814320, 10814325)
- +0xd0: 0xb8923c FDE=(12096060, 12096092)
- +0xd8: 0xb8925c FDE=(12096092, 12096111)
- +0xe0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe8: 0xa50370 FDE=(10814320, 10814325)
- +0xf0: 0xb89270 FDE=(12096112, 12096122)
- +0xf8: 0x0 FDE=None
- +0x100: 0x0 FDE=None
- +0x108: 0xb88e9a FDE=(12095130, 12095149)
- +0x110: 0xb88eae FDE=(12095150, 12095168)
- +0x118: 0xb88ec0 FDE=(12095168, 12095222)
- +0x120: 0xb88ef6 FDE=(12095222, 12095248)
- +0x128: 0xb88f10 FDE=(12095248, 12095257)
- +0x130: 0xb88f1a FDE=(12095258, 12095280)
- +0x138: 0xb88f30 FDE=(12095280, 12095992)
- +0x140: 0x0 FDE=None
- +0x148: 0x0 FDE=None
- +0x150: 0xb88a44 FDE=(12094020, 12094039)
- +0x158: 0xb88a58 FDE=(12094040, 12094058)
- +0x160: 0xb88a6a FDE=(12094058, 12094218)
- +0x168: 0xb88b0a FDE=(12094218, 12094244)
- +0x170: 0xb88642 FDE=(12092994, 12093003)
#### +0x28 body
      b7d28a:	53                   	push   rbx
      b7d28b:	48 89 fb             	mov    rbx,rdi
      b7d28e:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]
      b7d292:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      b7d295:	ff 50 10             	call   QWORD PTR [rax+0x10]
      b7d298:	48 89 d8             	mov    rax,rbx
      b7d29b:	5b                   	pop    rbx
      b7d29c:	c3                   	ret

### AP 0x180dd60 codeSlots=37
- +0x0: 0xb8956a FDE=(12096874, 12096906)
- +0x8: 0xb8958a FDE=(12096906, 12096925)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0xa50370 FDE=(10814320, 10814325)
- +0x20: 0xb7d28a FDE=(12046986, 12047005)
- +0x28: 0x0 FDE=None
- +0x30: 0x0 FDE=None
- +0x38: 0xb8952e FDE=(12096814, 12096829)
- +0x40: 0xb8953e FDE=(12096830, 12096848)
- +0x48: 0xb89550 FDE=(12096848, 12096874)
- +0x50: 0x0 FDE=None
- +0x58: 0xa50370 FDE=(10814320, 10814325)
- +0x60: 0x0 FDE=None
- +0x68: 0x0 FDE=None
- +0x70: 0xb8930a FDE=(12096266, 12096285)
- +0x78: 0xb8931e FDE=(12096286, 12096304)
- +0x80: 0xb89330 FDE=(12096304, 12096358)
- +0x88: 0xb89366 FDE=(12096358, 12096384)
- +0x90: 0xb88f10 FDE=(12095248, 12095257)
- +0x98: 0xb88f1a FDE=(12095258, 12095280)
- +0xa0: 0xb89380 FDE=(12096384, 12096813)
- +0xa8: 0x0 FDE=None
- +0xb0: 0x0 FDE=None
- +0xb8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc0: 0xa50370 FDE=(10814320, 10814325)
- +0xc8: 0xb8923c FDE=(12096060, 12096092)
- +0xd0: 0xb8925c FDE=(12096092, 12096111)
- +0xd8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe0: 0xa50370 FDE=(10814320, 10814325)
- +0xe8: 0xb89270 FDE=(12096112, 12096122)
- +0xf0: 0x0 FDE=None
- +0xf8: 0x0 FDE=None
- +0x100: 0xb88e9a FDE=(12095130, 12095149)
- +0x108: 0xb88eae FDE=(12095150, 12095168)
- +0x110: 0xb88ec0 FDE=(12095168, 12095222)
- +0x118: 0xb88ef6 FDE=(12095222, 12095248)
- +0x120: 0xb88f10 FDE=(12095248, 12095257)
- +0x128: 0xb88f1a FDE=(12095258, 12095280)
- +0x130: 0xb88f30 FDE=(12095280, 12095992)
- +0x138: 0x0 FDE=None
- +0x140: 0x0 FDE=None
- +0x148: 0xb88a44 FDE=(12094020, 12094039)
- +0x150: 0xb88a58 FDE=(12094040, 12094058)
- +0x158: 0xb88a6a FDE=(12094058, 12094218)
- +0x160: 0xb88b0a FDE=(12094218, 12094244)
- +0x168: 0xb88642 FDE=(12092994, 12093003)
- +0x170: 0xb8864c FDE=(12093004, 12093026)

### AP 0x180dd68 codeSlots=36
- +0x0: 0xb8958a FDE=(12096906, 12096925)
- +0x8: 0x9d7de0 FDE=(10321376, 10321377)
- +0x10: 0xa50370 FDE=(10814320, 10814325)
- +0x18: 0xb7d28a FDE=(12046986, 12047005)
- +0x20: 0x0 FDE=None
- +0x28: 0x0 FDE=None
- +0x30: 0xb8952e FDE=(12096814, 12096829)
- +0x38: 0xb8953e FDE=(12096830, 12096848)
- +0x40: 0xb89550 FDE=(12096848, 12096874)
- +0x48: 0x0 FDE=None
- +0x50: 0xa50370 FDE=(10814320, 10814325)
- +0x58: 0x0 FDE=None
- +0x60: 0x0 FDE=None
- +0x68: 0xb8930a FDE=(12096266, 12096285)
- +0x70: 0xb8931e FDE=(12096286, 12096304)
- +0x78: 0xb89330 FDE=(12096304, 12096358)
- +0x80: 0xb89366 FDE=(12096358, 12096384)
- +0x88: 0xb88f10 FDE=(12095248, 12095257)
- +0x90: 0xb88f1a FDE=(12095258, 12095280)
- +0x98: 0xb89380 FDE=(12096384, 12096813)
- +0xa0: 0x0 FDE=None
- +0xa8: 0x0 FDE=None
- +0xb0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb8: 0xa50370 FDE=(10814320, 10814325)
- +0xc0: 0xb8923c FDE=(12096060, 12096092)
- +0xc8: 0xb8925c FDE=(12096092, 12096111)
- +0xd0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd8: 0xa50370 FDE=(10814320, 10814325)
- +0xe0: 0xb89270 FDE=(12096112, 12096122)
- +0xe8: 0x0 FDE=None
- +0xf0: 0x0 FDE=None
- +0xf8: 0xb88e9a FDE=(12095130, 12095149)
- +0x100: 0xb88eae FDE=(12095150, 12095168)
- +0x108: 0xb88ec0 FDE=(12095168, 12095222)
- +0x110: 0xb88ef6 FDE=(12095222, 12095248)
- +0x118: 0xb88f10 FDE=(12095248, 12095257)
- +0x120: 0xb88f1a FDE=(12095258, 12095280)
- +0x128: 0xb88f30 FDE=(12095280, 12095992)
- +0x130: 0x0 FDE=None
- +0x138: 0x0 FDE=None
- +0x140: 0xb88a44 FDE=(12094020, 12094039)
- +0x148: 0xb88a58 FDE=(12094040, 12094058)
- +0x150: 0xb88a6a FDE=(12094058, 12094218)
- +0x158: 0xb88b0a FDE=(12094218, 12094244)
- +0x160: 0xb88642 FDE=(12092994, 12093003)
- +0x168: 0xb8864c FDE=(12093004, 12093026)
- +0x170: 0xb88b24 FDE=(12094244, 12094628)

### AP 0x180dd70 codeSlots=35
- +0x0: 0x9d7de0 FDE=(10321376, 10321377)
- +0x8: 0xa50370 FDE=(10814320, 10814325)
- +0x10: 0xb7d28a FDE=(12046986, 12047005)
- +0x18: 0x0 FDE=None
- +0x20: 0x0 FDE=None
- +0x28: 0xb8952e FDE=(12096814, 12096829)
- +0x30: 0xb8953e FDE=(12096830, 12096848)
- +0x38: 0xb89550 FDE=(12096848, 12096874)
- +0x40: 0x0 FDE=None
- +0x48: 0xa50370 FDE=(10814320, 10814325)
- +0x50: 0x0 FDE=None
- +0x58: 0x0 FDE=None
- +0x60: 0xb8930a FDE=(12096266, 12096285)
- +0x68: 0xb8931e FDE=(12096286, 12096304)
- +0x70: 0xb89330 FDE=(12096304, 12096358)
- +0x78: 0xb89366 FDE=(12096358, 12096384)
- +0x80: 0xb88f10 FDE=(12095248, 12095257)
- +0x88: 0xb88f1a FDE=(12095258, 12095280)
- +0x90: 0xb89380 FDE=(12096384, 12096813)
- +0x98: 0x0 FDE=None
- +0xa0: 0x0 FDE=None
- +0xa8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb0: 0xa50370 FDE=(10814320, 10814325)
- +0xb8: 0xb8923c FDE=(12096060, 12096092)
- +0xc0: 0xb8925c FDE=(12096092, 12096111)
- +0xc8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd0: 0xa50370 FDE=(10814320, 10814325)
- +0xd8: 0xb89270 FDE=(12096112, 12096122)
- +0xe0: 0x0 FDE=None
- +0xe8: 0x0 FDE=None
- +0xf0: 0xb88e9a FDE=(12095130, 12095149)
- +0xf8: 0xb88eae FDE=(12095150, 12095168)
- +0x100: 0xb88ec0 FDE=(12095168, 12095222)
- +0x108: 0xb88ef6 FDE=(12095222, 12095248)
- +0x110: 0xb88f10 FDE=(12095248, 12095257)
- +0x118: 0xb88f1a FDE=(12095258, 12095280)
- +0x120: 0xb88f30 FDE=(12095280, 12095992)
- +0x128: 0x0 FDE=None
- +0x130: 0x0 FDE=None
- +0x138: 0xb88a44 FDE=(12094020, 12094039)
- +0x140: 0xb88a58 FDE=(12094040, 12094058)
- +0x148: 0xb88a6a FDE=(12094058, 12094218)
- +0x150: 0xb88b0a FDE=(12094218, 12094244)
- +0x158: 0xb88642 FDE=(12092994, 12093003)
- +0x160: 0xb8864c FDE=(12093004, 12093026)
- +0x168: 0xb88b24 FDE=(12094244, 12094628)
- +0x170: 0x0 FDE=None
#### +0x28 body
      b8952e:	48 8d 05 63 48 c8 00 	lea    rax,[rip+0xc84863]        # 180dd98 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3a58>
      b89535:	48 89 07             	mov    QWORD PTR [rdi],rax
      b89538:	e9 d3 4a c6 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>

### AP 0x180dd78 codeSlots=35
- +0x0: 0xa50370 FDE=(10814320, 10814325)
- +0x8: 0xb7d28a FDE=(12046986, 12047005)
- +0x10: 0x0 FDE=None
- +0x18: 0x0 FDE=None
- +0x20: 0xb8952e FDE=(12096814, 12096829)
- +0x28: 0xb8953e FDE=(12096830, 12096848)
- +0x30: 0xb89550 FDE=(12096848, 12096874)
- +0x38: 0x0 FDE=None
- +0x40: 0xa50370 FDE=(10814320, 10814325)
- +0x48: 0x0 FDE=None
- +0x50: 0x0 FDE=None
- +0x58: 0xb8930a FDE=(12096266, 12096285)
- +0x60: 0xb8931e FDE=(12096286, 12096304)
- +0x68: 0xb89330 FDE=(12096304, 12096358)
- +0x70: 0xb89366 FDE=(12096358, 12096384)
- +0x78: 0xb88f10 FDE=(12095248, 12095257)
- +0x80: 0xb88f1a FDE=(12095258, 12095280)
- +0x88: 0xb89380 FDE=(12096384, 12096813)
- +0x90: 0x0 FDE=None
- +0x98: 0x0 FDE=None
- +0xa0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa8: 0xa50370 FDE=(10814320, 10814325)
- +0xb0: 0xb8923c FDE=(12096060, 12096092)
- +0xb8: 0xb8925c FDE=(12096092, 12096111)
- +0xc0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc8: 0xa50370 FDE=(10814320, 10814325)
- +0xd0: 0xb89270 FDE=(12096112, 12096122)
- +0xd8: 0x0 FDE=None
- +0xe0: 0x0 FDE=None
- +0xe8: 0xb88e9a FDE=(12095130, 12095149)
- +0xf0: 0xb88eae FDE=(12095150, 12095168)
- +0xf8: 0xb88ec0 FDE=(12095168, 12095222)
- +0x100: 0xb88ef6 FDE=(12095222, 12095248)
- +0x108: 0xb88f10 FDE=(12095248, 12095257)
- +0x110: 0xb88f1a FDE=(12095258, 12095280)
- +0x118: 0xb88f30 FDE=(12095280, 12095992)
- +0x120: 0x0 FDE=None
- +0x128: 0x0 FDE=None
- +0x130: 0xb88a44 FDE=(12094020, 12094039)
- +0x138: 0xb88a58 FDE=(12094040, 12094058)
- +0x140: 0xb88a6a FDE=(12094058, 12094218)
- +0x148: 0xb88b0a FDE=(12094218, 12094244)
- +0x150: 0xb88642 FDE=(12092994, 12093003)
- +0x158: 0xb8864c FDE=(12093004, 12093026)
- +0x160: 0xb88b24 FDE=(12094244, 12094628)
- +0x168: 0x0 FDE=None
- +0x170: 0x0 FDE=None
#### +0x28 body
      b8953e:	53                   	push   rbx
      b8953f:	48 89 fb             	mov    rbx,rdi
      b89542:	e8 e7 ff ff ff       	call   b8952e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd64ce>
      b89547:	48 89 df             	mov    rdi,rbx
      b8954a:	5b                   	pop    rbx
      b8954b:	e9 d0 49 c6 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x180dd80 codeSlots=35
- +0x0: 0xb7d28a FDE=(12046986, 12047005)
- +0x8: 0x0 FDE=None
- +0x10: 0x0 FDE=None
- +0x18: 0xb8952e FDE=(12096814, 12096829)
- +0x20: 0xb8953e FDE=(12096830, 12096848)
- +0x28: 0xb89550 FDE=(12096848, 12096874)
- +0x30: 0x0 FDE=None
- +0x38: 0xa50370 FDE=(10814320, 10814325)
- +0x40: 0x0 FDE=None
- +0x48: 0x0 FDE=None
- +0x50: 0xb8930a FDE=(12096266, 12096285)
- +0x58: 0xb8931e FDE=(12096286, 12096304)
- +0x60: 0xb89330 FDE=(12096304, 12096358)
- +0x68: 0xb89366 FDE=(12096358, 12096384)
- +0x70: 0xb88f10 FDE=(12095248, 12095257)
- +0x78: 0xb88f1a FDE=(12095258, 12095280)
- +0x80: 0xb89380 FDE=(12096384, 12096813)
- +0x88: 0x0 FDE=None
- +0x90: 0x0 FDE=None
- +0x98: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa0: 0xa50370 FDE=(10814320, 10814325)
- +0xa8: 0xb8923c FDE=(12096060, 12096092)
- +0xb0: 0xb8925c FDE=(12096092, 12096111)
- +0xb8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc0: 0xa50370 FDE=(10814320, 10814325)
- +0xc8: 0xb89270 FDE=(12096112, 12096122)
- +0xd0: 0x0 FDE=None
- +0xd8: 0x0 FDE=None
- +0xe0: 0xb88e9a FDE=(12095130, 12095149)
- +0xe8: 0xb88eae FDE=(12095150, 12095168)
- +0xf0: 0xb88ec0 FDE=(12095168, 12095222)
- +0xf8: 0xb88ef6 FDE=(12095222, 12095248)
- +0x100: 0xb88f10 FDE=(12095248, 12095257)
- +0x108: 0xb88f1a FDE=(12095258, 12095280)
- +0x110: 0xb88f30 FDE=(12095280, 12095992)
- +0x118: 0x0 FDE=None
- +0x120: 0x0 FDE=None
- +0x128: 0xb88a44 FDE=(12094020, 12094039)
- +0x130: 0xb88a58 FDE=(12094040, 12094058)
- +0x138: 0xb88a6a FDE=(12094058, 12094218)
- +0x140: 0xb88b0a FDE=(12094218, 12094244)
- +0x148: 0xb88642 FDE=(12092994, 12093003)
- +0x150: 0xb8864c FDE=(12093004, 12093026)
- +0x158: 0xb88b24 FDE=(12094244, 12094628)
- +0x160: 0x0 FDE=None
- +0x168: 0x0 FDE=None
- +0x170: 0xb88ca4 FDE=(12094628, 12094647)
#### +0x28 body
      b89550:	53                   	push   rbx
      b89551:	48 89 fb             	mov    rbx,rdi
      b89554:	48 83 c7 48          	add    rdi,0x48
      b89558:	e8 fb ea ff ff       	call   b88058 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4ff8>
      b8955d:	48 83 c3 28          	add    rbx,0x28
      b89561:	48 89 df             	mov    rdi,rbx
      b89564:	5b                   	pop    rbx
      b89565:	e9 ee ea ff ff       	jmp    b88058 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4ff8>

### AP 0x180dd88 codeSlots=35
- +0x0: 0x0 FDE=None
- +0x8: 0x0 FDE=None
- +0x10: 0xb8952e FDE=(12096814, 12096829)
- +0x18: 0xb8953e FDE=(12096830, 12096848)
- +0x20: 0xb89550 FDE=(12096848, 12096874)
- +0x28: 0x0 FDE=None
- +0x30: 0xa50370 FDE=(10814320, 10814325)
- +0x38: 0x0 FDE=None
- +0x40: 0x0 FDE=None
- +0x48: 0xb8930a FDE=(12096266, 12096285)
- +0x50: 0xb8931e FDE=(12096286, 12096304)
- +0x58: 0xb89330 FDE=(12096304, 12096358)
- +0x60: 0xb89366 FDE=(12096358, 12096384)
- +0x68: 0xb88f10 FDE=(12095248, 12095257)
- +0x70: 0xb88f1a FDE=(12095258, 12095280)
- +0x78: 0xb89380 FDE=(12096384, 12096813)
- +0x80: 0x0 FDE=None
- +0x88: 0x0 FDE=None
- +0x90: 0x9d7de0 FDE=(10321376, 10321377)
- +0x98: 0xa50370 FDE=(10814320, 10814325)
- +0xa0: 0xb8923c FDE=(12096060, 12096092)
- +0xa8: 0xb8925c FDE=(12096092, 12096111)
- +0xb0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb8: 0xa50370 FDE=(10814320, 10814325)
- +0xc0: 0xb89270 FDE=(12096112, 12096122)
- +0xc8: 0x0 FDE=None
- +0xd0: 0x0 FDE=None
- +0xd8: 0xb88e9a FDE=(12095130, 12095149)
- +0xe0: 0xb88eae FDE=(12095150, 12095168)
- +0xe8: 0xb88ec0 FDE=(12095168, 12095222)
- +0xf0: 0xb88ef6 FDE=(12095222, 12095248)
- +0xf8: 0xb88f10 FDE=(12095248, 12095257)
- +0x100: 0xb88f1a FDE=(12095258, 12095280)
- +0x108: 0xb88f30 FDE=(12095280, 12095992)
- +0x110: 0x0 FDE=None
- +0x118: 0x0 FDE=None
- +0x120: 0xb88a44 FDE=(12094020, 12094039)
- +0x128: 0xb88a58 FDE=(12094040, 12094058)
- +0x130: 0xb88a6a FDE=(12094058, 12094218)
- +0x138: 0xb88b0a FDE=(12094218, 12094244)
- +0x140: 0xb88642 FDE=(12092994, 12093003)
- +0x148: 0xb8864c FDE=(12093004, 12093026)
- +0x150: 0xb88b24 FDE=(12094244, 12094628)
- +0x158: 0x0 FDE=None
- +0x160: 0x0 FDE=None
- +0x168: 0xb88ca4 FDE=(12094628, 12094647)
- +0x170: 0xb88cb8 FDE=(12094648, 12094666)

### AP 0x180dd90 codeSlots=36
- +0x0: 0x0 FDE=None
- +0x8: 0xb8952e FDE=(12096814, 12096829)
- +0x10: 0xb8953e FDE=(12096830, 12096848)
- +0x18: 0xb89550 FDE=(12096848, 12096874)
- +0x20: 0x0 FDE=None
- +0x28: 0xa50370 FDE=(10814320, 10814325)
- +0x30: 0x0 FDE=None
- +0x38: 0x0 FDE=None
- +0x40: 0xb8930a FDE=(12096266, 12096285)
- +0x48: 0xb8931e FDE=(12096286, 12096304)
- +0x50: 0xb89330 FDE=(12096304, 12096358)
- +0x58: 0xb89366 FDE=(12096358, 12096384)
- +0x60: 0xb88f10 FDE=(12095248, 12095257)
- +0x68: 0xb88f1a FDE=(12095258, 12095280)
- +0x70: 0xb89380 FDE=(12096384, 12096813)
- +0x78: 0x0 FDE=None
- +0x80: 0x0 FDE=None
- +0x88: 0x9d7de0 FDE=(10321376, 10321377)
- +0x90: 0xa50370 FDE=(10814320, 10814325)
- +0x98: 0xb8923c FDE=(12096060, 12096092)
- +0xa0: 0xb8925c FDE=(12096092, 12096111)
- +0xa8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb0: 0xa50370 FDE=(10814320, 10814325)
- +0xb8: 0xb89270 FDE=(12096112, 12096122)
- +0xc0: 0x0 FDE=None
- +0xc8: 0x0 FDE=None
- +0xd0: 0xb88e9a FDE=(12095130, 12095149)
- +0xd8: 0xb88eae FDE=(12095150, 12095168)
- +0xe0: 0xb88ec0 FDE=(12095168, 12095222)
- +0xe8: 0xb88ef6 FDE=(12095222, 12095248)
- +0xf0: 0xb88f10 FDE=(12095248, 12095257)
- +0xf8: 0xb88f1a FDE=(12095258, 12095280)
- +0x100: 0xb88f30 FDE=(12095280, 12095992)
- +0x108: 0x0 FDE=None
- +0x110: 0x0 FDE=None
- +0x118: 0xb88a44 FDE=(12094020, 12094039)
- +0x120: 0xb88a58 FDE=(12094040, 12094058)
- +0x128: 0xb88a6a FDE=(12094058, 12094218)
- +0x130: 0xb88b0a FDE=(12094218, 12094244)
- +0x138: 0xb88642 FDE=(12092994, 12093003)
- +0x140: 0xb8864c FDE=(12093004, 12093026)
- +0x148: 0xb88b24 FDE=(12094244, 12094628)
- +0x150: 0x0 FDE=None
- +0x158: 0x0 FDE=None
- +0x160: 0xb88ca4 FDE=(12094628, 12094647)
- +0x168: 0xb88cb8 FDE=(12094648, 12094666)
- +0x170: 0xb88cca FDE=(12094666, 12094826)
#### +0x28 body
      a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x180dd98 codeSlots=37
- +0x0: 0xb8952e FDE=(12096814, 12096829)
- +0x8: 0xb8953e FDE=(12096830, 12096848)
- +0x10: 0xb89550 FDE=(12096848, 12096874)
- +0x18: 0x0 FDE=None
- +0x20: 0xa50370 FDE=(10814320, 10814325)
- +0x28: 0x0 FDE=None
- +0x30: 0x0 FDE=None
- +0x38: 0xb8930a FDE=(12096266, 12096285)
- +0x40: 0xb8931e FDE=(12096286, 12096304)
- +0x48: 0xb89330 FDE=(12096304, 12096358)
- +0x50: 0xb89366 FDE=(12096358, 12096384)
- +0x58: 0xb88f10 FDE=(12095248, 12095257)
- +0x60: 0xb88f1a FDE=(12095258, 12095280)
- +0x68: 0xb89380 FDE=(12096384, 12096813)
- +0x70: 0x0 FDE=None
- +0x78: 0x0 FDE=None
- +0x80: 0x9d7de0 FDE=(10321376, 10321377)
- +0x88: 0xa50370 FDE=(10814320, 10814325)
- +0x90: 0xb8923c FDE=(12096060, 12096092)
- +0x98: 0xb8925c FDE=(12096092, 12096111)
- +0xa0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa8: 0xa50370 FDE=(10814320, 10814325)
- +0xb0: 0xb89270 FDE=(12096112, 12096122)
- +0xb8: 0x0 FDE=None
- +0xc0: 0x0 FDE=None
- +0xc8: 0xb88e9a FDE=(12095130, 12095149)
- +0xd0: 0xb88eae FDE=(12095150, 12095168)
- +0xd8: 0xb88ec0 FDE=(12095168, 12095222)
- +0xe0: 0xb88ef6 FDE=(12095222, 12095248)
- +0xe8: 0xb88f10 FDE=(12095248, 12095257)
- +0xf0: 0xb88f1a FDE=(12095258, 12095280)
- +0xf8: 0xb88f30 FDE=(12095280, 12095992)
- +0x100: 0x0 FDE=None
- +0x108: 0x0 FDE=None
- +0x110: 0xb88a44 FDE=(12094020, 12094039)
- +0x118: 0xb88a58 FDE=(12094040, 12094058)
- +0x120: 0xb88a6a FDE=(12094058, 12094218)
- +0x128: 0xb88b0a FDE=(12094218, 12094244)
- +0x130: 0xb88642 FDE=(12092994, 12093003)
- +0x138: 0xb8864c FDE=(12093004, 12093026)
- +0x140: 0xb88b24 FDE=(12094244, 12094628)
- +0x148: 0x0 FDE=None
- +0x150: 0x0 FDE=None
- +0x158: 0xb88ca4 FDE=(12094628, 12094647)
- +0x160: 0xb88cb8 FDE=(12094648, 12094666)
- +0x168: 0xb88cca FDE=(12094666, 12094826)
- +0x170: 0xb88d6a FDE=(12094826, 12094852)

### AP 0x180dda0 codeSlots=37
- +0x0: 0xb8953e FDE=(12096830, 12096848)
- +0x8: 0xb89550 FDE=(12096848, 12096874)
- +0x10: 0x0 FDE=None
- +0x18: 0xa50370 FDE=(10814320, 10814325)
- +0x20: 0x0 FDE=None
- +0x28: 0x0 FDE=None
- +0x30: 0xb8930a FDE=(12096266, 12096285)
- +0x38: 0xb8931e FDE=(12096286, 12096304)
- +0x40: 0xb89330 FDE=(12096304, 12096358)
- +0x48: 0xb89366 FDE=(12096358, 12096384)
- +0x50: 0xb88f10 FDE=(12095248, 12095257)
- +0x58: 0xb88f1a FDE=(12095258, 12095280)
- +0x60: 0xb89380 FDE=(12096384, 12096813)
- +0x68: 0x0 FDE=None
- +0x70: 0x0 FDE=None
- +0x78: 0x9d7de0 FDE=(10321376, 10321377)
- +0x80: 0xa50370 FDE=(10814320, 10814325)
- +0x88: 0xb8923c FDE=(12096060, 12096092)
- +0x90: 0xb8925c FDE=(12096092, 12096111)
- +0x98: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa0: 0xa50370 FDE=(10814320, 10814325)
- +0xa8: 0xb89270 FDE=(12096112, 12096122)
- +0xb0: 0x0 FDE=None
- +0xb8: 0x0 FDE=None
- +0xc0: 0xb88e9a FDE=(12095130, 12095149)
- +0xc8: 0xb88eae FDE=(12095150, 12095168)
- +0xd0: 0xb88ec0 FDE=(12095168, 12095222)
- +0xd8: 0xb88ef6 FDE=(12095222, 12095248)
- +0xe0: 0xb88f10 FDE=(12095248, 12095257)
- +0xe8: 0xb88f1a FDE=(12095258, 12095280)
- +0xf0: 0xb88f30 FDE=(12095280, 12095992)
- +0xf8: 0x0 FDE=None
- +0x100: 0x0 FDE=None
- +0x108: 0xb88a44 FDE=(12094020, 12094039)
- +0x110: 0xb88a58 FDE=(12094040, 12094058)
- +0x118: 0xb88a6a FDE=(12094058, 12094218)
- +0x120: 0xb88b0a FDE=(12094218, 12094244)
- +0x128: 0xb88642 FDE=(12092994, 12093003)
- +0x130: 0xb8864c FDE=(12093004, 12093026)
- +0x138: 0xb88b24 FDE=(12094244, 12094628)
- +0x140: 0x0 FDE=None
- +0x148: 0x0 FDE=None
- +0x150: 0xb88ca4 FDE=(12094628, 12094647)
- +0x158: 0xb88cb8 FDE=(12094648, 12094666)
- +0x160: 0xb88cca FDE=(12094666, 12094826)
- +0x168: 0xb88d6a FDE=(12094826, 12094852)
- +0x170: 0xad6470 FDE=(11363440, 11363449)

### AP 0x180dda8 codeSlots=37
- +0x0: 0xb89550 FDE=(12096848, 12096874)
- +0x8: 0x0 FDE=None
- +0x10: 0xa50370 FDE=(10814320, 10814325)
- +0x18: 0x0 FDE=None
- +0x20: 0x0 FDE=None
- +0x28: 0xb8930a FDE=(12096266, 12096285)
- +0x30: 0xb8931e FDE=(12096286, 12096304)
- +0x38: 0xb89330 FDE=(12096304, 12096358)
- +0x40: 0xb89366 FDE=(12096358, 12096384)
- +0x48: 0xb88f10 FDE=(12095248, 12095257)
- +0x50: 0xb88f1a FDE=(12095258, 12095280)
- +0x58: 0xb89380 FDE=(12096384, 12096813)
- +0x60: 0x0 FDE=None
- +0x68: 0x0 FDE=None
- +0x70: 0x9d7de0 FDE=(10321376, 10321377)
- +0x78: 0xa50370 FDE=(10814320, 10814325)
- +0x80: 0xb8923c FDE=(12096060, 12096092)
- +0x88: 0xb8925c FDE=(12096092, 12096111)
- +0x90: 0x9d7de0 FDE=(10321376, 10321377)
- +0x98: 0xa50370 FDE=(10814320, 10814325)
- +0xa0: 0xb89270 FDE=(12096112, 12096122)
- +0xa8: 0x0 FDE=None
- +0xb0: 0x0 FDE=None
- +0xb8: 0xb88e9a FDE=(12095130, 12095149)
- +0xc0: 0xb88eae FDE=(12095150, 12095168)
- +0xc8: 0xb88ec0 FDE=(12095168, 12095222)
- +0xd0: 0xb88ef6 FDE=(12095222, 12095248)
- +0xd8: 0xb88f10 FDE=(12095248, 12095257)
- +0xe0: 0xb88f1a FDE=(12095258, 12095280)
- +0xe8: 0xb88f30 FDE=(12095280, 12095992)
- +0xf0: 0x0 FDE=None
- +0xf8: 0x0 FDE=None
- +0x100: 0xb88a44 FDE=(12094020, 12094039)
- +0x108: 0xb88a58 FDE=(12094040, 12094058)
- +0x110: 0xb88a6a FDE=(12094058, 12094218)
- +0x118: 0xb88b0a FDE=(12094218, 12094244)
- +0x120: 0xb88642 FDE=(12092994, 12093003)
- +0x128: 0xb8864c FDE=(12093004, 12093026)
- +0x130: 0xb88b24 FDE=(12094244, 12094628)
- +0x138: 0x0 FDE=None
- +0x140: 0x0 FDE=None
- +0x148: 0xb88ca4 FDE=(12094628, 12094647)
- +0x150: 0xb88cb8 FDE=(12094648, 12094666)
- +0x158: 0xb88cca FDE=(12094666, 12094826)
- +0x160: 0xb88d6a FDE=(12094826, 12094852)
- +0x168: 0xad6470 FDE=(11363440, 11363449)
- +0x170: 0xad647a FDE=(11363450, 11363472)
#### +0x28 body
      b8930a:	48 8d 05 bf 4a c8 00 	lea    rax,[rip+0xc84abf]        # 180ddd0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3a90>
      b89311:	48 89 07             	mov    QWORD PTR [rdi],rax
      b89314:	48 83 c7 08          	add    rdi,0x8
      b89318:	e9 71 ef ff ff       	jmp    b8828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd522e>

### AP 0x180ddb0 codeSlots=36
- +0x0: 0x0 FDE=None
- +0x8: 0xa50370 FDE=(10814320, 10814325)
- +0x10: 0x0 FDE=None
- +0x18: 0x0 FDE=None
- +0x20: 0xb8930a FDE=(12096266, 12096285)
- +0x28: 0xb8931e FDE=(12096286, 12096304)
- +0x30: 0xb89330 FDE=(12096304, 12096358)
- +0x38: 0xb89366 FDE=(12096358, 12096384)
- +0x40: 0xb88f10 FDE=(12095248, 12095257)
- +0x48: 0xb88f1a FDE=(12095258, 12095280)
- +0x50: 0xb89380 FDE=(12096384, 12096813)
- +0x58: 0x0 FDE=None
- +0x60: 0x0 FDE=None
- +0x68: 0x9d7de0 FDE=(10321376, 10321377)
- +0x70: 0xa50370 FDE=(10814320, 10814325)
- +0x78: 0xb8923c FDE=(12096060, 12096092)
- +0x80: 0xb8925c FDE=(12096092, 12096111)
- +0x88: 0x9d7de0 FDE=(10321376, 10321377)
- +0x90: 0xa50370 FDE=(10814320, 10814325)
- +0x98: 0xb89270 FDE=(12096112, 12096122)
- +0xa0: 0x0 FDE=None
- +0xa8: 0x0 FDE=None
- +0xb0: 0xb88e9a FDE=(12095130, 12095149)
- +0xb8: 0xb88eae FDE=(12095150, 12095168)
- +0xc0: 0xb88ec0 FDE=(12095168, 12095222)
- +0xc8: 0xb88ef6 FDE=(12095222, 12095248)
- +0xd0: 0xb88f10 FDE=(12095248, 12095257)
- +0xd8: 0xb88f1a FDE=(12095258, 12095280)
- +0xe0: 0xb88f30 FDE=(12095280, 12095992)
- +0xe8: 0x0 FDE=None
- +0xf0: 0x0 FDE=None
- +0xf8: 0xb88a44 FDE=(12094020, 12094039)
- +0x100: 0xb88a58 FDE=(12094040, 12094058)
- +0x108: 0xb88a6a FDE=(12094058, 12094218)
- +0x110: 0xb88b0a FDE=(12094218, 12094244)
- +0x118: 0xb88642 FDE=(12092994, 12093003)
- +0x120: 0xb8864c FDE=(12093004, 12093026)
- +0x128: 0xb88b24 FDE=(12094244, 12094628)
- +0x130: 0x0 FDE=None
- +0x138: 0x0 FDE=None
- +0x140: 0xb88ca4 FDE=(12094628, 12094647)
- +0x148: 0xb88cb8 FDE=(12094648, 12094666)
- +0x150: 0xb88cca FDE=(12094666, 12094826)
- +0x158: 0xb88d6a FDE=(12094826, 12094852)
- +0x160: 0xad6470 FDE=(11363440, 11363449)
- +0x168: 0xad647a FDE=(11363450, 11363472)
- +0x170: 0xb88954 FDE=(12093780, 12093792)
#### +0x28 body
      b8931e:	53                   	push   rbx
      b8931f:	48 89 fb             	mov    rbx,rdi
      b89322:	e8 e3 ff ff ff       	call   b8930a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd62aa>
      b89327:	48 89 df             	mov    rdi,rbx
      b8932a:	5b                   	pop    rbx
      b8932b:	e9 f0 4b c6 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x180ddb8 codeSlots=36
- +0x0: 0xa50370 FDE=(10814320, 10814325)
- +0x8: 0x0 FDE=None
- +0x10: 0x0 FDE=None
- +0x18: 0xb8930a FDE=(12096266, 12096285)
- +0x20: 0xb8931e FDE=(12096286, 12096304)
- +0x28: 0xb89330 FDE=(12096304, 12096358)
- +0x30: 0xb89366 FDE=(12096358, 12096384)
- +0x38: 0xb88f10 FDE=(12095248, 12095257)
- +0x40: 0xb88f1a FDE=(12095258, 12095280)
- +0x48: 0xb89380 FDE=(12096384, 12096813)
- +0x50: 0x0 FDE=None
- +0x58: 0x0 FDE=None
- +0x60: 0x9d7de0 FDE=(10321376, 10321377)
- +0x68: 0xa50370 FDE=(10814320, 10814325)
- +0x70: 0xb8923c FDE=(12096060, 12096092)
- +0x78: 0xb8925c FDE=(12096092, 12096111)
- +0x80: 0x9d7de0 FDE=(10321376, 10321377)
- +0x88: 0xa50370 FDE=(10814320, 10814325)
- +0x90: 0xb89270 FDE=(12096112, 12096122)
- +0x98: 0x0 FDE=None
- +0xa0: 0x0 FDE=None
- +0xa8: 0xb88e9a FDE=(12095130, 12095149)
- +0xb0: 0xb88eae FDE=(12095150, 12095168)
- +0xb8: 0xb88ec0 FDE=(12095168, 12095222)
- +0xc0: 0xb88ef6 FDE=(12095222, 12095248)
- +0xc8: 0xb88f10 FDE=(12095248, 12095257)
- +0xd0: 0xb88f1a FDE=(12095258, 12095280)
- +0xd8: 0xb88f30 FDE=(12095280, 12095992)
- +0xe0: 0x0 FDE=None
- +0xe8: 0x0 FDE=None
- +0xf0: 0xb88a44 FDE=(12094020, 12094039)
- +0xf8: 0xb88a58 FDE=(12094040, 12094058)
- +0x100: 0xb88a6a FDE=(12094058, 12094218)
- +0x108: 0xb88b0a FDE=(12094218, 12094244)
- +0x110: 0xb88642 FDE=(12092994, 12093003)
- +0x118: 0xb8864c FDE=(12093004, 12093026)
- +0x120: 0xb88b24 FDE=(12094244, 12094628)
- +0x128: 0x0 FDE=None
- +0x130: 0x0 FDE=None
- +0x138: 0xb88ca4 FDE=(12094628, 12094647)
- +0x140: 0xb88cb8 FDE=(12094648, 12094666)
- +0x148: 0xb88cca FDE=(12094666, 12094826)
- +0x150: 0xb88d6a FDE=(12094826, 12094852)
- +0x158: 0xad6470 FDE=(11363440, 11363449)
- +0x160: 0xad647a FDE=(11363450, 11363472)
- +0x168: 0xb88954 FDE=(12093780, 12093792)
- +0x170: 0x0 FDE=None
#### +0x28 body
      b89330:	41 56                	push   r14
      b89332:	53                   	push   rbx
      b89333:	50                   	push   rax
      b89334:	48 8d 5f 08          	lea    rbx,[rdi+0x8]
      b89338:	bf 88 00 00 00       	mov    edi,0x88
      b8933d:	e8 be 4b c6 00       	call   17edf00 <_Znwm@plt>
      b89342:	49 89 c6             	mov    r14,rax
      b89345:	48 8d 05 84 4a c8 00 	lea    rax,[rip+0xc84a84]        # 180ddd0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3a90>
      b8934c:	49 89 06             	mov    QWORD PTR [r14],rax
      b8934f:	49 8d 7e 08          	lea    rdi,[r14+0x8]
      b89353:	48 89 de             	mov    rsi,rbx
      b89356:	e8 1f ff ff ff       	call   b8927a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd621a>
      b8935b:	4c 89 f0             	mov    rax,r14
      b8935e:	48 83 c4 08          	add    rsp,0x8
      b89362:	5b                   	pop    rbx
      b89363:	41 5e                	pop    r14
      b89365:	c3                   	ret

### AP 0x180ddc0 codeSlots=36
- +0x0: 0x0 FDE=None
- +0x8: 0x0 FDE=None
- +0x10: 0xb8930a FDE=(12096266, 12096285)
- +0x18: 0xb8931e FDE=(12096286, 12096304)
- +0x20: 0xb89330 FDE=(12096304, 12096358)
- +0x28: 0xb89366 FDE=(12096358, 12096384)
- +0x30: 0xb88f10 FDE=(12095248, 12095257)
- +0x38: 0xb88f1a FDE=(12095258, 12095280)
- +0x40: 0xb89380 FDE=(12096384, 12096813)
- +0x48: 0x0 FDE=None
- +0x50: 0x0 FDE=None
- +0x58: 0x9d7de0 FDE=(10321376, 10321377)
- +0x60: 0xa50370 FDE=(10814320, 10814325)
- +0x68: 0xb8923c FDE=(12096060, 12096092)
- +0x70: 0xb8925c FDE=(12096092, 12096111)
- +0x78: 0x9d7de0 FDE=(10321376, 10321377)
- +0x80: 0xa50370 FDE=(10814320, 10814325)
- +0x88: 0xb89270 FDE=(12096112, 12096122)
- +0x90: 0x0 FDE=None
- +0x98: 0x0 FDE=None
- +0xa0: 0xb88e9a FDE=(12095130, 12095149)
- +0xa8: 0xb88eae FDE=(12095150, 12095168)
- +0xb0: 0xb88ec0 FDE=(12095168, 12095222)
- +0xb8: 0xb88ef6 FDE=(12095222, 12095248)
- +0xc0: 0xb88f10 FDE=(12095248, 12095257)
- +0xc8: 0xb88f1a FDE=(12095258, 12095280)
- +0xd0: 0xb88f30 FDE=(12095280, 12095992)
- +0xd8: 0x0 FDE=None
- +0xe0: 0x0 FDE=None
- +0xe8: 0xb88a44 FDE=(12094020, 12094039)
- +0xf0: 0xb88a58 FDE=(12094040, 12094058)
- +0xf8: 0xb88a6a FDE=(12094058, 12094218)
- +0x100: 0xb88b0a FDE=(12094218, 12094244)
- +0x108: 0xb88642 FDE=(12092994, 12093003)
- +0x110: 0xb8864c FDE=(12093004, 12093026)
- +0x118: 0xb88b24 FDE=(12094244, 12094628)
- +0x120: 0x0 FDE=None
- +0x128: 0x0 FDE=None
- +0x130: 0xb88ca4 FDE=(12094628, 12094647)
- +0x138: 0xb88cb8 FDE=(12094648, 12094666)
- +0x140: 0xb88cca FDE=(12094666, 12094826)
- +0x148: 0xb88d6a FDE=(12094826, 12094852)
- +0x150: 0xad6470 FDE=(11363440, 11363449)
- +0x158: 0xad647a FDE=(11363450, 11363472)
- +0x160: 0xb88954 FDE=(12093780, 12093792)
- +0x168: 0x0 FDE=None
- +0x170: 0x0 FDE=None
#### +0x28 body
      b89366:	48 8d 47 08          	lea    rax,[rdi+0x8]
      b8936a:	48 8d 0d 5f 4a c8 00 	lea    rcx,[rip+0xc84a5f]        # 180ddd0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3a90>
      b89371:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      b89374:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
      b89378:	48 89 c6             	mov    rsi,rax
      b8937b:	e9 fa fe ff ff       	jmp    b8927a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd621a>

### AP 0x180ddc8 codeSlots=37
- +0x0: 0x0 FDE=None
- +0x8: 0xb8930a FDE=(12096266, 12096285)
- +0x10: 0xb8931e FDE=(12096286, 12096304)
- +0x18: 0xb89330 FDE=(12096304, 12096358)
- +0x20: 0xb89366 FDE=(12096358, 12096384)
- +0x28: 0xb88f10 FDE=(12095248, 12095257)
- +0x30: 0xb88f1a FDE=(12095258, 12095280)
- +0x38: 0xb89380 FDE=(12096384, 12096813)
- +0x40: 0x0 FDE=None
- +0x48: 0x0 FDE=None
- +0x50: 0x9d7de0 FDE=(10321376, 10321377)
- +0x58: 0xa50370 FDE=(10814320, 10814325)
- +0x60: 0xb8923c FDE=(12096060, 12096092)
- +0x68: 0xb8925c FDE=(12096092, 12096111)
- +0x70: 0x9d7de0 FDE=(10321376, 10321377)
- +0x78: 0xa50370 FDE=(10814320, 10814325)
- +0x80: 0xb89270 FDE=(12096112, 12096122)
- +0x88: 0x0 FDE=None
- +0x90: 0x0 FDE=None
- +0x98: 0xb88e9a FDE=(12095130, 12095149)
- +0xa0: 0xb88eae FDE=(12095150, 12095168)
- +0xa8: 0xb88ec0 FDE=(12095168, 12095222)
- +0xb0: 0xb88ef6 FDE=(12095222, 12095248)
- +0xb8: 0xb88f10 FDE=(12095248, 12095257)
- +0xc0: 0xb88f1a FDE=(12095258, 12095280)
- +0xc8: 0xb88f30 FDE=(12095280, 12095992)
- +0xd0: 0x0 FDE=None
- +0xd8: 0x0 FDE=None
- +0xe0: 0xb88a44 FDE=(12094020, 12094039)
- +0xe8: 0xb88a58 FDE=(12094040, 12094058)
- +0xf0: 0xb88a6a FDE=(12094058, 12094218)
- +0xf8: 0xb88b0a FDE=(12094218, 12094244)
- +0x100: 0xb88642 FDE=(12092994, 12093003)
- +0x108: 0xb8864c FDE=(12093004, 12093026)
- +0x110: 0xb88b24 FDE=(12094244, 12094628)
- +0x118: 0x0 FDE=None
- +0x120: 0x0 FDE=None
- +0x128: 0xb88ca4 FDE=(12094628, 12094647)
- +0x130: 0xb88cb8 FDE=(12094648, 12094666)
- +0x138: 0xb88cca FDE=(12094666, 12094826)
- +0x140: 0xb88d6a FDE=(12094826, 12094852)
- +0x148: 0xad6470 FDE=(11363440, 11363449)
- +0x150: 0xad647a FDE=(11363450, 11363472)
- +0x158: 0xb88954 FDE=(12093780, 12093792)
- +0x160: 0x0 FDE=None
- +0x168: 0x0 FDE=None
- +0x170: 0xb88562 FDE=(12092770, 12092789)
#### +0x28 body
      b88f10:	48 83 c7 08          	add    rdi,0x8
      b88f14:	e9 75 f3 ff ff       	jmp    b8828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd522e>

### AP 0x180ddd0 codeSlots=38
- +0x0: 0xb8930a FDE=(12096266, 12096285)
- +0x8: 0xb8931e FDE=(12096286, 12096304)
- +0x10: 0xb89330 FDE=(12096304, 12096358)
- +0x18: 0xb89366 FDE=(12096358, 12096384)
- +0x20: 0xb88f10 FDE=(12095248, 12095257)
- +0x28: 0xb88f1a FDE=(12095258, 12095280)
- +0x30: 0xb89380 FDE=(12096384, 12096813)
- +0x38: 0x0 FDE=None
- +0x40: 0x0 FDE=None
- +0x48: 0x9d7de0 FDE=(10321376, 10321377)
- +0x50: 0xa50370 FDE=(10814320, 10814325)
- +0x58: 0xb8923c FDE=(12096060, 12096092)
- +0x60: 0xb8925c FDE=(12096092, 12096111)
- +0x68: 0x9d7de0 FDE=(10321376, 10321377)
- +0x70: 0xa50370 FDE=(10814320, 10814325)
- +0x78: 0xb89270 FDE=(12096112, 12096122)
- +0x80: 0x0 FDE=None
- +0x88: 0x0 FDE=None
- +0x90: 0xb88e9a FDE=(12095130, 12095149)
- +0x98: 0xb88eae FDE=(12095150, 12095168)
- +0xa0: 0xb88ec0 FDE=(12095168, 12095222)
- +0xa8: 0xb88ef6 FDE=(12095222, 12095248)
- +0xb0: 0xb88f10 FDE=(12095248, 12095257)
- +0xb8: 0xb88f1a FDE=(12095258, 12095280)
- +0xc0: 0xb88f30 FDE=(12095280, 12095992)
- +0xc8: 0x0 FDE=None
- +0xd0: 0x0 FDE=None
- +0xd8: 0xb88a44 FDE=(12094020, 12094039)
- +0xe0: 0xb88a58 FDE=(12094040, 12094058)
- +0xe8: 0xb88a6a FDE=(12094058, 12094218)
- +0xf0: 0xb88b0a FDE=(12094218, 12094244)
- +0xf8: 0xb88642 FDE=(12092994, 12093003)
- +0x100: 0xb8864c FDE=(12093004, 12093026)
- +0x108: 0xb88b24 FDE=(12094244, 12094628)
- +0x110: 0x0 FDE=None
- +0x118: 0x0 FDE=None
- +0x120: 0xb88ca4 FDE=(12094628, 12094647)
- +0x128: 0xb88cb8 FDE=(12094648, 12094666)
- +0x130: 0xb88cca FDE=(12094666, 12094826)
- +0x138: 0xb88d6a FDE=(12094826, 12094852)
- +0x140: 0xad6470 FDE=(11363440, 11363449)
- +0x148: 0xad647a FDE=(11363450, 11363472)
- +0x150: 0xb88954 FDE=(12093780, 12093792)
- +0x158: 0x0 FDE=None
- +0x160: 0x0 FDE=None
- +0x168: 0xb88562 FDE=(12092770, 12092789)
- +0x170: 0xb88576 FDE=(12092790, 12092808)
#### +0x28 body
      b88f1a:	53                   	push   rbx
      b88f1b:	48 89 fb             	mov    rbx,rdi
      b88f1e:	48 83 c7 08          	add    rdi,0x8
      b88f22:	e8 67 f3 ff ff       	call   b8828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd522e>
      b88f27:	48 89 df             	mov    rdi,rbx
      b88f2a:	5b                   	pop    rbx
      b88f2b:	e9 f0 4f c6 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x180ddd8 codeSlots=38
- +0x0: 0xb8931e FDE=(12096286, 12096304)
- +0x8: 0xb89330 FDE=(12096304, 12096358)
- +0x10: 0xb89366 FDE=(12096358, 12096384)
- +0x18: 0xb88f10 FDE=(12095248, 12095257)
- +0x20: 0xb88f1a FDE=(12095258, 12095280)
- +0x28: 0xb89380 FDE=(12096384, 12096813)
- +0x30: 0x0 FDE=None
- +0x38: 0x0 FDE=None
- +0x40: 0x9d7de0 FDE=(10321376, 10321377)
- +0x48: 0xa50370 FDE=(10814320, 10814325)
- +0x50: 0xb8923c FDE=(12096060, 12096092)
- +0x58: 0xb8925c FDE=(12096092, 12096111)
- +0x60: 0x9d7de0 FDE=(10321376, 10321377)
- +0x68: 0xa50370 FDE=(10814320, 10814325)
- +0x70: 0xb89270 FDE=(12096112, 12096122)
- +0x78: 0x0 FDE=None
- +0x80: 0x0 FDE=None
- +0x88: 0xb88e9a FDE=(12095130, 12095149)
- +0x90: 0xb88eae FDE=(12095150, 12095168)
- +0x98: 0xb88ec0 FDE=(12095168, 12095222)
- +0xa0: 0xb88ef6 FDE=(12095222, 12095248)
- +0xa8: 0xb88f10 FDE=(12095248, 12095257)
- +0xb0: 0xb88f1a FDE=(12095258, 12095280)
- +0xb8: 0xb88f30 FDE=(12095280, 12095992)
- +0xc0: 0x0 FDE=None
- +0xc8: 0x0 FDE=None
- +0xd0: 0xb88a44 FDE=(12094020, 12094039)
- +0xd8: 0xb88a58 FDE=(12094040, 12094058)
- +0xe0: 0xb88a6a FDE=(12094058, 12094218)
- +0xe8: 0xb88b0a FDE=(12094218, 12094244)
- +0xf0: 0xb88642 FDE=(12092994, 12093003)
- +0xf8: 0xb8864c FDE=(12093004, 12093026)
- +0x100: 0xb88b24 FDE=(12094244, 12094628)
- +0x108: 0x0 FDE=None
- +0x110: 0x0 FDE=None
- +0x118: 0xb88ca4 FDE=(12094628, 12094647)
- +0x120: 0xb88cb8 FDE=(12094648, 12094666)
- +0x128: 0xb88cca FDE=(12094666, 12094826)
- +0x130: 0xb88d6a FDE=(12094826, 12094852)
- +0x138: 0xad6470 FDE=(11363440, 11363449)
- +0x140: 0xad647a FDE=(11363450, 11363472)
- +0x148: 0xb88954 FDE=(12093780, 12093792)
- +0x150: 0x0 FDE=None
- +0x158: 0x0 FDE=None
- +0x160: 0xb88562 FDE=(12092770, 12092789)
- +0x168: 0xb88576 FDE=(12092790, 12092808)
- +0x170: 0xb88588 FDE=(12092808, 12092968)
#### +0x28 body
      b89380:	55                   	push   rbp
      b89381:	41 57                	push   r15
      b89383:	41 56                	push   r14
      b89385:	41 55                	push   r13
      b89387:	41 54                	push   r12
      b89389:	53                   	push   rbx
      b8938a:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
      b89391:	49 89 f7             	mov    r15,rsi
      b89394:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
      b89399:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b893a0:	00 00 
      b893a2:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      b893a9:	00 
      b893aa:	48 8b 46 18          	mov    rax,QWORD PTR [rsi+0x18]
      b893ae:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
      b893b3:	8a 46 40             	mov    al,BYTE PTR [rsi+0x40]
      b893b6:	88 44 24 30          	mov    BYTE PTR [rsp+0x30],al
      b893ba:	8a 46 41             	mov    al,BYTE PTR [rsi+0x41]
      b893bd:	88 44 24 31          	mov    BYTE PTR [rsp+0x31],al
      b893c1:	48 8b 46 48          	mov    rax,QWORD PTR [rsi+0x48]
      b893c5:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
      b893ca:	48 8b 46 70          	mov    rax,QWORD PTR [rsi+0x70]
      b893ce:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      b893d3:	8a 46 78             	mov    al,BYTE PTR [rsi+0x78]
      b893d6:	88 44 24 48          	mov    BYTE PTR [rsp+0x48],al
      b893da:	48 8b 46 50          	mov    rax,QWORD PTR [rsi+0x50]
      b893de:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      b893e3:	48 8b 46 68          	mov    rax,QWORD PTR [rsi+0x68]
      b893e7:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      b893ec:	48 8b 86 80 00 00 00 	mov    rax,QWORD PTR [rsi+0x80]
      b893f3:	48 8d 0d 1e 4a c8 00 	lea    rcx,[rip+0xc84a1e]        # 180de18 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3ad8>
      b893fa:	48 8d 54 24 50       	lea    rdx,[rsp+0x50]
      b893ff:	48 89 0a             	mov    QWORD PTR [rdx],rcx
      b89402:	48 89 42 08          	mov    QWORD PTR [rdx+0x8],rax
      b89406:	48 89 52 20          	mov    QWORD PTR [rdx+0x20],rdx
      b8940a:	bf 00 03 00 00       	mov    edi,0x300
      b8940f:	e8 ec 4a c6 00       	call   17edf00 <_Znwm@plt>
      b89414:	49 89 c6             	mov    r14,rax
      b89417:	4d 8d 67 08          	lea    r12,[r15+0x8]
      b8941b:	49 8d 5f 30          	lea    rbx,[r15+0x30]
      b8941f:	49 8d 47 58          	lea    rax,[r15+0x58]
      b89423:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      b89428:	49 83 c7 20          	add    r15,0x20
      b8942c:	0f 57 c0             	xorps  xmm0,xmm0
      b8942f:	41 0f 11 46 08       	movups XMMWORD PTR [r14+0x8],xmm0
      b89434:	48 8d 05 8d 19 c8 00 	lea    rax,[rip+0xc8198d]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
      b8943b:	49 89 06             	mov    QWORD PTR [r14],rax
      b8943e:	4d 89 f5             	mov    r13,r14
      b89441:	49 83 c5 20          	add    r13,0x20
      b89445:	48 8d ac 24 80 00 00 	lea    rbp,[rsp+0x80]
      b8944c:	00 
      b8944d:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
      b89452:	48 89 ef             	mov    rdi,rbp
      b89455:	e8 9e fd ff ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
      b8945a:	4c 8d 44 24 30       	lea    r8,[rsp+0x30]
      b8945f:	4c 89 ef             	mov    rdi,r13
      b89462:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
      b89467:	4c 89 fa             	mov    rdx,r15
      b8946a:	4c 89 e1             	mov    rcx,r12
      b8946d:	4c 8b 4c 24 18       	mov    r9,QWORD PTR [rsp+0x18]
      b89472:	53                   	push   rbx
      b89473:	55                   	push   rbp
      b89474:	ff 74 24 30          	push   QWORD PTR [rsp+0x30]
      b89478:	ff 74 24 20          	push   QWORD PTR [rsp+0x20]
      b8947c:	e8 6d ff 93 00       	call   14c93ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e972>
      b89481:	48 83 c4 20          	add    rsp,0x20
      b89485:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      b8948c:	00 
      b8948d:	e8 d8 0a ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b89492:	31 ff                	xor    edi,edi
      b89494:	e8 83 4f f1 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      b89499:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      b8949e:	e8 c7 0a ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b894a3:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      b894a8:	4c 89 2b             	mov    QWORD PTR [rbx],r13
      b894ab:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
      b894af:	31 ff                	xor    edi,edi
      b894b1:	e8 d0 4f f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b894b6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b894bd:	00 00 
      b894bf:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
      b894c6:	00 
      b894c7:	75 5f                	jne    b89528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd64c8>
      b894c9:	48 89 d8             	mov    rax,rbx
      b894cc:	48 81 c4 b8 00 00 00 	add    rsp,0xb8
      b894d3:	5b                   	pop    rbx
      b894d4:	41 5c                	pop    r12
      b894d6:	41 5d                	pop    r13
      b894d8:	41 5e                	pop    r14
      b894da:	41 5f                	pop    r15
      b894dc:	5d                   	pop    rbp
      b894dd:	c3                   	ret
      b894de:	48 89 c3             	mov    rbx,rax
      b894e1:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      b894e8:	00 
      b894e9:	e8 7c 0a ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b894ee:	4c 89 f7             	mov    rdi,r14
      b894f1:	e8 1a 4b c6 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      b894f6:	4c 89 f7             	mov    rdi,r14
      b894f9:	e8 1e 4f f1 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      b894fe:	eb 03                	jmp    b89503 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd64a3>
      b89500:	48 89 c3             	mov    rbx,rax
      b89503:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      b89508:	e8 5d 0a ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b8950d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b89514:	00 00 
      b89516:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
      b8951d:	00 
      b8951e:	75 08                	jne    b89528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd64c8>
      b89520:	48 89 df             	mov    rdi,rbx
      b89523:	e8 a8 67 ee ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      b89528:	e8 83 65 c6 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x180dde0 codeSlots=38
- +0x0: 0xb89330 FDE=(12096304, 12096358)
- +0x8: 0xb89366 FDE=(12096358, 12096384)
- +0x10: 0xb88f10 FDE=(12095248, 12095257)
- +0x18: 0xb88f1a FDE=(12095258, 12095280)
- +0x20: 0xb89380 FDE=(12096384, 12096813)
- +0x28: 0x0 FDE=None
- +0x30: 0x0 FDE=None
- +0x38: 0x9d7de0 FDE=(10321376, 10321377)
- +0x40: 0xa50370 FDE=(10814320, 10814325)
- +0x48: 0xb8923c FDE=(12096060, 12096092)
- +0x50: 0xb8925c FDE=(12096092, 12096111)
- +0x58: 0x9d7de0 FDE=(10321376, 10321377)
- +0x60: 0xa50370 FDE=(10814320, 10814325)
- +0x68: 0xb89270 FDE=(12096112, 12096122)
- +0x70: 0x0 FDE=None
- +0x78: 0x0 FDE=None
- +0x80: 0xb88e9a FDE=(12095130, 12095149)
- +0x88: 0xb88eae FDE=(12095150, 12095168)
- +0x90: 0xb88ec0 FDE=(12095168, 12095222)
- +0x98: 0xb88ef6 FDE=(12095222, 12095248)
- +0xa0: 0xb88f10 FDE=(12095248, 12095257)
- +0xa8: 0xb88f1a FDE=(12095258, 12095280)
- +0xb0: 0xb88f30 FDE=(12095280, 12095992)
- +0xb8: 0x0 FDE=None
- +0xc0: 0x0 FDE=None
- +0xc8: 0xb88a44 FDE=(12094020, 12094039)
- +0xd0: 0xb88a58 FDE=(12094040, 12094058)
- +0xd8: 0xb88a6a FDE=(12094058, 12094218)
- +0xe0: 0xb88b0a FDE=(12094218, 12094244)
- +0xe8: 0xb88642 FDE=(12092994, 12093003)
- +0xf0: 0xb8864c FDE=(12093004, 12093026)
- +0xf8: 0xb88b24 FDE=(12094244, 12094628)
- +0x100: 0x0 FDE=None
- +0x108: 0x0 FDE=None
- +0x110: 0xb88ca4 FDE=(12094628, 12094647)
- +0x118: 0xb88cb8 FDE=(12094648, 12094666)
- +0x120: 0xb88cca FDE=(12094666, 12094826)
- +0x128: 0xb88d6a FDE=(12094826, 12094852)
- +0x130: 0xad6470 FDE=(11363440, 11363449)
- +0x138: 0xad647a FDE=(11363450, 11363472)
- +0x140: 0xb88954 FDE=(12093780, 12093792)
- +0x148: 0x0 FDE=None
- +0x150: 0x0 FDE=None
- +0x158: 0xb88562 FDE=(12092770, 12092789)
- +0x160: 0xb88576 FDE=(12092790, 12092808)
- +0x168: 0xb88588 FDE=(12092808, 12092968)
- +0x170: 0xb88628 FDE=(12092968, 12092994)

### AP 0x180dde8 codeSlots=38
- +0x0: 0xb89366 FDE=(12096358, 12096384)
- +0x8: 0xb88f10 FDE=(12095248, 12095257)
- +0x10: 0xb88f1a FDE=(12095258, 12095280)
- +0x18: 0xb89380 FDE=(12096384, 12096813)
- +0x20: 0x0 FDE=None
- +0x28: 0x0 FDE=None
- +0x30: 0x9d7de0 FDE=(10321376, 10321377)
- +0x38: 0xa50370 FDE=(10814320, 10814325)
- +0x40: 0xb8923c FDE=(12096060, 12096092)
- +0x48: 0xb8925c FDE=(12096092, 12096111)
- +0x50: 0x9d7de0 FDE=(10321376, 10321377)
- +0x58: 0xa50370 FDE=(10814320, 10814325)
- +0x60: 0xb89270 FDE=(12096112, 12096122)
- +0x68: 0x0 FDE=None
- +0x70: 0x0 FDE=None
- +0x78: 0xb88e9a FDE=(12095130, 12095149)
- +0x80: 0xb88eae FDE=(12095150, 12095168)
- +0x88: 0xb88ec0 FDE=(12095168, 12095222)
- +0x90: 0xb88ef6 FDE=(12095222, 12095248)
- +0x98: 0xb88f10 FDE=(12095248, 12095257)
- +0xa0: 0xb88f1a FDE=(12095258, 12095280)
- +0xa8: 0xb88f30 FDE=(12095280, 12095992)
- +0xb0: 0x0 FDE=None
- +0xb8: 0x0 FDE=None
- +0xc0: 0xb88a44 FDE=(12094020, 12094039)
- +0xc8: 0xb88a58 FDE=(12094040, 12094058)
- +0xd0: 0xb88a6a FDE=(12094058, 12094218)
- +0xd8: 0xb88b0a FDE=(12094218, 12094244)
- +0xe0: 0xb88642 FDE=(12092994, 12093003)
- +0xe8: 0xb8864c FDE=(12093004, 12093026)
- +0xf0: 0xb88b24 FDE=(12094244, 12094628)
- +0xf8: 0x0 FDE=None
- +0x100: 0x0 FDE=None
- +0x108: 0xb88ca4 FDE=(12094628, 12094647)
- +0x110: 0xb88cb8 FDE=(12094648, 12094666)
- +0x118: 0xb88cca FDE=(12094666, 12094826)
- +0x120: 0xb88d6a FDE=(12094826, 12094852)
- +0x128: 0xad6470 FDE=(11363440, 11363449)
- +0x130: 0xad647a FDE=(11363450, 11363472)
- +0x138: 0xb88954 FDE=(12093780, 12093792)
- +0x140: 0x0 FDE=None
- +0x148: 0x0 FDE=None
- +0x150: 0xb88562 FDE=(12092770, 12092789)
- +0x158: 0xb88576 FDE=(12092790, 12092808)
- +0x160: 0xb88588 FDE=(12092808, 12092968)
- +0x168: 0xb88628 FDE=(12092968, 12092994)
- +0x170: 0xb88642 FDE=(12092994, 12093003)

### AP 0x180ddf0 codeSlots=38
- +0x0: 0xb88f10 FDE=(12095248, 12095257)
- +0x8: 0xb88f1a FDE=(12095258, 12095280)
- +0x10: 0xb89380 FDE=(12096384, 12096813)
- +0x18: 0x0 FDE=None
- +0x20: 0x0 FDE=None
- +0x28: 0x9d7de0 FDE=(10321376, 10321377)
- +0x30: 0xa50370 FDE=(10814320, 10814325)
- +0x38: 0xb8923c FDE=(12096060, 12096092)
- +0x40: 0xb8925c FDE=(12096092, 12096111)
- +0x48: 0x9d7de0 FDE=(10321376, 10321377)
- +0x50: 0xa50370 FDE=(10814320, 10814325)
- +0x58: 0xb89270 FDE=(12096112, 12096122)
- +0x60: 0x0 FDE=None
- +0x68: 0x0 FDE=None
- +0x70: 0xb88e9a FDE=(12095130, 12095149)
- +0x78: 0xb88eae FDE=(12095150, 12095168)
- +0x80: 0xb88ec0 FDE=(12095168, 12095222)
- +0x88: 0xb88ef6 FDE=(12095222, 12095248)
- +0x90: 0xb88f10 FDE=(12095248, 12095257)
- +0x98: 0xb88f1a FDE=(12095258, 12095280)
- +0xa0: 0xb88f30 FDE=(12095280, 12095992)
- +0xa8: 0x0 FDE=None
- +0xb0: 0x0 FDE=None
- +0xb8: 0xb88a44 FDE=(12094020, 12094039)
- +0xc0: 0xb88a58 FDE=(12094040, 12094058)
- +0xc8: 0xb88a6a FDE=(12094058, 12094218)
- +0xd0: 0xb88b0a FDE=(12094218, 12094244)
- +0xd8: 0xb88642 FDE=(12092994, 12093003)
- +0xe0: 0xb8864c FDE=(12093004, 12093026)
- +0xe8: 0xb88b24 FDE=(12094244, 12094628)
- +0xf0: 0x0 FDE=None
- +0xf8: 0x0 FDE=None
- +0x100: 0xb88ca4 FDE=(12094628, 12094647)
- +0x108: 0xb88cb8 FDE=(12094648, 12094666)
- +0x110: 0xb88cca FDE=(12094666, 12094826)
- +0x118: 0xb88d6a FDE=(12094826, 12094852)
- +0x120: 0xad6470 FDE=(11363440, 11363449)
- +0x128: 0xad647a FDE=(11363450, 11363472)
- +0x130: 0xb88954 FDE=(12093780, 12093792)
- +0x138: 0x0 FDE=None
- +0x140: 0x0 FDE=None
- +0x148: 0xb88562 FDE=(12092770, 12092789)
- +0x150: 0xb88576 FDE=(12092790, 12092808)
- +0x158: 0xb88588 FDE=(12092808, 12092968)
- +0x160: 0xb88628 FDE=(12092968, 12092994)
- +0x168: 0xb88642 FDE=(12092994, 12093003)
- +0x170: 0xb8864c FDE=(12093004, 12093026)
#### +0x28 body
      9d7de0:	c3                   	ret

### AP 0x180de40 codeSlots=37
- +0x0: 0xa50370 FDE=(10814320, 10814325)
- +0x8: 0xb89270 FDE=(12096112, 12096122)
- +0x10: 0x0 FDE=None
- +0x18: 0x0 FDE=None
- +0x20: 0xb88e9a FDE=(12095130, 12095149)
- +0x28: 0xb88eae FDE=(12095150, 12095168)
- +0x30: 0xb88ec0 FDE=(12095168, 12095222)
- +0x38: 0xb88ef6 FDE=(12095222, 12095248)
- +0x40: 0xb88f10 FDE=(12095248, 12095257)
- +0x48: 0xb88f1a FDE=(12095258, 12095280)
- +0x50: 0xb88f30 FDE=(12095280, 12095992)
- +0x58: 0x0 FDE=None
- +0x60: 0x0 FDE=None
- +0x68: 0xb88a44 FDE=(12094020, 12094039)
- +0x70: 0xb88a58 FDE=(12094040, 12094058)
- +0x78: 0xb88a6a FDE=(12094058, 12094218)
- +0x80: 0xb88b0a FDE=(12094218, 12094244)
- +0x88: 0xb88642 FDE=(12092994, 12093003)
- +0x90: 0xb8864c FDE=(12093004, 12093026)
- +0x98: 0xb88b24 FDE=(12094244, 12094628)
- +0xa0: 0x0 FDE=None
- +0xa8: 0x0 FDE=None
- +0xb0: 0xb88ca4 FDE=(12094628, 12094647)
- +0xb8: 0xb88cb8 FDE=(12094648, 12094666)
- +0xc0: 0xb88cca FDE=(12094666, 12094826)
- +0xc8: 0xb88d6a FDE=(12094826, 12094852)
- +0xd0: 0xad6470 FDE=(11363440, 11363449)
- +0xd8: 0xad647a FDE=(11363450, 11363472)
- +0xe0: 0xb88954 FDE=(12093780, 12093792)
- +0xe8: 0x0 FDE=None
- +0xf0: 0x0 FDE=None
- +0xf8: 0xb88562 FDE=(12092770, 12092789)
- +0x100: 0xb88576 FDE=(12092790, 12092808)
- +0x108: 0xb88588 FDE=(12092808, 12092968)
- +0x110: 0xb88628 FDE=(12092968, 12092994)
- +0x118: 0xb88642 FDE=(12092994, 12093003)
- +0x120: 0xb8864c FDE=(12093004, 12093026)
- +0x128: 0xb88662 FDE=(12093026, 12093555)
- +0x130: 0x0 FDE=None
- +0x138: 0x0 FDE=None
- +0x140: 0xb88874 FDE=(12093556, 12093575)
- +0x148: 0xb88888 FDE=(12093576, 12093594)
- +0x150: 0xb8889a FDE=(12093594, 12093754)
- +0x158: 0xb8893a FDE=(12093754, 12093780)
- +0x160: 0xad6470 FDE=(11363440, 11363449)
- +0x168: 0xad647a FDE=(11363450, 11363472)
- +0x170: 0xb88954 FDE=(12093780, 12093792)
#### +0x28 body
      b88eae:	53                   	push   rbx
      b88eaf:	48 89 fb             	mov    rbx,rdi
      b88eb2:	e8 e3 ff ff ff       	call   b88e9a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5e3a>
      b88eb7:	48 89 df             	mov    rdi,rbx
      b88eba:	5b                   	pop    rbx
      b88ebb:	e9 60 50 c6 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x180de48 codeSlots=36
- +0x0: 0xb89270 FDE=(12096112, 12096122)
- +0x8: 0x0 FDE=None
- +0x10: 0x0 FDE=None
- +0x18: 0xb88e9a FDE=(12095130, 12095149)
- +0x20: 0xb88eae FDE=(12095150, 12095168)
- +0x28: 0xb88ec0 FDE=(12095168, 12095222)
- +0x30: 0xb88ef6 FDE=(12095222, 12095248)
- +0x38: 0xb88f10 FDE=(12095248, 12095257)
- +0x40: 0xb88f1a FDE=(12095258, 12095280)
- +0x48: 0xb88f30 FDE=(12095280, 12095992)
- +0x50: 0x0 FDE=None
- +0x58: 0x0 FDE=None
- +0x60: 0xb88a44 FDE=(12094020, 12094039)
- +0x68: 0xb88a58 FDE=(12094040, 12094058)
- +0x70: 0xb88a6a FDE=(12094058, 12094218)
- +0x78: 0xb88b0a FDE=(12094218, 12094244)
- +0x80: 0xb88642 FDE=(12092994, 12093003)
- +0x88: 0xb8864c FDE=(12093004, 12093026)
- +0x90: 0xb88b24 FDE=(12094244, 12094628)
- +0x98: 0x0 FDE=None
- +0xa0: 0x0 FDE=None
- +0xa8: 0xb88ca4 FDE=(12094628, 12094647)
- +0xb0: 0xb88cb8 FDE=(12094648, 12094666)
- +0xb8: 0xb88cca FDE=(12094666, 12094826)
- +0xc0: 0xb88d6a FDE=(12094826, 12094852)
- +0xc8: 0xad6470 FDE=(11363440, 11363449)
- +0xd0: 0xad647a FDE=(11363450, 11363472)
- +0xd8: 0xb88954 FDE=(12093780, 12093792)
- +0xe0: 0x0 FDE=None
- +0xe8: 0x0 FDE=None
- +0xf0: 0xb88562 FDE=(12092770, 12092789)
- +0xf8: 0xb88576 FDE=(12092790, 12092808)
- +0x100: 0xb88588 FDE=(12092808, 12092968)
- +0x108: 0xb88628 FDE=(12092968, 12092994)
- +0x110: 0xb88642 FDE=(12092994, 12093003)
- +0x118: 0xb8864c FDE=(12093004, 12093026)
- +0x120: 0xb88662 FDE=(12093026, 12093555)
- +0x128: 0x0 FDE=None
- +0x130: 0x0 FDE=None
- +0x138: 0xb88874 FDE=(12093556, 12093575)
- +0x140: 0xb88888 FDE=(12093576, 12093594)
- +0x148: 0xb8889a FDE=(12093594, 12093754)
- +0x150: 0xb8893a FDE=(12093754, 12093780)
- +0x158: 0xad6470 FDE=(11363440, 11363449)
- +0x160: 0xad647a FDE=(11363450, 11363472)
- +0x168: 0xb88954 FDE=(12093780, 12093792)
- +0x170: 0x0 FDE=None
#### +0x28 body
      b88ec0:	41 56                	push   r14
      b88ec2:	53                   	push   rbx
      b88ec3:	50                   	push   rax
      b88ec4:	48 8d 5f 08          	lea    rbx,[rdi+0x8]
      b88ec8:	bf 88 00 00 00       	mov    edi,0x88
      b88ecd:	e8 2e 50 c6 00       	call   17edf00 <_Znwm@plt>
      b88ed2:	49 89 c6             	mov    r14,rax
      b88ed5:	48 8d 05 84 4f c8 00 	lea    rax,[rip+0xc84f84]        # 180de60 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3b20>
      b88edc:	49 89 06             	mov    QWORD PTR [r14],rax
      b88edf:	49 8d 7e 08          	lea    rdi,[r14+0x8]
      b88ee3:	48 89 de             	mov    rsi,rbx
      b88ee6:	e8 8f 03 00 00       	call   b8927a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd621a>
      b88eeb:	4c 89 f0             	mov    rax,r14
      b88eee:	48 83 c4 08          	add    rsp,0x8
      b88ef2:	5b                   	pop    rbx
      b88ef3:	41 5e                	pop    r14
      b88ef5:	c3                   	ret

### AP 0x180de50 codeSlots=36
- +0x0: 0x0 FDE=None
- +0x8: 0x0 FDE=None
- +0x10: 0xb88e9a FDE=(12095130, 12095149)
- +0x18: 0xb88eae FDE=(12095150, 12095168)
- +0x20: 0xb88ec0 FDE=(12095168, 12095222)
- +0x28: 0xb88ef6 FDE=(12095222, 12095248)
- +0x30: 0xb88f10 FDE=(12095248, 12095257)
- +0x38: 0xb88f1a FDE=(12095258, 12095280)
- +0x40: 0xb88f30 FDE=(12095280, 12095992)
- +0x48: 0x0 FDE=None
- +0x50: 0x0 FDE=None
- +0x58: 0xb88a44 FDE=(12094020, 12094039)
- +0x60: 0xb88a58 FDE=(12094040, 12094058)
- +0x68: 0xb88a6a FDE=(12094058, 12094218)
- +0x70: 0xb88b0a FDE=(12094218, 12094244)
- +0x78: 0xb88642 FDE=(12092994, 12093003)
- +0x80: 0xb8864c FDE=(12093004, 12093026)
- +0x88: 0xb88b24 FDE=(12094244, 12094628)
- +0x90: 0x0 FDE=None
- +0x98: 0x0 FDE=None
- +0xa0: 0xb88ca4 FDE=(12094628, 12094647)
- +0xa8: 0xb88cb8 FDE=(12094648, 12094666)
- +0xb0: 0xb88cca FDE=(12094666, 12094826)
- +0xb8: 0xb88d6a FDE=(12094826, 12094852)
- +0xc0: 0xad6470 FDE=(11363440, 11363449)
- +0xc8: 0xad647a FDE=(11363450, 11363472)
- +0xd0: 0xb88954 FDE=(12093780, 12093792)
- +0xd8: 0x0 FDE=None
- +0xe0: 0x0 FDE=None
- +0xe8: 0xb88562 FDE=(12092770, 12092789)
- +0xf0: 0xb88576 FDE=(12092790, 12092808)
- +0xf8: 0xb88588 FDE=(12092808, 12092968)
- +0x100: 0xb88628 FDE=(12092968, 12092994)
- +0x108: 0xb88642 FDE=(12092994, 12093003)
- +0x110: 0xb8864c FDE=(12093004, 12093026)
- +0x118: 0xb88662 FDE=(12093026, 12093555)
- +0x120: 0x0 FDE=None
- +0x128: 0x0 FDE=None
- +0x130: 0xb88874 FDE=(12093556, 12093575)
- +0x138: 0xb88888 FDE=(12093576, 12093594)
- +0x140: 0xb8889a FDE=(12093594, 12093754)
- +0x148: 0xb8893a FDE=(12093754, 12093780)
- +0x150: 0xad6470 FDE=(11363440, 11363449)
- +0x158: 0xad647a FDE=(11363450, 11363472)
- +0x160: 0xb88954 FDE=(12093780, 12093792)
- +0x168: 0x0 FDE=None
- +0x170: 0x0 FDE=None
#### +0x28 body
      b88ef6:	48 8d 47 08          	lea    rax,[rdi+0x8]
      b88efa:	48 8d 0d 5f 4f c8 00 	lea    rcx,[rip+0xc84f5f]        # 180de60 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3b20>
      b88f01:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      b88f04:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
      b88f08:	48 89 c6             	mov    rsi,rax
      b88f0b:	e9 6a 03 00 00       	jmp    b8927a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd621a>

### AP 0x180de58 codeSlots=37
- +0x0: 0x0 FDE=None
- +0x8: 0xb88e9a FDE=(12095130, 12095149)
- +0x10: 0xb88eae FDE=(12095150, 12095168)
- +0x18: 0xb88ec0 FDE=(12095168, 12095222)
- +0x20: 0xb88ef6 FDE=(12095222, 12095248)
- +0x28: 0xb88f10 FDE=(12095248, 12095257)
- +0x30: 0xb88f1a FDE=(12095258, 12095280)
- +0x38: 0xb88f30 FDE=(12095280, 12095992)
- +0x40: 0x0 FDE=None
- +0x48: 0x0 FDE=None
- +0x50: 0xb88a44 FDE=(12094020, 12094039)
- +0x58: 0xb88a58 FDE=(12094040, 12094058)
- +0x60: 0xb88a6a FDE=(12094058, 12094218)
- +0x68: 0xb88b0a FDE=(12094218, 12094244)
- +0x70: 0xb88642 FDE=(12092994, 12093003)
- +0x78: 0xb8864c FDE=(12093004, 12093026)
- +0x80: 0xb88b24 FDE=(12094244, 12094628)
- +0x88: 0x0 FDE=None
- +0x90: 0x0 FDE=None
- +0x98: 0xb88ca4 FDE=(12094628, 12094647)
- +0xa0: 0xb88cb8 FDE=(12094648, 12094666)
- +0xa8: 0xb88cca FDE=(12094666, 12094826)
- +0xb0: 0xb88d6a FDE=(12094826, 12094852)
- +0xb8: 0xad6470 FDE=(11363440, 11363449)
- +0xc0: 0xad647a FDE=(11363450, 11363472)
- +0xc8: 0xb88954 FDE=(12093780, 12093792)
- +0xd0: 0x0 FDE=None
- +0xd8: 0x0 FDE=None
- +0xe0: 0xb88562 FDE=(12092770, 12092789)
- +0xe8: 0xb88576 FDE=(12092790, 12092808)
- +0xf0: 0xb88588 FDE=(12092808, 12092968)
- +0xf8: 0xb88628 FDE=(12092968, 12092994)
- +0x100: 0xb88642 FDE=(12092994, 12093003)
- +0x108: 0xb8864c FDE=(12093004, 12093026)
- +0x110: 0xb88662 FDE=(12093026, 12093555)
- +0x118: 0x0 FDE=None
- +0x120: 0x0 FDE=None
- +0x128: 0xb88874 FDE=(12093556, 12093575)
- +0x130: 0xb88888 FDE=(12093576, 12093594)
- +0x138: 0xb8889a FDE=(12093594, 12093754)
- +0x140: 0xb8893a FDE=(12093754, 12093780)
- +0x148: 0xad6470 FDE=(11363440, 11363449)
- +0x150: 0xad647a FDE=(11363450, 11363472)
- +0x158: 0xb88954 FDE=(12093780, 12093792)
- +0x160: 0x0 FDE=None
- +0x168: 0x0 FDE=None
- +0x170: 0xb884d4 FDE=(12092628, 12092647)
#### +0x28 body
      b88f10:	48 83 c7 08          	add    rdi,0x8
      b88f14:	e9 75 f3 ff ff       	jmp    b8828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd522e>

### AP 0x180de60 codeSlots=38
- +0x0: 0xb88e9a FDE=(12095130, 12095149)
- +0x8: 0xb88eae FDE=(12095150, 12095168)
- +0x10: 0xb88ec0 FDE=(12095168, 12095222)
- +0x18: 0xb88ef6 FDE=(12095222, 12095248)
- +0x20: 0xb88f10 FDE=(12095248, 12095257)
- +0x28: 0xb88f1a FDE=(12095258, 12095280)
- +0x30: 0xb88f30 FDE=(12095280, 12095992)
- +0x38: 0x0 FDE=None
- +0x40: 0x0 FDE=None
- +0x48: 0xb88a44 FDE=(12094020, 12094039)
- +0x50: 0xb88a58 FDE=(12094040, 12094058)
- +0x58: 0xb88a6a FDE=(12094058, 12094218)
- +0x60: 0xb88b0a FDE=(12094218, 12094244)
- +0x68: 0xb88642 FDE=(12092994, 12093003)
- +0x70: 0xb8864c FDE=(12093004, 12093026)
- +0x78: 0xb88b24 FDE=(12094244, 12094628)
- +0x80: 0x0 FDE=None
- +0x88: 0x0 FDE=None
- +0x90: 0xb88ca4 FDE=(12094628, 12094647)
- +0x98: 0xb88cb8 FDE=(12094648, 12094666)
- +0xa0: 0xb88cca FDE=(12094666, 12094826)
- +0xa8: 0xb88d6a FDE=(12094826, 12094852)
- +0xb0: 0xad6470 FDE=(11363440, 11363449)
- +0xb8: 0xad647a FDE=(11363450, 11363472)
- +0xc0: 0xb88954 FDE=(12093780, 12093792)
- +0xc8: 0x0 FDE=None
- +0xd0: 0x0 FDE=None
- +0xd8: 0xb88562 FDE=(12092770, 12092789)
- +0xe0: 0xb88576 FDE=(12092790, 12092808)
- +0xe8: 0xb88588 FDE=(12092808, 12092968)
- +0xf0: 0xb88628 FDE=(12092968, 12092994)
- +0xf8: 0xb88642 FDE=(12092994, 12093003)
- +0x100: 0xb8864c FDE=(12093004, 12093026)
- +0x108: 0xb88662 FDE=(12093026, 12093555)
- +0x110: 0x0 FDE=None
- +0x118: 0x0 FDE=None
- +0x120: 0xb88874 FDE=(12093556, 12093575)
- +0x128: 0xb88888 FDE=(12093576, 12093594)
- +0x130: 0xb8889a FDE=(12093594, 12093754)
- +0x138: 0xb8893a FDE=(12093754, 12093780)
- +0x140: 0xad6470 FDE=(11363440, 11363449)
- +0x148: 0xad647a FDE=(11363450, 11363472)
- +0x150: 0xb88954 FDE=(12093780, 12093792)
- +0x158: 0x0 FDE=None
- +0x160: 0x0 FDE=None
- +0x168: 0xb884d4 FDE=(12092628, 12092647)
- +0x170: 0xb884e8 FDE=(12092648, 12092666)
#### +0x28 body
      b88f1a:	53                   	push   rbx
      b88f1b:	48 89 fb             	mov    rbx,rdi
      b88f1e:	48 83 c7 08          	add    rdi,0x8
      b88f22:	e8 67 f3 ff ff       	call   b8828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd522e>
      b88f27:	48 89 df             	mov    rdi,rbx
      b88f2a:	5b                   	pop    rbx
      b88f2b:	e9 f0 4f c6 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x180de68 codeSlots=38
- +0x0: 0xb88eae FDE=(12095150, 12095168)
- +0x8: 0xb88ec0 FDE=(12095168, 12095222)
- +0x10: 0xb88ef6 FDE=(12095222, 12095248)
- +0x18: 0xb88f10 FDE=(12095248, 12095257)
- +0x20: 0xb88f1a FDE=(12095258, 12095280)
- +0x28: 0xb88f30 FDE=(12095280, 12095992)
- +0x30: 0x0 FDE=None
- +0x38: 0x0 FDE=None
- +0x40: 0xb88a44 FDE=(12094020, 12094039)
- +0x48: 0xb88a58 FDE=(12094040, 12094058)
- +0x50: 0xb88a6a FDE=(12094058, 12094218)
- +0x58: 0xb88b0a FDE=(12094218, 12094244)
- +0x60: 0xb88642 FDE=(12092994, 12093003)
- +0x68: 0xb8864c FDE=(12093004, 12093026)
- +0x70: 0xb88b24 FDE=(12094244, 12094628)
- +0x78: 0x0 FDE=None
- +0x80: 0x0 FDE=None
- +0x88: 0xb88ca4 FDE=(12094628, 12094647)
- +0x90: 0xb88cb8 FDE=(12094648, 12094666)
- +0x98: 0xb88cca FDE=(12094666, 12094826)
- +0xa0: 0xb88d6a FDE=(12094826, 12094852)
- +0xa8: 0xad6470 FDE=(11363440, 11363449)
- +0xb0: 0xad647a FDE=(11363450, 11363472)
- +0xb8: 0xb88954 FDE=(12093780, 12093792)
- +0xc0: 0x0 FDE=None
- +0xc8: 0x0 FDE=None
- +0xd0: 0xb88562 FDE=(12092770, 12092789)
- +0xd8: 0xb88576 FDE=(12092790, 12092808)
- +0xe0: 0xb88588 FDE=(12092808, 12092968)
- +0xe8: 0xb88628 FDE=(12092968, 12092994)
- +0xf0: 0xb88642 FDE=(12092994, 12093003)
- +0xf8: 0xb8864c FDE=(12093004, 12093026)
- +0x100: 0xb88662 FDE=(12093026, 12093555)
- +0x108: 0x0 FDE=None
- +0x110: 0x0 FDE=None
- +0x118: 0xb88874 FDE=(12093556, 12093575)
- +0x120: 0xb88888 FDE=(12093576, 12093594)
- +0x128: 0xb8889a FDE=(12093594, 12093754)
- +0x130: 0xb8893a FDE=(12093754, 12093780)
- +0x138: 0xad6470 FDE=(11363440, 11363449)
- +0x140: 0xad647a FDE=(11363450, 11363472)
- +0x148: 0xb88954 FDE=(12093780, 12093792)
- +0x150: 0x0 FDE=None
- +0x158: 0x0 FDE=None
- +0x160: 0xb884d4 FDE=(12092628, 12092647)
- +0x168: 0xb884e8 FDE=(12092648, 12092666)
- +0x170: 0xb884fa FDE=(12092666, 12092712)
#### +0x28 body
      b88f30:	55                   	push   rbp
      b88f31:	41 57                	push   r15
      b88f33:	41 56                	push   r14
      b88f35:	41 55                	push   r13
      b88f37:	41 54                	push   r12
      b88f39:	53                   	push   rbx
      b88f3a:	48 81 ec d8 01 00 00 	sub    rsp,0x1d8
      b88f41:	49 89 d4             	mov    r12,rdx
      b88f44:	49 89 f5             	mov    r13,rsi
      b88f47:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
      b88f4b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b88f52:	00 00 
      b88f54:	48 89 84 24 d0 01 00 	mov    QWORD PTR [rsp+0x1d0],rax
      b88f5b:	00 
      b88f5c:	48 8b 46 18          	mov    rax,QWORD PTR [rsi+0x18]
      b88f60:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      b88f65:	8a 46 40             	mov    al,BYTE PTR [rsi+0x40]
      b88f68:	88 44 24 30          	mov    BYTE PTR [rsp+0x30],al
      b88f6c:	8a 46 41             	mov    al,BYTE PTR [rsi+0x41]
      b88f6f:	88 44 24 31          	mov    BYTE PTR [rsp+0x31],al
      b88f73:	48 8b 46 48          	mov    rax,QWORD PTR [rsi+0x48]
      b88f77:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
      b88f7c:	48 8b 46 70          	mov    rax,QWORD PTR [rsi+0x70]
      b88f80:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      b88f85:	8a 46 78             	mov    al,BYTE PTR [rsi+0x78]
      b88f88:	88 44 24 48          	mov    BYTE PTR [rsp+0x48],al
      b88f8c:	4c 8b 76 50          	mov    r14,QWORD PTR [rsi+0x50]
      b88f90:	48 8b 46 68          	mov    rax,QWORD PTR [rsi+0x68]
      b88f94:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      b88f99:	48 8b 86 80 00 00 00 	mov    rax,QWORD PTR [rsi+0x80]
      b88fa0:	48 8d 0d 71 4e c8 00 	lea    rcx,[rip+0xc84e71]        # 180de18 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3ad8>
      b88fa7:	48 8d 94 24 40 01 00 	lea    rdx,[rsp+0x140]
      b88fae:	00 
      b88faf:	48 89 0a             	mov    QWORD PTR [rdx],rcx
      b88fb2:	48 89 42 08          	mov    QWORD PTR [rdx+0x8],rax
      b88fb6:	48 89 52 20          	mov    QWORD PTR [rdx+0x20],rdx
      b88fba:	bf 00 03 00 00       	mov    edi,0x300
      b88fbf:	e8 3c 4f c6 00       	call   17edf00 <_Znwm@plt>
      b88fc4:	48 89 c3             	mov    rbx,rax
      b88fc7:	0f 57 c0             	xorps  xmm0,xmm0
      b88fca:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      b88fce:	48 8d 05 f3 1d c8 00 	lea    rax,[rip+0xc81df3]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
      b88fd5:	48 89 03             	mov    QWORD PTR [rbx],rax
      b88fd8:	4c 8d bc 24 70 01 00 	lea    r15,[rsp+0x170]
      b88fdf:	00 
      b88fe0:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]
      b88fe7:	00 
      b88fe8:	4c 89 ff             	mov    rdi,r15
      b88feb:	e8 08 02 00 00       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
      b88ff0:	48 8d ac 24 a0 01 00 	lea    rbp,[rsp+0x1a0]
      b88ff7:	00 
      b88ff8:	48 89 ef             	mov    rdi,rbp
      b88ffb:	4c 89 fe             	mov    rsi,r15
      b88ffe:	e8 8d 12 ef ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      b89003:	49 89 df             	mov    r15,rbx
      b89006:	49 83 c7 20          	add    r15,0x20
      b8900a:	49 8d 4d 08          	lea    rcx,[r13+0x8]
      b8900e:	49 8d 55 20          	lea    rdx,[r13+0x20]
      b89012:	49 8d 45 58          	lea    rax,[r13+0x58]
      b89016:	49 83 c5 30          	add    r13,0x30
      b8901a:	4c 8d 44 24 30       	lea    r8,[rsp+0x30]
      b8901f:	4c 89 ff             	mov    rdi,r15
      b89022:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
      b89027:	4d 89 f1             	mov    r9,r14
      b8902a:	41 55                	push   r13
      b8902c:	55                   	push   rbp
      b8902d:	ff 74 24 18          	push   QWORD PTR [rsp+0x18]
      b89031:	50                   	push   rax
      b89032:	e8 b7 03 94 00       	call   14c93ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e972>
      b89037:	48 83 c4 20          	add    rsp,0x20
      b8903b:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
      b89042:	00 
      b89043:	e8 22 0f ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b89048:	4c 89 e7             	mov    rdi,r12
      b8904b:	e8 a3 1a 94 00       	call   14caaf3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x310077>
      b89050:	88 83 50 02 00 00    	mov    BYTE PTR [rbx+0x250],al
      b89056:	41 80 bc 24 a8 09 00 	cmp    BYTE PTR [r12+0x9a8],0x0
      b8905d:	00 00 
      b8905f:	74 21                	je     b89082 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6022>
      b89061:	c6 83 98 02 00 00 01 	mov    BYTE PTR [rbx+0x298],0x1
      b89068:	c6 83 9a 02 00 00 00 	mov    BYTE PTR [rbx+0x29a],0x0
      b8906f:	4c 89 ff             	mov    rdi,r15
      b89072:	4c 89 e6             	mov    rsi,r12
      b89075:	31 d2                	xor    edx,edx
      b89077:	e8 52 19 94 00       	call   14ca9ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30ff52>
      b8907c:	8a 83 50 02 00 00    	mov    al,BYTE PTR [rbx+0x250]
      b89082:	41 80 bc 24 30 09 00 	cmp    BYTE PTR [r12+0x930],0x0
      b89089:	00 00 
      b8908b:	74 7b                	je     b89108 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd60a8>
      b8908d:	84 c0                	test   al,al
      b8908f:	74 77                	je     b89108 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd60a8>
      b89091:	4c 8b b3 f0 01 00 00 	mov    r14,QWORD PTR [rbx+0x1f0]
      b89098:	31 c0                	xor    eax,eax
      b8909a:	88 44 24 60          	mov    BYTE PTR [rsp+0x60],al
      b8909e:	88 44 24 68          	mov    BYTE PTR [rsp+0x68],al
      b890a2:	88 44 24 50          	mov    BYTE PTR [rsp+0x50],al
      b890a6:	88 44 24 58          	mov    BYTE PTR [rsp+0x58],al
      b890aa:	48 8d 35 cb 8e 8c ff 	lea    rsi,[rip+0xffffffffff8c8ecb]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      b890b1:	4c 8d 6c 24 18       	lea    r13,[rsp+0x18]
      b890b6:	4c 89 ef             	mov    rdi,r13
      b890b9:	e8 c0 09 ef ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      b890be:	49 8d b4 24 c0 04 00 	lea    rsi,[r12+0x4c0]
      b890c5:	00 
      b890c6:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      b890cb:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
      b890d0:	4c 8d 44 24 50       	lea    r8,[rsp+0x50]
      b890d5:	4c 89 e2             	mov    rdx,r12
      b890d8:	45 31 c9             	xor    r9d,r9d
      b890db:	41 55                	push   r13
      b890dd:	6a 01                	push   0x1
      b890df:	e8 85 15 94 00       	call   14ca669 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30fbed>
      b890e4:	58                   	pop    rax
      b890e5:	59                   	pop    rcx
      b890e6:	49 8b 06             	mov    rax,QWORD PTR [r14]
      b890e9:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
      b890ee:	4c 89 f7             	mov    rdi,r14
      b890f1:	ff 50 28             	call   QWORD PTR [rax+0x28]
      b890f4:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      b890f9:	e8 bc bd 7c 00       	call   1354eba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a43e>
      b890fe:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      b89103:	e8 88 4d c6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b89108:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      b8910f:	00 
      b89110:	e8 55 0e ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b89115:	31 ff                	xor    edi,edi
      b89117:	e8 00 53 f1 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      b8911c:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
      b89123:	00 
      b89124:	e8 41 0e ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b89129:	4c 8b 34 24          	mov    r14,QWORD PTR [rsp]
      b8912d:	4d 89 3e             	mov    QWORD PTR [r14],r15
      b89130:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
      b89134:	31 ff                	xor    edi,edi
      b89136:	e8 4b 53 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b8913b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b89142:	00 00 
      b89144:	48 3b 84 24 d0 01 00 	cmp    rax,QWORD PTR [rsp+0x1d0]
      b8914b:	00 
      b8914c:	0f 85 9c 00 00 00    	jne    b891ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd618e>
      b89152:	4c 89 f0             	mov    rax,r14
      b89155:	48 81 c4 d8 01 00 00 	add    rsp,0x1d8
      b8915c:	5b                   	pop    rbx
      b8915d:	41 5c                	pop    r12
      b8915f:	41 5d                	pop    r13
      b89161:	41 5e                	pop    r14
      b89163:	41 5f                	pop    r15
      b89165:	5d                   	pop    rbp
      b89166:	c3                   	ret
      b89167:	49 89 c6             	mov    r14,rax
      b8916a:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      b8916f:	e8 46 bd 7c 00       	call   1354eba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a43e>
      b89174:	eb 03                	jmp    b89179 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6119>
      b89176:	49 89 c6             	mov    r14,rax
      b89179:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      b8917e:	e8 0d 4d c6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b89183:	eb 05                	jmp    b8918a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd612a>
      b89185:	eb 00                	jmp    b89187 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6127>
      b89187:	49 89 c6             	mov    r14,rax
      b8918a:	4c 89 ff             	mov    rdi,r15
      b8918d:	e8 7c 05 94 00       	call   14c970e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30ec92>
      b89192:	eb 15                	jmp    b891a9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6149>
      b89194:	49 89 c6             	mov    r14,rax
      b89197:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
      b8919e:	00 
      b8919f:	e8 c6 0d ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b891a4:	eb 03                	jmp    b891a9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6149>
      b891a6:	49 89 c6             	mov    r14,rax
      b891a9:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      b891b0:	00 
      b891b1:	e8 b4 0d ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b891b6:	48 89 df             	mov    rdi,rbx
      b891b9:	e8 52 4e c6 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      b891be:	48 89 df             	mov    rdi,rbx
      b891c1:	e8 56 52 f1 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      b891c6:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
      b891cd:	00 
      b891ce:	e8 97 0d ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b891d3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b891da:	00 00 
      b891dc:	48 3b 84 24 d0 01 00 	cmp    rax,QWORD PTR [rsp+0x1d0]
      b891e3:	00 
      b891e4:	75 08                	jne    b891ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd618e>
      b891e6:	4c 89 f7             	mov    rdi,r14
      b891e9:	e8 e2 6a ee ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      b891ee:	e8 bd 68 c6 00       	call   17efab0 <__stack_chk_fail@plt>
      b891f3:	49 89 c6             	mov    r14,rax
      b891f6:	eb ce                	jmp    b891c6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6166>

### AP 0x180de70 codeSlots=38
- +0x0: 0xb88ec0 FDE=(12095168, 12095222)
- +0x8: 0xb88ef6 FDE=(12095222, 12095248)
- +0x10: 0xb88f10 FDE=(12095248, 12095257)
- +0x18: 0xb88f1a FDE=(12095258, 12095280)
- +0x20: 0xb88f30 FDE=(12095280, 12095992)
- +0x28: 0x0 FDE=None
- +0x30: 0x0 FDE=None
- +0x38: 0xb88a44 FDE=(12094020, 12094039)
- +0x40: 0xb88a58 FDE=(12094040, 12094058)
- +0x48: 0xb88a6a FDE=(12094058, 12094218)
- +0x50: 0xb88b0a FDE=(12094218, 12094244)
- +0x58: 0xb88642 FDE=(12092994, 12093003)
- +0x60: 0xb8864c FDE=(12093004, 12093026)
- +0x68: 0xb88b24 FDE=(12094244, 12094628)
- +0x70: 0x0 FDE=None
- +0x78: 0x0 FDE=None
- +0x80: 0xb88ca4 FDE=(12094628, 12094647)
- +0x88: 0xb88cb8 FDE=(12094648, 12094666)
- +0x90: 0xb88cca FDE=(12094666, 12094826)
- +0x98: 0xb88d6a FDE=(12094826, 12094852)
- +0xa0: 0xad6470 FDE=(11363440, 11363449)
- +0xa8: 0xad647a FDE=(11363450, 11363472)
- +0xb0: 0xb88954 FDE=(12093780, 12093792)
- +0xb8: 0x0 FDE=None
- +0xc0: 0x0 FDE=None
- +0xc8: 0xb88562 FDE=(12092770, 12092789)
- +0xd0: 0xb88576 FDE=(12092790, 12092808)
- +0xd8: 0xb88588 FDE=(12092808, 12092968)
- +0xe0: 0xb88628 FDE=(12092968, 12092994)
- +0xe8: 0xb88642 FDE=(12092994, 12093003)
- +0xf0: 0xb8864c FDE=(12093004, 12093026)
- +0xf8: 0xb88662 FDE=(12093026, 12093555)
- +0x100: 0x0 FDE=None
- +0x108: 0x0 FDE=None
- +0x110: 0xb88874 FDE=(12093556, 12093575)
- +0x118: 0xb88888 FDE=(12093576, 12093594)
- +0x120: 0xb8889a FDE=(12093594, 12093754)
- +0x128: 0xb8893a FDE=(12093754, 12093780)
- +0x130: 0xad6470 FDE=(11363440, 11363449)
- +0x138: 0xad647a FDE=(11363450, 11363472)
- +0x140: 0xb88954 FDE=(12093780, 12093792)
- +0x148: 0x0 FDE=None
- +0x150: 0x0 FDE=None
- +0x158: 0xb884d4 FDE=(12092628, 12092647)
- +0x160: 0xb884e8 FDE=(12092648, 12092666)
- +0x168: 0xb884fa FDE=(12092666, 12092712)
- +0x170: 0xb88528 FDE=(12092712, 12092749)

### AP 0x180de78 codeSlots=38
- +0x0: 0xb88ef6 FDE=(12095222, 12095248)
- +0x8: 0xb88f10 FDE=(12095248, 12095257)
- +0x10: 0xb88f1a FDE=(12095258, 12095280)
- +0x18: 0xb88f30 FDE=(12095280, 12095992)
- +0x20: 0x0 FDE=None
- +0x28: 0x0 FDE=None
- +0x30: 0xb88a44 FDE=(12094020, 12094039)
- +0x38: 0xb88a58 FDE=(12094040, 12094058)
- +0x40: 0xb88a6a FDE=(12094058, 12094218)
- +0x48: 0xb88b0a FDE=(12094218, 12094244)
- +0x50: 0xb88642 FDE=(12092994, 12093003)
- +0x58: 0xb8864c FDE=(12093004, 12093026)
- +0x60: 0xb88b24 FDE=(12094244, 12094628)
- +0x68: 0x0 FDE=None
- +0x70: 0x0 FDE=None
- +0x78: 0xb88ca4 FDE=(12094628, 12094647)
- +0x80: 0xb88cb8 FDE=(12094648, 12094666)
- +0x88: 0xb88cca FDE=(12094666, 12094826)
- +0x90: 0xb88d6a FDE=(12094826, 12094852)
- +0x98: 0xad6470 FDE=(11363440, 11363449)
- +0xa0: 0xad647a FDE=(11363450, 11363472)
- +0xa8: 0xb88954 FDE=(12093780, 12093792)
- +0xb0: 0x0 FDE=None
- +0xb8: 0x0 FDE=None
- +0xc0: 0xb88562 FDE=(12092770, 12092789)
- +0xc8: 0xb88576 FDE=(12092790, 12092808)
- +0xd0: 0xb88588 FDE=(12092808, 12092968)
- +0xd8: 0xb88628 FDE=(12092968, 12092994)
- +0xe0: 0xb88642 FDE=(12092994, 12093003)
- +0xe8: 0xb8864c FDE=(12093004, 12093026)
- +0xf0: 0xb88662 FDE=(12093026, 12093555)
- +0xf8: 0x0 FDE=None
- +0x100: 0x0 FDE=None
- +0x108: 0xb88874 FDE=(12093556, 12093575)
- +0x110: 0xb88888 FDE=(12093576, 12093594)
- +0x118: 0xb8889a FDE=(12093594, 12093754)
- +0x120: 0xb8893a FDE=(12093754, 12093780)
- +0x128: 0xad6470 FDE=(11363440, 11363449)
- +0x130: 0xad647a FDE=(11363450, 11363472)
- +0x138: 0xb88954 FDE=(12093780, 12093792)
- +0x140: 0x0 FDE=None
- +0x148: 0x0 FDE=None
- +0x150: 0xb884d4 FDE=(12092628, 12092647)
- +0x158: 0xb884e8 FDE=(12092648, 12092666)
- +0x160: 0xb884fa FDE=(12092666, 12092712)
- +0x168: 0xb88528 FDE=(12092712, 12092749)
- +0x170: 0xaae9b2 FDE=(11200946, 11200955)

### AP 0x180de80 codeSlots=38
- +0x0: 0xb88f10 FDE=(12095248, 12095257)
- +0x8: 0xb88f1a FDE=(12095258, 12095280)
- +0x10: 0xb88f30 FDE=(12095280, 12095992)
- +0x18: 0x0 FDE=None
- +0x20: 0x0 FDE=None
- +0x28: 0xb88a44 FDE=(12094020, 12094039)
- +0x30: 0xb88a58 FDE=(12094040, 12094058)
- +0x38: 0xb88a6a FDE=(12094058, 12094218)
- +0x40: 0xb88b0a FDE=(12094218, 12094244)
- +0x48: 0xb88642 FDE=(12092994, 12093003)
- +0x50: 0xb8864c FDE=(12093004, 12093026)
- +0x58: 0xb88b24 FDE=(12094244, 12094628)
- +0x60: 0x0 FDE=None
- +0x68: 0x0 FDE=None
- +0x70: 0xb88ca4 FDE=(12094628, 12094647)
- +0x78: 0xb88cb8 FDE=(12094648, 12094666)
- +0x80: 0xb88cca FDE=(12094666, 12094826)
- +0x88: 0xb88d6a FDE=(12094826, 12094852)
- +0x90: 0xad6470 FDE=(11363440, 11363449)
- +0x98: 0xad647a FDE=(11363450, 11363472)
- +0xa0: 0xb88954 FDE=(12093780, 12093792)
- +0xa8: 0x0 FDE=None
- +0xb0: 0x0 FDE=None
- +0xb8: 0xb88562 FDE=(12092770, 12092789)
- +0xc0: 0xb88576 FDE=(12092790, 12092808)
- +0xc8: 0xb88588 FDE=(12092808, 12092968)
- +0xd0: 0xb88628 FDE=(12092968, 12092994)
- +0xd8: 0xb88642 FDE=(12092994, 12093003)
- +0xe0: 0xb8864c FDE=(12093004, 12093026)
- +0xe8: 0xb88662 FDE=(12093026, 12093555)
- +0xf0: 0x0 FDE=None
- +0xf8: 0x0 FDE=None
- +0x100: 0xb88874 FDE=(12093556, 12093575)
- +0x108: 0xb88888 FDE=(12093576, 12093594)
- +0x110: 0xb8889a FDE=(12093594, 12093754)
- +0x118: 0xb8893a FDE=(12093754, 12093780)
- +0x120: 0xad6470 FDE=(11363440, 11363449)
- +0x128: 0xad647a FDE=(11363450, 11363472)
- +0x130: 0xb88954 FDE=(12093780, 12093792)
- +0x138: 0x0 FDE=None
- +0x140: 0x0 FDE=None
- +0x148: 0xb884d4 FDE=(12092628, 12092647)
- +0x150: 0xb884e8 FDE=(12092648, 12092666)
- +0x158: 0xb884fa FDE=(12092666, 12092712)
- +0x160: 0xb88528 FDE=(12092712, 12092749)
- +0x168: 0xaae9b2 FDE=(11200946, 11200955)
- +0x170: 0xaae9bc FDE=(11200956, 11200978)
#### +0x28 body
      b88a44:	48 8d 05 5d 54 c8 00 	lea    rax,[rip+0xc8545d]        # 180dea8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3b68>
      b88a4b:	48 89 07             	mov    QWORD PTR [rdi],rax
      b88a4e:	48 83 c7 10          	add    rdi,0x10
      b88a52:	e9 a5 f8 ff ff       	jmp    b882fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd529c>

### AP 0x180de88 codeSlots=37
- +0x0: 0xb88f1a FDE=(12095258, 12095280)
- +0x8: 0xb88f30 FDE=(12095280, 12095992)
- +0x10: 0x0 FDE=None
- +0x18: 0x0 FDE=None
- +0x20: 0xb88a44 FDE=(12094020, 12094039)
- +0x28: 0xb88a58 FDE=(12094040, 12094058)
- +0x30: 0xb88a6a FDE=(12094058, 12094218)
- +0x38: 0xb88b0a FDE=(12094218, 12094244)
- +0x40: 0xb88642 FDE=(12092994, 12093003)
- +0x48: 0xb8864c FDE=(12093004, 12093026)
- +0x50: 0xb88b24 FDE=(12094244, 12094628)
- +0x58: 0x0 FDE=None
- +0x60: 0x0 FDE=None
- +0x68: 0xb88ca4 FDE=(12094628, 12094647)
- +0x70: 0xb88cb8 FDE=(12094648, 12094666)
- +0x78: 0xb88cca FDE=(12094666, 12094826)
- +0x80: 0xb88d6a FDE=(12094826, 12094852)
- +0x88: 0xad6470 FDE=(11363440, 11363449)
- +0x90: 0xad647a FDE=(11363450, 11363472)
- +0x98: 0xb88954 FDE=(12093780, 12093792)
- +0xa0: 0x0 FDE=None
- +0xa8: 0x0 FDE=None
- +0xb0: 0xb88562 FDE=(12092770, 12092789)
- +0xb8: 0xb88576 FDE=(12092790, 12092808)
- +0xc0: 0xb88588 FDE=(12092808, 12092968)
- +0xc8: 0xb88628 FDE=(12092968, 12092994)
- +0xd0: 0xb88642 FDE=(12092994, 12093003)
- +0xd8: 0xb8864c FDE=(12093004, 12093026)
- +0xe0: 0xb88662 FDE=(12093026, 12093555)
- +0xe8: 0x0 FDE=None
- +0xf0: 0x0 FDE=None
- +0xf8: 0xb88874 FDE=(12093556, 12093575)
- +0x100: 0xb88888 FDE=(12093576, 12093594)
- +0x108: 0xb8889a FDE=(12093594, 12093754)
- +0x110: 0xb8893a FDE=(12093754, 12093780)
- +0x118: 0xad6470 FDE=(11363440, 11363449)
- +0x120: 0xad647a FDE=(11363450, 11363472)
- +0x128: 0xb88954 FDE=(12093780, 12093792)
- +0x130: 0x0 FDE=None
- +0x138: 0x0 FDE=None
- +0x140: 0xb884d4 FDE=(12092628, 12092647)
- +0x148: 0xb884e8 FDE=(12092648, 12092666)
- +0x150: 0xb884fa FDE=(12092666, 12092712)
- +0x158: 0xb88528 FDE=(12092712, 12092749)
- +0x160: 0xaae9b2 FDE=(11200946, 11200955)
- +0x168: 0xaae9bc FDE=(11200956, 11200978)
- +0x170: 0xb8854e FDE=(12092750, 12092769)
#### +0x28 body
      b88a58:	53                   	push   rbx
      b88a59:	48 89 fb             	mov    rbx,rdi
      b88a5c:	e8 e3 ff ff ff       	call   b88a44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd59e4>
      b88a61:	48 89 df             	mov    rdi,rbx
      b88a64:	5b                   	pop    rbx
      b88a65:	e9 b6 54 c6 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x180de90 codeSlots=36
- +0x0: 0xb88f30 FDE=(12095280, 12095992)
- +0x8: 0x0 FDE=None
- +0x10: 0x0 FDE=None
- +0x18: 0xb88a44 FDE=(12094020, 12094039)
- +0x20: 0xb88a58 FDE=(12094040, 12094058)
- +0x28: 0xb88a6a FDE=(12094058, 12094218)
- +0x30: 0xb88b0a FDE=(12094218, 12094244)
- +0x38: 0xb88642 FDE=(12092994, 12093003)
- +0x40: 0xb8864c FDE=(12093004, 12093026)
- +0x48: 0xb88b24 FDE=(12094244, 12094628)
- +0x50: 0x0 FDE=None
- +0x58: 0x0 FDE=None
- +0x60: 0xb88ca4 FDE=(12094628, 12094647)
- +0x68: 0xb88cb8 FDE=(12094648, 12094666)
- +0x70: 0xb88cca FDE=(12094666, 12094826)
- +0x78: 0xb88d6a FDE=(12094826, 12094852)
- +0x80: 0xad6470 FDE=(11363440, 11363449)
- +0x88: 0xad647a FDE=(11363450, 11363472)
- +0x90: 0xb88954 FDE=(12093780, 12093792)
- +0x98: 0x0 FDE=None
- +0xa0: 0x0 FDE=None
- +0xa8: 0xb88562 FDE=(12092770, 12092789)
- +0xb0: 0xb88576 FDE=(12092790, 12092808)
- +0xb8: 0xb88588 FDE=(12092808, 12092968)
- +0xc0: 0xb88628 FDE=(12092968, 12092994)
- +0xc8: 0xb88642 FDE=(12092994, 12093003)
- +0xd0: 0xb8864c FDE=(12093004, 12093026)
- +0xd8: 0xb88662 FDE=(12093026, 12093555)
- +0xe0: 0x0 FDE=None
- +0xe8: 0x0 FDE=None
- +0xf0: 0xb88874 FDE=(12093556, 12093575)
- +0xf8: 0xb88888 FDE=(12093576, 12093594)
- +0x100: 0xb8889a FDE=(12093594, 12093754)
- +0x108: 0xb8893a FDE=(12093754, 12093780)
- +0x110: 0xad6470 FDE=(11363440, 11363449)
- +0x118: 0xad647a FDE=(11363450, 11363472)
- +0x120: 0xb88954 FDE=(12093780, 12093792)
- +0x128: 0x0 FDE=None
- +0x130: 0x0 FDE=None
- +0x138: 0xb884d4 FDE=(12092628, 12092647)
- +0x140: 0xb884e8 FDE=(12092648, 12092666)
- +0x148: 0xb884fa FDE=(12092666, 12092712)
- +0x150: 0xb88528 FDE=(12092712, 12092749)
- +0x158: 0xaae9b2 FDE=(11200946, 11200955)
- +0x160: 0xaae9bc FDE=(11200956, 11200978)
- +0x168: 0xb8854e FDE=(12092750, 12092769)
- +0x170: 0x0 FDE=None
#### +0x28 body
      b88a6a:	41 56                	push   r14
      b88a6c:	53                   	push   rbx
      b88a6d:	48 83 ec 28          	sub    rsp,0x28
      b88a71:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b88a78:	00 00 
      b88a7a:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      b88a7f:	4c 8d 77 10          	lea    r14,[rdi+0x10]
      b88a83:	6a 70                	push   0x70
      b88a85:	5f                   	pop    rdi
      b88a86:	e8 75 54 c6 00       	call   17edf00 <_Znwm@plt>
      b88a8b:	48 89 c3             	mov    rbx,rax
      b88a8e:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      b88a92:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
      b88a97:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      b88a9c:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
      b88aa3:	00 00 
      b88aa5:	48 8d 05 fc 53 c8 00 	lea    rax,[rip+0xc853fc]        # 180dea8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3b68>
      b88aac:	48 89 03             	mov    QWORD PTR [rbx],rax
      b88aaf:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
      b88ab3:	4c 89 f6             	mov    rsi,r14
      b88ab6:	e8 c9 02 00 00       	call   b88d84 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5d24>
      b88abb:	48 89 e7             	mov    rdi,rsp
      b88abe:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      b88ac2:	e8 03 18 ef ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      b88ac7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b88ace:	00 00 
      b88ad0:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      b88ad5:	75 2e                	jne    b88b05 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5aa5>
      b88ad7:	48 89 d8             	mov    rax,rbx
      b88ada:	48 83 c4 28          	add    rsp,0x28
      b88ade:	5b                   	pop    rbx
      b88adf:	41 5e                	pop    r14
      b88ae1:	c3                   	ret
      b88ae2:	48 89 c3             	mov    rbx,rax
      b88ae5:	48 89 e7             	mov    rdi,rsp
      b88ae8:	e8 dd 17 ef ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      b88aed:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b88af4:	00 00 
      b88af6:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      b88afb:	75 08                	jne    b88b05 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5aa5>
      b88afd:	48 89 df             	mov    rdi,rbx
      b88b00:	e8 cb 71 ee ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      b88b05:	e8 a6 6f c6 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x180de98 codeSlots=36
- +0x0: 0x0 FDE=None
- +0x8: 0x0 FDE=None
- +0x10: 0xb88a44 FDE=(12094020, 12094039)
- +0x18: 0xb88a58 FDE=(12094040, 12094058)
- +0x20: 0xb88a6a FDE=(12094058, 12094218)
- +0x28: 0xb88b0a FDE=(12094218, 12094244)
- +0x30: 0xb88642 FDE=(12092994, 12093003)
- +0x38: 0xb8864c FDE=(12093004, 12093026)
- +0x40: 0xb88b24 FDE=(12094244, 12094628)
- +0x48: 0x0 FDE=None
- +0x50: 0x0 FDE=None
- +0x58: 0xb88ca4 FDE=(12094628, 12094647)
- +0x60: 0xb88cb8 FDE=(12094648, 12094666)
- +0x68: 0xb88cca FDE=(12094666, 12094826)
- +0x70: 0xb88d6a FDE=(12094826, 12094852)
- +0x78: 0xad6470 FDE=(11363440, 11363449)
- +0x80: 0xad647a FDE=(11363450, 11363472)
- +0x88: 0xb88954 FDE=(12093780, 12093792)
- +0x90: 0x0 FDE=None
- +0x98: 0x0 FDE=None
- +0xa0: 0xb88562 FDE=(12092770, 12092789)
- +0xa8: 0xb88576 FDE=(12092790, 12092808)
- +0xb0: 0xb88588 FDE=(12092808, 12092968)
- +0xb8: 0xb88628 FDE=(12092968, 12092994)
- +0xc0: 0xb88642 FDE=(12092994, 12093003)
- +0xc8: 0xb8864c FDE=(12093004, 12093026)
- +0xd0: 0xb88662 FDE=(12093026, 12093555)
- +0xd8: 0x0 FDE=None
- +0xe0: 0x0 FDE=None
- +0xe8: 0xb88874 FDE=(12093556, 12093575)
- +0xf0: 0xb88888 FDE=(12093576, 12093594)
- +0xf8: 0xb8889a FDE=(12093594, 12093754)
- +0x100: 0xb8893a FDE=(12093754, 12093780)
- +0x108: 0xad6470 FDE=(11363440, 11363449)
- +0x110: 0xad647a FDE=(11363450, 11363472)
- +0x118: 0xb88954 FDE=(12093780, 12093792)
- +0x120: 0x0 FDE=None
- +0x128: 0x0 FDE=None
- +0x130: 0xb884d4 FDE=(12092628, 12092647)
- +0x138: 0xb884e8 FDE=(12092648, 12092666)
- +0x140: 0xb884fa FDE=(12092666, 12092712)
- +0x148: 0xb88528 FDE=(12092712, 12092749)
- +0x150: 0xaae9b2 FDE=(11200946, 11200955)
- +0x158: 0xaae9bc FDE=(11200956, 11200978)
- +0x160: 0xb8854e FDE=(12092750, 12092769)
- +0x168: 0x0 FDE=None
- +0x170: 0x0 FDE=None
#### +0x28 body
      b88b0a:	48 8d 47 10          	lea    rax,[rdi+0x10]
      b88b0e:	48 8d 0d 93 53 c8 00 	lea    rcx,[rip+0xc85393]        # 180dea8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3b68>
      b88b15:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      b88b18:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
      b88b1c:	48 89 c6             	mov    rsi,rax
      b88b1f:	e9 60 02 00 00       	jmp    b88d84 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5d24>

### AP 0x180dea0 codeSlots=37
- +0x0: 0x0 FDE=None
- +0x8: 0xb88a44 FDE=(12094020, 12094039)
- +0x10: 0xb88a58 FDE=(12094040, 12094058)
- +0x18: 0xb88a6a FDE=(12094058, 12094218)
- +0x20: 0xb88b0a FDE=(12094218, 12094244)
- +0x28: 0xb88642 FDE=(12092994, 12093003)
- +0x30: 0xb8864c FDE=(12093004, 12093026)
- +0x38: 0xb88b24 FDE=(12094244, 12094628)
- +0x40: 0x0 FDE=None
- +0x48: 0x0 FDE=None
- +0x50: 0xb88ca4 FDE=(12094628, 12094647)
- +0x58: 0xb88cb8 FDE=(12094648, 12094666)
- +0x60: 0xb88cca FDE=(12094666, 12094826)
- +0x68: 0xb88d6a FDE=(12094826, 12094852)
- +0x70: 0xad6470 FDE=(11363440, 11363449)
- +0x78: 0xad647a FDE=(11363450, 11363472)
- +0x80: 0xb88954 FDE=(12093780, 12093792)
- +0x88: 0x0 FDE=None
- +0x90: 0x0 FDE=None
- +0x98: 0xb88562 FDE=(12092770, 12092789)
- +0xa0: 0xb88576 FDE=(12092790, 12092808)
- +0xa8: 0xb88588 FDE=(12092808, 12092968)
- +0xb0: 0xb88628 FDE=(12092968, 12092994)
- +0xb8: 0xb88642 FDE=(12092994, 12093003)
- +0xc0: 0xb8864c FDE=(12093004, 12093026)
- +0xc8: 0xb88662 FDE=(12093026, 12093555)
- +0xd0: 0x0 FDE=None
- +0xd8: 0x0 FDE=None
- +0xe0: 0xb88874 FDE=(12093556, 12093575)
- +0xe8: 0xb88888 FDE=(12093576, 12093594)
- +0xf0: 0xb8889a FDE=(12093594, 12093754)
- +0xf8: 0xb8893a FDE=(12093754, 12093780)
- +0x100: 0xad6470 FDE=(11363440, 11363449)
- +0x108: 0xad647a FDE=(11363450, 11363472)
- +0x110: 0xb88954 FDE=(12093780, 12093792)
- +0x118: 0x0 FDE=None
- +0x120: 0x0 FDE=None
- +0x128: 0xb884d4 FDE=(12092628, 12092647)
- +0x130: 0xb884e8 FDE=(12092648, 12092666)
- +0x138: 0xb884fa FDE=(12092666, 12092712)
- +0x140: 0xb88528 FDE=(12092712, 12092749)
- +0x148: 0xaae9b2 FDE=(11200946, 11200955)
- +0x150: 0xaae9bc FDE=(11200956, 11200978)
- +0x158: 0xb8854e FDE=(12092750, 12092769)
- +0x160: 0x0 FDE=None
- +0x168: 0x0 FDE=None
- +0x170: 0xb8ac2a FDE=(12102698, 12102854)
#### +0x28 body
      b88642:	48 83 c7 10          	add    rdi,0x10
      b88646:	e9 b1 fc ff ff       	jmp    b882fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd529c>

### AP 0x180dea8 codeSlots=38
- +0x0: 0xb88a44 FDE=(12094020, 12094039)
- +0x8: 0xb88a58 FDE=(12094040, 12094058)
- +0x10: 0xb88a6a FDE=(12094058, 12094218)
- +0x18: 0xb88b0a FDE=(12094218, 12094244)
- +0x20: 0xb88642 FDE=(12092994, 12093003)
- +0x28: 0xb8864c FDE=(12093004, 12093026)
- +0x30: 0xb88b24 FDE=(12094244, 12094628)
- +0x38: 0x0 FDE=None
- +0x40: 0x0 FDE=None
- +0x48: 0xb88ca4 FDE=(12094628, 12094647)
- +0x50: 0xb88cb8 FDE=(12094648, 12094666)
- +0x58: 0xb88cca FDE=(12094666, 12094826)
- +0x60: 0xb88d6a FDE=(12094826, 12094852)
- +0x68: 0xad6470 FDE=(11363440, 11363449)
- +0x70: 0xad647a FDE=(11363450, 11363472)
- +0x78: 0xb88954 FDE=(12093780, 12093792)
- +0x80: 0x0 FDE=None
- +0x88: 0x0 FDE=None
- +0x90: 0xb88562 FDE=(12092770, 12092789)
- +0x98: 0xb88576 FDE=(12092790, 12092808)
- +0xa0: 0xb88588 FDE=(12092808, 12092968)
- +0xa8: 0xb88628 FDE=(12092968, 12092994)
- +0xb0: 0xb88642 FDE=(12092994, 12093003)
- +0xb8: 0xb8864c FDE=(12093004, 12093026)
- +0xc0: 0xb88662 FDE=(12093026, 12093555)
- +0xc8: 0x0 FDE=None
- +0xd0: 0x0 FDE=None
- +0xd8: 0xb88874 FDE=(12093556, 12093575)
- +0xe0: 0xb88888 FDE=(12093576, 12093594)
- +0xe8: 0xb8889a FDE=(12093594, 12093754)
- +0xf0: 0xb8893a FDE=(12093754, 12093780)
- +0xf8: 0xad6470 FDE=(11363440, 11363449)
- +0x100: 0xad647a FDE=(11363450, 11363472)
- +0x108: 0xb88954 FDE=(12093780, 12093792)
- +0x110: 0x0 FDE=None
- +0x118: 0x0 FDE=None
- +0x120: 0xb884d4 FDE=(12092628, 12092647)
- +0x128: 0xb884e8 FDE=(12092648, 12092666)
- +0x130: 0xb884fa FDE=(12092666, 12092712)
- +0x138: 0xb88528 FDE=(12092712, 12092749)
- +0x140: 0xaae9b2 FDE=(11200946, 11200955)
- +0x148: 0xaae9bc FDE=(11200956, 11200978)
- +0x150: 0xb8854e FDE=(12092750, 12092769)
- +0x158: 0x0 FDE=None
- +0x160: 0x0 FDE=None
- +0x168: 0xb8ac2a FDE=(12102698, 12102854)
- +0x170: 0xb8acc6 FDE=(12102854, 12102872)
#### +0x28 body
      b8864c:	53                   	push   rbx
      b8864d:	48 89 fb             	mov    rbx,rdi
      b88650:	48 83 c7 10          	add    rdi,0x10
      b88654:	e8 a3 fc ff ff       	call   b882fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd529c>
      b88659:	48 89 df             	mov    rdi,rbx
      b8865c:	5b                   	pop    rbx
      b8865d:	e9 be 58 c6 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x180deb0 codeSlots=38
- +0x0: 0xb88a58 FDE=(12094040, 12094058)
- +0x8: 0xb88a6a FDE=(12094058, 12094218)
- +0x10: 0xb88b0a FDE=(12094218, 12094244)
- +0x18: 0xb88642 FDE=(12092994, 12093003)
- +0x20: 0xb8864c FDE=(12093004, 12093026)
- +0x28: 0xb88b24 FDE=(12094244, 12094628)
- +0x30: 0x0 FDE=None
- +0x38: 0x0 FDE=None
- +0x40: 0xb88ca4 FDE=(12094628, 12094647)
- +0x48: 0xb88cb8 FDE=(12094648, 12094666)
- +0x50: 0xb88cca FDE=(12094666, 12094826)
- +0x58: 0xb88d6a FDE=(12094826, 12094852)
- +0x60: 0xad6470 FDE=(11363440, 11363449)
- +0x68: 0xad647a FDE=(11363450, 11363472)
- +0x70: 0xb88954 FDE=(12093780, 12093792)
- +0x78: 0x0 FDE=None
- +0x80: 0x0 FDE=None
- +0x88: 0xb88562 FDE=(12092770, 12092789)
- +0x90: 0xb88576 FDE=(12092790, 12092808)
- +0x98: 0xb88588 FDE=(12092808, 12092968)
- +0xa0: 0xb88628 FDE=(12092968, 12092994)
- +0xa8: 0xb88642 FDE=(12092994, 12093003)
- +0xb0: 0xb8864c FDE=(12093004, 12093026)
- +0xb8: 0xb88662 FDE=(12093026, 12093555)
- +0xc0: 0x0 FDE=None
- +0xc8: 0x0 FDE=None
- +0xd0: 0xb88874 FDE=(12093556, 12093575)
- +0xd8: 0xb88888 FDE=(12093576, 12093594)
- +0xe0: 0xb8889a FDE=(12093594, 12093754)
- +0xe8: 0xb8893a FDE=(12093754, 12093780)
- +0xf0: 0xad6470 FDE=(11363440, 11363449)
- +0xf8: 0xad647a FDE=(11363450, 11363472)
- +0x100: 0xb88954 FDE=(12093780, 12093792)
- +0x108: 0x0 FDE=None
- +0x110: 0x0 FDE=None
- +0x118: 0xb884d4 FDE=(12092628, 12092647)
- +0x120: 0xb884e8 FDE=(12092648, 12092666)
- +0x128: 0xb884fa FDE=(12092666, 12092712)
- +0x130: 0xb88528 FDE=(12092712, 12092749)
- +0x138: 0xaae9b2 FDE=(11200946, 11200955)
- +0x140: 0xaae9bc FDE=(11200956, 11200978)
- +0x148: 0xb8854e FDE=(12092750, 12092769)
- +0x150: 0x0 FDE=None
- +0x158: 0x0 FDE=None
- +0x160: 0xb8ac2a FDE=(12102698, 12102854)
- +0x168: 0xb8acc6 FDE=(12102854, 12102872)
- +0x170: 0xb8acd8 FDE=(12102872, 12102977)
#### +0x28 body
      b88b24:	55                   	push   rbp
      b88b25:	41 57                	push   r15
      b88b27:	41 56                	push   r14
      b88b29:	41 55                	push   r13
      b88b2b:	41 54                	push   r12
      b88b2d:	53                   	push   rbx
      b88b2e:	48 81 ec a8 00 00 00 	sub    rsp,0xa8
      b88b35:	49 89 f7             	mov    r15,rsi
      b88b38:	49 89 fe             	mov    r14,rdi
      b88b3b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b88b42:	00 00 
      b88b44:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
      b88b4b:	00 
      b88b4c:	48 83 c6 40          	add    rsi,0x40
      b88b50:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      b88b55:	e8 36 17 ef ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      b88b5a:	bf 60 02 00 00       	mov    edi,0x260
      b88b5f:	e8 9c 53 c6 00       	call   17edf00 <_Znwm@plt>
      b88b64:	48 89 c3             	mov    rbx,rax
      b88b67:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
      b88b6c:	0f 57 c0             	xorps  xmm0,xmm0
      b88b6f:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      b88b73:	48 8d 05 4e 22 c8 00 	lea    rax,[rip+0xc8224e]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
      b88b7a:	48 89 03             	mov    QWORD PTR [rbx],rax
      b88b7d:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      b88b82:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
      b88b87:	e8 2c f7 ff ff       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
      b88b8c:	48 83 a4 24 90 00 00 	and    QWORD PTR [rsp+0x90],0x0
      b88b93:	00 00 
      b88b95:	6a 40                	push   0x40
      b88b97:	5f                   	pop    rdi
      b88b98:	e8 63 53 c6 00       	call   17edf00 <_Znwm@plt>
      b88b9d:	49 89 c5             	mov    r13,rax
      b88ba0:	49 8d 6f 10          	lea    rbp,[r15+0x10]
      b88ba4:	4d 8d 77 20          	lea    r14,[r15+0x20]
      b88ba8:	49 83 c7 30          	add    r15,0x30
      b88bac:	49 89 dc             	mov    r12,rbx
      b88baf:	49 83 c4 20          	add    r12,0x20
      b88bb3:	48 8d 05 36 53 c8 00 	lea    rax,[rip+0xc85336]        # 180def0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3bb0>
      b88bba:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      b88bbe:	4c 89 ef             	mov    rdi,r13
      b88bc1:	48 83 c7 10          	add    rdi,0x10
      b88bc5:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
      b88bca:	e8 e9 f6 ff ff       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
      b88bcf:	4c 8d 44 24 70       	lea    r8,[rsp+0x70]
      b88bd4:	4d 89 68 20          	mov    QWORD PTR [r8+0x20],r13
      b88bd8:	4c 89 e7             	mov    rdi,r12
      b88bdb:	48 89 ee             	mov    rsi,rbp
      b88bde:	4c 89 f2             	mov    rdx,r14
      b88be1:	4c 89 f9             	mov    rcx,r15
      b88be4:	e8 d3 44 96 00       	call   14ed0bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x332640>
      b88be9:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      b88bee:	e8 77 13 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b88bf3:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      b88bf8:	e8 6d 13 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b88bfd:	31 ff                	xor    edi,edi
      b88bff:	e8 18 58 f1 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      b88c04:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      b88c09:	e8 5c 13 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b88c0e:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
      b88c13:	4d 89 26             	mov    QWORD PTR [r14],r12
      b88c16:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
      b88c1a:	31 ff                	xor    edi,edi
      b88c1c:	e8 65 58 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b88c21:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b88c28:	00 00 
      b88c2a:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
      b88c31:	00 
      b88c32:	75 6b                	jne    b88c9f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5c3f>
      b88c34:	4c 89 f0             	mov    rax,r14
      b88c37:	48 81 c4 a8 00 00 00 	add    rsp,0xa8
      b88c3e:	5b                   	pop    rbx
      b88c3f:	41 5c                	pop    r12
      b88c41:	41 5d                	pop    r13
      b88c43:	41 5e                	pop    r14
      b88c45:	41 5f                	pop    r15
      b88c47:	5d                   	pop    rbp
      b88c48:	c3                   	ret
      b88c49:	49 89 c6             	mov    r14,rax
      b88c4c:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      b88c51:	e8 14 13 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b88c56:	eb 03                	jmp    b88c5b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5bfb>
      b88c58:	49 89 c6             	mov    r14,rax
      b88c5b:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      b88c60:	e8 05 13 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b88c65:	48 89 df             	mov    rdi,rbx
      b88c68:	e8 a3 53 c6 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      b88c6d:	48 89 df             	mov    rdi,rbx
      b88c70:	e8 a7 57 f1 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      b88c75:	eb 03                	jmp    b88c7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5c1a>
      b88c77:	49 89 c6             	mov    r14,rax
      b88c7a:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      b88c7f:	e8 e6 12 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b88c84:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b88c8b:	00 00 
      b88c8d:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
      b88c94:	00 
      b88c95:	75 08                	jne    b88c9f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5c3f>
      b88c97:	4c 89 f7             	mov    rdi,r14
      b88c9a:	e8 31 70 ee ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      b88c9f:	e8 0c 6e c6 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x180deb8 codeSlots=38
- +0x0: 0xb88a6a FDE=(12094058, 12094218)
- +0x8: 0xb88b0a FDE=(12094218, 12094244)
- +0x10: 0xb88642 FDE=(12092994, 12093003)
- +0x18: 0xb8864c FDE=(12093004, 12093026)
- +0x20: 0xb88b24 FDE=(12094244, 12094628)
- +0x28: 0x0 FDE=None
- +0x30: 0x0 FDE=None
- +0x38: 0xb88ca4 FDE=(12094628, 12094647)
- +0x40: 0xb88cb8 FDE=(12094648, 12094666)
- +0x48: 0xb88cca FDE=(12094666, 12094826)
- +0x50: 0xb88d6a FDE=(12094826, 12094852)
- +0x58: 0xad6470 FDE=(11363440, 11363449)
- +0x60: 0xad647a FDE=(11363450, 11363472)
- +0x68: 0xb88954 FDE=(12093780, 12093792)
- +0x70: 0x0 FDE=None
- +0x78: 0x0 FDE=None
- +0x80: 0xb88562 FDE=(12092770, 12092789)
- +0x88: 0xb88576 FDE=(12092790, 12092808)
- +0x90: 0xb88588 FDE=(12092808, 12092968)
- +0x98: 0xb88628 FDE=(12092968, 12092994)
- +0xa0: 0xb88642 FDE=(12092994, 12093003)
- +0xa8: 0xb8864c FDE=(12093004, 12093026)
- +0xb0: 0xb88662 FDE=(12093026, 12093555)
- +0xb8: 0x0 FDE=None
- +0xc0: 0x0 FDE=None
- +0xc8: 0xb88874 FDE=(12093556, 12093575)
- +0xd0: 0xb88888 FDE=(12093576, 12093594)
- +0xd8: 0xb8889a FDE=(12093594, 12093754)
- +0xe0: 0xb8893a FDE=(12093754, 12093780)
- +0xe8: 0xad6470 FDE=(11363440, 11363449)
- +0xf0: 0xad647a FDE=(11363450, 11363472)
- +0xf8: 0xb88954 FDE=(12093780, 12093792)
- +0x100: 0x0 FDE=None
- +0x108: 0x0 FDE=None
- +0x110: 0xb884d4 FDE=(12092628, 12092647)
- +0x118: 0xb884e8 FDE=(12092648, 12092666)
- +0x120: 0xb884fa FDE=(12092666, 12092712)
- +0x128: 0xb88528 FDE=(12092712, 12092749)
- +0x130: 0xaae9b2 FDE=(11200946, 11200955)
- +0x138: 0xaae9bc FDE=(11200956, 11200978)
- +0x140: 0xb8854e FDE=(12092750, 12092769)
- +0x148: 0x0 FDE=None
- +0x150: 0x0 FDE=None
- +0x158: 0xb8ac2a FDE=(12102698, 12102854)
- +0x160: 0xb8acc6 FDE=(12102854, 12102872)
- +0x168: 0xb8acd8 FDE=(12102872, 12102977)
- +0x170: 0xb5f12c FDE=(11923756, 11923864)

### AP 0x180dec0 codeSlots=38
- +0x0: 0xb88b0a FDE=(12094218, 12094244)
- +0x8: 0xb88642 FDE=(12092994, 12093003)
- +0x10: 0xb8864c FDE=(12093004, 12093026)
- +0x18: 0xb88b24 FDE=(12094244, 12094628)
- +0x20: 0x0 FDE=None
- +0x28: 0x0 FDE=None
- +0x30: 0xb88ca4 FDE=(12094628, 12094647)
- +0x38: 0xb88cb8 FDE=(12094648, 12094666)
- +0x40: 0xb88cca FDE=(12094666, 12094826)
- +0x48: 0xb88d6a FDE=(12094826, 12094852)
- +0x50: 0xad6470 FDE=(11363440, 11363449)
- +0x58: 0xad647a FDE=(11363450, 11363472)
- +0x60: 0xb88954 FDE=(12093780, 12093792)
- +0x68: 0x0 FDE=None
- +0x70: 0x0 FDE=None
- +0x78: 0xb88562 FDE=(12092770, 12092789)
- +0x80: 0xb88576 FDE=(12092790, 12092808)
- +0x88: 0xb88588 FDE=(12092808, 12092968)
- +0x90: 0xb88628 FDE=(12092968, 12092994)
- +0x98: 0xb88642 FDE=(12092994, 12093003)
- +0xa0: 0xb8864c FDE=(12093004, 12093026)
- +0xa8: 0xb88662 FDE=(12093026, 12093555)
- +0xb0: 0x0 FDE=None
- +0xb8: 0x0 FDE=None
- +0xc0: 0xb88874 FDE=(12093556, 12093575)
- +0xc8: 0xb88888 FDE=(12093576, 12093594)
- +0xd0: 0xb8889a FDE=(12093594, 12093754)
- +0xd8: 0xb8893a FDE=(12093754, 12093780)
- +0xe0: 0xad6470 FDE=(11363440, 11363449)
- +0xe8: 0xad647a FDE=(11363450, 11363472)
- +0xf0: 0xb88954 FDE=(12093780, 12093792)
- +0xf8: 0x0 FDE=None
- +0x100: 0x0 FDE=None
- +0x108: 0xb884d4 FDE=(12092628, 12092647)
- +0x110: 0xb884e8 FDE=(12092648, 12092666)
- +0x118: 0xb884fa FDE=(12092666, 12092712)
- +0x120: 0xb88528 FDE=(12092712, 12092749)
- +0x128: 0xaae9b2 FDE=(11200946, 11200955)
- +0x130: 0xaae9bc FDE=(11200956, 11200978)
- +0x138: 0xb8854e FDE=(12092750, 12092769)
- +0x140: 0x0 FDE=None
- +0x148: 0x0 FDE=None
- +0x150: 0xb8ac2a FDE=(12102698, 12102854)
- +0x158: 0xb8acc6 FDE=(12102854, 12102872)
- +0x160: 0xb8acd8 FDE=(12102872, 12102977)
- +0x168: 0xb5f12c FDE=(11923756, 11923864)
- +0x170: 0xb8ad42 FDE=(12102978, 12103086)

### AP 0x180dec8 codeSlots=38
- +0x0: 0xb88642 FDE=(12092994, 12093003)
- +0x8: 0xb8864c FDE=(12093004, 12093026)
- +0x10: 0xb88b24 FDE=(12094244, 12094628)
- +0x18: 0x0 FDE=None
- +0x20: 0x0 FDE=None
- +0x28: 0xb88ca4 FDE=(12094628, 12094647)
- +0x30: 0xb88cb8 FDE=(12094648, 12094666)
- +0x38: 0xb88cca FDE=(12094666, 12094826)
- +0x40: 0xb88d6a FDE=(12094826, 12094852)
- +0x48: 0xad6470 FDE=(11363440, 11363449)
- +0x50: 0xad647a FDE=(11363450, 11363472)
- +0x58: 0xb88954 FDE=(12093780, 12093792)
- +0x60: 0x0 FDE=None
- +0x68: 0x0 FDE=None
- +0x70: 0xb88562 FDE=(12092770, 12092789)
- +0x78: 0xb88576 FDE=(12092790, 12092808)
- +0x80: 0xb88588 FDE=(12092808, 12092968)
- +0x88: 0xb88628 FDE=(12092968, 12092994)
- +0x90: 0xb88642 FDE=(12092994, 12093003)
- +0x98: 0xb8864c FDE=(12093004, 12093026)
- +0xa0: 0xb88662 FDE=(12093026, 12093555)
- +0xa8: 0x0 FDE=None
- +0xb0: 0x0 FDE=None
- +0xb8: 0xb88874 FDE=(12093556, 12093575)
- +0xc0: 0xb88888 FDE=(12093576, 12093594)
- +0xc8: 0xb8889a FDE=(12093594, 12093754)
- +0xd0: 0xb8893a FDE=(12093754, 12093780)
- +0xd8: 0xad6470 FDE=(11363440, 11363449)
- +0xe0: 0xad647a FDE=(11363450, 11363472)
- +0xe8: 0xb88954 FDE=(12093780, 12093792)
- +0xf0: 0x0 FDE=None
- +0xf8: 0x0 FDE=None
- +0x100: 0xb884d4 FDE=(12092628, 12092647)
- +0x108: 0xb884e8 FDE=(12092648, 12092666)
- +0x110: 0xb884fa FDE=(12092666, 12092712)
- +0x118: 0xb88528 FDE=(12092712, 12092749)
- +0x120: 0xaae9b2 FDE=(11200946, 11200955)
- +0x128: 0xaae9bc FDE=(11200956, 11200978)
- +0x130: 0xb8854e FDE=(12092750, 12092769)
- +0x138: 0x0 FDE=None
- +0x140: 0x0 FDE=None
- +0x148: 0xb8ac2a FDE=(12102698, 12102854)
- +0x150: 0xb8acc6 FDE=(12102854, 12102872)
- +0x158: 0xb8acd8 FDE=(12102872, 12102977)
- +0x160: 0xb5f12c FDE=(11923756, 11923864)
- +0x168: 0xb8ad42 FDE=(12102978, 12103086)
- +0x170: 0xb8adae FDE=(12103086, 12103194)
#### +0x28 body
      b88ca4:	48 8d 05 45 52 c8 00 	lea    rax,[rip+0xc85245]        # 180def0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3bb0>
      b88cab:	48 89 07             	mov    QWORD PTR [rdi],rax
      b88cae:	48 83 c7 10          	add    rdi,0x10
      b88cb2:	e9 b3 12 ef ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>

### AP 0x180df18 codeSlots=38
- +0x0: 0xad647a FDE=(11363450, 11363472)
- +0x8: 0xb88954 FDE=(12093780, 12093792)
- +0x10: 0x0 FDE=None
- +0x18: 0x0 FDE=None
- +0x20: 0xb88562 FDE=(12092770, 12092789)
- +0x28: 0xb88576 FDE=(12092790, 12092808)
- +0x30: 0xb88588 FDE=(12092808, 12092968)
- +0x38: 0xb88628 FDE=(12092968, 12092994)
- +0x40: 0xb88642 FDE=(12092994, 12093003)
- +0x48: 0xb8864c FDE=(12093004, 12093026)
- +0x50: 0xb88662 FDE=(12093026, 12093555)
- +0x58: 0x0 FDE=None
- +0x60: 0x0 FDE=None
- +0x68: 0xb88874 FDE=(12093556, 12093575)
- +0x70: 0xb88888 FDE=(12093576, 12093594)
- +0x78: 0xb8889a FDE=(12093594, 12093754)
- +0x80: 0xb8893a FDE=(12093754, 12093780)
- +0x88: 0xad6470 FDE=(11363440, 11363449)
- +0x90: 0xad647a FDE=(11363450, 11363472)
- +0x98: 0xb88954 FDE=(12093780, 12093792)
- +0xa0: 0x0 FDE=None
- +0xa8: 0x0 FDE=None
- +0xb0: 0xb884d4 FDE=(12092628, 12092647)
- +0xb8: 0xb884e8 FDE=(12092648, 12092666)
- +0xc0: 0xb884fa FDE=(12092666, 12092712)
- +0xc8: 0xb88528 FDE=(12092712, 12092749)
- +0xd0: 0xaae9b2 FDE=(11200946, 11200955)
- +0xd8: 0xaae9bc FDE=(11200956, 11200978)
- +0xe0: 0xb8854e FDE=(12092750, 12092769)
- +0xe8: 0x0 FDE=None
- +0xf0: 0x0 FDE=None
- +0xf8: 0xb8ac2a FDE=(12102698, 12102854)
- +0x100: 0xb8acc6 FDE=(12102854, 12102872)
- +0x108: 0xb8acd8 FDE=(12102872, 12102977)
- +0x110: 0xb5f12c FDE=(11923756, 11923864)
- +0x118: 0xb8ad42 FDE=(12102978, 12103086)
- +0x120: 0xb8adae FDE=(12103086, 12103194)
- +0x128: 0xb8ae1a FDE=(12103194, 12103302)
- +0x130: 0xb8ae86 FDE=(12103302, 12103410)
- +0x138: 0xb8aef2 FDE=(12103410, 12103518)
- +0x140: 0xb8af5e FDE=(12103518, 12103626)
- +0x148: 0xb8afca FDE=(12103626, 12103648)
- +0x150: 0xb8afe0 FDE=(12103648, 12103704)
- +0x158: 0xb8b018 FDE=(12103704, 12103760)
- +0x160: 0x0 FDE=None
- +0x168: 0x0 FDE=None
- +0x170: 0x9d7de0 FDE=(10321376, 10321377)
#### +0x28 body
      b88576:	53                   	push   rbx
      b88577:	48 89 fb             	mov    rbx,rdi
      b8857a:	e8 e3 ff ff ff       	call   b88562 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5502>
      b8857f:	48 89 df             	mov    rdi,rbx
      b88582:	5b                   	pop    rbx
      b88583:	e9 98 59 c6 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x180df20 codeSlots=38
- +0x0: 0xb88954 FDE=(12093780, 12093792)
- +0x8: 0x0 FDE=None
- +0x10: 0x0 FDE=None
- +0x18: 0xb88562 FDE=(12092770, 12092789)
- +0x20: 0xb88576 FDE=(12092790, 12092808)
- +0x28: 0xb88588 FDE=(12092808, 12092968)
- +0x30: 0xb88628 FDE=(12092968, 12092994)
- +0x38: 0xb88642 FDE=(12092994, 12093003)
- +0x40: 0xb8864c FDE=(12093004, 12093026)
- +0x48: 0xb88662 FDE=(12093026, 12093555)
- +0x50: 0x0 FDE=None
- +0x58: 0x0 FDE=None
- +0x60: 0xb88874 FDE=(12093556, 12093575)
- +0x68: 0xb88888 FDE=(12093576, 12093594)
- +0x70: 0xb8889a FDE=(12093594, 12093754)
- +0x78: 0xb8893a FDE=(12093754, 12093780)
- +0x80: 0xad6470 FDE=(11363440, 11363449)
- +0x88: 0xad647a FDE=(11363450, 11363472)
- +0x90: 0xb88954 FDE=(12093780, 12093792)
- +0x98: 0x0 FDE=None
- +0xa0: 0x0 FDE=None
- +0xa8: 0xb884d4 FDE=(12092628, 12092647)
- +0xb0: 0xb884e8 FDE=(12092648, 12092666)
- +0xb8: 0xb884fa FDE=(12092666, 12092712)
- +0xc0: 0xb88528 FDE=(12092712, 12092749)
- +0xc8: 0xaae9b2 FDE=(11200946, 11200955)
- +0xd0: 0xaae9bc FDE=(11200956, 11200978)
- +0xd8: 0xb8854e FDE=(12092750, 12092769)
- +0xe0: 0x0 FDE=None
- +0xe8: 0x0 FDE=None
- +0xf0: 0xb8ac2a FDE=(12102698, 12102854)
- +0xf8: 0xb8acc6 FDE=(12102854, 12102872)
- +0x100: 0xb8acd8 FDE=(12102872, 12102977)
- +0x108: 0xb5f12c FDE=(11923756, 11923864)
- +0x110: 0xb8ad42 FDE=(12102978, 12103086)
- +0x118: 0xb8adae FDE=(12103086, 12103194)
- +0x120: 0xb8ae1a FDE=(12103194, 12103302)
- +0x128: 0xb8ae86 FDE=(12103302, 12103410)
- +0x130: 0xb8aef2 FDE=(12103410, 12103518)
- +0x138: 0xb8af5e FDE=(12103518, 12103626)
- +0x140: 0xb8afca FDE=(12103626, 12103648)
- +0x148: 0xb8afe0 FDE=(12103648, 12103704)
- +0x150: 0xb8b018 FDE=(12103704, 12103760)
- +0x158: 0x0 FDE=None
- +0x160: 0x0 FDE=None
- +0x168: 0x9d7de0 FDE=(10321376, 10321377)
- +0x170: 0xa50370 FDE=(10814320, 10814325)
#### +0x28 body
      b88588:	41 56                	push   r14
      b8858a:	53                   	push   rbx
      b8858b:	48 83 ec 28          	sub    rsp,0x28
      b8858f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b88596:	00 00 
      b88598:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      b8859d:	4c 8d 77 10          	lea    r14,[rdi+0x10]
      b885a1:	6a 70                	push   0x70
      b885a3:	5f                   	pop    rdi
      b885a4:	e8 57 59 c6 00       	call   17edf00 <_Znwm@plt>
      b885a9:	48 89 c3             	mov    rbx,rax
      b885ac:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      b885b0:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
      b885b5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      b885ba:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
      b885c1:	00 00 
      b885c3:	48 8d 05 6e 59 c8 00 	lea    rax,[rip+0xc8596e]        # 180df38 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3bf8>
      b885ca:	48 89 03             	mov    QWORD PTR [rbx],rax
      b885cd:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
      b885d1:	4c 89 f6             	mov    rsi,r14
      b885d4:	e8 dd 03 00 00       	call   b889b6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5956>
      b885d9:	48 89 e7             	mov    rdi,rsp
      b885dc:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      b885e0:	e8 e5 1c ef ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      b885e5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b885ec:	00 00 
      b885ee:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      b885f3:	75 2e                	jne    b88623 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd55c3>
      b885f5:	48 89 d8             	mov    rax,rbx
      b885f8:	48 83 c4 28          	add    rsp,0x28
      b885fc:	5b                   	pop    rbx
      b885fd:	41 5e                	pop    r14
      b885ff:	c3                   	ret
      b88600:	48 89 c3             	mov    rbx,rax
      b88603:	48 89 e7             	mov    rdi,rsp
      b88606:	e8 bf 1c ef ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      b8860b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b88612:	00 00 
      b88614:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      b88619:	75 08                	jne    b88623 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd55c3>
      b8861b:	48 89 df             	mov    rdi,rbx
      b8861e:	e8 ad 76 ee ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      b88623:	e8 88 74 c6 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x180df28 codeSlots=38
- +0x0: 0x0 FDE=None
- +0x8: 0x0 FDE=None
- +0x10: 0xb88562 FDE=(12092770, 12092789)
- +0x18: 0xb88576 FDE=(12092790, 12092808)
- +0x20: 0xb88588 FDE=(12092808, 12092968)
- +0x28: 0xb88628 FDE=(12092968, 12092994)
- +0x30: 0xb88642 FDE=(12092994, 12093003)
- +0x38: 0xb8864c FDE=(12093004, 12093026)
- +0x40: 0xb88662 FDE=(12093026, 12093555)
- +0x48: 0x0 FDE=None
- +0x50: 0x0 FDE=None
- +0x58: 0xb88874 FDE=(12093556, 12093575)
- +0x60: 0xb88888 FDE=(12093576, 12093594)
- +0x68: 0xb8889a FDE=(12093594, 12093754)
- +0x70: 0xb8893a FDE=(12093754, 12093780)
- +0x78: 0xad6470 FDE=(11363440, 11363449)
- +0x80: 0xad647a FDE=(11363450, 11363472)
- +0x88: 0xb88954 FDE=(12093780, 12093792)
- +0x90: 0x0 FDE=None
- +0x98: 0x0 FDE=None
- +0xa0: 0xb884d4 FDE=(12092628, 12092647)
- +0xa8: 0xb884e8 FDE=(12092648, 12092666)
- +0xb0: 0xb884fa FDE=(12092666, 12092712)
- +0xb8: 0xb88528 FDE=(12092712, 12092749)
- +0xc0: 0xaae9b2 FDE=(11200946, 11200955)
- +0xc8: 0xaae9bc FDE=(11200956, 11200978)
- +0xd0: 0xb8854e FDE=(12092750, 12092769)
- +0xd8: 0x0 FDE=None
- +0xe0: 0x0 FDE=None
- +0xe8: 0xb8ac2a FDE=(12102698, 12102854)
- +0xf0: 0xb8acc6 FDE=(12102854, 12102872)
- +0xf8: 0xb8acd8 FDE=(12102872, 12102977)
- +0x100: 0xb5f12c FDE=(11923756, 11923864)
- +0x108: 0xb8ad42 FDE=(12102978, 12103086)
- +0x110: 0xb8adae FDE=(12103086, 12103194)
- +0x118: 0xb8ae1a FDE=(12103194, 12103302)
- +0x120: 0xb8ae86 FDE=(12103302, 12103410)
- +0x128: 0xb8aef2 FDE=(12103410, 12103518)
- +0x130: 0xb8af5e FDE=(12103518, 12103626)
- +0x138: 0xb8afca FDE=(12103626, 12103648)
- +0x140: 0xb8afe0 FDE=(12103648, 12103704)
- +0x148: 0xb8b018 FDE=(12103704, 12103760)
- +0x150: 0x0 FDE=None
- +0x158: 0x0 FDE=None
- +0x160: 0x9d7de0 FDE=(10321376, 10321377)
- +0x168: 0xa50370 FDE=(10814320, 10814325)
- +0x170: 0xb8a698 FDE=(12101272, 12101304)
#### +0x28 body
      b88628:	48 8d 47 10          	lea    rax,[rdi+0x10]
      b8862c:	48 8d 0d 05 59 c8 00 	lea    rcx,[rip+0xc85905]        # 180df38 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3bf8>
      b88633:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      b88636:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
      b8863a:	48 89 c6             	mov    rsi,rax
      b8863d:	e9 74 03 00 00       	jmp    b889b6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5956>

### AP 0x180df30 codeSlots=39
- +0x0: 0x0 FDE=None
- +0x8: 0xb88562 FDE=(12092770, 12092789)
- +0x10: 0xb88576 FDE=(12092790, 12092808)
- +0x18: 0xb88588 FDE=(12092808, 12092968)
- +0x20: 0xb88628 FDE=(12092968, 12092994)
- +0x28: 0xb88642 FDE=(12092994, 12093003)
- +0x30: 0xb8864c FDE=(12093004, 12093026)
- +0x38: 0xb88662 FDE=(12093026, 12093555)
- +0x40: 0x0 FDE=None
- +0x48: 0x0 FDE=None
- +0x50: 0xb88874 FDE=(12093556, 12093575)
- +0x58: 0xb88888 FDE=(12093576, 12093594)
- +0x60: 0xb8889a FDE=(12093594, 12093754)
- +0x68: 0xb8893a FDE=(12093754, 12093780)
- +0x70: 0xad6470 FDE=(11363440, 11363449)
- +0x78: 0xad647a FDE=(11363450, 11363472)
- +0x80: 0xb88954 FDE=(12093780, 12093792)
- +0x88: 0x0 FDE=None
- +0x90: 0x0 FDE=None
- +0x98: 0xb884d4 FDE=(12092628, 12092647)
- +0xa0: 0xb884e8 FDE=(12092648, 12092666)
- +0xa8: 0xb884fa FDE=(12092666, 12092712)
- +0xb0: 0xb88528 FDE=(12092712, 12092749)
- +0xb8: 0xaae9b2 FDE=(11200946, 11200955)
- +0xc0: 0xaae9bc FDE=(11200956, 11200978)
- +0xc8: 0xb8854e FDE=(12092750, 12092769)
- +0xd0: 0x0 FDE=None
- +0xd8: 0x0 FDE=None
- +0xe0: 0xb8ac2a FDE=(12102698, 12102854)
- +0xe8: 0xb8acc6 FDE=(12102854, 12102872)
- +0xf0: 0xb8acd8 FDE=(12102872, 12102977)
- +0xf8: 0xb5f12c FDE=(11923756, 11923864)
- +0x100: 0xb8ad42 FDE=(12102978, 12103086)
- +0x108: 0xb8adae FDE=(12103086, 12103194)
- +0x110: 0xb8ae1a FDE=(12103194, 12103302)
- +0x118: 0xb8ae86 FDE=(12103302, 12103410)
- +0x120: 0xb8aef2 FDE=(12103410, 12103518)
- +0x128: 0xb8af5e FDE=(12103518, 12103626)
- +0x130: 0xb8afca FDE=(12103626, 12103648)
- +0x138: 0xb8afe0 FDE=(12103648, 12103704)
- +0x140: 0xb8b018 FDE=(12103704, 12103760)
- +0x148: 0x0 FDE=None
- +0x150: 0x0 FDE=None
- +0x158: 0x9d7de0 FDE=(10321376, 10321377)
- +0x160: 0xa50370 FDE=(10814320, 10814325)
- +0x168: 0xb8a698 FDE=(12101272, 12101304)
- +0x170: 0xb8a6b8 FDE=(12101304, 12101323)
#### +0x28 body
      b88642:	48 83 c7 10          	add    rdi,0x10
      b88646:	e9 b1 fc ff ff       	jmp    b882fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd529c>

### AP 0x180df38 codeSlots=40
- +0x0: 0xb88562 FDE=(12092770, 12092789)
- +0x8: 0xb88576 FDE=(12092790, 12092808)
- +0x10: 0xb88588 FDE=(12092808, 12092968)
- +0x18: 0xb88628 FDE=(12092968, 12092994)
- +0x20: 0xb88642 FDE=(12092994, 12093003)
- +0x28: 0xb8864c FDE=(12093004, 12093026)
- +0x30: 0xb88662 FDE=(12093026, 12093555)
- +0x38: 0x0 FDE=None
- +0x40: 0x0 FDE=None
- +0x48: 0xb88874 FDE=(12093556, 12093575)
- +0x50: 0xb88888 FDE=(12093576, 12093594)
- +0x58: 0xb8889a FDE=(12093594, 12093754)
- +0x60: 0xb8893a FDE=(12093754, 12093780)
- +0x68: 0xad6470 FDE=(11363440, 11363449)
- +0x70: 0xad647a FDE=(11363450, 11363472)
- +0x78: 0xb88954 FDE=(12093780, 12093792)
- +0x80: 0x0 FDE=None
- +0x88: 0x0 FDE=None
- +0x90: 0xb884d4 FDE=(12092628, 12092647)
- +0x98: 0xb884e8 FDE=(12092648, 12092666)
- +0xa0: 0xb884fa FDE=(12092666, 12092712)
- +0xa8: 0xb88528 FDE=(12092712, 12092749)
- +0xb0: 0xaae9b2 FDE=(11200946, 11200955)
- +0xb8: 0xaae9bc FDE=(11200956, 11200978)
- +0xc0: 0xb8854e FDE=(12092750, 12092769)
- +0xc8: 0x0 FDE=None
- +0xd0: 0x0 FDE=None
- +0xd8: 0xb8ac2a FDE=(12102698, 12102854)
- +0xe0: 0xb8acc6 FDE=(12102854, 12102872)
- +0xe8: 0xb8acd8 FDE=(12102872, 12102977)
- +0xf0: 0xb5f12c FDE=(11923756, 11923864)
- +0xf8: 0xb8ad42 FDE=(12102978, 12103086)
- +0x100: 0xb8adae FDE=(12103086, 12103194)
- +0x108: 0xb8ae1a FDE=(12103194, 12103302)
- +0x110: 0xb8ae86 FDE=(12103302, 12103410)
- +0x118: 0xb8aef2 FDE=(12103410, 12103518)
- +0x120: 0xb8af5e FDE=(12103518, 12103626)
- +0x128: 0xb8afca FDE=(12103626, 12103648)
- +0x130: 0xb8afe0 FDE=(12103648, 12103704)
- +0x138: 0xb8b018 FDE=(12103704, 12103760)
- +0x140: 0x0 FDE=None
- +0x148: 0x0 FDE=None
- +0x150: 0x9d7de0 FDE=(10321376, 10321377)
- +0x158: 0xa50370 FDE=(10814320, 10814325)
- +0x160: 0xb8a698 FDE=(12101272, 12101304)
- +0x168: 0xb8a6b8 FDE=(12101304, 12101323)
- +0x170: 0x9d7de0 FDE=(10321376, 10321377)
#### +0x28 body
      b8864c:	53                   	push   rbx
      b8864d:	48 89 fb             	mov    rbx,rdi
      b88650:	48 83 c7 10          	add    rdi,0x10
      b88654:	e8 a3 fc ff ff       	call   b882fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd529c>
      b88659:	48 89 df             	mov    rdi,rbx
      b8865c:	5b                   	pop    rbx
      b8865d:	e9 be 58 c6 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x180df40 codeSlots=40
- +0x0: 0xb88576 FDE=(12092790, 12092808)
- +0x8: 0xb88588 FDE=(12092808, 12092968)
- +0x10: 0xb88628 FDE=(12092968, 12092994)
- +0x18: 0xb88642 FDE=(12092994, 12093003)
- +0x20: 0xb8864c FDE=(12093004, 12093026)
- +0x28: 0xb88662 FDE=(12093026, 12093555)
- +0x30: 0x0 FDE=None
- +0x38: 0x0 FDE=None
- +0x40: 0xb88874 FDE=(12093556, 12093575)
- +0x48: 0xb88888 FDE=(12093576, 12093594)
- +0x50: 0xb8889a FDE=(12093594, 12093754)
- +0x58: 0xb8893a FDE=(12093754, 12093780)
- +0x60: 0xad6470 FDE=(11363440, 11363449)
- +0x68: 0xad647a FDE=(11363450, 11363472)
- +0x70: 0xb88954 FDE=(12093780, 12093792)
- +0x78: 0x0 FDE=None
- +0x80: 0x0 FDE=None
- +0x88: 0xb884d4 FDE=(12092628, 12092647)
- +0x90: 0xb884e8 FDE=(12092648, 12092666)
- +0x98: 0xb884fa FDE=(12092666, 12092712)
- +0xa0: 0xb88528 FDE=(12092712, 12092749)
- +0xa8: 0xaae9b2 FDE=(11200946, 11200955)
- +0xb0: 0xaae9bc FDE=(11200956, 11200978)
- +0xb8: 0xb8854e FDE=(12092750, 12092769)
- +0xc0: 0x0 FDE=None
- +0xc8: 0x0 FDE=None
- +0xd0: 0xb8ac2a FDE=(12102698, 12102854)
- +0xd8: 0xb8acc6 FDE=(12102854, 12102872)
- +0xe0: 0xb8acd8 FDE=(12102872, 12102977)
- +0xe8: 0xb5f12c FDE=(11923756, 11923864)
- +0xf0: 0xb8ad42 FDE=(12102978, 12103086)
- +0xf8: 0xb8adae FDE=(12103086, 12103194)
- +0x100: 0xb8ae1a FDE=(12103194, 12103302)
- +0x108: 0xb8ae86 FDE=(12103302, 12103410)
- +0x110: 0xb8aef2 FDE=(12103410, 12103518)
- +0x118: 0xb8af5e FDE=(12103518, 12103626)
- +0x120: 0xb8afca FDE=(12103626, 12103648)
- +0x128: 0xb8afe0 FDE=(12103648, 12103704)
- +0x130: 0xb8b018 FDE=(12103704, 12103760)
- +0x138: 0x0 FDE=None
- +0x140: 0x0 FDE=None
- +0x148: 0x9d7de0 FDE=(10321376, 10321377)
- +0x150: 0xa50370 FDE=(10814320, 10814325)
- +0x158: 0xb8a698 FDE=(12101272, 12101304)
- +0x160: 0xb8a6b8 FDE=(12101304, 12101323)
- +0x168: 0x9d7de0 FDE=(10321376, 10321377)
- +0x170: 0xa50370 FDE=(10814320, 10814325)
#### +0x28 body
      b88662:	55                   	push   rbp
      b88663:	41 57                	push   r15
      b88665:	41 56                	push   r14
      b88667:	41 55                	push   r13
      b88669:	41 54                	push   r12
      b8866b:	53                   	push   rbx
      b8866c:	48 81 ec c8 00 00 00 	sub    rsp,0xc8
      b88673:	49 89 cf             	mov    r15,rcx
      b88676:	49 89 d4             	mov    r12,rdx
      b88679:	48 89 f5             	mov    rbp,rsi
      b8867c:	49 89 fe             	mov    r14,rdi
      b8867f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b88686:	00 00 
      b88688:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
      b8868f:	00 
      b88690:	48 83 c6 40          	add    rsi,0x40
      b88694:	48 89 e7             	mov    rdi,rsp
      b88697:	e8 f4 1b ef ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      b8869c:	bf 60 02 00 00       	mov    edi,0x260
      b886a1:	e8 5a 58 c6 00       	call   17edf00 <_Znwm@plt>
      b886a6:	48 89 c3             	mov    rbx,rax
      b886a9:	0f 57 c0             	xorps  xmm0,xmm0
      b886ac:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      b886b0:	48 8d 05 11 27 c8 00 	lea    rax,[rip+0xc82711]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
      b886b7:	48 89 03             	mov    QWORD PTR [rbx],rax
      b886ba:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      b886bf:	48 89 e6             	mov    rsi,rsp
      b886c2:	e8 f1 fb ff ff       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
      b886c7:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
      b886ce:	00 00 
      b886d0:	6a 40                	push   0x40
      b886d2:	5f                   	pop    rdi
      b886d3:	e8 28 58 c6 00       	call   17edf00 <_Znwm@plt>
      b886d8:	49 89 c5             	mov    r13,rax
      b886db:	48 8d 05 9e 58 c8 00 	lea    rax,[rip+0xc8589e]        # 180df80 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3c40>
      b886e2:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      b886e6:	4c 89 ef             	mov    rdi,r13
      b886e9:	48 83 c7 10          	add    rdi,0x10
      b886ed:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
      b886f2:	e8 c1 fb ff ff       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
      b886f7:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
      b886fc:	4c 89 6e 20          	mov    QWORD PTR [rsi+0x20],r13
      b88700:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      b88707:	00 
      b88708:	e8 83 1b ef ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      b8870d:	48 8d 75 10          	lea    rsi,[rbp+0x10]
      b88711:	48 8d 55 20          	lea    rdx,[rbp+0x20]
      b88715:	48 83 c5 30          	add    rbp,0x30
      b88719:	49 89 dd             	mov    r13,rbx
      b8871c:	49 83 c5 20          	add    r13,0x20
      b88720:	4c 8d 84 24 90 00 00 	lea    r8,[rsp+0x90]
      b88727:	00 
      b88728:	4c 89 ef             	mov    rdi,r13
      b8872b:	48 89 e9             	mov    rcx,rbp
      b8872e:	e8 89 49 96 00       	call   14ed0bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x332640>
      b88733:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      b8873a:	00 
      b8873b:	e8 2a 18 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b88740:	41 80 bc 24 a8 09 00 	cmp    BYTE PTR [r12+0x9a8],0x0
      b88747:	00 00 
      b88749:	74 0e                	je     b88759 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd56f9>
      b8874b:	4c 89 ef             	mov    rdi,r13
      b8874e:	4c 89 e6             	mov    rsi,r12
      b88751:	4c 89 fa             	mov    rdx,r15
      b88754:	e8 07 53 96 00       	call   14eda60 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x332fe4>
      b88759:	41 80 bc 24 30 09 00 	cmp    BYTE PTR [r12+0x930],0x0
      b88760:	00 00 
      b88762:	74 3a                	je     b8879e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd573e>
      b88764:	49 8d ac 24 c0 04 00 	lea    rbp,[r12+0x4c0]
      b8876b:	00 
      b8876c:	48 89 ef             	mov    rdi,rbp
      b8876f:	e8 ae 75 53 00       	call   10bfd22 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287138>
      b88774:	48 89 ef             	mov    rdi,rbp
      b88777:	e8 20 2d 8e 00       	call   146b49c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b0a20>
      b8877c:	84 c0                	test   al,al
      b8877e:	75 1e                	jne    b8879e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd573e>
      b88780:	4d 8d 84 24 38 09 00 	lea    r8,[r12+0x938]
      b88787:	00 
      b88788:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      b8878c:	4c 89 ef             	mov    rdi,r13
      b8878f:	4c 89 e6             	mov    rsi,r12
      b88792:	4c 89 fa             	mov    rdx,r15
      b88795:	48 89 e9             	mov    rcx,rbp
      b88798:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
      b8879e:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      b887a3:	e8 c2 17 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b887a8:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      b887ad:	e8 b8 17 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b887b2:	31 ff                	xor    edi,edi
      b887b4:	e8 63 5c f1 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      b887b9:	48 89 e7             	mov    rdi,rsp
      b887bc:	e8 a9 17 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b887c1:	4d 89 2e             	mov    QWORD PTR [r14],r13
      b887c4:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
      b887c8:	31 ff                	xor    edi,edi
      b887ca:	e8 b7 5c f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b887cf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b887d6:	00 00 
      b887d8:	48 3b 84 24 c0 00 00 	cmp    rax,QWORD PTR [rsp+0xc0]
      b887df:	00 
      b887e0:	0f 85 88 00 00 00    	jne    b8886e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd580e>
      b887e6:	4c 89 f0             	mov    rax,r14
      b887e9:	48 81 c4 c8 00 00 00 	add    rsp,0xc8
      b887f0:	5b                   	pop    rbx
      b887f1:	41 5c                	pop    r12
      b887f3:	41 5d                	pop    r13
      b887f5:	41 5e                	pop    r14
      b887f7:	41 5f                	pop    r15
      b887f9:	5d                   	pop    rbp
      b887fa:	c3                   	ret
      b887fb:	49 89 c6             	mov    r14,rax
      b887fe:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      b88805:	00 
      b88806:	e8 5f 17 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b8880b:	eb 1a                	jmp    b88827 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd57c7>
      b8880d:	49 89 c6             	mov    r14,rax
      b88810:	eb 15                	jmp    b88827 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd57c7>
      b88812:	49 89 c6             	mov    r14,rax
      b88815:	eb 1a                	jmp    b88831 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd57d1>
      b88817:	49 89 c6             	mov    r14,rax
      b8881a:	eb 2f                	jmp    b8884b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd57eb>
      b8881c:	49 89 c6             	mov    r14,rax
      b8881f:	4c 89 ef             	mov    rdi,r13
      b88822:	e8 e3 49 96 00       	call   14ed20a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33278e>
      b88827:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      b8882c:	e8 39 17 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b88831:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      b88836:	e8 2f 17 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b8883b:	48 89 df             	mov    rdi,rbx
      b8883e:	e8 cd 57 c6 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      b88843:	48 89 df             	mov    rdi,rbx
      b88846:	e8 d1 5b f1 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      b8884b:	48 89 e7             	mov    rdi,rsp
      b8884e:	e8 17 17 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b88853:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b8885a:	00 00 
      b8885c:	48 3b 84 24 c0 00 00 	cmp    rax,QWORD PTR [rsp+0xc0]
      b88863:	00 
      b88864:	75 08                	jne    b8886e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd580e>
      b88866:	4c 89 f7             	mov    rdi,r14
      b88869:	e8 62 74 ee ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      b8886e:	e8 3d 72 c6 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x180df48 codeSlots=39
- +0x0: 0xb88588 FDE=(12092808, 12092968)
- +0x8: 0xb88628 FDE=(12092968, 12092994)
- +0x10: 0xb88642 FDE=(12092994, 12093003)
- +0x18: 0xb8864c FDE=(12093004, 12093026)
- +0x20: 0xb88662 FDE=(12093026, 12093555)
- +0x28: 0x0 FDE=None
- +0x30: 0x0 FDE=None
- +0x38: 0xb88874 FDE=(12093556, 12093575)
- +0x40: 0xb88888 FDE=(12093576, 12093594)
- +0x48: 0xb8889a FDE=(12093594, 12093754)
- +0x50: 0xb8893a FDE=(12093754, 12093780)
- +0x58: 0xad6470 FDE=(11363440, 11363449)
- +0x60: 0xad647a FDE=(11363450, 11363472)
- +0x68: 0xb88954 FDE=(12093780, 12093792)
- +0x70: 0x0 FDE=None
- +0x78: 0x0 FDE=None
- +0x80: 0xb884d4 FDE=(12092628, 12092647)
- +0x88: 0xb884e8 FDE=(12092648, 12092666)
- +0x90: 0xb884fa FDE=(12092666, 12092712)
- +0x98: 0xb88528 FDE=(12092712, 12092749)
- +0xa0: 0xaae9b2 FDE=(11200946, 11200955)
- +0xa8: 0xaae9bc FDE=(11200956, 11200978)
- +0xb0: 0xb8854e FDE=(12092750, 12092769)
- +0xb8: 0x0 FDE=None
- +0xc0: 0x0 FDE=None
- +0xc8: 0xb8ac2a FDE=(12102698, 12102854)
- +0xd0: 0xb8acc6 FDE=(12102854, 12102872)
- +0xd8: 0xb8acd8 FDE=(12102872, 12102977)
- +0xe0: 0xb5f12c FDE=(11923756, 11923864)
- +0xe8: 0xb8ad42 FDE=(12102978, 12103086)
- +0xf0: 0xb8adae FDE=(12103086, 12103194)
- +0xf8: 0xb8ae1a FDE=(12103194, 12103302)
- +0x100: 0xb8ae86 FDE=(12103302, 12103410)
- +0x108: 0xb8aef2 FDE=(12103410, 12103518)
- +0x110: 0xb8af5e FDE=(12103518, 12103626)
- +0x118: 0xb8afca FDE=(12103626, 12103648)
- +0x120: 0xb8afe0 FDE=(12103648, 12103704)
- +0x128: 0xb8b018 FDE=(12103704, 12103760)
- +0x130: 0x0 FDE=None
- +0x138: 0x0 FDE=None
- +0x140: 0x9d7de0 FDE=(10321376, 10321377)
- +0x148: 0xa50370 FDE=(10814320, 10814325)
- +0x150: 0xb8a698 FDE=(12101272, 12101304)
- +0x158: 0xb8a6b8 FDE=(12101304, 12101323)
- +0x160: 0x9d7de0 FDE=(10321376, 10321377)
- +0x168: 0xa50370 FDE=(10814320, 10814325)
- +0x170: 0xb8a6cc FDE=(12101324, 12101812)

### AP 0x180df50 codeSlots=38
- +0x0: 0xb88628 FDE=(12092968, 12092994)
- +0x8: 0xb88642 FDE=(12092994, 12093003)
- +0x10: 0xb8864c FDE=(12093004, 12093026)
- +0x18: 0xb88662 FDE=(12093026, 12093555)
- +0x20: 0x0 FDE=None
- +0x28: 0x0 FDE=None
- +0x30: 0xb88874 FDE=(12093556, 12093575)
- +0x38: 0xb88888 FDE=(12093576, 12093594)
- +0x40: 0xb8889a FDE=(12093594, 12093754)
- +0x48: 0xb8893a FDE=(12093754, 12093780)
- +0x50: 0xad6470 FDE=(11363440, 11363449)
- +0x58: 0xad647a FDE=(11363450, 11363472)
- +0x60: 0xb88954 FDE=(12093780, 12093792)
- +0x68: 0x0 FDE=None
- +0x70: 0x0 FDE=None
- +0x78: 0xb884d4 FDE=(12092628, 12092647)
- +0x80: 0xb884e8 FDE=(12092648, 12092666)
- +0x88: 0xb884fa FDE=(12092666, 12092712)
- +0x90: 0xb88528 FDE=(12092712, 12092749)
- +0x98: 0xaae9b2 FDE=(11200946, 11200955)
- +0xa0: 0xaae9bc FDE=(11200956, 11200978)
- +0xa8: 0xb8854e FDE=(12092750, 12092769)
- +0xb0: 0x0 FDE=None
- +0xb8: 0x0 FDE=None
- +0xc0: 0xb8ac2a FDE=(12102698, 12102854)
- +0xc8: 0xb8acc6 FDE=(12102854, 12102872)
- +0xd0: 0xb8acd8 FDE=(12102872, 12102977)
- +0xd8: 0xb5f12c FDE=(11923756, 11923864)
- +0xe0: 0xb8ad42 FDE=(12102978, 12103086)
- +0xe8: 0xb8adae FDE=(12103086, 12103194)
- +0xf0: 0xb8ae1a FDE=(12103194, 12103302)
- +0xf8: 0xb8ae86 FDE=(12103302, 12103410)
- +0x100: 0xb8aef2 FDE=(12103410, 12103518)
- +0x108: 0xb8af5e FDE=(12103518, 12103626)
- +0x110: 0xb8afca FDE=(12103626, 12103648)
- +0x118: 0xb8afe0 FDE=(12103648, 12103704)
- +0x120: 0xb8b018 FDE=(12103704, 12103760)
- +0x128: 0x0 FDE=None
- +0x130: 0x0 FDE=None
- +0x138: 0x9d7de0 FDE=(10321376, 10321377)
- +0x140: 0xa50370 FDE=(10814320, 10814325)
- +0x148: 0xb8a698 FDE=(12101272, 12101304)
- +0x150: 0xb8a6b8 FDE=(12101304, 12101323)
- +0x158: 0x9d7de0 FDE=(10321376, 10321377)
- +0x160: 0xa50370 FDE=(10814320, 10814325)
- +0x168: 0xb8a6cc FDE=(12101324, 12101812)
- +0x170: 0x0 FDE=None

### AP 0x180df58 codeSlots=38
- +0x0: 0xb88642 FDE=(12092994, 12093003)
- +0x8: 0xb8864c FDE=(12093004, 12093026)
- +0x10: 0xb88662 FDE=(12093026, 12093555)
- +0x18: 0x0 FDE=None
- +0x20: 0x0 FDE=None
- +0x28: 0xb88874 FDE=(12093556, 12093575)
- +0x30: 0xb88888 FDE=(12093576, 12093594)
- +0x38: 0xb8889a FDE=(12093594, 12093754)
- +0x40: 0xb8893a FDE=(12093754, 12093780)
- +0x48: 0xad6470 FDE=(11363440, 11363449)
- +0x50: 0xad647a FDE=(11363450, 11363472)
- +0x58: 0xb88954 FDE=(12093780, 12093792)
- +0x60: 0x0 FDE=None
- +0x68: 0x0 FDE=None
- +0x70: 0xb884d4 FDE=(12092628, 12092647)
- +0x78: 0xb884e8 FDE=(12092648, 12092666)
- +0x80: 0xb884fa FDE=(12092666, 12092712)
- +0x88: 0xb88528 FDE=(12092712, 12092749)
- +0x90: 0xaae9b2 FDE=(11200946, 11200955)
- +0x98: 0xaae9bc FDE=(11200956, 11200978)
- +0xa0: 0xb8854e FDE=(12092750, 12092769)
- +0xa8: 0x0 FDE=None
- +0xb0: 0x0 FDE=None
- +0xb8: 0xb8ac2a FDE=(12102698, 12102854)
- +0xc0: 0xb8acc6 FDE=(12102854, 12102872)
- +0xc8: 0xb8acd8 FDE=(12102872, 12102977)
- +0xd0: 0xb5f12c FDE=(11923756, 11923864)
- +0xd8: 0xb8ad42 FDE=(12102978, 12103086)
- +0xe0: 0xb8adae FDE=(12103086, 12103194)
- +0xe8: 0xb8ae1a FDE=(12103194, 12103302)
- +0xf0: 0xb8ae86 FDE=(12103302, 12103410)
- +0xf8: 0xb8aef2 FDE=(12103410, 12103518)
- +0x100: 0xb8af5e FDE=(12103518, 12103626)
- +0x108: 0xb8afca FDE=(12103626, 12103648)
- +0x110: 0xb8afe0 FDE=(12103648, 12103704)
- +0x118: 0xb8b018 FDE=(12103704, 12103760)
- +0x120: 0x0 FDE=None
- +0x128: 0x0 FDE=None
- +0x130: 0x9d7de0 FDE=(10321376, 10321377)
- +0x138: 0xa50370 FDE=(10814320, 10814325)
- +0x140: 0xb8a698 FDE=(12101272, 12101304)
- +0x148: 0xb8a6b8 FDE=(12101304, 12101323)
- +0x150: 0x9d7de0 FDE=(10321376, 10321377)
- +0x158: 0xa50370 FDE=(10814320, 10814325)
- +0x160: 0xb8a6cc FDE=(12101324, 12101812)
- +0x168: 0x0 FDE=None
- +0x170: 0x0 FDE=None
#### +0x28 body
      b88874:	48 8d 05 05 57 c8 00 	lea    rax,[rip+0xc85705]        # 180df80 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3c40>
      b8887b:	48 89 07             	mov    QWORD PTR [rdi],rax
      b8887e:	48 83 c7 10          	add    rdi,0x10
      b88882:	e9 e3 16 ef ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>

### AP 0x180dfa8 codeSlots=38
- +0x0: 0xad647a FDE=(11363450, 11363472)
- +0x8: 0xb88954 FDE=(12093780, 12093792)
- +0x10: 0x0 FDE=None
- +0x18: 0x0 FDE=None
- +0x20: 0xb884d4 FDE=(12092628, 12092647)
- +0x28: 0xb884e8 FDE=(12092648, 12092666)
- +0x30: 0xb884fa FDE=(12092666, 12092712)
- +0x38: 0xb88528 FDE=(12092712, 12092749)
- +0x40: 0xaae9b2 FDE=(11200946, 11200955)
- +0x48: 0xaae9bc FDE=(11200956, 11200978)
- +0x50: 0xb8854e FDE=(12092750, 12092769)
- +0x58: 0x0 FDE=None
- +0x60: 0x0 FDE=None
- +0x68: 0xb8ac2a FDE=(12102698, 12102854)
- +0x70: 0xb8acc6 FDE=(12102854, 12102872)
- +0x78: 0xb8acd8 FDE=(12102872, 12102977)
- +0x80: 0xb5f12c FDE=(11923756, 11923864)
- +0x88: 0xb8ad42 FDE=(12102978, 12103086)
- +0x90: 0xb8adae FDE=(12103086, 12103194)
- +0x98: 0xb8ae1a FDE=(12103194, 12103302)
- +0xa0: 0xb8ae86 FDE=(12103302, 12103410)
- +0xa8: 0xb8aef2 FDE=(12103410, 12103518)
- +0xb0: 0xb8af5e FDE=(12103518, 12103626)
- +0xb8: 0xb8afca FDE=(12103626, 12103648)
- +0xc0: 0xb8afe0 FDE=(12103648, 12103704)
- +0xc8: 0xb8b018 FDE=(12103704, 12103760)
- +0xd0: 0x0 FDE=None
- +0xd8: 0x0 FDE=None
- +0xe0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe8: 0xa50370 FDE=(10814320, 10814325)
- +0xf0: 0xb8a698 FDE=(12101272, 12101304)
- +0xf8: 0xb8a6b8 FDE=(12101304, 12101323)
- +0x100: 0x9d7de0 FDE=(10321376, 10321377)
- +0x108: 0xa50370 FDE=(10814320, 10814325)
- +0x110: 0xb8a6cc FDE=(12101324, 12101812)
- +0x118: 0x0 FDE=None
- +0x120: 0x0 FDE=None
- +0x128: 0x9d7de0 FDE=(10321376, 10321377)
- +0x130: 0xa50370 FDE=(10814320, 10814325)
- +0x138: 0xb8b050 FDE=(12103760, 12103763)
- +0x140: 0xb8b054 FDE=(12103764, 12103775)
- +0x148: 0xb8b060 FDE=(12103776, 12103787)
- +0x150: 0xb8b06c FDE=(12103788, 12103944)
- +0x158: 0x0 FDE=None
- +0x160: 0x0 FDE=None
- +0x168: 0x9d7de0 FDE=(10321376, 10321377)
- +0x170: 0xa50370 FDE=(10814320, 10814325)
#### +0x28 body
      b884e8:	53                   	push   rbx
      b884e9:	48 89 fb             	mov    rbx,rdi
      b884ec:	e8 e3 ff ff ff       	call   b884d4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5474>
      b884f1:	48 89 df             	mov    rdi,rbx
      b884f4:	5b                   	pop    rbx
      b884f5:	e9 26 5a c6 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x180dfb0 codeSlots=38
- +0x0: 0xb88954 FDE=(12093780, 12093792)
- +0x8: 0x0 FDE=None
- +0x10: 0x0 FDE=None
- +0x18: 0xb884d4 FDE=(12092628, 12092647)
- +0x20: 0xb884e8 FDE=(12092648, 12092666)
- +0x28: 0xb884fa FDE=(12092666, 12092712)
- +0x30: 0xb88528 FDE=(12092712, 12092749)
- +0x38: 0xaae9b2 FDE=(11200946, 11200955)
- +0x40: 0xaae9bc FDE=(11200956, 11200978)
- +0x48: 0xb8854e FDE=(12092750, 12092769)
- +0x50: 0x0 FDE=None
- +0x58: 0x0 FDE=None
- +0x60: 0xb8ac2a FDE=(12102698, 12102854)
- +0x68: 0xb8acc6 FDE=(12102854, 12102872)
- +0x70: 0xb8acd8 FDE=(12102872, 12102977)
- +0x78: 0xb5f12c FDE=(11923756, 11923864)
- +0x80: 0xb8ad42 FDE=(12102978, 12103086)
- +0x88: 0xb8adae FDE=(12103086, 12103194)
- +0x90: 0xb8ae1a FDE=(12103194, 12103302)
- +0x98: 0xb8ae86 FDE=(12103302, 12103410)
- +0xa0: 0xb8aef2 FDE=(12103410, 12103518)
- +0xa8: 0xb8af5e FDE=(12103518, 12103626)
- +0xb0: 0xb8afca FDE=(12103626, 12103648)
- +0xb8: 0xb8afe0 FDE=(12103648, 12103704)
- +0xc0: 0xb8b018 FDE=(12103704, 12103760)
- +0xc8: 0x0 FDE=None
- +0xd0: 0x0 FDE=None
- +0xd8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe0: 0xa50370 FDE=(10814320, 10814325)
- +0xe8: 0xb8a698 FDE=(12101272, 12101304)
- +0xf0: 0xb8a6b8 FDE=(12101304, 12101323)
- +0xf8: 0x9d7de0 FDE=(10321376, 10321377)
- +0x100: 0xa50370 FDE=(10814320, 10814325)
- +0x108: 0xb8a6cc FDE=(12101324, 12101812)
- +0x110: 0x0 FDE=None
- +0x118: 0x0 FDE=None
- +0x120: 0x9d7de0 FDE=(10321376, 10321377)
- +0x128: 0xa50370 FDE=(10814320, 10814325)
- +0x130: 0xb8b050 FDE=(12103760, 12103763)
- +0x138: 0xb8b054 FDE=(12103764, 12103775)
- +0x140: 0xb8b060 FDE=(12103776, 12103787)
- +0x148: 0xb8b06c FDE=(12103788, 12103944)
- +0x150: 0x0 FDE=None
- +0x158: 0x0 FDE=None
- +0x160: 0x9d7de0 FDE=(10321376, 10321377)
- +0x168: 0xa50370 FDE=(10814320, 10814325)
- +0x170: 0xb8b152 FDE=(12104018, 12104021)
#### +0x28 body
      b884fa:	53                   	push   rbx
      b884fb:	48 89 fb             	mov    rbx,rdi
      b884fe:	6a 18                	push   0x18
      b88500:	5f                   	pop    rdi
      b88501:	e8 fa 59 c6 00       	call   17edf00 <_Znwm@plt>
      b88506:	48 8d 0d bb 5a c8 00 	lea    rcx,[rip+0xc85abb]        # 180dfc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3c88>
      b8850d:	48 89 08             	mov    QWORD PTR [rax],rcx
      b88510:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      b88514:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
      b88518:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      b8851c:	48 85 c9             	test   rcx,rcx
      b8851f:	74 05                	je     b88526 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd54c6>
      b88521:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b88526:	5b                   	pop    rbx
      b88527:	c3                   	ret

### AP 0x180dfb8 codeSlots=38
- +0x0: 0x0 FDE=None
- +0x8: 0x0 FDE=None
- +0x10: 0xb884d4 FDE=(12092628, 12092647)
- +0x18: 0xb884e8 FDE=(12092648, 12092666)
- +0x20: 0xb884fa FDE=(12092666, 12092712)
- +0x28: 0xb88528 FDE=(12092712, 12092749)
- +0x30: 0xaae9b2 FDE=(11200946, 11200955)
- +0x38: 0xaae9bc FDE=(11200956, 11200978)
- +0x40: 0xb8854e FDE=(12092750, 12092769)
- +0x48: 0x0 FDE=None
- +0x50: 0x0 FDE=None
- +0x58: 0xb8ac2a FDE=(12102698, 12102854)
- +0x60: 0xb8acc6 FDE=(12102854, 12102872)
- +0x68: 0xb8acd8 FDE=(12102872, 12102977)
- +0x70: 0xb5f12c FDE=(11923756, 11923864)
- +0x78: 0xb8ad42 FDE=(12102978, 12103086)
- +0x80: 0xb8adae FDE=(12103086, 12103194)
- +0x88: 0xb8ae1a FDE=(12103194, 12103302)
- +0x90: 0xb8ae86 FDE=(12103302, 12103410)
- +0x98: 0xb8aef2 FDE=(12103410, 12103518)
- +0xa0: 0xb8af5e FDE=(12103518, 12103626)
- +0xa8: 0xb8afca FDE=(12103626, 12103648)
- +0xb0: 0xb8afe0 FDE=(12103648, 12103704)
- +0xb8: 0xb8b018 FDE=(12103704, 12103760)
- +0xc0: 0x0 FDE=None
- +0xc8: 0x0 FDE=None
- +0xd0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd8: 0xa50370 FDE=(10814320, 10814325)
- +0xe0: 0xb8a698 FDE=(12101272, 12101304)
- +0xe8: 0xb8a6b8 FDE=(12101304, 12101323)
- +0xf0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xf8: 0xa50370 FDE=(10814320, 10814325)
- +0x100: 0xb8a6cc FDE=(12101324, 12101812)
- +0x108: 0x0 FDE=None
- +0x110: 0x0 FDE=None
- +0x118: 0x9d7de0 FDE=(10321376, 10321377)
- +0x120: 0xa50370 FDE=(10814320, 10814325)
- +0x128: 0xb8b050 FDE=(12103760, 12103763)
- +0x130: 0xb8b054 FDE=(12103764, 12103775)
- +0x138: 0xb8b060 FDE=(12103776, 12103787)
- +0x140: 0xb8b06c FDE=(12103788, 12103944)
- +0x148: 0x0 FDE=None
- +0x150: 0x0 FDE=None
- +0x158: 0x9d7de0 FDE=(10321376, 10321377)
- +0x160: 0xa50370 FDE=(10814320, 10814325)
- +0x168: 0xb8b152 FDE=(12104018, 12104021)
- +0x170: 0xb8b156 FDE=(12104022, 12104033)
#### +0x28 body
      b88528:	48 8d 05 99 5a c8 00 	lea    rax,[rip+0xc85a99]        # 180dfc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3c88>
      b8852f:	48 89 06             	mov    QWORD PTR [rsi],rax
      b88532:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      b88536:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      b8853a:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      b8853e:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
      b88542:	48 85 c0             	test   rax,rax
      b88545:	74 05                	je     b8854c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd54ec>
      b88547:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b8854c:	c3                   	ret

### AP 0x180dfc0 codeSlots=39
- +0x0: 0x0 FDE=None
- +0x8: 0xb884d4 FDE=(12092628, 12092647)
- +0x10: 0xb884e8 FDE=(12092648, 12092666)
- +0x18: 0xb884fa FDE=(12092666, 12092712)
- +0x20: 0xb88528 FDE=(12092712, 12092749)
- +0x28: 0xaae9b2 FDE=(11200946, 11200955)
- +0x30: 0xaae9bc FDE=(11200956, 11200978)
- +0x38: 0xb8854e FDE=(12092750, 12092769)
- +0x40: 0x0 FDE=None
- +0x48: 0x0 FDE=None
- +0x50: 0xb8ac2a FDE=(12102698, 12102854)
- +0x58: 0xb8acc6 FDE=(12102854, 12102872)
- +0x60: 0xb8acd8 FDE=(12102872, 12102977)
- +0x68: 0xb5f12c FDE=(11923756, 11923864)
- +0x70: 0xb8ad42 FDE=(12102978, 12103086)
- +0x78: 0xb8adae FDE=(12103086, 12103194)
- +0x80: 0xb8ae1a FDE=(12103194, 12103302)
- +0x88: 0xb8ae86 FDE=(12103302, 12103410)
- +0x90: 0xb8aef2 FDE=(12103410, 12103518)
- +0x98: 0xb8af5e FDE=(12103518, 12103626)
- +0xa0: 0xb8afca FDE=(12103626, 12103648)
- +0xa8: 0xb8afe0 FDE=(12103648, 12103704)
- +0xb0: 0xb8b018 FDE=(12103704, 12103760)
- +0xb8: 0x0 FDE=None
- +0xc0: 0x0 FDE=None
- +0xc8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd0: 0xa50370 FDE=(10814320, 10814325)
- +0xd8: 0xb8a698 FDE=(12101272, 12101304)
- +0xe0: 0xb8a6b8 FDE=(12101304, 12101323)
- +0xe8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xf0: 0xa50370 FDE=(10814320, 10814325)
- +0xf8: 0xb8a6cc FDE=(12101324, 12101812)
- +0x100: 0x0 FDE=None
- +0x108: 0x0 FDE=None
- +0x110: 0x9d7de0 FDE=(10321376, 10321377)
- +0x118: 0xa50370 FDE=(10814320, 10814325)
- +0x120: 0xb8b050 FDE=(12103760, 12103763)
- +0x128: 0xb8b054 FDE=(12103764, 12103775)
- +0x130: 0xb8b060 FDE=(12103776, 12103787)
- +0x138: 0xb8b06c FDE=(12103788, 12103944)
- +0x140: 0x0 FDE=None
- +0x148: 0x0 FDE=None
- +0x150: 0x9d7de0 FDE=(10321376, 10321377)
- +0x158: 0xa50370 FDE=(10814320, 10814325)
- +0x160: 0xb8b152 FDE=(12104018, 12104021)
- +0x168: 0xb8b156 FDE=(12104022, 12104033)
- +0x170: 0xa5bbf0 FDE=(10861552, 10861557)
#### +0x28 body
      aae9b2:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aae9b6:	e9 cb fa fe ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>

### AP 0x180dfc8 codeSlots=39
- +0x0: 0xb884d4 FDE=(12092628, 12092647)
- +0x8: 0xb884e8 FDE=(12092648, 12092666)
- +0x10: 0xb884fa FDE=(12092666, 12092712)
- +0x18: 0xb88528 FDE=(12092712, 12092749)
- +0x20: 0xaae9b2 FDE=(11200946, 11200955)
- +0x28: 0xaae9bc FDE=(11200956, 11200978)
- +0x30: 0xb8854e FDE=(12092750, 12092769)
- +0x38: 0x0 FDE=None
- +0x40: 0x0 FDE=None
- +0x48: 0xb8ac2a FDE=(12102698, 12102854)
- +0x50: 0xb8acc6 FDE=(12102854, 12102872)
- +0x58: 0xb8acd8 FDE=(12102872, 12102977)
- +0x60: 0xb5f12c FDE=(11923756, 11923864)
- +0x68: 0xb8ad42 FDE=(12102978, 12103086)
- +0x70: 0xb8adae FDE=(12103086, 12103194)
- +0x78: 0xb8ae1a FDE=(12103194, 12103302)
- +0x80: 0xb8ae86 FDE=(12103302, 12103410)
- +0x88: 0xb8aef2 FDE=(12103410, 12103518)
- +0x90: 0xb8af5e FDE=(12103518, 12103626)
- +0x98: 0xb8afca FDE=(12103626, 12103648)
- +0xa0: 0xb8afe0 FDE=(12103648, 12103704)
- +0xa8: 0xb8b018 FDE=(12103704, 12103760)
- +0xb0: 0x0 FDE=None
- +0xb8: 0x0 FDE=None
- +0xc0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc8: 0xa50370 FDE=(10814320, 10814325)
- +0xd0: 0xb8a698 FDE=(12101272, 12101304)
- +0xd8: 0xb8a6b8 FDE=(12101304, 12101323)
- +0xe0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe8: 0xa50370 FDE=(10814320, 10814325)
- +0xf0: 0xb8a6cc FDE=(12101324, 12101812)
- +0xf8: 0x0 FDE=None
- +0x100: 0x0 FDE=None
- +0x108: 0x9d7de0 FDE=(10321376, 10321377)
- +0x110: 0xa50370 FDE=(10814320, 10814325)
- +0x118: 0xb8b050 FDE=(12103760, 12103763)
- +0x120: 0xb8b054 FDE=(12103764, 12103775)
- +0x128: 0xb8b060 FDE=(12103776, 12103787)
- +0x130: 0xb8b06c FDE=(12103788, 12103944)
- +0x138: 0x0 FDE=None
- +0x140: 0x0 FDE=None
- +0x148: 0x9d7de0 FDE=(10321376, 10321377)
- +0x150: 0xa50370 FDE=(10814320, 10814325)
- +0x158: 0xb8b152 FDE=(12104018, 12104021)
- +0x160: 0xb8b156 FDE=(12104022, 12104033)
- +0x168: 0xa5bbf0 FDE=(10861552, 10861557)
- +0x170: 0xb8b162 FDE=(12104034, 12104178)
#### +0x28 body
      aae9bc:	53                   	push   rbx
      aae9bd:	48 89 fb             	mov    rbx,rdi
      aae9c0:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aae9c4:	e8 bd fa fe ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      aae9c9:	48 89 df             	mov    rdi,rbx
      aae9cc:	5b                   	pop    rbx
      aae9cd:	e9 4e f5 d3 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x180dfd0 codeSlots=38
- +0x0: 0xb884e8 FDE=(12092648, 12092666)
- +0x8: 0xb884fa FDE=(12092666, 12092712)
- +0x10: 0xb88528 FDE=(12092712, 12092749)
- +0x18: 0xaae9b2 FDE=(11200946, 11200955)
- +0x20: 0xaae9bc FDE=(11200956, 11200978)
- +0x28: 0xb8854e FDE=(12092750, 12092769)
- +0x30: 0x0 FDE=None
- +0x38: 0x0 FDE=None
- +0x40: 0xb8ac2a FDE=(12102698, 12102854)
- +0x48: 0xb8acc6 FDE=(12102854, 12102872)
- +0x50: 0xb8acd8 FDE=(12102872, 12102977)
- +0x58: 0xb5f12c FDE=(11923756, 11923864)
- +0x60: 0xb8ad42 FDE=(12102978, 12103086)
- +0x68: 0xb8adae FDE=(12103086, 12103194)
- +0x70: 0xb8ae1a FDE=(12103194, 12103302)
- +0x78: 0xb8ae86 FDE=(12103302, 12103410)
- +0x80: 0xb8aef2 FDE=(12103410, 12103518)
- +0x88: 0xb8af5e FDE=(12103518, 12103626)
- +0x90: 0xb8afca FDE=(12103626, 12103648)
- +0x98: 0xb8afe0 FDE=(12103648, 12103704)
- +0xa0: 0xb8b018 FDE=(12103704, 12103760)
- +0xa8: 0x0 FDE=None
- +0xb0: 0x0 FDE=None
- +0xb8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc0: 0xa50370 FDE=(10814320, 10814325)
- +0xc8: 0xb8a698 FDE=(12101272, 12101304)
- +0xd0: 0xb8a6b8 FDE=(12101304, 12101323)
- +0xd8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe0: 0xa50370 FDE=(10814320, 10814325)
- +0xe8: 0xb8a6cc FDE=(12101324, 12101812)
- +0xf0: 0x0 FDE=None
- +0xf8: 0x0 FDE=None
- +0x100: 0x9d7de0 FDE=(10321376, 10321377)
- +0x108: 0xa50370 FDE=(10814320, 10814325)
- +0x110: 0xb8b050 FDE=(12103760, 12103763)
- +0x118: 0xb8b054 FDE=(12103764, 12103775)
- +0x120: 0xb8b060 FDE=(12103776, 12103787)
- +0x128: 0xb8b06c FDE=(12103788, 12103944)
- +0x130: 0x0 FDE=None
- +0x138: 0x0 FDE=None
- +0x140: 0x9d7de0 FDE=(10321376, 10321377)
- +0x148: 0xa50370 FDE=(10814320, 10814325)
- +0x150: 0xb8b152 FDE=(12104018, 12104021)
- +0x158: 0xb8b156 FDE=(12104022, 12104033)
- +0x160: 0xa5bbf0 FDE=(10861552, 10861557)
- +0x168: 0xb8b162 FDE=(12104034, 12104178)
- +0x170: 0x0 FDE=None
#### +0x28 body
      b8854e:	53                   	push   rbx
      b8854f:	48 89 fb             	mov    rbx,rdi
      b88552:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]
      b88556:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      b88559:	ff 50 18             	call   QWORD PTR [rax+0x18]
      b8855c:	48 89 d8             	mov    rax,rbx
      b8855f:	5b                   	pop    rbx
      b88560:	c3                   	ret

### AP 0x180dfd8 codeSlots=38
- +0x0: 0xb884fa FDE=(12092666, 12092712)
- +0x8: 0xb88528 FDE=(12092712, 12092749)
- +0x10: 0xaae9b2 FDE=(11200946, 11200955)
- +0x18: 0xaae9bc FDE=(11200956, 11200978)
- +0x20: 0xb8854e FDE=(12092750, 12092769)
- +0x28: 0x0 FDE=None
- +0x30: 0x0 FDE=None
- +0x38: 0xb8ac2a FDE=(12102698, 12102854)
- +0x40: 0xb8acc6 FDE=(12102854, 12102872)
- +0x48: 0xb8acd8 FDE=(12102872, 12102977)
- +0x50: 0xb5f12c FDE=(11923756, 11923864)
- +0x58: 0xb8ad42 FDE=(12102978, 12103086)
- +0x60: 0xb8adae FDE=(12103086, 12103194)
- +0x68: 0xb8ae1a FDE=(12103194, 12103302)
- +0x70: 0xb8ae86 FDE=(12103302, 12103410)
- +0x78: 0xb8aef2 FDE=(12103410, 12103518)
- +0x80: 0xb8af5e FDE=(12103518, 12103626)
- +0x88: 0xb8afca FDE=(12103626, 12103648)
- +0x90: 0xb8afe0 FDE=(12103648, 12103704)
- +0x98: 0xb8b018 FDE=(12103704, 12103760)
- +0xa0: 0x0 FDE=None
- +0xa8: 0x0 FDE=None
- +0xb0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb8: 0xa50370 FDE=(10814320, 10814325)
- +0xc0: 0xb8a698 FDE=(12101272, 12101304)
- +0xc8: 0xb8a6b8 FDE=(12101304, 12101323)
- +0xd0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd8: 0xa50370 FDE=(10814320, 10814325)
- +0xe0: 0xb8a6cc FDE=(12101324, 12101812)
- +0xe8: 0x0 FDE=None
- +0xf0: 0x0 FDE=None
- +0xf8: 0x9d7de0 FDE=(10321376, 10321377)
- +0x100: 0xa50370 FDE=(10814320, 10814325)
- +0x108: 0xb8b050 FDE=(12103760, 12103763)
- +0x110: 0xb8b054 FDE=(12103764, 12103775)
- +0x118: 0xb8b060 FDE=(12103776, 12103787)
- +0x120: 0xb8b06c FDE=(12103788, 12103944)
- +0x128: 0x0 FDE=None
- +0x130: 0x0 FDE=None
- +0x138: 0x9d7de0 FDE=(10321376, 10321377)
- +0x140: 0xa50370 FDE=(10814320, 10814325)
- +0x148: 0xb8b152 FDE=(12104018, 12104021)
- +0x150: 0xb8b156 FDE=(12104022, 12104033)
- +0x158: 0xa5bbf0 FDE=(10861552, 10861557)
- +0x160: 0xb8b162 FDE=(12104034, 12104178)
- +0x168: 0x0 FDE=None
- +0x170: 0x0 FDE=None

### AP 0x180dfe0 codeSlots=38
- +0x0: 0xb88528 FDE=(12092712, 12092749)
- +0x8: 0xaae9b2 FDE=(11200946, 11200955)
- +0x10: 0xaae9bc FDE=(11200956, 11200978)
- +0x18: 0xb8854e FDE=(12092750, 12092769)
- +0x20: 0x0 FDE=None
- +0x28: 0x0 FDE=None
- +0x30: 0xb8ac2a FDE=(12102698, 12102854)
- +0x38: 0xb8acc6 FDE=(12102854, 12102872)
- +0x40: 0xb8acd8 FDE=(12102872, 12102977)
- +0x48: 0xb5f12c FDE=(11923756, 11923864)
- +0x50: 0xb8ad42 FDE=(12102978, 12103086)
- +0x58: 0xb8adae FDE=(12103086, 12103194)
- +0x60: 0xb8ae1a FDE=(12103194, 12103302)
- +0x68: 0xb8ae86 FDE=(12103302, 12103410)
- +0x70: 0xb8aef2 FDE=(12103410, 12103518)
- +0x78: 0xb8af5e FDE=(12103518, 12103626)
- +0x80: 0xb8afca FDE=(12103626, 12103648)
- +0x88: 0xb8afe0 FDE=(12103648, 12103704)
- +0x90: 0xb8b018 FDE=(12103704, 12103760)
- +0x98: 0x0 FDE=None
- +0xa0: 0x0 FDE=None
- +0xa8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb0: 0xa50370 FDE=(10814320, 10814325)
- +0xb8: 0xb8a698 FDE=(12101272, 12101304)
- +0xc0: 0xb8a6b8 FDE=(12101304, 12101323)
- +0xc8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd0: 0xa50370 FDE=(10814320, 10814325)
- +0xd8: 0xb8a6cc FDE=(12101324, 12101812)
- +0xe0: 0x0 FDE=None
- +0xe8: 0x0 FDE=None
- +0xf0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xf8: 0xa50370 FDE=(10814320, 10814325)
- +0x100: 0xb8b050 FDE=(12103760, 12103763)
- +0x108: 0xb8b054 FDE=(12103764, 12103775)
- +0x110: 0xb8b060 FDE=(12103776, 12103787)
- +0x118: 0xb8b06c FDE=(12103788, 12103944)
- +0x120: 0x0 FDE=None
- +0x128: 0x0 FDE=None
- +0x130: 0x9d7de0 FDE=(10321376, 10321377)
- +0x138: 0xa50370 FDE=(10814320, 10814325)
- +0x140: 0xb8b152 FDE=(12104018, 12104021)
- +0x148: 0xb8b156 FDE=(12104022, 12104033)
- +0x150: 0xa5bbf0 FDE=(10861552, 10861557)
- +0x158: 0xb8b162 FDE=(12104034, 12104178)
- +0x160: 0x0 FDE=None
- +0x168: 0x0 FDE=None
- +0x170: 0xb8b202 FDE=(12104194, 12104228)

### AP 0x180dfe8 codeSlots=38
- +0x0: 0xaae9b2 FDE=(11200946, 11200955)
- +0x8: 0xaae9bc FDE=(11200956, 11200978)
- +0x10: 0xb8854e FDE=(12092750, 12092769)
- +0x18: 0x0 FDE=None
- +0x20: 0x0 FDE=None
- +0x28: 0xb8ac2a FDE=(12102698, 12102854)
- +0x30: 0xb8acc6 FDE=(12102854, 12102872)
- +0x38: 0xb8acd8 FDE=(12102872, 12102977)
- +0x40: 0xb5f12c FDE=(11923756, 11923864)
- +0x48: 0xb8ad42 FDE=(12102978, 12103086)
- +0x50: 0xb8adae FDE=(12103086, 12103194)
- +0x58: 0xb8ae1a FDE=(12103194, 12103302)
- +0x60: 0xb8ae86 FDE=(12103302, 12103410)
- +0x68: 0xb8aef2 FDE=(12103410, 12103518)
- +0x70: 0xb8af5e FDE=(12103518, 12103626)
- +0x78: 0xb8afca FDE=(12103626, 12103648)
- +0x80: 0xb8afe0 FDE=(12103648, 12103704)
- +0x88: 0xb8b018 FDE=(12103704, 12103760)
- +0x90: 0x0 FDE=None
- +0x98: 0x0 FDE=None
- +0xa0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa8: 0xa50370 FDE=(10814320, 10814325)
- +0xb0: 0xb8a698 FDE=(12101272, 12101304)
- +0xb8: 0xb8a6b8 FDE=(12101304, 12101323)
- +0xc0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc8: 0xa50370 FDE=(10814320, 10814325)
- +0xd0: 0xb8a6cc FDE=(12101324, 12101812)
- +0xd8: 0x0 FDE=None
- +0xe0: 0x0 FDE=None
- +0xe8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xf0: 0xa50370 FDE=(10814320, 10814325)
- +0xf8: 0xb8b050 FDE=(12103760, 12103763)
- +0x100: 0xb8b054 FDE=(12103764, 12103775)
- +0x108: 0xb8b060 FDE=(12103776, 12103787)
- +0x110: 0xb8b06c FDE=(12103788, 12103944)
- +0x118: 0x0 FDE=None
- +0x120: 0x0 FDE=None
- +0x128: 0x9d7de0 FDE=(10321376, 10321377)
- +0x130: 0xa50370 FDE=(10814320, 10814325)
- +0x138: 0xb8b152 FDE=(12104018, 12104021)
- +0x140: 0xb8b156 FDE=(12104022, 12104033)
- +0x148: 0xa5bbf0 FDE=(10861552, 10861557)
- +0x150: 0xb8b162 FDE=(12104034, 12104178)
- +0x158: 0x0 FDE=None
- +0x160: 0x0 FDE=None
- +0x168: 0xb8b202 FDE=(12104194, 12104228)
- +0x170: 0xb8b224 FDE=(12104228, 12104246)
#### +0x28 body
      b8ac2a:	53                   	push   rbx
      b8ac2b:	48 89 fb             	mov    rbx,rdi
      b8ac2e:	48 8d 05 db 33 c8 00 	lea    rax,[rip+0xc833db]        # 180e010 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3cd0>
      b8ac35:	48 89 07             	mov    QWORD PTR [rdi],rax
      b8ac38:	48 81 c7 d0 02 00 00 	add    rdi,0x2d0
      b8ac3f:	e8 22 f2 c4 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      b8ac44:	48 8d bb 78 02 00 00 	lea    rdi,[rbx+0x278]
      b8ac4b:	e8 16 f2 c4 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      b8ac50:	48 8d bb 20 02 00 00 	lea    rdi,[rbx+0x220]
      b8ac57:	e8 0a f2 c4 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      b8ac5c:	48 8d bb c8 01 00 00 	lea    rdi,[rbx+0x1c8]
      b8ac63:	e8 fe f1 c4 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      b8ac68:	48 8d bb 70 01 00 00 	lea    rdi,[rbx+0x170]
      b8ac6f:	e8 f2 f1 c4 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      b8ac74:	48 8d bb 18 01 00 00 	lea    rdi,[rbx+0x118]
      b8ac7b:	e8 e6 f1 c4 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      b8ac80:	48 8d bb c0 00 00 00 	lea    rdi,[rbx+0xc0]
      b8ac87:	e8 da f1 c4 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      b8ac8c:	48 8d 7b 68          	lea    rdi,[rbx+0x68]
      b8ac90:	e8 d1 f1 c4 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      b8ac95:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
      b8ac99:	e8 ce ef ff ff       	call   b89c6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6c0c>
      b8ac9e:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
      b8aca2:	e8 2d ef c4 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      b8aca7:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
      b8acab:	e8 24 ef c4 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      b8acb0:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
      b8acb4:	e8 1b ef c4 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      b8acb9:	48 83 c3 10          	add    rbx,0x10
      b8acbd:	48 89 df             	mov    rdi,rbx
      b8acc0:	5b                   	pop    rbx
      b8acc1:	e9 0e ef c4 00       	jmp    17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>

### AP 0x180dff0 codeSlots=38
- +0x0: 0xaae9bc FDE=(11200956, 11200978)
- +0x8: 0xb8854e FDE=(12092750, 12092769)
- +0x10: 0x0 FDE=None
- +0x18: 0x0 FDE=None
- +0x20: 0xb8ac2a FDE=(12102698, 12102854)
- +0x28: 0xb8acc6 FDE=(12102854, 12102872)
- +0x30: 0xb8acd8 FDE=(12102872, 12102977)
- +0x38: 0xb5f12c FDE=(11923756, 11923864)
- +0x40: 0xb8ad42 FDE=(12102978, 12103086)
- +0x48: 0xb8adae FDE=(12103086, 12103194)
- +0x50: 0xb8ae1a FDE=(12103194, 12103302)
- +0x58: 0xb8ae86 FDE=(12103302, 12103410)
- +0x60: 0xb8aef2 FDE=(12103410, 12103518)
- +0x68: 0xb8af5e FDE=(12103518, 12103626)
- +0x70: 0xb8afca FDE=(12103626, 12103648)
- +0x78: 0xb8afe0 FDE=(12103648, 12103704)
- +0x80: 0xb8b018 FDE=(12103704, 12103760)
- +0x88: 0x0 FDE=None
- +0x90: 0x0 FDE=None
- +0x98: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa0: 0xa50370 FDE=(10814320, 10814325)
- +0xa8: 0xb8a698 FDE=(12101272, 12101304)
- +0xb0: 0xb8a6b8 FDE=(12101304, 12101323)
- +0xb8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc0: 0xa50370 FDE=(10814320, 10814325)
- +0xc8: 0xb8a6cc FDE=(12101324, 12101812)
- +0xd0: 0x0 FDE=None
- +0xd8: 0x0 FDE=None
- +0xe0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe8: 0xa50370 FDE=(10814320, 10814325)
- +0xf0: 0xb8b050 FDE=(12103760, 12103763)
- +0xf8: 0xb8b054 FDE=(12103764, 12103775)
- +0x100: 0xb8b060 FDE=(12103776, 12103787)
- +0x108: 0xb8b06c FDE=(12103788, 12103944)
- +0x110: 0x0 FDE=None
- +0x118: 0x0 FDE=None
- +0x120: 0x9d7de0 FDE=(10321376, 10321377)
- +0x128: 0xa50370 FDE=(10814320, 10814325)
- +0x130: 0xb8b152 FDE=(12104018, 12104021)
- +0x138: 0xb8b156 FDE=(12104022, 12104033)
- +0x140: 0xa5bbf0 FDE=(10861552, 10861557)
- +0x148: 0xb8b162 FDE=(12104034, 12104178)
- +0x150: 0x0 FDE=None
- +0x158: 0x0 FDE=None
- +0x160: 0xb8b202 FDE=(12104194, 12104228)
- +0x168: 0xb8b224 FDE=(12104228, 12104246)
- +0x170: 0x9d7de0 FDE=(10321376, 10321377)
#### +0x28 body
      b8acc6:	53                   	push   rbx
      b8acc7:	48 89 fb             	mov    rbx,rdi
      b8acca:	e8 5b ff ff ff       	call   b8ac2a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7bca>
      b8accf:	48 89 df             	mov    rdi,rbx
      b8acd2:	5b                   	pop    rbx
      b8acd3:	e9 48 32 c6 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x180dff8 codeSlots=38
- +0x0: 0xb8854e FDE=(12092750, 12092769)
- +0x8: 0x0 FDE=None
- +0x10: 0x0 FDE=None
- +0x18: 0xb8ac2a FDE=(12102698, 12102854)
- +0x20: 0xb8acc6 FDE=(12102854, 12102872)
- +0x28: 0xb8acd8 FDE=(12102872, 12102977)
- +0x30: 0xb5f12c FDE=(11923756, 11923864)
- +0x38: 0xb8ad42 FDE=(12102978, 12103086)
- +0x40: 0xb8adae FDE=(12103086, 12103194)
- +0x48: 0xb8ae1a FDE=(12103194, 12103302)
- +0x50: 0xb8ae86 FDE=(12103302, 12103410)
- +0x58: 0xb8aef2 FDE=(12103410, 12103518)
- +0x60: 0xb8af5e FDE=(12103518, 12103626)
- +0x68: 0xb8afca FDE=(12103626, 12103648)
- +0x70: 0xb8afe0 FDE=(12103648, 12103704)
- +0x78: 0xb8b018 FDE=(12103704, 12103760)
- +0x80: 0x0 FDE=None
- +0x88: 0x0 FDE=None
- +0x90: 0x9d7de0 FDE=(10321376, 10321377)
- +0x98: 0xa50370 FDE=(10814320, 10814325)
- +0xa0: 0xb8a698 FDE=(12101272, 12101304)
- +0xa8: 0xb8a6b8 FDE=(12101304, 12101323)
- +0xb0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb8: 0xa50370 FDE=(10814320, 10814325)
- +0xc0: 0xb8a6cc FDE=(12101324, 12101812)
- +0xc8: 0x0 FDE=None
- +0xd0: 0x0 FDE=None
- +0xd8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe0: 0xa50370 FDE=(10814320, 10814325)
- +0xe8: 0xb8b050 FDE=(12103760, 12103763)
- +0xf0: 0xb8b054 FDE=(12103764, 12103775)
- +0xf8: 0xb8b060 FDE=(12103776, 12103787)
- +0x100: 0xb8b06c FDE=(12103788, 12103944)
- +0x108: 0x0 FDE=None
- +0x110: 0x0 FDE=None
- +0x118: 0x9d7de0 FDE=(10321376, 10321377)
- +0x120: 0xa50370 FDE=(10814320, 10814325)
- +0x128: 0xb8b152 FDE=(12104018, 12104021)
- +0x130: 0xb8b156 FDE=(12104022, 12104033)
- +0x138: 0xa5bbf0 FDE=(10861552, 10861557)
- +0x140: 0xb8b162 FDE=(12104034, 12104178)
- +0x148: 0x0 FDE=None
- +0x150: 0x0 FDE=None
- +0x158: 0xb8b202 FDE=(12104194, 12104228)
- +0x160: 0xb8b224 FDE=(12104228, 12104246)
- +0x168: 0x9d7de0 FDE=(10321376, 10321377)
- +0x170: 0x9d7de0 FDE=(10321376, 10321377)
#### +0x28 body
      b8acd8:	41 57                	push   r15
      b8acda:	41 56                	push   r14
      b8acdc:	53                   	push   rbx
      b8acdd:	48 83 ec 50          	sub    rsp,0x50
      b8ace1:	49 89 f6             	mov    r14,rsi
      b8ace4:	48 89 fb             	mov    rbx,rdi
      b8ace7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b8acee:	00 00 
      b8acf0:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      b8acf5:	49 83 c6 68          	add    r14,0x68
      b8acf9:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
      b8acfe:	4c 89 ff             	mov    rdi,r15
      b8ad01:	48 89 d6             	mov    rsi,rdx
      b8ad04:	e8 31 fa c4 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
      b8ad09:	48 89 df             	mov    rdi,rbx
      b8ad0c:	4c 89 f6             	mov    rsi,r14
      b8ad0f:	4c 89 fa             	mov    rdx,r15
      b8ad12:	e8 b3 f2 c4 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
      b8ad17:	4c 89 ff             	mov    rdi,r15
      b8ad1a:	e8 c9 fa c4 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      b8ad1f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b8ad26:	00 00 
      b8ad28:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
      b8ad2d:	75 0d                	jne    b8ad3c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7cdc>
      b8ad2f:	48 89 d8             	mov    rax,rbx
      b8ad32:	48 83 c4 50          	add    rsp,0x50
      b8ad36:	5b                   	pop    rbx
      b8ad37:	41 5e                	pop    r14
      b8ad39:	41 5f                	pop    r15
      b8ad3b:	c3                   	ret
      b8ad3c:	e8 6f 4d c6 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x180e000 codeSlots=38
- +0x0: 0x0 FDE=None
- +0x8: 0x0 FDE=None
- +0x10: 0xb8ac2a FDE=(12102698, 12102854)
- +0x18: 0xb8acc6 FDE=(12102854, 12102872)
- +0x20: 0xb8acd8 FDE=(12102872, 12102977)
- +0x28: 0xb5f12c FDE=(11923756, 11923864)
- +0x30: 0xb8ad42 FDE=(12102978, 12103086)
- +0x38: 0xb8adae FDE=(12103086, 12103194)
- +0x40: 0xb8ae1a FDE=(12103194, 12103302)
- +0x48: 0xb8ae86 FDE=(12103302, 12103410)
- +0x50: 0xb8aef2 FDE=(12103410, 12103518)
- +0x58: 0xb8af5e FDE=(12103518, 12103626)
- +0x60: 0xb8afca FDE=(12103626, 12103648)
- +0x68: 0xb8afe0 FDE=(12103648, 12103704)
- +0x70: 0xb8b018 FDE=(12103704, 12103760)
- +0x78: 0x0 FDE=None
- +0x80: 0x0 FDE=None
- +0x88: 0x9d7de0 FDE=(10321376, 10321377)
- +0x90: 0xa50370 FDE=(10814320, 10814325)
- +0x98: 0xb8a698 FDE=(12101272, 12101304)
- +0xa0: 0xb8a6b8 FDE=(12101304, 12101323)
- +0xa8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb0: 0xa50370 FDE=(10814320, 10814325)
- +0xb8: 0xb8a6cc FDE=(12101324, 12101812)
- +0xc0: 0x0 FDE=None
- +0xc8: 0x0 FDE=None
- +0xd0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd8: 0xa50370 FDE=(10814320, 10814325)
- +0xe0: 0xb8b050 FDE=(12103760, 12103763)
- +0xe8: 0xb8b054 FDE=(12103764, 12103775)
- +0xf0: 0xb8b060 FDE=(12103776, 12103787)
- +0xf8: 0xb8b06c FDE=(12103788, 12103944)
- +0x100: 0x0 FDE=None
- +0x108: 0x0 FDE=None
- +0x110: 0x9d7de0 FDE=(10321376, 10321377)
- +0x118: 0xa50370 FDE=(10814320, 10814325)
- +0x120: 0xb8b152 FDE=(12104018, 12104021)
- +0x128: 0xb8b156 FDE=(12104022, 12104033)
- +0x130: 0xa5bbf0 FDE=(10861552, 10861557)
- +0x138: 0xb8b162 FDE=(12104034, 12104178)
- +0x140: 0x0 FDE=None
- +0x148: 0x0 FDE=None
- +0x150: 0xb8b202 FDE=(12104194, 12104228)
- +0x158: 0xb8b224 FDE=(12104228, 12104246)
- +0x160: 0x9d7de0 FDE=(10321376, 10321377)
- +0x168: 0x9d7de0 FDE=(10321376, 10321377)
- +0x170: 0xac3ae0 FDE=(11287264, 11287269)
#### +0x28 body
      b5f12c:	41 57                	push   r15
      b5f12e:	41 56                	push   r14
      b5f130:	53                   	push   rbx
      b5f131:	48 83 ec 50          	sub    rsp,0x50
      b5f135:	49 89 f6             	mov    r14,rsi
      b5f138:	48 89 fb             	mov    rbx,rdi
      b5f13b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b5f142:	00 00 
      b5f144:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      b5f149:	49 81 c6 c0 00 00 00 	add    r14,0xc0
      b5f150:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
      b5f155:	4c 89 ff             	mov    rdi,r15
      b5f158:	48 89 d6             	mov    rsi,rdx
      b5f15b:	e8 da b5 c7 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
      b5f160:	48 89 df             	mov    rdi,rbx
      b5f163:	4c 89 f6             	mov    rsi,r14
      b5f166:	4c 89 fa             	mov    rdx,r15
      b5f169:	e8 5c ae c7 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
      b5f16e:	4c 89 ff             	mov    rdi,r15
      b5f171:	e8 72 b6 c7 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      b5f176:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b5f17d:	00 00 
      b5f17f:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
      b5f184:	75 0d                	jne    b5f193 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac133>
      b5f186:	48 89 d8             	mov    rax,rbx
      b5f189:	48 83 c4 50          	add    rsp,0x50
      b5f18d:	5b                   	pop    rbx
      b5f18e:	41 5e                	pop    r14
      b5f190:	41 5f                	pop    r15
      b5f192:	c3                   	ret
      b5f193:	e8 18 09 c9 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x180e008 codeSlots=38
- +0x0: 0x0 FDE=None
- +0x8: 0xb8ac2a FDE=(12102698, 12102854)
- +0x10: 0xb8acc6 FDE=(12102854, 12102872)
- +0x18: 0xb8acd8 FDE=(12102872, 12102977)
- +0x20: 0xb5f12c FDE=(11923756, 11923864)
- +0x28: 0xb8ad42 FDE=(12102978, 12103086)
- +0x30: 0xb8adae FDE=(12103086, 12103194)
- +0x38: 0xb8ae1a FDE=(12103194, 12103302)
- +0x40: 0xb8ae86 FDE=(12103302, 12103410)
- +0x48: 0xb8aef2 FDE=(12103410, 12103518)
- +0x50: 0xb8af5e FDE=(12103518, 12103626)
- +0x58: 0xb8afca FDE=(12103626, 12103648)
- +0x60: 0xb8afe0 FDE=(12103648, 12103704)
- +0x68: 0xb8b018 FDE=(12103704, 12103760)
- +0x70: 0x0 FDE=None
- +0x78: 0x0 FDE=None
- +0x80: 0x9d7de0 FDE=(10321376, 10321377)
- +0x88: 0xa50370 FDE=(10814320, 10814325)
- +0x90: 0xb8a698 FDE=(12101272, 12101304)
- +0x98: 0xb8a6b8 FDE=(12101304, 12101323)
- +0xa0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa8: 0xa50370 FDE=(10814320, 10814325)
- +0xb0: 0xb8a6cc FDE=(12101324, 12101812)
- +0xb8: 0x0 FDE=None
- +0xc0: 0x0 FDE=None
- +0xc8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd0: 0xa50370 FDE=(10814320, 10814325)
- +0xd8: 0xb8b050 FDE=(12103760, 12103763)
- +0xe0: 0xb8b054 FDE=(12103764, 12103775)
- +0xe8: 0xb8b060 FDE=(12103776, 12103787)
- +0xf0: 0xb8b06c FDE=(12103788, 12103944)
- +0xf8: 0x0 FDE=None
- +0x100: 0x0 FDE=None
- +0x108: 0x9d7de0 FDE=(10321376, 10321377)
- +0x110: 0xa50370 FDE=(10814320, 10814325)
- +0x118: 0xb8b152 FDE=(12104018, 12104021)
- +0x120: 0xb8b156 FDE=(12104022, 12104033)
- +0x128: 0xa5bbf0 FDE=(10861552, 10861557)
- +0x130: 0xb8b162 FDE=(12104034, 12104178)
- +0x138: 0x0 FDE=None
- +0x140: 0x0 FDE=None
- +0x148: 0xb8b202 FDE=(12104194, 12104228)
- +0x150: 0xb8b224 FDE=(12104228, 12104246)
- +0x158: 0x9d7de0 FDE=(10321376, 10321377)
- +0x160: 0x9d7de0 FDE=(10321376, 10321377)
- +0x168: 0xac3ae0 FDE=(11287264, 11287269)
- +0x170: 0xa7a004 FDE=(10985476, 10985481)
#### +0x28 body
      b8ad42:	41 57                	push   r15
      b8ad44:	41 56                	push   r14
      b8ad46:	53                   	push   rbx
      b8ad47:	48 83 ec 50          	sub    rsp,0x50
      b8ad4b:	49 89 f6             	mov    r14,rsi
      b8ad4e:	48 89 fb             	mov    rbx,rdi
      b8ad51:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b8ad58:	00 00 
      b8ad5a:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      b8ad5f:	49 81 c6 18 01 00 00 	add    r14,0x118
      b8ad66:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
      b8ad6b:	4c 89 ff             	mov    rdi,r15
      b8ad6e:	48 89 d6             	mov    rsi,rdx
      b8ad71:	e8 c4 f9 c4 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
      b8ad76:	48 89 df             	mov    rdi,rbx
      b8ad79:	4c 89 f6             	mov    rsi,r14
      b8ad7c:	4c 89 fa             	mov    rdx,r15
      b8ad7f:	e8 46 f2 c4 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
      b8ad84:	4c 89 ff             	mov    rdi,r15
      b8ad87:	e8 5c fa c4 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      b8ad8c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b8ad93:	00 00 
      b8ad95:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
      b8ad9a:	75 0d                	jne    b8ada9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7d49>
      b8ad9c:	48 89 d8             	mov    rax,rbx
      b8ad9f:	48 83 c4 50          	add    rsp,0x50
      b8ada3:	5b                   	pop    rbx
      b8ada4:	41 5e                	pop    r14
      b8ada6:	41 5f                	pop    r15
      b8ada8:	c3                   	ret
      b8ada9:	e8 02 4d c6 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x180e010 codeSlots=38
- +0x0: 0xb8ac2a FDE=(12102698, 12102854)
- +0x8: 0xb8acc6 FDE=(12102854, 12102872)
- +0x10: 0xb8acd8 FDE=(12102872, 12102977)
- +0x18: 0xb5f12c FDE=(11923756, 11923864)
- +0x20: 0xb8ad42 FDE=(12102978, 12103086)
- +0x28: 0xb8adae FDE=(12103086, 12103194)
- +0x30: 0xb8ae1a FDE=(12103194, 12103302)
- +0x38: 0xb8ae86 FDE=(12103302, 12103410)
- +0x40: 0xb8aef2 FDE=(12103410, 12103518)
- +0x48: 0xb8af5e FDE=(12103518, 12103626)
- +0x50: 0xb8afca FDE=(12103626, 12103648)
- +0x58: 0xb8afe0 FDE=(12103648, 12103704)
- +0x60: 0xb8b018 FDE=(12103704, 12103760)
- +0x68: 0x0 FDE=None
- +0x70: 0x0 FDE=None
- +0x78: 0x9d7de0 FDE=(10321376, 10321377)
- +0x80: 0xa50370 FDE=(10814320, 10814325)
- +0x88: 0xb8a698 FDE=(12101272, 12101304)
- +0x90: 0xb8a6b8 FDE=(12101304, 12101323)
- +0x98: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa0: 0xa50370 FDE=(10814320, 10814325)
- +0xa8: 0xb8a6cc FDE=(12101324, 12101812)
- +0xb0: 0x0 FDE=None
- +0xb8: 0x0 FDE=None
- +0xc0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc8: 0xa50370 FDE=(10814320, 10814325)
- +0xd0: 0xb8b050 FDE=(12103760, 12103763)
- +0xd8: 0xb8b054 FDE=(12103764, 12103775)
- +0xe0: 0xb8b060 FDE=(12103776, 12103787)
- +0xe8: 0xb8b06c FDE=(12103788, 12103944)
- +0xf0: 0x0 FDE=None
- +0xf8: 0x0 FDE=None
- +0x100: 0x9d7de0 FDE=(10321376, 10321377)
- +0x108: 0xa50370 FDE=(10814320, 10814325)
- +0x110: 0xb8b152 FDE=(12104018, 12104021)
- +0x118: 0xb8b156 FDE=(12104022, 12104033)
- +0x120: 0xa5bbf0 FDE=(10861552, 10861557)
- +0x128: 0xb8b162 FDE=(12104034, 12104178)
- +0x130: 0x0 FDE=None
- +0x138: 0x0 FDE=None
- +0x140: 0xb8b202 FDE=(12104194, 12104228)
- +0x148: 0xb8b224 FDE=(12104228, 12104246)
- +0x150: 0x9d7de0 FDE=(10321376, 10321377)
- +0x158: 0x9d7de0 FDE=(10321376, 10321377)
- +0x160: 0xac3ae0 FDE=(11287264, 11287269)
- +0x168: 0xa7a004 FDE=(10985476, 10985481)
- +0x170: 0x0 FDE=None
#### +0x28 body
      b8adae:	41 57                	push   r15
      b8adb0:	41 56                	push   r14
      b8adb2:	53                   	push   rbx
      b8adb3:	48 83 ec 50          	sub    rsp,0x50
      b8adb7:	49 89 f6             	mov    r14,rsi
      b8adba:	48 89 fb             	mov    rbx,rdi
      b8adbd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b8adc4:	00 00 
      b8adc6:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      b8adcb:	49 81 c6 70 01 00 00 	add    r14,0x170
      b8add2:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
      b8add7:	4c 89 ff             	mov    rdi,r15
      b8adda:	48 89 d6             	mov    rsi,rdx
      b8addd:	e8 58 f9 c4 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
      b8ade2:	48 89 df             	mov    rdi,rbx
      b8ade5:	4c 89 f6             	mov    rsi,r14
      b8ade8:	4c 89 fa             	mov    rdx,r15
      b8adeb:	e8 da f1 c4 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
      b8adf0:	4c 89 ff             	mov    rdi,r15
      b8adf3:	e8 f0 f9 c4 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      b8adf8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b8adff:	00 00 
      b8ae01:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
      b8ae06:	75 0d                	jne    b8ae15 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7db5>
      b8ae08:	48 89 d8             	mov    rax,rbx
      b8ae0b:	48 83 c4 50          	add    rsp,0x50
      b8ae0f:	5b                   	pop    rbx
      b8ae10:	41 5e                	pop    r14
      b8ae12:	41 5f                	pop    r15
      b8ae14:	c3                   	ret
      b8ae15:	e8 96 4c c6 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x180e018 codeSlots=38
- +0x0: 0xb8acc6 FDE=(12102854, 12102872)
- +0x8: 0xb8acd8 FDE=(12102872, 12102977)
- +0x10: 0xb5f12c FDE=(11923756, 11923864)
- +0x18: 0xb8ad42 FDE=(12102978, 12103086)
- +0x20: 0xb8adae FDE=(12103086, 12103194)
- +0x28: 0xb8ae1a FDE=(12103194, 12103302)
- +0x30: 0xb8ae86 FDE=(12103302, 12103410)
- +0x38: 0xb8aef2 FDE=(12103410, 12103518)
- +0x40: 0xb8af5e FDE=(12103518, 12103626)
- +0x48: 0xb8afca FDE=(12103626, 12103648)
- +0x50: 0xb8afe0 FDE=(12103648, 12103704)
- +0x58: 0xb8b018 FDE=(12103704, 12103760)
- +0x60: 0x0 FDE=None
- +0x68: 0x0 FDE=None
- +0x70: 0x9d7de0 FDE=(10321376, 10321377)
- +0x78: 0xa50370 FDE=(10814320, 10814325)
- +0x80: 0xb8a698 FDE=(12101272, 12101304)
- +0x88: 0xb8a6b8 FDE=(12101304, 12101323)
- +0x90: 0x9d7de0 FDE=(10321376, 10321377)
- +0x98: 0xa50370 FDE=(10814320, 10814325)
- +0xa0: 0xb8a6cc FDE=(12101324, 12101812)
- +0xa8: 0x0 FDE=None
- +0xb0: 0x0 FDE=None
- +0xb8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc0: 0xa50370 FDE=(10814320, 10814325)
- +0xc8: 0xb8b050 FDE=(12103760, 12103763)
- +0xd0: 0xb8b054 FDE=(12103764, 12103775)
- +0xd8: 0xb8b060 FDE=(12103776, 12103787)
- +0xe0: 0xb8b06c FDE=(12103788, 12103944)
- +0xe8: 0x0 FDE=None
- +0xf0: 0x0 FDE=None
- +0xf8: 0x9d7de0 FDE=(10321376, 10321377)
- +0x100: 0xa50370 FDE=(10814320, 10814325)
- +0x108: 0xb8b152 FDE=(12104018, 12104021)
- +0x110: 0xb8b156 FDE=(12104022, 12104033)
- +0x118: 0xa5bbf0 FDE=(10861552, 10861557)
- +0x120: 0xb8b162 FDE=(12104034, 12104178)
- +0x128: 0x0 FDE=None
- +0x130: 0x0 FDE=None
- +0x138: 0xb8b202 FDE=(12104194, 12104228)
- +0x140: 0xb8b224 FDE=(12104228, 12104246)
- +0x148: 0x9d7de0 FDE=(10321376, 10321377)
- +0x150: 0x9d7de0 FDE=(10321376, 10321377)
- +0x158: 0xac3ae0 FDE=(11287264, 11287269)
- +0x160: 0xa7a004 FDE=(10985476, 10985481)
- +0x168: 0x0 FDE=None
- +0x170: 0x0 FDE=None
#### +0x28 body
      b8ae1a:	41 57                	push   r15
      b8ae1c:	41 56                	push   r14
      b8ae1e:	53                   	push   rbx
      b8ae1f:	48 83 ec 50          	sub    rsp,0x50
      b8ae23:	49 89 f6             	mov    r14,rsi
      b8ae26:	48 89 fb             	mov    rbx,rdi
      b8ae29:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b8ae30:	00 00 
      b8ae32:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      b8ae37:	49 81 c6 78 02 00 00 	add    r14,0x278
      b8ae3e:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
      b8ae43:	4c 89 ff             	mov    rdi,r15
      b8ae46:	48 89 d6             	mov    rsi,rdx
      b8ae49:	e8 ec f8 c4 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
      b8ae4e:	48 89 df             	mov    rdi,rbx
      b8ae51:	4c 89 f6             	mov    rsi,r14
      b8ae54:	4c 89 fa             	mov    rdx,r15
      b8ae57:	e8 6e f1 c4 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
      b8ae5c:	4c 89 ff             	mov    rdi,r15
      b8ae5f:	e8 84 f9 c4 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      b8ae64:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b8ae6b:	00 00 
      b8ae6d:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
      b8ae72:	75 0d                	jne    b8ae81 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7e21>
      b8ae74:	48 89 d8             	mov    rax,rbx
      b8ae77:	48 83 c4 50          	add    rsp,0x50
      b8ae7b:	5b                   	pop    rbx
      b8ae7c:	41 5e                	pop    r14
      b8ae7e:	41 5f                	pop    r15
      b8ae80:	c3                   	ret
      b8ae81:	e8 2a 4c c6 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x180e020 codeSlots=38
- +0x0: 0xb8acd8 FDE=(12102872, 12102977)
- +0x8: 0xb5f12c FDE=(11923756, 11923864)
- +0x10: 0xb8ad42 FDE=(12102978, 12103086)
- +0x18: 0xb8adae FDE=(12103086, 12103194)
- +0x20: 0xb8ae1a FDE=(12103194, 12103302)
- +0x28: 0xb8ae86 FDE=(12103302, 12103410)
- +0x30: 0xb8aef2 FDE=(12103410, 12103518)
- +0x38: 0xb8af5e FDE=(12103518, 12103626)
- +0x40: 0xb8afca FDE=(12103626, 12103648)
- +0x48: 0xb8afe0 FDE=(12103648, 12103704)
- +0x50: 0xb8b018 FDE=(12103704, 12103760)
- +0x58: 0x0 FDE=None
- +0x60: 0x0 FDE=None
- +0x68: 0x9d7de0 FDE=(10321376, 10321377)
- +0x70: 0xa50370 FDE=(10814320, 10814325)
- +0x78: 0xb8a698 FDE=(12101272, 12101304)
- +0x80: 0xb8a6b8 FDE=(12101304, 12101323)
- +0x88: 0x9d7de0 FDE=(10321376, 10321377)
- +0x90: 0xa50370 FDE=(10814320, 10814325)
- +0x98: 0xb8a6cc FDE=(12101324, 12101812)
- +0xa0: 0x0 FDE=None
- +0xa8: 0x0 FDE=None
- +0xb0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb8: 0xa50370 FDE=(10814320, 10814325)
- +0xc0: 0xb8b050 FDE=(12103760, 12103763)
- +0xc8: 0xb8b054 FDE=(12103764, 12103775)
- +0xd0: 0xb8b060 FDE=(12103776, 12103787)
- +0xd8: 0xb8b06c FDE=(12103788, 12103944)
- +0xe0: 0x0 FDE=None
- +0xe8: 0x0 FDE=None
- +0xf0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xf8: 0xa50370 FDE=(10814320, 10814325)
- +0x100: 0xb8b152 FDE=(12104018, 12104021)
- +0x108: 0xb8b156 FDE=(12104022, 12104033)
- +0x110: 0xa5bbf0 FDE=(10861552, 10861557)
- +0x118: 0xb8b162 FDE=(12104034, 12104178)
- +0x120: 0x0 FDE=None
- +0x128: 0x0 FDE=None
- +0x130: 0xb8b202 FDE=(12104194, 12104228)
- +0x138: 0xb8b224 FDE=(12104228, 12104246)
- +0x140: 0x9d7de0 FDE=(10321376, 10321377)
- +0x148: 0x9d7de0 FDE=(10321376, 10321377)
- +0x150: 0xac3ae0 FDE=(11287264, 11287269)
- +0x158: 0xa7a004 FDE=(10985476, 10985481)
- +0x160: 0x0 FDE=None
- +0x168: 0x0 FDE=None
- +0x170: 0x9d7de0 FDE=(10321376, 10321377)
#### +0x28 body
      b8ae86:	41 57                	push   r15
      b8ae88:	41 56                	push   r14
      b8ae8a:	53                   	push   rbx
      b8ae8b:	48 83 ec 50          	sub    rsp,0x50
      b8ae8f:	49 89 f6             	mov    r14,rsi
      b8ae92:	48 89 fb             	mov    rbx,rdi
      b8ae95:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b8ae9c:	00 00 
      b8ae9e:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      b8aea3:	49 81 c6 c8 01 00 00 	add    r14,0x1c8
      b8aeaa:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
      b8aeaf:	4c 89 ff             	mov    rdi,r15
      b8aeb2:	48 89 d6             	mov    rsi,rdx
      b8aeb5:	e8 80 f8 c4 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
      b8aeba:	48 89 df             	mov    rdi,rbx
      b8aebd:	4c 89 f6             	mov    rsi,r14
      b8aec0:	4c 89 fa             	mov    rdx,r15
      b8aec3:	e8 02 f1 c4 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
      b8aec8:	4c 89 ff             	mov    rdi,r15
      b8aecb:	e8 18 f9 c4 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      b8aed0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b8aed7:	00 00 
      b8aed9:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
      b8aede:	75 0d                	jne    b8aeed <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7e8d>
      b8aee0:	48 89 d8             	mov    rax,rbx
      b8aee3:	48 83 c4 50          	add    rsp,0x50
      b8aee7:	5b                   	pop    rbx
      b8aee8:	41 5e                	pop    r14
      b8aeea:	41 5f                	pop    r15
      b8aeec:	c3                   	ret
      b8aeed:	e8 be 4b c6 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x180e028 codeSlots=38
- +0x0: 0xb5f12c FDE=(11923756, 11923864)
- +0x8: 0xb8ad42 FDE=(12102978, 12103086)
- +0x10: 0xb8adae FDE=(12103086, 12103194)
- +0x18: 0xb8ae1a FDE=(12103194, 12103302)
- +0x20: 0xb8ae86 FDE=(12103302, 12103410)
- +0x28: 0xb8aef2 FDE=(12103410, 12103518)
- +0x30: 0xb8af5e FDE=(12103518, 12103626)
- +0x38: 0xb8afca FDE=(12103626, 12103648)
- +0x40: 0xb8afe0 FDE=(12103648, 12103704)
- +0x48: 0xb8b018 FDE=(12103704, 12103760)
- +0x50: 0x0 FDE=None
- +0x58: 0x0 FDE=None
- +0x60: 0x9d7de0 FDE=(10321376, 10321377)
- +0x68: 0xa50370 FDE=(10814320, 10814325)
- +0x70: 0xb8a698 FDE=(12101272, 12101304)
- +0x78: 0xb8a6b8 FDE=(12101304, 12101323)
- +0x80: 0x9d7de0 FDE=(10321376, 10321377)
- +0x88: 0xa50370 FDE=(10814320, 10814325)
- +0x90: 0xb8a6cc FDE=(12101324, 12101812)
- +0x98: 0x0 FDE=None
- +0xa0: 0x0 FDE=None
- +0xa8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb0: 0xa50370 FDE=(10814320, 10814325)
- +0xb8: 0xb8b050 FDE=(12103760, 12103763)
- +0xc0: 0xb8b054 FDE=(12103764, 12103775)
- +0xc8: 0xb8b060 FDE=(12103776, 12103787)
- +0xd0: 0xb8b06c FDE=(12103788, 12103944)
- +0xd8: 0x0 FDE=None
- +0xe0: 0x0 FDE=None
- +0xe8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xf0: 0xa50370 FDE=(10814320, 10814325)
- +0xf8: 0xb8b152 FDE=(12104018, 12104021)
- +0x100: 0xb8b156 FDE=(12104022, 12104033)
- +0x108: 0xa5bbf0 FDE=(10861552, 10861557)
- +0x110: 0xb8b162 FDE=(12104034, 12104178)
- +0x118: 0x0 FDE=None
- +0x120: 0x0 FDE=None
- +0x128: 0xb8b202 FDE=(12104194, 12104228)
- +0x130: 0xb8b224 FDE=(12104228, 12104246)
- +0x138: 0x9d7de0 FDE=(10321376, 10321377)
- +0x140: 0x9d7de0 FDE=(10321376, 10321377)
- +0x148: 0xac3ae0 FDE=(11287264, 11287269)
- +0x150: 0xa7a004 FDE=(10985476, 10985481)
- +0x158: 0x0 FDE=None
- +0x160: 0x0 FDE=None
- +0x168: 0x9d7de0 FDE=(10321376, 10321377)
- +0x170: 0xa50370 FDE=(10814320, 10814325)
#### +0x28 body
      b8aef2:	41 57                	push   r15
      b8aef4:	41 56                	push   r14
      b8aef6:	53                   	push   rbx
      b8aef7:	48 83 ec 50          	sub    rsp,0x50
      b8aefb:	49 89 f6             	mov    r14,rsi
      b8aefe:	48 89 fb             	mov    rbx,rdi
      b8af01:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b8af08:	00 00 
      b8af0a:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      b8af0f:	49 81 c6 20 02 00 00 	add    r14,0x220
      b8af16:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
      b8af1b:	4c 89 ff             	mov    rdi,r15
      b8af1e:	48 89 d6             	mov    rsi,rdx
      b8af21:	e8 14 f8 c4 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
      b8af26:	48 89 df             	mov    rdi,rbx
      b8af29:	4c 89 f6             	mov    rsi,r14
      b8af2c:	4c 89 fa             	mov    rdx,r15
      b8af2f:	e8 96 f0 c4 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
      b8af34:	4c 89 ff             	mov    rdi,r15
      b8af37:	e8 ac f8 c4 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      b8af3c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b8af43:	00 00 
      b8af45:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
      b8af4a:	75 0d                	jne    b8af59 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7ef9>
      b8af4c:	48 89 d8             	mov    rax,rbx
      b8af4f:	48 83 c4 50          	add    rsp,0x50
      b8af53:	5b                   	pop    rbx
      b8af54:	41 5e                	pop    r14
      b8af56:	41 5f                	pop    r15
      b8af58:	c3                   	ret
      b8af59:	e8 52 4b c6 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x180e030 codeSlots=38
- +0x0: 0xb8ad42 FDE=(12102978, 12103086)
- +0x8: 0xb8adae FDE=(12103086, 12103194)
- +0x10: 0xb8ae1a FDE=(12103194, 12103302)
- +0x18: 0xb8ae86 FDE=(12103302, 12103410)
- +0x20: 0xb8aef2 FDE=(12103410, 12103518)
- +0x28: 0xb8af5e FDE=(12103518, 12103626)
- +0x30: 0xb8afca FDE=(12103626, 12103648)
- +0x38: 0xb8afe0 FDE=(12103648, 12103704)
- +0x40: 0xb8b018 FDE=(12103704, 12103760)
- +0x48: 0x0 FDE=None
- +0x50: 0x0 FDE=None
- +0x58: 0x9d7de0 FDE=(10321376, 10321377)
- +0x60: 0xa50370 FDE=(10814320, 10814325)
- +0x68: 0xb8a698 FDE=(12101272, 12101304)
- +0x70: 0xb8a6b8 FDE=(12101304, 12101323)
- +0x78: 0x9d7de0 FDE=(10321376, 10321377)
- +0x80: 0xa50370 FDE=(10814320, 10814325)
- +0x88: 0xb8a6cc FDE=(12101324, 12101812)
- +0x90: 0x0 FDE=None
- +0x98: 0x0 FDE=None
- +0xa0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa8: 0xa50370 FDE=(10814320, 10814325)
- +0xb0: 0xb8b050 FDE=(12103760, 12103763)
- +0xb8: 0xb8b054 FDE=(12103764, 12103775)
- +0xc0: 0xb8b060 FDE=(12103776, 12103787)
- +0xc8: 0xb8b06c FDE=(12103788, 12103944)
- +0xd0: 0x0 FDE=None
- +0xd8: 0x0 FDE=None
- +0xe0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe8: 0xa50370 FDE=(10814320, 10814325)
- +0xf0: 0xb8b152 FDE=(12104018, 12104021)
- +0xf8: 0xb8b156 FDE=(12104022, 12104033)
- +0x100: 0xa5bbf0 FDE=(10861552, 10861557)
- +0x108: 0xb8b162 FDE=(12104034, 12104178)
- +0x110: 0x0 FDE=None
- +0x118: 0x0 FDE=None
- +0x120: 0xb8b202 FDE=(12104194, 12104228)
- +0x128: 0xb8b224 FDE=(12104228, 12104246)
- +0x130: 0x9d7de0 FDE=(10321376, 10321377)
- +0x138: 0x9d7de0 FDE=(10321376, 10321377)
- +0x140: 0xac3ae0 FDE=(11287264, 11287269)
- +0x148: 0xa7a004 FDE=(10985476, 10985481)
- +0x150: 0x0 FDE=None
- +0x158: 0x0 FDE=None
- +0x160: 0x9d7de0 FDE=(10321376, 10321377)
- +0x168: 0xa50370 FDE=(10814320, 10814325)
- +0x170: 0xb8b236 FDE=(12104246, 12104249)
#### +0x28 body
      b8af5e:	41 57                	push   r15
      b8af60:	41 56                	push   r14
      b8af62:	53                   	push   rbx
      b8af63:	48 83 ec 50          	sub    rsp,0x50
      b8af67:	49 89 f6             	mov    r14,rsi
      b8af6a:	48 89 fb             	mov    rbx,rdi
      b8af6d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b8af74:	00 00 
      b8af76:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      b8af7b:	49 81 c6 d0 02 00 00 	add    r14,0x2d0
      b8af82:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
      b8af87:	4c 89 ff             	mov    rdi,r15
      b8af8a:	48 89 d6             	mov    rsi,rdx
      b8af8d:	e8 a8 f7 c4 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
      b8af92:	48 89 df             	mov    rdi,rbx
      b8af95:	4c 89 f6             	mov    rsi,r14
      b8af98:	4c 89 fa             	mov    rdx,r15
      b8af9b:	e8 2a f0 c4 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
      b8afa0:	4c 89 ff             	mov    rdi,r15
      b8afa3:	e8 40 f8 c4 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      b8afa8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b8afaf:	00 00 
      b8afb1:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
      b8afb6:	75 0d                	jne    b8afc5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7f65>
      b8afb8:	48 89 d8             	mov    rax,rbx
      b8afbb:	48 83 c4 50          	add    rsp,0x50
      b8afbf:	5b                   	pop    rbx
      b8afc0:	41 5e                	pop    r14
      b8afc2:	41 5f                	pop    r15
      b8afc4:	c3                   	ret
      b8afc5:	e8 e6 4a c6 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x1878eb0 codeSlots=40
- +0x0: 0x0 FDE=None
- +0x8: 0x14c7dce FDE=(21790158, 21792293)
- +0x10: 0x0 FDE=None
- +0x18: 0x0 FDE=None
- +0x20: 0x14c938c FDE=(21795724, 21795739)
- +0x28: 0x14c939c FDE=(21795740, 21795758)
- +0x30: 0x14c93ae FDE=(21795758, 21795769)
- +0x38: 0x0 FDE=None
- +0x40: 0xa50370 FDE=(10814320, 10814325)
- +0x48: 0x0 FDE=None
- +0x50: 0x0 FDE=None
- +0x58: 0x14c8710 FDE=(21792528, 21794672)
- +0x60: 0x14c8f70 FDE=(21794672, 21794765)
- +0x68: 0x14c8fce FDE=(21794766, 21794970)
- +0x70: 0x14c909a FDE=(21794970, 21795132)
- +0x78: 0x14c913c FDE=(21795132, 21795175)
- +0x80: 0x14c9168 FDE=(21795176, 21795195)
- +0x88: 0x14c917c FDE=(21795196, 21795214)
- +0x90: 0x0 FDE=None
- +0x98: 0x0 FDE=None
- +0xa0: 0x14c970e FDE=(21796622, 21796765)
- +0xa8: 0x14c979e FDE=(21796766, 21796784)
- +0xb0: 0xaf6576 FDE=(11494774, 11494779)
- +0xb8: 0xec70f2 FDE=(15495410, 15495444)
- +0xc0: 0x9d81d0 FDE=(10322384, 10322387)
- +0xc8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd8: 0x14c97b0 FDE=(21796784, 21797189)
- +0xe0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe8: 0x14c9946 FDE=(21797190, 21797202)
- +0xf0: 0x14c9952 FDE=(21797202, 21797503)
- +0xf8: 0x155e8c6 FDE=(22407366, 22407375)
- +0x100: 0x155e8d0 FDE=(22407376, 22407385)
- +0x108: 0x14c9a80 FDE=(21797504, 21797782)
- +0x110: 0x9d7de0 FDE=(10321376, 10321377)
- +0x118: 0xd8d19e FDE=(14209438, 14209456)
- +0x120: 0xec7170 FDE=(15495536, 15495553)
- +0x128: 0x9d7de0 FDE=(10321376, 10321377)
- +0x130: 0x14c9b96 FDE=(21797782, 21798175)
- +0x138: 0x14c9d20 FDE=(21798176, 21798184)
- +0x140: 0x9d7de0 FDE=(10321376, 10321377)
- +0x148: 0x14c9d28 FDE=(21798184, 21798373)
- +0x150: 0x14c9de6 FDE=(21798374, 21798630)
- +0x158: 0xf23934 FDE=(15874356, 15874368)
- +0x160: 0x14c9ee6 FDE=(21798630, 21798979)
- +0x168: 0x146af6e FDE=(21409646, 21409658)
- +0x170: 0x14ca044 FDE=(21798980, 21800002)
#### +0x28 body
     14c939c:	53                   	push   rbx
     14c939d:	48 89 fb             	mov    rbx,rdi
     14c93a0:	e8 e7 ff ff ff       	call   14c938c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e910>
     14c93a5:	48 89 df             	mov    rdi,rbx
     14c93a8:	5b                   	pop    rbx
     14c93a9:	e9 72 4b 32 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x1878eb8 codeSlots=41
- +0x0: 0x14c7dce FDE=(21790158, 21792293)
- +0x8: 0x0 FDE=None
- +0x10: 0x0 FDE=None
- +0x18: 0x14c938c FDE=(21795724, 21795739)
- +0x20: 0x14c939c FDE=(21795740, 21795758)
- +0x28: 0x14c93ae FDE=(21795758, 21795769)
- +0x30: 0x0 FDE=None
- +0x38: 0xa50370 FDE=(10814320, 10814325)
- +0x40: 0x0 FDE=None
- +0x48: 0x0 FDE=None
- +0x50: 0x14c8710 FDE=(21792528, 21794672)
- +0x58: 0x14c8f70 FDE=(21794672, 21794765)
- +0x60: 0x14c8fce FDE=(21794766, 21794970)
- +0x68: 0x14c909a FDE=(21794970, 21795132)
- +0x70: 0x14c913c FDE=(21795132, 21795175)
- +0x78: 0x14c9168 FDE=(21795176, 21795195)
- +0x80: 0x14c917c FDE=(21795196, 21795214)
- +0x88: 0x0 FDE=None
- +0x90: 0x0 FDE=None
- +0x98: 0x14c970e FDE=(21796622, 21796765)
- +0xa0: 0x14c979e FDE=(21796766, 21796784)
- +0xa8: 0xaf6576 FDE=(11494774, 11494779)
- +0xb0: 0xec70f2 FDE=(15495410, 15495444)
- +0xb8: 0x9d81d0 FDE=(10322384, 10322387)
- +0xc0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd0: 0x14c97b0 FDE=(21796784, 21797189)
- +0xd8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe0: 0x14c9946 FDE=(21797190, 21797202)
- +0xe8: 0x14c9952 FDE=(21797202, 21797503)
- +0xf0: 0x155e8c6 FDE=(22407366, 22407375)
- +0xf8: 0x155e8d0 FDE=(22407376, 22407385)
- +0x100: 0x14c9a80 FDE=(21797504, 21797782)
- +0x108: 0x9d7de0 FDE=(10321376, 10321377)
- +0x110: 0xd8d19e FDE=(14209438, 14209456)
- +0x118: 0xec7170 FDE=(15495536, 15495553)
- +0x120: 0x9d7de0 FDE=(10321376, 10321377)
- +0x128: 0x14c9b96 FDE=(21797782, 21798175)
- +0x130: 0x14c9d20 FDE=(21798176, 21798184)
- +0x138: 0x9d7de0 FDE=(10321376, 10321377)
- +0x140: 0x14c9d28 FDE=(21798184, 21798373)
- +0x148: 0x14c9de6 FDE=(21798374, 21798630)
- +0x150: 0xf23934 FDE=(15874356, 15874368)
- +0x158: 0x14c9ee6 FDE=(21798630, 21798979)
- +0x160: 0x146af6e FDE=(21409646, 21409658)
- +0x168: 0x14ca044 FDE=(21798980, 21800002)
- +0x170: 0x14ca442 FDE=(21800002, 21800274)
#### +0x28 body
     14c93ae:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
     14c93b2:	48 83 c7 18          	add    rdi,0x18
     14c93b6:	ff 60 28             	jmp    QWORD PTR [rax+0x28]

### AP 0x1878ec0 codeSlots=41
- +0x0: 0x0 FDE=None
- +0x8: 0x0 FDE=None
- +0x10: 0x14c938c FDE=(21795724, 21795739)
- +0x18: 0x14c939c FDE=(21795740, 21795758)
- +0x20: 0x14c93ae FDE=(21795758, 21795769)
- +0x28: 0x0 FDE=None
- +0x30: 0xa50370 FDE=(10814320, 10814325)
- +0x38: 0x0 FDE=None
- +0x40: 0x0 FDE=None
- +0x48: 0x14c8710 FDE=(21792528, 21794672)
- +0x50: 0x14c8f70 FDE=(21794672, 21794765)
- +0x58: 0x14c8fce FDE=(21794766, 21794970)
- +0x60: 0x14c909a FDE=(21794970, 21795132)
- +0x68: 0x14c913c FDE=(21795132, 21795175)
- +0x70: 0x14c9168 FDE=(21795176, 21795195)
- +0x78: 0x14c917c FDE=(21795196, 21795214)
- +0x80: 0x0 FDE=None
- +0x88: 0x0 FDE=None
- +0x90: 0x14c970e FDE=(21796622, 21796765)
- +0x98: 0x14c979e FDE=(21796766, 21796784)
- +0xa0: 0xaf6576 FDE=(11494774, 11494779)
- +0xa8: 0xec70f2 FDE=(15495410, 15495444)
- +0xb0: 0x9d81d0 FDE=(10322384, 10322387)
- +0xb8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc8: 0x14c97b0 FDE=(21796784, 21797189)
- +0xd0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd8: 0x14c9946 FDE=(21797190, 21797202)
- +0xe0: 0x14c9952 FDE=(21797202, 21797503)
- +0xe8: 0x155e8c6 FDE=(22407366, 22407375)
- +0xf0: 0x155e8d0 FDE=(22407376, 22407385)
- +0xf8: 0x14c9a80 FDE=(21797504, 21797782)
- +0x100: 0x9d7de0 FDE=(10321376, 10321377)
- +0x108: 0xd8d19e FDE=(14209438, 14209456)
- +0x110: 0xec7170 FDE=(15495536, 15495553)
- +0x118: 0x9d7de0 FDE=(10321376, 10321377)
- +0x120: 0x14c9b96 FDE=(21797782, 21798175)
- +0x128: 0x14c9d20 FDE=(21798176, 21798184)
- +0x130: 0x9d7de0 FDE=(10321376, 10321377)
- +0x138: 0x14c9d28 FDE=(21798184, 21798373)
- +0x140: 0x14c9de6 FDE=(21798374, 21798630)
- +0x148: 0xf23934 FDE=(15874356, 15874368)
- +0x150: 0x14c9ee6 FDE=(21798630, 21798979)
- +0x158: 0x146af6e FDE=(21409646, 21409658)
- +0x160: 0x14ca044 FDE=(21798980, 21800002)
- +0x168: 0x14ca442 FDE=(21800002, 21800274)
- +0x170: 0x14ca552 FDE=(21800274, 21800553)

### AP 0x1878ec8 codeSlots=42
- +0x0: 0x0 FDE=None
- +0x8: 0x14c938c FDE=(21795724, 21795739)
- +0x10: 0x14c939c FDE=(21795740, 21795758)
- +0x18: 0x14c93ae FDE=(21795758, 21795769)
- +0x20: 0x0 FDE=None
- +0x28: 0xa50370 FDE=(10814320, 10814325)
- +0x30: 0x0 FDE=None
- +0x38: 0x0 FDE=None
- +0x40: 0x14c8710 FDE=(21792528, 21794672)
- +0x48: 0x14c8f70 FDE=(21794672, 21794765)
- +0x50: 0x14c8fce FDE=(21794766, 21794970)
- +0x58: 0x14c909a FDE=(21794970, 21795132)
- +0x60: 0x14c913c FDE=(21795132, 21795175)
- +0x68: 0x14c9168 FDE=(21795176, 21795195)
- +0x70: 0x14c917c FDE=(21795196, 21795214)
- +0x78: 0x0 FDE=None
- +0x80: 0x0 FDE=None
- +0x88: 0x14c970e FDE=(21796622, 21796765)
- +0x90: 0x14c979e FDE=(21796766, 21796784)
- +0x98: 0xaf6576 FDE=(11494774, 11494779)
- +0xa0: 0xec70f2 FDE=(15495410, 15495444)
- +0xa8: 0x9d81d0 FDE=(10322384, 10322387)
- +0xb0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc0: 0x14c97b0 FDE=(21796784, 21797189)
- +0xc8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd0: 0x14c9946 FDE=(21797190, 21797202)
- +0xd8: 0x14c9952 FDE=(21797202, 21797503)
- +0xe0: 0x155e8c6 FDE=(22407366, 22407375)
- +0xe8: 0x155e8d0 FDE=(22407376, 22407385)
- +0xf0: 0x14c9a80 FDE=(21797504, 21797782)
- +0xf8: 0x9d7de0 FDE=(10321376, 10321377)
- +0x100: 0xd8d19e FDE=(14209438, 14209456)
- +0x108: 0xec7170 FDE=(15495536, 15495553)
- +0x110: 0x9d7de0 FDE=(10321376, 10321377)
- +0x118: 0x14c9b96 FDE=(21797782, 21798175)
- +0x120: 0x14c9d20 FDE=(21798176, 21798184)
- +0x128: 0x9d7de0 FDE=(10321376, 10321377)
- +0x130: 0x14c9d28 FDE=(21798184, 21798373)
- +0x138: 0x14c9de6 FDE=(21798374, 21798630)
- +0x140: 0xf23934 FDE=(15874356, 15874368)
- +0x148: 0x14c9ee6 FDE=(21798630, 21798979)
- +0x150: 0x146af6e FDE=(21409646, 21409658)
- +0x158: 0x14ca044 FDE=(21798980, 21800002)
- +0x160: 0x14ca442 FDE=(21800002, 21800274)
- +0x168: 0x14ca552 FDE=(21800274, 21800553)
- +0x170: 0x9d7de0 FDE=(10321376, 10321377)
#### +0x28 body
      a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x1878ed0 codeSlots=43
- +0x0: 0x14c938c FDE=(21795724, 21795739)
- +0x8: 0x14c939c FDE=(21795740, 21795758)
- +0x10: 0x14c93ae FDE=(21795758, 21795769)
- +0x18: 0x0 FDE=None
- +0x20: 0xa50370 FDE=(10814320, 10814325)
- +0x28: 0x0 FDE=None
- +0x30: 0x0 FDE=None
- +0x38: 0x14c8710 FDE=(21792528, 21794672)
- +0x40: 0x14c8f70 FDE=(21794672, 21794765)
- +0x48: 0x14c8fce FDE=(21794766, 21794970)
- +0x50: 0x14c909a FDE=(21794970, 21795132)
- +0x58: 0x14c913c FDE=(21795132, 21795175)
- +0x60: 0x14c9168 FDE=(21795176, 21795195)
- +0x68: 0x14c917c FDE=(21795196, 21795214)
- +0x70: 0x0 FDE=None
- +0x78: 0x0 FDE=None
- +0x80: 0x14c970e FDE=(21796622, 21796765)
- +0x88: 0x14c979e FDE=(21796766, 21796784)
- +0x90: 0xaf6576 FDE=(11494774, 11494779)
- +0x98: 0xec70f2 FDE=(15495410, 15495444)
- +0xa0: 0x9d81d0 FDE=(10322384, 10322387)
- +0xa8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb8: 0x14c97b0 FDE=(21796784, 21797189)
- +0xc0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc8: 0x14c9946 FDE=(21797190, 21797202)
- +0xd0: 0x14c9952 FDE=(21797202, 21797503)
- +0xd8: 0x155e8c6 FDE=(22407366, 22407375)
- +0xe0: 0x155e8d0 FDE=(22407376, 22407385)
- +0xe8: 0x14c9a80 FDE=(21797504, 21797782)
- +0xf0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xf8: 0xd8d19e FDE=(14209438, 14209456)
- +0x100: 0xec7170 FDE=(15495536, 15495553)
- +0x108: 0x9d7de0 FDE=(10321376, 10321377)
- +0x110: 0x14c9b96 FDE=(21797782, 21798175)
- +0x118: 0x14c9d20 FDE=(21798176, 21798184)
- +0x120: 0x9d7de0 FDE=(10321376, 10321377)
- +0x128: 0x14c9d28 FDE=(21798184, 21798373)
- +0x130: 0x14c9de6 FDE=(21798374, 21798630)
- +0x138: 0xf23934 FDE=(15874356, 15874368)
- +0x140: 0x14c9ee6 FDE=(21798630, 21798979)
- +0x148: 0x146af6e FDE=(21409646, 21409658)
- +0x150: 0x14ca044 FDE=(21798980, 21800002)
- +0x158: 0x14ca442 FDE=(21800002, 21800274)
- +0x160: 0x14ca552 FDE=(21800274, 21800553)
- +0x168: 0x9d7de0 FDE=(10321376, 10321377)
- +0x170: 0x9d7de0 FDE=(10321376, 10321377)

### AP 0x1878ed8 codeSlots=43
- +0x0: 0x14c939c FDE=(21795740, 21795758)
- +0x8: 0x14c93ae FDE=(21795758, 21795769)
- +0x10: 0x0 FDE=None
- +0x18: 0xa50370 FDE=(10814320, 10814325)
- +0x20: 0x0 FDE=None
- +0x28: 0x0 FDE=None
- +0x30: 0x14c8710 FDE=(21792528, 21794672)
- +0x38: 0x14c8f70 FDE=(21794672, 21794765)
- +0x40: 0x14c8fce FDE=(21794766, 21794970)
- +0x48: 0x14c909a FDE=(21794970, 21795132)
- +0x50: 0x14c913c FDE=(21795132, 21795175)
- +0x58: 0x14c9168 FDE=(21795176, 21795195)
- +0x60: 0x14c917c FDE=(21795196, 21795214)
- +0x68: 0x0 FDE=None
- +0x70: 0x0 FDE=None
- +0x78: 0x14c970e FDE=(21796622, 21796765)
- +0x80: 0x14c979e FDE=(21796766, 21796784)
- +0x88: 0xaf6576 FDE=(11494774, 11494779)
- +0x90: 0xec70f2 FDE=(15495410, 15495444)
- +0x98: 0x9d81d0 FDE=(10322384, 10322387)
- +0xa0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb0: 0x14c97b0 FDE=(21796784, 21797189)
- +0xb8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc0: 0x14c9946 FDE=(21797190, 21797202)
- +0xc8: 0x14c9952 FDE=(21797202, 21797503)
- +0xd0: 0x155e8c6 FDE=(22407366, 22407375)
- +0xd8: 0x155e8d0 FDE=(22407376, 22407385)
- +0xe0: 0x14c9a80 FDE=(21797504, 21797782)
- +0xe8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xf0: 0xd8d19e FDE=(14209438, 14209456)
- +0xf8: 0xec7170 FDE=(15495536, 15495553)
- +0x100: 0x9d7de0 FDE=(10321376, 10321377)
- +0x108: 0x14c9b96 FDE=(21797782, 21798175)
- +0x110: 0x14c9d20 FDE=(21798176, 21798184)
- +0x118: 0x9d7de0 FDE=(10321376, 10321377)
- +0x120: 0x14c9d28 FDE=(21798184, 21798373)
- +0x128: 0x14c9de6 FDE=(21798374, 21798630)
- +0x130: 0xf23934 FDE=(15874356, 15874368)
- +0x138: 0x14c9ee6 FDE=(21798630, 21798979)
- +0x140: 0x146af6e FDE=(21409646, 21409658)
- +0x148: 0x14ca044 FDE=(21798980, 21800002)
- +0x150: 0x14ca442 FDE=(21800002, 21800274)
- +0x158: 0x14ca552 FDE=(21800274, 21800553)
- +0x160: 0x9d7de0 FDE=(10321376, 10321377)
- +0x168: 0x9d7de0 FDE=(10321376, 10321377)
- +0x170: 0x9d7de0 FDE=(10321376, 10321377)

### AP 0x1878ee0 codeSlots=43
- +0x0: 0x14c93ae FDE=(21795758, 21795769)
- +0x8: 0x0 FDE=None
- +0x10: 0xa50370 FDE=(10814320, 10814325)
- +0x18: 0x0 FDE=None
- +0x20: 0x0 FDE=None
- +0x28: 0x14c8710 FDE=(21792528, 21794672)
- +0x30: 0x14c8f70 FDE=(21794672, 21794765)
- +0x38: 0x14c8fce FDE=(21794766, 21794970)
- +0x40: 0x14c909a FDE=(21794970, 21795132)
- +0x48: 0x14c913c FDE=(21795132, 21795175)
- +0x50: 0x14c9168 FDE=(21795176, 21795195)
- +0x58: 0x14c917c FDE=(21795196, 21795214)
- +0x60: 0x0 FDE=None
- +0x68: 0x0 FDE=None
- +0x70: 0x14c970e FDE=(21796622, 21796765)
- +0x78: 0x14c979e FDE=(21796766, 21796784)
- +0x80: 0xaf6576 FDE=(11494774, 11494779)
- +0x88: 0xec70f2 FDE=(15495410, 15495444)
- +0x90: 0x9d81d0 FDE=(10322384, 10322387)
- +0x98: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa8: 0x14c97b0 FDE=(21796784, 21797189)
- +0xb0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb8: 0x14c9946 FDE=(21797190, 21797202)
- +0xc0: 0x14c9952 FDE=(21797202, 21797503)
- +0xc8: 0x155e8c6 FDE=(22407366, 22407375)
- +0xd0: 0x155e8d0 FDE=(22407376, 22407385)
- +0xd8: 0x14c9a80 FDE=(21797504, 21797782)
- +0xe0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe8: 0xd8d19e FDE=(14209438, 14209456)
- +0xf0: 0xec7170 FDE=(15495536, 15495553)
- +0xf8: 0x9d7de0 FDE=(10321376, 10321377)
- +0x100: 0x14c9b96 FDE=(21797782, 21798175)
- +0x108: 0x14c9d20 FDE=(21798176, 21798184)
- +0x110: 0x9d7de0 FDE=(10321376, 10321377)
- +0x118: 0x14c9d28 FDE=(21798184, 21798373)
- +0x120: 0x14c9de6 FDE=(21798374, 21798630)
- +0x128: 0xf23934 FDE=(15874356, 15874368)
- +0x130: 0x14c9ee6 FDE=(21798630, 21798979)
- +0x138: 0x146af6e FDE=(21409646, 21409658)
- +0x140: 0x14ca044 FDE=(21798980, 21800002)
- +0x148: 0x14ca442 FDE=(21800002, 21800274)
- +0x150: 0x14ca552 FDE=(21800274, 21800553)
- +0x158: 0x9d7de0 FDE=(10321376, 10321377)
- +0x160: 0x9d7de0 FDE=(10321376, 10321377)
- +0x168: 0x9d7de0 FDE=(10321376, 10321377)
- +0x170: 0x9d7de0 FDE=(10321376, 10321377)
#### +0x28 body
     14c8710:	55                   	push   rbp
     14c8711:	41 57                	push   r15
     14c8713:	41 56                	push   r14
     14c8715:	41 55                	push   r13
     14c8717:	41 54                	push   r12
     14c8719:	53                   	push   rbx
     14c871a:	48 81 ec d8 00 00 00 	sub    rsp,0xd8
     14c8721:	49 89 f7             	mov    r15,rsi
     14c8724:	48 89 fb             	mov    rbx,rdi
     14c8727:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c872e:	00 00 
     14c8730:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
     14c8737:	00 
     14c8738:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
     14c873b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     14c873e:	4c 8d 74 24 78       	lea    r14,[rsp+0x78]
     14c8743:	4c 89 f7             	mov    rdi,r14
     14c8746:	ff 50 38             	call   QWORD PTR [rax+0x38]
     14c8749:	48 8d 6b 10          	lea    rbp,[rbx+0x10]
     14c874d:	48 89 ef             	mov    rdi,rbp
     14c8750:	4c 89 f6             	mov    rsi,r14
     14c8753:	e8 6a 41 5f ff       	call   abc8c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9862>
     14c8758:	48 85 c0             	test   rax,rax
     14c875b:	0f 85 dd 06 00 00    	jne    14c8e3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e3c2>
     14c8761:	4c 8b 73 08          	mov    r14,QWORD PTR [rbx+0x8]
     14c8765:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
     14c8769:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     14c876e:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
     14c8772:	48 85 c0             	test   rax,rax
     14c8775:	74 05                	je     14c877c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30dd00>
     14c8777:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14c877c:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
     14c8781:	6a 01                	push   0x1
     14c8783:	5f                   	pop    rdi
     14c8784:	be e0 00 00 00       	mov    esi,0xe0
     14c8789:	e8 32 64 32 00       	call   17eebc0 <calloc@plt>
     14c878e:	49 89 c7             	mov    r15,rax
     14c8791:	48 85 c0             	test   rax,rax
     14c8794:	0f 84 d7 06 00 00    	je     14c8e71 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e3f5>
     14c879a:	0f 57 c0             	xorps  xmm0,xmm0
     14c879d:	41 0f 11 47 08       	movups XMMWORD PTR [r15+0x8],xmm0
     14c87a2:	4d 89 77 18          	mov    QWORD PTR [r15+0x18],r14
     14c87a6:	41 0f 11 47 50       	movups XMMWORD PTR [r15+0x50],xmm0
     14c87ab:	49 83 67 60 00       	and    QWORD PTR [r15+0x60],0x0
     14c87b0:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
     14c87b5:	41 0f 11 47 30       	movups XMMWORD PTR [r15+0x30],xmm0
     14c87ba:	49 83 67 70 00       	and    QWORD PTR [r15+0x70],0x0
     14c87bf:	41 c6 47 7c 00       	mov    BYTE PTR [r15+0x7c],0x0
     14c87c4:	41 0f 11 87 b0 00 00 	movups XMMWORD PTR [r15+0xb0],xmm0
     14c87cb:	00 
     14c87cc:	41 0f 11 87 c0 00 00 	movups XMMWORD PTR [r15+0xc0],xmm0
     14c87d3:	00 
     14c87d4:	41 0f 11 87 d0 00 00 	movups XMMWORD PTR [r15+0xd0],xmm0
     14c87db:	00 
     14c87dc:	48 8d 05 cd 9c 3c 00 	lea    rax,[rip+0x3c9ccd]        # 18924b0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xb188>
     14c87e3:	49 89 07             	mov    QWORD PTR [r15],rax
     14c87e6:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]
     14c87ec:	66 49 0f 7e c4       	movq   r12,xmm0
     14c87f1:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     14c87f5:	4c 89 e7             	mov    rdi,r12
     14c87f8:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
     14c87fd:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14c8800:	49 8d bf b0 00 00 00 	lea    rdi,[r15+0xb0]
     14c8807:	49 89 87 a0 00 00 00 	mov    QWORD PTR [r15+0xa0],rax
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
     14c8863:	48 89 c3             	mov    rbx,rax
     14c8866:	48 83 c3 10          	add    rbx,0x10
     14c886a:	66 0f ef c0          	pxor   xmm0,xmm0
     14c886e:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
     14c8872:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
     14c8875:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
     14c8879:	4c 89 78 20          	mov    QWORD PTR [rax+0x20],r15
     14c887d:	c6 84 24 c0 00 00 00 	mov    BYTE PTR [rsp+0xc0],0x1
     14c8884:	01 
     14c8885:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     14c888a:	6a 10                	push   0x10
     14c888c:	41 5e                	pop    r14
     14c888e:	48 89 df             	mov    rdi,rbx
     14c8891:	4c 89 f6             	mov    rsi,r14
     14c8894:	e8 05 d4 7d ff       	call   ca5c9e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f2c3e>
     14c8899:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     14c889e:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
     14c88a2:	48 89 1c 24          	mov    QWORD PTR [rsp],rbx
     14c88a6:	48 89 df             	mov    rdi,rbx
     14c88a9:	4c 89 f6             	mov    rsi,r14
     14c88ac:	e8 ed d3 7d ff       	call   ca5c9e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f2c3e>
     14c88b1:	48 89 c6             	mov    rsi,rax
     14c88b4:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     14c88b9:	48 89 70 08          	mov    QWORD PTR [rax+0x8],rsi
     14c88bd:	4d 8b 94 24 50 02 00 	mov    r10,QWORD PTR [r12+0x250]
     14c88c4:	00 
     14c88c5:	49 8b 84 24 60 02 00 	mov    rax,QWORD PTR [r12+0x260]
     14c88cc:	00 
     14c88cd:	48 ff c0             	inc    rax
     14c88d0:	78 07                	js     14c88d9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30de5d>
     14c88d2:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     14c88d7:	eb 15                	jmp    14c88ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30de72>
     14c88d9:	48 89 c1             	mov    rcx,rax
     14c88dc:	48 d1 e9             	shr    rcx,1
     14c88df:	83 e0 01             	and    eax,0x1
     14c88e2:	48 09 c8             	or     rax,rcx
     14c88e5:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     14c88ea:	f3 0f 58 c0          	addss  xmm0,xmm0
     14c88ee:	49 8d 47 08          	lea    rax,[r15+0x8]
     14c88f2:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     14c88f7:	4d 8d ac 24 48 02 00 	lea    r13,[r12+0x248]
     14c88fe:	00 
     14c88ff:	4c 89 d1             	mov    rcx,r10
     14c8902:	48 d1 e9             	shr    rcx,1
     14c8905:	44 89 d0             	mov    eax,r10d
     14c8908:	83 e0 01             	and    eax,0x1
     14c890b:	48 09 c8             	or     rax,rcx
     14c890e:	4d 85 d2             	test   r10,r10
     14c8911:	78 07                	js     14c891a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30de9e>
     14c8913:	f3 49 0f 2a d2       	cvtsi2ss xmm2,r10
     14c8918:	eb 09                	jmp    14c8923 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30dea7>
     14c891a:	f3 48 0f 2a d0       	cvtsi2ss xmm2,rax
     14c891f:	f3 0f 58 d2          	addss  xmm2,xmm2
     14c8923:	f3 41 0f 10 8c 24 68 	movss  xmm1,DWORD PTR [r12+0x268]
     14c892a:	02 00 00 
     14c892d:	74 09                	je     14c8938 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30debc>
     14c892f:	f3 0f 59 d1          	mulss  xmm2,xmm1
     14c8933:	0f 2e c2             	ucomiss xmm0,xmm2
     14c8936:	76 60                	jbe    14c8998 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30df1c>
     14c8938:	49 89 f6             	mov    r14,rsi
     14c893b:	49 83 fa 03          	cmp    r10,0x3
     14c893f:	0f 92 c0             	setb   al
     14c8942:	49 8d 4a ff          	lea    rcx,[r10-0x1]
     14c8946:	49 85 ca             	test   r10,rcx
     14c8949:	0f 95 c1             	setne  cl
     14c894c:	08 c1                	or     cl,al
     14c894e:	0f b6 c1             	movzx  eax,cl
     14c8951:	4a 8d 04 50          	lea    rax,[rax+r10*2]
     14c8955:	f3 0f 5e c1          	divss  xmm0,xmm1
     14c8959:	66 0f 3a 0a c0 0a    	roundss xmm0,xmm0,0xa
     14c895f:	f3 48 0f 2c c8       	cvttss2si rcx,xmm0
     14c8964:	48 89 ca             	mov    rdx,rcx
     14c8967:	48 c1 fa 3f          	sar    rdx,0x3f
     14c896b:	f3 0f 5c 05 a9 5e ec 	subss  xmm0,DWORD PTR [rip+0xfffffffffeec5ea9]        # 38e81c <_ZTSSt12bad_any_cast@@Base-0x19ac>
     14c8972:	fe 
     14c8973:	f3 48 0f 2c f0       	cvttss2si rsi,xmm0
     14c8978:	48 21 d6             	and    rsi,rdx
     14c897b:	48 09 ce             	or     rsi,rcx
     14c897e:	48 39 f0             	cmp    rax,rsi
     14c8981:	48 0f 47 f0          	cmova  rsi,rax
     14c8985:	4c 89 ef             	mov    rdi,r13
     14c8988:	e8 eb 1c 17 00       	call   163a678 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x357e6>
     14c898d:	4d 8b 94 24 50 02 00 	mov    r10,QWORD PTR [r12+0x250]
     14c8994:	00 
     14c8995:	4c 89 f6             	mov    rsi,r14
     14c8998:	f3 49 0f b8 da       	popcnt rbx,r10
     14c899d:	48 83 fb 01          	cmp    rbx,0x1
     14c89a1:	77 09                	ja     14c89ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30df30>
     14c89a3:	49 8d 7a ff          	lea    rdi,[r10-0x1]
     14c89a7:	48 21 f7             	and    rdi,rsi
     14c89aa:	eb 15                	jmp    14c89c1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30df45>
     14c89ac:	49 39 f2             	cmp    r10,rsi
     14c89af:	76 05                	jbe    14c89b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30df3a>
     14c89b1:	48 89 f7             	mov    rdi,rsi
     14c89b4:	eb 0b                	jmp    14c89c1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30df45>
     14c89b6:	48 89 f0             	mov    rax,rsi
     14c89b9:	31 d2                	xor    edx,edx
     14c89bb:	49 f7 f2             	div    r10
     14c89be:	48 89 d7             	mov    rdi,rdx
     14c89c1:	4c 89 6c 24 30       	mov    QWORD PTR [rsp+0x30],r13
     14c89c6:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     14c89ca:	4c 8b 2c f8          	mov    r13,QWORD PTR [rax+rdi*8]
     14c89ce:	4d 85 ed             	test   r13,r13
     14c89d1:	48 89 6c 24 18       	mov    QWORD PTR [rsp+0x18],rbp
     14c89d6:	4c 89 64 24 38       	mov    QWORD PTR [rsp+0x38],r12
     14c89db:	0f 84 9e 00 00 00    	je     14c8a7f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e003>
     14c89e1:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     14c89e5:	48 85 c0             	test   rax,rax
     14c89e8:	0f 84 94 00 00 00    	je     14c8a82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e006>
     14c89ee:	49 8d 4a ff          	lea    rcx,[r10-0x1]
     14c89f2:	48 89 4c 24 70       	mov    QWORD PTR [rsp+0x70],rcx
     14c89f7:	31 ed                	xor    ebp,ebp
     14c89f9:	6a 01                	push   0x1
     14c89fb:	41 5f                	pop    r15
     14c89fd:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
     14c8a02:	48 89 74 24 60       	mov    QWORD PTR [rsp+0x60],rsi
     14c8a07:	49 89 c4             	mov    r12,rax
     14c8a0a:	48 8b 48 08          	mov    rcx,QWORD PTR [rax+0x8]
     14c8a0e:	48 89 ca             	mov    rdx,rcx
     14c8a11:	83 fb 01             	cmp    ebx,0x1
     14c8a14:	77 07                	ja     14c8a1d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30dfa1>
     14c8a16:	48 23 54 24 70       	and    rdx,QWORD PTR [rsp+0x70]
     14c8a1b:	eb 0d                	jmp    14c8a2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30dfae>
     14c8a1d:	4c 39 d1             	cmp    rcx,r10
     14c8a20:	72 08                	jb     14c8a2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30dfae>
     14c8a22:	48 89 c8             	mov    rax,rcx
     14c8a25:	31 d2                	xor    edx,edx
     14c8a27:	49 f7 f2             	div    r10
     14c8a2a:	48 39 fa             	cmp    rdx,rdi
     14c8a2d:	75 53                	jne    14c8a82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e006>
     14c8a2f:	48 39 f1             	cmp    rcx,rsi
     14c8a32:	75 20                	jne    14c8a54 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30dfd8>
     14c8a34:	49 8d 7c 24 10       	lea    rdi,[r12+0x10]
     14c8a39:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
     14c8a3d:	4d 89 d6             	mov    r14,r10
     14c8a40:	e8 dd 21 6c ff       	call   b8ac22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7bc2>
     14c8a45:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     14c8a4a:	4d 89 f2             	mov    r10,r14
     14c8a4d:	48 8b 74 24 60       	mov    rsi,QWORD PTR [rsp+0x60]
     14c8a52:	eb 02                	jmp    14c8a56 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30dfda>
     14c8a54:	31 c0                	xor    eax,eax
     14c8a56:	40 f6 c5 01          	test   bpl,0x1
     14c8a5a:	74 04                	je     14c8a60 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30dfe4>
     14c8a5c:	84 c0                	test   al,al
     14c8a5e:	74 22                	je     14c8a82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e006>
     14c8a60:	40 f6 c5 01          	test   bpl,0x1
     14c8a64:	0f 94 c1             	sete   cl
     14c8a67:	30 c1                	xor    cl,al
     14c8a69:	40 0f b6 ed          	movzx  ebp,bpl
     14c8a6d:	41 0f 44 ef          	cmove  ebp,r15d
     14c8a71:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     14c8a75:	4d 89 e5             	mov    r13,r12
     14c8a78:	48 85 c0             	test   rax,rax
     14c8a7b:	75 8a                	jne    14c8a07 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30df8b>
     14c8a7d:	eb 03                	jmp    14c8a82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e006>
     14c8a7f:	45 31 ed             	xor    r13d,r13d
     14c8a82:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     14c8a87:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]
     14c8a8b:	83 fb 01             	cmp    ebx,0x1
     14c8a8e:	77 0e                	ja     14c8a9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e022>
     14c8a90:	49 8d 42 ff          	lea    rax,[r10-0x1]
     14c8a94:	48 21 c1             	and    rcx,rax
     14c8a97:	48 8b 74 24 38       	mov    rsi,QWORD PTR [rsp+0x38]
     14c8a9c:	eb 15                	jmp    14c8ab3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e037>
     14c8a9e:	4c 39 d1             	cmp    rcx,r10
     14c8aa1:	48 8b 74 24 38       	mov    rsi,QWORD PTR [rsp+0x38]
     14c8aa6:	72 0b                	jb     14c8ab3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e037>
     14c8aa8:	48 89 c8             	mov    rax,rcx
     14c8aab:	31 d2                	xor    edx,edx
     14c8aad:	49 f7 f2             	div    r10
     14c8ab0:	48 89 d1             	mov    rcx,rdx
     14c8ab3:	4d 85 ed             	test   r13,r13
     14c8ab6:	74 2e                	je     14c8ae6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e06a>
     14c8ab8:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     14c8abc:	48 89 07             	mov    QWORD PTR [rdi],rax
     14c8abf:	49 89 7d 00          	mov    QWORD PTR [r13+0x0],rdi
     14c8ac3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14c8ac6:	48 85 c0             	test   rax,rax
     14c8ac9:	4c 8b 44 24 30       	mov    r8,QWORD PTR [rsp+0x30]
     14c8ace:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     14c8ad3:	74 71                	je     14c8b46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e0ca>
     14c8ad5:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     14c8ad9:	83 fb 01             	cmp    ebx,0x1
     14c8adc:	77 40                	ja     14c8b1e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e0a2>
     14c8ade:	49 ff ca             	dec    r10
     14c8ae1:	4c 21 d0             	and    rax,r10
     14c8ae4:	eb 45                	jmp    14c8b2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e0af>
     14c8ae6:	48 8b 54 24 50       	mov    rdx,QWORD PTR [rsp+0x50]
     14c8aeb:	48 8b 02             	mov    rax,QWORD PTR [rdx]
     14c8aee:	48 89 07             	mov    QWORD PTR [rdi],rax
     14c8af1:	48 89 3a             	mov    QWORD PTR [rdx],rdi
     14c8af4:	4c 8b 44 24 30       	mov    r8,QWORD PTR [rsp+0x30]
     14c8af9:	49 8b 00             	mov    rax,QWORD PTR [r8]
     14c8afc:	48 89 14 c8          	mov    QWORD PTR [rax+rcx*8],rdx
     14c8b00:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14c8b03:	48 85 c0             	test   rax,rax
     14c8b06:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     14c8b0b:	74 39                	je     14c8b46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e0ca>
     14c8b0d:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     14c8b11:	83 fb 01             	cmp    ebx,0x1
     14c8b14:	77 1c                	ja     14c8b32 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e0b6>
     14c8b16:	49 ff ca             	dec    r10
     14c8b19:	4c 21 d0             	and    rax,r10
     14c8b1c:	eb 21                	jmp    14c8b3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e0c3>
     14c8b1e:	4c 39 d0             	cmp    rax,r10
     14c8b21:	72 08                	jb     14c8b2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e0af>
     14c8b23:	31 d2                	xor    edx,edx
     14c8b25:	49 f7 f2             	div    r10
     14c8b28:	48 89 d0             	mov    rax,rdx
     14c8b2b:	48 39 c8             	cmp    rax,rcx
     14c8b2e:	75 0f                	jne    14c8b3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e0c3>
     14c8b30:	eb 14                	jmp    14c8b46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e0ca>
     14c8b32:	4c 39 d0             	cmp    rax,r10
     14c8b35:	72 08                	jb     14c8b3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e0c3>
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
     14c8b8a:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
     14c8b8e:	66 0f 7f 4c 24 20    	movdqa XMMWORD PTR [rsp+0x20],xmm1
     14c8b94:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     14c8b98:	48 85 c0             	test   rax,rax
     14c8b9b:	74 0a                	je     14c8ba7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e12b>
     14c8b9d:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     14c8ba1:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
     14c8ba5:	75 1e                	jne    14c8bc5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e149>
     14c8ba7:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
     14c8bad:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
     14c8bb2:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
     14c8bb8:	e8 4d 0d 66 ff       	call   b2990a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x768aa>
     14c8bbd:	4c 89 e7             	mov    rdi,r12
     14c8bc0:	e8 c1 58 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14c8bc5:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     14c8bca:	e8 f1 6a 5d ff       	call   a9f6c0 <JNI_OnUnload@@Base+0x26f8d>
     14c8bcf:	49 89 c5             	mov    r13,rax
     14c8bd2:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     14c8bd7:	48 8b 58 18          	mov    rbx,QWORD PTR [rax+0x18]
     14c8bdb:	48 85 db             	test   rbx,rbx
     14c8bde:	74 14                	je     14c8bf4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e178>
     14c8be0:	f3 48 0f b8 eb       	popcnt rbp,rbx
     14c8be5:	48 83 fd 01          	cmp    rbp,0x1
     14c8be9:	77 0b                	ja     14c8bf6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e17a>
     14c8beb:	4c 8d 73 ff          	lea    r14,[rbx-0x1]
     14c8bef:	4d 21 ee             	and    r14,r13
     14c8bf2:	eb 15                	jmp    14c8c09 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e18d>
     14c8bf4:	eb 79                	jmp    14c8c6f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e1f3>
     14c8bf6:	4d 89 ee             	mov    r14,r13
     14c8bf9:	49 39 dd             	cmp    r13,rbx
     14c8bfc:	72 0b                	jb     14c8c09 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e18d>
     14c8bfe:	4c 89 e8             	mov    rax,r13
     14c8c01:	31 d2                	xor    edx,edx
     14c8c03:	48 f7 f3             	div    rbx
     14c8c06:	49 89 d6             	mov    r14,rdx
     14c8c09:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14c8c0e:	48 8b 00             	mov    rax,QWORD PTR [rax]
     14c8c11:	4a 8b 04 f0          	mov    rax,QWORD PTR [rax+r14*8]
     14c8c15:	48 85 c0             	test   rax,rax
     14c8c18:	74 55                	je     14c8c6f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e1f3>
     14c8c1a:	4c 8b 38             	mov    r15,QWORD PTR [rax]
     14c8c1d:	4d 85 ff             	test   r15,r15
     14c8c20:	74 4d                	je     14c8c6f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e1f3>
     14c8c22:	48 8d 43 ff          	lea    rax,[rbx-0x1]
     14c8c26:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     14c8c2a:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
     14c8c2e:	4c 39 e8             	cmp    rax,r13
     14c8c31:	75 17                	jne    14c8c4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e1ce>
     14c8c33:	49 8d 7f 10          	lea    rdi,[r15+0x10]
     14c8c37:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
     14c8c3c:	e8 ad 6a 5d ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     14c8c41:	84 c0                	test   al,al
     14c8c43:	74 22                	je     14c8c67 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e1eb>
     14c8c45:	e9 c8 01 00 00       	jmp    14c8e12 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e396>
     14c8c4a:	83 fd 01             	cmp    ebp,0x1
     14c8c4d:	77 06                	ja     14c8c55 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e1d9>
     14c8c4f:	48 23 04 24          	and    rax,QWORD PTR [rsp]
     14c8c53:	eb 0d                	jmp    14c8c62 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e1e6>
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
     14c8c97:	49 83 27 00          	and    QWORD PTR [r15],0x0
     14c8c9b:	c6 84 24 c0 00 00 00 	mov    BYTE PTR [rsp+0xc0],0x0
     14c8ca2:	00 
     14c8ca3:	4d 89 6f 08          	mov    QWORD PTR [r15+0x8],r13
     14c8ca7:	4c 89 ff             	mov    rdi,r15
     14c8caa:	48 83 c7 10          	add    rdi,0x10
     14c8cae:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
     14c8cb3:	e8 ee 35 a0 ff       	call   ecc2a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x936bc>
     14c8cb8:	c6 84 24 c0 00 00 00 	mov    BYTE PTR [rsp+0xc0],0x1
     14c8cbf:	01 
     14c8cc0:	48 8b 45 28          	mov    rax,QWORD PTR [rbp+0x28]
     14c8cc4:	48 ff c0             	inc    rax
     14c8cc7:	78 07                	js     14c8cd0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e254>
     14c8cc9:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     14c8cce:	eb 15                	jmp    14c8ce5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e269>
     14c8cd0:	48 89 c1             	mov    rcx,rax
     14c8cd3:	48 d1 e9             	shr    rcx,1
     14c8cd6:	83 e0 01             	and    eax,0x1
     14c8cd9:	48 09 c8             	or     rax,rcx
     14c8cdc:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     14c8ce1:	f3 0f 58 c0          	addss  xmm0,xmm0
     14c8ce5:	48 8b 6c 24 18       	mov    rbp,QWORD PTR [rsp+0x18]
     14c8cea:	48 89 d9             	mov    rcx,rbx
     14c8ced:	48 d1 e9             	shr    rcx,1
     14c8cf0:	89 d8                	mov    eax,ebx
     14c8cf2:	83 e0 01             	and    eax,0x1
     14c8cf5:	48 09 c8             	or     rax,rcx
     14c8cf8:	48 85 db             	test   rbx,rbx
     14c8cfb:	78 07                	js     14c8d04 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e288>
     14c8cfd:	f3 48 0f 2a d3       	cvtsi2ss xmm2,rbx
     14c8d02:	eb 09                	jmp    14c8d0d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e291>
     14c8d04:	f3 48 0f 2a d0       	cvtsi2ss xmm2,rax
     14c8d09:	f3 0f 58 d2          	addss  xmm2,xmm2
     14c8d0d:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     14c8d12:	f3 0f 10 48 30       	movss  xmm1,DWORD PTR [rax+0x30]
     14c8d17:	74 13                	je     14c8d2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e2b0>
     14c8d19:	f3 0f 59 d1          	mulss  xmm2,xmm1
     14c8d1d:	0f 2e c2             	ucomiss xmm0,xmm2
     14c8d20:	77 0a                	ja     14c8d2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e2b0>
     14c8d22:	4d 89 f5             	mov    r13,r14
     14c8d25:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     14c8d2a:	eb 79                	jmp    14c8da5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e329>
     14c8d2c:	48 83 fb 03          	cmp    rbx,0x3
     14c8d30:	0f 92 c0             	setb   al
     14c8d33:	48 8d 4b ff          	lea    rcx,[rbx-0x1]
     14c8d37:	48 85 cb             	test   rbx,rcx
     14c8d3a:	0f 95 c1             	setne  cl
     14c8d3d:	08 c1                	or     cl,al
     14c8d3f:	0f b6 c1             	movzx  eax,cl
     14c8d42:	48 8d 04 58          	lea    rax,[rax+rbx*2]
     14c8d46:	f3 0f 5e c1          	divss  xmm0,xmm1
     14c8d4a:	66 0f 3a 0a c0 0a    	roundss xmm0,xmm0,0xa
     14c8d50:	f3 48 0f 2c c8       	cvttss2si rcx,xmm0
     14c8d55:	48 89 ca             	mov    rdx,rcx
     14c8d58:	48 c1 fa 3f          	sar    rdx,0x3f
     14c8d5c:	f3 0f 5c 05 b8 5a ec 	subss  xmm0,DWORD PTR [rip+0xfffffffffeec5ab8]        # 38e81c <_ZTSSt12bad_any_cast@@Base-0x19ac>
     14c8d63:	fe 
     14c8d64:	f3 48 0f 2c f0       	cvttss2si rsi,xmm0
     14c8d69:	48 21 d6             	and    rsi,rdx
     14c8d6c:	48 09 ce             	or     rsi,rcx
     14c8d6f:	48 39 f0             	cmp    rax,rsi
     14c8d72:	48 0f 47 f0          	cmova  rsi,rax
     14c8d76:	48 89 ef             	mov    rdi,rbp
     14c8d79:	e8 12 4b 62 ff       	call   aed890 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3a830>
     14c8d7e:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     14c8d83:	48 8b 5e 18          	mov    rbx,QWORD PTR [rsi+0x18]
     14c8d87:	48 8d 43 ff          	lea    rax,[rbx-0x1]
     14c8d8b:	48 85 c3             	test   rbx,rax
     14c8d8e:	75 05                	jne    14c8d95 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e319>
     14c8d90:	49 21 c5             	and    r13,rax
     14c8d93:	eb 10                	jmp    14c8da5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e329>
     14c8d95:	49 39 dd             	cmp    r13,rbx
     14c8d98:	72 0b                	jb     14c8da5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e329>
     14c8d9a:	4c 89 e8             	mov    rax,r13
     14c8d9d:	31 d2                	xor    edx,edx
     14c8d9f:	48 f7 f3             	div    rbx
     14c8da2:	49 89 d5             	mov    r13,rdx
     14c8da5:	48 8b 4d 00          	mov    rcx,QWORD PTR [rbp+0x0]
     14c8da9:	4a 8b 04 e9          	mov    rax,QWORD PTR [rcx+r13*8]
     14c8dad:	48 85 c0             	test   rax,rax
     14c8db0:	74 08                	je     14c8dba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e33e>
     14c8db2:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     14c8db5:	49 89 0f             	mov    QWORD PTR [r15],rcx
     14c8db8:	eb 40                	jmp    14c8dfa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e37e>
     14c8dba:	48 8b 14 24          	mov    rdx,QWORD PTR [rsp]
     14c8dbe:	48 8b 02             	mov    rax,QWORD PTR [rdx]
     14c8dc1:	49 89 07             	mov    QWORD PTR [r15],rax
     14c8dc4:	4c 89 3a             	mov    QWORD PTR [rdx],r15
     14c8dc7:	4a 89 14 e9          	mov    QWORD PTR [rcx+r13*8],rdx
     14c8dcb:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14c8dce:	48 85 c0             	test   rax,rax
     14c8dd1:	74 2a                	je     14c8dfd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e381>
     14c8dd3:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     14c8dd7:	48 8d 4b ff          	lea    rcx,[rbx-0x1]
     14c8ddb:	48 85 cb             	test   rbx,rcx
     14c8dde:	75 05                	jne    14c8de5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e369>
     14c8de0:	48 21 c8             	and    rax,rcx
     14c8de3:	eb 0d                	jmp    14c8df2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e376>
     14c8de5:	48 39 d8             	cmp    rax,rbx
     14c8de8:	72 08                	jb     14c8df2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e376>
     14c8dea:	31 d2                	xor    edx,edx
     14c8dec:	48 f7 f3             	div    rbx
     14c8def:	48 89 d0             	mov    rax,rdx
     14c8df2:	48 c1 e0 03          	shl    rax,0x3
     14c8df6:	48 03 45 00          	add    rax,QWORD PTR [rbp+0x0]
     14c8dfa:	4c 89 38             	mov    QWORD PTR [rax],r15
     14c8dfd:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     14c8e04:	00 
     14c8e05:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     14c8e09:	48 ff 46 28          	inc    QWORD PTR [rsi+0x28]
     14c8e0d:	e8 56 3c 5f ff       	call   abca68 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9a08>
     14c8e12:	49 8b 7f 30          	mov    rdi,QWORD PTR [r15+0x30]
     14c8e16:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
     14c8e1b:	41 0f 11 47 28       	movups XMMWORD PTR [r15+0x28],xmm0
     14c8e20:	e8 61 56 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14c8e25:	31 ff                	xor    edi,edi
     14c8e27:	e8 5a 56 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14c8e2c:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]
     14c8e32:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
     14c8e39:	e8 48 56 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14c8e3e:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     14c8e43:	e8 48 50 32 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14c8e48:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c8e4f:	00 00 
     14c8e51:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]
     14c8e58:	00 
     14c8e59:	0f 85 0c 01 00 00    	jne    14c8f6b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e4ef>
     14c8e5f:	48 81 c4 d8 00 00 00 	add    rsp,0xd8
     14c8e66:	5b                   	pop    rbx
     14c8e67:	41 5c                	pop    r12
     14c8e69:	41 5d                	pop    r13
     14c8e6b:	41 5e                	pop    r14
     14c8e6d:	41 5f                	pop    r15
     14c8e6f:	5d                   	pop    rbp
     14c8e70:	c3                   	ret
     14c8e71:	0f 57 c0             	xorps  xmm0,xmm0
     14c8e74:	4c 8d a4 24 90 00 00 	lea    r12,[rsp+0x90]
     14c8e7b:	00 
     14c8e7c:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
     14c8e81:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0
     14c8e87:	48 8d 35 40 ce e5 fe 	lea    rsi,[rip+0xfffffffffee5ce40]        # 325cce <_ZTSSt12bad_any_cast@@Base-0x6a4fa>
     14c8e8e:	4c 89 e7             	mov    rdi,r12
     14c8e91:	e8 5c d1 30 00       	call   17d5ff2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1e13>
     14c8e96:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     14c8e9d:	00 
     14c8e9e:	48 c7 07 01 00 00 00 	mov    QWORD PTR [rdi],0x1
     14c8ea5:	48 8d 05 d0 90 f8 fe 	lea    rax,[rip+0xfffffffffef890d0]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     14c8eac:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
     14c8eb0:	48 8d 05 9c 9b ea fe 	lea    rax,[rip+0xfffffffffeea9b9c]        # 372a53 <_ZTSSt12bad_any_cast@@Base-0x1d775>
     14c8eb7:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
     14c8ebb:	c7 47 18 0e 00 00 00 	mov    DWORD PTR [rdi+0x18],0xe
     14c8ec2:	4c 89 e6             	mov    rsi,r12
     14c8ec5:	e8 de 0d 5e ff       	call   aa9ca8 <JNI_OnUnload@@Base+0x31575>
     14c8eca:	4c 89 e7             	mov    rdi,r12
     14c8ecd:	e8 be 4f 32 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14c8ed2:	e9 c3 f8 ff ff       	jmp    14c879a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30dd1e>
     14c8ed7:	eb 12                	jmp    14c8eeb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e46f>
     14c8ed9:	48 89 c3             	mov    rbx,rax
     14c8edc:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     14c8ee3:	00 
     14c8ee4:	e8 e1 13 5b ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     14c8ee9:	eb 34                	jmp    14c8f1f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e4a3>
     14c8eeb:	48 89 c3             	mov    rbx,rax
     14c8eee:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     14c8ef5:	00 
     14c8ef6:	e8 6d 3b 5f ff       	call   abca68 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9a08>
     14c8efb:	eb 03                	jmp    14c8f00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e484>
     14c8efd:	48 89 c3             	mov    rbx,rax
     14c8f00:	4c 89 e7             	mov    rdi,r12
     14c8f03:	e8 7e 55 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14c8f08:	eb 2a                	jmp    14c8f34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e4b8>
     14c8f0a:	48 89 c3             	mov    rbx,rax
     14c8f0d:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14c8f10:	4c 89 f7             	mov    rdi,r14
     14c8f13:	ff 50 08             	call   QWORD PTR [rax+0x8]
     14c8f16:	eb 1c                	jmp    14c8f34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e4b8>
     14c8f18:	eb 02                	jmp    14c8f1c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e4a0>
     14c8f1a:	eb 00                	jmp    14c8f1c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e4a0>
     14c8f1c:	48 89 c3             	mov    rbx,rax
     14c8f1f:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     14c8f24:	4c 89 f7             	mov    rdi,r14
     14c8f27:	e8 aa 5f 17 00       	call   163eed6 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a044>
     14c8f2c:	4c 89 f7             	mov    rdi,r14
     14c8f2f:	e8 2c 58 32 00       	call   17ee760 <free@plt>
     14c8f34:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]
     14c8f3a:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
     14c8f41:	e8 40 55 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14c8f46:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     14c8f4b:	e8 40 4f 32 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14c8f50:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c8f57:	00 00 
     14c8f59:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]
     14c8f60:	00 
     14c8f61:	75 08                	jne    14c8f6b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e4ef>
     14c8f63:	48 89 df             	mov    rdi,rbx
     14c8f66:	e8 65 6d 5a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     14c8f6b:	e8 40 6b 32 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x1878ee8 codeSlots=43
- +0x0: 0x0 FDE=None
- +0x8: 0xa50370 FDE=(10814320, 10814325)
- +0x10: 0x0 FDE=None
- +0x18: 0x0 FDE=None
- +0x20: 0x14c8710 FDE=(21792528, 21794672)
- +0x28: 0x14c8f70 FDE=(21794672, 21794765)
- +0x30: 0x14c8fce FDE=(21794766, 21794970)
- +0x38: 0x14c909a FDE=(21794970, 21795132)
- +0x40: 0x14c913c FDE=(21795132, 21795175)
- +0x48: 0x14c9168 FDE=(21795176, 21795195)
- +0x50: 0x14c917c FDE=(21795196, 21795214)
- +0x58: 0x0 FDE=None
- +0x60: 0x0 FDE=None
- +0x68: 0x14c970e FDE=(21796622, 21796765)
- +0x70: 0x14c979e FDE=(21796766, 21796784)
- +0x78: 0xaf6576 FDE=(11494774, 11494779)
- +0x80: 0xec70f2 FDE=(15495410, 15495444)
- +0x88: 0x9d81d0 FDE=(10322384, 10322387)
- +0x90: 0x9d7de0 FDE=(10321376, 10321377)
- +0x98: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa0: 0x14c97b0 FDE=(21796784, 21797189)
- +0xa8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb0: 0x14c9946 FDE=(21797190, 21797202)
- +0xb8: 0x14c9952 FDE=(21797202, 21797503)
- +0xc0: 0x155e8c6 FDE=(22407366, 22407375)
- +0xc8: 0x155e8d0 FDE=(22407376, 22407385)
- +0xd0: 0x14c9a80 FDE=(21797504, 21797782)
- +0xd8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe0: 0xd8d19e FDE=(14209438, 14209456)
- +0xe8: 0xec7170 FDE=(15495536, 15495553)
- +0xf0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xf8: 0x14c9b96 FDE=(21797782, 21798175)
- +0x100: 0x14c9d20 FDE=(21798176, 21798184)
- +0x108: 0x9d7de0 FDE=(10321376, 10321377)
- +0x110: 0x14c9d28 FDE=(21798184, 21798373)
- +0x118: 0x14c9de6 FDE=(21798374, 21798630)
- +0x120: 0xf23934 FDE=(15874356, 15874368)
- +0x128: 0x14c9ee6 FDE=(21798630, 21798979)
- +0x130: 0x146af6e FDE=(21409646, 21409658)
- +0x138: 0x14ca044 FDE=(21798980, 21800002)
- +0x140: 0x14ca442 FDE=(21800002, 21800274)
- +0x148: 0x14ca552 FDE=(21800274, 21800553)
- +0x150: 0x9d7de0 FDE=(10321376, 10321377)
- +0x158: 0x9d7de0 FDE=(10321376, 10321377)
- +0x160: 0x9d7de0 FDE=(10321376, 10321377)
- +0x168: 0x9d7de0 FDE=(10321376, 10321377)
- +0x170: 0x9d7de0 FDE=(10321376, 10321377)
#### +0x28 body
     14c8f70:	41 56                	push   r14
     14c8f72:	53                   	push   rbx
     14c8f73:	48 83 ec 28          	sub    rsp,0x28
     14c8f77:	48 89 fb             	mov    rbx,rdi
     14c8f7a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c8f81:	00 00 
     14c8f83:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     14c8f88:	48 83 c3 10          	add    rbx,0x10
     14c8f8c:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
     14c8f8f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     14c8f92:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     14c8f97:	4c 89 f7             	mov    rdi,r14
     14c8f9a:	ff 50 38             	call   QWORD PTR [rax+0x38]
     14c8f9d:	48 89 df             	mov    rdi,rbx
     14c8fa0:	4c 89 f6             	mov    rsi,r14
     14c8fa3:	e8 e6 01 00 00       	call   14c918e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e712>
     14c8fa8:	4c 89 f7             	mov    rdi,r14
     14c8fab:	e8 e0 4e 32 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14c8fb0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c8fb7:	00 00 
     14c8fb9:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     14c8fbe:	75 08                	jne    14c8fc8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e54c>
     14c8fc0:	48 83 c4 28          	add    rsp,0x28
     14c8fc4:	5b                   	pop    rbx
     14c8fc5:	41 5e                	pop    r14
     14c8fc7:	c3                   	ret
     14c8fc8:	e8 e3 6a 32 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x1878ef0 codeSlots=44
- +0x0: 0xa50370 FDE=(10814320, 10814325)
- +0x8: 0x0 FDE=None
- +0x10: 0x0 FDE=None
- +0x18: 0x14c8710 FDE=(21792528, 21794672)
- +0x20: 0x14c8f70 FDE=(21794672, 21794765)
- +0x28: 0x14c8fce FDE=(21794766, 21794970)
- +0x30: 0x14c909a FDE=(21794970, 21795132)
- +0x38: 0x14c913c FDE=(21795132, 21795175)
- +0x40: 0x14c9168 FDE=(21795176, 21795195)
- +0x48: 0x14c917c FDE=(21795196, 21795214)
- +0x50: 0x0 FDE=None
- +0x58: 0x0 FDE=None
- +0x60: 0x14c970e FDE=(21796622, 21796765)
- +0x68: 0x14c979e FDE=(21796766, 21796784)
- +0x70: 0xaf6576 FDE=(11494774, 11494779)
- +0x78: 0xec70f2 FDE=(15495410, 15495444)
- +0x80: 0x9d81d0 FDE=(10322384, 10322387)
- +0x88: 0x9d7de0 FDE=(10321376, 10321377)
- +0x90: 0x9d7de0 FDE=(10321376, 10321377)
- +0x98: 0x14c97b0 FDE=(21796784, 21797189)
- +0xa0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa8: 0x14c9946 FDE=(21797190, 21797202)
- +0xb0: 0x14c9952 FDE=(21797202, 21797503)
- +0xb8: 0x155e8c6 FDE=(22407366, 22407375)
- +0xc0: 0x155e8d0 FDE=(22407376, 22407385)
- +0xc8: 0x14c9a80 FDE=(21797504, 21797782)
- +0xd0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd8: 0xd8d19e FDE=(14209438, 14209456)
- +0xe0: 0xec7170 FDE=(15495536, 15495553)
- +0xe8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xf0: 0x14c9b96 FDE=(21797782, 21798175)
- +0xf8: 0x14c9d20 FDE=(21798176, 21798184)
- +0x100: 0x9d7de0 FDE=(10321376, 10321377)
- +0x108: 0x14c9d28 FDE=(21798184, 21798373)
- +0x110: 0x14c9de6 FDE=(21798374, 21798630)
- +0x118: 0xf23934 FDE=(15874356, 15874368)
- +0x120: 0x14c9ee6 FDE=(21798630, 21798979)
- +0x128: 0x146af6e FDE=(21409646, 21409658)
- +0x130: 0x14ca044 FDE=(21798980, 21800002)
- +0x138: 0x14ca442 FDE=(21800002, 21800274)
- +0x140: 0x14ca552 FDE=(21800274, 21800553)
- +0x148: 0x9d7de0 FDE=(10321376, 10321377)
- +0x150: 0x9d7de0 FDE=(10321376, 10321377)
- +0x158: 0x9d7de0 FDE=(10321376, 10321377)
- +0x160: 0x9d7de0 FDE=(10321376, 10321377)
- +0x168: 0x9d7de0 FDE=(10321376, 10321377)
- +0x170: 0x9d7de0 FDE=(10321376, 10321377)
#### +0x28 body
     14c8fce:	41 57                	push   r15
     14c8fd0:	41 56                	push   r14
     14c8fd2:	53                   	push   rbx
     14c8fd3:	48 83 ec 20          	sub    rsp,0x20
     14c8fd7:	48 89 fb             	mov    rbx,rdi
     14c8fda:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c8fe1:	00 00 
     14c8fe3:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     14c8fe8:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
     14c8fec:	0f 57 c0             	xorps  xmm0,xmm0
     14c8fef:	48 89 e0             	mov    rax,rsp
     14c8ff2:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
     14c8ff5:	48 89 d6             	mov    rsi,rdx
     14c8ff8:	48 89 c2             	mov    rdx,rax
     14c8ffb:	e8 6a 99 78 ff       	call   c5296a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19f90a>
     14c9000:	4c 8b 38             	mov    r15,QWORD PTR [rax]
     14c9003:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
     14c9007:	4d 85 f6             	test   r14,r14
     14c900a:	74 0c                	je     14c9018 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e59c>
     14c900c:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
     14c9011:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14c9016:	eb 02                	jmp    14c901a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e59e>
     14c9018:	31 ff                	xor    edi,edi
     14c901a:	e8 67 54 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14c901f:	4d 85 ff             	test   r15,r15
     14c9022:	74 23                	je     14c9047 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e5cb>
     14c9024:	48 89 e7             	mov    rdi,rsp
     14c9027:	4c 89 fe             	mov    rsi,r15
     14c902a:	e8 6f 21 18 00       	call   164b19e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4630c>
     14c902f:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
     14c9033:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     14c9036:	31 ff                	xor    edi,edi
     14c9038:	e8 49 54 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14c903d:	4c 89 f7             	mov    rdi,r14
     14c9040:	e8 41 54 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14c9045:	eb 0e                	jmp    14c9055 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e5d9>
     14c9047:	4c 89 f7             	mov    rdi,r14
     14c904a:	e8 37 54 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14c904f:	0f 57 c0             	xorps  xmm0,xmm0
     14c9052:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     14c9055:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c905c:	00 00 
     14c905e:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     14c9063:	75 30                	jne    14c9095 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e619>
     14c9065:	48 89 d8             	mov    rax,rbx
     14c9068:	48 83 c4 20          	add    rsp,0x20
     14c906c:	5b                   	pop    rbx
     14c906d:	41 5e                	pop    r14
     14c906f:	41 5f                	pop    r15
     14c9071:	c3                   	ret
     14c9072:	48 89 c3             	mov    rbx,rax
     14c9075:	4c 89 f7             	mov    rdi,r14
     14c9078:	e8 09 54 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14c907d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c9084:	00 00 
     14c9086:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     14c908b:	75 08                	jne    14c9095 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e619>
     14c908d:	48 89 df             	mov    rdi,rbx
     14c9090:	e8 3b 6c 5a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     14c9095:	e8 16 6a 32 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x1878ef8 codeSlots=44
- +0x0: 0x0 FDE=None
- +0x8: 0x0 FDE=None
- +0x10: 0x14c8710 FDE=(21792528, 21794672)
- +0x18: 0x14c8f70 FDE=(21794672, 21794765)
- +0x20: 0x14c8fce FDE=(21794766, 21794970)
- +0x28: 0x14c909a FDE=(21794970, 21795132)
- +0x30: 0x14c913c FDE=(21795132, 21795175)
- +0x38: 0x14c9168 FDE=(21795176, 21795195)
- +0x40: 0x14c917c FDE=(21795196, 21795214)
- +0x48: 0x0 FDE=None
- +0x50: 0x0 FDE=None
- +0x58: 0x14c970e FDE=(21796622, 21796765)
- +0x60: 0x14c979e FDE=(21796766, 21796784)
- +0x68: 0xaf6576 FDE=(11494774, 11494779)
- +0x70: 0xec70f2 FDE=(15495410, 15495444)
- +0x78: 0x9d81d0 FDE=(10322384, 10322387)
- +0x80: 0x9d7de0 FDE=(10321376, 10321377)
- +0x88: 0x9d7de0 FDE=(10321376, 10321377)
- +0x90: 0x14c97b0 FDE=(21796784, 21797189)
- +0x98: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa0: 0x14c9946 FDE=(21797190, 21797202)
- +0xa8: 0x14c9952 FDE=(21797202, 21797503)
- +0xb0: 0x155e8c6 FDE=(22407366, 22407375)
- +0xb8: 0x155e8d0 FDE=(22407376, 22407385)
- +0xc0: 0x14c9a80 FDE=(21797504, 21797782)
- +0xc8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd0: 0xd8d19e FDE=(14209438, 14209456)
- +0xd8: 0xec7170 FDE=(15495536, 15495553)
- +0xe0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe8: 0x14c9b96 FDE=(21797782, 21798175)
- +0xf0: 0x14c9d20 FDE=(21798176, 21798184)
- +0xf8: 0x9d7de0 FDE=(10321376, 10321377)
- +0x100: 0x14c9d28 FDE=(21798184, 21798373)
- +0x108: 0x14c9de6 FDE=(21798374, 21798630)
- +0x110: 0xf23934 FDE=(15874356, 15874368)
- +0x118: 0x14c9ee6 FDE=(21798630, 21798979)
- +0x120: 0x146af6e FDE=(21409646, 21409658)
- +0x128: 0x14ca044 FDE=(21798980, 21800002)
- +0x130: 0x14ca442 FDE=(21800002, 21800274)
- +0x138: 0x14ca552 FDE=(21800274, 21800553)
- +0x140: 0x9d7de0 FDE=(10321376, 10321377)
- +0x148: 0x9d7de0 FDE=(10321376, 10321377)
- +0x150: 0x9d7de0 FDE=(10321376, 10321377)
- +0x158: 0x9d7de0 FDE=(10321376, 10321377)
- +0x160: 0x9d7de0 FDE=(10321376, 10321377)
- +0x168: 0x9d7de0 FDE=(10321376, 10321377)
- +0x170: 0x9d7de0 FDE=(10321376, 10321377)
#### +0x28 body
     14c909a:	41 56                	push   r14
     14c909c:	53                   	push   rbx
     14c909d:	48 83 ec 18          	sub    rsp,0x18
     14c90a1:	49 89 f6             	mov    r14,rsi
     14c90a4:	48 89 fb             	mov    rbx,rdi
     14c90a7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c90ae:	00 00 
     14c90b0:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     14c90b5:	48 8d 7a 30          	lea    rdi,[rdx+0x30]
     14c90b9:	48 8d 35 30 fa f6 fe 	lea    rsi,[rip+0xfffffffffef6fa30]        # 438af0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e53f>
     14c90c0:	e8 a7 23 79 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
     14c90c5:	48 85 c0             	test   rax,rax
     14c90c8:	74 33                	je     14c90fd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e681>
     14c90ca:	49 83 c6 10          	add    r14,0x10
     14c90ce:	0f 57 c0             	xorps  xmm0,xmm0
     14c90d1:	48 89 e2             	mov    rdx,rsp
     14c90d4:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
     14c90d7:	4c 89 f7             	mov    rdi,r14
     14c90da:	48 89 c6             	mov    rsi,rax
     14c90dd:	e8 88 98 78 ff       	call   c5296a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19f90a>
     14c90e2:	48 8b 48 08          	mov    rcx,QWORD PTR [rax+0x8]
     14c90e6:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     14c90e9:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     14c90ec:	48 85 c9             	test   rcx,rcx
     14c90ef:	74 24                	je     14c9115 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e699>
     14c90f1:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     14c90f6:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14c90fb:	eb 1a                	jmp    14c9117 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e69b>
     14c90fd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c9104:	00 00 
     14c9106:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     14c910b:	75 2a                	jne    14c9137 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e6bb>
     14c910d:	0f 57 c0             	xorps  xmm0,xmm0
     14c9110:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     14c9113:	eb 17                	jmp    14c912c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e6b0>
     14c9115:	31 ff                	xor    edi,edi
     14c9117:	e8 6a 53 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14c911c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c9123:	00 00 
     14c9125:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     14c912a:	75 0b                	jne    14c9137 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e6bb>
     14c912c:	48 89 d8             	mov    rax,rbx
     14c912f:	48 83 c4 18          	add    rsp,0x18
     14c9133:	5b                   	pop    rbx
     14c9134:	41 5e                	pop    r14
     14c9136:	c3                   	ret
     14c9137:	e8 74 69 32 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x1878f00 codeSlots=45
- +0x0: 0x0 FDE=None
- +0x8: 0x14c8710 FDE=(21792528, 21794672)
- +0x10: 0x14c8f70 FDE=(21794672, 21794765)
- +0x18: 0x14c8fce FDE=(21794766, 21794970)
- +0x20: 0x14c909a FDE=(21794970, 21795132)
- +0x28: 0x14c913c FDE=(21795132, 21795175)
- +0x30: 0x14c9168 FDE=(21795176, 21795195)
- +0x38: 0x14c917c FDE=(21795196, 21795214)
- +0x40: 0x0 FDE=None
- +0x48: 0x0 FDE=None
- +0x50: 0x14c970e FDE=(21796622, 21796765)
- +0x58: 0x14c979e FDE=(21796766, 21796784)
- +0x60: 0xaf6576 FDE=(11494774, 11494779)
- +0x68: 0xec70f2 FDE=(15495410, 15495444)
- +0x70: 0x9d81d0 FDE=(10322384, 10322387)
- +0x78: 0x9d7de0 FDE=(10321376, 10321377)
- +0x80: 0x9d7de0 FDE=(10321376, 10321377)
- +0x88: 0x14c97b0 FDE=(21796784, 21797189)
- +0x90: 0x9d7de0 FDE=(10321376, 10321377)
- +0x98: 0x14c9946 FDE=(21797190, 21797202)
- +0xa0: 0x14c9952 FDE=(21797202, 21797503)
- +0xa8: 0x155e8c6 FDE=(22407366, 22407375)
- +0xb0: 0x155e8d0 FDE=(22407376, 22407385)
- +0xb8: 0x14c9a80 FDE=(21797504, 21797782)
- +0xc0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc8: 0xd8d19e FDE=(14209438, 14209456)
- +0xd0: 0xec7170 FDE=(15495536, 15495553)
- +0xd8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe0: 0x14c9b96 FDE=(21797782, 21798175)
- +0xe8: 0x14c9d20 FDE=(21798176, 21798184)
- +0xf0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xf8: 0x14c9d28 FDE=(21798184, 21798373)
- +0x100: 0x14c9de6 FDE=(21798374, 21798630)
- +0x108: 0xf23934 FDE=(15874356, 15874368)
- +0x110: 0x14c9ee6 FDE=(21798630, 21798979)
- +0x118: 0x146af6e FDE=(21409646, 21409658)
- +0x120: 0x14ca044 FDE=(21798980, 21800002)
- +0x128: 0x14ca442 FDE=(21800002, 21800274)
- +0x130: 0x14ca552 FDE=(21800274, 21800553)
- +0x138: 0x9d7de0 FDE=(10321376, 10321377)
- +0x140: 0x9d7de0 FDE=(10321376, 10321377)
- +0x148: 0x9d7de0 FDE=(10321376, 10321377)
- +0x150: 0x9d7de0 FDE=(10321376, 10321377)
- +0x158: 0x9d7de0 FDE=(10321376, 10321377)
- +0x160: 0x9d7de0 FDE=(10321376, 10321377)
- +0x168: 0x9d7de0 FDE=(10321376, 10321377)
- +0x170: 0x9d7de0 FDE=(10321376, 10321377)
#### +0x28 body
     14c913c:	53                   	push   rbx
     14c913d:	48 89 fb             	mov    rbx,rdi
     14c9140:	48 8d 7e 30          	lea    rdi,[rsi+0x30]
     14c9144:	48 8d 35 a5 f9 f6 fe 	lea    rsi,[rip+0xfffffffffef6f9a5]        # 438af0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e53f>
     14c914b:	e8 1c 23 79 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
     14c9150:	48 85 c0             	test   rax,rax
     14c9153:	74 10                	je     14c9165 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e6e9>
     14c9155:	48 83 c3 10          	add    rbx,0x10
     14c9159:	48 89 df             	mov    rdi,rbx
     14c915c:	48 89 c6             	mov    rsi,rax
     14c915f:	5b                   	pop    rbx
     14c9160:	e9 29 00 00 00       	jmp    14c918e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e712>
     14c9165:	5b                   	pop    rbx
     14c9166:	c3                   	ret

### AP 0x1878f08 codeSlots=46
- +0x0: 0x14c8710 FDE=(21792528, 21794672)
- +0x8: 0x14c8f70 FDE=(21794672, 21794765)
- +0x10: 0x14c8fce FDE=(21794766, 21794970)
- +0x18: 0x14c909a FDE=(21794970, 21795132)
- +0x20: 0x14c913c FDE=(21795132, 21795175)
- +0x28: 0x14c9168 FDE=(21795176, 21795195)
- +0x30: 0x14c917c FDE=(21795196, 21795214)
- +0x38: 0x0 FDE=None
- +0x40: 0x0 FDE=None
- +0x48: 0x14c970e FDE=(21796622, 21796765)
- +0x50: 0x14c979e FDE=(21796766, 21796784)
- +0x58: 0xaf6576 FDE=(11494774, 11494779)
- +0x60: 0xec70f2 FDE=(15495410, 15495444)
- +0x68: 0x9d81d0 FDE=(10322384, 10322387)
- +0x70: 0x9d7de0 FDE=(10321376, 10321377)
- +0x78: 0x9d7de0 FDE=(10321376, 10321377)
- +0x80: 0x14c97b0 FDE=(21796784, 21797189)
- +0x88: 0x9d7de0 FDE=(10321376, 10321377)
- +0x90: 0x14c9946 FDE=(21797190, 21797202)
- +0x98: 0x14c9952 FDE=(21797202, 21797503)
- +0xa0: 0x155e8c6 FDE=(22407366, 22407375)
- +0xa8: 0x155e8d0 FDE=(22407376, 22407385)
- +0xb0: 0x14c9a80 FDE=(21797504, 21797782)
- +0xb8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc0: 0xd8d19e FDE=(14209438, 14209456)
- +0xc8: 0xec7170 FDE=(15495536, 15495553)
- +0xd0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd8: 0x14c9b96 FDE=(21797782, 21798175)
- +0xe0: 0x14c9d20 FDE=(21798176, 21798184)
- +0xe8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xf0: 0x14c9d28 FDE=(21798184, 21798373)
- +0xf8: 0x14c9de6 FDE=(21798374, 21798630)
- +0x100: 0xf23934 FDE=(15874356, 15874368)
- +0x108: 0x14c9ee6 FDE=(21798630, 21798979)
- +0x110: 0x146af6e FDE=(21409646, 21409658)
- +0x118: 0x14ca044 FDE=(21798980, 21800002)
- +0x120: 0x14ca442 FDE=(21800002, 21800274)
- +0x128: 0x14ca552 FDE=(21800274, 21800553)
- +0x130: 0x9d7de0 FDE=(10321376, 10321377)
- +0x138: 0x9d7de0 FDE=(10321376, 10321377)
- +0x140: 0x9d7de0 FDE=(10321376, 10321377)
- +0x148: 0x9d7de0 FDE=(10321376, 10321377)
- +0x150: 0x9d7de0 FDE=(10321376, 10321377)
- +0x158: 0x9d7de0 FDE=(10321376, 10321377)
- +0x160: 0x9d7de0 FDE=(10321376, 10321377)
- +0x168: 0x9d7de0 FDE=(10321376, 10321377)
- +0x170: 0x9d7de0 FDE=(10321376, 10321377)
#### +0x28 body
     14c9168:	48 8d 05 99 fd 3a 00 	lea    rax,[rip+0x3afd99]        # 1878f08 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x355f0>
     14c916f:	48 89 07             	mov    QWORD PTR [rdi],rax
     14c9172:	48 83 c7 10          	add    rdi,0x10
     14c9176:	e9 a3 69 78 ff       	jmp    c4fb1e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19cabe>

### AP 0x1878f10 codeSlots=46
- +0x0: 0x14c8f70 FDE=(21794672, 21794765)
- +0x8: 0x14c8fce FDE=(21794766, 21794970)
- +0x10: 0x14c909a FDE=(21794970, 21795132)
- +0x18: 0x14c913c FDE=(21795132, 21795175)
- +0x20: 0x14c9168 FDE=(21795176, 21795195)
- +0x28: 0x14c917c FDE=(21795196, 21795214)
- +0x30: 0x0 FDE=None
- +0x38: 0x0 FDE=None
- +0x40: 0x14c970e FDE=(21796622, 21796765)
- +0x48: 0x14c979e FDE=(21796766, 21796784)
- +0x50: 0xaf6576 FDE=(11494774, 11494779)
- +0x58: 0xec70f2 FDE=(15495410, 15495444)
- +0x60: 0x9d81d0 FDE=(10322384, 10322387)
- +0x68: 0x9d7de0 FDE=(10321376, 10321377)
- +0x70: 0x9d7de0 FDE=(10321376, 10321377)
- +0x78: 0x14c97b0 FDE=(21796784, 21797189)
- +0x80: 0x9d7de0 FDE=(10321376, 10321377)
- +0x88: 0x14c9946 FDE=(21797190, 21797202)
- +0x90: 0x14c9952 FDE=(21797202, 21797503)
- +0x98: 0x155e8c6 FDE=(22407366, 22407375)
- +0xa0: 0x155e8d0 FDE=(22407376, 22407385)
- +0xa8: 0x14c9a80 FDE=(21797504, 21797782)
- +0xb0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb8: 0xd8d19e FDE=(14209438, 14209456)
- +0xc0: 0xec7170 FDE=(15495536, 15495553)
- +0xc8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd0: 0x14c9b96 FDE=(21797782, 21798175)
- +0xd8: 0x14c9d20 FDE=(21798176, 21798184)
- +0xe0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe8: 0x14c9d28 FDE=(21798184, 21798373)
- +0xf0: 0x14c9de6 FDE=(21798374, 21798630)
- +0xf8: 0xf23934 FDE=(15874356, 15874368)
- +0x100: 0x14c9ee6 FDE=(21798630, 21798979)
- +0x108: 0x146af6e FDE=(21409646, 21409658)
- +0x110: 0x14ca044 FDE=(21798980, 21800002)
- +0x118: 0x14ca442 FDE=(21800002, 21800274)
- +0x120: 0x14ca552 FDE=(21800274, 21800553)
- +0x128: 0x9d7de0 FDE=(10321376, 10321377)
- +0x130: 0x9d7de0 FDE=(10321376, 10321377)
- +0x138: 0x9d7de0 FDE=(10321376, 10321377)
- +0x140: 0x9d7de0 FDE=(10321376, 10321377)
- +0x148: 0x9d7de0 FDE=(10321376, 10321377)
- +0x150: 0x9d7de0 FDE=(10321376, 10321377)
- +0x158: 0x9d7de0 FDE=(10321376, 10321377)
- +0x160: 0x9d7de0 FDE=(10321376, 10321377)
- +0x168: 0x9d7de0 FDE=(10321376, 10321377)
- +0x170: 0x9d81d0 FDE=(10322384, 10322387)
#### +0x28 body
     14c917c:	53                   	push   rbx
     14c917d:	48 89 fb             	mov    rbx,rdi
     14c9180:	e8 e3 ff ff ff       	call   14c9168 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e6ec>
     14c9185:	48 89 df             	mov    rdi,rbx
     14c9188:	5b                   	pop    rbx
     14c9189:	e9 92 4d 32 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x1878f18 codeSlots=46
- +0x0: 0x14c8fce FDE=(21794766, 21794970)
- +0x8: 0x14c909a FDE=(21794970, 21795132)
- +0x10: 0x14c913c FDE=(21795132, 21795175)
- +0x18: 0x14c9168 FDE=(21795176, 21795195)
- +0x20: 0x14c917c FDE=(21795196, 21795214)
- +0x28: 0x0 FDE=None
- +0x30: 0x0 FDE=None
- +0x38: 0x14c970e FDE=(21796622, 21796765)
- +0x40: 0x14c979e FDE=(21796766, 21796784)
- +0x48: 0xaf6576 FDE=(11494774, 11494779)
- +0x50: 0xec70f2 FDE=(15495410, 15495444)
- +0x58: 0x9d81d0 FDE=(10322384, 10322387)
- +0x60: 0x9d7de0 FDE=(10321376, 10321377)
- +0x68: 0x9d7de0 FDE=(10321376, 10321377)
- +0x70: 0x14c97b0 FDE=(21796784, 21797189)
- +0x78: 0x9d7de0 FDE=(10321376, 10321377)
- +0x80: 0x14c9946 FDE=(21797190, 21797202)
- +0x88: 0x14c9952 FDE=(21797202, 21797503)
- +0x90: 0x155e8c6 FDE=(22407366, 22407375)
- +0x98: 0x155e8d0 FDE=(22407376, 22407385)
- +0xa0: 0x14c9a80 FDE=(21797504, 21797782)
- +0xa8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb0: 0xd8d19e FDE=(14209438, 14209456)
- +0xb8: 0xec7170 FDE=(15495536, 15495553)
- +0xc0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc8: 0x14c9b96 FDE=(21797782, 21798175)
- +0xd0: 0x14c9d20 FDE=(21798176, 21798184)
- +0xd8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe0: 0x14c9d28 FDE=(21798184, 21798373)
- +0xe8: 0x14c9de6 FDE=(21798374, 21798630)
- +0xf0: 0xf23934 FDE=(15874356, 15874368)
- +0xf8: 0x14c9ee6 FDE=(21798630, 21798979)
- +0x100: 0x146af6e FDE=(21409646, 21409658)
- +0x108: 0x14ca044 FDE=(21798980, 21800002)
- +0x110: 0x14ca442 FDE=(21800002, 21800274)
- +0x118: 0x14ca552 FDE=(21800274, 21800553)
- +0x120: 0x9d7de0 FDE=(10321376, 10321377)
- +0x128: 0x9d7de0 FDE=(10321376, 10321377)
- +0x130: 0x9d7de0 FDE=(10321376, 10321377)
- +0x138: 0x9d7de0 FDE=(10321376, 10321377)
- +0x140: 0x9d7de0 FDE=(10321376, 10321377)
- +0x148: 0x9d7de0 FDE=(10321376, 10321377)
- +0x150: 0x9d7de0 FDE=(10321376, 10321377)
- +0x158: 0x9d7de0 FDE=(10321376, 10321377)
- +0x160: 0x9d7de0 FDE=(10321376, 10321377)
- +0x168: 0x9d81d0 FDE=(10322384, 10322387)
- +0x170: 0xec7182 FDE=(15495554, 15495575)

### AP 0x1878f20 codeSlots=46
- +0x0: 0x14c909a FDE=(21794970, 21795132)
- +0x8: 0x14c913c FDE=(21795132, 21795175)
- +0x10: 0x14c9168 FDE=(21795176, 21795195)
- +0x18: 0x14c917c FDE=(21795196, 21795214)
- +0x20: 0x0 FDE=None
- +0x28: 0x0 FDE=None
- +0x30: 0x14c970e FDE=(21796622, 21796765)
- +0x38: 0x14c979e FDE=(21796766, 21796784)
- +0x40: 0xaf6576 FDE=(11494774, 11494779)
- +0x48: 0xec70f2 FDE=(15495410, 15495444)
- +0x50: 0x9d81d0 FDE=(10322384, 10322387)
- +0x58: 0x9d7de0 FDE=(10321376, 10321377)
- +0x60: 0x9d7de0 FDE=(10321376, 10321377)
- +0x68: 0x14c97b0 FDE=(21796784, 21797189)
- +0x70: 0x9d7de0 FDE=(10321376, 10321377)
- +0x78: 0x14c9946 FDE=(21797190, 21797202)
- +0x80: 0x14c9952 FDE=(21797202, 21797503)
- +0x88: 0x155e8c6 FDE=(22407366, 22407375)
- +0x90: 0x155e8d0 FDE=(22407376, 22407385)
- +0x98: 0x14c9a80 FDE=(21797504, 21797782)
- +0xa0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa8: 0xd8d19e FDE=(14209438, 14209456)
- +0xb0: 0xec7170 FDE=(15495536, 15495553)
- +0xb8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc0: 0x14c9b96 FDE=(21797782, 21798175)
- +0xc8: 0x14c9d20 FDE=(21798176, 21798184)
- +0xd0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd8: 0x14c9d28 FDE=(21798184, 21798373)
- +0xe0: 0x14c9de6 FDE=(21798374, 21798630)
- +0xe8: 0xf23934 FDE=(15874356, 15874368)
- +0xf0: 0x14c9ee6 FDE=(21798630, 21798979)
- +0xf8: 0x146af6e FDE=(21409646, 21409658)
- +0x100: 0x14ca044 FDE=(21798980, 21800002)
- +0x108: 0x14ca442 FDE=(21800002, 21800274)
- +0x110: 0x14ca552 FDE=(21800274, 21800553)
- +0x118: 0x9d7de0 FDE=(10321376, 10321377)
- +0x120: 0x9d7de0 FDE=(10321376, 10321377)
- +0x128: 0x9d7de0 FDE=(10321376, 10321377)
- +0x130: 0x9d7de0 FDE=(10321376, 10321377)
- +0x138: 0x9d7de0 FDE=(10321376, 10321377)
- +0x140: 0x9d7de0 FDE=(10321376, 10321377)
- +0x148: 0x9d7de0 FDE=(10321376, 10321377)
- +0x150: 0x9d7de0 FDE=(10321376, 10321377)
- +0x158: 0x9d7de0 FDE=(10321376, 10321377)
- +0x160: 0x9d81d0 FDE=(10322384, 10322387)
- +0x168: 0xec7182 FDE=(15495554, 15495575)
- +0x170: 0x9d81d0 FDE=(10322384, 10322387)

### AP 0x1878f28 codeSlots=46
- +0x0: 0x14c913c FDE=(21795132, 21795175)
- +0x8: 0x14c9168 FDE=(21795176, 21795195)
- +0x10: 0x14c917c FDE=(21795196, 21795214)
- +0x18: 0x0 FDE=None
- +0x20: 0x0 FDE=None
- +0x28: 0x14c970e FDE=(21796622, 21796765)
- +0x30: 0x14c979e FDE=(21796766, 21796784)
- +0x38: 0xaf6576 FDE=(11494774, 11494779)
- +0x40: 0xec70f2 FDE=(15495410, 15495444)
- +0x48: 0x9d81d0 FDE=(10322384, 10322387)
- +0x50: 0x9d7de0 FDE=(10321376, 10321377)
- +0x58: 0x9d7de0 FDE=(10321376, 10321377)
- +0x60: 0x14c97b0 FDE=(21796784, 21797189)
- +0x68: 0x9d7de0 FDE=(10321376, 10321377)
- +0x70: 0x14c9946 FDE=(21797190, 21797202)
- +0x78: 0x14c9952 FDE=(21797202, 21797503)
- +0x80: 0x155e8c6 FDE=(22407366, 22407375)
- +0x88: 0x155e8d0 FDE=(22407376, 22407385)
- +0x90: 0x14c9a80 FDE=(21797504, 21797782)
- +0x98: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa0: 0xd8d19e FDE=(14209438, 14209456)
- +0xa8: 0xec7170 FDE=(15495536, 15495553)
- +0xb0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xb8: 0x14c9b96 FDE=(21797782, 21798175)
- +0xc0: 0x14c9d20 FDE=(21798176, 21798184)
- +0xc8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd0: 0x14c9d28 FDE=(21798184, 21798373)
- +0xd8: 0x14c9de6 FDE=(21798374, 21798630)
- +0xe0: 0xf23934 FDE=(15874356, 15874368)
- +0xe8: 0x14c9ee6 FDE=(21798630, 21798979)
- +0xf0: 0x146af6e FDE=(21409646, 21409658)
- +0xf8: 0x14ca044 FDE=(21798980, 21800002)
- +0x100: 0x14ca442 FDE=(21800002, 21800274)
- +0x108: 0x14ca552 FDE=(21800274, 21800553)
- +0x110: 0x9d7de0 FDE=(10321376, 10321377)
- +0x118: 0x9d7de0 FDE=(10321376, 10321377)
- +0x120: 0x9d7de0 FDE=(10321376, 10321377)
- +0x128: 0x9d7de0 FDE=(10321376, 10321377)
- +0x130: 0x9d7de0 FDE=(10321376, 10321377)
- +0x138: 0x9d7de0 FDE=(10321376, 10321377)
- +0x140: 0x9d7de0 FDE=(10321376, 10321377)
- +0x148: 0x9d7de0 FDE=(10321376, 10321377)
- +0x150: 0x9d7de0 FDE=(10321376, 10321377)
- +0x158: 0x9d81d0 FDE=(10322384, 10322387)
- +0x160: 0xec7182 FDE=(15495554, 15495575)
- +0x168: 0x9d81d0 FDE=(10322384, 10322387)
- +0x170: 0xec7198 FDE=(15495576, 15495588)
#### +0x28 body
     14c970e:	53                   	push   rbx
     14c970f:	48 89 fb             	mov    rbx,rdi
     14c9712:	48 8d 05 37 f8 3a 00 	lea    rax,[rip+0x3af837]        # 1878f50 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35638>
     14c9719:	48 89 07             	mov    QWORD PTR [rdi],rax
     14c971c:	48 81 c7 b0 02 00 00 	add    rdi,0x2b0
     14c9723:	e8 42 08 5b ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14c9728:	48 8d bb 98 02 00 00 	lea    rdi,[rbx+0x298]
     14c972f:	e8 12 80 2f 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
     14c9734:	48 8d bb 80 02 00 00 	lea    rdi,[rbx+0x280]
     14c973b:	e8 06 80 2f 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
     14c9740:	48 8b bb 70 02 00 00 	mov    rdi,QWORD PTR [rbx+0x270]
     14c9747:	e8 3a 4d 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14c974c:	48 8b bb 28 02 00 00 	mov    rdi,QWORD PTR [rbx+0x228]
     14c9753:	e8 2e 4d 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14c9758:	48 8d bb 10 02 00 00 	lea    rdi,[rbx+0x210]
     14c975f:	e8 70 04 31 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     14c9764:	48 8d bb 00 02 00 00 	lea    rdi,[rbx+0x200]
     14c976b:	e8 64 04 31 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     14c9770:	48 8d bb f0 01 00 00 	lea    rdi,[rbx+0x1f0]
     14c9777:	e8 58 04 31 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     14c977c:	48 8b bb e8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1e8]
     14c9783:	e8 fe 4c 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14c9788:	48 8b bb d8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1d8]
     14c978f:	e8 f2 4c 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14c9794:	48 89 df             	mov    rdi,rbx
     14c9797:	5b                   	pop    rbx
     14c9798:	e9 cf d2 9f ff       	jmp    ec6a6c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8de82>

### AP 0x187a268 codeSlots=38
- +0x0: 0xa50370 FDE=(10814320, 10814325)
- +0x8: 0x14edbc8 FDE=(21945288, 21945361)
- +0x10: 0x0 FDE=None
- +0x18: 0x0 FDE=None
- +0x20: 0x14edc7a FDE=(21945466, 21945514)
- +0x28: 0x14edcaa FDE=(21945514, 21945532)
- +0x30: 0x14edcbc FDE=(21945532, 21946102)
- +0x38: 0x14edef6 FDE=(21946102, 21946632)
- +0x40: 0xcacb00 FDE=(13290240, 13290345)
- +0x48: 0xb8acd8 FDE=(12102872, 12102977)
- +0x50: 0x14ee108 FDE=(21946632, 21946759)
- +0x58: 0x0 FDE=None
- +0x60: 0x0 FDE=None
- +0x68: 0x14ee2a8 FDE=(21947048, 21947108)
- +0x70: 0x14ee2e4 FDE=(21947108, 21947126)
- +0x78: 0x14ee2f6 FDE=(21947126, 21947620)
- +0x80: 0x14ee4e4 FDE=(21947620, 21948419)
- +0x88: 0x14ee804 FDE=(21948420, 21948778)
- +0x90: 0x14ee96a FDE=(21948778, 21948987)
- +0x98: 0x14eea3c FDE=(21948988, 21949196)
- +0xa0: 0x14eeb0c FDE=(21949196, 21949390)
- +0xa8: 0x14eebce FDE=(21949390, 21949636)
- +0xb0: 0x14eecc4 FDE=(21949636, 21949925)
- +0xb8: 0x14eede6 FDE=(21949926, 21949931)
- +0xc0: 0x0 FDE=None
- +0xc8: 0x0 FDE=None
- +0xd0: 0x14ef0d4 FDE=(21950676, 21950787)
- +0xd8: 0x14ef144 FDE=(21950788, 21950806)
- +0xe0: 0x14ef156 FDE=(21950806, 21951487)
- +0xe8: 0x14ef400 FDE=(21951488, 21952195)
- +0xf0: 0x14ef6c4 FDE=(21952196, 21952522)
- +0xf8: 0xbddc16 FDE=(12442646, 12442677)
- +0x100: 0x14ef80a FDE=(21952522, 21952597)
- +0x108: 0x14ef856 FDE=(21952598, 21952610)
- +0x110: 0x14ef862 FDE=(21952610, 21952625)
- +0x118: 0x14ef872 FDE=(21952626, 21952882)
- +0x120: 0x0 FDE=None
- +0x128: 0x0 FDE=None
- +0x130: 0x9d7de0 FDE=(10321376, 10321377)
- +0x138: 0xa50370 FDE=(10814320, 10814325)
- +0x140: 0x14cd642 FDE=(21812802, 21812884)
- +0x148: 0x9d81d0 FDE=(10322384, 10322387)
- +0x150: 0x0 FDE=None
- +0x158: 0x0 FDE=None
- +0x160: 0x14efcbe FDE=(21953726, 21953925)
- +0x168: 0x14efd86 FDE=(21953926, 21953944)
- +0x170: 0x14efd98 FDE=(21953944, 21954623)
#### +0x28 body
     14edcaa:	53                   	push   rbx
     14edcab:	48 89 fb             	mov    rbx,rdi
     14edcae:	e8 c7 ff ff ff       	call   14edc7a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3331fe>
     14edcb3:	48 89 df             	mov    rdi,rbx
     14edcb6:	5b                   	pop    rbx
     14edcb7:	e9 64 02 30 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x187a270 codeSlots=38
- +0x0: 0x14edbc8 FDE=(21945288, 21945361)
- +0x8: 0x0 FDE=None
- +0x10: 0x0 FDE=None
- +0x18: 0x14edc7a FDE=(21945466, 21945514)
- +0x20: 0x14edcaa FDE=(21945514, 21945532)
- +0x28: 0x14edcbc FDE=(21945532, 21946102)
- +0x30: 0x14edef6 FDE=(21946102, 21946632)
- +0x38: 0xcacb00 FDE=(13290240, 13290345)
- +0x40: 0xb8acd8 FDE=(12102872, 12102977)
- +0x48: 0x14ee108 FDE=(21946632, 21946759)
- +0x50: 0x0 FDE=None
- +0x58: 0x0 FDE=None
- +0x60: 0x14ee2a8 FDE=(21947048, 21947108)
- +0x68: 0x14ee2e4 FDE=(21947108, 21947126)
- +0x70: 0x14ee2f6 FDE=(21947126, 21947620)
- +0x78: 0x14ee4e4 FDE=(21947620, 21948419)
- +0x80: 0x14ee804 FDE=(21948420, 21948778)
- +0x88: 0x14ee96a FDE=(21948778, 21948987)
- +0x90: 0x14eea3c FDE=(21948988, 21949196)
- +0x98: 0x14eeb0c FDE=(21949196, 21949390)
- +0xa0: 0x14eebce FDE=(21949390, 21949636)
- +0xa8: 0x14eecc4 FDE=(21949636, 21949925)
- +0xb0: 0x14eede6 FDE=(21949926, 21949931)
- +0xb8: 0x0 FDE=None
- +0xc0: 0x0 FDE=None
- +0xc8: 0x14ef0d4 FDE=(21950676, 21950787)
- +0xd0: 0x14ef144 FDE=(21950788, 21950806)
- +0xd8: 0x14ef156 FDE=(21950806, 21951487)
- +0xe0: 0x14ef400 FDE=(21951488, 21952195)
- +0xe8: 0x14ef6c4 FDE=(21952196, 21952522)
- +0xf0: 0xbddc16 FDE=(12442646, 12442677)
- +0xf8: 0x14ef80a FDE=(21952522, 21952597)
- +0x100: 0x14ef856 FDE=(21952598, 21952610)
- +0x108: 0x14ef862 FDE=(21952610, 21952625)
- +0x110: 0x14ef872 FDE=(21952626, 21952882)
- +0x118: 0x0 FDE=None
- +0x120: 0x0 FDE=None
- +0x128: 0x9d7de0 FDE=(10321376, 10321377)
- +0x130: 0xa50370 FDE=(10814320, 10814325)
- +0x138: 0x14cd642 FDE=(21812802, 21812884)
- +0x140: 0x9d81d0 FDE=(10322384, 10322387)
- +0x148: 0x0 FDE=None
- +0x150: 0x0 FDE=None
- +0x158: 0x14efcbe FDE=(21953726, 21953925)
- +0x160: 0x14efd86 FDE=(21953926, 21953944)
- +0x168: 0x14efd98 FDE=(21953944, 21954623)
- +0x170: 0x14f0040 FDE=(21954624, 21954824)
#### +0x28 body
     14edcbc:	55                   	push   rbp
     14edcbd:	41 57                	push   r15
     14edcbf:	41 56                	push   r14
     14edcc1:	53                   	push   rbx
     14edcc2:	48 81 ec 28 01 00 00 	sub    rsp,0x128
     14edcc9:	49 89 f6             	mov    r14,rsi
     14edccc:	48 89 fb             	mov    rbx,rdi
     14edccf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14edcd6:	00 00 
     14edcd8:	48 89 84 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rax
     14edcdf:	00 
     14edce0:	8a 46 50             	mov    al,BYTE PTR [rsi+0x50]
     14edce3:	38 87 18 01 00 00    	cmp    BYTE PTR [rdi+0x118],al
     14edce9:	74 1c                	je     14edd07 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33328b>
     14edceb:	48 8d bb c0 00 00 00 	lea    rdi,[rbx+0xc0]
     14edcf2:	0f b6 e8             	movzx  ebp,al
     14edcf5:	89 ee                	mov    esi,ebp
     14edcf7:	e8 bc f7 5c ff       	call   abd4b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa458>
     14edcfc:	40 88 ab 18 01 00 00 	mov    BYTE PTR [rbx+0x118],bpl
     14edd03:	41 8a 46 50          	mov    al,BYTE PTR [r14+0x50]
     14edd07:	84 c0                	test   al,al
     14edd09:	0f 84 45 01 00 00    	je     14ede54 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3333d8>
     14edd0f:	49 83 7e 58 00       	cmp    QWORD PTR [r14+0x58],0x0
     14edd14:	74 37                	je     14edd4d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3332d1>
     14edd16:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14edd1d:	00 00 
     14edd1f:	48 3b 84 24 20 01 00 	cmp    rax,QWORD PTR [rsp+0x120]
     14edd26:	00 
     14edd27:	0f 85 c4 01 00 00    	jne    14edef1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333475>
     14edd2d:	49 83 c6 58          	add    r14,0x58
     14edd31:	48 83 c3 10          	add    rbx,0x10
     14edd35:	48 89 df             	mov    rdi,rbx
     14edd38:	4c 89 f6             	mov    rsi,r14
     14edd3b:	48 81 c4 28 01 00 00 	add    rsp,0x128
     14edd42:	5b                   	pop    rbx
     14edd43:	41 5e                	pop    r14
     14edd45:	41 5f                	pop    r15
     14edd47:	5d                   	pop    rbp
     14edd48:	e9 3b 04 00 00       	jmp    14ee188 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33370c>
     14edd4d:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     14edd52:	e8 19 29 f6 ff       	call   1450670 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x295bf4>
     14edd57:	48 8d 35 49 a1 e7 fe 	lea    rsi,[rip+0xfffffffffee7a149]        # 367ea7 <_ZTSSt12bad_any_cast@@Base-0x28321>
     14edd5e:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     14edd65:	00 
     14edd66:	e8 13 bd 58 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14edd6b:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     14edd70:	48 8d b4 24 f0 00 00 	lea    rsi,[rsp+0xf0]
     14edd77:	00 
     14edd78:	e8 29 d8 ff ff       	call   14eb5a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x330b2a>
     14edd7d:	49 8d 76 18          	lea    rsi,[r14+0x18]
     14edd81:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     14edd86:	e8 93 d8 ff ff       	call   14eb61e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x330ba2>
     14edd8b:	49 83 c6 30          	add    r14,0x30
     14edd8f:	48 8d 15 e6 41 f6 fe 	lea    rdx,[rip+0xfffffffffef641e6]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     14edd96:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     14edd9b:	4c 89 f6             	mov    rsi,r14
     14edd9e:	e8 69 77 5e ff       	call   ad550c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x224ac>
     14edda3:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     14edda8:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     14eddad:	e8 1c d8 ff ff       	call   14eb5ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x330b52>
     14eddb2:	48 8d 35 6f 1f 50 00 	lea    rsi,[rip+0x501f6f]        # 19efd28 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x1458>
     14eddb9:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     14eddbe:	e8 73 d6 ff ff       	call   14eb436 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3309ba>
     14eddc3:	48 8d 35 f1 7c e3 fe 	lea    rsi,[rip+0xfffffffffee37cf1]        # 325abb <_ZTSSt12bad_any_cast@@Base-0x6a70d>
     14eddca:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     14eddcf:	e8 aa bc 58 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14eddd4:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     14eddd9:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     14eddde:	e8 7b d6 ff ff       	call   14eb45e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3309e2>
     14edde3:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     14edde8:	e8 a3 00 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14edded:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     14eddf2:	4c 89 f7             	mov    rdi,r14
     14eddf5:	e8 96 00 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14eddfa:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]
     14ede01:	00 
     14ede02:	4c 89 ff             	mov    rdi,r15
     14ede05:	e8 86 00 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14ede0a:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
     14ede0f:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14ede13:	31 c0                	xor    eax,eax
     14ede15:	41 88 06             	mov    BYTE PTR [r14],al
     14ede18:	41 88 46 18          	mov    BYTE PTR [r14+0x18],al
     14ede1c:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
     14ede21:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
     14ede26:	48 8d 8c 24 f0 00 00 	lea    rcx,[rsp+0xf0]
     14ede2d:	00 
     14ede2e:	e8 ef 6f 13 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
     14ede33:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     14ede3a:	00 
     14ede3b:	e8 2a c1 58 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14ede40:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     14ede45:	e8 e6 8e 5b ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     14ede4a:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     14ede4f:	e8 30 28 f6 ff       	call   1450684 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x295c08>
     14ede54:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14ede5b:	00 00 
     14ede5d:	48 3b 84 24 20 01 00 	cmp    rax,QWORD PTR [rsp+0x120]
     14ede64:	00 
     14ede65:	0f 85 86 00 00 00    	jne    14edef1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333475>
     14ede6b:	48 81 c4 28 01 00 00 	add    rsp,0x128
     14ede72:	5b                   	pop    rbx
     14ede73:	41 5e                	pop    r14
     14ede75:	41 5f                	pop    r15
     14ede77:	5d                   	pop    rbp
     14ede78:	c3                   	ret
     14ede79:	48 89 c3             	mov    rbx,rax
     14ede7c:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     14ede83:	00 
     14ede84:	e8 e1 c0 58 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14ede89:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     14ede8e:	e8 9d 8e 5b ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     14ede93:	eb 37                	jmp    14edecc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333450>
     14ede95:	48 89 c3             	mov    rbx,rax
     14ede98:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     14ede9d:	e8 ee ff 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14edea2:	eb 0c                	jmp    14edeb0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333434>
     14edea4:	eb 07                	jmp    14edead <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333431>
     14edea6:	eb 14                	jmp    14edebc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333440>
     14edea8:	48 89 c3             	mov    rbx,rax
     14edeab:	eb 1f                	jmp    14edecc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333450>
     14edead:	48 89 c3             	mov    rbx,rax
     14edeb0:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     14edeb5:	e8 d6 ff 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14edeba:	eb 03                	jmp    14edebf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333443>
     14edebc:	48 89 c3             	mov    rbx,rax
     14edebf:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     14edec6:	00 
     14edec7:	e8 c4 ff 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14edecc:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     14eded1:	e8 ae 27 f6 ff       	call   1450684 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x295c08>
     14eded6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14ededd:	00 00 
     14ededf:	48 3b 84 24 20 01 00 	cmp    rax,QWORD PTR [rsp+0x120]
     14edee6:	00 
     14edee7:	75 08                	jne    14edef1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333475>
     14edee9:	48 89 df             	mov    rdi,rbx
     14edeec:	e8 df 1d 58 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     14edef1:	e8 ba 1b 30 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x187a278 codeSlots=38
- +0x0: 0x0 FDE=None
- +0x8: 0x0 FDE=None
- +0x10: 0x14edc7a FDE=(21945466, 21945514)
- +0x18: 0x14edcaa FDE=(21945514, 21945532)
- +0x20: 0x14edcbc FDE=(21945532, 21946102)
- +0x28: 0x14edef6 FDE=(21946102, 21946632)
- +0x30: 0xcacb00 FDE=(13290240, 13290345)
- +0x38: 0xb8acd8 FDE=(12102872, 12102977)
- +0x40: 0x14ee108 FDE=(21946632, 21946759)
- +0x48: 0x0 FDE=None
- +0x50: 0x0 FDE=None
- +0x58: 0x14ee2a8 FDE=(21947048, 21947108)
- +0x60: 0x14ee2e4 FDE=(21947108, 21947126)
- +0x68: 0x14ee2f6 FDE=(21947126, 21947620)
- +0x70: 0x14ee4e4 FDE=(21947620, 21948419)
- +0x78: 0x14ee804 FDE=(21948420, 21948778)
- +0x80: 0x14ee96a FDE=(21948778, 21948987)
- +0x88: 0x14eea3c FDE=(21948988, 21949196)
- +0x90: 0x14eeb0c FDE=(21949196, 21949390)
- +0x98: 0x14eebce FDE=(21949390, 21949636)
- +0xa0: 0x14eecc4 FDE=(21949636, 21949925)
- +0xa8: 0x14eede6 FDE=(21949926, 21949931)
- +0xb0: 0x0 FDE=None
- +0xb8: 0x0 FDE=None
- +0xc0: 0x14ef0d4 FDE=(21950676, 21950787)
- +0xc8: 0x14ef144 FDE=(21950788, 21950806)
- +0xd0: 0x14ef156 FDE=(21950806, 21951487)
- +0xd8: 0x14ef400 FDE=(21951488, 21952195)
- +0xe0: 0x14ef6c4 FDE=(21952196, 21952522)
- +0xe8: 0xbddc16 FDE=(12442646, 12442677)
- +0xf0: 0x14ef80a FDE=(21952522, 21952597)
- +0xf8: 0x14ef856 FDE=(21952598, 21952610)
- +0x100: 0x14ef862 FDE=(21952610, 21952625)
- +0x108: 0x14ef872 FDE=(21952626, 21952882)
- +0x110: 0x0 FDE=None
- +0x118: 0x0 FDE=None
- +0x120: 0x9d7de0 FDE=(10321376, 10321377)
- +0x128: 0xa50370 FDE=(10814320, 10814325)
- +0x130: 0x14cd642 FDE=(21812802, 21812884)
- +0x138: 0x9d81d0 FDE=(10322384, 10322387)
- +0x140: 0x0 FDE=None
- +0x148: 0x0 FDE=None
- +0x150: 0x14efcbe FDE=(21953726, 21953925)
- +0x158: 0x14efd86 FDE=(21953926, 21953944)
- +0x160: 0x14efd98 FDE=(21953944, 21954623)
- +0x168: 0x14f0040 FDE=(21954624, 21954824)
- +0x170: 0xbd7a10 FDE=(12417552, 12417566)
#### +0x28 body
     14edef6:	41 57                	push   r15
     14edef8:	41 56                	push   r14
     14edefa:	53                   	push   rbx
     14edefb:	48 81 ec 30 01 00 00 	sub    rsp,0x130
     14edf02:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14edf09:	00 00 
     14edf0b:	48 89 84 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rax
     14edf12:	00 
     14edf13:	80 7e 50 00          	cmp    BYTE PTR [rsi+0x50],0x0
     14edf17:	0f 84 4a 01 00 00    	je     14ee067 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3335eb>
     14edf1d:	49 89 f6             	mov    r14,rsi
     14edf20:	48 89 fb             	mov    rbx,rdi
     14edf23:	48 83 7e 58 00       	cmp    QWORD PTR [rsi+0x58],0x0
     14edf28:	74 36                	je     14edf60 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3334e4>
     14edf2a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14edf31:	00 00 
     14edf33:	48 3b 84 24 28 01 00 	cmp    rax,QWORD PTR [rsp+0x128]
     14edf3a:	00 
     14edf3b:	0f 85 c2 01 00 00    	jne    14ee103 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333687>
     14edf41:	49 83 c6 58          	add    r14,0x58
     14edf45:	48 83 c3 68          	add    rbx,0x68
     14edf49:	48 89 df             	mov    rdi,rbx
     14edf4c:	4c 89 f6             	mov    rsi,r14
     14edf4f:	48 81 c4 30 01 00 00 	add    rsp,0x130
     14edf56:	5b                   	pop    rbx
     14edf57:	41 5e                	pop    r14
     14edf59:	41 5f                	pop    r15
     14edf5b:	e9 28 02 00 00       	jmp    14ee188 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33370c>
     14edf60:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     14edf65:	e8 06 27 f6 ff       	call   1450670 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x295bf4>
     14edf6a:	48 8d 35 36 9f e7 fe 	lea    rsi,[rip+0xfffffffffee79f36]        # 367ea7 <_ZTSSt12bad_any_cast@@Base-0x28321>
     14edf71:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     14edf78:	00 
     14edf79:	e8 00 bb 58 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14edf7e:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     14edf83:	48 8d b4 24 f0 00 00 	lea    rsi,[rsp+0xf0]
     14edf8a:	00 
     14edf8b:	e8 16 d6 ff ff       	call   14eb5a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x330b2a>
     14edf90:	49 8d 76 18          	lea    rsi,[r14+0x18]
     14edf94:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     14edf99:	e8 80 d6 ff ff       	call   14eb61e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x330ba2>
     14edf9e:	49 83 c6 30          	add    r14,0x30
     14edfa2:	48 8d 15 d3 3f f6 fe 	lea    rdx,[rip+0xfffffffffef63fd3]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     14edfa9:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     14edfae:	4c 89 f6             	mov    rsi,r14
     14edfb1:	e8 56 75 5e ff       	call   ad550c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x224ac>
     14edfb6:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     14edfbb:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     14edfc0:	e8 09 d6 ff ff       	call   14eb5ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x330b52>
     14edfc5:	48 8d 35 5c 1d 50 00 	lea    rsi,[rip+0x501d5c]        # 19efd28 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x1458>
     14edfcc:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     14edfd1:	e8 60 d4 ff ff       	call   14eb436 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3309ba>
     14edfd6:	48 8d 35 9f d4 e7 fe 	lea    rsi,[rip+0xfffffffffee7d49f]        # 36b47c <_ZTSSt12bad_any_cast@@Base-0x24d4c>
     14edfdd:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     14edfe2:	e8 97 ba 58 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14edfe7:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     14edfec:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     14edff1:	e8 68 d4 ff ff       	call   14eb45e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3309e2>
     14edff6:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     14edffb:	e8 90 fe 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14ee000:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     14ee005:	4c 89 f7             	mov    rdi,r14
     14ee008:	e8 83 fe 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14ee00d:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]
     14ee014:	00 
     14ee015:	4c 89 ff             	mov    rdi,r15
     14ee018:	e8 73 fe 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14ee01d:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
     14ee022:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14ee026:	31 c0                	xor    eax,eax
     14ee028:	41 88 06             	mov    BYTE PTR [r14],al
     14ee02b:	41 88 46 18          	mov    BYTE PTR [r14+0x18],al
     14ee02f:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
     14ee034:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
     14ee039:	48 8d 8c 24 f0 00 00 	lea    rcx,[rsp+0xf0]
     14ee040:	00 
     14ee041:	e8 dc 6d 13 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
     14ee046:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     14ee04d:	00 
     14ee04e:	e8 17 bf 58 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14ee053:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     14ee058:	e8 d3 8c 5b ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     14ee05d:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     14ee062:	e8 1d 26 f6 ff       	call   1450684 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x295c08>
     14ee067:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14ee06e:	00 00 
     14ee070:	48 3b 84 24 28 01 00 	cmp    rax,QWORD PTR [rsp+0x128]
     14ee077:	00 
     14ee078:	0f 85 85 00 00 00    	jne    14ee103 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333687>
     14ee07e:	48 81 c4 30 01 00 00 	add    rsp,0x130
     14ee085:	5b                   	pop    rbx
     14ee086:	41 5e                	pop    r14
     14ee088:	41 5f                	pop    r15
     14ee08a:	c3                   	ret
     14ee08b:	48 89 c3             	mov    rbx,rax
     14ee08e:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     14ee095:	00 
     14ee096:	e8 cf be 58 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14ee09b:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     14ee0a0:	e8 8b 8c 5b ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     14ee0a5:	eb 37                	jmp    14ee0de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333662>
     14ee0a7:	48 89 c3             	mov    rbx,rax
     14ee0aa:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     14ee0af:	e8 dc fd 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14ee0b4:	eb 0c                	jmp    14ee0c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333646>
     14ee0b6:	eb 07                	jmp    14ee0bf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333643>
     14ee0b8:	eb 14                	jmp    14ee0ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333652>
     14ee0ba:	48 89 c3             	mov    rbx,rax
     14ee0bd:	eb 1f                	jmp    14ee0de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333662>
     14ee0bf:	48 89 c3             	mov    rbx,rax
     14ee0c2:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     14ee0c7:	e8 c4 fd 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14ee0cc:	eb 03                	jmp    14ee0d1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333655>
     14ee0ce:	48 89 c3             	mov    rbx,rax
     14ee0d1:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     14ee0d8:	00 
     14ee0d9:	e8 b2 fd 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14ee0de:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     14ee0e3:	e8 9c 25 f6 ff       	call   1450684 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x295c08>
     14ee0e8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14ee0ef:	00 00 
     14ee0f1:	48 3b 84 24 28 01 00 	cmp    rax,QWORD PTR [rsp+0x128]
     14ee0f8:	00 
     14ee0f9:	75 08                	jne    14ee103 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333687>
     14ee0fb:	48 89 df             	mov    rdi,rbx
     14ee0fe:	e8 cd 1b 58 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     14ee103:	e8 a8 19 30 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x187a280 codeSlots=39
- +0x0: 0x0 FDE=None
- +0x8: 0x14edc7a FDE=(21945466, 21945514)
- +0x10: 0x14edcaa FDE=(21945514, 21945532)
- +0x18: 0x14edcbc FDE=(21945532, 21946102)
- +0x20: 0x14edef6 FDE=(21946102, 21946632)
- +0x28: 0xcacb00 FDE=(13290240, 13290345)
- +0x30: 0xb8acd8 FDE=(12102872, 12102977)
- +0x38: 0x14ee108 FDE=(21946632, 21946759)
- +0x40: 0x0 FDE=None
- +0x48: 0x0 FDE=None
- +0x50: 0x14ee2a8 FDE=(21947048, 21947108)
- +0x58: 0x14ee2e4 FDE=(21947108, 21947126)
- +0x60: 0x14ee2f6 FDE=(21947126, 21947620)
- +0x68: 0x14ee4e4 FDE=(21947620, 21948419)
- +0x70: 0x14ee804 FDE=(21948420, 21948778)
- +0x78: 0x14ee96a FDE=(21948778, 21948987)
- +0x80: 0x14eea3c FDE=(21948988, 21949196)
- +0x88: 0x14eeb0c FDE=(21949196, 21949390)
- +0x90: 0x14eebce FDE=(21949390, 21949636)
- +0x98: 0x14eecc4 FDE=(21949636, 21949925)
- +0xa0: 0x14eede6 FDE=(21949926, 21949931)
- +0xa8: 0x0 FDE=None
- +0xb0: 0x0 FDE=None
- +0xb8: 0x14ef0d4 FDE=(21950676, 21950787)
- +0xc0: 0x14ef144 FDE=(21950788, 21950806)
- +0xc8: 0x14ef156 FDE=(21950806, 21951487)
- +0xd0: 0x14ef400 FDE=(21951488, 21952195)
- +0xd8: 0x14ef6c4 FDE=(21952196, 21952522)
- +0xe0: 0xbddc16 FDE=(12442646, 12442677)
- +0xe8: 0x14ef80a FDE=(21952522, 21952597)
- +0xf0: 0x14ef856 FDE=(21952598, 21952610)
- +0xf8: 0x14ef862 FDE=(21952610, 21952625)
- +0x100: 0x14ef872 FDE=(21952626, 21952882)
- +0x108: 0x0 FDE=None
- +0x110: 0x0 FDE=None
- +0x118: 0x9d7de0 FDE=(10321376, 10321377)
- +0x120: 0xa50370 FDE=(10814320, 10814325)
- +0x128: 0x14cd642 FDE=(21812802, 21812884)
- +0x130: 0x9d81d0 FDE=(10322384, 10322387)
- +0x138: 0x0 FDE=None
- +0x140: 0x0 FDE=None
- +0x148: 0x14efcbe FDE=(21953726, 21953925)
- +0x150: 0x14efd86 FDE=(21953926, 21953944)
- +0x158: 0x14efd98 FDE=(21953944, 21954623)
- +0x160: 0x14f0040 FDE=(21954624, 21954824)
- +0x168: 0xbd7a10 FDE=(12417552, 12417566)
- +0x170: 0xbd7a10 FDE=(12417552, 12417566)
#### +0x28 body
      cacb00:	41 57                	push   r15
      cacb02:	41 56                	push   r14
      cacb04:	53                   	push   rbx
      cacb05:	48 83 ec 50          	sub    rsp,0x50
      cacb09:	49 89 f6             	mov    r14,rsi
      cacb0c:	48 89 fb             	mov    rbx,rdi
      cacb0f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cacb16:	00 00 
      cacb18:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      cacb1d:	49 83 c6 10          	add    r14,0x10
      cacb21:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
      cacb26:	4c 89 ff             	mov    rdi,r15
      cacb29:	48 89 d6             	mov    rsi,rdx
      cacb2c:	e8 09 dc b2 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
      cacb31:	48 89 df             	mov    rdi,rbx
      cacb34:	4c 89 f6             	mov    rsi,r14
      cacb37:	4c 89 fa             	mov    rdx,r15
      cacb3a:	e8 8b d4 b2 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
      cacb3f:	4c 89 ff             	mov    rdi,r15
      cacb42:	e8 a1 dc b2 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      cacb47:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cacb4e:	00 00 
      cacb50:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
      cacb55:	75 0d                	jne    cacb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f9b04>
      cacb57:	48 89 d8             	mov    rax,rbx
      cacb5a:	48 83 c4 50          	add    rsp,0x50
      cacb5e:	5b                   	pop    rbx
      cacb5f:	41 5e                	pop    r14
      cacb61:	41 5f                	pop    r15
      cacb63:	c3                   	ret
      cacb64:	e8 47 2f b4 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x187a288 codeSlots=40
- +0x0: 0x14edc7a FDE=(21945466, 21945514)
- +0x8: 0x14edcaa FDE=(21945514, 21945532)
- +0x10: 0x14edcbc FDE=(21945532, 21946102)
- +0x18: 0x14edef6 FDE=(21946102, 21946632)
- +0x20: 0xcacb00 FDE=(13290240, 13290345)
- +0x28: 0xb8acd8 FDE=(12102872, 12102977)
- +0x30: 0x14ee108 FDE=(21946632, 21946759)
- +0x38: 0x0 FDE=None
- +0x40: 0x0 FDE=None
- +0x48: 0x14ee2a8 FDE=(21947048, 21947108)
- +0x50: 0x14ee2e4 FDE=(21947108, 21947126)
- +0x58: 0x14ee2f6 FDE=(21947126, 21947620)
- +0x60: 0x14ee4e4 FDE=(21947620, 21948419)
- +0x68: 0x14ee804 FDE=(21948420, 21948778)
- +0x70: 0x14ee96a FDE=(21948778, 21948987)
- +0x78: 0x14eea3c FDE=(21948988, 21949196)
- +0x80: 0x14eeb0c FDE=(21949196, 21949390)
- +0x88: 0x14eebce FDE=(21949390, 21949636)
- +0x90: 0x14eecc4 FDE=(21949636, 21949925)
- +0x98: 0x14eede6 FDE=(21949926, 21949931)
- +0xa0: 0x0 FDE=None
- +0xa8: 0x0 FDE=None
- +0xb0: 0x14ef0d4 FDE=(21950676, 21950787)
- +0xb8: 0x14ef144 FDE=(21950788, 21950806)
- +0xc0: 0x14ef156 FDE=(21950806, 21951487)
- +0xc8: 0x14ef400 FDE=(21951488, 21952195)
- +0xd0: 0x14ef6c4 FDE=(21952196, 21952522)
- +0xd8: 0xbddc16 FDE=(12442646, 12442677)
- +0xe0: 0x14ef80a FDE=(21952522, 21952597)
- +0xe8: 0x14ef856 FDE=(21952598, 21952610)
- +0xf0: 0x14ef862 FDE=(21952610, 21952625)
- +0xf8: 0x14ef872 FDE=(21952626, 21952882)
- +0x100: 0x0 FDE=None
- +0x108: 0x0 FDE=None
- +0x110: 0x9d7de0 FDE=(10321376, 10321377)
- +0x118: 0xa50370 FDE=(10814320, 10814325)
- +0x120: 0x14cd642 FDE=(21812802, 21812884)
- +0x128: 0x9d81d0 FDE=(10322384, 10322387)
- +0x130: 0x0 FDE=None
- +0x138: 0x0 FDE=None
- +0x140: 0x14efcbe FDE=(21953726, 21953925)
- +0x148: 0x14efd86 FDE=(21953926, 21953944)
- +0x150: 0x14efd98 FDE=(21953944, 21954623)
- +0x158: 0x14f0040 FDE=(21954624, 21954824)
- +0x160: 0xbd7a10 FDE=(12417552, 12417566)
- +0x168: 0xbd7a10 FDE=(12417552, 12417566)
- +0x170: 0x9d7de0 FDE=(10321376, 10321377)
#### +0x28 body
      b8acd8:	41 57                	push   r15
      b8acda:	41 56                	push   r14
      b8acdc:	53                   	push   rbx
      b8acdd:	48 83 ec 50          	sub    rsp,0x50
      b8ace1:	49 89 f6             	mov    r14,rsi
      b8ace4:	48 89 fb             	mov    rbx,rdi
      b8ace7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b8acee:	00 00 
      b8acf0:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      b8acf5:	49 83 c6 68          	add    r14,0x68
      b8acf9:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
      b8acfe:	4c 89 ff             	mov    rdi,r15
      b8ad01:	48 89 d6             	mov    rsi,rdx
      b8ad04:	e8 31 fa c4 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
      b8ad09:	48 89 df             	mov    rdi,rbx
      b8ad0c:	4c 89 f6             	mov    rsi,r14
      b8ad0f:	4c 89 fa             	mov    rdx,r15
      b8ad12:	e8 b3 f2 c4 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
      b8ad17:	4c 89 ff             	mov    rdi,r15
      b8ad1a:	e8 c9 fa c4 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      b8ad1f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b8ad26:	00 00 
      b8ad28:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
      b8ad2d:	75 0d                	jne    b8ad3c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7cdc>
      b8ad2f:	48 89 d8             	mov    rax,rbx
      b8ad32:	48 83 c4 50          	add    rsp,0x50
      b8ad36:	5b                   	pop    rbx
      b8ad37:	41 5e                	pop    r14
      b8ad39:	41 5f                	pop    r15
      b8ad3b:	c3                   	ret
      b8ad3c:	e8 6f 4d c6 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x187a290 codeSlots=40
- +0x0: 0x14edcaa FDE=(21945514, 21945532)
- +0x8: 0x14edcbc FDE=(21945532, 21946102)
- +0x10: 0x14edef6 FDE=(21946102, 21946632)
- +0x18: 0xcacb00 FDE=(13290240, 13290345)
- +0x20: 0xb8acd8 FDE=(12102872, 12102977)
- +0x28: 0x14ee108 FDE=(21946632, 21946759)
- +0x30: 0x0 FDE=None
- +0x38: 0x0 FDE=None
- +0x40: 0x14ee2a8 FDE=(21947048, 21947108)
- +0x48: 0x14ee2e4 FDE=(21947108, 21947126)
- +0x50: 0x14ee2f6 FDE=(21947126, 21947620)
- +0x58: 0x14ee4e4 FDE=(21947620, 21948419)
- +0x60: 0x14ee804 FDE=(21948420, 21948778)
- +0x68: 0x14ee96a FDE=(21948778, 21948987)
- +0x70: 0x14eea3c FDE=(21948988, 21949196)
- +0x78: 0x14eeb0c FDE=(21949196, 21949390)
- +0x80: 0x14eebce FDE=(21949390, 21949636)
- +0x88: 0x14eecc4 FDE=(21949636, 21949925)
- +0x90: 0x14eede6 FDE=(21949926, 21949931)
- +0x98: 0x0 FDE=None
- +0xa0: 0x0 FDE=None
- +0xa8: 0x14ef0d4 FDE=(21950676, 21950787)
- +0xb0: 0x14ef144 FDE=(21950788, 21950806)
- +0xb8: 0x14ef156 FDE=(21950806, 21951487)
- +0xc0: 0x14ef400 FDE=(21951488, 21952195)
- +0xc8: 0x14ef6c4 FDE=(21952196, 21952522)
- +0xd0: 0xbddc16 FDE=(12442646, 12442677)
- +0xd8: 0x14ef80a FDE=(21952522, 21952597)
- +0xe0: 0x14ef856 FDE=(21952598, 21952610)
- +0xe8: 0x14ef862 FDE=(21952610, 21952625)
- +0xf0: 0x14ef872 FDE=(21952626, 21952882)
- +0xf8: 0x0 FDE=None
- +0x100: 0x0 FDE=None
- +0x108: 0x9d7de0 FDE=(10321376, 10321377)
- +0x110: 0xa50370 FDE=(10814320, 10814325)
- +0x118: 0x14cd642 FDE=(21812802, 21812884)
- +0x120: 0x9d81d0 FDE=(10322384, 10322387)
- +0x128: 0x0 FDE=None
- +0x130: 0x0 FDE=None
- +0x138: 0x14efcbe FDE=(21953726, 21953925)
- +0x140: 0x14efd86 FDE=(21953926, 21953944)
- +0x148: 0x14efd98 FDE=(21953944, 21954623)
- +0x150: 0x14f0040 FDE=(21954624, 21954824)
- +0x158: 0xbd7a10 FDE=(12417552, 12417566)
- +0x160: 0xbd7a10 FDE=(12417552, 12417566)
- +0x168: 0x9d7de0 FDE=(10321376, 10321377)
- +0x170: 0x14f0108 FDE=(21954824, 21954996)
#### +0x28 body
     14ee108:	41 57                	push   r15
     14ee10a:	41 56                	push   r14
     14ee10c:	41 54                	push   r12
     14ee10e:	53                   	push   rbx
     14ee10f:	48 83 ec 48          	sub    rsp,0x48
     14ee113:	49 89 d6             	mov    r14,rdx
     14ee116:	49 89 f7             	mov    r15,rsi
     14ee119:	48 89 fb             	mov    rbx,rdi
     14ee11c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14ee123:	00 00 
     14ee125:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     14ee12a:	0f b6 b6 18 01 00 00 	movzx  esi,BYTE PTR [rsi+0x118]
     14ee131:	48 8b 7a 30          	mov    rdi,QWORD PTR [rdx+0x30]
     14ee135:	ff 52 28             	call   QWORD PTR [rdx+0x28]
     14ee138:	49 81 c7 c0 00 00 00 	add    r15,0xc0
     14ee13f:	49 89 e4             	mov    r12,rsp
     14ee142:	4c 89 e7             	mov    rdi,r12
     14ee145:	4c 89 f6             	mov    rsi,r14
     14ee148:	e8 ed c5 2e 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
     14ee14d:	48 89 df             	mov    rdi,rbx
     14ee150:	4c 89 fe             	mov    rsi,r15
     14ee153:	4c 89 e2             	mov    rdx,r12
     14ee156:	e8 6f be 2e 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
     14ee15b:	4c 89 e7             	mov    rdi,r12
     14ee15e:	e8 85 c6 2e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14ee163:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14ee16a:	00 00 
     14ee16c:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
     14ee171:	75 0f                	jne    14ee182 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333706>
     14ee173:	48 89 d8             	mov    rax,rbx
     14ee176:	48 83 c4 48          	add    rsp,0x48
     14ee17a:	5b                   	pop    rbx
     14ee17b:	41 5c                	pop    r12
     14ee17d:	41 5e                	pop    r14
     14ee17f:	41 5f                	pop    r15
     14ee181:	c3                   	ret
     14ee182:	e8 29 19 30 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x187a298 codeSlots=39
- +0x0: 0x14edcbc FDE=(21945532, 21946102)
- +0x8: 0x14edef6 FDE=(21946102, 21946632)
- +0x10: 0xcacb00 FDE=(13290240, 13290345)
- +0x18: 0xb8acd8 FDE=(12102872, 12102977)
- +0x20: 0x14ee108 FDE=(21946632, 21946759)
- +0x28: 0x0 FDE=None
- +0x30: 0x0 FDE=None
- +0x38: 0x14ee2a8 FDE=(21947048, 21947108)
- +0x40: 0x14ee2e4 FDE=(21947108, 21947126)
- +0x48: 0x14ee2f6 FDE=(21947126, 21947620)
- +0x50: 0x14ee4e4 FDE=(21947620, 21948419)
- +0x58: 0x14ee804 FDE=(21948420, 21948778)
- +0x60: 0x14ee96a FDE=(21948778, 21948987)
- +0x68: 0x14eea3c FDE=(21948988, 21949196)
- +0x70: 0x14eeb0c FDE=(21949196, 21949390)
- +0x78: 0x14eebce FDE=(21949390, 21949636)
- +0x80: 0x14eecc4 FDE=(21949636, 21949925)
- +0x88: 0x14eede6 FDE=(21949926, 21949931)
- +0x90: 0x0 FDE=None
- +0x98: 0x0 FDE=None
- +0xa0: 0x14ef0d4 FDE=(21950676, 21950787)
- +0xa8: 0x14ef144 FDE=(21950788, 21950806)
- +0xb0: 0x14ef156 FDE=(21950806, 21951487)
- +0xb8: 0x14ef400 FDE=(21951488, 21952195)
- +0xc0: 0x14ef6c4 FDE=(21952196, 21952522)
- +0xc8: 0xbddc16 FDE=(12442646, 12442677)
- +0xd0: 0x14ef80a FDE=(21952522, 21952597)
- +0xd8: 0x14ef856 FDE=(21952598, 21952610)
- +0xe0: 0x14ef862 FDE=(21952610, 21952625)
- +0xe8: 0x14ef872 FDE=(21952626, 21952882)
- +0xf0: 0x0 FDE=None
- +0xf8: 0x0 FDE=None
- +0x100: 0x9d7de0 FDE=(10321376, 10321377)
- +0x108: 0xa50370 FDE=(10814320, 10814325)
- +0x110: 0x14cd642 FDE=(21812802, 21812884)
- +0x118: 0x9d81d0 FDE=(10322384, 10322387)
- +0x120: 0x0 FDE=None
- +0x128: 0x0 FDE=None
- +0x130: 0x14efcbe FDE=(21953726, 21953925)
- +0x138: 0x14efd86 FDE=(21953926, 21953944)
- +0x140: 0x14efd98 FDE=(21953944, 21954623)
- +0x148: 0x14f0040 FDE=(21954624, 21954824)
- +0x150: 0xbd7a10 FDE=(12417552, 12417566)
- +0x158: 0xbd7a10 FDE=(12417552, 12417566)
- +0x160: 0x9d7de0 FDE=(10321376, 10321377)
- +0x168: 0x14f0108 FDE=(21954824, 21954996)
- +0x170: 0x14f01b4 FDE=(21954996, 21955109)

### AP 0x187a2a0 codeSlots=38
- +0x0: 0x14edef6 FDE=(21946102, 21946632)
- +0x8: 0xcacb00 FDE=(13290240, 13290345)
- +0x10: 0xb8acd8 FDE=(12102872, 12102977)
- +0x18: 0x14ee108 FDE=(21946632, 21946759)
- +0x20: 0x0 FDE=None
- +0x28: 0x0 FDE=None
- +0x30: 0x14ee2a8 FDE=(21947048, 21947108)
- +0x38: 0x14ee2e4 FDE=(21947108, 21947126)
- +0x40: 0x14ee2f6 FDE=(21947126, 21947620)
- +0x48: 0x14ee4e4 FDE=(21947620, 21948419)
- +0x50: 0x14ee804 FDE=(21948420, 21948778)
- +0x58: 0x14ee96a FDE=(21948778, 21948987)
- +0x60: 0x14eea3c FDE=(21948988, 21949196)
- +0x68: 0x14eeb0c FDE=(21949196, 21949390)
- +0x70: 0x14eebce FDE=(21949390, 21949636)
- +0x78: 0x14eecc4 FDE=(21949636, 21949925)
- +0x80: 0x14eede6 FDE=(21949926, 21949931)
- +0x88: 0x0 FDE=None
- +0x90: 0x0 FDE=None
- +0x98: 0x14ef0d4 FDE=(21950676, 21950787)
- +0xa0: 0x14ef144 FDE=(21950788, 21950806)
- +0xa8: 0x14ef156 FDE=(21950806, 21951487)
- +0xb0: 0x14ef400 FDE=(21951488, 21952195)
- +0xb8: 0x14ef6c4 FDE=(21952196, 21952522)
- +0xc0: 0xbddc16 FDE=(12442646, 12442677)
- +0xc8: 0x14ef80a FDE=(21952522, 21952597)
- +0xd0: 0x14ef856 FDE=(21952598, 21952610)
- +0xd8: 0x14ef862 FDE=(21952610, 21952625)
- +0xe0: 0x14ef872 FDE=(21952626, 21952882)
- +0xe8: 0x0 FDE=None
- +0xf0: 0x0 FDE=None
- +0xf8: 0x9d7de0 FDE=(10321376, 10321377)
- +0x100: 0xa50370 FDE=(10814320, 10814325)
- +0x108: 0x14cd642 FDE=(21812802, 21812884)
- +0x110: 0x9d81d0 FDE=(10322384, 10322387)
- +0x118: 0x0 FDE=None
- +0x120: 0x0 FDE=None
- +0x128: 0x14efcbe FDE=(21953726, 21953925)
- +0x130: 0x14efd86 FDE=(21953926, 21953944)
- +0x138: 0x14efd98 FDE=(21953944, 21954623)
- +0x140: 0x14f0040 FDE=(21954624, 21954824)
- +0x148: 0xbd7a10 FDE=(12417552, 12417566)
- +0x150: 0xbd7a10 FDE=(12417552, 12417566)
- +0x158: 0x9d7de0 FDE=(10321376, 10321377)
- +0x160: 0x14f0108 FDE=(21954824, 21954996)
- +0x168: 0x14f01b4 FDE=(21954996, 21955109)
- +0x170: 0x0 FDE=None

### AP 0x187a2a8 codeSlots=38
- +0x0: 0xcacb00 FDE=(13290240, 13290345)
- +0x8: 0xb8acd8 FDE=(12102872, 12102977)
- +0x10: 0x14ee108 FDE=(21946632, 21946759)
- +0x18: 0x0 FDE=None
- +0x20: 0x0 FDE=None
- +0x28: 0x14ee2a8 FDE=(21947048, 21947108)
- +0x30: 0x14ee2e4 FDE=(21947108, 21947126)
- +0x38: 0x14ee2f6 FDE=(21947126, 21947620)
- +0x40: 0x14ee4e4 FDE=(21947620, 21948419)
- +0x48: 0x14ee804 FDE=(21948420, 21948778)
- +0x50: 0x14ee96a FDE=(21948778, 21948987)
- +0x58: 0x14eea3c FDE=(21948988, 21949196)
- +0x60: 0x14eeb0c FDE=(21949196, 21949390)
- +0x68: 0x14eebce FDE=(21949390, 21949636)
- +0x70: 0x14eecc4 FDE=(21949636, 21949925)
- +0x78: 0x14eede6 FDE=(21949926, 21949931)
- +0x80: 0x0 FDE=None
- +0x88: 0x0 FDE=None
- +0x90: 0x14ef0d4 FDE=(21950676, 21950787)
- +0x98: 0x14ef144 FDE=(21950788, 21950806)
- +0xa0: 0x14ef156 FDE=(21950806, 21951487)
- +0xa8: 0x14ef400 FDE=(21951488, 21952195)
- +0xb0: 0x14ef6c4 FDE=(21952196, 21952522)
- +0xb8: 0xbddc16 FDE=(12442646, 12442677)
- +0xc0: 0x14ef80a FDE=(21952522, 21952597)
- +0xc8: 0x14ef856 FDE=(21952598, 21952610)
- +0xd0: 0x14ef862 FDE=(21952610, 21952625)
- +0xd8: 0x14ef872 FDE=(21952626, 21952882)
- +0xe0: 0x0 FDE=None
- +0xe8: 0x0 FDE=None
- +0xf0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xf8: 0xa50370 FDE=(10814320, 10814325)
- +0x100: 0x14cd642 FDE=(21812802, 21812884)
- +0x108: 0x9d81d0 FDE=(10322384, 10322387)
- +0x110: 0x0 FDE=None
- +0x118: 0x0 FDE=None
- +0x120: 0x14efcbe FDE=(21953726, 21953925)
- +0x128: 0x14efd86 FDE=(21953926, 21953944)
- +0x130: 0x14efd98 FDE=(21953944, 21954623)
- +0x138: 0x14f0040 FDE=(21954624, 21954824)
- +0x140: 0xbd7a10 FDE=(12417552, 12417566)
- +0x148: 0xbd7a10 FDE=(12417552, 12417566)
- +0x150: 0x9d7de0 FDE=(10321376, 10321377)
- +0x158: 0x14f0108 FDE=(21954824, 21954996)
- +0x160: 0x14f01b4 FDE=(21954996, 21955109)
- +0x168: 0x0 FDE=None
- +0x170: 0x0 FDE=None
#### +0x28 body
     14ee2a8:	53                   	push   rbx
     14ee2a9:	48 89 fb             	mov    rbx,rdi
     14ee2ac:	48 8d 05 1d c0 38 00 	lea    rax,[rip+0x38c01d]        # 187a2d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x369b8>
     14ee2b3:	48 89 07             	mov    QWORD PTR [rdi],rax
     14ee2b6:	48 83 c7 48          	add    rdi,0x48
     14ee2ba:	e8 55 6c fe ff       	call   14d4f14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a498>
     14ee2bf:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
     14ee2c3:	e8 be 01 5b ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14ee2c8:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
     14ee2cc:	e8 b5 01 5b ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14ee2d1:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
     14ee2d5:	e8 ac 01 5b ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14ee2da:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     14ee2de:	5b                   	pop    rbx
     14ee2df:	e9 a2 01 5b ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>

## Factory return paths
### ret @0xb87a0d
      b879ae:	48 8d bc 24 50 04 00 	lea    rdi,[rsp+0x450]
      b879b5:	00 
      b879b6:	e8 af 25 ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      b879bb:	48 8b bc 24 88 01 00 	mov    rdi,QWORD PTR [rsp+0x188]
      b879c2:	00 
      b879c3:	e8 be 6a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b879c8:	48 8d bc 24 68 01 00 	lea    rdi,[rsp+0x168]
      b879cf:	00 
      b879d0:	e8 bb 64 c6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b879d5:	48 8b bc 24 98 01 00 	mov    rdi,QWORD PTR [rsp+0x198]
      b879dc:	00 
      b879dd:	e8 a4 6a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b879e2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b879e9:	00 00 
      b879eb:	48 3b 84 24 50 08 00 	cmp    rax,QWORD PTR [rsp+0x850]
      b879f2:	00 
      b879f3:	0f 85 44 05 00 00    	jne    b87f3d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4edd>
      b879f9:	4c 89 e8             	mov    rax,r13
      b879fc:	48 81 c4 58 08 00 00 	add    rsp,0x858
      b87a03:	5b                   	pop    rbx
      b87a04:	41 5c                	pop    r12
      b87a06:	41 5d                	pop    r13
      b87a08:	41 5e                	pop    r14
      b87a0a:	41 5f                	pop    r15
      b87a0c:	5d                   	pop    rbp
      b87a0d:	c3                   	ret

## All +0x1b5/+0x1b8 field accesses in factory-created candidate methods
### FDE 0xa4b8e0..0xa4b8e5
- 0xa4b8e0: lea    rax,[rdi+0x10]
### FDE 0xa7a004..0xa7a009
- 0xa7a004: mov    rax,QWORD PTR [rdi+0x10]
### FDE 0xaa8e00..0xaa8e9a
- 0xaa8e18: mov    rax,QWORD PTR [rdx+0x10]
- 0xaa8e1f: mov    QWORD PTR [r14+0x10],rax
- 0xaa8e30: and    QWORD PTR [rdx+0x10],0x0
- 0xaa8e6f: call   QWORD PTR [rax+0x10]
### FDE 0xaae9b2..0xaae9bb
- 0xaae9b2: mov    rdi,QWORD PTR [rdi+0x10]
### FDE 0xaae9bc..0xaae9d2
- 0xaae9c0: mov    rdi,QWORD PTR [rdi+0x10]
### FDE 0xb3b070..0xb3b346
- 0xb3b1e1: lea    r12,[rsp+0x10]
- 0xb3b1ec: and    QWORD PTR [r12+0x10],0x0
- 0xb3b22e: mov    QWORD PTR [rdi+0x10],rax
- 0xb3b24f: lea    r12,[rsp+0x10]
- 0xb3b25a: and    QWORD PTR [r12+0x10],0x0
- 0xb3b29c: mov    QWORD PTR [rdi+0x10],rax
### FDE 0xb3bf8a..0xb3c05d
- 0xb3bfff: call   QWORD PTR [rax+0x10]
### FDE 0xb3c05e..0xb3c12d
- 0xb3c0ab: lea    r12,[rsp+0x10]
- 0xb3c0ed: lea    rdi,[rsp+0x10]
### FDE 0xb3c12e..0xb3c261
- 0xb3c157: lea    rdi,[rsp+0x10]
- 0xb3c18d: lea    rsi,[rsp+0x10]
- 0xb3c1b1: lea    rdi,[rsp+0x10]
- 0xb3c1e6: lea    r14,[rsp+0x10]
- 0xb3c221: lea    rdi,[rsp+0x10]
### FDE 0xb3c8a2..0xb3cbf6
- 0xb3c9d5: and    DWORD PTR [r13+0x10],0x0
### FDE 0xb7d28a..0xb7d29d
- 0xb7d295: call   QWORD PTR [rax+0x10]
### FDE 0xb86086..0xb87f42
- 0xb8634f: call   QWORD PTR [rax+0x10]
- 0xb86568: movdqa XMMWORD PTR [rdi+0x10],xmm0
- 0xb86706: lea    rdi,[r14+0x10]
- 0xb86a3e: movdqu XMMWORD PTR [r15+0x10],xmm0
- 0xb86c9d: mov    QWORD PTR [rbx+0x10],rax
- 0xb86e04: movaps xmm0,XMMWORD PTR [rbx+0x10]
- 0xb86e0c: movdqa XMMWORD PTR [rbx+0x10],xmm1
- 0xb86e36: movaps xmm0,XMMWORD PTR [rbx+0x10]
- 0xb86e3e: movdqa XMMWORD PTR [rbx+0x10],xmm1
- 0xb86e96: mov    rsi,QWORD PTR [rbx+0x10]
- 0xb86e9a: and    QWORD PTR [rbx+0x10],0x0
- 0xb870b6: movaps xmm0,XMMWORD PTR [rbx+0x10]
- 0xb870be: movdqa XMMWORD PTR [rbx+0x10],xmm1
- 0xb87364: mov    QWORD PTR [rax+0x10],rcx
- 0xb873bf: mov    rsi,QWORD PTR [rdx+0x10]
- 0xb873e7: movdqu xmm1,XMMWORD PTR [rcx+0x10]
- 0xb8750b: mov    QWORD PTR [rax+0x10],rcx
- 0xb87561: mov    rsi,QWORD PTR [rdx+0x10]
- 0xb8758a: movdqu xmm1,XMMWORD PTR [rcx+0x10]
- 0xb876d4: movups XMMWORD PTR [r15+0x10],xmm0
- 0xb87705: movaps XMMWORD PTR [rax+0x10],xmm0
- 0xb877bb: movups XMMWORD PTR [r12+0x10],xmm0
- 0xb877d3: movdqa xmm0,XMMWORD PTR [r15+0x10]
- 0xb877f5: movdqa XMMWORD PTR [rax+0x10],xmm0
### FDE 0xb880b2..0xb880ce
- 0xb880c8: lock inc QWORD PTR [rcx+0x10]
### FDE 0xb884d4..0xb884e7
- 0xb884de: mov    rdi,QWORD PTR [rdi+0x10]
### FDE 0xb884fa..0xb88528
- 0xb88510: mov    rcx,QWORD PTR [rbx+0x10]
### FDE 0xb88528..0xb8854d
- 0xb8853a: mov    rax,QWORD PTR [rdi+0x10]
- 0xb8853e: mov    QWORD PTR [rsi+0x10],rax
### FDE 0xb88588..0xb88628
- 0xb8859d: lea    r14,[rdi+0x10]
- 0xb885ba: mov    QWORD PTR [rsp+0x10],0x1
- 0xb885cd: lea    rdi,[rbx+0x10]
### FDE 0xb88628..0xb88642
- 0xb88628: lea    rax,[rdi+0x10]
- 0xb88636: lea    rdi,[rsi+0x10]
### FDE 0xb88662..0xb88873
- 0xb8870d: lea    rsi,[rbp+0x10]
### FDE 0xb8889a..0xb8893a
- 0xb888af: lea    r14,[rdi+0x10]
- 0xb888cc: mov    QWORD PTR [rsp+0x10],0x1
- 0xb888df: lea    rdi,[rbx+0x10]
### FDE 0xb8893a..0xb88954
- 0xb8893a: lea    rax,[rdi+0x10]
- 0xb88948: lea    rdi,[rsi+0x10]
### FDE 0xb88a6a..0xb88b0a
- 0xb88a7f: lea    r14,[rdi+0x10]
- 0xb88a9c: mov    QWORD PTR [rsp+0x10],0x1
- 0xb88aaf: lea    rdi,[rbx+0x10]
### FDE 0xb88b0a..0xb88b24
- 0xb88b0a: lea    rax,[rdi+0x10]
- 0xb88b18: lea    rdi,[rsi+0x10]
### FDE 0xb88b24..0xb88ca4
- 0xb88b50: lea    rdi,[rsp+0x10]
- 0xb88b82: lea    rsi,[rsp+0x10]
- 0xb88ba0: lea    rbp,[r15+0x10]
- 0xb88c04: lea    rdi,[rsp+0x10]
- 0xb88c7a: lea    rdi,[rsp+0x10]
### FDE 0xb88cca..0xb88d6a
- 0xb88cdf: lea    r14,[rdi+0x10]
- 0xb88cfc: mov    QWORD PTR [rsp+0x10],0x1
- 0xb88d0f: lea    rdi,[rbx+0x10]
### FDE 0xb88d6a..0xb88d84
- 0xb88d6a: lea    rax,[rdi+0x10]
- 0xb88d78: lea    rdi,[rsi+0x10]
### FDE 0xb88f30..0xb891f8
- 0xb88f60: mov    QWORD PTR [rsp+0x10],rax
- 0xb89022: mov    rsi,QWORD PTR [rsp+0x10]
### FDE 0xb89380..0xb8952d
- 0xb89394: mov    QWORD PTR [rsp+0x10],rdi
- 0xb894a3: mov    rbx,QWORD PTR [rsp+0x10]
### FDE 0xb8a6cc..0xb8a8b4
- 0xb8a6f7: mov    rsi,QWORD PTR [rdi+0x10]
- 0xb8a73e: and    QWORD PTR [rdx+0x10],0x0
### FDE 0xb8b06c..0xb8b108
- 0xb8b0ae: mov    QWORD PTR [r14+0x10],r12
### FDE 0xb8b162..0xb8b1f2
- 0xb8b1a9: mov    BYTE PTR [r15+0x10],0x0
- 0xb8b1cf: mov    QWORD PTR [r14+0x10],r15
### FDE 0xb8b202..0xb8b224
- 0xb8b20f: mov    rdi,QWORD PTR [rdi+0x10]
- 0xb8b213: and    QWORD PTR [rax+0x10],0x0
### FDE 0xec70f2..0xec7114
- 0xec710c: movups XMMWORD PTR [rdi+0x10],xmm0
### FDE 0xec7182..0xec7197
- 0xec7188: movups XMMWORD PTR [rdi+0x10],xmm0
### FDE 0x14c8710..0x14c8f70
- 0x14c8749: lea    rbp,[rbx+0x10]
- 0x14c87f8: mov    QWORD PTR [rsp+0x10],r15
- 0x14c8875: movups XMMWORD PTR [rax+0x10],xmm0
- 0x14c8a34: lea    rdi,[r12+0x10]
- 0x14c8ace: mov    r14,QWORD PTR [rsp+0x10]
- 0x14c8b06: mov    r14,QWORD PTR [rsp+0x10]
- 0x14c8b94: mov    rax,QWORD PTR [r14+0x10]
- 0x14c8c33: lea    rdi,[r15+0x10]
- 0x14c8e81: and    QWORD PTR [r12+0x10],0x0
- 0x14c8eb7: mov    QWORD PTR [rdi+0x10],rax
- 0x14c8f1f: mov    r14,QWORD PTR [rsp+0x10]
### FDE 0x14c8fce..0x14c909a
- 0x14c8fe8: lea    rdi,[rsi+0x10]
### FDE 0x14c909a..0x14c913c
- 0x14c90b0: mov    QWORD PTR [rsp+0x10],rax
- 0x14c9106: cmp    rax,QWORD PTR [rsp+0x10]
- 0x14c9125: cmp    rax,QWORD PTR [rsp+0x10]
### FDE 0x14c9952..0x14c9a7f
- 0x14c99a5: mov    esi,DWORD PTR [rbx+0x10]
- 0x14c99d7: call   QWORD PTR [rax+0x10]
- 0x14c99fc: mov    esi,DWORD PTR [rbx+0x10]
- 0x14c9a29: mov    esi,DWORD PTR [rbx+0x10]
### FDE 0x14c9b96..0x14c9d1f
- 0x14c9bdf: and    QWORD PTR [rsi+0x10],0x0
- 0x14c9c00: mov    QWORD PTR [r12+0x10],rax
### FDE 0x14ca044..0x14ca442
- 0x14ca05a: mov    QWORD PTR [rsp+0x10],r8
- 0x14ca0cd: mov    rcx,QWORD PTR [rsp+0x10]
- 0x14ca305: and    QWORD PTR [rsi+0x10],0x0
- 0x14ca326: mov    QWORD PTR [rbx+0x10],rax
### FDE 0x14cd642..0x14cd694
- 0x14cd68a: and    QWORD PTR [rbx+0x10],0x0
### FDE 0x14edbc8..0x14edc11
- 0x14edbef: mov    BYTE PTR [rax+0x1b8],0x1
### FDE 0x14ee2a8..0x14ee2e4
- 0x14ee2da: mov    rdi,QWORD PTR [rbx+0x10]
### FDE 0x14ee2f6..0x14ee4e4
- 0x14ee30a: mov    QWORD PTR [rsp+0x10],rdx
- 0x14ee371: and    QWORD PTR [rax+0x10],0x0
- 0x14ee394: mov    QWORD PTR [rsp+0x10],r10
- 0x14ee3af: and    QWORD PTR [r12+0x10],0x0
- 0x14ee3d6: push   QWORD PTR [rsp+0x10]
- 0x14ee3ef: lea    rdi,[r12+0x10]
- 0x14ee463: mov    rdx,QWORD PTR [rsp+0x10]
- 0x14ee478: call   QWORD PTR [rax+0x10]
### FDE 0x14ee4e4..0x14ee803
- 0x14ee582: lea    r10,[rsp+0x10]
- 0x14ee587: and    QWORD PTR [r10+0x10],0x0
- 0x14ee5ca: lea    rdi,[rsp+0x10]
- 0x14ee5f0: lea    rax,[rsp+0x10]
- 0x14ee5f6: push   QWORD PTR [rsp+0x10]
- 0x14ee601: lea    rdi,[rsp+0x10]
- 0x14ee68b: lea    r10,[rsp+0x10]
- 0x14ee694: and    QWORD PTR [r10+0x10],0x0
- 0x14ee6ca: lea    rdi,[rsp+0x10]
- 0x14ee6ef: lea    rax,[rsp+0x10]
- 0x14ee712: lea    rdi,[rsp+0x10]
- 0x14ee737: lea    rax,[rsp+0x10]
- 0x14ee756: lea    rdi,[rsp+0x10]
- 0x14ee77b: lea    rax,[rsp+0x10]
- 0x14ee795: lea    rdi,[rsp+0x10]
- 0x14ee7ba: lea    rax,[rsp+0x10]
- 0x14ee7dc: lea    rdi,[rsp+0x10]
### FDE 0x14ee804..0x14ee96a
- 0x14ee83b: lea    r12,[r13+0x10]
- 0x14ee8e8: mov    rax,QWORD PTR [rax+0x10]
### FDE 0x14ee96a..0x14eea3b
- 0x14ee9c5: and    QWORD PTR [rax+0x10],0x0
### FDE 0x14eea3c..0x14eeb0c
- 0x14eea96: and    QWORD PTR [rax+0x10],0x0
### FDE 0x14eeb0c..0x14eebce
- 0x14eeb5a: and    QWORD PTR [rax+0x10],0x0
### FDE 0x14eebce..0x14eecc4
- 0x14eec12: and    QWORD PTR [rax+0x10],0x0
- 0x14eec45: and    QWORD PTR [rbp+0x10],0x0
### FDE 0x14ef0d4..0x14ef143
- 0x14ef139: mov    rdi,QWORD PTR [rbx+0x10]
### FDE 0x14ef156..0x14ef3ff
- 0x14ef1aa: call   QWORD PTR [rax+0x10]
- 0x14ef1ad: mov    DWORD PTR [rsp+0x10],eax
- 0x14ef1b3: mov    DWORD PTR [rsp+0x10],0x0
### FDE 0x14ef400..0x14ef6c3
- 0x14ef56b: movups XMMWORD PTR [rbx+0x10],xmm1
- 0x14ef5d8: movups XMMWORD PTR [rbx+0x10],xmm0
- 0x14ef5fa: lea    rdi,[rbx+0x10]
### FDE 0x14ef6c4..0x14ef80a
- 0x14ef6de: mov    QWORD PTR [rsp+0x10],rdx
- 0x14ef71d: call   QWORD PTR [rax+0x10]
### FDE 0x14efcbe..0x14efd85
- 0x14efcd1: mov    QWORD PTR [rsp+0x10],rax
- 0x14efd57: mov    rdi,QWORD PTR [rbx+0x10]
- 0x14efd69: cmp    rax,QWORD PTR [rsp+0x10]
### FDE 0x14efd98..0x14f003f
- 0x14efde1: movups xmm1,XMMWORD PTR [rax+0x10]
- 0x14efe3e: mov    QWORD PTR [rsp+0x10],rax
- 0x14efe98: mov    QWORD PTR [r15+0x10],rax
### FDE 0x174ef82..0x174f1db
- 0x174f07b: mov    ecx,DWORD PTR [rdi+0x10]
- 0x174f089: lea    r8,[rdi+0x10]
- 0x174f093: mov    QWORD PTR [rsp+0x10],rdi
- 0x174f11a: mov    rdi,QWORD PTR [rsp+0x10]
- 0x174f123: mov    ecx,DWORD PTR [rdi+0x10]
### FDE 0x174f1dc..0x174f5c5
- 0x174f284: mov    QWORD PTR [rsp+0x10],rax
- 0x174f409: cmp    rbp,QWORD PTR [rsp+0x10]
- 0x174f450: mov    esi,DWORD PTR [rdi+0x10]
