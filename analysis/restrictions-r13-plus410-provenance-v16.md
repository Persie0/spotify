# Restrictions `[r13+0x410] -> [rsp+0x390]` producer provenance v16

Focus: localize the object loaded at `e930b3 r15 = [r13+0x410]`, the virtual `+0x28` call at `e930da`, and the post-call receiver pair `[rsp+0x390]/[rsp+0x398]`. Static provenance only.

## Window: producer object load and +0x28 call `0xe930b3`

```text
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
```
## Window: exact virtual +0x28 call `0xe930da`

```text
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
```
## Window: post-call receiver pair read `0xe930dd`

```text
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
```
## Window: same receiver +0xa0 registration `0xe93166`

```text
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
```
## Window: later e99c54 registration via +0xa0 `0xe95105`

```text
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
```
## Local references to producer field / receiver slots / virtual registration calls

| addr | instruction |
|---:|---|
| `0xe8d0da` | `e8d0da:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d3e6` | `e8d3e6:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d5f9` | `e8d5f9:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d607` | `e8d607:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d617` | `e8d617:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d6b9` | `e8d6b9:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d6c9` | `e8d6c9:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d6e7` | `e8d6e7:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d7a9` | `e8d7a9:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d7b6` | `e8d7b6:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d87e` | `e8d87e:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d894` | `e8d894:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d8aa` | `e8d8aa:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d8c5` | `e8d8c5:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d8e0` | `e8d8e0:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d95b` | `e8d95b:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8d984` | `e8d984:	66 0f 7f 84 24 10 04 	movdqa XMMWORD PTR [rsp+0x410],xmm0` |
| `0xe8dec2` | `e8dec2:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe8dec5` | `e8dec5:	48 8b 88 a8 00 00 00 	mov    rcx,QWORD PTR [rax+0xa8]` |
| `0xe8decc` | `e8decc:	f3 0f 6f 80 a0 00 00 	movdqu xmm0,XMMWORD PTR [rax+0xa0]` |
| `0xe8e13b` | `e8e13b:	48 8b bc 24 98 03 00 	mov    rdi,QWORD PTR [rsp+0x398]` |
| `0xe8e74a` | `e8e74a:	48 8b bc 24 98 03 00 	mov    rdi,QWORD PTR [rsp+0x398]` |
| `0xe8fcb9` | `e8fcb9:	48 8d 84 24 10 04 00 	lea    rax,[rsp+0x410]` |
| `0xe91261` | `e91261:	4c 8d ac 24 10 04 00 	lea    r13,[rsp+0x410]` |
| `0xe91290` | `e91290:	48 8b 94 24 10 04 00 	mov    rdx,QWORD PTR [rsp+0x410]` |
| `0xe912bc` | `e912bc:	48 8b bc 24 10 04 00 	mov    rdi,QWORD PTR [rsp+0x410]` |
| `0xe91355` | `e91355:	48 8d bc 24 98 03 00 	lea    rdi,[rsp+0x398]` |
| `0xe92acd` | `e92acd:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]` |
| `0xe92f6b` | `e92f6b:	48 8d bc 24 90 03 00 	lea    rdi,[rsp+0x390]` |
| `0xe92ffa` | `e92ffa:	88 84 24 10 04 00 00 	mov    BYTE PTR [rsp+0x410],al` |
| `0xe930b3` | `e930b3:	4d 8b bd 10 04 00 00 	mov    r15,QWORD PTR [r13+0x410]` |
| `0xe930da` | `e930da:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe930dd` | `e930dd:	4c 8b b4 24 90 03 00 	mov    r14,QWORD PTR [rsp+0x390]` |
| `0xe930e5` | `e930e5:	48 8b 84 24 98 03 00 	mov    rax,QWORD PTR [rsp+0x398]` |
| `0xe93166` | `e93166:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]` |
| `0xe931f5` | `e931f5:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]` |
| `0xe9344e` | `e9344e:	4c 8b b4 24 90 03 00 	mov    r14,QWORD PTR [rsp+0x390]` |
| `0xe93456` | `e93456:	48 8b 84 24 98 03 00 	mov    rax,QWORD PTR [rsp+0x398]` |
| `0xe934e3` | `e934e3:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]` |
| `0xe93587` | `e93587:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]` |
| `0xe94285` | `e94285:	f3 0f 7f 40 28       	movdqu XMMWORD PTR [rax+0x28],xmm0` |
| `0xe94b5f` | `e94b5f:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14` |
| `0xe94c1b` | `e94c1b:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14` |
| `0xe94d9c` | `e94d9c:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]` |
| `0xe95091` | `e95091:	4c 8b b4 24 90 03 00 	mov    r14,QWORD PTR [rsp+0x390]` |
| `0xe95099` | `e95099:	48 8b 84 24 98 03 00 	mov    rax,QWORD PTR [rsp+0x398]` |
| `0xe95105` | `e95105:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]` |
| `0xe953fc` | `e953fc:	ff 50 28             	call   QWORD PTR [rax+0x28]` |

## Windows around relevant references

### `0xe8d0da`

```text
  e8d063:	4c 89 fa             	mov    rdx,r15
  e8d066:	45 31 c9             	xor    r9d,r9d
  e8d069:	e8 1c a3 75 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e8d06e:	84 c0                	test   al,al
  e8d070:	75 21                	jne    e8d093 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x544a9>
  e8d072:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
  e8d079:	00
  e8d07a:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
  e8d07e:	48 8b 94 24 e8 02 00 	mov    rdx,QWORD PTR [rsp+0x2e8]
  e8d085:	00
  e8d086:	48 8b 8c 24 f0 02 00 	mov    rcx,QWORD PTR [rsp+0x2f0]
  e8d08d:	00
  e8d08e:	e8 6d 1c 00 00       	call   e8ed00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56116>
  e8d093:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]
  e8d098:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e8d09b:	4c 89 ff             	mov    rdi,r15
  e8d09e:	ff 50 38             	call   QWORD PTR [rax+0x38]
  e8d0a1:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
  e8d0a6:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
  e8d0ad:	00
  e8d0ae:	48 89 c6             	mov    rsi,rax
  e8d0b1:	e8 44 1f 00 00       	call   e8effa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56410>
  e8d0b6:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e8d0b9:	4c 89 ff             	mov    rdi,r15
  e8d0bc:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e8d0bf:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
  e8d0c6:	00
  e8d0c7:	48 89 c6             	mov    rsi,rax
  e8d0ca:	e8 2b 1f 00 00       	call   e8effa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56410>
  e8d0cf:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
  e8d0d6:	00
  e8d0d7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8d0da:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d0dd:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
  e8d0e4:	00
  e8d0e5:	48 89 c6             	mov    rsi,rax
  e8d0e8:	e8 0d 1f 00 00       	call   e8effa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56410>
  e8d0ed:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e8d0f1:	48 8d 35 18 60 54 ff 	lea    rsi,[rip+0xffffffffff546018]        # 3d3110 <_ZTSN5boost17bad_function_callE@@Base+0x456>
  e8d0f8:	48 8d 0d 31 60 54 ff 	lea    rcx,[rip+0xffffffffff546031]        # 3d3130 <_ZTSN5boost17bad_function_callE@@Base+0x476>
  e8d0ff:	6a 13                	push   0x13
  e8d101:	5a                   	pop    rdx
  e8d102:	6a 19                	push   0x19
  e8d104:	41 58                	pop    r8
  e8d106:	6a 01                	push   0x1
  e8d108:	41 59                	pop    r9
  e8d10a:	e8 7b a2 75 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e8d10f:	84 c0                	test   al,al
  e8d111:	74 1b                	je     e8d12e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54544>
  e8d113:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  e8d118:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8d11b:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e8d11e:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
  e8d125:	00
  e8d126:	48 89 c6             	mov    rsi,rax
  e8d129:	e8 cc 1e 00 00       	call   e8effa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56410>
  e8d12e:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e8d132:	48 8d 35 11 60 54 ff 	lea    rsi,[rip+0xffffffffff546011]        # 3d314a <_ZTSN5boost17bad_function_callE@@Base+0x490>
  e8d139:	48 8d 0d 20 60 54 ff 	lea    rcx,[rip+0xffffffffff546020]        # 3d3160 <_ZTSN5boost17bad_function_callE@@Base+0x4a6>
  e8d140:	6a 0b                	push   0xb
  e8d142:	5a                   	pop    rdx
  e8d143:	6a 14                	push   0x14
  e8d145:	41 58                	pop    r8
  e8d147:	45 31 c9             	xor    r9d,r9d
  e8d14a:	e8 3b a2 75 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e8d14f:	84 c0                	test   al,al
  e8d151:	0f 84 0b 01 00 00    	je     e8d262 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54678>
  e8d157:	48 8d 35 2f 1c 4a ff 	lea    rsi,[rip+0xffffffffff4a1c2f]        # 32ed8d <_ZTSSt12bad_any_cast@@Base-0x6143b>
  e8d15e:	48 8d bc 24 60 07 00 	lea    rdi,[rsp+0x760]
  e8d165:	00
  e8d166:	e8 13 c9 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  e8d16b:	48 8d 05 5e 98 9b 00 	lea    rax,[rip+0x9b985e]        # 18469d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x30b8>
  e8d172:	48 89 84 24 90 07 00 	mov    QWORD PTR [rsp+0x790],rax
  e8d179:	00
  e8d17a:	48 8d 94 24 90 07 00 	lea    rdx,[rsp+0x790]
  e8d181:	00
  e8d182:	48 89 94 24 b0 07 00 	mov    QWORD PTR [rsp+0x7b0],rdx
  e8d189:	00
  e8d18a:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
  e8d191:	00
  e8d192:	48 8d b4 24 60 07 00 	lea    rsi,[rsp+0x760]
  e8d199:	00
  e8d19a:	e8 09 99 03 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
  e8d19f:	48 8d 9c 24 90 07 00 	lea    rbx,[rsp+0x790]
  e8d1a6:	00
  e8d1a7:	48 89 df             	mov    rdi,rbx
  e8d1aa:	e8 bb cd be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e8d1af:	48 8d bc 24 60 07 00 	lea    rdi,[rsp+0x760]
  e8d1b6:	00
  e8d1b7:	e8 d4 0c 96 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e8d1bc:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
  e8d1c3:	00
  e8d1c4:	48 8d b4 24 40 06 00 	lea    rsi,[rsp+0x640]
  e8d1cb:	00
  e8d1cc:	e8 27 1f 00 00       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
  e8d1d1:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
  e8d1d8:	00
  e8d1d9:	e8 90 b0 cf ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
  e8d1de:	48 8d 35 05 a5 4e ff 	lea    rsi,[rip+0xffffffffff4ea505]        # 3776ea <_ZTSSt12bad_any_cast@@Base-0x18ade>
  e8d1e5:	48 8d bc 24 60 07 00 	lea    rdi,[rsp+0x760]
  e8d1ec:	00
  e8d1ed:	e8 8c c8 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  e8d1f2:	48 8d 05 ff 95 9b 00 	lea    rax,[rip+0x9b95ff]        # 18467f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2ee0>
  e8d1f9:	48 89 84 24 90 07 00 	mov    QWORD PTR [rsp+0x790],rax
  e8d200:	00
  e8d201:	48 89 9c 24 b0 07 00 	mov    QWORD PTR [rsp+0x7b0],rbx
  e8d208:	00
  e8d209:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
  e8d210:	00
  e8d211:	48 8d b4 24 60 07 00 	lea    rsi,[rsp+0x760]
  e8d218:	00
  e8d219:	48 89 da             	mov    rdx,rbx
  e8d21c:	e8 87 98 03 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
  e8d221:	48 8d bc 24 90 07 00 	lea    rdi,[rsp+0x790]
  e8d228:	00
  e8d229:	e8 3c cd be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e8d22e:	48 8d bc 24 60 07 00 	lea    rdi,[rsp+0x760]
  e8d235:	00
  e8d236:	e8 55 0c 96 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e8d23b:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
  e8d242:	00
  e8d243:	48 8d b4 24 40 06 00 	lea    rsi,[rsp+0x640]
```
### `0xe8d3e6`

```text
  e8d36d:	6a 0c                	push   0xc
  e8d36f:	41 59                	pop    r9
  e8d371:	4c 89 ff             	mov    rdi,r15
  e8d374:	e8 4f a1 75 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  e8d379:	41 80 7f 18 00       	cmp    BYTE PTR [r15+0x18],0x0
  e8d37e:	74 4e                	je     e8d3ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x547e4>
  e8d380:	48 8d 35 f7 39 4e ff 	lea    rsi,[rip+0xffffffffff4e39f7]        # 370d7e <_ZTSSt12bad_any_cast@@Base-0x1f44a>
  e8d387:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
  e8d38e:	00
  e8d38f:	e8 bb e4 be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  e8d394:	84 c0                	test   al,al
  e8d396:	74 06                	je     e8d39e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x547b4>
  e8d398:	6a 02                	push   0x2
  e8d39a:	41 5c                	pop    r12
  e8d39c:	eb 30                	jmp    e8d3ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x547e4>
  e8d39e:	48 8d 35 52 90 5a ff 	lea    rsi,[rip+0xffffffffff5a9052]        # 4363f7 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5be46>
  e8d3a5:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
  e8d3ac:	00
  e8d3ad:	e8 9d e4 be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  e8d3b2:	84 c0                	test   al,al
  e8d3b4:	75 18                	jne    e8d3ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x547e4>
  e8d3b6:	48 8d 35 83 75 49 ff 	lea    rsi,[rip+0xffffffffff497583]        # 324940 <_ZTSSt12bad_any_cast@@Base-0x6b888>
  e8d3bd:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
  e8d3c4:	00
  e8d3c5:	e8 85 e4 be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  e8d3ca:	44 0f b6 e0          	movzx  r12d,al
  e8d3ce:	48 89 eb             	mov    rbx,rbp
  e8d3d1:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
  e8d3d8:	00
  e8d3d9:	e8 52 99 c1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  e8d3de:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
  e8d3e3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8d3e6:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d3e9:	49 89 c7             	mov    r15,rax
  e8d3ec:	48 8d 35 cb 99 4d ff 	lea    rsi,[rip+0xffffffffff4d99cb]        # 366dbe <_ZTSSt12bad_any_cast@@Base-0x2940a>
  e8d3f3:	48 8d bc 24 e8 04 00 	lea    rdi,[rsp+0x4e8]
  e8d3fa:	00
  e8d3fb:	e8 7e c6 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  e8d400:	41 8d 45 ff          	lea    eax,[r13-0x1]
  e8d404:	31 c9                	xor    ecx,ecx
  e8d406:	41 83 fc 02          	cmp    r12d,0x2
  e8d40a:	0f 94 c1             	sete   cl
  e8d40d:	01 c9                	add    ecx,ecx
  e8d40f:	41 83 fc 01          	cmp    r12d,0x1
  e8d413:	41 0f 44 cc          	cmove  ecx,r12d
  e8d417:	83 f8 02             	cmp    eax,0x2
  e8d41a:	0f 92 84 24 a8 07 00 	setb   BYTE PTR [rsp+0x7a8]
  e8d421:	00
  e8d422:	4c 8d a4 24 60 07 00 	lea    r12,[rsp+0x760]
  e8d429:	00
  e8d42a:	41 0f 92 44 24 18    	setb   BYTE PTR [r12+0x18]
  e8d430:	41 83 fd 02          	cmp    r13d,0x2
  e8d434:	48 8d 05 65 91 9b 00 	lea    rax,[rip+0x9b9165]        # 18465a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c88>
  e8d43b:	48 89 84 24 90 07 00 	mov    QWORD PTR [rsp+0x790],rax
  e8d442:	00
  e8d443:	4c 89 bc 24 98 07 00 	mov    QWORD PTR [rsp+0x798],r15
  e8d44a:	00
  e8d44b:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
  e8d450:	48 89 94 24 a0 07 00 	mov    QWORD PTR [rsp+0x7a0],rdx
  e8d457:	00
  e8d458:	0f 94 84 24 a9 07 00 	sete   BYTE PTR [rsp+0x7a9]
  e8d45f:	00
  e8d460:	48 8d 05 49 93 9b 00 	lea    rax,[rip+0x9b9349]        # 18467b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e98>
  e8d467:	49 89 04 24          	mov    QWORD PTR [r12],rax
  e8d46b:	4d 89 7c 24 08       	mov    QWORD PTR [r12+0x8],r15
  e8d470:	49 89 54 24 10       	mov    QWORD PTR [r12+0x10],rdx
  e8d475:	41 0f 94 44 24 19    	sete   BYTE PTR [r12+0x19]
  e8d47b:	89 8c 24 ac 07 00 00 	mov    DWORD PTR [rsp+0x7ac],ecx
  e8d482:	48 8d ac 24 90 07 00 	lea    rbp,[rsp+0x790]
  e8d489:	00
  e8d48a:	48 89 ac 24 b0 07 00 	mov    QWORD PTR [rsp+0x7b0],rbp
  e8d491:	00
  e8d492:	41 89 4c 24 1c       	mov    DWORD PTR [r12+0x1c],ecx
  e8d497:	4d 89 64 24 20       	mov    QWORD PTR [r12+0x20],r12
  e8d49c:	4c 8d bc 24 40 06 00 	lea    r15,[rsp+0x640]
  e8d4a3:	00
  e8d4a4:	4c 8d ac 24 e8 04 00 	lea    r13,[rsp+0x4e8]
  e8d4ab:	00
  e8d4ac:	4c 89 ff             	mov    rdi,r15
  e8d4af:	4c 89 ee             	mov    rsi,r13
  e8d4b2:	48 89 ea             	mov    rdx,rbp
  e8d4b5:	4c 89 e1             	mov    rcx,r12
  e8d4b8:	e8 89 ac cf ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
  e8d4bd:	4c 89 e7             	mov    rdi,r12
  e8d4c0:	e8 a5 ca be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e8d4c5:	48 89 ef             	mov    rdi,rbp
  e8d4c8:	e8 9d ca be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e8d4cd:	4c 89 ef             	mov    rdi,r13
  e8d4d0:	e8 bb 09 96 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e8d4d5:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
  e8d4dc:	00
  e8d4dd:	4c 89 fe             	mov    rsi,r15
  e8d4e0:	e8 13 1c 00 00       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
  e8d4e5:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
  e8d4ec:	00
  e8d4ed:	e8 7c ad cf ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
  e8d4f2:	6a 30                	push   0x30
  e8d4f4:	5f                   	pop    rdi
  e8d4f5:	48 89 dd             	mov    rbp,rbx
  e8d4f8:	e8 03 0a 96 00       	call   17edf00 <_Znwm@plt>
  e8d4fd:	4c 8b bc 24 90 00 00 	mov    r15,QWORD PTR [rsp+0x90]
  e8d504:	00
  e8d505:	4c 8b ac 24 88 00 00 	mov    r13,QWORD PTR [rsp+0x88]
  e8d50c:	00
  e8d50d:	4c 8b a4 24 80 00 00 	mov    r12,QWORD PTR [rsp+0x80]
  e8d514:	00
  e8d515:	66 0f ef c0          	pxor   xmm0,xmm0
  e8d519:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e8d51e:	48 8d 0d 43 ff 96 00 	lea    rcx,[rip+0x96ff43]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
  e8d525:	48 89 08             	mov    QWORD PTR [rax],rcx
  e8d528:	48 8d 48 18          	lea    rcx,[rax+0x18]
  e8d52c:	48 8d 15 05 18 9b 00 	lea    rdx,[rip+0x9b1805]        # 183ed38 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10cd0>
  e8d533:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
  e8d537:	48 8b 94 24 38 03 00 	mov    rdx,QWORD PTR [rsp+0x338]
  e8d53e:	00
  e8d53f:	0f 28 84 24 30 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x330]
  e8d546:	00
  e8d547:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
  e8d54b:	48 85 d2             	test   rdx,rdx
  e8d54e:	74 05                	je     e8d555 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5496b>
  e8d550:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
  e8d555:	66 48 0f 6e c0       	movq   xmm0,rax
```
### `0xe8d5f9`

```text
  e8d577:	e8 0a 0f c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8d57c:	6a 30                	push   0x30
  e8d57e:	5f                   	pop    rdi
  e8d57f:	e8 7c 09 96 00       	call   17edf00 <_Znwm@plt>
  e8d584:	66 0f ef c0          	pxor   xmm0,xmm0
  e8d588:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e8d58d:	48 8d 0d d4 fe 96 00 	lea    rcx,[rip+0x96fed4]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
  e8d594:	48 89 08             	mov    QWORD PTR [rax],rcx
  e8d597:	48 8d 48 18          	lea    rcx,[rax+0x18]
  e8d59b:	48 8d 15 16 18 9b 00 	lea    rdx,[rip+0x9b1816]        # 183edb8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10d50>
  e8d5a2:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
  e8d5a6:	48 8b 94 24 38 03 00 	mov    rdx,QWORD PTR [rsp+0x338]
  e8d5ad:	00
  e8d5ae:	0f 28 84 24 30 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x330]
  e8d5b5:	00
  e8d5b6:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
  e8d5ba:	48 85 d2             	test   rdx,rdx
  e8d5bd:	74 05                	je     e8d5c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x549da>
  e8d5bf:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
  e8d5c4:	66 48 0f 6e c0       	movq   xmm0,rax
  e8d5c9:	66 48 0f 6e c9       	movq   xmm1,rcx
  e8d5ce:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e8d5d2:	66 0f 7f 8c 24 b0 04 	movdqa XMMWORD PTR [rsp+0x4b0],xmm1
  e8d5d9:	00 00
  e8d5db:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
  e8d5e0:	80 78 11 00          	cmp    BYTE PTR [rax+0x11],0x0
  e8d5e4:	74 0d                	je     e8d5f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54a09>
  e8d5e6:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
  e8d5ed:	00
  e8d5ee:	e8 8d 14 00 00       	call   e8ea80 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e96>
  e8d5f3:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e8d5f6:	4c 89 ff             	mov    rdi,r15
  e8d5f9:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d5fc:	48 89 c3             	mov    rbx,rax
  e8d5ff:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
  e8d604:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8d607:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d60a:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
  e8d60f:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
  e8d614:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8d617:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d61a:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
  e8d61f:	48 89 9c 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rbx
  e8d626:	00
  e8d627:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  e8d62c:	66 48 0f 6e c8       	movq   xmm1,rax
  e8d631:	f3 0f 7e 44 24 10    	movq   xmm0,QWORD PTR [rsp+0x10]
  e8d637:	66 0f 6c c1          	punpcklqdq xmm0,xmm1
  e8d63b:	48 83 c0 08          	add    rax,0x8
  e8d63f:	66 0f 6f 8c 24 20 01 	movdqa xmm1,XMMWORD PTR [rsp+0x120]
  e8d646:	00 00
  e8d648:	66 0f 7f 8c 24 a0 04 	movdqa XMMWORD PTR [rsp+0x4a0],xmm1
  e8d64f:	00 00
  e8d651:	66 48 0f 3a 16 c9 01 	pextrq rcx,xmm1,0x1
  e8d658:	48 85 c9             	test   rcx,rcx
  e8d65b:	74 05                	je     e8d662 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54a78>
  e8d65d:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  e8d662:	48 89 8c 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rcx
  e8d669:	00
  e8d66a:	49 8b 4e 10          	mov    rcx,QWORD PTR [r14+0x10]
  e8d66e:	48 89 4c 24 38       	mov    QWORD PTR [rsp+0x38],rcx
  e8d673:	66 0f 7f 84 24 f0 03 	movdqa XMMWORD PTR [rsp+0x3f0],xmm0
  e8d67a:	00 00
  e8d67c:	f0 48 ff 00          	lock inc QWORD PTR [rax]
  e8d680:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  e8d684:	4c 89 e7             	mov    rdi,r12
  e8d687:	ff 50 40             	call   QWORD PTR [rax+0x40]
  e8d68a:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  e8d68f:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
  e8d694:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  e8d698:	48 8d bc 24 d8 03 00 	lea    rdi,[rsp+0x3d8]
  e8d69f:	00
  e8d6a0:	4c 89 e6             	mov    rsi,r12
  e8d6a3:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e8d6a6:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
  e8d6aa:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  e8d6b1:	00
  e8d6b2:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d6b6:	4c 89 ef             	mov    rdi,r13
  e8d6b9:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d6bc:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
  e8d6c1:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
  e8d6c6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8d6c9:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d6cc:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
  e8d6d1:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
  e8d6d6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8d6d9:	ff 50 40             	call   QWORD PTR [rax+0x40]
  e8d6dc:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
  e8d6e1:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d6e4:	48 89 df             	mov    rdi,rbx
  e8d6e7:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d6ea:	48 89 84 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rax
  e8d6f1:	00
  e8d6f2:	66 0f 6f 84 24 c0 04 	movdqa xmm0,XMMWORD PTR [rsp+0x4c0]
  e8d6f9:	00 00
  e8d6fb:	66 0f ef c9          	pxor   xmm1,xmm1
  e8d6ff:	66 0f 7f 8c 24 c0 04 	movdqa XMMWORD PTR [rsp+0x4c0],xmm1
  e8d706:	00 00
  e8d708:	48 8d 05 39 3c 9a 00 	lea    rax,[rip+0x9a3c39]        # 1831348 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x32e0>
  e8d70f:	48 89 84 24 90 07 00 	mov    QWORD PTR [rsp+0x790],rax
  e8d716:	00
  e8d717:	f3 0f 7f 84 24 98 07 	movdqu XMMWORD PTR [rsp+0x798],xmm0
  e8d71e:	00 00
  e8d720:	48 8d 84 24 90 07 00 	lea    rax,[rsp+0x790]
  e8d727:	00
  e8d728:	48 89 84 24 b0 07 00 	mov    QWORD PTR [rsp+0x7b0],rax
  e8d72f:	00
  e8d730:	4c 8b a4 24 68 03 00 	mov    r12,QWORD PTR [rsp+0x368]
  e8d737:	00
  e8d738:	48 83 a4 24 68 03 00 	and    QWORD PTR [rsp+0x368],0x0
  e8d73f:	00 00
  e8d741:	4c 89 a4 24 98 04 00 	mov    QWORD PTR [rsp+0x498],r12
  e8d748:	00
  e8d749:	48 8d bc 24 88 04 00 	lea    rdi,[rsp+0x488]
  e8d750:	00
  e8d751:	48 8d b4 24 18 03 00 	lea    rsi,[rsp+0x318]
  e8d758:	00
  e8d759:	e8 60 e5 c3 ff       	call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>
  e8d75e:	48 8d bc 24 60 07 00 	lea    rdi,[rsp+0x760]
  e8d765:	00
  e8d766:	48 8d b4 24 b0 05 00 	lea    rsi,[rsp+0x5b0]
```
### `0xe8d607`

