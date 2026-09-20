# Native restriction xrefs grouped by ELF unwind range

Function-like ranges come from .eh_frame FDEs; this works even when local C++ symbols are stripped.

- ad.skippable_ad_delay: 0x438801
- ad_disallow: 0x36dd45, 0x43d0c1
- mft_disallow: 0x32bea6, 0x43d2a1
- disallow_skipping_next_reasons: 0x35aa90, 0x597f24, 0x597f4a, 0x5f2bd0, 0x5fc751, 0x193631a, 0x19a4d8a, 0x19afc5c
- SKIP_TO_NEXT_RESTRICTED: 0x5f81e3
- skip_to_next_restricted: 0x3684ad

Total direct xrefs: 32; FDE groups: 9

## Group 1: 0xfe9a77..0xfea5b8 (size 0xb41)
Targets: disallow_skipping_next_reasons
Xrefs: disallow_skipping_next_reasons@0xfe9ea7

### disallow_skipping_next_reasons @ 0xfe9ea7
ASM BEGIN
  fe9e91:	00 
  fe9e92:	6a 78                	push   0x78
  fe9e94:	5a                   	pop    rdx
  fe9e95:	e8 4e 09 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
  fe9e9a:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  fe9ea1:	00 
  fe9ea2:	e8 e9 3f 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  fe9ea7:	48 8d 35 e2 0b 37 ff 	lea    rsi,[rip+0xffffffffff370be2]        # 35aa90 <_ZTSSt12bad_any_cast@@Base-0x35738>
  fe9eae:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  fe9eb5:	00 
  fe9eb6:	e8 c3 fb a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  fe9ebb:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
  fe9ec2:	00 
  fe9ec3:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
  fe9eca:	00 
  fe9ecb:	ba 90 00 00 00       	mov    edx,0x90
ASM END

## Group 2: 0x10a6464..0x10a7f52 (size 0x1aee)
Targets: ad_disallow, mft_disallow
Xrefs: mft_disallow@0x10a6742, mft_disallow@0x10a6852, mft_disallow@0x10a6898, mft_disallow@0x10a68de, mft_disallow@0x10a692a, mft_disallow@0x10a6970, mft_disallow@0x10a69b6, mft_disallow@0x10a6a07, mft_disallow@0x10a6a4e, mft_disallow@0x10a6a83, mft_disallow@0x10a6ab8, mft_disallow@0x10a6afb, mft_disallow@0x10a6b30, mft_disallow@0x10a6b73, ad_disallow@0x10a6e51, ad_disallow@0x10a7428, ad_disallow@0x10a745d, ad_disallow@0x10a74ae, ad_disallow@0x10a74e3, ad_disallow@0x10a7518, ad_disallow@0x10a754d, ad_disallow@0x10a759b, ad_disallow@0x10a75e9, ad_disallow@0x10a7637

### mft_disallow @ 0x10a6742
ASM BEGIN
 10a6728:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10a672b:	ff 90 18 01 00 00    	call   QWORD PTR [rax+0x118]
 10a6731:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
 10a6735:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10a6738:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
 10a673e:	85 c0                	test   eax,eax
 10a6740:	74 35                	je     10a6777 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26db8d>
 10a6742:	48 8d 35 5d 57 28 ff 	lea    rsi,[rip+0xffffffffff28575d]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
 10a6749:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a6750:	00 
 10a6751:	e8 28 33 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a6756:	49 8d be b0 16 00 00 	lea    rdi,[r14+0x16b0]
 10a675d:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a6764:	00 
 10a6765:	e8 26 73 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a676a:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
ASM END

### mft_disallow @ 0x10a6852
ASM BEGIN
 10a683b:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
 10a683f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10a6842:	ff 90 88 00 00 00    	call   QWORD PTR [rax+0x88]
 10a6848:	45 84 ff             	test   r15b,r15b
 10a684b:	0f 94 c1             	sete   cl
 10a684e:	08 c1                	or     cl,al
 10a6850:	75 35                	jne    10a6887 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dc9d>
 10a6852:	48 8d 35 4d 56 28 ff 	lea    rsi,[rip+0xffffffffff28564d]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
 10a6859:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a6860:	00 
 10a6861:	e8 18 32 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a6866:	49 8d be 88 14 00 00 	lea    rdi,[r14+0x1488]
 10a686d:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a6874:	00 
 10a6875:	e8 16 72 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a687a:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
