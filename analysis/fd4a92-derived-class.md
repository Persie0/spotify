# fd4a92 derived class

- candidate AP 0x1842150
- fd4a92 is AP+0x48

## Vtable slice
- +0x0: 0xfd47e6
- +0x8: 0xfd4828
- +0x10: 0x9d7de0
- +0x18: 0x9d7de0
- +0x20: 0xfb290e
- +0x28: 0xfb290e
- +0x30: 0xb3d784
- +0x38: 0xfd483a
- +0x40: 0xf24bfe
- +0x48: 0xfd4a92
- +0x50: None
- +0x58: None

## Code materializations of AP 0x1842150
- materialization count=0

## Writes of AP to object first word
## Direct references to fd4a92
### 0xfd4bfa: call   fd4a92 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bea8>
      fd4bc7:	41 5c                	pop    r12
      fd4bc9:	41 5d                	pop    r13
      fd4bcb:	41 5e                	pop    r14
      fd4bcd:	41 5f                	pop    r15
      fd4bcf:	c3                   	ret
      fd4bd0:	e8 db ae 81 00       	call   17efab0 <__stack_chk_fail@plt>
      fd4bd5:	48 89 c7             	mov    rdi,rax
      fd4bd8:	e8 c8 4e aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      fd4bdd:	cc                   	int3
      fd4bde:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
      fd4be2:	e9 ff fb ff ff       	jmp    fd47e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bbfc>
      fd4be7:	cc                   	int3
      fd4be8:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
      fd4bec:	e9 37 fc ff ff       	jmp    fd4828 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bc3e>
      fd4bf1:	cc                   	int3
      fd4bf2:	53                   	push   rbx
      fd4bf3:	48 89 fb             	mov    rbx,rdi
      fd4bf6:	48 83 c6 f8          	add    rsi,0xfffffffffffffff8
      fd4bfa:	e8 93 fe ff ff       	call   fd4a92 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bea8>
      fd4bff:	48 89 d8             	mov    rax,rbx
      fd4c02:	5b                   	pop    rbx
      fd4c03:	c3                   	ret
      fd4c04:	41 56                	push   r14
      fd4c06:	53                   	push   rbx
      fd4c07:	50                   	push   rax
      fd4c08:	48 89 fb             	mov    rbx,rdi
      fd4c0b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      fd4c0e:	48 85 c0             	test   rax,rax
      fd4c11:	74 21                	je     fd4c34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c04a>
      fd4c13:	84 d2                	test   dl,dl
      fd4c15:	74 1d                	je     fd4c34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c04a>
      fd4c17:	48 89 03             	mov    QWORD PTR [rbx],rax
      fd4c1a:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
      fd4c1e:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
      fd4c22:	48 85 c0             	test   rax,rax
      fd4c25:	74 05                	je     fd4c2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c042>
      fd4c27:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      fd4c2c:	48 83 c4 08          	add    rsp,0x8
      fd4c30:	5b                   	pop    rbx
      fd4c31:	41 5e                	pop    r14
      fd4c33:	c3                   	ret
      fd4c34:	4c 8b 76 10          	mov    r14,QWORD PTR [rsi+0x10]
      fd4c38:	bf 88 00 00 00       	mov    edi,0x88
      fd4c3d:	e8 be 92 81 00       	call   17edf00 <_Znwm@plt>
      fd4c42:	48 89 c2             	mov    rdx,rax
      fd4c45:	0f 57 c0             	xorps  xmm0,xmm0
      fd4c48:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      fd4c4c:	48 8d 0d 6d 5b 86 00 	lea    rcx,[rip+0x865b6d]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>

## Candidate this+0x10 stores in AP constructor neighborhoods
