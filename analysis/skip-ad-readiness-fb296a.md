# Skip Ad readiness discriminator method 0xfb296a

Proven receiver:
- object allocated 0x90 bytes at 0xefb746
- object first word set to vptr/address point 0x183be98 at 0xefb757
- object is later stored as signal-owner outer+0x58
- fd381a/fd38d6 call receiver virtual +0x140
- 0x183be98 + 0x140 = 0xfb296a

## Method FDE (16460138, 16460363)
      fb296a:	55                   	push   rbp
      fb296b:	41 57                	push   r15
      fb296d:	41 56                	push   r14
      fb296f:	53                   	push   rbx
      fb2970:	48 83 ec 28          	sub    rsp,0x28
      fb2974:	89 d5                	mov    ebp,edx
      fb2976:	49 89 f6             	mov    r14,rsi
      fb2979:	48 89 fb             	mov    rbx,rdi
      fb297c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fb2983:	00 00 
      fb2985:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      fb298a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      fb298d:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fb2992:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
      fb2998:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
      fb299d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      fb29a2:	e8 df ba ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb29a7:	4d 85 ff             	test   r15,r15
      fb29aa:	74 4a                	je     fb29f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e0c>
      fb29ac:	49 8b 06             	mov    rax,QWORD PTR [r14]
      fb29af:	48 89 e7             	mov    rdi,rsp
      fb29b2:	4c 89 f6             	mov    rsi,r14
      fb29b5:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
      fb29bb:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
      fb29bf:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      fb29c2:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fb29c7:	89 ea                	mov    edx,ebp
      fb29c9:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
      fb29cf:	49 8b 06             	mov    rax,QWORD PTR [r14]
      fb29d2:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
      fb29d7:	48 89 df             	mov    rdi,rbx
      fb29da:	4c 89 f6             	mov    rsi,r14
      fb29dd:	31 d2                	xor    edx,edx
      fb29df:	ff 90 c8 01 00 00    	call   QWORD PTR [rax+0x1c8]
      fb29e5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      fb29ea:	e8 97 ba ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb29ef:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      fb29f4:	eb 25                	jmp    fb2a1b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e31>
      fb29f6:	49 8b 06             	mov    rax,QWORD PTR [r14]
      fb29f9:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fb29fe:	4c 89 f6             	mov    rsi,r14
      fb2a01:	ff 90 d0 01 00 00    	call   QWORD PTR [rax+0x1d0]
      fb2a07:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]
      fb2a0c:	48 89 df             	mov    rdi,rbx
      fb2a0f:	4c 89 f6             	mov    rsi,r14
      fb2a12:	e8 73 e1 ff ff       	call   fb0b8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177fa0>
      fb2a17:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      fb2a1b:	e8 66 ba ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb2a20:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fb2a27:	00 00 
      fb2a29:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      fb2a2e:	75 0e                	jne    fb2a3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e54>
      fb2a30:	48 89 d8             	mov    rax,rbx
      fb2a33:	48 83 c4 28          	add    rsp,0x28
      fb2a37:	5b                   	pop    rbx
      fb2a38:	41 5e                	pop    r14
      fb2a3a:	41 5f                	pop    r15
      fb2a3c:	5d                   	pop    rbp
      fb2a3d:	c3                   	ret
      fb2a3e:	e8 6d d0 83 00       	call   17efab0 <__stack_chk_fail@plt>
      fb2a43:	48 89 c7             	mov    rdi,rax
      fb2a46:	e8 5a 70 ac ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

## Object-field accesses in 0xfb296a
- 0xfb2992: call   QWORD PTR [rax+0x1c0]
- 0xfb29ac: mov    rax,QWORD PTR [r14]
- 0xfb29b5: call   QWORD PTR [rax+0x1c0]
- 0xfb29c9: call   QWORD PTR [rax+0x98]
- 0xfb29cf: mov    rax,QWORD PTR [r14]
- 0xfb29df: call   QWORD PTR [rax+0x1c8]
- 0xfb29f6: mov    rax,QWORD PTR [r14]
- 0xfb2a01: call   QWORD PTR [rax+0x1d0]
- 0xfb2a17: mov    rdi,QWORD PTR [r14+0x8]