ASM END

### mft_disallow @ 0x10a6898
ASM BEGIN
 10a6881:	00 
 10a6882:	e8 09 76 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a6887:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
 10a688b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10a688e:	ff 90 d8 00 00 00    	call   QWORD PTR [rax+0xd8]
 10a6894:	84 c0                	test   al,al
 10a6896:	75 35                	jne    10a68cd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dce3>
 10a6898:	48 8d 35 07 56 28 ff 	lea    rsi,[rip+0xffffffffff285607]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
 10a689f:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a68a6:	00 
 10a68a7:	e8 d2 31 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a68ac:	49 8d be a0 14 00 00 	lea    rdi,[r14+0x14a0]
 10a68b3:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a68ba:	00 
 10a68bb:	e8 d0 71 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a68c0:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
ASM END

### mft_disallow @ 0x10a68de
ASM BEGIN
 10a68c7:	00 
 10a68c8:	e8 c3 75 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a68cd:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
 10a68d1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10a68d4:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
 10a68da:	84 c0                	test   al,al
 10a68dc:	75 35                	jne    10a6913 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dd29>
 10a68de:	48 8d 35 c1 55 28 ff 	lea    rsi,[rip+0xffffffffff2855c1]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
 10a68e5:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a68ec:	00 
 10a68ed:	e8 8c 31 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a68f2:	49 8d be b8 14 00 00 	lea    rdi,[r14+0x14b8]
 10a68f9:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a6900:	00 
 10a6901:	e8 8a 71 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a6906:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
ASM END

### mft_disallow @ 0x10a692a
ASM BEGIN
 10a6913:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
 10a6917:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10a691a:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
 10a6920:	45 84 ff             	test   r15b,r15b
 10a6923:	0f 94 c1             	sete   cl
 10a6926:	08 c1                	or     cl,al
 10a6928:	75 35                	jne    10a695f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dd75>
 10a692a:	48 8d 35 75 55 28 ff 	lea    rsi,[rip+0xffffffffff285575]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
 10a6931:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a6938:	00 
 10a6939:	e8 40 31 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a693e:	49 8d be e8 14 00 00 	lea    rdi,[r14+0x14e8]
 10a6945:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a694c:	00 
 10a694d:	e8 3e 71 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a6952:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
ASM END

### mft_disallow @ 0x10a6970
ASM BEGIN
 10a6959:	00 
 10a695a:	e8 31 75 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a695f:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
 10a6963:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10a6966:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
 10a696c:	84 c0                	test   al,al
 10a696e:	75 35                	jne    10a69a5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ddbb>
 10a6970:	48 8d 35 2f 55 28 ff 	lea    rsi,[rip+0xffffffffff28552f]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
 10a6977:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a697e:	00 
 10a697f:	e8 fa 30 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a6984:	49 8d be d0 14 00 00 	lea    rdi,[r14+0x14d0]
 10a698b:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a6992:	00 
 10a6993:	e8 f8 70 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a6998:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
ASM END

### mft_disallow @ 0x10a69b6
ASM BEGIN
 10a699f:	00 
 10a69a0:	e8 eb 74 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a69a5:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
 10a69a9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10a69ac:	ff 90 00 01 00 00    	call   QWORD PTR [rax+0x100]
 10a69b2:	84 c0                	test   al,al
 10a69b4:	75 35                	jne    10a69eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26de01>
 10a69b6:	48 8d 35 e9 54 28 ff 	lea    rsi,[rip+0xffffffffff2854e9]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
 10a69bd:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a69c4:	00 
 10a69c5:	e8 b4 30 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a69ca:	49 8d be 48 15 00 00 	lea    rdi,[r14+0x1548]
 10a69d1:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a69d8:	00 
 10a69d9:	e8 b2 70 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a69de:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
ASM END

### mft_disallow @ 0x10a6a07
ASM BEGIN
 10a69ef:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10a69f2:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
 10a69f8:	41 80 be 59 18 00 00 	cmp    BYTE PTR [r14+0x1859],0x0
 10a69ff:	00 
 10a6a00:	0f 94 c1             	sete   cl
 10a6a03:	08 c8                	or     al,cl
 10a6a05:	75 35                	jne    10a6a3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26de52>
 10a6a07:	48 8d 35 98 54 28 ff 	lea    rsi,[rip+0xffffffffff285498]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
 10a6a0e:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a6a15:	00 
 10a6a16:	e8 63 30 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a6a1b:	49 8d be 60 15 00 00 	lea    rdi,[r14+0x1560]
 10a6a22:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a6a29:	00 
 10a6a2a:	e8 61 70 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a6a2f:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
