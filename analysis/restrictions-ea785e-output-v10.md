# Restrictions `ea785e` stack-output handling trace v10

Focus: classify `ea785e(stack output)` after the erased bridge calls at `e99c96/e99ca7`. Static analysis only.

## `ea785e` window `0xea785e`

```text
  ea77cd:	e8 2e 67 94 00       	call   17edf00 <_Znwm@plt>
  ea77d2:	48 8d 0d 47 9e 98 00 	lea    rcx,[rip+0x989e47]        # 1831620 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x35b8>
  ea77d9:	48 89 08             	mov    QWORD PTR [rax],rcx
  ea77dc:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
  ea77e0:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  ea77e4:	5b                   	pop    rbx
  ea77e5:	c3                   	ret
  ea77e6:	48 8d 05 33 9e 98 00 	lea    rax,[rip+0x989e33]        # 1831620 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x35b8>
  ea77ed:	48 89 06             	mov    QWORD PTR [rsi],rax
  ea77f0:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
  ea77f4:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  ea77f8:	c3                   	ret
  ea77f9:	cc                   	int3
  ea77fa:	53                   	push   rbx
  ea77fb:	48 81 ec 30 05 00 00 	sub    rsp,0x530
  ea7802:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ea7809:	00 00
  ea780b:	48 89 84 24 28 05 00 	mov    QWORD PTR [rsp+0x528],rax
  ea7812:	00
  ea7813:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
  ea7817:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  ea781a:	48 89 e7             	mov    rdi,rsp
  ea781d:	ff 50 78             	call   QWORD PTR [rax+0x78]
  ea7820:	48 89 e7             	mov    rdi,rsp
  ea7823:	80 bf 22 05 00 00 00 	cmp    BYTE PTR [rdi+0x522],0x0
  ea782a:	0f 95 c3             	setne  bl
  ea782d:	e8 2c 00 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  ea7832:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ea7839:	00 00
  ea783b:	48 3b 84 24 28 05 00 	cmp    rax,QWORD PTR [rsp+0x528]
  ea7842:	00
  ea7843:	75 0b                	jne    ea7850 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec66>
  ea7845:	89 d8                	mov    eax,ebx
  ea7847:	48 81 c4 30 05 00 00 	add    rsp,0x530
  ea784e:	5b                   	pop    rbx
  ea784f:	c3                   	ret
  ea7850:	e8 5b 82 94 00       	call   17efab0 <__stack_chk_fail@plt>
  ea7855:	48 89 c7             	mov    rdi,rax
  ea7858:	e8 48 22 bd ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  ea785d:	cc                   	int3
  ea785e:	53                   	push   rbx
  ea785f:	48 89 fb             	mov    rbx,rdi
  ea7862:	48 81 c7 a8 00 00 00 	add    rdi,0xa8
  ea7869:	e8 58 50 f6 ff       	call   e0c8c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd994c>
  ea786e:	48 83 c3 70          	add    rbx,0x70
  ea7872:	48 89 df             	mov    rdi,rbx
  ea7875:	5b                   	pop    rbx
  ea7876:	e9 b7 58 c0 ff       	jmp    aad132 <JNI_OnUnload@@Base+0x349ff>
  ea787b:	cc                   	int3
  ea787c:	53                   	push   rbx
  ea787d:	48 89 fb             	mov    rbx,rdi
  ea7880:	6a 10                	push   0x10
  ea7882:	5f                   	pop    rdi
  ea7883:	e8 78 66 94 00       	call   17edf00 <_Znwm@plt>
  ea7888:	48 8d 0d 49 9d 98 00 	lea    rcx,[rip+0x989d49]        # 18315d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3570>
  ea788f:	48 89 08             	mov    QWORD PTR [rax],rcx
  ea7892:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
  ea7896:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  ea789a:	5b                   	pop    rbx
  ea789b:	c3                   	ret
  ea789c:	48 8d 05 35 9d 98 00 	lea    rax,[rip+0x989d35]        # 18315d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3570>
  ea78a3:	48 89 06             	mov    QWORD PTR [rsi],rax
  ea78a6:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
  ea78aa:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  ea78ae:	c3                   	ret
  ea78af:	cc                   	int3
  ea78b0:	41 57                	push   r15
  ea78b2:	41 56                	push   r14
  ea78b4:	41 54                	push   r12
  ea78b6:	53                   	push   rbx
  ea78b7:	48 81 ec a8 00 00 00 	sub    rsp,0xa8
  ea78be:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ea78c5:	00 00
  ea78c7:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
  ea78ce:	00
  ea78cf:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
  ea78d3:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
  ea78d8:	4c 89 f7             	mov    rdi,r14
  ea78db:	e8 ea eb c4 ff       	call   af64ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4346a>
  ea78e0:	48 8d 05 31 a3 5a ff 	lea    rax,[rip+0xffffffffff5aa331]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
  ea78e7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  ea78ec:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  ea78f1:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
  ea78f7:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  ea78fc:	4c 89 f6             	mov    rsi,r14
  ea78ff:	e8 c6 eb c4 ff       	call   af64ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4346a>
  ea7904:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
  ea790b:	00 00
  ea790d:	48 83 a4 24 90 00 00 	and    QWORD PTR [rsp+0x90],0x0
  ea7914:	00 00
  ea7916:	6a 30                	push   0x30
  ea7918:	5f                   	pop    rdi
  ea7919:	e8 e2 65 94 00       	call   17edf00 <_Znwm@plt>
  ea791e:	49 89 c6             	mov    r14,rax
  ea7921:	4c 8d 7c 24 50       	lea    r15,[rsp+0x50]
  ea7926:	48 89 c7             	mov    rdi,rax
  ea7929:	4c 89 fe             	mov    rsi,r15
  ea792c:	e8 99 eb c4 ff       	call   af64ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4346a>
  ea7931:	4c 8d a4 24 80 00 00 	lea    r12,[rsp+0x80]
  ea7938:	00
  ea7939:	4d 89 34 24          	mov    QWORD PTR [r12],r14
  ea793d:	48 8d 05 6a 2b c5 ff 	lea    rax,[rip+0xffffffffffc52b6a]        # afa4ae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4744e>
  ea7944:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
  ea7949:	48 8d 05 6e 00 00 00 	lea    rax,[rip+0x6e]        # ea79be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6edd4>
  ea7950:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
  ea7955:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
  ea795a:	48 89 df             	mov    rdi,rbx
  ea795d:	4c 89 e2             	mov    rdx,r12
  ea7960:	e8 23 9b 91 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>
  ea7965:	4c 89 e7             	mov    rdi,r12
  ea7968:	e8 31 f9 bf ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  ea796d:	4c 89 ff             	mov    rdi,r15
  ea7970:	e8 6b 2b c5 ff       	call   afa4e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x47480>
  ea7975:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  ea797a:	e8 eb 25 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  ea797f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ea7986:	00 00
  ea7988:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
  ea798f:	00
  ea7990:	75 0f                	jne    ea79a1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6edb7>
  ea7992:	48 81 c4 a8 00 00 00 	add    rsp,0xa8
  ea7999:	5b                   	pop    rbx
  ea799a:	41 5c                	pop    r12
  ea799c:	41 5e                	pop    r14
  ea799e:	41 5f                	pop    r15
  ea79a0:	c3                   	ret
  ea79a1:	e8 0a 81 94 00       	call   17efab0 <__stack_chk_fail@plt>
  ea79a6:	48 89 c3             	mov    rbx,rax
  ea79a9:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  ea79b0:	00
  ea79b1:	e8 e8 f8 bf ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  ea79b6:	48 89 df             	mov    rdi,rbx
  ea79b9:	e8 e7 20 bd ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  ea79be:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  ea79c1:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
  ea79c5:	e9 00 00 00 00       	jmp    ea79ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ede0>
  ea79ca:	50                   	push   rax
  ea79cb:	e8 92 2a bd ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
  ea79d0:	58                   	pop    rax
  ea79d1:	c3                   	ret
  ea79d2:	48 89 c7             	mov    rdi,rax
  ea79d5:	e8 cb 20 bd ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  ea79da:	48 8d 05 bf 9b 98 00 	lea    rax,[rip+0x989bbf]        # 18315a0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3538>
  ea79e1:	48 89 07             	mov    QWORD PTR [rdi],rax
  ea79e4:	e9 27 66 94 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  ea79e9:	cc                   	int3
  ea79ea:	53                   	push   rbx
  ea79eb:	48 89 fb             	mov    rbx,rdi
  ea79ee:	e8 e7 ff ff ff       	call   ea79da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6edf0>
  ea79f3:	48 89 df             	mov    rdi,rbx
  ea79f6:	5b                   	pop    rbx
  ea79f7:	e9 24 65 94 00       	jmp    17edf20 <_ZdlPv@plt>
  ea79fc:	41 57                	push   r15
  ea79fe:	41 56                	push   r14
  ea7a00:	53                   	push   rbx
  ea7a01:	48 89 fb             	mov    rbx,rdi
  ea7a04:	48 81 c7 d0 00 00 00 	add    rdi,0xd0
  ea7a0b:	e8 98 52 ee ff       	call   d8cca8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59d2e>
  ea7a10:	4c 8b b3 b8 00 00 00 	mov    r14,QWORD PTR [rbx+0xb8]
  ea7a17:	4d 85 f6             	test   r14,r14
  ea7a1a:	74 1c                	je     ea7a38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ee4e>
  ea7a1c:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
  ea7a1f:	49 8d 7e 10          	lea    rdi,[r14+0x10]
  ea7a23:	e8 6c 00 00 00       	call   ea7a94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6eeaa>
  ea7a28:	4c 89 f7             	mov    rdi,r14
  ea7a2b:	e8 f0 64 94 00       	call   17edf20 <_ZdlPv@plt>
  ea7a30:	4d 89 fe             	mov    r14,r15
  ea7a33:	4d 85 ff             	test   r15,r15
  ea7a36:	75 e4                	jne    ea7a1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ee32>
  ea7a38:	48 8b bb a8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xa8]
  ea7a3f:	48 83 a3 a8 00 00 00 	and    QWORD PTR [rbx+0xa8],0x0
  ea7a46:	00
  ea7a47:	48 85 ff             	test   rdi,rdi
  ea7a4a:	74 05                	je     ea7a51 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ee67>
  ea7a4c:	e8 cf 64 94 00       	call   17edf20 <_ZdlPv@plt>
  ea7a51:	48 8b bb 90 00 00 00 	mov    rdi,QWORD PTR [rbx+0x90]
  ea7a58:	e8 81 00 00 00       	call   ea7ade <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6eef4>
  ea7a5d:	48 8b bb 80 00 00 00 	mov    rdi,QWORD PTR [rbx+0x80]
  ea7a64:	48 83 a3 80 00 00 00 	and    QWORD PTR [rbx+0x80],0x0
  ea7a6b:	00
  ea7a6c:	48 85 ff             	test   rdi,rdi
  ea7a6f:	74 05                	je     ea7a76 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ee8c>
  ea7a71:	e8 aa 64 94 00       	call   17edf20 <_ZdlPv@plt>
  ea7a76:	4c 8d 73 20          	lea    r14,[rbx+0x20]
  ea7a7a:	48 83 c3 50          	add    rbx,0x50
  ea7a7e:	48 89 df             	mov    rdi,rbx
  ea7a81:	e8 e4 24 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  ea7a86:	4c 89 f7             	mov    rdi,r14
  ea7a89:	5b                   	pop    rbx
  ea7a8a:	41 5e                	pop    r14
```
## `aab330` window `0xaab330`

```text
  aab29e:	e9 0b fd ff ff       	jmp    aaafae <JNI_OnUnload@@Base+0x3287b>
  aab2a3:	e8 08 48 d4 00       	call   17efab0 <__stack_chk_fail@plt>
  aab2a8:	48 89 c3             	mov    rbx,rax
  aab2ab:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  aab2b0:	e8 37 0b 00 00       	call   aabdec <JNI_OnUnload@@Base+0x336b9>
  aab2b5:	eb 18                	jmp    aab2cf <JNI_OnUnload@@Base+0x32b9c>
  aab2b7:	48 89 c3             	mov    rbx,rax
  aab2ba:	4c 89 ff             	mov    rdi,r15
  aab2bd:	e8 66 eb fc ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
  aab2c2:	4c 89 ff             	mov    rdi,r15
  aab2c5:	e8 56 2c d4 00       	call   17edf20 <_ZdlPv@plt>
  aab2ca:	eb 03                	jmp    aab2cf <JNI_OnUnload@@Base+0x32b9c>
  aab2cc:	48 89 c3             	mov    rbx,rax
  aab2cf:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  aab2d4:	48 83 64 24 28 00    	and    QWORD PTR [rsp+0x28],0x0
  aab2da:	48 85 ff             	test   rdi,rdi
  aab2dd:	74 0b                	je     aab2ea <JNI_OnUnload@@Base+0x32bb7>
  aab2df:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  aab2e2:	ff 50 08             	call   QWORD PTR [rax+0x8]
  aab2e5:	eb 03                	jmp    aab2ea <JNI_OnUnload@@Base+0x32bb7>
  aab2e7:	48 89 c3             	mov    rbx,rax
  aab2ea:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  aab2ef:	e8 3c 0b 00 00       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
  aab2f4:	eb 31                	jmp    aab327 <JNI_OnUnload@@Base+0x32bf4>
  aab2f6:	48 89 c3             	mov    rbx,rax
  aab2f9:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
  aab2fe:	e8 83 31 ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  aab303:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
  aab307:	e8 a6 31 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  aab30c:	31 ff                	xor    edi,edi
  aab30e:	e8 9f 31 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  aab313:	31 ff                	xor    edi,edi
  aab315:	e8 98 31 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  aab31a:	4c 89 f7             	mov    rdi,r14
  aab31d:	e8 fe 2b d4 00       	call   17edf20 <_ZdlPv@plt>
  aab322:	eb 03                	jmp    aab327 <JNI_OnUnload@@Base+0x32bf4>
  aab324:	48 89 c3             	mov    rbx,rax
  aab327:	48 89 df             	mov    rdi,rbx
  aab32a:	e8 76 e7 fc ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  aab32f:	cc                   	int3
  aab330:	41 56                	push   r14
  aab332:	53                   	push   rbx
  aab333:	50                   	push   rax
  aab334:	48 89 fb             	mov    rbx,rdi
  aab337:	0f 57 c0             	xorps  xmm0,xmm0
  aab33a:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
  aab33d:	48 8b 7e 08          	mov    rdi,QWORD PTR [rsi+0x8]
  aab341:	48 85 ff             	test   rdi,rdi
  aab344:	74 17                	je     aab35d <JNI_OnUnload@@Base+0x32c2a>
  aab346:	49 89 f6             	mov    r14,rsi
  aab349:	e8 f2 2d d4 00       	call   17ee140 <_ZNSt6__ndk119__shared_weak_count4lockEv@plt>
  aab34e:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
  aab352:	48 85 c0             	test   rax,rax
  aab355:	74 06                	je     aab35d <JNI_OnUnload@@Base+0x32c2a>
  aab357:	49 8b 06             	mov    rax,QWORD PTR [r14]
  aab35a:	48 89 03             	mov    QWORD PTR [rbx],rax
  aab35d:	48 83 c4 08          	add    rsp,0x8
  aab361:	5b                   	pop    rbx
  aab362:	41 5e                	pop    r14
  aab364:	c3                   	ret
  aab365:	cc                   	int3
  aab366:	48 8b 05 d3 81 f3 00 	mov    rax,QWORD PTR [rip+0xf381d3]        # 19e3540 <__cxa_new_handler@@Base+0x2dd0>
  aab36d:	48 85 c0             	test   rax,rax
  aab370:	74 01                	je     aab373 <JNI_OnUnload@@Base+0x32c40>
  aab372:	c3                   	ret
  aab373:	50                   	push   rax
  aab374:	e8 46 ec fc ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  aab379:	cc                   	int3
  aab37a:	48 83 c7 08          	add    rdi,0x8
  aab37e:	e9 d5 0a 00 00       	jmp    aabe58 <JNI_OnUnload@@Base+0x33725>
  aab383:	cc                   	int3
  aab384:	53                   	push   rbx
  aab385:	48 89 fb             	mov    rbx,rdi
  aab388:	48 83 c7 08          	add    rdi,0x8
  aab38c:	e8 c7 0a 00 00       	call   aabe58 <JNI_OnUnload@@Base+0x33725>
  aab391:	48 89 df             	mov    rdi,rbx
  aab394:	5b                   	pop    rbx
  aab395:	e9 86 2b d4 00       	jmp    17edf20 <_ZdlPv@plt>
  aab39a:	50                   	push   rax
  aab39b:	48 83 c7 28          	add    rdi,0x28
  aab39f:	e8 02 06 00 00       	call   aab9a6 <JNI_OnUnload@@Base+0x33273>
  aab3a4:	59                   	pop    rcx
  aab3a5:	c3                   	ret
  aab3a6:	55                   	push   rbp
  aab3a7:	41 57                	push   r15
  aab3a9:	41 56                	push   r14
  aab3ab:	41 55                	push   r13
  aab3ad:	41 54                	push   r12
  aab3af:	53                   	push   rbx
  aab3b0:	48 83 ec 68          	sub    rsp,0x68
  aab3b4:	45 89 c6             	mov    r14d,r8d
  aab3b7:	89 4c 24 04          	mov    DWORD PTR [rsp+0x4],ecx
  aab3bb:	49 89 ff             	mov    r15,rdi
  aab3be:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  aab3c5:	00 00
  aab3c7:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
  aab3cc:	48 8d 77 08          	lea    rsi,[rdi+0x8]
  aab3d0:	48 8b 6f 28          	mov    rbp,QWORD PTR [rdi+0x28]
  aab3d4:	48 8b 5f 30          	mov    rbx,QWORD PTR [rdi+0x30]
  aab3d8:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
  aab3dd:	4c 89 e7             	mov    rdi,r12
  aab3e0:	e8 4b ff ff ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  aab3e5:	4d 8b 2c 24          	mov    r13,QWORD PTR [r12]
  aab3e9:	4d 85 ed             	test   r13,r13
  aab3ec:	74 53                	je     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab3ee:	4d 8b 67 18          	mov    r12,QWORD PTR [r15+0x18]
  aab3f2:	4d 85 e4             	test   r12,r12
  aab3f5:	74 46                	je     aab43d <JNI_OnUnload@@Base+0x32d0a>
  aab3f7:	48 89 e8             	mov    rax,rbp
  aab3fa:	31 ed                	xor    ebp,ebp
  aab3fc:	48 85 c0             	test   rax,rax
  aab3ff:	74 40                	je     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab401:	48 85 db             	test   rbx,rbx
  aab404:	78 3b                	js     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab406:	49 89 c7             	mov    r15,rax
  aab409:	44 89 f0             	mov    eax,r14d
  aab40c:	8b 54 24 04          	mov    edx,DWORD PTR [rsp+0x4]
  aab410:	09 d0                	or     eax,edx
  aab412:	78 2d                	js     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab414:	41 8b 8c 24 e0 13 00 	mov    ecx,DWORD PTR [r12+0x13e0]
  aab41b:	00
  aab41c:	8d 41 fd             	lea    eax,[rcx-0x3]
  aab41f:	83 f8 fe             	cmp    eax,0xfffffffe
  aab422:	72 1d                	jb     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab424:	89 d0                	mov    eax,edx
  aab426:	31 ed                	xor    ebp,ebp
  aab428:	48 29 c3             	sub    rbx,rax
  aab42b:	72 14                	jb     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab42d:	44 89 f2             	mov    edx,r14d
  aab430:	48 39 d3             	cmp    rbx,rdx
  aab433:	72 0c                	jb     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab435:	4c 89 fa             	mov    rdx,r15
  aab438:	4c 01 f8             	add    rax,r15
  aab43b:	73 3c                	jae    aab479 <JNI_OnUnload@@Base+0x32d46>
  aab43d:	31 ed                	xor    ebp,ebp
  aab43f:	eb 00                	jmp    aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab441:	4d 85 ed             	test   r13,r13
  aab444:	0f 95 c3             	setne  bl
  aab447:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  aab44c:	e8 35 30 ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  aab451:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  aab458:	00 00
  aab45a:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
  aab45f:	0f 85 39 01 00 00    	jne    aab59e <JNI_OnUnload@@Base+0x32e6b>
  aab465:	40 20 eb             	and    bl,bpl
  aab468:	89 d8                	mov    eax,ebx
  aab46a:	48 83 c4 68          	add    rsp,0x68
  aab46e:	5b                   	pop    rbx
  aab46f:	41 5c                	pop    r12
  aab471:	41 5d                	pop    r13
  aab473:	41 5e                	pop    r14
  aab475:	41 5f                	pop    r15
  aab477:	5d                   	pop    rbp
  aab478:	c3                   	ret
  aab479:	31 ed                	xor    ebp,ebp
  aab47b:	48 85 c0             	test   rax,rax
  aab47e:	74 c1                	je     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab480:	83 e0 01             	and    eax,0x1
  aab483:	75 bc                	jne    aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab485:	01 c9                	add    ecx,ecx
  aab487:	31 ed                	xor    ebp,ebp
  aab489:	44 89 f0             	mov    eax,r14d
  aab48c:	31 d2                	xor    edx,edx
  aab48e:	f7 f1                	div    ecx
  aab490:	85 d2                	test   edx,edx
  aab492:	75 ad                	jne    aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab494:	45 85 f6             	test   r14d,r14d
  aab497:	74 47                	je     aab4e0 <JNI_OnUnload@@Base+0x32dad>
  aab499:	49 8b 9c 24 e8 13 00 	mov    rbx,QWORD PTR [r12+0x13e8]
  aab4a0:	00
  aab4a1:	49 83 a4 24 e8 13 00 	and    QWORD PTR [r12+0x13e8],0x0
  aab4a8:	00 00
  aab4aa:	4d 63 f6             	movsxd r14,r14d
  aab4ad:	49 d1 ee             	shr    r14,1
  aab4b0:	48 89 5c 24 38       	mov    QWORD PTR [rsp+0x38],rbx
  aab4b5:	48 85 db             	test   rbx,rbx
  aab4b8:	74 2e                	je     aab4e8 <JNI_OnUnload@@Base+0x32db5>
  aab4ba:	6a 01                	push   0x1
  aab4bc:	5a                   	pop    rdx
  aab4bd:	48 89 df             	mov    rdi,rbx
  aab4c0:	4c 89 f6             	mov    rsi,r14
  aab4c3:	e8 fe f5 aa 00       	call   155aac6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a004a>
  aab4c8:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  aab4cb:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  aab4cf:	4c 89 73 20          	mov    QWORD PTR [rbx+0x20],r14
  aab4d3:	c6 43 28 00          	mov    BYTE PTR [rbx+0x28],0x0
  aab4d7:	c7 43 2c 00 00 80 3f 	mov    DWORD PTR [rbx+0x2c],0x3f800000
  aab4de:	eb 66                	jmp    aab546 <JNI_OnUnload@@Base+0x32e13>
  aab4e0:	40 b5 01             	mov    bpl,0x1
  aab4e3:	e9 59 ff ff ff       	jmp    aab441 <JNI_OnUnload@@Base+0x32d0e>
```
## `a9e486` window `0xa9e486`

