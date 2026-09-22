# Readiness concrete service vtables

## RestrictionsSetupImpl constructor 0x10aba36
FDE= ('0x10aba36', '0x10adc15')
 10aba36:	55                   	push   rbp
 10aba37:	41 57                	push   r15
 10aba39:	41 56                	push   r14
 10aba3b:	41 55                	push   r13
 10aba3d:	41 54                	push   r12
 10aba3f:	53                   	push   rbx
 10aba40:	48 81 ec 58 01 00 00 	sub    rsp,0x158
 10aba47:	4c 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],r9
 10aba4c:	4c 89 44 24 10       	mov    QWORD PTR [rsp+0x10],r8
 10aba51:	48 89 cd             	mov    rbp,rcx
 10aba54:	48 89 54 24 40       	mov    QWORD PTR [rsp+0x40],rdx
 10aba59:	49 89 f7             	mov    r15,rsi
 10aba5c:	48 89 fb             	mov    rbx,rdi
 10aba5f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10aba66:	00 00 
 10aba68:	48 89 84 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rax
 10aba6f:	00 
 10aba70:	c6 47 08 00          	mov    BYTE PTR [rdi+0x8],0x0
 10aba74:	48 8d 05 15 10 7a 00 	lea    rax,[rip+0x7a1015]        # 184ca90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9178>
 10aba7b:	48 89 07             	mov    QWORD PTR [rdi],rax
 10aba7e:	48 8d 47 10          	lea    rax,[rdi+0x10]
 10aba82:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
 10aba89:	00 
 10aba8a:	48 8d 47 18          	lea    rax,[rdi+0x18]
 10aba8e:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
 10aba93:	48 8d 47 40          	lea    rax,[rdi+0x40]
 10aba97:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 10aba9c:	48 83 c7 48          	add    rdi,0x48
 10abaa0:	0f 57 c0             	xorps  xmm0,xmm0
 10abaa3:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
 10abaa7:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
 10abaab:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
 10abaaf:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
 10abab4:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
 10abab9:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
 10abac0:	00 
 10abac1:	e8 64 9c ab ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
 10abac6:	48 8d 43 58          	lea    rax,[rbx+0x58]
 10abaca:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 10abacf:	48 8d 43 60          	lea    rax,[rbx+0x60]
 10abad3:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
 10abad8:	48 8d 43 68          	lea    rax,[rbx+0x68]
 10abadc:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 10abae1:	48 8d 43 70          	lea    rax,[rbx+0x70]
 10abae5:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
 10abaec:	00 
 10abaed:	48 8d 43 78          	lea    rax,[rbx+0x78]
 10abaf1:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
 10abaf8:	00 
 10abaf9:	0f 57 c0             	xorps  xmm0,xmm0
 10abafc:	0f 11 43 68          	movups XMMWORD PTR [rbx+0x68],xmm0
 10abb00:	0f 11 43 58          	movups XMMWORD PTR [rbx+0x58],xmm0
 10abb04:	48 83 63 78 00       	and    QWORD PTR [rbx+0x78],0x0
 10abb09:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
 10abb0d:	48 8d 35 fc b8 32 ff 	lea    rsi,[rip+0xffffffffff32b8fc]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10abb14:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10abb1b:	00 
 10abb1c:	e8 5d df 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abb21:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10abb28:	00 
 10abb29:	48 8d 35 7b cd 32 ff 	lea    rsi,[rip+0xffffffffff32cd7b]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10abb30:	e8 49 df 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abb35:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
 10abb3c:	00 
 10abb3d:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10abb44:	00 
 10abb45:	6a 02                	push   0x2
 10abb47:	5a                   	pop    rdx
 10abb48:	4c 89 e7             	mov    rdi,r12
 10abb4b:	e8 08 b9 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10abb50:	8a 9c 24 d0 01 00 00 	mov    bl,BYTE PTR [rsp+0x1d0]
 10abb57:	6a 18                	push   0x18
 10abb59:	41 5d                	pop    r13
 10abb5b:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]
 10abb5f:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10abb66:	e8 25 23 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abb6b:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
 10abb6f:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8
 10abb73:	75 e6                	jne    10abb5b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x272f71>
 10abb75:	48 8d 35 a4 b8 32 ff 	lea    rsi,[rip+0xffffffffff32b8a4]        # 3d7420 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2005>
 10abb7c:	48 8d 0d bd b8 32 ff 	lea    rcx,[rip+0xffffffffff32b8bd]        # 3d7440 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2025>
 10abb83:	4c 8d 2d 86 b8 32 ff 	lea    r13,[rip+0xffffffffff32b886]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10abb8a:	6a 11                	push   0x11
 10abb8c:	5a                   	pop    rdx
 10abb8d:	6a 20                	push   0x20
 10abb8f:	41 58                	pop    r8
 10abb91:	4c 89 f7             	mov    rdi,r14
 10abb94:	4d 89 e9             	mov    r9,r13
 10abb97:	41 54                	push   r12
 10abb99:	6a 08                	push   0x8
 10abb9b:	e8 ee ba 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10abba0:	58                   	pop    rax
 10abba1:	59                   	pop    rcx
 10abba2:	4c 89 e7             	mov    rdi,r12
 10abba5:	e8 3e fa 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10abbaa:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
 10abbae:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10abbb5:	00 
 10abbb6:	4c 89 ee             	mov    rsi,r13
 10abbb9:	e8 c0 de 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abbbe:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10abbc5:	00 
 10abbc6:	48 8d 35 de cc 32 ff 	lea    rsi,[rip+0xffffffffff32ccde]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10abbcd:	e8 ac de 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abbd2:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
 10abbd9:	00 
 10abbda:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10abbe1:	00 
 10abbe2:	6a 02                	push   0x2
 10abbe4:	5a                   	pop    rdx
 10abbe5:	4c 89 e7             	mov    rdi,r12
 10abbe8:	e8 6b b8 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10abbed:	6a 18                	push   0x18
 10abbef:	41 5d                	pop    r13
 10abbf1:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]
 10abbf5:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10abbfc:	e8 8f 22 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abc01:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
 10abc05:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8
 10abc09:	75 e6                	jne    10abbf1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273007>
 10abc0b:	48 8d 35 5e b8 32 ff 	lea    rsi,[rip+0xffffffffff32b85e]        # 3d7470 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2055>
 10abc12:	48 8d 0d 77 b8 32 ff 	lea    rcx,[rip+0xffffffffff32b877]        # 3d7490 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2075>
 10abc19:	4c 8d 0d eb b9 32 ff 	lea    r9,[rip+0xffffffffff32b9eb]        # 3d760b <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21f0>
 10abc20:	6a 11                	push   0x11
 10abc22:	5a                   	pop    rdx
 10abc23:	6a 19                	push   0x19
 10abc25:	41 58                	pop    r8
 10abc27:	4c 89 f7             	mov    rdi,r14
 10abc2a:	41 54                	push   r12
 10abc2c:	6a 08                	push   0x8
 10abc2e:	e8 5b ba 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10abc33:	58                   	pop    rax
 10abc34:	59                   	pop    rcx
 10abc35:	4c 89 e7             	mov    rdi,r12
 10abc38:	e8 ab f9 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10abc3d:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
 10abc41:	48 8d 35 c8 b7 32 ff 	lea    rsi,[rip+0xffffffffff32b7c8]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10abc48:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10abc4f:	00 
 10abc50:	e8 29 de 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abc55:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10abc5c:	00 
 10abc5d:	48 8d 35 47 cc 32 ff 	lea    rsi,[rip+0xffffffffff32cc47]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10abc64:	e8 15 de 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abc69:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
 10abc70:	00 
 10abc71:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10abc78:	00 
 10abc79:	6a 02                	push   0x2
 10abc7b:	5a                   	pop    rdx
 10abc7c:	4c 89 e7             	mov    rdi,r12
 10abc7f:	e8 d4 b7 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10abc84:	6a 18                	push   0x18
 10abc86:	41 5d                	pop    r13
 10abc88:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]
 10abc8c:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10abc93:	e8 f8 21 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abc98:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
 10abc9c:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8
 10abca0:	75 e6                	jne    10abc88 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27309e>
 10abca2:	48 8d 35 27 b9 32 ff 	lea    rsi,[rip+0xffffffffff32b927]        # 3d75d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21b5>
 10abca9:	48 8d 0d 40 b9 32 ff 	lea    rcx,[rip+0xffffffffff32b940]        # 3d75f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21d5>
 10abcb0:	4c 8d 0d 5d b9 32 ff 	lea    r9,[rip+0xffffffffff32b95d]        # 3d7614 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21f9>
 10abcb7:	6a 11                	push   0x11
 10abcb9:	5a                   	pop    rdx
 10abcba:	6a 1a                	push   0x1a
 10abcbc:	41 58                	pop    r8
 10abcbe:	4c 89 f7             	mov    rdi,r14
 10abcc1:	41 54                	push   r12
 10abcc3:	6a 08                	push   0x8
 10abcc5:	e8 c4 b9 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10abcca:	58                   	pop    rax
 10abccb:	59                   	pop    rcx
 10abccc:	4c 89 e7             	mov    rdi,r12
 10abccf:	e8 14 f9 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10abcd4:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
 10abcd8:	48 8d 35 31 b7 32 ff 	lea    rsi,[rip+0xffffffffff32b731]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10abcdf:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10abce6:	00 
 10abce7:	e8 92 dd 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abcec:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10abcf3:	00 
 10abcf4:	48 8d 35 b0 cb 32 ff 	lea    rsi,[rip+0xffffffffff32cbb0]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10abcfb:	e8 7e dd 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abd00:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
 10abd07:	00 
 10abd08:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10abd0f:	00 
 10abd10:	6a 02                	push   0x2
 10abd12:	5a                   	pop    rdx
 10abd13:	4c 89 e7             	mov    rdi,r12
 10abd16:	e8 3d b7 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10abd1b:	6a 18                	push   0x18
 10abd1d:	41 5d                	pop    r13
 10abd1f:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]
 10abd23:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10abd2a:	e8 61 21 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abd2f:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
 10abd33:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8
 10abd37:	75 e6                	jne    10abd1f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273135>
 10abd39:	48 8d 35 b0 bb 32 ff 	lea    rsi,[rip+0xffffffffff32bbb0]        # 3d78f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24d5>
 10abd40:	48 8d 0d c9 bb 32 ff 	lea    rcx,[rip+0xffffffffff32bbc9]        # 3d7910 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24f5>
 10abd47:	4c 8d 0d cf b8 32 ff 	lea    r9,[rip+0xffffffffff32b8cf]        # 3d761d <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2202>
 10abd4e:	6a 11                	push   0x11
 10abd50:	5a                   	pop    rdx
 10abd51:	6a 24                	push   0x24
 10abd53:	41 58                	pop    r8
 10abd55:	4c 89 f7             	mov    rdi,r14
 10abd58:	41 54                	push   r12
 10abd5a:	6a 08                	push   0x8
 10abd5c:	e8 2d b9 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10abd61:	58                   	pop    rax
 10abd62:	59                   	pop    rcx
 10abd63:	4c 89 e7             	mov    rdi,r12
 10abd66:	e8 7d f8 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10abd6b:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
 10abd6f:	48 8d 35 9a b6 32 ff 	lea    rsi,[rip+0xffffffffff32b69a]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10abd76:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10abd7d:	00 
 10abd7e:	e8 fb dc 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abd83:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10abd8a:	00 
 10abd8b:	48 8d 35 19 cb 32 ff 	lea    rsi,[rip+0xffffffffff32cb19]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10abd92:	e8 e7 dc 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abd97:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
 10abd9e:	00 
 10abd9f:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10abda6:	00 
 10abda7:	6a 02                	push   0x2
 10abda9:	5a                   	pop    rdx
 10abdaa:	4c 89 e7             	mov    rdi,r12
 10abdad:	e8 a6 b6 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10abdb2:	6a 18                	push   0x18
 10abdb4:	41 5d                	pop    r13
 10abdb6:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]
 10abdba:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10abdc1:	e8 ca 20 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abdc6:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
 10abdca:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8
 10abdce:	75 e6                	jne    10abdb6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2731cc>
 10abdd0:	48 8d 35 f9 b5 32 ff 	lea    rsi,[rip+0xffffffffff32b5f9]        # 3d73d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1fb5>
 10abdd7:	48 8d 0d 12 b6 32 ff 	lea    rcx,[rip+0xffffffffff32b612]        # 3d73f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1fd5>
 10abdde:	4c 8d 0d 41 b8 32 ff 	lea    r9,[rip+0xffffffffff32b841]        # 3d7626 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x220b>
 10abde5:	6a 11                	push   0x11
 10abde7:	5a                   	pop    rdx
 10abde8:	6a 1f                	push   0x1f
 10abdea:	41 58                	pop    r8
 10abdec:	4c 89 f7             	mov    rdi,r14
 10abdef:	41 54                	push   r12
 10abdf1:	6a 08                	push   0x8
 10abdf3:	e8 96 b8 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10abdf8:	58                   	pop    rax
 10abdf9:	59                   	pop    rcx
 10abdfa:	4c 89 e7             	mov    rdi,r12
 10abdfd:	e8 e6 f7 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10abe02:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
 10abe06:	48 8d 35 03 b6 32 ff 	lea    rsi,[rip+0xffffffffff32b603]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10abe0d:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10abe14:	00 
 10abe15:	e8 64 dc 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abe1a:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10abe21:	00 
 10abe22:	48 8d 35 82 ca 32 ff 	lea    rsi,[rip+0xffffffffff32ca82]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10abe29:	e8 50 dc 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abe2e:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
 10abe35:	00 
 10abe36:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10abe3d:	00 
 10abe3e:	6a 02                	push   0x2
 10abe40:	5a                   	pop    rdx
 10abe41:	4c 89 e7             	mov    rdi,r12
 10abe44:	e8 0f b6 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10abe49:	6a 18                	push   0x18
 10abe4b:	41 5d                	pop    r13
 10abe4d:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]
 10abe51:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10abe58:	e8 33 20 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abe5d:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
 10abe61:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8
 10abe65:	75 e6                	jne    10abe4d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273263>
 10abe67:	48 8d 35 c2 b7 32 ff 	lea    rsi,[rip+0xffffffffff32b7c2]        # 3d7630 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2215>
 10abe6e:	48 8d 0d db b7 32 ff 	lea    rcx,[rip+0xffffffffff32b7db]        # 3d7650 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2235>
 10abe75:	4c 8d 0d 01 b8 32 ff 	lea    r9,[rip+0xffffffffff32b801]        # 3d767d <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2262>
 10abe7c:	6a 11                	push   0x11
 10abe7e:	5a                   	pop    rdx
 10abe7f:	6a 2c                	push   0x2c
 10abe81:	41 58                	pop    r8
 10abe83:	4c 89 f7             	mov    rdi,r14
 10abe86:	41 54                	push   r12
 10abe88:	6a 08                	push   0x8
 10abe8a:	e8 ff b7 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10abe8f:	58                   	pop    rax
 10abe90:	59                   	pop    rcx
 10abe91:	4c 89 e7             	mov    rdi,r12
 10abe94:	e8 4f f7 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10abe99:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
 10abe9d:	48 8d 35 6c b5 32 ff 	lea    rsi,[rip+0xffffffffff32b56c]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10abea4:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10abeab:	00 
 10abeac:	e8 cd db 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abeb1:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10abeb8:	00 
 10abeb9:	48 8d 35 eb c9 32 ff 	lea    rsi,[rip+0xffffffffff32c9eb]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10abec0:	e8 b9 db 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abec5:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
 10abecc:	00 
 10abecd:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10abed4:	00 
 10abed5:	6a 02                	push   0x2
 10abed7:	5a                   	pop    rdx
 10abed8:	4c 89 e7             	mov    rdi,r12
 10abedb:	e8 78 b5 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10abee0:	6a 18                	push   0x18
 10abee2:	41 5d                	pop    r13
 10abee4:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]
 10abee8:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10abeef:	e8 9c 1f 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abef4:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
 10abef8:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8
 10abefc:	75 e6                	jne    10abee4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2732fa>
 10abefe:	48 8d 35 3b b6 32 ff 	lea    rsi,[rip+0xffffffffff32b63b]        # 3d7540 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2125>
 10abf05:	48 8d 0d 54 b6 32 ff 	lea    rcx,[rip+0xffffffffff32b654]        # 3d7560 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2145>
 10abf0c:	4c 8d 0d 73 b7 32 ff 	lea    r9,[rip+0xffffffffff32b773]        # 3d7686 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x226b>
 10abf13:	6a 11                	push   0x11
 10abf15:	5a                   	pop    rdx
 10abf16:	6a 2b                	push   0x2b
 10abf18:	41 58                	pop    r8
 10abf1a:	4c 89 f7             	mov    rdi,r14
 10abf1d:	41 54                	push   r12
 10abf1f:	6a 08                	push   0x8
 10abf21:	e8 68 b7 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10abf26:	58                   	pop    rax
 10abf27:	59                   	pop    rcx
 10abf28:	4c 89 e7             	mov    rdi,r12
 10abf2b:	e8 b8 f6 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10abf30:	4c 8b 65 00          	mov    r12,QWORD PTR [rbp+0x0]
 10abf34:	48 8d 35 d5 b4 32 ff 	lea    rsi,[rip+0xffffffffff32b4d5]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10abf3b:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10abf42:	00 
 10abf43:	e8 36 db 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abf48:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10abf4f:	00 
 10abf50:	48 8d 35 54 c9 32 ff 	lea    rsi,[rip+0xffffffffff32c954]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10abf57:	e8 22 db 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abf5c:	4c 8d ac 24 f0 00 00 	lea    r13,[rsp+0xf0]
 10abf63:	00 
 10abf64:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10abf6b:	00 
 10abf6c:	6a 02                	push   0x2
 10abf6e:	5a                   	pop    rdx
 10abf6f:	4c 89 ef             	mov    rdi,r13
 10abf72:	e8 e1 b4 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10abf77:	48 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],rbp
 10abf7c:	6a 18                	push   0x18
 10abf7e:	41 5e                	pop    r14
 10abf80:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
 10abf84:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10abf8b:	e8 00 1f 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abf90:	49 83 c6 e8          	add    r14,0xffffffffffffffe8
 10abf94:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8
 10abf98:	75 e6                	jne    10abf80 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273396>
 10abf9a:	48 8d 35 ef b5 32 ff 	lea    rsi,[rip+0xffffffffff32b5ef]        # 3d7590 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2175>
 10abfa1:	48 8d 0d 08 b6 32 ff 	lea    rcx,[rip+0xffffffffff32b608]        # 3d75b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2195>
 10abfa8:	4c 8d 0d e0 b6 32 ff 	lea    r9,[rip+0xffffffffff32b6e0]        # 3d768f <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2274>
 10abfaf:	6a 11                	push   0x11
 10abfb1:	5d                   	pop    rbp
 10abfb2:	6a 18                	push   0x18
 10abfb4:	41 5e                	pop    r14
 10abfb6:	4c 89 e7             	mov    rdi,r12
 10abfb9:	48 89 ea             	mov    rdx,rbp
 10abfbc:	4d 89 f0             	mov    r8,r14
 10abfbf:	41 55                	push   r13
 10abfc1:	6a 08                	push   0x8
 10abfc3:	e8 c6 b6 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10abfc8:	58                   	pop    rax
 10abfc9:	59                   	pop    rcx
 10abfca:	4c 89 ef             	mov    rdi,r13
 10abfcd:	e8 16 f6 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10abfd2:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
 10abfd7:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10abfdb:	48 8d 35 3e b8 32 ff 	lea    rsi,[rip+0xffffffffff32b83e]        # 3d7820 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2405>
 10abfe2:	48 8d 0d 49 b8 32 ff 	lea    rcx,[rip+0xffffffffff32b849]        # 3d7832 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2417>
 10abfe9:	6a 0a                	push   0xa
 10abfeb:	41 58                	pop    r8
 10abfed:	6a 06                	push   0x6
 10abfef:	41 59                	pop    r9
 10abff1:	48 89 ea             	mov    rdx,rbp
 10abff4:	6a 06                	push   0x6
 10abff6:	6a 01                	push   0x1
 10abff8:	e8 f5 b5 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 10abffd:	48 83 c4 10          	add    rsp,0x10
 10ac001:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10ac005:	48 8d 35 34 b8 32 ff 	lea    rsi,[rip+0xffffffffff32b834]        # 3d7840 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2425>
 10ac00c:	48 8d 0d 4d b8 32 ff 	lea    rcx,[rip+0xffffffffff32b84d]        # 3d7860 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2445>
 10ac013:	6a 17                	push   0x17
 10ac015:	41 58                	pop    r8
 10ac017:	6a 3c                	push   0x3c
 10ac019:	41 59                	pop    r9
 10ac01b:	48 89 ea             	mov    rdx,rbp
 10ac01e:	4c 89 e5             	mov    rbp,r12
 10ac021:	68 a0 05 00 00       	push   0x5a0
 10ac026:	6a 3c                	push   0x3c
 10ac028:	e8 c5 b5 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 10ac02d:	48 83 c4 10          	add    rsp,0x10
 10ac031:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
 10ac035:	48 8d 35 d4 b3 32 ff 	lea    rsi,[rip+0xffffffffff32b3d4]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10ac03c:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac043:	00 
 10ac044:	e8 35 da 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10ac049:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10ac050:	00 
 10ac051:	48 8d 35 53 c8 32 ff 	lea    rsi,[rip+0xffffffffff32c853]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ac058:	e8 21 da 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10ac05d:	4c 8d ac 24 f0 00 00 	lea    r13,[rsp+0xf0]
 10ac064:	00 
 10ac065:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10ac06c:	00 
 10ac06d:	6a 02                	push   0x2
 10ac06f:	5a                   	pop    rdx
 10ac070:	4c 89 ef             	mov    rdi,r13
 10ac073:	e8 e0 b3 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10ac078:	6a 18                	push   0x18
 10ac07a:	41 5e                	pop    r14
 10ac07c:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
 10ac080:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10ac087:	e8 04 1e 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ac08c:	49 83 c6 e8          	add    r14,0xffffffffffffffe8
 10ac090:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8
 10ac094:	75 e6                	jne    10ac07c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273492>
 10ac096:	48 8d 35 13 b4 32 ff 	lea    rsi,[rip+0xffffffffff32b413]        # 3d74b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2095>
 10ac09d:	48 8d 0d 2c b4 32 ff 	lea    rcx,[rip+0xffffffffff32b42c]        # 3d74d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20b5>
 10ac0a4:	4c 8d 0d ed b5 32 ff 	lea    r9,[rip+0xffffffffff32b5ed]        # 3d7698 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x227d>
 10ac0ab:	6a 11                	push   0x11
 10ac0ad:	41 5e                	pop    r14
 10ac0af:	6a 19                	push   0x19
 10ac0b1:	41 58                	pop    r8
 10ac0b3:	4c 89 e7             	mov    rdi,r12
 10ac0b6:	4c 89 f2             	mov    rdx,r14
 10ac0b9:	41 55                	push   r13
 10ac0bb:	6a 08                	push   0x8
 10ac0bd:	e8 cc b5 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10ac0c2:	58                   	pop    rax
 10ac0c3:	59                   	pop    rcx
 10ac0c4:	4c 89 ef             	mov    rdi,r13
 10ac0c7:	e8 1c f5 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10ac0cc:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 10ac0d0:	6a 01                	push   0x1
 10ac0d2:	41 5c                	pop    r12
 10ac0d4:	48 8d 35 d5 b5 32 ff 	lea    rsi,[rip+0xffffffffff32b5d5]        # 3d76b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2295>
 10ac0db:	48 8d 0d ee b5 32 ff 	lea    rcx,[rip+0xffffffffff32b5ee]        # 3d76d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22b5>
 10ac0e2:	6a 12                	push   0x12
 10ac0e4:	41 58                	pop    r8
 10ac0e6:	6a 03                	push   0x3
 10ac0e8:	41 59                	pop    r9
 10ac0ea:	4c 89 f2             	mov    rdx,r14
 10ac0ed:	6a 64                	push   0x64
 10ac0ef:	41 54                	push   r12
 10ac0f1:	e8 fc b4 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 10ac0f6:	48 83 c4 10          	add    rsp,0x10
 10ac0fa:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 10ac0fe:	48 8d 35 eb b5 32 ff 	lea    rsi,[rip+0xffffffffff32b5eb]        # 3d76f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22d5>
 10ac105:	48 8d 0d 04 b6 32 ff 	lea    rcx,[rip+0xffffffffff32b604]        # 3d7710 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22f5>
 10ac10c:	6a 1f                	push   0x1f
 10ac10e:	41 58                	pop    r8
 10ac110:	4c 89 f2             	mov    rdx,r14
 10ac113:	41 b9 10 0e 00 00    	mov    r9d,0xe10
 10ac119:	68 80 51 01 00       	push   0x15180
 10ac11e:	41 54                	push   r12
 10ac120:	e8 cd b4 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 10ac125:	48 83 c4 10          	add    rsp,0x10
 10ac129:	6a 28                	push   0x28
 10ac12b:	5f                   	pop    rdi
 10ac12c:	e8 cf 1d 74 00       	call   17edf00 <_Znwm@plt>
 10ac131:	49 89 c6             	mov    r14,rax
 10ac134:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0
 10ac13b:	00 00 
 10ac13d:	48 83 a4 24 20 01 00 	and    QWORD PTR [rsp+0x120],0x0
 10ac144:	00 00 
 10ac146:	6a 30                	push   0x30
 10ac148:	5f                   	pop    rdi
 10ac149:	e8 b2 1d 74 00       	call   17edf00 <_Znwm@plt>
 10ac14e:	49 89 c4             	mov    r12,rax
 10ac151:	48 89 c7             	mov    rdi,rax
 10ac154:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
 10ac159:	e8 32 e1 9c ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 10ac15e:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]
 10ac165:	00 
 10ac166:	4d 89 65 00          	mov    QWORD PTR [r13+0x0],r12
 10ac16a:	48 8d 05 69 78 a1 ff 	lea    rax,[rip+0xffffffffffa17869]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
 10ac171:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
 10ac175:	48 8d 05 9a 1a 00 00 	lea    rax,[rip+0x1a9a]        # 10adc16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27502c>
 10ac17c:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
 10ac180:	48 8d 05 11 17 7a 00 	lea    rax,[rip+0x7a1711]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>
 10ac187:	49 89 06             	mov    QWORD PTR [r14],rax
 10ac18a:	4c 89 f7             	mov    rdi,r14
 10ac18d:	48 83 c7 08          	add    rdi,0x8
 10ac191:	4c 89 ee             	mov    rsi,r13
 10ac194:	e8 91 54 fc ff       	call   107162a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a40>
 10ac199:	4c 89 ef             	mov    rdi,r13
 10ac19c:	e8 b1 5a d3 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 10ac1a1:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 10ac1a6:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10ac1a9:	4c 89 30             	mov    QWORD PTR [rax],r14
 10ac1ac:	48 85 ff             	test   rdi,rdi
 10ac1af:	74 06                	je     10ac1b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2735cd>
 10ac1b1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac1b4:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10ac1b7:	6a 58                	push   0x58
 10ac1b9:	5f                   	pop    rdi
 10ac1ba:	e8 41 1d 74 00       	call   17edf00 <_Znwm@plt>
 10ac1bf:	48 8d 0d 9a 20 7d 00 	lea    rcx,[rip+0x7d209a]        # 187e260 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3a948>
 10ac1c6:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac1c9:	31 ed                	xor    ebp,ebp
 10ac1cb:	40 88 68 08          	mov    BYTE PTR [rax+0x8],bpl
 10ac1cf:	40 88 68 38          	mov    BYTE PTR [rax+0x38],bpl
 10ac1d3:	40 88 68 40          	mov    BYTE PTR [rax+0x40],bpl
 10ac1d7:	0f 57 c0             	xorps  xmm0,xmm0
 10ac1da:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
 10ac1e1:	00 
 10ac1e2:	0f 11 40 48          	movups XMMWORD PTR [rax+0x48],xmm0
 10ac1e6:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 10ac1eb:	4c 8b 28             	mov    r13,QWORD PTR [rax]
 10ac1ee:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 10ac1f3:	48 8b 30             	mov    rsi,QWORD PTR [rax]
 10ac1f6:	48 8d 15 d3 b1 32 ff 	lea    rdx,[rip+0xffffffffff32b1d3]        # 3d73d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1fb5>
 10ac1fd:	4c 8d 05 ec b1 32 ff 	lea    r8,[rip+0xffffffffff32b1ec]        # 3d73f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1fd5>
 10ac204:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac20b:	00 
 10ac20c:	6a 11                	push   0x11
 10ac20e:	59                   	pop    rcx
 10ac20f:	6a 1f                	push   0x1f
 10ac211:	41 59                	pop    r9
 10ac213:	4c 89 f7             	mov    rdi,r14
 10ac216:	e8 ad b2 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ac21b:	41 38 6e 18          	cmp    BYTE PTR [r14+0x18],bpl
 10ac21f:	74 16                	je     10ac237 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27364d>
 10ac221:	48 8d 35 83 c6 32 ff 	lea    rsi,[rip+0xffffffffff32c683]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ac228:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac22f:	00 
 10ac230:	e8 1a f6 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac235:	89 c5                	mov    ebp,eax
 10ac237:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac23e:	00 
 10ac23f:	e8 ec aa 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac244:	bf 50 01 00 00       	mov    edi,0x150
 10ac249:	e8 b2 1c 74 00       	call   17edf00 <_Znwm@plt>
 10ac24e:	48 8d 0d b3 15 7a 00 	lea    rcx,[rip+0x7a15b3]        # 184d808 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9ef0>
 10ac255:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac258:	48 8d 90 90 00 00 00 	lea    rdx,[rax+0x90]
 10ac25f:	0f 57 c0             	xorps  xmm0,xmm0
 10ac262:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
 10ac266:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
 10ac26a:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
 10ac26e:	0f 11 40 38          	movups XMMWORD PTR [rax+0x38],xmm0
 10ac272:	0f 11 40 48          	movups XMMWORD PTR [rax+0x48],xmm0
 10ac276:	0f 11 40 58          	movups XMMWORD PTR [rax+0x58],xmm0
 10ac27a:	0f 11 40 68          	movups XMMWORD PTR [rax+0x68],xmm0
 10ac27e:	0f 11 40 78          	movups XMMWORD PTR [rax+0x78],xmm0
 10ac282:	48 8d 0d 57 26 76 00 	lea    rcx,[rip+0x762657]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
 10ac289:	48 89 88 90 00 00 00 	mov    QWORD PTR [rax+0x90],rcx
 10ac290:	48 8b 0d 09 58 80 00 	mov    rcx,QWORD PTR [rip+0x805809]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
 10ac297:	48 89 88 98 00 00 00 	mov    QWORD PTR [rax+0x98],rcx
 10ac29e:	48 89 90 b0 00 00 00 	mov    QWORD PTR [rax+0xb0],rdx
 10ac2a5:	48 89 c2             	mov    rdx,rax
 10ac2a8:	48 81 c2 c0 00 00 00 	add    rdx,0xc0
 10ac2af:	48 8d 0d 2a 26 76 00 	lea    rcx,[rip+0x76262a]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
 10ac2b6:	48 89 88 c0 00 00 00 	mov    QWORD PTR [rax+0xc0],rcx
 10ac2bd:	48 8b 0d e4 57 80 00 	mov    rcx,QWORD PTR [rip+0x8057e4]        # 18b1aa8 <_ZNSt6__ndk16chrono12steady_clock3nowEv@@Base+0xeaf8e8>
 10ac2c4:	48 89 88 c8 00 00 00 	mov    QWORD PTR [rax+0xc8],rcx
 10ac2cb:	48 89 90 e0 00 00 00 	mov    QWORD PTR [rax+0xe0],rdx
 10ac2d2:	0f 29 80 f0 00 00 00 	movaps XMMWORD PTR [rax+0xf0],xmm0
 10ac2d9:	0f 29 80 00 01 00 00 	movaps XMMWORD PTR [rax+0x100],xmm0
 10ac2e0:	0f 29 80 10 01 00 00 	movaps XMMWORD PTR [rax+0x110],xmm0
 10ac2e7:	0f 11 80 19 01 00 00 	movups XMMWORD PTR [rax+0x119],xmm0
 10ac2ee:	4c 89 a8 30 01 00 00 	mov    QWORD PTR [rax+0x130],r13
 10ac2f5:	48 8b 8c 24 a0 01 00 	mov    rcx,QWORD PTR [rsp+0x1a0]
 10ac2fc:	00 
 10ac2fd:	48 89 88 38 01 00 00 	mov    QWORD PTR [rax+0x138],rcx
 10ac304:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
 10ac309:	40 88 a8 40 01 00 00 	mov    BYTE PTR [rax+0x140],bpl
 10ac310:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
 10ac315:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 10ac319:	48 8d 15 00 b1 32 ff 	lea    rdx,[rip+0xffffffffff32b100]        # 3d7420 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2005>
 10ac320:	4c 8d 05 19 b1 32 ff 	lea    r8,[rip+0xffffffffff32b119]        # 3d7440 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2025>
 10ac327:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac32e:	00 
 10ac32f:	6a 11                	push   0x11
 10ac331:	59                   	pop    rcx
 10ac332:	6a 20                	push   0x20
 10ac334:	41 59                	pop    r9
 10ac336:	4c 89 f7             	mov    rdi,r14
 10ac339:	e8 8a b1 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ac33e:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
 10ac343:	0f 84 1a 01 00 00    	je     10ac463 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273879>
 10ac349:	48 8d 35 5b c5 32 ff 	lea    rsi,[rip+0xffffffffff32c55b]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ac350:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac357:	00 
 10ac358:	e8 f2 f4 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac35d:	84 c0                	test   al,al
 10ac35f:	0f 84 fe 00 00 00    	je     10ac463 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273879>
 10ac365:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac36c:	00 
 10ac36d:	e8 be a9 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac372:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10ac377:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac37a:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ac37d:	49 89 c6             	mov    r14,rax
 10ac380:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10ac383:	4c 89 ff             	mov    rdi,r15
 10ac386:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ac389:	49 89 c7             	mov    r15,rax
 10ac38c:	bf 80 00 00 00       	mov    edi,0x80
 10ac391:	e8 6a 1b 74 00       	call   17edf00 <_Znwm@plt>
 10ac396:	48 89 c1             	mov    rcx,rax
 10ac399:	48 8d 05 00 0d 7a 00 	lea    rax,[rip+0x7a0d00]        # 184d0a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9788>
 10ac3a0:	48 89 01             	mov    QWORD PTR [rcx],rax
 10ac3a3:	4c 89 71 08          	mov    QWORD PTR [rcx+0x8],r14
 10ac3a7:	4c 89 79 10          	mov    QWORD PTR [rcx+0x10],r15
 10ac3ab:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 10ac3b0:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 10ac3b4:	49 89 cf             	mov    r15,rcx
 10ac3b7:	e8 54 7d ab ff       	call   b64110 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb10b0>
 10ac3bc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
 10ac3c0:	49 89 57 28          	mov    QWORD PTR [r15+0x28],rdx
 10ac3c4:	41 c6 47 30 00       	mov    BYTE PTR [r15+0x30],0x0
 10ac3c9:	49 8d 7f 38          	lea    rdi,[r15+0x38]
 10ac3cd:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]
 10ac3d1:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac3d8:	00 
 10ac3d9:	4c 89 3a             	mov    QWORD PTR [rdx],r15
 10ac3dc:	48 8d 05 81 00 9d ff 	lea    rax,[rip+0xffffffffff9d0081]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac3e3:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
 10ac3e7:	48 8d 05 8e 69 00 00 	lea    rax,[rip+0x698e]        # 10b2d7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a192>
 10ac3ee:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax
 10ac3f2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ac3f5:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10ac3f8:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac3ff:	00 
 10ac400:	4c 89 f7             	mov    rdi,r14
 10ac403:	e8 22 19 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ac408:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]
 10ac40c:	4d 89 3e             	mov    QWORD PTR [r14],r15
 10ac40f:	48 8d 05 4e 00 9d ff 	lea    rax,[rip+0xffffffffff9d004e]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac416:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
 10ac41a:	48 8d 05 61 6c 00 00 	lea    rax,[rip+0x6c61]        # 10b3082 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a498>
 10ac421:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
 10ac425:	4c 89 ff             	mov    rdi,r15
 10ac428:	48 83 c7 48          	add    rdi,0x48
 10ac42c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ac42f:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac436:	00 
 10ac437:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10ac43a:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac441:	00 
 10ac442:	e8 e3 18 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ac447:	0f 57 c0             	xorps  xmm0,xmm0
 10ac44a:	41 0f 11 47 68       	movups XMMWORD PTR [r15+0x68],xmm0
 10ac44f:	41 0f 11 47 58       	movups XMMWORD PTR [r15+0x58],xmm0
 10ac454:	4c 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],r15
 10ac459:	41 c7 47 78 00 00 80 	mov    DWORD PTR [r15+0x78],0x3f800000
 10ac460:	3f 
 10ac461:	eb 24                	jmp    10ac487 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27389d>
 10ac463:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac46a:	00 
 10ac46b:	e8 c0 a8 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac470:	6a 08                	push   0x8
 10ac472:	5f                   	pop    rdi
 10ac473:	e8 88 1a 74 00       	call   17edf00 <_Znwm@plt>
 10ac478:	48 8d 0d 71 0d 7a 00 	lea    rcx,[rip+0x7a0d71]        # 184d1f0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x98d8>
 10ac47f:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
 10ac484:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac487:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 10ac48b:	48 8d 15 de af 32 ff 	lea    rdx,[rip+0xffffffffff32afde]        # 3d7470 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2055>
 10ac492:	4c 8d 05 f7 af 32 ff 	lea    r8,[rip+0xffffffffff32aff7]        # 3d7490 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2075>
 10ac499:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac4a0:	00 
 10ac4a1:	6a 11                	push   0x11
 10ac4a3:	59                   	pop    rcx
 10ac4a4:	6a 19                	push   0x19
 10ac4a6:	41 59                	pop    r9
 10ac4a8:	4c 89 f7             	mov    rdi,r14
 10ac4ab:	e8 18 b0 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ac4b0:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
 10ac4b5:	0f 84 1f 01 00 00    	je     10ac5da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2739f0>
 10ac4bb:	48 8d 35 e9 c3 32 ff 	lea    rsi,[rip+0xffffffffff32c3e9]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ac4c2:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac4c9:	00 
 10ac4ca:	e8 80 f3 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac4cf:	84 c0                	test   al,al
 10ac4d1:	0f 84 03 01 00 00    	je     10ac5da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2739f0>
 10ac4d7:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac4de:	00 
 10ac4df:	e8 4c a8 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac4e4:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10ac4e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac4ec:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ac4ef:	49 89 c6             	mov    r14,rax
 10ac4f2:	bf d8 00 00 00       	mov    edi,0xd8
 10ac4f7:	e8 04 1a 74 00       	call   17edf00 <_Znwm@plt>
 10ac4fc:	48 8d 0d a5 14 7a 00 	lea    rcx,[rip+0x7a14a5]        # 184d9a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa090>
 10ac503:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac506:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
 10ac50a:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
 10ac50f:	48 89 70 10          	mov    QWORD PTR [rax+0x10],rsi
 10ac513:	c6 40 18 00          	mov    BYTE PTR [rax+0x18],0x0
 10ac517:	48 8d 78 20          	lea    rdi,[rax+0x20]
 10ac51b:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac522:	00 
 10ac523:	48 89 02             	mov    QWORD PTR [rdx],rax
 10ac526:	48 8d 0d 37 ff 9c ff 	lea    rcx,[rip+0xffffffffff9cff37]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac52d:	48 89 4a 10          	mov    QWORD PTR [rdx+0x10],rcx
 10ac531:	48 8d 0d fc 3c 01 00 	lea    rcx,[rip+0x13cfc]        # 10c0234 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28764a>
 10ac538:	48 89 4a 18          	mov    QWORD PTR [rdx+0x18],rcx
 10ac53c:	48 8b 0e             	mov    rcx,QWORD PTR [rsi]
 10ac53f:	49 89 c7             	mov    r15,rax
 10ac542:	ff 51 18             	call   QWORD PTR [rcx+0x18]
 10ac545:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac54c:	00 
 10ac54d:	4c 89 f7             	mov    rdi,r14
 10ac550:	e8 d5 17 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ac555:	4c 89 ff             	mov    rdi,r15
 10ac558:	48 83 c7 30          	add    rdi,0x30
 10ac55c:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
 10ac560:	4d 89 3e             	mov    QWORD PTR [r14],r15
 10ac563:	48 8d 05 fa fe 9c ff 	lea    rax,[rip+0xffffffffff9cfefa]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac56a:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
 10ac56e:	48 8d 05 39 3d 01 00 	lea    rax,[rip+0x13d39]        # 10c02ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2876c4>
 10ac575:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
 10ac579:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ac57c:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac583:	00 
 10ac584:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10ac587:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac58e:	00 
 10ac58f:	e8 96 17 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ac594:	0f 57 c0             	xorps  xmm0,xmm0
 10ac597:	49 83 67 50 00       	and    QWORD PTR [r15+0x50],0x0
 10ac59c:	41 0f 11 47 40       	movups XMMWORD PTR [r15+0x40],xmm0
 10ac5a1:	49 83 67 68 00       	and    QWORD PTR [r15+0x68],0x0
 10ac5a6:	31 c0                	xor    eax,eax
 10ac5a8:	41 88 47 70          	mov    BYTE PTR [r15+0x70],al
 10ac5ac:	41 88 47 78          	mov    BYTE PTR [r15+0x78],al
 10ac5b0:	41 88 87 90 00 00 00 	mov    BYTE PTR [r15+0x90],al
 10ac5b7:	41 88 87 98 00 00 00 	mov    BYTE PTR [r15+0x98],al
 10ac5be:	41 88 87 b0 00 00 00 	mov    BYTE PTR [r15+0xb0],al
 10ac5c5:	41 88 87 b8 00 00 00 	mov    BYTE PTR [r15+0xb8],al
 10ac5cc:	4c 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],r15
 10ac5d1:	41 88 87 d0 00 00 00 	mov    BYTE PTR [r15+0xd0],al
 10ac5d8:	eb 24                	jmp    10ac5fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273a14>
 10ac5da:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac5e1:	00 
 10ac5e2:	e8 49 a7 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac5e7:	6a 08                	push   0x8
 10ac5e9:	5f                   	pop    rdi
 10ac5ea:	e8 11 19 74 00       	call   17edf00 <_Znwm@plt>
 10ac5ef:	48 8d 0d 3a 14 7a 00 	lea    rcx,[rip+0x7a143a]        # 184da30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa118>
 10ac5f6:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 10ac5fb:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac5fe:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 10ac602:	48 8d 15 a7 ae 32 ff 	lea    rdx,[rip+0xffffffffff32aea7]        # 3d74b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2095>
 10ac609:	4c 8d 05 c0 ae 32 ff 	lea    r8,[rip+0xffffffffff32aec0]        # 3d74d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20b5>
 10ac610:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac617:	00 
 10ac618:	6a 11                	push   0x11
 10ac61a:	59                   	pop    rcx
 10ac61b:	6a 19                	push   0x19
 10ac61d:	41 59                	pop    r9
 10ac61f:	4c 89 f7             	mov    rdi,r14
 10ac622:	e8 a1 ae 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ac627:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
 10ac62c:	0f 84 d6 02 00 00    	je     10ac908 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273d1e>
 10ac632:	48 8d 35 72 c2 32 ff 	lea    rsi,[rip+0xffffffffff32c272]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ac639:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac640:	00 
 10ac641:	e8 09 f2 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac646:	84 c0                	test   al,al
 10ac648:	0f 84 ba 02 00 00    	je     10ac908 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273d1e>
 10ac64e:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac655:	00 
 10ac656:	e8 d5 a6 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac65b:	48 8d 35 5b 13 2c ff 	lea    rsi,[rip+0xffffffffff2c135b]        # 36d9bd <_ZTSSt12bad_any_cast@@Base-0x2280b>
 10ac662:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
 10ac669:	00 
 10ac66a:	e8 0f d4 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10ac66f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 10ac674:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
 10ac678:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 10ac67f:	00 
 10ac680:	48 8d 94 24 b8 00 00 	lea    rdx,[rsp+0xb8]
 10ac687:	00 
 10ac688:	e8 2d 0a a0 ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
 10ac68d:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10ac691:	48 8d 35 18 b0 32 ff 	lea    rsi,[rip+0xffffffffff32b018]        # 3d76b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2295>
 10ac698:	48 8d 0d 31 b0 32 ff 	lea    rcx,[rip+0xffffffffff32b031]        # 3d76d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22b5>
 10ac69f:	6a 11                	push   0x11
 10ac6a1:	41 5e                	pop    r14
 10ac6a3:	6a 12                	push   0x12
 10ac6a5:	41 58                	pop    r8
 10ac6a7:	6a 03                	push   0x3
 10ac6a9:	41 59                	pop    r9
 10ac6ab:	4c 89 f2             	mov    rdx,r14
 10ac6ae:	e8 77 ad 53 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
 10ac6b3:	89 c5                	mov    ebp,eax
 10ac6b5:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10ac6b9:	48 8d 35 30 b0 32 ff 	lea    rsi,[rip+0xffffffffff32b030]        # 3d76f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22d5>
 10ac6c0:	48 8d 0d 49 b0 32 ff 	lea    rcx,[rip+0xffffffffff32b049]        # 3d7710 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22f5>
 10ac6c7:	6a 1f                	push   0x1f
 10ac6c9:	41 58                	pop    r8
 10ac6cb:	4c 89 f2             	mov    rdx,r14
 10ac6ce:	41 b9 10 0e 00 00    	mov    r9d,0xe10
 10ac6d4:	e8 51 ad 53 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
 10ac6d9:	41 89 c7             	mov    r15d,eax
 10ac6dc:	bf f8 00 00 00       	mov    edi,0xf8
 10ac6e1:	e8 1a 18 74 00       	call   17edf00 <_Znwm@plt>
 10ac6e6:	49 89 c6             	mov    r14,rax
 10ac6e9:	49 63 c7             	movsxd rax,r15d
 10ac6ec:	48 63 cd             	movsxd rcx,ebp
 10ac6ef:	48 8b 94 24 e0 00 00 	mov    rdx,QWORD PTR [rsp+0xe0]
 10ac6f6:	00 
 10ac6f7:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]
 10ac6fe:	00 
 10ac6ff:	49 89 57 10          	mov    QWORD PTR [r15+0x10],rdx
 10ac703:	0f 28 84 24 d0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xd0]
 10ac70a:	00 
 10ac70b:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
 10ac70f:	48 83 a4 24 e0 00 00 	and    QWORD PTR [rsp+0xe0],0x0
 10ac716:	00 00 
 10ac718:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]
 10ac71f:	00 
 10ac720:	49 83 65 00 00       	and    QWORD PTR [r13+0x0],0x0
 10ac725:	0f 57 c9             	xorps  xmm1,xmm1
 10ac728:	0f 29 8c 24 d0 00 00 	movaps XMMWORD PTR [rsp+0xd0],xmm1
 10ac72f:	00 
 10ac730:	48 8d 15 a9 b6 92 ff 	lea    rdx,[rip+0xffffffffff92b6a9]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 10ac737:	49 89 55 10          	mov    QWORD PTR [r13+0x10],rdx
 10ac73b:	48 8d 15 ea 14 00 00 	lea    rdx,[rip+0x14ea]        # 10adc2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275042>
 10ac742:	49 89 55 18          	mov    QWORD PTR [r13+0x18],rdx
 10ac746:	48 8d 15 43 06 7a 00 	lea    rdx,[rip+0x7a0643]        # 184cd90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9478>
 10ac74d:	49 89 16             	mov    QWORD PTR [r14],rdx
 10ac750:	48 8b 94 24 c0 01 00 	mov    rdx,QWORD PTR [rsp+0x1c0]
 10ac757:	00 
 10ac758:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx
 10ac75c:	49 8b 57 10          	mov    rdx,QWORD PTR [r15+0x10]
 10ac760:	49 89 56 20          	mov    QWORD PTR [r14+0x20],rdx
 10ac764:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
 10ac768:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
 10ac76d:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
 10ac772:	41 0f 29 0f          	movaps XMMWORD PTR [r15],xmm1
 10ac776:	49 89 4e 28          	mov    QWORD PTR [r14+0x28],rcx
 10ac77a:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
 10ac77e:	49 8d 7e 38          	lea    rdi,[r14+0x38]
 10ac782:	4c 89 ee             	mov    rsi,r13
 10ac785:	e8 3c 3e 00 00       	call   10b05c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2779dc>
 10ac78a:	0f 57 c0             	xorps  xmm0,xmm0
 10ac78d:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0
 10ac792:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
 10ac797:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
 10ac79c:	49 8d be 88 00 00 00 	lea    rdi,[r14+0x88]
 10ac7a3:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
 10ac7a7:	e8 16 4f 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 10ac7ac:	66 41 c7 86 98 00 00 	mov    WORD PTR [r14+0x98],0x100
 10ac7b3:	00 00 01 
 10ac7b6:	4c 89 f7             	mov    rdi,r14
 10ac7b9:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
 10ac7c0:	e8 c9 ba a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 10ac7c5:	4c 89 ef             	mov    rdi,r13
 10ac7c8:	e8 6f 14 00 00       	call   10adc3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275052>
 10ac7cd:	4c 89 ff             	mov    rdi,r15
 10ac7d0:	e8 bb 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ac7d5:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 10ac7da:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10ac7dd:	4c 89 30             	mov    QWORD PTR [rax],r14
 10ac7e0:	48 85 ff             	test   rdi,rdi
 10ac7e3:	74 06                	je     10ac7eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273c01>
 10ac7e5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac7e8:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10ac7eb:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 10ac7f2:	00 
 10ac7f3:	e8 98 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ac7f8:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
 10ac7ff:	00 
 10ac800:	e8 8b 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ac805:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
 10ac80c:	00 
 10ac80d:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
 10ac812:	e8 d1 b6 ab ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>
 10ac817:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
 10ac81c:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 10ac821:	48 8b 00             	mov    rax,QWORD PTR [rax]
 10ac824:	4c 8d b4 24 d8 00 00 	lea    r14,[rsp+0xd8]
 10ac82b:	00 
 10ac82c:	49 89 46 f8          	mov    QWORD PTR [r14-0x8],rax
 10ac830:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
 10ac837:	00 
 10ac838:	4c 89 f7             	mov    rdi,r14
 10ac83b:	e8 6c c9 ac ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
 10ac840:	48 8d 05 d1 53 3a ff 	lea    rax,[rip+0xffffffffff3a53d1]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
 10ac847:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
 10ac84e:	00 
 10ac84f:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
 10ac856:	00 
 10ac857:	48 83 a4 24 c8 00 00 	and    QWORD PTR [rsp+0xc8],0x0
 10ac85e:	00 00 
 10ac860:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 10ac867:	00 
 10ac868:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
 10ac86f:	00 
 10ac870:	e8 2b d2 ac ff       	call   b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>
 10ac875:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0
 10ac87c:	00 00 
 10ac87e:	48 83 a4 24 20 01 00 	and    QWORD PTR [rsp+0x120],0x0
 10ac885:	00 00 
 10ac887:	6a 18                	push   0x18
 10ac889:	5f                   	pop    rdi
 10ac88a:	e8 71 16 74 00       	call   17edf00 <_Znwm@plt>
 10ac88f:	49 89 c7             	mov    r15,rax
 10ac892:	48 8d b4 24 f0 00 00 	lea    rsi,[rsp+0xf0]
 10ac899:	00 
 10ac89a:	48 89 c7             	mov    rdi,rax
 10ac89d:	e8 fe d1 ac ff       	call   b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>
 10ac8a2:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]
 10ac8a9:	00 
 10ac8aa:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15
 10ac8ae:	48 8d 05 a3 1b b8 ff 	lea    rax,[rip+0xffffffffffb81ba3]        # c2e458 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17b3f8>
 10ac8b5:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
 10ac8b9:	48 8d 05 a2 13 00 00 	lea    rax,[rip+0x13a2]        # 10adc62 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275078>
 10ac8c0:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
 10ac8c4:	48 8d b4 24 b8 00 00 	lea    rsi,[rsp+0xb8]
 10ac8cb:	00 
 10ac8cc:	48 8b bc 24 c0 01 00 	mov    rdi,QWORD PTR [rsp+0x1c0]
 10ac8d3:	00 
 10ac8d4:	4c 89 ea             	mov    rdx,r13
 10ac8d7:	e8 ac 4b 71 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>
 10ac8dc:	4c 89 ef             	mov    rdi,r13
 10ac8df:	e8 ba a9 9f ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
 10ac8e4:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 10ac8eb:	00 
 10ac8ec:	e8 3f 61 ae ff       	call   b92a30 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdf9d0>
 10ac8f1:	4c 89 f7             	mov    rdi,r14
 10ac8f4:	e8 2d 42 9f ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 10ac8f9:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
 10ac900:	00 
 10ac901:	e8 20 42 9f ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 10ac906:	eb 0d                	jmp    10ac915 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273d2b>
 10ac908:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac90f:	00 
 10ac910:	e8 1b a4 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac915:	84 db                	test   bl,bl
 10ac917:	0f 84 46 06 00 00    	je     10acf63 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274379>
 10ac91d:	48 8d 35 7d 47 2c ff 	lea    rsi,[rip+0xffffffffff2c477d]        # 3710a1 <_ZTSSt12bad_any_cast@@Base-0x1f127>
 10ac924:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
 10ac92b:	00 
 10ac92c:	e8 4d d1 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10ac931:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 10ac936:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
 10ac93a:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 10ac941:	00 
 10ac942:	48 8d 94 24 b8 00 00 	lea    rdx,[rsp+0xb8]
 10ac949:	00 
 10ac94a:	e8 6b 07 a0 ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
 10ac94f:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10ac953:	e8 14 99 df ff       	call   ea626c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d682>
 10ac958:	41 89 c7             	mov    r15d,eax
 10ac95b:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10ac95f:	e8 26 99 df ff       	call   ea628a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6a0>
 10ac964:	89 c5                	mov    ebp,eax
 10ac966:	bf f8 00 00 00       	mov    edi,0xf8
 10ac96b:	e8 90 15 74 00       	call   17edf00 <_Znwm@plt>
 10ac970:	49 89 c6             	mov    r14,rax
 10ac973:	4d 63 ef             	movsxd r13,r15d
 10ac976:	48 63 c5             	movsxd rax,ebp
 10ac979:	48 8b 8c 24 e0 00 00 	mov    rcx,QWORD PTR [rsp+0xe0]
 10ac980:	00 
 10ac981:	48 89 8c 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rcx
 10ac988:	00 
 10ac989:	0f 28 84 24 d0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xd0]
 10ac990:	00 
 10ac991:	0f 29 84 24 f0 00 00 	movaps XMMWORD PTR [rsp+0xf0],xmm0
 10ac998:	00 
 10ac999:	0f 57 c9             	xorps  xmm1,xmm1
 10ac99c:	48 83 a4 24 e0 00 00 	and    QWORD PTR [rsp+0xe0],0x0
 10ac9a3:	00 00 
 10ac9a5:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10ac9ac:	00 
 10ac9ad:	48 83 26 00          	and    QWORD PTR [rsi],0x0
 10ac9b1:	0f 29 8c 24 d0 00 00 	movaps XMMWORD PTR [rsp+0xd0],xmm1
 10ac9b8:	00 
 10ac9b9:	4c 6b f8 3c          	imul   r15,rax,0x3c
 10ac9bd:	48 8d 05 1c b4 92 ff 	lea    rax,[rip+0xffffffffff92b41c]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 10ac9c4:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
 10ac9c8:	48 8d 05 9b 12 00 00 	lea    rax,[rip+0x129b]        # 10adc6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275080>
 10ac9cf:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
 10ac9d3:	48 8d 05 6e 03 7a 00 	lea    rax,[rip+0x7a036e]        # 184cd48 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9430>
 10ac9da:	49 89 06             	mov    QWORD PTR [r14],rax
 10ac9dd:	48 8b 84 24 c0 01 00 	mov    rax,QWORD PTR [rsp+0x1c0]
 10ac9e4:	00 
 10ac9e5:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
 10ac9e9:	48 8b 84 24 00 01 00 	mov    rax,QWORD PTR [rsp+0x100]
 10ac9f0:	00 
 10ac9f1:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
 10ac9f5:	0f 28 84 24 f0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xf0]
 10ac9fc:	00 
 10ac9fd:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
 10aca02:	48 83 a4 24 00 01 00 	and    QWORD PTR [rsp+0x100],0x0
 10aca09:	00 00 
 10aca0b:	49 83 fd 06          	cmp    r13,0x6
 10aca0f:	6a 06                	push   0x6
 10aca11:	58                   	pop    rax
 10aca12:	49 0f 42 c5          	cmovb  rax,r13
 10aca16:	0f 29 8c 24 f0 00 00 	movaps XMMWORD PTR [rsp+0xf0],xmm1
 10aca1d:	00 
 10aca1e:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
 10aca22:	49 81 ff 11 0e 00 00 	cmp    r15,0xe11
 10aca29:	b8 10 0e 00 00       	mov    eax,0xe10
 10aca2e:	49 0f 4d c7          	cmovge rax,r15
 10aca32:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
 10aca36:	49 8d 7e 38          	lea    rdi,[r14+0x38]
 10aca3a:	e8 87 3b 00 00       	call   10b05c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2779dc>
 10aca3f:	0f 57 c0             	xorps  xmm0,xmm0
 10aca42:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0
 10aca47:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
 10aca4c:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
 10aca51:	49 8d be 88 00 00 00 	lea    rdi,[r14+0x88]
 10aca58:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
 10aca5c:	e8 61 4c 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 10aca61:	41 c6 86 98 00 00 00 	mov    BYTE PTR [r14+0x98],0x0
 10aca68:	00 
 10aca69:	4c 89 f7             	mov    rdi,r14
 10aca6c:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
 10aca73:	e8 16 b8 a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 10aca78:	41 83 fd 07          	cmp    r13d,0x7
 10aca7c:	72 22                	jb     10acaa0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273eb6>
 10aca7e:	48 8d 35 f7 54 3a ff 	lea    rsi,[rip+0xffffffffff3a54f7]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 10aca85:	48 8d 0d eb 74 29 ff 	lea    rcx,[rip+0xffffffffff2974eb]        # 343f77 <_ZTSSt12bad_any_cast@@Base-0x4c251>
 10aca8c:	6a 03                	push   0x3
 10aca8e:	5f                   	pop    rdi
 10aca8f:	6a 4b                	push   0x4b
 10aca91:	5a                   	pop    rdx
 10aca92:	6a 06                	push   0x6
 10aca94:	41 59                	pop    r9
 10aca96:	4d 89 e8             	mov    r8,r13
 10aca99:	31 c0                	xor    eax,eax
 10aca9b:	e8 32 9e 72 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
 10acaa0:	83 fd 3b             	cmp    ebp,0x3b
 10acaa3:	7f 24                	jg     10acac9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273edf>
 10acaa5:	48 8d 35 d0 54 3a ff 	lea    rsi,[rip+0xffffffffff3a54d0]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 10acaac:	48 8d 0d 9c 2d 29 ff 	lea    rcx,[rip+0xffffffffff292d9c]        # 33f84f <_ZTSSt12bad_any_cast@@Base-0x50979>
 10acab3:	6a 03                	push   0x3
 10acab5:	5f                   	pop    rdi
 10acab6:	6a 50                	push   0x50
 10acab8:	5a                   	pop    rdx
 10acab9:	41 b9 10 0e 00 00    	mov    r9d,0xe10
 10acabf:	4d 89 f8             	mov    r8,r15
 10acac2:	31 c0                	xor    eax,eax
 10acac4:	e8 09 9e 72 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
 10acac9:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10acad0:	00 
 10acad1:	e8 66 11 00 00       	call   10adc3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275052>
 10acad6:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 10acadd:	00 
 10acade:	e8 ad 13 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10acae3:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 10acae8:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10acaeb:	4c 89 30             	mov    QWORD PTR [rax],r14
 10acaee:	48 85 ff             	test   rdi,rdi
 10acaf1:	74 06                	je     10acaf9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273f0f>
 10acaf3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10acaf6:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10acaf9:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 10acb00:	00 
 10acb01:	e8 8a 13 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10acb06:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
 10acb0d:	00 
 10acb0e:	e8 7d 13 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10acb13:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
 10acb1a:	00 
 10acb1b:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
 10acb20:	e8 c3 b3 ab ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>
 10acb25:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 10acb2a:	48 8b 00             	mov    rax,QWORD PTR [rax]
 10acb2d:	4c 8d b4 24 d8 00 00 	lea    r14,[rsp+0xd8]
 10acb34:	00 
 10acb35:	49 89 46 f8          	mov    QWORD PTR [r14-0x8],rax
 10acb39:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
 10acb40:	00 
 10acb41:	4c 89 f7             	mov    rdi,r14
 10acb44:	e8 63 c6 ac ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
 10acb49:	48 8d 05 c8 50 3a ff 	lea    rax,[rip+0xffffffffff3a50c8]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
 10acb50:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
 10acb57:	00 
 10acb58:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
 10acb5f:	00 
 10acb60:	48 83 a4 24 c8 00 00 	and    QWORD PTR [rsp+0xc8],0x0
 10acb67:	00 00 
 10acb69:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 10acb70:	00 
 10acb71:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
 10acb78:	00 
 10acb79:	e8 22 cf ac ff       	call   b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>
 10acb7e:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0
 10acb85:	00 00 
 10acb87:	48 83 a4 24 20 01 00 	and    QWORD PTR [rsp+0x120],0x0
 10acb8e:	00 00 
 10acb90:	6a 18                	push   0x18
 10acb92:	5f                   	pop    rdi
 10acb93:	e8 68 13 74 00       	call   17edf00 <_Znwm@plt>
 10acb98:	49 89 c7             	mov    r15,rax
 10acb9b:	48 8d b4 24 f0 00 00 	lea    rsi,[rsp+0xf0]
 10acba2:	00 
 10acba3:	48 89 c7             	mov    rdi,rax
 10acba6:	e8 f5 ce ac ff       	call   b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>
 10acbab:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]
 10acbb2:	00 
 10acbb3:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15
 10acbb7:	48 8d 05 9a 18 b8 ff 	lea    rax,[rip+0xffffffffffb8189a]        # c2e458 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17b3f8>
 10acbbe:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
 10acbc2:	48 8d 05 b1 10 00 00 	lea    rax,[rip+0x10b1]        # 10adc7a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275090>
 10acbc9:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
 10acbcd:	48 8d b4 24 b8 00 00 	lea    rsi,[rsp+0xb8]
 10acbd4:	00 
 10acbd5:	48 8b bc 24 c0 01 00 	mov    rdi,QWORD PTR [rsp+0x1c0]
 10acbdc:	00 
 10acbdd:	4c 89 ea             	mov    rdx,r13
 10acbe0:	e8 a3 48 71 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>
 10acbe5:	4c 89 ef             	mov    rdi,r13
 10acbe8:	e8 b1 a6 9f ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
 10acbed:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 10acbf4:	00 
 10acbf5:	e8 36 5e ae ff       	call   b92a30 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdf9d0>
 10acbfa:	4c 89 f7             	mov    rdi,r14
 10acbfd:	e8 24 3f 9f ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 10acc02:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 10acc07:	48 8b 18             	mov    rbx,QWORD PTR [rax]
 10acc0a:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 10acc0f:	4c 8b 38             	mov    r15,QWORD PTR [rax]
 10acc12:	bf 48 01 00 00       	mov    edi,0x148
 10acc17:	e8 e4 12 74 00       	call   17edf00 <_Znwm@plt>
 10acc1c:	49 89 c6             	mov    r14,rax
 10acc1f:	48 8d 05 d2 ff 79 00 	lea    rax,[rip+0x79ffd2]        # 184cbf8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x92e0>
 10acc26:	49 89 06             	mov    QWORD PTR [r14],rax
 10acc29:	48 8d 05 50 00 7a 00 	lea    rax,[rip+0x7a0050]        # 184cc80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9368>
 10acc30:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
 10acc34:	48 8d 05 6d 00 7a 00 	lea    rax,[rip+0x7a006d]        # 184cca8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9390>
 10acc3b:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
 10acc3f:	4c 8b a4 24 e0 01 00 	mov    r12,QWORD PTR [rsp+0x1e0]
 10acc46:	00 
 10acc47:	4d 89 66 18          	mov    QWORD PTR [r14+0x18],r12
 10acc4b:	49 89 5e 20          	mov    QWORD PTR [r14+0x20],rbx
 10acc4f:	4d 89 7e 28          	mov    QWORD PTR [r14+0x28],r15
 10acc53:	31 db                	xor    ebx,ebx
 10acc55:	41 88 5e 30          	mov    BYTE PTR [r14+0x30],bl
 10acc59:	41 88 5e 60          	mov    BYTE PTR [r14+0x60],bl
 10acc5d:	41 88 5e 68          	mov    BYTE PTR [r14+0x68],bl
 10acc61:	41 88 9e c0 00 00 00 	mov    BYTE PTR [r14+0xc0],bl
 10acc68:	0f 57 c0             	xorps  xmm0,xmm0
 10acc6b:	41 0f 11 86 c8 00 00 	movups XMMWORD PTR [r14+0xc8],xmm0
 10acc72:	00 
 10acc73:	4c 8d 84 24 d0 00 00 	lea    r8,[rsp+0xd0]
 10acc7a:	00 
 10acc7b:	4d 89 30             	mov    QWORD PTR [r8],r14
 10acc7e:	48 8d 35 0c 04 9f ff 	lea    rsi,[rip+0xffffffffff9f040c]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 10acc85:	48 8d 0d 72 2d 00 00 	lea    rcx,[rip+0x2d72]        # 10af9fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x276e14>
 10acc8c:	4c 8d bc 24 10 01 00 	lea    r15,[rsp+0x110]
 10acc93:	00 
 10acc94:	6a 08                	push   0x8
 10acc96:	41 59                	pop    r9
 10acc98:	4c 89 ff             	mov    rdi,r15
 10acc9b:	31 d2                	xor    edx,edx
 10acc9d:	e8 f2 da 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 10acca2:	4d 89 f5             	mov    r13,r14
 10acca5:	49 81 c5 d8 00 00 00 	add    r13,0xd8
 10accac:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 10accb0:	48 8d ac 24 f0 00 00 	lea    rbp,[rsp+0xf0]
 10accb7:	00 
 10accb8:	48 89 ef             	mov    rdi,rbp
 10accbb:	4c 89 e6             	mov    rsi,r12
 10accbe:	4c 89 fa             	mov    rdx,r15
 10accc1:	ff 50 30             	call   QWORD PTR [rax+0x30]
 10accc4:	4c 89 ef             	mov    rdi,r13
 10accc7:	48 89 ee             	mov    rsi,rbp
 10accca:	e8 6f cd 72 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
 10acccf:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
 10accd3:	e8 ae 17 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10accd8:	4c 89 ff             	mov    rdi,r15
 10accdb:	e8 08 db 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10acce0:	41 88 9e e8 00 00 00 	mov    BYTE PTR [r14+0xe8],bl
 10acce7:	0f 57 c0             	xorps  xmm0,xmm0
 10accea:	41 0f 11 86 f0 00 00 	movups XMMWORD PTR [r14+0xf0],xmm0
 10accf1:	00 
 10accf2:	41 0f 11 86 00 01 00 	movups XMMWORD PTR [r14+0x100],xmm0
 10accf9:	00 
 10accfa:	41 c7 86 10 01 00 00 	mov    DWORD PTR [r14+0x110],0x3f800000
 10acd01:	00 00 80 3f 
 10acd05:	41 0f 11 86 18 01 00 	movups XMMWORD PTR [r14+0x118],xmm0
 10acd0c:	00 
 10acd0d:	41 0f 11 86 28 01 00 	movups XMMWORD PTR [r14+0x128],xmm0
 10acd14:	00 
 10acd15:	41 0f 11 86 38 01 00 	movups XMMWORD PTR [r14+0x138],xmm0
 10acd1c:	00 
 10acd1d:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
 10acd22:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10acd25:	4c 89 30             	mov    QWORD PTR [rax],r14
 10acd28:	48 85 ff             	test   rdi,rdi
 10acd2b:	74 06                	je     10acd33 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274149>
 10acd2d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10acd30:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10acd33:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10acd38:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10acd3b:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10acd3e:	49 89 c6             	mov    r14,rax
 10acd41:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
 10acd46:	48 8b 18             	mov    rbx,QWORD PTR [rax]
 10acd49:	6a 50                	push   0x50
 10acd4b:	5f                   	pop    rdi
 10acd4c:	e8 af 11 74 00       	call   17edf00 <_Znwm@plt>
 10acd51:	48 8d 0d b8 01 7a 00 	lea    rcx,[rip+0x7a01b8]        # 184cf10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x95f8>
 10acd58:	48 89 08             	mov    QWORD PTR [rax],rcx
 10acd5b:	48 8d 0d 5e 02 7a 00 	lea    rcx,[rip+0x7a025e]        # 184cfc0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x96a8>
 10acd62:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 10acd66:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
 10acd6a:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx
 10acd6e:	48 8b 9c 24 e8 01 00 	mov    rbx,QWORD PTR [rsp+0x1e8]
 10acd75:	00 
 10acd76:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
 10acd7a:	0f 57 c0             	xorps  xmm0,xmm0
 10acd7d:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
 10acd81:	0f 11 40 38          	movups XMMWORD PTR [rax+0x38],xmm0
 10acd85:	c7 40 48 00 00 80 3f 	mov    DWORD PTR [rax+0x48],0x3f800000
 10acd8c:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10acd93:	00 
 10acd94:	49 83 26 00          	and    QWORD PTR [r14],0x0
 10acd98:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
 10acd9d:	48 89 c6             	mov    rsi,rax
 10acda0:	e8 dd 0e 00 00       	call   10adc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275098>
 10acda5:	4c 89 f7             	mov    rdi,r14
 10acda8:	e8 f5 0e 00 00       	call   10adca2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750b8>
 10acdad:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10acdb2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10acdb5:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10acdb8:	49 89 c7             	mov    r15,rax
 10acdbb:	48 8b bc 24 d8 01 00 	mov    rdi,QWORD PTR [rsp+0x1d8]
 10acdc2:	00 
 10acdc3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10acdc6:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10acdc9:	49 89 c5             	mov    r13,rax
 10acdcc:	bf c8 00 00 00       	mov    edi,0xc8
 10acdd1:	e8 2a 11 74 00       	call   17edf00 <_Znwm@plt>
 10acdd6:	49 89 c6             	mov    r14,rax
 10acdd9:	48 8d 05 30 fd 79 00 	lea    rax,[rip+0x79fd30]        # 184cb10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x91f8>
 10acde0:	49 89 06             	mov    QWORD PTR [r14],rax
 10acde3:	48 8d 05 de fd 79 00 	lea    rax,[rip+0x79fdde]        # 184cbc8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x92b0>
 10acdea:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
 10acdee:	4d 89 7e 10          	mov    QWORD PTR [r14+0x10],r15
 10acdf2:	4d 89 6e 18          	mov    QWORD PTR [r14+0x18],r13
 10acdf6:	49 89 5e 20          	mov    QWORD PTR [r14+0x20],rbx
 10acdfa:	4d 8d 66 28          	lea    r12,[r14+0x28]
 10acdfe:	0f 57 c0             	xorps  xmm0,xmm0
 10ace01:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0
 10ace06:	41 0f 11 46 38       	movups XMMWORD PTR [r14+0x38],xmm0
 10ace0b:	41 c7 46 48 00 00 80 	mov    DWORD PTR [r14+0x48],0x3f800000
 10ace12:	3f 
 10ace13:	49 8d 6e 50          	lea    rbp,[r14+0x50]
 10ace17:	48 89 ef             	mov    rdi,rbp
 10ace1a:	e8 e3 03 a1 ff       	call   abd202 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1a2>
 10ace1f:	4d 8d ae a8 00 00 00 	lea    r13,[r14+0xa8]
 10ace26:	4c 89 ef             	mov    rdi,r13
 10ace29:	48 8b b4 24 c0 01 00 	mov    rsi,QWORD PTR [rsp+0x1c0]
 10ace30:	00 
 10ace31:	e8 8c 48 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 10ace36:	4c 8d 84 24 d0 00 00 	lea    r8,[rsp+0xd0]
 10ace3d:	00 
 10ace3e:	4d 89 30             	mov    QWORD PTR [r8],r14
 10ace41:	48 8d 35 49 02 9f ff 	lea    rsi,[rip+0xffffffffff9f0249]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 10ace48:	48 8d 0d 5f 15 00 00 	lea    rcx,[rip+0x155f]        # 10ae3ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2757c4>
 10ace4f:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10ace56:	00 
 10ace57:	6a 08                	push   0x8
 10ace59:	41 59                	pop    r9
 10ace5b:	48 89 df             	mov    rdi,rbx
 10ace5e:	31 d2                	xor    edx,edx
 10ace60:	e8 2f d9 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 10ace65:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10ace68:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 10ace6f:	00 
 10ace70:	6a 01                	push   0x1
 10ace72:	5a                   	pop    rdx
 10ace73:	4c 89 fe             	mov    rsi,r15
 10ace76:	48 89 d9             	mov    rcx,rbx
 10ace79:	ff 50 48             	call   QWORD PTR [rax+0x48]
 10ace7c:	4c 89 f7             	mov    rdi,r14
 10ace7f:	48 81 c7 b8 00 00 00 	add    rdi,0xb8
 10ace86:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]
 10ace8d:	00 
 10ace8e:	48 89 de             	mov    rsi,rbx
 10ace91:	e8 a8 cb 72 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
 10ace96:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 10ace9a:	e8 e7 15 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ace9f:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10acea6:	00 
 10acea7:	e8 3c d9 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10aceac:	48 8d 9c 24 b8 00 00 	lea    rbx,[rsp+0xb8]
 10aceb3:	00 
 10aceb4:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 10aceb8:	4c 8b bc 24 90 00 00 	mov    r15,QWORD PTR [rsp+0x90]
 10acebf:	00 
 10acec0:	4c 89 ff             	mov    rdi,r15
 10acec3:	4c 89 f6             	mov    rsi,r14
 10acec6:	e8 df 0d 00 00       	call   10adcaa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750c0>
 10acecb:	48 89 df             	mov    rdi,rbx
 10acece:	e8 f7 0d 00 00       	call   10adcca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750e0>
 10aced3:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
 10aced8:	48 8b 28             	mov    rbp,QWORD PTR [rax]
 10acedb:	4d 8b 2f             	mov    r13,QWORD PTR [r15]
 10acede:	6a 38                	push   0x38
 10acee0:	5f                   	pop    rdi
 10acee1:	e8 1a 10 74 00       	call   17edf00 <_Znwm@plt>
 10acee6:	49 89 c6             	mov    r14,rax
 10acee9:	48 8d 05 f8 0b 7a 00 	lea    rax,[rip+0x7a0bf8]        # 184dae8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa1d0>
 10acef0:	49 89 06             	mov    QWORD PTR [r14],rax
 10acef3:	48 8d 05 46 0c 7a 00 	lea    rax,[rip+0x7a0c46]        # 184db40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa228>
 10acefa:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
 10acefe:	4d 89 f7             	mov    r15,r14
 10acf01:	49 83 c7 10          	add    r15,0x10
 10acf05:	0f 57 c0             	xorps  xmm0,xmm0
 10acf08:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
 10acf0d:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
 10acf12:	49 83 66 30 00       	and    QWORD PTR [r14+0x30],0x0
 10acf17:	4c 89 ff             	mov    rdi,r15
 10acf1a:	48 89 ee             	mov    rsi,rbp
 10acf1d:	e8 92 68 b2 ff       	call   bd37b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x120754>
 10acf22:	4c 89 ff             	mov    rdi,r15
 10acf25:	4c 89 ee             	mov    rsi,r13
 10acf28:	e8 87 68 b2 ff       	call   bd37b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x120754>
 10acf2d:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
 10acf32:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10acf39:	00 
 10acf3a:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 10acf3e:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
 10acf45:	00 
 10acf46:	4c 89 f6             	mov    rsi,r14
 10acf49:	e8 84 0d 00 00       	call   10adcd2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750e8>
 10acf4e:	48 89 df             	mov    rdi,rbx
 10acf51:	e8 9c 0d 00 00       	call   10adcf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275108>
 10acf56:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
 10acf5d:	00 
 10acf5e:	e8 c3 3b 9f ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 10acf63:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10acf67:	48 8d 35 48 a8 32 ff 	lea    rsi,[rip+0xffffffffff32a848]        # 3d77b6 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x239b>
 10acf6e:	48 8d 0d 5b a8 32 ff 	lea    rcx,[rip+0xffffffffff32a85b]        # 3d77d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23b5>
 10acf75:	6a 0b                	push   0xb
 10acf77:	41 5d                	pop    r13
 10acf79:	6a 15                	push   0x15
 10acf7b:	41 5e                	pop    r14
 10acf7d:	31 ed                	xor    ebp,ebp
 10acf7f:	4c 89 ea             	mov    rdx,r13
 10acf82:	4d 89 f0             	mov    r8,r14
 10acf85:	45 31 c9             	xor    r9d,r9d
 10acf88:	e8 fd a3 53 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
 10acf8d:	88 44 24 40          	mov    BYTE PTR [rsp+0x40],al
 10acf91:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10acf95:	48 8d 35 4a a8 32 ff 	lea    rsi,[rip+0xffffffffff32a84a]        # 3d77e6 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23cb>
 10acf9c:	48 8d 0d 5d a8 32 ff 	lea    rcx,[rip+0xffffffffff32a85d]        # 3d7800 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23e5>
 10acfa3:	6a 1e                	push   0x1e
 10acfa5:	41 58                	pop    r8
 10acfa7:	4c 89 ea             	mov    rdx,r13
 10acfaa:	45 31 c9             	xor    r9d,r9d
 10acfad:	e8 d8 a3 53 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
 10acfb2:	88 44 24 07          	mov    BYTE PTR [rsp+0x7],al
 10acfb6:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10acfba:	48 8d 35 6f a7 32 ff 	lea    rsi,[rip+0xffffffffff32a76f]        # 3d7730 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2315>
 10acfc1:	48 8d 0d 78 a7 32 ff 	lea    rcx,[rip+0xffffffffff32a778]        # 3d7740 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2325>
 10acfc8:	6a 17                	push   0x17
 10acfca:	41 58                	pop    r8
 10acfcc:	4c 89 ea             	mov    rdx,r13
 10acfcf:	45 31 c9             	xor    r9d,r9d
 10acfd2:	e8 b3 a3 53 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
 10acfd7:	88 44 24 05          	mov    BYTE PTR [rsp+0x5],al
 10acfdb:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10acfdf:	48 8d 35 72 a7 32 ff 	lea    rsi,[rip+0xffffffffff32a772]        # 3d7758 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x233d>
 10acfe6:	48 8d 0d 83 a7 32 ff 	lea    rcx,[rip+0xffffffffff32a783]        # 3d7770 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2355>
 10acfed:	6a 16                	push   0x16
 10acfef:	41 58                	pop    r8
 10acff1:	4c 89 ea             	mov    rdx,r13
 10acff4:	45 31 c9             	xor    r9d,r9d
 10acff7:	e8 8e a3 53 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
 10acffc:	88 44 24 04          	mov    BYTE PTR [rsp+0x4],al
 10ad000:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10ad004:	48 8d 35 7c a7 32 ff 	lea    rsi,[rip+0xffffffffff32a77c]        # 3d7787 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x236c>
 10ad00b:	48 8d 0d 8e a7 32 ff 	lea    rcx,[rip+0xffffffffff32a78e]        # 3d77a0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2385>
 10ad012:	4c 89 ea             	mov    rdx,r13
 10ad015:	4d 89 f0             	mov    r8,r14
 10ad018:	45 31 c9             	xor    r9d,r9d
 10ad01b:	e8 6a a3 53 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
 10ad020:	88 44 24 06          	mov    BYTE PTR [rsp+0x6],al
 10ad024:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 10ad028:	48 8d 15 c1 a4 32 ff 	lea    rdx,[rip+0xffffffffff32a4c1]        # 3d74f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20d5>
 10ad02f:	4c 8d 05 da a4 32 ff 	lea    r8,[rip+0xffffffffff32a4da]        # 3d7510 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20f5>
 10ad036:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10ad03d:	00 
 10ad03e:	6a 11                	push   0x11
 10ad040:	59                   	pop    rcx
 10ad041:	6a 22                	push   0x22
 10ad043:	41 59                	pop    r9
 10ad045:	48 89 df             	mov    rdi,rbx
 10ad048:	e8 7b a4 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ad04d:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
 10ad051:	74 16                	je     10ad069 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27447f>
 10ad053:	48 8d 35 a3 d6 2c ff 	lea    rsi,[rip+0xffffffffff2cd6a3]        # 37a6fd <_ZTSSt12bad_any_cast@@Base-0x15acb>
 10ad05a:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad061:	00 
 10ad062:	e8 e8 e7 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ad067:	89 c5                	mov    ebp,eax
 10ad069:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad070:	00 
 10ad071:	e8 ba 9c 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ad076:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 10ad07a:	48 8d 15 bf a4 32 ff 	lea    rdx,[rip+0xffffffffff32a4bf]        # 3d7540 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2125>
 10ad081:	4c 8d 05 d8 a4 32 ff 	lea    r8,[rip+0xffffffffff32a4d8]        # 3d7560 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2145>
 10ad088:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10ad08f:	00 
 10ad090:	6a 11                	push   0x11
 10ad092:	59                   	pop    rcx
 10ad093:	6a 2b                	push   0x2b
 10ad095:	41 59                	pop    r9
 10ad097:	48 89 df             	mov    rdi,rbx
 10ad09a:	e8 29 a4 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ad09f:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
 10ad0a3:	74 1a                	je     10ad0bf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2744d5>
 10ad0a5:	48 8d 35 ff b7 32 ff 	lea    rsi,[rip+0xffffffffff32b7ff]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ad0ac:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad0b3:	00 
 10ad0b4:	e8 96 e7 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ad0b9:	89 44 24 3c          	mov    DWORD PTR [rsp+0x3c],eax
 10ad0bd:	eb 08                	jmp    10ad0c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2744dd>
 10ad0bf:	c7 44 24 3c 00 00 00 	mov    DWORD PTR [rsp+0x3c],0x0
 10ad0c6:	00 
 10ad0c7:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad0ce:	00 
 10ad0cf:	e8 5c 9c 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ad0d4:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 10ad0d8:	48 8d 15 b1 a4 32 ff 	lea    rdx,[rip+0xffffffffff32a4b1]        # 3d7590 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2175>
 10ad0df:	4c 8d 05 ca a4 32 ff 	lea    r8,[rip+0xffffffffff32a4ca]        # 3d75b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2195>
 10ad0e6:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10ad0ed:	00 
 10ad0ee:	6a 11                	push   0x11
 10ad0f0:	59                   	pop    rcx
 10ad0f1:	6a 18                	push   0x18
 10ad0f3:	41 59                	pop    r9
 10ad0f5:	48 89 df             	mov    rdi,rbx
 10ad0f8:	e8 cb a3 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ad0fd:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
 10ad101:	89 6c 24 10          	mov    DWORD PTR [rsp+0x10],ebp
 10ad105:	74 1a                	je     10ad121 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274537>
 10ad107:	48 8d 35 9d b7 32 ff 	lea    rsi,[rip+0xffffffffff32b79d]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ad10e:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad115:	00 
 10ad116:	e8 34 e7 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ad11b:	89 44 24 38          	mov    DWORD PTR [rsp+0x38],eax
 10ad11f:	eb 08                	jmp    10ad129 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27453f>
 10ad121:	c7 44 24 38 00 00 00 	mov    DWORD PTR [rsp+0x38],0x0
 10ad128:	00 
 10ad129:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad130:	00 
 10ad131:	e8 fa 9b 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ad136:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 10ad13b:	48 8b 18             	mov    rbx,QWORD PTR [rax]
 10ad13e:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 10ad143:	4c 8b 20             	mov    r12,QWORD PTR [rax]
 10ad146:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
 10ad14b:	4c 8b 30             	mov    r14,QWORD PTR [rax]
 10ad14e:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 10ad153:	4c 8b 38             	mov    r15,QWORD PTR [rax]
 10ad156:	bf 98 01 00 00       	mov    edi,0x198
 10ad15b:	e8 a0 0d 74 00       	call   17edf00 <_Znwm@plt>
 10ad160:	48 89 c5             	mov    rbp,rax
 10ad163:	0f b6 44 24 40       	movzx  eax,BYTE PTR [rsp+0x40]
 10ad168:	66 0f 6e c0          	movd   xmm0,eax
 10ad16c:	0f b6 44 24 07       	movzx  eax,BYTE PTR [rsp+0x7]
 10ad171:	66 0f 3a 20 c0 01    	pinsrb xmm0,eax,0x1
 10ad177:	0f b6 44 24 05       	movzx  eax,BYTE PTR [rsp+0x5]
 10ad17c:	66 0f 3a 20 c0 02    	pinsrb xmm0,eax,0x2
 10ad182:	0f b6 44 24 04       	movzx  eax,BYTE PTR [rsp+0x4]
 10ad187:	66 0f 3a 20 c0 03    	pinsrb xmm0,eax,0x3
 10ad18d:	66 0f 7f 44 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm0
 10ad193:	4d 8d 6e 08          	lea    r13,[r14+0x8]
 10ad197:	4d 85 f6             	test   r14,r14
 10ad19a:	4d 0f 44 ee          	cmove  r13,r14
 10ad19e:	48 8d 05 2b 04 7a 00 	lea    rax,[rip+0x7a042b]        # 184d5d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9cb8>
 10ad1a5:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
 10ad1a9:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
 10ad1ae:	48 89 45 08          	mov    QWORD PTR [rbp+0x8],rax
 10ad1b2:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 10ad1b7:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax
 10ad1bb:	4c 89 65 18          	mov    QWORD PTR [rbp+0x18],r12
 10ad1bf:	4c 8d 65 20          	lea    r12,[rbp+0x20]
 10ad1c3:	4c 89 e7             	mov    rdi,r12
 10ad1c6:	e8 2b c8 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 10ad1cb:	4c 89 6d 30          	mov    QWORD PTR [rbp+0x30],r13
 10ad1cf:	4c 89 7d 38          	mov    QWORD PTR [rbp+0x38],r15
 10ad1d3:	48 8d 7d 40          	lea    rdi,[rbp+0x40]
 10ad1d7:	48 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],rdi
 10ad1dc:	e8 15 c8 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 10ad1e1:	c7 45 50 05 00 00 00 	mov    DWORD PTR [rbp+0x50],0x5
 10ad1e8:	66 83 65 54 00       	and    WORD PTR [rbp+0x54],0x0
 10ad1ed:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]
 10ad1f2:	f3 0f 11 45 56       	movss  DWORD PTR [rbp+0x56],xmm0
 10ad1f7:	8a 44 24 06          	mov    al,BYTE PTR [rsp+0x6]
 10ad1fb:	88 45 5a             	mov    BYTE PTR [rbp+0x5a],al
 10ad1fe:	c6 45 5b 00          	mov    BYTE PTR [rbp+0x5b],0x0
 10ad202:	8b 44 24 10          	mov    eax,DWORD PTR [rsp+0x10]
 10ad206:	88 45 5c             	mov    BYTE PTR [rbp+0x5c],al
 10ad209:	8b 44 24 3c          	mov    eax,DWORD PTR [rsp+0x3c]
 10ad20d:	88 45 5d             	mov    BYTE PTR [rbp+0x5d],al
 10ad210:	8b 44 24 38          	mov    eax,DWORD PTR [rsp+0x38]
 10ad214:	88 45 5e             	mov    BYTE PTR [rbp+0x5e],al
 10ad217:	48 89 5d 60          	mov    QWORD PTR [rbp+0x60],rbx
 10ad21b:	48 8b 84 24 98 01 00 	mov    rax,QWORD PTR [rsp+0x198]
 10ad222:	00 
 10ad223:	48 89 45 68          	mov    QWORD PTR [rbp+0x68],rax
 10ad227:	48 8b 84 24 a0 01 00 	mov    rax,QWORD PTR [rsp+0x1a0]
 10ad22e:	00 
 10ad22f:	48 89 45 70          	mov    QWORD PTR [rbp+0x70],rax
 10ad233:	48 8b 84 24 a8 01 00 	mov    rax,QWORD PTR [rsp+0x1a8]
 10ad23a:	00 
 10ad23b:	48 89 45 78          	mov    QWORD PTR [rbp+0x78],rax
 10ad23f:	48 8b 84 24 b0 01 00 	mov    rax,QWORD PTR [rsp+0x1b0]
 10ad246:	00 
 10ad247:	48 89 85 80 00 00 00 	mov    QWORD PTR [rbp+0x80],rax
 10ad24e:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
 10ad255:	00 
 10ad256:	48 89 85 88 00 00 00 	mov    QWORD PTR [rbp+0x88],rax
 10ad25d:	48 8b 84 24 c8 01 00 	mov    rax,QWORD PTR [rsp+0x1c8]
 10ad264:	00 
 10ad265:	48 89 85 90 00 00 00 	mov    QWORD PTR [rbp+0x90],rax
 10ad26c:	0f 57 c0             	xorps  xmm0,xmm0
 10ad26f:	48 83 a5 b8 00 00 00 	and    QWORD PTR [rbp+0xb8],0x0
 10ad276:	00 
 10ad277:	0f 11 85 98 00 00 00 	movups XMMWORD PTR [rbp+0x98],xmm0
 10ad27e:	0f 11 85 a8 00 00 00 	movups XMMWORD PTR [rbp+0xa8],xmm0
 10ad285:	c7 85 c0 00 00 00 00 	mov    DWORD PTR [rbp+0xc0],0x3f800000
 10ad28c:	00 80 3f 
 10ad28f:	48 8d bd c8 00 00 00 	lea    rdi,[rbp+0xc8]
 10ad296:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
 10ad29b:	e8 ee af a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 10ad2a0:	48 8d bd 20 01 00 00 	lea    rdi,[rbp+0x120]
 10ad2a7:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
 10ad2ac:	e8 dd af a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 10ad2b1:	4c 8d b5 78 01 00 00 	lea    r14,[rbp+0x178]
 10ad2b8:	4c 89 f7             	mov    rdi,r14
 10ad2bb:	e8 36 c7 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 10ad2c0:	4c 8d ad 88 01 00 00 	lea    r13,[rbp+0x188]
 10ad2c7:	4c 89 ef             	mov    rdi,r13
 10ad2ca:	e8 27 c7 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 10ad2cf:	8a 45 5e             	mov    al,BYTE PTR [rbp+0x5e]
 10ad2d2:	86 05 68 3e 94 00    	xchg   BYTE PTR [rip+0x943e68],al        # 19f1140 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x2870>
 10ad2d8:	4c 8b 7d 08          	mov    r15,QWORD PTR [rbp+0x8]
 10ad2dc:	4c 8d 84 24 d0 00 00 	lea    r8,[rsp+0xd0]
 10ad2e3:	00 
 10ad2e4:	49 89 28             	mov    QWORD PTR [r8],rbp
 10ad2e7:	48 8d 35 a3 fd 9e ff 	lea    rsi,[rip+0xffffffffff9efda3]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 10ad2ee:	48 8d 0d db d2 00 00 	lea    rcx,[rip+0xd2db]        # 10ba5d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2819e6>
 10ad2f5:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10ad2fc:	00 
 10ad2fd:	6a 08                	push   0x8
 10ad2ff:	41 59                	pop    r9
 10ad301:	48 89 df             	mov    rdi,rbx
 10ad304:	31 d2                	xor    edx,edx
 10ad306:	e8 89 d4 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 10ad30b:	49 8b 37             	mov    rsi,QWORD PTR [r15]
 10ad30e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ad311:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]
 10ad318:	00 
 10ad319:	4c 89 ff             	mov    rdi,r15
 10ad31c:	48 89 da             	mov    rdx,rbx
 10ad31f:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10ad322:	4c 89 f7             	mov    rdi,r14
 10ad325:	4c 89 fe             	mov    rsi,r15
 10ad328:	e8 c5 c8 72 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 10ad32d:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
 10ad331:	e8 50 11 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad336:	48 89 df             	mov    rdi,rbx
 10ad339:	e8 aa d4 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10ad33e:	4c 8b bd 90 00 00 00 	mov    r15,QWORD PTR [rbp+0x90]
 10ad345:	4d 85 ff             	test   r15,r15
 10ad348:	74 6c                	je     10ad3b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2747cc>
 10ad34a:	4c 8d 84 24 d0 00 00 	lea    r8,[rsp+0xd0]
 10ad351:	00 
 10ad352:	49 89 28             	mov    QWORD PTR [r8],rbp
 10ad355:	48 8d 35 35 fd 9e ff 	lea    rsi,[rip+0xffffffffff9efd35]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 10ad35c:	48 8d 0d d3 d3 00 00 	lea    rcx,[rip+0xd3d3]        # 10ba736 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b4c>
 10ad363:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10ad36a:	00 
 10ad36b:	6a 08                	push   0x8
 10ad36d:	41 59                	pop    r9
 10ad36f:	48 89 df             	mov    rdi,rbx
 10ad372:	31 d2                	xor    edx,edx
 10ad374:	e8 1b d4 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 10ad379:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10ad37c:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 10ad383:	00 
 10ad384:	4c 89 fe             	mov    rsi,r15
 10ad387:	48 89 da             	mov    rdx,rbx
 10ad38a:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10ad38d:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]
 10ad394:	00 
 10ad395:	4c 89 ef             	mov    rdi,r13
 10ad398:	48 89 de             	mov    rsi,rbx
 10ad39b:	e8 52 c8 72 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 10ad3a0:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 10ad3a4:	e8 dd 10 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad3a9:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad3b0:	00 
 10ad3b1:	e8 32 d4 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10ad3b6:	4c 8b 7d 18          	mov    r15,QWORD PTR [rbp+0x18]
 10ad3ba:	4d 85 ff             	test   r15,r15
 10ad3bd:	74 6c                	je     10ad42b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274841>
 10ad3bf:	4c 8d 84 24 d0 00 00 	lea    r8,[rsp+0xd0]
 10ad3c6:	00 
 10ad3c7:	49 89 28             	mov    QWORD PTR [r8],rbp
 10ad3ca:	48 8d 35 c0 fc 9e ff 	lea    rsi,[rip+0xffffffffff9efcc0]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 10ad3d1:	48 8d 0d 6e d3 00 00 	lea    rcx,[rip+0xd36e]        # 10ba746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b5c>
 10ad3d8:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10ad3df:	00 
 10ad3e0:	6a 08                	push   0x8
 10ad3e2:	41 59                	pop    r9
 10ad3e4:	48 89 df             	mov    rdi,rbx
 10ad3e7:	31 d2                	xor    edx,edx
 10ad3e9:	e8 a6 d3 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 10ad3ee:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10ad3f1:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 10ad3f8:	00 
 10ad3f9:	4c 89 fe             	mov    rsi,r15
 10ad3fc:	48 89 da             	mov    rdx,rbx
 10ad3ff:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10ad402:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]
 10ad409:	00 
 10ad40a:	4c 89 e7             	mov    rdi,r12
 10ad40d:	48 89 de             	mov    rsi,rbx
 10ad410:	e8 dd c7 72 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 10ad415:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 10ad419:	e8 68 10 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad41e:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad425:	00 
 10ad426:	e8 bd d3 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10ad42b:	4c 8b 7d 38          	mov    r15,QWORD PTR [rbp+0x38]
 10ad42f:	4d 85 ff             	test   r15,r15
 10ad432:	74 6e                	je     10ad4a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2748b8>
 10ad434:	4c 8d 84 24 d0 00 00 	lea    r8,[rsp+0xd0]
 10ad43b:	00 
 10ad43c:	49 89 28             	mov    QWORD PTR [r8],rbp
 10ad43f:	48 8d 35 4b fc 9e ff 	lea    rsi,[rip+0xffffffffff9efc4b]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 10ad446:	48 8d 0d f9 d2 00 00 	lea    rcx,[rip+0xd2f9]        # 10ba746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b5c>
 10ad44d:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10ad454:	00 
 10ad455:	6a 08                	push   0x8
 10ad457:	41 59                	pop    r9
 10ad459:	48 89 df             	mov    rdi,rbx
 10ad45c:	31 d2                	xor    edx,edx
 10ad45e:	e8 31 d3 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 10ad463:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10ad466:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 10ad46d:	00 
 10ad46e:	4c 89 fe             	mov    rsi,r15
 10ad471:	48 89 da             	mov    rdx,rbx
 10ad474:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ad477:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]
 10ad47e:	00 
 10ad47f:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
 10ad484:	48 89 de             	mov    rsi,rbx
 10ad487:	e8 66 c7 72 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 10ad48c:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 10ad490:	e8 f1 0f 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad495:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad49c:	00 
 10ad49d:	e8 46 d3 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10ad4a2:	6a 58                	push   0x58
 10ad4a4:	5f                   	pop    rdi
 10ad4a5:	e8 56 0a 74 00       	call   17edf00 <_Znwm@plt>
 10ad4aa:	49 89 c6             	mov    r14,rax
 10ad4ad:	48 8d 05 34 fb 79 00 	lea    rax,[rip+0x79fb34]        # 184cfe8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x96d0>
 10ad4b4:	49 89 06             	mov    QWORD PTR [r14],rax
 10ad4b7:	49 89 6e 08          	mov    QWORD PTR [r14+0x8],rbp
 10ad4bb:	48 8b 84 24 90 01 00 	mov    rax,QWORD PTR [rsp+0x190]
 10ad4c2:	00 
 10ad4c3:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
 10ad4c6:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
 10ad4cb:	0f 57 c0             	xorps  xmm0,xmm0
 10ad4ce:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 10ad4d1:	48 8b 84 24 c0 01 00 	mov    rax,QWORD PTR [rsp+0x1c0]
 10ad4d8:	00 
 10ad4d9:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
 10ad4dd:	49 83 66 48 00       	and    QWORD PTR [r14+0x48],0x0
 10ad4e2:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0
 10ad4e7:	49 83 66 38 00       	and    QWORD PTR [r14+0x38],0x0
 10ad4ec:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 10ad4f1:	48 8b 30             	mov    rsi,QWORD PTR [rax]
 10ad4f4:	48 8d 15 d5 a0 32 ff 	lea    rdx,[rip+0xffffffffff32a0d5]        # 3d75d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21b5>
 10ad4fb:	4c 8d 05 ee a0 32 ff 	lea    r8,[rip+0xffffffffff32a0ee]        # 3d75f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21d5>
 10ad502:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10ad509:	00 
 10ad50a:	6a 11                	push   0x11
 10ad50c:	59                   	pop    rcx
 10ad50d:	6a 1a                	push   0x1a
 10ad50f:	41 59                	pop    r9
 10ad511:	48 89 df             	mov    rdi,rbx
 10ad514:	e8 af 9f 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ad519:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
 10ad51d:	74 49                	je     10ad568 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27497e>
 10ad51f:	48 8d 35 85 b3 32 ff 	lea    rsi,[rip+0xffffffffff32b385]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ad526:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad52d:	00 
 10ad52e:	e8 1c e3 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ad533:	84 c0                	test   al,al
 10ad535:	74 31                	je     10ad568 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27497e>
 10ad537:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad53e:	00 
 10ad53f:	e8 ec 97 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ad544:	6a 18                	push   0x18
 10ad546:	5f                   	pop    rdi
 10ad547:	e8 b4 09 74 00       	call   17edf00 <_Znwm@plt>
 10ad54c:	48 8d 0d cd fc 79 00 	lea    rcx,[rip+0x79fccd]        # 184d220 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9908>
 10ad553:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ad556:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
 10ad55a:	48 89 c1             	mov    rcx,rax
 10ad55d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 10ad562:	48 89 68 10          	mov    QWORD PTR [rax+0x10],rbp
 10ad566:	eb 14                	jmp    10ad57c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274992>
 10ad568:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad56f:	00 
 10ad570:	e8 bb 97 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ad575:	31 c0                	xor    eax,eax
 10ad577:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 10ad57c:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ad583:	00 
 10ad584:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 10ad589:	48 89 02             	mov    QWORD PTR [rdx],rax
 10ad58c:	48 8d 05 d1 ee 9c ff 	lea    rax,[rip+0xffffffffff9ceed1]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ad593:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
 10ad597:	48 8d 05 e2 b6 c1 ff 	lea    rax,[rip+0xffffffffffc1b6e2]        # cc8c80 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x215c20>
 10ad59e:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax
 10ad5a2:	4c 8b bc 24 80 00 00 	mov    r15,QWORD PTR [rsp+0x80]
 10ad5a9:	00 
 10ad5aa:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10ad5ad:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 10ad5b4:	00 
 10ad5b5:	4c 89 fe             	mov    rsi,r15
 10ad5b8:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ad5bb:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]
 10ad5c2:	00 
 10ad5c3:	0f 28 03             	movaps xmm0,XMMWORD PTR [rbx]
 10ad5c6:	0f 57 c9             	xorps  xmm1,xmm1
 10ad5c9:	0f 29 0b             	movaps XMMWORD PTR [rbx],xmm1
 10ad5cc:	4c 8b a4 24 a0 00 00 	mov    r12,QWORD PTR [rsp+0xa0]
 10ad5d3:	00 
 10ad5d4:	49 8b 7c 24 28       	mov    rdi,QWORD PTR [r12+0x28]
 10ad5d9:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
 10ad5df:	e8 a2 0e 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad5e4:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 10ad5e8:	e8 99 0e 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad5ed:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]
 10ad5f4:	00 
 10ad5f5:	4c 89 ef             	mov    rdi,r13
 10ad5f8:	e8 fd 06 00 00       	call   10adcfa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275110>
 10ad5fd:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15
 10ad601:	48 8d 05 5c ee 9c ff 	lea    rax,[rip+0xffffffffff9cee5c]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ad608:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
 10ad60c:	48 8d 05 0d 07 00 00 	lea    rax,[rip+0x70d]        # 10add20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275136>
 10ad613:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
 10ad617:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
 10ad61c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ad61f:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ad626:	00 
 10ad627:	48 89 df             	mov    rdi,rbx
 10ad62a:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10ad62d:	0f 28 84 24 f0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xf0]
 10ad634:	00 
 10ad635:	0f 57 c9             	xorps  xmm1,xmm1
 10ad638:	0f 29 8c 24 f0 00 00 	movaps XMMWORD PTR [rsp+0xf0],xmm1
 10ad63f:	00 
 10ad640:	49 8b 7c 24 38       	mov    rdi,QWORD PTR [r12+0x38]
 10ad645:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0
 10ad64b:	e8 36 0e 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad650:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
 10ad657:	00 
 10ad658:	e8 29 0e 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad65d:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad664:	00 
 10ad665:	e8 c0 06 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ad66a:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
 10ad66e:	48 89 ef             	mov    rdi,rbp
 10ad671:	48 8b 5c 24 28       	mov    rbx,QWORD PTR [rsp+0x28]
 10ad676:	ff 90 58 01 00 00    	call   QWORD PTR [rax+0x158]
 10ad67c:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 10ad67f:	48 89 df             	mov    rdi,rbx
 10ad682:	ff 50 40             	call   QWORD PTR [rax+0x40]
 10ad685:	6a 48                	push   0x48
 10ad687:	5f                   	pop    rdi
 10ad688:	e8 73 08 74 00       	call   17edf00 <_Znwm@plt>
 10ad68d:	48 8d 0d f4 03 7a 00 	lea    rcx,[rip+0x7a03f4]        # 184da88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa170>
 10ad694:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ad697:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
 10ad69b:	48 8b 4c 24 70       	mov    rcx,QWORD PTR [rsp+0x70]
 10ad6a0:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
 10ad6a4:	48 89 68 18          	mov    QWORD PTR [rax+0x18],rbp
 10ad6a8:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
 10ad6ad:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
 10ad6b1:	48 89 58 28          	mov    QWORD PTR [rax+0x28],rbx
 10ad6b5:	48 8b 8c 24 80 00 00 	mov    rcx,QWORD PTR [rsp+0x80]
 10ad6bc:	00 
 10ad6bd:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx
 10ad6c1:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
 10ad6c6:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
 10ad6ca:	c6 40 40 01          	mov    BYTE PTR [rax+0x40],0x1
 10ad6ce:	48 8b 8c 24 98 00 00 	mov    rcx,QWORD PTR [rsp+0x98]
 10ad6d5:	00 
 10ad6d6:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
 10ad6d9:	48 89 01             	mov    QWORD PTR [rcx],rax
 10ad6dc:	48 85 ff             	test   rdi,rdi
 10ad6df:	74 06                	je     10ad6e7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274afd>
 10ad6e1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ad6e4:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10ad6e7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ad6ee:	00 00 
 10ad6f0:	48 3b 84 24 50 01 00 	cmp    rax,QWORD PTR [rsp+0x150]
 10ad6f7:	00 
 10ad6f8:	0f 85 12 05 00 00    	jne    10adc10 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275026>
 10ad6fe:	48 81 c4 58 01 00 00 	add    rsp,0x158
 10ad705:	5b                   	pop    rbx
 10ad706:	41 5c                	pop    r12
 10ad708:	41 5d                	pop    r13
 10ad70a:	41 5e                	pop    r14
 10ad70c:	41 5f                	pop    r15
 10ad70e:	5d                   	pop    rbp
 10ad70f:	c3                   	ret
 10ad710:	48 89 c3             	mov    rbx,rax
 10ad713:	e9 16 04 00 00       	jmp    10adb2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f44>
 10ad718:	e9 23 01 00 00       	jmp    10ad840 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c56>
 10ad71d:	e9 06 01 00 00       	jmp    10ad828 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c3e>
 10ad722:	e9 19 01 00 00       	jmp    10ad840 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c56>
 10ad727:	48 89 c3             	mov    rbx,rax
 10ad72a:	e9 da 03 00 00       	jmp    10adb09 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f1f>
 10ad72f:	e9 03 02 00 00       	jmp    10ad937 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274d4d>
 10ad734:	48 89 c3             	mov    rbx,rax
 10ad737:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 10ad73e:	00 
 10ad73f:	e8 4c 07 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ad744:	eb 21                	jmp    10ad767 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274b7d>
 10ad746:	48 89 c3             	mov    rbx,rax
 10ad749:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad750:	00 
 10ad751:	e8 d4 05 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ad756:	4d 89 fe             	mov    r14,r15
 10ad759:	49 8b 7f 28          	mov    rdi,QWORD PTR [r15+0x28]
 10ad75d:	e8 24 0d 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad762:	eb 1b                	jmp    10ad77f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274b95>
 10ad764:	48 89 c3             	mov    rbx,rax
 10ad767:	e9 fb 00 00 00       	jmp    10ad867 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c7d>
 10ad76c:	4d 89 fe             	mov    r14,r15
 10ad76f:	48 89 c3             	mov    rbx,rax
 10ad772:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad779:	00 
 10ad77a:	e8 ab 05 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ad77f:	4c 89 f7             	mov    rdi,r14
 10ad782:	e8 99 07 74 00       	call   17edf20 <_ZdlPv@plt>
 10ad787:	e9 c3 03 00 00       	jmp    10adb4f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f65>
 10ad78c:	e9 a6 01 00 00       	jmp    10ad937 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274d4d>
 10ad791:	48 89 c3             	mov    rbx,rax
 10ad794:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad79b:	00 
 10ad79c:	e8 89 05 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ad7a1:	4d 89 fe             	mov    r14,r15
 10ad7a4:	49 8b 7f 40          	mov    rdi,QWORD PTR [r15+0x40]
 10ad7a8:	e8 d9 0c 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad7ad:	eb 13                	jmp    10ad7c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274bd8>
 10ad7af:	4d 89 fe             	mov    r14,r15
 10ad7b2:	48 89 c3             	mov    rbx,rax
 10ad7b5:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad7bc:	00 
 10ad7bd:	e8 68 05 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ad7c2:	4c 89 f7             	mov    rdi,r14
 10ad7c5:	e8 56 07 74 00       	call   17edf20 <_ZdlPv@plt>
 10ad7ca:	e9 8b 03 00 00       	jmp    10adb5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f70>
 10ad7cf:	eb 00                	jmp    10ad7d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274be7>
 10ad7d1:	48 89 c3             	mov    rbx,rax
 10ad7d4:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
 10ad7d8:	e8 a9 0c 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad7dd:	4c 89 ff             	mov    rdi,r15
 10ad7e0:	e8 17 1e 9f ff       	call   a9f5fc <JNI_OnUnload@@Base+0x26ec9>
 10ad7e5:	eb 2d                	jmp    10ad814 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c2a>
 10ad7e7:	e9 1a 03 00 00       	jmp    10adb06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f1c>
 10ad7ec:	48 89 c3             	mov    rbx,rax
 10ad7ef:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad7f6:	00 
 10ad7f7:	e8 ec cf 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10ad7fc:	4c 89 ef             	mov    rdi,r13
 10ad7ff:	e8 42 3f 71 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
 10ad804:	48 89 ef             	mov    rdi,rbp
 10ad807:	e8 5a c6 72 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 10ad80c:	4c 89 e7             	mov    rdi,r12
 10ad80f:	e8 1c 0c 00 00       	call   10ae430 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275846>
 10ad814:	4c 89 f7             	mov    rdi,r14
 10ad817:	e8 04 07 74 00       	call   17edf20 <_ZdlPv@plt>
 10ad81c:	e9 e8 02 00 00       	jmp    10adb09 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f1f>
 10ad821:	e9 e0 02 00 00       	jmp    10adb06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f1c>
 10ad826:	eb 18                	jmp    10ad840 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c56>
 10ad828:	48 89 c3             	mov    rbx,rax
 10ad82b:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad832:	00 
 10ad833:	e8 66 9a 9f ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
 10ad838:	48 89 df             	mov    rdi,rbx
 10ad83b:	e8 65 c2 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10ad840:	48 89 c7             	mov    rdi,rax
 10ad843:	e8 5d c2 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10ad848:	e9 b9 02 00 00       	jmp    10adb06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f1c>
 10ad84d:	e9 e5 00 00 00       	jmp    10ad937 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274d4d>
 10ad852:	48 89 c3             	mov    rbx,rax
 10ad855:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 10ad85c:	00 
 10ad85d:	e8 2e 06 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ad862:	eb 03                	jmp    10ad867 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c7d>
 10ad864:	48 89 c3             	mov    rbx,rax
 10ad867:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
 10ad86e:	00 
 10ad86f:	e8 1c 06 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ad874:	e9 cb 02 00 00       	jmp    10adb44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f5a>
 10ad879:	e9 b9 00 00 00       	jmp    10ad937 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274d4d>
 10ad87e:	eb 02                	jmp    10ad882 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c98>
 10ad880:	eb 00                	jmp    10ad882 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c98>
 10ad882:	48 89 c3             	mov    rbx,rax
 10ad885:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad88c:	00 
 10ad88d:	e8 56 cf 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10ad892:	49 89 ef             	mov    r15,rbp
 10ad895:	49 81 c7 a0 00 00 00 	add    r15,0xa0
 10ad89c:	4c 89 ef             	mov    rdi,r13
 10ad89f:	e8 30 c3 72 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10ad8a4:	4c 89 f7             	mov    rdi,r14
 10ad8a7:	e8 28 c3 72 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10ad8ac:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10ad8b1:	e8 b0 c5 72 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 10ad8b6:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
 10ad8bb:	e8 a6 c5 72 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 10ad8c0:	4c 89 ff             	mov    rdi,r15
 10ad8c3:	e8 8e ce 00 00       	call   10ba756 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b6c>
 10ad8c8:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
 10ad8cd:	e8 02 c3 72 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10ad8d2:	4c 89 e7             	mov    rdi,r12
 10ad8d5:	e8 fa c2 72 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10ad8da:	48 89 ef             	mov    rdi,rbp
 10ad8dd:	e8 3e 06 74 00       	call   17edf20 <_ZdlPv@plt>
 10ad8e2:	e9 5d 02 00 00       	jmp    10adb44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f5a>
 10ad8e7:	eb 00                	jmp    10ad8e9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274cff>
 10ad8e9:	48 89 c3             	mov    rbx,rax
 10ad8ec:	e9 5e 02 00 00       	jmp    10adb4f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f65>
 10ad8f1:	eb 00                	jmp    10ad8f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274d09>
 10ad8f3:	48 89 c3             	mov    rbx,rax
 10ad8f6:	e9 5f 02 00 00       	jmp    10adb5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f70>
 10ad8fb:	e9 18 02 00 00       	jmp    10adb18 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f2e>
 10ad900:	48 89 c3             	mov    rbx,rax
 10ad903:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad90a:	00 
 10ad90b:	e8 1a 04 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ad910:	e9 06 02 00 00       	jmp    10adb1b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f31>
 10ad915:	48 89 c3             	mov    rbx,rax
 10ad918:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad91f:	00 
 10ad920:	e8 d5 03 00 00       	call   10adcfa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275110>
 10ad925:	e9 f1 01 00 00       	jmp    10adb1b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f31>
 10ad92a:	48 89 c3             	mov    rbx,rax
 10ad92d:	e9 05 02 00 00       	jmp    10adb37 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f4d>
 10ad932:	e9 cf 01 00 00       	jmp    10adb06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f1c>
 10ad937:	48 89 c3             	mov    rbx,rax
 10ad93a:	e9 05 02 00 00       	jmp    10adb44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f5a>
 10ad93f:	48 89 c3             	mov    rbx,rax
 10ad942:	e9 1e 02 00 00       	jmp    10adb65 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f7b>
 10ad947:	e9 29 02 00 00       	jmp    10adb75 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8b>
 10ad94c:	48 89 c3             	mov    rbx,rax
 10ad94f:	4c 89 e7             	mov    rdi,r12
 10ad952:	e8 c9 05 74 00       	call   17edf20 <_ZdlPv@plt>
 10ad957:	eb 03                	jmp    10ad95c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274d72>
 10ad959:	48 89 c3             	mov    rbx,rax
 10ad95c:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad963:	00 
 10ad964:	e8 e9 42 d3 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 10ad969:	4c 89 f7             	mov    rdi,r14
 10ad96c:	e8 af 05 74 00       	call   17edf20 <_ZdlPv@plt>
 10ad971:	e9 02 02 00 00       	jmp    10adb78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8e>
 10ad976:	e9 fa 01 00 00       	jmp    10adb75 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8b>
 10ad97b:	48 89 c3             	mov    rbx,rax
 10ad97e:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
 10ad982:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10ad989:	e8 02 05 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ad98e:	49 83 c6 e8          	add    r14,0xffffffffffffffe8
 10ad992:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8
 10ad996:	75 e6                	jne    10ad97e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274d94>
 10ad998:	e9 db 01 00 00       	jmp    10adb78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8e>
 10ad99d:	e9 4a 01 00 00       	jmp    10adaec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f02>
 10ad9a2:	48 89 c3             	mov    rbx,rax
 10ad9a5:	6a 18                	push   0x18
 10ad9a7:	41 5e                	pop    r14
 10ad9a9:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
 10ad9ad:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10ad9b4:	e8 d7 04 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ad9b9:	49 83 c6 e8          	add    r14,0xffffffffffffffe8
 10ad9bd:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8
 10ad9c1:	75 e6                	jne    10ad9a9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274dbf>
 10ad9c3:	e9 b0 01 00 00       	jmp    10adb78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8e>
 10ad9c8:	e9 1f 01 00 00       	jmp    10adaec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f02>
 10ad9cd:	48 89 c3             	mov    rbx,rax
 10ad9d0:	6a 18                	push   0x18
 10ad9d2:	41 5e                	pop    r14
 10ad9d4:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
 10ad9d8:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10ad9df:	e8 ac 04 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ad9e4:	49 83 c6 e8          	add    r14,0xffffffffffffffe8
 10ad9e8:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8
 10ad9ec:	75 e6                	jne    10ad9d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274dea>
 10ad9ee:	e9 85 01 00 00       	jmp    10adb78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8e>
 10ad9f3:	e9 f4 00 00 00       	jmp    10adaec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f02>
 10ad9f8:	48 89 c3             	mov    rbx,rax
 10ad9fb:	6a 18                	push   0x18
 10ad9fd:	41 5e                	pop    r14
 10ad9ff:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
 10ada03:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10ada0a:	e8 81 04 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ada0f:	49 83 c6 e8          	add    r14,0xffffffffffffffe8
 10ada13:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8
 10ada17:	75 e6                	jne    10ad9ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274e15>
 10ada19:	e9 5a 01 00 00       	jmp    10adb78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8e>
 10ada1e:	e9 c9 00 00 00       	jmp    10adaec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f02>
 10ada23:	48 89 c3             	mov    rbx,rax
 10ada26:	6a 18                	push   0x18
 10ada28:	41 5e                	pop    r14
 10ada2a:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
 10ada2e:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10ada35:	e8 56 04 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ada3a:	49 83 c6 e8          	add    r14,0xffffffffffffffe8
 10ada3e:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8
 10ada42:	75 e6                	jne    10ada2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274e40>
 10ada44:	e9 2f 01 00 00       	jmp    10adb78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8e>
 10ada49:	e9 9e 00 00 00       	jmp    10adaec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f02>
 10ada4e:	48 89 c3             	mov    rbx,rax
 10ada51:	6a 18                	push   0x18
 10ada53:	41 5e                	pop    r14
 10ada55:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
 10ada59:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10ada60:	e8 2b 04 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ada65:	49 83 c6 e8          	add    r14,0xffffffffffffffe8
 10ada69:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8
 10ada6d:	75 e6                	jne    10ada55 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274e6b>
 10ada6f:	e9 04 01 00 00       	jmp    10adb78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8e>
 10ada74:	eb 76                	jmp    10adaec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f02>
 10ada76:	48 89 c3             	mov    rbx,rax
 10ada79:	6a 18                	push   0x18
 10ada7b:	41 5e                	pop    r14
 10ada7d:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
 10ada81:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10ada88:	e8 03 04 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ada8d:	49 83 c6 e8          	add    r14,0xffffffffffffffe8
 10ada91:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8
 10ada95:	75 e6                	jne    10ada7d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274e93>
 10ada97:	e9 dc 00 00 00       	jmp    10adb78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8e>
 10ada9c:	eb 4e                	jmp    10adaec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f02>
 10ada9e:	48 89 c3             	mov    rbx,rax
 10adaa1:	6a 18                	push   0x18
 10adaa3:	41 5e                	pop    r14
 10adaa5:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
 10adaa9:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10adab0:	e8 db 03 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10adab5:	49 83 c6 e8          	add    r14,0xffffffffffffffe8
 10adab9:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8
 10adabd:	75 e6                	jne    10adaa5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274ebb>
 10adabf:	e9 b4 00 00 00       	jmp    10adb78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8e>
 10adac4:	eb 26                	jmp    10adaec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f02>
 10adac6:	48 89 c3             	mov    rbx,rax
 10adac9:	6a 18                	push   0x18
 10adacb:	41 5e                	pop    r14
 10adacd:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
 10adad1:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10adad8:	e8 b3 03 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10adadd:	49 83 c6 e8          	add    r14,0xffffffffffffffe8
 10adae1:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8
 10adae5:	75 e6                	jne    10adacd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274ee3>
 10adae7:	e9 8c 00 00 00       	jmp    10adb78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8e>
 10adaec:	48 89 c3             	mov    rbx,rax
 10adaef:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10adaf6:	00 
 10adaf7:	e8 94 03 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10adafc:	eb 7a                	jmp    10adb78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8e>
 10adafe:	48 89 c3             	mov    rbx,rax
 10adb01:	e9 b4 00 00 00       	jmp    10adbba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274fd0>
 10adb06:	48 89 c3             	mov    rbx,rax
 10adb09:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
 10adb10:	00 
 10adb11:	e8 10 30 9f ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 10adb16:	eb 2c                	jmp    10adb44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f5a>
 10adb18:	48 89 c3             	mov    rbx,rax
 10adb1b:	48 83 7c 24 08 00    	cmp    QWORD PTR [rsp+0x8],0x0
 10adb21:	74 0b                	je     10adb2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f44>
 10adb23:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 10adb28:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10adb2b:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10adb2e:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10adb31:	4c 89 f7             	mov    rdi,r14
 10adb34:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10adb37:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
 10adb3b:	48 89 ef             	mov    rdi,rbp
 10adb3e:	ff 90 d8 01 00 00    	call   QWORD PTR [rax+0x1d8]
 10adb44:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
 10adb49:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10adb4c:	ff 50 40             	call   QWORD PTR [rax+0x40]
 10adb4f:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
 10adb54:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10adb57:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10adb5a:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
 10adb5f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10adb62:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10adb65:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
 10adb6c:	00 
 10adb6d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10adb70:	ff 50 48             	call   QWORD PTR [rax+0x48]
 10adb73:	eb 03                	jmp    10adb78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8e>
 10adb75:	48 89 c3             	mov    rbx,rax
 10adb78:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
 10adb7f:	00 
 10adb80:	e8 6d 01 00 00       	call   10adcf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275108>
 10adb85:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
 10adb8c:	00 
 10adb8d:	e8 38 01 00 00       	call   10adcca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750e0>
 10adb92:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
 10adb97:	e8 06 01 00 00       	call   10adca2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750b8>
 10adb9c:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
 10adba1:	e8 82 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10adba6:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
 10adbab:	e8 78 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10adbb0:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
 10adbb5:	e8 c2 15 ac ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
 10adbba:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
 10adbbf:	e8 64 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10adbc4:	4c 8b b4 24 a0 00 00 	mov    r14,QWORD PTR [rsp+0xa0]
 10adbcb:	00 
 10adbcc:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]
 10adbd0:	e8 b1 08 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10adbd5:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
 10adbd9:	e8 a8 08 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10adbde:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
 10adbe3:	e8 40 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10adbe8:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
 10adbef:	00 
 10adbf0:	e8 33 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10adbf5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10adbfc:	00 00 
 10adbfe:	48 3b 84 24 50 01 00 	cmp    rax,QWORD PTR [rsp+0x150]
 10adc05:	00 
 10adc06:	75 08                	jne    10adc10 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275026>
 10adc08:	48 89 df             	mov    rdi,rbx
 10adc0b:	e8 c0 20 9c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10adc10:	e8 9b 1e 74 00       	call   17efab0 <__stack_chk_fail@plt>

## Restrictions constructor AP materializations
AP 0x184ca90
  +0x0: 0x10ae156
  +0x8: 0x10ae1cc
  +0x10: 0x9d7de0
  +0x18: 0x9d7de0
  +0x20: 0x10ae1de
  +0x28: 0xa7a004
  +0x30: 0x10ae21c
  +0x38: 0x10ae226
  +0x40: 0x10ae230
  +0x48: 0x10ae244
  +0x50: 0xc36798
  +0x58: 0xd50b8e
  +0x60: 0x10ae254
  +0x68: 0xaa7018
  +0x70: NO_RELOC
  +0x78: NO_RELOC
  +0x80: 0x10ae554
  +0x88: 0x10ae586
AP 0x184d898
  +0x0: 0x10bff2c
  +0x8: 0x10bff40
  +0x10: 0x10bff52
  +0x18: 0x10bffde
  +0x20: NO_RELOC
  +0x28: NO_RELOC
  +0x30: 0xabfe12
  +0x38: 0xabfe54
  +0x40: 0x174ec6a
  +0x48: 0x174f1dc
  +0x50: 0x10c01f4
  +0x58: 0x174ef82
  +0x60: NO_RELOC
  +0x68: NO_RELOC
  +0x70: 0x10c0192
  +0x78: 0x10c01c8
  +0x80: 0x174ec6a
  +0x88: 0x174f1dc
AP 0x187e260
  +0x0: 0x153c766
  +0x8: 0x153c898
  +0x10: 0x153c900
  +0x18: 0x153c918
  +0x20: 0x153c930
  +0x28: 0x153c950
  +0x30: 0x153c9e6
  +0x38: 0xe750be
  +0x40: 0x153c9ec
  +0x48: 0x153ca10
  +0x50: NO_RELOC
  +0x58: NO_RELOC
  +0x60: 0x153ca22
  +0x68: 0x153ca32
  +0x70: 0x153ca44
  +0x78: 0x0
  +0x80: 0xa50370
  +0x88: NO_RELOC
AP 0x184d808
  +0x0: 0x10ae330
  +0x8: 0x10be954
  +0x10: 0x10be966
  +0x18: 0x10bea08
  +0x20: 0x10beaaa
  +0x28: 0x10beaf0
  +0x30: 0x10bec3e
  +0x38: 0x10bf214
  +0x40: 0x10bf45e
  +0x48: NO_RELOC
  +0x50: NO_RELOC
  +0x58: 0x10bff00
  +0x60: 0x10bff10
  +0x68: 0x10bff22
  +0x70: 0x0
  +0x78: 0xa50370
  +0x80: NO_RELOC
  +0x88: NO_RELOC
AP 0x180e8e0
  +0x0: 0x9d7de0
  +0x8: 0xa50370
  +0x10: 0xaad182
  +0x18: 0xaad1a2
  +0x20: 0x9d7de0
  +0x28: 0xa50370
  +0x30: 0xaad1b6
  +0x38: NO_RELOC
  +0x40: NO_RELOC
  +0x48: 0xbbc87c
  +0x50: 0xbbc8f6
  +0x58: 0xb9309e
  +0x60: 0xbbc200
  +0x68: 0xbbc78c
  +0x70: NO_RELOC
  +0x78: NO_RELOC
  +0x80: NO_RELOC
  +0x88: NO_RELOC
AP 0x18b1aa0
  +0x0: 0x0
  +0x8: 0x0
  +0x10: 0x0
  +0x18: 0x0
  +0x20: 0x0
  +0x28: 0x0
  +0x30: 0x0
  +0x38: 0x0
  +0x40: 0x0
  +0x48: 0x0
  +0x50: 0x0
  +0x58: 0x0
  +0x60: 0x0
  +0x68: 0x0
  +0x70: 0x0
  +0x78: 0x0
  +0x80: 0x0
  +0x88: 0x0
AP 0x18b1aa8
  +0x0: 0x0
  +0x8: 0x0
  +0x10: 0x0
  +0x18: 0x0
  +0x20: 0x0
  +0x28: 0x0
  +0x30: 0x0
  +0x38: 0x0
  +0x40: 0x0
  +0x48: 0x0
  +0x50: 0x0
  +0x58: 0x0
  +0x60: 0x0
  +0x68: 0x0
  +0x70: 0x0
  +0x78: 0x0
  +0x80: 0x0
  +0x88: 0x0
AP 0x184d0a0
  +0x0: 0x10b3584
  +0x8: 0xa3fa60
  +0x10: 0x10b3654
  +0x18: 0x10b367e
  +0x20: NO_RELOC
  +0x28: NO_RELOC
  +0x30: 0x9d7de0
  +0x38: 0xa50370
  +0x40: 0x10b3540
  +0x48: 0x10b3560
  +0x50: 0x9d7de0
  +0x58: 0xa50370
  +0x60: 0x10b3574
  +0x68: NO_RELOC
  +0x70: NO_RELOC
  +0x78: 0x10b37d2
  +0x80: 0x10b3856
  +0x88: 0x10b3868
AP 0x184d1f0
  +0x0: 0x10b7c0e
  +0x8: 0x9d81d0
  +0x10: 0x9d7de0
  +0x18: 0xa50370
  +0x20: NO_RELOC
  +0x28: NO_RELOC
  +0x30: 0x9d7de0
  +0x38: 0xa50370
  +0x40: 0x10b7c50
  +0x48: 0x10b7d60
  +0x50: NO_RELOC
  +0x58: NO_RELOC
  +0x60: 0x10ab772
  +0x68: 0x10b80f2
  +0x70: 0x10b9db6
  +0x78: 0xaa8e00
  +0x80: 0x1066dbe
  +0x88: 0x10b8104
AP 0x184d9a8
  +0x0: 0x10c0806
  +0x8: 0x10c0854
  +0x10: 0x10c086a
  +0x18: 0x1066da0
  +0x20: 0x10c0872
  +0x28: 0x10c0902
  +0x30: 0x10c094a
  +0x38: 0x10c0962
  +0x40: 0x10c09ae
  +0x48: NO_RELOC
  +0x50: NO_RELOC
  +0x58: 0x9d7de0
  +0x60: 0xa50370
  +0x68: 0xaeb7c0
  +0x70: 0x10c0712
  +0x78: NO_RELOC
  +0x80: NO_RELOC
  +0x88: 0x9d81d0
AP 0x184da30
  +0x0: 0x9d81d0
  +0x8: 0xc3aab8
  +0x10: 0x10c09c0
  +0x18: 0x9d81d0
  +0x20: 0x9d7de0
  +0x28: 0x9d7de0
  +0x30: 0xbd7a10
  +0x38: 0x9d7de0
  +0x40: 0xa50370
  +0x48: NO_RELOC
  +0x50: NO_RELOC
  +0x58: 0x10c09c6
  +0x60: 0x10c0a66
  +0x68: 0xe750be
  +0x70: 0xa55cb0
  +0x78: 0xa7a004
  +0x80: 0xaa7024
  +0x88: 0xbf7896
AP 0x184cd90
  +0x0: 0x10b120c
  +0x8: 0x10b126c
  +0x10: 0x10b0680
  +0x18: 0x10b0690
  +0x20: 0x10b127e
  +0x28: 0x10b06fc
  +0x30: 0x10b133c
  +0x38: NO_RELOC
  +0x40: NO_RELOC
  +0x48: 0xaaac5c
  +0x50: 0xaaac84
  +0x58: 0x174ec6a
  +0x60: 0x174f1dc
  +0x68: 0x10b170e
  +0x70: 0x174ef82
  +0x78: NO_RELOC
  +0x80: NO_RELOC
  +0x88: 0x10b167c
AP 0x184cd48
  +0x0: 0x10b060e
  +0x8: 0x10b066e
  +0x10: 0x10b0680
  +0x18: 0xbf7896
  +0x20: 0xb04950
  +0x28: 0x10b0690
  +0x30: 0x10b06fc
  +0x38: NO_RELOC
  +0x40: NO_RELOC
  +0x48: 0x10b120c
  +0x50: 0x10b126c
  +0x58: 0x10b0680
  +0x60: 0x10b0690
  +0x68: 0x10b127e
  +0x70: 0x10b06fc
  +0x78: 0x10b133c
  +0x80: NO_RELOC
  +0x88: NO_RELOC
AP 0x184cbf8
  +0x0: 0x10afa1c
  +0x8: 0x10afaa4
  +0x10: 0x10afab6
  +0x18: 0x10afb64
  +0x20: 0x10afb7a
  +0x28: 0x10afbb8
  +0x30: 0x10afc10
  +0x38: 0x10afc3a
  +0x40: 0x10afc98
  +0x48: 0x10afe0a
  +0x50: 0x10afec2
  +0x58: 0x10b0062
  +0x60: 0x10b01f0
  +0x68: 0x10b01f6
  +0x70: 0x10b0218
  +0x78: NO_RELOC
  +0x80: NO_RELOC
  +0x88: 0x10b024a
AP 0x184cc80
  +0x0: 0x10b024a
  +0x8: 0x10b0254
  +0x10: 0x10b025e
  +0x18: NO_RELOC
  +0x20: NO_RELOC
  +0x28: 0x10b0268
  +0x30: 0x10b0272
  +0x38: 0x9d7de0
  +0x40: 0x9d7de0
  +0x48: 0x9d7de0
  +0x50: 0x9d7de0
  +0x58: 0x10b027c
  +0x60: 0x9d7de0
  +0x68: 0x10b0286
  +0x70: 0x9d7de0
  +0x78: 0x9d7de0
  +0x80: 0x10b0290
  +0x88: 0x10b029a
AP 0x184cca8
  +0x0: 0x10b0268
  +0x8: 0x10b0272
  +0x10: 0x9d7de0
  +0x18: 0x9d7de0
  +0x20: 0x9d7de0
  +0x28: 0x9d7de0
  +0x30: 0x10b027c
  +0x38: 0x9d7de0
  +0x40: 0x10b0286
  +0x48: 0x9d7de0
  +0x50: 0x9d7de0
  +0x58: 0x10b0290
  +0x60: 0x10b029a
  +0x68: 0x9d7de0
  +0x70: 0x10b02a4
  +0x78: 0x10b02ae
  +0x80: 0x9d7de0
  +0x88: 0x10b02b8
AP 0x184cf10
  +0x0: 0x10b17d4
  +0x8: 0x10b17de
  +0x10: 0x9d7de0
  +0x18: 0x9d7de0
  +0x20: 0x9d7de0
  +0x28: 0x9d7de0
  +0x30: 0x10b17f4
  +0x38: 0x9d7de0
  +0x40: 0x10b1f1c
  +0x48: 0x9d7de0
  +0x50: 0x10b1f76
  +0x58: 0x9d7de0
  +0x60: 0x10b1fca
  +0x68: 0x9d7de0
  +0x70: 0x9d7de0
  +0x78: 0x9d7de0
  +0x80: 0x9d7de0
  +0x88: 0x10b212a
AP 0x184cfc0
  +0x0: 0x10b2292
  +0x8: 0x10b229c
  +0x10: 0x10b22a6
  +0x18: NO_RELOC
  +0x20: NO_RELOC
  +0x28: 0x10b24a8
  +0x30: 0x10b297c
  +0x38: 0x10b29ac
  +0x40: NO_RELOC
  +0x48: NO_RELOC
  +0x50: 0x9d7de0
  +0x58: 0xa50370
  +0x60: 0x10b2b32
  +0x68: 0x10b2b52
  +0x70: 0x9d7de0
  +0x78: 0xa50370
  +0x80: 0x10b2b66
  +0x88: NO_RELOC
AP 0x184cb10
  +0x0: 0x10ae554
  +0x8: 0x10ae586
  +0x10: 0x9d7de0
  +0x18: 0x9d7de0
  +0x20: 0x9d7de0
  +0x28: 0x9d7de0
  +0x30: 0x10ae598
  +0x38: 0x9d7de0
  +0x40: 0x10aeb7c
  +0x48: 0x9d7de0
  +0x50: 0x10aebd6
  +0x58: 0x9d7de0
  +0x60: 0x10aec2a
  +0x68: 0x9d7de0
  +0x70: 0x9d7de0
  +0x78: 0x9d7de0
  +0x80: 0x9d7de0
  +0x88: 0x10aed94
AP 0x184cbc8
  +0x0: 0x10aef84
  +0x8: 0x10aef8e
  +0x10: 0x10aefa0
  +0x18: 0x10aefaa
  +0x20: NO_RELOC
  +0x28: NO_RELOC
  +0x30: 0x10afa1c
  +0x38: 0x10afaa4
  +0x40: 0x10afab6
  +0x48: 0x10afb64
  +0x50: 0x10afb7a
  +0x58: 0x10afbb8
  +0x60: 0x10afc10
  +0x68: 0x10afc3a
  +0x70: 0x10afc98
  +0x78: 0x10afe0a
  +0x80: 0x10afec2
  +0x88: 0x10b0062
AP 0x184dae8
  +0x0: 0x10c0a78
  +0x8: 0x10c0a92
  +0x10: 0x10c0aa4
  +0x18: 0x10c0b66
  +0x20: 0x10c0bae
  +0x28: 0x10c0bf2
  +0x30: 0x10c0c3a
  +0x38: 0x10c0c7a
  +0x40: 0x10c0cba
  +0x48: NO_RELOC
  +0x50: NO_RELOC
  +0x58: 0x10c0ce6
  +0x60: 0x10c0cf0
  +0x68: 0x9d7de0
  +0x70: 0x9d7de0
  +0x78: 0x9d7de0
  +0x80: 0x9d7de0
  +0x88: 0x10c0cfa
AP 0x184db40
  +0x0: 0x10c0ce6
  +0x8: 0x10c0cf0
  +0x10: 0x9d7de0
  +0x18: 0x9d7de0
  +0x20: 0x9d7de0
  +0x28: 0x9d7de0
  +0x30: 0x10c0cfa
  +0x38: 0x9d7de0
  +0x40: 0x10c0d04
  +0x48: 0x9d7de0
  +0x50: 0x10c0d0e
  +0x58: 0x10c0d18
  +0x60: 0x10c0d22
  +0x68: 0x9d7de0
  +0x70: 0x9d7de0
  +0x78: 0x9d7de0
  +0x80: 0x9d7de0
  +0x88: 0x10c0d2c
AP 0x184d5d0
  +0x0: 0xa3fa60
  +0x8: 0x10ba7ca
  +0x10: 0x10ba802
  +0x18: 0x10ba86e
  +0x20: 0x10ba802
  +0x28: 0x10ba8a6
  +0x30: 0x10ba8de
  +0x38: 0x10ba93e
  +0x40: 0x10ba976
  +0x48: 0x10ba98e
  +0x50: 0x10ba9c6
  +0x58: 0x10baa26
  +0x60: 0x10baa5e
  +0x68: 0x10baab4
  +0x70: 0x10baaec
  +0x78: 0x10bab3c
  +0x80: 0x10ba976
  +0x88: 0x10bab76
AP 0x184cfe8
  +0x0: 0x10b24a8
  +0x8: 0x10b297c
  +0x10: 0x10b29ac
  +0x18: NO_RELOC
  +0x20: NO_RELOC
  +0x28: 0x9d7de0
  +0x30: 0xa50370
  +0x38: 0x10b2b32
  +0x40: 0x10b2b52
  +0x48: 0x9d7de0
  +0x50: 0xa50370
  +0x58: 0x10b2b66
  +0x60: NO_RELOC
  +0x68: NO_RELOC
  +0x70: 0x9d7de0
  +0x78: 0xa50370
  +0x80: 0x10b2a80
  +0x88: 0x10b2aa0
AP 0x184d220
  +0x0: 0x9d7de0
  +0x8: 0xa50370
  +0x10: 0x10b7c50
  +0x18: 0x10b7d60
  +0x20: NO_RELOC
  +0x28: NO_RELOC
  +0x30: 0x10ab772
  +0x38: 0x10b80f2
  +0x40: 0x10b9db6
  +0x48: 0xaa8e00
  +0x50: 0x1066dbe
  +0x58: 0x10b8104
  +0x60: 0x10b81ca
  +0x68: 0x10b8272
  +0x70: 0x10b831a
  +0x78: 0x10b83c2
  +0x80: 0x10b845a
  +0x88: 0x10b84f4
AP 0x184da88
  +0x0: 0x10c09c6
  +0x8: 0x10c0a66
  +0x10: 0xe750be
  +0x18: 0xa55cb0
  +0x20: 0xa7a004
  +0x28: 0xaa7024
  +0x30: 0xbf7896
  +0x38: 0xb411a4
  +0x40: 0xb04950
  +0x48: 0xaa7012
  +0x50: NO_RELOC
  +0x58: NO_RELOC
  +0x60: 0x10c0a78
  +0x68: 0x10c0a92
  +0x70: 0x10c0aa4
  +0x78: 0x10c0b66
  +0x80: 0x10c0bae
  +0x88: 0x10c0bf2

## Restrictions AP slot method bodies (+0x28, +0x38, +0x68 where present)
### AP 0x184ca90 +0x28 -> 0xa7a004
FDE= ('0xa7a004', '0xa7a009')
  a7a004:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
  a7a008:	c3                   	ret

### AP 0x184ca90 +0x30 -> 0x10ae21c
FDE= ('0x10ae21c', '0x10ae226')
 10ae21c:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
 10ae220:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ae223:	ff 60 38             	jmp    QWORD PTR [rax+0x38]

### AP 0x184ca90 +0x38 -> 0x10ae226
FDE= ('0x10ae226', '0x10ae22f')
 10ae226:	48 8b 47 60          	mov    rax,QWORD PTR [rdi+0x60]
 10ae22a:	48 83 c0 08          	add    rax,0x8
 10ae22e:	c3                   	ret

### AP 0x184ca90 +0x68 -> 0xaa7018
FDE= ('0xaa7018', '0xaa701d')
  aa7018:	48 8b 47 40          	mov    rax,QWORD PTR [rdi+0x40]
  aa701c:	c3                   	ret

### AP 0x184d898 +0x30 -> 0xabfe12
FDE= ('0xabfe12', '0xabfe54')
  abfe12:	53                   	push   rbx
  abfe13:	48 89 fb             	mov    rbx,rdi
  abfe16:	48 8d 05 d3 fd d3 00 	lea    rax,[rip+0xd3fdd3]        # 17ffbf0 <_ZTIN4asio22service_already_existsE@@Base+0x13d8>
  abfe1d:	48 89 07             	mov    QWORD PTR [rdi],rax
  abfe20:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
  abfe24:	a8 01                	test   al,0x1
  abfe26:	75 23                	jne    abfe4b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcdeb>
  abfe28:	48 85 c0             	test   rax,rax
  abfe2b:	74 02                	je     abfe2f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcdcf>
  abfe2d:	5b                   	pop    rbx
  abfe2e:	c3                   	ret
  abfe2f:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
  abfe33:	e8 d0 ab fe ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
  abfe38:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
  abfe3c:	e8 67 5a ca 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
  abfe41:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
  abfe45:	5b                   	pop    rbx
  abfe46:	e9 5d 5a ca 00       	jmp    17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
  abfe4b:	48 83 e0 fe          	and    rax,0xfffffffffffffffe
  abfe4f:	48 8b 00             	mov    rax,QWORD PTR [rax]
  abfe52:	eb d4                	jmp    abfe28 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcdc8>

### AP 0x184d898 +0x38 -> 0xabfe54
FDE= ('0xabfe54', '0xabfe66')
  abfe54:	53                   	push   rbx
  abfe55:	48 89 fb             	mov    rbx,rdi
  abfe58:	e8 b5 ff ff ff       	call   abfe12 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcdb2>
  abfe5d:	48 89 df             	mov    rdi,rbx
  abfe60:	5b                   	pop    rbx
  abfe61:	e9 ba e0 d2 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x187e260 +0x28 -> 0x153c950
FDE= ('0x153c950', '0x153c9e6')
 153c950:	41 57                	push   r15
 153c952:	41 56                	push   r14
 153c954:	41 55                	push   r13
 153c956:	41 54                	push   r12
 153c958:	53                   	push   rbx
 153c959:	49 89 d4             	mov    r12,rdx
 153c95c:	49 89 f6             	mov    r14,rsi
 153c95f:	48 89 fb             	mov    rbx,rdi
 153c962:	6a 38                	push   0x38
 153c964:	5f                   	pop    rdi
 153c965:	e8 96 15 2b 00       	call   17edf00 <_Znwm@plt>
 153c96a:	49 89 c7             	mov    r15,rax
 153c96d:	0f 57 c0             	xorps  xmm0,xmm0
 153c970:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
 153c974:	48 8d 05 45 19 34 00 	lea    rax,[rip+0x341945]        # 187e2c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3a9a8>
 153c97b:	49 89 07             	mov    QWORD PTR [r15],rax
 153c97e:	49 83 67 18 00       	and    QWORD PTR [r15+0x18],0x0
 153c983:	49 83 67 28 00       	and    QWORD PTR [r15+0x28],0x0
 153c988:	4d 8d 6f 18          	lea    r13,[r15+0x18]
 153c98c:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
 153c991:	48 85 c0             	test   rax,rax
 153c994:	74 1e                	je     153c9b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x381f38>
 153c996:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
 153c99a:	6a 01                	push   0x1
 153c99c:	5f                   	pop    rdi
 153c99d:	4c 89 ee             	mov    rsi,r13
 153c9a0:	4c 89 e2             	mov    rdx,r12
 153c9a3:	ff d0                	call   rax
 153c9a5:	49 8b 44 24 18       	mov    rax,QWORD PTR [r12+0x18]
 153c9aa:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
 153c9ae:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0
 153c9b4:	4c 89 2b             	mov    QWORD PTR [rbx],r13
 153c9b7:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
 153c9bb:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
 153c9c0:	4d 89 6e 48          	mov    QWORD PTR [r14+0x48],r13
 153c9c4:	49 8b 7e 50          	mov    rdi,QWORD PTR [r14+0x50]
 153c9c8:	4d 89 7e 50          	mov    QWORD PTR [r14+0x50],r15
 153c9cc:	e8 e1 1a 56 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 153c9d1:	48 89 d8             	mov    rax,rbx
 153c9d4:	5b                   	pop    rbx
 153c9d5:	41 5c                	pop    r12
 153c9d7:	41 5d                	pop    r13
 153c9d9:	41 5e                	pop    r14
 153c9db:	41 5f                	pop    r15
 153c9dd:	c3                   	ret
 153c9de:	48 89 c7             	mov    rdi,rax
 153c9e1:	e8 bf d0 53 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

### AP 0x187e260 +0x30 -> 0x153c9e6
FDE= ('0x153c9e6', '0x153c9eb')
 153c9e6:	40 88 77 40          	mov    BYTE PTR [rdi+0x40],sil
 153c9ea:	c3                   	ret

### AP 0x187e260 +0x38 -> 0xe750be
FDE= ('0xe750be', '0xe750c2')
  e750be:	8a 47 40             	mov    al,BYTE PTR [rdi+0x40]
  e750c1:	c3                   	ret

### AP 0x187e260 +0x68 -> 0x153ca32
FDE= ('0x153ca32', '0x153ca44')
 153ca32:	53                   	push   rbx
 153ca33:	48 89 fb             	mov    rbx,rdi
 153ca36:	e8 e7 ff ff ff       	call   153ca22 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x381fa6>
 153ca3b:	48 89 df             	mov    rdi,rbx
 153ca3e:	5b                   	pop    rbx
 153ca3f:	e9 dc 14 2b 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x184d808 +0x28 -> 0x10beaf0
FDE= ('0x10beaf0', '0x10bec3e')
 10beaf0:	41 57                	push   r15
 10beaf2:	41 56                	push   r14
 10beaf4:	53                   	push   rbx
 10beaf5:	48 83 ec 60          	sub    rsp,0x60
 10beaf9:	48 89 fb             	mov    rbx,rdi
 10beafc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10beb03:	00 00 
 10beb05:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 10beb0a:	4c 8d b7 90 00 00 00 	lea    r14,[rdi+0x90]
 10beb11:	49 89 e7             	mov    r15,rsp
 10beb14:	4c 89 ff             	mov    rdi,r15
 10beb17:	e8 74 b7 9b ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 10beb1c:	4d 39 f7             	cmp    r15,r14
 10beb1f:	0f 84 ea 00 00 00    	je     10bec0f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286025>
 10beb25:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 10beb2a:	48 8b 8b b0 00 00 00 	mov    rcx,QWORD PTR [rbx+0xb0]
 10beb31:	4c 39 f8             	cmp    rax,r15
 10beb34:	74 16                	je     10beb4c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285f62>
 10beb36:	4c 39 f1             	cmp    rcx,r14
 10beb39:	74 3e                	je     10beb79 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285f8f>
 10beb3b:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
 10beb40:	48 89 83 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],rax
 10beb47:	e9 c3 00 00 00       	jmp    10bec0f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286025>
 10beb4c:	48 89 e7             	mov    rdi,rsp
 10beb4f:	4c 39 f1             	cmp    rcx,r14
 10beb52:	74 54                	je     10beba8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285fbe>
 10beb54:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10beb57:	4c 89 f6             	mov    rsi,r14
 10beb5a:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10beb5d:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
 10beb62:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10beb65:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10beb68:	48 8b 83 b0 00 00 00 	mov    rax,QWORD PTR [rbx+0xb0]
 10beb6f:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 10beb74:	e9 8f 00 00 00       	jmp    10bec08 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28601e>
 10beb79:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10beb7c:	49 89 e7             	mov    r15,rsp
 10beb7f:	4c 89 f7             	mov    rdi,r14
 10beb82:	4c 89 fe             	mov    rsi,r15
 10beb85:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10beb88:	48 8b bb b0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xb0]
 10beb8f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10beb92:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10beb95:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 10beb9a:	48 89 83 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],rax
 10beba1:	4c 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],r15
 10beba6:	eb 67                	jmp    10bec0f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286025>
 10beba8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bebab:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
 10bebb0:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10bebb3:	49 89 e7             	mov    r15,rsp
 10bebb6:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
 10bebba:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bebbd:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10bebc0:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
 10bebc5:	48 8b bb b0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xb0]
 10bebcc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bebcf:	4c 89 fe             	mov    rsi,r15
 10bebd2:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10bebd5:	48 8b bb b0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xb0]
 10bebdc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bebdf:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10bebe2:	48 83 a3 b0 00 00 00 	and    QWORD PTR [rbx+0xb0],0x0
 10bebe9:	00 
 10bebea:	4c 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],r15
 10bebef:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 10bebf4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bebf7:	4c 89 f6             	mov    rsi,r14
 10bebfa:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10bebfd:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 10bec02:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bec05:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10bec08:	4c 89 b3 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],r14
 10bec0f:	48 89 e7             	mov    rdi,rsp
 10bec12:	e8 53 b3 9b ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 10bec17:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bec1e:	00 00 
 10bec20:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
 10bec25:	75 0a                	jne    10bec31 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286047>
 10bec27:	48 83 c4 60          	add    rsp,0x60
 10bec2b:	5b                   	pop    rbx
 10bec2c:	41 5e                	pop    r14
 10bec2e:	41 5f                	pop    r15
 10bec30:	c3                   	ret
 10bec31:	e8 7a 0e 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bec36:	48 89 c7             	mov    rdi,rax
 10bec39:	e8 67 ae 9b ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

### AP 0x184d808 +0x30 -> 0x10bec3e
FDE= ('0x10bec3e', '0x10bf214')
 10bec3e:	55                   	push   rbp
 10bec3f:	41 57                	push   r15
 10bec41:	41 56                	push   r14
 10bec43:	41 55                	push   r13
 10bec45:	41 54                	push   r12
 10bec47:	53                   	push   rbx
 10bec48:	48 81 ec d8 00 00 00 	sub    rsp,0xd8
 10bec4f:	48 89 f5             	mov    rbp,rsi
 10bec52:	48 89 fb             	mov    rbx,rdi
 10bec55:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bec5c:	00 00 
 10bec5e:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
 10bec65:	00 
 10bec66:	80 bf 28 01 00 00 00 	cmp    BYTE PTR [rdi+0x128],0x0
 10bec6d:	0f 84 87 00 00 00    	je     10becfa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286110>
 10bec73:	48 8b 75 00          	mov    rsi,QWORD PTR [rbp+0x0]
 10bec77:	4c 8d 7b 08          	lea    r15,[rbx+0x8]
 10bec7b:	48 39 73 60          	cmp    QWORD PTR [rbx+0x60],rsi
 10bec7f:	0f 8f df 01 00 00    	jg     10bee64 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28627a>
 10bec85:	48 89 df             	mov    rdi,rbx
 10bec88:	e8 6d 0f 00 00       	call   10bfbfa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287010>
 10bec8d:	48 2b 43 68          	sub    rax,QWORD PTR [rbx+0x68]
 10bec91:	48 01 83 f0 00 00 00 	add    QWORD PTR [rbx+0xf0],rax
 10bec98:	48 8d bd 88 00 00 00 	lea    rdi,[rbp+0x88]
 10bec9f:	4c 89 fe             	mov    rsi,r15
 10beca2:	e8 7b bf ac ff       	call   b8ac22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7bc2>
 10beca7:	84 c0                	test   al,al
 10beca9:	74 7c                	je     10bed27 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28613d>
 10becab:	4c 8d 7d 08          	lea    r15,[rbp+0x8]
 10becaf:	4c 89 ff             	mov    rdi,r15
 10becb2:	e8 bb 6e a8 ff       	call   b45b72 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92b12>
 10becb7:	4c 89 ff             	mov    rdi,r15
 10becba:	e8 b3 6e a8 ff       	call   b45b72 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92b12>
 10becbf:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]
 10becc3:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
 10becc7:	48 8d 7d 58          	lea    rdi,[rbp+0x58]
 10beccb:	e8 a2 6e a8 ff       	call   b45b72 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92b12>
 10becd0:	f2 0f 10 45 58       	movsd  xmm0,QWORD PTR [rbp+0x58]
 10becd5:	f2 0f 11 43 78       	movsd  QWORD PTR [rbx+0x78],xmm0
 10becda:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
 10becde:	48 89 43 60          	mov    QWORD PTR [rbx+0x60],rax
 10bece2:	48 8b bb e0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xe0]
 10bece9:	e8 74 b7 9b ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
 10becee:	48 89 83 80 00 00 00 	mov    QWORD PTR [rbx+0x80],rax
 10becf5:	e9 41 01 00 00       	jmp    10bee3b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286251>
 10becfa:	48 89 ef             	mov    rdi,rbp
 10becfd:	e8 ff 0b 00 00       	call   10bf901 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286d17>
 10bed02:	84 c0                	test   al,al
 10bed04:	0f 84 31 01 00 00    	je     10bee3b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286251>
 10bed0a:	48 89 df             	mov    rdi,rbx
 10bed0d:	48 89 ee             	mov    rsi,rbp
 10bed10:	e8 23 0c 00 00       	call   10bf938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286d4e>
 10bed15:	80 bb 28 01 00 00 00 	cmp    BYTE PTR [rbx+0x128],0x0
 10bed1c:	0f 85 51 ff ff ff    	jne    10bec73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286089>
 10bed22:	e9 14 01 00 00       	jmp    10bee3b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286251>
 10bed27:	4c 8b a3 f8 00 00 00 	mov    r12,QWORD PTR [rbx+0xf8]
 10bed2e:	4c 8b b3 00 01 00 00 	mov    r14,QWORD PTR [rbx+0x100]
 10bed35:	4d 39 f4             	cmp    r12,r14
 10bed38:	0f 84 83 00 00 00    	je     10bedc1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2861d7>
 10bed3e:	48 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],rbp
 10bed43:	4c 8d 6b 18          	lea    r13,[rbx+0x18]
 10bed47:	48 8d ac 24 90 00 00 	lea    rbp,[rsp+0x90]
 10bed4e:	00 
 10bed4f:	48 89 ef             	mov    rdi,rbp
 10bed52:	4c 89 e6             	mov    rsi,r12
 10bed55:	e8 d6 c5 9e ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
 10bed5a:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
 10bed61:	00 
 10bed62:	48 85 ff             	test   rdi,rdi
 10bed65:	74 10                	je     10bed77 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28618d>
 10bed67:	48 8b 8b f0 00 00 00 	mov    rcx,QWORD PTR [rbx+0xf0]
 10bed6e:	4c 89 fe             	mov    rsi,r15
 10bed71:	4c 89 ea             	mov    rdx,r13
 10bed74:	ff 57 18             	call   QWORD PTR [rdi+0x18]
 10bed77:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
 10bed7e:	00 
 10bed7f:	e8 02 f7 9d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10bed84:	49 83 c4 10          	add    r12,0x10
 10bed88:	4d 39 f4             	cmp    r12,r14
 10bed8b:	75 c2                	jne    10bed4f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286165>
 10bed8d:	4c 8b bb f8 00 00 00 	mov    r15,QWORD PTR [rbx+0xf8]
 10bed94:	4c 8b a3 00 01 00 00 	mov    r12,QWORD PTR [rbx+0x100]
 10bed9b:	4d 39 e7             	cmp    r15,r12
 10bed9e:	74 63                	je     10bee03 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286219>
 10beda0:	48 8b 6c 24 08       	mov    rbp,QWORD PTR [rsp+0x8]
 10beda5:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
 10beda9:	48 85 c0             	test   rax,rax
 10bedac:	74 18                	je     10bedc6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2861dc>
 10bedae:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
 10bedb2:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
 10bedb6:	74 0e                	je     10bedc6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2861dc>
 10bedb8:	49 83 c7 10          	add    r15,0x10
 10bedbc:	4d 39 e7             	cmp    r15,r12
 10bedbf:	75 e4                	jne    10beda5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2861bb>
 10bedc1:	4d 89 e7             	mov    r15,r12
 10bedc4:	eb 45                	jmp    10bee0b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286221>
 10bedc6:	4d 8d 6f 10          	lea    r13,[r15+0x10]
 10bedca:	4d 39 e5             	cmp    r13,r12
 10bedcd:	74 3c                	je     10bee0b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286221>
 10bedcf:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
 10bedd3:	48 85 c0             	test   rax,rax
 10bedd6:	74 19                	je     10bedf1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286207>
 10bedd8:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
 10beddc:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
 10bede0:	74 0f                	je     10bedf1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286207>
 10bede2:	4c 89 ff             	mov    rdi,r15
 10bede5:	4c 89 ee             	mov    rsi,r13
 10bede8:	e8 e9 95 a1 ff       	call   ad83d6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25376>
 10beded:	49 83 c7 10          	add    r15,0x10
 10bedf1:	49 83 c5 10          	add    r13,0x10
 10bedf5:	4d 39 e5             	cmp    r13,r12
 10bedf8:	75 d5                	jne    10bedcf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2861e5>
 10bedfa:	4c 8b a3 00 01 00 00 	mov    r12,QWORD PTR [rbx+0x100]
 10bee01:	eb 08                	jmp    10bee0b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286221>
 10bee03:	4d 89 e7             	mov    r15,r12
 10bee06:	48 8b 6c 24 08       	mov    rbp,QWORD PTR [rsp+0x8]
 10bee0b:	48 8d bb f8 00 00 00 	lea    rdi,[rbx+0xf8]
 10bee12:	4c 89 fe             	mov    rsi,r15
 10bee15:	4c 89 e2             	mov    rdx,r12
 10bee18:	e8 53 0a 00 00       	call   10bf870 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286c86>
 10bee1d:	c6 83 28 01 00 00 00 	mov    BYTE PTR [rbx+0x128],0x0
 10bee24:	48 89 ef             	mov    rdi,rbp
 10bee27:	e8 d5 0a 00 00       	call   10bf901 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286d17>
 10bee2c:	84 c0                	test   al,al
 10bee2e:	74 0b                	je     10bee3b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286251>
 10bee30:	48 89 df             	mov    rdi,rbx
 10bee33:	48 89 ee             	mov    rsi,rbp
 10bee36:	e8 fd 0a 00 00       	call   10bf938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286d4e>
 10bee3b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bee42:	00 00 
 10bee44:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]
 10bee4b:	00 
 10bee4c:	0f 85 bd 03 00 00    	jne    10bf20f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286625>
 10bee52:	48 81 c4 d8 00 00 00 	add    rsp,0xd8
 10bee59:	5b                   	pop    rbx
 10bee5a:	41 5c                	pop    r12
 10bee5c:	41 5d                	pop    r13
 10bee5e:	41 5e                	pop    r14
 10bee60:	41 5f                	pop    r15
 10bee62:	5d                   	pop    rbp
 10bee63:	c3                   	ret
 10bee64:	4c 8d a4 24 90 00 00 	lea    r12,[rsp+0x90]
 10bee6b:	00 
 10bee6c:	4c 89 e7             	mov    rdi,r12
 10bee6f:	4c 89 fe             	mov    rsi,r15
 10bee72:	e8 a9 54 ad ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
 10bee77:	48 8d 35 bc cb 26 ff 	lea    rsi,[rip+0xffffffffff26cbbc]        # 32ba3a <_ZTSSt12bad_any_cast@@Base-0x6478e>
 10bee7e:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 10bee83:	4c 89 e2             	mov    rdx,r12
 10bee86:	31 c0                	xor    eax,eax
 10bee88:	e8 0d ce 71 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
 10bee8d:	80 bb 40 01 00 00 00 	cmp    BYTE PTR [rbx+0x140],0x0
 10bee94:	0f 84 d3 02 00 00    	je     10bf16d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286583>
 10bee9a:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
 10beea1:	00 
 10beea2:	48 83 67 d8 00       	and    QWORD PTR [rdi-0x28],0x0
 10beea7:	48 8d 05 32 5b 7d 00 	lea    rax,[rip+0x7d5b32]        # 18949e0 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1920>
 10beeae:	48 89 47 d0          	mov    QWORD PTR [rdi-0x30],rax
 10beeb2:	0f 57 c0             	xorps  xmm0,xmm0
 10beeb5:	0f 11 47 e0          	movups XMMWORD PTR [rdi-0x20],xmm0
 10beeb9:	0f 11 47 f0          	movups XMMWORD PTR [rdi-0x10],xmm0
 10beebd:	48 8d 05 34 09 38 ff 	lea    rax,[rip+0xffffffffff380934]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
 10beec4:	48 89 07             	mov    QWORD PTR [rdi],rax
 10beec7:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
 10beecb:	c7 47 e0 01 00 00 00 	mov    DWORD PTR [rdi-0x20],0x1
 10beed2:	48 8d 35 33 76 29 ff 	lea    rsi,[rip+0xffffffffff297633]        # 35650c <_ZTSSt12bad_any_cast@@Base-0x39cbc>
 10beed9:	6a 12                	push   0x12
 10beedb:	5a                   	pop    rdx
 10beedc:	31 c9                	xor    ecx,ecx
 10beede:	e8 79 68 6a 00       	call   176575c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198c8>
 10beee3:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
 10beeea:	00 
 10beeeb:	80 4f d8 02          	or     BYTE PTR [rdi-0x28],0x2
 10beeef:	48 8b 57 d0          	mov    rdx,QWORD PTR [rdi-0x30]
 10beef3:	f6 c2 01             	test   dl,0x1
 10beef6:	0f 85 80 02 00 00    	jne    10bf17c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286592>
 10beefc:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
 10bef01:	e8 8c 68 6a 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
 10bef06:	48 8b bb e0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xe0]
 10bef0d:	e8 50 b5 9b ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
 10bef12:	49 89 c4             	mov    r12,rax
 10bef15:	4c 8b b3 80 00 00 00 	mov    r14,QWORD PTR [rbx+0x80]
 10bef1c:	48 8d 35 53 cb 26 ff 	lea    rsi,[rip+0xffffffffff26cb53]        # 32ba76 <_ZTSSt12bad_any_cast@@Base-0x64752>
 10bef23:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 10bef28:	e8 51 ab 9b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10bef2d:	48 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],rbp
 10bef32:	4d 29 f4             	sub    r12,r14
 10bef35:	f3 49 0f 2a c4       	cvtsi2ss xmm0,r12
 10bef3a:	f3 0f 5e 05 9a fa 2c 	divss  xmm0,DWORD PTR [rip+0xffffffffff2cfa9a]        # 38e9dc <_ZTSSt12bad_any_cast@@Base-0x17ec>
 10bef41:	ff 
 10bef42:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 10bef47:	e8 84 fc 72 00       	call   17eebd0 <_ZNSt6__ndk19to_stringEf@plt>
 10bef4c:	4c 8d a4 24 a8 00 00 	lea    r12,[rsp+0xa8]
 10bef53:	00 
 10bef54:	4c 8d 6c 24 60       	lea    r13,[rsp+0x60]
 10bef59:	48 8d 6c 24 40       	lea    rbp,[rsp+0x40]
 10bef5e:	4c 89 e7             	mov    rdi,r12
 10bef61:	4c 89 ee             	mov    rsi,r13
 10bef64:	48 89 ea             	mov    rdx,rbp
 10bef67:	e8 c2 0c 00 00       	call   10bfc2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287044>
 10bef6c:	48 89 ef             	mov    rdi,rbp
 10bef6f:	e8 1c ef 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bef74:	4c 89 ef             	mov    rdi,r13
 10bef77:	e8 14 ef 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bef7c:	48 8d 35 1c 09 28 ff 	lea    rsi,[rip+0xffffffffff28091c]        # 33f89f <_ZTSSt12bad_any_cast@@Base-0x50929>
 10bef83:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 10bef88:	e8 f1 aa 9b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10bef8d:	48 8b b3 f0 00 00 00 	mov    rsi,QWORD PTR [rbx+0xf0]
 10bef94:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 10bef99:	e8 02 f7 72 00       	call   17ee6a0 <_ZNSt6__ndk19to_stringEx@plt>
 10bef9e:	4c 8d 6c 24 60       	lea    r13,[rsp+0x60]
 10befa3:	48 8d 6c 24 40       	lea    rbp,[rsp+0x40]
 10befa8:	4c 89 e7             	mov    rdi,r12
 10befab:	4c 89 ee             	mov    rsi,r13
 10befae:	48 89 ea             	mov    rdx,rbp
 10befb1:	e8 78 0c 00 00       	call   10bfc2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287044>
 10befb6:	48 89 ef             	mov    rdi,rbp
 10befb9:	e8 d2 ee 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10befbe:	4c 89 ef             	mov    rdi,r13
 10befc1:	e8 ca ee 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10befc6:	48 8d 35 5c 32 2b ff 	lea    rsi,[rip+0xffffffffff2b325c]        # 372229 <_ZTSSt12bad_any_cast@@Base-0x1df9f>
 10befcd:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 10befd2:	e8 a7 aa 9b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10befd7:	48 8b 73 68          	mov    rsi,QWORD PTR [rbx+0x68]
 10befdb:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 10befe0:	e8 bb f6 72 00       	call   17ee6a0 <_ZNSt6__ndk19to_stringEx@plt>
 10befe5:	4c 8d 6c 24 60       	lea    r13,[rsp+0x60]
 10befea:	48 8d 6c 24 40       	lea    rbp,[rsp+0x40]
 10befef:	4c 89 e7             	mov    rdi,r12
 10beff2:	4c 89 ee             	mov    rsi,r13
 10beff5:	48 89 ea             	mov    rdx,rbp
 10beff8:	e8 31 0c 00 00       	call   10bfc2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287044>
 10beffd:	48 89 ef             	mov    rdi,rbp
 10bf000:	e8 8b ee 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bf005:	4c 89 ef             	mov    rdi,r13
 10bf008:	e8 83 ee 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bf00d:	48 8d 35 c4 dc 37 ff 	lea    rsi,[rip+0xffffffffff37dcc4]        # 43ccd8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x28e4>
 10bf014:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 10bf019:	e8 60 aa 9b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10bf01e:	48 8b 73 70          	mov    rsi,QWORD PTR [rbx+0x70]
 10bf022:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 10bf027:	e8 74 f6 72 00       	call   17ee6a0 <_ZNSt6__ndk19to_stringEx@plt>
 10bf02c:	4c 8d 6c 24 60       	lea    r13,[rsp+0x60]
 10bf031:	48 8d 6c 24 40       	lea    rbp,[rsp+0x40]
 10bf036:	4c 89 e7             	mov    rdi,r12
 10bf039:	4c 89 ee             	mov    rsi,r13
 10bf03c:	48 89 ea             	mov    rdx,rbp
 10bf03f:	e8 ea 0b 00 00       	call   10bfc2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287044>
 10bf044:	48 89 ef             	mov    rdi,rbp
 10bf047:	e8 44 ee 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bf04c:	4c 89 ef             	mov    rdi,r13
 10bf04f:	e8 3c ee 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bf054:	48 8d 35 e8 51 28 ff 	lea    rsi,[rip+0xffffffffff2851e8]        # 344243 <_ZTSSt12bad_any_cast@@Base-0x4bf85>
 10bf05b:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 10bf060:	e8 19 aa 9b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10bf065:	f2 0f 10 43 78       	movsd  xmm0,QWORD PTR [rbx+0x78]
 10bf06a:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 10bf06f:	e8 9c 00 73 00       	call   17ef110 <_ZNSt6__ndk19to_stringEd@plt>
 10bf074:	4c 8d 6c 24 60       	lea    r13,[rsp+0x60]
 10bf079:	48 8d 6c 24 40       	lea    rbp,[rsp+0x40]
 10bf07e:	4c 89 e7             	mov    rdi,r12
 10bf081:	4c 89 ee             	mov    rsi,r13
 10bf084:	48 89 ea             	mov    rdx,rbp
 10bf087:	e8 a2 0b 00 00       	call   10bfc2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287044>
 10bf08c:	48 89 ef             	mov    rdi,rbp
 10bf08f:	e8 fc ed 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bf094:	4c 89 ef             	mov    rdi,r13
 10bf097:	e8 f4 ed 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bf09c:	48 8d 35 c2 6d 26 ff 	lea    rsi,[rip+0xffffffffff266dc2]        # 325e65 <_ZTSSt12bad_any_cast@@Base-0x6a363>
 10bf0a3:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 10bf0a8:	e8 d1 a9 9b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10bf0ad:	4c 8d 6c 24 60       	lea    r13,[rsp+0x60]
 10bf0b2:	4c 89 ef             	mov    rdi,r13
 10bf0b5:	4c 89 fe             	mov    rsi,r15
 10bf0b8:	e8 63 52 ad ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
 10bf0bd:	48 8d 6c 24 10       	lea    rbp,[rsp+0x10]
 10bf0c2:	48 89 ef             	mov    rdi,rbp
 10bf0c5:	4c 89 ee             	mov    rsi,r13
 10bf0c8:	e8 4b 0f bc ff       	call   c80018 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ccfb8>
 10bf0cd:	4c 8d 6c 24 40       	lea    r13,[rsp+0x40]
 10bf0d2:	4c 89 e7             	mov    rdi,r12
 10bf0d5:	4c 89 ee             	mov    rsi,r13
 10bf0d8:	48 89 ea             	mov    rdx,rbp
 10bf0db:	e8 4e 0b 00 00       	call   10bfc2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287044>
 10bf0e0:	48 89 ef             	mov    rdi,rbp
 10bf0e3:	e8 a8 ed 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bf0e8:	4c 89 ef             	mov    rdi,r13
 10bf0eb:	e8 a0 ed 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bf0f0:	48 8d 35 56 f0 29 ff 	lea    rsi,[rip+0xffffffffff29f056]        # 35e14d <_ZTSSt12bad_any_cast@@Base-0x3207b>
 10bf0f7:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 10bf0fc:	e8 7d a9 9b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10bf101:	48 8d 53 18          	lea    rdx,[rbx+0x18]
 10bf105:	4c 8d 6c 24 60       	lea    r13,[rsp+0x60]
 10bf10a:	4c 89 e7             	mov    rdi,r12
 10bf10d:	4c 89 ee             	mov    rsi,r13
 10bf110:	e8 19 0b 00 00       	call   10bfc2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287044>
 10bf115:	4c 89 ef             	mov    rdi,r13
 10bf118:	e8 73 ed 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bf11d:	48 8b bb 38 01 00 00 	mov    rdi,QWORD PTR [rbx+0x138]
 10bf124:	31 c0                	xor    eax,eax
 10bf126:	48 8d 54 24 40       	lea    rdx,[rsp+0x40]
 10bf12b:	88 02                	mov    BYTE PTR [rdx],al
 10bf12d:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
 10bf130:	49 83 65 20 00       	and    QWORD PTR [r13+0x20],0x0
 10bf135:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
 10bf13c:	00 
 10bf13d:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
 10bf142:	e8 db 5c 56 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
 10bf147:	48 8b 6c 24 08       	mov    rbp,QWORD PTR [rsp+0x8]
 10bf14c:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 10bf151:	e8 14 ae 9b ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 10bf156:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 10bf15b:	e8 d0 7b 9e ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10bf160:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 10bf167:	00 
 10bf168:	e8 dd 25 59 00       	call   165174a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58b6>
 10bf16d:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 10bf172:	e8 19 ed 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bf177:	e9 1c fb ff ff       	jmp    10bec98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2860ae>
 10bf17c:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
 10bf180:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
 10bf183:	e9 74 fd ff ff       	jmp    10beefc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286312>
 10bf188:	48 89 c3             	mov    rbx,rax
 10bf18b:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 10bf190:	e8 d5 ad 9b ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 10bf195:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 10bf19a:	e8 91 7b 9e ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10bf19f:	eb 2a                	jmp    10bf1cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2865e1>
 10bf1a1:	eb 25                	jmp    10bf1c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2865de>
 10bf1a3:	eb 23                	jmp    10bf1c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2865de>
 10bf1a5:	eb 0e                	jmp    10bf1b5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2865cb>
 10bf1a7:	eb 1f                	jmp    10bf1c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2865de>
 10bf1a9:	eb 0a                	jmp    10bf1b5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2865cb>
 10bf1ab:	eb 1b                	jmp    10bf1c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2865de>
 10bf1ad:	eb 06                	jmp    10bf1b5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2865cb>
 10bf1af:	eb 17                	jmp    10bf1c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2865de>
 10bf1b1:	eb 02                	jmp    10bf1b5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2865cb>
 10bf1b3:	eb 13                	jmp    10bf1c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2865de>
 10bf1b5:	48 89 c3             	mov    rbx,rax
 10bf1b8:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 10bf1bd:	e8 ce ec 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bf1c2:	eb 07                	jmp    10bf1cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2865e1>
 10bf1c4:	eb 02                	jmp    10bf1c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2865de>
 10bf1c6:	eb 00                	jmp    10bf1c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2865de>
 10bf1c8:	48 89 c3             	mov    rbx,rax
 10bf1cb:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 10bf1d2:	00 
 10bf1d3:	e8 72 25 59 00       	call   165174a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58b6>
 10bf1d8:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 10bf1dd:	e8 ae ec 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bf1e2:	eb 10                	jmp    10bf1f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28660a>
 10bf1e4:	48 89 c3             	mov    rbx,rax
 10bf1e7:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
 10bf1ee:	00 
 10bf1ef:	e8 92 f2 9d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10bf1f4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bf1fb:	00 00 
 10bf1fd:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]
 10bf204:	00 
 10bf205:	75 08                	jne    10bf20f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286625>
 10bf207:	48 89 df             	mov    rdi,rbx
 10bf20a:	e8 c1 0a 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bf20f:	e8 9c 08 73 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x184d808 +0x38 -> 0x10bf214
FDE= ('0x10bf214', '0x10bf45d')
 10bf214:	55                   	push   rbp
 10bf215:	41 57                	push   r15
 10bf217:	41 56                	push   r14
 10bf219:	41 55                	push   r13
 10bf21b:	41 54                	push   r12
 10bf21d:	53                   	push   rbx
 10bf21e:	48 81 ec 88 00 00 00 	sub    rsp,0x88
 10bf225:	49 89 ff             	mov    r15,rdi
 10bf228:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bf22f:	00 00 
 10bf231:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
 10bf238:	00 
 10bf239:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
 10bf23f:	48 8d 05 02 e7 78 00 	lea    rax,[rip+0x78e702]        # 184d948 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa030>
 10bf246:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
 10bf24b:	0f 57 c0             	xorps  xmm0,xmm0
 10bf24e:	0f 11 44 24 38       	movups XMMWORD PTR [rsp+0x38],xmm0
 10bf253:	48 83 64 24 48 00    	and    QWORD PTR [rsp+0x48],0x0
 10bf259:	c7 44 24 38 01 00 00 	mov    DWORD PTR [rsp+0x38],0x1
 10bf260:	00 
 10bf261:	31 ff                	xor    edi,edi
 10bf263:	e8 5a 06 00 00       	call   10bf8c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286cd8>
 10bf268:	49 89 c6             	mov    r14,rax
 10bf26b:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 10bf270:	49 8d 77 08          	lea    rsi,[r15+0x8]
 10bf274:	48 8d 5c 24 50       	lea    rbx,[rsp+0x50]
 10bf279:	48 89 df             	mov    rdi,rbx
 10bf27c:	e8 9f 50 ad ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
 10bf281:	41 80 4e 10 01       	or     BYTE PTR [r14+0x10],0x1
 10bf286:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bf28b:	48 89 de             	mov    rsi,rbx
 10bf28e:	e8 85 0d bc ff       	call   c80018 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ccfb8>
 10bf293:	49 8b 56 08          	mov    rdx,QWORD PTR [r14+0x8]
 10bf297:	f6 c2 01             	test   dl,0x1
 10bf29a:	0f 85 3e 01 00 00    	jne    10bf3de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2867f4>
 10bf2a0:	49 8d 7e 48          	lea    rdi,[r14+0x48]
 10bf2a4:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
 10bf2a9:	e8 38 65 6a 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
 10bf2ae:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bf2b3:	e8 d8 eb 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bf2b8:	41 80 4e 10 02       	or     BYTE PTR [r14+0x10],0x2
 10bf2bd:	49 8d 77 18          	lea    rsi,[r15+0x18]
 10bf2c1:	49 8d 7e 50          	lea    rdi,[r14+0x50]
 10bf2c5:	49 8b 56 08          	mov    rdx,QWORD PTR [r14+0x8]
 10bf2c9:	f6 c2 01             	test   dl,0x1
 10bf2cc:	0f 85 18 01 00 00    	jne    10bf3ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286800>
 10bf2d2:	e8 bb 64 6a 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
 10bf2d7:	41 80 4e 10 04       	or     BYTE PTR [r14+0x10],0x4
 10bf2dc:	49 8d 77 30          	lea    rsi,[r15+0x30]
 10bf2e0:	49 8d 7e 58          	lea    rdi,[r14+0x58]
 10bf2e4:	49 8b 56 08          	mov    rdx,QWORD PTR [r14+0x8]
 10bf2e8:	f6 c2 01             	test   dl,0x1
 10bf2eb:	0f 85 05 01 00 00    	jne    10bf3f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28680c>
 10bf2f1:	e8 9c 64 6a 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
 10bf2f6:	49 8b 47 50          	mov    rax,QWORD PTR [r15+0x50]
 10bf2fa:	48 85 c0             	test   rax,rax
 10bf2fd:	74 66                	je     10bf365 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28677b>
 10bf2ff:	4c 89 3c 24          	mov    QWORD PTR [rsp],r15
 10bf303:	49 8b 6f 48          	mov    rbp,QWORD PTR [r15+0x48]
 10bf307:	4c 6b e0 30          	imul   r12,rax,0x30
 10bf30b:	49 01 ec             	add    r12,rbp
 10bf30e:	49 83 c6 18          	add    r14,0x18
 10bf312:	4c 8d 7c 24 50       	lea    r15,[rsp+0x50]
 10bf317:	4c 89 f7             	mov    rdi,r14
 10bf31a:	e8 eb 56 a7 ff       	call   b34a0a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x819aa>
 10bf31f:	48 89 c3             	mov    rbx,rax
 10bf322:	4c 8d 6d 18          	lea    r13,[rbp+0x18]
 10bf326:	4c 89 ff             	mov    rdi,r15
 10bf329:	48 89 ee             	mov    rsi,rbp
 10bf32c:	4c 89 ea             	mov    rdx,r13
 10bf32f:	e8 9c 23 b7 ff       	call   c316d0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17e670>
 10bf334:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bf339:	48 89 de             	mov    rsi,rbx
 10bf33c:	4c 89 fa             	mov    rdx,r15
 10bf33f:	e8 16 9c e5 ff       	call   f18f5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe0370>
 10bf344:	4c 89 ff             	mov    rdi,r15
 10bf347:	e8 80 f4 9d ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
 10bf34c:	49 83 c5 18          	add    r13,0x18
 10bf350:	4c 89 ed             	mov    rbp,r13
 10bf353:	4d 39 e5             	cmp    r13,r12
 10bf356:	75 bf                	jne    10bf317 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28672d>
 10bf358:	8b 44 24 38          	mov    eax,DWORD PTR [rsp+0x38]
 10bf35c:	83 c8 02             	or     eax,0x2
 10bf35f:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
 10bf363:	eb 03                	jmp    10bf368 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28677e>
 10bf365:	6a 03                	push   0x3
 10bf367:	58                   	pop    rax
 10bf368:	49 8b 8f f0 00 00 00 	mov    rcx,QWORD PTR [r15+0xf0]
 10bf36f:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
 10bf374:	48 89 4e 20          	mov    QWORD PTR [rsi+0x20],rcx
 10bf378:	89 46 10             	mov    DWORD PTR [rsi+0x10],eax
 10bf37b:	49 8b 9f 30 01 00 00 	mov    rbx,QWORD PTR [r15+0x130]
 10bf382:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
 10bf387:	e8 38 09 6c 00       	call   177fcc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e30>
 10bf38c:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 10bf38f:	48 8d 35 c2 8e 92 00 	lea    rsi,[rip+0x928ec2]        # 19e8258 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2848>
 10bf396:	48 8d 54 24 50       	lea    rdx,[rsp+0x50]
 10bf39b:	48 89 df             	mov    rdi,rbx
 10bf39e:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10bf3a1:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
 10bf3a6:	e8 e5 ea 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bf3ab:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 10bf3b0:	e8 07 0d 00 00       	call   10c00bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2874d2>
 10bf3b5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bf3bc:	00 00 
 10bf3be:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
 10bf3c5:	00 
 10bf3c6:	0f 85 8c 00 00 00    	jne    10bf458 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28686e>
 10bf3cc:	48 81 c4 88 00 00 00 	add    rsp,0x88
 10bf3d3:	5b                   	pop    rbx
 10bf3d4:	41 5c                	pop    r12
 10bf3d6:	41 5d                	pop    r13
 10bf3d8:	41 5e                	pop    r14
 10bf3da:	41 5f                	pop    r15
 10bf3dc:	5d                   	pop    rbp
 10bf3dd:	c3                   	ret
 10bf3de:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
 10bf3e2:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
 10bf3e5:	e9 b6 fe ff ff       	jmp    10bf2a0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2866b6>
 10bf3ea:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
 10bf3ee:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
 10bf3f1:	e9 dc fe ff ff       	jmp    10bf2d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2866e8>
 10bf3f6:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
 10bf3fa:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
 10bf3fd:	e9 ef fe ff ff       	jmp    10bf2f1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286707>
 10bf402:	48 89 c3             	mov    rbx,rax
 10bf405:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
 10bf40a:	eb 0a                	jmp    10bf416 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28682c>
 10bf40c:	eb 13                	jmp    10bf421 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286837>
 10bf40e:	48 89 c3             	mov    rbx,rax
 10bf411:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bf416:	e8 75 ea 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bf41b:	eb 16                	jmp    10bf433 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286849>
 10bf41d:	eb 02                	jmp    10bf421 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286837>
 10bf41f:	eb 00                	jmp    10bf421 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286837>
 10bf421:	48 89 c3             	mov    rbx,rax
 10bf424:	eb 0d                	jmp    10bf433 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286849>
 10bf426:	48 89 c3             	mov    rbx,rax
 10bf429:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
 10bf42e:	e8 99 f3 9d ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
 10bf433:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 10bf438:	e8 7f 0c 00 00       	call   10c00bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2874d2>
 10bf43d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bf444:	00 00 
 10bf446:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
 10bf44d:	00 
 10bf44e:	75 08                	jne    10bf458 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28686e>
 10bf450:	48 89 df             	mov    rdi,rbx
 10bf453:	e8 78 08 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bf458:	e8 53 06 73 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x184d808 +0x68 -> 0x10bff22
FDE= ('0x10bff22', '0x10bff2b')
 10bff22:	48 83 c7 18          	add    rdi,0x18
 10bff26:	e9 ff dd fe ff       	jmp    10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>

### AP 0x180e8e0 +0x28 -> 0xa50370
FDE= ('0xa50370', '0xa50375')
  a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x180e8e0 +0x30 -> 0xaad1b6
FDE= ('0xaad1b6', '0xaad1b9')
  aad1b6:	ff 67 08             	jmp    QWORD PTR [rdi+0x8]

### AP 0x180e8e0 +0x68 -> 0xbbc78c
FDE= ('0xbbc78c', '0xbbc87c')
  bbc78c:	41 57                	push   r15
  bbc78e:	41 56                	push   r14
  bbc790:	41 55                	push   r13
  bbc792:	41 54                	push   r12
  bbc794:	53                   	push   rbx
  bbc795:	48 83 ec 20          	sub    rsp,0x20
  bbc799:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  bbc7a0:	00 00 
  bbc7a2:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  bbc7a7:	4c 8b b7 d0 00 00 00 	mov    r14,QWORD PTR [rdi+0xd0]
  bbc7ae:	4c 3b b7 d8 00 00 00 	cmp    r14,QWORD PTR [rdi+0xd8]
  bbc7b5:	74 7d                	je     bbc834 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097d4>
  bbc7b7:	48 89 fb             	mov    rbx,rdi
  bbc7ba:	4c 8d bf d0 00 00 00 	lea    r15,[rdi+0xd0]
  bbc7c1:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
  bbc7c6:	4c 89 e7             	mov    rdi,r12
  bbc7c9:	4c 89 f6             	mov    rsi,r14
  bbc7cc:	e8 5f eb ee ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  bbc7d1:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
  bbc7d6:	4d 85 ed             	test   r13,r13
  bbc7d9:	74 38                	je     bbc813 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097b3>
  bbc7db:	41 c7 85 c0 00 00 00 	mov    DWORD PTR [r13+0xc0],0x1
  bbc7e2:	01 00 00 00 
  bbc7e6:	49 8b bd b8 00 00 00 	mov    rdi,QWORD PTR [r13+0xb8]
  bbc7ed:	e8 ba 51 c0 00       	call   17c19ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175b18>
  bbc7f2:	84 c0                	test   al,al
  bbc7f4:	74 17                	je     bbc80d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097ad>
  bbc7f6:	49 8d bd b0 00 00 00 	lea    rdi,[r13+0xb0]
  bbc7fd:	e8 36 51 c0 00       	call   17c1938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175aa4>
  bbc802:	48 89 df             	mov    rdi,rbx
  bbc805:	4c 89 ee             	mov    rsi,r13
  bbc808:	e8 d9 73 fd ff       	call   b93be6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe0b86>
  bbc80d:	49 83 c6 10          	add    r14,0x10
  bbc811:	eb 0e                	jmp    bbc821 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097c1>
  bbc813:	4c 89 ff             	mov    rdi,r15
  bbc816:	4c 89 f6             	mov    rsi,r14
  bbc819:	e8 94 80 fd ff       	call   b948b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe1852>
  bbc81e:	49 89 c6             	mov    r14,rax
  bbc821:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  bbc826:	e8 5b 1c ee ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  bbc82b:	4c 3b b3 d8 00 00 00 	cmp    r14,QWORD PTR [rbx+0xd8]
  bbc832:	75 92                	jne    bbc7c6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x109766>
  bbc834:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  bbc83b:	00 00 
  bbc83d:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  bbc842:	75 33                	jne    bbc877 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x109817>
  bbc844:	48 83 c4 20          	add    rsp,0x20
  bbc848:	5b                   	pop    rbx
  bbc849:	41 5c                	pop    r12
  bbc84b:	41 5d                	pop    r13
  bbc84d:	41 5e                	pop    r14
  bbc84f:	41 5f                	pop    r15
  bbc851:	c3                   	ret
  bbc852:	48 89 c3             	mov    rbx,rax
  bbc855:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  bbc85a:	e8 27 1c ee ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  bbc85f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  bbc866:	00 00 
  bbc868:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  bbc86d:	75 08                	jne    bbc877 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x109817>
  bbc86f:	48 89 df             	mov    rdi,rbx
  bbc872:	e8 59 34 eb ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  bbc877:	e8 34 32 c3 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x184d0a0 +0x30 -> 0x9d7de0
FDE= ('0x9d7de0', '0x9d7de1')
  9d7de0:	c3                   	ret

### AP 0x184d0a0 +0x38 -> 0xa50370
FDE= ('0xa50370', '0xa50375')
  a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x184d1f0 +0x30 -> 0x9d7de0
FDE= ('0x9d7de0', '0x9d7de1')
  9d7de0:	c3                   	ret

### AP 0x184d1f0 +0x38 -> 0xa50370
FDE= ('0xa50370', '0xa50375')
  a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x184d1f0 +0x68 -> 0x10b80f2
FDE= ('0x10b80f2', '0x10b8104')
 10b80f2:	53                   	push   rbx
 10b80f3:	48 89 fb             	mov    rbx,rdi
 10b80f6:	e8 77 36 ff ff       	call   10ab772 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x272b88>
 10b80fb:	48 89 df             	mov    rdi,rbx
 10b80fe:	5b                   	pop    rbx
 10b80ff:	e9 1c 5e 73 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x184d9a8 +0x28 -> 0x10c0902
FDE= ('0x10c0902', '0x10c0949')
 10c0902:	41 56                	push   r14
 10c0904:	53                   	push   rbx
 10c0905:	50                   	push   rax
 10c0906:	80 7f 18 00          	cmp    BYTE PTR [rdi+0x18],0x0
 10c090a:	74 35                	je     10c0941 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287d57>
 10c090c:	49 89 fe             	mov    r14,rdi
 10c090f:	80 7f 70 00          	cmp    BYTE PTR [rdi+0x70],0x0
 10c0913:	74 2c                	je     10c0941 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287d57>
 10c0915:	48 89 d3             	mov    rbx,rdx
 10c0918:	49 8d 46 40          	lea    rax,[r14+0x40]
 10c091c:	48 89 f7             	mov    rdi,rsi
 10c091f:	48 89 c6             	mov    rsi,rax
 10c0922:	e8 c7 ed 9d ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
 10c0927:	84 c0                	test   al,al
 10c0929:	74 16                	je     10c0941 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287d57>
 10c092b:	49 83 c6 78          	add    r14,0x78
 10c092f:	4c 89 f7             	mov    rdi,r14
 10c0932:	48 89 de             	mov    rsi,rbx
 10c0935:	48 83 c4 08          	add    rsp,0x8
 10c0939:	5b                   	pop    rbx
 10c093a:	41 5e                	pop    r14
 10c093c:	e9 f9 19 a4 ff       	jmp    b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
 10c0941:	48 83 c4 08          	add    rsp,0x8
 10c0945:	5b                   	pop    rbx
 10c0946:	41 5e                	pop    r14
 10c0948:	c3                   	ret

### AP 0x184d9a8 +0x30 -> 0x10c094a
FDE= ('0x10c094a', '0x10c0962')
 10c094a:	53                   	push   rbx
 10c094b:	48 89 d1             	mov    rcx,rdx
 10c094e:	48 89 fb             	mov    rbx,rdi
 10c0951:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]
 10c0955:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10c0958:	31 d2                	xor    edx,edx
 10c095a:	ff 50 48             	call   QWORD PTR [rax+0x48]
 10c095d:	48 89 d8             	mov    rax,rbx
 10c0960:	5b                   	pop    rbx
 10c0961:	c3                   	ret

### AP 0x184d9a8 +0x38 -> 0x10c0962
FDE= ('0x10c0962', '0x10c09ad')
 10c0962:	53                   	push   rbx
 10c0963:	48 89 fb             	mov    rbx,rdi
 10c0966:	48 8d 05 3b d0 78 00 	lea    rax,[rip+0x78d03b]        # 184d9a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa090>
 10c096d:	48 89 07             	mov    QWORD PTR [rdi],rax
 10c0970:	48 81 c7 b8 00 00 00 	add    rdi,0xb8
 10c0977:	e8 b4 63 9e ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10c097c:	48 8d bb 98 00 00 00 	lea    rdi,[rbx+0x98]
 10c0983:	e8 a8 63 9e ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10c0988:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
 10c098c:	e8 9f 63 9e ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10c0991:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
 10c0995:	e8 f6 d4 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10c099a:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
 10c099e:	e8 e3 da 9d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10c09a3:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
 10c09a7:	5b                   	pop    rbx
 10c09a8:	e9 d9 da 9d ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>

### AP 0x184d9a8 +0x68 -> 0xaeb7c0
FDE= ('0xaeb7c0', '0xaeb81e')
  aeb7c0:	41 57                	push   r15
  aeb7c2:	41 56                	push   r14
  aeb7c4:	53                   	push   rbx
  aeb7c5:	48 83 ec 20          	sub    rsp,0x20
  aeb7c9:	48 89 d3             	mov    rbx,rdx
  aeb7cc:	49 89 fe             	mov    r14,rdi
  aeb7cf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  aeb7d6:	00 00 
  aeb7d8:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  aeb7dd:	49 89 e7             	mov    r15,rsp
  aeb7e0:	4c 89 ff             	mov    rdi,r15
  aeb7e3:	e8 7c bb cc 00       	call   17b7364 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b4d0>
  aeb7e8:	49 03 5e 18          	add    rbx,QWORD PTR [r14+0x18]
  aeb7ec:	48 89 df             	mov    rdi,rbx
  aeb7ef:	4c 89 fe             	mov    rsi,r15
  aeb7f2:	e8 37 02 f9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
  aeb7f7:	4c 89 ff             	mov    rdi,r15
  aeb7fa:	e8 91 26 d0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aeb7ff:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  aeb806:	00 00 
  aeb808:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  aeb80d:	75 0a                	jne    aeb819 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x387b9>
  aeb80f:	48 83 c4 20          	add    rsp,0x20
  aeb813:	5b                   	pop    rbx
  aeb814:	41 5e                	pop    r14
  aeb816:	41 5f                	pop    r15
  aeb818:	c3                   	ret
  aeb819:	e8 92 42 d0 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x184da30 +0x28 -> 0x9d7de0
FDE= ('0x9d7de0', '0x9d7de1')
  9d7de0:	c3                   	ret

### AP 0x184da30 +0x30 -> 0xbd7a10
FDE= ('0xbd7a10', '0xbd7a1e')
  bd7a10:	53                   	push   rbx
  bd7a11:	48 89 fb             	mov    rbx,rdi
  bd7a14:	e8 dd 1f c0 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  bd7a19:	48 89 d8             	mov    rax,rbx
  bd7a1c:	5b                   	pop    rbx
  bd7a1d:	c3                   	ret

### AP 0x184da30 +0x38 -> 0x9d7de0
FDE= ('0x9d7de0', '0x9d7de1')
  9d7de0:	c3                   	ret

### AP 0x184da30 +0x68 -> 0xe750be
FDE= ('0xe750be', '0xe750c2')
  e750be:	8a 47 40             	mov    al,BYTE PTR [rdi+0x40]
  e750c1:	c3                   	ret

### AP 0x184cd90 +0x28 -> 0x10b06fc
FDE= ('0x10b06fc', '0x10b0750')
 10b06fc:	55                   	push   rbp
 10b06fd:	53                   	push   rbx
 10b06fe:	50                   	push   rax
 10b06ff:	48 89 fb             	mov    rbx,rdi
 10b0702:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10b0705:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10b0708:	89 c5                	mov    ebp,eax
 10b070a:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
 10b070e:	e8 47 48 db ff       	call   e64f5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c370>
 10b0713:	48 8b bb 90 00 00 00 	mov    rdi,QWORD PTR [rbx+0x90]
 10b071a:	e8 8d 12 71 00       	call   17c19ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175b18>
 10b071f:	84 c0                	test   al,al
 10b0721:	74 0c                	je     10b072f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277b45>
 10b0723:	48 8d bb 88 00 00 00 	lea    rdi,[rbx+0x88]
 10b072a:	e8 09 12 71 00       	call   17c1938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175aa4>
 10b072f:	40 84 ed             	test   bpl,bpl
 10b0732:	74 15                	je     10b0749 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277b5f>
 10b0734:	48 81 c3 a0 00 00 00 	add    rbx,0xa0
 10b073b:	48 89 df             	mov    rdi,rbx
 10b073e:	48 83 c4 08          	add    rsp,0x8
 10b0742:	5b                   	pop    rbx
 10b0743:	5d                   	pop    rbp
 10b0744:	e9 5f 83 a7 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
 10b0749:	48 83 c4 08          	add    rsp,0x8
 10b074d:	5b                   	pop    rbx
 10b074e:	5d                   	pop    rbp
 10b074f:	c3                   	ret

### AP 0x184cd90 +0x30 -> 0x10b133c
FDE= ('0x10b133c', '0x10b1369')
 10b133c:	53                   	push   rbx
 10b133d:	40 38 b7 99 00 00 00 	cmp    BYTE PTR [rdi+0x99],sil
 10b1344:	74 0f                	je     10b1355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27876b>
 10b1346:	48 89 fb             	mov    rbx,rdi
 10b1349:	40 88 b7 99 00 00 00 	mov    BYTE PTR [rdi+0x99],sil
 10b1350:	40 84 f6             	test   sil,sil
 10b1353:	74 02                	je     10b1357 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27876d>
 10b1355:	5b                   	pop    rbx
 10b1356:	c3                   	ret
 10b1357:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 10b135a:	48 89 df             	mov    rdi,rbx
 10b135d:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10b1360:	48 89 df             	mov    rdi,rbx
 10b1363:	5b                   	pop    rbx
 10b1364:	e9 01 00 00 00       	jmp    10b136a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278780>

### AP 0x184cd90 +0x68 -> 0x10b170e
FDE= ('0x10b170e', '0x10b1727')
 10b170e:	0f 18 0d 4b 6a 84 00 	prefetcht0 BYTE PTR [rip+0x846a4b]        # 18f8160 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3f570>
 10b1715:	48 8d 05 44 6a 84 00 	lea    rax,[rip+0x846a44]        # 18f8160 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3f570>
 10b171c:	48 8b 0d 45 6a 84 00 	mov    rcx,QWORD PTR [rip+0x846a45]        # 18f8168 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3f578>
 10b1723:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10b1726:	c3                   	ret

### AP 0x184cd48 +0x28 -> 0x10b0690
FDE= ('0x10b0690', '0x10b06fc')
 10b0690:	41 57                	push   r15
 10b0692:	41 56                	push   r14
 10b0694:	53                   	push   rbx
 10b0695:	48 83 ec 50          	sub    rsp,0x50
 10b0699:	49 89 f6             	mov    r14,rsi
 10b069c:	48 89 fb             	mov    rbx,rdi
 10b069f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b06a6:	00 00 
 10b06a8:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
 10b06ad:	49 81 c6 a0 00 00 00 	add    r14,0xa0
 10b06b4:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
 10b06b9:	4c 89 ff             	mov    rdi,r15
 10b06bc:	48 89 d6             	mov    rsi,rdx
 10b06bf:	e8 16 a0 72 00       	call   17da6da <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x64fb>
 10b06c4:	48 89 df             	mov    rdi,rbx
 10b06c7:	4c 89 f6             	mov    rsi,r14
 10b06ca:	4c 89 fa             	mov    rdx,r15
 10b06cd:	e8 f8 98 72 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
 10b06d2:	4c 89 ff             	mov    rdi,r15
 10b06d5:	e8 0e a1 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10b06da:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b06e1:	00 00 
 10b06e3:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
 10b06e8:	75 0d                	jne    10b06f7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277b0d>
 10b06ea:	48 89 d8             	mov    rax,rbx
 10b06ed:	48 83 c4 50          	add    rsp,0x50
 10b06f1:	5b                   	pop    rbx
 10b06f2:	41 5e                	pop    r14
 10b06f4:	41 5f                	pop    r15
 10b06f6:	c3                   	ret
 10b06f7:	e8 b4 f3 73 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x184cd48 +0x30 -> 0x10b06fc
FDE= ('0x10b06fc', '0x10b0750')
 10b06fc:	55                   	push   rbp
 10b06fd:	53                   	push   rbx
 10b06fe:	50                   	push   rax
 10b06ff:	48 89 fb             	mov    rbx,rdi
 10b0702:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10b0705:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10b0708:	89 c5                	mov    ebp,eax
 10b070a:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
 10b070e:	e8 47 48 db ff       	call   e64f5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c370>
 10b0713:	48 8b bb 90 00 00 00 	mov    rdi,QWORD PTR [rbx+0x90]
 10b071a:	e8 8d 12 71 00       	call   17c19ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175b18>
 10b071f:	84 c0                	test   al,al
 10b0721:	74 0c                	je     10b072f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277b45>
 10b0723:	48 8d bb 88 00 00 00 	lea    rdi,[rbx+0x88]
 10b072a:	e8 09 12 71 00       	call   17c1938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175aa4>
 10b072f:	40 84 ed             	test   bpl,bpl
 10b0732:	74 15                	je     10b0749 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277b5f>
 10b0734:	48 81 c3 a0 00 00 00 	add    rbx,0xa0
 10b073b:	48 89 df             	mov    rdi,rbx
 10b073e:	48 83 c4 08          	add    rsp,0x8
 10b0742:	5b                   	pop    rbx
 10b0743:	5d                   	pop    rbp
 10b0744:	e9 5f 83 a7 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
 10b0749:	48 83 c4 08          	add    rsp,0x8
 10b074d:	5b                   	pop    rbx
 10b074e:	5d                   	pop    rbp
 10b074f:	c3                   	ret

### AP 0x184cd48 +0x68 -> 0x10b127e
FDE= ('0x10b127e', '0x10b133c')
 10b127e:	55                   	push   rbp
 10b127f:	53                   	push   rbx
 10b1280:	48 83 ec 18          	sub    rsp,0x18
 10b1284:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b128b:	00 00 
 10b128d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10b1292:	80 bf 99 00 00 00 00 	cmp    BYTE PTR [rdi+0x99],0x0
 10b1299:	0f 84 81 00 00 00    	je     10b1320 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278736>
 10b129f:	48 89 fb             	mov    rbx,rdi
 10b12a2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10b12a5:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10b12a8:	89 c5                	mov    ebp,eax
 10b12aa:	48 89 df             	mov    rdi,rbx
 10b12ad:	e8 a0 f6 ff ff       	call   10b0952 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277d68>
 10b12b2:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 10b12b5:	48 89 df             	mov    rdi,rbx
 10b12b8:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10b12bb:	84 c0                	test   al,al
 10b12bd:	75 22                	jne    10b12e1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2786f7>
 10b12bf:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
 10b12c3:	e8 7a f7 ff ff       	call   10b0a42 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277e58>
 10b12c8:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
 10b12cd:	48 89 06             	mov    QWORD PTR [rsi],rax
 10b12d0:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
 10b12d4:	e8 77 f7 ff ff       	call   10b0a50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277e66>
 10b12d9:	48 89 df             	mov    rdi,rbx
 10b12dc:	e8 89 00 00 00       	call   10b136a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278780>
 10b12e1:	48 89 df             	mov    rdi,rbx
 10b12e4:	e8 5b 02 00 00       	call   10b1544 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27895a>
 10b12e9:	40 84 ed             	test   bpl,bpl
 10b12ec:	75 32                	jne    10b1320 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278736>
 10b12ee:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 10b12f1:	48 89 df             	mov    rdi,rbx
 10b12f4:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10b12f7:	84 c0                	test   al,al
 10b12f9:	74 25                	je     10b1320 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278736>
 10b12fb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b1302:	00 00 
 10b1304:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
 10b1309:	75 2c                	jne    10b1337 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27874d>
 10b130b:	48 81 c3 a0 00 00 00 	add    rbx,0xa0
 10b1312:	48 89 df             	mov    rdi,rbx
 10b1315:	48 83 c4 18          	add    rsp,0x18
 10b1319:	5b                   	pop    rbx
 10b131a:	5d                   	pop    rbp
 10b131b:	e9 88 77 a7 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
 10b1320:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b1327:	00 00 
 10b1329:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
 10b132e:	75 07                	jne    10b1337 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27874d>
 10b1330:	48 83 c4 18          	add    rsp,0x18
 10b1334:	5b                   	pop    rbx
 10b1335:	5d                   	pop    rbp
 10b1336:	c3                   	ret
 10b1337:	e8 74 e7 73 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x184cbf8 +0x28 -> 0x10afbb8
FDE= ('0x10afbb8', '0x10afc10')
 10afbb8:	41 57                	push   r15
 10afbba:	41 56                	push   r14
 10afbbc:	53                   	push   rbx
 10afbbd:	49 89 f6             	mov    r14,rsi
 10afbc0:	48 89 fb             	mov    rbx,rdi
 10afbc3:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10afbc6:	48 89 f7             	mov    rdi,rsi
 10afbc9:	48 89 d6             	mov    rsi,rdx
 10afbcc:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10afbcf:	84 c0                	test   al,al
 10afbd1:	74 2d                	je     10afc00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277016>
 10afbd3:	49 83 c6 48          	add    r14,0x48
 10afbd7:	4c 8d 3d 4a 87 29 ff 	lea    r15,[rip+0xffffffffff29874a]        # 348328 <_ZTSSt12bad_any_cast@@Base-0x47ea0>
 10afbde:	4c 89 f7             	mov    rdi,r14
 10afbe1:	4c 89 fe             	mov    rsi,r15
 10afbe4:	e8 66 bc 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10afbe9:	48 8d 35 10 bc 2d ff 	lea    rsi,[rip+0xffffffffff2dbc10]        # 38b800 <_ZTSSt12bad_any_cast@@Base-0x49c8>
 10afbf0:	84 c0                	test   al,al
 10afbf2:	49 0f 45 f7          	cmovne rsi,r15
 10afbf6:	48 89 df             	mov    rdi,rbx
 10afbf9:	e8 c0 11 a4 ff       	call   af0dbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3dd5e>
 10afbfe:	eb 07                	jmp    10afc07 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27701d>
 10afc00:	31 c0                	xor    eax,eax
 10afc02:	88 03                	mov    BYTE PTR [rbx],al
 10afc04:	88 43 18             	mov    BYTE PTR [rbx+0x18],al
 10afc07:	48 89 d8             	mov    rax,rbx
 10afc0a:	5b                   	pop    rbx
 10afc0b:	41 5e                	pop    r14
 10afc0d:	41 5f                	pop    r15
 10afc0f:	c3                   	ret

### AP 0x184cbf8 +0x30 -> 0x10afc10
FDE= ('0x10afc10', '0x10afc3a')
 10afc10:	53                   	push   rbx
 10afc11:	48 89 fb             	mov    rbx,rdi
 10afc14:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
 10afc18:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10afc1b:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10afc1e:	48 89 c1             	mov    rcx,rax
 10afc21:	b0 01                	mov    al,0x1
 10afc23:	83 39 03             	cmp    DWORD PTR [rcx],0x3
 10afc26:	74 10                	je     10afc38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27704e>
 10afc28:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
 10afc2c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10afc2f:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10afc32:	83 38 04             	cmp    DWORD PTR [rax],0x4
 10afc35:	0f 94 c0             	sete   al
 10afc38:	5b                   	pop    rbx
 10afc39:	c3                   	ret

### AP 0x184cbf8 +0x38 -> 0x10afc3a
FDE= ('0x10afc3a', '0x10afc98')
 10afc3a:	53                   	push   rbx
 10afc3b:	48 85 d2             	test   rdx,rdx
 10afc3e:	74 56                	je     10afc96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2770ac>
 10afc40:	48 89 fb             	mov    rbx,rdi
 10afc43:	48 89 f7             	mov    rdi,rsi
 10afc46:	48 89 d6             	mov    rsi,rdx
 10afc49:	e8 06 09 00 00       	call   10b0554 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27796a>
 10afc4e:	84 c0                	test   al,al
 10afc50:	74 44                	je     10afc96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2770ac>
 10afc52:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
 10afc56:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10afc59:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10afc5c:	83 38 03             	cmp    DWORD PTR [rax],0x3
 10afc5f:	75 17                	jne    10afc78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27708e>
 10afc61:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
 10afc65:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10afc68:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10afc6b:	84 c0                	test   al,al
 10afc6d:	74 09                	je     10afc78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27708e>
 10afc6f:	c6 83 e8 00 00 00 01 	mov    BYTE PTR [rbx+0xe8],0x1
 10afc76:	eb 1e                	jmp    10afc96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2770ac>
 10afc78:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 10afc7b:	48 89 df             	mov    rdi,rbx
 10afc7e:	ff 50 30             	call   QWORD PTR [rax+0x30]
 10afc81:	84 c0                	test   al,al
 10afc83:	74 11                	je     10afc96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2770ac>
 10afc85:	c6 83 e8 00 00 00 00 	mov    BYTE PTR [rbx+0xe8],0x0
 10afc8c:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
 10afc90:	5b                   	pop    rbx
 10afc91:	e9 ba 0a 00 00       	jmp    10b0750 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277b66>
 10afc96:	5b                   	pop    rbx
 10afc97:	c3                   	ret

### AP 0x184cbf8 +0x68 -> 0x10b01f6
FDE= ('0x10b01f6', '0x10b0218')
 10b01f6:	53                   	push   rbx
 10b01f7:	80 7f 60 00          	cmp    BYTE PTR [rdi+0x60],0x0
 10b01fb:	74 19                	je     10b0216 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27762c>
 10b01fd:	48 89 fb             	mov    rbx,rdi
 10b0200:	48 83 c7 30          	add    rdi,0x30
 10b0204:	e8 e5 f4 9e ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
 10b0209:	84 c0                	test   al,al
 10b020b:	74 09                	je     10b0216 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27762c>
 10b020d:	48 89 df             	mov    rdi,rbx
 10b0210:	5b                   	pop    rbx
 10b0211:	e9 92 02 00 00       	jmp    10b04a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2778be>
 10b0216:	5b                   	pop    rbx
 10b0217:	c3                   	ret

### AP 0x184cc80 +0x28 -> 0x10b0268
FDE= ('0x10b0268', '0x10b0271')
 10b0268:	48 83 c7 f0          	add    rdi,0xfffffffffffffff0
 10b026c:	e9 ab f7 ff ff       	jmp    10afa1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x276e32>

### AP 0x184cc80 +0x30 -> 0x10b0272
FDE= ('0x10b0272', '0x10b027b')
 10b0272:	48 83 c7 f0          	add    rdi,0xfffffffffffffff0
 10b0276:	e9 29 f8 ff ff       	jmp    10afaa4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x276eba>

### AP 0x184cc80 +0x38 -> 0x9d7de0
FDE= ('0x9d7de0', '0x9d7de1')
  9d7de0:	c3                   	ret

### AP 0x184cc80 +0x68 -> 0x10b0286
FDE= ('0x10b0286', '0x10b028f')
 10b0286:	48 83 c7 f0          	add    rdi,0xfffffffffffffff0
 10b028a:	e9 7b fb ff ff       	jmp    10afe0a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277220>

### AP 0x184cca8 +0x28 -> 0x9d7de0
FDE= ('0x9d7de0', '0x9d7de1')
  9d7de0:	c3                   	ret

### AP 0x184cca8 +0x30 -> 0x10b027c
FDE= ('0x10b027c', '0x10b0285')
 10b027c:	48 83 c7 f0          	add    rdi,0xfffffffffffffff0
 10b0280:	e9 13 fa ff ff       	jmp    10afc98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2770ae>

### AP 0x184cca8 +0x38 -> 0x9d7de0
FDE= ('0x9d7de0', '0x9d7de1')
  9d7de0:	c3                   	ret

### AP 0x184cca8 +0x68 -> 0x9d7de0
FDE= ('0x9d7de0', '0x9d7de1')
  9d7de0:	c3                   	ret

### AP 0x184cf10 +0x28 -> 0x9d7de0
FDE= ('0x9d7de0', '0x9d7de1')
  9d7de0:	c3                   	ret

### AP 0x184cf10 +0x30 -> 0x10b17f4
FDE= ('0x10b17f4', '0x10b1f1b')
 10b17f4:	55                   	push   rbp
 10b17f5:	41 57                	push   r15
 10b17f7:	41 56                	push   r14
 10b17f9:	41 55                	push   r13
 10b17fb:	41 54                	push   r12
 10b17fd:	53                   	push   rbx
 10b17fe:	48 81 ec 08 01 00 00 	sub    rsp,0x108
 10b1805:	48 89 cb             	mov    rbx,rcx
 10b1808:	49 89 f6             	mov    r14,rsi
 10b180b:	49 89 fc             	mov    r12,rdi
 10b180e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b1815:	00 00 
 10b1817:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
 10b181e:	00 
 10b181f:	e8 66 09 00 00       	call   10b218a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2795a0>
 10b1824:	84 c0                	test   al,al
 10b1826:	0f 84 45 06 00 00    	je     10b1e71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279287>
 10b182c:	49 8b 74 24 20       	mov    rsi,QWORD PTR [r12+0x20]
 10b1831:	48 8d 93 80 00 00 00 	lea    rdx,[rbx+0x80]
 10b1838:	4c 8d bc 24 ef 00 00 	lea    r15,[rsp+0xef]
 10b183f:	00 
 10b1840:	4c 89 ff             	mov    rdi,r15
 10b1843:	e8 c8 c4 39 00       	call   144dd10 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x293294>
 10b1848:	41 80 7f 10 00       	cmp    BYTE PTR [r15+0x10],0x0
 10b184d:	0f 84 1e 06 00 00    	je     10b1e71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279287>
 10b1853:	49 8d 6e 18          	lea    rbp,[r14+0x18]
 10b1857:	48 8d 43 50          	lea    rax,[rbx+0x50]
 10b185b:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
 10b1860:	4d 8d 6c 24 28       	lea    r13,[r12+0x28]
 10b1865:	4c 89 ef             	mov    rdi,r13
 10b1868:	48 89 ee             	mov    rsi,rbp
 10b186b:	e8 e8 d7 ff ff       	call   10af058 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27646e>
 10b1870:	49 89 c7             	mov    r15,rax
 10b1873:	48 85 c0             	test   rax,rax
 10b1876:	0f 85 5f 05 00 00    	jne    10b1ddb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2791f1>
 10b187c:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
 10b1881:	49 8b 74 24 18       	mov    rsi,QWORD PTR [r12+0x18]
 10b1886:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10b1889:	4c 8d 7c 24 38       	lea    r15,[rsp+0x38]
 10b188e:	4c 89 ff             	mov    rdi,r15
 10b1891:	4c 89 f2             	mov    rdx,r14
 10b1894:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10b1897:	41 80 7f 18 00       	cmp    BYTE PTR [r15+0x18],0x0
 10b189c:	0f 84 85 00 00 00    	je     10b1927 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278d3d>
 10b18a2:	48 8d 44 24 78       	lea    rax,[rsp+0x78]
 10b18a7:	0f 57 c0             	xorps  xmm0,xmm0
 10b18aa:	48 83 60 18 00       	and    QWORD PTR [rax+0x18],0x0
 10b18af:	0f 29 40 08          	movaps XMMWORD PTR [rax+0x8],xmm0
 10b18b3:	0f 29 40 f8          	movaps XMMWORD PTR [rax-0x8],xmm0
 10b18b7:	c7 40 20 00 00 80 3f 	mov    DWORD PTR [rax+0x20],0x3f800000
 10b18be:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
 10b18c5:	00 
 10b18c6:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
 10b18cb:	e8 70 c6 73 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 10b18d0:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
 10b18d7:	00 
 10b18d8:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
 10b18dd:	e8 5e c6 73 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 10b18e2:	0f 10 84 24 ef 00 00 	movups xmm0,XMMWORD PTR [rsp+0xef]
 10b18e9:	00 
 10b18ea:	0f 29 84 24 d0 00 00 	movaps XMMWORD PTR [rsp+0xd0],xmm0
 10b18f1:	00 
 10b18f2:	48 89 ef             	mov    rdi,rbp
 10b18f5:	e8 4a d8 ff ff       	call   10af144 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27655a>
 10b18fa:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10b18ff:	4d 8b 6c 24 30       	mov    r13,QWORD PTR [r12+0x30]
 10b1904:	4d 85 ed             	test   r13,r13
 10b1907:	74 2d                	je     10b1936 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278d4c>
 10b1909:	f3 49 0f b8 cd       	popcnt rcx,r13
 10b190e:	48 89 c8             	mov    rax,rcx
 10b1911:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx
 10b1916:	48 83 f9 01          	cmp    rcx,0x1
 10b191a:	77 1f                	ja     10b193b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278d51>
 10b191c:	49 8d 55 ff          	lea    rdx,[r13-0x1]
 10b1920:	48 23 54 24 10       	and    rdx,QWORD PTR [rsp+0x10]
 10b1925:	eb 2b                	jmp    10b1952 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278d68>
 10b1927:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
 10b192c:	e8 ff 53 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10b1931:	e9 3b 05 00 00       	jmp    10b1e71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279287>
 10b1936:	e9 88 00 00 00       	jmp    10b19c3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278dd9>
 10b193b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 10b1940:	48 89 c2             	mov    rdx,rax
 10b1943:	4c 39 e8             	cmp    rax,r13
 10b1946:	72 0a                	jb     10b1952 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278d68>
 10b1948:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 10b194d:	31 d2                	xor    edx,edx
 10b194f:	49 f7 f5             	div    r13
 10b1952:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 10b1957:	48 8b 00             	mov    rax,QWORD PTR [rax]
 10b195a:	48 89 54 24 20       	mov    QWORD PTR [rsp+0x20],rdx
 10b195f:	48 8b 04 d0          	mov    rax,QWORD PTR [rax+rdx*8]
 10b1963:	48 85 c0             	test   rax,rax
 10b1966:	74 5b                	je     10b19c3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278dd9>
 10b1968:	4c 8b 38             	mov    r15,QWORD PTR [rax]
 10b196b:	4d 85 ff             	test   r15,r15
 10b196e:	74 53                	je     10b19c3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278dd9>
 10b1970:	49 8d 45 ff          	lea    rax,[r13-0x1]
 10b1974:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 10b1979:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
 10b197d:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
 10b1982:	75 15                	jne    10b1999 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278daf>
 10b1984:	49 8d 7f 10          	lea    rdi,[r15+0x10]
 10b1988:	48 89 ee             	mov    rsi,rbp
 10b198b:	e8 3c d8 ff ff       	call   10af1cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2765e2>
 10b1990:	84 c0                	test   al,al
 10b1992:	74 27                	je     10b19bb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278dd1>
 10b1994:	e9 2e 04 00 00       	jmp    10b1dc7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2791dd>
 10b1999:	83 7c 24 18 01       	cmp    DWORD PTR [rsp+0x18],0x1
 10b199e:	77 07                	ja     10b19a7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278dbd>
 10b19a0:	48 23 44 24 30       	and    rax,QWORD PTR [rsp+0x30]
 10b19a5:	eb 0d                	jmp    10b19b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278dca>
 10b19a7:	4c 39 e8             	cmp    rax,r13
 10b19aa:	72 08                	jb     10b19b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278dca>
 10b19ac:	31 d2                	xor    edx,edx
 10b19ae:	49 f7 f5             	div    r13
 10b19b1:	48 89 d0             	mov    rax,rdx
 10b19b4:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 10b19b9:	75 08                	jne    10b19c3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278dd9>
 10b19bb:	4d 8b 3f             	mov    r15,QWORD PTR [r15]
 10b19be:	4d 85 ff             	test   r15,r15
 10b19c1:	75 b6                	jne    10b1979 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278d8f>
 10b19c3:	bf c0 00 00 00       	mov    edi,0xc0
 10b19c8:	e8 33 c5 73 00       	call   17edf00 <_Znwm@plt>
 10b19cd:	49 89 c7             	mov    r15,rax
 10b19d0:	49 8d 44 24 38       	lea    rax,[r12+0x38]
 10b19d5:	4c 89 7c 24 58       	mov    QWORD PTR [rsp+0x58],r15
 10b19da:	49 83 27 00          	and    QWORD PTR [r15],0x0
 10b19de:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 10b19e3:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
 10b19e8:	c6 44 24 68 00       	mov    BYTE PTR [rsp+0x68],0x0
 10b19ed:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 10b19f2:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
 10b19f6:	49 8d 7f 10          	lea    rdi,[r15+0x10]
 10b19fa:	48 89 ee             	mov    rsi,rbp
 10b19fd:	e8 f8 da ff ff       	call   10af4fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x276910>
 10b1a02:	48 8d ac 24 d0 00 00 	lea    rbp,[rsp+0xd0]
 10b1a09:	00 
 10b1a0a:	48 8b 45 a0          	mov    rax,QWORD PTR [rbp-0x60]
 10b1a0e:	49 89 47 50          	mov    QWORD PTR [r15+0x50],rax
 10b1a12:	4c 89 ff             	mov    rdi,r15
 10b1a15:	48 83 c7 58          	add    rdi,0x58
 10b1a19:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
 10b1a1e:	e8 19 d6 a8 ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
 10b1a23:	48 8d 8c 24 a0 00 00 	lea    rcx,[rsp+0xa0]
 10b1a2a:	00 
 10b1a2b:	48 8b 41 10          	mov    rax,QWORD PTR [rcx+0x10]
 10b1a2f:	49 89 87 90 00 00 00 	mov    QWORD PTR [r15+0x90],rax
 10b1a36:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
 10b1a39:	41 0f 11 87 80 00 00 	movups XMMWORD PTR [r15+0x80],xmm0
 10b1a40:	00 
 10b1a41:	0f 57 c0             	xorps  xmm0,xmm0
 10b1a44:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
 10b1a47:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
 10b1a4c:	48 8d 8c 24 b8 00 00 	lea    rcx,[rsp+0xb8]
 10b1a53:	00 
 10b1a54:	48 8b 41 10          	mov    rax,QWORD PTR [rcx+0x10]
 10b1a58:	49 89 87 a8 00 00 00 	mov    QWORD PTR [r15+0xa8],rax
 10b1a5f:	0f 10 09             	movups xmm1,XMMWORD PTR [rcx]
 10b1a62:	41 0f 11 8f 98 00 00 	movups XMMWORD PTR [r15+0x98],xmm1
 10b1a69:	00 
 10b1a6a:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
 10b1a6d:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
 10b1a72:	0f 10 45 00          	movups xmm0,XMMWORD PTR [rbp+0x0]
 10b1a76:	41 0f 11 87 b0 00 00 	movups XMMWORD PTR [r15+0xb0],xmm0
 10b1a7d:	00 
 10b1a7e:	c6 44 24 68 01       	mov    BYTE PTR [rsp+0x68],0x1
 10b1a83:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]
 10b1a88:	48 ff c0             	inc    rax
 10b1a8b:	78 07                	js     10b1a94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278eaa>
 10b1a8d:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
 10b1a92:	eb 15                	jmp    10b1aa9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278ebf>
 10b1a94:	48 89 c1             	mov    rcx,rax
 10b1a97:	48 d1 e9             	shr    rcx,1
 10b1a9a:	83 e0 01             	and    eax,0x1
 10b1a9d:	48 09 c8             	or     rax,rcx
 10b1aa0:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
 10b1aa5:	f3 0f 58 c0          	addss  xmm0,xmm0
 10b1aa9:	48 8b 54 24 20       	mov    rdx,QWORD PTR [rsp+0x20]
 10b1aae:	4c 89 e9             	mov    rcx,r13
 10b1ab1:	48 d1 e9             	shr    rcx,1
 10b1ab4:	44 89 e8             	mov    eax,r13d
 10b1ab7:	83 e0 01             	and    eax,0x1
 10b1aba:	48 09 c8             	or     rax,rcx
 10b1abd:	4d 85 ed             	test   r13,r13
 10b1ac0:	78 07                	js     10b1ac9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278edf>
 10b1ac2:	f3 49 0f 2a d5       	cvtsi2ss xmm2,r13
 10b1ac7:	eb 09                	jmp    10b1ad2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278ee8>
 10b1ac9:	f3 48 0f 2a d0       	cvtsi2ss xmm2,rax
 10b1ace:	f3 0f 58 d2          	addss  xmm2,xmm2
 10b1ad2:	f3 41 0f 10 4c 24 48 	movss  xmm1,DWORD PTR [r12+0x48]
 10b1ad9:	74 0d                	je     10b1ae8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278efe>
 10b1adb:	f3 0f 59 d1          	mulss  xmm2,xmm1
 10b1adf:	0f 2e c2             	ucomiss xmm0,xmm2
 10b1ae2:	0f 86 63 02 00 00    	jbe    10b1d4b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279161>
 10b1ae8:	49 83 fd 03          	cmp    r13,0x3
 10b1aec:	0f 92 c0             	setb   al
 10b1aef:	49 8d 4d ff          	lea    rcx,[r13-0x1]
 10b1af3:	49 85 cd             	test   r13,rcx
 10b1af6:	0f 95 c1             	setne  cl
 10b1af9:	08 c1                	or     cl,al
 10b1afb:	0f b6 c1             	movzx  eax,cl
 10b1afe:	4a 8d 04 68          	lea    rax,[rax+r13*2]
 10b1b02:	f3 0f 5e c1          	divss  xmm0,xmm1
 10b1b06:	66 0f 3a 0a c0 0a    	roundss xmm0,xmm0,0xa
 10b1b0c:	f3 48 0f 2c c8       	cvttss2si rcx,xmm0
 10b1b11:	48 89 ca             	mov    rdx,rcx
 10b1b14:	f3 0f 5c 05 00 cd 2d 	subss  xmm0,DWORD PTR [rip+0xffffffffff2dcd00]        # 38e81c <_ZTSSt12bad_any_cast@@Base-0x19ac>
 10b1b1b:	ff 
 10b1b1c:	f3 48 0f 2c e8       	cvttss2si rbp,xmm0
 10b1b21:	48 c1 fa 3f          	sar    rdx,0x3f
 10b1b25:	48 21 d5             	and    rbp,rdx
 10b1b28:	48 09 cd             	or     rbp,rcx
 10b1b2b:	48 39 e8             	cmp    rax,rbp
 10b1b2e:	48 0f 47 e8          	cmova  rbp,rax
 10b1b32:	48 83 fd 01          	cmp    rbp,0x1
 10b1b36:	75 05                	jne    10b1b3d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278f53>
 10b1b38:	6a 02                	push   0x2
 10b1b3a:	5d                   	pop    rbp
 10b1b3b:	eb 14                	jmp    10b1b51 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278f67>
 10b1b3d:	48 8d 45 ff          	lea    rax,[rbp-0x1]
 10b1b41:	48 85 c5             	test   rbp,rax
 10b1b44:	74 0b                	je     10b1b51 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278f67>
 10b1b46:	48 89 ef             	mov    rdi,rbp
 10b1b49:	e8 92 c4 73 00       	call   17edfe0 <_ZNSt6__ndk112__next_primeEm@plt>
 10b1b4e:	48 89 c5             	mov    rbp,rax
 10b1b51:	4d 8b 6c 24 30       	mov    r13,QWORD PTR [r12+0x30]
 10b1b56:	4c 39 ed             	cmp    rbp,r13
 10b1b59:	76 6e                	jbe    10b1bc9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278fdf>
 10b1b5b:	49 89 ef             	mov    r15,rbp
 10b1b5e:	4c 89 f8             	mov    rax,r15
 10b1b61:	48 c1 e8 3d          	shr    rax,0x3d
 10b1b65:	0f 85 2f 03 00 00    	jne    10b1e9a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2792b0>
 10b1b6b:	4a 8d 3c fd 00 00 00 	lea    rdi,[r15*8+0x0]
 10b1b72:	00 
 10b1b73:	e8 88 c3 73 00       	call   17edf00 <_Znwm@plt>
 10b1b78:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
 10b1b7d:	4c 89 ef             	mov    rdi,r13
 10b1b80:	48 89 c6             	mov    rsi,rax
 10b1b83:	e8 0e dc 9e ff       	call   a9f796 <JNI_OnUnload@@Base+0x27063>
 10b1b88:	4d 89 7c 24 30       	mov    QWORD PTR [r12+0x30],r15
 10b1b8d:	31 c0                	xor    eax,eax
 10b1b8f:	49 8b 4d 00          	mov    rcx,QWORD PTR [r13+0x0]
 10b1b93:	48 83 24 c1 00       	and    QWORD PTR [rcx+rax*8],0x0
 10b1b98:	48 ff c0             	inc    rax
 10b1b9b:	49 39 c7             	cmp    r15,rax
 10b1b9e:	75 ef                	jne    10b1b8f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278fa5>
 10b1ba0:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 10b1ba5:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10b1ba8:	48 85 ff             	test   rdi,rdi
 10b1bab:	0f 84 70 01 00 00    	je     10b1d21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279137>
 10b1bb1:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]
 10b1bb5:	f3 49 0f b8 f7       	popcnt rsi,r15
 10b1bba:	48 83 fe 01          	cmp    rsi,0x1
 10b1bbe:	77 27                	ja     10b1be7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278ffd>
 10b1bc0:	49 8d 47 ff          	lea    rax,[r15-0x1]
 10b1bc4:	48 21 c1             	and    rcx,rax
 10b1bc7:	eb 2e                	jmp    10b1bf7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27900d>
 10b1bc9:	0f 83 52 01 00 00    	jae    10b1d21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279137>
 10b1bcf:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]
 10b1bd4:	48 85 c0             	test   rax,rax
 10b1bd7:	0f 88 a6 00 00 00    	js     10b1c83 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279099>
 10b1bdd:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
 10b1be2:	e9 b1 00 00 00       	jmp    10b1c98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2790ae>
 10b1be7:	4c 39 f9             	cmp    rcx,r15
 10b1bea:	72 0b                	jb     10b1bf7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27900d>
 10b1bec:	48 89 c8             	mov    rax,rcx
 10b1bef:	31 d2                	xor    edx,edx
 10b1bf1:	49 f7 f7             	div    r15
 10b1bf4:	48 89 d1             	mov    rcx,rdx
 10b1bf7:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 10b1bfc:	48 8b 00             	mov    rax,QWORD PTR [rax]
 10b1bff:	48 8b 54 24 18       	mov    rdx,QWORD PTR [rsp+0x18]
 10b1c04:	48 89 14 c8          	mov    QWORD PTR [rax+rcx*8],rdx
 10b1c08:	4c 8b 07             	mov    r8,QWORD PTR [rdi]
 10b1c0b:	4d 85 c0             	test   r8,r8
 10b1c0e:	0f 84 0d 01 00 00    	je     10b1d21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279137>
 10b1c14:	4d 8d 4f ff          	lea    r9,[r15-0x1]
 10b1c18:	4c 8b 54 24 08       	mov    r10,QWORD PTR [rsp+0x8]
 10b1c1d:	49 8b 40 08          	mov    rax,QWORD PTR [r8+0x8]
 10b1c21:	83 fe 01             	cmp    esi,0x1
 10b1c24:	77 05                	ja     10b1c2b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279041>
 10b1c26:	4c 21 c8             	and    rax,r9
 10b1c29:	eb 0d                	jmp    10b1c38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27904e>
 10b1c2b:	4c 39 f8             	cmp    rax,r15
 10b1c2e:	72 08                	jb     10b1c38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27904e>
 10b1c30:	31 d2                	xor    edx,edx
 10b1c32:	49 f7 f7             	div    r15
 10b1c35:	48 89 d0             	mov    rax,rdx
 10b1c38:	48 39 c8             	cmp    rax,rcx
 10b1c3b:	74 2a                	je     10b1c67 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27907d>
 10b1c3d:	49 8b 12             	mov    rdx,QWORD PTR [r10]
 10b1c40:	48 83 3c c2 00       	cmp    QWORD PTR [rdx+rax*8],0x0
 10b1c45:	74 36                	je     10b1c7d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279093>
 10b1c47:	49 8b 10             	mov    rdx,QWORD PTR [r8]
 10b1c4a:	48 89 17             	mov    QWORD PTR [rdi],rdx
 10b1c4d:	49 8b 12             	mov    rdx,QWORD PTR [r10]
 10b1c50:	48 8b 14 c2          	mov    rdx,QWORD PTR [rdx+rax*8]
 10b1c54:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
 10b1c57:	49 89 10             	mov    QWORD PTR [r8],rdx
 10b1c5a:	49 8b 12             	mov    rdx,QWORD PTR [r10]
 10b1c5d:	48 8b 04 c2          	mov    rax,QWORD PTR [rdx+rax*8]
 10b1c61:	4c 89 00             	mov    QWORD PTR [rax],r8
 10b1c64:	49 89 f8             	mov    r8,rdi
 10b1c67:	48 89 c8             	mov    rax,rcx
 10b1c6a:	4c 89 c7             	mov    rdi,r8
 10b1c6d:	4d 8b 00             	mov    r8,QWORD PTR [r8]
 10b1c70:	48 89 c1             	mov    rcx,rax
 10b1c73:	4d 85 c0             	test   r8,r8
 10b1c76:	75 a5                	jne    10b1c1d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279033>
 10b1c78:	e9 a4 00 00 00       	jmp    10b1d21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279137>
 10b1c7d:	48 89 3c c2          	mov    QWORD PTR [rdx+rax*8],rdi
 10b1c81:	eb e7                	jmp    10b1c6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279080>
 10b1c83:	48 89 c1             	mov    rcx,rax
 10b1c86:	48 d1 e9             	shr    rcx,1
 10b1c89:	83 e0 01             	and    eax,0x1
 10b1c8c:	48 09 c8             	or     rax,rcx
 10b1c8f:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
 10b1c94:	f3 0f 58 c0          	addss  xmm0,xmm0
 10b1c98:	f3 41 0f 5e 44 24 48 	divss  xmm0,DWORD PTR [r12+0x48]
 10b1c9f:	66 0f 3a 0a c0 0a    	roundss xmm0,xmm0,0xa
 10b1ca5:	f3 48 0f 2c c0       	cvttss2si rax,xmm0
 10b1caa:	48 89 c1             	mov    rcx,rax
 10b1cad:	f3 0f 5c 05 67 cb 2d 	subss  xmm0,DWORD PTR [rip+0xffffffffff2dcb67]        # 38e81c <_ZTSSt12bad_any_cast@@Base-0x19ac>
 10b1cb4:	ff 
 10b1cb5:	f3 48 0f 2c f8       	cvttss2si rdi,xmm0
 10b1cba:	48 c1 f9 3f          	sar    rcx,0x3f
 10b1cbe:	48 21 cf             	and    rdi,rcx
 10b1cc1:	48 09 c7             	or     rdi,rax
 10b1cc4:	49 83 fd 03          	cmp    r13,0x3
 10b1cc8:	72 28                	jb     10b1cf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279108>
 10b1cca:	f3 49 0f b8 c5       	popcnt rax,r13
 10b1ccf:	83 f8 01             	cmp    eax,0x1
 10b1cd2:	77 1e                	ja     10b1cf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279108>
 10b1cd4:	48 8d 47 ff          	lea    rax,[rdi-0x1]
 10b1cd8:	48 0f bd c8          	bsr    rcx,rax
 10b1cdc:	83 f1 3f             	xor    ecx,0x3f
 10b1cdf:	f6 d9                	neg    cl
 10b1ce1:	6a 01                	push   0x1
 10b1ce3:	41 5f                	pop    r15
 10b1ce5:	49 d3 e7             	shl    r15,cl
 10b1ce8:	48 83 ff 02          	cmp    rdi,0x2
 10b1cec:	4c 0f 42 ff          	cmovb  r15,rdi
 10b1cf0:	eb 08                	jmp    10b1cfa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279110>
 10b1cf2:	e8 e9 c2 73 00       	call   17edfe0 <_ZNSt6__ndk112__next_primeEm@plt>
 10b1cf7:	49 89 c7             	mov    r15,rax
 10b1cfa:	4c 39 fd             	cmp    rbp,r15
 10b1cfd:	4c 0f 47 fd          	cmova  r15,rbp
 10b1d01:	4d 39 ef             	cmp    r15,r13
 10b1d04:	73 1b                	jae    10b1d21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279137>
 10b1d06:	4d 85 ff             	test   r15,r15
 10b1d09:	0f 85 4f fe ff ff    	jne    10b1b5e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278f74>
 10b1d0f:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 10b1d14:	31 f6                	xor    esi,esi
 10b1d16:	e8 7b da 9e ff       	call   a9f796 <JNI_OnUnload@@Base+0x27063>
 10b1d1b:	49 83 64 24 30 00    	and    QWORD PTR [r12+0x30],0x0
 10b1d21:	4d 8b 6c 24 30       	mov    r13,QWORD PTR [r12+0x30]
 10b1d26:	49 8d 45 ff          	lea    rax,[r13-0x1]
 10b1d2a:	49 85 c5             	test   r13,rax
 10b1d2d:	75 0a                	jne    10b1d39 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27914f>
 10b1d2f:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
 10b1d34:	48 21 c2             	and    rdx,rax
 10b1d37:	eb 12                	jmp    10b1d4b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279161>
 10b1d39:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
 10b1d3e:	4c 39 ea             	cmp    rdx,r13
 10b1d41:	72 08                	jb     10b1d4b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279161>
 10b1d43:	48 89 d0             	mov    rax,rdx
 10b1d46:	31 d2                	xor    edx,edx
 10b1d48:	49 f7 f5             	div    r13
 10b1d4b:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
 10b1d50:	48 8b 01             	mov    rax,QWORD PTR [rcx]
 10b1d53:	48 8b 04 d0          	mov    rax,QWORD PTR [rax+rdx*8]
 10b1d57:	4c 8b 7c 24 58       	mov    r15,QWORD PTR [rsp+0x58]
 10b1d5c:	48 85 c0             	test   rax,rax
 10b1d5f:	74 08                	je     10b1d69 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27917f>
 10b1d61:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 10b1d64:	49 89 0f             	mov    QWORD PTR [r15],rcx
 10b1d67:	eb 48                	jmp    10b1db1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2791c7>
 10b1d69:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
 10b1d6e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10b1d71:	49 89 07             	mov    QWORD PTR [r15],rax
 10b1d74:	4c 89 3e             	mov    QWORD PTR [rsi],r15
 10b1d77:	48 8b 01             	mov    rax,QWORD PTR [rcx]
 10b1d7a:	48 89 34 d0          	mov    QWORD PTR [rax+rdx*8],rsi
 10b1d7e:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10b1d81:	48 85 c0             	test   rax,rax
 10b1d84:	74 2e                	je     10b1db4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2791ca>
 10b1d86:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
 10b1d8a:	49 8d 4d ff          	lea    rcx,[r13-0x1]
 10b1d8e:	49 85 cd             	test   r13,rcx
 10b1d91:	75 05                	jne    10b1d98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2791ae>
 10b1d93:	48 21 c8             	and    rax,rcx
 10b1d96:	eb 0d                	jmp    10b1da5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2791bb>
 10b1d98:	4c 39 e8             	cmp    rax,r13
 10b1d9b:	72 08                	jb     10b1da5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2791bb>
 10b1d9d:	31 d2                	xor    edx,edx
 10b1d9f:	49 f7 f5             	div    r13
 10b1da2:	48 89 d0             	mov    rax,rdx
 10b1da5:	48 c1 e0 03          	shl    rax,0x3
 10b1da9:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
 10b1dae:	48 03 01             	add    rax,QWORD PTR [rcx]
 10b1db1:	4c 89 38             	mov    QWORD PTR [rax],r15
 10b1db4:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
 10b1db9:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 10b1dbd:	49 ff 44 24 40       	inc    QWORD PTR [r12+0x40]
 10b1dc2:	e8 b9 06 00 00       	call   10b2480 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279896>
 10b1dc7:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
 10b1dcc:	e8 47 05 00 00       	call   10b2318 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27972e>
 10b1dd1:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
 10b1dd6:	e8 55 4f 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10b1ddb:	4d 8d af b0 00 00 00 	lea    r13,[r15+0xb0]
 10b1de2:	48 8d b4 24 ef 00 00 	lea    rsi,[rsp+0xef]
 10b1de9:	00 
 10b1dea:	4c 89 ef             	mov    rdi,r13
 10b1ded:	e8 30 8e ad ff       	call   b8ac22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7bc2>
 10b1df2:	84 c0                	test   al,al
 10b1df4:	75 65                	jne    10b1e5b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279271>
 10b1df6:	49 8d 77 50          	lea    rsi,[r15+0x50]
 10b1dfa:	4c 89 e7             	mov    rdi,r12
 10b1dfd:	e8 3a 05 00 00       	call   10b233c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279752>
 10b1e02:	49 83 67 50 00       	and    QWORD PTR [r15+0x50],0x0
 10b1e07:	49 83 7f 70 00       	cmp    QWORD PTR [r15+0x70],0x0
 10b1e0c:	74 2f                	je     10b1e3d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279253>
 10b1e0e:	49 8b 7f 68          	mov    rdi,QWORD PTR [r15+0x68]
 10b1e12:	e8 3f 07 a3 ff       	call   ae2556 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f4f6>
 10b1e17:	49 83 67 68 00       	and    QWORD PTR [r15+0x68],0x0
 10b1e1c:	49 8b 47 60          	mov    rax,QWORD PTR [r15+0x60]
 10b1e20:	48 85 c0             	test   rax,rax
 10b1e23:	74 13                	je     10b1e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27924e>
 10b1e25:	31 c9                	xor    ecx,ecx
 10b1e27:	49 8b 57 58          	mov    rdx,QWORD PTR [r15+0x58]
 10b1e2b:	48 83 24 ca 00       	and    QWORD PTR [rdx+rcx*8],0x0
 10b1e30:	48 ff c1             	inc    rcx
 10b1e33:	48 39 c8             	cmp    rax,rcx
 10b1e36:	75 ef                	jne    10b1e27 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27923d>
 10b1e38:	49 83 67 70 00       	and    QWORD PTR [r15+0x70],0x0
 10b1e3d:	49 8d bf 80 00 00 00 	lea    rdi,[r15+0x80]
 10b1e44:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
 10b1e49:	e8 32 c2 73 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 10b1e4e:	0f 10 84 24 ef 00 00 	movups xmm0,XMMWORD PTR [rsp+0xef]
 10b1e55:	00 
 10b1e56:	41 0f 11 45 00       	movups XMMWORD PTR [r13+0x0],xmm0
 10b1e5b:	49 83 c7 58          	add    r15,0x58
 10b1e5f:	4c 89 ff             	mov    rdi,r15
 10b1e62:	4c 89 f6             	mov    rsi,r14
 10b1e65:	e8 c0 d6 ff ff       	call   10af52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x276940>
 10b1e6a:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
 10b1e6e:	48 89 08             	mov    QWORD PTR [rax],rcx
 10b1e71:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b1e78:	00 00 
 10b1e7a:	48 3b 84 24 00 01 00 	cmp    rax,QWORD PTR [rsp+0x100]
 10b1e81:	00 
 10b1e82:	0f 85 8e 00 00 00    	jne    10b1f16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27932c>
 10b1e88:	48 81 c4 08 01 00 00 	add    rsp,0x108
 10b1e8f:	5b                   	pop    rbx
 10b1e90:	41 5c                	pop    r12
 10b1e92:	41 5d                	pop    r13
 10b1e94:	41 5e                	pop    r14
 10b1e96:	41 5f                	pop    r15
 10b1e98:	5d                   	pop    rbp
 10b1e99:	c3                   	ret
 10b1e9a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b1ea1:	00 00 
 10b1ea3:	48 3b 84 24 00 01 00 	cmp    rax,QWORD PTR [rsp+0x100]
 10b1eaa:	00 
 10b1eab:	75 69                	jne    10b1f16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27932c>
 10b1ead:	e8 2d 98 9c ff       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>
 10b1eb2:	eb 00                	jmp    10b1eb4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2792ca>
 10b1eb4:	48 89 c3             	mov    rbx,rax
 10b1eb7:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
 10b1ebc:	e8 bf 05 00 00       	call   10b2480 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279896>
 10b1ec1:	eb 03                	jmp    10b1ec6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2792dc>
 10b1ec3:	48 89 c3             	mov    rbx,rax
 10b1ec6:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
 10b1ecb:	e8 48 04 00 00       	call   10b2318 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27972e>
 10b1ed0:	eb 1f                	jmp    10b1ef1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279307>
 10b1ed2:	48 89 c3             	mov    rbx,rax
 10b1ed5:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
 10b1edc:	00 
 10b1edd:	e8 ae bf 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10b1ee2:	eb 03                	jmp    10b1ee7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2792fd>
 10b1ee4:	48 89 c3             	mov    rbx,rax
 10b1ee7:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
 10b1eec:	e8 c1 c5 ff ff       	call   10ae4b2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2758c8>
 10b1ef1:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
 10b1ef6:	e8 35 4e 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10b1efb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b1f02:	00 00 
 10b1f04:	48 3b 84 24 00 01 00 	cmp    rax,QWORD PTR [rsp+0x100]
 10b1f0b:	00 
 10b1f0c:	75 08                	jne    10b1f16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27932c>
 10b1f0e:	48 89 df             	mov    rdi,rbx
 10b1f11:	e8 ba dd 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10b1f16:	e8 95 db 73 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x184cf10 +0x38 -> 0x9d7de0
FDE= ('0x9d7de0', '0x9d7de1')
  9d7de0:	c3                   	ret

### AP 0x184cf10 +0x68 -> 0x9d7de0
FDE= ('0x9d7de0', '0x9d7de1')
  9d7de0:	c3                   	ret

### AP 0x184cfc0 +0x28 -> 0x10b24a8
FDE= ('0x10b24a8', '0x10b297b')
 10b24a8:	55                   	push   rbp
 10b24a9:	41 57                	push   r15
 10b24ab:	41 56                	push   r14
 10b24ad:	41 55                	push   r13
 10b24af:	41 54                	push   r12
 10b24b1:	53                   	push   rbx
 10b24b2:	48 81 ec 68 01 00 00 	sub    rsp,0x168
 10b24b9:	49 89 cc             	mov    r12,rcx
 10b24bc:	48 89 fb             	mov    rbx,rdi
 10b24bf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b24c6:	00 00 
 10b24c8:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
 10b24cf:	00 
 10b24d0:	80 7a 60 00          	cmp    BYTE PTR [rdx+0x60],0x0
 10b24d4:	74 63                	je     10b2539 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27994f>
 10b24d6:	49 89 d5             	mov    r13,rdx
 10b24d9:	48 8b 42 48          	mov    rax,QWORD PTR [rdx+0x48]
 10b24dd:	48 8b 4a 50          	mov    rcx,QWORD PTR [rdx+0x50]
 10b24e1:	48 29 c1             	sub    rcx,rax
 10b24e4:	48 83 f9 68          	cmp    rcx,0x68
 10b24e8:	75 4f                	jne    10b2539 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27994f>
 10b24ea:	48 8d 48 30          	lea    rcx,[rax+0x30]
 10b24ee:	80 78 48 00          	cmp    BYTE PTR [rax+0x48],0x0
 10b24f2:	48 8d 15 8f cb 38 ff 	lea    rdx,[rip+0xffffffffff38cb8f]        # 43f088 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4c94>
 10b24f9:	48 0f 45 d1          	cmovne rdx,rcx
 10b24fd:	48 8b 42 08          	mov    rax,QWORD PTR [rdx+0x8]
 10b2501:	48 2b 02             	sub    rax,QWORD PTR [rdx]
 10b2504:	6a 48                	push   0x48
 10b2506:	59                   	pop    rcx
 10b2507:	48 99                	cqo
 10b2509:	48 f7 f9             	idiv   rcx
 10b250c:	48 89 c5             	mov    rbp,rax
 10b250f:	83 ed 0f             	sub    ebp,0xf
 10b2512:	7c 7f                	jl     10b2593 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2799a9>
 10b2514:	0f 57 c0             	xorps  xmm0,xmm0
 10b2517:	48 8d b4 24 c0 00 00 	lea    rsi,[rsp+0xc0]
 10b251e:	00 
 10b251f:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
 10b2522:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 10b2527:	4c 89 e7             	mov    rdi,r12
 10b252a:	e8 b5 04 00 00       	call   10b29e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279dfa>
 10b252f:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
 10b2536:	00 
 10b2537:	eb 23                	jmp    10b255c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279972>
 10b2539:	0f 57 c0             	xorps  xmm0,xmm0
 10b253c:	48 8d b4 24 e0 00 00 	lea    rsi,[rsp+0xe0]
 10b2543:	00 
 10b2544:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
 10b2547:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 10b254c:	4c 89 e7             	mov    rdi,r12
 10b254f:	e8 90 04 00 00       	call   10b29e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279dfa>
 10b2554:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
 10b255b:	00 
 10b255c:	e8 f9 26 e1 ff       	call   ec4c5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c070>
 10b2561:	0f 57 c0             	xorps  xmm0,xmm0
 10b2564:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 10b2567:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b256e:	00 00 
 10b2570:	48 3b 84 24 60 01 00 	cmp    rax,QWORD PTR [rsp+0x160]
 10b2577:	00 
 10b2578:	0f 85 f8 03 00 00    	jne    10b2976 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279d8c>
 10b257e:	48 89 d8             	mov    rax,rbx
 10b2581:	48 81 c4 68 01 00 00 	add    rsp,0x168
 10b2588:	5b                   	pop    rbx
 10b2589:	41 5c                	pop    r12
 10b258b:	41 5d                	pop    r13
 10b258d:	41 5e                	pop    r14
 10b258f:	41 5f                	pop    r15
 10b2591:	5d                   	pop    rbp
 10b2592:	c3                   	ret
 10b2593:	49 89 f6             	mov    r14,rsi
 10b2596:	4c 8d 7e 28          	lea    r15,[rsi+0x28]
 10b259a:	48 8b 7e 28          	mov    rdi,QWORD PTR [rsi+0x28]
 10b259e:	48 85 ff             	test   rdi,rdi
 10b25a1:	74 0e                	je     10b25b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2799c7>
 10b25a3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10b25a6:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10b25a9:	4c 89 ff             	mov    rdi,r15
 10b25ac:	e8 75 c3 9f ff       	call   aae926 <JNI_OnUnload@@Base+0x361f3>
 10b25b1:	48 83 a4 24 30 01 00 	and    QWORD PTR [rsp+0x130],0x0
 10b25b8:	00 00 
 10b25ba:	48 83 a4 24 40 01 00 	and    QWORD PTR [rsp+0x140],0x0
 10b25c1:	00 00 
 10b25c3:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
 10b25c8:	48 85 c0             	test   rax,rax
 10b25cb:	4c 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],r15
 10b25d0:	74 31                	je     10b2603 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279a19>
 10b25d2:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
 10b25d9:	00 
 10b25da:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
 10b25de:	6a 01                	push   0x1
 10b25e0:	5f                   	pop    rdi
 10b25e1:	4c 89 e2             	mov    rdx,r12
 10b25e4:	ff d0                	call   rax
 10b25e6:	49 8b 44 24 18       	mov    rax,QWORD PTR [r12+0x18]
 10b25eb:	48 89 84 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rax
 10b25f2:	00 
 10b25f3:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0
 10b25f9:	48 8b 84 24 40 01 00 	mov    rax,QWORD PTR [rsp+0x140]
 10b2600:	00 
 10b2601:	eb 02                	jmp    10b2605 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279a1b>
 10b2603:	31 c0                	xor    eax,eax
 10b2605:	f7 dd                	neg    ebp
 10b2607:	4d 8d 7e 38          	lea    r15,[r14+0x38]
 10b260b:	48 8d 94 24 30 01 00 	lea    rdx,[rsp+0x130]
 10b2612:	00 
 10b2613:	4c 89 3c 24          	mov    QWORD PTR [rsp],r15
 10b2617:	4d 89 fc             	mov    r12,r15
 10b261a:	49 89 d7             	mov    r15,rdx
 10b261d:	48 85 c0             	test   rax,rax
 10b2620:	74 5f                	je     10b2681 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279a97>
 10b2622:	48 89 c1             	mov    rcx,rax
 10b2625:	49 83 7c 24 10 00    	cmp    QWORD PTR [r12+0x10],0x0
 10b262b:	b8 00 00 00 00       	mov    eax,0x0
 10b2630:	4c 89 e2             	mov    rdx,r12
 10b2633:	74 e2                	je     10b2617 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279a2d>
 10b2635:	48 8d b4 24 00 01 00 	lea    rsi,[rsp+0x100]
 10b263c:	00 
 10b263d:	48 83 26 00          	and    QWORD PTR [rsi],0x0
 10b2641:	6a 01                	push   0x1
 10b2643:	5f                   	pop    rdi
 10b2644:	4c 89 fa             	mov    rdx,r15
 10b2647:	ff d1                	call   rcx
 10b2649:	6a 01                	push   0x1
 10b264b:	5f                   	pop    rdi
 10b264c:	4c 89 fe             	mov    rsi,r15
 10b264f:	4c 89 e2             	mov    rdx,r12
 10b2652:	41 ff 54 24 10       	call   QWORD PTR [r12+0x10]
 10b2657:	6a 01                	push   0x1
 10b2659:	5f                   	pop    rdi
 10b265a:	48 8d 94 24 00 01 00 	lea    rdx,[rsp+0x100]
 10b2661:	00 
 10b2662:	4c 89 e6             	mov    rsi,r12
 10b2665:	41 ff 57 10          	call   QWORD PTR [r15+0x10]
 10b2669:	41 0f 10 44 24 10    	movups xmm0,XMMWORD PTR [r12+0x10]
 10b266f:	41 0f 10 4f 10       	movups xmm1,XMMWORD PTR [r15+0x10]
 10b2674:	41 0f 11 47 10       	movups XMMWORD PTR [r15+0x10],xmm0
 10b2679:	41 0f 11 4c 24 10    	movups XMMWORD PTR [r12+0x10],xmm1
 10b267f:	eb 26                	jmp    10b26a7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279abd>
 10b2681:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
 10b2686:	48 85 c0             	test   rax,rax
 10b2689:	74 1c                	je     10b26a7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279abd>
 10b268b:	6a 01                	push   0x1
 10b268d:	5f                   	pop    rdi
 10b268e:	4c 89 fe             	mov    rsi,r15
 10b2691:	4c 89 e2             	mov    rdx,r12
 10b2694:	ff d0                	call   rax
 10b2696:	41 0f 10 44 24 10    	movups xmm0,XMMWORD PTR [r12+0x10]
 10b269c:	41 0f 11 47 10       	movups XMMWORD PTR [r15+0x10],xmm0
 10b26a1:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0
 10b26a7:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
 10b26ae:	00 
 10b26af:	e8 0a 03 00 00       	call   10b29be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279dd4>
 10b26b4:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]
 10b26b8:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
 10b26bf:	00 
 10b26c0:	e8 e1 71 53 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
 10b26c5:	48 8d 35 24 83 38 ff 	lea    rsi,[rip+0xffffffffff388324]        # 43a9f0 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5fc>
 10b26cc:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
 10b26d3:	00 
 10b26d4:	e8 67 b8 73 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 10b26d9:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
 10b26e0:	00 
 10b26e1:	48 8d b4 24 88 00 00 	lea    rsi,[rsp+0x88]
 10b26e8:	00 
 10b26e9:	e8 3c 72 53 00       	call   15e992a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42eeae>
 10b26ee:	48 8d 35 13 82 38 ff 	lea    rsi,[rip+0xffffffffff388213]        # 43a908 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x514>
 10b26f5:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
 10b26fa:	e8 7f 73 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10b26ff:	48 8d 35 ca 33 38 ff 	lea    rsi,[rip+0xffffffffff3833ca]        # 435ad0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b51f>
 10b2706:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
 10b270b:	e8 6e 73 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10b2710:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
 10b2717:	00 
 10b2718:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
 10b271d:	48 8d 54 24 58       	lea    rdx,[rsp+0x58]
 10b2722:	e8 41 73 53 00       	call   15e9a68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42efec>
 10b2727:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 10b272b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10b272e:	ff 90 98 01 00 00    	call   QWORD PTR [rax+0x198]
 10b2734:	41 89 c7             	mov    r15d,eax
 10b2737:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 10b273b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10b273e:	ff 90 90 01 00 00    	call   QWORD PTR [rax+0x190]
 10b2744:	41 89 c4             	mov    r12d,eax
 10b2747:	48 8d 35 8a 00 28 ff 	lea    rsi,[rip+0xffffffffff28008a]        # 3327d8 <_ZTSSt12bad_any_cast@@Base-0x5d9f0>
 10b274e:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 10b2753:	e8 26 73 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10b2758:	41 80 f4 01          	xor    r12b,0x1
 10b275c:	41 0f b6 d7          	movzx  edx,r15b
 10b2760:	41 0f b6 cc          	movzx  ecx,r12b
 10b2764:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 10b2769:	4c 8d 44 24 28       	lea    r8,[rsp+0x28]
 10b276e:	4c 89 ee             	mov    rsi,r13
 10b2771:	e8 b6 59 40 00       	call   14b812c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fd6b0>
 10b2776:	4c 8d ac 24 a0 00 00 	lea    r13,[rsp+0xa0]
 10b277d:	00 
 10b277e:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
 10b2783:	4c 89 ef             	mov    rdi,r13
 10b2786:	e8 73 72 53 00       	call   15e99fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ef82>
 10b278b:	48 8d 05 7e a8 79 00 	lea    rax,[rip+0x79a87e]        # 184d010 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x96f8>
 10b2792:	48 89 84 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rax
 10b2799:	00 
 10b279a:	4c 89 b4 24 38 01 00 	mov    QWORD PTR [rsp+0x138],r14
 10b27a1:	00 
 10b27a2:	89 ac 24 40 01 00 00 	mov    DWORD PTR [rsp+0x140],ebp
 10b27a9:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
 10b27b0:	00 
 10b27b1:	48 89 b4 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rsi
 10b27b8:	00 
 10b27b9:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
 10b27bd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10b27c0:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
 10b27c6:	48 8d 05 8b a8 79 00 	lea    rax,[rip+0x79a88b]        # 184d058 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9740>
 10b27cd:	48 8d ac 24 00 01 00 	lea    rbp,[rsp+0x100]
 10b27d4:	00 
 10b27d5:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
 10b27d9:	4c 89 75 08          	mov    QWORD PTR [rbp+0x8],r14
 10b27dd:	48 89 6d 20          	mov    QWORD PTR [rbp+0x20],rbp
 10b27e1:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
 10b27e5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10b27e8:	48 89 ee             	mov    rsi,rbp
 10b27eb:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
 10b27f1:	49 8b 76 20          	mov    rsi,QWORD PTR [r14+0x20]
 10b27f5:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
 10b27f9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10b27fc:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
 10b2802:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
 10b2806:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10b2809:	4c 8d a4 24 b0 00 00 	lea    r12,[rsp+0xb0]
 10b2810:	00 
 10b2811:	4c 89 e7             	mov    rdi,r12
 10b2814:	ff 90 30 01 00 00    	call   QWORD PTR [rax+0x130]
 10b281a:	4c 8b 7c 24 08       	mov    r15,QWORD PTR [rsp+0x8]
 10b281f:	4c 89 ff             	mov    rdi,r15
 10b2822:	4c 89 e6             	mov    rsi,r12
 10b2825:	e8 f2 6f a0 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
 10b282a:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
 10b282f:	e8 52 bc 9e ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10b2834:	48 89 ef             	mov    rdi,rbp
 10b2837:	e8 2e 77 9c ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 10b283c:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
 10b2843:	00 
 10b2844:	e8 21 77 9c ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 10b2849:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 10b284e:	e8 3d b6 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10b2853:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 10b2858:	e8 33 b6 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10b285d:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
 10b2862:	e8 29 b6 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10b2867:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
 10b286c:	e8 1f b6 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10b2871:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
 10b2878:	00 
 10b2879:	e8 12 b6 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10b287e:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
 10b2882:	e8 ff bb 9e ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10b2887:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
 10b288b:	48 85 ff             	test   rdi,rdi
 10b288e:	74 24                	je     10b28b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279cca>
 10b2890:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10b2893:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10b2896:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
 10b289a:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
 10b289e:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 10b28a1:	48 85 c0             	test   rax,rax
 10b28a4:	0f 84 bd fc ff ff    	je     10b2567 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27997d>
 10b28aa:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
 10b28af:	e9 b3 fc ff ff       	jmp    10b2567 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27997d>
 10b28b4:	0f 57 c0             	xorps  xmm0,xmm0
 10b28b7:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
 10b28bc:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
 10b28bf:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 10b28c4:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
 10b28c8:	e8 17 01 00 00       	call   10b29e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279dfa>
 10b28cd:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 10b28d2:	e9 85 fc ff ff       	jmp    10b255c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279972>
 10b28d7:	48 89 c3             	mov    rbx,rax
 10b28da:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 10b28df:	eb 75                	jmp    10b2956 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279d6c>
 10b28e1:	eb 2d                	jmp    10b2910 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279d26>
 10b28e3:	48 89 c3             	mov    rbx,rax
 10b28e6:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 10b28eb:	e8 a0 b5 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10b28f0:	eb 29                	jmp    10b291b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279d31>
 10b28f2:	eb 24                	jmp    10b2918 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279d2e>
 10b28f4:	48 89 c3             	mov    rbx,rax
 10b28f7:	eb 2c                	jmp    10b2925 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279d3b>
 10b28f9:	48 89 c3             	mov    rbx,rax
 10b28fc:	eb 31                	jmp    10b292f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279d45>
 10b28fe:	48 89 c3             	mov    rbx,rax
 10b2901:	eb 39                	jmp    10b293c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279d52>
 10b2903:	48 89 c3             	mov    rbx,rax
 10b2906:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
 10b290d:	00 
 10b290e:	eb 46                	jmp    10b2956 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279d6c>
 10b2910:	48 89 c7             	mov    rdi,rax
 10b2913:	e8 8d 71 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10b2918:	48 89 c3             	mov    rbx,rax
 10b291b:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
 10b2920:	e8 6b b5 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10b2925:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
 10b292a:	e8 61 b5 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10b292f:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
 10b2936:	00 
 10b2937:	e8 54 b5 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10b293c:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
 10b2943:	00 
 10b2944:	e8 3d bb 9e ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10b2949:	eb 10                	jmp    10b295b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279d71>
 10b294b:	48 89 c3             	mov    rbx,rax
 10b294e:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
 10b2955:	00 
 10b2956:	e8 ff 22 e1 ff       	call   ec4c5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c070>
 10b295b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b2962:	00 00 
 10b2964:	48 3b 84 24 60 01 00 	cmp    rax,QWORD PTR [rsp+0x160]
 10b296b:	00 
 10b296c:	75 08                	jne    10b2976 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279d8c>
 10b296e:	48 89 df             	mov    rdi,rbx
 10b2971:	e8 5a d3 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10b2976:	e8 35 d1 73 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x184cfc0 +0x30 -> 0x10b297c
FDE= ('0x10b297c', '0x10b29ab')
 10b297c:	53                   	push   rbx
 10b297d:	48 89 fb             	mov    rbx,rdi
 10b2980:	48 8b 7f 28          	mov    rdi,QWORD PTR [rdi+0x28]
 10b2984:	48 85 ff             	test   rdi,rdi
 10b2987:	74 06                	je     10b298f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279da5>
 10b2989:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10b298c:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10b298f:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
 10b2993:	e8 26 00 00 00       	call   10b29be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279dd4>
 10b2998:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
 10b299c:	e8 e5 ba 9e ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10b29a1:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
 10b29a5:	5b                   	pop    rbx
 10b29a6:	e9 db ba 9e ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>

### AP 0x184cfc0 +0x38 -> 0x10b29ac
FDE= ('0x10b29ac', '0x10b29be')
 10b29ac:	53                   	push   rbx
 10b29ad:	48 89 fb             	mov    rbx,rdi
 10b29b0:	e8 c7 ff ff ff       	call   10b297c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279d92>
 10b29b5:	48 89 df             	mov    rdi,rbx
 10b29b8:	5b                   	pop    rbx
 10b29b9:	e9 62 b5 73 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x184cfc0 +0x68 -> 0x10b2b52
FDE= ('0x10b2b52', '0x10b2b65')
 10b2b52:	48 8d 05 b7 a4 79 00 	lea    rax,[rip+0x79a4b7]        # 184d010 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x96f8>
 10b2b59:	48 89 06             	mov    QWORD PTR [rsi],rax
 10b2b5c:	0f 10 47 08          	movups xmm0,XMMWORD PTR [rdi+0x8]
 10b2b60:	0f 11 46 08          	movups XMMWORD PTR [rsi+0x8],xmm0
 10b2b64:	c3                   	ret

### AP 0x184cb10 +0x28 -> 0x9d7de0
FDE= ('0x9d7de0', '0x9d7de1')
  9d7de0:	c3                   	ret

### AP 0x184cb10 +0x30 -> 0x10ae598
FDE= ('0x10ae598', '0x10aeb7c')
 10ae598:	55                   	push   rbp
 10ae599:	41 57                	push   r15
 10ae59b:	41 56                	push   r14
 10ae59d:	41 55                	push   r13
 10ae59f:	41 54                	push   r12
 10ae5a1:	53                   	push   rbx
 10ae5a2:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
 10ae5a9:	48 89 cb             	mov    rbx,rcx
 10ae5ac:	49 89 f6             	mov    r14,rsi
 10ae5af:	49 89 ff             	mov    r15,rdi
 10ae5b2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ae5b9:	00 00 
 10ae5bb:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
 10ae5c2:	00 
 10ae5c3:	e8 36 08 00 00       	call   10aedfe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x276214>
 10ae5c8:	84 c0                	test   al,al
 10ae5ca:	0f 84 22 05 00 00    	je     10aeaf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275f08>
 10ae5d0:	49 8b 7f 10          	mov    rdi,QWORD PTR [r15+0x10]
 10ae5d4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ae5d7:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10ae5da:	4d 8d 6e 18          	lea    r13,[r14+0x18]
 10ae5de:	4d 8d 67 28          	lea    r12,[r15+0x28]
 10ae5e2:	4c 89 e7             	mov    rdi,r12
 10ae5e5:	4c 89 ee             	mov    rsi,r13
 10ae5e8:	e8 6b 0a 00 00       	call   10af058 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27646e>
 10ae5ed:	48 89 c5             	mov    rbp,rax
 10ae5f0:	48 85 c0             	test   rax,rax
 10ae5f3:	0f 85 e3 04 00 00    	jne    10aeadc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275ef2>
 10ae5f9:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
 10ae5fd:	48 89 5c 24 20       	mov    QWORD PTR [rsp+0x20],rbx
 10ae602:	48 8d 93 80 00 00 00 	lea    rdx,[rbx+0x80]
 10ae609:	48 8d 9c 24 9f 00 00 	lea    rbx,[rsp+0x9f]
 10ae610:	00 
 10ae611:	48 89 df             	mov    rdi,rbx
 10ae614:	e8 f7 f6 39 00       	call   144dd10 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x293294>
 10ae619:	80 7b 10 00          	cmp    BYTE PTR [rbx+0x10],0x0
 10ae61d:	0f 84 cf 04 00 00    	je     10aeaf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275f08>
 10ae623:	0f 57 c0             	xorps  xmm0,xmm0
 10ae626:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
 10ae62b:	48 83 67 f0 00       	and    QWORD PTR [rdi-0x10],0x0
 10ae630:	0f 29 47 e0          	movaps XMMWORD PTR [rdi-0x20],xmm0
 10ae634:	0f 29 47 d0          	movaps XMMWORD PTR [rdi-0x30],xmm0
 10ae638:	c7 47 f8 00 00 80 3f 	mov    DWORD PTR [rdi-0x8],0x3f800000
 10ae63f:	49 8d 76 70          	lea    rsi,[r14+0x70]
 10ae643:	e8 f8 f8 73 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 10ae648:	0f 10 84 24 9f 00 00 	movups xmm0,XMMWORD PTR [rsp+0x9f]
 10ae64f:	00 
 10ae650:	0f 11 84 24 88 00 00 	movups XMMWORD PTR [rsp+0x88],xmm0
 10ae657:	00 
 10ae658:	4c 89 ef             	mov    rdi,r13
 10ae65b:	e8 e4 0a 00 00       	call   10af144 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27655a>
 10ae660:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 10ae664:	49 8b 5f 30          	mov    rbx,QWORD PTR [r15+0x30]
 10ae668:	48 85 db             	test   rbx,rbx
 10ae66b:	74 1d                	je     10ae68a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275aa0>
 10ae66d:	f3 48 0f b8 cb       	popcnt rcx,rbx
 10ae672:	48 89 c8             	mov    rax,rcx
 10ae675:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
 10ae67a:	48 83 f9 01          	cmp    rcx,0x1
 10ae67e:	77 0f                	ja     10ae68f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275aa5>
 10ae680:	48 8d 53 ff          	lea    rdx,[rbx-0x1]
 10ae684:	48 23 14 24          	and    rdx,QWORD PTR [rsp]
 10ae688:	eb 1a                	jmp    10ae6a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275aba>
 10ae68a:	e9 82 00 00 00       	jmp    10ae711 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275b27>
 10ae68f:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
 10ae693:	48 89 c2             	mov    rdx,rax
 10ae696:	48 39 d8             	cmp    rax,rbx
 10ae699:	72 09                	jb     10ae6a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275aba>
 10ae69b:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
 10ae69f:	31 d2                	xor    edx,edx
 10ae6a1:	48 f7 f3             	div    rbx
 10ae6a4:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 10ae6a8:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
 10ae6ad:	48 8b 04 d0          	mov    rax,QWORD PTR [rax+rdx*8]
 10ae6b1:	48 85 c0             	test   rax,rax
 10ae6b4:	74 5b                	je     10ae711 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275b27>
 10ae6b6:	48 8b 28             	mov    rbp,QWORD PTR [rax]
 10ae6b9:	48 85 ed             	test   rbp,rbp
 10ae6bc:	74 53                	je     10ae711 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275b27>
 10ae6be:	48 8d 43 ff          	lea    rax,[rbx-0x1]
 10ae6c2:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 10ae6c7:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]
 10ae6cb:	48 3b 04 24          	cmp    rax,QWORD PTR [rsp]
 10ae6cf:	75 15                	jne    10ae6e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275afc>
 10ae6d1:	48 8d 7d 10          	lea    rdi,[rbp+0x10]
 10ae6d5:	4c 89 ee             	mov    rsi,r13
 10ae6d8:	e8 ef 0a 00 00       	call   10af1cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2765e2>
 10ae6dd:	84 c0                	test   al,al
 10ae6df:	74 27                	je     10ae708 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275b1e>
 10ae6e1:	e9 e7 03 00 00       	jmp    10aeacd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275ee3>
 10ae6e6:	83 7c 24 08 01       	cmp    DWORD PTR [rsp+0x8],0x1
 10ae6eb:	77 07                	ja     10ae6f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275b0a>
 10ae6ed:	48 23 44 24 18       	and    rax,QWORD PTR [rsp+0x18]
 10ae6f2:	eb 0d                	jmp    10ae701 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275b17>
 10ae6f4:	48 39 d8             	cmp    rax,rbx
 10ae6f7:	72 08                	jb     10ae701 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275b17>
 10ae6f9:	31 d2                	xor    edx,edx
 10ae6fb:	48 f7 f3             	div    rbx
 10ae6fe:	48 89 d0             	mov    rax,rdx
 10ae701:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
 10ae706:	75 09                	jne    10ae711 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275b27>
 10ae708:	48 8b 6d 00          	mov    rbp,QWORD PTR [rbp+0x0]
 10ae70c:	48 85 ed             	test   rbp,rbp
 10ae70f:	75 b6                	jne    10ae6c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275add>
 10ae711:	bf a8 00 00 00       	mov    edi,0xa8
 10ae716:	e8 e5 f7 73 00       	call   17edf00 <_Znwm@plt>
 10ae71b:	48 89 c5             	mov    rbp,rax
 10ae71e:	49 8d 47 38          	lea    rax,[r15+0x38]
 10ae722:	48 89 6c 24 28       	mov    QWORD PTR [rsp+0x28],rbp
 10ae727:	48 83 65 00 00       	and    QWORD PTR [rbp+0x0],0x0
 10ae72c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 10ae731:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 10ae736:	c6 44 24 38 00       	mov    BYTE PTR [rsp+0x38],0x0
 10ae73b:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
 10ae73f:	48 89 45 08          	mov    QWORD PTR [rbp+0x8],rax
 10ae743:	48 8d 7d 10          	lea    rdi,[rbp+0x10]
 10ae747:	4c 89 ee             	mov    rsi,r13
 10ae74a:	e8 ab 0d 00 00       	call   10af4fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x276910>
 10ae74f:	4c 8d ac 24 88 00 00 	lea    r13,[rsp+0x88]
 10ae756:	00 
 10ae757:	49 8b 45 b8          	mov    rax,QWORD PTR [r13-0x48]
 10ae75b:	48 89 45 50          	mov    QWORD PTR [rbp+0x50],rax
 10ae75f:	48 89 ef             	mov    rdi,rbp
 10ae762:	48 83 c7 58          	add    rdi,0x58
 10ae766:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
 10ae76b:	e8 cc 08 a9 ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
 10ae770:	48 8d 4c 24 70       	lea    rcx,[rsp+0x70]
 10ae775:	48 8b 41 10          	mov    rax,QWORD PTR [rcx+0x10]
 10ae779:	48 89 85 90 00 00 00 	mov    QWORD PTR [rbp+0x90],rax
 10ae780:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
 10ae783:	0f 11 85 80 00 00 00 	movups XMMWORD PTR [rbp+0x80],xmm0
 10ae78a:	0f 57 c0             	xorps  xmm0,xmm0
 10ae78d:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
 10ae790:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
 10ae795:	41 0f 10 45 00       	movups xmm0,XMMWORD PTR [r13+0x0]
 10ae79a:	0f 11 85 98 00 00 00 	movups XMMWORD PTR [rbp+0x98],xmm0
 10ae7a1:	c6 44 24 38 01       	mov    BYTE PTR [rsp+0x38],0x1
 10ae7a6:	49 8b 47 40          	mov    rax,QWORD PTR [r15+0x40]
 10ae7aa:	48 ff c0             	inc    rax
 10ae7ad:	78 07                	js     10ae7b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275bcc>
 10ae7af:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
 10ae7b4:	eb 15                	jmp    10ae7cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275be1>
 10ae7b6:	48 89 c1             	mov    rcx,rax
 10ae7b9:	48 d1 e9             	shr    rcx,1
 10ae7bc:	83 e0 01             	and    eax,0x1
 10ae7bf:	48 09 c8             	or     rax,rcx
 10ae7c2:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
 10ae7c7:	f3 0f 58 c0          	addss  xmm0,xmm0
 10ae7cb:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
 10ae7d0:	48 89 d9             	mov    rcx,rbx
 10ae7d3:	48 d1 e9             	shr    rcx,1
 10ae7d6:	89 d8                	mov    eax,ebx
 10ae7d8:	83 e0 01             	and    eax,0x1
 10ae7db:	48 09 c8             	or     rax,rcx
 10ae7de:	48 85 db             	test   rbx,rbx
 10ae7e1:	78 07                	js     10ae7ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275c00>
 10ae7e3:	f3 48 0f 2a d3       	cvtsi2ss xmm2,rbx
 10ae7e8:	eb 09                	jmp    10ae7f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275c09>
 10ae7ea:	f3 48 0f 2a d0       	cvtsi2ss xmm2,rax
 10ae7ef:	f3 0f 58 d2          	addss  xmm2,xmm2
 10ae7f3:	f3 41 0f 10 4f 48    	movss  xmm1,DWORD PTR [r15+0x48]
 10ae7f9:	74 0d                	je     10ae808 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275c1e>
 10ae7fb:	f3 0f 59 d1          	mulss  xmm2,xmm1
 10ae7ff:	0f 2e c2             	ucomiss xmm0,xmm2
 10ae802:	0f 86 4e 02 00 00    	jbe    10aea56 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275e6c>
 10ae808:	48 83 fb 03          	cmp    rbx,0x3
 10ae80c:	0f 92 c0             	setb   al
 10ae80f:	48 8d 4b ff          	lea    rcx,[rbx-0x1]
 10ae813:	48 85 cb             	test   rbx,rcx
 10ae816:	0f 95 c1             	setne  cl
 10ae819:	08 c1                	or     cl,al
 10ae81b:	0f b6 c1             	movzx  eax,cl
 10ae81e:	48 8d 04 58          	lea    rax,[rax+rbx*2]
 10ae822:	f3 0f 5e c1          	divss  xmm0,xmm1
 10ae826:	66 0f 3a 0a c0 0a    	roundss xmm0,xmm0,0xa
 10ae82c:	f3 48 0f 2c c8       	cvttss2si rcx,xmm0
 10ae831:	48 89 ca             	mov    rdx,rcx
 10ae834:	f3 0f 5c 05 e0 ff 2d 	subss  xmm0,DWORD PTR [rip+0xffffffffff2dffe0]        # 38e81c <_ZTSSt12bad_any_cast@@Base-0x19ac>
 10ae83b:	ff 
 10ae83c:	f3 48 0f 2c d8       	cvttss2si rbx,xmm0
 10ae841:	48 c1 fa 3f          	sar    rdx,0x3f
 10ae845:	48 21 d3             	and    rbx,rdx
 10ae848:	48 09 cb             	or     rbx,rcx
 10ae84b:	48 39 d8             	cmp    rax,rbx
 10ae84e:	48 0f 47 d8          	cmova  rbx,rax
 10ae852:	48 83 fb 01          	cmp    rbx,0x1
 10ae856:	75 05                	jne    10ae85d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275c73>
 10ae858:	6a 02                	push   0x2
 10ae85a:	5b                   	pop    rbx
 10ae85b:	eb 14                	jmp    10ae871 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275c87>
 10ae85d:	48 8d 43 ff          	lea    rax,[rbx-0x1]
 10ae861:	48 85 c3             	test   rbx,rax
 10ae864:	74 0b                	je     10ae871 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275c87>
 10ae866:	48 89 df             	mov    rdi,rbx
 10ae869:	e8 72 f7 73 00       	call   17edfe0 <_ZNSt6__ndk112__next_primeEm@plt>
 10ae86e:	48 89 c3             	mov    rbx,rax
 10ae871:	49 8b 6f 30          	mov    rbp,QWORD PTR [r15+0x30]
 10ae875:	48 39 eb             	cmp    rbx,rbp
 10ae878:	76 68                	jbe    10ae8e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275cf8>
 10ae87a:	49 89 dd             	mov    r13,rbx
 10ae87d:	4c 89 e8             	mov    rax,r13
 10ae880:	48 c1 e8 3d          	shr    rax,0x3d
 10ae884:	0f 85 8d 02 00 00    	jne    10aeb17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275f2d>
 10ae88a:	4a 8d 3c ed 00 00 00 	lea    rdi,[r13*8+0x0]
 10ae891:	00 
 10ae892:	e8 69 f6 73 00       	call   17edf00 <_Znwm@plt>
 10ae897:	4c 89 e7             	mov    rdi,r12
 10ae89a:	48 89 c6             	mov    rsi,rax
 10ae89d:	e8 f4 0e 9f ff       	call   a9f796 <JNI_OnUnload@@Base+0x27063>
 10ae8a2:	4d 89 6f 30          	mov    QWORD PTR [r15+0x30],r13
 10ae8a6:	31 c0                	xor    eax,eax
 10ae8a8:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
 10ae8ac:	48 83 24 c1 00       	and    QWORD PTR [rcx+rax*8],0x0
 10ae8b1:	48 ff c0             	inc    rax
 10ae8b4:	49 39 c5             	cmp    r13,rax
 10ae8b7:	75 ef                	jne    10ae8a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275cbe>
 10ae8b9:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 10ae8be:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10ae8c1:	48 85 ff             	test   rdi,rdi
 10ae8c4:	0f 84 65 01 00 00    	je     10aea2f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275e45>
 10ae8ca:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]
 10ae8ce:	f3 49 0f b8 f5       	popcnt rsi,r13
 10ae8d3:	48 83 fe 01          	cmp    rsi,0x1
 10ae8d7:	77 26                	ja     10ae8ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275d15>
 10ae8d9:	49 8d 45 ff          	lea    rax,[r13-0x1]
 10ae8dd:	48 21 c1             	and    rcx,rax
 10ae8e0:	eb 2d                	jmp    10ae90f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275d25>
 10ae8e2:	0f 83 47 01 00 00    	jae    10aea2f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275e45>
 10ae8e8:	49 8b 47 40          	mov    rax,QWORD PTR [r15+0x40]
 10ae8ec:	48 85 c0             	test   rax,rax
 10ae8ef:	0f 88 a0 00 00 00    	js     10ae995 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275dab>
 10ae8f5:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
 10ae8fa:	e9 ab 00 00 00       	jmp    10ae9aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275dc0>
 10ae8ff:	4c 39 e9             	cmp    rcx,r13
 10ae902:	72 0b                	jb     10ae90f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275d25>
 10ae904:	48 89 c8             	mov    rax,rcx
 10ae907:	31 d2                	xor    edx,edx
 10ae909:	49 f7 f5             	div    r13
 10ae90c:	48 89 d1             	mov    rcx,rdx
 10ae90f:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 10ae913:	48 8b 54 24 08       	mov    rdx,QWORD PTR [rsp+0x8]
 10ae918:	48 89 14 c8          	mov    QWORD PTR [rax+rcx*8],rdx
 10ae91c:	4c 8b 07             	mov    r8,QWORD PTR [rdi]
 10ae91f:	4d 85 c0             	test   r8,r8
 10ae922:	0f 84 07 01 00 00    	je     10aea2f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275e45>
 10ae928:	4d 8d 4d ff          	lea    r9,[r13-0x1]
 10ae92c:	49 8b 40 08          	mov    rax,QWORD PTR [r8+0x8]
 10ae930:	83 fe 01             	cmp    esi,0x1
 10ae933:	77 05                	ja     10ae93a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275d50>
 10ae935:	4c 21 c8             	and    rax,r9
 10ae938:	eb 0d                	jmp    10ae947 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275d5d>
 10ae93a:	4c 39 e8             	cmp    rax,r13
 10ae93d:	72 08                	jb     10ae947 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275d5d>
 10ae93f:	31 d2                	xor    edx,edx
 10ae941:	49 f7 f5             	div    r13
 10ae944:	48 89 d0             	mov    rax,rdx
 10ae947:	48 39 c8             	cmp    rax,rcx
 10ae94a:	74 2d                	je     10ae979 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275d8f>
 10ae94c:	49 8b 14 24          	mov    rdx,QWORD PTR [r12]
 10ae950:	48 83 3c c2 00       	cmp    QWORD PTR [rdx+rax*8],0x0
 10ae955:	74 38                	je     10ae98f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275da5>
 10ae957:	49 8b 10             	mov    rdx,QWORD PTR [r8]
 10ae95a:	48 89 17             	mov    QWORD PTR [rdi],rdx
 10ae95d:	49 8b 14 24          	mov    rdx,QWORD PTR [r12]
 10ae961:	48 8b 14 c2          	mov    rdx,QWORD PTR [rdx+rax*8]
 10ae965:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
 10ae968:	49 89 10             	mov    QWORD PTR [r8],rdx
 10ae96b:	49 8b 14 24          	mov    rdx,QWORD PTR [r12]
 10ae96f:	48 8b 04 c2          	mov    rax,QWORD PTR [rdx+rax*8]
 10ae973:	4c 89 00             	mov    QWORD PTR [rax],r8
 10ae976:	49 89 f8             	mov    r8,rdi
 10ae979:	48 89 c8             	mov    rax,rcx
 10ae97c:	4c 89 c7             	mov    rdi,r8
 10ae97f:	4d 8b 00             	mov    r8,QWORD PTR [r8]
 10ae982:	48 89 c1             	mov    rcx,rax
 10ae985:	4d 85 c0             	test   r8,r8
 10ae988:	75 a2                	jne    10ae92c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275d42>
 10ae98a:	e9 a0 00 00 00       	jmp    10aea2f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275e45>
 10ae98f:	48 89 3c c2          	mov    QWORD PTR [rdx+rax*8],rdi
 10ae993:	eb e7                	jmp    10ae97c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275d92>
 10ae995:	48 89 c1             	mov    rcx,rax
 10ae998:	48 d1 e9             	shr    rcx,1
 10ae99b:	83 e0 01             	and    eax,0x1
 10ae99e:	48 09 c8             	or     rax,rcx
 10ae9a1:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
 10ae9a6:	f3 0f 58 c0          	addss  xmm0,xmm0
 10ae9aa:	f3 41 0f 5e 47 48    	divss  xmm0,DWORD PTR [r15+0x48]
 10ae9b0:	66 0f 3a 0a c0 0a    	roundss xmm0,xmm0,0xa
 10ae9b6:	f3 48 0f 2c c0       	cvttss2si rax,xmm0
 10ae9bb:	48 89 c1             	mov    rcx,rax
 10ae9be:	f3 0f 5c 05 56 fe 2d 	subss  xmm0,DWORD PTR [rip+0xffffffffff2dfe56]        # 38e81c <_ZTSSt12bad_any_cast@@Base-0x19ac>
 10ae9c5:	ff 
 10ae9c6:	f3 48 0f 2c f8       	cvttss2si rdi,xmm0
 10ae9cb:	48 c1 f9 3f          	sar    rcx,0x3f
 10ae9cf:	48 21 cf             	and    rdi,rcx
 10ae9d2:	48 09 c7             	or     rdi,rax
 10ae9d5:	48 83 fd 03          	cmp    rbp,0x3
 10ae9d9:	72 28                	jb     10aea03 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275e19>
 10ae9db:	f3 48 0f b8 c5       	popcnt rax,rbp
 10ae9e0:	83 f8 01             	cmp    eax,0x1
 10ae9e3:	77 1e                	ja     10aea03 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275e19>
 10ae9e5:	48 8d 47 ff          	lea    rax,[rdi-0x1]
 10ae9e9:	48 0f bd c8          	bsr    rcx,rax
 10ae9ed:	83 f1 3f             	xor    ecx,0x3f
 10ae9f0:	f6 d9                	neg    cl
 10ae9f2:	6a 01                	push   0x1
 10ae9f4:	41 5d                	pop    r13
 10ae9f6:	49 d3 e5             	shl    r13,cl
 10ae9f9:	48 83 ff 02          	cmp    rdi,0x2
 10ae9fd:	4c 0f 42 ef          	cmovb  r13,rdi
 10aea01:	eb 08                	jmp    10aea0b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275e21>
 10aea03:	e8 d8 f5 73 00       	call   17edfe0 <_ZNSt6__ndk112__next_primeEm@plt>
 10aea08:	49 89 c5             	mov    r13,rax
 10aea0b:	4c 39 eb             	cmp    rbx,r13
 10aea0e:	4c 0f 47 eb          	cmova  r13,rbx
 10aea12:	49 39 ed             	cmp    r13,rbp
 10aea15:	73 18                	jae    10aea2f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275e45>
 10aea17:	4d 85 ed             	test   r13,r13
 10aea1a:	0f 85 5d fe ff ff    	jne    10ae87d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275c93>
 10aea20:	4c 89 e7             	mov    rdi,r12
 10aea23:	31 f6                	xor    esi,esi
 10aea25:	e8 6c 0d 9f ff       	call   a9f796 <JNI_OnUnload@@Base+0x27063>
 10aea2a:	49 83 67 30 00       	and    QWORD PTR [r15+0x30],0x0
 10aea2f:	49 8b 5f 30          	mov    rbx,QWORD PTR [r15+0x30]
 10aea33:	48 8d 43 ff          	lea    rax,[rbx-0x1]
 10aea37:	48 85 c3             	test   rbx,rax
 10aea3a:	75 09                	jne    10aea45 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275e5b>
 10aea3c:	48 8b 14 24          	mov    rdx,QWORD PTR [rsp]
 10aea40:	48 21 c2             	and    rdx,rax
 10aea43:	eb 11                	jmp    10aea56 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275e6c>
 10aea45:	48 8b 14 24          	mov    rdx,QWORD PTR [rsp]
 10aea49:	48 39 da             	cmp    rdx,rbx
 10aea4c:	72 08                	jb     10aea56 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275e6c>
 10aea4e:	48 89 d0             	mov    rax,rdx
 10aea51:	31 d2                	xor    edx,edx
 10aea53:	48 f7 f3             	div    rbx
 10aea56:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 10aea5a:	48 8b 04 d0          	mov    rax,QWORD PTR [rax+rdx*8]
 10aea5e:	48 8b 6c 24 28       	mov    rbp,QWORD PTR [rsp+0x28]
 10aea63:	48 85 c0             	test   rax,rax
 10aea66:	74 09                	je     10aea71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275e87>
 10aea68:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 10aea6b:	48 89 4d 00          	mov    QWORD PTR [rbp+0x0],rcx
 10aea6f:	eb 47                	jmp    10aeab8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275ece>
 10aea71:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
 10aea76:	48 8b 01             	mov    rax,QWORD PTR [rcx]
 10aea79:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
 10aea7d:	48 89 29             	mov    QWORD PTR [rcx],rbp
 10aea80:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 10aea84:	48 89 0c d0          	mov    QWORD PTR [rax+rdx*8],rcx
 10aea88:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
 10aea8c:	48 85 c0             	test   rax,rax
 10aea8f:	74 2a                	je     10aeabb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275ed1>
 10aea91:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
 10aea95:	48 8d 4b ff          	lea    rcx,[rbx-0x1]
 10aea99:	48 85 cb             	test   rbx,rcx
 10aea9c:	75 05                	jne    10aeaa3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275eb9>
 10aea9e:	48 21 c8             	and    rax,rcx
 10aeaa1:	eb 0d                	jmp    10aeab0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275ec6>
 10aeaa3:	48 39 d8             	cmp    rax,rbx
 10aeaa6:	72 08                	jb     10aeab0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275ec6>
 10aeaa8:	31 d2                	xor    edx,edx
 10aeaaa:	48 f7 f3             	div    rbx
 10aeaad:	48 89 d0             	mov    rax,rdx
 10aeab0:	48 c1 e0 03          	shl    rax,0x3
 10aeab4:	49 03 04 24          	add    rax,QWORD PTR [r12]
 10aeab8:	48 89 28             	mov    QWORD PTR [rax],rbp
 10aeabb:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 10aeac0:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 10aeac4:	49 ff 47 40          	inc    QWORD PTR [r15+0x40]
 10aeac8:	e8 4f 06 00 00       	call   10af11c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x276532>
 10aeacd:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 10aead2:	e8 c1 f9 ff ff       	call   10ae498 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2758ae>
 10aead7:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
 10aeadc:	48 83 c5 58          	add    rbp,0x58
 10aeae0:	48 89 ef             	mov    rdi,rbp
 10aeae3:	4c 89 f6             	mov    rsi,r14
 10aeae6:	e8 3f 0a 00 00       	call   10af52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x276940>
 10aeaeb:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
 10aeaef:	48 89 08             	mov    QWORD PTR [rax],rcx
 10aeaf2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10aeaf9:	00 00 
 10aeafb:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
 10aeb02:	00 
 10aeb03:	75 72                	jne    10aeb77 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275f8d>
 10aeb05:	48 81 c4 b8 00 00 00 	add    rsp,0xb8
 10aeb0c:	5b                   	pop    rbx
 10aeb0d:	41 5c                	pop    r12
 10aeb0f:	41 5d                	pop    r13
 10aeb11:	41 5e                	pop    r14
 10aeb13:	41 5f                	pop    r15
 10aeb15:	5d                   	pop    rbp
 10aeb16:	c3                   	ret
 10aeb17:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10aeb1e:	00 00 
 10aeb20:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
 10aeb27:	00 
 10aeb28:	75 4d                	jne    10aeb77 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275f8d>
 10aeb2a:	e8 b0 cb 9c ff       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>
 10aeb2f:	eb 00                	jmp    10aeb31 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275f47>
 10aeb31:	48 89 c3             	mov    rbx,rax
 10aeb34:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 10aeb39:	e8 de 05 00 00       	call   10af11c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x276532>
 10aeb3e:	eb 03                	jmp    10aeb43 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275f59>
 10aeb40:	48 89 c3             	mov    rbx,rax
 10aeb43:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 10aeb48:	e8 4b f9 ff ff       	call   10ae498 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2758ae>
 10aeb4d:	eb 0d                	jmp    10aeb5c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275f72>
 10aeb4f:	48 89 c3             	mov    rbx,rax
 10aeb52:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
 10aeb57:	e8 56 f9 ff ff       	call   10ae4b2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2758c8>
 10aeb5c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10aeb63:	00 00 
 10aeb65:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
 10aeb6c:	00 
 10aeb6d:	75 08                	jne    10aeb77 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275f8d>
 10aeb6f:	48 89 df             	mov    rdi,rbx
 10aeb72:	e8 59 11 9c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10aeb77:	e8 34 0f 74 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x184cb10 +0x38 -> 0x9d7de0
FDE= ('0x9d7de0', '0x9d7de1')
  9d7de0:	c3                   	ret

### AP 0x184cb10 +0x68 -> 0x9d7de0
FDE= ('0x9d7de0', '0x9d7de1')
  9d7de0:	c3                   	ret

### AP 0x184cbc8 +0x30 -> 0x10afa1c
FDE= ('0x10afa1c', '0x10afaa3')
 10afa1c:	53                   	push   rbx
 10afa1d:	48 89 fb             	mov    rbx,rdi
 10afa20:	48 8d 05 d1 d1 79 00 	lea    rax,[rip+0x79d1d1]        # 184cbf8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x92e0>
 10afa27:	48 89 07             	mov    QWORD PTR [rdi],rax
 10afa2a:	48 8d 05 4f d2 79 00 	lea    rax,[rip+0x79d24f]        # 184cc80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9368>
 10afa31:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
 10afa35:	48 8d 05 6c d2 79 00 	lea    rax,[rip+0x79d26c]        # 184cca8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9390>
 10afa3c:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 10afa40:	48 81 c7 30 01 00 00 	add    rdi,0x130
 10afa47:	e8 44 e4 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10afa4c:	48 8d bb 18 01 00 00 	lea    rdi,[rbx+0x118]
 10afa53:	e8 38 e4 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10afa58:	48 8d bb f0 00 00 00 	lea    rdi,[rbx+0xf0]
 10afa5f:	e8 02 2c a3 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
 10afa64:	48 8d bb d8 00 00 00 	lea    rdi,[rbx+0xd8]
 10afa6b:	e8 64 a1 72 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10afa70:	48 8b bb d0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xd0]
 10afa77:	e8 0a ea 9e ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10afa7c:	80 bb c0 00 00 00 00 	cmp    BYTE PTR [rbx+0xc0],0x0
 10afa83:	74 09                	je     10afa8e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x276ea4>
 10afa85:	48 8d 7b 68          	lea    rdi,[rbx+0x68]
 10afa89:	e8 3e ed 9e ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
 10afa8e:	80 7b 60 00          	cmp    BYTE PTR [rbx+0x60],0x0
 10afa92:	74 0d                	je     10afaa1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x276eb7>
 10afa94:	48 83 c3 30          	add    rbx,0x30
 10afa98:	48 89 df             	mov    rdi,rbx
 10afa9b:	5b                   	pop    rbx
 10afa9c:	e9 2b ed 9e ff       	jmp    a9e7cc <JNI_OnUnload@@Base+0x26099>
 10afaa1:	5b                   	pop    rbx
 10afaa2:	c3                   	ret

### AP 0x184cbc8 +0x38 -> 0x10afaa4
FDE= ('0x10afaa4', '0x10afab6')
 10afaa4:	53                   	push   rbx
 10afaa5:	48 89 fb             	mov    rbx,rdi
 10afaa8:	e8 6f ff ff ff       	call   10afa1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x276e32>
 10afaad:	48 89 df             	mov    rdi,rbx
 10afab0:	5b                   	pop    rbx
 10afab1:	e9 6a e4 73 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x184cbc8 +0x68 -> 0x10afc3a
FDE= ('0x10afc3a', '0x10afc98')
 10afc3a:	53                   	push   rbx
 10afc3b:	48 85 d2             	test   rdx,rdx
 10afc3e:	74 56                	je     10afc96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2770ac>
 10afc40:	48 89 fb             	mov    rbx,rdi
 10afc43:	48 89 f7             	mov    rdi,rsi
 10afc46:	48 89 d6             	mov    rsi,rdx
 10afc49:	e8 06 09 00 00       	call   10b0554 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27796a>
 10afc4e:	84 c0                	test   al,al
 10afc50:	74 44                	je     10afc96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2770ac>
 10afc52:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
 10afc56:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10afc59:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10afc5c:	83 38 03             	cmp    DWORD PTR [rax],0x3
 10afc5f:	75 17                	jne    10afc78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27708e>
 10afc61:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
 10afc65:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10afc68:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10afc6b:	84 c0                	test   al,al
 10afc6d:	74 09                	je     10afc78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27708e>
 10afc6f:	c6 83 e8 00 00 00 01 	mov    BYTE PTR [rbx+0xe8],0x1
 10afc76:	eb 1e                	jmp    10afc96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2770ac>
 10afc78:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 10afc7b:	48 89 df             	mov    rdi,rbx
 10afc7e:	ff 50 30             	call   QWORD PTR [rax+0x30]
 10afc81:	84 c0                	test   al,al
 10afc83:	74 11                	je     10afc96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2770ac>
 10afc85:	c6 83 e8 00 00 00 00 	mov    BYTE PTR [rbx+0xe8],0x0
 10afc8c:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
 10afc90:	5b                   	pop    rbx
 10afc91:	e9 ba 0a 00 00       	jmp    10b0750 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277b66>
 10afc96:	5b                   	pop    rbx
 10afc97:	c3                   	ret

### AP 0x184dae8 +0x28 -> 0x10c0bf2
FDE= ('0x10c0bf2', '0x10c0c39')
 10c0bf2:	41 57                	push   r15
 10c0bf4:	41 56                	push   r14
 10c0bf6:	53                   	push   rbx
 10c0bf7:	48 89 cb             	mov    rbx,rcx
 10c0bfa:	49 89 d6             	mov    r14,rdx
 10c0bfd:	49 89 f7             	mov    r15,rsi
 10c0c00:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
 10c0c04:	48 8b 77 18          	mov    rsi,QWORD PTR [rdi+0x18]
 10c0c08:	48 89 c7             	mov    rdi,rax
 10c0c0b:	4c 89 fa             	mov    rdx,r15
 10c0c0e:	e8 23 01 00 00       	call   10c0d36 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28814c>
 10c0c13:	48 85 c0             	test   rax,rax
 10c0c16:	74 1b                	je     10c0c33 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x288049>
 10c0c18:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 10c0c1b:	4c 8b 41 40          	mov    r8,QWORD PTR [rcx+0x40]
 10c0c1f:	48 89 c7             	mov    rdi,rax
 10c0c22:	4c 89 fe             	mov    rsi,r15
 10c0c25:	4c 89 f2             	mov    rdx,r14
 10c0c28:	48 89 d9             	mov    rcx,rbx
 10c0c2b:	5b                   	pop    rbx
 10c0c2c:	41 5e                	pop    r14
 10c0c2e:	41 5f                	pop    r15
 10c0c30:	41 ff e0             	jmp    r8
 10c0c33:	5b                   	pop    rbx
 10c0c34:	41 5e                	pop    r14
 10c0c36:	41 5f                	pop    r15
 10c0c38:	c3                   	ret

### AP 0x184dae8 +0x30 -> 0x10c0c3a
FDE= ('0x10c0c3a', '0x10c0c79')
 10c0c3a:	41 57                	push   r15
 10c0c3c:	41 56                	push   r14
 10c0c3e:	41 54                	push   r12
 10c0c40:	53                   	push   rbx
 10c0c41:	50                   	push   rax
 10c0c42:	4c 8b 7f 10          	mov    r15,QWORD PTR [rdi+0x10]
 10c0c46:	4c 8b 67 18          	mov    r12,QWORD PTR [rdi+0x18]
 10c0c4a:	4d 39 e7             	cmp    r15,r12
 10c0c4d:	74 1e                	je     10c0c6d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x288083>
 10c0c4f:	48 89 d3             	mov    rbx,rdx
 10c0c52:	49 89 f6             	mov    r14,rsi
 10c0c55:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
 10c0c58:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10c0c5b:	4c 89 f6             	mov    rsi,r14
 10c0c5e:	48 89 da             	mov    rdx,rbx
 10c0c61:	ff 50 58             	call   QWORD PTR [rax+0x58]
 10c0c64:	49 83 c7 08          	add    r15,0x8
 10c0c68:	4d 39 e7             	cmp    r15,r12
 10c0c6b:	75 e8                	jne    10c0c55 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28806b>
 10c0c6d:	48 83 c4 08          	add    rsp,0x8
 10c0c71:	5b                   	pop    rbx
 10c0c72:	41 5c                	pop    r12
 10c0c74:	41 5e                	pop    r14
 10c0c76:	41 5f                	pop    r15
 10c0c78:	c3                   	ret

### AP 0x184dae8 +0x38 -> 0x10c0c7a
FDE= ('0x10c0c7a', '0x10c0cb9')
 10c0c7a:	41 57                	push   r15
 10c0c7c:	41 56                	push   r14
 10c0c7e:	41 54                	push   r12
 10c0c80:	53                   	push   rbx
 10c0c81:	50                   	push   rax
 10c0c82:	4c 8b 7f 10          	mov    r15,QWORD PTR [rdi+0x10]
 10c0c86:	4c 8b 67 18          	mov    r12,QWORD PTR [rdi+0x18]
 10c0c8a:	4d 39 e7             	cmp    r15,r12
 10c0c8d:	74 1e                	je     10c0cad <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2880c3>
 10c0c8f:	48 89 d3             	mov    rbx,rdx
 10c0c92:	49 89 f6             	mov    r14,rsi
 10c0c95:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
 10c0c98:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10c0c9b:	4c 89 f6             	mov    rsi,r14
 10c0c9e:	48 89 da             	mov    rdx,rbx
 10c0ca1:	ff 50 60             	call   QWORD PTR [rax+0x60]
 10c0ca4:	49 83 c7 08          	add    r15,0x8
 10c0ca8:	4d 39 e7             	cmp    r15,r12
 10c0cab:	75 e8                	jne    10c0c95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2880ab>
 10c0cad:	48 83 c4 08          	add    rsp,0x8
 10c0cb1:	5b                   	pop    rbx
 10c0cb2:	41 5c                	pop    r12
 10c0cb4:	41 5e                	pop    r14
 10c0cb6:	41 5f                	pop    r15
 10c0cb8:	c3                   	ret

### AP 0x184dae8 +0x68 -> 0x9d7de0
FDE= ('0x9d7de0', '0x9d7de1')
  9d7de0:	c3                   	ret

### AP 0x184db40 +0x28 -> 0x9d7de0
FDE= ('0x9d7de0', '0x9d7de1')
  9d7de0:	c3                   	ret

### AP 0x184db40 +0x30 -> 0x10c0cfa
FDE= ('0x10c0cfa', '0x10c0d03')
 10c0cfa:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
 10c0cfe:	e9 63 fe ff ff       	jmp    10c0b66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287f7c>

### AP 0x184db40 +0x38 -> 0x9d7de0
FDE= ('0x9d7de0', '0x9d7de1')
  9d7de0:	c3                   	ret

### AP 0x184db40 +0x68 -> 0x9d7de0
FDE= ('0x9d7de0', '0x9d7de1')
  9d7de0:	c3                   	ret

### AP 0x184d5d0 +0x28 -> 0x10ba8a6
FDE= ('0x10ba8a6', '0x10ba8dd')
 10ba8a6:	48 83 ec 18          	sub    rsp,0x18
 10ba8aa:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ba8b1:	00 00 
 10ba8b3:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10ba8b8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba8bb:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10ba8c0:	ff 50 30             	call   QWORD PTR [rax+0x30]
 10ba8c3:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10ba8ca:	00 00 
 10ba8cc:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10ba8d1:	75 05                	jne    10ba8d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281cee>
 10ba8d3:	48 83 c4 18          	add    rsp,0x18
 10ba8d7:	c3                   	ret
 10ba8d8:	e8 d3 51 73 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x184d5d0 +0x30 -> 0x10ba8de
FDE= ('0x10ba8de', '0x10ba93d')
 10ba8de:	41 56                	push   r14
 10ba8e0:	53                   	push   rbx
 10ba8e1:	50                   	push   rax
 10ba8e2:	48 89 f3             	mov    rbx,rsi
 10ba8e5:	c7 06 02 00 00 00    	mov    DWORD PTR [rsi],0x2
 10ba8eb:	31 c0                	xor    eax,eax
 10ba8ed:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10ba8f1:	73 04                	jae    10ba8f7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281d0d>
 10ba8f3:	89 03                	mov    DWORD PTR [rbx],eax
 10ba8f5:	eb 38                	jmp    10ba92f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281d45>
 10ba8f7:	49 89 fe             	mov    r14,rdi
 10ba8fa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba8fd:	ff 90 a8 01 00 00    	call   QWORD PTR [rax+0x1a8]
 10ba903:	84 c0                	test   al,al
 10ba905:	74 28                	je     10ba92f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281d45>
 10ba907:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 10ba90b:	e8 9a 27 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10ba910:	84 c0                	test   al,al
 10ba912:	74 1b                	je     10ba92f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281d45>
 10ba914:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10ba918:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10ba91c:	e8 59 28 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10ba921:	34 01                	xor    al,0x1
 10ba923:	0f b6 c0             	movzx  eax,al
 10ba926:	8d 04 45 01 00 00 00 	lea    eax,[rax*2+0x1]
 10ba92d:	eb c4                	jmp    10ba8f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281d09>
 10ba92f:	83 3b 02             	cmp    DWORD PTR [rbx],0x2
 10ba932:	0f 92 c0             	setb   al
 10ba935:	48 83 c4 08          	add    rsp,0x8
 10ba939:	5b                   	pop    rbx
 10ba93a:	41 5e                	pop    r14
 10ba93c:	c3                   	ret

### AP 0x184d5d0 +0x38 -> 0x10ba93e
FDE= ('0x10ba93e', '0x10ba975')
 10ba93e:	48 83 ec 18          	sub    rsp,0x18
 10ba942:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ba949:	00 00 
 10ba94b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10ba950:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba953:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10ba958:	ff 50 40             	call   QWORD PTR [rax+0x40]
 10ba95b:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10ba962:	00 00 
 10ba964:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10ba969:	75 05                	jne    10ba970 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281d86>
 10ba96b:	48 83 c4 18          	add    rsp,0x18
 10ba96f:	c3                   	ret
 10ba970:	e8 3b 51 73 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x184d5d0 +0x68 -> 0x10baab4
FDE= ('0x10baab4', '0x10baaeb')
 10baab4:	48 83 ec 18          	sub    rsp,0x18
 10baab8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10baabf:	00 00 
 10baac1:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10baac6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10baac9:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10baace:	ff 50 70             	call   QWORD PTR [rax+0x70]
 10baad1:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10baad8:	00 00 
 10baada:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10baadf:	75 05                	jne    10baae6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281efc>
 10baae1:	48 83 c4 18          	add    rsp,0x18
 10baae5:	c3                   	ret
 10baae6:	e8 c5 4f 73 00       	call   17efab0 <__stack_chk_fail@plt>

### AP 0x184cfe8 +0x28 -> 0x9d7de0
FDE= ('0x9d7de0', '0x9d7de1')
  9d7de0:	c3                   	ret

### AP 0x184cfe8 +0x30 -> 0xa50370
FDE= ('0xa50370', '0xa50375')
  a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x184cfe8 +0x38 -> 0x10b2b32
FDE= ('0x10b2b32', '0x10b2b52')
 10b2b32:	53                   	push   rbx
 10b2b33:	48 89 fb             	mov    rbx,rdi
 10b2b36:	6a 18                	push   0x18
 10b2b38:	5f                   	pop    rdi
 10b2b39:	e8 c2 b3 73 00       	call   17edf00 <_Znwm@plt>
 10b2b3e:	48 8d 0d cb a4 79 00 	lea    rcx,[rip+0x79a4cb]        # 184d010 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x96f8>
 10b2b45:	48 89 08             	mov    QWORD PTR [rax],rcx
 10b2b48:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
 10b2b4c:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
 10b2b50:	5b                   	pop    rbx
 10b2b51:	c3                   	ret

### AP 0x184d220 +0x30 -> 0x10ab772
FDE= ('0x10ab772', '0x10ab791')
 10ab772:	53                   	push   rbx
 10ab773:	48 89 fb             	mov    rbx,rdi
 10ab776:	48 83 c7 58          	add    rdi,0x58
 10ab77a:	e8 e3 43 ba ff       	call   c4fb62 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19cb02>
 10ab77f:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
 10ab783:	e8 7c ff ff ff       	call   10ab704 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x272b1a>
 10ab788:	48 89 df             	mov    rdi,rbx
 10ab78b:	5b                   	pop    rbx
 10ab78c:	e9 53 84 53 00       	jmp    15e3be4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x429168>

### AP 0x184d220 +0x38 -> 0x10b80f2
FDE= ('0x10b80f2', '0x10b8104')
 10b80f2:	53                   	push   rbx
 10b80f3:	48 89 fb             	mov    rbx,rdi
 10b80f6:	e8 77 36 ff ff       	call   10ab772 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x272b88>
 10b80fb:	48 89 df             	mov    rdi,rbx
 10b80fe:	5b                   	pop    rbx
 10b80ff:	e9 1c 5e 73 00       	jmp    17edf20 <_ZdlPv@plt>

### AP 0x184d220 +0x68 -> 0x10b8272
FDE= ('0x10b8272', '0x10b8319')
 10b8272:	41 57                	push   r15
 10b8274:	41 56                	push   r14
 10b8276:	53                   	push   rbx
 10b8277:	48 83 ec 30          	sub    rsp,0x30
 10b827b:	49 89 ce             	mov    r14,rcx
 10b827e:	48 89 fb             	mov    rbx,rdi
 10b8281:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b8288:	00 00 
 10b828a:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
 10b828f:	48 8b 7e 20          	mov    rdi,QWORD PTR [rsi+0x20]
 10b8293:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10b8296:	48 8d 74 24 04       	lea    rsi,[rsp+0x4]
 10b829b:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10b829e:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
 10b82a3:	0f 57 c0             	xorps  xmm0,xmm0
 10b82a6:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
 10b82aa:	48 8d 0d cf 50 79 00 	lea    rcx,[rip+0x7950cf]        # 184d380 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9a68>
 10b82b1:	49 89 4f f8          	mov    QWORD PTR [r15-0x8],rcx
 10b82b5:	8b 4c 24 04          	mov    ecx,DWORD PTR [rsp+0x4]
 10b82b9:	83 f9 04             	cmp    ecx,0x4
 10b82bc:	6a 02                	push   0x2
 10b82be:	5a                   	pop    rdx
 10b82bf:	0f 42 d1             	cmovb  edx,ecx
 10b82c2:	41 89 57 10          	mov    DWORD PTR [r15+0x10],edx
 10b82c6:	41 88 47 14          	mov    BYTE PTR [r15+0x14],al
 10b82ca:	41 c7 47 08 03 00 00 	mov    DWORD PTR [r15+0x8],0x3
 10b82d1:	00 
 10b82d2:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
 10b82d5:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
 10b82da:	e8 7d 95 52 00       	call   15e185c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426de0>
 10b82df:	48 89 df             	mov    rdi,rbx
 10b82e2:	e8 4a 94 52 00       	call   15e1731 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426cb5>
 10b82e7:	4c 89 ff             	mov    rdi,r15
 10b82ea:	e8 19 27 9f ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 10b82ef:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b82f6:	00 00 
 10b82f8:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
 10b82fd:	75 0d                	jne    10b830c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27f722>
 10b82ff:	48 89 d8             	mov    rax,rbx
 10b8302:	48 83 c4 30          	add    rsp,0x30
 10b8306:	5b                   	pop    rbx
 10b8307:	41 5e                	pop    r14
 10b8309:	41 5f                	pop    r15
 10b830b:	c3                   	ret
 10b830c:	e8 9f 77 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10b8311:	48 89 c7             	mov    rdi,rax
 10b8314:	e8 8c 17 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

### AP 0x184da88 +0x28 -> 0xaa7024
FDE= ('0xaa7024', '0xaa7029')
  aa7024:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  aa7028:	c3                   	ret

### AP 0x184da88 +0x30 -> 0xbf7896
FDE= ('0xbf7896', '0xbf789b')
  bf7896:	48 8b 47 28          	mov    rax,QWORD PTR [rdi+0x28]
  bf789a:	c3                   	ret

### AP 0x184da88 +0x38 -> 0xb411a4
FDE= ('0xb411a4', '0xb411a9')
  b411a4:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
  b411a8:	c3                   	ret

### AP 0x184da88 +0x68 -> 0x10c0a92
FDE= ('0x10c0a92', '0x10c0aa4')
 10c0a92:	53                   	push   rbx
 10c0a93:	48 89 fb             	mov    rbx,rdi
 10c0a96:	e8 dd ff ff ff       	call   10c0a78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287e8e>
 10c0a9b:	48 89 df             	mov    rdi,rbx
 10c0a9e:	5b                   	pop    rbx
 10c0a9f:	e9 7c d4 72 00       	jmp    17edf20 <_ZdlPv@plt>

## AutomixSetupImpl factory 0xc05d20
FDE= ('0xc05d20', '0xc0724e')
  c05d20:	55                   	push   rbp
  c05d21:	41 57                	push   r15
  c05d23:	41 56                	push   r14
  c05d25:	41 55                	push   r13
  c05d27:	41 54                	push   r12
  c05d29:	53                   	push   rbx
  c05d2a:	48 81 ec 28 01 00 00 	sub    rsp,0x128
  c05d31:	49 89 fe             	mov    r14,rdi
  c05d34:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  c05d3b:	00 00 
  c05d3d:	48 89 84 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rax
  c05d44:	00 
  c05d45:	48 8b 6a 30          	mov    rbp,QWORD PTR [rdx+0x30]
  c05d49:	41 bc 50 04 00 00    	mov    r12d,0x450
  c05d4f:	4c 03 22             	add    r12,QWORD PTR [rdx]
  c05d52:	bf d0 00 00 00       	mov    edi,0xd0
  c05d57:	e8 a4 81 be 00       	call   17edf00 <_Znwm@plt>
  c05d5c:	48 89 c3             	mov    rbx,rax
  c05d5f:	31 c0                	xor    eax,eax
  c05d61:	88 43 08             	mov    BYTE PTR [rbx+0x8],al
  c05d64:	48 8d 0d 95 e9 c0 00 	lea    rcx,[rip+0xc0e995]        # 1814700 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa3c0>
  c05d6b:	48 89 0b             	mov    QWORD PTR [rbx],rcx
  c05d6e:	48 c7 43 10 30 75 00 	mov    QWORD PTR [rbx+0x10],0x7530
  c05d75:	00 
  c05d76:	0f 28 05 b3 7d 78 ff 	movaps xmm0,XMMWORD PTR [rip+0xffffffffff787db3]        # 38db30 <_ZTSSt12bad_any_cast@@Base-0x2698>
  c05d7d:	0f 11 43 18          	movups XMMWORD PTR [rbx+0x18],xmm0
  c05d81:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  c05d85:	0f 28 05 24 6e 78 ff 	movaps xmm0,XMMWORD PTR [rip+0xffffffffff786e24]        # 38cbb0 <_ZTSSt12bad_any_cast@@Base-0x3618>
  c05d8c:	0f 11 43 2c          	movups XMMWORD PTR [rbx+0x2c],xmm0
  c05d90:	88 43 3c             	mov    BYTE PTR [rbx+0x3c],al
  c05d93:	48 b9 00 00 00 00 0a 	movabs rcx,0x3c23d70a00000000
  c05d9a:	d7 23 3c 
  c05d9d:	48 89 4b 40          	mov    QWORD PTR [rbx+0x40],rcx
  c05da1:	48 c7 43 48 88 13 00 	mov    QWORD PTR [rbx+0x48],0x1388
  c05da8:	00 
  c05da9:	88 43 50             	mov    BYTE PTR [rbx+0x50],al
  c05dac:	0f 28 05 fd 74 78 ff 	movaps xmm0,XMMWORD PTR [rip+0xffffffffff7874fd]        # 38d2b0 <_ZTSSt12bad_any_cast@@Base-0x2f18>
  c05db3:	0f 11 43 54          	movups XMMWORD PTR [rbx+0x54],xmm0
  c05db7:	c7 43 64 33 33 73 3f 	mov    DWORD PTR [rbx+0x64],0x3f733333
  c05dbe:	88 43 68             	mov    BYTE PTR [rbx+0x68],al
  c05dc1:	0f 28 05 d8 76 78 ff 	movaps xmm0,XMMWORD PTR [rip+0xffffffffff7876d8]        # 38d4a0 <_ZTSSt12bad_any_cast@@Base-0x2d28>
  c05dc8:	0f 11 43 6c          	movups XMMWORD PTR [rbx+0x6c],xmm0
  c05dcc:	0f 28 05 1d 84 78 ff 	movaps xmm0,XMMWORD PTR [rip+0xffffffffff78841d]        # 38e1f0 <_ZTSSt12bad_any_cast@@Base-0x1fd8>
  c05dd3:	0f 11 43 7c          	movups XMMWORD PTR [rbx+0x7c],xmm0
  c05dd7:	c7 83 8c 00 00 00 03 	mov    DWORD PTR [rbx+0x8c],0x3
  c05dde:	00 00 00 
  c05de1:	0f 28 05 48 81 78 ff 	movaps xmm0,XMMWORD PTR [rip+0xffffffffff788148]        # 38df30 <_ZTSSt12bad_any_cast@@Base-0x2298>
  c05de8:	0f 11 83 90 00 00 00 	movups XMMWORD PTR [rbx+0x90],xmm0
  c05def:	f2 0f 10 05 69 7b 78 	movsd  xmm0,QWORD PTR [rip+0xffffffffff787b69]        # 38d960 <_ZTSSt12bad_any_cast@@Base-0x2868>
  c05df6:	ff 
  c05df7:	f2 0f 11 83 a0 00 00 	movsd  QWORD PTR [rbx+0xa0],xmm0
  c05dfe:	00 
  c05dff:	88 83 a8 00 00 00    	mov    BYTE PTR [rbx+0xa8],al
  c05e05:	48 c7 83 ac 00 00 00 	mov    QWORD PTR [rbx+0xac],0x3f000000
  c05e0c:	00 00 00 3f 
  c05e10:	48 c7 83 b8 00 00 00 	mov    QWORD PTR [rbx+0xb8],0x2710
  c05e17:	10 27 00 00 
  c05e1b:	48 8d 83 c0 00 00 00 	lea    rax,[rbx+0xc0]
  c05e22:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
  c05e29:	00 
  c05e2a:	48 83 a3 c0 00 00 00 	and    QWORD PTR [rbx+0xc0],0x0
  c05e31:	00 
  c05e32:	6a 08                	push   0x8
  c05e34:	5f                   	pop    rdi
  c05e35:	e8 c6 80 be 00       	call   17edf00 <_Znwm@plt>
  c05e3a:	49 89 c5             	mov    r13,rax
  c05e3d:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
  c05e42:	48 8d 05 27 e9 c0 00 	lea    rax,[rip+0xc0e927]        # 1814770 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa430>
  c05e49:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
  c05e4d:	6a 68                	push   0x68
  c05e4f:	5f                   	pop    rdi
  c05e50:	e8 ab 80 be 00       	call   17edf00 <_Znwm@plt>
  c05e55:	49 89 c6             	mov    r14,rax
  c05e58:	48 8d 05 e9 e8 c0 00 	lea    rax,[rip+0xc0e8e9]        # 1814748 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa408>
  c05e5f:	49 89 06             	mov    QWORD PTR [r14],rax
  c05e62:	4d 8d 7e 08          	lea    r15,[r14+0x8]
  c05e66:	4c 89 ff             	mov    rdi,r15
  c05e69:	4c 89 e6             	mov    rsi,r12
  c05e6c:	e8 cf 80 be 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  c05e71:	0f 57 c0             	xorps  xmm0,xmm0
  c05e74:	49 83 66 30 00       	and    QWORD PTR [r14+0x30],0x0
  c05e79:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
  c05e7e:	4d 89 6e 38          	mov    QWORD PTR [r14+0x38],r13
  c05e82:	31 c0                	xor    eax,eax
  c05e84:	41 88 46 40          	mov    BYTE PTR [r14+0x40],al
  c05e88:	41 88 46 58          	mov    BYTE PTR [r14+0x58],al
  c05e8c:	49 83 66 60 00       	and    QWORD PTR [r14+0x60],0x0
  c05e91:	41 f6 46 08 01       	test   BYTE PTR [r14+0x8],0x1
  c05e96:	74 06                	je     c05e9e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x152e3e>
  c05e98:	4d 8b 46 18          	mov    r8,QWORD PTR [r14+0x18]
  c05e9c:	eb 04                	jmp    c05ea2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x152e42>
  c05e9e:	4d 8d 46 09          	lea    r8,[r14+0x9]
  c05ea2:	4d 8d 6e 20          	lea    r13,[r14+0x20]
  c05ea6:	48 8d 35 cf c0 84 ff 	lea    rsi,[rip+0xffffffffff84c0cf]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
  c05ead:	48 8d 0d be 39 77 ff 	lea    rcx,[rip+0xffffffffff7739be]        # 379872 <_ZTSSt12bad_any_cast@@Base-0x16956>
  c05eb4:	6a 04                	push   0x4
  c05eb6:	5f                   	pop    rdi
  c05eb7:	6a 0e                	push   0xe
  c05eb9:	5a                   	pop    rdx
  c05eba:	31 c0                	xor    eax,eax
  c05ebc:	e8 11 0a bd 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
  c05ec1:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]
  c05ec5:	41 8b 7e 08          	mov    edi,DWORD PTR [r14+0x8]
  c05ec9:	e8 52 59 e7 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
  c05ece:	84 c0                	test   al,al
  c05ed0:	74 0f                	je     c05ee1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x152e81>
  c05ed2:	48 8d 35 ee 92 75 ff 	lea    rsi,[rip+0xffffffffff7592ee]        # 35f1c7 <_ZTSSt12bad_any_cast@@Base-0x31001>
  c05ed9:	4c 89 ff             	mov    rdi,r15
  c05edc:	e8 9f 80 be 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
  c05ee1:	6a 2d                	push   0x2d
  c05ee3:	5e                   	pop    rsi
  c05ee4:	4c 89 ff             	mov    rdi,r15
  c05ee7:	31 d2                	xor    edx,edx
  c05ee9:	e8 d2 88 be 00       	call   17ee7c0 <_ZNKSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE4findEcm@plt>
  c05eee:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
  c05ef2:	74 17                	je     c05f0b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x152eab>
  c05ef4:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  c05efb:	00 
  c05efc:	4c 89 fe             	mov    rsi,r15
  c05eff:	31 d2                	xor    edx,edx
  c05f01:	48 89 c1             	mov    rcx,rax
  c05f04:	e8 1b 77 eb ff       	call   abd624 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5c4>
  c05f09:	eb 2c                	jmp    c05f37 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x152ed7>
  c05f0b:	6a 5f                	push   0x5f
  c05f0d:	5e                   	pop    rsi
  c05f0e:	4c 89 ff             	mov    rdi,r15
  c05f11:	31 d2                	xor    edx,edx
  c05f13:	e8 a8 88 be 00       	call   17ee7c0 <_ZNKSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE4findEcm@plt>
  c05f18:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
  c05f1c:	0f 84 0e 12 00 00    	je     c07130 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1540d0>
  c05f22:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  c05f29:	00 
  c05f2a:	4c 89 fe             	mov    rsi,r15
  c05f2d:	31 d2                	xor    edx,edx
  c05f2f:	48 89 c1             	mov    rcx,rax
  c05f32:	e8 ed 76 eb ff       	call   abd624 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5c4>
  c05f37:	4c 8d bc 24 d8 00 00 	lea    r15,[rsp+0xd8]
  c05f3e:	00 
  c05f3f:	4c 89 ef             	mov    rdi,r13
  c05f42:	4c 89 fe             	mov    rsi,r15
  c05f45:	e8 e4 5a e7 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
  c05f4a:	4c 89 ff             	mov    rdi,r15
  c05f4d:	e8 3e 7f be 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  c05f52:	48 8d 83 c8 00 00 00 	lea    rax,[rbx+0xc8]
  c05f59:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
  c05f60:	00 
  c05f61:	4c 89 30             	mov    QWORD PTR [rax],r14
  c05f64:	48 8d 3d 75 41 dd 00 	lea    rdi,[rip+0xdd4175]        # 19da0e0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0xa2d28>
  c05f6b:	e8 10 ac be 00       	call   17f0b80 <__emutls_get_address@plt>
  c05f70:	48 8b 30             	mov    rsi,QWORD PTR [rax]
  c05f73:	48 85 f6             	test   rsi,rsi
  c05f76:	74 32                	je     c05faa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x152f4a>
  c05f78:	48 8d 05 99 bc 84 ff 	lea    rax,[rip+0xffffffffff84bc99]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
  c05f7f:	48 8d 8c 24 d8 00 00 	lea    rcx,[rsp+0xd8]
  c05f86:	00 
  c05f87:	48 89 01             	mov    QWORD PTR [rcx],rax
  c05f8a:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
  c05f8e:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
  c05f93:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  c05f96:	48 8d 15 c7 cf 77 ff 	lea    rdx,[rip+0xffffffffff77cfc7]        # 382f64 <_ZTSSt12bad_any_cast@@Base-0xd264>
  c05f9d:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
  c05fa4:	00 
  c05fa5:	ff 50 60             	call   QWORD PTR [rax+0x60]
  c05fa8:	eb 09                	jmp    c05fb3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x152f53>
  c05faa:	48 83 a4 24 b8 00 00 	and    QWORD PTR [rsp+0xb8],0x0
  c05fb1:	00 00 
  c05fb3:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c05fb7:	41 bf e8 03 00 00    	mov    r15d,0x3e8
  c05fbd:	48 8d 35 af 13 7c ff 	lea    rsi,[rip+0xffffffffff7c13af]        # 3c7373 <_ZTSN5boost9exceptionE@@Base+0x27d55>
  c05fc4:	48 8d 0d b5 13 7c ff 	lea    rcx,[rip+0xffffffffff7c13b5]        # 3c7380 <_ZTSN5boost9exceptionE@@Base+0x27d62>
  c05fcb:	6a 0c                	push   0xc
  c05fcd:	41 5e                	pop    r14
  c05fcf:	6a 22                	push   0x22
  c05fd1:	41 58                	pop    r8
  c05fd3:	6a 23                	push   0x23
  c05fd5:	41 59                	pop    r9
  c05fd7:	4c 89 f2             	mov    rdx,r14
  c05fda:	41 57                	push   r15
  c05fdc:	6a 00                	push   0x0
  c05fde:	e8 0f 16 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c05fe3:	48 83 c4 10          	add    rsp,0x10
  c05fe7:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c05feb:	48 8d 35 b1 13 7c ff 	lea    rsi,[rip+0xffffffffff7c13b1]        # 3c73a3 <_ZTSN5boost9exceptionE@@Base+0x27d85>
  c05ff2:	48 8d 0d b7 13 7c ff 	lea    rcx,[rip+0xffffffffff7c13b7]        # 3c73b0 <_ZTSN5boost9exceptionE@@Base+0x27d92>
  c05ff9:	6a 2a                	push   0x2a
  c05ffb:	41 58                	pop    r8
  c05ffd:	4c 89 f2             	mov    rdx,r14
  c06000:	41 b9 c8 00 00 00    	mov    r9d,0xc8
  c06006:	41 57                	push   r15
  c06008:	6a 00                	push   0x0
  c0600a:	e8 e3 15 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c0600f:	48 83 c4 10          	add    rsp,0x10
  c06013:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06017:	48 8d 35 bd 13 7c ff 	lea    rsi,[rip+0xffffffffff7c13bd]        # 3c73db <_ZTSN5boost9exceptionE@@Base+0x27dbd>
  c0601e:	48 8d 0d cb 13 7c ff 	lea    rcx,[rip+0xffffffffff7c13cb]        # 3c73f0 <_ZTSN5boost9exceptionE@@Base+0x27dd2>
  c06025:	6a 1f                	push   0x1f
  c06027:	41 58                	pop    r8
  c06029:	6a 10                	push   0x10
  c0602b:	41 59                	pop    r9
  c0602d:	4c 89 f2             	mov    rdx,r14
  c06030:	6a 20                	push   0x20
  c06032:	6a 00                	push   0x0
  c06034:	e8 b9 15 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c06039:	48 83 c4 10          	add    rsp,0x10
  c0603d:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06041:	6a 32                	push   0x32
  c06043:	58                   	pop    rax
  c06044:	48 8d 35 c5 13 7c ff 	lea    rsi,[rip+0xffffffffff7c13c5]        # 3c7410 <_ZTSN5boost9exceptionE@@Base+0x27df2>
  c0604b:	48 8d 0d ce 13 7c ff 	lea    rcx,[rip+0xffffffffff7c13ce]        # 3c7420 <_ZTSN5boost9exceptionE@@Base+0x27e02>
  c06052:	6a 28                	push   0x28
  c06054:	41 5c                	pop    r12
  c06056:	6a 0a                	push   0xa
  c06058:	41 59                	pop    r9
  c0605a:	4c 89 f2             	mov    rdx,r14
  c0605d:	4d 89 e0             	mov    r8,r12
  c06060:	50                   	push   rax
  c06061:	6a 00                	push   0x0
  c06063:	e8 8a 15 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c06068:	48 83 c4 10          	add    rsp,0x10
  c0606c:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06070:	6a 64                	push   0x64
  c06072:	41 5f                	pop    r15
  c06074:	48 8d 35 ce 13 7c ff 	lea    rsi,[rip+0xffffffffff7c13ce]        # 3c7449 <_ZTSN5boost9exceptionE@@Base+0x27e2b>
  c0607b:	48 8d 0d de 13 7c ff 	lea    rcx,[rip+0xffffffffff7c13de]        # 3c7460 <_ZTSN5boost9exceptionE@@Base+0x27e42>
  c06082:	6a 24                	push   0x24
  c06084:	41 58                	pop    r8
  c06086:	6a 28                	push   0x28
  c06088:	41 59                	pop    r9
  c0608a:	4c 89 f2             	mov    rdx,r14
  c0608d:	41 57                	push   r15
  c0608f:	6a 00                	push   0x0
  c06091:	e8 5c 15 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c06096:	48 83 c4 10          	add    rsp,0x10
  c0609a:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c0609e:	48 8d 35 e0 13 7c ff 	lea    rsi,[rip+0xffffffffff7c13e0]        # 3c7485 <_ZTSN5boost9exceptionE@@Base+0x27e67>
  c060a5:	48 8d 0d f4 13 7c ff 	lea    rcx,[rip+0xffffffffff7c13f4]        # 3c74a0 <_ZTSN5boost9exceptionE@@Base+0x27e82>
  c060ac:	6a 2c                	push   0x2c
  c060ae:	41 58                	pop    r8
  c060b0:	6a 01                	push   0x1
  c060b2:	41 59                	pop    r9
  c060b4:	4c 89 f2             	mov    rdx,r14
  c060b7:	e8 a2 14 9e 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  c060bc:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c060c0:	48 8d 35 06 14 7c ff 	lea    rsi,[rip+0xffffffffff7c1406]        # 3c74cd <_ZTSN5boost9exceptionE@@Base+0x27eaf>
  c060c7:	48 8d 0d 12 14 7c ff 	lea    rcx,[rip+0xffffffffff7c1412]        # 3c74e0 <_ZTSN5boost9exceptionE@@Base+0x27ec2>
  c060ce:	6a 2d                	push   0x2d
  c060d0:	41 5d                	pop    r13
  c060d2:	6a 05                	push   0x5
  c060d4:	41 59                	pop    r9
  c060d6:	4c 89 f2             	mov    rdx,r14
  c060d9:	4d 89 e8             	mov    r8,r13
  c060dc:	41 57                	push   r15
  c060de:	6a 01                	push   0x1
  c060e0:	e8 0d 15 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c060e5:	48 83 c4 10          	add    rsp,0x10
  c060e9:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c060ed:	48 8d 35 1a 14 7c ff 	lea    rsi,[rip+0xffffffffff7c141a]        # 3c750e <_ZTSN5boost9exceptionE@@Base+0x27ef0>
  c060f4:	48 8d 0d 25 14 7c ff 	lea    rcx,[rip+0xffffffffff7c1425]        # 3c7520 <_ZTSN5boost9exceptionE@@Base+0x27f02>
  c060fb:	4c 89 f2             	mov    rdx,r14
  c060fe:	4d 89 e0             	mov    r8,r12
  c06101:	41 b9 e8 03 00 00    	mov    r9d,0x3e8
  c06107:	68 10 27 00 00       	push   0x2710
  c0610c:	41 57                	push   r15
  c0610e:	e8 df 14 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c06113:	48 83 c4 10          	add    rsp,0x10
  c06117:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c0611b:	48 8d 35 27 14 7c ff 	lea    rsi,[rip+0xffffffffff7c1427]        # 3c7549 <_ZTSN5boost9exceptionE@@Base+0x27f2b>
  c06122:	48 8d 0d 37 14 7c ff 	lea    rcx,[rip+0xffffffffff7c1437]        # 3c7560 <_ZTSN5boost9exceptionE@@Base+0x27f42>
  c06129:	4c 89 f2             	mov    rdx,r14
  c0612c:	6a 2a                	push   0x2a
  c0612e:	41 58                	pop    r8
  c06130:	41 b9 f4 01 00 00    	mov    r9d,0x1f4
  c06136:	68 88 13 00 00       	push   0x1388
  c0613b:	6a 32                	push   0x32
  c0613d:	58                   	pop    rax
  c0613e:	50                   	push   rax
  c0613f:	e8 ae 14 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c06144:	48 83 c4 10          	add    rsp,0x10
  c06148:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c0614c:	48 8d 35 38 14 7c ff 	lea    rsi,[rip+0xffffffffff7c1438]        # 3c758b <_ZTSN5boost9exceptionE@@Base+0x27f6d>
  c06153:	48 8d 0d 46 14 7c ff 	lea    rcx,[rip+0xffffffffff7c1446]        # 3c75a0 <_ZTSN5boost9exceptionE@@Base+0x27f82>
  c0615a:	4c 89 f2             	mov    rdx,r14
  c0615d:	4d 89 e8             	mov    r8,r13
  c06160:	6a 28                	push   0x28
  c06162:	41 59                	pop    r9
  c06164:	41 57                	push   r15
  c06166:	6a 00                	push   0x0
  c06168:	e8 85 14 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c0616d:	48 83 c4 10          	add    rsp,0x10
  c06171:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06175:	48 8d 35 52 14 7c ff 	lea    rsi,[rip+0xffffffffff7c1452]        # 3c75ce <_ZTSN5boost9exceptionE@@Base+0x27fb0>
  c0617c:	48 8d 0d 5d 14 7c ff 	lea    rcx,[rip+0xffffffffff7c145d]        # 3c75e0 <_ZTSN5boost9exceptionE@@Base+0x27fc2>
  c06183:	6a 34                	push   0x34
  c06185:	41 58                	pop    r8
  c06187:	4c 89 f2             	mov    rdx,r14
  c0618a:	45 31 c9             	xor    r9d,r9d
  c0618d:	e8 cc 13 9e 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  c06192:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
  c06196:	48 8d 35 2e 81 76 ff 	lea    rsi,[rip+0xffffffffff76812e]        # 36e2cb <_ZTSSt12bad_any_cast@@Base-0x21efd>
  c0619d:	4c 8d bc 24 d8 00 00 	lea    r15,[rsp+0xd8]
  c061a4:	00 
  c061a5:	4c 89 ff             	mov    rdi,r15
  c061a8:	e8 d1 38 e7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  c061ad:	4c 8d ac 24 f0 00 00 	lea    r13,[rsp+0xf0]
  c061b4:	00 
  c061b5:	48 8d 35 a9 14 7c ff 	lea    rsi,[rip+0xffffffffff7c14a9]        # 3c7665 <_ZTSN5boost9exceptionE@@Base+0x28047>
  c061bc:	4c 89 ef             	mov    rdi,r13
  c061bf:	e8 ba 38 e7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  c061c4:	4c 8d ac 24 08 01 00 	lea    r13,[rsp+0x108]
  c061cb:	00 
  c061cc:	48 8d 35 37 49 72 ff 	lea    rsi,[rip+0xffffffffff724937]        # 32ab0a <_ZTSSt12bad_any_cast@@Base-0x656be>
  c061d3:	4c 89 ef             	mov    rdi,r13
  c061d6:	e8 a3 38 e7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  c061db:	4c 8d bc 24 c0 00 00 	lea    r15,[rsp+0xc0]
  c061e2:	00 
  c061e3:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
  c061ea:	00 
  c061eb:	6a 03                	push   0x3
  c061ed:	5a                   	pop    rdx
  c061ee:	4c 89 ff             	mov    rdi,r15
  c061f1:	e8 62 12 ea ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  c061f6:	48 89 d8             	mov    rax,rbx
  c061f9:	48 83 c0 10          	add    rax,0x10
  c061fd:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
  c06204:	00 
  c06205:	6a 30                	push   0x30
  c06207:	41 5c                	pop    r12
  c06209:	4a 8d 3c 24          	lea    rdi,[rsp+r12*1]
  c0620d:	48 81 c7 d8 00 00 00 	add    rdi,0xd8
  c06214:	e8 77 7c be 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  c06219:	49 83 c4 e8          	add    r12,0xffffffffffffffe8
  c0621d:	49 83 fc e8          	cmp    r12,0xffffffffffffffe8
  c06221:	75 e6                	jne    c06209 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1531a9>
  c06223:	48 8d 35 eb 13 7c ff 	lea    rsi,[rip+0xffffffffff7c13eb]        # 3c7615 <_ZTSN5boost9exceptionE@@Base+0x27ff7>
  c0622a:	48 8d 0d ff 13 7c ff 	lea    rcx,[rip+0xffffffffff7c13ff]        # 3c7630 <_ZTSN5boost9exceptionE@@Base+0x28012>
  c06231:	4c 8d 0d 2d 14 7c ff 	lea    r9,[rip+0xffffffffff7c142d]        # 3c7665 <_ZTSN5boost9exceptionE@@Base+0x28047>
  c06238:	6a 0c                	push   0xc
  c0623a:	41 5c                	pop    r12
  c0623c:	6a 34                	push   0x34
  c0623e:	41 58                	pop    r8
  c06240:	4c 89 f7             	mov    rdi,r14
  c06243:	4c 89 e2             	mov    rdx,r12
  c06246:	41 57                	push   r15
  c06248:	6a 05                	push   0x5
  c0624a:	e8 3f 14 9e 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
  c0624f:	58                   	pop    rax
  c06250:	59                   	pop    rcx
  c06251:	4c 89 ff             	mov    rdi,r15
  c06254:	e8 8f 53 e7 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
  c06259:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c0625d:	b8 30 75 00 00       	mov    eax,0x7530
  c06262:	48 8d 35 02 14 7c ff 	lea    rsi,[rip+0xffffffffff7c1402]        # 3c766b <_ZTSN5boost9exceptionE@@Base+0x2804d>
  c06269:	48 8d 0d 10 14 7c ff 	lea    rcx,[rip+0xffffffffff7c1410]        # 3c7680 <_ZTSN5boost9exceptionE@@Base+0x28062>
  c06270:	6a 37                	push   0x37
  c06272:	41 58                	pop    r8
  c06274:	4c 89 e2             	mov    rdx,r12
  c06277:	41 b9 88 13 00 00    	mov    r9d,0x1388
  c0627d:	50                   	push   rax
  c0627e:	6a 00                	push   0x0
  c06280:	e8 6d 13 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c06285:	48 83 c4 10          	add    rsp,0x10
  c06289:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c0628d:	48 8d 35 24 14 7c ff 	lea    rsi,[rip+0xffffffffff7c1424]        # 3c76b8 <_ZTSN5boost9exceptionE@@Base+0x2809a>
  c06294:	48 8d 0d 35 14 7c ff 	lea    rcx,[rip+0xffffffffff7c1435]        # 3c76d0 <_ZTSN5boost9exceptionE@@Base+0x280b2>
  c0629b:	6a 35                	push   0x35
  c0629d:	41 58                	pop    r8
  c0629f:	4c 89 e2             	mov    rdx,r12
  c062a2:	45 31 c9             	xor    r9d,r9d
  c062a5:	e8 b4 12 9e 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  c062aa:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c062ae:	41 bd e8 03 00 00    	mov    r13d,0x3e8
  c062b4:	48 8d 35 4b 14 7c ff 	lea    rsi,[rip+0xffffffffff7c144b]        # 3c7706 <_ZTSN5boost9exceptionE@@Base+0x280e8>
  c062bb:	48 8d 0d 5e 14 7c ff 	lea    rcx,[rip+0xffffffffff7c145e]        # 3c7720 <_ZTSN5boost9exceptionE@@Base+0x28102>
  c062c2:	6a 2b                	push   0x2b
  c062c4:	41 58                	pop    r8
  c062c6:	4c 89 e2             	mov    rdx,r12
  c062c9:	41 b9 20 03 00 00    	mov    r9d,0x320
  c062cf:	41 55                	push   r13
  c062d1:	6a 00                	push   0x0
  c062d3:	e8 1a 13 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c062d8:	48 83 c4 10          	add    rsp,0x10
  c062dc:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c062e0:	48 8d 35 65 14 7c ff 	lea    rsi,[rip+0xffffffffff7c1465]        # 3c774c <_ZTSN5boost9exceptionE@@Base+0x2812e>
  c062e7:	48 8d 0d 72 14 7c ff 	lea    rcx,[rip+0xffffffffff7c1472]        # 3c7760 <_ZTSN5boost9exceptionE@@Base+0x28142>
  c062ee:	6a 29                	push   0x29
  c062f0:	41 58                	pop    r8
  c062f2:	4c 89 e2             	mov    rdx,r12
  c062f5:	41 b9 20 03 00 00    	mov    r9d,0x320
  c062fb:	41 55                	push   r13
  c062fd:	6a 00                	push   0x0
  c062ff:	e8 ee 12 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c06304:	48 83 c4 10          	add    rsp,0x10
  c06308:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c0630c:	48 8d 35 77 14 7c ff 	lea    rsi,[rip+0xffffffffff7c1477]        # 3c778a <_ZTSN5boost9exceptionE@@Base+0x2816c>
  c06313:	48 8d 0d 86 14 7c ff 	lea    rcx,[rip+0xffffffffff7c1486]        # 3c77a0 <_ZTSN5boost9exceptionE@@Base+0x28182>
  c0631a:	6a 2c                	push   0x2c
  c0631c:	41 5f                	pop    r15
  c0631e:	4c 89 e2             	mov    rdx,r12
  c06321:	4d 89 f8             	mov    r8,r15
  c06324:	41 b9 e8 03 00 00    	mov    r9d,0x3e8
  c0632a:	41 55                	push   r13
  c0632c:	6a 00                	push   0x0
  c0632e:	e8 bf 12 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c06333:	48 83 c4 10          	add    rsp,0x10
  c06337:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c0633b:	48 8d 35 8b 14 7c ff 	lea    rsi,[rip+0xffffffffff7c148b]        # 3c77cd <_ZTSN5boost9exceptionE@@Base+0x281af>
  c06342:	48 8d 0d 97 14 7c ff 	lea    rcx,[rip+0xffffffffff7c1497]        # 3c77e0 <_ZTSN5boost9exceptionE@@Base+0x281c2>
  c06349:	4c 89 e2             	mov    rdx,r12
  c0634c:	4d 89 f8             	mov    r8,r15
  c0634f:	41 b9 f4 01 00 00    	mov    r9d,0x1f4
  c06355:	68 10 27 00 00       	push   0x2710
  c0635a:	6a 00                	push   0x0
  c0635c:	e8 91 12 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c06361:	48 83 c4 10          	add    rsp,0x10
  c06365:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06369:	48 8d 35 9d 14 7c ff 	lea    rsi,[rip+0xffffffffff7c149d]        # 3c780d <_ZTSN5boost9exceptionE@@Base+0x281ef>
  c06370:	48 8d 0d a9 14 7c ff 	lea    rcx,[rip+0xffffffffff7c14a9]        # 3c7820 <_ZTSN5boost9exceptionE@@Base+0x28202>
  c06377:	6a 2f                	push   0x2f
  c06379:	41 5e                	pop    r14
  c0637b:	4c 89 e2             	mov    rdx,r12
  c0637e:	4d 89 f0             	mov    r8,r14
  c06381:	41 b9 b6 03 00 00    	mov    r9d,0x3b6
  c06387:	41 55                	push   r13
  c06389:	6a 00                	push   0x0
  c0638b:	e8 62 12 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c06390:	48 83 c4 10          	add    rsp,0x10
  c06394:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06398:	48 8d 35 b1 14 7c ff 	lea    rsi,[rip+0xffffffffff7c14b1]        # 3c7850 <_ZTSN5boost9exceptionE@@Base+0x28232>
  c0639f:	48 8d 0d ba 14 7c ff 	lea    rcx,[rip+0xffffffffff7c14ba]        # 3c7860 <_ZTSN5boost9exceptionE@@Base+0x28242>
  c063a6:	6a 28                	push   0x28
  c063a8:	41 58                	pop    r8
  c063aa:	4c 89 e2             	mov    rdx,r12
  c063ad:	6a 01                	push   0x1
  c063af:	41 59                	pop    r9
  c063b1:	e8 a8 11 9e 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  c063b6:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c063ba:	48 8d 35 c8 14 7c ff 	lea    rsi,[rip+0xffffffffff7c14c8]        # 3c7889 <_ZTSN5boost9exceptionE@@Base+0x2826b>
  c063c1:	48 8d 0d d8 14 7c ff 	lea    rcx,[rip+0xffffffffff7c14d8]        # 3c78a0 <_ZTSN5boost9exceptionE@@Base+0x28282>
  c063c8:	6a 2a                	push   0x2a
  c063ca:	41 58                	pop    r8
  c063cc:	4c 89 e2             	mov    rdx,r12
  c063cf:	41 b9 96 00 00 00    	mov    r9d,0x96
  c063d5:	41 55                	push   r13
  c063d7:	6a 00                	push   0x0
  c063d9:	e8 14 12 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c063de:	48 83 c4 10          	add    rsp,0x10
  c063e2:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c063e6:	48 8d 35 de 14 7c ff 	lea    rsi,[rip+0xffffffffff7c14de]        # 3c78cb <_ZTSN5boost9exceptionE@@Base+0x282ad>
  c063ed:	48 8d 0d ec 14 7c ff 	lea    rcx,[rip+0xffffffffff7c14ec]        # 3c78e0 <_ZTSN5boost9exceptionE@@Base+0x282c2>
  c063f4:	6a 30                	push   0x30
  c063f6:	41 58                	pop    r8
  c063f8:	4c 89 e2             	mov    rdx,r12
  c063fb:	41 b9 90 5f 01 00    	mov    r9d,0x15f90
  c06401:	68 40 42 0f 00       	push   0xf4240
  c06406:	6a 00                	push   0x0
  c06408:	e8 e5 11 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c0640d:	48 83 c4 10          	add    rsp,0x10
  c06411:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06415:	48 8d 35 f5 14 7c ff 	lea    rsi,[rip+0xffffffffff7c14f5]        # 3c7911 <_ZTSN5boost9exceptionE@@Base+0x282f3>
  c0641c:	48 8d 0d fd 14 7c ff 	lea    rcx,[rip+0xffffffffff7c14fd]        # 3c7920 <_ZTSN5boost9exceptionE@@Base+0x28302>
  c06423:	4c 89 e2             	mov    rdx,r12
  c06426:	6a 34                	push   0x34
  c06428:	41 58                	pop    r8
  c0642a:	41 b9 e8 03 00 00    	mov    r9d,0x3e8
  c06430:	68 a0 86 01 00       	push   0x186a0
  c06435:	6a 00                	push   0x0
  c06437:	e8 b6 11 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c0643c:	48 83 c4 10          	add    rsp,0x10
  c06440:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06444:	48 8d 35 0a 15 7c ff 	lea    rsi,[rip+0xffffffffff7c150a]        # 3c7955 <_ZTSN5boost9exceptionE@@Base+0x28337>
  c0644b:	48 8d 0d 1e 15 7c ff 	lea    rcx,[rip+0xffffffffff7c151e]        # 3c7970 <_ZTSN5boost9exceptionE@@Base+0x28352>
  c06452:	4c 89 e2             	mov    rdx,r12
  c06455:	4d 89 f0             	mov    r8,r14
  c06458:	41 b9 c8 00 00 00    	mov    r9d,0xc8
  c0645e:	41 55                	push   r13
  c06460:	6a 00                	push   0x0
  c06462:	e8 8b 11 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c06467:	48 83 c4 10          	add    rsp,0x10
  c0646b:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c0646f:	48 8d 35 2a 15 7c ff 	lea    rsi,[rip+0xffffffffff7c152a]        # 3c79a0 <_ZTSN5boost9exceptionE@@Base+0x28382>
  c06476:	48 8d 0d 33 15 7c ff 	lea    rcx,[rip+0xffffffffff7c1533]        # 3c79b0 <_ZTSN5boost9exceptionE@@Base+0x28392>
  c0647d:	4c 89 e2             	mov    rdx,r12
  c06480:	4d 89 f8             	mov    r8,r15
  c06483:	41 b9 e8 03 00 00    	mov    r9d,0x3e8
  c06489:	41 55                	push   r13
  c0648b:	6a 00                	push   0x0
  c0648d:	e8 60 11 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c06492:	48 83 c4 10          	add    rsp,0x10
  c06496:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c0649a:	48 8d 35 3c 15 7c ff 	lea    rsi,[rip+0xffffffffff7c153c]        # 3c79dd <_ZTSN5boost9exceptionE@@Base+0x283bf>
  c064a1:	48 8d 0d 48 15 7c ff 	lea    rcx,[rip+0xffffffffff7c1548]        # 3c79f0 <_ZTSN5boost9exceptionE@@Base+0x283d2>
  c064a8:	4c 89 e2             	mov    rdx,r12
  c064ab:	6a 29                	push   0x29
  c064ad:	41 5e                	pop    r14
  c064af:	4d 89 f0             	mov    r8,r14
  c064b2:	41 b9 e8 03 00 00    	mov    r9d,0x3e8
  c064b8:	41 55                	push   r13
  c064ba:	6a 00                	push   0x0
  c064bc:	e8 31 11 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c064c1:	48 83 c4 10          	add    rsp,0x10
  c064c5:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c064c9:	48 8d 35 4a 15 7c ff 	lea    rsi,[rip+0xffffffffff7c154a]        # 3c7a1a <_ZTSN5boost9exceptionE@@Base+0x283fc>
  c064d0:	48 8d 0d 59 15 7c ff 	lea    rcx,[rip+0xffffffffff7c1559]        # 3c7a30 <_ZTSN5boost9exceptionE@@Base+0x28412>
  c064d7:	6a 27                	push   0x27
  c064d9:	41 58                	pop    r8
  c064db:	4c 89 e2             	mov    rdx,r12
  c064de:	41 b9 e8 03 00 00    	mov    r9d,0x3e8
  c064e4:	41 55                	push   r13
  c064e6:	6a 00                	push   0x0
  c064e8:	e8 05 11 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c064ed:	48 83 c4 10          	add    rsp,0x10
  c064f1:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c064f5:	48 8d 35 5c 15 7c ff 	lea    rsi,[rip+0xffffffffff7c155c]        # 3c7a58 <_ZTSN5boost9exceptionE@@Base+0x2843a>
  c064fc:	48 8d 0d 6d 15 7c ff 	lea    rcx,[rip+0xffffffffff7c156d]        # 3c7a70 <_ZTSN5boost9exceptionE@@Base+0x28452>
  c06503:	4c 89 e2             	mov    rdx,r12
  c06506:	4d 89 f0             	mov    r8,r14
  c06509:	41 b9 e8 03 00 00    	mov    r9d,0x3e8
  c0650f:	41 55                	push   r13
  c06511:	6a 00                	push   0x0
  c06513:	e8 da 10 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c06518:	48 83 c4 10          	add    rsp,0x10
  c0651c:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06520:	48 8d 35 73 15 7c ff 	lea    rsi,[rip+0xffffffffff7c1573]        # 3c7a9a <_ZTSN5boost9exceptionE@@Base+0x2847c>
  c06527:	48 8d 0d 82 15 7c ff 	lea    rcx,[rip+0xffffffffff7c1582]        # 3c7ab0 <_ZTSN5boost9exceptionE@@Base+0x28492>
  c0652e:	6a 26                	push   0x26
  c06530:	41 5f                	pop    r15
  c06532:	6a 03                	push   0x3
  c06534:	41 59                	pop    r9
  c06536:	4c 89 e2             	mov    rdx,r12
  c06539:	4d 89 f8             	mov    r8,r15
  c0653c:	6a 05                	push   0x5
  c0653e:	6a 00                	push   0x0
  c06540:	e8 ad 10 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c06545:	48 83 c4 10          	add    rsp,0x10
  c06549:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c0654d:	48 8d 35 83 15 7c ff 	lea    rsi,[rip+0xffffffffff7c1583]        # 3c7ad7 <_ZTSN5boost9exceptionE@@Base+0x284b9>
  c06554:	48 8d 0d 95 15 7c ff 	lea    rcx,[rip+0xffffffffff7c1595]        # 3c7af0 <_ZTSN5boost9exceptionE@@Base+0x284d2>
  c0655b:	6a 31                	push   0x31
  c0655d:	41 5e                	pop    r14
  c0655f:	4c 89 e2             	mov    rdx,r12
  c06562:	4d 89 f0             	mov    r8,r14
  c06565:	41 b9 84 03 00 00    	mov    r9d,0x384
  c0656b:	41 55                	push   r13
  c0656d:	6a 00                	push   0x0
  c0656f:	e8 7e 10 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c06574:	48 83 c4 10          	add    rsp,0x10
  c06578:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c0657c:	48 8d 35 9f 15 7c ff 	lea    rsi,[rip+0xffffffffff7c159f]        # 3c7b22 <_ZTSN5boost9exceptionE@@Base+0x28504>
  c06583:	48 8d 0d a6 15 7c ff 	lea    rcx,[rip+0xffffffffff7c15a6]        # 3c7b30 <_ZTSN5boost9exceptionE@@Base+0x28512>
  c0658a:	6a 32                	push   0x32
  c0658c:	41 58                	pop    r8
  c0658e:	4c 89 e2             	mov    rdx,r12
  c06591:	41 b9 20 03 00 00    	mov    r9d,0x320
  c06597:	41 55                	push   r13
  c06599:	6a 00                	push   0x0
  c0659b:	e8 52 10 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c065a0:	48 83 c4 10          	add    rsp,0x10
  c065a4:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c065a8:	48 8d 35 b4 15 7c ff 	lea    rsi,[rip+0xffffffffff7c15b4]        # 3c7b63 <_ZTSN5boost9exceptionE@@Base+0x28545>
  c065af:	48 8d 0d ba 15 7c ff 	lea    rcx,[rip+0xffffffffff7c15ba]        # 3c7b70 <_ZTSN5boost9exceptionE@@Base+0x28552>
  c065b6:	4c 89 e2             	mov    rdx,r12
  c065b9:	6a 30                	push   0x30
  c065bb:	41 58                	pop    r8
  c065bd:	41 b9 58 02 00 00    	mov    r9d,0x258
  c065c3:	41 55                	push   r13
  c065c5:	6a 00                	push   0x0
  c065c7:	e8 26 10 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c065cc:	48 83 c4 10          	add    rsp,0x10
  c065d0:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c065d4:	48 8d 35 c6 15 7c ff 	lea    rsi,[rip+0xffffffffff7c15c6]        # 3c7ba1 <_ZTSN5boost9exceptionE@@Base+0x28583>
  c065db:	48 8d 0d ce 15 7c ff 	lea    rcx,[rip+0xffffffffff7c15ce]        # 3c7bb0 <_ZTSN5boost9exceptionE@@Base+0x28592>
  c065e2:	4c 89 e2             	mov    rdx,r12
  c065e5:	4d 89 f8             	mov    r8,r15
  c065e8:	41 b9 e8 03 00 00    	mov    r9d,0x3e8
  c065ee:	41 55                	push   r13
  c065f0:	6a 00                	push   0x0
  c065f2:	e8 fb 0f 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c065f7:	48 83 c4 10          	add    rsp,0x10
  c065fb:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c065ff:	48 8d 35 d1 15 7c ff 	lea    rsi,[rip+0xffffffffff7c15d1]        # 3c7bd7 <_ZTSN5boost9exceptionE@@Base+0x285b9>
  c06606:	48 8d 0d e3 15 7c ff 	lea    rcx,[rip+0xffffffffff7c15e3]        # 3c7bf0 <_ZTSN5boost9exceptionE@@Base+0x285d2>
  c0660d:	4c 89 e2             	mov    rdx,r12
  c06610:	6a 2b                	push   0x2b
  c06612:	41 5f                	pop    r15
  c06614:	4d 89 f8             	mov    r8,r15
  c06617:	41 b9 20 03 00 00    	mov    r9d,0x320
  c0661d:	41 55                	push   r13
  c0661f:	6a 00                	push   0x0
  c06621:	e8 cc 0f 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c06626:	48 83 c4 10          	add    rsp,0x10
  c0662a:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c0662e:	48 8d 35 e7 15 7c ff 	lea    rsi,[rip+0xffffffffff7c15e7]        # 3c7c1c <_ZTSN5boost9exceptionE@@Base+0x285fe>
  c06635:	48 8d 0d f4 15 7c ff 	lea    rcx,[rip+0xffffffffff7c15f4]        # 3c7c30 <_ZTSN5boost9exceptionE@@Base+0x28612>
  c0663c:	6a 25                	push   0x25
  c0663e:	41 58                	pop    r8
  c06640:	4c 89 e2             	mov    rdx,r12
  c06643:	41 b9 58 02 00 00    	mov    r9d,0x258
  c06649:	41 55                	push   r13
  c0664b:	6a 00                	push   0x0
  c0664d:	e8 a0 0f 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c06652:	48 83 c4 10          	add    rsp,0x10
  c06656:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c0665a:	48 8d 35 f5 15 7c ff 	lea    rsi,[rip+0xffffffffff7c15f5]        # 3c7c56 <_ZTSN5boost9exceptionE@@Base+0x28638>
  c06661:	48 8d 0d 08 16 7c ff 	lea    rcx,[rip+0xffffffffff7c1608]        # 3c7c70 <_ZTSN5boost9exceptionE@@Base+0x28652>
  c06668:	6a 2d                	push   0x2d
  c0666a:	41 58                	pop    r8
  c0666c:	4c 89 e2             	mov    rdx,r12
  c0666f:	45 31 c9             	xor    r9d,r9d
  c06672:	e8 e7 0e 9e 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  c06677:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c0667b:	48 8d 35 1c 16 7c ff 	lea    rsi,[rip+0xffffffffff7c161c]        # 3c7c9e <_ZTSN5boost9exceptionE@@Base+0x28680>
  c06682:	48 8d 0d 27 16 7c ff 	lea    rcx,[rip+0xffffffffff7c1627]        # 3c7cb0 <_ZTSN5boost9exceptionE@@Base+0x28692>
  c06689:	4c 89 e2             	mov    rdx,r12
  c0668c:	4d 89 f0             	mov    r8,r14
  c0668f:	41 b9 f4 01 00 00    	mov    r9d,0x1f4
  c06695:	41 55                	push   r13
  c06697:	6a 01                	push   0x1
  c06699:	41 5d                	pop    r13
  c0669b:	6a 00                	push   0x0
  c0669d:	e8 50 0f 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c066a2:	48 83 c4 10          	add    rsp,0x10
  c066a6:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c066aa:	48 8d 35 31 16 7c ff 	lea    rsi,[rip+0xffffffffff7c1631]        # 3c7ce2 <_ZTSN5boost9exceptionE@@Base+0x286c4>
  c066b1:	48 8d 0d 38 16 7c ff 	lea    rcx,[rip+0xffffffffff7c1638]        # 3c7cf0 <_ZTSN5boost9exceptionE@@Base+0x286d2>
  c066b8:	6a 23                	push   0x23
  c066ba:	41 58                	pop    r8
  c066bc:	4c 89 e2             	mov    rdx,r12
  c066bf:	45 31 c9             	xor    r9d,r9d
  c066c2:	e8 97 0e 9e 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  c066c7:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c066cb:	48 8d 35 42 16 7c ff 	lea    rsi,[rip+0xffffffffff7c1642]        # 3c7d14 <_ZTSN5boost9exceptionE@@Base+0x286f6>
  c066d2:	48 8d 0d 57 16 7c ff 	lea    rcx,[rip+0xffffffffff7c1657]        # 3c7d30 <_ZTSN5boost9exceptionE@@Base+0x28712>
  c066d9:	4c 89 e2             	mov    rdx,r12
  c066dc:	4d 89 f8             	mov    r8,r15
  c066df:	45 31 c9             	xor    r9d,r9d
  c066e2:	e8 77 0e 9e 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  c066e7:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c066eb:	48 8d 35 6a 16 7c ff 	lea    rsi,[rip+0xffffffffff7c166a]        # 3c7d5c <_ZTSN5boost9exceptionE@@Base+0x2873e>
  c066f2:	48 8d 0d 77 16 7c ff 	lea    rcx,[rip+0xffffffffff7c1677]        # 3c7d70 <_ZTSN5boost9exceptionE@@Base+0x28752>
  c066f9:	6a 1b                	push   0x1b
  c066fb:	41 58                	pop    r8
  c066fd:	4c 89 e2             	mov    rdx,r12
  c06700:	45 31 c9             	xor    r9d,r9d
  c06703:	e8 56 0e 9e 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  c06708:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c0670c:	48 8d 35 79 16 7c ff 	lea    rsi,[rip+0xffffffffff7c1679]        # 3c7d8c <_ZTSN5boost9exceptionE@@Base+0x2876e>
  c06713:	48 8d 0d 86 16 7c ff 	lea    rcx,[rip+0xffffffffff7c1686]        # 3c7da0 <_ZTSN5boost9exceptionE@@Base+0x28782>
  c0671a:	4c 89 e2             	mov    rdx,r12
  c0671d:	6a 28                	push   0x28
  c0671f:	41 5e                	pop    r14
  c06721:	4d 89 f0             	mov    r8,r14
  c06724:	41 b9 88 13 00 00    	mov    r9d,0x1388
  c0672a:	b8 30 75 00 00       	mov    eax,0x7530
  c0672f:	50                   	push   rax
  c06730:	6a 00                	push   0x0
  c06732:	e8 bb 0e 9e 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  c06737:	48 83 c4 10          	add    rsp,0x10
  c0673b:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c0673f:	48 8d 35 20 c9 7c ff 	lea    rsi,[rip+0xffffffffff7cc920]        # 3d3066 <_ZTSN5boost17bad_function_callE@@Base+0x3ac>
  c06746:	48 8d 0d 33 c9 7c ff 	lea    rcx,[rip+0xffffffffff7cc933]        # 3d3080 <_ZTSN5boost17bad_function_callE@@Base+0x3c6>
  c0674d:	6a 0f                	push   0xf
  c0674f:	41 58                	pop    r8
  c06751:	4c 89 e2             	mov    rdx,r12
  c06754:	45 89 e9             	mov    r9d,r13d
  c06757:	e8 02 0e 9e 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  c0675c:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06760:	48 8d 35 0c 0c 7c ff 	lea    rsi,[rip+0xffffffffff7c0c0c]        # 3c7373 <_ZTSN5boost9exceptionE@@Base+0x27d55>
  c06767:	48 8d 0d 12 0c 7c ff 	lea    rcx,[rip+0xffffffffff7c0c12]        # 3c7380 <_ZTSN5boost9exceptionE@@Base+0x27d62>
  c0676e:	6a 22                	push   0x22
  c06770:	41 58                	pop    r8
  c06772:	6a 23                	push   0x23
  c06774:	41 59                	pop    r9
  c06776:	4c 89 e2             	mov    rdx,r12
  c06779:	e8 ac 0c 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c0677e:	48 98                	cdqe
  c06780:	48 69 c0 e8 03 00 00 	imul   rax,rax,0x3e8
  c06787:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
  c0678e:	00 
  c0678f:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06793:	48 8d 35 09 0c 7c ff 	lea    rsi,[rip+0xffffffffff7c0c09]        # 3c73a3 <_ZTSN5boost9exceptionE@@Base+0x27d85>
  c0679a:	48 8d 0d 0f 0c 7c ff 	lea    rcx,[rip+0xffffffffff7c0c0f]        # 3c73b0 <_ZTSN5boost9exceptionE@@Base+0x27d92>
  c067a1:	4c 89 e2             	mov    rdx,r12
  c067a4:	6a 2a                	push   0x2a
  c067a6:	41 58                	pop    r8
  c067a8:	41 b9 c8 00 00 00    	mov    r9d,0xc8
  c067ae:	e8 77 0c 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c067b3:	f3 0f 2a c0          	cvtsi2ss xmm0,eax
  c067b7:	f3 0f 5e 05 8d 7e 78 	divss  xmm0,DWORD PTR [rip+0xffffffffff787e8d]        # 38e64c <_ZTSSt12bad_any_cast@@Base-0x1b7c>
  c067be:	ff 
  c067bf:	f3 0f 11 84 24 8c 00 	movss  DWORD PTR [rsp+0x8c],xmm0
  c067c6:	00 00 
  c067c8:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c067cc:	48 8d 35 08 0c 7c ff 	lea    rsi,[rip+0xffffffffff7c0c08]        # 3c73db <_ZTSN5boost9exceptionE@@Base+0x27dbd>
  c067d3:	48 8d 0d 16 0c 7c ff 	lea    rcx,[rip+0xffffffffff7c0c16]        # 3c73f0 <_ZTSN5boost9exceptionE@@Base+0x27dd2>
  c067da:	6a 1f                	push   0x1f
  c067dc:	41 58                	pop    r8
  c067de:	6a 10                	push   0x10
  c067e0:	41 59                	pop    r9
  c067e2:	4c 89 e2             	mov    rdx,r12
  c067e5:	e8 40 0c 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c067ea:	89 84 24 84 00 00 00 	mov    DWORD PTR [rsp+0x84],eax
  c067f1:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c067f5:	48 8d 35 14 0c 7c ff 	lea    rsi,[rip+0xffffffffff7c0c14]        # 3c7410 <_ZTSN5boost9exceptionE@@Base+0x27df2>
  c067fc:	48 8d 0d 1d 0c 7c ff 	lea    rcx,[rip+0xffffffffff7c0c1d]        # 3c7420 <_ZTSN5boost9exceptionE@@Base+0x27e02>
  c06803:	6a 0a                	push   0xa
  c06805:	41 59                	pop    r9
  c06807:	4c 89 e2             	mov    rdx,r12
  c0680a:	4d 89 f0             	mov    r8,r14
  c0680d:	e8 18 0c 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c06812:	89 84 24 88 00 00 00 	mov    DWORD PTR [rsp+0x88],eax
  c06819:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c0681d:	48 8d 35 25 0c 7c ff 	lea    rsi,[rip+0xffffffffff7c0c25]        # 3c7449 <_ZTSN5boost9exceptionE@@Base+0x27e2b>
  c06824:	48 8d 0d 35 0c 7c ff 	lea    rcx,[rip+0xffffffffff7c0c35]        # 3c7460 <_ZTSN5boost9exceptionE@@Base+0x27e42>
  c0682b:	6a 24                	push   0x24
  c0682d:	41 58                	pop    r8
  c0682f:	6a 28                	push   0x28
  c06831:	41 5e                	pop    r14
  c06833:	4c 89 e2             	mov    rdx,r12
  c06836:	45 89 f1             	mov    r9d,r14d
  c06839:	e8 ec 0b 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c0683e:	f3 0f 2a c0          	cvtsi2ss xmm0,eax
  c06842:	f3 0f 5e 05 ea 81 78 	divss  xmm0,DWORD PTR [rip+0xffffffffff7881ea]        # 38ea34 <_ZTSSt12bad_any_cast@@Base-0x1794>
  c06849:	ff 
  c0684a:	f3 0f 11 84 24 80 00 	movss  DWORD PTR [rsp+0x80],xmm0
  c06851:	00 00 
  c06853:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06857:	48 8d 35 27 0c 7c ff 	lea    rsi,[rip+0xffffffffff7c0c27]        # 3c7485 <_ZTSN5boost9exceptionE@@Base+0x27e67>
  c0685e:	48 8d 0d 3b 0c 7c ff 	lea    rcx,[rip+0xffffffffff7c0c3b]        # 3c74a0 <_ZTSN5boost9exceptionE@@Base+0x27e82>
  c06865:	4c 89 e2             	mov    rdx,r12
  c06868:	6a 2c                	push   0x2c
  c0686a:	41 58                	pop    r8
  c0686c:	45 89 e9             	mov    r9d,r13d
  c0686f:	e8 16 0b 9e 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  c06874:	88 44 24 07          	mov    BYTE PTR [rsp+0x7],al
  c06878:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c0687c:	48 8d 35 4a 0c 7c ff 	lea    rsi,[rip+0xffffffffff7c0c4a]        # 3c74cd <_ZTSN5boost9exceptionE@@Base+0x27eaf>
  c06883:	48 8d 0d 56 0c 7c ff 	lea    rcx,[rip+0xffffffffff7c0c56]        # 3c74e0 <_ZTSN5boost9exceptionE@@Base+0x27ec2>
  c0688a:	6a 05                	push   0x5
  c0688c:	41 59                	pop    r9
  c0688e:	4c 89 e2             	mov    rdx,r12
  c06891:	6a 2d                	push   0x2d
  c06893:	41 5f                	pop    r15
  c06895:	4d 89 f8             	mov    r8,r15
  c06898:	e8 8d 0b 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c0689d:	f3 0f 2a c0          	cvtsi2ss xmm0,eax
  c068a1:	f3 0f 5e 05 a3 7d 78 	divss  xmm0,DWORD PTR [rip+0xffffffffff787da3]        # 38e64c <_ZTSSt12bad_any_cast@@Base-0x1b7c>
  c068a8:	ff 
  c068a9:	f3 0f 11 44 24 7c    	movss  DWORD PTR [rsp+0x7c],xmm0
  c068af:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c068b3:	48 8d 35 54 0c 7c ff 	lea    rsi,[rip+0xffffffffff7c0c54]        # 3c750e <_ZTSN5boost9exceptionE@@Base+0x27ef0>
  c068ba:	48 8d 0d 5f 0c 7c ff 	lea    rcx,[rip+0xffffffffff7c0c5f]        # 3c7520 <_ZTSN5boost9exceptionE@@Base+0x27f02>
  c068c1:	4c 89 e2             	mov    rdx,r12
  c068c4:	6a 28                	push   0x28
  c068c6:	41 58                	pop    r8
  c068c8:	41 b9 e8 03 00 00    	mov    r9d,0x3e8
  c068ce:	e8 57 0b 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c068d3:	89 44 24 74          	mov    DWORD PTR [rsp+0x74],eax
  c068d7:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c068db:	48 8d 35 67 0c 7c ff 	lea    rsi,[rip+0xffffffffff7c0c67]        # 3c7549 <_ZTSN5boost9exceptionE@@Base+0x27f2b>
  c068e2:	48 8d 0d 77 0c 7c ff 	lea    rcx,[rip+0xffffffffff7c0c77]        # 3c7560 <_ZTSN5boost9exceptionE@@Base+0x27f42>
  c068e9:	4c 89 e2             	mov    rdx,r12
  c068ec:	6a 2a                	push   0x2a
  c068ee:	41 58                	pop    r8
  c068f0:	41 b9 f4 01 00 00    	mov    r9d,0x1f4
  c068f6:	e8 2f 0b 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c068fb:	89 44 24 78          	mov    DWORD PTR [rsp+0x78],eax
  c068ff:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06903:	48 8d 35 81 0c 7c ff 	lea    rsi,[rip+0xffffffffff7c0c81]        # 3c758b <_ZTSN5boost9exceptionE@@Base+0x27f6d>
  c0690a:	48 8d 0d 8f 0c 7c ff 	lea    rcx,[rip+0xffffffffff7c0c8f]        # 3c75a0 <_ZTSN5boost9exceptionE@@Base+0x27f82>
  c06911:	4c 89 e2             	mov    rdx,r12
  c06914:	4d 89 f8             	mov    r8,r15
  c06917:	45 89 f1             	mov    r9d,r14d
  c0691a:	e8 0b 0b 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c0691f:	f3 0f 2a c0          	cvtsi2ss xmm0,eax
  c06923:	f3 0f 5e 05 09 81 78 	divss  xmm0,DWORD PTR [rip+0xffffffffff788109]        # 38ea34 <_ZTSSt12bad_any_cast@@Base-0x1794>
  c0692a:	ff 
  c0692b:	f3 0f 11 44 24 70    	movss  DWORD PTR [rsp+0x70],xmm0
  c06931:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06935:	48 8d 35 92 0c 7c ff 	lea    rsi,[rip+0xffffffffff7c0c92]        # 3c75ce <_ZTSN5boost9exceptionE@@Base+0x27fb0>
  c0693c:	48 8d 0d 9d 0c 7c ff 	lea    rcx,[rip+0xffffffffff7c0c9d]        # 3c75e0 <_ZTSN5boost9exceptionE@@Base+0x27fc2>
  c06943:	4c 89 e2             	mov    rdx,r12
  c06946:	6a 34                	push   0x34
  c06948:	41 5f                	pop    r15
  c0694a:	4d 89 f8             	mov    r8,r15
  c0694d:	45 31 c9             	xor    r9d,r9d
  c06950:	e8 35 0a 9e 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  c06955:	88 44 24 06          	mov    BYTE PTR [rsp+0x6],al
  c06959:	48 8b 75 00          	mov    rsi,QWORD PTR [rbp+0x0]
  c0695d:	4c 8d b4 24 d8 00 00 	lea    r14,[rsp+0xd8]
  c06964:	00 
  c06965:	4c 89 f7             	mov    rdi,r14
  c06968:	48 8d 15 a6 0c 7c ff 	lea    rdx,[rip+0xffffffffff7c0ca6]        # 3c7615 <_ZTSN5boost9exceptionE@@Base+0x27ff7>
  c0696f:	4c 89 e1             	mov    rcx,r12
  c06972:	4c 8d 05 b7 0c 7c ff 	lea    r8,[rip+0xffffffffff7c0cb7]        # 3c7630 <_ZTSN5boost9exceptionE@@Base+0x28012>
  c06979:	4d 89 f9             	mov    r9,r15
  c0697c:	e8 47 0b 9e 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  c06981:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
  c06986:	74 38                	je     c069c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x153960>
  c06988:	48 8d 35 7b 41 72 ff 	lea    rsi,[rip+0xffffffffff72417b]        # 32ab0a <_ZTSSt12bad_any_cast@@Base-0x656be>
  c0698f:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  c06996:	00 
  c06997:	e8 b3 4e e7 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  c0699c:	84 c0                	test   al,al
  c0699e:	74 06                	je     c069a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x153946>
  c069a0:	6a 02                	push   0x2
  c069a2:	41 5d                	pop    r13
  c069a4:	eb 1a                	jmp    c069c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x153960>
  c069a6:	48 8d 35 1e 79 76 ff 	lea    rsi,[rip+0xffffffffff76791e]        # 36e2cb <_ZTSSt12bad_any_cast@@Base-0x21efd>
  c069ad:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  c069b4:	00 
  c069b5:	e8 95 4e e7 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  c069ba:	34 01                	xor    al,0x1
  c069bc:	44 0f b6 e8          	movzx  r13d,al
  c069c0:	44 89 6c 24 60       	mov    DWORD PTR [rsp+0x60],r13d
  c069c5:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  c069cc:	00 
  c069cd:	e8 5e 03 ea ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  c069d2:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c069d6:	48 8d 35 ec 13 7c ff 	lea    rsi,[rip+0xffffffffff7c13ec]        # 3c7dc9 <_ZTSN5boost9exceptionE@@Base+0x287ab>
  c069dd:	48 8d 0d fc 13 7c ff 	lea    rcx,[rip+0xffffffffff7c13fc]        # 3c7de0 <_ZTSN5boost9exceptionE@@Base+0x287c2>
  c069e4:	6a 0c                	push   0xc
  c069e6:	41 5c                	pop    r12
  c069e8:	6a 35                	push   0x35
  c069ea:	41 5e                	pop    r14
  c069ec:	6a 0a                	push   0xa
  c069ee:	41 59                	pop    r9
  c069f0:	4c 89 e2             	mov    rdx,r12
  c069f3:	4d 89 f0             	mov    r8,r14
  c069f6:	e8 2f 0a 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c069fb:	f3 0f 2a c8          	cvtsi2ss xmm1,eax
  c069ff:	f3 0f 10 05 45 7c 78 	movss  xmm0,DWORD PTR [rip+0xffffffffff787c45]        # 38e64c <_ZTSSt12bad_any_cast@@Base-0x1b7c>
  c06a06:	ff 
  c06a07:	f3 0f 5e c8          	divss  xmm1,xmm0
  c06a0b:	f3 0f 11 4c 24 6c    	movss  DWORD PTR [rsp+0x6c],xmm1
  c06a11:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06a15:	48 8d 35 4f 0c 7c ff 	lea    rsi,[rip+0xffffffffff7c0c4f]        # 3c766b <_ZTSN5boost9exceptionE@@Base+0x2804d>
  c06a1c:	48 8d 0d 5d 0c 7c ff 	lea    rcx,[rip+0xffffffffff7c0c5d]        # 3c7680 <_ZTSN5boost9exceptionE@@Base+0x28062>
  c06a23:	6a 37                	push   0x37
  c06a25:	41 58                	pop    r8
  c06a27:	4c 89 e2             	mov    rdx,r12
  c06a2a:	41 b9 88 13 00 00    	mov    r9d,0x1388
  c06a30:	e8 f5 09 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c06a35:	48 98                	cdqe
  c06a37:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
  c06a3e:	00 
  c06a3f:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06a43:	48 8d 35 6e 0c 7c ff 	lea    rsi,[rip+0xffffffffff7c0c6e]        # 3c76b8 <_ZTSN5boost9exceptionE@@Base+0x2809a>
  c06a4a:	48 8d 0d 7f 0c 7c ff 	lea    rcx,[rip+0xffffffffff7c0c7f]        # 3c76d0 <_ZTSN5boost9exceptionE@@Base+0x280b2>
  c06a51:	4c 89 e2             	mov    rdx,r12
  c06a54:	4d 89 f0             	mov    r8,r14
  c06a57:	45 31 c9             	xor    r9d,r9d
  c06a5a:	e8 2b 09 9e 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  c06a5f:	88 44 24 05          	mov    BYTE PTR [rsp+0x5],al
  c06a63:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06a67:	48 8d 35 98 0c 7c ff 	lea    rsi,[rip+0xffffffffff7c0c98]        # 3c7706 <_ZTSN5boost9exceptionE@@Base+0x280e8>
  c06a6e:	48 8d 0d ab 0c 7c ff 	lea    rcx,[rip+0xffffffffff7c0cab]        # 3c7720 <_ZTSN5boost9exceptionE@@Base+0x28102>
  c06a75:	6a 2b                	push   0x2b
  c06a77:	41 58                	pop    r8
  c06a79:	4c 89 e2             	mov    rdx,r12
  c06a7c:	41 b9 20 03 00 00    	mov    r9d,0x320
  c06a82:	e8 a3 09 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c06a87:	89 44 24 64          	mov    DWORD PTR [rsp+0x64],eax
  c06a8b:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06a8f:	48 8d 35 b6 0c 7c ff 	lea    rsi,[rip+0xffffffffff7c0cb6]        # 3c774c <_ZTSN5boost9exceptionE@@Base+0x2812e>
  c06a96:	48 8d 0d c3 0c 7c ff 	lea    rcx,[rip+0xffffffffff7c0cc3]        # 3c7760 <_ZTSN5boost9exceptionE@@Base+0x28142>
  c06a9d:	6a 29                	push   0x29
  c06a9f:	41 5e                	pop    r14
  c06aa1:	4c 89 e2             	mov    rdx,r12
  c06aa4:	4d 89 f0             	mov    r8,r14
  c06aa7:	41 b9 20 03 00 00    	mov    r9d,0x320
  c06aad:	e8 78 09 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c06ab2:	89 44 24 5c          	mov    DWORD PTR [rsp+0x5c],eax
  c06ab6:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06aba:	48 8d 35 c9 0c 7c ff 	lea    rsi,[rip+0xffffffffff7c0cc9]        # 3c778a <_ZTSN5boost9exceptionE@@Base+0x2816c>
  c06ac1:	48 8d 0d d8 0c 7c ff 	lea    rcx,[rip+0xffffffffff7c0cd8]        # 3c77a0 <_ZTSN5boost9exceptionE@@Base+0x28182>
  c06ac8:	6a 2c                	push   0x2c
  c06aca:	41 5f                	pop    r15
  c06acc:	4c 89 e2             	mov    rdx,r12
  c06acf:	4d 89 f8             	mov    r8,r15
  c06ad2:	41 b9 e8 03 00 00    	mov    r9d,0x3e8
  c06ad8:	e8 4d 09 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c06add:	89 44 24 58          	mov    DWORD PTR [rsp+0x58],eax
  c06ae1:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06ae5:	48 8d 35 e1 0c 7c ff 	lea    rsi,[rip+0xffffffffff7c0ce1]        # 3c77cd <_ZTSN5boost9exceptionE@@Base+0x281af>
  c06aec:	48 8d 0d ed 0c 7c ff 	lea    rcx,[rip+0xffffffffff7c0ced]        # 3c77e0 <_ZTSN5boost9exceptionE@@Base+0x281c2>
  c06af3:	4c 89 e2             	mov    rdx,r12
  c06af6:	4d 89 f8             	mov    r8,r15
  c06af9:	41 b9 f4 01 00 00    	mov    r9d,0x1f4
  c06aff:	e8 26 09 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c06b04:	89 44 24 54          	mov    DWORD PTR [rsp+0x54],eax
  c06b08:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06b0c:	48 8d 35 fa 0c 7c ff 	lea    rsi,[rip+0xffffffffff7c0cfa]        # 3c780d <_ZTSN5boost9exceptionE@@Base+0x281ef>
  c06b13:	48 8d 0d 06 0d 7c ff 	lea    rcx,[rip+0xffffffffff7c0d06]        # 3c7820 <_ZTSN5boost9exceptionE@@Base+0x28202>
  c06b1a:	6a 2f                	push   0x2f
  c06b1c:	41 5d                	pop    r13
  c06b1e:	4c 89 e2             	mov    rdx,r12
  c06b21:	4d 89 e8             	mov    r8,r13
  c06b24:	41 b9 b6 03 00 00    	mov    r9d,0x3b6
  c06b2a:	e8 fb 08 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c06b2f:	f3 0f 2a c0          	cvtsi2ss xmm0,eax
  c06b33:	f3 0f 5e 05 11 7b 78 	divss  xmm0,DWORD PTR [rip+0xffffffffff787b11]        # 38e64c <_ZTSSt12bad_any_cast@@Base-0x1b7c>
  c06b3a:	ff 
  c06b3b:	f3 0f 11 44 24 68    	movss  DWORD PTR [rsp+0x68],xmm0
  c06b41:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06b45:	48 8d 35 04 0d 7c ff 	lea    rsi,[rip+0xffffffffff7c0d04]        # 3c7850 <_ZTSN5boost9exceptionE@@Base+0x28232>
  c06b4c:	48 8d 0d 0d 0d 7c ff 	lea    rcx,[rip+0xffffffffff7c0d0d]        # 3c7860 <_ZTSN5boost9exceptionE@@Base+0x28242>
  c06b53:	6a 28                	push   0x28
  c06b55:	41 58                	pop    r8
  c06b57:	6a 01                	push   0x1
  c06b59:	41 59                	pop    r9
  c06b5b:	4c 89 e2             	mov    rdx,r12
  c06b5e:	e8 27 08 9e 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  c06b63:	88 44 24 04          	mov    BYTE PTR [rsp+0x4],al
  c06b67:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06b6b:	48 8d 35 17 0d 7c ff 	lea    rsi,[rip+0xffffffffff7c0d17]        # 3c7889 <_ZTSN5boost9exceptionE@@Base+0x2826b>
  c06b72:	48 8d 0d 27 0d 7c ff 	lea    rcx,[rip+0xffffffffff7c0d27]        # 3c78a0 <_ZTSN5boost9exceptionE@@Base+0x28282>
  c06b79:	6a 2a                	push   0x2a
  c06b7b:	41 58                	pop    r8
  c06b7d:	4c 89 e2             	mov    rdx,r12
  c06b80:	41 b9 96 00 00 00    	mov    r9d,0x96
  c06b86:	e8 9f 08 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c06b8b:	89 44 24 50          	mov    DWORD PTR [rsp+0x50],eax
  c06b8f:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06b93:	48 8d 35 31 0d 7c ff 	lea    rsi,[rip+0xffffffffff7c0d31]        # 3c78cb <_ZTSN5boost9exceptionE@@Base+0x282ad>
  c06b9a:	48 8d 0d 3f 0d 7c ff 	lea    rcx,[rip+0xffffffffff7c0d3f]        # 3c78e0 <_ZTSN5boost9exceptionE@@Base+0x282c2>
  c06ba1:	6a 30                	push   0x30
  c06ba3:	41 58                	pop    r8
  c06ba5:	4c 89 e2             	mov    rdx,r12
  c06ba8:	41 b9 90 5f 01 00    	mov    r9d,0x15f90
  c06bae:	e8 77 08 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c06bb3:	89 44 24 4c          	mov    DWORD PTR [rsp+0x4c],eax
  c06bb7:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06bbb:	48 8d 35 4f 0d 7c ff 	lea    rsi,[rip+0xffffffffff7c0d4f]        # 3c7911 <_ZTSN5boost9exceptionE@@Base+0x282f3>
  c06bc2:	48 8d 0d 57 0d 7c ff 	lea    rcx,[rip+0xffffffffff7c0d57]        # 3c7920 <_ZTSN5boost9exceptionE@@Base+0x28302>
  c06bc9:	6a 34                	push   0x34
  c06bcb:	41 58                	pop    r8
  c06bcd:	4c 89 e2             	mov    rdx,r12
  c06bd0:	41 b9 e8 03 00 00    	mov    r9d,0x3e8
  c06bd6:	e8 4f 08 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c06bdb:	89 44 24 48          	mov    DWORD PTR [rsp+0x48],eax
  c06bdf:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06be3:	48 8d 35 6b 0d 7c ff 	lea    rsi,[rip+0xffffffffff7c0d6b]        # 3c7955 <_ZTSN5boost9exceptionE@@Base+0x28337>
  c06bea:	48 8d 0d 7f 0d 7c ff 	lea    rcx,[rip+0xffffffffff7c0d7f]        # 3c7970 <_ZTSN5boost9exceptionE@@Base+0x28352>
  c06bf1:	4c 89 e2             	mov    rdx,r12
  c06bf4:	4d 89 e8             	mov    r8,r13
  c06bf7:	41 b9 c8 00 00 00    	mov    r9d,0xc8
  c06bfd:	e8 28 08 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c06c02:	89 44 24 44          	mov    DWORD PTR [rsp+0x44],eax
  c06c06:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06c0a:	48 8d 35 8f 0d 7c ff 	lea    rsi,[rip+0xffffffffff7c0d8f]        # 3c79a0 <_ZTSN5boost9exceptionE@@Base+0x28382>
  c06c11:	48 8d 0d 98 0d 7c ff 	lea    rcx,[rip+0xffffffffff7c0d98]        # 3c79b0 <_ZTSN5boost9exceptionE@@Base+0x28392>
  c06c18:	4c 89 e2             	mov    rdx,r12
  c06c1b:	4d 89 f8             	mov    r8,r15
  c06c1e:	41 b9 e8 03 00 00    	mov    r9d,0x3e8
  c06c24:	e8 01 08 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c06c29:	89 44 24 3c          	mov    DWORD PTR [rsp+0x3c],eax
  c06c2d:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06c31:	48 8d 35 a5 0d 7c ff 	lea    rsi,[rip+0xffffffffff7c0da5]        # 3c79dd <_ZTSN5boost9exceptionE@@Base+0x283bf>
  c06c38:	48 8d 0d b1 0d 7c ff 	lea    rcx,[rip+0xffffffffff7c0db1]        # 3c79f0 <_ZTSN5boost9exceptionE@@Base+0x283d2>
  c06c3f:	4c 89 e2             	mov    rdx,r12
  c06c42:	4d 89 f0             	mov    r8,r14
  c06c45:	41 b9 e8 03 00 00    	mov    r9d,0x3e8
  c06c4b:	e8 da 07 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c06c50:	89 44 24 38          	mov    DWORD PTR [rsp+0x38],eax
  c06c54:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06c58:	48 8d 35 bb 0d 7c ff 	lea    rsi,[rip+0xffffffffff7c0dbb]        # 3c7a1a <_ZTSN5boost9exceptionE@@Base+0x283fc>
  c06c5f:	48 8d 0d ca 0d 7c ff 	lea    rcx,[rip+0xffffffffff7c0dca]        # 3c7a30 <_ZTSN5boost9exceptionE@@Base+0x28412>
  c06c66:	6a 27                	push   0x27
  c06c68:	41 58                	pop    r8
  c06c6a:	4c 89 e2             	mov    rdx,r12
  c06c6d:	41 b9 e8 03 00 00    	mov    r9d,0x3e8
  c06c73:	e8 b2 07 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c06c78:	89 44 24 34          	mov    DWORD PTR [rsp+0x34],eax
  c06c7c:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06c80:	48 8d 35 d1 0d 7c ff 	lea    rsi,[rip+0xffffffffff7c0dd1]        # 3c7a58 <_ZTSN5boost9exceptionE@@Base+0x2843a>
  c06c87:	48 8d 0d e2 0d 7c ff 	lea    rcx,[rip+0xffffffffff7c0de2]        # 3c7a70 <_ZTSN5boost9exceptionE@@Base+0x28452>
  c06c8e:	4c 89 e2             	mov    rdx,r12
  c06c91:	4d 89 f0             	mov    r8,r14
  c06c94:	41 b9 e8 03 00 00    	mov    r9d,0x3e8
  c06c9a:	e8 8b 07 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c06c9f:	89 44 24 30          	mov    DWORD PTR [rsp+0x30],eax
  c06ca3:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06ca7:	48 8d 35 ec 0d 7c ff 	lea    rsi,[rip+0xffffffffff7c0dec]        # 3c7a9a <_ZTSN5boost9exceptionE@@Base+0x2847c>
  c06cae:	48 8d 0d fb 0d 7c ff 	lea    rcx,[rip+0xffffffffff7c0dfb]        # 3c7ab0 <_ZTSN5boost9exceptionE@@Base+0x28492>
  c06cb5:	6a 26                	push   0x26
  c06cb7:	41 5d                	pop    r13
  c06cb9:	6a 03                	push   0x3
  c06cbb:	41 59                	pop    r9
  c06cbd:	4c 89 e2             	mov    rdx,r12
  c06cc0:	4d 89 e8             	mov    r8,r13
  c06cc3:	e8 62 07 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c06cc8:	89 44 24 40          	mov    DWORD PTR [rsp+0x40],eax
  c06ccc:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06cd0:	48 8d 35 00 0e 7c ff 	lea    rsi,[rip+0xffffffffff7c0e00]        # 3c7ad7 <_ZTSN5boost9exceptionE@@Base+0x284b9>
  c06cd7:	48 8d 0d 12 0e 7c ff 	lea    rcx,[rip+0xffffffffff7c0e12]        # 3c7af0 <_ZTSN5boost9exceptionE@@Base+0x284d2>
  c06cde:	6a 31                	push   0x31
  c06ce0:	41 5e                	pop    r14
  c06ce2:	4c 89 e2             	mov    rdx,r12
  c06ce5:	4d 89 f0             	mov    r8,r14
  c06ce8:	41 b9 84 03 00 00    	mov    r9d,0x384
  c06cee:	e8 37 07 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c06cf3:	89 44 24 2c          	mov    DWORD PTR [rsp+0x2c],eax
  c06cf7:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06cfb:	48 8d 35 20 0e 7c ff 	lea    rsi,[rip+0xffffffffff7c0e20]        # 3c7b22 <_ZTSN5boost9exceptionE@@Base+0x28504>
  c06d02:	48 8d 0d 27 0e 7c ff 	lea    rcx,[rip+0xffffffffff7c0e27]        # 3c7b30 <_ZTSN5boost9exceptionE@@Base+0x28512>
  c06d09:	6a 32                	push   0x32
  c06d0b:	41 58                	pop    r8
  c06d0d:	4c 89 e2             	mov    rdx,r12
  c06d10:	41 b9 20 03 00 00    	mov    r9d,0x320
  c06d16:	e8 0f 07 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c06d1b:	89 44 24 28          	mov    DWORD PTR [rsp+0x28],eax
  c06d1f:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06d23:	48 8d 35 39 0e 7c ff 	lea    rsi,[rip+0xffffffffff7c0e39]        # 3c7b63 <_ZTSN5boost9exceptionE@@Base+0x28545>
  c06d2a:	48 8d 0d 3f 0e 7c ff 	lea    rcx,[rip+0xffffffffff7c0e3f]        # 3c7b70 <_ZTSN5boost9exceptionE@@Base+0x28552>
  c06d31:	4c 89 e2             	mov    rdx,r12
  c06d34:	6a 30                	push   0x30
  c06d36:	41 58                	pop    r8
  c06d38:	41 b9 58 02 00 00    	mov    r9d,0x258
  c06d3e:	e8 e7 06 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c06d43:	89 44 24 24          	mov    DWORD PTR [rsp+0x24],eax
  c06d47:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06d4b:	48 8d 35 4f 0e 7c ff 	lea    rsi,[rip+0xffffffffff7c0e4f]        # 3c7ba1 <_ZTSN5boost9exceptionE@@Base+0x28583>
  c06d52:	48 8d 0d 57 0e 7c ff 	lea    rcx,[rip+0xffffffffff7c0e57]        # 3c7bb0 <_ZTSN5boost9exceptionE@@Base+0x28592>
  c06d59:	4c 89 e2             	mov    rdx,r12
  c06d5c:	4d 89 e8             	mov    r8,r13
  c06d5f:	41 b9 e8 03 00 00    	mov    r9d,0x3e8
  c06d65:	e8 c0 06 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c06d6a:	89 44 24 20          	mov    DWORD PTR [rsp+0x20],eax
  c06d6e:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06d72:	48 8d 35 5e 0e 7c ff 	lea    rsi,[rip+0xffffffffff7c0e5e]        # 3c7bd7 <_ZTSN5boost9exceptionE@@Base+0x285b9>
  c06d79:	48 8d 0d 70 0e 7c ff 	lea    rcx,[rip+0xffffffffff7c0e70]        # 3c7bf0 <_ZTSN5boost9exceptionE@@Base+0x285d2>
  c06d80:	4c 89 e2             	mov    rdx,r12
  c06d83:	6a 2b                	push   0x2b
  c06d85:	41 5d                	pop    r13
  c06d87:	4d 89 e8             	mov    r8,r13
  c06d8a:	41 b9 20 03 00 00    	mov    r9d,0x320
  c06d90:	e8 95 06 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c06d95:	89 44 24 1c          	mov    DWORD PTR [rsp+0x1c],eax
  c06d99:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06d9d:	48 8d 35 78 0e 7c ff 	lea    rsi,[rip+0xffffffffff7c0e78]        # 3c7c1c <_ZTSN5boost9exceptionE@@Base+0x285fe>
  c06da4:	48 8d 0d 85 0e 7c ff 	lea    rcx,[rip+0xffffffffff7c0e85]        # 3c7c30 <_ZTSN5boost9exceptionE@@Base+0x28612>
  c06dab:	6a 25                	push   0x25
  c06dad:	41 58                	pop    r8
  c06daf:	4c 89 e2             	mov    rdx,r12
  c06db2:	41 b9 58 02 00 00    	mov    r9d,0x258
  c06db8:	e8 6d 06 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c06dbd:	89 44 24 14          	mov    DWORD PTR [rsp+0x14],eax
  c06dc1:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06dc5:	48 8d 35 8a 0e 7c ff 	lea    rsi,[rip+0xffffffffff7c0e8a]        # 3c7c56 <_ZTSN5boost9exceptionE@@Base+0x28638>
  c06dcc:	48 8d 0d 9d 0e 7c ff 	lea    rcx,[rip+0xffffffffff7c0e9d]        # 3c7c70 <_ZTSN5boost9exceptionE@@Base+0x28652>
  c06dd3:	6a 2d                	push   0x2d
  c06dd5:	41 58                	pop    r8
  c06dd7:	4c 89 e2             	mov    rdx,r12
  c06dda:	45 31 c9             	xor    r9d,r9d
  c06ddd:	e8 a8 05 9e 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  c06de2:	88 44 24 03          	mov    BYTE PTR [rsp+0x3],al
  c06de6:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06dea:	48 8d 35 ad 0e 7c ff 	lea    rsi,[rip+0xffffffffff7c0ead]        # 3c7c9e <_ZTSN5boost9exceptionE@@Base+0x28680>
  c06df1:	48 8d 0d b8 0e 7c ff 	lea    rcx,[rip+0xffffffffff7c0eb8]        # 3c7cb0 <_ZTSN5boost9exceptionE@@Base+0x28692>
  c06df8:	4c 89 e2             	mov    rdx,r12
  c06dfb:	4d 89 f0             	mov    r8,r14
  c06dfe:	41 b9 f4 01 00 00    	mov    r9d,0x1f4
  c06e04:	e8 21 06 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c06e09:	f3 0f 2a c0          	cvtsi2ss xmm0,eax
  c06e0d:	f3 0f 5e 05 37 78 78 	divss  xmm0,DWORD PTR [rip+0xffffffffff787837]        # 38e64c <_ZTSSt12bad_any_cast@@Base-0x1b7c>
  c06e14:	ff 
  c06e15:	f3 0f 11 44 24 18    	movss  DWORD PTR [rsp+0x18],xmm0
  c06e1b:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06e1f:	48 8d 35 bc 0e 7c ff 	lea    rsi,[rip+0xffffffffff7c0ebc]        # 3c7ce2 <_ZTSN5boost9exceptionE@@Base+0x286c4>
  c06e26:	48 8d 0d c3 0e 7c ff 	lea    rcx,[rip+0xffffffffff7c0ec3]        # 3c7cf0 <_ZTSN5boost9exceptionE@@Base+0x286d2>
  c06e2d:	6a 23                	push   0x23
  c06e2f:	41 58                	pop    r8
  c06e31:	4c 89 e2             	mov    rdx,r12
  c06e34:	45 31 c9             	xor    r9d,r9d
  c06e37:	e8 4e 05 9e 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  c06e3c:	88 44 24 02          	mov    BYTE PTR [rsp+0x2],al
  c06e40:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06e44:	48 8d 35 cb 0f 7c ff 	lea    rsi,[rip+0xffffffffff7c0fcb]        # 3c7e16 <_ZTSN5boost9exceptionE@@Base+0x287f8>
  c06e4b:	48 8d 0d de 0f 7c ff 	lea    rcx,[rip+0xffffffffff7c0fde]        # 3c7e30 <_ZTSN5boost9exceptionE@@Base+0x28812>
  c06e52:	4c 89 e2             	mov    rdx,r12
  c06e55:	4d 89 f8             	mov    r8,r15
  c06e58:	6a 01                	push   0x1
  c06e5a:	41 59                	pop    r9
  c06e5c:	e8 29 05 9e 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  c06e61:	41 89 c7             	mov    r15d,eax
  c06e64:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06e68:	48 8d 35 a5 0e 7c ff 	lea    rsi,[rip+0xffffffffff7c0ea5]        # 3c7d14 <_ZTSN5boost9exceptionE@@Base+0x286f6>
  c06e6f:	48 8d 0d ba 0e 7c ff 	lea    rcx,[rip+0xffffffffff7c0eba]        # 3c7d30 <_ZTSN5boost9exceptionE@@Base+0x28712>
  c06e76:	4c 89 e2             	mov    rdx,r12
  c06e79:	4d 89 e8             	mov    r8,r13
  c06e7c:	45 31 c9             	xor    r9d,r9d
  c06e7f:	e8 06 05 9e 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  c06e84:	41 89 c5             	mov    r13d,eax
  c06e87:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06e8b:	48 8d 35 ca 0e 7c ff 	lea    rsi,[rip+0xffffffffff7c0eca]        # 3c7d5c <_ZTSN5boost9exceptionE@@Base+0x2873e>
  c06e92:	48 8d 0d d7 0e 7c ff 	lea    rcx,[rip+0xffffffffff7c0ed7]        # 3c7d70 <_ZTSN5boost9exceptionE@@Base+0x28752>
  c06e99:	6a 1b                	push   0x1b
  c06e9b:	41 58                	pop    r8
  c06e9d:	4c 89 e2             	mov    rdx,r12
  c06ea0:	45 31 c9             	xor    r9d,r9d
  c06ea3:	e8 e2 04 9e 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  c06ea8:	41 89 c6             	mov    r14d,eax
  c06eab:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c06eaf:	48 8d 35 d6 0e 7c ff 	lea    rsi,[rip+0xffffffffff7c0ed6]        # 3c7d8c <_ZTSN5boost9exceptionE@@Base+0x2876e>
  c06eb6:	48 8d 0d e3 0e 7c ff 	lea    rcx,[rip+0xffffffffff7c0ee3]        # 3c7da0 <_ZTSN5boost9exceptionE@@Base+0x28782>
  c06ebd:	4c 89 e2             	mov    rdx,r12
  c06ec0:	6a 28                	push   0x28
  c06ec2:	41 58                	pop    r8
  c06ec4:	41 b9 88 13 00 00    	mov    r9d,0x1388
  c06eca:	e8 5b 05 9e 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  c06ecf:	48 8b 8c 24 b0 00 00 	mov    rcx,QWORD PTR [rsp+0xb0]
  c06ed6:	00 
  c06ed7:	48 89 4b 10          	mov    QWORD PTR [rbx+0x10],rcx
  c06edb:	f3 0f 10 84 24 8c 00 	movss  xmm0,DWORD PTR [rsp+0x8c]
  c06ee2:	00 00 
  c06ee4:	f3 0f 11 43 18       	movss  DWORD PTR [rbx+0x18],xmm0
  c06ee9:	8b 8c 24 84 00 00 00 	mov    ecx,DWORD PTR [rsp+0x84]
  c06ef0:	89 4b 1c             	mov    DWORD PTR [rbx+0x1c],ecx
  c06ef3:	66 0f 6e 44 24 64    	movd   xmm0,DWORD PTR [rsp+0x64]
  c06ef9:	66 0f 3a 22 44 24 5c 	pinsrd xmm0,DWORD PTR [rsp+0x5c],0x1
  c06f00:	01 
  c06f01:	66 0f 3a 22 44 24 58 	pinsrd xmm0,DWORD PTR [rsp+0x58],0x2
  c06f08:	02 
  c06f09:	66 0f 3a 22 44 24 54 	pinsrd xmm0,DWORD PTR [rsp+0x54],0x3
  c06f10:	03 
  c06f11:	8b 8c 24 88 00 00 00 	mov    ecx,DWORD PTR [rsp+0x88]
  c06f18:	89 4b 20             	mov    DWORD PTR [rbx+0x20],ecx
  c06f1b:	f3 0f 10 8c 24 80 00 	movss  xmm1,DWORD PTR [rsp+0x80]
  c06f22:	00 00 
  c06f24:	f3 0f 11 4b 24       	movss  DWORD PTR [rbx+0x24],xmm1
  c06f29:	8a 4c 24 07          	mov    cl,BYTE PTR [rsp+0x7]
  c06f2d:	88 4b 28             	mov    BYTE PTR [rbx+0x28],cl
  c06f30:	f3 0f 10 4c 24 7c    	movss  xmm1,DWORD PTR [rsp+0x7c]
  c06f36:	f3 0f 11 4b 2c       	movss  DWORD PTR [rbx+0x2c],xmm1
  c06f3b:	8b 4c 24 74          	mov    ecx,DWORD PTR [rsp+0x74]
  c06f3f:	89 4b 30             	mov    DWORD PTR [rbx+0x30],ecx
  c06f42:	66 0f 6e 4c 24 50    	movd   xmm1,DWORD PTR [rsp+0x50]
  c06f48:	66 0f 3a 22 4c 24 4c 	pinsrd xmm1,DWORD PTR [rsp+0x4c],0x1
  c06f4f:	01 
  c06f50:	66 0f 3a 22 4c 24 48 	pinsrd xmm1,DWORD PTR [rsp+0x48],0x2
  c06f57:	02 
  c06f58:	66 0f 3a 22 4c 24 44 	pinsrd xmm1,DWORD PTR [rsp+0x44],0x3
  c06f5f:	03 
  c06f60:	8b 4c 24 78          	mov    ecx,DWORD PTR [rsp+0x78]
  c06f64:	89 4b 34             	mov    DWORD PTR [rbx+0x34],ecx
  c06f67:	66 0f 6e 54 24 3c    	movd   xmm2,DWORD PTR [rsp+0x3c]
  c06f6d:	66 0f 3a 22 54 24 38 	pinsrd xmm2,DWORD PTR [rsp+0x38],0x1
  c06f74:	01 
  c06f75:	66 0f 3a 22 54 24 34 	pinsrd xmm2,DWORD PTR [rsp+0x34],0x2
  c06f7c:	02 
  c06f7d:	f3 0f 10 5c 24 70    	movss  xmm3,DWORD PTR [rsp+0x70]
  c06f83:	f3 0f 11 5b 38       	movss  DWORD PTR [rbx+0x38],xmm3
  c06f88:	8a 4c 24 06          	mov    cl,BYTE PTR [rsp+0x6]
  c06f8c:	88 4b 3c             	mov    BYTE PTR [rbx+0x3c],cl
  c06f8f:	8b 4c 24 60          	mov    ecx,DWORD PTR [rsp+0x60]
  c06f93:	89 4b 40             	mov    DWORD PTR [rbx+0x40],ecx
  c06f96:	66 0f 3a 22 54 24 30 	pinsrd xmm2,DWORD PTR [rsp+0x30],0x3
  c06f9d:	03 
  c06f9e:	f3 0f 10 5c 24 6c    	movss  xmm3,DWORD PTR [rsp+0x6c]
  c06fa4:	f3 0f 11 5b 44       	movss  DWORD PTR [rbx+0x44],xmm3
  c06fa9:	48 8b 8c 24 a8 00 00 	mov    rcx,QWORD PTR [rsp+0xa8]
  c06fb0:	00 
  c06fb1:	48 89 4b 48          	mov    QWORD PTR [rbx+0x48],rcx
  c06fb5:	66 0f 6e 5c 24 2c    	movd   xmm3,DWORD PTR [rsp+0x2c]
  c06fbb:	66 0f 3a 22 5c 24 28 	pinsrd xmm3,DWORD PTR [rsp+0x28],0x1
  c06fc2:	01 
  c06fc3:	66 0f 3a 22 5c 24 24 	pinsrd xmm3,DWORD PTR [rsp+0x24],0x2
  c06fca:	02 
  c06fcb:	66 0f 3a 22 5c 24 20 	pinsrd xmm3,DWORD PTR [rsp+0x20],0x3
  c06fd2:	03 
  c06fd3:	66 0f 6e 64 24 1c    	movd   xmm4,DWORD PTR [rsp+0x1c]
  c06fd9:	66 0f 3a 22 64 24 14 	pinsrd xmm4,DWORD PTR [rsp+0x14],0x1
  c06fe0:	01 
  c06fe1:	0f b6 4c 24 02       	movzx  ecx,BYTE PTR [rsp+0x2]
  c06fe6:	66 0f 6e e9          	movd   xmm5,ecx
  c06fea:	41 0f b6 cf          	movzx  ecx,r15b
  c06fee:	66 0f 3a 20 e9 01    	pinsrb xmm5,ecx,0x1
  c06ff4:	41 0f b6 cd          	movzx  ecx,r13b
  c06ff8:	66 0f 3a 20 e9 02    	pinsrb xmm5,ecx,0x2
  c06ffe:	8a 4c 24 05          	mov    cl,BYTE PTR [rsp+0x5]
  c07002:	88 4b 50             	mov    BYTE PTR [rbx+0x50],cl
  c07005:	0f 5b c0             	cvtdq2ps xmm0,xmm0
  c07008:	0f 28 35 a1 64 78 ff 	movaps xmm6,XMMWORD PTR [rip+0xffffffffff7864a1]        # 38d4b0 <_ZTSSt12bad_any_cast@@Base-0x2d18>
  c0700f:	0f 5e c6             	divps  xmm0,xmm6
  c07012:	0f 11 43 54          	movups XMMWORD PTR [rbx+0x54],xmm0
  c07016:	f3 0f 10 44 24 68    	movss  xmm0,DWORD PTR [rsp+0x68]
  c0701c:	f3 0f 11 43 64       	movss  DWORD PTR [rbx+0x64],xmm0
  c07021:	8a 4c 24 04          	mov    cl,BYTE PTR [rsp+0x4]
  c07025:	88 4b 68             	mov    BYTE PTR [rbx+0x68],cl
  c07028:	0f 5b c1             	cvtdq2ps xmm0,xmm1
  c0702b:	0f 5e c6             	divps  xmm0,xmm6
  c0702e:	0f 11 43 6c          	movups XMMWORD PTR [rbx+0x6c],xmm0
  c07032:	0f 5b c2             	cvtdq2ps xmm0,xmm2
  c07035:	0f 5e c6             	divps  xmm0,xmm6
  c07038:	0f 11 43 7c          	movups XMMWORD PTR [rbx+0x7c],xmm0
  c0703c:	8b 4c 24 40          	mov    ecx,DWORD PTR [rsp+0x40]
  c07040:	89 8b 8c 00 00 00    	mov    DWORD PTR [rbx+0x8c],ecx
  c07046:	41 0f b6 ce          	movzx  ecx,r14b
  c0704a:	66 0f 3a 20 e9 03    	pinsrb xmm5,ecx,0x3
  c07050:	0f 5b c3             	cvtdq2ps xmm0,xmm3
  c07053:	0f 5e c6             	divps  xmm0,xmm6
  c07056:	0f 11 83 90 00 00 00 	movups XMMWORD PTR [rbx+0x90],xmm0
  c0705d:	0f 5b c4             	cvtdq2ps xmm0,xmm4
  c07060:	0f 5e 05 09 6e 78 ff 	divps  xmm0,XMMWORD PTR [rip+0xffffffffff786e09]        # 38de70 <_ZTSSt12bad_any_cast@@Base-0x2358>
  c07067:	0f 13 83 a0 00 00 00 	movlps QWORD PTR [rbx+0xa0],xmm0
  c0706e:	8a 4c 24 03          	mov    cl,BYTE PTR [rsp+0x3]
  c07072:	88 8b a8 00 00 00    	mov    BYTE PTR [rbx+0xa8],cl
  c07078:	48 98                	cdqe
  c0707a:	f3 0f 10 44 24 18    	movss  xmm0,DWORD PTR [rsp+0x18]
  c07080:	f3 0f 11 83 ac 00 00 	movss  DWORD PTR [rbx+0xac],xmm0
  c07087:	00 
  c07088:	66 0f 7e ab b0 00 00 	movd   DWORD PTR [rbx+0xb0],xmm5
  c0708f:	00 
  c07090:	48 89 83 b8 00 00 00 	mov    QWORD PTR [rbx+0xb8],rax
  c07097:	bf b8 00 00 00       	mov    edi,0xb8
  c0709c:	e8 5f 6e be 00       	call   17edf00 <_Znwm@plt>
  c070a1:	49 89 c6             	mov    r14,rax
  c070a4:	48 8d 05 cd ea c6 00 	lea    rax,[rip+0xc6eacd]        # 1875b78 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32260>
  c070ab:	49 89 06             	mov    QWORD PTR [r14],rax
  c070ae:	4c 89 f7             	mov    rdi,r14
  c070b1:	48 83 c7 08          	add    rdi,0x8
  c070b5:	ba b0 00 00 00       	mov    edx,0xb0
  c070ba:	48 8b b4 24 a0 00 00 	mov    rsi,QWORD PTR [rsp+0xa0]
  c070c1:	00 
  c070c2:	e8 09 8a be 00       	call   17efad0 <memcpy@plt>
  c070c7:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
  c070ce:	00 
  c070cf:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  c070d2:	4c 89 30             	mov    QWORD PTR [rax],r14
  c070d5:	48 85 ff             	test   rdi,rdi
  c070d8:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
  c070dd:	74 06                	je     c070e5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x154085>
  c070df:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  c070e2:	ff 50 08             	call   QWORD PTR [rax+0x8]
  c070e5:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
  c070ec:	00 
  c070ed:	48 83 a4 24 b8 00 00 	and    QWORD PTR [rsp+0xb8],0x0
  c070f4:	00 00 
  c070f6:	48 85 ff             	test   rdi,rdi
  c070f9:	74 06                	je     c07101 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1540a1>
  c070fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  c070fe:	ff 50 08             	call   QWORD PTR [rax+0x8]
  c07101:	49 89 1e             	mov    QWORD PTR [r14],rbx
  c07104:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  c0710b:	00 00 
  c0710d:	48 3b 84 24 20 01 00 	cmp    rax,QWORD PTR [rsp+0x120]
  c07114:	00 
  c07115:	0f 85 2e 01 00 00    	jne    c07249 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1541e9>
  c0711b:	4c 89 f0             	mov    rax,r14
  c0711e:	48 81 c4 28 01 00 00 	add    rsp,0x128
  c07125:	5b                   	pop    rbx
  c07126:	41 5c                	pop    r12
  c07128:	41 5d                	pop    r13
  c0712a:	41 5e                	pop    r14
  c0712c:	41 5f                	pop    r15
  c0712e:	5d                   	pop    rbp
  c0712f:	c3                   	ret
  c07130:	4c 89 ef             	mov    rdi,r13
  c07133:	4c 89 fe             	mov    rsi,r15
  c07136:	e8 45 6f be 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
  c0713b:	e9 12 ee ff ff       	jmp    c05f52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x152ef2>
  c07140:	eb 0c                	jmp    c0714e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1540ee>
  c07142:	eb 0a                	jmp    c0714e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1540ee>
  c07144:	eb 08                	jmp    c0714e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1540ee>
  c07146:	49 89 c4             	mov    r12,rax
  c07149:	e9 be 00 00 00       	jmp    c0720c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1541ac>
  c0714e:	49 89 c4             	mov    r12,rax
  c07151:	49 8d 46 38          	lea    rax,[r14+0x38]
  c07155:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  c0715a:	49 8d 6e 40          	lea    rbp,[r14+0x40]
  c0715e:	4c 89 f7             	mov    rdi,r14
  c07161:	48 83 c7 60          	add    rdi,0x60
  c07165:	e8 40 01 00 00       	call   c072aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15424a>
  c0716a:	48 89 ef             	mov    rdi,rbp
  c0716d:	e8 be fb e9 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  c07172:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  c07177:	e8 ac 2c e7 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
  c0717c:	4c 89 ef             	mov    rdi,r13
  c0717f:	e8 0c 6d be 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  c07184:	4c 89 ff             	mov    rdi,r15
  c07187:	e8 04 6d be 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  c0718c:	eb 37                	jmp    c071c5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x154165>
  c0718e:	eb 23                	jmp    c071b3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x154153>
  c07190:	49 89 c4             	mov    r12,rax
  c07193:	6a 30                	push   0x30
  c07195:	41 5e                	pop    r14
  c07197:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
  c0719b:	48 81 c7 d8 00 00 00 	add    rdi,0xd8
  c071a2:	e8 e9 6c be 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  c071a7:	49 83 c6 e8          	add    r14,0xffffffffffffffe8
  c071ab:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8
  c071af:	75 e6                	jne    c07197 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x154137>
  c071b1:	eb 3d                	jmp    c071f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x154190>
  c071b3:	49 89 c4             	mov    r12,rax
  c071b6:	eb 38                	jmp    c071f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x154190>
  c071b8:	49 89 c4             	mov    r12,rax
  c071bb:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  c071bf:	4c 89 ef             	mov    rdi,r13
  c071c2:	ff 50 08             	call   QWORD PTR [rax+0x8]
  c071c5:	4c 89 f7             	mov    rdi,r14
  c071c8:	eb 06                	jmp    c071d0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x154170>
  c071ca:	49 89 c4             	mov    r12,rax
  c071cd:	4c 89 ef             	mov    rdi,r13
  c071d0:	e8 4b 6d be 00       	call   17edf20 <_ZdlPv@plt>
  c071d5:	eb 42                	jmp    c07219 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1541b9>
  c071d7:	49 89 c4             	mov    r12,rax
  c071da:	eb 3d                	jmp    c07219 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1541b9>
  c071dc:	49 89 c4             	mov    r12,rax
  c071df:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
  c071e3:	4c 89 ef             	mov    rdi,r13
  c071e6:	e8 a5 6c be 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  c071eb:	4d 39 fd             	cmp    r13,r15
  c071ee:	75 ef                	jne    c071df <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15417f>
  c071f0:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
  c071f7:	00 
  c071f8:	48 83 a4 24 b8 00 00 	and    QWORD PTR [rsp+0xb8],0x0
  c071ff:	00 00 
  c07201:	48 85 ff             	test   rdi,rdi
  c07204:	74 06                	je     c0720c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1541ac>
  c07206:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  c07209:	ff 50 08             	call   QWORD PTR [rax+0x8]
  c0720c:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
  c07213:	00 
  c07214:	e8 0f 2c e7 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
  c07219:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
  c07220:	00 
  c07221:	e8 02 2c e7 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
  c07226:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  c0722d:	00 00 
  c0722f:	48 3b 84 24 20 01 00 	cmp    rax,QWORD PTR [rsp+0x120]
  c07236:	00 
  c07237:	75 10                	jne    c07249 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1541e9>
  c07239:	48 89 df             	mov    rdi,rbx
  c0723c:	e8 df 6c be 00       	call   17edf20 <_ZdlPv@plt>
  c07241:	4c 89 e7             	mov    rdi,r12
  c07244:	e8 87 8a e6 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  c07249:	e8 62 88 be 00       	call   17efab0 <__stack_chk_fail@plt>

## Automix factory AP materializations
AP 0x1814700
  +0x0: 0xc0724e
  +0x8: 0xc07278
  +0x10: 0x9d7de0
  +0x18: 0x9d7de0
  +0x20: 0xac3ae0
  +0x28: 0xc0728a
  +0x30: 0xc072a2
  +0x38: NO_RELOC
  +0x40: NO_RELOC
  +0x48: 0xc0732e
  +0x50: 0xc0736e
  +0x58: 0xc07380
  +0x60: NO_RELOC
  +0x68: NO_RELOC
  +0x70: 0x9d7de0
  +0x78: 0xa50370
  +0x80: 0xc07768
  +0x88: NO_RELOC
AP 0x1814770
  +0x0: 0x9d7de0
  +0x8: 0xa50370
  +0x10: 0xc07768
  +0x18: NO_RELOC
  +0x20: NO_RELOC
  +0x28: 0x15e3be4
  +0x30: 0xaae5e8
  +0x38: 0xc09a54
  +0x40: 0xaa8e00
  +0x48: 0x1066dbe
  +0x50: 0xc09978
  +0x58: NO_RELOC
  +0x60: NO_RELOC
  +0x68: 0x1739a20
  +0x70: 0xabf4aa
  +0x78: 0xabf4bc
  +0x80: 0xabf4cc
  +0x88: 0xc09c56
AP 0x1814748
  +0x0: 0xc0732e
  +0x8: 0xc0736e
  +0x10: 0xc07380
  +0x18: NO_RELOC
  +0x20: NO_RELOC
  +0x28: 0x9d7de0
  +0x30: 0xa50370
  +0x38: 0xc07768
  +0x40: NO_RELOC
  +0x48: NO_RELOC
  +0x50: 0x15e3be4
  +0x58: 0xaae5e8
  +0x60: 0xc09a54
  +0x68: 0xaa8e00
  +0x70: 0x1066dbe
  +0x78: 0xc09978
  +0x80: NO_RELOC
  +0x88: NO_RELOC
AP 0x1875b78
  +0x0: 0x9d7de0
  +0x8: 0xa50370
  +0x10: 0x1493622
  +0x18: 0x149362e
  +0x20: 0x149363a
  +0x28: 0x1493680
  +0x30: 0x1493692
  +0x38: 0x14936a4
  +0x40: 0x14936f6
  +0x48: 0x1493704
  +0x50: 0x1493712
  +0x58: 0x1493768
  +0x60: 0x149377e
  +0x68: 0x1493794
  +0x70: 0x14937e6
  +0x78: 0x14937f2
  +0x80: 0x1493800
  +0x88: 0x1493852

## Automix allocation/AP contexts
### 0xc05d57: call   17edf00 <_Znwm@plt>
  c05d2a:	48 81 ec 28 01 00 00 	sub    rsp,0x128
  c05d31:	49 89 fe             	mov    r14,rdi
  c05d34:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  c05d3b:	00 00 
  c05d3d:	48 89 84 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rax
  c05d44:	00 
  c05d45:	48 8b 6a 30          	mov    rbp,QWORD PTR [rdx+0x30]
  c05d49:	41 bc 50 04 00 00    	mov    r12d,0x450
  c05d4f:	4c 03 22             	add    r12,QWORD PTR [rdx]
  c05d52:	bf d0 00 00 00       	mov    edi,0xd0
  c05d57:	e8 a4 81 be 00       	call   17edf00 <_Znwm@plt>
  c05d5c:	48 89 c3             	mov    rbx,rax
  c05d5f:	31 c0                	xor    eax,eax
  c05d61:	88 43 08             	mov    BYTE PTR [rbx+0x8],al
  c05d64:	48 8d 0d 95 e9 c0 00 	lea    rcx,[rip+0xc0e995]        # 1814700 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa3c0>
  c05d6b:	48 89 0b             	mov    QWORD PTR [rbx],rcx
  c05d6e:	48 c7 43 10 30 75 00 	mov    QWORD PTR [rbx+0x10],0x7530
  c05d75:	00 
  c05d76:	0f 28 05 b3 7d 78 ff 	movaps xmm0,XMMWORD PTR [rip+0xffffffffff787db3]        # 38db30 <_ZTSSt12bad_any_cast@@Base-0x2698>
  c05d7d:	0f 11 43 18          	movups XMMWORD PTR [rbx+0x18],xmm0
  c05d81:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  c05d85:	0f 28 05 24 6e 78 ff 	movaps xmm0,XMMWORD PTR [rip+0xffffffffff786e24]        # 38cbb0 <_ZTSSt12bad_any_cast@@Base-0x3618>
  c05d8c:	0f 11 43 2c          	movups XMMWORD PTR [rbx+0x2c],xmm0
  c05d90:	88 43 3c             	mov    BYTE PTR [rbx+0x3c],al
  c05d93:	48 b9 00 00 00 00 0a 	movabs rcx,0x3c23d70a00000000
  c05d9a:	d7 23 3c 
  c05d9d:	48 89 4b 40          	mov    QWORD PTR [rbx+0x40],rcx
  c05da1:	48 c7 43 48 88 13 00 	mov    QWORD PTR [rbx+0x48],0x1388

### 0xc05d64: lea    rcx,[rip+0xc0e995]        # 1814700 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa3c0>
  c05d3d:	48 89 84 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rax
  c05d44:	00 
  c05d45:	48 8b 6a 30          	mov    rbp,QWORD PTR [rdx+0x30]
  c05d49:	41 bc 50 04 00 00    	mov    r12d,0x450
  c05d4f:	4c 03 22             	add    r12,QWORD PTR [rdx]
  c05d52:	bf d0 00 00 00       	mov    edi,0xd0
  c05d57:	e8 a4 81 be 00       	call   17edf00 <_Znwm@plt>
  c05d5c:	48 89 c3             	mov    rbx,rax
  c05d5f:	31 c0                	xor    eax,eax
  c05d61:	88 43 08             	mov    BYTE PTR [rbx+0x8],al
  c05d64:	48 8d 0d 95 e9 c0 00 	lea    rcx,[rip+0xc0e995]        # 1814700 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa3c0>
  c05d6b:	48 89 0b             	mov    QWORD PTR [rbx],rcx
  c05d6e:	48 c7 43 10 30 75 00 	mov    QWORD PTR [rbx+0x10],0x7530
  c05d75:	00 
  c05d76:	0f 28 05 b3 7d 78 ff 	movaps xmm0,XMMWORD PTR [rip+0xffffffffff787db3]        # 38db30 <_ZTSSt12bad_any_cast@@Base-0x2698>
  c05d7d:	0f 11 43 18          	movups XMMWORD PTR [rbx+0x18],xmm0
  c05d81:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  c05d85:	0f 28 05 24 6e 78 ff 	movaps xmm0,XMMWORD PTR [rip+0xffffffffff786e24]        # 38cbb0 <_ZTSSt12bad_any_cast@@Base-0x3618>
  c05d8c:	0f 11 43 2c          	movups XMMWORD PTR [rbx+0x2c],xmm0
  c05d90:	88 43 3c             	mov    BYTE PTR [rbx+0x3c],al
  c05d93:	48 b9 00 00 00 00 0a 	movabs rcx,0x3c23d70a00000000
  c05d9a:	d7 23 3c 
  c05d9d:	48 89 4b 40          	mov    QWORD PTR [rbx+0x40],rcx
  c05da1:	48 c7 43 48 88 13 00 	mov    QWORD PTR [rbx+0x48],0x1388
  c05da8:	00 
  c05da9:	88 43 50             	mov    BYTE PTR [rbx+0x50],al
  c05dac:	0f 28 05 fd 74 78 ff 	movaps xmm0,XMMWORD PTR [rip+0xffffffffff7874fd]        # 38d2b0 <_ZTSSt12bad_any_cast@@Base-0x2f18>
  c05db3:	0f 11 43 54          	movups XMMWORD PTR [rbx+0x54],xmm0

### 0xc05e35: call   17edf00 <_Znwm@plt>
  c05e0c:	00 00 00 3f 
  c05e10:	48 c7 83 b8 00 00 00 	mov    QWORD PTR [rbx+0xb8],0x2710
  c05e17:	10 27 00 00 
  c05e1b:	48 8d 83 c0 00 00 00 	lea    rax,[rbx+0xc0]
  c05e22:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
  c05e29:	00 
  c05e2a:	48 83 a3 c0 00 00 00 	and    QWORD PTR [rbx+0xc0],0x0
  c05e31:	00 
  c05e32:	6a 08                	push   0x8
  c05e34:	5f                   	pop    rdi
  c05e35:	e8 c6 80 be 00       	call   17edf00 <_Znwm@plt>
  c05e3a:	49 89 c5             	mov    r13,rax
  c05e3d:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
  c05e42:	48 8d 05 27 e9 c0 00 	lea    rax,[rip+0xc0e927]        # 1814770 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa430>
  c05e49:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
  c05e4d:	6a 68                	push   0x68
  c05e4f:	5f                   	pop    rdi
  c05e50:	e8 ab 80 be 00       	call   17edf00 <_Znwm@plt>
  c05e55:	49 89 c6             	mov    r14,rax
  c05e58:	48 8d 05 e9 e8 c0 00 	lea    rax,[rip+0xc0e8e9]        # 1814748 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa408>
  c05e5f:	49 89 06             	mov    QWORD PTR [r14],rax
  c05e62:	4d 8d 7e 08          	lea    r15,[r14+0x8]
  c05e66:	4c 89 ff             	mov    rdi,r15
  c05e69:	4c 89 e6             	mov    rsi,r12
  c05e6c:	e8 cf 80 be 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  c05e71:	0f 57 c0             	xorps  xmm0,xmm0
  c05e74:	49 83 66 30 00       	and    QWORD PTR [r14+0x30],0x0
  c05e79:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0

### 0xc05e42: lea    rax,[rip+0xc0e927]        # 1814770 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa430>
  c05e1b:	48 8d 83 c0 00 00 00 	lea    rax,[rbx+0xc0]
  c05e22:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
  c05e29:	00 
  c05e2a:	48 83 a3 c0 00 00 00 	and    QWORD PTR [rbx+0xc0],0x0
  c05e31:	00 
  c05e32:	6a 08                	push   0x8
  c05e34:	5f                   	pop    rdi
  c05e35:	e8 c6 80 be 00       	call   17edf00 <_Znwm@plt>
  c05e3a:	49 89 c5             	mov    r13,rax
  c05e3d:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
  c05e42:	48 8d 05 27 e9 c0 00 	lea    rax,[rip+0xc0e927]        # 1814770 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa430>
  c05e49:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
  c05e4d:	6a 68                	push   0x68
  c05e4f:	5f                   	pop    rdi
  c05e50:	e8 ab 80 be 00       	call   17edf00 <_Znwm@plt>
  c05e55:	49 89 c6             	mov    r14,rax
  c05e58:	48 8d 05 e9 e8 c0 00 	lea    rax,[rip+0xc0e8e9]        # 1814748 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa408>
  c05e5f:	49 89 06             	mov    QWORD PTR [r14],rax
  c05e62:	4d 8d 7e 08          	lea    r15,[r14+0x8]
  c05e66:	4c 89 ff             	mov    rdi,r15
  c05e69:	4c 89 e6             	mov    rsi,r12
  c05e6c:	e8 cf 80 be 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  c05e71:	0f 57 c0             	xorps  xmm0,xmm0
  c05e74:	49 83 66 30 00       	and    QWORD PTR [r14+0x30],0x0
  c05e79:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
  c05e7e:	4d 89 6e 38          	mov    QWORD PTR [r14+0x38],r13
  c05e82:	31 c0                	xor    eax,eax
  c05e84:	41 88 46 40          	mov    BYTE PTR [r14+0x40],al

### 0xc05e50: call   17edf00 <_Znwm@plt>
  c05e31:	00 
  c05e32:	6a 08                	push   0x8
  c05e34:	5f                   	pop    rdi
  c05e35:	e8 c6 80 be 00       	call   17edf00 <_Znwm@plt>
  c05e3a:	49 89 c5             	mov    r13,rax
  c05e3d:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
  c05e42:	48 8d 05 27 e9 c0 00 	lea    rax,[rip+0xc0e927]        # 1814770 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa430>
  c05e49:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
  c05e4d:	6a 68                	push   0x68
  c05e4f:	5f                   	pop    rdi
  c05e50:	e8 ab 80 be 00       	call   17edf00 <_Znwm@plt>
  c05e55:	49 89 c6             	mov    r14,rax
  c05e58:	48 8d 05 e9 e8 c0 00 	lea    rax,[rip+0xc0e8e9]        # 1814748 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa408>
  c05e5f:	49 89 06             	mov    QWORD PTR [r14],rax
  c05e62:	4d 8d 7e 08          	lea    r15,[r14+0x8]
  c05e66:	4c 89 ff             	mov    rdi,r15
  c05e69:	4c 89 e6             	mov    rsi,r12
  c05e6c:	e8 cf 80 be 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  c05e71:	0f 57 c0             	xorps  xmm0,xmm0
  c05e74:	49 83 66 30 00       	and    QWORD PTR [r14+0x30],0x0
  c05e79:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
  c05e7e:	4d 89 6e 38          	mov    QWORD PTR [r14+0x38],r13
  c05e82:	31 c0                	xor    eax,eax
  c05e84:	41 88 46 40          	mov    BYTE PTR [r14+0x40],al
  c05e88:	41 88 46 58          	mov    BYTE PTR [r14+0x58],al
  c05e8c:	49 83 66 60 00       	and    QWORD PTR [r14+0x60],0x0
  c05e91:	41 f6 46 08 01       	test   BYTE PTR [r14+0x8],0x1
  c05e96:	74 06                	je     c05e9e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x152e3e>

### 0xc05e58: lea    rax,[rip+0xc0e8e9]        # 1814748 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa408>
  c05e34:	5f                   	pop    rdi
  c05e35:	e8 c6 80 be 00       	call   17edf00 <_Znwm@plt>
  c05e3a:	49 89 c5             	mov    r13,rax
  c05e3d:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
  c05e42:	48 8d 05 27 e9 c0 00 	lea    rax,[rip+0xc0e927]        # 1814770 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa430>
  c05e49:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
  c05e4d:	6a 68                	push   0x68
  c05e4f:	5f                   	pop    rdi
  c05e50:	e8 ab 80 be 00       	call   17edf00 <_Znwm@plt>
  c05e55:	49 89 c6             	mov    r14,rax
  c05e58:	48 8d 05 e9 e8 c0 00 	lea    rax,[rip+0xc0e8e9]        # 1814748 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa408>
  c05e5f:	49 89 06             	mov    QWORD PTR [r14],rax
  c05e62:	4d 8d 7e 08          	lea    r15,[r14+0x8]
  c05e66:	4c 89 ff             	mov    rdi,r15
  c05e69:	4c 89 e6             	mov    rsi,r12
  c05e6c:	e8 cf 80 be 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  c05e71:	0f 57 c0             	xorps  xmm0,xmm0
  c05e74:	49 83 66 30 00       	and    QWORD PTR [r14+0x30],0x0
  c05e79:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
  c05e7e:	4d 89 6e 38          	mov    QWORD PTR [r14+0x38],r13
  c05e82:	31 c0                	xor    eax,eax
  c05e84:	41 88 46 40          	mov    BYTE PTR [r14+0x40],al
  c05e88:	41 88 46 58          	mov    BYTE PTR [r14+0x58],al
  c05e8c:	49 83 66 60 00       	and    QWORD PTR [r14+0x60],0x0
  c05e91:	41 f6 46 08 01       	test   BYTE PTR [r14+0x8],0x1
  c05e96:	74 06                	je     c05e9e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x152e3e>
  c05e98:	4d 8b 46 18          	mov    r8,QWORD PTR [r14+0x18]
  c05e9c:	eb 04                	jmp    c05ea2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x152e42>

### 0xc0709c: call   17edf00 <_Znwm@plt>
  c0706e:	8a 4c 24 03          	mov    cl,BYTE PTR [rsp+0x3]
  c07072:	88 8b a8 00 00 00    	mov    BYTE PTR [rbx+0xa8],cl
  c07078:	48 98                	cdqe
  c0707a:	f3 0f 10 44 24 18    	movss  xmm0,DWORD PTR [rsp+0x18]
  c07080:	f3 0f 11 83 ac 00 00 	movss  DWORD PTR [rbx+0xac],xmm0
  c07087:	00 
  c07088:	66 0f 7e ab b0 00 00 	movd   DWORD PTR [rbx+0xb0],xmm5
  c0708f:	00 
  c07090:	48 89 83 b8 00 00 00 	mov    QWORD PTR [rbx+0xb8],rax
  c07097:	bf b8 00 00 00       	mov    edi,0xb8
  c0709c:	e8 5f 6e be 00       	call   17edf00 <_Znwm@plt>
  c070a1:	49 89 c6             	mov    r14,rax
  c070a4:	48 8d 05 cd ea c6 00 	lea    rax,[rip+0xc6eacd]        # 1875b78 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32260>
  c070ab:	49 89 06             	mov    QWORD PTR [r14],rax
  c070ae:	4c 89 f7             	mov    rdi,r14
  c070b1:	48 83 c7 08          	add    rdi,0x8
  c070b5:	ba b0 00 00 00       	mov    edx,0xb0
  c070ba:	48 8b b4 24 a0 00 00 	mov    rsi,QWORD PTR [rsp+0xa0]
  c070c1:	00 
  c070c2:	e8 09 8a be 00       	call   17efad0 <memcpy@plt>
  c070c7:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
  c070ce:	00 
  c070cf:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  c070d2:	4c 89 30             	mov    QWORD PTR [rax],r14
  c070d5:	48 85 ff             	test   rdi,rdi
  c070d8:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
  c070dd:	74 06                	je     c070e5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x154085>
  c070df:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### 0xc070a4: lea    rax,[rip+0xc6eacd]        # 1875b78 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32260>
  c07078:	48 98                	cdqe
  c0707a:	f3 0f 10 44 24 18    	movss  xmm0,DWORD PTR [rsp+0x18]
  c07080:	f3 0f 11 83 ac 00 00 	movss  DWORD PTR [rbx+0xac],xmm0
  c07087:	00 
  c07088:	66 0f 7e ab b0 00 00 	movd   DWORD PTR [rbx+0xb0],xmm5
  c0708f:	00 
  c07090:	48 89 83 b8 00 00 00 	mov    QWORD PTR [rbx+0xb8],rax
  c07097:	bf b8 00 00 00       	mov    edi,0xb8
  c0709c:	e8 5f 6e be 00       	call   17edf00 <_Znwm@plt>
  c070a1:	49 89 c6             	mov    r14,rax
  c070a4:	48 8d 05 cd ea c6 00 	lea    rax,[rip+0xc6eacd]        # 1875b78 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32260>
  c070ab:	49 89 06             	mov    QWORD PTR [r14],rax
  c070ae:	4c 89 f7             	mov    rdi,r14
  c070b1:	48 83 c7 08          	add    rdi,0x8
  c070b5:	ba b0 00 00 00       	mov    edx,0xb0
  c070ba:	48 8b b4 24 a0 00 00 	mov    rsi,QWORD PTR [rsp+0xa0]
  c070c1:	00 
  c070c2:	e8 09 8a be 00       	call   17efad0 <memcpy@plt>
  c070c7:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
  c070ce:	00 
  c070cf:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  c070d2:	4c 89 30             	mov    QWORD PTR [rax],r14
  c070d5:	48 85 ff             	test   rdi,rdi
  c070d8:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
  c070dd:	74 06                	je     c070e5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x154085>
  c070df:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  c070e2:	ff 50 08             	call   QWORD PTR [rax+0x8]
  c070e5:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]

