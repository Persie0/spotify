# Restrictions constructor tail after wrapper_0xd8 v2

Rebased combined run. Follows `[rsp+0x70]`, `wrapper_0xd8 / AP 0x184d9a8`, and later constructor-tail stores.

## Tail `10ac4e0..10ac980` interesting events

| addr | instruction |
|---:|---|
| `0x10ac4ec` | `10ac4ec:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ac4f2` | `10ac4f2:	bf d8 00 00 00       	mov    edi,0xd8` |
| `0x10ac4f7` | `10ac4f7:	e8 04 1a 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac4fc` | `10ac4fc:	48 8d 0d a5 14 7a 00 	lea    rcx,[rip+0x7a14a5]        # 184d9a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa090>` |
| `0x10ac503` | `10ac503:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10ac506` | `10ac506:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14` |
| `0x10ac50a` | `10ac50a:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]` |
| `0x10ac50f` | `10ac50f:	48 89 70 10          	mov    QWORD PTR [rax+0x10],rsi` |
| `0x10ac513` | `10ac513:	c6 40 18 00          	mov    BYTE PTR [rax+0x18],0x0` |
| `0x10ac517` | `10ac517:	48 8d 78 20          	lea    rdi,[rax+0x20]` |
| `0x10ac523` | `10ac523:	48 89 02             	mov    QWORD PTR [rdx],rax` |
| `0x10ac52d` | `10ac52d:	48 89 4a 10          	mov    QWORD PTR [rdx+0x10],rcx` |
| `0x10ac531` | `10ac531:	48 8d 0d fc 3c 01 00 	lea    rcx,[rip+0x13cfc]        # 10c0234 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28764a>` |
| `0x10ac538` | `10ac538:	48 89 4a 18          	mov    QWORD PTR [rdx+0x18],rcx` |
| `0x10ac542` | `10ac542:	ff 51 18             	call   QWORD PTR [rcx+0x18]` |
| `0x10ac550` | `10ac550:	e8 d5 17 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>` |
| `0x10ac560` | `10ac560:	4d 89 3e             	mov    QWORD PTR [r14],r15` |
| `0x10ac56a` | `10ac56a:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax` |
| `0x10ac56e` | `10ac56e:	48 8d 05 39 3d 01 00 	lea    rax,[rip+0x13d39]        # 10c02ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2876c4>` |
| `0x10ac575` | `10ac575:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax` |
| `0x10ac584` | `10ac584:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10ac58f` | `10ac58f:	e8 96 17 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>` |
| `0x10ac5a8` | `10ac5a8:	41 88 47 70          	mov    BYTE PTR [r15+0x70],al` |
| `0x10ac5ac` | `10ac5ac:	41 88 47 78          	mov    BYTE PTR [r15+0x78],al` |
| `0x10ac5cc` | `10ac5cc:	4c 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],r15` |
| `0x10ac5e2` | `10ac5e2:	e8 49 a7 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ac5ea` | `10ac5ea:	e8 11 19 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac5f6` | `10ac5f6:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax` |
| `0x10ac5fb` | `10ac5fb:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10ac602` | `10ac602:	48 8d 15 a7 ae 32 ff 	lea    rdx,[rip+0xffffffffff32aea7]        # 3d74b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2095>` |
| `0x10ac609` | `10ac609:	4c 8d 05 c0 ae 32 ff 	lea    r8,[rip+0xffffffffff32aec0]        # 3d74d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20b5>` |
| `0x10ac622` | `10ac622:	e8 a1 ae 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>` |
| `0x10ac627` | `10ac627:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0` |
| `0x10ac641` | `10ac641:	e8 09 f2 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0x10ac656` | `10ac656:	e8 d5 a6 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ac66a` | `10ac66a:	e8 0f d4 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10ac674` | `10ac674:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]` |
| `0x10ac688` | `10ac688:	e8 2d 0a a0 ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>` |
| `0x10ac6ae` | `10ac6ae:	e8 77 ad 53 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>` |
| `0x10ac6d4` | `10ac6d4:	e8 51 ad 53 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>` |
| `0x10ac6e1` | `10ac6e1:	e8 1a 18 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac6ff` | `10ac6ff:	49 89 57 10          	mov    QWORD PTR [r15+0x10],rdx` |
| `0x10ac737` | `10ac737:	49 89 55 10          	mov    QWORD PTR [r13+0x10],rdx` |
| `0x10ac742` | `10ac742:	49 89 55 18          	mov    QWORD PTR [r13+0x18],rdx` |
| `0x10ac74d` | `10ac74d:	49 89 16             	mov    QWORD PTR [r14],rdx` |
| `0x10ac758` | `10ac758:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx` |
| `0x10ac760` | `10ac760:	49 89 56 20          	mov    QWORD PTR [r14+0x20],rdx` |
| `0x10ac776` | `10ac776:	49 89 4e 28          	mov    QWORD PTR [r14+0x28],rcx` |
| `0x10ac77a` | `10ac77a:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax` |
| `0x10ac785` | `10ac785:	e8 3c 3e 00 00       	call   10b05c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2779dc>` |
| `0x10ac78d` | `10ac78d:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0` |
| `0x10ac7a7` | `10ac7a7:	e8 16 4f 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>` |
| `0x10ac7c0` | `10ac7c0:	e8 c9 ba a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>` |
| `0x10ac7c8` | `10ac7c8:	e8 6f 14 00 00       	call   10adc3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275052>` |
| `0x10ac7d0` | `10ac7d0:	e8 bb 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ac7d5` | `10ac7d5:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]` |
| `0x10ac7dd` | `10ac7dd:	4c 89 30             	mov    QWORD PTR [rax],r14` |
| `0x10ac7e8` | `10ac7e8:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10ac7f3` | `10ac7f3:	e8 98 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ac800` | `10ac800:	e8 8b 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ac812` | `10ac812:	e8 d1 b6 ab ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>` |
| `0x10ac81c` | `10ac81c:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]` |
| `0x10ac824` | `10ac824:	4c 8d b4 24 d8 00 00 	lea    r14,[rsp+0xd8]` |
| `0x10ac82c` | `10ac82c:	49 89 46 f8          	mov    QWORD PTR [r14-0x8],rax` |
| `0x10ac83b` | `10ac83b:	e8 6c c9 ac ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>` |
| `0x10ac847` | `10ac847:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax` |
| `0x10ac84f` | `10ac84f:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax` |
| `0x10ac870` | `10ac870:	e8 2b d2 ac ff       	call   b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>` |
| `0x10ac88a` | `10ac88a:	e8 71 16 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac89d` | `10ac89d:	e8 fe d1 ac ff       	call   b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>` |
| `0x10ac8aa` | `10ac8aa:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15` |
| `0x10ac8b5` | `10ac8b5:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax` |
| `0x10ac8c0` | `10ac8c0:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax` |
| `0x10ac8d7` | `10ac8d7:	e8 ac 4b 71 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>` |
| `0x10ac8df` | `10ac8df:	e8 ba a9 9f ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>` |
| `0x10ac8ec` | `10ac8ec:	e8 3f 61 ae ff       	call   b92a30 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdf9d0>` |
| `0x10ac8f4` | `10ac8f4:	e8 2d 42 9f ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>` |
| `0x10ac901` | `10ac901:	e8 20 42 9f ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>` |
| `0x10ac910` | `10ac910:	e8 1b a4 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ac92c` | `10ac92c:	e8 4d d1 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10ac936` | `10ac936:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]` |
| `0x10ac94a` | `10ac94a:	e8 6b 07 a0 ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>` |
| `0x10ac953` | `10ac953:	e8 14 99 df ff       	call   ea626c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d682>` |
| `0x10ac95f` | `10ac95f:	e8 26 99 df ff       	call   ea628a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6a0>` |
| `0x10ac96b` | `10ac96b:	e8 90 15 74 00       	call   17edf00 <_Znwm@plt>` |

## `0x10ac4e4` — second [rsp+0x40] vtable+0x28 call