```text
  a9e401:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
  a9e408:	00 00
  a9e40a:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
  a9e40f:	75 05                	jne    a9e416 <JNI_OnUnload@@Base+0x25ce3>
  a9e411:	48 83 c4 18          	add    rsp,0x18
  a9e415:	c3                   	ret
  a9e416:	e8 95 16 d5 00       	call   17efab0 <__stack_chk_fail@plt>
  a9e41b:	cc                   	int3
  a9e41c:	48 85 ff             	test   rdi,rdi
  a9e41f:	0f 85 fb fa d4 00    	jne    17edf20 <_ZdlPv@plt>
  a9e425:	c3                   	ret
  a9e426:	53                   	push   rbx
  a9e427:	48 89 37             	mov    QWORD PTR [rdi],rsi
  a9e42a:	48 89 57 08          	mov    QWORD PTR [rdi+0x8],rdx
  a9e42e:	48 8d 46 08          	lea    rax,[rsi+0x8]
  a9e432:	48 85 f6             	test   rsi,rsi
  a9e435:	48 0f 44 c6          	cmove  rax,rsi
  a9e439:	74 16                	je     a9e451 <JNI_OnUnload@@Base+0x25d1e>
  a9e43b:	48 89 d3             	mov    rbx,rdx
  a9e43e:	48 8b 48 08          	mov    rcx,QWORD PTR [rax+0x8]
  a9e442:	48 85 c9             	test   rcx,rcx
  a9e445:	74 0c                	je     a9e453 <JNI_OnUnload@@Base+0x25d20>
  a9e447:	48 8b 49 08          	mov    rcx,QWORD PTR [rcx+0x8]
  a9e44b:	48 83 f9 ff          	cmp    rcx,0xffffffffffffffff
  a9e44f:	74 02                	je     a9e453 <JNI_OnUnload@@Base+0x25d20>
  a9e451:	5b                   	pop    rbx
  a9e452:	c3                   	ret
  a9e453:	66 48 0f 6e cb       	movq   xmm1,rbx
  a9e458:	66 48 0f 6e c6       	movq   xmm0,rsi
  a9e45d:	66 0f 6c c1          	punpcklqdq xmm0,xmm1
  a9e461:	48 85 db             	test   rbx,rbx
  a9e464:	74 0a                	je     a9e470 <JNI_OnUnload@@Base+0x25d3d>
  a9e466:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  a9e46b:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
  a9e470:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
  a9e474:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
  a9e478:	e8 35 00 00 00       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  a9e47d:	48 89 df             	mov    rdi,rbx
  a9e480:	5b                   	pop    rbx
  a9e481:	e9 00 00 00 00       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  a9e486:	48 85 ff             	test   rdi,rdi
  a9e489:	0f 85 01 00 00 00    	jne    a9e490 <JNI_OnUnload@@Base+0x25d5d>
  a9e48f:	c3                   	ret
  a9e490:	6a ff                	push   0xffffffffffffffff
  a9e492:	58                   	pop    rax
  a9e493:	f0 48 0f c1 47 08    	lock xadd QWORD PTR [rdi+0x8],rax
  a9e499:	48 85 c0             	test   rax,rax
  a9e49c:	74 01                	je     a9e49f <JNI_OnUnload@@Base+0x25d6c>
  a9e49e:	c3                   	ret
  a9e49f:	53                   	push   rbx
  a9e4a0:	48 89 fb             	mov    rbx,rdi
  a9e4a3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a9e4a6:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a9e4a9:	48 89 df             	mov    rdi,rbx
  a9e4ac:	5b                   	pop    rbx
  a9e4ad:	e9 3e fb d4 00       	jmp    17edff0 <_ZNSt6__ndk119__shared_weak_count14__release_weakEv@plt>
  a9e4b2:	48 85 ff             	test   rdi,rdi
  a9e4b5:	0f 85 35 fb d4 00    	jne    17edff0 <_ZNSt6__ndk119__shared_weak_count14__release_weakEv@plt>
  a9e4bb:	c3                   	ret
  a9e4bc:	48 8d 05 a5 ef d5 00 	lea    rax,[rip+0xd5efa5]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
  a9e4c3:	48 89 07             	mov    QWORD PTR [rdi],rax
  a9e4c6:	e9 45 fb d4 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  a9e4cb:	cc                   	int3
  a9e4cc:	53                   	push   rbx
  a9e4cd:	48 89 fb             	mov    rbx,rdi
  a9e4d0:	e8 e7 ff ff ff       	call   a9e4bc <JNI_OnUnload@@Base+0x25d89>
  a9e4d5:	48 89 df             	mov    rdi,rbx
  a9e4d8:	5b                   	pop    rbx
  a9e4d9:	e9 42 fa d4 00       	jmp    17edf20 <_ZdlPv@plt>
  a9e4de:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
  a9e4e2:	48 83 c7 18          	add    rdi,0x18
  a9e4e6:	ff 20                	jmp    QWORD PTR [rax]
  a9e4e8:	31 c0                	xor    eax,eax
  a9e4ea:	31 c9                	xor    ecx,ecx
  a9e4ec:	49 89 c0             	mov    r8,rax
  a9e4ef:	49 c1 e0 08          	shl    r8,0x8
  a9e4f3:	0f b6 04 0f          	movzx  eax,BYTE PTR [rdi+rcx*1]
  a9e4f7:	4c 09 c0             	or     rax,r8
  a9e4fa:	48 ff c1             	inc    rcx
  a9e4fd:	48 83 f9 08          	cmp    rcx,0x8
  a9e501:	75 e9                	jne    a9e4ec <JNI_OnUnload@@Base+0x25db9>
  a9e503:	31 c9                	xor    ecx,ecx
  a9e505:	45 31 c0             	xor    r8d,r8d
  a9e508:	4d 89 c1             	mov    r9,r8
  a9e50b:	49 c1 e1 08          	shl    r9,0x8
  a9e50f:	44 0f b6 44 0f 08    	movzx  r8d,BYTE PTR [rdi+rcx*1+0x8]
  a9e515:	4d 09 c8             	or     r8,r9
  a9e518:	48 ff c1             	inc    rcx
  a9e51b:	48 83 f9 08          	cmp    rcx,0x8
  a9e51f:	75 e7                	jne    a9e508 <JNI_OnUnload@@Base+0x25dd5>
  a9e521:	48 89 06             	mov    QWORD PTR [rsi],rax
  a9e524:	4c 89 02             	mov    QWORD PTR [rdx],r8
  a9e527:	c3                   	ret
  a9e528:	55                   	push   rbp
  a9e529:	41 57                	push   r15
  a9e52b:	41 56                	push   r14
  a9e52d:	41 55                	push   r13
  a9e52f:	41 54                	push   r12
  a9e531:	53                   	push   rbx
  a9e532:	48 83 ec 68          	sub    rsp,0x68
  a9e536:	49 89 f6             	mov    r14,rsi
  a9e539:	49 89 fc             	mov    r12,rdi
  a9e53c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a9e543:	00 00
  a9e545:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
  a9e54a:	0f 57 c0             	xorps  xmm0,xmm0
  a9e54d:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
  a9e552:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
  a9e557:	49 89 d5             	mov    r13,rdx
  a9e55a:	8b 72 10             	mov    esi,DWORD PTR [rdx+0x10]
  a9e55d:	48 8b 15 a4 4d f4 00 	mov    rdx,QWORD PTR [rip+0xf44da4]        # 19e3308 <__cxa_new_handler@@Base+0x2b98>
  a9e564:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a9e567:	4c 89 f7             	mov    rdi,r14
  a9e56a:	31 c9                	xor    ecx,ecx
  a9e56c:	ff 90 60 05 00 00    	call   QWORD PTR [rax+0x560]
  a9e572:	48 89 c3             	mov    rbx,rax
  a9e575:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
  a9e57a:	4c 89 ff             	mov    rdi,r15
  a9e57d:	e8 44 77 d3 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>
  a9e582:	4d 89 37             	mov    QWORD PTR [r15],r14
  a9e585:	49 89 5f 08          	mov    QWORD PTR [r15+0x8],rbx
  a9e589:	48 85 db             	test   rbx,rbx
  a9e58c:	0f 84 23 01 00 00    	je     a9e6b5 <JNI_OnUnload@@Base+0x25f82>
  a9e592:	41 8b 75 10          	mov    esi,DWORD PTR [r13+0x10]
  a9e596:	48 8b 15 6b 4d f4 00 	mov    rdx,QWORD PTR [rip+0xf44d6b]        # 19e3308 <__cxa_new_handler@@Base+0x2b98>
  a9e59d:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a9e5a0:	4c 89 f7             	mov    rdi,r14
  a9e5a3:	31 c9                	xor    ecx,ecx
  a9e5a5:	ff 90 60 05 00 00    	call   QWORD PTR [rax+0x560]
  a9e5ab:	48 89 c5             	mov    rbp,rax
  a9e5ae:	48 8d 5c 24 50       	lea    rbx,[rsp+0x50]
  a9e5b3:	48 89 df             	mov    rdi,rbx
  a9e5b6:	e8 0b 77 d3 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>
  a9e5bb:	4c 89 33             	mov    QWORD PTR [rbx],r14
  a9e5be:	48 89 6b 08          	mov    QWORD PTR [rbx+0x8],rbp
  a9e5c2:	48 85 ed             	test   rbp,rbp
  a9e5c5:	0f 84 f8 00 00 00    	je     a9e6c3 <JNI_OnUnload@@Base+0x25f90>
  a9e5cb:	4c 89 e8             	mov    rax,r13
  a9e5ce:	4d 8b 6d 00          	mov    r13,QWORD PTR [r13+0x0]
  a9e5d2:	48 83 c0 08          	add    rax,0x8
  a9e5d6:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  a9e5db:	49 39 c5             	cmp    r13,rax
  a9e5de:	0f 84 f4 00 00 00    	je     a9e6d8 <JNI_OnUnload@@Base+0x25fa5>
  a9e5e4:	4c 89 34 24          	mov    QWORD PTR [rsp],r14
  a9e5e8:	4c 89 64 24 10       	mov    QWORD PTR [rsp+0x10],r12
  a9e5ed:	31 db                	xor    ebx,ebx
  a9e5ef:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
  a9e5f4:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  a9e5f9:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
  a9e5fe:	49 8d 7d 20          	lea    rdi,[r13+0x20]
  a9e602:	49 89 ec             	mov    r12,rbp
  a9e605:	49 8d 6d 38          	lea    rbp,[r13+0x38]
  a9e609:	e8 28 d2 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  a9e60e:	48 89 d1             	mov    rcx,rdx
  a9e611:	4d 89 fe             	mov    r14,r15
  a9e614:	4c 89 ff             	mov    rdi,r15
  a9e617:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
  a9e61b:	4c 89 fe             	mov    rsi,r15
  a9e61e:	48 89 c2             	mov    rdx,rax
  a9e621:	e8 4f 71 d3 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>
  a9e626:	48 89 ef             	mov    rdi,rbp
  a9e629:	4c 89 e5             	mov    rbp,r12
  a9e62c:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
  a9e631:	e8 00 d2 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  a9e636:	48 89 d1             	mov    rcx,rdx
  a9e639:	4c 89 e7             	mov    rdi,r12
  a9e63c:	4c 89 fe             	mov    rsi,r15
  a9e63f:	48 89 c2             	mov    rdx,rax
  a9e642:	e8 2e 71 d3 00       	call   17d5775 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1596>
  a9e647:	48 8b 4c 24 38       	mov    rcx,QWORD PTR [rsp+0x38]
  a9e64c:	49 8b 07             	mov    rax,QWORD PTR [r15]
  a9e64f:	4c 89 ff             	mov    rdi,r15
  a9e652:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
  a9e657:	89 da                	mov    edx,ebx
  a9e659:	ff 90 70 05 00 00    	call   QWORD PTR [rax+0x570]
  a9e65f:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
  a9e664:	49 8b 07             	mov    rax,QWORD PTR [r15]
  a9e667:	4c 89 ff             	mov    rdi,r15
  a9e66a:	48 89 ee             	mov    rsi,rbp
  a9e66d:	89 da                	mov    edx,ebx
  a9e66f:	ff 90 70 05 00 00    	call   QWORD PTR [rax+0x570]
  a9e675:	ff c3                	inc    ebx
  a9e677:	4c 89 e7             	mov    rdi,r12
  a9e67a:	e8 47 76 d3 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>
  a9e67f:	4d 89 f7             	mov    r15,r14
  a9e682:	4c 89 f7             	mov    rdi,r14
  a9e685:	e8 3c 76 d3 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>
  a9e68a:	4c 89 ef             	mov    rdi,r13
  a9e68d:	e8 50 01 00 00       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
  a9e692:	49 89 c5             	mov    r13,rax
```
## `aa6d30` window `0xaa6d30`

