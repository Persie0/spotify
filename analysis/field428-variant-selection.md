# field428 readiness-source variant selection

Proven sibling source APs:
- 0x1834418: +0x30 -> 0xee6db8
- 0x1834728: +0x30 -> 0xece084
- both share +0x20 -> 0xece064 and +0x28 -> 0xece06e

Both materializations are inside FDE=(15310087, 15343400)

## Exact first variant materialization @0xe9ff24
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
      e9fef8:	e8 03 e0 94 00       	call   17edf00 <_Znwm@plt>
      e9fefd:	49 89 c4             	mov    r12,rax
      e9ff00:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9ff07:	00 
      e9ff08:	48 8d 84 24 d0 0e 00 	lea    rax,[rsp+0xed0]
      e9ff0f:	00 
      e9ff10:	48 89 84 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rax
      e9ff17:	00 
      e9ff18:	48 c7 84 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],0x1
      e9ff1f:	00 01 00 00 00 
      e9ff24:	48 8d 05 ed 44 99 00 	lea    rax,[rip+0x9944ed]        # 1834418 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x63b0>
      e9ff2b:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e9ff2f:	0f 28 84 24 70 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x770]
      e9ff36:	00 
      e9ff37:	41 0f 29 44 24 10    	movaps XMMWORD PTR [r12+0x10],xmm0
      e9ff3d:	48 8b 84 24 88 07 00 	mov    rax,QWORD PTR [rsp+0x788]
      e9ff44:	00 
      e9ff45:	0f 28 84 24 80 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x780]
      e9ff4c:	00 
      e9ff4d:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
      e9ff53:	48 85 c0             	test   rax,rax
      e9ff56:	74 05                	je     e9ff5d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67373>
      e9ff58:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9ff5d:	48 8b 84 24 98 07 00 	mov    rax,QWORD PTR [rsp+0x798]
      e9ff64:	00 
      e9ff65:	0f 28 84 24 90 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x790]
      e9ff6c:	00 
      e9ff6d:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0
      e9ff73:	48 85 c0             	test   rax,rax
      e9ff76:	74 05                	je     e9ff7d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67393>
      e9ff78:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9ff7d:	48 8b 84 24 a8 07 00 	mov    rax,QWORD PTR [rsp+0x7a8]
      e9ff84:	00 
      e9ff85:	0f 28 84 24 a0 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x7a0]
      e9ff8c:	00 
      e9ff8d:	41 0f 11 44 24 40    	movups XMMWORD PTR [r12+0x40],xmm0
      e9ff93:	48 85 c0             	test   rax,rax
      e9ff96:	74 05                	je     e9ff9d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x673b3>
      e9ff98:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9ff9d:	4d 8d 6c 24 50       	lea    r13,[r12+0x50]
      e9ffa2:	4c 89 ef             	mov    rdi,r13
      e9ffa5:	48 89 de             	mov    rsi,rbx
      e9ffa8:	e8 eb de 02 00       	call   ecde98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x952ae>
      e9ffad:	49 8d 9c 24 80 00 00 	lea    rbx,[r12+0x80]
      e9ffb4:	00 
      e9ffb5:	48 89 df             	mov    rdi,rbx
      e9ffb8:	48 8d b4 24 e0 07 00 	lea    rsi,[rsp+0x7e0]
      e9ffbf:	00 
      e9ffc0:	e8 17 df 02 00       	call   ecdedc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x952f2>
      e9ffc5:	49 8d bc 24 b0 00 00 	lea    rdi,[r12+0xb0]
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
      ea0068:	4c 89 a4 24 50 0b 00 	mov    QWORD PTR [rsp+0xb50],r12
      ea006f:	00 
      ea0070:	48 89 df             	mov    rdi,rbx
      ea0073:	e8 52 a2 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea0078:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      ea007d:	48 89 03             	mov    QWORD PTR [rbx],rax
      ea0080:	48 8b 84 24 b8 00 00 	mov    rax,QWORD PTR [rsp+0xb8]
      ea0087:	00 
      ea0088:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
      ea008c:	0f 28 84 24 d0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xd0]
      ea0093:	00 
      ea0094:	0f 29 43 10          	movaps XMMWORD PTR [rbx+0x10],xmm0
      ea0098:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
      ea009d:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      ea00a1:	0f 28 84 24 90 00 00 	movaps xmm0,XMMWORD PTR [rsp+0x90]
      ea00a8:	00 
      ea00a9:	0f 29 43 20          	movaps XMMWORD PTR [rbx+0x20],xmm0
      ea00ad:	48 8b 84 24 88 00 00 	mov    rax,QWORD PTR [rsp+0x88]
      ea00b4:	00 
      ea00b5:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      ea00b9:	66 0f 6f 84 24 a0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xa0]
      ea00c0:	00 00 
      ea00c2:	66 0f 7f 43 30       	movdqa XMMWORD PTR [rbx+0x30],xmm0
      ea00c7:	48 8b 84 24 80 00 00 	mov    rax,QWORD PTR [rsp+0x80]
      ea00ce:	00 
      ea00cf:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      ea00d3:	4c 8d ac 24 a0 10 00 	lea    r13,[rsp+0x10a0]
      ea00da:	00 
      ea00db:	48 8d b4 24 c0 02 00 	lea    rsi,[rsp+0x2c0]
      ea00e2:	00 
      ea00e3:	4c 89 ef             	mov    rdi,r13
      ea00e6:	e8 a5 a1 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ea00eb:	4c 8d bc 24 d0 10 00 	lea    r15,[rsp+0x10d0]
      ea00f2:	00 
      ea00f3:	48 8d b4 24 90 02 00 	lea    rsi,[rsp+0x290]
      ea00fa:	00 
      ea00fb:	4c 89 ff             	mov    rdi,r15
      ea00fe:	e8 8d a1 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ea0103:	48 8d 9c 24 00 11 00 	lea    rbx,[rsp+0x1100]
      ea010a:	00 
      ea010b:	ba b0 00 00 00       	mov    edx,0xb0
      ea0110:	48 89 df             	mov    rdi,rbx

## Exact second variant materialization @0xea01e4
      ea0098:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
      ea009d:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      ea00a1:	0f 28 84 24 90 00 00 	movaps xmm0,XMMWORD PTR [rsp+0x90]
      ea00a8:	00 
      ea00a9:	0f 29 43 20          	movaps XMMWORD PTR [rbx+0x20],xmm0
      ea00ad:	48 8b 84 24 88 00 00 	mov    rax,QWORD PTR [rsp+0x88]
      ea00b4:	00 
      ea00b5:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      ea00b9:	66 0f 6f 84 24 a0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xa0]
      ea00c0:	00 00 
      ea00c2:	66 0f 7f 43 30       	movdqa XMMWORD PTR [rbx+0x30],xmm0
      ea00c7:	48 8b 84 24 80 00 00 	mov    rax,QWORD PTR [rsp+0x80]
      ea00ce:	00 
      ea00cf:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      ea00d3:	4c 8d ac 24 a0 10 00 	lea    r13,[rsp+0x10a0]
      ea00da:	00 
      ea00db:	48 8d b4 24 c0 02 00 	lea    rsi,[rsp+0x2c0]
      ea00e2:	00 
      ea00e3:	4c 89 ef             	mov    rdi,r13
      ea00e6:	e8 a5 a1 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ea00eb:	4c 8d bc 24 d0 10 00 	lea    r15,[rsp+0x10d0]
      ea00f2:	00 
      ea00f3:	48 8d b4 24 90 02 00 	lea    rsi,[rsp+0x290]
      ea00fa:	00 
      ea00fb:	4c 89 ff             	mov    rdi,r15
      ea00fe:	e8 8d a1 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ea0103:	48 8d 9c 24 00 11 00 	lea    rbx,[rsp+0x1100]
      ea010a:	00 
      ea010b:	ba b0 00 00 00       	mov    edx,0xb0
      ea0110:	48 89 df             	mov    rdi,rbx
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
      ea01b3:	bf b0 01 00 00       	mov    edi,0x1b0
      ea01b8:	e8 43 dd 94 00       	call   17edf00 <_Znwm@plt>
      ea01bd:	49 89 c4             	mov    r12,rax
      ea01c0:	48 89 84 24 a0 0e 00 	mov    QWORD PTR [rsp+0xea0],rax
      ea01c7:	00 
      ea01c8:	48 8d 84 24 80 03 00 	lea    rax,[rsp+0x380]
      ea01cf:	00 
      ea01d0:	48 89 84 24 a8 0e 00 	mov    QWORD PTR [rsp+0xea8],rax
      ea01d7:	00 
      ea01d8:	48 c7 84 24 b0 0e 00 	mov    QWORD PTR [rsp+0xeb0],0x1
      ea01df:	00 01 00 00 00 
      ea01e4:	48 8d 05 3d 45 99 00 	lea    rax,[rip+0x99453d]        # 1834728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x66c0>
      ea01eb:	49 89 04 24          	mov    QWORD PTR [r12],rax
      ea01ef:	0f 28 84 24 60 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1060]
      ea01f6:	00 
      ea01f7:	41 0f 29 44 24 10    	movaps XMMWORD PTR [r12+0x10],xmm0
      ea01fd:	48 8b 84 24 78 10 00 	mov    rax,QWORD PTR [rsp+0x1078]
      ea0204:	00 
      ea0205:	0f 28 84 24 70 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1070]
      ea020c:	00 
      ea020d:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
      ea0213:	48 85 c0             	test   rax,rax
      ea0216:	74 05                	je     ea021d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67633>
      ea0218:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea021d:	48 8b 84 24 88 10 00 	mov    rax,QWORD PTR [rsp+0x1088]
      ea0224:	00 
      ea0225:	0f 28 84 24 80 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1080]
      ea022c:	00 
      ea022d:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0
      ea0233:	48 85 c0             	test   rax,rax
      ea0236:	74 05                	je     ea023d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67653>
      ea0238:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea023d:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
      ea0244:	00 
      ea0245:	0f 28 84 24 90 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1090]
      ea024c:	00 
      ea024d:	41 0f 11 44 24 40    	movups XMMWORD PTR [r12+0x40],xmm0
      ea0253:	48 85 c0             	test   rax,rax
      ea0256:	74 05                	je     ea025d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67673>
      ea0258:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea025d:	49 8d 5c 24 50       	lea    rbx,[r12+0x50]
      ea0262:	48 89 df             	mov    rdi,rbx
      ea0265:	4c 89 ee             	mov    rsi,r13
      ea0268:	e8 2b dc 02 00       	call   ecde98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x952ae>
      ea026d:	4d 8d ac 24 80 00 00 	lea    r13,[r12+0x80]
      ea0274:	00 
      ea0275:	4c 89 ef             	mov    rdi,r13
      ea0278:	4c 89 fe             	mov    rsi,r15
      ea027b:	e8 5c dc 02 00       	call   ecdedc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x952f2>
      ea0280:	49 8d bc 24 b0 00 00 	lea    rdi,[r12+0xb0]
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
      ea0326:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      ea032a:	4c 8d bc 24 d0 0e 00 	lea    r15,[rsp+0xed0]
      ea0331:	00 
      ea0332:	4d 89 67 20          	mov    QWORD PTR [r15+0x20],r12
      ea0336:	e8 8f 9f bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea033b:	48 8d 9c 24 00 0d 00 	lea    rbx,[rsp+0xd00]
      ea0342:	00 
      ea0343:	4c 8d a4 24 d0 0c 00 	lea    r12,[rsp+0xcd0]
      ea034a:	00 
      ea034b:	4c 8d ac 24 30 0b 00 	lea    r13,[rsp+0xb30]
      ea0352:	00 
      ea0353:	48 89 df             	mov    rdi,rbx
      ea0356:	4c 89 e6             	mov    rsi,r12
      ea0359:	4c 89 ea             	mov    rdx,r13
      ea035c:	4c 89 f9             	mov    rcx,r15
      ea035f:	e8 e2 7d ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      ea0364:	4c 89 ff             	mov    rdi,r15
      ea0367:	e8 fe 9b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea036c:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0373:	00 
      ea0374:	e8 a7 db 02 00       	call   ecdf20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95336>
      ea0379:	4c 89 ef             	mov    rdi,r13
      ea037c:	e8 e9 9b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0381:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea0388:	00 
      ea0389:	e8 92 db 02 00       	call   ecdf20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95336>
      ea038e:	4c 89 e7             	mov    rdi,r12
      ea0391:	e8 fa da 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea0396:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea039d:	00 
      ea039e:	48 89 de             	mov    rsi,rbx
      ea03a1:	e8 52 ed fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      ea03a6:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea03ad:	00 
      ea03ae:	e8 bb 7e ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea03b3:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
      ea03ba:	00 
      ea03bb:	e8 aa 9b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea03c0:	48 8d bc 24 c0 02 00 	lea    rdi,[rsp+0x2c0]
      ea03c7:	00 
      ea03c8:	e8 9d 9b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea03cd:	48 8b 84 24 58 12 00 	mov    rax,QWORD PTR [rsp+0x1258]
      ea03d4:	00 

## Control-flow instructions between the two materializations
      e9fe7a:	48 85 c0             	test   rax,rax
      e9fe7d:	74 05                	je     e9fe84 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6729a>
      e9fe9d:	48 85 c0             	test   rax,rax
      e9fea0:	74 05                	je     e9fea7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x672bd>
      e9fee0:	48 85 c0             	test   rax,rax
      e9fee3:	74 05                	je     e9feea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67300>
      e9ff53:	48 85 c0             	test   rax,rax
      e9ff56:	74 05                	je     e9ff5d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67373>
      e9ff73:	48 85 c0             	test   rax,rax
      e9ff76:	74 05                	je     e9ff7d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67393>
      e9ff93:	48 85 c0             	test   rax,rax
      e9ff96:	74 05                	je     e9ff9d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x673b3>
      e9fff8:	48 85 c0             	test   rax,rax
      e9fffb:	74 05                	je     ea0002 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67418>
      ea001d:	48 85 c0             	test   rax,rax
      ea0020:	74 05                	je     ea0027 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6743d>
      ea0052:	48 85 c0             	test   rax,rax
      ea0055:	74 05                	je     ea005c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67472>
      ea0145:	48 85 c0             	test   rax,rax
      ea0148:	74 05                	je     ea014f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67565>
      ea0168:	48 85 c0             	test   rax,rax
      ea016b:	74 05                	je     ea0172 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67588>
      ea01a0:	48 85 c0             	test   rax,rax
      ea01a3:	74 05                	je     ea01aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x675c0>
      ea0213:	48 85 c0             	test   rax,rax
      ea0216:	74 05                	je     ea021d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67633>
      ea0233:	48 85 c0             	test   rax,rax
      ea0236:	74 05                	je     ea023d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67653>
      ea0253:	48 85 c0             	test   rax,rax
      ea0256:	74 05                	je     ea025d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67673>

