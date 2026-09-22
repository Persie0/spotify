# Restrictions capture bridge: `this+0x18` -> `0x198+0x60`

Parallel v6 report. Focus: the exact bridge where the object returned by `b411a4` is copied into the late `0x198` object, plus nearby consumers after construction.

## `0x10ad136` — read this+0x18 into rbx

```text
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
```
## `0x10ad19e` — assign AP 0x184d5d0

```text
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
```
## `0x10ad217` — store rbx into 0x198+0x60

```text
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
```
## `0x10ad2a7` — late stack slot reuse/store after capture

```text
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
 10ad42b:	4c 8b 7d 38          	mov    r15,QWORD PTR [rbp+0x38]
```
## `0x10ad69b` — rsp70 late read

```text
 10ad62a:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10ad62d:	0f 28 84 24 f0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xf0]
 10ad634:	00
 10ad635:	0f 57 c9             	xorps  xmm1,xmm1
 10ad638:	0f 29 8c 24 f0 00 00 	movaps XMMWORD PTR [rsp+0xf0],xmm1
 10ad63f:	00
 10ad640:	49 8b 7c 24 38       	mov    rdi,QWORD PTR [r12+0x38]
 10ad645:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0
 10ad64b:	e8 36 0e 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad650:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
 10ad657:	00
 10ad658:	e8 29 0e 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad65d:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad664:	00
 10ad665:	e8 c0 06 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ad66a:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
 10ad66e:	48 89 ef             	mov    rdi,rbp
 10ad671:	48 8b 5c 24 28       	mov    rbx,QWORD PTR [rsp+0x28]
 10ad676:	ff 90 58 01 00 00    	call   QWORD PTR [rax+0x158]
 10ad67c:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 10ad67f:	48 89 df             	mov    rdi,rbx
 10ad682:	ff 50 40             	call   QWORD PTR [rax+0x40]
 10ad685:	6a 48                	push   0x48
 10ad687:	5f                   	pop    rdi
 10ad688:	e8 73 08 74 00       	call   17edf00 <_Znwm@plt>
 10ad68d:	48 8d 0d f4 03 7a 00 	lea    rcx,[rip+0x7a03f4]        # 184da88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa170>
 10ad694:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ad697:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
 10ad69b:	48 8b 4c 24 70       	mov    rcx,QWORD PTR [rsp+0x70]
 10ad6a0:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
 10ad6a4:	48 89 68 18          	mov    QWORD PTR [rax+0x18],rbp
 10ad6a8:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
 10ad6ad:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
 10ad6b1:	48 89 58 28          	mov    QWORD PTR [rax+0x28],rbx
 10ad6b5:	48 8b 8c 24 80 00 00 	mov    rcx,QWORD PTR [rsp+0x80]
 10ad6bc:	00
 10ad6bd:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx
 10ad6c1:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
 10ad6c6:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
 10ad6ca:	c6 40 40 01          	mov    BYTE PTR [rax+0x40],0x1
 10ad6ce:	48 8b 8c 24 98 00 00 	mov    rcx,QWORD PTR [rsp+0x98]
 10ad6d5:	00
 10ad6d6:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
 10ad6d9:	48 89 01             	mov    QWORD PTR [rcx],rax
 10ad6dc:	48 85 ff             	test   rdi,rdi
 10ad6df:	74 06                	je     10ad6e7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274afd>
 10ad6e1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ad6e4:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10ad6e7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ad6ee:	00 00
 10ad6f0:	48 3b 84 24 50 01 00 	cmp    rax,QWORD PTR [rsp+0x150]
 10ad6f7:	00
 10ad6f8:	0f 85 12 05 00 00    	jne    10adc10 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275026>
 10ad6fe:	48 81 c4 58 01 00 00 	add    rsp,0x158
 10ad705:	5b                   	pop    rbx
 10ad706:	41 5c                	pop    r12
 10ad708:	41 5d                	pop    r13
 10ad70a:	41 5e                	pop    r14
 10ad70c:	41 5f                	pop    r15
 10ad70e:	5d                   	pop    rbp
 10ad70f:	c3                   	ret
 10ad710:	48 89 c3             	mov    rbx,rax
 10ad713:	e9 16 04 00 00       	jmp    10adb2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f44>
 10ad718:	e9 23 01 00 00       	jmp    10ad840 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c56>
 10ad71d:	e9 06 01 00 00       	jmp    10ad828 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c3e>
 10ad722:	e9 19 01 00 00       	jmp    10ad840 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c56>
 10ad727:	48 89 c3             	mov    rbx,rax
 10ad72a:	e9 da 03 00 00       	jmp    10adb09 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f1f>
 10ad72f:	e9 03 02 00 00       	jmp    10ad937 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274d4d>
 10ad734:	48 89 c3             	mov    rbx,rax
 10ad737:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 10ad73e:	00
 10ad73f:	e8 4c 07 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ad744:	eb 21                	jmp    10ad767 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274b7d>
 10ad746:	48 89 c3             	mov    rbx,rax
 10ad749:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad750:	00
 10ad751:	e8 d4 05 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ad756:	4d 89 fe             	mov    r14,r15
 10ad759:	49 8b 7f 28          	mov    rdi,QWORD PTR [r15+0x28]
 10ad75d:	e8 24 0d 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad762:	eb 1b                	jmp    10ad77f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274b95>
 10ad764:	48 89 c3             	mov    rbx,rax
 10ad767:	e9 fb 00 00 00       	jmp    10ad867 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c7d>
 10ad76c:	4d 89 fe             	mov    r14,r15
 10ad76f:	48 89 c3             	mov    rbx,rax
 10ad772:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad779:	00
 10ad77a:	e8 ab 05 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ad77f:	4c 89 f7             	mov    rdi,r14
 10ad782:	e8 99 07 74 00       	call   17edf20 <_ZdlPv@plt>
 10ad787:	e9 c3 03 00 00       	jmp    10adb4f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f65>
 10ad78c:	e9 a6 01 00 00       	jmp    10ad937 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274d4d>
 10ad791:	48 89 c3             	mov    rbx,rax
 10ad794:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad79b:	00
 10ad79c:	e8 89 05 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ad7a1:	4d 89 fe             	mov    r14,r15
 10ad7a4:	49 8b 7f 40          	mov    rdi,QWORD PTR [r15+0x40]
 10ad7a8:	e8 d9 0c 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad7ad:	eb 13                	jmp    10ad7c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274bd8>
 10ad7af:	4d 89 fe             	mov    r14,r15
 10ad7b2:	48 89 c3             	mov    rbx,rax
 10ad7b5:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad7bc:	00
 10ad7bd:	e8 68 05 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ad7c2:	4c 89 f7             	mov    rdi,r14
 10ad7c5:	e8 56 07 74 00       	call   17edf20 <_ZdlPv@plt>
 10ad7ca:	e9 8b 03 00 00       	jmp    10adb5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f70>
 10ad7cf:	eb 00                	jmp    10ad7d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274be7>
 10ad7d1:	48 89 c3             	mov    rbx,rax
 10ad7d4:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
 10ad7d8:	e8 a9 0c 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad7dd:	4c 89 ff             	mov    rdi,r15
 10ad7e0:	e8 17 1e 9f ff       	call   a9f5fc <JNI_OnUnload@@Base+0x26ec9>
 10ad7e5:	eb 2d                	jmp    10ad814 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c2a>
 10ad7e7:	e9 1a 03 00 00       	jmp    10adb06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f1c>
 10ad7ec:	48 89 c3             	mov    rbx,rax
 10ad7ef:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad7f6:	00
 10ad7f7:	e8 ec cf 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10ad7fc:	4c 89 ef             	mov    rdi,r13
 10ad7ff:	e8 42 3f 71 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
 10ad804:	48 89 ef             	mov    rdi,rbp
 10ad807:	e8 5a c6 72 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 10ad80c:	4c 89 e7             	mov    rdi,r12
 10ad80f:	e8 1c 0c 00 00       	call   10ae430 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275846>
 10ad814:	4c 89 f7             	mov    rdi,r14
```
## Chronological filtered bridge events

