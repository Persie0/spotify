# fd4a92 virtual +0x1d8 callers

Known: primary state AP 0x1841fc0; AP+0x1d8 = fd4a92.
fd4a92 extracts a weak/shared pointer pair from second argument +0x10; final readiness receiver becomes [extracted_object+0x40].

## Indirect +0x1d8 calls: 4
### call 0xd8a5d7; FDE=(14198210, 14198250): call   QWORD PTR [rax+0x1d8]
      d8a55d:	49 89 c6             	mov    r14,rax
      d8a560:	48 89 df             	mov    rdi,rbx
      d8a563:	e8 b8 93 e0 ff       	call   b93920 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe08c0>
      d8a568:	4c 89 f7             	mov    rdi,r14
      d8a56b:	e8 60 57 ce ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      d8a570:	53                   	push   rbx
      d8a571:	48 89 fb             	mov    rbx,rdi
      d8a574:	48 83 c7 30          	add    rdi,0x30
      d8a578:	e8 ed f9 ce ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d8a57d:	48 83 c3 08          	add    rbx,0x8
      d8a581:	48 89 df             	mov    rdi,rbx
      d8a584:	5b                   	pop    rbx
      d8a585:	e9 06 39 a6 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d8a58a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d8a58d:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
      d8a591:	31 f6                	xor    esi,esi
      d8a593:	e9 c8 e3 df ff       	jmp    b88960 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5900>
      d8a598:	83 ff 01             	cmp    edi,0x1
      d8a59b:	74 1e                	je     d8a5bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57641>
      d8a59d:	85 ff                	test   edi,edi
      d8a59f:	75 20                	jne    d8a5c1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57647>
      d8a5a1:	53                   	push   rbx
      d8a5a2:	48 8b 1e             	mov    rbx,QWORD PTR [rsi]
      d8a5a5:	48 85 db             	test   rbx,rbx
      d8a5a8:	74 08                	je     d8a5b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57638>
      d8a5aa:	48 89 df             	mov    rdi,rbx
      d8a5ad:	e8 be ff ff ff       	call   d8a570 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x575f6>
      d8a5b2:	48 89 df             	mov    rdi,rbx
      d8a5b5:	5b                   	pop    rbx
      d8a5b6:	e9 65 39 a6 00       	jmp    17edf20 <_ZdlPv@plt>
      d8a5bb:	48 8b 02             	mov    rax,QWORD PTR [rdx]
      d8a5be:	48 89 06             	mov    QWORD PTR [rsi],rax
      d8a5c1:	c3                   	ret
      d8a5c2:	53                   	push   rbx
      d8a5c3:	48 89 f1             	mov    rcx,rsi
      d8a5c6:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
      d8a5c9:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      d8a5cc:	48 8d 73 08          	lea    rsi,[rbx+0x8]
      d8a5d0:	0f b6 53 20          	movzx  edx,BYTE PTR [rbx+0x20]
      d8a5d4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d8a5d7:	ff 90 d8 01 00 00    	call   QWORD PTR [rax+0x1d8]
      d8a5dd:	48 8b 7b 50          	mov    rdi,QWORD PTR [rbx+0x50]
      d8a5e1:	6a 01                	push   0x1
      d8a5e3:	5e                   	pop    rsi
      d8a5e4:	5b                   	pop    rbx
      d8a5e5:	e9 76 e3 df ff       	jmp    b88960 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5900>
      d8a5ea:	55                   	push   rbp
      d8a5eb:	41 57                	push   r15
      d8a5ed:	41 56                	push   r14
      d8a5ef:	53                   	push   rbx
      d8a5f0:	50                   	push   rax
      d8a5f1:	48 81 c7 e0 04 00 00 	add    rdi,0x4e0
      d8a5f8:	e8 2f f4 ff ff       	call   d89a2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56ab2>
      d8a5fd:	31 db                	xor    ebx,ebx
      d8a5ff:	48 85 c0             	test   rax,rax
      d8a602:	74 2d                	je     d8a631 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x576b7>
      d8a604:	4c 8b 30             	mov    r14,QWORD PTR [rax]
      d8a607:	4c 8b 78 08          	mov    r15,QWORD PTR [rax+0x8]
      d8a60b:	4d 39 fe             	cmp    r14,r15
      d8a60e:	74 21                	je     d8a631 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x576b7>
      d8a610:	6a 02                	push   0x2
      d8a612:	5b                   	pop    rbx
      d8a613:	6a 01                	push   0x1
      d8a615:	5d                   	pop    rbp
      d8a616:	4d 39 fe             	cmp    r14,r15
      d8a619:	74 16                	je     d8a631 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x576b7>
      d8a61b:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      d8a61e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d8a621:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
      d8a627:	49 83 c6 08          	add    r14,0x8
      d8a62b:	84 c0                	test   al,al
      d8a62d:	74 e7                	je     d8a616 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5769c>
      d8a62f:	89 eb                	mov    ebx,ebp
      d8a631:	89 d8                	mov    eax,ebx
      d8a633:	48 83 c4 08          	add    rsp,0x8
      d8a637:	5b                   	pop    rbx
      d8a638:	41 5e                	pop    r14
      d8a63a:	41 5f                	pop    r15
      d8a63c:	5d                   	pop    rbp
      d8a63d:	c3                   	ret
      d8a63e:	53                   	push   rbx
      d8a63f:	48 89 fb             	mov    rbx,rdi
      d8a642:	83 7f 38 00          	cmp    DWORD PTR [rdi+0x38],0x0
      d8a646:	74 0c                	je     d8a654 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x576da>
      d8a648:	48 89 df             	mov    rdi,rbx
      d8a64b:	e8 ec 64 fe ff       	call   d70b3c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3dbc2>

