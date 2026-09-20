# Native disallow_signals / Skip Ad gate map

Expected legacy restriction array base: owner+0x1410; set-like slots use 0x18 stride.
Candidate extended slots: +0x1620 playback-speed, +0x1638 modes, +0x1650 signals, +0x1668 next extended field.

## Restriction builder around candidate extended slots

/tmp/dsig/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000010a69e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ddf6>:
 10a69e0:	bc 24 40 04 00       	mov    esp,0x44024
 10a69e5:	00 e8                	add    al,ch
 10a69e7:	a5                   	movs   DWORD PTR es:[rdi],DWORD PTR ds:[rsi]
 10a69e8:	74 74                	je     10a6a5e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26de74>
 10a69ea:	00 49 8b             	add    BYTE PTR [rcx-0x75],cl
 10a69ed:	7e 28                	jle    10a6a17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26de2d>
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
 10a6ba2:	00 
 10a6ba3:	e8 e8 72 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a6ba8:	45 8a be 98 05 00 00 	mov    r15b,BYTE PTR [r14+0x598]
 10a6baf:	45 84 ff             	test   r15b,r15b
 10a6bb2:	74 19                	je     10a6bcd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dfe3>
 10a6bb4:	49 8b 86 b8 05 00 00 	mov    rax,QWORD PTR [r14+0x5b8]
 10a6bbb:	49                   	rex.WB
 10a6bbc:	3b                   	.byte 0x3b
 10a6bbd:	86 c0                	xchg   al,al
 10a6bbf:	05                   	.byte 0x5

## Restriction builder switch-to-video / map-looking tail

/tmp/dsig/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000010a7a80 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ee96>:
 10a7a80:	6d                   	ins    DWORD PTR es:[rdi],dx
 10a7a81:	00 4d 85             	add    BYTE PTR [rbp-0x7b],cl
 10a7a84:	ed                   	in     eax,dx
 10a7a85:	75 eb                	jne    10a7a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ee88>
 10a7a87:	4d 8d be b0 17 00 00 	lea    r15,[r14+0x17b0]
 10a7a8e:	4d 8b ae f8 13 00 00 	mov    r13,QWORD PTR [r14+0x13f8]
 10a7a95:	4d 85 ed             	test   r13,r13
 10a7a98:	74 12                	je     10a7aac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26eec2>
 10a7a9a:	49 8d 75 10          	lea    rsi,[r13+0x10]
 10a7a9e:	4c 89 ff             	mov    rdi,r15
 10a7aa1:	e8 1c d9 c4 ff       	call   cf53c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x242362>
 10a7aa6:	4d 8b 6d 00          	mov    r13,QWORD PTR [r13+0x0]
 10a7aaa:	eb e9                	jmp    10a7a95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26eeab>
 10a7aac:	41 80 be 30 18 00 00 	cmp    BYTE PTR [r14+0x1830],0x0
 10a7ab3:	00 
 10a7ab4:	75 31                	jne    10a7ae7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26eefd>
 10a7ab6:	48 8d 35 ad ac 28 ff 	lea    rsi,[rip+0xffffffffff28acad]        # 33276a <_ZTSSt12bad_any_cast@@Base-0x5da5e>
 10a7abd:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a7ac4:	00 
 10a7ac5:	e8 b4 1f 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a7aca:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a7ad1:	00 
 10a7ad2:	4c 89 e7             	mov    rdi,r12
 10a7ad5:	e8 b6 5f d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a7ada:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a7ae1:	00 
 10a7ae2:	e8 a9 63 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a7ae7:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
 10a7aee:	00 
 10a7aef:	0f 84 a4 01 00 00    	je     10a7c99 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f0af>
 10a7af5:	49 8b b6 98 00 00 00 	mov    rsi,QWORD PTR [r14+0x98]
 10a7afc:	41 8b be 90 00 00 00 	mov    edi,DWORD PTR [r14+0x90]
 10a7b03:	e8 18 3d 9d ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
 10a7b08:	84 c0                	test   al,al
 10a7b0a:	0f 85 89 01 00 00    	jne    10a7c99 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f0af>
 10a7b10:	4d 8d ae 90 00 00 00 	lea    r13,[r14+0x90]
 10a7b17:	4c 89 ef             	mov    rdi,r13
 10a7b1a:	e8 c3 36 4b 00       	call   155b1e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a0766>
 10a7b1f:	84 c0                	test   al,al
 10a7b21:	0f 84 72 01 00 00    	je     10a7c99 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f0af>
 10a7b27:	4d 8b 66 28          	mov    r12,QWORD PTR [r14+0x28]
 10a7b2b:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
 10a7b32:	00 
 10a7b33:	4c 89 ee             	mov    rsi,r13
 10a7b36:	e8 05 64 74 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 10a7b3b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 10a7b40:	48 8d b4 24 10 08 00 	lea    rsi,[rsp+0x810]
 10a7b47:	00 
 10a7b48:	6a 01                	push   0x1
 10a7b4a:	5a                   	pop    rdx
 10a7b4b:	e8 08 f9 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10a7b50:	48 8d 35 cc b1 29 ff 	lea    rsi,[rip+0xffffffffff29b1cc]        # 342d23 <_ZTSSt12bad_any_cast@@Base-0x4d4a5>
 10a7b57:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 10a7b5c:	e8 1d 1f 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a7b61:	4d 8d 4e 30          	lea    r9,[r14+0x30]
 10a7b65:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 10a7b69:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a7b70:	00 
 10a7b71:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
 10a7b76:	6a 20                	push   0x20
 10a7b78:	59                   	pop    rcx
 10a7b79:	4c 8d 44 24 60       	lea    r8,[rsp+0x60]
 10a7b7e:	4c 89 e6             	mov    rsi,r12
 10a7b81:	ff 90 60 01 00 00    	call   QWORD PTR [rax+0x160]
 10a7b87:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 10a7b8c:	e8 ff 62 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a7b91:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 10a7b96:	e8 4d 3a 9d ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10a7b9b:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
 10a7ba2:	00 
 10a7ba3:	e8 e8 62 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a7ba8:	4c 8b a4 24 40 04 00 	mov    r12,QWORD PTR [rsp+0x440]
 10a7baf:	00 
 10a7bb0:	4c 3b a4 24 48 04 00 	cmp    r12,QWORD PTR [rsp+0x448]
 10a7bb7:	00 
 10a7bb8:	0f 84 ce 00 00 00    	je     10a7c8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f0a2>
 10a7bbe:	41 80 7c 24 15 00    	cmp    BYTE PTR [r12+0x15],0x0
 10a7bc4:	0f 84 c2 00 00 00    	je     10a7c8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f0a2>
 10a7bca:	41 8b 44 24 18       	mov    eax,DWORD PTR [r12+0x18]
 10a7bcf:	83 f8 02             	cmp    eax,0x2
 10a7bd2:	74 50                	je     10a7c24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f03a>
 10a7bd4:	83 f8 01             	cmp    eax,0x1
 10a7bd7:	0f 85 af 00 00 00    	jne    10a7c8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f0a2>
 10a7bdd:	48 8d 35 5e fb 2d ff 	lea    rsi,[rip+0xffffffffff2dfb5e]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
 10a7be4:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 10a7be9:	e8 90 1e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a7bee:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
 10a7bf3:	4c 89 ff             	mov    rdi,r15
 10a7bf6:	e8 91 f9 e4 ff       	call   ef758c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe9a2>
 10a7bfb:	49 89 c7             	mov    r15,rax
 10a7bfe:	48 8d 35 13 a0 3a ff 	lea    rsi,[rip+0xffffffffff3aa013]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
 10a7c05:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
 10a7c0c:	00 
 10a7c0d:	e8 6c 1e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a7c12:	48 8d b4 24 10 08 00 	lea    rsi,[rsp+0x810]
 10a7c19:	00 
 10a7c1a:	4c 89 ff             	mov    rdi,r15
 10a7c1d:	e8 6e 5e d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a7c22:	eb 51                	jmp    10a7c75 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f08b>
 10a7c24:	41 80 7c 24 40 00    	cmp    BYTE PTR [r12+0x40],0x0
 10a7c2a:	0f 84 5a 01 00 00    	je     10a7d8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f1a0>
 10a7c30:	48 8d 35 0b fb 2d ff 	lea    rsi,[rip+0xffffffffff2dfb0b]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
 10a7c37:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 10a7c3c:	e8 3d 1e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a7c41:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
 10a7c46:	4c 89 ff             	mov    rdi,r15
 10a7c49:	e8 3e f9 e4 ff       	call   ef758c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe9a2>
 10a7c4e:	49 89 c7             	mov    r15,rax
 10a7c51:	48 8d 35 98 2e 2b ff 	lea    rsi,[rip+0xffffffffff2b2e98]        # 35aaf0 <_ZTSSt12bad_any_cast@@Base-0x356d8>
 10a7c58:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
 10a7c5f:	00 
 10a7c60:	e8 19 1e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a7c65:	48 8d b4 24 10 08 00 	lea    rsi,[rsp+0x810]
 10a7c6c:	00 
 10a7c6d:	4c 89 ff             	mov    rdi,r15
 10a7c70:	e8 1b 5e d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a7c75:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
 10a7c7c:	00 
 10a7c7d:	e8 0e 62 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a7c82:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 10a7c87:	e8 04 62 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a7c8c:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a7c93:	00 
 10a7c94:	e8 71 29 e7 ff       	call   f1a60a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe1a20>
 10a7c99:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
 10a7c9e:	48 89 df             	mov    rdi,rbx
 10a7ca1:	e8 3c 05 00 00       	call   10a81e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f5f8>
 10a7ca6:	84 c0                	test   al,al
 10a7ca8:	0f 85 a9 00 00 00    	jne    10a7d57 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f16d>
 10a7cae:	49 81 c6 38 10 00 00 	add    r14,0x1038
 10a7cb5:	40 88 2c 24          	mov    BYTE PTR [rsp],bpl
 10a7cb9:	0f 57 c0             	xorps  xmm0,xmm0
 10a7cbc:	48 8d 94 24 10 08 00 	lea    rdx,[rsp+0x810]
 10a7cc3:	00 
 10a7cc4:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
 10a7cc7:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
 10a7ccc:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 10a7cd1:	4c 89 f6             	mov    rsi,r14
 10a7cd4:	e8 31 27 73 00       	call   17da40a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x622b>
 10a7cd9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
 10a7cde:	48 89 1e             	mov    QWORD PTR [rsi],rbx
 10a7ce1:	48 89 e0             	mov    rax,rsp
 10a7ce4:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
 10a7ce8:	48 8b 54 24 60       	mov    rdx,QWORD PTR [rsp+0x60]
 10a7ced:	48 8b 5c 24 68       	mov    rbx,QWORD PTR [rsp+0x68]
 10a7cf2:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a7cf9:	00 
 10a7cfa:	48 89 d9             	mov    rcx,rbx
 10a7cfd:	e8 ca 09 00 00       	call   10a86cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fae2>
 10a7d02:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 10a7d07:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
 10a7d0c:	48 89 da             	mov    rdx,rbx
 10a7d0f:	48 89 d9             	mov    rcx,rbx
 10a7d12:	e8 b5 09 00 00       	call   10a86cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fae2>
 10a7d17:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a7d1e:	00 
 10a7d1f:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
 10a7d24:	e8 93 4d a1 ff       	call   abcabc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9a5c>
 10a7d29:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
 10a7d2e:	e8 53 67 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10a7d33:	48 8b bc 24 58 04 00 	mov    rdi,QWORD PTR [rsp+0x458]
 10a7d3a:	00 
 10a7d3b:	e8 46 67 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10a7d40:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 10a7d45:	e8 1a 4e a1 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
 10a7d4a:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
 10a7d51:	00 
 10a7d52:	e8 0d 4e a1 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
 10a7d57:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
 10a7d5c:	e8 a3 d2 c4 ff       	call   cf5004 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x241fa4>
 10a7d61:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10a7d68:	00 00 
 10a7d6a:	48 3b 84 24 30 08 00 	cmp    rax,QWORD PTR [rsp+0x830]
 10a7d71:	00 
 10a7d72:	0f 85 be 00 00 00    	jne    10a7e36 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f24c>
 10a7d78:	48 81 c4 38 08 00 00 	add    rsp,0x838
 10a7d7f:	5b                   	pop    rbx
 10a7d80:	41 5c                	pop    r12
 10a7d82:	41 5d                	pop    r13
 10a7d84:	41 5e                	pop    r14
 10a7d86:	41 5f                	pop    r15
 10a7d88:	5d                   	pop    rbp
 10a7d89:	c3                   	ret
 10a7d8a:	48 8d 35 b1 f9 2d ff 	lea    rsi,[rip+0xffffffffff2df9b1]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
 10a7d91:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 10a7d96:	e8 e3 1c 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a7d9b:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
 10a7da0:	4c 89 ff             	mov    rdi,r15
 10a7da3:	e8 e4 f7 e4 ff       	call   ef758c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe9a2>
 10a7da8:	49 89 c7             	mov    r15,rax
 10a7dab:	48 8d 35 cc 3c 2d ff 	lea    rsi,[rip+0xffffffffff2d3ccc]        # 37ba7e <_ZTSSt12bad_any_cast@@Base-0x1474a>
 10a7db2:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 10a7db7:	e8 c2 1c 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a7dbc:	48 8d 15 e4 33 2b ff 	lea    rdx,[rip+0xffffffffff2b33e4]        # 35b1a7 <_ZTSSt12bad_any_cast@@Base-0x35021>
 10a7dc3:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 10a7dc8:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
 10a7dcd:	e8 6b 36 9f ff       	call   a9b43d <JNI_OnUnload@@Base+0x22d0a>
 10a7dd2:	49 83 c4 20          	add    r12,0x20
 10a7dd6:	48 8d 15 9f a1 3a ff 	lea    rdx,[rip+0xffffffffff3aa19f]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 10a7ddd:	48 89 e7             	mov    rdi,rsp
 10a7de0:	4c 89 e6             	mov    rsi,r12
 10a7de3:	e8 24 d7 a2 ff       	call   ad550c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x224ac>
 10a7de8:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
 10a7def:	00 
 10a7df0:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
 10a7df5:	48 89 e2             	mov    rdx,rsp
 10a7df8:	e8 93 e3 a0 ff       	call   ab6190 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3130>
 10a7dfd:	48 8d b4 24 10 08 00 	lea    rsi,[rsp+0x810]
 10a7e04:	00 
 10a7e05:	4c 89 ff             	mov    rdi,r15
 10a7e08:	e8 83 5c d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a7e0d:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
 10a7e14:	00 
 10a7e15:	e8 76 60 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a7e1a:	48 89 e7             	mov    rdi,rsp
 10a7e1d:	e8 6e 60 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a7e22:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 10a7e27:	e8 64 60 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a7e2c:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 10a7e31:	e9 47 fe ff ff       	jmp    10a7c7d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f093>
 10a7e36:	e8 75 7c 74 00       	call   17efab0 <__stack_chk_fail@plt>
 10a7e3b:	e9 0a 01 00 00       	jmp    10a7f4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f360>
 10a7e40:	e9 cd 00 00 00       	jmp    10a7f12 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f328>
 10a7e45:	e9 d7 00 00 00       	jmp    10a7f21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f337>
 10a7e4a:	e9 c3 00 00 00       	jmp    10a7f12 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f328>
 10a7e4f:	e9                   	.byte 0xe9

## All owner+0x1638/+0x1650/+0x1668 accesses in player region
  ff5c9c:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  ff5ca1:	4c 89 f7             	mov    rdi,r14
  ff5ca4:	48 89 de             	mov    rsi,rbx
  ff5ca7:	ff 10                	call   QWORD PTR [rax]
  ff5ca9:	48 8d bb 58 0e 00 00 	lea    rdi,[rbx+0xe58]
  ff5cb0:	4c 89 f6             	mov    rsi,r14
  ff5cb3:	e8 76 5d a8 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
  ff5cb8:	4c 89 f7             	mov    rdi,r14
  ff5cbb:	e8 d0 81 7f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  ff5cc0:	48 8d b3 78 25 00 00 	lea    rsi,[rbx+0x2578]
  ff5cc7:	48 8d bb 70 0e 00 00 	lea    rdi,[rbx+0xe70]
  ff5cce:	e8 ad 83 7f 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
  ff5cd3:	48 8d b3 38 16 00 00 	lea    rsi,[rbx+0x1638]
  ff5cda:	48 8d bb b0 0d 00 00 	lea    rdi,[rbx+0xdb0]
  ff5ce1:	e8 ae d1 e3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
  ff5ce6:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  ff5ce9:	48 89 df             	mov    rdi,rbx
  ff5cec:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
  ff5cf2:	48 8d 70 18          	lea    rsi,[rax+0x18]
  ff5cf6:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
  ff5cfa:	e8 81 83 7f 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
  ff5cff:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  ff5d02:	48 89 df             	mov    rdi,rbx
  ff5d05:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
  ff5d0b:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
  ff5d0f:	48 89 c6             	mov    rsi,rax
  ff5d12:	e8 69 83 7f 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
  ff5d17:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  ff5d1a:	48 89 df             	mov    rdi,rbx
  ff5d1d:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
  ff5d23:	48 8d 70 30          	lea    rsi,[rax+0x30]
  ff5d27:	4c 8d b3 28 0e 00 00 	lea    r14,[rbx+0xe28]
  ff5d2e:	4c 89 f7             	mov    rdi,r14
--
 10a6ae0:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
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
--
 10a783a:	49 8d be f0 15 00 00 	lea    rdi,[r14+0x15f0]
 10a7841:	49 8b b6 28 12 00 00 	mov    rsi,QWORD PTR [r14+0x1228]
 10a7848:	49 8d 96 30 12 00 00 	lea    rdx,[r14+0x1230]
 10a784f:	e8 7e 21 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
 10a7854:	49 8d be 08 16 00 00 	lea    rdi,[r14+0x1608]
 10a785b:	49 8b b6 40 12 00 00 	mov    rsi,QWORD PTR [r14+0x1240]
 10a7862:	49 8d 96 48 12 00 00 	lea    rdx,[r14+0x1248]
 10a7869:	e8 64 21 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
 10a786e:	49 8d be 20 16 00 00 	lea    rdi,[r14+0x1620]
 10a7875:	49 8b b6 58 12 00 00 	mov    rsi,QWORD PTR [r14+0x1258]
 10a787c:	49 8d 96 60 12 00 00 	lea    rdx,[r14+0x1260]
 10a7883:	e8 4a 21 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
 10a7888:	49 8d be 38 16 00 00 	lea    rdi,[r14+0x1638]
 10a788f:	49 8b b6 70 12 00 00 	mov    rsi,QWORD PTR [r14+0x1270]
 10a7896:	49 8d 96 78 12 00 00 	lea    rdx,[r14+0x1278]
 10a789d:	e8 30 21 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
 10a78a2:	49 8d be 50 16 00 00 	lea    rdi,[r14+0x1650]
 10a78a9:	49 8b b6 88 12 00 00 	mov    rsi,QWORD PTR [r14+0x1288]
 10a78b0:	49 8d 96 90 12 00 00 	lea    rdx,[r14+0x1290]
 10a78b7:	e8 16 21 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
 10a78bc:	49 8d be 68 16 00 00 	lea    rdi,[r14+0x1668]
 10a78c3:	49 8b b6 a0 12 00 00 	mov    rsi,QWORD PTR [r14+0x12a0]
 10a78ca:	49 8d 96 a8 12 00 00 	lea    rdx,[r14+0x12a8]
 10a78d1:	e8 fc 20 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
 10a78d6:	49 8d be 80 16 00 00 	lea    rdi,[r14+0x1680]
 10a78dd:	49 8b b6 b8 12 00 00 	mov    rsi,QWORD PTR [r14+0x12b8]
 10a78e4:	49 8d 96 c0 12 00 00 	lea    rdx,[r14+0x12c0]
 10a78eb:	e8 e2 20 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
 10a78f0:	49 8d be 98 16 00 00 	lea    rdi,[r14+0x1698]
 10a78f7:	49 8b b6 d0 12 00 00 	mov    rsi,QWORD PTR [r14+0x12d0]
 10a78fe:	49 8d 96 d8 12 00 00 	lea    rdx,[r14+0x12d8]
 10a7905:	e8 c8 20 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
 10a790a:	49 8d be 58 17 00 00 	lea    rdi,[r14+0x1758]
 10a7911:	49 8b b6 90 13 00 00 	mov    rsi,QWORD PTR [r14+0x1390]
 10a7918:	49 8d 96 98 13 00 00 	lea    rdx,[r14+0x1398]
 10a791f:	e8 ae 20 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
 10a7924:	49 8d be c8 16 00 00 	lea    rdi,[r14+0x16c8]
 10a792b:	49 8b b6 00 13 00 00 	mov    rsi,QWORD PTR [r14+0x1300]
 10a7932:	49 8d 96 08 13 00 00 	lea    rdx,[r14+0x1308]
 10a7939:	e8 94 20 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
 10a793e:	49 8d be e0 16 00 00 	lea    rdi,[r14+0x16e0]
--
 11f1134:	44 88 b3 a8 15 00 00 	mov    BYTE PTR [rbx+0x15a8],r14b
 11f113b:	44 88 b3 b0 15 00 00 	mov    BYTE PTR [rbx+0x15b0],r14b
 11f1142:	44 88 b3 b8 15 00 00 	mov    BYTE PTR [rbx+0x15b8],r14b
 11f1149:	44 88 b3 c0 15 00 00 	mov    BYTE PTR [rbx+0x15c0],r14b
 11f1150:	44 88 b3 c8 15 00 00 	mov    BYTE PTR [rbx+0x15c8],r14b
 11f1157:	44 88 b3 d0 15 00 00 	mov    BYTE PTR [rbx+0x15d0],r14b
 11f115e:	44 88 b3 d8 15 00 00 	mov    BYTE PTR [rbx+0x15d8],r14b
 11f1165:	ba a9 00 00 00       	mov    edx,0xa9
 11f116a:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
 11f116f:	31 f6                	xor    esi,esi
 11f1171:	e8 1a da 5f 00       	call   17eeb90 <memset@plt>
 11f1176:	44 88 b3 30 16 00 00 	mov    BYTE PTR [rbx+0x1630],r14b
 11f117d:	48 8d bb 38 16 00 00 	lea    rdi,[rbx+0x1638]
 11f1184:	66 0f ef c0          	pxor   xmm0,xmm0
 11f1188:	66 0f 7f 83 e0 15 00 	movdqa XMMWORD PTR [rbx+0x15e0],xmm0
 11f118f:	00 
 11f1190:	66 0f 7f 83 f0 15 00 	movdqa XMMWORD PTR [rbx+0x15f0],xmm0
 11f1197:	00 
 11f1198:	66 0f 7f 83 00 16 00 	movdqa XMMWORD PTR [rbx+0x1600],xmm0
 11f119f:	00 
 11f11a0:	44 88 b3 10 16 00 00 	mov    BYTE PTR [rbx+0x1610],r14b
 11f11a7:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
 11f11ae:	00 
 11f11af:	e8 da 70 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 11f11b4:	83 a3 90 16 00 00 00 	and    DWORD PTR [rbx+0x1690],0x0
 11f11bb:	48 89 ab 98 16 00 00 	mov    QWORD PTR [rbx+0x1698],rbp
 11f11c2:	4c 8d a3 a0 16 00 00 	lea    r12,[rbx+0x16a0]
 11f11c9:	4c 89 e7             	mov    rdi,r12
 11f11cc:	48 8b b4 24 60 06 00 	mov    rsi,QWORD PTR [rsp+0x660]
 11f11d3:	00 
 11f11d4:	e8 e9 04 5d 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 11f11d9:	4c 8d ab b0 16 00 00 	lea    r13,[rbx+0x16b0]
 11f11e0:	4c 89 ef             	mov    rdi,r13
--
 15fe58d:	4c 89 ee             	mov    rsi,r13
 15fe590:	e8 02 d8 fe ff       	call   15ebd97 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43131b>
 15fe595:	41 83 a6 74 16 00 00 	and    DWORD PTR [r14+0x1674],0x0
 15fe59c:	00 
 15fe59d:	4d 8d 7e 20          	lea    r15,[r14+0x20]
 15fe5a1:	66 0f ef c0          	pxor   xmm0,xmm0
 15fe5a5:	66 41 0f 7f 86 20 16 	movdqa XMMWORD PTR [r14+0x1620],xmm0
 15fe5ac:	00 00 
 15fe5ae:	66 41 0f 7f 86 30 16 	movdqa XMMWORD PTR [r14+0x1630],xmm0
 15fe5b5:	00 00 
 15fe5b7:	66 41 0f 7f 86 40 16 	movdqa XMMWORD PTR [r14+0x1640],xmm0
 15fe5be:	00 00 
 15fe5c0:	66 41 0f 7f 86 50 16 	movdqa XMMWORD PTR [r14+0x1650],xmm0
 15fe5c7:	00 00 
 15fe5c9:	66 41 0f 7f 86 60 16 	movdqa XMMWORD PTR [r14+0x1660],xmm0
 15fe5d0:	00 00 
 15fe5d2:	41 c6 86 70 16 00 00 	mov    BYTE PTR [r14+0x1670],0x0
 15fe5d9:	00 
 15fe5da:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
 15fe5e1:	00 
 15fe5e2:	e8 83 b9 47 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 15fe5e7:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
 15fe5ec:	e8 79 b9 47 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 15fe5f1:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
 15fe5f5:	48 85 c0             	test   rax,rax
 15fe5f8:	74 0a                	je     15fe604 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x443b88>
 15fe5fa:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
 15fe5fe:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
 15fe602:	75 27                	jne    15fe62b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x443baf>
 15fe604:	66 49 0f 6e ce       	movq   xmm1,r14
 15fe609:	4c 89 f7             	mov    rdi,r14
 15fe60c:	48 83 c7 28          	add    rdi,0x28
 15fe610:	66 49 0f 6e c7       	movq   xmm0,r15
