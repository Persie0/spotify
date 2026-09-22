# Restrictions side paths: `[rsp+0x70]`, `[rsp+0x40]`, `wrapper_0xd8/AP 0x184d9a8`

Parallel v7 report. Focus: all known side paths that are not the direct `b411a4 -> child+0x18` getter value but may feed broader construction.

## Constructor-tail filtered side-path signals

| addr | instruction |
|---:|---|
| `0x10ac372` | `10ac372:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10ac38c` | `10ac38c:	bf 80 00 00 00       	mov    edi,0x80` |
| `0x10ac399` | `10ac399:	48 8d 05 00 0d 7a 00 	lea    rax,[rip+0x7a0d00]        # 184d0a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9788>` |
| `0x10ac454` | `10ac454:	4c 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],r15` |
| `0x10ac478` | `10ac478:	48 8d 0d 71 0d 7a 00 	lea    rcx,[rip+0x7a0d71]        # 184d1f0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x98d8>` |
| `0x10ac47f` | `10ac47f:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax` |
| `0x10ac4e4` | `10ac4e4:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10ac4ec` | `10ac4ec:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ac4f2` | `10ac4f2:	bf d8 00 00 00       	mov    edi,0xd8` |
| `0x10ac4fc` | `10ac4fc:	48 8d 0d a5 14 7a 00 	lea    rcx,[rip+0x7a14a5]        # 184d9a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa090>` |
| `0x10ac824` | `10ac824:	4c 8d b4 24 d8 00 00 	lea    r14,[rsp+0xd8]` |
| `0x10acb2d` | `10acb2d:	4c 8d b4 24 d8 00 00 	lea    r14,[rsp+0xd8]` |
| `0x10acca5` | `10acca5:	49 81 c5 d8 00 00 00 	add    r13,0xd8` |
| `0x10acd33` | `10acd33:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10acdad` | `10acdad:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10acf8d` | `10acf8d:	88 44 24 40          	mov    BYTE PTR [rsp+0x40],al` |
| `0x10ad163` | `10ad163:	0f b6 44 24 40       	movzx  eax,BYTE PTR [rsp+0x40]` |
| `0x10ad18d` | `10ad18d:	66 0f 7f 44 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm0` |
| `0x10ad1ed` | `10ad1ed:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]` |
| `0x10ad247` | `10ad247:	48 89 85 80 00 00 00 	mov    QWORD PTR [rbp+0x80],rax` |
| `0x10ad2a7` | `10ad2a7:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi` |
| `0x10ad5a2` | `10ad5a2:	4c 8b bc 24 80 00 00 	mov    r15,QWORD PTR [rsp+0x80]` |
| `0x10ad69b` | `10ad69b:	48 8b 4c 24 70       	mov    rcx,QWORD PTR [rsp+0x70]` |
| `0x10ad6b5` | `10ad6b5:	48 8b 8c 24 80 00 00 	mov    rcx,QWORD PTR [rsp+0x80]` |
| `0x10ad787` | `10ad787:	e9 c3 03 00 00       	jmp    10adb4f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f65>` |
| `0x10ad8ac` | `10ad8ac:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10ad8ec` | `10ad8ec:	e9 5e 02 00 00       	jmp    10adb4f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f65>` |
| `0x10adb4f` | `10adb4f:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]` |
| `0x10adb65` | `10adb65:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]` |

## `wrapper_0xd8 creation` `0x10ac4f7`

```text
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
```
## `[rsp+0x70] late read` `0x10ad69b`

```text
 10ad62a:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10ad62d:	0f 28 84 24 f0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xf0]
 10ad634:	00
 10ad635:	0f 57 c9             	xorps  xmm1,xmm1
 10ad638:	0f 29 8c 24 f0 00 00 	movaps XMMWORD PTR [rsp+0xf0],xmm1
 10ad63f:	00
 10ad640:	49 8b 7c 24 38       	mov    rdi,QWORD PTR [r12+0x38]
 10ad645:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0
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
 10ad7ef:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad7f6:	00
 10ad7f7:	e8 ec cf 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10ad7fc:	4c 89 ef             	mov    rdi,r13
 10ad7ff:	e8 42 3f 71 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
 10ad804:	48 89 ef             	mov    rdi,rbp
 10ad807:	e8 5a c6 72 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 10ad80c:	4c 89 e7             	mov    rdi,r12
 10ad80f:	e8 1c 0c 00 00       	call   10ae430 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275846>
 10ad814:	4c 89 f7             	mov    rdi,r14
 10ad817:	e8 04 07 74 00       	call   17edf20 <_ZdlPv@plt>
 10ad81c:	e9 e8 02 00 00       	jmp    10adb09 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f1f>
 10ad821:	e9 e0 02 00 00       	jmp    10adb06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f1c>
 10ad826:	eb 18                	jmp    10ad840 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c56>
 10ad828:	48 89 c3             	mov    rbx,rax
 10ad82b:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad832:	00
 10ad833:	e8 66 9a 9f ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
 10ad838:	48 89 df             	mov    rdi,rbx
 10ad83b:	e8 65 c2 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
```
## `[rsp+0x70] cleanup/read` `0x10adb4f`

```text
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
 10adc86:	48 89 37             	mov    QWORD PTR [rdi],rsi
 10adc89:	48 85 db             	test   rbx,rbx
 10adc8c:	74 12                	je     10adca0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750b6>
 10adc8e:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
 10adc92:	e8 19 46 00 00       	call   10b22b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2796c6>
 10adc97:	48 89 df             	mov    rdi,rbx
 10adc9a:	5b                   	pop    rbx
 10adc9b:	e9 80 02 74 00       	jmp    17edf20 <_ZdlPv@plt>
 10adca0:	5b                   	pop    rbx
 10adca1:	c3                   	ret
 10adca2:	31 f6                	xor    esi,esi
 10adca4:	e9 d9 ff ff ff       	jmp    10adc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275098>
 10adca9:	cc                   	int3
 10adcaa:	53                   	push   rbx
 10adcab:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 10adcae:	48 89 37             	mov    QWORD PTR [rdi],rsi
 10adcb1:	48 85 db             	test   rbx,rbx
 10adcb4:	74 11                	je     10adcc7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750dd>
 10adcb6:	48 89 df             	mov    rdi,rbx
 10adcb9:	e8 96 08 00 00       	call   10ae554 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27596a>
```
## `[rsp+0x40] late receiver 1` `0x10acd33`

```text
 10accc4:	4c 89 ef             	mov    rdi,r13
 10accc7:	48 89 ee             	mov    rsi,rbp
 10accca:	e8 6f cd 72 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
 10acccf:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
 10accd3:	e8 ae 17 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10accd8:	4c 89 ff             	mov    rdi,r15
 10accdb:	e8 08 db 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10acce0:	41 88 9e e8 00 00 00 	mov    BYTE PTR [r14+0xe8],bl
 10acce7:	0f 57 c0             	xorps  xmm0,xmm0
 10accea:	41 0f 11 86 f0 00 00 	movups XMMWORD PTR [r14+0xf0],xmm0
 10accf1:	00
 10accf2:	41 0f 11 86 00 01 00 	movups XMMWORD PTR [r14+0x100],xmm0
 10accf9:	00
 10accfa:	41 c7 86 10 01 00 00 	mov    DWORD PTR [r14+0x110],0x3f800000
 10acd01:	00 00 80 3f
 10acd05:	41 0f 11 86 18 01 00 	movups XMMWORD PTR [r14+0x118],xmm0
 10acd0c:	00
 10acd0d:	41 0f 11 86 28 01 00 	movups XMMWORD PTR [r14+0x128],xmm0
 10acd14:	00
 10acd15:	41 0f 11 86 38 01 00 	movups XMMWORD PTR [r14+0x138],xmm0
 10acd1c:	00
 10acd1d:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
 10acd22:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10acd25:	4c 89 30             	mov    QWORD PTR [rax],r14
 10acd28:	48 85 ff             	test   rdi,rdi
 10acd2b:	74 06                	je     10acd33 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274149>
 10acd2d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10acd30:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10acd33:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10acd38:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10acd3b:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10acd3e:	49 89 c6             	mov    r14,rax
 10acd41:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
 10acd46:	48 8b 18             	mov    rbx,QWORD PTR [rax]
 10acd49:	6a 50                	push   0x50
 10acd4b:	5f                   	pop    rdi
 10acd4c:	e8 af 11 74 00       	call   17edf00 <_Znwm@plt>
 10acd51:	48 8d 0d b8 01 7a 00 	lea    rcx,[rip+0x7a01b8]        # 184cf10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x95f8>
 10acd58:	48 89 08             	mov    QWORD PTR [rax],rcx
 10acd5b:	48 8d 0d 5e 02 7a 00 	lea    rcx,[rip+0x7a025e]        # 184cfc0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x96a8>
 10acd62:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 10acd66:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
 10acd6a:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx
 10acd6e:	48 8b 9c 24 e8 01 00 	mov    rbx,QWORD PTR [rsp+0x1e8]
 10acd75:	00
 10acd76:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
 10acd7a:	0f 57 c0             	xorps  xmm0,xmm0
 10acd7d:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
 10acd81:	0f 11 40 38          	movups XMMWORD PTR [rax+0x38],xmm0
 10acd85:	c7 40 48 00 00 80 3f 	mov    DWORD PTR [rax+0x48],0x3f800000
 10acd8c:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10acd93:	00
 10acd94:	49 83 26 00          	and    QWORD PTR [r14],0x0
 10acd98:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
 10acd9d:	48 89 c6             	mov    rsi,rax
 10acda0:	e8 dd 0e 00 00       	call   10adc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275098>
 10acda5:	4c 89 f7             	mov    rdi,r14
 10acda8:	e8 f5 0e 00 00       	call   10adca2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750b8>
 10acdad:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10acdb2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10acdb5:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10acdb8:	49 89 c7             	mov    r15,rax
 10acdbb:	48 8b bc 24 d8 01 00 	mov    rdi,QWORD PTR [rsp+0x1d8]
 10acdc2:	00
 10acdc3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10acdc6:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10acdc9:	49 89 c5             	mov    r13,rax
 10acdcc:	bf c8 00 00 00       	mov    edi,0xc8
 10acdd1:	e8 2a 11 74 00       	call   17edf00 <_Znwm@plt>
 10acdd6:	49 89 c6             	mov    r14,rax
 10acdd9:	48 8d 05 30 fd 79 00 	lea    rax,[rip+0x79fd30]        # 184cb10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x91f8>
 10acde0:	49 89 06             	mov    QWORD PTR [r14],rax
 10acde3:	48 8d 05 de fd 79 00 	lea    rax,[rip+0x79fdde]        # 184cbc8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x92b0>
 10acdea:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
 10acdee:	4d 89 7e 10          	mov    QWORD PTR [r14+0x10],r15
 10acdf2:	4d 89 6e 18          	mov    QWORD PTR [r14+0x18],r13
 10acdf6:	49 89 5e 20          	mov    QWORD PTR [r14+0x20],rbx
 10acdfa:	4d 8d 66 28          	lea    r12,[r14+0x28]
 10acdfe:	0f 57 c0             	xorps  xmm0,xmm0
 10ace01:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0
 10ace06:	41 0f 11 46 38       	movups XMMWORD PTR [r14+0x38],xmm0
 10ace0b:	41 c7 46 48 00 00 80 	mov    DWORD PTR [r14+0x48],0x3f800000
 10ace12:	3f
 10ace13:	49 8d 6e 50          	lea    rbp,[r14+0x50]
 10ace17:	48 89 ef             	mov    rdi,rbp
 10ace1a:	e8 e3 03 a1 ff       	call   abd202 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1a2>
 10ace1f:	4d 8d ae a8 00 00 00 	lea    r13,[r14+0xa8]
 10ace26:	4c 89 ef             	mov    rdi,r13
 10ace29:	48 8b b4 24 c0 01 00 	mov    rsi,QWORD PTR [rsp+0x1c0]
 10ace30:	00
 10ace31:	e8 8c 48 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 10ace36:	4c 8d 84 24 d0 00 00 	lea    r8,[rsp+0xd0]
 10ace3d:	00
 10ace3e:	4d 89 30             	mov    QWORD PTR [r8],r14
 10ace41:	48 8d 35 49 02 9f ff 	lea    rsi,[rip+0xffffffffff9f0249]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 10ace48:	48 8d 0d 5f 15 00 00 	lea    rcx,[rip+0x155f]        # 10ae3ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2757c4>
 10ace4f:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10ace56:	00
 10ace57:	6a 08                	push   0x8
 10ace59:	41 59                	pop    r9
 10ace5b:	48 89 df             	mov    rdi,rbx
 10ace5e:	31 d2                	xor    edx,edx
 10ace60:	e8 2f d9 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 10ace65:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10ace68:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 10ace6f:	00
 10ace70:	6a 01                	push   0x1
 10ace72:	5a                   	pop    rdx
 10ace73:	4c 89 fe             	mov    rsi,r15
 10ace76:	48 89 d9             	mov    rcx,rbx
 10ace79:	ff 50 48             	call   QWORD PTR [rax+0x48]
 10ace7c:	4c 89 f7             	mov    rdi,r14
 10ace7f:	48 81 c7 b8 00 00 00 	add    rdi,0xb8
 10ace86:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]
 10ace8d:	00
 10ace8e:	48 89 de             	mov    rsi,rbx
 10ace91:	e8 a8 cb 72 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
 10ace96:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 10ace9a:	e8 e7 15 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ace9f:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10acea6:	00
 10acea7:	e8 3c d9 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10aceac:	48 8d 9c 24 b8 00 00 	lea    rbx,[rsp+0xb8]
 10aceb3:	00
 10aceb4:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 10aceb8:	4c 8b bc 24 90 00 00 	mov    r15,QWORD PTR [rsp+0x90]
 10acebf:	00
 10acec0:	4c 89 ff             	mov    rdi,r15
 10acec3:	4c 89 f6             	mov    rsi,r14
 10acec6:	e8 df 0d 00 00       	call   10adcaa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750c0>
 10acecb:	48 89 df             	mov    rdi,rbx
 10acece:	e8 f7 0d 00 00       	call   10adcca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750e0>
 10aced3:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
 10aced8:	48 8b 28             	mov    rbp,QWORD PTR [rax]
 10acedb:	4d 8b 2f             	mov    r13,QWORD PTR [r15]
 10acede:	6a 38                	push   0x38
 10acee0:	5f                   	pop    rdi
 10acee1:	e8 1a 10 74 00       	call   17edf00 <_Znwm@plt>
```
## `[rsp+0x40] late receiver 2` `0x10acdad`

