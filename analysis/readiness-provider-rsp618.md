# Readiness provider caller-local rsp+0x618 trace

Known alias:
- e91df6: rsi = caller rsp+0x260
- e92f2c saves that pointer in r13
- e94787 reads [r13+0x3b8]
- therefore the concrete caller-local provider slot is rsp+0x618 before e91e06

Caller FDE: ('0xe8fad0', '0xe92c49')

## Direct references to rsp+0x600..0x630 in caller FDE
  e8ff38:	0f 29 84 24 30 06 00 	movaps XMMWORD PTR [rsp+0x630],xmm0
  e9158b:	48 8b b4 24 18 06 00 	mov    rsi,QWORD PTR [rsp+0x618]

## Context for rsp+0x618 direct references
### 0xe9158b: mov    rsi,QWORD PTR [rsp+0x618]
      e91513:	48 8d 05 dc 19 00 00 	lea    rax,[rip+0x19dc]        # e92ef6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a30c>
      e9151a:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      e9151e:	48 8d 05 01 1a 00 00 	lea    rax,[rip+0x1a01]        # e92f26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a33c>
      e91525:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      e91529:	48 8d b4 24 f0 01 00 	lea    rsi,[rsp+0x1f0]
      e91530:	00 
      e91531:	48 89 da             	mov    rdx,rbx
      e91534:	e8 4f ff 92 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>
      e91539:	48 89 df             	mov    rdi,rbx
      e9153c:	e8 5d 5d c1 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
      e91541:	4c 89 f7             	mov    rdi,r14
      e91544:	e8 9b e0 c4 ff       	call   adf5e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c584>
      e91549:	4c 89 74 24 68       	mov    QWORD PTR [rsp+0x68],r14
      e9154e:	4c 89 f7             	mov    rdi,r14
      e91551:	e8 5c cf c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e91556:	49 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [r12+0x80]
      e9155d:	00 
      e9155e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e91561:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e91564:	49 89 c5             	mov    r13,rax
      e91567:	f3 0f 6f 84 24 38 03 	movdqu xmm0,XMMWORD PTR [rsp+0x338]
      e9156e:	00 00 
      e91570:	66 0f 7f 44 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm0
      e91576:	48 8b 9c 24 a0 02 00 	mov    rbx,QWORD PTR [rsp+0x2a0]
      e9157d:	00 
      e9157e:	48 8b 84 24 58 03 00 	mov    rax,QWORD PTR [rsp+0x358]
      e91585:	00 
      e91586:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      e9158b:	48 8b b4 24 18 06 00 	mov    rsi,QWORD PTR [rsp+0x618]
      e91592:	00 
      e91593:	48 8b ac 24 d0 07 00 	mov    rbp,QWORD PTR [rsp+0x7d0]
      e9159a:	00 
      e9159b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e9159e:	48 8d bc 24 60 08 00 	lea    rdi,[rsp+0x860]
      e915a5:	00 
      e915a6:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e915a9:	bf 58 01 00 00       	mov    edi,0x158
      e915ae:	e8 4d c9 95 00       	call   17edf00 <_Znwm@plt>
      e915b3:	49 89 c6             	mov    r14,rax
      e915b6:	66 0f ef c0          	pxor   xmm0,xmm0
      e915ba:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e915bf:	48 8d 05 a2 be 96 00 	lea    rax,[rip+0x96bea2]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e915c6:	49 89 06             	mov    QWORD PTR [r14],rax
      e915c9:	f3 0f 6f 84 24 28 03 	movdqu xmm0,XMMWORD PTR [rsp+0x328]
      e915d0:	00 00 
      e915d2:	48 8b 84 24 30 03 00 	mov    rax,QWORD PTR [rsp+0x330]
      e915d9:	00 
      e915da:	48 85 c0             	test   rax,rax
      e915dd:	74 05                	je     e915e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x589fa>
      e915df:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e915e4:	48 8d 05 e5 14 9a 00 	lea    rax,[rip+0x9a14e5]        # 1832ad0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4a68>
      e915eb:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      e915ef:	48 8b 84 24 68 08 00 	mov    rax,QWORD PTR [rsp+0x868]
      e915f6:	00 
      e915f7:	66 0f 6f 8c 24 60 08 	movdqa xmm1,XMMWORD PTR [rsp+0x860]
      e915fe:	00 00 
      e91600:	f3 41 0f 7f 4e 20    	movdqu XMMWORD PTR [r14+0x20],xmm1
      e91606:	48 85 c0             	test   rax,rax
      e91609:	74 05                	je     e91610 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58a26>
      e9160b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e91610:	f3 41 0f 7f 46 30    	movdqu XMMWORD PTR [r14+0x30],xmm0
      e91616:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
      e9161d:	48 85 c0             	test   rax,rax
      e91620:	74 05                	je     e91627 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58a3d>
      e91622:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e91627:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
      e9162c:	49 8d 46 18          	lea    rax,[r14+0x18]
      e91630:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]
      e91636:	f3 41 0f 7f 46 40    	movdqu XMMWORD PTR [r14+0x40],xmm0
      e9163c:	49 89 5e 50          	mov    QWORD PTR [r14+0x50],rbx
      e91640:	44 8a 7d 01          	mov    r15b,BYTE PTR [rbp+0x1]

