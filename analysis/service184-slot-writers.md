# Service-184 slot +0x5c0 candidate writers

## 0x11a3500..0x11a3740

/tmp/s184w/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000011a3500 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a916>:
 11a3500:	45 60                	rex.RB (bad)
 11a3502:	01 00                	add    DWORD PTR [rax],eax
 11a3504:	00 00                	add    BYTE PTR [rax],al
 11a3506:	eb 3d                	jmp    11a3545 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a95b>
 11a3508:	31 c0                	xor    eax,eax
 11a350a:	4c 8d ac 24 80 00 00 	lea    r13,[rsp+0x80]
 11a3511:	00 
 11a3512:	41 88 45 c8          	mov    BYTE PTR [r13-0x38],al
 11a3516:	48 8d b3 48 05 00 00 	lea    rsi,[rbx+0x548]
 11a351d:	0f 57 c0             	xorps  xmm0,xmm0
 11a3520:	41 0f 29 45 a0       	movaps XMMWORD PTR [r13-0x60],xmm0
 11a3525:	41 0f 29 45 b0       	movaps XMMWORD PTR [r13-0x50],xmm0
 11a352a:	41 88 45 c0          	mov    BYTE PTR [r13-0x40],al
 11a352e:	41 0f 29 45 d0       	movaps XMMWORD PTR [r13-0x30],xmm0
 11a3533:	41 0f 29 45 e0       	movaps XMMWORD PTR [r13-0x20],xmm0
 11a3538:	41 0f 11 45 e9       	movups XMMWORD PTR [r13-0x17],xmm0
 11a353d:	4c 89 ef             	mov    rdi,r13
 11a3540:	e8 e7 10 00 00       	call   11a462c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ba42>
 11a3545:	0f 57 c0             	xorps  xmm0,xmm0
 11a3548:	41 0f 11 45 68       	movups XMMWORD PTR [r13+0x68],xmm0
 11a354d:	49 83 65 78 00       	and    QWORD PTR [r13+0x78],0x0
 11a3552:	49 83 a5 88 00 00 00 	and    QWORD PTR [r13+0x88],0x0
 11a3559:	00 
 11a355a:	48 8d 05 bf 0f 6f 00 	lea    rax,[rip+0x6f0fbf]        # 1894520 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1460>
 11a3561:	49 89 85 80 00 00 00 	mov    QWORD PTR [r13+0x80],rax
 11a3568:	49 83 a5 e8 00 00 00 	and    QWORD PTR [r13+0xe8],0x0
 11a356f:	00 
 11a3570:	41 0f 29 85 90 00 00 	movaps XMMWORD PTR [r13+0x90],xmm0
 11a3577:	00 
 11a3578:	41 0f 29 85 a0 00 00 	movaps XMMWORD PTR [r13+0xa0],xmm0
 11a357f:	00 
 11a3580:	41 0f 29 85 b0 00 00 	movaps XMMWORD PTR [r13+0xb0],xmm0
 11a3587:	00 
 11a3588:	41 0f 29 85 c0 00 00 	movaps XMMWORD PTR [r13+0xc0],xmm0
 11a358f:	00 
 11a3590:	41 83 a5 e0 00 00 00 	and    DWORD PTR [r13+0xe0],0x0
 11a3597:	00 
 11a3598:	41 0f 29 85 d0 00 00 	movaps XMMWORD PTR [r13+0xd0],xmm0
 11a359f:	00 
 11a35a0:	8b 05 62 5d 84 00    	mov    eax,DWORD PTR [rip+0x845d62]        # 19e9308 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x38f8>
 11a35a6:	8d 48 01             	lea    ecx,[rax+0x1]
 11a35a9:	89 0d 59 5d 84 00    	mov    DWORD PTR [rip+0x845d59],ecx        # 19e9308 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x38f8>
 11a35af:	41 89 85 f0 00 00 00 	mov    DWORD PTR [r13+0xf0],eax
 11a35b6:	41 0f 11 85 f4 00 00 	movups XMMWORD PTR [r13+0xf4],xmm0
 11a35bd:	00 
 11a35be:	41 0f 11 85 04 01 00 	movups XMMWORD PTR [r13+0x104],xmm0
 11a35c5:	00 
 11a35c6:	49 89 ad 14 01 00 00 	mov    QWORD PTR [r13+0x114],rbp
 11a35cd:	41 0f 29 85 20 01 00 	movaps XMMWORD PTR [r13+0x120],xmm0
 11a35d4:	00 
 11a35d5:	49 83 a5 30 01 00 00 	and    QWORD PTR [r13+0x130],0x0
 11a35dc:	00 
 11a35dd:	4c 8d 6c 24 20       	lea    r13,[rsp+0x20]
 11a35e2:	4c 89 f7             	mov    rdi,r14
 11a35e5:	4c 89 ee             	mov    rsi,r13
 11a35e8:	e8 dd 0d 00 00       	call   11a43ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36b7e0>
 11a35ed:	4c 89 ef             	mov    rdi,r13
 11a35f0:	e8 13 f8 ff ff       	call   11a2e08 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a21e>
 11a35f5:	6a 48                	push   0x48
 11a35f7:	41 5d                	pop    r13
 11a35f9:	83 bb 80 06 00 00 02 	cmp    DWORD PTR [rbx+0x680],0x2
 11a3600:	0f 85 e9 01 00 00    	jne    11a37ef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ac05>
 11a3606:	41 8a 07             	mov    al,BYTE PTR [r15]
 11a3609:	88 83 40 05 00 00    	mov    BYTE PTR [rbx+0x540],al
 11a360f:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
 11a3614:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 11a3619:	48 85 c0             	test   rax,rax
 11a361c:	74 05                	je     11a3623 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36aa39>
 11a361e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
 11a3623:	48 8b bb b8 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5b8]
 11a362a:	0f 29 83 b0 05 00 00 	movaps XMMWORD PTR [rbx+0x5b0],xmm0
 11a3631:	e8 50 ae 8f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11a3636:	48 8b 73 30          	mov    rsi,QWORD PTR [rbx+0x30]
 11a363a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11a363d:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 11a3642:	6a 05                	push   0x5
 11a3644:	5a                   	pop    rdx
 11a3645:	ff 50 40             	call   QWORD PTR [rax+0x40]
 11a3648:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 11a364d:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
 11a3653:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]
 11a365a:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax
 11a3661:	48 85 ff             	test   rdi,rdi
 11a3664:	74 1c                	je     11a3682 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36aa98>
 11a3666:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11a3669:	ff 50 08             	call   QWORD PTR [rax+0x8]
 11a366c:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
 11a3671:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
 11a3677:	48 85 ff             	test   rdi,rdi
 11a367a:	74 06                	je     11a3682 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36aa98>
 11a367c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11a367f:	ff 50 08             	call   QWORD PTR [rax+0x8]
 11a3682:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]
 11a3689:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11a368c:	ff 50 10             	call   QWORD PTR [rax+0x10]
 11a368f:	48 8b bb 80 00 00 00 	mov    rdi,QWORD PTR [rbx+0x80]
 11a3696:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11a3699:	ff 50 30             	call   QWORD PTR [rax+0x30]
 11a369c:	48 89 83 30 06 00 00 	mov    QWORD PTR [rbx+0x630],rax
 11a36a3:	48 8b b3 e8 04 00 00 	mov    rsi,QWORD PTR [rbx+0x4e8]
 11a36aa:	48 8b 83 f8 04 00 00 	mov    rax,QWORD PTR [rbx+0x4f8]
 11a36b1:	48 29 f0             	sub    rax,rsi
 11a36b4:	48 99                	cqo
 11a36b6:	49 f7 fd             	idiv   r13
 11a36b9:	4c 39 e0             	cmp    rax,r12
 11a36bc:	73 51                	jae    11a370f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ab25>
 11a36be:	48 b8 8f e3 38 8e e3 	movabs rax,0x38e38e38e38e38f
 11a36c5:	38 8e 03 
 11a36c8:	49 39 c4             	cmp    r12,rax
 11a36cb:	0f 83 36 01 00 00    	jae    11a3807 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ac1d>
 11a36d1:	48 8d 8b f8 04 00 00 	lea    rcx,[rbx+0x4f8]
 11a36d8:	48 8b 83 f0 04 00 00 	mov    rax,QWORD PTR [rbx+0x4f0]
 11a36df:	48 29 f0             	sub    rax,rsi
 11a36e2:	48 99                	cqo
 11a36e4:	49 f7 fd             	idiv   r13
 11a36e7:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 11a36ec:	4c 89 e6             	mov    rsi,r12
 11a36ef:	48 89 c2             	mov    rdx,rax
 11a36f2:	e8 93 73 af ff       	call   c9aa8a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e7a2a>
 11a36f7:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
 11a36fc:	4c 89 f7             	mov    rdi,r14
 11a36ff:	4c 89 fe             	mov    rsi,r15
 11a3702:	e8 9b 0f 00 00       	call   11a46a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36bab8>
 11a3707:	4c 89 ff             	mov    rdi,r15
 11a370a:	e8 31 10 00 00       	call   11a4740 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36bb56>
 11a370f:	48 89 df             	mov    rdi,rbx
 11a3712:	4c 89 f6             	mov    rsi,r14
 11a3715:	e8 66 10 00 00       	call   11a4780 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36bb96>
 11a371a:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
 11a371f:	e8 62 ad 8f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11a3724:	8b 83 80 06 00 00    	mov    eax,DWORD PTR [rbx+0x680]
 11a372a:	83 f8 01             	cmp    eax,0x1
 11a372d:	0f 84 b7 fa ff ff    	je     11a31ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a600>
 11a3733:	83 f8 03             	cmp    eax,0x3
 11a3736:	74 2e                	je     11a3766 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ab7c>
 11a3738:	83 f8 02             	cmp    eax,0x2
 11a373b:	75 35                	jne    11a3772 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ab88>
 11a373d:	8b                   	.byte 0x8b
 11a373e:	83                   	.byte 0x83
 11a373f:	a8                   	.byte 0xa8