```text
 10acd3b:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10acd3e:	49 89 c6             	mov    r14,rax
 10acd41:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
 10acd46:	48 8b 18             	mov    rbx,QWORD PTR [rax]
 10acd49:	6a 50                	push   0x50
 10acd4b:	5f                   	pop    rdi
 10acd4c:	e8 af 11 74 00       	call   17edf00 <_Znwm@plt>
 10acd51:	48 8d 0d b8 01 7a 00 	lea    rcx,[rip+0x7a01b8]        # 184cf10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x95f8>
 10acd58:	48 89 08             	mov    QWORD PTR [rax],rcx
 10acd5b:	48 8d 0d 5e 02 7a 00 	lea    rcx,[rip+0x7a025e]        # 184cfc0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x96a8>
 10acd62:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 10acd66:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
 10acd6a:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx
 10acd6e:	48 8b 9c 24 e8 01 00 	mov    rbx,QWORD PTR [rsp+0x1e8]
 10acd75:	00
 10acd76:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
 10acd7a:	0f 57 c0             	xorps  xmm0,xmm0
 10acd7d:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
 10acd81:	0f 11 40 38          	movups XMMWORD PTR [rax+0x38],xmm0
 10acd85:	c7 40 48 00 00 80 3f 	mov    DWORD PTR [rax+0x48],0x3f800000
 10acd8c:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10acd93:	00
 10acd94:	49 83 26 00          	and    QWORD PTR [r14],0x0
 10acd98:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
 10acd9d:	48 89 c6             	mov    rsi,rax
 10acda0:	e8 dd 0e 00 00       	call   10adc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275098>
 10acda5:	4c 89 f7             	mov    rdi,r14
 10acda8:	e8 f5 0e 00 00       	call   10adca2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750b8>
 10acdad:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10acdb2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10acdb5:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10acdb8:	49 89 c7             	mov    r15,rax
 10acdbb:	48 8b bc 24 d8 01 00 	mov    rdi,QWORD PTR [rsp+0x1d8]
 10acdc2:	00
 10acdc3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10acdc6:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10acdc9:	49 89 c5             	mov    r13,rax
 10acdcc:	bf c8 00 00 00       	mov    edi,0xc8
 10acdd1:	e8 2a 11 74 00       	call   17edf00 <_Znwm@plt>
 10acdd6:	49 89 c6             	mov    r14,rax
 10acdd9:	48 8d 05 30 fd 79 00 	lea    rax,[rip+0x79fd30]        # 184cb10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x91f8>
 10acde0:	49 89 06             	mov    QWORD PTR [r14],rax
 10acde3:	48 8d 05 de fd 79 00 	lea    rax,[rip+0x79fdde]        # 184cbc8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x92b0>
 10acdea:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
 10acdee:	4d 89 7e 10          	mov    QWORD PTR [r14+0x10],r15
 10acdf2:	4d 89 6e 18          	mov    QWORD PTR [r14+0x18],r13
 10acdf6:	49 89 5e 20          	mov    QWORD PTR [r14+0x20],rbx
 10acdfa:	4d 8d 66 28          	lea    r12,[r14+0x28]
 10acdfe:	0f 57 c0             	xorps  xmm0,xmm0
 10ace01:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0
 10ace06:	41 0f 11 46 38       	movups XMMWORD PTR [r14+0x38],xmm0
 10ace0b:	41 c7 46 48 00 00 80 	mov    DWORD PTR [r14+0x48],0x3f800000
 10ace12:	3f
 10ace13:	49 8d 6e 50          	lea    rbp,[r14+0x50]
 10ace17:	48 89 ef             	mov    rdi,rbp
 10ace1a:	e8 e3 03 a1 ff       	call   abd202 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1a2>
 10ace1f:	4d 8d ae a8 00 00 00 	lea    r13,[r14+0xa8]
 10ace26:	4c 89 ef             	mov    rdi,r13
 10ace29:	48 8b b4 24 c0 01 00 	mov    rsi,QWORD PTR [rsp+0x1c0]
 10ace30:	00
 10ace31:	e8 8c 48 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 10ace36:	4c 8d 84 24 d0 00 00 	lea    r8,[rsp+0xd0]
 10ace3d:	00
 10ace3e:	4d 89 30             	mov    QWORD PTR [r8],r14
 10ace41:	48 8d 35 49 02 9f ff 	lea    rsi,[rip+0xffffffffff9f0249]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 10ace48:	48 8d 0d 5f 15 00 00 	lea    rcx,[rip+0x155f]        # 10ae3ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2757c4>
 10ace4f:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10ace56:	00
 10ace57:	6a 08                	push   0x8
 10ace59:	41 59                	pop    r9
 10ace5b:	48 89 df             	mov    rdi,rbx
 10ace5e:	31 d2                	xor    edx,edx
 10ace60:	e8 2f d9 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 10ace65:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10ace68:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 10ace6f:	00
 10ace70:	6a 01                	push   0x1
 10ace72:	5a                   	pop    rdx
 10ace73:	4c 89 fe             	mov    rsi,r15
 10ace76:	48 89 d9             	mov    rcx,rbx
 10ace79:	ff 50 48             	call   QWORD PTR [rax+0x48]
 10ace7c:	4c 89 f7             	mov    rdi,r14
 10ace7f:	48 81 c7 b8 00 00 00 	add    rdi,0xb8
 10ace86:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]
 10ace8d:	00
 10ace8e:	48 89 de             	mov    rsi,rbx
 10ace91:	e8 a8 cb 72 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
 10ace96:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 10ace9a:	e8 e7 15 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ace9f:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10acea6:	00
 10acea7:	e8 3c d9 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10aceac:	48 8d 9c 24 b8 00 00 	lea    rbx,[rsp+0xb8]
 10aceb3:	00
 10aceb4:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 10aceb8:	4c 8b bc 24 90 00 00 	mov    r15,QWORD PTR [rsp+0x90]
 10acebf:	00
 10acec0:	4c 89 ff             	mov    rdi,r15
 10acec3:	4c 89 f6             	mov    rsi,r14
 10acec6:	e8 df 0d 00 00       	call   10adcaa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750c0>
 10acecb:	48 89 df             	mov    rdi,rbx
 10acece:	e8 f7 0d 00 00       	call   10adcca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750e0>
 10aced3:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
 10aced8:	48 8b 28             	mov    rbp,QWORD PTR [rax]
 10acedb:	4d 8b 2f             	mov    r13,QWORD PTR [r15]
 10acede:	6a 38                	push   0x38
 10acee0:	5f                   	pop    rdi
 10acee1:	e8 1a 10 74 00       	call   17edf00 <_Znwm@plt>
 10acee6:	49 89 c6             	mov    r14,rax
 10acee9:	48 8d 05 f8 0b 7a 00 	lea    rax,[rip+0x7a0bf8]        # 184dae8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa1d0>
 10acef0:	49 89 06             	mov    QWORD PTR [r14],rax
 10acef3:	48 8d 05 46 0c 7a 00 	lea    rax,[rip+0x7a0c46]        # 184db40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa228>
 10acefa:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
 10acefe:	4d 89 f7             	mov    r15,r14
 10acf01:	49 83 c7 10          	add    r15,0x10
 10acf05:	0f 57 c0             	xorps  xmm0,xmm0
 10acf08:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
 10acf0d:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
 10acf12:	49 83 66 30 00       	and    QWORD PTR [r14+0x30],0x0
 10acf17:	4c 89 ff             	mov    rdi,r15
 10acf1a:	48 89 ee             	mov    rsi,rbp
 10acf1d:	e8 92 68 b2 ff       	call   bd37b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x120754>
 10acf22:	4c 89 ff             	mov    rdi,r15
 10acf25:	4c 89 ee             	mov    rsi,r13
 10acf28:	e8 87 68 b2 ff       	call   bd37b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x120754>
 10acf2d:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
 10acf32:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10acf39:	00
 10acf3a:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 10acf3e:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
 10acf45:	00
 10acf46:	4c 89 f6             	mov    rsi,r14
 10acf49:	e8 84 0d 00 00       	call   10adcd2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750e8>
 10acf4e:	48 89 df             	mov    rdi,rbx
 10acf51:	e8 9c 0d 00 00       	call   10adcf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275108>
 10acf56:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
 10acf5d:	00
 10acf5e:	e8 c3 3b 9f ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
```
## `wrapper_0xd8 AP 0x184d9a8` relocations

