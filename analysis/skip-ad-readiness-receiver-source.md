# Skip Ad readiness receiver source

Known chain:
- fd381a/fd38d6 use adapter this+0x40
- adapter this = outer+0x18, so receiver = outer+0x58
- constructor 0xefc701 stores outer+0x58 = r15
- immediately earlier: r15 = [rbx+0x10], rbx = [rsp+0x60]

## Constructor FDE containing 0xefc701: (15700428, 15722027)
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
      efc77f:	e8 7c 17 8f 00       	call   17edf00 <_Znwm@plt>

## All rsp+0x60 references in constructor FDE
### 0xef9217: mov    QWORD PTR [rsp+0x60],rsi
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
      ef9260:	4c 8b 79 60          	mov    r15,QWORD PTR [rcx+0x60]
      ef9264:	4c 89 bc 24 20 07 00 	mov    QWORD PTR [rsp+0x720],r15
      ef926b:	00 
      ef926c:	48 8b 59 68          	mov    rbx,QWORD PTR [rcx+0x68]
      ef9270:	48 89 9c 24 28 07 00 	mov    QWORD PTR [rsp+0x728],rbx
      ef9277:	00 
      ef9278:	48 85 db             	test   rbx,rbx
      ef927b:	74 05                	je     ef9282 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0698>
      ef927d:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      ef9282:	c6 84 24 30 07 00 00 	mov    BYTE PTR [rsp+0x730],0x0
      ef9289:	00 
      ef928a:	88 84 24 31 07 00 00 	mov    BYTE PTR [rsp+0x731],al
      ef9291:	48 83 a4 24 e0 0a 00 	and    QWORD PTR [rsp+0xae0],0x0

### 0xef922d: mov    rax,QWORD PTR [rsp+0x60]
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
      ef9260:	4c 8b 79 60          	mov    r15,QWORD PTR [rcx+0x60]
      ef9264:	4c 89 bc 24 20 07 00 	mov    QWORD PTR [rsp+0x720],r15
      ef926b:	00 
      ef926c:	48 8b 59 68          	mov    rbx,QWORD PTR [rcx+0x68]
      ef9270:	48 89 9c 24 28 07 00 	mov    QWORD PTR [rsp+0x728],rbx
      ef9277:	00 
      ef9278:	48 85 db             	test   rbx,rbx
      ef927b:	74 05                	je     ef9282 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0698>
      ef927d:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      ef9282:	c6 84 24 30 07 00 00 	mov    BYTE PTR [rsp+0x730],0x0
      ef9289:	00 
      ef928a:	88 84 24 31 07 00 00 	mov    BYTE PTR [rsp+0x731],al
      ef9291:	48 83 a4 24 e0 0a 00 	and    QWORD PTR [rsp+0xae0],0x0
      ef9298:	00 00 
      ef929a:	6a 30                	push   0x30
      ef929c:	5f                   	pop    rdi
      ef929d:	4c 89 64 24 68       	mov    QWORD PTR [rsp+0x68],r12
      ef92a2:	e8 59 4c 8f 00       	call   17edf00 <_Znwm@plt>

### 0xef925b: mov    rcx,QWORD PTR [rsp+0x60]
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
      ef9260:	4c 8b 79 60          	mov    r15,QWORD PTR [rcx+0x60]
      ef9264:	4c 89 bc 24 20 07 00 	mov    QWORD PTR [rsp+0x720],r15
      ef926b:	00 
      ef926c:	48 8b 59 68          	mov    rbx,QWORD PTR [rcx+0x68]
      ef9270:	48 89 9c 24 28 07 00 	mov    QWORD PTR [rsp+0x728],rbx
      ef9277:	00 
      ef9278:	48 85 db             	test   rbx,rbx
      ef927b:	74 05                	je     ef9282 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0698>
      ef927d:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      ef9282:	c6 84 24 30 07 00 00 	mov    BYTE PTR [rsp+0x730],0x0
      ef9289:	00 
      ef928a:	88 84 24 31 07 00 00 	mov    BYTE PTR [rsp+0x731],al
      ef9291:	48 83 a4 24 e0 0a 00 	and    QWORD PTR [rsp+0xae0],0x0
      ef9298:	00 00 
      ef929a:	6a 30                	push   0x30
      ef929c:	5f                   	pop    rdi
      ef929d:	4c 89 64 24 68       	mov    QWORD PTR [rsp+0x68],r12
      ef92a2:	e8 59 4c 8f 00       	call   17edf00 <_Znwm@plt>
      ef92a7:	48 8d 0d aa f4 99 00 	lea    rcx,[rip+0x99f4aa]        # 1898758 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x5698>
      ef92ae:	48 89 08             	mov    QWORD PTR [rax],rcx
      ef92b1:	66 0f 6f 84 24 b0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xb0]
      ef92b8:	00 00 
      ef92ba:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      ef92bf:	66 0f ef c0          	pxor   xmm0,xmm0
      ef92c3:	66 0f 7f 84 24 10 07 	movdqa XMMWORD PTR [rsp+0x710],xmm0
      ef92ca:	00 00 
      ef92cc:	4c 89 78 18          	mov    QWORD PTR [rax+0x18],r15
      ef92d0:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx

### 0xef9479: mov    rax,QWORD PTR [rsp+0x60]
      ef9431:	4c 89 79 10          	mov    QWORD PTR [rcx+0x10],r15
      ef9435:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
      ef9439:	31 ff                	xor    edi,edi
      ef943b:	e8 46 50 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9440:	48 8d bc 24 f0 05 00 	lea    rdi,[rsp+0x5f0]
      ef9447:	00 
      ef9448:	e8 1d 0b b8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ef944d:	4c 8b 64 24 68       	mov    r12,QWORD PTR [rsp+0x68]
      ef9452:	eb 09                	jmp    ef945d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0873>
      ef9454:	48 83 a4 24 d0 06 00 	and    QWORD PTR [rsp+0x6d0],0x0
      ef945b:	00 00 
      ef945d:	48 8d bc 24 c0 0a 00 	lea    rdi,[rsp+0xac0]
      ef9464:	00 
      ef9465:	e8 00 0b b8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ef946a:	4c 89 f7             	mov    rdi,r14
      ef946d:	e8 14 50 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9472:	31 ff                	xor    edi,edi
      ef9474:	e8 0d 50 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9479:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      ef947e:	4c 8b b8 00 02 00 00 	mov    r15,QWORD PTR [rax+0x200]
      ef9485:	49 83 7f 78 00       	cmp    QWORD PTR [r15+0x78],0x0
      ef948a:	74 3d                	je     ef94c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc08df>
      ef948c:	49 8b 7f 70          	mov    rdi,QWORD PTR [r15+0x70]
      ef9490:	e8 49 e6 fa ff       	call   ea7ade <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6eef4>
      ef9495:	49 83 67 70 00       	and    QWORD PTR [r15+0x70],0x0
      ef949a:	49 8b 47 68          	mov    rax,QWORD PTR [r15+0x68]
      ef949e:	48 85 c0             	test   rax,rax
      ef94a1:	74 13                	je     ef94b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc08cc>
      ef94a3:	31 c9                	xor    ecx,ecx
      ef94a5:	49 8b 57 60          	mov    rdx,QWORD PTR [r15+0x60]
      ef94a9:	48 83 24 ca 00       	and    QWORD PTR [rdx+rcx*8],0x0
      ef94ae:	48 ff c1             	inc    rcx
      ef94b1:	48 39 c8             	cmp    rax,rcx
      ef94b4:	75 ef                	jne    ef94a5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc08bb>
      ef94b6:	49 83 67 78 00       	and    QWORD PTR [r15+0x78],0x0
      ef94bb:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      ef94c0:	4c 8b b8 00 02 00 00 	mov    r15,QWORD PTR [rax+0x200]
      ef94c7:	eb 05                	jmp    ef94ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc08e4>
      ef94c9:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      ef94ce:	48 8b 80 08 02 00 00 	mov    rax,QWORD PTR [rax+0x208]
      ef94d5:	48 85 c0             	test   rax,rax
      ef94d8:	74 05                	je     ef94df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc08f5>
      ef94da:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ef94df:	49 8d 4c 24 10       	lea    rcx,[r12+0x10]
      ef94e4:	48 89 8c 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rcx
      ef94eb:	00 
      ef94ec:	4d 8d 74 24 28       	lea    r14,[r12+0x28]

### 0xef94bb: mov    rax,QWORD PTR [rsp+0x60]
      ef9474:	e8 0d 50 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9479:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      ef947e:	4c 8b b8 00 02 00 00 	mov    r15,QWORD PTR [rax+0x200]
      ef9485:	49 83 7f 78 00       	cmp    QWORD PTR [r15+0x78],0x0
      ef948a:	74 3d                	je     ef94c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc08df>
      ef948c:	49 8b 7f 70          	mov    rdi,QWORD PTR [r15+0x70]
      ef9490:	e8 49 e6 fa ff       	call   ea7ade <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6eef4>
      ef9495:	49 83 67 70 00       	and    QWORD PTR [r15+0x70],0x0
      ef949a:	49 8b 47 68          	mov    rax,QWORD PTR [r15+0x68]
      ef949e:	48 85 c0             	test   rax,rax
      ef94a1:	74 13                	je     ef94b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc08cc>
      ef94a3:	31 c9                	xor    ecx,ecx
      ef94a5:	49 8b 57 60          	mov    rdx,QWORD PTR [r15+0x60]
      ef94a9:	48 83 24 ca 00       	and    QWORD PTR [rdx+rcx*8],0x0
      ef94ae:	48 ff c1             	inc    rcx
      ef94b1:	48 39 c8             	cmp    rax,rcx
      ef94b4:	75 ef                	jne    ef94a5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc08bb>
      ef94b6:	49 83 67 78 00       	and    QWORD PTR [r15+0x78],0x0
      ef94bb:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      ef94c0:	4c 8b b8 00 02 00 00 	mov    r15,QWORD PTR [rax+0x200]
      ef94c7:	eb 05                	jmp    ef94ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc08e4>
      ef94c9:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      ef94ce:	48 8b 80 08 02 00 00 	mov    rax,QWORD PTR [rax+0x208]
      ef94d5:	48 85 c0             	test   rax,rax
      ef94d8:	74 05                	je     ef94df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc08f5>
      ef94da:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ef94df:	49 8d 4c 24 10       	lea    rcx,[r12+0x10]
      ef94e4:	48 89 8c 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rcx
      ef94eb:	00 
      ef94ec:	4d 8d 74 24 28       	lea    r14,[r12+0x28]
      ef94f1:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      ef94f6:	4c 8d a9 00 01 00 00 	lea    r13,[rcx+0x100]
      ef94fd:	80 b9 10 02 00 00 00 	cmp    BYTE PTR [rcx+0x210],0x0
      ef9504:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      ef950b:	00 
      ef950c:	4c 89 b4 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],r14
      ef9513:	00 
      ef9514:	0f 84 a7 00 00 00    	je     ef95c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc09d7>
      ef951a:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      ef9521:	00 
      ef9522:	4c 89 ee             	mov    rsi,r13
      ef9525:	e8 01 51 00 00       	call   efe62b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5a41>
      ef952a:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      ef9531:	00 
      ef9532:	4c 89 e7             	mov    rdi,r12
      ef9535:	48 89 de             	mov    rsi,rbx
      ef9538:	e8 df 02 bc ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>

### 0xef94c9: mov    rax,QWORD PTR [rsp+0x60]
      ef9485:	49 83 7f 78 00       	cmp    QWORD PTR [r15+0x78],0x0
      ef948a:	74 3d                	je     ef94c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc08df>
      ef948c:	49 8b 7f 70          	mov    rdi,QWORD PTR [r15+0x70]
      ef9490:	e8 49 e6 fa ff       	call   ea7ade <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6eef4>
      ef9495:	49 83 67 70 00       	and    QWORD PTR [r15+0x70],0x0
      ef949a:	49 8b 47 68          	mov    rax,QWORD PTR [r15+0x68]
      ef949e:	48 85 c0             	test   rax,rax
      ef94a1:	74 13                	je     ef94b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc08cc>
      ef94a3:	31 c9                	xor    ecx,ecx
      ef94a5:	49 8b 57 60          	mov    rdx,QWORD PTR [r15+0x60]
      ef94a9:	48 83 24 ca 00       	and    QWORD PTR [rdx+rcx*8],0x0
      ef94ae:	48 ff c1             	inc    rcx
      ef94b1:	48 39 c8             	cmp    rax,rcx
      ef94b4:	75 ef                	jne    ef94a5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc08bb>
      ef94b6:	49 83 67 78 00       	and    QWORD PTR [r15+0x78],0x0
      ef94bb:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      ef94c0:	4c 8b b8 00 02 00 00 	mov    r15,QWORD PTR [rax+0x200]
      ef94c7:	eb 05                	jmp    ef94ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc08e4>
      ef94c9:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      ef94ce:	48 8b 80 08 02 00 00 	mov    rax,QWORD PTR [rax+0x208]
      ef94d5:	48 85 c0             	test   rax,rax
      ef94d8:	74 05                	je     ef94df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc08f5>
      ef94da:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ef94df:	49 8d 4c 24 10       	lea    rcx,[r12+0x10]
      ef94e4:	48 89 8c 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rcx
      ef94eb:	00 
      ef94ec:	4d 8d 74 24 28       	lea    r14,[r12+0x28]
      ef94f1:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      ef94f6:	4c 8d a9 00 01 00 00 	lea    r13,[rcx+0x100]
      ef94fd:	80 b9 10 02 00 00 00 	cmp    BYTE PTR [rcx+0x210],0x0
      ef9504:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      ef950b:	00 
      ef950c:	4c 89 b4 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],r14
      ef9513:	00 
      ef9514:	0f 84 a7 00 00 00    	je     ef95c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc09d7>
      ef951a:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      ef9521:	00 
      ef9522:	4c 89 ee             	mov    rsi,r13
      ef9525:	e8 01 51 00 00       	call   efe62b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5a41>
      ef952a:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      ef9531:	00 
      ef9532:	4c 89 e7             	mov    rdi,r12
      ef9535:	48 89 de             	mov    rsi,rbx
      ef9538:	e8 df 02 bc ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      ef953d:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      ef9541:	e8 40 4f ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9546:	48 8d 35 ad e0 47 ff 	lea    rsi,[rip+0xffffffffff47e0ad]        # 3775fa <_ZTSSt12bad_any_cast@@Base-0x18bce>

### 0xef94f1: mov    rcx,QWORD PTR [rsp+0x60]
      ef94a5:	49 8b 57 60          	mov    rdx,QWORD PTR [r15+0x60]
      ef94a9:	48 83 24 ca 00       	and    QWORD PTR [rdx+rcx*8],0x0
      ef94ae:	48 ff c1             	inc    rcx
      ef94b1:	48 39 c8             	cmp    rax,rcx
      ef94b4:	75 ef                	jne    ef94a5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc08bb>
      ef94b6:	49 83 67 78 00       	and    QWORD PTR [r15+0x78],0x0
      ef94bb:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      ef94c0:	4c 8b b8 00 02 00 00 	mov    r15,QWORD PTR [rax+0x200]
      ef94c7:	eb 05                	jmp    ef94ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc08e4>
      ef94c9:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      ef94ce:	48 8b 80 08 02 00 00 	mov    rax,QWORD PTR [rax+0x208]
      ef94d5:	48 85 c0             	test   rax,rax
      ef94d8:	74 05                	je     ef94df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc08f5>
      ef94da:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ef94df:	49 8d 4c 24 10       	lea    rcx,[r12+0x10]
      ef94e4:	48 89 8c 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rcx
      ef94eb:	00 
      ef94ec:	4d 8d 74 24 28       	lea    r14,[r12+0x28]
      ef94f1:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      ef94f6:	4c 8d a9 00 01 00 00 	lea    r13,[rcx+0x100]
      ef94fd:	80 b9 10 02 00 00 00 	cmp    BYTE PTR [rcx+0x210],0x0
      ef9504:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      ef950b:	00 
      ef950c:	4c 89 b4 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],r14
      ef9513:	00 
      ef9514:	0f 84 a7 00 00 00    	je     ef95c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc09d7>
      ef951a:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      ef9521:	00 
      ef9522:	4c 89 ee             	mov    rsi,r13
      ef9525:	e8 01 51 00 00       	call   efe62b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5a41>
      ef952a:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      ef9531:	00 
      ef9532:	4c 89 e7             	mov    rdi,r12
      ef9535:	48 89 de             	mov    rsi,rbx
      ef9538:	e8 df 02 bc ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      ef953d:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      ef9541:	e8 40 4f ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9546:	48 8d 35 ad e0 47 ff 	lea    rsi,[rip+0xffffffffff47e0ad]        # 3775fa <_ZTSSt12bad_any_cast@@Base-0x18bce>
      ef954d:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      ef9554:	00 
      ef9555:	e8 24 05 b8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      ef955a:	4d 89 fc             	mov    r12,r15
      ef955d:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      ef9564:	00 
      ef9565:	4c 89 f7             	mov    rdi,r14
      ef9568:	e8 23 45 f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
      ef956d:	4c 8d ac 24 10 07 00 	lea    r13,[rsp+0x710]

