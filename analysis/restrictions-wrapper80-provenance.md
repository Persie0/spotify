# Restrictions wrapper_0x80 provenance trace

Focused follow-up after the two `vtable+0x28` calls. Tracks the `operator new(0x80)` wrapper at `10ac391`, AP `0x184d0a0`, and immediate post-wrapper constructor tail.

## Constructor tail `10ac360..10ac520`

```text
 10ac365:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac36c:	00
 10ac36d:	e8 be a9 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac372:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10ac377:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac37a:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ac37d:	49 89 c6             	mov    r14,rax
 10ac380:	49 8b 07             	mov    rax,QWORD PTR [r15]
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
 10ac3cd:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]
 10ac3d1:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac3d8:	00
 10ac3d9:	4c 89 3a             	mov    QWORD PTR [rdx],r15
 10ac3dc:	48 8d 05 81 00 9d ff 	lea    rax,[rip+0xffffffffff9d0081]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac3e3:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
 10ac3e7:	48 8d 05 8e 69 00 00 	lea    rax,[rip+0x698e]        # 10b2d7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a192>
 10ac3ee:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax
 10ac3f2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ac3f5:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10ac3f8:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac3ff:	00
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
```
## Interesting constructor events

| addr | instruction |
|---:|---|
| `0x10ac365` | `10ac365:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac36d` | `10ac36d:	e8 be a9 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ac372` | `10ac372:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10ac377` | `10ac377:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10ac37a` | `10ac37a:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ac37d` | `10ac37d:	49 89 c6             	mov    r14,rax` |
| `0x10ac380` | `10ac380:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0x10ac383` | `10ac383:	4c 89 ff             	mov    rdi,r15` |
| `0x10ac386` | `10ac386:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ac389` | `10ac389:	49 89 c7             	mov    r15,rax` |
| `0x10ac38c` | `10ac38c:	bf 80 00 00 00       	mov    edi,0x80` |
| `0x10ac391` | `10ac391:	e8 6a 1b 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac396` | `10ac396:	48 89 c1             	mov    rcx,rax` |
| `0x10ac399` | `10ac399:	48 8d 05 00 0d 7a 00 	lea    rax,[rip+0x7a0d00]        # 184d0a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9788>` |
| `0x10ac3a0` | `10ac3a0:	48 89 01             	mov    QWORD PTR [rcx],rax` |
| `0x10ac3a3` | `10ac3a3:	4c 89 71 08          	mov    QWORD PTR [rcx+0x8],r14` |
| `0x10ac3a7` | `10ac3a7:	4c 89 79 10          	mov    QWORD PTR [rcx+0x10],r15` |
| `0x10ac3ab` | `10ac3ab:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]` |
| `0x10ac3b0` | `10ac3b0:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax` |
| `0x10ac3b4` | `10ac3b4:	49 89 cf             	mov    r15,rcx` |
| `0x10ac3b7` | `10ac3b7:	e8 54 7d ab ff       	call   b64110 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb10b0>` |
| `0x10ac3bc` | `10ac3bc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax` |
| `0x10ac3c0` | `10ac3c0:	49 89 57 28          	mov    QWORD PTR [r15+0x28],rdx` |
| `0x10ac3c4` | `10ac3c4:	41 c6 47 30 00       	mov    BYTE PTR [r15+0x30],0x0` |
| `0x10ac3c9` | `10ac3c9:	49 8d 7f 38          	lea    rdi,[r15+0x38]` |
| `0x10ac3cd` | `10ac3cd:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]` |
| `0x10ac3d1` | `10ac3d1:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]` |
| `0x10ac3d9` | `10ac3d9:	4c 89 3a             	mov    QWORD PTR [rdx],r15` |
| `0x10ac3dc` | `10ac3dc:	48 8d 05 81 00 9d ff 	lea    rax,[rip+0xffffffffff9d0081]        # a7c464 <JNI_OnUnload@@Base+0x3d31>` |
| `0x10ac3e3` | `10ac3e3:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax` |
| `0x10ac3e7` | `10ac3e7:	48 8d 05 8e 69 00 00 	lea    rax,[rip+0x698e]        # 10b2d7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a192>` |
| `0x10ac3ee` | `10ac3ee:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax` |
| `0x10ac3f2` | `10ac3f2:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0x10ac3f5` | `10ac3f5:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10ac3f8` | `10ac3f8:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac400` | `10ac400:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac403` | `10ac403:	e8 22 19 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>` |
| `0x10ac408` | `10ac408:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]` |
| `0x10ac40c` | `10ac40c:	4d 89 3e             	mov    QWORD PTR [r14],r15` |
| `0x10ac40f` | `10ac40f:	48 8d 05 4e 00 9d ff 	lea    rax,[rip+0xffffffffff9d004e]        # a7c464 <JNI_OnUnload@@Base+0x3d31>` |
| `0x10ac416` | `10ac416:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax` |
| `0x10ac41a` | `10ac41a:	48 8d 05 61 6c 00 00 	lea    rax,[rip+0x6c61]        # 10b3082 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a498>` |
| `0x10ac421` | `10ac421:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax` |
| `0x10ac425` | `10ac425:	4c 89 ff             	mov    rdi,r15` |
| `0x10ac42c` | `10ac42c:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0x10ac42f` | `10ac42f:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]` |
| `0x10ac437` | `10ac437:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10ac43a` | `10ac43a:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac442` | `10ac442:	e8 e3 18 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>` |
| `0x10ac44a` | `10ac44a:	41 0f 11 47 68       	movups XMMWORD PTR [r15+0x68],xmm0` |
| `0x10ac44f` | `10ac44f:	41 0f 11 47 58       	movups XMMWORD PTR [r15+0x58],xmm0` |
| `0x10ac454` | `10ac454:	4c 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],r15` |
| `0x10ac459` | `10ac459:	41 c7 47 78 00 00 80 	mov    DWORD PTR [r15+0x78],0x3f800000` |
| `0x10ac461` | `10ac461:	eb 24                	jmp    10ac487 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27389d>` |
| `0x10ac463` | `10ac463:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac46b` | `10ac46b:	e8 c0 a8 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ac473` | `10ac473:	e8 88 1a 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac478` | `10ac478:	48 8d 0d 71 0d 7a 00 	lea    rcx,[rip+0x7a0d71]        # 184d1f0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x98d8>` |
| `0x10ac47f` | `10ac47f:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax` |
| `0x10ac484` | `10ac484:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10ac487` | `10ac487:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]` |
| `0x10ac48b` | `10ac48b:	48 8d 15 de af 32 ff 	lea    rdx,[rip+0xffffffffff32afde]        # 3d7470 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2055>` |
| `0x10ac492` | `10ac492:	4c 8d 05 f7 af 32 ff 	lea    r8,[rip+0xffffffffff32aff7]        # 3d7490 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2075>` |
| `0x10ac499` | `10ac499:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac4a8` | `10ac4a8:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac4ab` | `10ac4ab:	e8 18 b0 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>` |
| `0x10ac4bb` | `10ac4bb:	48 8d 35 e9 c3 32 ff 	lea    rsi,[rip+0xffffffffff32c3e9]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>` |
| `0x10ac4c2` | `10ac4c2:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac4ca` | `10ac4ca:	e8 80 f3 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0x10ac4d7` | `10ac4d7:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac4df` | `10ac4df:	e8 4c a8 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ac4e4` | `10ac4e4:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10ac4e9` | `10ac4e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10ac4ec` | `10ac4ec:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ac4ef` | `10ac4ef:	49 89 c6             	mov    r14,rax` |
| `0x10ac4f2` | `10ac4f2:	bf d8 00 00 00       	mov    edi,0xd8` |
| `0x10ac4f7` | `10ac4f7:	e8 04 1a 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac4fc` | `10ac4fc:	48 8d 0d a5 14 7a 00 	lea    rcx,[rip+0x7a14a5]        # 184d9a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa090>` |
| `0x10ac503` | `10ac503:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10ac506` | `10ac506:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14` |
| `0x10ac50a` | `10ac50a:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]` |
| `0x10ac50f` | `10ac50f:	48 89 70 10          	mov    QWORD PTR [rax+0x10],rsi` |
| `0x10ac513` | `10ac513:	c6 40 18 00          	mov    BYTE PTR [rax+0x18],0x0` |
| `0x10ac517` | `10ac517:	48 8d 78 20          	lea    rdi,[rax+0x20]` |
| `0x10ac51b` | `10ac51b:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]` |