## 0x1333700..0x1333950

/tmp/s184w/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000001333700 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178c84>:
 1333700:	04 00                	add    al,0x0
 1333702:	00 48 89             	add    BYTE PTR [rax-0x77],cl
 1333705:	bc 24 80 00 00       	mov    esp,0x8024
 133370a:	00 e8                	add    al,ch
 133370c:	e6 62                	out    0x62,al
 133370e:	4a 00 48 8d          	rex.WX add BYTE PTR [rax-0x73],cl
 1333712:	bb a8 04 00 00       	mov    ebx,0x4a8
 1333717:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
 133371e:	00 
 133371f:	e8 d2 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 1333724:	48 8d bb b8 04 00 00 	lea    rdi,[rbx+0x4b8]
 133372b:	48 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdi
 1333732:	00 
 1333733:	e8 be 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 1333738:	48 8d bb c8 04 00 00 	lea    rdi,[rbx+0x4c8]
 133373f:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
 1333746:	00 
 1333747:	e8 aa 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 133374c:	48 83 a3 d8 04 00 00 	and    QWORD PTR [rbx+0x4d8],0x0
 1333753:	00 
 1333754:	48 83 a3 e8 04 00 00 	and    QWORD PTR [rbx+0x4e8],0x0
 133375b:	00 
 133375c:	48 83 a3 f8 04 00 00 	and    QWORD PTR [rbx+0x4f8],0x0
 1333763:	00 
 1333764:	48 83 a3 08 05 00 00 	and    QWORD PTR [rbx+0x508],0x0
 133376b:	00 
 133376c:	31 c0                	xor    eax,eax
 133376e:	88 83 18 05 00 00    	mov    BYTE PTR [rbx+0x518],al
 1333774:	88 83 38 05 00 00    	mov    BYTE PTR [rbx+0x538],al
 133377a:	88 83 40 05 00 00    	mov    BYTE PTR [rbx+0x540],al
 1333780:	88 83 60 05 00 00    	mov    BYTE PTR [rbx+0x560],al
 1333786:	0f 57 c0             	xorps  xmm0,xmm0
 1333789:	0f 11 83 68 05 00 00 	movups XMMWORD PTR [rbx+0x568],xmm0
 1333790:	0f 11 83 78 05 00 00 	movups XMMWORD PTR [rbx+0x578],xmm0
 1333797:	0f 11 83 88 05 00 00 	movups XMMWORD PTR [rbx+0x588],xmm0
 133379e:	c7 83 98 05 00 00 00 	mov    DWORD PTR [rbx+0x598],0x3f800000
 13337a5:	00 80 3f 
 13337a8:	66 0f 6f 84 24 50 01 	movdqa xmm0,XMMWORD PTR [rsp+0x150]
 13337af:	00 00 
 13337b1:	66 0f 7f 83 a0 05 00 	movdqa XMMWORD PTR [rbx+0x5a0],xmm0
 13337b8:	00 
 13337b9:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
 13337c0:	48 85 c0             	test   rax,rax
 13337c3:	74 05                	je     13337ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178d4e>
 13337c5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
 13337ca:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 13337cf:	48 8d 83 d8 04 00 00 	lea    rax,[rbx+0x4d8]
 13337d6:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
 13337db:	48 8d 83 f8 04 00 00 	lea    rax,[rbx+0x4f8]
 13337e2:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
 13337e7:	48 8d 83 18 05 00 00 	lea    rax,[rbx+0x518]
 13337ee:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
 13337f5:	00 
 13337f6:	48 8d 83 40 05 00 00 	lea    rax,[rbx+0x540]
 13337fd:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 1333802:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
 1333806:	48 89 ef             	mov    rdi,rbp
 1333809:	4c 89 bc 24 00 01 00 	mov    QWORD PTR [rsp+0x100],r15
 1333810:	00 
 1333811:	ff 50 50             	call   QWORD PTR [rax+0x50]
 1333814:	48 89 83 b0 05 00 00 	mov    QWORD PTR [rbx+0x5b0],rax
 133381b:	48 83 a4 24 e8 01 00 	and    QWORD PTR [rsp+0x1e8],0x0
 1333822:	00 00 
 1333824:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
 1333829:	48 89 83 b8 05 00 00 	mov    QWORD PTR [rbx+0x5b8],rax
 1333830:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 1333835:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax
 133383c:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
 1333841:	48 89 83 c8 05 00 00 	mov    QWORD PTR [rbx+0x5c8],rax
 1333848:	48 8d bb d0 05 00 00 	lea    rdi,[rbx+0x5d0]
 133384f:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
 1333854:	e8 9d 61 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 1333859:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]
 1333860:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1333863:	ff 50 20             	call   QWORD PTR [rax+0x20]
 1333866:	4c 89 74 24 70       	mov    QWORD PTR [rsp+0x70],r14
 133386b:	34 01                	xor    al,0x1
 133386d:	88 83 e0 05 00 00    	mov    BYTE PTR [rbx+0x5e0],al
 1333873:	48 83 a3 e8 05 00 00 	and    QWORD PTR [rbx+0x5e8],0x0
 133387a:	00 
 133387b:	48 8d bb f0 05 00 00 	lea    rdi,[rbx+0x5f0]
 1333882:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
 1333887:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
 133388c:	e8 31 de 48 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 1333891:	48 8d 35 48 92 0a ff 	lea    rsi,[rip+0xffffffffff0a9248]        # 3dcae0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x252f>
 1333898:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
 133389f:	00 
 13338a0:	e8 d9 61 74 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 13338a5:	4c 8d a4 24 f0 04 00 	lea    r12,[rsp+0x4f0]
 13338ac:	00 
 13338ad:	41 c6 04 24 00       	mov    BYTE PTR [r12],0x0
 13338b2:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 13338b7:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 13338ba:	4c 8d b4 24 10 04 00 	lea    r14,[rsp+0x410]
 13338c1:	00 
 13338c2:	4c 89 f6             	mov    rsi,r14
 13338c5:	4c 89 e2             	mov    rdx,r12
 13338c8:	e8 91 9e 85 ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>
 13338cd:	89 c5                	mov    ebp,eax
 13338cf:	4c 89 f7             	mov    rdi,r14
 13338d2:	e8 b9 a5 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 13338d7:	40 88 ab 00 06 00 00 	mov    BYTE PTR [rbx+0x600],bpl
 13338de:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 13338e3:	48 89 83 08 06 00 00 	mov    QWORD PTR [rbx+0x608],rax
 13338ea:	48 8b 84 24 48 01 00 	mov    rax,QWORD PTR [rsp+0x148]
 13338f1:	00 
 13338f2:	48 89 83 10 06 00 00 	mov    QWORD PTR [rbx+0x610],rax
 13338f9:	48 8d 83 18 06 00 00 	lea    rax,[rbx+0x618]
 1333900:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
 1333905:	80 b9 50 01 00 00 00 	cmp    BYTE PTR [rcx+0x150],0x0
 133390c:	74 0c                	je     133391a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178e9e>
 133390e:	66 0f ef c0          	pxor   xmm0,xmm0
 1333912:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
 1333916:	b0 01                	mov    al,0x1
 1333918:	eb 05                	jmp    133391f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178ea3>
 133391a:	c6 00 00             	mov    BYTE PTR [rax],0x0
 133391d:	31 c0                	xor    eax,eax
 133391f:	88 83 28 06 00 00    	mov    BYTE PTR [rbx+0x628],al
 1333925:	83 a3 30 06 00 00 00 	and    DWORD PTR [rbx+0x630],0x0
 133392c:	48 8d bb 38 06 00 00 	lea    rdi,[rbx+0x638]
 1333933:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
 1333938:	e8 b9 60 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 133393d:	66 0f ef c0          	pxor   xmm0,xmm0
 1333941:	f3 0f 7f 83 48 06 00 	movdqu XMMWORD PTR [rbx+0x648],xmm0
 1333948:	00 
 1333949:	48 8d bb 58 06 00 00 	lea    rdi,[rbx+0x658]

