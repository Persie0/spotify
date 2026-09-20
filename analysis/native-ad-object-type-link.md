# Restriction nested optional -> ad runtime type trace

Proven coordinates:
- outer payload engaged: owner+0x598
- nested optional starts: owner+0x438
- nested engagement byte: owner+0x470
- nested pointee: *(owner+0x438), callback writes pointee+0x1b8

## Ad-model vtable region around address point 0x1879950

- 0x1879900: raw=0x0 reloc->0x14e0f5c
- 0x1879908: raw=0x0 reloc->0x14e0fa2
- 0x1879910: raw=0x0
- 0x1879918: raw=0x0
- 0x1879920: raw=0x0 reloc->0x9d7de0
- 0x1879928: raw=0x0 reloc->0xa50370
- 0x1879930: raw=0x0 reloc->0xaeb7c0
- 0x1879938: raw=0x0 reloc->0x14e0e68
- 0x1879940: raw=0x0
- 0x1879948: raw=0x0
- 0x1879950: raw=0x0 reloc->0x1455804
- 0x1879958: raw=0x0 reloc->0x14e16e6
- 0x1879960: raw=0x0 reloc->0xa10ec0
- 0x1879968: raw=0x0 reloc->0x14e16f8
- 0x1879970: raw=0x0 reloc->0x14e1702
- 0x1879978: raw=0x0 reloc->0x14e194e
- 0x1879980: raw=0x0 reloc->0x14e19e8
- 0x1879988: raw=0x0 reloc->0x14e1a82
- 0x1879990: raw=0x0 reloc->0x14e1a98
- 0x1879998: raw=0x0 reloc->0x14e1d2c
- 0x18799a0: raw=0x0 reloc->0x14e1d38
- 0x18799a8: raw=0x0 reloc->0x14e1d4a
- 0x18799b0: raw=0x0 reloc->0x14e1d5c
- 0x18799b8: raw=0x0 reloc->0x14e1d9c
- 0x18799c0: raw=0x0 reloc->0x14e1f16
- 0x18799c8: raw=0x0 reloc->0x14e1f2e
- 0x18799d0: raw=0x0 reloc->0x14e1fc8
- 0x18799d8: raw=0x0 reloc->0x14e2040
- 0x18799e0: raw=0x0 reloc->0x14e20da
- 0x18799e8: raw=0x0 reloc->0x14e2174
- 0x18799f0: raw=0x0 reloc->0x14e21b4
- 0x18799f8: raw=0x0 reloc->0x14e226a
- 0x1879a00: raw=0x0 reloc->0x14e22a4
- 0x1879a08: raw=0x0 reloc->0x14e233e
- 0x1879a10: raw=0x0 reloc->0x14e23d8
- 0x1879a18: raw=0x0 reloc->0x14e2472
- 0x1879a20: raw=0x0 reloc->0x14e248a
- 0x1879a28: raw=0x0 reloc->0x14e24b8
- 0x1879a30: raw=0x0 reloc->0x14e24d0
- 0x1879a38: raw=0x0 reloc->0x14e24e8
- 0x1879a40: raw=0x0 reloc->0x14e25d0
- 0x1879a48: raw=0x0
- 0x1879a50: raw=0x0
- 0x1879a58: raw=0x0 reloc->0x14e40ca
- 0x1879a60: raw=0x0 reloc->0x14e41c2
- 0x1879a68: raw=0x0 reloc->0x14e41d4

## Itanium header / RTTI candidate

- 0x1879938: raw=0x0 reloc->0x14e0e68
- 0x1879940: raw=0x0
- 0x1879948: raw=0x0
- 0x1879950: raw=0x0 reloc->0x1455804
- 0x1879958: raw=0x0 reloc->0x14e16e6
- 0x1879a18: raw=0x0 reloc->0x14e2472
- 0x1879a20: raw=0x0 reloc->0x14e248a
- 0x1879a38: raw=0x0 reloc->0x14e24e8

## Code references to vtable/address point region

### 0x145580b: 145580b:	48 8d 05 3e 41 42 00 	lea    rax,[rip+0x42413e]        # 1879950 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36038>
     14557f7:	0f 11 47 20          	movups XMMWORD PTR [rdi+0x20],xmm0
     14557fb:	48 89 d6             	mov    rsi,rdx
     14557fe:	e9 f5 fe ff ff       	jmp    14556f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29ac7c>
     1455803:	cc                   	int3
     1455804:	41 56                	push   r14
     1455806:	53                   	push   rbx
     1455807:	50                   	push   rax
     1455808:	48 89 fb             	mov    rbx,rdi
     145580b:	48 8d 05 3e 41 42 00 	lea    rax,[rip+0x42413e]        # 1879950 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36038>
     1455812:	48 89 07             	mov    QWORD PTR [rdi],rax
     1455815:	48 81 c7 90 01 00 00 	add    rdi,0x190
     145581c:	e8 45 ce 68 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
     1455821:	48 8d bb 70 01 00 00 	lea    rdi,[rbx+0x170]
     1455828:	e8 63 86 39 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     145582d:	48 8d bb 58 01 00 00 	lea    rdi,[rbx+0x158]
     1455834:	e8 57 86 39 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1455839:	48 8d bb 40 01 00 00 	lea    rdi,[rbx+0x140]
     1455840:	e8 4b 86 39 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1455845:	48 8d bb 28 01 00 00 	lea    rdi,[rbx+0x128]
     145584c:	e8 3f 86 39 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### 0x14e0b8e: 14e0b8e:	48 8d 05 8b 8d 39 00 	lea    rax,[rip+0x398d8b]        # 1879920 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36008>
     14e0b6d:	48 8d 35 82 5b e4 fe 	lea    rsi,[rip+0xfffffffffee45b82]        # 3266f6 <_ZTSSt12bad_any_cast@@Base-0x69ad2>
     14e0b74:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     14e0b79:	e8 00 8f 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14e0b7e:	6a 20                	push   0x20
     14e0b80:	5f                   	pop    rdi
     14e0b81:	e8 7a d3 30 00       	call   17edf00 <_Znwm@plt>
     14e0b86:	49 89 c6             	mov    r14,rax
     14e0b89:	48 83 48 08 ff       	or     QWORD PTR [rax+0x8],0xffffffffffffffff
     14e0b8e:	48 8d 05 8b 8d 39 00 	lea    rax,[rip+0x398d8b]        # 1879920 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36008>
     14e0b95:	49 89 06             	mov    QWORD PTR [r14],rax
     14e0b98:	49 c7 46 18 50 00 00 	mov    QWORD PTR [r14+0x18],0x50
     14e0b9f:	00 
     14e0ba0:	4c 89 74 24 28       	mov    QWORD PTR [rsp+0x28],r14
     14e0ba5:	4c 89 74 24 40       	mov    QWORD PTR [rsp+0x40],r14
     14e0baa:	6a 20                	push   0x20
     14e0bac:	5f                   	pop    rdi
     14e0bad:	e8 4e d3 30 00       	call   17edf00 <_Znwm@plt>
     14e0bb2:	49 89 c7             	mov    r15,rax
     14e0bb5:	0f 57 c0             	xorps  xmm0,xmm0
     14e0bb8:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0

### 0x14e15ff: 14e15ff:	48 8d 05 4a 83 39 00 	lea    rax,[rip+0x39834a]        # 1879950 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36038>
     14e15e5:	41 57                	push   r15
     14e15e7:	41 56                	push   r14
     14e15e9:	53                   	push   rbx
     14e15ea:	48 83 ec 48          	sub    rsp,0x48
     14e15ee:	48 89 fb             	mov    rbx,rdi
     14e15f1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14e15f8:	00 00 
     14e15fa:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     14e15ff:	48 8d 05 4a 83 39 00 	lea    rax,[rip+0x39834a]        # 1879950 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36038>
     14e1606:	48 89 07             	mov    QWORD PTR [rdi],rax
     14e1609:	4c 8d 77 08          	lea    r14,[rdi+0x8]
     14e160d:	48 89 f7             	mov    rdi,rsi
     14e1610:	e8 a7 11 00 00       	call   14e27bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327d40>
     14e1615:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     14e161a:	48 89 06             	mov    QWORD PTR [rsi],rax
     14e161d:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     14e1621:	4c 8d 7c 24 1f       	lea    r15,[rsp+0x1f]
     14e1626:	4c 89 ff             	mov    rdi,r15
     14e1629:	e8 f2 2c 6b ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
     14e162e:	4c 89 f7             	mov    rdi,r14

## Direct xrefs to nested optional helper family