## Wrapper_0x80 creation annotations

| addr | instruction | interpretation |
|---:|---|---|
| `0x10ac391` | `10ac391:	e8 6a 1b 74 00       	call   17edf00 <_Znwm@plt>` | operator new(0x80) -> rax |
| `0x10ac396` | `10ac396:	48 89 c1             	mov    rcx,rax` | rcx = wrapper_0x80 |
| `0x10ac399` | `10ac399:	48 8d 05 00 0d 7a 00 	lea    rax,[rip+0x7a0d00]        # 184d0a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9788>` | rax = AP 0x184d0a0 |
| `0x10ac3a0` | `10ac3a0:	48 89 01             	mov    QWORD PTR [rcx],rax` | [wrapper+0x00] = AP |
| `0x10ac3a3` | `10ac3a3:	4c 89 71 08          	mov    QWORD PTR [rcx+0x8],r14` | [wrapper+0x08] = first vtable+0x28 return |
| `0x10ac3a7` | `10ac3a7:	4c 89 79 10          	mov    QWORD PTR [rcx+0x10],r15` | [wrapper+0x10] = second vtable+0x28 return |
| `0x10ac3ab` | `10ac3ab:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]` | rax = allocated_0x150 |
| `0x10ac3b0` | `10ac3b0:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax` | [wrapper+0x18] = allocated_0x150 |
| `0x10ac3b7` | `10ac3b7:	e8 54 7d ab ff       	call   b64110 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb10b0>` | post-wrapper call candidate |

