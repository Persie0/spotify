# Candidate service184 host vptr 0x1859058 methods

Candidate address point: 0x1859058
- +0x10 = 0x11a318c (known selector-5 refresh)
- +0x20 = 0x11a3842
- +0x28 = 0x11a3bd0
- +0x30 = 0x11a2f1c
- +0x38 = 0x11a3c3c

## slot +0x10: 0x11a318c
FDE=(18493836, 18495534)
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

## slot +0x20: 0x11a3842
FDE=(18495554, 18496463)
     11a3842:	55                   	push   rbp
     11a3843:	41 57                	push   r15
     11a3845:	41 56                	push   r14
     11a3847:	41 55                	push   r13
     11a3849:	41 54                	push   r12
     11a384b:	53                   	push   rbx
     11a384c:	48 81 ec 58 02 00 00 	sub    rsp,0x258
     11a3853:	49 89 cf             	mov    r15,rcx
     11a3856:	49 89 d5             	mov    r13,rdx
     11a3859:	48 89 f5             	mov    rbp,rsi
     11a385c:	49 89 fe             	mov    r14,rdi
     11a385f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11a3866:	00 00 
     11a3868:	48 89 84 24 50 02 00 	mov    QWORD PTR [rsp+0x250],rax
     11a386f:	00 
     11a3870:	48 89 d7             	mov    rdi,rdx
     11a3873:	e8 ec 03 00 00       	call   11a3c64 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36b07a>
     11a3878:	66 89 44 24 20       	mov    WORD PTR [rsp+0x20],ax
     11a387d:	66 3d ff 00          	cmp    ax,0xff
     11a3881:	77 22                	ja     11a38a5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36acbb>
     11a3883:	e8 68 b5 64 00       	call   17eedf0 <_ZNSt6__ndk116generic_categoryEv@plt>
     11a3888:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
     11a388c:	be 90 01 00 00       	mov    esi,0x190
     11a3891:	48 89 c2             	mov    rdx,rax
     11a3894:	e8 0b 2d 99 ff       	call   b365a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x83544>
     11a3899:	0f 57 c0             	xorps  xmm0,xmm0
     11a389c:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
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
     11a3929:	0f 57 c0             	xorps  xmm0,xmm0
     11a392c:	48 8d 8c 24 80 01 00 	lea    rcx,[rsp+0x180]
     11a3933:	00 
     11a3934:	0f 29 41 10          	movaps XMMWORD PTR [rcx+0x10],xmm0
     11a3938:	0f 29 01             	movaps XMMWORD PTR [rcx],xmm0
     11a393b:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11a393e:	48 89 df             	mov    rdi,rbx
     11a3941:	4c 89 e6             	mov    rsi,r12
     11a3944:	4c 89 fa             	mov    rdx,r15
     11a3947:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11a394a:	89 c3                	mov    ebx,eax
     11a394c:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
     11a3953:	00 
     11a3954:	e8 3f 99 b3 ff       	call   cdd298 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22a238>
     11a3959:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     11a395e:	e8 cb 19 52 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     11a3963:	48 8d bc 24 a8 01 00 	lea    rdi,[rsp+0x1a8]
     11a396a:	00 
     11a396b:	e8 be 19 52 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     11a3970:	84 db                	test   bl,bl
     11a3972:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     11a3977:	74 20                	je     11a3999 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36adaf>
     11a3979:	49 83 c7 60          	add    r15,0x60
     11a397d:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     11a3984:	00 
     11a3985:	4c 89 fe             	mov    rsi,r15
     11a3988:	e8 7d 03 00 00       	call   11a3d0a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36b120>
     11a398d:	0f 57 c0             	xorps  xmm0,xmm0
     11a3990:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     11a3994:	e9 46 01 00 00       	jmp    11a3adf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36aef5>
     11a3999:	48 8b ad c0 07 00 00 	mov    rbp,QWORD PTR [rbp+0x7c0]
     11a39a0:	48 8d 9c 24 d0 00 00 	lea    rbx,[rsp+0xd0]
     11a39a7:	00 
     11a39a8:	48 89 df             	mov    rdi,rbx
     11a39ab:	4c 89 ee             	mov    rsi,r13
     11a39ae:	e8 b3 64 52 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
     11a39b3:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
     11a39ba:	00 
     11a39bb:	48 89 de             	mov    rsi,rbx
     11a39be:	e8 71 6a 52 00       	call   16ca434 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e5a0>
     11a39c3:	8a 84 24 00 02 00 00 	mov    al,BYTE PTR [rsp+0x200]
     11a39ca:	4c 8d 6c 24 30       	lea    r13,[rsp+0x30]
     11a39cf:	41 88 45 f0          	mov    BYTE PTR [r13-0x10],al
     11a39d3:	4c 89 ef             	mov    rdi,r13
     11a39d6:	48 8d b4 24 10 02 00 	lea    rsi,[rsp+0x210]
     11a39dd:	00 
     11a39de:	e8 ad 68 8d ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     11a39e3:	48 8b 84 24 40 02 00 	mov    rax,QWORD PTR [rsp+0x240]
     11a39ea:	00 
     11a39eb:	48 8d 5c 24 70       	lea    rbx,[rsp+0x70]
     11a39f0:	48 89 43 f0          	mov    QWORD PTR [rbx-0x10],rax
     11a39f4:	48 89 df             	mov    rdi,rbx
     11a39f7:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     11a39fc:	e8 8f 68 8d ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     11a3a01:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
     11a3a07:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     11a3a0e:	00 00 
     11a3a10:	4c 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r15
     11a3a17:	00 
     11a3a18:	48 83 a4 24 c0 00 00 	and    QWORD PTR [rsp+0xc0],0x0
     11a3a1f:	00 00 
     11a3a21:	bf 90 00 00 00       	mov    edi,0x90
     11a3a26:	e8 d5 a4 64 00       	call   17edf00 <_Znwm@plt>
     11a3a2b:	49 89 c4             	mov    r12,rax
     11a3a2e:	8a 44 24 20          	mov    al,BYTE PTR [rsp+0x20]
     11a3a32:	41 88 04 24          	mov    BYTE PTR [r12],al
     11a3a36:	49 8d 7c 24 10       	lea    rdi,[r12+0x10]
     11a3a3b:	4c 89 ee             	mov    rsi,r13
     11a3a3e:	e8 2b 2a 99 ff       	call   b3646e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8340e>
     11a3a43:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     11a3a48:	49 89 44 24 40       	mov    QWORD PTR [r12+0x40],rax
     11a3a4d:	4c 89 e7             	mov    rdi,r12
     11a3a50:	48 83 c7 50          	add    rdi,0x50
     11a3a54:	48 89 de             	mov    rsi,rbx
     11a3a57:	e8 12 2a 99 ff       	call   b3646e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8340e>
     11a3a5c:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     11a3a63:	00 
     11a3a64:	48 83 a4 24 a0 00 00 	and    QWORD PTR [rsp+0xa0],0x0
     11a3a6b:	00 00 
     11a3a6d:	49 89 84 24 80 00 00 	mov    QWORD PTR [r12+0x80],rax
     11a3a74:	00 
     11a3a75:	4c 8d 84 24 b0 00 00 	lea    r8,[rsp+0xb0]
     11a3a7c:	00 
     11a3a7d:	4d 89 20             	mov    QWORD PTR [r8],r12
     11a3a80:	48 8d 05 37 03 00 00 	lea    rax,[rip+0x337]        # 11a3dbe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36b1d4>
     11a3a87:	49 89 40 10          	mov    QWORD PTR [r8+0x10],rax
     11a3a8b:	48 8d 05 56 03 00 00 	lea    rax,[rip+0x356]        # 11a3de8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36b1fe>
     11a3a92:	49 89 40 18          	mov    QWORD PTR [r8+0x18],rax
     11a3a96:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     11a3a9a:	48 8d 94 24 28 01 00 	lea    rdx,[rsp+0x128]
     11a3aa1:	00 
     11a3aa2:	4c 89 f7             	mov    rdi,r14
     11a3aa5:	48 89 ee             	mov    rsi,rbp
     11a3aa8:	4c 89 f9             	mov    rcx,r15
     11a3aab:	ff 50 18             	call   QWORD PTR [rax+0x18]
     11a3aae:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     11a3ab5:	00 
     11a3ab6:	e8 5f 9c b3 ff       	call   cdd71a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22a6ba>
     11a3abb:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     11a3ac0:	e8 51 03 00 00       	call   11a3e16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36b22c>
     11a3ac5:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
     11a3acc:	00 
     11a3acd:	e8 5c 18 52 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     11a3ad2:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     11a3ad9:	00 
     11a3ada:	e8 4f 18 52 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     11a3adf:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     11a3ae4:	e8 53 03 00 00       	call   11a3e3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36b252>
     11a3ae9:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
     11a3af0:	00 
     11a3af1:	e8 74 64 8d ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     11a3af6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11a3afd:	00 00 
     11a3aff:	48 3b 84 24 50 02 00 	cmp    rax,QWORD PTR [rsp+0x250]
     11a3b06:	00 
     11a3b07:	0f 85 bd 00 00 00    	jne    11a3bca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36afe0>
     11a3b0d:	4c 89 f0             	mov    rax,r14
     11a3b10:	48 81 c4 58 02 00 00 	add    rsp,0x258
     11a3b17:	5b                   	pop    rbx
     11a3b18:	41 5c                	pop    r12
     11a3b1a:	41 5d                	pop    r13
     11a3b1c:	41 5e                	pop    r14
     11a3b1e:	41 5f                	pop    r15
     11a3b20:	5d                   	pop    rbp
     11a3b21:	c3                   	ret
     11a3b22:	eb 00                	jmp    11a3b24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36af3a>
     11a3b24:	49 89 c6             	mov    r14,rax
     11a3b27:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     11a3b2e:	00 
     11a3b2f:	e8 e6 9b b3 ff       	call   cdd71a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22a6ba>
     11a3b34:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     11a3b39:	e8 d8 02 00 00       	call   11a3e16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36b22c>
     11a3b3e:	eb 10                	jmp    11a3b50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36af66>
     11a3b40:	49 89 c6             	mov    r14,rax
     11a3b43:	4c 89 ef             	mov    rdi,r13
     11a3b46:	e8 1f 64 8d ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     11a3b4b:	eb 03                	jmp    11a3b50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36af66>
     11a3b4d:	49 89 c6             	mov    r14,rax
     11a3b50:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
     11a3b57:	00 
     11a3b58:	e8 d1 17 52 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     11a3b5d:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     11a3b64:	00 
     11a3b65:	eb 27                	jmp    11a3b8e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36afa4>
     11a3b67:	49 89 c6             	mov    r14,rax
     11a3b6a:	eb 27                	jmp    11a3b93 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36afa9>
     11a3b6c:	49 89 c6             	mov    r14,rax
     11a3b6f:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
     11a3b76:	00 
     11a3b77:	e8 1c 97 b3 ff       	call   cdd298 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22a238>
     11a3b7c:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     11a3b81:	e8 a8 17 52 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     11a3b86:	48 8d bc 24 a8 01 00 	lea    rdi,[rsp+0x1a8]
     11a3b8d:	00 
     11a3b8e:	e8 9b 17 52 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     11a3b93:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     11a3b98:	e8 9f 02 00 00       	call   11a3e3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36b252>
     11a3b9d:	eb 03                	jmp    11a3ba2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36afb8>
     11a3b9f:	49 89 c6             	mov    r14,rax
     11a3ba2:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
     11a3ba9:	00 
     11a3baa:	e8 bb 63 8d ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     11a3baf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11a3bb6:	00 00 
     11a3bb8:	48 3b 84 24 50 02 00 	cmp    rax,QWORD PTR [rsp+0x250]
     11a3bbf:	00 
     11a3bc0:	75 08                	jne    11a3bca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36afe0>
     11a3bc2:	4c 89 f7             	mov    rdi,r14
     11a3bc5:	e8 06 c1 8c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     11a3bca:	e8 e1 be 64 00       	call   17efab0 <__stack_chk_fail@plt>