### call 0x10adb3e; FDE=(17480246, 17488917): call   QWORD PTR [rax+0x1d8]
     10adaa9:	48 81 c7 10 01 00 00 	add    rdi,0x110
     10adab0:	e8 db 03 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10adab5:	49 83 c6 e8          	add    r14,0xffffffffffffffe8
     10adab9:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8
     10adabd:	75 e6                	jne    10adaa5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274ebb>
     10adabf:	e9 b4 00 00 00       	jmp    10adb78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8e>
     10adac4:	eb 26                	jmp    10adaec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f02>
     10adac6:	48 89 c3             	mov    rbx,rax
     10adac9:	6a 18                	push   0x18
     10adacb:	41 5e                	pop    r14
     10adacd:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
     10adad1:	48 81 c7 10 01 00 00 	add    rdi,0x110
     10adad8:	e8 b3 03 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10adadd:	49 83 c6 e8          	add    r14,0xffffffffffffffe8
     10adae1:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8
     10adae5:	75 e6                	jne    10adacd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274ee3>
     10adae7:	e9 8c 00 00 00       	jmp    10adb78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8e>
     10adaec:	48 89 c3             	mov    rbx,rax
     10adaef:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
     10adaf6:	00 
     10adaf7:	e8 94 03 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10adafc:	eb 7a                	jmp    10adb78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8e>
     10adafe:	48 89 c3             	mov    rbx,rax
     10adb01:	e9 b4 00 00 00       	jmp    10adbba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274fd0>
     10adb06:	48 89 c3             	mov    rbx,rax
     10adb09:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
     10adb10:	00 
     10adb11:	e8 10 30 9f ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     10adb16:	eb 2c                	jmp    10adb44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f5a>
     10adb18:	48 89 c3             	mov    rbx,rax
     10adb1b:	48 83 7c 24 08 00    	cmp    QWORD PTR [rsp+0x8],0x0
     10adb21:	74 0b                	je     10adb2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f44>
     10adb23:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     10adb28:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10adb2b:	ff 50 08             	call   QWORD PTR [rax+0x8]
     10adb2e:	49 8b 06             	mov    rax,QWORD PTR [r14]
     10adb31:	4c 89 f7             	mov    rdi,r14
     10adb34:	ff 50 10             	call   QWORD PTR [rax+0x10]
     10adb37:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     10adb3b:	48 89 ef             	mov    rdi,rbp
     10adb3e:	ff 90 d8 01 00 00    	call   QWORD PTR [rax+0x1d8]
     10adb44:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     10adb49:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10adb4c:	ff 50 40             	call   QWORD PTR [rax+0x40]
     10adb4f:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
     10adb54:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10adb57:	ff 50 18             	call   QWORD PTR [rax+0x18]
     10adb5a:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     10adb5f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10adb62:	ff 50 08             	call   QWORD PTR [rax+0x8]
     10adb65:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
     10adb6c:	00 
     10adb6d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10adb70:	ff 50 48             	call   QWORD PTR [rax+0x48]
     10adb73:	eb 03                	jmp    10adb78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8e>
     10adb75:	48 89 c3             	mov    rbx,rax
     10adb78:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
     10adb7f:	00 
     10adb80:	e8 6d 01 00 00       	call   10adcf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275108>
     10adb85:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
     10adb8c:	00 
     10adb8d:	e8 38 01 00 00       	call   10adcca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750e0>
     10adb92:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
     10adb97:	e8 06 01 00 00       	call   10adca2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750b8>
     10adb9c:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
     10adba1:	e8 82 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     10adba6:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     10adbab:	e8 78 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     10adbb0:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     10adbb5:	e8 c2 15 ac ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
     10adbba:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     10adbbf:	e8 64 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     10adbc4:	4c 8b b4 24 a0 00 00 	mov    r14,QWORD PTR [rsp+0xa0]
     10adbcb:	00 
     10adbcc:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]
     10adbd0:	e8 b1 08 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10adbd5:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10adbd9:	e8 a8 08 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10adbde:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     10adbe3:	e8 40 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     10adbe8:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
     10adbef:	00 
     10adbf0:	e8 33 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     10adbf5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10adbfc:	00 00 
     10adbfe:	48 3b 84 24 50 01 00 	cmp    rax,QWORD PTR [rsp+0x150]