## Calls and nearby context
### call 0xfb2992: call   QWORD PTR [rax+0x1c0]
      fb296f:	53                   	push   rbx
      fb2970:	48 83 ec 28          	sub    rsp,0x28
      fb2974:	89 d5                	mov    ebp,edx
      fb2976:	49 89 f6             	mov    r14,rsi
      fb2979:	48 89 fb             	mov    rbx,rdi
      fb297c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fb2983:	00 00 
      fb2985:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      fb298a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      fb298d:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fb2992:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
      fb2998:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
      fb299d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      fb29a2:	e8 df ba ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb29a7:	4d 85 ff             	test   r15,r15
      fb29aa:	74 4a                	je     fb29f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e0c>
      fb29ac:	49 8b 06             	mov    rax,QWORD PTR [r14]
      fb29af:	48 89 e7             	mov    rdi,rsp
      fb29b2:	4c 89 f6             	mov    rsi,r14
      fb29b5:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
      fb29bb:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
      fb29bf:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      fb29c2:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fb29c7:	89 ea                	mov    edx,ebp
      fb29c9:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
      fb29cf:	49 8b 06             	mov    rax,QWORD PTR [r14]
      fb29d2:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
      fb29d7:	48 89 df             	mov    rdi,rbx
      fb29da:	4c 89 f6             	mov    rsi,r14
      fb29dd:	31 d2                	xor    edx,edx
      fb29df:	ff 90 c8 01 00 00    	call   QWORD PTR [rax+0x1c8]
      fb29e5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      fb29ea:	e8 97 ba ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### call 0xfb29a2: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb2976:	49 89 f6             	mov    r14,rsi
      fb2979:	48 89 fb             	mov    rbx,rdi
      fb297c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fb2983:	00 00 
      fb2985:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      fb298a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      fb298d:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fb2992:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
      fb2998:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
      fb299d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      fb29a2:	e8 df ba ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb29a7:	4d 85 ff             	test   r15,r15
      fb29aa:	74 4a                	je     fb29f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e0c>
      fb29ac:	49 8b 06             	mov    rax,QWORD PTR [r14]
      fb29af:	48 89 e7             	mov    rdi,rsp
      fb29b2:	4c 89 f6             	mov    rsi,r14
      fb29b5:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
      fb29bb:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
      fb29bf:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      fb29c2:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fb29c7:	89 ea                	mov    edx,ebp
      fb29c9:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
      fb29cf:	49 8b 06             	mov    rax,QWORD PTR [r14]
      fb29d2:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
      fb29d7:	48 89 df             	mov    rdi,rbx
      fb29da:	4c 89 f6             	mov    rsi,r14
      fb29dd:	31 d2                	xor    edx,edx
      fb29df:	ff 90 c8 01 00 00    	call   QWORD PTR [rax+0x1c8]
      fb29e5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      fb29ea:	e8 97 ba ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb29ef:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      fb29f4:	eb 25                	jmp    fb2a1b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e31>
      fb29f6:	49 8b 06             	mov    rax,QWORD PTR [r14]

