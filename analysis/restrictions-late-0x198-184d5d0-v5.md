# Restrictions late `this+0x18` consumer / `0x198` AP `0x184d5d0` trace

Parallel v5 report. Focus: the late consumer starting at `10ad136`, where `this+0x18` is read into `rbx`, then a `0x198` object with AP/literal `0x184d5d0` is built.

## Late consumer window around `10ad136`

```text
 10ad0a5:	48 8d 35 ff b7 32 ff 	lea    rsi,[rip+0xffffffffff32b7ff]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ad0ac:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad0b3:	00
 10ad0b4:	e8 96 e7 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ad0b9:	89 44 24 3c          	mov    DWORD PTR [rsp+0x3c],eax
 10ad0bd:	eb 08                	jmp    10ad0c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2744dd>
 10ad0bf:	c7 44 24 3c 00 00 00 	mov    DWORD PTR [rsp+0x3c],0x0
 10ad0c6:	00
 10ad0c7:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad0ce:	00
 10ad0cf:	e8 5c 9c 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ad0d4:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 10ad0d8:	48 8d 15 b1 a4 32 ff 	lea    rdx,[rip+0xffffffffff32a4b1]        # 3d7590 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2175>
 10ad0df:	4c 8d 05 ca a4 32 ff 	lea    r8,[rip+0xffffffffff32a4ca]        # 3d75b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2195>
 10ad0e6:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10ad0ed:	00
 10ad0ee:	6a 11                	push   0x11
 10ad0f0:	59                   	pop    rcx
 10ad0f1:	6a 18                	push   0x18
 10ad0f3:	41 59                	pop    r9
 10ad0f5:	48 89 df             	mov    rdi,rbx
 10ad0f8:	e8 cb a3 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ad0fd:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
 10ad101:	89 6c 24 10          	mov    DWORD PTR [rsp+0x10],ebp
 10ad105:	74 1a                	je     10ad121 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274537>
 10ad107:	48 8d 35 9d b7 32 ff 	lea    rsi,[rip+0xffffffffff32b79d]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ad10e:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad115:	00
 10ad116:	e8 34 e7 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ad11b:	89 44 24 38          	mov    DWORD PTR [rsp+0x38],eax
 10ad11f:	eb 08                	jmp    10ad129 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27453f>
 10ad121:	c7 44 24 38 00 00 00 	mov    DWORD PTR [rsp+0x38],0x0
 10ad128:	00
 10ad129:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad130:	00
 10ad131:	e8 fa 9b 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ad136:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 10ad13b:	48 8b 18             	mov    rbx,QWORD PTR [rax]
 10ad13e:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 10ad143:	4c 8b 20             	mov    r12,QWORD PTR [rax]
 10ad146:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
 10ad14b:	4c 8b 30             	mov    r14,QWORD PTR [rax]
 10ad14e:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 10ad153:	4c 8b 38             	mov    r15,QWORD PTR [rax]
 10ad156:	bf 98 01 00 00       	mov    edi,0x198
 10ad15b:	e8 a0 0d 74 00       	call   17edf00 <_Znwm@plt>
 10ad160:	48 89 c5             	mov    rbp,rax
 10ad163:	0f b6 44 24 40       	movzx  eax,BYTE PTR [rsp+0x40]
 10ad168:	66 0f 6e c0          	movd   xmm0,eax
 10ad16c:	0f b6 44 24 07       	movzx  eax,BYTE PTR [rsp+0x7]
 10ad171:	66 0f 3a 20 c0 01    	pinsrb xmm0,eax,0x1
 10ad177:	0f b6 44 24 05       	movzx  eax,BYTE PTR [rsp+0x5]
 10ad17c:	66 0f 3a 20 c0 02    	pinsrb xmm0,eax,0x2
 10ad182:	0f b6 44 24 04       	movzx  eax,BYTE PTR [rsp+0x4]
 10ad187:	66 0f 3a 20 c0 03    	pinsrb xmm0,eax,0x3
 10ad18d:	66 0f 7f 44 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm0
 10ad193:	4d 8d 6e 08          	lea    r13,[r14+0x8]
 10ad197:	4d 85 f6             	test   r14,r14
 10ad19a:	4d 0f 44 ee          	cmove  r13,r14
 10ad19e:	48 8d 05 2b 04 7a 00 	lea    rax,[rip+0x7a042b]        # 184d5d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9cb8>
 10ad1a5:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
 10ad1a9:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
 10ad1ae:	48 89 45 08          	mov    QWORD PTR [rbp+0x8],rax
 10ad1b2:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 10ad1b7:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax
 10ad1bb:	4c 89 65 18          	mov    QWORD PTR [rbp+0x18],r12
 10ad1bf:	4c 8d 65 20          	lea    r12,[rbp+0x20]
 10ad1c3:	4c 89 e7             	mov    rdi,r12
 10ad1c6:	e8 2b c8 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 10ad1cb:	4c 89 6d 30          	mov    QWORD PTR [rbp+0x30],r13
 10ad1cf:	4c 89 7d 38          	mov    QWORD PTR [rbp+0x38],r15
 10ad1d3:	48 8d 7d 40          	lea    rdi,[rbp+0x40]
 10ad1d7:	48 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],rdi
 10ad1dc:	e8 15 c8 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 10ad1e1:	c7 45 50 05 00 00 00 	mov    DWORD PTR [rbp+0x50],0x5
 10ad1e8:	66 83 65 54 00       	and    WORD PTR [rbp+0x54],0x0
 10ad1ed:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]
 10ad1f2:	f3 0f 11 45 56       	movss  DWORD PTR [rbp+0x56],xmm0
 10ad1f7:	8a 44 24 06          	mov    al,BYTE PTR [rsp+0x6]
 10ad1fb:	88 45 5a             	mov    BYTE PTR [rbp+0x5a],al
 10ad1fe:	c6 45 5b 00          	mov    BYTE PTR [rbp+0x5b],0x0
 10ad202:	8b 44 24 10          	mov    eax,DWORD PTR [rsp+0x10]
 10ad206:	88 45 5c             	mov    BYTE PTR [rbp+0x5c],al
 10ad209:	8b 44 24 3c          	mov    eax,DWORD PTR [rsp+0x3c]
 10ad20d:	88 45 5d             	mov    BYTE PTR [rbp+0x5d],al
 10ad210:	8b 44 24 38          	mov    eax,DWORD PTR [rsp+0x38]
 10ad214:	88 45 5e             	mov    BYTE PTR [rbp+0x5e],al
 10ad217:	48 89 5d 60          	mov    QWORD PTR [rbp+0x60],rbx
 10ad21b:	48 8b 84 24 98 01 00 	mov    rax,QWORD PTR [rsp+0x198]
 10ad222:	00
 10ad223:	48 89 45 68          	mov    QWORD PTR [rbp+0x68],rax
 10ad227:	48 8b 84 24 a0 01 00 	mov    rax,QWORD PTR [rsp+0x1a0]
 10ad22e:	00
 10ad22f:	48 89 45 70          	mov    QWORD PTR [rbp+0x70],rax
 10ad233:	48 8b 84 24 a8 01 00 	mov    rax,QWORD PTR [rsp+0x1a8]
 10ad23a:	00
 10ad23b:	48 89 45 78          	mov    QWORD PTR [rbp+0x78],rax
 10ad23f:	48 8b 84 24 b0 01 00 	mov    rax,QWORD PTR [rsp+0x1b0]
 10ad246:	00
 10ad247:	48 89 85 80 00 00 00 	mov    QWORD PTR [rbp+0x80],rax
 10ad24e:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
 10ad255:	00
 10ad256:	48 89 85 88 00 00 00 	mov    QWORD PTR [rbp+0x88],rax
 10ad25d:	48 8b 84 24 c8 01 00 	mov    rax,QWORD PTR [rsp+0x1c8]
 10ad264:	00
 10ad265:	48 89 85 90 00 00 00 	mov    QWORD PTR [rbp+0x90],rax
 10ad26c:	0f 57 c0             	xorps  xmm0,xmm0
 10ad26f:	48 83 a5 b8 00 00 00 	and    QWORD PTR [rbp+0xb8],0x0
 10ad276:	00
 10ad277:	0f 11 85 98 00 00 00 	movups XMMWORD PTR [rbp+0x98],xmm0
 10ad27e:	0f 11 85 a8 00 00 00 	movups XMMWORD PTR [rbp+0xa8],xmm0
 10ad285:	c7 85 c0 00 00 00 00 	mov    DWORD PTR [rbp+0xc0],0x3f800000
 10ad28c:	00 80 3f
 10ad28f:	48 8d bd c8 00 00 00 	lea    rdi,[rbp+0xc8]
 10ad296:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
 10ad29b:	e8 ee af a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 10ad2a0:	48 8d bd 20 01 00 00 	lea    rdi,[rbp+0x120]
 10ad2a7:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
 10ad2ac:	e8 dd af a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 10ad2b1:	4c 8d b5 78 01 00 00 	lea    r14,[rbp+0x178]
 10ad2b8:	4c 89 f7             	mov    rdi,r14
 10ad2bb:	e8 36 c7 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 10ad2c0:	4c 8d ad 88 01 00 00 	lea    r13,[rbp+0x188]
 10ad2c7:	4c 89 ef             	mov    rdi,r13
 10ad2ca:	e8 27 c7 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 10ad2cf:	8a 45 5e             	mov    al,BYTE PTR [rbp+0x5e]
 10ad2d2:	86 05 68 3e 94 00    	xchg   BYTE PTR [rip+0x943e68],al        # 19f1140 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x2870>
 10ad2d8:	4c 8b 7d 08          	mov    r15,QWORD PTR [rbp+0x8]
 10ad2dc:	4c 8d 84 24 d0 00 00 	lea    r8,[rsp+0xd0]
 10ad2e3:	00
 10ad2e4:	49 89 28             	mov    QWORD PTR [r8],rbp
 10ad2e7:	48 8d 35 a3 fd 9e ff 	lea    rsi,[rip+0xffffffffff9efda3]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 10ad2ee:	48 8d 0d db d2 00 00 	lea    rcx,[rip+0xd2db]        # 10ba5d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2819e6>
 10ad2f5:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10ad2fc:	00
 10ad2fd:	6a 08                	push   0x8
 10ad2ff:	41 59                	pop    r9
 10ad301:	48 89 df             	mov    rdi,rbx
 10ad304:	31 d2                	xor    edx,edx
 10ad306:	e8 89 d4 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 10ad30b:	49 8b 37             	mov    rsi,QWORD PTR [r15]
 10ad30e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ad311:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]
 10ad318:	00
 10ad319:	4c 89 ff             	mov    rdi,r15
 10ad31c:	48 89 da             	mov    rdx,rbx
 10ad31f:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10ad322:	4c 89 f7             	mov    rdi,r14
 10ad325:	4c 89 fe             	mov    rsi,r15
 10ad328:	e8 c5 c8 72 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 10ad32d:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
 10ad331:	e8 50 11 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad336:	48 89 df             	mov    rdi,rbx
 10ad339:	e8 aa d4 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10ad33e:	4c 8b bd 90 00 00 00 	mov    r15,QWORD PTR [rbp+0x90]
 10ad345:	4d 85 ff             	test   r15,r15
 10ad348:	74 6c                	je     10ad3b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2747cc>
 10ad34a:	4c 8d 84 24 d0 00 00 	lea    r8,[rsp+0xd0]
 10ad351:	00
 10ad352:	49 89 28             	mov    QWORD PTR [r8],rbp
 10ad355:	48 8d 35 35 fd 9e ff 	lea    rsi,[rip+0xffffffffff9efd35]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 10ad35c:	48 8d 0d d3 d3 00 00 	lea    rcx,[rip+0xd3d3]        # 10ba736 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b4c>
 10ad363:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10ad36a:	00
 10ad36b:	6a 08                	push   0x8
 10ad36d:	41 59                	pop    r9
 10ad36f:	48 89 df             	mov    rdi,rbx
 10ad372:	31 d2                	xor    edx,edx
 10ad374:	e8 1b d4 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 10ad379:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10ad37c:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 10ad383:	00
 10ad384:	4c 89 fe             	mov    rsi,r15
 10ad387:	48 89 da             	mov    rdx,rbx
 10ad38a:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10ad38d:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]
 10ad394:	00
 10ad395:	4c 89 ef             	mov    rdi,r13
 10ad398:	48 89 de             	mov    rsi,rbx
 10ad39b:	e8 52 c8 72 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 10ad3a0:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 10ad3a4:	e8 dd 10 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad3a9:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad3b0:	00
 10ad3b1:	e8 32 d4 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10ad3b6:	4c 8b 7d 18          	mov    r15,QWORD PTR [rbp+0x18]
 10ad3ba:	4d 85 ff             	test   r15,r15
 10ad3bd:	74 6c                	je     10ad42b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274841>
 10ad3bf:	4c 8d 84 24 d0 00 00 	lea    r8,[rsp+0xd0]
 10ad3c6:	00
 10ad3c7:	49 89 28             	mov    QWORD PTR [r8],rbp
 10ad3ca:	48 8d 35 c0 fc 9e ff 	lea    rsi,[rip+0xffffffffff9efcc0]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 10ad3d1:	48 8d 0d 6e d3 00 00 	lea    rcx,[rip+0xd36e]        # 10ba746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b5c>
 10ad3d8:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10ad3df:	00
 10ad3e0:	6a 08                	push   0x8
 10ad3e2:	41 59                	pop    r9
 10ad3e4:	48 89 df             	mov    rdi,rbx
 10ad3e7:	31 d2                	xor    edx,edx
 10ad3e9:	e8 a6 d3 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 10ad3ee:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10ad3f1:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 10ad3f8:	00
 10ad3f9:	4c 89 fe             	mov    rsi,r15
 10ad3fc:	48 89 da             	mov    rdx,rbx
 10ad3ff:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10ad402:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]
 10ad409:	00
 10ad40a:	4c 89 e7             	mov    rdi,r12
 10ad40d:	48 89 de             	mov    rsi,rbx
 10ad410:	e8 dd c7 72 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 10ad415:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 10ad419:	e8 68 10 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad41e:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad425:	00
 10ad426:	e8 bd d3 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
```
## Text xrefs mentioning AP `0x184d5d0`

