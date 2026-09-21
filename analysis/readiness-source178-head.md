# readiness source+0x178 head provenance

Goal: resolve the concrete first qword copied into source+0x178, then into owner+0x428, which fd381a later treats as the dispatch table for readiness virtual +0x140.

Known copies:
- inner AP 0x1834418: [rsp+0x8d8..0x8e7] -> source+0x178 @0xea0013
- outer AP 0x1834728: object/pair at [rsp+0x1270] -> rsp+0x11c8.. -> source+0x178 @0xea02ce

## Containing FDE (15310087, 15343400)

## Exact references to rsp+0x8d8 (2)
### WRITE 0xe9fe94: movdqu XMMWORD PTR [rsp+0x8d8],xmm0
      e9fe5c:	4d 89 a7 b0 00 00 00 	mov    QWORD PTR [r15+0xb0],r12
      e9fe63:	48 8b 8c 24 90 12 00 	mov    rcx,QWORD PTR [rsp+0x1290]
      e9fe6a:	00 
      e9fe6b:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e9fe6f:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
      e9fe72:	41 0f 11 87 b8 00 00 	movups XMMWORD PTR [r15+0xb8],xmm0
      e9fe79:	00 
      e9fe7a:	48 85 c0             	test   rax,rax
      e9fe7d:	74 05                	je     e9fe84 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6729a>
      e9fe7f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9fe84:	48 8b 8c 24 70 12 00 	mov    rcx,QWORD PTR [rsp+0x1270]
      e9fe8b:	00 
      e9fe8c:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e9fe90:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      e9fe94:	f3 0f 7f 84 24 d8 08 	movdqu XMMWORD PTR [rsp+0x8d8],xmm0
      e9fe9b:	00 00 
      e9fe9d:	48 85 c0             	test   rax,rax
      e9fea0:	74 05                	je     e9fea7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x672bd>
      e9fea2:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9fea7:	4c 8d bc 24 e8 08 00 	lea    r15,[rsp+0x8e8]
      e9feae:	00 
      e9feaf:	48 8d b4 24 b0 03 00 	lea    rsi,[rsp+0x3b0]
      e9feb6:	00 
      e9feb7:	4c 89 ff             	mov    rdi,r15
      e9feba:	e8 81 e0 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9febf:	4c 89 ac 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],r13
      e9fec6:	00 
      e9fec7:	48 8b 8c 24 70 13 00 	mov    rcx,QWORD PTR [rsp+0x1370]
      e9fece:	00 
      e9fecf:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e9fed3:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      e9fed7:	66 0f 7f 84 24 00 09 	movdqa XMMWORD PTR [rsp+0x900],xmm0
      e9fede:	00 00 
      e9fee0:	48 85 c0             	test   rax,rax
      e9fee3:	74 05                	je     e9feea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67300>
      e9fee5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9feea:	48 83 a4 24 50 0b 00 	and    QWORD PTR [rsp+0xb50],0x0
      e9fef1:	00 00 
      e9fef3:	bf b0 01 00 00       	mov    edi,0x1b0

### READ 0xea000a: movdqu xmm0,XMMWORD PTR [rsp+0x8d8]
      e9ffd2:	48 8d b4 24 10 08 00 	lea    rsi,[rsp+0x810]
      e9ffd9:	00 
      e9ffda:	e8 f1 fa 94 00       	call   17efad0 <memcpy@plt>
      e9ffdf:	48 8b 84 24 d0 08 00 	mov    rax,QWORD PTR [rsp+0x8d0]
      e9ffe6:	00 
      e9ffe7:	0f 10 84 24 c8 08 00 	movups xmm0,XMMWORD PTR [rsp+0x8c8]
      e9ffee:	00 
      e9ffef:	41 0f 11 84 24 68 01 	movups XMMWORD PTR [r12+0x168],xmm0
      e9fff6:	00 00 
      e9fff8:	48 85 c0             	test   rax,rax
      e9fffb:	74 05                	je     ea0002 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67418>
      e9fffd:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea0002:	48 8b 84 24 e0 08 00 	mov    rax,QWORD PTR [rsp+0x8e0]
      ea0009:	00 
      ea000a:	f3 0f 6f 84 24 d8 08 	movdqu xmm0,XMMWORD PTR [rsp+0x8d8]
      ea0011:	00 00 
      ea0013:	f3 41 0f 7f 84 24 78 	movdqu XMMWORD PTR [r12+0x178],xmm0
      ea001a:	01 00 00 
      ea001d:	48 85 c0             	test   rax,rax
      ea0020:	74 05                	je     ea0027 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6743d>
      ea0022:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea0027:	4c 89 e7             	mov    rdi,r12
      ea002a:	48 81 c7 88 01 00 00 	add    rdi,0x188
      ea0031:	4c 89 fe             	mov    rsi,r15
      ea0034:	e8 07 df 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ea0039:	48 8b 84 24 08 09 00 	mov    rax,QWORD PTR [rsp+0x908]
      ea0040:	00 
      ea0041:	0f 28 84 24 00 09 00 	movaps xmm0,XMMWORD PTR [rsp+0x900]
      ea0048:	00 
      ea0049:	41 0f 11 84 24 a0 01 	movups XMMWORD PTR [r12+0x1a0],xmm0
      ea0050:	00 00 
      ea0052:	48 85 c0             	test   rax,rax
      ea0055:	74 05                	je     ea005c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67472>
      ea0057:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea005c:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      ea0063:	00 
      ea0064:	48 83 23 00          	and    QWORD PTR [rbx],0x0
      ea0068:	4c 89 a4 24 50 0b 00 	mov    QWORD PTR [rsp+0xb50],r12
      ea006f:	00 

## Exact references to rsp+0x8e0 (3)
### READ 0xea0002: mov    rax,QWORD PTR [rsp+0x8e0]
      e9ffcc:	00 
      e9ffcd:	ba b8 00 00 00       	mov    edx,0xb8
      e9ffd2:	48 8d b4 24 10 08 00 	lea    rsi,[rsp+0x810]
      e9ffd9:	00 
      e9ffda:	e8 f1 fa 94 00       	call   17efad0 <memcpy@plt>
      e9ffdf:	48 8b 84 24 d0 08 00 	mov    rax,QWORD PTR [rsp+0x8d0]
      e9ffe6:	00 
      e9ffe7:	0f 10 84 24 c8 08 00 	movups xmm0,XMMWORD PTR [rsp+0x8c8]
      e9ffee:	00 
      e9ffef:	41 0f 11 84 24 68 01 	movups XMMWORD PTR [r12+0x168],xmm0
      e9fff6:	00 00 
      e9fff8:	48 85 c0             	test   rax,rax
      e9fffb:	74 05                	je     ea0002 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67418>
      e9fffd:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea0002:	48 8b 84 24 e0 08 00 	mov    rax,QWORD PTR [rsp+0x8e0]
      ea0009:	00 
      ea000a:	f3 0f 6f 84 24 d8 08 	movdqu xmm0,XMMWORD PTR [rsp+0x8d8]
      ea0011:	00 00 
      ea0013:	f3 41 0f 7f 84 24 78 	movdqu XMMWORD PTR [r12+0x178],xmm0
      ea001a:	01 00 00 
      ea001d:	48 85 c0             	test   rax,rax
      ea0020:	74 05                	je     ea0027 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6743d>
      ea0022:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea0027:	4c 89 e7             	mov    rdi,r12
      ea002a:	48 81 c7 88 01 00 00 	add    rdi,0x188
      ea0031:	4c 89 fe             	mov    rsi,r15
      ea0034:	e8 07 df 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ea0039:	48 8b 84 24 08 09 00 	mov    rax,QWORD PTR [rsp+0x908]
      ea0040:	00 
      ea0041:	0f 28 84 24 00 09 00 	movaps xmm0,XMMWORD PTR [rsp+0x900]
      ea0048:	00 
      ea0049:	41 0f 11 84 24 a0 01 	movups XMMWORD PTR [r12+0x1a0],xmm0
      ea0050:	00 00 
      ea0052:	48 85 c0             	test   rax,rax
      ea0055:	74 05                	je     ea005c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67472>
      ea0057:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea005c:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      ea0063:	00 
      ea0064:	48 83 23 00          	and    QWORD PTR [rbx],0x0

### READ 0xea0e86: mov    rdi,QWORD PTR [rsp+0x8e0]
      ea0e4a:	49 8b 7c 24 48       	mov    rdi,QWORD PTR [r12+0x48]
      ea0e4f:	e8 32 d6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0e54:	49 8b 7c 24 38       	mov    rdi,QWORD PTR [r12+0x38]
      ea0e59:	e8 28 d6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0e5e:	49 8b 7c 24 28       	mov    rdi,QWORD PTR [r12+0x28]
      ea0e63:	e8 1e d6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0e68:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0e6f:	00 
      ea0e70:	e8 55 94 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea0e75:	4c 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],r15
      ea0e7a:	eb 8f                	jmp    ea0e0b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68221>
      ea0e7c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0e81:	eb 88                	jmp    ea0e0b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68221>
      ea0e83:	49 89 c7             	mov    r15,rax
      ea0e86:	48 8b bc 24 e0 08 00 	mov    rdi,QWORD PTR [rsp+0x8e0]
      ea0e8d:	00 
      ea0e8e:	e8 f3 d5 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0e93:	48 8b bc 24 d0 08 00 	mov    rdi,QWORD PTR [rsp+0x8d0]
      ea0e9a:	00 
      ea0e9b:	e8 e6 d5 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0ea0:	48 8d bc 24 e0 07 00 	lea    rdi,[rsp+0x7e0]
      ea0ea7:	00 
      ea0ea8:	e8 bd 90 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0ead:	4c 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],r15
      ea0eb2:	eb 05                	jmp    ea0eb9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x682cf>
      ea0eb4:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0eb9:	48 89 df             	mov    rdi,rbx
      ea0ebc:	e8 a9 90 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0ec1:	eb 05                	jmp    ea0ec8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x682de>
      ea0ec3:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0ec8:	48 8b bc 24 a8 07 00 	mov    rdi,QWORD PTR [rsp+0x7a8]
      ea0ecf:	00 
      ea0ed0:	e8 b1 d5 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0ed5:	48 8b bc 24 98 07 00 	mov    rdi,QWORD PTR [rsp+0x798]
      ea0edc:	00 
      ea0edd:	e8 a4 d5 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0ee2:	48 8b bc 24 88 07 00 	mov    rdi,QWORD PTR [rsp+0x788]
      ea0ee9:	00 
      ea0eea:	e8 97 d5 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### READ 0xea1999: lea    r14,[rsp+0x8e0]
      ea195f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1964:	48 8d bc 24 c0 09 00 	lea    rdi,[rsp+0x9c0]
      ea196b:	00 
      ea196c:	e8 f9 85 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1971:	eb 05                	jmp    ea1978 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68d8e>
      ea1973:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1978:	48 8b bc 24 b8 09 00 	mov    rdi,QWORD PTR [rsp+0x9b8]
      ea197f:	00 
      ea1980:	e8 01 cb bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1985:	48 8d bc 24 80 09 00 	lea    rdi,[rsp+0x980]
      ea198c:	00 
      ea198d:	e8 d8 85 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1992:	eb 05                	jmp    ea1999 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68daf>
      ea1994:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1999:	4c 8d b4 24 e0 08 00 	lea    r14,[rsp+0x8e0]
      ea19a0:	00 
      ea19a1:	49 8b be 88 00 00 00 	mov    rdi,QWORD PTR [r14+0x88]
      ea19a8:	e8 d9 ca bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea19ad:	4c 89 f7             	mov    rdi,r14
      ea19b0:	e8 b5 85 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea19b5:	eb 05                	jmp    ea19bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68dd2>
      ea19b7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea19bc:	48 8b bc 24 b8 08 00 	mov    rdi,QWORD PTR [rsp+0x8b8]
      ea19c3:	00 
      ea19c4:	e8 bd ca bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea19c9:	48 89 df             	mov    rdi,rbx
      ea19cc:	e8 99 85 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea19d1:	48 8d bc 24 30 08 00 	lea    rdi,[rsp+0x830]
      ea19d8:	00 
      ea19d9:	e8 8c 85 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea19de:	48 8d bc 24 00 08 00 	lea    rdi,[rsp+0x800]
      ea19e5:	00 
      ea19e6:	e8 7f 85 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea19eb:	48 8d bc 24 d0 07 00 	lea    rdi,[rsp+0x7d0]
      ea19f2:	00 
      ea19f3:	e8 72 85 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea19f8:	48 8b bc 24 c8 07 00 	mov    rdi,QWORD PTR [rsp+0x7c8]
      ea19ff:	00 
      ea1a00:	e8 81 ca bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