## Wrapper/register references after allocation

| addr | instruction |
|---:|---|
| `0x10ac391` | `10ac391:	e8 6a 1b 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac396` | `10ac396:	48 89 c1             	mov    rcx,rax` |
| `0x10ac3a0` | `10ac3a0:	48 89 01             	mov    QWORD PTR [rcx],rax` |
| `0x10ac3a3` | `10ac3a3:	4c 89 71 08          	mov    QWORD PTR [rcx+0x8],r14` |
| `0x10ac3a7` | `10ac3a7:	4c 89 79 10          	mov    QWORD PTR [rcx+0x10],r15` |
| `0x10ac3ab` | `10ac3ab:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]` |
| `0x10ac3b0` | `10ac3b0:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax` |
| `0x10ac3b4` | `10ac3b4:	49 89 cf             	mov    r15,rcx` |
| `0x10ac3b7` | `10ac3b7:	e8 54 7d ab ff       	call   b64110 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb10b0>` |
| `0x10ac3bc` | `10ac3bc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax` |
| `0x10ac3c0` | `10ac3c0:	49 89 57 28          	mov    QWORD PTR [r15+0x28],rdx` |
| `0x10ac3c4` | `10ac3c4:	41 c6 47 30 00       	mov    BYTE PTR [r15+0x30],0x0` |
| `0x10ac3c9` | `10ac3c9:	49 8d 7f 38          	lea    rdi,[r15+0x38]` |
| `0x10ac3cd` | `10ac3cd:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]` |
| `0x10ac3d9` | `10ac3d9:	4c 89 3a             	mov    QWORD PTR [rdx],r15` |
| `0x10ac3f5` | `10ac3f5:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10ac3f8` | `10ac3f8:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac400` | `10ac400:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac403` | `10ac403:	e8 22 19 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>` |
| `0x10ac408` | `10ac408:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]` |
| `0x10ac40c` | `10ac40c:	4d 89 3e             	mov    QWORD PTR [r14],r15` |
| `0x10ac416` | `10ac416:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax` |
| `0x10ac421` | `10ac421:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax` |
| `0x10ac425` | `10ac425:	4c 89 ff             	mov    rdi,r15` |
| `0x10ac437` | `10ac437:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10ac442` | `10ac442:	e8 e3 18 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>` |
| `0x10ac44a` | `10ac44a:	41 0f 11 47 68       	movups XMMWORD PTR [r15+0x68],xmm0` |
| `0x10ac44f` | `10ac44f:	41 0f 11 47 58       	movups XMMWORD PTR [r15+0x58],xmm0` |
| `0x10ac454` | `10ac454:	4c 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],r15` |
| `0x10ac459` | `10ac459:	41 c7 47 78 00 00 80 	mov    DWORD PTR [r15+0x78],0x3f800000` |
| `0x10ac46b` | `10ac46b:	e8 c0 a8 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ac473` | `10ac473:	e8 88 1a 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac478` | `10ac478:	48 8d 0d 71 0d 7a 00 	lea    rcx,[rip+0x7a0d71]        # 184d1f0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x98d8>` |
| `0x10ac484` | `10ac484:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10ac499` | `10ac499:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac4a3` | `10ac4a3:	59                   	pop    rcx` |
| `0x10ac4a8` | `10ac4a8:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac4ab` | `10ac4ab:	e8 18 b0 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>` |
| `0x10ac4b0` | `10ac4b0:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0` |
| `0x10ac4ca` | `10ac4ca:	e8 80 f3 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0x10ac4df` | `10ac4df:	e8 4c a8 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ac4e4` | `10ac4e4:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10ac4ec` | `10ac4ec:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ac4ef` | `10ac4ef:	49 89 c6             	mov    r14,rax` |
| `0x10ac4f7` | `10ac4f7:	e8 04 1a 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac4fc` | `10ac4fc:	48 8d 0d a5 14 7a 00 	lea    rcx,[rip+0x7a14a5]        # 184d9a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa090>` |
| `0x10ac503` | `10ac503:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10ac506` | `10ac506:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14` |
| `0x10ac50a` | `10ac50a:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]` |

