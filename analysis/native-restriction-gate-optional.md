# Restriction-owner +0x598 optional-state payload trace

Coordinate: helper state base = owner+0x38; engagement byte sub+0x560 = owner+0x598.

## optional-state assign existing: 0x108daf0
Function: 0x108daf0..0x108dc3e
Disassembly:
     108daf0:	41 56                	push   r14
     108daf2:	53                   	push   rbx
     108daf3:	50                   	push   rax
     108daf4:	49 89 f6             	mov    r14,rsi
     108daf7:	48 89 fb             	mov    rbx,rdi
     108dafa:	e8 af f6 ff ff       	call   108d1ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2545c4>
     108daff:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
     108db03:	49 8d 76 48          	lea    rsi,[r14+0x48]
     108db07:	e8 74 05 76 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     108db0c:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
     108db10:	49 8d 76 60          	lea    rsi,[r14+0x60]
     108db14:	e8 67 05 76 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     108db19:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
     108db1d:	49 8d 76 78          	lea    rsi,[r14+0x78]
     108db21:	e8 5a 05 76 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     108db26:	be 90 00 00 00       	mov    esi,0x90
     108db2b:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108db2f:	4c 01 f6             	add    rsi,r14
     108db32:	e8 af f6 ff ff       	call   108d1e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2545fc>
     108db37:	be d8 02 00 00       	mov    esi,0x2d8
     108db3c:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108db40:	4c 01 f6             	add    rsi,r14
     108db43:	ba 99 00 00 00       	mov    edx,0x99
     108db48:	e8 83 1f 76 00       	call   17efad0 <memcpy@plt>
     108db4d:	be 78 03 00 00       	mov    esi,0x378
     108db52:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108db56:	4c 01 f6             	add    rsi,r14
     108db59:	e8 22 05 76 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     108db5e:	be 90 03 00 00       	mov    esi,0x390
     108db63:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108db67:	4c 01 f6             	add    rsi,r14
     108db6a:	e8 11 05 76 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     108db6f:	41 8b 86 a8 03 00 00 	mov    eax,DWORD PTR [r14+0x3a8]
     108db76:	89 83 a8 03 00 00    	mov    DWORD PTR [rbx+0x3a8],eax
     108db7c:	41 8a 86 ac 03 00 00 	mov    al,BYTE PTR [r14+0x3ac]
     108db83:	88 83 ac 03 00 00    	mov    BYTE PTR [rbx+0x3ac],al
     108db89:	be b0 03 00 00       	mov    esi,0x3b0
     108db8e:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
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

## optional-state destroy/reset: 0x1089a72
Function: 0x1089a72..0x1089aca
Disassembly:
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
     1089ac1:	48 89 df             	mov    rdi,rbx
     1089ac4:	5b                   	pop    rbx
     1089ac5:	e9 02 4d a1 ff       	jmp    a9e7cc <JNI_OnUnload@@Base+0x26099>

## optional-state construct from source: 0x108dc54
Function: 0x108dc54..0x108dc66
Disassembly:
     108dc54:	53                   	push   rbx
     108dc55:	48 89 fb             	mov    rbx,rdi
     108dc58:	e8 2f fc ff ff       	call   108d88c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ca2>
     108dc5d:	c6 83 50 05 00 00 01 	mov    BYTE PTR [rbx+0x550],0x1
     108dc64:	5b                   	pop    rbx
     108dc65:	c3                   	ret

## owner wrapper around 1089b98: 0x10a9df9
Function: 0x10a9dee..0x10a9e37
Disassembly:
     10a9dee:	53                   	push   rbx
     10a9def:	48 89 fb             	mov    rbx,rdi
     10a9df2:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
     10a9df9:	e8 9a fd fd ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     10a9dfe:	48 8d bb 88 00 00 00 	lea    rdi,[rbx+0x88]
     10a9e05:	e8 86 40 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a9e0a:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
     10a9e0e:	e8 7d 40 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a9e13:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
     10a9e17:	e8 74 40 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a9e1c:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     10a9e20:	e8 6b 40 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a9e25:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     10a9e29:	e8 62 40 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a9e2e:	48 89 df             	mov    rdi,rbx
     10a9e31:	5b                   	pop    rbx
     10a9e32:	e9 59 40 74 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

## owner wrapper around reset: 0x10a9e38
Function: 0x10a9e38..0x10a9e51
Disassembly:
     10a9e38:	53                   	push   rbx
     10a9e39:	48 89 fb             	mov    rbx,rdi
     10a9e3c:	48 81 c7 60 01 00 00 	add    rdi,0x160
     10a9e43:	e8 2a fc fd ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     10a9e48:	48 89 df             	mov    rdi,rbx
     10a9e4b:	5b                   	pop    rbx
     10a9e4c:	e9 9d ff ff ff       	jmp    10a9dee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271204>

## owner wrapper around 108daf0: 0x10aa70a
Function: 0x10aa70a..0x10aa738
Disassembly:
     10aa70a:	41 56                	push   r14
     10aa70c:	53                   	push   rbx
     10aa70d:	50                   	push   rax
     10aa70e:	48 89 f3             	mov    rbx,rsi
     10aa711:	49 89 fe             	mov    r14,rdi
     10aa714:	e8 1f 00 00 00       	call   10aa738 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271b4e>
     10aa719:	b8 60 01 00 00       	mov    eax,0x160
     10aa71e:	49 8d 3c 06          	lea    rdi,[r14+rax*1]
     10aa722:	48 01 c3             	add    rbx,rax
     10aa725:	48 89 de             	mov    rsi,rbx
     10aa728:	e8 c3 33 fe ff       	call   108daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254f06>
     10aa72d:	4c 89 f0             	mov    rax,r14
     10aa730:	48 83 c4 08          	add    rsp,0x8
     10aa734:	5b                   	pop    rbx
     10aa735:	41 5e                	pop    r14
     10aa737:	c3                   	ret

## helper 1089b98: 0x1089b98
Function: 0x1089b98..0x1089bea
Disassembly:
     1089b98:	53                   	push   rbx
     1089b99:	48 89 fb             	mov    rbx,rdi
     1089b9c:	48 81 c7 a8 00 00 00 	add    rdi,0xa8
     1089ba3:	e8 e8 42 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1089ba8:	48 8d bb 90 00 00 00 	lea    rdi,[rbx+0x90]
     1089baf:	e8 dc 42 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1089bb4:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
     1089bb8:	e8 d3 42 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1089bbd:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
     1089bc1:	e8 ca 42 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1089bc6:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
     1089bca:	e8 c1 42 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1089bcf:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     1089bd3:	e8 b8 42 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1089bd8:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     1089bdc:	e8 af 42 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1089be1:	48 89 df             	mov    rdi,rbx
     1089be4:	5b                   	pop    rbx
     1089be5:	e9 a6 42 76 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

## Direct xrefs to optional helper trio

### target 0x108daf0
- 0x1089fe7 from 0x1089f9e..0x108a477
     1089fc6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1089fc9:	48 89 07             	mov    QWORD PTR [rdi],rax
     1089fcc:	48 83 c7 10          	add    rdi,0x10
     1089fd0:	48 83 c6 10          	add    rsi,0x10
     1089fd4:	8a 83 60 05 00 00    	mov    al,BYTE PTR [rbx+0x560]
     1089fda:	41 3a 86 60 05 00 00 	cmp    al,BYTE PTR [r14+0x560]
     1089fe1:	75 0b                	jne    1089fee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251404>
     1089fe3:	84 c0                	test   al,al
     1089fe5:	74 1e                	je     108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fe7:	e8 04 3b 00 00       	call   108daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254f06>
     1089fec:	eb 17                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fee:	84 c0                	test   al,al
     1089ff0:	74 0e                	je     108a000 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251416>
     1089ff2:	e8 7b fa ff ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     1089ff7:	c6 83 60 05 00 00 00 	mov    BYTE PTR [rbx+0x560],0x0
     1089ffe:	eb 05                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     108a000:	e8 4f 3c 00 00       	call   108dc54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25506a>
     108a005:	4c 39 f3             	cmp    rbx,r14
     108a008:	4c 89 34 24          	mov    QWORD PTR [rsp],r14
     108a00c:	0f 84 e3 00 00 00    	je     108a0f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25150b>

- 0x108d6e4 from 0x108d6c2..0x108d703
     108d6c9:	50                   	push   rax
     108d6ca:	48 89 d3             	mov    rbx,rdx
     108d6cd:	48 39 f7             	cmp    rdi,rsi
     108d6d0:	74 22                	je     108d6f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254b0a>
     108d6d2:	49 89 f6             	mov    r14,rsi
     108d6d5:	49 89 ff             	mov    r15,rdi
     108d6d8:	41 bc 50 05 00 00    	mov    r12d,0x550
     108d6de:	48 89 df             	mov    rdi,rbx
     108d6e1:	4c 89 fe             	mov    rsi,r15
     108d6e4:	e8 07 04 00 00       	call   108daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254f06>
     108d6e9:	4d 01 e7             	add    r15,r12
     108d6ec:	4c 01 e3             	add    rbx,r12
     108d6ef:	4d 39 f7             	cmp    r15,r14
     108d6f2:	75 ea                	jne    108d6de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254af4>
     108d6f4:	48 89 d8             	mov    rax,rbx
     108d6f7:	48 83 c4 08          	add    rsp,0x8
     108d6fb:	5b                   	pop    rbx
     108d6fc:	41 5c                	pop    r12
     108d6fe:	41 5e                	pop    r14
     108d700:	41 5f                	pop    r15

- 0x10aa728 from 0x10aa70a..0x10aa738
     10aa70c:	53                   	push   rbx
     10aa70d:	50                   	push   rax
     10aa70e:	48 89 f3             	mov    rbx,rsi
     10aa711:	49 89 fe             	mov    r14,rdi
     10aa714:	e8 1f 00 00 00       	call   10aa738 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271b4e>
     10aa719:	b8 60 01 00 00       	mov    eax,0x160
     10aa71e:	49 8d 3c 06          	lea    rdi,[r14+rax*1]
     10aa722:	48 01 c3             	add    rbx,rax
     10aa725:	48 89 de             	mov    rsi,rbx
     10aa728:	e8 c3 33 fe ff       	call   108daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254f06>
     10aa72d:	4c 89 f0             	mov    rax,r14
     10aa730:	48 83 c4 08          	add    rsp,0x8
     10aa734:	5b                   	pop    rbx
     10aa735:	41 5e                	pop    r14
     10aa737:	c3                   	ret
     10aa738:	41 56                	push   r14
     10aa73a:	53                   	push   rbx
     10aa73b:	50                   	push   rax
     10aa73c:	49 89 f6             	mov    r14,rsi
     10aa73f:	48 89 fb             	mov    rbx,rdi