```text
  e8d584:	66 0f ef c0          	pxor   xmm0,xmm0
  e8d588:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e8d58d:	48 8d 0d d4 fe 96 00 	lea    rcx,[rip+0x96fed4]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
  e8d594:	48 89 08             	mov    QWORD PTR [rax],rcx
  e8d597:	48 8d 48 18          	lea    rcx,[rax+0x18]
  e8d59b:	48 8d 15 16 18 9b 00 	lea    rdx,[rip+0x9b1816]        # 183edb8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10d50>
  e8d5a2:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
  e8d5a6:	48 8b 94 24 38 03 00 	mov    rdx,QWORD PTR [rsp+0x338]
  e8d5ad:	00
  e8d5ae:	0f 28 84 24 30 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x330]
  e8d5b5:	00
  e8d5b6:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
  e8d5ba:	48 85 d2             	test   rdx,rdx
  e8d5bd:	74 05                	je     e8d5c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x549da>
  e8d5bf:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
  e8d5c4:	66 48 0f 6e c0       	movq   xmm0,rax
  e8d5c9:	66 48 0f 6e c9       	movq   xmm1,rcx
  e8d5ce:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e8d5d2:	66 0f 7f 8c 24 b0 04 	movdqa XMMWORD PTR [rsp+0x4b0],xmm1
  e8d5d9:	00 00
  e8d5db:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
  e8d5e0:	80 78 11 00          	cmp    BYTE PTR [rax+0x11],0x0
  e8d5e4:	74 0d                	je     e8d5f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54a09>
  e8d5e6:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
  e8d5ed:	00
  e8d5ee:	e8 8d 14 00 00       	call   e8ea80 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e96>
  e8d5f3:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e8d5f6:	4c 89 ff             	mov    rdi,r15
  e8d5f9:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d5fc:	48 89 c3             	mov    rbx,rax
  e8d5ff:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
  e8d604:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8d607:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d60a:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
  e8d60f:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
  e8d614:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8d617:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d61a:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
  e8d61f:	48 89 9c 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rbx
  e8d626:	00
  e8d627:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  e8d62c:	66 48 0f 6e c8       	movq   xmm1,rax
  e8d631:	f3 0f 7e 44 24 10    	movq   xmm0,QWORD PTR [rsp+0x10]
  e8d637:	66 0f 6c c1          	punpcklqdq xmm0,xmm1
  e8d63b:	48 83 c0 08          	add    rax,0x8
  e8d63f:	66 0f 6f 8c 24 20 01 	movdqa xmm1,XMMWORD PTR [rsp+0x120]
  e8d646:	00 00
  e8d648:	66 0f 7f 8c 24 a0 04 	movdqa XMMWORD PTR [rsp+0x4a0],xmm1
  e8d64f:	00 00
  e8d651:	66 48 0f 3a 16 c9 01 	pextrq rcx,xmm1,0x1
  e8d658:	48 85 c9             	test   rcx,rcx
  e8d65b:	74 05                	je     e8d662 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54a78>
  e8d65d:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  e8d662:	48 89 8c 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rcx
  e8d669:	00
  e8d66a:	49 8b 4e 10          	mov    rcx,QWORD PTR [r14+0x10]
  e8d66e:	48 89 4c 24 38       	mov    QWORD PTR [rsp+0x38],rcx
  e8d673:	66 0f 7f 84 24 f0 03 	movdqa XMMWORD PTR [rsp+0x3f0],xmm0
  e8d67a:	00 00
  e8d67c:	f0 48 ff 00          	lock inc QWORD PTR [rax]
  e8d680:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  e8d684:	4c 89 e7             	mov    rdi,r12
  e8d687:	ff 50 40             	call   QWORD PTR [rax+0x40]
  e8d68a:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  e8d68f:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
  e8d694:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  e8d698:	48 8d bc 24 d8 03 00 	lea    rdi,[rsp+0x3d8]
  e8d69f:	00
  e8d6a0:	4c 89 e6             	mov    rsi,r12
  e8d6a3:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e8d6a6:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
  e8d6aa:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  e8d6b1:	00
  e8d6b2:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d6b6:	4c 89 ef             	mov    rdi,r13
  e8d6b9:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d6bc:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
  e8d6c1:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
  e8d6c6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8d6c9:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d6cc:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
  e8d6d1:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
  e8d6d6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8d6d9:	ff 50 40             	call   QWORD PTR [rax+0x40]
  e8d6dc:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
  e8d6e1:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d6e4:	48 89 df             	mov    rdi,rbx
  e8d6e7:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d6ea:	48 89 84 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rax
  e8d6f1:	00
  e8d6f2:	66 0f 6f 84 24 c0 04 	movdqa xmm0,XMMWORD PTR [rsp+0x4c0]
  e8d6f9:	00 00
  e8d6fb:	66 0f ef c9          	pxor   xmm1,xmm1
  e8d6ff:	66 0f 7f 8c 24 c0 04 	movdqa XMMWORD PTR [rsp+0x4c0],xmm1
  e8d706:	00 00
  e8d708:	48 8d 05 39 3c 9a 00 	lea    rax,[rip+0x9a3c39]        # 1831348 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x32e0>
  e8d70f:	48 89 84 24 90 07 00 	mov    QWORD PTR [rsp+0x790],rax
  e8d716:	00
  e8d717:	f3 0f 7f 84 24 98 07 	movdqu XMMWORD PTR [rsp+0x798],xmm0
  e8d71e:	00 00
  e8d720:	48 8d 84 24 90 07 00 	lea    rax,[rsp+0x790]
  e8d727:	00
  e8d728:	48 89 84 24 b0 07 00 	mov    QWORD PTR [rsp+0x7b0],rax
  e8d72f:	00
  e8d730:	4c 8b a4 24 68 03 00 	mov    r12,QWORD PTR [rsp+0x368]
  e8d737:	00
  e8d738:	48 83 a4 24 68 03 00 	and    QWORD PTR [rsp+0x368],0x0
  e8d73f:	00 00
  e8d741:	4c 89 a4 24 98 04 00 	mov    QWORD PTR [rsp+0x498],r12
  e8d748:	00
  e8d749:	48 8d bc 24 88 04 00 	lea    rdi,[rsp+0x488]
  e8d750:	00
  e8d751:	48 8d b4 24 18 03 00 	lea    rsi,[rsp+0x318]
  e8d758:	00
  e8d759:	e8 60 e5 c3 ff       	call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>
  e8d75e:	48 8d bc 24 60 07 00 	lea    rdi,[rsp+0x760]
  e8d765:	00
  e8d766:	48 8d b4 24 b0 05 00 	lea    rsi,[rsp+0x5b0]
  e8d76d:	00
  e8d76e:	e8 1d cb be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e8d773:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d776:	48 89 df             	mov    rdi,rbx
```
### `0xe8d617`

```text
  e8d597:	48 8d 48 18          	lea    rcx,[rax+0x18]
  e8d59b:	48 8d 15 16 18 9b 00 	lea    rdx,[rip+0x9b1816]        # 183edb8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10d50>
  e8d5a2:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
  e8d5a6:	48 8b 94 24 38 03 00 	mov    rdx,QWORD PTR [rsp+0x338]
  e8d5ad:	00
  e8d5ae:	0f 28 84 24 30 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x330]
  e8d5b5:	00
  e8d5b6:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
  e8d5ba:	48 85 d2             	test   rdx,rdx
  e8d5bd:	74 05                	je     e8d5c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x549da>
  e8d5bf:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
  e8d5c4:	66 48 0f 6e c0       	movq   xmm0,rax
  e8d5c9:	66 48 0f 6e c9       	movq   xmm1,rcx
  e8d5ce:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e8d5d2:	66 0f 7f 8c 24 b0 04 	movdqa XMMWORD PTR [rsp+0x4b0],xmm1
  e8d5d9:	00 00
  e8d5db:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
  e8d5e0:	80 78 11 00          	cmp    BYTE PTR [rax+0x11],0x0
  e8d5e4:	74 0d                	je     e8d5f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54a09>
  e8d5e6:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
  e8d5ed:	00
  e8d5ee:	e8 8d 14 00 00       	call   e8ea80 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e96>
  e8d5f3:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e8d5f6:	4c 89 ff             	mov    rdi,r15
  e8d5f9:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d5fc:	48 89 c3             	mov    rbx,rax
  e8d5ff:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
  e8d604:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8d607:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d60a:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
  e8d60f:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
  e8d614:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8d617:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d61a:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
  e8d61f:	48 89 9c 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rbx
  e8d626:	00
  e8d627:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  e8d62c:	66 48 0f 6e c8       	movq   xmm1,rax
  e8d631:	f3 0f 7e 44 24 10    	movq   xmm0,QWORD PTR [rsp+0x10]
  e8d637:	66 0f 6c c1          	punpcklqdq xmm0,xmm1
  e8d63b:	48 83 c0 08          	add    rax,0x8
  e8d63f:	66 0f 6f 8c 24 20 01 	movdqa xmm1,XMMWORD PTR [rsp+0x120]
  e8d646:	00 00
  e8d648:	66 0f 7f 8c 24 a0 04 	movdqa XMMWORD PTR [rsp+0x4a0],xmm1
  e8d64f:	00 00
  e8d651:	66 48 0f 3a 16 c9 01 	pextrq rcx,xmm1,0x1
  e8d658:	48 85 c9             	test   rcx,rcx
  e8d65b:	74 05                	je     e8d662 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54a78>
  e8d65d:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  e8d662:	48 89 8c 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rcx
  e8d669:	00
  e8d66a:	49 8b 4e 10          	mov    rcx,QWORD PTR [r14+0x10]
  e8d66e:	48 89 4c 24 38       	mov    QWORD PTR [rsp+0x38],rcx
  e8d673:	66 0f 7f 84 24 f0 03 	movdqa XMMWORD PTR [rsp+0x3f0],xmm0
  e8d67a:	00 00
  e8d67c:	f0 48 ff 00          	lock inc QWORD PTR [rax]
  e8d680:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  e8d684:	4c 89 e7             	mov    rdi,r12
  e8d687:	ff 50 40             	call   QWORD PTR [rax+0x40]
  e8d68a:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  e8d68f:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
  e8d694:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  e8d698:	48 8d bc 24 d8 03 00 	lea    rdi,[rsp+0x3d8]
  e8d69f:	00
  e8d6a0:	4c 89 e6             	mov    rsi,r12
  e8d6a3:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e8d6a6:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
  e8d6aa:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  e8d6b1:	00
  e8d6b2:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d6b6:	4c 89 ef             	mov    rdi,r13
  e8d6b9:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d6bc:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
  e8d6c1:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
  e8d6c6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8d6c9:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d6cc:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
  e8d6d1:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
  e8d6d6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8d6d9:	ff 50 40             	call   QWORD PTR [rax+0x40]
  e8d6dc:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
  e8d6e1:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d6e4:	48 89 df             	mov    rdi,rbx
  e8d6e7:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d6ea:	48 89 84 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rax
  e8d6f1:	00
  e8d6f2:	66 0f 6f 84 24 c0 04 	movdqa xmm0,XMMWORD PTR [rsp+0x4c0]
  e8d6f9:	00 00
  e8d6fb:	66 0f ef c9          	pxor   xmm1,xmm1
  e8d6ff:	66 0f 7f 8c 24 c0 04 	movdqa XMMWORD PTR [rsp+0x4c0],xmm1
  e8d706:	00 00
  e8d708:	48 8d 05 39 3c 9a 00 	lea    rax,[rip+0x9a3c39]        # 1831348 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x32e0>
  e8d70f:	48 89 84 24 90 07 00 	mov    QWORD PTR [rsp+0x790],rax
  e8d716:	00
  e8d717:	f3 0f 7f 84 24 98 07 	movdqu XMMWORD PTR [rsp+0x798],xmm0
  e8d71e:	00 00
  e8d720:	48 8d 84 24 90 07 00 	lea    rax,[rsp+0x790]
  e8d727:	00
  e8d728:	48 89 84 24 b0 07 00 	mov    QWORD PTR [rsp+0x7b0],rax
  e8d72f:	00
  e8d730:	4c 8b a4 24 68 03 00 	mov    r12,QWORD PTR [rsp+0x368]
  e8d737:	00
  e8d738:	48 83 a4 24 68 03 00 	and    QWORD PTR [rsp+0x368],0x0
  e8d73f:	00 00
  e8d741:	4c 89 a4 24 98 04 00 	mov    QWORD PTR [rsp+0x498],r12
  e8d748:	00
  e8d749:	48 8d bc 24 88 04 00 	lea    rdi,[rsp+0x488]
  e8d750:	00
  e8d751:	48 8d b4 24 18 03 00 	lea    rsi,[rsp+0x318]
  e8d758:	00
  e8d759:	e8 60 e5 c3 ff       	call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>
  e8d75e:	48 8d bc 24 60 07 00 	lea    rdi,[rsp+0x760]
  e8d765:	00
  e8d766:	48 8d b4 24 b0 05 00 	lea    rsi,[rsp+0x5b0]
  e8d76d:	00
  e8d76e:	e8 1d cb be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e8d773:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d776:	48 89 df             	mov    rdi,rbx
  e8d779:	ff 50 40             	call   QWORD PTR [rax+0x40]
  e8d77c:	48 89 84 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rax
  e8d783:	00
  e8d784:	48 8b 03             	mov    rax,QWORD PTR [rbx]
```
### `0xe8d6b9`

```text
  e8d637:	66 0f 6c c1          	punpcklqdq xmm0,xmm1
  e8d63b:	48 83 c0 08          	add    rax,0x8
  e8d63f:	66 0f 6f 8c 24 20 01 	movdqa xmm1,XMMWORD PTR [rsp+0x120]
  e8d646:	00 00
  e8d648:	66 0f 7f 8c 24 a0 04 	movdqa XMMWORD PTR [rsp+0x4a0],xmm1
  e8d64f:	00 00
  e8d651:	66 48 0f 3a 16 c9 01 	pextrq rcx,xmm1,0x1
  e8d658:	48 85 c9             	test   rcx,rcx
  e8d65b:	74 05                	je     e8d662 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54a78>
  e8d65d:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  e8d662:	48 89 8c 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rcx
  e8d669:	00
  e8d66a:	49 8b 4e 10          	mov    rcx,QWORD PTR [r14+0x10]
  e8d66e:	48 89 4c 24 38       	mov    QWORD PTR [rsp+0x38],rcx
  e8d673:	66 0f 7f 84 24 f0 03 	movdqa XMMWORD PTR [rsp+0x3f0],xmm0
  e8d67a:	00 00
  e8d67c:	f0 48 ff 00          	lock inc QWORD PTR [rax]
  e8d680:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  e8d684:	4c 89 e7             	mov    rdi,r12
  e8d687:	ff 50 40             	call   QWORD PTR [rax+0x40]
  e8d68a:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  e8d68f:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
  e8d694:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  e8d698:	48 8d bc 24 d8 03 00 	lea    rdi,[rsp+0x3d8]
  e8d69f:	00
  e8d6a0:	4c 89 e6             	mov    rsi,r12
  e8d6a3:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e8d6a6:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
  e8d6aa:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  e8d6b1:	00
  e8d6b2:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d6b6:	4c 89 ef             	mov    rdi,r13
  e8d6b9:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d6bc:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
  e8d6c1:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
  e8d6c6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8d6c9:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d6cc:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
  e8d6d1:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
  e8d6d6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8d6d9:	ff 50 40             	call   QWORD PTR [rax+0x40]
  e8d6dc:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
  e8d6e1:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d6e4:	48 89 df             	mov    rdi,rbx
  e8d6e7:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d6ea:	48 89 84 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rax
  e8d6f1:	00
  e8d6f2:	66 0f 6f 84 24 c0 04 	movdqa xmm0,XMMWORD PTR [rsp+0x4c0]
  e8d6f9:	00 00
  e8d6fb:	66 0f ef c9          	pxor   xmm1,xmm1
  e8d6ff:	66 0f 7f 8c 24 c0 04 	movdqa XMMWORD PTR [rsp+0x4c0],xmm1
  e8d706:	00 00
  e8d708:	48 8d 05 39 3c 9a 00 	lea    rax,[rip+0x9a3c39]        # 1831348 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x32e0>
  e8d70f:	48 89 84 24 90 07 00 	mov    QWORD PTR [rsp+0x790],rax
  e8d716:	00
  e8d717:	f3 0f 7f 84 24 98 07 	movdqu XMMWORD PTR [rsp+0x798],xmm0
  e8d71e:	00 00
  e8d720:	48 8d 84 24 90 07 00 	lea    rax,[rsp+0x790]
  e8d727:	00
  e8d728:	48 89 84 24 b0 07 00 	mov    QWORD PTR [rsp+0x7b0],rax
  e8d72f:	00
  e8d730:	4c 8b a4 24 68 03 00 	mov    r12,QWORD PTR [rsp+0x368]
  e8d737:	00
  e8d738:	48 83 a4 24 68 03 00 	and    QWORD PTR [rsp+0x368],0x0
  e8d73f:	00 00
  e8d741:	4c 89 a4 24 98 04 00 	mov    QWORD PTR [rsp+0x498],r12
  e8d748:	00
  e8d749:	48 8d bc 24 88 04 00 	lea    rdi,[rsp+0x488]
  e8d750:	00
  e8d751:	48 8d b4 24 18 03 00 	lea    rsi,[rsp+0x318]
  e8d758:	00
  e8d759:	e8 60 e5 c3 ff       	call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>
  e8d75e:	48 8d bc 24 60 07 00 	lea    rdi,[rsp+0x760]
  e8d765:	00
  e8d766:	48 8d b4 24 b0 05 00 	lea    rsi,[rsp+0x5b0]
  e8d76d:	00
  e8d76e:	e8 1d cb be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e8d773:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d776:	48 89 df             	mov    rdi,rbx
  e8d779:	ff 50 40             	call   QWORD PTR [rax+0x40]
  e8d77c:	48 89 84 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rax
  e8d783:	00
  e8d784:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d787:	48 89 df             	mov    rdi,rbx
  e8d78a:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e8d78d:	48 89 84 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rax
  e8d794:	00
  e8d795:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d798:	48 89 df             	mov    rdi,rbx
  e8d79b:	ff 50 38             	call   QWORD PTR [rax+0x38]
  e8d79e:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e8d7a3:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e8d7a6:	4c 89 ff             	mov    rdi,r15
  e8d7a9:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d7ac:	48 89 c3             	mov    rbx,rax
  e8d7af:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d7b3:	4c 89 ef             	mov    rdi,r13
  e8d7b6:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d7b9:	49 89 c5             	mov    r13,rax
  e8d7bc:	6a 30                	push   0x30
  e8d7be:	5f                   	pop    rdi
  e8d7bf:	e8 3c 07 96 00       	call   17edf00 <_Znwm@plt>
  e8d7c4:	49 89 c7             	mov    r15,rax
  e8d7c7:	66 0f ef c0          	pxor   xmm0,xmm0
  e8d7cb:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e8d7d0:	48 8d 05 91 fc 96 00 	lea    rax,[rip+0x96fc91]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
  e8d7d7:	49 89 07             	mov    QWORD PTR [r15],rax
  e8d7da:	4c 89 f8             	mov    rax,r15
  e8d7dd:	48 83 c0 18          	add    rax,0x18
  e8d7e1:	48 8d 0d a8 3b 9a 00 	lea    rcx,[rip+0x9a3ba8]        # 1831390 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3328>
  e8d7e8:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
  e8d7ec:	49 89 5f 20          	mov    QWORD PTR [r15+0x20],rbx
  e8d7f0:	4d 89 6f 28          	mov    QWORD PTR [r15+0x28],r13
  e8d7f4:	48 89 84 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rax
  e8d7fb:	00
  e8d7fc:	4c 89 bc 24 c8 03 00 	mov    QWORD PTR [rsp+0x3c8],r15
  e8d803:	00
  e8d804:	48 8d bc 24 e8 04 00 	lea    rdi,[rsp+0x4e8]
  e8d80b:	00
  e8d80c:	48 8d b4 24 40 03 00 	lea    rsi,[rsp+0x340]
  e8d813:	00
  e8d814:	e8 27 07 96 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
```
### `0xe8d6c9`

```text
  e8d648:	66 0f 7f 8c 24 a0 04 	movdqa XMMWORD PTR [rsp+0x4a0],xmm1
  e8d64f:	00 00
  e8d651:	66 48 0f 3a 16 c9 01 	pextrq rcx,xmm1,0x1
  e8d658:	48 85 c9             	test   rcx,rcx
  e8d65b:	74 05                	je     e8d662 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54a78>
  e8d65d:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  e8d662:	48 89 8c 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rcx
  e8d669:	00
  e8d66a:	49 8b 4e 10          	mov    rcx,QWORD PTR [r14+0x10]
  e8d66e:	48 89 4c 24 38       	mov    QWORD PTR [rsp+0x38],rcx
  e8d673:	66 0f 7f 84 24 f0 03 	movdqa XMMWORD PTR [rsp+0x3f0],xmm0
  e8d67a:	00 00
  e8d67c:	f0 48 ff 00          	lock inc QWORD PTR [rax]
  e8d680:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  e8d684:	4c 89 e7             	mov    rdi,r12
  e8d687:	ff 50 40             	call   QWORD PTR [rax+0x40]
  e8d68a:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  e8d68f:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
  e8d694:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  e8d698:	48 8d bc 24 d8 03 00 	lea    rdi,[rsp+0x3d8]
  e8d69f:	00
  e8d6a0:	4c 89 e6             	mov    rsi,r12
  e8d6a3:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e8d6a6:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
  e8d6aa:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  e8d6b1:	00
  e8d6b2:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d6b6:	4c 89 ef             	mov    rdi,r13
  e8d6b9:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d6bc:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
  e8d6c1:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
  e8d6c6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8d6c9:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d6cc:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
  e8d6d1:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
  e8d6d6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8d6d9:	ff 50 40             	call   QWORD PTR [rax+0x40]
  e8d6dc:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
  e8d6e1:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d6e4:	48 89 df             	mov    rdi,rbx
  e8d6e7:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d6ea:	48 89 84 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rax
  e8d6f1:	00
  e8d6f2:	66 0f 6f 84 24 c0 04 	movdqa xmm0,XMMWORD PTR [rsp+0x4c0]
  e8d6f9:	00 00
  e8d6fb:	66 0f ef c9          	pxor   xmm1,xmm1
  e8d6ff:	66 0f 7f 8c 24 c0 04 	movdqa XMMWORD PTR [rsp+0x4c0],xmm1
  e8d706:	00 00
  e8d708:	48 8d 05 39 3c 9a 00 	lea    rax,[rip+0x9a3c39]        # 1831348 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x32e0>
  e8d70f:	48 89 84 24 90 07 00 	mov    QWORD PTR [rsp+0x790],rax
  e8d716:	00
  e8d717:	f3 0f 7f 84 24 98 07 	movdqu XMMWORD PTR [rsp+0x798],xmm0
  e8d71e:	00 00
  e8d720:	48 8d 84 24 90 07 00 	lea    rax,[rsp+0x790]
  e8d727:	00
  e8d728:	48 89 84 24 b0 07 00 	mov    QWORD PTR [rsp+0x7b0],rax
  e8d72f:	00
  e8d730:	4c 8b a4 24 68 03 00 	mov    r12,QWORD PTR [rsp+0x368]
  e8d737:	00
  e8d738:	48 83 a4 24 68 03 00 	and    QWORD PTR [rsp+0x368],0x0
  e8d73f:	00 00
  e8d741:	4c 89 a4 24 98 04 00 	mov    QWORD PTR [rsp+0x498],r12
  e8d748:	00
  e8d749:	48 8d bc 24 88 04 00 	lea    rdi,[rsp+0x488]
  e8d750:	00
  e8d751:	48 8d b4 24 18 03 00 	lea    rsi,[rsp+0x318]
  e8d758:	00
  e8d759:	e8 60 e5 c3 ff       	call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>
  e8d75e:	48 8d bc 24 60 07 00 	lea    rdi,[rsp+0x760]
  e8d765:	00
  e8d766:	48 8d b4 24 b0 05 00 	lea    rsi,[rsp+0x5b0]
  e8d76d:	00
  e8d76e:	e8 1d cb be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e8d773:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d776:	48 89 df             	mov    rdi,rbx
  e8d779:	ff 50 40             	call   QWORD PTR [rax+0x40]
  e8d77c:	48 89 84 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rax
  e8d783:	00
  e8d784:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d787:	48 89 df             	mov    rdi,rbx
  e8d78a:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e8d78d:	48 89 84 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rax
  e8d794:	00
  e8d795:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d798:	48 89 df             	mov    rdi,rbx
  e8d79b:	ff 50 38             	call   QWORD PTR [rax+0x38]
  e8d79e:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e8d7a3:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e8d7a6:	4c 89 ff             	mov    rdi,r15
  e8d7a9:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d7ac:	48 89 c3             	mov    rbx,rax
  e8d7af:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d7b3:	4c 89 ef             	mov    rdi,r13
  e8d7b6:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d7b9:	49 89 c5             	mov    r13,rax
  e8d7bc:	6a 30                	push   0x30
  e8d7be:	5f                   	pop    rdi
  e8d7bf:	e8 3c 07 96 00       	call   17edf00 <_Znwm@plt>
  e8d7c4:	49 89 c7             	mov    r15,rax
  e8d7c7:	66 0f ef c0          	pxor   xmm0,xmm0
  e8d7cb:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e8d7d0:	48 8d 05 91 fc 96 00 	lea    rax,[rip+0x96fc91]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
  e8d7d7:	49 89 07             	mov    QWORD PTR [r15],rax
  e8d7da:	4c 89 f8             	mov    rax,r15
  e8d7dd:	48 83 c0 18          	add    rax,0x18
  e8d7e1:	48 8d 0d a8 3b 9a 00 	lea    rcx,[rip+0x9a3ba8]        # 1831390 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3328>
  e8d7e8:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
  e8d7ec:	49 89 5f 20          	mov    QWORD PTR [r15+0x20],rbx
  e8d7f0:	4d 89 6f 28          	mov    QWORD PTR [r15+0x28],r13
  e8d7f4:	48 89 84 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rax
  e8d7fb:	00
  e8d7fc:	4c 89 bc 24 c8 03 00 	mov    QWORD PTR [rsp+0x3c8],r15
  e8d803:	00
  e8d804:	48 8d bc 24 e8 04 00 	lea    rdi,[rsp+0x4e8]
  e8d80b:	00
  e8d80c:	48 8d b4 24 40 03 00 	lea    rsi,[rsp+0x340]
  e8d813:	00
  e8d814:	e8 27 07 96 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  e8d819:	48 8d 35 be 9c 4e ff 	lea    rsi,[rip+0xffffffffff4e9cbe]        # 3774de <_ZTSSt12bad_any_cast@@Base-0x18cea>
  e8d820:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
  e8d827:	00
  e8d828:	e8 51 c2 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
```
### `0xe8d6e7`