```text
 10ac4a6:	41 59                	pop    r9
 10ac4a8:	4c 89 f7             	mov    rdi,r14
 10ac4ab:	e8 18 b0 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ac4b0:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
 10ac4b5:	0f 84 1f 01 00 00    	je     10ac5da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2739f0>
 10ac4bb:	48 8d 35 e9 c3 32 ff 	lea    rsi,[rip+0xffffffffff32c3e9]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ac4c2:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac4c9:	00
 10ac4ca:	e8 80 f3 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac4cf:	84 c0                	test   al,al
 10ac4d1:	0f 84 03 01 00 00    	je     10ac5da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2739f0>
 10ac4d7:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac4de:	00
 10ac4df:	e8 4c a8 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac4e4:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10ac4e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac4ec:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ac4ef:	49 89 c6             	mov    r14,rax
 10ac4f2:	bf d8 00 00 00       	mov    edi,0xd8
 10ac4f7:	e8 04 1a 74 00       	call   17edf00 <_Znwm@plt>
 10ac4fc:	48 8d 0d a5 14 7a 00 	lea    rcx,[rip+0x7a14a5]        # 184d9a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa090>
 10ac503:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac506:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
 10ac50a:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
 10ac50f:	48 89 70 10          	mov    QWORD PTR [rax+0x10],rsi
 10ac513:	c6 40 18 00          	mov    BYTE PTR [rax+0x18],0x0
 10ac517:	48 8d 78 20          	lea    rdi,[rax+0x20]
 10ac51b:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac522:	00
 10ac523:	48 89 02             	mov    QWORD PTR [rdx],rax
 10ac526:	48 8d 0d 37 ff 9c ff 	lea    rcx,[rip+0xffffffffff9cff37]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac52d:	48 89 4a 10          	mov    QWORD PTR [rdx+0x10],rcx
 10ac531:	48 8d 0d fc 3c 01 00 	lea    rcx,[rip+0x13cfc]        # 10c0234 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28764a>
 10ac538:	48 89 4a 18          	mov    QWORD PTR [rdx+0x18],rcx
 10ac53c:	48 8b 0e             	mov    rcx,QWORD PTR [rsi]
 10ac53f:	49 89 c7             	mov    r15,rax
 10ac542:	ff 51 18             	call   QWORD PTR [rcx+0x18]
 10ac545:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac54c:	00
 10ac54d:	4c 89 f7             	mov    rdi,r14
 10ac550:	e8 d5 17 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ac555:	4c 89 ff             	mov    rdi,r15
 10ac558:	48 83 c7 30          	add    rdi,0x30
 10ac55c:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
 10ac560:	4d 89 3e             	mov    QWORD PTR [r14],r15
 10ac563:	48 8d 05 fa fe 9c ff 	lea    rax,[rip+0xffffffffff9cfefa]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac56a:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
 10ac56e:	48 8d 05 39 3d 01 00 	lea    rax,[rip+0x13d39]        # 10c02ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2876c4>
 10ac575:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
 10ac579:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ac57c:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac583:	00
 10ac584:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10ac587:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac58e:	00
 10ac58f:	e8 96 17 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ac594:	0f 57 c0             	xorps  xmm0,xmm0
 10ac597:	49 83 67 50 00       	and    QWORD PTR [r15+0x50],0x0
 10ac59c:	41 0f 11 47 40       	movups XMMWORD PTR [r15+0x40],xmm0
 10ac5a1:	49 83 67 68 00       	and    QWORD PTR [r15+0x68],0x0
 10ac5a6:	31 c0                	xor    eax,eax
 10ac5a8:	41 88 47 70          	mov    BYTE PTR [r15+0x70],al
 10ac5ac:	41 88 47 78          	mov    BYTE PTR [r15+0x78],al
 10ac5b0:	41 88 87 90 00 00 00 	mov    BYTE PTR [r15+0x90],al
 10ac5b7:	41 88 87 98 00 00 00 	mov    BYTE PTR [r15+0x98],al
 10ac5be:	41 88 87 b0 00 00 00 	mov    BYTE PTR [r15+0xb0],al
 10ac5c5:	41 88 87 b8 00 00 00 	mov    BYTE PTR [r15+0xb8],al
 10ac5cc:	4c 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],r15
 10ac5d1:	41 88 87 d0 00 00 00 	mov    BYTE PTR [r15+0xd0],al
 10ac5d8:	eb 24                	jmp    10ac5fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273a14>
 10ac5da:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac5e1:	00
 10ac5e2:	e8 49 a7 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac5e7:	6a 08                	push   0x8
 10ac5e9:	5f                   	pop    rdi
 10ac5ea:	e8 11 19 74 00       	call   17edf00 <_Znwm@plt>
 10ac5ef:	48 8d 0d 3a 14 7a 00 	lea    rcx,[rip+0x7a143a]        # 184da30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa118>
 10ac5f6:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 10ac5fb:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac5fe:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 10ac602:	48 8d 15 a7 ae 32 ff 	lea    rdx,[rip+0xffffffffff32aea7]        # 3d74b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2095>
 10ac609:	4c 8d 05 c0 ae 32 ff 	lea    r8,[rip+0xffffffffff32aec0]        # 3d74d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20b5>
 10ac610:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac617:	00
 10ac618:	6a 11                	push   0x11
 10ac61a:	59                   	pop    rcx
 10ac61b:	6a 19                	push   0x19
 10ac61d:	41 59                	pop    r9
 10ac61f:	4c 89 f7             	mov    rdi,r14
 10ac622:	e8 a1 ae 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ac627:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
 10ac62c:	0f 84 d6 02 00 00    	je     10ac908 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273d1e>
 10ac632:	48 8d 35 72 c2 32 ff 	lea    rsi,[rip+0xffffffffff32c272]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ac639:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac640:	00
 10ac641:	e8 09 f2 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac646:	84 c0                	test   al,al
 10ac648:	0f 84 ba 02 00 00    	je     10ac908 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273d1e>
 10ac64e:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac655:	00
 10ac656:	e8 d5 a6 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac65b:	48 8d 35 5b 13 2c ff 	lea    rsi,[rip+0xffffffffff2c135b]        # 36d9bd <_ZTSSt12bad_any_cast@@Base-0x2280b>
 10ac662:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
 10ac669:	00
```
## `0x10ac4f7` — operator new(0xd8)

```text
 10ac4bb:	48 8d 35 e9 c3 32 ff 	lea    rsi,[rip+0xffffffffff32c3e9]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ac4c2:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac4c9:	00
 10ac4ca:	e8 80 f3 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac4cf:	84 c0                	test   al,al
 10ac4d1:	0f 84 03 01 00 00    	je     10ac5da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2739f0>
 10ac4d7:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac4de:	00
 10ac4df:	e8 4c a8 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac4e4:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10ac4e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac4ec:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ac4ef:	49 89 c6             	mov    r14,rax
 10ac4f2:	bf d8 00 00 00       	mov    edi,0xd8
 10ac4f7:	e8 04 1a 74 00       	call   17edf00 <_Znwm@plt>
 10ac4fc:	48 8d 0d a5 14 7a 00 	lea    rcx,[rip+0x7a14a5]        # 184d9a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa090>
 10ac503:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac506:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
 10ac50a:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
 10ac50f:	48 89 70 10          	mov    QWORD PTR [rax+0x10],rsi
 10ac513:	c6 40 18 00          	mov    BYTE PTR [rax+0x18],0x0
 10ac517:	48 8d 78 20          	lea    rdi,[rax+0x20]
 10ac51b:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac522:	00
 10ac523:	48 89 02             	mov    QWORD PTR [rdx],rax
 10ac526:	48 8d 0d 37 ff 9c ff 	lea    rcx,[rip+0xffffffffff9cff37]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac52d:	48 89 4a 10          	mov    QWORD PTR [rdx+0x10],rcx
 10ac531:	48 8d 0d fc 3c 01 00 	lea    rcx,[rip+0x13cfc]        # 10c0234 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28764a>
 10ac538:	48 89 4a 18          	mov    QWORD PTR [rdx+0x18],rcx
 10ac53c:	48 8b 0e             	mov    rcx,QWORD PTR [rsi]
 10ac53f:	49 89 c7             	mov    r15,rax
 10ac542:	ff 51 18             	call   QWORD PTR [rcx+0x18]
 10ac545:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac54c:	00
 10ac54d:	4c 89 f7             	mov    rdi,r14
 10ac550:	e8 d5 17 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ac555:	4c 89 ff             	mov    rdi,r15
 10ac558:	48 83 c7 30          	add    rdi,0x30
 10ac55c:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
 10ac560:	4d 89 3e             	mov    QWORD PTR [r14],r15
 10ac563:	48 8d 05 fa fe 9c ff 	lea    rax,[rip+0xffffffffff9cfefa]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac56a:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
 10ac56e:	48 8d 05 39 3d 01 00 	lea    rax,[rip+0x13d39]        # 10c02ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2876c4>
 10ac575:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
 10ac579:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ac57c:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac583:	00
 10ac584:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10ac587:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac58e:	00
 10ac58f:	e8 96 17 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ac594:	0f 57 c0             	xorps  xmm0,xmm0
 10ac597:	49 83 67 50 00       	and    QWORD PTR [r15+0x50],0x0
 10ac59c:	41 0f 11 47 40       	movups XMMWORD PTR [r15+0x40],xmm0
 10ac5a1:	49 83 67 68 00       	and    QWORD PTR [r15+0x68],0x0
 10ac5a6:	31 c0                	xor    eax,eax
 10ac5a8:	41 88 47 70          	mov    BYTE PTR [r15+0x70],al
 10ac5ac:	41 88 47 78          	mov    BYTE PTR [r15+0x78],al
 10ac5b0:	41 88 87 90 00 00 00 	mov    BYTE PTR [r15+0x90],al
 10ac5b7:	41 88 87 98 00 00 00 	mov    BYTE PTR [r15+0x98],al
 10ac5be:	41 88 87 b0 00 00 00 	mov    BYTE PTR [r15+0xb0],al
 10ac5c5:	41 88 87 b8 00 00 00 	mov    BYTE PTR [r15+0xb8],al
 10ac5cc:	4c 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],r15
 10ac5d1:	41 88 87 d0 00 00 00 	mov    BYTE PTR [r15+0xd0],al
 10ac5d8:	eb 24                	jmp    10ac5fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273a14>
 10ac5da:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac5e1:	00
 10ac5e2:	e8 49 a7 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac5e7:	6a 08                	push   0x8
 10ac5e9:	5f                   	pop    rdi
 10ac5ea:	e8 11 19 74 00       	call   17edf00 <_Znwm@plt>
 10ac5ef:	48 8d 0d 3a 14 7a 00 	lea    rcx,[rip+0x7a143a]        # 184da30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa118>
 10ac5f6:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 10ac5fb:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac5fe:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 10ac602:	48 8d 15 a7 ae 32 ff 	lea    rdx,[rip+0xffffffffff32aea7]        # 3d74b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2095>
 10ac609:	4c 8d 05 c0 ae 32 ff 	lea    r8,[rip+0xffffffffff32aec0]        # 3d74d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20b5>
 10ac610:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac617:	00
 10ac618:	6a 11                	push   0x11
 10ac61a:	59                   	pop    rcx
 10ac61b:	6a 19                	push   0x19
 10ac61d:	41 59                	pop    r9
 10ac61f:	4c 89 f7             	mov    rdi,r14
 10ac622:	e8 a1 ae 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ac627:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
 10ac62c:	0f 84 d6 02 00 00    	je     10ac908 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273d1e>
 10ac632:	48 8d 35 72 c2 32 ff 	lea    rsi,[rip+0xffffffffff32c272]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ac639:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac640:	00
 10ac641:	e8 09 f2 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac646:	84 c0                	test   al,al
 10ac648:	0f 84 ba 02 00 00    	je     10ac908 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273d1e>
 10ac64e:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac655:	00
 10ac656:	e8 d5 a6 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac65b:	48 8d 35 5b 13 2c ff 	lea    rsi,[rip+0xffffffffff2c135b]        # 36d9bd <_ZTSSt12bad_any_cast@@Base-0x2280b>
 10ac662:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
 10ac669:	00
 10ac66a:	e8 0f d4 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10ac66f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 10ac674:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
 10ac678:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 10ac67f:	00
```
## `0x10ac503` — AP 0x184d9a8 store

