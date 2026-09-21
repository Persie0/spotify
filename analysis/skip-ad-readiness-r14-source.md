# Readiness receiver r14 source

Target: 0xefb7a5 moves r14 into r15; r15 is later stored at adapter outer+0x58.


/tmp/r14/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000efb580 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2996>:
  efb580:	00 48 85             	add    BYTE PTR [rax-0x7b],cl
  efb583:	c0 74 05 f0 48       	shl    BYTE PTR [rbp+rax*1-0x10],0x48
  efb588:	ff 40 08             	inc    DWORD PTR [rax+0x8]
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
  efb5f3:	88 94 24 30 02 00 00 	mov    BYTE PTR [rsp+0x230],dl
  efb5fa:	0f b6 96 f5 01 00 00 	movzx  edx,BYTE PTR [rsi+0x1f5]
  efb601:	66 0f 6f 84 24 c0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xc0]
  efb608:	00 00 
  efb60a:	66 48 0f 7e c6       	movq   rsi,xmm0
  efb60f:	66 48 0f 3a 16 c5 01 	pextrq rbp,xmm0,0x1
  efb616:	48 8b bc 24 30 02 00 	mov    rdi,QWORD PTR [rsp+0x230]
  efb61d:	00 
  efb61e:	48 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],rdi
  efb623:	0f 10 84 24 20 02 00 	movups xmm0,XMMWORD PTR [rsp+0x220]
  efb62a:	00 
  efb62b:	0f 11 44 24 38       	movups XMMWORD PTR [rsp+0x38],xmm0
  efb630:	89 54 24 50          	mov    DWORD PTR [rsp+0x50],edx
  efb634:	89 4c 24 28          	mov    DWORD PTR [rsp+0x28],ecx
  efb638:	48 8d 8c 24 e0 01 00 	lea    rcx,[rsp+0x1e0]
  efb63f:	00 
  efb640:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
  efb645:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  efb64a:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
  efb64f:	4c 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],r15
  efb654:	48 8d 84 24 40 02 00 	lea    rax,[rsp+0x240]
  efb65b:	00 
  efb65c:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  efb660:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
  efb666:	48 8d 8c 24 10 07 00 	lea    rcx,[rsp+0x710]
  efb66d:	00 
  efb66e:	4c 8d 8c 24 d0 01 00 	lea    r9,[rsp+0x1d0]
  efb675:	00 
  efb676:	4c 89 ef             	mov    rdi,r13
  efb679:	48 89 ea             	mov    rdx,rbp
  efb67c:	4d 89 e0             	mov    r8,r12
  efb67f:	e8 b0 b3 04 00       	call   f46a34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10de4a>
  efb684:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
  efb68b:	00 
  efb68c:	e8 d9 e8 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  efb691:	48 8d bc 24 c0 0a 00 	lea    rdi,[rsp+0xac0]
  efb698:	00 
  efb699:	e8 cc e8 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  efb69e:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
  efb6a5:	00 
  efb6a6:	e8 bf e8 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  efb6ab:	48 8b bc 24 d8 01 00 	mov    rdi,QWORD PTR [rsp+0x1d8]
  efb6b2:	00 
  efb6b3:	e8 ce 2d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efb6b8:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
  efb6bf:	00 
  efb6c0:	e8 a5 e8 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  efb6c5:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
  efb6cc:	00 
  efb6cd:	e8 b4 2d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efb6d2:	48 89 ef             	mov    rdi,rbp
  efb6d5:	e8 ac 2d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efb6da:	48 8d 9c 24 80 01 00 	lea    rbx,[rsp+0x180]
  efb6e1:	00 
  efb6e2:	48 89 df             	mov    rdi,rbx
  efb6e5:	4c 89 ee             	mov    rsi,r13
  efb6e8:	4c 89 f2             	mov    rdx,r14
  efb6eb:	e8 14 31 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
  efb6f0:	31 ff                	xor    edi,edi
  efb6f2:	e8 25 2d ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  efb6f7:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
  efb6fb:	66 0f 7f 84 24 90 01 	movdqa XMMWORD PTR [rsp+0x190],xmm0
  efb702:	00 00 
  efb704:	31 ff                	xor    edi,edi
  efb706:	e8 7b 2d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efb70b:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
  efb712:	00 
  efb713:	e8 78 27 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  efb718:	48 8b bc 24 78 01 00 	mov    rdi,QWORD PTR [rsp+0x178]
  efb71f:	00 
  efb720:	e8 61 2d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efb725:	48 8d bc 24 c0 0a 00 	lea    rdi,[rsp+0xac0]
  efb72c:	00 
  efb72d:	48 8d b4 24 b0 06 00 	lea    rsi,[rsp+0x6b0]
  efb734:	00 
  efb735:	e8 56 eb b7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  efb73a:	48 8d 1d 57 07 94 00 	lea    rbx,[rip+0x940757]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
  efb741:	bf 90 00 00 00       	mov    edi,0x90
  efb746:	e8 b5 27 8f 00       	call   17edf00 <_Znwm@plt>
  efb74b:	49 89 c6             	mov    r14,rax
  efb74e:	66 0f ef c0          	pxor   xmm0,xmm0
  efb752:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  efb757:	48 89 18             	mov    QWORD PTR [rax],rbx
  efb75a:	0f 28 84 24 90 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x190]
  efb761:	00 
  efb762:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
  efb769:	00 
  efb76a:	48 8b 84 24 98 01 00 	mov    rax,QWORD PTR [rsp+0x198]
  efb771:	00 
  efb772:	48 85 c0             	test   rax,rax
  efb775:	74 05                	je     efb77c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2b92>
  efb777:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  efb77c:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
  efb783:	00 
  efb784:	48 8d b4 24 c0 0a 00 	lea    rsi,[rsp+0xac0]
  efb78b:	00 
  efb78c:	e8 ff ea b7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  efb791:	48 83 a4 24 30 07 00 	and    QWORD PTR [rsp+0x730],0x0
  efb798:	00 00 
  efb79a:	6a 40                	push   0x40
  efb79c:	5f                   	pop    rdi
  efb79d:	e8 5e 27 8f 00       	call   17edf00 <_Znwm@plt>
  efb7a2:	48 89 c3             	mov    rbx,rax
  efb7a5:	4d 89 f7             	mov    r15,r14
  efb7a8:	49 83 c7 20          	add    r15,0x20
  efb7ac:	48 8d 05 75 af 93 00 	lea    rax,[rip+0x93af75]        # 1836728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x86c0>
  efb7b3:	48 89 03             	mov    QWORD PTR [rbx],rax
  efb7b6:	48 89 df             	mov    rdi,rbx
  efb7b9:	48 83 c7 10          	add    rdi,0x10
  efb7bd:	48                   	rex.W
  efb7be:	8d                   	.byte 0x8d
  efb7bf:	b4                   	.byte 0xb4