## Focus windows

### `0x10ac391` — operator new(0x80) wrapper allocation

```text
 10ac349:	48 8d 35 5b c5 32 ff 	lea    rsi,[rip+0xffffffffff32c55b]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ac350:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac357:	00
 10ac358:	e8 f2 f4 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac35d:	84 c0                	test   al,al
 10ac35f:	0f 84 fe 00 00 00    	je     10ac463 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273879>
 10ac365:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac36c:	00
 10ac36d:	e8 be a9 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac372:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10ac377:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac37a:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ac37d:	49 89 c6             	mov    r14,rax
 10ac380:	49 8b 07             	mov    rax,QWORD PTR [r15]
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
 10ac3cd:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]
 10ac3d1:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac3d8:	00
 10ac3d9:	4c 89 3a             	mov    QWORD PTR [rdx],r15
 10ac3dc:	48 8d 05 81 00 9d ff 	lea    rax,[rip+0xffffffffff9d0081]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac3e3:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
 10ac3e7:	48 8d 05 8e 69 00 00 	lea    rax,[rip+0x698e]        # 10b2d7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a192>
 10ac3ee:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax
 10ac3f2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ac3f5:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10ac3f8:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac3ff:	00
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
```
### `0x10ac399` — AP 0x184d0a0 assigned to wrapper

```text
 10ac357:	00
 10ac358:	e8 f2 f4 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac35d:	84 c0                	test   al,al
 10ac35f:	0f 84 fe 00 00 00    	je     10ac463 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273879>
 10ac365:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac36c:	00
 10ac36d:	e8 be a9 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac372:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10ac377:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac37a:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ac37d:	49 89 c6             	mov    r14,rax
 10ac380:	49 8b 07             	mov    rax,QWORD PTR [r15]
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
 10ac3cd:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]
 10ac3d1:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac3d8:	00
 10ac3d9:	4c 89 3a             	mov    QWORD PTR [rdx],r15
 10ac3dc:	48 8d 05 81 00 9d ff 	lea    rax,[rip+0xffffffffff9d0081]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac3e3:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
 10ac3e7:	48 8d 05 8e 69 00 00 	lea    rax,[rip+0x698e]        # 10b2d7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a192>
 10ac3ee:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax
 10ac3f2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ac3f5:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10ac3f8:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac3ff:	00
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
```
### `0x10ac3a0` — wrapper field writes begin

```text
 10ac358:	e8 f2 f4 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac35d:	84 c0                	test   al,al
 10ac35f:	0f 84 fe 00 00 00    	je     10ac463 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273879>
 10ac365:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac36c:	00
 10ac36d:	e8 be a9 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac372:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10ac377:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac37a:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ac37d:	49 89 c6             	mov    r14,rax
 10ac380:	49 8b 07             	mov    rax,QWORD PTR [r15]
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
 10ac3cd:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]
 10ac3d1:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac3d8:	00
 10ac3d9:	4c 89 3a             	mov    QWORD PTR [rdx],r15
 10ac3dc:	48 8d 05 81 00 9d ff 	lea    rax,[rip+0xffffffffff9d0081]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac3e3:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
 10ac3e7:	48 8d 05 8e 69 00 00 	lea    rax,[rip+0x698e]        # 10b2d7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a192>
 10ac3ee:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax
 10ac3f2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ac3f5:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10ac3f8:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac3ff:	00
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
```
### `0x10ac3b0` — wrapper+0x18 = allocated_0x150

