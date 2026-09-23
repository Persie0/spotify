# Restrictions local `[r13+0x410]` assignment/use v17

Focus: local dataflow around the known producer site `e930b3 r15=[r13+0x410]` and `e930da call [r15.vtable+0x28]`. Static provenance only.

## Producer window around `e930b3` / `e930da`

```text
  e92f25:	c3                   	ret
  e92f26:	e9 47 8f 01 00       	jmp    eabe72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x73288>
  e92f2b:	cc                   	int3
  e92f2c:	55                   	push   rbp
  e92f2d:	41 57                	push   r15
  e92f2f:	41 56                	push   r14
  e92f31:	41 55                	push   r13
  e92f33:	41 54                	push   r12
  e92f35:	53                   	push   rbx
  e92f36:	48 81 ec b8 10 00 00 	sub    rsp,0x10b8
  e92f3d:	48 89 8c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rcx
  e92f44:	00
  e92f45:	48 89 94 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rdx
  e92f4c:	00
  e92f4d:	49 89 f5             	mov    r13,rsi
  e92f50:	49 89 ff             	mov    r15,rdi
  e92f53:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e92f5a:	00 00
  e92f5c:	48 89 84 24 b0 10 00 	mov    QWORD PTR [rsp+0x10b0],rax
  e92f63:	00
  e92f64:	48 8b b6 80 04 00 00 	mov    rsi,QWORD PTR [rsi+0x480]
  e92f6b:	48 8d bc 24 90 03 00 	lea    rdi,[rsp+0x390]
  e92f72:	00
  e92f73:	e8 40 ff c5 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>
  e92f78:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92f7f:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92f82:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92f86:	48 8d 15 28 8b 4d ff 	lea    rdx,[rip+0xffffffffff4d8b28]        # 36bab5 <_ZTSSt12bad_any_cast@@Base-0x24713>
  e92f8d:	e8 27 64 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92f92:	b3 01                	mov    bl,0x1
  e92f94:	40 b5 01             	mov    bpl,0x1
  e92f97:	84 c0                	test   al,al
  e92f99:	75 1c                	jne    e92fb7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a3cd>
  e92f9b:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92fa2:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92fa5:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92fa9:	48 8d 15 b8 03 4a ff 	lea    rdx,[rip+0xffffffffff4a03b8]        # 333368 <_ZTSSt12bad_any_cast@@Base-0x5ce60>
  e92fb0:	e8 04 64 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92fb5:	89 c5                	mov    ebp,eax
  e92fb7:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92fbe:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92fc1:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92fc5:	48 8d 15 1a 6d 4a ff 	lea    rdx,[rip+0xffffffffff4a6d1a]        # 339ce6 <_ZTSSt12bad_any_cast@@Base-0x564e2>
  e92fcc:	e8 e8 63 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92fd1:	84 c0                	test   al,al
  e92fd3:	75 1c                	jne    e92ff1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a407>
  e92fd5:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92fdc:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92fdf:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92fe3:	48 8d 15 7e 03 4a ff 	lea    rdx,[rip+0xffffffffff4a037e]        # 333368 <_ZTSSt12bad_any_cast@@Base-0x5ce60>
  e92fea:	e8 ca 63 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92fef:	89 c3                	mov    ebx,eax
  e92ff1:	31 c0                	xor    eax,eax
  e92ff3:	88 84 24 e8 03 00 00 	mov    BYTE PTR [rsp+0x3e8],al
  e92ffa:	88 84 24 10 04 00 00 	mov    BYTE PTR [rsp+0x410],al
  e93001:	40 84 dd             	test   bpl,bl
  e93004:	0f 85 87 00 00 00    	jne    e93091 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a4a7>
  e9300a:	66 0f ef c0          	pxor   xmm0,xmm0
  e9300e:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
  e93015:	00
  e93016:	66 41 0f 7f 46 10    	movdqa XMMWORD PTR [r14+0x10],xmm0
  e9301c:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
  e93021:	41 c7 46 20 00 00 80 	mov    DWORD PTR [r14+0x20],0x3f800000
  e93028:	3f
  e93029:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e93030:	00
  e93031:	4c 89 f6             	mov    rsi,r14
  e93034:	e8 c3 63 00 00       	call   e993fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60812>
  e93039:	4c 89 f7             	mov    rdi,r14
  e9303c:	e8 25 f6 c4 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
  e93041:	40 84 ed             	test   bpl,bpl
  e93044:	74 14                	je     e9305a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a470>
  e93046:	48 8d 35 13 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c13]        # 43bc60 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x186c>
  e9304d:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e93054:	00
  e93055:	e8 16 a8 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e9305a:	84 db                	test   bl,bl
  e9305c:	74 14                	je     e93072 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a488>
  e9305e:	48 8d 35 13 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c13]        # 43bc78 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1884>
  e93065:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9306c:	00
  e9306d:	e8 fe a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e93072:	48 83 bc 24 00 04 00 	cmp    QWORD PTR [rsp+0x400],0x0
  e93079:	00 00
  e9307b:	74 14                	je     e93091 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a4a7>
  e9307d:	48 8d 35 0c 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c0c]        # 43bc90 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x189c>
  e93084:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9308b:	00
  e9308c:	e8 df a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
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
  e93166:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
  e9316c:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
  e93173:	00
  e93174:	48 8d b4 24 30 03 00 	lea    rsi,[rsp+0x330]
  e9317b:	00
  e9317c:	e8 4d 63 00 00       	call   e994ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608e4>
  e93181:	4c 8d a4 24 30 03 00 	lea    r12,[rsp+0x330]
  e93188:	00
  e93189:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
  e9318e:	e8 f3 b2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e93193:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e9319a:	00
  e9319b:	e8 48 76 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e931a0:	4c 8d ac 24 10 0e 00 	lea    r13,[rsp+0xe10]
  e931a7:	00
  e931a8:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  e931ac:	e8 01 b3 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e931b1:	4d 89 75 00          	mov    QWORD PTR [r13+0x0],r14
  e931b5:	49 89 5d 08          	mov    QWORD PTR [r13+0x8],rbx
  e931b9:	4d 89 7d 10          	mov    QWORD PTR [r13+0x10],r15
  e931bd:	48 8d 35 b2 66 c9 ff 	lea    rsi,[rip+0xffffffffffc966b2]        # b29876 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x76816>
  e931c4:	48 8d 15 1e aa cf ff 	lea    rdx,[rip+0xffffffffffcfaa1e]        # b8dbe9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdab89>
  e931cb:	48 8d 0d ca 63 00 00 	lea    rcx,[rip+0x63ca]        # e9959c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x609b2>
  e931d2:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]
  e931d9:	00
  e931da:	6a 18                	push   0x18
  e931dc:	41 59                	pop    r9
  e931de:	48 89 df             	mov    rdi,rbx
  e931e1:	4d 89 e8             	mov    r8,r13
  e931e4:	e8 ab 75 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e931e9:	49 8b 06             	mov    rax,QWORD PTR [r14]
  e931ec:	4c 89 e7             	mov    rdi,r12
  e931ef:	4c 89 f6             	mov    rsi,r14
  e931f2:	48 89 da             	mov    rdx,rbx
  e931f5:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
  e931fb:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
  e93202:	00
  e93203:	48 8d b4 24 30 03 00 	lea    rsi,[rsp+0x330]
  e9320a:	00
  e9320b:	e8 be 62 00 00       	call   e994ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608e4>
  e93210:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
  e93215:	48 8b bc 24 38 03 00 	mov    rdi,QWORD PTR [rsp+0x338]
  e9321c:	00
  e9321d:	e8 64 b2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e93222:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e93229:	00
  e9322a:	e8 b9 75 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e9322f:	48 8b bc 24 18 0e 00 	mov    rdi,QWORD PTR [rsp+0xe18]
  e93236:	00
  e93237:	e8 76 b2 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e9323c:	31 ff                	xor    edi,edi
  e9323e:	e8 6f b2 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e93243:	31 ff                	xor    edi,edi
  e93245:	e8 68 b2 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e9324a:	49 8d bd e0 03 00 00 	lea    rdi,[r13+0x3e0]
  e93251:	48 8d 9c 24 50 10 00 	lea    rbx,[rsp+0x1050]
  e93258:	00
  e93259:	48 89 de             	mov    rsi,rbx
  e9325c:	e8 fd 63 00 00       	call   e9965e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60a74>
  e93261:	48 89 df             	mov    rdi,rbx
  e93264:	e8 fb 98 c2 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
  e93269:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
  e93270:	00
  e93271:	e8 f4 6c be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e93276:	48 8d 1d 63 b6 97 00 	lea    rbx,[rip+0x97b663]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
  e9327d:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
  e93281:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e93284:	48 8d 35 06 0b 54 ff 	lea    rsi,[rip+0xffffffffff540b06]        # 3d3d91 <_ZTSN5boost17bad_function_callE@@Base+0x10d7>
  e9328b:	48 8d 0d 0e 0b 54 ff 	lea    rcx,[rip+0xffffffffff540b0e]        # 3d3da0 <_ZTSN5boost17bad_function_callE@@Base+0x10e6>
  e93292:	6a 0b                	push   0xb
  e93294:	5a                   	pop    rdx
  e93295:	6a 17                	push   0x17
  e93297:	41 58                	pop    r8
  e93299:	45 31 c9             	xor    r9d,r9d
  e9329c:	e8 e9 40 75 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
```
## Local refs to key owner fields and receiver stack slots

| addr | instruction |
|---:|---|
| `0xe8d984` | `e8d984:	66 0f 7f 84 24 10 04 	movdqa XMMWORD PTR [rsp+0x410],xmm0` |
| `0xe8e13b` | `e8e13b:	48 8b bc 24 98 03 00 	mov    rdi,QWORD PTR [rsp+0x398]` |
| `0xe8e74a` | `e8e74a:	48 8b bc 24 98 03 00 	mov    rdi,QWORD PTR [rsp+0x398]` |
| `0xe8fcb9` | `e8fcb9:	48 8d 84 24 10 04 00 	lea    rax,[rsp+0x410]` |
| `0xe91261` | `e91261:	4c 8d ac 24 10 04 00 	lea    r13,[rsp+0x410]` |
| `0xe91290` | `e91290:	48 8b 94 24 10 04 00 	mov    rdx,QWORD PTR [rsp+0x410]` |
| `0xe912bc` | `e912bc:	48 8b bc 24 10 04 00 	mov    rdi,QWORD PTR [rsp+0x410]` |
| `0xe91355` | `e91355:	48 8d bc 24 98 03 00 	lea    rdi,[rsp+0x398]` |
| `0xe92acd` | `e92acd:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]` |
| `0xe92f6b` | `e92f6b:	48 8d bc 24 90 03 00 	lea    rdi,[rsp+0x390]` |
| `0xe92f78` | `e92f78:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]` |
| `0xe92f9b` | `e92f9b:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]` |
| `0xe92fb7` | `e92fb7:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]` |
| `0xe92fd5` | `e92fd5:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]` |
| `0xe92ffa` | `e92ffa:	88 84 24 10 04 00 00 	mov    BYTE PTR [rsp+0x410],al` |
| `0xe93091` | `e93091:	49 8b 85 70 05 00 00 	mov    rax,QWORD PTR [r13+0x570]` |
| `0xe930b3` | `e930b3:	4d 8b bd 10 04 00 00 	mov    r15,QWORD PTR [r13+0x410]` |
| `0xe930dd` | `e930dd:	4c 8b b4 24 90 03 00 	mov    r14,QWORD PTR [rsp+0x390]` |
| `0xe930e5` | `e930e5:	48 8b 84 24 98 03 00 	mov    rax,QWORD PTR [rsp+0x398]` |
| `0xe932b6` | `e932b6:	49 8b 85 70 05 00 00 	mov    rax,QWORD PTR [r13+0x570]` |
| `0xe9344e` | `e9344e:	4c 8b b4 24 90 03 00 	mov    r14,QWORD PTR [rsp+0x390]` |
| `0xe93456` | `e93456:	48 8b 84 24 98 03 00 	mov    rax,QWORD PTR [rsp+0x398]` |
| `0xe947a4` | `e947a4:	4d 8b bd 70 05 00 00 	mov    r15,QWORD PTR [r13+0x570]` |
| `0xe95091` | `e95091:	4c 8b b4 24 90 03 00 	mov    r14,QWORD PTR [rsp+0x390]` |
| `0xe95099` | `e95099:	48 8b 84 24 98 03 00 	mov    rax,QWORD PTR [rsp+0x398]` |
| `0xe95190` | `e95190:	49 8b 85 70 05 00 00 	mov    rax,QWORD PTR [r13+0x570]` |

## Local r13 assignment / base-tracking rows