--
 15fe80a:	e9 ab 00 00 00       	jmp    15fe8ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x443e3e>
 15fe80f:	e8 9c 12 1f 00       	call   17efab0 <__stack_chk_fail@plt>
 15fe814:	53                   	push   rbx
 15fe815:	48 83 ec 30          	sub    rsp,0x30
 15fe819:	48 89 fb             	mov    rbx,rdi
 15fe81c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 15fe823:	00 00 
 15fe825:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
 15fe82a:	48 81 c7 00 16 00 00 	add    rdi,0x1600
 15fe831:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
 15fe836:	c6 44 24 20 01       	mov    BYTE PTR [rsp+0x20],0x1
 15fe83b:	e8 b0 f8 1e 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
 15fe840:	c6 83 50 16 00 00 01 	mov    BYTE PTR [rbx+0x1650],0x1
 15fe847:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 15fe84c:	e8 ed f4 5d ff       	call   bddd3e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12acde>
 15fe851:	48 8d bb 30 14 00 00 	lea    rdi,[rbx+0x1430]
 15fe858:	e8 db 30 1c 00       	call   17c1938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175aa4>
 15fe85d:	48 8d bb 28 16 00 00 	lea    rdi,[rbx+0x1628]
 15fe864:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
 15fe869:	c6 44 24 10 01       	mov    BYTE PTR [rsp+0x10],0x1
 15fe86e:	e8 7d f8 1e 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
 15fe873:	48 8b 7b 50          	mov    rdi,QWORD PTR [rbx+0x50]
 15fe877:	48 85 ff             	test   rdi,rdi
 15fe87a:	74 06                	je     15fe882 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x443e06>
 15fe87c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 15fe87f:	ff 50 18             	call   QWORD PTR [rax+0x18]
 15fe882:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 15fe887:	e8 a4 d5 4a ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
 15fe88c:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 15fe891:	e8 9a d5 4a ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
 15fe896:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 15fe89d:	00 00 
 15fe89f:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
--
 15fec21:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
 15fec25:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]
 15fec28:	31 ff                	xor    edi,edi
 15fec2a:	e8 57 f8 49 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 15fec2f:	48 85 db             	test   rbx,rbx
 15fec32:	0f 84 e8 00 00 00    	je     15fed20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4442a4>
 15fec38:	48 8d bb 00 16 00 00 	lea    rdi,[rbx+0x1600]
 15fec3f:	48 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdi
 15fec46:	00 
 15fec47:	c6 84 24 98 00 00 00 	mov    BYTE PTR [rsp+0x98],0x1
 15fec4e:	01 
 15fec4f:	e8 9c f4 1e 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
 15fec54:	80 bb 50 16 00 00 00 	cmp    BYTE PTR [rbx+0x1650],0x0
 15fec5b:	0f 85 b2 00 00 00    	jne    15fed13 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x444297>
 15fec61:	48 8d 05 f0 1b 35 00 	lea    rax,[rip+0x351bf0]        # 1950858 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x194a0>
 15fec68:	49 39 47 08          	cmp    QWORD PTR [r15+0x8],rax
 15fec6c:	0f 84 df 00 00 00    	je     15fed51 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4442d5>
 15fec72:	c6 83 50 16 00 00 01 	mov    BYTE PTR [rbx+0x1650],0x1
 15fec79:	48 8b 83 a8 14 00 00 	mov    rax,QWORD PTR [rbx+0x14a8]
 15fec80:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 15fec85:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 15fec89:	0f 10 83 98 14 00 00 	movups xmm0,XMMWORD PTR [rbx+0x1498]
 15fec90:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
 15fec93:	0f 57 c0             	xorps  xmm0,xmm0
 15fec96:	0f 11 83 98 14 00 00 	movups XMMWORD PTR [rbx+0x1498],xmm0
 15fec9d:	48 83 a3 a8 14 00 00 	and    QWORD PTR [rbx+0x14a8],0x0
 15feca4:	00 
 15feca5:	e8 e6 f1 1e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 15fecaa:	48 8d b3 c0 15 00 00 	lea    rsi,[rbx+0x15c0]
 15fecb1:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
 15fecb8:	00 
 15fecb9:	e8 96 d0 fe ff       	call   15ebd54 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4312d8>
 15fecbe:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 15fecc5:	00 
 15fecc6:	e8 73 f0 5d ff       	call   bddd3e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12acde>
 15feccb:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
 15fecd2:	00 
 15fecd3:	48 85 ff             	test   rdi,rdi
--
 15feef2:	e8 39 c4 4a ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
 15feef7:	0f 28 03             	movaps xmm0,XMMWORD PTR [rbx]
 15feefa:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
 15feefe:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]
 15fef01:	31 ff                	xor    edi,edi
 15fef03:	e8 7e f5 49 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 15fef08:	48 85 db             	test   rbx,rbx
 15fef0b:	74 3b                	je     15fef48 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4444cc>
 15fef0d:	48 8d bb 00 16 00 00 	lea    rdi,[rbx+0x1600]
 15fef14:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
 15fef19:	c6 44 24 18 01       	mov    BYTE PTR [rsp+0x18],0x1
 15fef1e:	e8 cd f1 1e 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
 15fef23:	80 bb 50 16 00 00 00 	cmp    BYTE PTR [rbx+0x1650],0x0
 15fef2a:	75 12                	jne    15fef3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4444c2>
 15fef2c:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 15fef31:	e8 08 ee 5d ff       	call   bddd3e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12acde>
 15fef36:	48 89 df             	mov    rdi,rbx
 15fef39:	e8 7c f9 ff ff       	call   15fe8ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x443e3e>
 15fef3e:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 15fef43:	e8 e8 ce 4a ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
 15fef48:	66 0f 6f 04 24       	movdqa xmm0,XMMWORD PTR [rsp]
 15fef4d:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
 15fef54:	e8 2d f5 49 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 15fef59:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 15fef60:	00 00 
 15fef62:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
 15fef67:	75 06                	jne    15fef6f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4444f3>
 15fef69:	48 83 c4 30          	add    rsp,0x30
 15fef6d:	5b                   	pop    rbx
 15fef6e:	c3                   	ret
 15fef6f:	e8 3c 0b 1f 00       	call   17efab0 <__stack_chk_fail@plt>
 15fef74:	48 89 c7             	mov    rdi,rax
 15fef77:	e8 29 ab 47 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
--
 15ff035:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
 15ff039:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]
 15ff03c:	31 ff                	xor    edi,edi
 15ff03e:	e8 43 f4 49 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 15ff043:	48 85 db             	test   rbx,rbx
 15ff046:	0f 84 31 01 00 00    	je     15ff17d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x444701>
 15ff04c:	48 8d bb 00 16 00 00 	lea    rdi,[rbx+0x1600]
 15ff053:	48 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdi
 15ff05a:	00 
 15ff05b:	c6 84 24 98 00 00 00 	mov    BYTE PTR [rsp+0x98],0x1
 15ff062:	01 
 15ff063:	e8 88 f0 1e 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
 15ff068:	80 bb 50 16 00 00 00 	cmp    BYTE PTR [rbx+0x1650],0x0
 15ff06f:	0f 85 fb 00 00 00    	jne    15ff170 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4446f4>
 15ff075:	41 8b 06             	mov    eax,DWORD PTR [r14]
 15ff078:	8d 88 0c fe ff ff    	lea    ecx,[rax-0x1f4]
 15ff07e:	83 f9 04             	cmp    ecx,0x4
 15ff081:	77 05                	ja     15ff088 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44460c>
 15ff083:	83 f9 01             	cmp    ecx,0x1
 15ff086:	75 07                	jne    15ff08f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x444613>
 15ff088:	3d 98 01 00 00       	cmp    eax,0x198
 15ff08d:	75 3d                	jne    15ff0cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x444650>
 15ff08f:	48 8d bb 40 14 00 00 	lea    rdi,[rbx+0x1440]
 15ff096:	e8 22 fd ff ff       	call   15fedbd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x444341>
 15ff09b:	84 c0                	test   al,al
 15ff09d:	74 2d                	je     15ff0cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x444650>
 15ff09f:	8b 83 54 16 00 00    	mov    eax,DWORD PTR [rbx+0x1654]
 15ff0a5:	3b 43 60             	cmp    eax,DWORD PTR [rbx+0x60]
 15ff0a8:	73 22                	jae    15ff0cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x444650>
 15ff0aa:	ff c0                	inc    eax
 15ff0ac:	89 83 54 16 00 00    	mov    DWORD PTR [rbx+0x1654],eax
 15ff0b2:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 15ff0b9:	00 
 15ff0ba:	e8 7f ec 5d ff       	call   bddd3e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12acde>
 15ff0bf:	48 89 df             	mov    rdi,rbx
 15ff0c2:	e8 45 fd ff ff       	call   15fee0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x444390>
 15ff0c7:	e9 a4 00 00 00       	jmp    15ff170 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4446f4>
 15ff0cc:	c6 83 50 16 00 00 01 	mov    BYTE PTR [rbx+0x1650],0x1
 15ff0d3:	48 8b 83 a8 14 00 00 	mov    rax,QWORD PTR [rbx+0x14a8]
 15ff0da:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 15ff0df:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 15ff0e3:	0f 10 83 98 14 00 00 	movups xmm0,XMMWORD PTR [rbx+0x1498]
 15ff0ea:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
 15ff0ed:	0f 57 c0             	xorps  xmm0,xmm0
 15ff0f0:	0f 11 83 98 14 00 00 	movups XMMWORD PTR [rbx+0x1498],xmm0
 15ff0f7:	48 83 a3 a8 14 00 00 	and    QWORD PTR [rbx+0x14a8],0x0
 15ff0fe:	00 
 15ff0ff:	e8 8c ed 1e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 15ff104:	48 8d b3 60 15 00 00 	lea    rsi,[rbx+0x1560]
 15ff10b:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
 15ff112:	00 
 15ff113:	e8 b4 cb fe ff       	call   15ebccc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x431250>
 15ff118:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 15ff11f:	00 
 15ff120:	e8 19 ec 5d ff       	call   bddd3e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12acde>
 15ff125:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
 15ff12c:	00 
 15ff12d:	48 85 ff             	test   rdi,rdi

## Export/serialization code after disallow_updating_context_reasons

/tmp/dsig/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

000000000166f480 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x235ec>:
 166f480:	3d 5b 14 45 ff       	cmp    eax,0xff45145b
 166f485:	48 8d 35 2c 3c 38 00 	lea    rsi,[rip+0x383c2c]        # 19f30b8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1177>
 166f48c:	48 8d 15 6d 4b 18 00 	lea    rdx,[rip+0x184b6d]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
 166f493:	e8 c8 e9 17 00       	call   17ede60 <__cxa_atexit@plt>
 166f498:	48 8d 3d 41 3c 38 00 	lea    rdi,[rip+0x383c41]        # 19f30e0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x119f>
 166f49f:	e8 dc ec 17 00       	call   17ee180 <__cxa_guard_release@plt>
 166f4a4:	e9 46 f7 ff ff       	jmp    166ebef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d5b>
 166f4a9:	4c 8d 3d 60 3c 38 00 	lea    r15,[rip+0x383c60]        # 19f3110 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x11cf>
 166f4b0:	4c 89 ff             	mov    rdi,r15
 166f4b3:	e8 b8 ec 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
 166f4b8:	85 c0                	test   eax,eax
 166f4ba:	0f 84 3d f7 ff ff    	je     166ebfd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d69>
 166f4c0:	48 8d 3d 21 3c 38 00 	lea    rdi,[rip+0x383c21]        # 19f30e8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x11a7>
 166f4c7:	48 8d 35 e1 b5 ce fe 	lea    rsi,[rip+0xfffffffffeceb5e1]        # 35aaaf <_ZTSSt12bad_any_cast@@Base-0x35719>
 166f4ce:	e8 01 86 ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
 166f4d3:	48 8d 3d 06 14 45 ff 	lea    rdi,[rip+0xffffffffff451406]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
 166f4da:	48 8d 35 07 3c 38 00 	lea    rsi,[rip+0x383c07]        # 19f30e8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x11a7>
 166f4e1:	48 8d 15 18 4b 18 00 	lea    rdx,[rip+0x184b18]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
 166f4e8:	e8 73 e9 17 00       	call   17ede60 <__cxa_atexit@plt>
 166f4ed:	48 8d 3d 1c 3c 38 00 	lea    rdi,[rip+0x383c1c]        # 19f3110 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x11cf>
 166f4f4:	e8 87 ec 17 00       	call   17ee180 <__cxa_guard_release@plt>
 166f4f9:	e9 ff f6 ff ff       	jmp    166ebfd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d69>
 166f4fe:	4c 8d 3d 3b 3c 38 00 	lea    r15,[rip+0x383c3b]        # 19f3140 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x11ff>
 166f505:	4c 89 ff             	mov    rdi,r15
 166f508:	e8 63 ec 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
 166f50d:	85 c0                	test   eax,eax
 166f50f:	0f 84 f6 f6 ff ff    	je     166ec0b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d77>
 166f515:	48 8d 3d fc 3b 38 00 	lea    rdi,[rip+0x383bfc]        # 19f3118 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x11d7>
 166f51c:	48 8d 35 19 c5 d0 fe 	lea    rsi,[rip+0xfffffffffed0c519]        # 37ba3c <_ZTSSt12bad_any_cast@@Base-0x1478c>
 166f523:	e8 ac 85 ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
 166f528:	48 8d 3d b1 13 45 ff 	lea    rdi,[rip+0xffffffffff4513b1]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
 166f52f:	48 8d 35 e2 3b 38 00 	lea    rsi,[rip+0x383be2]        # 19f3118 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x11d7>
 166f536:	48 8d 15 c3 4a 18 00 	lea    rdx,[rip+0x184ac3]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
 166f53d:	e8 1e e9 17 00       	call   17ede60 <__cxa_atexit@plt>
 166f542:	48 8d 3d f7 3b 38 00 	lea    rdi,[rip+0x383bf7]        # 19f3140 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x11ff>
 166f549:	e8 32 ec 17 00       	call   17ee180 <__cxa_guard_release@plt>
 166f54e:	e9 b8 f6 ff ff       	jmp    166ec0b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d77>
 166f553:	eb 28                	jmp    166f57d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236e9>
 166f555:	eb 26                	jmp    166f57d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236e9>
 166f557:	eb 24                	jmp    166f57d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236e9>
 166f559:	eb 22                	jmp    166f57d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236e9>
 166f55b:	eb 20                	jmp    166f57d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236e9>
 166f55d:	eb 1e                	jmp    166f57d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236e9>
 166f55f:	eb 1c                	jmp    166f57d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236e9>
 166f561:	eb 1a                	jmp    166f57d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236e9>
 166f563:	eb 18                	jmp    166f57d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236e9>
 166f565:	eb 16                	jmp    166f57d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236e9>
 166f567:	eb 14                	jmp    166f57d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236e9>
 166f569:	eb 12                	jmp    166f57d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236e9>
 166f56b:	eb 10                	jmp    166f57d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236e9>
 166f56d:	eb 0e                	jmp    166f57d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236e9>
 166f56f:	eb 0c                	jmp    166f57d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236e9>
 166f571:	eb 0a                	jmp    166f57d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236e9>
 166f573:	eb 08                	jmp    166f57d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236e9>
 166f575:	eb 06                	jmp    166f57d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236e9>
 166f577:	eb 04                	jmp    166f57d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236e9>
 166f579:	eb 02                	jmp    166f57d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236e9>
 166f57b:	eb 00                	jmp    166f57d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236e9>
 166f57d:	48 89 c3             	mov    rbx,rax
 166f580:	4c 89 ff             	mov    rdi,r15
 166f583:	e8 78 f2 17 00       	call   17ee800 <__cxa_guard_abort@plt>
 166f588:	eb 03                	jmp    166f58d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236f9>
 166f58a:	48 89 c3             	mov    rbx,rax
 166f58d:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
 166f591:	e8 44 e0 7b ff       	call   e2d5da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa660>
 166f596:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 166f59d:	00 00 
 166f59f:	48 3b 44 24 08       	cmp    rax,QWORD PTR [rsp+0x8]
 166f5a4:	75 08                	jne    166f5ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2371a>
 166f5a6:	48 89 df             	mov    rdi,rbx
 166f5a9:	e8 22 07 40 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 166f5ae:	e8 fd 04 18 00       	call   17efab0 <__stack_chk_fail@plt>
 166f5b3:	41 57                	push   r15
 166f5b5:	41 56                	push   r14
 166f5b7:	53                   	push   rbx
 166f5b8:	48 83 ec 10          	sub    rsp,0x10
 166f5bc:	49 89 f6             	mov    r14,rsi
 166f5bf:	48 89 fb             	mov    rbx,rdi
 166f5c2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 166f5c9:	00 00 
 166f5cb:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 166f5d0:	48 89 e7             	mov    rdi,rsp
 166f5d3:	48 89 de             	mov    rsi,rbx
 166f5d6:	e8 41 de 7b ff       	call   e2d41c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa4a2>
 166f5db:	8a 05 8f 3b 38 00    	mov    al,BYTE PTR [rip+0x383b8f]        # 19f3170 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x122f>
 166f5e1:	84 c0                	test   al,al
 166f5e3:	0f 84 a9 00 00 00    	je     166f692 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x237fe>
 166f5e9:	8a 05 b1 3b 38 00    	mov    al,BYTE PTR [rip+0x383bb1]        # 19f31a0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x125f>
 166f5ef:	84 c0                	test   al,al
 166f5f1:	0f 84 f0 00 00 00    	je     166f6e7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23853>
 166f5f7:	8a 05 d3 3b 38 00    	mov    al,BYTE PTR [rip+0x383bd3]        # 19f31d0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x128f>
 166f5fd:	84 c0                	test   al,al
 166f5ff:	0f 84 37 01 00 00    	je     166f73c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a8>
 166f605:	8a 05 f5 3b 38 00    	mov    al,BYTE PTR [rip+0x383bf5]        # 19f3200 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x12bf>
 166f60b:	84 c0                	test   al,al
 166f60d:	0f 84 7e 01 00 00    	je     166f791 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238fd>
 166f613:	48 8d 35 8e 3b 38 00 	lea    rsi,[rip+0x383b8e]        # 19f31a8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1267>
 166f61a:	48 89 df             	mov    rdi,rbx
 166f61d:	4c 89 f2             	mov    rdx,r14
 166f620:	e8 cf e8 7b ff       	call   e2def4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfaf7a>
 166f625:	49 8d 56 18          	lea    rdx,[r14+0x18]
 166f629:	48 8d 35 48 3b 38 00 	lea    rsi,[rip+0x383b48]        # 19f3178 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1237>
 166f630:	48 89 df             	mov    rdi,rbx
 166f633:	e8 bc e8 7b ff       	call   e2def4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfaf7a>
 166f638:	41 80 7e 48 00       	cmp    BYTE PTR [r14+0x48],0x0
 166f63d:	74 13                	je     166f652 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x237be>
 166f63f:	49 8d 56 30          	lea    rdx,[r14+0x30]
 166f643:	48 8d 35 8e 3b 38 00 	lea    rsi,[rip+0x383b8e]        # 19f31d8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1297>
 166f64a:	48 89 df             	mov    rdi,rbx
 166f64d:	e8 d0 01 00 00       	call   166f822 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2398e>
 166f652:	49 83 c6 50          	add    r14,0x50
 166f656:	48 8d 35 eb 3a 38 00 	lea    rsi,[rip+0x383aeb]        # 19f3148 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1207>
 166f65d:	48 89 df             	mov    rdi,rbx
 166f660:	4c 89 f2             	mov    rdx,r14
 166f663:	e8 5d e5 ff ff       	call   166dbc5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d31>
 166f668:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
 166f66c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 166f673:	00 00 
 166f675:	48 3b 44 24 08       	cmp    rax,QWORD PTR [rsp+0x8]
 166f67a:	0f 85 9d 01 00 00    	jne    166f81d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23989>
 166f680:	e8 55 df 7b ff       	call   e2d5da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa660>
 166f685:	48 89 d8             	mov    rax,rbx
 166f688:	48 83 c4 10          	add    rsp,0x10
 166f68c:	5b                   	pop    rbx
 166f68d:	41 5e                	pop    r14
 166f68f:	41 5f                	pop    r15
 166f691:	c3                   	ret
 166f692:	4c 8d 3d d7 3a 38 00 	lea    r15,[rip+0x383ad7]        # 19f3170 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x122f>
 166f699:	4c 89 ff             	mov    rdi,r15
 166f69c:	e8 cf ea 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
 166f6a1:	85 c0                	test   eax,eax
 166f6a3:	0f 84 40 ff ff ff    	je     166f5e9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23755>
 166f6a9:	48 8d 3d 98 3a 38 00 	lea    rdi,[rip+0x383a98]        # 19f3148 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1207>
 166f6b0:	48 8d 35 26 55 cd fe 	lea    rsi,[rip+0xfffffffffecd5526]        # 344bdd <_ZTSSt12bad_any_cast@@Base-0x4b5eb>
 166f6b7:	e8 18 84 ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
 166f6bc:	48 8d 3d 1d 12 45 ff 	lea    rdi,[rip+0xffffffffff45121d]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
 166f6c3:	48 8d 35 7e 3a 38 00 	lea    rsi,[rip+0x383a7e]        # 19f3148 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1207>
 166f6ca:	48 8d 15 2f 49 18 00 	lea    rdx,[rip+0x18492f]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
 166f6d1:	e8 8a e7 17 00       	call   17ede60 <__cxa_atexit@plt>
 166f6d6:	48 8d 3d 93 3a 38 00 	lea    rdi,[rip+0x383a93]        # 19f3170 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x122f>
 166f6dd:	e8 9e ea 17 00       	call   17ee180 <__cxa_guard_release@plt>
 166f6e2:	e9 02 ff ff ff       	jmp    166f5e9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23755>
 166f6e7:	4c 8d 3d b2 3a 38 00 	lea    r15,[rip+0x383ab2]        # 19f31a0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x125f>
 166f6ee:	4c 89 ff             	mov    rdi,r15
 166f6f1:	e8 7a ea 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
 166f6f6:	85 c0                	test   eax,eax
 166f6f8:	0f 84 f9 fe ff ff    	je     166f5f7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23763>
 166f6fe:	48 8d 3d 73 3a 38 00 	lea    rdi,[rip+0x383a73]        # 19f3178 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1237>
 166f705:	48 8d 35 52 c3 d0 fe 	lea    rsi,[rip+0xfffffffffed0c352]        # 37ba5e <_ZTSSt12bad_any_cast@@Base-0x1476a>
 166f70c:	e8 c3 83 ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
 166f711:	48 8d 3d c8 11 45 ff 	lea    rdi,[rip+0xffffffffff4511c8]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
 166f718:	48 8d 35 59 3a 38 00 	lea    rsi,[rip+0x383a59]        # 19f3178 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1237>
 166f71f:	48 8d 15 da 48 18 00 	lea    rdx,[rip+0x1848da]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
 166f726:	e8 35 e7 17 00       	call   17ede60 <__cxa_atexit@plt>
 166f72b:	48 8d 3d 6e 3a 38 00 	lea    rdi,[rip+0x383a6e]        # 19f31a0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x125f>
 166f732:	e8 49 ea 17 00       	call   17ee180 <__cxa_guard_release@plt>
 166f737:	e9 bb fe ff ff       	jmp    166f5f7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23763>
 166f73c:	4c 8d 3d 8d 3a 38 00 	lea    r15,[rip+0x383a8d]        # 19f31d0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x128f>
 166f743:	4c 89 ff             	mov    rdi,r15
 166f746:	e8 25 ea 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
 166f74b:	85 c0                	test   eax,eax
 166f74d:	0f 84 b2 fe ff ff    	je     166f605 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23771>
 166f753:	48 8d 3d 4e 3a 38 00 	lea    rdi,[rip+0x383a4e]        # 19f31a8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1267>
 166f75a:	48 8d 35 30 f3 d0 fe 	lea    rsi,[rip+0xfffffffffed0f330]        # 37ea91 <_ZTSSt12bad_any_cast@@Base-0x11737>
 166f761:	e8 6e 83 ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
 166f766:	48 8d 3d 73 11 45 ff 	lea    rdi,[rip+0xffffffffff451173]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
 166f76d:	48 8d 35 34 3a 38 00 	lea    rsi,[rip+0x383a34]        # 19f31a8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1267>
 166f774:	48 8d 15 85 48 18 00 	lea    rdx,[rip+0x184885]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
 166f77b:	e8 e0 e6 17 00       	call   17ede60 <__cxa_atexit@plt>
 166f780:	48 8d 3d 49 3a 38 00 	lea    rdi,[rip+0x383a49]        # 19f31d0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x128f>
 166f787:	e8 f4 e9 17 00       	call   17ee180 <__cxa_guard_release@plt>
 166f78c:	e9 74 fe ff ff       	jmp    166f605 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23771>
 166f791:	4c 8d 3d 68 3a 38 00 	lea    r15,[rip+0x383a68]        # 19f3200 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x12bf>
 166f798:	4c 89 ff             	mov    rdi,r15
 166f79b:	e8 d0 e9 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
 166f7a0:	85 c0                	test   eax,eax
 166f7a2:	0f 84 6b fe ff ff    	je     166f613 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2377f>
 166f7a8:	48 8d 3d 29 3a 38 00 	lea    rdi,[rip+0x383a29]        # 19f31d8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1297>
 166f7af:	48 8d 35 9e 0e cc fe 	lea    rsi,[rip+0xfffffffffecc0e9e]        # 330654 <_ZTSSt12bad_any_cast@@Base-0x5fb74>
 166f7b6:	e8 19 83 ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
 166f7bb:	48 8d 3d 1e 11 45 ff 	lea    rdi,[rip+0xffffffffff45111e]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
 166f7c2:	48 8d 35 0f 3a 38 00 	lea    rsi,[rip+0x383a0f]        # 19f31d8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1297>
 166f7c9:	48 8d 15 30 48 18 00 	lea    rdx,[rip+0x184830]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
 166f7d0:	e8 8b e6 17 00       	call   17ede60 <__cxa_atexit@plt>
 166f7d5:	48 8d 3d 24 3a 38 00 	lea    rdi,[rip+0x383a24]        # 19f3200 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x12bf>
 166f7dc:	e8 9f e9 17 00       	call   17ee180 <__cxa_guard_release@plt>
 166f7e1:	e9 2d fe ff ff       	jmp    166f613 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2377f>
 166f7e6:	eb 04                	jmp    166f7ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23958>
 166f7e8:	eb 02                	jmp    166f7ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23958>
 166f7ea:	eb 00                	jmp    166f7ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23958>
 166f7ec:	48 89 c3             	mov    rbx,rax
 166f7ef:	4c 89 ff             	mov    rdi,r15
 166f7f2:	e8 09 f0 17 00       	call   17ee800 <__cxa_guard_abort@plt>
 166f7f7:	eb 03                	jmp    166f7fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23968>
 166f7f9:	48 89 c3             	mov    rbx,rax
 166f7fc:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
 166f800:	e8 d5 dd 7b ff       	call   e2d5da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa660>
 166f805:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 166f80c:	00 00 
 166f80e:	48 3b 44 24 08       	cmp    rax,QWORD PTR [rsp+0x8]
 166f813:	75 08                	jne    166f81d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23989>
 166f815:	48 89 df             	mov    rdi,rbx
 166f818:	e8 b3 04 40 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 166f81d:	e8 8e 02 18 00       	call   17efab0 <__stack_chk_fail@plt>
 166f822:	41 57                	push   r15
 166f824:	41 56                	push   r14
 166f826:	53                   	push   rbx
 166f827:	48 83 ec 10          	sub    rsp,0x10
 166f82b:	49 89 d6             	mov    r14,rdx
 166f82e:	48 89 fb             	mov    rbx,rdi
 166f831:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 166f838:	00 00 
 166f83a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 166f83f:	e8 d8 e6 7b ff       	call   e2df1c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfafa2>
 166f844:	48 89 e7             	mov    rdi,rsp
 166f847:	48 89 de             	mov    rsi,rbx
 166f84a:	e8 e1 b9 9e ff       	call   105b230 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222646>
 166f84f:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
 166f852:	4d 3b 7e 08          	cmp    r15,QWORD PTR [r14+0x8]
 166f856:	74 11                	je     166f869 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x239d5>
 166f858:	48 89 df             	mov    rdi,rbx
 166f85b:	4c 89 fe             	mov    rsi,r15
 166f85e:	e8 e2 df ff ff       	call   166d845 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x219b1>
 166f863:	49 83 c7 48          	add    r15,0x48
 166f867:	eb e9                	jmp    166f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x239be>
 166f869:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
 166f86d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 166f874:	00 00 
 166f876:	48 3b 44 24 08       	cmp    rax,QWORD PTR [rsp+0x8]
 166f87b:	75 36                	jne    166f8b3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23a1f>
 166f87d:	e8 00 9c 99 ff       	call   1009482 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d0898>
 166f882:	48 89 d8             	mov    rax,rbx
 166f885:	48 83 c4 10          	add    rsp,0x10
 166f889:	5b                   	pop    rbx
 166f88a:	41 5e                	pop    r14
 166f88c:	41 5f                	pop    r15
 166f88e:	c3                   	ret
 166f88f:	48 89 c3             	mov    rbx,rax
 166f892:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
 166f896:	e8 e7 9b 99 ff       	call   1009482 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d0898>
 166f89b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 166f8a2:	00 00 
 166f8a4:	48 3b 44 24 08       	cmp    rax,QWORD PTR [rsp+0x8]
 166f8a9:	75 08                	jne    166f8b3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23a1f>
 166f8ab:	48 89 df             	mov    rdi,rbx
 166f8ae:	e8 1d 04 40 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 166f8b3:	e8 f8 01 18 00       	call   17efab0 <__stack_chk_fail@plt>
 166f8b8:	41 56                	push   r14
 166f8ba:	53                   	push   rbx
 166f8bb:	48 83 ec 28          	sub    rsp,0x28
 166f8bf:	49 89 f6             	mov    r14,rsi
 166f8c2:	48 89 fb             	mov    rbx,rdi
 166f8c5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 166f8cc:	00 00 
 166f8ce:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 166f8d3:	e8 e8 da 7b ff       	call   e2d3c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa446>
 166f8d8:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
 166f8dd:	48 89 1e             	mov    QWORD PTR [rsi],rbx
 166f8e0:	c6 46 09 00          	mov    BYTE PTR [rsi+0x9],0x0
 166f8e4:	48 89 e7             	mov    rdi,rsp
 166f8e7:	e8 30 db 7b ff       	call   e2d41c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa4a2>
 166f8ec:	48 8d 35 b5 45 38 00 	lea    rsi,[rip+0x3845b5]        # 19f3ea8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1f67>
 166f8f3:	48 8d 15 16 d5 dc fe 	lea    rdx,[rip+0xfffffffffedcd516]        # 43ce10 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2a1c>
 166f8fa:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 166f8ff:	e8                   	.byte 0xe8


