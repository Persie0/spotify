# Verify readiness receiver final vptr

r15 = allocation base+0x20 before f419b4; published at efc701.


/tmp/finalvptr/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000efb780 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2b96>:
  efb780:	40 02 00             	rex add al,BYTE PTR [rax]
  efb783:	00 48 8d             	add    BYTE PTR [rax-0x73],cl
  efb786:	b4 24                	mov    ah,0x24
  efb788:	c0 0a 00             	ror    BYTE PTR [rdx],0x0
  efb78b:	00 e8                	add    al,ch
  efb78d:	ff                   	jmp    (bad)
  efb78e:	ea                   	(bad)
  efb78f:	b7 ff                	mov    bh,0xff
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
  efb7bd:	48 8d b4 24 40 02 00 	lea    rsi,[rsp+0x240]
  efb7c4:	00 
  efb7c5:	e8 de 30 00 00       	call   efe8a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5cbe>
  efb7ca:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
  efb7d1:	00 
  efb7d2:	48 89 5e 20          	mov    QWORD PTR [rsi+0x20],rbx
  efb7d6:	4c 89 ff             	mov    rdi,r15
  efb7d9:	0f 28 84 24 a0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xa0]
  efb7e0:	00 
  efb7e1:	e8 ce 61 04 00       	call   f419b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108dca>
  efb7e6:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
  efb7ed:	00 
  efb7ee:	48 89 df             	mov    rdi,rbx
  efb7f1:	e8 74 e7 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  efb7f6:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
  efb7fd:	00 
  efb7fe:	e8 67 e7 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  efb803:	66 0f 6f 84 24 a0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xa0]
  efb80a:	00 00 
  efb80c:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  efb813:	e8 6e 2c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efb818:	4c 8d a4 24 e0 06 00 	lea    r12,[rsp+0x6e0]
  efb81f:	00 
  efb820:	4c 89 e7             	mov    rdi,r12
  efb823:	4c 89 fe             	mov    rsi,r15
  efb826:	4c 89 f2             	mov    rdx,r14
  efb829:	e8 d6 2f 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
  efb82e:	31 ff                	xor    edi,edi
  efb830:	e8 e7 2b ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  efb835:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
  efb83c:	00 
  efb83d:	4c 89 e6             	mov    rsi,r12
  efb840:	e8 d7 df bb ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  efb845:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
  efb84a:	e8 37 2c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efb84f:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
  efb856:	00 
  efb857:	e8 e2 5a 7d 00       	call   16d133e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x854aa>
  efb85c:	c6 03 10             	mov    BYTE PTR [rbx],0x10
  efb85f:	49 be 61 75 74 6f 70 	movabs r14,0x79616c706f747561
  efb866:	6c 61 79 
  efb869:	4c 89 73 01          	mov    QWORD PTR [rbx+0x1],r14
  efb86d:	c6 43 09 00          	mov    BYTE PTR [rbx+0x9],0x0
  efb871:	48 8d bc 24 18 03 00 	lea    rdi,[rsp+0x318]
  efb878:	00 
  efb879:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
  efb880:	00 
  efb881:	e8 0a 22 f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
  efb886:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
  efb88d:	00 
  efb88e:	48 89 df             	mov    rdi,rbx
  efb891:	e8 fa 25 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  efb896:	c6 03 10             	mov    BYTE PTR [rbx],0x10
  efb899:	4c 89 73 01          	mov    QWORD PTR [rbx+0x1],r14
  efb89d:	c6 43 09 00          	mov    BYTE PTR [rbx+0x9],0x0
  efb8a1:	48 8d bc 24 30 03 00 	lea    rdi,[rsp+0x330]
  efb8a8:	00 
  efb8a9:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
  efb8b0:	00 
  efb8b1:	e8 da 21 f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
  efb8b6:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
  efb8bd:	00 
  efb8be:	48 89 df             	mov    rdi,rbx
  efb8c1:	e8 ca 25 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  efb8c6:	c6 03 10             	mov    BYTE PTR [rbx],0x10
  efb8c9:	4c 89 73 01          	mov    QWORD PTR [rbx+0x1],r14
  efb8cd:	c6 43 09 00          	mov    BYTE PTR [rbx+0x9],0x0
  efb8d1:	48 8d bc 24 48 03 00 	lea    rdi,[rsp+0x348]
  efb8d8:	00 
  efb8d9:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
  efb8e0:	00 
  efb8e1:	e8 aa 21 f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
  efb8e6:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
  efb8ed:	00 
  efb8ee:	e8 9d 25 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  efb8f3:	bf f8 03 00 00       	mov    edi,0x3f8
  efb8f8:	e8 03 26 8f 00       	call   17edf00 <_Znwm@plt>
  efb8fd:	49 89 c6             	mov    r14,rax
  efb900:	66 0f ef c0          	pxor   xmm0,xmm0
  efb904:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  efb909:	48 8d 05 b0 ee 93 00 	lea    rax,[rip+0x93eeb0]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
  efb910:	49 89 06             	mov    QWORD PTR [r14],rax
  efb913:	0f 28 84 24 90 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x190]
  efb91a:	00 
  efb91b:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
  efb922:	00 
  efb923:	48 8b 9c 24 98 01 00 	mov    rbx,QWORD PTR [rsp+0x198]
  efb92a:	00 
  efb92b:	48 85 db             	test   rbx,rbx
  efb92e:	74 05                	je     efb935 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2d4b>
  efb930:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  efb935:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
  efb93c:	00 
  efb93d:	48 8d b4 24 40 02 00 	lea    rsi,[rsp+0x240]
  efb944:	00 
  efb945:	e8 e8 5c 7d 00       	call   16d1632 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8579e>
  efb94a:	48 85 db             	test   rbx,rbx
  efb94d:	74 05                	je     efb954 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2d6a>
  efb94f:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  efb954:	49 8d 5e 18          	lea    rbx,[r14+0x18]
  efb958:	48 8d 05 69 7c 94 00 	lea    rax,[rip+0x947c69]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
  efb95f:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  efb963:	66 0f ef c9          	pxor   xmm1,xmm1
  efb967:	0f 57 c0             	xorps  xmm0,xmm0
  efb96a:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
  efb971:	00 
  efb972:	f3 41 0f 7f 4e 28    	movdqu XMMWORD PTR [r14+0x28],xmm1
  efb978:	48 8d 05 c9 4c 94 00 	lea    rax,[rip+0x944cc9]        # 1840648 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x125e0>
  efb97f:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
  efb983:	66 0f 6f 84 24 a0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xa0]
  efb98a:	00 00 
  efb98c:	f3 41 0f 7f 46 38    	movdqu XMMWORD PTR [r14+0x38],xmm0
  efb992:	66 49 0f 3a 16 c7 01 	pextrq r15,xmm0,0x1
  efb999:	4d 85 ff             	test   r15,r15
  efb99c:	74 05                	je     efb9a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2db9>
  efb99e:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
  efb9a3:	48 8d 05 c6 4c 94 00 	lea    rax,[rip+0x944cc6]        # 1840670 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x12608>
  efb9aa:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  efb9ae:	48 8d 05 ab 4c 94 00 	lea    rax,[rip+0x944cab]        # 1840660 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x125f8>
  efb9b5:	41 bc f8 01 00 00    	mov    r12d,0x1f8
  efb9bb:	4c 01 e0             	add    rax,r12
  efb9be:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
  efb9c2:	4c 89 ff             	mov    rdi,r15
  efb9c5:	e8 bc 2a ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efb9ca:	48 8d 05 67 4a 94 00 	lea    rax,[rip+0x944a67]        # 1840438 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x123d0>
  efb9d1:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  efb9d5:	48 8d 05 4c 4a 94 00 	lea    rax,[rip+0x944a4c]        # 1840428 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x123c0>
  efb9dc:	4c 01 e0             	add    rax,r12
  efb9df:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
  efb9e3:	4c 89 f7             	mov    rdi,r14
  efb9e6:	48 83 c7 48          	add    rdi,0x48
  efb9ea:	4c 8d a4 24 10 07 00 	lea    r12,[rsp+0x710]
  efb9f1:	00 
  efb9f2:	4c 89 e6             	mov    rsi,r12
  efb9f5:	e8 38 5c 7d 00       	call   16d1632 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8579e>
  efb9fa:	4c 89 e7             	mov    rdi,r12
  efb9fd:	e8 2a 61 7d 00       	call   16d1b2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85c98>
  efba02:	4c 89 ff             	mov    rdi,r15
  efba05:	e8 7c 2a ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efba0a:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
  efba11:	00 
  efba12:	48 89 de             	mov    rsi,rbx
  efba15:	4c 89 f2             	mov    rdx,r14
  efba18:	e8 e7 2d 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
  efba1d:	31 ff                	xor    edi,edi
  efba1f:	e8 f8 29 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  efba24:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
  efba29:	80 b8 e0 01 00 00 00 	cmp    BYTE PTR [rax+0x1e0],0x0
  efba30:	4c 8b bc 24 20 01 00 	mov    r15,QWORD PTR [rsp+0x120]
  efba37:	00 
  efba38:	74 27                	je     efba61 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2e77>
  efba3a:	66 0f 6f 80 00 03 00 	movdqa xmm0,XMMWORD PTR [rax+0x300]
  efba41:	00 
  efba42:	66 0f 7f 84 24 80 00 	movdqa XMMWORD PTR [rsp+0x80],xmm0
  efba49:	00 00 
  efba4b:	48 8b 80 08 03 00 00 	mov    rax,QWORD PTR [rax+0x308]
  efba52:	48 85 c0             	test   rax,rax
  efba55:	74 05                	je     efba5c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2e72>
  efba57:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  efba5c:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
  efba61:	0f 28 80 f0 02 00 00 	movaps xmm0,XMMWORD PTR [rax+0x2f0]
  efba68:	0f 29 84 24 f0 00 00 	movaps XMMWORD PTR [rsp+0xf0],xmm0
  efba6f:	00 
  efba70:	48 8b 80 f8 02 00 00 	mov    rax,QWORD PTR [rax+0x2f8]
  efba77:	48 85 c0             	test   rax,rax
  efba7a:	74 05                	je     efba81 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2e97>
  efba7c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  efba81:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
  efba86:	4c 8b 60 10          	mov    r12,QWORD PTR [rax+0x10]
  efba8a:	40 8a a8 f6 01 00 00 	mov    bpl,BYTE PTR [rax+0x1f6]
  efba91:	bf d0 00 00 00       	mov    edi,0xd0
  efba96:	e8 65 24 8f 00       	call   17edf00 <_Znwm@plt>
  efba9b:	49 89 c6             	mov    r14,rax
  efba9e:	49 89 c5             	mov    r13,rax
  efbaa1:	0f 57 c0             	xorps  xmm0,xmm0
  efbaa4:	41 0f 11 46 08       	movups XMMWORD PTR [r14+0x8],xmm0
  efbaa9:	48 8d 05 18 f3 90 00 	lea    rax,[rip+0x90f318]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
  efbab0:	49 89 06             	mov    QWORD PTR [r14],rax
  efbab3:	48 8d 05 86 7d 94 00 	lea    rax,[rip+0x947d86]        # 1843840 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x157d8>
  efbaba:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
  efbabe:	49 8d 5e 30          	lea    rbx,[r14+0x30]
  efbac2:	48 89 df             	mov    rdi,rbx
  efbac5:	4c 89 fe             	mov    rsi,r15
  efbac8:	4c 89 b4 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r14
  efbacf:	00 
  efbad0:	e8 bb e7 b7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  efbad5:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
  efbada:	48 8d 71 70          	lea    rsi,[rcx+0x70]
  efbade:	48 8b 81 58 01 00 00 	mov    rax,QWORD PTR [rcx+0x158]
  efbae5:	0f 28 81 50 01 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x150]
  efbaec:	41 0f 29 45 60       	movaps XMMWORD PTR [r13+0x60],xmm0
  efbaf1:	48 85 c0             	test   rax,rax
  efbaf4:	74 05                	je     efbafb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2f11>
  efbaf6:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  efbafb:	49 8d 7e 70          	lea    rdi,[r14+0x70]
  efbaff:	e8 8c e7 b7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  efbb04:	66 0f 6f 84 24 80 00 	movdqa xmm0,XMMWORD PTR [rsp+0x80]
  efbb0b:	00 00 
  efbb0d:	66 41 0f 7f 85 a0 00 	movdqa XMMWORD PTR [r13+0xa0],xmm0
  efbb14:	00 00 
  efbb16:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
  efbb1d:	48 85 db             	test   rbx,rbx
  efbb20:	74 05                	je     efbb27 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2f3d>
  efbb22:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  efbb27:	66 0f 6f 84 24 f0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xf0]
  efbb2e:	00 00 
  efbb30:	66 41 0f 7f 85 b0 00 	movdqa XMMWORD PTR [r13+0xb0],xmm0
  efbb37:	00 00 
  efbb39:	66 49 0f 3a 16 c7 01 	pextrq r15,xmm0,0x1
  efbb40:	4d 85 ff             	test   r15,r15
  efbb43:	74 05                	je     efbb4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2f60>
  efbb45:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
  efbb4a:	4d 89 a5 c0 00 00 00 	mov    QWORD PTR [r13+0xc0],r12
  efbb51:	41 88 ad c8 00 00 00 	mov    BYTE PTR [r13+0xc8],bpl
  efbb58:	31 ff                	xor    edi,edi
  efbb5a:	e8 bd 28 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  efbb5f:	4c 89 ff             	mov    rdi,r15
  efbb62:	e8 1f 29 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efbb67:	48 89 df             	mov    rdi,rbx
  efbb6a:	e8 17 29 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efbb6f:	bf 38 01 00 00       	mov    edi,0x138
  efbb74:	e8 87 23 8f 00       	call   17edf00 <_Znwm@plt>
  efbb79:	49 89 c7             	mov    r15,rax
  efbb7c:	49 89 c5             	mov    r13,rax
  efbb7f:	66 0f ef c0          	pxor   xmm0,xmm0
  efbb83:	f3 41 0f 7f 47 08    	movdqu XMMWORD PTR [r15+0x8],xmm0
  efbb89:	48 8d 05 30 ec 93 00 	lea    rax,[rip+0x93ec30]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
  efbb90:	49 89 07             	mov    QWORD PTR [r15],rax
  efbb93:	0f 28 84 24 d0 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x1d0]
  efbb9a:	00 
  efbb9b:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
  efbba2:	00 
  efbba3:	48 8b 84 24 d8 01 00 	mov    rax,QWORD PTR [rsp+0x1d8]
  efbbaa:	00 
  efbbab:	48 85 c0             	test   rax,rax
  efbbae:	74 05                	je     efbbb5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2fcb>
  efbbb0:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  efbbb5:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
  efbbba:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
  efbbbe:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
  efbbc2:	48 85 c0             	test   rax,rax
  efbbc5:	74 05                	je     efbbcc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2fe2>
  efbbc7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  efbbcc:	48 8d 05 f5 79 94 00 	lea    rax,[rip+0x9479f5]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
  efbbd3:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
  efbbd7:	66 0f ef c9          	pxor   xmm1,xmm1
  efbbdb:	f3 41 0f 7f 4d 28    	movdqu XMMWORD PTR [r13+0x28],xmm1
  efbbe1:	48 8d 05 88 fb 93 00 	lea    rax,[rip+0x93fb88]        # 183b770 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd708>
  efbbe8:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax
  efbbec:	f3 41 0f 7f 45 38    	movdqu XMMWORD PTR [r13+0x38],xmm0
  efbbf2:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  efbbf9:	48 85 ff             	test   rdi,rdi
  efbbfc:	74 05                	je     efbc03 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3019>
  efbbfe:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
  efbc03:	49 83 c6 20          	add    r14,0x20
  efbc07:	49 83 c7 18          	add    r15,0x18
  efbc0b:	48 8d 05 86 fb 93 00 	lea    rax,[rip+0x93fb86]        # 183b798 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd730>
  efbc12:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
  efbc16:	48 8d 05 63 fd 93 00 	lea    rax,[rip+0x93fd63]        # 183b980 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd918>
  efbc1d:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax
  efbc21:	e8 60 28 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efbc26:	48 8d 05 2b f9 93 00 	lea    rax,[rip+0x93f92b]        # 183b558 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd4f0>
  efbc2d:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
  efbc31:	48 8d 05 10 fb 93 00 	lea    rax,[rip+0x93fb10]        # 183b748 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd6e0>
  efbc38:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax
  efbc3c:	66 0f 6f 84 24 80 00 	movdqa xmm0,XMMWORD PTR [rsp+0x80]
  efbc43:	00 00 
  efbc45:	f3 41 0f 7f 45 48    	movdqu XMMWORD PTR [r13+0x48],xmm0
  efbc4b:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
  efbc52:	48 85 db             	test   rbx,rbx
  efbc55:	74 05                	je     efbc5c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3072>
  efbc57:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  efbc5c:	66 41 83 65 58 00    	and    WORD PTR [r13+0x58],0x0
  efbc62:	31 c0                	xor    eax,eax
  efbc64:	41 88 45 60          	mov    BYTE PTR [r13+0x60],al
  efbc68:	41 88 45 68          	mov    BYTE PTR [r13+0x68],al
  efbc6c:	41 88 45 70          	mov    BYTE PTR [r13+0x70],al
  efbc70:	41 88 45 78          	mov    BYTE PTR [r13+0x78],al
  efbc74:	66 0f ef c0          	pxor   xmm0,xmm0
  efbc78:	f3 41 0f 7f 85 e8 00 	movdqu XMMWORD PTR [r13+0xe8],xmm0
  efbc7f:	00 00 
  efbc81:	41 88 85 f8 00 00 00 	mov    BYTE PTR [r13+0xf8],al
  efbc88:	f3 41 0f 7f 85 80 00 	movdqu XMMWORD PTR [r13+0x80],xmm0
  efbc8f:	00 00 
  efbc91:	f3 41 0f 7f 85 90 00 	movdqu XMMWORD PTR [r13+0x90],xmm0
  efbc98:	00 00 
  efbc9a:	f3 41 0f 7f 85 a0 00 	movdqu XMMWORD PTR [r13+0xa0],xmm0
  efbca1:	00 00 
  efbca3:	f3 41 0f 7f 85 b0 00 	movdqu XMMWORD PTR [r13+0xb0],xmm0
  efbcaa:	00 00 
  efbcac:	66 41 83 a5 e0 00 00 	and    WORD PTR [r13+0xe0],0x0
  efbcb3:	00 00 
  efbcb5:	f3 41 0f 7f 85 c0 00 	movdqu XMMWORD PTR [r13+0xc0],xmm0
  efbcbc:	00 00 
  efbcbe:	f3 41 0f 7f 85 d0 00 	movdqu XMMWORD PTR [r13+0xd0],xmm0
  efbcc5:	00 00 
  efbcc7:	f3 41 0f 7f 85 00 01 	movdqu XMMWORD PTR [r13+0x100],xmm0
  efbcce:	00 00 
  efbcd0:	4d 89 b5 10 01 00 00 	mov    QWORD PTR [r13+0x110],r14
  efbcd7:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
  efbcde:	00 
  efbcdf:	49 89 85 18 01 00 00 	mov    QWORD PTR [r13+0x118],rax
  efbce6:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  efbceb:	f3 41 0f 7f 85 20 01 	movdqu XMMWORD PTR [r13+0x120],xmm0
  efbcf2:	00 00 
  efbcf4:	66 41 83 a5 30 01 00 	and    WORD PTR [r13+0x130],0x0
  efbcfb:	00 00 
  efbcfd:	31 ff                	xor    edi,edi
  efbcff:	e8 82 27 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efbd04:	48 89 df             	mov    rdi,rbx
  efbd07:	e8 7a 27 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efbd0c:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
  efbd13:	00 
  efbd14:	48 89 df             	mov    rdi,rbx
  efbd17:	4c 89 fe             	mov    rsi,r15
  efbd1a:	4c 89 ea             	mov    rdx,r13
  efbd1d:	e8 e2 2a 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
  efbd22:	31 ff                	xor    edi,edi
  efbd24:	e8 f3 26 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  efbd29:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
  efbd2d:	66 0f ef c9          	pxor   xmm1,xmm1
  efbd31:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
  efbd35:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
  efbd3a:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  efbd3e:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
  efbd44:	e8 3d 27 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efbd49:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  efbd4d:	e8 34 27 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efbd52:	48 8d 35 71 46 43 ff 	lea    rsi,[rip+0xffffffffff434671]        # 3303ca <_ZTSSt12bad_any_cast@@Base-0x5fdfe>
  efbd59:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
  efbd60:	00 
  efbd61:	e8 18 dd b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  efbd66:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
  efbd6d:	00 
  efbd6e:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
  efbd75:	00 
  efbd76:	e8 15 1d f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
  efbd7b:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
  efbd82:	00 
  efbd83:	e8 08 21 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  efbd88:	48 8d 35 8b 1a 47 ff 	lea    rsi,[rip+0xffffffffff471a8b]        # 36d81a <_ZTSSt12bad_any_cast@@Base-0x229ae>
  efbd8f:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
  efbd96:	00 
  efbd97:	e8 e2 dc b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  efbd9c:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
  efbda3:	00 
  efbda4:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
  efbdab:	00 
  efbdac:	e8 df 1c f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
  efbdb1:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
  efbdb8:	00 
  efbdb9:	e8 d2 20 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  efbdbe:	bf b8 01 00 00       	mov    edi,0x1b8
  efbdc3:	e8 38 21 8f 00       	call   17edf00 <_Znwm@plt>
  efbdc8:	49 89 c6             	mov    r14,rax
  efbdcb:	66 0f ef c9          	pxor   xmm1,xmm1
  efbdcf:	f3 0f 7f 48 08       	movdqu XMMWORD PTR [rax+0x8],xmm1
  efbdd4:	48 8d 05 e5 e9 93 00 	lea    rax,[rip+0x93e9e5]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
  efbddb:	49 89 06             	mov    QWORD PTR [r14],rax
  efbdde:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
  efbde4:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
  efbde8:	48 85 c0             	test   rax,rax
  efbdeb:	74 05                	je     efbdf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3208>
  efbded:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  efbdf2:	48 8d 05 cf 77 94 00 	lea    rax,[rip+0x9477cf]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
  efbdf9:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  efbdfd:	f3 41 0f 7f 4e 28    	movdqu XMMWORD PTR [r14+0x28],xmm1
  efbe03:	48 8d 05 f6 2c 94 00 	lea    rax,[rip+0x942cf6]        # 183eb00 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10a98>
  efbe0a:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
  efbe0e:	f3 41 0f 7f 46 38    	movdqu XMMWORD PTR [r14+0x38],xmm0
  efbe14:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  efbe1b:	48 85 ff             	test   rdi,rdi
  efbe1e:	74 05                	je     efbe25 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc323b>
  efbe20:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
  efbe25:	48 8d 05 fc 2c 94 00 	lea    rax,[rip+0x942cfc]        # 183eb28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10ac0>
  efbe2c:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  efbe30:	48 8d 05 d9 2e 94 00 	lea    rax,[rip+0x942ed9]        # 183ed10 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10ca8>
  efbe37:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
  efbe3b:	e8 46 26 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efbe40:	48 8d 05 a1 2a 94 00 	lea    rax,[rip+0x942aa1]        # 183e8e8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10880>
  efbe47:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  efbe4b:	48 8d 05 86 2c 94 00 	lea    rax,[rip+0x942c86]        # 183ead8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10a70>
  efbe52:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
  efbe56:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
  efbe5b:	48 8b 81 18 03 00 00 	mov    rax,QWORD PTR [rcx+0x318]
  efbe62:	66 0f 6f 81 10 03 00 	movdqa xmm0,XMMWORD PTR [rcx+0x310]
  efbe69:	00 
  efbe6a:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0
  efbe70:	48 85 c0             	test   rax,rax
  efbe73:	74 05                	je     efbe7a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3290>
  efbe75:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  efbe7a:	48 8d 35 76 f9 42 ff 	lea    rsi,[rip+0xffffffffff42f976]        # 32b7f7 <_ZTSSt12bad_any_cast@@Base-0x649d1>
  efbe81:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
  efbe88:	00 
  efbe89:	e8 f0 db b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  efbe8e:	48 8d 35 93 c4 44 ff 	lea    rsi,[rip+0xffffffffff44c493]        # 348328 <_ZTSSt12bad_any_cast@@Base-0x47ea0>
  efbe95:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
  efbe9c:	00 
  efbe9d:	e8 dc db b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  efbea2:	49 8d 7e 58          	lea    rdi,[r14+0x58]
  efbea6:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
  efbead:	00 
  efbeae:	48 8d 94 24 e0 06 00 	lea    rdx,[rsp+0x6e0]
  efbeb5:	00 
  efbeb6:	e8 f3 33 0e 00       	call   fdf2ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a66c4>
  efbebb:	4c 89 f3             	mov    rbx,r14
  efbebe:	48 83 c3 18          	add    rbx,0x18
  efbec2:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
  efbec9:	00 
  efbeca:	e8 c1 1f 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  efbecf:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
  efbed6:	00 
  efbed7:	e8 b4 1f 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  efbedc:	31 c0                	xor    eax,eax
  efbede:	41 88 86 a0 01 00 00 	mov    BYTE PTR [r14+0x1a0],al
  efbee5:	66 0f ef c0          	pxor   xmm0,xmm0
  efbee9:	f3 41 0f 7f 86 80 00 	movdqu XMMWORD PTR [r14+0x80],xmm0
  efbef0:	00 00 
  efbef2:	f3 41 0f 7f 86 90 00 	movdqu XMMWORD PTR [r14+0x90],xmm0
  efbef9:	00 00 
  efbefb:	f3 41 0f 7f 86 a0 00 	movdqu XMMWORD PTR [r14+0xa0],xmm0
  efbf02:	00 00 
  efbf04:	41 88 86 b0 00 00 00 	mov    BYTE PTR [r14+0xb0],al
  efbf0b:	49 83 a6 a8 01 00 00 	and    QWORD PTR [r14+0x1a8],0x0
  efbf12:	00 
  efbf13:	49 83 a6 ae 01 00 00 	and    QWORD PTR [r14+0x1ae],0x0
  efbf1a:	00 
  efbf1b:	4c 8d bc 24 20 02 00 	lea    r15,[rsp+0x220]
  efbf22:	00 
  efbf23:	4c 89 ff             	mov    rdi,r15
  efbf26:	48 89 de             	mov    rsi,rbx
  efbf29:	4c 89 f2             	mov    rdx,r14
  efbf2c:	e8 d3 28 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
  efbf31:	31 ff                	xor    edi,edi
  efbf33:	e8 e4 24 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  efbf38:	66 41 0f 6f 07       	movdqa xmm0,XMMWORD PTR [r15]
  efbf3d:	66 0f ef c9          	pxor   xmm1,xmm1
  efbf41:	66 41 0f 7f 0f       	movdqa XMMWORD PTR [r15],xmm1
  efbf46:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  efbf4a:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
  efbf50:	e8 31 25 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efbf55:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
  efbf59:	e8 28 25 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efbf5e:	48 8d 35 c3 c3 44 ff 	lea    rsi,[rip+0xffffffffff44c3c3]        # 348328 <_ZTSSt12bad_any_cast@@Base-0x47ea0>
  efbf65:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
  efbf6c:	00 
  efbf6d:	e8 0c db b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  efbf72:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
  efbf79:	00 
  efbf7a:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
  efbf81:	00 
  efbf82:	e8 09 1b f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
  efbf87:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
  efbf8e:	00 
  efbf8f:	e8 fc 1e 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  efbf94:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
  efbf99:	80 b8 f3 01 00 00 00 	cmp    BYTE PTR [rax+0x1f3],0x0
  efbfa0:	0f 84 95 01 00 00    	je     efc13b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3551>
  efbfa6:	bf 80 01 00 00       	mov    edi,0x180
  efbfab:	e8 50 1f 8f 00       	call   17edf00 <_Znwm@plt>
  efbfb0:	49 89 c6             	mov    r14,rax
  efbfb3:	66 0f ef c9          	pxor   xmm1,xmm1
  efbfb7:	f3 0f 7f 48 08       	movdqu XMMWORD PTR [rax+0x8],xmm1
  efbfbc:	48 8d 05 fd e7 93 00 	lea    rax,[rip+0x93e7fd]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
  efbfc3:	49 89 06             	mov    QWORD PTR [r14],rax
  efbfc6:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
  efbfcc:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
  efbfd0:	48 85 c0             	test   rax,rax
  efbfd3:	74 05                	je     efbfda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc33f0>
  efbfd5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  efbfda:	48 8d 05 e7 75 94 00 	lea    rax,[rip+0x9475e7]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
  efbfe1:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  efbfe5:	f3 41 0f 7f 4e 28    	movdqu XMMWORD PTR [r14+0x28],xmm1
  efbfeb:	48 8d 05 26 4f 94 00 	lea    rax,[rip+0x944f26]        # 1840f18 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x12eb0>
  efbff2:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
  efbff6:	f3 41 0f 7f 46 38    	movdqu XMMWORD PTR [r14+0x38],xmm0
  efbffc:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  efc003:	48 85 ff             	test   rdi,rdi
  efc006:	74 05                	je     efc00d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3423>
  efc008:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
  efc00d:	48 8d 05 2c 4f 94 00 	lea    rax,[rip+0x944f2c]        # 1840f40 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x12ed8>
  efc014:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  efc018:	48 8d 05 09 51 94 00 	lea    rax,[rip+0x945109]        # 1841128 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x130c0>
  efc01f:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
  efc023:	e8 5e 24 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efc028:	48 8d 05 d1 4c 94 00 	lea    rax,[rip+0x944cd1]        # 1840d00 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x12c98>
  efc02f:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  efc033:	48 8d 05 b6 4e 94 00 	lea    rax,[rip+0x944eb6]        # 1840ef0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x12e88>
  efc03a:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
  efc03e:	48 8d 35 ed 6b 45 ff 	lea    rsi,[rip+0xffffffffff456bed]        # 352c32 <_ZTSSt12bad_any_cast@@Base-0x3d596>
  efc045:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
  efc04c:	00 
  efc04d:	e8 2c da b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  efc052:	48 8d 35 eb 6b 45 ff 	lea    rsi,[rip+0xffffffffff456beb]        # 352c44 <_ZTSSt12bad_any_cast@@Base-0x3d584>
  efc059:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
  efc060:	00 
  efc061:	e8 18 da b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  efc066:	49 8d 7e 48          	lea    rdi,[r14+0x48]
  efc06a:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
  efc071:	00 
  efc072:	48 8d 94 24 e0 06 00 	lea    rdx,[rsp+0x6e0]
  efc079:	00 
  efc07a:	e8 2f 32 0e 00       	call   fdf2ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a66c4>
  efc07f:	4c 89 f3             	mov    rbx,r14
  efc082:	48 83 c3 18          	add    rbx,0x18
  efc086:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
  efc08d:	00 
  efc08e:	e8 fd 1d 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  efc093:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
  efc09a:	00 
  efc09b:	e8 f0 1d 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  efc0a0:	31 c0                	xor    eax,eax
  efc0a2:	41 88 46 70          	mov    BYTE PTR [r14+0x70],al
  efc0a6:	41 88 86 60 01 00 00 	mov    BYTE PTR [r14+0x160],al
  efc0ad:	41 88 86 68 01 00 00 	mov    BYTE PTR [r14+0x168],al
  efc0b4:	41 88 86 70 01 00 00 	mov    BYTE PTR [r14+0x170],al
  efc0bb:	41 88 86 78 01 00 00 	mov    BYTE PTR [r14+0x178],al
  efc0c2:	4c 8d bc 24 20 02 00 	lea    r15,[rsp+0x220]
  efc0c9:	00 
  efc0ca:	4c 89 ff             	mov    rdi,r15
  efc0cd:	48 89 de             	mov    rsi,rbx
  efc0d0:	4c 89 f2             	mov    rdx,r14
  efc0d3:	e8 2c 27 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
  efc0d8:	31 ff                	xor    edi,edi
  efc0da:	e8 3d 23 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  efc0df:	66 41 0f 6f 07       	movdqa xmm0,XMMWORD PTR [r15]
  efc0e4:	66 0f ef c9          	pxor   xmm1,xmm1
  efc0e8:	66 41 0f 7f 0f       	movdqa XMMWORD PTR [r15],xmm1
  efc0ed:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  efc0f1:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
  efc0f7:	e8 8a 23 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efc0fc:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
  efc100:	e8 81 23 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efc105:	48 8d 35 e4 de 44 ff 	lea    rsi,[rip+0xffffffffff44dee4]        # 349ff0 <_ZTSSt12bad_any_cast@@Base-0x461d8>
  efc10c:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
  efc113:	00 
  efc114:	e8 65 d9 b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  efc119:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
  efc120:	00 
  efc121:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
  efc128:	00 
  efc129:	e8 62 19 f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
  efc12e:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
  efc135:	00 
  efc136:	e8 55 1d 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  efc13b:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
  efc140:	80 b8 64 01 00 00 00 	cmp    BYTE PTR [rax+0x164],0x0
  efc147:	0f 84 d1 04 00 00    	je     efc61e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3a34>
  efc14d:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
  efc152:	4c 8d b0 20 03 00 00 	lea    r14,[rax+0x320]
  efc159:	48 83 b8 20 03 00 00 	cmp    QWORD PTR [rax+0x320],0x0
  efc160:	00 
  efc161:	74 36                	je     efc199 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc35af>
  efc163:	48 8d 15 cb 77 48 ff 	lea    rdx,[rip+0xffffffffff4877cb]        # 383935 <_ZTSSt12bad_any_cast@@Base-0xc893>
  efc16a:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
  efc171:	00 
  efc172:	4c 89 ee             	mov    rsi,r13
  efc175:	4c 89 f1             	mov    rcx,r14
  efc178:	e8 6e 27 00 00       	call   efe8eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5d01>
  efc17d:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
  efc184:	00 
  efc185:	4c 89 ef             	mov    rdi,r13
  efc188:	48 89 de             	mov    rsi,rbx
  efc18b:	e8 8c d6 bb ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  efc190:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  efc194:	e8 ed 22 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efc199:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
  efc19e:	8b 80 6c 01 00 00    	mov    eax,DWORD PTR [rax+0x16c]
  efc1a4:	ff c8                	dec    eax
  efc1a6:	83 f8 05             	cmp    eax,0x5
  efc1a9:	4c 89 b4 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],r14
  efc1b0:	00 
  efc1b1:	77 21                	ja     efc1d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc35ea>
  efc1b3:	48 8d 0d ce ab 49 ff 	lea    rcx,[rip+0xffffffffff49abce]        # 396d88 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x3969>
  efc1ba:	48 63 04 81          	movsxd rax,DWORD PTR [rcx+rax*4]
  efc1be:	48 01 c8             	add    rax,rcx
  efc1c1:	ff e0                	jmp    rax
  efc1c3:	6a 08                	push   0x8
  efc1c5:	5f                   	pop    rdi
  efc1c6:	e8 35 1d 8f 00       	call   17edf00 <_Znwm@plt>
  efc1cb:	48 8d 15 c6 6e 94 00 	lea    rdx,[rip+0x946ec6]        # 1843098 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15030>
  efc1d2:	eb 53                	jmp    efc227 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc363d>
  efc1d4:	6a 08                	push   0x8
  efc1d6:	5f                   	pop    rdi
  efc1d7:	e8 24 1d 8f 00       	call   17edf00 <_Znwm@plt>
  efc1dc:	48 8d 15 f5 6c 94 00 	lea    rdx,[rip+0x946cf5]        # 1842ed8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14e70>
  efc1e3:	eb 42                	jmp    efc227 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc363d>
  efc1e5:	6a 08                	push   0x8
  efc1e7:	5f                   	pop    rdi
  efc1e8:	e8 13 1d 8f 00       	call   17edf00 <_Znwm@plt>
  efc1ed:	48 8d 15 c4 6d 94 00 	lea    rdx,[rip+0x946dc4]        # 1842fb8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14f50>
  efc1f4:	eb 31                	jmp    efc227 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc363d>
  efc1f6:	6a 08                	push   0x8
  efc1f8:	5f                   	pop    rdi
  efc1f9:	e8 02 1d 8f 00       	call   17edf00 <_Znwm@plt>
  efc1fe:	48 8d 15 23 6e 94 00 	lea    rdx,[rip+0x946e23]        # 1843028 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14fc0>
  efc205:	eb 20                	jmp    efc227 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc363d>
  efc207:	6a 08                	push   0x8
  efc209:	5f                   	pop    rdi
  efc20a:	e8 f1 1c 8f 00       	call   17edf00 <_Znwm@plt>
  efc20f:	48 8d 15 42 73 94 00 	lea    rdx,[rip+0x947342]        # 1843558 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x154f0>
  efc216:	eb 0f                	jmp    efc227 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc363d>
  efc218:	6a 08                	push   0x8
  efc21a:	5f                   	pop    rdi
  efc21b:	e8 e0 1c 8f 00       	call   17edf00 <_Znwm@plt>
  efc220:	48 8d 15 21 6d 94 00 	lea    rdx,[rip+0x946d21]        # 1842f48 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14ee0>
  efc227:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  efc22e:	00 
  efc22f:	48 89 10             	mov    QWORD PTR [rax],rdx
  efc232:	48 8b 6c 24 60       	mov    rbp,QWORD PTR [rsp+0x60]
  efc237:	4c 8b 65 10          	mov    r12,QWORD PTR [rbp+0x10]
  efc23b:	4c 8b bd 30 01 00 00 	mov    r15,QWORD PTR [rbp+0x130]
  efc242:	4c 8b b5 30 03 00 00 	mov    r14,QWORD PTR [rbp+0x330]
  efc249:	48 8b 9d 48 01 00 00 	mov    rbx,QWORD PTR [rbp+0x148]
  efc250:	bf 50 05 00 00       	mov    edi,0x550
  efc255:	e8 a6 1c 8f 00       	call   17edf00 <_Znwm@plt>
  efc25a:	49 89 c5             	mov    r13,rax
  efc25d:	48 8d 75 20          	lea    rsi,[rbp+0x20]
  efc261:	66 0f ef c0          	pxor   xmm0,xmm0
  efc265:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  efc26a:	48 8d 05 27 fc 93 00 	lea    rax,[rip+0x93fc27]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
  efc271:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
  efc275:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
  efc27c:	00 
  efc27d:	e8 0e e0 b7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  efc282:	0f 28 85 f0 02 00 00 	movaps xmm0,XMMWORD PTR [rbp+0x2f0]
  efc289:	0f 29 84 24 f0 00 00 	movaps XMMWORD PTR [rsp+0xf0],xmm0
  efc290:	00 
  efc291:	48 8b 85 f8 02 00 00 	mov    rax,QWORD PTR [rbp+0x2f8]
  efc298:	48 85 c0             	test   rax,rax
  efc29b:	74 05                	je     efc2a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc36b8>
  efc29d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  efc2a2:	6a 20                	push   0x20
  efc2a4:	5f                   	pop    rdi
  efc2a5:	e8 56 1c 8f 00       	call   17edf00 <_Znwm@plt>
  efc2aa:	48 89 c5             	mov    rbp,rax
  efc2ad:	48 8b 54 24 60       	mov    rdx,QWORD PTR [rsp+0x60]
  efc2b2:	48 8d 82 64 01 00 00 	lea    rax,[rdx+0x164]
  efc2b9:	0f 57 c0             	xorps  xmm0,xmm0
  efc2bc:	0f 11 45 08          	movups XMMWORD PTR [rbp+0x8],xmm0
  efc2c0:	48 8d 0d 69 12 90 00 	lea    rcx,[rip+0x901269]        # 17fd530 <_ZNSt6__ndk119__shared_weak_countD2Ev@@Base+0xe25750>
  efc2c7:	48 89 4d 00          	mov    QWORD PTR [rbp+0x0],rcx
  efc2cb:	48 8b 8c 24 80 00 00 	mov    rcx,QWORD PTR [rsp+0x80]
  efc2d2:	00 
  efc2d3:	48 89 4d 18          	mov    QWORD PTR [rbp+0x18],rcx
  efc2d7:	0f 10 08             	movups xmm1,XMMWORD PTR [rax]
  efc2da:	0f 29 8c 24 e0 01 00 	movaps XMMWORD PTR [rsp+0x1e0],xmm1
  efc2e1:	00 
  efc2e2:	8a 82 40 03 00 00    	mov    al,BYTE PTR [rdx+0x340]
  efc2e8:	88 84 24 00 01 00 00 	mov    BYTE PTR [rsp+0x100],al
  efc2ef:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
  efc2f4:	f3 0f 6f 08          	movdqu xmm1,XMMWORD PTR [rax]
  efc2f8:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
  efc2fc:	48 85 ff             	test   rdi,rdi
  efc2ff:	74 05                	je     efc306 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc371c>
  efc301:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
  efc306:	48 8d 05 bb 72 94 00 	lea    rax,[rip+0x9472bb]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
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