### 0xef957d: mov    rbx,QWORD PTR [rsp+0x60]
      ef9532:	4c 89 e7             	mov    rdi,r12
      ef9535:	48 89 de             	mov    rsi,rbx
      ef9538:	e8 df 02 bc ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      ef953d:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      ef9541:	e8 40 4f ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9546:	48 8d 35 ad e0 47 ff 	lea    rsi,[rip+0xffffffffff47e0ad]        # 3775fa <_ZTSSt12bad_any_cast@@Base-0x18bce>
      ef954d:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      ef9554:	00 
      ef9555:	e8 24 05 b8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      ef955a:	4d 89 fc             	mov    r12,r15
      ef955d:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      ef9564:	00 
      ef9565:	4c 89 f7             	mov    rdi,r14
      ef9568:	e8 23 45 f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
      ef956d:	4c 8d ac 24 10 07 00 	lea    r13,[rsp+0x710]
      ef9574:	00 
      ef9575:	4c 89 ef             	mov    rdi,r13
      ef9578:	e8 13 49 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ef957d:	48 8b 5c 24 60       	mov    rbx,QWORD PTR [rsp+0x60]
      ef9582:	48 8b bb 40 02 00 00 	mov    rdi,QWORD PTR [rbx+0x240]
      ef9589:	e8 d4 0e b8 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      ef958e:	49 89 c7             	mov    r15,rax
      ef9591:	80 bb ba 01 00 00 00 	cmp    BYTE PTR [rbx+0x1ba],0x0
      ef9598:	0f 84 e4 00 00 00    	je     ef9682 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0a98>
      ef959e:	8a 83 c8 01 00 00    	mov    al,BYTE PTR [rbx+0x1c8]
      ef95a4:	88 84 24 08 02 00 00 	mov    BYTE PTR [rsp+0x208],al
      ef95ab:	48 8b 83 c0 01 00 00 	mov    rax,QWORD PTR [rbx+0x1c0]
      ef95b2:	48 89 84 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rax
      ef95b9:	00 
      ef95ba:	b0 01                	mov    al,0x1
      ef95bc:	e9 cb 00 00 00       	jmp    ef968c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0aa2>
      ef95c1:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      ef95c8:	00 
      ef95c9:	4c 89 ee             	mov    rsi,r13
      ef95cc:	e8 5a 50 00 00       	call   efe62b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5a41>
      ef95d1:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      ef95d8:	00 
      ef95d9:	4c 89 e7             	mov    rdi,r12
      ef95dc:	48 89 de             	mov    rsi,rbx
      ef95df:	e8 38 02 bc ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      ef95e4:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      ef95e8:	e8 99 4e ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef95ed:	48 8d 35 06 e0 47 ff 	lea    rsi,[rip+0xffffffffff47e006]        # 3775fa <_ZTSSt12bad_any_cast@@Base-0x18bce>
      ef95f4:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      ef95fb:	00 
      ef95fc:	e8 7d 04 b8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      ef9601:	4c 89 ac 24 00 01 00 	mov    QWORD PTR [rsp+0x100],r13

### 0xef963e: mov    rbx,QWORD PTR [rsp+0x60]
      ef95f4:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      ef95fb:	00 
      ef95fc:	e8 7d 04 b8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      ef9601:	4c 89 ac 24 00 01 00 	mov    QWORD PTR [rsp+0x100],r13
      ef9608:	00 
      ef9609:	4c 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r15
      ef9610:	00 
      ef9611:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      ef9618:	00 
      ef9619:	4c 89 f7             	mov    rdi,r14
      ef961c:	e8 6f 44 f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
      ef9621:	4c 8d ac 24 10 07 00 	lea    r13,[rsp+0x710]
      ef9628:	00 
      ef9629:	4c 89 ef             	mov    rdi,r13
      ef962c:	e8 5f 48 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ef9631:	66 0f ef c0          	pxor   xmm0,xmm0
      ef9635:	66 0f 7f 84 24 c0 01 	movdqa XMMWORD PTR [rsp+0x1c0],xmm0
      ef963c:	00 00 
      ef963e:	48 8b 5c 24 60       	mov    rbx,QWORD PTR [rsp+0x60]
      ef9643:	48 8b bb 40 02 00 00 	mov    rdi,QWORD PTR [rbx+0x240]
      ef964a:	e8 13 0e b8 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      ef964f:	48 89 c5             	mov    rbp,rax
      ef9652:	80 bb ba 01 00 00 00 	cmp    BYTE PTR [rbx+0x1ba],0x0
      ef9659:	0f 84 cf 02 00 00    	je     ef992e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0d44>
      ef965f:	8a 83 c8 01 00 00    	mov    al,BYTE PTR [rbx+0x1c8]
      ef9665:	88 84 24 08 02 00 00 	mov    BYTE PTR [rsp+0x208],al
      ef966c:	48 8b 83 c0 01 00 00 	mov    rax,QWORD PTR [rbx+0x1c0]
      ef9673:	48 89 84 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rax
      ef967a:	00 
      ef967b:	b0 01                	mov    al,0x1
      ef967d:	e9 b6 02 00 00       	jmp    ef9938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0d4e>
      ef9682:	c6 84 24 00 02 00 00 	mov    BYTE PTR [rsp+0x200],0x0
      ef9689:	00 
      ef968a:	31 c0                	xor    eax,eax
      ef968c:	88 84 24 10 02 00 00 	mov    BYTE PTR [rsp+0x210],al
      ef9693:	bf 20 0c 00 00       	mov    edi,0xc20
      ef9698:	e8 63 48 8f 00       	call   17edf00 <_Znwm@plt>
      ef969d:	66 0f ef c0          	pxor   xmm0,xmm0
      ef96a1:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      ef96a6:	48 8d 0d eb 27 94 00 	lea    rcx,[rip+0x9427eb]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      ef96ad:	48 89 08             	mov    QWORD PTR [rax],rcx
      ef96b0:	48 8b 8c 24 b0 00 00 	mov    rcx,QWORD PTR [rsp+0xb0]
      ef96b7:	00 
      ef96b8:	48 85 c9             	test   rcx,rcx
      ef96bb:	74 1c                	je     ef96d9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0aef>
      ef96bd:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      ef96c2:	4c 89 a4 24 18 07 00 	mov    QWORD PTR [rsp+0x718],r12

### 0xef96ea: mov    rcx,QWORD PTR [rsp+0x60]
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

### 0xef9741: mov    r14,QWORD PTR [rsp+0x60]
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
      ef97a0:	48 8b 6c 24 68       	mov    rbp,QWORD PTR [rsp+0x68]
      ef97a5:	48 8b 75 00          	mov    rsi,QWORD PTR [rbp+0x0]
      ef97a9:	48 8b 55 08          	mov    rdx,QWORD PTR [rbp+0x8]
      ef97ad:	48 8b 8c 24 10 02 00 	mov    rcx,QWORD PTR [rsp+0x210]
      ef97b4:	00 
      ef97b5:	48 89 4c 24 48       	mov    QWORD PTR [rsp+0x48],rcx
      ef97ba:	f3 0f 6f 84 24 00 02 	movdqu xmm0,XMMWORD PTR [rsp+0x200]
      ef97c1:	00 00 
      ef97c3:	f3 0f 7f 44 24 38    	movdqu XMMWORD PTR [rsp+0x38],xmm0

### 0xef9794: mov    rax,QWORD PTR [rsp+0x60]
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
      ef97a0:	48 8b 6c 24 68       	mov    rbp,QWORD PTR [rsp+0x68]
      ef97a5:	48 8b 75 00          	mov    rsi,QWORD PTR [rbp+0x0]
      ef97a9:	48 8b 55 08          	mov    rdx,QWORD PTR [rbp+0x8]
      ef97ad:	48 8b 8c 24 10 02 00 	mov    rcx,QWORD PTR [rsp+0x210]
      ef97b4:	00 
      ef97b5:	48 89 4c 24 48       	mov    QWORD PTR [rsp+0x48],rcx
      ef97ba:	f3 0f 6f 84 24 00 02 	movdqu xmm0,XMMWORD PTR [rsp+0x200]
      ef97c1:	00 00 
      ef97c3:	f3 0f 7f 44 24 38    	movdqu XMMWORD PTR [rsp+0x38],xmm0
      ef97c9:	89 44 24 28          	mov    DWORD PTR [rsp+0x28],eax
      ef97cd:	4c 89 74 24 20       	mov    QWORD PTR [rsp+0x20],r14
      ef97d2:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
      ef97d7:	48 8d 84 24 f0 05 00 	lea    rax,[rsp+0x5f0]
      ef97de:	00 
      ef97df:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ef97e4:	48 8d 84 24 40 02 00 	lea    rax,[rsp+0x240]
      ef97eb:	00 
      ef97ec:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      ef97f0:	83 64 24 50 00       	and    DWORD PTR [rsp+0x50],0x0
      ef97f5:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
      ef97fb:	48 c7 44 24 18 0a 00 	mov    QWORD PTR [rsp+0x18],0xa
      ef9802:	00 00 
      ef9804:	48 8d 8c 24 10 07 00 	lea    rcx,[rsp+0x710]
      ef980b:	00 
      ef980c:	4c 8d 8c 24 20 02 00 	lea    r9,[rsp+0x220]
      ef9813:	00 
      ef9814:	4c 89 ef             	mov    rdi,r13

### 0xef99a9: mov    rcx,QWORD PTR [rsp+0x60]
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

### 0xef9a03: mov    r14,QWORD PTR [rsp+0x60]
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
      ef9a58:	e8 21 00 b8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      ef9a5d:	4d 89 fd             	mov    r13,r15
      ef9a60:	49 83 c5 20          	add    r13,0x20
      ef9a64:	48 8b 54 24 60       	mov    rdx,QWORD PTR [rsp+0x60]
      ef9a69:	0f b6 82 d4 01 00 00 	movzx  eax,BYTE PTR [rdx+0x1d4]
      ef9a70:	48 8b 8a e8 01 00 00 	mov    rcx,QWORD PTR [rdx+0x1e8]
      ef9a77:	0f b6 ba f5 01 00 00 	movzx  edi,BYTE PTR [rdx+0x1f5]
      ef9a7e:	48 8b 54 24 68       	mov    rdx,QWORD PTR [rsp+0x68]
      ef9a83:	48 8b 32             	mov    rsi,QWORD PTR [rdx]
      ef9a86:	48 8b 52 08          	mov    rdx,QWORD PTR [rdx+0x8]

### 0xef9a64: mov    rdx,QWORD PTR [rsp+0x60]
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
      ef9a58:	e8 21 00 b8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      ef9a5d:	4d 89 fd             	mov    r13,r15
      ef9a60:	49 83 c5 20          	add    r13,0x20
      ef9a64:	48 8b 54 24 60       	mov    rdx,QWORD PTR [rsp+0x60]
      ef9a69:	0f b6 82 d4 01 00 00 	movzx  eax,BYTE PTR [rdx+0x1d4]
      ef9a70:	48 8b 8a e8 01 00 00 	mov    rcx,QWORD PTR [rdx+0x1e8]
      ef9a77:	0f b6 ba f5 01 00 00 	movzx  edi,BYTE PTR [rdx+0x1f5]
      ef9a7e:	48 8b 54 24 68       	mov    rdx,QWORD PTR [rsp+0x68]
      ef9a83:	48 8b 32             	mov    rsi,QWORD PTR [rdx]
      ef9a86:	48 8b 52 08          	mov    rdx,QWORD PTR [rdx+0x8]
      ef9a8a:	4c 8b 84 24 10 02 00 	mov    r8,QWORD PTR [rsp+0x210]
      ef9a91:	00 
      ef9a92:	4c 89 44 24 48       	mov    QWORD PTR [rsp+0x48],r8
      ef9a97:	f3 0f 6f 84 24 00 02 	movdqu xmm0,XMMWORD PTR [rsp+0x200]
      ef9a9e:	00 00 
      ef9aa0:	f3 0f 7f 44 24 38    	movdqu XMMWORD PTR [rsp+0x38],xmm0
      ef9aa6:	89 7c 24 50          	mov    DWORD PTR [rsp+0x50],edi
      ef9aaa:	48 89 4c 24 30       	mov    QWORD PTR [rsp+0x30],rcx
      ef9aaf:	89 44 24 28          	mov    DWORD PTR [rsp+0x28],eax
      ef9ab3:	4c 89 64 24 20       	mov    QWORD PTR [rsp+0x20],r12
      ef9ab8:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
      ef9abd:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
      ef9ac2:	48 8d 84 24 40 02 00 	lea    rax,[rsp+0x240]
      ef9ac9:	00 
      ef9aca:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      ef9ace:	48 c7 44 24 18 0a 00 	mov    QWORD PTR [rsp+0x18],0xa
      ef9ad5:	00 00 
      ef9ad7:	48 8d 8c 24 10 07 00 	lea    rcx,[rsp+0x710]
      ef9ade:	00 
      ef9adf:	4c 8d 8c 24 20 02 00 	lea    r9,[rsp+0x220]
      ef9ae6:	00 
      ef9ae7:	4c 89 ef             	mov    rdi,r13

### 0xef9e77: mov    rax,QWORD PTR [rsp+0x60]
      ef9e2d:	4c 8d bc 24 10 07 00 	lea    r15,[rsp+0x710]
      ef9e34:	00 
      ef9e35:	4c 89 ff             	mov    rdi,r15
      ef9e38:	48 89 de             	mov    rsi,rbx
      ef9e3b:	4c 89 f2             	mov    rdx,r14
      ef9e3e:	e8 c1 49 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      ef9e43:	31 ff                	xor    edi,edi
      ef9e45:	e8 d2 45 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ef9e4a:	66 41 0f 6f 07       	movdqa xmm0,XMMWORD PTR [r15]
      ef9e4f:	66 0f ef c9          	pxor   xmm1,xmm1
      ef9e53:	66 41 0f 7f 0f       	movdqa XMMWORD PTR [r15],xmm1
      ef9e58:	48 8b bc 24 c8 01 00 	mov    rdi,QWORD PTR [rsp+0x1c8]
      ef9e5f:	00 
      ef9e60:	66 0f 7f 84 24 c0 01 	movdqa XMMWORD PTR [rsp+0x1c0],xmm0
      ef9e67:	00 00 
      ef9e69:	e8 18 46 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9e6e:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      ef9e72:	e8 0f 46 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9e77:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      ef9e7c:	4c 8d b8 90 02 00 00 	lea    r15,[rax+0x290]
      ef9e83:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      ef9e8a:	00 
      ef9e8b:	4c 89 fe             	mov    rsi,r15
      ef9e8e:	e8 fd 03 b8 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ef9e93:	bf 90 00 00 00       	mov    edi,0x90
      ef9e98:	e8 63 40 8f 00       	call   17edf00 <_Znwm@plt>
      ef9e9d:	49 89 c4             	mov    r12,rax
      ef9ea0:	49 89 c6             	mov    r14,rax
      ef9ea3:	66 0f ef c0          	pxor   xmm0,xmm0
      ef9ea7:	f3 41 0f 7f 44 24 08 	movdqu XMMWORD PTR [r12+0x8],xmm0
      ef9eae:	48 8d 05 13 0f 91 00 	lea    rax,[rip+0x910f13]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
      ef9eb5:	49 89 04 24          	mov    QWORD PTR [r12],rax
      ef9eb9:	48 8d 05 c0 ab 94 00 	lea    rax,[rip+0x94abc0]        # 1844a80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1168>
      ef9ec0:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
      ef9ec5:	49 8d 5c 24 30       	lea    rbx,[r12+0x30]
      ef9eca:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      ef9ed1:	00 
      ef9ed2:	48 89 df             	mov    rdi,rbx
      ef9ed5:	e8 a6 e0 d6 ff       	call   c67f80 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b4f20>
      ef9eda:	49 83 a4 24 80 00 00 	and    QWORD PTR [r12+0x80],0x0
      ef9ee1:	00 00 
      ef9ee3:	bf d0 84 00 00       	mov    edi,0x84d0
      ef9ee8:	e8 13 40 8f 00       	call   17edf00 <_Znwm@plt>
      ef9eed:	4c 89 a4 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],r12
      ef9ef4:	00 
      ef9ef5:	49 89 46 60          	mov    QWORD PTR [r14+0x60],rax
      ef9ef9:	48 89 c1             	mov    rcx,rax