## 0x1089d80..0x1089f00

/tmp/s184w/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000001089d80 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251196>:
 1089d80:	89 df                	mov    edi,ebx
 1089d82:	5b                   	pop    rbx
 1089d83:	e9 a6 b5 63 00       	jmp    16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
 1089d88:	53                   	push   rbx
 1089d89:	48 89 fb             	mov    rbx,rdi
 1089d8c:	48 83 c7 58          	add    rdi,0x58
 1089d90:	e8 a5 b4 5d 00       	call   166523a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x193a6>
 1089d95:	48 89 df             	mov    rdi,rbx
 1089d98:	5b                   	pop    rbx
 1089d99:	e9 90 b5 63 00       	jmp    16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
 1089d9e:	41 56                	push   r14
 1089da0:	53                   	push   rbx
 1089da1:	50                   	push   rax
 1089da2:	49 89 f6             	mov    r14,rsi
 1089da5:	48 89 fb             	mov    rbx,rdi
 1089da8:	8b 46 08             	mov    eax,DWORD PTR [rsi+0x8]
 1089dab:	89 47 08             	mov    DWORD PTR [rdi+0x8],eax
 1089dae:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1089db1:	48 89 07             	mov    QWORD PTR [rdi],rax
 1089db4:	48 83 c7 10          	add    rdi,0x10
 1089db8:	48 83 c6 10          	add    rsi,0x10
 1089dbc:	e8 a5 3e 00 00       	call   108dc66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25507c>
 1089dc1:	0f 57 c9             	xorps  xmm1,xmm1
 1089dc4:	0f 11 8b 68 05 00 00 	movups XMMWORD PTR [rbx+0x568],xmm1
 1089dcb:	48 83 a3 78 05 00 00 	and    QWORD PTR [rbx+0x578],0x0
 1089dd2:	00 
 1089dd3:	49 8b 86 68 05 00 00 	mov    rax,QWORD PTR [r14+0x568]
 1089dda:	48 89 83 68 05 00 00 	mov    QWORD PTR [rbx+0x568],rax
 1089de1:	49 8b 86 70 05 00 00 	mov    rax,QWORD PTR [r14+0x570]
 1089de8:	48 89 83 70 05 00 00 	mov    QWORD PTR [rbx+0x570],rax
 1089def:	49 8b 86 78 05 00 00 	mov    rax,QWORD PTR [r14+0x578]
 1089df6:	48 89 83 78 05 00 00 	mov    QWORD PTR [rbx+0x578],rax
 1089dfd:	49 83 a6 78 05 00 00 	and    QWORD PTR [r14+0x578],0x0
 1089e04:	00 
 1089e05:	41 0f 11 8e 68 05 00 	movups XMMWORD PTR [r14+0x568],xmm1
 1089e0c:	00 
 1089e0d:	48 83 a3 90 05 00 00 	and    QWORD PTR [rbx+0x590],0x0
 1089e14:	00 
 1089e15:	0f 11 8b 80 05 00 00 	movups XMMWORD PTR [rbx+0x580],xmm1
 1089e1c:	49 8b 86 80 05 00 00 	mov    rax,QWORD PTR [r14+0x580]
 1089e23:	48 89 83 80 05 00 00 	mov    QWORD PTR [rbx+0x580],rax
 1089e2a:	49 8b 86 88 05 00 00 	mov    rax,QWORD PTR [r14+0x588]
 1089e31:	48 89 83 88 05 00 00 	mov    QWORD PTR [rbx+0x588],rax
 1089e38:	49 8b 86 90 05 00 00 	mov    rax,QWORD PTR [r14+0x590]
 1089e3f:	48 89 83 90 05 00 00 	mov    QWORD PTR [rbx+0x590],rax
 1089e46:	41 0f 11 8e 80 05 00 	movups XMMWORD PTR [r14+0x580],xmm1
 1089e4d:	00 
 1089e4e:	49 83 a6 90 05 00 00 	and    QWORD PTR [r14+0x590],0x0
 1089e55:	00 
 1089e56:	0f 11 8b 98 05 00 00 	movups XMMWORD PTR [rbx+0x598],xmm1
 1089e5d:	48 83 a3 a8 05 00 00 	and    QWORD PTR [rbx+0x5a8],0x0
 1089e64:	00 
 1089e65:	49 8b 86 98 05 00 00 	mov    rax,QWORD PTR [r14+0x598]
 1089e6c:	48 89 83 98 05 00 00 	mov    QWORD PTR [rbx+0x598],rax
 1089e73:	49 8b 86 a0 05 00 00 	mov    rax,QWORD PTR [r14+0x5a0]
 1089e7a:	48 89 83 a0 05 00 00 	mov    QWORD PTR [rbx+0x5a0],rax
 1089e81:	49 8b 86 a8 05 00 00 	mov    rax,QWORD PTR [r14+0x5a8]
 1089e88:	48 89 83 a8 05 00 00 	mov    QWORD PTR [rbx+0x5a8],rax
 1089e8f:	49 83 a6 a8 05 00 00 	and    QWORD PTR [r14+0x5a8],0x0
 1089e96:	00 
 1089e97:	41 0f 11 8e 98 05 00 	movups XMMWORD PTR [r14+0x598],xmm1
 1089e9e:	00 
 1089e9f:	49 8b 86 c0 05 00 00 	mov    rax,QWORD PTR [r14+0x5c0]
 1089ea6:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax
 1089ead:	41 0f 10 86 b0 05 00 	movups xmm0,XMMWORD PTR [r14+0x5b0]
 1089eb4:	00 
 1089eb5:	0f 11 83 b0 05 00 00 	movups XMMWORD PTR [rbx+0x5b0],xmm0
 1089ebc:	49 83 a6 c0 05 00 00 	and    QWORD PTR [r14+0x5c0],0x0
 1089ec3:	00 
 1089ec4:	41 0f 11 8e b0 05 00 	movups XMMWORD PTR [r14+0x5b0],xmm1
 1089ecb:	00 
 1089ecc:	be c8 05 00 00       	mov    esi,0x5c8
 1089ed1:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
 1089ed5:	4c 01 f6             	add    rsi,r14
 1089ed8:	e8 a1 3d 00 00       	call   108dc7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255094>
 1089edd:	49 8b 86 f8 05 00 00 	mov    rax,QWORD PTR [r14+0x5f8]
 1089ee4:	48 89 83 f8 05 00 00 	mov    QWORD PTR [rbx+0x5f8],rax
 1089eeb:	b8 00 06 00 00       	mov    eax,0x600
 1089ef0:	48 8d 0c 03          	lea    rcx,[rbx+rax*1]
 1089ef4:	49 8b 96 00 06 00 00 	mov    rdx,QWORD PTR [r14+0x600]
 1089efb:	48                   	rex.W
 1089efc:	89                   	.byte 0x89
 1089efd:	93                   	xchg   ebx,eax
 1089efe:	00 06                	add    BYTE PTR [rsi],al