ASM END

### mft_disallow @ 0x10a6a4e
ASM BEGIN
 10a6a36:	00 
 10a6a37:	e8 54 74 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a6a3c:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
 10a6a40:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10a6a43:	ff 50 48             	call   QWORD PTR [rax+0x48]
 10a6a46:	84 c0                	test   al,al
 10a6a48:	0f 85 9f 00 00 00    	jne    10a6aed <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26df03>
 10a6a4e:	48 8d 35 51 54 28 ff 	lea    rsi,[rip+0xffffffffff285451]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
 10a6a55:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a6a5c:	00 
 10a6a5d:	e8 1c 30 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a6a62:	49 8d be f0 15 00 00 	lea    rdi,[r14+0x15f0]
 10a6a69:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a6a70:	00 
 10a6a71:	e8 1a 70 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a6a76:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
ASM END

### mft_disallow @ 0x10a6a83
ASM BEGIN
 10a6a62:	49 8d be f0 15 00 00 	lea    rdi,[r14+0x15f0]
 10a6a69:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a6a70:	00 
 10a6a71:	e8 1a 70 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a6a76:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a6a7d:	00 
 10a6a7e:	e8 0d 74 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a6a83:	48 8d 35 1c 54 28 ff 	lea    rsi,[rip+0xffffffffff28541c]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
 10a6a8a:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a6a91:	00 
 10a6a92:	e8 e7 2f 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a6a97:	49 8d be 20 16 00 00 	lea    rdi,[r14+0x1620]
 10a6a9e:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a6aa5:	00 
 10a6aa6:	e8 e5 6f d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a6aab:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
ASM END

### mft_disallow @ 0x10a6ab8
ASM BEGIN
 10a6a97:	49 8d be 20 16 00 00 	lea    rdi,[r14+0x1620]
 10a6a9e:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a6aa5:	00 
 10a6aa6:	e8 e5 6f d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a6aab:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a6ab2:	00 
 10a6ab3:	e8 d8 73 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a6ab8:	48 8d 35 e7 53 28 ff 	lea    rsi,[rip+0xffffffffff2853e7]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
 10a6abf:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a6ac6:	00 
 10a6ac7:	e8 b2 2f 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a6acc:	49 8d be 78 15 00 00 	lea    rdi,[r14+0x1578]
 10a6ad3:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a6ada:	00 
 10a6adb:	e8 b0 6f d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a6ae0:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
ASM END

### mft_disallow @ 0x10a6afb
ASM BEGIN
 10a6ae7:	00 
 10a6ae8:	e8 a3 73 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a6aed:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
 10a6af1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10a6af4:	ff 50 58             	call   QWORD PTR [rax+0x58]
 10a6af7:	84 c0                	test   al,al
 10a6af9:	75 6a                	jne    10a6b65 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26df7b>
 10a6afb:	48 8d 35 a4 53 28 ff 	lea    rsi,[rip+0xffffffffff2853a4]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
 10a6b02:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a6b09:	00 
 10a6b0a:	e8 6f 2f 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a6b0f:	49 8d be 50 16 00 00 	lea    rdi,[r14+0x1650]
 10a6b16:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a6b1d:	00 
 10a6b1e:	e8 6d 6f d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a6b23:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
ASM END

### mft_disallow @ 0x10a6b30
ASM BEGIN
 10a6b0f:	49 8d be 50 16 00 00 	lea    rdi,[r14+0x1650]
 10a6b16:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a6b1d:	00 
 10a6b1e:	e8 6d 6f d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a6b23:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a6b2a:	00 
 10a6b2b:	e8 60 73 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a6b30:	48 8d 35 6f 53 28 ff 	lea    rsi,[rip+0xffffffffff28536f]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
 10a6b37:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a6b3e:	00 
 10a6b3f:	e8 3a 2f 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a6b44:	49 8d be 68 16 00 00 	lea    rdi,[r14+0x1668]
 10a6b4b:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a6b52:	00 
 10a6b53:	e8 38 6f d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a6b58:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
ASM END

