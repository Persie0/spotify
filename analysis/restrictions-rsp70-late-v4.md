# Restrictions late `[rsp+0x70]` consumer trace

Parallel v4 report. Focus: wrapper_0x80/fallback holder stored in `[rsp+0x70]`, later read at `10ad69b`, and cleanup at `10adb4f`.

## `[rsp+0x70]` refs

| addr | instruction |
|---:|---|
| `0x10ac454` | `10ac454:	4c 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],r15` |
| `0x10ac47f` | `10ac47f:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax` |
| `0x10ad69b` | `10ad69b:	48 8b 4c 24 70       	mov    rcx,QWORD PTR [rsp+0x70]` |
| `0x10adb4f` | `10adb4f:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]` |

## `0x10ac454` — normal store: [rsp+0x70] = wrapper_0x80

```text
 10ac400:	4c 89 f7             	mov    rdi,r14
 10ac403:	e8 22 19 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ac408:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]
 10ac40c:	4d 89 3e             	mov    QWORD PTR [r14],r15
 10ac40f:	48 8d 05 4e 00 9d ff 	lea    rax,[rip+0xffffffffff9d004e]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac416:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
 10ac41a:	48 8d 05 61 6c 00 00 	lea    rax,[rip+0x6c61]        # 10b3082 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a498>
 10ac421:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
 10ac425:	4c 89 ff             	mov    rdi,r15
 10ac428:	48 83 c7 48          	add    rdi,0x48
 10ac42c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ac42f:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac436:	00
 10ac437:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10ac43a:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac441:	00
 10ac442:	e8 e3 18 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ac447:	0f 57 c0             	xorps  xmm0,xmm0
 10ac44a:	41 0f 11 47 68       	movups XMMWORD PTR [r15+0x68],xmm0
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
```
## `0x10ac47f` — fallback store: [rsp+0x70] = fallback_0x8

```text
 10ac42f:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac436:	00
 10ac437:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10ac43a:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac441:	00
 10ac442:	e8 e3 18 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ac447:	0f 57 c0             	xorps  xmm0,xmm0
 10ac44a:	41 0f 11 47 68       	movups XMMWORD PTR [r15+0x68],xmm0
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
```
## `0x10ad69b` — late read into rcx