```text
000000000184d9a8  0000000000000008 R_X86_64_RELATIVE                         10c0806
000000000184d9b0  0000000000000008 R_X86_64_RELATIVE                         10c0854
000000000184d9b8  0000000000000008 R_X86_64_RELATIVE                         10c086a
000000000184d9c0  0000000000000008 R_X86_64_RELATIVE                         1066da0
000000000184d9c8  0000000000000008 R_X86_64_RELATIVE                         10c0872
000000000184d9d0  0000000000000008 R_X86_64_RELATIVE                         10c0902
000000000184d9d8  0000000000000008 R_X86_64_RELATIVE                         10c094a
000000000184d9e0  0000000000000008 R_X86_64_RELATIVE                         10c0962
000000000184d9e8  0000000000000008 R_X86_64_RELATIVE                         10c09ae
000000000184da00  0000000000000008 R_X86_64_RELATIVE                         9d7de0
000000000184da08  0000000000000008 R_X86_64_RELATIVE                         a50370
000000000184da10  0000000000000008 R_X86_64_RELATIVE                         aeb7c0
000000000184da18  0000000000000008 R_X86_64_RELATIVE                         10c0712
000000000184da30  0000000000000008 R_X86_64_RELATIVE                         9d81d0
000000000184da38  0000000000000008 R_X86_64_RELATIVE                         c3aab8
000000000184da40  0000000000000008 R_X86_64_RELATIVE                         10c09c0
000000000184da48  0000000000000008 R_X86_64_RELATIVE                         9d81d0
000000000184da50  0000000000000008 R_X86_64_RELATIVE                         9d7de0
000000000184da58  0000000000000008 R_X86_64_RELATIVE                         9d7de0
000000000184da60  0000000000000008 R_X86_64_RELATIVE                         bd7a10
```
### Entry `0x0` -> `0x10c0806`

```text
 10c07d5:	e8 fe cd 6f 00       	call   17bd5d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x171744>
 10c07da:	eb c0                	jmp    10c079c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287bb2>
 10c07dc:	48 89 c3             	mov    rbx,rax
 10c07df:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c07e4:	e8 a7 d6 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10c07e9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10c07f0:	00 00
 10c07f2:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 10c07f7:	75 08                	jne    10c0801 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287c17>
 10c07f9:	48 89 df             	mov    rdi,rbx
 10c07fc:	e8 cf f4 9a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10c0801:	e8 aa f2 72 00       	call   17efab0 <__stack_chk_fail@plt>
 10c0806:	53                   	push   rbx
 10c0807:	80 7f 18 00          	cmp    BYTE PTR [rdi+0x18],0x0
 10c080b:	74 42                	je     10c084f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287c65>
 10c080d:	48 89 fb             	mov    rbx,rdi
 10c0810:	80 7f 70 00          	cmp    BYTE PTR [rdi+0x70],0x0
 10c0814:	74 29                	je     10c083f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287c55>
 10c0816:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
 10c081a:	48 8d 73 58          	lea    rsi,[rbx+0x58]
 10c081e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10c0821:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10c0824:	48 3d 30 75 00 00    	cmp    rax,0x7530
 10c082a:	7c 13                	jl     10c083f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287c55>
 10c082c:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 10c0830:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
 10c0833:	48 8b 49 28          	mov    rcx,QWORD PTR [rcx+0x28]
 10c0837:	31 f6                	xor    esi,esi
 10c0839:	48 89 c2             	mov    rdx,rax
 10c083c:	5b                   	pop    rbx
 10c083d:	ff e1                	jmp    rcx
 10c083f:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 10c0843:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10c0846:	48 8b 40 30          	mov    rax,QWORD PTR [rax+0x30]
 10c084a:	31 f6                	xor    esi,esi
 10c084c:	5b                   	pop    rbx
 10c084d:	ff e0                	jmp    rax
 10c084f:	31 c0                	xor    eax,eax
 10c0851:	5b                   	pop    rbx
 10c0852:	c3                   	ret
 10c0853:	cc                   	int3
 10c0854:	53                   	push   rbx
 10c0855:	48 89 fb             	mov    rbx,rdi
 10c0858:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]
 10c085c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10c085f:	31 d2                	xor    edx,edx
 10c0861:	ff 50 38             	call   QWORD PTR [rax+0x38]
 10c0864:	48 89 d8             	mov    rax,rbx
 10c0867:	5b                   	pop    rbx
 10c0868:	c3                   	ret
 10c0869:	cc                   	int3
 10c086a:	40 88 77 18          	mov    BYTE PTR [rdi+0x18],sil
 10c086e:	b0 01                	mov    al,0x1
 10c0870:	c3                   	ret
 10c0871:	cc                   	int3
 10c0872:	41 57                	push   r15
 10c0874:	41 56                	push   r14
 10c0876:	41 54                	push   r12
 10c0878:	53                   	push   rbx
 10c0879:	50                   	push   rax
 10c087a:	48 89 d3             	mov    rbx,rdx
 10c087d:	49 89 f7             	mov    r15,rsi
 10c0880:	49 89 fe             	mov    r14,rdi
 10c0883:	4c 8d 67 40          	lea    r12,[rdi+0x40]
 10c0887:	48 89 f7             	mov    rdi,rsi
 10c088a:	4c 89 e6             	mov    rsi,r12
```
### Entry `0x8` -> `0x10c0854`

```text
 10c083c:	5b                   	pop    rbx
 10c083d:	ff e1                	jmp    rcx
 10c083f:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 10c0843:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10c0846:	48 8b 40 30          	mov    rax,QWORD PTR [rax+0x30]
 10c084a:	31 f6                	xor    esi,esi
 10c084c:	5b                   	pop    rbx
 10c084d:	ff e0                	jmp    rax
 10c084f:	31 c0                	xor    eax,eax
 10c0851:	5b                   	pop    rbx
 10c0852:	c3                   	ret
 10c0853:	cc                   	int3
 10c0854:	53                   	push   rbx
 10c0855:	48 89 fb             	mov    rbx,rdi
 10c0858:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]
 10c085c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10c085f:	31 d2                	xor    edx,edx
 10c0861:	ff 50 38             	call   QWORD PTR [rax+0x38]
 10c0864:	48 89 d8             	mov    rax,rbx
 10c0867:	5b                   	pop    rbx
 10c0868:	c3                   	ret
 10c0869:	cc                   	int3
 10c086a:	40 88 77 18          	mov    BYTE PTR [rdi+0x18],sil
 10c086e:	b0 01                	mov    al,0x1
 10c0870:	c3                   	ret
 10c0871:	cc                   	int3
 10c0872:	41 57                	push   r15
 10c0874:	41 56                	push   r14
 10c0876:	41 54                	push   r12
 10c0878:	53                   	push   rbx
 10c0879:	50                   	push   rax
 10c087a:	48 89 d3             	mov    rbx,rdx
 10c087d:	49 89 f7             	mov    r15,rsi
 10c0880:	49 89 fe             	mov    r14,rdi
 10c0883:	4c 8d 67 40          	lea    r12,[rdi+0x40]
 10c0887:	48 89 f7             	mov    rdi,rsi
 10c088a:	4c 89 e6             	mov    rsi,r12
 10c088d:	e8 5c ee 9d ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
 10c0892:	84 c0                	test   al,al
 10c0894:	74 07                	je     10c089d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287cb3>
 10c0896:	41 80 7e 70 00       	cmp    BYTE PTR [r14+0x70],0x0
 10c089b:	74 30                	je     10c08cd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287ce3>
 10c089d:	4c 89 ff             	mov    rdi,r15
 10c08a0:	4c 89 e6             	mov    rsi,r12
 10c08a3:	e8 46 ee 9d ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
 10c08a8:	84 c0                	test   al,al
 10c08aa:	74 0c                	je     10c08b8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287cce>
 10c08ac:	48 83 c4 08          	add    rsp,0x8
 10c08b0:	5b                   	pop    rbx
 10c08b1:	41 5c                	pop    r12
 10c08b3:	41 5e                	pop    r14
 10c08b5:	41 5f                	pop    r15
 10c08b7:	c3                   	ret
 10c08b8:	49 8d 7e 78          	lea    rdi,[r14+0x78]
 10c08bc:	4c 89 fe             	mov    rsi,r15
 10c08bf:	e8 76 1a a4 ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
 10c08c4:	49 81 c6 b8 00 00 00 	add    r14,0xb8
 10c08cb:	eb 1e                	jmp    10c08eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287d01>
 10c08cd:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10c08d1:	49 8d 76 58          	lea    rsi,[r14+0x58]
 10c08d5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10c08d8:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10c08db:	49 89 46 68          	mov    QWORD PTR [r14+0x68],rax
 10c08df:	41 c6 46 70 01       	mov    BYTE PTR [r14+0x70],0x1
 10c08e4:	49 81 c6 98 00 00 00 	add    r14,0x98
 10c08eb:	4c 89 f7             	mov    rdi,r14
```
### Entry `0x10` -> `0x10c086a`

```text
 10c0852:	c3                   	ret
 10c0853:	cc                   	int3
 10c0854:	53                   	push   rbx
 10c0855:	48 89 fb             	mov    rbx,rdi
 10c0858:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]
 10c085c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10c085f:	31 d2                	xor    edx,edx
 10c0861:	ff 50 38             	call   QWORD PTR [rax+0x38]
 10c0864:	48 89 d8             	mov    rax,rbx
 10c0867:	5b                   	pop    rbx
 10c0868:	c3                   	ret
 10c0869:	cc                   	int3
 10c086a:	40 88 77 18          	mov    BYTE PTR [rdi+0x18],sil
 10c086e:	b0 01                	mov    al,0x1
 10c0870:	c3                   	ret
 10c0871:	cc                   	int3
 10c0872:	41 57                	push   r15
 10c0874:	41 56                	push   r14
 10c0876:	41 54                	push   r12
 10c0878:	53                   	push   rbx
 10c0879:	50                   	push   rax
 10c087a:	48 89 d3             	mov    rbx,rdx
 10c087d:	49 89 f7             	mov    r15,rsi
 10c0880:	49 89 fe             	mov    r14,rdi
 10c0883:	4c 8d 67 40          	lea    r12,[rdi+0x40]
 10c0887:	48 89 f7             	mov    rdi,rsi
 10c088a:	4c 89 e6             	mov    rsi,r12
 10c088d:	e8 5c ee 9d ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
 10c0892:	84 c0                	test   al,al
 10c0894:	74 07                	je     10c089d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287cb3>
 10c0896:	41 80 7e 70 00       	cmp    BYTE PTR [r14+0x70],0x0
 10c089b:	74 30                	je     10c08cd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287ce3>
 10c089d:	4c 89 ff             	mov    rdi,r15
 10c08a0:	4c 89 e6             	mov    rsi,r12
 10c08a3:	e8 46 ee 9d ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
 10c08a8:	84 c0                	test   al,al
 10c08aa:	74 0c                	je     10c08b8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287cce>
 10c08ac:	48 83 c4 08          	add    rsp,0x8
 10c08b0:	5b                   	pop    rbx
 10c08b1:	41 5c                	pop    r12
 10c08b3:	41 5e                	pop    r14
 10c08b5:	41 5f                	pop    r15
 10c08b7:	c3                   	ret
 10c08b8:	49 8d 7e 78          	lea    rdi,[r14+0x78]
 10c08bc:	4c 89 fe             	mov    rsi,r15
 10c08bf:	e8 76 1a a4 ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
 10c08c4:	49 81 c6 b8 00 00 00 	add    r14,0xb8
 10c08cb:	eb 1e                	jmp    10c08eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287d01>
 10c08cd:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10c08d1:	49 8d 76 58          	lea    rsi,[r14+0x58]
 10c08d5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10c08d8:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10c08db:	49 89 46 68          	mov    QWORD PTR [r14+0x68],rax
 10c08df:	41 c6 46 70 01       	mov    BYTE PTR [r14+0x70],0x1
 10c08e4:	49 81 c6 98 00 00 00 	add    r14,0x98
 10c08eb:	4c 89 f7             	mov    rdi,r14
 10c08ee:	48 89 de             	mov    rsi,rbx
 10c08f1:	48 83 c4 08          	add    rsp,0x8
 10c08f5:	5b                   	pop    rbx
 10c08f6:	41 5c                	pop    r12
 10c08f8:	41 5e                	pop    r14
 10c08fa:	41 5f                	pop    r15
 10c08fc:	e9 39 1a a4 ff       	jmp    b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
 10c0901:	cc                   	int3
 10c0902:	41 56                	push   r14
 10c0904:	53                   	push   rbx
```
### Entry `0x18` -> `0x1066da0`