## Exact references to rsp+0x1270 (7)
### READ 0xe9aca6: mov    rax,QWORD PTR [rsp+0x1270]
      e9ac69:	6a 2a                	push   0x2a
      e9ac6b:	41 58                	pop    r8
      e9ac6d:	4c 89 f2             	mov    rdx,r14
      e9ac70:	45 31 c9             	xor    r9d,r9d
      e9ac73:	e8 12 c7 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9ac78:	88 84 24 61 07 00 00 	mov    BYTE PTR [rsp+0x761],al
      e9ac7f:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9ac83:	48 8d 35 b8 93 53 ff 	lea    rsi,[rip+0xffffffffff5393b8]        # 3d4042 <_ZTSN5boost17bad_function_callE@@Base+0x1388>
      e9ac8a:	48 8d 0d bf 93 53 ff 	lea    rcx,[rip+0xffffffffff5393bf]        # 3d4050 <_ZTSN5boost17bad_function_callE@@Base+0x1396>
      e9ac91:	4c 89 f2             	mov    rdx,r14
      e9ac94:	4d 89 f8             	mov    r8,r15
      e9ac97:	45 31 c9             	xor    r9d,r9d
      e9ac9a:	e8 eb c6 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9ac9f:	88 84 24 67 07 00 00 	mov    BYTE PTR [rsp+0x767],al
      e9aca6:	48 8b 84 24 70 12 00 	mov    rax,QWORD PTR [rsp+0x1270]
      e9acad:	00 
      e9acae:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      e9acb2:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
      e9acb8:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
      e9acbc:	4d 85 f6             	test   r14,r14
      e9acbf:	74 05                	je     e9acc6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x620dc>
      e9acc1:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9acc6:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      e9accd:	00 
      e9acce:	48 89 de             	mov    rsi,rbx
      e9acd1:	e8 ba f5 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9acd6:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9acdd:	00 
      e9acde:	48 8d b4 24 70 06 00 	lea    rsi,[rsp+0x670]
      e9ace5:	00 
      e9ace6:	e8 41 1d fe ff       	call   e7ca2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e42>
      e9aceb:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9acf0:	0f 29 84 24 70 07 00 	movaps XMMWORD PTR [rsp+0x770],xmm0
      e9acf7:	00 
      e9acf8:	4d 85 f6             	test   r14,r14
      e9acfb:	74 05                	je     e9ad02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62118>
      e9acfd:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9ad02:	4c 8d b4 24 80 07 00 	lea    r14,[rsp+0x780]
      e9ad09:	00 

### READ 0xe9ba3d: mov    rax,QWORD PTR [rsp+0x1270]
      e9ba05:	00 00 
      e9ba07:	66 0f 7f 84 24 70 07 	movdqa XMMWORD PTR [rsp+0x770],xmm0
      e9ba0e:	00 00 
      e9ba10:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
      e9ba17:	00 
      e9ba18:	e8 44 66 06 00       	call   f02061 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc9477>
      e9ba1d:	0f 28 84 24 b0 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x3b0]
      e9ba24:	00 
      e9ba25:	4c 8d b4 24 90 07 00 	lea    r14,[rsp+0x790]
      e9ba2c:	00 
      e9ba2d:	41 0f 29 46 f0       	movaps XMMWORD PTR [r14-0x10],xmm0
      e9ba32:	0f 57 c0             	xorps  xmm0,xmm0
      e9ba35:	0f 29 84 24 b0 03 00 	movaps XMMWORD PTR [rsp+0x3b0],xmm0
      e9ba3c:	00 
      e9ba3d:	48 8b 84 24 70 12 00 	mov    rax,QWORD PTR [rsp+0x1270]
      e9ba44:	00 
      e9ba45:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      e9ba49:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ba50:	00 
      e9ba51:	e8 40 66 06 00       	call   f02096 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc94ac>
      e9ba56:	6a 60                	push   0x60
      e9ba58:	5f                   	pop    rdi
      e9ba59:	e8 a2 24 95 00       	call   17edf00 <_Znwm@plt>
      e9ba5e:	49 89 c7             	mov    r15,rax
      e9ba61:	66 0f ef c0          	pxor   xmm0,xmm0
      e9ba65:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9ba6a:	48 8d 05 57 f3 96 00 	lea    rax,[rip+0x96f357]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
      e9ba71:	49 89 07             	mov    QWORD PTR [r15],rax
      e9ba74:	4d 8d 67 20          	lea    r12,[r15+0x20]
      e9ba78:	4c 8d b4 24 60 10 00 	lea    r14,[rsp+0x1060]
      e9ba7f:	00 
      e9ba80:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9ba87:	00 
      e9ba88:	4c 89 f7             	mov    rdi,r14
      e9ba8b:	e8 42 66 06 00       	call   f020d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc94e8>
      e9ba90:	48 8d 05 a9 54 9c 00 	lea    rax,[rip+0x9c54a9]        # 1860f40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1d628>
      e9ba97:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      e9ba9b:	4c 89 ff             	mov    rdi,r15
      e9ba9e:	48 83 c7 30          	add    rdi,0x30

### READ 0xe9c9ab: mov    rcx,QWORD PTR [rsp+0x1270]
      e9c975:	00 
      e9c976:	48 8d b4 24 80 05 00 	lea    rsi,[rsp+0x580]
      e9c97d:	00 
      e9c97e:	48 89 df             	mov    rdi,rbx
      e9c981:	e8 62 c5 05 00       	call   ef8ee8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02fe>
      e9c986:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
      e9c98d:	00 
      e9c98e:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
      e9c992:	48 8b 84 24 80 13 00 	mov    rax,QWORD PTR [rsp+0x1380]
      e9c999:	00 
      e9c99a:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
      e9c99e:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e9c9a3:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
      e9c9a7:	4c 89 73 48          	mov    QWORD PTR [rbx+0x48],r14
      e9c9ab:	48 8b 8c 24 70 12 00 	mov    rcx,QWORD PTR [rsp+0x1270]
      e9c9b2:	00 
      e9c9b3:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e9c9b7:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      e9c9bb:	66 0f 7f 43 50       	movdqa XMMWORD PTR [rbx+0x50],xmm0
      e9c9c0:	48 85 c0             	test   rax,rax
      e9c9c3:	4c 8b b4 24 80 00 00 	mov    r14,QWORD PTR [rsp+0x80]
      e9c9ca:	00 
      e9c9cb:	4c 8b bc 24 b8 00 00 	mov    r15,QWORD PTR [rsp+0xb8]
      e9c9d2:	00 
      e9c9d3:	74 05                	je     e9c9da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63df0>
      e9c9d5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9c9da:	48 8d bc 24 c0 08 00 	lea    rdi,[rsp+0x8c0]
      e9c9e1:	00 
      e9c9e2:	48 8d b4 24 d0 06 00 	lea    rsi,[rsp+0x6d0]
      e9c9e9:	00 
      e9c9ea:	e8 3d c5 05 00       	call   ef8f2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0342>
      e9c9ef:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
      e9c9f4:	66 48 0f 6e c0       	movq   xmm0,rax
      e9c9f9:	f3 0f 7e 4c 24 70    	movq   xmm1,QWORD PTR [rsp+0x70]
      e9c9ff:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9ca03:	48 83 c0 08          	add    rax,0x8
      e9ca07:	48 8d bc 24 80 09 00 	lea    rdi,[rsp+0x980]
      e9ca0e:	00 
      e9ca0f:	66 0f 7f 4f e0       	movdqa XMMWORD PTR [rdi-0x20],xmm1

### READ 0xe9df07: mov    rdx,QWORD PTR [rsp+0x1270]
      e9dec9:	66 0f 7f 84 24 00 10 	movdqa XMMWORD PTR [rsp+0x1000],xmm0
      e9ded0:	00 00 
      e9ded2:	48 85 c9             	test   rcx,rcx
      e9ded5:	74 05                	je     e9dedc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x652f2>
      e9ded7:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      e9dedc:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e9dee3:	00 
      e9dee4:	48 8d b4 24 50 03 00 	lea    rsi,[rsp+0x350]
      e9deeb:	00 
      e9deec:	e8 9f c3 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9def1:	48 8b 84 24 b0 13 00 	mov    rax,QWORD PTR [rsp+0x13b0]
      e9def8:	00 
      e9def9:	8b 8c 24 cc 00 00 00 	mov    ecx,DWORD PTR [rsp+0xcc]
      e9df00:	89 8c 24 40 10 00 00 	mov    DWORD PTR [rsp+0x1040],ecx
      e9df07:	48 8b 94 24 70 12 00 	mov    rdx,QWORD PTR [rsp+0x1270]
      e9df0e:	00 
      e9df0f:	48 8b 4a 08          	mov    rcx,QWORD PTR [rdx+0x8]
      e9df13:	f3 0f 6f 02          	movdqu xmm0,XMMWORD PTR [rdx]
      e9df17:	f3 0f 7f 84 24 48 10 	movdqu XMMWORD PTR [rsp+0x1048],xmm0
      e9df1e:	00 00 
      e9df20:	48 85 c9             	test   rcx,rcx
      e9df23:	74 05                	je     e9df2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65340>
      e9df25:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      e9df2a:	48 8d b4 24 d0 0e 00 	lea    rsi,[rsp+0xed0]
      e9df31:	00 
      e9df32:	48 89 86 88 01 00 00 	mov    QWORD PTR [rsi+0x188],rax
      e9df39:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9df40:	00 
      e9df41:	e8 88 a9 61 00       	call   14b88ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fde52>
      e9df46:	48 63 84 24 c4 00 00 	movsxd rax,DWORD PTR [rsp+0xc4]
      e9df4d:	00 
      e9df4e:	48 63 9c 24 c8 00 00 	movsxd rbx,DWORD PTR [rsp+0xc8]
      e9df55:	00 
      e9df56:	4c 6b f8 3c          	imul   r15,rax,0x3c
      e9df5a:	48 89 9c 24 00 09 00 	mov    QWORD PTR [rsp+0x900],rbx
      e9df61:	00 
      e9df62:	4c 89 bc 24 08 09 00 	mov    QWORD PTR [rsp+0x908],r15
      e9df69:	00 
      e9df6a:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]

### READ 0xe9f13d: mov    rax,QWORD PTR [rsp+0x1270]
      e9f104:	48 8d 35 26 55 53 ff 	lea    rsi,[rip+0xffffffffff535526]        # 3d4631 <_ZTSN5boost17bad_function_callE@@Base+0x1977>
      e9f10b:	48 8d 0d 2e 55 53 ff 	lea    rcx,[rip+0xffffffffff53552e]        # 3d4640 <_ZTSN5boost17bad_function_callE@@Base+0x1986>
      e9f112:	6a 0b                	push   0xb
      e9f114:	5a                   	pop    rdx
      e9f115:	6a 1a                	push   0x1a
      e9f117:	41 58                	pop    r8
      e9f119:	45 31 c9             	xor    r9d,r9d
      e9f11c:	e8 69 82 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9f121:	84 c0                	test   al,al
      e9f123:	0f 84 fa 00 00 00    	je     e9f223 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66639>
      e9f129:	48 8d 35 d0 5c 53 ff 	lea    rsi,[rip+0xffffffffff535cd0]        # 3d4e00 <_ZTSN5boost17bad_function_callE@@Base+0x2146>
      e9f130:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f137:	00 
      e9f138:	e8 03 ee 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f13d:	48 8b 84 24 70 12 00 	mov    rax,QWORD PTR [rsp+0x1270]
      e9f144:	00 
      e9f145:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      e9f149:	4c 8b 78 08          	mov    r15,QWORD PTR [rax+0x8]
      e9f14d:	48 8d 05 b4 71 99 00 	lea    rax,[rip+0x9971b4]        # 1836308 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x82a0>
      e9f154:	4d 85 ff             	test   r15,r15
      e9f157:	74 4d                	je     e9f1a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x665bc>
      e9f159:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9f15e:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f165:	00 
      e9f166:	f3 0f 7f 84 24 68 10 	movdqu XMMWORD PTR [rsp+0x1068],xmm0
      e9f16d:	00 00 
      e9f16f:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9f174:	eb 41                	jmp    e9f1b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x665cd>
      e9f176:	48 8d 35 2e 3d 4c ff 	lea    rsi,[rip+0xffffffffff4c3d2e]        # 362eab <_ZTSSt12bad_any_cast@@Base-0x2d31d>
      e9f17d:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f184:	00 
      e9f185:	e8 c5 c6 bd ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e9f18a:	84 c0                	test   al,al
      e9f18c:	0f 84 64 b1 ff ff    	je     e9a2f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6170c>
      e9f192:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f199:	00 
      e9f19a:	e8 91 7b c0 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e9f19f:	6a 04                	push   0x4
      e9f1a1:	e9 2c b1 ff ff       	jmp    e9a2d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x616e8>