### call 0x10c0a35; FDE=(17566150, 17566310): call   QWORD PTR [rax+0x1d8]
     10c09b7:	48 89 df             	mov    rdi,rbx
     10c09ba:	5b                   	pop    rbx
     10c09bb:	e9 60 d5 72 00       	jmp    17edf20 <_ZdlPv@plt>
     10c09c0:	89 f0                	mov    eax,esi
     10c09c2:	34 01                	xor    al,0x1
     10c09c4:	c3                   	ret
     10c09c5:	cc                   	int3
     10c09c6:	53                   	push   rbx
     10c09c7:	48 89 fb             	mov    rbx,rdi
     10c09ca:	48 8d 05 b7 d0 78 00 	lea    rax,[rip+0x78d0b7]        # 184da88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa170>
     10c09d1:	48 89 07             	mov    QWORD PTR [rdi],rax
     10c09d4:	48 8b 7f 38          	mov    rdi,QWORD PTR [rdi+0x38]
     10c09d8:	48 83 63 38 00       	and    QWORD PTR [rbx+0x38],0x0
     10c09dd:	48 85 ff             	test   rdi,rdi
     10c09e0:	74 06                	je     10c09e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287dfe>
     10c09e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10c09e5:	ff 50 08             	call   QWORD PTR [rax+0x8]
     10c09e8:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
     10c09ec:	48 83 63 30 00       	and    QWORD PTR [rbx+0x30],0x0
     10c09f1:	48 85 ff             	test   rdi,rdi
     10c09f4:	74 06                	je     10c09fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287e12>
     10c09f6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10c09f9:	ff 50 48             	call   QWORD PTR [rax+0x48]
     10c09fc:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
     10c0a00:	48 83 63 28 00       	and    QWORD PTR [rbx+0x28],0x0
     10c0a05:	48 85 ff             	test   rdi,rdi
     10c0a08:	74 06                	je     10c0a10 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287e26>
     10c0a0a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10c0a0d:	ff 50 08             	call   QWORD PTR [rax+0x8]
     10c0a10:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
     10c0a14:	48 83 63 20 00       	and    QWORD PTR [rbx+0x20],0x0
     10c0a19:	48 85 ff             	test   rdi,rdi
     10c0a1c:	74 06                	je     10c0a24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287e3a>
     10c0a1e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10c0a21:	ff 50 40             	call   QWORD PTR [rax+0x40]
     10c0a24:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
     10c0a28:	48 83 63 18 00       	and    QWORD PTR [rbx+0x18],0x0
     10c0a2d:	48 85 ff             	test   rdi,rdi
     10c0a30:	74 09                	je     10c0a3b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287e51>
     10c0a32:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10c0a35:	ff 90 d8 01 00 00    	call   QWORD PTR [rax+0x1d8]
     10c0a3b:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     10c0a3f:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     10c0a44:	48 85 ff             	test   rdi,rdi
     10c0a47:	74 06                	je     10c0a4f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287e65>
     10c0a49:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10c0a4c:	ff 50 18             	call   QWORD PTR [rax+0x18]
     10c0a4f:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     10c0a53:	48 83 63 08 00       	and    QWORD PTR [rbx+0x8],0x0
     10c0a58:	48 85 ff             	test   rdi,rdi
     10c0a5b:	74 07                	je     10c0a64 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287e7a>
     10c0a5d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10c0a60:	5b                   	pop    rbx
     10c0a61:	ff 60 10             	jmp    QWORD PTR [rax+0x10]
     10c0a64:	5b                   	pop    rbx
     10c0a65:	c3                   	ret
     10c0a66:	53                   	push   rbx
     10c0a67:	48 89 fb             	mov    rbx,rdi
     10c0a6a:	e8 57 ff ff ff       	call   10c09c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287ddc>
     10c0a6f:	48 89 df             	mov    rdi,rbx
     10c0a72:	5b                   	pop    rbx
     10c0a73:	e9 a8 d4 72 00       	jmp    17edf20 <_ZdlPv@plt>
     10c0a78:	53                   	push   rbx
     10c0a79:	48 89 fb             	mov    rbx,rdi
     10c0a7c:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
     10c0a80:	e8 01 da 9d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10c0a85:	48 83 c3 10          	add    rbx,0x10
     10c0a89:	48 89 df             	mov    rdi,rbx
     10c0a8c:	5b                   	pop    rbx
     10c0a8d:	e9 6a eb 9d ff       	jmp    a9f5fc <JNI_OnUnload@@Base+0x26ec9>
     10c0a92:	53                   	push   rbx
     10c0a93:	48 89 fb             	mov    rbx,rdi
     10c0a96:	e8 dd ff ff ff       	call   10c0a78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287e8e>
     10c0a9b:	48 89 df             	mov    rdi,rbx
     10c0a9e:	5b                   	pop    rbx
     10c0a9f:	e9 7c d4 72 00       	jmp    17edf20 <_ZdlPv@plt>
     10c0aa4:	41 57                	push   r15
     10c0aa6:	41 56                	push   r14
     10c0aa8:	41 54                	push   r12
     10c0aaa:	53                   	push   rbx
     10c0aab:	48 83 ec 38          	sub    rsp,0x38
     10c0aaf:	49 89 f6             	mov    r14,rsi
     10c0ab2:	48 89 fb             	mov    rbx,rdi
     10c0ab5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10c0abc:	00 00 
     10c0abe:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax

### call 0x1230288; FDE=(19063258, 19073670): call   QWORD PTR [rax+0x1d8]
     12301e8:	4c 89 e7             	mov    rdi,r12
     12301eb:	ff 90 18 01 00 00    	call   QWORD PTR [rax+0x118]
     12301f1:	84 c0                	test   al,al
     12301f3:	74 41                	je     1230236 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x757ba>
     12301f5:	48 8d bd 98 08 00 00 	lea    rdi,[rbp+0x898]
     12301fc:	e8 85 08 00 00       	call   1230a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7600a>
     1230201:	48 89 c3             	mov    rbx,rax
     1230204:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
     123020b:	00 
     123020c:	48 89 ee             	mov    rsi,rbp
     123020f:	e8 b2 22 00 00       	call   12324c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x77a4a>
     1230214:	48 81 c3 30 04 00 00 	add    rbx,0x430
     123021b:	4c 8d b4 24 48 02 00 	lea    r14,[rsp+0x248]
     1230222:	00 
     1230223:	48 89 df             	mov    rdi,rbx
     1230226:	4c 89 f6             	mov    rsi,r14
     1230229:	e8 aa 23 00 00       	call   12325d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x77b5c>
     123022e:	4c 89 f7             	mov    rdi,r14
     1230231:	e8 88 cb ff ff       	call   122cdbe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72342>
     1230236:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     123023a:	4c 89 e7             	mov    rdi,r12
     123023d:	ff 90 c8 01 00 00    	call   QWORD PTR [rax+0x1c8]
     1230243:	84 c0                	test   al,al
     1230245:	74 3a                	je     1230281 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75805>
     1230247:	48 8d bd 98 08 00 00 	lea    rdi,[rbp+0x898]
     123024e:	e8 33 08 00 00       	call   1230a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7600a>
     1230253:	48 89 c3             	mov    rbx,rax
     1230256:	48 8b b5 88 07 00 00 	mov    rsi,QWORD PTR [rbp+0x788]
     123025d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1230260:	4c 8d b4 24 e0 01 00 	lea    r14,[rsp+0x1e0]
     1230267:	00 
     1230268:	4c 89 f7             	mov    rdi,r14
     123026b:	ff 50 10             	call   QWORD PTR [rax+0x10]
     123026e:	48 89 df             	mov    rdi,rbx
     1230271:	4c 89 f6             	mov    rsi,r14
     1230274:	e8 cf 23 00 00       	call   1232648 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x77bcc>
     1230279:	4c 89 f7             	mov    rdi,r14
     123027c:	e8 a9 ca ff ff       	call   122cd2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x722ae>
     1230281:	48 8b 45 10          	mov    rax,QWORD PTR [rbp+0x10]
     1230285:	4c 89 e7             	mov    rdi,r12
     1230288:	ff 90 d8 01 00 00    	call   QWORD PTR [rax+0x1d8]
     123028e:	84 c0                	test   al,al
     1230290:	74 56                	je     12302e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7586c>
     1230292:	48 83 bd d8 07 00 00 	cmp    QWORD PTR [rbp+0x7d8],0x0
     1230299:	00 
     123029a:	74 4c                	je     12302e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7586c>
     123029c:	48 8d 9d 98 08 00 00 	lea    rbx,[rbp+0x898]
     12302a3:	48 89 df             	mov    rdi,rbx
     12302a6:	e8 db 07 00 00       	call   1230a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7600a>
     12302ab:	49 89 c6             	mov    r14,rax
     12302ae:	48 8b bd d8 07 00 00 	mov    rdi,QWORD PTR [rbp+0x7d8]
     12302b5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12302b8:	ff 50 48             	call   QWORD PTR [rax+0x48]
     12302bb:	48 69 c0 e8 03 00 00 	imul   rax,rax,0x3e8
     12302c2:	49 89 86 b0 05 00 00 	mov    QWORD PTR [r14+0x5b0],rax
     12302c9:	48 89 df             	mov    rdi,rbx
     12302cc:	e8 b5 07 00 00       	call   1230a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7600a>
     12302d1:	48 89 c3             	mov    rbx,rax
     12302d4:	48 8b bd d8 07 00 00 	mov    rdi,QWORD PTR [rbp+0x7d8]
     12302db:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12302de:	ff 50 50             	call   QWORD PTR [rax+0x50]
     12302e1:	48 89 83 b8 05 00 00 	mov    QWORD PTR [rbx+0x5b8],rax
     12302e8:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     12302ec:	4c 89 e7             	mov    rdi,r12
     12302ef:	ff 90 e8 01 00 00    	call   QWORD PTR [rax+0x1e8]
     12302f5:	84 c0                	test   al,al
     12302f7:	0f 84 2c 01 00 00    	je     1230429 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x759ad>
     12302fd:	0f 57 c0             	xorps  xmm0,xmm0
     1230300:	0f 29 84 24 40 01 00 	movaps XMMWORD PTR [rsp+0x140],xmm0
     1230307:	00 
     1230308:	0f 29 84 24 30 01 00 	movaps XMMWORD PTR [rsp+0x130],xmm0
     123030f:	00 
     1230310:	c7 84 24 50 01 00 00 	mov    DWORD PTR [rsp+0x150],0x3f800000
     1230317:	00 00 80 3f 
     123031b:	48 8b 9d 38 07 00 00 	mov    rbx,QWORD PTR [rbp+0x738]
     1230322:	4c 8b ad 40 07 00 00 	mov    r13,QWORD PTR [rbp+0x740]
     1230329:	4c 39 eb             	cmp    rbx,r13
     123032c:	0f 84 9f 00 00 00    	je     12303d1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75955>
     1230332:	4c 8d b4 24 e0 01 00 	lea    r14,[rsp+0x1e0]
     1230339:	00 
     123033a:	4c 8d bc 24 00 01 00 	lea    r15,[rsp+0x100]
     1230341:	00 
     1230342:	4c 8d a4 24 d0 00 00 	lea    r12,[rsp+0xd0]
     1230349:	00 
     123034a:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0
     1230351:	00 00 