```text
  e8d66a:	49 8b 4e 10          	mov    rcx,QWORD PTR [r14+0x10]
  e8d66e:	48 89 4c 24 38       	mov    QWORD PTR [rsp+0x38],rcx
  e8d673:	66 0f 7f 84 24 f0 03 	movdqa XMMWORD PTR [rsp+0x3f0],xmm0
  e8d67a:	00 00
  e8d67c:	f0 48 ff 00          	lock inc QWORD PTR [rax]
  e8d680:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  e8d684:	4c 89 e7             	mov    rdi,r12
  e8d687:	ff 50 40             	call   QWORD PTR [rax+0x40]
  e8d68a:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  e8d68f:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
  e8d694:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  e8d698:	48 8d bc 24 d8 03 00 	lea    rdi,[rsp+0x3d8]
  e8d69f:	00
  e8d6a0:	4c 89 e6             	mov    rsi,r12
  e8d6a3:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e8d6a6:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
  e8d6aa:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  e8d6b1:	00
  e8d6b2:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d6b6:	4c 89 ef             	mov    rdi,r13
  e8d6b9:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d6bc:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
  e8d6c1:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
  e8d6c6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8d6c9:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d6cc:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
  e8d6d1:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
  e8d6d6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8d6d9:	ff 50 40             	call   QWORD PTR [rax+0x40]
  e8d6dc:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
  e8d6e1:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d6e4:	48 89 df             	mov    rdi,rbx
  e8d6e7:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d6ea:	48 89 84 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rax
  e8d6f1:	00
  e8d6f2:	66 0f 6f 84 24 c0 04 	movdqa xmm0,XMMWORD PTR [rsp+0x4c0]
  e8d6f9:	00 00
  e8d6fb:	66 0f ef c9          	pxor   xmm1,xmm1
  e8d6ff:	66 0f 7f 8c 24 c0 04 	movdqa XMMWORD PTR [rsp+0x4c0],xmm1
  e8d706:	00 00
  e8d708:	48 8d 05 39 3c 9a 00 	lea    rax,[rip+0x9a3c39]        # 1831348 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x32e0>
  e8d70f:	48 89 84 24 90 07 00 	mov    QWORD PTR [rsp+0x790],rax
  e8d716:	00
  e8d717:	f3 0f 7f 84 24 98 07 	movdqu XMMWORD PTR [rsp+0x798],xmm0
  e8d71e:	00 00
  e8d720:	48 8d 84 24 90 07 00 	lea    rax,[rsp+0x790]
  e8d727:	00
  e8d728:	48 89 84 24 b0 07 00 	mov    QWORD PTR [rsp+0x7b0],rax
  e8d72f:	00
  e8d730:	4c 8b a4 24 68 03 00 	mov    r12,QWORD PTR [rsp+0x368]
  e8d737:	00
  e8d738:	48 83 a4 24 68 03 00 	and    QWORD PTR [rsp+0x368],0x0
  e8d73f:	00 00
  e8d741:	4c 89 a4 24 98 04 00 	mov    QWORD PTR [rsp+0x498],r12
  e8d748:	00
  e8d749:	48 8d bc 24 88 04 00 	lea    rdi,[rsp+0x488]
  e8d750:	00
  e8d751:	48 8d b4 24 18 03 00 	lea    rsi,[rsp+0x318]
  e8d758:	00
  e8d759:	e8 60 e5 c3 ff       	call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>
  e8d75e:	48 8d bc 24 60 07 00 	lea    rdi,[rsp+0x760]
  e8d765:	00
  e8d766:	48 8d b4 24 b0 05 00 	lea    rsi,[rsp+0x5b0]
  e8d76d:	00
  e8d76e:	e8 1d cb be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e8d773:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d776:	48 89 df             	mov    rdi,rbx
  e8d779:	ff 50 40             	call   QWORD PTR [rax+0x40]
  e8d77c:	48 89 84 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rax
  e8d783:	00
  e8d784:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d787:	48 89 df             	mov    rdi,rbx
  e8d78a:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e8d78d:	48 89 84 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rax
  e8d794:	00
  e8d795:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d798:	48 89 df             	mov    rdi,rbx
  e8d79b:	ff 50 38             	call   QWORD PTR [rax+0x38]
  e8d79e:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e8d7a3:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e8d7a6:	4c 89 ff             	mov    rdi,r15
  e8d7a9:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d7ac:	48 89 c3             	mov    rbx,rax
  e8d7af:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d7b3:	4c 89 ef             	mov    rdi,r13
  e8d7b6:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d7b9:	49 89 c5             	mov    r13,rax
  e8d7bc:	6a 30                	push   0x30
  e8d7be:	5f                   	pop    rdi
  e8d7bf:	e8 3c 07 96 00       	call   17edf00 <_Znwm@plt>
  e8d7c4:	49 89 c7             	mov    r15,rax
  e8d7c7:	66 0f ef c0          	pxor   xmm0,xmm0
  e8d7cb:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e8d7d0:	48 8d 05 91 fc 96 00 	lea    rax,[rip+0x96fc91]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
  e8d7d7:	49 89 07             	mov    QWORD PTR [r15],rax
  e8d7da:	4c 89 f8             	mov    rax,r15
  e8d7dd:	48 83 c0 18          	add    rax,0x18
  e8d7e1:	48 8d 0d a8 3b 9a 00 	lea    rcx,[rip+0x9a3ba8]        # 1831390 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3328>
  e8d7e8:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
  e8d7ec:	49 89 5f 20          	mov    QWORD PTR [r15+0x20],rbx
  e8d7f0:	4d 89 6f 28          	mov    QWORD PTR [r15+0x28],r13
  e8d7f4:	48 89 84 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rax
  e8d7fb:	00
  e8d7fc:	4c 89 bc 24 c8 03 00 	mov    QWORD PTR [rsp+0x3c8],r15
  e8d803:	00
  e8d804:	48 8d bc 24 e8 04 00 	lea    rdi,[rsp+0x4e8]
  e8d80b:	00
  e8d80c:	48 8d b4 24 40 03 00 	lea    rsi,[rsp+0x340]
  e8d813:	00
  e8d814:	e8 27 07 96 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  e8d819:	48 8d 35 be 9c 4e ff 	lea    rsi,[rip+0xffffffffff4e9cbe]        # 3774de <_ZTSSt12bad_any_cast@@Base-0x18cea>
  e8d820:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
  e8d827:	00
  e8d828:	e8 51 c2 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  e8d82d:	4c 8b ac 24 f8 00 00 	mov    r13,QWORD PTR [rsp+0xf8]
  e8d834:	00
  e8d835:	48 8b 74 24 60       	mov    rsi,QWORD PTR [rsp+0x60]
  e8d83a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e8d83d:	48 8d bc 24 a8 03 00 	lea    rdi,[rsp+0x3a8]
  e8d844:	00
  e8d845:	48 8d 94 24 70 04 00 	lea    rdx,[rsp+0x470]
  e8d84c:	00
```
### `0xe8d7a9`

```text
  e8d730:	4c 8b a4 24 68 03 00 	mov    r12,QWORD PTR [rsp+0x368]
  e8d737:	00
  e8d738:	48 83 a4 24 68 03 00 	and    QWORD PTR [rsp+0x368],0x0
  e8d73f:	00 00
  e8d741:	4c 89 a4 24 98 04 00 	mov    QWORD PTR [rsp+0x498],r12
  e8d748:	00
  e8d749:	48 8d bc 24 88 04 00 	lea    rdi,[rsp+0x488]
  e8d750:	00
  e8d751:	48 8d b4 24 18 03 00 	lea    rsi,[rsp+0x318]
  e8d758:	00
  e8d759:	e8 60 e5 c3 ff       	call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>
  e8d75e:	48 8d bc 24 60 07 00 	lea    rdi,[rsp+0x760]
  e8d765:	00
  e8d766:	48 8d b4 24 b0 05 00 	lea    rsi,[rsp+0x5b0]
  e8d76d:	00
  e8d76e:	e8 1d cb be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e8d773:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d776:	48 89 df             	mov    rdi,rbx
  e8d779:	ff 50 40             	call   QWORD PTR [rax+0x40]
  e8d77c:	48 89 84 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rax
  e8d783:	00
  e8d784:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d787:	48 89 df             	mov    rdi,rbx
  e8d78a:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e8d78d:	48 89 84 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rax
  e8d794:	00
  e8d795:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d798:	48 89 df             	mov    rdi,rbx
  e8d79b:	ff 50 38             	call   QWORD PTR [rax+0x38]
  e8d79e:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e8d7a3:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e8d7a6:	4c 89 ff             	mov    rdi,r15
  e8d7a9:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d7ac:	48 89 c3             	mov    rbx,rax
  e8d7af:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d7b3:	4c 89 ef             	mov    rdi,r13
  e8d7b6:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d7b9:	49 89 c5             	mov    r13,rax
  e8d7bc:	6a 30                	push   0x30
  e8d7be:	5f                   	pop    rdi
  e8d7bf:	e8 3c 07 96 00       	call   17edf00 <_Znwm@plt>
  e8d7c4:	49 89 c7             	mov    r15,rax
  e8d7c7:	66 0f ef c0          	pxor   xmm0,xmm0
  e8d7cb:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e8d7d0:	48 8d 05 91 fc 96 00 	lea    rax,[rip+0x96fc91]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
  e8d7d7:	49 89 07             	mov    QWORD PTR [r15],rax
  e8d7da:	4c 89 f8             	mov    rax,r15
  e8d7dd:	48 83 c0 18          	add    rax,0x18
  e8d7e1:	48 8d 0d a8 3b 9a 00 	lea    rcx,[rip+0x9a3ba8]        # 1831390 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3328>
  e8d7e8:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
  e8d7ec:	49 89 5f 20          	mov    QWORD PTR [r15+0x20],rbx
  e8d7f0:	4d 89 6f 28          	mov    QWORD PTR [r15+0x28],r13
  e8d7f4:	48 89 84 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rax
  e8d7fb:	00
  e8d7fc:	4c 89 bc 24 c8 03 00 	mov    QWORD PTR [rsp+0x3c8],r15
  e8d803:	00
  e8d804:	48 8d bc 24 e8 04 00 	lea    rdi,[rsp+0x4e8]
  e8d80b:	00
  e8d80c:	48 8d b4 24 40 03 00 	lea    rsi,[rsp+0x340]
  e8d813:	00
  e8d814:	e8 27 07 96 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  e8d819:	48 8d 35 be 9c 4e ff 	lea    rsi,[rip+0xffffffffff4e9cbe]        # 3774de <_ZTSSt12bad_any_cast@@Base-0x18cea>
  e8d820:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
  e8d827:	00
  e8d828:	e8 51 c2 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  e8d82d:	4c 8b ac 24 f8 00 00 	mov    r13,QWORD PTR [rsp+0xf8]
  e8d834:	00
  e8d835:	48 8b 74 24 60       	mov    rsi,QWORD PTR [rsp+0x60]
  e8d83a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e8d83d:	48 8d bc 24 a8 03 00 	lea    rdi,[rsp+0x3a8]
  e8d844:	00
  e8d845:	48 8d 94 24 70 04 00 	lea    rdx,[rsp+0x470]
  e8d84c:	00
  e8d84d:	ff 50 18             	call   QWORD PTR [rax+0x18]
  e8d850:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]
  e8d855:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d858:	48 8d bc 24 60 04 00 	lea    rdi,[rsp+0x460]
  e8d85f:	00
  e8d860:	48 89 de             	mov    rsi,rbx
  e8d863:	ff 50 38             	call   QWORD PTR [rax+0x38]
  e8d866:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d869:	48 8d bc 24 50 04 00 	lea    rdi,[rsp+0x450]
  e8d870:	00
  e8d871:	48 89 de             	mov    rsi,rbx
  e8d874:	ff 50 58             	call   QWORD PTR [rax+0x58]
  e8d877:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d87b:	4c 89 ef             	mov    rdi,r13
  e8d87e:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d881:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d884:	48 89 c7             	mov    rdi,rax
  e8d887:	ff 51 30             	call   QWORD PTR [rcx+0x30]
  e8d88a:	49 89 c4             	mov    r12,rax
  e8d88d:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d891:	4c 89 ef             	mov    rdi,r13
  e8d894:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d897:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d89a:	48 89 c7             	mov    rdi,rax
  e8d89d:	ff 51 20             	call   QWORD PTR [rcx+0x20]
  e8d8a0:	48 89 c3             	mov    rbx,rax
  e8d8a3:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d8a7:	4c 89 ef             	mov    rdi,r13
  e8d8aa:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8ad:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8b0:	48 89 c7             	mov    rdi,rax
  e8d8b3:	ff 51 28             	call   QWORD PTR [rcx+0x28]
  e8d8b6:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
  e8d8bd:	00
  e8d8be:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d8c2:	4c 89 ef             	mov    rdi,r13
  e8d8c5:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8c8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8cb:	48 89 c7             	mov    rdi,rax
  e8d8ce:	ff 51 38             	call   QWORD PTR [rcx+0x38]
  e8d8d1:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
  e8d8d8:	00
  e8d8d9:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d8dd:	4c 89 ef             	mov    rdi,r13
  e8d8e0:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8e3:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8e6:	48 89 c7             	mov    rdi,rax
  e8d8e9:	ff 51 40             	call   QWORD PTR [rcx+0x40]
  e8d8ec:	48 89 84 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rax
```
### `0xe8d7b6`

```text
  e8d741:	4c 89 a4 24 98 04 00 	mov    QWORD PTR [rsp+0x498],r12
  e8d748:	00
  e8d749:	48 8d bc 24 88 04 00 	lea    rdi,[rsp+0x488]
  e8d750:	00
  e8d751:	48 8d b4 24 18 03 00 	lea    rsi,[rsp+0x318]
  e8d758:	00
  e8d759:	e8 60 e5 c3 ff       	call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>
  e8d75e:	48 8d bc 24 60 07 00 	lea    rdi,[rsp+0x760]
  e8d765:	00
  e8d766:	48 8d b4 24 b0 05 00 	lea    rsi,[rsp+0x5b0]
  e8d76d:	00
  e8d76e:	e8 1d cb be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e8d773:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d776:	48 89 df             	mov    rdi,rbx
  e8d779:	ff 50 40             	call   QWORD PTR [rax+0x40]
  e8d77c:	48 89 84 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rax
  e8d783:	00
  e8d784:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d787:	48 89 df             	mov    rdi,rbx
  e8d78a:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e8d78d:	48 89 84 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rax
  e8d794:	00
  e8d795:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d798:	48 89 df             	mov    rdi,rbx
  e8d79b:	ff 50 38             	call   QWORD PTR [rax+0x38]
  e8d79e:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e8d7a3:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e8d7a6:	4c 89 ff             	mov    rdi,r15
  e8d7a9:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d7ac:	48 89 c3             	mov    rbx,rax
  e8d7af:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d7b3:	4c 89 ef             	mov    rdi,r13
  e8d7b6:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d7b9:	49 89 c5             	mov    r13,rax
  e8d7bc:	6a 30                	push   0x30
  e8d7be:	5f                   	pop    rdi
  e8d7bf:	e8 3c 07 96 00       	call   17edf00 <_Znwm@plt>
  e8d7c4:	49 89 c7             	mov    r15,rax
  e8d7c7:	66 0f ef c0          	pxor   xmm0,xmm0
  e8d7cb:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e8d7d0:	48 8d 05 91 fc 96 00 	lea    rax,[rip+0x96fc91]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
  e8d7d7:	49 89 07             	mov    QWORD PTR [r15],rax
  e8d7da:	4c 89 f8             	mov    rax,r15
  e8d7dd:	48 83 c0 18          	add    rax,0x18
  e8d7e1:	48 8d 0d a8 3b 9a 00 	lea    rcx,[rip+0x9a3ba8]        # 1831390 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3328>
  e8d7e8:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
  e8d7ec:	49 89 5f 20          	mov    QWORD PTR [r15+0x20],rbx
  e8d7f0:	4d 89 6f 28          	mov    QWORD PTR [r15+0x28],r13
  e8d7f4:	48 89 84 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rax
  e8d7fb:	00
  e8d7fc:	4c 89 bc 24 c8 03 00 	mov    QWORD PTR [rsp+0x3c8],r15
  e8d803:	00
  e8d804:	48 8d bc 24 e8 04 00 	lea    rdi,[rsp+0x4e8]
  e8d80b:	00
  e8d80c:	48 8d b4 24 40 03 00 	lea    rsi,[rsp+0x340]
  e8d813:	00
  e8d814:	e8 27 07 96 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  e8d819:	48 8d 35 be 9c 4e ff 	lea    rsi,[rip+0xffffffffff4e9cbe]        # 3774de <_ZTSSt12bad_any_cast@@Base-0x18cea>
  e8d820:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
  e8d827:	00
  e8d828:	e8 51 c2 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  e8d82d:	4c 8b ac 24 f8 00 00 	mov    r13,QWORD PTR [rsp+0xf8]
  e8d834:	00
  e8d835:	48 8b 74 24 60       	mov    rsi,QWORD PTR [rsp+0x60]
  e8d83a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e8d83d:	48 8d bc 24 a8 03 00 	lea    rdi,[rsp+0x3a8]
  e8d844:	00
  e8d845:	48 8d 94 24 70 04 00 	lea    rdx,[rsp+0x470]
  e8d84c:	00
  e8d84d:	ff 50 18             	call   QWORD PTR [rax+0x18]
  e8d850:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]
  e8d855:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d858:	48 8d bc 24 60 04 00 	lea    rdi,[rsp+0x460]
  e8d85f:	00
  e8d860:	48 89 de             	mov    rsi,rbx
  e8d863:	ff 50 38             	call   QWORD PTR [rax+0x38]
  e8d866:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d869:	48 8d bc 24 50 04 00 	lea    rdi,[rsp+0x450]
  e8d870:	00
  e8d871:	48 89 de             	mov    rsi,rbx
  e8d874:	ff 50 58             	call   QWORD PTR [rax+0x58]
  e8d877:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d87b:	4c 89 ef             	mov    rdi,r13
  e8d87e:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d881:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d884:	48 89 c7             	mov    rdi,rax
  e8d887:	ff 51 30             	call   QWORD PTR [rcx+0x30]
  e8d88a:	49 89 c4             	mov    r12,rax
  e8d88d:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d891:	4c 89 ef             	mov    rdi,r13
  e8d894:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d897:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d89a:	48 89 c7             	mov    rdi,rax
  e8d89d:	ff 51 20             	call   QWORD PTR [rcx+0x20]
  e8d8a0:	48 89 c3             	mov    rbx,rax
  e8d8a3:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d8a7:	4c 89 ef             	mov    rdi,r13
  e8d8aa:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8ad:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8b0:	48 89 c7             	mov    rdi,rax
  e8d8b3:	ff 51 28             	call   QWORD PTR [rcx+0x28]
  e8d8b6:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
  e8d8bd:	00
  e8d8be:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d8c2:	4c 89 ef             	mov    rdi,r13
  e8d8c5:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8c8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8cb:	48 89 c7             	mov    rdi,rax
  e8d8ce:	ff 51 38             	call   QWORD PTR [rcx+0x38]
  e8d8d1:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
  e8d8d8:	00
  e8d8d9:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d8dd:	4c 89 ef             	mov    rdi,r13
  e8d8e0:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8e3:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8e6:	48 89 c7             	mov    rdi,rax
  e8d8e9:	ff 51 40             	call   QWORD PTR [rcx+0x40]
  e8d8ec:	48 89 84 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rax
  e8d8f3:	00
  e8d8f4:	49 8b 86 48 01 00 00 	mov    rax,QWORD PTR [r14+0x148]
  e8d8fb:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax
  e8d902:	00
```
### `0xe8d87e`

```text
  e8d803:	00
  e8d804:	48 8d bc 24 e8 04 00 	lea    rdi,[rsp+0x4e8]
  e8d80b:	00
  e8d80c:	48 8d b4 24 40 03 00 	lea    rsi,[rsp+0x340]
  e8d813:	00
  e8d814:	e8 27 07 96 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  e8d819:	48 8d 35 be 9c 4e ff 	lea    rsi,[rip+0xffffffffff4e9cbe]        # 3774de <_ZTSSt12bad_any_cast@@Base-0x18cea>
  e8d820:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
  e8d827:	00
  e8d828:	e8 51 c2 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  e8d82d:	4c 8b ac 24 f8 00 00 	mov    r13,QWORD PTR [rsp+0xf8]
  e8d834:	00
  e8d835:	48 8b 74 24 60       	mov    rsi,QWORD PTR [rsp+0x60]
  e8d83a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e8d83d:	48 8d bc 24 a8 03 00 	lea    rdi,[rsp+0x3a8]
  e8d844:	00
  e8d845:	48 8d 94 24 70 04 00 	lea    rdx,[rsp+0x470]
  e8d84c:	00
  e8d84d:	ff 50 18             	call   QWORD PTR [rax+0x18]
  e8d850:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]
  e8d855:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d858:	48 8d bc 24 60 04 00 	lea    rdi,[rsp+0x460]
  e8d85f:	00
  e8d860:	48 89 de             	mov    rsi,rbx
  e8d863:	ff 50 38             	call   QWORD PTR [rax+0x38]
  e8d866:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d869:	48 8d bc 24 50 04 00 	lea    rdi,[rsp+0x450]
  e8d870:	00
  e8d871:	48 89 de             	mov    rsi,rbx
  e8d874:	ff 50 58             	call   QWORD PTR [rax+0x58]
  e8d877:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d87b:	4c 89 ef             	mov    rdi,r13
  e8d87e:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d881:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d884:	48 89 c7             	mov    rdi,rax
  e8d887:	ff 51 30             	call   QWORD PTR [rcx+0x30]
  e8d88a:	49 89 c4             	mov    r12,rax
  e8d88d:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d891:	4c 89 ef             	mov    rdi,r13
  e8d894:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d897:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d89a:	48 89 c7             	mov    rdi,rax
  e8d89d:	ff 51 20             	call   QWORD PTR [rcx+0x20]
  e8d8a0:	48 89 c3             	mov    rbx,rax
  e8d8a3:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d8a7:	4c 89 ef             	mov    rdi,r13
  e8d8aa:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8ad:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8b0:	48 89 c7             	mov    rdi,rax
  e8d8b3:	ff 51 28             	call   QWORD PTR [rcx+0x28]
  e8d8b6:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
  e8d8bd:	00
  e8d8be:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d8c2:	4c 89 ef             	mov    rdi,r13
  e8d8c5:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8c8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8cb:	48 89 c7             	mov    rdi,rax
  e8d8ce:	ff 51 38             	call   QWORD PTR [rcx+0x38]
  e8d8d1:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
  e8d8d8:	00
  e8d8d9:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d8dd:	4c 89 ef             	mov    rdi,r13
  e8d8e0:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8e3:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8e6:	48 89 c7             	mov    rdi,rax
  e8d8e9:	ff 51 40             	call   QWORD PTR [rcx+0x40]
  e8d8ec:	48 89 84 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rax
  e8d8f3:	00
  e8d8f4:	49 8b 86 48 01 00 00 	mov    rax,QWORD PTR [r14+0x148]
  e8d8fb:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax
  e8d902:	00
  e8d903:	66 0f 6f 84 24 10 01 	movdqa xmm0,XMMWORD PTR [rsp+0x110]
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
```
### `0xe8d894`

```text
  e8d820:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
  e8d827:	00
  e8d828:	e8 51 c2 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  e8d82d:	4c 8b ac 24 f8 00 00 	mov    r13,QWORD PTR [rsp+0xf8]
  e8d834:	00
  e8d835:	48 8b 74 24 60       	mov    rsi,QWORD PTR [rsp+0x60]
  e8d83a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e8d83d:	48 8d bc 24 a8 03 00 	lea    rdi,[rsp+0x3a8]
  e8d844:	00
  e8d845:	48 8d 94 24 70 04 00 	lea    rdx,[rsp+0x470]
  e8d84c:	00
  e8d84d:	ff 50 18             	call   QWORD PTR [rax+0x18]
  e8d850:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]
  e8d855:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d858:	48 8d bc 24 60 04 00 	lea    rdi,[rsp+0x460]
  e8d85f:	00
  e8d860:	48 89 de             	mov    rsi,rbx
  e8d863:	ff 50 38             	call   QWORD PTR [rax+0x38]
  e8d866:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d869:	48 8d bc 24 50 04 00 	lea    rdi,[rsp+0x450]
  e8d870:	00
  e8d871:	48 89 de             	mov    rsi,rbx
  e8d874:	ff 50 58             	call   QWORD PTR [rax+0x58]
  e8d877:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d87b:	4c 89 ef             	mov    rdi,r13
  e8d87e:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d881:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d884:	48 89 c7             	mov    rdi,rax
  e8d887:	ff 51 30             	call   QWORD PTR [rcx+0x30]
  e8d88a:	49 89 c4             	mov    r12,rax
  e8d88d:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d891:	4c 89 ef             	mov    rdi,r13
  e8d894:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d897:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d89a:	48 89 c7             	mov    rdi,rax
  e8d89d:	ff 51 20             	call   QWORD PTR [rcx+0x20]
  e8d8a0:	48 89 c3             	mov    rbx,rax
  e8d8a3:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d8a7:	4c 89 ef             	mov    rdi,r13
  e8d8aa:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8ad:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8b0:	48 89 c7             	mov    rdi,rax
  e8d8b3:	ff 51 28             	call   QWORD PTR [rcx+0x28]
  e8d8b6:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
  e8d8bd:	00
  e8d8be:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d8c2:	4c 89 ef             	mov    rdi,r13
  e8d8c5:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8c8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8cb:	48 89 c7             	mov    rdi,rax
  e8d8ce:	ff 51 38             	call   QWORD PTR [rcx+0x38]
  e8d8d1:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
  e8d8d8:	00
  e8d8d9:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d8dd:	4c 89 ef             	mov    rdi,r13
  e8d8e0:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8e3:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8e6:	48 89 c7             	mov    rdi,rax
  e8d8e9:	ff 51 40             	call   QWORD PTR [rcx+0x40]
  e8d8ec:	48 89 84 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rax
  e8d8f3:	00
  e8d8f4:	49 8b 86 48 01 00 00 	mov    rax,QWORD PTR [r14+0x148]
  e8d8fb:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax
  e8d902:	00
  e8d903:	66 0f 6f 84 24 10 01 	movdqa xmm0,XMMWORD PTR [rsp+0x110]
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
```
### `0xe8d8aa`