### READ 0xe9fe84: mov    rcx,QWORD PTR [rsp+0x1270]
      e9fe4e:	00 
      e9fe4f:	ba b0 00 00 00       	mov    edx,0xb0
      e9fe54:	4c 89 ff             	mov    rdi,r15
      e9fe57:	e8 74 fc 94 00       	call   17efad0 <memcpy@plt>
      e9fe5c:	4d 89 a7 b0 00 00 00 	mov    QWORD PTR [r15+0xb0],r12
      e9fe63:	48 8b 8c 24 90 12 00 	mov    rcx,QWORD PTR [rsp+0x1290]
      e9fe6a:	00 
      e9fe6b:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e9fe6f:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
      e9fe72:	41 0f 11 87 b8 00 00 	movups XMMWORD PTR [r15+0xb8],xmm0
      e9fe79:	00 
      e9fe7a:	48 85 c0             	test   rax,rax
      e9fe7d:	74 05                	je     e9fe84 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6729a>
      e9fe7f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9fe84:	48 8b 8c 24 70 12 00 	mov    rcx,QWORD PTR [rsp+0x1270]
      e9fe8b:	00 
      e9fe8c:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e9fe90:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      e9fe94:	f3 0f 7f 84 24 d8 08 	movdqu XMMWORD PTR [rsp+0x8d8],xmm0
      e9fe9b:	00 00 
      e9fe9d:	48 85 c0             	test   rax,rax
      e9fea0:	74 05                	je     e9fea7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x672bd>
      e9fea2:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9fea7:	4c 8d bc 24 e8 08 00 	lea    r15,[rsp+0x8e8]
      e9feae:	00 
      e9feaf:	48 8d b4 24 b0 03 00 	lea    rsi,[rsp+0x3b0]
      e9feb6:	00 
      e9feb7:	4c 89 ff             	mov    rdi,r15
      e9feba:	e8 81 e0 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9febf:	4c 89 ac 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],r13
      e9fec6:	00 
      e9fec7:	48 8b 8c 24 70 13 00 	mov    rcx,QWORD PTR [rsp+0x1370]
      e9fece:	00 
      e9fecf:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e9fed3:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      e9fed7:	66 0f 7f 84 24 00 09 	movdqa XMMWORD PTR [rsp+0x900],xmm0
      e9fede:	00 00 
      e9fee0:	48 85 c0             	test   rax,rax
      e9fee3:	74 05                	je     e9feea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67300>

### READ 0xea014f: mov    rcx,QWORD PTR [rsp+0x1270]
      ea0113:	48 8b b4 24 88 13 00 	mov    rsi,QWORD PTR [rsp+0x1388]
      ea011a:	00 
      ea011b:	e8 b0 f9 94 00       	call   17efad0 <memcpy@plt>
      ea0120:	48 8b 84 24 90 13 00 	mov    rax,QWORD PTR [rsp+0x1390]
      ea0127:	00 
      ea0128:	48 89 83 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],rax
      ea012f:	48 8b 8c 24 90 12 00 	mov    rcx,QWORD PTR [rsp+0x1290]
      ea0136:	00 
      ea0137:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      ea013b:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
      ea013e:	0f 11 83 b8 00 00 00 	movups XMMWORD PTR [rbx+0xb8],xmm0
      ea0145:	48 85 c0             	test   rax,rax
      ea0148:	74 05                	je     ea014f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67565>
      ea014a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea014f:	48 8b 8c 24 70 12 00 	mov    rcx,QWORD PTR [rsp+0x1270]
      ea0156:	00 
      ea0157:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      ea015b:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      ea015f:	f3 0f 7f 84 24 c8 11 	movdqu XMMWORD PTR [rsp+0x11c8],xmm0
      ea0166:	00 00 
      ea0168:	48 85 c0             	test   rax,rax
      ea016b:	74 05                	je     ea0172 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67588>
      ea016d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea0172:	48 8d bc 24 d8 11 00 	lea    rdi,[rsp+0x11d8]
      ea0179:	00 
      ea017a:	48 8d b4 24 b0 03 00 	lea    rsi,[rsp+0x3b0]
      ea0181:	00 
      ea0182:	e8 b9 dd 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ea0187:	48 8b 8c 24 70 13 00 	mov    rcx,QWORD PTR [rsp+0x1370]
      ea018e:	00 
      ea018f:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      ea0193:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      ea0197:	66 0f 7f 84 24 f0 11 	movdqa XMMWORD PTR [rsp+0x11f0],xmm0
      ea019e:	00 00 
      ea01a0:	48 85 c0             	test   rax,rax
      ea01a3:	74 05                	je     ea01aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x675c0>
      ea01a5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea01aa:	48 83 a4 24 f0 0e 00 	and    QWORD PTR [rsp+0xef0],0x0
      ea01b1:	00 00 

## Exact references to rsp+0x11c8 (2)
### WRITE 0xea015f: movdqu XMMWORD PTR [rsp+0x11c8],xmm0
      ea0127:	00 
      ea0128:	48 89 83 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],rax
      ea012f:	48 8b 8c 24 90 12 00 	mov    rcx,QWORD PTR [rsp+0x1290]
      ea0136:	00 
      ea0137:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      ea013b:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
      ea013e:	0f 11 83 b8 00 00 00 	movups XMMWORD PTR [rbx+0xb8],xmm0
      ea0145:	48 85 c0             	test   rax,rax
      ea0148:	74 05                	je     ea014f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67565>
      ea014a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea014f:	48 8b 8c 24 70 12 00 	mov    rcx,QWORD PTR [rsp+0x1270]
      ea0156:	00 
      ea0157:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      ea015b:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      ea015f:	f3 0f 7f 84 24 c8 11 	movdqu XMMWORD PTR [rsp+0x11c8],xmm0
      ea0166:	00 00 
      ea0168:	48 85 c0             	test   rax,rax
      ea016b:	74 05                	je     ea0172 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67588>
      ea016d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea0172:	48 8d bc 24 d8 11 00 	lea    rdi,[rsp+0x11d8]
      ea0179:	00 
      ea017a:	48 8d b4 24 b0 03 00 	lea    rsi,[rsp+0x3b0]
      ea0181:	00 
      ea0182:	e8 b9 dd 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ea0187:	48 8b 8c 24 70 13 00 	mov    rcx,QWORD PTR [rsp+0x1370]
      ea018e:	00 
      ea018f:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      ea0193:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      ea0197:	66 0f 7f 84 24 f0 11 	movdqa XMMWORD PTR [rsp+0x11f0],xmm0
      ea019e:	00 00 
      ea01a0:	48 85 c0             	test   rax,rax
      ea01a3:	74 05                	je     ea01aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x675c0>
      ea01a5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea01aa:	48 83 a4 24 f0 0e 00 	and    QWORD PTR [rsp+0xef0],0x0
      ea01b1:	00 00 
      ea01b3:	bf b0 01 00 00       	mov    edi,0x1b0
      ea01b8:	e8 43 dd 94 00       	call   17edf00 <_Znwm@plt>
      ea01bd:	49 89 c4             	mov    r12,rax
      ea01c0:	48 89 84 24 a0 0e 00 	mov    QWORD PTR [rsp+0xea0],rax

### READ 0xea02c5: movdqu xmm0,XMMWORD PTR [rsp+0x11c8]
      ea028d:	48 8d b4 24 00 11 00 	lea    rsi,[rsp+0x1100]
      ea0294:	00 
      ea0295:	e8 36 f8 94 00       	call   17efad0 <memcpy@plt>
      ea029a:	48 8b 84 24 c0 11 00 	mov    rax,QWORD PTR [rsp+0x11c0]
      ea02a1:	00 
      ea02a2:	0f 10 84 24 b8 11 00 	movups xmm0,XMMWORD PTR [rsp+0x11b8]
      ea02a9:	00 
      ea02aa:	41 0f 11 84 24 68 01 	movups XMMWORD PTR [r12+0x168],xmm0
      ea02b1:	00 00 
      ea02b3:	48 85 c0             	test   rax,rax
      ea02b6:	74 05                	je     ea02bd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x676d3>
      ea02b8:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea02bd:	48 8b 84 24 d0 11 00 	mov    rax,QWORD PTR [rsp+0x11d0]
      ea02c4:	00 
      ea02c5:	f3 0f 6f 84 24 c8 11 	movdqu xmm0,XMMWORD PTR [rsp+0x11c8]
      ea02cc:	00 00 
      ea02ce:	f3 41 0f 7f 84 24 78 	movdqu XMMWORD PTR [r12+0x178],xmm0
      ea02d5:	01 00 00 
      ea02d8:	48 85 c0             	test   rax,rax
      ea02db:	74 05                	je     ea02e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x676f8>
      ea02dd:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea02e2:	4c 89 e7             	mov    rdi,r12
      ea02e5:	48 81 c7 88 01 00 00 	add    rdi,0x188
      ea02ec:	48 8d b4 24 d8 11 00 	lea    rsi,[rsp+0x11d8]
      ea02f3:	00 
      ea02f4:	e8 47 dc 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ea02f9:	48 8b 84 24 f8 11 00 	mov    rax,QWORD PTR [rsp+0x11f8]
      ea0300:	00 
      ea0301:	66 0f 6f 84 24 f0 11 	movdqa xmm0,XMMWORD PTR [rsp+0x11f0]
      ea0308:	00 00 
      ea030a:	f3 41 0f 7f 84 24 a0 	movdqu XMMWORD PTR [r12+0x1a0],xmm0
      ea0311:	01 00 00 
      ea0314:	48 85 c0             	test   rax,rax
      ea0317:	74 05                	je     ea031e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67734>
      ea0319:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea031e:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea0325:	00 
      ea0326:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      ea032a:	4c 8d bc 24 d0 0e 00 	lea    r15,[rsp+0xed0]

## Exact references to rsp+0x11d0 (2)
### READ 0xea02bd: mov    rax,QWORD PTR [rsp+0x11d0]
      ea0287:	00 
      ea0288:	ba b8 00 00 00       	mov    edx,0xb8
      ea028d:	48 8d b4 24 00 11 00 	lea    rsi,[rsp+0x1100]
      ea0294:	00 
      ea0295:	e8 36 f8 94 00       	call   17efad0 <memcpy@plt>
      ea029a:	48 8b 84 24 c0 11 00 	mov    rax,QWORD PTR [rsp+0x11c0]
      ea02a1:	00 
      ea02a2:	0f 10 84 24 b8 11 00 	movups xmm0,XMMWORD PTR [rsp+0x11b8]
      ea02a9:	00 
      ea02aa:	41 0f 11 84 24 68 01 	movups XMMWORD PTR [r12+0x168],xmm0
      ea02b1:	00 00 
      ea02b3:	48 85 c0             	test   rax,rax
      ea02b6:	74 05                	je     ea02bd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x676d3>
      ea02b8:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea02bd:	48 8b 84 24 d0 11 00 	mov    rax,QWORD PTR [rsp+0x11d0]
      ea02c4:	00 
      ea02c5:	f3 0f 6f 84 24 c8 11 	movdqu xmm0,XMMWORD PTR [rsp+0x11c8]
      ea02cc:	00 00 
      ea02ce:	f3 41 0f 7f 84 24 78 	movdqu XMMWORD PTR [r12+0x178],xmm0
      ea02d5:	01 00 00 
      ea02d8:	48 85 c0             	test   rax,rax
      ea02db:	74 05                	je     ea02e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x676f8>
      ea02dd:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea02e2:	4c 89 e7             	mov    rdi,r12
      ea02e5:	48 81 c7 88 01 00 00 	add    rdi,0x188
      ea02ec:	48 8d b4 24 d8 11 00 	lea    rsi,[rsp+0x11d8]
      ea02f3:	00 
      ea02f4:	e8 47 dc 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ea02f9:	48 8b 84 24 f8 11 00 	mov    rax,QWORD PTR [rsp+0x11f8]
      ea0300:	00 
      ea0301:	66 0f 6f 84 24 f0 11 	movdqa xmm0,XMMWORD PTR [rsp+0x11f0]
      ea0308:	00 00 
      ea030a:	f3 41 0f 7f 84 24 a0 	movdqu XMMWORD PTR [r12+0x1a0],xmm0
      ea0311:	01 00 00 
      ea0314:	48 85 c0             	test   rax,rax
      ea0317:	74 05                	je     ea031e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67734>
      ea0319:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea031e:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea0325:	00 