### 0xef9f23: mov    rax,QWORD PTR [rsp+0x60]
      ef9ed5:	e8 a6 e0 d6 ff       	call   c67f80 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b4f20>
      ef9eda:	49 83 a4 24 80 00 00 	and    QWORD PTR [r12+0x80],0x0
      ef9ee1:	00 00 
      ef9ee3:	bf d0 84 00 00       	mov    edi,0x84d0
      ef9ee8:	e8 13 40 8f 00       	call   17edf00 <_Znwm@plt>
      ef9eed:	4c 89 a4 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],r12
      ef9ef4:	00 
      ef9ef5:	49 89 46 60          	mov    QWORD PTR [r14+0x60],rax
      ef9ef9:	48 89 c1             	mov    rcx,rax
      ef9efc:	48 81 c1 d0 84 00 00 	add    rcx,0x84d0
      ef9f03:	49 89 4e 68          	mov    QWORD PTR [r14+0x68],rcx
      ef9f07:	49 89 46 78          	mov    QWORD PTR [r14+0x78],rax
      ef9f0b:	49 89 46 70          	mov    QWORD PTR [r14+0x70],rax
      ef9f0f:	31 ff                	xor    edi,edi
      ef9f11:	e8 06 45 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ef9f16:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      ef9f1d:	00 
      ef9f1e:	e8 47 00 b8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ef9f23:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      ef9f28:	66 0f 6f 80 c0 02 00 	movdqa xmm0,XMMWORD PTR [rax+0x2c0]
      ef9f2f:	00 
      ef9f30:	48 8b 98 c8 02 00 00 	mov    rbx,QWORD PTR [rax+0x2c8]
      ef9f37:	48 85 db             	test   rbx,rbx
      ef9f3a:	74 05                	je     ef9f41 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1357>
      ef9f3c:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      ef9f41:	66 48 0f 7e c0       	movq   rax,xmm0
      ef9f46:	66 49 0f 3a 16 c5 01 	pextrq r13,xmm0,0x1
      ef9f4d:	4d 85 ed             	test   r13,r13
      ef9f50:	66 0f 7f 44 24 70    	movdqa XMMWORD PTR [rsp+0x70],xmm0
      ef9f56:	74 0f                	je     ef9f67 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc137d>
      ef9f58:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
      ef9f5d:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
      ef9f62:	4c 89 e9             	mov    rcx,r13
      ef9f65:	eb 02                	jmp    ef9f69 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc137f>
      ef9f67:	31 c9                	xor    ecx,ecx
      ef9f69:	48 89 84 24 f0 05 00 	mov    QWORD PTR [rsp+0x5f0],rax
      ef9f70:	00 
      ef9f71:	48 89 8c 24 f8 05 00 	mov    QWORD PTR [rsp+0x5f8],rcx
      ef9f78:	00 
      ef9f79:	6a 20                	push   0x20
      ef9f7b:	5f                   	pop    rdi
      ef9f7c:	4c 89 b4 24 08 01 00 	mov    QWORD PTR [rsp+0x108],r14
      ef9f83:	00 
      ef9f84:	4c 89 ac 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],r13
      ef9f8b:	00 
      ef9f8c:	e8 6f 3f 8f 00       	call   17edf00 <_Znwm@plt>
      ef9f91:	66 0f ef c0          	pxor   xmm0,xmm0

### 0xefac13: mov    rax,QWORD PTR [rsp+0x60]
      efabca:	e8 b7 38 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efabcf:	48 8b 84 24 18 06 00 	mov    rax,QWORD PTR [rsp+0x618]
      efabd6:	00 
      efabd7:	66 0f 6f 84 24 10 06 	movdqa xmm0,XMMWORD PTR [rsp+0x610]
      efabde:	00 00 
      efabe0:	f3 0f 7f 45 38       	movdqu XMMWORD PTR [rbp+0x38],xmm0
      efabe5:	48 85 c0             	test   rax,rax
      efabe8:	74 05                	je     efabef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2005>
      efabea:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efabef:	4c 89 6d 48          	mov    QWORD PTR [rbp+0x48],r13
      efabf3:	4c 89 75 50          	mov    QWORD PTR [rbp+0x50],r14
      efabf7:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      efabfc:	4c 89 ff             	mov    rdi,r15
      efabff:	e8 82 38 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efac04:	4c 89 f7             	mov    rdi,r14
      efac07:	e8 7a 38 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efac0c:	31 ff                	xor    edi,edi
      efac0e:	e8 73 38 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efac13:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efac18:	8a 98 d1 01 00 00    	mov    bl,BYTE PTR [rax+0x1d1]
      efac1e:	bf 90 0c 00 00       	mov    edi,0xc90
      efac23:	e8 d8 32 8f 00       	call   17edf00 <_Znwm@plt>
      efac28:	49 89 c7             	mov    r15,rax
      efac2b:	66 0f ef c0          	pxor   xmm0,xmm0
      efac2f:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      efac34:	48 8d 05 5d 12 94 00 	lea    rax,[rip+0x94125d]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      efac3b:	49 89 07             	mov    QWORD PTR [r15],rax
      efac3e:	6a 20                	push   0x20
      efac40:	5f                   	pop    rdi
      efac41:	e8 ba 32 8f 00       	call   17edf00 <_Znwm@plt>
      efac46:	48 8b b4 24 80 00 00 	mov    rsi,QWORD PTR [rsp+0x80]
      efac4d:	00 
      efac4e:	49 89 c5             	mov    r13,rax
      efac51:	66 0f ef c0          	pxor   xmm0,xmm0
      efac55:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      efac5a:	48 8d 05 cf 28 90 00 	lea    rax,[rip+0x9028cf]        # 17fd530 <_ZNSt6__ndk119__shared_weak_countD2Ev@@Base+0xe25750>
      efac61:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      efac65:	49 89 6d 18          	mov    QWORD PTR [r13+0x18],rbp
      efac69:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efac70:	00 
      efac71:	e8 1a f6 b7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      efac76:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      efac7d:	00 
      efac7e:	48 8b b4 24 f0 00 00 	mov    rsi,QWORD PTR [rsp+0xf0]
      efac85:	00 
      efac86:	e8 05 f6 b7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      efac8b:	48 8d 35 13 8c 43 ff 	lea    rsi,[rip+0xffffffffff438c13]        # 3338a5 <_ZTSSt12bad_any_cast@@Base-0x5c923>

### 0xefad47: mov    rcx,QWORD PTR [rsp+0x60]
      efacf6:	41 be f8 01 00 00    	mov    r14d,0x1f8
      efacfc:	4c 01 f0             	add    rax,r14
      efacff:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
      efad03:	e8 7e 37 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efad08:	48 8d 05 41 64 94 00 	lea    rax,[rip+0x946441]        # 1841150 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x130e8>
      efad0f:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efad13:	48 8d 05 26 64 94 00 	lea    rax,[rip+0x946426]        # 1841140 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x130d8>
      efad1a:	4c 01 f0             	add    rax,r14
      efad1d:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
      efad21:	41 88 5f 50          	mov    BYTE PTR [r15+0x50],bl
      efad25:	49 89 6f 58          	mov    QWORD PTR [r15+0x58],rbp
      efad29:	4d 89 6f 60          	mov    QWORD PTR [r15+0x60],r13
      efad2d:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
      efad32:	4d 89 67 68          	mov    QWORD PTR [r15+0x68],r12
      efad36:	48 8b 84 24 08 01 00 	mov    rax,QWORD PTR [rsp+0x108]
      efad3d:	00 
      efad3e:	49 89 47 70          	mov    QWORD PTR [r15+0x70],rax
      efad42:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efad47:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efad4c:	48 8b 81 d8 02 00 00 	mov    rax,QWORD PTR [rcx+0x2d8]
      efad53:	66 0f 6f 81 d0 02 00 	movdqa xmm0,XMMWORD PTR [rcx+0x2d0]
      efad5a:	00 
      efad5b:	f3 41 0f 7f 47 78    	movdqu XMMWORD PTR [r15+0x78],xmm0
      efad61:	48 85 c0             	test   rax,rax
      efad64:	74 05                	je     efad6b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2181>
      efad66:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efad6b:	31 c0                	xor    eax,eax
      efad6d:	41 88 87 a0 01 00 00 	mov    BYTE PTR [r15+0x1a0],al
      efad74:	41 88 87 a8 01 00 00 	mov    BYTE PTR [r15+0x1a8],al
      efad7b:	41 88 87 60 02 00 00 	mov    BYTE PTR [r15+0x260],al
      efad82:	66 0f ef c0          	pxor   xmm0,xmm0
      efad86:	f3 41 0f 7f 87 88 00 	movdqu XMMWORD PTR [r15+0x88],xmm0
      efad8d:	00 00 
      efad8f:	f3 41 0f 7f 87 98 00 	movdqu XMMWORD PTR [r15+0x98],xmm0
      efad96:	00 00 
      efad98:	f3 41 0f 7f 87 a1 00 	movdqu XMMWORD PTR [r15+0xa1],xmm0
      efad9f:	00 00 
      efada1:	48 8d 35 38 bf 46 ff 	lea    rsi,[rip+0xffffffffff46bf38]        # 366ce0 <_ZTSSt12bad_any_cast@@Base-0x294e8>
      efada8:	48 8d bc 24 c0 0a 00 	lea    rdi,[rsp+0xac0]
      efadaf:	00 
      efadb0:	e8 c9 ec b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      efadb5:	49 8d bf 68 02 00 00 	lea    rdi,[r15+0x268]
      efadbc:	48 8d b4 24 c0 0a 00 	lea    rsi,[rsp+0xac0]
      efadc3:	00 
      efadc4:	48 8d 94 24 e0 06 00 	lea    rdx,[rsp+0x6e0]
      efadcb:	00 
      efadcc:	e8 dd 44 0e 00       	call   fdf2ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a66c4>

### 0xefaf8c: mov    rax,QWORD PTR [rsp+0x60]
      efaf47:	48 89 ef             	mov    rdi,rbp
      efaf4a:	e8 1b f0 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efaf4f:	4c 89 ef             	mov    rdi,r13
      efaf52:	e8 2f 35 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efaf57:	48 8d 9c 24 00 02 00 	lea    rbx,[rsp+0x200]
      efaf5e:	00 
      efaf5f:	48 89 df             	mov    rdi,rbx
      efaf62:	4c 89 f6             	mov    rsi,r14
      efaf65:	4c 89 fa             	mov    rdx,r15
      efaf68:	e8 97 38 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efaf6d:	31 ff                	xor    edi,edi
      efaf6f:	e8 a8 34 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efaf74:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efaf78:	66 0f 7f 44 24 70    	movdqa XMMWORD PTR [rsp+0x70],xmm0
      efaf7e:	31 ff                	xor    edi,edi
      efaf80:	e8 01 35 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efaf85:	31 ff                	xor    edi,edi
      efaf87:	e8 fa 34 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efaf8c:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efaf91:	8a 80 b6 01 00 00    	mov    al,BYTE PTR [rax+0x1b6]
      efaf97:	48 83 a4 24 b0 01 00 	and    QWORD PTR [rsp+0x1b0],0x0
      efaf9e:	00 00 
      efafa0:	66 0f ef c0          	pxor   xmm0,xmm0
      efafa4:	66 0f 7f 84 24 a0 01 	movdqa XMMWORD PTR [rsp+0x1a0],xmm0
      efafab:	00 00 
      efafad:	44 38 e0             	cmp    al,r12b
      efafb0:	0f 84 16 02 00 00    	je     efb1cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc25e2>
      efafb6:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efafbb:	66 0f 6f 80 f0 02 00 	movdqa xmm0,XMMWORD PTR [rax+0x2f0]
      efafc2:	00 
      efafc3:	4c 8b a0 f8 02 00 00 	mov    r12,QWORD PTR [rax+0x2f8]
      efafca:	4d 85 e4             	test   r12,r12
      efafcd:	74 06                	je     efafd5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc23eb>
      efafcf:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      efafd5:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efafda:	48 8b 98 e0 02 00 00 	mov    rbx,QWORD PTR [rax+0x2e0]
      efafe1:	48 89 9c 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rbx
      efafe8:	00 
      efafe9:	4c 8b b0 e8 02 00 00 	mov    r14,QWORD PTR [rax+0x2e8]
      efaff0:	4c 89 b4 24 08 02 00 	mov    QWORD PTR [rsp+0x208],r14
      efaff7:	00 
      efaff8:	4d 85 f6             	test   r14,r14
      efaffb:	74 05                	je     efb002 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2418>
      efaffd:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      efb002:	f3 0f 7f 84 24 10 02 	movdqu XMMWORD PTR [rsp+0x210],xmm0
      efb009:	00 00 
      efb00b:	4d 85 e4             	test   r12,r12

### 0xefafb6: mov    rax,QWORD PTR [rsp+0x60]
      efaf68:	e8 97 38 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efaf6d:	31 ff                	xor    edi,edi
      efaf6f:	e8 a8 34 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efaf74:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efaf78:	66 0f 7f 44 24 70    	movdqa XMMWORD PTR [rsp+0x70],xmm0
      efaf7e:	31 ff                	xor    edi,edi
      efaf80:	e8 01 35 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efaf85:	31 ff                	xor    edi,edi
      efaf87:	e8 fa 34 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efaf8c:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efaf91:	8a 80 b6 01 00 00    	mov    al,BYTE PTR [rax+0x1b6]
      efaf97:	48 83 a4 24 b0 01 00 	and    QWORD PTR [rsp+0x1b0],0x0
      efaf9e:	00 00 
      efafa0:	66 0f ef c0          	pxor   xmm0,xmm0
      efafa4:	66 0f 7f 84 24 a0 01 	movdqa XMMWORD PTR [rsp+0x1a0],xmm0
      efafab:	00 00 
      efafad:	44 38 e0             	cmp    al,r12b
      efafb0:	0f 84 16 02 00 00    	je     efb1cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc25e2>
      efafb6:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efafbb:	66 0f 6f 80 f0 02 00 	movdqa xmm0,XMMWORD PTR [rax+0x2f0]
      efafc2:	00 
      efafc3:	4c 8b a0 f8 02 00 00 	mov    r12,QWORD PTR [rax+0x2f8]
      efafca:	4d 85 e4             	test   r12,r12
      efafcd:	74 06                	je     efafd5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc23eb>
      efafcf:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      efafd5:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efafda:	48 8b 98 e0 02 00 00 	mov    rbx,QWORD PTR [rax+0x2e0]
      efafe1:	48 89 9c 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rbx
      efafe8:	00 
      efafe9:	4c 8b b0 e8 02 00 00 	mov    r14,QWORD PTR [rax+0x2e8]
      efaff0:	4c 89 b4 24 08 02 00 	mov    QWORD PTR [rsp+0x208],r14
      efaff7:	00 
      efaff8:	4d 85 f6             	test   r14,r14
      efaffb:	74 05                	je     efb002 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2418>
      efaffd:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      efb002:	f3 0f 7f 84 24 10 02 	movdqu XMMWORD PTR [rsp+0x210],xmm0
      efb009:	00 00 
      efb00b:	4d 85 e4             	test   r12,r12
      efb00e:	74 06                	je     efb016 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc242c>
      efb010:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      efb016:	48 83 a4 24 30 07 00 	and    QWORD PTR [rsp+0x730],0x0
      efb01d:	00 00 
      efb01f:	6a 28                	push   0x28
      efb021:	5f                   	pop    rdi
      efb022:	e8 d9 2e 8f 00       	call   17edf00 <_Znwm@plt>
      efb027:	48 8d 8c 24 10 02 00 	lea    rcx,[rsp+0x210]
      efb02e:	00 

