# ef91cc vtable owner

## relocations around 0x18365d0..0x1836680
00000000018365e0  0000000000000008 R_X86_64_RELATIVE                         ef90ca
00000000018365e8  0000000000000008 R_X86_64_RELATIVE                         ef90de
00000000018365f0  0000000000000008 R_X86_64_RELATIVE                         ef90f0
00000000018365f8  0000000000000008 R_X86_64_RELATIVE                         ef9192
0000000001836600  0000000000000008 R_X86_64_RELATIVE                         ef91ac
0000000001836608  0000000000000008 R_X86_64_RELATIVE                         ef91b6
0000000001836610  0000000000000008 R_X86_64_RELATIVE                         ef91cc
0000000001836628  0000000000000008 R_X86_64_RELATIVE                         eff822
0000000001836630  0000000000000008 R_X86_64_RELATIVE                         eff836
0000000001836638  0000000000000008 R_X86_64_RELATIVE                         eff848
0000000001836640  0000000000000008 R_X86_64_RELATIVE                         eff876
0000000001836648  0000000000000008 R_X86_64_RELATIVE                         aae9b2
0000000001836650  0000000000000008 R_X86_64_RELATIVE                         aae9bc
0000000001836658  0000000000000008 R_X86_64_RELATIVE                         eff89c
0000000001836670  0000000000000008 R_X86_64_RELATIVE                         f019cc
0000000001836678  0000000000000008 R_X86_64_RELATIVE                         f019e0

## exact code refs to 0x1836600..0x1836640
  ef96a1:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  ef96a6:	48 8d 0d eb 27 94 00 	lea    rcx,[rip+0x9427eb]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
  ef96ad:	48 89 08             	mov    QWORD PTR [rax],rcx
  ef96b0:	48 8b 8c 24 b0 00 00 	mov    rcx,QWORD PTR [rsp+0xb0]
  ef96b7:	00 
  ef96b8:	48 85 c9             	test   rcx,rcx
  ef96bb:	74 1c                	je     ef96d9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0aef>
  ef96bd:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  ef96c2:	4c 89 a4 24 18 07 00 	mov    QWORD PTR [rsp+0x718],r12
  ef96c9:	00 
  ef96ca:	48 89 8c 24 20 07 00 	mov    QWORD PTR [rsp+0x720],rcx
  ef96d1:	00 
  ef96d2:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  ef96d7:	eb 11                	jmp    ef96ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0b00>
  ef96d9:	4c 89 a4 24 18 07 00 	mov    QWORD PTR [rsp+0x718],r12
  ef96e0:	00 
  ef96e1:	48 83 a4 24 20 07 00 	and    QWORD PTR [rsp+0x720],0x0
  ef96e8:	00 00 
  ef96ea:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
  ef96ef:	48 8d b1 a0 00 00 00 	lea    rsi,[rcx+0xa0]
  ef96f6:	48 8d 15 2b cf 93 00 	lea    rdx,[rip+0x93cf2b]        # 1836628 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x85c0>
  ef96fd:	48 89 94 24 10 07 00 	mov    QWORD PTR [rsp+0x710],rdx
  ef9704:	00 
  ef9705:	4c 89 ac 24 30 07 00 	mov    QWORD PTR [rsp+0x730],r13
  ef970c:	00 
  ef970d:	48 8b 91 58 02 00 00 	mov    rdx,QWORD PTR [rcx+0x258]
  ef9714:	66 0f 6f 81 50 02 00 	movdqa xmm0,XMMWORD PTR [rcx+0x250]
  ef971b:	00 
  ef971c:	66 0f 7f 84 24 20 02 	movdqa XMMWORD PTR [rsp+0x220],xmm0
  ef9723:	00 00 
  ef9725:	48 85 d2             	test   rdx,rdx
  ef9728:	74 05                	je     ef972f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0b45>
  ef972a:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
  ef972f:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
  ef9734:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
  ef973b:	00 
  ef973c:	e8 4f 0b b8 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ef9741:	4c 8b 74 24 60       	mov    r14,QWORD PTR [rsp+0x60]
  ef9746:	49 8d b6 d0 00 00 00 	lea    rsi,[r14+0xd0]
  ef974d:	48 8d bc 24 f0 05 00 	lea    rdi,[rsp+0x5f0]
  ef9754:	00 
  ef9755:	e8 36 0b b8 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ef975a:	49 8d b6 60 02 00 00 	lea    rsi,[r14+0x260]
  ef9761:	48 8d 9c 24 c0 0a 00 	lea    rbx,[rsp+0xac0]
  ef9768:	00 
  ef9769:	48 89 df             	mov    rdi,rbx
  ef976c:	e8 1f 0b b8 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ef9771:	48 8d 35 2d a1 43 ff 	lea    rsi,[rip+0xffffffffff43a12d]        # 3338a5 <_ZTSSt12bad_any_cast@@Base-0x5c923>
  ef9778:	4c 8d b4 24 e0 06 00 	lea    r14,[rsp+0x6e0]
  ef977f:	00 
  ef9780:	4c 89 f7             	mov    rdi,r14
  ef9783:	e8 f6 02 b8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  ef9788:	4c 8b 64 24 70       	mov    r12,QWORD PTR [rsp+0x70]
  ef978d:	4d 89 e5             	mov    r13,r12
  ef9790:	49 83 c5 20          	add    r13,0x20
  ef9794:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
  ef9799:	0f b6 80 d4 01 00 00 	movzx  eax,BYTE PTR [rax+0x1d4]