| addr | instruction |
|---:|---|
| `0x10ad19e` | `10ad19e:	48 8d 05 2b 04 7a 00 	lea    rax,[rip+0x7a042b]        # 184d5d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9cb8>` |
| `0x10bd03c` | `10bd03c:	48 8d 05 8d 05 79 00 	lea    rax,[rip+0x79058d]        # 184d5d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9cb8>` |

## Raw data bytes around AP `0x184d5d0`

```text
liborbit-jni-spotify.so:     file format elf64-x86-64

Contents of section .data.rel.ro:
 184d5d0 00000000 00000000 00000000 00000000  ................
 184d5e0 00000000 00000000 00000000 00000000  ................
 184d5f0 00000000 00000000 00000000 00000000  ................
 184d600 00000000 00000000 00000000 00000000  ................
 184d610 00000000 00000000 00000000 00000000  ................
 184d620 00000000 00000000 00000000 00000000  ................
 184d630 00000000 00000000 00000000 00000000  ................
 184d640 00000000 00000000 00000000 00000000  ................
 184d650 00000000 00000000 00000000 00000000  ................
 184d660 00000000 00000000 00000000 00000000  ................
 184d670 00000000 00000000 00000000 00000000  ................
 184d680 00000000 00000000 00000000 00000000  ................
 184d690 00000000 00000000 00000000 00000000  ................
 184d6a0 00000000 00000000 00000000 00000000  ................
```
## Relocations around AP `0x184d5d0`