```text
 10ac36c:	00
 10ac36d:	e8 be a9 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac372:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10ac377:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac37a:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ac37d:	49 89 c6             	mov    r14,rax
 10ac380:	49 8b 07             	mov    rax,QWORD PTR [r15]
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
 10ac3cd:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]
 10ac3d1:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac3d8:	00
 10ac3d9:	4c 89 3a             	mov    QWORD PTR [rdx],r15
 10ac3dc:	48 8d 05 81 00 9d ff 	lea    rax,[rip+0xffffffffff9d0081]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac3e3:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
 10ac3e7:	48 8d 05 8e 69 00 00 	lea    rax,[rip+0x698e]        # 10b2d7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a192>
 10ac3ee:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax
 10ac3f2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ac3f5:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10ac3f8:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac3ff:	00
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
```
### `0x10ac3b4` — post-wrapper code starts

```text
 10ac36d:	e8 be a9 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac372:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10ac377:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac37a:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ac37d:	49 89 c6             	mov    r14,rax
 10ac380:	49 8b 07             	mov    rax,QWORD PTR [r15]
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
 10ac3cd:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]
 10ac3d1:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac3d8:	00
 10ac3d9:	4c 89 3a             	mov    QWORD PTR [rdx],r15
 10ac3dc:	48 8d 05 81 00 9d ff 	lea    rax,[rip+0xffffffffff9d0081]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac3e3:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
 10ac3e7:	48 8d 05 8e 69 00 00 	lea    rax,[rip+0x698e]        # 10b2d7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a192>
 10ac3ee:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax
 10ac3f2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ac3f5:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10ac3f8:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac3ff:	00
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
```
### `0x184d0a0` — AP/literal written into wrapper_0x80

```text
 17f0d6b:	e9 d0 d0 ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
 17f0d70:	ff 25 42 2d 0c 00    	jmp    QWORD PTR [rip+0xc2d42]        # 18b3ab8 <cos@LIBC>
 17f0d76:	68 f2 02 00 00       	push   0x2f2
 17f0d7b:	e9 c0 d0 ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
 17f0d80:	ff 25 3a 2d 0c 00    	jmp    QWORD PTR [rip+0xc2d3a]        # 18b3ac0 <exp2@LIBC>
 17f0d86:	68 f3 02 00 00       	push   0x2f3
 17f0d8b:	e9 b0 d0 ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
 17f0d90:	ff 25 32 2d 0c 00    	jmp    QWORD PTR [rip+0xc2d32]        # 18b3ac8 <dl_iterate_phdr@LIBC>
 17f0d96:	68 f4 02 00 00       	push   0x2f4
 17f0d9b:	e9 a0 d0 ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
 17f0da0:	ff 25 2a 2d 0c 00    	jmp    QWORD PTR [rip+0xc2d2a]        # 18b3ad0 <pthread_rwlock_unlock@LIBC>
 17f0da6:	68 f5 02 00 00       	push   0x2f5
 17f0dab:	e9 90 d0 ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
 17f0db0:	ff 25 22 2d 0c 00    	jmp    QWORD PTR [rip+0xc2d22]        # 18b3ad8 <pthread_rwlock_rdlock@LIBC>
 17f0db6:	68 f6 02 00 00       	push   0x2f6
 17f0dbb:	e9 80 d0 ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
 17f0dc0:	ff 25 1a 2d 0c 00    	jmp    QWORD PTR [rip+0xc2d1a]        # 18b3ae0 <pthread_rwlock_wrlock@LIBC>
 17f0dc6:	68 f7 02 00 00       	push   0x2f7
 17f0dcb:	e9 70 d0 ff ff       	jmp    17ede40 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19c61>
```
## Targeted xrefs

### `184d0a0` xrefs (2)

#### xref at `0x10ac399`

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
 10ac3cd:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]
 10ac3d1:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
```
#### xref at `0x10b3658`

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
 10b3687:	48 89 df             	mov    rdi,rbx
 10b368a:	5b                   	pop    rbx
```
### `184d898` xrefs (2)

#### xref at `0x10ac180`