## Near-call argument-2 (rsi) reaching definitions
### call 0xd8a5d7
- 0xd8a5cc: lea    rsi,[rbx+0x8]
      d8a5b2:	48 89 df             	mov    rdi,rbx
      d8a5b5:	5b                   	pop    rbx
      d8a5b6:	e9 65 39 a6 00       	jmp    17edf20 <_ZdlPv@plt>
      d8a5bb:	48 8b 02             	mov    rax,QWORD PTR [rdx]
      d8a5be:	48 89 06             	mov    QWORD PTR [rsi],rax
      d8a5c1:	c3                   	ret
      d8a5c2:	53                   	push   rbx
      d8a5c3:	48 89 f1             	mov    rcx,rsi
      d8a5c6:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
      d8a5c9:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      d8a5cc:	48 8d 73 08          	lea    rsi,[rbx+0x8]
      d8a5d0:	0f b6 53 20          	movzx  edx,BYTE PTR [rbx+0x20]
      d8a5d4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d8a5d7:	ff 90 d8 01 00 00    	call   QWORD PTR [rax+0x1d8]
      d8a5dd:	48 8b 7b 50          	mov    rdi,QWORD PTR [rbx+0x50]
      d8a5e1:	6a 01                	push   0x1
      d8a5e3:	5e                   	pop    rsi
      d8a5e4:	5b                   	pop    rbx
      d8a5e5:	e9 76 e3 df ff       	jmp    b88960 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5900>
      d8a5ea:	55                   	push   rbp
      d8a5eb:	41 57                	push   r15
      d8a5ed:	41 56                	push   r14
      d8a5ef:	53                   	push   rbx
      d8a5f0:	50                   	push   rax
      d8a5f1:	48 81 c7 e0 04 00 00 	add    rdi,0x4e0