### nested optional copy-ctor wrapper: 0x108da66
- callsite 0x108d97b, caller (17356940, 17357357)
     108d93f:	be b0 03 00 00       	mov    esi,0x3b0
     108d944:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108d948:	48 01 ee             	add    rsi,rbp
     108d94b:	e8 16 ee a3 ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
     108d950:	0f 10 85 d0 03 00 00 	movups xmm0,XMMWORD PTR [rbp+0x3d0]
     108d957:	0f 10 8d e0 03 00 00 	movups xmm1,XMMWORD PTR [rbp+0x3e0]
     108d95e:	0f 11 8b e0 03 00 00 	movups XMMWORD PTR [rbx+0x3e0],xmm1
     108d965:	0f 11 83 d0 03 00 00 	movups XMMWORD PTR [rbx+0x3d0],xmm0
     108d96c:	be f0 03 00 00       	mov    esi,0x3f0
     108d971:	4c 8d 3c 33          	lea    r15,[rbx+rsi*1]
     108d975:	48 01 ee             	add    rsi,rbp
     108d978:	4c 89 ff             	mov    rdi,r15
     108d97b:	e8 e6 00 00 00       	call   108da66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254e7c>
     108d980:	be 30 04 00 00       	mov    esi,0x430
     108d985:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108d989:	48 01 ee             	add    rsi,rbp
     108d98c:	e8 33 f5 ff ff       	call   108cec4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2542da>
     108d991:	48 8b 85 48 05 00 00 	mov    rax,QWORD PTR [rbp+0x548]
     108d998:	48 89 83 48 05 00 00 	mov    QWORD PTR [rbx+0x548],rax
     108d99f:	48 83 c4 18          	add    rsp,0x18
     108d9a3:	5b                   	pop    rbx
     108d9a4:	41 5c                	pop    r12
     108d9a6:	41 5d                	pop    r13
     108d9a8:	41 5e                	pop    r14
     108d9aa:	41 5f                	pop    r15
     108d9ac:	5d                   	pop    rbp

- callsite 0x124aea0, caller (19181110, 19181725)
     124ae66:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     124ae6b:	4c 89 f9             	mov    rcx,r15
     124ae6e:	e8 ef 02 00 00       	call   124b162 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x906e6>
     124ae73:	41 8a 85 4c 05 00 00 	mov    al,BYTE PTR [r13+0x54c]
     124ae7a:	41 0a 85 f0 01 00 00 	or     al,BYTE PTR [r13+0x1f0]
     124ae81:	41 0f 94 c4          	sete   r12b
     124ae85:	4d 8d 75 18          	lea    r14,[r13+0x18]
     124ae89:	48 89 df             	mov    rdi,rbx
     124ae8c:	4c 89 f6             	mov    rsi,r14
     124ae8f:	e8 ac 30 5a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124ae94:	49 8d b5 f0 03 00 00 	lea    rsi,[r13+0x3f0]
     124ae9b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     124aea0:	e8 c1 2b e4 ff       	call   108da66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254e7c>
     124aea5:	48 8d 6b 18          	lea    rbp,[rbx+0x18]
     124aea9:	80 7c 24 68 00       	cmp    BYTE PTR [rsp+0x68],0x0
     124aeae:	74 26                	je     124aed6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9045a>
     124aeb0:	48 8b 74 24 30       	mov    rsi,QWORD PTR [rsp+0x30]
     124aeb5:	48 85 f6             	test   rsi,rsi
     124aeb8:	74 1c                	je     124aed6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9045a>
     124aeba:	80 7c 24 60 00       	cmp    BYTE PTR [rsp+0x60],0x0
     124aebf:	75 15                	jne    124aed6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9045a>
     124aec1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     124aec4:	48 89 ef             	mov    rdi,rbp
     124aec7:	ff 50 38             	call   QWORD PTR [rax+0x38]
     124aeca:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     124aecf:	e8 04 ec e3 ff       	call   1089ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250eee>

Total: 2

### nested payload copy constructor: 0x108da9a
- callsite 0x108da79, caller (17357414, 17357465)
     108da62:	41 5e                	pop    r14
     108da64:	c3                   	ret
     108da65:	cc                   	int3
     108da66:	41 56                	push   r14
     108da68:	53                   	push   rbx
     108da69:	50                   	push   rax
     108da6a:	31 c0                	xor    eax,eax
     108da6c:	88 07                	mov    BYTE PTR [rdi],al
     108da6e:	88 47 38             	mov    BYTE PTR [rdi+0x38],al
     108da71:	38 46 38             	cmp    BYTE PTR [rsi+0x38],al
     108da74:	74 08                	je     108da7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254e94>
     108da76:	48 89 fb             	mov    rbx,rdi
     108da79:	e8 1c 00 00 00       	call   108da9a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254eb0>
     108da7e:	48 83 c4 08          	add    rsp,0x8
     108da82:	5b                   	pop    rbx
     108da83:	41 5e                	pop    r14
     108da85:	c3                   	ret
     108da86:	49 89 c6             	mov    r14,rax
     108da89:	48 89 df             	mov    rdi,rbx
     108da8c:	e8 47 c0 ff ff       	call   1089ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250eee>
     108da91:	4c 89 f7             	mov    rdi,r14
     108da94:	e8 37 22 9e ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     108da99:	cc                   	int3
     108da9a:	41 56                	push   r14
     108da9c:	53                   	push   rbx
     108da9d:	50                   	push   rax

- callsite 0x108dc0f, caller (17357552, 17357886)
     108dbe1:	be 00 04 00 00       	mov    esi,0x400
     108dbe6:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108dbea:	4c 01 f6             	add    rsi,r14
     108dbed:	e8 68 78 a4 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
     108dbf2:	41 8a 86 20 04 00 00 	mov    al,BYTE PTR [r14+0x420]
     108dbf9:	88 83 20 04 00 00    	mov    BYTE PTR [rbx+0x420],al
     108dbff:	eb 13                	jmp    108dc14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25502a>
     108dc01:	84 c0                	test   al,al
     108dc03:	74 07                	je     108dc0c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255022>
     108dc05:	e8 34 00 00 00       	call   108dc3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255054>
     108dc0a:	eb 08                	jmp    108dc14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25502a>
     108dc0c:	4c 01 f6             	add    rsi,r14
     108dc0f:	e8 86 fe ff ff       	call   108da9a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254eb0>
     108dc14:	be 30 04 00 00       	mov    esi,0x430
     108dc19:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108dc1d:	4c 01 f6             	add    rsi,r14
     108dc20:	e8 bb f6 ff ff       	call   108d2e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2546f6>
     108dc25:	49 8b 86 48 05 00 00 	mov    rax,QWORD PTR [r14+0x548]
     108dc2c:	48 89 83 48 05 00 00 	mov    QWORD PTR [rbx+0x548],rax
     108dc33:	48 89 d8             	mov    rax,rbx
     108dc36:	48 83 c4 08          	add    rsp,0x8
     108dc3a:	5b                   	pop    rbx
     108dc3b:	41 5e                	pop    r14
     108dc3d:	c3                   	ret
     108dc3e:	80 7f 38 00          	cmp    BYTE PTR [rdi+0x38],0x0
     108dc42:	74 0e                	je     108dc52 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255068>

Total: 2

### nested optional assignment helper: 0x108e3d0
- callsite 0x108de91, caller (17358036, 17358525)
     108de55:	00 
     108de56:	41 0f 10 8e e0 03 00 	movups xmm1,XMMWORD PTR [r14+0x3e0]
     108de5d:	00 
     108de5e:	0f 11 8b e0 03 00 00 	movups XMMWORD PTR [rbx+0x3e0],xmm1
     108de65:	0f 11 83 d0 03 00 00 	movups XMMWORD PTR [rbx+0x3d0],xmm0
     108de6c:	31 c0                	xor    eax,eax
     108de6e:	88 83 f0 03 00 00    	mov    BYTE PTR [rbx+0x3f0],al
     108de74:	88 83 28 04 00 00    	mov    BYTE PTR [rbx+0x428],al
     108de7a:	41 38 86 28 04 00 00 	cmp    BYTE PTR [r14+0x428],al
     108de81:	74 13                	je     108de96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2552ac>
     108de83:	48 8d bb f0 03 00 00 	lea    rdi,[rbx+0x3f0]
     108de8a:	49 8d b6 f0 03 00 00 	lea    rsi,[r14+0x3f0]
     108de91:	e8 3a 05 00 00       	call   108e3d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2557e6>
     108de96:	be 30 04 00 00       	mov    esi,0x430
     108de9b:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108de9f:	4c 01 f6             	add    rsi,r14
     108dea2:	e8 8b 03 00 00       	call   108e232 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255648>
     108dea7:	49 8b 86 48 05 00 00 	mov    rax,QWORD PTR [r14+0x548]
     108deae:	48 89 83 48 05 00 00 	mov    QWORD PTR [rbx+0x548],rax
     108deb5:	48 83 c4 08          	add    rsp,0x8
     108deb9:	5b                   	pop    rbx
     108deba:	41 5e                	pop    r14
     108debc:	c3                   	ret
     108debd:	cc                   	int3
     108debe:	41 56                	push   r14
     108dec0:	53                   	push   rbx