## LEA/address-taking aliases that can target rsp+0x618
## Writes to exact slot rsp+0x618 before e91e06
## Nearby virtual/materializer calls before e91e06 involving 0x600..0x630 locals
### call/jump 0xe915a6: call   QWORD PTR [rax+0x10]
      e9155e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e91561:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e91564:	49 89 c5             	mov    r13,rax
      e91567:	f3 0f 6f 84 24 38 03 	movdqu xmm0,XMMWORD PTR [rsp+0x338]
      e9156e:	00 00 
      e91570:	66 0f 7f 44 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm0
      e91576:	48 8b 9c 24 a0 02 00 	mov    rbx,QWORD PTR [rsp+0x2a0]
      e9157d:	00 
      e9157e:	48 8b 84 24 58 03 00 	mov    rax,QWORD PTR [rsp+0x358]
      e91585:	00 
      e91586:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      e9158b:	48 8b b4 24 18 06 00 	mov    rsi,QWORD PTR [rsp+0x618]
      e91592:	00 
      e91593:	48 8b ac 24 d0 07 00 	mov    rbp,QWORD PTR [rsp+0x7d0]
      e9159a:	00 
      e9159b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e9159e:	48 8d bc 24 60 08 00 	lea    rdi,[rsp+0x860]
      e915a5:	00 
      e915a6:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e915a9:	bf 58 01 00 00       	mov    edi,0x158
      e915ae:	e8 4d c9 95 00       	call   17edf00 <_Znwm@plt>
      e915b3:	49 89 c6             	mov    r14,rax
      e915b6:	66 0f ef c0          	pxor   xmm0,xmm0
      e915ba:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e915bf:	48 8d 05 a2 be 96 00 	lea    rax,[rip+0x96bea2]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e915c6:	49 89 06             	mov    QWORD PTR [r14],rax
      e915c9:	f3 0f 6f 84 24 28 03 	movdqu xmm0,XMMWORD PTR [rsp+0x328]
      e915d0:	00 00 
      e915d2:	48 8b 84 24 30 03 00 	mov    rax,QWORD PTR [rsp+0x330]
      e915d9:	00 
      e915da:	48 85 c0             	test   rax,rax
      e915dd:	74 05                	je     e915e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x589fa>
      e915df:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e915e4:	48 8d 05 e5 14 9a 00 	lea    rax,[rip+0x9a14e5]        # 1832ad0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4a68>
      e915eb:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      e915ef:	48 8b 84 24 68 08 00 	mov    rax,QWORD PTR [rsp+0x868]
      e915f6:	00 
      e915f7:	66 0f 6f 8c 24 60 08 	movdqa xmm1,XMMWORD PTR [rsp+0x860]
      e915fe:	00 00 
      e91600:	f3 41 0f 7f 4e 20    	movdqu XMMWORD PTR [r14+0x20],xmm1
      e91606:	48 85 c0             	test   rax,rax
      e91609:	74 05                	je     e91610 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58a26>
      e9160b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]

