# Service184 return-consumer dataflow

Goal: identify what service184 virtual +0x28/+0x30/+0x38 returns and whether +0x28 feeds the secondary skip-ad +0x68 receiver.

## 10885 +0x28: call 0x10885ee, FDE=(17335610, 17338257)
     10885a1:	00 
     10885a2:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     10885a6:	4c 89 ef             	mov    rdi,r13
     10885a9:	ff 50 28             	call   QWORD PTR [rax+0x28]
     10885ac:	49 89 c5             	mov    r13,rax
     10885af:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     10885b3:	48 89 ef             	mov    rdi,rbp
     10885b6:	ff 50 28             	call   QWORD PTR [rax+0x28]
     10885b9:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     10885be:	48 89 df             	mov    rdi,rbx
     10885c1:	e8 34 92 b8 ff       	call   c117fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e79a>
     10885c6:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     10885c9:	48 89 c7             	mov    rdi,rax
     10885cc:	ff 51 28             	call   QWORD PTR [rcx+0x28]
     10885cf:	48 89 c5             	mov    rbp,rax
     10885d2:	49 8b 06             	mov    rax,QWORD PTR [r14]
     10885d5:	4c 89 f7             	mov    rdi,r14
     10885d8:	ff 50 28             	call   QWORD PTR [rax+0x28]
     10885db:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     10885e0:	48 89 df             	mov    rdi,rbx
     10885e3:	e8 46 6a b0 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
     10885e8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     10885eb:	48 89 c7             	mov    rdi,rax
     10885ee:	ff 51 28             	call   QWORD PTR [rcx+0x28]
     10885f1:	49 89 c6             	mov    r14,rax
     10885f4:	6a 28                	push   0x28
     10885f6:	5f                   	pop    rdi
     10885f7:	e8 04 59 76 00       	call   17edf00 <_Znwm@plt>
     10885fc:	48 89 c3             	mov    rbx,rax
     10885ff:	0f 10 45 00          	movups xmm0,XMMWORD PTR [rbp+0x0]
     1088603:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
     1088608:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]
     108860c:	48 85 c0             	test   rax,rax
     108860f:	74 05                	je     1088616 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24fa2c>
     1088611:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     1088616:	41 0f 28 87 40 01 00 	movaps xmm0,XMMWORD PTR [r15+0x140]
     108861d:	00 
     108861e:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     1088623:	49 8b 87 48 01 00 00 	mov    rax,QWORD PTR [r15+0x148]
     108862a:	48 85 c0             	test   rax,rax
     108862d:	74 05                	je     1088634 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24fa4a>
     108862f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     1088634:	41 8a 84 24 b8 00 00 	mov    al,BYTE PTR [r12+0xb8]
     108863b:	00 
     108863c:	88 44 24 07          	mov    BYTE PTR [rsp+0x7],al
     1088640:	41 80 7c 24 11 00    	cmp    BYTE PTR [r12+0x11],0x0
     1088646:	c6 43 08 00          	mov    BYTE PTR [rbx+0x8],0x0
     108864a:	48 8d 05 17 21 7c 00 	lea    rax,[rip+0x7c2117]        # 184a768 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x6e50>
     1088651:	48 89 03             	mov    QWORD PTR [rbx],rax
     1088654:	4c 89 6b 10          	mov    QWORD PTR [rbx+0x10],r13
     1088658:	0f 57 c0             	xorps  xmm0,xmm0
     108865b:	0f 11 43 18          	movups XMMWORD PTR [rbx+0x18],xmm0
     108865f:	0f 84 a2 02 00 00    	je     1088907 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24fd1d>
     1088665:	4c 8d 3d 10 99 3c ff 	lea    r15,[rip+0xffffffffff3c9910]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     108866c:	48 8d 0d fe 24 30 ff 	lea    rcx,[rip+0xffffffffff3024fe]        # 38ab71 <_ZTSSt12bad_any_cast@@Base-0x5657>
     1088673:	6a 04                	push   0x4
     1088675:	5f                   	pop    rdi
     1088676:	6a 1e                	push   0x1e
     1088678:	5a                   	pop    rdx
     1088679:	4c 89 fe             	mov    rsi,r15
     108867c:	31 c0                	xor    eax,eax
     108867e:	e8 4f e2 74 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     1088683:	4d 85 f6             	test   r14,r14
     1088686:	0f 84 7d 06 00 00    	je     1088d09 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25011f>
     108868c:	bf 98 08 00 00       	mov    edi,0x898
     1088691:	e8 6a 58 76 00       	call   17edf00 <_Znwm@plt>
     1088696:	48 89 c5             	mov    rbp,rax
     1088699:	0f 57 c0             	xorps  xmm0,xmm0
     108869c:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     10886a0:	48 8d 05 c1 4d 77 00 	lea    rax,[rip+0x774dc1]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     10886a7:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     10886ab:	4c 8d 65 18          	lea    r12,[rbp+0x18]
     10886af:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
     10886b6:	00 
     10886b7:	48 83 26 00          	and    QWORD PTR [rsi],0x0
     10886bb:	48 8d 05 1e f7 94 ff 	lea    rax,[rip+0xffffffffff94f71e]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
     10886c2:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
     10886c6:	48 8d 05 7d 8b be ff 	lea    rax,[rip+0xffffffffffbe8b7d]        # c7124a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1be1ea>
     10886cd:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
     10886d1:	48 8d 05 c8 20 7c 00 	lea    rax,[rip+0x7c20c8]        # 184a7a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x6e88>
     10886d8:	48 89 45 18          	mov    QWORD PTR [rbp+0x18],rax
     10886dc:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     10886e1:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
     10886e5:	4c 89 75 28          	mov    QWORD PTR [rbp+0x28],r14
     10886e9:	48 8d 7d 30          	lea    rdi,[rbp+0x30]
     10886ed:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
     10886f4:	00 
     10886f5:	e8 80 ba c1 ff       	call   ca417a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f111a>
     10886fa:	48 c7 45 50 1e 00 00 	mov    QWORD PTR [rbp+0x50],0x1e
     1088701:	00 
     1088702:	48 c7 45 58 32 00 00 	mov    QWORD PTR [rbp+0x58],0x32
     1088709:	00 
     108870a:	48 8d 7d 60          	lea    rdi,[rbp+0x60]
     108870e:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
     1088713:	e8 de 12 75 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1088718:	48 8d 7d 70          	lea    rdi,[rbp+0x70]
     108871c:	48 89 7c 24 78       	mov    QWORD PTR [rsp+0x78],rdi
     1088721:	e8 d0 12 75 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1088726:	48 8d bd 80 00 00 00 	lea    rdi,[rbp+0x80]
     108872d:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
     1088732:	e8 57 fb a9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1088737:	48 8d bd d8 00 00 00 	lea    rdi,[rbp+0xd8]
     108873e:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
     1088743:	e8 88 08 00 00       	call   1088fd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2503e6>
     1088748:	0f 57 c0             	xorps  xmm0,xmm0
     108874b:	0f 11 85 40 07 00 00 	movups XMMWORD PTR [rbp+0x740],xmm0
     1088752:	0f 11 85 30 07 00 00 	movups XMMWORD PTR [rbp+0x730],xmm0
     1088759:	0f 11 85 20 07 00 00 	movups XMMWORD PTR [rbp+0x720],xmm0
     1088760:	0f 11 85 10 07 00 00 	movups XMMWORD PTR [rbp+0x710],xmm0
     1088767:	48 83 a5 50 07 00 00 	and    QWORD PTR [rbp+0x750],0x0
     108876e:	00 
     108876f:	b8 00 00 80 3f       	mov    eax,0x3f800000
     1088774:	89 85 58 07 00 00    	mov    DWORD PTR [rbp+0x758],eax
     108877a:	83 a5 98 07 00 00 00 	and    DWORD PTR [rbp+0x798],0x0
     1088781:	0f 11 85 60 07 00 00 	movups XMMWORD PTR [rbp+0x760],xmm0
     1088788:	0f 11 85 70 07 00 00 	movups XMMWORD PTR [rbp+0x770],xmm0
     108878f:	0f 11 85 80 07 00 00 	movups XMMWORD PTR [rbp+0x780],xmm0
     1088796:	4c 8d ad b8 07 00 00 	lea    r13,[rbp+0x7b8]
     108879d:	48 8b 4d 58          	mov    rcx,QWORD PTR [rbp+0x58]
     10887a1:	4c 89 ad b8 07 00 00 	mov    QWORD PTR [rbp+0x7b8],r13
     10887a8:	4c 89 ad c0 07 00 00 	mov    QWORD PTR [rbp+0x7c0],r13
     10887af:	48 83 a5 e8 07 00 00 	and    QWORD PTR [rbp+0x7e8],0x0
     10887b6:	00 
     10887b7:	0f 11 85 c8 07 00 00 	movups XMMWORD PTR [rbp+0x7c8],xmm0
     10887be:	0f 11 85 d8 07 00 00 	movups XMMWORD PTR [rbp+0x7d8],xmm0
     10887c5:	89 85 f0 07 00 00    	mov    DWORD PTR [rbp+0x7f0],eax
     10887cb:	48 89 8d f8 07 00 00 	mov    QWORD PTR [rbp+0x7f8],rcx
     10887d2:	48 89 8d 00 08 00 00 	mov    QWORD PTR [rbp+0x800],rcx
     10887d9:	48 83 a5 08 08 00 00 	and    QWORD PTR [rbp+0x808],0x0
     10887e0:	00 
     10887e1:	48 8d 95 10 08 00 00 	lea    rdx,[rbp+0x810]
     10887e8:	48 89 95 10 08 00 00 	mov    QWORD PTR [rbp+0x810],rdx
     10887ef:	48 89 95 18 08 00 00 	mov    QWORD PTR [rbp+0x818],rdx
     10887f6:	48 83 a5 40 08 00 00 	and    QWORD PTR [rbp+0x840],0x0
     10887fd:	00 
     10887fe:	0f 11 85 30 08 00 00 	movups XMMWORD PTR [rbp+0x830],xmm0
     1088805:	0f 11 85 20 08 00 00 	movups XMMWORD PTR [rbp+0x820],xmm0
     108880c:	89 85 48 08 00 00    	mov    DWORD PTR [rbp+0x848],eax
     1088812:	48 89 8d 50 08 00 00 	mov    QWORD PTR [rbp+0x850],rcx
     1088819:	48 89 8d 58 08 00 00 	mov    QWORD PTR [rbp+0x858],rcx
     1088820:	48 83 a5 60 08 00 00 	and    QWORD PTR [rbp+0x860],0x0
     1088827:	00 
     1088828:	48 8d 85 10 07 00 00 	lea    rax,[rbp+0x710]
     108882f:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     1088834:	48 8d 85 60 07 00 00 	lea    rax,[rbp+0x760]
     108883b:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     1088840:	31 c0                	xor    eax,eax
     1088842:	88 85 80 08 00 00    	mov    BYTE PTR [rbp+0x880],al
     1088848:	88 85 90 08 00 00    	mov    BYTE PTR [rbp+0x890],al

    tracking r14 after 0x10885f1
     10885f1:	49 89 c6             	mov    r14,rax
     1088683:	4d 85 f6             	test   r14,r14
     10886e5:	4c 89 75 28          	mov    QWORD PTR [rbp+0x28],r14
     108886b:	4c 8d b4 24 d0 00 00 	lea    r14,[rsp+0xd0]
    [register redefined; stop]

