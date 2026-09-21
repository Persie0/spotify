# Final readiness carrier inner pointer

Anchor: e94925 writes carrier base+0x20 = r12. AP 0x1843bf8 +0x10 (fec736) delegates to [interface+8] = carrier base+0x20, then calls that inner object virtual +0x10.

## Construction window e94600..e94930

/tmp/carinner/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000e94600 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ba16>:
  e94600:	b4 24                	mov    ah,0x24
  e94602:	10 0e                	adc    BYTE PTR [rsi],cl
  e94604:	00 00                	add    BYTE PTR [rax],al
  e94606:	4c 89 f7             	mov    rdi,r14
  e94609:	4c 89 fe             	mov    rsi,r15
  e9460c:	e8 5b 1d 01 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
  e94611:	48 8d 35 10 e3 b5 00 	lea    rsi,[rip+0xb5e310]        # 19f2928 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x9e7>
  e94618:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e9461f:	00 
  e94620:	e8 5d e0 06 00       	call   f02682 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc9a98>
  e94625:	48 8d bc 24 10 0c 00 	lea    rdi,[rsp+0xc10]
  e9462c:	00 
  e9462d:	48 8d 35 f4 e2 b5 00 	lea    rsi,[rip+0xb5e2f4]        # 19f2928 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x9e7>
  e94634:	48 8d 15 4d 2b b5 00 	lea    rdx,[rip+0xb52b4d]        # 19e7188 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1778>
  e9463b:	e8 7a e0 06 00       	call   f026ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc9ad0>
  e94640:	48 8d bc 24 90 0f 00 	lea    rdi,[rsp+0xf90]
  e94647:	00 
  e94648:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
  e9464f:	00 
  e94650:	6a 02                	push   0x2
  e94652:	5a                   	pop    rdx
  e94653:	e8 e8 45 06 00       	call   ef8c40 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0056>
  e94658:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
  e9465f:	00 
  e94660:	48 8d b4 24 10 0e 00 	lea    rsi,[rsp+0xe10]
  e94667:	00 
  e94668:	48 8d 94 24 90 0f 00 	lea    rdx,[rsp+0xf90]
  e9466f:	00 
  e94670:	e8 76 3e 7e 00       	call   16784eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c657>
  e94675:	48 8d bc 24 90 0f 00 	lea    rdi,[rsp+0xf90]
  e9467c:	00 
  e9467d:	e8 de 46 06 00       	call   ef8d60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0176>
  e94682:	6a 30                	push   0x30
  e94684:	5b                   	pop    rbx
  e94685:	48 8d 3c 1c          	lea    rdi,[rsp+rbx*1]
  e94689:	48 81 c7 e0 0b 00 00 	add    rdi,0xbe0
  e94690:	e8 37 a1 c0 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
  e94695:	48 83 c3 d0          	add    rbx,0xffffffffffffffd0
  e94699:	48 83 fb d0          	cmp    rbx,0xffffffffffffffd0
  e9469d:	75 e6                	jne    e94685 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ba9b>
  e9469f:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
  e946a6:	00 
  e946a7:	e8 be 58 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e946ac:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e946b3:	00 
  e946b4:	4c 8d b4 24 30 0a 00 	lea    r14,[rsp+0xa30]
  e946bb:	00 
  e946bc:	4c 89 f6             	mov    rsi,r14
  e946bf:	e8 a8 1c 01 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
  e946c4:	48 8d 35 bd 2a b5 00 	lea    rsi,[rip+0xb52abd]        # 19e7188 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1778>
  e946cb:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
  e946d2:	00 
  e946d3:	e8 aa df 06 00       	call   f02682 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc9a98>
  e946d8:	48 8d bc 24 50 0f 00 	lea    rdi,[rsp+0xf50]
  e946df:	00 
  e946e0:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]
  e946e7:	00 
  e946e8:	6a 01                	push   0x1
  e946ea:	5a                   	pop    rdx
  e946eb:	e8 50 45 06 00       	call   ef8c40 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0056>
  e946f0:	48 8d bc 24 f0 0e 00 	lea    rdi,[rsp+0xef0]
  e946f7:	00 
  e946f8:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
  e946ff:	00 
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
  e9492d:	f0                   	lock
  e9492e:	48                   	rex.W
  e9492f:	ff                   	.byte 0xff

## All r12 definitions in window
  e947cb:	4c 8d 63 18          	lea    r12,[rbx+0x18]