### call/jump 0xe915ae: call   17edf00 <_Znwm@plt>
      e91564:	49 89 c5             	mov    r13,rax
      e91567:	f3 0f 6f 84 24 38 03 	movdqu xmm0,XMMWORD PTR [rsp+0x338]
      e9156e:	00 00 
      e91570:	66 0f 7f 44 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm0
      e91576:	48 8b 9c 24 a0 02 00 	mov    rbx,QWORD PTR [rsp+0x2a0]
      e9157d:	00 
      e9157e:	48 8b 84 24 58 03 00 	mov    rax,QWORD PTR [rsp+0x358]
      e91585:	00 
      e91586:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      e9158b:	48 8b b4 24 18 06 00 	mov    rsi,QWORD PTR [rsp+0x618]
      e91592:	00 
      e91593:	48 8b ac 24 d0 07 00 	mov    rbp,QWORD PTR [rsp+0x7d0]
      e9159a:	00 
      e9159b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e9159e:	48 8d bc 24 60 08 00 	lea    rdi,[rsp+0x860]
      e915a5:	00 
      e915a6:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e915a9:	bf 58 01 00 00       	mov    edi,0x158
      e915ae:	e8 4d c9 95 00       	call   17edf00 <_Znwm@plt>
      e915b3:	49 89 c6             	mov    r14,rax
      e915b6:	66 0f ef c0          	pxor   xmm0,xmm0
      e915ba:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e915bf:	48 8d 05 a2 be 96 00 	lea    rax,[rip+0x96bea2]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e915c6:	49 89 06             	mov    QWORD PTR [r14],rax
      e915c9:	f3 0f 6f 84 24 28 03 	movdqu xmm0,XMMWORD PTR [rsp+0x328]
      e915d0:	00 00 
      e915d2:	48 8b 84 24 30 03 00 	mov    rax,QWORD PTR [rsp+0x330]
      e915d9:	00 
      e915da:	48 85 c0             	test   rax,rax
      e915dd:	74 05                	je     e915e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x589fa>
      e915df:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e915e4:	48 8d 05 e5 14 9a 00 	lea    rax,[rip+0x9a14e5]        # 1832ad0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4a68>
      e915eb:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      e915ef:	48 8b 84 24 68 08 00 	mov    rax,QWORD PTR [rsp+0x868]
      e915f6:	00 
      e915f7:	66 0f 6f 8c 24 60 08 	movdqa xmm1,XMMWORD PTR [rsp+0x860]
      e915fe:	00 00 
      e91600:	f3 41 0f 7f 4e 20    	movdqu XMMWORD PTR [r14+0x20],xmm1
      e91606:	48 85 c0             	test   rax,rax
      e91609:	74 05                	je     e91610 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58a26>
      e9160b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e91610:	f3 41 0f 7f 46 30    	movdqu XMMWORD PTR [r14+0x30],xmm0
      e91616:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1