```text
  aa6c88:	6a 20                	push   0x20
  aa6c8a:	5e                   	pop    rsi
  aa6c8b:	ff 50 40             	call   QWORD PTR [rax+0x40]
  aa6c8e:	48 85 c0             	test   rax,rax
  aa6c91:	74 02                	je     aa6c95 <JNI_OnUnload@@Base+0x2e562>
  aa6c93:	59                   	pop    rcx
  aa6c94:	c3                   	ret
  aa6c95:	e8 25 33 fd ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  aa6c9a:	48 8b 05 67 ca f3 00 	mov    rax,QWORD PTR [rip+0xf3ca67]        # 19e3708 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x138>
  aa6ca1:	48 85 c0             	test   rax,rax
  aa6ca4:	74 01                	je     aa6ca7 <JNI_OnUnload@@Base+0x2e574>
  aa6ca6:	c3                   	ret
  aa6ca7:	50                   	push   rax
  aa6ca8:	e8 12 33 fd ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  aa6cad:	cc                   	int3
  aa6cae:	53                   	push   rbx
  aa6caf:	48 89 fb             	mov    rbx,rdi
  aa6cb2:	48 81 c7 68 04 00 00 	add    rdi,0x468
  aa6cb9:	e8 72 00 00 00       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  aa6cbe:	48 8d bb 50 04 00 00 	lea    rdi,[rbx+0x450]
  aa6cc5:	e8 c6 71 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6cca:	48 8d bb e8 03 00 00 	lea    rdi,[rbx+0x3e8]
  aa6cd1:	e8 66 00 00 00       	call   aa6d3c <JNI_OnUnload@@Base+0x2e609>
  aa6cd6:	48 8d bb a8 03 00 00 	lea    rdi,[rbx+0x3a8]
  aa6cdd:	e8 7a 00 00 00       	call   aa6d5c <JNI_OnUnload@@Base+0x2e629>
  aa6ce2:	48 8d bb 30 03 00 00 	lea    rdi,[rbx+0x330]
  aa6ce9:	e8 7a 00 00 00       	call   aa6d68 <JNI_OnUnload@@Base+0x2e635>
  aa6cee:	48 8d bb a0 02 00 00 	lea    rdi,[rbx+0x2a0]
  aa6cf5:	e8 88 00 00 00       	call   aa6d82 <JNI_OnUnload@@Base+0x2e64f>
  aa6cfa:	48 8d bb 90 01 00 00 	lea    rdi,[rbx+0x190]
  aa6d01:	e8 a8 00 00 00       	call   aa6dae <JNI_OnUnload@@Base+0x2e67b>
  aa6d06:	48 8d bb 40 01 00 00 	lea    rdi,[rbx+0x140]
  aa6d0d:	e8 bc 00 00 00       	call   aa6dce <JNI_OnUnload@@Base+0x2e69b>
  aa6d12:	48 8d bb b0 00 00 00 	lea    rdi,[rbx+0xb0]
  aa6d19:	e8 d0 00 00 00       	call   aa6dee <JNI_OnUnload@@Base+0x2e6bb>
  aa6d1e:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
  aa6d22:	e8 01 01 00 00       	call   aa6e28 <JNI_OnUnload@@Base+0x2e6f5>
  aa6d27:	48 89 df             	mov    rdi,rbx
  aa6d2a:	5b                   	pop    rbx
  aa6d2b:	e9 24 01 00 00       	jmp    aa6e54 <JNI_OnUnload@@Base+0x2e721>
  aa6d30:	80 7f 18 00          	cmp    BYTE PTR [rdi+0x18],0x0
  aa6d34:	0f 85 56 71 d4 00    	jne    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6d3a:	c3                   	ret
  aa6d3b:	cc                   	int3
  aa6d3c:	53                   	push   rbx
  aa6d3d:	48 89 fb             	mov    rbx,rdi
  aa6d40:	48 83 c7 40          	add    rdi,0x40
  aa6d44:	e8 e7 ff ff ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  aa6d49:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
  aa6d4d:	e8 de ff ff ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  aa6d52:	48 89 df             	mov    rdi,rbx
  aa6d55:	5b                   	pop    rbx
  aa6d56:	e9 33 01 00 00       	jmp    aa6e8e <JNI_OnUnload@@Base+0x2e75b>
  aa6d5b:	cc                   	int3
  aa6d5c:	80 7f 30 00          	cmp    BYTE PTR [rdi+0x30],0x0
  aa6d60:	0f 85 50 03 b4 00    	jne    15e70b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c63a>
  aa6d66:	c3                   	ret
  aa6d67:	cc                   	int3
  aa6d68:	53                   	push   rbx
  aa6d69:	48 89 fb             	mov    rbx,rdi
  aa6d6c:	48 83 c7 40          	add    rdi,0x40
  aa6d70:	e8 f5 31 fd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  aa6d75:	48 83 c3 10          	add    rbx,0x10
  aa6d79:	48 89 df             	mov    rdi,rbx
  aa6d7c:	5b                   	pop    rbx
  aa6d7d:	e9 e8 31 fd ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
  aa6d82:	53                   	push   rbx
  aa6d83:	48 89 fb             	mov    rbx,rdi
  aa6d86:	48 83 c7 58          	add    rdi,0x58
  aa6d8a:	e8 01 71 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6d8f:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
  aa6d93:	e8 f8 70 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6d98:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
  aa6d9c:	e8 ef 70 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6da1:	48 83 c3 08          	add    rbx,0x8
  aa6da5:	48 89 df             	mov    rdi,rbx
  aa6da8:	5b                   	pop    rbx
  aa6da9:	e9 e2 70 d4 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6dae:	53                   	push   rbx
  aa6daf:	48 89 fb             	mov    rbx,rdi
  aa6db2:	48 83 c7 48          	add    rdi,0x48
  aa6db6:	e8 b9 00 00 00       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
  aa6dbb:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
  aa6dbf:	e8 cc 70 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6dc4:	48 89 df             	mov    rdi,rbx
  aa6dc7:	5b                   	pop    rbx
  aa6dc8:	e9 9d 31 fd ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
  aa6dcd:	cc                   	int3
  aa6dce:	53                   	push   rbx
  aa6dcf:	48 89 fb             	mov    rbx,rdi
  aa6dd2:	48 83 c7 30          	add    rdi,0x30
  aa6dd6:	e8 b5 70 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6ddb:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
  aa6ddf:	e8 ac 70 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6de4:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  aa6de8:	5b                   	pop    rbx
  aa6de9:	e9 88 79 ff ff       	jmp    a9e776 <JNI_OnUnload@@Base+0x26043>
  aa6dee:	53                   	push   rbx
  aa6def:	48 89 fb             	mov    rbx,rdi
  aa6df2:	48 83 c7 78          	add    rdi,0x78
  aa6df6:	e8 ed 47 fd ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
  aa6dfb:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
  aa6dff:	e8 8c 70 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6e04:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
  aa6e08:	e8 83 70 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6e0d:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
  aa6e11:	e8 7a 70 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6e16:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
  aa6e1a:	e8 71 70 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6e1f:	48 89 df             	mov    rdi,rbx
  aa6e22:	5b                   	pop    rbx
  aa6e23:	e9 68 70 d4 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6e28:	53                   	push   rbx
  aa6e29:	48 89 fb             	mov    rbx,rdi
  aa6e2c:	48 83 c7 50          	add    rdi,0x50
  aa6e30:	e8 5b 70 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6e35:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
  aa6e39:	e8 52 70 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6e3e:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
  aa6e42:	e8 49 70 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6e47:	48 83 c3 08          	add    rbx,0x8
  aa6e4b:	48 89 df             	mov    rdi,rbx
  aa6e4e:	5b                   	pop    rbx
  aa6e4f:	e9 3c 70 d4 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6e54:	53                   	push   rbx
  aa6e55:	48 89 fb             	mov    rbx,rdi
  aa6e58:	48 83 c7 30          	add    rdi,0x30
  aa6e5c:	e8 2f 70 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6e61:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
  aa6e65:	e8 26 70 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6e6a:	48 89 df             	mov    rdi,rbx
  aa6e6d:	5b                   	pop    rbx
  aa6e6e:	e9 1d 70 d4 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6e73:	cc                   	int3
  aa6e74:	53                   	push   rbx
  aa6e75:	48 89 fb             	mov    rbx,rdi
  aa6e78:	48 83 c7 30          	add    rdi,0x30
  aa6e7c:	e8 af fe ff ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  aa6e81:	48 83 c3 04          	add    rbx,0x4
  aa6e85:	48 89 df             	mov    rdi,rbx
  aa6e88:	5b                   	pop    rbx
  aa6e89:	e9 c2 71 d4 00       	jmp    17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
  aa6e8e:	80 7f 18 00          	cmp    BYTE PTR [rdi+0x18],0x0
  aa6e92:	0f 85 02 00 00 00    	jne    aa6e9a <JNI_OnUnload@@Base+0x2e767>
  aa6e98:	c3                   	ret
  aa6e99:	cc                   	int3
  aa6e9a:	48 83 ec 18          	sub    rsp,0x18
  aa6e9e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  aa6ea5:	00 00
  aa6ea7:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  aa6eac:	48 8d 44 24 08       	lea    rax,[rsp+0x8]
  aa6eb1:	48 89 38             	mov    QWORD PTR [rax],rdi
  aa6eb4:	48 89 c7             	mov    rdi,rax
  aa6eb7:	e8 1a 00 00 00       	call   aa6ed6 <JNI_OnUnload@@Base+0x2e7a3>
  aa6ebc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  aa6ec3:	00 00
  aa6ec5:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
  aa6eca:	75 05                	jne    aa6ed1 <JNI_OnUnload@@Base+0x2e79e>
  aa6ecc:	48 83 c4 18          	add    rsp,0x18
  aa6ed0:	c3                   	ret
  aa6ed1:	e8 da 8b d4 00       	call   17efab0 <__stack_chk_fail@plt>
  aa6ed6:	41 57                	push   r15
  aa6ed8:	41 56                	push   r14
  aa6eda:	41 54                	push   r12
  aa6edc:	53                   	push   rbx
  aa6edd:	50                   	push   rax
  aa6ede:	4c 8b 3f             	mov    r15,QWORD PTR [rdi]
  aa6ee1:	4d 8b 27             	mov    r12,QWORD PTR [r15]
  aa6ee4:	4d 85 e4             	test   r12,r12
  aa6ee7:	74 34                	je     aa6f1d <JNI_OnUnload@@Base+0x2e7ea>
  aa6ee9:	48 89 fb             	mov    rbx,rdi
  aa6eec:	4d 8b 77 08          	mov    r14,QWORD PTR [r15+0x8]
  aa6ef0:	4d 39 e6             	cmp    r14,r12
  aa6ef3:	74 0e                	je     aa6f03 <JNI_OnUnload@@Base+0x2e7d0>
  aa6ef5:	49 83 c6 e0          	add    r14,0xffffffffffffffe0
  aa6ef9:	4c 89 f7             	mov    rdi,r14
  aa6efc:	e8 8f 6f d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6f01:	eb ed                	jmp    aa6ef0 <JNI_OnUnload@@Base+0x2e7bd>
  aa6f03:	4d 89 67 08          	mov    QWORD PTR [r15+0x8],r12
  aa6f07:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  aa6f0a:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  aa6f0d:	48 83 c4 08          	add    rsp,0x8
  aa6f11:	5b                   	pop    rbx
  aa6f12:	41 5c                	pop    r12
  aa6f14:	41 5e                	pop    r14
  aa6f16:	41 5f                	pop    r15
  aa6f18:	e9 03 70 d4 00       	jmp    17edf20 <_ZdlPv@plt>
  aa6f1d:	48 83 c4 08          	add    rsp,0x8
  aa6f21:	5b                   	pop    rbx
  aa6f22:	41 5c                	pop    r12
```
## `10add2a` window `0x10add2a`