--
  ef9966:	00 
  ef9967:	48 85 c0             	test   rax,rax
  ef996a:	74 24                	je     ef9990 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0da6>
  ef996c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  ef9971:	48 8b 8c 24 a0 00 00 	mov    rcx,QWORD PTR [rsp+0xa0]
  ef9978:	00 
  ef9979:	48 89 8c 24 18 07 00 	mov    QWORD PTR [rsp+0x718],rcx
  ef9980:	00 
  ef9981:	48 89 84 24 20 07 00 	mov    QWORD PTR [rsp+0x720],rax
  ef9988:	00 
  ef9989:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  ef998e:	eb 19                	jmp    ef99a9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0dbf>
  ef9990:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
  ef9997:	00 
  ef9998:	48 89 84 24 18 07 00 	mov    QWORD PTR [rsp+0x718],rax
  ef999f:	00 
  ef99a0:	48 83 a4 24 20 07 00 	and    QWORD PTR [rsp+0x720],0x0
  ef99a7:	00 00 
  ef99a9:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
  ef99ae:	48 8d b1 a0 00 00 00 	lea    rsi,[rcx+0xa0]
  ef99b5:	48 8d 05 6c cc 93 00 	lea    rax,[rip+0x93cc6c]        # 1836628 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x85c0>
  ef99bc:	48 89 84 24 10 07 00 	mov    QWORD PTR [rsp+0x710],rax
  ef99c3:	00 
  ef99c4:	4c 89 ac 24 30 07 00 	mov    QWORD PTR [rsp+0x730],r13
  ef99cb:	00 
  ef99cc:	48 8b 81 58 02 00 00 	mov    rax,QWORD PTR [rcx+0x258]
  ef99d3:	66 0f 6f 81 50 02 00 	movdqa xmm0,XMMWORD PTR [rcx+0x250]
  ef99da:	00 
  ef99db:	66 0f 7f 84 24 20 02 	movdqa XMMWORD PTR [rsp+0x220],xmm0
  ef99e2:	00 00 
  ef99e4:	48 85 c0             	test   rax,rax
  ef99e7:	74 05                	je     ef99ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0e04>
  ef99e9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  ef99ee:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
  ef99f5:	00 
  ef99f6:	48 89 b4 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rsi
  ef99fd:	00 
  ef99fe:	e8 8d 08 b8 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ef9a03:	4c 8b 74 24 60       	mov    r14,QWORD PTR [rsp+0x60]
  ef9a08:	49 8d b6 d0 00 00 00 	lea    rsi,[r14+0xd0]
  ef9a0f:	48 8d 9c 24 f0 05 00 	lea    rbx,[rsp+0x5f0]
  ef9a16:	00 
  ef9a17:	48 89 df             	mov    rdi,rbx
  ef9a1a:	48 89 b4 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rsi
  ef9a21:	00 
  ef9a22:	e8 69 08 b8 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ef9a27:	49 8d b6 60 02 00 00 	lea    rsi,[r14+0x260]
  ef9a2e:	4c 8d b4 24 c0 0a 00 	lea    r14,[rsp+0xac0]
  ef9a35:	00 
  ef9a36:	4c 89 f7             	mov    rdi,r14
  ef9a39:	48 89 b4 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rsi
  ef9a40:	00 
  ef9a41:	e8 4a 08 b8 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ef9a46:	48 8d 35 58 9e 43 ff 	lea    rsi,[rip+0xffffffffff439e58]        # 3338a5 <_ZTSSt12bad_any_cast@@Base-0x5c923>
  ef9a4d:	4c 8d a4 24 e0 06 00 	lea    r12,[rsp+0x6e0]
  ef9a54:	00 
  ef9a55:	4c 89 e7             	mov    rdi,r12