| addr | instruction |
|---:|---|
| `0x10ad136` | `10ad136:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]` |
| `0x10ad13b` | `10ad13b:	48 8b 18             	mov    rbx,QWORD PTR [rax]` |
| `0x10ad156` | `10ad156:	bf 98 01 00 00       	mov    edi,0x198` |
| `0x10ad163` | `10ad163:	0f b6 44 24 40       	movzx  eax,BYTE PTR [rsp+0x40]` |
| `0x10ad18d` | `10ad18d:	66 0f 7f 44 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm0` |
| `0x10ad19e` | `10ad19e:	48 8d 05 2b 04 7a 00 	lea    rax,[rip+0x7a042b]        # 184d5d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9cb8>` |
| `0x10ad1ed` | `10ad1ed:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]` |
| `0x10ad217` | `10ad217:	48 89 5d 60          	mov    QWORD PTR [rbp+0x60],rbx` |
| `0x10ad21b` | `10ad21b:	48 8b 84 24 98 01 00 	mov    rax,QWORD PTR [rsp+0x198]` |
| `0x10ad2a7` | `10ad2a7:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi` |
| `0x10ad2f5` | `10ad2f5:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad301` | `10ad301:	48 89 df             	mov    rdi,rbx` |
| `0x10ad31c` | `10ad31c:	48 89 da             	mov    rdx,rbx` |
| `0x10ad31f` | `10ad31f:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10ad336` | `10ad336:	48 89 df             	mov    rdi,rbx` |
| `0x10ad363` | `10ad363:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad36f` | `10ad36f:	48 89 df             	mov    rdi,rbx` |
| `0x10ad387` | `10ad387:	48 89 da             	mov    rdx,rbx` |
| `0x10ad38a` | `10ad38a:	ff 50 20             	call   QWORD PTR [rax+0x20]` |
| `0x10ad38d` | `10ad38d:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]` |
| `0x10ad398` | `10ad398:	48 89 de             	mov    rsi,rbx` |
| `0x10ad3a0` | `10ad3a0:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0x10ad3d8` | `10ad3d8:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad3e4` | `10ad3e4:	48 89 df             	mov    rdi,rbx` |
| `0x10ad3fc` | `10ad3fc:	48 89 da             	mov    rdx,rbx` |
| `0x10ad3ff` | `10ad3ff:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10ad402` | `10ad402:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]` |
| `0x10ad40d` | `10ad40d:	48 89 de             	mov    rsi,rbx` |
| `0x10ad415` | `10ad415:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0x10ad44d` | `10ad44d:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad459` | `10ad459:	48 89 df             	mov    rdi,rbx` |
| `0x10ad471` | `10ad471:	48 89 da             	mov    rdx,rbx` |
| `0x10ad474` | `10ad474:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ad477` | `10ad477:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]` |
| `0x10ad484` | `10ad484:	48 89 de             	mov    rsi,rbx` |
| `0x10ad48c` | `10ad48c:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0x10ad502` | `10ad502:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad511` | `10ad511:	48 89 df             	mov    rdi,rbx` |
| `0x10ad519` | `10ad519:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0` |
| `0x10ad5b8` | `10ad5b8:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ad5bb` | `10ad5bb:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]` |
| `0x10ad5c3` | `10ad5c3:	0f 28 03             	movaps xmm0,XMMWORD PTR [rbx]` |
| `0x10ad5c9` | `10ad5c9:	0f 29 0b             	movaps XMMWORD PTR [rbx],xmm1` |
| `0x10ad5e4` | `10ad5e4:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0x10ad627` | `10ad627:	48 89 df             	mov    rdi,rbx` |
| `0x10ad62a` | `10ad62a:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10ad671` | `10ad671:	48 8b 5c 24 28       	mov    rbx,QWORD PTR [rsp+0x28]` |
| `0x10ad676` | `10ad676:	ff 90 58 01 00 00    	call   QWORD PTR [rax+0x158]` |
| `0x10ad67c` | `10ad67c:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0x10ad67f` | `10ad67f:	48 89 df             	mov    rdi,rbx` |
| `0x10ad682` | `10ad682:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0x10ad69b` | `10ad69b:	48 8b 4c 24 70       	mov    rcx,QWORD PTR [rsp+0x70]` |
| `0x10ad6b1` | `10ad6b1:	48 89 58 28          	mov    QWORD PTR [rax+0x28],rbx` |
| `0x10ad6e4` | `10ad6e4:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10ad705` | `10ad705:	5b                   	pop    rbx` |
| `0x10ad710` | `10ad710:	48 89 c3             	mov    rbx,rax` |
| `0x10ad727` | `10ad727:	48 89 c3             	mov    rbx,rax` |
| `0x10ad734` | `10ad734:	48 89 c3             	mov    rbx,rax` |
| `0x10ad746` | `10ad746:	48 89 c3             	mov    rbx,rax` |