### target 0x1089a72
- 0x1089cd0 from 0x1089cb2..0x1089ce4
     1089cb4:	41 56                	push   r14
     1089cb6:	53                   	push   rbx
     1089cb7:	48 89 f3             	mov    rbx,rsi
     1089cba:	49 89 fe             	mov    r14,rdi
     1089cbd:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]
     1089cc1:	49 39 f7             	cmp    r15,rsi
     1089cc4:	74 14                	je     1089cda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2510f0>
     1089cc6:	49 81 c7 b0 fa ff ff 	add    r15,0xfffffffffffffab0
     1089ccd:	4c 89 ff             	mov    rdi,r15
     1089cd0:	e8 9d fd ff ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     1089cd5:	49 39 df             	cmp    r15,rbx
     1089cd8:	75 ec                	jne    1089cc6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2510dc>
     1089cda:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     1089cde:	5b                   	pop    rbx
     1089cdf:	41 5e                	pop    r14
     1089ce1:	41 5f                	pop    r15
     1089ce3:	c3                   	ret
     1089ce4:	53                   	push   rbx
     1089ce5:	48 89 fb             	mov    rbx,rdi
     1089ce8:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]

- 0x1089ff2 from 0x1089f9e..0x108a477
     1089fd4:	8a 83 60 05 00 00    	mov    al,BYTE PTR [rbx+0x560]
     1089fda:	41 3a 86 60 05 00 00 	cmp    al,BYTE PTR [r14+0x560]
     1089fe1:	75 0b                	jne    1089fee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251404>
     1089fe3:	84 c0                	test   al,al
     1089fe5:	74 1e                	je     108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fe7:	e8 04 3b 00 00       	call   108daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254f06>
     1089fec:	eb 17                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fee:	84 c0                	test   al,al
     1089ff0:	74 0e                	je     108a000 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251416>
     1089ff2:	e8 7b fa ff ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     1089ff7:	c6 83 60 05 00 00 00 	mov    BYTE PTR [rbx+0x560],0x0
     1089ffe:	eb 05                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     108a000:	e8 4f 3c 00 00       	call   108dc54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25506a>
     108a005:	4c 39 f3             	cmp    rbx,r14
     108a008:	4c 89 34 24          	mov    QWORD PTR [rsp],r14
     108a00c:	0f 84 e3 00 00 00    	je     108a0f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25150b>
     108a012:	4c 8d bb 68 05 00 00 	lea    r15,[rbx+0x568]
     108a019:	4d 8b ae 68 05 00 00 	mov    r13,QWORD PTR [r14+0x568]
     108a020:	4d 8b a6 70 05 00 00 	mov    r12,QWORD PTR [r14+0x570]
     108a027:	4c 89 e0             	mov    rax,r12

- 0x108da56 from 0x108da2e..0x108da65
     108da38:	50                   	push   rax
     108da39:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     108da3d:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
     108da41:	48 8b 19             	mov    rbx,QWORD PTR [rcx]
     108da44:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     108da47:	4c 39 f3             	cmp    rbx,r14
     108da4a:	74 11                	je     108da5d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254e73>
     108da4c:	48 81 c3 b0 fa ff ff 	add    rbx,0xfffffffffffffab0
     108da53:	48 89 df             	mov    rdi,rbx
     108da56:	e8 17 c0 ff ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     108da5b:	eb ea                	jmp    108da47 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254e5d>
     108da5d:	48 83 c4 08          	add    rsp,0x8
     108da61:	5b                   	pop    rbx
     108da62:	41 5e                	pop    r14
     108da64:	c3                   	ret
     108da65:	cc                   	int3
     108da66:	41 56                	push   r14
     108da68:	53                   	push   rbx
     108da69:	50                   	push   rax
     108da6a:	31 c0                	xor    eax,eax

- 0x10a9e43 from 0x10a9e38..0x10a9e51
     10a9e25:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     10a9e29:	e8 62 40 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a9e2e:	48 89 df             	mov    rdi,rbx
     10a9e31:	5b                   	pop    rbx
     10a9e32:	e9 59 40 74 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a9e37:	cc                   	int3
     10a9e38:	53                   	push   rbx
     10a9e39:	48 89 fb             	mov    rbx,rdi
     10a9e3c:	48 81 c7 60 01 00 00 	add    rdi,0x160
     10a9e43:	e8 2a fc fd ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     10a9e48:	48 89 df             	mov    rdi,rbx
     10a9e4b:	5b                   	pop    rbx
     10a9e4c:	e9 9d ff ff ff       	jmp    10a9dee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271204>
     10a9e51:	cc                   	int3
     10a9e52:	53                   	push   rbx
     10a9e53:	48 89 fb             	mov    rbx,rdi
     10a9e56:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     10a9e59:	48 83 3f 00          	cmp    QWORD PTR [rdi],0x0
     10a9e5d:	74 11                	je     10a9e70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271286>
     10a9e5f:	e8 0e 00 00 00       	call   10a9e72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271288>

- 0x1365c94 from 0x1365a22..0x1366d0c
     1365c72:	eb 08                	jmp    1365c7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab200>
     1365c74:	4c 89 f6             	mov    rsi,r14
     1365c77:	e8 ce 85 d2 ff       	call   108e24a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255660>
     1365c7c:	48 8b 84 24 50 0f 00 	mov    rax,QWORD PTR [rsp+0xf50]
     1365c83:	00 
     1365c84:	48 89 84 24 a0 14 00 	mov    QWORD PTR [rsp+0x14a0],rax
     1365c8b:	00 
     1365c8c:	48 8d bc 24 08 0a 00 	lea    rdi,[rsp+0xa08]
     1365c93:	00 
     1365c94:	e8 d9 3d d2 ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     1365c99:	48 8b b5 80 06 00 00 	mov    rsi,QWORD PTR [rbp+0x680]
     1365ca0:	48 85 f6             	test   rsi,rsi
     1365ca3:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     1365ca8:	74 2f                	je     1365cd9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab25d>
     1365caa:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1365cad:	48 8d bc 24 08 0a 00 	lea    rdi,[rsp+0xa08]
     1365cb4:	00 
     1365cb5:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
     1365cbb:	8a 84 24 18 0a 00 00 	mov    al,BYTE PTR [rsp+0xa18]
     1365cc2:	88 84 24 68 12 00 00 	mov    BYTE PTR [rsp+0x1268],al

- 0x1366122 from 0x1365a22..0x1366d0c
     13660fc:	8a 84 24 20 01 00 00 	mov    al,BYTE PTR [rsp+0x120]
     1366103:	41 88 45 10          	mov    BYTE PTR [r13+0x10],al
     1366107:	0f 10 84 24 10 01 00 	movups xmm0,XMMWORD PTR [rsp+0x110]
     136610e:	00 
     136610f:	41 0f 11 45 00       	movups XMMWORD PTR [r13+0x0],xmm0
     1366114:	48 89 ef             	mov    rdi,rbp
     1366117:	4c 89 e6             	mov    rsi,r12
     136611a:	e8 7d 82 00 00       	call   136e39c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3920>
     136611f:	4c 89 e7             	mov    rdi,r12
     1366122:	e8 4b 39 d2 ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     1366127:	49 83 c6 08          	add    r14,0x8
     136612b:	4d 39 fe             	cmp    r14,r15
     136612e:	75 95                	jne    13660c5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab649>
     1366130:	48 8b 84 24 b0 00 00 	mov    rax,QWORD PTR [rsp+0xb0]
     1366137:	00 
     1366138:	48 3b 84 24 b8 00 00 	cmp    rax,QWORD PTR [rsp+0xb8]
     136613f:	00 
     1366140:	48 8b 6c 24 08       	mov    rbp,QWORD PTR [rsp+0x8]
     1366145:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     136614a:	75 6f                	jne    13661bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab73f>

- 0x13661b6 from 0x1365a22..0x1366d0c
     136618c:	88 86 10 03 00 00    	mov    BYTE PTR [rsi+0x310],al
     1366192:	0f 10 84 24 10 01 00 	movups xmm0,XMMWORD PTR [rsp+0x110]
     1366199:	00 
     136619a:	0f 11 86 00 03 00 00 	movups XMMWORD PTR [rsi+0x300],xmm0
     13661a1:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     13661a8:	00 
     13661a9:	e8 ee 81 00 00       	call   136e39c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3920>
     13661ae:	48 8d bc 24 08 0a 00 	lea    rdi,[rsp+0xa08]
     13661b5:	00 
     13661b6:	e8 b7 38 d2 ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     13661bb:	4d 85 f6             	test   r14,r14
     13661be:	0f 95 c0             	setne  al
     13661c1:	89 04 24             	mov    DWORD PTR [rsp],eax
     13661c4:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
     13661cb:	00 00 
     13661cd:	0f 57 c0             	xorps  xmm0,xmm0
     13661d0:	48 83 64 24 60 00    	and    QWORD PTR [rsp+0x60],0x0
     13661d6:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
     13661db:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
     13661e0:	80 bd b8 05 00 00 00 	cmp    BYTE PTR [rbp+0x5b8],0x0

- 0x1366c5f from 0x1365a22..0x1366d0c
     1366c3f:	e8 86 2e d2 ff       	call   1089aca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250ee0>
     1366c44:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     1366c49:	e8 42 72 48 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1366c4e:	eb 1e                	jmp    1366c6e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac1f2>
     1366c50:	eb 2b                	jmp    1366c7d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac201>
     1366c52:	eb 12                	jmp    1366c66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac1ea>
     1366c54:	48 89 c3             	mov    rbx,rax
     1366c57:	48 8d bc 24 08 0a 00 	lea    rdi,[rsp+0xa08]
     1366c5e:	00 
     1366c5f:	e8 0e 2e d2 ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     1366c64:	eb 48                	jmp    1366cae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac232>
     1366c66:	48 89 c3             	mov    rbx,rax
     1366c69:	eb 43                	jmp    1366cae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac232>
     1366c6b:	48 89 c3             	mov    rbx,rax
     1366c6e:	48 8d bc 24 60 08 00 	lea    rdi,[rsp+0x860]
     1366c75:	00 
     1366c76:	e8 51 7b 73 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1366c7b:	eb 03                	jmp    1366c80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac204>
     1366c7d:	48 89 c3             	mov    rbx,rax
     1366c80:	48 8d bc 24 a8 08 00 	lea    rdi,[rsp+0x8a8]

- 0x136e379 from 0x136e35a..0x136e39c
     136e35c:	53                   	push   rbx
     136e35d:	50                   	push   rax
     136e35e:	48 89 fb             	mov    rbx,rdi
     136e361:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
     136e365:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
     136e369:	4c 39 f7             	cmp    rdi,r14
     136e36c:	74 16                	je     136e384 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3908>
     136e36e:	48 81 c7 b0 fa ff ff 	add    rdi,0xfffffffffffffab0
     136e375:	48 89 7b 10          	mov    QWORD PTR [rbx+0x10],rdi
     136e379:	e8 f4 b6 d1 ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     136e37e:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     136e382:	eb e5                	jmp    136e369 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b38ed>
     136e384:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     136e387:	48 83 c4 08          	add    rsp,0x8
     136e38b:	48 85 ff             	test   rdi,rdi
     136e38e:	74 08                	je     136e398 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b391c>
     136e390:	5b                   	pop    rbx
     136e391:	41 5e                	pop    r14
     136e393:	e9 88 fb 47 00       	jmp    17edf20 <_ZdlPv@plt>
     136e398:	5b                   	pop    rbx