```text
 1066d72:	48 89 df             	mov    rdi,rbx
 1066d75:	e8 56 8f a0 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 1066d7a:	e8 31 8d 78 00       	call   17efab0 <__stack_chk_fail@plt>
 1066d7f:	cc                   	int3
 1066d80:	c6 87 b8 05 00 00 01 	mov    BYTE PTR [rdi+0x5b8],0x1
 1066d87:	c6 87 40 05 00 00 00 	mov    BYTE PTR [rdi+0x540],0x0
 1066d8e:	c3                   	ret
 1066d8f:	cc                   	int3
 1066d90:	c6 87 41 05 00 00 01 	mov    BYTE PTR [rdi+0x541],0x1
 1066d97:	c3                   	ret
 1066d98:	c6 87 41 05 00 00 00 	mov    BYTE PTR [rdi+0x541],0x0
 1066d9f:	c3                   	ret
 1066da0:	8a 47 18             	mov    al,BYTE PTR [rdi+0x18]
 1066da3:	c3                   	ret
 1066da4:	53                   	push   rbx
 1066da5:	48 89 fb             	mov    rbx,rdi
 1066da8:	48 83 c6 20          	add    rsi,0x20
 1066dac:	e8 a9 68 ff ff       	call   105d65a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x224a70>
 1066db1:	48 89 d8             	mov    rax,rbx
 1066db4:	5b                   	pop    rbx
 1066db5:	c3                   	ret
 1066db6:	8b 87 b4 05 00 00    	mov    eax,DWORD PTR [rdi+0x5b4]
 1066dbc:	c3                   	ret
 1066dbd:	cc                   	int3
 1066dbe:	48 89 f8             	mov    rax,rdi
 1066dc1:	31 c9                	xor    ecx,ecx
 1066dc3:	88 0f                	mov    BYTE PTR [rdi],cl
 1066dc5:	88 4f 18             	mov    BYTE PTR [rdi+0x18],cl
 1066dc8:	c3                   	ret
 1066dc9:	cc                   	int3
 1066dca:	53                   	push   rbx
 1066dcb:	48 81 ec e0 06 00 00 	sub    rsp,0x6e0
 1066dd2:	49 89 c9             	mov    r9,rcx
 1066dd5:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 1066ddc:	00 00
 1066dde:	48 89 8c 24 d8 06 00 	mov    QWORD PTR [rsp+0x6d8],rcx
 1066de5:	00
 1066de6:	40 84 f6             	test   sil,sil
 1066de9:	75 2c                	jne    1066e17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22e22d>
 1066deb:	41 89 d0             	mov    r8d,edx
 1066dee:	48 89 f8             	mov    rax,rdi
 1066df1:	48 8d 15 18 f1 36 ff 	lea    rdx,[rip+0xffffffffff36f118]        # 3d5f10 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xaf5>
 1066df8:	48 8d 0d 21 f1 36 ff 	lea    rcx,[rip+0xffffffffff36f121]        # 3d5f20 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xb05>
 1066dff:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
 1066e04:	48 89 df             	mov    rdi,rbx
 1066e07:	48 89 c6             	mov    rsi,rax
 1066e0a:	e8 51 9b d2 ff       	call   d90960 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d9e6>
 1066e0f:	48 89 df             	mov    rdi,rbx
 1066e12:	e8 eb 43 61 00       	call   167b202 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f36e>
 1066e17:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1066e1e:	00 00
 1066e20:	48 3b 84 24 d8 06 00 	cmp    rax,QWORD PTR [rsp+0x6d8]
 1066e27:	00
 1066e28:	75 09                	jne    1066e33 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22e249>
 1066e2a:	48 81 c4 e0 06 00 00 	add    rsp,0x6e0
 1066e31:	5b                   	pop    rbx
 1066e32:	c3                   	ret
 1066e33:	e8 78 8c 78 00       	call   17efab0 <__stack_chk_fail@plt>
 1066e38:	53                   	push   rbx
 1066e39:	48 89 fb             	mov    rbx,rdi
 1066e3c:	48 8d 05 c5 15 7e 00 	lea    rax,[rip+0x7e15c5]        # 1848408 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4af0>
 1066e43:	48 89 07             	mov    QWORD PTR [rdi],rax
 1066e46:	48 81 c7 90 06 00 00 	add    rdi,0x690
 1066e4d:	e8 7e fc ff ff       	call   1066ad0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22dee6>
 1066e52:	48 8d bb 60 01 00 00 	lea    rdi,[rbx+0x160]
 1066e59:	e8 80 fc ff ff       	call   1066ade <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22def4>
```
### Entry `0x20` -> `0x10c0872`

```text
 10c0858:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]
 10c085c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10c085f:	31 d2                	xor    edx,edx
 10c0861:	ff 50 38             	call   QWORD PTR [rax+0x38]
 10c0864:	48 89 d8             	mov    rax,rbx
 10c0867:	5b                   	pop    rbx
 10c0868:	c3                   	ret
 10c0869:	cc                   	int3
 10c086a:	40 88 77 18          	mov    BYTE PTR [rdi+0x18],sil
 10c086e:	b0 01                	mov    al,0x1
 10c0870:	c3                   	ret
 10c0871:	cc                   	int3
 10c0872:	41 57                	push   r15
 10c0874:	41 56                	push   r14
 10c0876:	41 54                	push   r12
 10c0878:	53                   	push   rbx
 10c0879:	50                   	push   rax
 10c087a:	48 89 d3             	mov    rbx,rdx
 10c087d:	49 89 f7             	mov    r15,rsi
 10c0880:	49 89 fe             	mov    r14,rdi
 10c0883:	4c 8d 67 40          	lea    r12,[rdi+0x40]
 10c0887:	48 89 f7             	mov    rdi,rsi
 10c088a:	4c 89 e6             	mov    rsi,r12
 10c088d:	e8 5c ee 9d ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
 10c0892:	84 c0                	test   al,al
 10c0894:	74 07                	je     10c089d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287cb3>
 10c0896:	41 80 7e 70 00       	cmp    BYTE PTR [r14+0x70],0x0
 10c089b:	74 30                	je     10c08cd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287ce3>
 10c089d:	4c 89 ff             	mov    rdi,r15
 10c08a0:	4c 89 e6             	mov    rsi,r12
 10c08a3:	e8 46 ee 9d ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
 10c08a8:	84 c0                	test   al,al
 10c08aa:	74 0c                	je     10c08b8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287cce>
 10c08ac:	48 83 c4 08          	add    rsp,0x8
 10c08b0:	5b                   	pop    rbx
 10c08b1:	41 5c                	pop    r12
 10c08b3:	41 5e                	pop    r14
 10c08b5:	41 5f                	pop    r15
 10c08b7:	c3                   	ret
 10c08b8:	49 8d 7e 78          	lea    rdi,[r14+0x78]
 10c08bc:	4c 89 fe             	mov    rsi,r15
 10c08bf:	e8 76 1a a4 ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
 10c08c4:	49 81 c6 b8 00 00 00 	add    r14,0xb8
 10c08cb:	eb 1e                	jmp    10c08eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287d01>
 10c08cd:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10c08d1:	49 8d 76 58          	lea    rsi,[r14+0x58]
 10c08d5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10c08d8:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10c08db:	49 89 46 68          	mov    QWORD PTR [r14+0x68],rax
 10c08df:	41 c6 46 70 01       	mov    BYTE PTR [r14+0x70],0x1
 10c08e4:	49 81 c6 98 00 00 00 	add    r14,0x98
 10c08eb:	4c 89 f7             	mov    rdi,r14
 10c08ee:	48 89 de             	mov    rsi,rbx
 10c08f1:	48 83 c4 08          	add    rsp,0x8
 10c08f5:	5b                   	pop    rbx
 10c08f6:	41 5c                	pop    r12
 10c08f8:	41 5e                	pop    r14
 10c08fa:	41 5f                	pop    r15
 10c08fc:	e9 39 1a a4 ff       	jmp    b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
 10c0901:	cc                   	int3
 10c0902:	41 56                	push   r14
 10c0904:	53                   	push   rbx
 10c0905:	50                   	push   rax
 10c0906:	80 7f 18 00          	cmp    BYTE PTR [rdi+0x18],0x0
 10c090a:	74 35                	je     10c0941 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287d57>
 10c090c:	49 89 fe             	mov    r14,rdi
```
### Entry `0x28` -> `0x10c0902`

```text
 10c08db:	49 89 46 68          	mov    QWORD PTR [r14+0x68],rax
 10c08df:	41 c6 46 70 01       	mov    BYTE PTR [r14+0x70],0x1
 10c08e4:	49 81 c6 98 00 00 00 	add    r14,0x98
 10c08eb:	4c 89 f7             	mov    rdi,r14
 10c08ee:	48 89 de             	mov    rsi,rbx
 10c08f1:	48 83 c4 08          	add    rsp,0x8
 10c08f5:	5b                   	pop    rbx
 10c08f6:	41 5c                	pop    r12
 10c08f8:	41 5e                	pop    r14
 10c08fa:	41 5f                	pop    r15
 10c08fc:	e9 39 1a a4 ff       	jmp    b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
 10c0901:	cc                   	int3
 10c0902:	41 56                	push   r14
 10c0904:	53                   	push   rbx
 10c0905:	50                   	push   rax
 10c0906:	80 7f 18 00          	cmp    BYTE PTR [rdi+0x18],0x0
 10c090a:	74 35                	je     10c0941 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287d57>
 10c090c:	49 89 fe             	mov    r14,rdi
 10c090f:	80 7f 70 00          	cmp    BYTE PTR [rdi+0x70],0x0
 10c0913:	74 2c                	je     10c0941 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287d57>
 10c0915:	48 89 d3             	mov    rbx,rdx
 10c0918:	49 8d 46 40          	lea    rax,[r14+0x40]
 10c091c:	48 89 f7             	mov    rdi,rsi
 10c091f:	48 89 c6             	mov    rsi,rax
 10c0922:	e8 c7 ed 9d ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
 10c0927:	84 c0                	test   al,al
 10c0929:	74 16                	je     10c0941 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287d57>
 10c092b:	49 83 c6 78          	add    r14,0x78
 10c092f:	4c 89 f7             	mov    rdi,r14
 10c0932:	48 89 de             	mov    rsi,rbx
 10c0935:	48 83 c4 08          	add    rsp,0x8
 10c0939:	5b                   	pop    rbx
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
 10c0988:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
 10c098c:	e8 9f 63 9e ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10c0991:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
 10c0995:	e8 f6 d4 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10c099a:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
 10c099e:	e8 e3 da 9d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10c09a3:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
 10c09a7:	5b                   	pop    rbx
 10c09a8:	e9 d9 da 9d ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
```
### Entry `0x30` -> `0x10c094a`