### mft_disallow @ 0x10a6b73
ASM BEGIN
 10a6b5f:	00 
 10a6b60:	e8 2b 73 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a6b65:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
 10a6b69:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10a6b6c:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10a6b6f:	84 c0                	test   al,al
 10a6b71:	75 35                	jne    10a6ba8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dfbe>
 10a6b73:	48 8d 35 2c 53 28 ff 	lea    rsi,[rip+0xffffffffff28532c]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
 10a6b7a:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a6b81:	00 
 10a6b82:	e8 f7 2e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a6b87:	49 8d be 90 15 00 00 	lea    rdi,[r14+0x1590]
 10a6b8e:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a6b95:	00 
 10a6b96:	e8 f5 6e d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a6b9b:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
ASM END

### ad_disallow @ 0x10a6e51
ASM BEGIN
 10a6e31:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
 10a6e36:	e8 55 6c d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a6e3b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 10a6e40:	e8 4b 70 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a6e45:	8b 84 24 78 04 00 00 	mov    eax,DWORD PTR [rsp+0x478]
 10a6e4c:	83 f8 0c             	cmp    eax,0xc
 10a6e4f:	75 2c                	jne    10a6e7d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e293>
 10a6e51:	48 8d 35 ed 6e 2c ff 	lea    rsi,[rip+0xffffffffff2c6eed]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
 10a6e58:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 10a6e5d:	e8 1c 2c 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a6e62:	49 8d be 48 15 00 00 	lea    rdi,[r14+0x1548]
 10a6e69:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
 10a6e6e:	e8 1d 6c d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a6e73:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 10a6e78:	e8 13 70 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a6e7d:	41 80 be 94 05 00 00 	cmp    BYTE PTR [r14+0x594],0x0
ASM END

### ad_disallow @ 0x10a7428
ASM BEGIN
 10a7411:	00 
 10a7412:	e8 79 6a 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a7417:	49 8b be 90 18 00 00 	mov    rdi,QWORD PTR [r14+0x1890]
 10a741e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10a7421:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10a7424:	84 c0                	test   al,al
 10a7426:	74 6a                	je     10a7492 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e8a8>
 10a7428:	48 8d 35 16 69 2c ff 	lea    rsi,[rip+0xffffffffff2c6916]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
 10a742f:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a7436:	00 
 10a7437:	e8 42 26 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a743c:	49 8d be 00 15 00 00 	lea    rdi,[r14+0x1500]
 10a7443:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a744a:	00 
 10a744b:	e8 40 66 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a7450:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
ASM END

### ad_disallow @ 0x10a745d
ASM BEGIN
 10a743c:	49 8d be 00 15 00 00 	lea    rdi,[r14+0x1500]
 10a7443:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a744a:	00 
 10a744b:	e8 40 66 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a7450:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a7457:	00 
 10a7458:	e8 33 6a 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a745d:	48 8d 35 e1 68 2c ff 	lea    rsi,[rip+0xffffffffff2c68e1]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
 10a7464:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a746b:	00 
 10a746c:	e8 0d 26 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a7471:	49 8d be 18 15 00 00 	lea    rdi,[r14+0x1518]
 10a7478:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a747f:	00 
 10a7480:	e8 0b 66 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a7485:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
ASM END

### ad_disallow @ 0x10a74ae
ASM BEGIN
 10a748d:	e8 fe 69 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a7492:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
 10a7499:	00 
 10a749a:	0f 84 cc 01 00 00    	je     10a766c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ea82>
 10a74a0:	41 80 be 70 04 00 00 	cmp    BYTE PTR [r14+0x470],0x0
 10a74a7:	00 
 10a74a8:	0f 84 be 01 00 00    	je     10a766c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ea82>
 10a74ae:	48 8d 35 90 68 2c ff 	lea    rsi,[rip+0xffffffffff2c6890]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
 10a74b5:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a74bc:	00 
 10a74bd:	e8 bc 25 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a74c2:	49 8d be a0 14 00 00 	lea    rdi,[r14+0x14a0]
 10a74c9:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a74d0:	00 
 10a74d1:	e8 ba 65 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a74d6:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
ASM END

