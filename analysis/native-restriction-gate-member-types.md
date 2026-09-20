# Restriction-owner gate member types

Owner constructor passes owner+0x38 to 0x10a5fec.
Therefore relative +0x438/+0x440/+0x448 inside that subobject correspond owner +0x470/+0x478/+0x480,
and relative +0x560 corresponds owner +0x598.

## subobject base initializer: 0x1088fd0
Function 0x1088fd0..0x108903f
     1088fd0:	41 56                	push   r14
     1088fd2:	53                   	push   rbx
     1088fd3:	50                   	push   rax
     1088fd4:	48 89 fb             	mov    rbx,rdi
     1088fd7:	c6 07 01             	mov    BYTE PTR [rdi],0x1
     1088fda:	83 67 08 00          	and    DWORD PTR [rdi+0x8],0x0
     1088fde:	31 c0                	xor    eax,eax
     1088fe0:	88 47 10             	mov    BYTE PTR [rdi+0x10],al
     1088fe3:	88 87 60 05 00 00    	mov    BYTE PTR [rdi+0x560],al
     1088fe9:	48 81 c7 68 05 00 00 	add    rdi,0x568
     1088ff0:	4c 8d b3 00 06 00 00 	lea    r14,[rbx+0x600]
     1088ff7:	0f 57 c0             	xorps  xmm0,xmm0
     1088ffa:	0f 11 83 00 06 00 00 	movups XMMWORD PTR [rbx+0x600],xmm0
     1089001:	83 63 01 00          	and    DWORD PTR [rbx+0x1],0x0
     1089005:	ba 90 00 00 00       	mov    edx,0x90
     108900a:	31 f6                	xor    esi,esi
     108900c:	e8 7f 5b 76 00       	call   17eeb90 <memset@plt>
     1089011:	4c 89 b3 f8 05 00 00 	mov    QWORD PTR [rbx+0x5f8],r14
     1089018:	48 8d 83 18 06 00 00 	lea    rax,[rbx+0x618]
     108901f:	0f 57 c0             	xorps  xmm0,xmm0
     1089022:	0f 11 83 18 06 00 00 	movups XMMWORD PTR [rbx+0x618],xmm0
     1089029:	48 89 83 10 06 00 00 	mov    QWORD PTR [rbx+0x610],rax
     1089030:	0f 11 83 28 06 00 00 	movups XMMWORD PTR [rbx+0x628],xmm0
     1089037:	48 83 c4 08          	add    rsp,0x8
     108903b:	5b                   	pop    rbx
     108903c:	41 5e                	pop    r14
     108903e:	c3                   	ret

## +0x598 initialization dataflow

### 0x1088fe3: mov    BYTE PTR [rdi+0x560],al
     1088fd0:	41 56                	push   r14
     1088fd2:	53                   	push   rbx
     1088fd3:	50                   	push   rax
     1088fd4:	48 89 fb             	mov    rbx,rdi
     1088fd7:	c6 07 01             	mov    BYTE PTR [rdi],0x1
     1088fda:	83 67 08 00          	and    DWORD PTR [rdi+0x8],0x0
     1088fde:	31 c0                	xor    eax,eax
     1088fe0:	88 47 10             	mov    BYTE PTR [rdi+0x10],al
     1088fe3:	88 87 60 05 00 00    	mov    BYTE PTR [rdi+0x560],al
     1088fe9:	48 81 c7 68 05 00 00 	add    rdi,0x568
     1088ff0:	4c 8d b3 00 06 00 00 	lea    r14,[rbx+0x600]
     1088ff7:	0f 57 c0             	xorps  xmm0,xmm0
     1088ffa:	0f 11 83 00 06 00 00 	movups XMMWORD PTR [rbx+0x600],xmm0
     1089001:	83 63 01 00          	and    DWORD PTR [rbx+0x1],0x0
     1089005:	ba 90 00 00 00       	mov    edx,0x90
     108900a:	31 f6                	xor    esi,esi
     108900c:	e8 7f 5b 76 00       	call   17eeb90 <memset@plt>
     1089011:	4c 89 b3 f8 05 00 00 	mov    QWORD PTR [rbx+0x5f8],r14
     1089018:	48 8d 83 18 06 00 00 	lea    rax,[rbx+0x618]
     108901f:	0f 57 c0             	xorps  xmm0,xmm0
     1089022:	0f 11 83 18 06 00 00 	movups XMMWORD PTR [rbx+0x618],xmm0
     1089029:	48 89 83 10 06 00 00 	mov    QWORD PTR [rbx+0x610],rax
     1089030:	0f 11 83 28 06 00 00 	movups XMMWORD PTR [rbx+0x628],xmm0