## 0x122ac80..0x122ae20

/tmp/s184w/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

000000000122ac80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70204>:
 122ac80:	f4                   	hlt
 122ac81:	7b 00                	jnp    122ac83 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70207>
 122ac83:	84 c0                	test   al,al
 122ac85:	74 02                	je     122ac89 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7020d>
 122ac87:	5b                   	pop    rbx
 122ac88:	c3                   	ret
 122ac89:	48 8d 3d 10 f4 7b 00 	lea    rdi,[rip+0x7bf410]        # 19ea0a0 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0xcd8>
 122ac90:	e8 db 34 5c 00       	call   17ee170 <__cxa_guard_acquire@plt>
 122ac95:	85 c0                	test   eax,eax
 122ac97:	74 ee                	je     122ac87 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7020b>
 122ac99:	48 8d 1d 08 f4 7b 00 	lea    rbx,[rip+0x7bf408]        # 19ea0a8 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0xce0>
 122aca0:	ba a0 06 00 00       	mov    edx,0x6a0
 122aca5:	48 89 df             	mov    rdi,rbx
 122aca8:	31 f6                	xor    esi,esi
 122acaa:	e8 e1 3e 5c 00       	call   17eeb90 <memset@plt>
 122acaf:	48 89 df             	mov    rdi,rbx
 122acb2:	e8 23 00 00 00       	call   122acda <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7025e>
 122acb7:	48 8d 3d c6 dd fc ff 	lea    rdi,[rip+0xfffffffffffcddc6]        # 11f8a84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e008>
 122acbe:	48 8d 15 3b 93 5c 00 	lea    rdx,[rip+0x5c933b]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
 122acc5:	48 89 de             	mov    rsi,rbx
 122acc8:	e8 93 31 5c 00       	call   17ede60 <__cxa_atexit@plt>
 122accd:	48 8d 3d cc f3 7b 00 	lea    rdi,[rip+0x7bf3cc]        # 19ea0a0 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0xcd8>
 122acd4:	5b                   	pop    rbx
 122acd5:	e9 a6 34 5c 00       	jmp    17ee180 <__cxa_guard_release@plt>
 122acda:	55                   	push   rbp
 122acdb:	53                   	push   rbx
 122acdc:	50                   	push   rax
 122acdd:	48 89 fb             	mov    rbx,rdi
 122ace0:	31 ed                	xor    ebp,ebp
 122ace2:	40 88 6f 1c          	mov    BYTE PTR [rdi+0x1c],bpl
 122ace6:	40 88 6f 20          	mov    BYTE PTR [rdi+0x20],bpl
 122acea:	48 83 c7 28          	add    rdi,0x28
 122acee:	0f 57 c0             	xorps  xmm0,xmm0
 122acf1:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 122acf4:	0f 11 43 0a          	movups XMMWORD PTR [rbx+0xa],xmm0
 122acf8:	e8 4d b4 e7 ff       	call   10a614a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d560>
 122acfd:	83 a3 f0 03 00 00 00 	and    DWORD PTR [rbx+0x3f0],0x0
 122ad04:	83 a3 48 04 00 00 00 	and    DWORD PTR [rbx+0x448],0x0
 122ad0b:	66 83 a3 50 04 00 00 	and    WORD PTR [rbx+0x450],0x0
 122ad12:	00 
 122ad13:	48 8d 83 60 04 00 00 	lea    rax,[rbx+0x460]
 122ad1a:	0f 57 c0             	xorps  xmm0,xmm0
 122ad1d:	0f 11 83 60 04 00 00 	movups XMMWORD PTR [rbx+0x460],xmm0
 122ad24:	48 89 83 58 04 00 00 	mov    QWORD PTR [rbx+0x458],rax
 122ad2b:	48 8d bb 70 04 00 00 	lea    rdi,[rbx+0x470]
 122ad32:	40 88 ab 38 05 00 00 	mov    BYTE PTR [rbx+0x538],bpl
 122ad39:	40 88 ab 50 05 00 00 	mov    BYTE PTR [rbx+0x550],bpl
 122ad40:	ba c4 00 00 00       	mov    edx,0xc4
 122ad45:	31 f6                	xor    esi,esi
 122ad47:	e8 44 3e 5c 00       	call   17eeb90 <memset@plt>
 122ad4c:	40 88 ab b8 05 00 00 	mov    BYTE PTR [rbx+0x5b8],bpl
 122ad53:	40 88 ab f0 05 00 00 	mov    BYTE PTR [rbx+0x5f0],bpl
 122ad5a:	0f 57 c0             	xorps  xmm0,xmm0
 122ad5d:	0f 11 83 c0 05 00 00 	movups XMMWORD PTR [rbx+0x5c0],xmm0
 122ad64:	0f 11 83 c9 05 00 00 	movups XMMWORD PTR [rbx+0x5c9],xmm0
 122ad6b:	83 a3 f8 05 00 00 00 	and    DWORD PTR [rbx+0x5f8],0x0
 122ad72:	40 88 ab 00 06 00 00 	mov    BYTE PTR [rbx+0x600],bpl
 122ad79:	40 88 ab 18 06 00 00 	mov    BYTE PTR [rbx+0x618],bpl
 122ad80:	40 88 ab 20 06 00 00 	mov    BYTE PTR [rbx+0x620],bpl
 122ad87:	40 88 ab 40 06 00 00 	mov    BYTE PTR [rbx+0x640],bpl
 122ad8e:	48 83 a3 68 06 00 00 	and    QWORD PTR [rbx+0x668],0x0
 122ad95:	00 
 122ad96:	0f 11 83 48 06 00 00 	movups XMMWORD PTR [rbx+0x648],xmm0
 122ad9d:	0f 11 83 58 06 00 00 	movups XMMWORD PTR [rbx+0x658],xmm0
 122ada4:	0f 11 83 58 05 00 00 	movups XMMWORD PTR [rbx+0x558],xmm0
 122adab:	0f 11 83 68 05 00 00 	movups XMMWORD PTR [rbx+0x568],xmm0
 122adb2:	0f 11 83 78 05 00 00 	movups XMMWORD PTR [rbx+0x578],xmm0
 122adb9:	0f 11 83 88 05 00 00 	movups XMMWORD PTR [rbx+0x588],xmm0
 122adc0:	0f 11 83 91 05 00 00 	movups XMMWORD PTR [rbx+0x591],xmm0
 122adc7:	c7 83 70 06 00 00 00 	mov    DWORD PTR [rbx+0x670],0x3f800000
 122adce:	00 80 3f 
 122add1:	40 88 ab 80 06 00 00 	mov    BYTE PTR [rbx+0x680],bpl
 122add8:	48 83 a3 78 06 00 00 	and    QWORD PTR [rbx+0x678],0x0
 122addf:	00 
 122ade0:	0f 11 83 88 06 00 00 	movups XMMWORD PTR [rbx+0x688],xmm0
 122ade7:	48 83 a3 98 06 00 00 	and    QWORD PTR [rbx+0x698],0x0
 122adee:	00 
 122adef:	48 83 c4 08          	add    rsp,0x8
 122adf3:	5b                   	pop    rbx
 122adf4:	5d                   	pop    rbp
 122adf5:	c3                   	ret
 122adf6:	55                   	push   rbp
 122adf7:	41 57                	push   r15
 122adf9:	41 56                	push   r14
 122adfb:	41 55                	push   r13
 122adfd:	41 54                	push   r12
 122adff:	53                   	push   rbx
 122ae00:	48 81 ec 98 07 00 00 	sub    rsp,0x798
 122ae07:	4c 89 4c 24 38       	mov    QWORD PTR [rsp+0x38],r9
 122ae0c:	44 89 44 24 0c       	mov    DWORD PTR [rsp+0xc],r8d
 122ae11:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 122ae18:	00 00 
 122ae1a:	48                   	rex.W
 122ae1b:	89                   	.byte 0x89
 122ae1c:	84 24 90             	test   BYTE PTR [rax+rdx*4],ah
 122ae1f:	07                   	(bad)