/tmp/dsig/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000001677ef0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c05c>:
 1677ef0:	24 08                	and    al,0x8
 1677ef2:	e8 87 1b 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 1677ef7:	48 8d 8c 24 18 02 00 	lea    rcx,[rsp+0x218]
 1677efe:	00 
 1677eff:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
 1677f03:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
 1677f07:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
 1677f0c:	e8 6f f4 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
 1677f11:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 1677f16:	e8 75 5f 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1677f1b:	48 8d 35 8d 2b ce fe 	lea    rsi,[rip+0xfffffffffece2b8d]        # 35aaaf <_ZTSSt12bad_any_cast@@Base-0x35719>
 1677f22:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 1677f27:	e8 52 1b 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 1677f2c:	48 8d 8c 24 30 02 00 	lea    rcx,[rsp+0x230]
 1677f33:	00 
 1677f34:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
 1677f38:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
 1677f3c:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
 1677f41:	e8 3a f4 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
 1677f46:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 1677f4b:	e8 40 5f 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1677f50:	48 8d 35 e5 3a d0 fe 	lea    rsi,[rip+0xfffffffffed03ae5]        # 37ba3c <_ZTSSt12bad_any_cast@@Base-0x1478c>
 1677f57:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 1677f5c:	e8 1d 1b 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 1677f61:	48 8d 8c 24 48 02 00 	lea    rcx,[rsp+0x248]
 1677f68:	00 
 1677f69:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
 1677f6d:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
 1677f71:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
 1677f76:	e8 05 f4 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
 1677f7b:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 1677f80:	e8 0b 5f 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1677f85:	48 83 c3 68          	add    rbx,0x68
 1677f89:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
 1677f8e:	48 89 df             	mov    rdi,rbx
 1677f91:	4c 89 f6             	mov    rsi,r14
 1677f94:	e8 15 99 05 00       	call   16d18ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85a1a>
 1677f99:	4c 89 f7             	mov    rdi,r14
 1677f9c:	e8 8b 9b 05 00       	call   16d1b2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85c98>
 1677fa1:	48 8d bc 24 d0 03 00 	lea    rdi,[rsp+0x3d0]
 1677fa8:	00 
 1677fa9:	e8 76 b4 14 00       	call   17c3424 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177590>
 1677fae:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1677fb5:	00 00 
 1677fb7:	48 3b 84 24 f0 03 00 	cmp    rax,QWORD PTR [rsp+0x3f0]
 1677fbe:	00 
 1677fbf:	0f 85 ce 00 00 00    	jne    1678093 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1ff>
 1677fc5:	48 81 c4 f8 03 00 00 	add    rsp,0x3f8
 1677fcc:	5b                   	pop    rbx
 1677fcd:	41 5c                	pop    r12
 1677fcf:	41 5d                	pop    r13
 1677fd1:	41 5e                	pop    r14
 1677fd3:	41 5f                	pop    r15
 1677fd5:	5d                   	pop    rbp
 1677fd6:	c3                   	ret
 1677fd7:	eb 52                	jmp    167802b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c197>
 1677fd9:	eb 5f                	jmp    167803a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1a6>
 1677fdb:	eb 4e                	jmp    167802b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c197>
 1677fdd:	eb 5b                	jmp    167803a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1a6>
 1677fdf:	eb 4a                	jmp    167802b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c197>
 1677fe1:	eb 57                	jmp    167803a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1a6>
 1677fe3:	eb 46                	jmp    167802b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c197>
 1677fe5:	eb 53                	jmp    167803a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1a6>
 1677fe7:	eb 42                	jmp    167802b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c197>
 1677fe9:	eb 4f                	jmp    167803a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1a6>
 1677feb:	eb 3e                	jmp    167802b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c197>
 1677fed:	eb 4b                	jmp    167803a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1a6>
 1677fef:	eb 3a                	jmp    167802b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c197>
 1677ff1:	eb 47                	jmp    167803a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1a6>
 1677ff3:	eb 36                	jmp    167802b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c197>
 1677ff5:	eb 43                	jmp    167803a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1a6>
 1677ff7:	eb 32                	jmp    167802b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c197>
 1677ff9:	eb 3f                	jmp    167803a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1a6>
 1677ffb:	eb 2e                	jmp    167802b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c197>
 1677ffd:	eb 3b                	jmp    167803a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1a6>
 1677fff:	eb 2a                	jmp    167802b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c197>
 1678001:	eb 37                	jmp    167803a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1a6>
 1678003:	eb 26                	jmp    167802b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c197>
 1678005:	eb 33                	jmp    167803a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1a6>
 1678007:	eb 22                	jmp    167802b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c197>
 1678009:	eb 2f                	jmp    167803a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1a6>
 167800b:	eb 1e                	jmp    167802b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c197>
 167800d:	eb 2b                	jmp    167803a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1a6>
 167800f:	eb 1a                	jmp    167802b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c197>
 1678011:	eb 27                	jmp    167803a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1a6>
 1678013:	eb 16                	jmp    167802b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c197>
 1678015:	eb 23                	jmp    167803a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1a6>
 1678017:	eb 12                	jmp    167802b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c197>
 1678019:	eb 1f                	jmp    167803a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1a6>
 167801b:	eb 0e                	jmp    167802b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c197>
 167801d:	eb 1b                	jmp    167803a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1a6>
 167801f:	eb 0a                	jmp    167802b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c197>
 1678021:	eb 17                	jmp    167803a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1a6>
 1678023:	eb 06                	jmp    167802b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c197>
 1678025:	eb 13                	jmp    167803a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1a6>
 1678027:	eb 02                	jmp    167802b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c197>
 1678029:	eb 0f                	jmp    167803a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1a6>
 167802b:	49 89 c6             	mov    r14,rax
 167802e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 1678033:	e8 58 5e 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1678038:	eb 03                	jmp    167803d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1a9>
 167803a:	49 89 c6             	mov    r14,rax
 167803d:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 1678042:	e8 e5 9a 05 00       	call   16d1b2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85c98>
 1678047:	eb 19                	jmp    1678062 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1ce>
 1678049:	eb 00                	jmp    167804b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1b7>
 167804b:	49 89 c6             	mov    r14,rax
 167804e:	eb 1f                	jmp    167806f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1db>
 1678050:	49 89 c6             	mov    r14,rax
 1678053:	eb 0d                	jmp    1678062 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1ce>
 1678055:	49 89 c6             	mov    r14,rax
 1678058:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 167805d:	e8 48 88 05 00       	call   16d08aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84a16>
 1678062:	48 8d bc 24 d0 03 00 	lea    rdi,[rsp+0x3d0]
 1678069:	00 
 167806a:	e8 b5 b3 14 00       	call   17c3424 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177590>
 167806f:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
 1678073:	e8 18 83 05 00       	call   16d0390 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x844fc>
 1678078:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 167807f:	00 00 
 1678081:	48 3b 84 24 f0 03 00 	cmp    rax,QWORD PTR [rsp+0x3f0]
 1678088:	00 
 1678089:	75 08                	jne    1678093 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1ff>
 167808b:	4c 89 f7             	mov    rdi,r14
 167808e:	e8 3d 7c 3f ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 1678093:	e8 18 7a 17 00       	call   17efab0 <__stack_chk_fail@plt>
 1678098:	41 56                	push   r14
 167809a:	53                   	push   rbx
 167809b:	50                   	push   rax
 167809c:	48 89 f3             	mov    rbx,rsi
 167809f:	49 89 fe             	mov    r14,rdi
 16780a2:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
 16780a6:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 16780aa:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
 16780ad:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
 16780b0:	0f 57 c9             	xorps  xmm1,xmm1
 16780b3:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 16780b8:	0f 11 0e             	movups XMMWORD PTR [rsi],xmm1
 16780bb:	48 8b 46 28          	mov    rax,QWORD PTR [rsi+0x28]
 16780bf:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
 16780c3:	0f 10 46 18          	movups xmm0,XMMWORD PTR [rsi+0x18]
 16780c7:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0
 16780cb:	48 83 66 28 00       	and    QWORD PTR [rsi+0x28],0x0
 16780d0:	0f 11 4e 18          	movups XMMWORD PTR [rsi+0x18],xmm1
 16780d4:	48 8b 46 40          	mov    rax,QWORD PTR [rsi+0x40]
 16780d8:	48 89 47 40          	mov    QWORD PTR [rdi+0x40],rax
 16780dc:	0f 10 46 30          	movups xmm0,XMMWORD PTR [rsi+0x30]
 16780e0:	0f 11 47 30          	movups XMMWORD PTR [rdi+0x30],xmm0
 16780e4:	48 83 66 40 00       	and    QWORD PTR [rsi+0x40],0x0
 16780e9:	0f 11 4e 30          	movups XMMWORD PTR [rsi+0x30],xmm1
 16780ed:	48 8b 46 58          	mov    rax,QWORD PTR [rsi+0x58]
 16780f1:	48 89 47 58          	mov    QWORD PTR [rdi+0x58],rax
 16780f5:	0f 10 46 48          	movups xmm0,XMMWORD PTR [rsi+0x48]
 16780f9:	0f 11 47 48          	movups XMMWORD PTR [rdi+0x48],xmm0
 16780fd:	48 83 66 58 00       	and    QWORD PTR [rsi+0x58],0x0
 1678102:	0f 11 4e 48          	movups XMMWORD PTR [rsi+0x48],xmm1
 1678106:	48 8b 46 70          	mov    rax,QWORD PTR [rsi+0x70]
 167810a:	48 89 47 70          	mov    QWORD PTR [rdi+0x70],rax
 167810e:	0f 10 46 60          	movups xmm0,XMMWORD PTR [rsi+0x60]
 1678112:	0f 11 47 60          	movups XMMWORD PTR [rdi+0x60],xmm0
 1678116:	48 83 66 70 00       	and    QWORD PTR [rsi+0x70],0x0
 167811b:	0f 11 4e 60          	movups XMMWORD PTR [rsi+0x60],xmm1
 167811f:	48 8b 86 88 00 00 00 	mov    rax,QWORD PTR [rsi+0x88]
 1678126:	48 89 87 88 00 00 00 	mov    QWORD PTR [rdi+0x88],rax
 167812d:	0f 10 46 78          	movups xmm0,XMMWORD PTR [rsi+0x78]
 1678131:	0f 11 47 78          	movups XMMWORD PTR [rdi+0x78],xmm0
 1678135:	48 83 a6 88 00 00 00 	and    QWORD PTR [rsi+0x88],0x0
 167813c:	00 
 167813d:	0f 11 4e 78          	movups XMMWORD PTR [rsi+0x78],xmm1
 1678141:	be 90 00 00 00       	mov    esi,0x90
 1678146:	48 01 f7             	add    rdi,rsi
 1678149:	48 01 de             	add    rsi,rbx
 167814c:	e8 0f f7 42 ff       	call   aa7860 <JNI_OnUnload@@Base+0x2f12d>
 1678151:	48 8b 83 b8 00 00 00 	mov    rax,QWORD PTR [rbx+0xb8]
 1678158:	49 89 86 b8 00 00 00 	mov    QWORD PTR [r14+0xb8],rax
 167815f:	0f 10 83 a8 00 00 00 	movups xmm0,XMMWORD PTR [rbx+0xa8]
 1678166:	41 0f 11 86 a8 00 00 	movups XMMWORD PTR [r14+0xa8],xmm0
 167816d:	00 
 167816e:	0f 57 c0             	xorps  xmm0,xmm0
 1678171:	0f 11 83 a8 00 00 00 	movups XMMWORD PTR [rbx+0xa8],xmm0
 1678178:	48 83 a3 b8 00 00 00 	and    QWORD PTR [rbx+0xb8],0x0
 167817f:	00 
 1678180:	48 83 c4 08          	add    rsp,0x8
 1678184:	5b                   	pop    rbx
 1678185:	41 5e                	pop    r14
 1678187:	c3                   	ret
 1678188:	41 56                	push   r14
 167818a:	53                   	push   rbx
 167818b:	50                   	push   rax
 167818c:	49 89 f6             	mov    r14,rsi
 167818f:	48 89 fb             	mov    rbx,rdi
 1678192:	e8 97 38 40 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
 1678197:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
 167819b:	49 8d 76 18          	lea    rsi,[r14+0x18]
 167819f:	e8 8a 38 40 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
 16781a4:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
 16781a8:	49 8d 76 30          	lea    rsi,[r14+0x30]
 16781ac:	e8 7d 38 40 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
 16781b1:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
 16781b5:	49 8d 76 48          	lea    rsi,[r14+0x48]
 16781b9:	e8 70 38 40 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
 16781be:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
 16781c2:	49 8d 76 60          	lea    rsi,[r14+0x60]
 16781c6:	e8 63 38 40 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
 16781cb:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
 16781cf:	49 8d 76 78          	lea    rsi,[r14+0x78]
 16781d3:	e8 56 38 40 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
 16781d8:	be 90 00 00 00       	mov    esi,0x90
 16781dd:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
 16781e1:	4c 01 f6             	add    rsi,r14
 16781e4:	e8 bf 6e 72 ff       	call   d9f0a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6c12e>
 16781e9:	b8 a8 00 00 00       	mov    eax,0xa8
 16781ee:	48 8d 3c 03          	lea    rdi,[rbx+rax*1]
 16781f2:	49 01 c6             	add    r14,rax
 16781f5:	4c 89 f6             	mov    rsi,r14
 16781f8:	e8 31 38 40 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
 16781fd:	48 89 d8             	mov    rax,rbx
 1678200:	48 83 c4 08          	add    rsp,0x8
 1678204:	5b                   	pop    rbx
 1678205:	41 5e                	pop    r14
 1678207:	c3                   	ret
 1678208:	53                   	push   rbx
 1678209:	48 89 fb             	mov    rbx,rdi
 167820c:	48 81 c7 a8 00 00 00 	add    rdi,0xa8
 1678213:	e8 78 5c 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1678218:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
 167821f:	e8 bc bb 4b ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
 1678224:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
 1678228:	e8 63 5c 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 167822d:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
 1678231:	e8 5a 5c 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1678236:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
 167823a:	e8 51 5c 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 167823f:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
 1678243:	e8 48 5c 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1678248:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
 167824c:	e8 3f 5c 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1678251:	48 89 df             	mov    rdi,rbx
 1678254:	5b                   	pop    rbx
 1678255:	e9 36 5c 17 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 167825a:	55                   	push   rbp
 167825b:	41 57                	push   r15
 167825d:	41 56                	push   r14
 167825f:	41 55                	push   r13
 1678261:	41 54                	push   r12
 1678263:	53                   	push   rbx
 1678264:	50                   	push   rax
 1678265:	49 89 f5             	mov    r13,rsi
 1678268:	48 89 fb             	mov    rbx,rdi
 167826b:	e8 d0 5c 17 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 1678270:	4c 8d 73 18          	lea    r14,[rbx+0x18]
 1678274:	49 8d 75 18          	lea    rsi,[r13+0x18]
 1678278:	4c 89 f7             	mov    rdi,r14
 167827b:	e8 c0 5c 17 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 1678280:	4c 8d 7b 30          	lea    r15,[rbx+0x30]
 1678284:	49 8d 75 30          	lea    rsi,[r13+0x30]
 1678288:	4c 89 ff             	mov    rdi,r15
 167828b:	4c 89 34 24          	mov    QWORD PTR [rsp],r14
 167828f:	e8 ac 5c 17 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 1678294:	4c 8d 63 48          	lea    r12,[rbx+0x48]
 1678298:	49 8d 75 48          	lea    rsi,[r13+0x48]
 167829c:	4c 89 e7             	mov    rdi,r12
 167829f:	e8 9c 5c 17 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 16782a4:	48 8d 6b 60          	lea    rbp,[rbx+0x60]
 16782a8:	49 8d 75 60          	lea    rsi,[r13+0x60]
 16782ac:	48 89 ef             	mov    rdi,rbp
 16782af:	e8 8c 5c 17 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 16782b4:	4c 8d 73 78          	lea    r14,[rbx+0x78]
 16782b8:	49 8d 75 78          	lea    rsi,[r13+0x78]
 16782bc:	4c 89 f7             	mov    rdi,r14
 16782bf:	e8 7c 5c 17 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 16782c4:	be 90 00 00 00       	mov    esi,0x90
 16782c9:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
 16782cd:	4c 01 ee             	add    rsi,r13
 16782d0:	e8 af 14 4d ff       	call   b49784 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96724>
 16782d5:	b8 a8 00 00 00       	mov    eax,0xa8
 16782da:	48 8d 3c 03          	lea    rdi,[rbx+rax*1]
 16782de:	49 01 c5             	add    r13,rax
 16782e1:	4c 89 ee             	mov    rsi,r13
 16782e4:	e8 57 5c 17 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 16782e9:	48 83 c4 08          	add    rsp,0x8
 16782ed:	5b                   	pop    rbx
 16782ee:	41 5c                	pop    r12
 16782f0:	41 5d                	pop    r13
 16782f2:	41 5e                	pop    r14
 16782f4:	41 5f                	pop    r15
 16782f6:	5d                   	pop    rbp
 16782f7:	c3                   	ret
 16782f8:	49 89 c5             	mov    r13,rax
 16782fb:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
 1678302:	e8 d9 ba 4b ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
 1678307:	eb 03                	jmp    167830c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c478>
 1678309:	49 89 c5             	mov    r13,rax
 167830c:	4c 89 f7             	mov    rdi,r14
 167830f:	e8 7c 5b 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1678314:	eb 03                	jmp    1678319 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c485>
 1678316:	49 89 c5             	mov    r13,rax
 1678319:	48 89 ef             	mov    rdi,rbp
 167831c:	e8 6f 5b 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1678321:	eb 03                	jmp    1678326 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c492>
 1678323:	49 89 c5             	mov    r13,rax
 1678326:	4c 89 e7             	mov    rdi,r12
 1678329:	e8 62 5b 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 167832e:	eb 03                	jmp    1678333 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c49f>
 1678330:	49 89 c5             	mov    r13,rax
 1678333:	4c 89 ff             	mov    rdi,r15
 1678336:	e8 55 5b 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 167833b:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
 167833f:	e8 4c 5b 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1678344:	48 89 df             	mov    rdi,rbx
 1678347:	e8 44 5b 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 167834c:	4c 89 ef             	mov    rdi,r13
 167834f:	e8 7c 79 3f ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 1678354:	49 89 c5             	mov    r13,rax
 1678357:	eb e2                	jmp    167833b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c4a7>
 1678359:	49 89 c5             	mov    r13,rax
 167835c:	eb e6                	jmp    1678344 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c4b0>
 167835e:	41 56                	push   r14
 1678360:	53                   	push   rbx
 1678361:	50                   	push   rax
 1678362:	49 89 f6             	mov    r14,rsi
 1678365:	48 89 fb             	mov    rbx,rdi
 1678368:	e8 13 5d 17 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 167836d:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
 1678371:	49 8d 76 18          	lea    rsi,[r14+0x18]
 1678375:	e8 06 5d 17 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 167837a:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
 167837e:	49 8d 76 30          	lea    rsi,[r14+0x30]
 1678382:	e8 f9 5c 17 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 1678387:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
 167838b:	49 8d 76 48          	lea    rsi,[r14+0x48]
 167838f:	e8 ec 5c 17 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 1678394:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
 1678398:	49 8d 76 60          	lea    rsi,[r14+0x60]
 167839c:	e8 df 5c 17 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 16783a1:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
 16783a5:	49 8d 76 78          	lea    rsi,[r14+0x78]
 16783a9:	e8 d2 5c 17 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 16783ae:	be 90 00 00 00       	mov    esi,0x90
 16783b3:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
 16783b7:	4c 01 f6             	add    rsi,r14
 16783ba:	e8 d5 aa 7b ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 16783bf:	b8 a8 00 00 00       	mov    eax,0xa8
 16783c4:	48 8d 3c 03          	lea    rdi,[rbx+rax*1]
 16783c8:	49 01 c6             	add    r14,rax
 16783cb:	4c 89 f6             	mov    rsi,r14
 16783ce:	e8 ad 5c 17 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 16783d3:	48 89 d8             	mov    rax,rbx
 16783d6:	48 83 c4 08          	add    rsp,0x8
 16783da:	5b                   	pop    rbx
 16783db:	41 5e                	pop    r14
 16783dd:	c3                   	ret
 16783de:	41 56                	push   r14
 16783e0:	53                   	push   rbx
 16783e1:	50                   	push   rax
 16783e2:	48 89 fb             	mov    rbx,rdi
 16783e5:	0f 57 c0             	xorps  xmm0,xmm0
 16783e8:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
 16783eb:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 16783f0:	6a 10                	push   0x10
 16783f2:	5a                   	pop    rdx
 16783f3:	e8 c5 3b 16 00       	call   17dbfbd <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7dde>
 16783f8:	48 83 c4 08          	add    rsp,0x8
 16783fc:	5b                   	pop    rbx
 16783fd:	41 5e                	pop    r14
 16783ff:	c3                   	ret