- callsite 0x1365c35, caller (20339234, 20344076)
     1365c0a:	88 84 24 78 13 00 00 	mov    BYTE PTR [rsp+0x1378],al
     1365c11:	eb 27                	jmp    1365c3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab1be>
     1365c13:	48 8d bc 24 58 0f 00 	lea    rdi,[rsp+0xf58]
     1365c1a:	00 
     1365c1b:	48 8d b4 24 08 0a 00 	lea    rsi,[rsp+0xa08]
     1365c22:	00 
     1365c23:	e8 9a 80 d2 ff       	call   108dcc2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2550d8>
     1365c28:	eb 62                	jmp    1365c8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab210>
     1365c2a:	84 c0                	test   al,al
     1365c2c:	74 07                	je     1365c35 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab1b9>
     1365c2e:	e8 0b 80 d2 ff       	call   108dc3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255054>
     1365c33:	eb 05                	jmp    1365c3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab1be>
     1365c35:	e8 96 87 d2 ff       	call   108e3d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2557e6>
     1365c3a:	b8 30 04 00 00       	mov    eax,0x430
     1365c3f:	49 01 c7             	add    r15,rax
     1365c42:	49 01 c6             	add    r14,rax
     1365c45:	8a 84 24 98 14 00 00 	mov    al,BYTE PTR [rsp+0x1498]
     1365c4c:	3a 84 24 48 0f 00 00 	cmp    al,BYTE PTR [rsp+0xf48]
     1365c53:	75 11                	jne    1365c66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab1ea>
     1365c55:	84 c0                	test   al,al
     1365c57:	74 23                	je     1365c7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab200>
     1365c59:	4c 89 ff             	mov    rdi,r15
     1365c5c:	4c 89 f6             	mov    rsi,r14
     1365c5f:	e8 f2 51 e9 ff       	call   11fae56 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x403da>
     1365c64:	eb 16                	jmp    1365c7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab200>
     1365c66:	4c 89 ff             	mov    rdi,r15

Total: 2

### nested optional destructor/reset target: 0x105633e
- callsite 0x105448d, caller (17120924, 17122933)
     1054462:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     1054465:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
     1054468:	0f 57 c0             	xorps  xmm0,xmm0
     105446b:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     105446e:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     1054473:	c6 41 18 01          	mov    BYTE PTR [rcx+0x18],0x1
     1054477:	4c 8d a4 24 00 01 00 	lea    r12,[rsp+0x100]
     105447e:	00 
     105447f:	4c 89 ff             	mov    rdi,r15
     1054482:	4c 89 e6             	mov    rsi,r12
     1054485:	e8 60 1d 00 00       	call   10561ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d600>
     105448a:	4c 89 e7             	mov    rdi,r12
     105448d:	e8 ac 1e 00 00       	call   105633e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d754>
     1054492:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     1054499:	00 
     105449a:	e8 9f 1e 00 00       	call   105633e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d754>
     105449f:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15
     10544a3:	4d 89 75 08          	mov    QWORD PTR [r13+0x8],r14
     10544a7:	31 ff                	xor    edi,edi
     10544a9:	e8 6e 9f a4 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     10544ae:	e9 80 00 00 00       	jmp    1054533 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21b949>
     10544b3:	4c 8b 7c 24 08       	mov    r15,QWORD PTR [rsp+0x8]
     10544b8:	49 83 3f fd          	cmp    QWORD PTR [r15],0xfffffffffffffffd
     10544bc:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     10544c1:	77 1b                	ja     10544de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21b8f4>
     10544c3:	4c 89 e8             	mov    rax,r13

- callsite 0x105449a, caller (17120924, 17122933)
     105446b:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     105446e:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     1054473:	c6 41 18 01          	mov    BYTE PTR [rcx+0x18],0x1
     1054477:	4c 8d a4 24 00 01 00 	lea    r12,[rsp+0x100]
     105447e:	00 
     105447f:	4c 89 ff             	mov    rdi,r15
     1054482:	4c 89 e6             	mov    rsi,r12
     1054485:	e8 60 1d 00 00       	call   10561ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d600>
     105448a:	4c 89 e7             	mov    rdi,r12
     105448d:	e8 ac 1e 00 00       	call   105633e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d754>
     1054492:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     1054499:	00 
     105449a:	e8 9f 1e 00 00       	call   105633e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d754>
     105449f:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15
     10544a3:	4d 89 75 08          	mov    QWORD PTR [r13+0x8],r14
     10544a7:	31 ff                	xor    edi,edi
     10544a9:	e8 6e 9f a4 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     10544ae:	e9 80 00 00 00       	jmp    1054533 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21b949>
     10544b3:	4c 8b 7c 24 08       	mov    r15,QWORD PTR [rsp+0x8]
     10544b8:	49 83 3f fd          	cmp    QWORD PTR [r15],0xfffffffffffffffd
     10544bc:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     10544c1:	77 1b                	ja     10544de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21b8f4>
     10544c3:	4c 89 e8             	mov    rax,r13
     10544c6:	48 83 c0 18          	add    rax,0x18
     10544ca:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
     10544ce:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]

- callsite 0x105453b, caller (17120924, 17122933)
     1054509:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     105450e:	e8 73 9f a4 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1054513:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     1054518:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
     105451e:	48 85 ff             	test   rdi,rdi
     1054521:	74 06                	je     1054529 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21b93f>
     1054523:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1054526:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1054529:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     105452e:	e8 5d 99 79 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1054533:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     105453a:	00 
     105453b:	e8 fe 1d 00 00       	call   105633e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d754>
     1054540:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1054547:	00 00 
     1054549:	48 3b 84 24 f0 01 00 	cmp    rax,QWORD PTR [rsp+0x1f0]
     1054550:	00 
     1054551:	0f 85 f7 00 00 00    	jne    105464e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21ba64>
     1054557:	48 81 c4 f8 01 00 00 	add    rsp,0x1f8
     105455e:	5b                   	pop    rbx
     105455f:	41 5c                	pop    r12
     1054561:	41 5d                	pop    r13
     1054563:	41 5e                	pop    r14
     1054565:	41 5f                	pop    r15
     1054567:	5d                   	pop    rbp
     1054568:	c3                   	ret

- callsite 0x10545f3, caller (17120924, 17122933)
     10545c5:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     10545ca:	e8 c1 98 79 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10545cf:	eb 3e                	jmp    105460f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21ba25>
     10545d1:	eb 39                	jmp    105460c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21ba22>
     10545d3:	48 89 c3             	mov    rbx,rax
     10545d6:	e9 92 00 00 00       	jmp    105466d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21ba83>
     10545db:	48 89 c3             	mov    rbx,rax
     10545de:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
     10545e5:	00 
     10545e6:	e8 b9 eb 66 00       	call   16c31a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x77310>
     10545eb:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     10545f2:	00 
     10545f3:	e8 46 1d 00 00       	call   105633e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d754>
     10545f8:	eb 39                	jmp    1054633 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21ba49>
     10545fa:	48 89 c3             	mov    rbx,rax
     10545fd:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
     1054604:	00 
     1054605:	e8 24 0d 67 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     105460a:	eb 1a                	jmp    1054626 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21ba3c>
     105460c:	48 89 c3             	mov    rbx,rax
     105460f:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     1054616:	00 
     1054617:	e8 74 98 79 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     105461c:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
     1054621:	e8 60 9e a4 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1054626:	48 8d bc 24 98 01 00 	lea    rdi,[rsp+0x198]