## All exact source-stack references in containing FDE
### rsp+0x770: 200 refs
- 0xe99dca: lea    rdi,[rsp+0x770]
- 0xe99e08: movaps xmm0,XMMWORD PTR [rsp+0x770]
- 0xe99e10: movdqa XMMWORD PTR [rsp+0x770],xmm1
- 0xe99eb4: lea    rbx,[rsp+0x770]
- 0xe99edb: lea    rdi,[rsp+0x770]
- 0xe99ef3: lea    rdi,[rsp+0x770]
- 0xe99f06: lea    rdi,[rsp+0x770]
- 0xe99f29: lea    rbx,[rsp+0x770]
- 0xe99f4d: lea    rdi,[rsp+0x770]
- 0xe99f68: lea    rdi,[rsp+0x770]
- 0xe9a0f9: lea    r12,[rsp+0x770]
- 0xe9a281: lea    rbx,[rsp+0x770]
- 0xe9a2b2: lea    rdi,[rsp+0x770]
- 0xe9a2c3: lea    rdi,[rsp+0x770]
- 0xe9a2e1: lea    rdi,[rsp+0x770]
- 0xe9a2f6: lea    rdi,[rsp+0x770]
- 0xe9a5cc: lea    r12,[rsp+0x770]
- 0xe9a7b5: lea    r12,[rsp+0x770]
- 0xe9a910: lea    r14,[rsp+0x770]
- 0xe9a935: lea    rdi,[rsp+0x770]
- 0xe9a94e: lea    rdi,[rsp+0x770]
- 0xe9acf0: movaps XMMWORD PTR [rsp+0x770],xmm0
- 0xe9ad3f: lea    r15,[rsp+0x770]
- 0xe9ad89: lea    rdi,[rsp+0x770]
- 0xe9adc3: lea    r15,[rsp+0x770]
- 0xe9ae5f: lea    r12,[rsp+0x770]
- 0xe9b191: lea    r12,[rsp+0x770]
- 0xe9b1ef: lea    rdi,[rsp+0x770]
- 0xe9b426: lea    rdi,[rsp+0x770]
- 0xe9b44f: lea    rsi,[rsp+0x770]
- 0xe9b45f: lea    rdi,[rsp+0x770]
- 0xe9b49d: lea    rdi,[rsp+0x770]
- 0xe9b4c6: lea    rsi,[rsp+0x770]
- 0xe9b4d6: lea    rdi,[rsp+0x770]
- 0xe9b4ff: lea    rdi,[rsp+0x770]
- 0xe9b514: lea    rsi,[rsp+0x770]
- 0xe9b524: lea    rdi,[rsp+0x770]
- 0xe9b565: lea    rdi,[rsp+0x770]
- 0xe9b57a: lea    rsi,[rsp+0x770]
- 0xe9b58a: lea    rdi,[rsp+0x770]
- 0xe9b608: lea    r14,[rsp+0x770]
- 0xe9b62f: lea    rdi,[rsp+0x770]
- 0xe9b76b: lea    r14,[rsp+0x770]
- 0xe9b7a7: lea    rdi,[rsp+0x770]
- 0xe9b7e4: lea    rdi,[rsp+0x770]
- 0xe9b7f9: lea    rdi,[rsp+0x770]
- 0xe9b856: lea    rbx,[rsp+0x770]
- 0xe9b896: lea    rdi,[rsp+0x770]
- 0xe9b8dd: lea    rdi,[rsp+0x770]
- 0xe9b914: lea    rdi,[rsp+0x770]
- 0xe9b929: lea    rdi,[rsp+0x770]
- 0xe9b944: mov    QWORD PTR [rsp+0x770],rax
- 0xe9b94c: lea    rax,[rsp+0x770]
- 0xe9b981: lea    rcx,[rsp+0x770]
- 0xe9b9a2: lea    rdi,[rsp+0x770]
- 0xe9b9b3: lea    rdi,[rsp+0x770]
- 0xe9ba07: movdqa XMMWORD PTR [rsp+0x770],xmm0
- 0xe9bb18: lea    rsi,[rsp+0x770]
- 0xe9bd33: lea    rbx,[rsp+0x770]
- 0xe9bdec: mov    QWORD PTR [rsp+0x770],rax
- 0xe9bec6: mov    QWORD PTR [rsp+0x770],rax
- 0xe9bee2: mov    QWORD PTR [rsp+0x770],rax
- 0xe9c00e: mov    QWORD PTR [rsp+0x770],rax
- 0xe9c1c8: lea    r13,[rsp+0x770]
- 0xe9c2e4: lea    rsi,[rsp+0x770]
- 0xe9c336: mov    QWORD PTR [rsp+0x770],rax
- 0xe9c3d7: mov    QWORD PTR [rsp+0x770],rax
- 0xe9c4d4: mov    QWORD PTR [rsp+0x770],rax
- 0xe9c5e7: mov    QWORD PTR [rsp+0x770],rax
- 0xe9c6bd: mov    QWORD PTR [rsp+0x770],rcx
- 0xe9c7d7: lea    rsi,[rsp+0x770]
- 0xe9c84e: lea    rdi,[rsp+0x770]
- 0xe9c8b0: lea    r14,[rsp+0x770]
- 0xe9d0ca: lea    rdi,[rsp+0x770]
- 0xe9d347: mov    rax,QWORD PTR [rsp+0x770]
- 0xe9d404: lea    rdi,[rsp+0x770]
- 0xe9d6ab: lea    rdi,[rsp+0x770]
- 0xe9d6c8: lea    rsi,[rsp+0x770]
- 0xe9d6d5: lea    rdi,[rsp+0x770]
- 0xe9d715: lea    rdi,[rsp+0x770]
- 0xe9d732: lea    rsi,[rsp+0x770]
- 0xe9d73f: lea    rdi,[rsp+0x770]
- 0xe9d760: lea    rdi,[rsp+0x770]
- 0xe9d76d: lea    rsi,[rsp+0x770]
- 0xe9d792: lea    rdi,[rsp+0x770]
- 0xe9d979: lea    rdi,[rsp+0x770]
- 0xe9d9e6: lea    r13,[rsp+0x770]
- 0xe9dc2c: lea    rdi,[rsp+0x770]
- 0xe9dc6a: lea    rsi,[rsp+0x770]
- 0xe9dc77: lea    rdi,[rsp+0x770]
- 0xe9df39: lea    rdi,[rsp+0x770]
- 0xe9dfab: lea    rsi,[rsp+0x770]
- 0xe9e10d: lea    rdi,[rsp+0x770]
- 0xe9e1df: lea    rbx,[rsp+0x770]
- 0xe9e228: lea    rdi,[rsp+0x770]
- 0xe9e28c: lea    rbx,[rsp+0x770]
- 0xe9e2d5: lea    rdi,[rsp+0x770]
- 0xe9e324: lea    rbx,[rsp+0x770]
- 0xe9e36d: lea    rdi,[rsp+0x770]
- 0xe9e3bc: lea    rbx,[rsp+0x770]
- 0xe9e405: lea    rdi,[rsp+0x770]
- 0xe9e5ba: lea    rbx,[rsp+0x770]
- 0xe9e625: lea    rdi,[rsp+0x770]
- 0xe9e6f1: lea    r12,[rsp+0x770]
- 0xe9e758: lea    rdi,[rsp+0x770]
- 0xe9e88f: lea    rdi,[rsp+0x770]
- 0xe9e8f5: lea    rsi,[rsp+0x770]
- 0xe9e902: lea    rdi,[rsp+0x770]
- 0xe9eac6: lea    rbx,[rsp+0x770]
- 0xe9eb4d: lea    rdi,[rsp+0x770]
- 0xe9eb82: lea    rdi,[rsp+0x770]
- 0xe9eb9f: lea    rsi,[rsp+0x770]
- 0xe9ebb4: lea    rdi,[rsp+0x770]
- 0xe9ec45: lea    rdi,[rsp+0x770]
- 0xe9ec7f: lea    rsi,[rsp+0x770]
- 0xe9ec8c: lea    rdi,[rsp+0x770]
- 0xe9ed5c: lea    rdi,[rsp+0x770]
- 0xe9ed9d: lea    rsi,[rsp+0x770]
- 0xe9edaa: lea    rdi,[rsp+0x770]
- 0xe9ee3c: lea    r15,[rsp+0x770]
- 0xe9ee9b: lea    rdi,[rsp+0x770]
- 0xe9ef24: lea    rbx,[rsp+0x770]
- 0xe9ef6d: lea    rdi,[rsp+0x770]
- 0xe9efa5: lea    rdi,[rsp+0x770]
- 0xe9efe2: lea    rsi,[rsp+0x770]
- 0xe9efef: lea    rdi,[rsp+0x770]
- 0xe9f027: lea    rdi,[rsp+0x770]
- 0xe9f064: lea    rsi,[rsp+0x770]
- 0xe9f071: lea    rdi,[rsp+0x770]
- 0xe9f0a9: lea    rdi,[rsp+0x770]
- 0xe9f0e6: lea    rsi,[rsp+0x770]
- 0xe9f0f3: lea    rdi,[rsp+0x770]
- 0xe9f17d: lea    rdi,[rsp+0x770]
- 0xe9f192: lea    rdi,[rsp+0x770]
- 0xe9f1bf: lea    rdi,[rsp+0x770]
- 0xe9f201: lea    rsi,[rsp+0x770]
- 0xe9f20e: lea    rdi,[rsp+0x770]
- 0xe9f2f8: lea    r15,[rsp+0x770]
- 0xe9f357: lea    rdi,[rsp+0x770]
- 0xe9f42f: lea    rdi,[rsp+0x770]
- 0xe9f47e: lea    rsi,[rsp+0x770]
- 0xe9f48b: lea    rdi,[rsp+0x770]
- 0xe9f4c3: lea    rdi,[rsp+0x770]
- 0xe9f4fd: lea    rsi,[rsp+0x770]
- 0xe9f50a: lea    rdi,[rsp+0x770]
- 0xe9f5d5: lea    rdi,[rsp+0x770]
- 0xe9f61c: lea    rsi,[rsp+0x770]
- 0xe9f629: lea    rdi,[rsp+0x770]
- 0xe9f675: lea    rdi,[rsp+0x770]
- 0xe9f6b5: lea    rsi,[rsp+0x770]
- 0xe9f6c2: lea    rdi,[rsp+0x770]
- 0xe9f718: lea    rdi,[rsp+0x770]
- 0xe9f752: lea    rsi,[rsp+0x770]
- 0xe9f75f: lea    rdi,[rsp+0x770]
- 0xe9f79a: lea    rdi,[rsp+0x770]
- 0xe9f7b7: lea    rsi,[rsp+0x770]
- 0xe9f7c4: lea    rdi,[rsp+0x770]
- 0xe9f8c1: lea    rdi,[rsp+0x770]
- 0xe9f8ff: lea    rsi,[rsp+0x770]
- 0xe9f90c: lea    rdi,[rsp+0x770]
- 0xe9f963: lea    rbx,[rsp+0x770]
- 0xe9f9ac: lea    rdi,[rsp+0x770]
- 0xe9ff2f: movaps xmm0,XMMWORD PTR [rsp+0x770]
- 0xea0381: lea    rdi,[rsp+0x770]
- 0xea05fa: lea    r15,[rsp+0x770]
- 0xea0668: lea    rdi,[rsp+0x770]
- 0xea06aa: lea    rdi,[rsp+0x770]
- 0xea06e4: lea    rsi,[rsp+0x770]
- 0xea06f1: lea    rdi,[rsp+0x770]
- 0xea0705: lea    rdi,[rsp+0x770]
- 0xea0712: lea    rsi,[rsp+0x770]
- 0xea0737: lea    rdi,[rsp+0x770]
- 0xea0870: lea    rdi,[rsp+0x770]
- 0xea091e: lea    rdi,[rsp+0x770]
- 0xea0935: lea    rdi,[rsp+0x770]
- 0xea0a36: lea    rdi,[rsp+0x770]
- 0xea0b11: lea    rdi,[rsp+0x770]
- 0xea0b34: lea    rdi,[rsp+0x770]
- 0xea0b8b: lea    rdi,[rsp+0x770]
- 0xea0c3c: lea    rdi,[rsp+0x770]
- 0xea0c6c: lea    rdi,[rsp+0x770]
- 0xea0ca1: lea    rdi,[rsp+0x770]
- 0xea0e0b: lea    rdi,[rsp+0x770]
- 0xea0ff0: lea    rdi,[rsp+0x770]
- 0xea100f: lea    rdi,[rsp+0x770]
- 0xea104e: lea    rdi,[rsp+0x770]
- 0xea1141: lea    rdi,[rsp+0x770]
- 0xea116f: lea    rdi,[rsp+0x770]
- 0xea1204: lea    rdi,[rsp+0x770]
- 0xea12a6: lea    rdi,[rsp+0x770]
- 0xea13d5: lea    rdi,[rsp+0x770]
- 0xea14bc: lea    rbx,[rsp+0x770]
- 0xea152b: lea    rdi,[rsp+0x770]
- 0xea1544: lea    rdi,[rsp+0x770]
- 0xea156f: lea    rdi,[rsp+0x770]
- 0xea15ef: lea    rdi,[rsp+0x770]
- 0xea1661: lea    rdi,[rsp+0x770]
- 0xea17c9: lea    rdi,[rsp+0x770]
- 0xea194d: lea    rdi,[rsp+0x770]
- 0xea1d74: lea    rdi,[rsp+0x770]

### rsp+0x778: 20 refs
- 0xe99e31: mov    rdi,QWORD PTR [rsp+0x778]
- 0xe9bd57: mov    rdi,QWORD PTR [rsp+0x778]
- 0xe9bdbf: movdqu XMMWORD PTR [rsp+0x778],xmm0
- 0xe9bdcf: movq   QWORD PTR [rsp+0x778],xmm0
- 0xe9bed3: movups XMMWORD PTR [rsp+0x778],xmm0
- 0xe9beef: movups XMMWORD PTR [rsp+0x778],xmm0
- 0xe9bfe1: movdqu XMMWORD PTR [rsp+0x778],xmm0
- 0xe9bff1: movq   QWORD PTR [rsp+0x778],xmm0
- 0xe9c300: mov    rdi,QWORD PTR [rsp+0x778]
- 0xe9c3e7: mov    QWORD PTR [rsp+0x778],rax
- 0xe9c4a7: movdqu XMMWORD PTR [rsp+0x778],xmm0
- 0xe9c4b7: movq   QWORD PTR [rsp+0x778],xmm0
- 0xe9c5ba: movdqu XMMWORD PTR [rsp+0x778],xmm0
- 0xe9c5ca: movq   QWORD PTR [rsp+0x778],xmm0
- 0xe9c6cd: mov    QWORD PTR [rsp+0x778],rcx
- 0xe9c7f0: mov    rdi,QWORD PTR [rsp+0x778]
- 0xea158b: mov    rdi,QWORD PTR [rsp+0x778]
- 0xea15c2: mov    rdi,QWORD PTR [rsp+0x778]
- 0xea1b74: mov    rdi,QWORD PTR [rsp+0x778]
- 0xea1f0e: mov    rdi,QWORD PTR [rsp+0x778]