- 0xd8a536: mov    rsi,r14
      d8a518:	53                   	push   rbx
      d8a519:	48 89 fb             	mov    rbx,rdi
      d8a51c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      d8a520:	49 89 f6             	mov    r14,rsi
      d8a523:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      d8a528:	6a 30                	push   0x30
      d8a52a:	5f                   	pop    rdi
      d8a52b:	e8 d0 39 a6 00       	call   17edf00 <_Znwm@plt>
      d8a530:	49 89 c7             	mov    r15,rax
      d8a533:	48 89 c7             	mov    rdi,rax
      d8a536:	4c 89 f6             	mov    rsi,r14
      d8a539:	e8 7a dd df ff       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
      d8a53e:	4c 89 3b             	mov    QWORD PTR [rbx],r15
      d8a541:	48 8d 05 92 94 d3 ff 	lea    rax,[rip+0xffffffffffd39492]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
      d8a548:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      d8a54c:	48 8d 05 37 00 00 00 	lea    rax,[rip+0x37]        # d8a58a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57610>
      d8a553:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      d8a557:	5b                   	pop    rbx
      d8a558:	41 5e                	pop    r14
      d8a55a:	41 5f                	pop    r15
      d8a55c:	c3                   	ret
      d8a55d:	49 89 c6             	mov    r14,rax
      d8a560:	48 89 df             	mov    rdi,rbx
      d8a563:	e8 b8 93 e0 ff       	call   b93920 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe08c0>
      d8a568:	4c 89 f7             	mov    rdi,r14

### call 0x10adb3e

### call 0x10c0a35
- 0x10c0951: mov    rsi,QWORD PTR [rsi+0x8]
     10c093a:	41 5e                	pop    r14
     10c093c:	e9 f9 19 a4 ff       	jmp    b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
     10c0941:	48 83 c4 08          	add    rsp,0x8
     10c0945:	5b                   	pop    rbx
     10c0946:	41 5e                	pop    r14
     10c0948:	c3                   	ret
     10c0949:	cc                   	int3
     10c094a:	53                   	push   rbx
     10c094b:	48 89 d1             	mov    rcx,rdx
     10c094e:	48 89 fb             	mov    rbx,rdi
     10c0951:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]
     10c0955:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     10c0958:	31 d2                	xor    edx,edx
     10c095a:	ff 50 48             	call   QWORD PTR [rax+0x48]
     10c095d:	48 89 d8             	mov    rax,rbx
     10c0960:	5b                   	pop    rbx
     10c0961:	c3                   	ret
     10c0962:	53                   	push   rbx
     10c0963:	48 89 fb             	mov    rbx,rdi
     10c0966:	48 8d 05 3b d0 78 00 	lea    rax,[rip+0x78d03b]        # 184d9a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa090>
     10c096d:	48 89 07             	mov    QWORD PTR [rdi],rax
     10c0970:	48 81 c7 b8 00 00 00 	add    rdi,0xb8
     10c0977:	e8 b4 63 9e ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     10c097c:	48 8d bb 98 00 00 00 	lea    rdi,[rbx+0x98]
     10c0983:	e8 a8 63 9e ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>