## Constructor-chain accesses near owner +0x470 / +0x478

- none in first-level constructor helpers

## Owner-region references to +0x470/+0x478/+0x480

### 0x10a64c0 in 0x10a6464..0x10a7f52: lea    rax,[rsp+0x478]
     10a64a7:	0f 57 c0             	xorps  xmm0,xmm0
     10a64aa:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a64ad:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a64b1:	48 8d 84 24 60 04 00 	lea    rax,[rsp+0x460]
     10a64b8:	00 
     10a64b9:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a64bc:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a64c0:	48 8d 84 24 78 04 00 	lea    rax,[rsp+0x478]
     10a64c7:	00 
     10a64c8:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a64cb:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a64cf:	48 8d 84 24 90 04 00 	lea    rax,[rsp+0x490]
     10a64d6:	00 
     10a64d7:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a64da:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a64de:	48 8d 84 24 a8 04 00 	lea    rax,[rsp+0x4a8]
     10a64e5:	00 

### 0x10a6810 in 0x10a6464..0x10a7f52: mov    eax,DWORD PTR [rsp+0x478]
     10a67f9:	e8 38 50 9d ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     10a67fe:	4c 89 ff             	mov    rdi,r15
     10a6801:	48 89 c6             	mov    rsi,rax
     10a6804:	e8 37 ec 61 00       	call   16c5440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x795ac>
     10a6809:	84 c0                	test   al,al
     10a680b:	74 19                	je     10a6826 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dc3c>
     10a680d:	41 b7 01             	mov    r15b,0x1
     10a6810:	8b 84 24 78 04 00 00 	mov    eax,DWORD PTR [rsp+0x478]
     10a6817:	83 f8 04             	cmp    eax,0x4
     10a681a:	74 0d                	je     10a6829 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dc3f>
     10a681c:	83 f8 09             	cmp    eax,0x9
     10a681f:	74 08                	je     10a6829 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dc3f>
     10a6821:	83 f8 64             	cmp    eax,0x64
     10a6824:	74 03                	je     10a6829 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dc3f>
     10a6826:	45 31 ff             	xor    r15d,r15d
     10a6829:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6830:	00 

### 0x10a6d3f in 0x10a6464..0x10a7f52: cmp    DWORD PTR [rsp+0x478],0x3e
     10a6d28:	4c 89 ff             	mov    rdi,r15
     10a6d2b:	e8 06 4b 9d ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     10a6d30:	4c 89 e7             	mov    rdi,r12
     10a6d33:	48 89 c6             	mov    rsi,rax
     10a6d36:	e8 05 e7 61 00       	call   16c5440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x795ac>
     10a6d3b:	84 c0                	test   al,al
     10a6d3d:	74 36                	je     10a6d75 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e18b>
     10a6d3f:	83 bc 24 78 04 00 00 	cmp    DWORD PTR [rsp+0x478],0x3e
     10a6d46:	3e 
     10a6d47:	75 2c                	jne    10a6d75 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e18b>
     10a6d49:	48 8d 35 98 80 39 ff 	lea    rsi,[rip+0xffffffffff398098]        # 43ede8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x49f4>
     10a6d50:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a6d55:	e8 24 2d 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6d5a:	49 8d be 30 15 00 00 	lea    rdi,[r14+0x1530]
     10a6d61:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a6d66:	e8 25 6d d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6d6b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]