### ad_disallow @ 0x10a74e3
ASM BEGIN
 10a74c2:	49 8d be a0 14 00 00 	lea    rdi,[r14+0x14a0]
 10a74c9:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a74d0:	00 
 10a74d1:	e8 ba 65 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a74d6:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a74dd:	00 
 10a74de:	e8 ad 69 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a74e3:	48 8d 35 5b 68 2c ff 	lea    rsi,[rip+0xffffffffff2c685b]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
 10a74ea:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a74f1:	00 
 10a74f2:	e8 87 25 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a74f7:	49 8d be b8 14 00 00 	lea    rdi,[r14+0x14b8]
 10a74fe:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a7505:	00 
 10a7506:	e8 85 65 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a750b:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
ASM END

### ad_disallow @ 0x10a7518
ASM BEGIN
 10a74f7:	49 8d be b8 14 00 00 	lea    rdi,[r14+0x14b8]
 10a74fe:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a7505:	00 
 10a7506:	e8 85 65 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a750b:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a7512:	00 
 10a7513:	e8 78 69 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a7518:	48 8d 35 26 68 2c ff 	lea    rsi,[rip+0xffffffffff2c6826]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
 10a751f:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a7526:	00 
 10a7527:	e8 52 25 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a752c:	49 8d be c0 15 00 00 	lea    rdi,[r14+0x15c0]
 10a7533:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a753a:	00 
 10a753b:	e8 50 65 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a7540:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
ASM END

### ad_disallow @ 0x10a754d
ASM BEGIN
 10a752c:	49 8d be c0 15 00 00 	lea    rdi,[r14+0x15c0]
 10a7533:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a753a:	00 
 10a753b:	e8 50 65 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a7540:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a7547:	00 
 10a7548:	e8 43 69 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a754d:	48 8d 35 f1 67 2c ff 	lea    rsi,[rip+0xffffffffff2c67f1]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
 10a7554:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a755b:	00 
 10a755c:	e8 1d 25 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a7561:	49 8d be d0 14 00 00 	lea    rdi,[r14+0x14d0]
 10a7568:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a756f:	00 
 10a7570:	e8 1b 65 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a7575:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
ASM END

### ad_disallow @ 0x10a759b
ASM BEGIN
 10a7582:	49 8b be 38 04 00 00 	mov    rdi,QWORD PTR [r14+0x438]
 10a7589:	48 85 ff             	test   rdi,rdi
 10a758c:	74 0d                	je     10a759b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e9b1>
 10a758e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10a7591:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
 10a7597:	84 c0                	test   al,al
 10a7599:	75 35                	jne    10a75d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e9e6>
 10a759b:	48 8d 35 a3 67 2c ff 	lea    rsi,[rip+0xffffffffff2c67a3]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
 10a75a2:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a75a9:	00 
 10a75aa:	e8 cf 24 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a75af:	49 8d be e8 14 00 00 	lea    rdi,[r14+0x14e8]
 10a75b6:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a75bd:	00 
 10a75be:	e8 cd 64 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a75c3:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
ASM END

### ad_disallow @ 0x10a75e9
ASM BEGIN
 10a75d0:	49 8b be 38 04 00 00 	mov    rdi,QWORD PTR [r14+0x438]
 10a75d7:	48 85 ff             	test   rdi,rdi
 10a75da:	74 0d                	je     10a75e9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e9ff>
 10a75dc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10a75df:	ff 90 d8 00 00 00    	call   QWORD PTR [rax+0xd8]
 10a75e5:	84 c0                	test   al,al
 10a75e7:	75 35                	jne    10a761e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ea34>
 10a75e9:	48 8d 35 55 67 2c ff 	lea    rsi,[rip+0xffffffffff2c6755]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
 10a75f0:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a75f7:	00 
 10a75f8:	e8 81 24 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a75fd:	49 8d be 88 14 00 00 	lea    rdi,[r14+0x1488]
 10a7604:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a760b:	00 
 10a760c:	e8 7f 64 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a7611:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
ASM END

### ad_disallow @ 0x10a7637
ASM BEGIN
 10a761e:	49 8b be 38 04 00 00 	mov    rdi,QWORD PTR [r14+0x438]
 10a7625:	48 85 ff             	test   rdi,rdi
 10a7628:	74 0d                	je     10a7637 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ea4d>
 10a762a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10a762d:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
 10a7633:	84 c0                	test   al,al
 10a7635:	75 35                	jne    10a766c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ea82>
 10a7637:	48 8d 35 07 67 2c ff 	lea    rsi,[rip+0xffffffffff2c6707]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
 10a763e:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a7645:	00 
 10a7646:	e8 33 24 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a764b:	49 8d be a8 15 00 00 	lea    rdi,[r14+0x15a8]
 10a7652:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a7659:	00 
 10a765a:	e8 31 64 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a765f:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