### call 0x1230288
- 0x1230271: mov    rsi,r14
     1230247:	48 8d bd 98 08 00 00 	lea    rdi,[rbp+0x898]
     123024e:	e8 33 08 00 00       	call   1230a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7600a>
     1230253:	48 89 c3             	mov    rbx,rax
     1230256:	48 8b b5 88 07 00 00 	mov    rsi,QWORD PTR [rbp+0x788]
     123025d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1230260:	4c 8d b4 24 e0 01 00 	lea    r14,[rsp+0x1e0]
     1230267:	00 
     1230268:	4c 89 f7             	mov    rdi,r14
     123026b:	ff 50 10             	call   QWORD PTR [rax+0x10]
     123026e:	48 89 df             	mov    rdi,rbx
     1230271:	4c 89 f6             	mov    rsi,r14
     1230274:	e8 cf 23 00 00       	call   1232648 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x77bcc>
     1230279:	4c 89 f7             	mov    rdi,r14
     123027c:	e8 a9 ca ff ff       	call   122cd2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x722ae>
     1230281:	48 8b 45 10          	mov    rax,QWORD PTR [rbp+0x10]
     1230285:	4c 89 e7             	mov    rdi,r12
     1230288:	ff 90 d8 01 00 00    	call   QWORD PTR [rax+0x1d8]
     123028e:	84 c0                	test   al,al
     1230290:	74 56                	je     12302e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7586c>
     1230292:	48 83 bd d8 07 00 00 	cmp    QWORD PTR [rbp+0x7d8],0x0
     1230299:	00 
     123029a:	74 4c                	je     12302e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7586c>
     123029c:	48 8d 9d 98 08 00 00 	lea    rbx,[rbp+0x898]
     12302a3:	48 89 df             	mov    rdi,rbx
     12302a6:	e8 db 07 00 00       	call   1230a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7600a>
- 0x1230256: mov    rsi,QWORD PTR [rbp+0x788]
     123022e:	4c 89 f7             	mov    rdi,r14
     1230231:	e8 88 cb ff ff       	call   122cdbe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72342>
     1230236:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     123023a:	4c 89 e7             	mov    rdi,r12
     123023d:	ff 90 c8 01 00 00    	call   QWORD PTR [rax+0x1c8]
     1230243:	84 c0                	test   al,al
     1230245:	74 3a                	je     1230281 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75805>
     1230247:	48 8d bd 98 08 00 00 	lea    rdi,[rbp+0x898]
     123024e:	e8 33 08 00 00       	call   1230a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7600a>
     1230253:	48 89 c3             	mov    rbx,rax
     1230256:	48 8b b5 88 07 00 00 	mov    rsi,QWORD PTR [rbp+0x788]
     123025d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1230260:	4c 8d b4 24 e0 01 00 	lea    r14,[rsp+0x1e0]
     1230267:	00 
     1230268:	4c 89 f7             	mov    rdi,r14
     123026b:	ff 50 10             	call   QWORD PTR [rax+0x10]
     123026e:	48 89 df             	mov    rdi,rbx
     1230271:	4c 89 f6             	mov    rsi,r14
     1230274:	e8 cf 23 00 00       	call   1232648 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x77bcc>
     1230279:	4c 89 f7             	mov    rdi,r14
     123027c:	e8 a9 ca ff ff       	call   122cd2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x722ae>
     1230281:	48 8b 45 10          	mov    rax,QWORD PTR [rbp+0x10]
     1230285:	4c 89 e7             	mov    rdi,r12
     1230288:	ff 90 d8 01 00 00    	call   QWORD PTR [rax+0x1d8]
     123028e:	84 c0                	test   al,al
- 0x1230226: mov    rsi,r14
     12301fc:	e8 85 08 00 00       	call   1230a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7600a>
     1230201:	48 89 c3             	mov    rbx,rax
     1230204:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
     123020b:	00 
     123020c:	48 89 ee             	mov    rsi,rbp
     123020f:	e8 b2 22 00 00       	call   12324c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x77a4a>
     1230214:	48 81 c3 30 04 00 00 	add    rbx,0x430
     123021b:	4c 8d b4 24 48 02 00 	lea    r14,[rsp+0x248]
     1230222:	00 
     1230223:	48 89 df             	mov    rdi,rbx
     1230226:	4c 89 f6             	mov    rsi,r14
     1230229:	e8 aa 23 00 00       	call   12325d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x77b5c>
     123022e:	4c 89 f7             	mov    rdi,r14
     1230231:	e8 88 cb ff ff       	call   122cdbe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72342>
     1230236:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     123023a:	4c 89 e7             	mov    rdi,r12
     123023d:	ff 90 c8 01 00 00    	call   QWORD PTR [rax+0x1c8]
     1230243:	84 c0                	test   al,al
     1230245:	74 3a                	je     1230281 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75805>
     1230247:	48 8d bd 98 08 00 00 	lea    rdi,[rbp+0x898]
     123024e:	e8 33 08 00 00       	call   1230a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7600a>
     1230253:	48 89 c3             	mov    rbx,rax
     1230256:	48 8b b5 88 07 00 00 	mov    rsi,QWORD PTR [rbp+0x788]
     123025d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1230260:	4c 8d b4 24 e0 01 00 	lea    r14,[rsp+0x1e0]