### 0x10a6e0d in 0x10a6464..0x10a7f52: mov    eax,DWORD PTR [rsp+0x478]
     10a6df2:	49 8d be 90 00 00 00 	lea    rdi,[r14+0x90]
     10a6df9:	e8 38 4a 9d ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     10a6dfe:	4c 89 e7             	mov    rdi,r12
     10a6e01:	48 89 c6             	mov    rsi,rax
     10a6e04:	e8 37 e6 61 00       	call   16c5440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x795ac>
     10a6e09:	84 c0                	test   al,al
     10a6e0b:	74 70                	je     10a6e7d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e293>
     10a6e0d:	8b 84 24 78 04 00 00 	mov    eax,DWORD PTR [rsp+0x478]
     10a6e14:	83 f8 3f             	cmp    eax,0x3f
     10a6e17:	75 33                	jne    10a6e4c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e262>
     10a6e19:	48 8d 35 87 4c 2c ff 	lea    rsi,[rip+0xffffffffff2c4c87]        # 36baa7 <_ZTSSt12bad_any_cast@@Base-0x24721>
     10a6e20:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a6e25:	e8 54 2c 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6e2a:	49 8d be 48 15 00 00 	lea    rdi,[r14+0x1548]
     10a6e31:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a6e36:	e8 55 6c d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6e3b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]

### 0x10a6e45 in 0x10a6464..0x10a7f52: mov    eax,DWORD PTR [rsp+0x478]
     10a6e20:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a6e25:	e8 54 2c 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6e2a:	49 8d be 48 15 00 00 	lea    rdi,[r14+0x1548]
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

### 0x10a7056 in 0x10a6464..0x10a7f52: lea    rsi,[r14+0x478]
     10a7035:	e9 cf 00 00 00       	jmp    10a7109 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e51f>
     10a703a:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a7041:	00 
     10a7042:	0f 84 c1 00 00 00    	je     10a7109 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e51f>
     10a7048:	41 80 be 88 05 00 00 	cmp    BYTE PTR [r14+0x588],0x0
     10a704f:	00 
     10a7050:	0f 84 b3 00 00 00    	je     10a7109 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e51f>
     10a7056:	49 8d b6 78 04 00 00 	lea    rsi,[r14+0x478]
     10a705d:	4c 8d a4 24 40 04 00 	lea    r12,[rsp+0x440]
     10a7064:	00 
     10a7065:	4c 89 e7             	mov    rdi,r12
     10a7068:	e8 fc 1c 3e 00       	call   1488d69 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce2ed>
     10a706d:	41 83 3c 24 09       	cmp    DWORD PTR [r12],0x9
     10a7072:	0f 85 84 00 00 00    	jne    10a70fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e512>
     10a7078:	48 8d 35 69 07 2d ff 	lea    rsi,[rip+0xffffffffff2d0769]        # 3777e8 <_ZTSSt12bad_any_cast@@Base-0x189e0>
     10a707f:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a7084:	e8 f5 29 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>

### 0x10a74a0 in 0x10a6464..0x10a7f52: cmp    BYTE PTR [r14+0x470],0x0
     10a7480:	e8 0b 66 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7485:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a748c:	00 
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

### 0x10a9677 in 0x10a9668..0x10a969c: cmp    BYTE PTR [rdi+0x470],0x0
     10a9660:	41 5f                	pop    r15
     10a9662:	c3                   	ret
     10a9663:	e8 48 64 74 00       	call   17efab0 <__stack_chk_fail@plt>
     10a9668:	80 7e 38 06          	cmp    BYTE PTR [rsi+0x38],0x6
     10a966c:	75 2d                	jne    10a969b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ab1>
     10a966e:	80 bf 98 05 00 00 00 	cmp    BYTE PTR [rdi+0x598],0x0
     10a9675:	74 1c                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9677:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
     10a967e:	74 13                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9680:	48 8b 87 38 04 00 00 	mov    rax,QWORD PTR [rdi+0x438]
     10a9687:	48 85 c0             	test   rax,rax
     10a968a:	74 07                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a968c:	c6 80 b8 01 00 00 01 	mov    BYTE PTR [rax+0x1b8],0x1
     10a9693:	6a 01                	push   0x1
     10a9695:	5e                   	pop    rsi
     10a9696:	e9 c9 cd ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a969b:	c3                   	ret