```text
 10ac4c9:	00
 10ac4ca:	e8 80 f3 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac4cf:	84 c0                	test   al,al
 10ac4d1:	0f 84 03 01 00 00    	je     10ac5da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2739f0>
 10ac4d7:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac4de:	00
 10ac4df:	e8 4c a8 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac4e4:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10ac4e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac4ec:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ac4ef:	49 89 c6             	mov    r14,rax
 10ac4f2:	bf d8 00 00 00       	mov    edi,0xd8
 10ac4f7:	e8 04 1a 74 00       	call   17edf00 <_Znwm@plt>
 10ac4fc:	48 8d 0d a5 14 7a 00 	lea    rcx,[rip+0x7a14a5]        # 184d9a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa090>
 10ac503:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac506:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
 10ac50a:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
 10ac50f:	48 89 70 10          	mov    QWORD PTR [rax+0x10],rsi
 10ac513:	c6 40 18 00          	mov    BYTE PTR [rax+0x18],0x0
 10ac517:	48 8d 78 20          	lea    rdi,[rax+0x20]
 10ac51b:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac522:	00
 10ac523:	48 89 02             	mov    QWORD PTR [rdx],rax
 10ac526:	48 8d 0d 37 ff 9c ff 	lea    rcx,[rip+0xffffffffff9cff37]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac52d:	48 89 4a 10          	mov    QWORD PTR [rdx+0x10],rcx
 10ac531:	48 8d 0d fc 3c 01 00 	lea    rcx,[rip+0x13cfc]        # 10c0234 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28764a>
 10ac538:	48 89 4a 18          	mov    QWORD PTR [rdx+0x18],rcx
 10ac53c:	48 8b 0e             	mov    rcx,QWORD PTR [rsi]
 10ac53f:	49 89 c7             	mov    r15,rax
 10ac542:	ff 51 18             	call   QWORD PTR [rcx+0x18]
 10ac545:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac54c:	00
 10ac54d:	4c 89 f7             	mov    rdi,r14
 10ac550:	e8 d5 17 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ac555:	4c 89 ff             	mov    rdi,r15
 10ac558:	48 83 c7 30          	add    rdi,0x30
 10ac55c:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
 10ac560:	4d 89 3e             	mov    QWORD PTR [r14],r15
 10ac563:	48 8d 05 fa fe 9c ff 	lea    rax,[rip+0xffffffffff9cfefa]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac56a:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
 10ac56e:	48 8d 05 39 3d 01 00 	lea    rax,[rip+0x13d39]        # 10c02ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2876c4>
 10ac575:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
 10ac579:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ac57c:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac583:	00
 10ac584:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10ac587:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac58e:	00
 10ac58f:	e8 96 17 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ac594:	0f 57 c0             	xorps  xmm0,xmm0
 10ac597:	49 83 67 50 00       	and    QWORD PTR [r15+0x50],0x0
 10ac59c:	41 0f 11 47 40       	movups XMMWORD PTR [r15+0x40],xmm0
 10ac5a1:	49 83 67 68 00       	and    QWORD PTR [r15+0x68],0x0
 10ac5a6:	31 c0                	xor    eax,eax
 10ac5a8:	41 88 47 70          	mov    BYTE PTR [r15+0x70],al
 10ac5ac:	41 88 47 78          	mov    BYTE PTR [r15+0x78],al
 10ac5b0:	41 88 87 90 00 00 00 	mov    BYTE PTR [r15+0x90],al
 10ac5b7:	41 88 87 98 00 00 00 	mov    BYTE PTR [r15+0x98],al
 10ac5be:	41 88 87 b0 00 00 00 	mov    BYTE PTR [r15+0xb0],al
 10ac5c5:	41 88 87 b8 00 00 00 	mov    BYTE PTR [r15+0xb8],al
 10ac5cc:	4c 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],r15
 10ac5d1:	41 88 87 d0 00 00 00 	mov    BYTE PTR [r15+0xd0],al
 10ac5d8:	eb 24                	jmp    10ac5fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273a14>
 10ac5da:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac5e1:	00
 10ac5e2:	e8 49 a7 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac5e7:	6a 08                	push   0x8
 10ac5e9:	5f                   	pop    rdi
 10ac5ea:	e8 11 19 74 00       	call   17edf00 <_Znwm@plt>
 10ac5ef:	48 8d 0d 3a 14 7a 00 	lea    rcx,[rip+0x7a143a]        # 184da30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa118>
 10ac5f6:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 10ac5fb:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac5fe:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 10ac602:	48 8d 15 a7 ae 32 ff 	lea    rdx,[rip+0xffffffffff32aea7]        # 3d74b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2095>
 10ac609:	4c 8d 05 c0 ae 32 ff 	lea    r8,[rip+0xffffffffff32aec0]        # 3d74d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20b5>
 10ac610:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac617:	00
 10ac618:	6a 11                	push   0x11
 10ac61a:	59                   	pop    rcx
 10ac61b:	6a 19                	push   0x19
 10ac61d:	41 59                	pop    r9
 10ac61f:	4c 89 f7             	mov    rdi,r14
 10ac622:	e8 a1 ae 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ac627:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
 10ac62c:	0f 84 d6 02 00 00    	je     10ac908 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273d1e>
 10ac632:	48 8d 35 72 c2 32 ff 	lea    rsi,[rip+0xffffffffff32c272]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ac639:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac640:	00
 10ac641:	e8 09 f2 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac646:	84 c0                	test   al,al
 10ac648:	0f 84 ba 02 00 00    	je     10ac908 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273d1e>
 10ac64e:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac655:	00
 10ac656:	e8 d5 a6 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac65b:	48 8d 35 5b 13 2c ff 	lea    rsi,[rip+0xffffffffff2c135b]        # 36d9bd <_ZTSSt12bad_any_cast@@Base-0x2280b>
 10ac662:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
 10ac669:	00
 10ac66a:	e8 0f d4 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10ac66f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 10ac674:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
 10ac678:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 10ac67f:	00
 10ac680:	48 8d 94 24 b8 00 00 	lea    rdx,[rsp+0xb8]
 10ac687:	00
```
## `0x10ac51b` — post wrapper_0xd8 continuation

```text
 10ac4df:	e8 4c a8 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac4e4:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10ac4e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac4ec:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ac4ef:	49 89 c6             	mov    r14,rax
 10ac4f2:	bf d8 00 00 00       	mov    edi,0xd8
 10ac4f7:	e8 04 1a 74 00       	call   17edf00 <_Znwm@plt>
 10ac4fc:	48 8d 0d a5 14 7a 00 	lea    rcx,[rip+0x7a14a5]        # 184d9a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa090>
 10ac503:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac506:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
 10ac50a:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
 10ac50f:	48 89 70 10          	mov    QWORD PTR [rax+0x10],rsi
 10ac513:	c6 40 18 00          	mov    BYTE PTR [rax+0x18],0x0
 10ac517:	48 8d 78 20          	lea    rdi,[rax+0x20]
 10ac51b:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac522:	00
 10ac523:	48 89 02             	mov    QWORD PTR [rdx],rax
 10ac526:	48 8d 0d 37 ff 9c ff 	lea    rcx,[rip+0xffffffffff9cff37]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac52d:	48 89 4a 10          	mov    QWORD PTR [rdx+0x10],rcx
 10ac531:	48 8d 0d fc 3c 01 00 	lea    rcx,[rip+0x13cfc]        # 10c0234 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28764a>
 10ac538:	48 89 4a 18          	mov    QWORD PTR [rdx+0x18],rcx
 10ac53c:	48 8b 0e             	mov    rcx,QWORD PTR [rsi]
 10ac53f:	49 89 c7             	mov    r15,rax
 10ac542:	ff 51 18             	call   QWORD PTR [rcx+0x18]
 10ac545:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac54c:	00
 10ac54d:	4c 89 f7             	mov    rdi,r14
 10ac550:	e8 d5 17 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ac555:	4c 89 ff             	mov    rdi,r15
 10ac558:	48 83 c7 30          	add    rdi,0x30
 10ac55c:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
 10ac560:	4d 89 3e             	mov    QWORD PTR [r14],r15
 10ac563:	48 8d 05 fa fe 9c ff 	lea    rax,[rip+0xffffffffff9cfefa]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac56a:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
 10ac56e:	48 8d 05 39 3d 01 00 	lea    rax,[rip+0x13d39]        # 10c02ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2876c4>
 10ac575:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
 10ac579:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ac57c:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac583:	00
 10ac584:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10ac587:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac58e:	00
 10ac58f:	e8 96 17 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ac594:	0f 57 c0             	xorps  xmm0,xmm0
 10ac597:	49 83 67 50 00       	and    QWORD PTR [r15+0x50],0x0
 10ac59c:	41 0f 11 47 40       	movups XMMWORD PTR [r15+0x40],xmm0
 10ac5a1:	49 83 67 68 00       	and    QWORD PTR [r15+0x68],0x0
 10ac5a6:	31 c0                	xor    eax,eax
 10ac5a8:	41 88 47 70          	mov    BYTE PTR [r15+0x70],al
 10ac5ac:	41 88 47 78          	mov    BYTE PTR [r15+0x78],al
 10ac5b0:	41 88 87 90 00 00 00 	mov    BYTE PTR [r15+0x90],al
 10ac5b7:	41 88 87 98 00 00 00 	mov    BYTE PTR [r15+0x98],al
 10ac5be:	41 88 87 b0 00 00 00 	mov    BYTE PTR [r15+0xb0],al
 10ac5c5:	41 88 87 b8 00 00 00 	mov    BYTE PTR [r15+0xb8],al
 10ac5cc:	4c 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],r15
 10ac5d1:	41 88 87 d0 00 00 00 	mov    BYTE PTR [r15+0xd0],al
 10ac5d8:	eb 24                	jmp    10ac5fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273a14>
 10ac5da:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac5e1:	00
 10ac5e2:	e8 49 a7 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac5e7:	6a 08                	push   0x8
 10ac5e9:	5f                   	pop    rdi
 10ac5ea:	e8 11 19 74 00       	call   17edf00 <_Znwm@plt>
 10ac5ef:	48 8d 0d 3a 14 7a 00 	lea    rcx,[rip+0x7a143a]        # 184da30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa118>
 10ac5f6:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 10ac5fb:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac5fe:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 10ac602:	48 8d 15 a7 ae 32 ff 	lea    rdx,[rip+0xffffffffff32aea7]        # 3d74b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2095>
 10ac609:	4c 8d 05 c0 ae 32 ff 	lea    r8,[rip+0xffffffffff32aec0]        # 3d74d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20b5>
 10ac610:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac617:	00
 10ac618:	6a 11                	push   0x11
 10ac61a:	59                   	pop    rcx
 10ac61b:	6a 19                	push   0x19
 10ac61d:	41 59                	pop    r9
 10ac61f:	4c 89 f7             	mov    rdi,r14
 10ac622:	e8 a1 ae 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ac627:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
 10ac62c:	0f 84 d6 02 00 00    	je     10ac908 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273d1e>
 10ac632:	48 8d 35 72 c2 32 ff 	lea    rsi,[rip+0xffffffffff32c272]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ac639:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac640:	00
 10ac641:	e8 09 f2 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac646:	84 c0                	test   al,al
 10ac648:	0f 84 ba 02 00 00    	je     10ac908 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273d1e>
 10ac64e:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac655:	00
 10ac656:	e8 d5 a6 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac65b:	48 8d 35 5b 13 2c ff 	lea    rsi,[rip+0xffffffffff2c135b]        # 36d9bd <_ZTSSt12bad_any_cast@@Base-0x2280b>
 10ac662:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
 10ac669:	00
 10ac66a:	e8 0f d4 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10ac66f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 10ac674:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
 10ac678:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 10ac67f:	00
 10ac680:	48 8d 94 24 b8 00 00 	lea    rdx,[rsp+0xb8]
 10ac687:	00
 10ac688:	e8 2d 0a a0 ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
 10ac68d:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10ac691:	48 8d 35 18 b0 32 ff 	lea    rsi,[rip+0xffffffffff32b018]        # 3d76b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2295>
 10ac698:	48 8d 0d 31 b0 32 ff 	lea    rcx,[rip+0xffffffffff32b031]        # 3d76d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22b5>
 10ac69f:	6a 11                	push   0x11
 10ac6a1:	41 5e                	pop    r14
```
## `0x10ac5da` — fallback branch