```text
 10ac165:	00
 10ac166:	4d 89 65 00          	mov    QWORD PTR [r13+0x0],r12
 10ac16a:	48 8d 05 69 78 a1 ff 	lea    rax,[rip+0xffffffffffa17869]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
 10ac171:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
 10ac175:	48 8d 05 9a 1a 00 00 	lea    rax,[rip+0x1a9a]        # 10adc16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27502c>
 10ac17c:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
 10ac180:	48 8d 05 11 17 7a 00 	lea    rax,[rip+0x7a1711]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>
 10ac187:	49 89 06             	mov    QWORD PTR [r14],rax
 10ac18a:	4c 89 f7             	mov    rdi,r14
 10ac18d:	48 83 c7 08          	add    rdi,0x8
 10ac191:	4c 89 ee             	mov    rsi,r13
 10ac194:	e8 91 54 fc ff       	call   107162a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a40>
 10ac199:	4c 89 ef             	mov    rdi,r13
 10ac19c:	e8 b1 5a d3 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 10ac1a1:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 10ac1a6:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10ac1a9:	4c 89 30             	mov    QWORD PTR [rax],r14
 10ac1ac:	48 85 ff             	test   rdi,rdi
 10ac1af:	74 06                	je     10ac1b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2735cd>
 10ac1b1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
```
#### xref at `0x10bff2c`

```text
 10bff19:	48 89 df             	mov    rdi,rbx
 10bff1c:	5b                   	pop    rbx
 10bff1d:	e9 fe df 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10bff22:	48 83 c7 18          	add    rdi,0x18
 10bff26:	e9 ff dd fe ff       	jmp    10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10bff2b:	cc                   	int3
 10bff2c:	48 8d 05 65 d9 78 00 	lea    rax,[rip+0x78d965]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>
 10bff33:	48 89 07             	mov    QWORD PTR [rdi],rax
 10bff36:	48 83 c7 08          	add    rdi,0x8
 10bff3a:	e9 13 1d d2 ff       	jmp    de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 10bff3f:	cc                   	int3
 10bff40:	53                   	push   rbx
 10bff41:	48 89 fb             	mov    rbx,rdi
 10bff44:	e8 e3 ff ff ff       	call   10bff2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287342>
 10bff49:	48 89 df             	mov    rdi,rbx
 10bff4c:	5b                   	pop    rbx
 10bff4d:	e9 ce df 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10bff52:	41 56                	push   r14
 10bff54:	53                   	push   rbx
 10bff55:	48 83 ec 28          	sub    rsp,0x28
```
### `184d808` xrefs (1)

#### xref at `0x10ac24e`

```text
 10ac235:	89 c5                	mov    ebp,eax
 10ac237:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac23e:	00
 10ac23f:	e8 ec aa 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac244:	bf 50 01 00 00       	mov    edi,0x150
 10ac249:	e8 b2 1c 74 00       	call   17edf00 <_Znwm@plt>
 10ac24e:	48 8d 0d b3 15 7a 00 	lea    rcx,[rip+0x7a15b3]        # 184d808 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9ef0>
 10ac255:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac258:	48 8d 90 90 00 00 00 	lea    rdx,[rax+0x90]
 10ac25f:	0f 57 c0             	xorps  xmm0,xmm0
 10ac262:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
 10ac266:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
 10ac26a:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
 10ac26e:	0f 11 40 38          	movups XMMWORD PTR [rax+0x38],xmm0
 10ac272:	0f 11 40 48          	movups XMMWORD PTR [rax+0x48],xmm0
 10ac276:	0f 11 40 58          	movups XMMWORD PTR [rax+0x58],xmm0
 10ac27a:	0f 11 40 68          	movups XMMWORD PTR [rax+0x68],xmm0
 10ac27e:	0f 11 40 78          	movups XMMWORD PTR [rax+0x78],xmm0
 10ac282:	48 8d 0d 57 26 76 00 	lea    rcx,[rip+0x762657]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
 10ac289:	48 89 88 90 00 00 00 	mov    QWORD PTR [rax+0x90],rcx
```
### `187e260` xrefs (2)

#### xref at `0x10ac1bf`