### READ 0xea0d9a: mov    rdi,QWORD PTR [rsp+0x11d0]
      ea0d60:	e8 21 d7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0d65:	49 8b 7c 24 28       	mov    rdi,QWORD PTR [r12+0x28]
      ea0d6a:	e8 17 d7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0d6f:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea0d76:	00 
      ea0d77:	e8 4e 95 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea0d7c:	4c 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],r15
      ea0d81:	eb 05                	jmp    ea0d88 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6819e>
      ea0d83:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0d88:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0d8f:	00 
      ea0d90:	e8 8b d1 02 00       	call   ecdf20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95336>
      ea0d95:	eb 67                	jmp    ea0dfe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68214>
      ea0d97:	48 89 c3             	mov    rbx,rax
      ea0d9a:	48 8b bc 24 d0 11 00 	mov    rdi,QWORD PTR [rsp+0x11d0]
      ea0da1:	00 
      ea0da2:	e8 df d6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0da7:	48 8b bc 24 c0 11 00 	mov    rdi,QWORD PTR [rsp+0x11c0]
      ea0dae:	00 
      ea0daf:	e8 d2 d6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0db4:	4c 89 ff             	mov    rdi,r15
      ea0db7:	e8 ae 91 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0dbc:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
      ea0dc1:	eb 05                	jmp    ea0dc8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x681de>
      ea0dc3:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0dc8:	4c 89 ef             	mov    rdi,r13
      ea0dcb:	e8 9a 91 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0dd0:	eb 05                	jmp    ea0dd7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x681ed>
      ea0dd2:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0dd7:	48 8b bc 24 98 10 00 	mov    rdi,QWORD PTR [rsp+0x1098]
      ea0dde:	00 
      ea0ddf:	e8 a2 d6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0de4:	48 8b bc 24 88 10 00 	mov    rdi,QWORD PTR [rsp+0x1088]
      ea0deb:	00 
      ea0dec:	e8 95 d6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0df1:	48 8b bc 24 78 10 00 	mov    rdi,QWORD PTR [rsp+0x1078]
      ea0df8:	00 
      ea0df9:	e8 88 d6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0dfe:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]

## Last direct writes before inner copy 0xea0013
### slot 0x8d8
- 0xe9fe94: movdqu XMMWORD PTR [rsp+0x8d8],xmm0
      e9fe6f:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
      e9fe72:	41 0f 11 87 b8 00 00 	movups XMMWORD PTR [r15+0xb8],xmm0
      e9fe79:	00 
      e9fe7a:	48 85 c0             	test   rax,rax
      e9fe7d:	74 05                	je     e9fe84 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6729a>
      e9fe7f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9fe84:	48 8b 8c 24 70 12 00 	mov    rcx,QWORD PTR [rsp+0x1270]
      e9fe8b:	00 
      e9fe8c:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e9fe90:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      e9fe94:	f3 0f 7f 84 24 d8 08 	movdqu XMMWORD PTR [rsp+0x8d8],xmm0
      e9fe9b:	00 00 
      e9fe9d:	48 85 c0             	test   rax,rax
      e9fea0:	74 05                	je     e9fea7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x672bd>
      e9fea2:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9fea7:	4c 8d bc 24 e8 08 00 	lea    r15,[rsp+0x8e8]
      e9feae:	00 
      e9feaf:	48 8d b4 24 b0 03 00 	lea    rsi,[rsp+0x3b0]
      e9feb6:	00 
      e9feb7:	4c 89 ff             	mov    rdi,r15
      e9feba:	e8 81 e0 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9febf:	4c 89 ac 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],r13
      e9fec6:	00 
      e9fec7:	48 8b 8c 24 70 13 00 	mov    rcx,QWORD PTR [rsp+0x1370]
      e9fece:	00 
      e9fecf:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e9fed3:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]

### slot 0x8e0

## Last direct writes before outer pointer read 0xea014f
### slot 0x1270

## Aliases to interesting stack pairs
## High-address constants within 0x500 before target copies
### target 0xea0013
- 0xe9fc03: lea    rax,[rip+0x991cd6]        # 18318e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3878> -> 0x18318e0
- 0xe9fd03: lea    rax,[rip+0x991c0e]        # 1831918 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38b0> -> 0x1831918
- 0xe9fd24: lea    rax,[rip+0x991c35]        # 1831960 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38f8> -> 0x1831960
- 0xe9ff24: lea    rax,[rip+0x9944ed]        # 1834418 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x63b0> -> 0x1834418

### target 0xea014f
- 0xe9fd03: lea    rax,[rip+0x991c0e]        # 1831918 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38b0> -> 0x1831918
- 0xe9fd24: lea    rax,[rip+0x991c35]        # 1831960 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38f8> -> 0x1831960
- 0xe9ff24: lea    rax,[rip+0x9944ed]        # 1834418 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x63b0> -> 0x1834418

### target 0xea02ce
- 0xe9ff24: lea    rax,[rip+0x9944ed]        # 1834418 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x63b0> -> 0x1834418
- 0xea01e4: lea    rax,[rip+0x99453d]        # 1834728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x66c0> -> 0x1834728

## Candidate pair-copy producers
### producer @0xe9fe90: movdqu xmm0,XMMWORD PTR [rcx]
      e9fe4f:	ba b0 00 00 00       	mov    edx,0xb0
      e9fe54:	4c 89 ff             	mov    rdi,r15
      e9fe57:	e8 74 fc 94 00       	call   17efad0 <memcpy@plt>
      e9fe5c:	4d 89 a7 b0 00 00 00 	mov    QWORD PTR [r15+0xb0],r12
      e9fe63:	48 8b 8c 24 90 12 00 	mov    rcx,QWORD PTR [rsp+0x1290]
      e9fe6a:	00 
      e9fe6b:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e9fe6f:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
      e9fe72:	41 0f 11 87 b8 00 00 	movups XMMWORD PTR [r15+0xb8],xmm0
      e9fe79:	00 
      e9fe7a:	48 85 c0             	test   rax,rax
      e9fe7d:	74 05                	je     e9fe84 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6729a>
      e9fe7f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9fe84:	48 8b 8c 24 70 12 00 	mov    rcx,QWORD PTR [rsp+0x1270]
      e9fe8b:	00 
      e9fe8c:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e9fe90:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      e9fe94:	f3 0f 7f 84 24 d8 08 	movdqu XMMWORD PTR [rsp+0x8d8],xmm0
      e9fe9b:	00 00 
      e9fe9d:	48 85 c0             	test   rax,rax
      e9fea0:	74 05                	je     e9fea7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x672bd>
      e9fea2:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9fea7:	4c 8d bc 24 e8 08 00 	lea    r15,[rsp+0x8e8]
      e9feae:	00 
      e9feaf:	48 8d b4 24 b0 03 00 	lea    rsi,[rsp+0x3b0]
      e9feb6:	00 
      e9feb7:	4c 89 ff             	mov    rdi,r15
      e9feba:	e8 81 e0 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9febf:	4c 89 ac 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],r13
      e9fec6:	00 
      e9fec7:	48 8b 8c 24 70 13 00 	mov    rcx,QWORD PTR [rsp+0x1370]
      e9fece:	00 
      e9fecf:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e9fed3:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      e9fed7:	66 0f 7f 84 24 00 09 	movdqa XMMWORD PTR [rsp+0x900],xmm0
      e9fede:	00 00 
      e9fee0:	48 85 c0             	test   rax,rax
      e9fee3:	74 05                	je     e9feea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67300>
      e9fee5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9feea:	48 83 a4 24 50 0b 00 	and    QWORD PTR [rsp+0xb50],0x0
      e9fef1:	00 00 

### producer @0xea015b: movdqu xmm0,XMMWORD PTR [rcx]
      ea011a:	00 
      ea011b:	e8 b0 f9 94 00       	call   17efad0 <memcpy@plt>
      ea0120:	48 8b 84 24 90 13 00 	mov    rax,QWORD PTR [rsp+0x1390]
      ea0127:	00 
      ea0128:	48 89 83 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],rax
      ea012f:	48 8b 8c 24 90 12 00 	mov    rcx,QWORD PTR [rsp+0x1290]
      ea0136:	00 
      ea0137:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      ea013b:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
      ea013e:	0f 11 83 b8 00 00 00 	movups XMMWORD PTR [rbx+0xb8],xmm0
      ea0145:	48 85 c0             	test   rax,rax
      ea0148:	74 05                	je     ea014f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67565>
      ea014a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea014f:	48 8b 8c 24 70 12 00 	mov    rcx,QWORD PTR [rsp+0x1270]
      ea0156:	00 
      ea0157:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      ea015b:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      ea015f:	f3 0f 7f 84 24 c8 11 	movdqu XMMWORD PTR [rsp+0x11c8],xmm0
      ea0166:	00 00 
      ea0168:	48 85 c0             	test   rax,rax
      ea016b:	74 05                	je     ea0172 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67588>
      ea016d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea0172:	48 8d bc 24 d8 11 00 	lea    rdi,[rsp+0x11d8]
      ea0179:	00 
      ea017a:	48 8d b4 24 b0 03 00 	lea    rsi,[rsp+0x3b0]
      ea0181:	00 
      ea0182:	e8 b9 dd 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ea0187:	48 8b 8c 24 70 13 00 	mov    rcx,QWORD PTR [rsp+0x1370]
      ea018e:	00 
      ea018f:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      ea0193:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      ea0197:	66 0f 7f 84 24 f0 11 	movdqa XMMWORD PTR [rsp+0x11f0],xmm0
      ea019e:	00 00 
      ea01a0:	48 85 c0             	test   rax,rax
      ea01a3:	74 05                	je     ea01aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x675c0>
      ea01a5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea01aa:	48 83 a4 24 f0 0e 00 	and    QWORD PTR [rsp+0xef0],0x0
      ea01b1:	00 00 
      ea01b3:	bf b0 01 00 00       	mov    edi,0x1b0
      ea01b8:	e8 43 dd 94 00       	call   17edf00 <_Znwm@plt>
      ea01bd:	49 89 c4             	mov    r12,rax

## Plausible APs around relevant high constants and +0x140
### AP 0x18318c0: codeSlots=28, +0x140=0xad6470, FDE=(11363440, 11363449)
      ad644c:	e8 7f 98 f9 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ad6451:	e8 5a 96 d1 00       	call   17efab0 <__stack_chk_fail@plt>
      ad6456:	48 8d 47 10          	lea    rax,[rdi+0x10]
      ad645a:	48 8d 0d 0f ab d2 00 	lea    rcx,[rip+0xd2ab0f]        # 1800f70 <_ZTIN4asio22service_already_existsE@@Base+0x2758>
      ad6461:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      ad6464:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
      ad6468:	48 89 c6             	mov    rsi,rax
      ad646b:	e9 20 3e fa ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ad6470:	48 83 c7 10          	add    rdi,0x10
      ad6474:	e9 f1 3a fa ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
      ad6479:	cc                   	int3
      ad647a:	53                   	push   rbx
      ad647b:	48 89 fb             	mov    rbx,rdi
      ad647e:	48 83 c7 10          	add    rdi,0x10
      ad6482:	e8 e3 3a fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ad6487:	48 89 df             	mov    rdi,rbx
      ad648a:	5b                   	pop    rbx
      ad648b:	e9 90 7a d1 00       	jmp    17edf20 <_ZdlPv@plt>
      ad6490:	41 57                	push   r15
      ad6492:	41 56                	push   r14
      ad6494:	41 55                	push   r13
      ad6496:	41 54                	push   r12
      ad6498:	53                   	push   rbx
      ad6499:	48 81 ec 60 01 00 00 	sub    rsp,0x160
      ad64a0:	4d 89 cf             	mov    r15,r9
      ad64a3:	4d 89 c4             	mov    r12,r8
      ad64a6:	49 89 f6             	mov    r14,rsi
      ad64a9:	48 89 fb             	mov    rbx,rdi
      ad64ac:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ad64b3:	00 00 
      ad64b5:	48 89 84 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rax
      ad64bc:	00 
      ad64bd:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
      ad64c2:	4c 89 ef             	mov    rdi,r13
      ad64c5:	48 89 ce             	mov    rsi,rcx
      ad64c8:	e8 a3 af b2 00       	call   1601470 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4469f4>
      ad64cd:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]