### 0xefafd5: mov    rax,QWORD PTR [rsp+0x60]
      efaf85:	31 ff                	xor    edi,edi
      efaf87:	e8 fa 34 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efaf8c:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efaf91:	8a 80 b6 01 00 00    	mov    al,BYTE PTR [rax+0x1b6]
      efaf97:	48 83 a4 24 b0 01 00 	and    QWORD PTR [rsp+0x1b0],0x0
      efaf9e:	00 00 
      efafa0:	66 0f ef c0          	pxor   xmm0,xmm0
      efafa4:	66 0f 7f 84 24 a0 01 	movdqa XMMWORD PTR [rsp+0x1a0],xmm0
      efafab:	00 00 
      efafad:	44 38 e0             	cmp    al,r12b
      efafb0:	0f 84 16 02 00 00    	je     efb1cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc25e2>
      efafb6:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efafbb:	66 0f 6f 80 f0 02 00 	movdqa xmm0,XMMWORD PTR [rax+0x2f0]
      efafc2:	00 
      efafc3:	4c 8b a0 f8 02 00 00 	mov    r12,QWORD PTR [rax+0x2f8]
      efafca:	4d 85 e4             	test   r12,r12
      efafcd:	74 06                	je     efafd5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc23eb>
      efafcf:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      efafd5:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efafda:	48 8b 98 e0 02 00 00 	mov    rbx,QWORD PTR [rax+0x2e0]
      efafe1:	48 89 9c 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rbx
      efafe8:	00 
      efafe9:	4c 8b b0 e8 02 00 00 	mov    r14,QWORD PTR [rax+0x2e8]
      efaff0:	4c 89 b4 24 08 02 00 	mov    QWORD PTR [rsp+0x208],r14
      efaff7:	00 
      efaff8:	4d 85 f6             	test   r14,r14
      efaffb:	74 05                	je     efb002 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2418>
      efaffd:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      efb002:	f3 0f 7f 84 24 10 02 	movdqu XMMWORD PTR [rsp+0x210],xmm0
      efb009:	00 00 
      efb00b:	4d 85 e4             	test   r12,r12
      efb00e:	74 06                	je     efb016 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc242c>
      efb010:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      efb016:	48 83 a4 24 30 07 00 	and    QWORD PTR [rsp+0x730],0x0
      efb01d:	00 00 
      efb01f:	6a 28                	push   0x28
      efb021:	5f                   	pop    rdi
      efb022:	e8 d9 2e 8f 00       	call   17edf00 <_Znwm@plt>
      efb027:	48 8d 8c 24 10 02 00 	lea    rcx,[rsp+0x210]
      efb02e:	00 
      efb02f:	48 8d 15 aa b6 93 00 	lea    rdx,[rip+0x93b6aa]        # 18366e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8678>
      efb036:	48 89 10             	mov    QWORD PTR [rax],rdx
      efb039:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
      efb03d:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
      efb041:	66 0f ef c0          	pxor   xmm0,xmm0
      efb045:	66 0f 7f 41 f0       	movdqa XMMWORD PTR [rcx-0x10],xmm0
      efb04a:	66 0f 6f 09          	movdqa xmm1,XMMWORD PTR [rcx]

### 0xefb494: mov    rax,QWORD PTR [rsp+0x60]
      efb446:	e8 45 2a 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efb44b:	48 8d 35 c8 c1 47 ff 	lea    rsi,[rip+0xffffffffff47c1c8]        # 37761a <_ZTSSt12bad_any_cast@@Base-0x18bae>
      efb452:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efb459:	00 
      efb45a:	e8 1f e6 b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      efb45f:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      efb466:	00 
      efb467:	48 89 df             	mov    rdi,rbx
      efb46a:	e8 21 26 f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
      efb46f:	4c 8d ac 24 10 07 00 	lea    r13,[rsp+0x710]
      efb476:	00 
      efb477:	4c 89 ef             	mov    rdi,r13
      efb47a:	e8 11 2a 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efb47f:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      efb486:	00 
      efb487:	48 8b b4 24 00 01 00 	mov    rsi,QWORD PTR [rsp+0x100]
      efb48e:	00 
      efb48f:	e8 97 31 00 00       	call   efe62b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5a41>
      efb494:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efb499:	48 8b b8 40 02 00 00 	mov    rdi,QWORD PTR [rax+0x240]
      efb4a0:	e8 bd ef b7 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      efb4a5:	49 89 c4             	mov    r12,rax
      efb4a8:	48 b8 61 75 74 6f 70 	movabs rax,0x79616c706f747561
      efb4af:	6c 61 79 
      efb4b2:	c6 84 24 e0 01 00 00 	mov    BYTE PTR [rsp+0x1e0],0x10
      efb4b9:	10 
      efb4ba:	48 89 84 24 e1 01 00 	mov    QWORD PTR [rsp+0x1e1],rax
      efb4c1:	00 
      efb4c2:	c6 84 24 e9 01 00 00 	mov    BYTE PTR [rsp+0x1e9],0x0
      efb4c9:	00 
      efb4ca:	bf 20 0c 00 00       	mov    edi,0xc20
      efb4cf:	e8 2c 2a 8f 00       	call   17edf00 <_Znwm@plt>
      efb4d4:	49 89 c6             	mov    r14,rax
      efb4d7:	66 0f ef c0          	pxor   xmm0,xmm0
      efb4db:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      efb4e0:	48 8d 05 b1 09 94 00 	lea    rax,[rip+0x9409b1]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      efb4e7:	49 89 06             	mov    QWORD PTR [r14],rax
      efb4ea:	66 0f 6f 8c 24 70 01 	movdqa xmm1,XMMWORD PTR [rsp+0x170]
      efb4f1:	00 00 
      efb4f3:	66 0f 7f 8c 24 c0 00 	movdqa XMMWORD PTR [rsp+0xc0],xmm1
      efb4fa:	00 00 
      efb4fc:	66 0f 7f 84 24 70 01 	movdqa XMMWORD PTR [rsp+0x170],xmm0
      efb503:	00 00 
      efb505:	48 8b 84 24 b0 00 00 	mov    rax,QWORD PTR [rsp+0xb0]
      efb50c:	00 
      efb50d:	48 85 c0             	test   rax,rax
      efb510:	74 24                	je     efb536 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc294c>

### 0xefb566: mov    rcx,QWORD PTR [rsp+0x60]
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

### 0xefb5d7: mov    rsi,QWORD PTR [rsp+0x60]
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

### 0xefba24: mov    rax,QWORD PTR [rsp+0x60]
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

### 0xefba5c: mov    rax,QWORD PTR [rsp+0x60]
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

### 0xefba81: mov    rax,QWORD PTR [rsp+0x60]
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

### 0xefbad5: mov    rcx,QWORD PTR [rsp+0x60]
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

### 0xefbe56: mov    rcx,QWORD PTR [rsp+0x60]
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

### 0xefbf94: mov    rax,QWORD PTR [rsp+0x60]
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

### 0xefc13b: mov    rax,QWORD PTR [rsp+0x60]
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

### 0xefc14d: mov    rax,QWORD PTR [rsp+0x60]
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

### 0xefc199: mov    rax,QWORD PTR [rsp+0x60]
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

### 0xefc232: mov    rbp,QWORD PTR [rsp+0x60]
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

### 0xefc2ad: mov    rdx,QWORD PTR [rsp+0x60]
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

### 0xefc61e: mov    rbx,QWORD PTR [rsp+0x60]
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

### 0xefc768: mov    rbx,QWORD PTR [rsp+0x60]
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
      efc77f:	e8 7c 17 8f 00       	call   17edf00 <_Znwm@plt>
      efc784:	49 89 c6             	mov    r14,rax
      efc787:	49 89 c7             	mov    r15,rax
      efc78a:	66 0f ef c0          	pxor   xmm0,xmm0
      efc78e:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      efc794:	48 8d 05 25 e0 93 00 	lea    rax,[rip+0x93e025]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efc79b:	49 89 06             	mov    QWORD PTR [r14],rax
      efc79e:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efc7a3:	0f 28 80 f0 02 00 00 	movaps xmm0,XMMWORD PTR [rax+0x2f0]
      efc7aa:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
      efc7b1:	00 
      efc7b2:	48 8b 80 f8 02 00 00 	mov    rax,QWORD PTR [rax+0x2f8]
      efc7b9:	48 85 c0             	test   rax,rax
      efc7bc:	74 05                	je     efc7c3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3bd9>
      efc7be:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efc7c3:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      efc7c9:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efc7cd:	48 85 c0             	test   rax,rax
      efc7d0:	74 05                	je     efc7d7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3bed>
      efc7d2:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efc7d7:	48 8d 05 ea 6d 94 00 	lea    rax,[rip+0x946dea]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efc7de:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efc7e2:	66 0f ef c9          	pxor   xmm1,xmm1
      efc7e6:	f3 41 0f 7f 4f 28    	movdqu XMMWORD PTR [r15+0x28],xmm1
      efc7ec:	48 8d 05 35 df 93 00 	lea    rax,[rip+0x93df35]        # 183a728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc6c0>

### 0xefc79e: mov    rax,QWORD PTR [rsp+0x60]
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
      efc77f:	e8 7c 17 8f 00       	call   17edf00 <_Znwm@plt>
      efc784:	49 89 c6             	mov    r14,rax
      efc787:	49 89 c7             	mov    r15,rax
      efc78a:	66 0f ef c0          	pxor   xmm0,xmm0
      efc78e:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      efc794:	48 8d 05 25 e0 93 00 	lea    rax,[rip+0x93e025]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efc79b:	49 89 06             	mov    QWORD PTR [r14],rax
      efc79e:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efc7a3:	0f 28 80 f0 02 00 00 	movaps xmm0,XMMWORD PTR [rax+0x2f0]
      efc7aa:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
      efc7b1:	00 
      efc7b2:	48 8b 80 f8 02 00 00 	mov    rax,QWORD PTR [rax+0x2f8]
      efc7b9:	48 85 c0             	test   rax,rax
      efc7bc:	74 05                	je     efc7c3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3bd9>
      efc7be:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efc7c3:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      efc7c9:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efc7cd:	48 85 c0             	test   rax,rax
      efc7d0:	74 05                	je     efc7d7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3bed>
      efc7d2:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efc7d7:	48 8d 05 ea 6d 94 00 	lea    rax,[rip+0x946dea]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efc7de:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efc7e2:	66 0f ef c9          	pxor   xmm1,xmm1
      efc7e6:	f3 41 0f 7f 4f 28    	movdqu XMMWORD PTR [r15+0x28],xmm1
      efc7ec:	48 8d 05 35 df 93 00 	lea    rax,[rip+0x93df35]        # 183a728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc6c0>
      efc7f3:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efc7f7:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0
      efc7fd:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efc804:	48 85 ff             	test   rdi,rdi
      efc807:	74 05                	je     efc80e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3c24>
      efc809:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efc80e:	49 83 c6 18          	add    r14,0x18
      efc812:	48 8d 05 ff dc 93 00 	lea    rax,[rip+0x93dcff]        # 183a518 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc4b0>
      efc819:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efc81d:	48 8d 05 dc de 93 00 	lea    rax,[rip+0x93dedc]        # 183a700 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc698>
      efc824:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax

### 0xefc8d0: mov    rax,QWORD PTR [rsp+0x60]
      efc883:	41 88 87 60 01 00 00 	mov    BYTE PTR [r15+0x160],al
      efc88a:	e8 f7 1b ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efc88f:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      efc896:	00 
      efc897:	48 89 df             	mov    rdi,rbx
      efc89a:	4c 89 f6             	mov    rsi,r14
      efc89d:	4c 89 fa             	mov    rdx,r15
      efc8a0:	e8 5f 1f 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efc8a5:	31 ff                	xor    edi,edi
      efc8a7:	e8 70 1b ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efc8ac:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efc8b0:	66 0f ef c9          	pxor   xmm1,xmm1
      efc8b4:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      efc8b8:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efc8bc:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efc8c2:	e8 bf 1b ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efc8c7:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efc8cb:	e8 b6 1b ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efc8d0:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efc8d5:	80 b8 b0 01 00 00 00 	cmp    BYTE PTR [rax+0x1b0],0x0
      efc8dc:	0f 84 52 01 00 00    	je     efca34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3e4a>
      efc8e2:	6a 60                	push   0x60
      efc8e4:	5f                   	pop    rdi
      efc8e5:	e8 16 16 8f 00       	call   17edf00 <_Znwm@plt>
      efc8ea:	49 89 c7             	mov    r15,rax
      efc8ed:	49 89 c6             	mov    r14,rax
      efc8f0:	66 0f ef c0          	pxor   xmm0,xmm0
      efc8f4:	f3 41 0f 7f 47 08    	movdqu XMMWORD PTR [r15+0x8],xmm0
      efc8fa:	48 8d 05 6f 9e 93 00 	lea    rax,[rip+0x939e6f]        # 1836770 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8708>
      efc901:	49 89 07             	mov    QWORD PTR [r15],rax
      efc904:	48 8d 05 85 34 94 00 	lea    rax,[rip+0x943485]        # 183fd90 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11d28>
      efc90b:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efc90f:	49 8d 7f 30          	lea    rdi,[r15+0x30]
      efc913:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efc918:	66 0f 6f 80 50 01 00 	movdqa xmm0,XMMWORD PTR [rax+0x150]
      efc91f:	00 
      efc920:	e8 71 57 00 00       	call   f02096 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc94ac>
      efc925:	6a 58                	push   0x58
      efc927:	5f                   	pop    rdi
      efc928:	e8 d3 15 8f 00       	call   17edf00 <_Znwm@plt>
      efc92d:	49 89 c5             	mov    r13,rax
      efc930:	48 89 c5             	mov    rbp,rax
      efc933:	66 0f ef c0          	pxor   xmm0,xmm0
      efc937:	f3 41 0f 7f 45 08    	movdqu XMMWORD PTR [r13+0x8],xmm0
      efc93d:	48 8d 05 7c de 93 00 	lea    rax,[rip+0x93de7c]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efc944:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      efc948:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]

### 0xefc913: mov    rax,QWORD PTR [rsp+0x60]
      efc8c2:	e8 bf 1b ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efc8c7:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efc8cb:	e8 b6 1b ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efc8d0:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efc8d5:	80 b8 b0 01 00 00 00 	cmp    BYTE PTR [rax+0x1b0],0x0
      efc8dc:	0f 84 52 01 00 00    	je     efca34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3e4a>
      efc8e2:	6a 60                	push   0x60
      efc8e4:	5f                   	pop    rdi
      efc8e5:	e8 16 16 8f 00       	call   17edf00 <_Znwm@plt>
      efc8ea:	49 89 c7             	mov    r15,rax
      efc8ed:	49 89 c6             	mov    r14,rax
      efc8f0:	66 0f ef c0          	pxor   xmm0,xmm0
      efc8f4:	f3 41 0f 7f 47 08    	movdqu XMMWORD PTR [r15+0x8],xmm0
      efc8fa:	48 8d 05 6f 9e 93 00 	lea    rax,[rip+0x939e6f]        # 1836770 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8708>
      efc901:	49 89 07             	mov    QWORD PTR [r15],rax
      efc904:	48 8d 05 85 34 94 00 	lea    rax,[rip+0x943485]        # 183fd90 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11d28>
      efc90b:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efc90f:	49 8d 7f 30          	lea    rdi,[r15+0x30]
      efc913:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efc918:	66 0f 6f 80 50 01 00 	movdqa xmm0,XMMWORD PTR [rax+0x150]
      efc91f:	00 
      efc920:	e8 71 57 00 00       	call   f02096 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc94ac>
      efc925:	6a 58                	push   0x58
      efc927:	5f                   	pop    rdi
      efc928:	e8 d3 15 8f 00       	call   17edf00 <_Znwm@plt>
      efc92d:	49 89 c5             	mov    r13,rax
      efc930:	48 89 c5             	mov    rbp,rax
      efc933:	66 0f ef c0          	pxor   xmm0,xmm0
      efc937:	f3 41 0f 7f 45 08    	movdqu XMMWORD PTR [r13+0x8],xmm0
      efc93d:	48 8d 05 7c de 93 00 	lea    rax,[rip+0x93de7c]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efc944:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      efc948:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
      efc94d:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      efc951:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      efc955:	48 85 c0             	test   rax,rax
      efc958:	74 05                	je     efc95f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3d75>
      efc95a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efc95f:	49 83 c7 20          	add    r15,0x20
      efc963:	49 83 c5 18          	add    r13,0x18
      efc967:	48 8d 05 5a 6c 94 00 	lea    rax,[rip+0x946c5a]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efc96e:	48 89 45 18          	mov    QWORD PTR [rbp+0x18],rax
      efc972:	66 0f ef c9          	pxor   xmm1,xmm1
      efc976:	f3 0f 7f 4d 28       	movdqu XMMWORD PTR [rbp+0x28],xmm1
      efc97b:	48 8d 05 36 34 94 00 	lea    rax,[rip+0x943436]        # 183fdb8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11d50>
      efc982:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
      efc986:	f3 0f 7f 45 38       	movdqu XMMWORD PTR [rbp+0x38],xmm0
      efc98b:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1