### rsp+0x780: 9 refs
- 0xe9ad02: lea    r14,[rsp+0x780]
- 0xe9bdd8: and    QWORD PTR [rsp+0x780],0x0
- 0xe9bffa: and    QWORD PTR [rsp+0x780],0x0
- 0xe9c4c0: and    QWORD PTR [rsp+0x780],0x0
- 0xe9c5d3: and    QWORD PTR [rsp+0x780],0x0
- 0xe9c6d5: mov    QWORD PTR [rsp+0x780],rax
- 0xe9c8ef: lea    rbp,[rsp+0x780]
- 0xe9d26f: lea    r12,[rsp+0x780]
- 0xe9ff45: movaps xmm0,XMMWORD PTR [rsp+0x780]

### rsp+0x788: 3 refs
- 0xe9befb: mov    QWORD PTR [rsp+0x788],rcx
- 0xe9ff3d: mov    rax,QWORD PTR [rsp+0x788]
- 0xea0ee2: mov    rdi,QWORD PTR [rsp+0x788]

### rsp+0x790: 16 refs
- 0xe9b5c8: and    QWORD PTR [rsp+0x790],0x0
- 0xe9b72b: and    QWORD PTR [rsp+0x790],0x0
- 0xe9b954: mov    QWORD PTR [rsp+0x790],rax
- 0xe9b974: mov    rax,QWORD PTR [rsp+0x790]
- 0xe9b991: lea    rbx,[rsp+0x790]
- 0xe9ba25: lea    r14,[rsp+0x790]
- 0xe9bab2: mov    QWORD PTR [rsp+0x790],r12
- 0xe9bdf4: mov    QWORD PTR [rsp+0x790],rbx
- 0xe9bf03: mov    QWORD PTR [rsp+0x790],rbx
- 0xe9c016: mov    QWORD PTR [rsp+0x790],rbx
- 0xe9c33e: mov    QWORD PTR [rsp+0x790],r13
- 0xe9c3ef: mov    QWORD PTR [rsp+0x790],r13
- 0xe9c4dc: mov    QWORD PTR [rsp+0x790],r13
- 0xe9c5ef: mov    QWORD PTR [rsp+0x790],r13
- 0xe9c6dd: mov    QWORD PTR [rsp+0x790],r13
- 0xe9ff65: movaps xmm0,XMMWORD PTR [rsp+0x790]

### rsp+0x798: 3 refs
- 0xe9baba: mov    QWORD PTR [rsp+0x798],r15
- 0xe9ff5d: mov    rax,QWORD PTR [rsp+0x798]
- 0xea0ed5: mov    rdi,QWORD PTR [rsp+0x798]

### rsp+0x1060: 113 refs
- 0xe9a0e3: lea    r15,[rsp+0x1060]
- 0xe9a5b6: lea    r15,[rsp+0x1060]
- 0xe9a79f: lea    r15,[rsp+0x1060]
- 0xe9ad91: lea    rsi,[rsp+0x1060]
- 0xe9adf3: lea    rbx,[rsp+0x1060]
- 0xe9ae81: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9b166: lea    rsi,[rsp+0x1060]
- 0xe9b1d2: lea    rdi,[rsp+0x1060]
- 0xe9b701: mov    QWORD PTR [rsp+0x1060],r12
- 0xe9b777: lea    rdi,[rsp+0x1060]
- 0xe9b837: lea    rdi,[rsp+0x1060]
- 0xe9b85e: lea    rcx,[rsp+0x1060]
- 0xe9b8a3: lea    rdi,[rsp+0x1060]
- 0xe9ba78: lea    r14,[rsp+0x1060]
- 0xe9bb80: lea    rdi,[rsp+0x1060]
- 0xe9be3a: lea    rsi,[rsp+0x1060]
- 0xe9bf49: lea    rsi,[rsp+0x1060]
- 0xe9c05c: lea    rsi,[rsp+0x1060]
- 0xe9c0b7: lea    rdi,[rsp+0x1060]
- 0xe9c0f3: lea    rsi,[rsp+0x1060]
- 0xe9c25c: lea    rdi,[rsp+0x1060]
- 0xe9d321: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9d3e8: lea    r14,[rsp+0x1060]
- 0xe9d4f8: mov    rax,QWORD PTR [rsp+0x1060]
- 0xe9d5a5: lea    rdi,[rsp+0x1060]
- 0xe9da31: lea    rdi,[rsp+0x1060]
- 0xe9da97: lea    r13,[rsp+0x1060]
- 0xe9dc07: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9dc1c: lea    rdx,[rsp+0x1060]
- 0xe9dc41: lea    rdi,[rsp+0x1060]
- 0xe9df6a: lea    rdi,[rsp+0x1060]
- 0xe9e029: lea    rsi,[rsp+0x1060]
- 0xe9e0fd: lea    r13,[rsp+0x1060]
- 0xe9e192: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9e265: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9e2fd: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9e395: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9e5ca: lea    rbp,[rsp+0x1060]
- 0xe9e694: mov    QWORD PTR [rsp+0x1060],rcx
- 0xe9e701: lea    r14,[rsp+0x1060]
- 0xe9e7e6: lea    rdi,[rsp+0x1060]
- 0xe9e84f: lea    rsi,[rsp+0x1060]
- 0xe9e8b4: lea    rdi,[rsp+0x1060]
- 0xe9e97c: lea    rdi,[rsp+0x1060]
- 0xe9e9eb: lea    rsi,[rsp+0x1060]
- 0xe9eb0c: lea    rdi,[rsp+0x1060]
- 0xe9ebac: lea    r15,[rsp+0x1060]
- 0xe9ec2d: mov    QWORD PTR [rsp+0x1060],rcx
- 0xe9ec5d: lea    rdi,[rsp+0x1060]
- 0xe9ed3d: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9ed74: lea    rdi,[rsp+0x1060]
- 0xe9edd7: mov    QWORD PTR [rsp+0x1060],rcx
- 0xe9ee4c: lea    r12,[rsp+0x1060]
- 0xe9eeb0: lea    r15,[rsp+0x1060]
- 0xe9eefd: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9ef95: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9efbd: lea    rbx,[rsp+0x1060]
- 0xe9f017: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9f03f: lea    rbx,[rsp+0x1060]
- 0xe9f099: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9f0c1: lea    rbx,[rsp+0x1060]
- 0xe9f15e: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9f1a6: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9f1d7: lea    rdi,[rsp+0x1060]
- 0xe9f21b: lea    r15,[rsp+0x1060]
- 0xe9f2a3: mov    QWORD PTR [rsp+0x1060],rcx
- 0xe9f308: lea    r12,[rsp+0x1060]
- 0xe9f423: lea    rdx,[rsp+0x1060]
- 0xe9f44c: lea    rbx,[rsp+0x1060]
- 0xe9f4b3: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9f4db: lea    rdi,[rsp+0x1060]
- 0xe9f59e: movdqa xmm0,XMMWORD PTR [rsp+0x1060]
- 0xe9f5b1: movdqa XMMWORD PTR [rsp+0x1060],xmm0
- 0xe9f5f7: lea    rbx,[rsp+0x1060]
- 0xe9f665: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9f68d: lea    r14,[rsp+0x1060]
- 0xe9f6f8: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9f730: lea    rdi,[rsp+0x1060]
- 0xe9f8b5: lea    rdx,[rsp+0x1060]
- 0xe9f8d6: lea    rdi,[rsp+0x1060]
- 0xe9f93c: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9ff00: mov    QWORD PTR [rsp+0x1060],rax
- 0xea005c: lea    rbx,[rsp+0x1060]
- 0xea01ef: movaps xmm0,XMMWORD PTR [rsp+0x1060]
- 0xea036c: lea    rdi,[rsp+0x1060]
- 0xea03f6: mov    QWORD PTR [rsp+0x1060],rax
- 0xea0498: movdqu xmm0,XMMWORD PTR [rsp+0x1060]
- 0xea0640: lea    rbx,[rsp+0x1060]
- 0xea069a: mov    QWORD PTR [rsp+0x1060],rax
- 0xea06c2: lea    rdi,[rsp+0x1060]
- 0xea0841: lea    rdi,[rsp+0x1060]
- 0xea0887: lea    rdi,[rsp+0x1060]
- 0xea0951: lea    rdi,[rsp+0x1060]
- 0xea09e5: lea    rdi,[rsp+0x1060]
- 0xea0a72: lea    rdi,[rsp+0x1060]
- 0xea0af0: lea    rdi,[rsp+0x1060]
- 0xea0b98: lea    rdi,[rsp+0x1060]
- 0xea0baf: lea    rdi,[rsp+0x1060]
- 0xea0c80: lea    rdi,[rsp+0x1060]
- 0xea0ce1: lea    rdi,[rsp+0x1060]
- 0xea0d88: lea    rdi,[rsp+0x1060]
- 0xea0e68: lea    rdi,[rsp+0x1060]
- 0xea1076: lea    rdi,[rsp+0x1060]
- 0xea10d1: lea    rdi,[rsp+0x1060]
- 0xea10fa: lea    rdi,[rsp+0x1060]
- 0xea1190: lea    rdi,[rsp+0x1060]
- 0xea1299: lea    rdi,[rsp+0x1060]
- 0xea13e9: lea    rdi,[rsp+0x1060]
- 0xea162e: lea    rdi,[rsp+0x1060]
- 0xea166e: lea    rdi,[rsp+0x1060]
- 0xea16fc: lea    rdi,[rsp+0x1060]
- 0xea17bc: lea    rdi,[rsp+0x1060]
- 0xea1b10: lea    rdi,[rsp+0x1060]

### rsp+0x1068: 19 refs
- 0xe9ae89: mov    QWORD PTR [rsp+0x1068],r15
- 0xe9b709: mov    QWORD PTR [rsp+0x1068],rbx
- 0xe9be59: mov    rdi,QWORD PTR [rsp+0x1068]
- 0xe9bf68: mov    rdi,QWORD PTR [rsp+0x1068]
- 0xe9c07b: mov    rdi,QWORD PTR [rsp+0x1068]
- 0xe9d329: mov    QWORD PTR [rsp+0x1068],rbp
- 0xe9dc14: movups XMMWORD PTR [rsp+0x1068],xmm0
- 0xe9e1a2: mov    QWORD PTR [rsp+0x1068],rcx
- 0xe9e6a1: movups XMMWORD PTR [rsp+0x1068],xmm0
- 0xe9ec35: mov    QWORD PTR [rsp+0x1068],rax
- 0xe9ed4b: movdqu XMMWORD PTR [rsp+0x1068],xmm0
- 0xe9ede4: movups XMMWORD PTR [rsp+0x1068],xmm0
- 0xe9f166: movdqu XMMWORD PTR [rsp+0x1068],xmm0
- 0xe9f1ae: movdqu XMMWORD PTR [rsp+0x1068],xmm0
- 0xe9f2b0: movups XMMWORD PTR [rsp+0x1068],xmm0
- 0xe9f708: mov    QWORD PTR [rsp+0x1068],rax
- 0xe9ff10: mov    QWORD PTR [rsp+0x1068],rax
- 0xea03fe: mov    QWORD PTR [rsp+0x1068],rbx
- 0xea1b35: mov    rdi,QWORD PTR [rsp+0x1068]

### rsp+0x1070: 9 refs
- 0xe9b716: mov    QWORD PTR [rsp+0x1070],rbp
- 0xe9b73c: lea    rcx,[rsp+0x1070]
- 0xe9d331: mov    QWORD PTR [rsp+0x1070],0x1
- 0xe9d41c: lea    rbx,[rsp+0x1070]
- 0xe9e1aa: mov    BYTE PTR [rsp+0x1070],bl
- 0xe9f55b: lea    rbx,[rsp+0x1070]
- 0xe9ff18: mov    QWORD PTR [rsp+0x1070],0x1
- 0xea0205: movaps xmm0,XMMWORD PTR [rsp+0x1070]
- 0xea0406: mov    QWORD PTR [rsp+0x1070],r13

### rsp+0x1078: 5 refs
- 0xe9b71e: mov    QWORD PTR [rsp+0x1078],r15
- 0xe9edec: mov    QWORD PTR [rsp+0x1078],r14
- 0xea01fd: mov    rax,QWORD PTR [rsp+0x1078]
- 0xea0413: mov    QWORD PTR [rsp+0x1078],rax
- 0xea0df1: mov    rdi,QWORD PTR [rsp+0x1078]

### rsp+0x1080: 31 refs
- 0xe9ad21: and    QWORD PTR [rsp+0x1080],0x0
- 0xe9ad6e: mov    QWORD PTR [rsp+0x1080],rbx
- 0xe9ad7e: cmp    QWORD PTR [rsp+0x1080],0x0
- 0xe9ae91: mov    QWORD PTR [rsp+0x1080],rbx
- 0xe9b0a1: mov    QWORD PTR [rsp+0x1080],rax
- 0xe9dc24: mov    QWORD PTR [rsp+0x1080],rdx
- 0xe9e1b1: mov    QWORD PTR [rsp+0x1080],r13
- 0xe9e26d: mov    QWORD PTR [rsp+0x1080],r13
- 0xe9e305: mov    QWORD PTR [rsp+0x1080],r13
- 0xe9e39d: mov    QWORD PTR [rsp+0x1080],r13
- 0xe9e4c0: and    QWORD PTR [rsp+0x1080],0x0
- 0xe9e50b: mov    QWORD PTR [rsp+0x1080],rax
- 0xe9e6a9: mov    QWORD PTR [rsp+0x1080],rbp
- 0xe9ec3d: mov    QWORD PTR [rsp+0x1080],r15
- 0xe9ed54: mov    QWORD PTR [rsp+0x1080],r15
- 0xe9edf4: mov    QWORD PTR [rsp+0x1080],r15
- 0xe9ef05: mov    QWORD PTR [rsp+0x1080],r15
- 0xe9ef9d: mov    QWORD PTR [rsp+0x1080],r15
- 0xe9f01f: mov    QWORD PTR [rsp+0x1080],rbx
- 0xe9f0a1: mov    QWORD PTR [rsp+0x1080],rbx
- 0xe9f1b7: mov    QWORD PTR [rsp+0x1080],rbx
- 0xe9f2b8: mov    QWORD PTR [rsp+0x1080],r15
- 0xe9f3dd: and    QWORD PTR [rsp+0x1080],0x0
- 0xe9f4bb: mov    QWORD PTR [rsp+0x1080],rbx
- 0xe9f66d: mov    QWORD PTR [rsp+0x1080],rbx
- 0xe9f710: mov    QWORD PTR [rsp+0x1080],r14
- 0xe9f873: and    QWORD PTR [rsp+0x1080],0x0
- 0xe9f944: mov    QWORD PTR [rsp+0x1080],r14
- 0xea0225: movaps xmm0,XMMWORD PTR [rsp+0x1080]
- 0xea0425: mov    QWORD PTR [rsp+0x1080],rax
- 0xea06a2: mov    QWORD PTR [rsp+0x1080],rbx