ASM END

## Group 3: 0x10a8db4..0x10a8ead (size 0xf9)
Targets: mft_disallow
Xrefs: mft_disallow@0x10a8e2b

### mft_disallow @ 0x10a8e2b
ASM BEGIN
 10a8e12:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
 10a8e19:	00 
 10a8e1a:	74 c9                	je     10a8de5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2701fb>
 10a8e1c:	48 8d 44 24 38       	lea    rax,[rsp+0x38]
 10a8e21:	0f 57 c0             	xorps  xmm0,xmm0
 10a8e24:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 10a8e27:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
 10a8e2b:	48 8d 35 74 30 28 ff 	lea    rsi,[rip+0xffffffffff283074]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
 10a8e32:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 10a8e37:	e8 42 0c 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a8e3c:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 10a8e41:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
 10a8e46:	e8 45 4c d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a8e4b:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 10a8e50:	e8 3b 50 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a8e55:	48 89 e7             	mov    rdi,rsp
ASM END

## Group 4: 0x10a9436..0x10a9566 (size 0x130)
Targets: mft_disallow
Xrefs: mft_disallow@0x10a94f8

### mft_disallow @ 0x10a94f8
ASM BEGIN
 10a94e4:	41 5e                	pop    r14
 10a94e6:	41 5f                	pop    r15
 10a94e8:	c3                   	ret
 10a94e9:	48 8d 44 24 40       	lea    rax,[rsp+0x40]
 10a94ee:	0f 57 c0             	xorps  xmm0,xmm0
 10a94f1:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 10a94f4:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
 10a94f8:	48 8d 35 a7 29 28 ff 	lea    rsi,[rip+0xffffffffff2829a7]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
 10a94ff:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10a9504:	e8 75 05 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a9509:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
 10a950e:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
 10a9513:	e8 78 45 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a9518:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10a951d:	e8 6e 49 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a9522:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
ASM END

## Group 5: 0x125e77e..0x125e82f (size 0xb1)
Targets: mft_disallow
Xrefs: mft_disallow@0x125e79c

### mft_disallow @ 0x125e79c
ASM BEGIN
 125e783:	53                   	push   rbx
 125e784:	48 83 ec 28          	sub    rsp,0x28
 125e788:	49 89 f6             	mov    r14,rsi
 125e78b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 125e792:	00 00 
 125e794:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 125e799:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 125e79c:	48 8d 35 03 d7 0c ff 	lea    rsi,[rip+0xffffffffff0cd703]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
 125e7a3:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 125e7a8:	e8 d1 b2 81 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 125e7ad:	49 81 c6 08 01 00 00 	add    r14,0x108
 125e7b4:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
 125e7b9:	4c 89 f7             	mov    rdi,r14
 125e7bc:	4c 89 fe             	mov    rsi,r15
 125e7bf:	e8 7e 58 8d ff       	call   b34042 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80fe2>
 125e7c4:	89 c5                	mov    ebp,eax
ASM END

## Group 6: 0x125ea06..0x125eacc (size 0xc6)
Targets: mft_disallow
Xrefs: mft_disallow@0x125ea58

### mft_disallow @ 0x125ea58
ASM BEGIN
 125ea42:	4c 89 f6             	mov    rsi,r14
 125ea45:	ff 50 18             	call   QWORD PTR [rax+0x18]
 125ea48:	89 43 34             	mov    DWORD PTR [rbx+0x34],eax
 125ea4b:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
 125ea4f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 125ea52:	ff 50 30             	call   QWORD PTR [rax+0x30]
 125ea55:	49 89 c6             	mov    r14,rax
 125ea58:	48 8d 35 47 d4 0c ff 	lea    rsi,[rip+0xffffffffff0cd447]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
 125ea5f:	48 89 e7             	mov    rdi,rsp
 125ea62:	e8 17 b0 81 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 125ea67:	49 81 c6 08 01 00 00 	add    r14,0x108
 125ea6e:	49 89 e7             	mov    r15,rsp
 125ea71:	4c 89 f7             	mov    rdi,r14
 125ea74:	4c 89 fe             	mov    rsi,r15
 125ea77:	e8 c6 55 8d ff       	call   b34042 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80fe2>
 125ea7c:	88 43 38             	mov    BYTE PTR [rbx+0x38],al