## 14420 +0x28: call 0x1442061, FDE=(21241846, 21243183)
     1442012:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1442019:	00 00 
     144201b:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
     1442022:	00 
     1442023:	48 89 cf             	mov    rdi,rcx
     1442026:	e8 03 d0 74 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
     144202b:	49 89 c7             	mov    r15,rax
     144202e:	4c 89 f7             	mov    rdi,r14
     1442031:	e8 e6 a2 83 ff       	call   c7c31c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c92bc>
     1442036:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     144203a:	4c 89 f7             	mov    rdi,r14
     144203d:	e8 d2 5f 74 ff       	call   b88014 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fb4>
     1442042:	49 89 c4             	mov    r12,rax
     1442045:	4c 89 f7             	mov    rdi,r14
     1442048:	e8 f5 5e 74 ff       	call   b87f42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4ee2>
     144204d:	49 89 c5             	mov    r13,rax
     1442050:	4c 89 f7             	mov    rdi,r14
     1442053:	e8 64 39 c3 ff       	call   10759bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23cdd2>
     1442058:	48 89 c5             	mov    rbp,rax
     144205b:	49 8b 07             	mov    rax,QWORD PTR [r15]
     144205e:	4c 89 ff             	mov    rdi,r15
     1442061:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1442064:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     1442069:	48 8b 83 50 01 00 00 	mov    rax,QWORD PTR [rbx+0x150]
     1442070:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     1442075:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     1442079:	4c 89 e7             	mov    rdi,r12
     144207c:	ff 50 40             	call   QWORD PTR [rax+0x40]
     144207f:	49 89 c7             	mov    r15,rax
     1442082:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     1442086:	4c 8d 74 24 58       	lea    r14,[rsp+0x58]
     144208b:	4c 89 f7             	mov    rdi,r14
     144208e:	4c 89 ee             	mov    rsi,r13
     1442091:	ff 50 30             	call   QWORD PTR [rax+0x30]
     1442094:	4d 8b 36             	mov    r14,QWORD PTR [r14]
     1442097:	48 8b 73 40          	mov    rsi,QWORD PTR [rbx+0x40]
     144209b:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     14420a0:	e8 ca 54 87 ff       	call   cb756f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20450f>
     14420a5:	4c 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],r15
     14420aa:	4c 8b 7b 20          	mov    r15,QWORD PTR [rbx+0x20]
     14420ae:	6a 30                	push   0x30
     14420b0:	5f                   	pop    rdi
     14420b1:	e8 4a be 3a 00       	call   17edf00 <_Znwm@plt>
     14420b6:	48 89 c3             	mov    rbx,rax
     14420b9:	4c 8b 6c 24 50       	mov    r13,QWORD PTR [rsp+0x50]
     14420be:	48 83 64 24 50 00    	and    QWORD PTR [rsp+0x50],0x0
     14420c4:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     14420c8:	48 8d 05 09 f7 42 00 	lea    rax,[rip+0x42f709]        # 18717d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dec0>
     14420cf:	48 89 03             	mov    QWORD PTR [rbx],rax
     14420d2:	4c 89 6b 10          	mov    QWORD PTR [rbx+0x10],r13
     14420d6:	6a 18                	push   0x18
     14420d8:	5f                   	pop    rdi
     14420d9:	e8 22 be 3a 00       	call   17edf00 <_Znwm@plt>
     14420de:	49 89 c4             	mov    r12,rax
     14420e1:	4c 89 74 24 30       	mov    QWORD PTR [rsp+0x30],r14
     14420e6:	48 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],rbp
     14420eb:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     14420ef:	4c 89 ef             	mov    rdi,r13
     14420f2:	ff 50 10             	call   QWORD PTR [rax+0x10]
     14420f5:	85 c0                	test   eax,eax
     14420f7:	41 0f 94 04 24       	sete   BYTE PTR [r12]
     14420fc:	4c 8d b4 24 c0 00 00 	lea    r14,[rsp+0xc0]
     1442103:	00 
     1442104:	4d 89 26             	mov    QWORD PTR [r14],r12
     1442107:	48 8d 35 83 af 65 ff 	lea    rsi,[rip+0xffffffffff65af83]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     144210e:	48 8d 0d 79 b7 87 ff 	lea    rcx,[rip+0xffffffffff87b779]        # cbd88e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a82e>
     1442115:	48 8d ac 24 f0 00 00 	lea    rbp,[rsp+0xf0]
     144211c:	00 
     144211d:	6a 08                	push   0x8
     144211f:	41 59                	pop    r9
     1442121:	48 89 ef             	mov    rdi,rbp
     1442124:	31 d2                	xor    edx,edx
     1442126:	4d 89 f0             	mov    r8,r14
     1442129:	e8 66 86 39 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     144212e:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     1442132:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     1442139:	00 
     144213a:	4c 89 ee             	mov    rsi,r13
     144213d:	48 89 ea             	mov    rdx,rbp
     1442140:	ff 50 18             	call   QWORD PTR [rax+0x18]
     1442143:	48 8d 6b 18          	lea    rbp,[rbx+0x18]
     1442147:	4c 89 e7             	mov    rdi,r12
     144214a:	48 83 c7 08          	add    rdi,0x8
     144214e:	4c 8d ac 24 30 01 00 	lea    r13,[rsp+0x130]
     1442155:	00 
     1442156:	4c 89 ee             	mov    rsi,r13
     1442159:	e8 e0 78 39 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     144215e:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     1442162:	e8 1f c3 65 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1442167:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     144216e:	00 
     144216f:	e8 74 86 39 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     1442174:	4c 89 63 18          	mov    QWORD PTR [rbx+0x18],r12
     1442178:	6a 10                	push   0x10
     144217a:	5f                   	pop    rdi
     144217b:	e8 80 bd 3a 00       	call   17edf00 <_Znwm@plt>
     1442180:	4c 89 38             	mov    QWORD PTR [rax],r15
     1442183:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     1442188:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     144218c:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
     1442190:	48 83 63 28 00       	and    QWORD PTR [rbx+0x28],0x0
     1442195:	48 83 7c 24 18 00    	cmp    QWORD PTR [rsp+0x18],0x0
     144219b:	0f 84 2a 02 00 00    	je     14423cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28794f>
     14421a1:	4c 8d 6b 20          	lea    r13,[rbx+0x20]
     14421a5:	48 8d 43 28          	lea    rax,[rbx+0x28]
     14421a9:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     14421ae:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     14421b2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14421b5:	48 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],rbp
     14421ba:	4c 89 6c 24 28       	mov    QWORD PTR [rsp+0x28],r13
     14421bf:	ff 50 28             	call   QWORD PTR [rax+0x28]
     14421c2:	49 89 c4             	mov    r12,rax
     14421c5:	4c 8b 7d 00          	mov    r15,QWORD PTR [rbp+0x0]
     14421c9:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     14421cd:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     14421d1:	bf 10 05 00 00       	mov    edi,0x510
     14421d6:	e8 25 bd 3a 00       	call   17edf00 <_Znwm@plt>
     14421db:	48 89 c5             	mov    rbp,rax
     14421de:	48 8d 05 2b f6 42 00 	lea    rax,[rip+0x42f62b]        # 1871810 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2def8>
     14421e5:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
     14421ec:	00 
     14421ed:	4c 89 bc 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],r15
     14421f4:	00 
     14421f5:	4c 8d ac 24 90 00 00 	lea    r13,[rsp+0x90]
     14421fc:	00 
     14421fd:	49 83 65 20 00       	and    QWORD PTR [r13+0x20],0x0
     1442202:	4c 89 b4 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],r14
     1442209:	00 
     144220a:	48 8d 05 07 f7 42 00 	lea    rax,[rip+0x42f707]        # 1871918 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e000>
     1442211:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     1442215:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     144221a:	48 89 45 08          	mov    QWORD PTR [rbp+0x8],rax
     144221e:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     1442225:	00 
     1442226:	4c 89 f6             	mov    rsi,r14
     1442229:	e8 ca 6f 74 ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
     144222e:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     1442235:	00 
     1442236:	4c 89 ee             	mov    rsi,r13
     1442239:	e8 9c 13 89 ff       	call   cd35da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22057a>
     144223e:	48 8d 05 f3 f6 42 00 	lea    rax,[rip+0x42f6f3]        # 1871938 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e020>
     1442245:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax
     1442249:	4c 89 65 18          	mov    QWORD PTR [rbp+0x18],r12
     144224d:	4c 8d 65 28          	lea    r12,[rbp+0x28]
     1442251:	0f 57 c0             	xorps  xmm0,xmm0
     1442254:	0f 11 45 28          	movups XMMWORD PTR [rbp+0x28],xmm0
     1442258:	4c 89 65 20          	mov    QWORD PTR [rbp+0x20],r12
     144225c:	4c 8d 7d 38          	lea    r15,[rbp+0x38]
     1442260:	4c 89 ff             	mov    rdi,r15
     1442263:	e8 6e 6f de ff       	call   12291d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e75a>
     1442268:	c6 85 a8 03 00 00 00 	mov    BYTE PTR [rbp+0x3a8],0x0
     144226f:	48 8d bd b0 03 00 00 	lea    rdi,[rbp+0x3b0]
     1442276:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
     144227b:	e8 66 ad 66 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
     1442280:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     1442285:	48 83 c0 10          	add    rax,0x10
     1442289:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
     144228e:	48 89 8d 70 04 00 00 	mov    QWORD PTR [rbp+0x470],rcx
     1442295:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     144229a:	48 89 8d 78 04 00 00 	mov    QWORD PTR [rbp+0x478],rcx
     14422a1:	48 89 85 80 04 00 00 	mov    QWORD PTR [rbp+0x480],rax
     14422a8:	48 8d bd 90 04 00 00 	lea    rdi,[rbp+0x490]
     14422af:	48 83 bc 24 50 01 00 	cmp    QWORD PTR [rsp+0x150],0x0
     14422b6:	00 00 
     14422b8:	74 0f                	je     14422c9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28784d>
     14422ba:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]

    tracking [rsp+0x18] after 0x1442064
     1442064:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
       1442069:	48 8b 83 50 01 00 00 	mov    rax,QWORD PTR [rbx+0x150]
       1442070:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
       1442075:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
       1442079:	4c 89 e7             	mov    rdi,r12
       144207c:	ff 50 40             	call   QWORD PTR [rax+0x40]
       144207f:	49 89 c7             	mov    r15,rax
       1442082:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     1442195:	48 83 7c 24 18 00    	cmp    QWORD PTR [rsp+0x18],0x0
       144219b:	0f 84 2a 02 00 00    	je     14423cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28794f>
       14421a1:	4c 8d 6b 20          	lea    r13,[rbx+0x20]
       14421a5:	48 8d 43 28          	lea    rax,[rbx+0x28]
       14421a9:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
       14421ae:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
       14421b2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
       14421b5:	48 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],rbp
     1442215:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
       144221a:	48 89 45 08          	mov    QWORD PTR [rbp+0x8],rax
       144221e:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
       1442225:	00 
       1442226:	4c 89 f6             	mov    rsi,r14
       1442229:	e8 ca 6f 74 ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
       144222e:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
       1442235:	00 

