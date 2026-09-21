# Final readiness secondary interface 0x1843bf8

Proven construction:
- allocation base = 0x58-byte object at e948ff
- primary vptr [base+0x0] = 0x1831a70 at e94917
- secondary readiness vptr [base+0x18] = 0x1843bf8 at e94921
- arg13 head = base+0x18; control/lifetime = base
- this pair propagates through source+0x178 -> owner+0x428 to fd381a readiness test

## Vtable AP 0x1843bf8 through +0x1f8
- +0x0: 0xfec460
- +0x8: 0xfec690
- +0x10: 0xfec736
- +0x18: 0xb8854e
- +0x20: 0xfec7dc
- +0x28: 0xfec806
- +0x30: NO_RELOC
- +0x38: NO_RELOC
- +0x40: 0xc7e83e
- +0x48: 0xc7e84e
- +0x50: 0xc7e860
- +0x58: NO_RELOC
- +0x60: 0xa50370
- +0x68: NO_RELOC
- +0x70: NO_RELOC
- +0x78: 0xfeca6c
- +0x80: 0xfeca78
- +0x88: 0xfecbc4
- +0x90: 0xfecc22
- +0x98: 0xfecc82
- +0xa0: 0xfecc96
- +0xa8: NO_RELOC
- +0xb0: NO_RELOC
- +0xb8: 0xfed1aa
- +0xc0: 0xfed238
- +0xc8: 0xfed2f4
- +0xd0: 0xfed3f8
- +0xd8: 0xfed682
- +0xe0: 0xfeda48
- +0xe8: 0xfeda5e
- +0xf0: 0xfedad4
- +0xf8: NO_RELOC
- +0x100: NO_RELOC
- +0x108: 0xfed072
- +0x110: 0xfed086
- +0x118: 0xfed098
- +0x120: 0xfed138
- +0x128: 0xce39ae
- +0x130: 0xc9701c
- +0x138: 0xfed152
- +0x140: NO_RELOC
- +0x148: NO_RELOC
- +0x150: 0xfeddd4
- +0x158: 0xfedde8
- +0x160: 0xfeddfa
- +0x168: 0xfede9a
- +0x170: 0xfedd76
- +0x178: 0xfedd80
- +0x180: 0xfedeb4
- +0x188: NO_RELOC
- +0x190: NO_RELOC
- +0x198: 0xfedc96
- +0x1a0: 0xfedcaa
- +0x1a8: 0xfedcbc
- +0x1b0: 0xfedd5c
- +0x1b8: 0xfedd76
- +0x1c0: 0xfedd80
- +0x1c8: 0xfedd96
- +0x1d0: NO_RELOC
- +0x1d8: NO_RELOC
- +0x1e0: 0xfedf2c
- +0x1e8: 0xfedf64
- +0x1f0: 0xfedf76
- +0x1f8: NO_RELOC

## Exact +0x140 slot 0x1843d38
- target = NO_RELOC