### rsp+0x1088: 3 refs
- 0xea021d: mov    rax,QWORD PTR [rsp+0x1088]
- 0xea042d: mov    QWORD PTR [rsp+0x1088],r14
- 0xea0de4: mov    rdi,QWORD PTR [rsp+0x1088]

## Nearest writes before each source block use
### rsp+0x770 before 0xe9ff24
#### write 0xe9bec6: mov    QWORD PTR [rsp+0x770],rax
      e9bea0:	49 89 c7             	mov    r15,rax
      e9bea3:	48 8b 8c 24 48 13 00 	mov    rcx,QWORD PTR [rsp+0x1348]
      e9beaa:	00 
      e9beab:	0f 57 c0             	xorps  xmm0,xmm0
      e9beae:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      e9beb2:	48 89 28             	mov    QWORD PTR [rax],rbp
      e9beb5:	48 8d 05 f4 14 9a 00 	lea    rax,[rip+0x9a14f4]        # 183d3b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf348>
      e9bebc:	4d 85 f6             	test   r14,r14
      e9bebf:	74 21                	je     e9bee2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x632f8>
      e9bec1:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9bec6:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9becd:	00 
      e9bece:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9bed3:	0f 11 84 24 78 07 00 	movups XMMWORD PTR [rsp+0x778],xmm0
      e9beda:	00 
      e9bedb:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9bee0:	eb 15                	jmp    e9bef7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6330d>
      e9bee2:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9bee9:	00 
      e9beea:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9beef:	0f 11 84 24 78 07 00 	movups XMMWORD PTR [rsp+0x778],xmm0
      e9bef6:	00 
      e9bef7:	4d 8d 67 20          	lea    r12,[r15+0x20]
      e9befb:	48 89 8c 24 88 07 00 	mov    QWORD PTR [rsp+0x788],rcx
      e9bf02:	00 
      e9bf03:	48 89 9c 24 90 07 00 	mov    QWORD PTR [rsp+0x790],rbx
      e9bf0a:	00 
      e9bf0b:	4c 89 e7             	mov    rdi,r12
      e9bf0e:	48 89 de             	mov    rsi,rbx
#### write 0xe9bee2: mov    QWORD PTR [rsp+0x770],rax
      e9bebc:	4d 85 f6             	test   r14,r14
      e9bebf:	74 21                	je     e9bee2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x632f8>
      e9bec1:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9bec6:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9becd:	00 
      e9bece:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9bed3:	0f 11 84 24 78 07 00 	movups XMMWORD PTR [rsp+0x778],xmm0
      e9beda:	00 
      e9bedb:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9bee0:	eb 15                	jmp    e9bef7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6330d>
      e9bee2:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9bee9:	00 
      e9beea:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9beef:	0f 11 84 24 78 07 00 	movups XMMWORD PTR [rsp+0x778],xmm0
      e9bef6:	00 
      e9bef7:	4d 8d 67 20          	lea    r12,[r15+0x20]
      e9befb:	48 89 8c 24 88 07 00 	mov    QWORD PTR [rsp+0x788],rcx
      e9bf02:	00 
      e9bf03:	48 89 9c 24 90 07 00 	mov    QWORD PTR [rsp+0x790],rbx
      e9bf0a:	00 
      e9bf0b:	4c 89 e7             	mov    rdi,r12
      e9bf0e:	48 89 de             	mov    rsi,rbx
      e9bf11:	e8 72 b3 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9bf16:	48 89 df             	mov    rdi,rbx
      e9bf19:	e8 4c e0 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9bf1e:	4c 89 f7             	mov    rdi,r14
      e9bf21:	e8 60 25 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9bf26:	66 49 0f 6e c7       	movq   xmm0,r15
      e9bf2b:	66 49 0f 6e cc       	movq   xmm1,r12
#### write 0xe9c00e: mov    QWORD PTR [rsp+0x770],rax
      e9bfe1:	f3 0f 7f 84 24 78 07 	movdqu XMMWORD PTR [rsp+0x778],xmm0
      e9bfe8:	00 00 
      e9bfea:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9bfef:	eb 12                	jmp    e9c003 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63419>
      e9bff1:	66 0f d6 84 24 78 07 	movq   QWORD PTR [rsp+0x778],xmm0
      e9bff8:	00 00 
      e9bffa:	48 83 a4 24 80 07 00 	and    QWORD PTR [rsp+0x780],0x0
      e9c001:	00 00 
      e9c003:	4d 8d 67 20          	lea    r12,[r15+0x20]
      e9c007:	48 8d 05 62 14 9a 00 	lea    rax,[rip+0x9a1462]        # 183d470 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf408>
      e9c00e:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9c015:	00 
      e9c016:	48 89 9c 24 90 07 00 	mov    QWORD PTR [rsp+0x790],rbx
      e9c01d:	00 
      e9c01e:	4c 89 e7             	mov    rdi,r12
      e9c021:	48 89 de             	mov    rsi,rbx
      e9c024:	e8 5f b2 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9c029:	48 89 df             	mov    rdi,rbx
      e9c02c:	e8 39 df bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9c031:	4c 89 f7             	mov    rdi,r14
      e9c034:	e8 4d 24 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c039:	66 49 0f 6e c7       	movq   xmm0,r15
      e9c03e:	66 49 0f 6e cc       	movq   xmm1,r12
      e9c043:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c047:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9c04d:	31 ff                	xor    edi,edi
      e9c04f:	e8 c8 23 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9c054:	4c 89 f7             	mov    rdi,r14
      e9c057:	e8 2a 24 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
#### write 0xe9c336: mov    QWORD PTR [rsp+0x770],rax
      e9c30f:	e8 72 21 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c314:	6a 60                	push   0x60
      e9c316:	5f                   	pop    rdi
      e9c317:	e8 e4 1b 95 00       	call   17edf00 <_Znwm@plt>
      e9c31c:	48 89 c3             	mov    rbx,rax
      e9c31f:	66 0f ef c0          	pxor   xmm0,xmm0
      e9c323:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9c328:	48 89 28             	mov    QWORD PTR [rax],rbp
      e9c32b:	4c 8d 70 20          	lea    r14,[rax+0x20]
      e9c32f:	48 8d 05 c2 10 9a 00 	lea    rax,[rip+0x9a10c2]        # 183d3f8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf390>
      e9c336:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9c33d:	00 
      e9c33e:	4c 89 ac 24 90 07 00 	mov    QWORD PTR [rsp+0x790],r13
      e9c345:	00 
      e9c346:	4c 89 f7             	mov    rdi,r14
      e9c349:	4c 89 ee             	mov    rsi,r13
      e9c34c:	e8 37 af 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9c351:	4c 89 ef             	mov    rdi,r13
      e9c354:	e8 11 dc bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9c359:	66 48 0f 6e c3       	movq   xmm0,rbx
      e9c35e:	66 49 0f 6e ce       	movq   xmm1,r14
      e9c363:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c367:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9c36d:	31 ff                	xor    edi,edi
      e9c36f:	e8 a8 20 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9c374:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
      e9c37b:	00 
      e9c37c:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9c382:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
#### write 0xe9c3d7: mov    QWORD PTR [rsp+0x770],rax
      e9c3af:	0f 84 a3 00 00 00    	je     e9c458 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6386e>
      e9c3b5:	6a 60                	push   0x60
      e9c3b7:	5f                   	pop    rdi
      e9c3b8:	e8 43 1b 95 00       	call   17edf00 <_Znwm@plt>
      e9c3bd:	48 89 c3             	mov    rbx,rax
      e9c3c0:	66 0f ef c0          	pxor   xmm0,xmm0
      e9c3c4:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9c3c9:	48 89 28             	mov    QWORD PTR [rax],rbp
      e9c3cc:	4c 8d 70 20          	lea    r14,[rax+0x20]
      e9c3d0:	48 8d 05 91 12 9a 00 	lea    rax,[rip+0x9a1291]        # 183d668 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf600>
      e9c3d7:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9c3de:	00 
      e9c3df:	48 8b 84 24 80 13 00 	mov    rax,QWORD PTR [rsp+0x1380]
      e9c3e6:	00 
      e9c3e7:	48 89 84 24 78 07 00 	mov    QWORD PTR [rsp+0x778],rax
      e9c3ee:	00 
      e9c3ef:	4c 89 ac 24 90 07 00 	mov    QWORD PTR [rsp+0x790],r13
      e9c3f6:	00 
      e9c3f7:	4c 89 f7             	mov    rdi,r14
      e9c3fa:	4c 89 ee             	mov    rsi,r13
      e9c3fd:	e8 86 ae 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9c402:	4c 89 ef             	mov    rdi,r13
      e9c405:	e8 60 db bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9c40a:	66 48 0f 6e c3       	movq   xmm0,rbx
      e9c40f:	66 49 0f 6e ce       	movq   xmm1,r14
      e9c414:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c418:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9c41e:	31 ff                	xor    edi,edi
      e9c420:	e8 f7 1f c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
#### write 0xe9c4d4: mov    QWORD PTR [rsp+0x770],rax
      e9c4a7:	f3 0f 7f 84 24 78 07 	movdqu XMMWORD PTR [rsp+0x778],xmm0
      e9c4ae:	00 00 
      e9c4b0:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9c4b5:	eb 12                	jmp    e9c4c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x638df>
      e9c4b7:	66 0f d6 84 24 78 07 	movq   QWORD PTR [rsp+0x778],xmm0
      e9c4be:	00 00 
      e9c4c0:	48 83 a4 24 80 07 00 	and    QWORD PTR [rsp+0x780],0x0
      e9c4c7:	00 00 
      e9c4c9:	4d 8d 7e 20          	lea    r15,[r14+0x20]
      e9c4cd:	48 8d 05 4c 0e 9a 00 	lea    rax,[rip+0x9a0e4c]        # 183d320 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf2b8>
      e9c4d4:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9c4db:	00 
      e9c4dc:	4c 89 ac 24 90 07 00 	mov    QWORD PTR [rsp+0x790],r13
      e9c4e3:	00 
      e9c4e4:	4c 89 ff             	mov    rdi,r15
      e9c4e7:	4c 89 ee             	mov    rsi,r13
      e9c4ea:	e8 99 ad 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9c4ef:	4c 89 ef             	mov    rdi,r13
      e9c4f2:	e8 73 da bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9c4f7:	48 89 df             	mov    rdi,rbx
      e9c4fa:	e8 87 1f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c4ff:	66 49 0f 6e c6       	movq   xmm0,r14
      e9c504:	66 49 0f 6e cf       	movq   xmm1,r15
      e9c509:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c50d:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9c513:	31 ff                	xor    edi,edi
      e9c515:	e8 02 1f c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9c51a:	48 89 df             	mov    rdi,rbx
      e9c51d:	e8 64 1f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
#### write 0xe9c5e7: mov    QWORD PTR [rsp+0x770],rax
      e9c5ba:	f3 0f 7f 84 24 78 07 	movdqu XMMWORD PTR [rsp+0x778],xmm0
      e9c5c1:	00 00 
      e9c5c3:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9c5c8:	eb 12                	jmp    e9c5dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x639f2>
      e9c5ca:	66 0f d6 84 24 78 07 	movq   QWORD PTR [rsp+0x778],xmm0
      e9c5d1:	00 00 
      e9c5d3:	48 83 a4 24 80 07 00 	and    QWORD PTR [rsp+0x780],0x0
      e9c5da:	00 00 
      e9c5dc:	4d 8d 7e 20          	lea    r15,[r14+0x20]
      e9c5e0:	48 8d 05 81 0d 9a 00 	lea    rax,[rip+0x9a0d81]        # 183d368 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf300>
      e9c5e7:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9c5ee:	00 
      e9c5ef:	4c 89 ac 24 90 07 00 	mov    QWORD PTR [rsp+0x790],r13
      e9c5f6:	00 
      e9c5f7:	4c 89 ff             	mov    rdi,r15
      e9c5fa:	4c 89 ee             	mov    rsi,r13
      e9c5fd:	e8 86 ac 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9c602:	4c 89 ef             	mov    rdi,r13
      e9c605:	e8 60 d9 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9c60a:	48 89 df             	mov    rdi,rbx
      e9c60d:	e8 74 1e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c612:	66 49 0f 6e c6       	movq   xmm0,r14
      e9c617:	66 49 0f 6e cf       	movq   xmm1,r15
      e9c61c:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c620:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9c626:	31 ff                	xor    edi,edi
      e9c628:	e8 ef 1d c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9c62d:	48 89 df             	mov    rdi,rbx
      e9c630:	e8 51 1e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
#### write 0xe9c6bd: mov    QWORD PTR [rsp+0x770],rcx
      e9c698:	31 c0                	xor    eax,eax
      e9c69a:	45 84 ff             	test   r15b,r15b
      e9c69d:	0f 95 c0             	setne  al
      e9c6a0:	c1 e0 08             	shl    eax,0x8
      e9c6a3:	4c 09 f0             	or     rax,r14
      e9c6a6:	66 0f ef c0          	pxor   xmm0,xmm0
      e9c6aa:	f3 0f 7f 43 08       	movdqu XMMWORD PTR [rbx+0x8],xmm0
      e9c6af:	48 89 2b             	mov    QWORD PTR [rbx],rbp
      e9c6b2:	4c 8d 73 20          	lea    r14,[rbx+0x20]
      e9c6b6:	48 8d 0d 23 0b 9a 00 	lea    rcx,[rip+0x9a0b23]        # 183d1e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf178>
      e9c6bd:	48 89 8c 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rcx
      e9c6c4:	00 
      e9c6c5:	48 8b 8c 24 38 13 00 	mov    rcx,QWORD PTR [rsp+0x1338]
      e9c6cc:	00 
      e9c6cd:	48 89 8c 24 78 07 00 	mov    QWORD PTR [rsp+0x778],rcx
      e9c6d4:	00 
      e9c6d5:	48 89 84 24 80 07 00 	mov    QWORD PTR [rsp+0x780],rax
      e9c6dc:	00 
      e9c6dd:	4c 89 ac 24 90 07 00 	mov    QWORD PTR [rsp+0x790],r13
      e9c6e4:	00 
      e9c6e5:	4c 89 f7             	mov    rdi,r14
      e9c6e8:	4c 89 ee             	mov    rsi,r13
      e9c6eb:	e8 98 ab 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9c6f0:	4c 89 ef             	mov    rdi,r13
      e9c6f3:	e8 72 d8 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9c6f8:	66 48 0f 6e c3       	movq   xmm0,rbx
      e9c6fd:	66 49 0f 6e ce       	movq   xmm1,r14
      e9c702:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c706:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1

