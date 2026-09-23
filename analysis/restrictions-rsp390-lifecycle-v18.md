# Restrictions `[rsp+0x390]` receiver lifecycle v18

Focus: correct the v16/v17 assumption by tracing where `[rsp+0x390]/[rsp+0x398]` is first initialized, then how it is reused around `+0xa0/+0xa8`. Static provenance only.

## Function entry and first receiver-pair initialization

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
```
## Later `+0x28` pre-use call and receiver load

```text
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
```
## Callback registration uses of same receiver pair

### first +0xa0 package e9940c

```text
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
```
### +0xa8 package e9959c

```text
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
### later +0xa0 package e99c54

```text
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
```
## All local refs to receiver slots and owner fields

| addr | instruction |
|---:|---|
| `0xe92f6b` | `e92f6b:	48 8d bc 24 90 03 00 	lea    rdi,[rsp+0x390]` |
| `0xe92f73` | `e92f73:	e8 40 ff c5 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xe92f78` | `e92f78:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]` |
| `0xe92f9b` | `e92f9b:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]` |
| `0xe92fb7` | `e92fb7:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]` |
| `0xe92fd5` | `e92fd5:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]` |
| `0xe93091` | `e93091:	49 8b 85 70 05 00 00 	mov    rax,QWORD PTR [r13+0x570]` |
| `0xe930b3` | `e930b3:	4d 8b bd 10 04 00 00 	mov    r15,QWORD PTR [r13+0x410]` |
| `0xe930da` | `e930da:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe930dd` | `e930dd:	4c 8b b4 24 90 03 00 	mov    r14,QWORD PTR [rsp+0x390]` |
| `0xe930e5` | `e930e5:	48 8b 84 24 98 03 00 	mov    rax,QWORD PTR [rsp+0x398]` |
| `0xe93166` | `e93166:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]` |
| `0xe931f5` | `e931f5:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]` |
| `0xe932a5` | `e932a5:	66 0f 7f 84 24 80 03 	movdqa XMMWORD PTR [rsp+0x380],xmm0` |
| `0xe932b6` | `e932b6:	49 8b 85 70 05 00 00 	mov    rax,QWORD PTR [r13+0x570]` |
| `0xe9341b` | `e9341b:	66 0f 7f 8c 24 80 03 	movdqa XMMWORD PTR [rsp+0x380],xmm1` |
| `0xe9344e` | `e9344e:	4c 8b b4 24 90 03 00 	mov    r14,QWORD PTR [rsp+0x390]` |
| `0xe93456` | `e93456:	48 8b 84 24 98 03 00 	mov    rax,QWORD PTR [rsp+0x398]` |
| `0xe947a4` | `e947a4:	4d 8b bd 70 05 00 00 	mov    r15,QWORD PTR [r13+0x570]` |
| `0xe95091` | `e95091:	4c 8b b4 24 90 03 00 	mov    r14,QWORD PTR [rsp+0x390]` |
| `0xe95099` | `e95099:	48 8b 84 24 98 03 00 	mov    rax,QWORD PTR [rsp+0x398]` |
| `0xe95105` | `e95105:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]` |
| `0xe95190` | `e95190:	49 8b 85 70 05 00 00 	mov    rax,QWORD PTR [r13+0x570]` |

## Windows around writes/LEAs to `[rsp+0x390]/[rsp+0x398]`

### `0xe92f6b`

```text
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
```
### `0xe930dd`

```text
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
```
### `0xe930e5`

```text
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
```
### `0xe9344e`

```text
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
```
### `0xe93456`

```text
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
```
### `0xe95091`

```text
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
```
### `0xe95099`

```text
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
```
## Interpretation

If `e92f64/e92f6b/e92f73` is the only direct constructor of `[rsp+0x390]`, then `[r13+0x480]` is the source of the receiver pair. The `e930da` `[r13+0x410].vtable+0x28` call remains important, but should be treated as pre-use gate/update until a callee write-back to `[rsp+0x390]/[rsp+0x398]` is proven.