## Constructor reference at e94921
      e948d2:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]
      e948d7:	74 0f                	je     e948e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bcfe>
      e948d9:	48 8d bc 24 50 0f 00 	lea    rdi,[rsp+0xf50]
      e948e0:	00 
      e948e1:	e8 ee 52 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e948e6:	eb 0d                	jmp    e948f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bd0b>
      e948e8:	48 8d bc 24 50 0f 00 	lea    rdi,[rsp+0xf50]
      e948ef:	00 
      e948f0:	e8 f3 5e 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e948f5:	31 ff                	xor    edi,edi
      e948f7:	e8 20 9b c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e948fc:	6a 58                	push   0x58
      e948fe:	5f                   	pop    rdi
      e948ff:	e8 fc 95 95 00       	call   17edf00 <_Znwm@plt>
      e94904:	49 89 c6             	mov    r14,rax
      e94907:	66 0f ef c0          	pxor   xmm0,xmm0
      e9490b:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e94910:	48 8d 05 59 d1 99 00 	lea    rax,[rip+0x99d159]        # 1831a70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a08>
      e94917:	49 89 06             	mov    QWORD PTR [r14],rax
      e9491a:	48 8d 05 d7 f2 9a 00 	lea    rax,[rip+0x9af2d7]        # 1843bf8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e0>
      e94921:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      e94925:	4d 89 66 20          	mov    QWORD PTR [r14+0x20],r12
      e94929:	49 89 5e 28          	mov    QWORD PTR [r14+0x28],rbx
      e9492d:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e94932:	49 8d 7e 30          	lea    rdi,[r14+0x30]
      e94936:	48 8d 35 12 37 49 ff 	lea    rsi,[rip+0xffffffffff493712]        # 32804f <_ZTSSt12bad_any_cast@@Base-0x68179>
      e9493d:	6a 0a                	push   0xa
      e9493f:	5a                   	pop    rdx
      e94940:	e8 d5 80 c0 ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
      e94945:	49 8d 8d 70 04 00 00 	lea    rcx,[r13+0x470]
      e9494c:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e94950:	48 89 4c 24 60       	mov    QWORD PTR [rsp+0x60],rcx
      e94955:	66 0f 6f 01          	movdqa xmm0,XMMWORD PTR [rcx]
      e94959:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0
      e9495f:	48 85 c0             	test   rax,rax
      e94962:	74 05                	je     e94969 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bd7f>
      e94964:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e94969:	48 89 df             	mov    rdi,rbx
      e9496c:	e8 15 9b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e94971:	31 ff                	xor    edi,edi
      e94973:	e8 a4 9a c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e94978:	31 ff                	xor    edi,edi
      e9497a:	e8 07 9b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9497f:	48 8b bc 24 38 0a 00 	mov    rdi,QWORD PTR [rsp+0xa38]
      e94986:	00 
      e94987:	e8 fa 9a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9498c:	49 8b 9d e8 00 00 00 	mov    rbx,QWORD PTR [r13+0xe8]
      e94993:	6a 38                	push   0x38
      e94995:	5f                   	pop    rdi
      e94996:	4c 89 74 24 48       	mov    QWORD PTR [rsp+0x48],r14
      e9499b:	e8 60 95 95 00       	call   17edf00 <_Znwm@plt>
      e949a0:	49 89 c4             	mov    r12,rax
      e949a3:	66 0f ef c0          	pxor   xmm0,xmm0
      e949a7:	f3 41 0f 7f 44 24 08 	movdqu XMMWORD PTR [r12+0x8],xmm0
      e949ae:	48 8d 05 5b fa 9a 00 	lea    rax,[rip+0x9afa5b]        # 1844410 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xaf8>
      e949b5:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e949b9:	48 8d 05 88 fa 9a 00 	lea    rax,[rip+0x9afa88]        # 1844448 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xb30>
      e949c0:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
      e949c5:	f3 41 0f 7f 44 24 20 	movdqu XMMWORD PTR [r12+0x20],xmm0
      e949cc:	4c 89 a4 24 18 01 00 	mov    QWORD PTR [rsp+0x118],r12
      e949d3:	00 
      e949d4:	49 89 5c 24 30       	mov    QWORD PTR [r12+0x30],rbx
      e949d9:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]