### rsp+0x780 before 0xe9ff24
#### write 0xe9bdd8: and    QWORD PTR [rsp+0x780],0x0
      e9bdb0:	4d 85 f6             	test   r14,r14
      e9bdb3:	44 88 64 24 26       	mov    BYTE PTR [rsp+0x26],r12b
      e9bdb8:	74 15                	je     e9bdcf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x631e5>
      e9bdba:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9bdbf:	f3 0f 7f 84 24 78 07 	movdqu XMMWORD PTR [rsp+0x778],xmm0
      e9bdc6:	00 00 
      e9bdc8:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9bdcd:	eb 12                	jmp    e9bde1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x631f7>
      e9bdcf:	66 0f d6 84 24 78 07 	movq   QWORD PTR [rsp+0x778],xmm0
      e9bdd6:	00 00 
      e9bdd8:	48 83 a4 24 80 07 00 	and    QWORD PTR [rsp+0x780],0x0
      e9bddf:	00 00 
      e9bde1:	4d 8d 67 20          	lea    r12,[r15+0x20]
      e9bde5:	48 8d 05 6c 14 9a 00 	lea    rax,[rip+0x9a146c]        # 183d258 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf1f0>
      e9bdec:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9bdf3:	00 
      e9bdf4:	48 89 9c 24 90 07 00 	mov    QWORD PTR [rsp+0x790],rbx
      e9bdfb:	00 
      e9bdfc:	4c 89 e7             	mov    rdi,r12
      e9bdff:	48 89 de             	mov    rsi,rbx
      e9be02:	e8 81 b4 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9be07:	48 89 df             	mov    rdi,rbx
      e9be0a:	e8 5b e1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9be0f:	4c 89 f7             	mov    rdi,r14
      e9be12:	e8 6f 26 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9be17:	66 49 0f 6e c7       	movq   xmm0,r15
      e9be1c:	66 49 0f 6e cc       	movq   xmm1,r12
      e9be21:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9be25:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
#### write 0xe9bffa: and    QWORD PTR [rsp+0x780],0x0
      e9bfd0:	66 49 0f 3a 16 c6 01 	pextrq r14,xmm0,0x1
      e9bfd7:	4d 85 f6             	test   r14,r14
      e9bfda:	74 15                	je     e9bff1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63407>
      e9bfdc:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9bfe1:	f3 0f 7f 84 24 78 07 	movdqu XMMWORD PTR [rsp+0x778],xmm0
      e9bfe8:	00 00 
      e9bfea:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9bfef:	eb 12                	jmp    e9c003 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63419>
      e9bff1:	66 0f d6 84 24 78 07 	movq   QWORD PTR [rsp+0x778],xmm0
      e9bff8:	00 00 
      e9bffa:	48 83 a4 24 80 07 00 	and    QWORD PTR [rsp+0x780],0x0
      e9c001:	00 00 
      e9c003:	4d 8d 67 20          	lea    r12,[r15+0x20]
      e9c007:	48 8d 05 62 14 9a 00 	lea    rax,[rip+0x9a1462]        # 183d470 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf408>
      e9c00e:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9c015:	00 
      e9c016:	48 89 9c 24 90 07 00 	mov    QWORD PTR [rsp+0x790],rbx
      e9c01d:	00 
      e9c01e:	4c 89 e7             	mov    rdi,r12
      e9c021:	48 89 de             	mov    rsi,rbx
      e9c024:	e8 5f b2 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9c029:	48 89 df             	mov    rdi,rbx
      e9c02c:	e8 39 df bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9c031:	4c 89 f7             	mov    rdi,r14
      e9c034:	e8 4d 24 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c039:	66 49 0f 6e c7       	movq   xmm0,r15
      e9c03e:	66 49 0f 6e cc       	movq   xmm1,r12
      e9c043:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c047:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
#### write 0xe9c4c0: and    QWORD PTR [rsp+0x780],0x0
      e9c496:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
      e9c49d:	48 85 db             	test   rbx,rbx
      e9c4a0:	74 15                	je     e9c4b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x638cd>
      e9c4a2:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9c4a7:	f3 0f 7f 84 24 78 07 	movdqu XMMWORD PTR [rsp+0x778],xmm0
      e9c4ae:	00 00 
      e9c4b0:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9c4b5:	eb 12                	jmp    e9c4c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x638df>
      e9c4b7:	66 0f d6 84 24 78 07 	movq   QWORD PTR [rsp+0x778],xmm0
      e9c4be:	00 00 
      e9c4c0:	48 83 a4 24 80 07 00 	and    QWORD PTR [rsp+0x780],0x0
      e9c4c7:	00 00 
      e9c4c9:	4d 8d 7e 20          	lea    r15,[r14+0x20]
      e9c4cd:	48 8d 05 4c 0e 9a 00 	lea    rax,[rip+0x9a0e4c]        # 183d320 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf2b8>
      e9c4d4:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9c4db:	00 
      e9c4dc:	4c 89 ac 24 90 07 00 	mov    QWORD PTR [rsp+0x790],r13
      e9c4e3:	00 
      e9c4e4:	4c 89 ff             	mov    rdi,r15
      e9c4e7:	4c 89 ee             	mov    rsi,r13
      e9c4ea:	e8 99 ad 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9c4ef:	4c 89 ef             	mov    rdi,r13
      e9c4f2:	e8 73 da bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9c4f7:	48 89 df             	mov    rdi,rbx
      e9c4fa:	e8 87 1f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c4ff:	66 49 0f 6e c6       	movq   xmm0,r14
      e9c504:	66 49 0f 6e cf       	movq   xmm1,r15
      e9c509:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c50d:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
#### write 0xe9c5d3: and    QWORD PTR [rsp+0x780],0x0
      e9c5a9:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
      e9c5b0:	48 85 db             	test   rbx,rbx
      e9c5b3:	74 15                	je     e9c5ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x639e0>
      e9c5b5:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9c5ba:	f3 0f 7f 84 24 78 07 	movdqu XMMWORD PTR [rsp+0x778],xmm0
      e9c5c1:	00 00 
      e9c5c3:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9c5c8:	eb 12                	jmp    e9c5dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x639f2>
      e9c5ca:	66 0f d6 84 24 78 07 	movq   QWORD PTR [rsp+0x778],xmm0
      e9c5d1:	00 00 
      e9c5d3:	48 83 a4 24 80 07 00 	and    QWORD PTR [rsp+0x780],0x0
      e9c5da:	00 00 
      e9c5dc:	4d 8d 7e 20          	lea    r15,[r14+0x20]
      e9c5e0:	48 8d 05 81 0d 9a 00 	lea    rax,[rip+0x9a0d81]        # 183d368 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf300>
      e9c5e7:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9c5ee:	00 
      e9c5ef:	4c 89 ac 24 90 07 00 	mov    QWORD PTR [rsp+0x790],r13
      e9c5f6:	00 
      e9c5f7:	4c 89 ff             	mov    rdi,r15
      e9c5fa:	4c 89 ee             	mov    rsi,r13
      e9c5fd:	e8 86 ac 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9c602:	4c 89 ef             	mov    rdi,r13
      e9c605:	e8 60 d9 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9c60a:	48 89 df             	mov    rdi,rbx
      e9c60d:	e8 74 1e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c612:	66 49 0f 6e c6       	movq   xmm0,r14
      e9c617:	66 49 0f 6e cf       	movq   xmm1,r15
      e9c61c:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c620:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
#### write 0xe9c6d5: mov    QWORD PTR [rsp+0x780],rax
      e9c6aa:	f3 0f 7f 43 08       	movdqu XMMWORD PTR [rbx+0x8],xmm0
      e9c6af:	48 89 2b             	mov    QWORD PTR [rbx],rbp
      e9c6b2:	4c 8d 73 20          	lea    r14,[rbx+0x20]
      e9c6b6:	48 8d 0d 23 0b 9a 00 	lea    rcx,[rip+0x9a0b23]        # 183d1e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf178>
      e9c6bd:	48 89 8c 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rcx
      e9c6c4:	00 
      e9c6c5:	48 8b 8c 24 38 13 00 	mov    rcx,QWORD PTR [rsp+0x1338]
      e9c6cc:	00 
      e9c6cd:	48 89 8c 24 78 07 00 	mov    QWORD PTR [rsp+0x778],rcx
      e9c6d4:	00 
      e9c6d5:	48 89 84 24 80 07 00 	mov    QWORD PTR [rsp+0x780],rax
      e9c6dc:	00 
      e9c6dd:	4c 89 ac 24 90 07 00 	mov    QWORD PTR [rsp+0x790],r13
      e9c6e4:	00 
      e9c6e5:	4c 89 f7             	mov    rdi,r14
      e9c6e8:	4c 89 ee             	mov    rsi,r13
      e9c6eb:	e8 98 ab 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9c6f0:	4c 89 ef             	mov    rdi,r13
      e9c6f3:	e8 72 d8 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9c6f8:	66 48 0f 6e c3       	movq   xmm0,rbx
      e9c6fd:	66 49 0f 6e ce       	movq   xmm1,r14
      e9c702:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c706:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9c70c:	31 ff                	xor    edi,edi
      e9c70e:	e8 09 1d c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9c713:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
      e9c71a:	00 
      e9c71b:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9c721:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0

### rsp+0x790 before 0xe9ff24
#### write 0xe9bdf4: mov    QWORD PTR [rsp+0x790],rbx
      e9bdc8:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9bdcd:	eb 12                	jmp    e9bde1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x631f7>
      e9bdcf:	66 0f d6 84 24 78 07 	movq   QWORD PTR [rsp+0x778],xmm0
      e9bdd6:	00 00 
      e9bdd8:	48 83 a4 24 80 07 00 	and    QWORD PTR [rsp+0x780],0x0
      e9bddf:	00 00 
      e9bde1:	4d 8d 67 20          	lea    r12,[r15+0x20]
      e9bde5:	48 8d 05 6c 14 9a 00 	lea    rax,[rip+0x9a146c]        # 183d258 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf1f0>
      e9bdec:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9bdf3:	00 
      e9bdf4:	48 89 9c 24 90 07 00 	mov    QWORD PTR [rsp+0x790],rbx
      e9bdfb:	00 
      e9bdfc:	4c 89 e7             	mov    rdi,r12
      e9bdff:	48 89 de             	mov    rsi,rbx
      e9be02:	e8 81 b4 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9be07:	48 89 df             	mov    rdi,rbx
      e9be0a:	e8 5b e1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9be0f:	4c 89 f7             	mov    rdi,r14
      e9be12:	e8 6f 26 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9be17:	66 49 0f 6e c7       	movq   xmm0,r15
      e9be1c:	66 49 0f 6e cc       	movq   xmm1,r12
      e9be21:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9be25:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9be2b:	31 ff                	xor    edi,edi
      e9be2d:	e8 ea 25 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9be32:	4c 89 f7             	mov    rdi,r14
      e9be35:	e8 4c 26 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9be3a:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9be41:	00 
#### write 0xe9bf03: mov    QWORD PTR [rsp+0x790],rbx
      e9bedb:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9bee0:	eb 15                	jmp    e9bef7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6330d>
      e9bee2:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9bee9:	00 
      e9beea:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9beef:	0f 11 84 24 78 07 00 	movups XMMWORD PTR [rsp+0x778],xmm0
      e9bef6:	00 
      e9bef7:	4d 8d 67 20          	lea    r12,[r15+0x20]
      e9befb:	48 89 8c 24 88 07 00 	mov    QWORD PTR [rsp+0x788],rcx
      e9bf02:	00 
      e9bf03:	48 89 9c 24 90 07 00 	mov    QWORD PTR [rsp+0x790],rbx
      e9bf0a:	00 
      e9bf0b:	4c 89 e7             	mov    rdi,r12
      e9bf0e:	48 89 de             	mov    rsi,rbx
      e9bf11:	e8 72 b3 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9bf16:	48 89 df             	mov    rdi,rbx
      e9bf19:	e8 4c e0 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9bf1e:	4c 89 f7             	mov    rdi,r14
      e9bf21:	e8 60 25 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9bf26:	66 49 0f 6e c7       	movq   xmm0,r15
      e9bf2b:	66 49 0f 6e cc       	movq   xmm1,r12
      e9bf30:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9bf34:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9bf3a:	31 ff                	xor    edi,edi
      e9bf3c:	e8 db 24 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9bf41:	4c 89 f7             	mov    rdi,r14
      e9bf44:	e8 3d 25 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9bf49:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9bf50:	00 
#### write 0xe9c016: mov    QWORD PTR [rsp+0x790],rbx
      e9bfea:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9bfef:	eb 12                	jmp    e9c003 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63419>
      e9bff1:	66 0f d6 84 24 78 07 	movq   QWORD PTR [rsp+0x778],xmm0
      e9bff8:	00 00 
      e9bffa:	48 83 a4 24 80 07 00 	and    QWORD PTR [rsp+0x780],0x0
      e9c001:	00 00 
      e9c003:	4d 8d 67 20          	lea    r12,[r15+0x20]
      e9c007:	48 8d 05 62 14 9a 00 	lea    rax,[rip+0x9a1462]        # 183d470 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf408>
      e9c00e:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9c015:	00 
      e9c016:	48 89 9c 24 90 07 00 	mov    QWORD PTR [rsp+0x790],rbx
      e9c01d:	00 
      e9c01e:	4c 89 e7             	mov    rdi,r12
      e9c021:	48 89 de             	mov    rsi,rbx
      e9c024:	e8 5f b2 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9c029:	48 89 df             	mov    rdi,rbx
      e9c02c:	e8 39 df bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9c031:	4c 89 f7             	mov    rdi,r14
      e9c034:	e8 4d 24 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c039:	66 49 0f 6e c7       	movq   xmm0,r15
      e9c03e:	66 49 0f 6e cc       	movq   xmm1,r12
      e9c043:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c047:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9c04d:	31 ff                	xor    edi,edi
      e9c04f:	e8 c8 23 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9c054:	4c 89 f7             	mov    rdi,r14
      e9c057:	e8 2a 24 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c05c:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9c063:	00 