### 0xefca34: mov    rax,QWORD PTR [rsp+0x60]
      efc9ee:	00 
      efc9ef:	48 89 df             	mov    rdi,rbx
      efc9f2:	4c 89 ee             	mov    rsi,r13
      efc9f5:	48 89 ea             	mov    rdx,rbp
      efc9f8:	e8 07 1e 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efc9fd:	31 ff                	xor    edi,edi
      efc9ff:	e8 18 1a ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efca04:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efca08:	66 0f ef c9          	pxor   xmm1,xmm1
      efca0c:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      efca10:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      efca15:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efca19:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efca1f:	e8 62 1a ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efca24:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efca28:	e8 59 1a ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efca2d:	31 ff                	xor    edi,edi
      efca2f:	e8 52 1a ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efca34:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efca39:	80 b8 d2 01 00 00 00 	cmp    BYTE PTR [rax+0x1d2],0x0
      efca40:	0f 84 6b 01 00 00    	je     efcbb1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3fc7>
      efca46:	48 8b 98 58 03 00 00 	mov    rbx,QWORD PTR [rax+0x358]
      efca4d:	48 85 db             	test   rbx,rbx
      efca50:	0f 84 5b 01 00 00    	je     efcbb1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3fc7>
      efca56:	4c 8b a0 38 01 00 00 	mov    r12,QWORD PTR [rax+0x138]
      efca5d:	4c 8b a8 40 01 00 00 	mov    r13,QWORD PTR [rax+0x140]
      efca64:	6a 38                	push   0x38
      efca66:	5f                   	pop    rdi
      efca67:	e8 94 14 8f 00       	call   17edf00 <_Znwm@plt>
      efca6c:	49 89 c7             	mov    r15,rax
      efca6f:	49 89 c6             	mov    r14,rax
      efca72:	66 0f ef c0          	pxor   xmm0,xmm0
      efca76:	f3 41 0f 7f 47 08    	movdqu XMMWORD PTR [r15+0x8],xmm0
      efca7c:	48 8d 05 e5 09 90 00 	lea    rax,[rip+0x9009e5]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      efca83:	49 89 07             	mov    QWORD PTR [r15],rax
      efca86:	48 8d 05 eb 79 94 00 	lea    rax,[rip+0x9479eb]        # 1844478 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xb60>
      efca8d:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efca91:	4d 89 6f 20          	mov    QWORD PTR [r15+0x20],r13
      efca95:	49 89 5f 28          	mov    QWORD PTR [r15+0x28],rbx
      efca99:	4d 89 67 30          	mov    QWORD PTR [r15+0x30],r12
      efca9d:	6a 58                	push   0x58
      efca9f:	5f                   	pop    rdi
      efcaa0:	e8 5b 14 8f 00       	call   17edf00 <_Znwm@plt>
      efcaa5:	49 89 c5             	mov    r13,rax
      efcaa8:	48 89 c5             	mov    rbp,rax
      efcaab:	66 0f ef c0          	pxor   xmm0,xmm0
      efcaaf:	f3 41 0f 7f 45 08    	movdqu XMMWORD PTR [r13+0x8],xmm0

### 0xefcbac: mov    rax,QWORD PTR [rsp+0x60]
      efcb66:	00 
      efcb67:	48 89 df             	mov    rdi,rbx
      efcb6a:	4c 89 ee             	mov    rsi,r13
      efcb6d:	48 89 ea             	mov    rdx,rbp
      efcb70:	e8 8f 1c 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efcb75:	31 ff                	xor    edi,edi
      efcb77:	e8 a0 18 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efcb7c:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efcb80:	66 0f ef c9          	pxor   xmm1,xmm1
      efcb84:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      efcb88:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      efcb8d:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efcb91:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efcb97:	e8 ea 18 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcb9c:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efcba0:	e8 e1 18 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcba5:	31 ff                	xor    edi,edi
      efcba7:	e8 da 18 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcbac:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efcbb1:	80 b8 f4 01 00 00 00 	cmp    BYTE PTR [rax+0x1f4],0x0
      efcbb8:	0f 84 55 01 00 00    	je     efcd13 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4129>
      efcbbe:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efcbc3:	48 83 b8 60 03 00 00 	cmp    QWORD PTR [rax+0x360],0x0
      efcbca:	00 
      efcbcb:	0f 84 42 01 00 00    	je     efcd13 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4129>
      efcbd1:	bf 10 01 00 00       	mov    edi,0x110
      efcbd6:	e8 25 13 8f 00       	call   17edf00 <_Znwm@plt>
      efcbdb:	49 89 c6             	mov    r14,rax
      efcbde:	49 89 c7             	mov    r15,rax
      efcbe1:	66 0f ef c9          	pxor   xmm1,xmm1
      efcbe5:	f3 41 0f 7f 4e 08    	movdqu XMMWORD PTR [r14+0x8],xmm1
      efcbeb:	48 8d 05 ce db 93 00 	lea    rax,[rip+0x93dbce]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efcbf2:	49 89 06             	mov    QWORD PTR [r14],rax
      efcbf5:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      efcbfb:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efcbff:	48 85 c0             	test   rax,rax
      efcc02:	74 05                	je     efcc09 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc401f>
      efcc04:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efcc09:	48 8d 05 b8 69 94 00 	lea    rax,[rip+0x9469b8]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efcc10:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efcc14:	f3 41 0f 7f 4f 28    	movdqu XMMWORD PTR [r15+0x28],xmm1
      efcc1a:	48 8d 05 97 15 94 00 	lea    rax,[rip+0x941597]        # 183e1b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10150>
      efcc21:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efcc25:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0
      efcc2b:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efcc32:	48 85 ff             	test   rdi,rdi
      efcc35:	74 05                	je     efcc3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4052>

### 0xefcbbe: mov    rax,QWORD PTR [rsp+0x60]
      efcb6d:	48 89 ea             	mov    rdx,rbp
      efcb70:	e8 8f 1c 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efcb75:	31 ff                	xor    edi,edi
      efcb77:	e8 a0 18 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efcb7c:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efcb80:	66 0f ef c9          	pxor   xmm1,xmm1
      efcb84:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      efcb88:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      efcb8d:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efcb91:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efcb97:	e8 ea 18 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcb9c:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efcba0:	e8 e1 18 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcba5:	31 ff                	xor    edi,edi
      efcba7:	e8 da 18 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcbac:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efcbb1:	80 b8 f4 01 00 00 00 	cmp    BYTE PTR [rax+0x1f4],0x0
      efcbb8:	0f 84 55 01 00 00    	je     efcd13 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4129>
      efcbbe:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efcbc3:	48 83 b8 60 03 00 00 	cmp    QWORD PTR [rax+0x360],0x0
      efcbca:	00 
      efcbcb:	0f 84 42 01 00 00    	je     efcd13 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4129>
      efcbd1:	bf 10 01 00 00       	mov    edi,0x110
      efcbd6:	e8 25 13 8f 00       	call   17edf00 <_Znwm@plt>
      efcbdb:	49 89 c6             	mov    r14,rax
      efcbde:	49 89 c7             	mov    r15,rax
      efcbe1:	66 0f ef c9          	pxor   xmm1,xmm1
      efcbe5:	f3 41 0f 7f 4e 08    	movdqu XMMWORD PTR [r14+0x8],xmm1
      efcbeb:	48 8d 05 ce db 93 00 	lea    rax,[rip+0x93dbce]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efcbf2:	49 89 06             	mov    QWORD PTR [r14],rax
      efcbf5:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      efcbfb:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efcbff:	48 85 c0             	test   rax,rax
      efcc02:	74 05                	je     efcc09 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc401f>
      efcc04:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efcc09:	48 8d 05 b8 69 94 00 	lea    rax,[rip+0x9469b8]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efcc10:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efcc14:	f3 41 0f 7f 4f 28    	movdqu XMMWORD PTR [r15+0x28],xmm1
      efcc1a:	48 8d 05 97 15 94 00 	lea    rax,[rip+0x941597]        # 183e1b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10150>
      efcc21:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efcc25:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0
      efcc2b:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efcc32:	48 85 ff             	test   rdi,rdi
      efcc35:	74 05                	je     efcc3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4052>
      efcc37:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efcc3c:	49 83 c6 18          	add    r14,0x18
      efcc40:	48 8d 05 99 15 94 00 	lea    rax,[rip+0x941599]        # 183e1e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10178>

### 0xefcc71: mov    rcx,QWORD PTR [rsp+0x60]
      efcc14:	f3 41 0f 7f 4f 28    	movdqu XMMWORD PTR [r15+0x28],xmm1
      efcc1a:	48 8d 05 97 15 94 00 	lea    rax,[rip+0x941597]        # 183e1b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10150>
      efcc21:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efcc25:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0
      efcc2b:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efcc32:	48 85 ff             	test   rdi,rdi
      efcc35:	74 05                	je     efcc3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4052>
      efcc37:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efcc3c:	49 83 c6 18          	add    r14,0x18
      efcc40:	48 8d 05 99 15 94 00 	lea    rax,[rip+0x941599]        # 183e1e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10178>
      efcc47:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efcc4b:	48 8d 05 76 17 94 00 	lea    rax,[rip+0x941776]        # 183e3c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10360>
      efcc52:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efcc56:	e8 2b 18 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcc5b:	48 8d 05 0e 13 94 00 	lea    rax,[rip+0x94130e]        # 183df70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xff08>
      efcc62:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efcc66:	48 8d 05 f3 14 94 00 	lea    rax,[rip+0x9414f3]        # 183e160 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x100f8>
      efcc6d:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efcc71:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efcc76:	48 8b 81 68 03 00 00 	mov    rax,QWORD PTR [rcx+0x368]
      efcc7d:	0f 28 81 60 03 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x360]
      efcc84:	41 0f 11 47 48       	movups XMMWORD PTR [r15+0x48],xmm0
      efcc89:	48 85 c0             	test   rax,rax
      efcc8c:	74 05                	je     efcc93 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc40a9>
      efcc8e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efcc93:	31 c0                	xor    eax,eax
      efcc95:	41 88 47 58          	mov    BYTE PTR [r15+0x58],al
      efcc99:	41 88 87 b0 00 00 00 	mov    BYTE PTR [r15+0xb0],al
      efcca0:	0f 57 c0             	xorps  xmm0,xmm0
      efcca3:	41 0f 11 87 b8 00 00 	movups XMMWORD PTR [r15+0xb8],xmm0
      efccaa:	00 
      efccab:	41 0f 11 87 c8 00 00 	movups XMMWORD PTR [r15+0xc8],xmm0
      efccb2:	00 
      efccb3:	41 0f 11 87 d8 00 00 	movups XMMWORD PTR [r15+0xd8],xmm0
      efccba:	00 
      efccbb:	41 88 87 e8 00 00 00 	mov    BYTE PTR [r15+0xe8],al
      efccc2:	41 0f 11 87 f0 00 00 	movups XMMWORD PTR [r15+0xf0],xmm0
      efccc9:	00 
      efccca:	41 0f 11 87 f9 00 00 	movups XMMWORD PTR [r15+0xf9],xmm0
      efccd1:	00 
      efccd2:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      efccd9:	00 
      efccda:	48 89 df             	mov    rdi,rbx
      efccdd:	4c 89 f6             	mov    rsi,r14
      efcce0:	4c 89 fa             	mov    rdx,r15
      efcce3:	e8 1c 1b 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efcce8:	31 ff                	xor    edi,edi

### 0xefce23: mov    rax,QWORD PTR [rsp+0x60]
      efcdd2:	31 ff                	xor    edi,edi
      efcdd4:	e8 43 16 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efcdd9:	66 41 0f 6f 07       	movdqa xmm0,XMMWORD PTR [r15]
      efcdde:	66 0f ef c9          	pxor   xmm1,xmm1
      efcde2:	66 41 0f 7f 0f       	movdqa XMMWORD PTR [r15],xmm1
      efcde7:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efcdeb:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efcdf1:	e8 90 16 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcdf6:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      efcdfa:	e8 87 16 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcdff:	bf a0 00 00 00       	mov    edi,0xa0
      efce04:	e8 f7 10 8f 00       	call   17edf00 <_Znwm@plt>
      efce09:	49 89 c6             	mov    r14,rax
      efce0c:	49 89 c7             	mov    r15,rax
      efce0f:	66 0f ef c0          	pxor   xmm0,xmm0
      efce13:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      efce19:	48 8d 05 a0 d9 93 00 	lea    rax,[rip+0x93d9a0]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efce20:	49 89 06             	mov    QWORD PTR [r14],rax
      efce23:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efce28:	0f 28 80 70 03 00 00 	movaps xmm0,XMMWORD PTR [rax+0x370]
      efce2f:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
      efce36:	00 
      efce37:	48 8b 80 78 03 00 00 	mov    rax,QWORD PTR [rax+0x378]
      efce3e:	48 85 c0             	test   rax,rax
      efce41:	74 05                	je     efce48 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc425e>
      efce43:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efce48:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efce4d:	0f 28 80 f0 02 00 00 	movaps xmm0,XMMWORD PTR [rax+0x2f0]
      efce54:	0f 29 84 24 e0 00 00 	movaps XMMWORD PTR [rsp+0xe0],xmm0
      efce5b:	00 
      efce5c:	48 8b 80 f8 02 00 00 	mov    rax,QWORD PTR [rax+0x2f8]
      efce63:	48 85 c0             	test   rax,rax
      efce66:	74 05                	je     efce6d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4283>
      efce68:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efce6d:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      efce73:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efce77:	48 85 c0             	test   rax,rax
      efce7a:	74 05                	je     efce81 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4297>
      efce7c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efce81:	49 83 c6 18          	add    r14,0x18
      efce85:	48 8d 05 3c 67 94 00 	lea    rax,[rip+0x94673c]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efce8c:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efce90:	66 0f ef c9          	pxor   xmm1,xmm1
      efce94:	f3 41 0f 7f 4f 28    	movdqu XMMWORD PTR [r15+0x28],xmm1
      efce9a:	48 8d 05 27 01 94 00 	lea    rax,[rip+0x940127]        # 183cfc8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xef60>
      efcea1:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efcea5:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0