### call 0xfb29b5: call   QWORD PTR [rax+0x1c0]
      fb298d:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fb2992:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
      fb2998:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
      fb299d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      fb29a2:	e8 df ba ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb29a7:	4d 85 ff             	test   r15,r15
      fb29aa:	74 4a                	je     fb29f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e0c>
      fb29ac:	49 8b 06             	mov    rax,QWORD PTR [r14]
      fb29af:	48 89 e7             	mov    rdi,rsp
      fb29b2:	4c 89 f6             	mov    rsi,r14
      fb29b5:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
      fb29bb:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
      fb29bf:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      fb29c2:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fb29c7:	89 ea                	mov    edx,ebp
      fb29c9:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
      fb29cf:	49 8b 06             	mov    rax,QWORD PTR [r14]
      fb29d2:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
      fb29d7:	48 89 df             	mov    rdi,rbx
      fb29da:	4c 89 f6             	mov    rsi,r14
      fb29dd:	31 d2                	xor    edx,edx
      fb29df:	ff 90 c8 01 00 00    	call   QWORD PTR [rax+0x1c8]
      fb29e5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      fb29ea:	e8 97 ba ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb29ef:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      fb29f4:	eb 25                	jmp    fb2a1b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e31>
      fb29f6:	49 8b 06             	mov    rax,QWORD PTR [r14]
      fb29f9:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fb29fe:	4c 89 f6             	mov    rsi,r14
      fb2a01:	ff 90 d0 01 00 00    	call   QWORD PTR [rax+0x1d0]
      fb2a07:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]
      fb2a0c:	48 89 df             	mov    rdi,rbx
      fb2a0f:	4c 89 f6             	mov    rsi,r14

### call 0xfb29c9: call   QWORD PTR [rax+0x98]
      fb29a7:	4d 85 ff             	test   r15,r15
      fb29aa:	74 4a                	je     fb29f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e0c>
      fb29ac:	49 8b 06             	mov    rax,QWORD PTR [r14]
      fb29af:	48 89 e7             	mov    rdi,rsp
      fb29b2:	4c 89 f6             	mov    rsi,r14
      fb29b5:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
      fb29bb:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
      fb29bf:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      fb29c2:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fb29c7:	89 ea                	mov    edx,ebp
      fb29c9:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
      fb29cf:	49 8b 06             	mov    rax,QWORD PTR [r14]
      fb29d2:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
      fb29d7:	48 89 df             	mov    rdi,rbx
      fb29da:	4c 89 f6             	mov    rsi,r14
      fb29dd:	31 d2                	xor    edx,edx
      fb29df:	ff 90 c8 01 00 00    	call   QWORD PTR [rax+0x1c8]
      fb29e5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      fb29ea:	e8 97 ba ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb29ef:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      fb29f4:	eb 25                	jmp    fb2a1b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e31>
      fb29f6:	49 8b 06             	mov    rax,QWORD PTR [r14]
      fb29f9:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fb29fe:	4c 89 f6             	mov    rsi,r14
      fb2a01:	ff 90 d0 01 00 00    	call   QWORD PTR [rax+0x1d0]
      fb2a07:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]
      fb2a0c:	48 89 df             	mov    rdi,rbx
      fb2a0f:	4c 89 f6             	mov    rsi,r14
      fb2a12:	e8 73 e1 ff ff       	call   fb0b8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177fa0>
      fb2a17:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      fb2a1b:	e8 66 ba ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb2a20:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fb2a27:	00 00 

### call 0xfb29df: call   QWORD PTR [rax+0x1c8]
      fb29bb:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
      fb29bf:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      fb29c2:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fb29c7:	89 ea                	mov    edx,ebp
      fb29c9:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
      fb29cf:	49 8b 06             	mov    rax,QWORD PTR [r14]
      fb29d2:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
      fb29d7:	48 89 df             	mov    rdi,rbx
      fb29da:	4c 89 f6             	mov    rsi,r14
      fb29dd:	31 d2                	xor    edx,edx
      fb29df:	ff 90 c8 01 00 00    	call   QWORD PTR [rax+0x1c8]
      fb29e5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      fb29ea:	e8 97 ba ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb29ef:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      fb29f4:	eb 25                	jmp    fb2a1b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e31>
      fb29f6:	49 8b 06             	mov    rax,QWORD PTR [r14]
      fb29f9:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fb29fe:	4c 89 f6             	mov    rsi,r14
      fb2a01:	ff 90 d0 01 00 00    	call   QWORD PTR [rax+0x1d0]
      fb2a07:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]
      fb2a0c:	48 89 df             	mov    rdi,rbx
      fb2a0f:	4c 89 f6             	mov    rsi,r14
      fb2a12:	e8 73 e1 ff ff       	call   fb0b8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177fa0>
      fb2a17:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      fb2a1b:	e8 66 ba ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb2a20:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fb2a27:	00 00 
      fb2a29:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      fb2a2e:	75 0e                	jne    fb2a3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e54>
      fb2a30:	48 89 d8             	mov    rax,rbx
      fb2a33:	48 83 c4 28          	add    rsp,0x28
      fb2a37:	5b                   	pop    rbx
      fb2a38:	41 5e                	pop    r14