```text
  e8d83d:	48 8d bc 24 a8 03 00 	lea    rdi,[rsp+0x3a8]
  e8d844:	00
  e8d845:	48 8d 94 24 70 04 00 	lea    rdx,[rsp+0x470]
  e8d84c:	00
  e8d84d:	ff 50 18             	call   QWORD PTR [rax+0x18]
  e8d850:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]
  e8d855:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d858:	48 8d bc 24 60 04 00 	lea    rdi,[rsp+0x460]
  e8d85f:	00
  e8d860:	48 89 de             	mov    rsi,rbx
  e8d863:	ff 50 38             	call   QWORD PTR [rax+0x38]
  e8d866:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d869:	48 8d bc 24 50 04 00 	lea    rdi,[rsp+0x450]
  e8d870:	00
  e8d871:	48 89 de             	mov    rsi,rbx
  e8d874:	ff 50 58             	call   QWORD PTR [rax+0x58]
  e8d877:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d87b:	4c 89 ef             	mov    rdi,r13
  e8d87e:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d881:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d884:	48 89 c7             	mov    rdi,rax
  e8d887:	ff 51 30             	call   QWORD PTR [rcx+0x30]
  e8d88a:	49 89 c4             	mov    r12,rax
  e8d88d:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d891:	4c 89 ef             	mov    rdi,r13
  e8d894:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d897:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d89a:	48 89 c7             	mov    rdi,rax
  e8d89d:	ff 51 20             	call   QWORD PTR [rcx+0x20]
  e8d8a0:	48 89 c3             	mov    rbx,rax
  e8d8a3:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d8a7:	4c 89 ef             	mov    rdi,r13
  e8d8aa:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8ad:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8b0:	48 89 c7             	mov    rdi,rax
  e8d8b3:	ff 51 28             	call   QWORD PTR [rcx+0x28]
  e8d8b6:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
  e8d8bd:	00
  e8d8be:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d8c2:	4c 89 ef             	mov    rdi,r13
  e8d8c5:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8c8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8cb:	48 89 c7             	mov    rdi,rax
  e8d8ce:	ff 51 38             	call   QWORD PTR [rcx+0x38]
  e8d8d1:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
  e8d8d8:	00
  e8d8d9:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d8dd:	4c 89 ef             	mov    rdi,r13
  e8d8e0:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8e3:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8e6:	48 89 c7             	mov    rdi,rax
  e8d8e9:	ff 51 40             	call   QWORD PTR [rcx+0x40]
  e8d8ec:	48 89 84 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rax
  e8d8f3:	00
  e8d8f4:	49 8b 86 48 01 00 00 	mov    rax,QWORD PTR [r14+0x148]
  e8d8fb:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax
  e8d902:	00
  e8d903:	66 0f 6f 84 24 10 01 	movdqa xmm0,XMMWORD PTR [rsp+0x110]
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
```
### `0xe8d8c5`

```text
  e8d85f:	00
  e8d860:	48 89 de             	mov    rsi,rbx
  e8d863:	ff 50 38             	call   QWORD PTR [rax+0x38]
  e8d866:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8d869:	48 8d bc 24 50 04 00 	lea    rdi,[rsp+0x450]
  e8d870:	00
  e8d871:	48 89 de             	mov    rsi,rbx
  e8d874:	ff 50 58             	call   QWORD PTR [rax+0x58]
  e8d877:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d87b:	4c 89 ef             	mov    rdi,r13
  e8d87e:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d881:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d884:	48 89 c7             	mov    rdi,rax
  e8d887:	ff 51 30             	call   QWORD PTR [rcx+0x30]
  e8d88a:	49 89 c4             	mov    r12,rax
  e8d88d:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d891:	4c 89 ef             	mov    rdi,r13
  e8d894:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d897:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d89a:	48 89 c7             	mov    rdi,rax
  e8d89d:	ff 51 20             	call   QWORD PTR [rcx+0x20]
  e8d8a0:	48 89 c3             	mov    rbx,rax
  e8d8a3:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d8a7:	4c 89 ef             	mov    rdi,r13
  e8d8aa:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8ad:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8b0:	48 89 c7             	mov    rdi,rax
  e8d8b3:	ff 51 28             	call   QWORD PTR [rcx+0x28]
  e8d8b6:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
  e8d8bd:	00
  e8d8be:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d8c2:	4c 89 ef             	mov    rdi,r13
  e8d8c5:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8c8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8cb:	48 89 c7             	mov    rdi,rax
  e8d8ce:	ff 51 38             	call   QWORD PTR [rcx+0x38]
  e8d8d1:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
  e8d8d8:	00
  e8d8d9:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d8dd:	4c 89 ef             	mov    rdi,r13
  e8d8e0:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8e3:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8e6:	48 89 c7             	mov    rdi,rax
  e8d8e9:	ff 51 40             	call   QWORD PTR [rcx+0x40]
  e8d8ec:	48 89 84 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rax
  e8d8f3:	00
  e8d8f4:	49 8b 86 48 01 00 00 	mov    rax,QWORD PTR [r14+0x148]
  e8d8fb:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax
  e8d902:	00
  e8d903:	66 0f 6f 84 24 10 01 	movdqa xmm0,XMMWORD PTR [rsp+0x110]
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
```
### `0xe8d8e0`

```text
  e8d877:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d87b:	4c 89 ef             	mov    rdi,r13
  e8d87e:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d881:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d884:	48 89 c7             	mov    rdi,rax
  e8d887:	ff 51 30             	call   QWORD PTR [rcx+0x30]
  e8d88a:	49 89 c4             	mov    r12,rax
  e8d88d:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d891:	4c 89 ef             	mov    rdi,r13
  e8d894:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d897:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d89a:	48 89 c7             	mov    rdi,rax
  e8d89d:	ff 51 20             	call   QWORD PTR [rcx+0x20]
  e8d8a0:	48 89 c3             	mov    rbx,rax
  e8d8a3:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d8a7:	4c 89 ef             	mov    rdi,r13
  e8d8aa:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8ad:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8b0:	48 89 c7             	mov    rdi,rax
  e8d8b3:	ff 51 28             	call   QWORD PTR [rcx+0x28]
  e8d8b6:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
  e8d8bd:	00
  e8d8be:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d8c2:	4c 89 ef             	mov    rdi,r13
  e8d8c5:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8c8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8cb:	48 89 c7             	mov    rdi,rax
  e8d8ce:	ff 51 38             	call   QWORD PTR [rcx+0x38]
  e8d8d1:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
  e8d8d8:	00
  e8d8d9:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d8dd:	4c 89 ef             	mov    rdi,r13
  e8d8e0:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8e3:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8e6:	48 89 c7             	mov    rdi,rax
  e8d8e9:	ff 51 40             	call   QWORD PTR [rcx+0x40]
  e8d8ec:	48 89 84 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rax
  e8d8f3:	00
  e8d8f4:	49 8b 86 48 01 00 00 	mov    rax,QWORD PTR [r14+0x148]
  e8d8fb:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax
  e8d902:	00
  e8d903:	66 0f 6f 84 24 10 01 	movdqa xmm0,XMMWORD PTR [rsp+0x110]
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
```
### `0xe8d95b`

```text
  e8d8dd:	4c 89 ef             	mov    rdi,r13
  e8d8e0:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8e3:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8e6:	48 89 c7             	mov    rdi,rax
  e8d8e9:	ff 51 40             	call   QWORD PTR [rcx+0x40]
  e8d8ec:	48 89 84 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rax
  e8d8f3:	00
  e8d8f4:	49 8b 86 48 01 00 00 	mov    rax,QWORD PTR [r14+0x148]
  e8d8fb:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax
  e8d902:	00
  e8d903:	66 0f 6f 84 24 10 01 	movdqa xmm0,XMMWORD PTR [rsp+0x110]
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
  e8daa8:	50                   	push   rax
  e8daa9:	ff b4 24 b8 01 00 00 	push   QWORD PTR [rsp+0x1b8]
  e8dab0:	48 8d 84 24 98 04 00 	lea    rax,[rsp+0x498]
  e8dab7:	00
```
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
  e8daa8:	50                   	push   rax
  e8daa9:	ff b4 24 b8 01 00 00 	push   QWORD PTR [rsp+0x1b8]
  e8dab0:	48 8d 84 24 98 04 00 	lea    rax,[rsp+0x498]
  e8dab7:	00
  e8dab8:	50                   	push   rax
  e8dab9:	ff b4 24 e8 01 00 00 	push   QWORD PTR [rsp+0x1e8]
  e8dac0:	48 8d 84 24 e8 05 00 	lea    rax,[rsp+0x5e8]
  e8dac7:	00
  e8dac8:	50                   	push   rax
  e8dac9:	48 8d 84 24 c8 04 00 	lea    rax,[rsp+0x4c8]
  e8dad0:	00
  e8dad1:	50                   	push   rax
  e8dad2:	ff b4 24 30 01 00 00 	push   QWORD PTR [rsp+0x130]
  e8dad9:	ff b4 24 68 02 00 00 	push   QWORD PTR [rsp+0x268]
  e8dae0:	ff b4 24 78 02 00 00 	push   QWORD PTR [rsp+0x278]
```
### `0xe8dec2`

```text
  e8de44:	31 ff                	xor    edi,edi
  e8de46:	e8 3b 06 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8de4b:	48 8d bc 24 60 07 00 	lea    rdi,[rsp+0x760]
  e8de52:	00
  e8de53:	e8 12 c1 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e8de58:	48 8b bc 24 90 04 00 	mov    rdi,QWORD PTR [rsp+0x490]
  e8de5f:	00
  e8de60:	e8 21 06 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8de65:	48 8b bc 24 98 04 00 	mov    rdi,QWORD PTR [rsp+0x498]
  e8de6c:	00
  e8de6d:	48 83 a4 24 98 04 00 	and    QWORD PTR [rsp+0x498],0x0
  e8de74:	00 00
  e8de76:	48 85 ff             	test   rdi,rdi
  e8de79:	74 06                	je     e8de81 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55297>
  e8de7b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8de7e:	ff 50 08             	call   QWORD PTR [rax+0x8]
  e8de81:	48 8d bc 24 90 07 00 	lea    rdi,[rsp+0x790]
  e8de88:	00
  e8de89:	e8 dc c0 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e8de8e:	31 ff                	xor    edi,edi
  e8de90:	e8 f1 05 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8de95:	48 8b bc 24 e0 03 00 	mov    rdi,QWORD PTR [rsp+0x3e0]
  e8de9c:	00
  e8de9d:	e8 e4 05 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8dea2:	48 8b bc 24 f8 03 00 	mov    rdi,QWORD PTR [rsp+0x3f8]
  e8dea9:	00
  e8deaa:	e8 d7 05 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8deaf:	48 8b bc 24 a8 04 00 	mov    rdi,QWORD PTR [rsp+0x4a8]
  e8deb6:	00
  e8deb7:	e8 ca 05 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8debc:	49 8b 06             	mov    rax,QWORD PTR [r14]
  e8debf:	4c 89 f7             	mov    rdi,r14
  e8dec2:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8dec5:	48 8b 88 a8 00 00 00 	mov    rcx,QWORD PTR [rax+0xa8]
  e8decc:	f3 0f 6f 80 a0 00 00 	movdqu xmm0,XMMWORD PTR [rax+0xa0]
  e8ded3:	00
  e8ded4:	66 0f 7f 84 24 60 04 	movdqa XMMWORD PTR [rsp+0x460],xmm0
  e8dedb:	00 00
  e8dedd:	48 85 c9             	test   rcx,rcx
  e8dee0:	74 05                	je     e8dee7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x552fd>
  e8dee2:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  e8dee7:	48 8d 94 24 60 04 00 	lea    rdx,[rsp+0x460]
  e8deee:	00
  e8deef:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
  e8def6:	00
  e8def7:	48 8b b4 24 b0 00 00 	mov    rsi,QWORD PTR [rsp+0xb0]
  e8defe:	00
  e8deff:	e8 ba f6 cf ff       	call   b8d5be <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda55e>
  e8df04:	48 8b bc 24 68 04 00 	mov    rdi,QWORD PTR [rsp+0x468]
  e8df0b:	00
  e8df0c:	e8 75 05 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8df11:	4d 8b ae f8 00 00 00 	mov    r13,QWORD PTR [r14+0xf8]
  e8df18:	4d 85 ed             	test   r13,r13
  e8df1b:	0f 84 ab 01 00 00    	je     e8e0cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x554e2>
  e8df21:	48 8d 35 b0 e9 4a ff 	lea    rsi,[rip+0xffffffffff4ae9b0]        # 33c8d8 <_ZTSSt12bad_any_cast@@Base-0x538f0>
  e8df28:	48 8d bc 24 d8 03 00 	lea    rdi,[rsp+0x3d8]
  e8df2f:	00
  e8df30:	e8 49 bb be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  e8df35:	48 8b b4 24 30 06 00 	mov    rsi,QWORD PTR [rsp+0x630]
  e8df3c:	00
  e8df3d:	48 8d bc 24 f0 03 00 	lea    rdi,[rsp+0x3f0]
  e8df44:	00
  e8df45:	48 8d 94 24 d8 03 00 	lea    rdx,[rsp+0x3d8]
  e8df4c:	00
  e8df4d:	e8 68 f1 c1 ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
  e8df52:	48 8d 35 6d 95 4d ff 	lea    rsi,[rip+0xffffffffff4d956d]        # 3674c6 <_ZTSSt12bad_any_cast@@Base-0x28d02>
  e8df59:	48 8d bc 24 a8 03 00 	lea    rdi,[rsp+0x3a8]
  e8df60:	00
  e8df61:	e8 18 bb be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  e8df66:	48 8b b4 24 30 06 00 	mov    rsi,QWORD PTR [rsp+0x630]
  e8df6d:	00
  e8df6e:	48 8d bc 24 c0 03 00 	lea    rdi,[rsp+0x3c0]
  e8df75:	00
  e8df76:	48 8d 94 24 a8 03 00 	lea    rdx,[rsp+0x3a8]
  e8df7d:	00
  e8df7e:	e8 37 f1 c1 ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
  e8df83:	0f 28 84 24 20 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x320]
  e8df8a:	00
  e8df8b:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
  e8df90:	48 8b 84 24 28 03 00 	mov    rax,QWORD PTR [rsp+0x328]
  e8df97:	00
  e8df98:	48 85 c0             	test   rax,rax
  e8df9b:	74 05                	je     e8dfa2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x553b8>
  e8df9d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e8dfa2:	6a 48                	push   0x48
  e8dfa4:	5f                   	pop    rdi
  e8dfa5:	e8 56 ff 95 00       	call   17edf00 <_Znwm@plt>
  e8dfaa:	48 89 c3             	mov    rbx,rax
  e8dfad:	48 8b 84 24 00 04 00 	mov    rax,QWORD PTR [rsp+0x400]
  e8dfb4:	00
  e8dfb5:	4c 8d bc 24 40 06 00 	lea    r15,[rsp+0x640]
  e8dfbc:	00
  e8dfbd:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
  e8dfc1:	0f 28 84 24 f0 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x3f0]
  e8dfc8:	00
  e8dfc9:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
  e8dfcd:	0f 57 c0             	xorps  xmm0,xmm0
  e8dfd0:	0f 29 84 24 f0 03 00 	movaps XMMWORD PTR [rsp+0x3f0],xmm0
  e8dfd7:	00
  e8dfd8:	48 83 a4 24 00 04 00 	and    QWORD PTR [rsp+0x400],0x0
  e8dfdf:	00 00
  e8dfe1:	0f 28 8c 24 c0 03 00 	movaps xmm1,XMMWORD PTR [rsp+0x3c0]
  e8dfe8:	00
  e8dfe9:	4c 8d a4 24 90 07 00 	lea    r12,[rsp+0x790]
  e8dff0:	00
  e8dff1:	41 0f 29 0c 24       	movaps XMMWORD PTR [r12],xmm1
  e8dff6:	48 8b 84 24 d0 03 00 	mov    rax,QWORD PTR [rsp+0x3d0]
  e8dffd:	00
  e8dffe:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
  e8e003:	48 83 a4 24 d0 03 00 	and    QWORD PTR [rsp+0x3d0],0x0
  e8e00a:	00 00
  e8e00c:	0f 29 84 24 c0 03 00 	movaps XMMWORD PTR [rsp+0x3c0],xmm0
  e8e013:	00
  e8e014:	48 8d 05 d5 8b 9b 00 	lea    rax,[rip+0x9b8bd5]        # 1846bf0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32d8>
  e8e01b:	48 89 03             	mov    QWORD PTR [rbx],rax
  e8e01e:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
  e8e022:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  e8e026:	41 0f 28 0f          	movaps xmm1,XMMWORD PTR [r15]
  e8e02a:	0f 11 4b 08          	movups XMMWORD PTR [rbx+0x8],xmm1
  e8e02e:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
  e8e032:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
  e8e037:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
```
### `0xe8dec5`

```text
  e8de46:	e8 3b 06 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8de4b:	48 8d bc 24 60 07 00 	lea    rdi,[rsp+0x760]
  e8de52:	00
  e8de53:	e8 12 c1 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e8de58:	48 8b bc 24 90 04 00 	mov    rdi,QWORD PTR [rsp+0x490]
  e8de5f:	00
  e8de60:	e8 21 06 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8de65:	48 8b bc 24 98 04 00 	mov    rdi,QWORD PTR [rsp+0x498]
  e8de6c:	00
  e8de6d:	48 83 a4 24 98 04 00 	and    QWORD PTR [rsp+0x498],0x0
  e8de74:	00 00
  e8de76:	48 85 ff             	test   rdi,rdi
  e8de79:	74 06                	je     e8de81 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55297>
  e8de7b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8de7e:	ff 50 08             	call   QWORD PTR [rax+0x8]
  e8de81:	48 8d bc 24 90 07 00 	lea    rdi,[rsp+0x790]
  e8de88:	00
  e8de89:	e8 dc c0 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e8de8e:	31 ff                	xor    edi,edi
  e8de90:	e8 f1 05 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8de95:	48 8b bc 24 e0 03 00 	mov    rdi,QWORD PTR [rsp+0x3e0]
  e8de9c:	00
  e8de9d:	e8 e4 05 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8dea2:	48 8b bc 24 f8 03 00 	mov    rdi,QWORD PTR [rsp+0x3f8]
  e8dea9:	00
  e8deaa:	e8 d7 05 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8deaf:	48 8b bc 24 a8 04 00 	mov    rdi,QWORD PTR [rsp+0x4a8]
  e8deb6:	00
  e8deb7:	e8 ca 05 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8debc:	49 8b 06             	mov    rax,QWORD PTR [r14]
  e8debf:	4c 89 f7             	mov    rdi,r14
  e8dec2:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8dec5:	48 8b 88 a8 00 00 00 	mov    rcx,QWORD PTR [rax+0xa8]
  e8decc:	f3 0f 6f 80 a0 00 00 	movdqu xmm0,XMMWORD PTR [rax+0xa0]
  e8ded3:	00
  e8ded4:	66 0f 7f 84 24 60 04 	movdqa XMMWORD PTR [rsp+0x460],xmm0
  e8dedb:	00 00
  e8dedd:	48 85 c9             	test   rcx,rcx
  e8dee0:	74 05                	je     e8dee7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x552fd>
  e8dee2:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  e8dee7:	48 8d 94 24 60 04 00 	lea    rdx,[rsp+0x460]
  e8deee:	00
  e8deef:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
  e8def6:	00
  e8def7:	48 8b b4 24 b0 00 00 	mov    rsi,QWORD PTR [rsp+0xb0]
  e8defe:	00
  e8deff:	e8 ba f6 cf ff       	call   b8d5be <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda55e>
  e8df04:	48 8b bc 24 68 04 00 	mov    rdi,QWORD PTR [rsp+0x468]
  e8df0b:	00
  e8df0c:	e8 75 05 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8df11:	4d 8b ae f8 00 00 00 	mov    r13,QWORD PTR [r14+0xf8]
  e8df18:	4d 85 ed             	test   r13,r13
  e8df1b:	0f 84 ab 01 00 00    	je     e8e0cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x554e2>
  e8df21:	48 8d 35 b0 e9 4a ff 	lea    rsi,[rip+0xffffffffff4ae9b0]        # 33c8d8 <_ZTSSt12bad_any_cast@@Base-0x538f0>
  e8df28:	48 8d bc 24 d8 03 00 	lea    rdi,[rsp+0x3d8]
  e8df2f:	00
  e8df30:	e8 49 bb be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  e8df35:	48 8b b4 24 30 06 00 	mov    rsi,QWORD PTR [rsp+0x630]
  e8df3c:	00
  e8df3d:	48 8d bc 24 f0 03 00 	lea    rdi,[rsp+0x3f0]
  e8df44:	00
  e8df45:	48 8d 94 24 d8 03 00 	lea    rdx,[rsp+0x3d8]
  e8df4c:	00
  e8df4d:	e8 68 f1 c1 ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
  e8df52:	48 8d 35 6d 95 4d ff 	lea    rsi,[rip+0xffffffffff4d956d]        # 3674c6 <_ZTSSt12bad_any_cast@@Base-0x28d02>
  e8df59:	48 8d bc 24 a8 03 00 	lea    rdi,[rsp+0x3a8]
  e8df60:	00
  e8df61:	e8 18 bb be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  e8df66:	48 8b b4 24 30 06 00 	mov    rsi,QWORD PTR [rsp+0x630]
  e8df6d:	00
  e8df6e:	48 8d bc 24 c0 03 00 	lea    rdi,[rsp+0x3c0]
  e8df75:	00
  e8df76:	48 8d 94 24 a8 03 00 	lea    rdx,[rsp+0x3a8]
  e8df7d:	00
  e8df7e:	e8 37 f1 c1 ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
  e8df83:	0f 28 84 24 20 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x320]
  e8df8a:	00
  e8df8b:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
  e8df90:	48 8b 84 24 28 03 00 	mov    rax,QWORD PTR [rsp+0x328]
  e8df97:	00
  e8df98:	48 85 c0             	test   rax,rax
  e8df9b:	74 05                	je     e8dfa2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x553b8>
  e8df9d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e8dfa2:	6a 48                	push   0x48
  e8dfa4:	5f                   	pop    rdi
  e8dfa5:	e8 56 ff 95 00       	call   17edf00 <_Znwm@plt>
  e8dfaa:	48 89 c3             	mov    rbx,rax
  e8dfad:	48 8b 84 24 00 04 00 	mov    rax,QWORD PTR [rsp+0x400]
  e8dfb4:	00
  e8dfb5:	4c 8d bc 24 40 06 00 	lea    r15,[rsp+0x640]
  e8dfbc:	00
  e8dfbd:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
  e8dfc1:	0f 28 84 24 f0 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x3f0]
  e8dfc8:	00
  e8dfc9:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
  e8dfcd:	0f 57 c0             	xorps  xmm0,xmm0
  e8dfd0:	0f 29 84 24 f0 03 00 	movaps XMMWORD PTR [rsp+0x3f0],xmm0
  e8dfd7:	00
  e8dfd8:	48 83 a4 24 00 04 00 	and    QWORD PTR [rsp+0x400],0x0
  e8dfdf:	00 00
  e8dfe1:	0f 28 8c 24 c0 03 00 	movaps xmm1,XMMWORD PTR [rsp+0x3c0]
  e8dfe8:	00
  e8dfe9:	4c 8d a4 24 90 07 00 	lea    r12,[rsp+0x790]
  e8dff0:	00
  e8dff1:	41 0f 29 0c 24       	movaps XMMWORD PTR [r12],xmm1
  e8dff6:	48 8b 84 24 d0 03 00 	mov    rax,QWORD PTR [rsp+0x3d0]
  e8dffd:	00
  e8dffe:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
  e8e003:	48 83 a4 24 d0 03 00 	and    QWORD PTR [rsp+0x3d0],0x0
  e8e00a:	00 00
  e8e00c:	0f 29 84 24 c0 03 00 	movaps XMMWORD PTR [rsp+0x3c0],xmm0
  e8e013:	00
  e8e014:	48 8d 05 d5 8b 9b 00 	lea    rax,[rip+0x9b8bd5]        # 1846bf0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32d8>
  e8e01b:	48 89 03             	mov    QWORD PTR [rbx],rax
  e8e01e:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
  e8e022:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  e8e026:	41 0f 28 0f          	movaps xmm1,XMMWORD PTR [r15]
  e8e02a:	0f 11 4b 08          	movups XMMWORD PTR [rbx+0x8],xmm1
  e8e02e:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
  e8e032:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
  e8e037:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
  e8e03c:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