```text
 10ac594:	0f 57 c0             	xorps  xmm0,xmm0
 10ac597:	49 83 67 50 00       	and    QWORD PTR [r15+0x50],0x0
 10ac59c:	41 0f 11 47 40       	movups XMMWORD PTR [r15+0x40],xmm0
 10ac5a1:	49 83 67 68 00       	and    QWORD PTR [r15+0x68],0x0
 10ac5a6:	31 c0                	xor    eax,eax
 10ac5a8:	41 88 47 70          	mov    BYTE PTR [r15+0x70],al
 10ac5ac:	41 88 47 78          	mov    BYTE PTR [r15+0x78],al
 10ac5b0:	41 88 87 90 00 00 00 	mov    BYTE PTR [r15+0x90],al
 10ac5b7:	41 88 87 98 00 00 00 	mov    BYTE PTR [r15+0x98],al
 10ac5be:	41 88 87 b0 00 00 00 	mov    BYTE PTR [r15+0xb0],al
 10ac5c5:	41 88 87 b8 00 00 00 	mov    BYTE PTR [r15+0xb8],al
 10ac5cc:	4c 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],r15
 10ac5d1:	41 88 87 d0 00 00 00 	mov    BYTE PTR [r15+0xd0],al
 10ac5d8:	eb 24                	jmp    10ac5fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273a14>
 10ac5da:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac5e1:	00
 10ac5e2:	e8 49 a7 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac5e7:	6a 08                	push   0x8
 10ac5e9:	5f                   	pop    rdi
 10ac5ea:	e8 11 19 74 00       	call   17edf00 <_Znwm@plt>
 10ac5ef:	48 8d 0d 3a 14 7a 00 	lea    rcx,[rip+0x7a143a]        # 184da30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa118>
 10ac5f6:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 10ac5fb:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac5fe:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 10ac602:	48 8d 15 a7 ae 32 ff 	lea    rdx,[rip+0xffffffffff32aea7]        # 3d74b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2095>
 10ac609:	4c 8d 05 c0 ae 32 ff 	lea    r8,[rip+0xffffffffff32aec0]        # 3d74d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20b5>
 10ac610:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac617:	00
 10ac618:	6a 11                	push   0x11
 10ac61a:	59                   	pop    rcx
 10ac61b:	6a 19                	push   0x19
 10ac61d:	41 59                	pop    r9
 10ac61f:	4c 89 f7             	mov    rdi,r14
 10ac622:	e8 a1 ae 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ac627:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
 10ac62c:	0f 84 d6 02 00 00    	je     10ac908 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273d1e>
 10ac632:	48 8d 35 72 c2 32 ff 	lea    rsi,[rip+0xffffffffff32c272]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ac639:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac640:	00
 10ac641:	e8 09 f2 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac646:	84 c0                	test   al,al
 10ac648:	0f 84 ba 02 00 00    	je     10ac908 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273d1e>
 10ac64e:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac655:	00
 10ac656:	e8 d5 a6 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac65b:	48 8d 35 5b 13 2c ff 	lea    rsi,[rip+0xffffffffff2c135b]        # 36d9bd <_ZTSSt12bad_any_cast@@Base-0x2280b>
 10ac662:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
 10ac669:	00
 10ac66a:	e8 0f d4 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10ac66f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 10ac674:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
 10ac678:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 10ac67f:	00
 10ac680:	48 8d 94 24 b8 00 00 	lea    rdx,[rsp+0xb8]
 10ac687:	00
 10ac688:	e8 2d 0a a0 ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
 10ac68d:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10ac691:	48 8d 35 18 b0 32 ff 	lea    rsi,[rip+0xffffffffff32b018]        # 3d76b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2295>
 10ac698:	48 8d 0d 31 b0 32 ff 	lea    rcx,[rip+0xffffffffff32b031]        # 3d76d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22b5>
 10ac69f:	6a 11                	push   0x11
 10ac6a1:	41 5e                	pop    r14
 10ac6a3:	6a 12                	push   0x12
 10ac6a5:	41 58                	pop    r8
 10ac6a7:	6a 03                	push   0x3
 10ac6a9:	41 59                	pop    r9
 10ac6ab:	4c 89 f2             	mov    rdx,r14
 10ac6ae:	e8 77 ad 53 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
 10ac6b3:	89 c5                	mov    ebp,eax
 10ac6b5:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10ac6b9:	48 8d 35 30 b0 32 ff 	lea    rsi,[rip+0xffffffffff32b030]        # 3d76f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22d5>
 10ac6c0:	48 8d 0d 49 b0 32 ff 	lea    rcx,[rip+0xffffffffff32b049]        # 3d7710 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22f5>
 10ac6c7:	6a 1f                	push   0x1f
 10ac6c9:	41 58                	pop    r8
 10ac6cb:	4c 89 f2             	mov    rdx,r14
 10ac6ce:	41 b9 10 0e 00 00    	mov    r9d,0xe10
 10ac6d4:	e8 51 ad 53 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
 10ac6d9:	41 89 c7             	mov    r15d,eax
 10ac6dc:	bf f8 00 00 00       	mov    edi,0xf8
 10ac6e1:	e8 1a 18 74 00       	call   17edf00 <_Znwm@plt>
 10ac6e6:	49 89 c6             	mov    r14,rax
 10ac6e9:	49 63 c7             	movsxd rax,r15d
 10ac6ec:	48 63 cd             	movsxd rcx,ebp
 10ac6ef:	48 8b 94 24 e0 00 00 	mov    rdx,QWORD PTR [rsp+0xe0]
 10ac6f6:	00
 10ac6f7:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]
 10ac6fe:	00
 10ac6ff:	49 89 57 10          	mov    QWORD PTR [r15+0x10],rdx
 10ac703:	0f 28 84 24 d0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xd0]
 10ac70a:	00
 10ac70b:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
 10ac70f:	48 83 a4 24 e0 00 00 	and    QWORD PTR [rsp+0xe0],0x0
 10ac716:	00 00
 10ac718:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]
 10ac71f:	00
 10ac720:	49 83 65 00 00       	and    QWORD PTR [r13+0x0],0x0
 10ac725:	0f 57 c9             	xorps  xmm1,xmm1
 10ac728:	0f 29 8c 24 d0 00 00 	movaps XMMWORD PTR [rsp+0xd0],xmm1
 10ac72f:	00
 10ac730:	48 8d 15 a9 b6 92 ff 	lea    rdx,[rip+0xffffffffff92b6a9]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 10ac737:	49 89 55 10          	mov    QWORD PTR [r13+0x10],rdx
 10ac73b:	48 8d 15 ea 14 00 00 	lea    rdx,[rip+0x14ea]        # 10adc2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275042>
 10ac742:	49 89 55 18          	mov    QWORD PTR [r13+0x18],rdx
 10ac746:	48 8d 15 43 06 7a 00 	lea    rdx,[rip+0x7a0643]        # 184cd90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9478>
 10ac74d:	49 89 16             	mov    QWORD PTR [r14],rdx
```
## `0x10ac487` — join from wrapper_0x80/fallback holder