## b8ec +0x28: call 0xb8ec50, FDE=(12119050, 12120109)
      b8ec0a:	55                   	push   rbp
      b8ec0b:	41 57                	push   r15
      b8ec0d:	41 56                	push   r14
      b8ec0f:	41 55                	push   r13
      b8ec11:	41 54                	push   r12
      b8ec13:	53                   	push   rbx
      b8ec14:	48 81 ec c8 00 00 00 	sub    rsp,0xc8
      b8ec1b:	49 89 ce             	mov    r14,rcx
      b8ec1e:	49 89 d7             	mov    r15,rdx
      b8ec21:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
      b8ec26:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b8ec2d:	00 00 
      b8ec2f:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
      b8ec36:	00 
      b8ec37:	48 89 cf             	mov    rdi,rcx
      b8ec3a:	e8 03 93 ff ff       	call   b87f42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4ee2>
      b8ec3f:	48 89 c3             	mov    rbx,rax
      b8ec42:	4c 89 f7             	mov    rdi,r14
      b8ec45:	e8 e4 03 00 00       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
      b8ec4a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      b8ec4d:	48 89 c7             	mov    rdi,rax
      b8ec50:	ff 51 28             	call   QWORD PTR [rcx+0x28]
      b8ec53:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
      b8ec58:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
      b8ec5c:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      b8ec60:	49 8b 6f 60          	mov    rbp,QWORD PTR [r15+0x60]
      b8ec64:	4d 8b af 80 00 00 00 	mov    r13,QWORD PTR [r15+0x80]
      b8ec6b:	4d 8b 77 68          	mov    r14,QWORD PTR [r15+0x68]
      b8ec6f:	48 8d 35 8a 91 7a ff 	lea    rsi,[rip+0xffffffffff7a918a]        # 337e00 <_ZTSSt12bad_any_cast@@Base-0x583c8>
      b8ec76:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
      b8ec7b:	4c 89 ff             	mov    rdi,r15
      b8ec7e:	e8 fb ad ee ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      b8ec83:	49 8b 06             	mov    rax,QWORD PTR [r14]
      b8ec86:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
      b8ec8b:	4c 89 f6             	mov    rsi,r14
      b8ec8e:	4c 89 fa             	mov    rdx,r15
      b8ec91:	ff 50 18             	call   QWORD PTR [rax+0x18]
      b8ec94:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      b8ec97:	48 89 df             	mov    rdi,rbx
      b8ec9a:	ff 50 40             	call   QWORD PTR [rax+0x40]
      b8ec9d:	49 89 c7             	mov    r15,rax
      b8eca0:	6a 18                	push   0x18
      b8eca2:	5f                   	pop    rdi
      b8eca3:	e8 58 f2 c5 00       	call   17edf00 <_Znwm@plt>
      b8eca8:	48 89 c3             	mov    rbx,rax
      b8ecab:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
      b8ecaf:	48 8d 05 12 f7 c7 00 	lea    rax,[rip+0xc7f712]        # 180e3c8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4088>
      b8ecb6:	48 89 03             	mov    QWORD PTR [rbx],rax
      b8ecb9:	48 89 d8             	mov    rax,rbx
      b8ecbc:	48 83 c0 10          	add    rax,0x10
      b8ecc0:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      b8ecc5:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
      b8ecca:	bf a8 00 00 00       	mov    edi,0xa8
      b8eccf:	48 89 5c 24 18       	mov    QWORD PTR [rsp+0x18],rbx
      b8ecd4:	e8 27 f2 c5 00       	call   17edf00 <_Znwm@plt>
      b8ecd9:	49 89 c4             	mov    r12,rax
      b8ecdc:	48 8d 05 25 f7 c7 00 	lea    rax,[rip+0xc7f725]        # 180e408 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x40c8>
      b8ece3:	49 89 04 24          	mov    QWORD PTR [r12],rax
      b8ece7:	48 8d 05 4a f7 c7 00 	lea    rax,[rip+0xc7f74a]        # 180e438 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x40f8>
      b8ecee:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
      b8ecf3:	49 89 6c 24 10       	mov    QWORD PTR [r12+0x10],rbp
      b8ecf8:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
      b8ecfc:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
      b8ed01:	4d 89 6c 24 20       	mov    QWORD PTR [r12+0x20],r13
      b8ed06:	49 8d 7c 24 28       	lea    rdi,[r12+0x28]
      b8ed0b:	48 8b 74 24 58       	mov    rsi,QWORD PTR [rsp+0x58]
      b8ed10:	e8 91 ab a5 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
      b8ed15:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
      b8ed1c:	00 
      b8ed1d:	83 26 00             	and    DWORD PTR [rsi],0x0
      b8ed20:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      b8ed25:	e8 87 fa f4 ff       	call   ade7b1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b751>
      b8ed2a:	4c 8d 74 24 70       	lea    r14,[rsp+0x70]
      b8ed2f:	41 0f 28 06          	movaps xmm0,XMMWORD PTR [r14]
      b8ed33:	41 0f 11 44 24 38    	movups XMMWORD PTR [r12+0x38],xmm0
      b8ed39:	31 ff                	xor    edi,edi
      b8ed3b:	e8 46 f7 f0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b8ed40:	49 8d 7c 24 48       	lea    rdi,[r12+0x48]
      b8ed45:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
      b8ed49:	e8 a8 ac c4 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      b8ed4e:	49 8d 7c 24 58       	lea    rdi,[r12+0x58]
      b8ed53:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
      b8ed58:	e8 99 ac c4 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      b8ed5d:	0f 57 c0             	xorps  xmm0,xmm0
      b8ed60:	41 0f 11 44 24 68    	movups XMMWORD PTR [r12+0x68],xmm0
      b8ed66:	49 8d 84 24 80 00 00 	lea    rax,[r12+0x80]
      b8ed6d:	00 
      b8ed6e:	41 0f 11 84 24 80 00 	movups XMMWORD PTR [r12+0x80],xmm0
      b8ed75:	00 00 
      b8ed77:	49 89 44 24 78       	mov    QWORD PTR [r12+0x78],rax
      b8ed7c:	48 8d 35 65 d5 7b ff 	lea    rsi,[rip+0xffffffffff7bd565]        # 34c2e8 <_ZTSSt12bad_any_cast@@Base-0x43ee0>
      b8ed83:	4c 89 f7             	mov    rdi,r14
      b8ed86:	e8 f3 ac ee ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      b8ed8b:	4c 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],r15
      b8ed90:	49 8d bc 24 90 00 00 	lea    rdi,[r12+0x90]
      b8ed97:	00 
      b8ed98:	4c 8d 74 24 70       	lea    r14,[rsp+0x70]
      b8ed9d:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
      b8eda2:	4c 89 ee             	mov    rsi,r13
      b8eda5:	4c 89 f2             	mov    rdx,r14
      b8eda8:	e8 6d 29 c3 00       	call   17c171a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175886>
      b8edad:	4c 89 f7             	mov    rdi,r14
      b8edb0:	e8 db f0 c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b8edb5:	48 b8 00 00 00 00 00 	movabs rax,0x8000000000000000
      b8edbc:	00 00 80 
      b8edbf:	49 89 84 24 a0 00 00 	mov    QWORD PTR [r12+0xa0],rax
      b8edc6:	00 
      b8edc7:	4c 89 e7             	mov    rdi,r12
      b8edca:	e8 b1 02 00 00       	call   b8f080 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc020>
      b8edcf:	49 8b 5c 24 10       	mov    rbx,QWORD PTR [r12+0x10]
      b8edd4:	4c 8d 74 24 68       	lea    r14,[rsp+0x68]
      b8edd9:	4d 89 26             	mov    QWORD PTR [r14],r12
      b8eddc:	48 8d 2d ae e2 f0 ff 	lea    rbp,[rip+0xfffffffffff0e2ae]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      b8ede3:	48 8d 0d 5c 08 00 00 	lea    rcx,[rip+0x85c]        # b8f646 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc5e6>
      b8edea:	4c 8d 6c 24 70       	lea    r13,[rsp+0x70]
      b8edef:	6a 08                	push   0x8
      b8edf1:	41 5f                	pop    r15
      b8edf3:	4c 89 ef             	mov    rdi,r13
      b8edf6:	48 89 ee             	mov    rsi,rbp
      b8edf9:	31 d2                	xor    edx,edx
      b8edfb:	4d 89 f0             	mov    r8,r14
      b8edfe:	4d 89 f9             	mov    r9,r15
      b8ee01:	e8 8e b9 c4 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      b8ee06:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
      b8ee09:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      b8ee0c:	48 8d 9c 24 b0 00 00 	lea    rbx,[rsp+0xb0]
      b8ee13:	00 
      b8ee14:	48 89 df             	mov    rdi,rbx
      b8ee17:	4c 89 ea             	mov    rdx,r13
      b8ee1a:	ff 50 10             	call   QWORD PTR [rax+0x10]
      b8ee1d:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
      b8ee21:	48 89 de             	mov    rsi,rbx
      b8ee24:	e8 c9 ad c4 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
      b8ee29:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      b8ee2d:	e8 54 f6 f0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b8ee32:	4c 89 ef             	mov    rdi,r13
      b8ee35:	e8 ae b9 c4 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      b8ee3a:	4d 89 26             	mov    QWORD PTR [r14],r12
      b8ee3d:	48 8d 0d ea 08 00 00 	lea    rcx,[rip+0x8ea]        # b8f72e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdc6ce>
      b8ee44:	48 8d 5c 24 70       	lea    rbx,[rsp+0x70]
      b8ee49:	4c 8d 44 24 68       	lea    r8,[rsp+0x68]
      b8ee4e:	48 89 df             	mov    rdi,rbx
      b8ee51:	48 89 ee             	mov    rsi,rbp
      b8ee54:	31 d2                	xor    edx,edx
      b8ee56:	4d 89 f9             	mov    r9,r15
      b8ee59:	e8 36 b9 c4 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      b8ee5e:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
      b8ee63:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      b8ee66:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
      b8ee6d:	00 
      b8ee6e:	48 89 da             	mov    rdx,rbx
      b8ee71:	ff 50 40             	call   QWORD PTR [rax+0x40]
      b8ee74:	48 8d 9c 24 b0 00 00 	lea    rbx,[rsp+0xb0]
      b8ee7b:	00 
      b8ee7c:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      b8ee81:	48 89 de             	mov    rsi,rbx
      b8ee84:	e8 69 ad c4 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
      b8ee89:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      b8ee8d:	e8 f4 f5 f0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b8ee92:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      b8ee97:	e8 4c b9 c4 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      b8ee9c:	48 8b 74 24 38       	mov    rsi,QWORD PTR [rsp+0x38]
      b8eea1:	48 85 f6             	test   rsi,rsi
      b8eea4:	74 57                	je     b8eefd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbe9d>
      b8eea6:	49 8d 54 24 08       	lea    rdx,[r12+0x8]
      b8eeab:	48 8d 44 24 78       	lea    rax,[rsp+0x78]

    tracking [rsp+0x38] after 0xb8ec53
      b8ec53:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
        b8ec58:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
        b8ec5c:	48 89 04 24          	mov    QWORD PTR [rsp],rax
        b8ec60:	49 8b 6f 60          	mov    rbp,QWORD PTR [r15+0x60]
        b8ec64:	4d 8b af 80 00 00 00 	mov    r13,QWORD PTR [r15+0x80]
        b8ec6b:	4d 8b 77 68          	mov    r14,QWORD PTR [r15+0x68]
        b8ec6f:	48 8d 35 8a 91 7a ff 	lea    rsi,[rip+0xffffffffff7a918a]        # 337e00 <_ZTSSt12bad_any_cast@@Base-0x583c8>
        b8ec76:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
      b8ee9c:	48 8b 74 24 38       	mov    rsi,QWORD PTR [rsp+0x38]
        b8eea1:	48 85 f6             	test   rsi,rsi
        b8eea4:	74 57                	je     b8eefd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbe9d>
        b8eea6:	49 8d 54 24 08       	lea    rdx,[r12+0x8]
        b8eeab:	48 8d 44 24 78       	lea    rax,[rsp+0x78]
        b8eeb0:	0f 57 c0             	xorps  xmm0,xmm0
        b8eeb3:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
        b8eeb6:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax

## c7d4 +0x30: call 0xc7d49b, FDE=(13096030, 13096412)
      c7d45e:	55                   	push   rbp
      c7d45f:	41 57                	push   r15
      c7d461:	41 56                	push   r14
      c7d463:	41 55                	push   r13
      c7d465:	41 54                	push   r12
      c7d467:	53                   	push   rbx
      c7d468:	48 83 ec 28          	sub    rsp,0x28
      c7d46c:	49 89 cf             	mov    r15,rcx
      c7d46f:	49 89 d6             	mov    r14,rdx
      c7d472:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
      c7d477:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      c7d47e:	00 00 
      c7d480:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      c7d485:	48 89 cf             	mov    rdi,rcx
      c7d488:	e8 4f 01 00 00       	call   c7d5dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ca57c>
      c7d48d:	4c 89 ff             	mov    rdi,r15
      c7d490:	e8 99 1b f1 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
      c7d495:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      c7d498:	48 89 c7             	mov    rdi,rax
      c7d49b:	ff 51 30             	call   QWORD PTR [rcx+0x30]
      c7d49e:	49 89 c4             	mov    r12,rax
      c7d4a1:	4c 89 ff             	mov    rdi,r15
      c7d4a4:	e8 f7 5e fd ff       	call   c533a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0340>
      c7d4a9:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      c7d4ac:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      c7d4b1:	48 89 c6             	mov    rsi,rax
      c7d4b4:	ff 51 48             	call   QWORD PTR [rcx+0x48]
      c7d4b7:	4d 8b ae 80 00 00 00 	mov    r13,QWORD PTR [r14+0x80]
      c7d4be:	4d 8b be 38 01 00 00 	mov    r15,QWORD PTR [r14+0x138]
      c7d4c5:	6a 78                	push   0x78
      c7d4c7:	5f                   	pop    rdi
      c7d4c8:	e8 33 0a b7 00       	call   17edf00 <_Znwm@plt>
      c7d4cd:	49 89 c6             	mov    r14,rax
      c7d4d0:	48 8d 68 10          	lea    rbp,[rax+0x10]
      c7d4d4:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      c7d4d9:	0f 57 c9             	xorps  xmm1,xmm1
      c7d4dc:	0f 29 4c 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm1
      c7d4e1:	31 db                	xor    ebx,ebx
      c7d4e3:	88 58 08             	mov    BYTE PTR [rax+0x8],bl
      c7d4e6:	48 8d 05 9b e2 b9 00 	lea    rax,[rip+0xb9e29b]        # 181b788 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11448>
      c7d4ed:	49 89 06             	mov    QWORD PTR [r14],rax
      c7d4f0:	48 8d 05 89 f3 b9 00 	lea    rax,[rip+0xb9f389]        # 181c880 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12540>
      c7d4f7:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
      c7d4fb:	4d 89 66 18          	mov    QWORD PTR [r14+0x18],r12
      c7d4ff:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
      c7d504:	4d 89 6e 30          	mov    QWORD PTR [r14+0x30],r13
      c7d508:	31 ff                	xor    edi,edi
      c7d50a:	e8 77 0f e2 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c7d50f:	4d 89 f4             	mov    r12,r14
      c7d512:	49 83 c4 38          	add    r12,0x38
      c7d516:	41 88 5e 40          	mov    BYTE PTR [r14+0x40],bl
      c7d51a:	48 8d 05 c7 3c bf 00 	lea    rax,[rip+0xbf3cc7]        # 18711e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d8d0>
      c7d521:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
      c7d525:	49 89 6e 48          	mov    QWORD PTR [r14+0x48],rbp
      c7d529:	48 8d 05 34 ef df ff 	lea    rax,[rip+0xffffffffffdfef34]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      c7d530:	49 89 46 58          	mov    QWORD PTR [r14+0x58],rax
      c7d534:	48 8d 05 cb 00 00 00 	lea    rax,[rip+0xcb]        # c7d606 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ca5a6>
      c7d53b:	49 89 46 60          	mov    QWORD PTR [r14+0x60],rax
      c7d53f:	0f 57 c0             	xorps  xmm0,xmm0
      c7d542:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
      c7d547:	4c 89 e7             	mov    rdi,r12
      c7d54a:	4c 89 fe             	mov    rsi,r15
      c7d54d:	e8 f2 16 e5 ff       	call   acec44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bbe4>
      c7d552:	31 ff                	xor    edi,edi
      c7d554:	e8 2d 0f e2 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c7d559:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      c7d55e:	4c 89 33             	mov    QWORD PTR [rbx],r14
      c7d561:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      c7d566:	e8 1b 0f e2 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c7d56b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      c7d572:	00 00 
      c7d574:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      c7d579:	75 5c                	jne    c7d5d7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ca577>
      c7d57b:	48 89 d8             	mov    rax,rbx
      c7d57e:	48 83 c4 28          	add    rsp,0x28
      c7d582:	5b                   	pop    rbx
      c7d583:	41 5c                	pop    r12
      c7d585:	41 5d                	pop    r13
      c7d587:	41 5e                	pop    r14
      c7d589:	41 5f                	pop    r15
      c7d58b:	5d                   	pop    rbp
      c7d58c:	c3                   	ret
      c7d58d:	48 89 c3             	mov    rbx,rax
      c7d590:	4c 89 e7             	mov    rdi,r12
      c7d593:	e8 ec 64 e4 ff       	call   ac3a84 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10a24>
      c7d598:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
      c7d59c:	e8 e5 0e e2 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c7d5a1:	31 ff                	xor    edi,edi
      c7d5a3:	e8 de 0e e2 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c7d5a8:	4c 89 f7             	mov    rdi,r14
      c7d5ab:	e8 70 09 b7 00       	call   17edf20 <_ZdlPv@plt>
      c7d5b0:	eb 03                	jmp    c7d5b5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ca555>
      c7d5b2:	48 89 c3             	mov    rbx,rax
      c7d5b5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      c7d5ba:	e8 c7 0e e2 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c7d5bf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      c7d5c6:	00 00 
      c7d5c8:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      c7d5cd:	75 08                	jne    c7d5d7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ca577>
      c7d5cf:	48 89 df             	mov    rdi,rbx
      c7d5d2:	e8 f9 26 df ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      c7d5d7:	e8 d4 24 b7 00       	call   17efab0 <__stack_chk_fail@plt>

    tracking r12 after 0xc7d49e
      c7d49e:	49 89 c4             	mov    r12,rax
      c7d4fb:	4d 89 66 18          	mov    QWORD PTR [r14+0x18],r12
      c7d50f:	4d 89 f4             	mov    r12,r14
    [register redefined; stop]