```text
 10c092b:	49 83 c6 78          	add    r14,0x78
 10c092f:	4c 89 f7             	mov    rdi,r14
 10c0932:	48 89 de             	mov    rsi,rbx
 10c0935:	48 83 c4 08          	add    rsp,0x8
 10c0939:	5b                   	pop    rbx
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
 10c0988:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
 10c098c:	e8 9f 63 9e ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10c0991:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
 10c0995:	e8 f6 d4 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10c099a:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
 10c099e:	e8 e3 da 9d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10c09a3:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
 10c09a7:	5b                   	pop    rbx
 10c09a8:	e9 d9 da 9d ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
 10c09ad:	cc                   	int3
 10c09ae:	53                   	push   rbx
 10c09af:	48 89 fb             	mov    rbx,rdi
 10c09b2:	e8 ab ff ff ff       	call   10c0962 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287d78>
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
```
### Entry `0x38` -> `0x10c0962`

```text
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
 10c0988:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
 10c098c:	e8 9f 63 9e ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10c0991:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
 10c0995:	e8 f6 d4 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10c099a:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
 10c099e:	e8 e3 da 9d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10c09a3:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
 10c09a7:	5b                   	pop    rbx
 10c09a8:	e9 d9 da 9d ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
 10c09ad:	cc                   	int3
 10c09ae:	53                   	push   rbx
 10c09af:	48 89 fb             	mov    rbx,rdi
 10c09b2:	e8 ab ff ff ff       	call   10c0962 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287d78>
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
```
### Entry `0x40` -> `0x10c09ae`

```text
 10c097c:	48 8d bb 98 00 00 00 	lea    rdi,[rbx+0x98]
 10c0983:	e8 a8 63 9e ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10c0988:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
 10c098c:	e8 9f 63 9e ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10c0991:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
 10c0995:	e8 f6 d4 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10c099a:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
 10c099e:	e8 e3 da 9d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10c09a3:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
 10c09a7:	5b                   	pop    rbx
 10c09a8:	e9 d9 da 9d ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
 10c09ad:	cc                   	int3
 10c09ae:	53                   	push   rbx
 10c09af:	48 89 fb             	mov    rbx,rdi
 10c09b2:	e8 ab ff ff ff       	call   10c0962 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287d78>
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
```
### Entry `0x58` -> `0x9d7de0`

```text
  9d7dce:	cc                   	int3
  9d7dcf:	cc                   	int3
  9d7dd0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  9d7dd3:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
  9d7dd7:	ff e0                	jmp    rax
  9d7dd9:	cc                   	int3
  9d7dda:	cc                   	int3
  9d7ddb:	cc                   	int3
  9d7ddc:	cc                   	int3
  9d7ddd:	cc                   	int3
  9d7dde:	cc                   	int3
  9d7ddf:	cc                   	int3
  9d7de0:	c3                   	ret
  9d7de1:	cc                   	int3
  9d7de2:	cc                   	int3
  9d7de3:	cc                   	int3
  9d7de4:	cc                   	int3
  9d7de5:	cc                   	int3
  9d7de6:	cc                   	int3
  9d7de7:	cc                   	int3
  9d7de8:	cc                   	int3
  9d7de9:	cc                   	int3
  9d7dea:	cc                   	int3
  9d7deb:	cc                   	int3
  9d7dec:	cc                   	int3
  9d7ded:	cc                   	int3
  9d7dee:	cc                   	int3
  9d7def:	cc                   	int3
  9d7df0:	83 7f 08 00          	cmp    DWORD PTR [rdi+0x8],0x0
  9d7df4:	0f 94 c0             	sete   al
  9d7df7:	c3                   	ret
  9d7df8:	cc                   	int3
  9d7df9:	cc                   	int3
  9d7dfa:	cc                   	int3
  9d7dfb:	cc                   	int3
  9d7dfc:	cc                   	int3
  9d7dfd:	cc                   	int3
  9d7dfe:	cc                   	int3
  9d7dff:	cc                   	int3
  9d7e00:	8a 47 0c             	mov    al,BYTE PTR [rdi+0xc]
  9d7e03:	c3                   	ret
  9d7e04:	cc                   	int3
  9d7e05:	cc                   	int3
  9d7e06:	cc                   	int3
  9d7e07:	cc                   	int3
  9d7e08:	cc                   	int3
  9d7e09:	cc                   	int3
  9d7e0a:	cc                   	int3
  9d7e0b:	cc                   	int3
  9d7e0c:	cc                   	int3
  9d7e0d:	cc                   	int3
  9d7e0e:	cc                   	int3
  9d7e0f:	cc                   	int3
  9d7e10:	50                   	push   rax
  9d7e11:	48 89 f7             	mov    rdi,rsi
  9d7e14:	4c 8d 05 65 24 00 01 	lea    r8,[rip+0x1002465]        # 19da280 <__stop_pb_defaults@@Base+0x20>
  9d7e1b:	48 c7 c6 ff ff ff ff 	mov    rsi,0xffffffffffffffff
  9d7e22:	31 c0                	xor    eax,eax
  9d7e24:	e8 17 00 00 00       	call   9d7e40 <_ZNSt13bad_exceptionD1Ev@@Base+0x60>
  9d7e29:	48 98                	cdqe
  9d7e2b:	c6 05 4e 24 00 01 00 	mov    BYTE PTR [rip+0x100244e],0x0        # 19da280 <__stop_pb_defaults@@Base+0x20>
  9d7e32:	59                   	pop    rcx
  9d7e33:	c3                   	ret
  9d7e34:	cc                   	int3
  9d7e35:	cc                   	int3
  9d7e36:	cc                   	int3
```
## `wrapper_0x80 AP 0x184d0a0` relocations

```text
000000000184d0a0  0000000000000008 R_X86_64_RELATIVE                         10b3584
000000000184d0a8  0000000000000008 R_X86_64_RELATIVE                         a3fa60
000000000184d0b0  0000000000000008 R_X86_64_RELATIVE                         10b3654
000000000184d0b8  0000000000000008 R_X86_64_RELATIVE                         10b367e
000000000184d0d0  0000000000000008 R_X86_64_RELATIVE                         9d7de0
000000000184d0d8  0000000000000008 R_X86_64_RELATIVE                         a50370
000000000184d0e0  0000000000000008 R_X86_64_RELATIVE                         10b3540
000000000184d0e8  0000000000000008 R_X86_64_RELATIVE                         10b3560
000000000184d0f0  0000000000000008 R_X86_64_RELATIVE                         9d7de0
000000000184d0f8  0000000000000008 R_X86_64_RELATIVE                         a50370
000000000184d100  0000000000000008 R_X86_64_RELATIVE                         10b3574
000000000184d118  0000000000000008 R_X86_64_RELATIVE                         10b37d2
000000000184d120  0000000000000008 R_X86_64_RELATIVE                         10b3856
000000000184d128  0000000000000008 R_X86_64_RELATIVE                         10b3868
000000000184d130  0000000000000008 R_X86_64_RELATIVE                         10b387a
000000000184d148  0000000000000008 R_X86_64_RELATIVE                         10b718a
000000000184d150  0000000000000008 R_X86_64_RELATIVE                         10b719a
000000000184d158  0000000000000008 R_X86_64_RELATIVE                         10b71ac
```
### Entry `0x0` -> `0x10b3584`

```text
 10b3560:	48 8d 05 69 9b 79 00 	lea    rax,[rip+0x799b69]        # 184d0d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x97b8>
 10b3567:	48 89 06             	mov    QWORD PTR [rsi],rax
 10b356a:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 10b356e:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
 10b3572:	c3                   	ret
 10b3573:	cc                   	int3
 10b3574:	80 3e 00             	cmp    BYTE PTR [rsi],0x0
 10b3577:	0f 94 c0             	sete   al
 10b357a:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]
 10b357e:	34 03                	xor    al,0x3
 10b3580:	88 41 30             	mov    BYTE PTR [rcx+0x30],al
 10b3583:	c3                   	ret
 10b3584:	55                   	push   rbp
 10b3585:	41 57                	push   r15
 10b3587:	41 56                	push   r14
 10b3589:	41 55                	push   r13
 10b358b:	41 54                	push   r12
 10b358d:	53                   	push   rbx
 10b358e:	48 83 ec 18          	sub    rsp,0x18
 10b3592:	49 89 d6             	mov    r14,rdx
 10b3595:	49 89 f7             	mov    r15,rsi
 10b3598:	48 89 fb             	mov    rbx,rdi
 10b359b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b35a2:	00 00
 10b35a4:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10b35a9:	48 8b 7e 08          	mov    rdi,QWORD PTR [rsi+0x8]
 10b35ad:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10b35b0:	6a 01                	push   0x1
 10b35b2:	41 5d                	pop    r13
 10b35b4:	44 89 ee             	mov    esi,r13d
 10b35b7:	ff 50 30             	call   QWORD PTR [rax+0x30]
 10b35ba:	89 c5                	mov    ebp,eax
 10b35bc:	49 8b 7f 18          	mov    rdi,QWORD PTR [r15+0x18]
 10b35c0:	49 8d 77 20          	lea    rsi,[r15+0x20]
 10b35c4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10b35c7:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10b35ca:	49 89 c4             	mov    r12,rax
 10b35cd:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
 10b35d1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10b35d4:	44 89 ee             	mov    esi,r13d
 10b35d7:	4c 89 e2             	mov    rdx,r12
 10b35da:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10b35dd:	40 84 ed             	test   bpl,bpl
 10b35e0:	75 26                	jne    10b3608 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27aa1e>
 10b35e2:	84 c0                	test   al,al
 10b35e4:	75 22                	jne    10b3608 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27aa1e>
 10b35e6:	48 8d 74 24 0f       	lea    rsi,[rsp+0xf]
 10b35eb:	c6 06 00             	mov    BYTE PTR [rsi],0x0
 10b35ee:	48 89 df             	mov    rdi,rbx
 10b35f1:	e8 80 8d dd ff       	call   e8c376 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5378c>
 10b35f6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b35fd:	00 00
 10b35ff:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
 10b3604:	74 36                	je     10b363c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27aa52>
 10b3606:	eb 46                	jmp    10b364e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27aa64>
 10b3608:	40 84 ed             	test   bpl,bpl
 10b360b:	75 10                	jne    10b361d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27aa33>
 10b360d:	49 81 fc 61 ea 00 00 	cmp    r12,0xea61
 10b3614:	7c d0                	jl     10b35e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a9fc>
 10b3616:	41 80 7f 30 02       	cmp    BYTE PTR [r15+0x30],0x2
 10b361b:	74 c9                	je     10b35e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a9fc>
 10b361d:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
 10b3621:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b3628:	00 00
 10b362a:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
 10b362f:	75 1d                	jne    10b364e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27aa64>
```
### Entry `0x8` -> `0xa3fa60`