### call 0xfb29ea: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb29c2:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fb29c7:	89 ea                	mov    edx,ebp
      fb29c9:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
      fb29cf:	49 8b 06             	mov    rax,QWORD PTR [r14]
      fb29d2:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
      fb29d7:	48 89 df             	mov    rdi,rbx
      fb29da:	4c 89 f6             	mov    rsi,r14
      fb29dd:	31 d2                	xor    edx,edx
      fb29df:	ff 90 c8 01 00 00    	call   QWORD PTR [rax+0x1c8]
      fb29e5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      fb29ea:	e8 97 ba ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb29ef:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      fb29f4:	eb 25                	jmp    fb2a1b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e31>
      fb29f6:	49 8b 06             	mov    rax,QWORD PTR [r14]
      fb29f9:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fb29fe:	4c 89 f6             	mov    rsi,r14
      fb2a01:	ff 90 d0 01 00 00    	call   QWORD PTR [rax+0x1d0]
      fb2a07:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]
      fb2a0c:	48 89 df             	mov    rdi,rbx
      fb2a0f:	4c 89 f6             	mov    rsi,r14
      fb2a12:	e8 73 e1 ff ff       	call   fb0b8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177fa0>
      fb2a17:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      fb2a1b:	e8 66 ba ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb2a20:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fb2a27:	00 00 
      fb2a29:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      fb2a2e:	75 0e                	jne    fb2a3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e54>
      fb2a30:	48 89 d8             	mov    rax,rbx
      fb2a33:	48 83 c4 28          	add    rsp,0x28
      fb2a37:	5b                   	pop    rbx
      fb2a38:	41 5e                	pop    r14
      fb2a3a:	41 5f                	pop    r15
      fb2a3c:	5d                   	pop    rbp

### call 0xfb2a01: call   QWORD PTR [rax+0x1d0]
      fb29da:	4c 89 f6             	mov    rsi,r14
      fb29dd:	31 d2                	xor    edx,edx
      fb29df:	ff 90 c8 01 00 00    	call   QWORD PTR [rax+0x1c8]
      fb29e5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      fb29ea:	e8 97 ba ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb29ef:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      fb29f4:	eb 25                	jmp    fb2a1b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e31>
      fb29f6:	49 8b 06             	mov    rax,QWORD PTR [r14]
      fb29f9:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fb29fe:	4c 89 f6             	mov    rsi,r14
      fb2a01:	ff 90 d0 01 00 00    	call   QWORD PTR [rax+0x1d0]
      fb2a07:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]
      fb2a0c:	48 89 df             	mov    rdi,rbx
      fb2a0f:	4c 89 f6             	mov    rsi,r14
      fb2a12:	e8 73 e1 ff ff       	call   fb0b8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177fa0>
      fb2a17:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      fb2a1b:	e8 66 ba ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb2a20:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fb2a27:	00 00 
      fb2a29:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      fb2a2e:	75 0e                	jne    fb2a3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e54>
      fb2a30:	48 89 d8             	mov    rax,rbx
      fb2a33:	48 83 c4 28          	add    rsp,0x28
      fb2a37:	5b                   	pop    rbx
      fb2a38:	41 5e                	pop    r14
      fb2a3a:	41 5f                	pop    r15
      fb2a3c:	5d                   	pop    rbp
      fb2a3d:	c3                   	ret
      fb2a3e:	e8 6d d0 83 00       	call   17efab0 <__stack_chk_fail@plt>
      fb2a43:	48 89 c7             	mov    rdi,rax
      fb2a46:	e8 5a 70 ac ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      fb2a4b:	cc                   	int3
      fb2a4c:	53                   	push   rbx