| addr | instruction |
|---:|---|
| `0xe8d04d` | `e8d04d:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe8d0ed` | `e8d0ed:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe8d12e` | `e8d12e:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe8d2b2` | `e8d2b2:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]` |
| `0xe8d2e0` | `e8d2e0:	41 bd 00 00 00 00    	mov    r13d,0x0` |
| `0xe8d302` | `e8d302:	41 5d                	pop    r13` |
| `0xe8d31a` | `e8d31a:	41 bd 00 00 00 00    	mov    r13d,0x0` |
| `0xe8d338` | `e8d338:	44 0f b6 e8          	movzx  r13d,al` |
| `0xe8d400` | `e8d400:	41 8d 45 ff          	lea    eax,[r13-0x1]` |
| `0xe8d4a4` | `e8d4a4:	4c 8d ac 24 e8 04 00 	lea    r13,[rsp+0x4e8]` |
| `0xe8d4af` | `e8d4af:	4c 89 ee             	mov    rsi,r13` |
| `0xe8d4cd` | `e8d4cd:	4c 89 ef             	mov    rdi,r13` |
| `0xe8d505` | `e8d505:	4c 8b ac 24 88 00 00 	mov    r13,QWORD PTR [rsp+0x88]` |
| `0xe8d6b2` | `e8d6b2:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]` |
| `0xe8d6b6` | `e8d6b6:	4c 89 ef             	mov    rdi,r13` |
| `0xe8d7af` | `e8d7af:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]` |
| `0xe8d7b3` | `e8d7b3:	4c 89 ef             	mov    rdi,r13` |
| `0xe8d7b9` | `e8d7b9:	49 89 c5             	mov    r13,rax` |
| `0xe8d7f0` | `e8d7f0:	4d 89 6f 28          	mov    QWORD PTR [r15+0x28],r13` |
| `0xe8d82d` | `e8d82d:	4c 8b ac 24 f8 00 00 	mov    r13,QWORD PTR [rsp+0xf8]` |
| `0xe8d877` | `e8d877:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]` |
| `0xe8d87b` | `e8d87b:	4c 89 ef             	mov    rdi,r13` |
| `0xe8d88d` | `e8d88d:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]` |
| `0xe8d891` | `e8d891:	4c 89 ef             	mov    rdi,r13` |
| `0xe8d8a3` | `e8d8a3:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]` |
| `0xe8d8a7` | `e8d8a7:	4c 89 ef             	mov    rdi,r13` |
| `0xe8d8be` | `e8d8be:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]` |
| `0xe8d8c2` | `e8d8c2:	4c 89 ef             	mov    rdi,r13` |
| `0xe8d8d9` | `e8d8d9:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]` |
| `0xe8d8dd` | `e8d8dd:	4c 89 ef             	mov    rdi,r13` |
| `0xe8d9a3` | `e8d9a3:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]` |
| `0xe8d9a7` | `e8d9a7:	4c 89 ef             	mov    rdi,r13` |
| `0xe8d9b9` | `e8d9b9:	4c 8d ac 24 48 04 00 	lea    r13,[rsp+0x448]` |
| `0xe8da46` | `e8da46:	41 55                	push   r13` |
| `0xe8df11` | `e8df11:	4d 8b ae f8 00 00 00 	mov    r13,QWORD PTR [r14+0xf8]` |
| `0xe8e078` | `e8e078:	49 8b bd b8 00 00 00 	mov    rdi,QWORD PTR [r13+0xb8]` |
| `0xe8e07f` | `e8e07f:	49 89 9d b8 00 00 00 	mov    QWORD PTR [r13+0xb8],rbx` |
| `0xe8e290` | `e8e290:	41 5d                	pop    r13` |
| `0xe8ed05` | `e8ed05:	41 55                	push   r13` |
| `0xe8ed41` | `e8ed41:	4c 8d 6f 10          	lea    r13,[rdi+0x10]` |
| `0xe8ed91` | `e8ed91:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13` |
| `0xe8ed96` | `e8ed96:	4c 89 e9             	mov    rcx,r13` |
| `0xe8ed9e` | `e8ed9e:	4d 8b 6e 10          	mov    r13,QWORD PTR [r14+0x10]` |
| `0xe8eda2` | `e8eda2:	4d 89 ec             	mov    r12,r13` |
| `0xe8edae` | `e8edae:	4c 89 ef             	mov    rdi,r13` |
| `0xe8ede5` | `e8ede5:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]` |
| `0xe8edea` | `e8edea:	4c 89 ef             	mov    rdi,r13` |
| `0xe8ee0c` | `e8ee0c:	4c 89 ac 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r13` |
| `0xe8ee29` | `e8ee29:	41 bd 80 00 00 00    	mov    r13d,0x80` |
| `0xe8eeb4` | `e8eeb4:	4c 89 ef             	mov    rdi,r13` |
| `0xe8eec7` | `e8eec7:	49 89 c5             	mov    r13,rax` |
| `0xe8eee8` | `e8eee8:	4d 89 c5             	mov    r13,r8` |
| `0xe8eef9` | `e8eef9:	4d 89 ec             	mov    r12,r13` |
| `0xe8eeff` | `e8eeff:	4c 89 ed             	mov    rbp,r13` |
| `0xe8ef0d` | `e8ef0d:	4c 89 ed             	mov    rbp,r13` |
| `0xe8ef38` | `e8ef38:	4d 89 ee             	mov    r14,r13` |
| `0xe8ef5a` | `e8ef5a:	4c 89 ee             	mov    rsi,r13` |
| `0xe8efb2` | `e8efb2:	41 5d                	pop    r13` |
| `0xe8efd1` | `e8efd1:	4c 89 6f 10          	mov    QWORD PTR [rdi+0x10],r13` |
| `0xe8f0fc` | `e8f0fc:	41 55                	push   r13` |
| `0xe8f15b` | `e8f15b:	49 89 e5             	mov    r13,rsp` |
| `0xe8f15e` | `e8f15e:	4c 89 ef             	mov    rdi,r13` |
| `0xe8f16c` | `e8f16c:	4d 8b 7d 10          	mov    r15,QWORD PTR [r13+0x10]` |
| `0xe8f17f` | `e8f17f:	4d 89 7d 10          	mov    QWORD PTR [r13+0x10],r15` |
| `0xe8f186` | `e8f186:	4c 89 ee             	mov    rsi,r13` |
| `0xe8f192` | `e8f192:	4c 89 ef             	mov    rdi,r13` |
| `0xe8f1b5` | `e8f1b5:	41 5d                	pop    r13` |
| `0xe8fad5` | `e8fad5:	41 55                	push   r13` |
| `0xe8fb49` | `e8fb49:	4c 8b 6f 08          	mov    r13,QWORD PTR [rdi+0x8]` |
| `0xe900b5` | `e900b5:	4c 8b ac 24 d8 0b 00 	mov    r13,QWORD PTR [rsp+0xbd8]` |
| `0xe90102` | `e90102:	4c 89 ac 24 f0 07 00 	mov    QWORD PTR [rsp+0x7f0],r13` |
| `0xe901b8` | `e901b8:	4c 8b ac 24 00 0a 00 	mov    r13,QWORD PTR [rsp+0xa00]` |
| `0xe901c0` | `e901c0:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe901e1` | `e901e1:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe90202` | `e90202:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe90236` | `e90236:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe90260` | `e90260:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe90288` | `e90288:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe902a9` | `e902a9:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe902c9` | `e902c9:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe902ea` | `e902ea:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe9030b` | `e9030b:	49 8b 5d 00          	mov    rbx,QWORD PTR [r13+0x0]` |
| `0xe904f2` | `e904f2:	4c 8d ac 24 f0 01 00 	lea    r13,[rsp+0x1f0]` |
| `0xe90505` | `e90505:	4c 89 ef             	mov    rdi,r13` |
| `0xe90550` | `e90550:	41 55                	push   r13` |
| `0xe9055b` | `e9055b:	4c 89 ef             	mov    rdi,r13` |
| `0xe90563` | `e90563:	4c 8b ac 24 00 0a 00 	mov    r13,QWORD PTR [rsp+0xa00]` |
| `0xe9056b` | `e9056b:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe9058c` | `e9058c:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe905ad` | `e905ad:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe905ce` | `e905ce:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe905f2` | `e905f2:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe90613` | `e90613:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe90636` | `e90636:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe90657` | `e90657:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe90678` | `e90678:	4d 8b 65 00          	mov    r12,QWORD PTR [r13+0x0]` |
| `0xe906a0` | `e906a0:	4c 8d ac 24 f0 01 00 	lea    r13,[rsp+0x1f0]` |
| `0xe906b3` | `e906b3:	4c 89 ef             	mov    rdi,r13` |
| `0xe906fd` | `e906fd:	41 55                	push   r13` |
| `0xe90708` | `e90708:	4c 89 ef             	mov    rdi,r13` |
| `0xe909ff` | `e909ff:	41 bd 10 27 00 00    	mov    r13d,0x2710` |
| `0xe90a74` | `e90a74:	41 55                	push   r13` |
| `0xe90ad7` | `e90ad7:	41 5d                	pop    r13` |
| `0xe90adc` | `e90adc:	4d 89 e8             	mov    r8,r13` |
| `0xe90c4c` | `e90c4c:	4d 89 e8             	mov    r8,r13` |
| `0xe90c6c` | `e90c6c:	4d 89 e8             	mov    r8,r13` |
| `0xe91144` | `e91144:	41 5d                	pop    r13` |
| `0xe91149` | `e91149:	4d 89 e8             	mov    r8,r13` |
| `0xe911ae` | `e911ae:	4d 89 e8             	mov    r8,r13` |
| `0xe91261` | `e91261:	4c 8d ac 24 10 04 00 	lea    r13,[rsp+0x410]` |
| `0xe912b4` | `e912b4:	4c 89 ef             	mov    rdi,r13` |
| `0xe912cd` | `e912cd:	66 41 0f 7f 45 00    	movdqa XMMWORD PTR [r13+0x0],xmm0` |
| `0xe912e4` | `e912e4:	4c 89 ef             	mov    rdi,r13` |
| `0xe9131e` | `e9131e:	4c 89 ef             	mov    rdi,r13` |
| `0xe9133e` | `e9133e:	4c 89 ef             	mov    rdi,r13` |
| `0xe91564` | `e91564:	49 89 c5             	mov    r13,rax` |
| `0xe9188e` | `e9188e:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13` |
| `0xe918bc` | `e918bc:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]` |
| `0xe918c3` | `e918c3:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]` |
| `0xe918c8` | `e918c8:	49 8b 5d 50          	mov    rbx,QWORD PTR [r13+0x50]` |
| `0xe91914` | `e91914:	49 8d 9d 88 00 00 00 	lea    rbx,[r13+0x88]` |
| `0xe91a30` | `e91a30:	4c 8b 6c 24 60       	mov    r13,QWORD PTR [rsp+0x60]` |
| `0xe91b2d` | `e91b2d:	49 8b 4d 00          	mov    rcx,QWORD PTR [r13+0x0]` |
| `0xe91b52` | `e91b52:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]` |
| `0xe91bda` | `e91bda:	49 8b 55 00          	mov    rdx,QWORD PTR [r13+0x0]` |
| `0xe91c05` | `e91c05:	49 8b 55 08          	mov    rdx,QWORD PTR [r13+0x8]` |
| `0xe91ce3` | `e91ce3:	4c 8b 6b 20          	mov    r13,QWORD PTR [rbx+0x20]` |
| `0xe91d1e` | `e91d1e:	4d 8b 75 00          	mov    r14,QWORD PTR [r13+0x0]` |
| `0xe92153` | `e92153:	4d 8d ac 24 e0 00 00 	lea    r13,[r12+0xe0]` |
| `0xe92163` | `e92163:	4c 89 ef             	mov    rdi,r13` |
| `0xe924ad` | `e924ad:	41 5d                	pop    r13` |
| `0xe9265e` | `e9265e:	4c 89 ef             	mov    rdi,r13` |
| `0xe927d4` | `e927d4:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]` |
| `0xe92c8f` | `e92c8f:	41 55                	push   r13` |
| `0xe92cac` | `e92cac:	4c 8b 6f 08          	mov    r13,QWORD PTR [rdi+0x8]` |
| `0xe92cb9` | `e92cb9:	4c 89 29             	mov    QWORD PTR [rcx],r13` |
| `0xe92cbf` | `e92cbf:	4c 89 2a             	mov    QWORD PTR [rdx],r13` |
| `0xe92ce3` | `e92ce3:	4d 89 ec             	mov    r12,r13` |
| `0xe92d08` | `e92d08:	4d 89 ec             	mov    r12,r13` |
| `0xe92d34` | `e92d34:	41 5d                	pop    r13` |
| `0xe92d49` | `e92d49:	4c 89 6b 08          	mov    QWORD PTR [rbx+0x8],r13` |
| `0xe92f31` | `e92f31:	41 55                	push   r13` |
| `0xe92f4d` | `e92f4d:	49 89 f5             	mov    r13,rsi` |
| `0xe92f78` | `e92f78:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]` |
| `0xe92f9b` | `e92f9b:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]` |
| `0xe92fb7` | `e92fb7:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]` |
| `0xe92fd5` | `e92fd5:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]` |
| `0xe93091` | `e93091:	49 8b 85 70 05 00 00 	mov    rax,QWORD PTR [r13+0x570]` |
| `0xe930a8` | `e930a8:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13` |
| `0xe930b3` | `e930b3:	4d 8b bd 10 04 00 00 	mov    r15,QWORD PTR [r13+0x410]` |
| `0xe931a0` | `e931a0:	4c 8d ac 24 10 0e 00 	lea    r13,[rsp+0xe10]` |
| `0xe931a8` | `e931a8:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]` |
| `0xe931b1` | `e931b1:	4d 89 75 00          	mov    QWORD PTR [r13+0x0],r14` |
| `0xe931b5` | `e931b5:	49 89 5d 08          	mov    QWORD PTR [r13+0x8],rbx` |
| `0xe931b9` | `e931b9:	4d 89 7d 10          	mov    QWORD PTR [r13+0x10],r15` |
| `0xe931e1` | `e931e1:	4d 89 e8             	mov    r8,r13` |
| `0xe93210` | `e93210:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]` |
| `0xe9324a` | `e9324a:	49 8d bd e0 03 00 00 	lea    rdi,[r13+0x3e0]` |
| `0xe9327d` | `e9327d:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]` |
| `0xe932b6` | `e932b6:	49 8b 85 70 05 00 00 	mov    rax,QWORD PTR [r13+0x570]` |
| `0xe932e1` | `e932e1:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]` |
| `0xe932e5` | `e932e5:	4d 8b a5 e8 00 00 00 	mov    r12,QWORD PTR [r13+0xe8]` |
| `0xe9331c` | `e9331c:	4c 63 ed             	movsxd r13,ebp` |
| `0xe93353` | `e93353:	4d 89 ae 90 00 00 00 	mov    QWORD PTR [r14+0x90],r13` |
| `0xe933f3` | `e933f3:	4c 8d 6b 08          	lea    r13,[rbx+0x8]` |
| `0xe935a2` | `e935a2:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]` |
| `0xe935dc` | `e935dc:	49 8d bd e0 03 00 00 	lea    rdi,[r13+0x3e0]` |
| `0xe935fb` | `e935fb:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]` |
| `0xe93654` | `e93654:	f3 41 0f 6f 85 a8 04 	movdqu xmm0,XMMWORD PTR [r13+0x4a8]` |
| `0xe9365d` | `e9365d:	49 8b 85 b0 04 00 00 	mov    rax,QWORD PTR [r13+0x4b0]` |
| `0xe9366e` | `e9366e:	4d 8d 6e 18          	lea    r13,[r14+0x18]` |
| `0xe936d2` | `e936d2:	4d 89 28             	mov    QWORD PTR [r8],r13` |
| `0xe937b0` | `e937b0:	4c 89 6b 30          	mov    QWORD PTR [rbx+0x30],r13` |
| `0xe9380c` | `e9380c:	4c 8b 6b 20          	mov    r13,QWORD PTR [rbx+0x20]` |
| `0xe93820` | `e93820:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]` |
| `0xe9382c` | `e9382c:	4c 89 ee             	mov    rsi,r13` |
| `0xe93835` | `e93835:	4c 8d ac 24 30 0a 00 	lea    r13,[rsp+0xa30]` |
| `0xe93840` | `e93840:	4c 89 ee             	mov    rsi,r13` |
| `0xe93848` | `e93848:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]` |
| `0xe9385e` | `e9385e:	4c 8b 6b 30          	mov    r13,QWORD PTR [rbx+0x30]` |
| `0xe9387a` | `e9387a:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]` |
| `0xe93886` | `e93886:	4c 89 ee             	mov    rsi,r13` |
| `0xe938d5` | `e938d5:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]` |
| `0xe9394b` | `e9394b:	49 8b 9d 40 04 00 00 	mov    rbx,QWORD PTR [r13+0x440]` |
| `0xe93952` | `e93952:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]` |
| `0xe93a88` | `e93a88:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]` |
| `0xe93ab3` | `e93ab3:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]` |
| `0xe93ad5` | `e93ad5:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]` |
| `0xe93ae1` | `e93ae1:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]` |
| `0xe93af5` | `e93af5:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]` |
| `0xe93b31` | `e93b31:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]` |
| `0xe93b56` | `e93b56:	4d 89 ec             	mov    r12,r13` |
| `0xe93b59` | `e93b59:	41 89 c5             	mov    r13d,eax` |
| `0xe93eec` | `e93eec:	49 89 d5             	mov    r13,rdx` |
| `0xe93faa` | `e93faa:	4c 89 ad 20 01 00 00 	mov    QWORD PTR [rbp+0x120],r13` |
| `0xe93ff0` | `e93ff0:	4c 8b 6c 24 38       	mov    r13,QWORD PTR [rsp+0x38]` |
| `0xe93ff5` | `e93ff5:	4d 89 28             	mov    QWORD PTR [r8],r13` |
| `0xe9406e` | `e9406e:	4d 89 28             	mov    QWORD PTR [r8],r13` |
| `0xe9411f` | `e9411f:	4d 89 28             	mov    QWORD PTR [r8],r13` |
| `0xe942dc` | `e942dc:	4c 89 ac 24 70 03 00 	mov    QWORD PTR [rsp+0x370],r13` |
| `0xe9430f` | `e9430f:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]` |
| `0xe94314` | `e94314:	41 0f 10 85 38 01 00 	movups xmm0,XMMWORD PTR [r13+0x138]` |
| `0xe94324` | `e94324:	49 8b 85 40 01 00 00 	mov    rax,QWORD PTR [r13+0x140]` |
| `0xe9433d` | `e9433d:	f3 41 0f 6f 85 c8 00 	movdqu xmm0,XMMWORD PTR [r13+0xc8]` |
| `0xe9434f` | `e9434f:	49 8b 85 d0 00 00 00 	mov    rax,QWORD PTR [r13+0xd0]` |
| `0xe94365` | `e94365:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe9475b` | `e9475b:	49 8b 85 28 04 00 00 	mov    rax,QWORD PTR [r13+0x428]` |
| `0xe94762` | `e94762:	49 8b 8d 98 05 00 00 	mov    rcx,QWORD PTR [r13+0x598]` |
| `0xe94787` | `e94787:	49 8b b5 b8 03 00 00 	mov    rsi,QWORD PTR [r13+0x3b8]` |
| `0xe947a4` | `e947a4:	4d 8b bd 70 05 00 00 	mov    r15,QWORD PTR [r13+0x570]` |
| `0xe94945` | `e94945:	49 8d 8d 70 04 00 00 	lea    rcx,[r13+0x470]` |
| `0xe9498c` | `e9498c:	49 8b 9d e8 00 00 00 	mov    rbx,QWORD PTR [r13+0xe8]` |
| `0xe949d9` | `e949d9:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]` |
| `0xe94a1e` | `e94a1e:	49 8b 9d 78 05 00 00 	mov    rbx,QWORD PTR [r13+0x578]` |
| `0xe94a86` | `e94a86:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]` |
| `0xe94a96` | `e94a96:	49 8b 5d 18          	mov    rbx,QWORD PTR [r13+0x18]` |
| `0xe94afb` | `e94afb:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]` |
| `0xe94b23` | `e94b23:	49 8b 5d 18          	mov    rbx,QWORD PTR [r13+0x18]` |
| `0xe94b27` | `e94b27:	4d 8b b5 78 05 00 00 	mov    r14,QWORD PTR [r13+0x578]` |
| `0xe94c52` | `e94c52:	4c 8b 2d 47 ce a1 00 	mov    r13,QWORD PTR [rip+0xa1ce47]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>` |
| `0xe94c59` | `e94c59:	4c 89 68 08          	mov    QWORD PTR [rax+0x8],r13` |
| `0xe94c94` | `e94c94:	4c 89 ac 24 e8 0b 00 	mov    QWORD PTR [rsp+0xbe8],r13` |
| `0xe94e63` | `e94e63:	4c 8d ac 24 10 0e 00 	lea    r13,[rsp+0xe10]` |
| `0xe94e73` | `e94e73:	4c 89 ef             	mov    rdi,r13` |
| `0xe94ec5` | `e94ec5:	4c 89 ee             	mov    rsi,r13` |
| `0xe94ef6` | `e94ef6:	4d 8d 6c 24 20       	lea    r13,[r12+0x20]` |
| `0xe94fa8` | `e94fa8:	4c 89 ac 24 e8 0b 00 	mov    QWORD PTR [rsp+0xbe8],r13` |
| `0xe94fe3` | `e94fe3:	4c 89 ac 24 38 0a 00 	mov    QWORD PTR [rsp+0xa38],r13` |
| `0xe9502b` | `e9502b:	66 49 0f 6e cd       	movq   xmm1,r13` |
| `0xe9510b` | `e9510b:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]` |
| `0xe95151` | `e95151:	49 8d bd f8 03 00 00 	lea    rdi,[r13+0x3f8]` |
| `0xe95190` | `e95190:	49 8b 85 70 05 00 00 	mov    rax,QWORD PTR [r13+0x570]` |
| `0xe95285` | `e95285:	49 89 c5             	mov    r13,rax` |
| `0xe952af` | `e952af:	4c 89 ef             	mov    rdi,r13` |
| `0xe952cb` | `e952cb:	4c 8d 6b 18          	lea    r13,[rbx+0x18]` |
| `0xe9530a` | `e9530a:	4d 89 28             	mov    QWORD PTR [r8],r13` |
| `0xe953bf` | `e953bf:	4d 89 28             	mov    QWORD PTR [r8],r13` |
| `0xe95545` | `e95545:	66 49 0f 6e cd       	movq   xmm1,r13` |
| `0xe95588` | `e95588:	49 89 c5             	mov    r13,rax` |

## Windows around all local key refs

### `0xe8d984`