### target 0x108dc54
- 0x108a000 from 0x1089f9e..0x108a477
     1089fe3:	84 c0                	test   al,al
     1089fe5:	74 1e                	je     108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fe7:	e8 04 3b 00 00       	call   108daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254f06>
     1089fec:	eb 17                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fee:	84 c0                	test   al,al
     1089ff0:	74 0e                	je     108a000 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251416>
     1089ff2:	e8 7b fa ff ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     1089ff7:	c6 83 60 05 00 00 00 	mov    BYTE PTR [rbx+0x560],0x0
     1089ffe:	eb 05                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     108a000:	e8 4f 3c 00 00       	call   108dc54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25506a>
     108a005:	4c 39 f3             	cmp    rbx,r14
     108a008:	4c 89 34 24          	mov    QWORD PTR [rsp],r14
     108a00c:	0f 84 e3 00 00 00    	je     108a0f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25150b>
     108a012:	4c 8d bb 68 05 00 00 	lea    r15,[rbx+0x568]
     108a019:	4d 8b ae 68 05 00 00 	mov    r13,QWORD PTR [r14+0x568]
     108a020:	4d 8b a6 70 05 00 00 	mov    r12,QWORD PTR [r14+0x570]
     108a027:	4c 89 e0             	mov    rax,r12
     108a02a:	4c 29 e8             	sub    rax,r13
     108a02d:	bf 50 05 00 00       	mov    edi,0x550
     108a032:	48 99                	cqo

- 0x124a555 from 0x124a504..0x124a8be
     124a532:	4c 8d 7f 10          	lea    r15,[rdi+0x10]
     124a536:	31 c0                	xor    eax,eax
     124a538:	88 47 10             	mov    BYTE PTR [rdi+0x10],al
     124a53b:	88 87 60 05 00 00    	mov    BYTE PTR [rdi+0x560],al
     124a541:	38 86 60 05 00 00    	cmp    BYTE PTR [rsi+0x560],al
     124a547:	4c 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],r15
     124a54c:	74 0c                	je     124a55a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fade>
     124a54e:	48 8d 75 10          	lea    rsi,[rbp+0x10]
     124a552:	4c 89 ff             	mov    rdi,r15
     124a555:	e8 fa 36 e4 ff       	call   108dc54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25506a>
     124a55a:	4d 8d a5 68 05 00 00 	lea    r12,[r13+0x568]
     124a561:	49 83 a5 78 05 00 00 	and    QWORD PTR [r13+0x578],0x0
     124a568:	00 
     124a569:	0f 57 c0             	xorps  xmm0,xmm0
     124a56c:	41 0f 11 85 68 05 00 	movups XMMWORD PTR [r13+0x568],xmm0
     124a573:	00 
     124a574:	48 8b 9d 68 05 00 00 	mov    rbx,QWORD PTR [rbp+0x568]
     124a57b:	4c 8b b5 70 05 00 00 	mov    r14,QWORD PTR [rbp+0x570]
     124a582:	4c 89 64 24 48       	mov    QWORD PTR [rsp+0x48],r12
     124a587:	c6 44 24 50 00       	mov    BYTE PTR [rsp+0x50],0x0

### target 0x1089b98
- 0x1089b1b from 0x1089b04..0x1089b98
     1089afa:	48 89 df             	mov    rdi,rbx
     1089afd:	5b                   	pop    rbx
     1089afe:	e9 8d 43 76 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1089b03:	cc                   	int3
     1089b04:	53                   	push   rbx
     1089b05:	48 89 fb             	mov    rbx,rdi
     1089b08:	48 81 c7 28 02 00 00 	add    rdi,0x228
     1089b0f:	e8 1c d2 a1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1089b14:	48 8d bb 68 01 00 00 	lea    rdi,[rbx+0x168]
     1089b1b:	e8 78 00 00 00       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     1089b20:	48 8d bb 40 01 00 00 	lea    rdi,[rbx+0x140]
     1089b27:	e8 04 d2 a1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1089b2c:	48 8d bb 20 01 00 00 	lea    rdi,[rbx+0x120]
     1089b33:	e8 f8 d1 a1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1089b38:	48 8d bb 00 01 00 00 	lea    rdi,[rbx+0x100]
     1089b3f:	e8 ec d1 a1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1089b44:	48 8d bb e0 00 00 00 	lea    rdi,[rbx+0xe0]
     1089b4b:	e8 e0 d1 a1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1089b50:	48 8d bb c0 00 00 00 	lea    rdi,[rbx+0xc0]
     1089b57:	e8 d4 d1 a1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>

- 0x108ce1b from 0x108ccd4..0x108cec4
     108ce0a:	5b                   	pop    rbx
     108ce0b:	41 5c                	pop    r12
     108ce0d:	41 5d                	pop    r13
     108ce0f:	41 5e                	pop    r14
     108ce11:	41 5f                	pop    r15
     108ce13:	5d                   	pop    rbp
     108ce14:	c3                   	ret
     108ce15:	49 89 c7             	mov    r15,rax
     108ce18:	4c 89 e7             	mov    rdi,r12
     108ce1b:	e8 78 cd ff ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     108ce20:	eb 03                	jmp    108ce25 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25423b>
     108ce22:	49 89 c7             	mov    r15,rax
     108ce25:	4c 89 f7             	mov    rdi,r14
     108ce28:	e8 03 9f a1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     108ce2d:	eb 03                	jmp    108ce32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254248>
     108ce2f:	49 89 c7             	mov    r15,rax
     108ce32:	48 89 ef             	mov    rdi,rbp
     108ce35:	e8 f6 9e a1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     108ce3a:	eb 03                	jmp    108ce3f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254255>
     108ce3c:	49 89 c7             	mov    r15,rax

- 0x10a9df9 from 0x10a9dee..0x10a9e37
     10a9de2:	75 ec                	jne    10a9dd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2711e6>
     10a9de4:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     10a9de8:	5b                   	pop    rbx
     10a9de9:	41 5e                	pop    r14
     10a9deb:	41 5f                	pop    r15
     10a9ded:	c3                   	ret
     10a9dee:	53                   	push   rbx
     10a9def:	48 89 fb             	mov    rbx,rdi
     10a9df2:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
     10a9df9:	e8 9a fd fd ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     10a9dfe:	48 8d bb 88 00 00 00 	lea    rdi,[rbx+0x88]
     10a9e05:	e8 86 40 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a9e0a:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
     10a9e0e:	e8 7d 40 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a9e13:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
     10a9e17:	e8 74 40 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a9e1c:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     10a9e20:	e8 6b 40 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a9e25:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     10a9e29:	e8 62 40 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

- 0x11f763c from 0x11f6c0c..0x11f7f5d
     11f761c:	00 
     11f761d:	e8 7e f7 06 00       	call   1266da0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xac324>
     11f7622:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
     11f7629:	00 
     11f762a:	e8 03 2c 00 00       	call   11fa232 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f7b6>
     11f762f:	f6 c3 04             	test   bl,0x4
     11f7632:	74 0d                	je     11f7641 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cbc5>
     11f7634:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
     11f763b:	00 
     11f763c:	e8 57 25 e9 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     11f7641:	49 8d 47 48          	lea    rax,[r15+0x48]
     11f7645:	49 8b 4f 48          	mov    rcx,QWORD PTR [r15+0x48]
     11f7649:	48 89 cb             	mov    rbx,rcx
     11f764c:	48 83 c3 07          	add    rbx,0x7
     11f7650:	f6 c1 01             	test   cl,0x1
     11f7653:	48 0f 44 d8          	cmove  rbx,rax
     11f7657:	4d 63 77 50          	movsxd r14,DWORD PTR [r15+0x50]
     11f765b:	4d 85 f6             	test   r14,r14
     11f765e:	74 21                	je     11f7681 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cc05>
     11f7660:	49 c1 e6 03          	shl    r14,0x3

- 0x11f843c from 0x11f841c..0x11f8453
     11f8419:	41 5f                	pop    r15
     11f841b:	c3                   	ret
     11f841c:	53                   	push   rbx
     11f841d:	48 89 fb             	mov    rbx,rdi
     11f8420:	48 81 c7 10 01 00 00 	add    rdi,0x110
     11f8427:	e8 04 e9 8a ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     11f842c:	48 8d bb f8 00 00 00 	lea    rdi,[rbx+0xf8]
     11f8433:	e8 58 5a 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11f8438:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     11f843c:	e8 57 17 e9 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     11f8441:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     11f8445:	e8 46 5a 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11f844a:	48 89 df             	mov    rdi,rbx
     11f844d:	5b                   	pop    rbx
     11f844e:	e9 3d 5a 5f 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11f8453:	cc                   	int3
     11f8454:	53                   	push   rbx
     11f8455:	48 89 fb             	mov    rbx,rdi
     11f8458:	48 81 c7 48 0d 00 00 	add    rdi,0xd48
     11f845f:	e8 cc e8 8a ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>

- 0x11f8fe6 from 0x11f8fae..0x11f8ffd
     11f8fb2:	48 81 c7 60 02 00 00 	add    rdi,0x260
     11f8fb9:	e8 72 dd 8a ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     11f8fbe:	48 8d bb 48 02 00 00 	lea    rdi,[rbx+0x248]
     11f8fc5:	e8 c6 4e 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11f8fca:	48 8d bb a0 01 00 00 	lea    rdi,[rbx+0x1a0]
     11f8fd1:	e8 6e fb ff ff       	call   11f8b44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e0c8>
     11f8fd6:	48 8d bb f0 00 00 00 	lea    rdi,[rbx+0xf0]
     11f8fdd:	e8 1c 00 00 00       	call   11f8ffe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e582>
     11f8fe2:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     11f8fe6:	e8 ad 0b e9 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     11f8feb:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     11f8fef:	e8 9c 4e 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11f8ff4:	48 89 df             	mov    rdi,rbx
     11f8ff7:	5b                   	pop    rbx
     11f8ff8:	e9 93 4e 5f 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11f8ffd:	cc                   	int3
     11f8ffe:	80 bf 80 00 00 00 00 	cmp    BYTE PTR [rdi+0x80],0x0
     11f9005:	0f 85 53 f9 8c ff    	jne    ac895e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x158fe>
     11f900b:	c3                   	ret
     11f900c:	53                   	push   rbx

- 0x1200b9a from 0x1200978..0x1200bfb
     1200b79:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     1200b7e:	e8 63 32 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     1200b83:	eb 56                	jmp    1200bdb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4615f>
     1200b85:	49 89 c6             	mov    r14,rax
     1200b88:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     1200b8d:	e8 8a 78 ff ff       	call   11f841c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d9a0>
     1200b92:	eb 47                	jmp    1200bdb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4615f>
     1200b94:	49 89 c6             	mov    r14,rax
     1200b97:	48 89 ef             	mov    rdi,rbp
     1200b9a:	e8 f9 8f e8 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     1200b9f:	eb 03                	jmp    1200ba4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x46128>
     1200ba1:	49 89 c6             	mov    r14,rax
     1200ba4:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     1200ba9:	e8 e2 d2 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1200bae:	eb 03                	jmp    1200bb3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x46137>
     1200bb0:	49 89 c6             	mov    r14,rax
     1200bb3:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1200bb8:	e8 d3 d2 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1200bbd:	eb 03                	jmp    1200bc2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x46146>
     1200bbf:	49 89 c6             	mov    r14,rax