### call 0xfb2a12: call   fb0b8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177fa0>
      fb29ea:	e8 97 ba ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb29ef:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      fb29f4:	eb 25                	jmp    fb2a1b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e31>
      fb29f6:	49 8b 06             	mov    rax,QWORD PTR [r14]
      fb29f9:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fb29fe:	4c 89 f6             	mov    rsi,r14
      fb2a01:	ff 90 d0 01 00 00    	call   QWORD PTR [rax+0x1d0]
      fb2a07:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]
      fb2a0c:	48 89 df             	mov    rdi,rbx
      fb2a0f:	4c 89 f6             	mov    rsi,r14
      fb2a12:	e8 73 e1 ff ff       	call   fb0b8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177fa0>
      fb2a17:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      fb2a1b:	e8 66 ba ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb2a20:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fb2a27:	00 00 
      fb2a29:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      fb2a2e:	75 0e                	jne    fb2a3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e54>
      fb2a30:	48 89 d8             	mov    rax,rbx
      fb2a33:	48 83 c4 28          	add    rsp,0x28
      fb2a37:	5b                   	pop    rbx
      fb2a38:	41 5e                	pop    r14
      fb2a3a:	41 5f                	pop    r15
      fb2a3c:	5d                   	pop    rbp
      fb2a3d:	c3                   	ret
      fb2a3e:	e8 6d d0 83 00       	call   17efab0 <__stack_chk_fail@plt>
      fb2a43:	48 89 c7             	mov    rdi,rax
      fb2a46:	e8 5a 70 ac ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      fb2a4b:	cc                   	int3
      fb2a4c:	53                   	push   rbx
      fb2a4d:	49 89 c8             	mov    r8,rcx
      fb2a50:	48 89 d1             	mov    rcx,rdx
      fb2a53:	48 89 fb             	mov    rbx,rdi
      fb2a56:	ba d1 00 00 00       	mov    edx,0xd1

### call 0xfb2a1b: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb29f4:	eb 25                	jmp    fb2a1b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e31>
      fb29f6:	49 8b 06             	mov    rax,QWORD PTR [r14]
      fb29f9:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fb29fe:	4c 89 f6             	mov    rsi,r14
      fb2a01:	ff 90 d0 01 00 00    	call   QWORD PTR [rax+0x1d0]
      fb2a07:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]
      fb2a0c:	48 89 df             	mov    rdi,rbx
      fb2a0f:	4c 89 f6             	mov    rsi,r14
      fb2a12:	e8 73 e1 ff ff       	call   fb0b8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177fa0>
      fb2a17:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      fb2a1b:	e8 66 ba ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb2a20:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fb2a27:	00 00 
      fb2a29:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      fb2a2e:	75 0e                	jne    fb2a3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e54>
      fb2a30:	48 89 d8             	mov    rax,rbx
      fb2a33:	48 83 c4 28          	add    rsp,0x28
      fb2a37:	5b                   	pop    rbx
      fb2a38:	41 5e                	pop    r14
      fb2a3a:	41 5f                	pop    r15
      fb2a3c:	5d                   	pop    rbp
      fb2a3d:	c3                   	ret
      fb2a3e:	e8 6d d0 83 00       	call   17efab0 <__stack_chk_fail@plt>
      fb2a43:	48 89 c7             	mov    rdi,rax
      fb2a46:	e8 5a 70 ac ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      fb2a4b:	cc                   	int3
      fb2a4c:	53                   	push   rbx
      fb2a4d:	49 89 c8             	mov    r8,rcx
      fb2a50:	48 89 d1             	mov    rcx,rdx
      fb2a53:	48 89 fb             	mov    rbx,rdi
      fb2a56:	ba d1 00 00 00       	mov    edx,0xd1
      fb2a5b:	e8 06 00 00 00       	call   fb2a66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e7c>
      fb2a60:	48 89 d8             	mov    rax,rbx