```text
 10ad64b:	e8 36 0e 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad650:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
 10ad657:	00
 10ad658:	e8 29 0e 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad65d:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad664:	00
 10ad665:	e8 c0 06 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ad66a:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
 10ad66e:	48 89 ef             	mov    rdi,rbp
 10ad671:	48 8b 5c 24 28       	mov    rbx,QWORD PTR [rsp+0x28]
 10ad676:	ff 90 58 01 00 00    	call   QWORD PTR [rax+0x158]
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
 10ad6c1:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
 10ad6c6:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
 10ad6ca:	c6 40 40 01          	mov    BYTE PTR [rax+0x40],0x1
 10ad6ce:	48 8b 8c 24 98 00 00 	mov    rcx,QWORD PTR [rsp+0x98]
 10ad6d5:	00
 10ad6d6:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
 10ad6d9:	48 89 01             	mov    QWORD PTR [rcx],rax
 10ad6dc:	48 85 ff             	test   rdi,rdi
 10ad6df:	74 06                	je     10ad6e7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274afd>
 10ad6e1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ad6e4:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10ad6e7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ad6ee:	00 00
 10ad6f0:	48 3b 84 24 50 01 00 	cmp    rax,QWORD PTR [rsp+0x150]
 10ad6f7:	00
 10ad6f8:	0f 85 12 05 00 00    	jne    10adc10 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275026>
 10ad6fe:	48 81 c4 58 01 00 00 	add    rsp,0x158
 10ad705:	5b                   	pop    rbx
 10ad706:	41 5c                	pop    r12
 10ad708:	41 5d                	pop    r13
 10ad70a:	41 5e                	pop    r14
 10ad70c:	41 5f                	pop    r15
 10ad70e:	5d                   	pop    rbp
 10ad70f:	c3                   	ret
 10ad710:	48 89 c3             	mov    rbx,rax
 10ad713:	e9 16 04 00 00       	jmp    10adb2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f44>
 10ad718:	e9 23 01 00 00       	jmp    10ad840 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c56>
 10ad71d:	e9 06 01 00 00       	jmp    10ad828 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c3e>
 10ad722:	e9 19 01 00 00       	jmp    10ad840 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c56>
 10ad727:	48 89 c3             	mov    rbx,rax
 10ad72a:	e9 da 03 00 00       	jmp    10adb09 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f1f>
 10ad72f:	e9 03 02 00 00       	jmp    10ad937 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274d4d>
 10ad734:	48 89 c3             	mov    rbx,rax
 10ad737:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 10ad73e:	00
 10ad73f:	e8 4c 07 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ad744:	eb 21                	jmp    10ad767 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274b7d>
 10ad746:	48 89 c3             	mov    rbx,rax
 10ad749:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad750:	00
 10ad751:	e8 d4 05 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ad756:	4d 89 fe             	mov    r14,r15
 10ad759:	49 8b 7f 28          	mov    rdi,QWORD PTR [r15+0x28]
 10ad75d:	e8 24 0d 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad762:	eb 1b                	jmp    10ad77f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274b95>
 10ad764:	48 89 c3             	mov    rbx,rax
 10ad767:	e9 fb 00 00 00       	jmp    10ad867 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c7d>
 10ad76c:	4d 89 fe             	mov    r14,r15
 10ad76f:	48 89 c3             	mov    rbx,rax
 10ad772:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad779:	00
 10ad77a:	e8 ab 05 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ad77f:	4c 89 f7             	mov    rdi,r14
 10ad782:	e8 99 07 74 00       	call   17edf20 <_ZdlPv@plt>
 10ad787:	e9 c3 03 00 00       	jmp    10adb4f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f65>
 10ad78c:	e9 a6 01 00 00       	jmp    10ad937 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274d4d>
 10ad791:	48 89 c3             	mov    rbx,rax
 10ad794:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad79b:	00
 10ad79c:	e8 89 05 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ad7a1:	4d 89 fe             	mov    r14,r15
 10ad7a4:	49 8b 7f 40          	mov    rdi,QWORD PTR [r15+0x40]
 10ad7a8:	e8 d9 0c 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad7ad:	eb 13                	jmp    10ad7c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274bd8>
 10ad7af:	4d 89 fe             	mov    r14,r15
 10ad7b2:	48 89 c3             	mov    rbx,rax
 10ad7b5:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad7bc:	00
 10ad7bd:	e8 68 05 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ad7c2:	4c 89 f7             	mov    rdi,r14
 10ad7c5:	e8 56 07 74 00       	call   17edf20 <_ZdlPv@plt>
 10ad7ca:	e9 8b 03 00 00       	jmp    10adb5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f70>
 10ad7cf:	eb 00                	jmp    10ad7d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274be7>
 10ad7d1:	48 89 c3             	mov    rbx,rax
 10ad7d4:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
 10ad7d8:	e8 a9 0c 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad7dd:	4c 89 ff             	mov    rdi,r15
 10ad7e0:	e8 17 1e 9f ff       	call   a9f5fc <JNI_OnUnload@@Base+0x26ec9>
 10ad7e5:	eb 2d                	jmp    10ad814 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c2a>
 10ad7e7:	e9 1a 03 00 00       	jmp    10adb06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f1c>
 10ad7ec:	48 89 c3             	mov    rbx,rax
```
## `0x10adb4f` — late cleanup/read into rdi