## slot +0x28: 0x11a3bd0
FDE=(18496464, 18496572)
     11a3bd0:	41 57                	push   r15
     11a3bd2:	41 56                	push   r14
     11a3bd4:	53                   	push   rbx
     11a3bd5:	48 83 ec 50          	sub    rsp,0x50
     11a3bd9:	49 89 f6             	mov    r14,rsi
     11a3bdc:	48 89 fb             	mov    rbx,rdi
     11a3bdf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11a3be6:	00 00 
     11a3be8:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     11a3bed:	49 81 c6 e8 06 00 00 	add    r14,0x6e8
     11a3bf4:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
     11a3bf9:	4c 89 ff             	mov    rdi,r15
     11a3bfc:	48 89 d6             	mov    rsi,rdx
     11a3bff:	e8 36 6b 63 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
     11a3c04:	48 89 df             	mov    rdi,rbx
     11a3c07:	4c 89 f6             	mov    rsi,r14
     11a3c0a:	4c 89 fa             	mov    rdx,r15
     11a3c0d:	e8 b8 63 63 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
     11a3c12:	4c 89 ff             	mov    rdi,r15
     11a3c15:	e8 ce 6b 63 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11a3c1a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11a3c21:	00 00 
     11a3c23:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
     11a3c28:	75 0d                	jne    11a3c37 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36b04d>
     11a3c2a:	48 89 d8             	mov    rax,rbx
     11a3c2d:	48 83 c4 50          	add    rsp,0x50
     11a3c31:	5b                   	pop    rbx
     11a3c32:	41 5e                	pop    r14
     11a3c34:	41 5f                	pop    r15
     11a3c36:	c3                   	ret
     11a3c37:	e8 74 be 64 00       	call   17efab0 <__stack_chk_fail@plt>