### call 0xfb2a3e: call   17efab0 <__stack_chk_fail@plt>
      fb2a27:	00 00 
      fb2a29:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      fb2a2e:	75 0e                	jne    fb2a3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e54>
      fb2a30:	48 89 d8             	mov    rax,rbx
      fb2a33:	48 83 c4 28          	add    rsp,0x28
      fb2a37:	5b                   	pop    rbx
      fb2a38:	41 5e                	pop    r14
      fb2a3a:	41 5f                	pop    r15
      fb2a3c:	5d                   	pop    rbp
      fb2a3d:	c3                   	ret
      fb2a3e:	e8 6d d0 83 00       	call   17efab0 <__stack_chk_fail@plt>
      fb2a43:	48 89 c7             	mov    rdi,rax
      fb2a46:	e8 5a 70 ac ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      fb2a4b:	cc                   	int3
      fb2a4c:	53                   	push   rbx
      fb2a4d:	49 89 c8             	mov    r8,rcx
      fb2a50:	48 89 d1             	mov    rcx,rdx
      fb2a53:	48 89 fb             	mov    rbx,rdi
      fb2a56:	ba d1 00 00 00       	mov    edx,0xd1
      fb2a5b:	e8 06 00 00 00       	call   fb2a66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e7c>
      fb2a60:	48 89 d8             	mov    rax,rbx
      fb2a63:	5b                   	pop    rbx
      fb2a64:	c3                   	ret
      fb2a65:	cc                   	int3
      fb2a66:	55                   	push   rbp
      fb2a67:	41 57                	push   r15
      fb2a69:	41 56                	push   r14
      fb2a6b:	41 55                	push   r13
      fb2a6d:	41 54                	push   r12
      fb2a6f:	53                   	push   rbx
      fb2a70:	48 83 ec 28          	sub    rsp,0x28
      fb2a74:	4d 89 c7             	mov    r15,r8
      fb2a77:	49 89 cd             	mov    r13,rcx

### call 0xfb2a46: call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      fb2a2e:	75 0e                	jne    fb2a3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e54>
      fb2a30:	48 89 d8             	mov    rax,rbx
      fb2a33:	48 83 c4 28          	add    rsp,0x28
      fb2a37:	5b                   	pop    rbx
      fb2a38:	41 5e                	pop    r14
      fb2a3a:	41 5f                	pop    r15
      fb2a3c:	5d                   	pop    rbp
      fb2a3d:	c3                   	ret
      fb2a3e:	e8 6d d0 83 00       	call   17efab0 <__stack_chk_fail@plt>
      fb2a43:	48 89 c7             	mov    rdi,rax
      fb2a46:	e8 5a 70 ac ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      fb2a4b:	cc                   	int3
      fb2a4c:	53                   	push   rbx
      fb2a4d:	49 89 c8             	mov    r8,rcx
      fb2a50:	48 89 d1             	mov    rcx,rdx
      fb2a53:	48 89 fb             	mov    rbx,rdi
      fb2a56:	ba d1 00 00 00       	mov    edx,0xd1
      fb2a5b:	e8 06 00 00 00       	call   fb2a66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e7c>
      fb2a60:	48 89 d8             	mov    rax,rbx
      fb2a63:	5b                   	pop    rbx
      fb2a64:	c3                   	ret
      fb2a65:	cc                   	int3
      fb2a66:	55                   	push   rbp
      fb2a67:	41 57                	push   r15
      fb2a69:	41 56                	push   r14
      fb2a6b:	41 55                	push   r13
      fb2a6d:	41 54                	push   r12
      fb2a6f:	53                   	push   rbx
      fb2a70:	48 83 ec 28          	sub    rsp,0x28
      fb2a74:	4d 89 c7             	mov    r15,r8
      fb2a77:	49 89 cd             	mov    r13,rcx
      fb2a7a:	49 89 d4             	mov    r12,rdx
      fb2a7d:	49 89 f6             	mov    r14,rsi