```text
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
 10adc05:	00
 10adc06:	75 08                	jne    10adc10 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275026>
 10adc08:	48 89 df             	mov    rdi,rbx
 10adc0b:	e8 c0 20 9c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10adc10:	e8 9b 1e 74 00       	call   17efab0 <__stack_chk_fail@plt>
 10adc15:	cc                   	int3
 10adc16:	53                   	push   rbx
 10adc17:	48 89 fb             	mov    rbx,rdi
 10adc1a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10adc1d:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
 10adc21:	e8 94 f4 9f ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
 10adc26:	48 89 d8             	mov    rax,rbx
 10adc29:	5b                   	pop    rbx
 10adc2a:	c3                   	ret
 10adc2b:	cc                   	int3
 10adc2c:	50                   	push   rax
 10adc2d:	e8 4c 60 3d 00       	call   1483c7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c9202>
 10adc32:	59                   	pop    rcx
 10adc33:	c3                   	ret
 10adc34:	48 89 c7             	mov    rdi,rax
 10adc37:	e8 69 be 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10adc3c:	53                   	push   rbx
 10adc3d:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
 10adc41:	48 85 c0             	test   rax,rax
 10adc44:	74 11                	je     10adc57 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27506d>
 10adc46:	48 89 fb             	mov    rbx,rdi
 10adc49:	31 ff                	xor    edi,edi
 10adc4b:	48 89 de             	mov    rsi,rbx
 10adc4e:	31 d2                	xor    edx,edx
 10adc50:	ff d0                	call   rax
 10adc52:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
 10adc57:	5b                   	pop    rbx
 10adc58:	c3                   	ret
 10adc59:	48 89 c7             	mov    rdi,rax
 10adc5c:	e8 44 be 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10adc61:	cc                   	int3
 10adc62:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 10adc65:	e9 dc 02 00 00       	jmp    10adf46 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27535c>
 10adc6a:	50                   	push   rax
 10adc6b:	e8 0e 60 3d 00       	call   1483c7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c9202>
 10adc70:	59                   	pop    rcx
 10adc71:	c3                   	ret
 10adc72:	48 89 c7             	mov    rdi,rax
 10adc75:	e8 2b be 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10adc7a:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 10adc7d:	e9 ce 00 00 00       	jmp    10add50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275166>
 10adc82:	53                   	push   rbx
 10adc83:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
```
## Chronological late holder events