### AP 0x18318c8: codeSlots=29, +0x140=0xad647a, FDE=(11363450, 11363472)
      ad645a:	48 8d 0d 0f ab d2 00 	lea    rcx,[rip+0xd2ab0f]        # 1800f70 <_ZTIN4asio22service_already_existsE@@Base+0x2758>
      ad6461:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      ad6464:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
      ad6468:	48 89 c6             	mov    rsi,rax
      ad646b:	e9 20 3e fa ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ad6470:	48 83 c7 10          	add    rdi,0x10
      ad6474:	e9 f1 3a fa ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
      ad6479:	cc                   	int3
      ad647a:	53                   	push   rbx
      ad647b:	48 89 fb             	mov    rbx,rdi
      ad647e:	48 83 c7 10          	add    rdi,0x10
      ad6482:	e8 e3 3a fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ad6487:	48 89 df             	mov    rdi,rbx
      ad648a:	5b                   	pop    rbx
      ad648b:	e9 90 7a d1 00       	jmp    17edf20 <_ZdlPv@plt>
      ad6490:	41 57                	push   r15
      ad6492:	41 56                	push   r14
      ad6494:	41 55                	push   r13
      ad6496:	41 54                	push   r12
      ad6498:	53                   	push   rbx
      ad6499:	48 81 ec 60 01 00 00 	sub    rsp,0x160
      ad64a0:	4d 89 cf             	mov    r15,r9
      ad64a3:	4d 89 c4             	mov    r12,r8
      ad64a6:	49 89 f6             	mov    r14,rsi
      ad64a9:	48 89 fb             	mov    rbx,rdi
      ad64ac:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ad64b3:	00 00 
      ad64b5:	48 89 84 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rax
      ad64bc:	00 
      ad64bd:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
      ad64c2:	4c 89 ef             	mov    rdi,r13
      ad64c5:	48 89 ce             	mov    rsi,rcx
      ad64c8:	e8 a3 af b2 00       	call   1601470 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4469f4>
      ad64cd:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
      ad64d4:	00 
      ad64d5:	4c 89 e6             	mov    rsi,r12
      ad64d8:	e8 29 01 00 00       	call   ad6606 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x235a6>

### AP 0x18318d0: codeSlots=29, +0x140=0xe99382, FDE=(15307650, 15307659)
      e9935e:	e8 6d 69 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      e99363:	e8 48 67 95 00       	call   17efab0 <__stack_chk_fail@plt>
      e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]
      e9936c:	48 8d 0d 6d 86 99 00 	lea    rcx,[rip+0x99866d]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
      e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
      e9937a:	48 89 c6             	mov    rsi,rax
      e9937d:	e9 0e 0f be ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
      e99386:	e9 d7 10 be ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
      e9938b:	cc                   	int3
      e9938c:	48 8d 05 15 86 99 00 	lea    rax,[rip+0x998615]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>
      e99393:	48 89 07             	mov    QWORD PTR [rdi],rax
      e99396:	e9 75 4c 95 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e9939b:	cc                   	int3
      e9939c:	53                   	push   rbx
      e9939d:	48 89 fb             	mov    rbx,rdi
      e993a0:	e8 e7 ff ff ff       	call   e9938c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607a2>
      e993a5:	48 89 df             	mov    rdi,rbx
      e993a8:	5b                   	pop    rbx
      e993a9:	e9 72 4b 95 00       	jmp    17edf20 <_ZdlPv@plt>
      e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
      e993b2:	48 83 c7 20          	add    rdi,0x20
      e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
      e993b9:	41 57                	push   r15
      e993bb:	41 56                	push   r14
      e993bd:	41 54                	push   r12
      e993bf:	53                   	push   rbx
      e993c0:	50                   	push   rax
      e993c1:	49 89 d6             	mov    r14,rdx
      e993c4:	48 89 f3             	mov    rbx,rsi
      e993c7:	6a 05                	push   0x5
      e993c9:	41 5f                	pop    r15
      e993cb:	49 89 fc             	mov    r12,rdi
      e993ce:	48 39 df             	cmp    rdi,rbx
      e993d1:	74 17                	je     e993ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60800>
      e993d3:	4c 89 e7             	mov    rdi,r12

### AP 0x18318e8: codeSlots=29, +0x140=0x9d7de0, FDE=(10321376, 10321377)
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

### AP 0x18318f0: codeSlots=29, +0x140=0xa50370, FDE=(10814320, 10814325)
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

### AP 0x18318f8: codeSlots=29, +0x140=0xe9926a, FDE=(15307370, 15307400)
      e99250:	75 0a                	jne    e9925c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60672>
      e99252:	48 83 c4 20          	add    rsp,0x20
      e99256:	5b                   	pop    rbx
      e99257:	e9 2a 52 c0 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9925c:	e8 4f 68 95 00       	call   17efab0 <__stack_chk_fail@plt>
      e99261:	48 89 c7             	mov    rdi,rax
      e99264:	e8 3c 08 be ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      e99269:	cc                   	int3
      e9926a:	53                   	push   rbx
      e9926b:	48 89 fb             	mov    rbx,rdi
      e9926e:	6a 10                	push   0x10
      e99270:	5f                   	pop    rdi
      e99271:	e8 8a 4c 95 00       	call   17edf00 <_Znwm@plt>
      e99276:	48 8d 0d ab 87 99 00 	lea    rcx,[rip+0x9987ab]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
      e9927d:	48 89 08             	mov    QWORD PTR [rax],rcx
      e99280:	8a 4b 08             	mov    cl,BYTE PTR [rbx+0x8]
      e99283:	88 48 08             	mov    BYTE PTR [rax+0x8],cl
      e99286:	5b                   	pop    rbx
      e99287:	c3                   	ret
      e99288:	48 8d 05 99 87 99 00 	lea    rax,[rip+0x998799]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
      e9928f:	48 89 06             	mov    QWORD PTR [rsi],rax
      e99292:	8a 47 08             	mov    al,BYTE PTR [rdi+0x8]
      e99295:	88 46 08             	mov    BYTE PTR [rsi+0x8],al
      e99298:	c3                   	ret
      e99299:	cc                   	int3
      e9929a:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0
      e9929e:	0f 94 c0             	sete   al
      e992a1:	c3                   	ret
      e992a2:	48 8d 05 37 87 99 00 	lea    rax,[rip+0x998737]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
      e992a9:	48 89 07             	mov    QWORD PTR [rdi],rax
      e992ac:	48 83 c7 10          	add    rdi,0x10
      e992b0:	e9 b5 0c be ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
      e992b5:	cc                   	int3
      e992b6:	53                   	push   rbx
      e992b7:	48 89 fb             	mov    rbx,rdi
      e992ba:	e8 e3 ff ff ff       	call   e992a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x606b8>
      e992bf:	48 89 df             	mov    rdi,rbx

### AP 0x1831900: codeSlots=30, +0x140=0xe99288, FDE=(15307400, 15307417)
      e99270:	5f                   	pop    rdi
      e99271:	e8 8a 4c 95 00       	call   17edf00 <_Znwm@plt>
      e99276:	48 8d 0d ab 87 99 00 	lea    rcx,[rip+0x9987ab]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
      e9927d:	48 89 08             	mov    QWORD PTR [rax],rcx
      e99280:	8a 4b 08             	mov    cl,BYTE PTR [rbx+0x8]
      e99283:	88 48 08             	mov    BYTE PTR [rax+0x8],cl
      e99286:	5b                   	pop    rbx
      e99287:	c3                   	ret
      e99288:	48 8d 05 99 87 99 00 	lea    rax,[rip+0x998799]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
      e9928f:	48 89 06             	mov    QWORD PTR [rsi],rax
      e99292:	8a 47 08             	mov    al,BYTE PTR [rdi+0x8]
      e99295:	88 46 08             	mov    BYTE PTR [rsi+0x8],al
      e99298:	c3                   	ret
      e99299:	cc                   	int3
      e9929a:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0
      e9929e:	0f 94 c0             	sete   al
      e992a1:	c3                   	ret
      e992a2:	48 8d 05 37 87 99 00 	lea    rax,[rip+0x998737]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
      e992a9:	48 89 07             	mov    QWORD PTR [rdi],rax
      e992ac:	48 83 c7 10          	add    rdi,0x10
      e992b0:	e9 b5 0c be ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
      e992b5:	cc                   	int3
      e992b6:	53                   	push   rbx
      e992b7:	48 89 fb             	mov    rbx,rdi
      e992ba:	e8 e3 ff ff ff       	call   e992a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x606b8>
      e992bf:	48 89 df             	mov    rdi,rbx
      e992c2:	5b                   	pop    rbx
      e992c3:	e9 58 4c 95 00       	jmp    17edf20 <_ZdlPv@plt>
      e992c8:	41 56                	push   r14
      e992ca:	53                   	push   rbx
      e992cb:	48 83 ec 28          	sub    rsp,0x28
      e992cf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e992d6:	00 00 
      e992d8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      e992dd:	4c 8d 77 10          	lea    r14,[rdi+0x10]
      e992e1:	6a 40                	push   0x40
      e992e3:	5f                   	pop    rdi

### AP 0x1831908: codeSlots=30, +0x140=0x9d7de0, FDE=(10321376, 10321377)
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

### AP 0x1831910: codeSlots=31, +0x140=0xa50370, FDE=(10814320, 10814325)
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

### AP 0x1831918: codeSlots=32, +0x140=0xe9929a, FDE=(15307418, 15307426)
      e99286:	5b                   	pop    rbx
      e99287:	c3                   	ret
      e99288:	48 8d 05 99 87 99 00 	lea    rax,[rip+0x998799]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
      e9928f:	48 89 06             	mov    QWORD PTR [rsi],rax
      e99292:	8a 47 08             	mov    al,BYTE PTR [rdi+0x8]
      e99295:	88 46 08             	mov    BYTE PTR [rsi+0x8],al
      e99298:	c3                   	ret
      e99299:	cc                   	int3
      e9929a:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0
      e9929e:	0f 94 c0             	sete   al
      e992a1:	c3                   	ret
      e992a2:	48 8d 05 37 87 99 00 	lea    rax,[rip+0x998737]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
      e992a9:	48 89 07             	mov    QWORD PTR [rdi],rax
      e992ac:	48 83 c7 10          	add    rdi,0x10
      e992b0:	e9 b5 0c be ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
      e992b5:	cc                   	int3
      e992b6:	53                   	push   rbx
      e992b7:	48 89 fb             	mov    rbx,rdi
      e992ba:	e8 e3 ff ff ff       	call   e992a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x606b8>
      e992bf:	48 89 df             	mov    rdi,rbx
      e992c2:	5b                   	pop    rbx
      e992c3:	e9 58 4c 95 00       	jmp    17edf20 <_ZdlPv@plt>
      e992c8:	41 56                	push   r14
      e992ca:	53                   	push   rbx
      e992cb:	48 83 ec 28          	sub    rsp,0x28
      e992cf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e992d6:	00 00 
      e992d8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      e992dd:	4c 8d 77 10          	lea    r14,[rdi+0x10]
      e992e1:	6a 40                	push   0x40
      e992e3:	5f                   	pop    rdi
      e992e4:	e8 17 4c 95 00       	call   17edf00 <_Znwm@plt>
      e992e9:	48 89 c3             	mov    rbx,rax
      e992ec:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      e992f0:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
      e992f5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e992fa:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1

