# Skip Ad owner raw constructor trace

## 0xefc300..0xefc780
~~~asm

/tmp/saoraw/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000efc300 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3716>:
  efc300:	05 f0 48 ff 47       	add    eax,0x47ff48f0
  efc305:	08 48 8d             	or     BYTE PTR [rax-0x73],cl
  efc308:	05 bb 72 94 00       	add    eax,0x9472bb
  efc30d:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax
  efc311:	41 0f 29 45 30       	movaps XMMWORD PTR [r13+0x30],xmm0
  efc316:	48 8d 05 eb 22 94 00 	lea    rax,[rip+0x9422eb]        # 183e608 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x105a0>
  efc31d:	49 89 45 28          	mov    QWORD PTR [r13+0x28],rax
  efc321:	66 41 0f 7f 4d 40    	movdqa XMMWORD PTR [r13+0x40],xmm1
  efc327:	48 85 ff             	test   rdi,rdi
  efc32a:	74 05                	je     efc331 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3747>
  efc32c:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
  efc331:	48 8d 05 f8 22 94 00 	lea    rax,[rip+0x9422f8]        # 183e630 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x105c8>
  efc338:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax
  efc33c:	48 8d 05 d5 24 94 00 	lea    rax,[rip+0x9424d5]        # 183e818 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x107b0>
  efc343:	49 89 45 28          	mov    QWORD PTR [r13+0x28],rax
  efc347:	e8 3a 21 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efc34c:	48 8d 05 9d 20 94 00 	lea    rax,[rip+0x94209d]        # 183e3f0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10388>
  efc353:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax
  efc357:	48 8d 05 82 22 94 00 	lea    rax,[rip+0x942282]        # 183e5e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10578>
  efc35e:	49 89 45 28          	mov    QWORD PTR [r13+0x28],rax
  efc362:	66 41 83 65 50 00    	and    WORD PTR [r13+0x50],0x0
  efc368:	4d 89 65 58          	mov    QWORD PTR [r13+0x58],r12
  efc36c:	4d 89 75 60          	mov    QWORD PTR [r13+0x60],r14
  efc370:	4d 89 7d 68          	mov    QWORD PTR [r13+0x68],r15
  efc374:	66 0f 6f 84 24 f0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xf0]
  efc37b:	00 00 
  efc37d:	66 41 0f 7f 45 70    	movdqa XMMWORD PTR [r13+0x70],xmm0
  efc383:	66 49 0f 3a 16 c7 01 	pextrq r15,xmm0,0x1
  efc38a:	4d 85 ff             	test   r15,r15
  efc38d:	74 05                	je     efc394 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc37aa>
  efc38f:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
  efc394:	49 89 9d 80 00 00 00 	mov    QWORD PTR [r13+0x80],rbx
  efc39b:	48 8b 84 24 80 00 00 	mov    rax,QWORD PTR [rsp+0x80]
  efc3a2:	00 
  efc3a3:	49 89 85 88 00 00 00 	mov    QWORD PTR [r13+0x88],rax
  efc3aa:	49 89 ad 90 00 00 00 	mov    QWORD PTR [r13+0x90],rbp
  efc3b1:	31 c0                	xor    eax,eax
  efc3b3:	41 88 85 b0 00 00 00 	mov    BYTE PTR [r13+0xb0],al
  efc3ba:	41 88 85 b4 00 00 00 	mov    BYTE PTR [r13+0xb4],al
  efc3c1:	41 88 85 b8 00 00 00 	mov    BYTE PTR [r13+0xb8],al
  efc3c8:	41 88 85 d0 00 00 00 	mov    BYTE PTR [r13+0xd0],al
  efc3cf:	41 88 85 d8 00 00 00 	mov    BYTE PTR [r13+0xd8],al
  efc3d6:	41 88 85 e0 00 00 00 	mov    BYTE PTR [r13+0xe0],al
  efc3dd:	41 88 85 f8 00 00 00 	mov    BYTE PTR [r13+0xf8],al
  efc3e4:	41 88 85 00 01 00 00 	mov    BYTE PTR [r13+0x100],al
  efc3eb:	41 88 85 18 01 00 00 	mov    BYTE PTR [r13+0x118],al
  efc3f2:	41 88 85 20 01 00 00 	mov    BYTE PTR [r13+0x120],al
  efc3f9:	41 88 85 28 01 00 00 	mov    BYTE PTR [r13+0x128],al
  efc400:	41 88 85 18 02 00 00 	mov    BYTE PTR [r13+0x218],al
  efc407:	41 88 85 20 02 00 00 	mov    BYTE PTR [r13+0x220],al
  efc40e:	41 88 85 10 03 00 00 	mov    BYTE PTR [r13+0x310],al
  efc415:	41 88 85 18 03 00 00 	mov    BYTE PTR [r13+0x318],al
  efc41c:	41 88 85 08 04 00 00 	mov    BYTE PTR [r13+0x408],al
  efc423:	41 88 85 10 04 00 00 	mov    BYTE PTR [r13+0x410],al
  efc42a:	41 88 85 60 04 00 00 	mov    BYTE PTR [r13+0x460],al
  efc431:	66 41 83 a5 68 04 00 	and    WORD PTR [r13+0x468],0x0
  efc438:	00 00 
  efc43a:	41 88 85 6a 04 00 00 	mov    BYTE PTR [r13+0x46a],al
  efc441:	66 0f ef c0          	pxor   xmm0,xmm0
  efc445:	f3 41 0f 7f 85 98 00 	movdqu XMMWORD PTR [r13+0x98],xmm0
  efc44c:	00 00 
  efc44e:	49 83 a5 a5 00 00 00 	and    QWORD PTR [r13+0xa5],0x0
  efc455:	00 
  efc456:	48 8d 35 ff 13 47 ff 	lea    rsi,[rip+0xffffffffff4713ff]        # 36d85c <_ZTSSt12bad_any_cast@@Base-0x2296c>
  efc45d:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
  efc464:	00 
  efc465:	e8 14 d6 b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  efc46a:	48 8d 35 36 dc 44 ff 	lea    rsi,[rip+0xffffffffff44dc36]        # 34a0a7 <_ZTSSt12bad_any_cast@@Base-0x46121>
  efc471:	48 8d bc 24 20 02 00 	lea    rdi,[rsp+0x220]
  efc478:	00 
  efc479:	e8 00 d6 b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  efc47e:	49 8d bd 70 04 00 00 	lea    rdi,[r13+0x470]
  efc485:	48 8d b4 24 e0 06 00 	lea    rsi,[rsp+0x6e0]
  efc48c:	00 
  efc48d:	48 8d 94 24 20 02 00 	lea    rdx,[rsp+0x220]
  efc494:	00 
  efc495:	e8 14 2e 0e 00       	call   fdf2ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a66c4>
  efc49a:	49 8d 5d 20          	lea    rbx,[r13+0x20]
  efc49e:	48 8d bc 24 20 02 00 	lea    rdi,[rsp+0x220]
  efc4a5:	00 
  efc4a6:	e8 e5 19 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  efc4ab:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
  efc4b2:	00 
  efc4b3:	e8 d8 19 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  efc4b8:	45 31 e4             	xor    r12d,r12d
  efc4bb:	45 88 a5 98 04 00 00 	mov    BYTE PTR [r13+0x498],r12b
  efc4c2:	45 88 a5 a0 04 00 00 	mov    BYTE PTR [r13+0x4a0],r12b
  efc4c9:	0f 28 84 24 e0 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x1e0]
  efc4d0:	00 
  efc4d1:	41 0f 11 85 a8 04 00 	movups XMMWORD PTR [r13+0x4a8],xmm0
  efc4d8:	00 
  efc4d9:	4c 89 ef             	mov    rdi,r13
  efc4dc:	48 81 c7 c0 04 00 00 	add    rdi,0x4c0
  efc4e3:	4c 8d b4 24 10 07 00 	lea    r14,[rsp+0x710]
  efc4ea:	00 
  efc4eb:	4c 89 f6             	mov    rsi,r14
  efc4ee:	e8 05 cd c8 ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
  efc4f3:	45 88 a5 f0 04 00 00 	mov    BYTE PTR [r13+0x4f0],r12b
  efc4fa:	45 88 a5 40 05 00 00 	mov    BYTE PTR [r13+0x540],r12b
  efc501:	8a 84 24 00 01 00 00 	mov    al,BYTE PTR [rsp+0x100]
  efc508:	41 88 85 48 05 00 00 	mov    BYTE PTR [r13+0x548],al
  efc50f:	31 ff                	xor    edi,edi
  efc511:	e8 70 1f ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efc516:	4c 89 ff             	mov    rdi,r15
  efc519:	e8 68 1f ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efc51e:	4c 89 f7             	mov    rdi,r14
  efc521:	e8 44 da b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  efc526:	4c 8d b4 24 80 01 00 	lea    r14,[rsp+0x180]
  efc52d:	00 
  efc52e:	4c 89 f7             	mov    rdi,r14
  efc531:	48 89 de             	mov    rsi,rbx
  efc534:	4c 89 ea             	mov    rdx,r13
  efc537:	e8 c8 22 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
  efc53c:	31 ff                	xor    edi,edi
  efc53e:	e8 d9 1e ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  efc543:	66 41 0f 6f 06       	movdqa xmm0,XMMWORD PTR [r14]
  efc548:	66 0f ef c9          	pxor   xmm1,xmm1
  efc54c:	66 41 0f 7f 0e       	movdqa XMMWORD PTR [r14],xmm1
  efc551:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
  efc556:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  efc55a:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
  efc560:	e8 21 1f ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efc565:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
  efc569:	e8 18 1f ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efc56e:	48 8d 35 32 db 44 ff 	lea    rsi,[rip+0xffffffffff44db32]        # 34a0a7 <_ZTSSt12bad_any_cast@@Base-0x46121>
  efc575:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
  efc57c:	00 
  efc57d:	e8 fc d4 b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  efc582:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
  efc589:	00 
  efc58a:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
  efc591:	00 
  efc592:	e8 f9 14 f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
  efc597:	48 8b 9c 24 c0 00 00 	mov    rbx,QWORD PTR [rsp+0xc0]
  efc59e:	00 
  efc59f:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
  efc5a6:	00 
  efc5a7:	e8 e4 18 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  efc5ac:	48 8d 35 db e3 48 ff 	lea    rsi,[rip+0xffffffffff48e3db]        # 38a98e <_ZTSSt12bad_any_cast@@Base-0x583a>
  efc5b3:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
  efc5ba:	00 
  efc5bb:	e8 be d4 b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  efc5c0:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
  efc5c7:	00 
  efc5c8:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
  efc5cf:	00 
  efc5d0:	e8 bb 14 f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
  efc5d5:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
  efc5dc:	00 
  efc5dd:	e8 ae 18 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  efc5e2:	48 83 3b 00          	cmp    QWORD PTR [rbx],0x0
  efc5e6:	74 36                	je     efc61e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3a34>
  efc5e8:	48 8d 15 e1 48 47 ff 	lea    rdx,[rip+0xffffffffff4748e1]        # 370ed0 <_ZTSSt12bad_any_cast@@Base-0x1f2f8>
  efc5ef:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
  efc5f6:	00 
  efc5f7:	4c 89 ee             	mov    rsi,r13
  efc5fa:	48 89 d9             	mov    rcx,rbx
  efc5fd:	e8 e9 22 00 00       	call   efe8eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5d01>
  efc602:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
  efc609:	00 
  efc60a:	4c 89 ef             	mov    rdi,r13
  efc60d:	48 89 de             	mov    rsi,rbx
  efc610:	e8 07 d2 bb ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  efc615:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  efc619:	e8 68 1e ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efc61e:	48 8b 5c 24 60       	mov    rbx,QWORD PTR [rsp+0x60]
  efc623:	80 bb b5 01 00 00 00 	cmp    BYTE PTR [rbx+0x1b5],0x0
  efc62a:	0f 84 3d 01 00 00    	je     efc76d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3b83>
  efc630:	4c 8b 7b 10          	mov    r15,QWORD PTR [rbx+0x10]
  efc634:	bf 88 00 00 00       	mov    edi,0x88
  efc639:	e8 c2 18 8f 00       	call   17edf00 <_Znwm@plt>
  efc63e:	49 89 c6             	mov    r14,rax
  efc641:	66 0f ef c0          	pxor   xmm0,xmm0
  efc645:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  efc64a:	48 8d 05 6f e1 93 00 	lea    rax,[rip+0x93e16f]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
  efc651:	49 89 06             	mov    QWORD PTR [r14],rax
  efc654:	0f 10 83 48 03 00 00 	movups xmm0,XMMWORD PTR [rbx+0x348]
  efc65b:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
  efc662:	00 
  efc663:	48 8b 83 50 03 00 00 	mov    rax,QWORD PTR [rbx+0x350]
  efc66a:	48 85 c0             	test   rax,rax
  efc66d:	74 05                	je     efc674 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3a8a>
  efc66f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  efc674:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
  efc67a:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
  efc67e:	48 85 c0             	test   rax,rax
  efc681:	74 05                	je     efc688 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3a9e>
  efc683:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  efc688:	49 8d 5e 18          	lea    rbx,[r14+0x18]
  efc68c:	48 8d 05 35 6f 94 00 	lea    rax,[rip+0x946f35]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
  efc693:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  efc697:	66 0f ef c9          	pxor   xmm1,xmm1
  efc69b:	f3 41 0f 7f 4e 28    	movdqu XMMWORD PTR [r14+0x28],xmm1
  efc6a1:	48 8d 05 30 5b 94 00 	lea    rax,[rip+0x945b30]        # 18421d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14170>
  efc6a8:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
  efc6ac:	f3 41 0f 7f 46 38    	movdqu XMMWORD PTR [r14+0x38],xmm0
  efc6b2:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  efc6b9:	48 85 ff             	test   rdi,rdi
  efc6bc:	74 05                	je     efc6c3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3ad9>
  efc6be:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
  efc6c3:	48 8d 05 36 5b 94 00 	lea    rax,[rip+0x945b36]        # 1842200 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14198>
  efc6ca:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  efc6ce:	48 8d 05 13 5d 94 00 	lea    rax,[rip+0x945d13]        # 18423e8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14380>
  efc6d5:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
  efc6d9:	e8 a8 1d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efc6de:	48 8d 05 db 58 94 00 	lea    rax,[rip+0x9458db]        # 1841fc0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13f58>
  efc6e5:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  efc6e9:	48 8d 05 c0 5a 94 00 	lea    rax,[rip+0x945ac0]        # 18421b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14148>
  efc6f0:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
  efc6f4:	0f 28 84 24 90 00 00 	movaps xmm0,XMMWORD PTR [rsp+0x90]
  efc6fb:	00 
  efc6fc:	41 0f 11 46 48       	movups XMMWORD PTR [r14+0x48],xmm0
  efc701:	4d 89 7e 58          	mov    QWORD PTR [r14+0x58],r15
  efc705:	4c 89 f7             	mov    rdi,r14
  efc708:	48 83 c7 60          	add    rdi,0x60
  efc70c:	e8 e5 d2 8d 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  efc711:	31 c0                	xor    eax,eax
  efc713:	41 88 46 70          	mov    BYTE PTR [r14+0x70],al
  efc717:	41 88 86 80 00 00 00 	mov    BYTE PTR [r14+0x80],al
  efc71e:	31 ff                	xor    edi,edi
  efc720:	e8 61 1d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efc725:	4c 8d bc 24 10 07 00 	lea    r15,[rsp+0x710]
  efc72c:	00 
  efc72d:	4c 89 ff             	mov    rdi,r15
  efc730:	48 89 de             	mov    rsi,rbx
  efc733:	4c 89 f2             	mov    rdx,r14
  efc736:	e8 c9 20 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
  efc73b:	31 ff                	xor    edi,edi
  efc73d:	e8 da 1c ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  efc742:	66 41 0f 6f 07       	movdqa xmm0,XMMWORD PTR [r15]
  efc747:	66 0f ef c9          	pxor   xmm1,xmm1
  efc74b:	66 41 0f 7f 0f       	movdqa XMMWORD PTR [r15],xmm1
  efc750:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  efc754:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
  efc75a:	e8 27 1d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efc75f:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
  efc763:	e8 1e 1d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efc768:	48 8b 5c 24 60       	mov    rbx,QWORD PTR [rsp+0x60]
  efc76d:	80 bb b2 01 00 00 00 	cmp    BYTE PTR [rbx+0x1b2],0x0
  efc774:	0f 84 56 01 00 00    	je     efc8d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3ce6>
  efc77a:	bf 68 01 00 00       	mov    edi,0x168
  efc77f:	e8                   	.byte 0xe8