```text
  e8d90a:	00 00
  e8d90c:	66 0f 7f 84 24 40 04 	movdqa XMMWORD PTR [rsp+0x440],xmm0
  e8d913:	00 00
  e8d915:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
  e8d91c:	48 85 c0             	test   rax,rax
  e8d91f:	74 05                	je     e8d926 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54d3c>
  e8d921:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e8d926:	48 89 5c 24 60       	mov    QWORD PTR [rsp+0x60],rbx
  e8d92b:	48 89 84 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rax
  e8d932:	00
  e8d933:	48 8b bc 24 a8 01 00 	mov    rdi,QWORD PTR [rsp+0x1a8]
  e8d93a:	00
  e8d93b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8d93e:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e8d941:	49 89 c7             	mov    r15,rax
  e8d944:	4c 89 e3             	mov    rbx,r12
  e8d947:	48 8b 6c 24 18       	mov    rbp,QWORD PTR [rsp+0x18]
  e8d94c:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
  e8d950:	48 8d bc 24 30 04 00 	lea    rdi,[rsp+0x430]
  e8d957:	00
  e8d958:	48 89 ee             	mov    rsi,rbp
  e8d95b:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d95e:	4c 8b a4 24 30 04 00 	mov    r12,QWORD PTR [rsp+0x430]
  e8d965:	00
  e8d966:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
  e8d96a:	48 89 ee             	mov    rsi,rbp
  e8d96d:	48 8d ac 24 20 04 00 	lea    rbp,[rsp+0x420]
  e8d974:	00
  e8d975:	48 89 ef             	mov    rdi,rbp
  e8d978:	ff 50 50             	call   QWORD PTR [rax+0x50]
  e8d97b:	66 0f 6f 84 24 00 01 	movdqa xmm0,XMMWORD PTR [rsp+0x100]
  e8d982:	00 00
  e8d984:	66 0f 7f 84 24 10 04 	movdqa XMMWORD PTR [rsp+0x410],xmm0
  e8d98b:	00 00
  e8d98d:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
  e8d994:	48 85 c0             	test   rax,rax
  e8d997:	74 05                	je     e8d99e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54db4>
  e8d999:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e8d99e:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  e8d9a3:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d9a7:	4c 89 ef             	mov    rdi,r13
  e8d9aa:	ff 50 68             	call   QWORD PTR [rax+0x68]
  e8d9ad:	48 83 ec 08          	sub    rsp,0x8
  e8d9b1:	4c 8d 94 24 18 04 00 	lea    r10,[rsp+0x418]
  e8d9b8:	00
  e8d9b9:	4c 8d ac 24 48 04 00 	lea    r13,[rsp+0x448]
  e8d9c0:	00
  e8d9c1:	44 0f b6 9c 24 c8 00 	movzx  r11d,BYTE PTR [rsp+0xc8]
  e8d9c8:	00 00
  e8d9ca:	48 8d bc 24 48 06 00 	lea    rdi,[rsp+0x648]
  e8d9d1:	00
  e8d9d2:	4c 8b 84 24 80 00 00 	mov    r8,QWORD PTR [rsp+0x80]
  e8d9d9:	00
  e8d9da:	4c 8b 8c 24 80 01 00 	mov    r9,QWORD PTR [rsp+0x180]
  e8d9e1:	00
  e8d9e2:	48 8b b4 24 90 01 00 	mov    rsi,QWORD PTR [rsp+0x190]
  e8d9e9:	00
  e8d9ea:	48 8b 94 24 a0 00 00 	mov    rdx,QWORD PTR [rsp+0xa0]
  e8d9f1:	00
  e8d9f2:	48 8b 4c 24 50       	mov    rcx,QWORD PTR [rsp+0x50]
  e8d9f7:	50                   	push   rax
  e8d9f8:	ff b4 24 d8 00 00 00 	push   QWORD PTR [rsp+0xd8]
  e8d9ff:	41 52                	push   r10
  e8da01:	ff b4 24 f8 00 00 00 	push   QWORD PTR [rsp+0xf8]
  e8da08:	ff b4 24 c8 00 00 00 	push   QWORD PTR [rsp+0xc8]
  e8da0f:	ff b4 24 10 01 00 00 	push   QWORD PTR [rsp+0x110]
  e8da16:	48 8d 84 24 18 02 00 	lea    rax,[rsp+0x218]
  e8da1d:	00
  e8da1e:	50                   	push   rax
  e8da1f:	55                   	push   rbp
  e8da20:	41 54                	push   r12
  e8da22:	41 57                	push   r15
  e8da24:	48 8d 84 24 b0 03 00 	lea    rax,[rsp+0x3b0]
  e8da2b:	00
  e8da2c:	50                   	push   rax
  e8da2d:	48 8d 84 24 20 02 00 	lea    rax,[rsp+0x220]
  e8da34:	00
  e8da35:	50                   	push   rax
  e8da36:	48 8d 84 24 f8 02 00 	lea    rax,[rsp+0x2f8]
  e8da3d:	00
  e8da3e:	50                   	push   rax
  e8da3f:	ff b4 24 c0 00 00 00 	push   QWORD PTR [rsp+0xc0]
  e8da46:	41 55                	push   r13
  e8da48:	ff b4 24 c0 01 00 00 	push   QWORD PTR [rsp+0x1c0]
  e8da4f:	48 8d 84 24 38 05 00 	lea    rax,[rsp+0x538]
  e8da56:	00
  e8da57:	50                   	push   rax
  e8da58:	ff b4 24 c0 00 00 00 	push   QWORD PTR [rsp+0xc0]
  e8da5f:	ff b4 24 e0 01 00 00 	push   QWORD PTR [rsp+0x1e0]
  e8da66:	48 8d 84 24 30 04 00 	lea    rax,[rsp+0x430]
  e8da6d:	00
  e8da6e:	50                   	push   rax
  e8da6f:	ff b4 24 30 01 00 00 	push   QWORD PTR [rsp+0x130]
  e8da76:	ff b4 24 40 01 00 00 	push   QWORD PTR [rsp+0x140]
  e8da7d:	ff b4 24 18 01 00 00 	push   QWORD PTR [rsp+0x118]
  e8da84:	53                   	push   rbx
  e8da85:	48 8d 84 24 18 05 00 	lea    rax,[rsp+0x518]
  e8da8c:	00
  e8da8d:	50                   	push   rax
  e8da8e:	48 8d 84 24 30 05 00 	lea    rax,[rsp+0x530]
  e8da95:	00
  e8da96:	50                   	push   rax
  e8da97:	48 8d 84 24 48 04 00 	lea    rax,[rsp+0x448]
  e8da9e:	00
  e8da9f:	50                   	push   rax
  e8daa0:	48 8d 84 24 60 04 00 	lea    rax,[rsp+0x460]
  e8daa7:	00
```
### `0xe8e13b`

```text
  e8e0ad:	e8 de fd 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e8e0b2:	48 8d bc 24 f0 03 00 	lea    rdi,[rsp+0x3f0]
  e8e0b9:	00
  e8e0ba:	e8 d1 fd 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e8e0bf:	48 8d bc 24 d8 03 00 	lea    rdi,[rsp+0x3d8]
  e8e0c6:	00
  e8e0c7:	e8 c4 fd 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e8e0cc:	48 8b bc 24 b8 04 00 	mov    rdi,QWORD PTR [rsp+0x4b8]
  e8e0d3:	00
  e8e0d4:	e8 ad 03 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e0d9:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  e8e0de:	e8 a3 03 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e0e3:	48 8b bc 24 c8 04 00 	mov    rdi,QWORD PTR [rsp+0x4c8]
  e8e0ea:	00
  e8e0eb:	e8 96 03 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e0f0:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
  e8e0f7:	00
  e8e0f8:	e8 27 09 00 00       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
  e8e0fd:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  e8e102:	e8 7f 03 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e107:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]
  e8e10e:	00
  e8e10f:	e8 72 03 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e114:	48 8b bc 24 78 03 00 	mov    rdi,QWORD PTR [rsp+0x378]
  e8e11b:	00
  e8e11c:	e8 65 03 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e121:	48 8b bc 24 88 03 00 	mov    rdi,QWORD PTR [rsp+0x388]
  e8e128:	00
  e8e129:	e8 58 03 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e12e:	48 8b bc 24 38 01 00 	mov    rdi,QWORD PTR [rsp+0x138]
  e8e135:	00
  e8e136:	e8 4b 03 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e13b:	48 8b bc 24 98 03 00 	mov    rdi,QWORD PTR [rsp+0x398]
  e8e142:	00
  e8e143:	e8 3e 03 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e148:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
  e8e14f:	00
  e8e150:	e8 15 be be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e8e155:	48 8b 9c 24 a0 01 00 	mov    rbx,QWORD PTR [rsp+0x1a0]
  e8e15c:	00
  e8e15d:	4c 89 33             	mov    QWORD PTR [rbx],r14
  e8e160:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
  e8e167:	00
  e8e168:	e8 19 03 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e16d:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
  e8e174:	00
  e8e175:	e8 96 49 c6 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
  e8e17a:	48 8b bc 24 98 02 00 	mov    rdi,QWORD PTR [rsp+0x298]
  e8e181:	00
  e8e182:	e8 ff 02 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e187:	48 8b bc 24 a8 02 00 	mov    rdi,QWORD PTR [rsp+0x2a8]
  e8e18e:	00
  e8e18f:	e8 f2 02 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e194:	48 8b bc 24 b8 02 00 	mov    rdi,QWORD PTR [rsp+0x2b8]
  e8e19b:	00
  e8e19c:	e8 e5 02 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e1a1:	48 8b bc 24 c8 02 00 	mov    rdi,QWORD PTR [rsp+0x2c8]
  e8e1a8:	00
  e8e1a9:	e8 d8 02 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e1ae:	48 8b bc 24 d8 02 00 	mov    rdi,QWORD PTR [rsp+0x2d8]
  e8e1b5:	00
  e8e1b6:	e8 cb 02 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e1bb:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
  e8e1c2:	00
  e8e1c3:	e8 02 c1 be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e8e1c8:	48 8d bc 24 e8 02 00 	lea    rdi,[rsp+0x2e8]
  e8e1cf:	00
  e8e1d0:	e8 4f 08 00 00       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
  e8e1d5:	48 8d bc 24 00 05 00 	lea    rdi,[rsp+0x500]
  e8e1dc:	00
  e8e1dd:	e8 8c a0 cf ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
  e8e1e2:	48 8b bc 24 08 03 00 	mov    rdi,QWORD PTR [rsp+0x308]
  e8e1e9:	00
  e8e1ea:	e8 97 02 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e1ef:	48 8b bc 24 18 03 00 	mov    rdi,QWORD PTR [rsp+0x318]
  e8e1f6:	00
  e8e1f7:	48 83 a4 24 18 03 00 	and    QWORD PTR [rsp+0x318],0x0
  e8e1fe:	00 00
  e8e200:	48 85 ff             	test   rdi,rdi
  e8e203:	74 06                	je     e8e20b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55621>
  e8e205:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8e208:	ff 50 08             	call   QWORD PTR [rax+0x8]
  e8e20b:	48 8b bc 24 28 03 00 	mov    rdi,QWORD PTR [rsp+0x328]
  e8e212:	00
  e8e213:	e8 6e 02 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e218:	48 8b bc 24 38 03 00 	mov    rdi,QWORD PTR [rsp+0x338]
  e8e21f:	00
  e8e220:	e8 61 02 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e225:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
  e8e22c:	00
  e8e22d:	e8 38 bd be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e8e232:	48 8d bc 24 40 03 00 	lea    rdi,[rsp+0x340]
  e8e239:	00
  e8e23a:	e8 51 fc 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e8e23f:	48 8b bc 24 60 03 00 	mov    rdi,QWORD PTR [rsp+0x360]
  e8e246:	00
  e8e247:	e8 3a 02 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e24c:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
  e8e253:	00
  e8e254:	e8 11 bd be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e8e259:	48 8b bc 24 68 03 00 	mov    rdi,QWORD PTR [rsp+0x368]
  e8e260:	00
  e8e261:	48 85 ff             	test   rdi,rdi
  e8e264:	74 06                	je     e8e26c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55682>
  e8e266:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8e269:	ff 50 08             	call   QWORD PTR [rax+0x8]
  e8e26c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
```
### `0xe8e74a`

```text
  e8e6af:	e8 d2 fd c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e6b4:	48 8b bc 24 c8 04 00 	mov    rdi,QWORD PTR [rsp+0x4c8]
  e8e6bb:	00
  e8e6bc:	e8 c5 fd c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e6c1:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
  e8e6c8:	00
  e8e6c9:	e8 56 03 00 00       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
  e8e6ce:	49 8b be 40 01 00 00 	mov    rdi,QWORD PTR [r14+0x140]
  e8e6d5:	e8 ac fd c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e6da:	48 8b bc 24 30 01 00 	mov    rdi,QWORD PTR [rsp+0x130]
  e8e6e1:	00
  e8e6e2:	e8 41 b7 be ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
  e8e6e7:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  e8e6ec:	e8 55 85 62 00       	call   14b6c46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fc1ca>
  e8e6f1:	66 0f 6f 84 24 00 01 	movdqa xmm0,XMMWORD PTR [rsp+0x100]
  e8e6f8:	00 00
  e8e6fa:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  e8e701:	e8 80 fd c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e706:	66 0f 6f 84 24 20 01 	movdqa xmm0,XMMWORD PTR [rsp+0x120]
  e8e70d:	00 00
  e8e70f:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  e8e716:	e8 6b fd c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e71b:	48 8b bc 24 78 03 00 	mov    rdi,QWORD PTR [rsp+0x378]
  e8e722:	00
  e8e723:	e8 5e fd c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e728:	48 8b bc 24 88 03 00 	mov    rdi,QWORD PTR [rsp+0x388]
  e8e72f:	00
  e8e730:	e8 51 fd c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e735:	66 0f 6f 84 24 10 01 	movdqa xmm0,XMMWORD PTR [rsp+0x110]
  e8e73c:	00 00
  e8e73e:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  e8e745:	e8 3c fd c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e74a:	48 8b bc 24 98 03 00 	mov    rdi,QWORD PTR [rsp+0x398]
  e8e751:	00
  e8e752:	e8 2f fd c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e757:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
  e8e75e:	00
  e8e75f:	e8 06 b8 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e8e764:	4c 89 f7             	mov    rdi,r14
  e8e767:	e8 b4 f7 95 00       	call   17edf20 <_ZdlPv@plt>
  e8e76c:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
  e8e773:	00
  e8e774:	e8 0d fd c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e779:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
  e8e780:	00
  e8e781:	e8 8a 43 c6 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
  e8e786:	48 8b bc 24 98 02 00 	mov    rdi,QWORD PTR [rsp+0x298]
  e8e78d:	00
  e8e78e:	e8 f3 fc c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e793:	48 8b bc 24 a8 02 00 	mov    rdi,QWORD PTR [rsp+0x2a8]
  e8e79a:	00
  e8e79b:	e8 e6 fc c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e7a0:	48 8b bc 24 b8 02 00 	mov    rdi,QWORD PTR [rsp+0x2b8]
  e8e7a7:	00
  e8e7a8:	e8 d9 fc c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e7ad:	48 8b bc 24 c8 02 00 	mov    rdi,QWORD PTR [rsp+0x2c8]
  e8e7b4:	00
  e8e7b5:	e8 cc fc c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e7ba:	48 8b bc 24 d8 02 00 	mov    rdi,QWORD PTR [rsp+0x2d8]
  e8e7c1:	00
  e8e7c2:	e8 bf fc c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e7c7:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
  e8e7ce:	00
  e8e7cf:	e8 f6 ba be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e8e7d4:	48 8d bc 24 e8 02 00 	lea    rdi,[rsp+0x2e8]
  e8e7db:	00
  e8e7dc:	e8 43 02 00 00       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
  e8e7e1:	48 8d bc 24 00 05 00 	lea    rdi,[rsp+0x500]
  e8e7e8:	00
  e8e7e9:	e8 80 9a cf ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
  e8e7ee:	48 8b bc 24 08 03 00 	mov    rdi,QWORD PTR [rsp+0x308]
  e8e7f5:	00
  e8e7f6:	e8 8b fc c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e7fb:	48 8b bc 24 18 03 00 	mov    rdi,QWORD PTR [rsp+0x318]
  e8e802:	00
  e8e803:	48 83 a4 24 18 03 00 	and    QWORD PTR [rsp+0x318],0x0
  e8e80a:	00 00
  e8e80c:	48 85 ff             	test   rdi,rdi
  e8e80f:	74 06                	je     e8e817 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55c2d>
  e8e811:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8e814:	ff 50 08             	call   QWORD PTR [rax+0x8]
  e8e817:	48 8b bc 24 28 03 00 	mov    rdi,QWORD PTR [rsp+0x328]
  e8e81e:	00
  e8e81f:	e8 62 fc c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e824:	48 8b bc 24 38 03 00 	mov    rdi,QWORD PTR [rsp+0x338]
  e8e82b:	00
  e8e82c:	e8 55 fc c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e831:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
  e8e838:	00
  e8e839:	e8 2c b7 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e8e83e:	48 8d bc 24 40 03 00 	lea    rdi,[rsp+0x340]
  e8e845:	00
  e8e846:	e8 45 f6 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e8e84b:	48 8b bc 24 60 03 00 	mov    rdi,QWORD PTR [rsp+0x360]
  e8e852:	00
  e8e853:	e8 2e fc c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e858:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
  e8e85f:	00
  e8e860:	e8 05 b7 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e8e865:	48 8b bc 24 68 03 00 	mov    rdi,QWORD PTR [rsp+0x368]
  e8e86c:	00
  e8e86d:	48 85 ff             	test   rdi,rdi
  e8e870:	74 06                	je     e8e878 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55c8e>
  e8e872:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8e875:	ff 50 08             	call   QWORD PTR [rax+0x8]
  e8e878:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e8e87f:	00 00
```
### `0xe8fcb9`