```
### `0xe8decc`

```text
  e8de4b:	48 8d bc 24 60 07 00 	lea    rdi,[rsp+0x760]
  e8de52:	00
  e8de53:	e8 12 c1 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e8de58:	48 8b bc 24 90 04 00 	mov    rdi,QWORD PTR [rsp+0x490]
  e8de5f:	00
  e8de60:	e8 21 06 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8de65:	48 8b bc 24 98 04 00 	mov    rdi,QWORD PTR [rsp+0x498]
  e8de6c:	00
  e8de6d:	48 83 a4 24 98 04 00 	and    QWORD PTR [rsp+0x498],0x0
  e8de74:	00 00
  e8de76:	48 85 ff             	test   rdi,rdi
  e8de79:	74 06                	je     e8de81 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55297>
  e8de7b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8de7e:	ff 50 08             	call   QWORD PTR [rax+0x8]
  e8de81:	48 8d bc 24 90 07 00 	lea    rdi,[rsp+0x790]
  e8de88:	00
  e8de89:	e8 dc c0 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e8de8e:	31 ff                	xor    edi,edi
  e8de90:	e8 f1 05 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8de95:	48 8b bc 24 e0 03 00 	mov    rdi,QWORD PTR [rsp+0x3e0]
  e8de9c:	00
  e8de9d:	e8 e4 05 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8dea2:	48 8b bc 24 f8 03 00 	mov    rdi,QWORD PTR [rsp+0x3f8]
  e8dea9:	00
  e8deaa:	e8 d7 05 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8deaf:	48 8b bc 24 a8 04 00 	mov    rdi,QWORD PTR [rsp+0x4a8]
  e8deb6:	00
  e8deb7:	e8 ca 05 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8debc:	49 8b 06             	mov    rax,QWORD PTR [r14]
  e8debf:	4c 89 f7             	mov    rdi,r14
  e8dec2:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8dec5:	48 8b 88 a8 00 00 00 	mov    rcx,QWORD PTR [rax+0xa8]
  e8decc:	f3 0f 6f 80 a0 00 00 	movdqu xmm0,XMMWORD PTR [rax+0xa0]
  e8ded3:	00
  e8ded4:	66 0f 7f 84 24 60 04 	movdqa XMMWORD PTR [rsp+0x460],xmm0
  e8dedb:	00 00
  e8dedd:	48 85 c9             	test   rcx,rcx
  e8dee0:	74 05                	je     e8dee7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x552fd>
  e8dee2:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  e8dee7:	48 8d 94 24 60 04 00 	lea    rdx,[rsp+0x460]
  e8deee:	00
  e8deef:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
  e8def6:	00
  e8def7:	48 8b b4 24 b0 00 00 	mov    rsi,QWORD PTR [rsp+0xb0]
  e8defe:	00
  e8deff:	e8 ba f6 cf ff       	call   b8d5be <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda55e>
  e8df04:	48 8b bc 24 68 04 00 	mov    rdi,QWORD PTR [rsp+0x468]
  e8df0b:	00
  e8df0c:	e8 75 05 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8df11:	4d 8b ae f8 00 00 00 	mov    r13,QWORD PTR [r14+0xf8]
  e8df18:	4d 85 ed             	test   r13,r13
  e8df1b:	0f 84 ab 01 00 00    	je     e8e0cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x554e2>
  e8df21:	48 8d 35 b0 e9 4a ff 	lea    rsi,[rip+0xffffffffff4ae9b0]        # 33c8d8 <_ZTSSt12bad_any_cast@@Base-0x538f0>
  e8df28:	48 8d bc 24 d8 03 00 	lea    rdi,[rsp+0x3d8]
  e8df2f:	00
  e8df30:	e8 49 bb be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  e8df35:	48 8b b4 24 30 06 00 	mov    rsi,QWORD PTR [rsp+0x630]
  e8df3c:	00
  e8df3d:	48 8d bc 24 f0 03 00 	lea    rdi,[rsp+0x3f0]
  e8df44:	00
  e8df45:	48 8d 94 24 d8 03 00 	lea    rdx,[rsp+0x3d8]
  e8df4c:	00
  e8df4d:	e8 68 f1 c1 ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
  e8df52:	48 8d 35 6d 95 4d ff 	lea    rsi,[rip+0xffffffffff4d956d]        # 3674c6 <_ZTSSt12bad_any_cast@@Base-0x28d02>
  e8df59:	48 8d bc 24 a8 03 00 	lea    rdi,[rsp+0x3a8]
  e8df60:	00
  e8df61:	e8 18 bb be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  e8df66:	48 8b b4 24 30 06 00 	mov    rsi,QWORD PTR [rsp+0x630]
  e8df6d:	00
  e8df6e:	48 8d bc 24 c0 03 00 	lea    rdi,[rsp+0x3c0]
  e8df75:	00
  e8df76:	48 8d 94 24 a8 03 00 	lea    rdx,[rsp+0x3a8]
  e8df7d:	00
  e8df7e:	e8 37 f1 c1 ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
  e8df83:	0f 28 84 24 20 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x320]
  e8df8a:	00
  e8df8b:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
  e8df90:	48 8b 84 24 28 03 00 	mov    rax,QWORD PTR [rsp+0x328]
  e8df97:	00
  e8df98:	48 85 c0             	test   rax,rax
  e8df9b:	74 05                	je     e8dfa2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x553b8>
  e8df9d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e8dfa2:	6a 48                	push   0x48
  e8dfa4:	5f                   	pop    rdi
  e8dfa5:	e8 56 ff 95 00       	call   17edf00 <_Znwm@plt>
  e8dfaa:	48 89 c3             	mov    rbx,rax
  e8dfad:	48 8b 84 24 00 04 00 	mov    rax,QWORD PTR [rsp+0x400]
  e8dfb4:	00
  e8dfb5:	4c 8d bc 24 40 06 00 	lea    r15,[rsp+0x640]
  e8dfbc:	00
  e8dfbd:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
  e8dfc1:	0f 28 84 24 f0 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x3f0]
  e8dfc8:	00
  e8dfc9:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
  e8dfcd:	0f 57 c0             	xorps  xmm0,xmm0
  e8dfd0:	0f 29 84 24 f0 03 00 	movaps XMMWORD PTR [rsp+0x3f0],xmm0
  e8dfd7:	00
  e8dfd8:	48 83 a4 24 00 04 00 	and    QWORD PTR [rsp+0x400],0x0
  e8dfdf:	00 00
  e8dfe1:	0f 28 8c 24 c0 03 00 	movaps xmm1,XMMWORD PTR [rsp+0x3c0]
  e8dfe8:	00
  e8dfe9:	4c 8d a4 24 90 07 00 	lea    r12,[rsp+0x790]
  e8dff0:	00
  e8dff1:	41 0f 29 0c 24       	movaps XMMWORD PTR [r12],xmm1
  e8dff6:	48 8b 84 24 d0 03 00 	mov    rax,QWORD PTR [rsp+0x3d0]
  e8dffd:	00
  e8dffe:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
  e8e003:	48 83 a4 24 d0 03 00 	and    QWORD PTR [rsp+0x3d0],0x0
  e8e00a:	00 00
  e8e00c:	0f 29 84 24 c0 03 00 	movaps XMMWORD PTR [rsp+0x3c0],xmm0
  e8e013:	00
  e8e014:	48 8d 05 d5 8b 9b 00 	lea    rax,[rip+0x9b8bd5]        # 1846bf0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32d8>
  e8e01b:	48 89 03             	mov    QWORD PTR [rbx],rax
  e8e01e:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
  e8e022:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  e8e026:	41 0f 28 0f          	movaps xmm1,XMMWORD PTR [r15]
  e8e02a:	0f 11 4b 08          	movups XMMWORD PTR [rbx+0x8],xmm1
  e8e02e:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
  e8e032:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
  e8e037:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
  e8e03c:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
  e8e040:	66 41 0f 6f 0c 24    	movdqa xmm1,XMMWORD PTR [r12]
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
  e8e273:	00 00
  e8e275:	48 3b 84 24 c0 07 00 	cmp    rax,QWORD PTR [rsp+0x7c0]
  e8e27c:	00
  e8e27d:	0f 85 10 06 00 00    	jne    e8e893 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55ca9>
  e8e283:	48 89 d8             	mov    rax,rbx
  e8e286:	48 81 c4 c8 07 00 00 	add    rsp,0x7c8
  e8e28d:	5b                   	pop    rbx
  e8e28e:	41 5c                	pop    r12
  e8e290:	41 5d                	pop    r13
  e8e292:	41 5e                	pop    r14
  e8e294:	41 5f                	pop    r15
  e8e296:	5d                   	pop    rbp
  e8e297:	c3                   	ret
  e8e298:	e8 22 bd be ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  e8e29d:	e8 1d bd be ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
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
  e8e881:	48 3b 84 24 c0 07 00 	cmp    rax,QWORD PTR [rsp+0x7c0]
  e8e888:	00
  e8e889:	75 08                	jne    e8e893 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55ca9>
  e8e88b:	48 89 df             	mov    rdi,rbx
  e8e88e:	e8 3d 14 be ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e8e893:	e8 18 12 96 00       	call   17efab0 <__stack_chk_fail@plt>
  e8e898:	53                   	push   rbx
  e8e899:	48 89 fb             	mov    rbx,rdi
  e8e89c:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  e8e8a0:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  e8e8a4:	6a 75                	push   0x75
  e8e8a6:	5a                   	pop    rdx
  e8e8a7:	e8 32 3a cd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  e8e8ac:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e8e8af:	48 8b 80 a8 03 00 00 	mov    rax,QWORD PTR [rax+0x3a8]
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
  e8fdbd:	eb 02                	jmp    e8fdc1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x571d7>
  e8fdbf:	31 c0                	xor    eax,eax
  e8fdc1:	48 89 84 24 70 05 00 	mov    QWORD PTR [rsp+0x570],rax
  e8fdc8:	00
  e8fdc9:	eb 0e                	jmp    e8fdd9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x571ef>
  e8fdcb:	48 89 b4 24 70 05 00 	mov    QWORD PTR [rsp+0x570],rsi
  e8fdd2:	00
  e8fdd3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8fdd6:	ff 50 18             	call   QWORD PTR [rax+0x18]
  e8fdd9:	48 8b bc 24 d8 0a 00 	mov    rdi,QWORD PTR [rsp+0xad8]
  e8fde0:	00
  e8fde1:	48 8d b4 24 80 05 00 	lea    rsi,[rsp+0x580]
  e8fde8:	00
  e8fde9:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e8fded:	48 85 c0             	test   rax,rax
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
  e9147b:	66 0f ef c9          	pxor   xmm1,xmm1
  e9147f:	74 0f                	je     e91490 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x588a6>
  e91481:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e91486:	f3 41 0f 6f 8c 24 80 	movdqu xmm1,XMMWORD PTR [r12+0x80]
  e9148d:	00 00 00
  e91490:	41 0f 11 84 24 80 00 	movups XMMWORD PTR [r12+0x80],xmm0
  e91497:	00 00
  e91499:	66 48 0f 3a 16 cf 01 	pextrq rdi,xmm1,0x1
  e914a0:	e8 e1 cf c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e914a5:	f3 41 0f 6f 84 24 80 	movdqu xmm0,XMMWORD PTR [r12+0x80]
  e914ac:	00 00 00
  e914af:	4d 8b b4 24 88 00 00 	mov    r14,QWORD PTR [r12+0x88]
  e914b6:	00
  e914b7:	4d 85 f6             	test   r14,r14
  e914ba:	74 14                	je     e914d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x588e6>
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
  e92c27:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e92c2e:	00 00
  e92c30:	48 3b 84 24 c0 09 00 	cmp    rax,QWORD PTR [rsp+0x9c0]
  e92c37:	00
  e92c38:	75 0a                	jne    e92c44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05a>
  e92c3a:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  e92c3f:	e8 8c d0 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e92c44:	e8 67 ce 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e92c49:	41 57                	push   r15
  e92c4b:	41 56                	push   r14
  e92c4d:	41 54                	push   r12
  e92c4f:	53                   	push   rbx
  e92c50:	50                   	push   rax
  e92c51:	48 89 d3             	mov    rbx,rdx
  e92c54:	48 39 f7             	cmp    rdi,rsi
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
```
### `0xe930da`

```text
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
```
### `0xe93166`

```text
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
```
### `0xe931f5`

```text
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
  e9358d:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
  e93594:	00
  e93595:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]
  e9359c:	00
  e9359d:	e8 2c 5f 00 00       	call   e994ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608e4>
  e935a2:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
  e935a7:	48 8b bc 24 58 10 00 	mov    rdi,QWORD PTR [rsp+0x1058]
  e935ae:	00
  e935af:	e8 d2 ae c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e935b4:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e935bb:	00
  e935bc:	e8 27 72 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e935c1:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
  e935c8:	00
  e935c9:	e8 f6 72 f6 ff       	call   dfa8c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc794a>
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
  e93595:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]
  e9359c:	00
  e9359d:	e8 2c 5f 00 00       	call   e994ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608e4>
  e935a2:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
  e935a7:	48 8b bc 24 58 10 00 	mov    rdi,QWORD PTR [rsp+0x1058]
  e935ae:	00
  e935af:	e8 d2 ae c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e935b4:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e935bb:	00
  e935bc:	e8 27 72 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e935c1:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
  e935c8:	00
  e935c9:	e8 f6 72 f6 ff       	call   dfa8c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc794a>
  e935ce:	31 ff                	xor    edi,edi
  e935d0:	e8 dd ae c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
```
### `0xe934e3`

```text
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
  e93595:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]
  e9359c:	00
  e9359d:	e8 2c 5f 00 00       	call   e994ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608e4>
  e935a2:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
  e935a7:	48 8b bc 24 58 10 00 	mov    rdi,QWORD PTR [rsp+0x1058]
  e935ae:	00
  e935af:	e8 d2 ae c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e935b4:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e935bb:	00
  e935bc:	e8 27 72 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e935c1:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
  e935c8:	00
  e935c9:	e8 f6 72 f6 ff       	call   dfa8c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc794a>
  e935ce:	31 ff                	xor    edi,edi
  e935d0:	e8 dd ae c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e935d5:	31 ff                	xor    edi,edi
  e935d7:	e8 d6 ae c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e935dc:	49 8d bd e0 03 00 00 	lea    rdi,[r13+0x3e0]
  e935e3:	48 8d 9c 24 10 0e 00 	lea    rbx,[rsp+0xe10]
  e935ea:	00
  e935eb:	48 89 de             	mov    rsi,rbx
  e935ee:	e8 6b 60 00 00       	call   e9965e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60a74>
  e935f3:	48 89 df             	mov    rdi,rbx
  e935f6:	e8 69 95 c2 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
  e935fb:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
  e935ff:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e93602:	48 8d 35 76 0c 54 ff 	lea    rsi,[rip+0xffffffffff540c76]        # 3d427f <_ZTSN5boost17bad_function_callE@@Base+0x15c5>
  e93609:	48 8d 0d 80 0c 54 ff 	lea    rcx,[rip+0xffffffffff540c80]        # 3d4290 <_ZTSN5boost17bad_function_callE@@Base+0x15d6>
  e93610:	6a 0b                	push   0xb
  e93612:	5a                   	pop    rdx
  e93613:	6a 1a                	push   0x1a
  e93615:	41 58                	pop    r8
  e93617:	45 31 c9             	xor    r9d,r9d
  e9361a:	e8 6b 3d 75 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9361f:	88 44 24 1f          	mov    BYTE PTR [rsp+0x1f],al
  e93623:	84 c0                	test   al,al
  e93625:	74 73                	je     e9369a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5aab0>
  e93627:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
  e9362e:	00
  e9362f:	e8 52 62 00 00       	call   e99886 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60c9c>
  e93634:	bf d0 00 00 00       	mov    edi,0xd0
  e93639:	e8 c2 a8 95 00       	call   17edf00 <_Znwm@plt>
  e9363e:	49 89 c6             	mov    r14,rax
  e93641:	66 0f ef c0          	pxor   xmm0,xmm0
  e93645:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e9364a:	48 8d 05 77 dd 99 00 	lea    rax,[rip+0x99dd77]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
  e93651:	49 89 06             	mov    QWORD PTR [r14],rax
  e93654:	f3 41 0f 6f 85 a8 04 	movdqu xmm0,XMMWORD PTR [r13+0x4a8]
  e9365b:	00 00
```
### `0xe93587`

```text
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
  e93595:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]
  e9359c:	00
  e9359d:	e8 2c 5f 00 00       	call   e994ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608e4>
  e935a2:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
  e935a7:	48 8b bc 24 58 10 00 	mov    rdi,QWORD PTR [rsp+0x1058]
  e935ae:	00
  e935af:	e8 d2 ae c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e935b4:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e935bb:	00
  e935bc:	e8 27 72 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e935c1:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
  e935c8:	00
  e935c9:	e8 f6 72 f6 ff       	call   dfa8c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc794a>
  e935ce:	31 ff                	xor    edi,edi
  e935d0:	e8 dd ae c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e935d5:	31 ff                	xor    edi,edi
  e935d7:	e8 d6 ae c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e935dc:	49 8d bd e0 03 00 00 	lea    rdi,[r13+0x3e0]
  e935e3:	48 8d 9c 24 10 0e 00 	lea    rbx,[rsp+0xe10]
  e935ea:	00
  e935eb:	48 89 de             	mov    rsi,rbx
  e935ee:	e8 6b 60 00 00       	call   e9965e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60a74>
  e935f3:	48 89 df             	mov    rdi,rbx
  e935f6:	e8 69 95 c2 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
  e935fb:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
  e935ff:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e93602:	48 8d 35 76 0c 54 ff 	lea    rsi,[rip+0xffffffffff540c76]        # 3d427f <_ZTSN5boost17bad_function_callE@@Base+0x15c5>
  e93609:	48 8d 0d 80 0c 54 ff 	lea    rcx,[rip+0xffffffffff540c80]        # 3d4290 <_ZTSN5boost17bad_function_callE@@Base+0x15d6>
  e93610:	6a 0b                	push   0xb
  e93612:	5a                   	pop    rdx
  e93613:	6a 1a                	push   0x1a
  e93615:	41 58                	pop    r8
  e93617:	45 31 c9             	xor    r9d,r9d
  e9361a:	e8 6b 3d 75 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9361f:	88 44 24 1f          	mov    BYTE PTR [rsp+0x1f],al
  e93623:	84 c0                	test   al,al
  e93625:	74 73                	je     e9369a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5aab0>
  e93627:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
  e9362e:	00
  e9362f:	e8 52 62 00 00       	call   e99886 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60c9c>
  e93634:	bf d0 00 00 00       	mov    edi,0xd0
  e93639:	e8 c2 a8 95 00       	call   17edf00 <_Znwm@plt>
  e9363e:	49 89 c6             	mov    r14,rax
  e93641:	66 0f ef c0          	pxor   xmm0,xmm0
  e93645:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e9364a:	48 8d 05 77 dd 99 00 	lea    rax,[rip+0x99dd77]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
  e93651:	49 89 06             	mov    QWORD PTR [r14],rax
  e93654:	f3 41 0f 6f 85 a8 04 	movdqu xmm0,XMMWORD PTR [r13+0x4a8]
  e9365b:	00 00
  e9365d:	49 8b 85 b0 04 00 00 	mov    rax,QWORD PTR [r13+0x4b0]
  e93664:	48 85 c0             	test   rax,rax
  e93667:	74 05                	je     e9366e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5aa84>
  e93669:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9366e:	4d 8d 6e 18          	lea    r13,[r14+0x18]
  e93672:	48 8d 05 ef 12 9b 00 	lea    rax,[rip+0x9b12ef]        # 1844968 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1050>
  e93679:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  e9367d:	f3 41 0f 7f 46 20    	movdqu XMMWORD PTR [r14+0x20],xmm0
  e93683:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
  e9368a:	48 85 db             	test   rbx,rbx
  e9368d:	74 36                	je     e936c5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5aadb>
  e9368f:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  e93694:	4d 8b 7e 20          	mov    r15,QWORD PTR [r14+0x20]
  e93698:	eb 30                	jmp    e936ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5aae0>
  e9369a:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e936a1:	00
  e936a2:	e8 df 61 00 00       	call   e99886 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60c9c>
  e936a7:	66 0f 6f 84 24 e0 0b 	movdqa xmm0,XMMWORD PTR [rsp+0xbe0]
  e936ae:	00 00
  e936b0:	66 0f 7f 84 24 00 01 	movdqa XMMWORD PTR [rsp+0x100],xmm0
  e936b7:	00 00
  e936b9:	31 ff                	xor    edi,edi
  e936bb:	e8 c6 ad c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e936c0:	e9 7f 02 00 00       	jmp    e93944 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ad5a>
  e936c5:	66 49 0f 7e c7       	movq   r15,xmm0
  e936ca:	4c 8d 84 24 50 10 00 	lea    r8,[rsp+0x1050]
  e936d1:	00
  e936d2:	4d 89 28             	mov    QWORD PTR [r8],r13
  e936d5:	48 8d 35 b5 99 c0 ff 	lea    rsi,[rip+0xffffffffffc099b5]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
  e936dc:	48 8d 0d ab 65 17 00 	lea    rcx,[rip+0x1765ab]        # 1009c8e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d10a4>
  e936e3:	4c 8d a4 24 e0 0b 00 	lea    r12,[rsp+0xbe0]
  e936ea:	00
  e936eb:	6a 08                	push   0x8
  e936ed:	41 59                	pop    r9
  e936ef:	4c 89 e7             	mov    rdi,r12
  e936f2:	31 d2                	xor    edx,edx
  e936f4:	e8 9b 70 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e936f9:	49 8b 07             	mov    rax,QWORD PTR [r15]
```
### `0xe94285`

```text
  e94207:	00 00
  e94209:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
  e94210:	48 85 c0             	test   rax,rax
  e94213:	74 05                	je     e9421a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b630>
  e94215:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9421a:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
  e9421f:	48 89 5c 24 58       	mov    QWORD PTR [rsp+0x58],rbx
  e94224:	f0 48 ff 03          	lock inc QWORD PTR [rbx]
  e94228:	6a 30                	push   0x30
  e9422a:	5b                   	pop    rbx
  e9422b:	48 89 df             	mov    rdi,rbx
  e9422e:	e8 cd 9c 95 00       	call   17edf00 <_Znwm@plt>
  e94233:	49 89 c7             	mov    r15,rax
  e94236:	66 0f ef c0          	pxor   xmm0,xmm0
  e9423a:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e9423f:	48 8d 05 1a d9 99 00 	lea    rax,[rip+0x99d91a]        # 1831b60 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3af8>
  e94246:	49 89 07             	mov    QWORD PTR [r15],rax
  e94249:	49 8d 47 20          	lea    rax,[r15+0x20]
  e9424d:	f3 41 0f 7f 47 20    	movdqu XMMWORD PTR [r15+0x20],xmm0
  e94253:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
  e94257:	6a 48                	push   0x48
  e94259:	5f                   	pop    rdi
  e9425a:	e8 a1 9c 95 00       	call   17edf00 <_Znwm@plt>
  e9425f:	4c 89 f9             	mov    rcx,r15
  e94262:	48 83 c1 18          	add    rcx,0x18
  e94266:	66 0f ef c0          	pxor   xmm0,xmm0
  e9426a:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e9426f:	48 8d 15 22 d9 99 00 	lea    rdx,[rip+0x99d922]        # 1831b98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3b30>
  e94276:	48 89 10             	mov    QWORD PTR [rax],rdx
  e94279:	48 89 c2             	mov    rdx,rax
  e9427c:	48 83 c2 18          	add    rdx,0x18
  e94280:	f3 0f 7f 40 18       	movdqu XMMWORD PTR [rax+0x18],xmm0
  e94285:	f3 0f 7f 40 28       	movdqu XMMWORD PTR [rax+0x28],xmm0
  e9428a:	f3 0f 7f 40 38       	movdqu XMMWORD PTR [rax+0x38],xmm0
  e9428f:	48 8b b4 24 90 00 00 	mov    rsi,QWORD PTR [rsp+0x90]
  e94296:	00
  e94297:	f0 48 ff 46 08       	lock inc QWORD PTR [rsi+0x8]
  e9429c:	0f 28 84 24 00 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x100]
  e942a3:	00
  e942a4:	0f 29 84 24 30 03 00 	movaps XMMWORD PTR [rsp+0x330],xmm0
  e942ab:	00
  e942ac:	48 89 ac 24 40 03 00 	mov    QWORD PTR [rsp+0x340],rbp
  e942b3:	00
  e942b4:	4c 89 a4 24 48 03 00 	mov    QWORD PTR [rsp+0x348],r12
  e942bb:	00
  e942bc:	48 89 8c 24 50 03 00 	mov    QWORD PTR [rsp+0x350],rcx
  e942c3:	00
  e942c4:	4c 89 bc 24 58 03 00 	mov    QWORD PTR [rsp+0x358],r15
  e942cb:	00
  e942cc:	48 89 94 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rdx
  e942d3:	00
  e942d4:	48 89 84 24 68 03 00 	mov    QWORD PTR [rsp+0x368],rax
  e942db:	00
  e942dc:	4c 89 ac 24 70 03 00 	mov    QWORD PTR [rsp+0x370],r13
  e942e3:	00
  e942e4:	48 89 b4 24 78 03 00 	mov    QWORD PTR [rsp+0x378],rsi
  e942eb:	00
  e942ec:	31 ff                	xor    edi,edi
  e942ee:	e8 93 a1 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e942f3:	31 ff                	xor    edi,edi
  e942f5:	e8 8c a1 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e942fa:	31 ff                	xor    edi,edi
  e942fc:	e8 85 a1 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e94301:	31 ff                	xor    edi,edi
  e94303:	e8 7e a1 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e94308:	31 ff                	xor    edi,edi
  e9430a:	e8 77 a1 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9430f:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
  e94314:	41 0f 10 85 38 01 00 	movups xmm0,XMMWORD PTR [r13+0x138]
  e9431b:	00
  e9431c:	0f 29 84 24 d0 01 00 	movaps XMMWORD PTR [rsp+0x1d0],xmm0
  e94323:	00
  e94324:	49 8b 85 40 01 00 00 	mov    rax,QWORD PTR [r13+0x140]
  e9432b:	48 85 c0             	test   rax,rax
  e9432e:	74 05                	je     e94335 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b74b>
  e94330:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e94335:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
  e9433c:	00
  e9433d:	f3 41 0f 6f 85 c8 00 	movdqu xmm0,XMMWORD PTR [r13+0xc8]
  e94344:	00 00
  e94346:	66 0f 7f 84 24 90 01 	movdqa XMMWORD PTR [rsp+0x190],xmm0
  e9434d:	00 00
  e9434f:	49 8b 85 d0 00 00 00 	mov    rax,QWORD PTR [r13+0xd0]
  e94356:	48 85 c0             	test   rax,rax
  e94359:	74 05                	je     e94360 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b776>
  e9435b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e94360:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
  e94365:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e94369:	e8 71 56 00 00       	call   e999df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60df5>
  e9436e:	41 80 bd 31 01 00 00 	cmp    BYTE PTR [r13+0x131],0x0
  e94375:	00
  e94376:	74 58                	je     e943d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b7e6>
  e94378:	48 8d 0d e9 0c 9a 00 	lea    rcx,[rip+0x9a0ce9]        # 1835068 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7000>
  e9437f:	84 c0                	test   al,al
  e94381:	74 70                	je     e943f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b809>
  e94383:	48 89 8c 24 e0 0b 00 	mov    QWORD PTR [rsp+0xbe0],rcx
  e9438a:	00
  e9438b:	4c 89 b4 24 00 0c 00 	mov    QWORD PTR [rsp+0xc00],r14
  e94392:	00
  e94393:	48 8d 9c 24 30 0a 00 	lea    rbx,[rsp+0xa30]
  e9439a:	00
  e9439b:	48 89 df             	mov    rdi,rbx
  e9439e:	4c 89 f6             	mov    rsi,r14
  e943a1:	e8 c6 1f 01 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
  e943a6:	48 8d bc 24 f0 0e 00 	lea    rdi,[rsp+0xef0]
  e943ad:	00
  e943ae:	48 89 de             	mov    rsi,rbx
  e943b1:	e8 1a 45 06 00       	call   ef88d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbfce6>
  e943b6:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
  e943bd:	00
  e943be:	e8 a7 5b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e943c3:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e943ca:	00
  e943cb:	e9 86 03 00 00       	jmp    e94756 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bb6c>
  e943d0:	84 c0                	test   al,al
  e943d2:	0f 84 00 02 00 00    	je     e945d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b9ee>
  e943d8:	48 8d 05 89 0c 9a 00 	lea    rax,[rip+0x9a0c89]        # 1835068 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7000>
  e943df:	48 8d 8c 24 f0 0e 00 	lea    rcx,[rsp+0xef0]
  e943e6:	00
  e943e7:	48 89 01             	mov    QWORD PTR [rcx],rax
  e943ea:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
  e943ee:	e9 68 03 00 00       	jmp    e9475b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bb71>