```text
000000000184d5d0  0000000000000008 R_X86_64_RELATIVE                         a3fa60
000000000184d5d8  0000000000000008 R_X86_64_RELATIVE                         10ba7ca
000000000184d5e0  0000000000000008 R_X86_64_RELATIVE                         10ba802
000000000184d5e8  0000000000000008 R_X86_64_RELATIVE                         10ba86e
000000000184d5f0  0000000000000008 R_X86_64_RELATIVE                         10ba802
000000000184d5f8  0000000000000008 R_X86_64_RELATIVE                         10ba8a6
000000000184d600  0000000000000008 R_X86_64_RELATIVE                         10ba8de
000000000184d608  0000000000000008 R_X86_64_RELATIVE                         10ba93e
000000000184d610  0000000000000008 R_X86_64_RELATIVE                         10ba976
000000000184d618  0000000000000008 R_X86_64_RELATIVE                         10ba98e
000000000184d620  0000000000000008 R_X86_64_RELATIVE                         10ba9c6
000000000184d628  0000000000000008 R_X86_64_RELATIVE                         10baa26
000000000184d630  0000000000000008 R_X86_64_RELATIVE                         10baa5e
000000000184d638  0000000000000008 R_X86_64_RELATIVE                         10baab4
000000000184d640  0000000000000008 R_X86_64_RELATIVE                         10baaec
000000000184d648  0000000000000008 R_X86_64_RELATIVE                         10bab3c
000000000184d650  0000000000000008 R_X86_64_RELATIVE                         10ba976
000000000184d658  0000000000000008 R_X86_64_RELATIVE                         10bab76
000000000184d660  0000000000000008 R_X86_64_RELATIVE                         10babb0
000000000184d668  0000000000000008 R_X86_64_RELATIVE                         10bac0a
000000000184d670  0000000000000008 R_X86_64_RELATIVE                         10bac44
000000000184d678  0000000000000008 R_X86_64_RELATIVE                         10bac9e
000000000184d680  0000000000000008 R_X86_64_RELATIVE                         10bacd8
000000000184d688  0000000000000008 R_X86_64_RELATIVE                         10bad36
000000000184d690  0000000000000008 R_X86_64_RELATIVE                         10bad7c
000000000184d698  0000000000000008 R_X86_64_RELATIVE                         10bad8a
000000000184d6a0  0000000000000008 R_X86_64_RELATIVE                         10badc4
000000000184d6a8  0000000000000008 R_X86_64_RELATIVE                         10badde
```
## Chronological `0x198` construction/use events