```text
  e8fc3f:	00
  e8fc40:	48 8b 94 24 88 0a 00 	mov    rdx,QWORD PTR [rsp+0xa88]
  e8fc47:	00
  e8fc48:	48 8b b4 24 68 0a 00 	mov    rsi,QWORD PTR [rsp+0xa68]
  e8fc4f:	00
  e8fc50:	4c 8b 84 24 60 0a 00 	mov    r8,QWORD PTR [rsp+0xa60]
  e8fc57:	00
  e8fc58:	4c 8b 8c 24 58 0a 00 	mov    r9,QWORD PTR [rsp+0xa58]
  e8fc5f:	00
  e8fc60:	4c 8b 94 24 50 0a 00 	mov    r10,QWORD PTR [rsp+0xa50]
  e8fc67:	00
  e8fc68:	4c 8b 59 08          	mov    r11,QWORD PTR [rcx+0x8]
  e8fc6c:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
  e8fc6f:	0f 11 84 24 28 03 00 	movups XMMWORD PTR [rsp+0x328],xmm0
  e8fc76:	00
  e8fc77:	4d 85 db             	test   r11,r11
  e8fc7a:	74 05                	je     e8fc81 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57097>
  e8fc7c:	f0 49 ff 43 08       	lock inc QWORD PTR [r11+0x8]
  e8fc81:	48 8d 8c 24 60 03 00 	lea    rcx,[rsp+0x360]
  e8fc88:	00
  e8fc89:	4c 89 51 d8          	mov    QWORD PTR [rcx-0x28],r10
  e8fc8d:	4c 89 49 e0          	mov    QWORD PTR [rcx-0x20],r9
  e8fc91:	4c 89 41 e8          	mov    QWORD PTR [rcx-0x18],r8
  e8fc95:	48 89 71 f0          	mov    QWORD PTR [rcx-0x10],rsi
  e8fc99:	48 89 51 f8          	mov    QWORD PTR [rcx-0x8],rdx
  e8fc9d:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
  e8fca2:	88 41 31             	mov    BYTE PTR [rcx+0x31],al
  e8fca5:	0f 57 c0             	xorps  xmm0,xmm0
  e8fca8:	0f 11 41 38          	movups XMMWORD PTR [rcx+0x38],xmm0
  e8fcac:	48 83 61 70 00       	and    QWORD PTR [rcx+0x70],0x0
  e8fcb1:	48 83 a1 a0 00 00 00 	and    QWORD PTR [rcx+0xa0],0x0
  e8fcb8:	00
  e8fcb9:	48 8d 84 24 10 04 00 	lea    rax,[rsp+0x410]
  e8fcc0:	00
  e8fcc1:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
  e8fcc6:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
  e8fcc9:	48 8d b4 24 30 04 00 	lea    rsi,[rsp+0x430]
  e8fcd0:	00
  e8fcd1:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e8fcd5:	48 85 c0             	test   rax,rax
  e8fcd8:	74 10                	je     e8fcea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57100>
  e8fcda:	48 39 f8             	cmp    rax,rdi
  e8fcdd:	74 17                	je     e8fcf6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5710c>
  e8fcdf:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8fce2:	48 89 c7             	mov    rdi,rax
  e8fce5:	ff 51 10             	call   QWORD PTR [rcx+0x10]
  e8fce8:	eb 02                	jmp    e8fcec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57102>
  e8fcea:	31 c0                	xor    eax,eax
  e8fcec:	48 89 84 24 50 04 00 	mov    QWORD PTR [rsp+0x450],rax
  e8fcf3:	00
  e8fcf4:	eb 0e                	jmp    e8fd04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5711a>
  e8fcf6:	48 89 b4 24 50 04 00 	mov    QWORD PTR [rsp+0x450],rsi
  e8fcfd:	00
  e8fcfe:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8fd01:	ff 50 18             	call   QWORD PTR [rax+0x18]
  e8fd04:	48 8b b4 24 98 0a 00 	mov    rsi,QWORD PTR [rsp+0xa98]
  e8fd0b:	00
  e8fd0c:	48 8d bc 24 60 04 00 	lea    rdi,[rsp+0x460]
  e8fd13:	00
  e8fd14:	e8 77 a5 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e8fd19:	48 8d 84 24 b0 04 00 	lea    rax,[rsp+0x4b0]
  e8fd20:	00
  e8fd21:	48 83 60 20 00       	and    QWORD PTR [rax+0x20],0x0
  e8fd26:	48 8b b4 24 b8 0a 00 	mov    rsi,QWORD PTR [rsp+0xab8]
  e8fd2d:	00
  e8fd2e:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
  e8fd35:	00
  e8fd36:	0f 57 c0             	xorps  xmm0,xmm0
  e8fd39:	0f 29 47 b0          	movaps XMMWORD PTR [rdi-0x50],xmm0
  e8fd3d:	48 83 67 c0 00       	and    QWORD PTR [rdi-0x40],0x0
  e8fd42:	e8 49 a5 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e8fd47:	48 8b bc 24 c8 0a 00 	mov    rdi,QWORD PTR [rsp+0xac8]
  e8fd4e:	00
  e8fd4f:	48 8b 84 24 c0 0a 00 	mov    rax,QWORD PTR [rsp+0xac0]
  e8fd56:	00
  e8fd57:	48 8d b4 24 20 05 00 	lea    rsi,[rsp+0x520]
  e8fd5e:	00
  e8fd5f:	48 89 46 f0          	mov    QWORD PTR [rsi-0x10],rax
  e8fd63:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e8fd67:	48 85 c0             	test   rax,rax
  e8fd6a:	74 10                	je     e8fd7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57192>
  e8fd6c:	48 39 f8             	cmp    rax,rdi
  e8fd6f:	74 17                	je     e8fd88 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5719e>
  e8fd71:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8fd74:	48 89 c7             	mov    rdi,rax
  e8fd77:	ff 51 10             	call   QWORD PTR [rcx+0x10]
  e8fd7a:	eb 02                	jmp    e8fd7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57194>
  e8fd7c:	31 c0                	xor    eax,eax
  e8fd7e:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e8fd85:	00
  e8fd86:	eb 0e                	jmp    e8fd96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x571ac>
  e8fd88:	48 89 b4 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rsi
  e8fd8f:	00
  e8fd90:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8fd93:	ff 50 18             	call   QWORD PTR [rax+0x18]
  e8fd96:	48 8b bc 24 d0 0a 00 	mov    rdi,QWORD PTR [rsp+0xad0]
  e8fd9d:	00
  e8fd9e:	48 8d b4 24 50 05 00 	lea    rsi,[rsp+0x550]
  e8fda5:	00
  e8fda6:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e8fdaa:	48 85 c0             	test   rax,rax
  e8fdad:	74 10                	je     e8fdbf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x571d5>
  e8fdaf:	48 39 f8             	cmp    rax,rdi
  e8fdb2:	74 17                	je     e8fdcb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x571e1>
  e8fdb4:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8fdb7:	48 89 c7             	mov    rdi,rax
  e8fdba:	ff 51 10             	call   QWORD PTR [rcx+0x10]
```
### `0xe91261`

```text
  e911cb:	4d 89 f8             	mov    r8,r15
  e911ce:	45 31 c9             	xor    r9d,r9d
  e911d1:	e8 88 63 75 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  e911d6:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  e911da:	48 8d 35 0e 33 54 ff 	lea    rsi,[rip+0xffffffffff54330e]        # 3d44ef <_ZTSN5boost17bad_function_callE@@Base+0x1835>
  e911e1:	48 8d 0d 18 33 54 ff 	lea    rcx,[rip+0xffffffffff543318]        # 3d4500 <_ZTSN5boost17bad_function_callE@@Base+0x1846>
  e911e8:	6a 29                	push   0x29
  e911ea:	41 58                	pop    r8
  e911ec:	4c 89 f2             	mov    rdx,r14
  e911ef:	45 31 c9             	xor    r9d,r9d
  e911f2:	e8 67 63 75 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  e911f7:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  e911fb:	48 8d 35 28 33 54 ff 	lea    rsi,[rip+0xffffffffff543328]        # 3d452a <_ZTSN5boost17bad_function_callE@@Base+0x1870>
  e91202:	48 8d 0d 37 33 54 ff 	lea    rcx,[rip+0xffffffffff543337]        # 3d4540 <_ZTSN5boost17bad_function_callE@@Base+0x1886>
  e91209:	4c 89 f2             	mov    rdx,r14
  e9120c:	49 89 d8             	mov    r8,rbx
  e9120f:	45 31 c9             	xor    r9d,r9d
  e91212:	e8 47 63 75 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  e91217:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]
  e9121d:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  e91224:	e8 5d d2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e91229:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9122f:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  e91236:	e8 4b d2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9123b:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
  e91241:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  e91248:	e8 39 d2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9124d:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  e91254:	00
  e91255:	e8 36 cc 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e9125a:	31 ff                	xor    edi,edi
  e9125c:	e8 25 d2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e91261:	4c 8d ac 24 10 04 00 	lea    r13,[rsp+0x410]
  e91268:	00
  e91269:	48 8b 84 24 78 0a 00 	mov    rax,QWORD PTR [rsp+0xa78]
  e91270:	00
  e91271:	49 39 c5             	cmp    r13,rax
  e91274:	4c 8b 64 24 38       	mov    r12,QWORD PTR [rsp+0x38]
  e91279:	0f 84 ca 00 00 00    	je     e91349 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5875f>
  e9127f:	4c 8b 30             	mov    r14,QWORD PTR [rax]
  e91282:	48 8b 58 08          	mov    rbx,QWORD PTR [rax+0x8]
  e91286:	49 89 df             	mov    r15,rbx
  e91289:	4d 29 f7             	sub    r15,r14
  e9128c:	49 c1 ff 07          	sar    r15,0x7
  e91290:	48 8b 94 24 10 04 00 	mov    rdx,QWORD PTR [rsp+0x410]
  e91297:	00
  e91298:	48 8b b4 24 20 04 00 	mov    rsi,QWORD PTR [rsp+0x420]
  e9129f:	00
  e912a0:	48 89 f0             	mov    rax,rsi
  e912a3:	48 29 d0             	sub    rax,rdx
  e912a6:	48 c1 f8 07          	sar    rax,0x7
  e912aa:	4c 39 f8             	cmp    rax,r15
  e912ad:	73 42                	jae    e912f1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58707>
  e912af:	48 85 d2             	test   rdx,rdx
  e912b2:	74 26                	je     e912da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x586f0>
  e912b4:	4c 89 ef             	mov    rdi,r13
  e912b7:	e8 c4 d7 ff ff       	call   e8ea80 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e96>
  e912bc:	48 8b bc 24 10 04 00 	mov    rdi,QWORD PTR [rsp+0x410]
  e912c3:	00
  e912c4:	e8 57 cc 95 00       	call   17edf20 <_ZdlPv@plt>
  e912c9:	66 0f ef c0          	pxor   xmm0,xmm0
  e912cd:	66 41 0f 7f 45 00    	movdqa XMMWORD PTR [r13+0x0],xmm0
  e912d3:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
  e912d8:	31 f6                	xor    esi,esi
  e912da:	31 ff                	xor    edi,edi
  e912dc:	4c 89 fa             	mov    rdx,r15
  e912df:	e8 62 df ff ff       	call   e8f246 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5665c>
  e912e4:	4c 89 ef             	mov    rdi,r13
  e912e7:	48 89 c6             	mov    rsi,rax
  e912ea:	e8 fd d7 ff ff       	call   e8eaec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55f02>
  e912ef:	eb 2d                	jmp    e9131e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58734>
  e912f1:	4c 8b a4 24 18 04 00 	mov    r12,QWORD PTR [rsp+0x418]
  e912f8:	00
  e912f9:	49 29 d4             	sub    r12,rdx
  e912fc:	4c 89 e0             	mov    rax,r12
  e912ff:	48 c1 f8 07          	sar    rax,0x7
  e91303:	4c 39 f8             	cmp    rax,r15
  e91306:	73 26                	jae    e9132e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58744>
  e91308:	4d 01 f4             	add    r12,r14
  e9130b:	4c 89 f7             	mov    rdi,r14
  e9130e:	4c 89 e6             	mov    rsi,r12
  e91311:	e8 33 19 00 00       	call   e92c49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05f>
  e91316:	4d 89 e6             	mov    r14,r12
  e91319:	4c 8b 64 24 38       	mov    r12,QWORD PTR [rsp+0x38]
  e9131e:	4c 89 ef             	mov    rdi,r13
  e91321:	4c 89 f6             	mov    rsi,r14
  e91324:	48 89 da             	mov    rdx,rbx
  e91327:	e8 5e 19 00 00       	call   e92c8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a0a0>
  e9132c:	eb 1b                	jmp    e91349 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5875f>
  e9132e:	4c 89 f7             	mov    rdi,r14
  e91331:	48 89 de             	mov    rsi,rbx
  e91334:	e8 10 19 00 00       	call   e92c49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05f>
  e91339:	4c 8b 64 24 38       	mov    r12,QWORD PTR [rsp+0x38]
  e9133e:	4c 89 ef             	mov    rdi,r13
  e91341:	48 89 c6             	mov    rsi,rax
  e91344:	e8 3f d7 ff ff       	call   e8ea88 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e9e>
  e91349:	48 8b 84 24 70 0a 00 	mov    rax,QWORD PTR [rsp+0xa70]
  e91350:	00
  e91351:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
  e91355:	48 8d bc 24 98 03 00 	lea    rdi,[rsp+0x398]
  e9135c:	00
  e9135d:	e8 d4 d7 c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
  e91362:	48 8b 8c 24 a0 0a 00 	mov    rcx,QWORD PTR [rsp+0xaa0]
  e91369:	00
  e9136a:	48 8b 01             	mov    rax,QWORD PTR [rcx]
  e9136d:	48 85 c0             	test   rax,rax
  e91370:	74 1f                	je     e91391 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x587a7>
```
### `0xe91290`

```text
  e911fb:	48 8d 35 28 33 54 ff 	lea    rsi,[rip+0xffffffffff543328]        # 3d452a <_ZTSN5boost17bad_function_callE@@Base+0x1870>
  e91202:	48 8d 0d 37 33 54 ff 	lea    rcx,[rip+0xffffffffff543337]        # 3d4540 <_ZTSN5boost17bad_function_callE@@Base+0x1886>
  e91209:	4c 89 f2             	mov    rdx,r14
  e9120c:	49 89 d8             	mov    r8,rbx
  e9120f:	45 31 c9             	xor    r9d,r9d
  e91212:	e8 47 63 75 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  e91217:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]
  e9121d:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  e91224:	e8 5d d2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e91229:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9122f:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  e91236:	e8 4b d2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9123b:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
  e91241:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  e91248:	e8 39 d2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9124d:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  e91254:	00
  e91255:	e8 36 cc 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e9125a:	31 ff                	xor    edi,edi
  e9125c:	e8 25 d2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e91261:	4c 8d ac 24 10 04 00 	lea    r13,[rsp+0x410]
  e91268:	00
  e91269:	48 8b 84 24 78 0a 00 	mov    rax,QWORD PTR [rsp+0xa78]
  e91270:	00
  e91271:	49 39 c5             	cmp    r13,rax
  e91274:	4c 8b 64 24 38       	mov    r12,QWORD PTR [rsp+0x38]
  e91279:	0f 84 ca 00 00 00    	je     e91349 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5875f>
  e9127f:	4c 8b 30             	mov    r14,QWORD PTR [rax]
  e91282:	48 8b 58 08          	mov    rbx,QWORD PTR [rax+0x8]
  e91286:	49 89 df             	mov    r15,rbx
  e91289:	4d 29 f7             	sub    r15,r14
  e9128c:	49 c1 ff 07          	sar    r15,0x7
  e91290:	48 8b 94 24 10 04 00 	mov    rdx,QWORD PTR [rsp+0x410]
  e91297:	00
  e91298:	48 8b b4 24 20 04 00 	mov    rsi,QWORD PTR [rsp+0x420]
  e9129f:	00
  e912a0:	48 89 f0             	mov    rax,rsi
  e912a3:	48 29 d0             	sub    rax,rdx
  e912a6:	48 c1 f8 07          	sar    rax,0x7
  e912aa:	4c 39 f8             	cmp    rax,r15
  e912ad:	73 42                	jae    e912f1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58707>
  e912af:	48 85 d2             	test   rdx,rdx
  e912b2:	74 26                	je     e912da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x586f0>
  e912b4:	4c 89 ef             	mov    rdi,r13
  e912b7:	e8 c4 d7 ff ff       	call   e8ea80 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e96>
  e912bc:	48 8b bc 24 10 04 00 	mov    rdi,QWORD PTR [rsp+0x410]
  e912c3:	00
  e912c4:	e8 57 cc 95 00       	call   17edf20 <_ZdlPv@plt>
  e912c9:	66 0f ef c0          	pxor   xmm0,xmm0
  e912cd:	66 41 0f 7f 45 00    	movdqa XMMWORD PTR [r13+0x0],xmm0
  e912d3:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
  e912d8:	31 f6                	xor    esi,esi
  e912da:	31 ff                	xor    edi,edi
  e912dc:	4c 89 fa             	mov    rdx,r15
  e912df:	e8 62 df ff ff       	call   e8f246 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5665c>
  e912e4:	4c 89 ef             	mov    rdi,r13
  e912e7:	48 89 c6             	mov    rsi,rax
  e912ea:	e8 fd d7 ff ff       	call   e8eaec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55f02>
  e912ef:	eb 2d                	jmp    e9131e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58734>
  e912f1:	4c 8b a4 24 18 04 00 	mov    r12,QWORD PTR [rsp+0x418]
  e912f8:	00
  e912f9:	49 29 d4             	sub    r12,rdx
  e912fc:	4c 89 e0             	mov    rax,r12
  e912ff:	48 c1 f8 07          	sar    rax,0x7
  e91303:	4c 39 f8             	cmp    rax,r15
  e91306:	73 26                	jae    e9132e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58744>
  e91308:	4d 01 f4             	add    r12,r14
  e9130b:	4c 89 f7             	mov    rdi,r14
  e9130e:	4c 89 e6             	mov    rsi,r12
  e91311:	e8 33 19 00 00       	call   e92c49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05f>
  e91316:	4d 89 e6             	mov    r14,r12
  e91319:	4c 8b 64 24 38       	mov    r12,QWORD PTR [rsp+0x38]
  e9131e:	4c 89 ef             	mov    rdi,r13
  e91321:	4c 89 f6             	mov    rsi,r14
  e91324:	48 89 da             	mov    rdx,rbx
  e91327:	e8 5e 19 00 00       	call   e92c8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a0a0>
  e9132c:	eb 1b                	jmp    e91349 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5875f>
  e9132e:	4c 89 f7             	mov    rdi,r14
  e91331:	48 89 de             	mov    rsi,rbx
  e91334:	e8 10 19 00 00       	call   e92c49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05f>
  e91339:	4c 8b 64 24 38       	mov    r12,QWORD PTR [rsp+0x38]
  e9133e:	4c 89 ef             	mov    rdi,r13
  e91341:	48 89 c6             	mov    rsi,rax
  e91344:	e8 3f d7 ff ff       	call   e8ea88 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e9e>
  e91349:	48 8b 84 24 70 0a 00 	mov    rax,QWORD PTR [rsp+0xa70]
  e91350:	00
  e91351:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
  e91355:	48 8d bc 24 98 03 00 	lea    rdi,[rsp+0x398]
  e9135c:	00
  e9135d:	e8 d4 d7 c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
  e91362:	48 8b 8c 24 a0 0a 00 	mov    rcx,QWORD PTR [rsp+0xaa0]
  e91369:	00
  e9136a:	48 8b 01             	mov    rax,QWORD PTR [rcx]
  e9136d:	48 85 c0             	test   rax,rax
  e91370:	74 1f                	je     e91391 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x587a7>
  e91372:	48 83 21 00          	and    QWORD PTR [rcx],0x0
  e91376:	48 8b bc 24 90 04 00 	mov    rdi,QWORD PTR [rsp+0x490]
  e9137d:	00
  e9137e:	48 89 84 24 90 04 00 	mov    QWORD PTR [rsp+0x490],rax
  e91385:	00
  e91386:	48 85 ff             	test   rdi,rdi
  e91389:	74 06                	je     e91391 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x587a7>
  e9138b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e9138e:	ff 50 08             	call   QWORD PTR [rax+0x8]
  e91391:	48 8b 84 24 a8 0a 00 	mov    rax,QWORD PTR [rsp+0xaa8]
  e91398:	00
  e91399:	48 83 38 00          	cmp    QWORD PTR [rax],0x0
```
### `0xe912bc`