```
### `0xe94b5f`

```text
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
```
### `0xe94c1b`

```text
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
```
### `0xe94d9c`

```text
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
```
### `0xe95105`

```text
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
```
### `0xe953fc`

```text
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
```
## Register/dataflow rows in e90000-e95650

| addr | instruction |
|---:|---|
| `0xe90002` | `e90002:	4d 85 ed             	test   r13,r13` |
| `0xe90007` | `e90007:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]` |
| `0xe9006e` | `e9006e:	4c 8b b4 24 c8 0b 00 	mov    r14,QWORD PTR [rsp+0xbc8]` |
| `0xe90076` | `e90076:	4c 8b bc 24 c0 0b 00 	mov    r15,QWORD PTR [rsp+0xbc0]` |
| `0xe900b5` | `e900b5:	4c 8b ac 24 d8 0b 00 	mov    r13,QWORD PTR [rsp+0xbd8]` |
| `0xe900d9` | `e900d9:	4c 89 bb b8 00 00 00 	mov    QWORD PTR [rbx+0xb8],r15` |
| `0xe900e0` | `e900e0:	4c 89 b3 c0 00 00 00 	mov    QWORD PTR [rbx+0xc0],r14` |
| `0xe90102` | `e90102:	4c 89 ac 24 f0 07 00 	mov    QWORD PTR [rsp+0x7f0],r13` |
| `0xe90132` | `e90132:	4c 8d b4 24 b8 08 00 	lea    r14,[rsp+0x8b8]` |
| `0xe90141` | `e90141:	4c 89 f7             	mov    rdi,r14` |
| `0xe90166` | `e90166:	41 5f                	pop    r15` |
| `0xe90168` | `e90168:	4a 8d 3c 3c          	lea    rdi,[rsp+r15*1]` |
| `0xe90178` | `e90178:	49 83 c7 e8          	add    r15,0xffffffffffffffe8` |
| `0xe9017c` | `e9017c:	49 83 ff e8          	cmp    r15,0xffffffffffffffe8` |
| `0xe90199` | `e90199:	41 5f                	pop    r15` |
| `0xe901a2` | `e901a2:	4c 89 fa             	mov    rdx,r15` |
| `0xe901b8` | `e901b8:	4c 8b ac 24 00 0a 00 	mov    r13,QWORD PTR [rsp+0xa00]` |
| `0xe901c0` | `e901c0:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe901d6` | `e901d6:	4c 89 fa             	mov    rdx,r15` |
| `0xe901e1` | `e901e1:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe901f7` | `e901f7:	4c 89 fa             	mov    rdx,r15` |
| `0xe90202` | `e90202:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe90220` | `e90220:	4c 89 fa             	mov    rdx,r15` |
| `0xe90236` | `e90236:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe90250` | `e90250:	4c 89 fa             	mov    rdx,r15` |
| `0xe90260` | `e90260:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe90272` | `e90272:	4c 89 fa             	mov    rdx,r15` |
| `0xe90288` | `e90288:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe9029e` | `e9029e:	4c 89 fa             	mov    rdx,r15` |
| `0xe902a9` | `e902a9:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe902bb` | `e902bb:	4c 89 fa             	mov    rdx,r15` |
| `0xe902c9` | `e902c9:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe902df` | `e902df:	4c 89 fa             	mov    rdx,r15` |
| `0xe902ea` | `e902ea:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe90300` | `e90300:	4c 89 fa             	mov    rdx,r15` |
| `0xe9030b` | `e9030b:	49 8b 5d 00          	mov    rbx,QWORD PTR [r13+0x0]` |
| `0xe90316` | `e90316:	4c 8d bc 24 a0 08 00 	lea    r15,[rsp+0x8a0]` |
| `0xe9031e` | `e9031e:	4c 89 ff             	mov    rdi,r15` |
| `0xe9032d` | `e9032d:	4c 89 f7             	mov    rdi,r14` |
| `0xe90335` | `e90335:	4c 8d b4 24 d0 08 00 	lea    r14,[rsp+0x8d0]` |
| `0xe90344` | `e90344:	4c 89 f7             	mov    rdi,r14` |
| `0xe9034c` | `e9034c:	4c 8d b4 24 e8 08 00 	lea    r14,[rsp+0x8e8]` |
| `0xe9035b` | `e9035b:	4c 89 f7             	mov    rdi,r14` |
| `0xe90363` | `e90363:	4c 8d b4 24 00 09 00 	lea    r14,[rsp+0x900]` |
| `0xe90372` | `e90372:	4c 89 f7             	mov    rdi,r14` |
| `0xe9037a` | `e9037a:	4c 8d b4 24 f0 01 00 	lea    r14,[rsp+0x1f0]` |
| `0xe9038d` | `e9038d:	4c 89 f7             	mov    rdi,r14` |
| `0xe90397` | `e90397:	41 5f                	pop    r15` |
| `0xe90399` | `e90399:	4a 8d 3c 3c          	lea    rdi,[rsp+r15*1]` |
| `0xe903a9` | `e903a9:	49 83 c7 e8          	add    r15,0xffffffffffffffe8` |
| `0xe903ad` | `e903ad:	49 83 ff e8          	cmp    r15,0xffffffffffffffe8` |
| `0xe903ca` | `e903ca:	41 5f                	pop    r15` |
| `0xe903d3` | `e903d3:	4c 89 fa             	mov    rdx,r15` |
| `0xe903d6` | `e903d6:	41 56                	push   r14` |
| `0xe903e1` | `e903e1:	4c 89 f7             	mov    rdi,r14` |
| `0xe90406` | `e90406:	4c 89 fa             	mov    rdx,r15` |
| `0xe90426` | `e90426:	4c 89 fa             	mov    rdx,r15` |
| `0xe9044c` | `e9044c:	41 5e                	pop    r14` |
| `0xe9044e` | `e9044e:	4c 89 fa             	mov    rdx,r15` |
| `0xe90451` | `e90451:	4d 89 f0             	mov    r8,r14` |
| `0xe9047f` | `e9047f:	4c 89 fa             	mov    rdx,r15` |
| `0xe9049f` | `e9049f:	4c 89 fa             	mov    rdx,r15` |
| `0xe904c4` | `e904c4:	4c 8d bc 24 b8 08 00 	lea    r15,[rsp+0x8b8]` |
| `0xe904d3` | `e904d3:	4c 89 ff             	mov    rdi,r15` |
| `0xe904db` | `e904db:	4c 8d bc 24 d0 08 00 	lea    r15,[rsp+0x8d0]` |
| `0xe904ea` | `e904ea:	4c 89 ff             	mov    rdi,r15` |
| `0xe904f2` | `e904f2:	4c 8d ac 24 f0 01 00 	lea    r13,[rsp+0x1f0]` |
| `0xe90505` | `e90505:	4c 89 ef             	mov    rdi,r13` |
| `0xe90541` | `e90541:	41 5f                	pop    r15` |
| `0xe9054a` | `e9054a:	4c 89 fa             	mov    rdx,r15` |
| `0xe90550` | `e90550:	41 55                	push   r13` |
| `0xe9055b` | `e9055b:	4c 89 ef             	mov    rdi,r13` |
| `0xe90563` | `e90563:	4c 8b ac 24 00 0a 00 	mov    r13,QWORD PTR [rsp+0xa00]` |
| `0xe9056b` | `e9056b:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe90581` | `e90581:	4c 89 fa             	mov    rdx,r15` |
| `0xe9058c` | `e9058c:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe905a2` | `e905a2:	4c 89 fa             	mov    rdx,r15` |
| `0xe905ad` | `e905ad:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe905c3` | `e905c3:	4c 89 fa             	mov    rdx,r15` |
| `0xe905ce` | `e905ce:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe905e4` | `e905e4:	4c 89 fa             	mov    rdx,r15` |
| `0xe905f2` | `e905f2:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe90608` | `e90608:	4c 89 fa             	mov    rdx,r15` |
| `0xe90613` | `e90613:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe90628` | `e90628:	4c 89 fa             	mov    rdx,r15` |
| `0xe90636` | `e90636:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe9064c` | `e9064c:	4c 89 fa             	mov    rdx,r15` |
| `0xe90657` | `e90657:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe9066d` | `e9066d:	4c 89 fa             	mov    rdx,r15` |
| `0xe90678` | `e90678:	4d 8b 65 00          	mov    r12,QWORD PTR [r13+0x0]` |
| `0xe906a0` | `e906a0:	4c 8d ac 24 f0 01 00 	lea    r13,[rsp+0x1f0]` |
| `0xe906b3` | `e906b3:	4c 89 ef             	mov    rdi,r13` |
| `0xe906ef` | `e906ef:	41 5f                	pop    r15` |
| `0xe906f7` | `e906f7:	4c 89 fa             	mov    rdx,r15` |
| `0xe906fd` | `e906fd:	41 55                	push   r13` |
| `0xe90708` | `e90708:	4c 89 ef             	mov    rdi,r13` |
| `0xe9072e` | `e9072e:	4c 89 fa             	mov    rdx,r15` |
| `0xe9074d` | `e9074d:	41 5e                	pop    r14` |
| `0xe9074f` | `e9074f:	4c 89 fa             	mov    rdx,r15` |
| `0xe90752` | `e90752:	4d 89 f0             	mov    r8,r14` |
| `0xe9077c` | `e9077c:	4c 89 fa             	mov    rdx,r15` |
| `0xe9079d` | `e9079d:	4c 89 fa             	mov    rdx,r15` |
| `0xe907ba` | `e907ba:	4c 89 fa             	mov    rdx,r15` |
| `0xe907de` | `e907de:	4c 89 fa             	mov    rdx,r15` |
| `0xe907ff` | `e907ff:	4c 89 fa             	mov    rdx,r15` |
| `0xe90820` | `e90820:	4c 89 fa             	mov    rdx,r15` |
| `0xe90841` | `e90841:	4c 89 fa             	mov    rdx,r15` |
| `0xe90861` | `e90861:	4c 89 fa             	mov    rdx,r15` |
| `0xe90885` | `e90885:	4c 89 fa             	mov    rdx,r15` |
| `0xe908a6` | `e908a6:	4c 89 fa             	mov    rdx,r15` |
| `0xe908c7` | `e908c7:	4c 89 fa             	mov    rdx,r15` |
| `0xe908e4` | `e908e4:	4c 89 fa             	mov    rdx,r15` |
| `0xe90908` | `e90908:	4c 89 fa             	mov    rdx,r15` |
| `0xe9095f` | `e9095f:	41 5e                	pop    r14` |
| `0xe90961` | `e90961:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0xe90971` | `e90971:	49 83 c6 e8          	add    r14,0xffffffffffffffe8` |
| `0xe90975` | `e90975:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8` |
| `0xe90992` | `e90992:	41 5f                	pop    r15` |
| `0xe9099b` | `e9099b:	4c 89 fa             	mov    rdx,r15` |
| `0xe909cf` | `e909cf:	4c 89 fa             	mov    rdx,r15` |
| `0xe909f5` | `e909f5:	4c 89 fa             	mov    rdx,r15` |
| `0xe909ff` | `e909ff:	41 bd 10 27 00 00    	mov    r13d,0x2710` |
| `0xe90a26` | `e90a26:	4c 89 fa             	mov    rdx,r15` |
| `0xe90a46` | `e90a46:	4c 89 fa             	mov    rdx,r15` |
| `0xe90a68` | `e90a68:	41 5e                	pop    r14` |
| `0xe90a6e` | `e90a6e:	4c 89 fa             	mov    rdx,r15` |
| `0xe90a71` | `e90a71:	4d 89 f0             	mov    r8,r14` |
| `0xe90a74` | `e90a74:	41 55                	push   r13` |
| `0xe90a97` | `e90a97:	4c 89 fa             	mov    rdx,r15` |
| `0xe90ab8` | `e90ab8:	4c 89 fa             	mov    rdx,r15` |
| `0xe90ad7` | `e90ad7:	41 5d                	pop    r13` |
| `0xe90ad9` | `e90ad9:	4c 89 fa             	mov    rdx,r15` |
| `0xe90adc` | `e90adc:	4d 89 e8             	mov    r8,r13` |
| `0xe90b07` | `e90b07:	4c 89 fa             	mov    rdx,r15` |
| `0xe90b0a` | `e90b0a:	4d 89 f0             	mov    r8,r14` |
| `0xe90b27` | `e90b27:	4c 89 fa             	mov    rdx,r15` |
| `0xe90b4f` | `e90b4f:	4c 89 fa             	mov    rdx,r15` |
| `0xe90b6d` | `e90b6d:	4c 89 fa             	mov    rdx,r15` |
| `0xe90b8d` | `e90b8d:	4c 89 fa             	mov    rdx,r15` |
| `0xe90bb5` | `e90bb5:	4c 89 fa             	mov    rdx,r15` |
| `0xe90bde` | `e90bde:	4c 89 fa             	mov    rdx,r15` |
| `0xe90bff` | `e90bff:	4c 89 fa             	mov    rdx,r15` |
| `0xe90c2c` | `e90c2c:	4c 89 fa             	mov    rdx,r15` |
| `0xe90c49` | `e90c49:	4c 89 fa             	mov    rdx,r15` |
| `0xe90c4c` | `e90c4c:	4d 89 e8             	mov    r8,r13` |
| `0xe90c69` | `e90c69:	4c 89 fa             	mov    rdx,r15` |
| `0xe90c6c` | `e90c6c:	4d 89 e8             	mov    r8,r13` |
| `0xe90c8b` | `e90c8b:	41 5e                	pop    r14` |
| `0xe90c8d` | `e90c8d:	4c 89 fa             	mov    rdx,r15` |
| `0xe90c90` | `e90c90:	4d 89 f0             	mov    r8,r14` |
| `0xe90cb1` | `e90cb1:	4c 89 fa             	mov    rdx,r15` |
| `0xe90cce` | `e90cce:	4c 89 fa             	mov    rdx,r15` |
| `0xe90cd1` | `e90cd1:	4d 89 f0             	mov    r8,r14` |
| `0xe90cee` | `e90cee:	4c 89 fa             	mov    rdx,r15` |
| `0xe90d1b` | `e90d1b:	4c 89 fa             	mov    rdx,r15` |
| `0xe90d3c` | `e90d3c:	4c 89 fa             	mov    rdx,r15` |
| `0xe90d68` | `e90d68:	4c 89 fa             	mov    rdx,r15` |
| `0xe90d8d` | `e90d8d:	4c 89 fa             	mov    rdx,r15` |
| `0xe90dae` | `e90dae:	4c 89 fa             	mov    rdx,r15` |
| `0xe90dcb` | `e90dcb:	4c 89 fa             	mov    rdx,r15` |
| `0xe90dec` | `e90dec:	4c 89 fa             	mov    rdx,r15` |
| `0xe90e05` | `e90e05:	4c 8d b4 24 a0 08 00 	lea    r14,[rsp+0x8a0]` |
| `0xe90e0d` | `e90e0d:	4c 89 f7             	mov    rdi,r14` |
| `0xe90e3b` | `e90e3b:	4c 8d b4 24 f0 01 00 	lea    r14,[rsp+0x1f0]` |
| `0xe90e4e` | `e90e4e:	4c 89 f7             	mov    rdi,r14` |
| `0xe90e58` | `e90e58:	41 5f                	pop    r15` |
| `0xe90e5a` | `e90e5a:	4a 8d 3c 3c          	lea    rdi,[rsp+r15*1]` |
| `0xe90e6a` | `e90e6a:	49 83 c7 e8          	add    r15,0xffffffffffffffe8` |
| `0xe90e6e` | `e90e6e:	49 83 ff e8          	cmp    r15,0xffffffffffffffe8` |
| `0xe90e93` | `e90e93:	41 56                	push   r14` |
| `0xe90e9e` | `e90e9e:	4c 89 f7             	mov    rdi,r14` |
| `0xe90eb8` | `e90eb8:	4c 8d b4 24 a0 08 00 	lea    r14,[rsp+0x8a0]` |
| `0xe90ec0` | `e90ec0:	4c 89 f7             	mov    rdi,r14` |
| `0xe90ec8` | `e90ec8:	4c 8d bc 24 b8 08 00 	lea    r15,[rsp+0x8b8]` |
| `0xe90ed7` | `e90ed7:	4c 89 ff             	mov    rdi,r15` |
| `0xe90edf` | `e90edf:	4c 8d bc 24 d0 08 00 	lea    r15,[rsp+0x8d0]` |
| `0xe90eee` | `e90eee:	4c 89 ff             	mov    rdi,r15` |
| `0xe90ef6` | `e90ef6:	4c 8d bc 24 e8 08 00 	lea    r15,[rsp+0x8e8]` |
| `0xe90f05` | `e90f05:	4c 89 ff             	mov    rdi,r15` |
| `0xe90f0d` | `e90f0d:	4c 8d bc 24 00 09 00 	lea    r15,[rsp+0x900]` |
| `0xe90f1c` | `e90f1c:	4c 89 ff             	mov    rdi,r15` |
| `0xe90f41` | `e90f41:	41 5e                	pop    r14` |
| `0xe90f43` | `e90f43:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0xe90f53` | `e90f53:	49 83 c6 e8          	add    r14,0xffffffffffffffe8` |
| `0xe90f57` | `e90f57:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8` |
| `0xe90f74` | `e90f74:	41 5e                	pop    r14` |
| `0xe90f78` | `e90f78:	41 5f                	pop    r15` |
| `0xe90f7d` | `e90f7d:	4c 89 f2             	mov    rdx,r14` |
| `0xe90f80` | `e90f80:	4d 89 f8             	mov    r8,r15` |
| `0xe90fb4` | `e90fb4:	4c 89 f2             	mov    rdx,r14` |
| `0xe90fd4` | `e90fd4:	4c 89 f2             	mov    rdx,r14` |
| `0xe90ff8` | `e90ff8:	4c 89 f2             	mov    rdx,r14` |
| `0xe91015` | `e91015:	4c 89 f2             	mov    rdx,r14` |
| `0xe91035` | `e91035:	4c 89 f2             	mov    rdx,r14` |
| `0xe91038` | `e91038:	4d 89 f8             	mov    r8,r15` |
| `0xe91058` | `e91058:	4c 89 f2             	mov    rdx,r14` |
| `0xe9107c` | `e9107c:	4c 89 f2             	mov    rdx,r14` |
| `0xe9109d` | `e9109d:	4c 89 f2             	mov    rdx,r14` |
| `0xe910c1` | `e910c1:	4c 89 f2             	mov    rdx,r14` |
| `0xe910de` | `e910de:	4c 89 f2             	mov    rdx,r14` |
| `0xe91102` | `e91102:	4c 89 f2             	mov    rdx,r14` |
| `0xe91122` | `e91122:	4c 89 f2             	mov    rdx,r14` |
| `0xe91144` | `e91144:	41 5d                	pop    r13` |
| `0xe91146` | `e91146:	4c 89 f2             	mov    rdx,r14` |
| `0xe91149` | `e91149:	4d 89 e8             	mov    r8,r13` |
| `0xe91166` | `e91166:	4c 89 f2             	mov    rdx,r14` |
| `0xe9118a` | `e9118a:	4c 89 f2             	mov    rdx,r14` |
| `0xe911ab` | `e911ab:	4c 89 f2             	mov    rdx,r14` |
| `0xe911ae` | `e911ae:	4d 89 e8             	mov    r8,r13` |
| `0xe911c8` | `e911c8:	4c 89 f2             	mov    rdx,r14` |
| `0xe911cb` | `e911cb:	4d 89 f8             	mov    r8,r15` |
| `0xe911ec` | `e911ec:	4c 89 f2             	mov    rdx,r14` |
| `0xe91209` | `e91209:	4c 89 f2             	mov    rdx,r14` |
| `0xe91261` | `e91261:	4c 8d ac 24 10 04 00 	lea    r13,[rsp+0x410]` |
| `0xe91271` | `e91271:	49 39 c5             	cmp    r13,rax` |
| `0xe9127f` | `e9127f:	4c 8b 30             	mov    r14,QWORD PTR [rax]` |
| `0xe91286` | `e91286:	49 89 df             	mov    r15,rbx` |
| `0xe91289` | `e91289:	4d 29 f7             	sub    r15,r14` |
| `0xe9128c` | `e9128c:	49 c1 ff 07          	sar    r15,0x7` |
| `0xe912aa` | `e912aa:	4c 39 f8             	cmp    rax,r15` |
| `0xe912b4` | `e912b4:	4c 89 ef             	mov    rdi,r13` |
| `0xe912cd` | `e912cd:	66 41 0f 7f 45 00    	movdqa XMMWORD PTR [r13+0x0],xmm0` |
| `0xe912d3` | `e912d3:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0` |
| `0xe912dc` | `e912dc:	4c 89 fa             	mov    rdx,r15` |
| `0xe912e4` | `e912e4:	4c 89 ef             	mov    rdi,r13` |
| `0xe91303` | `e91303:	4c 39 f8             	cmp    rax,r15` |
| `0xe91308` | `e91308:	4d 01 f4             	add    r12,r14` |
| `0xe9130b` | `e9130b:	4c 89 f7             	mov    rdi,r14` |
| `0xe91316` | `e91316:	4d 89 e6             	mov    r14,r12` |
| `0xe9131e` | `e9131e:	4c 89 ef             	mov    rdi,r13` |
| `0xe91321` | `e91321:	4c 89 f6             	mov    rsi,r14` |
| `0xe9132e` | `e9132e:	4c 89 f7             	mov    rdi,r14` |
| `0xe9133e` | `e9133e:	4c 89 ef             	mov    rdi,r13` |
| `0xe91355` | `e91355:	48 8d bc 24 98 03 00 	lea    rdi,[rsp+0x398]` |
| `0xe914af` | `e914af:	4d 8b b4 24 88 00 00 	mov    r14,QWORD PTR [r12+0x88]` |
| `0xe914b7` | `e914b7:	4d 85 f6             	test   r14,r14` |
| `0xe914bc` | `e914bc:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]` |
| `0xe914c9` | `e914c9:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]` |
| `0xe914f8` | `e914f8:	4d 85 f6             	test   r14,r14` |
| `0xe914fd` | `e914fd:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]` |
| `0xe91502` | `e91502:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]` |
| `0xe91541` | `e91541:	4c 89 f7             	mov    rdi,r14` |
| `0xe91549` | `e91549:	4c 89 74 24 68       	mov    QWORD PTR [rsp+0x68],r14` |
| `0xe9154e` | `e9154e:	4c 89 f7             	mov    rdi,r14` |
| `0xe91564` | `e91564:	49 89 c5             	mov    r13,rax` |
| `0xe915b3` | `e915b3:	49 89 c6             	mov    r14,rax` |
| `0xe915c6` | `e915c6:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0xe915eb` | `e915eb:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax` |
| `0xe91600` | `e91600:	f3 41 0f 7f 4e 20    	movdqu XMMWORD PTR [r14+0x20],xmm1` |
| `0xe91610` | `e91610:	f3 41 0f 7f 46 30    	movdqu XMMWORD PTR [r14+0x30],xmm0` |
| `0xe9162c` | `e9162c:	49 8d 46 18          	lea    rax,[r14+0x18]` |
| `0xe91636` | `e91636:	f3 41 0f 7f 46 40    	movdqu XMMWORD PTR [r14+0x40],xmm0` |
| `0xe9163c` | `e9163c:	49 89 5e 50          	mov    QWORD PTR [r14+0x50],rbx` |
| `0xe91640` | `e91640:	44 8a 7d 01          	mov    r15b,BYTE PTR [rbp+0x1]` |
| `0xe91644` | `e91644:	45 84 ff             	test   r15b,r15b` |
| `0xe91647` | `e91647:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14` |
| `0xe91675` | `e91675:	49 8b 5e 20          	mov    rbx,QWORD PTR [r14+0x20]` |
| `0xe91692` | `e91692:	4c 8d b4 24 f0 01 00 	lea    r14,[rsp+0x1f0]` |
| `0xe9169e` | `e9169e:	4c 89 f7             	mov    rdi,r14` |
| `0xe916b6` | `e916b6:	4c 89 f2             	mov    rdx,r14` |
| `0xe916b9` | `e916b9:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]` |
| `0xe916c1` | `e916c1:	49 8d 7e 58          	lea    rdi,[r14+0x58]` |
| `0xe916e3` | `e916e3:	45 84 ff             	test   r15b,r15b` |
| `0xe91704` | `e91704:	44 8a 75 01          	mov    r14b,BYTE PTR [rbp+0x1]` |
| `0xe91708` | `e91708:	45 84 f6             	test   r14b,r14b` |
| `0xe9175c` | `e9175c:	4c 8d bc 24 b0 01 00 	lea    r15,[rsp+0x1b0]` |
| `0xe91768` | `e91768:	4c 89 ff             	mov    rdi,r15` |
| `0xe91780` | `e91780:	4c 89 fa             	mov    rdx,r15` |
| `0xe917a9` | `e917a9:	45 84 f6             	test   r14b,r14b` |
| `0xe917ca` | `e917ca:	44 8a 75 01          	mov    r14b,BYTE PTR [rbp+0x1]` |
| `0xe917ce` | `e917ce:	45 84 f6             	test   r14b,r14b` |
| `0xe91822` | `e91822:	4c 8d bc 24 70 01 00 	lea    r15,[rsp+0x170]` |
| `0xe9182e` | `e9182e:	4c 89 ff             	mov    rdi,r15` |
| `0xe91846` | `e91846:	4c 89 fa             	mov    rdx,r15` |
| `0xe9184c` | `e9184c:	4d 8d 7c 24 78       	lea    r15,[r12+0x78]` |
| `0xe91859` | `e91859:	4c 89 ff             	mov    rdi,r15` |
| `0xe9186d` | `e9186d:	45 84 f6             	test   r14b,r14b` |
| `0xe9188e` | `e9188e:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13` |
| `0xe91893` | `e91893:	44 8a 75 01          	mov    r14b,BYTE PTR [rbp+0x1]` |
| `0xe91897` | `e91897:	45 84 f6             	test   r14b,r14b` |
| `0xe918bc` | `e918bc:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]` |
| `0xe918c3` | `e918c3:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]` |
| `0xe918c8` | `e918c8:	49 8b 5d 50          	mov    rbx,QWORD PTR [r13+0x50]` |
| `0xe91914` | `e91914:	49 8d 9d 88 00 00 00 	lea    rbx,[r13+0x88]` |
| `0xe91938` | `e91938:	45 84 f6             	test   r14b,r14b` |
| `0xe91959` | `e91959:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]` |
| `0xe9195e` | `e9195e:	4d 8d a6 98 00 00 00 	lea    r12,[r14+0x98]` |
| `0xe919b6` | `e919b6:	4c 8d b4 24 f0 00 00 	lea    r14,[rsp+0xf0]` |
| `0xe919c2` | `e919c2:	4c 89 f7             	mov    rdi,r14` |
| `0xe919e4` | `e919e4:	4c 89 f2             	mov    rdx,r14` |
| `0xe919e7` | `e919e7:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]` |
| `0xe919ef` | `e919ef:	49 8d be f0 00 00 00 	lea    rdi,[r14+0xf0]` |
| `0xe91a30` | `e91a30:	4c 8b 6c 24 60       	mov    r13,QWORD PTR [rsp+0x60]` |
| `0xe91a35` | `e91a35:	4c 89 f0             	mov    rax,r14` |
| `0xe91a3e` | `e91a3e:	49 89 86 00 01 00 00 	mov    QWORD PTR [r14+0x100],rax` |
| `0xe91a45` | `e91a45:	49 89 86 08 01 00 00 	mov    QWORD PTR [r14+0x108],rax` |
| `0xe91a50` | `e91a50:	f3 41 0f 7f 86 10 01 	movdqu XMMWORD PTR [r14+0x110],xmm0` |
| `0xe91a59` | `e91a59:	49 83 a6 30 01 00 00 	and    QWORD PTR [r14+0x130],0x0` |
| `0xe91a61` | `e91a61:	f3 41 0f 7f 86 20 01 	movdqu XMMWORD PTR [r14+0x120],xmm0` |
| `0xe91a6a` | `e91a6a:	41 c7 86 38 01 00 00 	mov    DWORD PTR [r14+0x138],0x3f800000` |
| `0xe91a7a` | `e91a7a:	49 89 86 40 01 00 00 	mov    QWORD PTR [r14+0x140],rax` |
| `0xe91a81` | `e91a81:	49 89 86 48 01 00 00 	mov    QWORD PTR [r14+0x148],rax` |
| `0xe91a88` | `e91a88:	49 83 a6 50 01 00 00 	and    QWORD PTR [r14+0x150],0x0` |
| `0xe91aae` | `e91aae:	4c 8d bc 24 70 09 00 	lea    r15,[rsp+0x970]` |
| `0xe91aba` | `e91aba:	66 41 0f 7f 47 f0    	movdqa XMMWORD PTR [r15-0x10],xmm0` |
| `0xe91ac0` | `e91ac0:	49 83 27 00          	and    QWORD PTR [r15],0x0` |
| `0xe91ac4` | `e91ac4:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]` |
| `0xe91ac9` | `e91ac9:	4c 89 bc 24 c0 08 00 	mov    QWORD PTR [rsp+0x8c0],r15` |
| `0xe91afb` | `e91afb:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14` |
| `0xe91b03` | `e91b03:	4c 8d b4 24 60 09 00 	lea    r14,[rsp+0x960]` |
| `0xe91b0b` | `e91b0b:	4c 89 f7             	mov    rdi,r14` |
| `0xe91b16` | `e91b16:	4d 8b 66 08          	mov    r12,QWORD PTR [r14+0x8]` |
| `0xe91b22` | `e91b22:	4d 89 66 08          	mov    QWORD PTR [r14+0x8],r12` |
| `0xe91b2d` | `e91b2d:	49 8b 4d 00          	mov    rcx,QWORD PTR [r13+0x0]` |
| `0xe91b3a` | `e91b3a:	4c 8b b4 24 68 09 00 	mov    r14,QWORD PTR [rsp+0x968]` |
| `0xe91b4a` | `e91b4a:	49 39 c6             	cmp    r14,rax` |
| `0xe91b4f` | `e91b4f:	49 89 0e             	mov    QWORD PTR [r14],rcx` |
| `0xe91b52` | `e91b52:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]` |
| `0xe91b56` | `e91b56:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax` |
| `0xe91b64` | `e91b64:	49 83 c6 10          	add    r14,0x10` |
| `0xe91b75` | `e91b75:	49 29 ce             	sub    r14,rcx` |
| `0xe91b78` | `e91b78:	4d 89 f4             	mov    r12,r14` |
| `0xe91bbd` | `e91bbd:	4c 89 bc 24 c0 08 00 	mov    QWORD PTR [rsp+0x8c0],r15` |
| `0xe91bda` | `e91bda:	49 8b 55 00          	mov    rdx,QWORD PTR [r13+0x0]` |
| `0xe91be6` | `e91be6:	4a 8d 0c 30          	lea    rcx,[rax+r14*1]` |
| `0xe91bfd` | `e91bfd:	4a 89 14 30          	mov    QWORD PTR [rax+r14*1],rdx` |
| `0xe91c05` | `e91c05:	49 8b 55 08          	mov    rdx,QWORD PTR [r13+0x8]` |
| `0xe91c28` | `e91c28:	4c 8d b4 24 60 09 00 	lea    r14,[rsp+0x960]` |
| `0xe91c30` | `e91c30:	4c 89 f7             	mov    rdi,r14` |
| `0xe91c3b` | `e91c3b:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]` |
| `0xe91c47` | `e91c47:	4c 89 b4 24 68 09 00 	mov    QWORD PTR [rsp+0x968],r14` |
| `0xe91ce3` | `e91ce3:	4c 8b 6b 20          	mov    r13,QWORD PTR [rbx+0x20]` |
| `0xe91cf0` | `e91cf0:	4d 39 e5             	cmp    r13,r12` |
| `0xe91cf9` | `e91cf9:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]` |
| `0xe91cfe` | `e91cfe:	49 8d 47 20          	lea    rax,[r15+0x20]` |
| `0xe91d07` | `e91d07:	49 81 c7 90 00 00 00 	add    r15,0x90` |
| `0xe91d1e` | `e91d1e:	4d 8b 75 00          	mov    r14,QWORD PTR [r13+0x0]` |
| `0xe91d6b` | `e91d6b:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0xe91d71` | `e91d71:	4c 89 f6             	mov    rsi,r14` |
| `0xe91d7a` | `e91d7a:	4c 89 ff             	mov    rdi,r15` |
| `0xe91d9a` | `e91d9a:	49 83 c5 10          	add    r13,0x10` |
| `0xe91d9e` | `e91d9e:	4d 39 e5             	cmp    r13,r12` |
| `0xe91dd4` | `e91dd4:	4c 8d b4 24 60 09 00 	lea    r14,[rsp+0x960]` |
| `0xe91ddc` | `e91ddc:	4c 89 f7             	mov    rdi,r14` |
| `0xe91e13` | `e91e13:	4c 8b 7c 24 38       	mov    r15,QWORD PTR [rsp+0x38]` |
| `0xe91e18` | `e91e18:	4c 89 ff             	mov    rdi,r15` |
| `0xe91e20` | `e91e20:	49 8d 7f 10          	lea    rdi,[r15+0x10]` |
| `0xe91e4b` | `e91e4b:	49 8b 7f 28          	mov    rdi,QWORD PTR [r15+0x28]` |
| `0xe91e4f` | `e91e4f:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0` |
| `0xe91e61` | `e91e61:	49 8d 7f 30          	lea    rdi,[r15+0x30]` |
| `0xe91e6d` | `e91e6d:	4d 8d a7 90 00 00 00 	lea    r12,[r15+0x90]` |
| `0xe91e80` | `e91e80:	49 8d bf a0 00 00 00 	lea    rdi,[r15+0xa0]` |
| `0xe91ea2` | `e91ea2:	49 8b bf b8 00 00 00 	mov    rdi,QWORD PTR [r15+0xb8]` |
| `0xe91ea9` | `e91ea9:	41 0f 11 87 b0 00 00 	movups XMMWORD PTR [r15+0xb0],xmm0` |
| `0xe91ed0` | `e91ed0:	49 8d 9f f8 00 00 00 	lea    rbx,[r15+0xf8]` |
| `0xe91ed7` | `e91ed7:	49 8b bf c8 00 00 00 	mov    rdi,QWORD PTR [r15+0xc8]` |
| `0xe91ede` | `e91ede:	41 0f 11 87 c0 00 00 	movups XMMWORD PTR [r15+0xc0],xmm0` |
| `0xe91f24` | `e91f24:	49 8b 9f 80 00 00 00 	mov    rbx,QWORD PTR [r15+0x80]` |
| `0xe91f2b` | `e91f2b:	49 8b 47 18          	mov    rax,QWORD PTR [r15+0x18]` |
| `0xe91f2f` | `e91f2f:	f3 41 0f 6f 47 10    	movdqu xmm0,XMMWORD PTR [r15+0x10]` |
| `0xe91f5d` | `e91f5d:	4c 8d bc 24 60 08 00 	lea    r15,[rsp+0x860]` |
| `0xe91f71` | `e91f71:	4c 89 ff             	mov    rdi,r15` |
| `0xe91f87` | `e91f87:	4c 89 fa             	mov    rdx,r15` |
| `0xe9207b` | `e9207b:	49 89 c7             	mov    r15,rax` |
| `0xe92085` | `e92085:	49 89 07             	mov    QWORD PTR [r15],rax` |
| `0xe92088` | `e92088:	4c 89 ff             	mov    rdi,r15` |
| `0xe920a4` | `e920a4:	4c 89 7e 20          	mov    QWORD PTR [rsi+0x20],r15` |
| `0xe920bf` | `e920bf:	4c 89 b4 24 80 09 00 	mov    QWORD PTR [rsp+0x980],r14` |
| `0xe920df` | `e920df:	4d 8d 7c 24 40       	lea    r15,[r12+0x40]` |
| `0xe920eb` | `e920eb:	4c 89 ff             	mov    rdi,r15` |
| `0xe920fb` | `e920fb:	4c 89 f6             	mov    rsi,r14` |
| `0xe92128` | `e92128:	4d 8d b4 24 b0 00 00 	lea    r14,[r12+0xb0]` |
| `0xe92130` | `e92130:	4c 89 f7             	mov    rdi,r14` |
| `0xe92153` | `e92153:	4d 8d ac 24 e0 00 00 	lea    r13,[r12+0xe0]` |
| `0xe92163` | `e92163:	4c 89 ef             	mov    rdi,r13` |
| `0xe92374` | `e92374:	4c 8d b4 24 60 08 00 	lea    r14,[rsp+0x860]` |
| `0xe92380` | `e92380:	4c 89 f7             	mov    rdi,r14` |
| `0xe92396` | `e92396:	4c 89 f2             	mov    rdx,r14` |
| `0xe924ad` | `e924ad:	41 5d                	pop    r13` |
| `0xe924af` | `e924af:	41 5e                	pop    r14` |
| `0xe924b1` | `e924b1:	41 5f                	pop    r15` |
| `0xe9259e` | `e9259e:	4c 89 ff             	mov    rdi,r15` |
| `0xe9265e` | `e9265e:	4c 89 ef             	mov    rdi,r13` |
| `0xe9267c` | `e9267c:	4c 89 f7             	mov    rdi,r14` |
| `0xe92699` | `e92699:	4c 89 ff             	mov    rdi,r15` |
| `0xe9276e` | `e9276e:	4c 89 f7             	mov    rdi,r14` |
| `0xe927d4` | `e927d4:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]` |
| `0xe927e4` | `e927e4:	49 83 c5 e8          	add    r13,0xffffffffffffffe8` |
| `0xe927e8` | `e927e8:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8` |
| `0xe927f8` | `e927f8:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0xe92808` | `e92808:	49 83 c6 e8          	add    r14,0xffffffffffffffe8` |
| `0xe9280c` | `e9280c:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8` |
| `0xe92821` | `e92821:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0xe92831` | `e92831:	49 83 c6 e8          	add    r14,0xffffffffffffffe8` |
| `0xe92835` | `e92835:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8` |
| `0xe92930` | `e92930:	4c 39 f5             	cmp    rbp,r14` |
| `0xe9293c` | `e9293c:	49 83 c7 e8          	add    r15,0xffffffffffffffe8` |
| `0xe92940` | `e92940:	4c 89 ff             	mov    rdi,r15` |
| `0xe92948` | `e92948:	49 39 df             	cmp    r15,rbx` |
| `0xe9295e` | `e9295e:	49 83 c7 e8          	add    r15,0xffffffffffffffe8` |
| `0xe92962` | `e92962:	4c 89 ff             	mov    rdi,r15` |
| `0xe9296a` | `e9296a:	4d 39 f7             	cmp    r15,r14` |
| `0xe92976` | `e92976:	49 83 c6 e8          	add    r14,0xffffffffffffffe8` |
| `0xe9297a` | `e9297a:	4c 89 f7             	mov    rdi,r14` |
| `0xe92982` | `e92982:	4d 39 fe             	cmp    r14,r15` |
| `0xe929e4` | `e929e4:	4c 8d b4 24 40 06 00 	lea    r14,[rsp+0x640]` |
| `0xe929ec` | `e929ec:	4c 8d bc 24 58 06 00 	lea    r15,[rsp+0x658]` |
| `0xe929f4` | `e929f4:	49 8b 7f 40          	mov    rdi,QWORD PTR [r15+0x40]` |
| `0xe929fd` | `e929fd:	4c 89 ff             	mov    rdi,r15` |
| `0xe92a05` | `e92a05:	4c 89 f7             	mov    rdi,r14` |
| `0xe92a0d` | `e92a0d:	49 8b 7f e0          	mov    rdi,QWORD PTR [r15-0x20]` |
| `0xe92a16` | `e92a16:	49 8b 7f d0          	mov    rdi,QWORD PTR [r15-0x30]` |
| `0xe92a1f` | `e92a1f:	49 8b 7f 90          	mov    rdi,QWORD PTR [r15-0x70]` |
| `0xe92ac5` | `e92ac5:	4c 8d b4 24 e0 03 00 	lea    r14,[rsp+0x3e0]` |
| `0xe92ada` | `e92ada:	4c 89 f7             	mov    rdi,r14` |
| `0xe92aea` | `e92aea:	49 8b 7e c0          	mov    rdi,QWORD PTR [r14-0x40]` |
| `0xe92b09` | `e92b09:	49 8b be 40 ff ff ff 	mov    rdi,QWORD PTR [r14-0xc0]` |
| `0xe92bb1` | `e92bb1:	4c 89 ff             	mov    rdi,r15` |
| `0xe92c49` | `e92c49:	41 57                	push   r15` |
| `0xe92c4b` | `e92c4b:	41 56                	push   r14` |
| `0xe92c59` | `e92c59:	49 89 f6             	mov    r14,rsi` |
| `0xe92c5c` | `e92c5c:	49 89 ff             	mov    r15,rdi` |
| `0xe92c68` | `e92c68:	4c 89 fe             	mov    rsi,r15` |
| `0xe92c70` | `e92c70:	4d 01 e7             	add    r15,r12` |
| `0xe92c76` | `e92c76:	4d 39 f7             	cmp    r15,r14` |
| `0xe92c85` | `e92c85:	41 5e                	pop    r14` |
| `0xe92c87` | `e92c87:	41 5f                	pop    r15` |
| `0xe92c8b` | `e92c8b:	41 57                	push   r15` |
| `0xe92c8d` | `e92c8d:	41 56                	push   r14` |
| `0xe92c8f` | `e92c8f:	41 55                	push   r13` |
| `0xe92c98` | `e92c98:	49 89 d6             	mov    r14,rdx` |
| `0xe92cac` | `e92cac:	4c 8b 6f 08          	mov    r13,QWORD PTR [rdi+0x8]` |
| `0xe92cb9` | `e92cb9:	4c 89 29             	mov    QWORD PTR [rcx],r13` |
| `0xe92cbf` | `e92cbf:	4c 89 2a             	mov    QWORD PTR [rdx],r13` |
| `0xe92cd6` | `e92cd6:	4c 39 f6             	cmp    rsi,r14` |
| `0xe92cdb` | `e92cdb:	49 89 f7             	mov    r15,rsi` |
| `0xe92ce3` | `e92ce3:	4d 89 ec             	mov    r12,r13` |
| `0xe92ce9` | `e92ce9:	4c 89 fe             	mov    rsi,r15` |
| `0xe92cf1` | `e92cf1:	49 01 ef             	add    r15,rbp` |
| `0xe92d01` | `e92d01:	4d 39 f7             	cmp    r15,r14` |
| `0xe92d08` | `e92d08:	4d 89 ec             	mov    r12,r13` |
| `0xe92d34` | `e92d34:	41 5d                	pop    r13` |
| `0xe92d36` | `e92d36:	41 5e                	pop    r14` |
| `0xe92d38` | `e92d38:	41 5f                	pop    r15` |
| `0xe92d3c` | `e92d3c:	49 89 c6             	mov    r14,rax` |
| `0xe92d49` | `e92d49:	4c 89 6b 08          	mov    QWORD PTR [rbx+0x8],r13` |
| `0xe92d5d` | `e92d5d:	4c 89 f7             	mov    rdi,r14` |
| `0xe92f2d` | `e92f2d:	41 57                	push   r15` |
| `0xe92f2f` | `e92f2f:	41 56                	push   r14` |
| `0xe92f31` | `e92f31:	41 55                	push   r13` |
| `0xe92f4d` | `e92f4d:	49 89 f5             	mov    r13,rsi` |
| `0xe92f50` | `e92f50:	49 89 ff             	mov    r15,rdi` |
| `0xe92f6b` | `e92f6b:	48 8d bc 24 90 03 00 	lea    rdi,[rsp+0x390]` |
| `0xe92f78` | `e92f78:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]` |
| `0xe92f9b` | `e92f9b:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]` |
| `0xe92fb7` | `e92fb7:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]` |
| `0xe92fd5` | `e92fd5:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]` |
| `0xe9300e` | `e9300e:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]` |
| `0xe93016` | `e93016:	66 41 0f 7f 46 10    	movdqa XMMWORD PTR [r14+0x10],xmm0` |
| `0xe9301c` | `e9301c:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0` |
| `0xe93021` | `e93021:	41 c7 46 20 00 00 80 	mov    DWORD PTR [r14+0x20],0x3f800000` |
| `0xe93031` | `e93031:	4c 89 f6             	mov    rsi,r14` |
| `0xe93039` | `e93039:	4c 89 f7             	mov    rdi,r14` |
| `0xe93091` | `e93091:	49 8b 85 70 05 00 00 	mov    rax,QWORD PTR [r13+0x570]` |
| `0xe930a3` | `e930a3:	4c 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],r15` |
| `0xe930a8` | `e930a8:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13` |
| `0xe930b3` | `e930b3:	4d 8b bd 10 04 00 00 	mov    r15,QWORD PTR [r13+0x410]` |
| `0xe930d4` | `e930d4:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0xe930d7` | `e930d7:	4c 89 ff             	mov    rdi,r15` |
| `0xe930dd` | `e930dd:	4c 8b b4 24 90 03 00 	mov    r14,QWORD PTR [rsp+0x390]` |
| `0xe930e5` | `e930e5:	48 8b 84 24 98 03 00 	mov    rax,QWORD PTR [rsp+0x398]` |
| `0xe93121` | `e93121:	4d 89 30             	mov    QWORD PTR [r8],r14` |
| `0xe93128` | `e93128:	4d 89 78 10          	mov    QWORD PTR [r8+0x10],r15` |
| `0xe93155` | `e93155:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0xe93160` | `e93160:	4c 89 f6             	mov    rsi,r14` |
| `0xe931a0` | `e931a0:	4c 8d ac 24 10 0e 00 	lea    r13,[rsp+0xe10]` |
| `0xe931a8` | `e931a8:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]` |
| `0xe931b1` | `e931b1:	4d 89 75 00          	mov    QWORD PTR [r13+0x0],r14` |
| `0xe931b5` | `e931b5:	49 89 5d 08          	mov    QWORD PTR [r13+0x8],rbx` |
| `0xe931b9` | `e931b9:	4d 89 7d 10          	mov    QWORD PTR [r13+0x10],r15` |
| `0xe931e1` | `e931e1:	4d 89 e8             	mov    r8,r13` |
| `0xe931e9` | `e931e9:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0xe931ef` | `e931ef:	4c 89 f6             	mov    rsi,r14` |
| `0xe93210` | `e93210:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]` |
| `0xe9324a` | `e9324a:	49 8d bd e0 03 00 00 	lea    rdi,[r13+0x3e0]` |
| `0xe9327d` | `e9327d:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]` |
| `0xe932a5` | `e932a5:	66 0f 7f 84 24 80 03 	movdqa XMMWORD PTR [rsp+0x380],xmm0` |
| `0xe932b6` | `e932b6:	49 8b 85 70 05 00 00 	mov    rax,QWORD PTR [r13+0x570]` |
| `0xe932e1` | `e932e1:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]` |
| `0xe932e5` | `e932e5:	4d 8b a5 e8 00 00 00 	mov    r12,QWORD PTR [r13+0xe8]` |
| `0xe93319` | `e93319:	49 89 c6             	mov    r14,rax` |
| `0xe9331c` | `e9331c:	4c 63 ed             	movsxd r13,ebp` |
| `0xe9331f` | `e9331f:	4c 8d bc 24 e0 0b 00 	lea    r15,[rsp+0xbe0]` |
| `0xe93327` | `e93327:	49 89 1f             	mov    QWORD PTR [r15],rbx` |
| `0xe93331` | `e93331:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax` |
| `0xe93335` | `e93335:	4d 89 7f 20          	mov    QWORD PTR [r15+0x20],r15` |
| `0xe93339` | `e93339:	4c 89 f7             	mov    rdi,r14` |
| `0xe93343` | `e93343:	41 88 6e 58          	mov    BYTE PTR [r14+0x58],bpl` |
| `0xe93347` | `e93347:	49 8d 7e 60          	lea    rdi,[r14+0x60]` |
| `0xe9334b` | `e9334b:	4c 89 fe             	mov    rsi,r15` |
| `0xe93353` | `e93353:	4d 89 ae 90 00 00 00 	mov    QWORD PTR [r14+0x90],r13` |
| `0xe9335a` | `e9335a:	41 88 ae 98 00 00 00 	mov    BYTE PTR [r14+0x98],bpl` |
| `0xe93361` | `e93361:	41 88 ae a0 00 00 00 	mov    BYTE PTR [r14+0xa0],bpl` |
| `0xe93368` | `e93368:	4c 89 f7             	mov    rdi,r14` |
| `0xe9337a` | `e9337a:	4c 89 b4 24 50 10 00 	mov    QWORD PTR [rsp+0x1050],r14` |
| `0xe93382` | `e93382:	4c 89 ff             	mov    rdi,r15` |
| `0xe933ac` | `e933ac:	4c 8d bc 24 e0 0b 00 	lea    r15,[rsp+0xbe0]` |
| `0xe933bc` | `e933bc:	4c 89 ff             	mov    rdi,r15` |
| `0xe933d3` | `e933d3:	4c 89 fe             	mov    rsi,r15` |
| `0xe933e4` | `e933e4:	4c 89 73 60          	mov    QWORD PTR [rbx+0x60],r14` |
| `0xe933f3` | `e933f3:	4c 8d 6b 08          	lea    r13,[rbx+0x8]` |
| `0xe9341b` | `e9341b:	66 0f 7f 8c 24 80 03 	movdqa XMMWORD PTR [rsp+0x380],xmm1` |
| `0xe9344e` | `e9344e:	4c 8b b4 24 90 03 00 	mov    r14,QWORD PTR [rsp+0x390]` |
| `0xe93456` | `e93456:	48 8b 84 24 98 03 00 	mov    rax,QWORD PTR [rsp+0x398]` |
| `0xe9348e` | `e9348e:	4d 89 30             	mov    QWORD PTR [r8],r14` |
| `0xe934a4` | `e934a4:	f0 49 ff 45 00       	lock inc QWORD PTR [r13+0x0]` |
| `0xe934be` | `e934be:	4c 8d bc 24 e0 0b 00 	lea    r15,[rsp+0xbe0]` |
| `0xe934ca` | `e934ca:	4c 89 ff             	mov    rdi,r15` |
| `0xe934d2` | `e934d2:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0xe934dd` | `e934dd:	4c 89 f6             	mov    rsi,r14` |
| `0xe934e0` | `e934e0:	4c 89 fa             	mov    rdx,r15` |
| `0xe934fe` | `e934fe:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]` |
| `0xe93506` | `e93506:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0xe9352c` | `e9352c:	4d 89 34 24          	mov    QWORD PTR [r12],r14` |
| `0xe93545` | `e93545:	f0 49 ff 45 00       	lock inc QWORD PTR [r13+0x0]` |
| `0xe9357b` | `e9357b:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0xe9357e` | `e9357e:	4c 89 ff             	mov    rdi,r15` |
| `0xe93581` | `e93581:	4c 89 f6             	mov    rsi,r14` |
| `0xe935a2` | `e935a2:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]` |
| `0xe935dc` | `e935dc:	49 8d bd e0 03 00 00 	lea    rdi,[r13+0x3e0]` |
| `0xe935fb` | `e935fb:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]` |
| `0xe9363e` | `e9363e:	49 89 c6             	mov    r14,rax` |
| `0xe93651` | `e93651:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0xe93654` | `e93654:	f3 41 0f 6f 85 a8 04 	movdqu xmm0,XMMWORD PTR [r13+0x4a8]` |
| `0xe9365d` | `e9365d:	49 8b 85 b0 04 00 00 	mov    rax,QWORD PTR [r13+0x4b0]` |
| `0xe9366e` | `e9366e:	4d 8d 6e 18          	lea    r13,[r14+0x18]` |
| `0xe93679` | `e93679:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax` |
| `0xe9367d` | `e9367d:	f3 41 0f 7f 46 20    	movdqu XMMWORD PTR [r14+0x20],xmm0` |
| `0xe93694` | `e93694:	4d 8b 7e 20          	mov    r15,QWORD PTR [r14+0x20]` |
| `0xe936c5` | `e936c5:	66 49 0f 7e c7       	movq   r15,xmm0` |
| `0xe936d2` | `e936d2:	4d 89 28             	mov    QWORD PTR [r8],r13` |
| `0xe936f9` | `e936f9:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0xe93704` | `e93704:	4c 89 fe             	mov    rsi,r15` |
| `0xe9370d` | `e9370d:	49 8d 7e 30          	lea    rdi,[r14+0x30]` |
| `0xe93711` | `e93711:	4c 8d bc 24 30 0a 00 	lea    r15,[rsp+0xa30]` |
| `0xe93719` | `e93719:	4c 89 fe             	mov    rsi,r15` |
| `0xe93721` | `e93721:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0xe93737` | `e93737:	49 8d 7e 78          	lea    rdi,[r14+0x78]` |
| `0xe9373f` | `e9373f:	f3 41 0f 7f 46 60    	movdqu XMMWORD PTR [r14+0x60],xmm0` |
| `0xe93745` | `e93745:	f3 41 0f 7f 46 50    	movdqu XMMWORD PTR [r14+0x50],xmm0` |
| `0xe9374b` | `e9374b:	f3 41 0f 7f 46 40    	movdqu XMMWORD PTR [r14+0x40],xmm0` |
| `0xe93751` | `e93751:	41 c6 46 70 00       	mov    BYTE PTR [r14+0x70],0x0` |
| `0xe937b0` | `e937b0:	4c 89 6b 30          	mov    QWORD PTR [rbx+0x30],r13` |
| `0xe937b4` | `e937b4:	4c 89 73 38          	mov    QWORD PTR [rbx+0x38],r14` |
| `0xe937b8` | `e937b8:	4c 8d 73 40          	lea    r14,[rbx+0x40]` |
| `0xe937bc` | `e937bc:	4c 89 f7             	mov    rdi,r14` |
| `0xe937c4` | `e937c4:	4c 8d 7b 50          	lea    r15,[rbx+0x50]` |
| `0xe937c8` | `e937c8:	4c 89 ff             	mov    rdi,r15` |
| `0xe9380c` | `e9380c:	4c 8b 6b 20          	mov    r13,QWORD PTR [rbx+0x20]` |
| `0xe93820` | `e93820:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]` |
| `0xe9382c` | `e9382c:	4c 89 ee             	mov    rsi,r13` |
| `0xe93835` | `e93835:	4c 8d ac 24 30 0a 00 	lea    r13,[rsp+0xa30]` |
| `0xe9383d` | `e9383d:	4c 89 f7             	mov    rdi,r14` |
| `0xe93840` | `e93840:	4c 89 ee             	mov    rsi,r13` |
| `0xe93848` | `e93848:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]` |
| `0xe9385e` | `e9385e:	4c 8b 6b 30          	mov    r13,QWORD PTR [rbx+0x30]` |
| `0xe9387a` | `e9387a:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]` |
| `0xe93886` | `e93886:	4c 89 ee             	mov    rsi,r13` |
| `0xe9388f` | `e9388f:	4c 8d b4 24 30 0a 00 	lea    r14,[rsp+0xa30]` |
| `0xe93897` | `e93897:	4c 89 ff             	mov    rdi,r15` |
| `0xe9389a` | `e9389a:	4c 89 f6             	mov    rsi,r14` |
| `0xe938a2` | `e938a2:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]` |
| `0xe938d5` | `e938d5:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]` |
| `0xe938da` | `e938da:	49 89 c6             	mov    r14,rax` |
| `0xe938ed` | `e938ed:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0xe938f0` | `e938f0:	4d 8d 7e 18          	lea    r15,[r14+0x18]` |
| `0xe938fb` | `e938fb:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax` |
| `0xe938ff` | `e938ff:	4d 89 66 20          	mov    QWORD PTR [r14+0x20],r12` |
| `0xe93903` | `e93903:	49 89 5e 28          	mov    QWORD PTR [r14+0x28],rbx` |
| `0xe93909` | `e93909:	41 88 46 30          	mov    BYTE PTR [r14+0x30],al` |
| `0xe9390d` | `e9390d:	41 88 46 40          	mov    BYTE PTR [r14+0x40],al` |
| `0xe93918` | `e93918:	66 49 0f 6e c6       	movq   xmm0,r14` |
| `0xe9391d` | `e9391d:	66 49 0f 6e cf       	movq   xmm1,r15` |
| `0xe9394b` | `e9394b:	49 8b 9d 40 04 00 00 	mov    rbx,QWORD PTR [r13+0x440]` |
| `0xe93952` | `e93952:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]` |
| `0xe93a88` | `e93a88:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]` |
| `0xe93ab3` | `e93ab3:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]` |
| `0xe93ad5` | `e93ad5:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]` |
| `0xe93ae1` | `e93ae1:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]` |
| `0xe93ae8` | `e93ae8:	45 31 ff             	xor    r15d,r15d` |
| `0xe93af5` | `e93af5:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]` |
| `0xe93afc` | `e93afc:	41 b7 01             	mov    r15b,0x1` |
| `0xe93b1c` | `e93b1c:	41 5e                	pop    r14` |
| `0xe93b22` | `e93b22:	4c 89 f2             	mov    rdx,r14` |
| `0xe93b31` | `e93b31:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]` |
| `0xe93b4e` | `e93b4e:	4c 89 f2             	mov    rdx,r14` |
| `0xe93b56` | `e93b56:	4d 89 ec             	mov    r12,r13` |
| `0xe93b59` | `e93b59:	41 89 c5             	mov    r13d,eax` |
| `0xe93b76` | `e93b76:	4c 89 f2             	mov    rdx,r14` |
| `0xe93b9d` | `e93b9d:	4c 89 f2             	mov    rdx,r14` |
| `0xe93bd9` | `e93bd9:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]` |
| `0xe93be1` | `e93be1:	49 89 0e             	mov    QWORD PTR [r14],rcx` |
| `0xe93beb` | `e93beb:	49 89 4e 10          	mov    QWORD PTR [r14+0x10],rcx` |
| `0xe93bf6` | `e93bf6:	49 89 4e 18          	mov    QWORD PTR [r14+0x18],rcx` |
| `0xe93c11` | `e93c11:	4c 89 f6             	mov    rsi,r14` |
| `0xe93c19` | `e93c19:	4c 89 f7             	mov    rdi,r14` |
| `0xe93c21` | `e93c21:	4d 8b b4 24 e8 00 00 	mov    r14,QWORD PTR [r12+0xe8]` |
| `0xe93c60` | `e93c60:	4c 89 73 30          	mov    QWORD PTR [rbx+0x30],r14` |
| `0xe93c85` | `e93c85:	4c 89 f6             	mov    rsi,r14` |
| `0xe93ccc` | `e93ccc:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]` |
| `0xe93cd1` | `e93cd1:	49 8b 9e b0 00 00 00 	mov    rbx,QWORD PTR [r14+0xb0]` |
| `0xe93d0a` | `e93d0a:	49 8b 86 b0 02 00 00 	mov    rax,QWORD PTR [r14+0x2b0]` |
| `0xe93d19` | `e93d19:	49 8b 9e 20 04 00 00 	mov    rbx,QWORD PTR [r14+0x420]` |
| `0xe93d2e` | `e93d2e:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]` |
| `0xe93d3d` | `e93d3d:	4c 89 f7             	mov    rdi,r14` |
| `0xe93d4b` | `e93d4b:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0` |
| `0xe93de0` | `e93de0:	49 89 f6             	mov    r14,rsi` |
| `0xe93de3` | `e93de3:	49 83 c6 18          	add    r14,0x18` |
| `0xe93e12` | `e93e12:	45 84 ff             	test   r15b,r15b` |
| `0xe93ecc` | `e93ecc:	41 69 c5 60 ea 00 00 	imul   eax,r13d,0xea60` |
| `0xe93eec` | `e93eec:	49 89 d5             	mov    r13,rdx` |
| `0xe93eef` | `e93eef:	49 89 f7             	mov    r15,rsi` |
| `0xe93faa` | `e93faa:	4c 89 ad 20 01 00 00 	mov    QWORD PTR [rbp+0x120],r13` |
| `0xe93fc4` | `e93fc4:	4c 89 b5 38 01 00 00 	mov    QWORD PTR [rbp+0x138],r14` |
| `0xe93fcb` | `e93fcb:	4c 89 bd 40 01 00 00 	mov    QWORD PTR [rbp+0x140],r15` |
| `0xe93ff0` | `e93ff0:	4c 8b 6c 24 38       	mov    r13,QWORD PTR [rsp+0x38]` |
| `0xe93ff5` | `e93ff5:	4d 89 28             	mov    QWORD PTR [r8],r13` |
| `0xe9401c` | `e9401c:	49 8b 47 18          	mov    rax,QWORD PTR [r15+0x18]` |
| `0xe94028` | `e94028:	4c 89 f6             	mov    rsi,r14` |
| `0xe94039` | `e94039:	4c 8b 7c 24 50       	mov    r15,QWORD PTR [rsp+0x50]` |
| `0xe9403e` | `e9403e:	4c 89 ff             	mov    rdi,r15` |
| `0xe9406e` | `e9406e:	4d 89 28             	mov    QWORD PTR [r8],r13` |
| `0xe9407f` | `e9407f:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]` |
| `0xe9408b` | `e9408b:	4c 89 f7             	mov    rdi,r14` |
| `0xe940a3` | `e940a3:	4c 89 f2             	mov    rdx,r14` |
| `0xe9410d` | `e9410d:	4c 8b b5 98 00 00 00 	mov    r14,QWORD PTR [rbp+0x98]` |
| `0xe9411f` | `e9411f:	4d 89 28             	mov    QWORD PTR [r8],r13` |
| `0xe94146` | `e94146:	49 8b 36             	mov    rsi,QWORD PTR [r14]` |
| `0xe9414c` | `e9414c:	4c 8d b4 24 10 0e 00 	lea    r14,[rsp+0xe10]` |
| `0xe94154` | `e94154:	4c 89 f7             	mov    rdi,r14` |
| `0xe94162` | `e94162:	4c 89 f6             	mov    rsi,r14` |
| `0xe9416a` | `e9416a:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]` |
| `0xe941f0` | `e941f0:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]` |
| `0xe941f8` | `e941f8:	4c 89 f7             	mov    rdi,r14` |
| `0xe94233` | `e94233:	49 89 c7             	mov    r15,rax` |
| `0xe94246` | `e94246:	49 89 07             	mov    QWORD PTR [r15],rax` |
| `0xe94249` | `e94249:	49 8d 47 20          	lea    rax,[r15+0x20]` |
| `0xe9424d` | `e9424d:	f3 41 0f 7f 47 20    	movdqu XMMWORD PTR [r15+0x20],xmm0` |
| `0xe94253` | `e94253:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax` |
| `0xe9425f` | `e9425f:	4c 89 f9             	mov    rcx,r15` |
| `0xe942c4` | `e942c4:	4c 89 bc 24 58 03 00 	mov    QWORD PTR [rsp+0x358],r15` |
| `0xe942dc` | `e942dc:	4c 89 ac 24 70 03 00 	mov    QWORD PTR [rsp+0x370],r13` |
| `0xe9430f` | `e9430f:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]` |
| `0xe94314` | `e94314:	41 0f 10 85 38 01 00 	movups xmm0,XMMWORD PTR [r13+0x138]` |
| `0xe94324` | `e94324:	49 8b 85 40 01 00 00 	mov    rax,QWORD PTR [r13+0x140]` |
| `0xe9433d` | `e9433d:	f3 41 0f 6f 85 c8 00 	movdqu xmm0,XMMWORD PTR [r13+0xc8]` |
| `0xe9434f` | `e9434f:	49 8b 85 d0 00 00 00 	mov    rax,QWORD PTR [r13+0xd0]` |
| `0xe94365` | `e94365:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]` |
| `0xe9436e` | `e9436e:	41 80 bd 31 01 00 00 	cmp    BYTE PTR [r13+0x131],0x0` |
| `0xe9438b` | `e9438b:	4c 89 b4 24 00 0c 00 	mov    QWORD PTR [rsp+0xc00],r14` |
| `0xe9439e` | `e9439e:	4c 89 f6             	mov    rsi,r14` |
| `0xe9442f` | `e9442f:	4c 8d bc 24 50 0f 00 	lea    r15,[rsp+0xf50]` |
| `0xe9443f` | `e9443f:	4c 89 ff             	mov    rdi,r15` |
| `0xe9444a` | `e9444a:	4c 8d b4 24 10 0e 00 	lea    r14,[rsp+0xe10]` |
| `0xe94452` | `e94452:	4c 89 f7             	mov    rdi,r14` |
| `0xe94455` | `e94455:	4c 89 fe             	mov    rsi,r15` |
| `0xe94464` | `e94464:	4c 8d bc 24 e0 0b 00 	lea    r15,[rsp+0xbe0]` |
| `0xe9446c` | `e9446c:	4c 89 ff             	mov    rdi,r15` |
| `0xe94509` | `e94509:	41 be 90 00 00 00    	mov    r14d,0x90` |
| `0xe9450f` | `e9450f:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0xe9451f` | `e9451f:	49 83 c6 d0          	add    r14,0xffffffffffffffd0` |
| `0xe94523` | `e94523:	49 83 fe d0          	cmp    r14,0xffffffffffffffd0` |
| `0xe9453e` | `e9453e:	4c 8d b4 24 30 0a 00 	lea    r14,[rsp+0xa30]` |
| `0xe94546` | `e94546:	4c 89 f6             	mov    rsi,r14` |
| `0xe945ee` | `e945ee:	4c 8d bc 24 d0 0f 00 	lea    r15,[rsp+0xfd0]` |
| `0xe945f6` | `e945f6:	4c 89 ff             	mov    rdi,r15` |
| `0xe945fe` | `e945fe:	4c 8d b4 24 10 0e 00 	lea    r14,[rsp+0xe10]` |
| `0xe94606` | `e94606:	4c 89 f7             	mov    rdi,r14` |
| `0xe94609` | `e94609:	4c 89 fe             	mov    rsi,r15` |
| `0xe946b4` | `e946b4:	4c 8d b4 24 30 0a 00 	lea    r14,[rsp+0xa30]` |
| `0xe946bc` | `e946bc:	4c 89 f6             	mov    rsi,r14` |
| `0xe9475b` | `e9475b:	49 8b 85 28 04 00 00 	mov    rax,QWORD PTR [r13+0x428]` |
| `0xe94762` | `e94762:	49 8b 8d 98 05 00 00 	mov    rcx,QWORD PTR [r13+0x598]` |
| `0xe94787` | `e94787:	49 8b b5 b8 03 00 00 	mov    rsi,QWORD PTR [r13+0x3b8]` |
| `0xe947a4` | `e947a4:	4d 8b bd 70 05 00 00 	mov    r15,QWORD PTR [r13+0x570]` |
| `0xe947f1` | `e947f1:	4c 8d 73 30          	lea    r14,[rbx+0x30]` |
| `0xe947f5` | `e947f5:	4c 89 73 30          	mov    QWORD PTR [rbx+0x30],r14` |
| `0xe947f9` | `e947f9:	4c 89 73 38          	mov    QWORD PTR [rbx+0x38],r14` |
| `0xe94830` | `e94830:	41 8a 6f 01          	mov    bpl,BYTE PTR [r15+0x1]` |
| `0xe94839` | `e94839:	4c 8d b4 24 50 0f 00 	lea    r14,[rsp+0xf50]` |
| `0xe94841` | `e94841:	4c 89 f7             	mov    rdi,r14` |
| `0xe94851` | `e94851:	4c 89 f6             	mov    rsi,r14` |
| `0xe94874` | `e94874:	4c 8d bc 24 50 0f 00 	lea    r15,[rsp+0xf50]` |
| `0xe94880` | `e94880:	4c 89 ff             	mov    rdi,r15` |
| `0xe948a6` | `e948a6:	4c 89 fa             	mov    rdx,r15` |
| `0xe948b6` | `e948b6:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]` |
| `0xe948be` | `e948be:	4c 89 f6             	mov    rsi,r14` |
| `0xe948c6` | `e948c6:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]` |
| `0xe948d2` | `e948d2:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]` |
| `0xe94904` | `e94904:	49 89 c6             	mov    r14,rax` |
| `0xe94917` | `e94917:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0xe94921` | `e94921:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax` |
| `0xe94925` | `e94925:	4d 89 66 20          	mov    QWORD PTR [r14+0x20],r12` |
| `0xe94929` | `e94929:	49 89 5e 28          	mov    QWORD PTR [r14+0x28],rbx` |
| `0xe94932` | `e94932:	49 8d 7e 30          	lea    rdi,[r14+0x30]` |
| `0xe94945` | `e94945:	49 8d 8d 70 04 00 00 	lea    rcx,[r13+0x470]` |
| `0xe94959` | `e94959:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0` |
| `0xe9498c` | `e9498c:	49 8b 9d e8 00 00 00 	mov    rbx,QWORD PTR [r13+0xe8]` |
| `0xe94996` | `e94996:	4c 89 74 24 48       	mov    QWORD PTR [rsp+0x48],r14` |
| `0xe949d9` | `e949d9:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]` |
| `0xe94a1e` | `e94a1e:	49 8b 9d 78 05 00 00 	mov    rbx,QWORD PTR [r13+0x578]` |
| `0xe94a86` | `e94a86:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]` |
| `0xe94a96` | `e94a96:	49 8b 5d 18          	mov    rbx,QWORD PTR [r13+0x18]` |
| `0xe94afb` | `e94afb:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]` |
| `0xe94b23` | `e94b23:	49 8b 5d 18          	mov    rbx,QWORD PTR [r13+0x18]` |
| `0xe94b27` | `e94b27:	4d 8b b5 78 05 00 00 	mov    r14,QWORD PTR [r13+0x578]` |
| `0xe94b5f` | `e94b5f:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14` |
| `0xe94b93` | `e94b93:	4c 8b 74 24 48       	mov    r14,QWORD PTR [rsp+0x48]` |
| `0xe94b98` | `e94b98:	49 8d 46 18          	lea    rax,[r14+0x18]` |
| `0xe94ba1` | `e94ba1:	49 8d 46 08          	lea    rax,[r14+0x8]` |
| `0xe94bbe` | `e94bbe:	4c 8b b4 24 08 03 00 	mov    r14,QWORD PTR [rsp+0x308]` |
| `0xe94bc6` | `e94bc6:	4c 39 f3             	cmp    rbx,r14` |
| `0xe94c1b` | `e94c1b:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14` |
| `0xe94c23` | `e94c23:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]` |
| `0xe94c2b` | `e94c2b:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0` |
| `0xe94c30` | `e94c30:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0` |
| `0xe94c38` | `e94c38:	4c 89 f7             	mov    rdi,r14` |
| `0xe94c52` | `e94c52:	4c 8b 2d 47 ce a1 00 	mov    r13,QWORD PTR [rip+0xa1ce47]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>` |
| `0xe94c59` | `e94c59:	4c 89 68 08          	mov    QWORD PTR [rax+0x8],r13` |
| `0xe94c87` | `e94c87:	4d 8d 7c 24 08       	lea    r15,[r12+0x8]` |
| `0xe94c94` | `e94c94:	4c 89 ac 24 e8 0b 00 	mov    QWORD PTR [rsp+0xbe8],r13` |
| `0xe94c9c` | `e94c9c:	4c 89 b4 24 00 0c 00 	mov    QWORD PTR [rsp+0xc00],r14` |
| `0xe94cc3` | `e94cc3:	4c 89 f6             	mov    rsi,r14` |
| `0xe94ce4` | `e94ce4:	4c 89 f7             	mov    rdi,r14` |
| `0xe94cec` | `e94cec:	f0 49 ff 07          	lock inc QWORD PTR [r15]` |
| `0xe94cfa` | `e94cfa:	49 89 c7             	mov    r15,rax` |
| `0xe94d0b` | `e94d0b:	49 89 0f             	mov    QWORD PTR [r15],rcx` |
| `0xe94d0e` | `e94d0e:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax` |
| `0xe94d12` | `e94d12:	4d 89 67 10          	mov    QWORD PTR [r15+0x10],r12` |
| `0xe94d1a` | `e94d1a:	f3 41 0f 7f 47 18    	movdqu XMMWORD PTR [r15+0x18],xmm0` |
| `0xe94d20` | `e94d20:	f3 41 0f 7f 47 28    	movdqu XMMWORD PTR [r15+0x28],xmm0` |
| `0xe94d26` | `e94d26:	49 83 67 38 00       	and    QWORD PTR [r15+0x38],0x0` |
| `0xe94d2b` | `e94d2b:	4c 89 f8             	mov    rax,r15` |
| `0xe94d32` | `e94d32:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax` |
| `0xe94d36` | `e94d36:	49 89 47 48          	mov    QWORD PTR [r15+0x48],rax` |
| `0xe94d3a` | `e94d3a:	66 41 0f 7f 47 50    	movdqa XMMWORD PTR [r15+0x50],xmm0` |
| `0xe94d40` | `e94d40:	66 41 0f 7f 47 60    	movdqa XMMWORD PTR [r15+0x60],xmm0` |
| `0xe94d46` | `e94d46:	49 83 67 70 00       	and    QWORD PTR [r15+0x70],0x0` |
| `0xe94d50` | `e94d50:	41 89 47 78          	mov    DWORD PTR [r15+0x78],eax` |
| `0xe94d57` | `e94d57:	49 89 8f 80 00 00 00 	mov    QWORD PTR [r15+0x80],rcx` |
| `0xe94d5e` | `e94d5e:	49 89 8f 88 00 00 00 	mov    QWORD PTR [r15+0x88],rcx` |
| `0xe94d65` | `e94d65:	49 83 a7 90 00 00 00 	and    QWORD PTR [r15+0x90],0x0` |
| `0xe94d6d` | `e94d6d:	49 83 a7 c0 00 00 00 	and    QWORD PTR [r15+0xc0],0x0` |
| `0xe94d75` | `e94d75:	66 41 0f 7f 87 d0 00 	movdqa XMMWORD PTR [r15+0xd0],xmm0` |
| `0xe94d7e` | `e94d7e:	66 41 0f 7f 87 e0 00 	movdqa XMMWORD PTR [r15+0xe0],xmm0` |
| `0xe94d87` | `e94d87:	41 89 87 f0 00 00 00 	mov    DWORD PTR [r15+0xf0],eax` |
| `0xe94db1` | `e94db1:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]` |
| `0xe94dc0` | `e94dc0:	4c 89 f7             	mov    rdi,r14` |
| `0xe94dcb` | `e94dcb:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0` |
| `0xe94e20` | `e94e20:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]` |
| `0xe94e28` | `e94e28:	4c 89 f7             	mov    rdi,r14` |
| `0xe94e63` | `e94e63:	4c 8d ac 24 10 0e 00 	lea    r13,[rsp+0xe10]` |
| `0xe94e73` | `e94e73:	4c 89 ef             	mov    rdi,r13` |
| `0xe94ec5` | `e94ec5:	4c 89 ee             	mov    rsi,r13` |
| `0xe94ede` | `e94ede:	4d 89 bc 24 b8 00 00 	mov    QWORD PTR [r12+0xb8],r15` |
| `0xe94ef6` | `e94ef6:	4d 8d 6c 24 20       	lea    r13,[r12+0x20]` |
| `0xe94f68` | `e94f68:	4c 8b 7c 24 48       	mov    r15,QWORD PTR [rsp+0x48]` |
| `0xe94f6d` | `e94f6d:	4d 89 bc 24 40 01 00 	mov    QWORD PTR [r12+0x140],r15` |
| `0xe94f75` | `e94f75:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]` |
| `0xe94fa8` | `e94fa8:	4c 89 ac 24 e8 0b 00 	mov    QWORD PTR [rsp+0xbe8],r13` |
| `0xe94fb0` | `e94fb0:	4c 89 b4 24 00 0c 00 	mov    QWORD PTR [rsp+0xc00],r14` |
| `0xe94fbc` | `e94fbc:	4c 89 f6             	mov    rsi,r14` |
| `0xe94fc4` | `e94fc4:	4c 89 f7             	mov    rdi,r14` |
| `0xe94fe3` | `e94fe3:	4c 89 ac 24 38 0a 00 	mov    QWORD PTR [rsp+0xa38],r13` |
| `0xe95016` | `e95016:	4c 8d b4 24 10 0e 00 	lea    r14,[rsp+0xe10]` |
| `0xe9501e` | `e9501e:	4c 89 f7             	mov    rdi,r14` |
| `0xe9502b` | `e9502b:	66 49 0f 6e cd       	movq   xmm1,r13` |
| `0xe9505c` | `e9505c:	4c 89 ff             	mov    rdi,r15` |
| `0xe95088` | `e95088:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0` |
| `0xe9508c` | `e9508c:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0` |
| `0xe95091` | `e95091:	4c 8b b4 24 90 03 00 	mov    r14,QWORD PTR [rsp+0x390]` |
| `0xe95099` | `e95099:	48 8b 84 24 98 03 00 	mov    rax,QWORD PTR [rsp+0x398]` |
| `0xe950a1` | `e950a1:	4c 89 33             	mov    QWORD PTR [rbx],r14` |
| `0xe950f4` | `e950f4:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0xe950ff` | `e950ff:	4c 89 f6             	mov    rsi,r14` |
| `0xe9510b` | `e9510b:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]` |
| `0xe95110` | `e95110:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]` |
| `0xe95151` | `e95151:	49 8d bd f8 03 00 00 	lea    rdi,[r13+0x3f8]` |
| `0xe9517d` | `e9517d:	4d 85 ff             	test   r15,r15` |
| `0xe95182` | `e95182:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]` |
| `0xe95190` | `e95190:	49 8b 85 70 05 00 00 	mov    rax,QWORD PTR [r13+0x570]` |
| `0xe951a9` | `e951a9:	49 89 c6             	mov    r14,rax` |
| `0xe951bc` | `e951bc:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0xe951bf` | `e951bf:	4d 8d 66 18          	lea    r12,[r14+0x18]` |
| `0xe951fd` | `e951fd:	4c 89 b4 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],r14` |
| `0xe9520d` | `e9520d:	4c 89 f0             	mov    rax,r14` |
| `0xe9524a` | `e9524a:	4d 85 ff             	test   r15,r15` |
| `0xe9524f` | `e9524f:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]` |
| `0xe95260` | `e95260:	4c 89 73 40          	mov    QWORD PTR [rbx+0x40],r14` |
| `0xe95264` | `e95264:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]` |
| `0xe95285` | `e95285:	49 89 c5             	mov    r13,rax` |
| `0xe95288` | `e95288:	4c 8d 7b 48          	lea    r15,[rbx+0x48]` |
| `0xe95290` | `e95290:	f3 41 0f 7f 47 20    	movdqu XMMWORD PTR [r15+0x20],xmm0` |
| `0xe95296` | `e95296:	f3 41 0f 7f 47 10    	movdqu XMMWORD PTR [r15+0x10],xmm0` |
| `0xe9529c` | `e9529c:	f3 41 0f 7f 07       	movdqu XMMWORD PTR [r15],xmm0` |
| `0xe952ac` | `e952ac:	49 89 d6             	mov    r14,rdx` |
| `0xe952af` | `e952af:	4c 89 ef             	mov    rdi,r13` |
| `0xe952ba` | `e952ba:	4c 89 ff             	mov    rdi,r15` |
| `0xe952c0` | `e952c0:	4c 89 f2             	mov    rdx,r14` |
| `0xe952cb` | `e952cb:	4c 8d 6b 18          	lea    r13,[rbx+0x18]` |
| `0xe952cf` | `e952cf:	4c 8b b4 24 88 00 00 	mov    r14,QWORD PTR [rsp+0x88]` |
| `0xe952d7` | `e952d7:	41 8a 6e 01          	mov    bpl,BYTE PTR [r14+0x1]` |
| `0xe9530a` | `e9530a:	4d 89 28             	mov    QWORD PTR [r8],r13` |
| `0xe9538c` | `e9538c:	41 8a 6e 01          	mov    bpl,BYTE PTR [r14+0x1]` |
| `0xe953bf` | `e953bf:	4d 89 28             	mov    QWORD PTR [r8],r13` |
| `0xe95445` | `e95445:	4c 8b 7c 24 68       	mov    r15,QWORD PTR [rsp+0x68]` |
| `0xe9544a` | `e9544a:	4c 8b b4 24 c0 00 00 	mov    r14,QWORD PTR [rsp+0xc0]` |
| `0xe95498` | `e95498:	4c 89 ff             	mov    rdi,r15` |
| `0xe95511` | `e95511:	66 49 0f 6e ce       	movq   xmm1,r14` |
| `0xe95545` | `e95545:	66 49 0f 6e cd       	movq   xmm1,r13` |
| `0xe95588` | `e95588:	49 89 c5             	mov    r13,rax` |
| `0xe9558b` | `e9558b:	49 83 c5 08          	add    r13,0x8` |
| `0xe95597` | `e95597:	4c 8d b4 24 30 0a 00 	lea    r14,[rsp+0xa30]` |
| `0xe955a2` | `e955a2:	4c 89 f6             	mov    rsi,r14` |
| `0xe955aa` | `e955aa:	49 8d bf a0 00 00 00 	lea    rdi,[r15+0xa0]` |
| `0xe955c2` | `e955c2:	4c 89 f7             	mov    rdi,r14` |
| `0xe955e9` | `e955e9:	49 8b bf 98 00 00 00 	mov    rdi,QWORD PTR [r15+0x98]` |
| `0xe955f9` | `e955f9:	f3 41 0f 7f 87 90 00 	movdqu XMMWORD PTR [r15+0x90],xmm0` |
| `0xe9561d` | `e9561d:	4d 8b b4 24 e8 00 00 	mov    r14,QWORD PTR [r12+0xe8]` |
| `0xe9563a` | `e9563a:	4c 89 ac 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],r13` |