## slot +0x30: 0x11a2f1c
FDE=(18493212, 18493451)
     11a2f1c:	41 56                	push   r14
     11a2f1e:	53                   	push   rbx
     11a2f1f:	48 83 ec 48          	sub    rsp,0x48
     11a2f23:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11a2f2a:	00 00 
     11a2f2c:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     11a2f31:	80 bf 40 07 00 00 00 	cmp    BYTE PTR [rdi+0x740],0x0
     11a2f38:	74 1c                	je     11a2f56 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a36c>
     11a2f3a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11a2f41:	00 00 
     11a2f43:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
     11a2f48:	0f 85 b8 00 00 00    	jne    11a3006 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a41c>
     11a2f4e:	48 83 c4 48          	add    rsp,0x48
     11a2f52:	5b                   	pop    rbx
     11a2f53:	41 5e                	pop    r14
     11a2f55:	c3                   	ret
     11a2f56:	48 89 fb             	mov    rbx,rdi
     11a2f59:	ff 87 e0 06 00 00    	inc    DWORD PTR [rdi+0x6e0]
     11a2f5f:	48 8b bf 90 00 00 00 	mov    rdi,QWORD PTR [rdi+0x90]
     11a2f66:	e8 41 ea 61 00       	call   17c19ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175b18>
     11a2f6b:	84 c0                	test   al,al
     11a2f6d:	74 78                	je     11a2fe7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a3fd>
     11a2f6f:	48 8b bb 88 00 00 00 	mov    rdi,QWORD PTR [rbx+0x88]
     11a2f76:	48 8b b3 90 00 00 00 	mov    rsi,QWORD PTR [rbx+0x90]
     11a2f7d:	e8 3c ea 61 00       	call   17c19be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175b2a>
     11a2f82:	48 3d f5 01 00 00    	cmp    rax,0x1f5
     11a2f88:	7c b0                	jl     11a2f3a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a350>
     11a2f8a:	48 8d 05 87 ec 2a ff 	lea    rax,[rip+0xffffffffff2aec87]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
     11a2f91:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     11a2f96:	48 89 06             	mov    QWORD PTR [rsi],rax
     11a2f99:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     11a2f9d:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     11a2fa2:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     11a2fa7:	49 89 1e             	mov    QWORD PTR [r14],rbx
     11a2faa:	48 81 c3 88 00 00 00 	add    rbx,0x88
     11a2fb1:	48 8d 05 ac 94 8d ff 	lea    rax,[rip+0xffffffffff8d94ac]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     11a2fb8:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     11a2fbc:	48 8d 05 69 00 00 00 	lea    rax,[rip+0x69]        # 11a302c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a442>
     11a2fc3:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     11a2fc7:	b9 f4 01 00 00       	mov    ecx,0x1f4
     11a2fcc:	48 89 df             	mov    rdi,rbx
     11a2fcf:	4c 89 f2             	mov    rdx,r14
     11a2fd2:	45 31 c0             	xor    r8d,r8d
     11a2fd5:	e8 f2 e7 61 00       	call   17c17cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175938>
     11a2fda:	4c 89 f7             	mov    rdi,r14
     11a2fdd:	e8 bc 42 90 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
     11a2fe2:	e9 53 ff ff ff       	jmp    11a2f3a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a350>
     11a2fe7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11a2fee:	00 00 
     11a2ff0:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
     11a2ff5:	75 0f                	jne    11a3006 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a41c>
     11a2ff7:	48 89 df             	mov    rdi,rbx
     11a2ffa:	48 83 c4 48          	add    rsp,0x48
     11a2ffe:	5b                   	pop    rbx
     11a2fff:	41 5e                	pop    r14
     11a3001:	e9 06 00 00 00       	jmp    11a300c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a422>
     11a3006:	e8 a5 ca 64 00       	call   17efab0 <__stack_chk_fail@plt>