```text
 10ac44f:	41 0f 11 47 58       	movups XMMWORD PTR [r15+0x58],xmm0
 10ac454:	4c 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],r15
 10ac459:	41 c7 47 78 00 00 80 	mov    DWORD PTR [r15+0x78],0x3f800000
 10ac460:	3f
 10ac461:	eb 24                	jmp    10ac487 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27389d>
 10ac463:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac46a:	00
 10ac46b:	e8 c0 a8 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac470:	6a 08                	push   0x8
 10ac472:	5f                   	pop    rdi
 10ac473:	e8 88 1a 74 00       	call   17edf00 <_Znwm@plt>
 10ac478:	48 8d 0d 71 0d 7a 00 	lea    rcx,[rip+0x7a0d71]        # 184d1f0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x98d8>
 10ac47f:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
 10ac484:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac487:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 10ac48b:	48 8d 15 de af 32 ff 	lea    rdx,[rip+0xffffffffff32afde]        # 3d7470 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2055>
 10ac492:	4c 8d 05 f7 af 32 ff 	lea    r8,[rip+0xffffffffff32aff7]        # 3d7490 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2075>
 10ac499:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac4a0:	00
 10ac4a1:	6a 11                	push   0x11
 10ac4a3:	59                   	pop    rcx
 10ac4a4:	6a 19                	push   0x19
 10ac4a6:	41 59                	pop    r9
 10ac4a8:	4c 89 f7             	mov    rdi,r14
 10ac4ab:	e8 18 b0 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ac4b0:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
 10ac4b5:	0f 84 1f 01 00 00    	je     10ac5da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2739f0>
 10ac4bb:	48 8d 35 e9 c3 32 ff 	lea    rsi,[rip+0xffffffffff32c3e9]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ac4c2:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac4c9:	00
 10ac4ca:	e8 80 f3 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac4cf:	84 c0                	test   al,al
 10ac4d1:	0f 84 03 01 00 00    	je     10ac5da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2739f0>
 10ac4d7:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac4de:	00
 10ac4df:	e8 4c a8 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac4e4:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10ac4e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac4ec:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ac4ef:	49 89 c6             	mov    r14,rax
 10ac4f2:	bf d8 00 00 00       	mov    edi,0xd8
 10ac4f7:	e8 04 1a 74 00       	call   17edf00 <_Znwm@plt>
 10ac4fc:	48 8d 0d a5 14 7a 00 	lea    rcx,[rip+0x7a14a5]        # 184d9a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa090>
 10ac503:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac506:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
 10ac50a:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
 10ac50f:	48 89 70 10          	mov    QWORD PTR [rax+0x10],rsi
 10ac513:	c6 40 18 00          	mov    BYTE PTR [rax+0x18],0x0
 10ac517:	48 8d 78 20          	lea    rdi,[rax+0x20]
 10ac51b:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac522:	00
 10ac523:	48 89 02             	mov    QWORD PTR [rdx],rax
 10ac526:	48 8d 0d 37 ff 9c ff 	lea    rcx,[rip+0xffffffffff9cff37]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac52d:	48 89 4a 10          	mov    QWORD PTR [rdx+0x10],rcx
 10ac531:	48 8d 0d fc 3c 01 00 	lea    rcx,[rip+0x13cfc]        # 10c0234 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28764a>
 10ac538:	48 89 4a 18          	mov    QWORD PTR [rdx+0x18],rcx
 10ac53c:	48 8b 0e             	mov    rcx,QWORD PTR [rsi]
 10ac53f:	49 89 c7             	mov    r15,rax
 10ac542:	ff 51 18             	call   QWORD PTR [rcx+0x18]
 10ac545:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac54c:	00
 10ac54d:	4c 89 f7             	mov    rdi,r14
 10ac550:	e8 d5 17 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ac555:	4c 89 ff             	mov    rdi,r15
 10ac558:	48 83 c7 30          	add    rdi,0x30
 10ac55c:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
 10ac560:	4d 89 3e             	mov    QWORD PTR [r14],r15
 10ac563:	48 8d 05 fa fe 9c ff 	lea    rax,[rip+0xffffffffff9cfefa]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac56a:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
 10ac56e:	48 8d 05 39 3d 01 00 	lea    rax,[rip+0x13d39]        # 10c02ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2876c4>
 10ac575:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
 10ac579:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ac57c:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac583:	00
 10ac584:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10ac587:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac58e:	00
 10ac58f:	e8 96 17 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ac594:	0f 57 c0             	xorps  xmm0,xmm0
 10ac597:	49 83 67 50 00       	and    QWORD PTR [r15+0x50],0x0
 10ac59c:	41 0f 11 47 40       	movups XMMWORD PTR [r15+0x40],xmm0
 10ac5a1:	49 83 67 68 00       	and    QWORD PTR [r15+0x68],0x0
 10ac5a6:	31 c0                	xor    eax,eax
 10ac5a8:	41 88 47 70          	mov    BYTE PTR [r15+0x70],al
 10ac5ac:	41 88 47 78          	mov    BYTE PTR [r15+0x78],al
 10ac5b0:	41 88 87 90 00 00 00 	mov    BYTE PTR [r15+0x90],al
 10ac5b7:	41 88 87 98 00 00 00 	mov    BYTE PTR [r15+0x98],al
 10ac5be:	41 88 87 b0 00 00 00 	mov    BYTE PTR [r15+0xb0],al
 10ac5c5:	41 88 87 b8 00 00 00 	mov    BYTE PTR [r15+0xb8],al
 10ac5cc:	4c 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],r15
 10ac5d1:	41 88 87 d0 00 00 00 	mov    BYTE PTR [r15+0xd0],al
 10ac5d8:	eb 24                	jmp    10ac5fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273a14>
 10ac5da:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac5e1:	00
 10ac5e2:	e8 49 a7 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac5e7:	6a 08                	push   0x8
 10ac5e9:	5f                   	pop    rdi
 10ac5ea:	e8 11 19 74 00       	call   17edf00 <_Znwm@plt>
 10ac5ef:	48 8d 0d 3a 14 7a 00 	lea    rcx,[rip+0x7a143a]        # 184da30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa118>
 10ac5f6:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 10ac5fb:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac5fe:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 10ac602:	48 8d 15 a7 ae 32 ff 	lea    rdx,[rip+0xffffffffff32aea7]        # 3d74b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2095>
 10ac609:	4c 8d 05 c0 ae 32 ff 	lea    r8,[rip+0xffffffffff32aec0]        # 3d74d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20b5>
```
## Targeted xrefs

### `184d9a8` hits (2)

#### hit `0x10ac4fc`

```text
 10ac4e4:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10ac4e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac4ec:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ac4ef:	49 89 c6             	mov    r14,rax
 10ac4f2:	bf d8 00 00 00       	mov    edi,0xd8
 10ac4f7:	e8 04 1a 74 00       	call   17edf00 <_Znwm@plt>
 10ac4fc:	48 8d 0d a5 14 7a 00 	lea    rcx,[rip+0x7a14a5]        # 184d9a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa090>
 10ac503:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac506:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
 10ac50a:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
 10ac50f:	48 89 70 10          	mov    QWORD PTR [rax+0x10],rsi
 10ac513:	c6 40 18 00          	mov    BYTE PTR [rax+0x18],0x0
 10ac517:	48 8d 78 20          	lea    rdi,[rax+0x20]
 10ac51b:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac522:	00
 10ac523:	48 89 02             	mov    QWORD PTR [rdx],rax
 10ac526:	48 8d 0d 37 ff 9c ff 	lea    rcx,[rip+0xffffffffff9cff37]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac52d:	48 89 4a 10          	mov    QWORD PTR [rdx+0x10],rcx
```
#### hit `0x10c0966`

```text
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
 10c0988:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
 10c098c:	e8 9f 63 9e ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10c0991:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
 10c0995:	e8 f6 d4 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10c099a:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
 10c099e:	e8 e3 da 9d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
```
### `184d0a0` hits (2)

#### hit `0x10ac399`

```text
 10ac383:	4c 89 ff             	mov    rdi,r15
 10ac386:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ac389:	49 89 c7             	mov    r15,rax
 10ac38c:	bf 80 00 00 00       	mov    edi,0x80
 10ac391:	e8 6a 1b 74 00       	call   17edf00 <_Znwm@plt>
 10ac396:	48 89 c1             	mov    rcx,rax
 10ac399:	48 8d 05 00 0d 7a 00 	lea    rax,[rip+0x7a0d00]        # 184d0a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9788>
 10ac3a0:	48 89 01             	mov    QWORD PTR [rcx],rax
 10ac3a3:	4c 89 71 08          	mov    QWORD PTR [rcx+0x8],r14
 10ac3a7:	4c 89 79 10          	mov    QWORD PTR [rcx+0x10],r15
 10ac3ab:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 10ac3b0:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 10ac3b4:	49 89 cf             	mov    r15,rcx
 10ac3b7:	e8 54 7d ab ff       	call   b64110 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb10b0>
 10ac3bc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
 10ac3c0:	49 89 57 28          	mov    QWORD PTR [r15+0x28],rdx
 10ac3c4:	41 c6 47 30 00       	mov    BYTE PTR [r15+0x30],0x0
 10ac3c9:	49 8d 7f 38          	lea    rdi,[r15+0x38]
```
#### hit `0x10b3658`

```text
 10b364c:	5d                   	pop    rbp
 10b364d:	c3                   	ret
 10b364e:	e8 5d c4 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10b3653:	cc                   	int3
 10b3654:	53                   	push   rbx
 10b3655:	48 89 fb             	mov    rbx,rdi
 10b3658:	48 8d 05 41 9a 79 00 	lea    rax,[rip+0x799a41]        # 184d0a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9788>
 10b365f:	48 89 07             	mov    QWORD PTR [rdi],rax
 10b3662:	48 83 c7 58          	add    rdi,0x58
 10b3666:	e8 3d 96 cd ff       	call   d8cca8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59d2e>
 10b366b:	48 8b 7b 50          	mov    rdi,QWORD PTR [rbx+0x50]
 10b366f:	e8 12 ae 9e ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10b3674:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
 10b3678:	5b                   	pop    rbx
 10b3679:	e9 08 ae 9e ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
 10b367e:	53                   	push   rbx
 10b367f:	48 89 fb             	mov    rbx,rdi
 10b3682:	e8 cd ff ff ff       	call   10b3654 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27aa6a>
```
### `184d1f0` hits (1)

#### hit `0x10ac478`