## switch-to-video direct xrefs
  ec8e98:	41 80 bf 30 09 00 00 	cmp    BYTE PTR [r15+0x930],0x0
  ec8e9f:	00 
  ec8ea0:	74 1a                	je     ec8ebc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x902d2>
  ec8ea2:	49 81 c7 c0 04 00 00 	add    r15,0x4c0
  ec8ea9:	49 8d b6 20 02 00 00 	lea    rsi,[r14+0x220]
  ec8eb0:	4c 89 ff             	mov    rdi,r15
  ec8eb3:	e8 36 68 bd ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
  ec8eb8:	84 c0                	test   al,al
  ec8eba:	75 47                	jne    ec8f03 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90319>
  ec8ebc:	4d 8b a6 d8 01 00 00 	mov    r12,QWORD PTR [r14+0x1d8]
  ec8ec3:	4d 85 e4             	test   r12,r12
  ec8ec6:	74 3b                	je     ec8f03 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90319>
  ec8ec8:	49 83 7c 24 20 00    	cmp    QWORD PTR [r12+0x20],0x0
  ec8ece:	74 33                	je     ec8f03 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90319>
  ec8ed0:	41 c6 86 1a 02 00 00 	mov    BYTE PTR [r14+0x21a],0x1
  ec8ed7:	01 
  ec8ed8:	48 8d 35 42 e8 4b ff 	lea    rsi,[rip+0xffffffffff4be842]        # 387721 <_ZTSSt12bad_any_cast@@Base-0x8aa7>
  ec8edf:	4c 8d 7c 24 50       	lea    r15,[rsp+0x50]
  ec8ee4:	4c 89 ff             	mov    rdi,r15
  ec8ee7:	e8 92 0b bb ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  ec8eec:	49 8b 7c 24 20       	mov    rdi,QWORD PTR [r12+0x20]
  ec8ef1:	4c 89 fe             	mov    rsi,r15
  ec8ef4:	e8 97 4e bf ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
  ec8ef9:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  ec8efe:	e8 8d 4f 92 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  ec8f03:	4c 8d 3d 38 e8 4b ff 	lea    r15,[rip+0xffffffffff4be838]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
  ec8f0a:	4c 8d 64 24 50       	lea    r12,[rsp+0x50]
  ec8f0f:	4c 89 e7             	mov    rdi,r12
  ec8f12:	4c 89 fe             	mov    rsi,r15
  ec8f15:	e8 64 0b bb ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  ec8f1a:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  ec8f1d:	4c 89 e6             	mov    rsi,r12
  ec8f20:	e8 1d 2b 7a 00       	call   166ba42 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fbae>
  ec8f25:	4c 89 e7             	mov    rdi,r12
  ec8f28:	e8 63 4f 92 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  ec8f2d:	48 8d 35 ed e7 4b ff 	lea    rsi,[rip+0xffffffffff4be7ed]        # 387721 <_ZTSSt12bad_any_cast@@Base-0x8aa7>
  ec8f34:	4c 8d 64 24 50       	lea    r12,[rsp+0x50]
  ec8f39:	4c 89 e7             	mov    rdi,r12
  ec8f3c:	e8 3d 0b bb ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  ec8f41:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  ec8f44:	4c 89 e6             	mov    rsi,r12
  ec8f47:	e8 f6 2a 7a 00       	call   166ba42 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fbae>
  ec8f4c:	4c 89 e7             	mov    rdi,r12
  ec8f4f:	e8 3c 4f 92 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  ec8f54:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  ec8f59:	4c 89 fe             	mov    rsi,r15
  ec8f5c:	e8 1d 0b bb ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  ec8f61:	49 8b 86 08 02 00 00 	mov    rax,QWORD PTR [r14+0x208]
  ec8f68:	48 85 c0             	test   rax,rax
  ec8f6b:	0f 84 a8 00 00 00    	je     ec9019 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9042f>
  ec8f71:	83 78 1c 03          	cmp    DWORD PTR [rax+0x1c],0x3
  ec8f75:	0f 85 9e 00 00 00    	jne    ec9019 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9042f>
  ec8f7b:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
  ec8f7f:	83 78 1c 01          	cmp    DWORD PTR [rax+0x1c],0x1
  ec8f83:	0f 85 90 00 00 00    	jne    ec9019 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9042f>
  ec8f89:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
  ec8f8d:	4c 8b 78 18          	mov    r15,QWORD PTR [rax+0x18]
  ec8f91:	49 83 e7 fc          	and    r15,0xfffffffffffffffc
  ec8f95:	4d 8b b6 d0 01 00 00 	mov    r14,QWORD PTR [r14+0x1d0]
  ec8f9c:	48 8d 35 bb 16 4a ff 	lea    rsi,[rip+0xffffffffff4a16bb]        # 36a65e <_ZTSSt12bad_any_cast@@Base-0x25b6a>
  ec8fa3:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  ec8fa8:	4c 89 fa             	mov    rdx,r15
  ec8fab:	e8 c0 55 92 00       	call   17ee570 <_ZNSt6__ndk1plIcNS_11char_traitsIcEENS_9allocatorIcEEEENS_12basic_stringIT_T0_T1_EEPKS6_RKS9_@plt>
  ec8fb0:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  ec8fb3:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  ec8fb6:	4c 8d 74 24 50       	lea    r14,[rsp+0x50]
  ec8fbb:	4c 8d 64 24 38       	lea    r12,[rsp+0x38]
  ec8fc0:	4c 89 f7             	mov    rdi,r14
  ec8fc3:	4c 89 e2             	mov    rdx,r12
  ec8fc6:	ff 50 18             	call   QWORD PTR [rax+0x18]
  ec8fc9:	4c 89 e7             	mov    rdi,r12
  ec8fcc:	e8 bf 4e 92 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  ec8fd1:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
  ec8fd6:	0f 84 2d 01 00 00    	je     ec9109 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9051f>
  ec8fdc:	48 8d 35 9a 8f 58 ff 	lea    rsi,[rip+0xffffffffff588f9a]        # 451f7d <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b89>
  ec8fe3:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  ec8fe8:	e8 62 28 bb ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  ec8fed:	84 c0                	test   al,al
  ec8fef:	0f 84 14 01 00 00    	je     ec9109 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9051f>
  ec8ff5:	8a 05 f5 b7 b2 00    	mov    al,BYTE PTR [rip+0xb2b7f5]        # 19f47f0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x28af>
  ec8ffb:	84 c0                	test   al,al
  ec8ffd:	0f 84 4e 01 00 00    	je     ec9151 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90567>
  ec9003:	48 8d 35 ce b7 b2 00 	lea    rsi,[rip+0xb2b7ce]        # 19f47d8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2897>
  ec900a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  ec900f:	e8 2c 4f 92 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  ec9014:	e9 29 01 00 00       	jmp    ec9142 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90558>
  ec9019:	48 8d 35 d0 cb b1 00 	lea    rsi,[rip+0xb1cbd0]        # 19e5bf0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1e0>
  ec9020:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  ec9025:	e8 16 4f 92 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  ec902a:	bf 28 0d 00 00       	mov    edi,0xd28
  ec902f:	48 03 3b             	add    rdi,QWORD PTR [rbx]
  ec9032:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
  ec9037:	e8 74 76 f6 ff       	call   e306b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfd736>
  ec903c:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
  ec9041:	48 89 c7             	mov    rdi,rax
  ec9044:	e8 c7 05 c8 ff       	call   b49610 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x965b0>
  ec9049:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  ec904e:	e8 3d 4e 92 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  ec9053:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  ec9058:	e8 33 4e 92 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  ec905d:	48 8d 35 c1 8b 58 ff 	lea    rsi,[rip+0xffffffffff588bc1]        # 451c25 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17831>
  ec9064:	4c 8d 74 24 50       	lea    r14,[rsp+0x50]
  ec9069:	4c 89 f7             	mov    rdi,r14
  ec906c:	e8 0d 0a bb ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  ec9071:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  ec9074:	48 8d 35 dd 94 b2 00 	lea    rsi,[rip+0xb294dd]        # 19f2558 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x617>
  ec907b:	4c 89 f2             	mov    rdx,r14
  ec907e:	e8 b1 27 7a 00       	call   166b834 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f9a0>
  ec9083:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  ec9088:	e8 03 4e 92 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  ec908d:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  ec9090:	48 8d 35 19 30 57 ff 	lea    rsi,[rip+0xffffffffff573019]        # 43c0b0 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1cbc>
  ec9097:	48 8d 15 42 30 57 ff 	lea    rdx,[rip+0xffffffffff573042]        # 43c0e0 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1cec>
  ec909e:	e8 91 27 7a 00       	call   166b834 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f9a0>
  ec90a3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ec90aa:	00 00 
--
  f871ba:	89 e9                	mov    ecx,ebp
  f871bc:	f6 d1                	not    cl
  f871be:	84 c1                	test   cl,al
  f871c0:	75 49                	jne    f8720b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e621>
  f871c2:	4c 89 f7             	mov    rdi,r14
  f871c5:	e8 a0 63 00 00       	call   f8d56a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x154980>
  f871ca:	84 c0                	test   al,al
  f871cc:	75 3d                	jne    f8720b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e621>
  f871ce:	41 80 be 48 04 00 00 	cmp    BYTE PTR [r14+0x448],0x0
  f871d5:	00 
  f871d6:	75 33                	jne    f8720b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e621>
  f871d8:	48 8d 35 42 05 40 ff 	lea    rsi,[rip+0xffffffffff400542]        # 387721 <_ZTSSt12bad_any_cast@@Base-0x8aa7>
  f871df:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  f871e4:	e8 95 28 af ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  f871e9:	48 8d bb 40 03 00 00 	lea    rdi,[rbx+0x340]
  f871f0:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
  f871f5:	e8 92 03 f7 ff       	call   ef758c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe9a2>
  f871fa:	48 8d 35 2f 5e 4b ff 	lea    rsi,[rip+0xffffffffff4b5e2f]        # 43d030 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2c3c>
  f87201:	48 89 c7             	mov    rdi,rax
  f87204:	e8 07 24 bc ff       	call   b49610 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x965b0>
  f87209:	eb 98                	jmp    f871a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e5b9>
  f8720b:	4c 89 f7             	mov    rdi,r14
  f8720e:	e8 3d 5f 00 00       	call   f8d150 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x154566>
  f87213:	84 c0                	test   al,al
  f87215:	74 3b                	je     f87252 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e668>
  f87217:	48 8d 35 24 05 40 ff 	lea    rsi,[rip+0xffffffffff400524]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
  f8721e:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  f87223:	e8 56 28 af ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  f87228:	48 8d bb 40 03 00 00 	lea    rdi,[rbx+0x340]
  f8722f:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
  f87234:	e8 53 03 f7 ff       	call   ef758c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe9a2>
  f87239:	48 8d 35 60 60 4b ff 	lea    rsi,[rip+0xffffffffff4b6060]        # 43d2a0 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2eac>
  f87240:	48 89 c7             	mov    rdi,rax
  f87243:	e8 c8 23 bc ff       	call   b49610 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x965b0>
  f87248:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  f8724d:	e8 3e 6c 86 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  f87252:	41 80 be 8b 04 00 00 	cmp    BYTE PTR [r14+0x48b],0x0
  f87259:	00 
  f8725a:	0f 84 79 01 00 00    	je     f873d9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e7ef>
  f87260:	4d 8d be c0 00 00 00 	lea    r15,[r14+0xc0]
  f87267:	41 80 be d8 00 00 00 	cmp    BYTE PTR [r14+0xd8],0x0
  f8726e:	00 
  f8726f:	0f 84 e6 00 00 00    	je     f8735b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e771>
  f87275:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  f8727a:	4c 89 fe             	mov    rsi,r15
  f8727d:	e8 be 6c 86 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  f87282:	4d 8b 7e 38          	mov    r15,QWORD PTR [r14+0x38]
  f87286:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  f8728d:	00 
  f8728e:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
  f87293:	e8 a8 6c 86 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  f87298:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  f8729d:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
  f872a4:	00 
  f872a5:	6a 01                	push   0x1
  f872a7:	5a                   	pop    rdx
  f872a8:	e8 ab 01 b2 ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  f872ad:	48 8d 35 44 f0 3c ff 	lea    rsi,[rip+0xffffffffff3cf044]        # 3562f8 <_ZTSSt12bad_any_cast@@Base-0x39ed0>
  f872b4:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  f872b9:	e8 c0 27 af ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  f872be:	49 89 e1             	mov    r9,rsp
  f872c1:	41 c6 01 00          	mov    BYTE PTR [r9],0x0
  f872c5:	41 83 61 04 00       	and    DWORD PTR [r9+0x4],0x0
  f872ca:	49 8b 07             	mov    rax,QWORD PTR [r15]
  f872cd:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  f872d2:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
  f872d7:	6a 01                	push   0x1
  f872d9:	59                   	pop    rcx
  f872da:	4c 8d 44 24 08       	lea    r8,[rsp+0x8]
  f872df:	4c 89 fe             	mov    rsi,r15
  f872e2:	ff 90 60 01 00 00    	call   QWORD PTR [rax+0x160]
  f872e8:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  f872ed:	e8 9e 6b 86 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  f872f2:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  f872f7:	e8 ec 42 af ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
  f872fc:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  f87303:	00 
  f87304:	e8 87 6b 86 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  f87309:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
  f8730e:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
  f87313:	0f 84 ac 00 00 00    	je     f873c5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e7db>
  f87319:	80 38 00             	cmp    BYTE PTR [rax],0x0
  f8731c:	0f 85 a3 00 00 00    	jne    f873c5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e7db>
  f87322:	83 78 04 02          	cmp    DWORD PTR [rax+0x4],0x2
  f87326:	75 62                	jne    f8738a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e7a0>
  f87328:	48 8d 35 13 04 40 ff 	lea    rsi,[rip+0xffffffffff400413]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
  f8732f:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  f87334:	e8 45 27 af ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  f87339:	48 8d bb 40 03 00 00 	lea    rdi,[rbx+0x340]
  f87340:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
  f87345:	e8 42 02 f7 ff       	call   ef758c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe9a2>
  f8734a:	48 8d 35 e7 5d 4b ff 	lea    rsi,[rip+0xffffffffff4b5de7]        # 43d138 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2d44>
  f87351:	48 89 c7             	mov    rdi,rax
  f87354:	e8 b7 22 bc ff       	call   b49610 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x965b0>
  f87359:	eb 60                	jmp    f873bb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e7d1>
  f8735b:	41 80 be 8c 04 00 00 	cmp    BYTE PTR [r14+0x48c],0x0
  f87362:	00 
  f87363:	74 74                	je     f873d9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e7ef>
  f87365:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
  f8736a:	4c 89 f7             	mov    rdi,r14
  f8736d:	4c 89 e6             	mov    rsi,r12
  f87370:	e8 71 59 00 00       	call   f8cce6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1540fc>
  f87375:	84 c0                	test   al,al
  f87377:	74 60                	je     f873d9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e7ef>
  f87379:	41 80 be d8 00 00 00 	cmp    BYTE PTR [r14+0xd8],0x0
  f87380:	00 
  f87381:	4d 0f 44 fc          	cmove  r15,r12
  f87385:	e9 eb fe ff ff       	jmp    f87275 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e68b>
  f8738a:	48 8d 35 b1 03 40 ff 	lea    rsi,[rip+0xffffffffff4003b1]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
  f87391:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  f87396:	e8 e3 26 af ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  f8739b:	48 8d bb 40 03 00 00 	lea    rdi,[rbx+0x340]
  f873a2:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
  f873a7:	e8 e0 01 f7 ff       	call   ef758c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe9a2>
  f873ac:	48 8d 35 9d 5d 4b ff 	lea    rsi,[rip+0xffffffffff4b5d9d]        # 43d150 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2d5c>
  f873b3:	48 89 c7             	mov    rdi,rax
  f873b6:	e8 55 22 bc ff       	call   b49610 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x965b0>
  f873bb:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  f873c0:	e8 cb 6a 86 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  f873c5:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  f873ca:	e8 3b 32 f9 ff       	call   f1a60a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe1a20>
  f873cf:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  f873d4:	e8 b7 6a 86 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  f873d9:	41 80 be d8 00 00 00 	cmp    BYTE PTR [r14+0xd8],0x0
  f873e0:	00 
  f873e1:	75 16                	jne    f873f9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e80f>
  f873e3:	4c 89 f7             	mov    rdi,r14
  f873e6:	e8 7f 61 00 00       	call   f8d56a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x154980>
  f873eb:	84 c0                	test   al,al
  f873ed:	74 53                	je     f87442 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e858>
  f873ef:	41 80 be 48 04 00 00 	cmp    BYTE PTR [r14+0x448],0x0
  f873f6:	00 
  f873f7:	74 49                	je     f87442 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e858>
  f873f9:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
  f873fd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  f87400:	ff 50 10             	call   QWORD PTR [rax+0x10]
  f87403:	85 c0                	test   eax,eax
  f87405:	75 3b                	jne    f87442 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e858>
  f87407:	48 8d 35 34 03 40 ff 	lea    rsi,[rip+0xffffffffff400334]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
  f8740e:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  f87413:	e8 66 26 af ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  f87418:	48 8d bb 40 03 00 00 	lea    rdi,[rbx+0x340]
  f8741f:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
  f87424:	e8 63 01 f7 ff       	call   ef758c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe9a2>
  f87429:	48 8d 35 a0 5e 4b ff 	lea    rsi,[rip+0xffffffffff4b5ea0]        # 43d2d0 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2edc>
  f87430:	48 89 c7             	mov    rdi,rax
  f87433:	e8 d8 21 bc ff       	call   b49610 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x965b0>
  f87438:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  f8743d:	e8 4e 6a 86 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  f87442:	41 80 be d8 00 00 00 	cmp    BYTE PTR [r14+0xd8],0x0
  f87449:	00 
  f8744a:	0f 84 f7 00 00 00    	je     f87547 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e95d>
  f87450:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
  f87454:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  f87457:	ff 50 20             	call   QWORD PTR [rax+0x20]
  f8745a:	84 c0                	test   al,al
  f8745c:	74 53                	je     f874b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e8c7>
  f8745e:	49 8b be c0 04 00 00 	mov    rdi,QWORD PTR [r14+0x4c0]
  f87465:	e8 f8 2f af ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
  f8746a:	84 c0                	test   al,al
  f8746c:	75 43                	jne    f874b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e8c7>
  f8746e:	48 8d 35 cd 02 40 ff 	lea    rsi,[rip+0xffffffffff4002cd]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
  f87475:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  f8747a:	e8 ff 25 af ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  f8747f:	48 8d bb 40 03 00 00 	lea    rdi,[rbx+0x340]
  f87486:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
  f8748b:	e8 fc 00 f7 ff       	call   ef758c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe9a2>
  f87490:	49 89 c7             	mov    r15,rax
  f87493:	e8 37 28 6f 00       	call   1679ccf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2de3b>
  f87498:	48 8d 35 f9 d2 a6 00 	lea    rsi,[rip+0xa6d2f9]        # 19f4798 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2857>
  f8749f:	4c 89 ff             	mov    rdi,r15
  f874a2:	e8 69 21 bc ff       	call   b49610 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x965b0>
  f874a7:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  f874ac:	e8 df 69 86 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  f874b1:	41 80 be 00 01 00 00 	cmp    BYTE PTR [r14+0x100],0x0
  f874b8:	00 
  f874b9:	74 43                	je     f874fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e914>
  f874bb:	48 8d 35 80 02 40 ff 	lea    rsi,[rip+0xffffffffff400280]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
  f874c2:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  f874c7:	e8 b2 25 af ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  f874cc:	48 8d bb 40 03 00 00 	lea    rdi,[rbx+0x340]
  f874d3:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
  f874d8:	e8 af 00 f7 ff       	call   ef758c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe9a2>
  f874dd:	49 89 c7             	mov    r15,rax
  f874e0:	e8 7c 27 6f 00       	call   1679c61 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ddcd>
  f874e5:	48 8d 35 8c d2 a6 00 	lea    rsi,[rip+0xa6d28c]        # 19f4778 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2837>
  f874ec:	4c 89 ff             	mov    rdi,r15
  f874ef:	e8 1c 21 bc ff       	call   b49610 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x965b0>
  f874f4:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  f874f9:	e8 92 69 86 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  f874fe:	41 80 be 28 05 00 00 	cmp    BYTE PTR [r14+0x528],0x0
  f87505:	00 
  f87506:	0f 85 9c 00 00 00    	jne    f875a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e9be>
  f8750c:	48 8d 35 2f 02 40 ff 	lea    rsi,[rip+0xffffffffff40022f]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
  f87513:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  f87518:	e8 61 25 af ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  f8751d:	48 8d bb 40 03 00 00 	lea    rdi,[rbx+0x340]
  f87524:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
  f87529:	e8 5e 00 f7 ff       	call   ef758c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe9a2>
  f8752e:	49 89 c7             	mov    r15,rax
  f87531:	e8 99 27 6f 00       	call   1679ccf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2de3b>
  f87536:	48 8d 35 5b d2 a6 00 	lea    rsi,[rip+0xa6d25b]        # 19f4798 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2857>
  f8753d:	4c 89 ff             	mov    rdi,r15
  f87540:	e8 cb 20 bc ff       	call   b49610 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x965b0>
  f87545:	eb 57                	jmp    f8759e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e9b4>
  f87547:	41 80 be e8 03 00 00 	cmp    BYTE PTR [r14+0x3e8],0x0
  f8754e:	00 
  f8754f:	0f 95 c0             	setne  al
  f87552:	40 84 c5             	test   bpl,al
  f87555:	75 51                	jne    f875a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e9be>
  f87557:	4c 89 f7             	mov    rdi,r14
  f8755a:	e8 0b 60 00 00       	call   f8d56a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x154980>
  f8755f:	84 c0                	test   al,al
  f87561:	74 0a                	je     f8756d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e983>
  f87563:	41 80 be 48 04 00 00 	cmp    BYTE PTR [r14+0x448],0x0
  f8756a:	00 
  f8756b:	75 3b                	jne    f875a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e9be>
  f8756d:	48 8d 35 ce 01 40 ff 	lea    rsi,[rip+0xffffffffff4001ce]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
  f87574:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  f87579:	e8 00 25 af ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  f8757e:	48 8d bb 40 03 00 00 	lea    rdi,[rbx+0x340]
  f87585:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
  f8758a:	e8 fd ff f6 ff       	call   ef758c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe9a2>
  f8758f:	48 8d 35 9a 5a 4b ff 	lea    rsi,[rip+0xffffffffff4b5a9a]        # 43d030 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2c3c>
  f87596:	48 89 c7             	mov    rdi,rax
  f87599:	e8 72 20 bc ff       	call   b49610 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x965b0>
  f8759e:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  f875a3:	e8 e8 68 86 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  f875a8:	4c 89 f7             	mov    rdi,r14
  f875ab:	e8 ba 5f 00 00       	call   f8d56a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x154980>
  f875b0:	84 c0                	test   al,al
  f875b2:	74 61                	je     f87615 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ea2b>
  f875b4:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
  f875b8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  f875bb:	ff 50 20             	call   QWORD PTR [rax+0x20]
  f875be:	84 c0                	test   al,al
  f875c0:	74 53                	je     f87615 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ea2b>
  f875c2:	49 8b be c0 04 00 00 	mov    rdi,QWORD PTR [r14+0x4c0]
  f875c9:	e8 94 2e af ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
  f875ce:	84 c0                	test   al,al
  f875d0:	75 43                	jne    f87615 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ea2b>
  f875d2:	48 8d 35 69 01 40 ff 	lea    rsi,[rip+0xffffffffff400169]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
  f875d9:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  f875de:	e8 9b 24 af ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  f875e3:	48 8d bb 40 03 00 00 	lea    rdi,[rbx+0x340]
  f875ea:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
  f875ef:	e8 98 ff f6 ff       	call   ef758c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe9a2>
  f875f4:	49 89 c6             	mov    r14,rax
  f875f7:	e8 d3 26 6f 00       	call   1679ccf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2de3b>
  f875fc:	48 8d 35 95 d1 a6 00 	lea    rsi,[rip+0xa6d195]        # 19f4798 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2857>
  f87603:	4c 89 f7             	mov    rdi,r14
  f87606:	e8 05 20 bc ff       	call   b49610 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x965b0>
  f8760b:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  f87610:	e8 7b 68 86 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  f87615:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
  f8761a:	e8 61 dd f7 ff       	call   f05380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc796>
  f8761f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  f87626:	00 00 
  f87628:	48 3b 84 24 78 01 00 	cmp    rax,QWORD PTR [rsp+0x178]
  f8762f:	00 
  f87630:	0f 85 ca 00 00 00    	jne    f87700 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eb16>
  f87636:	48 89 d8             	mov    rax,rbx
  f87639:	48 81 c4 80 01 00 00 	add    rsp,0x180
  f87640:	5b                   	pop    rbx
  f87641:	41 5c                	pop    r12
  f87643:	41 5e                	pop    r14
  f87645:	41 5f                	pop    r15
  f87647:	5d                   	pop    rbp
  f87648:	c3                   	ret
  f87649:	eb 00                	jmp    f8764b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ea61>
  f8764b:	49 89 c6             	mov    r14,rax
  f8764e:	eb 13                	jmp    f87663 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ea79>
  f87650:	eb 7e                	jmp    f876d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eae6>
  f87652:	eb 7c                	jmp    f876d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eae6>
  f87654:	eb 00                	jmp    f87656 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ea6c>
  f87656:	49 89 c6             	mov    r14,rax
  f87659:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  f8765e:	e8 2d 68 86 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  f87663:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  f87668:	e8 9d 2f f9 ff       	call   f1a60a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe1a20>
  f8766d:	eb 55                	jmp    f876c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eada>
  f8766f:	eb 5f                	jmp    f876d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eae6>
  f87671:	eb 5d                	jmp    f876d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eae6>
  f87673:	eb 4c                	jmp    f876c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ead7>
  f87675:	eb 4a                	jmp    f876c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ead7>
  f87677:	eb 57                	jmp    f876d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eae6>
  f87679:	eb 55                	jmp    f876d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eae6>
  f8767b:	eb 44                	jmp    f876c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ead7>
  f8767d:	eb 51                	jmp    f876d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eae6>
  f8767f:	eb 4f                	jmp    f876d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eae6>
  f87681:	49 89 c6             	mov    r14,rax
  f87684:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  f87689:	e8 02 68 86 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  f8768e:	eb 03                	jmp    f87693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eaa9>
  f87690:	49 89 c6             	mov    r14,rax
  f87693:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  f87698:	e8 4b 3f af ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
  f8769d:	eb 03                	jmp    f876a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eab8>
  f8769f:	49 89 c6             	mov    r14,rax
  f876a2:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  f876a9:	00 
  f876aa:	e8 e1 67 86 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  f876af:	eb 13                	jmp    f876c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eada>
  f876b1:	eb 0e                	jmp    f876c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ead7>
  f876b3:	eb 1b                	jmp    f876d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eae6>
  f876b5:	eb 0a                	jmp    f876c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ead7>
  f876b7:	eb 17                	jmp    f876d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eae6>
  f876b9:	eb 06                	jmp    f876c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ead7>
  f876bb:	eb 04                	jmp    f876c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ead7>
  f876bd:	eb 02                	jmp    f876c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ead7>
  f876bf:	eb 00                	jmp    f876c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ead7>
  f876c1:	49 89 c6             	mov    r14,rax
  f876c4:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  f876c9:	e8 c2 67 86 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  f876ce:	eb 03                	jmp    f876d3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eae9>
  f876d0:	49 89 c6             	mov    r14,rax
  f876d3:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
  f876d8:	e8 a3 dc f7 ff       	call   f05380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc796>
  f876dd:	48 89 df             	mov    rdi,rbx
  f876e0:	e8 47 a4 74 00       	call   16d1b2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85c98>
  f876e5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  f876ec:	00 00 
  f876ee:	48 3b 84 24 78 01 00 	cmp    rax,QWORD PTR [rsp+0x178]
  f876f5:	00 
  f876f6:	75 08                	jne    f87700 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eb16>
  f876f8:	4c 89 f7             	mov    rdi,r14
  f876fb:	e8 d0 85 ae ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  f87700:	e8 ab 83 86 00       	call   17efab0 <__stack_chk_fail@plt>
  f87705:	49 89 c6             	mov    r14,rax
  f87708:	eb d3                	jmp    f876dd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eaf3>
  f8770a:	41 56                	push   r14
  f8770c:	53                   	push   rbx