```text
 10ac1af:	74 06                	je     10ac1b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2735cd>
 10ac1b1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac1b4:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10ac1b7:	6a 58                	push   0x58
 10ac1b9:	5f                   	pop    rdi
 10ac1ba:	e8 41 1d 74 00       	call   17edf00 <_Znwm@plt>
 10ac1bf:	48 8d 0d 9a 20 7d 00 	lea    rcx,[rip+0x7d209a]        # 187e260 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3a948>
 10ac1c6:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac1c9:	31 ed                	xor    ebp,ebp
 10ac1cb:	40 88 68 08          	mov    BYTE PTR [rax+0x8],bpl
 10ac1cf:	40 88 68 38          	mov    BYTE PTR [rax+0x38],bpl
 10ac1d3:	40 88 68 40          	mov    BYTE PTR [rax+0x40],bpl
 10ac1d7:	0f 57 c0             	xorps  xmm0,xmm0
 10ac1da:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
 10ac1e1:	00
 10ac1e2:	0f 11 40 48          	movups XMMWORD PTR [rax+0x48],xmm0
 10ac1e6:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 10ac1eb:	4c 8b 28             	mov    r13,QWORD PTR [rax]
 10ac1ee:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 10ac1f3:	48 8b 30             	mov    rsi,QWORD PTR [rax]
```
#### xref at `0x153c9f0`

```text
 153c9e1:	e8 bf d0 53 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 153c9e6:	40 88 77 40          	mov    BYTE PTR [rdi+0x40],sil
 153c9ea:	c3                   	ret
 153c9eb:	cc                   	int3
 153c9ec:	53                   	push   rbx
 153c9ed:	48 89 fb             	mov    rbx,rdi
 153c9f0:	48 8d 05 69 18 34 00 	lea    rax,[rip+0x341869]        # 187e260 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3a948>
 153c9f7:	48 89 07             	mov    QWORD PTR [rdi],rax
 153c9fa:	48 8b 7f 50          	mov    rdi,QWORD PTR [rdi+0x50]
 153c9fe:	e8 af 1a 56 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 153ca03:	48 83 c3 08          	add    rbx,0x8
 153ca07:	48 89 df             	mov    rdi,rbx
 153ca0a:	5b                   	pop    rbx
 153ca0b:	e9 3c 1a b8 ff       	jmp    10be44c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285862>
 153ca10:	53                   	push   rbx
 153ca11:	48 89 fb             	mov    rbx,rdi
 153ca14:	e8 d3 ff ff ff       	call   153c9ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x381f70>
 153ca19:	48 89 df             	mov    rdi,rbx
 153ca1c:	5b                   	pop    rbx
 153ca1d:	e9 fe 14 2b 00       	jmp    17edf20 <_ZdlPv@plt>
```
### `184da88` xrefs (2)

#### xref at `0x10ad68d`

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
 10ad6c1:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
 10ad6c6:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
```
#### xref at `0x10c09ca`

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
 10c09f6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10c09f9:	ff 50 48             	call   QWORD PTR [rax+0x48]
```
### `184ca90` xrefs (2)

#### xref at `0x10aba74`

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
 10abaa7:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
 10abaab:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
```
#### xref at `0x10ae15a`

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
 10ae191:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
 10ae195:	e8 e2 0f ac ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
```
### `10ac391` xrefs (1)

#### xref at `0x10ac391`

```text
 10ac37d:	49 89 c6             	mov    r14,rax
 10ac380:	49 8b 07             	mov    rax,QWORD PTR [r15]
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
### `10ac3a0` xrefs (1)

#### xref at `0x10ac3a0`

```text
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
 10ac3cd:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]
 10ac3d1:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac3d8:	00
```
### `10ac3b0` xrefs (1)

#### xref at `0x10ac3b0`

```text
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
 10ac3cd:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]
 10ac3d1:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac3d8:	00
 10ac3d9:	4c 89 3a             	mov    QWORD PTR [rdx],r15
 10ac3dc:	48 8d 05 81 00 9d ff 	lea    rax,[rip+0xffffffffff9d0081]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac3e3:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
 10ac3e7:	48 8d 05 8e 69 00 00 	lea    rax,[rip+0x698e]        # 10b2d7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a192>
```
## Preliminary interpretation checklist

- `wrapper_0x80` is allocated at `10ac391`, receives AP/literal `0x184d0a0`, then stores both `vtable+0x28` return values and the `allocated_0x150` timer/state object.
- The important next semantic edge is the first store/call after `10ac3b0` that consumes `wrapper_0x80`; this report keeps the tail visible to avoid following generic helper paths blindly.
- If `0x184d0a0` has only constructor xrefs and no relocation-resolved vtable entries, continue with xref/constructor-based resolution, not raw table interpretation.
- Check whether the wrapper, or one of `wrapper+0x08`, `wrapper+0x10`, `wrapper+0x18`, flows into the object returned by `b411a4` (`child+0x18`).