#### write 0xe9c33e: mov    QWORD PTR [rsp+0x790],r13
      e9c316:	5f                   	pop    rdi
      e9c317:	e8 e4 1b 95 00       	call   17edf00 <_Znwm@plt>
      e9c31c:	48 89 c3             	mov    rbx,rax
      e9c31f:	66 0f ef c0          	pxor   xmm0,xmm0
      e9c323:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9c328:	48 89 28             	mov    QWORD PTR [rax],rbp
      e9c32b:	4c 8d 70 20          	lea    r14,[rax+0x20]
      e9c32f:	48 8d 05 c2 10 9a 00 	lea    rax,[rip+0x9a10c2]        # 183d3f8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf390>
      e9c336:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9c33d:	00 
      e9c33e:	4c 89 ac 24 90 07 00 	mov    QWORD PTR [rsp+0x790],r13
      e9c345:	00 
      e9c346:	4c 89 f7             	mov    rdi,r14
      e9c349:	4c 89 ee             	mov    rsi,r13
      e9c34c:	e8 37 af 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9c351:	4c 89 ef             	mov    rdi,r13
      e9c354:	e8 11 dc bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9c359:	66 48 0f 6e c3       	movq   xmm0,rbx
      e9c35e:	66 49 0f 6e ce       	movq   xmm1,r14
      e9c363:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c367:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9c36d:	31 ff                	xor    edi,edi
      e9c36f:	e8 a8 20 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9c374:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
      e9c37b:	00 
      e9c37c:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9c382:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
      e9c386:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      e9c38d:	00 
#### write 0xe9c3ef: mov    QWORD PTR [rsp+0x790],r13
      e9c3c4:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9c3c9:	48 89 28             	mov    QWORD PTR [rax],rbp
      e9c3cc:	4c 8d 70 20          	lea    r14,[rax+0x20]
      e9c3d0:	48 8d 05 91 12 9a 00 	lea    rax,[rip+0x9a1291]        # 183d668 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf600>
      e9c3d7:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9c3de:	00 
      e9c3df:	48 8b 84 24 80 13 00 	mov    rax,QWORD PTR [rsp+0x1380]
      e9c3e6:	00 
      e9c3e7:	48 89 84 24 78 07 00 	mov    QWORD PTR [rsp+0x778],rax
      e9c3ee:	00 
      e9c3ef:	4c 89 ac 24 90 07 00 	mov    QWORD PTR [rsp+0x790],r13
      e9c3f6:	00 
      e9c3f7:	4c 89 f7             	mov    rdi,r14
      e9c3fa:	4c 89 ee             	mov    rsi,r13
      e9c3fd:	e8 86 ae 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9c402:	4c 89 ef             	mov    rdi,r13
      e9c405:	e8 60 db bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9c40a:	66 48 0f 6e c3       	movq   xmm0,rbx
      e9c40f:	66 49 0f 6e ce       	movq   xmm1,r14
      e9c414:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c418:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9c41e:	31 ff                	xor    edi,edi
      e9c420:	e8 f7 1f c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9c425:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
      e9c42c:	00 
      e9c42d:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9c433:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
      e9c437:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      e9c43e:	00 
#### write 0xe9c4dc: mov    QWORD PTR [rsp+0x790],r13
      e9c4b0:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9c4b5:	eb 12                	jmp    e9c4c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x638df>
      e9c4b7:	66 0f d6 84 24 78 07 	movq   QWORD PTR [rsp+0x778],xmm0
      e9c4be:	00 00 
      e9c4c0:	48 83 a4 24 80 07 00 	and    QWORD PTR [rsp+0x780],0x0
      e9c4c7:	00 00 
      e9c4c9:	4d 8d 7e 20          	lea    r15,[r14+0x20]
      e9c4cd:	48 8d 05 4c 0e 9a 00 	lea    rax,[rip+0x9a0e4c]        # 183d320 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf2b8>
      e9c4d4:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9c4db:	00 
      e9c4dc:	4c 89 ac 24 90 07 00 	mov    QWORD PTR [rsp+0x790],r13
      e9c4e3:	00 
      e9c4e4:	4c 89 ff             	mov    rdi,r15
      e9c4e7:	4c 89 ee             	mov    rsi,r13
      e9c4ea:	e8 99 ad 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9c4ef:	4c 89 ef             	mov    rdi,r13
      e9c4f2:	e8 73 da bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9c4f7:	48 89 df             	mov    rdi,rbx
      e9c4fa:	e8 87 1f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c4ff:	66 49 0f 6e c6       	movq   xmm0,r14
      e9c504:	66 49 0f 6e cf       	movq   xmm1,r15
      e9c509:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c50d:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9c513:	31 ff                	xor    edi,edi
      e9c515:	e8 02 1f c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9c51a:	48 89 df             	mov    rdi,rbx
      e9c51d:	e8 64 1f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c522:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
      e9c529:	00 
#### write 0xe9c5ef: mov    QWORD PTR [rsp+0x790],r13
      e9c5c3:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9c5c8:	eb 12                	jmp    e9c5dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x639f2>
      e9c5ca:	66 0f d6 84 24 78 07 	movq   QWORD PTR [rsp+0x778],xmm0
      e9c5d1:	00 00 
      e9c5d3:	48 83 a4 24 80 07 00 	and    QWORD PTR [rsp+0x780],0x0
      e9c5da:	00 00 
      e9c5dc:	4d 8d 7e 20          	lea    r15,[r14+0x20]
      e9c5e0:	48 8d 05 81 0d 9a 00 	lea    rax,[rip+0x9a0d81]        # 183d368 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf300>
      e9c5e7:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9c5ee:	00 
      e9c5ef:	4c 89 ac 24 90 07 00 	mov    QWORD PTR [rsp+0x790],r13
      e9c5f6:	00 
      e9c5f7:	4c 89 ff             	mov    rdi,r15
      e9c5fa:	4c 89 ee             	mov    rsi,r13
      e9c5fd:	e8 86 ac 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9c602:	4c 89 ef             	mov    rdi,r13
      e9c605:	e8 60 d9 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9c60a:	48 89 df             	mov    rdi,rbx
      e9c60d:	e8 74 1e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c612:	66 49 0f 6e c6       	movq   xmm0,r14
      e9c617:	66 49 0f 6e cf       	movq   xmm1,r15
      e9c61c:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c620:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9c626:	31 ff                	xor    edi,edi
      e9c628:	e8 ef 1d c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9c62d:	48 89 df             	mov    rdi,rbx
      e9c630:	e8 51 1e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c635:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
      e9c63c:	00 
#### write 0xe9c6dd: mov    QWORD PTR [rsp+0x790],r13
      e9c6b2:	4c 8d 73 20          	lea    r14,[rbx+0x20]
      e9c6b6:	48 8d 0d 23 0b 9a 00 	lea    rcx,[rip+0x9a0b23]        # 183d1e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf178>
      e9c6bd:	48 89 8c 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rcx
      e9c6c4:	00 
      e9c6c5:	48 8b 8c 24 38 13 00 	mov    rcx,QWORD PTR [rsp+0x1338]
      e9c6cc:	00 
      e9c6cd:	48 89 8c 24 78 07 00 	mov    QWORD PTR [rsp+0x778],rcx
      e9c6d4:	00 
      e9c6d5:	48 89 84 24 80 07 00 	mov    QWORD PTR [rsp+0x780],rax
      e9c6dc:	00 
      e9c6dd:	4c 89 ac 24 90 07 00 	mov    QWORD PTR [rsp+0x790],r13
      e9c6e4:	00 
      e9c6e5:	4c 89 f7             	mov    rdi,r14
      e9c6e8:	4c 89 ee             	mov    rsi,r13
      e9c6eb:	e8 98 ab 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9c6f0:	4c 89 ef             	mov    rdi,r13
      e9c6f3:	e8 72 d8 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9c6f8:	66 48 0f 6e c3       	movq   xmm0,rbx
      e9c6fd:	66 49 0f 6e ce       	movq   xmm1,r14
      e9c702:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c706:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9c70c:	31 ff                	xor    edi,edi
      e9c70e:	e8 09 1d c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9c713:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
      e9c71a:	00 
      e9c71b:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9c721:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
      e9c725:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      e9c72c:	00 

### rsp+0x1060 before 0xea01e4
#### write 0xe9f1a6: mov    QWORD PTR [rsp+0x1060],rax
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
      e9f1a6:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f1ad:	00 
      e9f1ae:	f3 0f 7f 84 24 68 10 	movdqu XMMWORD PTR [rsp+0x1068],xmm0
      e9f1b5:	00 00 
      e9f1b7:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9f1be:	00 
      e9f1bf:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f1c6:	00 
      e9f1c7:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f1ce:	00 
      e9f1cf:	48 89 da             	mov    rdx,rbx
      e9f1d2:	e8 d1 78 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f1d7:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9f1de:	00 
      e9f1df:	e8 86 ad bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f1e4:	4c 89 ff             	mov    rdi,r15
      e9f1e7:	e8 9a f2 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9f1ec:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f1f3:	00 
#### write 0xe9f2a3: mov    QWORD PTR [rsp+0x1060],rcx
      e9f279:	e8 c2 ec 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f27e:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9f284:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
      e9f28b:	48 85 db             	test   rbx,rbx
      e9f28e:	74 0a                	je     e9f29a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x666b0>
      e9f290:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9f295:	48 89 d8             	mov    rax,rbx
      e9f298:	eb 02                	jmp    e9f29c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x666b2>
      e9f29a:	31 c0                	xor    eax,eax
      e9f29c:	48 8d 0d 15 65 99 00 	lea    rcx,[rip+0x996515]        # 18357b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7750>
      e9f2a3:	48 89 8c 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rcx
      e9f2aa:	00 
      e9f2ab:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9f2b0:	0f 11 84 24 68 10 00 	movups XMMWORD PTR [rsp+0x1068],xmm0
      e9f2b7:	00 
      e9f2b8:	4c 89 bc 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r15
      e9f2bf:	00 
      e9f2c0:	48 85 c0             	test   rax,rax
      e9f2c3:	74 05                	je     e9f2ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x666e0>
      e9f2c5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9f2ca:	48 8d 0d f7 66 99 00 	lea    rcx,[rip+0x9966f7]        # 18359c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7960>
      e9f2d1:	48 89 8c 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rcx
      e9f2d8:	00 
      e9f2d9:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9f2df:	66 0f d6 84 24 08 0d 	movq   QWORD PTR [rsp+0xd08],xmm0
      e9f2e6:	00 00 
      e9f2e8:	48 89 84 24 10 0d 00 	mov    QWORD PTR [rsp+0xd10],rax
      e9f2ef:	00 
      e9f2f0:	48 89 ac 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],rbp
#### write 0xe9f4b3: mov    QWORD PTR [rsp+0x1060],rax
      e9f485:	00 
      e9f486:	e8 6d fc fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f48b:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f492:	00 
      e9f493:	e8 d6 8d ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f498:	48 8d 35 c1 59 53 ff 	lea    rsi,[rip+0xffffffffff5359c1]        # 3d4e60 <_ZTSN5boost17bad_function_callE@@Base+0x21a6>
      e9f49f:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f4a6:	00 
      e9f4a7:	e8 94 ea 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f4ac:	48 8d 05 85 75 99 00 	lea    rax,[rip+0x997585]        # 1836a38 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x89d0>
      e9f4b3:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f4ba:	00 
      e9f4bb:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9f4c2:	00 
      e9f4c3:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f4ca:	00 
      e9f4cb:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f4d2:	00 
      e9f4d3:	48 89 da             	mov    rdx,rbx
      e9f4d6:	e8 cd 75 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f4db:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9f4e2:	00 
      e9f4e3:	e8 82 aa bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f4e8:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f4ef:	00 
      e9f4f0:	e8 9b e9 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f4f5:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f4fc:	00 
      e9f4fd:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
#### write 0xe9f5b1: movdqa XMMWORD PTR [rsp+0x1060],xmm0
      e9f585:	00 00 
      e9f587:	bf 80 00 00 00       	mov    edi,0x80
      e9f58c:	e8 6f e9 94 00       	call   17edf00 <_Znwm@plt>
      e9f591:	49 89 c6             	mov    r14,rax
      e9f594:	48 8d 05 75 76 99 00 	lea    rax,[rip+0x997675]        # 1836c10 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8ba8>
      e9f59b:	49 89 06             	mov    QWORD PTR [r14],rax
      e9f59e:	66 0f 6f 84 24 60 10 	movdqa xmm0,XMMWORD PTR [rsp+0x1060]
      e9f5a5:	00 00 
      e9f5a7:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      e9f5ad:	66 0f ef c0          	pxor   xmm0,xmm0
      e9f5b1:	66 0f 7f 84 24 60 10 	movdqa XMMWORD PTR [rsp+0x1060],xmm0
      e9f5b8:	00 00 
      e9f5ba:	4c 89 f7             	mov    rdi,r14
      e9f5bd:	48 83 c7 18          	add    rdi,0x18
      e9f5c1:	48 89 de             	mov    rsi,rbx
      e9f5c4:	e8 f3 84 0d 00       	call   f77abc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13eed2>
      e9f5c9:	48 8d 94 24 00 0d 00 	lea    rdx,[rsp+0xd00]
      e9f5d0:	00 
      e9f5d1:	4c 89 72 20          	mov    QWORD PTR [rdx+0x20],r14
      e9f5d5:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f5dc:	00 
      e9f5dd:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
      e9f5e4:	00 
      e9f5e5:	e8 be 74 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f5ea:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f5f1:	00 
      e9f5f2:	e8 73 a9 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f5f7:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      e9f5fe:	00 
#### write 0xe9f665: mov    QWORD PTR [rsp+0x1060],rax
      e9f636:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      e9f63d:	00 
      e9f63e:	e8 b7 84 0d 00       	call   f77afa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13ef10>
      e9f643:	31 ff                	xor    edi,edi
      e9f645:	e8 3c ee bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9f64a:	48 8d 35 9f 58 53 ff 	lea    rsi,[rip+0xffffffffff53589f]        # 3d4ef0 <_ZTSN5boost17bad_function_callE@@Base+0x2236>
      e9f651:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f658:	00 
      e9f659:	e8 e2 e8 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f65e:	48 8d 05 e3 7d 99 00 	lea    rax,[rip+0x997de3]        # 1837448 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x93e0>
      e9f665:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f66c:	00 
      e9f66d:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9f674:	00 
      e9f675:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f67c:	00 
      e9f67d:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f684:	00 
      e9f685:	48 89 da             	mov    rdx,rbx
      e9f688:	e8 1b 74 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f68d:	4c 8d b4 24 60 10 00 	lea    r14,[rsp+0x1060]
      e9f694:	00 
      e9f695:	4c 89 f7             	mov    rdi,r14
      e9f698:	e8 cd a8 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f69d:	4c 8d bc 24 00 0d 00 	lea    r15,[rsp+0xd00]
      e9f6a4:	00 
      e9f6a5:	4c 89 ff             	mov    rdi,r15
      e9f6a8:	e8 e3 e7 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f6ad:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