- callsite 0x1056287, caller (17129962, 17130301)
     105625d:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
     1056261:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     1056265:	49 89 e6             	mov    r14,rsp
     1056268:	4c 89 f6             	mov    rsi,r14
     105626b:	e8 ac 35 a6 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     1056270:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     1056274:	e8 0d 82 a4 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1056279:	6a fe                	push   0xfffffffffffffffe
     105627b:	eb 5f                	jmp    10562dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d6f2>
     105627d:	80 7b 58 00          	cmp    BYTE PTR [rbx+0x58],0x0
     1056281:	74 0d                	je     1056290 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d6a6>
     1056283:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
     1056287:	e8 b2 00 00 00       	call   105633e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d754>
     105628c:	c6 43 58 00          	mov    BYTE PTR [rbx+0x58],0x0
     1056290:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1056293:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
     1056297:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
     105629b:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     105629f:	0f 57 c0             	xorps  xmm0,xmm0
     10562a2:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     10562a6:	31 c0                	xor    eax,eax
     10562a8:	88 43 38             	mov    BYTE PTR [rbx+0x38],al
     10562ab:	88 43 50             	mov    BYTE PTR [rbx+0x50],al
     10562ae:	41 38 46 28          	cmp    BYTE PTR [r14+0x28],al
     10562b2:	74 22                	je     10562d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d6ec>
     10562b4:	48 8d 43 38          	lea    rax,[rbx+0x38]

- callsite 0x10563a0, caller (17130330, 17130477)
     1056374:	48 89 e2             	mov    rdx,rsp
     1056377:	88 02                	mov    BYTE PTR [rdx],al
     1056379:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
     105637c:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1056381:	48 89 de             	mov    rsi,rbx
     1056384:	e8 19 fe ff ff       	call   10561a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d5b8>
     1056389:	48 83 c3 10          	add    rbx,0x10
     105638d:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     1056392:	48 89 df             	mov    rdi,rbx
     1056395:	4c 89 f6             	mov    rsi,r14
     1056398:	e8 8f 02 00 00       	call   105662c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21da42>
     105639d:	4c 89 f7             	mov    rdi,r14
     10563a0:	e8 99 ff ff ff       	call   105633e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d754>
     10563a5:	48 89 e7             	mov    rdi,rsp
     10563a8:	e8 83 09 a5 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     10563ad:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10563b4:	00 00 
     10563b6:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
     10563bb:	75 2b                	jne    10563e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d7fe>
     10563bd:	48 83 c4 58          	add    rsp,0x58
     10563c1:	5b                   	pop    rbx
     10563c2:	41 5e                	pop    r14
     10563c4:	c3                   	ret
     10563c5:	48 89 c3             	mov    rbx,rax
     10563c8:	48 89 e7             	mov    rdi,rsp
     10563cb:	e8 60 09 a5 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>

- callsite 0x1056557, caller (17130590, 17130937)
     1056525:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
     105652a:	41 0f 28 0f          	movaps xmm1,XMMWORD PTR [r15]
     105652e:	41 0f 29 4e 10       	movaps XMMWORD PTR [r14+0x10],xmm1
     1056533:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     1056537:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
     105653b:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
     105653f:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     1056544:	41 c6 46 28 01       	mov    BYTE PTR [r14+0x28],0x1
     1056549:	48 89 df             	mov    rdi,rbx
     105654c:	4c 89 f6             	mov    rsi,r14
     105654f:	e8 d8 00 00 00       	call   105662c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21da42>
     1056554:	4c 89 f7             	mov    rdi,r14
     1056557:	e8 e2 fd ff ff       	call   105633e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d754>
     105655c:	4c 89 ff             	mov    rdi,r15
     105655f:	e8 2c 79 79 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1056564:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1056569:	e8 22 79 79 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     105656e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1056575:	00 00 
     1056577:	48 3b 44 24 78       	cmp    rax,QWORD PTR [rsp+0x78]
     105657c:	75 36                	jne    10565b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d9ca>
     105657e:	48 81 c4 80 00 00 00 	add    rsp,0x80
     1056585:	5b                   	pop    rbx
     1056586:	41 5e                	pop    r14
     1056588:	41 5f                	pop    r15
     105658a:	c3                   	ret

- callsite 0x1056704, caller (17131052, 17131329)
     10566d3:	48 8d 44 24 40       	lea    rax,[rsp+0x40]
     10566d8:	49 8b 4f 10          	mov    rcx,QWORD PTR [r15+0x10]
     10566dc:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
     10566e0:	41 0f 10 0f          	movups xmm1,XMMWORD PTR [r15]
     10566e4:	0f 11 08             	movups XMMWORD PTR [rax],xmm1
     10566e7:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
     10566eb:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     10566f0:	c6 40 18 01          	mov    BYTE PTR [rax+0x18],0x1
     10566f4:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
     10566f9:	4c 89 f6             	mov    rsi,r14
     10566fc:	e8 e9 fa ff ff       	call   10561ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d600>
     1056701:	4c 89 f7             	mov    rdi,r14
     1056704:	e8 35 fc ff ff       	call   105633e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d754>
     1056709:	eb 02                	jmp    105670d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21db23>
     105670b:	31 db                	xor    ebx,ebx
     105670d:	48 89 df             	mov    rdi,rbx
     1056710:	e8 71 7d a4 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1056715:	48 89 e7             	mov    rdi,rsp
     1056718:	e8 21 fc ff ff       	call   105633e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d754>
     105671d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1056724:	00 00 
     1056726:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
     105672b:	75 0f                	jne    105673c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21db52>
     105672d:	48 83 c4 68          	add    rsp,0x68
     1056731:	5b                   	pop    rbx
     1056732:	41 5c                	pop    r12

- callsite 0x1056718, caller (17131052, 17131329)
     10566eb:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     10566f0:	c6 40 18 01          	mov    BYTE PTR [rax+0x18],0x1
     10566f4:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
     10566f9:	4c 89 f6             	mov    rsi,r14
     10566fc:	e8 e9 fa ff ff       	call   10561ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d600>
     1056701:	4c 89 f7             	mov    rdi,r14
     1056704:	e8 35 fc ff ff       	call   105633e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d754>
     1056709:	eb 02                	jmp    105670d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21db23>
     105670b:	31 db                	xor    ebx,ebx
     105670d:	48 89 df             	mov    rdi,rbx
     1056710:	e8 71 7d a4 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1056715:	48 89 e7             	mov    rdi,rsp
     1056718:	e8 21 fc ff ff       	call   105633e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d754>
     105671d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1056724:	00 00 
     1056726:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
     105672b:	75 0f                	jne    105673c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21db52>
     105672d:	48 83 c4 68          	add    rsp,0x68
     1056731:	5b                   	pop    rbx
     1056732:	41 5c                	pop    r12
     1056734:	41 5d                	pop    r13
     1056736:	41 5e                	pop    r14
     1056738:	41 5f                	pop    r15
     105673a:	5d                   	pop    rbp
     105673b:	c3                   	ret
     105673c:	e8 6f 93 79 00       	call   17efab0 <__stack_chk_fail@plt>

- callsite 0x1056799, caller (17131364, 17131437)
     105676f:	49 8d 46 ff          	lea    rax,[r14-0x1]
     1056773:	48 83 f8 fb          	cmp    rax,0xfffffffffffffffb
     1056777:	77 0f                	ja     1056788 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21db9e>
     1056779:	4c 89 f7             	mov    rdi,r14
     105677c:	41 ff 56 08          	call   QWORD PTR [r14+0x8]
     1056780:	4c 89 f7             	mov    rdi,r14
     1056783:	e8 98 77 79 00       	call   17edf20 <_ZdlPv@plt>
     1056788:	4c 8d 73 18          	lea    r14,[rbx+0x18]
     105678c:	80 7b 70 00          	cmp    BYTE PTR [rbx+0x70],0x0
     1056790:	74 0c                	je     105679e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21dbb4>
     1056792:	48 83 c3 40          	add    rbx,0x40
     1056796:	48 89 df             	mov    rdi,rbx
     1056799:	e8 a0 fb ff ff       	call   105633e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d754>
     105679e:	4c 89 f7             	mov    rdi,r14
     10567a1:	48 83 c4 08          	add    rsp,0x8
     10567a5:	5b                   	pop    rbx
     10567a6:	41 5e                	pop    r14
     10567a8:	e9 85 c2 a9 ff       	jmp    af2a32 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f9d2>
     10567ad:	cc                   	int3
     10567ae:	55                   	push   rbp
     10567af:	41 57                	push   r15
     10567b1:	41 56                	push   r14
     10567b3:	41 55                	push   r13
     10567b5:	41 54                	push   r12
     10567b7:	53                   	push   rbx
     10567b8:	48 81 ec c8 00 00 00 	sub    rsp,0xc8