```text
 10ac463:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac46a:	00
 10ac46b:	e8 c0 a8 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac470:	6a 08                	push   0x8
 10ac472:	5f                   	pop    rdi
 10ac473:	e8 88 1a 74 00       	call   17edf00 <_Znwm@plt>
 10ac478:	48 8d 0d 71 0d 7a 00 	lea    rcx,[rip+0x7a0d71]        # 184d1f0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x98d8>
 10ac47f:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
 10ac484:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac487:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 10ac48b:	48 8d 15 de af 32 ff 	lea    rdx,[rip+0xffffffffff32afde]        # 3d7470 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2055>
 10ac492:	4c 8d 05 f7 af 32 ff 	lea    r8,[rip+0xffffffffff32aff7]        # 3d7490 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2075>
 10ac499:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac4a0:	00
 10ac4a1:	6a 11                	push   0x11
 10ac4a3:	59                   	pop    rcx
 10ac4a4:	6a 19                	push   0x19
 10ac4a6:	41 59                	pop    r9
```
### `rsp+0x70` hits (10211)

#### hit `0x9d778c`

```text
  9d7774:	84 c0                	test   al,al
  9d7776:	74 31                	je     9d77a9 <_ZNKSt6__ndk18time_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE13do_date_orderEv@@Base+0x239>
  9d7778:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
  9d777d:	0f 29 4c 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm1
  9d7782:	0f 29 54 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm2
  9d7787:	0f 29 5c 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm3
  9d778c:	0f 29 64 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm4
  9d7791:	0f 29 ac 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm5
  9d7798:	00
  9d7799:	0f 29 b4 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm6
  9d77a0:	00
  9d77a1:	0f 29 bc 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm7
  9d77a8:	00
  9d77a9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  9d77b0:	00 00
  9d77b2:	48 89 84 24 c8 01 00 	mov    QWORD PTR [rsp+0x1c8],rax
  9d77b9:	00
  9d77ba:	48 89 e0             	mov    rax,rsp
```
#### hit `0x9d7a67`

```text
  9d7a54:	00
  9d7a55:	48 8d bc 24 48 01 00 	lea    rdi,[rsp+0x148]
  9d7a5c:	00
  9d7a5d:	31 f6                	xor    esi,esi
  9d7a5f:	e8 7c 07 00 00       	call   9d81e0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x10>
  9d7a64:	48 89 c3             	mov    rbx,rax
  9d7a67:	48 8d 6c 24 70       	lea    rbp,[rsp+0x70]
  9d7a6c:	48 89 c7             	mov    rdi,rax
  9d7a6f:	48 89 ee             	mov    rsi,rbp
  9d7a72:	e8 49 03 00 00       	call   9d7dc0 <_ZNKSt6__ndk18time_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE13do_date_orderEv@@Base+0x850>
  9d7a77:	4c 89 64 24 30       	mov    QWORD PTR [rsp+0x30],r12
  9d7a7c:	48 89 5c 24 38       	mov    QWORD PTR [rsp+0x38],rbx
  9d7a81:	4c 8d ac 24 c0 00 00 	lea    r13,[rsp+0xc0]
  9d7a88:	00
  9d7a89:	48 89 df             	mov    rdi,rbx
  9d7a8c:	4c 89 ee             	mov    rsi,r13
  9d7a8f:	e8 2c 03 00 00       	call   9d7dc0 <_ZNKSt6__ndk18time_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE13do_date_orderEv@@Base+0x850>
  9d7a94:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
```
#### hit `0x9d7b01`

```text
  9d7ae7:	e8 f4 02 00 00       	call   9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  9d7aec:	48 8d 9c 24 48 01 00 	lea    rbx,[rsp+0x148]
  9d7af3:	00
  9d7af4:	48 89 df             	mov    rdi,rbx
  9d7af7:	be 01 00 00 00       	mov    esi,0x1
  9d7afc:	e8 cf 0a 00 00       	call   9d85d0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x400>
  9d7b01:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
  9d7b06:	48 89 df             	mov    rdi,rbx
  9d7b09:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
  9d7b0e:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
  9d7b13:	e8 f8 05 00 00       	call   9d8110 <_ZNSt13bad_exceptionD1Ev@@Base+0x330>
  9d7b18:	48 89 c3             	mov    rbx,rax
  9d7b1b:	4c 8d 6c 24 30       	lea    r13,[rsp+0x30]
  9d7b20:	48 89 c7             	mov    rdi,rax
  9d7b23:	4c 89 ee             	mov    rsi,r13
  9d7b26:	e8 95 02 00 00       	call   9d7dc0 <_ZNKSt6__ndk18time_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE13do_date_orderEv@@Base+0x850>
  9d7b2b:	4c 89 64 24 20       	mov    QWORD PTR [rsp+0x20],r12
  9d7b30:	48 89 5c 24 28       	mov    QWORD PTR [rsp+0x28],rbx
```
#### hit `0x9d7e62`

```text
  9d7e4a:	84 c0                	test   al,al
  9d7e4c:	74 31                	je     9d7e7f <_ZNSt13bad_exceptionD1Ev@@Base+0x9f>
  9d7e4e:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
  9d7e53:	0f 29 4c 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm1
  9d7e58:	0f 29 54 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm2
  9d7e5d:	0f 29 5c 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm3
  9d7e62:	0f 29 64 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm4
  9d7e67:	0f 29 ac 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm5
  9d7e6e:	00
  9d7e6f:	0f 29 b4 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm6
  9d7e76:	00
  9d7e77:	0f 29 bc 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm7
  9d7e7e:	00
  9d7e7f:	4c 89 44 24 20       	mov    QWORD PTR [rsp+0x20],r8
  9d7e84:	4c 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],r9
  9d7e89:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  9d7e90:	00 00
  9d7e92:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
```
#### hit `0x9d7f33`

```text
  9d7f1b:	84 c0                	test   al,al
  9d7f1d:	74 31                	je     9d7f50 <_ZNSt13bad_exceptionD1Ev@@Base+0x170>
  9d7f1f:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
  9d7f24:	0f 29 4c 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm1
  9d7f29:	0f 29 54 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm2
  9d7f2e:	0f 29 5c 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm3
  9d7f33:	0f 29 64 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm4
  9d7f38:	0f 29 ac 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm5
  9d7f3f:	00
  9d7f40:	0f 29 b4 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm6
  9d7f47:	00
  9d7f48:	0f 29 bc 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm7
  9d7f4f:	00
  9d7f50:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx
  9d7f55:	4c 89 44 24 20       	mov    QWORD PTR [rsp+0x20],r8
  9d7f5a:	4c 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],r9
  9d7f5f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  9d7f66:	00 00
```
#### hit `0x9d8033`

```text
  9d801b:	84 c0                	test   al,al
  9d801d:	74 31                	je     9d8050 <_ZNSt13bad_exceptionD1Ev@@Base+0x270>
  9d801f:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
  9d8024:	0f 29 4c 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm1
  9d8029:	0f 29 54 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm2
  9d802e:	0f 29 5c 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm3
  9d8033:	0f 29 64 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm4
  9d8038:	0f 29 ac 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm5
  9d803f:	00
  9d8040:	0f 29 b4 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm6
  9d8047:	00
  9d8048:	0f 29 bc 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm7
  9d804f:	00
  9d8050:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
  9d8055:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx
  9d805a:	4c 89 44 24 20       	mov    QWORD PTR [rsp+0x20],r8
  9d805f:	4c 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],r9
  9d8064:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
```
#### hit `0x9d8c7f`

```text
  9d8c5e:	49 39 c7             	cmp    r15,rax
  9d8c61:	0f 8d dc 00 00 00    	jge    9d8d43 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xb73>
  9d8c67:	0f 28 05 d2 57 9b ff 	movaps xmm0,XMMWORD PTR [rip+0xffffffffff9b57d2]        # 38e440 <_ZTSSt12bad_any_cast@@Base-0x1d88>
  9d8c6e:	0f 29 44 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm0
  9d8c73:	0f 28 05 b6 57 9b ff 	movaps xmm0,XMMWORD PTR [rip+0xffffffffff9b57b6]        # 38e430 <_ZTSSt12bad_any_cast@@Base-0x1d98>
  9d8c7a:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
  9d8c7f:	48 c7 44 24 70 00 00 	mov    QWORD PTR [rsp+0x70],0x0
  9d8c86:	00 00
  9d8c88:	b9 28 00 00 00       	mov    ecx,0x28
  9d8c8d:	48 8d 6c 24 50       	lea    rbp,[rsp+0x50]
  9d8c92:	48 89 ef             	mov    rdi,rbp
  9d8c95:	48 89 de             	mov    rsi,rbx
  9d8c98:	48 8b 54 24 08       	mov    rdx,QWORD PTR [rsp+0x8]
  9d8c9d:	e8 1e 6e e1 00       	call   17efac0 <__strncat_chk@plt>
  9d8ca2:	4c 89 f8             	mov    rax,r15
  9d8ca5:	48 c1 e0 04          	shl    rax,0x4
  9d8ca9:	4c 8d 24 80          	lea    r12,[rax+rax*4]
  9d8cad:	49 8b 36             	mov    rsi,QWORD PTR [r14]
```
#### hit `0x9d92da`

```text
  9d92c5:	50                   	push   rax
  9d92c6:	41 ff 12             	call   QWORD PTR [r10]
  9d92c9:	48 83 c4 10          	add    rsp,0x10
  9d92cd:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
  9d92d1:	48 89 41 50          	mov    QWORD PTR [rcx+0x50],rax
  9d92d5:	4c 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],r15
  9d92da:	4c 89 74 24 70       	mov    QWORD PTR [rsp+0x70],r14
  9d92df:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
  9d92e4:	48 89 74 24 78       	mov    QWORD PTR [rsp+0x78],rsi
  9d92e9:	89 9c 24 80 00 00 00 	mov    DWORD PTR [rsp+0x80],ebx
  9d92f0:	8b 44 24 18          	mov    eax,DWORD PTR [rsp+0x18]
  9d92f4:	89 84 24 84 00 00 00 	mov    DWORD PTR [rsp+0x84],eax
  9d92fb:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  9d9300:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
  9d9307:	00
  9d9308:	41 8b 46 20          	mov    eax,DWORD PTR [r14+0x20]
  9d930c:	89 84 24 90 00 00 00 	mov    DWORD PTR [rsp+0x90],eax
  9d9313:	44 89 a4 24 94 00 00 	mov    DWORD PTR [rsp+0x94],r12d
```
#### hit `0x9d988f`