## Full window around final construction and e91e06
  e91804:	4c 8d 84 24 30 01 00 	lea    r8,[rsp+0x130]
  e9180b:	00 
  e9180c:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
  e91811:	49 89 00             	mov    QWORD PTR [r8],rax
  e91814:	48 8d 35 76 b8 c0 ff 	lea    rsi,[rip+0xffffffffffc0b876]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
  e9181b:	48 8d 0d 74 fb 02 00 	lea    rcx,[rip+0x2fb74]        # ec1396 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x887ac>
  e91822:	4c 8d bc 24 70 01 00 	lea    r15,[rsp+0x170]
  e91829:	00 
  e9182a:	6a 08                	push   0x8
  e9182c:	41 59                	pop    r9
  e9182e:	4c 89 ff             	mov    rdi,r15
  e91831:	31 d2                	xor    edx,edx
  e91833:	e8 5c 8f 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e91838:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e9183b:	48 8d bc 24 a0 08 00 	lea    rdi,[rsp+0x8a0]
  e91842:	00 
  e91843:	48 89 de             	mov    rsi,rbx
  e91846:	4c 89 fa             	mov    rdx,r15
  e91849:	ff 50 20             	call   QWORD PTR [rax+0x20]
  e9184c:	4d 8d 7c 24 78       	lea    r15,[r12+0x78]
  e91851:	48 8d 9c 24 a0 08 00 	lea    rbx,[rsp+0x8a0]
  e91858:	00 
  e91859:	4c 89 ff             	mov    rdi,r15
  e9185c:	48 89 de             	mov    rsi,rbx
  e9185f:	e8 da 81 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e91864:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  e91868:	e8 19 cc c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9186d:	45 84 f6             	test   r14b,r14b
  e91870:	74 0f                	je     e91881 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58c97>
  e91872:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
  e91879:	00 
  e9187a:	e8 55 83 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  e9187f:	eb 0d                	jmp    e9188e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58ca4>
  e91881:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
  e91888:	00 
  e91889:	e8 5a 8f 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e9188e:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
  e91893:	44 8a 75 01          	mov    r14b,BYTE PTR [rbp+0x1]
  e91897:	45 84 f6             	test   r14b,r14b
  e9189a:	74 27                	je     e918c3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58cd9>
  e9189c:	48 8d 9c 24 30 01 00 	lea    rbx,[rsp+0x130]
  e918a3:	00 
  e918a4:	48 89 df             	mov    rdi,rbx
  e918a7:	e8 4a 81 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  e918ac:	48 8d bc 24 a0 08 00 	lea    rdi,[rsp+0x8a0]
  e918b3:	00 
  e918b4:	48 89 de             	mov    rsi,rbx
  e918b7:	e8 82 81 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e918bc:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
  e918c1:	eb 51                	jmp    e91914 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58d2a>
  e918c3:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
  e918c8:	49 8b 5d 50          	mov    rbx,QWORD PTR [r13+0x50]
  e918cc:	4c 8d 84 24 f0 00 00 	lea    r8,[rsp+0xf0]
  e918d3:	00 
  e918d4:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
  e918d9:	49 89 00             	mov    QWORD PTR [r8],rax
  e918dc:	48 8d 35 ae b7 c0 ff 	lea    rsi,[rip+0xffffffffffc0b7ae]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
  e918e3:	48 8d 0d ac fa 02 00 	lea    rcx,[rip+0x2faac]        # ec1396 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x887ac>
  e918ea:	4c 8d a4 24 30 01 00 	lea    r12,[rsp+0x130]
  e918f1:	00 
  e918f2:	6a 08                	push   0x8
  e918f4:	41 59                	pop    r9
  e918f6:	4c 89 e7             	mov    rdi,r12
  e918f9:	31 d2                	xor    edx,edx
  e918fb:	e8 94 8e 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e91900:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e91903:	48 8d bc 24 a0 08 00 	lea    rdi,[rsp+0x8a0]
  e9190a:	00 
  e9190b:	48 89 de             	mov    rsi,rbx
  e9190e:	4c 89 e2             	mov    rdx,r12
  e91911:	ff 50 10             	call   QWORD PTR [rax+0x10]
  e91914:	49 8d 9d 88 00 00 00 	lea    rbx,[r13+0x88]
  e9191b:	4c 8d a4 24 a0 08 00 	lea    r12,[rsp+0x8a0]
  e91922:	00 
  e91923:	48 89 df             	mov    rdi,rbx
  e91926:	4c 89 e6             	mov    rsi,r12
  e91929:	e8 10 81 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e9192e:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
  e91933:	e8 4e cb c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e91938:	45 84 f6             	test   r14b,r14b
  e9193b:	74 0f                	je     e9194c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58d62>
  e9193d:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
  e91944:	00 
  e91945:	e8 8a 82 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  e9194a:	eb 0d                	jmp    e91959 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58d6f>
  e9194c:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
  e91953:	00 
  e91954:	e8 8f 8e 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e91959:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
  e9195e:	4d 8d a6 98 00 00 00 	lea    r12,[r14+0x98]
  e91965:	4c 89 e7             	mov    rdi,r12
  e91968:	e8 21 69 c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
  e9196d:	40 8a 6d 01          	mov    bpl,BYTE PTR [rbp+0x1]
  e91971:	40 84 ed             	test   bpl,bpl
  e91974:	74 22                	je     e91998 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58dae>
  e91976:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]
  e9197d:	00 
  e9197e:	48 89 df             	mov    rdi,rbx
  e91981:	e8 70 80 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  e91986:	48 8d bc 24 a0 08 00 	lea    rdi,[rsp+0x8a0]
  e9198d:	00 
  e9198e:	48 89 de             	mov    rsi,rbx
  e91991:	e8 a8 80 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e91996:	eb 57                	jmp    e919ef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58e05>
  e91998:	4c 8d 84 24 90 09 00 	lea    r8,[rsp+0x990]
  e9199f:	00 
  e919a0:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
  e919a5:	49 89 00             	mov    QWORD PTR [r8],rax
  e919a8:	48 8d 35 e2 b6 c0 ff 	lea    rsi,[rip+0xffffffffffc0b6e2]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
  e919af:	48 8d 0d e0 f9 02 00 	lea    rcx,[rip+0x2f9e0]        # ec1396 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x887ac>
  e919b6:	4c 8d b4 24 f0 00 00 	lea    r14,[rsp+0xf0]
  e919bd:	00 
  e919be:	6a 08                	push   0x8
  e919c0:	41 59                	pop    r9
  e919c2:	4c 89 f7             	mov    rdi,r14
  e919c5:	31 d2                	xor    edx,edx
  e919c7:	e8 c8 8d 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e919cc:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]
  e919d2:	66 48 0f 3a 16 c6 01 	pextrq rsi,xmm0,0x1
  e919d9:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e919dc:	48 8d bc 24 a0 08 00 	lea    rdi,[rsp+0x8a0]
  e919e3:	00 
  e919e4:	4c 89 f2             	mov    rdx,r14
  e919e7:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
  e919ec:	ff 50 18             	call   QWORD PTR [rax+0x18]
  e919ef:	49 8d be f0 00 00 00 	lea    rdi,[r14+0xf0]
  e919f6:	48 8d 9c 24 a0 08 00 	lea    rbx,[rsp+0x8a0]
  e919fd:	00 
  e919fe:	48 89 de             	mov    rsi,rbx
  e91a01:	e8 38 80 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e91a06:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  e91a0a:	e8 77 ca c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e91a0f:	40 84 ed             	test   bpl,bpl
  e91a12:	74 0f                	je     e91a23 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58e39>
  e91a14:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
  e91a1b:	00 
  e91a1c:	e8 b3 81 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  e91a21:	eb 0d                	jmp    e91a30 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58e46>
  e91a23:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
  e91a2a:	00 
  e91a2b:	e8 b8 8d 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e91a30:	4c 8b 6c 24 60       	mov    r13,QWORD PTR [rsp+0x60]
  e91a35:	4c 89 f0             	mov    rax,r14
  e91a38:	48 05 00 01 00 00    	add    rax,0x100
  e91a3e:	49 89 86 00 01 00 00 	mov    QWORD PTR [r14+0x100],rax
  e91a45:	49 89 86 08 01 00 00 	mov    QWORD PTR [r14+0x108],rax
  e91a4c:	66 0f ef c0          	pxor   xmm0,xmm0
  e91a50:	f3 41 0f 7f 86 10 01 	movdqu XMMWORD PTR [r14+0x110],xmm0
  e91a57:	00 00 
  e91a59:	49 83 a6 30 01 00 00 	and    QWORD PTR [r14+0x130],0x0
  e91a60:	00 
  e91a61:	f3 41 0f 7f 86 20 01 	movdqu XMMWORD PTR [r14+0x120],xmm0
  e91a68:	00 00 
  e91a6a:	41 c7 86 38 01 00 00 	mov    DWORD PTR [r14+0x138],0x3f800000
  e91a71:	00 00 80 3f 
  e91a75:	b8 e8 03 00 00       	mov    eax,0x3e8
  e91a7a:	49 89 86 40 01 00 00 	mov    QWORD PTR [r14+0x140],rax
  e91a81:	49 89 86 48 01 00 00 	mov    QWORD PTR [r14+0x148],rax
  e91a88:	49 83 a6 50 01 00 00 	and    QWORD PTR [r14+0x150],0x0
  e91a8f:	00 
  e91a90:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
  e91a95:	e8 ec c9 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e91a9a:	31 ff                	xor    edi,edi
  e91a9c:	e8 7b c9 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e91aa1:	48 8b bc 24 68 08 00 	mov    rdi,QWORD PTR [rsp+0x868]
  e91aa8:	00 
  e91aa9:	e8 d8 c9 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e91aae:	4c 8d bc 24 70 09 00 	lea    r15,[rsp+0x970]
  e91ab5:	00 
  e91ab6:	66 0f ef c0          	pxor   xmm0,xmm0
  e91aba:	66 41 0f 7f 47 f0    	movdqa XMMWORD PTR [r15-0x10],xmm0
  e91ac0:	49 83 27 00          	and    QWORD PTR [r15],0x0
  e91ac4:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
  e91ac9:	4c 89 bc 24 c0 08 00 	mov    QWORD PTR [rsp+0x8c0],r15
  e91ad0:	00 
  e91ad1:	6a 10                	push   0x10
  e91ad3:	5f                   	pop    rdi
  e91ad4:	e8 27 c4 95 00       	call   17edf00 <_Znwm@plt>
  e91ad9:	48 8d 9c 24 a0 08 00 	lea    rbx,[rsp+0x8a0]
  e91ae0:	00 
  e91ae1:	48 89 03             	mov    QWORD PTR [rbx],rax
  e91ae4:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
  e91ae8:	48 89 c1             	mov    rcx,rax
  e91aeb:	48 83 c1 10          	add    rcx,0x10
  e91aef:	48 89 4b 18          	mov    QWORD PTR [rbx+0x18],rcx
  e91af3:	48 8b 54 24 20       	mov    rdx,QWORD PTR [rsp+0x20]
  e91af8:	48 89 10             	mov    QWORD PTR [rax],rdx
  e91afb:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
  e91aff:	48 89 4b 10          	mov    QWORD PTR [rbx+0x10],rcx
  e91b03:	4c 8d b4 24 60 09 00 	lea    r14,[rsp+0x960]
  e91b0a:	00 
  e91b0b:	4c 89 f7             	mov    rdi,r14
  e91b0e:	48 89 de             	mov    rsi,rbx
  e91b11:	e8 58 ce e1 ff       	call   cae96e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fb90e>
  e91b16:	4d 8b 66 08          	mov    r12,QWORD PTR [r14+0x8]
  e91b1a:	48 89 df             	mov    rdi,rbx
  e91b1d:	e8 8e 7b c2 ff       	call   ab96b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6650>
  e91b22:	4d 89 66 08          	mov    QWORD PTR [r14+0x8],r12
  e91b26:	31 ff                	xor    edi,edi
  e91b28:	e8 59 c9 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e91b2d:	49 8b 4d 00          	mov    rcx,QWORD PTR [r13+0x0]
  e91b31:	48 85 c9             	test   rcx,rcx
  e91b34:	0f 84 15 01 00 00    	je     e91c4f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59065>
  e91b3a:	4c 8b b4 24 68 09 00 	mov    r14,QWORD PTR [rsp+0x968]
  e91b41:	00 
  e91b42:	48 8b 84 24 70 09 00 	mov    rax,QWORD PTR [rsp+0x970]
  e91b49:	00 
  e91b4a:	49 39 c6             	cmp    r14,rax
  e91b4d:	73 1e                	jae    e91b6d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58f83>
  e91b4f:	49 89 0e             	mov    QWORD PTR [r14],rcx
  e91b52:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
  e91b56:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
  e91b5a:	48 85 c0             	test   rax,rax
  e91b5d:	74 05                	je     e91b64 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58f7a>
  e91b5f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e91b64:	49 83 c6 10          	add    r14,0x10
  e91b68:	e9 da 00 00 00       	jmp    e91c47 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5905d>
  e91b6d:	48 8b 8c 24 60 09 00 	mov    rcx,QWORD PTR [rsp+0x960]
  e91b74:	00 
  e91b75:	49 29 ce             	sub    r14,rcx
  e91b78:	4d 89 f4             	mov    r12,r14
  e91b7b:	49 c1 fc 04          	sar    r12,0x4
  e91b7f:	49 8d 54 24 01       	lea    rdx,[r12+0x1]
  e91b84:	48 89 d6             	mov    rsi,rdx
  e91b87:	48 c1 ee 3c          	shr    rsi,0x3c
  e91b8b:	0f 85 40 09 00 00    	jne    e924d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x598e7>
  e91b91:	48 29 c8             	sub    rax,rcx
  e91b94:	48 89 c3             	mov    rbx,rax
  e91b97:	48 c1 fb 03          	sar    rbx,0x3
  e91b9b:	48 39 d3             	cmp    rbx,rdx
  e91b9e:	48 0f 46 da          	cmovbe rbx,rdx
  e91ba2:	48 b9 ff ff ff ff ff 	movabs rcx,0xfffffffffffffff
  e91ba9:	ff ff 0f 
  e91bac:	48 ba f0 ff ff ff ff 	movabs rdx,0x7ffffffffffffff0
  e91bb3:	ff ff 7f 
  e91bb6:	48 39 d0             	cmp    rax,rdx
  e91bb9:	48 0f 43 d9          	cmovae rbx,rcx
  e91bbd:	4c 89 bc 24 c0 08 00 	mov    QWORD PTR [rsp+0x8c0],r15
  e91bc4:	00 
  e91bc5:	48 39 cb             	cmp    rbx,rcx
  e91bc8:	0f 87 1f 09 00 00    	ja     e924ed <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59903>
  e91bce:	48 c1 e3 04          	shl    rbx,0x4
  e91bd2:	48 89 df             	mov    rdi,rbx
  e91bd5:	e8 26 c3 95 00       	call   17edf00 <_Znwm@plt>
  e91bda:	49 8b 55 00          	mov    rdx,QWORD PTR [r13+0x0]
  e91bde:	48 89 84 24 a0 08 00 	mov    QWORD PTR [rsp+0x8a0],rax
  e91be5:	00 
  e91be6:	4a 8d 0c 30          	lea    rcx,[rax+r14*1]
  e91bea:	48 89 8c 24 a8 08 00 	mov    QWORD PTR [rsp+0x8a8],rcx
  e91bf1:	00 
  e91bf2:	48 01 c3             	add    rbx,rax
  e91bf5:	48 89 9c 24 b8 08 00 	mov    QWORD PTR [rsp+0x8b8],rbx
  e91bfc:	00 
  e91bfd:	4a 89 14 30          	mov    QWORD PTR [rax+r14*1],rdx
  e91c01:	49 c1 e4 04          	shl    r12,0x4
  e91c05:	49 8b 55 08          	mov    rdx,QWORD PTR [r13+0x8]
  e91c09:	4a 89 54 20 08       	mov    QWORD PTR [rax+r12*1+0x8],rdx
  e91c0e:	48 85 d2             	test   rdx,rdx
  e91c11:	74 05                	je     e91c18 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5902e>
  e91c13:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
  e91c18:	48 83 c1 10          	add    rcx,0x10
  e91c1c:	48 8d 9c 24 a0 08 00 	lea    rbx,[rsp+0x8a0]
  e91c23:	00 
  e91c24:	48 89 4b 10          	mov    QWORD PTR [rbx+0x10],rcx
  e91c28:	4c 8d b4 24 60 09 00 	lea    r14,[rsp+0x960]
  e91c2f:	00 
  e91c30:	4c 89 f7             	mov    rdi,r14
  e91c33:	48 89 de             	mov    rsi,rbx
  e91c36:	e8 33 cd e1 ff       	call   cae96e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fb90e>
  e91c3b:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
  e91c3f:	48 89 df             	mov    rdi,rbx
  e91c42:	e8 69 7a c2 ff       	call   ab96b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6650>
  e91c47:	4c 89 b4 24 68 09 00 	mov    QWORD PTR [rsp+0x968],r14
  e91c4e:	00 
  e91c4f:	bf a8 00 00 00       	mov    edi,0xa8
  e91c54:	e8 a7 c2 95 00       	call   17edf00 <_Znwm@plt>
  e91c59:	48 89 c3             	mov    rbx,rax
  e91c5c:	66 0f ef c9          	pxor   xmm1,xmm1
  e91c60:	f3 0f 7f 48 08       	movdqu XMMWORD PTR [rax+0x8],xmm1
  e91c65:	48 8d 05 fc b7 96 00 	lea    rax,[rip+0x96b7fc]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
  e91c6c:	48 89 03             	mov    QWORD PTR [rbx],rax
  e91c6f:	48 8d 43 18          	lea    rax,[rbx+0x18]
  e91c73:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e91c78:	66 0f 6f 84 24 60 09 	movdqa xmm0,XMMWORD PTR [rsp+0x960]
  e91c7f:	00 00 
  e91c81:	48 8b 84 24 70 09 00 	mov    rax,QWORD PTR [rsp+0x970]
  e91c88:	00 
  e91c89:	66 0f 7f 8c 24 60 09 	movdqa XMMWORD PTR [rsp+0x960],xmm1
  e91c90:	00 00 
  e91c92:	48 83 a4 24 70 09 00 	and    QWORD PTR [rsp+0x970],0x0
  e91c99:	00 00 
  e91c9b:	48 8d 0d 96 01 9a 00 	lea    rcx,[rip+0x9a0196]        # 1831e38 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3dd0>
  e91ca2:	48 89 4b 18          	mov    QWORD PTR [rbx+0x18],rcx
  e91ca6:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
  e91cab:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
  e91caf:	66 0f 7f 8c 24 90 09 	movdqa XMMWORD PTR [rsp+0x990],xmm1
  e91cb6:	00 00 
  e91cb8:	48 83 a4 24 a0 09 00 	and    QWORD PTR [rsp+0x9a0],0x0
  e91cbf:	00 00 
  e91cc1:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
  e91cc5:	48 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],rdi
  e91cca:	e8 bf 65 c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
  e91ccf:	48 83 a3 a0 00 00 00 	and    QWORD PTR [rbx+0xa0],0x0
  e91cd6:	00 
  e91cd7:	66 0f ef c0          	pxor   xmm0,xmm0
  e91cdb:	f3 0f 7f 83 90 00 00 	movdqu XMMWORD PTR [rbx+0x90],xmm0
  e91ce2:	00 
  e91ce3:	4c 8b 6b 20          	mov    r13,QWORD PTR [rbx+0x20]
  e91ce7:	48 89 5c 24 40       	mov    QWORD PTR [rsp+0x40],rbx
  e91cec:	4c 8b 63 28          	mov    r12,QWORD PTR [rbx+0x28]
  e91cf0:	4d 39 e5             	cmp    r13,r12
  e91cf3:	0f 84 ae 00 00 00    	je     e91da7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x591bd>
  e91cf9:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]
  e91cfe:	49 8d 47 20          	lea    rax,[r15+0x20]
  e91d02:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
  e91d07:	49 81 c7 90 00 00 00 	add    r15,0x90
  e91d0e:	48 8d 9c 24 a0 08 00 	lea    rbx,[rsp+0x8a0]
  e91d15:	00 
  e91d16:	48 8d ac 24 30 08 00 	lea    rbp,[rsp+0x830]
  e91d1d:	00 
  e91d1e:	4d 8b 75 00          	mov    r14,QWORD PTR [r13+0x0]
  e91d22:	48 8d 05 8f a1 01 00 	lea    rax,[rip+0x1a18f]        # eabeb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x732ce>
  e91d29:	48 89 84 24 60 08 00 	mov    QWORD PTR [rsp+0x860],rax
  e91d30:	00 
  e91d31:	48 83 a4 24 68 08 00 	and    QWORD PTR [rsp+0x868],0x0
  e91d38:	00 00 
  e91d3a:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
  e91d3f:	48 89 84 24 70 08 00 	mov    QWORD PTR [rsp+0x870],rax
  e91d46:	00 
  e91d47:	48 89 df             	mov    rdi,rbx
  e91d4a:	48 8d 35 70 a1 01 00 	lea    rsi,[rip+0x1a170]        # eabec1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x732d7>
  e91d51:	31 d2                	xor    edx,edx
  e91d53:	48 8d 0d 76 a1 01 00 	lea    rcx,[rip+0x1a176]        # eabed0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x732e6>
  e91d5a:	4c 8d 84 24 60 08 00 	lea    r8,[rsp+0x860]
  e91d61:	00 
  e91d62:	6a 18                	push   0x18
  e91d64:	41 59                	pop    r9
  e91d66:	e8 29 8a 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e91d6b:	49 8b 06             	mov    rax,QWORD PTR [r14]
  e91d6e:	48 89 ef             	mov    rdi,rbp
  e91d71:	4c 89 f6             	mov    rsi,r14
  e91d74:	48 89 da             	mov    rdx,rbx
  e91d77:	ff 50 20             	call   QWORD PTR [rax+0x20]
  e91d7a:	4c 89 ff             	mov    rdi,r15
  e91d7d:	48 89 ee             	mov    rsi,rbp
  e91d80:	e8 49 77 00 00       	call   e994ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608e4>
  e91d85:	48 8b bc 24 38 08 00 	mov    rdi,QWORD PTR [rsp+0x838]
  e91d8c:	00 
  e91d8d:	e8 f4 c6 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e91d92:	48 89 df             	mov    rdi,rbx
  e91d95:	e8 4e 8a 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e91d9a:	49 83 c5 10          	add    r13,0x10
  e91d9e:	4d 39 e5             	cmp    r13,r12
  e91da1:	0f 85 77 ff ff ff    	jne    e91d1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59134>
  e91da7:	48 8d bc 24 90 09 00 	lea    rdi,[rsp+0x990]
  e91dae:	00 
  e91daf:	e8 6e bd c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
  e91db4:	31 ff                	xor    edi,edi
  e91db6:	e8 61 c6 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e91dbb:	48 8d 9c 24 e0 00 00 	lea    rbx,[rsp+0xe0]
  e91dc2:	00 
  e91dc3:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
  e91dc8:	48 89 03             	mov    QWORD PTR [rbx],rax
  e91dcb:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
  e91dd0:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
  e91dd4:	4c 8d b4 24 60 09 00 	lea    r14,[rsp+0x960]
  e91ddb:	00 
  e91ddc:	4c 89 f7             	mov    rdi,r14
  e91ddf:	e8 3e bd c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
  e91de4:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e91de9:	e8 98 c6 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e91dee:	48 8d bc 24 a0 08 00 	lea    rdi,[rsp+0x8a0]
  e91df5:	00 
  e91df6:	48 8d b4 24 60 02 00 	lea    rsi,[rsp+0x260]
  e91dfd:	00 
  e91dfe:	48 8b 54 24 08       	mov    rdx,QWORD PTR [rsp+0x8]
  e91e03:	48 89 d9             	mov    rcx,rbx
  e91e06:	e8 21 11 00 00       	call   e92f2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a342>
  e91e0b:	0f 28 84 24 b0 08 00 	movaps xmm0,XMMWORD PTR [rsp+0x8b0]
  e91e12:	00 
  e91e13:	4c 8b 7c 24 38       	mov    r15,QWORD PTR [rsp+0x38]
  e91e18:	4c 89 ff             	mov    rdi,r15
  e91e1b:	e8 16 cd c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>

## Exact e92f entry/use bridge
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