- 0x1203f2d from 0x120290a..0x1203fe5
     1203f0e:	48 8d bc 24 48 04 00 	lea    rdi,[rsp+0x448]
     1203f15:	00 
     1203f16:	e8 75 9f 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1203f1b:	eb 15                	jmp    1203f32 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x494b6>
     1203f1d:	48 89 c3             	mov    rbx,rax
     1203f20:	eb ec                	jmp    1203f0e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49492>
     1203f22:	48 89 c3             	mov    rbx,rax
     1203f25:	48 8d bc 24 48 04 00 	lea    rdi,[rsp+0x448]
     1203f2c:	00 
     1203f2d:	e8 66 5c e8 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     1203f32:	48 8d bc 24 30 04 00 	lea    rdi,[rsp+0x430]
     1203f39:	00 
     1203f3a:	e8 51 9f 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1203f3f:	48 8d bc 24 18 04 00 	lea    rdi,[rsp+0x418]
     1203f46:	00 
     1203f47:	e8 44 9f 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1203f4c:	48 8d bc 24 00 04 00 	lea    rdi,[rsp+0x400]
     1203f53:	00 
     1203f54:	e8 37 9f 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1203f59:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]

- 0x12051f8 from 0x1204ede..0x1205269
     12051df:	eb 47                	jmp    1205228 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a7ac>
     12051e1:	49 89 c6             	mov    r14,rax
     12051e4:	b3 01                	mov    bl,0x1
     12051e6:	eb 32                	jmp    120521a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a79e>
     12051e8:	49 89 c6             	mov    r14,rax
     12051eb:	eb 10                	jmp    12051fd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a781>
     12051ed:	49 89 c6             	mov    r14,rax
     12051f0:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
     12051f7:	00 
     12051f8:	e8 9b 49 e8 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     12051fd:	b3 01                	mov    bl,0x1
     12051ff:	eb 0f                	jmp    1205210 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a794>
     1205201:	49 89 c6             	mov    r14,rax
     1205204:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     1205209:	e8 0e 32 ff ff       	call   11f841c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d9a0>
     120520e:	31 db                	xor    ebx,ebx
     1205210:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     1205215:	e8 76 8c 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     120521a:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     120521f:	e8 6c 8c 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

- 0x1205d5b from 0x1205cca..0x1205d82
     1205d43:	41 5e                	pop    r14
     1205d45:	41 5f                	pop    r15
     1205d47:	c3                   	ret
     1205d48:	49 89 c7             	mov    r15,rax
     1205d4b:	4c 89 ef             	mov    rdi,r13
     1205d4e:	e8 3d 81 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1205d53:	eb 03                	jmp    1205d58 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b2dc>
     1205d55:	49 89 c7             	mov    r15,rax
     1205d58:	4c 89 e7             	mov    rdi,r12
     1205d5b:	e8 38 3e e8 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     1205d60:	eb 03                	jmp    1205d65 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b2e9>
     1205d62:	49 89 c7             	mov    r15,rax
     1205d65:	4c 89 f7             	mov    rdi,r14
     1205d68:	e8 23 81 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1205d6d:	eb 03                	jmp    1205d72 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b2f6>
     1205d6f:	49 89 c7             	mov    r15,rax
     1205d72:	48 89 df             	mov    rdi,rbx
     1205d75:	e8 16 81 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1205d7a:	4c 89 ff             	mov    rdi,r15
     1205d7d:	e8 4e 9f 86 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>

- 0x12073a1 from 0x12070be..0x12074b3
     120738f:	5b                   	pop    rbx
     1207390:	41 5c                	pop    r12
     1207392:	41 5d                	pop    r13
     1207394:	41 5e                	pop    r14
     1207396:	41 5f                	pop    r15
     1207398:	5d                   	pop    rbp
     1207399:	c3                   	ret
     120739a:	48 89 c5             	mov    rbp,rax
     120739d:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     12073a1:	e8 f2 27 e8 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     12073a6:	e9 84 00 00 00       	jmp    120742f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4c9b3>
     12073ab:	48 89 c5             	mov    rbp,rax
     12073ae:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     12073b3:	e8 d8 6a 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12073b8:	eb 03                	jmp    12073bd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4c941>
     12073ba:	48 89 c5             	mov    rbp,rax
     12073bd:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     12073c2:	e8 c9 6a 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12073c7:	eb 03                	jmp    12073cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4c950>
     12073c9:	48 89 c5             	mov    rbp,rax

- 0x1218df4 from 0x1218c94..0x1218e1c
     1218dd7:	eb 03                	jmp    1218ddc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e360>
     1218dd9:	49 89 c4             	mov    r12,rax
     1218ddc:	48 89 ef             	mov    rdi,rbp
     1218ddf:	e8 60 fd fd ff       	call   11f8b44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e0c8>
     1218de4:	eb 03                	jmp    1218de9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e36d>
     1218de6:	49 89 c4             	mov    r12,rax
     1218de9:	4c 89 ef             	mov    rdi,r13
     1218dec:	e8 0d 02 fe ff       	call   11f8ffe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e582>
     1218df1:	4c 89 ff             	mov    rdi,r15
     1218df4:	e8 9f 0d e7 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     1218df9:	eb 03                	jmp    1218dfe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e382>
     1218dfb:	49 89 c4             	mov    r12,rax
     1218dfe:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     1218e02:	e8 89 50 5d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1218e07:	48 89 df             	mov    rdi,rbx
     1218e0a:	e8 81 50 5d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1218e0f:	4c 89 e7             	mov    rdi,r12
     1218e12:	e8 b9 6e 85 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1218e17:	49 89 c4             	mov    r12,rax
     1218e1a:	eb eb                	jmp    1218e07 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e38b>

- 0x12248e6 from 0x12248de..0x12248f4
     12248d1:	4d 85 f6             	test   r14,r14
     12248d4:	75 e4                	jne    12248ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69e3e>
     12248d6:	48 83 c4 08          	add    rsp,0x8
     12248da:	5b                   	pop    rbx
     12248db:	41 5e                	pop    r14
     12248dd:	c3                   	ret
     12248de:	53                   	push   rbx
     12248df:	48 89 fb             	mov    rbx,rdi
     12248e2:	48 83 c7 18          	add    rdi,0x18
     12248e6:	e8 ad 52 e6 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     12248eb:	48 89 df             	mov    rdi,rbx
     12248ee:	5b                   	pop    rbx
     12248ef:	e9 9c 95 5c 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12248f4:	41 56                	push   r14
     12248f6:	53                   	push   rbx
     12248f7:	50                   	push   rax
     12248f8:	48 89 f3             	mov    rbx,rsi
     12248fb:	49 89 fe             	mov    r14,rdi
     12248fe:	48 83 7f 18 00       	cmp    QWORD PTR [rdi+0x18],0x0
     1224903:	74 2e                	je     1224933 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69eb7>

- 0x122899f from 0x12286bc..0x12291d6
     1228974:	48 8b 91 90 05 00 00 	mov    rdx,QWORD PTR [rcx+0x590]
     122897b:	89 04 24             	mov    DWORD PTR [rsp],eax
     122897e:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     1228983:	48 8d 0d 8e 2e 1b ff 	lea    rcx,[rip+0xffffffffff1b2e8e]        # 3db818 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x1267>
     122898a:	4c 8d 84 24 30 03 00 	lea    r8,[rsp+0x330]
     1228991:	00 
     1228992:	49 89 d9             	mov    r9,rbx
     1228995:	e8 53 09 00 00       	call   12292ed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e871>
     122899a:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     122899f:	e8 f4 11 e6 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     12289a4:	4f 8d 0c 3e          	lea    r9,[r14+r15*1]
     12289a8:	49 83 c1 30          	add    r9,0x30
     12289ac:	4f 8d 24 3e          	lea    r12,[r14+r15*1]
     12289b0:	49 81 c4 ae 02 00 00 	add    r12,0x2ae
     12289b7:	31 c0                	xor    eax,eax
     12289b9:	41 80 7c 24 15 01    	cmp    BYTE PTR [r12+0x15],0x1
     12289bf:	4b 8d 4c 3e 18       	lea    rcx,[r14+r15*1+0x18]
     12289c4:	0f 94 c0             	sete   al
     12289c7:	49 8b b4 24 f2 fe ff 	mov    rsi,QWORD PTR [r12-0x10e]
     12289ce:	ff 

- 0x1228ee6 from 0x12286bc..0x12291d6
     1228ebb:	48 8b 91 c8 05 00 00 	mov    rdx,QWORD PTR [rcx+0x5c8]
     1228ec2:	89 04 24             	mov    DWORD PTR [rsp],eax
     1228ec5:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     1228eca:	48 8d 0d 5f 29 1b ff 	lea    rcx,[rip+0xffffffffff1b295f]        # 3db830 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x127f>
     1228ed1:	4c 8d 44 24 40       	lea    r8,[rsp+0x40]
     1228ed6:	49 89 d9             	mov    r9,rbx
     1228ed9:	e8 0f 04 00 00       	call   12292ed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e871>
     1228ede:	48 8d bc 24 30 03 00 	lea    rdi,[rsp+0x330]
     1228ee5:	00 
     1228ee6:	e8 ad 0c e6 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     1228eeb:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     1228ef0:	48 8b 74 24 30       	mov    rsi,QWORD PTR [rsp+0x30]
     1228ef5:	e8 a6 f6 32 00       	call   15585a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39db24>
     1228efa:	48 89 c3             	mov    rbx,rax
     1228efd:	48 89 c7             	mov    rdi,rax
     1228f00:	48 8b 74 24 38       	mov    rsi,QWORD PTR [rsp+0x38]
     1228f05:	e8 38 47 e6 ff       	call   108d642 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254a58>
     1228f0a:	43 8a 84 3e c7 02 00 	mov    al,BYTE PTR [r14+r15*1+0x2c7]
     1228f11:	00 
     1228f12:	88 83 d0 00 00 00    	mov    BYTE PTR [rbx+0xd0],al

- 0x122904f from 0x12286bc..0x12291d6
     1229023:	49 8b b5 88 05 00 00 	mov    rsi,QWORD PTR [r13+0x588]
     122902a:	49 8b 95 90 05 00 00 	mov    rdx,QWORD PTR [r13+0x590]
     1229031:	83 24 24 00          	and    DWORD PTR [rsp],0x0
     1229035:	48 8d 0d dc 27 1b ff 	lea    rcx,[rip+0xffffffffff1b27dc]        # 3db818 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x1267>
     122903c:	4c 89 e7             	mov    rdi,r12
     122903f:	49 89 d8             	mov    r8,rbx
     1229042:	4d 89 f9             	mov    r9,r15
     1229045:	e8 a3 02 00 00       	call   12292ed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e871>
     122904a:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     122904f:	e8 44 0b e6 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     1229054:	0f 28 84 24 00 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x300]
     122905b:	00 
     122905c:	48 8d 9c 24 30 03 00 	lea    rbx,[rsp+0x330]
     1229063:	00 
     1229064:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
     1229067:	c6 43 10 01          	mov    BYTE PTR [rbx+0x10],0x1
     122906b:	4c 8d 7c 24 60       	lea    r15,[rsp+0x60]
     1229070:	ba c0 00 00 00       	mov    edx,0xc0
     1229075:	4c 89 ff             	mov    rdi,r15
     1229078:	31 f6                	xor    esi,esi