- callsite 0x108dc48, caller (17357886, 17357907)
     108dc20:	e8 bb f6 ff ff       	call   108d2e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2546f6>
     108dc25:	49 8b 86 48 05 00 00 	mov    rax,QWORD PTR [r14+0x548]
     108dc2c:	48 89 83 48 05 00 00 	mov    QWORD PTR [rbx+0x548],rax
     108dc33:	48 89 d8             	mov    rax,rbx
     108dc36:	48 83 c4 08          	add    rsp,0x8
     108dc3a:	5b                   	pop    rbx
     108dc3b:	41 5e                	pop    r14
     108dc3d:	c3                   	ret
     108dc3e:	80 7f 38 00          	cmp    BYTE PTR [rdi+0x38],0x0
     108dc42:	74 0e                	je     108dc52 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255068>
     108dc44:	53                   	push   rbx
     108dc45:	48 89 fb             	mov    rbx,rdi
     108dc48:	e8 f1 86 fc ff       	call   105633e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d754>
     108dc4d:	c6 43 38 00          	mov    BYTE PTR [rbx+0x38],0x0
     108dc51:	5b                   	pop    rbx
     108dc52:	c3                   	ret
     108dc53:	cc                   	int3
     108dc54:	53                   	push   rbx
     108dc55:	48 89 fb             	mov    rbx,rdi
     108dc58:	e8 2f fc ff ff       	call   108d88c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ca2>
     108dc5d:	c6 83 50 05 00 00 01 	mov    BYTE PTR [rbx+0x550],0x1
     108dc64:	5b                   	pop    rbx
     108dc65:	c3                   	ret
     108dc66:	31 c0                	xor    eax,eax
     108dc68:	88 07                	mov    BYTE PTR [rdi],al
     108dc6a:	88 87 50 05 00 00    	mov    BYTE PTR [rdi+0x550],al

- callsite 0x139b832, caller (20559818, 20559996)
     139b7fc:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     139b801:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     139b806:	49 8d b6 78 0b 00 00 	lea    rsi,[r14+0xb78]
     139b80d:	e8 54 0f 73 ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
     139b812:	41 8a 86 b0 0b 00 00 	mov    al,BYTE PTR [r14+0xbb0]
     139b819:	49 89 e6             	mov    r14,rsp
     139b81c:	41 88 46 30          	mov    BYTE PTR [r14+0x30],al
     139b820:	48 89 df             	mov    rdi,rbx
     139b823:	4c 89 f6             	mov    rsi,r14
     139b826:	e8 b5 2b cf ff       	call   108e3e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2557f6>
     139b82b:	c6 43 38 01          	mov    BYTE PTR [rbx+0x38],0x1
     139b82f:	4c 89 f7             	mov    rdi,r14
     139b832:	e8 07 ab cb ff       	call   105633e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d754>
     139b837:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     139b83e:	00 00 
     139b840:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
     139b845:	75 30                	jne    139b877 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e0dfb>
     139b847:	48 89 d8             	mov    rax,rbx
     139b84a:	48 83 c4 48          	add    rsp,0x48
     139b84e:	5b                   	pop    rbx
     139b84f:	41 5e                	pop    r14
     139b851:	c3                   	ret
     139b852:	48 89 c3             	mov    rbx,rax
     139b855:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     139b85a:	e8 27 2c 70 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     139b85f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

Total: 12

## Address-taking of +0x3f0 / +0x428 in state helper region

### 0x1089a82: lea    rdi,[rbx+0x3f0] ; FDE=(17341042, 17341130)
     1089a5a:	48 83 c4 18          	add    rsp,0x18
     1089a5e:	c3                   	ret
     1089a5f:	e8 4c 60 76 00       	call   17efab0 <__stack_chk_fail@plt>
     1089a64:	80 bf 50 05 00 00 00 	cmp    BYTE PTR [rdi+0x550],0x0
     1089a6b:	0f 85 01 00 00 00    	jne    1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     1089a71:	c3                   	ret
     1089a72:	53                   	push   rbx
     1089a73:	48 89 fb             	mov    rbx,rdi
     1089a76:	48 81 c7 30 04 00 00 	add    rdi,0x430
     1089a7d:	e8 48 00 00 00       	call   1089aca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250ee0>
     1089a82:	48 8d bb f0 03 00 00 	lea    rdi,[rbx+0x3f0]
     1089a89:	e8 4a 00 00 00       	call   1089ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250eee>
     1089a8e:	48 8d bb 78 03 00 00 	lea    rdi,[rbx+0x378]
     1089a95:	e8 4a 00 00 00       	call   1089ae4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250efa>
     1089a9a:	48 8d bb 90 00 00 00 	lea    rdi,[rbx+0x90]
     1089aa1:	e8 5e 00 00 00       	call   1089b04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250f1a>
     1089aa6:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
     1089aaa:	e8 e1 43 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1089aaf:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
     1089ab3:	e8 d8 43 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1089ab8:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
     1089abc:	e8 cf 43 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### 0x108dbc1: mov    al,BYTE PTR [rbx+0x428] ; FDE=(17357552, 17357886)
     108db92:	4c 01 f6             	add    rsi,r14
     108db95:	e8 c0 78 a4 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
     108db9a:	41 0f 10 86 d0 03 00 	movups xmm0,XMMWORD PTR [r14+0x3d0]
     108dba1:	00 
     108dba2:	41 0f 10 8e e0 03 00 	movups xmm1,XMMWORD PTR [r14+0x3e0]
     108dba9:	00 
     108dbaa:	0f 11 8b e0 03 00 00 	movups XMMWORD PTR [rbx+0x3e0],xmm1
     108dbb1:	0f 11 83 d0 03 00 00 	movups XMMWORD PTR [rbx+0x3d0],xmm0
     108dbb8:	be f0 03 00 00       	mov    esi,0x3f0
     108dbbd:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108dbc1:	8a 83 28 04 00 00    	mov    al,BYTE PTR [rbx+0x428]
     108dbc7:	41 3a 86 28 04 00 00 	cmp    al,BYTE PTR [r14+0x428]
     108dbce:	75 31                	jne    108dc01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255017>
     108dbd0:	84 c0                	test   al,al
     108dbd2:	74 40                	je     108dc14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25502a>
     108dbd4:	41 0f 10 86 f0 03 00 	movups xmm0,XMMWORD PTR [r14+0x3f0]
     108dbdb:	00 
     108dbdc:	e8 55 0f a5 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
     108dbe1:	be 00 04 00 00       	mov    esi,0x400
     108dbe6:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108dbea:	4c 01 f6             	add    rsi,r14
     108dbed:	e8 68 78 a4 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>

### 0x108dbc7: cmp    al,BYTE PTR [r14+0x428] ; FDE=(17357552, 17357886)
     108db95:	e8 c0 78 a4 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
     108db9a:	41 0f 10 86 d0 03 00 	movups xmm0,XMMWORD PTR [r14+0x3d0]
     108dba1:	00 
     108dba2:	41 0f 10 8e e0 03 00 	movups xmm1,XMMWORD PTR [r14+0x3e0]
     108dba9:	00 
     108dbaa:	0f 11 8b e0 03 00 00 	movups XMMWORD PTR [rbx+0x3e0],xmm1
     108dbb1:	0f 11 83 d0 03 00 00 	movups XMMWORD PTR [rbx+0x3d0],xmm0
     108dbb8:	be f0 03 00 00       	mov    esi,0x3f0
     108dbbd:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108dbc1:	8a 83 28 04 00 00    	mov    al,BYTE PTR [rbx+0x428]
     108dbc7:	41 3a 86 28 04 00 00 	cmp    al,BYTE PTR [r14+0x428]
     108dbce:	75 31                	jne    108dc01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255017>
     108dbd0:	84 c0                	test   al,al
     108dbd2:	74 40                	je     108dc14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25502a>
     108dbd4:	41 0f 10 86 f0 03 00 	movups xmm0,XMMWORD PTR [r14+0x3f0]
     108dbdb:	00 
     108dbdc:	e8 55 0f a5 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
     108dbe1:	be 00 04 00 00       	mov    esi,0x400
     108dbe6:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108dbea:	4c 01 f6             	add    rsi,r14
     108dbed:	e8 68 78 a4 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
     108dbf2:	41 8a 86 20 04 00 00 	mov    al,BYTE PTR [r14+0x420]