| addr | instruction |
|---:|---|
| `0x10ac437` | `10ac437:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10ac442` | `10ac442:	e8 e3 18 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>` |
| `0x10ac454` | `10ac454:	4c 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],r15` |
| `0x10ac46b` | `10ac46b:	e8 c0 a8 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ac473` | `10ac473:	e8 88 1a 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac478` | `10ac478:	48 8d 0d 71 0d 7a 00 	lea    rcx,[rip+0x7a0d71]        # 184d1f0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x98d8>` |
| `0x10ac47f` | `10ac47f:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax` |
| `0x10ac484` | `10ac484:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10ac4ab` | `10ac4ab:	e8 18 b0 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>` |
| `0x10ac4ca` | `10ac4ca:	e8 80 f3 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0x10ac4df` | `10ac4df:	e8 4c a8 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ac4e9` | `10ac4e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10ac4ec` | `10ac4ec:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ac4f7` | `10ac4f7:	e8 04 1a 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac4fc` | `10ac4fc:	48 8d 0d a5 14 7a 00 	lea    rcx,[rip+0x7a14a5]        # 184d9a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa090>` |
| `0x10ac503` | `10ac503:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10ac506` | `10ac506:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14` |
| `0x10ac50f` | `10ac50f:	48 89 70 10          	mov    QWORD PTR [rax+0x10],rsi` |
| `0x10ac513` | `10ac513:	c6 40 18 00          	mov    BYTE PTR [rax+0x18],0x0` |
| `0x10ac517` | `10ac517:	48 8d 78 20          	lea    rdi,[rax+0x20]` |
| `0x10ac542` | `10ac542:	ff 51 18             	call   QWORD PTR [rcx+0x18]` |
| `0x10ac550` | `10ac550:	e8 d5 17 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>` |
| `0x10ac584` | `10ac584:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10ac58f` | `10ac58f:	e8 96 17 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>` |
| `0x10ac5e2` | `10ac5e2:	e8 49 a7 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ac5ea` | `10ac5ea:	e8 11 19 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac5fb` | `10ac5fb:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10ac622` | `10ac622:	e8 a1 ae 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>` |
| `0x10ac641` | `10ac641:	e8 09 f2 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0x10ac656` | `10ac656:	e8 d5 a6 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ac66a` | `10ac66a:	e8 0f d4 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10ac674` | `10ac674:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]` |
| `0x10ac688` | `10ac688:	e8 2d 0a a0 ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>` |
| `0x10ac6ae` | `10ac6ae:	e8 77 ad 53 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>` |
| `0x10ac6d4` | `10ac6d4:	e8 51 ad 53 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>` |
| `0x10ac6e1` | `10ac6e1:	e8 1a 18 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac785` | `10ac785:	e8 3c 3e 00 00       	call   10b05c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2779dc>` |
| `0x10ac7a7` | `10ac7a7:	e8 16 4f 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>` |
| `0x10ac7c0` | `10ac7c0:	e8 c9 ba a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>` |
| `0x10ac7c8` | `10ac7c8:	e8 6f 14 00 00       	call   10adc3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275052>` |
| `0x10ac7d0` | `10ac7d0:	e8 bb 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ac7da` | `10ac7da:	48 8b 38             	mov    rdi,QWORD PTR [rax]` |
| `0x10ac7dd` | `10ac7dd:	4c 89 30             	mov    QWORD PTR [rax],r14` |
| `0x10ac7e5` | `10ac7e5:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10ac7e8` | `10ac7e8:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10ac7f3` | `10ac7f3:	e8 98 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ac800` | `10ac800:	e8 8b 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ac812` | `10ac812:	e8 d1 b6 ab ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>` |
| `0x10ac821` | `10ac821:	48 8b 00             	mov    rax,QWORD PTR [rax]` |
| `0x10ac83b` | `10ac83b:	e8 6c c9 ac ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>` |
| `0x10ac870` | `10ac870:	e8 2b d2 ac ff       	call   b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>` |
| `0x10ac88a` | `10ac88a:	e8 71 16 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac89d` | `10ac89d:	e8 fe d1 ac ff       	call   b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>` |
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
| `0x10aca3a` | `10aca3a:	e8 87 3b 00 00       	call   10b05c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2779dc>` |
| `0x10aca5c` | `10aca5c:	e8 61 4c 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>` |
| `0x10aca73` | `10aca73:	e8 16 b8 a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>` |
| `0x10aca9b` | `10aca9b:	e8 32 9e 72 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>` |
| `0x10acac4` | `10acac4:	e8 09 9e 72 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>` |
| `0x10acad1` | `10acad1:	e8 66 11 00 00       	call   10adc3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275052>` |
| `0x10acade` | `10acade:	e8 ad 13 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10acae8` | `10acae8:	48 8b 38             	mov    rdi,QWORD PTR [rax]` |
| `0x10acaeb` | `10acaeb:	4c 89 30             	mov    QWORD PTR [rax],r14` |
| `0x10acaf3` | `10acaf3:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10acaf6` | `10acaf6:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10acb01` | `10acb01:	e8 8a 13 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10acb0e` | `10acb0e:	e8 7d 13 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10acb20` | `10acb20:	e8 c3 b3 ab ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>` |
| `0x10acb2a` | `10acb2a:	48 8b 00             	mov    rax,QWORD PTR [rax]` |
| `0x10acb44` | `10acb44:	e8 63 c6 ac ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>` |
| `0x10acb79` | `10acb79:	e8 22 cf ac ff       	call   b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>` |
| `0x10acb93` | `10acb93:	e8 68 13 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10acba6` | `10acba6:	e8 f5 ce ac ff       	call   b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>` |
| `0x10acbe0` | `10acbe0:	e8 a3 48 71 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>` |
| `0x10acbe8` | `10acbe8:	e8 b1 a6 9f ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>` |
| `0x10acbf5` | `10acbf5:	e8 36 5e ae ff       	call   b92a30 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdf9d0>` |
| `0x10acbfd` | `10acbfd:	e8 24 3f 9f ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>` |
| `0x10acc07` | `10acc07:	48 8b 18             	mov    rbx,QWORD PTR [rax]` |
| `0x10acc0f` | `10acc0f:	4c 8b 38             	mov    r15,QWORD PTR [rax]` |
| `0x10acc17` | `10acc17:	e8 e4 12 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10acc9d` | `10acc9d:	e8 f2 da 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0x10accc1` | `10accc1:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0x10accca` | `10accca:	e8 6f cd 72 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>` |
| `0x10accd3` | `10accd3:	e8 ae 17 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10accdb` | `10accdb:	e8 08 db 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0x10acd22` | `10acd22:	48 8b 38             	mov    rdi,QWORD PTR [rax]` |
| `0x10acd25` | `10acd25:	4c 89 30             	mov    QWORD PTR [rax],r14` |
| `0x10acd2d` | `10acd2d:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10acd30` | `10acd30:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10acd38` | `10acd38:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10acd3b` | `10acd3b:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10acd46` | `10acd46:	48 8b 18             	mov    rbx,QWORD PTR [rax]` |
| `0x10acd4c` | `10acd4c:	e8 af 11 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10acd58` | `10acd58:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10acd62` | `10acd62:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx` |
| `0x10acd66` | `10acd66:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14` |
| `0x10acd6a` | `10acd6a:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx` |
| `0x10acd76` | `10acd76:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx` |
| `0x10acd7d` | `10acd7d:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0` |
| `0x10acd81` | `10acd81:	0f 11 40 38          	movups XMMWORD PTR [rax+0x38],xmm0` |
| `0x10acd85` | `10acd85:	c7 40 48 00 00 80 3f 	mov    DWORD PTR [rax+0x48],0x3f800000` |
| `0x10acda0` | `10acda0:	e8 dd 0e 00 00       	call   10adc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275098>` |
| `0x10acda8` | `10acda8:	e8 f5 0e 00 00       	call   10adca2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750b8>` |
| `0x10acdb2` | `10acdb2:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10acdb5` | `10acdb5:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10acdc3` | `10acdc3:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10acdc6` | `10acdc6:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10acdd1` | `10acdd1:	e8 2a 11 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ace1a` | `10ace1a:	e8 e3 03 a1 ff       	call   abd202 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1a2>` |
| `0x10ace31` | `10ace31:	e8 8c 48 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>` |
| `0x10ace60` | `10ace60:	e8 2f d9 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0x10ace79` | `10ace79:	ff 50 48             	call   QWORD PTR [rax+0x48]` |
| `0x10ace91` | `10ace91:	e8 a8 cb 72 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>` |
| `0x10ace9a` | `10ace9a:	e8 e7 15 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10acea7` | `10acea7:	e8 3c d9 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0x10acec6` | `10acec6:	e8 df 0d 00 00       	call   10adcaa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750c0>` |
| `0x10acece` | `10acece:	e8 f7 0d 00 00       	call   10adcca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750e0>` |
| `0x10aced8` | `10aced8:	48 8b 28             	mov    rbp,QWORD PTR [rax]` |
| `0x10acee1` | `10acee1:	e8 1a 10 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10acf1d` | `10acf1d:	e8 92 68 b2 ff       	call   bd37b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x120754>` |
| `0x10acf28` | `10acf28:	e8 87 68 b2 ff       	call   bd37b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x120754>` |
| `0x10acf49` | `10acf49:	e8 84 0d 00 00       	call   10adcd2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750e8>` |
| `0x10acf51` | `10acf51:	e8 9c 0d 00 00       	call   10adcf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275108>` |
| `0x10acf5e` | `10acf5e:	e8 c3 3b 9f ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>` |
| `0x10acf88` | `10acf88:	e8 fd a3 53 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>` |
| `0x10acfad` | `10acfad:	e8 d8 a3 53 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>` |
| `0x10acfd2` | `10acfd2:	e8 b3 a3 53 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>` |
| `0x10acff7` | `10acff7:	e8 8e a3 53 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>` |
| `0x10ad01b` | `10ad01b:	e8 6a a3 53 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>` |
| `0x10ad048` | `10ad048:	e8 7b a4 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>` |
| `0x10ad062` | `10ad062:	e8 e8 e7 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0x10ad071` | `10ad071:	e8 ba 9c 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ad09a` | `10ad09a:	e8 29 a4 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>` |
| `0x10ad0b4` | `10ad0b4:	e8 96 e7 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0x10ad0cf` | `10ad0cf:	e8 5c 9c 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ad0f8` | `10ad0f8:	e8 cb a3 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>` |
| `0x10ad116` | `10ad116:	e8 34 e7 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0x10ad131` | `10ad131:	e8 fa 9b 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ad13b` | `10ad13b:	48 8b 18             	mov    rbx,QWORD PTR [rax]` |
| `0x10ad143` | `10ad143:	4c 8b 20             	mov    r12,QWORD PTR [rax]` |
| `0x10ad14b` | `10ad14b:	4c 8b 30             	mov    r14,QWORD PTR [rax]` |
| `0x10ad153` | `10ad153:	4c 8b 38             	mov    r15,QWORD PTR [rax]` |
| `0x10ad15b` | `10ad15b:	e8 a0 0d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ad1c6` | `10ad1c6:	e8 2b c8 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>` |
| `0x10ad1dc` | `10ad1dc:	e8 15 c8 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>` |
| `0x10ad29b` | `10ad29b:	e8 ee af a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>` |
| `0x10ad2ac` | `10ad2ac:	e8 dd af a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>` |
| `0x10ad2bb` | `10ad2bb:	e8 36 c7 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>` |
| `0x10ad2ca` | `10ad2ca:	e8 27 c7 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>` |
| `0x10ad306` | `10ad306:	e8 89 d4 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0x10ad31f` | `10ad31f:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10ad328` | `10ad328:	e8 c5 c8 72 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>` |
| `0x10ad331` | `10ad331:	e8 50 11 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10ad339` | `10ad339:	e8 aa d4 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0x10ad374` | `10ad374:	e8 1b d4 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0x10ad38a` | `10ad38a:	ff 50 20             	call   QWORD PTR [rax+0x20]` |
| `0x10ad39b` | `10ad39b:	e8 52 c8 72 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>` |
| `0x10ad3a4` | `10ad3a4:	e8 dd 10 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10ad3b1` | `10ad3b1:	e8 32 d4 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0x10ad3e9` | `10ad3e9:	e8 a6 d3 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0x10ad3ff` | `10ad3ff:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10ad410` | `10ad410:	e8 dd c7 72 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>` |
| `0x10ad419` | `10ad419:	e8 68 10 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10ad426` | `10ad426:	e8 bd d3 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0x10ad45e` | `10ad45e:	e8 31 d3 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0x10ad474` | `10ad474:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ad487` | `10ad487:	e8 66 c7 72 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>` |
| `0x10ad490` | `10ad490:	e8 f1 0f 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10ad49d` | `10ad49d:	e8 46 d3 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0x10ad4a5` | `10ad4a5:	e8 56 0a 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ad4c3` | `10ad4c3:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]` |
| `0x10ad4ce` | `10ad4ce:	0f 11 00             	movups XMMWORD PTR [rax],xmm0` |
| `0x10ad4f1` | `10ad4f1:	48 8b 30             	mov    rsi,QWORD PTR [rax]` |
| `0x10ad514` | `10ad514:	e8 af 9f 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>` |
| `0x10ad52e` | `10ad52e:	e8 1c e3 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0x10ad53f` | `10ad53f:	e8 ec 97 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ad547` | `10ad547:	e8 b4 09 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ad553` | `10ad553:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10ad556` | `10ad556:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14` |
| `0x10ad562` | `10ad562:	48 89 68 10          	mov    QWORD PTR [rax+0x10],rbp` |
| `0x10ad570` | `10ad570:	e8 bb 97 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ad5b8` | `10ad5b8:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ad5df` | `10ad5df:	e8 a2 0e 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10ad5e8` | `10ad5e8:	e8 99 0e 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10ad5f8` | `10ad5f8:	e8 fd 06 00 00       	call   10adcfa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275110>` |
| `0x10ad62a` | `10ad62a:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10ad64b` | `10ad64b:	e8 36 0e 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10ad658` | `10ad658:	e8 29 0e 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10ad665` | `10ad665:	e8 c0 06 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>` |
| `0x10ad676` | `10ad676:	ff 90 58 01 00 00    	call   QWORD PTR [rax+0x158]` |
| `0x10ad682` | `10ad682:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0x10ad688` | `10ad688:	e8 73 08 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ad694` | `10ad694:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10ad697` | `10ad697:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14` |
| `0x10ad69b` | `10ad69b:	48 8b 4c 24 70       	mov    rcx,QWORD PTR [rsp+0x70]` |
| `0x10ad6a0` | `10ad6a0:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx` |
| `0x10ad6a4` | `10ad6a4:	48 89 68 18          	mov    QWORD PTR [rax+0x18],rbp` |
| `0x10ad6ad` | `10ad6ad:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx` |
| `0x10ad6b1` | `10ad6b1:	48 89 58 28          	mov    QWORD PTR [rax+0x28],rbx` |
| `0x10ad6bd` | `10ad6bd:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx` |
| `0x10ad6c6` | `10ad6c6:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx` |
| `0x10ad6ca` | `10ad6ca:	c6 40 40 01          	mov    BYTE PTR [rax+0x40],0x1` |
| `0x10ad6d6` | `10ad6d6:	48 8b 39             	mov    rdi,QWORD PTR [rcx]` |
| `0x10ad6d9` | `10ad6d9:	48 89 01             	mov    QWORD PTR [rcx],rax` |
| `0x10ad6e1` | `10ad6e1:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10ad6e4` | `10ad6e4:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10ad73f` | `10ad73f:	e8 4c 07 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ad751` | `10ad751:	e8 d4 05 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>` |
| `0x10ad75d` | `10ad75d:	e8 24 0d 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10ad77a` | `10ad77a:	e8 ab 05 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>` |
| `0x10ad782` | `10ad782:	e8 99 07 74 00       	call   17edf20 <_ZdlPv@plt>` |
| `0x10ad787` | `10ad787:	e9 c3 03 00 00       	jmp    10adb4f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f65>` |
| `0x10ad79c` | `10ad79c:	e8 89 05 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>` |
| `0x10ad7a8` | `10ad7a8:	e8 d9 0c 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10ad7bd` | `10ad7bd:	e8 68 05 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>` |
| `0x10ad7c5` | `10ad7c5:	e8 56 07 74 00       	call   17edf20 <_ZdlPv@plt>` |
| `0x10ad7d8` | `10ad7d8:	e8 a9 0c 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10ad7e0` | `10ad7e0:	e8 17 1e 9f ff       	call   a9f5fc <JNI_OnUnload@@Base+0x26ec9>` |
| `0x10ad7f7` | `10ad7f7:	e8 ec cf 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0x10ad7ff` | `10ad7ff:	e8 42 3f 71 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>` |
| `0x10ad807` | `10ad807:	e8 5a c6 72 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>` |
| `0x10ad80f` | `10ad80f:	e8 1c 0c 00 00       	call   10ae430 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275846>` |
| `0x10ad817` | `10ad817:	e8 04 07 74 00       	call   17edf20 <_ZdlPv@plt>` |
| `0x10ad833` | `10ad833:	e8 66 9a 9f ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>` |
| `0x10ad83b` | `10ad83b:	e8 65 c2 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0x10ad843` | `10ad843:	e8 5d c2 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0x10ad85d` | `10ad85d:	e8 2e 06 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ad86f` | `10ad86f:	e8 1c 06 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ad88d` | `10ad88d:	e8 56 cf 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0x10ad89f` | `10ad89f:	e8 30 c3 72 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>` |
| `0x10ad8a7` | `10ad8a7:	e8 28 c3 72 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>` |
| `0x10ad8b1` | `10ad8b1:	e8 b0 c5 72 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>` |
| `0x10ad8bb` | `10ad8bb:	e8 a6 c5 72 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>` |
| `0x10ad8c3` | `10ad8c3:	e8 8e ce 00 00       	call   10ba756 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b6c>` |
| `0x10ad8cd` | `10ad8cd:	e8 02 c3 72 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>` |
| `0x10ad8d5` | `10ad8d5:	e8 fa c2 72 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>` |
| `0x10ad8dd` | `10ad8dd:	e8 3e 06 74 00       	call   17edf20 <_ZdlPv@plt>` |
| `0x10ad8ec` | `10ad8ec:	e9 5e 02 00 00       	jmp    10adb4f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f65>` |
| `0x10ad90b` | `10ad90b:	e8 1a 04 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>` |
| `0x10ad920` | `10ad920:	e8 d5 03 00 00       	call   10adcfa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275110>` |
| `0x10ad952` | `10ad952:	e8 c9 05 74 00       	call   17edf20 <_ZdlPv@plt>` |
| `0x10ad964` | `10ad964:	e8 e9 42 d3 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>` |
| `0x10ad96c` | `10ad96c:	e8 af 05 74 00       	call   17edf20 <_ZdlPv@plt>` |
| `0x10ad989` | `10ad989:	e8 02 05 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ad9b4` | `10ad9b4:	e8 d7 04 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ad9df` | `10ad9df:	e8 ac 04 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ada0a` | `10ada0a:	e8 81 04 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ada35` | `10ada35:	e8 56 04 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ada60` | `10ada60:	e8 2b 04 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ada88` | `10ada88:	e8 03 04 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10adab0` | `10adab0:	e8 db 03 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10adad8` | `10adad8:	e8 b3 03 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10adaf7` | `10adaf7:	e8 94 03 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10adb11` | `10adb11:	e8 10 30 9f ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>` |
| `0x10adb28` | `10adb28:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10adb2b` | `10adb2b:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10adb34` | `10adb34:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10adb3e` | `10adb3e:	ff 90 d8 01 00 00    	call   QWORD PTR [rax+0x1d8]` |
| `0x10adb49` | `10adb49:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10adb4c` | `10adb4c:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0x10adb4f` | `10adb4f:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]` |
| `0x10adb54` | `10adb54:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10adb57` | `10adb57:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10adb5f` | `10adb5f:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10adb62` | `10adb62:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10adb6d` | `10adb6d:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10adb70` | `10adb70:	ff 50 48             	call   QWORD PTR [rax+0x48]` |
| `0x10adb80` | `10adb80:	e8 6d 01 00 00       	call   10adcf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275108>` |
| `0x10adb8d` | `10adb8d:	e8 38 01 00 00       	call   10adcca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750e0>` |
| `0x10adb97` | `10adb97:	e8 06 01 00 00       	call   10adca2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750b8>` |
| `0x10adba1` | `10adba1:	e8 82 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>` |
| `0x10adbab` | `10adbab:	e8 78 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>` |
| `0x10adbb5` | `10adbb5:	e8 c2 15 ac ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>` |
| `0x10adbbf` | `10adbbf:	e8 64 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>` |
| `0x10adbd0` | `10adbd0:	e8 b1 08 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10adbd9` | `10adbd9:	e8 a8 08 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x10adbe3` | `10adbe3:	e8 40 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>` |
| `0x10adbf0` | `10adbf0:	e8 33 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>` |