## 11ee service184 +0x28 critical chain: FDE=(18802184, 18804775)
     11ee870:	48 89 df             	mov    rdi,rbx
     11ee873:	e8 f6 73 a1 ff       	call   c05c6e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x152c0e>
     11ee878:	49 89 c4             	mov    r12,rax
     11ee87b:	48 89 df             	mov    rdi,rbx
     11ee87e:	e8 69 00 ca ff       	call   e8e8ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55d02>
     11ee883:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     11ee888:	48 89 df             	mov    rdi,rbx
     11ee88b:	e8 c0 2e a2 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
     11ee890:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     11ee895:	48 89 df             	mov    rdi,rbx
     11ee898:	e8 1f 71 e8 ff       	call   10759bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23cdd2>
     11ee89d:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
     11ee8a4:	00 
     11ee8a5:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     11ee8aa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8ad:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee8b0:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
     11ee8b7:	00 
     11ee8b8:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
     11ee8bd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8c0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee8c3:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     11ee8ca:	00 
     11ee8cb:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     11ee8d0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8d3:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee8d6:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     11ee8db:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     11ee8e0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8e3:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11ee8e6:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     11ee8e9:	48 89 c7             	mov    rdi,rax
     11ee8ec:	ff 91 78 01 00 00    	call   QWORD PTR [rcx+0x178]
     11ee8f2:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     11ee8f7:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     11ee8fc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8ff:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee902:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     11ee907:	49 8b 5d 68          	mov    rbx,QWORD PTR [r13+0x68]
     11ee90b:	48 8d 35 4d 8d 19 ff 	lea    rsi,[rip+0xffffffffff198d4d]        # 38765f <_ZTSSt12bad_any_cast@@Base-0x8b69>
     11ee912:	4c 8d bc 24 38 02 00 	lea    r15,[rsp+0x238]
     11ee919:	00 
     11ee91a:	4c 89 ff             	mov    rdi,r15
     11ee91d:	e8 5c b1 88 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     11ee922:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11ee925:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
     11ee92c:	00 
     11ee92d:	48 89 de             	mov    rsi,rbx
     11ee930:	4c 89 fa             	mov    rdx,r15
     11ee933:	ff 50 18             	call   QWORD PTR [rax+0x18]
     11ee936:	49 8b 9d 80 00 00 00 	mov    rbx,QWORD PTR [r13+0x80]
     11ee93d:	4d 8b bd 98 00 00 00 	mov    r15,QWORD PTR [r13+0x98]
     11ee944:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     11ee948:	48 8d bc 24 20 02 00 	lea    rdi,[rsp+0x220]
     11ee94f:	00 
     11ee950:	48 89 ee             	mov    rsi,rbp
     11ee953:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee956:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     11ee95a:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
     11ee961:	00 
     11ee962:	48 89 ee             	mov    rsi,rbp
     11ee965:	ff 50 38             	call   QWORD PTR [rax+0x38]
     11ee968:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     11ee96d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee970:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee973:	48 89 c5             	mov    rbp,rax
     11ee976:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
     11ee97b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee97e:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee981:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     11ee986:	49 8b 45 30          	mov    rax,QWORD PTR [r13+0x30]
     11ee98a:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     11ee98f:	49 8b 45 60          	mov    rax,QWORD PTR [r13+0x60]
     11ee993:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     11ee998:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     11ee99d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee9a0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9a3:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     11ee9a8:	49 8b 45 20          	mov    rax,QWORD PTR [r13+0x20]
     11ee9ac:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     11ee9b3:	00 
     11ee9b4:	49 8b 85 90 00 00 00 	mov    rax,QWORD PTR [r13+0x90]
     11ee9bb:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     11ee9c0:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
     11ee9c5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11ee9c8:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     11ee9cf:	00 
     11ee9d0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9d3:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11ee9d6:	4c 89 f7             	mov    rdi,r14
     11ee9d9:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9dc:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     11ee9e1:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11ee9e4:	4c 89 f7             	mov    rdi,r14
     11ee9e7:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9ea:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     11ee9f1:	00 
     11ee9f2:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     11ee9f7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee9fa:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9fd:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     11eea02:	4c 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r15
     11eea09:	00 
     11eea0a:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
     11eea11:	00 
     11eea12:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     11eea17:	48 8b 88 b0 00 00 00 	mov    rcx,QWORD PTR [rax+0xb0]
     11eea1e:	48 89 8c 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rcx
     11eea25:	00 
     11eea26:	48 8b 80 b8 00 00 00 	mov    rax,QWORD PTR [rax+0xb8]
     11eea2d:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     11eea32:	49 8b 45 40          	mov    rax,QWORD PTR [r13+0x40]
     11eea36:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
     11eea3d:	00 
     11eea3e:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     11eea42:	4c 89 e7             	mov    rdi,r12
     11eea45:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11eea48:	49 89 c6             	mov    r14,rax
     11eea4b:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     11eea4f:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     11eea56:	00 
     11eea57:	4c 89 e6             	mov    rsi,r12
     11eea5a:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11eea5d:	49 8b 9d 80 00 00 00 	mov    rbx,QWORD PTR [r13+0x80]
     11eea64:	bf 10 02 00 00       	mov    edi,0x210
     11eea69:	e8 92 f4 5f 00       	call   17edf00 <_Znwm@plt>
     11eea6e:	49 89 c7             	mov    r15,rax
     11eea71:	48 89 ac 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rbp
     11eea78:	00 
     11eea79:	0f 57 c0             	xorps  xmm0,xmm0
     11eea7c:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     11eea80:	48 8d 05 89 ce 66 00 	lea    rax,[rip+0x66ce89]        # 185b910 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17ff8>
     11eea87:	49 89 07             	mov    QWORD PTR [r15],rax
     11eea8a:	4d 8d 67 18          	lea    r12,[r15+0x18]
     11eea8e:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     11eea95:	00 
     11eea96:	48 8d b4 24 50 01 00 	lea    rsi,[rsp+0x150]
     11eea9d:	00 
     11eea9e:	ba b0 00 00 00       	mov    edx,0xb0
     11eeaa3:	e8 28 10 60 00       	call   17efad0 <memcpy@plt>
     11eeaa8:	4c 89 24 24          	mov    QWORD PTR [rsp],r12
     11eeaac:	4c 89 e7             	mov    rdi,r12
     11eeaaf:	e8 4e b3 5e 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     11eeab4:	4d 89 77 70          	mov    QWORD PTR [r15+0x70],r14
     11eeab8:	49 8d 7f 78          	lea    rdi,[r15+0x78]
     11eeabc:	48 8d b4 24 b0 02 00 	lea    rsi,[rsp+0x2b0]
     11eeac3:	00 
     11eeac4:	ba b0 00 00 00       	mov    edx,0xb0
     11eeac9:	e8 02 10 60 00       	call   17efad0 <memcpy@plt>
     11eeace:	49 89 9f 28 01 00 00 	mov    QWORD PTR [r15+0x128],rbx
     11eead5:	4d 8d b7 30 01 00 00 	lea    r14,[r15+0x130]
     11eeadc:	4d 89 b7 30 01 00 00 	mov    QWORD PTR [r15+0x130],r14
     11eeae3:	4d 89 b7 38 01 00 00 	mov    QWORD PTR [r15+0x138],r14
     11eeaea:	0f 57 c0             	xorps  xmm0,xmm0
     11eeaed:	41 0f 11 87 40 01 00 	movups XMMWORD PTR [r15+0x140],xmm0
     11eeaf4:	00 
     11eeaf5:	41 0f 11 87 50 01 00 	movups XMMWORD PTR [r15+0x150],xmm0
     11eeafc:	00 
     11eeafd:	49 83 a7 60 01 00 00 	and    QWORD PTR [r15+0x160],0x0
     11eeb04:	00 
     11eeb05:	41 bc 00 00 80 3f    	mov    r12d,0x3f800000
     11eeb0b:	45 89 a7 68 01 00 00 	mov    DWORD PTR [r15+0x168],r12d
     11eeb12:	b8 00 00 10 00       	mov    eax,0x100000
     11eeb17:	49 89 87 70 01 00 00 	mov    QWORD PTR [r15+0x170],rax
     11eeb1e:	49 89 87 78 01 00 00 	mov    QWORD PTR [r15+0x178],rax
     11eeb25:	49 83 a7 80 01 00 00 	and    QWORD PTR [r15+0x180],0x0
     11eeb2c:	00 
     11eeb2d:	49 8d af 88 01 00 00 	lea    rbp,[r15+0x188]
     11eeb34:	48 89 ef             	mov    rdi,rbp
     11eeb37:	48 89 de             	mov    rsi,rbx
     11eeb3a:	e8 83 2b 5d 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     11eeb3f:	49 8d 9f 98 01 00 00 	lea    rbx,[r15+0x198]
     11eeb46:	0f 57 c0             	xorps  xmm0,xmm0
     11eeb49:	41 0f 11 87 c8 01 00 	movups XMMWORD PTR [r15+0x1c8],xmm0
     11eeb50:	00 
     11eeb51:	41 0f 11 87 b8 01 00 	movups XMMWORD PTR [r15+0x1b8],xmm0
     11eeb58:	00 
     11eeb59:	41 0f 11 87 a8 01 00 	movups XMMWORD PTR [r15+0x1a8],xmm0
     11eeb60:	00 
     11eeb61:	41 0f 11 87 98 01 00 	movups XMMWORD PTR [r15+0x198],xmm0
     11eeb68:	00 
     11eeb69:	45 89 a7 d8 01 00 00 	mov    DWORD PTR [r15+0x1d8],r12d
     11eeb70:	41 83 a7 e0 01 00 00 	and    DWORD PTR [r15+0x1e0],0x0
     11eeb77:	00 
     11eeb78:	49 c7 87 e8 01 00 00 	mov    QWORD PTR [r15+0x1e8],0xa
     11eeb7f:	0a 00 00 00 
     11eeb83:	41 c7 87 f0 01 00 00 	mov    DWORD PTR [r15+0x1f0],0x3
     11eeb8a:	03 00 00 00 
     11eeb8e:	49 c7 87 f8 01 00 00 	mov    QWORD PTR [r15+0x1f8],0x5
     11eeb95:	05 00 00 00 
     11eeb99:	49 8d bf 00 02 00 00 	lea    rdi,[r15+0x200]
     11eeba0:	e8 85 6b 97 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     11eeba5:	31 ff                	xor    edi,edi
     11eeba7:	e8 70 f8 8a ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     11eebac:	49 8b 75 58          	mov    rsi,QWORD PTR [r13+0x58]
     11eebb0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11eebb3:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     11eebba:	00 
     11eebbb:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11eebbe:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     11eebc3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11eebc6:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11eebc9:	49 89 c6             	mov    r14,rax
     11eebcc:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     11eebd1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11eebd4:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11eebd7:	49 89 c4             	mov    r12,rax
     11eebda:	bf c0 5d 00 00       	mov    edi,0x5dc0
     11eebdf:	e8 1c f3 5f 00       	call   17edf00 <_Znwm@plt>
     11eebe4:	48 89 c7             	mov    rdi,rax
     11eebe7:	66 49 0f 6e c7       	movq   xmm0,r15
     11eebec:	f3 0f 7e 0c 24       	movq   xmm1,QWORD PTR [rsp]
     11eebf1:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
     11eebf5:	48 8b 8c 24 28 02 00 	mov    rcx,QWORD PTR [rsp+0x228]
     11eebfc:	00 
     11eebfd:	0f 28 84 24 20 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x220]
     11eec04:	00 
     11eec05:	0f 29 84 24 a0 02 00 	movaps XMMWORD PTR [rsp+0x2a0],xmm0
     11eec0c:	00 
     11eec0d:	0f 57 c0             	xorps  xmm0,xmm0
     11eec10:	0f 29 84 24 20 02 00 	movaps XMMWORD PTR [rsp+0x220],xmm0
     11eec17:	00 
     11eec18:	48 8b 94 24 18 02 00 	mov    rdx,QWORD PTR [rsp+0x218]
     11eec1f:	00 
     11eec20:	0f 28 94 24 10 02 00 	movaps xmm2,XMMWORD PTR [rsp+0x210]
     11eec27:	00 
     11eec28:	0f 29 94 24 90 02 00 	movaps XMMWORD PTR [rsp+0x290],xmm2
     11eec2f:	00 
     11eec30:	0f 29 84 24 10 02 00 	movaps XMMWORD PTR [rsp+0x210],xmm0
     11eec37:	00 
     11eec38:	48 8b b4 24 08 02 00 	mov    rsi,QWORD PTR [rsp+0x208]
     11eec3f:	00 
     11eec40:	0f 28 94 24 00 02 00 	movaps xmm2,XMMWORD PTR [rsp+0x200]
     11eec47:	00 
     11eec48:	0f 29 94 24 80 02 00 	movaps XMMWORD PTR [rsp+0x280],xmm2
     11eec4f:	00 
     11eec50:	0f 29 84 24 00 02 00 	movaps XMMWORD PTR [rsp+0x200],xmm0
     11eec57:	00 
     11eec58:	66 0f 7f 8c 24 70 02 	movdqa XMMWORD PTR [rsp+0x270],xmm1
     11eec5f:	00 00 
     11eec61:	49 8b 9d e0 00 00 00 	mov    rbx,QWORD PTR [r13+0xe0]
     11eec68:	41 0f 10 8d d8 00 00 	movups xmm1,XMMWORD PTR [r13+0xd8]
     11eec6f:	00 
     11eec70:	0f 29 8c 24 60 02 00 	movaps XMMWORD PTR [rsp+0x260],xmm1
     11eec77:	00 
     11eec78:	48 85 db             	test   rbx,rbx
     11eec7b:	4c 89 74 24 70       	mov    QWORD PTR [rsp+0x70],r14
     11eec80:	4c 89 e0             	mov    rax,r12
     11eec83:	74 35                	je     11eecba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3423e>
     11eec85:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
     11eec8a:	48 8b 9c 24 68 02 00 	mov    rbx,QWORD PTR [rsp+0x268]
     11eec91:	00 
     11eec92:	48 8b 8c 24 88 02 00 	mov    rcx,QWORD PTR [rsp+0x288]
     11eec99:	00 
     11eec9a:	48 89 0c 24          	mov    QWORD PTR [rsp],rcx
     11eec9e:	48 8b 8c 24 98 02 00 	mov    rcx,QWORD PTR [rsp+0x298]
     11eeca5:	00 
     11eeca6:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
     11eecab:	48 8b 8c 24 a8 02 00 	mov    rcx,QWORD PTR [rsp+0x2a8]
     11eecb2:	00 
     11eecb3:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     11eecb8:	eb 0e                	jmp    11eecc8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3424c>
     11eecba:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     11eecbf:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
     11eecc4:	48 89 34 24          	mov    QWORD PTR [rsp],rsi
     11eecc8:	4c 8b bc 24 c8 00 00 	mov    r15,QWORD PTR [rsp+0xc8]
     11eeccf:	00 
     11eecd0:	49 83 c7 38          	add    r15,0x38
     11eecd4:	4c 8b 5c 24 28       	mov    r11,QWORD PTR [rsp+0x28]
     11eecd9:	49 83 c3 10          	add    r11,0x10
     11eecdd:	48 8b ac 24 90 00 00 	mov    rbp,QWORD PTR [rsp+0x90]
     11eece4:	00 
     11eece5:	48 83 c5 10          	add    rbp,0x10
     11eece9:	4c 8b 94 24 d0 00 00 	mov    r10,QWORD PTR [rsp+0xd0]
     11eecf0:	00 
     11eecf1:	49 83 c2 0c          	add    r10,0xc
     11eecf5:	4c 8b b4 24 a8 00 00 	mov    r14,QWORD PTR [rsp+0xa8]
     11eecfc:	00 
     11eecfd:	49 81 c6 90 00 00 00 	add    r14,0x90
     11eed04:	4c 8b 64 24 20       	mov    r12,QWORD PTR [rsp+0x20]
     11eed09:	49 81 c4 f8 00 00 00 	add    r12,0xf8
     11eed10:	48 8b b4 24 f0 00 00 	mov    rsi,QWORD PTR [rsp+0xf0]
     11eed17:	00 
     11eed18:	48 83 c6 10          	add    rsi,0x10
     11eed1c:	48 8d 94 24 30 01 00 	lea    rdx,[rsp+0x130]
     11eed23:	00 
     11eed24:	48 8b 4a 10          	mov    rcx,QWORD PTR [rdx+0x10]
     11eed28:	48 89 8c 24 c0 02 00 	mov    QWORD PTR [rsp+0x2c0],rcx
     11eed2f:	00 
     11eed30:	0f 28 0a             	movaps xmm1,XMMWORD PTR [rdx]
     11eed33:	0f 29 8c 24 b0 02 00 	movaps XMMWORD PTR [rsp+0x2b0],xmm1
     11eed3a:	00 
     11eed3b:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
     11eed3e:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
     11eed43:	4c 8d ac 24 70 02 00 	lea    r13,[rsp+0x270]
     11eed4a:	00 
     11eed4b:	48 89 7c 24 78       	mov    QWORD PTR [rsp+0x78],rdi
     11eed50:	48 8b 94 24 c0 00 00 	mov    rdx,QWORD PTR [rsp+0xc0]
     11eed57:	00 
     11eed58:	48 8b 8c 24 20 01 00 	mov    rcx,QWORD PTR [rsp+0x120]
     11eed5f:	00 
     11eed60:	4c 8b 84 24 b8 00 00 	mov    r8,QWORD PTR [rsp+0xb8]
     11eed67:	00 
     11eed68:	4c 8b 8c 24 10 01 00 	mov    r9,QWORD PTR [rsp+0x110]
     11eed6f:	00 
     11eed70:	41 57                	push   r15
     11eed72:	50                   	push   rax
     11eed73:	ff b4 24 80 00 00 00 	push   QWORD PTR [rsp+0x80]
     11eed7a:	4c 8d bc 24 c8 02 00 	lea    r15,[rsp+0x2c8]
     11eed81:	00 
     11eed82:	41 57                	push   r15
     11eed84:	48 8d 84 24 80 02 00 	lea    rax,[rsp+0x280]
     11eed8b:	00 
     11eed8c:	50                   	push   rax
     11eed8d:	41 55                	push   r13
     11eed8f:	ff b4 24 b8 00 00 00 	push   QWORD PTR [rsp+0xb8]
     11eed96:	41 53                	push   r11
     11eed98:	55                   	push   rbp
     11eed99:	41 52                	push   r10
     11eed9b:	ff 74 24 68          	push   QWORD PTR [rsp+0x68]
     11eed9f:	41 56                	push   r14
     11eeda1:	41 54                	push   r12
     11eeda3:	48 8d 84 24 e8 02 00 	lea    rax,[rsp+0x2e8]
     11eedaa:	00 
     11eedab:	50                   	push   rax
     11eedac:	ff b4 24 20 01 00 00 	push   QWORD PTR [rsp+0x120]
     11eedb3:	ff b4 24 a8 00 00 00 	push   QWORD PTR [rsp+0xa8]
     11eedba:	ff b4 24 b8 00 00 00 	push   QWORD PTR [rsp+0xb8]
     11eedc1:	ff b4 24 c8 00 00 00 	push   QWORD PTR [rsp+0xc8]
     11eedc8:	ff b4 24 78 01 00 00 	push   QWORD PTR [rsp+0x178]
     11eedcf:	ff b4 24 e0 00 00 00 	push   QWORD PTR [rsp+0xe0]
     11eedd6:	ff b4 24 98 01 00 00 	push   QWORD PTR [rsp+0x198]
     11eeddd:	ff b4 24 f8 00 00 00 	push   QWORD PTR [rsp+0xf8]
     11eede4:	ff b4 24 b0 01 00 00 	push   QWORD PTR [rsp+0x1b0]
     11eedeb:	ff b4 24 c0 01 00 00 	push   QWORD PTR [rsp+0x1c0]
     11eedf2:	ff b4 24 40 01 00 00 	push   QWORD PTR [rsp+0x140]
     11eedf9:	ff b4 24 e0 01 00 00 	push   QWORD PTR [rsp+0x1e0]
     11eee00:	48 8d 84 24 60 03 00 	lea    rax,[rsp+0x360]
     11eee07:	00 
     11eee08:	50                   	push   rax
     11eee09:	48 8d 84 24 78 03 00 	lea    rax,[rsp+0x378]
     11eee10:	00 
     11eee11:	50                   	push   rax
     11eee12:	ff b4 24 78 01 00 00 	push   QWORD PTR [rsp+0x178]
     11eee19:	ff b4 24 10 02 00 00 	push   QWORD PTR [rsp+0x210]
     11eee20:	ff b4 24 c8 01 00 00 	push   QWORD PTR [rsp+0x1c8]
     11eee27:	ff b4 24 98 01 00 00 	push   QWORD PTR [rsp+0x198]
     11eee2e:	48 8d 84 24 50 03 00 	lea    rax,[rsp+0x350]
     11eee35:	00 
     11eee36:	50                   	push   rax
     11eee37:	ff b4 24 68 01 00 00 	push   QWORD PTR [rsp+0x168]
     11eee3e:	ff b4 24 68 01 00 00 	push   QWORD PTR [rsp+0x168]
     11eee45:	ff b4 24 80 01 00 00 	push   QWORD PTR [rsp+0x180]
     11eee4c:	e8 e3 04 00 00       	call   11ef334 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x348b8>
     11eee51:	48 81 c4 20 01 00 00 	add    rsp,0x120
     11eee58:	4c 89 ff             	mov    rdi,r15
     11eee5b:	e8 30 f0 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11eee60:	48 89 df             	mov    rdi,rbx
     11eee63:	e8 1e f6 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eee68:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     11eee6c:	e8 15 f6 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eee71:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     11eee75:	e8 0c f6 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eee7a:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     11eee7f:	e8 02 f6 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eee84:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     11eee89:	e8 f8 f5 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eee8e:	48 8b 9c 24 e0 00 00 	mov    rbx,QWORD PTR [rsp+0xe0]
     11eee95:	00 
     11eee96:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
     11eee9b:	48 89 03             	mov    QWORD PTR [rbx],rax
     11eee9e:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     11eeea5:	00 
     11eeea6:	e8 e5 ef 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11eeeab:	31 ff                	xor    edi,edi
     11eeead:	e8 d4 f5 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eeeb2:	48 8b bc 24 08 02 00 	mov    rdi,QWORD PTR [rsp+0x208]
     11eeeb9:	00 
     11eeeba:	e8 c7 f5 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eeebf:	48 8b bc 24 18 02 00 	mov    rdi,QWORD PTR [rsp+0x218]
     11eeec6:	00 
     11eeec7:	e8 ba f5 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eeecc:	48 8b bc 24 28 02 00 	mov    rdi,QWORD PTR [rsp+0x228]
     11eeed3:	00 
     11eeed4:	e8 ad f5 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eeed9:	48 8b bc 24 58 02 00 	mov    rdi,QWORD PTR [rsp+0x258]
     11eeee0:	00 
     11eeee1:	e8 a0 f5 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eeee6:	48 8d bc 24 38 02 00 	lea    rdi,[rsp+0x238]
     11eeeed:	00 
     11eeeee:	e8 9d ef 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11eeef3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11eeefa:	00 00 
     11eeefc:	48 3b 84 24 60 03 00 	cmp    rax,QWORD PTR [rsp+0x360]
     11eef03:	00 
     11eef04:	0f 85 18 01 00 00    	jne    11ef022 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x345a6>
     11eef0a:	48 89 d8             	mov    rax,rbx
     11eef0d:	48 81 c4 68 03 00 00 	add    rsp,0x368
     11eef14:	5b                   	pop    rbx
     11eef15:	41 5c                	pop    r12
     11eef17:	41 5d                	pop    r13
     11eef19:	41 5e                	pop    r14
     11eef1b:	41 5f                	pop    r15
     11eef1d:	5d                   	pop    rbp
     11eef1e:	c3                   	ret
     11eef1f:	e8 9b b0 88 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
     11eef24:	e8 96 b0 88 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
     11eef29:	e8 91 b0 88 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
     11eef2e:	e8 8c b0 88 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
     11eef33:	e8 87 b0 88 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
     11eef38:	e8 82 b0 88 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
     11eef3d:	e8 7d b0 88 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
     11eef42:	49 89 c5             	mov    r13,rax
     11eef45:	eb 70                	jmp    11eefb7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3453b>
     11eef47:	49 89 c5             	mov    r13,rax
     11eef4a:	4c 89 ff             	mov    rdi,r15
     11eef4d:	48 81 c7 b8 01 00 00 	add    rdi,0x1b8
     11eef54:	e8 77 01 00 00       	call   11ef0d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34654>
     11eef59:	48 89 df             	mov    rdi,rbx
     11eef5c:	e8 91 01 00 00       	call   11ef0f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34676>
     11eef61:	48 89 ef             	mov    rdi,rbp
     11eef64:	e8 dd 27 5d 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
     11eef69:	4c 89 f7             	mov    rdi,r14
     11eef6c:	e8 9b 01 00 00       	call   11ef10c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34690>
     11eef71:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     11eef75:	e8 ec ae 5e 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     11eef7a:	4c 89 ff             	mov    rdi,r15
     11eef7d:	e8 8e f0 5f 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     11eef82:	4c 89 ff             	mov    rdi,r15
     11eef85:	e8 92 f4 8a ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     11eef8a:	eb 3a                	jmp    11eefc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3454a>
     11eef8c:	48 89 c7             	mov    rdi,rax
     11eef8f:	e8 11 ab 88 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     11eef94:	eb 2d                	jmp    11eefc3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34547>
     11eef96:	eb 00                	jmp    11eef98 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3451c>
     11eef98:	49 89 c5             	mov    r13,rax
     11eef9b:	eb 36                	jmp    11eefd3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34557>
     11eef9d:	49 89 c5             	mov    r13,rax
     11eefa0:	eb 3e                	jmp    11eefe0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34564>
     11eefa2:	49 89 c5             	mov    r13,rax
     11eefa5:	eb 46                	jmp    11eefed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34571>
     11eefa7:	49 89 c5             	mov    r13,rax
     11eefaa:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     11eefb1:	00 
     11eefb2:	e8 d9 ee 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11eefb7:	4c 89 ff             	mov    rdi,r15
     11eefba:	e8 c7 f4 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eefbf:	eb 05                	jmp    11eefc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3454a>
     11eefc1:	eb 00                	jmp    11eefc3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34547>
     11eefc3:	49 89 c5             	mov    r13,rax
     11eefc6:	48 8b bc 24 08 02 00 	mov    rdi,QWORD PTR [rsp+0x208]
     11eefcd:	00 
     11eefce:	e8 b3 f4 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eefd3:	48 8b bc 24 18 02 00 	mov    rdi,QWORD PTR [rsp+0x218]
     11eefda:	00 
     11eefdb:	e8 a6 f4 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eefe0:	48 8b bc 24 28 02 00 	mov    rdi,QWORD PTR [rsp+0x228]
     11eefe7:	00 
     11eefe8:	e8 99 f4 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eefed:	48 8b bc 24 58 02 00 	mov    rdi,QWORD PTR [rsp+0x258]
     11eeff4:	00 
     11eeff5:	e8 8c f4 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eeffa:	48 8d bc 24 38 02 00 	lea    rdi,[rsp+0x238]

    tracking [rsp+0x60] after 0x11ee902
     11ee902:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
       11ee907:	49 8b 5d 68          	mov    rbx,QWORD PTR [r13+0x68]
       11ee90b:	48 8d 35 4d 8d 19 ff 	lea    rsi,[rip+0xffffffffff198d4d]        # 38765f <_ZTSSt12bad_any_cast@@Base-0x8b69>
       11ee912:	4c 8d bc 24 38 02 00 	lea    r15,[rsp+0x238]
       11ee919:	00 
       11ee91a:	4c 89 ff             	mov    rdi,r15
       11ee91d:	e8 5c b1 88 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
       11ee922:	48 8b 03             	mov    rax,QWORD PTR [rbx]