--
  f878e4:	e8 43 c1 d9 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
  f878e9:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
  f878f0:	00 
  f878f1:	e8 9a 65 86 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  f878f6:	4c 89 f7             	mov    rdi,r14
  f878f9:	e8 6c 5c 00 00       	call   f8d56a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x154980>
  f878fe:	84 c0                	test   al,al
  f87900:	0f 84 98 00 00 00    	je     f8799e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14edb4>
  f87906:	41 80 be 48 04 00 00 	cmp    BYTE PTR [r14+0x448],0x0
  f8790d:	00 
  f8790e:	74 5d                	je     f8796d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ed83>
  f87910:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
  f87914:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  f87917:	ff 50 10             	call   QWORD PTR [rax+0x10]
  f8791a:	85 c0                	test   eax,eax
  f8791c:	0f 84 a1 01 00 00    	je     f87ac3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eed9>
  f87922:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
  f87926:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  f87929:	ff 50 20             	call   QWORD PTR [rax+0x20]
  f8792c:	84 c0                	test   al,al
  f8792e:	74 14                	je     f87944 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ed5a>
  f87930:	49 8b be c0 04 00 00 	mov    rdi,QWORD PTR [r14+0x4c0]
  f87937:	e8 26 2b af ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
  f8793c:	84 c0                	test   al,al
  f8793e:	0f 84 7f 01 00 00    	je     f87ac3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eed9>
  f87944:	48 8d 35 f7 fd 3f ff 	lea    rsi,[rip+0xffffffffff3ffdf7]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
  f8794b:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
  f87952:	00 
  f87953:	e8 26 21 af ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  f87958:	48 8d b4 24 f8 00 00 	lea    rsi,[rsp+0xf8]
  f8795f:	00 
  f87960:	48 89 df             	mov    rdi,rbx
  f87963:	e8 c4 c0 d9 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
  f87968:	e9 49 01 00 00       	jmp    f87ab6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eecc>
  f8796d:	48 8d 35 ad fd 3f ff 	lea    rsi,[rip+0xffffffffff3ffdad]        # 387721 <_ZTSSt12bad_any_cast@@Base-0x8aa7>
  f87974:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
  f8797b:	00 
  f8797c:	e8 fd 20 af ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  f87981:	48 8d b4 24 f8 00 00 	lea    rsi,[rsp+0xf8]
  f87988:	00 
  f87989:	48 89 df             	mov    rdi,rbx
  f8798c:	e8 9b c0 d9 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
  f87991:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
  f87998:	00 
  f87999:	e8 f2 64 86 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  f8799e:	41 80 be e8 03 00 00 	cmp    BYTE PTR [r14+0x3e8],0x0
  f879a5:	00 
  f879a6:	74 51                	je     f879f9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ee0f>
  f879a8:	49 8d b6 f8 02 00 00 	lea    rsi,[r14+0x2f8]
  f879af:	49 8b 7e 50          	mov    rdi,QWORD PTR [r14+0x50]
  f879b3:	e8 50 34 00 00       	call   f8ae08 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15221e>
  f879b8:	89 c5                	mov    ebp,eax
  f879ba:	84 c0                	test   al,al
  f879bc:	75 3d                	jne    f879fb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ee11>
  f879be:	41 80 be e8 03 00 00 	cmp    BYTE PTR [r14+0x3e8],0x0
  f879c5:	00 
  f879c6:	74 33                	je     f879fb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ee11>
  f879c8:	48 8d 35 52 fd 3f ff 	lea    rsi,[rip+0xffffffffff3ffd52]        # 387721 <_ZTSSt12bad_any_cast@@Base-0x8aa7>
  f879cf:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
  f879d6:	00 
  f879d7:	e8 a2 20 af ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  f879dc:	48 8d b4 24 f8 00 00 	lea    rsi,[rsp+0xf8]
  f879e3:	00 
  f879e4:	48 89 df             	mov    rdi,rbx
  f879e7:	e8 40 c0 d9 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
  f879ec:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
  f879f3:	00 
  f879f4:	e8 97 64 86 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  f879f9:	31 ed                	xor    ebp,ebp
  f879fb:	4c 89 f7             	mov    rdi,r14
  f879fe:	e8 4d 57 00 00       	call   f8d150 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x154566>
  f87a03:	84 c0                	test   al,al
  f87a05:	0f 85 b8 00 00 00    	jne    f87ac3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eed9>
  f87a0b:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
  f87a0f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  f87a12:	ff 50 10             	call   QWORD PTR [rax+0x10]
  f87a15:	85 c0                	test   eax,eax
  f87a17:	0f 84 a6 00 00 00    	je     f87ac3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eed9>
  f87a1d:	41 80 be e8 03 00 00 	cmp    BYTE PTR [r14+0x3e8],0x0
  f87a24:	00 
  f87a25:	0f 94 c0             	sete   al
  f87a28:	40 80 f5 01          	xor    bpl,0x1
  f87a2c:	40 08 c5             	or     bpl,al
  f87a2f:	75 3f                	jne    f87a70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ee86>
  f87a31:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
  f87a35:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  f87a38:	ff 50 20             	call   QWORD PTR [rax+0x20]
  f87a3b:	84 c0                	test   al,al
  f87a3d:	75 31                	jne    f87a70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ee86>
  f87a3f:	48 8d 35 fc fc 3f ff 	lea    rsi,[rip+0xffffffffff3ffcfc]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
  f87a46:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
  f87a4d:	00 
  f87a4e:	e8 2b 20 af ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  f87a53:	48 8d b4 24 f8 00 00 	lea    rsi,[rsp+0xf8]
  f87a5a:	00 
  f87a5b:	48 89 df             	mov    rdi,rbx
  f87a5e:	e8 c9 bf d9 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
  f87a63:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
  f87a6a:	00 
  f87a6b:	e8 20 64 86 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  f87a70:	41 80 be d8 00 00 00 	cmp    BYTE PTR [r14+0xd8],0x0
  f87a77:	00 
  f87a78:	74 49                	je     f87ac3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eed9>
  f87a7a:	41 80 be 00 01 00 00 	cmp    BYTE PTR [r14+0x100],0x0
  f87a81:	00 
  f87a82:	75 3f                	jne    f87ac3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eed9>
  f87a84:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
  f87a88:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  f87a8b:	ff 50 20             	call   QWORD PTR [rax+0x20]
  f87a8e:	84 c0                	test   al,al
  f87a90:	75 31                	jne    f87ac3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eed9>
  f87a92:	48 8d 35 a9 fc 3f ff 	lea    rsi,[rip+0xffffffffff3ffca9]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
  f87a99:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
  f87aa0:	00 
  f87aa1:	e8 d8 1f af ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  f87aa6:	48 8d b4 24 f8 00 00 	lea    rsi,[rsp+0xf8]
  f87aad:	00 
  f87aae:	48 89 df             	mov    rdi,rbx
  f87ab1:	e8 76 bf d9 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
  f87ab6:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
  f87abd:	00 
  f87abe:	e8 cd 63 86 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  f87ac3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  f87aca:	00 00 
  f87acc:	48 3b 84 24 f0 01 00 	cmp    rax,QWORD PTR [rsp+0x1f0]
  f87ad3:	00 
  f87ad4:	75 73                	jne    f87b49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ef5f>
  f87ad6:	48 89 d8             	mov    rax,rbx
  f87ad9:	48 81 c4 f8 01 00 00 	add    rsp,0x1f8
  f87ae0:	5b                   	pop    rbx
  f87ae1:	41 5e                	pop    r14
  f87ae3:	41 5f                	pop    r15
  f87ae5:	5d                   	pop    rbp
  f87ae6:	c3                   	ret
  f87ae7:	eb 16                	jmp    f87aff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ef15>
  f87ae9:	eb 14                	jmp    f87aff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ef15>
  f87aeb:	eb 24                	jmp    f87b11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ef27>
  f87aed:	eb 22                	jmp    f87b11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ef27>
  f87aef:	eb 0e                	jmp    f87aff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ef15>
  f87af1:	eb 1e                	jmp    f87b11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ef27>
  f87af3:	eb 0a                	jmp    f87aff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ef15>
  f87af5:	eb 1a                	jmp    f87b11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ef27>
  f87af7:	eb 06                	jmp    f87aff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ef15>
  f87af9:	eb 16                	jmp    f87b11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ef27>
  f87afb:	eb 14                	jmp    f87b11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ef27>
  f87afd:	eb 12                	jmp    f87b11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ef27>
  f87aff:	49 89 c6             	mov    r14,rax
  f87b02:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
  f87b09:	00 
  f87b0a:	e8 81 63 86 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  f87b0f:	eb 03                	jmp    f87b14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ef2a>
  f87b11:	49 89 c6             	mov    r14,rax
  f87b14:	48 89 df             	mov    rdi,rbx
  f87b17:	e8 4a ab b5 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
  f87b1c:	eb 10                	jmp    f87b2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ef44>
  f87b1e:	49 89 c6             	mov    r14,rax
  f87b21:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
  f87b28:	00 
  f87b29:	e8 52 d8 f7 ff       	call   f05380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc796>
  f87b2e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  f87b35:	00 00 
  f87b37:	48 3b 84 24 f0 01 00 	cmp    rax,QWORD PTR [rsp+0x1f0]
  f87b3e:	00 
  f87b3f:	75 08                	jne    f87b49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ef5f>
  f87b41:	4c 89 f7             	mov    rdi,r14
  f87b44:	e8 87 81 ae ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  f87b49:	e8 62 7f 86 00       	call   17efab0 <__stack_chk_fail@plt>
  f87b4e:	55                   	push   rbp
  f87b4f:	41 57                	push   r15
  f87b51:	41 56                	push   r14
  f87b53:	41 55                	push   r13
  f87b55:	41 54                	push   r12
  f87b57:	53                   	push   rbx
  f87b58:	48 81 ec 98 32 00 00 	sub    rsp,0x3298
  f87b5f:	4c 89 44 24 18       	mov    QWORD PTR [rsp+0x18],r8
  f87b64:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
  f87b69:	49 89 d4             	mov    r12,rdx
  f87b6c:	48 89 fb             	mov    rbx,rdi
  f87b6f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  f87b76:	00 00 
  f87b78:	48 89 84 24 90 32 00 	mov    QWORD PTR [rsp+0x3290],rax
  f87b7f:	00 
  f87b80:	48 83 c6 08          	add    rsi,0x8
  f87b84:	4c 8d 74 24 60       	lea    r14,[rsp+0x60]
  f87b89:	4c 89 f7             	mov    rdi,r14
  f87b8c:	e8 4d 28 00 00       	call   f8a3de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1517f4>
  f87b91:	49 83 3e 00          	cmp    QWORD PTR [r14],0x0
  f87b95:	0f 84 cd 00 00 00    	je     f87c68 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14f07e>
  f87b9b:	48 8d bc 24 10 26 00 	lea    rdi,[rsp+0x2610]
  f87ba2:	00 
  f87ba3:	e8 80 d7 f9 ff       	call   f25328 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec73e>
  f87ba8:	4c 8b bc 24 10 26 00 	mov    r15,QWORD PTR [rsp+0x2610]
  f87baf:	00 
  f87bb0:	49 8d 7f 08          	lea    rdi,[r15+0x8]
  f87bb4:	48 8b 6c 24 60       	mov    rbp,QWORD PTR [rsp+0x60]
  f87bb9:	0f 28 44 24 60       	movaps xmm0,XMMWORD PTR [rsp+0x60]
  f87bbe:	e8 73 6f b5 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
  f87bc3:	4c 8b ac 24 18 26 00 	mov    r13,QWORD PTR [rsp+0x2618]
  f87bca:	00 
  f87bcb:	4d 85 ed             	test   r13,r13
  f87bce:	74 0a                	je     f87bda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eff0>
  f87bd0:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]
--
  f88978:	4d 8d ac 24 f8 02 00 	lea    r13,[r12+0x2f8]
  f8897f:	00 
  f88980:	eb 08                	jmp    f8898a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14fda0>
  f88982:	4c 89 ef             	mov    rdi,r13
  f88985:	e8 c8 d1 bb ff       	call   b45b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92af2>
  f8898a:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
  f88991:	00 
  f88992:	4c 89 ee             	mov    rsi,r13
  f88995:	e8 a6 55 86 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  f8899a:	49 8b 5c 24 60       	mov    rbx,QWORD PTR [r12+0x60]
  f8899f:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  f889a3:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  f889a8:	4c 89 e6             	mov    rsi,r12
  f889ab:	ff 10                	call   QWORD PTR [rax]
  f889ad:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  f889b0:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
  f889b5:	48 8d 94 24 e0 03 00 	lea    rdx,[rsp+0x3e0]
  f889bc:	00 
  f889bd:	48 89 df             	mov    rdi,rbx
  f889c0:	ff 10                	call   QWORD PTR [rax]
  f889c2:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  f889c7:	e8 b4 c9 f7 ff       	call   f05380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc796>
  f889cc:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
  f889d3:	00 
  f889d4:	e8 b7 54 86 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  f889d9:	48 8d 35 62 ed 3f ff 	lea    rsi,[rip+0xffffffffff3fed62]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
  f889e0:	4c 89 ff             	mov    rdi,r15
  f889e3:	e8 67 2e af ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  f889e8:	84 c0                	test   al,al
  f889ea:	0f 84 9b fa ff ff    	je     f8848b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14f8a1>
  f889f0:	48 83 7c 24 10 00    	cmp    QWORD PTR [rsp+0x10],0x0
  f889f6:	74 38                	je     f88a30 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14fe46>
  f889f8:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  f889fd:	e8 26 c9 f9 ff       	call   f25328 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec73e>
  f88a02:	48 8b 6c 24 30       	mov    rbp,QWORD PTR [rsp+0x30]
  f88a07:	48 8d 7d 08          	lea    rdi,[rbp+0x8]
  f88a0b:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
  f88a10:	e8 21 61 b5 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
  f88a15:	4c 8b 6c 24 38       	mov    r13,QWORD PTR [rsp+0x38]
  f88a1a:	4d 85 ed             	test   r13,r13
  f88a1d:	74 21                	je     f88a40 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14fe56>
  f88a1f:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]
  f88a24:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
  f88a29:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]
  f88a2e:	eb 15                	jmp    f88a45 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14fe5b>
  f88a30:	0f 57 c0             	xorps  xmm0,xmm0
  f88a33:	0f 29 84 24 e0 03 00 	movaps XMMWORD PTR [rsp+0x3e0],xmm0
  f88a3a:	00 
  f88a3b:	e9 90 00 00 00       	jmp    f88ad0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14fee6>
  f88a40:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
  f88a45:	6a 28                	push   0x28
  f88a47:	5f                   	pop    rdi
  f88a48:	e8 b3 54 86 00       	call   17edf00 <_Znwm@plt>
  f88a4d:	48 89 68 10          	mov    QWORD PTR [rax+0x10],rbp
  f88a51:	4c 89 68 18          	mov    QWORD PTR [rax+0x18],r13
  f88a55:	4d 85 ed             	test   r13,r13
  f88a58:	74 05                	je     f88a5f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14fe75>
  f88a5a:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]
  f88a5f:	48 8d 0d a4 e8 00 00 	lea    rcx,[rip+0xe8a4]        # f9730a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15e720>
  f88a66:	48 89 08             	mov    QWORD PTR [rax],rcx
  f88a69:	48 8d 0d 48 6e bb ff 	lea    rcx,[rip+0xffffffffffbb6e48]        # b3f8b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c858>
  f88a70:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  f88a74:	48 89 df             	mov    rdi,rbx
  f88a77:	48 89 c6             	mov    rsi,rax
  f88a7a:	e8 7b cf f9 ff       	call   f259fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xece10>
  f88a7f:	4c 89 ef             	mov    rdi,r13
  f88a82:	e8 2b 5a b1 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  f88a87:	0f 57 c0             	xorps  xmm0,xmm0
  f88a8a:	48 8d 9c 24 e0 03 00 	lea    rbx,[rsp+0x3e0]
  f88a91:	00 
  f88a92:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
  f88a95:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  f88a9a:	48 89 de             	mov    rsi,rbx
  f88a9d:	e8 7a 0d b3 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  f88aa2:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  f88aa6:	e8 db 59 b1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  f88aab:	48 89 2b             	mov    QWORD PTR [rbx],rbp
  f88aae:	4c 89 6b 08          	mov    QWORD PTR [rbx+0x8],r13
  f88ab2:	4d 85 ed             	test   r13,r13
  f88ab5:	74 05                	je     f88abc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14fed2>
  f88ab7:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
  f88abc:	4c 89 ef             	mov    rdi,r13
  f88abf:	e8 ee 59 b1 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  f88ac4:	4c 89 ef             	mov    rdi,r13
  f88ac7:	e8 ba 59 b1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  f88acc:	48 8b 2c 24          	mov    rbp,QWORD PTR [rsp]
  f88ad0:	48 8d 5c 24 30       	lea    rbx,[rsp+0x30]
  f88ad5:	4c 8d ac 24 e0 03 00 	lea    r13,[rsp+0x3e0]
  f88adc:	00 
  f88add:	48 89 df             	mov    rdi,rbx
  f88ae0:	4c 89 ee             	mov    rsi,r13
  f88ae3:	e8 d2 cf f8 ff       	call   f15aba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdced0>
  f88ae8:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  f88aec:	e8 95 59 b1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  f88af1:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  f88af6:	48 89 de             	mov    rsi,rbx
  f88af9:	e8 02 44 00 00       	call   f8cf00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x154316>
  f88afe:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  f88b02:	e8 7f 59 b1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  f88b07:	4c 89 e7             	mov    rdi,r12
  f88b0a:	e8 5b 4a 00 00       	call   f8d56a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x154980>
  f88b0f:	84 c0                	test   al,al
  f88b11:	74 4d                	je     f88b60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ff76>
  f88b13:	48 83 7c 24 10 00    	cmp    QWORD PTR [rsp+0x10],0x0
  f88b19:	0f 84 dc 00 00 00    	je     f88bfb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x150011>
  f88b1f:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  f88b24:	e8 ff c7 f9 ff       	call   f25328 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec73e>
  f88b29:	4c 8b 6c 24 30       	mov    r13,QWORD PTR [rsp+0x30]
  f88b2e:	49 8d 7d 08          	lea    rdi,[r13+0x8]
  f88b32:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
  f88b37:	e8 fa 5f b5 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
  f88b3c:	4c 8b 64 24 38       	mov    r12,QWORD PTR [rsp+0x38]
  f88b41:	4d 85 e4             	test   r12,r12
  f88b44:	0f 84 c1 00 00 00    	je     f88c0b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x150021>
  f88b4a:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
  f88b50:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