## Wider previous r12 definitions e94000..e94930
  e94071:	48 8d 35 19 90 c0 ff 	lea    rsi,[rip+0xffffffffffc09019]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
  e94078:	48 8d 0d 07 8e 15 00 	lea    rcx,[rip+0x158e07]        # fece86 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b429c>
  e9407f:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
  e94086:	00 
  e94087:	6a 08                	push   0x8
  e94089:	41 59                	pop    r9
  e9408b:	4c 89 f7             	mov    rdi,r14
  e9408e:	31 d2                	xor    edx,edx
  e94090:	e8 ff 66 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e94095:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e94098:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
  e9409f:	00 
  e940a0:	48 89 de             	mov    rsi,rbx
  e940a3:	4c 89 f2             	mov    rdx,r14
  e940a6:	4c 8b a4 24 f8 00 00 	mov    r12,QWORD PTR [rsp+0xf8]
  e940ad:	00 
  e940ae:	ff 50 18             	call   QWORD PTR [rax+0x18]
  e940b1:	48 8d 9c 24 10 0e 00 	lea    rbx,[rsp+0xe10]
  e940b8:	00 
  e940b9:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
  e940be:	48 89 de             	mov    rsi,rbx
  e940c1:	e8 2c 5b 94 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
  e940c6:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  e940ca:	e8 b7 a3 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e940cf:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e940d6:	00 
  e940d7:	e8 0c 67 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e940dc:	48 8b bd d0 00 00 00 	mov    rdi,QWORD PTR [rbp+0xd0]
  e940e3:	e8 7a 63 be ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
  e940e8:	83 bd 50 01 00 00 00 	cmp    DWORD PTR [rbp+0x150],0x0
  e940ef:	0f 95 c1             	setne  cl
  e940f2:	20 c8                	and    al,cl
  e940f4:	3c 01                	cmp    al,0x1
  e940f6:	75 10                	jne    e94108 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b51e>
  e940f8:	48 8b bd 48 01 00 00 	mov    rdi,QWORD PTR [rbp+0x148]
  e940ff:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e94102:	6a 01                	push   0x1
  e94104:	5e                   	pop    rsi
  e94105:	ff 50 10             	call   QWORD PTR [rax+0x10]
  e94108:	49 8d 44 24 18       	lea    rax,[r12+0x18]
  e9410d:	4c 8b b5 98 00 00 00 	mov    r14,QWORD PTR [rbp+0x98]
  e94114:	48 89 c5             	mov    rbp,rax
  e94117:	4c 8d 84 24 50 10 00 	lea    r8,[rsp+0x1050]
--
  e9443e:	00 
  e9443f:	4c 89 ff             	mov    rdi,r15
  e94442:	48 89 de             	mov    rsi,rbx
  e94445:	e8 22 1f 01 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
  e9444a:	4c 8d b4 24 10 0e 00 	lea    r14,[rsp+0xe10]
  e94451:	00 
  e94452:	4c 89 f7             	mov    rdi,r14
  e94455:	4c 89 fe             	mov    rsi,r15
  e94458:	e8 0f 1f 01 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
  e9445d:	48 8d 35 c4 e4 b5 00 	lea    rsi,[rip+0xb5e4c4]        # 19f2928 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x9e7>
  e94464:	4c 8d bc 24 e0 0b 00 	lea    r15,[rsp+0xbe0]
  e9446b:	00 
  e9446c:	4c 89 ff             	mov    rdi,r15
  e9446f:	e8 0e e2 06 00       	call   f02682 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc9a98>
  e94474:	4c 8d a4 24 10 0c 00 	lea    r12,[rsp+0xc10]
  e9447b:	00 
  e9447c:	48 8d 35 a5 e4 b5 00 	lea    rsi,[rip+0xb5e4a5]        # 19f2928 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x9e7>
  e94483:	48 8d 15 fe 2c b5 00 	lea    rdx,[rip+0xb52cfe]        # 19e7188 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1778>
  e9448a:	4c 89 e7             	mov    rdi,r12
  e9448d:	e8 28 e2 06 00       	call   f026ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc9ad0>
  e94492:	4c 8d a4 24 40 0c 00 	lea    r12,[rsp+0xc40]
  e94499:	00 
  e9449a:	48 8d 35 9f e4 b5 00 	lea    rsi,[rip+0xb5e49f]        # 19f2940 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x9ff>
  e944a1:	4c 89 e7             	mov    rdi,r12
  e944a4:	e8 d9 e1 06 00       	call   f02682 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc9a98>
  e944a9:	4c 8d a4 24 70 0c 00 	lea    r12,[rsp+0xc70]
  e944b0:	00 
  e944b1:	48 8d 35 88 e4 b5 00 	lea    rsi,[rip+0xb5e488]        # 19f2940 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x9ff>
  e944b8:	48 8d 15 c9 2c b5 00 	lea    rdx,[rip+0xb52cc9]        # 19e7188 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1778>
  e944bf:	4c 89 e7             	mov    rdi,r12
  e944c2:	e8 f3 e1 06 00       	call   f026ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc9ad0>
  e944c7:	48 8d bc 24 c0 0e 00 	lea    rdi,[rsp+0xec0]
  e944ce:	00 
  e944cf:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
  e944d6:	00 
  e944d7:	6a 04                	push   0x4
  e944d9:	5a                   	pop    rdx
  e944da:	e8 61 47 06 00       	call   ef8c40 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0056>
  e944df:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
  e944e6:	00 
  e944e7:	48 8d b4 24 10 0e 00 	lea    rsi,[rsp+0xe10]
  e944ee:	00 
  e944ef:	48 8d 94 24 c0 0e 00 	lea    rdx,[rsp+0xec0]
  e944f6:	00 
  e944f7:	e8 ef 3f 7e 00       	call   16784eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c657>
  e944fc:	48 8d bc 24 c0 0e 00 	lea    rdi,[rsp+0xec0]
  e94503:	00 
  e94504:	e8 57 48 06 00       	call   ef8d60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0176>
  e94509:	41 be 90 00 00 00    	mov    r14d,0x90
  e9450f:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
  e94513:	48 81 c7 e0 0b 00 00 	add    rdi,0xbe0
  e9451a:	e8 ad a2 c0 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
  e9451f:	49 83 c6 d0          	add    r14,0xffffffffffffffd0
  e94523:	49 83 fe d0          	cmp    r14,0xffffffffffffffd0
--
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

## AP materializations near last r12 definition
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
--
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
  e9492d:	f0                   	lock
  e9492e:	48                   	rex.W
  e9492f:	ff                   	.byte 0xff