### All later rsp+0x60 references
#### 0x11ee902
     11ee8e9:	48 89 c7             	mov    rdi,rax
     11ee8ec:	ff 91 78 01 00 00    	call   QWORD PTR [rcx+0x178]
     11ee8f2:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     11ee8f7:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     11ee8fc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8ff:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee902:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     11ee907:	49 8b 5d 68          	mov    rbx,QWORD PTR [r13+0x68]
     11ee90b:	48 8d 35 4d 8d 19 ff 	lea    rsi,[rip+0xffffffffff198d4d]        # 38765f <_ZTSSt12bad_any_cast@@Base-0x8b69>
     11ee912:	4c 8d bc 24 38 02 00 	lea    r15,[rsp+0x238]
     11ee919:	00 
     11ee91a:	4c 89 ff             	mov    rdi,r15
     11ee91d:	e8 5c b1 88 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     11ee922:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11ee925:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
     11ee92c:	00 
     11ee92d:	48 89 de             	mov    rsi,rbx
     11ee930:	4c 89 fa             	mov    rdx,r15
     11ee933:	ff 50 18             	call   QWORD PTR [rax+0x18]
     11ee936:	49 8b 9d 80 00 00 00 	mov    rbx,QWORD PTR [r13+0x80]

## Secondary dispatcher constructor window
     11f3fc4:	f3 41 0f 6f 07       	movdqu xmm0,XMMWORD PTR [r15]
     11f3fc9:	f3 0f 7f 83 b8 4a 00 	movdqu XMMWORD PTR [rbx+0x4ab8],xmm0
     11f3fd0:	00 
     11f3fd1:	66 0f ef c0          	pxor   xmm0,xmm0
     11f3fd5:	f3 41 0f 7f 07       	movdqu XMMWORD PTR [r15],xmm0
     11f3fda:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     11f3fdf:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
     11f3fe6:	00 
     11f3fe7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f3fea:	4c 89 e6             	mov    rsi,r12
     11f3fed:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11f3ff0:	48 8b b4 24 50 06 00 	mov    rsi,QWORD PTR [rsp+0x650]
     11f3ff7:	00 
     11f3ff8:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11f3ffb:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
     11f4002:	00 
     11f4003:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
     11f4009:	4c 8b b4 24 a0 06 00 	mov    r14,QWORD PTR [rsp+0x6a0]
     11f4010:	00 
     11f4011:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11f4014:	48 8d 94 24 e0 04 00 	lea    rdx,[rsp+0x4e0]
     11f401b:	00 
     11f401c:	4c 89 f7             	mov    rdi,r14
     11f401f:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     11f4024:	ff 50 48             	call   QWORD PTR [rax+0x48]
     11f4027:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
     11f402e:	00 
     11f402f:	e8 08 24 00 00       	call   11f643c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b9c0>
     11f4034:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11f4037:	4c 89 f7             	mov    rdi,r14
     11f403a:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f403d:	49 89 c6             	mov    r14,rax
     11f4040:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]
     11f4045:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11f4048:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
     11f404f:	00 
     11f4050:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11f4053:	4c 8b ac 24 80 05 00 	mov    r13,QWORD PTR [rsp+0x580]
     11f405a:	00 
     11f405b:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
     11f4062:	00 
     11f4063:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f4066:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f4069:	49 89 c7             	mov    r15,rax
     11f406c:	48 8b bc 24 68 06 00 	mov    rdi,QWORD PTR [rsp+0x668]
     11f4073:	00 
     11f4074:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f4077:	ff 50 38             	call   QWORD PTR [rax+0x38]
     11f407a:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     11f407f:	4c 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],r15
     11f4084:	48 8b 83 d0 0e 00 00 	mov    rax,QWORD PTR [rbx+0xed0]
     11f408b:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     11f4090:	48 83 a4 24 20 05 00 	and    QWORD PTR [rsp+0x520],0x0
     11f4097:	00 00 
     11f4099:	48 8d 05 40 3d 7e ff 	lea    rax,[rip+0xffffffffff7e3d40]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
     11f40a0:	48 89 84 24 30 05 00 	mov    QWORD PTR [rsp+0x530],rax
     11f40a7:	00 
     11f40a8:	48 8d 05 cb ed 95 ff 	lea    rax,[rip+0xffffffffff95edcb]        # b52e7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9fe1a>
     11f40af:	48 89 84 24 38 05 00 	mov    QWORD PTR [rsp+0x538],rax
     11f40b6:	00 
     11f40b7:	48 8b 83 28 1a 00 00 	mov    rax,QWORD PTR [rbx+0x1a28]
     11f40be:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     11f40c5:	00 
     11f40c6:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
     11f40cb:	41 0f b6 84 24 b1 00 	movzx  eax,BYTE PTR [r12+0xb1]
     11f40d2:	00 00 
     11f40d4:	89 84 24 80 00 00 00 	mov    DWORD PTR [rsp+0x80],eax
     11f40db:	bf 98 20 00 00       	mov    edi,0x2098
     11f40e0:	e8 1b 9e 5f 00       	call   17edf00 <_Znwm@plt>
     11f40e5:	49 89 c7             	mov    r15,rax
     11f40e8:	48 8d ab b8 4a 00 00 	lea    rbp,[rbx+0x4ab8]
     11f40ef:	66 0f ef c0          	pxor   xmm0,xmm0
     11f40f3:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     11f40f8:	48 8d 05 81 79 66 00 	lea    rax,[rip+0x667981]        # 185ba80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18168>
     11f40ff:	49 89 07             	mov    QWORD PTR [r15],rax
     11f4102:	41 8a 84 24 88 00 00 	mov    al,BYTE PTR [r12+0x88]
     11f4109:	00 
     11f410a:	88 44 24 60          	mov    BYTE PTR [rsp+0x60],al
     11f410e:	41 8a 84 24 89 00 00 	mov    al,BYTE PTR [r12+0x89]
     11f4115:	00 
     11f4116:	88 84 24 b0 00 00 00 	mov    BYTE PTR [rsp+0xb0],al
     11f411d:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
     11f4124:	00 
     11f4125:	48 8d b4 24 20 05 00 	lea    rsi,[rsp+0x520]
     11f412c:	00 
     11f412d:	e8 34 1a 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
     11f4132:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
     11f4139:	00 
     11f413a:	48 89 ee             	mov    rsi,rbp
     11f413d:	e8 fe 9d 5f 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     11f4142:	48 8d 05 3f 7e 66 00 	lea    rax,[rip+0x667e3f]        # 185bf88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18670>
     11f4149:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     11f414d:	48 8b 84 24 50 06 00 	mov    rax,QWORD PTR [rsp+0x650]
     11f4154:	00 
     11f4155:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
     11f4159:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     11f415e:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
     11f4162:	48 8d 83 88 5d 00 00 	lea    rax,[rbx+0x5d88]
     11f4169:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
     11f416d:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     11f4172:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
     11f4176:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
     11f417d:	00 
     11f417e:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
     11f4182:	4d 89 77 48          	mov    QWORD PTR [r15+0x48],r14
     11f4186:	48 8d 83 f0 19 00 00 	lea    rax,[rbx+0x19f0]
     11f418d:	49 89 47 50          	mov    QWORD PTR [r15+0x50],rax