## Field-type correction around owner+0x470

- owner+0x478 is passed as the std::string argument to 0x1488d69, which repeatedly compares it with libc++ string constants
- therefore the string begins at owner+0x478, not owner+0x470
- owner+0x470 is an adjacent state field eight bytes before that string; the restriction builder only tests its first byte for zero/nonzero
- its exact type/meaning remains open until its writer is identified

## consumer called with owner+0x478: 0x1488d69
Function 0x1488d69..0x1488ef9
     1488d69:	41 56                	push   r14
     1488d6b:	53                   	push   rbx
     1488d6c:	50                   	push   rax
     1488d6d:	49 89 f6             	mov    r14,rsi
     1488d70:	48 89 fb             	mov    rbx,rdi
     1488d73:	48 8d 35 86 e4 fa fe 	lea    rsi,[rip+0xfffffffffefae486]        # 437200 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5cc4f>
     1488d7a:	4c 89 f7             	mov    rdi,r14
     1488d7d:	e8 6c 69 61 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     1488d82:	84 c0                	test   al,al
     1488d84:	74 07                	je     1488d8d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce311>
     1488d86:	6a 01                	push   0x1
     1488d88:	e9 3e 01 00 00       	jmp    1488ecb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce44f>
     1488d8d:	48 8d 35 84 e4 fa fe 	lea    rsi,[rip+0xfffffffffefae484]        # 437218 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5cc67>
     1488d94:	4c 89 f7             	mov    rdi,r14
     1488d97:	e8 52 69 61 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     1488d9c:	84 c0                	test   al,al
     1488d9e:	74 07                	je     1488da7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce32b>
     1488da0:	6a 02                	push   0x2
     1488da2:	e9 24 01 00 00       	jmp    1488ecb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce44f>
     1488da7:	48 8d 35 82 e4 fa fe 	lea    rsi,[rip+0xfffffffffefae482]        # 437230 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5cc7f>
     1488dae:	4c 89 f7             	mov    rdi,r14
     1488db1:	e8 38 69 61 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     1488db6:	84 c0                	test   al,al
     1488db8:	74 07                	je     1488dc1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce345>
     1488dba:	6a 03                	push   0x3
     1488dbc:	e9 0a 01 00 00       	jmp    1488ecb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce44f>
     1488dc1:	48 8d 35 80 e4 fa fe 	lea    rsi,[rip+0xfffffffffefae480]        # 437248 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5cc97>
     1488dc8:	4c 89 f7             	mov    rdi,r14
     1488dcb:	e8 1e 69 61 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     1488dd0:	84 c0                	test   al,al
     1488dd2:	74 07                	je     1488ddb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce35f>
     1488dd4:	6a 04                	push   0x4
     1488dd6:	e9 f0 00 00 00       	jmp    1488ecb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce44f>
     1488ddb:	48 8d 35 7e e4 fa fe 	lea    rsi,[rip+0xfffffffffefae47e]        # 437260 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5ccaf>
     1488de2:	4c 89 f7             	mov    rdi,r14
     1488de5:	e8 04 69 61 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     1488dea:	84 c0                	test   al,al
     1488dec:	74 07                	je     1488df5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce379>
     1488dee:	6a 05                	push   0x5
     1488df0:	e9 d6 00 00 00       	jmp    1488ecb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce44f>
     1488df5:	48 8d 35 7c e4 fa fe 	lea    rsi,[rip+0xfffffffffefae47c]        # 437278 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5ccc7>
     1488dfc:	4c 89 f7             	mov    rdi,r14
     1488dff:	e8 ea 68 61 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     1488e04:	84 c0                	test   al,al
     1488e06:	74 07                	je     1488e0f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce393>
     1488e08:	6a 06                	push   0x6
     1488e0a:	e9 bc 00 00 00       	jmp    1488ecb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce44f>
     1488e0f:	48 8d 35 7a e4 fa fe 	lea    rsi,[rip+0xfffffffffefae47a]        # 437290 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5ccdf>
     1488e16:	4c 89 f7             	mov    rdi,r14
     1488e19:	e8 d0 68 61 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     1488e1e:	84 c0                	test   al,al
     1488e20:	74 07                	je     1488e29 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce3ad>
     1488e22:	6a 07                	push   0x7
     1488e24:	e9 a2 00 00 00       	jmp    1488ecb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce44f>
     1488e29:	48 8d 35 78 e4 fa fe 	lea    rsi,[rip+0xfffffffffefae478]        # 4372a8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5ccf7>
     1488e30:	4c 89 f7             	mov    rdi,r14
     1488e33:	e8 b6 68 61 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     1488e38:	84 c0                	test   al,al
     1488e3a:	74 07                	je     1488e43 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce3c7>
     1488e3c:	6a 08                	push   0x8
     1488e3e:	e9 88 00 00 00       	jmp    1488ecb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce44f>
     1488e43:	48 8d 35 76 e4 fa fe 	lea    rsi,[rip+0xfffffffffefae476]        # 4372c0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5cd0f>
     1488e4a:	4c 89 f7             	mov    rdi,r14
     1488e4d:	e8 9c 68 61 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     1488e52:	84 c0                	test   al,al
     1488e54:	74 04                	je     1488e5a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce3de>
     1488e56:	6a 09                	push   0x9
     1488e58:	eb 71                	jmp    1488ecb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce44f>
     1488e5a:	48 8d 35 77 e4 fa fe 	lea    rsi,[rip+0xfffffffffefae477]        # 4372d8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5cd27>
     1488e61:	4c 89 f7             	mov    rdi,r14
     1488e64:	e8 85 68 61 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     1488e69:	84 c0                	test   al,al
     1488e6b:	74 04                	je     1488e71 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce3f5>
     1488e6d:	6a 0a                	push   0xa
     1488e6f:	eb 5a                	jmp    1488ecb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce44f>
     1488e71:	48 8d 35 78 e4 fa fe 	lea    rsi,[rip+0xfffffffffefae478]        # 4372f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5cd3f>
     1488e78:	4c 89 f7             	mov    rdi,r14
     1488e7b:	e8 6e 68 61 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     1488e80:	84 c0                	test   al,al
     1488e82:	74 04                	je     1488e88 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce40c>
     1488e84:	6a 0b                	push   0xb
     1488e86:	eb 43                	jmp    1488ecb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce44f>
     1488e88:	48 8d 35 79 e4 fa fe 	lea    rsi,[rip+0xfffffffffefae479]        # 437308 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5cd57>
     1488e8f:	4c 89 f7             	mov    rdi,r14
     1488e92:	e8 57 68 61 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     1488e97:	84 c0                	test   al,al
     1488e99:	74 04                	je     1488e9f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce423>
     1488e9b:	6a 0c                	push   0xc
     1488e9d:	eb 2c                	jmp    1488ecb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce44f>
     1488e9f:	48 8d 35 7a e4 fa fe 	lea    rsi,[rip+0xfffffffffefae47a]        # 437320 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5cd6f>
     1488ea6:	4c 89 f7             	mov    rdi,r14
     1488ea9:	e8 40 68 61 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     1488eae:	84 c0                	test   al,al
     1488eb0:	74 04                	je     1488eb6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce43a>
     1488eb2:	6a 0d                	push   0xd
     1488eb4:	eb 15                	jmp    1488ecb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce44f>
     1488eb6:	48 8d 35 7b e4 fa fe 	lea    rsi,[rip+0xfffffffffefae47b]        # 437338 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5cd87>
     1488ebd:	4c 89 f7             	mov    rdi,r14
     1488ec0:	e8 29 68 61 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     1488ec5:	84 c0                	test   al,al
     1488ec7:	74 15                	je     1488ede <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce462>
     1488ec9:	6a 0e                	push   0xe
     1488ecb:	58                   	pop    rax
     1488ecc:	89 03                	mov    DWORD PTR [rbx],eax
     1488ece:	31 c0                	xor    eax,eax
     1488ed0:	88 43 08             	mov    BYTE PTR [rbx+0x8],al
     1488ed3:	88 43 60             	mov    BYTE PTR [rbx+0x60],al
     1488ed6:	48 83 c4 08          	add    rsp,0x8
     1488eda:	5b                   	pop    rbx
     1488edb:	41 5e                	pop    r14
     1488edd:	c3                   	ret
     1488ede:	48 8d 35 6b e4 fa fe 	lea    rsi,[rip+0xfffffffffefae46b]        # 437350 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5cd9f>
     1488ee5:	4c 89 f7             	mov    rdi,r14
     1488ee8:	e8 01 68 61 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     1488eed:	31 c9                	xor    ecx,ecx
     1488eef:	84 c0                	test   al,al
     1488ef1:	6a 0f                	push   0xf
     1488ef3:	58                   	pop    rax
     1488ef4:	0f 44 c1             	cmove  eax,ecx
     1488ef7:	eb d3                	jmp    1488ecc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce450>