```text
 10adcc8:	c3                   	ret
 10adcc9:	cc                   	int3
 10adcca:	31 f6                	xor    esi,esi
 10adccc:	e9 d9 ff ff ff       	jmp    10adcaa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750c0>
 10adcd1:	cc                   	int3
 10adcd2:	53                   	push   rbx
 10adcd3:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 10adcd6:	48 89 37             	mov    QWORD PTR [rdi],rsi
 10adcd9:	48 85 db             	test   rbx,rbx
 10adcdc:	74 11                	je     10adcef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275105>
 10adcde:	48 89 df             	mov    rdi,rbx
 10adce1:	e8 92 2d 01 00       	call   10c0a78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287e8e>
 10adce6:	48 89 df             	mov    rdi,rbx
 10adce9:	5b                   	pop    rbx
 10adcea:	e9 31 02 74 00       	jmp    17edf20 <_ZdlPv@plt>
 10adcef:	5b                   	pop    rbx
 10adcf0:	c3                   	ret
 10adcf1:	cc                   	int3
 10adcf2:	31 f6                	xor    esi,esi
 10adcf4:	e9 d9 ff ff ff       	jmp    10adcd2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750e8>
 10adcf9:	cc                   	int3
 10adcfa:	53                   	push   rbx
 10adcfb:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
 10adcff:	48 85 c0             	test   rax,rax
 10add02:	74 11                	je     10add15 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27512b>
 10add04:	48 89 fb             	mov    rbx,rdi
 10add07:	31 ff                	xor    edi,edi
 10add09:	48 89 de             	mov    rsi,rbx
 10add0c:	31 d2                	xor    edx,edx
 10add0e:	ff d0                	call   rax
 10add10:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
 10add15:	5b                   	pop    rbx
 10add16:	c3                   	ret
 10add17:	48 89 c7             	mov    rdi,rax
 10add1a:	e8 86 bd 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10add1f:	cc                   	int3
 10add20:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 10add23:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10add26:	ff 60 20             	jmp    QWORD PTR [rax+0x20]
 10add29:	cc                   	int3
 10add2a:	53                   	push   rbx
 10add2b:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
 10add2f:	48 85 c0             	test   rax,rax
 10add32:	74 11                	je     10add45 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27515b>
 10add34:	48 89 fb             	mov    rbx,rdi
 10add37:	31 ff                	xor    edi,edi
 10add39:	48 89 de             	mov    rsi,rbx
 10add3c:	31 d2                	xor    edx,edx
 10add3e:	ff d0                	call   rax
 10add40:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
 10add45:	5b                   	pop    rbx
 10add46:	c3                   	ret
 10add47:	48 89 c7             	mov    rdi,rax
 10add4a:	e8 56 bd 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10add4f:	cc                   	int3
 10add50:	55                   	push   rbp
 10add51:	41 57                	push   r15
 10add53:	41 56                	push   r14
 10add55:	41 55                	push   r13
 10add57:	41 54                	push   r12
 10add59:	53                   	push   rbx
 10add5a:	48 81 ec 88 00 00 00 	sub    rsp,0x88
 10add61:	48 89 fb             	mov    rbx,rdi
 10add64:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10add6b:	00 00
 10add6d:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
 10add74:	00
 10add75:	48 83 c7 08          	add    rdi,0x8
 10add79:	e8 c0 a5 ab ff       	call   b6833e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb52de>
 10add7e:	84 c0                	test   al,al
 10add80:	0f 85 5e 01 00 00    	jne    10adee4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2752fa>
 10add86:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]
 10add89:	48 8b 73 18          	mov    rsi,QWORD PTR [rbx+0x18]
 10add8d:	8b 7b 10             	mov    edi,DWORD PTR [rbx+0x10]
 10add90:	e8 8b da 9c ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
 10add95:	84 c0                	test   al,al
 10add97:	0f 85 47 01 00 00    	jne    10adee4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2752fa>
 10add9d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
 10adda1:	0f 57 c0             	xorps  xmm0,xmm0
 10adda4:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
 10adda9:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
 10addac:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 10addb1:	31 d2                	xor    edx,edx
 10addb3:	e8 24 71 71 00       	call   17c4edc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179048>
 10addb8:	84 c0                	test   al,al
 10addba:	0f 84 1a 01 00 00    	je     10adeda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2752f0>
 10addc0:	4c 8d 74 24 50       	lea    r14,[rsp+0x50]
 10addc5:	49 83 66 08 00       	and    QWORD PTR [r14+0x8],0x0
 10addca:	48 8d 05 df f0 79 00 	lea    rax,[rip+0x79f0df]        # 184ceb0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9598>
 10addd1:	49 89 06             	mov    QWORD PTR [r14],rax
 10addd4:	0f 57 c0             	xorps  xmm0,xmm0
 10addd7:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
 10adddc:	41 0f 11 46 1c       	movups XMMWORD PTR [r14+0x1c],xmm0
 10adde1:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 10adde6:	e8 4b da 9c ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 10addeb:	4c 89 f7             	mov    rdi,r14
 10addee:	48 89 c6             	mov    rsi,rax
 10addf1:	e8 5c 1a 6d 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
 10addf6:	84 c0                	test   al,al
 10addf8:	0f 84 d2 00 00 00    	je     10aded0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2752e6>
 10addfe:	48 8d 44 24 60       	lea    rax,[rsp+0x60]
 10ade03:	0f 57 c0             	xorps  xmm0,xmm0
 10ade06:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
 10ade0b:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
 10ade10:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
 10ade14:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 10ade17:	49 89 cc             	mov    r12,rcx
 10ade1a:	49 83 c4 07          	add    r12,0x7
 10ade1e:	f6 c1 01             	test   cl,0x1
 10ade21:	4c 0f 44 e0          	cmove  r12,rax
 10ade25:	4c 63 68 08          	movsxd r13,DWORD PTR [rax+0x8]
 10ade29:	4d 85 ed             	test   r13,r13
 10ade2c:	74 56                	je     10ade84 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27529a>
 10ade2e:	49 c1 e5 03          	shl    r13,0x3
 10ade32:	31 ed                	xor    ebp,ebp
 10ade34:	49 89 e6             	mov    r14,rsp
 10ade37:	4c 8d 7c 24 48       	lea    r15,[rsp+0x48]
 10ade3c:	49 8b 04 2c          	mov    rax,QWORD PTR [r12+rbp*1]
 10ade40:	48 8b 40 18          	mov    rax,QWORD PTR [rax+0x18]
 10ade44:	48 85 c0             	test   rax,rax
 10ade47:	48 8d 0d 42 62 92 00 	lea    rcx,[rip+0x926242]        # 19d4090 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x9ccd8>
 10ade4e:	48 0f 44 c1          	cmove  rax,rcx
 10ade52:	48 63 48 20          	movsxd rcx,DWORD PTR [rax+0x20]
 10ade56:	48 69 40 18 00 ca 9a 	imul   rax,QWORD PTR [rax+0x18],0x3b9aca00
 10ade5d:	3b
 10ade5e:	48 01 c8             	add    rax,rcx
 10ade61:	48 99                	cqo
 10ade63:	b9 40 42 0f 00       	mov    ecx,0xf4240
 10ade68:	48 f7 f9             	idiv   rcx
 10ade6b:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
 10ade70:	4c 89 f7             	mov    rdi,r14
 10ade73:	4c 89 fe             	mov    rsi,r15
 10ade76:	e8 d5 2b 00 00       	call   10b0a50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277e66>
 10ade7b:	48 83 c5 08          	add    rbp,0x8
 10ade7f:	49 39 ed             	cmp    r13,rbp
 10ade82:	75 b8                	jne    10ade3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275252>
 10ade84:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
 10ade88:	49 89 e6             	mov    r14,rsp
 10ade8b:	4c 89 f6             	mov    rsi,r14
 10ade8e:	e8 3d 74 db ff       	call   e652d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c6e6>
 10ade93:	4c 89 f7             	mov    rdi,r14
 10ade96:	e8 89 70 db ff       	call   e64f24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c33a>
 10ade9b:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 10ade9e:	48 89 df             	mov    rdi,rbx
 10adea1:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10adea4:	89 c5                	mov    ebp,eax
 10adea6:	48 89 df             	mov    rdi,rbx
 10adea9:	e8 a4 2a 00 00       	call   10b0952 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277d68>
 10adeae:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 10adeb1:	48 89 df             	mov    rdi,rbx
 10adeb4:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10adeb7:	40 38 c5             	cmp    bpl,al
 10adeba:	74 0c                	je     10adec8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2752de>
 10adebc:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
 10adec3:	e8 e0 ab a7 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
 10adec8:	48 89 df             	mov    rdi,rbx
 10adecb:	e8 b6 2b 00 00       	call   10b0a86 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277e9c>
 10aded0:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
 10aded5:	e8 4e 38 00 00       	call   10b1728 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278b3e>
 10adeda:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 10adedf:	e8 ac ff 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10adee4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10adeeb:	00 00
 10adeed:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
 10adef4:	00
 10adef5:	75 12                	jne    10adf09 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27531f>
 10adef7:	48 81 c4 88 00 00 00 	add    rsp,0x88
 10adefe:	5b                   	pop    rbx
 10adeff:	41 5c                	pop    r12
 10adf01:	41 5d                	pop    r13
 10adf03:	41 5e                	pop    r14
 10adf05:	41 5f                	pop    r15
 10adf07:	5d                   	pop    rbp
 10adf08:	c3                   	ret
 10adf09:	e8 a2 1b 74 00       	call   17efab0 <__stack_chk_fail@plt>
 10adf0e:	eb 00                	jmp    10adf10 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275326>
 10adf10:	48 89 c3             	mov    rbx,rax
 10adf13:	eb 15                	jmp    10adf2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275340>
 10adf15:	48 89 c3             	mov    rbx,rax
 10adf18:	eb 1a                	jmp    10adf34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27534a>
 10adf1a:	48 89 c3             	mov    rbx,rax
 10adf1d:	eb 1f                	jmp    10adf3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275354>
 10adf1f:	48 89 c3             	mov    rbx,rax
 10adf22:	48 89 e7             	mov    rdi,rsp
 10adf25:	e8 fa 6f db ff       	call   e64f24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c33a>
 10adf2a:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
 10adf2f:	e8 f4 37 00 00       	call   10b1728 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278b3e>
 10adf34:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 10adf39:	e8 52 ff 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10adf3e:	48 89 df             	mov    rdi,rbx
```
## Related callsites in bridge/restrictions range