```text
  a3fa50:	b8 01 00 00 00       	mov    eax,0x1
  a3fa55:	c3                   	ret
  a3fa56:	cc                   	int3
  a3fa57:	cc                   	int3
  a3fa58:	cc                   	int3
  a3fa59:	cc                   	int3
  a3fa5a:	cc                   	int3
  a3fa5b:	cc                   	int3
  a3fa5c:	cc                   	int3
  a3fa5d:	cc                   	int3
  a3fa5e:	cc                   	int3
  a3fa5f:	cc                   	int3
  a3fa60:	b0 01                	mov    al,0x1
  a3fa62:	c3                   	ret
  a3fa63:	cc                   	int3
  a3fa64:	cc                   	int3
  a3fa65:	cc                   	int3
  a3fa66:	cc                   	int3
  a3fa67:	cc                   	int3
  a3fa68:	cc                   	int3
  a3fa69:	cc                   	int3
  a3fa6a:	cc                   	int3
  a3fa6b:	cc                   	int3
  a3fa6c:	cc                   	int3
  a3fa6d:	cc                   	int3
  a3fa6e:	cc                   	int3
  a3fa6f:	cc                   	int3
  a3fa70:	48 89 c8             	mov    rax,rcx
  a3fa73:	48 29 d0             	sub    rax,rdx
  a3fa76:	4c 39 c0             	cmp    rax,r8
  a3fa79:	49 0f 43 c0          	cmovae rax,r8
  a3fa7d:	c3                   	ret
  a3fa7e:	cc                   	int3
  a3fa7f:	cc                   	int3
  a3fa80:	41 56                	push   r14
  a3fa82:	53                   	push   rbx
  a3fa83:	50                   	push   rax
  a3fa84:	48 89 fb             	mov    rbx,rdi
  a3fa87:	48 ff ce             	dec    rsi
  a3fa8a:	48 89 77 08          	mov    QWORD PTR [rdi+0x8],rsi
  a3fa8e:	48 8b 05 ab 27 e7 00 	mov    rax,QWORD PTR [rip+0xe727ab]        # 18b2240 <_ZTVNSt6__ndk17codecvtIwc9mbstate_tEE@@Base+0xbbc58>
  a3fa95:	48 83 c0 10          	add    rax,0x10
  a3fa99:	48 89 07             	mov    QWORD PTR [rdi],rax
  a3fa9c:	0f b6 05 8d ff f9 00 	movzx  eax,BYTE PTR [rip+0xf9ff8d]        # 19dfa30 <_ZNSt6__ndk18messagesIwE2idE@@Base+0x18>
  a3faa3:	84 c0                	test   al,al
  a3faa5:	74 13                	je     a3faba <_ZNSt6__ndk17codecvtIwc9mbstate_tEC1Em@@Base+0x3a>
  a3faa7:	48 8b 05 7a ff f9 00 	mov    rax,QWORD PTR [rip+0xf9ff7a]        # 19dfa28 <_ZNSt6__ndk18messagesIwE2idE@@Base+0x10>
  a3faae:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
  a3fab2:	48 83 c4 08          	add    rsp,0x8
  a3fab6:	5b                   	pop    rbx
  a3fab7:	41 5e                	pop    r14
  a3fab9:	c3                   	ret
  a3faba:	48 8d 3d 6f ff f9 00 	lea    rdi,[rip+0xf9ff6f]        # 19dfa30 <_ZNSt6__ndk18messagesIwE2idE@@Base+0x18>
  a3fac1:	e8 aa e6 da 00       	call   17ee170 <__cxa_guard_acquire@plt>
  a3fac6:	85 c0                	test   eax,eax
  a3fac8:	74 dd                	je     a3faa7 <_ZNSt6__ndk17codecvtIwc9mbstate_tEC1Em@@Base+0x27>
  a3faca:	48 8d 35 3b 94 92 ff 	lea    rsi,[rip+0xffffffffff92943b]        # 368f0c <_ZTSSt12bad_any_cast@@Base-0x272bc>
  a3fad1:	bf bf 1f 00 00       	mov    edi,0x1fbf
  a3fad6:	31 d2                	xor    edx,edx
  a3fad8:	e8 b3 06 db 00       	call   17f0190 <newlocale@plt>
  a3fadd:	48 89 05 44 ff f9 00 	mov    QWORD PTR [rip+0xf9ff44],rax        # 19dfa28 <_ZNSt6__ndk18messagesIwE2idE@@Base+0x10>
  a3fae4:	48 8d 3d 45 ff f9 00 	lea    rdi,[rip+0xf9ff45]        # 19dfa30 <_ZNSt6__ndk18messagesIwE2idE@@Base+0x18>
  a3faeb:	e8 90 e6 da 00       	call   17ee180 <__cxa_guard_release@plt>
  a3faf0:	eb b5                	jmp    a3faa7 <_ZNSt6__ndk17codecvtIwc9mbstate_tEC1Em@@Base+0x27>
  a3faf2:	49 89 c6             	mov    r14,rax
  a3faf5:	48 8d 3d 34 ff f9 00 	lea    rdi,[rip+0xf9ff34]        # 19dfa30 <_ZNSt6__ndk18messagesIwE2idE@@Base+0x18>
```
### Entry `0x10` -> `0x10b3654`

```text
 10b3637:	e8 0e fb ff ff       	call   10b314a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a560>
 10b363c:	48 89 d8             	mov    rax,rbx
 10b363f:	48 83 c4 18          	add    rsp,0x18
 10b3643:	5b                   	pop    rbx
 10b3644:	41 5c                	pop    r12
 10b3646:	41 5d                	pop    r13
 10b3648:	41 5e                	pop    r14
 10b364a:	41 5f                	pop    r15
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
 10b368b:	e9 90 a8 73 00       	jmp    17edf20 <_ZdlPv@plt>
 10b3690:	55                   	push   rbp
 10b3691:	41 57                	push   r15
 10b3693:	41 56                	push   r14
 10b3695:	41 55                	push   r13
 10b3697:	41 54                	push   r12
 10b3699:	53                   	push   rbx
 10b369a:	48 83 ec 38          	sub    rsp,0x38
 10b369e:	89 d5                	mov    ebp,edx
 10b36a0:	49 89 f4             	mov    r12,rsi
 10b36a3:	48 89 fb             	mov    rbx,rdi
 10b36a6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b36ad:	00 00
 10b36af:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 10b36b4:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]
 10b36b9:	4c 89 f7             	mov    rdi,r14
 10b36bc:	48 89 ce             	mov    rsi,rcx
 10b36bf:	e8 7c a8 73 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 10b36c4:	66 41 89 6e 18       	mov    WORD PTR [r14+0x18],bp
 10b36c9:	4c 89 f7             	mov    rdi,r14
 10b36cc:	e8 49 37 be ff       	call   c96e1a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e3dba>
 10b36d1:	4d 8b 6c 24 08       	mov    r13,QWORD PTR [r12+0x8]
 10b36d6:	4d 85 ed             	test   r13,r13
 10b36d9:	0f 84 98 00 00 00    	je     10b3777 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27ab8d>
 10b36df:	49 89 c6             	mov    r14,rax
 10b36e2:	f3 49 0f b8 ed       	popcnt rbp,r13
 10b36e7:	48 83 fd 01          	cmp    rbp,0x1
 10b36eb:	77 09                	ja     10b36f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27ab0c>
 10b36ed:	4d 8d 7d ff          	lea    r15,[r13-0x1]
 10b36f1:	4d 21 f7             	and    r15,r14
 10b36f4:	eb 15                	jmp    10b370b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27ab21>
 10b36f6:	4d 39 ee             	cmp    r14,r13
 10b36f9:	73 05                	jae    10b3700 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27ab16>
 10b36fb:	4d 89 f7             	mov    r15,r14
 10b36fe:	eb 0b                	jmp    10b370b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27ab21>
 10b3700:	4c 89 f0             	mov    rax,r14
 10b3703:	31 d2                	xor    edx,edx
 10b3705:	49 f7 f5             	div    r13
```
### Entry `0x18` -> `0x10b367e`

```text
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
 10b368b:	e9 90 a8 73 00       	jmp    17edf20 <_ZdlPv@plt>
 10b3690:	55                   	push   rbp
 10b3691:	41 57                	push   r15
 10b3693:	41 56                	push   r14
 10b3695:	41 55                	push   r13
 10b3697:	41 54                	push   r12
 10b3699:	53                   	push   rbx
 10b369a:	48 83 ec 38          	sub    rsp,0x38
 10b369e:	89 d5                	mov    ebp,edx
 10b36a0:	49 89 f4             	mov    r12,rsi
 10b36a3:	48 89 fb             	mov    rbx,rdi
 10b36a6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b36ad:	00 00
 10b36af:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 10b36b4:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]
 10b36b9:	4c 89 f7             	mov    rdi,r14
 10b36bc:	48 89 ce             	mov    rsi,rcx
 10b36bf:	e8 7c a8 73 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 10b36c4:	66 41 89 6e 18       	mov    WORD PTR [r14+0x18],bp
 10b36c9:	4c 89 f7             	mov    rdi,r14
 10b36cc:	e8 49 37 be ff       	call   c96e1a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e3dba>
 10b36d1:	4d 8b 6c 24 08       	mov    r13,QWORD PTR [r12+0x8]
 10b36d6:	4d 85 ed             	test   r13,r13
 10b36d9:	0f 84 98 00 00 00    	je     10b3777 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27ab8d>
 10b36df:	49 89 c6             	mov    r14,rax
 10b36e2:	f3 49 0f b8 ed       	popcnt rbp,r13
 10b36e7:	48 83 fd 01          	cmp    rbp,0x1
 10b36eb:	77 09                	ja     10b36f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27ab0c>
 10b36ed:	4d 8d 7d ff          	lea    r15,[r13-0x1]
 10b36f1:	4d 21 f7             	and    r15,r14
 10b36f4:	eb 15                	jmp    10b370b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27ab21>
 10b36f6:	4d 39 ee             	cmp    r14,r13
 10b36f9:	73 05                	jae    10b3700 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27ab16>
 10b36fb:	4d 89 f7             	mov    r15,r14
 10b36fe:	eb 0b                	jmp    10b370b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27ab21>
 10b3700:	4c 89 f0             	mov    rax,r14
 10b3703:	31 d2                	xor    edx,edx
 10b3705:	49 f7 f5             	div    r13
 10b3708:	49 89 d7             	mov    r15,rdx
 10b370b:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 10b370f:	4a 8b 04 f8          	mov    rax,QWORD PTR [rax+r15*8]
 10b3713:	48 85 c0             	test   rax,rax
 10b3716:	74 5f                	je     10b3777 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27ab8d>
 10b3718:	4c 8b 20             	mov    r12,QWORD PTR [rax]
 10b371b:	4d 85 e4             	test   r12,r12
 10b371e:	74 57                	je     10b3777 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27ab8d>
 10b3720:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
 10b3725:	49 8d 5d ff          	lea    rbx,[r13-0x1]
 10b3729:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]
```
### Entry `0x30` -> `0x9d7de0`