## Address-taking sites for potential +0x470 mutation

### 0x105a45c: lea    rdx,[rax+0x470]
     105a447:	48 8d 94 24 38 01 00 	lea    rdx,[rsp+0x138]
     105a44e:	00 
     105a44f:	48 89 df             	mov    rdi,rbx
     105a452:	e8 09 31 dd ff       	call   e2d560 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa5e6>
     105a457:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     105a45c:	48 8d 90 70 04 00 00 	lea    rdx,[rax+0x470]
     105a463:	48 8d 35 ef b9 2c ff 	lea    rsi,[rip+0xffffffffff2cb9ef]        # 325e59 <_ZTSSt12bad_any_cast@@Base-0x6a36f>
     105a46a:	48 89 df             	mov    rdi,rbx
     105a46d:	e8 c2 0c 00 00       	call   105b134 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22254a>
     105a472:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     105a477:	48 8d b0 48 05 00 00 	lea    rsi,[rax+0x548]
     105a47e:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     105a483:	e8 56 df 61 00       	call   16783de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c54a>
     105a488:	48 8d 35 d6 b9 2c ff 	lea    rsi,[rip+0xffffffffff2cb9d6]        # 325e65 <_ZTSSt12bad_any_cast@@Base-0x6a363>
     105a48f:	48 8d 54 24 68       	lea    rdx,[rsp+0x68]