### 0xefce48: mov    rax,QWORD PTR [rsp+0x60]
      efcdf6:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      efcdfa:	e8 87 16 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcdff:	bf a0 00 00 00       	mov    edi,0xa0
      efce04:	e8 f7 10 8f 00       	call   17edf00 <_Znwm@plt>
      efce09:	49 89 c6             	mov    r14,rax
      efce0c:	49 89 c7             	mov    r15,rax
      efce0f:	66 0f ef c0          	pxor   xmm0,xmm0
      efce13:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      efce19:	48 8d 05 a0 d9 93 00 	lea    rax,[rip+0x93d9a0]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efce20:	49 89 06             	mov    QWORD PTR [r14],rax
      efce23:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efce28:	0f 28 80 70 03 00 00 	movaps xmm0,XMMWORD PTR [rax+0x370]
      efce2f:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
      efce36:	00 
      efce37:	48 8b 80 78 03 00 00 	mov    rax,QWORD PTR [rax+0x378]
      efce3e:	48 85 c0             	test   rax,rax
      efce41:	74 05                	je     efce48 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc425e>
      efce43:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efce48:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efce4d:	0f 28 80 f0 02 00 00 	movaps xmm0,XMMWORD PTR [rax+0x2f0]
      efce54:	0f 29 84 24 e0 00 00 	movaps XMMWORD PTR [rsp+0xe0],xmm0
      efce5b:	00 
      efce5c:	48 8b 80 f8 02 00 00 	mov    rax,QWORD PTR [rax+0x2f8]
      efce63:	48 85 c0             	test   rax,rax
      efce66:	74 05                	je     efce6d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4283>
      efce68:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efce6d:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      efce73:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efce77:	48 85 c0             	test   rax,rax
      efce7a:	74 05                	je     efce81 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4297>
      efce7c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efce81:	49 83 c6 18          	add    r14,0x18
      efce85:	48 8d 05 3c 67 94 00 	lea    rax,[rip+0x94673c]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efce8c:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efce90:	66 0f ef c9          	pxor   xmm1,xmm1
      efce94:	f3 41 0f 7f 4f 28    	movdqu XMMWORD PTR [r15+0x28],xmm1
      efce9a:	48 8d 05 27 01 94 00 	lea    rax,[rip+0x940127]        # 183cfc8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xef60>
      efcea1:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efcea5:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0
      efceab:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efceb2:	48 85 ff             	test   rdi,rdi
      efceb5:	74 05                	je     efcebc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc42d2>
      efceb7:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efcebc:	48 8d 05 f5 fe 93 00 	lea    rax,[rip+0x93fef5]        # 183cdb8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xed50>
      efcec3:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efcec7:	48 8d 05 d2 00 94 00 	lea    rax,[rip+0x9400d2]        # 183cfa0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xef38>
      efcece:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax

### 0xefcf6e: mov    rax,QWORD PTR [rsp+0x60]
      efcf26:	31 ff                	xor    edi,edi
      efcf28:	e8 59 15 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcf2d:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      efcf34:	00 
      efcf35:	48 89 df             	mov    rdi,rbx
      efcf38:	4c 89 f6             	mov    rsi,r14
      efcf3b:	4c 89 fa             	mov    rdx,r15
      efcf3e:	e8 c1 18 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efcf43:	31 ff                	xor    edi,edi
      efcf45:	e8 d2 14 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efcf4a:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efcf4e:	66 0f ef c9          	pxor   xmm1,xmm1
      efcf52:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      efcf56:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efcf5a:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efcf60:	e8 21 15 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcf65:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efcf69:	e8 18 15 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcf6e:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efcf73:	48 8b 78 58          	mov    rdi,QWORD PTR [rax+0x58]
      efcf77:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      efcf7a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      efcf7d:	84 c0                	test   al,al
      efcf7f:	0f 84 3c 01 00 00    	je     efd0c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc44d7>
      efcf85:	4c 8b 64 24 60       	mov    r12,QWORD PTR [rsp+0x60]
      efcf8a:	41 80 bc 24 b9 01 00 	cmp    BYTE PTR [r12+0x1b9],0x0
      efcf91:	00 00 
      efcf93:	0f 84 94 02 00 00    	je     efd22d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4643>
      efcf99:	49 8b 5c 24 58       	mov    rbx,QWORD PTR [r12+0x58]
      efcf9e:	6a 60                	push   0x60
      efcfa0:	5f                   	pop    rdi
      efcfa1:	e8 5a 0f 8f 00       	call   17edf00 <_Znwm@plt>
      efcfa6:	49 89 c6             	mov    r14,rax
      efcfa9:	49 89 c7             	mov    r15,rax
      efcfac:	66 0f ef c0          	pxor   xmm0,xmm0
      efcfb0:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      efcfb6:	48 8d 05 03 d8 93 00 	lea    rax,[rip+0x93d803]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efcfbd:	49 89 06             	mov    QWORD PTR [r14],rax
      efcfc0:	41 0f 28 84 24 f0 02 	movaps xmm0,XMMWORD PTR [r12+0x2f0]
      efcfc7:	00 00 
      efcfc9:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
      efcfd0:	00 
      efcfd1:	49 8b 84 24 f8 02 00 	mov    rax,QWORD PTR [r12+0x2f8]
      efcfd8:	00 
      efcfd9:	48 85 c0             	test   rax,rax
      efcfdc:	74 05                	je     efcfe3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc43f9>
      efcfde:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]

### 0xefcf85: mov    r12,QWORD PTR [rsp+0x60]
      efcf3b:	4c 89 fa             	mov    rdx,r15
      efcf3e:	e8 c1 18 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efcf43:	31 ff                	xor    edi,edi
      efcf45:	e8 d2 14 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efcf4a:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efcf4e:	66 0f ef c9          	pxor   xmm1,xmm1
      efcf52:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      efcf56:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efcf5a:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efcf60:	e8 21 15 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcf65:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efcf69:	e8 18 15 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcf6e:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efcf73:	48 8b 78 58          	mov    rdi,QWORD PTR [rax+0x58]
      efcf77:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      efcf7a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      efcf7d:	84 c0                	test   al,al
      efcf7f:	0f 84 3c 01 00 00    	je     efd0c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc44d7>
      efcf85:	4c 8b 64 24 60       	mov    r12,QWORD PTR [rsp+0x60]
      efcf8a:	41 80 bc 24 b9 01 00 	cmp    BYTE PTR [r12+0x1b9],0x0
      efcf91:	00 00 
      efcf93:	0f 84 94 02 00 00    	je     efd22d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4643>
      efcf99:	49 8b 5c 24 58       	mov    rbx,QWORD PTR [r12+0x58]
      efcf9e:	6a 60                	push   0x60
      efcfa0:	5f                   	pop    rdi
      efcfa1:	e8 5a 0f 8f 00       	call   17edf00 <_Znwm@plt>
      efcfa6:	49 89 c6             	mov    r14,rax
      efcfa9:	49 89 c7             	mov    r15,rax
      efcfac:	66 0f ef c0          	pxor   xmm0,xmm0
      efcfb0:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      efcfb6:	48 8d 05 03 d8 93 00 	lea    rax,[rip+0x93d803]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efcfbd:	49 89 06             	mov    QWORD PTR [r14],rax
      efcfc0:	41 0f 28 84 24 f0 02 	movaps xmm0,XMMWORD PTR [r12+0x2f0]
      efcfc7:	00 00 
      efcfc9:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
      efcfd0:	00 
      efcfd1:	49 8b 84 24 f8 02 00 	mov    rax,QWORD PTR [r12+0x2f8]
      efcfd8:	00 
      efcfd9:	48 85 c0             	test   rax,rax
      efcfdc:	74 05                	je     efcfe3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc43f9>
      efcfde:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efcfe3:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      efcfe9:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efcfed:	48 85 c0             	test   rax,rax
      efcff0:	74 05                	je     efcff7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc440d>
      efcff2:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efcff7:	49 83 c6 18          	add    r14,0x18

### 0xefd0c1: mov    rax,QWORD PTR [rsp+0x60]
      efd076:	e8 0b 14 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd07b:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      efd082:	00 
      efd083:	48 89 df             	mov    rdi,rbx
      efd086:	4c 89 f6             	mov    rsi,r14
      efd089:	4c 89 fa             	mov    rdx,r15
      efd08c:	e8 73 17 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efd091:	31 ff                	xor    edi,edi
      efd093:	e8 84 13 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efd098:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efd09c:	66 0f ef c9          	pxor   xmm1,xmm1
      efd0a0:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      efd0a4:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efd0a8:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efd0ae:	e8 d3 13 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd0b3:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efd0b7:	e8 ca 13 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd0bc:	e9 94 02 00 00       	jmp    efd355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc476b>
      efd0c1:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efd0c6:	83 b8 60 01 00 00 01 	cmp    DWORD PTR [rax+0x160],0x1
      efd0cd:	0f 85 82 02 00 00    	jne    efd355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc476b>
      efd0d3:	6a 68                	push   0x68
      efd0d5:	5f                   	pop    rdi
      efd0d6:	e8 25 0e 8f 00       	call   17edf00 <_Znwm@plt>
      efd0db:	49 89 c6             	mov    r14,rax
      efd0de:	49 89 c7             	mov    r15,rax
      efd0e1:	66 0f ef c0          	pxor   xmm0,xmm0
      efd0e5:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      efd0eb:	48 8d 05 ce d6 93 00 	lea    rax,[rip+0x93d6ce]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efd0f2:	49 89 06             	mov    QWORD PTR [r14],rax
      efd0f5:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efd0fa:	0f 28 80 80 03 00 00 	movaps xmm0,XMMWORD PTR [rax+0x380]
      efd101:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
      efd108:	00 
      efd109:	48 8b 80 88 03 00 00 	mov    rax,QWORD PTR [rax+0x388]
      efd110:	48 85 c0             	test   rax,rax
      efd113:	74 05                	je     efd11a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4530>
      efd115:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd11a:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efd11f:	0f 28 80 f0 02 00 00 	movaps xmm0,XMMWORD PTR [rax+0x2f0]
      efd126:	0f 29 84 24 e0 00 00 	movaps XMMWORD PTR [rsp+0xe0],xmm0
      efd12d:	00 
      efd12e:	48 8b 80 f8 02 00 00 	mov    rax,QWORD PTR [rax+0x2f8]
      efd135:	48 85 c0             	test   rax,rax
      efd138:	74 05                	je     efd13f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4555>
      efd13a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd13f:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]

### 0xefd0f5: mov    rax,QWORD PTR [rsp+0x60]
      efd0a4:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efd0a8:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efd0ae:	e8 d3 13 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd0b3:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efd0b7:	e8 ca 13 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd0bc:	e9 94 02 00 00       	jmp    efd355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc476b>
      efd0c1:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efd0c6:	83 b8 60 01 00 00 01 	cmp    DWORD PTR [rax+0x160],0x1
      efd0cd:	0f 85 82 02 00 00    	jne    efd355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc476b>
      efd0d3:	6a 68                	push   0x68
      efd0d5:	5f                   	pop    rdi
      efd0d6:	e8 25 0e 8f 00       	call   17edf00 <_Znwm@plt>
      efd0db:	49 89 c6             	mov    r14,rax
      efd0de:	49 89 c7             	mov    r15,rax
      efd0e1:	66 0f ef c0          	pxor   xmm0,xmm0
      efd0e5:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      efd0eb:	48 8d 05 ce d6 93 00 	lea    rax,[rip+0x93d6ce]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efd0f2:	49 89 06             	mov    QWORD PTR [r14],rax
      efd0f5:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efd0fa:	0f 28 80 80 03 00 00 	movaps xmm0,XMMWORD PTR [rax+0x380]
      efd101:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
      efd108:	00 
      efd109:	48 8b 80 88 03 00 00 	mov    rax,QWORD PTR [rax+0x388]
      efd110:	48 85 c0             	test   rax,rax
      efd113:	74 05                	je     efd11a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4530>
      efd115:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd11a:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efd11f:	0f 28 80 f0 02 00 00 	movaps xmm0,XMMWORD PTR [rax+0x2f0]
      efd126:	0f 29 84 24 e0 00 00 	movaps XMMWORD PTR [rsp+0xe0],xmm0
      efd12d:	00 
      efd12e:	48 8b 80 f8 02 00 00 	mov    rax,QWORD PTR [rax+0x2f8]
      efd135:	48 85 c0             	test   rax,rax
      efd138:	74 05                	je     efd13f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4555>
      efd13a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd13f:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      efd145:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efd149:	48 85 c0             	test   rax,rax
      efd14c:	74 05                	je     efd153 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4569>
      efd14e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd153:	49 83 c6 18          	add    r14,0x18
      efd157:	48 8d 05 6a 64 94 00 	lea    rax,[rip+0x94646a]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efd15e:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efd162:	66 0f ef c9          	pxor   xmm1,xmm1
      efd166:	f3 41 0f 7f 4f 28    	movdqu XMMWORD PTR [r15+0x28],xmm1
      efd16c:	48 8d 05 75 e1 93 00 	lea    rax,[rip+0x93e175]        # 183b2e8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd280>
      efd173:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efd177:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0

### 0xefd11a: mov    rax,QWORD PTR [rsp+0x60]
      efd0cd:	0f 85 82 02 00 00    	jne    efd355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc476b>
      efd0d3:	6a 68                	push   0x68
      efd0d5:	5f                   	pop    rdi
      efd0d6:	e8 25 0e 8f 00       	call   17edf00 <_Znwm@plt>
      efd0db:	49 89 c6             	mov    r14,rax
      efd0de:	49 89 c7             	mov    r15,rax
      efd0e1:	66 0f ef c0          	pxor   xmm0,xmm0
      efd0e5:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      efd0eb:	48 8d 05 ce d6 93 00 	lea    rax,[rip+0x93d6ce]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efd0f2:	49 89 06             	mov    QWORD PTR [r14],rax
      efd0f5:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efd0fa:	0f 28 80 80 03 00 00 	movaps xmm0,XMMWORD PTR [rax+0x380]
      efd101:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
      efd108:	00 
      efd109:	48 8b 80 88 03 00 00 	mov    rax,QWORD PTR [rax+0x388]
      efd110:	48 85 c0             	test   rax,rax
      efd113:	74 05                	je     efd11a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4530>
      efd115:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd11a:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efd11f:	0f 28 80 f0 02 00 00 	movaps xmm0,XMMWORD PTR [rax+0x2f0]
      efd126:	0f 29 84 24 e0 00 00 	movaps XMMWORD PTR [rsp+0xe0],xmm0
      efd12d:	00 
      efd12e:	48 8b 80 f8 02 00 00 	mov    rax,QWORD PTR [rax+0x2f8]
      efd135:	48 85 c0             	test   rax,rax
      efd138:	74 05                	je     efd13f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4555>
      efd13a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd13f:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      efd145:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efd149:	48 85 c0             	test   rax,rax
      efd14c:	74 05                	je     efd153 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4569>
      efd14e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd153:	49 83 c6 18          	add    r14,0x18
      efd157:	48 8d 05 6a 64 94 00 	lea    rax,[rip+0x94646a]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efd15e:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efd162:	66 0f ef c9          	pxor   xmm1,xmm1
      efd166:	f3 41 0f 7f 4f 28    	movdqu XMMWORD PTR [r15+0x28],xmm1
      efd16c:	48 8d 05 75 e1 93 00 	lea    rax,[rip+0x93e175]        # 183b2e8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd280>
      efd173:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efd177:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0
      efd17d:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efd184:	48 85 ff             	test   rdi,rdi
      efd187:	74 05                	je     efd18e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc45a4>
      efd189:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efd18e:	48 8d 05 7b e1 93 00 	lea    rax,[rip+0x93e17b]        # 183b310 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd2a8>
      efd195:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efd199:	48 8d 05 58 e3 93 00 	lea    rax,[rip+0x93e358]        # 183b4f8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd490>
      efd1a0:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax

### 0xefd355: mov    rbx,QWORD PTR [rsp+0x60]
      efd30d:	31 ff                	xor    edi,edi
      efd30f:	e8 72 11 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd314:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      efd31b:	00 
      efd31c:	48 89 df             	mov    rdi,rbx
      efd31f:	4c 89 f6             	mov    rsi,r14
      efd322:	4c 89 fa             	mov    rdx,r15
      efd325:	e8 da 14 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efd32a:	31 ff                	xor    edi,edi
      efd32c:	e8 eb 10 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efd331:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efd335:	66 0f ef c9          	pxor   xmm1,xmm1
      efd339:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      efd33d:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efd341:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efd347:	e8 3a 11 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd34c:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efd350:	e8 31 11 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd355:	48 8b 5c 24 60       	mov    rbx,QWORD PTR [rsp+0x60]
      efd35a:	48 83 bb 90 03 00 00 	cmp    QWORD PTR [rbx+0x390],0x0
      efd361:	00 
      efd362:	0f 84 21 02 00 00    	je     efd589 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc499f>
      efd368:	48 83 bb a0 03 00 00 	cmp    QWORD PTR [rbx+0x3a0],0x0
      efd36f:	00 
      efd370:	0f 84 13 02 00 00    	je     efd589 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc499f>
      efd376:	80 bb b3 01 00 00 00 	cmp    BYTE PTR [rbx+0x1b3],0x0
      efd37d:	0f 84 06 02 00 00    	je     efd589 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc499f>
      efd383:	4c 8b 63 50          	mov    r12,QWORD PTR [rbx+0x50]
      efd387:	bf a0 00 00 00       	mov    edi,0xa0
      efd38c:	e8 6f 0b 8f 00       	call   17edf00 <_Znwm@plt>
      efd391:	49 89 c6             	mov    r14,rax
      efd394:	66 0f ef c0          	pxor   xmm0,xmm0
      efd398:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      efd39d:	48 8d 05 1c d4 93 00 	lea    rax,[rip+0x93d41c]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efd3a4:	49 89 06             	mov    QWORD PTR [r14],rax
      efd3a7:	0f b7 ab 74 01 00 00 	movzx  ebp,WORD PTR [rbx+0x174]
      efd3ae:	0f b6 9b 76 01 00 00 	movzx  ebx,BYTE PTR [rbx+0x176]
      efd3b5:	f3 41 0f 6f 4d 00    	movdqu xmm1,XMMWORD PTR [r13+0x0]
      efd3bb:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efd3bf:	48 85 c0             	test   rax,rax
      efd3c2:	74 05                	je     efd3c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc47df>
      efd3c4:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd3c9:	48 8d 05 f8 61 94 00 	lea    rax,[rip+0x9461f8]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efd3d0:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efd3d4:	f3 41 0f 7f 46 28    	movdqu XMMWORD PTR [r14+0x28],xmm0
      efd3da:	48 8d 05 17 1c 94 00 	lea    rax,[rip+0x941c17]        # 183eff8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10f90>
      efd3e1:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax

### 0xefd42d: mov    rcx,QWORD PTR [rsp+0x60]
      efd3d0:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efd3d4:	f3 41 0f 7f 46 28    	movdqu XMMWORD PTR [r14+0x28],xmm0
      efd3da:	48 8d 05 17 1c 94 00 	lea    rax,[rip+0x941c17]        # 183eff8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10f90>
      efd3e1:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efd3e5:	f3 41 0f 7f 4e 38    	movdqu XMMWORD PTR [r14+0x38],xmm1
      efd3eb:	66 48 0f 3a 16 cf 01 	pextrq rdi,xmm1,0x1
      efd3f2:	48 85 ff             	test   rdi,rdi
      efd3f5:	74 05                	je     efd3fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4812>
      efd3f7:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efd3fc:	48 8d 05 1d 1c 94 00 	lea    rax,[rip+0x941c1d]        # 183f020 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10fb8>
      efd403:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efd407:	48 8d 05 fa 1d 94 00 	lea    rax,[rip+0x941dfa]        # 183f208 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x111a0>
      efd40e:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efd412:	e8 6f 10 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd417:	48 8d 05 c2 19 94 00 	lea    rax,[rip+0x9419c2]        # 183ede0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10d78>
      efd41e:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efd422:	48 8d 05 a7 1b 94 00 	lea    rax,[rip+0x941ba7]        # 183efd0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10f68>
      efd429:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efd42d:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efd432:	48 8b 81 98 03 00 00 	mov    rax,QWORD PTR [rcx+0x398]
      efd439:	0f 28 81 90 03 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x390]
      efd440:	41 0f 11 46 48       	movups XMMWORD PTR [r14+0x48],xmm0
      efd445:	48 85 c0             	test   rax,rax
      efd448:	74 05                	je     efd44f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4865>
      efd44a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd44f:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efd454:	48 8b 81 a8 03 00 00 	mov    rax,QWORD PTR [rcx+0x3a8]
      efd45b:	0f 28 81 a0 03 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x3a0]
      efd462:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
      efd467:	48 85 c0             	test   rax,rax
      efd46a:	74 05                	je     efd471 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4887>
      efd46c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd471:	c1 e3 10             	shl    ebx,0x10
      efd474:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efd479:	48 8b 81 b8 03 00 00 	mov    rax,QWORD PTR [rcx+0x3b8]
      efd480:	0f 28 81 b0 03 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x3b0]
      efd487:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
      efd48c:	48 85 c0             	test   rax,rax
      efd48f:	74 05                	je     efd496 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc48ac>
      efd491:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd496:	4d 8d 7e 18          	lea    r15,[r14+0x18]
      efd49a:	09 dd                	or     ebp,ebx
      efd49c:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efd4a1:	48 8b 81 c8 03 00 00 	mov    rax,QWORD PTR [rcx+0x3c8]
      efd4a8:	0f 28 81 c0 03 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x3c0]
      efd4af:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0
      efd4b4:	48 85 c0             	test   rax,rax

### 0xefd44f: mov    rcx,QWORD PTR [rsp+0x60]
      efd3f5:	74 05                	je     efd3fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4812>
      efd3f7:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efd3fc:	48 8d 05 1d 1c 94 00 	lea    rax,[rip+0x941c1d]        # 183f020 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10fb8>
      efd403:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efd407:	48 8d 05 fa 1d 94 00 	lea    rax,[rip+0x941dfa]        # 183f208 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x111a0>
      efd40e:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efd412:	e8 6f 10 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd417:	48 8d 05 c2 19 94 00 	lea    rax,[rip+0x9419c2]        # 183ede0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10d78>
      efd41e:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efd422:	48 8d 05 a7 1b 94 00 	lea    rax,[rip+0x941ba7]        # 183efd0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10f68>
      efd429:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efd42d:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efd432:	48 8b 81 98 03 00 00 	mov    rax,QWORD PTR [rcx+0x398]
      efd439:	0f 28 81 90 03 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x390]
      efd440:	41 0f 11 46 48       	movups XMMWORD PTR [r14+0x48],xmm0
      efd445:	48 85 c0             	test   rax,rax
      efd448:	74 05                	je     efd44f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4865>
      efd44a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd44f:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efd454:	48 8b 81 a8 03 00 00 	mov    rax,QWORD PTR [rcx+0x3a8]
      efd45b:	0f 28 81 a0 03 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x3a0]
      efd462:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
      efd467:	48 85 c0             	test   rax,rax
      efd46a:	74 05                	je     efd471 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4887>
      efd46c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd471:	c1 e3 10             	shl    ebx,0x10
      efd474:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efd479:	48 8b 81 b8 03 00 00 	mov    rax,QWORD PTR [rcx+0x3b8]
      efd480:	0f 28 81 b0 03 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x3b0]
      efd487:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
      efd48c:	48 85 c0             	test   rax,rax
      efd48f:	74 05                	je     efd496 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc48ac>
      efd491:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd496:	4d 8d 7e 18          	lea    r15,[r14+0x18]
      efd49a:	09 dd                	or     ebp,ebx
      efd49c:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efd4a1:	48 8b 81 c8 03 00 00 	mov    rax,QWORD PTR [rcx+0x3c8]
      efd4a8:	0f 28 81 c0 03 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x3c0]
      efd4af:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0
      efd4b4:	48 85 c0             	test   rax,rax
      efd4b7:	74 05                	je     efd4be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc48d4>
      efd4b9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd4be:	89 e8                	mov    eax,ebp
      efd4c0:	c1 e8 10             	shr    eax,0x10
      efd4c3:	89 e9                	mov    ecx,ebp
      efd4c5:	c1 e9 08             	shr    ecx,0x8
      efd4c8:	41 88 ae 88 00 00 00 	mov    BYTE PTR [r14+0x88],bpl

### 0xefd474: mov    rcx,QWORD PTR [rsp+0x60]
      efd41e:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efd422:	48 8d 05 a7 1b 94 00 	lea    rax,[rip+0x941ba7]        # 183efd0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10f68>
      efd429:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efd42d:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efd432:	48 8b 81 98 03 00 00 	mov    rax,QWORD PTR [rcx+0x398]
      efd439:	0f 28 81 90 03 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x390]
      efd440:	41 0f 11 46 48       	movups XMMWORD PTR [r14+0x48],xmm0
      efd445:	48 85 c0             	test   rax,rax
      efd448:	74 05                	je     efd44f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4865>
      efd44a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd44f:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efd454:	48 8b 81 a8 03 00 00 	mov    rax,QWORD PTR [rcx+0x3a8]
      efd45b:	0f 28 81 a0 03 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x3a0]
      efd462:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
      efd467:	48 85 c0             	test   rax,rax
      efd46a:	74 05                	je     efd471 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4887>
      efd46c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd471:	c1 e3 10             	shl    ebx,0x10
      efd474:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efd479:	48 8b 81 b8 03 00 00 	mov    rax,QWORD PTR [rcx+0x3b8]
      efd480:	0f 28 81 b0 03 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x3b0]
      efd487:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
      efd48c:	48 85 c0             	test   rax,rax
      efd48f:	74 05                	je     efd496 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc48ac>
      efd491:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd496:	4d 8d 7e 18          	lea    r15,[r14+0x18]
      efd49a:	09 dd                	or     ebp,ebx
      efd49c:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efd4a1:	48 8b 81 c8 03 00 00 	mov    rax,QWORD PTR [rcx+0x3c8]
      efd4a8:	0f 28 81 c0 03 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x3c0]
      efd4af:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0
      efd4b4:	48 85 c0             	test   rax,rax
      efd4b7:	74 05                	je     efd4be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc48d4>
      efd4b9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd4be:	89 e8                	mov    eax,ebp
      efd4c0:	c1 e8 10             	shr    eax,0x10
      efd4c3:	89 e9                	mov    ecx,ebp
      efd4c5:	c1 e9 08             	shr    ecx,0x8
      efd4c8:	41 88 ae 88 00 00 00 	mov    BYTE PTR [r14+0x88],bpl
      efd4cf:	41 88 8e 89 00 00 00 	mov    BYTE PTR [r14+0x89],cl
      efd4d6:	41 88 86 8a 00 00 00 	mov    BYTE PTR [r14+0x8a],al
      efd4dd:	4c 89 f3             	mov    rbx,r14
      efd4e0:	48 81 c3 8c 00 00 00 	add    rbx,0x8c
      efd4e7:	40 80 e5 01          	and    bpl,0x1
      efd4eb:	41 83 a6 8c 00 00 00 	and    DWORD PTR [r14+0x8c],0x0
      efd4f2:	00 
      efd4f3:	80 e1 01             	and    cl,0x1

### 0xefd49c: mov    rcx,QWORD PTR [rsp+0x60]
      efd44a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd44f:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efd454:	48 8b 81 a8 03 00 00 	mov    rax,QWORD PTR [rcx+0x3a8]
      efd45b:	0f 28 81 a0 03 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x3a0]
      efd462:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
      efd467:	48 85 c0             	test   rax,rax
      efd46a:	74 05                	je     efd471 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4887>
      efd46c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd471:	c1 e3 10             	shl    ebx,0x10
      efd474:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efd479:	48 8b 81 b8 03 00 00 	mov    rax,QWORD PTR [rcx+0x3b8]
      efd480:	0f 28 81 b0 03 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x3b0]
      efd487:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
      efd48c:	48 85 c0             	test   rax,rax
      efd48f:	74 05                	je     efd496 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc48ac>
      efd491:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd496:	4d 8d 7e 18          	lea    r15,[r14+0x18]
      efd49a:	09 dd                	or     ebp,ebx
      efd49c:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efd4a1:	48 8b 81 c8 03 00 00 	mov    rax,QWORD PTR [rcx+0x3c8]
      efd4a8:	0f 28 81 c0 03 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x3c0]
      efd4af:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0
      efd4b4:	48 85 c0             	test   rax,rax
      efd4b7:	74 05                	je     efd4be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc48d4>
      efd4b9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd4be:	89 e8                	mov    eax,ebp
      efd4c0:	c1 e8 10             	shr    eax,0x10
      efd4c3:	89 e9                	mov    ecx,ebp
      efd4c5:	c1 e9 08             	shr    ecx,0x8
      efd4c8:	41 88 ae 88 00 00 00 	mov    BYTE PTR [r14+0x88],bpl
      efd4cf:	41 88 8e 89 00 00 00 	mov    BYTE PTR [r14+0x89],cl
      efd4d6:	41 88 86 8a 00 00 00 	mov    BYTE PTR [r14+0x8a],al
      efd4dd:	4c 89 f3             	mov    rbx,r14
      efd4e0:	48 81 c3 8c 00 00 00 	add    rbx,0x8c
      efd4e7:	40 80 e5 01          	and    bpl,0x1
      efd4eb:	41 83 a6 8c 00 00 00 	and    DWORD PTR [r14+0x8c],0x0
      efd4f2:	00 
      efd4f3:	80 e1 01             	and    cl,0x1
      efd4f6:	41 c6 86 90 00 00 00 	mov    BYTE PTR [r14+0x90],0x0
      efd4fd:	00 
      efd4fe:	41 88 ae 91 00 00 00 	mov    BYTE PTR [r14+0x91],bpl
      efd505:	41 88 8e 92 00 00 00 	mov    BYTE PTR [r14+0x92],cl
      efd50c:	48 89 df             	mov    rdi,rbx
      efd50f:	31 f6                	xor    esi,esi
      efd511:	e8 92 02 0b 00       	call   fad7a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174bbe>
      efd516:	4d 89 a6 98 00 00 00 	mov    QWORD PTR [r14+0x98],r12
      efd51d:	49 8b 7e 58          	mov    rdi,QWORD PTR [r14+0x58]

### 0xefd584: mov    rbx,QWORD PTR [rsp+0x60]
      efd53b:	48 89 df             	mov    rdi,rbx
      efd53e:	e8 d3 53 0a 00       	call   fa2916 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x169d2c>
      efd543:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      efd54a:	00 
      efd54b:	48 89 df             	mov    rdi,rbx
      efd54e:	4c 89 fe             	mov    rsi,r15
      efd551:	4c 89 f2             	mov    rdx,r14
      efd554:	e8 ab 12 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efd559:	31 ff                	xor    edi,edi
      efd55b:	e8 bc 0e ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efd560:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efd564:	66 0f ef c9          	pxor   xmm1,xmm1
      efd568:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      efd56c:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efd570:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efd576:	e8 0b 0f ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd57b:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efd57f:	e8 02 0f ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd584:	48 8b 5c 24 60       	mov    rbx,QWORD PTR [rsp+0x60]
      efd589:	80 bb d3 01 00 00 00 	cmp    BYTE PTR [rbx+0x1d3],0x0
      efd590:	0f 84 36 01 00 00    	je     efd6cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4ae2>
      efd596:	bf 10 01 00 00       	mov    edi,0x110
      efd59b:	e8 60 09 8f 00       	call   17edf00 <_Znwm@plt>
      efd5a0:	49 89 c6             	mov    r14,rax
      efd5a3:	66 0f ef c9          	pxor   xmm1,xmm1
      efd5a7:	f3 0f 7f 48 08       	movdqu XMMWORD PTR [rax+0x8],xmm1
      efd5ac:	48 8d 05 0d d2 93 00 	lea    rax,[rip+0x93d20d]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efd5b3:	49 89 06             	mov    QWORD PTR [r14],rax
      efd5b6:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      efd5bc:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efd5c0:	48 85 c0             	test   rax,rax
      efd5c3:	74 05                	je     efd5ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc49e0>
      efd5c5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd5ca:	49 8d 5e 18          	lea    rbx,[r14+0x18]
      efd5ce:	48 8d 05 f3 5f 94 00 	lea    rax,[rip+0x945ff3]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efd5d5:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efd5d9:	f3 41 0f 7f 4e 28    	movdqu XMMWORD PTR [r14+0x28],xmm1
      efd5df:	48 8d 05 1a 2c 94 00 	lea    rax,[rip+0x942c1a]        # 1840200 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x12198>
      efd5e6:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efd5ea:	f3 41 0f 7f 46 38    	movdqu XMMWORD PTR [r14+0x38],xmm0
      efd5f0:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efd5f7:	48 85 ff             	test   rdi,rdi
      efd5fa:	74 05                	je     efd601 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4a17>
      efd5fc:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efd601:	48 8d 05 20 2c 94 00 	lea    rax,[rip+0x942c20]        # 1840228 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x121c0>
      efd608:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efd60c:	48 8d 05 05 2c 94 00 	lea    rax,[rip+0x942c05]        # 1840218 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x121b0>