### 0x108dbd4: movups xmm0,XMMWORD PTR [r14+0x3f0] ; FDE=(17357552, 17357886)
     108dba9:	00 
     108dbaa:	0f 11 8b e0 03 00 00 	movups XMMWORD PTR [rbx+0x3e0],xmm1
     108dbb1:	0f 11 83 d0 03 00 00 	movups XMMWORD PTR [rbx+0x3d0],xmm0
     108dbb8:	be f0 03 00 00       	mov    esi,0x3f0
     108dbbd:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108dbc1:	8a 83 28 04 00 00    	mov    al,BYTE PTR [rbx+0x428]
     108dbc7:	41 3a 86 28 04 00 00 	cmp    al,BYTE PTR [r14+0x428]
     108dbce:	75 31                	jne    108dc01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255017>
     108dbd0:	84 c0                	test   al,al
     108dbd2:	74 40                	je     108dc14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25502a>
     108dbd4:	41 0f 10 86 f0 03 00 	movups xmm0,XMMWORD PTR [r14+0x3f0]
     108dbdb:	00 
     108dbdc:	e8 55 0f a5 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
     108dbe1:	be 00 04 00 00       	mov    esi,0x400
     108dbe6:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108dbea:	4c 01 f6             	add    rsi,r14
     108dbed:	e8 68 78 a4 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
     108dbf2:	41 8a 86 20 04 00 00 	mov    al,BYTE PTR [r14+0x420]
     108dbf9:	88 83 20 04 00 00    	mov    BYTE PTR [rbx+0x420],al
     108dbff:	eb 13                	jmp    108dc14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25502a>
     108dc01:	84 c0                	test   al,al
     108dc03:	74 07                	je     108dc0c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255022>

### 0x108de6e: mov    BYTE PTR [rbx+0x3f0],al ; FDE=(17358036, 17358525)
     108de3f:	49 83 a6 c0 03 00 00 	and    QWORD PTR [r14+0x3c0],0x0
     108de46:	00 
     108de47:	c6 83 c8 03 00 00 01 	mov    BYTE PTR [rbx+0x3c8],0x1
     108de4e:	41 0f 10 86 d0 03 00 	movups xmm0,XMMWORD PTR [r14+0x3d0]
     108de55:	00 
     108de56:	41 0f 10 8e e0 03 00 	movups xmm1,XMMWORD PTR [r14+0x3e0]
     108de5d:	00 
     108de5e:	0f 11 8b e0 03 00 00 	movups XMMWORD PTR [rbx+0x3e0],xmm1
     108de65:	0f 11 83 d0 03 00 00 	movups XMMWORD PTR [rbx+0x3d0],xmm0
     108de6c:	31 c0                	xor    eax,eax
     108de6e:	88 83 f0 03 00 00    	mov    BYTE PTR [rbx+0x3f0],al
     108de74:	88 83 28 04 00 00    	mov    BYTE PTR [rbx+0x428],al
     108de7a:	41 38 86 28 04 00 00 	cmp    BYTE PTR [r14+0x428],al
     108de81:	74 13                	je     108de96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2552ac>
     108de83:	48 8d bb f0 03 00 00 	lea    rdi,[rbx+0x3f0]
     108de8a:	49 8d b6 f0 03 00 00 	lea    rsi,[r14+0x3f0]
     108de91:	e8 3a 05 00 00       	call   108e3d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2557e6>
     108de96:	be 30 04 00 00       	mov    esi,0x430
     108de9b:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108de9f:	4c 01 f6             	add    rsi,r14
     108dea2:	e8 8b 03 00 00       	call   108e232 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255648>
     108dea7:	49 8b 86 48 05 00 00 	mov    rax,QWORD PTR [r14+0x548]

### 0x108de74: mov    BYTE PTR [rbx+0x428],al ; FDE=(17358036, 17358525)
     108de46:	00 
     108de47:	c6 83 c8 03 00 00 01 	mov    BYTE PTR [rbx+0x3c8],0x1
     108de4e:	41 0f 10 86 d0 03 00 	movups xmm0,XMMWORD PTR [r14+0x3d0]
     108de55:	00 
     108de56:	41 0f 10 8e e0 03 00 	movups xmm1,XMMWORD PTR [r14+0x3e0]
     108de5d:	00 
     108de5e:	0f 11 8b e0 03 00 00 	movups XMMWORD PTR [rbx+0x3e0],xmm1
     108de65:	0f 11 83 d0 03 00 00 	movups XMMWORD PTR [rbx+0x3d0],xmm0
     108de6c:	31 c0                	xor    eax,eax
     108de6e:	88 83 f0 03 00 00    	mov    BYTE PTR [rbx+0x3f0],al
     108de74:	88 83 28 04 00 00    	mov    BYTE PTR [rbx+0x428],al
     108de7a:	41 38 86 28 04 00 00 	cmp    BYTE PTR [r14+0x428],al
     108de81:	74 13                	je     108de96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2552ac>
     108de83:	48 8d bb f0 03 00 00 	lea    rdi,[rbx+0x3f0]
     108de8a:	49 8d b6 f0 03 00 00 	lea    rsi,[r14+0x3f0]
     108de91:	e8 3a 05 00 00       	call   108e3d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2557e6>
     108de96:	be 30 04 00 00       	mov    esi,0x430
     108de9b:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108de9f:	4c 01 f6             	add    rsi,r14
     108dea2:	e8 8b 03 00 00       	call   108e232 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255648>
     108dea7:	49 8b 86 48 05 00 00 	mov    rax,QWORD PTR [r14+0x548]
     108deae:	48 89 83 48 05 00 00 	mov    QWORD PTR [rbx+0x548],rax

### 0x108de7a: cmp    BYTE PTR [r14+0x428],al ; FDE=(17358036, 17358525)
     108de47:	c6 83 c8 03 00 00 01 	mov    BYTE PTR [rbx+0x3c8],0x1
     108de4e:	41 0f 10 86 d0 03 00 	movups xmm0,XMMWORD PTR [r14+0x3d0]
     108de55:	00 
     108de56:	41 0f 10 8e e0 03 00 	movups xmm1,XMMWORD PTR [r14+0x3e0]
     108de5d:	00 
     108de5e:	0f 11 8b e0 03 00 00 	movups XMMWORD PTR [rbx+0x3e0],xmm1
     108de65:	0f 11 83 d0 03 00 00 	movups XMMWORD PTR [rbx+0x3d0],xmm0
     108de6c:	31 c0                	xor    eax,eax
     108de6e:	88 83 f0 03 00 00    	mov    BYTE PTR [rbx+0x3f0],al
     108de74:	88 83 28 04 00 00    	mov    BYTE PTR [rbx+0x428],al
     108de7a:	41 38 86 28 04 00 00 	cmp    BYTE PTR [r14+0x428],al
     108de81:	74 13                	je     108de96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2552ac>
     108de83:	48 8d bb f0 03 00 00 	lea    rdi,[rbx+0x3f0]
     108de8a:	49 8d b6 f0 03 00 00 	lea    rsi,[r14+0x3f0]
     108de91:	e8 3a 05 00 00       	call   108e3d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2557e6>
     108de96:	be 30 04 00 00       	mov    esi,0x430
     108de9b:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108de9f:	4c 01 f6             	add    rsi,r14
     108dea2:	e8 8b 03 00 00       	call   108e232 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255648>
     108dea7:	49 8b 86 48 05 00 00 	mov    rax,QWORD PTR [r14+0x548]
     108deae:	48 89 83 48 05 00 00 	mov    QWORD PTR [rbx+0x548],rax
     108deb5:	48 83 c4 08          	add    rsp,0x8

### 0x108de83: lea    rdi,[rbx+0x3f0] ; FDE=(17358036, 17358525)
     108de55:	00 
     108de56:	41 0f 10 8e e0 03 00 	movups xmm1,XMMWORD PTR [r14+0x3e0]
     108de5d:	00 
     108de5e:	0f 11 8b e0 03 00 00 	movups XMMWORD PTR [rbx+0x3e0],xmm1
     108de65:	0f 11 83 d0 03 00 00 	movups XMMWORD PTR [rbx+0x3d0],xmm0
     108de6c:	31 c0                	xor    eax,eax
     108de6e:	88 83 f0 03 00 00    	mov    BYTE PTR [rbx+0x3f0],al
     108de74:	88 83 28 04 00 00    	mov    BYTE PTR [rbx+0x428],al
     108de7a:	41 38 86 28 04 00 00 	cmp    BYTE PTR [r14+0x428],al
     108de81:	74 13                	je     108de96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2552ac>
     108de83:	48 8d bb f0 03 00 00 	lea    rdi,[rbx+0x3f0]
     108de8a:	49 8d b6 f0 03 00 00 	lea    rsi,[r14+0x3f0]
     108de91:	e8 3a 05 00 00       	call   108e3d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2557e6>
     108de96:	be 30 04 00 00       	mov    esi,0x430
     108de9b:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108de9f:	4c 01 f6             	add    rsi,r14
     108dea2:	e8 8b 03 00 00       	call   108e232 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255648>
     108dea7:	49 8b 86 48 05 00 00 	mov    rax,QWORD PTR [r14+0x548]
     108deae:	48 89 83 48 05 00 00 	mov    QWORD PTR [rbx+0x548],rax
     108deb5:	48 83 c4 08          	add    rsp,0x8
     108deb9:	5b                   	pop    rbx
     108deba:	41 5e                	pop    r14