```text
  9d7dce:	cc                   	int3
  9d7dcf:	cc                   	int3
  9d7dd0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  9d7dd3:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
  9d7dd7:	ff e0                	jmp    rax
  9d7dd9:	cc                   	int3
  9d7dda:	cc                   	int3
  9d7ddb:	cc                   	int3
  9d7ddc:	cc                   	int3
  9d7ddd:	cc                   	int3
  9d7dde:	cc                   	int3
  9d7ddf:	cc                   	int3
  9d7de0:	c3                   	ret
  9d7de1:	cc                   	int3
  9d7de2:	cc                   	int3
  9d7de3:	cc                   	int3
  9d7de4:	cc                   	int3
  9d7de5:	cc                   	int3
  9d7de6:	cc                   	int3
  9d7de7:	cc                   	int3
  9d7de8:	cc                   	int3
  9d7de9:	cc                   	int3
  9d7dea:	cc                   	int3
  9d7deb:	cc                   	int3
  9d7dec:	cc                   	int3
  9d7ded:	cc                   	int3
  9d7dee:	cc                   	int3
  9d7def:	cc                   	int3
  9d7df0:	83 7f 08 00          	cmp    DWORD PTR [rdi+0x8],0x0
  9d7df4:	0f 94 c0             	sete   al
  9d7df7:	c3                   	ret
  9d7df8:	cc                   	int3
  9d7df9:	cc                   	int3
  9d7dfa:	cc                   	int3
  9d7dfb:	cc                   	int3
  9d7dfc:	cc                   	int3
  9d7dfd:	cc                   	int3
  9d7dfe:	cc                   	int3
  9d7dff:	cc                   	int3
  9d7e00:	8a 47 0c             	mov    al,BYTE PTR [rdi+0xc]
  9d7e03:	c3                   	ret
  9d7e04:	cc                   	int3
  9d7e05:	cc                   	int3
  9d7e06:	cc                   	int3
  9d7e07:	cc                   	int3
  9d7e08:	cc                   	int3
  9d7e09:	cc                   	int3
  9d7e0a:	cc                   	int3
  9d7e0b:	cc                   	int3
  9d7e0c:	cc                   	int3
  9d7e0d:	cc                   	int3
  9d7e0e:	cc                   	int3
  9d7e0f:	cc                   	int3
  9d7e10:	50                   	push   rax
  9d7e11:	48 89 f7             	mov    rdi,rsi
  9d7e14:	4c 8d 05 65 24 00 01 	lea    r8,[rip+0x1002465]        # 19da280 <__stop_pb_defaults@@Base+0x20>
  9d7e1b:	48 c7 c6 ff ff ff ff 	mov    rsi,0xffffffffffffffff
  9d7e22:	31 c0                	xor    eax,eax
  9d7e24:	e8 17 00 00 00       	call   9d7e40 <_ZNSt13bad_exceptionD1Ev@@Base+0x60>
  9d7e29:	48 98                	cdqe
  9d7e2b:	c6 05 4e 24 00 01 00 	mov    BYTE PTR [rip+0x100244e],0x0        # 19da280 <__stop_pb_defaults@@Base+0x20>
  9d7e32:	59                   	pop    rcx
  9d7e33:	c3                   	ret
  9d7e34:	cc                   	int3
  9d7e35:	cc                   	int3
  9d7e36:	cc                   	int3
```
### Entry `0x38` -> `0xa50370`

```text
  a50347:	c3                   	ret
  a50348:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
  a5034c:	e8 cf db d9 00       	call   17edf20 <_ZdlPv@plt>
  a50351:	f6 43 30 01          	test   BYTE PTR [rbx+0x30],0x1
  a50355:	74 e9                	je     a50340 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iterator15__try_recursionEPNS_10error_codeE@@Base+0xa20>
  a50357:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
  a5035b:	e8 c0 db d9 00       	call   17edf20 <_ZdlPv@plt>
  a50360:	f6 43 18 01          	test   BYTE PTR [rbx+0x18],0x1
  a50364:	74 e0                	je     a50346 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iterator15__try_recursionEPNS_10error_codeE@@Base+0xa26>
  a50366:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
  a5036a:	5b                   	pop    rbx
  a5036b:	e9 b0 db d9 00       	jmp    17edf20 <_ZdlPv@plt>
  a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>
  a50375:	cc                   	int3
  a50376:	cc                   	int3
  a50377:	cc                   	int3
  a50378:	cc                   	int3
  a50379:	cc                   	int3
  a5037a:	cc                   	int3
  a5037b:	cc                   	int3
  a5037c:	cc                   	int3
  a5037d:	cc                   	int3
  a5037e:	cc                   	int3
  a5037f:	cc                   	int3
  a50380:	41 57                	push   r15
  a50382:	41 56                	push   r14
  a50384:	53                   	push   rbx
  a50385:	48 83 ec 30          	sub    rsp,0x30
  a50389:	49 89 d7             	mov    r15,rdx
  a5038c:	48 89 f0             	mov    rax,rsi
  a5038f:	48 89 fb             	mov    rbx,rdi
  a50392:	89 ce                	mov    esi,ecx
  a50394:	4c 89 c2             	mov    rdx,r8
  a50397:	48 89 c1             	mov    rcx,rax
  a5039a:	e8 41 fa d9 00       	call   17efde0 <_ZNSt6__ndk112system_errorC2ENS_10error_codeERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@plt>
  a5039f:	48 8b 05 62 1b e6 00 	mov    rax,QWORD PTR [rip+0xe61b62]        # 18b1f08 <_ZTVNSt6__ndk14__fs10filesystem16filesystem_errorE@@Base+0xbcde8>
  a503a6:	48 83 c0 10          	add    rax,0x10
  a503aa:	48 89 03             	mov    QWORD PTR [rbx],rax
  a503ad:	4c 8d 73 20          	lea    r14,[rbx+0x20]
  a503b1:	0f 57 c0             	xorps  xmm0,xmm0
  a503b4:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
  a503b9:	48 c7 44 24 20 00 00 	mov    QWORD PTR [rsp+0x20],0x0
  a503c0:	00 00
  a503c2:	48 8d 74 24 0f       	lea    rsi,[rsp+0xf]
  a503c7:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
  a503cc:	4c 89 f7             	mov    rdi,r14
  a503cf:	4c 89 fa             	mov    rdx,r15
  a503d2:	e8 69 00 00 00       	call   a50440 <_ZdaPv@@Base+0xd0>
  a503d7:	f6 44 24 10 01       	test   BYTE PTR [rsp+0x10],0x1
  a503dc:	74 0a                	je     a503e8 <_ZdaPv@@Base+0x78>
  a503de:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
  a503e3:	e8 38 db d9 00       	call   17edf20 <_ZdlPv@plt>
  a503e8:	48 89 df             	mov    rdi,rbx
  a503eb:	be 01 00 00 00       	mov    esi,0x1
  a503f0:	e8 eb f7 d9 00       	call   17efbe0 <_ZNSt6__ndk14__fs10filesystem16filesystem_error13__create_whatEi@plt>
  a503f5:	48 83 c4 30          	add    rsp,0x30
  a503f9:	5b                   	pop    rbx
  a503fa:	41 5e                	pop    r14
  a503fc:	41 5f                	pop    r15
  a503fe:	c3                   	ret
  a503ff:	49 89 c7             	mov    r15,rax
  a50402:	4c 89 f7             	mov    rdi,r14
  a50405:	e8 e6 f0 ff ff       	call   a4f4f0 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iteratorC1ERKNS1_4pathENS1_17directory_optionsEPNS_10error_codeE@@Base+0x3e0>
  a5040a:	48 89 df             	mov    rdi,rbx
  a5040d:	e8 de f7 d9 00       	call   17efbf0 <_ZNSt6__ndk112system_errorD2Ev@plt>
  a50412:	4c 89 ff             	mov    rdi,r15
```
### Entry `0x40` -> `0x10b3540`

```text
 10b350e:	4c 89 ff             	mov    rdi,r15
 10b3511:	e8 f2 74 9f ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 10b3516:	44 8a 7c 24 20       	mov    r15b,BYTE PTR [rsp+0x20]
 10b351b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
 10b3520:	41 0f b6 f7          	movzx  esi,r15b
 10b3524:	e8 55 4f ab ff       	call   b6847e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb541e>
 10b3529:	eb 03                	jmp    10b352e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a944>
 10b352b:	48 89 c3             	mov    rbx,rax
 10b352e:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 10b3533:	e8 4e af 9e ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10b3538:	48 89 df             	mov    rdi,rbx
 10b353b:	e8 65 65 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10b3540:	53                   	push   rbx
 10b3541:	48 89 fb             	mov    rbx,rdi
 10b3544:	6a 10                	push   0x10
 10b3546:	5f                   	pop    rdi
 10b3547:	e8 b4 a9 73 00       	call   17edf00 <_Znwm@plt>
 10b354c:	48 8d 0d 7d 9b 79 00 	lea    rcx,[rip+0x799b7d]        # 184d0d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x97b8>
 10b3553:	48 89 08             	mov    QWORD PTR [rax],rcx
 10b3556:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
 10b355a:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 10b355e:	5b                   	pop    rbx
 10b355f:	c3                   	ret
 10b3560:	48 8d 05 69 9b 79 00 	lea    rax,[rip+0x799b69]        # 184d0d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x97b8>
 10b3567:	48 89 06             	mov    QWORD PTR [rsi],rax
 10b356a:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 10b356e:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
 10b3572:	c3                   	ret
 10b3573:	cc                   	int3
 10b3574:	80 3e 00             	cmp    BYTE PTR [rsi],0x0
 10b3577:	0f 94 c0             	sete   al
 10b357a:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]
 10b357e:	34 03                	xor    al,0x3
 10b3580:	88 41 30             	mov    BYTE PTR [rcx+0x30],al
 10b3583:	c3                   	ret
 10b3584:	55                   	push   rbp
 10b3585:	41 57                	push   r15
 10b3587:	41 56                	push   r14
 10b3589:	41 55                	push   r13
 10b358b:	41 54                	push   r12
 10b358d:	53                   	push   rbx
 10b358e:	48 83 ec 18          	sub    rsp,0x18
 10b3592:	49 89 d6             	mov    r14,rdx
 10b3595:	49 89 f7             	mov    r15,rsi
 10b3598:	48 89 fb             	mov    rbx,rdi
 10b359b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b35a2:	00 00
 10b35a4:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10b35a9:	48 8b 7e 08          	mov    rdi,QWORD PTR [rsi+0x8]
 10b35ad:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10b35b0:	6a 01                	push   0x1
 10b35b2:	41 5d                	pop    r13
 10b35b4:	44 89 ee             	mov    esi,r13d
 10b35b7:	ff 50 30             	call   QWORD PTR [rax+0x30]
 10b35ba:	89 c5                	mov    ebp,eax
 10b35bc:	49 8b 7f 18          	mov    rdi,QWORD PTR [r15+0x18]
 10b35c0:	49 8d 77 20          	lea    rsi,[r15+0x20]
 10b35c4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10b35c7:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10b35ca:	49 89 c4             	mov    r12,rax
 10b35cd:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
 10b35d1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10b35d4:	44 89 ee             	mov    esi,r13d
 10b35d7:	4c 89 e2             	mov    rdx,r12
 10b35da:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10b35dd:	40 84 ed             	test   bpl,bpl
```
### Entry `0x48` -> `0x10b3560`