### 0xefd6cc: mov    rax,QWORD PTR [rsp+0x60]
      efd681:	41 83 a6 09 01 00 00 	and    DWORD PTR [r14+0x109],0x0
      efd688:	00 
      efd689:	4c 8d bc 24 10 07 00 	lea    r15,[rsp+0x710]
      efd690:	00 
      efd691:	4c 89 ff             	mov    rdi,r15
      efd694:	48 89 de             	mov    rsi,rbx
      efd697:	4c 89 f2             	mov    rdx,r14
      efd69a:	e8 65 11 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efd69f:	31 ff                	xor    edi,edi
      efd6a1:	e8 76 0d ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efd6a6:	66 41 0f 6f 07       	movdqa xmm0,XMMWORD PTR [r15]
      efd6ab:	66 0f ef c9          	pxor   xmm1,xmm1
      efd6af:	66 41 0f 7f 0f       	movdqa XMMWORD PTR [r15],xmm1
      efd6b4:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efd6b8:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efd6be:	e8 c3 0d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd6c3:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      efd6c7:	e8 ba 0d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd6cc:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efd6d1:	80 b8 b4 01 00 00 00 	cmp    BYTE PTR [rax+0x1b4],0x0
      efd6d8:	0f 84 1e 01 00 00    	je     efd7fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4c12>
      efd6de:	48 83 b8 90 03 00 00 	cmp    QWORD PTR [rax+0x390],0x0
      efd6e5:	00 
      efd6e6:	0f 84 10 01 00 00    	je     efd7fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4c12>
      efd6ec:	6a 68                	push   0x68
      efd6ee:	5f                   	pop    rdi
      efd6ef:	e8 0c 08 8f 00       	call   17edf00 <_Znwm@plt>
      efd6f4:	49 89 c6             	mov    r14,rax
      efd6f7:	49 89 c7             	mov    r15,rax
      efd6fa:	66 0f ef c9          	pxor   xmm1,xmm1
      efd6fe:	f3 41 0f 7f 4e 08    	movdqu XMMWORD PTR [r14+0x8],xmm1
      efd704:	48 8d 05 b5 d0 93 00 	lea    rax,[rip+0x93d0b5]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efd70b:	49 89 06             	mov    QWORD PTR [r14],rax
      efd70e:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      efd714:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efd718:	48 85 c0             	test   rax,rax
      efd71b:	74 05                	je     efd722 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4b38>
      efd71d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd722:	48 8d 05 9f 5e 94 00 	lea    rax,[rip+0x945e9f]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efd729:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efd72d:	f3 41 0f 7f 4f 28    	movdqu XMMWORD PTR [r15+0x28],xmm1
      efd733:	48 8d 05 8e 1d 94 00 	lea    rax,[rip+0x941d8e]        # 183f4c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11460>
      efd73a:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efd73e:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0
      efd744:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efd74b:	48 85 ff             	test   rdi,rdi
      efd74e:	74 05                	je     efd755 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4b6b>

### 0xefd78a: mov    rcx,QWORD PTR [rsp+0x60]
      efd72d:	f3 41 0f 7f 4f 28    	movdqu XMMWORD PTR [r15+0x28],xmm1
      efd733:	48 8d 05 8e 1d 94 00 	lea    rax,[rip+0x941d8e]        # 183f4c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11460>
      efd73a:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efd73e:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0
      efd744:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efd74b:	48 85 ff             	test   rdi,rdi
      efd74e:	74 05                	je     efd755 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4b6b>
      efd750:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efd755:	49 83 c6 18          	add    r14,0x18
      efd759:	48 8d 05 90 1d 94 00 	lea    rax,[rip+0x941d90]        # 183f4f0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11488>
      efd760:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efd764:	48 8d 05 6d 1f 94 00 	lea    rax,[rip+0x941f6d]        # 183f6d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11670>
      efd76b:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efd76f:	e8 12 0d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd774:	48 8d 05 35 1b 94 00 	lea    rax,[rip+0x941b35]        # 183f2b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11248>
      efd77b:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efd77f:	48 8d 05 1a 1d 94 00 	lea    rax,[rip+0x941d1a]        # 183f4a0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11438>
      efd786:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efd78a:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efd78f:	48 8b 81 98 03 00 00 	mov    rax,QWORD PTR [rcx+0x398]
      efd796:	0f 28 81 90 03 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x390]
      efd79d:	41 0f 11 47 48       	movups XMMWORD PTR [r15+0x48],xmm0
      efd7a2:	48 85 c0             	test   rax,rax
      efd7a5:	74 05                	je     efd7ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4bc2>
      efd7a7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd7ac:	31 c0                	xor    eax,eax
      efd7ae:	41 88 47 58          	mov    BYTE PTR [r15+0x58],al
      efd7b2:	41 88 47 60          	mov    BYTE PTR [r15+0x60],al
      efd7b6:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      efd7bd:	00 
      efd7be:	48 89 df             	mov    rdi,rbx
      efd7c1:	4c 89 f6             	mov    rsi,r14
      efd7c4:	4c 89 fa             	mov    rdx,r15
      efd7c7:	e8 38 10 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efd7cc:	31 ff                	xor    edi,edi
      efd7ce:	e8 49 0c ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efd7d3:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efd7d7:	66 0f ef c9          	pxor   xmm1,xmm1
      efd7db:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      efd7df:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efd7e3:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efd7e9:	e8 98 0c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd7ee:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efd7f2:	e8 8f 0c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd7f7:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efd7fc:	80 b8 f2 01 00 00 00 	cmp    BYTE PTR [rax+0x1f2],0x0
      efd803:	0f 84 4e 01 00 00    	je     efd957 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4d6d>

### 0xefd7f7: mov    rax,QWORD PTR [rsp+0x60]
      efd7ae:	41 88 47 58          	mov    BYTE PTR [r15+0x58],al
      efd7b2:	41 88 47 60          	mov    BYTE PTR [r15+0x60],al
      efd7b6:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      efd7bd:	00 
      efd7be:	48 89 df             	mov    rdi,rbx
      efd7c1:	4c 89 f6             	mov    rsi,r14
      efd7c4:	4c 89 fa             	mov    rdx,r15
      efd7c7:	e8 38 10 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efd7cc:	31 ff                	xor    edi,edi
      efd7ce:	e8 49 0c ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efd7d3:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efd7d7:	66 0f ef c9          	pxor   xmm1,xmm1
      efd7db:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      efd7df:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efd7e3:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efd7e9:	e8 98 0c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd7ee:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efd7f2:	e8 8f 0c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd7f7:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efd7fc:	80 b8 f2 01 00 00 00 	cmp    BYTE PTR [rax+0x1f2],0x0
      efd803:	0f 84 4e 01 00 00    	je     efd957 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4d6d>
      efd809:	6a 78                	push   0x78
      efd80b:	5f                   	pop    rdi
      efd80c:	e8 ef 06 8f 00       	call   17edf00 <_Znwm@plt>
      efd811:	49 89 c6             	mov    r14,rax
      efd814:	49 89 c7             	mov    r15,rax
      efd817:	66 0f ef c0          	pxor   xmm0,xmm0
      efd81b:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      efd821:	48 8d 05 98 cf 93 00 	lea    rax,[rip+0x93cf98]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efd828:	49 89 06             	mov    QWORD PTR [r14],rax
      efd82b:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efd830:	0f 28 80 f0 02 00 00 	movaps xmm0,XMMWORD PTR [rax+0x2f0]
      efd837:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
      efd83e:	00 
      efd83f:	48 8b 80 f8 02 00 00 	mov    rax,QWORD PTR [rax+0x2f8]
      efd846:	48 85 c0             	test   rax,rax
      efd849:	74 05                	je     efd850 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4c66>
      efd84b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd850:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      efd856:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efd85a:	48 85 c0             	test   rax,rax
      efd85d:	74 05                	je     efd864 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4c7a>
      efd85f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd864:	48 8d 05 5d 5d 94 00 	lea    rax,[rip+0x945d5d]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efd86b:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efd86f:	66 0f ef c9          	pxor   xmm1,xmm1
      efd873:	f3 41 0f 7f 4f 28    	movdqu XMMWORD PTR [r15+0x28],xmm1

### 0xefd82b: mov    rax,QWORD PTR [rsp+0x60]
      efd7db:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      efd7df:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efd7e3:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efd7e9:	e8 98 0c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd7ee:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efd7f2:	e8 8f 0c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd7f7:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efd7fc:	80 b8 f2 01 00 00 00 	cmp    BYTE PTR [rax+0x1f2],0x0
      efd803:	0f 84 4e 01 00 00    	je     efd957 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4d6d>
      efd809:	6a 78                	push   0x78
      efd80b:	5f                   	pop    rdi
      efd80c:	e8 ef 06 8f 00       	call   17edf00 <_Znwm@plt>
      efd811:	49 89 c6             	mov    r14,rax
      efd814:	49 89 c7             	mov    r15,rax
      efd817:	66 0f ef c0          	pxor   xmm0,xmm0
      efd81b:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      efd821:	48 8d 05 98 cf 93 00 	lea    rax,[rip+0x93cf98]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efd828:	49 89 06             	mov    QWORD PTR [r14],rax
      efd82b:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efd830:	0f 28 80 f0 02 00 00 	movaps xmm0,XMMWORD PTR [rax+0x2f0]
      efd837:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
      efd83e:	00 
      efd83f:	48 8b 80 f8 02 00 00 	mov    rax,QWORD PTR [rax+0x2f8]
      efd846:	48 85 c0             	test   rax,rax
      efd849:	74 05                	je     efd850 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4c66>
      efd84b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd850:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      efd856:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efd85a:	48 85 c0             	test   rax,rax
      efd85d:	74 05                	je     efd864 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4c7a>
      efd85f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd864:	48 8d 05 5d 5d 94 00 	lea    rax,[rip+0x945d5d]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efd86b:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efd86f:	66 0f ef c9          	pxor   xmm1,xmm1
      efd873:	f3 41 0f 7f 4f 28    	movdqu XMMWORD PTR [r15+0x28],xmm1
      efd879:	48 8d 05 a0 5a 94 00 	lea    rax,[rip+0x945aa0]        # 1843320 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x152b8>
      efd880:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efd884:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0
      efd88a:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efd891:	48 85 ff             	test   rdi,rdi
      efd894:	74 05                	je     efd89b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4cb1>
      efd896:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efd89b:	49 83 c6 18          	add    r14,0x18
      efd89f:	48 8d 05 a2 5a 94 00 	lea    rax,[rip+0x945aa2]        # 1843348 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x152e0>
      efd8a6:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efd8aa:	48 8d 05 7f 5c 94 00 	lea    rax,[rip+0x945c7f]        # 1843530 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x154c8>
      efd8b1:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax

### 0xefdbd8: mov    QWORD PTR [rsp+0x60],rax
      efdb8f:	e9 6d 02 00 00       	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdb94:	e9 68 02 00 00       	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdb99:	e9 4f 02 00 00       	jmp    efdded <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5203>
      efdb9e:	e9 5e 02 00 00       	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdba3:	e9 59 02 00 00       	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdba8:	e9 54 02 00 00       	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdbad:	49 89 c4             	mov    r12,rax
      efdbb0:	48 8d bc 24 20 02 00 	lea    rdi,[rsp+0x220]
      efdbb7:	00 
      efdbb8:	e8 d3 02 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efdbbd:	eb 03                	jmp    efdbc2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4fd8>
      efdbbf:	49 89 c4             	mov    r12,rax
      efdbc2:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
      efdbc9:	00 
      efdbca:	e8 c1 02 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efdbcf:	eb 03                	jmp    efdbd4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4fea>
      efdbd1:	49 89 c4             	mov    r12,rax
      efdbd4:	49 8d 45 28          	lea    rax,[r13+0x28]
      efdbd8:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      efdbdd:	49 8d 85 b8 00 00 00 	lea    rax,[r13+0xb8]
      efdbe4:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
      efdbeb:	00 
      efdbec:	49 8d 85 e0 00 00 00 	lea    rax,[r13+0xe0]
      efdbf3:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
      efdbfa:	00 
      efdbfb:	49 8d 85 00 01 00 00 	lea    rax,[r13+0x100]
      efdc02:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
      efdc09:	00 
      efdc0a:	4d 8d b5 28 01 00 00 	lea    r14,[r13+0x128]
      efdc11:	49 8d ad 20 02 00 00 	lea    rbp,[r13+0x220]
      efdc18:	49 8d 9d 18 03 00 00 	lea    rbx,[r13+0x318]
      efdc1f:	4c 89 ef             	mov    rdi,r13
      efdc22:	48 81 c7 10 04 00 00 	add    rdi,0x410
      efdc29:	e8 70 8c 08 00       	call   f8689e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14dcb4>
      efdc2e:	48 89 df             	mov    rdi,rbx
      efdc31:	e8 4a 77 00 00       	call   f05380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc796>
      efdc36:	48 89 ef             	mov    rdi,rbp
      efdc39:	e8 42 77 00 00       	call   f05380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc796>
      efdc3e:	4c 89 f7             	mov    rdi,r14
      efdc41:	e8 3a 77 00 00       	call   f05380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc796>
      efdc46:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      efdc4d:	00 
      efdc4e:	e8 dd 90 ba ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      efdc53:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
      efdc5a:	00 
      efdc5b:	e8 d0 90 ba ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      efdc60:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]

### 0xefdc8e: mov    rdi,QWORD PTR [rsp+0x60]
      efdc39:	e8 42 77 00 00       	call   f05380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc796>
      efdc3e:	4c 89 f7             	mov    rdi,r14
      efdc41:	e8 3a 77 00 00       	call   f05380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc796>
      efdc46:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      efdc4d:	00 
      efdc4e:	e8 dd 90 ba ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      efdc53:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
      efdc5a:	00 
      efdc5b:	e8 d0 90 ba ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      efdc60:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
      efdc67:	00 
      efdc68:	e8 c3 90 ba ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      efdc6d:	49 8b bd a0 00 00 00 	mov    rdi,QWORD PTR [r13+0xa0]
      efdc74:	e8 0d 08 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efdc79:	49 8b bd 90 00 00 00 	mov    rdi,QWORD PTR [r13+0x90]
      efdc80:	e8 01 08 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efdc85:	49 8b 7d 78          	mov    rdi,QWORD PTR [r13+0x78]
      efdc89:	e8 f8 07 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efdc8e:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
      efdc93:	e8 12 8c 08 00       	call   f868aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14dcc0>
      efdc98:	31 c0                	xor    eax,eax
      efdc9a:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
      efdca1:	00 
      efdca2:	31 ff                	xor    edi,edi
      efdca4:	e8 dd 07 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efdca9:	eb 13                	jmp    efdcbe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc50d4>
      efdcab:	49 89 c4             	mov    r12,rax
      efdcae:	66 0f 6f 84 24 f0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xf0]
      efdcb5:	00 00 
      efdcb7:	66 49 0f 3a 16 c7 01 	pextrq r15,xmm0,0x1
      efdcbe:	4c 89 ff             	mov    rdi,r15
      efdcc1:	e8 c0 07 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efdcc6:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efdccd:	00 
      efdcce:	e8 97 c2 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efdcd3:	eb 03                	jmp    efdcd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc50ee>
      efdcd5:	49 89 c4             	mov    r12,rax
      efdcd8:	4c 89 ef             	mov    rdi,r13
      efdcdb:	e8 30 03 8f 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      efdce0:	4c 89 ef             	mov    rdi,r13
      efdce3:	e8 34 07 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efdce8:	48 83 bc 24 80 00 00 	cmp    QWORD PTR [rsp+0x80],0x0
      efdcef:	00 00 
      efdcf1:	75 08                	jne    efdcfb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5111>
      efdcf3:	e9 0c 01 00 00       	jmp    efde04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc521a>
      efdcf8:	49 89 c4             	mov    r12,rax
      efdcfb:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]

## Writes to rsp+0x60 only
- 0xef9217: mov    QWORD PTR [rsp+0x60],rsi
- 0xefdbd8: mov    QWORD PTR [rsp+0x60],rax

## rbx provenance before 0xefc61e
### nearest rbx definition 0xefc602: lea    rbx,[rsp+0x710]
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

## Callers of constructor FDE
## Direct callers to interior constructor anchors
### target 0xefc300

### target 0xefc480

### target 0xefc61e

### target 0xefc630

### target 0xefc701

## Candidate writes to object+0x10 from vptr-bearing allocations near caller family