- 0x12290ab from 0x12286bc..0x12291d6
     122907f:	49 8b b5 c0 05 00 00 	mov    rsi,QWORD PTR [r13+0x5c0]
     1229086:	49 8b 95 c8 05 00 00 	mov    rdx,QWORD PTR [r13+0x5c8]
     122908d:	83 24 24 00          	and    DWORD PTR [rsp],0x0
     1229091:	48 8d 0d 98 27 1b ff 	lea    rcx,[rip+0xffffffffff1b2798]        # 3db830 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x127f>
     1229098:	4c 89 e7             	mov    rdi,r12
     122909b:	49 89 d8             	mov    r8,rbx
     122909e:	4d 89 f9             	mov    r9,r15
     12290a1:	e8 47 02 00 00       	call   12292ed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e871>
     12290a6:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     12290ab:	e8 e8 0a e6 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     12290b0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12290b7:	00 00 
     12290b9:	48 3b 84 24 c0 05 00 	cmp    rax,QWORD PTR [rsp+0x5c0]
     12290c0:	00 
     12290c1:	75 15                	jne    12290d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e65c>
     12290c3:	4c 89 e0             	mov    rax,r12
     12290c6:	48 81 c4 c8 05 00 00 	add    rsp,0x5c8
     12290cd:	5b                   	pop    rbx
     12290ce:	41 5c                	pop    r12
     12290d0:	41 5d                	pop    r13

- 0x1229123 from 0x12286bc..0x12291d6
     1229101:	48 89 c3             	mov    rbx,rax
     1229104:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     1229109:	e8 82 4d 5c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     122910e:	e9 bb 00 00 00       	jmp    12291ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e752>
     1229113:	e9 b3 00 00 00       	jmp    12291cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e74f>
     1229118:	48 89 c3             	mov    rbx,rax
     122911b:	eb 0b                	jmp    1229128 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e6ac>
     122911d:	48 89 c3             	mov    rbx,rax
     1229120:	4c 89 ef             	mov    rdi,r13
     1229123:	e8 70 0a e6 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     1229128:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     122912f:	00 
     1229130:	e8 fb db 87 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1229135:	48 8d bc 24 50 04 00 	lea    rdi,[rsp+0x450]
     122913c:	00 
     122913d:	e8 ee db 87 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1229142:	48 8d bc 24 30 04 00 	lea    rdi,[rsp+0x430]
     1229149:	00 
     122914a:	e8 e1 db 87 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     122914f:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]

- 0x122979b from 0x12292ed..0x1229863
     1229776:	48 89 c3             	mov    rbx,rax
     1229779:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     122977e:	e8 49 50 87 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1229783:	e9 bb 00 00 00       	jmp    1229843 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6edc7>
     1229788:	48 89 c3             	mov    rbx,rax
     122978b:	e9 a6 00 00 00       	jmp    1229836 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6edba>
     1229790:	48 89 c3             	mov    rbx,rax
     1229793:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
     122979a:	00 
     122979b:	e8 f8 03 e6 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     12297a0:	48 8d bc 24 98 01 00 	lea    rdi,[rsp+0x198]
     12297a7:	00 
     12297a8:	e8 83 d5 87 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     12297ad:	48 8d bc 24 78 01 00 	lea    rdi,[rsp+0x178]
     12297b4:	00 
     12297b5:	e8 76 d5 87 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     12297ba:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
     12297c1:	00 
     12297c2:	e8 69 d5 87 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     12297c7:	48 8d bc 24 38 01 00 	lea    rdi,[rsp+0x138]

- 0x12465f5 from 0x12465e8..0x1246603
     12465dc:	eb 05                	jmp    12465e3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8bb67>
     12465de:	e8 bb ff ff ff       	call   124659e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8bb22>
     12465e3:	48 89 d8             	mov    rax,rbx
     12465e6:	5b                   	pop    rbx
     12465e7:	c3                   	ret
     12465e8:	80 bf c0 00 00 00 00 	cmp    BYTE PTR [rdi+0xc0],0x0
     12465ef:	74 11                	je     1246602 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8bb86>
     12465f1:	53                   	push   rbx
     12465f2:	48 89 fb             	mov    rbx,rdi
     12465f5:	e8 9e 35 e4 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     12465fa:	c6 83 c0 00 00 00 00 	mov    BYTE PTR [rbx+0xc0],0x0
     1246601:	5b                   	pop    rbx
     1246602:	c3                   	ret
     1246603:	cc                   	int3
     1246604:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1246607:	48 8b 57 08          	mov    rdx,QWORD PTR [rdi+0x8]
     124660b:	48 8b 4e 08          	mov    rcx,QWORD PTR [rsi+0x8]
     124660f:	48 39 c2             	cmp    rdx,rax
     1246612:	74 41                	je     1246655 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8bbd9>
     1246614:	0f 57 c0             	xorps  xmm0,xmm0

- 0x1281e9a from 0x1281b20..0x1281f55
     1281e77:	4d 89 e8             	mov    r8,r13
     1281e7a:	45 31 c9             	xor    r9d,r9d
     1281e7d:	e8 2a 03 00 00       	call   12821ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc7730>
     1281e82:	48 89 ef             	mov    rdi,rbp
     1281e85:	e8 ba 6c f7 ff       	call   11f8b44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e0c8>
     1281e8a:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
     1281e91:	00 
     1281e92:	e8 67 71 f7 ff       	call   11f8ffe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e582>
     1281e97:	4c 89 ef             	mov    rdi,r13
     1281e9a:	e8 f9 7c e0 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     1281e9f:	4c 89 ff             	mov    rdi,r15
     1281ea2:	e8 e9 bf 56 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1281ea7:	48 89 df             	mov    rdi,rbx
     1281eaa:	e8 e1 bf 56 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1281eaf:	41 c6 84 24 c4 02 00 	mov    BYTE PTR [r12+0x2c4],0x1
     1281eb6:	00 01 
     1281eb8:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
     1281ebf:	00 
     1281ec0:	4c 89 e6             	mov    rsi,r12
     1281ec3:	e8 0a 02 00 00       	call   12820d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc7656>

- 0x1282835 from 0x128257c..0x1282ac1
     1282812:	49 89 e8             	mov    r8,rbp
     1282815:	45 31 c9             	xor    r9d,r9d
     1282818:	e8 8f f9 ff ff       	call   12821ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc7730>
     128281d:	4c 89 ff             	mov    rdi,r15
     1282820:	e8 1f 63 f7 ff       	call   11f8b44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e0c8>
     1282825:	48 8d bc 24 18 05 00 	lea    rdi,[rsp+0x518]
     128282c:	00 
     128282d:	e8 cc 67 f7 ff       	call   11f8ffe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e582>
     1282832:	48 89 ef             	mov    rdi,rbp
     1282835:	e8 5e 73 e0 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     128283a:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
     1282841:	00 
     1282842:	e8 49 b6 56 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1282847:	48 8d bc 24 58 02 00 	lea    rdi,[rsp+0x258]
     128284e:	00 
     128284f:	e8 3c b6 56 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1282854:	49 8d b5 c0 04 00 00 	lea    rsi,[r13+0x4c0]
     128285b:	48 8d bc 24 68 01 00 	lea    rdi,[rsp+0x168]
     1282862:	00 
     1282863:	e8 d8 b6 56 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>

- 0x12829f3 from 0x128257c..0x1282ac1
     12829d0:	49 89 e8             	mov    r8,rbp
     12829d3:	45 31 c9             	xor    r9d,r9d
     12829d6:	e8 d1 f7 ff ff       	call   12821ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc7730>
     12829db:	4c 89 ff             	mov    rdi,r15
     12829de:	e8 61 61 f7 ff       	call   11f8b44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e0c8>
     12829e3:	48 8d bc 24 20 04 00 	lea    rdi,[rsp+0x420]
     12829ea:	00 
     12829eb:	e8 0e 66 f7 ff       	call   11f8ffe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e582>
     12829f0:	48 89 ef             	mov    rdi,rbp
     12829f3:	e8 a0 71 e0 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     12829f8:	4c 89 ef             	mov    rdi,r13
     12829fb:	e8 90 b4 56 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1282a00:	48 8d bc 24 68 01 00 	lea    rdi,[rsp+0x168]
     1282a07:	00 
     1282a08:	e8 83 b4 56 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1282a0d:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
     1282a14:	00 
     1282a15:	4c 89 e6             	mov    rsi,r12
     1282a18:	48 8d 94 24 a0 05 00 	lea    rdx,[rsp+0x5a0]
     1282a1f:	00 

- 0x1282a72 from 0x128257c..0x1282ac1
     1282a4f:	00 
     1282a50:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
     1282a57:	00 
     1282a58:	e8 51 65 f7 ff       	call   11f8fae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e532>
     1282a5d:	48 8d bc 24 70 08 00 	lea    rdi,[rsp+0x870]
     1282a64:	00 
     1282a65:	e8 44 65 f7 ff       	call   11f8fae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e532>
     1282a6a:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
     1282a71:	00 
     1282a72:	e8 21 71 e0 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     1282a77:	eb 13                	jmp    1282a8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc8010>
     1282a79:	48 89 df             	mov    rdi,rbx
     1282a7c:	4c 89 f6             	mov    rsi,r14
     1282a7f:	e8 d2 f4 ff ff       	call   1281f56 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc74da>
     1282a84:	66 83 a3 a8 06 00 00 	and    WORD PTR [rbx+0x6a8],0x0
     1282a8b:	00 
     1282a8c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1282a93:	00 00 
     1282a95:	48 3b 84 24 40 0b 00 	cmp    rax,QWORD PTR [rsp+0xb40]
     1282a9c:	00 

- 0x1283293 from 0x12830a6..0x12833f4
     1283273:	31 c9                	xor    ecx,ecx
     1283275:	49 89 d8             	mov    r8,rbx
     1283278:	45 31 c9             	xor    r9d,r9d
     128327b:	e8 2c ef ff ff       	call   12821ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc7730>
     1283280:	4c 89 ef             	mov    rdi,r13
     1283283:	e8 bc 58 f7 ff       	call   11f8b44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e0c8>
     1283288:	4c 89 e7             	mov    rdi,r12
     128328b:	e8 6e 5d f7 ff       	call   11f8ffe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e582>
     1283290:	48 89 df             	mov    rdi,rbx
     1283293:	e8 00 69 e0 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     1283298:	4c 89 ff             	mov    rdi,r15
     128329b:	e8 f0 ab 56 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12832a0:	48 89 ef             	mov    rdi,rbp
     12832a3:	e8 e8 ab 56 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12832a8:	0f b6 84 24 c0 02 00 	movzx  eax,BYTE PTR [rsp+0x2c0]
     12832af:	00 
     12832b0:	a8 01                	test   al,0x1
     12832b2:	74 0a                	je     12832be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc8842>
     12832b4:	48 8b 84 24 c8 02 00 	mov    rax,QWORD PTR [rsp+0x2c8]
     12832bb:	00 