## String/high-address references in method

## Constructor window for receiver 0x90-byte object
      efb73a:	48 8d 1d 57 07 94 00 	lea    rbx,[rip+0x940757]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      efb741:	bf 90 00 00 00       	mov    edi,0x90
      efb746:	e8 b5 27 8f 00       	call   17edf00 <_Znwm@plt>
      efb74b:	49 89 c6             	mov    r14,rax
      efb74e:	66 0f ef c0          	pxor   xmm0,xmm0
      efb752:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      efb757:	48 89 18             	mov    QWORD PTR [rax],rbx
      efb75a:	0f 28 84 24 90 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x190]
      efb761:	00 
      efb762:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
      efb769:	00 
      efb76a:	48 8b 84 24 98 01 00 	mov    rax,QWORD PTR [rsp+0x198]
      efb771:	00 
      efb772:	48 85 c0             	test   rax,rax
      efb775:	74 05                	je     efb77c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2b92>
      efb777:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efb77c:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      efb783:	00 
      efb784:	48 8d b4 24 c0 0a 00 	lea    rsi,[rsp+0xac0]
      efb78b:	00 
      efb78c:	e8 ff ea b7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      efb791:	48 83 a4 24 30 07 00 	and    QWORD PTR [rsp+0x730],0x0
      efb798:	00 00 
      efb79a:	6a 40                	push   0x40
      efb79c:	5f                   	pop    rdi
      efb79d:	e8 5e 27 8f 00       	call   17edf00 <_Znwm@plt>
      efb7a2:	48 89 c3             	mov    rbx,rax
      efb7a5:	4d 89 f7             	mov    r15,r14
      efb7a8:	49 83 c7 20          	add    r15,0x20
      efb7ac:	48 8d 05 75 af 93 00 	lea    rax,[rip+0x93af75]        # 1836728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x86c0>
      efb7b3:	48 89 03             	mov    QWORD PTR [rbx],rax
      efb7b6:	48 89 df             	mov    rdi,rbx
      efb7b9:	48 83 c7 10          	add    rdi,0x10
      efb7bd:	48 8d b4 24 40 02 00 	lea    rsi,[rsp+0x240]
      efb7c4:	00 
      efb7c5:	e8 de 30 00 00       	call   efe8a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5cbe>
      efb7ca:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      efb7d1:	00 
      efb7d2:	48 89 5e 20          	mov    QWORD PTR [rsi+0x20],rbx
      efb7d6:	4c 89 ff             	mov    rdi,r15
      efb7d9:	0f 28 84 24 a0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xa0]
      efb7e0:	00 
      efb7e1:	e8 ce 61 04 00       	call   f419b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108dca>
      efb7e6:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      efb7ed:	00 
      efb7ee:	48 89 df             	mov    rdi,rbx
      efb7f1:	e8 74 e7 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efb7f6:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      efb7fd:	00 
      efb7fe:	e8 67 e7 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
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