## All code materializations of AP 0x1843bf8
### 0xe9491a: lea    rax,[rip+0x9af2d7]        # 1843bf8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e0>
      e948f5:	31 ff                	xor    edi,edi
      e948f7:	e8 20 9b c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e948fc:	6a 58                	push   0x58
      e948fe:	5f                   	pop    rdi
      e948ff:	e8 fc 95 95 00       	call   17edf00 <_Znwm@plt>
      e94904:	49 89 c6             	mov    r14,rax
      e94907:	66 0f ef c0          	pxor   xmm0,xmm0
      e9490b:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e94910:	48 8d 05 59 d1 99 00 	lea    rax,[rip+0x99d159]        # 1831a70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a08>
      e94917:	49 89 06             	mov    QWORD PTR [r14],rax
      e9491a:	48 8d 05 d7 f2 9a 00 	lea    rax,[rip+0x9af2d7]        # 1843bf8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e0>
      e94921:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      e94925:	4d 89 66 20          	mov    QWORD PTR [r14+0x20],r12
      e94929:	49 89 5e 28          	mov    QWORD PTR [r14+0x28],rbx
      e9492d:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e94932:	49 8d 7e 30          	lea    rdi,[r14+0x30]
      e94936:	48 8d 35 12 37 49 ff 	lea    rsi,[rip+0xffffffffff493712]        # 32804f <_ZTSSt12bad_any_cast@@Base-0x68179>
      e9493d:	6a 0a                	push   0xa
      e9493f:	5a                   	pop    rdx
      e94940:	e8 d5 80 c0 ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
      e94945:	49 8d 8d 70 04 00 00 	lea    rcx,[r13+0x470]
      e9494c:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e94950:	48 89 4c 24 60       	mov    QWORD PTR [rsp+0x60],rcx
      e94955:	66 0f 6f 01          	movdqa xmm0,XMMWORD PTR [rcx]
      e94959:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0
      e9495f:	48 85 c0             	test   rax,rax
      e94962:	74 05                	je     e94969 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bd7f>
      e94964:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e94969:	48 89 df             	mov    rdi,rbx
      e9496c:	e8 15 9b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e94971:	31 ff                	xor    edi,edi
      e94973:	e8 a4 9a c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e94978:	31 ff                	xor    edi,edi
      e9497a:	e8 07 9b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9497f:	48 8b bc 24 38 0a 00 	mov    rdi,QWORD PTR [rsp+0xa38]

### 0xfec7e0: lea    rax,[rip+0x857411]        # 1843bf8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e0>
      fec7ba:	e8 11 f6 67 00       	call   166bdd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff3c>
      fec7bf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fec7c6:	00 00 
      fec7c8:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
      fec7cd:	75 08                	jne    fec7d7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3bed>
      fec7cf:	48 89 df             	mov    rdi,rbx
      fec7d2:	e8 f9 34 a8 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      fec7d7:	e8 d4 32 80 00       	call   17efab0 <__stack_chk_fail@plt>
      fec7dc:	53                   	push   rbx
      fec7dd:	48 89 fb             	mov    rbx,rdi
      fec7e0:	48 8d 05 11 74 85 00 	lea    rax,[rip+0x857411]        # 1843bf8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e0>
      fec7e7:	48 89 07             	mov    QWORD PTR [rdi],rax
      fec7ea:	48 8b 7f 38          	mov    rdi,QWORD PTR [rdi+0x38]
      fec7ee:	e8 93 1c ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fec7f3:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
      fec7f7:	e8 94 16 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fec7fc:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      fec800:	5b                   	pop    rbx
      fec801:	e9 80 1c ab ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
      fec806:	53                   	push   rbx
      fec807:	48 89 fb             	mov    rbx,rdi
      fec80a:	e8 cd ff ff ff       	call   fec7dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3bf2>
      fec80f:	48 89 df             	mov    rdi,rbx
      fec812:	5b                   	pop    rbx
      fec813:	e9 08 17 80 00       	jmp    17edf20 <_ZdlPv@plt>
      fec818:	55                   	push   rbp
      fec819:	41 57                	push   r15
      fec81b:	41 56                	push   r14
      fec81d:	41 55                	push   r13
      fec81f:	41 54                	push   r12
      fec821:	53                   	push   rbx
      fec822:	48 83 ec 48          	sub    rsp,0x48
      fec826:	89 d5                	mov    ebp,edx
      fec828:	49 89 f7             	mov    r15,rsi
      fec82b:	49 89 fe             	mov    r14,rdi