### 0x108de8a: lea    rsi,[r14+0x3f0] ; FDE=(17358036, 17358525)
     108de56:	41 0f 10 8e e0 03 00 	movups xmm1,XMMWORD PTR [r14+0x3e0]
     108de5d:	00 
     108de5e:	0f 11 8b e0 03 00 00 	movups XMMWORD PTR [rbx+0x3e0],xmm1
     108de65:	0f 11 83 d0 03 00 00 	movups XMMWORD PTR [rbx+0x3d0],xmm0
     108de6c:	31 c0                	xor    eax,eax
     108de6e:	88 83 f0 03 00 00    	mov    BYTE PTR [rbx+0x3f0],al
     108de74:	88 83 28 04 00 00    	mov    BYTE PTR [rbx+0x428],al
     108de7a:	41 38 86 28 04 00 00 	cmp    BYTE PTR [r14+0x428],al
     108de81:	74 13                	je     108de96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2552ac>
     108de83:	48 8d bb f0 03 00 00 	lea    rdi,[rbx+0x3f0]
     108de8a:	49 8d b6 f0 03 00 00 	lea    rsi,[r14+0x3f0]
     108de91:	e8 3a 05 00 00       	call   108e3d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2557e6>
     108de96:	be 30 04 00 00       	mov    esi,0x430
     108de9b:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108de9f:	4c 01 f6             	add    rsi,r14
     108dea2:	e8 8b 03 00 00       	call   108e232 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255648>
     108dea7:	49 8b 86 48 05 00 00 	mov    rax,QWORD PTR [r14+0x548]
     108deae:	48 89 83 48 05 00 00 	mov    QWORD PTR [rbx+0x548],rax
     108deb5:	48 83 c4 08          	add    rsp,0x8
     108deb9:	5b                   	pop    rbx
     108deba:	41 5e                	pop    r14
     108debc:	c3                   	ret

### 0x108eb0b: cmp    BYTE PTR [r14+0x470],0x0 ; FDE=(17361612, 17361817)
     108eae0:	00 00 
     108eae2:	48 89 84 24 e0 04 00 	mov    QWORD PTR [rsp+0x4e0],rax
     108eae9:	00 
     108eaea:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
     108eaee:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     108eaf1:	ff 90 d8 00 00 00    	call   QWORD PTR [rax+0xd8]
     108eaf7:	48 8d b0 c0 04 00 00 	lea    rsi,[rax+0x4c0]
     108eafe:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     108eb03:	4c 89 f7             	mov    rdi,r14
     108eb06:	e8 0d 40 d8 ff       	call   e12b18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdfb9e>
     108eb0b:	41 80 be 70 04 00 00 	cmp    BYTE PTR [r14+0x470],0x0
     108eb12:	00 
     108eb13:	74 1f                	je     108eb34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255f4a>
     108eb15:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     108eb1a:	e8 17 cd 9e ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     108eb1f:	4c 8d b4 24 80 04 00 	lea    r14,[rsp+0x480]
     108eb26:	00 
     108eb27:	4c 89 f7             	mov    rdi,r14
     108eb2a:	48 89 c6             	mov    rsi,rax
     108eb2d:	e8 f6 68 63 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
     108eb32:	eb 1e                	jmp    108eb52 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255f68>
     108eb34:	4c 8d b4 24 80 04 00 	lea    r14,[rsp+0x480]

### 0x10997d2: movups XMMWORD PTR [r13+0x3f0],xmm0 ; FDE=(17404282, 17407345)
     10997a9:	41 0f 29 85 d0 03 00 	movaps XMMWORD PTR [r13+0x3d0],xmm0
     10997b0:	00 
     10997b1:	41 0f 11 85 d9 03 00 	movups XMMWORD PTR [r13+0x3d9],xmm0
     10997b8:	00 
     10997b9:	0f 57 c9             	xorps  xmm1,xmm1
     10997bc:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     10997c3:	00 
     10997c4:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     10997c8:	49 89 85 00 04 00 00 	mov    QWORD PTR [r13+0x400],rax
     10997cf:	0f 28 07             	movaps xmm0,XMMWORD PTR [rdi]
     10997d2:	41 0f 11 85 f0 03 00 	movups XMMWORD PTR [r13+0x3f0],xmm0
     10997d9:	00 
     10997da:	0f 29 0f             	movaps XMMWORD PTR [rdi],xmm1
     10997dd:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     10997e2:	e8 a9 46 75 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10997e7:	0f 57 c0             	xorps  xmm0,xmm0
     10997ea:	41 0f 11 85 08 04 00 	movups XMMWORD PTR [r13+0x408],xmm0
     10997f1:	00 
     10997f2:	49 8d 9d 18 04 00 00 	lea    rbx,[r13+0x418]
     10997f9:	48 89 df             	mov    rdi,rbx
     10997fc:	e8 8d ea a8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1099801:	4d 8d b5 70 04 00 00 	lea    r14,[r13+0x470]

### 0x1099801: lea    r14,[r13+0x470] ; FDE=(17404282, 17407345)
     10997d9:	00 
     10997da:	0f 29 0f             	movaps XMMWORD PTR [rdi],xmm1
     10997dd:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     10997e2:	e8 a9 46 75 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10997e7:	0f 57 c0             	xorps  xmm0,xmm0
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
     109982f:	48 85 ff             	test   rdi,rdi
     1099832:	74 06                	je     109983a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260c50>

### 0x109b34d: and    DWORD PTR [rsp+0x438],0x0 ; FDE=(17412180, 17420432)
     109b329:	ff 50 48             	call   QWORD PTR [rax+0x48]
     109b32c:	49 89 c6             	mov    r14,rax
     109b32f:	48 89 c7             	mov    rdi,rax
     109b332:	e8 d9 2b 75 00       	call   17edf10 <strlen@plt>
     109b337:	4c 89 ff             	mov    rdi,r15
     109b33a:	4c 89 f6             	mov    rsi,r14
     109b33d:	48 89 c2             	mov    rdx,rax
     109b340:	e8 0d 45 6e 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
     109b345:	84 c0                	test   al,al
     109b347:	0f 84 1c 01 00 00    	je     109b469 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26287f>
     109b34d:	83 a4 24 38 04 00 00 	and    DWORD PTR [rsp+0x438],0x0
     109b354:	00 
     109b355:	0f 57 c0             	xorps  xmm0,xmm0
     109b358:	0f 29 84 24 00 04 00 	movaps XMMWORD PTR [rsp+0x400],xmm0
     109b35f:	00 
     109b360:	0f 29 84 24 10 04 00 	movaps XMMWORD PTR [rsp+0x410],xmm0
     109b367:	00 
     109b368:	0f 29 84 24 20 04 00 	movaps XMMWORD PTR [rsp+0x420],xmm0
     109b36f:	00 
     109b370:	48 8b bc 24 40 03 00 	mov    rdi,QWORD PTR [rsp+0x340]
     109b377:	00 
     109b378:	48 83 e7 fc          	and    rdi,0xfffffffffffffffc

### 0x109b38c: mov    eax,DWORD PTR [rsp+0x438] ; FDE=(17412180, 17420432)
     109b367:	00 
     109b368:	0f 29 84 24 20 04 00 	movaps XMMWORD PTR [rsp+0x420],xmm0
     109b36f:	00 
     109b370:	48 8b bc 24 40 03 00 	mov    rdi,QWORD PTR [rsp+0x340]
     109b377:	00 
     109b378:	48 83 e7 fc          	and    rdi,0xfffffffffffffffc
     109b37c:	e8 b5 04 9e ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     109b381:	4c 89 ef             	mov    rdi,r13
     109b384:	48 89 c6             	mov    rsi,rax
     109b387:	e8 b4 a0 62 00       	call   16c5440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x795ac>
     109b38c:	8b 84 24 38 04 00 00 	mov    eax,DWORD PTR [rsp+0x438]
     109b393:	83 f8 3e             	cmp    eax,0x3e
     109b396:	0f 95 c1             	setne  cl
     109b399:	40 08 e9             	or     cl,bpl
     109b39c:	0f 84 06 03 00 00    	je     109b6a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x262abe>
     109b3a2:	83 f8 2f             	cmp    eax,0x2f
     109b3a5:	75 11                	jne    109b3b8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2627ce>
     109b3a7:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     109b3ab:	80 b8 b5 00 00 00 00 	cmp    BYTE PTR [rax+0xb5],0x0
     109b3b2:	0f 84 f0 02 00 00    	je     109b6a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x262abe>
     109b3b8:	49 89 dc             	mov    r12,rbx
     109b3bb:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]