```text
  9d9872:	4c 89 b4 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r14
  9d9879:	00
  9d987a:	c7 84 24 a0 00 00 00 	mov    DWORD PTR [rsp+0xa0],0x0
  9d9881:	00 00 00 00
  9d9885:	4c 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],r15
  9d988a:	4c 89 64 24 68       	mov    QWORD PTR [rsp+0x68],r12
  9d988f:	48 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],rbp
  9d9894:	89 5c 24 78          	mov    DWORD PTR [rsp+0x78],ebx
  9d9898:	44 89 6c 24 7c       	mov    DWORD PTR [rsp+0x7c],r13d
  9d989d:	4c 89 b4 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r14
  9d98a4:	00
  9d98a5:	89 94 24 88 00 00 00 	mov    DWORD PTR [rsp+0x88],edx
  9d98ac:	89 44 24 08          	mov    DWORD PTR [rsp+0x8],eax
  9d98b0:	89 84 24 8c 00 00 00 	mov    DWORD PTR [rsp+0x8c],eax
  9d98b7:	c7 84 24 90 00 00 00 	mov    DWORD PTR [rsp+0x90],0x0
  9d98be:	00 00 00 00
  9d98c2:	48 8d 05 d7 04 00 00 	lea    rax,[rip+0x4d7]        # 9d9da0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x1bd0>
  9d98c9:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
```
#### hit `0x9dc255`

```text
  9dc235:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
  9dc23a:	49 8d 47 18          	lea    rax,[r15+0x18]
  9dc23e:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
  9dc243:	41 8b 87 20 01 00 00 	mov    eax,DWORD PTR [r15+0x120]
  9dc24a:	89 44 24 68          	mov    DWORD PTR [rsp+0x68],eax
  9dc24e:	49 8b 87 28 01 00 00 	mov    rax,QWORD PTR [r15+0x128]
  9dc255:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
  9dc25a:	49 81 c7 30 01 00 00 	add    r15,0x130
  9dc261:	4c 89 7c 24 78       	mov    QWORD PTR [rsp+0x78],r15
  9dc266:	48 89 e7             	mov    rdi,rsp
  9dc269:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
  9dc26e:	4c 8d 84 24 90 01 00 	lea    r8,[rsp+0x190]
  9dc275:	00
  9dc276:	ba 04 00 00 00       	mov    edx,0x4
  9dc27b:	b9 20 00 00 00       	mov    ecx,0x20
  9dc280:	4d 89 f1             	mov    r9,r14
  9dc283:	e8 08 1e 00 00       	call   9de090 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x5ec0>
  9dc288:	31 db                	xor    ebx,ebx
```
#### hit `0x9df9fd`

```text
  9df9e5:	c7 44 24 78 01 00 00 	mov    DWORD PTR [rsp+0x78],0x1
  9df9ec:	00
  9df9ed:	66 0f ef c0          	pxor   xmm0,xmm0
  9df9f1:	48 8d 84 24 80 00 00 	lea    rax,[rsp+0x80]
  9df9f8:	00
  9df9f9:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
  9df9fd:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
  9dfa02:	48 85 ff             	test   rdi,rdi
  9dfa05:	74 1f                	je     9dfa26 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7856>
  9dfa07:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
  9dfa0c:	48 c1 e6 03          	shl    rsi,0x3
  9dfa10:	e8 8b d1 ff ff       	call   9dcba0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x49d0>
  9dfa15:	48 8b 74 24 70       	mov    rsi,QWORD PTR [rsp+0x70]
  9dfa1a:	4c 89 ff             	mov    rdi,r15
  9dfa1d:	e8 3e ce ff ff       	call   9dc860 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4690>
  9dfa22:	66 0f ef c0          	pxor   xmm0,xmm0
  9dfa26:	c7 44 24 60 01 00 00 	mov    DWORD PTR [rsp+0x60],0x1
  9dfa2d:	00
```
#### hit `0x9dfa15`

```text
  9df9fd:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
  9dfa02:	48 85 ff             	test   rdi,rdi
  9dfa05:	74 1f                	je     9dfa26 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7856>
  9dfa07:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
  9dfa0c:	48 c1 e6 03          	shl    rsi,0x3
  9dfa10:	e8 8b d1 ff ff       	call   9dcba0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x49d0>
  9dfa15:	48 8b 74 24 70       	mov    rsi,QWORD PTR [rsp+0x70]
  9dfa1a:	4c 89 ff             	mov    rdi,r15
  9dfa1d:	e8 3e ce ff ff       	call   9dc860 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4690>
  9dfa22:	66 0f ef c0          	pxor   xmm0,xmm0
  9dfa26:	c7 44 24 60 01 00 00 	mov    DWORD PTR [rsp+0x60],0x1
  9dfa2d:	00
  9dfa2e:	48 8d 44 24 68       	lea    rax,[rsp+0x68]
  9dfa33:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
  9dfa37:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
  9dfa3c:	48 85 ff             	test   rdi,rdi
  9dfa3f:	74 1b                	je     9dfa5c <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x788c>
  9dfa41:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]
```
#### hit `0x9dfb7d`

```text
  9dfb65:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
  9dfb69:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
  9dfb6e:	48 89 6c 24 40       	mov    QWORD PTR [rsp+0x40],rbp
  9dfb73:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
  9dfb78:	48 85 ff             	test   rdi,rdi
  9dfb7b:	74 56                	je     9dfbd3 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7a03>
  9dfb7d:	48 8b 4c 24 70       	mov    rcx,QWORD PTR [rsp+0x70]
  9dfb82:	48 8d 57 ff          	lea    rdx,[rdi-0x1]
  9dfb86:	48 85 d2             	test   rdx,rdx
  9dfb89:	74 0f                	je     9dfb9a <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x79ca>
  9dfb8b:	48 8b 04 d1          	mov    rax,QWORD PTR [rcx+rdx*8]
  9dfb8f:	48 83 c2 ff          	add    rdx,0xffffffffffffffff
  9dfb93:	48 85 c0             	test   rax,rax
  9dfb96:	74 ee                	je     9dfb86 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x79b6>
  9dfb98:	eb 03                	jmp    9dfb9d <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x79cd>
  9dfb9a:	48 8b 01             	mov    rax,QWORD PTR [rcx]
  9dfb9d:	48 85 c0             	test   rax,rax
  9dfba0:	78 31                	js     9dfbd3 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7a03>
```
#### hit `0x9dfcc0`

```text
  9dfcaa:	48 85 c0             	test   rax,rax
  9dfcad:	74 0c                	je     9dfcbb <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7aeb>
  9dfcaf:	48 8d 46 ff          	lea    rax,[rsi-0x1]
  9dfcb3:	48 83 7c f2 f8 00    	cmp    QWORD PTR [rdx+rsi*8-0x8],0x0
  9dfcb9:	74 ec                	je     9dfca7 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7ad7>
  9dfcbb:	4c 8b 4c 24 68       	mov    r9,QWORD PTR [rsp+0x68]
  9dfcc0:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
  9dfcc5:	4c 89 c9             	mov    rcx,r9
  9dfcc8:	48 89 cf             	mov    rdi,rcx
  9dfccb:	48 85 c9             	test   rcx,rcx
  9dfcce:	74 0c                	je     9dfcdc <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7b0c>
  9dfcd0:	48 8d 4f ff          	lea    rcx,[rdi-0x1]
  9dfcd4:	48 83 7c f8 f8 00    	cmp    QWORD PTR [rax+rdi*8-0x8],0x0
  9dfcda:	74 ec                	je     9dfcc8 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7af8>
  9dfcdc:	48 89 f9             	mov    rcx,rdi
  9dfcdf:	48 09 f1             	or     rcx,rsi
  9dfce2:	74 85                	je     9dfc69 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7a99>
  9dfce4:	48 39 fe             	cmp    rsi,rdi
```
#### hit `0x9dfdb9`

```text
  9dfda5:	4c 89 c9             	mov    rcx,r9
  9dfda8:	48 29 f9             	sub    rcx,rdi
  9dfdab:	48 39 ca             	cmp    rdx,rcx
  9dfdae:	72 e4                	jb     9dfd94 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7bc4>
  9dfdb0:	4c 39 ca             	cmp    rdx,r9
  9dfdb3:	0f 83 2f 03 00 00    	jae    9e00e8 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7f18>
  9dfdb9:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
  9dfdbe:	48 c7 04 d0 00 00 00 	mov    QWORD PTR [rax+rdx*8],0x0
  9dfdc5:	00
  9dfdc6:	48 83 c2 01          	add    rdx,0x1
  9dfdca:	48 3b 54 24 68       	cmp    rdx,QWORD PTR [rsp+0x68]
  9dfdcf:	72 ed                	jb     9dfdbe <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7bee>
  9dfdd1:	e9 12 03 00 00       	jmp    9e00e8 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7f18>
  9dfdd6:	4c 8b b4 24 88 00 00 	mov    r14,QWORD PTR [rsp+0x88]
  9dfddd:	00
  9dfdde:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
  9dfde3:	49 8b 34 ee          	mov    rsi,QWORD PTR [r14+rbp*8]
  9dfde7:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
```
#### hit `0x9dfde7`

```text
  9dfdcf:	72 ed                	jb     9dfdbe <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7bee>
  9dfdd1:	e9 12 03 00 00       	jmp    9e00e8 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7f18>
  9dfdd6:	4c 8b b4 24 88 00 00 	mov    r14,QWORD PTR [rsp+0x88]
  9dfddd:	00
  9dfdde:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
  9dfde3:	49 8b 34 ee          	mov    rsi,QWORD PTR [r14+rbp*8]
  9dfde7:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
  9dfdec:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
  9dfdf1:	48 8b 54 c8 f8       	mov    rdx,QWORD PTR [rax+rcx*8-0x8]
  9dfdf6:	48 c7 c0 ff ff ff ff 	mov    rax,0xffffffffffffffff
  9dfdfd:	48 39 d6             	cmp    rsi,rdx
  9dfe00:	73 1f                	jae    9dfe21 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7c51>
  9dfe02:	49 8b 7c ee f8       	mov    rdi,QWORD PTR [r14+rbp*8-0x8]
  9dfe07:	31 c9                	xor    ecx,ecx
  9dfe09:	e8 22 f4 08 00       	call   a6f230 <__cxa_thread_atexit@@Base+0x510>
  9dfe0e:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
  9dfe12:	48 83 da 00          	sbb    rdx,0x0
  9dfe16:	48 c7 c1 ff ff ff ff 	mov    rcx,0xffffffffffffffff
```
#### hit `0x9dfe92`

