# Service184 selector-5 provider trace

Known site: [rbx+0x30] provider -> virtual +0x40(selector=5) -> result installed as service184.

## Context around 0x11a3645
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
     11a373d:	8b 83 a8 05 00 00    	mov    eax,DWORD PTR [rbx+0x5a8]
     11a3743:	83 f8 01             	cmp    eax,0x1
     11a3746:	75 0f                	jne    11a3757 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ab6d>
     11a3748:	48 81 c3 48 05 00 00 	add    rbx,0x548
     11a374f:	49 89 de             	mov    r14,rbx
     11a3752:	e9 93 fa ff ff       	jmp    11a31ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a600>
     11a3757:	80 7b 72 00          	cmp    BYTE PTR [rbx+0x72],0x0
     11a375b:	0f 85 89 fa ff ff    	jne    11a31ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a600>
     11a3761:	83 f8 02             	cmp    eax,0x2
     11a3764:	75 0c                	jne    11a3772 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ab88>
     11a3766:	4c 8d 35 3b 5b 84 00 	lea    r14,[rip+0x845b3b]        # 19e92a8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3898>
     11a376d:	e9 78 fa ff ff       	jmp    11a31ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a600>
     11a3772:	45 31 f6             	xor    r14d,r14d
     11a3775:	e9 70 fa ff ff       	jmp    11a31ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a600>
     11a377a:	48 8d 3d 7f 5b 84 00 	lea    rdi,[rip+0x845b7f]        # 19e9300 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x38f0>
     11a3781:	e8 ea a9 64 00       	call   17ee170 <__cxa_guard_acquire@plt>
     11a3786:	85 c0                	test   eax,eax
     11a3788:	0f 84 34 fa ff ff    	je     11a31c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a5d8>
     11a378e:	0f 57 c0             	xorps  xmm0,xmm0
     11a3791:	0f 11 05 10 5b 84 00 	movups XMMWORD PTR [rip+0x845b10],xmm0        # 19e92a8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3898>
     11a3798:	48 83 25 18 5b 84 00 	and    QWORD PTR [rip+0x845b18],0x0        # 19e92b8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x38a8>

## Context around 0x11a3636
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
     11a373d:	8b 83 a8 05 00 00    	mov    eax,DWORD PTR [rbx+0x5a8]
     11a3743:	83 f8 01             	cmp    eax,0x1
     11a3746:	75 0f                	jne    11a3757 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ab6d>
     11a3748:	48 81 c3 48 05 00 00 	add    rbx,0x548
     11a374f:	49 89 de             	mov    r14,rbx
     11a3752:	e9 93 fa ff ff       	jmp    11a31ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a600>
     11a3757:	80 7b 72 00          	cmp    BYTE PTR [rbx+0x72],0x0
     11a375b:	0f 85 89 fa ff ff    	jne    11a31ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a600>
     11a3761:	83 f8 02             	cmp    eax,0x2
     11a3764:	75 0c                	jne    11a3772 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ab88>
     11a3766:	4c 8d 35 3b 5b 84 00 	lea    r14,[rip+0x845b3b]        # 19e92a8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3898>
     11a376d:	e9 78 fa ff ff       	jmp    11a31ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a600>
     11a3772:	45 31 f6             	xor    r14d,r14d
     11a3775:	e9 70 fa ff ff       	jmp    11a31ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a600>
     11a377a:	48 8d 3d 7f 5b 84 00 	lea    rdi,[rip+0x845b7f]        # 19e9300 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x38f0>
     11a3781:	e8 ea a9 64 00       	call   17ee170 <__cxa_guard_acquire@plt>

## Context around 0x11a3653
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
     11a373d:	8b 83 a8 05 00 00    	mov    eax,DWORD PTR [rbx+0x5a8]
     11a3743:	83 f8 01             	cmp    eax,0x1
     11a3746:	75 0f                	jne    11a3757 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ab6d>
     11a3748:	48 81 c3 48 05 00 00 	add    rbx,0x548
     11a374f:	49 89 de             	mov    r14,rbx
     11a3752:	e9 93 fa ff ff       	jmp    11a31ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a600>
     11a3757:	80 7b 72 00          	cmp    BYTE PTR [rbx+0x72],0x0
     11a375b:	0f 85 89 fa ff ff    	jne    11a31ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a600>
     11a3761:	83 f8 02             	cmp    eax,0x2
     11a3764:	75 0c                	jne    11a3772 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ab88>
     11a3766:	4c 8d 35 3b 5b 84 00 	lea    r14,[rip+0x845b3b]        # 19e92a8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3898>
     11a376d:	e9 78 fa ff ff       	jmp    11a31ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a600>
     11a3772:	45 31 f6             	xor    r14d,r14d
     11a3775:	e9 70 fa ff ff       	jmp    11a31ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a600>
     11a377a:	48 8d 3d 7f 5b 84 00 	lea    rdi,[rip+0x845b7f]        # 19e9300 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x38f0>
     11a3781:	e8 ea a9 64 00       	call   17ee170 <__cxa_guard_acquire@plt>
     11a3786:	85 c0                	test   eax,eax
     11a3788:	0f 84 34 fa ff ff    	je     11a31c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a5d8>
     11a378e:	0f 57 c0             	xorps  xmm0,xmm0
     11a3791:	0f 11 05 10 5b 84 00 	movups XMMWORD PTR [rip+0x845b10],xmm0        # 19e92a8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3898>
     11a3798:	48 83 25 18 5b 84 00 	and    QWORD PTR [rip+0x845b18],0x0        # 19e92b8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x38a8>
     11a379f:	00 
     11a37a0:	48 8d 35 01 5b 84 00 	lea    rsi,[rip+0x845b01]        # 19e92a8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3898>
     11a37a7:	31 c0                	xor    eax,eax

## Containing FDE: (18493836, 18495534)
     11a318c:	55                   	push   rbp
     11a318d:	41 57                	push   r15
     11a318f:	41 56                	push   r14
     11a3191:	41 55                	push   r13
     11a3193:	41 54                	push   r12
     11a3195:	53                   	push   rbx
     11a3196:	48 81 ec c8 01 00 00 	sub    rsp,0x1c8
     11a319d:	49 89 f7             	mov    r15,rsi
     11a31a0:	48 89 fb             	mov    rbx,rdi
     11a31a3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11a31aa:	00 00 
     11a31ac:	48 89 84 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],rax
     11a31b3:	00 
     11a31b4:	8a 05 46 61 84 00    	mov    al,BYTE PTR [rip+0x846146]        # 19e9300 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x38f0>
     11a31ba:	84 c0                	test   al,al
     11a31bc:	0f 84 b8 05 00 00    	je     11a377a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ab90>
     11a31c2:	48 8d bb 90 07 00 00 	lea    rdi,[rbx+0x790]
     11a31c9:	e8 06 60 c3 ff       	call   dd91d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa625a>
     11a31ce:	4c 8d 35 d3 60 84 00 	lea    r14,[rip+0x8460d3]        # 19e92a8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3898>
     11a31d5:	84 c0                	test   al,al
     11a31d7:	75 11                	jne    11a31ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a600>
     11a31d9:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
     11a31dd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a31e0:	ff 90 70 01 00 00    	call   QWORD PTR [rax+0x170]
     11a31e6:	a8 01                	test   al,0x1
     11a31e8:	75 2c                	jne    11a3216 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a62c>
     11a31ea:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11a31f1:	00 00 
     11a31f3:	48 3b 84 24 c0 01 00 	cmp    rax,QWORD PTR [rsp+0x1c0]
     11a31fa:	00 
     11a31fb:	0f 85 1e 06 00 00    	jne    11a381f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ac35>
     11a3201:	4c 89 f0             	mov    rax,r14
     11a3204:	48 81 c4 c8 01 00 00 	add    rsp,0x1c8
     11a320b:	5b                   	pop    rbx
     11a320c:	41 5c                	pop    r12
     11a320e:	41 5d                	pop    r13
     11a3210:	41 5e                	pop    r14
     11a3212:	41 5f                	pop    r15
     11a3214:	5d                   	pop    rbp
     11a3215:	c3                   	ret
     11a3216:	4c 8d b3 e8 04 00 00 	lea    r14,[rbx+0x4e8]
     11a321d:	8b 83 80 06 00 00    	mov    eax,DWORD PTR [rbx+0x680]
     11a3223:	6a 48                	push   0x48
     11a3225:	59                   	pop    rcx
     11a3226:	83 f8 02             	cmp    eax,0x2
     11a3229:	74 28                	je     11a3253 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a669>
     11a322b:	83 f8 01             	cmp    eax,0x1
     11a322e:	74 0d                	je     11a323d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a653>
     11a3230:	85 c0                	test   eax,eax
     11a3232:	0f 85 f2 04 00 00    	jne    11a372a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ab40>
     11a3238:	4d 8b 26             	mov    r12,QWORD PTR [r14]
     11a323b:	eb 44                	jmp    11a3281 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a697>
     11a323d:	8a 83 40 05 00 00    	mov    al,BYTE PTR [rbx+0x540]
     11a3243:	41 3a 07             	cmp    al,BYTE PTR [r15]
     11a3246:	75 23                	jne    11a326b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a681>
     11a3248:	80 bb 88 06 00 00 00 	cmp    BYTE PTR [rbx+0x688],0x0
     11a324f:	74 99                	je     11a31ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a600>
     11a3251:	eb 18                	jmp    11a326b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a681>
     11a3253:	8a 83 40 05 00 00    	mov    al,BYTE PTR [rbx+0x540]
     11a3259:	41 3a 07             	cmp    al,BYTE PTR [r15]
     11a325c:	75 0d                	jne    11a326b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a681>
     11a325e:	80 bb 88 06 00 00 00 	cmp    BYTE PTR [rbx+0x688],0x0
     11a3265:	0f 84 d2 04 00 00    	je     11a373d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ab53>
     11a326b:	48 8b 83 f0 04 00 00 	mov    rax,QWORD PTR [rbx+0x4f0]
     11a3272:	48 2b 83 e8 04 00 00 	sub    rax,QWORD PTR [rbx+0x4e8]
     11a3279:	48 99                	cqo
     11a327b:	48 f7 f9             	idiv   rcx
     11a327e:	49 89 c4             	mov    r12,rax
     11a3281:	c6 83 88 06 00 00 00 	mov    BYTE PTR [rbx+0x688],0x0
     11a3288:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
     11a328c:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     11a3291:	e8 56 d2 4d 00       	call   16804ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34658>
     11a3296:	48 83 7c 24 10 00    	cmp    QWORD PTR [rsp+0x10],0x0
     11a329c:	0f 84 fa 01 00 00    	je     11a349c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a8b2>
     11a32a2:	80 bb 40 07 00 00 00 	cmp    BYTE PTR [rbx+0x740],0x0
     11a32a9:	0f 85 ed 01 00 00    	jne    11a349c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a8b2>
     11a32af:	8b 83 80 06 00 00    	mov    eax,DWORD PTR [rbx+0x680]
     11a32b5:	48 bd 00 00 00 00 00 	movabs rbp,0x3f80000000000000
     11a32bc:	00 80 3f 
     11a32bf:	83 f8 02             	cmp    eax,0x2
     11a32c2:	0f 84 40 02 00 00    	je     11a3508 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a91e>
     11a32c8:	83 f8 01             	cmp    eax,0x1
     11a32cb:	0f 84 f4 01 00 00    	je     11a34c5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a8db>
     11a32d1:	85 c0                	test   eax,eax
     11a32d3:	0f 85 16 05 00 00    	jne    11a37ef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ac05>
     11a32d9:	48 8d 35 93 f3 18 ff 	lea    rsi,[rip+0xffffffffff18f393]        # 332673 <_ZTSSt12bad_any_cast@@Base-0x5db55>
     11a32e0:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     11a32e5:	e8 94 67 8d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     11a32ea:	49 89 e5             	mov    r13,rsp
     11a32ed:	48 8d 6c 24 20       	lea    rbp,[rsp+0x20]
     11a32f2:	4c 89 ef             	mov    rdi,r13
     11a32f5:	48 89 ee             	mov    rsi,rbp
     11a32f8:	e8 17 d3 4f 00       	call   16a0614 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54780>
     11a32fd:	48 8d bb 90 06 00 00 	lea    rdi,[rbx+0x690]
     11a3304:	4c 89 ee             	mov    rsi,r13
     11a3307:	e8 10 65 91 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     11a330c:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     11a3310:	e8 71 b1 8f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11a3315:	48 89 ef             	mov    rdi,rbp
     11a3318:	e8 73 ab 64 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11a331d:	48 8d 35 4f f3 18 ff 	lea    rsi,[rip+0xffffffffff18f34f]        # 332673 <_ZTSSt12bad_any_cast@@Base-0x5db55>
     11a3324:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     11a3329:	e8 50 67 8d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     11a332e:	49 89 e5             	mov    r13,rsp
     11a3331:	48 8d 6c 24 20       	lea    rbp,[rsp+0x20]
     11a3336:	4c 89 ef             	mov    rdi,r13
     11a3339:	48 89 ee             	mov    rsi,rbp
     11a333c:	e8 19 c7 4f 00       	call   169fa5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53bc6>
     11a3341:	48 8d bb a0 06 00 00 	lea    rdi,[rbx+0x6a0]
     11a3348:	4c 89 ee             	mov    rsi,r13
     11a334b:	e8 cc 64 91 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     11a3350:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     11a3354:	e8 2d b1 8f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11a3359:	48 89 ef             	mov    rdi,rbp
     11a335c:	e8 2f ab 64 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11a3361:	4c 8b ab a0 06 00 00 	mov    r13,QWORD PTR [rbx+0x6a0]
     11a3368:	4d 85 ed             	test   r13,r13
     11a336b:	74 49                	je     11a33b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a7cc>
     11a336d:	48 8d 35 01 35 1b ff 	lea    rsi,[rip+0xffffffffff1b3501]        # 356875 <_ZTSSt12bad_any_cast@@Base-0x39953>
     11a3374:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     11a3379:	e8 00 67 8d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     11a337e:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     11a3382:	48 89 e5             	mov    rbp,rsp
     11a3385:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
     11a338a:	48 89 ef             	mov    rdi,rbp
     11a338d:	4c 89 ee             	mov    rsi,r13
     11a3390:	49 89 d5             	mov    r13,rdx
     11a3393:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11a3396:	48 8d bb b0 06 00 00 	lea    rdi,[rbx+0x6b0]
     11a339d:	48 89 ee             	mov    rsi,rbp
     11a33a0:	e8 77 64 91 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     11a33a5:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
     11a33a9:	e8 d8 b0 8f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11a33ae:	4c 89 ef             	mov    rdi,r13
     11a33b1:	e8 da aa 64 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11a33b6:	31 c0                	xor    eax,eax
     11a33b8:	4c 8d 6c 24 20       	lea    r13,[rsp+0x20]
     11a33bd:	41 88 45 28          	mov    BYTE PTR [r13+0x28],al
     11a33c1:	0f 57 c0             	xorps  xmm0,xmm0
     11a33c4:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0
     11a33c9:	41 0f 29 45 10       	movaps XMMWORD PTR [r13+0x10],xmm0
     11a33ce:	41 88 45 20          	mov    BYTE PTR [r13+0x20],al
     11a33d2:	41 0f 29 45 30       	movaps XMMWORD PTR [r13+0x30],xmm0
     11a33d7:	41 0f 29 45 40       	movaps XMMWORD PTR [r13+0x40],xmm0
     11a33dc:	41 0f 11 45 49       	movups XMMWORD PTR [r13+0x49],xmm0
     11a33e1:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11a33e4:	49 89 45 60          	mov    QWORD PTR [r13+0x60],rax
     11a33e8:	41 83 a5 c0 00 00 00 	and    DWORD PTR [r13+0xc0],0x0
     11a33ef:	00 
     11a33f0:	41 0f 11 85 c8 00 00 	movups XMMWORD PTR [r13+0xc8],xmm0
     11a33f7:	00 
     11a33f8:	49 83 a5 d8 00 00 00 	and    QWORD PTR [r13+0xd8],0x0
     11a33ff:	00 
     11a3400:	49 83 a5 e8 00 00 00 	and    QWORD PTR [r13+0xe8],0x0
     11a3407:	00 
     11a3408:	48 8d 05 11 11 6f 00 	lea    rax,[rip+0x6f1111]        # 1894520 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1460>
     11a340f:	49 89 85 e0 00 00 00 	mov    QWORD PTR [r13+0xe0],rax
     11a3416:	49 83 a5 48 01 00 00 	and    QWORD PTR [r13+0x148],0x0
     11a341d:	00 
     11a341e:	41 0f 29 85 f0 00 00 	movaps XMMWORD PTR [r13+0xf0],xmm0
     11a3425:	00 
     11a3426:	41 0f 29 85 00 01 00 	movaps XMMWORD PTR [r13+0x100],xmm0
     11a342d:	00 
     11a342e:	41 0f 29 85 10 01 00 	movaps XMMWORD PTR [r13+0x110],xmm0
     11a3435:	00 
     11a3436:	41 83 a5 40 01 00 00 	and    DWORD PTR [r13+0x140],0x0
     11a343d:	00 
     11a343e:	41 0f 29 85 20 01 00 	movaps XMMWORD PTR [r13+0x120],xmm0
     11a3445:	00 
     11a3446:	41 0f 29 85 30 01 00 	movaps XMMWORD PTR [r13+0x130],xmm0
     11a344d:	00 
     11a344e:	8b 05 b4 5e 84 00    	mov    eax,DWORD PTR [rip+0x845eb4]        # 19e9308 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x38f8>
     11a3454:	8d 48 01             	lea    ecx,[rax+0x1]
     11a3457:	89 0d ab 5e 84 00    	mov    DWORD PTR [rip+0x845eab],ecx        # 19e9308 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x38f8>
     11a345d:	41 89 85 50 01 00 00 	mov    DWORD PTR [r13+0x150],eax
     11a3464:	41 0f 11 85 54 01 00 	movups XMMWORD PTR [r13+0x154],xmm0
     11a346b:	00 
     11a346c:	41 0f 11 85 64 01 00 	movups XMMWORD PTR [r13+0x164],xmm0
     11a3473:	00 
     11a3474:	41 83 a5 74 01 00 00 	and    DWORD PTR [r13+0x174],0x0
     11a347b:	00 
     11a347c:	41 c7 85 78 01 00 00 	mov    DWORD PTR [r13+0x178],0x3f800000
     11a3483:	00 00 80 3f 
     11a3487:	41 0f 29 85 80 01 00 	movaps XMMWORD PTR [r13+0x180],xmm0
     11a348e:	00 
     11a348f:	49 83 a5 90 01 00 00 	and    QWORD PTR [r13+0x190],0x0
     11a3496:	00 
     11a3497:	e9 46 01 00 00       	jmp    11a35e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a9f8>
     11a349c:	e8 4f b9 64 00       	call   17eedf0 <_ZNSt6__ndk116generic_categoryEv@plt>
     11a34a1:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     11a34a6:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
     11a34ac:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     11a34b0:	4c 89 f7             	mov    rdi,r14
     11a34b3:	e8 aa 09 00 00       	call   11a3e62 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36b278>
     11a34b8:	48 89 df             	mov    rdi,rbx
     11a34bb:	e8 e2 09 00 00       	call   11a3ea2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36b2b8>
     11a34c0:	e9 55 02 00 00       	jmp    11a371a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ab30>
     11a34c5:	31 c0                	xor    eax,eax
     11a34c7:	4c 8d ac 24 80 00 00 	lea    r13,[rsp+0x80]
     11a34ce:	00 
     11a34cf:	41 88 45 c8          	mov    BYTE PTR [r13-0x38],al
     11a34d3:	0f 57 c0             	xorps  xmm0,xmm0
     11a34d6:	41 0f 29 45 a0       	movaps XMMWORD PTR [r13-0x60],xmm0
     11a34db:	41 0f 29 45 b0       	movaps XMMWORD PTR [r13-0x50],xmm0
     11a34e0:	41 88 45 c0          	mov    BYTE PTR [r13-0x40],al
     11a34e4:	41 0f 29 45 d0       	movaps XMMWORD PTR [r13-0x30],xmm0
     11a34e9:	41 0f 29 45 e0       	movaps XMMWORD PTR [r13-0x20],xmm0
     11a34ee:	41 0f 11 45 e9       	movups XMMWORD PTR [r13-0x17],xmm0
     11a34f3:	4c 89 ef             	mov    rdi,r13
     11a34f6:	4c 89 f6             	mov    rsi,r14
     11a34f9:	e8 10 11 00 00       	call   11a460e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ba24>
     11a34fe:	41 c7 45 60 01 00 00 	mov    DWORD PTR [r13+0x60],0x1
     11a3505:	00 
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
     11a373d:	8b 83 a8 05 00 00    	mov    eax,DWORD PTR [rbx+0x5a8]
     11a3743:	83 f8 01             	cmp    eax,0x1
     11a3746:	75 0f                	jne    11a3757 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ab6d>
     11a3748:	48 81 c3 48 05 00 00 	add    rbx,0x548
     11a374f:	49 89 de             	mov    r14,rbx
     11a3752:	e9 93 fa ff ff       	jmp    11a31ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a600>
     11a3757:	80 7b 72 00          	cmp    BYTE PTR [rbx+0x72],0x0
     11a375b:	0f 85 89 fa ff ff    	jne    11a31ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a600>
     11a3761:	83 f8 02             	cmp    eax,0x2
     11a3764:	75 0c                	jne    11a3772 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ab88>
     11a3766:	4c 8d 35 3b 5b 84 00 	lea    r14,[rip+0x845b3b]        # 19e92a8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3898>
     11a376d:	e9 78 fa ff ff       	jmp    11a31ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a600>
     11a3772:	45 31 f6             	xor    r14d,r14d
     11a3775:	e9 70 fa ff ff       	jmp    11a31ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a600>
     11a377a:	48 8d 3d 7f 5b 84 00 	lea    rdi,[rip+0x845b7f]        # 19e9300 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x38f0>
     11a3781:	e8 ea a9 64 00       	call   17ee170 <__cxa_guard_acquire@plt>
     11a3786:	85 c0                	test   eax,eax
     11a3788:	0f 84 34 fa ff ff    	je     11a31c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a5d8>
     11a378e:	0f 57 c0             	xorps  xmm0,xmm0
     11a3791:	0f 11 05 10 5b 84 00 	movups XMMWORD PTR [rip+0x845b10],xmm0        # 19e92a8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3898>
     11a3798:	48 83 25 18 5b 84 00 	and    QWORD PTR [rip+0x845b18],0x0        # 19e92b8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x38a8>
     11a379f:	00 
     11a37a0:	48 8d 35 01 5b 84 00 	lea    rsi,[rip+0x845b01]        # 19e92a8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3898>
     11a37a7:	31 c0                	xor    eax,eax
     11a37a9:	88 05 19 5b 84 00    	mov    BYTE PTR [rip+0x845b19],al        # 19e92c8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x38b8>
     11a37af:	88 05 1b 5b 84 00    	mov    BYTE PTR [rip+0x845b1b],al        # 19e92d0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x38c0>
     11a37b5:	0f 11 05 1c 5b 84 00 	movups XMMWORD PTR [rip+0x845b1c],xmm0        # 19e92d8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x38c8>
     11a37bc:	0f 11 05 25 5b 84 00 	movups XMMWORD PTR [rip+0x845b25],xmm0        # 19e92e8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x38d8>
     11a37c3:	48 83 25 2d 5b 84 00 	and    QWORD PTR [rip+0x845b2d],0x0        # 19e92f8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x38e8>
     11a37ca:	00 
     11a37cb:	48 8d 3d 8a 06 00 00 	lea    rdi,[rip+0x68a]        # 11a3e5c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36b272>
     11a37d2:	48 8d 15 27 08 65 00 	lea    rdx,[rip+0x650827]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     11a37d9:	e8 82 a6 64 00       	call   17ede60 <__cxa_atexit@plt>
     11a37de:	48 8d 3d 1b 5b 84 00 	lea    rdi,[rip+0x845b1b]        # 19e9300 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x38f0>
     11a37e5:	e8 96 a9 64 00       	call   17ee180 <__cxa_guard_release@plt>
     11a37ea:	e9 d3 f9 ff ff       	jmp    11a31c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a5d8>
     11a37ef:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11a37f6:	00 00 
     11a37f8:	48 3b 84 24 c0 01 00 	cmp    rax,QWORD PTR [rsp+0x1c0]
     11a37ff:	00 
     11a3800:	75 1d                	jne    11a381f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ac35>
     11a3802:	e8 9c b6 90 ff       	call   aaeea3 <JNI_OnUnload@@Base+0x36770>
     11a3807:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11a380e:	00 00 
     11a3810:	48 3b 84 24 c0 01 00 	cmp    rax,QWORD PTR [rsp+0x1c0]
     11a3817:	00 
     11a3818:	75 05                	jne    11a381f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ac35>
     11a381a:	e8 a1 0d 86 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
     11a381f:	e8 8c c2 64 00       	call   17efab0 <__stack_chk_fail@plt>
     11a3824:	eb 00                	jmp    11a3826 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ac3c>
     11a3826:	48 89 c7             	mov    rdi,rax
     11a3829:	e8 77 62 8d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

## Direct callers of containing FDE entry
## Candidate writes to provider field +0x30 in same object-family neighborhood
### 0x1180a13: mov    rsi,QWORD PTR [r14+0x30]; FDE=(18352460, 18352868)
     11809ec:	74 02                	je     11809f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x347e06>
     11809ee:	eb 79                	jmp    1180a69 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x347e7f>
     11809f0:	4d 8d 67 40          	lea    r12,[r15+0x40]
     11809f4:	48 89 e6             	mov    rsi,rsp
     11809f7:	4c 89 e7             	mov    rdi,r12
     11809fa:	e8 8f 11 98 ff       	call   b01b8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4eb2e>
     11809ff:	49 83 c7 48          	add    r15,0x48
     1180a03:	4c 39 f8             	cmp    rax,r15
     1180a06:	75 61                	jne    1180a69 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x347e7f>
     1180a08:	48 89 e6             	mov    rsi,rsp
     1180a0b:	4c 89 e7             	mov    rdi,r12
     1180a0e:	e8 fd 8b 9c ff       	call   b49610 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x965b0>
     1180a13:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
     1180a17:	41 8b 7e 28          	mov    edi,DWORD PTR [r14+0x28]
     1180a1b:	e8 00 ae 8f ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     1180a20:	84 c0                	test   al,al
     1180a22:	74 05                	je     1180a29 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x347e3f>
     1180a24:	40 b5 01             	mov    bpl,0x1
     1180a27:	eb 3d                	jmp    1180a66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x347e7c>
     1180a29:	49 83 c6 28          	add    r14,0x28
     1180a2d:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     1180a32:	4c 89 f6             	mov    rsi,r14
     1180a35:	e8 60 38 4e 00       	call   166429a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18406>
     1180a3a:	83 7b 1c 09          	cmp    DWORD PTR [rbx+0x1c],0x9
     1180a3e:	75 06                	jne    1180a46 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x347e5c>
     1180a40:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
     1180a44:	eb 07                	jmp    1180a4d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x347e63>
     1180a46:	48 8d 35 13 2e 7c 00 	lea    rsi,[rip+0x7c2e13]        # 1943860 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0xc4a8>
     1180a4d:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     1180a52:	e8 67 d6 43 00       	call   15be0be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x403642>
     1180a57:	89 c5                	mov    ebp,eax
     1180a59:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
     1180a60:	00 

### 0x1180bd0: mov    rsi,QWORD PTR [r14+0x30]; FDE=(18352972, 18354060)
     1180ba4:	89 d1                	mov    ecx,edx
     1180ba6:	83 fa 09             	cmp    edx,0x9
     1180ba9:	0f 87 e0 02 00 00    	ja     1180e8f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3482a5>
     1180baf:	89 c9                	mov    ecx,ecx
     1180bb1:	48 8d 15 e4 98 25 ff 	lea    rdx,[rip+0xffffffffff2598e4]        # 3da49c <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5081>
     1180bb8:	44 8b 04 8a          	mov    r8d,DWORD PTR [rdx+rcx*4]
     1180bbc:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
     1180bc0:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     1180bc5:	6a 04                	push   0x4
     1180bc7:	59                   	pop    rcx
     1180bc8:	4c 89 ea             	mov    rdx,r13
     1180bcb:	e8 54 29 43 00       	call   15b3524 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f8aa8>
     1180bd0:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
     1180bd4:	41 8b 7e 28          	mov    edi,DWORD PTR [r14+0x28]
     1180bd8:	e8 43 ac 8f ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     1180bdd:	84 c0                	test   al,al
     1180bdf:	74 2d                	je     1180c0e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x348024>
     1180be1:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
     1180be7:	e9 d5 00 00 00       	jmp    1180cc1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3480d7>
     1180bec:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1180bf3:	00 00 
     1180bf5:	48 3b 84 24 00 02 00 	cmp    rax,QWORD PTR [rsp+0x200]
     1180bfc:	00 
     1180bfd:	0f 85 84 03 00 00    	jne    1180f87 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34839d>
     1180c03:	0f 57 c0             	xorps  xmm0,xmm0
     1180c06:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     1180c09:	e9 6c 02 00 00       	jmp    1180e7a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x348290>
     1180c0e:	49 8d 76 28          	lea    rsi,[r14+0x28]
     1180c12:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
     1180c19:	00 
     1180c1a:	e8 7b 36 4e 00       	call   166429a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18406>
     1180c1f:	4c 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],r15
     1180c24:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]

### 0x1181f32: mov    rsi,QWORD PTR [r14+0x30]; FDE=(18357812, 18358275)
     1181f0b:	74 02                	je     1181f0f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x349325>
     1181f0d:	eb 79                	jmp    1181f88 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34939e>
     1181f0f:	4d 8d 67 40          	lea    r12,[r15+0x40]
     1181f13:	48 89 e6             	mov    rsi,rsp
     1181f16:	4c 89 e7             	mov    rdi,r12
     1181f19:	e8 70 fc 97 ff       	call   b01b8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4eb2e>
     1181f1e:	49 83 c7 48          	add    r15,0x48
     1181f22:	4c 39 f8             	cmp    rax,r15
     1181f25:	75 61                	jne    1181f88 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34939e>
     1181f27:	48 89 e6             	mov    rsi,rsp
     1181f2a:	4c 89 e7             	mov    rdi,r12
     1181f2d:	e8 de 76 9c ff       	call   b49610 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x965b0>
     1181f32:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
     1181f36:	41 8b 7e 28          	mov    edi,DWORD PTR [r14+0x28]
     1181f3a:	e8 e1 98 8f ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     1181f3f:	84 c0                	test   al,al
     1181f41:	74 05                	je     1181f48 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34935e>
     1181f43:	40 b5 01             	mov    bpl,0x1
     1181f46:	eb 3d                	jmp    1181f85 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34939b>
     1181f48:	49 83 c6 28          	add    r14,0x28
     1181f4c:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     1181f51:	4c 89 f6             	mov    rsi,r14
     1181f54:	e8 41 23 4e 00       	call   166429a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18406>
     1181f59:	83 7b 1c 05          	cmp    DWORD PTR [rbx+0x1c],0x5
     1181f5d:	75 06                	jne    1181f65 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34937b>
     1181f5f:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
     1181f63:	eb 07                	jmp    1181f6c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x349382>
     1181f65:	48 8d 35 b4 18 7c 00 	lea    rsi,[rip+0x7c18b4]        # 1943820 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0xc468>
     1181f6c:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     1181f71:	e8 48 c0 43 00       	call   15bdfbe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x403542>
     1181f76:	89 c5                	mov    ebp,eax
     1181f78:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
     1181f7f:	00 

### 0x1182108: mov    rsi,QWORD PTR [r14+0x30]; FDE=(18358406, 18359777)
     11820d9:	89 c9                	mov    ecx,ecx
     11820db:	48 8d 15 ba 83 25 ff 	lea    rdx,[rip+0xffffffffff2583ba]        # 3da49c <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5081>
     11820e2:	8b 2c 8a             	mov    ebp,DWORD PTR [rdx+rcx*4]
     11820e5:	49 8b 8f b8 00 00 00 	mov    rcx,QWORD PTR [r15+0xb8]
     11820ec:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
     11820f1:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
     11820f5:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     11820fa:	6a 06                	push   0x6
     11820fc:	59                   	pop    rcx
     11820fd:	4c 89 ea             	mov    rdx,r13
     1182100:	41 89 e8             	mov    r8d,ebp
     1182103:	e8 1c 14 43 00       	call   15b3524 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f8aa8>
     1182108:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
     118210c:	41 8b 7e 28          	mov    edi,DWORD PTR [r14+0x28]
     1182110:	e8 0b 97 8f ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     1182115:	84 c0                	test   al,al
     1182117:	74 2d                	je     1182146 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34955c>
     1182119:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
     118211f:	e9 20 01 00 00       	jmp    1182244 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34965a>
     1182124:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     118212b:	00 00 
     118212d:	48 3b 84 24 80 02 00 	cmp    rax,QWORD PTR [rsp+0x280]
     1182134:	00 
     1182135:	0f 85 a1 04 00 00    	jne    11825dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3499f2>
     118213b:	0f 57 c0             	xorps  xmm0,xmm0
     118213e:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     1182141:	e9 41 03 00 00       	jmp    1182487 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34989d>
     1182146:	49 8d 76 28          	lea    rsi,[r14+0x28]
     118214a:	48 8d bc 24 a8 01 00 	lea    rdi,[rsp+0x1a8]
     1182151:	00 
     1182152:	e8 43 21 4e 00       	call   166429a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18406>
     1182157:	0f 57 c0             	xorps  xmm0,xmm0
     118215a:	0f 11 44 24 38       	movups XMMWORD PTR [rsp+0x38],xmm0

### 0x11826c0: mov    rcx,QWORD PTR [rbx+0x30]; FDE=(18359778, 18361597)
     118269a:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     118269f:	ff 50 38             	call   QWORD PTR [rax+0x38]
     11826a2:	8d 48 01             	lea    ecx,[rax+0x1]
     11826a5:	31 d2                	xor    edx,edx
     11826a7:	83 f8 04             	cmp    eax,0x4
     11826aa:	0f 42 d1             	cmovb  edx,ecx
     11826ad:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     11826b2:	89 57 3c             	mov    DWORD PTR [rdi+0x3c],edx
     11826b5:	8b 47 10             	mov    eax,DWORD PTR [rdi+0x10]
     11826b8:	89 c1                	mov    ecx,eax
     11826ba:	83 c9 20             	or     ecx,0x20
     11826bd:	89 4f 10             	mov    DWORD PTR [rdi+0x10],ecx
     11826c0:	48 8b 4b 30          	mov    rcx,QWORD PTR [rbx+0x30]
     11826c4:	48 89 4f 40          	mov    QWORD PTR [rdi+0x40],rcx
     11826c8:	89 c1                	mov    ecx,eax
     11826ca:	83 c9 60             	or     ecx,0x60
     11826cd:	89 4f 10             	mov    DWORD PTR [rdi+0x10],ecx
     11826d0:	48 8b 4b 38          	mov    rcx,QWORD PTR [rbx+0x38]
     11826d4:	48 89 4f 48          	mov    QWORD PTR [rdi+0x48],rcx
     11826d8:	0d e0 00 00 00       	or     eax,0xe0
     11826dd:	89 47 10             	mov    DWORD PTR [rdi+0x10],eax
     11826e0:	48 89 d8             	mov    rax,rbx
     11826e3:	49 8b 9e b0 00 00 00 	mov    rbx,QWORD PTR [r14+0xb0]
     11826ea:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     11826ef:	48 8b 68 18          	mov    rbp,QWORD PTR [rax+0x18]
     11826f3:	48 83 e5 fc          	and    rbp,0xfffffffffffffffc
     11826f7:	e8 ac eb ff ff       	call   11812a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3486be>
     11826fc:	48 8d 54 24 50       	lea    rdx,[rsp+0x50]
     1182701:	48 83 62 08 00       	and    QWORD PTR [rdx+0x8],0x0
     1182706:	49 89 c4             	mov    r12,rax
     1182709:	48 8d 05 70 d4 70 00 	lea    rax,[rip+0x70d470]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>
     1182710:	48 89 02             	mov    QWORD PTR [rdx],rax
     1182713:	0f 57 c0             	xorps  xmm0,xmm0

### 0x1182aba: mov    rsi,QWORD PTR [rbx+0x30]; FDE=(18359778, 18361597)
     1182a87:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1182a8c:	e8 da cb 01 00       	call   119f66b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366a81>
     1182a91:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1182a96:	80 48 10 04          	or     BYTE PTR [rax+0x10],0x4
     1182a9a:	48 89 c7             	mov    rdi,rax
     1182a9d:	48 83 c7 28          	add    rdi,0x28
     1182aa1:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
     1182aa5:	f6 c2 01             	test   dl,0x1
     1182aa8:	0f 85 d3 01 00 00    	jne    1182c81 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34a097>
     1182aae:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     1182ab3:	e8 2e 2d 5e 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
     1182ab8:	eb 35                	jmp    1182aef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x349f05>
     1182aba:	48 8b 73 30          	mov    rsi,QWORD PTR [rbx+0x30]
     1182abe:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1182ac3:	e8 43 cc 01 00       	call   119f70b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366b21>
     1182ac8:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1182acd:	80 48 10 04          	or     BYTE PTR [rax+0x10],0x4
     1182ad1:	48 89 c7             	mov    rdi,rax
     1182ad4:	48 83 c7 28          	add    rdi,0x28
     1182ad8:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
     1182adc:	f6 c2 01             	test   dl,0x1
     1182adf:	0f 85 a8 01 00 00    	jne    1182c8d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34a0a3>
     1182ae5:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     1182aea:	e8 f7 2c 5e 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
     1182aef:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1182af4:	e8 97 b3 66 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1182af9:	48 8d 54 24 50       	lea    rdx,[rsp+0x50]
     1182afe:	48 83 62 08 00       	and    QWORD PTR [rdx+0x8],0x0
     1182b03:	48 8d 05 8e 55 71 00 	lea    rax,[rip+0x71558e]        # 1898098 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4fd8>
     1182b0a:	48 89 02             	mov    QWORD PTR [rdx],rax
     1182b0d:	0f 57 c0             	xorps  xmm0,xmm0
     1182b10:	0f 11 42 10          	movups XMMWORD PTR [rdx+0x10],xmm0
     1182b14:	0f 11 42 20          	movups XMMWORD PTR [rdx+0x20],xmm0

### 0x118301b: movups XMMWORD PTR [r15+0x30],xmm0; FDE=(18362266, 18362615)
     1182fe7:	48 89 df             	mov    rdi,rbx
     1182fea:	e8 79 90 b0 ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     1182fef:	eb 78                	jmp    1183069 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34a47f>
     1182ff1:	0f 57 c0             	xorps  xmm0,xmm0
     1182ff4:	4c 8d 7c 24 48       	lea    r15,[rsp+0x48]
     1182ff9:	41 0f 11 47 08       	movups XMMWORD PTR [r15+0x8],xmm0
     1182ffe:	48 8d 05 23 47 70 00 	lea    rax,[rip+0x704723]        # 1887728 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x400>
     1183005:	49 89 07             	mov    QWORD PTR [r15],rax
     1183008:	48 8d 05 e9 c7 2b ff 	lea    rax,[rip+0xffffffffff2bc7e9]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     118300f:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     1183013:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
     1183017:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
     118301b:	41 0f 11 47 30       	movups XMMWORD PTR [r15+0x30],xmm0
     1183020:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1183025:	e8 0c 88 8f ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     118302a:	4c 89 ff             	mov    rdi,r15
     118302d:	48 89 c6             	mov    rsi,rax
     1183030:	e8 1d c8 5f 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
     1183035:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     118303a:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
     118303f:	e8 cb d3 01 00       	call   11a040f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x367825>
     1183044:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     1183049:	4c 89 f6             	mov    rsi,r14
     118304c:	e8 4f cc 5f 00       	call   177fca0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e0c>
     1183051:	48 83 23 00          	and    QWORD PTR [rbx],0x0
     1183055:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     118305a:	e8 c5 75 02 00       	call   11aa624 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x371a3a>
     118305f:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     1183064:	e8 41 c1 93 ff       	call   abf1aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc14a>
     1183069:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     118306e:	e8 79 36 93 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
     1183073:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1183078:	e8 13 ae 66 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### 0x118324b: movups XMMWORD PTR [r15+0x30],xmm0; FDE=(18362826, 18363161)
     1183217:	48 89 df             	mov    rdi,rbx
     118321a:	e8 49 8e b0 ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     118321f:	eb 79                	jmp    118329a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34a6b0>
     1183221:	0f 57 c0             	xorps  xmm0,xmm0
     1183224:	4c 8d 7c 24 48       	lea    r15,[rsp+0x48]
     1183229:	41 0f 11 47 08       	movups XMMWORD PTR [r15+0x8],xmm0
     118322e:	48 8d 05 f3 44 70 00 	lea    rax,[rip+0x7044f3]        # 1887728 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x400>
     1183235:	49 89 07             	mov    QWORD PTR [r15],rax
     1183238:	48 8d 05 b9 c5 2b ff 	lea    rax,[rip+0xffffffffff2bc5b9]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     118323f:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     1183243:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
     1183247:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
     118324b:	41 0f 11 47 30       	movups XMMWORD PTR [r15+0x30],xmm0
     1183250:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1183255:	e8 dc 85 8f ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     118325a:	4c 89 ff             	mov    rdi,r15
     118325d:	48 89 c6             	mov    rsi,rax
     1183260:	e8 ed c5 5f 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
     1183265:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     118326a:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
     118326f:	e8 9b d1 01 00       	call   11a040f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x367825>
     1183274:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]
     1183279:	4c 89 f7             	mov    rdi,r14
     118327c:	4c 89 fe             	mov    rsi,r15
     118327f:	e8 12 40 fe ff       	call   1167296 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32e6ac>
     1183284:	48 83 23 00          	and    QWORD PTR [rbx],0x0
     1183288:	4c 89 ff             	mov    rdi,r15
     118328b:	e8 94 73 02 00       	call   11aa624 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x371a3a>
     1183290:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     1183295:	e8 10 bf 93 ff       	call   abf1aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc14a>
     118329a:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     118329f:	e8 48 34 93 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
     11832a4:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]

### 0x11839a5: mov    rsi,QWORD PTR [rbx+0x30]; FDE=(18364566, 18364983)
     118397d:	48 89 c6             	mov    rsi,rax
     1183980:	e8 ec 0c 00 00       	call   1184671 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34ba87>
     1183985:	84 c0                	test   al,al
     1183987:	74 5e                	je     11839e7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34adfd>
     1183989:	41 8b 74 24 48       	mov    esi,DWORD PTR [r12+0x48]
     118398e:	8b 7b 20             	mov    edi,DWORD PTR [rbx+0x20]
     1183991:	e8 9e 0d 00 00       	call   1184734 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34bb4a>
     1183996:	84 c0                	test   al,al
     1183998:	74 4d                	je     11839e7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34adfd>
     118399a:	48 89 e6             	mov    rsi,rsp
     118399d:	4c 89 ff             	mov    rdi,r15
     11839a0:	e8 6b 5c 9c ff       	call   b49610 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x965b0>
     11839a5:	48 8b 73 30          	mov    rsi,QWORD PTR [rbx+0x30]
     11839a9:	8b 7b 28             	mov    edi,DWORD PTR [rbx+0x28]
     11839ac:	e8 6f 7e 8f ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     11839b1:	40 b5 01             	mov    bpl,0x1
     11839b4:	84 c0                	test   al,al
     11839b6:	75 31                	jne    11839e9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34adff>
     11839b8:	48 83 c3 28          	add    rbx,0x28
     11839bc:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     11839c1:	48 89 de             	mov    rsi,rbx
     11839c4:	e8 d1 08 4e 00       	call   166429a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18406>
     11839c9:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     11839ce:	4c 89 e6             	mov    rsi,r12
     11839d1:	e8 cc 0f 00 00       	call   11849a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34bdb8>
     11839d6:	89 c5                	mov    ebp,eax
     11839d8:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
     11839df:	00 
     11839e0:	e8 03 7c 8f ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     11839e5:	eb 02                	jmp    11839e9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34adff>
     11839e7:	31 ed                	xor    ebp,ebp
     11839e9:	48 89 e7             	mov    rdi,rsp
     11839ec:	e8 9f a4 66 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### 0x1183fea: mov    rsi,QWORD PTR [rbx+0x30]; FDE=(18365028, 18367310)
     1183fb4:	48 83 60 08 00       	and    QWORD PTR [rax+0x8],0x0
     1183fb9:	0f 57 c0             	xorps  xmm0,xmm0
     1183fbc:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
     1183fc0:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
     1183fc4:	4c 89 70 40          	mov    QWORD PTR [rax+0x40],r14
     1183fc8:	48 83 60 58 00       	and    QWORD PTR [rax+0x58],0x0
     1183fcd:	0f 11 40 48          	movups XMMWORD PTR [rax+0x48],xmm0
     1183fd1:	48 8d 0d b0 36 6d 00 	lea    rcx,[rip+0x6d36b0]        # 1857688 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x13d70>
     1183fd8:	48 89 08             	mov    QWORD PTR [rax],rcx
     1183fdb:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     1183fe0:	e8 f9 08 00 00       	call   11848de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34bcf4>
     1183fe5:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     1183fea:	48 8b 73 30          	mov    rsi,QWORD PTR [rbx+0x30]
     1183fee:	8b 7b 28             	mov    edi,DWORD PTR [rbx+0x28]
     1183ff1:	e8 2a 78 8f ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     1183ff6:	84 c0                	test   al,al
     1183ff8:	74 12                	je     118400c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b422>
     1183ffa:	48 83 a4 24 88 00 00 	and    QWORD PTR [rsp+0x88],0x0
     1184001:	00 00 
     1184003:	4c 8b 34 24          	mov    r14,QWORD PTR [rsp]
     1184007:	e9 8f 00 00 00       	jmp    118409b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b4b1>
     118400c:	48 83 c3 28          	add    rbx,0x28
     1184010:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
     1184017:	00 
     1184018:	48 89 de             	mov    rsi,rbx
     118401b:	e8 7a 02 4e 00       	call   166429a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18406>
     1184020:	4c 8b 34 24          	mov    r14,QWORD PTR [rsp]
     1184024:	48 83 a4 24 00 01 00 	and    QWORD PTR [rsp+0x100],0x0
     118402b:	00 00 
     118402d:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0
     1184034:	00 00 
     1184036:	bf d8 00 00 00       	mov    edi,0xd8
     118403b:	e8 c0 9e 66 00       	call   17edf00 <_Znwm@plt>

### 0x1184418: lea    rdi,[rbx+0x30]; FDE=(18367310, 18368054)
     11843ed:	89 c1                	mov    ecx,eax
     11843ef:	83 c9 40             	or     ecx,0x40
     11843f2:	89 4b 10             	mov    DWORD PTR [rbx+0x10],ecx
     11843f5:	49 8b 4d 30          	mov    rcx,QWORD PTR [r13+0x30]
     11843f9:	48 89 4b 48          	mov    QWORD PTR [rbx+0x48],rcx
     11843fd:	89 c1                	mov    ecx,eax
     11843ff:	81 c9 c0 00 00 00    	or     ecx,0xc0
     1184405:	89 4b 10             	mov    DWORD PTR [rbx+0x10],ecx
     1184408:	49 8b 75 28          	mov    rsi,QWORD PTR [r13+0x28]
     118440c:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     1184410:	0d c8 00 00 00       	or     eax,0xc8
     1184415:	89 43 10             	mov    DWORD PTR [rbx+0x10],eax
     1184418:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     118441c:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     1184420:	f6 c2 01             	test   dl,0x1
     1184423:	0f 85 a3 01 00 00    	jne    11845cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b9e2>
     1184429:	e8 64 13 5e 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     118442e:	c7 43 3c 01 00 00 00 	mov    DWORD PTR [rbx+0x3c],0x1
     1184435:	80 4b 10 20          	or     BYTE PTR [rbx+0x10],0x20
     1184439:	41 83 7c 24 28 14    	cmp    DWORD PTR [r12+0x28],0x14
     118443f:	75 07                	jne    1184448 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b85e>
     1184441:	49 8b 44 24 20       	mov    rax,QWORD PTR [r12+0x20]
     1184446:	eb 2a                	jmp    1184472 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b888>
     1184448:	4c 89 e7             	mov    rdi,r12
     118444b:	e8 10 72 02 00       	call   11ab660 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372a76>
     1184450:	41 c7 44 24 28 14 00 	mov    DWORD PTR [r12+0x28],0x14
     1184457:	00 00 
     1184459:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     118445e:	40 f6 c7 01          	test   dil,0x1
     1184462:	0f 85 70 01 00 00    	jne    11845d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b9ee>
     1184468:	e8 c9 01 00 00       	call   1184636 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34ba4c>
     118446d:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
     1184472:	41 8b 4d 48          	mov    ecx,DWORD PTR [r13+0x48]

### 0x11846e1: mov    QWORD PTR [rbx+0x30],rax; FDE=(18368113, 18368308)
     11846b2:	e8 7a 0c 00 00       	call   1185331 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34c747>
     11846b7:	89 c5                	mov    ebp,eax
     11846b9:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     11846be:	e8 cd 97 66 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11846c3:	40 84 ed             	test   bpl,bpl
     11846c6:	74 21                	je     11846e9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34baff>
     11846c8:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     11846cc:	4c 89 f6             	mov    rsi,r14
     11846cf:	e8 52 e9 42 00       	call   15b3026 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f85aa>
     11846d4:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     11846d9:	48 89 07             	mov    QWORD PTR [rdi],rax
     11846dc:	e8 5f a4 66 00       	call   17eeb40 <_ZNSt6__ndk16chrono12system_clock9to_time_tERKNS0_10time_pointIS1_NS0_8durationIxNS_5ratioILl1ELl1000000EEEEEEE@plt>
     11846e1:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     11846e5:	80 4b 10 08          	or     BYTE PTR [rbx+0x10],0x8
     11846e9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11846f0:	00 00 
     11846f2:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     11846f7:	75 36                	jne    118472f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34bb45>
     11846f9:	89 e8                	mov    eax,ebp
     11846fb:	48 83 c4 28          	add    rsp,0x28
     11846ff:	5b                   	pop    rbx
     1184700:	41 5c                	pop    r12
     1184702:	41 5d                	pop    r13
     1184704:	41 5e                	pop    r14
     1184706:	41 5f                	pop    r15
     1184708:	5d                   	pop    rbp
     1184709:	c3                   	ret
     118470a:	48 89 c3             	mov    rbx,rax
     118470d:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1184712:	e8 79 97 66 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1184717:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     118471e:	00 00 
     1184720:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]

### 0x118477c: mov    r10,QWORD PTR [rbx+0x30]; FDE=(18368344, 18368441)
     118475a:	41 56                	push   r14
     118475c:	41 54                	push   r12
     118475e:	53                   	push   rbx
     118475f:	50                   	push   rax
     1184760:	48 89 cb             	mov    rbx,rcx
     1184763:	49 89 d6             	mov    r14,rdx
     1184766:	49 89 f7             	mov    r15,rsi
     1184769:	49 89 fc             	mov    r12,rdi
     118476c:	48 8b 79 20          	mov    rdi,QWORD PTR [rcx+0x20]
     1184770:	48 83 e7 fc          	and    rdi,0xfffffffffffffffc
     1184774:	e8 bd 70 8f ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1184779:	49 89 d0             	mov    r8,rdx
     118477c:	4c 8b 53 30          	mov    r10,QWORD PTR [rbx+0x30]
     1184780:	4c 8b 5b 38          	mov    r11,QWORD PTR [rbx+0x38]
     1184784:	4d 85 db             	test   r11,r11
     1184787:	4d 0f 4e da          	cmovle r11,r10
     118478b:	48 83 ec 08          	sub    rsp,0x8
     118478f:	4c 89 e7             	mov    rdi,r12
     1184792:	4c 89 fe             	mov    rsi,r15
     1184795:	4c 89 f2             	mov    rdx,r14
     1184798:	48 89 c1             	mov    rcx,rax
     118479b:	49 89 c1             	mov    r9,rax
     118479e:	41 53                	push   r11
     11847a0:	6a 00                	push   0x0
     11847a2:	41 52                	push   r10
     11847a4:	41 52                	push   r10
     11847a6:	41 50                	push   r8
     11847a8:	e8 92 ac 01 00       	call   119f43f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366855>
     11847ad:	48 83 c4 38          	add    rsp,0x38
     11847b1:	5b                   	pop    rbx
     11847b2:	41 5c                	pop    r12
     11847b4:	41 5e                	pop    r14
     11847b6:	41 5f                	pop    r15

### 0x118480a: mov    QWORD PTR [rbx+0x30],rax; FDE=(18368442, 18368601)
     11847dd:	40 f6 c6 01          	test   sil,0x1
     11847e1:	74 11                	je     11847f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34bc0a>
     11847e3:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
     11847e7:	48 83 e6 fe          	and    rsi,0xfffffffffffffffe
     11847eb:	48 83 c6 08          	add    rsi,0x8
     11847ef:	e8 0c 9d 5c 00       	call   174e500 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10266c>
     11847f4:	41 8b 46 10          	mov    eax,DWORD PTR [r14+0x10]
     11847f8:	89 43 28             	mov    DWORD PTR [rbx+0x28],eax
     11847fb:	83 63 2c 00          	and    DWORD PTR [rbx+0x2c],0x0
     11847ff:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
     1184803:	31 f6                	xor    esi,esi
     1184805:	e8 fc 64 92 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     118480a:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     118480e:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
     1184812:	31 f6                	xor    esi,esi
     1184814:	e8 ed 64 92 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1184819:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
     118481d:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     1184821:	31 f6                	xor    esi,esi
     1184823:	e8 de 64 92 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1184828:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
     118482c:	41 0f 10 46 30       	movups xmm0,XMMWORD PTR [r14+0x30]
     1184831:	41 0f 10 4e 3c       	movups xmm1,XMMWORD PTR [r14+0x3c]
     1184836:	0f 11 43 48          	movups XMMWORD PTR [rbx+0x48],xmm0
     118483a:	0f 11 4b 54          	movups XMMWORD PTR [rbx+0x54],xmm1
     118483e:	48 83 c4 08          	add    rsp,0x8
     1184842:	5b                   	pop    rbx
     1184843:	41 5e                	pop    r14
     1184845:	c3                   	ret
     1184846:	49 89 c6             	mov    r14,rax
     1184849:	48 89 df             	mov    rdi,rbx
     118484c:	e8 3f 96 66 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1184851:	4c 89 f7             	mov    rdi,r14

### 0x118482c: movups xmm0,XMMWORD PTR [r14+0x30]; FDE=(18368442, 18368601)
     11847ff:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
     1184803:	31 f6                	xor    esi,esi
     1184805:	e8 fc 64 92 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     118480a:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     118480e:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
     1184812:	31 f6                	xor    esi,esi
     1184814:	e8 ed 64 92 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1184819:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
     118481d:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     1184821:	31 f6                	xor    esi,esi
     1184823:	e8 de 64 92 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1184828:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
     118482c:	41 0f 10 46 30       	movups xmm0,XMMWORD PTR [r14+0x30]
     1184831:	41 0f 10 4e 3c       	movups xmm1,XMMWORD PTR [r14+0x3c]
     1184836:	0f 11 43 48          	movups XMMWORD PTR [rbx+0x48],xmm0
     118483a:	0f 11 4b 54          	movups XMMWORD PTR [rbx+0x54],xmm1
     118483e:	48 83 c4 08          	add    rsp,0x8
     1184842:	5b                   	pop    rbx
     1184843:	41 5e                	pop    r14
     1184845:	c3                   	ret
     1184846:	49 89 c6             	mov    r14,rax
     1184849:	48 89 df             	mov    rdi,rbx
     118484c:	e8 3f 96 66 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1184851:	4c 89 f7             	mov    rdi,r14
     1184854:	e8 77 b4 8e ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1184859:	cc                   	int3
     118485a:	41 56                	push   r14
     118485c:	53                   	push   rbx
     118485d:	50                   	push   rax
     118485e:	48 89 fb             	mov    rbx,rdi
     1184861:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
     1184865:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
     1184869:	4c 39 f7             	cmp    rdi,r14

### 0x1184b8f: movups XMMWORD PTR [r15+0x30],xmm0; FDE=(18369294, 18369648)
     1184b5b:	48 89 df             	mov    rdi,rbx
     1184b5e:	e8 05 75 b0 ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     1184b63:	eb 7d                	jmp    1184be2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34bff8>
     1184b65:	0f 57 c0             	xorps  xmm0,xmm0
     1184b68:	4c 8d 7c 24 48       	lea    r15,[rsp+0x48]
     1184b6d:	41 0f 11 47 08       	movups XMMWORD PTR [r15+0x8],xmm0
     1184b72:	48 8d 05 0f 49 6d 00 	lea    rax,[rip+0x6d490f]        # 1859488 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x15b70>
     1184b79:	49 89 07             	mov    QWORD PTR [r15],rax
     1184b7c:	48 8d 05 75 ac 2b ff 	lea    rax,[rip+0xffffffffff2bac75]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     1184b83:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     1184b87:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
     1184b8b:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
     1184b8f:	41 0f 11 47 30       	movups XMMWORD PTR [r15+0x30],xmm0
     1184b94:	41 0f 11 47 3c       	movups XMMWORD PTR [r15+0x3c],xmm0
     1184b99:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1184b9e:	e8 93 6c 8f ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1184ba3:	4c 89 ff             	mov    rdi,r15
     1184ba6:	48 89 c6             	mov    rsi,rax
     1184ba9:	e8 a4 ac 5f 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
     1184bae:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     1184bb3:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
     1184bb8:	e8 b1 b9 01 00       	call   11a056e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x367984>
     1184bbd:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     1184bc2:	4c 89 f6             	mov    rsi,r14
     1184bc5:	e8 d6 b0 5f 00       	call   177fca0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e0c>
     1184bca:	48 83 23 00          	and    QWORD PTR [rbx],0x0
     1184bce:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     1184bd3:	e8 4c 5a 02 00       	call   11aa624 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x371a3a>
     1184bd8:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     1184bdd:	e8 c8 a5 93 ff       	call   abf1aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc14a>
     1184be2:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     1184be7:	e8 00 1b 93 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
     1184bec:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]

### 0x1184dcd: movups XMMWORD PTR [r15+0x30],xmm0; FDE=(18369868, 18370208)
     1184d99:	48 89 df             	mov    rdi,rbx
     1184d9c:	e8 c7 72 b0 ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     1184da1:	eb 7e                	jmp    1184e21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34c237>
     1184da3:	0f 57 c0             	xorps  xmm0,xmm0
     1184da6:	4c 8d 7c 24 48       	lea    r15,[rsp+0x48]
     1184dab:	41 0f 11 47 08       	movups XMMWORD PTR [r15+0x8],xmm0
     1184db0:	48 8d 05 d1 46 6d 00 	lea    rax,[rip+0x6d46d1]        # 1859488 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x15b70>
     1184db7:	49 89 07             	mov    QWORD PTR [r15],rax
     1184dba:	48 8d 05 37 aa 2b ff 	lea    rax,[rip+0xffffffffff2baa37]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     1184dc1:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     1184dc5:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
     1184dc9:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
     1184dcd:	41 0f 11 47 30       	movups XMMWORD PTR [r15+0x30],xmm0
     1184dd2:	41 0f 11 47 3c       	movups XMMWORD PTR [r15+0x3c],xmm0
     1184dd7:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1184ddc:	e8 55 6a 8f ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1184de1:	4c 89 ff             	mov    rdi,r15
     1184de4:	48 89 c6             	mov    rsi,rax
     1184de7:	e8 66 aa 5f 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
     1184dec:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     1184df1:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
     1184df6:	e8 73 b7 01 00       	call   11a056e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x367984>
     1184dfb:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]
     1184e00:	4c 89 f7             	mov    rdi,r14
     1184e03:	4c 89 fe             	mov    rsi,r15
     1184e06:	e8 8b 24 fe ff       	call   1167296 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32e6ac>
     1184e0b:	48 83 23 00          	and    QWORD PTR [rbx],0x0
     1184e0f:	4c 89 ff             	mov    rdi,r15
     1184e12:	e8 0d 58 02 00       	call   11aa624 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x371a3a>
     1184e17:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     1184e1c:	e8 89 a3 93 ff       	call   abf1aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc14a>
     1184e21:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     1184e26:	e8 c1 18 93 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>

### 0x1185f13: mov    rsi,QWORD PTR [rbx+0x30]; FDE=(18374174, 18374603)
     1185ee3:	e8 25 0f 00 00       	call   1186e0d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34e223>
     1185ee8:	84 c0                	test   al,al
     1185eea:	0f 84 8e 00 00 00    	je     1185f7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d394>
     1185ef0:	49 8b 96 a8 00 00 00 	mov    rdx,QWORD PTR [r14+0xa8]
     1185ef7:	49 8b 74 24 68       	mov    rsi,QWORD PTR [r12+0x68]
     1185efc:	8b 7b 20             	mov    edi,DWORD PTR [rbx+0x20]
     1185eff:	e8 cc 0f 00 00       	call   1186ed0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34e2e6>
     1185f04:	84 c0                	test   al,al
     1185f06:	74 76                	je     1185f7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d394>
     1185f08:	48 89 e6             	mov    rsi,rsp
     1185f0b:	4c 89 ff             	mov    rdi,r15
     1185f0e:	e8 fd 36 9c ff       	call   b49610 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x965b0>
     1185f13:	48 8b 73 30          	mov    rsi,QWORD PTR [rbx+0x30]
     1185f17:	8b 7b 28             	mov    edi,DWORD PTR [rbx+0x28]
     1185f1a:	e8 01 59 8f ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     1185f1f:	40 b5 01             	mov    bpl,0x1
     1185f22:	84 c0                	test   al,al
     1185f24:	75 5a                	jne    1185f80 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d396>
     1185f26:	48 83 c3 28          	add    rbx,0x28
     1185f2a:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     1185f2f:	48 89 de             	mov    rsi,rbx
     1185f32:	e8 63 e3 4d 00       	call   166429a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18406>
     1185f37:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     1185f3c:	4c 89 e6             	mov    rsi,r12
     1185f3f:	e8 1c 13 00 00       	call   1187260 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34e676>
     1185f44:	89 c5                	mov    ebp,eax
     1185f46:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
     1185f4d:	00 
     1185f4e:	e8 95 56 8f ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     1185f53:	eb 2b                	jmp    1185f80 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d396>
     1185f55:	31 ed                	xor    ebp,ebp
     1185f57:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1185f5e:	00 00 

### 0x118664f: mov    rsi,QWORD PTR [rbx+0x30]; FDE=(18374654, 18377255)
     1186619:	48 83 60 08 00       	and    QWORD PTR [rax+0x8],0x0
     118661e:	0f 57 c0             	xorps  xmm0,xmm0
     1186621:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
     1186625:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
     1186629:	48 89 58 40          	mov    QWORD PTR [rax+0x40],rbx
     118662d:	48 83 60 58 00       	and    QWORD PTR [rax+0x58],0x0
     1186632:	0f 11 40 48          	movups XMMWORD PTR [rax+0x48],xmm0
     1186636:	48 8d 0d db 14 6d 00 	lea    rcx,[rip+0x6d14db]        # 1857b18 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x14200>
     118663d:	48 89 08             	mov    QWORD PTR [rax],rcx
     1186640:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     1186645:	e8 52 0b 00 00       	call   118719c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34e5b2>
     118664a:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     118664f:	48 8b 73 30          	mov    rsi,QWORD PTR [rbx+0x30]
     1186653:	8b 7b 28             	mov    edi,DWORD PTR [rbx+0x28]
     1186656:	e8 c5 51 8f ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     118665b:	84 c0                	test   al,al
     118665d:	74 0e                	je     118666d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34da83>
     118665f:	48 83 a4 24 c8 00 00 	and    QWORD PTR [rsp+0xc8],0x0
     1186666:	00 00 
     1186668:	e9 8b 00 00 00       	jmp    11866f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34db0e>
     118666d:	48 83 c3 28          	add    rbx,0x28
     1186671:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1186678:	00 
     1186679:	48 89 de             	mov    rsi,rbx
     118667c:	e8 19 dc 4d 00       	call   166429a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18406>
     1186681:	48 83 a4 24 48 01 00 	and    QWORD PTR [rsp+0x148],0x0
     1186688:	00 00 
     118668a:	48 83 a4 24 58 01 00 	and    QWORD PTR [rsp+0x158],0x0
     1186691:	00 00 
     1186693:	bf d8 00 00 00       	mov    edi,0xd8
     1186698:	e8 63 78 66 00       	call   17edf00 <_Znwm@plt>
     118669d:	49 89 c6             	mov    r14,rax
     11866a0:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]

### 0x1186a9b: mov    rsi,QWORD PTR [r14+0x30]; FDE=(18377256, 18378173)
     1186a6a:	75 06                	jne    1186a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34de88>
     1186a6c:	4d 8b 77 10          	mov    r14,QWORD PTR [r15+0x10]
     1186a70:	eb 07                	jmp    1186a79 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34de8f>
     1186a72:	4c 8d 35 87 85 78 00 	lea    r14,[rip+0x788587]        # 190f000 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x56410>
     1186a79:	49 8b 76 38          	mov    rsi,QWORD PTR [r14+0x38]
     1186a7d:	83 4b 10 01          	or     DWORD PTR [rbx+0x10],0x1
     1186a81:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     1186a85:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     1186a89:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     1186a8d:	f6 c2 01             	test   dl,0x1
     1186a90:	0f 85 7f 02 00 00    	jne    1186d15 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34e12b>
     1186a96:	e8 f7 ec 5d 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1186a9b:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
     1186a9f:	83 4b 10 02          	or     DWORD PTR [rbx+0x10],0x2
     1186aa3:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     1186aa7:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
     1186aab:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     1186aaf:	f6 c2 01             	test   dl,0x1
     1186ab2:	0f 85 69 02 00 00    	jne    1186d21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34e137>
     1186ab8:	e8 d5 ec 5d 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1186abd:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]
     1186ac1:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
     1186ac5:	8b 43 10             	mov    eax,DWORD PTR [rbx+0x10]
     1186ac8:	89 c1                	mov    ecx,eax
     1186aca:	83 c9 40             	or     ecx,0x40
     1186acd:	89 4b 10             	mov    DWORD PTR [rbx+0x10],ecx
     1186ad0:	49 8b 4e 58          	mov    rcx,QWORD PTR [r14+0x58]
     1186ad4:	48 89 4b 48          	mov    QWORD PTR [rbx+0x48],rcx
     1186ad8:	89 c1                	mov    ecx,eax
     1186ada:	81 c9 c0 00 00 00    	or     ecx,0xc0
     1186ae0:	89 4b 10             	mov    DWORD PTR [rbx+0x10],ecx
     1186ae3:	49 8b 76 48          	mov    rsi,QWORD PTR [r14+0x48]
     1186ae7:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc

### 0x1186af3: lea    rdi,[rbx+0x30]; FDE=(18377256, 18378173)
     1186ac8:	89 c1                	mov    ecx,eax
     1186aca:	83 c9 40             	or     ecx,0x40
     1186acd:	89 4b 10             	mov    DWORD PTR [rbx+0x10],ecx
     1186ad0:	49 8b 4e 58          	mov    rcx,QWORD PTR [r14+0x58]
     1186ad4:	48 89 4b 48          	mov    QWORD PTR [rbx+0x48],rcx
     1186ad8:	89 c1                	mov    ecx,eax
     1186ada:	81 c9 c0 00 00 00    	or     ecx,0xc0
     1186ae0:	89 4b 10             	mov    DWORD PTR [rbx+0x10],ecx
     1186ae3:	49 8b 76 48          	mov    rsi,QWORD PTR [r14+0x48]
     1186ae7:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     1186aeb:	0d c8 00 00 00       	or     eax,0xc8
     1186af0:	89 43 10             	mov    DWORD PTR [rbx+0x10],eax
     1186af3:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     1186af7:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     1186afb:	f6 c2 01             	test   dl,0x1
     1186afe:	0f 85 29 02 00 00    	jne    1186d2d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34e143>
     1186b04:	e8 89 ec 5d 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1186b09:	c7 43 3c 01 00 00 00 	mov    DWORD PTR [rbx+0x3c],0x1
     1186b10:	80 4b 10 20          	or     BYTE PTR [rbx+0x10],0x20
     1186b14:	41 83 7c 24 28 10    	cmp    DWORD PTR [r12+0x28],0x10
     1186b1a:	75 07                	jne    1186b23 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34df39>
     1186b1c:	4d 8b 6c 24 20       	mov    r13,QWORD PTR [r12+0x20]
     1186b21:	eb 2d                	jmp    1186b50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34df66>
     1186b23:	4c 89 e7             	mov    rdi,r12
     1186b26:	e8 35 4b 02 00       	call   11ab660 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372a76>
     1186b2b:	41 c7 44 24 28 10 00 	mov    DWORD PTR [r12+0x28],0x10
     1186b32:	00 00 
     1186b34:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     1186b39:	40 f6 c7 01          	test   dil,0x1
     1186b3d:	0f 85 0e 02 00 00    	jne    1186d51 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34e167>
     1186b43:	e8 76 02 00 00       	call   1186dbe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34e1d4>
     1186b48:	49 89 c5             	mov    r13,rax
     1186b4b:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax

### 0x118707a: lea    r15,[rbx+0x30]; FDE=(18378784, 18379025)
     1187049:	48 8d 05 f8 23 6d 00 	lea    rax,[rip+0x6d23f8]        # 1859448 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x15b30>
     1187050:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
     1187054:	48 8b 72 08          	mov    rsi,QWORD PTR [rdx+0x8]
     1187058:	40 f6 c6 01          	test   sil,0x1
     118705c:	74 11                	je     118706f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34e485>
     118705e:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
     1187062:	48 83 e6 fe          	and    rsi,0xfffffffffffffffe
     1187066:	48 83 c6 08          	add    rsi,0x8
     118706a:	e8 91 74 5c 00       	call   174e500 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10266c>
     118706f:	41 8b 46 10          	mov    eax,DWORD PTR [r14+0x10]
     1187073:	89 43 28             	mov    DWORD PTR [rbx+0x28],eax
     1187076:	83 63 2c 00          	and    DWORD PTR [rbx+0x2c],0x0
     118707a:	4c 8d 7b 30          	lea    r15,[rbx+0x30]
     118707e:	49 8d 56 18          	lea    rdx,[r14+0x18]
     1187082:	4c 89 ff             	mov    rdi,r15
     1187085:	31 f6                	xor    esi,esi
     1187087:	e8 ec 85 93 ff       	call   abf678 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc618>
     118708c:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
     1187090:	31 f6                	xor    esi,esi
     1187092:	e8 6f 3c 92 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1187097:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
     118709b:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]
     118709f:	31 f6                	xor    esi,esi
     11870a1:	e8 60 3c 92 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     11870a6:	48 89 43 50          	mov    QWORD PTR [rbx+0x50],rax
     11870aa:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
     11870ae:	31 f6                	xor    esi,esi
     11870b0:	e8 51 3c 92 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     11870b5:	48 89 43 58          	mov    QWORD PTR [rbx+0x58],rax
     11870b9:	49 8b 7e 48          	mov    rdi,QWORD PTR [r14+0x48]
     11870bd:	31 f6                	xor    esi,esi
     11870bf:	e8 42 3c 92 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     11870c4:	48 89 43 60          	mov    QWORD PTR [rbx+0x60],rax

### 0x118708c: mov    rdi,QWORD PTR [r14+0x30]; FDE=(18378784, 18379025)
     118705e:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
     1187062:	48 83 e6 fe          	and    rsi,0xfffffffffffffffe
     1187066:	48 83 c6 08          	add    rsi,0x8
     118706a:	e8 91 74 5c 00       	call   174e500 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10266c>
     118706f:	41 8b 46 10          	mov    eax,DWORD PTR [r14+0x10]
     1187073:	89 43 28             	mov    DWORD PTR [rbx+0x28],eax
     1187076:	83 63 2c 00          	and    DWORD PTR [rbx+0x2c],0x0
     118707a:	4c 8d 7b 30          	lea    r15,[rbx+0x30]
     118707e:	49 8d 56 18          	lea    rdx,[r14+0x18]
     1187082:	4c 89 ff             	mov    rdi,r15
     1187085:	31 f6                	xor    esi,esi
     1187087:	e8 ec 85 93 ff       	call   abf678 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc618>
     118708c:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
     1187090:	31 f6                	xor    esi,esi
     1187092:	e8 6f 3c 92 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1187097:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
     118709b:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]
     118709f:	31 f6                	xor    esi,esi
     11870a1:	e8 60 3c 92 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     11870a6:	48 89 43 50          	mov    QWORD PTR [rbx+0x50],rax
     11870aa:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
     11870ae:	31 f6                	xor    esi,esi
     11870b0:	e8 51 3c 92 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     11870b5:	48 89 43 58          	mov    QWORD PTR [rbx+0x58],rax
     11870b9:	49 8b 7e 48          	mov    rdi,QWORD PTR [r14+0x48]
     11870bd:	31 f6                	xor    esi,esi
     11870bf:	e8 42 3c 92 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     11870c4:	48 89 43 60          	mov    QWORD PTR [rbx+0x60],rax
     11870c8:	49 8b 7e 50          	mov    rdi,QWORD PTR [r14+0x50]
     11870cc:	31 f6                	xor    esi,esi
     11870ce:	e8 33 3c 92 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     11870d3:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
     11870d7:	41 0f 10 46 58       	movups xmm0,XMMWORD PTR [r14+0x58]

### 0x1187eae: lea    rdi,[rbx+0x30]; FDE=(18382143, 18383930)
     1187e7f:	00 
     1187e80:	83 4b 10 02          	or     DWORD PTR [rbx+0x10],0x2
     1187e84:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     1187e88:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
     1187e8c:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     1187e90:	f6 c2 01             	test   dl,0x1
     1187e93:	0f 85 de 04 00 00    	jne    1188377 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f78d>
     1187e99:	e8 f4 d8 5d 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1187e9e:	48 8b b4 24 b0 00 00 	mov    rsi,QWORD PTR [rsp+0xb0]
     1187ea5:	00 
     1187ea6:	83 4b 10 01          	or     DWORD PTR [rbx+0x10],0x1
     1187eaa:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     1187eae:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     1187eb2:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     1187eb6:	f6 c2 01             	test   dl,0x1
     1187eb9:	0f 85 c4 04 00 00    	jne    1188383 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f799>
     1187ebf:	e8 ce d8 5d 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1187ec4:	48 8b 84 24 c0 00 00 	mov    rax,QWORD PTR [rsp+0xc0]
     1187ecb:	00 
     1187ecc:	48 85 c0             	test   rax,rax
     1187ecf:	48 8d 2d 62 54 78 00 	lea    rbp,[rip+0x785462]        # 190d338 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x54748>
     1187ed6:	48 0f 44 c5          	cmove  rax,rbp
     1187eda:	48 8b 40 18          	mov    rax,QWORD PTR [rax+0x18]
     1187ede:	48 85 c0             	test   rax,rax
     1187ee1:	4c 8d 2d 28 54 78 00 	lea    r13,[rip+0x785428]        # 190d310 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x54720>
     1187ee8:	49 0f 44 c5          	cmove  rax,r13
     1187eec:	48 8b 78 18          	mov    rdi,QWORD PTR [rax+0x18]
     1187ef0:	4c 8d 64 24 70       	lea    r12,[rsp+0x70]
     1187ef5:	49 83 24 24 00       	and    QWORD PTR [r12],0x0
     1187efa:	48 8d 05 17 14 72 00 	lea    rax,[rip+0x721417]        # 18a9318 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x16258>
     1187f01:	49 89 44 24 f8       	mov    QWORD PTR [r12-0x8],rax
     1187f06:	48 83 e7 fc          	and    rdi,0xfffffffffffffffc
     1187f0a:	0f 57 c0             	xorps  xmm0,xmm0

### 0x1188958: mov    r12,QWORD PTR [r15+0x30]; FDE=(18385206, 18385409)
     1188933:	31 c0                	xor    eax,eax
     1188935:	c3                   	ret
     1188936:	41 57                	push   r15
     1188938:	41 56                	push   r14
     118893a:	41 55                	push   r13
     118893c:	41 54                	push   r12
     118893e:	53                   	push   rbx
     118893f:	48 8b 87 80 00 00 00 	mov    rax,QWORD PTR [rdi+0x80]
     1188946:	4c 8b 78 68          	mov    r15,QWORD PTR [rax+0x68]
     118894a:	49 83 bf 70 01 00 00 	cmp    QWORD PTR [r15+0x170],0x0
     1188951:	00 
     1188952:	0f 84 87 00 00 00    	je     11889df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34fdf5>
     1188958:	4d 8b 67 30          	mov    r12,QWORD PTR [r15+0x30]
     118895c:	4d 8b 6f 38          	mov    r13,QWORD PTR [r15+0x38]
     1188960:	4d 39 ec             	cmp    r12,r13
     1188963:	74 7a                	je     11889df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34fdf5>
     1188965:	4c 89 cb             	mov    rbx,r9
     1188968:	4d 89 c6             	mov    r14,r8
     118896b:	6a 04                	push   0x4
     118896d:	5e                   	pop    rsi
     118896e:	4c 89 c7             	mov    rdi,r8
     1188971:	e8 48 78 01 00       	call   11a01be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3675d4>
     1188976:	34 01                	xor    al,0x1
     1188978:	41 0f b7 4e 20       	movzx  ecx,WORD PTR [r14+0x20]
     118897d:	41 8a 97 94 01 00 00 	mov    dl,BYTE PTR [r15+0x194]
     1188984:	89 ce                	mov    esi,ecx
     1188986:	81 e6 02 c0 00 00    	and    esi,0xc002
     118898c:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
     1188990:	84 d2                	test   dl,dl
     1188992:	74 0d                	je     11889a1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34fdb7>
     1188994:	44 8b 47 0c          	mov    r8d,DWORD PTR [rdi+0xc]
     1188998:	45 3b 87 90 01 00 00 	cmp    r8d,DWORD PTR [r15+0x190]
     118899f:	72 35                	jb     11889d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34fdec>

### 0x1188d6e: mov    rsi,QWORD PTR [rbx+0x30]; FDE=(18385410, 18386444)
     1188d3e:	41 83 7e 1c 03       	cmp    DWORD PTR [r14+0x1c],0x3
     1188d43:	75 06                	jne    1188d4b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350161>
     1188d45:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     1188d49:	eb 07                	jmp    1188d52 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350168>
     1188d4b:	48 8d 05 6e 63 78 00 	lea    rax,[rip+0x78636e]        # 190f0c0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x564d0>
     1188d52:	48 8b 70 18          	mov    rsi,QWORD PTR [rax+0x18]
     1188d56:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     1188d5a:	49 83 c7 40          	add    r15,0x40
     1188d5e:	4c 89 ff             	mov    rdi,r15
     1188d61:	e8 f1 5e 01 00       	call   119ec57 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36606d>
     1188d66:	84 c0                	test   al,al
     1188d68:	0f 84 4d fe ff ff    	je     1188bbb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34ffd1>
     1188d6e:	48 8b 73 30          	mov    rsi,QWORD PTR [rbx+0x30]
     1188d72:	8b 7b 28             	mov    edi,DWORD PTR [rbx+0x28]
     1188d75:	e8 a6 2a 8f ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     1188d7a:	41 b5 01             	mov    r13b,0x1
     1188d7d:	84 c0                	test   al,al
     1188d7f:	0f 85 39 fe ff ff    	jne    1188bbe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34ffd4>
     1188d85:	48 83 c3 28          	add    rbx,0x28
     1188d89:	41 83 7e 1c 03       	cmp    DWORD PTR [r14+0x1c],0x3
     1188d8e:	75 06                	jne    1188d96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3501ac>
     1188d90:	4d 8b 76 10          	mov    r14,QWORD PTR [r14+0x10]
     1188d94:	eb 07                	jmp    1188d9d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3501b3>
     1188d96:	4c 8d 35 23 63 78 00 	lea    r14,[rip+0x786323]        # 190f0c0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x564d0>
     1188d9d:	4c 8d 7c 24 58       	lea    r15,[rsp+0x58]
     1188da2:	4c 89 ff             	mov    rdi,r15
     1188da5:	48 89 de             	mov    rsi,rbx
     1188da8:	e8 ed b4 4d 00       	call   166429a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18406>
     1188dad:	4c 89 ff             	mov    rdi,r15
     1188db0:	4c 89 f6             	mov    rsi,r14
     1188db3:	e8 c9 57 01 00       	call   119e581 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x365997>
     1188db8:	41 89 c5             	mov    r13d,eax
     1188dbb:	48 8d bc 24 18 01 00 	lea    rdi,[rsp+0x118]

### 0x1188e88: movups xmm0,XMMWORD PTR [rbx+0x30]; FDE=(18386444, 18386682)
     1188e57:	eb 07                	jmp    1188e60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350276>
     1188e59:	48 8d 1d 60 62 78 00 	lea    rbx,[rip+0x786260]        # 190f0c0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x564d0>
     1188e60:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
     1188e64:	48 83 e7 fc          	and    rdi,0xfffffffffffffffc
     1188e68:	e8 c9 29 8f ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1188e6d:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     1188e72:	49 89 d4             	mov    r12,rdx
     1188e75:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
     1188e79:	48 83 e7 fc          	and    rdi,0xfffffffffffffffc
     1188e7d:	e8 b4 29 8f ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1188e82:	49 89 c5             	mov    r13,rax
     1188e85:	48 89 d5             	mov    rbp,rdx
     1188e88:	0f 10 43 30          	movups xmm0,XMMWORD PTR [rbx+0x30]
     1188e8c:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     1188e91:	4c 8b 7b 40          	mov    r15,QWORD PTR [rbx+0x40]
     1188e95:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
     1188e99:	8b 73 50             	mov    esi,DWORD PTR [rbx+0x50]
     1188e9c:	e8 84 5d 01 00       	call   119ec25 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36603b>
     1188ea1:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     1188ea6:	4c 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],r15
     1188eab:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]
     1188eb0:	0f 11 44 24 08       	movups XMMWORD PTR [rsp+0x8],xmm0
     1188eb5:	48 89 2c 24          	mov    QWORD PTR [rsp],rbp
     1188eb9:	48 8d 7c 24 5c       	lea    rdi,[rsp+0x5c]
     1188ebe:	48 8b 74 24 38       	mov    rsi,QWORD PTR [rsp+0x38]
     1188ec3:	4c 89 f2             	mov    rdx,r14
     1188ec6:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     1188ecb:	4d 89 e0             	mov    r8,r12
     1188ece:	4d 89 e9             	mov    r9,r13
     1188ed1:	e8 fd 63 01 00       	call   119f2d3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3666e9>
     1188ed6:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     1188edd:	00 00 
     1188edf:	48 3b 4c 24 60       	cmp    rcx,QWORD PTR [rsp+0x60]

### 0x1189826: lea    rdi,[r15+0x30]; FDE=(18388108, 18392609)
     11897f0:	41 80 4e 10 20       	or     BYTE PTR [r14+0x10],0x20
     11897f5:	49 8b 74 24 18       	mov    rsi,QWORD PTR [r12+0x18]
     11897fa:	41 83 4f 10 20       	or     DWORD PTR [r15+0x10],0x20
     11897ff:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     1189803:	49 8d 7f 58          	lea    rdi,[r15+0x58]
     1189807:	49 8b 57 08          	mov    rdx,QWORD PTR [r15+0x8]
     118980b:	f6 c2 01             	test   dl,0x1
     118980e:	0f 85 4e 0b 00 00    	jne    118a362 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x351778>
     1189814:	e8 79 bf 5d 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1189819:	49 8b 75 28          	mov    rsi,QWORD PTR [r13+0x28]
     118981d:	41 83 4f 10 01       	or     DWORD PTR [r15+0x10],0x1
     1189822:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     1189826:	49 8d 7f 30          	lea    rdi,[r15+0x30]
     118982a:	49 8b 57 08          	mov    rdx,QWORD PTR [r15+0x8]
     118982e:	f6 c2 01             	test   dl,0x1
     1189831:	0f 85 37 0b 00 00    	jne    118a36e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x351784>
     1189837:	e8 56 bf 5d 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     118983c:	49 8b 74 24 28       	mov    rsi,QWORD PTR [r12+0x28]
     1189841:	41 83 4f 10 04       	or     DWORD PTR [r15+0x10],0x4
     1189846:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     118984a:	49 8d 7f 40          	lea    rdi,[r15+0x40]
     118984e:	49 8b 57 08          	mov    rdx,QWORD PTR [r15+0x8]
     1189852:	f6 c2 01             	test   dl,0x1
     1189855:	0f 85 1f 0b 00 00    	jne    118a37a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x351790>
     118985b:	e8 32 bf 5d 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1189860:	49 8b 74 24 30       	mov    rsi,QWORD PTR [r12+0x30]
     1189865:	41 83 4f 10 08       	or     DWORD PTR [r15+0x10],0x8
     118986a:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     118986e:	49 8d 7f 48          	lea    rdi,[r15+0x48]
     1189872:	49 8b 57 08          	mov    rdx,QWORD PTR [r15+0x8]
     1189876:	f6 c2 01             	test   dl,0x1
     1189879:	0f 85 07 0b 00 00    	jne    118a386 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35179c>
     118987f:	e8 0e bf 5d 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>

### 0x118ad99: mov    rdi,QWORD PTR [rbx+0x30]; FDE=(18393422, 18394827)
     118ad6c:	48 8d 7c 24 3c       	lea    rdi,[rsp+0x3c]
     118ad71:	48 89 ee             	mov    rsi,rbp
     118ad74:	4c 89 f2             	mov    rdx,r14
     118ad77:	4c 89 f9             	mov    rcx,r15
     118ad7a:	4d 89 e0             	mov    r8,r12
     118ad7d:	49 89 c1             	mov    r9,rax
     118ad80:	e8 4e 45 01 00       	call   119f2d3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3666e9>
     118ad85:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
     118ad8a:	48 89 06             	mov    QWORD PTR [rsi],rax
     118ad8d:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     118ad91:	4c 89 ef             	mov    rdi,r13
     118ad94:	e8 0f b2 95 ff       	call   ae5fa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x32f48>
     118ad99:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
     118ad9d:	48 8d b4 24 50 01 00 	lea    rsi,[rsp+0x150]
     118ada4:	00 
     118ada5:	e8 62 0f 00 00       	call   118bd0c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x353122>
     118adaa:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     118adaf:	e8 fa c6 96 ff       	call   af74ae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4444e>
     118adb4:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
     118adbb:	00 
     118adbc:	e8 1f ef 93 ff       	call   ac9ce0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16c80>
     118adc1:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     118adc8:	00 
     118adc9:	e8 be 08 00 00       	call   118b68c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x352aa2>
     118adce:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     118add5:	00 00 
     118add7:	48 3b 84 24 c0 01 00 	cmp    rax,QWORD PTR [rsp+0x1c0]
     118adde:	00 
     118addf:	0f 85 e1 00 00 00    	jne    118aec6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3522dc>
     118ade5:	48 81 c4 c8 01 00 00 	add    rsp,0x1c8
     118adec:	5b                   	pop    rbx
     118aded:	41 5c                	pop    r12
     118adef:	41 5d                	pop    r13

### 0x118c57a: mov    QWORD PTR [r14+0x30],r13; FDE=(18400418, 18400944)
     118c545:	e8 9c 92 5d 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
     118c54a:	48 8b ac 24 d0 00 00 	mov    rbp,QWORD PTR [rsp+0xd0]
     118c551:	00 
     118c552:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     118c557:	e8 34 19 66 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     118c55c:	41 80 4e 10 04       	or     BYTE PTR [r14+0x10],0x4
     118c561:	49 8d 7e 28          	lea    rdi,[r14+0x28]
     118c565:	49 8b 56 08          	mov    rdx,QWORD PTR [r14+0x8]
     118c569:	f6 c2 01             	test   dl,0x1
     118c56c:	0f 85 df 00 00 00    	jne    118c651 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x353a67>
     118c572:	48 89 ee             	mov    rsi,rbp
     118c575:	e8 18 92 5d 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     118c57a:	4d 89 6e 30          	mov    QWORD PTR [r14+0x30],r13
     118c57e:	4d 89 66 38          	mov    QWORD PTR [r14+0x38],r12
     118c582:	4d 89 7e 40          	mov    QWORD PTR [r14+0x40],r15
     118c586:	41 80 4e 10 38       	or     BYTE PTR [r14+0x10],0x38
     118c58b:	41 83 7e 50 08       	cmp    DWORD PTR [r14+0x50],0x8
     118c590:	75 06                	jne    118c598 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3539ae>
     118c592:	49 8b 7e 48          	mov    rdi,QWORD PTR [r14+0x48]
     118c596:	eb 2a                	jmp    118c5c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3539d8>
     118c598:	4c 89 f7             	mov    rdi,r14
     118c59b:	e8 96 e5 01 00       	call   11aab36 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x371f4c>
     118c5a0:	41 c7 46 50 08 00 00 	mov    DWORD PTR [r14+0x50],0x8
     118c5a7:	00 
     118c5a8:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     118c5ac:	40 f6 c7 01          	test   dil,0x1
     118c5b0:	0f 85 b0 00 00 00    	jne    118c666 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x353a7c>
     118c5b6:	e8 f5 00 00 00       	call   118c6b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x353ac6>
     118c5bb:	48 89 c7             	mov    rdi,rax
     118c5be:	49 89 46 48          	mov    QWORD PTR [r14+0x48],rax
     118c5c2:	8b 43 68             	mov    eax,DWORD PTR [rbx+0x68]
     118c5c5:	89 47 20             	mov    DWORD PTR [rdi+0x20],eax
     118c5c8:	8b 47 10             	mov    eax,DWORD PTR [rdi+0x10]

### 0x118c7cb: mov    rax,QWORD PTR [rbx+0x30]; FDE=(18401018, 18401697)
     118c796:	49 8b 86 00 02 00 00 	mov    rax,QWORD PTR [r14+0x200]
     118c79d:	eb 0f                	jmp    118c7ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x353bc4>
     118c79f:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     118c7a3:	48 8b 40 70          	mov    rax,QWORD PTR [rax+0x70]
     118c7a7:	48 8b 80 08 02 00 00 	mov    rax,QWORD PTR [rax+0x208]
     118c7ae:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     118c7b3:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     118c7b8:	e8 83 23 66 00       	call   17eeb40 <_ZNSt6__ndk16chrono12system_clock9to_time_tERKNS0_10time_pointIS1_NS0_8durationIxNS_5ratioILl1ELl1000000EEEEEEE@plt>
     118c7bd:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
     118c7c1:	48 3b 41 18          	cmp    rax,QWORD PTR [rcx+0x18]
     118c7c5:	7e 04                	jle    118c7cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x353be1>
     118c7c7:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
     118c7cb:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
     118c7cf:	80 38 00             	cmp    BYTE PTR [rax],0x0
     118c7d2:	0f 84 e6 00 00 00    	je     118c8be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x353cd4>
     118c7d8:	4c 8b 7b 10          	mov    r15,QWORD PTR [rbx+0x10]
     118c7dc:	48 8d 35 94 db 1b ff 	lea    rsi,[rip+0xffffffffff1bdb94]        # 34a377 <_ZTSSt12bad_any_cast@@Base-0x45e51>
     118c7e3:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
     118c7e8:	4c 89 e7             	mov    rdi,r12
     118c7eb:	e8 8e d2 8e ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     118c7f0:	49 8b 7f 70          	mov    rdi,QWORD PTR [r15+0x70]
     118c7f4:	4c 89 e6             	mov    rsi,r12
     118c7f7:	e8 e8 1b 41 00       	call   159e3e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e3968>
     118c7fc:	49 89 c7             	mov    r15,rax
     118c7ff:	4c 89 e7             	mov    rdi,r12
     118c802:	e8 89 16 66 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     118c807:	4d 85 f6             	test   r14,r14
     118c80a:	74 41                	je     118c84d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x353c63>
     118c80c:	4d 85 ff             	test   r15,r15
     118c80f:	75 3c                	jne    118c84d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x353c63>
     118c811:	4d 8d be c0 00 00 00 	lea    r15,[r14+0xc0]
     118c818:	48 8d 35 58 db 1b ff 	lea    rsi,[rip+0xffffffffff1bdb58]        # 34a377 <_ZTSSt12bad_any_cast@@Base-0x45e51>
     118c81f:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]

### 0x118cf90: mov    r15,QWORD PTR [rbx+0x30]; FDE=(18402446, 18404493)
     118cf42:	31 c9                	xor    ecx,ecx
     118cf44:	88 8c 24 12 01 00 00 	mov    BYTE PTR [rsp+0x112],cl
     118cf4b:	88 8c 24 11 01 00 00 	mov    BYTE PTR [rsp+0x111],cl
     118cf52:	88 8c 24 10 01 00 00 	mov    BYTE PTR [rsp+0x110],cl
     118cf59:	88 8c 24 0f 01 00 00 	mov    BYTE PTR [rsp+0x10f],cl
     118cf60:	88 8c 24 0e 01 00 00 	mov    BYTE PTR [rsp+0x10e],cl
     118cf67:	88 84 24 0d 01 00 00 	mov    BYTE PTR [rsp+0x10d],al
     118cf6e:	88 8c 24 0c 01 00 00 	mov    BYTE PTR [rsp+0x10c],cl
     118cf75:	88 8c 24 0b 01 00 00 	mov    BYTE PTR [rsp+0x10b],cl
     118cf7c:	88 8c 24 0a 01 00 00 	mov    BYTE PTR [rsp+0x10a],cl
     118cf83:	41 38 8e d8 00 00 00 	cmp    BYTE PTR [r14+0xd8],cl
     118cf8a:	0f 84 92 02 00 00    	je     118d222 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x354638>
     118cf90:	4c 8b 7b 30          	mov    r15,QWORD PTR [rbx+0x30]
     118cf94:	4c 8b 63 38          	mov    r12,QWORD PTR [rbx+0x38]
     118cf98:	4d 39 e7             	cmp    r15,r12
     118cf9b:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     118cfa0:	0f 84 39 02 00 00    	je     118d1df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3545f5>
     118cfa6:	48 8d 83 78 01 00 00 	lea    rax,[rbx+0x178]
     118cfad:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     118cfb2:	48 8d 83 80 01 00 00 	lea    rax,[rbx+0x180]
     118cfb9:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     118cfbe:	80 bb 94 01 00 00 00 	cmp    BYTE PTR [rbx+0x194],0x0
     118cfc5:	49 8b 07             	mov    rax,QWORD PTR [r15]
     118cfc8:	74 0f                	je     118cfd9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3543ef>
     118cfca:	8b 48 0c             	mov    ecx,DWORD PTR [rax+0xc]
     118cfcd:	3b 8b 90 01 00 00    	cmp    ecx,DWORD PTR [rbx+0x190]
     118cfd3:	0f 82 f9 01 00 00    	jb     118d1d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3545e8>
     118cfd9:	80 bb 9c 01 00 00 00 	cmp    BYTE PTR [rbx+0x19c],0x0
     118cfe0:	74 0f                	je     118cff1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x354407>
     118cfe2:	8b 48 0c             	mov    ecx,DWORD PTR [rax+0xc]
     118cfe5:	3b 8b 98 01 00 00    	cmp    ecx,DWORD PTR [rbx+0x198]
     118cfeb:	0f 87 ee 01 00 00    	ja     118d1df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3545f5>
     118cff1:	80 78 08 00          	cmp    BYTE PTR [rax+0x8],0x0

### 0x118d691: mov    QWORD PTR [r14+0x30],rcx; FDE=(18404494, 18405678)
     118d65c:	49 89 2e             	mov    QWORD PTR [r14],rbp
     118d65f:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     118d664:	49 89 4e 08          	mov    QWORD PTR [r14+0x8],rcx
     118d668:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
     118d66d:	49 89 4e 10          	mov    QWORD PTR [r14+0x10],rcx
     118d671:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     118d676:	49 89 4e 18          	mov    QWORD PTR [r14+0x18],rcx
     118d67a:	48 8d 4c 24 68       	lea    rcx,[rsp+0x68]
     118d67f:	49 89 4e 20          	mov    QWORD PTR [r14+0x20],rcx
     118d683:	48 8b 4c 24 48       	mov    rcx,QWORD PTR [rsp+0x48]
     118d688:	49 89 4e 28          	mov    QWORD PTR [r14+0x28],rcx
     118d68c:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     118d691:	49 89 4e 30          	mov    QWORD PTR [r14+0x30],rcx
     118d695:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     118d69a:	49 89 4e 38          	mov    QWORD PTR [r14+0x38],rcx
     118d69e:	49 89 5e 40          	mov    QWORD PTR [r14+0x40],rbx
     118d6a2:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     118d6a7:	49 89 4e 48          	mov    QWORD PTR [r14+0x48],rcx
     118d6ab:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
     118d6b0:	49 89 4e 50          	mov    QWORD PTR [r14+0x50],rcx
     118d6b4:	48 8b 4c 24 50       	mov    rcx,QWORD PTR [rsp+0x50]
     118d6b9:	49 89 4e 58          	mov    QWORD PTR [r14+0x58],rcx
     118d6bd:	48 8d 4c 24 6f       	lea    rcx,[rsp+0x6f]
     118d6c2:	49 89 4e 60          	mov    QWORD PTR [r14+0x60],rcx
     118d6c6:	48 8d 4c 24 6e       	lea    rcx,[rsp+0x6e]
     118d6cb:	49 89 4e 68          	mov    QWORD PTR [r14+0x68],rcx
     118d6cf:	4d 89 66 70          	mov    QWORD PTR [r14+0x70],r12
     118d6d3:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
     118d6d8:	4c 8b 07             	mov    r8,QWORD PTR [rdi]
     118d6db:	48 8d 0d f8 21 00 00 	lea    rcx,[rip+0x21f8]        # 118f8da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x356cf0>
     118d6e2:	48 8d 54 24 70       	lea    rdx,[rsp+0x70]
     118d6e7:	48 89 c6             	mov    rsi,rax
     118d6ea:	41 ff 90 c0 00 00 00 	call   QWORD PTR [r8+0xc0]

### 0x118d7d0: mov    rax,QWORD PTR [r14+0x30]; FDE=(18404494, 18405678)
     118d7a6:	4c 89 f2             	mov    rdx,r14
     118d7a9:	4c 89 e9             	mov    rcx,r13
     118d7ac:	4c 8b 44 24 08       	mov    r8,QWORD PTR [rsp+0x8]
     118d7b1:	ff 50 20             	call   QWORD PTR [rax+0x20]
     118d7b4:	84 c0                	test   al,al
     118d7b6:	74 3b                	je     118d7f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x354c09>
     118d7b8:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     118d7bd:	48 8b b8 08 01 00 00 	mov    rdi,QWORD PTR [rax+0x108]
     118d7c4:	4c 89 fe             	mov    rsi,r15
     118d7c7:	e8 80 fe 00 00       	call   119d64c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x364a62>
     118d7cc:	84 d2                	test   dl,dl
     118d7ce:	75 04                	jne    118d7d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x354bea>
     118d7d0:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
     118d7d4:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
     118d7d8:	41 80 4e 10 10       	or     BYTE PTR [r14+0x10],0x10
     118d7dd:	49 8b 76 18          	mov    rsi,QWORD PTR [r14+0x18]
     118d7e1:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     118d7e5:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     118d7ea:	e8 68 14 01 00       	call   119ec57 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36606d>
     118d7ef:	84 c0                	test   al,al
     118d7f1:	75 10                	jne    118d803 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x354c19>
     118d7f3:	49 83 c4 08          	add    r12,0x8
     118d7f7:	49 39 dc             	cmp    r12,rbx
     118d7fa:	75 95                	jne    118d791 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x354ba7>
     118d7fc:	41 b5 01             	mov    r13b,0x1
     118d7ff:	eb 23                	jmp    118d824 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x354c3a>
     118d801:	eb 21                	jmp    118d824 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x354c3a>
     118d803:	80 bc 24 48 01 00 00 	cmp    BYTE PTR [rsp+0x148],0x0
     118d80a:	00 
     118d80b:	74 11                	je     118d81e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x354c34>
     118d80d:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     118d812:	4c 89 f6             	mov    rsi,r14
     118d815:	e8 67 0d 01 00       	call   119e581 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x365997>

### 0x118d9aa: movups xmm0,XMMWORD PTR [rbx+0x30]; FDE=(18405678, 18405916)
     118d979:	eb 07                	jmp    118d982 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x354d98>
     118d97b:	48 8d 1d 3e 17 78 00 	lea    rbx,[rip+0x78173e]        # 190f0c0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x564d0>
     118d982:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
     118d986:	48 83 e7 fc          	and    rdi,0xfffffffffffffffc
     118d98a:	e8 a7 de 8e ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     118d98f:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     118d994:	49 89 d4             	mov    r12,rdx
     118d997:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
     118d99b:	48 83 e7 fc          	and    rdi,0xfffffffffffffffc
     118d99f:	e8 92 de 8e ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     118d9a4:	49 89 c5             	mov    r13,rax
     118d9a7:	48 89 d5             	mov    rbp,rdx
     118d9aa:	0f 10 43 30          	movups xmm0,XMMWORD PTR [rbx+0x30]
     118d9ae:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     118d9b3:	4c 8b 7b 40          	mov    r15,QWORD PTR [rbx+0x40]
     118d9b7:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
     118d9bb:	8b 73 50             	mov    esi,DWORD PTR [rbx+0x50]
     118d9be:	e8 62 12 01 00       	call   119ec25 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36603b>
     118d9c3:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     118d9c8:	4c 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],r15
     118d9cd:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]
     118d9d2:	0f 11 44 24 08       	movups XMMWORD PTR [rsp+0x8],xmm0
     118d9d7:	48 89 2c 24          	mov    QWORD PTR [rsp],rbp
     118d9db:	48 8d 7c 24 5c       	lea    rdi,[rsp+0x5c]
     118d9e0:	48 8b 74 24 38       	mov    rsi,QWORD PTR [rsp+0x38]
     118d9e5:	4c 89 f2             	mov    rdx,r14
     118d9e8:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     118d9ed:	4d 89 e0             	mov    r8,r12
     118d9f0:	4d 89 e9             	mov    r9,r13
     118d9f3:	e8 db 18 01 00       	call   119f2d3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3666e9>
     118d9f8:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     118d9ff:	00 00 
     118da01:	48 3b 4c 24 60       	cmp    rcx,QWORD PTR [rsp+0x60]

### 0x118ecc7: mov    rax,QWORD PTR [r15+0x30]; FDE=(18410566, 18411134)
     118ec96:	00 00 
     118ec98:	4d 8b 4f 28          	mov    r9,QWORD PTR [r15+0x28]
     118ec9c:	48 83 24 24 00       	and    QWORD PTR [rsp],0x0
     118eca1:	e8 d8 01 00 00       	call   118ee7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x356294>
     118eca6:	84 c0                	test   al,al
     118eca8:	0f 84 6d 01 00 00    	je     118ee1b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x356231>
     118ecae:	49 8b 47 18          	mov    rax,QWORD PTR [r15+0x18]
     118ecb2:	49 8b 4f 20          	mov    rcx,QWORD PTR [r15+0x20]
     118ecb6:	8b 31                	mov    esi,DWORD PTR [rcx]
     118ecb8:	48 8b b8 d8 00 00 00 	mov    rdi,QWORD PTR [rax+0xd8]
     118ecbf:	e8 6f f8 00 00       	call   119e533 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x365949>
     118ecc4:	48 89 c5             	mov    rbp,rax
     118ecc7:	49 8b 47 30          	mov    rax,QWORD PTR [r15+0x30]
     118eccb:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     118ecd0:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
     118ecd4:	4d 8b 67 38          	mov    r12,QWORD PTR [r15+0x38]
     118ecd8:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
     118ecdc:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     118ece1:	e8 50 03 00 00       	call   118f036 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35644c>
     118ece6:	4d 8b 77 40          	mov    r14,QWORD PTR [r15+0x40]
     118ecea:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
     118ecee:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     118ecf3:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     118ecf7:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     118ecfc:	41 0f 10 47 48       	movups xmm0,XMMWORD PTR [r15+0x48]
     118ed01:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     118ed06:	49 8b 5f 28          	mov    rbx,QWORD PTR [r15+0x28]
     118ed0a:	4d 8b 6f 58          	mov    r13,QWORD PTR [r15+0x58]
     118ed0e:	49 8b 47 60          	mov    rax,QWORD PTR [r15+0x60]
     118ed12:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     118ed17:	49 8b 47 68          	mov    rax,QWORD PTR [r15+0x68]
     118ed1b:	8a 00                	mov    al,BYTE PTR [rax]
     118ed1d:	49 8b 4f 70          	mov    rcx,QWORD PTR [r15+0x70]

### 0x118f0af: mov    rax,QWORD PTR [rbx+0x30]; FDE=(18411606, 18412038)
     118f07e:	48 8b 37             	mov    rsi,QWORD PTR [rdi]
     118f081:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]
     118f085:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     118f08a:	4c 89 f2             	mov    rdx,r14
     118f08d:	e8 bf dd 00 00       	call   119ce51 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x364267>
     118f092:	4c 8b 3b             	mov    r15,QWORD PTR [rbx]
     118f095:	4c 8b 63 10          	mov    r12,QWORD PTR [rbx+0x10]
     118f099:	48 8b 73 20          	mov    rsi,QWORD PTR [rbx+0x20]
     118f09d:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     118f0a2:	e8 8f ff ff ff       	call   118f036 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35644c>
     118f0a7:	49 83 c4 18          	add    r12,0x18
     118f0ab:	48 8b 4b 28          	mov    rcx,QWORD PTR [rbx+0x28]
     118f0af:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
     118f0b3:	4c 8b 00             	mov    r8,QWORD PTR [rax]
     118f0b6:	0f 10 43 38          	movups xmm0,XMMWORD PTR [rbx+0x38]
     118f0ba:	48 8b 43 48          	mov    rax,QWORD PTR [rbx+0x48]
     118f0be:	0f b6 00             	movzx  eax,BYTE PTR [rax]
     118f0c1:	48 8b 53 50          	mov    rdx,QWORD PTR [rbx+0x50]
     118f0c5:	0f b6 12             	movzx  edx,BYTE PTR [rdx]
     118f0c8:	89 54 24 20          	mov    DWORD PTR [rsp+0x20],edx
     118f0cc:	89 44 24 18          	mov    DWORD PTR [rsp+0x18],eax
     118f0d0:	0f 11 44 24 08       	movups XMMWORD PTR [rsp+0x8],xmm0
     118f0d5:	4c 89 34 24          	mov    QWORD PTR [rsp],r14
     118f0d9:	48 8d 54 24 40       	lea    rdx,[rsp+0x40]
     118f0de:	4c 8d 4c 24 68       	lea    r9,[rsp+0x68]
     118f0e3:	4c 89 e7             	mov    rdi,r12
     118f0e6:	4c 89 fe             	mov    rsi,r15
     118f0e9:	e8 18 01 00 00       	call   118f206 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35661c>
     118f0ee:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     118f0f3:	e8 26 3b ee ff       	call   1072c1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23a034>
     118f0f8:	48 8b 43 48          	mov    rax,QWORD PTR [rbx+0x48]
     118f0fc:	48 8b 4b 58          	mov    rcx,QWORD PTR [rbx+0x58]
     118f100:	80 38 00             	cmp    BYTE PTR [rax],0x0

### 0x118f13e: mov    rcx,QWORD PTR [rbx+0x30]; FDE=(18411606, 18412038)
     118f10e:	0f 45 c8             	cmovne ecx,eax
     118f111:	4c 8d 74 24 2c       	lea    r14,[rsp+0x2c]
     118f116:	41 89 0e             	mov    DWORD PTR [r14],ecx
     118f119:	4c 8b 7b 60          	mov    r15,QWORD PTR [rbx+0x60]
     118f11d:	4c 8b 63 68          	mov    r12,QWORD PTR [rbx+0x68]
     118f121:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     118f126:	e8 0b c7 8e ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     118f12b:	49 89 c5             	mov    r13,rax
     118f12e:	48 89 d5             	mov    rbp,rdx
     118f131:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
     118f138:	00 
     118f139:	e8 f8 c6 8e ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     118f13e:	48 8b 4b 30          	mov    rcx,QWORD PTR [rbx+0x30]
     118f142:	48 8b 09             	mov    rcx,QWORD PTR [rcx]
     118f145:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
     118f149:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
     118f14d:	0f 10 46 50          	movups xmm0,XMMWORD PTR [rsi+0x50]
     118f151:	8b 77 0c             	mov    esi,DWORD PTR [rdi+0xc]
     118f154:	6a f7                	push   0xfffffffffffffff7
     118f156:	5f                   	pop    rdi
     118f157:	48 29 f7             	sub    rdi,rsi
     118f15a:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
     118f15f:	0f 11 44 24 10       	movups XMMWORD PTR [rsp+0x10],xmm0
     118f164:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
     118f169:	48 89 14 24          	mov    QWORD PTR [rsp],rdx
     118f16d:	4c 89 f7             	mov    rdi,r14
     118f170:	4c 89 fe             	mov    rsi,r15
     118f173:	4c 89 e2             	mov    rdx,r12
     118f176:	4c 89 e9             	mov    rcx,r13
     118f179:	49 89 e8             	mov    r8,rbp
     118f17c:	49 89 c1             	mov    r9,rax
     118f17f:	e8 4f 01 01 00       	call   119f2d3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3666e9>
     118f184:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]

### 0x118f27c: mov    QWORD PTR [rbx+0x30],r12; FDE=(18412038, 18413613)
     118f246:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     118f24b:	48 89 c6             	mov    rsi,rax
     118f24e:	e8 69 d8 53 00       	call   16ccabc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x80c28>
     118f253:	80 4b 10 01          	or     BYTE PTR [rbx+0x10],0x1
     118f257:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     118f25b:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     118f25f:	f6 c2 01             	test   dl,0x1
     118f262:	0f 85 06 05 00 00    	jne    118f76e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x356b84>
     118f268:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     118f26d:	e8 74 65 5d 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
     118f272:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     118f277:	e8 14 ec 65 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     118f27c:	4c 89 63 30          	mov    QWORD PTR [rbx+0x30],r12
     118f280:	4c 89 63 38          	mov    QWORD PTR [rbx+0x38],r12
     118f284:	80 4b 10 18          	or     BYTE PTR [rbx+0x10],0x18
     118f288:	49 8b 06             	mov    rax,QWORD PTR [r14]
     118f28b:	4c 89 f7             	mov    rdi,r14
     118f28e:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
     118f294:	4c 89 ff             	mov    rdi,r15
     118f297:	48 89 c6             	mov    rsi,rax
     118f29a:	e8 ad e3 00 00       	call   119d64c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x364a62>
     118f29f:	8b 4b 10             	mov    ecx,DWORD PTR [rbx+0x10]
     118f2a2:	84 d2                	test   dl,dl
     118f2a4:	74 0a                	je     118f2b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3566c6>
     118f2a6:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
     118f2aa:	83 c9 10             	or     ecx,0x10
     118f2ad:	89 4b 10             	mov    DWORD PTR [rbx+0x10],ecx
     118f2b0:	4c 8b bc 24 d0 00 00 	mov    r15,QWORD PTR [rsp+0xd0]
     118f2b7:	00 
     118f2b8:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
     118f2bc:	83 c9 20             	or     ecx,0x20
     118f2bf:	89 4b 10             	mov    DWORD PTR [rbx+0x10],ecx
     118f2c2:	80 bc 24 e8 00 00 00 	cmp    BYTE PTR [rsp+0xe8],0x0

### 0x118f95f: mov    r12,QWORD PTR [rbx+0x30]; FDE=(18413786, 18414118)
     118f937:	6a 00                	push   0x0
     118f939:	e8 40 f5 ff ff       	call   118ee7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x356294>
     118f93e:	59                   	pop    rcx
     118f93f:	5a                   	pop    rdx
     118f940:	84 c0                	test   al,al
     118f942:	0f 84 82 00 00 00    	je     118f9ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x356de0>
     118f948:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
     118f94b:	48 8b 4b 28          	mov    rcx,QWORD PTR [rbx+0x28]
     118f94f:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     118f954:	4c 89 f2             	mov    rdx,r14
     118f957:	e8 f5 d4 00 00       	call   119ce51 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x364267>
     118f95c:	4c 8b 3b             	mov    r15,QWORD PTR [rbx]
     118f95f:	4c 8b 63 30          	mov    r12,QWORD PTR [rbx+0x30]
     118f963:	48 8b 73 40          	mov    rsi,QWORD PTR [rbx+0x40]
     118f967:	48 89 e7             	mov    rdi,rsp
     118f96a:	e8 c7 f6 ff ff       	call   118f036 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35644c>
     118f96f:	48 8b 4b 48          	mov    rcx,QWORD PTR [rbx+0x48]
     118f973:	48 8b 43 50          	mov    rax,QWORD PTR [rbx+0x50]
     118f977:	4c 8b 00             	mov    r8,QWORD PTR [rax]
     118f97a:	48 8b 43 60          	mov    rax,QWORD PTR [rbx+0x60]
     118f97e:	0f b6 00             	movzx  eax,BYTE PTR [rax]
     118f981:	48 8b 53 68          	mov    rdx,QWORD PTR [rbx+0x68]
     118f985:	44 0f b6 12          	movzx  r10d,BYTE PTR [rdx]
     118f989:	48 83 ec 08          	sub    rsp,0x8
     118f98d:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     118f992:	4c 8d 4c 24 30       	lea    r9,[rsp+0x30]
     118f997:	4c 89 e7             	mov    rdi,r12
     118f99a:	4c 89 fe             	mov    rsi,r15
     118f99d:	41 52                	push   r10
     118f99f:	50                   	push   rax
     118f9a0:	ff 73 58             	push   QWORD PTR [rbx+0x58]
     118f9a3:	ff 73 10             	push   QWORD PTR [rbx+0x10]
     118f9a6:	41 56                	push   r14

### 0x118fac3: mov    rax,QWORD PTR [rbx+0x30]; FDE=(18414118, 18415146)
     118fa9d:	80 38 00             	cmp    BYTE PTR [rax],0x0
     118faa0:	75 3a                	jne    118fadc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x356ef2>
     118faa2:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     118faa6:	48 8d 15 d6 24 2c ff 	lea    rdx,[rip+0xffffffffff2c24d6]        # 451f83 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b8f>
     118faad:	6a 07                	push   0x7
     118faaf:	59                   	pop    rcx
     118fab0:	4c 89 f6             	mov    rsi,r14
     118fab3:	e8 de d7 00 00       	call   119d296 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3646ac>
     118fab8:	84 c0                	test   al,al
     118faba:	74 20                	je     118fadc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x356ef2>
     118fabc:	48 8b 43 28          	mov    rax,QWORD PTR [rbx+0x28]
     118fac0:	c6 00 01             	mov    BYTE PTR [rax],0x1
     118fac3:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
     118fac7:	80 38 00             	cmp    BYTE PTR [rax],0x0
     118faca:	74 10                	je     118fadc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x356ef2>
     118facc:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
     118fad0:	48 8d 35 f1 a7 24 ff 	lea    rsi,[rip+0xffffffffff24a7f1]        # 3da2c8 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4ead>
     118fad7:	e8 58 17 95 ff       	call   ae1234 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2e1d4>
     118fadc:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
     118fae0:	80 38 00             	cmp    BYTE PTR [rax],0x0
     118fae3:	75 42                	jne    118fb27 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x356f3d>
     118fae5:	4c 8b 63 08          	mov    r12,QWORD PTR [rbx+0x8]
     118fae9:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     118faed:	e8 44 bd 8e ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     118faf2:	48 89 d1             	mov    rcx,rdx
     118faf5:	4c 89 e7             	mov    rdi,r12
     118faf8:	4c 89 f6             	mov    rsi,r14
     118fafb:	48 89 c2             	mov    rdx,rax
     118fafe:	e8 93 d7 00 00       	call   119d296 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3646ac>
     118fb03:	84 c0                	test   al,al
     118fb05:	74 20                	je     118fb27 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x356f3d>
     118fb07:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
     118fb0b:	c6 00 01             	mov    BYTE PTR [rax],0x1

### 0x118fb0e: mov    rax,QWORD PTR [rbx+0x30]; FDE=(18414118, 18415146)
     118fae5:	4c 8b 63 08          	mov    r12,QWORD PTR [rbx+0x8]
     118fae9:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     118faed:	e8 44 bd 8e ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     118faf2:	48 89 d1             	mov    rcx,rdx
     118faf5:	4c 89 e7             	mov    rdi,r12
     118faf8:	4c 89 f6             	mov    rsi,r14
     118fafb:	48 89 c2             	mov    rdx,rax
     118fafe:	e8 93 d7 00 00       	call   119d296 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3646ac>
     118fb03:	84 c0                	test   al,al
     118fb05:	74 20                	je     118fb27 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x356f3d>
     118fb07:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
     118fb0b:	c6 00 01             	mov    BYTE PTR [rax],0x1
     118fb0e:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
     118fb12:	80 38 00             	cmp    BYTE PTR [rax],0x0
     118fb15:	74 10                	je     118fb27 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x356f3d>
     118fb17:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
     118fb1b:	48 8d 35 aa a7 24 ff 	lea    rsi,[rip+0xffffffffff24a7aa]        # 3da2cc <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4eb1>
     118fb22:	e8 0d 17 95 ff       	call   ae1234 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2e1d4>
     118fb27:	48 8b 43 48          	mov    rax,QWORD PTR [rbx+0x48]
     118fb2b:	80 38 00             	cmp    BYTE PTR [rax],0x0
     118fb2e:	75 5c                	jne    118fb8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x356fa2>
     118fb30:	4c 8b 63 08          	mov    r12,QWORD PTR [rbx+0x8]
     118fb34:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     118fb38:	e8 f9 bc 8e ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     118fb3d:	48 89 d1             	mov    rcx,rdx
     118fb40:	4c 89 e7             	mov    rdi,r12
     118fb43:	4c 89 f6             	mov    rsi,r14
     118fb46:	48 89 c2             	mov    rdx,rax
     118fb49:	e8 48 d7 00 00       	call   119d296 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3646ac>
     118fb4e:	84 c0                	test   al,al
     118fb50:	75 3a                	jne    118fb8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x356fa2>
     118fb52:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     118fb56:	48 8d 15 26 24 2c ff 	lea    rdx,[rip+0xffffffffff2c2426]        # 451f83 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b8f>

### 0x118fb73: mov    rax,QWORD PTR [rbx+0x30]; FDE=(18414118, 18415146)
     118fb4e:	84 c0                	test   al,al
     118fb50:	75 3a                	jne    118fb8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x356fa2>
     118fb52:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     118fb56:	48 8d 15 26 24 2c ff 	lea    rdx,[rip+0xffffffffff2c2426]        # 451f83 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b8f>
     118fb5d:	6a 07                	push   0x7
     118fb5f:	59                   	pop    rcx
     118fb60:	4c 89 f6             	mov    rsi,r14
     118fb63:	e8 2e d7 00 00       	call   119d296 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3646ac>
     118fb68:	84 c0                	test   al,al
     118fb6a:	75 20                	jne    118fb8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x356fa2>
     118fb6c:	48 8b 43 48          	mov    rax,QWORD PTR [rbx+0x48]
     118fb70:	c6 00 01             	mov    BYTE PTR [rax],0x1
     118fb73:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
     118fb77:	80 38 00             	cmp    BYTE PTR [rax],0x0
     118fb7a:	74 10                	je     118fb8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x356fa2>
     118fb7c:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
     118fb80:	48 8d 35 49 a7 24 ff 	lea    rsi,[rip+0xffffffffff24a749]        # 3da2d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4eb5>
     118fb87:	e8 a8 16 95 ff       	call   ae1234 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2e1d4>
     118fb8c:	48 8b 43 50          	mov    rax,QWORD PTR [rbx+0x50]
     118fb90:	80 38 00             	cmp    BYTE PTR [rax],0x0
     118fb93:	75 30                	jne    118fbc5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x356fdb>
     118fb95:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     118fb99:	4c 89 f6             	mov    rsi,r14
     118fb9c:	e8 07 eb 40 00       	call   159e6a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e3c2c>
     118fba1:	84 c0                	test   al,al
     118fba3:	74 20                	je     118fbc5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x356fdb>
     118fba5:	48 8b 43 50          	mov    rax,QWORD PTR [rbx+0x50]
     118fba9:	c6 00 01             	mov    BYTE PTR [rax],0x1
     118fbac:	48 8b 43 58          	mov    rax,QWORD PTR [rbx+0x58]
     118fbb0:	80 38 00             	cmp    BYTE PTR [rax],0x0
     118fbb3:	74 10                	je     118fbc5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x356fdb>
     118fbb5:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
     118fbb9:	48 8d 35 24 a7 24 ff 	lea    rsi,[rip+0xffffffffff24a724]        # 3da2e4 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4ec9>

### 0x11924dd: mov    rsi,QWORD PTR [rbx+0x30]; FDE=(18424550, 18425477)
     11924a7:	4c 89 fe             	mov    rsi,r15
     11924aa:	e8 77 0b 42 00       	call   15b3026 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f85aa>
     11924af:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     11924b4:	48 89 07             	mov    QWORD PTR [rdi],rax
     11924b7:	e8 84 c6 65 00       	call   17eeb40 <_ZNSt6__ndk16chrono12system_clock9to_time_tERKNS0_10time_pointIS1_NS0_8durationIxNS_5ratioILl1ELl1000000EEEEEEE@plt>
     11924bc:	48 89 45 48          	mov    QWORD PTR [rbp+0x48],rax
     11924c0:	48 89 45 58          	mov    QWORD PTR [rbp+0x58],rax
     11924c4:	49 89 ee             	mov    r14,rbp
     11924c7:	81 4d 10 40 01 00 00 	or     DWORD PTR [rbp+0x10],0x140
     11924ce:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     11924d3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     11924d8:	e8 33 71 9b ff       	call   b49610 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x965b0>
     11924dd:	48 8b 73 30          	mov    rsi,QWORD PTR [rbx+0x30]
     11924e1:	8b 7b 28             	mov    edi,DWORD PTR [rbx+0x28]
     11924e4:	e8 37 93 8e ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     11924e9:	40 b5 01             	mov    bpl,0x1
     11924ec:	84 c0                	test   al,al
     11924ee:	0f 85 ac fe ff ff    	jne    11923a0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3597b6>
     11924f4:	48 83 c3 28          	add    rbx,0x28
     11924f8:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     11924ff:	00 
     1192500:	48 89 de             	mov    rsi,rbx
     1192503:	e8 92 1d 4d 00       	call   166429a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18406>
     1192508:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     119250f:	00 
     1192510:	4c 89 f6             	mov    rsi,r14
     1192513:	e8 46 14 00 00       	call   119395e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35ad74>
     1192518:	89 c5                	mov    ebp,eax
     119251a:	48 8d bc 24 48 01 00 	lea    rdi,[rsp+0x148]
     1192521:	00 
     1192522:	e8 c1 90 8e ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     1192527:	e9 74 fe ff ff       	jmp    11923a0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3597b6>
     119252c:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]

### 0x11925ae: mov    rsi,QWORD PTR [rbx+0x30]; FDE=(18424550, 18425477)
     1192576:	e8 ab 0a 42 00       	call   15b3026 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f85aa>
     119257b:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     1192580:	48 89 07             	mov    QWORD PTR [rdi],rax
     1192583:	e8 b8 c5 65 00       	call   17eeb40 <_ZNSt6__ndk16chrono12system_clock9to_time_tERKNS0_10time_pointIS1_NS0_8durationIxNS_5ratioILl1ELl1000000EEEEEEE@plt>
     1192588:	48 89 45 48          	mov    QWORD PTR [rbp+0x48],rax
     119258c:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
     1192591:	48 89 45 58          	mov    QWORD PTR [rbp+0x58],rax
     1192595:	49 89 ee             	mov    r14,rbp
     1192598:	81 4d 10 40 01 00 00 	or     DWORD PTR [rbp+0x10],0x140
     119259f:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     11925a4:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     11925a9:	e8 62 70 9b ff       	call   b49610 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x965b0>
     11925ae:	48 8b 73 30          	mov    rsi,QWORD PTR [rbx+0x30]
     11925b2:	8b 7b 28             	mov    edi,DWORD PTR [rbx+0x28]
     11925b5:	e8 66 92 8e ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     11925ba:	40 b5 01             	mov    bpl,0x1
     11925bd:	84 c0                	test   al,al
     11925bf:	75 37                	jne    11925f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x359a0e>
     11925c1:	48 83 c3 28          	add    rbx,0x28
     11925c5:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     11925cc:	00 
     11925cd:	48 89 de             	mov    rsi,rbx
     11925d0:	e8 c5 1c 4d 00       	call   166429a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18406>
     11925d5:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     11925dc:	00 
     11925dd:	4c 89 f6             	mov    rsi,r14
     11925e0:	e8 79 13 00 00       	call   119395e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35ad74>
     11925e5:	89 c5                	mov    ebp,eax
     11925e7:	48 8d bc 24 48 01 00 	lea    rdi,[rsp+0x148]
     11925ee:	00 
     11925ef:	e8 f4 8f 8e ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     11925f4:	eb 02                	jmp    11925f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x359a0e>
     11925f6:	31 ed                	xor    ebp,ebp

### 0x11931cd: lea    rdi,[rbx+0x30]; FDE=(18428154, 18429189)
     119319d:	83 c9 40             	or     ecx,0x40
     11931a0:	89 4b 10             	mov    DWORD PTR [rbx+0x10],ecx
     11931a3:	49 8b 4d 58          	mov    rcx,QWORD PTR [r13+0x58]
     11931a7:	48 89 4b 48          	mov    QWORD PTR [rbx+0x48],rcx
     11931ab:	c7 43 3c 01 00 00 00 	mov    DWORD PTR [rbx+0x3c],0x1
     11931b2:	89 c1                	mov    ecx,eax
     11931b4:	81 c9 e0 00 00 00    	or     ecx,0xe0
     11931ba:	89 4b 10             	mov    DWORD PTR [rbx+0x10],ecx
     11931bd:	49 8b 75 38          	mov    rsi,QWORD PTR [r13+0x38]
     11931c1:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     11931c5:	0d e8 00 00 00       	or     eax,0xe8
     11931ca:	89 43 10             	mov    DWORD PTR [rbx+0x10],eax
     11931cd:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     11931d1:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     11931d5:	f6 c2 01             	test   dl,0x1
     11931d8:	0f 85 97 02 00 00    	jne    1193475 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35a88b>
     11931de:	e8 af 25 5d 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     11931e3:	41 83 7f 28 0f       	cmp    DWORD PTR [r15+0x28],0xf
     11931e8:	75 06                	jne    11931f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35a606>
     11931ea:	4d 8b 67 20          	mov    r12,QWORD PTR [r15+0x20]
     11931ee:	eb 2a                	jmp    119321a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35a630>
     11931f0:	4c 89 ff             	mov    rdi,r15
     11931f3:	e8 68 84 01 00       	call   11ab660 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372a76>
     11931f8:	41 c7 47 28 0f 00 00 	mov    DWORD PTR [r15+0x28],0xf
     11931ff:	00 
     1193200:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1193204:	40 f6 c7 01          	test   dil,0x1
     1193208:	0f 85 8b 02 00 00    	jne    1193499 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35a8af>
     119320e:	e8 f3 02 00 00       	call   1193506 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35a91c>
     1193213:	49 89 c4             	mov    r12,rax
     1193216:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
     119321a:	49 8b 75 28          	mov    rsi,QWORD PTR [r13+0x28]
     119321e:	41 83 4c 24 10 01    	or     DWORD PTR [r12+0x10],0x1

### 0x11942a8: mov    QWORD PTR [rbx+0x30],rax; FDE=(18432600, 18432804)
     119427b:	40 f6 c6 01          	test   sil,0x1
     119427f:	74 11                	je     1194292 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35b6a8>
     1194281:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
     1194285:	48 83 e6 fe          	and    rsi,0xfffffffffffffffe
     1194289:	48 83 c6 08          	add    rsi,0x8
     119428d:	e8 6e a2 5b 00       	call   174e500 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10266c>
     1194292:	41 8b 46 10          	mov    eax,DWORD PTR [r14+0x10]
     1194296:	89 43 28             	mov    DWORD PTR [rbx+0x28],eax
     1194299:	83 63 2c 00          	and    DWORD PTR [rbx+0x2c],0x0
     119429d:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
     11942a1:	31 f6                	xor    esi,esi
     11942a3:	e8 5e 6a 91 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     11942a8:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     11942ac:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
     11942b0:	31 f6                	xor    esi,esi
     11942b2:	e8 4f 6a 91 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     11942b7:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
     11942bb:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     11942bf:	31 f6                	xor    esi,esi
     11942c1:	e8 40 6a 91 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     11942c6:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
     11942ca:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
     11942ce:	31 f6                	xor    esi,esi
     11942d0:	e8 31 6a 91 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     11942d5:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
     11942d9:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]
     11942dd:	31 f6                	xor    esi,esi
     11942df:	e8 22 6a 91 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     11942e4:	48 89 43 50          	mov    QWORD PTR [rbx+0x50],rax
     11942e8:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
     11942ec:	31 f6                	xor    esi,esi
     11942ee:	e8 13 6a 91 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     11942f3:	48 89 43 58          	mov    QWORD PTR [rbx+0x58],rax

### 0x11942ca: mov    rdi,QWORD PTR [r14+0x30]; FDE=(18432600, 18432804)
     119429d:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
     11942a1:	31 f6                	xor    esi,esi
     11942a3:	e8 5e 6a 91 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     11942a8:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     11942ac:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
     11942b0:	31 f6                	xor    esi,esi
     11942b2:	e8 4f 6a 91 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     11942b7:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
     11942bb:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     11942bf:	31 f6                	xor    esi,esi
     11942c1:	e8 40 6a 91 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     11942c6:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
     11942ca:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
     11942ce:	31 f6                	xor    esi,esi
     11942d0:	e8 31 6a 91 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     11942d5:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
     11942d9:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]
     11942dd:	31 f6                	xor    esi,esi
     11942df:	e8 22 6a 91 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     11942e4:	48 89 43 50          	mov    QWORD PTR [rbx+0x50],rax
     11942e8:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
     11942ec:	31 f6                	xor    esi,esi
     11942ee:	e8 13 6a 91 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     11942f3:	48 89 43 58          	mov    QWORD PTR [rbx+0x58],rax
     11942f7:	41 0f 10 46 48       	movups xmm0,XMMWORD PTR [r14+0x48]
     11942fc:	41 0f 10 4e 54       	movups xmm1,XMMWORD PTR [r14+0x54]
     1194301:	0f 11 43 60          	movups XMMWORD PTR [rbx+0x60],xmm0
     1194305:	0f 11 4b 6c          	movups XMMWORD PTR [rbx+0x6c],xmm1
     1194309:	48 83 c4 08          	add    rsp,0x8
     119430d:	5b                   	pop    rbx
     119430e:	41 5e                	pop    r14
     1194310:	c3                   	ret
     1194311:	49 89 c6             	mov    r14,rax

### 0x1194682: lea    rdi,[rbx+0x30]; FDE=(18432867, 18435180)
     1194658:	48 8b 84 24 08 01 00 	mov    rax,QWORD PTR [rsp+0x108]
     119465f:	00 
     1194660:	48 89 c1             	mov    rcx,rax
     1194663:	48 83 c1 07          	add    rcx,0x7
     1194667:	a8 01                	test   al,0x1
     1194669:	49 0f 44 cd          	cmove  rcx,r13
     119466d:	48 8b 01             	mov    rax,QWORD PTR [rcx]
     1194670:	f6 40 10 02          	test   BYTE PTR [rax+0x10],0x2
     1194674:	74 22                	je     1194698 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35baae>
     1194676:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
     119467a:	83 4b 10 08          	or     DWORD PTR [rbx+0x10],0x8
     119467e:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     1194682:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     1194686:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     119468a:	f6 c2 01             	test   dl,0x1
     119468d:	0f 85 f1 04 00 00    	jne    1194b84 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35bf9a>
     1194693:	e8 fa 10 5d 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1194698:	48 8d 94 24 a0 00 00 	lea    rdx,[rsp+0xa0]
     119469f:	00 
     11946a0:	48 83 62 08 00       	and    QWORD PTR [rdx+0x8],0x0
     11946a5:	48 8d 05 54 33 6f 00 	lea    rax,[rip+0x6f3354]        # 1887a00 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x6d8>
     11946ac:	48 89 02             	mov    QWORD PTR [rdx],rax
     11946af:	0f 57 c0             	xorps  xmm0,xmm0
     11946b2:	0f 11 42 10          	movups XMMWORD PTR [rdx+0x10],xmm0
     11946b6:	0f 11 42 20          	movups XMMWORD PTR [rdx+0x20],xmm0
     11946ba:	0f 11 42 30          	movups XMMWORD PTR [rdx+0x30],xmm0
     11946be:	48 83 62 40 00       	and    QWORD PTR [rdx+0x40],0x0
     11946c3:	4c 89 ff             	mov    rdi,r15
     11946c6:	4c 89 e6             	mov    rsi,r12
     11946c9:	e8 9e 05 00 00       	call   1194c6c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35c082>
     11946ce:	84 c0                	test   al,al
     11946d0:	74 0e                	je     11946e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35baf6>
     11946d2:	f6 84 24 b0 00 00 00 	test   BYTE PTR [rsp+0xb0],0x2

### 0x11948ab: lea    rdi,[rbx+0x30]; FDE=(18432867, 18435180)
     1194881:	48 8b 84 24 b8 00 00 	mov    rax,QWORD PTR [rsp+0xb8]
     1194888:	00 
     1194889:	48 89 c1             	mov    rcx,rax
     119488c:	48 83 c1 07          	add    rcx,0x7
     1194890:	a8 01                	test   al,0x1
     1194892:	49 0f 44 cc          	cmove  rcx,r12
     1194896:	48 8b 01             	mov    rax,QWORD PTR [rcx]
     1194899:	f6 40 10 02          	test   BYTE PTR [rax+0x10],0x2
     119489d:	74 22                	je     11948c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35bcd7>
     119489f:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
     11948a3:	83 4b 10 08          	or     DWORD PTR [rbx+0x10],0x8
     11948a7:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     11948ab:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     11948af:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     11948b3:	f6 c2 01             	test   dl,0x1
     11948b6:	0f 85 b0 02 00 00    	jne    1194b6c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35bf82>
     11948bc:	e8 d1 0e 5d 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     11948c1:	48 8d 54 24 58       	lea    rdx,[rsp+0x58]
     11948c6:	48 83 62 08 00       	and    QWORD PTR [rdx+0x8],0x0
     11948cb:	48 8d 05 2e 31 6f 00 	lea    rax,[rip+0x6f312e]        # 1887a00 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x6d8>
     11948d2:	48 89 02             	mov    QWORD PTR [rdx],rax
     11948d5:	0f 57 c0             	xorps  xmm0,xmm0
     11948d8:	0f 11 42 10          	movups XMMWORD PTR [rdx+0x10],xmm0
     11948dc:	0f 11 42 20          	movups XMMWORD PTR [rdx+0x20],xmm0
     11948e0:	0f 11 42 30          	movups XMMWORD PTR [rdx+0x30],xmm0
     11948e4:	48 83 62 40 00       	and    QWORD PTR [rdx+0x40],0x0
     11948e9:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
     11948ee:	4c 89 ff             	mov    rdi,r15
     11948f1:	e8 76 03 00 00       	call   1194c6c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35c082>
     11948f6:	84 c0                	test   al,al
     11948f8:	74 07                	je     1194901 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35bd17>
     11948fa:	f6 44 24 68 02       	test   BYTE PTR [rsp+0x68],0x2
     11948ff:	75 37                	jne    1194938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35bd4e>

### 0x11952ef: mov    rsi,QWORD PTR [r14+0x30]; FDE=(18436610, 18437059)
     11952c1:	48 8b 54 24 08       	mov    rdx,QWORD PTR [rsp+0x8]
     11952c6:	49 89 c1             	mov    r9,rax
     11952c9:	e8 a8 e2 41 00       	call   15b3576 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f8afa>
     11952ce:	48 8b 5c 24 28       	mov    rbx,QWORD PTR [rsp+0x28]
     11952d3:	48 89 df             	mov    rdi,rbx
     11952d6:	e8 11 14 92 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
     11952db:	48 85 db             	test   rbx,rbx
     11952de:	b3 01                	mov    bl,0x1
     11952e0:	75 63                	jne    1195345 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35c75b>
     11952e2:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     11952e7:	4c 89 e7             	mov    rdi,r12
     11952ea:	e8 21 43 9b ff       	call   b49610 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x965b0>
     11952ef:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
     11952f3:	41 8b 7e 28          	mov    edi,DWORD PTR [r14+0x28]
     11952f7:	e8 24 65 8e ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     11952fc:	84 c0                	test   al,al
     11952fe:	74 05                	je     1195305 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35c71b>
     1195300:	40 b5 01             	mov    bpl,0x1
     1195303:	eb 3e                	jmp    1195343 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35c759>
     1195305:	49 83 c6 28          	add    r14,0x28
     1195309:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     119530e:	4c 89 f6             	mov    rsi,r14
     1195311:	e8 84 ef 4c 00       	call   166429a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18406>
     1195316:	41 83 7f 1c 01       	cmp    DWORD PTR [r15+0x1c],0x1
     119531b:	75 06                	jne    1195323 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35c739>
     119531d:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1195321:	eb 07                	jmp    119532a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35c740>
     1195323:	48 8d 35 a6 e5 7a 00 	lea    rsi,[rip+0x7ae5a6]        # 19438d0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0xc518>
     119532a:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     119532f:	e8 2b 8c 42 00       	call   15bdf5f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4034e3>
     1195334:	89 c5                	mov    ebp,eax
     1195336:	48 8d bc 24 e8 00 00 	lea    rdi,[rsp+0xe8]
     119533d:	00 

### 0x11954e7: mov    rsi,QWORD PTR [r14+0x30]; FDE=(18437198, 18438319)
     11954be:	0f 85 e6 03 00 00    	jne    11958aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35ccc0>
     11954c4:	0f 57 c0             	xorps  xmm0,xmm0
     11954c7:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     11954ca:	e9 cb 02 00 00       	jmp    119579a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35cbb0>
     11954cf:	6a 02                	push   0x2
     11954d1:	41 58                	pop    r8
     11954d3:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
     11954d7:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     11954dc:	6a 01                	push   0x1
     11954de:	59                   	pop    rcx
     11954df:	4c 89 ea             	mov    rdx,r13
     11954e2:	e8 3d e0 41 00       	call   15b3524 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f8aa8>
     11954e7:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
     11954eb:	41 8b 7e 28          	mov    edi,DWORD PTR [r14+0x28]
     11954ef:	e8 2c 63 8e ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     11954f4:	84 c0                	test   al,al
     11954f6:	74 0b                	je     1195503 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35c919>
     11954f8:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
     11954fe:	e9 d9 00 00 00       	jmp    11955dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35c9f2>
     1195503:	49 8d 76 28          	lea    rsi,[r14+0x28]
     1195507:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     119550e:	00 
     119550f:	e8 86 ed 4c 00       	call   166429a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18406>
     1195514:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1195519:	e8 ec 4a a8 ff       	call   c1a00a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x166faa>
     119551e:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     1195523:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     119552a:	00 
     119552b:	e8 d8 ab fe ff       	call   1180108 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34751e>
     1195530:	4c 8d ac 24 48 01 00 	lea    r13,[rsp+0x148]
     1195537:	00 
     1195538:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     119553d:	4c 89 ef             	mov    rdi,r13

### 0x1195a0d: mov    QWORD PTR [r15+0x30],rcx; FDE=(18438320, 18439749)
     11959df:	e8 5c 91 65 00       	call   17eeb40 <_ZNSt6__ndk16chrono12system_clock9to_time_tERKNS0_10time_pointIS1_NS0_8durationIxNS_5ratioILl1ELl1000000EEEEEEE@plt>
     11959e4:	49 8b 4e 48          	mov    rcx,QWORD PTR [r14+0x48]
     11959e8:	48 29 c8             	sub    rax,rcx
     11959eb:	48 3d 80 3a 09 00    	cmp    rax,0x93a80
     11959f1:	7d 16                	jge    1195a09 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35ce1f>
     11959f3:	41 c6 47 2d 01       	mov    BYTE PTR [r15+0x2d],0x1
     11959f8:	41 8b 47 10          	mov    eax,DWORD PTR [r15+0x10]
     11959fc:	83 c8 10             	or     eax,0x10
     11959ff:	41 89 47 10          	mov    DWORD PTR [r15+0x10],eax
     1195a03:	49 8b 4e 48          	mov    rcx,QWORD PTR [r14+0x48]
     1195a07:	eb 04                	jmp    1195a0d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35ce23>
     1195a09:	41 8b 47 10          	mov    eax,DWORD PTR [r15+0x10]
     1195a0d:	49 89 4f 30          	mov    QWORD PTR [r15+0x30],rcx
     1195a11:	83 c8 20             	or     eax,0x20
     1195a14:	41 89 47 10          	mov    DWORD PTR [r15+0x10],eax
     1195a18:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1195a1d:	4c 8b a8 a0 00 00 00 	mov    r13,QWORD PTR [rax+0xa0]
     1195a24:	49 8b 6e 18          	mov    rbp,QWORD PTR [r14+0x18]
     1195a28:	48 83 e5 fc          	and    rbp,0xfffffffffffffffc
     1195a2c:	48 89 df             	mov    rdi,rbx
     1195a2f:	e8 74 b8 fe ff       	call   11812a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3486be>
     1195a34:	48 8d 54 24 60       	lea    rdx,[rsp+0x60]
     1195a39:	48 83 62 08 00       	and    QWORD PTR [rdx+0x8],0x0
     1195a3e:	49 89 c4             	mov    r12,rax
     1195a41:	48 8d 05 38 a1 6f 00 	lea    rax,[rip+0x6fa138]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>
     1195a48:	48 89 02             	mov    QWORD PTR [rdx],rax
     1195a4b:	0f 57 c0             	xorps  xmm0,xmm0
     1195a4e:	0f 11 42 10          	movups XMMWORD PTR [rdx+0x10],xmm0
     1195a52:	0f 11 42 20          	movups XMMWORD PTR [rdx+0x20],xmm0
     1195a56:	0f 11 42 30          	movups XMMWORD PTR [rdx+0x30],xmm0
     1195a5a:	4c 89 ef             	mov    rdi,r13
     1195a5d:	48 89 ee             	mov    rsi,rbp
     1195a60:	e8 cb a5 fe ff       	call   1180030 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x347446>

### 0x1195bae: mov    rsi,QWORD PTR [r14+0x30]; FDE=(18438320, 18439749)
     1195b7a:	41 80 4f 10 04       	or     BYTE PTR [r15+0x10],0x4
     1195b7f:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     1195b84:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1195b87:	ff 50 50             	call   QWORD PTR [rax+0x50]
     1195b8a:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1195b8f:	48 89 c6             	mov    rsi,rax
     1195b92:	e8 23 b9 4c 00       	call   16614ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15626>
     1195b97:	83 f8 03             	cmp    eax,0x3
     1195b9a:	41 0f 94 47 2c       	sete   BYTE PTR [r15+0x2c]
     1195b9f:	41 80 4f 10 08       	or     BYTE PTR [r15+0x10],0x8
     1195ba4:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     1195ba9:	e8 be d8 53 00       	call   16d346c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x875d8>
     1195bae:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
     1195bb2:	41 83 4f 10 01       	or     DWORD PTR [r15+0x10],0x1
     1195bb7:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     1195bbb:	49 8d 7f 18          	lea    rdi,[r15+0x18]
     1195bbf:	49 8b 57 08          	mov    rdx,QWORD PTR [r15+0x8]
     1195bc3:	f6 c2 01             	test   dl,0x1
     1195bc6:	0f 85 c2 01 00 00    	jne    1195d8e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35d1a4>
     1195bcc:	4c 8b a4 24 00 02 00 	mov    r12,QWORD PTR [rsp+0x200]
     1195bd3:	00 
     1195bd4:	e8 b9 fb 5c 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1195bd9:	49 8b 76 28          	mov    rsi,QWORD PTR [r14+0x28]
     1195bdd:	41 83 4f 10 02       	or     DWORD PTR [r15+0x10],0x2
     1195be2:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     1195be6:	49 8b 57 08          	mov    rdx,QWORD PTR [r15+0x8]
     1195bea:	49 83 c7 20          	add    r15,0x20
     1195bee:	f6 c2 01             	test   dl,0x1
     1195bf1:	0f 85 a3 01 00 00    	jne    1195d9a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35d1b0>
     1195bf7:	4c 89 ff             	mov    rdi,r15
     1195bfa:	e8 93 fb 5c 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1195bff:	41 8b 04 24          	mov    eax,DWORD PTR [r12]
     1195c03:	48 83 f8 0a          	cmp    rax,0xa

### 0x1195c94: mov    rdx,QWORD PTR [r14+0x30]; FDE=(18438320, 18439749)
     1195c5f:	e8 a7 9a 00 00       	call   119f70b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366b21>
     1195c64:	80 4b 10 04          	or     BYTE PTR [rbx+0x10],0x4
     1195c68:	48 89 df             	mov    rdi,rbx
     1195c6b:	48 83 c7 28          	add    rdi,0x28
     1195c6f:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     1195c73:	f6 c2 01             	test   dl,0x1
     1195c76:	0f 85 42 01 00 00    	jne    1195dbe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35d1d4>
     1195c7c:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
     1195c81:	e8 60 fb 5c 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
     1195c86:	e9 ae 00 00 00       	jmp    1195d39 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35d14f>
     1195c8b:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     1195c90:	48 83 c6 58          	add    rsi,0x58
     1195c94:	49 8b 56 30          	mov    rdx,QWORD PTR [r14+0x30]
     1195c98:	48 83 e2 fc          	and    rdx,0xfffffffffffffffc
     1195c9c:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     1195ca1:	e8 c5 99 00 00       	call   119f66b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366a81>
     1195ca6:	80 4b 10 04          	or     BYTE PTR [rbx+0x10],0x4
     1195caa:	48 89 df             	mov    rdi,rbx
     1195cad:	48 83 c7 28          	add    rdi,0x28
     1195cb1:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     1195cb5:	f6 c2 01             	test   dl,0x1
     1195cb8:	0f 85 0c 01 00 00    	jne    1195dca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35d1e0>
     1195cbe:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
     1195cc3:	e8 1e fb 5c 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
     1195cc8:	eb 6f                	jmp    1195d39 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35d14f>
     1195cca:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     1195ccf:	48 83 c6 58          	add    rsi,0x58
     1195cd3:	49 8b 56 20          	mov    rdx,QWORD PTR [r14+0x20]
     1195cd7:	48 83 e2 fc          	and    rdx,0xfffffffffffffffc
     1195cdb:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     1195ce0:	e8 86 99 00 00       	call   119f66b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366a81>
     1195ce5:	80 4b 10 04          	or     BYTE PTR [rbx+0x10],0x4
     1195ce9:	48 89 df             	mov    rdi,rbx

### 0x11965b3: lea    rdi,[rbx+0x30]; FDE=(18441604, 18441691)
     1196584:	53                   	push   rbx
     1196585:	48 89 fb             	mov    rbx,rdi
     1196588:	48 83 c7 08          	add    rdi,0x8
     119658c:	e8 77 44 91 ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
     1196591:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
     1196595:	e8 0e f3 5c 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     119659a:	48 8b 7b 50          	mov    rdi,QWORD PTR [rbx+0x50]
     119659e:	e8 05 f3 5c 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     11965a3:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
     11965a7:	e8 fc f2 5c 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     11965ac:	48 83 7b 30 00       	cmp    QWORD PTR [rbx+0x30],0x0
     11965b1:	74 09                	je     11965bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35d9d2>
     11965b3:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     11965b7:	e8 c8 be 5e 00       	call   1782484 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1365f0>
     11965bc:	48 83 7b 18 00       	cmp    QWORD PTR [rbx+0x18],0x0
     11965c1:	74 0c                	je     11965cf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35d9e5>
     11965c3:	48 83 c3 18          	add    rbx,0x18
     11965c7:	48 89 df             	mov    rdi,rbx
     11965ca:	e8 b5 be 5e 00       	call   1782484 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1365f0>
     11965cf:	5b                   	pop    rbx
     11965d0:	c3                   	ret
     11965d1:	eb 00                	jmp    11965d3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35d9e9>
     11965d3:	48 89 c7             	mov    rdi,rax
     11965d6:	e8 ca 34 8e ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     11965db:	cc                   	int3
     11965dc:	53                   	push   rbx
     11965dd:	48 89 fb             	mov    rbx,rdi
     11965e0:	e8 9f ff ff ff       	call   1196584 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35d99a>
     11965e5:	48 89 df             	mov    rdi,rbx
     11965e8:	5b                   	pop    rbx
     11965e9:	e9 32 79 65 00       	jmp    17edf20 <_ZdlPv@plt>
     11965ee:	0f 18 0d 7b 7b 77 00 	prefetcht0 BYTE PTR [rip+0x777b7b]        # 190e170 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x55580>
     11965f5:	48 8d 05 74 7b 77 00 	lea    rax,[rip+0x777b74]        # 190e170 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x55580>

### 0x1196924: mov    rsi,QWORD PTR [r15+0x30]; FDE=(18442288, 18442746)
     11968f3:	e9 83 00 00 00       	jmp    119697b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35dd91>
     11968f8:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
     11968fd:	49 8d 5e 40          	lea    rbx,[r14+0x40]
     1196901:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     1196906:	48 89 df             	mov    rdi,rbx
     1196909:	e8 80 b2 96 ff       	call   b01b8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4eb2e>
     119690e:	49 83 c6 48          	add    r14,0x48
     1196912:	4c 39 f0             	cmp    rax,r14
     1196915:	75 64                	jne    119697b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35dd91>
     1196917:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     119691c:	48 89 df             	mov    rdi,rbx
     119691f:	e8 ec 2c 9b ff       	call   b49610 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x965b0>
     1196924:	49 8b 77 30          	mov    rsi,QWORD PTR [r15+0x30]
     1196928:	41 8b 7f 28          	mov    edi,DWORD PTR [r15+0x28]
     119692c:	e8 ef 4e 8e ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     1196931:	84 c0                	test   al,al
     1196933:	74 05                	je     119693a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35dd50>
     1196935:	40 b5 01             	mov    bpl,0x1
     1196938:	eb 3e                	jmp    1196978 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35dd8e>
     119693a:	49 83 c7 28          	add    r15,0x28
     119693e:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     1196943:	4c 89 fe             	mov    rsi,r15
     1196946:	e8 4f d9 4c 00       	call   166429a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18406>
     119694b:	41 83 7d 1c 04       	cmp    DWORD PTR [r13+0x1c],0x4
     1196950:	75 06                	jne    1196958 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35dd6e>
     1196952:	49 8b 75 10          	mov    rsi,QWORD PTR [r13+0x10]
     1196956:	eb 07                	jmp    119695f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35dd75>
     1196958:	48 8d 35 31 ce 7a 00 	lea    rsi,[rip+0x7ace31]        # 1943790 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0xc3d8>
     119695f:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     1196964:	e8 b4 76 42 00       	call   15be01d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4035a1>
     1196969:	89 c5                	mov    ebp,eax
     119696b:	48 8d bc 24 e8 00 00 	lea    rdi,[rsp+0xe8]
     1196972:	00 

### 0x1196ac1: mov    rsi,QWORD PTR [r14+0x30]; FDE=(18442874, 18444040)
     1196a97:	48 89 fb             	mov    rbx,rdi
     1196a9a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1196aa1:	00 00 
     1196aa3:	48 89 84 24 80 02 00 	mov    QWORD PTR [rsp+0x280],rax
     1196aaa:	00 
     1196aab:	6a 05                	push   0x5
     1196aad:	5e                   	pop    rsi
     1196aae:	48 89 cf             	mov    rdi,rcx
     1196ab1:	e8 e4 96 00 00       	call   11a019a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3675b0>
     1196ab6:	84 c0                	test   al,al
     1196ab8:	74 23                	je     1196add <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35def3>
     1196aba:	49 8b af 80 00 00 00 	mov    rbp,QWORD PTR [r15+0x80]
     1196ac1:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
     1196ac5:	41 8b 7e 28          	mov    edi,DWORD PTR [r14+0x28]
     1196ac9:	e8 52 4d 8e ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     1196ace:	84 c0                	test   al,al
     1196ad0:	74 2d                	je     1196aff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35df15>
     1196ad2:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
     1196ad8:	e9 2e 01 00 00       	jmp    1196c0b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e021>
     1196add:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1196ae4:	00 00 
     1196ae6:	48 3b 84 24 80 02 00 	cmp    rax,QWORD PTR [rsp+0x280]
     1196aed:	00 
     1196aee:	0f 85 0f 04 00 00    	jne    1196f03 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e319>
     1196af4:	0f 57 c0             	xorps  xmm0,xmm0
     1196af7:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     1196afa:	e9 f3 02 00 00       	jmp    1196df2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e208>
     1196aff:	48 89 2c 24          	mov    QWORD PTR [rsp],rbp
     1196b03:	49 8d 76 28          	lea    rsi,[r14+0x28]
     1196b07:	48 8d ac 24 a8 01 00 	lea    rbp,[rsp+0x1a8]
     1196b0e:	00 
     1196b0f:	48 89 ef             	mov    rdi,rbp
     1196b12:	e8 83 d7 4c 00       	call   166429a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18406>

### 0x1196fdf: mov    rcx,QWORD PTR [rbx+0x30]; FDE=(18444040, 18445854)
     1196fb8:	4c 89 e7             	mov    rdi,r12
     1196fbb:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     1196fc0:	ff 50 38             	call   QWORD PTR [rax+0x38]
     1196fc3:	8d 48 01             	lea    ecx,[rax+0x1]
     1196fc6:	31 d2                	xor    edx,edx
     1196fc8:	83 f8 04             	cmp    eax,0x4
     1196fcb:	0f 42 d1             	cmovb  edx,ecx
     1196fce:	41 89 56 3c          	mov    DWORD PTR [r14+0x3c],edx
     1196fd2:	41 8b 46 10          	mov    eax,DWORD PTR [r14+0x10]
     1196fd6:	89 c1                	mov    ecx,eax
     1196fd8:	83 c9 20             	or     ecx,0x20
     1196fdb:	41 89 4e 10          	mov    DWORD PTR [r14+0x10],ecx
     1196fdf:	48 8b 4b 30          	mov    rcx,QWORD PTR [rbx+0x30]
     1196fe3:	49 89 4e 40          	mov    QWORD PTR [r14+0x40],rcx
     1196fe7:	89 c1                	mov    ecx,eax
     1196fe9:	83 c9 60             	or     ecx,0x60
     1196fec:	41 89 4e 10          	mov    DWORD PTR [r14+0x10],ecx
     1196ff0:	48 8b 4b 40          	mov    rcx,QWORD PTR [rbx+0x40]
     1196ff4:	49 89 4e 48          	mov    QWORD PTR [r14+0x48],rcx
     1196ff8:	0d e0 00 00 00       	or     eax,0xe0
     1196ffd:	41 89 46 10          	mov    DWORD PTR [r14+0x10],eax
     1197001:	83 7d 28 05          	cmp    DWORD PTR [rbp+0x28],0x5
     1197005:	75 0b                	jne    1197012 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e428>
     1197007:	48 8b 45 20          	mov    rax,QWORD PTR [rbp+0x20]
     119700b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1197010:	eb 2b                	jmp    119703d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e453>
     1197012:	48 89 ef             	mov    rdi,rbp
     1197015:	e8 46 46 01 00       	call   11ab660 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372a76>
     119701a:	c7 45 28 05 00 00 00 	mov    DWORD PTR [rbp+0x28],0x5
     1197021:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
     1197025:	40 f6 c7 01          	test   dil,0x1
     1197029:	0f 85 35 05 00 00    	jne    1197564 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e97a>
     119702f:	e8 ea 05 00 00       	call   119761e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35ea34>

### 0x1197881: movups XMMWORD PTR [r15+0x30],xmm0; FDE=(18446336, 18446690)
     119784d:	48 89 df             	mov    rdi,rbx
     1197850:	e8 13 48 af ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     1197855:	eb 7d                	jmp    11978d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35ecea>
     1197857:	0f 57 c0             	xorps  xmm0,xmm0
     119785a:	4c 8d 7c 24 50       	lea    r15,[rsp+0x50]
     119785f:	41 0f 11 47 08       	movups XMMWORD PTR [r15+0x8],xmm0
     1197864:	48 8d 05 3d fe 6e 00 	lea    rax,[rip+0x6efe3d]        # 18876a8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x380>
     119786b:	49 89 07             	mov    QWORD PTR [r15],rax
     119786e:	48 8d 05 83 7f 2a ff 	lea    rax,[rip+0xffffffffff2a7f83]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     1197875:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     1197879:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
     119787d:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
     1197881:	41 0f 11 47 30       	movups XMMWORD PTR [r15+0x30],xmm0
     1197886:	49 83 67 40 00       	and    QWORD PTR [r15+0x40],0x0
     119788b:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1197890:	e8 a1 3f 8e ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1197895:	4c 89 ff             	mov    rdi,r15
     1197898:	48 89 c6             	mov    rsi,rax
     119789b:	e8 b2 7f 5e 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
     11978a0:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     11978a5:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     11978aa:	e8 dc 8a 00 00       	call   11a038b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3677a1>
     11978af:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     11978b4:	4c 89 f6             	mov    rsi,r14
     11978b7:	e8 e4 83 5e 00       	call   177fca0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e0c>
     11978bc:	48 83 23 00          	and    QWORD PTR [rbx],0x0
     11978c0:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     11978c5:	e8 5a 2d 01 00       	call   11aa624 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x371a3a>
     11978ca:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     11978cf:	e8 d6 78 92 ff       	call   abf1aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc14a>
     11978d4:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     11978d9:	e8 0e ee 91 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
     11978de:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]

### 0x1197ab5: movups XMMWORD PTR [r15+0x30],xmm0; FDE=(18446900, 18447240)
     1197a81:	48 89 df             	mov    rdi,rbx
     1197a84:	e8 df 45 af ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     1197a89:	eb 7e                	jmp    1197b09 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35ef1f>
     1197a8b:	0f 57 c0             	xorps  xmm0,xmm0
     1197a8e:	4c 8d 7c 24 50       	lea    r15,[rsp+0x50]
     1197a93:	41 0f 11 47 08       	movups XMMWORD PTR [r15+0x8],xmm0
     1197a98:	48 8d 05 09 fc 6e 00 	lea    rax,[rip+0x6efc09]        # 18876a8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x380>
     1197a9f:	49 89 07             	mov    QWORD PTR [r15],rax
     1197aa2:	48 8d 05 4f 7d 2a ff 	lea    rax,[rip+0xffffffffff2a7d4f]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     1197aa9:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     1197aad:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
     1197ab1:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
     1197ab5:	41 0f 11 47 30       	movups XMMWORD PTR [r15+0x30],xmm0
     1197aba:	49 83 67 40 00       	and    QWORD PTR [r15+0x40],0x0
     1197abf:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1197ac4:	e8 6d 3d 8e ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1197ac9:	4c 89 ff             	mov    rdi,r15
     1197acc:	48 89 c6             	mov    rsi,rax
     1197acf:	e8 7e 7d 5e 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
     1197ad4:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1197ad9:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     1197ade:	e8 a8 88 00 00       	call   11a038b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3677a1>
     1197ae3:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
     1197ae8:	4c 89 f7             	mov    rdi,r14
     1197aeb:	4c 89 fe             	mov    rsi,r15
     1197aee:	e8 a3 f7 fc ff       	call   1167296 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32e6ac>
     1197af3:	48 83 23 00          	and    QWORD PTR [rbx],0x0
     1197af7:	4c 89 ff             	mov    rdi,r15
     1197afa:	e8 25 2b 01 00       	call   11aa624 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x371a3a>
     1197aff:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1197b04:	e8 a1 76 92 ff       	call   abf1aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc14a>
     1197b09:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     1197b0e:	e8 d9 eb 91 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>

### 0x11980d0: mov    rsi,QWORD PTR [rbx+0x30]; FDE=(18448320, 18448726)
     11980b1:	89 e8                	mov    eax,ebp
     11980b3:	48 81 c4 f8 00 00 00 	add    rsp,0xf8
     11980ba:	5b                   	pop    rbx
     11980bb:	41 5c                	pop    r12
     11980bd:	41 5d                	pop    r13
     11980bf:	41 5e                	pop    r14
     11980c1:	41 5f                	pop    r15
     11980c3:	5d                   	pop    rbp
     11980c4:	c3                   	ret
     11980c5:	48 89 e6             	mov    rsi,rsp
     11980c8:	4c 89 e7             	mov    rdi,r12
     11980cb:	e8 40 15 9b ff       	call   b49610 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x965b0>
     11980d0:	48 8b 73 30          	mov    rsi,QWORD PTR [rbx+0x30]
     11980d4:	8b 7b 28             	mov    edi,DWORD PTR [rbx+0x28]
     11980d7:	e8 44 37 8e ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     11980dc:	40 b5 01             	mov    bpl,0x1
     11980df:	84 c0                	test   al,al
     11980e1:	75 ab                	jne    119808e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35f4a4>
     11980e3:	48 83 c3 28          	add    rbx,0x28
     11980e7:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     11980ec:	48 89 de             	mov    rsi,rbx
     11980ef:	e8 a6 c1 4c 00       	call   166429a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18406>
     11980f4:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     11980f9:	4c 89 ee             	mov    rsi,r13
     11980fc:	e8 5d 0f 00 00       	call   119905e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x360474>
     1198101:	89 c5                	mov    ebp,eax
     1198103:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
     119810a:	00 
     119810b:	e8 d8 34 8e ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     1198110:	e9 79 ff ff ff       	jmp    119808e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35f4a4>
     1198115:	48 89 c3             	mov    rbx,rax
     1198118:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
     119811f:	00 

### 0x11986c7: mov    rsi,QWORD PTR [r15+0x30]; FDE=(18448778, 18450994)
     1198692:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     1198696:	48 83 60 08 00       	and    QWORD PTR [rax+0x8],0x0
     119869b:	0f 57 c0             	xorps  xmm0,xmm0
     119869e:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
     11986a2:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
     11986a6:	48 89 58 40          	mov    QWORD PTR [rax+0x40],rbx
     11986aa:	48 83 60 58 00       	and    QWORD PTR [rax+0x58],0x0
     11986af:	0f 11 40 48          	movups XMMWORD PTR [rax+0x48],xmm0
     11986b3:	48 8d 0d 4e 01 6c 00 	lea    rcx,[rip+0x6c014e]        # 1858808 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x14ef0>
     11986ba:	48 89 08             	mov    QWORD PTR [rax],rcx
     11986bd:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     11986c2:	e8 d3 08 00 00       	call   1198f9a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3603b0>
     11986c7:	49 8b 77 30          	mov    rsi,QWORD PTR [r15+0x30]
     11986cb:	41 8b 7f 28          	mov    edi,DWORD PTR [r15+0x28]
     11986cf:	e8 4c 31 8e ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     11986d4:	84 c0                	test   al,al
     11986d6:	74 0e                	je     11986e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35fafc>
     11986d8:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
     11986df:	00 00 
     11986e1:	e9 8b 00 00 00       	jmp    1198771 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35fb87>
     11986e6:	49 83 c7 28          	add    r15,0x28
     11986ea:	48 8d bc 24 48 01 00 	lea    rdi,[rsp+0x148]
     11986f1:	00 
     11986f2:	4c 89 fe             	mov    rsi,r15
     11986f5:	e8 a0 bb 4c 00       	call   166429a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18406>
     11986fa:	48 83 a4 24 f0 00 00 	and    QWORD PTR [rsp+0xf0],0x0
     1198701:	00 00 
     1198703:	48 83 a4 24 00 01 00 	and    QWORD PTR [rsp+0x100],0x0
     119870a:	00 00 
     119870c:	bf d8 00 00 00       	mov    edi,0xd8
     1198711:	e8 ea 57 65 00       	call   17edf00 <_Znwm@plt>
     1198716:	49 89 c6             	mov    r14,rax
     1198719:	48 8d b4 24 48 01 00 	lea    rsi,[rsp+0x148]

### 0x1198afd: lea    rdi,[rbx+0x30]; FDE=(18450994, 18451720)
     1198ad2:	89 c1                	mov    ecx,eax
     1198ad4:	83 c9 40             	or     ecx,0x40
     1198ad7:	89 4b 10             	mov    DWORD PTR [rbx+0x10],ecx
     1198ada:	49 8b 4e 40          	mov    rcx,QWORD PTR [r14+0x40]
     1198ade:	48 89 4b 48          	mov    QWORD PTR [rbx+0x48],rcx
     1198ae2:	89 c1                	mov    ecx,eax
     1198ae4:	81 c9 c0 00 00 00    	or     ecx,0xc0
     1198aea:	89 4b 10             	mov    DWORD PTR [rbx+0x10],ecx
     1198aed:	49 8b 76 28          	mov    rsi,QWORD PTR [r14+0x28]
     1198af1:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     1198af5:	0d c8 00 00 00       	or     eax,0xc8
     1198afa:	89 43 10             	mov    DWORD PTR [rbx+0x10],eax
     1198afd:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     1198b01:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     1198b05:	f6 c2 01             	test   dl,0x1
     1198b08:	0f 85 86 01 00 00    	jne    1198c94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3600aa>
     1198b0e:	e8 7f cc 5c 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1198b13:	c7 43 3c 01 00 00 00 	mov    DWORD PTR [rbx+0x3c],0x1
     1198b1a:	80 4b 10 20          	or     BYTE PTR [rbx+0x10],0x20
     1198b1e:	41 83 7c 24 28 13    	cmp    DWORD PTR [r12+0x28],0x13
     1198b24:	75 07                	jne    1198b2d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35ff43>
     1198b26:	4d 8b 6c 24 20       	mov    r13,QWORD PTR [r12+0x20]
     1198b2b:	eb 2d                	jmp    1198b5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35ff70>
     1198b2d:	4c 89 e7             	mov    rdi,r12
     1198b30:	e8 2b 2b 01 00       	call   11ab660 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372a76>
     1198b35:	41 c7 44 24 28 13 00 	mov    DWORD PTR [r12+0x28],0x13
     1198b3c:	00 00 
     1198b3e:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     1198b43:	40 f6 c7 01          	test   dil,0x1
     1198b47:	0f 85 6b 01 00 00    	jne    1198cb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3600ce>
     1198b4d:	e8 b6 01 00 00       	call   1198d08 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36011e>
     1198b52:	49 89 c5             	mov    r13,rax
     1198b55:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax

### 0x1198b5a: mov    rsi,QWORD PTR [r14+0x30]; FDE=(18450994, 18451720)
     1198b26:	4d 8b 6c 24 20       	mov    r13,QWORD PTR [r12+0x20]
     1198b2b:	eb 2d                	jmp    1198b5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35ff70>
     1198b2d:	4c 89 e7             	mov    rdi,r12
     1198b30:	e8 2b 2b 01 00       	call   11ab660 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372a76>
     1198b35:	41 c7 44 24 28 13 00 	mov    DWORD PTR [r12+0x28],0x13
     1198b3c:	00 00 
     1198b3e:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     1198b43:	40 f6 c7 01          	test   dil,0x1
     1198b47:	0f 85 6b 01 00 00    	jne    1198cb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3600ce>
     1198b4d:	e8 b6 01 00 00       	call   1198d08 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36011e>
     1198b52:	49 89 c5             	mov    r13,rax
     1198b55:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
     1198b5a:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
     1198b5e:	41 83 4d 10 01       	or     DWORD PTR [r13+0x10],0x1
     1198b63:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     1198b67:	49 8d 7d 18          	lea    rdi,[r13+0x18]
     1198b6b:	49 8b 55 08          	mov    rdx,QWORD PTR [r13+0x8]
     1198b6f:	f6 c2 01             	test   dl,0x1
     1198b72:	0f 85 28 01 00 00    	jne    1198ca0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3600b6>
     1198b78:	4c 8b 64 24 60       	mov    r12,QWORD PTR [rsp+0x60]
     1198b7d:	e8 10 cc 5c 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1198b82:	49 8b 76 38          	mov    rsi,QWORD PTR [r14+0x38]
     1198b86:	41 83 4d 10 02       	or     DWORD PTR [r13+0x10],0x2
     1198b8b:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     1198b8f:	49 8b 55 08          	mov    rdx,QWORD PTR [r13+0x8]
     1198b93:	49 83 c5 20          	add    r13,0x20
     1198b97:	f6 c2 01             	test   dl,0x1
     1198b9a:	0f 85 0c 01 00 00    	jne    1198cac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3600c2>
     1198ba0:	4c 89 ef             	mov    rdi,r13
     1198ba3:	e8 ea cb 5c 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1198ba8:	41 8b 04 24          	mov    eax,DWORD PTR [r12]
     1198bac:	83 f8 0a             	cmp    eax,0xa
     1198baf:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]

### 0x1198eb2: mov    QWORD PTR [rbx+0x30],rax; FDE=(18452066, 18452245)
     1198e85:	40 f6 c6 01          	test   sil,0x1
     1198e89:	74 11                	je     1198e9c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3602b2>
     1198e8b:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
     1198e8f:	48 83 e6 fe          	and    rsi,0xfffffffffffffffe
     1198e93:	48 83 c6 08          	add    rsi,0x8
     1198e97:	e8 64 56 5b 00       	call   174e500 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10266c>
     1198e9c:	41 8b 46 10          	mov    eax,DWORD PTR [r14+0x10]
     1198ea0:	89 43 28             	mov    DWORD PTR [rbx+0x28],eax
     1198ea3:	83 63 2c 00          	and    DWORD PTR [rbx+0x2c],0x0
     1198ea7:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
     1198eab:	31 f6                	xor    esi,esi
     1198ead:	e8 54 1e 91 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1198eb2:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     1198eb6:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
     1198eba:	31 f6                	xor    esi,esi
     1198ebc:	e8 45 1e 91 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1198ec1:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
     1198ec5:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     1198ec9:	31 f6                	xor    esi,esi
     1198ecb:	e8 36 1e 91 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1198ed0:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
     1198ed4:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
     1198ed8:	31 f6                	xor    esi,esi
     1198eda:	e8 27 1e 91 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1198edf:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
     1198ee3:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]
     1198ee7:	31 f6                	xor    esi,esi
     1198ee9:	e8 18 1e 91 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1198eee:	48 89 43 50          	mov    QWORD PTR [rbx+0x50],rax
     1198ef2:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
     1198ef6:	48 89 43 58          	mov    QWORD PTR [rbx+0x58],rax
     1198efa:	48 83 c4 08          	add    rsp,0x8
     1198efe:	5b                   	pop    rbx

### 0x1198ed4: mov    rdi,QWORD PTR [r14+0x30]; FDE=(18452066, 18452245)
     1198ea7:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
     1198eab:	31 f6                	xor    esi,esi
     1198ead:	e8 54 1e 91 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1198eb2:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     1198eb6:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
     1198eba:	31 f6                	xor    esi,esi
     1198ebc:	e8 45 1e 91 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1198ec1:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
     1198ec5:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     1198ec9:	31 f6                	xor    esi,esi
     1198ecb:	e8 36 1e 91 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1198ed0:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
     1198ed4:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
     1198ed8:	31 f6                	xor    esi,esi
     1198eda:	e8 27 1e 91 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1198edf:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
     1198ee3:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]
     1198ee7:	31 f6                	xor    esi,esi
     1198ee9:	e8 18 1e 91 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1198eee:	48 89 43 50          	mov    QWORD PTR [rbx+0x50],rax
     1198ef2:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
     1198ef6:	48 89 43 58          	mov    QWORD PTR [rbx+0x58],rax
     1198efa:	48 83 c4 08          	add    rsp,0x8
     1198efe:	5b                   	pop    rbx
     1198eff:	41 5e                	pop    r14
     1198f01:	c3                   	ret
     1198f02:	49 89 c6             	mov    r14,rax
     1198f05:	48 89 df             	mov    rdi,rbx
     1198f08:	e8 83 4f 65 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1198f0d:	4c 89 f7             	mov    rdi,r14
     1198f10:	e8 bb 6d 8d ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1198f15:	cc                   	int3
     1198f16:	41 56                	push   r14

### 0x1199089: mov    rsi,QWORD PTR [r14+0x30]; FDE=(18452574, 18452695)
     1199061:	53                   	push   rbx
     1199062:	48 89 fb             	mov    rbx,rdi
     1199065:	83 a7 b0 00 00 00 00 	and    DWORD PTR [rdi+0xb0],0x0
     119906c:	48 83 a7 b8 00 00 00 	and    QWORD PTR [rdi+0xb8],0x0
     1199073:	00 
     1199074:	49 89 f6             	mov    r14,rsi
     1199077:	48 8b 76 20          	mov    rsi,QWORD PTR [rsi+0x20]
     119907b:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     119907f:	6a 01                	push   0x1
     1199081:	5d                   	pop    rbp
     1199082:	89 ea                	mov    edx,ebp
     1199084:	e8 57 b2 4c 00       	call   16642e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1844c>
     1199089:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
     119908d:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     1199091:	48 89 df             	mov    rdi,rbx
     1199094:	89 ea                	mov    edx,ebp
     1199096:	e8 45 b2 4c 00       	call   16642e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1844c>
     119909b:	49 8b 76 38          	mov    rsi,QWORD PTR [r14+0x38]
     119909f:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     11990a3:	48 89 df             	mov    rdi,rbx
     11990a6:	89 ea                	mov    edx,ebp
     11990a8:	e8 33 b2 4c 00       	call   16642e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1844c>
     11990ad:	48 8d 05 6d 13 24 ff 	lea    rax,[rip+0xffffffffff24136d]        # 3da421 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5006>
     11990b4:	48 89 83 b8 00 00 00 	mov    QWORD PTR [rbx+0xb8],rax
     11990bb:	c7 83 b4 00 00 00 01 	mov    DWORD PTR [rbx+0xb4],0x1
     11990c2:	00 00 00 
     11990c5:	48 89 df             	mov    rdi,rbx
     11990c8:	e8 8d b2 4c 00       	call   166435a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184c6>
     11990cd:	85 c0                	test   eax,eax
     11990cf:	0f 9f c0             	setg   al
     11990d2:	5b                   	pop    rbx
     11990d3:	41 5e                	pop    r14
     11990d5:	5d                   	pop    rbp

### 0x1199bf3: lea    rdi,[rbx+0x30]; FDE=(18454891, 18455814)
     1199bcb:	00 
     1199bcc:	4c 89 ff             	mov    rdi,r15
     1199bcf:	48 89 c6             	mov    rsi,rax
     1199bd2:	b9 e6 00 00 00       	mov    ecx,0xe6
     1199bd7:	41 ff 51 18          	call   QWORD PTR [r9+0x18]
     1199bdb:	8b 6c 24 0c          	mov    ebp,DWORD PTR [rsp+0xc]
     1199bdf:	84 c0                	test   al,al
     1199be1:	74 4b                	je     1199c2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361044>
     1199be3:	48 8b b4 24 b8 00 00 	mov    rsi,QWORD PTR [rsp+0xb8]
     1199bea:	00 
     1199beb:	83 4b 10 08          	or     DWORD PTR [rbx+0x10],0x8
     1199bef:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     1199bf3:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     1199bf7:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     1199bfb:	f6 c2 01             	test   dl,0x1
     1199bfe:	0f 85 8e 00 00 00    	jne    1199c92 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3610a8>
     1199c04:	e8 89 bb 5c 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1199c09:	48 8b b4 24 c0 00 00 	mov    rsi,QWORD PTR [rsp+0xc0]
     1199c10:	00 
     1199c11:	83 4b 10 10          	or     DWORD PTR [rbx+0x10],0x10
     1199c15:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     1199c19:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     1199c1d:	48 83 c3 38          	add    rbx,0x38
     1199c21:	f6 c2 01             	test   dl,0x1
     1199c24:	75 78                	jne    1199c9e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3610b4>
     1199c26:	48 89 df             	mov    rdi,rbx
     1199c29:	e8 64 bb 5c 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1199c2e:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1199c35:	00 
     1199c36:	e8 43 01 00 00       	call   1199d7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361194>
     1199c3b:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1199c40:	e8 6d 21 49 00       	call   162bdb2 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f20>
     1199c45:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]

### 0x1199da6: mov    rdi,QWORD PTR [rbx+0x30]; FDE=(18455934, 18456011)
     1199d7b:	41 5e                	pop    r14
     1199d7d:	c3                   	ret
     1199d7e:	53                   	push   rbx
     1199d7f:	48 89 fb             	mov    rbx,rdi
     1199d82:	48 83 c7 08          	add    rdi,0x8
     1199d86:	e8 7d 0c 91 ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
     1199d8b:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
     1199d8f:	e8 14 bb 5c 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     1199d94:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
     1199d98:	e8 0b bb 5c 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     1199d9d:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
     1199da1:	e8 02 bb 5c 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     1199da6:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
     1199daa:	e8 f9 ba 5c 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     1199daf:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
     1199db3:	e8 f0 ba 5c 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     1199db8:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
     1199dbc:	e8 e7 ba 5c 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     1199dc1:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
     1199dc5:	5b                   	pop    rbx
     1199dc6:	e9 dd ba 5c 00       	jmp    17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     1199dcb:	cc                   	int3
     1199dcc:	53                   	push   rbx
     1199dcd:	48 89 fb             	mov    rbx,rdi
     1199dd0:	e8 a9 ff ff ff       	call   1199d7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361194>
     1199dd5:	48 89 df             	mov    rdi,rbx
     1199dd8:	5b                   	pop    rbx
     1199dd9:	e9 42 41 65 00       	jmp    17edf20 <_ZdlPv@plt>
     1199dde:	55                   	push   rbp
     1199ddf:	53                   	push   rbx
     1199de0:	50                   	push   rax
     1199de1:	48 89 fb             	mov    rbx,rdi
     1199de4:	8b 6f 10             	mov    ebp,DWORD PTR [rdi+0x10]

### 0x1199e20: mov    rdi,QWORD PTR [rbx+0x30]; FDE=(18456030, 18456192)
     1199df3:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
     1199df7:	e8 36 64 91 ff       	call   ab0232 <JNI_OnUnload@@Base+0x37aff>
     1199dfc:	40 f6 c5 02          	test   bpl,0x2
     1199e00:	74 09                	je     1199e0b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361221>
     1199e02:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
     1199e06:	e8 27 64 91 ff       	call   ab0232 <JNI_OnUnload@@Base+0x37aff>
     1199e0b:	40 f6 c5 04          	test   bpl,0x4
     1199e0f:	74 09                	je     1199e1a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361230>
     1199e11:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
     1199e15:	e8 18 64 91 ff       	call   ab0232 <JNI_OnUnload@@Base+0x37aff>
     1199e1a:	40 f6 c5 08          	test   bpl,0x8
     1199e1e:	74 09                	je     1199e29 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36123f>
     1199e20:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
     1199e24:	e8 09 64 91 ff       	call   ab0232 <JNI_OnUnload@@Base+0x37aff>
     1199e29:	40 f6 c5 10          	test   bpl,0x10
     1199e2d:	74 09                	je     1199e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36124e>
     1199e2f:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
     1199e33:	e8 fa 63 91 ff       	call   ab0232 <JNI_OnUnload@@Base+0x37aff>
     1199e38:	40 f6 c5 20          	test   bpl,0x20
     1199e3c:	74 09                	je     1199e47 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36125d>
     1199e3e:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
     1199e42:	e8 eb 63 91 ff       	call   ab0232 <JNI_OnUnload@@Base+0x37aff>
     1199e47:	40 f6 c5 40          	test   bpl,0x40
     1199e4b:	74 09                	je     1199e56 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36126c>
     1199e4d:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
     1199e51:	e8 dc 63 91 ff       	call   ab0232 <JNI_OnUnload@@Base+0x37aff>
     1199e56:	0f 57 c0             	xorps  xmm0,xmm0
     1199e59:	0f 11 43 50          	movups XMMWORD PTR [rbx+0x50],xmm0
     1199e5d:	83 63 10 00          	and    DWORD PTR [rbx+0x10],0x0
     1199e61:	f6 43 08 01          	test   BYTE PTR [rbx+0x8],0x1
     1199e65:	75 07                	jne    1199e6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361284>
     1199e67:	48 83 c4 08          	add    rsp,0x8
     1199e6b:	5b                   	pop    rbx

### 0x1199f63: mov    rax,QWORD PTR [rbx+0x30]; FDE=(18456192, 18456681)
     1199f3f:	89 ef                	mov    edi,ebp
     1199f41:	4c 89 fe             	mov    rsi,r15
     1199f44:	e8 d7 18 8e ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     1199f49:	84 c0                	test   al,al
     1199f4b:	75 10                	jne    1199f5d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361373>
     1199f4d:	89 ef                	mov    edi,ebp
     1199f4f:	4c 89 fe             	mov    rsi,r15
     1199f52:	e8 b7 62 91 ff       	call   ab020e <JNI_OnUnload@@Base+0x37adb>
     1199f57:	49 01 c6             	add    r14,rax
     1199f5a:	49 ff c6             	inc    r14
     1199f5d:	41 f6 c4 08          	test   r12b,0x8
     1199f61:	74 2d                	je     1199f90 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3613a6>
     1199f63:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
     1199f67:	48 83 e0 fc          	and    rax,0xfffffffffffffffc
     1199f6b:	4c 8b 78 08          	mov    r15,QWORD PTR [rax+0x8]
     1199f6f:	0f b6 28             	movzx  ebp,BYTE PTR [rax]
     1199f72:	89 ef                	mov    edi,ebp
     1199f74:	4c 89 fe             	mov    rsi,r15
     1199f77:	e8 a4 18 8e ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     1199f7c:	84 c0                	test   al,al
     1199f7e:	75 10                	jne    1199f90 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3613a6>
     1199f80:	89 ef                	mov    edi,ebp
     1199f82:	4c 89 fe             	mov    rsi,r15
     1199f85:	e8 84 62 91 ff       	call   ab020e <JNI_OnUnload@@Base+0x37adb>
     1199f8a:	49 01 c6             	add    r14,rax
     1199f8d:	49 ff c6             	inc    r14
     1199f90:	41 f6 c4 10          	test   r12b,0x10
     1199f94:	74 2d                	je     1199fc3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3613d9>
     1199f96:	48 8b 43 38          	mov    rax,QWORD PTR [rbx+0x38]
     1199f9a:	48 83 e0 fc          	and    rax,0xfffffffffffffffc
     1199f9e:	4c 8b 78 08          	mov    r15,QWORD PTR [rax+0x8]
     1199fa2:	0f b6 28             	movzx  ebp,BYTE PTR [rax]
     1199fa5:	89 ef                	mov    edi,ebp

### 0x119a204: mov    r12,QWORD PTR [r14+0x30]; FDE=(18456708, 18457711)
     119a1de:	e8 53 16 8e ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     119a1e3:	48 89 d1             	mov    rcx,rdx
     119a1e6:	6a 03                	push   0x3
     119a1e8:	5e                   	pop    rsi
     119a1e9:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     119a1ed:	48 89 c2             	mov    rdx,rax
     119a1f0:	4d 89 f8             	mov    r8,r15
     119a1f3:	e8 1e 5d 91 ff       	call   aaff16 <JNI_OnUnload@@Base+0x377e3>
     119a1f8:	49 89 c7             	mov    r15,rax
     119a1fb:	41 8b 5e 10          	mov    ebx,DWORD PTR [r14+0x10]
     119a1ff:	f6 c3 08             	test   bl,0x8
     119a202:	74 71                	je     119a275 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36168b>
     119a204:	4d 8b 66 30          	mov    r12,QWORD PTR [r14+0x30]
     119a208:	49 83 e4 fc          	and    r12,0xfffffffffffffffc
     119a20c:	41 0f b6 2c 24       	movzx  ebp,BYTE PTR [r12]
     119a211:	4d 8b 6c 24 08       	mov    r13,QWORD PTR [r12+0x8]
     119a216:	89 ef                	mov    edi,ebp
     119a218:	4c 89 ee             	mov    rsi,r13
     119a21b:	e8 00 16 8e ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     119a220:	84 c0                	test   al,al
     119a222:	75 51                	jne    119a275 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36168b>
     119a224:	49 8d 7c 24 01       	lea    rdi,[r12+0x1]
     119a229:	89 e8                	mov    eax,ebp
     119a22b:	d1 e8                	shr    eax,1
     119a22d:	40 f6 c5 01          	test   bpl,0x1
     119a231:	49 0f 45 7c 24 10    	cmovne rdi,QWORD PTR [r12+0x10]
     119a237:	44 0f 44 e8          	cmove  r13d,eax
     119a23b:	48 8d 0d 20 8e 1a ff 	lea    rcx,[rip+0xffffffffff1a8e20]        # 343062 <_ZTSSt12bad_any_cast@@Base-0x4d166>
     119a242:	6a 01                	push   0x1
     119a244:	5a                   	pop    rdx
     119a245:	6a 34                	push   0x34
     119a247:	41 58                	pop    r8
     119a249:	44 89 ee             	mov    esi,r13d

### 0x119a620: mov    r15,QWORD PTR [r14+0x30]; FDE=(18457712, 18458989)
     119a5f1:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     119a5f6:	e8 95 38 65 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     119a5fb:	eb 1d                	jmp    119a61a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361a30>
     119a5fd:	80 4b 10 04          	or     BYTE PTR [rbx+0x10],0x4
     119a601:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
     119a605:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     119a609:	f6 c2 01             	test   dl,0x1
     119a60c:	0f 85 95 02 00 00    	jne    119a8a7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361cbd>
     119a612:	4c 89 fe             	mov    rsi,r15
     119a615:	e8 78 b1 5c 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     119a61a:	40 f6 c5 08          	test   bpl,0x8
     119a61e:	74 7a                	je     119a69a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361ab0>
     119a620:	4d 8b 7e 30          	mov    r15,QWORD PTR [r14+0x30]
     119a624:	49 83 e7 fc          	and    r15,0xfffffffffffffffc
     119a628:	49 8b 77 08          	mov    rsi,QWORD PTR [r15+0x8]
     119a62c:	41 8b 3f             	mov    edi,DWORD PTR [r15]
     119a62f:	e8 ec 11 8e ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     119a634:	84 c0                	test   al,al
     119a636:	74 45                	je     119a67d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361a93>
     119a638:	f6 43 30 03          	test   BYTE PTR [rbx+0x30],0x3
     119a63c:	75 5c                	jne    119a69a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361ab0>
     119a63e:	4c 8d 7b 30          	lea    r15,[rbx+0x30]
     119a642:	48 8d 35 33 79 2b ff 	lea    rsi,[rip+0xffffffffff2b7933]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     119a649:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     119a64e:	e8 2b f4 8d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     119a653:	80 4b 10 08          	or     BYTE PTR [rbx+0x10],0x8
     119a657:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     119a65b:	f6 c2 01             	test   dl,0x1
     119a65e:	0f 85 a3 02 00 00    	jne    119a907 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361d1d>
     119a664:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     119a669:	4c 89 ff             	mov    rdi,r15
     119a66c:	e8 21 b1 5c 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     119a671:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]

### 0x119a63e: lea    r15,[rbx+0x30]; FDE=(18457712, 18458989)
     119a615:	e8 78 b1 5c 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     119a61a:	40 f6 c5 08          	test   bpl,0x8
     119a61e:	74 7a                	je     119a69a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361ab0>
     119a620:	4d 8b 7e 30          	mov    r15,QWORD PTR [r14+0x30]
     119a624:	49 83 e7 fc          	and    r15,0xfffffffffffffffc
     119a628:	49 8b 77 08          	mov    rsi,QWORD PTR [r15+0x8]
     119a62c:	41 8b 3f             	mov    edi,DWORD PTR [r15]
     119a62f:	e8 ec 11 8e ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     119a634:	84 c0                	test   al,al
     119a636:	74 45                	je     119a67d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361a93>
     119a638:	f6 43 30 03          	test   BYTE PTR [rbx+0x30],0x3
     119a63c:	75 5c                	jne    119a69a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361ab0>
     119a63e:	4c 8d 7b 30          	lea    r15,[rbx+0x30]
     119a642:	48 8d 35 33 79 2b ff 	lea    rsi,[rip+0xffffffffff2b7933]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     119a649:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     119a64e:	e8 2b f4 8d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     119a653:	80 4b 10 08          	or     BYTE PTR [rbx+0x10],0x8
     119a657:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     119a65b:	f6 c2 01             	test   dl,0x1
     119a65e:	0f 85 a3 02 00 00    	jne    119a907 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361d1d>
     119a664:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     119a669:	4c 89 ff             	mov    rdi,r15
     119a66c:	e8 21 b1 5c 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     119a671:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     119a676:	e8 15 38 65 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     119a67b:	eb 1d                	jmp    119a69a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361ab0>
     119a67d:	80 4b 10 08          	or     BYTE PTR [rbx+0x10],0x8
     119a681:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     119a685:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     119a689:	f6 c2 01             	test   dl,0x1
     119a68c:	0f 85 21 02 00 00    	jne    119a8b3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361cc9>
     119a692:	4c 89 fe             	mov    rsi,r15
     119a695:	e8 f8 b0 5c 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>

### 0x119a681: lea    rdi,[rbx+0x30]; FDE=(18457712, 18458989)
     119a64e:	e8 2b f4 8d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     119a653:	80 4b 10 08          	or     BYTE PTR [rbx+0x10],0x8
     119a657:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     119a65b:	f6 c2 01             	test   dl,0x1
     119a65e:	0f 85 a3 02 00 00    	jne    119a907 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361d1d>
     119a664:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     119a669:	4c 89 ff             	mov    rdi,r15
     119a66c:	e8 21 b1 5c 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     119a671:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     119a676:	e8 15 38 65 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     119a67b:	eb 1d                	jmp    119a69a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361ab0>
     119a67d:	80 4b 10 08          	or     BYTE PTR [rbx+0x10],0x8
     119a681:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     119a685:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     119a689:	f6 c2 01             	test   dl,0x1
     119a68c:	0f 85 21 02 00 00    	jne    119a8b3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361cc9>
     119a692:	4c 89 fe             	mov    rsi,r15
     119a695:	e8 f8 b0 5c 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     119a69a:	40 f6 c5 10          	test   bpl,0x10
     119a69e:	74 7a                	je     119a71a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361b30>
     119a6a0:	4d 8b 7e 38          	mov    r15,QWORD PTR [r14+0x38]
     119a6a4:	49 83 e7 fc          	and    r15,0xfffffffffffffffc
     119a6a8:	49 8b 77 08          	mov    rsi,QWORD PTR [r15+0x8]
     119a6ac:	41 8b 3f             	mov    edi,DWORD PTR [r15]
     119a6af:	e8 6c 11 8e ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     119a6b4:	84 c0                	test   al,al
     119a6b6:	74 45                	je     119a6fd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361b13>
     119a6b8:	f6 43 38 03          	test   BYTE PTR [rbx+0x38],0x3
     119a6bc:	75 5c                	jne    119a71a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361b30>
     119a6be:	4c 8d 7b 38          	lea    r15,[rbx+0x38]
     119a6c2:	48 8d 35 b3 78 2b ff 	lea    rsi,[rip+0xffffffffff2b78b3]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     119a6c9:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     119a6ce:	e8 ab f3 8d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>

### 0x119ae06: mov    QWORD PTR [rbx+0x30],rax; FDE=(18459964, 18460320)
     119add6:	4c 89 e6             	mov    rsi,r12
     119add9:	e8 4c f7 52 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     119adde:	80 4b 10 01          	or     BYTE PTR [rbx+0x10],0x1
     119ade2:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     119ade6:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     119adea:	f6 c2 01             	test   dl,0x1
     119aded:	75 77                	jne    119ae66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36227c>
     119adef:	48 89 e6             	mov    rsi,rsp
     119adf2:	e8 ef a9 5c 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
     119adf7:	48 89 e7             	mov    rdi,rsp
     119adfa:	e8 91 30 65 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     119adff:	49 8b 87 e0 00 00 00 	mov    rax,QWORD PTR [r15+0xe0]
     119ae06:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     119ae0a:	80 4b 10 0c          	or     BYTE PTR [rbx+0x10],0xc
     119ae0e:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
     119ae12:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     119ae16:	f6 c2 01             	test   dl,0x1
     119ae19:	75 54                	jne    119ae6f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x362285>
     119ae1b:	4c 89 f6             	mov    rsi,r14
     119ae1e:	e8 6f a9 5c 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     119ae23:	48 89 df             	mov    rdi,rbx
     119ae26:	e8 99 03 00 00       	call   119b1c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3625da>
     119ae2b:	c7 40 18 03 00 00 00 	mov    DWORD PTR [rax+0x18],0x3
     119ae32:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1
     119ae36:	b0 01                	mov    al,0x1
     119ae38:	eb 02                	jmp    119ae3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x362252>
     119ae3a:	31 c0                	xor    eax,eax
     119ae3c:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     119ae43:	00 00 
     119ae45:	48 3b 4c 24 18       	cmp    rcx,QWORD PTR [rsp+0x18]
     119ae4a:	75 4f                	jne    119ae9b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3622b1>
     119ae4c:	48 83 c4 20          	add    rsp,0x20
     119ae50:	5b                   	pop    rbx

### 0x119b3a2: mov    QWORD PTR [rbx+0x30],rax; FDE=(18461400, 18461756)
     119b372:	4c 89 e6             	mov    rsi,r12
     119b375:	e8 b0 f1 52 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     119b37a:	80 4b 10 01          	or     BYTE PTR [rbx+0x10],0x1
     119b37e:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     119b382:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     119b386:	f6 c2 01             	test   dl,0x1
     119b389:	75 77                	jne    119b402 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x362818>
     119b38b:	48 89 e6             	mov    rsi,rsp
     119b38e:	e8 53 a4 5c 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
     119b393:	48 89 e7             	mov    rdi,rsp
     119b396:	e8 f5 2a 65 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     119b39b:	49 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [r15+0xf8]
     119b3a2:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     119b3a6:	80 4b 10 0c          	or     BYTE PTR [rbx+0x10],0xc
     119b3aa:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
     119b3ae:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     119b3b2:	f6 c2 01             	test   dl,0x1
     119b3b5:	75 54                	jne    119b40b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x362821>
     119b3b7:	4c 89 f6             	mov    rsi,r14
     119b3ba:	e8 d3 a3 5c 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     119b3bf:	48 89 df             	mov    rdi,rbx
     119b3c2:	e8 fd fd ff ff       	call   119b1c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3625da>
     119b3c7:	c7 40 18 02 00 00 00 	mov    DWORD PTR [rax+0x18],0x2
     119b3ce:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1
     119b3d2:	b0 01                	mov    al,0x1
     119b3d4:	eb 02                	jmp    119b3d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3627ee>
     119b3d6:	31 c0                	xor    eax,eax
     119b3d8:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     119b3df:	00 00 
     119b3e1:	48 3b 4c 24 18       	cmp    rcx,QWORD PTR [rsp+0x18]
     119b3e6:	75 4f                	jne    119b437 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36284d>
     119b3e8:	48 83 c4 20          	add    rsp,0x20
     119b3ec:	5b                   	pop    rbx

### 0x119b650: mov    rcx,QWORD PTR [rbx+0x30]; FDE=(18462142, 18462332)
     119b628:	c3                   	ret
     119b629:	31 c0                	xor    eax,eax
     119b62b:	eb 31                	jmp    119b65e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x362a74>
     119b62d:	4c 89 f7             	mov    rdi,r14
     119b630:	e8 2b 00 01 00       	call   11ab660 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372a76>
     119b635:	41 c7 46 28 0a 00 00 	mov    DWORD PTR [r14+0x28],0xa
     119b63c:	00 
     119b63d:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     119b641:	40 f6 c7 01          	test   dil,0x1
     119b645:	75 2c                	jne    119b673 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x362a89>
     119b647:	e8 4a 03 00 00       	call   119b996 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x362dac>
     119b64c:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
     119b650:	48 8b 4b 30          	mov    rcx,QWORD PTR [rbx+0x30]
     119b654:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
     119b658:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1
     119b65c:	b0 01                	mov    al,0x1
     119b65e:	48 83 c4 08          	add    rsp,0x8
     119b662:	5b                   	pop    rbx
     119b663:	41 5c                	pop    r12
     119b665:	41 5e                	pop    r14
     119b667:	41 5f                	pop    r15
     119b669:	c3                   	ret
     119b66a:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
     119b66e:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
     119b671:	eb 94                	jmp    119b607 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x362a1d>
     119b673:	48 83 e7 fe          	and    rdi,0xfffffffffffffffe
     119b677:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     119b67a:	eb cb                	jmp    119b647 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x362a5d>
     119b67c:	48 89 f0             	mov    rax,rsi
     119b67f:	48 8d b7 90 00 00 00 	lea    rsi,[rdi+0x90]
     119b686:	48 89 c7             	mov    rdi,rax
     119b689:	31 d2                	xor    edx,edx
     119b68b:	e9 10 43 00 00       	jmp    119f9a0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366db6>

### 0x119c186: lea    rdi,[r15+0x30]; FDE=(18464780, 18465697)
     119c159:	ff 50 38             	call   QWORD PTR [rax+0x38]
     119c15c:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]
     119c161:	44 89 ed             	mov    ebp,r13d
     119c164:	8d 50 01             	lea    edx,[rax+0x1]
     119c167:	31 c9                	xor    ecx,ecx
     119c169:	83 f8 04             	cmp    eax,0x4
     119c16c:	0f 42 ca             	cmovb  ecx,edx
     119c16f:	41 89 4e 3c          	mov    DWORD PTR [r14+0x3c],ecx
     119c173:	41 80 4e 10 20       	or     BYTE PTR [r14+0x10],0x20
     119c178:	49 8b 74 24 28       	mov    rsi,QWORD PTR [r12+0x28]
     119c17d:	41 83 4f 10 01       	or     DWORD PTR [r15+0x10],0x1
     119c182:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     119c186:	49 8d 7f 30          	lea    rdi,[r15+0x30]
     119c18a:	49 8b 57 08          	mov    rdx,QWORD PTR [r15+0x8]
     119c18e:	f6 c2 01             	test   dl,0x1
     119c191:	0f 85 97 01 00 00    	jne    119c32e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x363744>
     119c197:	e8 f6 95 5c 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     119c19c:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     119c1a1:	48 8b 70 28          	mov    rsi,QWORD PTR [rax+0x28]
     119c1a5:	41 83 4f 10 04       	or     DWORD PTR [r15+0x10],0x4
     119c1aa:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     119c1ae:	49 8d 7f 40          	lea    rdi,[r15+0x40]
     119c1b2:	49 8b 57 08          	mov    rdx,QWORD PTR [r15+0x8]
     119c1b6:	f6 c2 01             	test   dl,0x1
     119c1b9:	0f 85 7b 01 00 00    	jne    119c33a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x363750>
     119c1bf:	e8 ce 95 5c 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     119c1c4:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     119c1c9:	48 8b 70 30          	mov    rsi,QWORD PTR [rax+0x30]
     119c1cd:	41 83 4f 10 08       	or     DWORD PTR [r15+0x10],0x8
     119c1d2:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     119c1d6:	49 8d 7f 48          	lea    rdi,[r15+0x48]
     119c1da:	49 8b 57 08          	mov    rdx,QWORD PTR [r15+0x8]
     119c1de:	f6 c2 01             	test   dl,0x1

### 0x119c869: mov    rdi,QWORD PTR [rbx+0x30]; FDE=(18466368, 18467124)
     119c835:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     119c83a:	48 8d b4 24 20 01 00 	lea    rsi,[rsp+0x120]
     119c841:	00 
     119c842:	e8 a7 2e 90 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     119c847:	84 c0                	test   al,al
     119c849:	74 1e                	je     119c869 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x363c7f>
     119c84b:	8a 83 88 01 00 00    	mov    al,BYTE PTR [rbx+0x188]
     119c851:	3a 84 24 38 01 00 00 	cmp    al,BYTE PTR [rsp+0x138]
     119c858:	75 0f                	jne    119c869 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x363c7f>
     119c85a:	8a 83 89 01 00 00    	mov    al,BYTE PTR [rbx+0x189]
     119c860:	3a 84 24 39 01 00 00 	cmp    al,BYTE PTR [rsp+0x139]
     119c867:	74 09                	je     119c872 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x363c88>
     119c869:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
     119c86d:	e8 f0 db 8d ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
     119c872:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
     119c879:	00 
     119c87a:	e8 61 d4 92 ff       	call   ac9ce0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16c80>
     119c87f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     119c886:	00 00 
     119c888:	48 3b 84 24 40 01 00 	cmp    rax,QWORD PTR [rsp+0x140]
     119c88f:	00 
     119c890:	0f 85 99 00 00 00    	jne    119c92f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x363d45>
     119c896:	48 81 c4 48 01 00 00 	add    rsp,0x148
     119c89d:	5b                   	pop    rbx
     119c89e:	41 5c                	pop    r12
     119c8a0:	41 5d                	pop    r13
     119c8a2:	41 5e                	pop    r14
     119c8a4:	41 5f                	pop    r15
     119c8a6:	5d                   	pop    rbp
     119c8a7:	c3                   	ret
     119c8a8:	eb 5a                	jmp    119c904 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x363d1a>
     119c8aa:	48 89 c3             	mov    rbx,rax
     119c8ad:	48 8d bc 24 08 01 00 	lea    rdi,[rsp+0x108]

### 0x119cb3d: lea    rsi,[r15+0x30]; FDE=(18467507, 18468370)
     119cb05:	49 8b 06             	mov    rax,QWORD PTR [r14]
     119cb08:	4c 89 f7             	mov    rdi,r14
     119cb0b:	ff 90 90 00 00 00    	call   QWORD PTR [rax+0x90]
     119cb11:	41 80 4c 24 10 01    	or     BYTE PTR [r12+0x10],0x1
     119cb17:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
     119cb1c:	49 8b 54 24 08       	mov    rdx,QWORD PTR [r12+0x8]
     119cb21:	f6 c2 01             	test   dl,0x1
     119cb24:	0f 85 3d 02 00 00    	jne    119cd67 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36417d>
     119cb2a:	48 89 c6             	mov    rsi,rax
     119cb2d:	e8 60 8c 5c 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     119cb32:	49 89 6c 24 30       	mov    QWORD PTR [r12+0x30],rbp
     119cb37:	41 80 4c 24 10 0c    	or     BYTE PTR [r12+0x10],0xc
     119cb3d:	49 8d 77 30          	lea    rsi,[r15+0x30]
     119cb41:	49 8d 7c 24 28       	lea    rdi,[r12+0x28]
     119cb46:	49 8b 54 24 08       	mov    rdx,QWORD PTR [r12+0x8]
     119cb4b:	f6 c2 01             	test   dl,0x1
     119cb4e:	0f 85 1f 02 00 00    	jne    119cd73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x364189>
     119cb54:	e8 39 8c 5c 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     119cb59:	49 89 6c 24 38       	mov    QWORD PTR [r12+0x38],rbp
     119cb5e:	41 80 4c 24 10 10    	or     BYTE PTR [r12+0x10],0x10
     119cb64:	bf 08 02 00 00       	mov    edi,0x208
     119cb69:	49 03 7e 70          	add    rdi,QWORD PTR [r14+0x70]
     119cb6d:	e8 ce 1f 65 00       	call   17eeb40 <_ZNSt6__ndk16chrono12system_clock9to_time_tERKNS0_10time_pointIS1_NS0_8durationIxNS_5ratioILl1ELl1000000EEEEEEE@plt>
     119cb72:	49 89 44 24 40       	mov    QWORD PTR [r12+0x40],rax
     119cb77:	41 80 4c 24 10 20    	or     BYTE PTR [r12+0x10],0x20
     119cb7d:	4c 8d 84 24 80 00 00 	lea    r8,[rsp+0x80]
     119cb84:	00 
     119cb85:	49 83 20 00          	and    QWORD PTR [r8],0x0
     119cb89:	48 8d 05 50 b2 83 ff 	lea    rax,[rip+0xffffffffff83b250]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
     119cb90:	49 89 40 10          	mov    QWORD PTR [r8+0x10],rax
     119cb94:	48 8d 0d 35 b6 83 ff 	lea    rcx,[rip+0xffffffffff83b635]        # 9d81d0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base>
     119cb9b:	4c 8d 4c 24 60       	lea    r9,[rsp+0x60]
     119cba0:	49 83 21 00          	and    QWORD PTR [r9],0x0

### 0x119cecf: lea    rdi,[rbx+0x30]; FDE=(18468433, 18469366)
     119cea4:	4d 85 ff             	test   r15,r15
     119cea7:	0f 94 c1             	sete   cl
     119ceaa:	34 01                	xor    al,0x1
     119ceac:	08 c8                	or     al,cl
     119ceae:	0f 85 02 01 00 00    	jne    119cfb6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3643cc>
     119ceb4:	4c 89 ff             	mov    rdi,r15
     119ceb7:	e8 3a 03 00 00       	call   119d1f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36460c>
     119cebc:	48 89 df             	mov    rdi,rbx
     119cebf:	48 89 c6             	mov    rsi,rax
     119cec2:	e8 b9 11 65 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     119cec7:	4c 89 ff             	mov    rdi,r15
     119ceca:	e8 51 03 00 00       	call   119d220 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x364636>
     119cecf:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     119ced3:	48 89 c6             	mov    rsi,rax
     119ced6:	e8 a5 11 65 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     119cedb:	49 8d b7 c0 00 00 00 	lea    rsi,[r15+0xc0]
     119cee2:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     119cee7:	e8 32 37 a6 ff       	call   c0061e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x14d5be>
     119ceec:	48 8d 35 d6 b5 1e ff 	lea    rsi,[rip+0xffffffffff1eb5d6]        # 3884c9 <_ZTSSt12bad_any_cast@@Base-0x7cff>
     119cef3:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     119cef8:	e8 81 cb 8d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     119cefd:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     119cf02:	4c 8d 6c 24 38       	lea    r13,[rsp+0x38]
     119cf07:	4c 89 ee             	mov    rsi,r13
     119cf0a:	e8 59 89 94 ff       	call   ae5868 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x32808>
     119cf0f:	49 89 c4             	mov    r12,rax
     119cf12:	4c 89 ef             	mov    rdi,r13
     119cf15:	e8 76 0f 65 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     119cf1a:	4d 85 e4             	test   r12,r12
     119cf1d:	74 10                	je     119cf2f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x364345>
     119cf1f:	49 83 c4 28          	add    r12,0x28
     119cf23:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
     119cf27:	4c 89 e6             	mov    rsi,r12

### 0x119cfd5: lea    rdi,[rbx+0x30]; FDE=(18468433, 18469366)
     119cfa7:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     119cfac:	e8 39 e3 95 ff       	call   afb2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4828a>
     119cfb1:	e9 e4 00 00 00       	jmp    119d09a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3644b0>
     119cfb6:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     119cfba:	4c 89 e7             	mov    rdi,r12
     119cfbd:	ff 50 50             	call   QWORD PTR [rax+0x50]
     119cfc0:	48 89 df             	mov    rdi,rbx
     119cfc3:	48 89 c6             	mov    rsi,rax
     119cfc6:	e8 b5 10 65 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     119cfcb:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     119cfcf:	4c 89 e7             	mov    rdi,r12
     119cfd2:	ff 50 78             	call   QWORD PTR [rax+0x78]
     119cfd5:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     119cfd9:	48 89 c6             	mov    rsi,rax
     119cfdc:	e8 9f 10 65 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     119cfe1:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     119cfe5:	4c 89 e7             	mov    rdi,r12
     119cfe8:	ff 90 88 00 00 00    	call   QWORD PTR [rax+0x88]
     119cfee:	48 85 c0             	test   rax,rax
     119cff1:	74 0c                	je     119cfff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x364415>
     119cff3:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
     119cff7:	48 89 c6             	mov    rsi,rax
     119cffa:	e8 81 10 65 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     119cfff:	48 8d 35 7e d3 1a ff 	lea    rsi,[rip+0xffffffffff1ad37e]        # 34a384 <_ZTSSt12bad_any_cast@@Base-0x45e44>
     119d006:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     119d00b:	e8 6e ca 8d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     119d010:	49 8b 7c 24 70       	mov    rdi,QWORD PTR [r12+0x70]
     119d015:	4c 8d 6c 24 50       	lea    r13,[rsp+0x50]
     119d01a:	4c 89 ee             	mov    rsi,r13
     119d01d:	e8 c2 13 40 00       	call   159e3e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e3968>
     119d022:	49 89 c7             	mov    r15,rax
     119d025:	4c 89 ef             	mov    rdi,r13
     119d028:	e8 63 0e 65 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### 0x119d09a: lea    r15,[rbx+0x30]; FDE=(18468433, 18469366)
     119d064:	88 8b 91 00 00 00    	mov    BYTE PTR [rbx+0x91],cl
     119d06a:	8a 40 59             	mov    al,BYTE PTR [rax+0x59]
     119d06d:	88 83 90 00 00 00    	mov    BYTE PTR [rbx+0x90],al
     119d073:	eb 25                	jmp    119d09a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3644b0>
     119d075:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     119d079:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     119d07e:	4c 89 e6             	mov    rsi,r12
     119d081:	ff 90 f0 00 00 00    	call   QWORD PTR [rax+0xf0]
     119d087:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     119d08c:	8a 47 59             	mov    al,BYTE PTR [rdi+0x59]
     119d08f:	88 83 90 00 00 00    	mov    BYTE PTR [rbx+0x90],al
     119d095:	e8 3c 45 52 00       	call   16c15d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75742>
     119d09a:	4c 8d 7b 30          	lea    r15,[rbx+0x30]
     119d09e:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     119d0a3:	4c 89 fe             	mov    rsi,r15
     119d0a6:	e8 95 0e 65 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     119d0ab:	4c 8d 64 24 50       	lea    r12,[rsp+0x50]
     119d0b0:	4c 8d 6c 24 20       	lea    r13,[rsp+0x20]
     119d0b5:	4c 89 e7             	mov    rdi,r12
     119d0b8:	4c 89 ee             	mov    rsi,r13
     119d0bb:	e8 e0 fa 52 00       	call   16ccba0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x80d0c>
     119d0c0:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
     119d0c4:	4c 89 e6             	mov    rsi,r12
     119d0c7:	e8 62 e9 8d ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     119d0cc:	4c 89 e7             	mov    rdi,r12
     119d0cf:	e8 bc 0d 65 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     119d0d4:	4c 89 ef             	mov    rdi,r13
     119d0d7:	e8 b4 0d 65 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     119d0dc:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     119d0e1:	4c 89 f6             	mov    rsi,r14
     119d0e4:	4c 89 fa             	mov    rdx,r15
     119d0e7:	e8 a7 1b 00 00       	call   119ec93 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3660a9>
     119d0ec:	4c 8d 64 24 50       	lea    r12,[rsp+0x50]

### 0x119d4b0: lea    rdi,[rbx+0x30]; FDE=(18469764, 18470282)
     119d480:	89 c2                	mov    edx,eax
     119d482:	d1 ea                	shr    edx,1
     119d484:	a8 01                	test   al,0x1
     119d486:	49 0f 45 74 24 10    	cmovne rsi,QWORD PTR [r12+0x10]
     119d48c:	49 0f 45 54 24 08    	cmovne rdx,QWORD PTR [r12+0x8]
     119d492:	83 4b 28 02          	or     DWORD PTR [rbx+0x28],0x2
     119d496:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
     119d49a:	48 8b 4b 20          	mov    rcx,QWORD PTR [rbx+0x20]
     119d49e:	f6 c1 01             	test   cl,0x1
     119d4a1:	0f 85 87 00 00 00    	jne    119d52e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x364944>
     119d4a7:	e8 b0 82 5c 00       	call   176575c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198c8>
     119d4ac:	80 4b 28 01          	or     BYTE PTR [rbx+0x28],0x1
     119d4b0:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     119d4b4:	48 8b 53 20          	mov    rdx,QWORD PTR [rbx+0x20]
     119d4b8:	f6 c2 01             	test   dl,0x1
     119d4bb:	75 7d                	jne    119d53a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x364950>
     119d4bd:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     119d4c2:	e8 cb 82 5c 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     119d4c7:	4c 89 6b 48          	mov    QWORD PTR [rbx+0x48],r13
     119d4cb:	48 89 6b 50          	mov    QWORD PTR [rbx+0x50],rbp
     119d4cf:	4c 89 73 58          	mov    QWORD PTR [rbx+0x58],r14
     119d4d3:	80 4b 28 3c          	or     BYTE PTR [rbx+0x28],0x3c
     119d4d7:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
     119d4db:	48 8b 53 20          	mov    rdx,QWORD PTR [rbx+0x20]
     119d4df:	f6 c2 01             	test   dl,0x1
     119d4e2:	75 62                	jne    119d546 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36495c>
     119d4e4:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
     119d4e9:	e8 a4 82 5c 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     119d4ee:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     119d4f2:	e8 cd dc ff ff       	call   119b1c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3625da>
     119d4f7:	8b 8c 24 88 00 00 00 	mov    ecx,DWORD PTR [rsp+0x88]
     119d4fe:	89 48 18             	mov    DWORD PTR [rax+0x18],ecx
     119d501:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1

### 0x119de51: mov    r13,QWORD PTR [r14+0x30]; FDE=(18471687, 18473660)
     119de26:	40 84 ff             	test   dil,dil
     119de29:	49 0f 45 ef          	cmovne rbp,r15
     119de2d:	8b 75 0c             	mov    esi,DWORD PTR [rbp+0xc]
     119de30:	41 89 b5 90 01 00 00 	mov    DWORD PTR [r13+0x190],esi
     119de37:	41 c6 85 94 01 00 00 	mov    BYTE PTR [r13+0x194],0x1
     119de3e:	01 
     119de3f:	48 0f 45 ca          	cmovne rcx,rdx
     119de43:	8a 51 04             	mov    dl,BYTE PTR [rcx+0x4]
     119de46:	88 50 04             	mov    BYTE PTR [rax+0x4],dl
     119de49:	8b 09                	mov    ecx,DWORD PTR [rcx]
     119de4b:	89 08                	mov    DWORD PTR [rax],ecx
     119de4d:	89 7c 24 24          	mov    DWORD PTR [rsp+0x24],edi
     119de51:	4d 8b 6e 30          	mov    r13,QWORD PTR [r14+0x30]
     119de55:	49 8b 46 38          	mov    rax,QWORD PTR [r14+0x38]
     119de59:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     119de5e:	49 39 c5             	cmp    r13,rax
     119de61:	0f 84 e7 01 00 00    	je     119e04e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x365464>
     119de67:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     119de6c:	80 78 08 00          	cmp    BYTE PTR [rax+0x8],0x0
     119de70:	49 8b 4d 00          	mov    rcx,QWORD PTR [r13+0x0]
     119de74:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     119de79:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     119de7c:	44 8b 61 0c          	mov    r12d,DWORD PTR [rcx+0xc]
     119de80:	74 39                	je     119debb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3652d1>
     119de82:	31 c0                	xor    eax,eax
     119de84:	80 bb 94 01 00 00 00 	cmp    BYTE PTR [rbx+0x194],0x0
     119de8b:	74 06                	je     119de93 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3652a9>
     119de8d:	8b 83 90 01 00 00    	mov    eax,DWORD PTR [rbx+0x190]
     119de93:	41 39 c4             	cmp    r12d,eax
     119de96:	0f 86 a3 01 00 00    	jbe    119e03f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x365455>
     119de9c:	80 bb 9c 01 00 00 00 	cmp    BYTE PTR [rbx+0x19c],0x0
     119dea3:	74 08                	je     119dead <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3652c3>
     119dea5:	8b 83 98 01 00 00    	mov    eax,DWORD PTR [rbx+0x198]

### 0x119e068: mov    r12,QWORD PTR [r15+0x30]; FDE=(18471687, 18473660)
     119e034:	49 89 ef             	mov    r15,rbp
     119e037:	8b 44 24 10          	mov    eax,DWORD PTR [rsp+0x10]
     119e03b:	41 89 47 28          	mov    DWORD PTR [r15+0x28],eax
     119e03f:	49 83 c5 08          	add    r13,0x8
     119e043:	4c 3b 6c 24 40       	cmp    r13,QWORD PTR [rsp+0x40]
     119e048:	0f 85 19 fe ff ff    	jne    119de67 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36527d>
     119e04e:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     119e053:	48 85 c9             	test   rcx,rcx
     119e056:	0f 84 91 00 00 00    	je     119e0ed <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x365503>
     119e05c:	c6 41 18 00          	mov    BYTE PTR [rcx+0x18],0x0
     119e060:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     119e065:	4c 8b 38             	mov    r15,QWORD PTR [rax]
     119e068:	4d 8b 67 30          	mov    r12,QWORD PTR [r15+0x30]
     119e06c:	4d 8b 6f 38          	mov    r13,QWORD PTR [r15+0x38]
     119e070:	4d 39 ec             	cmp    r12,r13
     119e073:	74 72                	je     119e0e7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3654fd>
     119e075:	31 db                	xor    ebx,ebx
     119e077:	41 80 bf 94 01 00 00 	cmp    BYTE PTR [r15+0x194],0x0
     119e07e:	00 
     119e07f:	74 5b                	je     119e0dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3654f2>
     119e081:	49 8b 2c 24          	mov    rbp,QWORD PTR [r12]
     119e085:	8b 45 0c             	mov    eax,DWORD PTR [rbp+0xc]
     119e088:	41 39 87 90 01 00 00 	cmp    DWORD PTR [r15+0x190],eax
     119e08f:	76 4b                	jbe    119e0dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3654f2>
     119e091:	80 7d 08 00          	cmp    BYTE PTR [rbp+0x8],0x0
     119e095:	75 3c                	jne    119e0d3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3654e9>
     119e097:	80 bd 8c 00 00 00 00 	cmp    BYTE PTR [rbp+0x8c],0x0
     119e09e:	74 2c                	je     119e0cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3654e2>
     119e0a0:	4c 8d b5 88 00 00 00 	lea    r14,[rbp+0x88]
     119e0a7:	4c 89 f7             	mov    rdi,r14
     119e0aa:	e8 b3 7a 9a ff       	call   b45b62 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92b02>
     119e0af:	31 c0                	xor    eax,eax
     119e0b1:	41 80 bf 94 01 00 00 	cmp    BYTE PTR [r15+0x194],0x0

### 0x119e2f7: mov    r14,QWORD PTR [rbx+0x30]; FDE=(18473660, 18473885)
     119e2d3:	74 7a                	je     119e34f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x365765>
     119e2d5:	49 89 f7             	mov    r15,rsi
     119e2d8:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
     119e2db:	48 85 ff             	test   rdi,rdi
     119e2de:	74 0e                	je     119e2ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x365704>
     119e2e0:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0
     119e2e4:	75 08                	jne    119e2ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x365704>
     119e2e6:	4c 89 fe             	mov    rsi,r15
     119e2e9:	e8 ce ff ff ff       	call   119e2bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3656d2>
     119e2ee:	49 83 c6 08          	add    r14,0x8
     119e2f2:	4d 39 e6             	cmp    r14,r12
     119e2f5:	75 e1                	jne    119e2d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3656ee>
     119e2f7:	4c 8b 73 30          	mov    r14,QWORD PTR [rbx+0x30]
     119e2fb:	4c 8b 6b 38          	mov    r13,QWORD PTR [rbx+0x38]
     119e2ff:	4d 39 ee             	cmp    r14,r13
     119e302:	74 48                	je     119e34c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x365762>
     119e304:	49 8b 36             	mov    rsi,QWORD PTR [r14]
     119e307:	4c 89 ff             	mov    rdi,r15
     119e30a:	e8 8f 00 00 00       	call   119e39e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3657b4>
     119e30f:	84 c0                	test   al,al
     119e311:	75 06                	jne    119e319 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36572f>
     119e313:	49 83 c6 08          	add    r14,0x8
     119e317:	eb e6                	jmp    119e2ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x365715>
     119e319:	4d 39 ee             	cmp    r14,r13
     119e31c:	74 2e                	je     119e34c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x365762>
     119e31e:	4d 8d 66 08          	lea    r12,[r14+0x8]
     119e322:	4d 39 ec             	cmp    r12,r13
     119e325:	74 28                	je     119e34f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x365765>
     119e327:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
     119e32b:	4c 89 ff             	mov    rdi,r15
     119e32e:	e8 6b 00 00 00       	call   119e39e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3657b4>
     119e333:	84 c0                	test   al,al
     119e335:	75 0f                	jne    119e346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36575c>

### 0x11a07aa: lea    rbp,[r14+0x30]; FDE=(18483030, 18484271)
     11a077a:	00 
     11a077b:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
     11a077f:	48 8d 5c 24 18       	lea    rbx,[rsp+0x18]
     11a0784:	48 89 df             	mov    rdi,rbx
     11a0787:	e8 60 fd 4d 00       	call   16804ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34658>
     11a078c:	4c 8b 3b             	mov    r15,QWORD PTR [rbx]
     11a078f:	4d 85 ff             	test   r15,r15
     11a0792:	0f 84 bd 01 00 00    	je     11a0955 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x367d6b>
     11a0798:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
     11a079c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     11a07a1:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]
     11a07a5:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     11a07aa:	49 8d 6e 30          	lea    rbp,[r14+0x30]
     11a07ae:	4c 89 74 24 60       	mov    QWORD PTR [rsp+0x60],r14
     11a07b3:	48 8d 05 aa bc 8d ff 	lea    rax,[rip+0xffffffffff8dbcaa]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     11a07ba:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
     11a07bf:	48 8d 05 6a 04 00 00 	lea    rax,[rip+0x46a]        # 11a0c30 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x368046>
     11a07c6:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
     11a07cb:	45 8a 6e 52          	mov    r13b,BYTE PTR [r14+0x52]
     11a07cf:	4d 8d 66 53          	lea    r12,[r14+0x53]
     11a07d3:	45 84 ed             	test   r13b,r13b
     11a07d6:	0f 84 99 01 00 00    	je     11a0975 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x367d8b>
     11a07dc:	bf c0 01 00 00       	mov    edi,0x1c0
     11a07e1:	e8 1a d7 64 00       	call   17edf00 <_Znwm@plt>
     11a07e6:	48 89 c3             	mov    rbx,rax
     11a07e9:	0f b7 45 20          	movzx  eax,WORD PTR [rbp+0x20]
     11a07ed:	66 89 84 24 c0 00 00 	mov    WORD PTR [rsp+0xc0],ax
     11a07f4:	00 
     11a07f5:	0f 10 45 00          	movups xmm0,XMMWORD PTR [rbp+0x0]
     11a07f9:	0f 10 4d 10          	movups xmm1,XMMWORD PTR [rbp+0x10]
     11a07fd:	0f 29 8c 24 b0 00 00 	movaps XMMWORD PTR [rsp+0xb0],xmm1
     11a0804:	00 
     11a0805:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0

### 0x11a0c83: mov    QWORD PTR [rbx+0x30],rax; FDE=(18484272, 18484622)
     11a0c4e:	41 80 7e 50 00       	cmp    BYTE PTR [r14+0x50],0x0
     11a0c53:	0f 84 89 00 00 00    	je     11a0ce2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3680f8>
     11a0c59:	48 8d 5c 24 60       	lea    rbx,[rsp+0x60]
     11a0c5e:	0f 57 c0             	xorps  xmm0,xmm0
     11a0c61:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     11a0c64:	48 8d 05 2d 2b 6f 00 	lea    rax,[rip+0x6f2b2d]        # 1893798 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x6d8>
     11a0c6b:	48 89 43 f8          	mov    QWORD PTR [rbx-0x8],rax
     11a0c6f:	0f 10 46 08          	movups xmm0,XMMWORD PTR [rsi+0x8]
     11a0c73:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
     11a0c77:	0f 10 46 20          	movups xmm0,XMMWORD PTR [rsi+0x20]
     11a0c7b:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
     11a0c7f:	48 8b 46 30          	mov    rax,QWORD PTR [rsi+0x30]
     11a0c83:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     11a0c87:	0f 10 46 40          	movups xmm0,XMMWORD PTR [rsi+0x40]
     11a0c8b:	0f 11 43 38          	movups XMMWORD PTR [rbx+0x38],xmm0
     11a0c8f:	0f 10 46 58          	movups xmm0,XMMWORD PTR [rsi+0x58]
     11a0c93:	0f 11 43 48          	movups XMMWORD PTR [rbx+0x48],xmm0
     11a0c97:	48 8b 46 68          	mov    rax,QWORD PTR [rsi+0x68]
     11a0c9b:	48 89 43 58          	mov    QWORD PTR [rbx+0x58],rax
     11a0c9f:	c7 43 08 ff 03 00 00 	mov    DWORD PTR [rbx+0x8],0x3ff
     11a0ca6:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     11a0caa:	31 c0                	xor    eax,eax
     11a0cac:	48 89 e2             	mov    rdx,rsp
     11a0caf:	88 02                	mov    BYTE PTR [rdx],al
     11a0cb1:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
     11a0cb4:	48 8d 4c 24 20       	lea    rcx,[rsp+0x20]
     11a0cb9:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
     11a0cbe:	48 8d 74 24 58       	lea    rsi,[rsp+0x58]
     11a0cc3:	e8 5a 41 48 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
     11a0cc8:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     11a0ccd:	e8 98 92 8d ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     11a0cd2:	48 89 e7             	mov    rdi,rsp
     11a0cd5:	e8 56 60 90 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>

### 0x11a1d7b: mov    bpl,BYTE PTR [r14+0x30]; FDE=(18484818, 18489554)
     11a1d49:	00 
     11a1d4a:	e8 9d 49 91 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
     11a1d4f:	4c 8b 83 68 01 00 00 	mov    r8,QWORD PTR [rbx+0x168]
     11a1d56:	48 8d 35 1f 02 2b ff 	lea    rsi,[rip+0xffffffffff2b021f]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     11a1d5d:	48 8d 0d 55 91 1e ff 	lea    rcx,[rip+0xffffffffff1e9155]        # 38aeb9 <_ZTSSt12bad_any_cast@@Base-0x530f>
     11a1d64:	6a 04                	push   0x4
     11a1d66:	5f                   	pop    rdi
     11a1d67:	ba 16 01 00 00       	mov    edx,0x116
     11a1d6c:	31 c0                	xor    eax,eax
     11a1d6e:	e8 5f 4b 63 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     11a1d73:	4c 8d b4 24 a0 02 00 	lea    r14,[rsp+0x2a0]
     11a1d7a:	00 
     11a1d7b:	41 8a 6e 30          	mov    bpl,BYTE PTR [r14+0x30]
     11a1d7f:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     11a1d84:	e8 07 c1 64 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11a1d89:	48 8d bc 24 d0 03 00 	lea    rdi,[rsp+0x3d0]
     11a1d90:	00 
     11a1d91:	e8 62 1b 53 00       	call   16d38f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x87a64>
     11a1d96:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     11a1d9d:	00 
     11a1d9e:	e8 5b 19 53 00       	call   16d36fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8786a>
     11a1da3:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     11a1da8:	e8 e3 c0 64 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11a1dad:	4c 89 f7             	mov    rdi,r14
     11a1db0:	e8 97 7e 48 00       	call   1629c4c <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dba>
     11a1db5:	48 8d bc 24 28 05 00 	lea    rdi,[rsp+0x528]
     11a1dbc:	00 
     11a1dbd:	e8 32 15 4e 00       	call   16832f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37460>
     11a1dc2:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
     11a1dc9:	00 
     11a1dca:	e8 25 15 4e 00       	call   16832f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37460>
     11a1dcf:	40 84 ed             	test   bpl,bpl
     11a1dd2:	74 30                	je     11a1e04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36921a>

### 0x11a3636: mov    rsi,QWORD PTR [rbx+0x30]; FDE=(18493836, 18495534)
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

### 0x11a38d2: mov    QWORD PTR [r14+0x30],rbp; FDE=(18495554, 18496463)
     11a38a0:	e9 51 02 00 00       	jmp    11a3af6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36af0c>
     11a38a5:	89 c3                	mov    ebx,eax
     11a38a7:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
     11a38ac:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     11a38b1:	e8 2a 2e a3 ff       	call   bd66e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x123680>
     11a38b6:	4c 8d b4 24 10 02 00 	lea    r14,[rsp+0x210]
     11a38bd:	00 
     11a38be:	41 88 5e f0          	mov    BYTE PTR [r14-0x10],bl
     11a38c2:	4c 89 f7             	mov    rdi,r14
     11a38c5:	4c 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],r15
     11a38ca:	4c 89 fe             	mov    rsi,r15
     11a38cd:	e8 be 69 8d ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     11a38d2:	49 89 6e 30          	mov    QWORD PTR [r14+0x30],rbp
     11a38d6:	bf d0 00 00 00       	mov    edi,0xd0
     11a38db:	e8 20 a6 64 00       	call   17edf00 <_Znwm@plt>
     11a38e0:	49 89 c7             	mov    r15,rax
     11a38e3:	ba d0 00 00 00       	mov    edx,0xd0
     11a38e8:	48 89 c7             	mov    rdi,rax
     11a38eb:	31 f6                	xor    esi,esi
     11a38ed:	e8 9e b2 64 00       	call   17eeb90 <memset@plt>
     11a38f2:	4c 89 ff             	mov    rdi,r15
     11a38f5:	e8 ac 92 b3 ff       	call   cdcba6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x229b46>
     11a38fa:	4c 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],r15
     11a38ff:	48 8b 9d c0 07 00 00 	mov    rbx,QWORD PTR [rbp+0x7c0]
     11a3906:	4c 8d b4 24 a8 01 00 	lea    r14,[rsp+0x1a8]
     11a390d:	00 
     11a390e:	4c 89 f7             	mov    rdi,r14
     11a3911:	4c 89 ee             	mov    rsi,r13
     11a3914:	e8 4d 65 52 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
     11a3919:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
     11a391e:	4c 89 e7             	mov    rdi,r12
     11a3921:	4c 89 f6             	mov    rsi,r14
     11a3924:	e8 0b 6b 52 00       	call   16ca434 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e5a0>

### 0x11a3da1: mov    rdi,QWORD PTR [rbx+0x30]; FDE=(18496778, 18496957)
     11a3d77:	4c 89 fa             	mov    rdx,r15
     11a3d7a:	ff 50 38             	call   QWORD PTR [rax+0x38]
     11a3d7d:	48 83 c5 08          	add    rbp,0x8
     11a3d81:	49 39 ed             	cmp    r13,rbp
     11a3d84:	75 bb                	jne    11a3d41 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36b157>
     11a3d86:	4c 89 f7             	mov    rdi,r14
     11a3d89:	e8 8e f1 ff ff       	call   11a2f1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a332>
     11a3d8e:	31 ed                	xor    ebp,ebp
     11a3d90:	e8 1b a2 64 00       	call   17edfb0 <_ZNSt6__ndk115system_categoryEv@plt>
     11a3d95:	eb 0a                	jmp    11a3da1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36b1b7>
     11a3d97:	bd 90 01 00 00       	mov    ebp,0x190
     11a3d9c:	e8 4f b0 64 00       	call   17eedf0 <_ZNSt6__ndk116generic_categoryEv@plt>
     11a3da1:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
     11a3da5:	89 ee                	mov    esi,ebp
     11a3da7:	48 89 c2             	mov    rdx,rax
     11a3daa:	48 83 c4 08          	add    rsp,0x8
     11a3dae:	5b                   	pop    rbx
     11a3daf:	41 5c                	pop    r12
     11a3db1:	41 5d                	pop    r13
     11a3db3:	41 5e                	pop    r14
     11a3db5:	41 5f                	pop    r15
     11a3db7:	5d                   	pop    rbp
     11a3db8:	e9 e7 27 99 ff       	jmp    b365a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x83544>
     11a3dbd:	cc                   	int3
     11a3dbe:	83 ff 01             	cmp    edi,0x1
     11a3dc1:	74 1e                	je     11a3de1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36b1f7>
     11a3dc3:	85 ff                	test   edi,edi
     11a3dc5:	75 20                	jne    11a3de7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36b1fd>
     11a3dc7:	53                   	push   rbx
     11a3dc8:	48 8b 1e             	mov    rbx,QWORD PTR [rsi]
     11a3dcb:	48 85 db             	test   rbx,rbx
     11a3dce:	74 08                	je     11a3dd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36b1ee>
     11a3dd0:	48 89 df             	mov    rdi,rbx

### 0x11a606f: mov    QWORD PTR [rbx+0x30],r14; FDE=(18505598, 18505914)
     11a603e:	4c 89 f7             	mov    rdi,r14
     11a6041:	4c 89 fe             	mov    rsi,r15
     11a6044:	e8 57 7e 64 00       	call   17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>
     11a6049:	eb 0c                	jmp    11a6057 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36d46d>
     11a604b:	0f 57 c0             	xorps  xmm0,xmm0
     11a604e:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     11a6052:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     11a6057:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
     11a605c:	44 8b 7c 24 04       	mov    r15d,DWORD PTR [rsp+0x4]
     11a6061:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     11a6066:	e8 c3 f2 51 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     11a606b:	4c 89 6b 28          	mov    QWORD PTR [rbx+0x28],r13
     11a606f:	4c 89 73 30          	mov    QWORD PTR [rbx+0x30],r14
     11a6073:	44 88 63 38          	mov    BYTE PTR [rbx+0x38],r12b
     11a6077:	89 6b 3c             	mov    DWORD PTR [rbx+0x3c],ebp
     11a607a:	44 89 7b 40          	mov    DWORD PTR [rbx+0x40],r15d
     11a607e:	31 ff                	xor    edi,edi
     11a6080:	e8 01 84 8f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11a6085:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11a608c:	00 00 
     11a608e:	48 3b 84 24 90 00 00 	cmp    rax,QWORD PTR [rsp+0x90]
     11a6095:	00 
     11a6096:	75 15                	jne    11a60ad <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36d4c3>
     11a6098:	48 89 d8             	mov    rax,rbx
     11a609b:	48 81 c4 98 00 00 00 	add    rsp,0x98
     11a60a2:	5b                   	pop    rbx
     11a60a3:	41 5c                	pop    r12
     11a60a5:	41 5d                	pop    r13
     11a60a7:	41 5e                	pop    r14
     11a60a9:	41 5f                	pop    r15
     11a60ab:	5d                   	pop    rbp
     11a60ac:	c3                   	ret
     11a60ad:	e8 fe 99 64 00       	call   17efab0 <__stack_chk_fail@plt>

### 0x11aa809: mov    rdi,QWORD PTR [rbx+0x30]; FDE=(18524156, 18524227)
     11aa7db:	48 8d 05 16 50 29 ff 	lea    rax,[rip+0xffffffffff295016]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     11aa7e2:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
     11aa7e6:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax
     11aa7ea:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
     11aa7ee:	48 89 47 30          	mov    QWORD PTR [rdi+0x30],rax
     11aa7f2:	48 89 47 38          	mov    QWORD PTR [rdi+0x38],rax
     11aa7f6:	48 83 67 40 00       	and    QWORD PTR [rdi+0x40],0x0
     11aa7fb:	c3                   	ret
     11aa7fc:	53                   	push   rbx
     11aa7fd:	48 89 fb             	mov    rbx,rdi
     11aa800:	48 83 c7 08          	add    rdi,0x8
     11aa804:	e8 ff 01 90 ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
     11aa809:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
     11aa80d:	e8 96 b0 5b 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     11aa812:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
     11aa816:	e8 8d b0 5b 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     11aa81b:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
     11aa81f:	e8 84 b0 5b 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     11aa824:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
     11aa828:	e8 7b b0 5b 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     11aa82d:	48 8b 7b 50          	mov    rdi,QWORD PTR [rbx+0x50]
     11aa831:	e8 72 b0 5b 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     11aa836:	48 83 c3 18          	add    rbx,0x18
     11aa83a:	48 89 df             	mov    rdi,rbx
     11aa83d:	5b                   	pop    rbx
     11aa83e:	e9 7d 43 91 ff       	jmp    abebc0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbb60>
     11aa843:	cc                   	int3
     11aa844:	53                   	push   rbx
     11aa845:	48 89 fb             	mov    rbx,rdi
     11aa848:	e8 af ff ff ff       	call   11aa7fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x371c12>
     11aa84d:	48 89 df             	mov    rdi,rbx
     11aa850:	5b                   	pop    rbx
     11aa851:	e9 ca 36 64 00       	jmp    17edf20 <_ZdlPv@plt>

### 0x11aae7f: mov    r14,QWORD PTR [rbx+0x30]; FDE=(18525730, 18525933)
     11aae53:	74 09                	je     11aae5e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372274>
     11aae55:	49 8d 7e 08          	lea    rdi,[r14+0x8]
     11aae59:	e8 aa fb 8f ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
     11aae5e:	4c 89 f7             	mov    rdi,r14
     11aae61:	e8 ba 30 64 00       	call   17edf20 <_ZdlPv@plt>
     11aae66:	4c 8b 73 28          	mov    r14,QWORD PTR [rbx+0x28]
     11aae6a:	4d 85 f6             	test   r14,r14
     11aae6d:	74 08                	je     11aae77 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37228d>
     11aae6f:	4c 89 f7             	mov    rdi,r14
     11aae72:	e8 6d 3b 91 ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
     11aae77:	4c 89 f7             	mov    rdi,r14
     11aae7a:	e8 a1 30 64 00       	call   17edf20 <_ZdlPv@plt>
     11aae7f:	4c 8b 73 30          	mov    r14,QWORD PTR [rbx+0x30]
     11aae83:	4d 85 f6             	test   r14,r14
     11aae86:	74 08                	je     11aae90 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3722a6>
     11aae88:	4c 89 f7             	mov    rdi,r14
     11aae8b:	e8 54 3b 91 ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
     11aae90:	4c 89 f7             	mov    rdi,r14
     11aae93:	e8 88 30 64 00       	call   17edf20 <_ZdlPv@plt>
     11aae98:	4c 8b 73 38          	mov    r14,QWORD PTR [rbx+0x38]
     11aae9c:	4d 85 f6             	test   r14,r14
     11aae9f:	74 09                	je     11aaeaa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3722c0>
     11aaea1:	49 8d 7e 08          	lea    rdi,[r14+0x8]
     11aaea5:	e8 5e fb 8f ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
     11aaeaa:	4c 89 f7             	mov    rdi,r14
     11aaead:	e8 6e 30 64 00       	call   17edf20 <_ZdlPv@plt>
     11aaeb2:	4c 8b 73 40          	mov    r14,QWORD PTR [rbx+0x40]
     11aaeb6:	4d 85 f6             	test   r14,r14
     11aaeb9:	74 09                	je     11aaec4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3722da>
     11aaebb:	49 8d 7e 08          	lea    rdi,[r14+0x8]
     11aaebf:	e8 44 fb 8f ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
     11aaec4:	4c 89 f7             	mov    rdi,r14
     11aaec7:	e8 54 30 64 00       	call   17edf20 <_ZdlPv@plt>

### 0x11ab377: mov    rdi,QWORD PTR [rbx+0x30]; FDE=(18527082, 18527117)
     11ab349:	0f 57 c0             	xorps  xmm0,xmm0
     11ab34c:	48 83 66 20 00       	and    QWORD PTR [rsi+0x20],0x0
     11ab351:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
     11ab355:	48 89 56 28          	mov    QWORD PTR [rsi+0x28],rdx
     11ab359:	48 8d 0d 98 44 29 ff 	lea    rcx,[rip+0xffffffffff294498]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     11ab360:	48 89 4e 30          	mov    QWORD PTR [rsi+0x30],rcx
     11ab364:	48 83 66 38 00       	and    QWORD PTR [rsi+0x38],0x0
     11ab369:	c3                   	ret
     11ab36a:	53                   	push   rbx
     11ab36b:	48 89 fb             	mov    rbx,rdi
     11ab36e:	48 83 c7 08          	add    rdi,0x8
     11ab372:	e8 91 f6 8f ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
     11ab377:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
     11ab37b:	e8 28 a5 5b 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     11ab380:	48 83 c3 18          	add    rbx,0x18
     11ab384:	48 89 df             	mov    rdi,rbx
     11ab387:	5b                   	pop    rbx
     11ab388:	e9 d3 7a fc ff       	jmp    1172e60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33a276>
     11ab38d:	cc                   	int3
     11ab38e:	53                   	push   rbx
     11ab38f:	48 89 fb             	mov    rbx,rdi
     11ab392:	e8 d3 ff ff ff       	call   11ab36a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372780>
     11ab397:	48 89 df             	mov    rdi,rbx
     11ab39a:	5b                   	pop    rbx
     11ab39b:	e9 80 2b 64 00       	jmp    17edf20 <_ZdlPv@plt>
     11ab3a0:	0f 18 0d 99 6a 76 00 	prefetcht0 BYTE PTR [rip+0x766a99]        # 1911e40 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x59250>
     11ab3a7:	48 8d 05 92 6a 76 00 	lea    rax,[rip+0x766a92]        # 1911e40 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x59250>
     11ab3ae:	48 8b 0d 93 6a 76 00 	mov    rcx,QWORD PTR [rip+0x766a93]        # 1911e48 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x59258>
     11ab3b5:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
     11ab3b8:	c3                   	ret
     11ab3b9:	cc                   	int3
     11ab3ba:	48 89 f0             	mov    rax,rsi
     11ab3bd:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx

### 0x11ab4e0: mov    rdi,QWORD PTR [rbx+0x30]; FDE=(18527440, 18527570)
     11ab4bd:	48 89 47 50          	mov    QWORD PTR [rdi+0x50],rax
     11ab4c1:	48 89 47 58          	mov    QWORD PTR [rdi+0x58],rax
     11ab4c5:	0f 11 47 60          	movups XMMWORD PTR [rdi+0x60],xmm0
     11ab4c9:	48 83 67 6e 00       	and    QWORD PTR [rdi+0x6e],0x0
     11ab4ce:	c3                   	ret
     11ab4cf:	cc                   	int3
     11ab4d0:	41 56                	push   r14
     11ab4d2:	53                   	push   rbx
     11ab4d3:	50                   	push   rax
     11ab4d4:	48 89 fb             	mov    rbx,rdi
     11ab4d7:	48 83 c7 08          	add    rdi,0x8
     11ab4db:	e8 28 f5 8f ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
     11ab4e0:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
     11ab4e4:	e8 bf a3 5b 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     11ab4e9:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
     11ab4ed:	e8 b6 a3 5b 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     11ab4f2:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
     11ab4f6:	e8 ad a3 5b 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     11ab4fb:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
     11ab4ff:	e8 a4 a3 5b 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     11ab504:	48 8b 7b 50          	mov    rdi,QWORD PTR [rbx+0x50]
     11ab508:	e8 9b a3 5b 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     11ab50d:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
     11ab511:	e8 92 a3 5b 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     11ab516:	4c 8b 73 60          	mov    r14,QWORD PTR [rbx+0x60]
     11ab51a:	4d 85 f6             	test   r14,r14
     11ab51d:	74 08                	je     11ab527 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37293d>
     11ab51f:	4c 89 f7             	mov    rdi,r14
     11ab522:	e8 bd 34 91 ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
     11ab527:	4c 89 f7             	mov    rdi,r14
     11ab52a:	e8 f1 29 64 00       	call   17edf20 <_ZdlPv@plt>
     11ab52f:	48 83 7b 18 00       	cmp    QWORD PTR [rbx+0x18],0x0
     11ab534:	74 0c                	je     11ab542 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372958>

### 0x11ab7a9: mov    rdi,QWORD PTR [rbx+0x30]; FDE=(18528156, 18528216)
     11ab779:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     11ab77d:	48 8d 0d 7c e5 6a 00 	lea    rcx,[rip+0x6ae57c]        # 1859d00 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x163e8>
     11ab784:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     11ab787:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     11ab78c:	48 8d 0d 65 40 29 ff 	lea    rcx,[rip+0xffffffffff294065]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     11ab793:	48 89 4e 18          	mov    QWORD PTR [rsi+0x18],rcx
     11ab797:	83 66 20 00          	and    DWORD PTR [rsi+0x20],0x0
     11ab79b:	c3                   	ret
     11ab79c:	53                   	push   rbx
     11ab79d:	48 89 fb             	mov    rbx,rdi
     11ab7a0:	48 83 c7 08          	add    rdi,0x8
     11ab7a4:	e8 5f f2 8f ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
     11ab7a9:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
     11ab7ad:	e8 f6 a0 5b 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     11ab7b2:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
     11ab7b6:	e8 ed a0 5b 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     11ab7bb:	48 83 7b 18 00       	cmp    QWORD PTR [rbx+0x18],0x0
     11ab7c0:	74 0c                	je     11ab7ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372be4>
     11ab7c2:	48 83 c3 18          	add    rbx,0x18
     11ab7c6:	48 89 df             	mov    rdi,rbx
     11ab7c9:	e8 b6 6c 5d 00       	call   1782484 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1365f0>
     11ab7ce:	5b                   	pop    rbx
     11ab7cf:	c3                   	ret
     11ab7d0:	48 89 c7             	mov    rdi,rax
     11ab7d3:	e8 cd e2 8c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     11ab7d8:	53                   	push   rbx
     11ab7d9:	48 89 fb             	mov    rbx,rdi
     11ab7dc:	e8 bb ff ff ff       	call   11ab79c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372bb2>
     11ab7e1:	48 89 df             	mov    rdi,rbx
     11ab7e4:	5b                   	pop    rbx
     11ab7e5:	e9 36 27 64 00       	jmp    17edf20 <_ZdlPv@plt>
     11ab7ea:	0f 18 0d 47 78 76 00 	prefetcht0 BYTE PTR [rip+0x767847]        # 1913038 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5a448>
     11ab7f1:	48 8d 05 40 78 76 00 	lea    rax,[rip+0x767840]        # 1913038 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5a448>

### 0x11ab9aa: lea    rsi,[r15+0x30]; FDE=(18528494, 18529236)
     11ab974:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     11ab97b:	00 
     11ab97c:	48 8d b4 24 98 00 00 	lea    rsi,[rsp+0x98]
     11ab983:	00 
     11ab984:	48 8d 54 24 68       	lea    rdx,[rsp+0x68]
     11ab989:	e8 02 a8 90 ff       	call   ab6190 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3130>
     11ab98e:	48 8d 15 12 f8 1a ff 	lea    rdx,[rip+0xffffffffff1af812]        # 35b1a7 <_ZTSSt12bad_any_cast@@Base-0x35021>
     11ab995:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
     11ab99c:	00 
     11ab99d:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
     11ab9a4:	00 
     11ab9a5:	e8 93 fa 8e ff       	call   a9b43d <JNI_OnUnload@@Base+0x22d0a>
     11ab9aa:	49 8d 77 30          	lea    rsi,[r15+0x30]
     11ab9ae:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     11ab9b3:	e8 42 b2 00 00       	call   11b6bfa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37e010>
     11ab9b8:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
     11ab9bf:	00 
     11ab9c0:	48 8d b4 24 c8 00 00 	lea    rsi,[rsp+0xc8]
     11ab9c7:	00 
     11ab9c8:	48 8d 54 24 50       	lea    rdx,[rsp+0x50]
     11ab9cd:	e8 be a7 90 ff       	call   ab6190 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3130>
     11ab9d2:	48 8d 15 ce f7 1a ff 	lea    rdx,[rip+0xffffffffff1af7ce]        # 35b1a7 <_ZTSSt12bad_any_cast@@Base-0x35021>
     11ab9d9:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
     11ab9e0:	00 
     11ab9e1:	48 8d b4 24 e0 00 00 	lea    rsi,[rsp+0xe0]
     11ab9e8:	00 
     11ab9e9:	e8 4f fa 8e ff       	call   a9b43d <JNI_OnUnload@@Base+0x22d0a>
     11ab9ee:	49 83 c7 48          	add    r15,0x48
     11ab9f2:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     11ab9f7:	4c 89 fe             	mov    rsi,r15
     11ab9fa:	e8 fb b1 00 00       	call   11b6bfa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37e010>
     11ab9ff:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     11aba04:	48 8d b4 24 f8 00 00 	lea    rsi,[rsp+0xf8]

### 0x11ac2c9: lea    rdi,[rbx+0x30]; FDE=(18531004, 18531044)
     11ac2a9:	c6 43 60 01          	mov    BYTE PTR [rbx+0x60],0x1
     11ac2ad:	5b                   	pop    rbx
     11ac2ae:	c3                   	ret
     11ac2af:	cc                   	int3
     11ac2b0:	80 7f 60 00          	cmp    BYTE PTR [rdi+0x60],0x0
     11ac2b4:	0f 85 02 00 00 00    	jne    11ac2bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3736d2>
     11ac2ba:	c3                   	ret
     11ac2bb:	cc                   	int3
     11ac2bc:	53                   	push   rbx
     11ac2bd:	48 89 fb             	mov    rbx,rdi
     11ac2c0:	48 83 c7 48          	add    rdi,0x48
     11ac2c4:	e8 5f f4 8c ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     11ac2c9:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     11ac2cd:	e8 56 f4 8c ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     11ac2d2:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     11ac2d6:	e8 4d f4 8c ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     11ac2db:	48 89 df             	mov    rdi,rbx
     11ac2de:	5b                   	pop    rbx
     11ac2df:	e9 44 f4 8c ff       	jmp    a7b728 <JNI_OnUnload@@Base+0x2ff5>
     11ac2e4:	0f 57 c0             	xorps  xmm0,xmm0
     11ac2e7:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     11ac2ea:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     11ac2ef:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11ac2f2:	48 89 07             	mov    QWORD PTR [rdi],rax
     11ac2f5:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
     11ac2f9:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
     11ac2fd:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
     11ac301:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
     11ac305:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     11ac30a:	0f 11 06             	movups XMMWORD PTR [rsi],xmm0
     11ac30d:	48 83 67 28 00       	and    QWORD PTR [rdi+0x28],0x0
     11ac312:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0
     11ac316:	48 8b 46 18          	mov    rax,QWORD PTR [rsi+0x18]

### 0x11ac3ef: movups XMMWORD PTR [rbx+0x30],xmm0; FDE=(18531228, 18531371)
     11ac3b9:	48 89 c3             	mov    rbx,rax
     11ac3bc:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     11ac3c0:	48 8d 05 21 4e 6c 00 	lea    rax,[rip+0x6c4e21]        # 18711e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d8d0>
     11ac3c7:	48 89 03             	mov    QWORD PTR [rbx],rax
     11ac3ca:	41 0f 10 87 58 01 00 	movups xmm0,XMMWORD PTR [r15+0x158]
     11ac3d1:	00 
     11ac3d2:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
     11ac3d6:	48 8d 05 67 18 93 ff 	lea    rax,[rip+0xffffffffff931867]        # addc44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abe4>
     11ac3dd:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
     11ac3e1:	48 8d 05 44 00 00 00 	lea    rax,[rip+0x44]        # 11ac42c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x373842>
     11ac3e8:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
     11ac3ec:	0f 57 c0             	xorps  xmm0,xmm0
     11ac3ef:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
     11ac3f3:	48 89 df             	mov    rdi,rbx
     11ac3f6:	4c 89 e6             	mov    rsi,r12
     11ac3f9:	e8 46 28 92 ff       	call   acec44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bbe4>
     11ac3fe:	49 89 1e             	mov    QWORD PTR [r14],rbx
     11ac401:	4c 89 f0             	mov    rax,r14
     11ac404:	48 83 c4 08          	add    rsp,0x8
     11ac408:	5b                   	pop    rbx
     11ac409:	41 5c                	pop    r12
     11ac40b:	41 5e                	pop    r14
     11ac40d:	41 5f                	pop    r15
     11ac40f:	c3                   	ret
     11ac410:	49 89 c6             	mov    r14,rax
     11ac413:	48 89 df             	mov    rdi,rbx
     11ac416:	e8 69 76 91 ff       	call   ac3a84 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10a24>
     11ac41b:	48 89 df             	mov    rdi,rbx
     11ac41e:	e8 fd 1a 64 00       	call   17edf20 <_ZdlPv@plt>
     11ac423:	4c 89 f7             	mov    rdi,r14
     11ac426:	e8 a5 38 8c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     11ac42b:	cc                   	int3
     11ac42c:	41 56                	push   r14

### 0x11ad02e: mov    QWORD PTR [r15+0x30],rbp; FDE=(18533940, 18535019)
     11acff8:	41 0f 10 45 00       	movups xmm0,XMMWORD PTR [r13+0x0]
     11acffd:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
     11ad001:	41 0f 11 4d 00       	movups XMMWORD PTR [r13+0x0],xmm1
     11ad006:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
     11ad00b:	49 8b 45 18          	mov    rax,QWORD PTR [r13+0x18]
     11ad00f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     11ad014:	49 8b 45 20          	mov    rax,QWORD PTR [r13+0x20]
     11ad018:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     11ad01d:	41 0f 11 4d 18       	movups XMMWORD PTR [r13+0x18],xmm1
     11ad022:	49 8b 5d 28          	mov    rbx,QWORD PTR [r13+0x28]
     11ad026:	49 8b 6d 30          	mov    rbp,QWORD PTR [r13+0x30]
     11ad02a:	49 89 5f 28          	mov    QWORD PTR [r15+0x28],rbx
     11ad02e:	49 89 6f 30          	mov    QWORD PTR [r15+0x30],rbp
     11ad032:	48 85 ed             	test   rbp,rbp
     11ad035:	74 05                	je     11ad03c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x374452>
     11ad037:	f0 48 ff 45 10       	lock inc QWORD PTR [rbp+0x10]
     11ad03c:	4c 8d a4 24 30 01 00 	lea    r12,[rsp+0x130]
     11ad043:	00 
     11ad044:	4c 89 e7             	mov    rdi,r12
     11ad047:	e8 90 15 00 00       	call   11ae5dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3759f2>
     11ad04c:	48 8d 05 c5 4b 2a ff 	lea    rax,[rip+0xffffffffff2a4bc5]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
     11ad053:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     11ad058:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     11ad05d:	48 83 64 24 58 00    	and    QWORD PTR [rsp+0x58],0x0
     11ad063:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     11ad068:	49 89 04 24          	mov    QWORD PTR [r12],rax
     11ad06c:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     11ad071:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
     11ad076:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     11ad07b:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
     11ad080:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     11ad087:	00 00 
     11ad089:	0f 57 c9             	xorps  xmm1,xmm1

### 0x11adcc9: mov    rax,QWORD PTR [rbx+0x30]; FDE=(18537636, 18537699)
     11adca4:	41 56                	push   r14
     11adca6:	53                   	push   rbx
     11adca7:	50                   	push   rax
     11adca8:	48 89 f3             	mov    rbx,rsi
     11adcab:	49 89 fe             	mov    r14,rdi
     11adcae:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11adcb1:	48 89 07             	mov    QWORD PTR [rdi],rax
     11adcb4:	48 83 c7 08          	add    rdi,0x8
     11adcb8:	48 83 c6 08          	add    rsi,0x8
     11adcbc:	e8 9b ff ff ff       	call   11adc5c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375072>
     11adcc1:	48 8b 43 28          	mov    rax,QWORD PTR [rbx+0x28]
     11adcc5:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
     11adcc9:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
     11adccd:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
     11adcd1:	48 85 c0             	test   rax,rax
     11adcd4:	74 05                	je     11adcdb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3750f1>
     11adcd6:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     11adcdb:	48 83 c4 08          	add    rsp,0x8
     11adcdf:	5b                   	pop    rbx
     11adce0:	41 5e                	pop    r14
     11adce2:	c3                   	ret
     11adce3:	cc                   	int3
     11adce4:	83 ff 01             	cmp    edi,0x1
     11adce7:	74 1e                	je     11add07 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37511d>
     11adce9:	85 ff                	test   edi,edi
     11adceb:	75 20                	jne    11add0d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375123>
     11adced:	53                   	push   rbx
     11adcee:	48 8b 1e             	mov    rbx,QWORD PTR [rsi]
     11adcf1:	48 85 db             	test   rbx,rbx
     11adcf4:	74 08                	je     11adcfe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375114>
     11adcf6:	48 89 df             	mov    rdi,rbx
     11adcf9:	e8 18 00 00 00       	call   11add16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37512c>
     11adcfe:	48 89 df             	mov    rdi,rbx

### 0x11adccd: mov    QWORD PTR [r14+0x30],rax; FDE=(18537636, 18537699)
     11adca6:	53                   	push   rbx
     11adca7:	50                   	push   rax
     11adca8:	48 89 f3             	mov    rbx,rsi
     11adcab:	49 89 fe             	mov    r14,rdi
     11adcae:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11adcb1:	48 89 07             	mov    QWORD PTR [rdi],rax
     11adcb4:	48 83 c7 08          	add    rdi,0x8
     11adcb8:	48 83 c6 08          	add    rsi,0x8
     11adcbc:	e8 9b ff ff ff       	call   11adc5c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375072>
     11adcc1:	48 8b 43 28          	mov    rax,QWORD PTR [rbx+0x28]
     11adcc5:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
     11adcc9:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
     11adccd:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
     11adcd1:	48 85 c0             	test   rax,rax
     11adcd4:	74 05                	je     11adcdb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3750f1>
     11adcd6:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     11adcdb:	48 83 c4 08          	add    rsp,0x8
     11adcdf:	5b                   	pop    rbx
     11adce0:	41 5e                	pop    r14
     11adce2:	c3                   	ret
     11adce3:	cc                   	int3
     11adce4:	83 ff 01             	cmp    edi,0x1
     11adce7:	74 1e                	je     11add07 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37511d>
     11adce9:	85 ff                	test   edi,edi
     11adceb:	75 20                	jne    11add0d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375123>
     11adced:	53                   	push   rbx
     11adcee:	48 8b 1e             	mov    rbx,QWORD PTR [rsi]
     11adcf1:	48 85 db             	test   rbx,rbx
     11adcf4:	74 08                	je     11adcfe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375114>
     11adcf6:	48 89 df             	mov    rdi,rbx
     11adcf9:	e8 18 00 00 00       	call   11add16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37512c>
     11adcfe:	48 89 df             	mov    rdi,rbx
     11add01:	5b                   	pop    rbx

### 0x11adf79: mov    rax,QWORD PTR [rbx+0x30]; FDE=(18538326, 18538395)
     11adf56:	41 56                	push   r14
     11adf58:	53                   	push   rbx
     11adf59:	50                   	push   rax
     11adf5a:	48 89 f3             	mov    rbx,rsi
     11adf5d:	49 89 fe             	mov    r14,rdi
     11adf60:	8b 46 08             	mov    eax,DWORD PTR [rsi+0x8]
     11adf63:	89 47 08             	mov    DWORD PTR [rdi+0x8],eax
     11adf66:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11adf69:	48 89 07             	mov    QWORD PTR [rdi],rax
     11adf6c:	48 83 c7 10          	add    rdi,0x10
     11adf70:	48 83 c6 10          	add    rsi,0x10
     11adf74:	e8 95 ff ff ff       	call   11adf0e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375324>
     11adf79:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
     11adf7d:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
     11adf81:	48 8b 43 38          	mov    rax,QWORD PTR [rbx+0x38]
     11adf85:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
     11adf89:	48 85 c0             	test   rax,rax
     11adf8c:	74 05                	je     11adf93 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3753a9>
     11adf8e:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     11adf93:	48 83 c4 08          	add    rsp,0x8
     11adf97:	5b                   	pop    rbx
     11adf98:	41 5e                	pop    r14
     11adf9a:	c3                   	ret
     11adf9b:	cc                   	int3
     11adf9c:	83 ff 01             	cmp    edi,0x1
     11adf9f:	74 1e                	je     11adfbf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3753d5>
     11adfa1:	85 ff                	test   edi,edi
     11adfa3:	75 20                	jne    11adfc5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3753db>
     11adfa5:	53                   	push   rbx
     11adfa6:	48 8b 1e             	mov    rbx,QWORD PTR [rsi]
     11adfa9:	48 85 db             	test   rbx,rbx
     11adfac:	74 08                	je     11adfb6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3753cc>
     11adfae:	48 89 df             	mov    rdi,rbx

### 0x11adf7d: mov    QWORD PTR [r14+0x30],rax; FDE=(18538326, 18538395)
     11adf58:	53                   	push   rbx
     11adf59:	50                   	push   rax
     11adf5a:	48 89 f3             	mov    rbx,rsi
     11adf5d:	49 89 fe             	mov    r14,rdi
     11adf60:	8b 46 08             	mov    eax,DWORD PTR [rsi+0x8]
     11adf63:	89 47 08             	mov    DWORD PTR [rdi+0x8],eax
     11adf66:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11adf69:	48 89 07             	mov    QWORD PTR [rdi],rax
     11adf6c:	48 83 c7 10          	add    rdi,0x10
     11adf70:	48 83 c6 10          	add    rsi,0x10
     11adf74:	e8 95 ff ff ff       	call   11adf0e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375324>
     11adf79:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
     11adf7d:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
     11adf81:	48 8b 43 38          	mov    rax,QWORD PTR [rbx+0x38]
     11adf85:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
     11adf89:	48 85 c0             	test   rax,rax
     11adf8c:	74 05                	je     11adf93 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3753a9>
     11adf8e:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     11adf93:	48 83 c4 08          	add    rsp,0x8
     11adf97:	5b                   	pop    rbx
     11adf98:	41 5e                	pop    r14
     11adf9a:	c3                   	ret
     11adf9b:	cc                   	int3
     11adf9c:	83 ff 01             	cmp    edi,0x1
     11adf9f:	74 1e                	je     11adfbf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3753d5>
     11adfa1:	85 ff                	test   edi,edi
     11adfa3:	75 20                	jne    11adfc5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3753db>
     11adfa5:	53                   	push   rbx
     11adfa6:	48 8b 1e             	mov    rbx,QWORD PTR [rsi]
     11adfa9:	48 85 db             	test   rbx,rbx
     11adfac:	74 08                	je     11adfb6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3753cc>
     11adfae:	48 89 df             	mov    rdi,rbx
     11adfb1:	e8 18 00 00 00       	call   11adfce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3753e4>

### 0x11ae06c: lea    rsi,[rbx+0x30]; FDE=(18538516, 18538734)
     11ae041:	74 10                	je     11ae053 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375469>
     11ae043:	8b 53 08             	mov    edx,DWORD PTR [rbx+0x8]
     11ae046:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11ae049:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     11ae04e:	ff 50 18             	call   QWORD PTR [rax+0x18]
     11ae051:	eb 19                	jmp    11ae06c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375482>
     11ae053:	31 c0                	xor    eax,eax
     11ae055:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     11ae05a:	88 47 d8             	mov    BYTE PTR [rdi-0x28],al
     11ae05d:	88 47 f8             	mov    BYTE PTR [rdi-0x8],al
     11ae060:	48 8d 35 52 a4 17 ff 	lea    rsi,[rip+0xffffffffff17a452]        # 3284b9 <_ZTSSt12bad_any_cast@@Base-0x67d0f>
     11ae067:	e8 12 ba 8c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     11ae06c:	48 8d 73 30          	lea    rsi,[rbx+0x30]
     11ae070:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     11ae075:	4c 89 f7             	mov    rdi,r14
     11ae078:	e8 b3 d2 8f ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
     11ae07d:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
     11ae080:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11ae084:	e8 fd 03 8f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11ae089:	4d 85 ff             	test   r15,r15
     11ae08c:	74 29                	je     11ae0b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3754cd>
     11ae08e:	48 83 c3 10          	add    rbx,0x10
     11ae092:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     11ae097:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
     11ae09c:	4c 89 f7             	mov    rdi,r14
     11ae09f:	e8 4a 00 00 00       	call   11ae0ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375504>
     11ae0a4:	48 89 df             	mov    rdi,rbx
     11ae0a7:	4c 89 f6             	mov    rsi,r14
     11ae0aa:	e8 b5 fd ff ff       	call   11ade64 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37527a>
     11ae0af:	4c 89 f7             	mov    rdi,r14
     11ae0b2:	e8 39 fe ff ff       	call   11adef0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375306>
     11ae0b7:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     11ae0bc:	e8 2f fe ff ff       	call   11adef0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375306>

### 0x11ae522: lea    rdi,[rbx+0x30]; FDE=(18539726, 18539919)
     11ae4f8:	48 8b 5b 08          	mov    rbx,QWORD PTR [rbx+0x8]
     11ae4fc:	8a 43 60             	mov    al,BYTE PTR [rbx+0x60]
     11ae4ff:	3a 44 24 60          	cmp    al,BYTE PTR [rsp+0x60]
     11ae503:	75 3e                	jne    11ae543 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375959>
     11ae505:	84 c0                	test   al,al
     11ae507:	74 5b                	je     11ae564 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37597a>
     11ae509:	48 89 e6             	mov    rsi,rsp
     11ae50c:	48 89 df             	mov    rdi,rbx
     11ae50f:	e8 3e 9a 95 ff       	call   b07f52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x54ef2>
     11ae514:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     11ae518:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     11ae51d:	e8 30 9a 95 ff       	call   b07f52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x54ef2>
     11ae522:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     11ae526:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     11ae52b:	e8 22 9a 95 ff       	call   b07f52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x54ef2>
     11ae530:	48 83 c3 48          	add    rbx,0x48
     11ae534:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
     11ae539:	48 89 df             	mov    rdi,rbx
     11ae53c:	e8 11 9a 95 ff       	call   b07f52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x54ef2>
     11ae541:	eb 21                	jmp    11ae564 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37597a>
     11ae543:	84 c0                	test   al,al
     11ae545:	74 0e                	je     11ae555 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37596b>
     11ae547:	48 89 df             	mov    rdi,rbx
     11ae54a:	e8 6d dd ff ff       	call   11ac2bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3736d2>
     11ae54f:	c6 43 60 00          	mov    BYTE PTR [rbx+0x60],0x0
     11ae553:	eb 0f                	jmp    11ae564 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37597a>
     11ae555:	48 89 e6             	mov    rsi,rsp
     11ae558:	48 89 df             	mov    rdi,rbx
     11ae55b:	e8 84 dd ff ff       	call   11ac2e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3736fa>
     11ae560:	c6 43 60 01          	mov    BYTE PTR [rbx+0x60],0x1
     11ae564:	48 89 e7             	mov    rdi,rsp
     11ae567:	e8 44 dd ff ff       	call   11ac2b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3736c6>
     11ae56c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### 0x11afbb4: mov    rcx,QWORD PTR [r15+0x30]; FDE=(18544350, 18555122)
     11afb8a:	00 
     11afb8b:	4c 39 e0             	cmp    rax,r12
     11afb8e:	0f 84 c7 00 00 00    	je     11afc5b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x377071>
     11afb94:	49 89 c7             	mov    r15,rax
     11afb97:	48 8d bc 24 50 06 00 	lea    rdi,[rsp+0x650]
     11afb9e:	00 
     11afb9f:	6a 05                	push   0x5
     11afba1:	5e                   	pop    rsi
     11afba2:	e8 39 c2 ac ff       	call   c7bde0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c8d80>
     11afba7:	4c 39 e0             	cmp    rax,r12
     11afbaa:	0f 84 ab 00 00 00    	je     11afc5b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x377071>
     11afbb0:	4d 8b 47 28          	mov    r8,QWORD PTR [r15+0x28]
     11afbb4:	49 8b 4f 30          	mov    rcx,QWORD PTR [r15+0x30]
     11afbb8:	4c 29 c1             	sub    rcx,r8
     11afbbb:	48 83 f9 20          	cmp    rcx,0x20
     11afbbf:	0f 85 96 00 00 00    	jne    11afc5b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x377071>
     11afbc5:	49 89 c4             	mov    r12,rax
     11afbc8:	48 8b 94 24 40 04 00 	mov    rdx,QWORD PTR [rsp+0x440]
     11afbcf:	00 
     11afbd0:	48 8b 8c 24 48 04 00 	mov    rcx,QWORD PTR [rsp+0x448]
     11afbd7:	00 
     11afbd8:	48 29 d1             	sub    rcx,rdx
     11afbdb:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     11afbdf:	48 8d bc 24 30 06 00 	lea    rdi,[rsp+0x630]
     11afbe6:	00 
     11afbe7:	6a 20                	push   0x20
     11afbe9:	41 59                	pop    r9
     11afbeb:	48 89 ee             	mov    rsi,rbp
     11afbee:	ff 50 50             	call   QWORD PTR [rax+0x50]
     11afbf1:	80 bc 24 48 06 00 00 	cmp    BYTE PTR [rsp+0x648],0x0
     11afbf8:	00 
     11afbf9:	0f 84 8c 0e 00 00    	je     11b0a8b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x377ea1>
     11afbff:	48 8d 35 5e 16 1c ff 	lea    rsi,[rip+0xffffffffff1c165e]        # 371264 <_ZTSSt12bad_any_cast@@Base-0x1ef64>

### 0x11b0d16: mov    rcx,QWORD PTR [r15+0x30]; FDE=(18544350, 18555122)
     11b0ce5:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     11b0cea:	48 8b 50 30          	mov    rdx,QWORD PTR [rax+0x30]
     11b0cee:	48 8b 48 38          	mov    rcx,QWORD PTR [rax+0x38]
     11b0cf2:	e8 3a a5 99 ff       	call   b4b231 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x981d1>
     11b0cf7:	84 c0                	test   al,al
     11b0cf9:	0f 84 36 02 00 00    	je     11b0f35 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37834b>
     11b0cff:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
     11b0d06:	00 
     11b0d07:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     11b0d0c:	0f 57 c0             	xorps  xmm0,xmm0
     11b0d0f:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
     11b0d12:	49 8b 57 28          	mov    rdx,QWORD PTR [r15+0x28]
     11b0d16:	49 8b 4f 30          	mov    rcx,QWORD PTR [r15+0x30]
     11b0d1a:	31 f6                	xor    esi,esi
     11b0d1c:	e8 ab 3c 9d ff       	call   b849cc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd196c>
     11b0d21:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
     11b0d28:	00 
     11b0d29:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
     11b0d2d:	49 8b 54 24 28       	mov    rdx,QWORD PTR [r12+0x28]
     11b0d32:	49 8b 4c 24 30       	mov    rcx,QWORD PTR [r12+0x30]
     11b0d37:	e8 90 3c 9d ff       	call   b849cc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd196c>
     11b0d3c:	4c 8b 6c 24 20       	mov    r13,QWORD PTR [rsp+0x20]
     11b0d41:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
     11b0d48:	00 
     11b0d49:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
     11b0d4d:	48 8b 94 24 58 04 00 	mov    rdx,QWORD PTR [rsp+0x458]
     11b0d54:	00 
     11b0d55:	48 8b 8c 24 60 04 00 	mov    rcx,QWORD PTR [rsp+0x460]
     11b0d5c:	00 
     11b0d5d:	e8 6a 3c 9d ff       	call   b849cc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd196c>
     11b0d62:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
     11b0d66:	49 8b 55 08          	mov    rdx,QWORD PTR [r13+0x8]
     11b0d6a:	48 29 f2             	sub    rdx,rsi

### 0x11b0e25: mov    rcx,QWORD PTR [r15+0x30]; FDE=(18544350, 18555122)
     11b0df5:	31 f6                	xor    esi,esi
     11b0df7:	e8 d0 3b 9d ff       	call   b849cc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd196c>
     11b0dfc:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     11b0e03:	00 
     11b0e04:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
     11b0e08:	49 8b 55 48          	mov    rdx,QWORD PTR [r13+0x48]
     11b0e0c:	49 8b 4d 50          	mov    rcx,QWORD PTR [r13+0x50]
     11b0e10:	e8 b7 3b 9d ff       	call   b849cc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd196c>
     11b0e15:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     11b0e1c:	00 
     11b0e1d:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
     11b0e21:	49 8b 57 28          	mov    rdx,QWORD PTR [r15+0x28]
     11b0e25:	49 8b 4f 30          	mov    rcx,QWORD PTR [r15+0x30]
     11b0e29:	e8 9e 3b 9d ff       	call   b849cc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd196c>
     11b0e2e:	49 8b 55 18          	mov    rdx,QWORD PTR [r13+0x18]
     11b0e32:	49 8b 4d 20          	mov    rcx,QWORD PTR [r13+0x20]
     11b0e36:	48 29 d1             	sub    rcx,rdx
     11b0e39:	4c 8b 84 24 30 02 00 	mov    r8,QWORD PTR [rsp+0x230]
     11b0e40:	00 
     11b0e41:	4c 8b 8c 24 38 02 00 	mov    r9,QWORD PTR [rsp+0x238]
     11b0e48:	00 
     11b0e49:	4d 29 c1             	sub    r9,r8
     11b0e4c:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     11b0e50:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
     11b0e57:	00 
     11b0e58:	48 89 ee             	mov    rsi,rbp
     11b0e5b:	ff 50 38             	call   QWORD PTR [rax+0x38]
     11b0e5e:	80 bc 24 c8 05 00 00 	cmp    BYTE PTR [rsp+0x5c8],0x0
     11b0e65:	00 
     11b0e66:	0f 84 79 01 00 00    	je     11b0fe5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3783fb>
     11b0e6c:	49 8d 55 48          	lea    rdx,[r13+0x48]
     11b0e70:	48 8d bc 24 40 07 00 	lea    rdi,[rsp+0x740]
     11b0e77:	00 

### 0x11b6ef6: lea    rdi,[rbx+0x30]; FDE=(18575046, 18575121)
     11b6ec5:	c3                   	ret
     11b6ec6:	53                   	push   rbx
     11b6ec7:	48 89 fb             	mov    rbx,rdi
     11b6eca:	e8 c3 ff ff ff       	call   11b6e92 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37e2a8>
     11b6ecf:	48 8d bb 90 00 00 00 	lea    rdi,[rbx+0x90]
     11b6ed6:	e8 4d 48 8c ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     11b6edb:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
     11b6edf:	e8 44 48 8c ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     11b6ee4:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
     11b6ee8:	e8 3b 48 8c ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     11b6eed:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
     11b6ef1:	e8 32 48 8c ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     11b6ef6:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     11b6efa:	e8 29 48 8c ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     11b6eff:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     11b6f03:	e8 20 48 8c ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     11b6f08:	48 89 df             	mov    rdi,rbx
     11b6f0b:	5b                   	pop    rbx
     11b6f0c:	e9 17 48 8c ff       	jmp    a7b728 <JNI_OnUnload@@Base+0x2ff5>
     11b6f11:	48 81 ec d8 00 00 00 	sub    rsp,0xd8
     11b6f18:	49 89 ca             	mov    r10,rcx
     11b6f1b:	48 89 f1             	mov    rcx,rsi
     11b6f1e:	48 89 e6             	mov    rsi,rsp
     11b6f21:	4c 89 46 20          	mov    QWORD PTR [rsi+0x20],r8
     11b6f25:	4c 89 4e 28          	mov    QWORD PTR [rsi+0x28],r9
     11b6f29:	84 c0                	test   al,al
     11b6f2b:	74 31                	je     11b6f5e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37e374>
     11b6f2d:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     11b6f32:	0f 29 4c 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm1
     11b6f37:	0f 29 54 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm2
     11b6f3c:	0f 29 5c 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm3
     11b6f41:	0f 29 64 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm4
     11b6f46:	0f 29 ac 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm5

### 0x11b8332: mov    rbx,QWORD PTR [r15+0x30]; FDE=(18576038, 18587535)
     11b8306:	4c 89 4a 28          	mov    QWORD PTR [rdx+0x28],r9
     11b830a:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
     11b830f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11b8312:	48 8d bc 24 f0 06 00 	lea    rdi,[rsp+0x6f0]
     11b8319:	00 
     11b831a:	6a 03                	push   0x3
     11b831c:	59                   	pop    rcx
     11b831d:	ff 50 60             	call   QWORD PTR [rax+0x60]
     11b8320:	80 bc 24 08 07 00 00 	cmp    BYTE PTR [rsp+0x708],0x0
     11b8327:	00 
     11b8328:	0f 84 82 01 00 00    	je     11b84b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37f8c6>
     11b832e:	4d 8b 67 28          	mov    r12,QWORD PTR [r15+0x28]
     11b8332:	49 8b 5f 30          	mov    rbx,QWORD PTR [r15+0x30]
     11b8336:	4c 8b bc 24 f0 06 00 	mov    r15,QWORD PTR [rsp+0x6f0]
     11b833d:	00 
     11b833e:	4c 8b b4 24 f8 06 00 	mov    r14,QWORD PTR [rsp+0x6f8]
     11b8345:	00 
     11b8346:	4c 89 e7             	mov    rdi,r12
     11b8349:	48 89 de             	mov    rsi,rbx
     11b834c:	4c 89 fa             	mov    rdx,r15
     11b834f:	4c 89 f1             	mov    rcx,r14
     11b8352:	e8 da 2e 99 ff       	call   b4b231 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x981d1>
     11b8357:	84 c0                	test   al,al
     11b8359:	0f 84 8b 01 00 00    	je     11b84ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37f900>
     11b835f:	48 8d 35 90 6d 17 ff 	lea    rsi,[rip+0xffffffffff176d90]        # 32f0f6 <_ZTSSt12bad_any_cast@@Base-0x610d2>
     11b8366:	48 8d bc 24 98 03 00 	lea    rdi,[rsp+0x398]
     11b836d:	00 
     11b836e:	e8 0b 17 8c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     11b8373:	48 8d 35 0e b0 1a ff 	lea    rsi,[rip+0xffffffffff1ab00e]        # 363388 <_ZTSSt12bad_any_cast@@Base-0x2ce40>
     11b837a:	48 8d bc 24 80 03 00 	lea    rdi,[rsp+0x380]
     11b8381:	00 
     11b8382:	e8 f7 16 8c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     11b8387:	4c 8b 74 24 20       	mov    r14,QWORD PTR [rsp+0x20]

### 0x11b9525: mov    r9,QWORD PTR [r14+0x30]; FDE=(18576038, 18587535)
     11b94f4:	e8 d3 b4 9c ff       	call   b849cc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd196c>
     11b94f9:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
     11b94fe:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     11b9501:	48 8b 75 28          	mov    rsi,QWORD PTR [rbp+0x28]
     11b9505:	48 8b 55 30          	mov    rdx,QWORD PTR [rbp+0x30]
     11b9509:	48 29 f2             	sub    rdx,rsi
     11b950c:	48 8b 4c 24 78       	mov    rcx,QWORD PTR [rsp+0x78]
     11b9511:	4c 8b 84 24 80 00 00 	mov    r8,QWORD PTR [rsp+0x80]
     11b9518:	00 
     11b9519:	49 29 c8             	sub    r8,rcx
     11b951c:	49 8b 46 28          	mov    rax,QWORD PTR [r14+0x28]
     11b9520:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     11b9525:	4d 8b 4e 30          	mov    r9,QWORD PTR [r14+0x30]
     11b9529:	49 29 c1             	sub    r9,rax
     11b952c:	4c 89 4c 24 70       	mov    QWORD PTR [rsp+0x70],r9
     11b9531:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11b9534:	48 8b 40 40          	mov    rax,QWORD PTR [rax+0x40]
     11b9538:	0f 10 44 24 68       	movups xmm0,XMMWORD PTR [rsp+0x68]
     11b953d:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
     11b9541:	ff d0                	call   rax
     11b9543:	66 3d ff 00          	cmp    ax,0xff
     11b9547:	77 1e                	ja     11b9567 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38097d>
     11b9549:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     11b954e:	c6 00 02             	mov    BYTE PTR [rax],0x2
     11b9551:	e9 df 00 00 00       	jmp    11b9635 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x380a4b>
     11b9556:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     11b955b:	c6 00 02             	mov    BYTE PTR [rax],0x2
     11b955e:	c6 40 60 00          	mov    BYTE PTR [rax+0x60],0x0
     11b9562:	e9 dc 00 00 00       	jmp    11b9643 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x380a59>
     11b9567:	84 c0                	test   al,al
     11b9569:	0f 84 92 00 00 00    	je     11b9601 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x380a17>
     11b956f:	48 83 c5 28          	add    rbp,0x28
     11b9573:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]

### 0x11ba027: mov    rdx,QWORD PTR [r14+0x30]; FDE=(18587535, 18588110)
     11ba000:	41 8a 6e 18          	mov    bpl,BYTE PTR [r14+0x18]
     11ba004:	40 84 ed             	test   bpl,bpl
     11ba007:	74 55                	je     11ba05e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x381474>
     11ba009:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     11ba00e:	6a 07                	push   0x7
     11ba010:	5e                   	pop    rsi
     11ba011:	e8 ca 1d ac ff       	call   c7bde0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c8d80>
     11ba016:	49 89 c6             	mov    r14,rax
     11ba019:	48 8d 44 24 10       	lea    rax,[rsp+0x10]
     11ba01e:	49 39 c6             	cmp    r14,rax
     11ba021:	74 75                	je     11ba098 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3814ae>
     11ba023:	49 8b 4e 28          	mov    rcx,QWORD PTR [r14+0x28]
     11ba027:	49 8b 56 30          	mov    rdx,QWORD PTR [r14+0x30]
     11ba02b:	48 29 ca             	sub    rdx,rcx
     11ba02e:	b0 11                	mov    al,0x11
     11ba030:	48 83 fa 01          	cmp    rdx,0x1
     11ba034:	75 2a                	jne    11ba060 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x381476>
     11ba036:	0f b6 01             	movzx  eax,BYTE PTR [rcx]
     11ba039:	89 c1                	mov    ecx,eax
     11ba03b:	c1 e1 03             	shl    ecx,0x3
     11ba03e:	48 ba 11 11 0b 0c 0d 	movabs rdx,0x100f0e0d0c0b1111
     11ba045:	0e 0f 10 
     11ba048:	48 d3 ea             	shr    rdx,cl
     11ba04b:	3c 08                	cmp    al,0x8
     11ba04d:	6a 11                	push   0x11
     11ba04f:	58                   	pop    rax
     11ba050:	0f 42 c2             	cmovb  eax,edx
     11ba053:	eb 0b                	jmp    11ba060 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x381476>
     11ba055:	c6 03 06             	mov    BYTE PTR [rbx],0x6
     11ba058:	c6 43 18 00          	mov    BYTE PTR [rbx+0x18],0x0
     11ba05c:	eb 17                	jmp    11ba075 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38148b>
     11ba05e:	b0 06                	mov    al,0x6
     11ba060:	88 03                	mov    BYTE PTR [rbx],al

### 0x11ba266: mov    DWORD PTR [r14+0x30],0x2; FDE=(18588127, 18590331)
     11ba230:	48 8d b4 24 c8 00 00 	lea    rsi,[rsp+0xc8]
     11ba237:	00 
     11ba238:	48 83 26 00          	and    QWORD PTR [rsi],0x0
     11ba23c:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11ba240:	48 8b 05 89 7b 6f 00 	mov    rax,QWORD PTR [rip+0x6f7b89]        # 18b1dd0 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3tcpEEEE2idE@@Base-0x1375ec>
     11ba247:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     11ba24b:	48 8b 15 76 7b 6f 00 	mov    rdx,QWORD PTR [rip+0x6f7b76]        # 18b1dc8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6f734c>
     11ba252:	48 89 e9             	mov    rcx,rbp
     11ba255:	e8 f8 89 8f ff       	call   ab2c52 <_ZN4asio6detail16service_registry6createINS0_13epoll_reactorENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x188>
     11ba25a:	48 8d 8c 24 c0 02 00 	lea    rcx,[rsp+0x2c0]
     11ba261:	00 
     11ba262:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     11ba266:	41 c7 46 30 02 00 00 	mov    DWORD PTR [r14+0x30],0x2
     11ba26d:	00 
     11ba26e:	4d 8d 6e 38          	lea    r13,[r14+0x38]
     11ba272:	48 8b 05 77 7a 6f 00 	mov    rax,QWORD PTR [rip+0x6f7a77]        # 18b1cf0 <_ZZN4asio9execution6detail17any_executor_base16target_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS2_10target_fnsEbPNS6_9enable_ifIXntsr7is_sameIT_vEE5valueEvE4typeEE16fns_with_execute@@Base+0x1ec78>
     11ba279:	49 89 46 60          	mov    QWORD PTR [r14+0x60],rax
     11ba27d:	48 8b 05 84 7a 6f 00 	mov    rax,QWORD PTR [rip+0x6f7a84]        # 18b1d08 <_ZZN4asio9execution6detail17any_executor_base16object_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS2_10object_fnsEPNS6_9enable_ifIXaantsr7is_sameIT_vEE5valuentsr7is_sameISE_NS1_22shared_target_executorEEE5valueEvE4typeEE3fns@@Base+0x1ec70>
     11ba284:	49 89 46 50          	mov    QWORD PTR [r14+0x50],rax
     11ba288:	49 89 6e 38          	mov    QWORD PTR [r14+0x38],rbp
     11ba28c:	4d 89 6e 58          	mov    QWORD PTR [r14+0x58],r13
     11ba290:	48 8b 05 79 7a 6f 00 	mov    rax,QWORD PTR [rip+0x6f7a79]        # 18b1d10 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1ec50>
     11ba297:	49 89 46 68          	mov    QWORD PTR [r14+0x68],rax
     11ba29b:	41 83 4e 20 ff       	or     DWORD PTR [r14+0x20],0xffffffff
     11ba2a0:	41 c6 46 24 00       	mov    BYTE PTR [r14+0x24],0x0
     11ba2a5:	49 83 66 28 00       	and    QWORD PTR [r14+0x28],0x0
     11ba2aa:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
     11ba2ad:	41 0f 11 46 70       	movups XMMWORD PTR [r14+0x70],xmm0
     11ba2b2:	48 8b 41 10          	mov    rax,QWORD PTR [rcx+0x10]
     11ba2b6:	49 89 86 80 00 00 00 	mov    QWORD PTR [r14+0x80],rax
     11ba2bd:	4c 89 74 24 30       	mov    QWORD PTR [rsp+0x30],r14
     11ba2c2:	48 8d 5c 24 50       	lea    rbx,[rsp+0x50]
     11ba2c7:	83 23 00             	and    DWORD PTR [rbx],0x0

### 0x11ba4bb: movups xmm0,XMMWORD PTR [r15+0x30]; FDE=(18588127, 18590331)
     11ba486:	e8 d8 95 b7 ff       	call   d33a63 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae9>
     11ba48b:	48 89 c5             	mov    rbp,rax
     11ba48e:	49 8d 5e 24          	lea    rbx,[r14+0x24]
     11ba492:	48 89 84 24 48 02 00 	mov    QWORD PTR [rsp+0x248],rax
     11ba499:	00 
     11ba49a:	41 8b 04 24          	mov    eax,DWORD PTR [r12]
     11ba49e:	48 83 65 00 00       	and    QWORD PTR [rbp+0x0],0x0
     11ba4a3:	48 8d 0d aa 08 00 00 	lea    rcx,[rip+0x8aa]        # 11bad54 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d8>
     11ba4aa:	48 89 4d 08          	mov    QWORD PTR [rbp+0x8],rcx
     11ba4ae:	83 65 10 00          	and    DWORD PTR [rbp+0x10],0x0
     11ba4b2:	48 8d 4d 18          	lea    rcx,[rbp+0x18]
     11ba4b6:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx
     11ba4bb:	41 0f 10 47 30       	movups xmm0,XMMWORD PTR [r15+0x30]
     11ba4c0:	0f 11 45 18          	movups XMMWORD PTR [rbp+0x18],xmm0
     11ba4c4:	0f 57 c0             	xorps  xmm0,xmm0
     11ba4c7:	0f 11 45 28          	movups XMMWORD PTR [rbp+0x28],xmm0
     11ba4cb:	48 8d 0d 3a 0a 00 00 	lea    rcx,[rip+0xa3a]        # 11baf0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x490>
     11ba4d2:	48 89 4d 38          	mov    QWORD PTR [rbp+0x38],rcx
     11ba4d6:	89 45 40             	mov    DWORD PTR [rbp+0x40],eax
     11ba4d9:	0f 10 44 24 38       	movups xmm0,XMMWORD PTR [rsp+0x38]
     11ba4de:	0f 11 45 48          	movups XMMWORD PTR [rbp+0x48],xmm0
     11ba4e2:	48 89 ef             	mov    rdi,rbp
     11ba4e5:	48 83 c7 58          	add    rdi,0x58
     11ba4e9:	4c 89 ee             	mov    rsi,r13
     11ba4ec:	e8 99 a4 b7 ff       	call   d3498a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a10>
     11ba4f1:	48 89 ac 24 50 02 00 	mov    QWORD PTR [rsp+0x250],rbp
     11ba4f8:	00 
     11ba4f9:	49 8b 47 28          	mov    rax,QWORD PTR [r15+0x28]
     11ba4fd:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     11ba502:	44 0f b7 ac 24 ac 00 	movzx  r13d,WORD PTR [rsp+0xac]
     11ba509:	00 00 
     11ba50b:	f6 03 03             	test   BYTE PTR [rbx],0x3
     11ba50e:	75 19                	jne    11ba529 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38193f>

### 0x11ba5db: mov    DWORD PTR [r14+0x30],ebx; FDE=(18588127, 18590331)
     11ba5b9:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
     11ba5bd:	48 83 c7 28          	add    rdi,0x28
     11ba5c1:	6a 01                	push   0x1
     11ba5c3:	59                   	pop    rcx
     11ba5c4:	6a 06                	push   0x6
     11ba5c6:	41 58                	pop    r8
     11ba5c8:	4c 8d 4c 24 60       	lea    r9,[rsp+0x60]
     11ba5cd:	4c 89 e6             	mov    rsi,r12
     11ba5d0:	89 da                	mov    edx,ebx
     11ba5d2:	e8 75 b6 b7 ff       	call   d35c4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cd2>
     11ba5d7:	85 c0                	test   eax,eax
     11ba5d9:	75 04                	jne    11ba5df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3819f5>
     11ba5db:	41 89 5e 30          	mov    DWORD PTR [r14+0x30],ebx
     11ba5df:	83 7c 24 60 00       	cmp    DWORD PTR [rsp+0x60],0x0
     11ba5e4:	0f 84 83 fe ff ff    	je     11ba46d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x381883>
     11ba5ea:	0f 10 44 24 38       	movups xmm0,XMMWORD PTR [rsp+0x38]
     11ba5ef:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
     11ba5f4:	0f 10 44 24 60       	movups xmm0,XMMWORD PTR [rsp+0x60]
     11ba5f9:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
     11ba600:	00 
     11ba601:	48 8d 9c 24 60 01 00 	lea    rbx,[rsp+0x160]
     11ba608:	00 
     11ba609:	48 89 df             	mov    rdi,rbx
     11ba60c:	4c 89 ee             	mov    rsi,r13
     11ba60f:	e8 de e3 c7 ff       	call   e389f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x105a78>
     11ba614:	48 83 7b 20 00       	cmp    QWORD PTR [rbx+0x20],0x0
     11ba619:	0f 84 da 02 00 00    	je     11ba8f9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x381d0f>
     11ba61f:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     11ba626:	00 
     11ba627:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
     11ba62b:	48 8b 4f 30          	mov    rcx,QWORD PTR [rdi+0x30]
     11ba62f:	48 8b 59 20          	mov    rbx,QWORD PTR [rcx+0x20]
     11ba633:	ff 50 18             	call   QWORD PTR [rax+0x18]

### 0x11bab1d: movups xmm0,XMMWORD PTR [r14+0x30]; FDE=(18590428, 18590867)
     11baaeb:	48 89 fb             	mov    rbx,rdi
     11baaee:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11baaf5:	00 00 
     11baaf7:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     11baafe:	00 
     11baaff:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
     11bab04:	49 89 77 08          	mov    QWORD PTR [r15+0x8],rsi
     11bab08:	49 89 77 10          	mov    QWORD PTR [r15+0x10],rsi
     11bab0c:	48 83 c6 40          	add    rsi,0x40
     11bab10:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     11bab17:	00 
     11bab18:	e8 5b a3 b7 ff       	call   d34e78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1efe>
     11bab1d:	41 0f 10 46 30       	movups xmm0,XMMWORD PTR [r14+0x30]
     11bab22:	48 89 e0             	mov    rax,rsp
     11bab25:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
     11bab28:	41 0f 10 46 18       	movups xmm0,XMMWORD PTR [r14+0x18]
     11bab2d:	0f 29 40 10          	movaps XMMWORD PTR [rax+0x10],xmm0
     11bab31:	49 89 07             	mov    QWORD PTR [r15],rax
     11bab34:	4c 89 ff             	mov    rdi,r15
     11bab37:	e8 de 06 00 00       	call   11bb21a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79e>
     11bab3c:	48 85 db             	test   rbx,rbx
     11bab3f:	0f 84 c9 00 00 00    	je     11bac0e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x192>
     11bab45:	48 83 bc 24 a0 00 00 	cmp    QWORD PTR [rsp+0xa0],0x0
     11bab4c:	00 00 
     11bab4e:	74 2a                	je     11bab7a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfe>
     11bab50:	48 8b 8c 24 a8 00 00 	mov    rcx,QWORD PTR [rsp+0xa8]
     11bab57:	00 
     11bab58:	48 8b 41 18          	mov    rax,QWORD PTR [rcx+0x18]
     11bab5c:	48 85 c0             	test   rax,rax
     11bab5f:	74 26                	je     11bab87 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10b>
     11bab61:	48 8d 35 50 07 00 00 	lea    rsi,[rip+0x750]        # 11bb2b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83c>
     11bab68:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     11bab6f:	00 

### 0x11bb441: movups XMMWORD PTR [r15+0x30],xmm0; FDE=(18592634, 18593164)
     11bb40f:	5e                   	pop    rsi
     11bb410:	e8 4e 86 b7 ff       	call   d33a63 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae9>
     11bb415:	49 89 c7             	mov    r15,rax
     11bb418:	4c 8d a4 24 b8 00 00 	lea    r12,[rsp+0xb8]
     11bb41f:	00 
     11bb420:	4c 8d ac 24 80 00 00 	lea    r13,[rsp+0x80]
     11bb427:	00 
     11bb428:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     11bb42d:	48 8d 35 94 0d 00 00 	lea    rsi,[rip+0xd94]        # 11bc1c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174c>
     11bb434:	48 89 c7             	mov    rdi,rax
     11bb437:	e8 9e eb c7 ff       	call   e39fda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13f0>
     11bb43c:	0f 10 44 24 18       	movups xmm0,XMMWORD PTR [rsp+0x18]
     11bb441:	41 0f 11 47 30       	movups XMMWORD PTR [r15+0x30],xmm0
     11bb446:	4c 89 ff             	mov    rdi,r15
     11bb449:	48 83 c7 40          	add    rdi,0x40
     11bb44d:	4c 89 e6             	mov    rsi,r12
     11bb450:	e8 35 95 b7 ff       	call   d3498a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a10>
     11bb455:	4c 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],r15
     11bb45a:	41 c6 45 08 01       	mov    BYTE PTR [r13+0x8],0x1
     11bb45f:	48 8b 7d 58          	mov    rdi,QWORD PTR [rbp+0x58]
     11bb463:	48 83 c5 28          	add    rbp,0x28
     11bb467:	48 8d 8c 24 90 00 00 	lea    rcx,[rsp+0x90]
     11bb46e:	00 
     11bb46f:	48 89 ee             	mov    rsi,rbp
     11bb472:	4c 89 ea             	mov    rdx,r13
     11bb475:	4d 89 f8             	mov    r8,r15
     11bb478:	e8 7d eb c7 ff       	call   e39ffa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1410>
     11bb47d:	48 8d 44 24 48       	lea    rax,[rsp+0x48]
     11bb482:	0f 57 c0             	xorps  xmm0,xmm0
     11bb485:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     11bb488:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
     11bb48d:	4c 89 ff             	mov    rdi,r15
     11bb490:	e8 eb 0e 00 00       	call   11bc380 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1904>

### 0x11bb4c1: mov    QWORD PTR [r15+0x30],rax; FDE=(18592634, 18593164)
     11bb48d:	4c 89 ff             	mov    rdi,r15
     11bb490:	e8 eb 0e 00 00       	call   11bc380 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1904>
     11bb495:	49 8d 46 18          	lea    rax,[r14+0x18]
     11bb499:	49 89 07             	mov    QWORD PTR [r15],rax
     11bb49c:	49 89 5f 08          	mov    QWORD PTR [r15+0x8],rbx
     11bb4a0:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     11bb4a5:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     11bb4a9:	49 83 67 18 00       	and    QWORD PTR [r15+0x18],0x0
     11bb4ae:	41 83 67 20 00       	and    DWORD PTR [r15+0x20],0x0
     11bb4b3:	48 8d 44 24 30       	lea    rax,[rsp+0x30]
     11bb4b8:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
     11bb4bc:	48 8d 44 24 78       	lea    rax,[rsp+0x78]
     11bb4c1:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
     11bb4c5:	e8 e6 2a 63 00       	call   17edfb0 <_ZNSt6__ndk115system_categoryEv@plt>
     11bb4ca:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     11bb4cf:	6a 01                	push   0x1
     11bb4d1:	41 58                	pop    r8
     11bb4d3:	31 f6                	xor    esi,esi
     11bb4d5:	48 89 c2             	mov    rdx,rax
     11bb4d8:	31 c9                	xor    ecx,ecx
     11bb4da:	e8 b1 0e 00 00       	call   11bc390 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1914>
     11bb4df:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
     11bb4e3:	e8 98 e1 c7 ff       	call   e39680 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa96>
     11bb4e8:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     11bb4ed:	e8 8c 67 8f ff       	call   ab1c7e <JNI_OnUnload@@Base+0x3954b>
     11bb4f2:	31 db                	xor    ebx,ebx
     11bb4f4:	83 7c 24 30 00       	cmp    DWORD PTR [rsp+0x30],0x0
     11bb4f9:	0f 95 c3             	setne  bl
     11bb4fc:	80 7c 24 2f 00       	cmp    BYTE PTR [rsp+0x2f],0x0
     11bb501:	41 0f 95 c6          	setne  r14b
     11bb505:	6a 09                	push   0x9
     11bb507:	5d                   	pop    rbp
     11bb508:	0f 44 eb             	cmove  ebp,ebx

### 0x11bb6ed: mov    QWORD PTR [rbx+0x30],rax; FDE=(18593164, 18593781)
     11bb6bf:	31 f6                	xor    esi,esi
     11bb6c1:	48 29 ca             	sub    rdx,rcx
     11bb6c4:	48 0f 44 ce          	cmove  rcx,rsi
     11bb6c8:	48 89 03             	mov    QWORD PTR [rbx],rax
     11bb6cb:	48 89 4b 08          	mov    QWORD PTR [rbx+0x8],rcx
     11bb6cf:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx
     11bb6d3:	48 83 63 18 00       	and    QWORD PTR [rbx+0x18],0x0
     11bb6d8:	83 63 20 00          	and    DWORD PTR [rbx+0x20],0x0
     11bb6dc:	48 8d 44 24 20       	lea    rax,[rsp+0x20]
     11bb6e1:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
     11bb6e5:	48 8d 84 24 88 00 00 	lea    rax,[rsp+0x88]
     11bb6ec:	00 
     11bb6ed:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     11bb6f1:	e8 ba 28 63 00       	call   17edfb0 <_ZNSt6__ndk115system_categoryEv@plt>
     11bb6f6:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     11bb6fb:	6a 01                	push   0x1
     11bb6fd:	41 58                	pop    r8
     11bb6ff:	31 f6                	xor    esi,esi
     11bb701:	48 89 c2             	mov    rdx,rax
     11bb704:	31 c9                	xor    ecx,ecx
     11bb706:	e8 bb 02 00 00       	call   11bb9c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf4a>
     11bb70b:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
     11bb70f:	e8 6c df c7 ff       	call   e39680 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa96>
     11bb714:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
     11bb718:	4c 89 ff             	mov    rdi,r15
     11bb71b:	e8 5e 65 8f ff       	call   ab1c7e <JNI_OnUnload@@Base+0x3954b>
     11bb720:	80 7c 24 1f 00       	cmp    BYTE PTR [rsp+0x1f],0x0
     11bb725:	74 05                	je     11bb72c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcb0>
     11bb727:	c6 03 09             	mov    BYTE PTR [rbx],0x9
     11bb72a:	eb 0a                	jmp    11bb736 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcba>
     11bb72c:	83 7c 24 20 00       	cmp    DWORD PTR [rsp+0x20],0x0
     11bb731:	74 4b                	je     11bb77e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd02>
     11bb733:	c6 03 01             	mov    BYTE PTR [rbx],0x1

### 0x11bb83f: movups xmm0,XMMWORD PTR [r14+0x30]; FDE=(18593790, 18594229)
     11bb80d:	48 89 fb             	mov    rbx,rdi
     11bb810:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11bb817:	00 00 
     11bb819:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     11bb820:	00 
     11bb821:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
     11bb826:	49 89 77 08          	mov    QWORD PTR [r15+0x8],rsi
     11bb82a:	49 89 77 10          	mov    QWORD PTR [r15+0x10],rsi
     11bb82e:	48 83 c6 40          	add    rsi,0x40
     11bb832:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     11bb839:	00 
     11bb83a:	e8 39 96 b7 ff       	call   d34e78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1efe>
     11bb83f:	41 0f 10 46 30       	movups xmm0,XMMWORD PTR [r14+0x30]
     11bb844:	48 89 e0             	mov    rax,rsp
     11bb847:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
     11bb84a:	41 0f 10 46 18       	movups xmm0,XMMWORD PTR [r14+0x18]
     11bb84f:	0f 29 40 10          	movaps XMMWORD PTR [rax+0x10],xmm0
     11bb853:	49 89 07             	mov    QWORD PTR [r15],rax
     11bb856:	4c 89 ff             	mov    rdi,r15
     11bb859:	e8 bc f9 ff ff       	call   11bb21a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79e>
     11bb85e:	48 85 db             	test   rbx,rbx
     11bb861:	0f 84 c9 00 00 00    	je     11bb930 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xeb4>
     11bb867:	48 83 bc 24 a0 00 00 	cmp    QWORD PTR [rsp+0xa0],0x0
     11bb86e:	00 00 
     11bb870:	74 2a                	je     11bb89c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe20>
     11bb872:	48 8b 8c 24 a8 00 00 	mov    rcx,QWORD PTR [rsp+0xa8]
     11bb879:	00 
     11bb87a:	48 8b 41 18          	mov    rax,QWORD PTR [rcx+0x18]
     11bb87e:	48 85 c0             	test   rax,rax
     11bb881:	74 26                	je     11bb8a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe2d>
     11bb883:	48 8d 35 8e 08 00 00 	lea    rsi,[rip+0x88e]        # 11bc118 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x169c>
     11bb88a:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     11bb891:	00 

### 0x11bbb8f: mov    rdi,QWORD PTR [rbx+0x30]; FDE=(18594246, 18594793)
     11bbb61:	4c 89 e1             	mov    rcx,r12
     11bbb64:	44 8b 44 24 0c       	mov    r8d,DWORD PTR [rsp+0xc]
     11bbb69:	e8 ce 8e b7 ff       	call   d34a3c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac2>
     11bbb6e:	48 8d 44 24 30       	lea    rax,[rsp+0x30]
     11bbb73:	0f 57 c0             	xorps  xmm0,xmm0
     11bbb76:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     11bbb79:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     11bbb7e:	e8 af 03 00 00       	call   11bbf32 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14b6>
     11bbb83:	eb 13                	jmp    11bbb98 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x111c>
     11bbb85:	48 8b 43 28          	mov    rax,QWORD PTR [rbx+0x28]
     11bbb89:	89 30                	mov    DWORD PTR [rax],esi
     11bbb8b:	48 89 50 08          	mov    QWORD PTR [rax+0x8],rdx
     11bbb8f:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
     11bbb93:	e8 18 f6 ff ff       	call   11bb1b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x734>
     11bbb98:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11bbb9f:	00 00 
     11bbba1:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
     11bbba6:	75 3c                	jne    11bbbe4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1168>
     11bbba8:	48 83 c4 48          	add    rsp,0x48
     11bbbac:	5b                   	pop    rbx
     11bbbad:	41 5c                	pop    r12
     11bbbaf:	41 5d                	pop    r13
     11bbbb1:	41 5e                	pop    r14
     11bbbb3:	41 5f                	pop    r15
     11bbbb5:	5d                   	pop    rbp
     11bbbb6:	c3                   	ret
     11bbbb7:	48 89 c7             	mov    rdi,rax
     11bbbba:	e8 e6 de 8b ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     11bbbbf:	48 89 c3             	mov    rbx,rax
     11bbbc2:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     11bbbc7:	e8 66 03 00 00       	call   11bbf32 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14b6>
     11bbbcc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11bbbd3:	00 00 

### 0x11bbc69: mov    rax,QWORD PTR [r14+0x30]; FDE=(18594794, 18595375)
     11bbc36:	48 89 01             	mov    QWORD PTR [rcx],rax
     11bbc39:	41 0f 10 46 68       	movups xmm0,XMMWORD PTR [r14+0x68]
     11bbc3e:	0f 11 41 08          	movups XMMWORD PTR [rcx+0x8],xmm0
     11bbc42:	49 8b 46 78          	mov    rax,QWORD PTR [r14+0x78]
     11bbc46:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
     11bbc4a:	41 8b 86 80 00 00 00 	mov    eax,DWORD PTR [r14+0x80]
     11bbc51:	89 41 20             	mov    DWORD PTR [rcx+0x20],eax
     11bbc54:	41 0f 10 86 88 00 00 	movups xmm0,XMMWORD PTR [r14+0x88]
     11bbc5b:	00 
     11bbc5c:	0f 11 41 28          	movups XMMWORD PTR [rcx+0x28],xmm0
     11bbc60:	41 0f 10 46 18       	movups xmm0,XMMWORD PTR [r14+0x18]
     11bbc65:	0f 11 41 38          	movups XMMWORD PTR [rcx+0x38],xmm0
     11bbc69:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
     11bbc6d:	48 89 41 48          	mov    QWORD PTR [rcx+0x48],rax
     11bbc71:	49 89 0f             	mov    QWORD PTR [r15],rcx
     11bbc74:	4c 89 ff             	mov    rdi,r15
     11bbc77:	e8 c6 02 00 00       	call   11bbf42 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14c6>
     11bbc7c:	48 85 db             	test   rbx,rbx
     11bbc7f:	0f 84 21 01 00 00    	je     11bbda6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x132a>
     11bbc85:	48 83 bc 24 e8 00 00 	cmp    QWORD PTR [rsp+0xe8],0x0
     11bbc8c:	00 00 
     11bbc8e:	74 2a                	je     11bbcba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x123e>
     11bbc90:	48 8b 8c 24 f0 00 00 	mov    rcx,QWORD PTR [rsp+0xf0]
     11bbc97:	00 
     11bbc98:	48 8b 41 18          	mov    rax,QWORD PTR [rcx+0x18]
     11bbc9c:	48 85 c0             	test   rax,rax
     11bbc9f:	74 26                	je     11bbcc7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124b>
     11bbca1:	48 8d 35 e6 02 00 00 	lea    rsi,[rip+0x2e6]        # 11bbf8e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1512>
     11bbca8:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
     11bbcaf:	00 
     11bbcb0:	48 89 e2             	mov    rdx,rsp
     11bbcb3:	ff d0                	call   rax
     11bbcb5:	e9 ec 00 00 00       	jmp    11bbda6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x132a>

### 0x11bbee7: and    QWORD PTR [rbx+0x30],0x0; FDE=(18595376, 18595633)
     11bbeba:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
     11bbebe:	31 ed                	xor    ebp,ebp
     11bbec0:	48 3b 05 29 5c 6f 00 	cmp    rax,QWORD PTR [rip+0x6f5c29]        # 18b1af0 <_ZZN4asio15system_categoryEvE8instance@@Base-0x70e8>
     11bbec7:	75 06                	jne    11bbecf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1453>
     11bbec9:	83 7b 18 0b          	cmp    DWORD PTR [rbx+0x18],0xb
     11bbecd:	74 51                	je     11bbf20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14a4>
     11bbecf:	e8 c6 48 8f ff       	call   ab079a <JNI_OnUnload@@Base+0x38067>
     11bbed4:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
     11bbed8:	48 3b 05 11 5c 6f 00 	cmp    rax,QWORD PTR [rip+0x6f5c11]        # 18b1af0 <_ZZN4asio15system_categoryEvE8instance@@Base-0x70e8>
     11bbedf:	75 06                	jne    11bbee7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x146b>
     11bbee1:	83 7b 18 0b          	cmp    DWORD PTR [rbx+0x18],0xb
     11bbee5:	74 39                	je     11bbf20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14a4>
     11bbee7:	48 83 63 30 00       	and    QWORD PTR [rbx+0x30],0x0
     11bbeec:	eb 1d                	jmp    11bbf0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148f>
     11bbeee:	e8 7c 49 8f ff       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
     11bbef3:	c7 43 18 02 00 00 00 	mov    DWORD PTR [rbx+0x18],0x2
     11bbefa:	48 8b 05 1f 5c 6f 00 	mov    rax,QWORD PTR [rip+0x6f5c1f]        # 18b1b20 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base-0x70d0>
     11bbf01:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
     11bbf05:	eb 04                	jmp    11bbf0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148f>
     11bbf07:	48 89 6b 30          	mov    QWORD PTR [rbx+0x30],rbp
     11bbf0b:	f6 43 44 10          	test   BYTE PTR [rbx+0x44],0x10
     11bbf0f:	75 05                	jne    11bbf16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x149a>
     11bbf11:	6a 01                	push   0x1
     11bbf13:	5d                   	pop    rbp
     11bbf14:	eb 0a                	jmp    11bbf20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14a4>
     11bbf16:	31 ed                	xor    ebp,ebp
     11bbf18:	48 83 7b 30 01       	cmp    QWORD PTR [rbx+0x30],0x1
     11bbf1d:	83 d5 01             	adc    ebp,0x1
     11bbf20:	89 e8                	mov    eax,ebp
     11bbf22:	48 83 c4 18          	add    rsp,0x18
     11bbf26:	5b                   	pop    rbx
     11bbf27:	41 5c                	pop    r12
     11bbf29:	41 5d                	pop    r13

### 0x11bbf07: mov    QWORD PTR [rbx+0x30],rbp; FDE=(18595376, 18595633)
     11bbed4:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
     11bbed8:	48 3b 05 11 5c 6f 00 	cmp    rax,QWORD PTR [rip+0x6f5c11]        # 18b1af0 <_ZZN4asio15system_categoryEvE8instance@@Base-0x70e8>
     11bbedf:	75 06                	jne    11bbee7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x146b>
     11bbee1:	83 7b 18 0b          	cmp    DWORD PTR [rbx+0x18],0xb
     11bbee5:	74 39                	je     11bbf20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14a4>
     11bbee7:	48 83 63 30 00       	and    QWORD PTR [rbx+0x30],0x0
     11bbeec:	eb 1d                	jmp    11bbf0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148f>
     11bbeee:	e8 7c 49 8f ff       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
     11bbef3:	c7 43 18 02 00 00 00 	mov    DWORD PTR [rbx+0x18],0x2
     11bbefa:	48 8b 05 1f 5c 6f 00 	mov    rax,QWORD PTR [rip+0x6f5c1f]        # 18b1b20 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base-0x70d0>
     11bbf01:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
     11bbf05:	eb 04                	jmp    11bbf0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148f>
     11bbf07:	48 89 6b 30          	mov    QWORD PTR [rbx+0x30],rbp
     11bbf0b:	f6 43 44 10          	test   BYTE PTR [rbx+0x44],0x10
     11bbf0f:	75 05                	jne    11bbf16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x149a>
     11bbf11:	6a 01                	push   0x1
     11bbf13:	5d                   	pop    rbp
     11bbf14:	eb 0a                	jmp    11bbf20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14a4>
     11bbf16:	31 ed                	xor    ebp,ebp
     11bbf18:	48 83 7b 30 01       	cmp    QWORD PTR [rbx+0x30],0x1
     11bbf1d:	83 d5 01             	adc    ebp,0x1
     11bbf20:	89 e8                	mov    eax,ebp
     11bbf22:	48 83 c4 18          	add    rsp,0x18
     11bbf26:	5b                   	pop    rbx
     11bbf27:	41 5c                	pop    r12
     11bbf29:	41 5d                	pop    r13
     11bbf2b:	41 5e                	pop    r14
     11bbf2d:	41 5f                	pop    r15
     11bbf2f:	5d                   	pop    rbp
     11bbf30:	c3                   	ret
     11bbf31:	cc                   	int3
     11bbf32:	50                   	push   rax
     11bbf33:	e8 0a 00 00 00       	call   11bbf42 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14c6>

### 0x11bc209: movups xmm0,XMMWORD PTR [r14+0x30]; FDE=(18596296, 18596735)
     11bc1d7:	48 89 fb             	mov    rbx,rdi
     11bc1da:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11bc1e1:	00 00 
     11bc1e3:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     11bc1ea:	00 
     11bc1eb:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
     11bc1f0:	49 89 77 08          	mov    QWORD PTR [r15+0x8],rsi
     11bc1f4:	49 89 77 10          	mov    QWORD PTR [r15+0x10],rsi
     11bc1f8:	48 83 c6 40          	add    rsi,0x40
     11bc1fc:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     11bc203:	00 
     11bc204:	e8 6f 8c b7 ff       	call   d34e78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1efe>
     11bc209:	41 0f 10 46 30       	movups xmm0,XMMWORD PTR [r14+0x30]
     11bc20e:	48 89 e0             	mov    rax,rsp
     11bc211:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
     11bc214:	41 0f 10 46 18       	movups xmm0,XMMWORD PTR [r14+0x18]
     11bc219:	0f 29 40 10          	movaps XMMWORD PTR [rax+0x10],xmm0
     11bc21d:	49 89 07             	mov    QWORD PTR [r15],rax
     11bc220:	4c 89 ff             	mov    rdi,r15
     11bc223:	e8 f2 ef ff ff       	call   11bb21a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79e>
     11bc228:	48 85 db             	test   rbx,rbx
     11bc22b:	0f 84 c9 00 00 00    	je     11bc2fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x187e>
     11bc231:	48 83 bc 24 a0 00 00 	cmp    QWORD PTR [rsp+0xa0],0x0
     11bc238:	00 00 
     11bc23a:	74 2a                	je     11bc266 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ea>
     11bc23c:	48 8b 8c 24 a8 00 00 	mov    rcx,QWORD PTR [rsp+0xa8]
     11bc243:	00 
     11bc244:	48 8b 41 18          	mov    rax,QWORD PTR [rcx+0x18]
     11bc248:	48 85 c0             	test   rax,rax
     11bc24b:	74 26                	je     11bc273 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f7>
     11bc24d:	48 8d 35 ec 07 00 00 	lea    rsi,[rip+0x7ec]        # 11bca40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fc4>
     11bc254:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     11bc25b:	00 

### 0x11bc55a: mov    rdi,QWORD PTR [rbx+0x30]; FDE=(18596752, 18597300)
     11bc52c:	4c 89 e1             	mov    rcx,r12
     11bc52f:	44 8b 44 24 0c       	mov    r8d,DWORD PTR [rsp+0xc]
     11bc534:	e8 03 85 b7 ff       	call   d34a3c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac2>
     11bc539:	48 8d 44 24 30       	lea    rax,[rsp+0x30]
     11bc53e:	0f 57 c0             	xorps  xmm0,xmm0
     11bc541:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     11bc544:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     11bc549:	e8 80 03 00 00       	call   11bc8ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e52>
     11bc54e:	eb 13                	jmp    11bc563 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ae7>
     11bc550:	48 8b 43 28          	mov    rax,QWORD PTR [rbx+0x28]
     11bc554:	89 30                	mov    DWORD PTR [rax],esi
     11bc556:	48 89 50 08          	mov    QWORD PTR [rax+0x8],rdx
     11bc55a:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
     11bc55e:	e8 4d ec ff ff       	call   11bb1b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x734>
     11bc563:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11bc56a:	00 00 
     11bc56c:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
     11bc571:	75 3c                	jne    11bc5af <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b33>
     11bc573:	48 83 c4 48          	add    rsp,0x48
     11bc577:	5b                   	pop    rbx
     11bc578:	41 5c                	pop    r12
     11bc57a:	41 5d                	pop    r13
     11bc57c:	41 5e                	pop    r14
     11bc57e:	41 5f                	pop    r15
     11bc580:	5d                   	pop    rbp
     11bc581:	c3                   	ret
     11bc582:	48 89 c7             	mov    rdi,rax
     11bc585:	e8 1b d5 8b ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     11bc58a:	48 89 c3             	mov    rbx,rax
     11bc58d:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     11bc592:	e8 37 03 00 00       	call   11bc8ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e52>
     11bc597:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11bc59e:	00 00 

### 0x11bc633: mov    rax,QWORD PTR [r14+0x30]; FDE=(18597300, 18597881)
     11bc600:	48 89 01             	mov    QWORD PTR [rcx],rax
     11bc603:	41 0f 10 46 68       	movups xmm0,XMMWORD PTR [r14+0x68]
     11bc608:	0f 11 41 08          	movups XMMWORD PTR [rcx+0x8],xmm0
     11bc60c:	49 8b 46 78          	mov    rax,QWORD PTR [r14+0x78]
     11bc610:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
     11bc614:	41 8b 86 80 00 00 00 	mov    eax,DWORD PTR [r14+0x80]
     11bc61b:	89 41 20             	mov    DWORD PTR [rcx+0x20],eax
     11bc61e:	41 0f 10 86 88 00 00 	movups xmm0,XMMWORD PTR [r14+0x88]
     11bc625:	00 
     11bc626:	0f 11 41 28          	movups XMMWORD PTR [rcx+0x28],xmm0
     11bc62a:	41 0f 10 46 18       	movups xmm0,XMMWORD PTR [r14+0x18]
     11bc62f:	0f 11 41 38          	movups XMMWORD PTR [rcx+0x38],xmm0
     11bc633:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
     11bc637:	48 89 41 48          	mov    QWORD PTR [rcx+0x48],rax
     11bc63b:	49 89 0f             	mov    QWORD PTR [r15],rcx
     11bc63e:	4c 89 ff             	mov    rdi,r15
     11bc641:	e8 fc f8 ff ff       	call   11bbf42 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14c6>
     11bc646:	48 85 db             	test   rbx,rbx
     11bc649:	0f 84 21 01 00 00    	je     11bc770 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cf4>
     11bc64f:	48 83 bc 24 e8 00 00 	cmp    QWORD PTR [rsp+0xe8],0x0
     11bc656:	00 00 
     11bc658:	74 2a                	je     11bc684 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c08>
     11bc65a:	48 8b 8c 24 f0 00 00 	mov    rcx,QWORD PTR [rsp+0xf0]
     11bc661:	00 
     11bc662:	48 8b 41 18          	mov    rax,QWORD PTR [rcx+0x18]
     11bc666:	48 85 c0             	test   rax,rax
     11bc669:	74 26                	je     11bc691 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c15>
     11bc66b:	48 8d 35 80 02 00 00 	lea    rsi,[rip+0x280]        # 11bc8f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e76>
     11bc672:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
     11bc679:	00 
     11bc67a:	48 89 e2             	mov    rdx,rsp
     11bc67d:	ff d0                	call   rax
     11bc67f:	e9 ec 00 00 00       	jmp    11bc770 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cf4>

### 0x11bc89f: mov    QWORD PTR [rbx+0x30],r14; FDE=(18597882, 18598093)
     11bc872:	48 3b 05 77 52 6f 00 	cmp    rax,QWORD PTR [rip+0x6f5277]        # 18b1af0 <_ZZN4asio15system_categoryEvE8instance@@Base-0x70e8>
     11bc879:	75 09                	jne    11bc884 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e08>
     11bc87b:	45 31 f6             	xor    r14d,r14d
     11bc87e:	83 7b 18 0b          	cmp    DWORD PTR [rbx+0x18],0xb
     11bc882:	74 37                	je     11bc8bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e3f>
     11bc884:	e8 11 3f 8f ff       	call   ab079a <JNI_OnUnload@@Base+0x38067>
     11bc889:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
     11bc88d:	45 31 f6             	xor    r14d,r14d
     11bc890:	48 3b 05 59 52 6f 00 	cmp    rax,QWORD PTR [rip+0x6f5259]        # 18b1af0 <_ZZN4asio15system_categoryEvE8instance@@Base-0x70e8>
     11bc897:	75 06                	jne    11bc89f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e23>
     11bc899:	83 7b 18 0b          	cmp    DWORD PTR [rbx+0x18],0xb
     11bc89d:	74 1c                	je     11bc8bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e3f>
     11bc89f:	4c 89 73 30          	mov    QWORD PTR [rbx+0x30],r14
     11bc8a3:	f6 43 44 10          	test   BYTE PTR [rbx+0x44],0x10
     11bc8a7:	75 06                	jne    11bc8af <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e33>
     11bc8a9:	6a 01                	push   0x1
     11bc8ab:	41 5e                	pop    r14
     11bc8ad:	eb 0c                	jmp    11bc8bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e3f>
     11bc8af:	31 c0                	xor    eax,eax
     11bc8b1:	4c 3b 73 50          	cmp    r14,QWORD PTR [rbx+0x50]
     11bc8b5:	83 d0 01             	adc    eax,0x1
     11bc8b8:	41 89 c6             	mov    r14d,eax
     11bc8bb:	44 89 f0             	mov    eax,r14d
     11bc8be:	48 83 c4 08          	add    rsp,0x8
     11bc8c2:	5b                   	pop    rbx
     11bc8c3:	41 5c                	pop    r12
     11bc8c5:	41 5d                	pop    r13
     11bc8c7:	41 5e                	pop    r14
     11bc8c9:	41 5f                	pop    r15
     11bc8cb:	5d                   	pop    rbp
     11bc8cc:	c3                   	ret
     11bc8cd:	cc                   	int3
     11bc8ce:	50                   	push   rax

### 0x11bd953: mov    QWORD PTR [r14+0x30],rax; FDE=(18602180, 18602521)
     11bd923:	4d 01 fe             	add    r14,r15
     11bd926:	48 89 e7             	mov    rdi,rsp
     11bd929:	4c 89 f2             	mov    rdx,r14
     11bd92c:	e8 25 42 98 ff       	call   b41b56 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8eaf6>
     11bd931:	4c 8d 74 24 40       	lea    r14,[rsp+0x40]
     11bd936:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
     11bd93b:	4c 89 f7             	mov    rdi,r14
     11bd93e:	e8 c3 5a ff ff       	call   11b3406 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37a81c>
     11bd943:	49 89 e7             	mov    r15,rsp
     11bd946:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
     11bd94a:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
     11bd94f:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     11bd953:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
     11bd957:	0f 57 c0             	xorps  xmm0,xmm0
     11bd95a:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
     11bd95e:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     11bd963:	48 89 df             	mov    rdi,rbx
     11bd966:	4c 89 f6             	mov    rsi,r14
     11bd969:	e8 98 5a ff ff       	call   11b3406 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37a81c>
     11bd96e:	41 0f 10 46 20       	movups xmm0,XMMWORD PTR [r14+0x20]
     11bd973:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
     11bd977:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
     11bd97b:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     11bd97f:	0f 57 c0             	xorps  xmm0,xmm0
     11bd982:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
     11bd987:	49 83 66 30 00       	and    QWORD PTR [r14+0x30],0x0
     11bd98c:	c6 43 38 01          	mov    BYTE PTR [rbx+0x38],0x1
     11bd990:	4c 89 f7             	mov    rdi,r14
     11bd993:	e8 92 8c ff ff       	call   11b662a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37da40>
     11bd998:	4c 89 ff             	mov    rdi,r15
     11bd99b:	e8 88 dd 8b ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     11bd9a0:	eb 07                	jmp    11bd9a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f2d>
     11bd9a2:	31 c0                	xor    eax,eax

### 0x11bd977: mov    rax,QWORD PTR [r14+0x30]; FDE=(18602180, 18602521)
     11bd946:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
     11bd94a:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
     11bd94f:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     11bd953:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
     11bd957:	0f 57 c0             	xorps  xmm0,xmm0
     11bd95a:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
     11bd95e:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     11bd963:	48 89 df             	mov    rdi,rbx
     11bd966:	4c 89 f6             	mov    rsi,r14
     11bd969:	e8 98 5a ff ff       	call   11b3406 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37a81c>
     11bd96e:	41 0f 10 46 20       	movups xmm0,XMMWORD PTR [r14+0x20]
     11bd973:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
     11bd977:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
     11bd97b:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     11bd97f:	0f 57 c0             	xorps  xmm0,xmm0
     11bd982:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
     11bd987:	49 83 66 30 00       	and    QWORD PTR [r14+0x30],0x0
     11bd98c:	c6 43 38 01          	mov    BYTE PTR [rbx+0x38],0x1
     11bd990:	4c 89 f7             	mov    rdi,r14
     11bd993:	e8 92 8c ff ff       	call   11b662a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37da40>
     11bd998:	4c 89 ff             	mov    rdi,r15
     11bd99b:	e8 88 dd 8b ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     11bd9a0:	eb 07                	jmp    11bd9a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f2d>
     11bd9a2:	31 c0                	xor    eax,eax
     11bd9a4:	88 03                	mov    BYTE PTR [rbx],al
     11bd9a6:	88 43 38             	mov    BYTE PTR [rbx+0x38],al
     11bd9a9:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     11bd9ae:	e8 0b 0d 00 00       	call   11be6be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3c42>
     11bd9b3:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     11bd9b8:	e8 a3 58 ff ff       	call   11b3260 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37a676>
     11bd9bd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11bd9c4:	00 00 
     11bd9c6:	48 3b 84 24 a8 00 00 	cmp    rax,QWORD PTR [rsp+0xa8]

### 0x11bd97b: mov    QWORD PTR [rbx+0x30],rax; FDE=(18602180, 18602521)
     11bd94a:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
     11bd94f:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     11bd953:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
     11bd957:	0f 57 c0             	xorps  xmm0,xmm0
     11bd95a:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
     11bd95e:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     11bd963:	48 89 df             	mov    rdi,rbx
     11bd966:	4c 89 f6             	mov    rsi,r14
     11bd969:	e8 98 5a ff ff       	call   11b3406 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37a81c>
     11bd96e:	41 0f 10 46 20       	movups xmm0,XMMWORD PTR [r14+0x20]
     11bd973:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
     11bd977:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
     11bd97b:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     11bd97f:	0f 57 c0             	xorps  xmm0,xmm0
     11bd982:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
     11bd987:	49 83 66 30 00       	and    QWORD PTR [r14+0x30],0x0
     11bd98c:	c6 43 38 01          	mov    BYTE PTR [rbx+0x38],0x1
     11bd990:	4c 89 f7             	mov    rdi,r14
     11bd993:	e8 92 8c ff ff       	call   11b662a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37da40>
     11bd998:	4c 89 ff             	mov    rdi,r15
     11bd99b:	e8 88 dd 8b ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     11bd9a0:	eb 07                	jmp    11bd9a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f2d>
     11bd9a2:	31 c0                	xor    eax,eax
     11bd9a4:	88 03                	mov    BYTE PTR [rbx],al
     11bd9a6:	88 43 38             	mov    BYTE PTR [rbx+0x38],al
     11bd9a9:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     11bd9ae:	e8 0b 0d 00 00       	call   11be6be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3c42>
     11bd9b3:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     11bd9b8:	e8 a3 58 ff ff       	call   11b3260 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37a676>
     11bd9bd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11bd9c4:	00 00 
     11bd9c6:	48 3b 84 24 a8 00 00 	cmp    rax,QWORD PTR [rsp+0xa8]
     11bd9cd:	00 

### 0x11bd987: and    QWORD PTR [r14+0x30],0x0; FDE=(18602180, 18602521)
     11bd957:	0f 57 c0             	xorps  xmm0,xmm0
     11bd95a:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
     11bd95e:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     11bd963:	48 89 df             	mov    rdi,rbx
     11bd966:	4c 89 f6             	mov    rsi,r14
     11bd969:	e8 98 5a ff ff       	call   11b3406 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37a81c>
     11bd96e:	41 0f 10 46 20       	movups xmm0,XMMWORD PTR [r14+0x20]
     11bd973:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
     11bd977:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
     11bd97b:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     11bd97f:	0f 57 c0             	xorps  xmm0,xmm0
     11bd982:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
     11bd987:	49 83 66 30 00       	and    QWORD PTR [r14+0x30],0x0
     11bd98c:	c6 43 38 01          	mov    BYTE PTR [rbx+0x38],0x1
     11bd990:	4c 89 f7             	mov    rdi,r14
     11bd993:	e8 92 8c ff ff       	call   11b662a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37da40>
     11bd998:	4c 89 ff             	mov    rdi,r15
     11bd99b:	e8 88 dd 8b ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     11bd9a0:	eb 07                	jmp    11bd9a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f2d>
     11bd9a2:	31 c0                	xor    eax,eax
     11bd9a4:	88 03                	mov    BYTE PTR [rbx],al
     11bd9a6:	88 43 38             	mov    BYTE PTR [rbx+0x38],al
     11bd9a9:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     11bd9ae:	e8 0b 0d 00 00       	call   11be6be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3c42>
     11bd9b3:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     11bd9b8:	e8 a3 58 ff ff       	call   11b3260 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37a676>
     11bd9bd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11bd9c4:	00 00 
     11bd9c6:	48 3b 84 24 a8 00 00 	cmp    rax,QWORD PTR [rsp+0xa8]
     11bd9cd:	00 
     11bd9ce:	75 44                	jne    11bda14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f98>
     11bd9d0:	48 81 c4 b0 00 00 00 	add    rsp,0xb0
     11bd9d7:	5b                   	pop    rbx

## Vptr materializations in containing caller family
### region (18493836, 18495534)
     11a3408:	48 8d 05 11 11 6f 00 	lea    rax,[rip+0x6f1111]        # 1894520 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1460>
     11a355a:	48 8d 05 bf 0f 6f 00 	lea    rax,[rip+0x6f0fbf]        # 1894520 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1460>