| addr | instruction |
|---:|---|
| `0xe019f4` | `e019f4:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0` |
| `0xe019f7` | `e019f7:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0` |
| `0xe019fc` | `e019fc:	e8 87 00 00 00       	call   e01a88 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xceb0e>` |
| `0xe01a01` | `e01a01:	4d 39 e7             	cmp    r15,r12` |
| `0xe01a04` | `e01a04:	74 45                	je     e01a4b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcead1>` |
| `0xe01a06` | `e01a06:	48 89 e3             	mov    rbx,rsp` |
| `0xe01a09` | `e01a09:	6a 02                	push   0x2` |
| `0xe01a0b` | `e01a0b:	5d                   	pop    rbp` |
| `0xe01a0c` | `e01a0c:	49 8d 77 40          	lea    rsi,[r15+0x40]` |
| `0xe01a10` | `e01a10:	48 89 df             	mov    rdi,rbx` |
| `0xe01a13` | `e01a13:	e8 18 99 ca ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe01a18` | `e01a18:	4c 8b 34 24          	mov    r14,QWORD PTR [rsp]` |
| `0xe01a1c` | `e01a1c:	4d 85 f6             	test   r14,r14` |
| `0xe01a1f` | `e01a1f:	74 17                	je     e01a38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xceabe>` |
| `0xe01a21` | `e01a21:	49 8d 7f 28          	lea    rdi,[r15+0x28]` |
| `0xe01a25` | `e01a25:	e8 0c 9e c7 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xe01a2a` | `e01a2a:	4d 8b 06             	mov    r8,QWORD PTR [r14]` |
| `0xe01a2d` | `e01a2d:	4c 89 f7             	mov    rdi,r14` |
| `0xe01a30` | `e01a30:	48 89 c6             	mov    rsi,rax` |
| `0xe01a33` | `e01a33:	89 e9                	mov    ecx,ebp` |
| `0xe01a35` | `e01a35:	41 ff 10             	call   QWORD PTR [r8]` |
| `0xe01a38` | `e01a38:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]` |
| `0xe01f3a` | `e01f3a:	49 83 c4 50          	add    r12,0x50` |
| `0xe01f3e` | `e01f3e:	4d 39 ec             	cmp    r12,r13` |
| `0xe01f41` | `e01f41:	75 b0                	jne    e01ef3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcef79>` |
| `0xe01f43` | `e01f43:	49 83 c4 b0          	add    r12,0xffffffffffffffb0` |
| `0xe01f47` | `e01f47:	4c 89 e6             	mov    rsi,r12` |
| `0xe01f4a` | `e01f4a:	4c 89 ff             	mov    rdi,r15` |
| `0xe01f4d` | `e01f4d:	e8 52 fb ff ff       	call   e01aa4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xceb2a>` |
| `0xe01f52` | `e01f52:	49 89 e7             	mov    r15,rsp` |
| `0xe01f55` | `e01f55:	4c 89 ff             	mov    rdi,r15` |
| `0xe01f58` | `e01f58:	4c 89 f6             	mov    rsi,r14` |
| `0xe01f5b` | `e01f5b:	e8 d0 93 ca ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe01f60` | `e01f60:	4d 8b 37             	mov    r14,QWORD PTR [r15]` |
| `0xe01f63` | `e01f63:	4d 85 f6             	test   r14,r14` |
| `0xe01f66` | `e01f66:	74 18                	je     e01f80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcf006>` |
| `0xe01f68` | `e01f68:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]` |
| `0xe01f6d` | `e01f6d:	e8 c4 98 c7 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xe01f72` | `e01f72:	4d 8b 06             	mov    r8,QWORD PTR [r14]` |
| `0xe01f75` | `e01f75:	4c 89 f7             	mov    rdi,r14` |
| `0xe01f78` | `e01f78:	48 89 c6             	mov    rsi,rax` |
| `0xe01f7b` | `e01f7b:	89 e9                	mov    ecx,ebp` |
| `0xe01f7d` | `e01f7d:	41 ff 10             	call   QWORD PTR [r8]` |
| `0xe01f80` | `e01f80:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]` |
| `0xe41e68` | `e41e68:	49 89 d7             	mov    r15,rdx` |
| `0xe41e6b` | `e41e6b:	89 f5                	mov    ebp,esi` |
| `0xe41e6d` | `e41e6d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xe41e74` | `e41e74:	00 00` |
| `0xe41e76` | `e41e76:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xe41e7b` | `e41e7b:	4c 8b 27             	mov    r12,QWORD PTR [rdi]` |
| `0xe41e7e` | `e41e7e:	4d 8b 34 24          	mov    r14,QWORD PTR [r12]` |
| `0xe41e82` | `e41e82:	49 8d 74 24 08       	lea    rsi,[r12+0x8]` |
| `0xe41e87` | `e41e87:	48 89 e3             	mov    rbx,rsp` |
| `0xe41e8a` | `e41e8a:	48 89 df             	mov    rdi,rbx` |
| `0xe41e8d` | `e41e8d:	e8 9e 94 c6 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe41e92` | `e41e92:	4c 8b 2b             	mov    r13,QWORD PTR [rbx]` |
| `0xe41e95` | `e41e95:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0xe41e99` | `e41e99:	e8 e8 c5 c5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xe41e9e` | `e41e9e:	4d 85 ed             	test   r13,r13` |
| `0xe41ea1` | `e41ea1:	74 6d                	je     e41f10 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9326>` |
| `0xe41ea3` | `e41ea3:	49 8b 7c 24 20       	mov    rdi,QWORD PTR [r12+0x20]` |
| `0xe41ea8` | `e41ea8:	48 85 ff             	test   rdi,rdi` |
| `0xe41eab` | `e41eab:	74 59                	je     e41f06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x931c>` |
| `0xe41ead` | `e41ead:	e8 8e c2 9a 00       	call   17ee140 <_ZNSt6__ndk119__shared_weak_count4lockEv@plt>` |
| `0xe41eb2` | `e41eb2:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax` |
| `0xe41eb7` | `e41eb7:	48 85 c0             	test   rax,rax` |
| `0xe43f37` | `e43f37:	0f 84 77 02 00 00    	je     e441b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5ca>` |
| `0xe43f3d` | `e43f3d:	41 8b 4e 38          	mov    ecx,DWORD PTR [r14+0x38]` |
| `0xe43f41` | `e43f41:	39 8f 50 01 00 00    	cmp    DWORD PTR [rdi+0x150],ecx` |
| `0xe43f47` | `e43f47:	0f 85 67 02 00 00    	jne    e441b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5ca>` |
| `0xe43f4d` | `e43f4d:	80 bf 48 01 00 00 00 	cmp    BYTE PTR [rdi+0x148],0x0` |
| `0xe43f54` | `e43f54:	0f 84 5a 02 00 00    	je     e441b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5ca>` |
| `0xe43f5a` | `e43f5a:	84 c0                	test   al,al` |
| `0xe43f5c` | `e43f5c:	0f 84 9d 01 00 00    	je     e440ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb515>` |
| `0xe43f62` | `e43f62:	49 8d 76 28          	lea    rsi,[r14+0x28]` |
| `0xe43f66` | `e43f66:	48 89 e7             	mov    rdi,rsp` |
| `0xe43f69` | `e43f69:	e8 c2 73 c6 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe43f6e` | `e43f6e:	41 8b 6e 38          	mov    ebp,DWORD PTR [r14+0x38]` |
| `0xe43f72` | `e43f72:	83 3d 3f 5a ae 00 06 	cmp    DWORD PTR [rip+0xae5a3f],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>` |
| `0xe43f79` | `e43f79:	7c 1d                	jl     e43f98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3ae>` |
| `0xe43f7b` | `e43f7b:	48 8d 35 d2 73 4e ff 	lea    rsi,[rip+0xffffffffff4e73d2]        # 32b354 <_ZTSSt12bad_any_cast@@Base-0x64e74>` |
| `0xe43f82` | `e43f82:	48 8d 0d 31 bd 50 ff 	lea    rcx,[rip+0xffffffffff50bd31]        # 34fcba <_ZTSSt12bad_any_cast@@Base-0x4050e>` |
| `0xe43f89` | `e43f89:	6a 06                	push   0x6` |
| `0xe43f8b` | `e43f8b:	5f                   	pop    rdi` |
| `0xe43f8c` | `e43f8c:	ba 24 03 00 00       	mov    edx,0x324` |
| `0xe43f91` | `e43f91:	31 c0                	xor    eax,eax` |
| `0xe43f93` | `e43f93:	e8 3a 29 99 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>` |
| `0xe43f98` | `e43f98:	4d 8b b4 24 48 03 00 	mov    r14,QWORD PTR [r12+0x348]` |
| `0xe44d28` | `e44d28:	41 56                	push   r14` |
| `0xe44d2a` | `e44d2a:	53                   	push   rbx` |
| `0xe44d2b` | `e44d2b:	48 83 ec 18          	sub    rsp,0x18` |
| `0xe44d2f` | `e44d2f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xe44d36` | `e44d36:	00 00` |
| `0xe44d38` | `e44d38:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xe44d3d` | `e44d3d:	4c 8b 37             	mov    r14,QWORD PTR [rdi]` |
| `0xe44d40` | `e44d40:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0xe44d44` | `e44d44:	48 89 e3             	mov    rbx,rsp` |
| `0xe44d47` | `e44d47:	48 89 df             	mov    rdi,rbx` |
| `0xe44d4a` | `e44d4a:	e8 e1 65 c6 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe44d4f` | `e44d4f:	48 8b 33             	mov    rsi,QWORD PTR [rbx]` |
| `0xe44d52` | `e44d52:	48 85 f6             	test   rsi,rsi` |
| `0xe44d55` | `e44d55:	74 12                	je     e44d69 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc17f>` |
| `0xe44d57` | `e44d57:	49 8b be 80 01 00 00 	mov    rdi,QWORD PTR [r14+0x180]` |
| `0xe44d5e` | `e44d5e:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xe44d61` | `e44d61:	ba e8 03 00 00       	mov    edx,0x3e8` |
| `0xe44d66` | `e44d66:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0xe44d69` | `e44d69:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]` |
| `0xe44d6e` | `e44d6e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xe44d75` | `e44d75:	00 00` |
| `0xe44d77` | `e44d77:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]` |
| `0xe5829d` | `e5829d:	49 89 fe             	mov    r14,rdi` |
| `0xe582a0` | `e582a0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xe582a7` | `e582a7:	00 00` |
| `0xe582a9` | `e582a9:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax` |
| `0xe582b0` | `e582b0:	00` |
| `0xe582b1` | `e582b1:	4c 8b 7f 68          	mov    r15,QWORD PTR [rdi+0x68]` |
| `0xe582b5` | `e582b5:	4c 8b 27             	mov    r12,QWORD PTR [rdi]` |
| `0xe582b8` | `e582b8:	48 8d 77 38          	lea    rsi,[rdi+0x38]` |
| `0xe582bc` | `e582bc:	48 8d 5c 24 50       	lea    rbx,[rsp+0x50]` |
| `0xe582c1` | `e582c1:	48 89 df             	mov    rdi,rbx` |
| `0xe582c4` | `e582c4:	e8 67 30 c5 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe582c9` | `e582c9:	48 83 3b 00          	cmp    QWORD PTR [rbx],0x0` |
| `0xe582cd` | `e582cd:	0f 84 85 03 00 00    	je     e58658 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fa6e>` |
| `0xe582d3` | `e582d3:	4c 89 64 24 18       	mov    QWORD PTR [rsp+0x18],r12` |
| `0xe582d8` | `e582d8:	4d 8d 6e 58          	lea    r13,[r14+0x58]` |
| `0xe582dc` | `e582dc:	83 3d d5 16 ad 00 0d 	cmp    DWORD PTR [rip+0xad16d5],0xd        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>` |
| `0xe582e3` | `e582e3:	48 8d 05 9d b6 51 ff 	lea    rax,[rip+0xffffffffff51b69d]        # 373987 <_ZTSSt12bad_any_cast@@Base-0x1c841>` |
| `0xe582ea` | `e582ea:	48 89 04 24          	mov    QWORD PTR [rsp],rax` |
| `0xe582ee` | `e582ee:	0f 8c f8 00 00 00    	jl     e583ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f802>` |
| `0xe582f4` | `e582f4:	41 80 7e 34 00       	cmp    BYTE PTR [r14+0x34],0x0` |
| `0xe582f9` | `e582f9:	48 8d 2d 87 b6 51 ff 	lea    rbp,[rip+0xffffffffff51b687]        # 373987 <_ZTSSt12bad_any_cast@@Base-0x1c841>` |
| `0xe58300` | `e58300:	48 8d 05 60 71 4e ff 	lea    rax,[rip+0xffffffffff4e7160]        # 33f467 <_ZTSSt12bad_any_cast@@Base-0x50d61>` |
| `0xe59ca0` | `e59ca0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xe59ca7` | `e59ca7:	00 00` |
| `0xe59ca9` | `e59ca9:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax` |
| `0xe59cb0` | `e59cb0:	00` |
| `0xe59cb1` | `e59cb1:	4c 8b 7f 68          	mov    r15,QWORD PTR [rdi+0x68]` |
| `0xe59cb5` | `e59cb5:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xe59cb8` | `e59cb8:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax` |
| `0xe59cbd` | `e59cbd:	48 8d 77 38          	lea    rsi,[rdi+0x38]` |
| `0xe59cc1` | `e59cc1:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]` |
| `0xe59cc6` | `e59cc6:	4c 89 e7             	mov    rdi,r12` |
| `0xe59cc9` | `e59cc9:	e8 62 16 c5 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe59cce` | `e59cce:	49 83 3c 24 00       	cmp    QWORD PTR [r12],0x0` |
| `0xe59cd3` | `e59cd3:	0f 84 05 03 00 00    	je     e59fde <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x213f4>` |
| `0xe59cd9` | `e59cd9:	4d 8d 66 58          	lea    r12,[r14+0x58]` |
| `0xe59cdd` | `e59cdd:	83 3d d4 fc ac 00 0d 	cmp    DWORD PTR [rip+0xacfcd4],0xd        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>` |
| `0xe59ce4` | `e59ce4:	0f 8c d6 00 00 00    	jl     e59dc0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x211d6>` |
| `0xe59cea` | `e59cea:	41 8b 04 24          	mov    eax,DWORD PTR [r12]` |
| `0xe59cee` | `e59cee:	89 44 24 04          	mov    DWORD PTR [rsp+0x4],eax` |
| `0xe59cf2` | `e59cf2:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]` |
| `0xe59cf7` | `e59cf7:	4c 89 e6             	mov    rsi,r12` |
| `0xe59cfa` | `e59cfa:	e8 e1 47 99 00       	call   17ee4e0 <_ZNKSt6__ndk110error_code7messageEv@plt>` |
| `0xe59cff` | `e59cff:	f6 44 24 50 01       	test   BYTE PTR [rsp+0x50],0x1` |
| `0xe5afe2` | `e5afe2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xe5afe9` | `e5afe9:	00 00` |
| `0xe5afeb` | `e5afeb:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax` |
| `0xe5aff2` | `e5aff2:	00` |
| `0xe5aff3` | `e5aff3:	4c 8b 7f 68          	mov    r15,QWORD PTR [rdi+0x68]` |
| `0xe5aff7` | `e5aff7:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xe5affa` | `e5affa:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax` |
| `0xe5afff` | `e5afff:	48 8d 77 38          	lea    rsi,[rdi+0x38]` |
| `0xe5b003` | `e5b003:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]` |
| `0xe5b008` | `e5b008:	4c 89 e7             	mov    rdi,r12` |
| `0xe5b00b` | `e5b00b:	e8 20 03 c5 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe5b010` | `e5b010:	49 83 3c 24 00       	cmp    QWORD PTR [r12],0x0` |
| `0xe5b015` | `e5b015:	0f 84 01 03 00 00    	je     e5b31c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22732>` |
| `0xe5b01b` | `e5b01b:	4d 8d 66 58          	lea    r12,[r14+0x58]` |
| `0xe5b01f` | `e5b01f:	83 3d 92 e9 ac 00 0d 	cmp    DWORD PTR [rip+0xace992],0xd        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>` |
| `0xe5b026` | `e5b026:	0f 8c d6 00 00 00    	jl     e5b102 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22518>` |
| `0xe5b02c` | `e5b02c:	41 8b 04 24          	mov    eax,DWORD PTR [r12]` |
| `0xe5b030` | `e5b030:	89 44 24 04          	mov    DWORD PTR [rsp+0x4],eax` |
| `0xe5b034` | `e5b034:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]` |
| `0xe5b039` | `e5b039:	4c 89 e6             	mov    rsi,r12` |
| `0xe5b03c` | `e5b03c:	e8 9f 34 99 00       	call   17ee4e0 <_ZNKSt6__ndk110error_code7messageEv@plt>` |
| `0xe5b041` | `e5b041:	f6 44 24 50 01       	test   BYTE PTR [rsp+0x50],0x1` |
| `0xe62240` | `e62240:	48 89 f3             	mov    rbx,rsi` |
| `0xe62243` | `e62243:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xe6224a` | `e6224a:	00 00` |
| `0xe6224c` | `e6224c:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax` |
| `0xe62253` | `e62253:	00` |
| `0xe62254` | `e62254:	48 8b 37             	mov    rsi,QWORD PTR [rdi]` |
| `0xe62257` | `e62257:	4c 8b 3e             	mov    r15,QWORD PTR [rsi]` |
| `0xe6225a` | `e6225a:	48 83 c6 08          	add    rsi,0x8` |
| `0xe6225e` | `e6225e:	49 89 e6             	mov    r14,rsp` |
| `0xe62261` | `e62261:	4c 89 f7             	mov    rdi,r14` |
| `0xe62264` | `e62264:	e8 c7 90 c4 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe62269` | `e62269:	49 83 3e 00          	cmp    QWORD PTR [r14],0x0` |
| `0xe6226d` | `e6226d:	0f 84 07 01 00 00    	je     e6237a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29790>` |
| `0xe62273` | `e62273:	8a 43 75             	mov    al,BYTE PTR [rbx+0x75]` |
| `0xe62276` | `e62276:	41 88 47 70          	mov    BYTE PTR [r15+0x70],al` |
| `0xe6227a` | `e6227a:	0f b7 43 73          	movzx  eax,WORD PTR [rbx+0x73]` |
| `0xe6227e` | `e6227e:	66 41 89 47 6e       	mov    WORD PTR [r15+0x6e],ax` |
| `0xe62283` | `e62283:	b0 01                	mov    al,0x1` |
| `0xe62285` | `e62285:	80 7b 72 00          	cmp    BYTE PTR [rbx+0x72],0x0` |
| `0xe62289` | `e62289:	75 07                	jne    e62292 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x296a8>` |
| `0xe6228b` | `e6228b:	41 8a 87 91 00 00 00 	mov    al,BYTE PTR [r15+0x91]` |
| `0xe62292` | `e62292:	41 88 87 91 00 00 00 	mov    BYTE PTR [r15+0x91],al` |
| `0xe623f0` | `e623f0:	53                   	push   rbx` |
| `0xe623f1` | `e623f1:	48 83 ec 68          	sub    rsp,0x68` |
| `0xe623f5` | `e623f5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xe623fc` | `e623fc:	00 00` |
| `0xe623fe` | `e623fe:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax` |
| `0xe62403` | `e62403:	48 8b 37             	mov    rsi,QWORD PTR [rdi]` |
| `0xe62406` | `e62406:	4c 8b 36             	mov    r14,QWORD PTR [rsi]` |
| `0xe62409` | `e62409:	48 83 c6 08          	add    rsi,0x8` |
| `0xe6240d` | `e6240d:	48 8d 5c 24 30       	lea    rbx,[rsp+0x30]` |
| `0xe62412` | `e62412:	48 89 df             	mov    rdi,rbx` |
| `0xe62415` | `e62415:	e8 16 8f c4 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe6241a` | `e6241a:	48 83 3b 00          	cmp    QWORD PTR [rbx],0x0` |
| `0xe6241e` | `e6241e:	74 5f                	je     e6247f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29895>` |
| `0xe62420` | `e62420:	49 8b be 88 04 00 00 	mov    rdi,QWORD PTR [r14+0x488]` |
| `0xe62427` | `e62427:	48 8d 05 ea f7 5e ff 	lea    rax,[rip+0xffffffffff5ef7ea]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>` |
| `0xe6242e` | `e6242e:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax` |
| `0xe62433` | `e62433:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| `0xe62438` | `e62438:	48 83 64 24 28 00    	and    QWORD PTR [rsp+0x28],0x0` |
| `0xe6243e` | `e6243e:	48 8d 5c 24 40       	lea    rbx,[rsp+0x40]` |
| `0xe62443` | `e62443:	4c 89 33             	mov    QWORD PTR [rbx],r14` |
| `0xe62446` | `e62446:	48 8d 05 17 a0 c1 ff 	lea    rax,[rip+0xffffffffffc1a017]        # a7c464 <JNI_OnUnload@@Base+0x3d31>` |
| `0xe6244d` | `e6244d:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax` |
| `0xe65830` | `e65830:	41 80 be 48 09 00 00 	cmp    BYTE PTR [r14+0x948],0x0` |
| `0xe65837` | `e65837:	00` |
| `0xe65838` | `e65838:	74 13                	je     e6584d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cc63>` |
| `0xe6583a` | `e6583a:	c7 83 e8 04 00 00 01 	mov    DWORD PTR [rbx+0x4e8],0x1` |
| `0xe65841` | `e65841:	00 00 00` |
| `0xe65844` | `e65844:	c6 83 ec 04 00 00 01 	mov    BYTE PTR [rbx+0x4ec],0x1` |
| `0xe6584b` | `e6584b:	eb 3e                	jmp    e6588b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cca1>` |
| `0xe6584d` | `e6584d:	48 8d b3 f0 04 00 00 	lea    rsi,[rbx+0x4f0]` |
| `0xe65854` | `e65854:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]` |
| `0xe65859` | `e65859:	4c 89 ff             	mov    rdi,r15` |
| `0xe6585c` | `e6585c:	e8 cf 5a c4 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe65861` | `e65861:	49 8b 3f             	mov    rdi,QWORD PTR [r15]` |
| `0xe65864` | `e65864:	48 85 ff             	test   rdi,rdi` |
| `0xe65867` | `e65867:	74 13                	je     e6587c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cc92>` |
| `0xe65869` | `e65869:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xe6586c` | `e6586c:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0xe6586f` | `e6586f:	89 83 e8 04 00 00    	mov    DWORD PTR [rbx+0x4e8],eax` |
| `0xe65875` | `e65875:	c6 83 ec 04 00 00 01 	mov    BYTE PTR [rbx+0x4ec],0x1` |
| `0xe6587c` | `e6587c:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]` |
| `0xe65881` | `e65881:	e8 00 8c c3 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xe65886` | `e65886:	4d 85 f6             	test   r14,r14` |
| `0xe65889` | `e65889:	74 3c                	je     e658c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ccdd>` |
| `0xe65f5f` | `e65f5f:	48 89 84 24 a8 04 00 	mov    QWORD PTR [rsp+0x4a8],rax` |
| `0xe65f66` | `e65f66:	00` |
| `0xe65f67` | `e65f67:	48 8d 9f a8 00 00 00 	lea    rbx,[rdi+0xa8]` |
| `0xe65f6e` | `e65f6e:	48 89 df             	mov    rdi,rbx` |
| `0xe65f71` | `e65f71:	e8 60 24 c7 ff       	call   ad83d6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25376>` |
| `0xe65f76` | `e65f76:	41 80 7f 38 00       	cmp    BYTE PTR [r15+0x38],0x0` |
| `0xe65f7b` | `e65f7b:	0f 84 d7 00 00 00    	je     e66058 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d46e>` |
| `0xe65f81` | `e65f81:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]` |
| `0xe65f86` | `e65f86:	4c 89 f7             	mov    rdi,r14` |
| `0xe65f89` | `e65f89:	48 89 de             	mov    rsi,rbx` |
| `0xe65f8c` | `e65f8c:	e8 9f 53 c4 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe65f91` | `e65f91:	49 8b 36             	mov    rsi,QWORD PTR [r14]` |
| `0xe65f94` | `e65f94:	48 85 f6             	test   rsi,rsi` |
| `0xe65f97` | `e65f97:	74 08                	je     e65fa1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d3b7>` |
| `0xe65f99` | `e65f99:	4c 89 ff             	mov    rdi,r15` |
| `0xe65f9c` | `e65f9c:	e8 8b 05 00 00       	call   e6652c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d942>` |
| `0xe65fa1` | `e65fa1:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]` |
| `0xe65fa6` | `e65fa6:	e8 db 84 c3 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xe65fab` | `e65fab:	4d 8b b7 90 00 00 00 	mov    r14,QWORD PTR [r15+0x90]` |
| `0xe65fb2` | `e65fb2:	49 8b 9f b0 00 00 00 	mov    rbx,QWORD PTR [r15+0xb0]` |
| `0xe65fb9` | `e65fb9:	41 0f 10 87 a8 00 00 	movups xmm0,XMMWORD PTR [r15+0xa8]` |
| `0xe65fc0` | `e65fc0:	00` |
| `0xe660fd` | `e660fd:	48 89 fb             	mov    rbx,rdi` |
| `0xe66100` | `e66100:	84 d2                	test   dl,dl` |
| `0xe66102` | `e66102:	74 15                	je     e66119 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d52f>` |
| `0xe66104` | `e66104:	49 8b 86 48 0f 00 00 	mov    rax,QWORD PTR [r14+0xf48]` |
| `0xe6610b` | `e6610b:	48 89 83 d0 00 00 00 	mov    QWORD PTR [rbx+0xd0],rax` |
| `0xe66112` | `e66112:	31 ed                	xor    ebp,ebp` |
| `0xe66114` | `e66114:	e9 4a 01 00 00       	jmp    e66263 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d679>` |
| `0xe66119` | `e66119:	48 8d b3 a8 00 00 00 	lea    rsi,[rbx+0xa8]` |
| `0xe66120` | `e66120:	49 89 e7             	mov    r15,rsp` |
| `0xe66123` | `e66123:	4c 89 ff             	mov    rdi,r15` |
| `0xe66126` | `e66126:	e8 05 52 c4 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe6612b` | `e6612b:	4d 8b 3f             	mov    r15,QWORD PTR [r15]` |
| `0xe6612e` | `e6612e:	4d 85 ff             	test   r15,r15` |
| `0xe66131` | `e66131:	0f 84 20 01 00 00    	je     e66257 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d66d>` |
| `0xe66137` | `e66137:	49 8b b6 38 0f 00 00 	mov    rsi,QWORD PTR [r14+0xf38]` |
| `0xe6613e` | `e6613e:	41 8b be 30 0f 00 00 	mov    edi,DWORD PTR [r14+0xf30]` |
| `0xe66145` | `e66145:	e8 d6 56 c1 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>` |
| `0xe6614a` | `e6614a:	31 ed                	xor    ebp,ebp` |
| `0xe6614c` | `e6614c:	84 c0                	test   al,al` |
| `0xe6614e` | `e6614e:	0f 85 05 01 00 00    	jne    e66259 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d66f>` |
| `0xe66154` | `e66154:	49 83 be 88 0b 00 00 	cmp    QWORD PTR [r14+0xb88],0x0` |
| `0xe6615b` | `e6615b:	00` |
| `0xe84e0a` | `e84e0a:	41 56                	push   r14` |
| `0xe84e0c` | `e84e0c:	53                   	push   rbx` |
| `0xe84e0d` | `e84e0d:	48 81 ec 90 00 00 00 	sub    rsp,0x90` |
| `0xe84e14` | `e84e14:	48 89 fe             	mov    rsi,rdi` |
| `0xe84e17` | `e84e17:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xe84e1e` | `e84e1e:	00 00` |
| `0xe84e20` | `e84e20:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax` |
| `0xe84e27` | `e84e27:	00` |
| `0xe84e28` | `e84e28:	48 8d 5c 24 78       	lea    rbx,[rsp+0x78]` |
| `0xe84e2d` | `e84e2d:	48 89 df             	mov    rdi,rbx` |
| `0xe84e30` | `e84e30:	e8 fb 64 c2 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe84e35` | `e84e35:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]` |
| `0xe84e38` | `e84e38:	48 85 db             	test   rbx,rbx` |
| `0xe84e3b` | `e84e3b:	74 35                	je     e84e72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4c288>` |
| `0xe84e3d` | `e84e3d:	48 89 e7             	mov    rdi,rsp` |
| `0xe84e40` | `e84e40:	e8 51 2c 63 00       	call   14b7a96 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fd01a>` |
| `0xe84e45` | `e84e45:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0xe84e48` | `e84e48:	48 89 df             	mov    rdi,rbx` |
| `0xe84e4b` | `e84e4b:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0xe84e4e` | `e84e4e:	48 8b 74 24 60       	mov    rsi,QWORD PTR [rsp+0x60]` |
| `0xe84e53` | `e84e53:	48 8b 54 24 68       	mov    rdx,QWORD PTR [rsp+0x68]` |
| `0xe84e58` | `e84e58:	48 89 c7             	mov    rdi,rax` |
| `0xe84ed6` | `e84ed6:	e8 f5 ad be ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0xe84edb` | `e84edb:	e8 d0 ab 96 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xe84ee0` | `e84ee0:	53                   	push   rbx` |
| `0xe84ee1` | `e84ee1:	48 83 ec 50          	sub    rsp,0x50` |
| `0xe84ee5` | `e84ee5:	48 89 fe             	mov    rsi,rdi` |
| `0xe84ee8` | `e84ee8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xe84eef` | `e84eef:	00 00` |
| `0xe84ef1` | `e84ef1:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax` |
| `0xe84ef6` | `e84ef6:	48 8d 5c 24 38       	lea    rbx,[rsp+0x38]` |
| `0xe84efb` | `e84efb:	48 89 df             	mov    rdi,rbx` |
| `0xe84efe` | `e84efe:	e8 2d 64 c2 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe84f03` | `e84f03:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]` |
| `0xe84f06` | `e84f06:	48 85 db             	test   rbx,rbx` |
| `0xe84f09` | `e84f09:	74 22                	je     e84f2d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4c343>` |
| `0xe84f0b` | `e84f0b:	0f 57 c0             	xorps  xmm0,xmm0` |
| `0xe84f0e` | `e84f0e:	48 89 e6             	mov    rsi,rsp` |
| `0xe84f11` | `e84f11:	0f 29 46 20          	movaps XMMWORD PTR [rsi+0x20],xmm0` |
| `0xe84f15` | `e84f15:	0f 29 46 10          	movaps XMMWORD PTR [rsi+0x10],xmm0` |
| `0xe84f19` | `e84f19:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0` |
| `0xe84f1c` | `e84f1c:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0xe84f1f` | `e84f1f:	48 89 df             	mov    rdi,rbx` |
| `0xe84f22` | `e84f22:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xe85242` | `e85242:	41 56                	push   r14` |
| `0xe85244` | `e85244:	53                   	push   rbx` |
| `0xe85245` | `e85245:	48 83 ec 18          	sub    rsp,0x18` |
| `0xe85249` | `e85249:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xe85250` | `e85250:	00 00` |
| `0xe85252` | `e85252:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xe85257` | `e85257:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]` |
| `0xe8525a` | `e8525a:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0xe8525e` | `e8525e:	49 89 e6             	mov    r14,rsp` |
| `0xe85261` | `e85261:	4c 89 f7             	mov    rdi,r14` |
| `0xe85264` | `e85264:	e8 c7 60 c2 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe85269` | `e85269:	49 8b 3e             	mov    rdi,QWORD PTR [r14]` |
| `0xe8526c` | `e8526c:	48 85 ff             	test   rdi,rdi` |
| `0xe8526f` | `e8526f:	74 14                	je     e85285 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4c69b>` |
| `0xe85271` | `e85271:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xe85274` | `e85274:	ff 90 d8 00 00 00    	call   QWORD PTR [rax+0xd8]` |
| `0xe8527a` | `e8527a:	48 89 df             	mov    rdi,rbx` |
| `0xe8527d` | `e8527d:	48 89 c6             	mov    rsi,rax` |
| `0xe85280` | `e85280:	e8 63 00 00 00       	call   e852e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4c6fe>` |
| `0xe85285` | `e85285:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]` |
| `0xe8528a` | `e8528a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xe85291` | `e85291:	00 00` |
| `0xe88dbe` | `e88dbe:	41 56                	push   r14` |
| `0xe88dc0` | `e88dc0:	53                   	push   rbx` |
| `0xe88dc1` | `e88dc1:	48 83 ec 40          	sub    rsp,0x40` |
| `0xe88dc5` | `e88dc5:	48 89 f3             	mov    rbx,rsi` |
| `0xe88dc8` | `e88dc8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xe88dcf` | `e88dcf:	00 00` |
| `0xe88dd1` | `e88dd1:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax` |
| `0xe88dd6` | `e88dd6:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0xe88dda` | `e88dda:	49 89 e6             	mov    r14,rsp` |
| `0xe88ddd` | `e88ddd:	4c 89 f7             	mov    rdi,r14` |
| `0xe88de0` | `e88de0:	e8 4b 25 c2 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe88de5` | `e88de5:	4d 8b 36             	mov    r14,QWORD PTR [r14]` |
| `0xe88de8` | `e88de8:	4d 85 f6             	test   r14,r14` |
| `0xe88deb` | `e88deb:	74 23                	je     e88e10 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50226>` |
| `0xe88ded` | `e88ded:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]` |
| `0xe88df2` | `e88df2:	4c 89 ff             	mov    rdi,r15` |
| `0xe88df5` | `e88df5:	48 89 de             	mov    rsi,rbx` |
| `0xe88df8` | `e88df8:	e8 3c 00 00 00       	call   e88e39 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5024f>` |
| `0xe88dfd` | `e88dfd:	4c 89 f7             	mov    rdi,r14` |
| `0xe88e00` | `e88e00:	4c 89 fe             	mov    rsi,r15` |
| `0xe88e03` | `e88e03:	e8 54 8a 75 00       	call   15e185c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426de0>` |
| `0xe88e08` | `e88e08:	4c 89 ff             	mov    rdi,r15` |
| `0xe98fe4` | `e98fe4:	41 56                	push   r14` |
| `0xe98fe6` | `e98fe6:	53                   	push   rbx` |
| `0xe98fe7` | `e98fe7:	48 83 ec 50          	sub    rsp,0x50` |
| `0xe98feb` | `e98feb:	48 89 f3             	mov    rbx,rsi` |
| `0xe98fee` | `e98fee:	48 89 fe             	mov    rsi,rdi` |
| `0xe98ff1` | `e98ff1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xe98ff8` | `e98ff8:	00 00` |
| `0xe98ffa` | `e98ffa:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax` |
| `0xe98fff` | `e98fff:	49 89 e6             	mov    r14,rsp` |
| `0xe99002` | `e99002:	4c 89 f7             	mov    rdi,r14` |
| `0xe99005` | `e99005:	e8 26 23 c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe9900a` | `e9900a:	4d 8b 36             	mov    r14,QWORD PTR [r14]` |
| `0xe9900d` | `e9900d:	4d 85 f6             	test   r14,r14` |
| `0xe99010` | `e99010:	0f 84 1f 01 00 00    	je     e99135 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6054b>` |
| `0xe99016` | `e99016:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]` |
| `0xe9901a` | `e9901a:	e8 43 14 be ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>` |
| `0xe9901f` | `e9901f:	84 c0                	test   al,al` |
| `0xe99021` | `e99021:	0f 84 d0 00 00 00    	je     e990f7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6050d>` |
| `0xe99027` | `e99027:	49 8b 7e 70          	mov    rdi,QWORD PTR [r14+0x70]` |
| `0xe9902b` | `e9902b:	e8 32 14 be ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>` |
| `0xe99030` | `e99030:	84 c0                	test   al,al` |
| `0xe99032` | `e99032:	0f 84 bf 00 00 00    	je     e990f7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6050d>` |
| `0xe99206` | `e99206:	5b                   	pop    rbx` |
| `0xe99207` | `e99207:	e9 7a 52 c0 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xe9920c` | `e9920c:	53                   	push   rbx` |
| `0xe9920d` | `e9920d:	48 83 ec 20          	sub    rsp,0x20` |
| `0xe99211` | `e99211:	48 89 fe             	mov    rsi,rdi` |
| `0xe99214` | `e99214:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xe9921b` | `e9921b:	00 00` |
| `0xe9921d` | `e9921d:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax` |
| `0xe99222` | `e99222:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]` |
| `0xe99227` | `e99227:	48 89 df             	mov    rdi,rbx` |
| `0xe9922a` | `e9922a:	e8 01 21 c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe9922f` | `e9922f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]` |
| `0xe99232` | `e99232:	48 85 ff             	test   rdi,rdi` |
| `0xe99235` | `e99235:	74 06                	je     e9923d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60653>` |
| `0xe99237` | `e99237:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xe9923a` | `e9923a:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0xe9923d` | `e9923d:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0xe99242` | `e99242:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xe99249` | `e99249:	00 00` |
| `0xe9924b` | `e9924b:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]` |
| `0xe99250` | `e99250:	75 0a                	jne    e9925c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60672>` |
| `0xe99252` | `e99252:	48 83 c4 20          	add    rsp,0x20` |
| `0xe9940e` | `e9940e:	53                   	push   rbx` |
| `0xe9940f` | `e9940f:	48 81 ec 48 05 00 00 	sub    rsp,0x548` |
| `0xe99416` | `e99416:	48 89 fb             	mov    rbx,rdi` |
| `0xe99419` | `e99419:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xe99420` | `e99420:	00 00` |
| `0xe99422` | `e99422:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax` |
| `0xe99429` | `e99429:	00` |
| `0xe9942a` | `e9942a:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]` |
| `0xe9942f` | `e9942f:	4c 89 f7             	mov    rdi,r14` |
| `0xe99432` | `e99432:	48 89 de             	mov    rsi,rbx` |
| `0xe99435` | `e99435:	e8 f6 1e c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe9943a` | `e9943a:	49 8b 36             	mov    rsi,QWORD PTR [r14]` |
| `0xe9943d` | `e9943d:	48 85 f6             	test   rsi,rsi` |
| `0xe99440` | `e99440:	74 27                	je     e99469 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6087f>` |
| `0xe99442` | `e99442:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]` |
| `0xe99446` | `e99446:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xe99449` | `e99449:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xe9944e` | `e9944e:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xe99451` | `e99451:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0xe99454` | `e99454:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]` |
| `0xe99459` | `e99459:	48 89 df             	mov    rdi,rbx` |
| `0xe9945c` | `e9945c:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0xe9945f` | `e9945f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xe99464` | `e99464:	e8 f5 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>` |
| `0xe99469` | `e99469:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0xe9946e` | `e9946e:	e8 13 50 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xe99473` | `e99473:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xe9947a` | `e9947a:	00 00` |
| `0xe9947c` | `e9947c:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]` |
| `0xe99483` | `e99483:	00` |
| `0xe99484` | `e99484:	75 42                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>` |
| `0xe99486` | `e99486:	48 81 c4 48 05 00 00 	add    rsp,0x548` |
| `0xe9948d` | `e9948d:	5b                   	pop    rbx` |
| `0xe9948e` | `e9948e:	41 5e                	pop    r14` |
| `0xe99490` | `e99490:	c3                   	ret` |
| `0xe99491` | `e99491:	48 89 c3             	mov    rbx,rax` |
| `0xe99494` | `e99494:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xe99499` | `e99499:	e8 c0 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>` |
| `0xe9949e` | `e9949e:	eb 03                	jmp    e994a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608b9>` |
| `0xe994a0` | `e994a0:	48 89 c3             	mov    rbx,rax` |
| `0xe994a3` | `e994a3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0xe994a8` | `e994a8:	e8 d9 4f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xe994ad` | `e994ad:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xe994b4` | `e994b4:	00 00` |
| `0xe994b6` | `e994b6:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]` |
| `0xe994bd` | `e994bd:	00` |
| `0xe994be` | `e994be:	75 08                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>` |
| `0xe994c0` | `e994c0:	48 89 df             	mov    rdi,rbx` |
| `0xe994c3` | `e994c3:	e8 08 68 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0xe9959e` | `e9959e:	53                   	push   rbx` |
| `0xe9959f` | `e9959f:	48 81 ec 48 05 00 00 	sub    rsp,0x548` |
| `0xe995a6` | `e995a6:	48 89 fb             	mov    rbx,rdi` |
| `0xe995a9` | `e995a9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xe995b0` | `e995b0:	00 00` |
| `0xe995b2` | `e995b2:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax` |
| `0xe995b9` | `e995b9:	00` |
| `0xe995ba` | `e995ba:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]` |
| `0xe995bf` | `e995bf:	4c 89 f7             	mov    rdi,r14` |
| `0xe995c2` | `e995c2:	48 89 de             	mov    rsi,rbx` |
| `0xe995c5` | `e995c5:	e8 66 1d c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe995ca` | `e995ca:	49 8b 36             	mov    rsi,QWORD PTR [r14]` |
| `0xe995cd` | `e995cd:	48 85 f6             	test   rsi,rsi` |
| `0xe995d0` | `e995d0:	74 27                	je     e995f9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60a0f>` |
| `0xe995d2` | `e995d2:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]` |
| `0xe995d6` | `e995d6:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xe995d9` | `e995d9:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xe995de` | `e995de:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xe995e1` | `e995e1:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0xe995e4` | `e995e4:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]` |
| `0xe995e9` | `e995e9:	48 89 df             	mov    rdi,rbx` |
| `0xe995ec` | `e995ec:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0xe995ef` | `e995ef:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xe995f4` | `e995f4:	e8 65 e2 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>` |
| `0xe995f9` | `e995f9:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0xe995fe` | `e995fe:	e8 83 4e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xe99603` | `e99603:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xe9960a` | `e9960a:	00 00` |
| `0xe9960c` | `e9960c:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]` |
| `0xe99613` | `e99613:	00` |
| `0xe99614` | `e99614:	75 42                	jne    e99658 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60a6e>` |
| `0xe99616` | `e99616:	48 81 c4 48 05 00 00 	add    rsp,0x548` |
| `0xe9961d` | `e9961d:	5b                   	pop    rbx` |
| `0xe9961e` | `e9961e:	41 5e                	pop    r14` |
| `0xe99620` | `e99620:	c3                   	ret` |
| `0xe99621` | `e99621:	48 89 c3             	mov    rbx,rax` |
| `0xe99624` | `e99624:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xe99629` | `e99629:	e8 30 e2 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>` |
| `0xe9962e` | `e9962e:	eb 03                	jmp    e99633 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60a49>` |
| `0xe99630` | `e99630:	48 89 c3             	mov    rbx,rax` |
| `0xe99633` | `e99633:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0xe99638` | `e99638:	e8 49 4e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xe9963d` | `e9963d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xe99644` | `e99644:	00 00` |
| `0xe99646` | `e99646:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]` |
| `0xe9964d` | `e9964d:	00` |
| `0xe9964e` | `e9964e:	75 08                	jne    e99658 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60a6e>` |
| `0xe99650` | `e99650:	48 89 df             	mov    rdi,rbx` |
| `0xe99653` | `e99653:	e8 78 66 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0xe996ee` | `e996ee:	53                   	push   rbx` |
| `0xe996ef` | `e996ef:	48 81 ec 70 0a 00 00 	sub    rsp,0xa70` |
| `0xe996f6` | `e996f6:	48 89 fb             	mov    rbx,rdi` |
| `0xe996f9` | `e996f9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xe99700` | `e99700:	00 00` |
| `0xe99702` | `e99702:	48 89 84 24 68 0a 00 	mov    QWORD PTR [rsp+0xa68],rax` |
| `0xe99709` | `e99709:	00` |
| `0xe9970a` | `e9970a:	49 89 e6             	mov    r14,rsp` |
| `0xe9970d` | `e9970d:	4c 89 f7             	mov    rdi,r14` |
| `0xe99710` | `e99710:	48 89 de             	mov    rsi,rbx` |
| `0xe99713` | `e99713:	e8 18 1c c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe99718` | `e99718:	49 8b 36             	mov    rsi,QWORD PTR [r14]` |
| `0xe9971b` | `e9971b:	48 85 f6             	test   rsi,rsi` |
| `0xe9971e` | `e9971e:	74 4b                	je     e9976b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60b81>` |
| `0xe99720` | `e99720:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]` |
| `0xe99724` | `e99724:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xe99727` | `e99727:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]` |
| `0xe9972c` | `e9972c:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xe9972f` | `e9972f:	4c 8d b4 24 38 05 00 	lea    r14,[rsp+0x538]` |
| `0xe99736` | `e99736:	00` |
| `0xe99737` | `e99737:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]` |
| `0xe9973c` | `e9973c:	4c 89 f7             	mov    rdi,r14` |
| `0xe99742` | `e99742:	e8 9b 26 01 00       	call   eabde2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x731f8>` |
| `0xe99747` | `e99747:	41 83 a6 28 05 00 00 	and    DWORD PTR [r14+0x528],0x0` |
| `0xe9974e` | `e9974e:	00` |
| `0xe9974f` | `e9974f:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0xe99752` | `e99752:	48 89 df             	mov    rdi,rbx` |
| `0xe99755` | `e99755:	4c 89 f6             	mov    rsi,r14` |
| `0xe99758` | `e99758:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe9975b` | `e9975b:	4c 89 f7             	mov    rdi,r14` |
| `0xe9975e` | `e9975e:	e8 0b 26 01 00       	call   eabd6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x73184>` |
| `0xe99763` | `e99763:	4c 89 ff             	mov    rdi,r15` |
| `0xe99766` | `e99766:	e8 f3 e0 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>` |
| `0xe9976b` | `e9976b:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]` |
| `0xe99770` | `e99770:	e8 11 4d c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xe99775` | `e99775:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xe9977c` | `e9977c:	00 00` |
| `0xe9977e` | `e9977e:	48 3b 84 24 68 0a 00 	cmp    rax,QWORD PTR [rsp+0xa68]` |
| `0xe99785` | `e99785:	00` |
| `0xe99786` | `e99786:	75 35                	jne    e997bd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60bd3>` |
| `0xe99788` | `e99788:	48 81 c4 70 0a 00 00 	add    rsp,0xa70` |
| `0xe9978f` | `e9978f:	5b                   	pop    rbx` |
| `0xe99790` | `e99790:	41 5e                	pop    r14` |
| `0xe99792` | `e99792:	41 5f                	pop    r15` |
| `0xe997c7` | `e997c7:	48 81 ec 50 05 00 00 	sub    rsp,0x550` |
| `0xe997ce` | `e997ce:	48 89 f3             	mov    rbx,rsi` |
| `0xe997d1` | `e997d1:	49 89 fe             	mov    r14,rdi` |
| `0xe997d4` | `e997d4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xe997db` | `e997db:	00 00` |
| `0xe997dd` | `e997dd:	48 89 84 24 48 05 00 	mov    QWORD PTR [rsp+0x548],rax` |
| `0xe997e4` | `e997e4:	00` |
| `0xe997e5` | `e997e5:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]` |
| `0xe997ea` | `e997ea:	4c 89 ff             	mov    rdi,r15` |
| `0xe997ed` | `e997ed:	4c 89 f6             	mov    rsi,r14` |
| `0xe997f0` | `e997f0:	e8 3b 1b c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe997f5` | `e997f5:	49 83 3f 00          	cmp    QWORD PTR [r15],0x0` |
| `0xe997f9` | `e997f9:	74 34                	je     e9982f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60c45>` |
| `0xe997fb` | `e997fb:	4d 8b 76 10          	mov    r14,QWORD PTR [r14+0x10]` |
| `0xe997ff` | `e997ff:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xe99804` | `e99804:	48 89 de             	mov    rsi,rbx` |
| `0xe99807` | `e99807:	e8 f4 0f 7d 00       	call   166a800 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e96c>` |
| `0xe9980c` | `e9980c:	48 8d 5c 24 18       	lea    rbx,[rsp+0x18]` |
| `0xe99811` | `e99811:	c7 83 28 05 00 00 01 	mov    DWORD PTR [rbx+0x528],0x1` |
| `0xe99818` | `e99818:	00 00 00` |
| `0xe9981b` | `e9981b:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0xe9981e` | `e9981e:	4c 89 f7             	mov    rdi,r14` |
| `0xe99c56` | `e99c56:	53                   	push   rbx` |
| `0xe99c57` | `e99c57:	48 81 ec 48 05 00 00 	sub    rsp,0x548` |
| `0xe99c5e` | `e99c5e:	48 89 fb             	mov    rbx,rdi` |
| `0xe99c61` | `e99c61:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xe99c68` | `e99c68:	00 00` |
| `0xe99c6a` | `e99c6a:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax` |
| `0xe99c71` | `e99c71:	00` |
| `0xe99c72` | `e99c72:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]` |
| `0xe99c77` | `e99c77:	4c 89 f7             	mov    rdi,r14` |
| `0xe99c7a` | `e99c7a:	48 89 de             	mov    rsi,rbx` |
| `0xe99c7d` | `e99c7d:	e8 ae 16 c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe99c82` | `e99c82:	49 8b 36             	mov    rsi,QWORD PTR [r14]` |
| `0xe99c85` | `e99c85:	48 85 f6             	test   rsi,rsi` |
| `0xe99c88` | `e99c88:	74 28                	je     e99cb2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x610c8>` |
| `0xe99c8a` | `e99c8a:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]` |
| `0xe99c8e` | `e99c8e:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xe99c91` | `e99c91:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xe99c96` | `e99c96:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xe99c99` | `e99c99:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0xe99c9c` | `e99c9c:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]` |
| `0xe99ca1` | `e99ca1:	48 89 df             	mov    rdi,rbx` |
| `0xe99ca4` | `e99ca4:	4c 89 f6             	mov    rsi,r14` |
| `0xe99ca7` | `e99ca7:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0xe99caa` | `e99caa:	4c 89 f7             	mov    rdi,r14` |
| `0xe99cad` | `e99cad:	e8 ac db 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>` |
| `0xe99cb2` | `e99cb2:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0xe99cb7` | `e99cb7:	e8 ca 47 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xe99cbc` | `e99cbc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xe99cc3` | `e99cc3:	00 00` |
| `0xe99cc5` | `e99cc5:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]` |
| `0xe99ccc` | `e99ccc:	00` |
| `0xe99ccd` | `e99ccd:	75 33                	jne    e99d02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61118>` |
| `0xe99ccf` | `e99ccf:	48 81 c4 48 05 00 00 	add    rsp,0x548` |
| `0xe99cd6` | `e99cd6:	5b                   	pop    rbx` |
| `0xe99cd7` | `e99cd7:	41 5e                	pop    r14` |
| `0xe99cd9` | `e99cd9:	c3                   	ret` |
| `0xea2b96` | `ea2b96:	53                   	push   rbx` |
| `0xea2b97` | `ea2b97:	48 81 ec f0 02 00 00 	sub    rsp,0x2f0` |
| `0xea2b9e` | `ea2b9e:	49 89 fe             	mov    r14,rdi` |
| `0xea2ba1` | `ea2ba1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xea2ba8` | `ea2ba8:	00 00` |
| `0xea2baa` | `ea2baa:	48 89 84 24 e8 02 00 	mov    QWORD PTR [rsp+0x2e8],rax` |
| `0xea2bb1` | `ea2bb1:	00` |
| `0xea2bb2` | `ea2bb2:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]` |
| `0xea2bb7` | `ea2bb7:	48 89 df             	mov    rdi,rbx` |
| `0xea2bba` | `ea2bba:	4c 89 f6             	mov    rsi,r14` |
| `0xea2bbd` | `ea2bbd:	e8 6e 87 c0 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xea2bc2` | `ea2bc2:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]` |
| `0xea2bc5` | `ea2bc5:	48 85 db             	test   rbx,rbx` |
| `0xea2bc8` | `ea2bc8:	0f 84 24 01 00 00    	je     ea2cf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6a108>` |
| `0xea2bce` | `ea2bce:	49 83 c6 10          	add    r14,0x10` |
| `0xea2bd2` | `ea2bd2:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]` |
| `0xea2bd7` | `ea2bd7:	4c 89 f6             	mov    rsi,r14` |
| `0xea2bda` | `ea2bda:	e8 61 b3 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>` |
| `0xea2bdf` | `ea2bdf:	48 8d 35 96 f3 5a ff 	lea    rsi,[rip+0xffffffffff5af396]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>` |
| `0xea2be6` | `ea2be6:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]` |
| `0xea2bed` | `ea2bed:	00` |
| `0xea2bee` | `ea2bee:	e8 8b 6e bd ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xea7809` | `ea7809:	00 00` |
| `0xea780b` | `ea780b:	48 89 84 24 28 05 00 	mov    QWORD PTR [rsp+0x528],rax` |
| `0xea7812` | `ea7812:	00` |
| `0xea7813` | `ea7813:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]` |
| `0xea7817` | `ea7817:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xea781a` | `ea781a:	48 89 e7             	mov    rdi,rsp` |
| `0xea781d` | `ea781d:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xea7820` | `ea7820:	48 89 e7             	mov    rdi,rsp` |
| `0xea7823` | `ea7823:	80 bf 22 05 00 00 00 	cmp    BYTE PTR [rdi+0x522],0x0` |
| `0xea782a` | `ea782a:	0f 95 c3             	setne  bl` |
| `0xea782d` | `ea782d:	e8 2c 00 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>` |
| `0xea7832` | `ea7832:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xea7839` | `ea7839:	00 00` |
| `0xea783b` | `ea783b:	48 3b 84 24 28 05 00 	cmp    rax,QWORD PTR [rsp+0x528]` |
| `0xea7842` | `ea7842:	00` |
| `0xea7843` | `ea7843:	75 0b                	jne    ea7850 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec66>` |
| `0xea7845` | `ea7845:	89 d8                	mov    eax,ebx` |
| `0xea7847` | `ea7847:	48 81 c4 30 05 00 00 	add    rsp,0x530` |
| `0xea784e` | `ea784e:	5b                   	pop    rbx` |
| `0xea784f` | `ea784f:	c3                   	ret` |
| `0xea7850` | `ea7850:	e8 5b 82 94 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xea7855` | `ea7855:	48 89 c7             	mov    rdi,rax` |
| `0xea7858` | `ea7858:	e8 48 22 bd ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xea785d` | `ea785d:	cc                   	int3` |
| `0xea785e` | `ea785e:	53                   	push   rbx` |
| `0xea785f` | `ea785f:	48 89 fb             	mov    rbx,rdi` |
| `0xea7862` | `ea7862:	48 81 c7 a8 00 00 00 	add    rdi,0xa8` |
| `0xea7869` | `ea7869:	e8 58 50 f6 ff       	call   e0c8c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd994c>` |
| `0xea786e` | `ea786e:	48 83 c3 70          	add    rbx,0x70` |
| `0xea7872` | `ea7872:	48 89 df             	mov    rdi,rbx` |
| `0xea7875` | `ea7875:	5b                   	pop    rbx` |
| `0xea7876` | `ea7876:	e9 b7 58 c0 ff       	jmp    aad132 <JNI_OnUnload@@Base+0x349ff>` |
| `0xea787b` | `ea787b:	cc                   	int3` |
| `0xea787c` | `ea787c:	53                   	push   rbx` |
| `0xea787d` | `ea787d:	48 89 fb             	mov    rbx,rdi` |
| `0xea7880` | `ea7880:	6a 10                	push   0x10` |
| `0xeabdb4` | `eabdb4:	00 00` |
| `0xeabdb6` | `eabdb6:	48 3b 44 24 08       	cmp    rax,QWORD PTR [rsp+0x8]` |
| `0xeabdbb` | `eabdbb:	75 06                	jne    eabdc3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x731d9>` |
| `0xeabdbd` | `eabdbd:	48 83 c4 10          	add    rsp,0x10` |
| `0xeabdc1` | `eabdc1:	5b                   	pop    rbx` |
| `0xeabdc2` | `eabdc2:	c3                   	ret` |
| `0xeabdc3` | `eabdc3:	e8 e8 3c 94 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xeabdc8` | `eabdc8:	48 89 c7             	mov    rdi,rax` |
| `0xeabdcb` | `eabdcb:	e8 d5 dc bc ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xeabdd0` | `eabdd0:	48 89 f7             	mov    rdi,rsi` |
| `0xeabdd3` | `eabdd3:	e9 86 ba ff ff       	jmp    ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>` |
| `0xeabdd8` | `eabdd8:	48 8b 7e 18          	mov    rdi,QWORD PTR [rsi+0x18]` |
| `0xeabddc` | `eabddc:	e9 95 29 bf ff       	jmp    a9e776 <JNI_OnUnload@@Base+0x26043>` |
| `0xeabde1` | `eabde1:	cc                   	int3` |
| `0xeabde2` | `eabde2:	41 56                	push   r14` |
| `0xeabde4` | `eabde4:	53                   	push   rbx` |
| `0xeabde5` | `eabde5:	50                   	push   rax` |
| `0xeabde6` | `eabde6:	49 89 f6             	mov    r14,rsi` |
| `0xeabde9` | `eabde9:	48 89 fb             	mov    rbx,rdi` |
| `0xeabdec` | `eabdec:	6a 6d                	push   0x6d` |
| `0xeabdee` | `eabdee:	59                   	pop    rcx` |
| `0xeabdef` | `eabdef:	f3 a4                	rep movs BYTE PTR es:[rdi],BYTE PTR ds:[rsi]` |
| `0xeaddfe` | `eaddfe:	48 8d bc 24 e8 00 00 	lea    rdi,[rsp+0xe8]` |
| `0xeade05` | `eade05:	00` |
| `0xeade06` | `eade06:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xeade09` | `eade09:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0xeade0c` | `eade0c:	48 8d b4 24 e8 00 00 	lea    rsi,[rsp+0xe8]` |
| `0xeade13` | `eade13:	00` |
| `0xeade14` | `eade14:	4c 89 ff             	mov    rdi,r15` |
| `0xeade17` | `eade17:	ff 90 20 01 00 00    	call   QWORD PTR [rax+0x120]` |
| `0xeade1d` | `eade1d:	48 8d bc 24 e8 00 00 	lea    rdi,[rsp+0xe8]` |
| `0xeade24` | `eade24:	00` |
| `0xeade25` | `eade25:	e8 34 9a ff ff       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>` |
| `0xeade2a` | `eade2a:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]` |
| `0xeade31` | `eade31:	00` |
| `0xeade32` | `eade32:	e8 83 5a 00 00       	call   eb38ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7acd0>` |
| `0xeade37` | `eade37:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]` |
| `0xeade3c` | `eade3c:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]` |
| `0xeade40` | `eade40:	e8 4b ff c0 ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>` |
| `0xeade45` | `eade45:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]` |
| `0xeade4a` | `eade4a:	e8 4f 54 00 00       	call   eb329e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7a6b4>` |
| `0xeade4f` | `eade4f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xeade56` | `eade56:	00 00` |
| `0xeade58` | `eade58:	48 3b 84 24 80 06 00 	cmp    rax,QWORD PTR [rsp+0x680]` |
| `0xeade62` | `eade62:	48 81 c4 88 06 00 00 	add    rsp,0x688` |
| `0xeade69` | `eade69:	5b                   	pop    rbx` |
| `0xeade6a` | `eade6a:	41 5c                	pop    r12` |
| `0xeade6c` | `eade6c:	41 5e                	pop    r14` |
| `0xeade6e` | `eade6e:	41 5f                	pop    r15` |
| `0xeade70` | `eade70:	c3                   	ret` |
| `0xeade71` | `eade71:	eb 24                	jmp    eade97 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x752ad>` |
| `0xeade73` | `eade73:	48 89 c3             	mov    rbx,rax` |
| `0xeade76` | `eade76:	48 8d bc 24 e8 00 00 	lea    rdi,[rsp+0xe8]` |
| `0xeade7d` | `eade7d:	00` |
| `0xeade7e` | `eade7e:	e8 db 99 ff ff       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>` |
| `0xeade83` | `eade83:	eb 03                	jmp    eade88 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7529e>` |
| `0xeade85` | `eade85:	48 89 c3             	mov    rbx,rax` |
| `0xeade88` | `eade88:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]` |
| `0xeade8f` | `eade8f:	00` |
| `0xeade90` | `eade90:	e8 25 5a 00 00       	call   eb38ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7acd0>` |
| `0xeade95` | `eade95:	eb 03                	jmp    eade9a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x752b0>` |
| `0xeade97` | `eade97:	48 89 c3             	mov    rbx,rax` |
| `0xeade9a` | `eade9a:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]` |
| `0xeade9f` | `eade9f:	e8 fa 53 00 00       	call   eb329e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7a6b4>` |
| `0xeadea4` | `eadea4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xeadeab` | `eadeab:	00 00` |
| `0xeaf49f` | `eaf49f:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]` |
| `0xeaf4a6` | `eaf4a6:	00` |
| `0xeaf4a7` | `eaf4a7:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xeaf4aa` | `eaf4aa:	49 8b 04 24          	mov    rax,QWORD PTR [r12]` |
| `0xeaf4ae` | `eaf4ae:	48 8d b4 24 28 01 00 	lea    rsi,[rsp+0x128]` |
| `0xeaf4b5` | `eaf4b5:	00` |
| `0xeaf4b6` | `eaf4b6:	4c 89 e7             	mov    rdi,r12` |
| `0xeaf4b9` | `eaf4b9:	ff 90 20 01 00 00    	call   QWORD PTR [rax+0x120]` |
| `0xeaf4bf` | `eaf4bf:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]` |
| `0xeaf4c6` | `eaf4c6:	00` |
| `0xeaf4c7` | `eaf4c7:	e8 92 83 ff ff       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>` |
| `0xeaf4cc` | `eaf4cc:	48 8d 05 8d 2d 98 00 	lea    rax,[rip+0x982d8d]        # 1832260 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x41f8>` |
| `0xeaf4d3` | `eaf4d3:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]` |
| `0xeaf4da` | `eaf4da:	00` |
| `0xeaf4db` | `eaf4db:	49 89 04 24          	mov    QWORD PTR [r12],rax` |
| `0xeaf4df` | `eaf4df:	4d 89 74 24 08       	mov    QWORD PTR [r12+0x8],r14` |
| `0xeaf4e4` | `eaf4e4:	4d 89 7c 24 10       	mov    QWORD PTR [r12+0x10],r15` |
| `0xeaf4e9` | `eaf4e9:	4d 89 64 24 20       	mov    QWORD PTR [r12+0x20],r12` |
| `0xeaf4ee` | `eaf4ee:	4c 8d bc 24 28 01 00 	lea    r15,[rsp+0x128]` |
| `0xeaf4f5` | `eaf4f5:	00` |
| `0xeaf4f6` | `eaf4f6:	4c 89 ff             	mov    rdi,r15` |
| `0xeaf4f9` | `eaf4f9:	4c 89 f6             	mov    rsi,r14` |
| `0xeaf559` | `eaf559:	48 81 c4 98 06 00 00 	add    rsp,0x698` |
| `0xeaf560` | `eaf560:	5b                   	pop    rbx` |
| `0xeaf561` | `eaf561:	41 5c                	pop    r12` |
| `0xeaf563` | `eaf563:	41 5e                	pop    r14` |
| `0xeaf565` | `eaf565:	41 5f                	pop    r15` |
| `0xeaf567` | `eaf567:	c3                   	ret` |
| `0xeaf568` | `eaf568:	eb 24                	jmp    eaf58e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x769a4>` |
| `0xeaf56a` | `eaf56a:	48 89 c3             	mov    rbx,rax` |
| `0xeaf56d` | `eaf56d:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]` |
| `0xeaf574` | `eaf574:	00` |
| `0xeaf575` | `eaf575:	e8 e4 82 ff ff       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>` |
| `0xeaf57a` | `eaf57a:	eb 03                	jmp    eaf57f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x76995>` |
| `0xeaf57c` | `eaf57c:	48 89 c3             	mov    rbx,rax` |
| `0xeaf57f` | `eaf57f:	48 8d bc 24 50 06 00 	lea    rdi,[rsp+0x650]` |
| `0xeaf586` | `eaf586:	00` |
| `0xeaf587` | `eaf587:	e8 2e 43 00 00       	call   eb38ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7acd0>` |
| `0xeaf58c` | `eaf58c:	eb 03                	jmp    eaf591 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x769a7>` |
| `0xeaf58e` | `eaf58e:	48 89 c3             	mov    rbx,rax` |
| `0xeaf591` | `eaf591:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]` |
| `0xeaf596` | `eaf596:	e8 03 3d 00 00       	call   eb329e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7a6b4>` |
| `0xeaf59b` | `eaf59b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xeaf5a2` | `eaf5a2:	00 00` |
| `0xeaf631` | `eaf631:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]` |
| `0xeaf638` | `eaf638:	00` |
| `0xeaf639` | `eaf639:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xeaf63c` | `eaf63c:	49 8b 04 24          	mov    rax,QWORD PTR [r12]` |
| `0xeaf640` | `eaf640:	48 8d b4 24 28 01 00 	lea    rsi,[rsp+0x128]` |
| `0xeaf647` | `eaf647:	00` |
| `0xeaf648` | `eaf648:	4c 89 e7             	mov    rdi,r12` |
| `0xeaf64b` | `eaf64b:	ff 90 20 01 00 00    	call   QWORD PTR [rax+0x120]` |
| `0xeaf651` | `eaf651:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]` |
| `0xeaf658` | `eaf658:	00` |
| `0xeaf659` | `eaf659:	e8 00 82 ff ff       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>` |
| `0xeaf65e` | `eaf65e:	48 8d 05 43 2c 98 00 	lea    rax,[rip+0x982c43]        # 18322a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4240>` |
| `0xeaf665` | `eaf665:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]` |
| `0xeaf66c` | `eaf66c:	00` |
| `0xeaf66d` | `eaf66d:	49 89 04 24          	mov    QWORD PTR [r12],rax` |
| `0xeaf671` | `eaf671:	4d 89 74 24 08       	mov    QWORD PTR [r12+0x8],r14` |
| `0xeaf676` | `eaf676:	4d 89 7c 24 10       	mov    QWORD PTR [r12+0x10],r15` |
| `0xeaf67b` | `eaf67b:	4d 89 64 24 20       	mov    QWORD PTR [r12+0x20],r12` |
| `0xeaf680` | `eaf680:	4c 8d bc 24 28 01 00 	lea    r15,[rsp+0x128]` |
| `0xeaf687` | `eaf687:	00` |
| `0xeaf688` | `eaf688:	4c 89 ff             	mov    rdi,r15` |
| `0xeaf68b` | `eaf68b:	4c 89 f6             	mov    rsi,r14` |
| `0xeaf6eb` | `eaf6eb:	48 81 c4 98 06 00 00 	add    rsp,0x698` |
| `0xeaf6f2` | `eaf6f2:	5b                   	pop    rbx` |
| `0xeaf6f3` | `eaf6f3:	41 5c                	pop    r12` |
| `0xeaf6f5` | `eaf6f5:	41 5e                	pop    r14` |
| `0xeaf6f7` | `eaf6f7:	41 5f                	pop    r15` |
| `0xeaf6f9` | `eaf6f9:	c3                   	ret` |
| `0xeaf6fa` | `eaf6fa:	eb 24                	jmp    eaf720 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x76b36>` |
| `0xeaf6fc` | `eaf6fc:	48 89 c3             	mov    rbx,rax` |
| `0xeaf6ff` | `eaf6ff:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]` |
| `0xeaf706` | `eaf706:	00` |
| `0xeaf707` | `eaf707:	e8 52 81 ff ff       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>` |
| `0xeaf70c` | `eaf70c:	eb 03                	jmp    eaf711 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x76b27>` |
| `0xeaf70e` | `eaf70e:	48 89 c3             	mov    rbx,rax` |
| `0xeaf711` | `eaf711:	48 8d bc 24 50 06 00 	lea    rdi,[rsp+0x650]` |
| `0xeaf718` | `eaf718:	00` |
| `0xeaf719` | `eaf719:	e8 9c 41 00 00       	call   eb38ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7acd0>` |
| `0xeaf71e` | `eaf71e:	eb 03                	jmp    eaf723 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x76b39>` |
| `0xeaf720` | `eaf720:	48 89 c3             	mov    rbx,rax` |
| `0xeaf723` | `eaf723:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]` |
| `0xeaf728` | `eaf728:	e8 71 3b 00 00       	call   eb329e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7a6b4>` |
| `0xeaf72d` | `eaf72d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xeaf734` | `eaf734:	00 00` |
| `0xeaf7c3` | `eaf7c3:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]` |
| `0xeaf7ca` | `eaf7ca:	00` |
| `0xeaf7cb` | `eaf7cb:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xeaf7ce` | `eaf7ce:	49 8b 04 24          	mov    rax,QWORD PTR [r12]` |
| `0xeaf7d2` | `eaf7d2:	48 8d b4 24 28 01 00 	lea    rsi,[rsp+0x128]` |
| `0xeaf7d9` | `eaf7d9:	00` |
| `0xeaf7da` | `eaf7da:	4c 89 e7             	mov    rdi,r12` |
| `0xeaf7dd` | `eaf7dd:	ff 90 20 01 00 00    	call   QWORD PTR [rax+0x120]` |
| `0xeaf7e3` | `eaf7e3:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]` |
| `0xeaf7ea` | `eaf7ea:	00` |
| `0xeaf7eb` | `eaf7eb:	e8 6e 80 ff ff       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>` |
| `0xeaf7f0` | `eaf7f0:	48 8d 05 f9 2a 98 00 	lea    rax,[rip+0x982af9]        # 18322f0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4288>` |
| `0xeaf7f7` | `eaf7f7:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]` |
| `0xeaf7fe` | `eaf7fe:	00` |
| `0xeaf7ff` | `eaf7ff:	49 89 04 24          	mov    QWORD PTR [r12],rax` |
| `0xeaf803` | `eaf803:	4d 89 74 24 08       	mov    QWORD PTR [r12+0x8],r14` |
| `0xeaf808` | `eaf808:	4d 89 7c 24 10       	mov    QWORD PTR [r12+0x10],r15` |
| `0xeaf80d` | `eaf80d:	4d 89 64 24 20       	mov    QWORD PTR [r12+0x20],r12` |
| `0xeaf812` | `eaf812:	4c 8d bc 24 28 01 00 	lea    r15,[rsp+0x128]` |
| `0xeaf819` | `eaf819:	00` |
| `0xeaf81a` | `eaf81a:	4c 89 ff             	mov    rdi,r15` |
| `0xeaf81d` | `eaf81d:	4c 89 f6             	mov    rsi,r14` |
| `0xeaf87d` | `eaf87d:	48 81 c4 98 06 00 00 	add    rsp,0x698` |
| `0xeaf884` | `eaf884:	5b                   	pop    rbx` |
| `0xeaf885` | `eaf885:	41 5c                	pop    r12` |
| `0xeaf887` | `eaf887:	41 5e                	pop    r14` |
| `0xeaf889` | `eaf889:	41 5f                	pop    r15` |
| `0xeaf88b` | `eaf88b:	c3                   	ret` |
| `0xeaf88c` | `eaf88c:	eb 24                	jmp    eaf8b2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x76cc8>` |
| `0xeaf88e` | `eaf88e:	48 89 c3             	mov    rbx,rax` |
| `0xeaf891` | `eaf891:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]` |
| `0xeaf898` | `eaf898:	00` |
| `0xeaf899` | `eaf899:	e8 c0 7f ff ff       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>` |
| `0xeaf89e` | `eaf89e:	eb 03                	jmp    eaf8a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x76cb9>` |
| `0xeaf8a0` | `eaf8a0:	48 89 c3             	mov    rbx,rax` |
| `0xeaf8a3` | `eaf8a3:	48 8d bc 24 50 06 00 	lea    rdi,[rsp+0x650]` |
| `0xeaf8aa` | `eaf8aa:	00` |
| `0xeaf8ab` | `eaf8ab:	e8 0a 40 00 00       	call   eb38ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7acd0>` |
| `0xeaf8b0` | `eaf8b0:	eb 03                	jmp    eaf8b5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x76ccb>` |
| `0xeaf8b2` | `eaf8b2:	48 89 c3             	mov    rbx,rax` |
| `0xeaf8b5` | `eaf8b5:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]` |
| `0xeaf8ba` | `eaf8ba:	e8 df 39 00 00       	call   eb329e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7a6b4>` |
| `0xeaf8bf` | `eaf8bf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xeaf8c6` | `eaf8c6:	00 00` |
| `0xeb0ace` | `eb0ace:	48 8d bc 24 e8 00 00 	lea    rdi,[rsp+0xe8]` |
| `0xeb0ad5` | `eb0ad5:	00` |
| `0xeb0ad6` | `eb0ad6:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xeb0ad9` | `eb0ad9:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0xeb0adc` | `eb0adc:	48 8d b4 24 e8 00 00 	lea    rsi,[rsp+0xe8]` |
| `0xeb0ae3` | `eb0ae3:	00` |
| `0xeb0ae4` | `eb0ae4:	4c 89 ff             	mov    rdi,r15` |
| `0xeb0ae7` | `eb0ae7:	ff 90 20 01 00 00    	call   QWORD PTR [rax+0x120]` |
| `0xeb0aed` | `eb0aed:	48 8d bc 24 e8 00 00 	lea    rdi,[rsp+0xe8]` |
| `0xeb0af4` | `eb0af4:	00` |
| `0xeb0af5` | `eb0af5:	e8 64 6d ff ff       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>` |
| `0xeb0afa` | `eb0afa:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]` |
| `0xeb0b01` | `eb0b01:	00` |
| `0xeb0b02` | `eb0b02:	e8 b3 2d 00 00       	call   eb38ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7acd0>` |
| `0xeb0b07` | `eb0b07:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]` |
| `0xeb0b0c` | `eb0b0c:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]` |
| `0xeb0b10` | `eb0b10:	e8 7b d2 c0 ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>` |
| `0xeb0b15` | `eb0b15:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]` |
| `0xeb0b1a` | `eb0b1a:	e8 7f 27 00 00       	call   eb329e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7a6b4>` |
| `0xeb0b1f` | `eb0b1f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xeb0b26` | `eb0b26:	00 00` |
| `0xeb0b28` | `eb0b28:	48 3b 84 24 80 06 00 	cmp    rax,QWORD PTR [rsp+0x680]` |
| `0xeb0b32` | `eb0b32:	48 81 c4 88 06 00 00 	add    rsp,0x688` |
| `0xeb0b39` | `eb0b39:	5b                   	pop    rbx` |
| `0xeb0b3a` | `eb0b3a:	41 5c                	pop    r12` |
| `0xeb0b3c` | `eb0b3c:	41 5e                	pop    r14` |
| ... | truncated 13581 more |