- 0x1284cb8 from 0x12845b2..0x1286318
     1284c94:	48 89 de             	mov    rsi,rbx
     1284c97:	e8 ee d6 ff ff       	call   128238a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc790e>
     1284c9c:	4d 8b 7e 08          	mov    r15,QWORD PTR [r14+0x8]
     1284ca0:	48 89 df             	mov    rdi,rbx
     1284ca3:	e8 76 d7 ff ff       	call   128241e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc79a2>
     1284ca8:	4c 89 bc 24 08 01 00 	mov    QWORD PTR [rsp+0x108],r15
     1284caf:	00 
     1284cb0:	48 8d bc 24 80 08 00 	lea    rdi,[rsp+0x880]
     1284cb7:	00 
     1284cb8:	e8 db 4e e0 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     1284cbd:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
     1284cc4:	00 
     1284cc5:	48 83 c7 90          	add    rdi,0xffffffffffffff90
     1284cc9:	b0 01                	mov    al,0x1
     1284ccb:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax
     1284ccf:	48 8d b4 24 50 0f 00 	lea    rsi,[rsp+0xf50]
     1284cd6:	00 
     1284cd7:	e8 7e 07 85 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
     1284cdc:	48 8d bc 24 50 0f 00 	lea    rdi,[rsp+0xf50]
     1284ce3:	00 

- 0x12858d4 from 0x12845b2..0x1286318
     12858b2:	00 
     12858b3:	49 89 47 f8          	mov    QWORD PTR [r15-0x8],rax
     12858b7:	48 8d 9c 24 50 0f 00 	lea    rbx,[rsp+0xf50]
     12858be:	00 
     12858bf:	4c 89 ff             	mov    rdi,r15
     12858c2:	48 89 de             	mov    rsi,rbx
     12858c5:	e8 5e 8b e0 ff       	call   108e428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25583e>
     12858ca:	41 88 af c0 00 00 00 	mov    BYTE PTR [r15+0xc0],bpl
     12858d1:	48 89 df             	mov    rdi,rbx
     12858d4:	e8 bf 42 e0 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     12858d9:	66 41 83 a6 80 00 00 	and    WORD PTR [r14+0x80],0x0
     12858e0:	00 00 
     12858e2:	49 83 66 78 00       	and    QWORD PTR [r14+0x78],0x0
     12858e7:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12858ec:	80 b8 28 01 00 00 00 	cmp    BYTE PTR [rax+0x128],0x0
     12858f3:	40 0f 94 c5          	sete   bpl
     12858f7:	48 83 78 18 00       	cmp    QWORD PTR [rax+0x18],0x0
     12858fc:	0f 94 c3             	sete   bl
     12858ff:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     1285904:	48 8b 07             	mov    rax,QWORD PTR [rdi]

- 0x1285fce from 0x12845b2..0x1286318
     1285faa:	00 00 
     1285fac:	4c 8b 64 24 40       	mov    r12,QWORD PTR [rsp+0x40]
     1285fb1:	4c 8b 6c 24 50       	mov    r13,QWORD PTR [rsp+0x50]
     1285fb6:	48 8d bc 24 30 10 00 	lea    rdi,[rsp+0x1030]
     1285fbd:	00 
     1285fbe:	48 8d 9c 24 28 11 00 	lea    rbx,[rsp+0x1128]
     1285fc5:	00 
     1285fc6:	4c 8d b4 24 50 11 00 	lea    r14,[rsp+0x1150]
     1285fcd:	00 
     1285fce:	e8 c5 3b e0 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     1285fd3:	41 80 7e 48 00       	cmp    BYTE PTR [r14+0x48],0x0
     1285fd8:	74 0d                	je     1285fe7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcb56b>
     1285fda:	48 8d bc 24 78 11 00 	lea    rdi,[rsp+0x1178]
     1285fe1:	00 
     1285fe2:	e8 a9 7e 56 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1285fe7:	4c 89 f7             	mov    rdi,r14
     1285fea:	e8 ef 7f 8f ff       	call   b7dfde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcaf7e>
     1285fef:	48 89 df             	mov    rdi,rbx
     1285ff2:	e8 e7 7f 8f ff       	call   b7dfde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcaf7e>
     1285ff7:	48 8d bc 24 a0 11 00 	lea    rdi,[rsp+0x11a0]

- 0x128605a from 0x12845b2..0x1286318
     1286033:	e8 a6 7f 8f ff       	call   b7dfde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcaf7e>
     1286038:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
     128603f:	00 
     1286040:	e8 59 2a f7 ff       	call   11f8a9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e022>
     1286045:	48 8d bc 24 e0 12 00 	lea    rdi,[rsp+0x12e0]
     128604c:	00 
     128604d:	e8 14 c6 85 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
     1286052:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
     1286059:	00 
     128605a:	e8 39 3b e0 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     128605f:	48 8d bc 24 10 13 00 	lea    rdi,[rsp+0x1310]
     1286066:	00 
     1286067:	e8 72 7f 8f ff       	call   b7dfde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcaf7e>
     128606c:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     1286073:	00 
     1286074:	e8 0b 2a f7 ff       	call   11f8a84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e008>
     1286079:	31 c0                	xor    eax,eax
     128607b:	48 8b 9c 24 88 00 00 	mov    rbx,QWORD PTR [rsp+0x88]
     1286082:	00 
     1286083:	88 03                	mov    BYTE PTR [rbx],al

- 0x1286b15 from 0x1286958..0x1286b82
     1286af6:	00 
     1286af7:	49 89 e8             	mov    r8,rbp
     1286afa:	45 31 c9             	xor    r9d,r9d
     1286afd:	e8 aa b6 ff ff       	call   12821ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc7730>
     1286b02:	4c 89 e7             	mov    rdi,r12
     1286b05:	e8 3a 20 f7 ff       	call   11f8b44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e0c8>
     1286b0a:	4c 89 ff             	mov    rdi,r15
     1286b0d:	e8 ec 24 f7 ff       	call   11f8ffe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e582>
     1286b12:	48 89 ef             	mov    rdi,rbp
     1286b15:	e8 7e 30 e0 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     1286b1a:	4c 89 f7             	mov    rdi,r14
     1286b1d:	e8 6e 73 56 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1286b22:	4c 89 ef             	mov    rdi,r13
     1286b25:	e8 66 73 56 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1286b2a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1286b31:	00 00 
     1286b33:	48 3b 84 24 e0 02 00 	cmp    rax,QWORD PTR [rsp+0x2e0]
     1286b3a:	00 
     1286b3b:	75 40                	jne    1286b7d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc101>
     1286b3d:	48 89 d8             	mov    rax,rbx

- 0x12874d9 from 0x1287326..0x128754f
     12874b3:	4d 8b 6e 08          	mov    r13,QWORD PTR [r14+0x8]
     12874b7:	48 89 df             	mov    rdi,rbx
     12874ba:	e8 5f af ff ff       	call   128241e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc79a2>
     12874bf:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     12874c4:	4d 89 6e 08          	mov    QWORD PTR [r14+0x8],r13
     12874c8:	49 83 c5 90          	add    r13,0xffffffffffffff90
     12874cc:	4c 89 ef             	mov    rdi,r13
     12874cf:	e8 86 df 84 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
     12874d4:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     12874d9:	e8 ba 26 e0 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     12874de:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12874e5:	00 00 
     12874e7:	48 3b 84 24 00 01 00 	cmp    rax,QWORD PTR [rsp+0x100]
     12874ee:	00 
     12874ef:	75 59                	jne    128754a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xccace>
     12874f1:	48 81 c4 08 01 00 00 	add    rsp,0x108
     12874f8:	5b                   	pop    rbx
     12874f9:	41 5c                	pop    r12
     12874fb:	41 5d                	pop    r13
     12874fd:	41 5e                	pop    r14

- 0x128752a from 0x1287326..0x128754f
     128750e:	e8 0b af ff ff       	call   128241e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc79a2>
     1287513:	eb 10                	jmp    1287525 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xccaa9>
     1287515:	48 89 c3             	mov    rbx,rax
     1287518:	4d 89 6e 08          	mov    QWORD PTR [r14+0x8],r13
     128751c:	eb 07                	jmp    1287525 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xccaa9>
     128751e:	eb 02                	jmp    1287522 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xccaa6>
     1287520:	eb 00                	jmp    1287522 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xccaa6>
     1287522:	48 89 c3             	mov    rbx,rax
     1287525:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     128752a:	e8 69 26 e0 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     128752f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1287536:	00 00 
     1287538:	48 3b 84 24 00 01 00 	cmp    rax,QWORD PTR [rsp+0x100]
     128753f:	00 
     1287540:	75 08                	jne    128754a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xccace>
     1287542:	48 89 df             	mov    rdi,rbx
     1287545:	e8 86 87 7e ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     128754a:	e8 61 85 56 00       	call   17efab0 <__stack_chk_fail@plt>
     128754f:	55                   	push   rbp
     1287550:	41 57                	push   r15

- 0x128770c from 0x128754f..0x1287779
     12876ed:	00 
     12876ee:	49 89 e8             	mov    r8,rbp
     12876f1:	45 31 c9             	xor    r9d,r9d
     12876f4:	e8 b3 aa ff ff       	call   12821ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc7730>
     12876f9:	4c 89 e7             	mov    rdi,r12
     12876fc:	e8 43 14 f7 ff       	call   11f8b44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e0c8>
     1287701:	4c 89 ff             	mov    rdi,r15
     1287704:	e8 f5 18 f7 ff       	call   11f8ffe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e582>
     1287709:	48 89 ef             	mov    rdi,rbp
     128770c:	e8 87 24 e0 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     1287711:	4c 89 f7             	mov    rdi,r14
     1287714:	e8 77 67 56 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1287719:	4c 89 ef             	mov    rdi,r13
     128771c:	e8 6f 67 56 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1287721:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1287728:	00 00 
     128772a:	48 3b 84 24 e0 02 00 	cmp    rax,QWORD PTR [rsp+0x2e0]
     1287731:	00 
     1287732:	75 40                	jne    1287774 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcccf8>
     1287734:	48 89 d8             	mov    rax,rbx

- 0x1287a2a from 0x1287867..0x1287aa9
     1287a05:	8b 8c 24 84 00 00 00 	mov    ecx,DWORD PTR [rsp+0x84]
     1287a0c:	49 89 d8             	mov    r8,rbx
     1287a0f:	45 31 c9             	xor    r9d,r9d
     1287a12:	e8 95 a7 ff ff       	call   12821ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc7730>
     1287a17:	4c 89 ff             	mov    rdi,r15
     1287a1a:	e8 25 11 f7 ff       	call   11f8b44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e0c8>
     1287a1f:	4c 89 f7             	mov    rdi,r14
     1287a22:	e8 d7 15 f7 ff       	call   11f8ffe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e582>
     1287a27:	48 89 df             	mov    rdi,rbx
     1287a2a:	e8 69 21 e0 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     1287a2f:	4c 89 ef             	mov    rdi,r13
     1287a32:	e8 59 64 56 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1287a37:	4c 89 e7             	mov    rdi,r12
     1287a3a:	e8 51 64 56 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1287a3f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1287a46:	00 00 
     1287a48:	48 3b 84 24 e0 02 00 	cmp    rax,QWORD PTR [rsp+0x2e0]
     1287a4f:	00 
     1287a50:	75 52                	jne    1287aa4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcd028>
     1287a52:	48 89 e8             	mov    rax,rbp