~~~

## 0xfd4bd0..0xfd4d10 copy path
~~~asm

/tmp/saoraw/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000fd4bd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bfe6>:
  fd4bd0:	e8 db ae 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd4bd5:	48 89 c7             	mov    rdi,rax
  fd4bd8:	e8 c8 4e aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd4bdd:	cc                   	int3
  fd4bde:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
  fd4be2:	e9 ff fb ff ff       	jmp    fd47e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bbfc>
  fd4be7:	cc                   	int3
  fd4be8:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
  fd4bec:	e9 37 fc ff ff       	jmp    fd4828 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bc3e>
  fd4bf1:	cc                   	int3
  fd4bf2:	53                   	push   rbx
  fd4bf3:	48 89 fb             	mov    rbx,rdi
  fd4bf6:	48 83 c6 f8          	add    rsi,0xfffffffffffffff8
  fd4bfa:	e8 93 fe ff ff       	call   fd4a92 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bea8>
  fd4bff:	48 89 d8             	mov    rax,rbx
  fd4c02:	5b                   	pop    rbx
  fd4c03:	c3                   	ret
  fd4c04:	41 56                	push   r14
  fd4c06:	53                   	push   rbx
  fd4c07:	50                   	push   rax
  fd4c08:	48 89 fb             	mov    rbx,rdi
  fd4c0b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fd4c0e:	48 85 c0             	test   rax,rax
  fd4c11:	74 21                	je     fd4c34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c04a>
  fd4c13:	84 d2                	test   dl,dl
  fd4c15:	74 1d                	je     fd4c34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c04a>
  fd4c17:	48 89 03             	mov    QWORD PTR [rbx],rax
  fd4c1a:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
  fd4c1e:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
  fd4c22:	48 85 c0             	test   rax,rax
  fd4c25:	74 05                	je     fd4c2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c042>
  fd4c27:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  fd4c2c:	48 83 c4 08          	add    rsp,0x8
  fd4c30:	5b                   	pop    rbx
  fd4c31:	41 5e                	pop    r14
  fd4c33:	c3                   	ret
  fd4c34:	4c 8b 76 10          	mov    r14,QWORD PTR [rsi+0x10]
  fd4c38:	bf 88 00 00 00       	mov    edi,0x88
  fd4c3d:	e8 be 92 81 00       	call   17edf00 <_Znwm@plt>
  fd4c42:	48 89 c2             	mov    rdx,rax
  fd4c45:	0f 57 c0             	xorps  xmm0,xmm0
  fd4c48:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  fd4c4c:	48 8d 0d 6d 5b 86 00 	lea    rcx,[rip+0x865b6d]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
  fd4c53:	48 89 08             	mov    QWORD PTR [rax],rcx
  fd4c56:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
  fd4c5a:	49 8b 4e 20          	mov    rcx,QWORD PTR [r14+0x20]
  fd4c5e:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
  fd4c62:	49 8b 4e 28          	mov    rcx,QWORD PTR [r14+0x28]
  fd4c66:	48 89 48 40          	mov    QWORD PTR [rax+0x40],rcx
  fd4c6a:	48 85 c9             	test   rcx,rcx
  fd4c6d:	74 05                	je     fd4c74 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c08a>
  fd4c6f:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  fd4c74:	48 8d 0d 45 d3 86 00 	lea    rcx,[rip+0x86d345]        # 1841fc0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13f58>
  fd4c7b:	48 89 4a 18          	mov    QWORD PTR [rdx+0x18],rcx
  fd4c7f:	48 8d 0d 2a d5 86 00 	lea    rcx,[rip+0x86d52a]        # 18421b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14148>
  fd4c86:	48 89 4a 20          	mov    QWORD PTR [rdx+0x20],rcx
  fd4c8a:	49 8b 4e 30          	mov    rcx,QWORD PTR [r14+0x30]
  fd4c8e:	48 89 4a 48          	mov    QWORD PTR [rdx+0x48],rcx
  fd4c92:	49 8b 4e 38          	mov    rcx,QWORD PTR [r14+0x38]
  fd4c96:	48 89 4a 50          	mov    QWORD PTR [rdx+0x50],rcx
  fd4c9a:	48 85 c9             	test   rcx,rcx
  fd4c9d:	74 05                	je     fd4ca4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c0ba>
  fd4c9f:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  fd4ca4:	48 83 c0 18          	add    rax,0x18
  fd4ca8:	49 8b 4e 40          	mov    rcx,QWORD PTR [r14+0x40]
  fd4cac:	48 89 4a 58          	mov    QWORD PTR [rdx+0x58],rcx
  fd4cb0:	49 8b 4e 48          	mov    rcx,QWORD PTR [r14+0x48]
  fd4cb4:	48 89 4a 60          	mov    QWORD PTR [rdx+0x60],rcx
  fd4cb8:	49 8b 4e 50          	mov    rcx,QWORD PTR [r14+0x50]
  fd4cbc:	48 89 4a 68          	mov    QWORD PTR [rdx+0x68],rcx
  fd4cc0:	48 85 c9             	test   rcx,rcx
  fd4cc3:	74 05                	je     fd4cca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c0e0>
  fd4cc5:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  fd4cca:	49 8b 4e 68          	mov    rcx,QWORD PTR [r14+0x68]
  fd4cce:	48 89 8a 80 00 00 00 	mov    QWORD PTR [rdx+0x80],rcx
  fd4cd5:	41 0f 10 46 58       	movups xmm0,XMMWORD PTR [r14+0x58]
  fd4cda:	0f 11 42 70          	movups XMMWORD PTR [rdx+0x70],xmm0
  fd4cde:	48 89 df             	mov    rdi,rbx
  fd4ce1:	48 89 c6             	mov    rsi,rax
  fd4ce4:	e8 1b 9b f2 ff       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
  fd4ce9:	31 ff                	xor    edi,edi
  fd4ceb:	48 83 c4 08          	add    rsp,0x8
  fd4cef:	5b                   	pop    rbx
  fd4cf0:	41 5e                	pop    r14
  fd4cf2:	e9 25 97 ac ff       	jmp    a9e41c <JNI_OnUnload@@Base+0x25ce9>
  fd4cf7:	48 89 c7             	mov    rdi,rax
  fd4cfa:	e8 a6 4d aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd4cff:	cc                   	int3
  fd4d00:	41 57                	push   r15
  fd4d02:	41 56                	push   r14
  fd4d04:	41 55                	push   r13
  fd4d06:	41 54                	push   r12
  fd4d08:	53                   	push   rbx
  fd4d09:	48 83 ec 40          	sub    rsp,0x40
  fd4d0d:	49 89 f7             	mov    r15,rsi
~~~

## Signal string bytes
 33c93e automix-preview
 34708a skip-ad
 387721 switch-to-audio
 387742 switch-to-video