--
  fe43cd:	49 89 f6             	mov    r14,rsi
  fe43d0:	48 89 fb             	mov    rbx,rdi
  fe43d3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fe43da:	00 00 
  fe43dc:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
  fe43e1:	48 8b 76 20          	mov    rsi,QWORD PTR [rsi+0x20]
  fe43e5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fe43e8:	ff 50 30             	call   QWORD PTR [rax+0x30]
  fe43eb:	4c 89 f7             	mov    rdi,r14
  fe43ee:	e8 17 21 00 00       	call   fe650a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ad920>
  fe43f3:	84 c0                	test   al,al
  fe43f5:	0f 84 95 00 00 00    	je     fe4490 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab8a6>
  fe43fb:	49 8b 46 38          	mov    rax,QWORD PTR [r14+0x38]
  fe43ff:	48 89 c1             	mov    rcx,rax
  fe4402:	48 c1 e9 20          	shr    rcx,0x20
  fe4406:	4c 8d b3 40 03 00 00 	lea    r14,[rbx+0x340]
  fe440d:	84 c9                	test   cl,cl
  fe440f:	74 3a                	je     fe444b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab861>
  fe4411:	89 c0                	mov    eax,eax
  fe4413:	48 85 c0             	test   rax,rax
  fe4416:	75 33                	jne    fe444b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab861>
  fe4418:	48 8d 44 24 08       	lea    rax,[rsp+0x8]
  fe441d:	0f 57 c0             	xorps  xmm0,xmm0
  fe4420:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
  fe4423:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
  fe4427:	48 8d 35 14 33 3a ff 	lea    rsi,[rip+0xffffffffff3a3314]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
  fe442e:	4c 8d 7c 24 18       	lea    r15,[rsp+0x18]
  fe4433:	48 89 e2             	mov    rdx,rsp
  fe4436:	4c 89 ff             	mov    rdi,r15
  fe4439:	e8 78 21 00 00       	call   fe65b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ad9cc>
  fe443e:	4c 89 f7             	mov    rdi,r14
  fe4441:	4c 89 fe             	mov    rsi,r15
  fe4444:	e8 7d 21 00 00       	call   fe65c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ad9dc>
  fe4449:	eb 31                	jmp    fe447c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab892>
  fe444b:	48 8d 44 24 08       	lea    rax,[rsp+0x8]
  fe4450:	0f 57 c0             	xorps  xmm0,xmm0
  fe4453:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
  fe4456:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
  fe445a:	48 8d 35 c0 32 3a ff 	lea    rsi,[rip+0xffffffffff3a32c0]        # 387721 <_ZTSSt12bad_any_cast@@Base-0x8aa7>
  fe4461:	4c 8d 7c 24 18       	lea    r15,[rsp+0x18]
  fe4466:	48 89 e2             	mov    rdx,rsp
  fe4469:	4c 89 ff             	mov    rdi,r15
  fe446c:	e8 45 21 00 00       	call   fe65b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ad9cc>
  fe4471:	4c 89 f7             	mov    rdi,r14
  fe4474:	4c 89 fe             	mov    rsi,r15
  fe4477:	e8 4a 21 00 00       	call   fe65c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ad9dc>
  fe447c:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  fe4481:	e8 60 f9 b4 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
  fe4486:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  fe448b:	e8 56 f9 b4 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
  fe4490:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fe4497:	00 00 
  fe4499:	48 3b 44 24 38       	cmp    rax,QWORD PTR [rsp+0x38]
  fe449e:	75 46                	jne    fe44e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab8fc>
  fe44a0:	48 89 d8             	mov    rax,rbx
  fe44a3:	48 83 c4 40          	add    rsp,0x40
  fe44a7:	5b                   	pop    rbx
  fe44a8:	41 5e                	pop    r14
  fe44aa:	41 5f                	pop    r15
  fe44ac:	c3                   	ret
  fe44ad:	eb 00                	jmp    fe44af <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab8c5>
  fe44af:	49 89 c6             	mov    r14,rax
  fe44b2:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  fe44b7:	e8 2a f9 b4 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
  fe44bc:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  fe44c1:	e8 20 f9 b4 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
  fe44c6:	48 89 df             	mov    rdi,rbx
  fe44c9:	e8 5e d6 6e 00       	call   16d1b2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85c98>
  fe44ce:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fe44d5:	00 00 
  fe44d7:	48 3b 44 24 38       	cmp    rax,QWORD PTR [rsp+0x38]
  fe44dc:	75 08                	jne    fe44e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab8fc>
  fe44de:	4c 89 f7             	mov    rdi,r14
  fe44e1:	e8 ea b7 a8 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  fe44e6:	e8 c5 b5 80 00       	call   17efab0 <__stack_chk_fail@plt>
  fe44eb:	cc                   	int3
  fe44ec:	41 56                	push   r14
  fe44ee:	53                   	push   rbx
  fe44ef:	48 83 ec 28          	sub    rsp,0x28
  fe44f3:	49 89 f6             	mov    r14,rsi
  fe44f6:	48 89 fb             	mov    rbx,rdi
  fe44f9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fe4500:	00 00 
  fe4502:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  fe4507:	48 8b 76 20          	mov    rsi,QWORD PTR [rsi+0x20]
  fe450b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fe450e:	ff 50 70             	call   QWORD PTR [rax+0x70]
  fe4511:	4c 89 f7             	mov    rdi,r14
  fe4514:	e8 f1 1f 00 00       	call   fe650a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ad920>
  fe4519:	84 c0                	test   al,al
  fe451b:	74 5e                	je     fe457b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab991>
  fe451d:	49 8b 46 38          	mov    rax,QWORD PTR [r14+0x38]
  fe4521:	48 89 c1             	mov    rcx,rax
  fe4524:	48 c1 e9 20          	shr    rcx,0x20
  fe4528:	84 c9                	test   cl,cl
  fe452a:	74 27                	je     fe4553 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab969>
  fe452c:	89 c0                	mov    eax,eax
  fe452e:	48 85 c0             	test   rax,rax
  fe4531:	75 20                	jne    fe4553 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab969>
  fe4533:	48 8d 35 08 32 3a ff 	lea    rsi,[rip+0xffffffffff3a3208]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
  fe453a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  fe453f:	e8 3a 55 a9 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  fe4544:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
  fe4549:	48 89 df             	mov    rdi,rbx
  fe454c:	e8 db f4 d3 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
  fe4551:	eb 1e                	jmp    fe4571 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab987>
  fe4553:	48 8d 35 c7 31 3a ff 	lea    rsi,[rip+0xffffffffff3a31c7]        # 387721 <_ZTSSt12bad_any_cast@@Base-0x8aa7>
  fe455a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  fe455f:	e8 1a 55 a9 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  fe4564:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
  fe4569:	48 89 df             	mov    rdi,rbx
  fe456c:	e8 bb f4 d3 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
  fe4571:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  fe4576:	e8 15 99 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  fe457b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fe4582:	00 00 
  fe4584:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  fe4589:	75 41                	jne    fe45cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab9e2>
  fe458b:	48 89 d8             	mov    rax,rbx
  fe458e:	48 83 c4 28          	add    rsp,0x28
  fe4592:	5b                   	pop    rbx
  fe4593:	41 5e                	pop    r14
  fe4595:	c3                   	ret
  fe4596:	eb 00                	jmp    fe4598 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab9ae>
  fe4598:	49 89 c6             	mov    r14,rax
  fe459b:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  fe45a0:	e8 eb 98 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  fe45a5:	eb 05                	jmp    fe45ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab9c2>
  fe45a7:	eb 00                	jmp    fe45a9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab9bf>
  fe45a9:	49 89 c6             	mov    r14,rax
  fe45ac:	48 89 df             	mov    rdi,rbx
  fe45af:	e8 b2 e0 af ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
  fe45b4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fe45bb:	00 00 
  fe45bd:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  fe45c2:	75 08                	jne    fe45cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab9e2>
  fe45c4:	4c 89 f7             	mov    rdi,r14
  fe45c7:	e8 04 b7 a8 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  fe45cc:	e8 df b4 80 00       	call   17efab0 <__stack_chk_fail@plt>
  fe45d1:	cc                   	int3
  fe45d2:	55                   	push   rbp
  fe45d3:	41 57                	push   r15
  fe45d5:	41 56                	push   r14
  fe45d7:	41 55                	push   r13
  fe45d9:	41 54                	push   r12
  fe45db:	53                   	push   rbx
  fe45dc:	48 81 ec c8 07 00 00 	sub    rsp,0x7c8
  fe45e3:	49 89 cf             	mov    r15,rcx
  fe45e6:	49 89 d4             	mov    r12,rdx
  fe45e9:	49 89 f6             	mov    r14,rsi
  fe45ec:	48 89 fb             	mov    rbx,rdi
  fe45ef:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fe45f6:	00 00 
  fe45f8:	48 89 84 24 c0 07 00 	mov    QWORD PTR [rsp+0x7c0],rax
  fe45ff:	00 
  fe4600:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fe4603:	4c 8d ac 24 10 04 00 	lea    r13,[rsp+0x410]
  fe460a:	00 
  fe460b:	4c 89 ef             	mov    rdi,r13
  fe460e:	ff 50 70             	call   QWORD PTR [rax+0x70]
  fe4611:	4c 89 ef             	mov    rdi,r13
  fe4614:	4c 89 e6             	mov    rsi,r12
  fe4617:	e8 7a c1 b5 ff       	call   b40796 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8d736>
  fe461c:	89 c5                	mov    ebp,eax
  fe461e:	4c 89 ef             	mov    rdi,r13
  fe4621:	e8 40 e0 af ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
  fe4626:	40 84 ed             	test   bpl,bpl
  fe4629:	0f 84 f3 00 00 00    	je     fe4722 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1abb38>
  fe462f:	49 8b 06             	mov    rax,QWORD PTR [r14]
  fe4632:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
  fe4639:	00 
  fe463a:	4c 89 f6             	mov    rsi,r14
  fe463d:	ff 50 30             	call   QWORD PTR [rax+0x30]
  fe4640:	48 8d bc 24 50 07 00 	lea    rdi,[rsp+0x750]
  fe4647:	00 
  fe4648:	4c 89 e6             	mov    rsi,r12
  fe464b:	e8 46 c1 b5 ff       	call   b40796 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8d736>
  fe4650:	84 c0                	test   al,al
  fe4652:	0f 84 bd 00 00 00    	je     fe4715 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1abb2b>
  fe4658:	49 8b 06             	mov    rax,QWORD PTR [r14]
  fe465b:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  fe4660:	4c 89 f6             	mov    rsi,r14
  fe4663:	ff 50 30             	call   QWORD PTR [rax+0x30]
  fe4666:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
  fe466d:	00 
  fe466e:	4c 89 e6             	mov    rsi,r12
  fe4671:	e8 3a c0 e4 ff       	call   e306b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfd736>
  fe4676:	4c 8b 68 10          	mov    r13,QWORD PTR [rax+0x10]
  fe467a:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  fe467f:	e8 a8 d4 6e 00       	call   16d1b2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85c98>
--
  fe472d:	00 
  fe472e:	4c 89 ef             	mov    rdi,r13
  fe4731:	4c 89 f6             	mov    rsi,r14
  fe4734:	4c 89 e2             	mov    rdx,r12
  fe4737:	4c 89 f9             	mov    rcx,r15
  fe473a:	e8 8b 1c 00 00       	call   fe63ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ad7e0>
  fe473f:	48 89 df             	mov    rdi,rbx
  fe4742:	4c 89 ee             	mov    rsi,r13
  fe4745:	e8 82 18 00 00       	call   fe5fcc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ad3e2>
  fe474a:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  fe474e:	e8 33 9d ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fe4753:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fe475a:	00 00 
  fe475c:	48 3b 84 24 c0 07 00 	cmp    rax,QWORD PTR [rsp+0x7c0]
  fe4763:	00 
  fe4764:	0f 85 8e 01 00 00    	jne    fe48f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1abd0e>
  fe476a:	48 89 d8             	mov    rax,rbx
  fe476d:	48 81 c4 c8 07 00 00 	add    rsp,0x7c8
  fe4774:	5b                   	pop    rbx
  fe4775:	41 5c                	pop    r12
  fe4777:	41 5d                	pop    r13
  fe4779:	41 5e                	pop    r14
  fe477b:	41 5f                	pop    r15
  fe477d:	5d                   	pop    rbp
  fe477e:	c3                   	ret
  fe477f:	48 8d 35 bc 2f 3a ff 	lea    rsi,[rip+0xffffffffff3a2fbc]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
  fe4786:	4c 89 e7             	mov    rdi,r12
  fe4789:	e8 c1 70 a9 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  fe478e:	84 c0                	test   al,al
  fe4790:	74 90                	je     fe4722 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1abb38>
  fe4792:	49 83 c6 10          	add    r14,0x10
  fe4796:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  fe479b:	4c 89 f6             	mov    rsi,r14
  fe479e:	e8 b7 76 ca ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
  fe47a3:	0f 57 c0             	xorps  xmm0,xmm0
  fe47a6:	49 89 e6             	mov    r14,rsp
  fe47a9:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
  fe47ad:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
  fe47b2:	4c 8d 64 24 60       	lea    r12,[rsp+0x60]
  fe47b7:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
  fe47bc:	4c 89 e7             	mov    rdi,r12
  fe47bf:	4c 89 f2             	mov    rdx,r14
  fe47c2:	e8 93 08 f4 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>
  fe47c7:	4c 8d 6c 24 50       	lea    r13,[rsp+0x50]
  fe47cc:	6a 01                	push   0x1
  fe47ce:	5a                   	pop    rdx
  fe47cf:	4c 89 ef             	mov    rdi,r13
  fe47d2:	4c 89 e6             	mov    rsi,r12
  fe47d5:	e8 2e 15 00 00       	call   fe5d08 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ad11e>
  fe47da:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
  fe47de:	48 b8 00 00 00 00 00 	movabs rax,0xffffff0000000000
  fe47e5:	ff ff ff 
  fe47e8:	48 23 46 38          	and    rax,QWORD PTR [rsi+0x38]
  fe47ec:	48 b9 00 00 00 00 01 	movabs rcx,0x100000000
  fe47f3:	00 00 00 
  fe47f6:	48 01 c8             	add    rax,rcx
  fe47f9:	48 ff c0             	inc    rax
  fe47fc:	48 89 46 38          	mov    QWORD PTR [rsi+0x38],rax
  fe4800:	41 0f 10 44 24 20    	movups xmm0,XMMWORD PTR [r12+0x20]
  fe4806:	48 8d 6c 24 30       	lea    rbp,[rsp+0x30]
  fe480b:	0f 29 45 00          	movaps XMMWORD PTR [rbp+0x0],xmm0
  fe480f:	49 8b 44 24 30       	mov    rax,QWORD PTR [r12+0x30]
  fe4814:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax
  fe4818:	0f 57 c0             	xorps  xmm0,xmm0
  fe481b:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
  fe4821:	49 83 64 24 30 00    	and    QWORD PTR [r12+0x30],0x0
  fe4827:	4d 8b 7d 08          	mov    r15,QWORD PTR [r13+0x8]
  fe482b:	4c 8d ac 24 10 04 00 	lea    r13,[rsp+0x410]
  fe4832:	00 
  fe4833:	4c 89 ef             	mov    rdi,r13
  fe4836:	4c 89 fa             	mov    rdx,r15
  fe4839:	48 89 e9             	mov    rcx,rbp
  fe483c:	e8 c3 09 f4 ff       	call   f25204 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec61a>
  fe4841:	48 89 ef             	mov    rdi,rbp
  fe4844:	e8 33 77 e2 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
  fe4849:	4c 89 ff             	mov    rdi,r15
  fe484c:	e8 35 9c ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fe4851:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
  fe4856:	4c 89 ff             	mov    rdi,r15
  fe4859:	4c 89 ee             	mov    rsi,r13
  fe485c:	e8 07 14 00 00       	call   fe5c68 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ad07e>
  fe4861:	48 8d 6c 24 50       	lea    rbp,[rsp+0x50]
  fe4866:	48 89 ef             	mov    rdi,rbp
  fe4869:	4c 89 fe             	mov    rsi,r15
  fe486c:	e8 49 12 f3 ff       	call   f15aba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdced0>
  fe4871:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
  fe4875:	e8 0c 9c ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fe487a:	4c 89 ef             	mov    rdi,r13
  fe487d:	e8 90 0a f4 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
  fe4882:	4c 89 e7             	mov    rdi,r12
  fe4885:	e8 88 0a f4 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
  fe488a:	4c 89 f7             	mov    rdi,r14
  fe488d:	e8 ea 76 e2 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
  fe4892:	48 8d 44 24 20       	lea    rax,[rsp+0x20]
  fe4897:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
  fe489b:	e8 e6 9b ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fe48a0:	48 89 df             	mov    rdi,rbx
  fe48a3:	48 89 ee             	mov    rsi,rbp
  fe48a6:	e8 21 17 00 00       	call   fe5fcc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ad3e2>
  fe48ab:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
  fe48af:	e9 9a fe ff ff       	jmp    fe474e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1abb64>
  fe48b4:	eb 00                	jmp    fe48b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1abccc>
  fe48b6:	48 89 c7             	mov    rdi,rax
  fe48b9:	e8 e7 51 a9 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fe48be:	48 89 c3             	mov    rbx,rax
  fe48c1:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  fe48c6:	e8 61 d2 6e 00       	call   16d1b2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85c98>
  fe48cb:	eb 03                	jmp    fe48d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1abce6>
  fe48cd:	48 89 c3             	mov    rbx,rax
  fe48d0:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
  fe48d7:	00 
  fe48d8:	e8 4f d2 6e 00       	call   16d1b2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85c98>
  fe48dd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fe48e4:	00 00 
  fe48e6:	48 3b 84 24 c0 07 00 	cmp    rax,QWORD PTR [rsp+0x7c0]
  fe48ed:	00 
--
  ffc437:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
  ffc43c:	4c 89 f2             	mov    rdx,r14
  ffc43f:	4c 89 e1             	mov    rcx,r12
  ffc442:	4d 89 f8             	mov    r8,r15
  ffc445:	ff 90 30 01 00 00    	call   QWORD PTR [rax+0x130]
  ffc44b:	89 c3                	mov    ebx,eax
  ffc44d:	84 db                	test   bl,bl
  ffc44f:	49 89 ef             	mov    r15,rbp
  ffc452:	74 24                	je     ffc478 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c388e>
  ffc454:	49 8d bd 38 22 00 00 	lea    rdi,[r13+0x2238]
  ffc45b:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
  ffc460:	e8 81 fc 66 00       	call   166c0e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20252>
  ffc465:	41 0f b6 44 24 32    	movzx  eax,BYTE PTR [r12+0x32]
  ffc46b:	0d 00 01 00 00       	or     eax,0x100
  ffc470:	66 41 89 85 b8 22 00 	mov    WORD PTR [r13+0x22b8],ax
  ffc477:	00 
  ffc478:	4c 89 ef             	mov    rdi,r13
  ffc47b:	e8 04 2a 00 00       	call   ffee84 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c629a>
  ffc480:	49 89 c6             	mov    r14,rax
  ffc483:	89 d8                	mov    eax,ebx
  ffc485:	25 ff ff ff 00       	and    eax,0xffffff
  ffc48a:	3d 00 00 01 00       	cmp    eax,0x10000
  ffc48f:	0f 83 87 00 00 00    	jae    ffc51c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3932>
  ffc495:	48 bb 04 00 00 00 01 	movabs rbx,0x100000004
  ffc49c:	00 00 00 
  ffc49f:	48 8d 35 9c b2 38 ff 	lea    rsi,[rip+0xffffffffff38b29c]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
  ffc4a6:	4c 89 e7             	mov    rdi,r12
  ffc4a9:	e8 a1 f3 a7 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  ffc4ae:	84 c0                	test   al,al
  ffc4b0:	75 18                	jne    ffc4ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c38e0>
  ffc4b2:	48 8d 35 68 b2 38 ff 	lea    rsi,[rip+0xffffffffff38b268]        # 387721 <_ZTSSt12bad_any_cast@@Base-0x8aa7>
  ffc4b9:	4c 89 e7             	mov    rdi,r12
  ffc4bc:	e8 8e f3 a7 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  ffc4c1:	48 ff c3             	inc    rbx
  ffc4c4:	84 c0                	test   al,al
  ffc4c6:	49 0f 44 de          	cmove  rbx,r14
  ffc4ca:	4c 89 ef             	mov    rdi,r13
  ffc4cd:	e8 94 ae ff ff       	call   ff7366 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1be77c>
  ffc4d2:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
  ffc4d7:	4c 89 f7             	mov    rdi,r14
  ffc4da:	e8 eb e2 66 00       	call   166a7ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e936>
  ffc4df:	4c 89 ff             	mov    rdi,r15
  ffc4e2:	48 89 de             	mov    rsi,rbx
  ffc4e5:	4c 89 f2             	mov    rdx,r14
  ffc4e8:	e8 81 2a 00 00       	call   ffef6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c6384>
  ffc4ed:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
  ffc4f1:	eb 1f                	jmp    ffc512 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3928>
  ffc4f3:	48 8d 9c 24 38 01 00 	lea    rbx,[rsp+0x138]
  ffc4fa:	00 
  ffc4fb:	48 89 df             	mov    rdi,rbx
  ffc4fe:	e8 c7 e2 66 00       	call   166a7ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e936>
  ffc503:	4c 89 ff             	mov    rdi,r15
  ffc506:	48 89 de             	mov    rsi,rbx
  ffc509:	e8 a4 74 eb ff       	call   eb39b2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7adc8>
  ffc50e:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
  ffc512:	e8 87 22 aa ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
  ffc517:	e9 ce 00 00 00       	jmp    ffc5ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3a00>
  ffc51c:	0f b6 ef             	movzx  ebp,bh
  ffc51f:	4c 8d 74 24 40       	lea    r14,[rsp+0x40]
  ffc524:	4c 89 f7             	mov    rdi,r14
  ffc527:	e8 9e e2 66 00       	call   166a7ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e936>
  ffc52c:	4c 89 ff             	mov    rdi,r15
  ffc52f:	4c 89 f6             	mov    rsi,r14
  ffc532:	e8 7b 74 eb ff       	call   eb39b2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7adc8>
  ffc537:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
  ffc53b:	e8 5e 22 aa ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
  ffc540:	c1 eb 08             	shr    ebx,0x8
  ffc543:	81 e3 00 ff ff 00    	and    ebx,0xffff00
  ffc549:	0f b7 c5             	movzx  eax,bp
  ffc54c:	09 d8                	or     eax,ebx
  ffc54e:	66 41 89 87 b8 00 00 	mov    WORD PTR [r15+0xb8],ax
  ffc555:	00 
  ffc556:	e9 8f 00 00 00       	jmp    ffc5ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3a00>
  ffc55b:	31 c0                	xor    eax,eax
  ffc55d:	88 84 24 f8 00 00 00 	mov    BYTE PTR [rsp+0xf8],al
  ffc564:	88 84 24 10 01 00 00 	mov    BYTE PTR [rsp+0x110],al
  ffc56b:	48 8d 94 24 f8 00 00 	lea    rdx,[rsp+0xf8]
  ffc572:	00 
  ffc573:	4c 89 ef             	mov    rdi,r13
  ffc576:	31 f6                	xor    esi,esi
  ffc578:	48 89 d9             	mov    rcx,rbx
  ffc57b:	e8 82 28 00 00       	call   ffee02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c6218>
  ffc580:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
  ffc587:	00 
  ffc588:	e8 a3 a7 aa ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  ffc58d:	6a 01                	push   0x1
  ffc58f:	5e                   	pop    rsi
  ffc590:	48 8d 94 24 18 01 00 	lea    rdx,[rsp+0x118]
  ffc597:	00 
  ffc598:	4c 89 ef             	mov    rdi,r13
  ffc59b:	48 89 d9             	mov    rcx,rbx
  ffc59e:	e8 5f 28 00 00       	call   ffee02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c6218>
  ffc5a3:	4c 89 ef             	mov    rdi,r13
  ffc5a6:	e8 d9 28 00 00       	call   ffee84 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c629a>
  ffc5ab:	48 89 c3             	mov    rbx,rax
  ffc5ae:	4c 89 ef             	mov    rdi,r13
  ffc5b1:	e8 b0 ad ff ff       	call   ff7366 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1be77c>
  ffc5b6:	4c 8d b4 24 d0 00 00 	lea    r14,[rsp+0xd0]
  ffc5bd:	00 
  ffc5be:	4c 89 f7             	mov    rdi,r14
  ffc5c1:	e8 04 e2 66 00       	call   166a7ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e936>
  ffc5c6:	4c 89 ff             	mov    rdi,r15
  ffc5c9:	48 89 de             	mov    rsi,rbx
  ffc5cc:	4c 89 f2             	mov    rdx,r14
  ffc5cf:	e8 9a 29 00 00       	call   ffef6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c6384>
  ffc5d4:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
  ffc5d8:	e8 c1 21 aa ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
  ffc5dd:	48 8d bc 24 18 01 00 	lea    rdi,[rsp+0x118]
  ffc5e4:	00 
  ffc5e5:	e8 46 a7 aa ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  ffc5ea:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
  ffc5f1:	00 
  ffc5f2:	e8 db d6 7d 00       	call   17d9cd2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5af3>
  ffc5f7:	49 ff 8d 48 10 00 00 	dec    QWORD PTR [r13+0x1048]
  ffc5fe:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
  ffc605:	00 