## Downstream +0x68 execution branch
     12044d8:	48 8d 35 ab 2b 14 ff 	lea    rsi,[rip+0xffffffffff142bab]        # 34708a <_ZTSSt12bad_any_cast@@Base-0x4913e>
     12044df:	48 89 df             	mov    rdi,rbx
     12044e2:	e8 68 73 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     12044e7:	84 c0                	test   al,al
     12044e9:	74 4b                	je     1204536 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49aba>
     12044eb:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
     12044ef:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12044f2:	ff 50 68             	call   QWORD PTR [rax+0x68]
     12044f5:	e8 cd 63 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
     12044fa:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
     1204501:	00 
     1204502:	83 60 e8 00          	and    DWORD PTR [rax-0x18],0x0
     1204506:	48 8d 0d 43 e9 77 00 	lea    rcx,[rip+0x77e943]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
     120450d:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
     1204511:	0f 57 c0             	xorps  xmm0,xmm0
     1204514:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     1204517:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     120451b:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1204520:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
     1204524:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
     120452b:	00 
     120452c:	e8 5f 98 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
     1204531:	e9 53 fe ff ff       	jmp    1204389 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4990d>

## Other +0x68 virtual calls in 0x11e0000..0x1210000
### 0x11fb62b, FDE=(18855408, 18855557)
     11fb5f5:	48 81 ec c0 00 00 00 	sub    rsp,0xc0
     11fb5fc:	48 89 d3             	mov    rbx,rdx
     11fb5ff:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11fb606:	00 00 
     11fb608:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     11fb60f:	00 
     11fb610:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
     11fb614:	49 89 e7             	mov    r15,rsp
     11fb617:	4c 89 ff             	mov    rdi,r15
     11fb61a:	e8 43 c4 46 00       	call   1667a62 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bbce>
     11fb61f:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11fb622:	4c 89 f7             	mov    rdi,r14
     11fb625:	4c 89 fe             	mov    rsi,r15
     11fb628:	48 89 da             	mov    rdx,rbx
     11fb62b:	ff 50 68             	call   QWORD PTR [rax+0x68]
     11fb62e:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     11fb633:	e8 a0 09 47 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     11fb638:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11fb63f:	00 00 
     11fb641:	48 3b 84 24 b8 00 00 	cmp    rax,QWORD PTR [rsp+0xb8]
     11fb648:	00 
     11fb649:	75 35                	jne    11fb680 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40c04>
     11fb64b:	48 81 c4 c0 00 00 00 	add    rsp,0xc0
     11fb652:	5b                   	pop    rbx
     11fb653:	41 5e                	pop    r14
     11fb655:	41 5f                	pop    r15
     11fb657:	c3                   	ret
     11fb658:	48 89 c3             	mov    rbx,rax
     11fb65b:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     11fb660:	e8 73 09 47 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     11fb665:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11fb66c:	00 00 
     11fb66e:	48 3b 84 24 b8 00 00 	cmp    rax,QWORD PTR [rsp+0xb8]
     11fb675:	00 