```text
 10b353b:	e8 65 65 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10b3540:	53                   	push   rbx
 10b3541:	48 89 fb             	mov    rbx,rdi
 10b3544:	6a 10                	push   0x10
 10b3546:	5f                   	pop    rdi
 10b3547:	e8 b4 a9 73 00       	call   17edf00 <_Znwm@plt>
 10b354c:	48 8d 0d 7d 9b 79 00 	lea    rcx,[rip+0x799b7d]        # 184d0d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x97b8>
 10b3553:	48 89 08             	mov    QWORD PTR [rax],rcx
 10b3556:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
 10b355a:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 10b355e:	5b                   	pop    rbx
 10b355f:	c3                   	ret
 10b3560:	48 8d 05 69 9b 79 00 	lea    rax,[rip+0x799b69]        # 184d0d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x97b8>
 10b3567:	48 89 06             	mov    QWORD PTR [rsi],rax
 10b356a:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 10b356e:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
 10b3572:	c3                   	ret
 10b3573:	cc                   	int3
 10b3574:	80 3e 00             	cmp    BYTE PTR [rsi],0x0
 10b3577:	0f 94 c0             	sete   al
 10b357a:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]
 10b357e:	34 03                	xor    al,0x3
 10b3580:	88 41 30             	mov    BYTE PTR [rcx+0x30],al
 10b3583:	c3                   	ret
 10b3584:	55                   	push   rbp
 10b3585:	41 57                	push   r15
 10b3587:	41 56                	push   r14
 10b3589:	41 55                	push   r13
 10b358b:	41 54                	push   r12
 10b358d:	53                   	push   rbx
 10b358e:	48 83 ec 18          	sub    rsp,0x18
 10b3592:	49 89 d6             	mov    r14,rdx
 10b3595:	49 89 f7             	mov    r15,rsi
 10b3598:	48 89 fb             	mov    rbx,rdi
 10b359b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b35a2:	00 00
 10b35a4:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10b35a9:	48 8b 7e 08          	mov    rdi,QWORD PTR [rsi+0x8]
 10b35ad:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10b35b0:	6a 01                	push   0x1
 10b35b2:	41 5d                	pop    r13
 10b35b4:	44 89 ee             	mov    esi,r13d
 10b35b7:	ff 50 30             	call   QWORD PTR [rax+0x30]
 10b35ba:	89 c5                	mov    ebp,eax
 10b35bc:	49 8b 7f 18          	mov    rdi,QWORD PTR [r15+0x18]
 10b35c0:	49 8d 77 20          	lea    rsi,[r15+0x20]
 10b35c4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10b35c7:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10b35ca:	49 89 c4             	mov    r12,rax
 10b35cd:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
 10b35d1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10b35d4:	44 89 ee             	mov    esi,r13d
 10b35d7:	4c 89 e2             	mov    rdx,r12
 10b35da:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10b35dd:	40 84 ed             	test   bpl,bpl
 10b35e0:	75 26                	jne    10b3608 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27aa1e>
 10b35e2:	84 c0                	test   al,al
 10b35e4:	75 22                	jne    10b3608 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27aa1e>
 10b35e6:	48 8d 74 24 0f       	lea    rsi,[rsp+0xf]
 10b35eb:	c6 06 00             	mov    BYTE PTR [rsi],0x0
 10b35ee:	48 89 df             	mov    rdi,rbx
 10b35f1:	e8 80 8d dd ff       	call   e8c376 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5378c>
 10b35f6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b35fd:	00 00
 10b35ff:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
 10b3604:	74 36                	je     10b363c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27aa52>
```
### Entry `0x50` -> `0x9d7de0`

```text
  9d7dce:	cc                   	int3
  9d7dcf:	cc                   	int3
  9d7dd0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  9d7dd3:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
  9d7dd7:	ff e0                	jmp    rax
  9d7dd9:	cc                   	int3
  9d7dda:	cc                   	int3
  9d7ddb:	cc                   	int3
  9d7ddc:	cc                   	int3
  9d7ddd:	cc                   	int3
  9d7dde:	cc                   	int3
  9d7ddf:	cc                   	int3
  9d7de0:	c3                   	ret
  9d7de1:	cc                   	int3
  9d7de2:	cc                   	int3
  9d7de3:	cc                   	int3
  9d7de4:	cc                   	int3
  9d7de5:	cc                   	int3
  9d7de6:	cc                   	int3
  9d7de7:	cc                   	int3
  9d7de8:	cc                   	int3
  9d7de9:	cc                   	int3
  9d7dea:	cc                   	int3
  9d7deb:	cc                   	int3
  9d7dec:	cc                   	int3
  9d7ded:	cc                   	int3
  9d7dee:	cc                   	int3
  9d7def:	cc                   	int3
  9d7df0:	83 7f 08 00          	cmp    DWORD PTR [rdi+0x8],0x0
  9d7df4:	0f 94 c0             	sete   al
  9d7df7:	c3                   	ret
  9d7df8:	cc                   	int3
  9d7df9:	cc                   	int3
  9d7dfa:	cc                   	int3
  9d7dfb:	cc                   	int3
  9d7dfc:	cc                   	int3
  9d7dfd:	cc                   	int3
  9d7dfe:	cc                   	int3
  9d7dff:	cc                   	int3
  9d7e00:	8a 47 0c             	mov    al,BYTE PTR [rdi+0xc]
  9d7e03:	c3                   	ret
  9d7e04:	cc                   	int3
  9d7e05:	cc                   	int3
  9d7e06:	cc                   	int3
  9d7e07:	cc                   	int3
  9d7e08:	cc                   	int3
  9d7e09:	cc                   	int3
  9d7e0a:	cc                   	int3
  9d7e0b:	cc                   	int3
  9d7e0c:	cc                   	int3
  9d7e0d:	cc                   	int3
  9d7e0e:	cc                   	int3
  9d7e0f:	cc                   	int3
  9d7e10:	50                   	push   rax
  9d7e11:	48 89 f7             	mov    rdi,rsi
  9d7e14:	4c 8d 05 65 24 00 01 	lea    r8,[rip+0x1002465]        # 19da280 <__stop_pb_defaults@@Base+0x20>
  9d7e1b:	48 c7 c6 ff ff ff ff 	mov    rsi,0xffffffffffffffff
  9d7e22:	31 c0                	xor    eax,eax
  9d7e24:	e8 17 00 00 00       	call   9d7e40 <_ZNSt13bad_exceptionD1Ev@@Base+0x60>
  9d7e29:	48 98                	cdqe
  9d7e2b:	c6 05 4e 24 00 01 00 	mov    BYTE PTR [rip+0x100244e],0x0        # 19da280 <__stop_pb_defaults@@Base+0x20>
  9d7e32:	59                   	pop    rcx
  9d7e33:	c3                   	ret
  9d7e34:	cc                   	int3
  9d7e35:	cc                   	int3
  9d7e36:	cc                   	int3
```
### Entry `0x58` -> `0xa50370`

```text
  a50347:	c3                   	ret
  a50348:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
  a5034c:	e8 cf db d9 00       	call   17edf20 <_ZdlPv@plt>
  a50351:	f6 43 30 01          	test   BYTE PTR [rbx+0x30],0x1
  a50355:	74 e9                	je     a50340 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iterator15__try_recursionEPNS_10error_codeE@@Base+0xa20>
  a50357:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
  a5035b:	e8 c0 db d9 00       	call   17edf20 <_ZdlPv@plt>
  a50360:	f6 43 18 01          	test   BYTE PTR [rbx+0x18],0x1
  a50364:	74 e0                	je     a50346 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iterator15__try_recursionEPNS_10error_codeE@@Base+0xa26>
  a50366:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
  a5036a:	5b                   	pop    rbx
  a5036b:	e9 b0 db d9 00       	jmp    17edf20 <_ZdlPv@plt>
  a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>
  a50375:	cc                   	int3
  a50376:	cc                   	int3
  a50377:	cc                   	int3
  a50378:	cc                   	int3
  a50379:	cc                   	int3
  a5037a:	cc                   	int3
  a5037b:	cc                   	int3
  a5037c:	cc                   	int3
  a5037d:	cc                   	int3
  a5037e:	cc                   	int3
  a5037f:	cc                   	int3
  a50380:	41 57                	push   r15
  a50382:	41 56                	push   r14
  a50384:	53                   	push   rbx
  a50385:	48 83 ec 30          	sub    rsp,0x30
  a50389:	49 89 d7             	mov    r15,rdx
  a5038c:	48 89 f0             	mov    rax,rsi
  a5038f:	48 89 fb             	mov    rbx,rdi
  a50392:	89 ce                	mov    esi,ecx
  a50394:	4c 89 c2             	mov    rdx,r8
  a50397:	48 89 c1             	mov    rcx,rax
  a5039a:	e8 41 fa d9 00       	call   17efde0 <_ZNSt6__ndk112system_errorC2ENS_10error_codeERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@plt>
  a5039f:	48 8b 05 62 1b e6 00 	mov    rax,QWORD PTR [rip+0xe61b62]        # 18b1f08 <_ZTVNSt6__ndk14__fs10filesystem16filesystem_errorE@@Base+0xbcde8>
  a503a6:	48 83 c0 10          	add    rax,0x10
  a503aa:	48 89 03             	mov    QWORD PTR [rbx],rax
  a503ad:	4c 8d 73 20          	lea    r14,[rbx+0x20]
  a503b1:	0f 57 c0             	xorps  xmm0,xmm0
  a503b4:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
  a503b9:	48 c7 44 24 20 00 00 	mov    QWORD PTR [rsp+0x20],0x0
  a503c0:	00 00
  a503c2:	48 8d 74 24 0f       	lea    rsi,[rsp+0xf]
  a503c7:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
  a503cc:	4c 89 f7             	mov    rdi,r14
  a503cf:	4c 89 fa             	mov    rdx,r15
  a503d2:	e8 69 00 00 00       	call   a50440 <_ZdaPv@@Base+0xd0>
  a503d7:	f6 44 24 10 01       	test   BYTE PTR [rsp+0x10],0x1
  a503dc:	74 0a                	je     a503e8 <_ZdaPv@@Base+0x78>
  a503de:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
  a503e3:	e8 38 db d9 00       	call   17edf20 <_ZdlPv@plt>
  a503e8:	48 89 df             	mov    rdi,rbx
  a503eb:	be 01 00 00 00       	mov    esi,0x1
  a503f0:	e8 eb f7 d9 00       	call   17efbe0 <_ZNSt6__ndk14__fs10filesystem16filesystem_error13__create_whatEi@plt>
  a503f5:	48 83 c4 30          	add    rsp,0x30
  a503f9:	5b                   	pop    rbx
  a503fa:	41 5e                	pop    r14
  a503fc:	41 5f                	pop    r15
  a503fe:	c3                   	ret
  a503ff:	49 89 c7             	mov    r15,rax
  a50402:	4c 89 f7             	mov    rdi,r14
  a50405:	e8 e6 f0 ff ff       	call   a4f4f0 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iteratorC1ERKNS1_4pathENS1_17directory_optionsEPNS_10error_codeE@@Base+0x3e0>
  a5040a:	48 89 df             	mov    rdi,rbx
  a5040d:	e8 de f7 d9 00       	call   17efbf0 <_ZNSt6__ndk112system_errorD2Ev@plt>
  a50412:	4c 89 ff             	mov    rdi,r15
```