--
 10a7b71:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
 10a7b76:	6a 20                	push   0x20
 10a7b78:	59                   	pop    rcx
 10a7b79:	4c 8d 44 24 60       	lea    r8,[rsp+0x60]
 10a7b7e:	4c 89 e6             	mov    rsi,r12
 10a7b81:	ff 90 60 01 00 00    	call   QWORD PTR [rax+0x160]
 10a7b87:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 10a7b8c:	e8 ff 62 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a7b91:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 10a7b96:	e8 4d 3a 9d ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10a7b9b:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
 10a7ba2:	00 
 10a7ba3:	e8 e8 62 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a7ba8:	4c 8b a4 24 40 04 00 	mov    r12,QWORD PTR [rsp+0x440]
 10a7baf:	00 
 10a7bb0:	4c 3b a4 24 48 04 00 	cmp    r12,QWORD PTR [rsp+0x448]
 10a7bb7:	00 
 10a7bb8:	0f 84 ce 00 00 00    	je     10a7c8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f0a2>
 10a7bbe:	41 80 7c 24 15 00    	cmp    BYTE PTR [r12+0x15],0x0
 10a7bc4:	0f 84 c2 00 00 00    	je     10a7c8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f0a2>
 10a7bca:	41 8b 44 24 18       	mov    eax,DWORD PTR [r12+0x18]
 10a7bcf:	83 f8 02             	cmp    eax,0x2
 10a7bd2:	74 50                	je     10a7c24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f03a>
 10a7bd4:	83 f8 01             	cmp    eax,0x1
 10a7bd7:	0f 85 af 00 00 00    	jne    10a7c8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f0a2>
 10a7bdd:	48 8d 35 5e fb 2d ff 	lea    rsi,[rip+0xffffffffff2dfb5e]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
 10a7be4:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 10a7be9:	e8 90 1e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a7bee:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
 10a7bf3:	4c 89 ff             	mov    rdi,r15
 10a7bf6:	e8 91 f9 e4 ff       	call   ef758c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe9a2>
 10a7bfb:	49 89 c7             	mov    r15,rax
 10a7bfe:	48 8d 35 13 a0 3a ff 	lea    rsi,[rip+0xffffffffff3aa013]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
 10a7c05:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
 10a7c0c:	00 
 10a7c0d:	e8 6c 1e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a7c12:	48 8d b4 24 10 08 00 	lea    rsi,[rsp+0x810]
 10a7c19:	00 
 10a7c1a:	4c 89 ff             	mov    rdi,r15
 10a7c1d:	e8 6e 5e d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a7c22:	eb 51                	jmp    10a7c75 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f08b>
 10a7c24:	41 80 7c 24 40 00    	cmp    BYTE PTR [r12+0x40],0x0
 10a7c2a:	0f 84 5a 01 00 00    	je     10a7d8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f1a0>
 10a7c30:	48 8d 35 0b fb 2d ff 	lea    rsi,[rip+0xffffffffff2dfb0b]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
 10a7c37:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 10a7c3c:	e8 3d 1e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a7c41:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
 10a7c46:	4c 89 ff             	mov    rdi,r15
 10a7c49:	e8 3e f9 e4 ff       	call   ef758c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe9a2>
 10a7c4e:	49 89 c7             	mov    r15,rax
 10a7c51:	48 8d 35 98 2e 2b ff 	lea    rsi,[rip+0xffffffffff2b2e98]        # 35aaf0 <_ZTSSt12bad_any_cast@@Base-0x356d8>
 10a7c58:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
 10a7c5f:	00 
 10a7c60:	e8 19 1e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a7c65:	48 8d b4 24 10 08 00 	lea    rsi,[rsp+0x810]
 10a7c6c:	00 
 10a7c6d:	4c 89 ff             	mov    rdi,r15
 10a7c70:	e8 1b 5e d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a7c75:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
 10a7c7c:	00 
 10a7c7d:	e8 0e 62 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a7c82:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 10a7c87:	e8 04 62 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a7c8c:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a7c93:	00 
 10a7c94:	e8 71 29 e7 ff       	call   f1a60a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe1a20>
 10a7c99:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
 10a7c9e:	48 89 df             	mov    rdi,rbx
 10a7ca1:	e8 3c 05 00 00       	call   10a81e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f5f8>
 10a7ca6:	84 c0                	test   al,al
 10a7ca8:	0f 85 a9 00 00 00    	jne    10a7d57 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f16d>
 10a7cae:	49 81 c6 38 10 00 00 	add    r14,0x1038
 10a7cb5:	40 88 2c 24          	mov    BYTE PTR [rsp],bpl
 10a7cb9:	0f 57 c0             	xorps  xmm0,xmm0
 10a7cbc:	48 8d 94 24 10 08 00 	lea    rdx,[rsp+0x810]
 10a7cc3:	00 
 10a7cc4:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
 10a7cc7:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
 10a7ccc:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 10a7cd1:	4c 89 f6             	mov    rsi,r14
 10a7cd4:	e8 31 27 73 00       	call   17da40a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x622b>
 10a7cd9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
 10a7cde:	48 89 1e             	mov    QWORD PTR [rsi],rbx
 10a7ce1:	48 89 e0             	mov    rax,rsp
 10a7ce4:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
 10a7ce8:	48 8b 54 24 60       	mov    rdx,QWORD PTR [rsp+0x60]
 10a7ced:	48 8b 5c 24 68       	mov    rbx,QWORD PTR [rsp+0x68]
 10a7cf2:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a7cf9:	00 
 10a7cfa:	48 89 d9             	mov    rcx,rbx
 10a7cfd:	e8 ca 09 00 00       	call   10a86cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fae2>
 10a7d02:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 10a7d07:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
 10a7d0c:	48 89 da             	mov    rdx,rbx
 10a7d0f:	48 89 d9             	mov    rcx,rbx
 10a7d12:	e8 b5 09 00 00       	call   10a86cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fae2>
 10a7d17:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a7d1e:	00 
 10a7d1f:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
 10a7d24:	e8 93 4d a1 ff       	call   abcabc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9a5c>
 10a7d29:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
 10a7d2e:	e8 53 67 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10a7d33:	48 8b bc 24 58 04 00 	mov    rdi,QWORD PTR [rsp+0x458]
 10a7d3a:	00 
 10a7d3b:	e8 46 67 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10a7d40:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 10a7d45:	e8 1a 4e a1 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
 10a7d4a:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
 10a7d51:	00 
 10a7d52:	e8 0d 4e a1 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
 10a7d57:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
 10a7d5c:	e8 a3 d2 c4 ff       	call   cf5004 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x241fa4>
 10a7d61:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10a7d68:	00 00 
 10a7d6a:	48 3b 84 24 30 08 00 	cmp    rax,QWORD PTR [rsp+0x830]
 10a7d71:	00 
 10a7d72:	0f 85 be 00 00 00    	jne    10a7e36 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f24c>
 10a7d78:	48 81 c4 38 08 00 00 	add    rsp,0x838
 10a7d7f:	5b                   	pop    rbx
 10a7d80:	41 5c                	pop    r12
 10a7d82:	41 5d                	pop    r13
 10a7d84:	41 5e                	pop    r14
 10a7d86:	41 5f                	pop    r15
 10a7d88:	5d                   	pop    rbp
 10a7d89:	c3                   	ret
 10a7d8a:	48 8d 35 b1 f9 2d ff 	lea    rsi,[rip+0xffffffffff2df9b1]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
 10a7d91:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 10a7d96:	e8 e3 1c 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a7d9b:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
 10a7da0:	4c 89 ff             	mov    rdi,r15
 10a7da3:	e8 e4 f7 e4 ff       	call   ef758c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe9a2>
 10a7da8:	49 89 c7             	mov    r15,rax
 10a7dab:	48 8d 35 cc 3c 2d ff 	lea    rsi,[rip+0xffffffffff2d3ccc]        # 37ba7e <_ZTSSt12bad_any_cast@@Base-0x1474a>
 10a7db2:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 10a7db7:	e8 c2 1c 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a7dbc:	48 8d 15 e4 33 2b ff 	lea    rdx,[rip+0xffffffffff2b33e4]        # 35b1a7 <_ZTSSt12bad_any_cast@@Base-0x35021>
 10a7dc3:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 10a7dc8:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
 10a7dcd:	e8 6b 36 9f ff       	call   a9b43d <JNI_OnUnload@@Base+0x22d0a>
 10a7dd2:	49 83 c4 20          	add    r12,0x20
 10a7dd6:	48 8d 15 9f a1 3a ff 	lea    rdx,[rip+0xffffffffff3aa19f]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 10a7ddd:	48 89 e7             	mov    rdi,rsp
 10a7de0:	4c 89 e6             	mov    rsi,r12
 10a7de3:	e8 24 d7 a2 ff       	call   ad550c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x224ac>
 10a7de8:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
 10a7def:	00 
 10a7df0:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
 10a7df5:	48 89 e2             	mov    rdx,rsp
 10a7df8:	e8 93 e3 a0 ff       	call   ab6190 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3130>
 10a7dfd:	48 8d b4 24 10 08 00 	lea    rsi,[rsp+0x810]
 10a7e04:	00 
 10a7e05:	4c 89 ff             	mov    rdi,r15
 10a7e08:	e8 83 5c d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a7e0d:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
 10a7e14:	00 
 10a7e15:	e8 76 60 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a7e1a:	48 89 e7             	mov    rdi,rsp
 10a7e1d:	e8 6e 60 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a7e22:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 10a7e27:	e8 64 60 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a7e2c:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 10a7e31:	e9 47 fe ff ff       	jmp    10a7c7d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f093>
 10a7e36:	e8 75 7c 74 00       	call   17efab0 <__stack_chk_fail@plt>
 10a7e3b:	e9 0a 01 00 00       	jmp    10a7f4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f360>
 10a7e40:	e9 cd 00 00 00       	jmp    10a7f12 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f328>
 10a7e45:	e9 d7 00 00 00       	jmp    10a7f21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f337>
 10a7e4a:	e9 c3 00 00 00       	jmp    10a7f12 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f328>
 10a7e4f:	e9 cd 00 00 00       	jmp    10a7f21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f337>
 10a7e54:	eb 06                	jmp    10a7e5c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f272>
 10a7e56:	eb 13                	jmp    10a7e6b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f281>
 10a7e58:	eb 02                	jmp    10a7e5c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f272>
 10a7e5a:	eb 0f                	jmp    10a7e6b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f281>
 10a7e5c:	48 89 c3             	mov    rbx,rax
 10a7e5f:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 10a7e64:	e8 27 60 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a7e69:	eb 03                	jmp    10a7e6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f284>
 10a7e6b:	48 89 c3             	mov    rbx,rax
 10a7e6e:	48 8d bc 24 48 04 00 	lea    rdi,[rsp+0x448]
 10a7e75:	00 
 10a7e76:	e8 77 7c e2 ff       	call   ecfaf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x96f08>
 10a7e7b:	e9 be 00 00 00       	jmp    10a7f3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f354>
 10a7e80:	eb 7a                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
 10a7e82:	eb 78                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
 10a7e84:	eb 76                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
 10a7e86:	eb 74                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
 10a7e88:	eb 72                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
 10a7e8a:	eb 70                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
 10a7e8c:	eb 6e                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
 10a7e8e:	eb 6c                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
 10a7e90:	eb 6a                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
 10a7e92:	eb 68                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
 10a7e94:	eb 66                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
 10a7e96:	eb 64                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
 10a7e98:	eb 62                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
 10a7e9a:	eb 60                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
 10a7e9c:	eb 5e                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
 10a7e9e:	eb 72                	jmp    10a7f12 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f328>
 10a7ea0:	eb 7f                	jmp    10a7f21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f337>
 10a7ea2:	48 89 c3             	mov    rbx,rax
 10a7ea5:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
 10a7eaa:	e8 d7 65 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10a7eaf:	eb 03                	jmp    10a7eb4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f2ca>
 10a7eb1:	48 89 c3             	mov    rbx,rax
 10a7eb4:	48 8b bc 24 58 04 00 	mov    rdi,QWORD PTR [rsp+0x458]
 10a7ebb:	00 
 10a7ebc:	e8 c5 65 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10a7ec1:	eb 03                	jmp    10a7ec6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f2dc>
 10a7ec3:	48 89 c3             	mov    rbx,rax
 10a7ec6:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 10a7ecb:	e8 94 4c a1 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
 10a7ed0:	eb 03                	jmp    10a7ed5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f2eb>
 10a7ed2:	48 89 c3             	mov    rbx,rax
 10a7ed5:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
 10a7edc:	00 
 10a7edd:	e8 82 4c a1 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
 10a7ee2:	eb 5a                	jmp    10a7f3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f354>
--
 12042ad:	4c 89 e6             	mov    rsi,r12
 12042b0:	e8 ed 21 00 00       	call   12064a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4ba26>
 12042b5:	48 8b 7d 20          	mov    rdi,QWORD PTR [rbp+0x20]
 12042b9:	4c 8b 07             	mov    r8,QWORD PTR [rdi]
 12042bc:	0f b6 c0             	movzx  eax,al
 12042bf:	6a 01                	push   0x1
 12042c1:	5e                   	pop    rsi
 12042c2:	4c 89 ea             	mov    rdx,r13
 12042c5:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
 12042ca:	41 ff 54 c0 38       	call   QWORD PTR [r8+rax*8+0x38]
 12042cf:	e8 f3 65 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
 12042d4:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
 12042db:	00 
 12042dc:	83 60 e8 00          	and    DWORD PTR [rax-0x18],0x0
 12042e0:	48 8d 0d 69 eb 77 00 	lea    rcx,[rip+0x77eb69]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
 12042e7:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
 12042eb:	0f 57 c0             	xorps  xmm0,xmm0
 12042ee:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 12042f1:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
 12042f5:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 12042fa:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
 12042fe:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
 1204305:	00 
 1204306:	e8 85 9a 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
 120430b:	eb 7c                	jmp    1204389 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4990d>
 120430d:	48 8d 35 2e 34 18 ff 	lea    rsi,[rip+0xffffffffff18342e]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
 1204314:	4c 89 f7             	mov    rdi,r14
 1204317:	e8 33 75 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 120431c:	84 c0                	test   al,al
 120431e:	0f 84 9b 00 00 00    	je     12043bf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49943>
 1204324:	48 8b 55 60          	mov    rdx,QWORD PTR [rbp+0x60]
 1204328:	48 89 df             	mov    rdi,rbx
 120432b:	4c 89 e6             	mov    rsi,r12
 120432e:	e8 6f 21 00 00       	call   12064a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4ba26>
 1204333:	48 8b 7d 20          	mov    rdi,QWORD PTR [rbp+0x20]
 1204337:	4c 8b 07             	mov    r8,QWORD PTR [rdi]
 120433a:	0f b6 c0             	movzx  eax,al
 120433d:	6a 02                	push   0x2
 120433f:	5e                   	pop    rsi
 1204340:	4c 89 ea             	mov    rdx,r13
 1204343:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
 1204348:	41 ff 54 c0 38       	call   QWORD PTR [r8+rax*8+0x38]
 120434d:	e8 75 65 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
 1204352:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
 1204359:	00 
 120435a:	83 60 e8 00          	and    DWORD PTR [rax-0x18],0x0
 120435e:	48 8d 0d eb ea 77 00 	lea    rcx,[rip+0x77eaeb]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
 1204365:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
 1204369:	0f 57 c0             	xorps  xmm0,xmm0
 120436c:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 120436f:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
 1204373:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 1204378:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
 120437c:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
 1204383:	00 
 1204384:	e8 07 9a 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
 1204389:	48 8b bc 24 f8 04 00 	mov    rdi,QWORD PTR [rsp+0x4f8]
 1204390:	00 
 1204391:	e8 08 a4 89 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
 1204396:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 120439d:	00 00 
 120439f:	48 3b 84 24 70 09 00 	cmp    rax,QWORD PTR [rsp+0x970]
 12043a6:	00 
 12043a7:	0f 85 2c 0b 00 00    	jne    1204ed9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a45d>
 12043ad:	48 81 c4 78 09 00 00 	add    rsp,0x978
 12043b4:	5b                   	pop    rbx
 12043b5:	41 5c                	pop    r12
 12043b7:	41 5d                	pop    r13
 12043b9:	41 5e                	pop    r14
 12043bb:	41 5f                	pop    r15
 12043bd:	5d                   	pop    rbp
 12043be:	c3                   	ret
 12043bf:	48 8d 35 b7 7a 12 ff 	lea    rsi,[rip+0xffffffffff127ab7]        # 32be7d <_ZTSSt12bad_any_cast@@Base-0x6434b>
 12043c6:	4c 89 f7             	mov    rdi,r14
 12043c9:	e8 81 74 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 12043ce:	84 c0                	test   al,al
 12043d0:	4c 89 f3             	mov    rbx,r14
 12043d3:	0f 84 ff 00 00 00    	je     12044d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49a5c>
 12043d9:	45 84 ff             	test   r15b,r15b
 12043dc:	0f 84 f6 00 00 00    	je     12044d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49a5c>
 12043e2:	4c 8b ad e8 11 00 00 	mov    r13,QWORD PTR [rbp+0x11e8]
 12043e9:	4c 8d a4 24 e8 04 00 	lea    r12,[rsp+0x4e8]
 12043f0:	00 
 12043f1:	49 89 ee             	mov    r14,rbp
 12043f4:	49 89 6c 24 f8       	mov    QWORD PTR [r12-0x8],rbp
 12043f9:	4c 89 e7             	mov    rdi,r12
 12043fc:	48 89 de             	mov    rsi,rbx
 12043ff:	e8 86 37 46 00       	call   1667b8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bcf6>
 1204404:	48 8d 9c 24 d0 05 00 	lea    rbx,[rsp+0x5d0]
 120440b:	00 
 120440c:	48 89 df             	mov    rdi,rbx
 120440f:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
 1204414:	e8 77 5e 87 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 1204419:	48 83 a4 24 50 09 00 	and    QWORD PTR [rsp+0x950],0x0
 1204420:	00 00 
 1204422:	48 83 a4 24 60 09 00 	and    QWORD PTR [rsp+0x960],0x0
 1204429:	00 00 
 120442b:	bf 20 01 00 00       	mov    edi,0x120
 1204430:	e8 cb 9a 5e 00       	call   17edf00 <_Znwm@plt>
 1204435:	49 89 c7             	mov    r15,rax
 1204438:	48 8b 84 24 e0 04 00 	mov    rax,QWORD PTR [rsp+0x4e0]
 120443f:	00 
 1204440:	49 89 07             	mov    QWORD PTR [r15],rax
 1204443:	49 8d 6f 08          	lea    rbp,[r15+0x8]
 1204447:	48 89 ef             	mov    rdi,rbp
 120444a:	4c 89 e6             	mov    rsi,r12
 120444d:	e8 ca 36 46 00       	call   1667b1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bc88>
 1204452:	4c 89 ff             	mov    rdi,r15
 1204455:	48 81 c7 f0 00 00 00 	add    rdi,0xf0
 120445c:	48 89 de             	mov    rsi,rbx
 120445f:	e8 2c 5e 87 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 1204464:	48 8d 8c 24 50 09 00 	lea    rcx,[rsp+0x950]
 120446b:	00 
 120446c:	4c 89 39             	mov    QWORD PTR [rcx],r15
 120446f:	48 8d 05 ea 20 00 00 	lea    rax,[rip+0x20ea]        # 1206560 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bae4>
 1204476:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