### AP 0x1831930: codeSlots=30, +0x140=0xeaaf4c, FDE=(15380300, 15380315)
      eaaf32:	e8 e7 ff ff ff       	call   eaaf1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72334>
      eaaf37:	48 89 df             	mov    rdi,rbx
      eaaf3a:	5b                   	pop    rbx
      eaaf3b:	e9 e0 2f 94 00       	jmp    17edf20 <_ZdlPv@plt>
      eaaf40:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
      eaaf44:	48 83 c7 18          	add    rdi,0x18
      eaaf48:	ff 60 10             	jmp    QWORD PTR [rax+0x10]
      eaaf4b:	cc                   	int3
      eaaf4c:	48 8d 05 1d 6b 98 00 	lea    rax,[rip+0x986b1d]        # 1831a70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a08>
      eaaf53:	48 89 07             	mov    QWORD PTR [rdi],rax
      eaaf56:	e9 b5 30 94 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      eaaf5b:	cc                   	int3
      eaaf5c:	53                   	push   rbx
      eaaf5d:	48 89 fb             	mov    rbx,rdi
      eaaf60:	e8 e7 ff ff ff       	call   eaaf4c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72362>
      eaaf65:	48 89 df             	mov    rdi,rbx
      eaaf68:	5b                   	pop    rbx
      eaaf69:	e9 b2 2f 94 00       	jmp    17edf20 <_ZdlPv@plt>
      eaaf6e:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
      eaaf72:	48 83 c7 18          	add    rdi,0x18
      eaaf76:	ff 60 20             	jmp    QWORD PTR [rax+0x20]
      eaaf79:	cc                   	int3
      eaaf7a:	48 8d 05 17 6c 98 00 	lea    rax,[rip+0x986c17]        # 1831b98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3b30>
      eaaf81:	48 89 07             	mov    QWORD PTR [rdi],rax
      eaaf84:	e9 87 30 94 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      eaaf89:	cc                   	int3
      eaaf8a:	53                   	push   rbx
      eaaf8b:	48 89 fb             	mov    rbx,rdi
      eaaf8e:	e8 e7 ff ff ff       	call   eaaf7a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72390>
      eaaf93:	48 89 df             	mov    rdi,rbx
      eaaf96:	5b                   	pop    rbx
      eaaf97:	e9 84 2f 94 00       	jmp    17edf20 <_ZdlPv@plt>
      eaaf9c:	48 83 c7 18          	add    rdi,0x18
      eaafa0:	e9 01 00 00 00       	jmp    eaafa6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x723bc>
      eaafa5:	cc                   	int3
      eaafa6:	41 57                	push   r15
      eaafa8:	41 56                	push   r14

### AP 0x1831938: codeSlots=30, +0x140=0xeaaf5c, FDE=(15380316, 15380334)
      eaaf40:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
      eaaf44:	48 83 c7 18          	add    rdi,0x18
      eaaf48:	ff 60 10             	jmp    QWORD PTR [rax+0x10]
      eaaf4b:	cc                   	int3
      eaaf4c:	48 8d 05 1d 6b 98 00 	lea    rax,[rip+0x986b1d]        # 1831a70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a08>
      eaaf53:	48 89 07             	mov    QWORD PTR [rdi],rax
      eaaf56:	e9 b5 30 94 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      eaaf5b:	cc                   	int3
      eaaf5c:	53                   	push   rbx
      eaaf5d:	48 89 fb             	mov    rbx,rdi
      eaaf60:	e8 e7 ff ff ff       	call   eaaf4c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72362>
      eaaf65:	48 89 df             	mov    rdi,rbx
      eaaf68:	5b                   	pop    rbx
      eaaf69:	e9 b2 2f 94 00       	jmp    17edf20 <_ZdlPv@plt>
      eaaf6e:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
      eaaf72:	48 83 c7 18          	add    rdi,0x18
      eaaf76:	ff 60 20             	jmp    QWORD PTR [rax+0x20]
      eaaf79:	cc                   	int3
      eaaf7a:	48 8d 05 17 6c 98 00 	lea    rax,[rip+0x986c17]        # 1831b98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3b30>
      eaaf81:	48 89 07             	mov    QWORD PTR [rdi],rax
      eaaf84:	e9 87 30 94 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      eaaf89:	cc                   	int3
      eaaf8a:	53                   	push   rbx
      eaaf8b:	48 89 fb             	mov    rbx,rdi
      eaaf8e:	e8 e7 ff ff ff       	call   eaaf7a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72390>
      eaaf93:	48 89 df             	mov    rdi,rbx
      eaaf96:	5b                   	pop    rbx
      eaaf97:	e9 84 2f 94 00       	jmp    17edf20 <_ZdlPv@plt>
      eaaf9c:	48 83 c7 18          	add    rdi,0x18
      eaafa0:	e9 01 00 00 00       	jmp    eaafa6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x723bc>
      eaafa5:	cc                   	int3
      eaafa6:	41 57                	push   r15
      eaafa8:	41 56                	push   r14
      eaafaa:	53                   	push   rbx
      eaafab:	48 89 fb             	mov    rbx,rdi
      eaafae:	e8 3b 00 00 00       	call   eaafee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72404>
      eaafb3:	4c 8b 73 08          	mov    r14,QWORD PTR [rbx+0x8]

### AP 0x1831940: codeSlots=30, +0x140=0xeaaf6e, FDE=(15380334, 15380345)
      eaaf56:	e9 b5 30 94 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      eaaf5b:	cc                   	int3
      eaaf5c:	53                   	push   rbx
      eaaf5d:	48 89 fb             	mov    rbx,rdi
      eaaf60:	e8 e7 ff ff ff       	call   eaaf4c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72362>
      eaaf65:	48 89 df             	mov    rdi,rbx
      eaaf68:	5b                   	pop    rbx
      eaaf69:	e9 b2 2f 94 00       	jmp    17edf20 <_ZdlPv@plt>
      eaaf6e:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
      eaaf72:	48 83 c7 18          	add    rdi,0x18
      eaaf76:	ff 60 20             	jmp    QWORD PTR [rax+0x20]
      eaaf79:	cc                   	int3
      eaaf7a:	48 8d 05 17 6c 98 00 	lea    rax,[rip+0x986c17]        # 1831b98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3b30>
      eaaf81:	48 89 07             	mov    QWORD PTR [rdi],rax
      eaaf84:	e9 87 30 94 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      eaaf89:	cc                   	int3
      eaaf8a:	53                   	push   rbx
      eaaf8b:	48 89 fb             	mov    rbx,rdi
      eaaf8e:	e8 e7 ff ff ff       	call   eaaf7a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72390>
      eaaf93:	48 89 df             	mov    rdi,rbx
      eaaf96:	5b                   	pop    rbx
      eaaf97:	e9 84 2f 94 00       	jmp    17edf20 <_ZdlPv@plt>
      eaaf9c:	48 83 c7 18          	add    rdi,0x18
      eaafa0:	e9 01 00 00 00       	jmp    eaafa6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x723bc>
      eaafa5:	cc                   	int3
      eaafa6:	41 57                	push   r15
      eaafa8:	41 56                	push   r14
      eaafaa:	53                   	push   rbx
      eaafab:	48 89 fb             	mov    rbx,rdi
      eaafae:	e8 3b 00 00 00       	call   eaafee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72404>
      eaafb3:	4c 8b 73 08          	mov    r14,QWORD PTR [rbx+0x8]
      eaafb7:	4c 8b 7b 10          	mov    r15,QWORD PTR [rbx+0x10]
      eaafbb:	4d 39 fe             	cmp    r14,r15
      eaafbe:	74 0e                	je     eaafce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x723e4>
      eaafc0:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      eaafc3:	e8 58 2f 94 00       	call   17edf20 <_ZdlPv@plt>
      eaafc8:	49 83 c6 08          	add    r14,0x8

### AP 0x1831950: codeSlots=29, +0x140=0xa50370, FDE=(10814320, 10814325)
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

### AP 0x1831968: codeSlots=29, +0x140=0x9d7de0, FDE=(10321376, 10321377)
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

### AP 0x1831970: codeSlots=29, +0x140=0xa50370, FDE=(10814320, 10814325)
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

### AP 0x1831978: codeSlots=29, +0x140=0xeaba9e, FDE=(15383198, 15383414)
      eaba84:	e8 e7 ff ff ff       	call   eaba70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72e86>
      eaba89:	48 89 df             	mov    rdi,rbx
      eaba8c:	5b                   	pop    rbx
      eaba8d:	e9 8e 24 94 00       	jmp    17edf20 <_ZdlPv@plt>
      eaba92:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
      eaba96:	48 83 c7 20          	add    rdi,0x20
      eaba9a:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
      eaba9d:	cc                   	int3
      eaba9e:	41 57                	push   r15
      eabaa0:	41 56                	push   r14
      eabaa2:	41 54                	push   r12
      eabaa4:	53                   	push   rbx
      eabaa5:	48 81 ec 88 00 00 00 	sub    rsp,0x88
      eabaac:	48 89 fb             	mov    rbx,rdi
      eabaaf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      eabab6:	00 00 
      eabab8:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
      eababf:	00 
      eabac0:	4c 8b 76 08          	mov    r14,QWORD PTR [rsi+0x8]
      eabac4:	49 89 e7             	mov    r15,rsp
      eabac7:	4c 89 ff             	mov    rdi,r15
      eabaca:	48 89 d6             	mov    rsi,rdx
      eabacd:	e8 68 ec 92 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
      eabad2:	48 8d 35 86 f2 d8 ff 	lea    rsi,[rip+0xffffffffffd8f286]        # c3ad5f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x187cff>
      eabad9:	48 8d 15 a6 da cb ff 	lea    rdx,[rip+0xffffffffffcbdaa6]        # b69586 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb6526>
      eabae0:	48 8d 0d 01 02 00 00 	lea    rcx,[rip+0x201]        # eabce8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x730fe>
      eabae7:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
      eabaec:	6a 40                	push   0x40
      eabaee:	41 59                	pop    r9
      eabaf0:	4c 89 e7             	mov    rdi,r12
      eabaf3:	4d 89 f8             	mov    r8,r15
      eabaf6:	e8 99 ec 92 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      eabafb:	49 8b 06             	mov    rax,QWORD PTR [r14]
      eabafe:	48 89 df             	mov    rdi,rbx
      eabb01:	4c 89 f6             	mov    rsi,r14
      eabb04:	4c 89 e2             	mov    rdx,r12
      eabb07:	ff 50 40             	call   QWORD PTR [rax+0x40]

### AP 0x1831980: codeSlots=29, +0x140=0xeabb76, FDE=(15383414, 15383630)
      eabb56:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      eabb5d:	00 00 
      eabb5f:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
      eabb66:	00 
      eabb67:	75 08                	jne    eabb71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72f87>
      eabb69:	48 89 df             	mov    rdi,rbx
      eabb6c:	e8 5f 41 bc ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      eabb71:	e8 3a 3f 94 00       	call   17efab0 <__stack_chk_fail@plt>
      eabb76:	41 57                	push   r15
      eabb78:	41 56                	push   r14
      eabb7a:	41 54                	push   r12
      eabb7c:	53                   	push   rbx
      eabb7d:	48 81 ec 88 00 00 00 	sub    rsp,0x88
      eabb84:	48 89 fb             	mov    rbx,rdi
      eabb87:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      eabb8e:	00 00 
      eabb90:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
      eabb97:	00 
      eabb98:	4c 8b 76 08          	mov    r14,QWORD PTR [rsi+0x8]
      eabb9c:	49 89 e7             	mov    r15,rsp
      eabb9f:	4c 89 ff             	mov    rdi,r15
      eabba2:	48 89 d6             	mov    rsi,rdx
      eabba5:	e8 90 eb 92 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
      eabbaa:	48 8d 35 ae f1 d8 ff 	lea    rsi,[rip+0xffffffffffd8f1ae]        # c3ad5f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x187cff>
      eabbb1:	48 8d 15 ce d9 cb ff 	lea    rdx,[rip+0xffffffffffcbd9ce]        # b69586 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb6526>
      eabbb8:	48 8d 0d a5 00 00 00 	lea    rcx,[rip+0xa5]        # eabc64 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7307a>
      eabbbf:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
      eabbc4:	6a 40                	push   0x40
      eabbc6:	41 59                	pop    r9
      eabbc8:	4c 89 e7             	mov    rdi,r12
      eabbcb:	4d 89 f8             	mov    r8,r15
      eabbce:	e8 c1 eb 92 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      eabbd3:	49 8b 06             	mov    rax,QWORD PTR [r14]
      eabbd6:	48 89 df             	mov    rdi,rbx
      eabbd9:	4c 89 f6             	mov    rsi,r14
      eabbdc:	4c 89 e2             	mov    rdx,r12
      eabbdf:	ff 50 38             	call   QWORD PTR [rax+0x38]

### AP 0x18343f8: codeSlots=32, +0x140=0x9d7de0, FDE=(10321376, 10321377)
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

### AP 0x1834400: codeSlots=33, +0x140=0x9d7de0, FDE=(10321376, 10321377)
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

### AP 0x1834408: codeSlots=34, +0x140=0x9d7de0, FDE=(10321376, 10321377)
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