### 0x109b3fc: mov    eax,DWORD PTR [rsp+0x438] ; FDE=(17412180, 17420432)
     109b3db:	74 1f                	je     109b3fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x262812>
     109b3dd:	48 8b 93 a0 01 00 00 	mov    rdx,QWORD PTR [rbx+0x1a0]
     109b3e4:	48 8b 42 08          	mov    rax,QWORD PTR [rdx+0x8]
     109b3e8:	48 2b 02             	sub    rax,QWORD PTR [rdx]
     109b3eb:	48 99                	cqo
     109b3ed:	6a 60                	push   0x60
     109b3ef:	5e                   	pop    rsi
     109b3f0:	48 f7 fe             	idiv   rsi
     109b3f3:	48 39 c8             	cmp    rax,rcx
     109b3f6:	0f 83 a9 02 00 00    	jae    109b6a5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x262abb>
     109b3fc:	8b 84 24 38 04 00 00 	mov    eax,DWORD PTR [rsp+0x438]
     109b403:	8d 48 ff             	lea    ecx,[rax-0x1]
     109b406:	83 f9 02             	cmp    ecx,0x2
     109b409:	0f 82 58 02 00 00    	jb     109b667 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x262a7d>
     109b40f:	83 f8 46             	cmp    eax,0x46
     109b412:	4c 8d b4 24 60 05 00 	lea    r14,[rsp+0x560]
     109b419:	00 
     109b41a:	74 1b                	je     109b437 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26284d>
     109b41c:	83 f8 2f             	cmp    eax,0x2f
     109b41f:	0f 84 42 02 00 00    	je     109b667 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x262a7d>
     109b425:	83 f8 3e             	cmp    eax,0x3e
     109b428:	0f 84 39 02 00 00    	je     109b667 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x262a7d>

### 0x10a209c: lea    rdi,[rbx+0x470] ; FDE=(17440898, 17441072)
     10a2078:	5d                   	pop    rbp
     10a2079:	c3                   	ret
     10a207a:	48 89 c7             	mov    rdi,rax
     10a207d:	e8 23 7a 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a2082:	53                   	push   rbx
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
     10a20d8:	48 8d bb 78 03 00 00 	lea    rdi,[rbx+0x378]
     10a20df:	e8 c0 f4 ff ff       	call   10a15a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2689ba>

### 0x10a74a0: cmp    BYTE PTR [r14+0x470],0x0 ; FDE=(17458276, 17465170)
     10a7471:	49 8d be 18 15 00 00 	lea    rdi,[r14+0x1518]
     10a7478:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a747f:	00 
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
     10a74d1:	e8 ba 65 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a74d6:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]

### 0x10a7582: mov    rdi,QWORD PTR [r14+0x438] ; FDE=(17458276, 17465170)
     10a7554:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a755b:	00 
     10a755c:	e8 1d 25 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7561:	49 8d be d0 14 00 00 	lea    rdi,[r14+0x14d0]
     10a7568:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a756f:	00 
     10a7570:	e8 1b 65 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7575:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a757c:	00 
     10a757d:	e8 0e 69 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
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

### 0x10a75d0: mov    rdi,QWORD PTR [r14+0x438] ; FDE=(17458276, 17465170)
     10a75a2:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a75a9:	00 
     10a75aa:	e8 cf 24 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a75af:	49 8d be e8 14 00 00 	lea    rdi,[r14+0x14e8]
     10a75b6:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a75bd:	00 
     10a75be:	e8 cd 64 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a75c3:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a75ca:	00 
     10a75cb:	e8 c0 68 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
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

### 0x10a761e: mov    rdi,QWORD PTR [r14+0x438] ; FDE=(17458276, 17465170)
     10a75f0:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a75f7:	00 
     10a75f8:	e8 81 24 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a75fd:	49 8d be 88 14 00 00 	lea    rdi,[r14+0x1488]
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

### 0x10a9677: cmp    BYTE PTR [rdi+0x470],0x0 ; FDE=(17471080, 17471132)
     10a9659:	48 83 c4 50          	add    rsp,0x50
     10a965d:	5b                   	pop    rbx
     10a965e:	41 5e                	pop    r14
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
     10a969c:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96a0:	e9 6d f1 ff ff       	jmp    10a8812 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fc28>

### 0x10a9680: mov    rax,QWORD PTR [rdi+0x438] ; FDE=(17471080, 17471132)
     10a965e:	41 5e                	pop    r14
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
     10a969c:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96a0:	e9 6d f1 ff ff       	jmp    10a8812 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fc28>
     10a96a5:	cc                   	int3
     10a96a6:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8

## Candidate ad-vptr stores

### 0x145580b: 145580b:	48 8d 05 3e 41 42 00 	lea    rax,[rip+0x42413e]        # 1879950 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36038>
     14557f7:	0f 11 47 20          	movups XMMWORD PTR [rdi+0x20],xmm0
     14557fb:	48 89 d6             	mov    rsi,rdx
     14557fe:	e9 f5 fe ff ff       	jmp    14556f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29ac7c>
     1455803:	cc                   	int3
     1455804:	41 56                	push   r14
     1455806:	53                   	push   rbx
     1455807:	50                   	push   rax
     1455808:	48 89 fb             	mov    rbx,rdi
     145580b:	48 8d 05 3e 41 42 00 	lea    rax,[rip+0x42413e]        # 1879950 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36038>
     1455812:	48 89 07             	mov    QWORD PTR [rdi],rax
     1455815:	48 81 c7 90 01 00 00 	add    rdi,0x190
     145581c:	e8 45 ce 68 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
     1455821:	48 8d bb 70 01 00 00 	lea    rdi,[rbx+0x170]
     1455828:	e8 63 86 39 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     145582d:	48 8d bb 58 01 00 00 	lea    rdi,[rbx+0x158]
     1455834:	e8 57 86 39 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1455839:	48 8d bb 40 01 00 00 	lea    rdi,[rbx+0x140]
     1455840:	e8 4b 86 39 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1455845:	48 8d bb 28 01 00 00 	lea    rdi,[rbx+0x128]
     145584c:	e8 3f 86 39 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1455851:	48 8d bb 00 01 00 00 	lea    rdi,[rbx+0x100]
     1455858:	e8 8d 5a 6a ff       	call   afb2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4828a>
     145585d:	48 8d bb e0 00 00 00 	lea    rdi,[rbx+0xe0]
     1455864:	e8 27 86 39 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1455869:	48 83 bb c8 00 00 00 	cmp    QWORD PTR [rbx+0xc8],0x0
     1455870:	00 

### 0x14e15ff: 14e15ff:	48 8d 05 4a 83 39 00 	lea    rax,[rip+0x39834a]        # 1879950 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36038>
     14e15e5:	41 57                	push   r15
     14e15e7:	41 56                	push   r14
     14e15e9:	53                   	push   rbx
     14e15ea:	48 83 ec 48          	sub    rsp,0x48
     14e15ee:	48 89 fb             	mov    rbx,rdi
     14e15f1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14e15f8:	00 00 
     14e15fa:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     14e15ff:	48 8d 05 4a 83 39 00 	lea    rax,[rip+0x39834a]        # 1879950 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36038>
     14e1606:	48 89 07             	mov    QWORD PTR [rdi],rax
     14e1609:	4c 8d 77 08          	lea    r14,[rdi+0x8]
     14e160d:	48 89 f7             	mov    rdi,rsi
     14e1610:	e8 a7 11 00 00       	call   14e27bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327d40>
     14e1615:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     14e161a:	48 89 06             	mov    QWORD PTR [rsi],rax
     14e161d:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     14e1621:	4c 8d 7c 24 1f       	lea    r15,[rsp+0x1f]
     14e1626:	4c 89 ff             	mov    rdi,r15
     14e1629:	e8 f2 2c 6b ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
     14e162e:	4c 89 f7             	mov    rdi,r14
     14e1631:	4c 89 fe             	mov    rsi,r15
     14e1634:	e8 af 2d e7 ff       	call   13543e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19996c>
     14e1639:	0f 57 c0             	xorps  xmm0,xmm0
     14e163c:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
     14e1640:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
     14e1644:	bd 00 00 80 3f       	mov    ebp,0x3f800000