| addr | instruction |
|---:|---|
| `0x10ad136` | `10ad136:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]` |
| `0x10ad13b` | `10ad13b:	48 8b 18             	mov    rbx,QWORD PTR [rax]` |
| `0x10ad15b` | `10ad15b:	e8 a0 0d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ad19e` | `10ad19e:	48 8d 05 2b 04 7a 00 	lea    rax,[rip+0x7a042b]        # 184d5d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9cb8>` |
| `0x10ad1a5` | `10ad1a5:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax` |
| `0x10ad1ae` | `10ad1ae:	48 89 45 08          	mov    QWORD PTR [rbp+0x8],rax` |
| `0x10ad1b7` | `10ad1b7:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax` |
| `0x10ad1bb` | `10ad1bb:	4c 89 65 18          	mov    QWORD PTR [rbp+0x18],r12` |
| `0x10ad1bf` | `10ad1bf:	4c 8d 65 20          	lea    r12,[rbp+0x20]` |
| `0x10ad1c6` | `10ad1c6:	e8 2b c8 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>` |
| `0x10ad1cb` | `10ad1cb:	4c 89 6d 30          	mov    QWORD PTR [rbp+0x30],r13` |
| `0x10ad1cf` | `10ad1cf:	4c 89 7d 38          	mov    QWORD PTR [rbp+0x38],r15` |
| `0x10ad1d3` | `10ad1d3:	48 8d 7d 40          	lea    rdi,[rbp+0x40]` |
| `0x10ad1dc` | `10ad1dc:	e8 15 c8 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>` |
| `0x10ad1e1` | `10ad1e1:	c7 45 50 05 00 00 00 	mov    DWORD PTR [rbp+0x50],0x5` |
| `0x10ad1e8` | `10ad1e8:	66 83 65 54 00       	and    WORD PTR [rbp+0x54],0x0` |
| `0x10ad1f2` | `10ad1f2:	f3 0f 11 45 56       	movss  DWORD PTR [rbp+0x56],xmm0` |
| `0x10ad1fb` | `10ad1fb:	88 45 5a             	mov    BYTE PTR [rbp+0x5a],al` |
| `0x10ad1fe` | `10ad1fe:	c6 45 5b 00          	mov    BYTE PTR [rbp+0x5b],0x0` |
| `0x10ad206` | `10ad206:	88 45 5c             	mov    BYTE PTR [rbp+0x5c],al` |
| `0x10ad20d` | `10ad20d:	88 45 5d             	mov    BYTE PTR [rbp+0x5d],al` |
| `0x10ad214` | `10ad214:	88 45 5e             	mov    BYTE PTR [rbp+0x5e],al` |
| `0x10ad217` | `10ad217:	48 89 5d 60          	mov    QWORD PTR [rbp+0x60],rbx` |
| `0x10ad223` | `10ad223:	48 89 45 68          	mov    QWORD PTR [rbp+0x68],rax` |
| `0x10ad22f` | `10ad22f:	48 89 45 70          	mov    QWORD PTR [rbp+0x70],rax` |
| `0x10ad23b` | `10ad23b:	48 89 45 78          	mov    QWORD PTR [rbp+0x78],rax` |
| `0x10ad247` | `10ad247:	48 89 85 80 00 00 00 	mov    QWORD PTR [rbp+0x80],rax` |
| `0x10ad256` | `10ad256:	48 89 85 88 00 00 00 	mov    QWORD PTR [rbp+0x88],rax` |
| `0x10ad265` | `10ad265:	48 89 85 90 00 00 00 	mov    QWORD PTR [rbp+0x90],rax` |
| `0x10ad26f` | `10ad26f:	48 83 a5 b8 00 00 00 	and    QWORD PTR [rbp+0xb8],0x0` |
| `0x10ad277` | `10ad277:	0f 11 85 98 00 00 00 	movups XMMWORD PTR [rbp+0x98],xmm0` |
| `0x10ad27e` | `10ad27e:	0f 11 85 a8 00 00 00 	movups XMMWORD PTR [rbp+0xa8],xmm0` |
| `0x10ad285` | `10ad285:	c7 85 c0 00 00 00 00 	mov    DWORD PTR [rbp+0xc0],0x3f800000` |
| `0x10ad28f` | `10ad28f:	48 8d bd c8 00 00 00 	lea    rdi,[rbp+0xc8]` |
| `0x10ad29b` | `10ad29b:	e8 ee af a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>` |
| `0x10ad2a0` | `10ad2a0:	48 8d bd 20 01 00 00 	lea    rdi,[rbp+0x120]` |
| `0x10ad2ac` | `10ad2ac:	e8 dd af a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>` |
| `0x10ad2b1` | `10ad2b1:	4c 8d b5 78 01 00 00 	lea    r14,[rbp+0x178]` |
| `0x10ad2bb` | `10ad2bb:	e8 36 c7 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>` |
| `0x10ad2c0` | `10ad2c0:	4c 8d ad 88 01 00 00 	lea    r13,[rbp+0x188]` |
| `0x10ad2ca` | `10ad2ca:	e8 27 c7 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>` |
| `0x10ad2cf` | `10ad2cf:	8a 45 5e             	mov    al,BYTE PTR [rbp+0x5e]` |
| `0x10ad2d8` | `10ad2d8:	4c 8b 7d 08          	mov    r15,QWORD PTR [rbp+0x8]` |
| `0x10ad2f5` | `10ad2f5:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad301` | `10ad301:	48 89 df             	mov    rdi,rbx` |
| `0x10ad306` | `10ad306:	e8 89 d4 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0x10ad31c` | `10ad31c:	48 89 da             	mov    rdx,rbx` |
| `0x10ad31f` | `10ad31f:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10ad328` | `10ad328:	e8 c5 c8 72 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>` |
| `0x10ad331` | `10ad331:	e8 50 11 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10ad336` | `10ad336:	48 89 df             	mov    rdi,rbx` |
| `0x10ad339` | `10ad339:	e8 aa d4 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0x10ad33e` | `10ad33e:	4c 8b bd 90 00 00 00 	mov    r15,QWORD PTR [rbp+0x90]` |
| `0x10ad363` | `10ad363:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad36f` | `10ad36f:	48 89 df             	mov    rdi,rbx` |
| `0x10ad374` | `10ad374:	e8 1b d4 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0x10ad387` | `10ad387:	48 89 da             	mov    rdx,rbx` |
| `0x10ad38a` | `10ad38a:	ff 50 20             	call   QWORD PTR [rax+0x20]` |
| `0x10ad38d` | `10ad38d:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]` |
| `0x10ad398` | `10ad398:	48 89 de             	mov    rsi,rbx` |
| `0x10ad39b` | `10ad39b:	e8 52 c8 72 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>` |
| `0x10ad3a0` | `10ad3a0:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0x10ad3a4` | `10ad3a4:	e8 dd 10 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10ad3b1` | `10ad3b1:	e8 32 d4 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0x10ad3b6` | `10ad3b6:	4c 8b 7d 18          	mov    r15,QWORD PTR [rbp+0x18]` |
| `0x10ad3d8` | `10ad3d8:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad3e4` | `10ad3e4:	48 89 df             	mov    rdi,rbx` |
| `0x10ad3e9` | `10ad3e9:	e8 a6 d3 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0x10ad3fc` | `10ad3fc:	48 89 da             	mov    rdx,rbx` |
| `0x10ad3ff` | `10ad3ff:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10ad402` | `10ad402:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]` |
| `0x10ad40d` | `10ad40d:	48 89 de             	mov    rsi,rbx` |
| `0x10ad410` | `10ad410:	e8 dd c7 72 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>` |
| `0x10ad415` | `10ad415:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0x10ad419` | `10ad419:	e8 68 10 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10ad426` | `10ad426:	e8 bd d3 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0x10ad42b` | `10ad42b:	4c 8b 7d 38          	mov    r15,QWORD PTR [rbp+0x38]` |
| `0x10ad44d` | `10ad44d:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad459` | `10ad459:	48 89 df             	mov    rdi,rbx` |
| `0x10ad45e` | `10ad45e:	e8 31 d3 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0x10ad471` | `10ad471:	48 89 da             	mov    rdx,rbx` |
| `0x10ad474` | `10ad474:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ad477` | `10ad477:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]` |
| `0x10ad484` | `10ad484:	48 89 de             	mov    rsi,rbx` |
| `0x10ad487` | `10ad487:	e8 66 c7 72 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>` |
| `0x10ad48c` | `10ad48c:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0x10ad490` | `10ad490:	e8 f1 0f 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10ad49d` | `10ad49d:	e8 46 d3 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0x10ad4a5` | `10ad4a5:	e8 56 0a 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ad502` | `10ad502:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad511` | `10ad511:	48 89 df             	mov    rdi,rbx` |
| `0x10ad514` | `10ad514:	e8 af 9f 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>` |
| `0x10ad519` | `10ad519:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0` |