- 0x1288d25 from 0x1288b3e..0x1288ddc
     1288d00:	8b 8c 24 8c 00 00 00 	mov    ecx,DWORD PTR [rsp+0x8c]
     1288d07:	49 89 d8             	mov    r8,rbx
     1288d0a:	45 31 c9             	xor    r9d,r9d
     1288d0d:	e8 9a 94 ff ff       	call   12821ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc7730>
     1288d12:	4c 89 ff             	mov    rdi,r15
     1288d15:	e8 2a fe f6 ff       	call   11f8b44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e0c8>
     1288d1a:	4c 89 f7             	mov    rdi,r14
     1288d1d:	e8 dc 02 f7 ff       	call   11f8ffe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e582>
     1288d22:	48 89 df             	mov    rdi,rbx
     1288d25:	e8 6e 0e e0 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     1288d2a:	48 89 ef             	mov    rdi,rbp
     1288d2d:	e8 5e 51 56 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1288d32:	4c 89 ef             	mov    rdi,r13
     1288d35:	e8 56 51 56 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1288d3a:	41 c6 84 24 c5 02 00 	mov    BYTE PTR [r12+0x2c5],0x1
     1288d41:	00 01 
     1288d43:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
     1288d4a:	00 
     1288d4b:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     1288d4e:	4c 89 e6             	mov    rsi,r12

- 0x128a766 from 0x128a432..0x128a7d7
     128a743:	4d 89 e0             	mov    r8,r12
     128a746:	45 31 c9             	xor    r9d,r9d
     128a749:	e8 5e 7a ff ff       	call   12821ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc7730>
     128a74e:	48 89 ef             	mov    rdi,rbp
     128a751:	e8 ee e3 f6 ff       	call   11f8b44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e0c8>
     128a756:	48 8d bc 24 38 03 00 	lea    rdi,[rsp+0x338]
     128a75d:	00 
     128a75e:	e8 9b e8 f6 ff       	call   11f8ffe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e582>
     128a763:	4c 89 e7             	mov    rdi,r12
     128a766:	e8 2d f4 df ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     128a76b:	4c 89 ef             	mov    rdi,r13
     128a76e:	e8 1d 37 56 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     128a773:	48 8d bc 24 78 01 00 	lea    rdi,[rsp+0x178]
     128a77a:	00 
     128a77b:	e8 10 37 56 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     128a780:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
     128a787:	00 
     128a788:	4c 89 fe             	mov    rsi,r15
     128a78b:	48 8d 94 24 c0 03 00 	lea    rdx,[rsp+0x3c0]
     128a792:	00 

- 0x128a7c0 from 0x128a432..0x128a7d7
     128a79b:	4c 89 f6             	mov    rsi,r14
     128a79e:	e8 b3 77 ff ff       	call   1281f56 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc74da>
     128a7a3:	66 83 a3 a8 06 00 00 	and    WORD PTR [rbx+0x6a8],0x0
     128a7aa:	00 
     128a7ab:	48 8d bc 24 c0 03 00 	lea    rdi,[rsp+0x3c0]
     128a7b2:	00 
     128a7b3:	e8 f6 e7 f6 ff       	call   11f8fae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e532>
     128a7b8:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     128a7bf:	00 
     128a7c0:	e8 d3 f3 df ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     128a7c5:	e9 86 fd ff ff       	jmp    128a550 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcfad4>
     128a7ca:	e8 e1 52 56 00       	call   17efab0 <__stack_chk_fail@plt>
     128a7cf:	48 89 c7             	mov    rdi,rax
     128a7d2:	e8 ce f2 7e ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     128a7d7:	cc                   	int3
     128a7d8:	6a 11                	push   0x11
     128a7da:	58                   	pop    rax
     128a7db:	c3                   	ret
     128a7dc:	b0 7a                	mov    al,0x7a
     128a7de:	c3                   	ret

- 0x1301829 from 0x1301470..0x130187b
     1301809:	00 
     130180a:	e8 81 c6 4e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     130180f:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     1301816:	00 
     1301817:	e8 74 c6 4e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     130181c:	eb 10                	jmp    130182e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x146db2>
     130181e:	48 89 c3             	mov    rbx,rax
     1301821:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     1301828:	00 
     1301829:	e8 6a 83 d8 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     130182e:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     1301833:	e8 58 c6 4e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1301838:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     130183d:	e8 4e c6 4e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1301842:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1301847:	e8 7c 6b ef ff       	call   11f83c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d94c>
     130184c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1301853:	00 00 
     1301855:	48 3b 84 24 90 01 00 	cmp    rax,QWORD PTR [rsp+0x190]
     130185c:	00 

- 0x130212c from 0x130187b..0x13023dd
     1302109:	4c 89 f7             	mov    rdi,r14
     130210c:	49 89 ee             	mov    r14,rbp
     130210f:	e8 30 6a ef ff       	call   11f8b44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e0c8>
     1302114:	48 8d bc 24 d8 0c 00 	lea    rdi,[rsp+0xcd8]
     130211b:	00 
     130211c:	e8 dd 6e ef ff       	call   11f8ffe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e582>
     1302121:	48 89 df             	mov    rdi,rbx
     1302124:	48 8d 9c 24 e0 09 00 	lea    rbx,[rsp+0x9e0]
     130212b:	00 
     130212c:	e8 67 7a d8 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     1302131:	48 89 ef             	mov    rdi,rbp
     1302134:	e8 57 bd 4e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1302139:	4c 89 e7             	mov    rdi,r12
     130213c:	e8 4f bd 4e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1302141:	48 8b 84 24 e0 00 00 	mov    rax,QWORD PTR [rsp+0xe0]
     1302148:	00 
     1302149:	4c 89 ff             	mov    rdi,r15
     130214c:	ff 50 30             	call   QWORD PTR [rax+0x30]
     130214f:	88 84 24 a4 0c 00 00 	mov    BYTE PTR [rsp+0xca4],al
     1302156:	48 8b 84 24 e0 00 00 	mov    rax,QWORD PTR [rsp+0xe0]

- 0x1302372 from 0x130187b..0x13023dd
     1302352:	00 
     1302353:	e8 a6 6c ef ff       	call   11f8ffe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e582>
     1302358:	eb 10                	jmp    130236a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1478ee>
     130235a:	49 89 c4             	mov    r12,rax
     130235d:	48 8d bc 24 d8 0c 00 	lea    rdi,[rsp+0xcd8]
     1302364:	00 
     1302365:	e8 ea 01 00 00       	call   1302554 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x147ad8>
     130236a:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
     1302371:	00 
     1302372:	e8 21 78 d8 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     1302377:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
     130237e:	00 
     130237f:	e8 0c bb 4e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1302384:	48 8d bc 24 e8 01 00 	lea    rdi,[rsp+0x1e8]
     130238b:	00 
     130238c:	e8 ff ba 4e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1302391:	eb 03                	jmp    1302396 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14791a>
     1302393:	49 89 c4             	mov    r12,rax
     1302396:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     130239d:	00 

- 0x1302510 from 0x1302430..0x1302540
     13024ef:	49 89 e6             	mov    r14,rsp
     13024f2:	41 0f 11 86 a8 00 00 	movups XMMWORD PTR [r14+0xa8],xmm0
     13024f9:	00 
     13024fa:	49 83 a6 b8 00 00 00 	and    QWORD PTR [r14+0xb8],0x0
     1302501:	00 
     1302502:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     1302505:	4c 89 f6             	mov    rsi,r14
     1302508:	e8 97 60 f2 ff       	call   12285a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db28>
     130250d:	4c 89 f7             	mov    rdi,r14
     1302510:	e8 83 76 d8 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     1302515:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     130251c:	00 00 
     130251e:	48 3b 84 24 c0 00 00 	cmp    rax,QWORD PTR [rsp+0xc0]
     1302525:	00 
     1302526:	75 0b                	jne    1302533 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x147ab7>
     1302528:	48 81 c4 c8 00 00 00 	add    rsp,0xc8
     130252f:	5b                   	pop    rbx
     1302530:	41 5e                	pop    r14
     1302532:	c3                   	ret
     1302533:	e8 78 d5 4e 00       	call   17efab0 <__stack_chk_fail@plt>

- 0x1309cdb from 0x1309ab4..0x1309e9e
     1309cb6:	8b 8c 24 84 00 00 00 	mov    ecx,DWORD PTR [rsp+0x84]
     1309cbd:	49 89 d8             	mov    r8,rbx
     1309cc0:	45 31 c9             	xor    r9d,r9d
     1309cc3:	e8 e4 84 f7 ff       	call   12821ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc7730>
     1309cc8:	4c 89 ef             	mov    rdi,r13
     1309ccb:	e8 74 ee ee ff       	call   11f8b44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e0c8>
     1309cd0:	4c 89 e7             	mov    rdi,r12
     1309cd3:	e8 26 f3 ee ff       	call   11f8ffe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e582>
     1309cd8:	48 89 df             	mov    rdi,rbx
     1309cdb:	e8 b8 fe d7 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     1309ce0:	48 89 ef             	mov    rdi,rbp
     1309ce3:	e8 a8 41 4e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1309ce8:	4c 89 f7             	mov    rdi,r14
     1309ceb:	e8 a0 41 4e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1309cf0:	48 8d 84 24 20 03 00 	lea    rax,[rsp+0x320]
     1309cf7:	00 
     1309cf8:	c6 80 c5 02 00 00 01 	mov    BYTE PTR [rax+0x2c5],0x1
     1309cff:	49 8d b7 f8 00 00 00 	lea    rsi,[r15+0xf8]
     1309d06:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     1309d0d:	00 

- 0x130f142 from 0x130f09d..0x130f169
     130f12a:	88 83 30 01 00 00    	mov    BYTE PTR [rbx+0x130],al
     130f130:	48 83 c4 08          	add    rsp,0x8
     130f134:	5b                   	pop    rbx
     130f135:	41 5c                	pop    r12
     130f137:	41 5e                	pop    r14
     130f139:	41 5f                	pop    r15
     130f13b:	c3                   	ret
     130f13c:	49 89 c7             	mov    r15,rax
     130f13f:	4c 89 e7             	mov    rdi,r12
     130f142:	e8 51 aa d7 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     130f147:	eb 03                	jmp    130f14c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1546d0>
     130f149:	49 89 c7             	mov    r15,rax
     130f14c:	4c 89 f7             	mov    rdi,r14
     130f14f:	e8 3c ed 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     130f154:	eb 03                	jmp    130f159 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1546dd>
     130f156:	49 89 c7             	mov    r15,rax
     130f159:	48 89 df             	mov    rdi,rbx
     130f15c:	e8 2f ed 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     130f161:	4c 89 ff             	mov    rdi,r15
     130f164:	e8 67 0b 76 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>

- 0x130fe9d from 0x130f6e8..0x130ff24
     130fe7d:	49 89 c6             	mov    r14,rax
     130fe80:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     130fe87:	00 
     130fe88:	e8 8f 85 ee ff       	call   11f841c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d9a0>
     130fe8d:	eb 68                	jmp    130fef7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15547b>
     130fe8f:	49 89 c6             	mov    r14,rax
     130fe92:	48 89 df             	mov    rdi,rbx
     130fe95:	e8 f6 df 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     130fe9a:	48 89 ef             	mov    rdi,rbp
     130fe9d:	e8 f6 9c d7 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     130fea2:	eb 03                	jmp    130fea7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15542b>
     130fea4:	49 89 c6             	mov    r14,rax
     130fea7:	48 8d bc 24 f8 02 00 	lea    rdi,[rsp+0x2f8]
     130feae:	00 
     130feaf:	e8 dc df 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     130feb4:	eb 03                	jmp    130feb9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15543d>
     130feb6:	49 89 c6             	mov    r14,rax
     130feb9:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     130fec0:	00 
     130fec1:	eb 28                	jmp    130feeb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15546f>