```text
  e91241:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  e91248:	e8 39 d2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9124d:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  e91254:	00
  e91255:	e8 36 cc 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e9125a:	31 ff                	xor    edi,edi
  e9125c:	e8 25 d2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e91261:	4c 8d ac 24 10 04 00 	lea    r13,[rsp+0x410]
  e91268:	00
  e91269:	48 8b 84 24 78 0a 00 	mov    rax,QWORD PTR [rsp+0xa78]
  e91270:	00
  e91271:	49 39 c5             	cmp    r13,rax
  e91274:	4c 8b 64 24 38       	mov    r12,QWORD PTR [rsp+0x38]
  e91279:	0f 84 ca 00 00 00    	je     e91349 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5875f>
  e9127f:	4c 8b 30             	mov    r14,QWORD PTR [rax]
  e91282:	48 8b 58 08          	mov    rbx,QWORD PTR [rax+0x8]
  e91286:	49 89 df             	mov    r15,rbx
  e91289:	4d 29 f7             	sub    r15,r14
  e9128c:	49 c1 ff 07          	sar    r15,0x7
  e91290:	48 8b 94 24 10 04 00 	mov    rdx,QWORD PTR [rsp+0x410]
  e91297:	00
  e91298:	48 8b b4 24 20 04 00 	mov    rsi,QWORD PTR [rsp+0x420]
  e9129f:	00
  e912a0:	48 89 f0             	mov    rax,rsi
  e912a3:	48 29 d0             	sub    rax,rdx
  e912a6:	48 c1 f8 07          	sar    rax,0x7
  e912aa:	4c 39 f8             	cmp    rax,r15
  e912ad:	73 42                	jae    e912f1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58707>
  e912af:	48 85 d2             	test   rdx,rdx
  e912b2:	74 26                	je     e912da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x586f0>
  e912b4:	4c 89 ef             	mov    rdi,r13
  e912b7:	e8 c4 d7 ff ff       	call   e8ea80 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e96>
  e912bc:	48 8b bc 24 10 04 00 	mov    rdi,QWORD PTR [rsp+0x410]
  e912c3:	00
  e912c4:	e8 57 cc 95 00       	call   17edf20 <_ZdlPv@plt>
  e912c9:	66 0f ef c0          	pxor   xmm0,xmm0
  e912cd:	66 41 0f 7f 45 00    	movdqa XMMWORD PTR [r13+0x0],xmm0
  e912d3:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
  e912d8:	31 f6                	xor    esi,esi
  e912da:	31 ff                	xor    edi,edi
  e912dc:	4c 89 fa             	mov    rdx,r15
  e912df:	e8 62 df ff ff       	call   e8f246 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5665c>
  e912e4:	4c 89 ef             	mov    rdi,r13
  e912e7:	48 89 c6             	mov    rsi,rax
  e912ea:	e8 fd d7 ff ff       	call   e8eaec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55f02>
  e912ef:	eb 2d                	jmp    e9131e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58734>
  e912f1:	4c 8b a4 24 18 04 00 	mov    r12,QWORD PTR [rsp+0x418]
  e912f8:	00
  e912f9:	49 29 d4             	sub    r12,rdx
  e912fc:	4c 89 e0             	mov    rax,r12
  e912ff:	48 c1 f8 07          	sar    rax,0x7
  e91303:	4c 39 f8             	cmp    rax,r15
  e91306:	73 26                	jae    e9132e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58744>
  e91308:	4d 01 f4             	add    r12,r14
  e9130b:	4c 89 f7             	mov    rdi,r14
  e9130e:	4c 89 e6             	mov    rsi,r12
  e91311:	e8 33 19 00 00       	call   e92c49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05f>
  e91316:	4d 89 e6             	mov    r14,r12
  e91319:	4c 8b 64 24 38       	mov    r12,QWORD PTR [rsp+0x38]
  e9131e:	4c 89 ef             	mov    rdi,r13
  e91321:	4c 89 f6             	mov    rsi,r14
  e91324:	48 89 da             	mov    rdx,rbx
  e91327:	e8 5e 19 00 00       	call   e92c8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a0a0>
  e9132c:	eb 1b                	jmp    e91349 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5875f>
  e9132e:	4c 89 f7             	mov    rdi,r14
  e91331:	48 89 de             	mov    rsi,rbx
  e91334:	e8 10 19 00 00       	call   e92c49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05f>
  e91339:	4c 8b 64 24 38       	mov    r12,QWORD PTR [rsp+0x38]
  e9133e:	4c 89 ef             	mov    rdi,r13
  e91341:	48 89 c6             	mov    rsi,rax
  e91344:	e8 3f d7 ff ff       	call   e8ea88 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e9e>
  e91349:	48 8b 84 24 70 0a 00 	mov    rax,QWORD PTR [rsp+0xa70]
  e91350:	00
  e91351:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
  e91355:	48 8d bc 24 98 03 00 	lea    rdi,[rsp+0x398]
  e9135c:	00
  e9135d:	e8 d4 d7 c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
  e91362:	48 8b 8c 24 a0 0a 00 	mov    rcx,QWORD PTR [rsp+0xaa0]
  e91369:	00
  e9136a:	48 8b 01             	mov    rax,QWORD PTR [rcx]
  e9136d:	48 85 c0             	test   rax,rax
  e91370:	74 1f                	je     e91391 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x587a7>
  e91372:	48 83 21 00          	and    QWORD PTR [rcx],0x0
  e91376:	48 8b bc 24 90 04 00 	mov    rdi,QWORD PTR [rsp+0x490]
  e9137d:	00
  e9137e:	48 89 84 24 90 04 00 	mov    QWORD PTR [rsp+0x490],rax
  e91385:	00
  e91386:	48 85 ff             	test   rdi,rdi
  e91389:	74 06                	je     e91391 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x587a7>
  e9138b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e9138e:	ff 50 08             	call   QWORD PTR [rax+0x8]
  e91391:	48 8b 84 24 a8 0a 00 	mov    rax,QWORD PTR [rsp+0xaa8]
  e91398:	00
  e91399:	48 83 38 00          	cmp    QWORD PTR [rax],0x0
  e9139d:	74 11                	je     e913b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x587c6>
  e9139f:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
  e913a3:	48 8d bc 24 98 04 00 	lea    rdi,[rsp+0x498]
  e913aa:	00
  e913ab:	e8 86 d7 c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
  e913b0:	48 8b b4 24 b0 0a 00 	mov    rsi,QWORD PTR [rsp+0xab0]
  e913b7:	00
  e913b8:	48 83 7e 20 00       	cmp    QWORD PTR [rsi+0x20],0x0
  e913bd:	74 28                	je     e913e7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x587fd>
  e913bf:	48 8d 9c 24 30 02 00 	lea    rbx,[rsp+0x230]
  e913c6:	00
  e913c7:	48 89 df             	mov    rdi,rbx
  e913ca:	e8 5d b6 fe ff       	call   e7ca2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e42>
```
### `0xe91355`

```text
  e912e4:	4c 89 ef             	mov    rdi,r13
  e912e7:	48 89 c6             	mov    rsi,rax
  e912ea:	e8 fd d7 ff ff       	call   e8eaec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55f02>
  e912ef:	eb 2d                	jmp    e9131e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58734>
  e912f1:	4c 8b a4 24 18 04 00 	mov    r12,QWORD PTR [rsp+0x418]
  e912f8:	00
  e912f9:	49 29 d4             	sub    r12,rdx
  e912fc:	4c 89 e0             	mov    rax,r12
  e912ff:	48 c1 f8 07          	sar    rax,0x7
  e91303:	4c 39 f8             	cmp    rax,r15
  e91306:	73 26                	jae    e9132e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58744>
  e91308:	4d 01 f4             	add    r12,r14
  e9130b:	4c 89 f7             	mov    rdi,r14
  e9130e:	4c 89 e6             	mov    rsi,r12
  e91311:	e8 33 19 00 00       	call   e92c49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05f>
  e91316:	4d 89 e6             	mov    r14,r12
  e91319:	4c 8b 64 24 38       	mov    r12,QWORD PTR [rsp+0x38]
  e9131e:	4c 89 ef             	mov    rdi,r13
  e91321:	4c 89 f6             	mov    rsi,r14
  e91324:	48 89 da             	mov    rdx,rbx
  e91327:	e8 5e 19 00 00       	call   e92c8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a0a0>
  e9132c:	eb 1b                	jmp    e91349 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5875f>
  e9132e:	4c 89 f7             	mov    rdi,r14
  e91331:	48 89 de             	mov    rsi,rbx
  e91334:	e8 10 19 00 00       	call   e92c49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05f>
  e91339:	4c 8b 64 24 38       	mov    r12,QWORD PTR [rsp+0x38]
  e9133e:	4c 89 ef             	mov    rdi,r13
  e91341:	48 89 c6             	mov    rsi,rax
  e91344:	e8 3f d7 ff ff       	call   e8ea88 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e9e>
  e91349:	48 8b 84 24 70 0a 00 	mov    rax,QWORD PTR [rsp+0xa70]
  e91350:	00
  e91351:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
  e91355:	48 8d bc 24 98 03 00 	lea    rdi,[rsp+0x398]
  e9135c:	00
  e9135d:	e8 d4 d7 c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
  e91362:	48 8b 8c 24 a0 0a 00 	mov    rcx,QWORD PTR [rsp+0xaa0]
  e91369:	00
  e9136a:	48 8b 01             	mov    rax,QWORD PTR [rcx]
  e9136d:	48 85 c0             	test   rax,rax
  e91370:	74 1f                	je     e91391 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x587a7>
  e91372:	48 83 21 00          	and    QWORD PTR [rcx],0x0
  e91376:	48 8b bc 24 90 04 00 	mov    rdi,QWORD PTR [rsp+0x490]
  e9137d:	00
  e9137e:	48 89 84 24 90 04 00 	mov    QWORD PTR [rsp+0x490],rax
  e91385:	00
  e91386:	48 85 ff             	test   rdi,rdi
  e91389:	74 06                	je     e91391 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x587a7>
  e9138b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e9138e:	ff 50 08             	call   QWORD PTR [rax+0x8]
  e91391:	48 8b 84 24 a8 0a 00 	mov    rax,QWORD PTR [rsp+0xaa8]
  e91398:	00
  e91399:	48 83 38 00          	cmp    QWORD PTR [rax],0x0
  e9139d:	74 11                	je     e913b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x587c6>
  e9139f:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
  e913a3:	48 8d bc 24 98 04 00 	lea    rdi,[rsp+0x498]
  e913aa:	00
  e913ab:	e8 86 d7 c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
  e913b0:	48 8b b4 24 b0 0a 00 	mov    rsi,QWORD PTR [rsp+0xab0]
  e913b7:	00
  e913b8:	48 83 7e 20 00       	cmp    QWORD PTR [rsi+0x20],0x0
  e913bd:	74 28                	je     e913e7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x587fd>
  e913bf:	48 8d 9c 24 30 02 00 	lea    rbx,[rsp+0x230]
  e913c6:	00
  e913c7:	48 89 df             	mov    rdi,rbx
  e913ca:	e8 5d b6 fe ff       	call   e7ca2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e42>
  e913cf:	48 8d bc 24 b0 04 00 	lea    rdi,[rsp+0x4b0]
  e913d6:	00
  e913d7:	48 89 de             	mov    rsi,rbx
  e913da:	e8 c1 05 d8 ff       	call   c119a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e940>
  e913df:	48 89 df             	mov    rdi,rbx
  e913e2:	e8 83 8b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e913e7:	48 8b 84 24 e0 0b 00 	mov    rax,QWORD PTR [rsp+0xbe0]
  e913ee:	00
  e913ef:	48 89 84 24 f8 07 00 	mov    QWORD PTR [rsp+0x7f8],rax
  e913f6:	00
  e913f7:	48 8d bc 24 a0 08 00 	lea    rdi,[rsp+0x8a0]
  e913fe:	00
  e913ff:	48 8b b4 24 80 0a 00 	mov    rsi,QWORD PTR [rsp+0xa80]
  e91406:	00
  e91407:	e8 84 8e be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e9140c:	48 8d 9c 24 a0 08 00 	lea    rbx,[rsp+0x8a0]
  e91413:	00
  e91414:	48 89 df             	mov    rdi,rbx
  e91417:	48 8d b4 24 60 03 00 	lea    rsi,[rsp+0x360]
  e9141e:	00
  e9141f:	e8 02 6f cf ff       	call   b88326 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd52c6>
  e91424:	48 89 df             	mov    rdi,rbx
  e91427:	e8 3e 8b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9142c:	ba f0 00 00 00       	mov    edx,0xf0
  e91431:	4c 89 e7             	mov    rdi,r12
  e91434:	31 f6                	xor    esi,esi
  e91436:	e8 55 d7 95 00       	call   17eeb90 <memset@plt>
  e9143b:	41 c6 84 24 f0 00 00 	mov    BYTE PTR [r12+0xf0],0x1
  e91442:	00 01
  e91444:	66 0f ef c0          	pxor   xmm0,xmm0
  e91448:	f3 41 0f 7f 84 24 f8 	movdqu XMMWORD PTR [r12+0xf8],xmm0
  e9144f:	00 00 00
  e91452:	f3 41 0f 7f 84 24 08 	movdqu XMMWORD PTR [r12+0x108],xmm0
  e91459:	01 00 00
  e9145c:	48 8b bc 24 50 03 00 	mov    rdi,QWORD PTR [rsp+0x350]
  e91463:	00
  e91464:	e8 72 58 62 00       	call   14b6cdb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fc25f>
  e91469:	48 8b 84 24 c8 06 00 	mov    rax,QWORD PTR [rsp+0x6c8]
  e91470:	00
  e91471:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
  e91474:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
  e91478:	48 85 c0             	test   rax,rax
```
### `0xe92acd`

```text
  e92a4d:	00
  e92a4e:	e8 17 75 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e92a53:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
  e92a5a:	00
  e92a5b:	e8 0a 75 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e92a60:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
  e92a67:	00
  e92a68:	e8 fd 74 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e92a6d:	48 8d bc 24 b0 04 00 	lea    rdi,[rsp+0x4b0]
  e92a74:	00
  e92a75:	e8 f0 74 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e92a7a:	48 8b bc 24 a0 04 00 	mov    rdi,QWORD PTR [rsp+0x4a0]
  e92a81:	00
  e92a82:	e8 ff b9 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e92a87:	48 8b bc 24 90 04 00 	mov    rdi,QWORD PTR [rsp+0x490]
  e92a8e:	00
  e92a8f:	48 83 a4 24 90 04 00 	and    QWORD PTR [rsp+0x490],0x0
  e92a96:	00 00
  e92a98:	48 85 ff             	test   rdi,rdi
  e92a9b:	74 06                	je     e92aa3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59eb9>
  e92a9d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e92aa0:	ff 50 08             	call   QWORD PTR [rax+0x8]
  e92aa3:	48 8d bc 24 60 04 00 	lea    rdi,[rsp+0x460]
  e92aaa:	00
  e92aab:	e8 ba 74 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e92ab0:	48 8d bc 24 30 04 00 	lea    rdi,[rsp+0x430]
  e92ab7:	00
  e92ab8:	e8 ad 74 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e92abd:	48 8d 9c 24 b0 03 00 	lea    rbx,[rsp+0x3b0]
  e92ac4:	00
  e92ac5:	4c 8d b4 24 e0 03 00 	lea    r14,[rsp+0x3e0]
  e92acc:	00
  e92acd:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
  e92ad4:	00
  e92ad5:	e8 4a bf ff ff       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
  e92ada:	4c 89 f7             	mov    rdi,r14
  e92add:	e8 88 74 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e92ae2:	48 89 df             	mov    rdi,rbx
  e92ae5:	e8 80 74 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e92aea:	49 8b 7e c0          	mov    rdi,QWORD PTR [r14-0x40]
  e92aee:	e8 93 b9 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e92af3:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
  e92afa:	00
  e92afb:	e8 6a 74 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e92b00:	48 8b 7b 80          	mov    rdi,QWORD PTR [rbx-0x80]
  e92b04:	e8 7d b9 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e92b09:	49 8b be 40 ff ff ff 	mov    rdi,QWORD PTR [r14-0xc0]
  e92b10:	e8 71 b9 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e92b15:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
  e92b1c:	00
  e92b1d:	e8 48 74 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e92b22:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
  e92b29:	00
  e92b2a:	e8 3b 74 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e92b2f:	48 8b bc 24 98 02 00 	mov    rdi,QWORD PTR [rsp+0x298]
  e92b36:	00
  e92b37:	e8 4a b9 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e92b3c:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]
  e92b42:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  e92b49:	e8 38 b9 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e92b4e:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e92b54:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  e92b5b:	e8 26 b9 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e92b60:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
  e92b66:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  e92b6d:	e8 14 b9 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e92b72:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  e92b79:	00
  e92b7a:	e8 11 b3 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e92b7f:	31 ff                	xor    edi,edi
  e92b81:	e8 00 b9 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e92b86:	e9 9c 00 00 00       	jmp    e92c27 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a03d>
  e92b8b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  e92b90:	eb 12                	jmp    e92ba4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59fba>
  e92b92:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  e92b97:	48 8b bc 24 38 08 00 	mov    rdi,QWORD PTR [rsp+0x838]
  e92b9e:	00
  e92b9f:	e8 e2 b8 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e92ba4:	48 8d bc 24 a0 08 00 	lea    rdi,[rsp+0x8a0]
  e92bab:	00
  e92bac:	e8 37 7c 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e92bb1:	4c 89 ff             	mov    rdi,r15
  e92bb4:	e8 ab 9f c2 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
  e92bb9:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
  e92bbe:	e8 a3 72 94 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  e92bc3:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
  e92bc8:	e8 55 af c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
  e92bcd:	48 8d bc 24 90 09 00 	lea    rdi,[rsp+0x990]
  e92bd4:	00
  e92bd5:	e8 48 af c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
  e92bda:	48 8b 5c 24 40       	mov    rbx,QWORD PTR [rsp+0x40]
  e92bdf:	48 89 df             	mov    rdi,rbx
  e92be2:	e8 29 b4 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  e92be7:	48 89 df             	mov    rdi,rbx
  e92bea:	e8 2d b8 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e92bef:	48 8d bc 24 60 09 00 	lea    rdi,[rsp+0x960]
  e92bf6:	00
  e92bf7:	e8 26 af c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
  e92bfc:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e92c01:	e8 80 b8 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e92c06:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
  e92c0b:	e8 a2 b8 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e92c10:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
  e92c15:	e8 2c 40 62 00       	call   14b6c46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fc1ca>
  e92c1a:	48 8d bc 24 60 02 00 	lea    rdi,[rsp+0x260]
  e92c21:	00
  e92c22:	e8 43 01 00 00       	call   e92d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a180>
```
### `0xe92f6b`