#### write 0xe9f6f8: mov    QWORD PTR [rsp+0x1060],rax
      e9f6c9:	00 
      e9f6ca:	e8 9f 8b ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f6cf:	80 bc 24 67 07 00 00 	cmp    BYTE PTR [rsp+0x767],0x0
      e9f6d6:	00 
      e9f6d7:	0f 84 8f 00 00 00    	je     e9f76c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66b82>
      e9f6dd:	48 8d 35 bc 59 53 ff 	lea    rsi,[rip+0xffffffffff5359bc]        # 3d50a0 <_ZTSN5boost17bad_function_callE@@Base+0x23e6>
      e9f6e4:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f6eb:	00 
      e9f6ec:	e8 4f e8 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f6f1:	48 8d 05 38 a5 99 00 	lea    rax,[rip+0x99a538]        # 1839c30 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xbbc8>
      e9f6f8:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f6ff:	00 
      e9f700:	48 8b 84 24 80 13 00 	mov    rax,QWORD PTR [rsp+0x1380]
      e9f707:	00 
      e9f708:	48 89 84 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rax
      e9f70f:	00 
      e9f710:	4c 89 b4 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r14
      e9f717:	00 
      e9f718:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f71f:	00 
      e9f720:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f727:	00 
      e9f728:	4c 89 f2             	mov    rdx,r14
      e9f72b:	e8 78 73 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f730:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9f737:	00 
      e9f738:	e8 2d a8 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f73d:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f744:	00 
#### write 0xe9f93c: mov    QWORD PTR [rsp+0x1060],rax
      e9f90c:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f913:	00 
      e9f914:	e8 55 89 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f919:	48 89 df             	mov    rdi,rbx
      e9f91c:	e8 65 eb bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9f921:	48 8d 35 68 55 53 ff 	lea    rsi,[rip+0xffffffffff535568]        # 3d4e90 <_ZTSN5boost17bad_function_callE@@Base+0x21d6>
      e9f928:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9f92f:	00 
      e9f930:	e8 0b e6 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f935:	48 8d 05 ac 74 99 00 	lea    rax,[rip+0x9974ac]        # 1836de8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8d80>
      e9f93c:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f943:	00 
      e9f944:	4c 89 b4 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r14
      e9f94b:	00 
      e9f94c:	48 8d 05 dd 74 99 00 	lea    rax,[rip+0x9974dd]        # 1836e30 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8dc8>
      e9f953:	48 89 84 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rax
      e9f95a:	00 
      e9f95b:	4c 89 bc 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],r15
      e9f962:	00 
      e9f963:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
      e9f96a:	00 
      e9f96b:	4c 8d a4 24 30 0b 00 	lea    r12,[rsp+0xb30]
      e9f972:	00 
      e9f973:	48 89 df             	mov    rdi,rbx
      e9f976:	4c 89 e6             	mov    rsi,r12
      e9f979:	4c 89 f2             	mov    rdx,r14
      e9f97c:	4c 89 f9             	mov    rcx,r15
      e9f97f:	e8 c2 87 ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9f984:	4c 89 ff             	mov    rdi,r15
#### write 0xe9ff00: mov    QWORD PTR [rsp+0x1060],rax
      e9fed7:	66 0f 7f 84 24 00 09 	movdqa XMMWORD PTR [rsp+0x900],xmm0
      e9fede:	00 00 
      e9fee0:	48 85 c0             	test   rax,rax
      e9fee3:	74 05                	je     e9feea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67300>
      e9fee5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9feea:	48 83 a4 24 50 0b 00 	and    QWORD PTR [rsp+0xb50],0x0
      e9fef1:	00 00 
      e9fef3:	bf b0 01 00 00       	mov    edi,0x1b0
      e9fef8:	e8 03 e0 94 00       	call   17edf00 <_Znwm@plt>
      e9fefd:	49 89 c4             	mov    r12,rax
      e9ff00:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9ff07:	00 
      e9ff08:	48 8d 84 24 d0 0e 00 	lea    rax,[rsp+0xed0]
      e9ff0f:	00 
      e9ff10:	48 89 84 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rax
      e9ff17:	00 
      e9ff18:	48 c7 84 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],0x1
      e9ff1f:	00 01 00 00 00 
      e9ff24:	48 8d 05 ed 44 99 00 	lea    rax,[rip+0x9944ed]        # 1834418 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x63b0>
      e9ff2b:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e9ff2f:	0f 28 84 24 70 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x770]
      e9ff36:	00 
      e9ff37:	41 0f 29 44 24 10    	movaps XMMWORD PTR [r12+0x10],xmm0
      e9ff3d:	48 8b 84 24 88 07 00 	mov    rax,QWORD PTR [rsp+0x788]
      e9ff44:	00 
      e9ff45:	0f 28 84 24 80 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x780]
      e9ff4c:	00 
      e9ff4d:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
      e9ff53:	48 85 c0             	test   rax,rax

### rsp+0x1070 before 0xea01e4
#### write 0xe9b716: mov    QWORD PTR [rsp+0x1070],rbp
      e9b6ed:	48 8b 8c 24 70 13 00 	mov    rcx,QWORD PTR [rsp+0x1370]
      e9b6f4:	00 
      e9b6f5:	e8 b4 e8 04 00       	call   ee9fae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb13c4>
      e9b6fa:	31 ff                	xor    edi,edi
      e9b6fc:	e8 1b 2d c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9b701:	4c 89 a4 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],r12
      e9b708:	00 
      e9b709:	48 89 9c 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rbx
      e9b710:	00 
      e9b711:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9b716:	48 89 ac 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],rbp
      e9b71d:	00 
      e9b71e:	4c 89 bc 24 78 10 00 	mov    QWORD PTR [rsp+0x1078],r15
      e9b725:	00 
      e9b726:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9b72b:	48 83 a4 24 90 07 00 	and    QWORD PTR [rsp+0x790],0x0
      e9b732:	00 00 
      e9b734:	6a 28                	push   0x28
      e9b736:	5f                   	pop    rdi
      e9b737:	e8 c4 27 95 00       	call   17edf00 <_Znwm@plt>
      e9b73c:	48 8d 8c 24 70 10 00 	lea    rcx,[rsp+0x1070]
      e9b743:	00 
      e9b744:	48 8d 15 5d 90 99 00 	lea    rdx,[rip+0x99905d]        # 18347a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6740>
      e9b74b:	48 89 10             	mov    QWORD PTR [rax],rdx
      e9b74e:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
      e9b752:	48 89 58 10          	mov    QWORD PTR [rax+0x10],rbx
      e9b756:	66 0f ef c0          	pxor   xmm0,xmm0
      e9b75a:	66 0f 7f 41 f0       	movdqa XMMWORD PTR [rcx-0x10],xmm0
      e9b75f:	48 89 68 18          	mov    QWORD PTR [rax+0x18],rbp
#### write 0xe9d331: mov    QWORD PTR [rsp+0x1070],0x1
      e9d30a:	01 
      e9d30b:	48 83 a4 24 50 0b 00 	and    QWORD PTR [rsp+0xb50],0x0
      e9d312:	00 00 
      e9d314:	bf 50 01 00 00       	mov    edi,0x150
      e9d319:	e8 e2 0b 95 00       	call   17edf00 <_Znwm@plt>
      e9d31e:	48 89 c3             	mov    rbx,rax
      e9d321:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9d328:	00 
      e9d329:	48 89 ac 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rbp
      e9d330:	00 
      e9d331:	48 c7 84 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],0x1
      e9d338:	00 01 00 00 00 
      e9d33d:	48 8d 05 04 a8 99 00 	lea    rax,[rip+0x99a804]        # 1837b48 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x9ae0>
      e9d344:	48 89 03             	mov    QWORD PTR [rbx],rax
      e9d347:	48 8b 84 24 70 07 00 	mov    rax,QWORD PTR [rsp+0x770]
      e9d34e:	00 
      e9d34f:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      e9d353:	48 8d 6b 20          	lea    rbp,[rbx+0x20]
      e9d357:	48 89 ef             	mov    rdi,rbp
      e9d35a:	4c 89 e6             	mov    rsi,r12
      e9d35d:	e8 2e cf bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d362:	48 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],rbp
      e9d367:	4c 8d 63 50          	lea    r12,[rbx+0x50]
      e9d36b:	4c 89 e7             	mov    rdi,r12
      e9d36e:	4c 89 f6             	mov    rsi,r14
      e9d371:	e8 1a cf bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d376:	44 89 fd             	mov    ebp,r15d
      e9d379:	4c 8d b3 80 00 00 00 	lea    r14,[rbx+0x80]
      e9d380:	4c 89 f7             	mov    rdi,r14
#### write 0xe9e1aa: mov    BYTE PTR [rsp+0x1070],bl
      e9e17e:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9e185:	00 
      e9e186:	e8 b5 fd 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9e18b:	48 8d 05 26 ae 99 00 	lea    rax,[rip+0x99ae26]        # 1838fb8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xaf50>
      e9e192:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9e199:	00 
      e9e19a:	48 8b 8c 24 38 13 00 	mov    rcx,QWORD PTR [rsp+0x1338]
      e9e1a1:	00 
      e9e1a2:	48 89 8c 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rcx
      e9e1a9:	00 
      e9e1aa:	88 9c 24 70 10 00 00 	mov    BYTE PTR [rsp+0x1070],bl
      e9e1b1:	4c 89 ac 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r13
      e9e1b8:	00 
      e9e1b9:	48 8d 05 40 ae 99 00 	lea    rax,[rip+0x99ae40]        # 1839000 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xaf98>
      e9e1c0:	48 89 84 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rax
      e9e1c7:	00 
      e9e1c8:	48 89 8c 24 08 0d 00 	mov    QWORD PTR [rsp+0xd08],rcx
      e9e1cf:	00 
      e9e1d0:	88 9c 24 10 0d 00 00 	mov    BYTE PTR [rsp+0xd10],bl
      e9e1d7:	4c 89 a4 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],r12
      e9e1de:	00 
      e9e1df:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
      e9e1e6:	00 
      e9e1e7:	4c 8d bc 24 30 0b 00 	lea    r15,[rsp+0xb30]
      e9e1ee:	00 
      e9e1ef:	48 89 df             	mov    rdi,rbx
      e9e1f2:	4c 89 fe             	mov    rsi,r15
      e9e1f5:	4c 89 ea             	mov    rdx,r13
      e9e1f8:	4c 89 e1             	mov    rcx,r12
#### write 0xe9ff18: mov    QWORD PTR [rsp+0x1070],0x1
      e9fef1:	00 00 
      e9fef3:	bf b0 01 00 00       	mov    edi,0x1b0
      e9fef8:	e8 03 e0 94 00       	call   17edf00 <_Znwm@plt>
      e9fefd:	49 89 c4             	mov    r12,rax
      e9ff00:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9ff07:	00 
      e9ff08:	48 8d 84 24 d0 0e 00 	lea    rax,[rsp+0xed0]
      e9ff0f:	00 
      e9ff10:	48 89 84 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rax
      e9ff17:	00 
      e9ff18:	48 c7 84 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],0x1
      e9ff1f:	00 01 00 00 00 
      e9ff24:	48 8d 05 ed 44 99 00 	lea    rax,[rip+0x9944ed]        # 1834418 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x63b0>
      e9ff2b:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e9ff2f:	0f 28 84 24 70 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x770]
      e9ff36:	00 
      e9ff37:	41 0f 29 44 24 10    	movaps XMMWORD PTR [r12+0x10],xmm0
      e9ff3d:	48 8b 84 24 88 07 00 	mov    rax,QWORD PTR [rsp+0x788]
      e9ff44:	00 
      e9ff45:	0f 28 84 24 80 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x780]
      e9ff4c:	00 
      e9ff4d:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
      e9ff53:	48 85 c0             	test   rax,rax
      e9ff56:	74 05                	je     e9ff5d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67373>
      e9ff58:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9ff5d:	48 8b 84 24 98 07 00 	mov    rax,QWORD PTR [rsp+0x798]
      e9ff64:	00 
      e9ff65:	0f 28 84 24 90 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x790]
      e9ff6c:	00 

### rsp+0x1080 before 0xea01e4
#### write 0xe9f1b7: mov    QWORD PTR [rsp+0x1080],rbx
      e9f18c:	0f 84 64 b1 ff ff    	je     e9a2f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6170c>
      e9f192:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f199:	00 
      e9f19a:	e8 91 7b c0 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e9f19f:	6a 04                	push   0x4
      e9f1a1:	e9 2c b1 ff ff       	jmp    e9a2d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x616e8>
      e9f1a6:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f1ad:	00 
      e9f1ae:	f3 0f 7f 84 24 68 10 	movdqu XMMWORD PTR [rsp+0x1068],xmm0
      e9f1b5:	00 00 
      e9f1b7:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9f1be:	00 
      e9f1bf:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f1c6:	00 
      e9f1c7:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f1ce:	00 
      e9f1cf:	48 89 da             	mov    rdx,rbx
      e9f1d2:	e8 d1 78 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f1d7:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9f1de:	00 
      e9f1df:	e8 86 ad bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f1e4:	4c 89 ff             	mov    rdi,r15
      e9f1e7:	e8 9a f2 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9f1ec:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f1f3:	00 
      e9f1f4:	e8 97 ec 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f1f9:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f200:	00 
      e9f201:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
#### write 0xe9f2b8: mov    QWORD PTR [rsp+0x1080],r15
      e9f290:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9f295:	48 89 d8             	mov    rax,rbx
      e9f298:	eb 02                	jmp    e9f29c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x666b2>
      e9f29a:	31 c0                	xor    eax,eax
      e9f29c:	48 8d 0d 15 65 99 00 	lea    rcx,[rip+0x996515]        # 18357b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7750>
      e9f2a3:	48 89 8c 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rcx
      e9f2aa:	00 
      e9f2ab:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9f2b0:	0f 11 84 24 68 10 00 	movups XMMWORD PTR [rsp+0x1068],xmm0
      e9f2b7:	00 
      e9f2b8:	4c 89 bc 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r15
      e9f2bf:	00 
      e9f2c0:	48 85 c0             	test   rax,rax
      e9f2c3:	74 05                	je     e9f2ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x666e0>
      e9f2c5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9f2ca:	48 8d 0d f7 66 99 00 	lea    rcx,[rip+0x9966f7]        # 18359c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7960>
      e9f2d1:	48 89 8c 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rcx
      e9f2d8:	00 
      e9f2d9:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9f2df:	66 0f d6 84 24 08 0d 	movq   QWORD PTR [rsp+0xd08],xmm0
      e9f2e6:	00 00 
      e9f2e8:	48 89 84 24 10 0d 00 	mov    QWORD PTR [rsp+0xd10],rax
      e9f2ef:	00 
      e9f2f0:	48 89 ac 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],rbp
      e9f2f7:	00 
      e9f2f8:	4c 8d bc 24 70 07 00 	lea    r15,[rsp+0x770]
      e9f2ff:	00 
      e9f300:	4c 8d b4 24 30 0b 00 	lea    r14,[rsp+0xb30]
      e9f307:	00 