## 0x12cb700..0x12cb900

/tmp/s184w/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000012cb700 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x110c84>:
 12cb700:	7c 24                	jl     12cb726 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x110caa>
 12cb702:	78 e8                	js     12cb6ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x110c70>
 12cb704:	ee                   	out    dx,al
 12cb705:	e2 50                	loop   12cb757 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x110cdb>
 12cb707:	00 48 8d             	add    BYTE PTR [rax-0x73],cl
 12cb70a:	bb 60 04 00 00       	mov    ebx,0x460
 12cb70f:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
 12cb714:	e8 dd e2 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 12cb719:	48 8d bb 70 04 00 00 	lea    rdi,[rbx+0x470]
 12cb720:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
 12cb725:	e8 cc e2 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 12cb72a:	48 8d bb 80 04 00 00 	lea    rdi,[rbx+0x480]
 12cb731:	48 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],rdi
 12cb736:	e8 bb e2 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 12cb73b:	48 83 a3 e8 04 00 00 	and    QWORD PTR [rbx+0x4e8],0x0
 12cb742:	00 
 12cb743:	48 83 a3 f8 04 00 00 	and    QWORD PTR [rbx+0x4f8],0x0
 12cb74a:	00 
 12cb74b:	48 83 a3 08 05 00 00 	and    QWORD PTR [rbx+0x508],0x0
 12cb752:	00 
 12cb753:	48 83 a3 18 05 00 00 	and    QWORD PTR [rbx+0x518],0x0
 12cb75a:	00 
 12cb75b:	48 83 a3 28 05 00 00 	and    QWORD PTR [rbx+0x528],0x0
 12cb762:	00 
 12cb763:	0f 57 c0             	xorps  xmm0,xmm0
 12cb766:	0f 11 83 90 04 00 00 	movups XMMWORD PTR [rbx+0x490],xmm0
 12cb76d:	0f 11 83 a0 04 00 00 	movups XMMWORD PTR [rbx+0x4a0],xmm0
 12cb774:	0f 11 83 b0 04 00 00 	movups XMMWORD PTR [rbx+0x4b0],xmm0
 12cb77b:	0f 11 83 c0 04 00 00 	movups XMMWORD PTR [rbx+0x4c0],xmm0
 12cb782:	0f 11 83 d0 04 00 00 	movups XMMWORD PTR [rbx+0x4d0],xmm0
 12cb789:	4d 8b 74 24 78       	mov    r14,QWORD PTR [r12+0x78]
 12cb78e:	6a 10                	push   0x10
 12cb790:	5f                   	pop    rdi
 12cb791:	e8 6a 27 52 00       	call   17edf00 <_Znwm@plt>
 12cb796:	48 8b ac 24 a8 01 00 	mov    rbp,QWORD PTR [rsp+0x1a8]
 12cb79d:	00 
 12cb79e:	48 8d 0d 1b 76 59 00 	lea    rcx,[rip+0x59761b]        # 1862dc0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1f4a8>
 12cb7a5:	48 89 08             	mov    QWORD PTR [rax],rcx
 12cb7a8:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
 12cb7ac:	48 89 83 38 05 00 00 	mov    QWORD PTR [rbx+0x538],rax
 12cb7b3:	0f 57 c0             	xorps  xmm0,xmm0
 12cb7b6:	0f 11 83 48 05 00 00 	movups XMMWORD PTR [rbx+0x548],xmm0
 12cb7bd:	0f 11 83 58 05 00 00 	movups XMMWORD PTR [rbx+0x558],xmm0
 12cb7c4:	83 a3 40 05 00 00 00 	and    DWORD PTR [rbx+0x540],0x0
 12cb7cb:	45 31 f6             	xor    r14d,r14d
 12cb7ce:	44 88 b3 44 05 00 00 	mov    BYTE PTR [rbx+0x544],r14b
 12cb7d5:	b8 00 00 80 3f       	mov    eax,0x3f800000
 12cb7da:	89 83 68 05 00 00    	mov    DWORD PTR [rbx+0x568],eax
 12cb7e0:	0f 11 83 70 05 00 00 	movups XMMWORD PTR [rbx+0x570],xmm0
 12cb7e7:	0f 11 83 80 05 00 00 	movups XMMWORD PTR [rbx+0x580],xmm0
 12cb7ee:	89 83 90 05 00 00    	mov    DWORD PTR [rbx+0x590],eax
 12cb7f4:	0f 11 83 98 05 00 00 	movups XMMWORD PTR [rbx+0x598],xmm0
 12cb7fb:	0f 11 83 a8 05 00 00 	movups XMMWORD PTR [rbx+0x5a8],xmm0
 12cb802:	89 83 b8 05 00 00    	mov    DWORD PTR [rbx+0x5b8],eax
 12cb808:	0f 11 83 c0 05 00 00 	movups XMMWORD PTR [rbx+0x5c0],xmm0
 12cb80f:	0f 11 83 d0 05 00 00 	movups XMMWORD PTR [rbx+0x5d0],xmm0
 12cb816:	89 83 e0 05 00 00    	mov    DWORD PTR [rbx+0x5e0],eax
 12cb81c:	66 83 a3 e8 05 00 00 	and    WORD PTR [rbx+0x5e8],0x0
 12cb823:	00 
 12cb824:	48 8d 8b 38 05 00 00 	lea    rcx,[rbx+0x538]
 12cb82b:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
 12cb830:	0f 11 83 00 06 00 00 	movups XMMWORD PTR [rbx+0x600],xmm0
 12cb837:	0f 11 83 f0 05 00 00 	movups XMMWORD PTR [rbx+0x5f0],xmm0
 12cb83e:	89 83 10 06 00 00    	mov    DWORD PTR [rbx+0x610],eax
 12cb844:	44 88 b3 18 06 00 00 	mov    BYTE PTR [rbx+0x618],r14b
 12cb84b:	83 a3 1c 06 00 00 00 	and    DWORD PTR [rbx+0x61c],0x0
 12cb852:	48 8d 8b 48 05 00 00 	lea    rcx,[rbx+0x548]
 12cb859:	48 89 4c 24 58       	mov    QWORD PTR [rsp+0x58],rcx
 12cb85e:	66 83 a3 20 06 00 00 	and    WORD PTR [rbx+0x620],0x0
 12cb865:	00 
 12cb866:	48 8d 8b 70 05 00 00 	lea    rcx,[rbx+0x570]
 12cb86d:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
 12cb872:	48 8d 8b f0 05 00 00 	lea    rcx,[rbx+0x5f0]
 12cb879:	48 89 4c 24 48       	mov    QWORD PTR [rsp+0x48],rcx
 12cb87e:	48 8d 8b 28 06 00 00 	lea    rcx,[rbx+0x628]
 12cb885:	48 89 4c 24 40       	mov    QWORD PTR [rsp+0x40],rcx
 12cb88a:	0f 11 83 38 06 00 00 	movups XMMWORD PTR [rbx+0x638],xmm0
 12cb891:	0f 11 83 28 06 00 00 	movups XMMWORD PTR [rbx+0x628],xmm0
 12cb898:	89 83 48 06 00 00    	mov    DWORD PTR [rbx+0x648],eax
 12cb89e:	4c 8d bb 50 06 00 00 	lea    r15,[rbx+0x650]
 12cb8a5:	49 8b b4 24 e8 00 00 	mov    rsi,QWORD PTR [r12+0xe8]
 12cb8ac:	00 
 12cb8ad:	4c 89 ff             	mov    rdi,r15
 12cb8b0:	e8 0d 5e 4f 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 12cb8b5:	44 88 b3 a8 06 00 00 	mov    BYTE PTR [rbx+0x6a8],r14b
 12cb8bc:	4c 8d ab b0 06 00 00 	lea    r13,[rbx+0x6b0]
 12cb8c3:	0f 57 c0             	xorps  xmm0,xmm0
 12cb8c6:	0f 11 83 60 06 00 00 	movups XMMWORD PTR [rbx+0x660],xmm0
 12cb8cd:	0f 11 83 70 06 00 00 	movups XMMWORD PTR [rbx+0x670],xmm0
 12cb8d4:	44 88 b3 80 06 00 00 	mov    BYTE PTR [rbx+0x680],r14b
 12cb8db:	49 8b b4 24 e8 00 00 	mov    rsi,QWORD PTR [r12+0xe8]
 12cb8e2:	00 
 12cb8e3:	4c 89 ef             	mov    rdi,r13
 12cb8e6:	e8 d7 5d 4f 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 12cb8eb:	0f 57 c0             	xorps  xmm0,xmm0
 12cb8ee:	0f 11 83 c0 06 00 00 	movups XMMWORD PTR [rbx+0x6c0],xmm0
 12cb8f5:	48 83 a3 d0 06 00 00 	and    QWORD PTR [rbx+0x6d0],0x0
 12cb8fc:	00 
 12cb8fd:	48                   	rex.W
 12cb8fe:	8b                   	.byte 0x8b
 12cb8ff:	45                   	rex.RB