- 0x123020c: mov    rsi,rbp
     12301e4:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     12301e8:	4c 89 e7             	mov    rdi,r12
     12301eb:	ff 90 18 01 00 00    	call   QWORD PTR [rax+0x118]
     12301f1:	84 c0                	test   al,al
     12301f3:	74 41                	je     1230236 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x757ba>
     12301f5:	48 8d bd 98 08 00 00 	lea    rdi,[rbp+0x898]
     12301fc:	e8 85 08 00 00       	call   1230a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7600a>
     1230201:	48 89 c3             	mov    rbx,rax
     1230204:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
     123020b:	00 
     123020c:	48 89 ee             	mov    rsi,rbp
     123020f:	e8 b2 22 00 00       	call   12324c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x77a4a>
     1230214:	48 81 c3 30 04 00 00 	add    rbx,0x430
     123021b:	4c 8d b4 24 48 02 00 	lea    r14,[rsp+0x248]
     1230222:	00 
     1230223:	48 89 df             	mov    rdi,rbx
     1230226:	4c 89 f6             	mov    rsi,r14
     1230229:	e8 aa 23 00 00       	call   12325d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x77b5c>
     123022e:	4c 89 f7             	mov    rdi,r14
     1230231:	e8 88 cb ff ff       	call   122cdbe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72342>
     1230236:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     123023a:	4c 89 e7             	mov    rdi,r12
     123023d:	ff 90 c8 01 00 00    	call   QWORD PTR [rax+0x1c8]
     1230243:	84 c0                	test   al,al
     1230245:	74 3a                	je     1230281 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75805>
- 0x12301c7: mov    rsi,r14
     123019b:	e8 72 21 00 00       	call   1232312 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x77896>
     12301a0:	48 8d bc 24 78 01 00 	lea    rdi,[rsp+0x178]
     12301a7:	00 
     12301a8:	48 8d b4 24 f8 01 00 	lea    rsi,[rsp+0x1f8]
     12301af:	00 
     12301b0:	e8 21 22 00 00       	call   12323d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7795a>
     12301b5:	48 81 c3 b0 07 00 00 	add    rbx,0x7b0
     12301bc:	4c 8d b4 24 60 01 00 	lea    r14,[rsp+0x160]
     12301c3:	00 
     12301c4:	48 89 df             	mov    rdi,rbx
     12301c7:	4c 89 f6             	mov    rsi,r14
     12301ca:	e8 af 22 00 00       	call   123247e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x77a02>
     12301cf:	4c 89 f7             	mov    rdi,r14
     12301d2:	e8 bd ca ff ff       	call   122cc94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72218>
     12301d7:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     12301de:	00 
     12301df:	e8 b0 ca ff ff       	call   122cc94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72218>
     12301e4:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     12301e8:	4c 89 e7             	mov    rdi,r12
     12301eb:	ff 90 18 01 00 00    	call   QWORD PTR [rax+0x118]
     12301f1:	84 c0                	test   al,al
     12301f3:	74 41                	je     1230236 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x757ba>
     12301f5:	48 8d bd 98 08 00 00 	lea    rdi,[rbp+0x898]
     12301fc:	e8 85 08 00 00       	call   1230a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7600a>
     1230201:	48 89 c3             	mov    rbx,rax

## Near-call receiver-vptr validation
### call 0xd8a5d7
      d8a5a2:	48 8b 1e             	mov    rbx,QWORD PTR [rsi]
      d8a5bb:	48 8b 02             	mov    rax,QWORD PTR [rdx]
      d8a5c6:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
      d8a5c9:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      d8a5d4:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### call 0x10adb3e
     10adb28:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10adb2e:	49 8b 06             	mov    rax,QWORD PTR [r14]

### call 0x10c0a35
     10c09e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10c09f6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10c0a0a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10c0a1e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10c0a32:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### call 0x1230288
     1230236:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     123025d:	48 8b 06             	mov    rax,QWORD PTR [rsi]

## Direct fd4bf2 thunk callers