```text
  e92eff:	48 8b 02             	mov    rax,QWORD PTR [rdx]
  e92f02:	48 89 06             	mov    QWORD PTR [rsi],rax
  e92f05:	48 8b 42 08          	mov    rax,QWORD PTR [rdx+0x8]
  e92f09:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  e92f0d:	48 85 c0             	test   rax,rax
  e92f10:	74 0a                	je     e92f1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a332>
  e92f12:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
  e92f17:	eb 03                	jmp    e92f1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a332>
  e92f19:	48 89 f2             	mov    rdx,rsi
  e92f1c:	48 8b 7a 08          	mov    rdi,QWORD PTR [rdx+0x8]
  e92f20:	e9 bf c6 c4 ff       	jmp    adf5e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c584>
  e92f25:	c3                   	ret
  e92f26:	e9 47 8f 01 00       	jmp    eabe72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x73288>
  e92f2b:	cc                   	int3
  e92f2c:	55                   	push   rbp
  e92f2d:	41 57                	push   r15
  e92f2f:	41 56                	push   r14
  e92f31:	41 55                	push   r13
  e92f33:	41 54                	push   r12
  e92f35:	53                   	push   rbx
  e92f36:	48 81 ec b8 10 00 00 	sub    rsp,0x10b8
  e92f3d:	48 89 8c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rcx
  e92f44:	00
  e92f45:	48 89 94 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rdx
  e92f4c:	00
  e92f4d:	49 89 f5             	mov    r13,rsi
  e92f50:	49 89 ff             	mov    r15,rdi
  e92f53:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e92f5a:	00 00
  e92f5c:	48 89 84 24 b0 10 00 	mov    QWORD PTR [rsp+0x10b0],rax
  e92f63:	00
  e92f64:	48 8b b6 80 04 00 00 	mov    rsi,QWORD PTR [rsi+0x480]
  e92f6b:	48 8d bc 24 90 03 00 	lea    rdi,[rsp+0x390]
  e92f72:	00
  e92f73:	e8 40 ff c5 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>
  e92f78:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92f7f:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92f82:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92f86:	48 8d 15 28 8b 4d ff 	lea    rdx,[rip+0xffffffffff4d8b28]        # 36bab5 <_ZTSSt12bad_any_cast@@Base-0x24713>
  e92f8d:	e8 27 64 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92f92:	b3 01                	mov    bl,0x1
  e92f94:	40 b5 01             	mov    bpl,0x1
  e92f97:	84 c0                	test   al,al
  e92f99:	75 1c                	jne    e92fb7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a3cd>
  e92f9b:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92fa2:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92fa5:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92fa9:	48 8d 15 b8 03 4a ff 	lea    rdx,[rip+0xffffffffff4a03b8]        # 333368 <_ZTSSt12bad_any_cast@@Base-0x5ce60>
  e92fb0:	e8 04 64 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92fb5:	89 c5                	mov    ebp,eax
  e92fb7:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92fbe:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92fc1:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92fc5:	48 8d 15 1a 6d 4a ff 	lea    rdx,[rip+0xffffffffff4a6d1a]        # 339ce6 <_ZTSSt12bad_any_cast@@Base-0x564e2>
  e92fcc:	e8 e8 63 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92fd1:	84 c0                	test   al,al
  e92fd3:	75 1c                	jne    e92ff1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a407>
  e92fd5:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92fdc:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92fdf:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92fe3:	48 8d 15 7e 03 4a ff 	lea    rdx,[rip+0xffffffffff4a037e]        # 333368 <_ZTSSt12bad_any_cast@@Base-0x5ce60>
  e92fea:	e8 ca 63 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92fef:	89 c3                	mov    ebx,eax
  e92ff1:	31 c0                	xor    eax,eax
  e92ff3:	88 84 24 e8 03 00 00 	mov    BYTE PTR [rsp+0x3e8],al
  e92ffa:	88 84 24 10 04 00 00 	mov    BYTE PTR [rsp+0x410],al
  e93001:	40 84 dd             	test   bpl,bl
  e93004:	0f 85 87 00 00 00    	jne    e93091 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a4a7>
  e9300a:	66 0f ef c0          	pxor   xmm0,xmm0
  e9300e:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
  e93015:	00
  e93016:	66 41 0f 7f 46 10    	movdqa XMMWORD PTR [r14+0x10],xmm0
  e9301c:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
  e93021:	41 c7 46 20 00 00 80 	mov    DWORD PTR [r14+0x20],0x3f800000
  e93028:	3f
  e93029:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e93030:	00
  e93031:	4c 89 f6             	mov    rsi,r14
  e93034:	e8 c3 63 00 00       	call   e993fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60812>
  e93039:	4c 89 f7             	mov    rdi,r14
  e9303c:	e8 25 f6 c4 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
  e93041:	40 84 ed             	test   bpl,bpl
  e93044:	74 14                	je     e9305a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a470>
  e93046:	48 8d 35 13 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c13]        # 43bc60 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x186c>
  e9304d:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e93054:	00
  e93055:	e8 16 a8 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e9305a:	84 db                	test   bl,bl
  e9305c:	74 14                	je     e93072 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a488>
  e9305e:	48 8d 35 13 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c13]        # 43bc78 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1884>
  e93065:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9306c:	00
  e9306d:	e8 fe a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e93072:	48 83 bc 24 00 04 00 	cmp    QWORD PTR [rsp+0x400],0x0
  e93079:	00 00
  e9307b:	74 14                	je     e93091 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a4a7>
  e9307d:	48 8d 35 0c 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c0c]        # 43bc90 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x189c>
  e93084:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9308b:	00
  e9308c:	e8 df a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e93091:	49 8b 85 70 05 00 00 	mov    rax,QWORD PTR [r13+0x570]
  e93098:	80 78 01 00          	cmp    BYTE PTR [rax+0x1],0x0
  e9309c:	48 8d 1d 3d b8 97 00 	lea    rbx,[rip+0x97b83d]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
  e930a3:	4c 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],r15
  e930a8:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
  e930ad:	0f 85 ca 01 00 00    	jne    e9327d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a693>
  e930b3:	4d 8b bd 10 04 00 00 	mov    r15,QWORD PTR [r13+0x410]
```
### `0xe92f78`

```text
  e92f09:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  e92f0d:	48 85 c0             	test   rax,rax
  e92f10:	74 0a                	je     e92f1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a332>
  e92f12:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
  e92f17:	eb 03                	jmp    e92f1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a332>
  e92f19:	48 89 f2             	mov    rdx,rsi
  e92f1c:	48 8b 7a 08          	mov    rdi,QWORD PTR [rdx+0x8]
  e92f20:	e9 bf c6 c4 ff       	jmp    adf5e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c584>
  e92f25:	c3                   	ret
  e92f26:	e9 47 8f 01 00       	jmp    eabe72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x73288>
  e92f2b:	cc                   	int3
  e92f2c:	55                   	push   rbp
  e92f2d:	41 57                	push   r15
  e92f2f:	41 56                	push   r14
  e92f31:	41 55                	push   r13
  e92f33:	41 54                	push   r12
  e92f35:	53                   	push   rbx
  e92f36:	48 81 ec b8 10 00 00 	sub    rsp,0x10b8
  e92f3d:	48 89 8c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rcx
  e92f44:	00
  e92f45:	48 89 94 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rdx
  e92f4c:	00
  e92f4d:	49 89 f5             	mov    r13,rsi
  e92f50:	49 89 ff             	mov    r15,rdi
  e92f53:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e92f5a:	00 00
  e92f5c:	48 89 84 24 b0 10 00 	mov    QWORD PTR [rsp+0x10b0],rax
  e92f63:	00
  e92f64:	48 8b b6 80 04 00 00 	mov    rsi,QWORD PTR [rsi+0x480]
  e92f6b:	48 8d bc 24 90 03 00 	lea    rdi,[rsp+0x390]
  e92f72:	00
  e92f73:	e8 40 ff c5 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>
  e92f78:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92f7f:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92f82:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92f86:	48 8d 15 28 8b 4d ff 	lea    rdx,[rip+0xffffffffff4d8b28]        # 36bab5 <_ZTSSt12bad_any_cast@@Base-0x24713>
  e92f8d:	e8 27 64 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92f92:	b3 01                	mov    bl,0x1
  e92f94:	40 b5 01             	mov    bpl,0x1
  e92f97:	84 c0                	test   al,al
  e92f99:	75 1c                	jne    e92fb7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a3cd>
  e92f9b:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92fa2:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92fa5:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92fa9:	48 8d 15 b8 03 4a ff 	lea    rdx,[rip+0xffffffffff4a03b8]        # 333368 <_ZTSSt12bad_any_cast@@Base-0x5ce60>
  e92fb0:	e8 04 64 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92fb5:	89 c5                	mov    ebp,eax
  e92fb7:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92fbe:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92fc1:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92fc5:	48 8d 15 1a 6d 4a ff 	lea    rdx,[rip+0xffffffffff4a6d1a]        # 339ce6 <_ZTSSt12bad_any_cast@@Base-0x564e2>
  e92fcc:	e8 e8 63 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92fd1:	84 c0                	test   al,al
  e92fd3:	75 1c                	jne    e92ff1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a407>
  e92fd5:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92fdc:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92fdf:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92fe3:	48 8d 15 7e 03 4a ff 	lea    rdx,[rip+0xffffffffff4a037e]        # 333368 <_ZTSSt12bad_any_cast@@Base-0x5ce60>
  e92fea:	e8 ca 63 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92fef:	89 c3                	mov    ebx,eax
  e92ff1:	31 c0                	xor    eax,eax
  e92ff3:	88 84 24 e8 03 00 00 	mov    BYTE PTR [rsp+0x3e8],al
  e92ffa:	88 84 24 10 04 00 00 	mov    BYTE PTR [rsp+0x410],al
  e93001:	40 84 dd             	test   bpl,bl
  e93004:	0f 85 87 00 00 00    	jne    e93091 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a4a7>
  e9300a:	66 0f ef c0          	pxor   xmm0,xmm0
  e9300e:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
  e93015:	00
  e93016:	66 41 0f 7f 46 10    	movdqa XMMWORD PTR [r14+0x10],xmm0
  e9301c:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
  e93021:	41 c7 46 20 00 00 80 	mov    DWORD PTR [r14+0x20],0x3f800000
  e93028:	3f
  e93029:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e93030:	00
  e93031:	4c 89 f6             	mov    rsi,r14
  e93034:	e8 c3 63 00 00       	call   e993fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60812>
  e93039:	4c 89 f7             	mov    rdi,r14
  e9303c:	e8 25 f6 c4 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
  e93041:	40 84 ed             	test   bpl,bpl
  e93044:	74 14                	je     e9305a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a470>
  e93046:	48 8d 35 13 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c13]        # 43bc60 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x186c>
  e9304d:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e93054:	00
  e93055:	e8 16 a8 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e9305a:	84 db                	test   bl,bl
  e9305c:	74 14                	je     e93072 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a488>
  e9305e:	48 8d 35 13 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c13]        # 43bc78 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1884>
  e93065:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9306c:	00
  e9306d:	e8 fe a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e93072:	48 83 bc 24 00 04 00 	cmp    QWORD PTR [rsp+0x400],0x0
  e93079:	00 00
  e9307b:	74 14                	je     e93091 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a4a7>
  e9307d:	48 8d 35 0c 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c0c]        # 43bc90 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x189c>
  e93084:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9308b:	00
  e9308c:	e8 df a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
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
```
### `0xe92f9b`

```text
  e92f26:	e9 47 8f 01 00       	jmp    eabe72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x73288>
  e92f2b:	cc                   	int3
  e92f2c:	55                   	push   rbp
  e92f2d:	41 57                	push   r15
  e92f2f:	41 56                	push   r14
  e92f31:	41 55                	push   r13
  e92f33:	41 54                	push   r12
  e92f35:	53                   	push   rbx
  e92f36:	48 81 ec b8 10 00 00 	sub    rsp,0x10b8
  e92f3d:	48 89 8c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rcx
  e92f44:	00
  e92f45:	48 89 94 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rdx
  e92f4c:	00
  e92f4d:	49 89 f5             	mov    r13,rsi
  e92f50:	49 89 ff             	mov    r15,rdi
  e92f53:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e92f5a:	00 00
  e92f5c:	48 89 84 24 b0 10 00 	mov    QWORD PTR [rsp+0x10b0],rax
  e92f63:	00
  e92f64:	48 8b b6 80 04 00 00 	mov    rsi,QWORD PTR [rsi+0x480]
  e92f6b:	48 8d bc 24 90 03 00 	lea    rdi,[rsp+0x390]
  e92f72:	00
  e92f73:	e8 40 ff c5 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>
  e92f78:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92f7f:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92f82:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92f86:	48 8d 15 28 8b 4d ff 	lea    rdx,[rip+0xffffffffff4d8b28]        # 36bab5 <_ZTSSt12bad_any_cast@@Base-0x24713>
  e92f8d:	e8 27 64 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92f92:	b3 01                	mov    bl,0x1
  e92f94:	40 b5 01             	mov    bpl,0x1
  e92f97:	84 c0                	test   al,al
  e92f99:	75 1c                	jne    e92fb7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a3cd>
  e92f9b:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92fa2:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92fa5:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92fa9:	48 8d 15 b8 03 4a ff 	lea    rdx,[rip+0xffffffffff4a03b8]        # 333368 <_ZTSSt12bad_any_cast@@Base-0x5ce60>
  e92fb0:	e8 04 64 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92fb5:	89 c5                	mov    ebp,eax
  e92fb7:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92fbe:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92fc1:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92fc5:	48 8d 15 1a 6d 4a ff 	lea    rdx,[rip+0xffffffffff4a6d1a]        # 339ce6 <_ZTSSt12bad_any_cast@@Base-0x564e2>
  e92fcc:	e8 e8 63 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92fd1:	84 c0                	test   al,al
  e92fd3:	75 1c                	jne    e92ff1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a407>
  e92fd5:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92fdc:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92fdf:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92fe3:	48 8d 15 7e 03 4a ff 	lea    rdx,[rip+0xffffffffff4a037e]        # 333368 <_ZTSSt12bad_any_cast@@Base-0x5ce60>
  e92fea:	e8 ca 63 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92fef:	89 c3                	mov    ebx,eax
  e92ff1:	31 c0                	xor    eax,eax
  e92ff3:	88 84 24 e8 03 00 00 	mov    BYTE PTR [rsp+0x3e8],al
  e92ffa:	88 84 24 10 04 00 00 	mov    BYTE PTR [rsp+0x410],al
  e93001:	40 84 dd             	test   bpl,bl
  e93004:	0f 85 87 00 00 00    	jne    e93091 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a4a7>
  e9300a:	66 0f ef c0          	pxor   xmm0,xmm0
  e9300e:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
  e93015:	00
  e93016:	66 41 0f 7f 46 10    	movdqa XMMWORD PTR [r14+0x10],xmm0
  e9301c:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
  e93021:	41 c7 46 20 00 00 80 	mov    DWORD PTR [r14+0x20],0x3f800000
  e93028:	3f
  e93029:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e93030:	00
  e93031:	4c 89 f6             	mov    rsi,r14
  e93034:	e8 c3 63 00 00       	call   e993fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60812>
  e93039:	4c 89 f7             	mov    rdi,r14
  e9303c:	e8 25 f6 c4 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
  e93041:	40 84 ed             	test   bpl,bpl
  e93044:	74 14                	je     e9305a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a470>
  e93046:	48 8d 35 13 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c13]        # 43bc60 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x186c>
  e9304d:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e93054:	00
  e93055:	e8 16 a8 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e9305a:	84 db                	test   bl,bl
  e9305c:	74 14                	je     e93072 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a488>
  e9305e:	48 8d 35 13 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c13]        # 43bc78 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1884>
  e93065:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9306c:	00
  e9306d:	e8 fe a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e93072:	48 83 bc 24 00 04 00 	cmp    QWORD PTR [rsp+0x400],0x0
  e93079:	00 00
  e9307b:	74 14                	je     e93091 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a4a7>
  e9307d:	48 8d 35 0c 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c0c]        # 43bc90 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x189c>
  e93084:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9308b:	00
  e9308c:	e8 df a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
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
```
### `0xe92fb7`

```text
  e92f33:	41 54                	push   r12
  e92f35:	53                   	push   rbx
  e92f36:	48 81 ec b8 10 00 00 	sub    rsp,0x10b8
  e92f3d:	48 89 8c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rcx
  e92f44:	00
  e92f45:	48 89 94 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rdx
  e92f4c:	00
  e92f4d:	49 89 f5             	mov    r13,rsi
  e92f50:	49 89 ff             	mov    r15,rdi
  e92f53:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e92f5a:	00 00
  e92f5c:	48 89 84 24 b0 10 00 	mov    QWORD PTR [rsp+0x10b0],rax
  e92f63:	00
  e92f64:	48 8b b6 80 04 00 00 	mov    rsi,QWORD PTR [rsi+0x480]
  e92f6b:	48 8d bc 24 90 03 00 	lea    rdi,[rsp+0x390]
  e92f72:	00
  e92f73:	e8 40 ff c5 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>
  e92f78:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92f7f:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92f82:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92f86:	48 8d 15 28 8b 4d ff 	lea    rdx,[rip+0xffffffffff4d8b28]        # 36bab5 <_ZTSSt12bad_any_cast@@Base-0x24713>
  e92f8d:	e8 27 64 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92f92:	b3 01                	mov    bl,0x1
  e92f94:	40 b5 01             	mov    bpl,0x1
  e92f97:	84 c0                	test   al,al
  e92f99:	75 1c                	jne    e92fb7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a3cd>
  e92f9b:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92fa2:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92fa5:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92fa9:	48 8d 15 b8 03 4a ff 	lea    rdx,[rip+0xffffffffff4a03b8]        # 333368 <_ZTSSt12bad_any_cast@@Base-0x5ce60>
  e92fb0:	e8 04 64 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92fb5:	89 c5                	mov    ebp,eax
  e92fb7:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92fbe:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92fc1:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92fc5:	48 8d 15 1a 6d 4a ff 	lea    rdx,[rip+0xffffffffff4a6d1a]        # 339ce6 <_ZTSSt12bad_any_cast@@Base-0x564e2>
  e92fcc:	e8 e8 63 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92fd1:	84 c0                	test   al,al
  e92fd3:	75 1c                	jne    e92ff1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a407>
  e92fd5:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92fdc:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92fdf:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92fe3:	48 8d 15 7e 03 4a ff 	lea    rdx,[rip+0xffffffffff4a037e]        # 333368 <_ZTSSt12bad_any_cast@@Base-0x5ce60>
  e92fea:	e8 ca 63 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92fef:	89 c3                	mov    ebx,eax
  e92ff1:	31 c0                	xor    eax,eax
  e92ff3:	88 84 24 e8 03 00 00 	mov    BYTE PTR [rsp+0x3e8],al
  e92ffa:	88 84 24 10 04 00 00 	mov    BYTE PTR [rsp+0x410],al
  e93001:	40 84 dd             	test   bpl,bl
  e93004:	0f 85 87 00 00 00    	jne    e93091 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a4a7>
  e9300a:	66 0f ef c0          	pxor   xmm0,xmm0
  e9300e:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
  e93015:	00
  e93016:	66 41 0f 7f 46 10    	movdqa XMMWORD PTR [r14+0x10],xmm0
  e9301c:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
  e93021:	41 c7 46 20 00 00 80 	mov    DWORD PTR [r14+0x20],0x3f800000
  e93028:	3f
  e93029:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e93030:	00
  e93031:	4c 89 f6             	mov    rsi,r14
  e93034:	e8 c3 63 00 00       	call   e993fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60812>
  e93039:	4c 89 f7             	mov    rdi,r14
  e9303c:	e8 25 f6 c4 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
  e93041:	40 84 ed             	test   bpl,bpl
  e93044:	74 14                	je     e9305a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a470>
  e93046:	48 8d 35 13 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c13]        # 43bc60 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x186c>
  e9304d:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e93054:	00
  e93055:	e8 16 a8 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e9305a:	84 db                	test   bl,bl
  e9305c:	74 14                	je     e93072 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a488>
  e9305e:	48 8d 35 13 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c13]        # 43bc78 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1884>
  e93065:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9306c:	00
  e9306d:	e8 fe a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e93072:	48 83 bc 24 00 04 00 	cmp    QWORD PTR [rsp+0x400],0x0
  e93079:	00 00
  e9307b:	74 14                	je     e93091 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a4a7>
  e9307d:	48 8d 35 0c 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c0c]        # 43bc90 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x189c>
  e93084:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9308b:	00
  e9308c:	e8 df a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
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
```
### `0xe92fd5`