## Accessor and nearby direct raw table use

/tmp/s184w/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>:
  b8f02e:	53                   	push   rbx
  b8f02f:	48 89 fb             	mov    rbx,rdi
  b8f032:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b8f036:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  b8f03a:	ba b8 00 00 00       	mov    edx,0xb8
  b8f03f:	e8 9a 32 fd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  b8f044:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  b8f047:	48 8b 80 c0 05 00 00 	mov    rax,QWORD PTR [rax+0x5c0]
  b8f04e:	48 85 c0             	test   rax,rax
  b8f051:	74 02                	je     b8f055 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbff5>
  b8f053:	5b                   	pop    rbx
  b8f054:	c3                   	ret
  b8f055:	e8 65 af ee ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b8f05a:	48 8d 05 67 f3 c7 00 	lea    rax,[rip+0xc7f367]        # 180e3c8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4088>
  b8f061:	48 89 07             	mov    QWORD PTR [rdi],rax
  b8f064:	48 83 c7 10          	add    rdi,0x10
  b8f068:	e9 bb ad ee ff       	jmp    a79e28 <JNI_OnUnload@@Base+0x16f5>
  b8f06d:	cc                   	int3

/tmp/s184w/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

000000000135c760 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1ce4>:
 135c760:	28 46 40             	sub    BYTE PTR [rsi+0x40],al
 135c763:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
 135c766:	48 85 c9             	test   rcx,rcx
 135c769:	74 05                	je     135c770 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1cf4>
 135c76b:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
 135c770:	c3                   	ret
 135c771:	cc                   	int3
 135c772:	48 8d 05 27 08 08 ff 	lea    rax,[rip+0xffffffffff080827]        # 3dcfa0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x29ef>
 135c779:	6a 01                	push   0x1
 135c77b:	5a                   	pop    rdx
 135c77c:	c3                   	ret
 135c77d:	cc                   	int3
 135c77e:	41 57                	push   r15
 135c780:	41 56                	push   r14
 135c782:	53                   	push   rbx
 135c783:	48 83 ec 20          	sub    rsp,0x20
 135c787:	49 89 ce             	mov    r14,rcx
 135c78a:	49 89 d7             	mov    r15,rdx
 135c78d:	48 89 fb             	mov    rbx,rdi
 135c790:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 135c797:	00 00 
 135c799:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 135c79e:	48 8b 79 08          	mov    rdi,QWORD PTR [rcx+0x8]
 135c7a2:	48 8b 71 10          	mov    rsi,QWORD PTR [rcx+0x10]
 135c7a6:	ba b8 00 00 00       	mov    edx,0xb8
 135c7ab:	e8 2e 5b 80 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
 135c7b0:	49 8b 06             	mov    rax,QWORD PTR [r14]
 135c7b3:	4c 8b b0 c0 05 00 00 	mov    r14,QWORD PTR [rax+0x5c0]
 135c7ba:	4c 89 f7             	mov    rdi,r14
 135c7bd:	e8 d8 a4 a8 ff       	call   de6c9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3d20>
 135c7c2:	49 8b 8f 90 00 00 00 	mov    rcx,QWORD PTR [r15+0x90]
 135c7c9:	49 8b b7 38 01 00 00 	mov    rsi,QWORD PTR [r15+0x138]
 135c7d0:	49 83 c6 20          	add    r14,0x20
 135c7d4:	4c 8d 44 24 08       	lea    r8,[rsp+0x8]
 135c7d9:	49 83 20 00          	and    QWORD PTR [r8],0x0
 135c7dd:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 135c7e2:	4c 89 f2             	mov    rdx,r14
 135c7e5:	e8 21 3e 96 ff       	call   cc060b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20d5ab>
 135c7ea:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 135c7ef:	48 89 03             	mov    QWORD PTR [rbx],rax
 135c7f2:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 135c7f7:	48 83 64 24 08 00    	and    QWORD PTR [rsp+0x8],0x0
 135c7fd:	48 85 ff             	test   rdi,rdi
 135c800:	74 06                	je     135c808 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1d8c>
 135c802:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 135c805:	ff 50 08             	call   QWORD PTR [rax+0x8]
 135c808:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 135c80f:	00 00 
 135c811:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 135c816:	75 3e                	jne    135c856 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1dda>
 135c818:	48 89 d8             	mov    rax,rbx
 135c81b:	48 83 c4 20          	add    rsp,0x20
 135c81f:	5b                   	pop    rbx
 135c820:	41 5e                	pop    r14
 135c822:	41 5f                	pop    r15
 135c824:	c3                   	ret
 135c825:	48 89 c3             	mov    rbx,rax
 135c828:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 135c82d:	48                   	rex.W
 135c82e:	83                   	.byte 0x83
 135c82f:	64                   	fs