### AP 0x1834410: codeSlots=35, +0x140=0xed2d36, FDE=(15543606, 15543611)
      ed2d16:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ed2d1d:	00 00 
      ed2d1f:	48 3b 84 24 08 01 00 	cmp    rax,QWORD PTR [rsp+0x108]
      ed2d26:	00 
      ed2d27:	75 08                	jne    ed2d31 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9a147>
      ed2d29:	48 89 df             	mov    rdi,rbx
      ed2d2c:	e8 9f cf b9 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ed2d31:	e8 7a cd 91 00       	call   17efab0 <__stack_chk_fail@plt>
      ed2d36:	e9 01 00 00 00       	jmp    ed2d3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9a152>
      ed2d3b:	cc                   	int3
      ed2d3c:	55                   	push   rbp
      ed2d3d:	41 57                	push   r15
      ed2d3f:	41 56                	push   r14
      ed2d41:	41 55                	push   r13
      ed2d43:	41 54                	push   r12
      ed2d45:	53                   	push   rbx
      ed2d46:	48 83 ec 78          	sub    rsp,0x78
      ed2d4a:	49 89 ce             	mov    r14,rcx
      ed2d4d:	48 89 fb             	mov    rbx,rdi
      ed2d50:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ed2d57:	00 00 
      ed2d59:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      ed2d5e:	8b 87 60 07 00 00    	mov    eax,DWORD PTR [rdi+0x760]
      ed2d64:	31 ed                	xor    ebp,ebp
      ed2d66:	ff c8                	dec    eax
      ed2d68:	83 f8 03             	cmp    eax,0x3
      ed2d6b:	0f 87 ef 00 00 00    	ja     ed2e60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9a276>
      ed2d71:	48 8d 0d 00 40 4c ff 	lea    rcx,[rip+0xffffffffff4c4000]        # 396d78 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x3959>
      ed2d78:	48 63 04 81          	movsxd rax,DWORD PTR [rcx+rax*4]
      ed2d7c:	48 01 c8             	add    rax,rcx
      ed2d7f:	ff e0                	jmp    rax
      ed2d81:	49 bc 00 00 00 00 01 	movabs r12,0x100000000
      ed2d88:	00 00 00 
      ed2d8b:	48 8d b3 68 07 00 00 	lea    rsi,[rbx+0x768]
      ed2d92:	4c 89 f7             	mov    rdi,r14
      ed2d95:	e8 54 c9 bc ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
      ed2d9a:	84 c0                	test   al,al

### AP 0x1834418: codeSlots=36, +0x140=0xed2d3c, FDE=(15543612, 15544571)
      ed2d1f:	48 3b 84 24 08 01 00 	cmp    rax,QWORD PTR [rsp+0x108]
      ed2d26:	00 
      ed2d27:	75 08                	jne    ed2d31 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9a147>
      ed2d29:	48 89 df             	mov    rdi,rbx
      ed2d2c:	e8 9f cf b9 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ed2d31:	e8 7a cd 91 00       	call   17efab0 <__stack_chk_fail@plt>
      ed2d36:	e9 01 00 00 00       	jmp    ed2d3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9a152>
      ed2d3b:	cc                   	int3
      ed2d3c:	55                   	push   rbp
      ed2d3d:	41 57                	push   r15
      ed2d3f:	41 56                	push   r14
      ed2d41:	41 55                	push   r13
      ed2d43:	41 54                	push   r12
      ed2d45:	53                   	push   rbx
      ed2d46:	48 83 ec 78          	sub    rsp,0x78
      ed2d4a:	49 89 ce             	mov    r14,rcx
      ed2d4d:	48 89 fb             	mov    rbx,rdi
      ed2d50:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ed2d57:	00 00 
      ed2d59:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      ed2d5e:	8b 87 60 07 00 00    	mov    eax,DWORD PTR [rdi+0x760]
      ed2d64:	31 ed                	xor    ebp,ebp
      ed2d66:	ff c8                	dec    eax
      ed2d68:	83 f8 03             	cmp    eax,0x3
      ed2d6b:	0f 87 ef 00 00 00    	ja     ed2e60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9a276>
      ed2d71:	48 8d 0d 00 40 4c ff 	lea    rcx,[rip+0xffffffffff4c4000]        # 396d78 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x3959>
      ed2d78:	48 63 04 81          	movsxd rax,DWORD PTR [rcx+rax*4]
      ed2d7c:	48 01 c8             	add    rax,rcx
      ed2d7f:	ff e0                	jmp    rax
      ed2d81:	49 bc 00 00 00 00 01 	movabs r12,0x100000000
      ed2d88:	00 00 00 
      ed2d8b:	48 8d b3 68 07 00 00 	lea    rsi,[rbx+0x768]
      ed2d92:	4c 89 f7             	mov    rdi,r14
      ed2d95:	e8 54 c9 bc ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
      ed2d9a:	84 c0                	test   al,al
      ed2d9c:	74 78                	je     ed2e16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9a22c>
      ed2d9e:	49 8d be 90 00 00 00 	lea    rdi,[r14+0x90]

### AP 0x1834420: codeSlots=36, +0x140=0x9d81d0, FDE=(10322384, 10322387)
      9d81c8:	cc                   	int3
      9d81c9:	cc                   	int3
      9d81ca:	cc                   	int3
      9d81cb:	cc                   	int3
      9d81cc:	cc                   	int3
      9d81cd:	cc                   	int3
      9d81ce:	cc                   	int3
      9d81cf:	cc                   	int3
      9d81d0:	31 c0                	xor    eax,eax
      9d81d2:	c3                   	ret
      9d81d3:	cc                   	int3
      9d81d4:	cc                   	int3
      9d81d5:	cc                   	int3
      9d81d6:	cc                   	int3
      9d81d7:	cc                   	int3
      9d81d8:	cc                   	int3
      9d81d9:	cc                   	int3
      9d81da:	cc                   	int3
      9d81db:	cc                   	int3
      9d81dc:	cc                   	int3
      9d81dd:	cc                   	int3
      9d81de:	cc                   	int3
      9d81df:	cc                   	int3
      9d81e0:	41 56                	push   r14
      9d81e2:	53                   	push   rbx
      9d81e3:	50                   	push   rax
      9d81e4:	48 89 f3             	mov    rbx,rsi
      9d81e7:	49 89 fe             	mov    r14,rdi
      9d81ea:	ba b8 06 00 00       	mov    edx,0x6b8
      9d81ef:	31 f6                	xor    esi,esi
      9d81f1:	e8 9a 69 e1 00       	call   17eeb90 <memset@plt>
      9d81f6:	48 8d 05 2b be e1 00 	lea    rax,[rip+0xe1be2b]        # 17f4028 <pthread_rwlock_wrlock@plt+0x3268>
      9d81fd:	49 89 06             	mov    QWORD PTR [r14],rax
      9d8200:	48 85 db             	test   rbx,rbx
      9d8203:	75 08                	jne    9d820d <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x3d>
      9d8205:	e8 96 08 00 00       	call   9d8aa0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x8d0>
      9d820a:	48 89 c3             	mov    rbx,rax

### AP 0x1834428: codeSlots=36, +0x140=0xed30fc, FDE=(15544572, 15544688)
      ed30de:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ed30e5:	00 00 
      ed30e7:	48 3b 44 24 70       	cmp    rax,QWORD PTR [rsp+0x70]
      ed30ec:	75 08                	jne    ed30f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9a50c>
      ed30ee:	48 89 df             	mov    rdi,rbx
      ed30f1:	e8 da cb b9 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ed30f6:	e8 b5 c9 91 00       	call   17efab0 <__stack_chk_fail@plt>
      ed30fb:	cc                   	int3
      ed30fc:	41 57                	push   r15
      ed30fe:	41 56                	push   r14
      ed3100:	53                   	push   rbx
      ed3101:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
      ed3106:	41 83 3f 04          	cmp    DWORD PTR [r15],0x4
      ed310a:	48 89 fb             	mov    rbx,rdi
      ed310d:	0f 95 87 70 06 00 00 	setne  BYTE PTR [rdi+0x670]
      ed3114:	83 bf 60 07 00 00 01 	cmp    DWORD PTR [rdi+0x760],0x1
      ed311b:	75 2e                	jne    ed314b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9a561>
      ed311d:	4d 89 c6             	mov    r14,r8
      ed3120:	48 83 c1 30          	add    rcx,0x30
      ed3124:	48 8d 35 e5 42 56 ff 	lea    rsi,[rip+0xffffffffff5642e5]        # 437410 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5ce5f>
      ed312b:	48 89 cf             	mov    rdi,rcx
      ed312e:	e8 51 75 fb ff       	call   e8a684 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51a9a>
      ed3133:	84 c0                	test   al,al
      ed3135:	75 14                	jne    ed314b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9a561>
      ed3137:	41 8a 46 08          	mov    al,BYTE PTR [r14+0x8]
      ed313b:	88 83 e8 09 00 00    	mov    BYTE PTR [rbx+0x9e8],al
      ed3141:	49 8b 06             	mov    rax,QWORD PTR [r14]
      ed3144:	48 89 83 e0 09 00 00 	mov    QWORD PTR [rbx+0x9e0],rax
      ed314b:	41 83 3f 04          	cmp    DWORD PTR [r15],0x4
      ed314f:	75 17                	jne    ed3168 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9a57e>
      ed3151:	8b 83 60 07 00 00    	mov    eax,DWORD PTR [rbx+0x760]
      ed3157:	ff c8                	dec    eax
      ed3159:	83 f8 01             	cmp    eax,0x1
      ed315c:	77 0a                	ja     ed3168 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9a57e>
      ed315e:	c7 83 60 07 00 00 03 	mov    DWORD PTR [rbx+0x760],0x3
      ed3165:	00 00 00 
      ed3168:	31 c0                	xor    eax,eax

### AP 0x1834430: codeSlots=36, +0x140=0x9d7de0, FDE=(10321376, 10321377)
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

### AP 0x1834438: codeSlots=36, +0x140=0xa5bbf0, FDE=(10861552, 10861557)
      a5bbe8:	cc                   	int3
      a5bbe9:	cc                   	int3
      a5bbea:	cc                   	int3
      a5bbeb:	cc                   	int3
      a5bbec:	cc                   	int3
      a5bbed:	cc                   	int3
      a5bbee:	cc                   	int3
      a5bbef:	cc                   	int3
      a5bbf0:	31 c0                	xor    eax,eax
      a5bbf2:	31 d2                	xor    edx,edx
      a5bbf4:	c3                   	ret
      a5bbf5:	cc                   	int3
      a5bbf6:	cc                   	int3
      a5bbf7:	cc                   	int3
      a5bbf8:	cc                   	int3
      a5bbf9:	cc                   	int3
      a5bbfa:	cc                   	int3
      a5bbfb:	cc                   	int3
      a5bbfc:	cc                   	int3
      a5bbfd:	cc                   	int3
      a5bbfe:	cc                   	int3
      a5bbff:	cc                   	int3
      a5bc00:	41 57                	push   r15
      a5bc02:	41 56                	push   r14
      a5bc04:	53                   	push   rbx
      a5bc05:	48 89 f3             	mov    rbx,rsi
      a5bc08:	49 89 fe             	mov    r14,rdi
      a5bc0b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      a5bc0e:	48 8b 4e 08          	mov    rcx,QWORD PTR [rsi+0x8]
      a5bc12:	48 8d 51 18          	lea    rdx,[rcx+0x18]
      a5bc16:	48 8b 76 10          	mov    rsi,QWORD PTR [rsi+0x10]
      a5bc1a:	48 39 f2             	cmp    rdx,rsi
      a5bc1d:	76 2d                	jbe    a5bc4c <__cxa_demangle@@Base+0x48ec>
      a5bc1f:	48 81 c1 f8 03 00 00 	add    rcx,0x3f8
      a5bc26:	48 01 f6             	add    rsi,rsi
      a5bc29:	48 39 ce             	cmp    rsi,rcx
      a5bc2c:	48 0f 46 f1          	cmovbe rsi,rcx