## slot +0x38: 0x11a3c3c
FDE=(18496572, 18496611)
     11a3c3c:	53                   	push   rbx
     11a3c3d:	48 89 fb             	mov    rbx,rdi
     11a3c40:	c6 87 40 07 00 00 01 	mov    BYTE PTR [rdi+0x740],0x1
     11a3c47:	48 81 c7 88 00 00 00 	add    rdi,0x88
     11a3c4e:	e8 e5 dc 61 00       	call   17c1938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175aa4>
     11a3c53:	48 81 c3 20 08 00 00 	add    rbx,0x820
     11a3c5a:	48 89 df             	mov    rdi,rbx
     11a3c5d:	5b                   	pop    rbx
     11a3c5e:	e9 d5 dc 61 00       	jmp    17c1938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175aa4>

## slot +0x68: 0x11a2df8
FDE=(18492920, 18492928)
     11a2df8:	48 89 f7             	mov    rdi,rsi
     11a2dfb:	e9 ea ec fa ff       	jmp    1151aea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x318f00>

## All textual materializations of exact vptr 0x1859058
### 0xddac01, FDE=(14525690, 14532001)
      ddab96:	4c 89 f6             	mov    rsi,r14
      ddab99:	ff 50 60             	call   QWORD PTR [rax+0x60]
      ddab9c:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
      ddaba1:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax
      ddaba8:	00 
      ddaba9:	48 8d 05 b4 18 ca ff 	lea    rax,[rip+0xffffffffffca18b4]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      ddabb0:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
      ddabb7:	00 
      ddabb8:	48 8d 05 4b 13 00 00 	lea    rax,[rip+0x134b]        # ddbf0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa8f90>
      ddabbf:	48 89 84 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rax
      ddabc6:	00 
      ddabc7:	bf 30 08 00 00       	mov    edi,0x830
      ddabcc:	e8 2f 33 a1 00       	call   17edf00 <_Znwm@plt>
      ddabd1:	49 89 c6             	mov    r14,rax
      ddabd4:	0f 28 84 24 f0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xf0]
      ddabdb:	00 
      ddabdc:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
      ddabe1:	0f 57 c0             	xorps  xmm0,xmm0
      ddabe4:	0f 29 84 24 f0 00 00 	movaps XMMWORD PTR [rsp+0xf0],xmm0
      ddabeb:	00 
      ddabec:	48 8d bc 24 60 02 00 	lea    rdi,[rsp+0x260]
      ddabf3:	00 
      ddabf4:	48 8d b4 24 b0 01 00 	lea    rsi,[rsp+0x1b0]
      ddabfb:	00 
      ddabfc:	e8 a9 82 3c 00       	call   11a2eaa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a2c0>
      ddac01:	48 8d 05 50 e4 a7 00 	lea    rax,[rip+0xa7e450]        # 1859058 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x15740>
      ddac08:	49 89 06             	mov    QWORD PTR [r14],rax
      ddac0b:	66 0f 6f 44 24 50    	movdqa xmm0,XMMWORD PTR [rsp+0x50]
      ddac11:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      ddac17:	48 8b 84 24 e0 00 00 	mov    rax,QWORD PTR [rsp+0xe0]
      ddac1e:	00 
      ddac1f:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      ddac23:	49 89 6e 20          	mov    QWORD PTR [r14+0x20],rbp
      ddac27:	4d 89 7e 28          	mov    QWORD PTR [r14+0x28],r15
      ddac2b:	4d 89 6e 30          	mov    QWORD PTR [r14+0x30],r13
      ddac2f:	4d 8d 7e 40          	lea    r15,[r14+0x40]
      ddac33:	48 8b 84 24 50 02 00 	mov    rax,QWORD PTR [rsp+0x250]
      ddac3a:	00 
      ddac3b:	48 85 c0             	test   rax,rax
      ddac3e:	74 13                	je     ddac53 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa7cd9>
      ddac40:	4c 39 e0             	cmp    rax,r12
      ddac43:	74 18                	je     ddac5d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa7ce3>
      ddac45:	48 8d 8c 24 50 02 00 	lea    rcx,[rsp+0x250]
      ddac4c:	00 
      ddac4d:	49 89 46 60          	mov    QWORD PTR [r14+0x60],rax
      ddac51:	eb 04                	jmp    ddac57 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa7cdd>
      ddac53:	49 8d 4e 60          	lea    rcx,[r14+0x60]
      ddac57:	48 83 21 00          	and    QWORD PTR [rcx],0x0
      ddac5b:	eb 15                	jmp    ddac72 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa7cf8>
      ddac5d:	4d 89 7e 60          	mov    QWORD PTR [r14+0x60],r15
      ddac61:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
      ddac68:	00 
      ddac69:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ddac6c:	4c 89 fe             	mov    rsi,r15
      ddac6f:	ff 50 18             	call   QWORD PTR [rax+0x18]
      ddac72:	0f b6 44 24 68       	movzx  eax,BYTE PTR [rsp+0x68]
      ddac77:	66 0f 6e c0          	movd   xmm0,eax
      ddac7b:	0f b6 44 24 0f       	movzx  eax,BYTE PTR [rsp+0xf]
      ddac80:	66 0f 3a 20 c0 01    	pinsrb xmm0,eax,0x1
      ddac86:	0f b6 44 24 0e       	movzx  eax,BYTE PTR [rsp+0xe]
      ddac8b:	66 0f 3a 20 c0 02    	pinsrb xmm0,eax,0x2
      ddac91:	0f b6 44 24 0d       	movzx  eax,BYTE PTR [rsp+0xd]
      ddac96:	66 0f 3a 20 c0 03    	pinsrb xmm0,eax,0x3
      ddac9c:	66 41 0f 7e 46 70    	movd   DWORD PTR [r14+0x70],xmm0
      ddaca2:	8a 44 24 0c          	mov    al,BYTE PTR [rsp+0xc]
      ddaca6:	41 88 46 74          	mov    BYTE PTR [r14+0x74],al
      ddacaa:	0f b7 84 24 1d 01 00 	movzx  eax,WORD PTR [rsp+0x11d]
      ddacb1:	00 
      ddacb2:	66 41 89 46 75       	mov    WORD PTR [r14+0x75],ax
      ddacb7:	8a 84 24 1f 01 00 00 	mov    al,BYTE PTR [rsp+0x11f]
      ddacbe:	41 88 46 77          	mov    BYTE PTR [r14+0x77],al
      ddacc2:	8b 84 24 94 00 00 00 	mov    eax,DWORD PTR [rsp+0x94]
      ddacc9:	41 89 46 78          	mov    DWORD PTR [r14+0x78],eax
      ddaccd:	41 89 5e 7c          	mov    DWORD PTR [r14+0x7c],ebx
      ddacd1:	48 8b 74 24 48       	mov    rsi,QWORD PTR [rsp+0x48]
      ddacd6:	49 89 b6 80 00 00 00 	mov    QWORD PTR [r14+0x80],rsi
      ddacdd:	49 8d 9e 88 00 00 00 	lea    rbx,[r14+0x88]
      ddace4:	48 89 df             	mov    rdi,rbx
      ddace7:	e8 d6 69 9e 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
      ddacec:	49 8d be 98 00 00 00 	lea    rdi,[r14+0x98]