```text
  9dfe78:	31 d2                	xor    edx,edx
  9dfe7a:	e8 41 e5 ff ff       	call   9de3c0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x61f0>
  9dfe7f:	85 c0                	test   eax,eax
  9dfe81:	0f 85 f2 02 00 00    	jne    9e0179 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7fa9>
  9dfe87:	48 83 44 24 10 ff    	add    QWORD PTR [rsp+0x10],0xffffffffffffffff
  9dfe8d:	48 8d 6c 24 30       	lea    rbp,[rsp+0x30]
  9dfe92:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
  9dfe97:	48 83 7c 24 28 00    	cmp    QWORD PTR [rsp+0x28],0x0
  9dfe9d:	74 0c                	je     9dfeab <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7cdb>
  9dfe9f:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
  9dfea4:	48 8b 4c f0 f0       	mov    rcx,QWORD PTR [rax+rsi*8-0x10]
  9dfea9:	eb 07                	jmp    9dfeb2 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7ce2>
  9dfeab:	31 c9                	xor    ecx,ecx
  9dfead:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
  9dfeb2:	48 8b 54 24 40       	mov    rdx,QWORD PTR [rsp+0x40]
  9dfeb7:	48 89 0a             	mov    QWORD PTR [rdx],rcx
  9dfeba:	48 8b 44 f0 f8       	mov    rax,QWORD PTR [rax+rsi*8-0x8]
  9dfebf:	48 89 42 08          	mov    QWORD PTR [rdx+0x8],rax
```
#### hit `0x9e0802`

```text
  9e07ea:	e8 71 c0 ff ff       	call   9dc860 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4690>
  9e07ef:	48 8d 6c 24 68       	lea    rbp,[rsp+0x68]
  9e07f4:	c7 44 24 48 01 00 00 	mov    DWORD PTR [rsp+0x48],0x1
  9e07fb:	00
  9e07fc:	0f 57 c0             	xorps  xmm0,xmm0
  9e07ff:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
  9e0802:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
  9e0807:	48 85 ff             	test   rdi,rdi
  9e080a:	74 20                	je     9e082c <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x865c>
  9e080c:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
  9e0811:	48 c1 e6 03          	shl    rsi,0x3
  9e0815:	e8 86 c3 ff ff       	call   9dcba0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x49d0>
  9e081a:	48 8b 74 24 70       	mov    rsi,QWORD PTR [rsp+0x70]
  9e081f:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  9e0824:	e8 37 c0 ff ff       	call   9dc860 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4690>
  9e0829:	0f 57 c0             	xorps  xmm0,xmm0
  9e082c:	c7 44 24 60 01 00 00 	mov    DWORD PTR [rsp+0x60],0x1
  9e0833:	00
```
#### hit `0x9e081a`

```text
  9e0802:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
  9e0807:	48 85 ff             	test   rdi,rdi
  9e080a:	74 20                	je     9e082c <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x865c>
  9e080c:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
  9e0811:	48 c1 e6 03          	shl    rsi,0x3
  9e0815:	e8 86 c3 ff ff       	call   9dcba0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x49d0>
  9e081a:	48 8b 74 24 70       	mov    rsi,QWORD PTR [rsp+0x70]
  9e081f:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  9e0824:	e8 37 c0 ff ff       	call   9dc860 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4690>
  9e0829:	0f 57 c0             	xorps  xmm0,xmm0
  9e082c:	c7 44 24 60 01 00 00 	mov    DWORD PTR [rsp+0x60],0x1
  9e0833:	00
  9e0834:	0f 11 45 00          	movups XMMWORD PTR [rbp+0x0],xmm0
  9e0838:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
  9e083d:	48 85 c0             	test   rax,rax
  9e0840:	74 07                	je     9e0849 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x8679>
  9e0842:	48 83 78 10 00       	cmp    QWORD PTR [rax+0x10],0x0
  9e0847:	75 30                	jne    9e0879 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x86a9>
```
#### hit `0x9e29be`

```text
  9e29aa:	49 89 cf             	mov    r15,rcx
  9e29ad:	89 d5                	mov    ebp,edx
  9e29af:	41 89 f1             	mov    r9d,esi
  9e29b2:	49 89 fe             	mov    r14,rdi
  9e29b5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  9e29bc:	00 00
  9e29be:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
  9e29c3:	44 8b 41 30          	mov    r8d,DWORD PTR [rcx+0x30]
  9e29c7:	48 8b 71 18          	mov    rsi,QWORD PTR [rcx+0x18]
  9e29cb:	48 8b 51 20          	mov    rdx,QWORD PTR [rcx+0x20]
  9e29cf:	8b 49 28             	mov    ecx,DWORD PTR [rcx+0x28]
  9e29d2:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
  9e29d7:	48 89 df             	mov    rdi,rbx
  9e29da:	e8 b1 8b ff ff       	call   9db590 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x33c0>
  9e29df:	83 c5 01             	add    ebp,0x1
  9e29e2:	66 2e 0f 1f 84 00 00 	cs nop WORD PTR [rax+rax*1+0x0]
  9e29e9:	00 00 00
  9e29ec:	0f 1f 40 00          	nop    DWORD PTR [rax+0x0]
```
... truncated 10191 more ...

### `b411a4` hits (1)

#### hit `0xb411a4`

```text
  b41192:	53                   	push   rbx
  b41193:	48 89 fb             	mov    rbx,rdi
  b41196:	e8 55 ff ff ff       	call   b410f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8e090>
  b4119b:	48 89 df             	mov    rdi,rbx
  b4119e:	5b                   	pop    rbx
  b4119f:	e9 7c cd ca 00       	jmp    17edf20 <_ZdlPv@plt>
  b411a4:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
  b411a8:	c3                   	ret
  b411a9:	cc                   	int3
  b411aa:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
  b411ae:	48 83 c0 20          	add    rax,0x20
  b411b2:	c3                   	ret
  b411b3:	cc                   	int3
  b411b4:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
  b411b8:	e9 33 ff ff ff       	jmp    b410f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8e090>
  b411bd:	cc                   	int3
  b411be:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
  b411c2:	e9 cb ff ff ff       	jmp    b41192 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8e132>
```
### `184da88` hits (2)

#### hit `0x10ad68d`

```text
 10ad67c:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 10ad67f:	48 89 df             	mov    rdi,rbx
 10ad682:	ff 50 40             	call   QWORD PTR [rax+0x40]
 10ad685:	6a 48                	push   0x48
 10ad687:	5f                   	pop    rdi
 10ad688:	e8 73 08 74 00       	call   17edf00 <_Znwm@plt>
 10ad68d:	48 8d 0d f4 03 7a 00 	lea    rcx,[rip+0x7a03f4]        # 184da88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa170>
 10ad694:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ad697:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
 10ad69b:	48 8b 4c 24 70       	mov    rcx,QWORD PTR [rsp+0x70]
 10ad6a0:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
 10ad6a4:	48 89 68 18          	mov    QWORD PTR [rax+0x18],rbp
 10ad6a8:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
 10ad6ad:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
 10ad6b1:	48 89 58 28          	mov    QWORD PTR [rax+0x28],rbx
 10ad6b5:	48 8b 8c 24 80 00 00 	mov    rcx,QWORD PTR [rsp+0x80]
 10ad6bc:	00
 10ad6bd:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx
```
#### hit `0x10c09ca`

```text
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
```
### `184ca90` hits (2)

#### hit `0x10aba74`

```text
 10aba5c:	48 89 fb             	mov    rbx,rdi
 10aba5f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10aba66:	00 00
 10aba68:	48 89 84 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rax
 10aba6f:	00
 10aba70:	c6 47 08 00          	mov    BYTE PTR [rdi+0x8],0x0
 10aba74:	48 8d 05 15 10 7a 00 	lea    rax,[rip+0x7a1015]        # 184ca90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9178>
 10aba7b:	48 89 07             	mov    QWORD PTR [rdi],rax
 10aba7e:	48 8d 47 10          	lea    rax,[rdi+0x10]
 10aba82:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
 10aba89:	00
 10aba8a:	48 8d 47 18          	lea    rax,[rdi+0x18]
 10aba8e:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
 10aba93:	48 8d 47 40          	lea    rax,[rdi+0x40]
 10aba97:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 10aba9c:	48 83 c7 48          	add    rdi,0x48
 10abaa0:	0f 57 c0             	xorps  xmm0,xmm0
 10abaa3:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
```
#### hit `0x10ae15a`

```text
 10ae14a:	48 89 c3             	mov    rbx,rax
 10ae14d:	48 89 df             	mov    rdi,rbx
 10ae150:	e8 50 b9 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10ae155:	cc                   	int3
 10ae156:	53                   	push   rbx
 10ae157:	48 89 fb             	mov    rbx,rdi
 10ae15a:	48 8d 05 2f e9 79 00 	lea    rax,[rip+0x79e92f]        # 184ca90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9178>
 10ae161:	48 89 07             	mov    QWORD PTR [rdi],rax
 10ae164:	48 83 c7 78          	add    rdi,0x78
 10ae168:	e8 85 fb ff ff       	call   10adcf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275108>
 10ae16d:	48 8d 7b 70          	lea    rdi,[rbx+0x70]
 10ae171:	e8 54 fb ff ff       	call   10adcca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750e0>
 10ae176:	48 8d 7b 68          	lea    rdi,[rbx+0x68]
 10ae17a:	e8 23 fb ff ff       	call   10adca2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750b8>
 10ae17f:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
 10ae183:	e8 a0 bc 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10ae188:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
 10ae18c:	e8 97 bc 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
```