## Filtered `ea785e` body signals

| addr | instruction |
|---:|---|
| `0xea785f` | `ea785f:	48 89 fb             	mov    rbx,rdi` |
| `0xea7869` | `ea7869:	e8 58 50 f6 ff       	call   e0c8c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd994c>` |
| `0xea7872` | `ea7872:	48 89 df             	mov    rdi,rbx` |
| `0xea7876` | `ea7876:	e9 b7 58 c0 ff       	jmp    aad132 <JNI_OnUnload@@Base+0x349ff>` |
| `0xea787d` | `ea787d:	48 89 fb             	mov    rbx,rdi` |
| `0xea7883` | `ea7883:	e8 78 66 94 00       	call   17edf00 <_Znwm@plt>` |
| `0xea7888` | `ea7888:	48 8d 0d 49 9d 98 00 	lea    rcx,[rip+0x989d49]        # 18315d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3570>` |
| `0xea788f` | `ea788f:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0xea7892` | `ea7892:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]` |
| `0xea7896` | `ea7896:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx` |
| `0xea789c` | `ea789c:	48 8d 05 35 9d 98 00 	lea    rax,[rip+0x989d35]        # 18315d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3570>` |
| `0xea78a3` | `ea78a3:	48 89 06             	mov    QWORD PTR [rsi],rax` |
| `0xea78a6` | `ea78a6:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]` |
| `0xea78aa` | `ea78aa:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax` |
| `0xea78be` | `ea78be:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xea78c7` | `ea78c7:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax` |
| `0xea78cf` | `ea78cf:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]` |
| `0xea78d8` | `ea78d8:	4c 89 f7             	mov    rdi,r14` |
| `0xea78db` | `ea78db:	e8 ea eb c4 ff       	call   af64ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4346a>` |
| `0xea78e7` | `ea78e7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax` |
| `0xea78ec` | `ea78ec:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xea78f1` | `ea78f1:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0` |
| `0xea78fc` | `ea78fc:	4c 89 f6             	mov    rsi,r14` |
| `0xea78ff` | `ea78ff:	e8 c6 eb c4 ff       	call   af64ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4346a>` |
| `0xea7919` | `ea7919:	e8 e2 65 94 00       	call   17edf00 <_Znwm@plt>` |
| `0xea791e` | `ea791e:	49 89 c6             	mov    r14,rax` |
| `0xea7926` | `ea7926:	48 89 c7             	mov    rdi,rax` |
| `0xea7929` | `ea7929:	4c 89 fe             	mov    rsi,r15` |
| `0xea792c` | `ea792c:	e8 99 eb c4 ff       	call   af64ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4346a>` |
| `0xea7939` | `ea7939:	4d 89 34 24          	mov    QWORD PTR [r12],r14` |
| `0xea7944` | `ea7944:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax` |
| `0xea7950` | `ea7950:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax` |
| `0xea7955` | `ea7955:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]` |
| `0xea795a` | `ea795a:	48 89 df             	mov    rdi,rbx` |
| `0xea795d` | `ea795d:	4c 89 e2             	mov    rdx,r12` |
| `0xea7960` | `ea7960:	e8 23 9b 91 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>` |
| `0xea7965` | `ea7965:	4c 89 e7             	mov    rdi,r12` |
| `0xea7968` | `ea7968:	e8 31 f9 bf ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>` |
| `0xea796d` | `ea796d:	4c 89 ff             	mov    rdi,r15` |
| `0xea7970` | `ea7970:	e8 6b 2b c5 ff       	call   afa4e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x47480>` |
| `0xea797a` | `ea797a:	e8 eb 25 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0xea797f` | `ea797f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xea79a1` | `ea79a1:	e8 0a 81 94 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xea79a6` | `ea79a6:	48 89 c3             	mov    rbx,rax` |
| `0xea79b1` | `ea79b1:	e8 e8 f8 bf ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>` |
| `0xea79b6` | `ea79b6:	48 89 df             	mov    rdi,rbx` |
| `0xea79b9` | `ea79b9:	e8 e7 20 bd ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xea79be` | `ea79be:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xea79c1` | `ea79c1:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]` |
| `0xea79c5` | `ea79c5:	e9 00 00 00 00       	jmp    ea79ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ede0>` |
| `0xea79cb` | `ea79cb:	e8 92 2a bd ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>` |
| `0xea79d2` | `ea79d2:	48 89 c7             	mov    rdi,rax` |
| `0xea79d5` | `ea79d5:	e8 cb 20 bd ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xea79da` | `ea79da:	48 8d 05 bf 9b 98 00 	lea    rax,[rip+0x989bbf]        # 18315a0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3538>` |
| `0xea79e1` | `ea79e1:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xea79e4` | `ea79e4:	e9 27 66 94 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>` |
| `0xea79eb` | `ea79eb:	48 89 fb             	mov    rbx,rdi` |
| `0xea79ee` | `ea79ee:	e8 e7 ff ff ff       	call   ea79da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6edf0>` |
| `0xea79f3` | `ea79f3:	48 89 df             	mov    rdi,rbx` |
| `0xea79f7` | `ea79f7:	e9 24 65 94 00       	jmp    17edf20 <_ZdlPv@plt>` |
| `0xea7a01` | `ea7a01:	48 89 fb             	mov    rbx,rdi` |
| `0xea7a0b` | `ea7a0b:	e8 98 52 ee ff       	call   d8cca8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59d2e>` |
| `0xea7a10` | `ea7a10:	4c 8b b3 b8 00 00 00 	mov    r14,QWORD PTR [rbx+0xb8]` |
| `0xea7a17` | `ea7a17:	4d 85 f6             	test   r14,r14` |
| `0xea7a1c` | `ea7a1c:	4d 8b 3e             	mov    r15,QWORD PTR [r14]` |
| `0xea7a1f` | `ea7a1f:	49 8d 7e 10          	lea    rdi,[r14+0x10]` |
| `0xea7a23` | `ea7a23:	e8 6c 00 00 00       	call   ea7a94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6eeaa>` |
| `0xea7a28` | `ea7a28:	4c 89 f7             	mov    rdi,r14` |
| `0xea7a2b` | `ea7a2b:	e8 f0 64 94 00       	call   17edf20 <_ZdlPv@plt>` |
| `0xea7a30` | `ea7a30:	4d 89 fe             	mov    r14,r15` |
| `0xea7a33` | `ea7a33:	4d 85 ff             	test   r15,r15` |
| `0xea7a38` | `ea7a38:	48 8b bb a8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xa8]` |
| `0xea7a47` | `ea7a47:	48 85 ff             	test   rdi,rdi` |
| `0xea7a4c` | `ea7a4c:	e8 cf 64 94 00       	call   17edf20 <_ZdlPv@plt>` |
| `0xea7a51` | `ea7a51:	48 8b bb 90 00 00 00 	mov    rdi,QWORD PTR [rbx+0x90]` |
| `0xea7a58` | `ea7a58:	e8 81 00 00 00       	call   ea7ade <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6eef4>` |
| `0xea7a5d` | `ea7a5d:	48 8b bb 80 00 00 00 	mov    rdi,QWORD PTR [rbx+0x80]` |
| `0xea7a6c` | `ea7a6c:	48 85 ff             	test   rdi,rdi` |
| `0xea7a71` | `ea7a71:	e8 aa 64 94 00       	call   17edf20 <_ZdlPv@plt>` |
| `0xea7a7e` | `ea7a7e:	48 89 df             	mov    rdi,rbx` |