### 0x107d8b8: lea    r14,[rsp+0x470]
     107d8aa:	00 
     107d8ab:	e8 30 a7 a6 ff       	call   ae7fe0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x34f80>
     107d8b0:	eb 06                	jmp    107d8b8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x244cce>
     107d8b2:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     107d8b6:	31 db                	xor    ebx,ebx
     107d8b8:	4c 8d b4 24 70 04 00 	lea    r14,[rsp+0x470]
     107d8bf:	00 
     107d8c0:	eb 06                	jmp    107d8c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x244cde>
     107d8c2:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     107d8c6:	31 db                	xor    ebx,ebx
     107d8c8:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
     107d8cf:	00 
     107d8d0:	e8 0b a7 a6 ff       	call   ae7fe0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x34f80>
     107d8d5:	eb 11                	jmp    107d8e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x244cfe>
     107d8d7:	48 89 04 24          	mov    QWORD PTR [rsp],rax

### 0x1099801: lea    r14,[r13+0x470]
     10997ea:	41 0f 11 85 08 04 00 	movups XMMWORD PTR [r13+0x408],xmm0
     10997f1:	00 
     10997f2:	49 8d 9d 18 04 00 00 	lea    rbx,[r13+0x418]
     10997f9:	48 89 df             	mov    rdi,rbx
     10997fc:	e8 8d ea a8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1099801:	4d 8d b5 70 04 00 00 	lea    r14,[r13+0x470]
     1099808:	4c 89 f7             	mov    rdi,r14
     109980b:	e8 7e ea a8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1099810:	4d 8d bd c8 04 00 00 	lea    r15,[r13+0x4c8]
     1099817:	4c 89 ff             	mov    rdi,r15
     109981a:	e8 0b bf ac ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     109981f:	4c 89 ef             	mov    rdi,r13
     1099822:	e8 19 7c 00 00       	call   10a1440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268856>
     1099827:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     109982b:	4c 89 6d 00          	mov    QWORD PTR [rbp+0x0],r13