### 0x11fd04a, FDE=(18861914, 18862325)
     11fd017:	00 
     11fd018:	e8 4d cf 87 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     11fd01d:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     11fd022:	e8 09 9d 8a ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     11fd027:	4d 8b 7f 08          	mov    r15,QWORD PTR [r15+0x8]
     11fd02b:	4c 8d a4 24 98 00 00 	lea    r12,[rsp+0x98]
     11fd032:	00 
     11fd033:	4c 89 e7             	mov    rdi,r12
     11fd036:	4c 89 f6             	mov    rsi,r14
     11fd039:	e8 04 aa 46 00       	call   1667a42 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bbae>
     11fd03e:	49 8b 07             	mov    rax,QWORD PTR [r15]
     11fd041:	4c 89 ff             	mov    rdi,r15
     11fd044:	4c 89 e6             	mov    rsi,r12
     11fd047:	48 89 da             	mov    rdx,rbx
     11fd04a:	ff 50 68             	call   QWORD PTR [rax+0x68]
     11fd04d:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     11fd054:	00 
     11fd055:	e8 7e ef 46 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     11fd05a:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     11fd05f:	e8 aa 2f 45 00       	call   165000e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x417a>
     11fd064:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11fd06b:	00 00 
     11fd06d:	48 3b 84 24 80 01 00 	cmp    rax,QWORD PTR [rsp+0x180]
     11fd074:	00 
     11fd075:	75 79                	jne    11fd0f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42674>
     11fd077:	48 81 c4 88 01 00 00 	add    rsp,0x188
     11fd07e:	5b                   	pop    rbx
     11fd07f:	41 5c                	pop    r12
     11fd081:	41 5e                	pop    r14
     11fd083:	41 5f                	pop    r15
     11fd085:	c3                   	ret
     11fd086:	48 89 c3             	mov    rbx,rax
     11fd089:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     11fd090:	00 

### 0x1202079, FDE=(18881894, 18883288)
     1202042:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1202049:	00 
     120204a:	e8 83 79 94 ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     120204f:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1202056:	00 
     1202057:	e8 8a 1d 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     120205c:	45 84 e4             	test   r12b,r12b
     120205f:	74 4c                	je     12020ad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x47631>
     1202061:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
     1202065:	49 8d 8f e0 00 00 00 	lea    rcx,[r15+0xe0]
     120206c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     120206f:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1202076:	00 
     1202077:	89 da                	mov    edx,ebx
     1202079:	ff 50 68             	call   QWORD PTR [rax+0x68]
     120207c:	48 83 bc 24 b0 00 00 	cmp    QWORD PTR [rsp+0xb0],0x0
     1202083:	00 00 
     1202085:	74 19                	je     12020a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x47624>
     1202087:	48 8d 94 24 a8 00 00 	lea    rdx,[rsp+0xa8]
     120208e:	00 
     120208f:	48 8b 72 f8          	mov    rsi,QWORD PTR [rdx-0x8]
     1202093:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     120209a:	00 
     120209b:	e8 32 79 94 ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     12020a0:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     12020a7:	00 
     12020a8:	e8 39 1d 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     12020ad:	41 80 be c4 00 00 00 	cmp    BYTE PTR [r14+0xc4],0x0
     12020b4:	00 
     12020b5:	74 4f                	je     1202106 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4768a>
     12020b7:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
     12020bb:	f3 41 0f 10 86 c0 00 	movss  xmm0,DWORD PTR [r14+0xc0]
     12020c2:	00 00 
     12020c4:	48 8b 06             	mov    rax,QWORD PTR [rsi]

### 0x120338e, FDE=(18884874, 18890725)
     1203358:	00 
     1203359:	48 83 a4 24 68 02 00 	and    QWORD PTR [rsp+0x268],0x0
     1203360:	00 00 
     1203362:	0f 28 8c 24 70 02 00 	movaps xmm1,XMMWORD PTR [rsp+0x270]
     1203369:	00 
     120336a:	0f 29 4e 30          	movaps XMMWORD PTR [rsi+0x30],xmm1
     120336e:	48 8b 84 24 80 02 00 	mov    rax,QWORD PTR [rsp+0x280]
     1203375:	00 
     1203376:	48 89 46 40          	mov    QWORD PTR [rsi+0x40],rax
     120337a:	0f 29 84 24 70 02 00 	movaps XMMWORD PTR [rsp+0x270],xmm0
     1203381:	00 
     1203382:	48 83 a4 24 80 02 00 	and    QWORD PTR [rsp+0x280],0x0
     1203389:	00 00 
     120338b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     120338e:	ff 50 68             	call   QWORD PTR [rax+0x68]
     1203391:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     1203398:	00 
     1203399:	e8 ca 3a 00 00       	call   1206e68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4c3ec>
     120339e:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
     12033a5:	00 
     12033a6:	e8 dd 3a 00 00       	call   1206e88 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4c40c>
     12033ab:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     12033b2:	00 
     12033b3:	48 8d b4 24 90 02 00 	lea    rsi,[rsp+0x290]
     12033ba:	00 
     12033bb:	e8 d6 d3 ff ff       	call   1200796 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45d1a>
     12033c0:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
     12033c5:	48 89 df             	mov    rdi,rbx
     12033c8:	e8 47 d3 ff ff       	call   1200714 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45c98>
     12033cd:	48 8b 9b a0 00 00 00 	mov    rbx,QWORD PTR [rbx+0xa0]
     12033d4:	f6 84 24 60 03 00 00 	test   BYTE PTR [rsp+0x360],0x2
     12033db:	02 
     12033dc:	0f 85 c7 00 00 00    	jne    12034a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48a2d>
     12033e2:	48 8b 84 24 80 03 00 	mov    rax,QWORD PTR [rsp+0x380]

### 0x12044f2, FDE=(18891288, 18894558)
     12044b9:	48 8d bc 24 50 09 00 	lea    rdi,[rsp+0x950]
     12044c0:	00 
     12044c1:	e8 3a 5e ff ff       	call   11fa300 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f884>
     12044c6:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
     12044cd:	00 
     12044ce:	e8 75 23 00 00       	call   1206848 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bdcc>
     12044d3:	e9 be fe ff ff       	jmp    1204396 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4991a>
     12044d8:	48 8d 35 ab 2b 14 ff 	lea    rsi,[rip+0xffffffffff142bab]        # 34708a <_ZTSSt12bad_any_cast@@Base-0x4913e>
     12044df:	48 89 df             	mov    rdi,rbx
     12044e2:	e8 68 73 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     12044e7:	84 c0                	test   al,al
     12044e9:	74 4b                	je     1204536 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49aba>
     12044eb:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
     12044ef:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12044f2:	ff 50 68             	call   QWORD PTR [rax+0x68]
     12044f5:	e8 cd 63 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
     12044fa:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
     1204501:	00 
     1204502:	83 60 e8 00          	and    DWORD PTR [rax-0x18],0x0
     1204506:	48 8d 0d 43 e9 77 00 	lea    rcx,[rip+0x77e943]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
     120450d:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
     1204511:	0f 57 c0             	xorps  xmm0,xmm0
     1204514:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     1204517:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     120451b:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1204520:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
     1204524:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
     120452b:	00 
     120452c:	e8 5f 98 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
     1204531:	e9 53 fe ff ff       	jmp    1204389 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4990d>
     1204536:	48 8d 35 01 84 13 ff 	lea    rsi,[rip+0xffffffffff138401]        # 33c93e <_ZTSSt12bad_any_cast@@Base-0x5388a>
     120453d:	48 89 df             	mov    rdi,rbx
     1204540:	e8 0a 73 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     1204545:	84 c0                	test   al,al

### 0x1209ef2, FDE=(18914656, 18915188)
     1209eba:	0f 11 41 08          	movups XMMWORD PTR [rcx+0x8],xmm0
     1209ebe:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     1209ec2:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1209ec7:	4c 8b 68 20          	mov    r13,QWORD PTR [rax+0x20]
     1209ecb:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1209ed2:	00 
     1209ed3:	4c 89 e6             	mov    rsi,r12
     1209ed6:	e8 87 db 45 00       	call   1667a62 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bbce>
     1209edb:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     1209edf:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     1209ee6:	00 
     1209ee7:	48 8d 94 24 80 01 00 	lea    rdx,[rsp+0x180]
     1209eee:	00 
     1209eef:	4c 89 ef             	mov    rdi,r13
     1209ef2:	ff 50 68             	call   QWORD PTR [rax+0x68]
     1209ef5:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
     1209efc:	00 
     1209efd:	e8 d6 20 46 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     1209f02:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
     1209f09:	00 
     1209f0a:	e8 5b 00 87 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1209f0f:	31 ff                	xor    edi,edi
     1209f11:	e8 9c 45 89 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     1209f16:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
     1209f1a:	0f 57 c9             	xorps  xmm1,xmm1
     1209f1d:	41 0f 11 0e          	movups XMMWORD PTR [r14],xmm1
     1209f21:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     1209f24:	31 ff                	xor    edi,edi
     1209f26:	e8 5b 45 89 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1209f2b:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     1209f30:	e8 a3 20 46 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     1209f35:	4c 89 ff             	mov    rdi,r15
     1209f38:	e8 9b 20 46 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     1209f3d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