## Writes into receiver object before publication
- 0xefb910: mov    QWORD PTR [r14],rax
- 0xefb95f: mov    QWORD PTR [r14+0x18],rax
- 0xefb972: movdqu XMMWORD PTR [r14+0x28],xmm1
- 0xefb97f: mov    QWORD PTR [r14+0x20],rax
- 0xefb98c: movdqu XMMWORD PTR [r14+0x38],xmm0
- 0xefb99e: lock inc QWORD PTR [r15+0x8]
- 0xefb9aa: mov    QWORD PTR [r14+0x18],rax
- 0xefb9be: mov    QWORD PTR [r14+0x20],rax
- 0xefb9d1: mov    QWORD PTR [r14+0x18],rax
- 0xefb9df: mov    QWORD PTR [r14+0x20],rax
- 0xefbaa4: movups XMMWORD PTR [r14+0x8],xmm0
- 0xefbab0: mov    QWORD PTR [r14],rax
- 0xefbaba: mov    QWORD PTR [r14+0x20],rax
- 0xefbb45: lock inc QWORD PTR [r15+0x8]
- 0xefbb83: movdqu XMMWORD PTR [r15+0x8],xmm0
- 0xefbb90: mov    QWORD PTR [r15],rax
- 0xefbddb: mov    QWORD PTR [r14],rax
- 0xefbdf9: mov    QWORD PTR [r14+0x18],rax
- 0xefbdfd: movdqu XMMWORD PTR [r14+0x28],xmm1
- 0xefbe0a: mov    QWORD PTR [r14+0x20],rax
- 0xefbe0e: movdqu XMMWORD PTR [r14+0x38],xmm0
- 0xefbe2c: mov    QWORD PTR [r14+0x18],rax
- 0xefbe37: mov    QWORD PTR [r14+0x20],rax
- 0xefbe47: mov    QWORD PTR [r14+0x18],rax
- 0xefbe52: mov    QWORD PTR [r14+0x20],rax
- 0xefbe6a: movdqu XMMWORD PTR [r14+0x48],xmm0
- 0xefbede: mov    BYTE PTR [r14+0x1a0],al
- 0xefbee9: movdqu XMMWORD PTR [r14+0x80],xmm0
- 0xefbef2: movdqu XMMWORD PTR [r14+0x90],xmm0
- 0xefbefb: movdqu XMMWORD PTR [r14+0xa0],xmm0
- 0xefbf04: mov    BYTE PTR [r14+0xb0],al
- 0xefbf0b: and    QWORD PTR [r14+0x1a8],0x0
- 0xefbf13: and    QWORD PTR [r14+0x1ae],0x0
- 0xefbf41: movdqa XMMWORD PTR [r15],xmm1
- 0xefbfc3: mov    QWORD PTR [r14],rax
- 0xefbfe1: mov    QWORD PTR [r14+0x18],rax
- 0xefbfe5: movdqu XMMWORD PTR [r14+0x28],xmm1
- 0xefbff2: mov    QWORD PTR [r14+0x20],rax
- 0xefbff6: movdqu XMMWORD PTR [r14+0x38],xmm0
- 0xefc014: mov    QWORD PTR [r14+0x18],rax
- 0xefc01f: mov    QWORD PTR [r14+0x20],rax
- 0xefc02f: mov    QWORD PTR [r14+0x18],rax
- 0xefc03a: mov    QWORD PTR [r14+0x20],rax
- 0xefc0a2: mov    BYTE PTR [r14+0x70],al
- 0xefc0a6: mov    BYTE PTR [r14+0x160],al
- 0xefc0ad: mov    BYTE PTR [r14+0x168],al
- 0xefc0b4: mov    BYTE PTR [r14+0x170],al
- 0xefc0bb: mov    BYTE PTR [r14+0x178],al
- 0xefc0e8: movdqa XMMWORD PTR [r15],xmm1
- 0xefc38f: lock inc QWORD PTR [r15+0x8]
- 0xefc54c: movdqa XMMWORD PTR [r14],xmm1
- 0xefc651: mov    QWORD PTR [r14],rax
- 0xefc693: mov    QWORD PTR [r14+0x18],rax
- 0xefc69b: movdqu XMMWORD PTR [r14+0x28],xmm1
- 0xefc6a8: mov    QWORD PTR [r14+0x20],rax
- 0xefc6ac: movdqu XMMWORD PTR [r14+0x38],xmm0
- 0xefc6ca: mov    QWORD PTR [r14+0x18],rax
- 0xefc6d5: mov    QWORD PTR [r14+0x20],rax
- 0xefc6e5: mov    QWORD PTR [r14+0x18],rax
- 0xefc6f0: mov    QWORD PTR [r14+0x20],rax
- 0xefc6fc: movups XMMWORD PTR [r14+0x48],xmm0

## Direct callers / vtable slot refs to method