--
 125779b:	e8 30 85 81 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 12577a0:	e8 0b 83 59 00       	call   17efab0 <__stack_chk_fail@plt>
 12577a5:	cc                   	int3
 12577a6:	53                   	push   rbx
 12577a7:	48 89 fb             	mov    rbx,rdi
 12577aa:	48 83 c7 18          	add    rdi,0x18
 12577ae:	e8 b3 26 58 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 12577b3:	48 89 df             	mov    rdi,rbx
 12577b6:	5b                   	pop    rbx
 12577b7:	e9 64 67 59 00       	jmp    17edf20 <_ZdlPv@plt>
 12577bc:	55                   	push   rbp
 12577bd:	41 57                	push   r15
 12577bf:	41 56                	push   r14
 12577c1:	41 55                	push   r13
 12577c3:	41 54                	push   r12
 12577c5:	53                   	push   rbx
 12577c6:	48 83 ec 68          	sub    rsp,0x68
 12577ca:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 12577d1:	00 00 
 12577d3:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
 12577d8:	80 be 30 09 00 00 00 	cmp    BYTE PTR [rsi+0x930],0x0
 12577df:	0f 84 4b 01 00 00    	je     1257930 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9ceb4>
 12577e5:	49 89 f7             	mov    r15,rsi
 12577e8:	49 89 fe             	mov    r14,rdi
 12577eb:	48 8d 9e 80 0e 00 00 	lea    rbx,[rsi+0xe80]
 12577f2:	48 8d 35 49 ff 12 ff 	lea    rsi,[rip+0xffffffffff12ff49]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
 12577f9:	4c 8d 64 24 30       	lea    r12,[rsp+0x30]
 12577fe:	4c 89 e7             	mov    rdi,r12
 1257801:	e8 78 22 82 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 1257806:	48 89 df             	mov    rdi,rbx
 1257809:	4c 89 e6             	mov    rsi,r12
 125780c:	e8 85 8f 8e ff       	call   b40796 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8d736>
 1257811:	89 c5                	mov    ebp,eax
 1257813:	4c 89 e7             	mov    rdi,r12
 1257816:	e8 75 66 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 125781b:	40 84 ed             	test   bpl,bpl
 125781e:	0f 84 0c 01 00 00    	je     1257930 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9ceb4>
 1257824:	4d 8d a7 c0 04 00 00 	lea    r12,[r15+0x4c0]
 125782b:	49 81 c7 f0 04 00 00 	add    r15,0x4f0
 1257832:	48 8d 35 cf f1 0f ff 	lea    rsi,[rip+0xffffffffff0ff1cf]        # 356a08 <_ZTSSt12bad_any_cast@@Base-0x397c0>
 1257839:	4c 8d 6c 24 30       	lea    r13,[rsp+0x30]
 125783e:	4c 89 ef             	mov    rdi,r13
 1257841:	e8 38 22 82 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 1257846:	4c 89 ff             	mov    rdi,r15
 1257849:	4c 89 ee             	mov    rsi,r13
 125784c:	4c 89 e2             	mov    rdx,r12
 125784f:	e8 88 1d 98 ff       	call   bd95dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12657c>
 1257854:	49 89 c7             	mov    r15,rax
 1257857:	4c 89 ef             	mov    rdi,r13
 125785a:	e8 31 66 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 125785f:	4c 89 ff             	mov    rdi,r15
 1257862:	e8 7b 39 30 00       	call   155b1e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a0766>
 1257867:	84 c0                	test   al,al
 1257869:	0f 84 c1 00 00 00    	je     1257930 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9ceb4>
 125786f:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
 1257873:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
 1257878:	4c 89 fe             	mov    rsi,r15
 125787b:	e8 c0 66 59 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 1257880:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 1257885:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
 125788a:	6a 01                	push   0x1
 125788c:	5a                   	pop    rdx
 125788d:	e8 c6 fb 84 ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 1257892:	48 8d 35 56 38 13 ff 	lea    rsi,[rip+0xffffffffff133856]        # 38b0ef <_ZTSSt12bad_any_cast@@Base-0x50d9>
 1257899:	48 89 e7             	mov    rdi,rsp
 125789c:	e8 dd 21 82 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 12578a1:	49 8b 06             	mov    rax,QWORD PTR [r14]
 12578a4:	4c 8d 0d a1 43 18 ff 	lea    r9,[rip+0xffffffffff1843a1]        # 3dbc4c <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x169b>
 12578ab:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 12578b0:	48 8d 54 24 18       	lea    rdx,[rsp+0x18]
 12578b5:	6a 23                	push   0x23
 12578b7:	59                   	pop    rcx
 12578b8:	49 89 e0             	mov    r8,rsp
 12578bb:	4c 89 f6             	mov    rsi,r14
 12578be:	ff 90 60 01 00 00    	call   QWORD PTR [rax+0x160]
 12578c4:	48 89 e7             	mov    rdi,rsp
 12578c7:	e8 c4 65 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 12578cc:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 12578d1:	e8 12 3d 82 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 12578d6:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
 12578db:	e8 b0 65 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 12578e0:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 12578e5:	48 3b 44 24 38       	cmp    rax,QWORD PTR [rsp+0x38]
 12578ea:	74 3a                	je     1257926 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9ceaa>
 12578ec:	80 38 00             	cmp    BYTE PTR [rax],0x0
 12578ef:	74 0c                	je     12578fd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9ce81>
 12578f1:	80 78 15 00          	cmp    BYTE PTR [rax+0x15],0x0
 12578f5:	75 06                	jne    12578fd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9ce81>
 12578f7:	80 78 11 00          	cmp    BYTE PTR [rax+0x11],0x0
 12578fb:	74 29                	je     1257926 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9ceaa>
 12578fd:	48 8d 35 3e fe 12 ff 	lea    rsi,[rip+0xffffffffff12fe3e]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
 1257904:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 1257909:	e8 70 21 82 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 125790e:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
 1257913:	48 89 df             	mov    rdi,rbx
 1257916:	4c 89 f6             	mov    rsi,r14
 1257919:	e8 06 11 a5 ff       	call   ca8a24 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f59c4>
 125791e:	4c 89 f7             	mov    rdi,r14
 1257921:	e8 6a 65 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1257926:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 125792b:	e8 da 2c cc ff       	call   f1a60a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe1a20>
 1257930:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1257937:	00 00 
 1257939:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
 125793e:	75 64                	jne    12579a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9cf28>
 1257940:	48 83 c4 68          	add    rsp,0x68
 1257944:	5b                   	pop    rbx
 1257945:	41 5c                	pop    r12
 1257947:	41 5d                	pop    r13
 1257949:	41 5e                	pop    r14
 125794b:	41 5f                	pop    r15
 125794d:	5d                   	pop    rbp
 125794e:	c3                   	ret
 125794f:	48 89 c3             	mov    rbx,rax
 1257952:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 1257957:	e8 ae 2c cc ff       	call   f1a60a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe1a20>
 125795c:	eb 2e                	jmp    125798c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9cf10>
 125795e:	48 89 c3             	mov    rbx,rax
 1257961:	48 89 e7             	mov    rdi,rsp
 1257964:	e8 27 65 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1257969:	eb 03                	jmp    125796e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9cef2>
 125796b:	48 89 c3             	mov    rbx,rax
 125796e:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 1257973:	e8 70 3c 82 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 1257978:	eb 03                	jmp    125797d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9cf01>
 125797a:	48 89 c3             	mov    rbx,rax
 125797d:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
 1257982:	e8 09 65 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1257987:	eb 03                	jmp    125798c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9cf10>
 1257989:	48 89 c3             	mov    rbx,rax
 125798c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1257993:	00 00 
 1257995:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
 125799a:	75 08                	jne    12579a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9cf28>
 125799c:	48 89 df             	mov    rdi,rbx
 125799f:	e8 2c 83 81 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 12579a4:	e8 07 81 59 00       	call   17efab0 <__stack_chk_fail@plt>
 12579a9:	cc                   	int3
 12579aa:	41 56                	push   r14
 12579ac:	53                   	push   rbx
 12579ad:	50                   	push   rax
 12579ae:	48 89 fb             	mov    rbx,rdi
 12579b1:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
 12579b5:	48 85 ff             	test   rdi,rdi
 12579b8:	74 1e                	je     12579d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9cf5c>
 12579ba:	4c 8d 73 08          	lea    r14,[rbx+0x8]
 12579be:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12579c1:	4c 89 f6             	mov    rsi,r14
 12579c4:	ff 50 20             	call   QWORD PTR [rax+0x20]
 12579c7:	84 c0                	test   al,al
 12579c9:	74 0d                	je     12579d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9cf5c>
 12579cb:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
 12579cf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12579d2:	4c 89 f6             	mov    rsi,r14
 12579d5:	ff 50 18             	call   QWORD PTR [rax+0x18]
 12579d8:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
 12579dc:	e8 85 24 58 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 12579e1:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
 12579e5:	48 83 c4 08          	add    rsp,0x8
 12579e9:	5b                   	pop    rbx
 12579ea:	41 5e                	pop    r14
 12579ec:	e9 95 6a 84 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
 12579f1:	48 89 c7             	mov    rdi,rax
 12579f4:	e8 ac 20 82 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 12579f9:	cc                   	int3
 12579fa:	53                   	push   rbx
 12579fb:	48 89 fb             	mov    rbx,rdi
 12579fe:	e8 a7 ff ff ff       	call   12579aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9cf2e>
 1257a03:	48 89 df             	mov    rdi,rbx
 1257a06:	5b                   	pop    rbx
 1257a07:	e9 14 65 59 00       	jmp    17edf20 <_ZdlPv@plt>
 1257a0c:	55                   	push   rbp
 1257a0d:	41 57                	push   r15
 1257a0f:	41 56                	push   r14
 1257a11:	41 55                	push   r13
 1257a13:	41 54                	push   r12
 1257a15:	53                   	push   rbx
 1257a16:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
 1257a1d:	49 89 f6             	mov    r14,rsi
 1257a20:	48 89 fb             	mov    rbx,rdi
 1257a23:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
--
 12588a2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12588a5:	4c 89 fe             	mov    rsi,r15
 12588a8:	ff 50 20             	call   QWORD PTR [rax+0x20]
 12588ab:	84 c0                	test   al,al
 12588ad:	75 0c                	jne    12588bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9de3f>
 12588af:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
 12588b2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12588b5:	4c 89 fe             	mov    rsi,r15
 12588b8:	ff 50 10             	call   QWORD PTR [rax+0x10]
 12588bb:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 12588c0:	e8 69 ca 46 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
 12588c5:	eb 08                	jmp    12588cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9de53>
 12588c7:	4c 89 f7             	mov    rdi,r14
 12588ca:	e8 57 60 85 ff       	call   aae926 <JNI_OnUnload@@Base+0x361f3>
 12588cf:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 12588d6:	00 
 12588d7:	e8 52 ca 46 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
 12588dc:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
 12588df:	48 85 ff             	test   rdi,rdi
 12588e2:	0f 84 16 01 00 00    	je     12589fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9df82>
 12588e8:	e8 94 01 00 00       	call   1258a81 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e005>
 12588ed:	89 c5                	mov    ebp,eax
 12588ef:	84 c0                	test   al,al
 12588f1:	74 2e                	je     1258921 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9dea5>
 12588f3:	4c 8d bb 80 0e 00 00 	lea    r15,[rbx+0xe80]
 12588fa:	48 8d 35 41 ee 12 ff 	lea    rsi,[rip+0xffffffffff12ee41]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
 1258901:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
 1258906:	4c 89 e7             	mov    rdi,r12
 1258909:	e8 70 11 82 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 125890e:	4c 89 ff             	mov    rdi,r15
 1258911:	4c 89 e6             	mov    rsi,r12
 1258914:	e8 0b 01 a5 ff       	call   ca8a24 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f59c4>
 1258919:	4c 89 e7             	mov    rdi,r12
 125891c:	e8 6f 55 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1258921:	48 89 1c 24          	mov    QWORD PTR [rsp],rbx
 1258925:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
 125892a:	49 8b 06             	mov    rax,QWORD PTR [r14]
 125892d:	48 8b 40 70          	mov    rax,QWORD PTR [rax+0x70]
 1258931:	48 8b 98 98 01 00 00 	mov    rbx,QWORD PTR [rax+0x198]
 1258938:	4c 8b b0 a0 01 00 00 	mov    r14,QWORD PTR [rax+0x1a0]
 125893f:	49 29 de             	sub    r14,rbx
 1258942:	74 43                	je     1258987 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9df0b>
 1258944:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
 1258948:	4c 8d b8 80 0e 00 00 	lea    r15,[rax+0xe80]
 125894f:	45 31 e4             	xor    r12d,r12d
 1258952:	4e 8b 6c 23 18       	mov    r13,QWORD PTR [rbx+r12*1+0x18]
 1258957:	49 83 e5 fc          	and    r13,0xfffffffffffffffc
 125895b:	40 84 ed             	test   bpl,bpl
 125895e:	74 13                	je     1258973 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9def7>
 1258960:	4c 89 ef             	mov    rdi,r13
 1258963:	48 8d 35 d8 ed 12 ff 	lea    rsi,[rip+0xffffffffff12edd8]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
 125896a:	e8 e0 2e 82 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 125896f:	84 c0                	test   al,al
 1258971:	75 0b                	jne    125897e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9df02>
 1258973:	4c 89 ff             	mov    rdi,r15
 1258976:	4c 89 ee             	mov    rsi,r13
 1258979:	e8 f2 4e 9c ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
 125897e:	49 83 c4 38          	add    r12,0x38
 1258982:	4d 39 e6             	cmp    r14,r12
 1258985:	75 cb                	jne    1258952 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9ded6>
 1258987:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
 125898b:	80 bb 30 09 00 00 00 	cmp    BYTE PTR [rbx+0x930],0x0
 1258992:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
 1258997:	74 65                	je     12589fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9df82>
 1258999:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
 125899c:	e8 e0 00 00 00       	call   1258a81 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e005>
 12589a1:	4d 8b 36             	mov    r14,QWORD PTR [r14]
 12589a4:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
 12589aa:	89 c5                	mov    ebp,eax
 12589ac:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
 12589b2:	6a 18                	push   0x18
 12589b4:	5f                   	pop    rdi
 12589b5:	e8 46 55 59 00       	call   17edf00 <_Znwm@plt>
 12589ba:	48 89 18             	mov    QWORD PTR [rax],rbx
 12589bd:	48 81 c3 d8 04 00 00 	add    rbx,0x4d8
 12589c4:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
 12589c8:	40 88 68 10          	mov    BYTE PTR [rax+0x10],bpl
 12589cc:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
 12589d1:	48 89 03             	mov    QWORD PTR [rbx],rax
 12589d4:	48 8d 05 33 99 90 ff 	lea    rax,[rip+0xffffffffff909933]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
 12589db:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 12589df:	48 8d 05 14 01 00 00 	lea    rax,[rip+0x114]        # 1258afa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e07e>
 12589e6:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 12589ea:	49 8b 7e 70          	mov    rdi,QWORD PTR [r14+0x70]
 12589ee:	48 89 de             	mov    rsi,rbx
 12589f1:	e8 7c ae 34 00       	call   15a3872 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e8df6>
 12589f6:	48 89 df             	mov    rdi,rbx
 12589f9:	e8 44 61 9d ff       	call   c2eb42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17bae2>
 12589fe:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1258a05:	00 00 
 1258a07:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
 1258a0e:	00 
 1258a0f:	75 58                	jne    1258a69 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9dfed>
 1258a11:	48 81 c4 f8 00 00 00 	add    rsp,0xf8
 1258a18:	5b                   	pop    rbx
 1258a19:	41 5c                	pop    r12
 1258a1b:	41 5d                	pop    r13
 1258a1d:	41 5e                	pop    r14
 1258a1f:	41 5f                	pop    r15
 1258a21:	5d                   	pop    rbp
 1258a22:	c3                   	ret
 1258a23:	eb 00                	jmp    1258a25 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9dfa9>
 1258a25:	48 89 c3             	mov    rbx,rax
 1258a28:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 1258a2d:	e8 fc c8 46 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
 1258a32:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 1258a39:	00 
 1258a3a:	e8 ef c8 46 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
 1258a3f:	eb 0d                	jmp    1258a4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9dfd2>
 1258a41:	48 89 c3             	mov    rbx,rax
 1258a44:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 1258a49:	e8 f4 60 9d ff       	call   c2eb42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17bae2>
 1258a4e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1258a55:	00 00 
 1258a57:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
 1258a5e:	00 
 1258a5f:	75 08                	jne    1258a69 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9dfed>
 1258a61:	48 89 df             	mov    rdi,rbx
 1258a64:	e8 67 72 81 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 1258a69:	e8 42 70 59 00       	call   17efab0 <__stack_chk_fail@plt>
 1258a6e:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
 1258a72:	e9 57 fc ff ff       	jmp    12586ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9dc52>
 1258a77:	cc                   	int3
 1258a78:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
 1258a7c:	e9 9d fc ff ff       	jmp    125871e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9dca2>
 1258a81:	41 56                	push   r14
 1258a83:	53                   	push   rbx
 1258a84:	48 83 ec 28          	sub    rsp,0x28
 1258a88:	48 89 fb             	mov    rbx,rdi
 1258a8b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1258a92:	00 00 
 1258a94:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 1258a99:	48 8d 35 d7 27 0f ff 	lea    rsi,[rip+0xffffffffff0f27d7]        # 34b277 <_ZTSSt12bad_any_cast@@Base-0x44f51>
 1258aa0:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
 1258aa5:	4c 89 f7             	mov    rdi,r14
 1258aa8:	e8 d1 0f 82 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 1258aad:	48 8b 7b 70          	mov    rdi,QWORD PTR [rbx+0x70]
 1258ab1:	4c 89 f6             	mov    rsi,r14
 1258ab4:	e8 2b 59 34 00       	call   159e3e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e3968>
 1258ab9:	48 89 c3             	mov    rbx,rax
 1258abc:	4c 89 f7             	mov    rdi,r14
--
 1258b05:	49 89 d6             	mov    r14,rdx
 1258b08:	4c 8b 27             	mov    r12,QWORD PTR [rdi]
 1258b0b:	48 8d ba a8 00 00 00 	lea    rdi,[rdx+0xa8]
 1258b12:	49 8b 74 24 08       	mov    rsi,QWORD PTR [r12+0x8]
 1258b17:	e8 d2 6b 84 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
 1258b1c:	89 c3                	mov    ebx,eax
 1258b1e:	84 c0                	test   al,al
 1258b20:	74 6b                	je     1258b8d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e111>
 1258b22:	49 8d 46 40          	lea    rax,[r14+0x40]
 1258b26:	49 8b 4e 40          	mov    rcx,QWORD PTR [r14+0x40]
 1258b2a:	49 89 cd             	mov    r13,rcx
 1258b2d:	49 83 c5 07          	add    r13,0x7
 1258b31:	f6 c1 01             	test   cl,0x1
 1258b34:	4c 0f 44 e8          	cmove  r13,rax
 1258b38:	49 63 6e 48          	movsxd rbp,DWORD PTR [r14+0x48]
 1258b3c:	48 85 ed             	test   rbp,rbp
 1258b3f:	74 4c                	je     1258b8d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e111>
 1258b41:	48 c1 e5 03          	shl    rbp,0x3
 1258b45:	45 31 f6             	xor    r14d,r14d
 1258b48:	4b 8b 44 35 00       	mov    rax,QWORD PTR [r13+r14*1+0x0]
 1258b4d:	4c 8b 78 18          	mov    r15,QWORD PTR [rax+0x18]
 1258b51:	49 83 e7 fc          	and    r15,0xfffffffffffffffc
 1258b55:	41 80 7c 24 10 00    	cmp    BYTE PTR [r12+0x10],0x0
 1258b5b:	74 13                	je     1258b70 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e0f4>
 1258b5d:	4c 89 ff             	mov    rdi,r15
 1258b60:	48 8d 35 db eb 12 ff 	lea    rsi,[rip+0xffffffffff12ebdb]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
 1258b67:	e8 e3 2c 82 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 1258b6c:	84 c0                	test   al,al
 1258b6e:	75 14                	jne    1258b84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e108>
 1258b70:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 1258b74:	b8 80 0e 00 00       	mov    eax,0xe80
 1258b79:	48 01 c7             	add    rdi,rax
 1258b7c:	4c 89 fe             	mov    rsi,r15
 1258b7f:	e8 ec 4c 9c ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
 1258b84:	49 83 c6 08          	add    r14,0x8
 1258b88:	4c 39 f5             	cmp    rbp,r14
 1258b8b:	75 bb                	jne    1258b48 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e0cc>
 1258b8d:	80 f3 01             	xor    bl,0x1
 1258b90:	89 d8                	mov    eax,ebx
 1258b92:	48 83 c4 08          	add    rsp,0x8
 1258b96:	5b                   	pop    rbx
 1258b97:	41 5c                	pop    r12
 1258b99:	41 5d                	pop    r13
 1258b9b:	41 5e                	pop    r14
 1258b9d:	41 5f                	pop    r15
 1258b9f:	5d                   	pop    rbp
 1258ba0:	c3                   	ret
 1258ba1:	48 89 c7             	mov    rdi,rax
 1258ba4:	e8 fc 0e 82 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 1258ba9:	cc                   	int3
 1258baa:	50                   	push   rax
 1258bab:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 1258bae:	48 83 c7 08          	add    rdi,0x8
 1258bb2:	e8 f1 fe 8c ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
 1258bb7:	58                   	pop    rax
 1258bb8:	c3                   	ret
 1258bb9:	48 89 c7             	mov    rdi,rax
 1258bbc:	e8 e4 0e 82 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 1258bc1:	cc                   	int3
 1258bc2:	53                   	push   rbx
 1258bc3:	48 89 fb             	mov    rbx,rdi
 1258bc6:	e8 87 04 fa ff       	call   11f9052 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e5d6>
 1258bcb:	48 89 df             	mov    rdi,rbx
 1258bce:	5b                   	pop    rbx
 1258bcf:	e9 4c 53 59 00       	jmp    17edf20 <_ZdlPv@plt>
 1258bd4:	41 56                	push   r14
 1258bd6:	53                   	push   rbx
 1258bd7:	48 83 ec 28          	sub    rsp,0x28
 1258bdb:	48 89 f3             	mov    rbx,rsi
 1258bde:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1258be5:	00 00 
 1258be7:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 1258bec:	48 8b 7f 60          	mov    rdi,QWORD PTR [rdi+0x60]
 1258bf0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1258bf3:	ff 50 10             	call   QWORD PTR [rax+0x10]
 1258bf6:	48 81 c3 80 0e 00 00 	add    rbx,0xe80
 1258bfd:	48 8d 35 12 de 0f ff 	lea    rsi,[rip+0xffffffffff0fde12]        # 356a16 <_ZTSSt12bad_any_cast@@Base-0x397b2>
 1258c04:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
 1258c09:	4c 89 f7             	mov    rdi,r14
 1258c0c:	84 c0                	test   al,al
 1258c0e:	74 17                	je     1258c27 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e1ab>
 1258c10:	e8 69 0e 82 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 1258c15:	48 89 df             	mov    rdi,rbx
 1258c18:	4c 89 f6             	mov    rsi,r14
 1258c1b:	e8 0c ae ac ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 1258c20:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 1258c25:	eb 13                	jmp    1258c3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e1be>
 1258c27:	e8 52 0e 82 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 1258c2c:	48 89 df             	mov    rdi,rbx
 1258c2f:	4c 89 f6             	mov    rsi,r14
 1258c32:	e8 ed fd a4 ff       	call   ca8a24 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f59c4>
 1258c37:	4c 89 f7             	mov    rdi,r14
 1258c3a:	e8 51 52 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1258c3f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1258c46:	00 00 
 1258c48:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 1258c4d:	75 2d                	jne    1258c7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e200>
 1258c4f:	48 83 c4 28          	add    rsp,0x28
 1258c53:	5b                   	pop    rbx
 1258c54:	41 5e                	pop    r14
 1258c56:	c3                   	ret
 1258c57:	48 89 c3             	mov    rbx,rax
 1258c5a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 1258c5f:	e8 2c 52 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1258c64:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1258c6b:	00 00 
 1258c6d:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 1258c72:	75 08                	jne    1258c7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e200>
 1258c74:	48 89 df             	mov    rdi,rbx
 1258c77:	e8 54 70 81 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 1258c7c:	e8 2f 6e 59 00       	call   17efab0 <__stack_chk_fail@plt>
 1258c81:	cc                   	int3
 1258c82:	50                   	push   rax
 1258c83:	85 d2                	test   edx,edx
 1258c85:	74 0c                	je     1258c93 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e217>
 1258c87:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]

## ad_disallow direct xrefs after 0x10a7600
 10a7604:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a760b:	00 
 10a760c:	e8 7f 64 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a7611:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a7618:	00 
 10a7619:	e8 72 68 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
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
 10a7666:	00 
 10a7667:	e8 24 68 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a766c:	41 80 be 78 18 00 00 	cmp    BYTE PTR [r14+0x1878],0x0
 10a7673:	00 
 10a7674:	74 72                	je     10a76e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26eafe>
 10a7676:	49 8d be 60 18 00 00 	lea    rdi,[r14+0x1860]
 10a767d:	48 8d 35 87 2e 2b ff 	lea    rsi,[rip+0xffffffffff2b2e87]        # 35a50b <_ZTSSt12bad_any_cast@@Base-0x35cbd>
 10a7684:	e8 c6 41 9d ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10a7689:	84 c0                	test   al,al
 10a768b:	74 5b                	je     10a76e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26eafe>
 10a768d:	48 8d 35 66 1a 29 ff 	lea    rsi,[rip+0xffffffffff291a66]        # 3390fa <_ZTSSt12bad_any_cast@@Base-0x570ce>
 10a7694:	4c 89 ff             	mov    rdi,r15
 10a7697:	e8 b3 41 9d ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10a769c:	84 c0                	test   al,al
 10a769e:	75 48                	jne    10a76e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26eafe>
 10a76a0:	48 8d 35 e6 bc 29 ff 	lea    rsi,[rip+0xffffffffff29bce6]        # 34338d <_ZTSSt12bad_any_cast@@Base-0x4ce3b>
 10a76a7:	4c 89 ff             	mov    rdi,r15
 10a76aa:	e8 c3 b0 a4 ff       	call   af2772 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f712>
 10a76af:	84 c0                	test   al,al
 10a76b1:	75 35                	jne    10a76e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26eafe>
 10a76b3:	48 8d 35 c2 e5 28 ff 	lea    rsi,[rip+0xffffffffff28e5c2]        # 335c7c <_ZTSSt12bad_any_cast@@Base-0x5a54c>
 10a76ba:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a76c1:	00 
 10a76c2:	e8 b7 23 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a76c7:	49 8d be c0 15 00 00 	lea    rdi,[r14+0x15c0]
 10a76ce:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a76d5:	00 
 10a76d6:	e8 b5 63 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a76db:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a76e2:	00 
 10a76e3:	e8 a8 67 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a76e8:	49 8d be 88 14 00 00 	lea    rdi,[r14+0x1488]
 10a76ef:	49 8b b6 c0 10 00 00 	mov    rsi,QWORD PTR [r14+0x10c0]
 10a76f6:	49 8d 96 c8 10 00 00 	lea    rdx,[r14+0x10c8]
 10a76fd:	e8 d0 22 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
 10a7702:	49 8d be a0 14 00 00 	lea    rdi,[r14+0x14a0]
 10a7709:	49 8b b6 d8 10 00 00 	mov    rsi,QWORD PTR [r14+0x10d8]
 10a7710:	49 8d 96 e0 10 00 00 	lea    rdx,[r14+0x10e0]
 10a7717:	e8 b6 22 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
 10a771c:	49 8d be b8 14 00 00 	lea    rdi,[r14+0x14b8]
 10a7723:	49 8b b6 f0 10 00 00 	mov    rsi,QWORD PTR [r14+0x10f0]
 10a772a:	49 8d 96 f8 10 00 00 	lea    rdx,[r14+0x10f8]
 10a7731:	e8 9c 22 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
 10a7736:	49 8d be d0 14 00 00 	lea    rdi,[r14+0x14d0]
 10a773d:	49 8b b6 08 11 00 00 	mov    rsi,QWORD PTR [r14+0x1108]
 10a7744:	49 8d 96 10 11 00 00 	lea    rdx,[r14+0x1110]
 10a774b:	e8 82 22 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
 10a7750:	49 8d be e8 14 00 00 	lea    rdi,[r14+0x14e8]
 10a7757:	49 8b b6 20 11 00 00 	mov    rsi,QWORD PTR [r14+0x1120]
 10a775e:	49 8d 96 28 11 00 00 	lea    rdx,[r14+0x1128]
 10a7765:	e8 68 22 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
 10a776a:	49 8d be 30 15 00 00 	lea    rdi,[r14+0x1530]
 10a7771:	49 8b b6 68 11 00 00 	mov    rsi,QWORD PTR [r14+0x1168]
 10a7778:	49 8d 96 70 11 00 00 	lea    rdx,[r14+0x1170]
 10a777f:	e8 4e 22 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
 10a7784:	49 8d be 48 15 00 00 	lea    rdi,[r14+0x1548]
 10a778b:	49 8b b6 80 11 00 00 	mov    rsi,QWORD PTR [r14+0x1180]
 10a7792:	49 8d 96 88 11 00 00 	lea    rdx,[r14+0x1188]
 10a7799:	e8 34 22 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
 10a779e:	49 8d be 60 15 00 00 	lea    rdi,[r14+0x1560]
 10a77a5:	49 8b b6 98 11 00 00 	mov    rsi,QWORD PTR [r14+0x1198]
 10a77ac:	49 8d 96 a0 11 00 00 	lea    rdx,[r14+0x11a0]