## Stores of newly allocated 0x830 candidate to owner/container
      ddabc6:	00 
      ddabc7:	bf 30 08 00 00       	mov    edi,0x830
      ddabcc:	e8 2f 33 a1 00       	call   17edf00 <_Znwm@plt>
      ddabd1:	49 89 c6             	mov    r14,rax
      ddabd4:	0f 28 84 24 f0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xf0]
      ddabdb:	00 
      ddabdc:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
      ddabe1:	0f 57 c0             	xorps  xmm0,xmm0
      ddabe4:	0f 29 84 24 f0 00 00 	movaps XMMWORD PTR [rsp+0xf0],xmm0
      ddabeb:	00 
      ddabec:	48 8d bc 24 60 02 00 	lea    rdi,[rsp+0x260]
      ddabf3:	00 
      ddabf4:	48 8d b4 24 b0 01 00 	lea    rsi,[rsp+0x1b0]
      ddabfb:	00 
      ddabfc:	e8 a9 82 3c 00       	call   11a2eaa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a2c0>
      ddac01:	48 8d 05 50 e4 a7 00 	lea    rax,[rip+0xa7e450]        # 1859058 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x15740>
      ddac08:	49 89 06             	mov    QWORD PTR [r14],rax
      ddac0b:	66 0f 6f 44 24 50    	movdqa xmm0,XMMWORD PTR [rsp+0x50]
      ddac11:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      ddac17:	48 8b 84 24 e0 00 00 	mov    rax,QWORD PTR [rsp+0xe0]
      ddac1e:	00 
      ddac1f:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      ddac23:	49 89 6e 20          	mov    QWORD PTR [r14+0x20],rbp
      ddac27:	4d 89 7e 28          	mov    QWORD PTR [r14+0x28],r15
      ddac2b:	4d 89 6e 30          	mov    QWORD PTR [r14+0x30],r13
      ddac2f:	4d 8d 7e 40          	lea    r15,[r14+0x40]
      ddac33:	48 8b 84 24 50 02 00 	mov    rax,QWORD PTR [rsp+0x250]
      ddac3a:	00 
      ddac3b:	48 85 c0             	test   rax,rax
      ddac3e:	74 13                	je     ddac53 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa7cd9>
      ddac40:	4c 39 e0             	cmp    rax,r12
      ddac43:	74 18                	je     ddac5d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa7ce3>
      ddac45:	48 8d 8c 24 50 02 00 	lea    rcx,[rsp+0x250]
      ddac4c:	00 
      ddac4d:	49 89 46 60          	mov    QWORD PTR [r14+0x60],rax
      ddac51:	eb 04                	jmp    ddac57 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa7cdd>
      ddac53:	49 8d 4e 60          	lea    rcx,[r14+0x60]
      ddac57:	48 83 21 00          	and    QWORD PTR [rcx],0x0
      ddac5b:	eb 15                	jmp    ddac72 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa7cf8>
      ddac5d:	4d 89 7e 60          	mov    QWORD PTR [r14+0x60],r15
      ddac61:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
      ddac68:	00 
      ddac69:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ddac6c:	4c 89 fe             	mov    rsi,r15
      ddac6f:	ff 50 18             	call   QWORD PTR [rax+0x18]
      ddac72:	0f b6 44 24 68       	movzx  eax,BYTE PTR [rsp+0x68]
      ddac77:	66 0f 6e c0          	movd   xmm0,eax
      ddac7b:	0f b6 44 24 0f       	movzx  eax,BYTE PTR [rsp+0xf]
      ddac80:	66 0f 3a 20 c0 01    	pinsrb xmm0,eax,0x1
      ddac86:	0f b6 44 24 0e       	movzx  eax,BYTE PTR [rsp+0xe]
      ddac8b:	66 0f 3a 20 c0 02    	pinsrb xmm0,eax,0x2
      ddac91:	0f b6 44 24 0d       	movzx  eax,BYTE PTR [rsp+0xd]
      ddac96:	66 0f 3a 20 c0 03    	pinsrb xmm0,eax,0x3
      ddac9c:	66 41 0f 7e 46 70    	movd   DWORD PTR [r14+0x70],xmm0
      ddaca2:	8a 44 24 0c          	mov    al,BYTE PTR [rsp+0xc]
      ddaca6:	41 88 46 74          	mov    BYTE PTR [r14+0x74],al
      ddacaa:	0f b7 84 24 1d 01 00 	movzx  eax,WORD PTR [rsp+0x11d]
      ddacb1:	00 
      ddacb2:	66 41 89 46 75       	mov    WORD PTR [r14+0x75],ax
      ddacb7:	8a 84 24 1f 01 00 00 	mov    al,BYTE PTR [rsp+0x11f]
      ddacbe:	41 88 46 77          	mov    BYTE PTR [r14+0x77],al
      ddacc2:	8b 84 24 94 00 00 00 	mov    eax,DWORD PTR [rsp+0x94]
      ddacc9:	41 89 46 78          	mov    DWORD PTR [r14+0x78],eax
      ddaccd:	41 89 5e 7c          	mov    DWORD PTR [r14+0x7c],ebx
      ddacd1:	48 8b 74 24 48       	mov    rsi,QWORD PTR [rsp+0x48]
      ddacd6:	49 89 b6 80 00 00 00 	mov    QWORD PTR [r14+0x80],rsi
      ddacdd:	49 8d 9e 88 00 00 00 	lea    rbx,[r14+0x88]
      ddace4:	48 89 df             	mov    rdi,rbx
      ddace7:	e8 d6 69 9e 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
      ddacec:	49 8d be 98 00 00 00 	lea    rdi,[r14+0x98]
      ddacf3:	e8 72 75 3c 00       	call   11a226a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x369680>
      ddacf8:	49 8d be 20 01 00 00 	lea    rdi,[r14+0x120]
      ddacff:	48 8d 35 ca f7 5f ff 	lea    rsi,[rip+0xffffffffff5ff7ca]        # 3da4d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x50b5>
      ddad06:	48 8d 0d 13 b0 65 ff 	lea    rcx,[rip+0xffffffffff65b013]        # 435d20 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b76f>
      ddad0d:	6a 05                	push   0x5
      ddad0f:	5a                   	pop    rdx
      ddad10:	6a 02                	push   0x2
      ddad12:	41 59                	pop    r9
      ddad14:	49 89 d0             	mov    r8,rdx
      ddad17:	e8 86 ed d7 ff       	call   b59aa2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa6a42>
      ddad1c:	4d 8d a6 a8 01 00 00 	lea    r12,[r14+0x1a8]
      ddad23:	4c 89 e7             	mov    rdi,r12
      ddad26:	e8 89 31 e3 ff       	call   c0deb4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15ae54>
      ddad2b:	4d 8d ae 78 03 00 00 	lea    r13,[r14+0x378]
      ddad32:	4c 89 ef             	mov    rdi,r13
      ddad35:	e8 14 d8 d8 ff       	call   b6854e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb54ee>
      ddad3a:	49 8d be d0 04 00 00 	lea    rdi,[r14+0x4d0]
      ddad41:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
      ddad46:	4c 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],r15
      ddad4b:	48 89 5c 24 20       	mov    QWORD PTR [rsp+0x20],rbx
      ddad50:	4c 89 64 24 78       	mov    QWORD PTR [rsp+0x78],r12
      ddad55:	4c 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],r13
      ddad5a:	e8 15 2b 8a 00       	call   167d874 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319e0>
      ddad5f:	66 41 c7 86 d8 04 00 	mov    WORD PTR [r14+0x4d8],0x100
      ddad66:	00 00 01 
      ddad69:	41 83 a6 80 06 00 00 	and    DWORD PTR [r14+0x680],0x0
      ddad70:	00 
      ddad71:	41 c6 86 88 06 00 00 	mov    BYTE PTR [r14+0x688],0x0
      ddad78:	00 
      ddad79:	66 0f ef c0          	pxor   xmm0,xmm0
      ddad7d:	66 41 0f 7f 86 e0 04 	movdqa XMMWORD PTR [r14+0x4e0],xmm0
      ddad84:	00 00 
      ddad86:	66 41 0f 7f 86 90 06 	movdqa XMMWORD PTR [r14+0x690],xmm0
      ddad8d:	00 00 
      ddad8f:	66 41 0f 7f 86 a0 06 	movdqa XMMWORD PTR [r14+0x6a0],xmm0
      ddad96:	00 00 
      ddad98:	66 41 0f 7f 86 b0 06 	movdqa XMMWORD PTR [r14+0x6b0],xmm0
      ddad9f:	00 00 
      ddada1:	4c 8d 84 24 00 01 00 	lea    r8,[rsp+0x100]
      ddada8:	00 
      ddada9:	4d 89 30             	mov    QWORD PTR [r8],r14
      ddadac:	48 8d 35 de 22 cc ff 	lea    rsi,[rip+0xffffffffffcc22de]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      ddadb3:	48 8d 0d 34 81 3c 00 	lea    rcx,[rip+0x3c8134]        # 11a2eee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a304>
      ddadba:	48 8d 9c 24 20 01 00 	lea    rbx,[rsp+0x120]
      ddadc1:	00 
      ddadc2:	6a 08                	push   0x8
      ddadc4:	41 59                	pop    r9
      ddadc6:	48 89 df             	mov    rdi,rbx
      ddadc9:	31 d2                	xor    edx,edx
      ddadcb:	e8 c4 f9 9f 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      ddadd0:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      ddadd4:	48 8d bc 24 08 01 00 	lea    rdi,[rsp+0x108]
      ddaddb:	00 
      ddaddc:	48 89 ee             	mov    rsi,rbp
      ddaddf:	48 89 da             	mov    rdx,rbx
      ddade2:	ff 50 20             	call   QWORD PTR [rax+0x20]
      ddade5:	4d 8d a6 c0 06 00 00 	lea    r12,[r14+0x6c0]
      ddadec:	48 8d 9c 24 08 01 00 	lea    rbx,[rsp+0x108]
      ddadf3:	00 
      ddadf4:	4c 89 e7             	mov    rdi,r12
      ddadf7:	48 89 de             	mov    rsi,rbx
      ddadfa:	e8 3f ec 9f 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
      ddadff:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      ddae03:	e8 7e 36 cc ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ddae08:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
      ddae0f:	00 
      ddae10:	e8 d3 f9 9f 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      ddae15:	4c 8d 84 24 00 01 00 	lea    r8,[rsp+0x100]
      ddae1c:	00 
      ddae1d:	4d 89 30             	mov    QWORD PTR [r8],r14
      ddae20:	48 8d 35 6a 22 cc ff 	lea    rsi,[rip+0xffffffffffcc226a]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      ddae27:	48 8d 0d e6 80 3c 00 	lea    rcx,[rip+0x3c80e6]        # 11a2f14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a32a>
      ddae2e:	48 8d 9c 24 20 01 00 	lea    rbx,[rsp+0x120]
      ddae35:	00 
      ddae36:	6a 08                	push   0x8
      ddae38:	41 59                	pop    r9
      ddae3a:	48 89 df             	mov    rdi,rbx
      ddae3d:	31 d2                	xor    edx,edx
      ddae3f:	e8 50 f9 9f 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      ddae44:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      ddae48:	48 8d bc 24 08 01 00 	lea    rdi,[rsp+0x108]
      ddae4f:	00 
      ddae50:	48 89 ee             	mov    rsi,rbp
      ddae53:	48 89 da             	mov    rdx,rbx
      ddae56:	ff 90 78 01 00 00    	call   QWORD PTR [rax+0x178]
      ddae5c:	49 8d ae d0 06 00 00 	lea    rbp,[r14+0x6d0]
      ddae63:	48 8d 9c 24 08 01 00 	lea    rbx,[rsp+0x108]
      ddae6a:	00 
      ddae6b:	48 89 ef             	mov    rdi,rbp
      ddae6e:	48 89 de             	mov    rsi,rbx
      ddae71:	e8 c8 eb 9f 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
      ddae76:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      ddae7a:	e8 07 36 cc ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ddae7f:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
      ddae86:	00 
      ddae87:	e8 5c f9 9f 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      ddae8c:	41 83 a6 e0 06 00 00 	and    DWORD PTR [r14+0x6e0],0x0
      ddae93:	00 
      ddae94:	4d 8d be e8 06 00 00 	lea    r15,[r14+0x6e8]
      ddae9b:	4c 89 ff             	mov    rdi,r15
      ddae9e:	e8 5f ef 9f 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      ddaea3:	41 c6 86 40 07 00 00 	mov    BYTE PTR [r14+0x740],0x0
      ddaeaa:	00 
      ddaeab:	48 8b 84 24 b8 00 00 	mov    rax,QWORD PTR [rsp+0xb8]
      ddaeb2:	00 
      ddaeb3:	49 89 86 48 07 00 00 	mov    QWORD PTR [r14+0x748],rax
      ddaeba:	49 83 a6 50 07 00 00 	and    QWORD PTR [r14+0x750],0x0
      ddaec1:	00 
      ddaec2:	49 8d 9e 60 07 00 00 	lea    rbx,[r14+0x760]
      ddaec9:	48 8d b4 24 00 02 00 	lea    rsi,[rsp+0x200]
      ddaed0:	00 
      ddaed1:	48 89 df             	mov    rdi,rbx
      ddaed4:	e8 f1 b5 d1 ff       	call   af64ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4346a>
      ddaed9:	4d 8d ae 90 07 00 00 	lea    r13,[r14+0x790]
      ddaee0:	48 8d b4 24 e0 01 00 	lea    rsi,[rsp+0x1e0]
      ddaee7:	00 
      ddaee8:	4c 89 ef             	mov    rdi,r13
      ddaeeb:	e8 6a d4 ff ff       	call   dd835a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa53e0>
      ddaef0:	49 8d be b0 07 00 00 	lea    rdi,[r14+0x7b0]
      ddaef7:	e8 33 42 d6 ff       	call   b3f12f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c0cf>
      ddaefc:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
      ddaf00:	49 89 86 c0 07 00 00 	mov    QWORD PTR [r14+0x7c0],rax
      ddaf07:	49 8d be d0 07 00 00 	lea    rdi,[r14+0x7d0]
      ddaf0e:	48 8d 9c 24 60 02 00 	lea    rbx,[rsp+0x260]
      ddaf15:	00 
      ddaf16:	48 89 de             	mov    rsi,rbx
      ddaf19:	e8 8c 7f 3c 00       	call   11a2eaa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a2c0>
      ddaf1e:	49 8d be 00 08 00 00 	lea    rdi,[r14+0x800]
      ddaf25:	48 8d b4 24 90 01 00 	lea    rsi,[rsp+0x190]
      ddaf2c:	00 
      ddaf2d:	e8 28 d4 ff ff       	call   dd835a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa53e0>
      ddaf32:	4c 89 f7             	mov    rdi,r14
      ddaf35:	48 81 c7 20 08 00 00 	add    rdi,0x820
      ddaf3c:	48 8b 74 24 48       	mov    rsi,QWORD PTR [rsp+0x48]
      ddaf41:	e8 7c 67 9e 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
      ddaf46:	48 89 df             	mov    rdi,rbx
      ddaf49:	e8 1c f0 c9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ddaf4e:	31 ff                	xor    edi,edi
      ddaf50:	e8 31 35 cc ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ddaf55:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
      ddaf5a:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      ddaf5d:	4c 89 30             	mov    QWORD PTR [rax],r14
      ddaf60:	48 85 ff             	test   rdi,rdi
      ddaf63:	74 06                	je     ddaf6b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa7ff1>
      ddaf65:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ddaf68:	ff 50 08             	call   QWORD PTR [rax+0x8]
      ddaf6b:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
      ddaf72:	00 
      ddaf73:	e8 00 3e ff ff       	call   dced78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9bdfe>
      ddaf78:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
      ddaf7f:	00 
      ddaf80:	e8 e5 ef c9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ddaf85:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
      ddaf8c:	00 
      ddaf8d:	e8 e6 3d ff ff       	call   dced78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9bdfe>
      ddaf92:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
      ddaf99:	00 
      ddaf9a:	e8 cb ef c9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ddaf9f:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
      ddafa6:	00 
      ddafa7:	e8 be ef c9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ddafac:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
      ddafb3:	00 
      ddafb4:	e8 cd 34 cc ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ddafb9:	4c 8b 7c 24 30       	mov    r15,QWORD PTR [rsp+0x30]
      ddafbe:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      ddafc1:	48 8d 35 78 5f 5f ff 	lea    rsi,[rip+0xffffffffff5f5f78]        # 3d0f40 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1d94>
      ddafc8:	48 8d 0d a1 5f 5f ff 	lea    rcx,[rip+0xffffffffff5f5fa1]        # 3d0f70 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1dc4>
      ddafcf:	6a 23                	push   0x23
      ddafd1:	5a                   	pop    rdx
      ddafd2:	6a 13                	push   0x13
      ddafd4:	41 58                	pop    r8
      ddafd6:	45 31 c9             	xor    r9d,r9d
      ddafd9:	e8 ac c3 80 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      ddafde:	84 c0                	test   al,al
      ddafe0:	0f 84 f5 03 00 00    	je     ddb3db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa8461>
      ddafe6:	4c 8d b4 24 40 01 00 	lea    r14,[rsp+0x140]
      ddafed:	00 
      ddafee:	66 0f ef c0          	pxor   xmm0,xmm0
      ddaff2:	f3 41 0f 7f 06       	movdqu XMMWORD PTR [r14],xmm0
      ddaff7:	4d 89 76 f8          	mov    QWORD PTR [r14-0x8],r14
      ddaffb:	41 c6 46 10 00       	mov    BYTE PTR [r14+0x10],0x0