ASM END

## Group 7: 0x125eb30..0x125ec69 (size 0x139)
Targets: ad_disallow
Xrefs: ad_disallow@0x125ebdc

### ad_disallow @ 0x125ebdc
ASM BEGIN
 125ebc3:	80 bb bc 00 00 00 00 	cmp    BYTE PTR [rbx+0xbc],0x0
 125ebca:	74 40                	je     125ec0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa4190>
 125ebcc:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 125ebd1:	48 85 c0             	test   rax,rax
 125ebd4:	74 36                	je     125ec0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa4190>
 125ebd6:	48 83 f8 01          	cmp    rax,0x1
 125ebda:	75 37                	jne    125ec13 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa4197>
 125ebdc:	48 8d 35 62 f1 10 ff 	lea    rsi,[rip+0xffffffffff10f162]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
 125ebe3:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 125ebe8:	e8 91 ae 81 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 125ebed:	48 89 e7             	mov    rdi,rsp
 125ebf0:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
 125ebf5:	4c 89 f6             	mov    rsi,r14
 125ebf8:	e8 45 54 8d ff       	call   b34042 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80fe2>
 125ebfd:	89 c5                	mov    ebp,eax
 125ebff:	4c 89 f7             	mov    rdi,r14
ASM END

## Group 8: 0x166eaaa..0x166f5b3 (size 0xb09)
Targets: disallow_skipping_next_reasons
Xrefs: disallow_skipping_next_reasons@0x166f076

### disallow_skipping_next_reasons @ 0x166f076
ASM BEGIN
 166f053:	e9 e1 fa ff ff       	jmp    166eb39 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22ca5>
 166f058:	4c 8d 3d 41 3e 38 00 	lea    r15,[rip+0x383e41]        # 19f2ea0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf5f>
 166f05f:	4c 89 ff             	mov    rdi,r15
 166f062:	e8 09 f1 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
 166f067:	85 c0                	test   eax,eax
 166f069:	0f 84 d8 fa ff ff    	je     166eb47 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22cb3>
 166f06f:	48 8d 3d 02 3e 38 00 	lea    rdi,[rip+0x383e02]        # 19f2e78 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf37>
 166f076:	48 8d 35 13 ba ce fe 	lea    rsi,[rip+0xfffffffffeceba13]        # 35aa90 <_ZTSSt12bad_any_cast@@Base-0x35738>
 166f07d:	e8 52 8a ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
 166f082:	48 8d 3d 57 18 45 ff 	lea    rdi,[rip+0xffffffffff451857]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
 166f089:	48 8d 35 e8 3d 38 00 	lea    rsi,[rip+0x383de8]        # 19f2e78 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf37>
 166f090:	48 8d 15 69 4f 18 00 	lea    rdx,[rip+0x184f69]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
 166f097:	e8 c4 ed 17 00       	call   17ede60 <__cxa_atexit@plt>
 166f09c:	48 8d 3d fd 3d 38 00 	lea    rdi,[rip+0x383dfd]        # 19f2ea0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf5f>
 166f0a3:	e8 d8 f0 17 00       	call   17ee180 <__cxa_guard_release@plt>
 166f0a8:	e9 9a fa ff ff       	jmp    166eb47 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22cb3>
ASM END

## Group 9: 0x16778df..0x1678098 (size 0x7b9)
Targets: disallow_skipping_next_reasons
Xrefs: disallow_skipping_next_reasons@0x1677c35

### disallow_skipping_next_reasons @ 0x1677c35
ASM BEGIN
 1677c18:	00 
 1677c19:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
 1677c1d:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
 1677c21:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
 1677c26:	e8 55 f7 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
 1677c2b:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 1677c30:	e8 5b 62 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1677c35:	48 8d 35 54 2e ce fe 	lea    rsi,[rip+0xfffffffffece2e54]        # 35aa90 <_ZTSSt12bad_any_cast@@Base-0x35738>
 1677c3c:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 1677c41:	e8 38 1e 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 1677c46:	48 8d 8c 24 b0 00 00 	lea    rcx,[rsp+0xb0]
 1677c4d:	00 
 1677c4e:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
 1677c52:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
 1677c56:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
 1677c5b:	e8 20 f7 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
ASM END

## Co-location summary
- 0x10a6464..0x10a7f52 (size 0x1aee): ad_disallow, mft_disallow