### 0x10a209c: lea    rdi,[rbx+0x470]
     10a2083:	48 89 fb             	mov    rbx,rdi
     10a2086:	48 8d 05 d3 a2 7a 00 	lea    rax,[rip+0x7aa2d3]        # 184c360 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8a48>
     10a208d:	48 89 07             	mov    QWORD PTR [rdi],rax
     10a2090:	48 81 c7 c8 04 00 00 	add    rdi,0x4c8
     10a2097:	e8 e0 d0 ac ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
     10a209c:	48 8d bb 70 04 00 00 	lea    rdi,[rbx+0x470]
     10a20a3:	e8 be 7d 73 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     10a20a8:	48 8d bb 18 04 00 00 	lea    rdi,[rbx+0x418]
     10a20af:	e8 b2 7d 73 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     10a20b4:	48 8b bb 10 04 00 00 	mov    rdi,QWORD PTR [rbx+0x410]
     10a20bb:	e8 c6 c3 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10a20c0:	48 8d bb 98 03 00 00 	lea    rdi,[rbx+0x398]
     10a20c7:	e8 9e 67 54 00       	call   15e886a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ddee>
     10a20cc:	48 8d bb 88 03 00 00 	lea    rdi,[rbx+0x388]
     10a20d3:	e8 ae f4 ff ff       	call   10a1586 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26899c>

### 0x10d35a3: lea    rdi,[rsp+0x438]
     10d3590:	e8 f1 ae 9c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10d3595:	31 ff                	xor    edi,edi
     10d3597:	e8 ea ae 9c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10d359c:	31 ff                	xor    edi,edi
     10d359e:	e8 e3 ae 9c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10d35a3:	48 8d bc 24 38 04 00 	lea    rdi,[rsp+0x438]
     10d35aa:	00 
     10d35ab:	e8 78 81 9a ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     10d35b0:	31 ff                	xor    edi,edi
     10d35b2:	e8 cf ae 9c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10d35b7:	31 ff                	xor    edi,edi
     10d35b9:	e8 c8 ae 9c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10d35be:	6a 10                	push   0x10
     10d35c0:	5f                   	pop    rdi
     10d35c1:	e8 3a a9 71 00       	call   17edf00 <_Znwm@plt>

### 0x10d4bc5: lea    rdi,[rsp+0x438]
     10d4bad:	00 
     10d4bae:	e8 d3 98 9c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10d4bb3:	66 0f 6f 44 24 60    	movdqa xmm0,XMMWORD PTR [rsp+0x60]
     10d4bb9:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
     10d4bc0:	e8 c1 98 9c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10d4bc5:	48 8d bc 24 38 04 00 	lea    rdi,[rsp+0x438]
     10d4bcc:	00 
     10d4bcd:	e8 56 6b 9a ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     10d4bd2:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     10d4bd8:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
     10d4bdf:	e8 a2 98 9c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10d4be4:	66 0f 6f 44 24 30    	movdqa xmm0,XMMWORD PTR [rsp+0x30]
     10d4bea:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
     10d4bf1:	e8 90 98 9c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10d4bf6:	48 8d bc 24 f0 02 00 	lea    rdi,[rsp+0x2f0]

## Printable strings in 0x1088fd0 initializer

- none