```text
  e92f4d:	49 89 f5             	mov    r13,rsi
  e92f50:	49 89 ff             	mov    r15,rdi
  e92f53:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e92f5a:	00 00
  e92f5c:	48 89 84 24 b0 10 00 	mov    QWORD PTR [rsp+0x10b0],rax
  e92f63:	00
  e92f64:	48 8b b6 80 04 00 00 	mov    rsi,QWORD PTR [rsi+0x480]
  e92f6b:	48 8d bc 24 90 03 00 	lea    rdi,[rsp+0x390]
  e92f72:	00
  e92f73:	e8 40 ff c5 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>
  e92f78:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92f7f:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92f82:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92f86:	48 8d 15 28 8b 4d ff 	lea    rdx,[rip+0xffffffffff4d8b28]        # 36bab5 <_ZTSSt12bad_any_cast@@Base-0x24713>
  e92f8d:	e8 27 64 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92f92:	b3 01                	mov    bl,0x1
  e92f94:	40 b5 01             	mov    bpl,0x1
  e92f97:	84 c0                	test   al,al
  e92f99:	75 1c                	jne    e92fb7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a3cd>
  e92f9b:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92fa2:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92fa5:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92fa9:	48 8d 15 b8 03 4a ff 	lea    rdx,[rip+0xffffffffff4a03b8]        # 333368 <_ZTSSt12bad_any_cast@@Base-0x5ce60>
  e92fb0:	e8 04 64 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92fb5:	89 c5                	mov    ebp,eax
  e92fb7:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92fbe:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92fc1:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92fc5:	48 8d 15 1a 6d 4a ff 	lea    rdx,[rip+0xffffffffff4a6d1a]        # 339ce6 <_ZTSSt12bad_any_cast@@Base-0x564e2>
  e92fcc:	e8 e8 63 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92fd1:	84 c0                	test   al,al
  e92fd3:	75 1c                	jne    e92ff1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a407>
  e92fd5:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92fdc:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92fdf:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92fe3:	48 8d 15 7e 03 4a ff 	lea    rdx,[rip+0xffffffffff4a037e]        # 333368 <_ZTSSt12bad_any_cast@@Base-0x5ce60>
  e92fea:	e8 ca 63 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92fef:	89 c3                	mov    ebx,eax
  e92ff1:	31 c0                	xor    eax,eax
  e92ff3:	88 84 24 e8 03 00 00 	mov    BYTE PTR [rsp+0x3e8],al
  e92ffa:	88 84 24 10 04 00 00 	mov    BYTE PTR [rsp+0x410],al
  e93001:	40 84 dd             	test   bpl,bl
  e93004:	0f 85 87 00 00 00    	jne    e93091 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a4a7>
  e9300a:	66 0f ef c0          	pxor   xmm0,xmm0
  e9300e:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
  e93015:	00
  e93016:	66 41 0f 7f 46 10    	movdqa XMMWORD PTR [r14+0x10],xmm0
  e9301c:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
  e93021:	41 c7 46 20 00 00 80 	mov    DWORD PTR [r14+0x20],0x3f800000
  e93028:	3f
  e93029:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e93030:	00
  e93031:	4c 89 f6             	mov    rsi,r14
  e93034:	e8 c3 63 00 00       	call   e993fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60812>
  e93039:	4c 89 f7             	mov    rdi,r14
  e9303c:	e8 25 f6 c4 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
  e93041:	40 84 ed             	test   bpl,bpl
  e93044:	74 14                	je     e9305a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a470>
  e93046:	48 8d 35 13 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c13]        # 43bc60 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x186c>
  e9304d:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e93054:	00
  e93055:	e8 16 a8 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e9305a:	84 db                	test   bl,bl
  e9305c:	74 14                	je     e93072 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a488>
  e9305e:	48 8d 35 13 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c13]        # 43bc78 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1884>
  e93065:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9306c:	00
  e9306d:	e8 fe a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e93072:	48 83 bc 24 00 04 00 	cmp    QWORD PTR [rsp+0x400],0x0
  e93079:	00 00
  e9307b:	74 14                	je     e93091 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a4a7>
  e9307d:	48 8d 35 0c 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c0c]        # 43bc90 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x189c>
  e93084:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9308b:	00
  e9308c:	e8 df a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
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
```
### `0xe92ffa`

```text
  e92f72:	00
  e92f73:	e8 40 ff c5 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>
  e92f78:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92f7f:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92f82:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92f86:	48 8d 15 28 8b 4d ff 	lea    rdx,[rip+0xffffffffff4d8b28]        # 36bab5 <_ZTSSt12bad_any_cast@@Base-0x24713>
  e92f8d:	e8 27 64 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92f92:	b3 01                	mov    bl,0x1
  e92f94:	40 b5 01             	mov    bpl,0x1
  e92f97:	84 c0                	test   al,al
  e92f99:	75 1c                	jne    e92fb7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a3cd>
  e92f9b:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92fa2:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92fa5:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92fa9:	48 8d 15 b8 03 4a ff 	lea    rdx,[rip+0xffffffffff4a03b8]        # 333368 <_ZTSSt12bad_any_cast@@Base-0x5ce60>
  e92fb0:	e8 04 64 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92fb5:	89 c5                	mov    ebp,eax
  e92fb7:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92fbe:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92fc1:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92fc5:	48 8d 15 1a 6d 4a ff 	lea    rdx,[rip+0xffffffffff4a6d1a]        # 339ce6 <_ZTSSt12bad_any_cast@@Base-0x564e2>
  e92fcc:	e8 e8 63 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92fd1:	84 c0                	test   al,al
  e92fd3:	75 1c                	jne    e92ff1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a407>
  e92fd5:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92fdc:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92fdf:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92fe3:	48 8d 15 7e 03 4a ff 	lea    rdx,[rip+0xffffffffff4a037e]        # 333368 <_ZTSSt12bad_any_cast@@Base-0x5ce60>
  e92fea:	e8 ca 63 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92fef:	89 c3                	mov    ebx,eax
  e92ff1:	31 c0                	xor    eax,eax
  e92ff3:	88 84 24 e8 03 00 00 	mov    BYTE PTR [rsp+0x3e8],al
  e92ffa:	88 84 24 10 04 00 00 	mov    BYTE PTR [rsp+0x410],al
  e93001:	40 84 dd             	test   bpl,bl
  e93004:	0f 85 87 00 00 00    	jne    e93091 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a4a7>
  e9300a:	66 0f ef c0          	pxor   xmm0,xmm0
  e9300e:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
  e93015:	00
  e93016:	66 41 0f 7f 46 10    	movdqa XMMWORD PTR [r14+0x10],xmm0
  e9301c:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
  e93021:	41 c7 46 20 00 00 80 	mov    DWORD PTR [r14+0x20],0x3f800000
  e93028:	3f
  e93029:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e93030:	00
  e93031:	4c 89 f6             	mov    rsi,r14
  e93034:	e8 c3 63 00 00       	call   e993fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60812>
  e93039:	4c 89 f7             	mov    rdi,r14
  e9303c:	e8 25 f6 c4 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
  e93041:	40 84 ed             	test   bpl,bpl
  e93044:	74 14                	je     e9305a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a470>
  e93046:	48 8d 35 13 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c13]        # 43bc60 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x186c>
  e9304d:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e93054:	00
  e93055:	e8 16 a8 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e9305a:	84 db                	test   bl,bl
  e9305c:	74 14                	je     e93072 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a488>
  e9305e:	48 8d 35 13 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c13]        # 43bc78 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1884>
  e93065:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9306c:	00
  e9306d:	e8 fe a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e93072:	48 83 bc 24 00 04 00 	cmp    QWORD PTR [rsp+0x400],0x0
  e93079:	00 00
  e9307b:	74 14                	je     e93091 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a4a7>
  e9307d:	48 8d 35 0c 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c0c]        # 43bc90 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x189c>
  e93084:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9308b:	00
  e9308c:	e8 df a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
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
```
### `0xe93091`

```text
  e9300a:	66 0f ef c0          	pxor   xmm0,xmm0
  e9300e:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
  e93015:	00
  e93016:	66 41 0f 7f 46 10    	movdqa XMMWORD PTR [r14+0x10],xmm0
  e9301c:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
  e93021:	41 c7 46 20 00 00 80 	mov    DWORD PTR [r14+0x20],0x3f800000
  e93028:	3f
  e93029:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e93030:	00
  e93031:	4c 89 f6             	mov    rsi,r14
  e93034:	e8 c3 63 00 00       	call   e993fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60812>
  e93039:	4c 89 f7             	mov    rdi,r14
  e9303c:	e8 25 f6 c4 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
  e93041:	40 84 ed             	test   bpl,bpl
  e93044:	74 14                	je     e9305a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a470>
  e93046:	48 8d 35 13 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c13]        # 43bc60 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x186c>
  e9304d:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e93054:	00
  e93055:	e8 16 a8 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e9305a:	84 db                	test   bl,bl
  e9305c:	74 14                	je     e93072 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a488>
  e9305e:	48 8d 35 13 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c13]        # 43bc78 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1884>
  e93065:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9306c:	00
  e9306d:	e8 fe a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e93072:	48 83 bc 24 00 04 00 	cmp    QWORD PTR [rsp+0x400],0x0
  e93079:	00 00
  e9307b:	74 14                	je     e93091 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a4a7>
  e9307d:	48 8d 35 0c 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c0c]        # 43bc90 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x189c>
  e93084:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9308b:	00
  e9308c:	e8 df a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
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
  e93166:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
  e9316c:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
  e93173:	00
  e93174:	48 8d b4 24 30 03 00 	lea    rsi,[rsp+0x330]
  e9317b:	00
  e9317c:	e8 4d 63 00 00       	call   e994ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608e4>
  e93181:	4c 8d a4 24 30 03 00 	lea    r12,[rsp+0x330]
  e93188:	00
  e93189:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
  e9318e:	e8 f3 b2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e93193:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e9319a:	00
  e9319b:	e8 48 76 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e931a0:	4c 8d ac 24 10 0e 00 	lea    r13,[rsp+0xe10]
  e931a7:	00
  e931a8:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  e931ac:	e8 01 b3 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e931b1:	4d 89 75 00          	mov    QWORD PTR [r13+0x0],r14
  e931b5:	49 89 5d 08          	mov    QWORD PTR [r13+0x8],rbx
  e931b9:	4d 89 7d 10          	mov    QWORD PTR [r13+0x10],r15
  e931bd:	48 8d 35 b2 66 c9 ff 	lea    rsi,[rip+0xffffffffffc966b2]        # b29876 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x76816>
  e931c4:	48 8d 15 1e aa cf ff 	lea    rdx,[rip+0xffffffffffcfaa1e]        # b8dbe9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdab89>
  e931cb:	48 8d 0d ca 63 00 00 	lea    rcx,[rip+0x63ca]        # e9959c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x609b2>
  e931d2:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]
```
### `0xe930b3`

```text
  e93028:	3f
  e93029:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e93030:	00
  e93031:	4c 89 f6             	mov    rsi,r14
  e93034:	e8 c3 63 00 00       	call   e993fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60812>
  e93039:	4c 89 f7             	mov    rdi,r14
  e9303c:	e8 25 f6 c4 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
  e93041:	40 84 ed             	test   bpl,bpl
  e93044:	74 14                	je     e9305a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a470>
  e93046:	48 8d 35 13 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c13]        # 43bc60 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x186c>
  e9304d:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e93054:	00
  e93055:	e8 16 a8 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e9305a:	84 db                	test   bl,bl
  e9305c:	74 14                	je     e93072 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a488>
  e9305e:	48 8d 35 13 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c13]        # 43bc78 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1884>
  e93065:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9306c:	00
  e9306d:	e8 fe a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e93072:	48 83 bc 24 00 04 00 	cmp    QWORD PTR [rsp+0x400],0x0
  e93079:	00 00
  e9307b:	74 14                	je     e93091 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a4a7>
  e9307d:	48 8d 35 0c 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c0c]        # 43bc90 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x189c>
  e93084:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9308b:	00
  e9308c:	e8 df a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
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
  e93166:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
  e9316c:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
  e93173:	00
  e93174:	48 8d b4 24 30 03 00 	lea    rsi,[rsp+0x330]
  e9317b:	00
  e9317c:	e8 4d 63 00 00       	call   e994ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608e4>
  e93181:	4c 8d a4 24 30 03 00 	lea    r12,[rsp+0x330]
  e93188:	00
  e93189:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
  e9318e:	e8 f3 b2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e93193:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e9319a:	00
  e9319b:	e8 48 76 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e931a0:	4c 8d ac 24 10 0e 00 	lea    r13,[rsp+0xe10]
  e931a7:	00
  e931a8:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  e931ac:	e8 01 b3 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e931b1:	4d 89 75 00          	mov    QWORD PTR [r13+0x0],r14
  e931b5:	49 89 5d 08          	mov    QWORD PTR [r13+0x8],rbx
  e931b9:	4d 89 7d 10          	mov    QWORD PTR [r13+0x10],r15
  e931bd:	48 8d 35 b2 66 c9 ff 	lea    rsi,[rip+0xffffffffffc966b2]        # b29876 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x76816>
  e931c4:	48 8d 15 1e aa cf ff 	lea    rdx,[rip+0xffffffffffcfaa1e]        # b8dbe9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdab89>
  e931cb:	48 8d 0d ca 63 00 00 	lea    rcx,[rip+0x63ca]        # e9959c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x609b2>
  e931d2:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]
  e931d9:	00
  e931da:	6a 18                	push   0x18
  e931dc:	41 59                	pop    r9
  e931de:	48 89 df             	mov    rdi,rbx
  e931e1:	4d 89 e8             	mov    r8,r13
  e931e4:	e8 ab 75 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
```
### `0xe930dd`

```text
  e9304d:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e93054:	00
  e93055:	e8 16 a8 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e9305a:	84 db                	test   bl,bl
  e9305c:	74 14                	je     e93072 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a488>
  e9305e:	48 8d 35 13 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c13]        # 43bc78 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1884>
  e93065:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9306c:	00
  e9306d:	e8 fe a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e93072:	48 83 bc 24 00 04 00 	cmp    QWORD PTR [rsp+0x400],0x0
  e93079:	00 00
  e9307b:	74 14                	je     e93091 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a4a7>
  e9307d:	48 8d 35 0c 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c0c]        # 43bc90 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x189c>
  e93084:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9308b:	00
  e9308c:	e8 df a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
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
  e93166:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
  e9316c:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
  e93173:	00
  e93174:	48 8d b4 24 30 03 00 	lea    rsi,[rsp+0x330]
  e9317b:	00
  e9317c:	e8 4d 63 00 00       	call   e994ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608e4>
  e93181:	4c 8d a4 24 30 03 00 	lea    r12,[rsp+0x330]
  e93188:	00
  e93189:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
  e9318e:	e8 f3 b2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e93193:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e9319a:	00
  e9319b:	e8 48 76 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e931a0:	4c 8d ac 24 10 0e 00 	lea    r13,[rsp+0xe10]
  e931a7:	00
  e931a8:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  e931ac:	e8 01 b3 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e931b1:	4d 89 75 00          	mov    QWORD PTR [r13+0x0],r14
  e931b5:	49 89 5d 08          	mov    QWORD PTR [r13+0x8],rbx
  e931b9:	4d 89 7d 10          	mov    QWORD PTR [r13+0x10],r15
  e931bd:	48 8d 35 b2 66 c9 ff 	lea    rsi,[rip+0xffffffffffc966b2]        # b29876 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x76816>
  e931c4:	48 8d 15 1e aa cf ff 	lea    rdx,[rip+0xffffffffffcfaa1e]        # b8dbe9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdab89>
  e931cb:	48 8d 0d ca 63 00 00 	lea    rcx,[rip+0x63ca]        # e9959c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x609b2>
  e931d2:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]
  e931d9:	00
  e931da:	6a 18                	push   0x18
  e931dc:	41 59                	pop    r9
  e931de:	48 89 df             	mov    rdi,rbx
  e931e1:	4d 89 e8             	mov    r8,r13
  e931e4:	e8 ab 75 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e931e9:	49 8b 06             	mov    rax,QWORD PTR [r14]
  e931ec:	4c 89 e7             	mov    rdi,r12
  e931ef:	4c 89 f6             	mov    rsi,r14
  e931f2:	48 89 da             	mov    rdx,rbx
  e931f5:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
  e931fb:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
  e93202:	00
  e93203:	48 8d b4 24 30 03 00 	lea    rsi,[rsp+0x330]
  e9320a:	00
  e9320b:	e8 be 62 00 00       	call   e994ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608e4>
```
### `0xe930e5`