--
  efb503:	00 00 
  efb505:	48 8b 84 24 b0 00 00 	mov    rax,QWORD PTR [rsp+0xb0]
  efb50c:	00 
  efb50d:	48 85 c0             	test   rax,rax
  efb510:	74 24                	je     efb536 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc294c>
  efb512:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  efb517:	48 8b 8c 24 a0 00 00 	mov    rcx,QWORD PTR [rsp+0xa0]
  efb51e:	00 
  efb51f:	48 89 8c 24 18 07 00 	mov    QWORD PTR [rsp+0x718],rcx
  efb526:	00 
  efb527:	48 89 84 24 20 07 00 	mov    QWORD PTR [rsp+0x720],rax
  efb52e:	00 
  efb52f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  efb534:	eb 19                	jmp    efb54f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2965>
  efb536:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
  efb53d:	00 
  efb53e:	48 89 84 24 18 07 00 	mov    QWORD PTR [rsp+0x718],rax
  efb545:	00 
  efb546:	48 83 a4 24 20 07 00 	and    QWORD PTR [rsp+0x720],0x0
  efb54d:	00 00 
  efb54f:	48 8d 05 d2 b0 93 00 	lea    rax,[rip+0x93b0d2]        # 1836628 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x85c0>
  efb556:	48 89 84 24 10 07 00 	mov    QWORD PTR [rsp+0x710],rax
  efb55d:	00 
  efb55e:	4c 89 ac 24 30 07 00 	mov    QWORD PTR [rsp+0x730],r13
  efb565:	00 
  efb566:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
  efb56b:	48 8b 81 58 02 00 00 	mov    rax,QWORD PTR [rcx+0x258]
  efb572:	0f 28 81 50 02 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x250]
  efb579:	0f 29 84 24 d0 01 00 	movaps XMMWORD PTR [rsp+0x1d0],xmm0
  efb580:	00 
  efb581:	48 85 c0             	test   rax,rax
  efb584:	74 05                	je     efb58b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc29a1>
  efb586:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  efb58b:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
  efb592:	00 
  efb593:	48 8b b4 24 80 00 00 	mov    rsi,QWORD PTR [rsp+0x80]
  efb59a:	00 
  efb59b:	e8 f0 ec b7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  efb5a0:	4c 8d bc 24 c0 0a 00 	lea    r15,[rsp+0xac0]
  efb5a7:	00 
  efb5a8:	4c 89 ff             	mov    rdi,r15
  efb5ab:	48 8b b4 24 f0 00 00 	mov    rsi,QWORD PTR [rsp+0xf0]
  efb5b2:	00 
  efb5b3:	e8 d8 ec b7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  efb5b8:	48 8d 9c 24 e0 06 00 	lea    rbx,[rsp+0x6e0]
  efb5bf:	00 
  efb5c0:	48 89 df             	mov    rdi,rbx
  efb5c3:	48 8b b4 24 28 01 00 	mov    rsi,QWORD PTR [rsp+0x128]
  efb5ca:	00 
  efb5cb:	e8 c0 ec b7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  efb5d0:	4d 89 f5             	mov    r13,r14
  efb5d3:	49 83 c5 20          	add    r13,0x20
  efb5d7:	48 8b 74 24 60       	mov    rsi,QWORD PTR [rsp+0x60]
  efb5dc:	48 63 86 dc 01 00 00 	movsxd rax,DWORD PTR [rsi+0x1dc]
  efb5e3:	0f b6 8e d4 01 00 00 	movzx  ecx,BYTE PTR [rsi+0x1d4]
  efb5ea:	31 d2                	xor    edx,edx
  efb5ec:	88 94 24 20 02 00 00 	mov    BYTE PTR [rsp+0x220],dl