- 0x1316547 from 0x1316381..0x1316598
     131652e:	eb 12                	jmp    1316542 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15bac6>
     1316530:	49 89 c5             	mov    r13,rax
     1316533:	eb 3a                	jmp    131656f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15baf3>
     1316535:	49 89 c5             	mov    r13,rax
     1316538:	eb 1c                	jmp    1316556 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15bada>
     131653a:	49 89 c5             	mov    r13,rax
     131653d:	eb 0d                	jmp    131654c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15bad0>
     131653f:	49 89 c5             	mov    r13,rax
     1316542:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     1316547:	e8 4c 36 d7 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     131654c:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1316551:	e8 3a 79 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1316556:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     131655b:	e8 30 79 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1316560:	eb 0d                	jmp    131656f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15baf3>
     1316562:	49 89 c5             	mov    r13,rax
     1316565:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     131656a:	e8 ad 1e ee ff       	call   11f841c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d9a0>
     131656f:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     1316573:	e8 50 1e ee ff       	call   11f83c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d94c>

- 0x1317072 from 0x1316ea2..0x13170c4
     1317059:	eb 00                	jmp    131705b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15c5df>
     131705b:	48 89 c3             	mov    rbx,rax
     131705e:	eb 3a                	jmp    131709a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15c61e>
     1317060:	48 89 c3             	mov    rbx,rax
     1317063:	eb 1c                	jmp    1317081 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15c605>
     1317065:	48 89 c3             	mov    rbx,rax
     1317068:	eb 0d                	jmp    1317077 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15c5fb>
     131706a:	48 89 c3             	mov    rbx,rax
     131706d:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     1317072:	e8 21 2b d7 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     1317077:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     131707c:	e8 0f 6e 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1317081:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     1317086:	e8 05 6e 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     131708b:	eb 0d                	jmp    131709a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15c61e>
     131708d:	48 89 c3             	mov    rbx,rax
     1317090:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     1317095:	e8 82 13 ee ff       	call   11f841c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d9a0>
     131709a:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     131709f:	e8 24 13 ee ff       	call   11f83c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d94c>

- 0x135239a from 0x13522e9..0x13523a7
     135237c:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     1352380:	48 8d bb a8 00 00 00 	lea    rdi,[rbx+0xa8]
     1352387:	e8 f4 bc 49 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     135238c:	48 83 c4 08          	add    rsp,0x8
     1352390:	5b                   	pop    rbx
     1352391:	41 5e                	pop    r14
     1352393:	c3                   	ret
     1352394:	49 89 c6             	mov    r14,rax
     1352397:	48 89 df             	mov    rdi,rbx
     135239a:	e8 f9 77 d3 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     135239f:	4c 89 f7             	mov    rdi,r14
     13523a2:	e8 29 d9 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     13523a7:	cc                   	int3
     13523a8:	53                   	push   rbx
     13523a9:	48 89 fb             	mov    rbx,rdi
     13523ac:	48 83 c7 08          	add    rdi,0x8
     13523b0:	e8 53 86 75 ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
     13523b5:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
     13523b9:	e8 ea 34 41 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     13523be:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]

- 0x1551d92 from 0x1551d92..0x1551d97
     1551d79:	75 06                	jne    1551d81 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397305>
     1551d7b:	48 83 c4 20          	add    rsp,0x20
     1551d7f:	5b                   	pop    rbx
     1551d80:	c3                   	ret
     1551d81:	e8 2a dd 29 00       	call   17efab0 <__stack_chk_fail@plt>
     1551d86:	80 be 18 01 00 00 00 	cmp    BYTE PTR [rsi+0x118],0x0
     1551d8d:	0f 94 c0             	sete   al
     1551d90:	c3                   	ret
     1551d91:	cc                   	int3
     1551d92:	e9 01 7e b3 ff       	jmp    1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     1551d97:	41 57                	push   r15
     1551d99:	41 56                	push   r14
     1551d9b:	41 54                	push   r12
     1551d9d:	53                   	push   rbx
     1551d9e:	50                   	push   rax
     1551d9f:	4c 8d 7f 08          	lea    r15,[rdi+0x8]
     1551da3:	0f 57 c0             	xorps  xmm0,xmm0
     1551da6:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
     1551daa:	4c 89 3f             	mov    QWORD PTR [rdi],r15
     1551dad:	48 85 d2             	test   rdx,rdx

- 0x1558654 from 0x15585a0..0x15588dd
     155862e:	88 83 e8 00 00 00    	mov    BYTE PTR [rbx+0xe8],al
     1558634:	88 83 f0 00 00 00    	mov    BYTE PTR [rbx+0xf0],al
     155863a:	ba c1 00 00 00       	mov    edx,0xc1
     155863f:	48 89 df             	mov    rdi,rbx
     1558642:	31 f6                	xor    esi,esi
     1558644:	e8 47 65 29 00       	call   17eeb90 <memset@plt>
     1558649:	48 89 df             	mov    rdi,rbx
     155864c:	e8 8d 02 00 00       	call   15588de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39de62>
     1558651:	48 89 df             	mov    rdi,rbx
     1558654:	e8 3f 15 b3 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     1558659:	4c 8d 3d a0 87 49 00 	lea    r15,[rip+0x4987a0]        # 19f0e00 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x2530>
     1558660:	e9 21 02 00 00       	jmp    1558886 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39de0a>
     1558665:	eb 7c                	jmp    15586e3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39dc67>
     1558667:	4c 89 e2             	mov    rdx,r12
     155866a:	4d 39 f4             	cmp    r12,r14
     155866d:	72 08                	jb     1558677 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39dbfb>
     155866f:	4c 89 e0             	mov    rax,r12
     1558672:	31 d2                	xor    edx,edx
     1558674:	49 f7 f6             	div    r14
     1558677:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]

- 0x15589b9 from 0x155892a..0x15589e8
     1558993:	88 83 e8 00 00 00    	mov    BYTE PTR [rbx+0xe8],al
     1558999:	88 83 f0 00 00 00    	mov    BYTE PTR [rbx+0xf0],al
     155899f:	ba c1 00 00 00       	mov    edx,0xc1
     15589a4:	48 89 df             	mov    rdi,rbx
     15589a7:	31 f6                	xor    esi,esi
     15589a9:	e8 e2 61 29 00       	call   17eeb90 <memset@plt>
     15589ae:	48 89 df             	mov    rdi,rbx
     15589b1:	e8 28 ff ff ff       	call   15588de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39de62>
     15589b6:	48 89 df             	mov    rdi,rbx
     15589b9:	e8 da 11 b3 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     15589be:	48 8d 05 3b 84 49 00 	lea    rax,[rip+0x49843b]        # 19f0e00 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x2530>
     15589c5:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     15589cc:	00 00 
     15589ce:	48 3b 8c 24 00 01 00 	cmp    rcx,QWORD PTR [rsp+0x100]
     15589d5:	00 
     15589d6:	75 0b                	jne    15589e3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39df67>
     15589d8:	48 81 c4 08 01 00 00 	add    rsp,0x108
     15589df:	5b                   	pop    rbx
     15589e0:	41 5e                	pop    r14
     15589e2:	c3                   	ret

## +0x560 accesses in 0x1088000..0x108e000

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

### 0x1089fd4: mov    al,BYTE PTR [rbx+0x560]
     1089fb9:	00 00 
     1089fbb:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     1089fc0:	8b 46 08             	mov    eax,DWORD PTR [rsi+0x8]
     1089fc3:	89 47 08             	mov    DWORD PTR [rdi+0x8],eax
     1089fc6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1089fc9:	48 89 07             	mov    QWORD PTR [rdi],rax
     1089fcc:	48 83 c7 10          	add    rdi,0x10
     1089fd0:	48 83 c6 10          	add    rsi,0x10
     1089fd4:	8a 83 60 05 00 00    	mov    al,BYTE PTR [rbx+0x560]
     1089fda:	41 3a 86 60 05 00 00 	cmp    al,BYTE PTR [r14+0x560]
     1089fe1:	75 0b                	jne    1089fee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251404>
     1089fe3:	84 c0                	test   al,al
     1089fe5:	74 1e                	je     108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fe7:	e8 04 3b 00 00       	call   108daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254f06>
     1089fec:	eb 17                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fee:	84 c0                	test   al,al
     1089ff0:	74 0e                	je     108a000 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251416>
     1089ff2:	e8 7b fa ff ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>

### 0x1089fda: cmp    al,BYTE PTR [r14+0x560]
     1089fbb:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     1089fc0:	8b 46 08             	mov    eax,DWORD PTR [rsi+0x8]
     1089fc3:	89 47 08             	mov    DWORD PTR [rdi+0x8],eax
     1089fc6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1089fc9:	48 89 07             	mov    QWORD PTR [rdi],rax
     1089fcc:	48 83 c7 10          	add    rdi,0x10
     1089fd0:	48 83 c6 10          	add    rsi,0x10
     1089fd4:	8a 83 60 05 00 00    	mov    al,BYTE PTR [rbx+0x560]
     1089fda:	41 3a 86 60 05 00 00 	cmp    al,BYTE PTR [r14+0x560]
     1089fe1:	75 0b                	jne    1089fee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251404>
     1089fe3:	84 c0                	test   al,al
     1089fe5:	74 1e                	je     108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fe7:	e8 04 3b 00 00       	call   108daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254f06>
     1089fec:	eb 17                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fee:	84 c0                	test   al,al
     1089ff0:	74 0e                	je     108a000 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251416>
     1089ff2:	e8 7b fa ff ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     1089ff7:	c6 83 60 05 00 00 00 	mov    BYTE PTR [rbx+0x560],0x0

### 0x1089ff7: mov    BYTE PTR [rbx+0x560],0x0
     1089fe1:	75 0b                	jne    1089fee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251404>
     1089fe3:	84 c0                	test   al,al
     1089fe5:	74 1e                	je     108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fe7:	e8 04 3b 00 00       	call   108daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254f06>
     1089fec:	eb 17                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fee:	84 c0                	test   al,al
     1089ff0:	74 0e                	je     108a000 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251416>
     1089ff2:	e8 7b fa ff ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     1089ff7:	c6 83 60 05 00 00 00 	mov    BYTE PTR [rbx+0x560],0x0
     1089ffe:	eb 05                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     108a000:	e8 4f 3c 00 00       	call   108dc54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25506a>
     108a005:	4c 39 f3             	cmp    rbx,r14
     108a008:	4c 89 34 24          	mov    QWORD PTR [rsp],r14
     108a00c:	0f 84 e3 00 00 00    	je     108a0f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25150b>
     108a012:	4c 8d bb 68 05 00 00 	lea    r15,[rbx+0x568]
     108a019:	4d 8b ae 68 05 00 00 	mov    r13,QWORD PTR [r14+0x568]
     108a020:	4d 8b a6 70 05 00 00 	mov    r12,QWORD PTR [r14+0x570]
     108a027:	4c 89 e0             	mov    rax,r12