```text
  e93055:	e8 16 a8 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e9305a:	84 db                	test   bl,bl
  e9305c:	74 14                	je     e93072 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a488>
  e9305e:	48 8d 35 13 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c13]        # 43bc78 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1884>
  e93065:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9306c:	00
  e9306d:	e8 fe a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e93072:	48 83 bc 24 00 04 00 	cmp    QWORD PTR [rsp+0x400],0x0
  e93079:	00 00
  e9307b:	74 14                	je     e93091 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a4a7>
  e9307d:	48 8d 35 0c 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c0c]        # 43bc90 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x189c>
  e93084:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9308b:	00
  e9308c:	e8 df a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
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
  e93166:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
  e9316c:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
  e93173:	00
  e93174:	48 8d b4 24 30 03 00 	lea    rsi,[rsp+0x330]
  e9317b:	00
  e9317c:	e8 4d 63 00 00       	call   e994ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608e4>
  e93181:	4c 8d a4 24 30 03 00 	lea    r12,[rsp+0x330]
  e93188:	00
  e93189:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
  e9318e:	e8 f3 b2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e93193:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e9319a:	00
  e9319b:	e8 48 76 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e931a0:	4c 8d ac 24 10 0e 00 	lea    r13,[rsp+0xe10]
  e931a7:	00
  e931a8:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  e931ac:	e8 01 b3 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e931b1:	4d 89 75 00          	mov    QWORD PTR [r13+0x0],r14
  e931b5:	49 89 5d 08          	mov    QWORD PTR [r13+0x8],rbx
  e931b9:	4d 89 7d 10          	mov    QWORD PTR [r13+0x10],r15
  e931bd:	48 8d 35 b2 66 c9 ff 	lea    rsi,[rip+0xffffffffffc966b2]        # b29876 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x76816>
  e931c4:	48 8d 15 1e aa cf ff 	lea    rdx,[rip+0xffffffffffcfaa1e]        # b8dbe9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdab89>
  e931cb:	48 8d 0d ca 63 00 00 	lea    rcx,[rip+0x63ca]        # e9959c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x609b2>
  e931d2:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]
  e931d9:	00
  e931da:	6a 18                	push   0x18
  e931dc:	41 59                	pop    r9
  e931de:	48 89 df             	mov    rdi,rbx
  e931e1:	4d 89 e8             	mov    r8,r13
  e931e4:	e8 ab 75 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e931e9:	49 8b 06             	mov    rax,QWORD PTR [r14]
  e931ec:	4c 89 e7             	mov    rdi,r12
  e931ef:	4c 89 f6             	mov    rsi,r14
  e931f2:	48 89 da             	mov    rdx,rbx
  e931f5:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
  e931fb:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
  e93202:	00
  e93203:	48 8d b4 24 30 03 00 	lea    rsi,[rsp+0x330]
  e9320a:	00
  e9320b:	e8 be 62 00 00       	call   e994ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608e4>
  e93210:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
  e93215:	48 8b bc 24 38 03 00 	mov    rdi,QWORD PTR [rsp+0x338]
```
### `0xe932b6`

```text
  e93236:	00
  e93237:	e8 76 b2 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e9323c:	31 ff                	xor    edi,edi
  e9323e:	e8 6f b2 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e93243:	31 ff                	xor    edi,edi
  e93245:	e8 68 b2 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e9324a:	49 8d bd e0 03 00 00 	lea    rdi,[r13+0x3e0]
  e93251:	48 8d 9c 24 50 10 00 	lea    rbx,[rsp+0x1050]
  e93258:	00
  e93259:	48 89 de             	mov    rsi,rbx
  e9325c:	e8 fd 63 00 00       	call   e9965e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60a74>
  e93261:	48 89 df             	mov    rdi,rbx
  e93264:	e8 fb 98 c2 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
  e93269:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
  e93270:	00
  e93271:	e8 f4 6c be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e93276:	48 8d 1d 63 b6 97 00 	lea    rbx,[rip+0x97b663]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
  e9327d:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
  e93281:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e93284:	48 8d 35 06 0b 54 ff 	lea    rsi,[rip+0xffffffffff540b06]        # 3d3d91 <_ZTSN5boost17bad_function_callE@@Base+0x10d7>
  e9328b:	48 8d 0d 0e 0b 54 ff 	lea    rcx,[rip+0xffffffffff540b0e]        # 3d3da0 <_ZTSN5boost17bad_function_callE@@Base+0x10e6>
  e93292:	6a 0b                	push   0xb
  e93294:	5a                   	pop    rdx
  e93295:	6a 17                	push   0x17
  e93297:	41 58                	pop    r8
  e93299:	45 31 c9             	xor    r9d,r9d
  e9329c:	e8 e9 40 75 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e932a1:	66 0f ef c0          	pxor   xmm0,xmm0
  e932a5:	66 0f 7f 84 24 80 03 	movdqa XMMWORD PTR [rsp+0x380],xmm0
  e932ac:	00 00
  e932ae:	84 c0                	test   al,al
  e932b0:	0f 84 45 03 00 00    	je     e935fb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5aa11>
  e932b6:	49 8b 85 70 05 00 00 	mov    rax,QWORD PTR [r13+0x570]
  e932bd:	80 78 01 00          	cmp    BYTE PTR [rax+0x1],0x0
  e932c1:	0f 85 34 03 00 00    	jne    e935fb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5aa11>
  e932c7:	48 8d 84 24 20 0f 00 	lea    rax,[rsp+0xf20]
  e932ce:	00
  e932cf:	48 89 18             	mov    QWORD PTR [rax],rbx
  e932d2:	48 8b 0d c7 e7 a1 00 	mov    rcx,QWORD PTR [rip+0xa1e7c7]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
  e932d9:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  e932dd:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
  e932e1:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
  e932e5:	4d 8b a5 e8 00 00 00 	mov    r12,QWORD PTR [r13+0xe8]
  e932ec:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e932ef:	48 8d 35 c2 0a 54 ff 	lea    rsi,[rip+0xffffffffff540ac2]        # 3d3db8 <_ZTSN5boost17bad_function_callE@@Base+0x10fe>
  e932f6:	48 8d 0d d3 0a 54 ff 	lea    rcx,[rip+0xffffffffff540ad3]        # 3d3dd0 <_ZTSN5boost17bad_function_callE@@Base+0x1116>
  e932fd:	6a 0b                	push   0xb
  e932ff:	5a                   	pop    rdx
  e93300:	6a 20                	push   0x20
  e93302:	41 58                	pop    r8
  e93304:	6a 3c                	push   0x3c
  e93306:	41 59                	pop    r9
  e93308:	e8 1d 41 75 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  e9330d:	89 c5                	mov    ebp,eax
  e9330f:	bf c0 00 00 00       	mov    edi,0xc0
  e93314:	e8 e7 ab 95 00       	call   17edf00 <_Znwm@plt>
  e93319:	49 89 c6             	mov    r14,rax
  e9331c:	4c 63 ed             	movsxd r13,ebp
  e9331f:	4c 8d bc 24 e0 0b 00 	lea    r15,[rsp+0xbe0]
  e93326:	00
  e93327:	49 89 1f             	mov    QWORD PTR [r15],rbx
  e9332a:	48 8b 05 6f e7 a1 00 	mov    rax,QWORD PTR [rip+0xa1e76f]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
  e93331:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
  e93335:	4d 89 7f 20          	mov    QWORD PTR [r15+0x20],r15
  e93339:	4c 89 f7             	mov    rdi,r14
  e9333c:	e8 4d 4f c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
  e93341:	31 ed                	xor    ebp,ebp
  e93343:	41 88 6e 58          	mov    BYTE PTR [r14+0x58],bpl
  e93347:	49 8d 7e 60          	lea    rdi,[r14+0x60]
  e9334b:	4c 89 fe             	mov    rsi,r15
  e9334e:	e8 9d 4b c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
  e93353:	4d 89 ae 90 00 00 00 	mov    QWORD PTR [r14+0x90],r13
  e9335a:	41 88 ae 98 00 00 00 	mov    BYTE PTR [r14+0x98],bpl
  e93361:	41 88 ae a0 00 00 00 	mov    BYTE PTR [r14+0xa0],bpl
  e93368:	4c 89 f7             	mov    rdi,r14
  e9336b:	48 81 c7 a8 00 00 00 	add    rdi,0xa8
  e93372:	4c 89 e6             	mov    rsi,r12
  e93375:	e8 48 e3 92 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
  e9337a:	4c 89 b4 24 50 10 00 	mov    QWORD PTR [rsp+0x1050],r14
  e93381:	00
  e93382:	4c 89 ff             	mov    rdi,r15
  e93385:	e8 e0 6b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9338a:	6a 70                	push   0x70
  e9338c:	5f                   	pop    rdi
  e9338d:	e8 6e ab 95 00       	call   17edf00 <_Znwm@plt>
  e93392:	48 89 c3             	mov    rbx,rax
  e93395:	66 0f ef c0          	pxor   xmm0,xmm0
  e93399:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e9339e:	48 8d 05 23 7a 97 00 	lea    rax,[rip+0x977a23]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
  e933a5:	48 89 03             	mov    QWORD PTR [rbx],rax
  e933a8:	4c 8d 63 20          	lea    r12,[rbx+0x20]
  e933ac:	4c 8d bc 24 e0 0b 00 	lea    r15,[rsp+0xbe0]
  e933b3:	00
  e933b4:	48 8d b4 24 20 0f 00 	lea    rsi,[rsp+0xf20]
  e933bb:	00
  e933bc:	4c 89 ff             	mov    rdi,r15
  e933bf:	e8 2c 4b c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
  e933c4:	48 8d 05 f5 0f 9b 00 	lea    rax,[rip+0x9b0ff5]        # 18443c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xaa8>
  e933cb:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
  e933cf:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
  e933d3:	4c 89 fe             	mov    rsi,r15
  e933d6:	e8 15 4b c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
  e933db:	48 83 a4 24 50 10 00 	and    QWORD PTR [rsp+0x1050],0x0
  e933e2:	00 00
  e933e4:	4c 89 73 60          	mov    QWORD PTR [rbx+0x60],r14
  e933e8:	48 83 7b 50 00       	cmp    QWORD PTR [rbx+0x50],0x0
  e933ed:	0f 84 8e 47 00 00    	je     e97b81 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ef97>
```
### `0xe9344e`

```text
  e933c4:	48 8d 05 f5 0f 9b 00 	lea    rax,[rip+0x9b0ff5]        # 18443c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xaa8>
  e933cb:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
  e933cf:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
  e933d3:	4c 89 fe             	mov    rsi,r15
  e933d6:	e8 15 4b c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
  e933db:	48 83 a4 24 50 10 00 	and    QWORD PTR [rsp+0x1050],0x0
  e933e2:	00 00
  e933e4:	4c 89 73 60          	mov    QWORD PTR [rbx+0x60],r14
  e933e8:	48 83 7b 50 00       	cmp    QWORD PTR [rbx+0x50],0x0
  e933ed:	0f 84 8e 47 00 00    	je     e97b81 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ef97>
  e933f3:	4c 8d 6b 08          	lea    r13,[rbx+0x8]
  e933f7:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e933fe:	00
  e933ff:	e8 66 6b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e93404:	66 48 0f 6e c3       	movq   xmm0,rbx
  e93409:	66 49 0f 6e cc       	movq   xmm1,r12
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
  e934e0:	4c 89 fa             	mov    rdx,r15
  e934e3:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
  e934e9:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
  e934f0:	00
  e934f1:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]
  e934f8:	00
  e934f9:	e8 d0 5f 00 00       	call   e994ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608e4>
  e934fe:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
  e93505:	00
  e93506:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
  e9350a:	e8 77 af c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9350f:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e93516:	00
  e93517:	e8 cc 72 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e9351c:	4c 8d a4 24 30 0a 00 	lea    r12,[rsp+0xa30]
  e93523:	00
  e93524:	4c 89 e7             	mov    rdi,r12
  e93527:	e8 98 73 f6 ff       	call   dfa8c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc794a>
  e9352c:	4d 89 34 24          	mov    QWORD PTR [r12],r14
  e93530:	49 89 5c 24 08       	mov    QWORD PTR [r12+0x8],rbx
  e93535:	66 0f 6f 84 24 90 00 	movdqa xmm0,XMMWORD PTR [rsp+0x90]
  e9353c:	00 00
  e9353e:	f3 41 0f 7f 44 24 10 	movdqu XMMWORD PTR [r12+0x10],xmm0
  e93545:	f0 49 ff 45 00       	lock inc QWORD PTR [r13+0x0]
  e9354a:	48 8d 35 01 6b f6 ff 	lea    rsi,[rip+0xfffffffffff66b01]        # dfa052 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc70d8>
  e93551:	48 8d 15 2e 6b f6 ff 	lea    rdx,[rip+0xfffffffffff66b2e]        # dfa086 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc710c>
  e93558:	48 8d 0d 63 62 00 00 	lea    rcx,[rip+0x6263]        # e997c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60bd8>
  e9355f:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]
  e93566:	00
  e93567:	4c 8d 84 24 30 0a 00 	lea    r8,[rsp+0xa30]
  e9356e:	00
  e9356f:	6a 20                	push   0x20
  e93571:	41 59                	pop    r9
  e93573:	48 89 df             	mov    rdi,rbx
  e93576:	e8 19 72 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e9357b:	49 8b 06             	mov    rax,QWORD PTR [r14]
  e9357e:	4c 89 ff             	mov    rdi,r15
  e93581:	4c 89 f6             	mov    rsi,r14
  e93584:	48 89 da             	mov    rdx,rbx
  e93587:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
```
### `0xe93456`

```text
  e933cf:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
  e933d3:	4c 89 fe             	mov    rsi,r15
  e933d6:	e8 15 4b c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
  e933db:	48 83 a4 24 50 10 00 	and    QWORD PTR [rsp+0x1050],0x0
  e933e2:	00 00
  e933e4:	4c 89 73 60          	mov    QWORD PTR [rbx+0x60],r14
  e933e8:	48 83 7b 50 00       	cmp    QWORD PTR [rbx+0x50],0x0
  e933ed:	0f 84 8e 47 00 00    	je     e97b81 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ef97>
  e933f3:	4c 8d 6b 08          	lea    r13,[rbx+0x8]
  e933f7:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e933fe:	00
  e933ff:	e8 66 6b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e93404:	66 48 0f 6e c3       	movq   xmm0,rbx
  e93409:	66 49 0f 6e cc       	movq   xmm1,r12
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
  e934e0:	4c 89 fa             	mov    rdx,r15
  e934e3:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
  e934e9:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
  e934f0:	00
  e934f1:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]
  e934f8:	00
  e934f9:	e8 d0 5f 00 00       	call   e994ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608e4>
  e934fe:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
  e93505:	00
  e93506:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
  e9350a:	e8 77 af c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9350f:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e93516:	00
  e93517:	e8 cc 72 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e9351c:	4c 8d a4 24 30 0a 00 	lea    r12,[rsp+0xa30]
  e93523:	00
  e93524:	4c 89 e7             	mov    rdi,r12
  e93527:	e8 98 73 f6 ff       	call   dfa8c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc794a>
  e9352c:	4d 89 34 24          	mov    QWORD PTR [r12],r14
  e93530:	49 89 5c 24 08       	mov    QWORD PTR [r12+0x8],rbx
  e93535:	66 0f 6f 84 24 90 00 	movdqa xmm0,XMMWORD PTR [rsp+0x90]
  e9353c:	00 00
  e9353e:	f3 41 0f 7f 44 24 10 	movdqu XMMWORD PTR [r12+0x10],xmm0
  e93545:	f0 49 ff 45 00       	lock inc QWORD PTR [r13+0x0]
  e9354a:	48 8d 35 01 6b f6 ff 	lea    rsi,[rip+0xfffffffffff66b01]        # dfa052 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc70d8>
  e93551:	48 8d 15 2e 6b f6 ff 	lea    rdx,[rip+0xfffffffffff66b2e]        # dfa086 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc710c>
  e93558:	48 8d 0d 63 62 00 00 	lea    rcx,[rip+0x6263]        # e997c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60bd8>
  e9355f:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]
  e93566:	00
  e93567:	4c 8d 84 24 30 0a 00 	lea    r8,[rsp+0xa30]
  e9356e:	00
  e9356f:	6a 20                	push   0x20
  e93571:	41 59                	pop    r9
  e93573:	48 89 df             	mov    rdi,rbx
  e93576:	e8 19 72 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e9357b:	49 8b 06             	mov    rax,QWORD PTR [r14]
  e9357e:	4c 89 ff             	mov    rdi,r15
  e93581:	4c 89 f6             	mov    rsi,r14
  e93584:	48 89 da             	mov    rdx,rbx
  e93587:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
  e9358d:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
  e93594:	00
```
### `0xe947a4`

```text
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
```
### `0xe95091`

```text
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
```
### `0xe95099`

```text
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
```
### `0xe95190`

```text
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
```
## Local virtual calls after receiver production

| addr | instruction |
|---:|---|
| `0xe8d09e` | `e8d09e:	ff 50 38             	call   QWORD PTR [rax+0x38]` |
| `0xe8d0bc` | `e8d0bc:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0xe8d0da` | `e8d0da:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d11b` | `e8d11b:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0xe8d3e6` | `e8d3e6:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d5f9` | `e8d5f9:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d607` | `e8d607:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d617` | `e8d617:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d6a3` | `e8d6a3:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0xe8d6b9` | `e8d6b9:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d6c9` | `e8d6c9:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d6e7` | `e8d6e7:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d78a` | `e8d78a:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0xe8d79b` | `e8d79b:	ff 50 38             	call   QWORD PTR [rax+0x38]` |
| `0xe8d7a9` | `e8d7a9:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d7b6` | `e8d7b6:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d863` | `e8d863:	ff 50 38             	call   QWORD PTR [rax+0x38]` |
| `0xe8d87e` | `e8d87e:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d887` | `e8d887:	ff 51 30             	call   QWORD PTR [rcx+0x30]` |
| `0xe8d894` | `e8d894:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d8aa` | `e8d8aa:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d8b3` | `e8d8b3:	ff 51 28             	call   QWORD PTR [rcx+0x28]` |
| `0xe8d8c5` | `e8d8c5:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d8ce` | `e8d8ce:	ff 51 38             	call   QWORD PTR [rcx+0x38]` |
| `0xe8d8e0` | `e8d8e0:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d93e` | `e8d93e:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0xe8d95b` | `e8d95b:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8dec2` | `e8dec2:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8ecc2` | `e8ecc2:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0xe8f7de` | `e8f7de:	ff 50 38             	call   QWORD PTR [rax+0x38]` |
| `0xe916be` | `e916be:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0xe9240f` | `e9240f:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0xe930da` | `e930da:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe93166` | `e93166:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]` |
| `0xe931f5` | `e931f5:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]` |
| `0xe934e3` | `e934e3:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]` |
| `0xe93587` | `e93587:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]` |
| `0xe9397f` | `e9397f:	ff 51 30             	call   QWORD PTR [rcx+0x30]` |
| `0xe948a9` | `e948a9:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0xe95105` | `e95105:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]` |
| `0xe953fc` | `e953fc:	ff 50 28             	call   QWORD PTR [rax+0x28]` |

## Interpretation

The important local invariant to verify is whether any direct write to `[r13+0x410]` exists in this giant function. If none appears, `[r13+0x410]` is an incoming owner-field initialized by an earlier constructor/factory, so the next target is global writes to offset `+0x410`, not this local callsite.