--
  eff7d9:	00 
  eff7da:	e8 4f 5b 7c 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
  eff7df:	48 8d bc 24 d0 09 00 	lea    rdi,[rsp+0x9d0]
  eff7e6:	00 
  eff7e7:	e8 de 7a 76 00       	call   16672ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b436>
  eff7ec:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eff7f3:	00 00 
  eff7f5:	48 3b 84 24 80 16 00 	cmp    rax,QWORD PTR [rsp+0x1680]
  eff7fc:	00 
  eff7fd:	75 08                	jne    eff807 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6c1d>
  eff7ff:	48 89 df             	mov    rdi,rbx
  eff802:	e8 c9 04 b7 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  eff807:	e8 a4 02 8f 00       	call   17efab0 <__stack_chk_fail@plt>
  eff80c:	eb 0b                	jmp    eff819 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6c2f>
  eff80e:	48 89 c3             	mov    rbx,rax
  eff811:	48 89 df             	mov    rdi,rbx
  eff814:	e8 8c a2 b7 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  eff819:	48 89 c7             	mov    rdi,rax
  eff81c:	e8 84 a2 b7 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  eff821:	cc                   	int3
  eff822:	48 8d 05 ff 6d 93 00 	lea    rax,[rip+0x936dff]        # 1836628 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x85c0>
  eff829:	48 89 07             	mov    QWORD PTR [rdi],rax
  eff82c:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
  eff830:	e9 51 ec b9 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  eff835:	cc                   	int3
  eff836:	53                   	push   rbx
  eff837:	48 89 fb             	mov    rbx,rdi
  eff83a:	e8 e3 ff ff ff       	call   eff822 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6c38>
  eff83f:	48 89 df             	mov    rdi,rbx
  eff842:	5b                   	pop    rbx
  eff843:	e9 d8 e6 8e 00       	jmp    17edf20 <_ZdlPv@plt>
  eff848:	53                   	push   rbx
  eff849:	48 89 fb             	mov    rbx,rdi
  eff84c:	6a 18                	push   0x18
  eff84e:	5f                   	pop    rdi
  eff84f:	e8 ac e6 8e 00       	call   17edf00 <_Znwm@plt>
  eff854:	48 8d 0d cd 6d 93 00 	lea    rcx,[rip+0x936dcd]        # 1836628 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x85c0>
  eff85b:	48 89 08             	mov    QWORD PTR [rax],rcx
  eff85e:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
  eff862:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
  eff866:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  eff86a:	48 85 c9             	test   rcx,rcx
  eff86d:	74 05                	je     eff874 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6c8a>
  eff86f:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  eff874:	5b                   	pop    rbx
  eff875:	c3                   	ret
  eff876:	48 8d 05 ab 6d 93 00 	lea    rax,[rip+0x936dab]        # 1836628 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x85c0>
  eff87d:	48 89 06             	mov    QWORD PTR [rsi],rax
  eff880:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
  eff884:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  eff888:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
  eff88c:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
  eff890:	48 85 c0             	test   rax,rax
  eff893:	74 05                	je     eff89a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6cb0>
  eff895:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  eff89a:	c3                   	ret
  eff89b:	cc                   	int3
  eff89c:	55                   	push   rbp
  eff89d:	41 57                	push   r15
  eff89f:	41 56                	push   r14
  eff8a1:	41 55                	push   r13
  eff8a3:	41 54                	push   r12
  eff8a5:	53                   	push   rbx
  eff8a6:	48 81 ec 28 02 00 00 	sub    rsp,0x228
  eff8ad:	49 89 f6             	mov    r14,rsi
  eff8b0:	48 89 fb             	mov    rbx,rdi
  eff8b3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eff8ba:	00 00 
  eff8bc:	48 89 84 24 20 02 00 	mov    QWORD PTR [rsp+0x220],rax
  eff8c3:	00 
  eff8c4:	4c 8d bc 24 c8 00 00 	lea    r15,[rsp+0xc8]
  eff8cb:	00 
  eff8cc:	4c 89 ff             	mov    rdi,r15
  eff8cf:	48 89 d6             	mov    rsi,rdx
  eff8d2:	e8 0d 0f 7d 00       	call   16d07e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84950>
  eff8d7:	4d 8b 6e 08          	mov    r13,QWORD PTR [r14+0x8]
  eff8db:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
  eff8e0:	4c 89 fe             	mov    rsi,r15
  eff8e3:	e8 58 e6 8e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  eff8e8:	4d 8d 75 60          	lea    r14,[r13+0x60]
  eff8ec:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
  eff8f1:	4c 89 f7             	mov    rdi,r14
  eff8f4:	e8 9d 0e c4 ff       	call   b40796 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8d736>