#### write 0xe9f3dd: and    QWORD PTR [rsp+0x1080],0x0
      e9f3b4:	4c 89 a4 24 10 0d 00 	mov    QWORD PTR [rsp+0xd10],r12
      e9f3bb:	00 
      e9f3bc:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
      e9f3c0:	4c 89 b4 24 18 0d 00 	mov    QWORD PTR [rsp+0xd18],r14
      e9f3c7:	00 
      e9f3c8:	4d 85 f6             	test   r14,r14
      e9f3cb:	74 05                	je     e9f3d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x667e8>
      e9f3cd:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9f3d2:	8a 44 24 24          	mov    al,BYTE PTR [rsp+0x24]
      e9f3d6:	88 84 24 20 0d 00 00 	mov    BYTE PTR [rsp+0xd20],al
      e9f3dd:	48 83 a4 24 80 10 00 	and    QWORD PTR [rsp+0x1080],0x0
      e9f3e4:	00 00 
      e9f3e6:	6a 30                	push   0x30
      e9f3e8:	5f                   	pop    rdi
      e9f3e9:	e8 12 eb 94 00       	call   17edf00 <_Znwm@plt>
      e9f3ee:	48 8d 0d eb 3c 99 00 	lea    rcx,[rip+0x993ceb]        # 18330e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x5078>
      e9f3f5:	48 89 08             	mov    QWORD PTR [rax],rcx
      e9f3f8:	4c 89 78 08          	mov    QWORD PTR [rax+0x8],r15
      e9f3fc:	48 89 58 10          	mov    QWORD PTR [rax+0x10],rbx
      e9f400:	48 85 db             	test   rbx,rbx
      e9f403:	74 05                	je     e9f40a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66820>
      e9f405:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9f40a:	4c 89 60 18          	mov    QWORD PTR [rax+0x18],r12
      e9f40e:	4c 89 70 20          	mov    QWORD PTR [rax+0x20],r14
      e9f412:	4d 85 f6             	test   r14,r14
      e9f415:	74 05                	je     e9f41c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66832>
      e9f417:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9f41c:	8a 4c 24 24          	mov    cl,BYTE PTR [rsp+0x24]
      e9f420:	88 48 28             	mov    BYTE PTR [rax+0x28],cl
#### write 0xe9f4bb: mov    QWORD PTR [rsp+0x1080],rbx
      e9f48b:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f492:	00 
      e9f493:	e8 d6 8d ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f498:	48 8d 35 c1 59 53 ff 	lea    rsi,[rip+0xffffffffff5359c1]        # 3d4e60 <_ZTSN5boost17bad_function_callE@@Base+0x21a6>
      e9f49f:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f4a6:	00 
      e9f4a7:	e8 94 ea 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f4ac:	48 8d 05 85 75 99 00 	lea    rax,[rip+0x997585]        # 1836a38 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x89d0>
      e9f4b3:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f4ba:	00 
      e9f4bb:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9f4c2:	00 
      e9f4c3:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f4ca:	00 
      e9f4cb:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f4d2:	00 
      e9f4d3:	48 89 da             	mov    rdx,rbx
      e9f4d6:	e8 cd 75 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f4db:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9f4e2:	00 
      e9f4e3:	e8 82 aa bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f4e8:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f4ef:	00 
      e9f4f0:	e8 9b e9 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f4f5:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f4fc:	00 
      e9f4fd:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f504:	00 
      e9f505:	e8 ee fb fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
#### write 0xe9f66d: mov    QWORD PTR [rsp+0x1080],rbx
      e9f63e:	e8 b7 84 0d 00       	call   f77afa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13ef10>
      e9f643:	31 ff                	xor    edi,edi
      e9f645:	e8 3c ee bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9f64a:	48 8d 35 9f 58 53 ff 	lea    rsi,[rip+0xffffffffff53589f]        # 3d4ef0 <_ZTSN5boost17bad_function_callE@@Base+0x2236>
      e9f651:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f658:	00 
      e9f659:	e8 e2 e8 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f65e:	48 8d 05 e3 7d 99 00 	lea    rax,[rip+0x997de3]        # 1837448 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x93e0>
      e9f665:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f66c:	00 
      e9f66d:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9f674:	00 
      e9f675:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f67c:	00 
      e9f67d:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f684:	00 
      e9f685:	48 89 da             	mov    rdx,rbx
      e9f688:	e8 1b 74 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f68d:	4c 8d b4 24 60 10 00 	lea    r14,[rsp+0x1060]
      e9f694:	00 
      e9f695:	4c 89 f7             	mov    rdi,r14
      e9f698:	e8 cd a8 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f69d:	4c 8d bc 24 00 0d 00 	lea    r15,[rsp+0xd00]
      e9f6a4:	00 
      e9f6a5:	4c 89 ff             	mov    rdi,r15
      e9f6a8:	e8 e3 e7 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f6ad:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f6b4:	00 
      e9f6b5:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
#### write 0xe9f710: mov    QWORD PTR [rsp+0x1080],r14
      e9f6e4:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f6eb:	00 
      e9f6ec:	e8 4f e8 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f6f1:	48 8d 05 38 a5 99 00 	lea    rax,[rip+0x99a538]        # 1839c30 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xbbc8>
      e9f6f8:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f6ff:	00 
      e9f700:	48 8b 84 24 80 13 00 	mov    rax,QWORD PTR [rsp+0x1380]
      e9f707:	00 
      e9f708:	48 89 84 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rax
      e9f70f:	00 
      e9f710:	4c 89 b4 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r14
      e9f717:	00 
      e9f718:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f71f:	00 
      e9f720:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f727:	00 
      e9f728:	4c 89 f2             	mov    rdx,r14
      e9f72b:	e8 78 73 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f730:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9f737:	00 
      e9f738:	e8 2d a8 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f73d:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f744:	00 
      e9f745:	e8 46 e7 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f74a:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f751:	00 
      e9f752:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f759:	00 
      e9f75a:	e8 99 f9 fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
#### write 0xe9f873: and    QWORD PTR [rsp+0x1080],0x0
      e9f846:	89 c5                	mov    ebp,eax
      e9f848:	48 8d 35 d1 4e 53 ff 	lea    rsi,[rip+0xffffffffff534ed1]        # 3d4720 <_ZTSN5boost17bad_function_callE@@Base+0x1a66>
      e9f84f:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f856:	00 
      e9f857:	e8 e4 e6 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f85c:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9f862:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
      e9f869:	48 85 db             	test   rbx,rbx
      e9f86c:	74 05                	je     e9f873 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66c89>
      e9f86e:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9f873:	48 83 a4 24 80 10 00 	and    QWORD PTR [rsp+0x1080],0x0
      e9f87a:	00 00 
      e9f87c:	6a 30                	push   0x30
      e9f87e:	5f                   	pop    rdi
      e9f87f:	e8 7c e6 94 00       	call   17edf00 <_Znwm@plt>
      e9f884:	48 8d 0d a5 3a 99 00 	lea    rcx,[rip+0x993aa5]        # 1833330 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x52c8>
      e9f88b:	48 89 08             	mov    QWORD PTR [rax],rcx
      e9f88e:	48 8b 8c 24 d0 00 00 	mov    rcx,QWORD PTR [rsp+0xd0]
      e9f895:	00 
      e9f896:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      e9f89a:	48 8b 8c 24 78 12 00 	mov    rcx,QWORD PTR [rsp+0x1278]
      e9f8a1:	00 
      e9f8a2:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
      e9f8a6:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9f8ac:	f3 0f 7f 40 18       	movdqu XMMWORD PTR [rax+0x18],xmm0
      e9f8b1:	40 88 68 28          	mov    BYTE PTR [rax+0x28],bpl
      e9f8b5:	48 8d 94 24 60 10 00 	lea    rdx,[rsp+0x1060]
      e9f8bc:	00 
      e9f8bd:	48 89 42 20          	mov    QWORD PTR [rdx+0x20],rax
#### write 0xe9f944: mov    QWORD PTR [rsp+0x1080],r14
      e9f914:	e8 55 89 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f919:	48 89 df             	mov    rdi,rbx
      e9f91c:	e8 65 eb bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9f921:	48 8d 35 68 55 53 ff 	lea    rsi,[rip+0xffffffffff535568]        # 3d4e90 <_ZTSN5boost17bad_function_callE@@Base+0x21d6>
      e9f928:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9f92f:	00 
      e9f930:	e8 0b e6 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f935:	48 8d 05 ac 74 99 00 	lea    rax,[rip+0x9974ac]        # 1836de8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8d80>
      e9f93c:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f943:	00 
      e9f944:	4c 89 b4 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r14
      e9f94b:	00 
      e9f94c:	48 8d 05 dd 74 99 00 	lea    rax,[rip+0x9974dd]        # 1836e30 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8dc8>
      e9f953:	48 89 84 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rax
      e9f95a:	00 
      e9f95b:	4c 89 bc 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],r15
      e9f962:	00 
      e9f963:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
      e9f96a:	00 
      e9f96b:	4c 8d a4 24 30 0b 00 	lea    r12,[rsp+0xb30]
      e9f972:	00 
      e9f973:	48 89 df             	mov    rdi,rbx
      e9f976:	4c 89 e6             	mov    rsi,r12
      e9f979:	4c 89 f2             	mov    rdx,r14
      e9f97c:	4c 89 f9             	mov    rcx,r15
      e9f97f:	e8 c2 87 ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9f984:	4c 89 ff             	mov    rdi,r15
      e9f987:	e8 de a5 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f98c:	4c 89 f7             	mov    rdi,r14

## References to TimelineAds owner+0x50 vtables in same FDE
### AP 0x18674c8: 0 refs

### AP 0x1867550: 0 refs

### AP 0x1867980: 0 refs

### AP 0x18678f8: 0 refs

## Registry/service-ID 0xb7 looking call sites in same FDE
## Calls to known TimelineAds getter 0xaa712a / registry helper b622de
## Stack-source definitions with high-address/vptr materializations
### preceding 0x400 bytes before 0xe9ff24
      e9fc03:	48 8d 05 d6 1c 99 00 	lea    rax,[rip+0x991cd6]        # 18318e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3878>
      e9fd03:	48 8d 05 0e 1c 99 00 	lea    rax,[rip+0x991c0e]        # 1831918 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38b0>
      e9fd24:	48 8d 05 35 1c 99 00 	lea    rax,[rip+0x991c35]        # 1831960 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38f8>

### preceding 0x400 bytes before 0xea01e4
      e9ff24:	48 8d 05 ed 44 99 00 	lea    rax,[rip+0x9944ed]        # 1834418 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x63b0>

## Branch predecessors targeting variant neighborhoods
### variant-1834418
- 0xe9fee3: je     e9feea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67300>
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
      e9fef8:	e8 03 e0 94 00       	call   17edf00 <_Znwm@plt>
      e9fefd:	49 89 c4             	mov    r12,rax
      e9ff00:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9ff07:	00 
      e9ff08:	48 8d 84 24 d0 0e 00 	lea    rax,[rsp+0xed0]
      e9ff0f:	00 
      e9ff10:	48 89 84 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rax
      e9ff17:	00 
      e9ff18:	48 c7 84 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],0x1
      e9ff1f:	00 01 00 00 00 
      e9ff24:	48 8d 05 ed 44 99 00 	lea    rax,[rip+0x9944ed]        # 1834418 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x63b0>
      e9ff2b:	49 89 04 24          	mov    QWORD PTR [r12],rax
- 0xe9ff56: je     e9ff5d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67373>
      e9ff2b:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e9ff2f:	0f 28 84 24 70 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x770]
      e9ff36:	00 
      e9ff37:	41 0f 29 44 24 10    	movaps XMMWORD PTR [r12+0x10],xmm0
      e9ff3d:	48 8b 84 24 88 07 00 	mov    rax,QWORD PTR [rsp+0x788]
      e9ff44:	00 
      e9ff45:	0f 28 84 24 80 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x780]
      e9ff4c:	00 
      e9ff4d:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
      e9ff53:	48 85 c0             	test   rax,rax
      e9ff56:	74 05                	je     e9ff5d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67373>
      e9ff58:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9ff5d:	48 8b 84 24 98 07 00 	mov    rax,QWORD PTR [rsp+0x798]
      e9ff64:	00 
      e9ff65:	0f 28 84 24 90 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x790]
      e9ff6c:	00 
      e9ff6d:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0
      e9ff73:	48 85 c0             	test   rax,rax
      e9ff76:	74 05                	je     e9ff7d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67393>
      e9ff78:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9ff7d:	48 8b 84 24 a8 07 00 	mov    rax,QWORD PTR [rsp+0x7a8]
      e9ff84:	00 
      e9ff85:	0f 28 84 24 a0 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x7a0]
      e9ff8c:	00 
      e9ff8d:	41 0f 11 44 24 40    	movups XMMWORD PTR [r12+0x40],xmm0
      e9ff93:	48 85 c0             	test   rax,rax
      e9ff96:	74 05                	je     e9ff9d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x673b3>

### variant-1834728
- 0xea01a3: je     ea01aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x675c0>
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
      ea01c7:	00 
      ea01c8:	48 8d 84 24 80 03 00 	lea    rax,[rsp+0x380]
      ea01cf:	00 
      ea01d0:	48 89 84 24 a8 0e 00 	mov    QWORD PTR [rsp+0xea8],rax
      ea01d7:	00 
      ea01d8:	48 c7 84 24 b0 0e 00 	mov    QWORD PTR [rsp+0xeb0],0x1
      ea01df:	00 01 00 00 00 
      ea01e4:	48 8d 05 3d 45 99 00 	lea    rax,[rip+0x99453d]        # 1834728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x66c0>
      ea01eb:	49 89 04 24          	mov    QWORD PTR [r12],rax
- 0xea0216: je     ea021d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67633>
      ea01eb:	49 89 04 24          	mov    QWORD PTR [r12],rax
      ea01ef:	0f 28 84 24 60 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1060]
      ea01f6:	00 
      ea01f7:	41 0f 29 44 24 10    	movaps XMMWORD PTR [r12+0x10],xmm0
      ea01fd:	48 8b 84 24 78 10 00 	mov    rax,QWORD PTR [rsp+0x1078]
      ea0204:	00 
      ea0205:	0f 28 84 24 70 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1070]
      ea020c:	00 
      ea020d:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
      ea0213:	48 85 c0             	test   rax,rax
      ea0216:	74 05                	je     ea021d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67633>
      ea0218:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea021d:	48 8b 84 24 88 10 00 	mov    rax,QWORD PTR [rsp+0x1088]
      ea0224:	00 
      ea0225:	0f 28 84 24 80 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1080]
      ea022c:	00 
      ea022d:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0
      ea0233:	48 85 c0             	test   rax,rax
      ea0236:	74 05                	je     ea023d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67653>
      ea0238:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea023d:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
      ea0244:	00 
      ea0245:	0f 28 84 24 90 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1090]
      ea024c:	00 
      ea024d:	41 0f 11 44 24 40    	movups XMMWORD PTR [r12+0x40],xmm0
      ea0253:	48 85 c0             	test   rax,rax
      ea0256:	74 05                	je     ea025d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67673>