### AP 0x1834708: codeSlots=30, +0x140=0xea685a, FDE=(15362138, 15362203)
      ea6842:	e9 c9 77 94 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      ea6847:	cc                   	int3
      ea6848:	53                   	push   rbx
      ea6849:	48 89 fb             	mov    rbx,rdi
      ea684c:	e8 e7 ff ff ff       	call   ea6838 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6dc4e>
      ea6851:	48 89 df             	mov    rdi,rbx
      ea6854:	5b                   	pop    rbx
      ea6855:	e9 c6 76 94 00       	jmp    17edf20 <_ZdlPv@plt>
      ea685a:	53                   	push   rbx
      ea685b:	48 89 fb             	mov    rbx,rdi
      ea685e:	48 8b bf 38 01 00 00 	mov    rdi,QWORD PTR [rdi+0x138]
      ea6865:	e8 1c 7c bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea686a:	48 8d bb 18 01 00 00 	lea    rdi,[rbx+0x118]
      ea6871:	e8 1a 76 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea6876:	48 8d bb b8 00 00 00 	lea    rdi,[rbx+0xb8]
      ea687d:	e8 1a 00 00 00       	call   ea689c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6dcb2>
      ea6882:	48 8d bb 88 00 00 00 	lea    rdi,[rbx+0x88]
      ea6889:	e8 1a 64 ee ff       	call   d8cca8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59d2e>
      ea688e:	48 83 c3 30          	add    rbx,0x30
      ea6892:	48 89 df             	mov    rdi,rbx
      ea6895:	5b                   	pop    rbx
      ea6896:	e9 cb 35 93 00       	jmp    17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      ea689b:	cc                   	int3
      ea689c:	41 57                	push   r15
      ea689e:	41 56                	push   r14
      ea68a0:	53                   	push   rbx
      ea68a1:	48 89 fb             	mov    rbx,rdi
      ea68a4:	4c 8b 77 28          	mov    r14,QWORD PTR [rdi+0x28]
      ea68a8:	4d 85 f6             	test   r14,r14
      ea68ab:	74 1c                	je     ea68c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6dcdf>
      ea68ad:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
      ea68b0:	49 8d 7e 10          	lea    rdi,[r14+0x10]
      ea68b4:	e8 31 00 00 00       	call   ea68ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6dd00>
      ea68b9:	4c 89 f7             	mov    rdi,r14
      ea68bc:	e8 5f 76 94 00       	call   17edf20 <_ZdlPv@plt>
      ea68c1:	4d 89 fe             	mov    r14,r15
      ea68c4:	4d 85 ff             	test   r15,r15

### AP 0x1834718: codeSlots=29, +0x140=0xa50370, FDE=(10814320, 10814325)
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

### AP 0x1834730: codeSlots=29, +0x140=0xee9d98, FDE=(15637912, 15637931)
      ee9d80:	48 89 47 40          	mov    QWORD PTR [rdi+0x40],rax
      ee9d84:	48 8b 46 48          	mov    rax,QWORD PTR [rsi+0x48]
      ee9d88:	48 89 47 48          	mov    QWORD PTR [rdi+0x48],rax
      ee9d8c:	48 85 c0             	test   rax,rax
      ee9d8f:	74 05                	je     ee9d96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb11ac>
      ee9d91:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ee9d96:	c3                   	ret
      ee9d97:	cc                   	int3
      ee9d98:	48 8d 05 d1 aa 94 00 	lea    rax,[rip+0x94aad1]        # 1834870 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6808>
      ee9d9f:	48 89 07             	mov    QWORD PTR [rdi],rax
      ee9da2:	48 83 c7 08          	add    rdi,0x8
      ee9da6:	e9 bf df ff ff       	jmp    ee7d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaf180>
      ee9dab:	cc                   	int3
      ee9dac:	53                   	push   rbx
      ee9dad:	48 89 fb             	mov    rbx,rdi
      ee9db0:	e8 e3 ff ff ff       	call   ee9d98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb11ae>
      ee9db5:	48 89 df             	mov    rdi,rbx
      ee9db8:	5b                   	pop    rbx
      ee9db9:	e9 62 41 90 00       	jmp    17edf20 <_ZdlPv@plt>
      ee9dbe:	41 56                	push   r14
      ee9dc0:	53                   	push   rbx
      ee9dc1:	50                   	push   rax
      ee9dc2:	48 8d 5f 08          	lea    rbx,[rdi+0x8]
      ee9dc6:	6a 58                	push   0x58
      ee9dc8:	5f                   	pop    rdi
      ee9dc9:	e8 32 41 90 00       	call   17edf00 <_Znwm@plt>
      ee9dce:	49 89 c6             	mov    r14,rax
      ee9dd1:	48 8d 05 98 aa 94 00 	lea    rax,[rip+0x94aa98]        # 1834870 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6808>
      ee9dd8:	49 89 06             	mov    QWORD PTR [r14],rax
      ee9ddb:	49 8d 7e 08          	lea    rdi,[r14+0x8]
      ee9ddf:	48 89 de             	mov    rsi,rbx
      ee9de2:	e8 41 ff ff ff       	call   ee9d28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb113e>
      ee9de7:	4c 89 f0             	mov    rax,r14
      ee9dea:	48 83 c4 08          	add    rsp,0x8
      ee9dee:	5b                   	pop    rbx
      ee9def:	41 5e                	pop    r14
      ee9df1:	c3                   	ret

### AP 0x1834738: codeSlots=29, +0x140=0xee9dac, FDE=(15637932, 15637950)
      ee9d91:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ee9d96:	c3                   	ret
      ee9d97:	cc                   	int3
      ee9d98:	48 8d 05 d1 aa 94 00 	lea    rax,[rip+0x94aad1]        # 1834870 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6808>
      ee9d9f:	48 89 07             	mov    QWORD PTR [rdi],rax
      ee9da2:	48 83 c7 08          	add    rdi,0x8
      ee9da6:	e9 bf df ff ff       	jmp    ee7d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaf180>
      ee9dab:	cc                   	int3
      ee9dac:	53                   	push   rbx
      ee9dad:	48 89 fb             	mov    rbx,rdi
      ee9db0:	e8 e3 ff ff ff       	call   ee9d98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb11ae>
      ee9db5:	48 89 df             	mov    rdi,rbx
      ee9db8:	5b                   	pop    rbx
      ee9db9:	e9 62 41 90 00       	jmp    17edf20 <_ZdlPv@plt>
      ee9dbe:	41 56                	push   r14
      ee9dc0:	53                   	push   rbx
      ee9dc1:	50                   	push   rax
      ee9dc2:	48 8d 5f 08          	lea    rbx,[rdi+0x8]
      ee9dc6:	6a 58                	push   0x58
      ee9dc8:	5f                   	pop    rdi
      ee9dc9:	e8 32 41 90 00       	call   17edf00 <_Znwm@plt>
      ee9dce:	49 89 c6             	mov    r14,rax
      ee9dd1:	48 8d 05 98 aa 94 00 	lea    rax,[rip+0x94aa98]        # 1834870 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6808>
      ee9dd8:	49 89 06             	mov    QWORD PTR [r14],rax
      ee9ddb:	49 8d 7e 08          	lea    rdi,[r14+0x8]
      ee9ddf:	48 89 de             	mov    rsi,rbx
      ee9de2:	e8 41 ff ff ff       	call   ee9d28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb113e>
      ee9de7:	4c 89 f0             	mov    rax,r14
      ee9dea:	48 83 c4 08          	add    rsp,0x8
      ee9dee:	5b                   	pop    rbx
      ee9def:	41 5e                	pop    r14
      ee9df1:	c3                   	ret
      ee9df2:	48 8d 47 08          	lea    rax,[rdi+0x8]
      ee9df6:	48 8d 0d 73 aa 94 00 	lea    rcx,[rip+0x94aa73]        # 1834870 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6808>
      ee9dfd:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      ee9e00:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
      ee9e04:	48 89 c6             	mov    rsi,rax

### AP 0x1834740: codeSlots=29, +0x140=0xee9dbe, FDE=(15637950, 15638002)
      ee9da6:	e9 bf df ff ff       	jmp    ee7d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaf180>
      ee9dab:	cc                   	int3
      ee9dac:	53                   	push   rbx
      ee9dad:	48 89 fb             	mov    rbx,rdi
      ee9db0:	e8 e3 ff ff ff       	call   ee9d98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb11ae>
      ee9db5:	48 89 df             	mov    rdi,rbx
      ee9db8:	5b                   	pop    rbx
      ee9db9:	e9 62 41 90 00       	jmp    17edf20 <_ZdlPv@plt>
      ee9dbe:	41 56                	push   r14
      ee9dc0:	53                   	push   rbx
      ee9dc1:	50                   	push   rax
      ee9dc2:	48 8d 5f 08          	lea    rbx,[rdi+0x8]
      ee9dc6:	6a 58                	push   0x58
      ee9dc8:	5f                   	pop    rdi
      ee9dc9:	e8 32 41 90 00       	call   17edf00 <_Znwm@plt>
      ee9dce:	49 89 c6             	mov    r14,rax
      ee9dd1:	48 8d 05 98 aa 94 00 	lea    rax,[rip+0x94aa98]        # 1834870 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6808>
      ee9dd8:	49 89 06             	mov    QWORD PTR [r14],rax
      ee9ddb:	49 8d 7e 08          	lea    rdi,[r14+0x8]
      ee9ddf:	48 89 de             	mov    rsi,rbx
      ee9de2:	e8 41 ff ff ff       	call   ee9d28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb113e>
      ee9de7:	4c 89 f0             	mov    rax,r14
      ee9dea:	48 83 c4 08          	add    rsp,0x8
      ee9dee:	5b                   	pop    rbx
      ee9def:	41 5e                	pop    r14
      ee9df1:	c3                   	ret
      ee9df2:	48 8d 47 08          	lea    rax,[rdi+0x8]
      ee9df6:	48 8d 0d 73 aa 94 00 	lea    rcx,[rip+0x94aa73]        # 1834870 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6808>
      ee9dfd:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      ee9e00:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
      ee9e04:	48 89 c6             	mov    rsi,rax
      ee9e07:	e9 1c ff ff ff       	jmp    ee9d28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb113e>
      ee9e0c:	55                   	push   rbp
      ee9e0d:	41 57                	push   r15
      ee9e0f:	41 56                	push   r14
      ee9e11:	41 55                	push   r13
      ee9e13:	41 54                	push   r12

### AP 0x1834748: codeSlots=29, +0x140=0xee9df2, FDE=(15638002, 15638028)
      ee9ddb:	49 8d 7e 08          	lea    rdi,[r14+0x8]
      ee9ddf:	48 89 de             	mov    rsi,rbx
      ee9de2:	e8 41 ff ff ff       	call   ee9d28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb113e>
      ee9de7:	4c 89 f0             	mov    rax,r14
      ee9dea:	48 83 c4 08          	add    rsp,0x8
      ee9dee:	5b                   	pop    rbx
      ee9def:	41 5e                	pop    r14
      ee9df1:	c3                   	ret
      ee9df2:	48 8d 47 08          	lea    rax,[rdi+0x8]
      ee9df6:	48 8d 0d 73 aa 94 00 	lea    rcx,[rip+0x94aa73]        # 1834870 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6808>
      ee9dfd:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      ee9e00:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
      ee9e04:	48 89 c6             	mov    rsi,rax
      ee9e07:	e9 1c ff ff ff       	jmp    ee9d28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb113e>
      ee9e0c:	55                   	push   rbp
      ee9e0d:	41 57                	push   r15
      ee9e0f:	41 56                	push   r14
      ee9e11:	41 55                	push   r13
      ee9e13:	41 54                	push   r12
      ee9e15:	53                   	push   rbx
      ee9e16:	50                   	push   rax
      ee9e17:	48 89 fb             	mov    rbx,rdi
      ee9e1a:	4c 8d 66 18          	lea    r12,[rsi+0x18]
      ee9e1e:	4c 8d 6e 28          	lea    r13,[rsi+0x28]
      ee9e22:	48 8d 6e 38          	lea    rbp,[rsi+0x38]
      ee9e26:	48 8d 46 48          	lea    rax,[rsi+0x48]
      ee9e2a:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      ee9e2e:	bf 00 07 00 00       	mov    edi,0x700
      ee9e33:	e8 c8 40 90 00       	call   17edf00 <_Znwm@plt>
      ee9e38:	49 89 c6             	mov    r14,rax
      ee9e3b:	0f 57 c0             	xorps  xmm0,xmm0
      ee9e3e:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      ee9e42:	48 8d 05 6f aa 94 00 	lea    rax,[rip+0x94aa6f]        # 18348b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6850>
      ee9e49:	49 89 06             	mov    QWORD PTR [r14],rax
      ee9e4c:	4d 89 f7             	mov    r15,r14
      ee9e4f:	49 83 c7 18          	add    r15,0x18
      ee9e53:	4c 89 ff             	mov    rdi,r15