## exact relocation slots pointing to ef91b6 / ef91cc
0000000001836608  0000000000000008 R_X86_64_RELATIVE                         ef91b6
0000000001836610  0000000000000008 R_X86_64_RELATIVE                         ef91cc

## ef91b6 / ef91cc entry

/tmp/efowner/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000ef9180 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0596>:
  ef9180:	44 24 20             	rex.R and al,0x20
  ef9183:	75 08                	jne    ef918d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc05a3>
  ef9185:	48 89 df             	mov    rdi,rbx
  ef9188:	e8 43 6b b7 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  ef918d:	e8 1e 69 8f 00       	call   17efab0 <__stack_chk_fail@plt>
  ef9192:	48 8d 47 10          	lea    rax,[rdi+0x10]
  ef9196:	48 8d 0d 43 d4 93 00 	lea    rcx,[rip+0x93d443]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
  ef919d:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  ef91a0:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  ef91a4:	48 89 c6             	mov    rsi,rax
  ef91a7:	e9 c4 89 00 00       	jmp    f01b70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc8f86>
  ef91ac:	48 83 c7 10          	add    rdi,0x10
  ef91b0:	e9 b9 fd ff ff       	jmp    ef8f6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0384>
  ef91b5:	cc                   	int3
  ef91b6:	53                   	push   rbx
  ef91b7:	48 89 fb             	mov    rbx,rdi
  ef91ba:	48 83 c7 10          	add    rdi,0x10
  ef91be:	e8 ab fd ff ff       	call   ef8f6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0384>
  ef91c3:	48 89 df             	mov    rdi,rbx
  ef91c6:	5b                   	pop    rbx
  ef91c7:	e9 54 4d 8f 00       	jmp    17edf20 <_ZdlPv@plt>
  ef91cc:	55                   	push   rbp
  ef91cd:	41 57                	push   r15
  ef91cf:	41 56                	push   r14
  ef91d1:	41 55                	push   r13
  ef91d3:	41 54                	push   r12
  ef91d5:	53                   	push   rbx
  ef91d6:	48 81 ec f8 0a 00 00 	sub    rsp,0xaf8
  ef91dd:	49 89 fc             	mov    r12,rdi
  ef91e0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ef91e7:	00 00 
  ef91e9:	48 89 84 24 f0 0a 00 	mov    QWORD PTR [rsp+0xaf0],rax
  ef91f0:	00 
  ef91f1:	0f 57 c0             	xorps  xmm0,xmm0
  ef91f4:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
  ef91f7:	48 8d 47 18          	lea    rax,[rdi+0x18]
  ef91fb:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0
  ef91ff:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
  ef9203:	48 8d 47 30          	lea    rax,[rdi+0x30]
  ef9207:	0f 11 47 30          	movups XMMWORD PTR [rdi+0x30],xmm0
  ef920b:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
  ef920f:	66 0f 6f 86 50 01 00 	movdqa xmm0,XMMWORD PTR [rsi+0x150]
  ef9216:	00 
  ef9217:	48 89 74 24 60       	mov    QWORD PTR [rsp+0x60],rsi
  ef921c:	48 8b 86 58 01 00 00 	mov    rax,QWORD PTR [rsi+0x158]
  ef9223:	48 85 c0             	test   rax,rax
  ef9226:	74 05                	je     ef922d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0643>
  ef9228:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  ef922d:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
  ef9232:	8a 80 b7 01 00 00    	mov    al,BYTE PTR [rax+0x1b7]
  ef9238:	66 0f 7f 84 24 10 07 	movdqa XMMWORD PTR [rsp+0x710],xmm0
  ef923f:	00 00 
  ef9241:	66 49 0f 3a 16 c6 01 	pextrq r14,xmm0,0x1
  ef9248:	4d 85 f6             	test   r14,r14
  ef924b:	74 05                	je     ef9252 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0668>
  ef924d:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
  ef9252:	66 0f 7f 84 24 b0 00 	movdqa XMMWORD PTR [rsp+0xb0],xmm0
  ef9259:	00 00 
  ef925b:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]

## constructors/materializers near references
