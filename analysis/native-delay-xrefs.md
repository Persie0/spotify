# Native ad delay string-object xrefs

The metadata strings are static libc++ short-string objects at 0x18-byte stride.
The first byte stores the short-string length/flag; the text starts one byte later.

## ad.video_orientation @ object 0x438788
Direct code xrefs: 1

### xref 0x14dfc79 in 0x14df800..0x14e06e2
     14dfc35:	4c 89 ef             	mov    rdi,r13
     14dfc38:	48 89 da             	mov    rdx,rbx
     14dfc3b:	e8 a2 0a 00 00       	call   14e06e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325c66>
     14dfc40:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14dfc43:	48 89 df             	mov    rdi,rbx
     14dfc46:	ff 50 50             	call   QWORD PTR [rax+0x50]
     14dfc49:	84 c0                	test   al,al
     14dfc4b:	74 71                	je     14dfcbe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325242>
     14dfc4d:	48 8d 35 dc bf f5 fe 	lea    rsi,[rip+0xfffffffffef5bfdc]        # 43bc30 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x183c>
     14dfc54:	4c 89 ef             	mov    rdi,r13
     14dfc57:	e8 c8 ac 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14dfc5c:	48 8d 35 83 a0 e5 fe 	lea    rsi,[rip+0xfffffffffee5a083]        # 339ce6 <_ZTSSt12bad_any_cast@@Base-0x564e2>
     14dfc63:	48 89 c7             	mov    rdi,rax
     14dfc66:	e8 15 e3 30 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     14dfc6b:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14dfc6e:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     14dfc73:	48 89 de             	mov    rsi,rbx
     14dfc76:	ff 50 78             	call   QWORD PTR [rax+0x78]
     14dfc79:	48 8d 35 08 8b f5 fe 	lea    rsi,[rip+0xfffffffffef58b08]        # 438788 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e1d7>
     14dfc80:	4c 89 ef             	mov    rdi,r13
     14dfc83:	e8 9c ac 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14dfc88:	4c 8d 74 24 50       	lea    r14,[rsp+0x50]
     14dfc8d:	48 89 c7             	mov    rdi,rax
     14dfc90:	4c 89 f6             	mov    rsi,r14
     14dfc93:	e8 96 bd 59 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     14dfc98:	4c 89 f7             	mov    rdi,r14
     14dfc9b:	e8 f0 e1 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14dfca0:	48 8d 35 c9 fd 50 00 	lea    rsi,[rip+0x50fdc9]        # 19efa70 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x11a0>
     14dfca7:	4c 89 ef             	mov    rdi,r13
     14dfcaa:	e8 75 ac 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14dfcaf:	48 8d 35 cb 22 f7 fe 	lea    rsi,[rip+0xfffffffffef722cb]        # 451f81 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b8d>
     14dfcb6:	48 89 c7             	mov    rdi,rax
     14dfcb9:	e8 c2 e2 30 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     14dfcbe:	83 fd 01             	cmp    ebp,0x1
     14dfcc1:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
     14dfcc6:	0f 85 0e 03 00 00    	jne    14dffda <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32555e>
     14dfccc:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14dfccf:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
     14dfcd6:	00 
     14dfcd7:	48 89 de             	mov    rsi,rbx
     14dfcda:	ff 50 68             	call   QWORD PTR [rax+0x68]
     14dfcdd:	80 bc 24 08 01 00 00 	cmp    BYTE PTR [rsp+0x108],0x0
     14dfce4:	00 
     14dfce5:	0f 84 e2 02 00 00    	je     14dffcd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325551>
     14dfceb:	8b 84 24 00 01 00 00 	mov    eax,DWORD PTR [rsp+0x100]
     14dfcf2:	85 c0                	test   eax,eax

## ad.minimizable @ object 0x4387a0
Direct code xrefs: 1

### xref 0x14dfbb7 in 0x14df800..0x14e06e2
     14dfb60:	4c 89 f6             	mov    rsi,r14
     14dfb63:	e8 18 e4 30 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     14dfb68:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     14dfb6d:	e8 1e e3 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14dfb72:	48 8d 35 87 8c f5 fe 	lea    rsi,[rip+0xfffffffffef58c87]        # 438800 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e24f>
     14dfb79:	48 8d 0d d0 8d f5 fe 	lea    rcx,[rip+0xfffffffffef58dd0]        # 438950 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e39f>
     14dfb80:	4c 89 ef             	mov    rdi,r13
     14dfb83:	48 89 da             	mov    rdx,rbx
     14dfb86:	e8 57 0b 00 00       	call   14e06e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325c66>
     14dfb8b:	48 8d 35 8e 20 f7 fe 	lea    rsi,[rip+0xfffffffffef7208e]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     14dfb92:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     14dfb97:	e8 e2 9e 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14dfb9c:	4c 8d 73 20          	lea    r14,[rbx+0x20]
     14dfba0:	48 8d 35 a1 8c f5 fe 	lea    rsi,[rip+0xfffffffffef58ca1]        # 438848 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e297>
     14dfba7:	48 8d 54 24 50       	lea    rdx,[rsp+0x50]
     14dfbac:	4c 89 f7             	mov    rdi,r14
     14dfbaf:	e8 b6 2d 77 ff       	call   c5296a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19f90a>
     14dfbb4:	49 89 c7             	mov    r15,rax
     14dfbb7:	48 8d 35 e2 8b f5 fe 	lea    rsi,[rip+0xfffffffffef58be2]        # 4387a0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e1ef>
     14dfbbe:	4c 89 ef             	mov    rdi,r13
     14dfbc1:	e8 5e ad 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14dfbc6:	48 89 c7             	mov    rdi,rax
     14dfbc9:	4c 89 fe             	mov    rsi,r15
     14dfbcc:	e8 af e4 30 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     14dfbd1:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     14dfbd6:	e8 b5 e2 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14dfbdb:	48 8d 35 98 87 e9 fe 	lea    rsi,[rip+0xfffffffffee98798]        # 37837a <_ZTSSt12bad_any_cast@@Base-0x17e4e>
     14dfbe2:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     14dfbe7:	e8 92 9e 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14dfbec:	48 8d 35 6d 8c f5 fe 	lea    rsi,[rip+0xfffffffffef58c6d]        # 438860 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e2af>
     14dfbf3:	48 8d 54 24 50       	lea    rdx,[rsp+0x50]
     14dfbf8:	4c 89 f7             	mov    rdi,r14
     14dfbfb:	e8 6a 2d 77 ff       	call   c5296a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19f90a>
     14dfc00:	49 89 c6             	mov    r14,rax
     14dfc03:	48 8d 35 7e fe 50 00 	lea    rsi,[rip+0x50fe7e]        # 19efa88 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x11b8>
     14dfc0a:	4c 89 ef             	mov    rdi,r13
     14dfc0d:	e8 12 ad 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14dfc12:	48 89 c7             	mov    rdi,rax
     14dfc15:	4c 89 f6             	mov    rsi,r14
     14dfc18:	e8 63 e4 30 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     14dfc1d:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     14dfc22:	e8 69 e2 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14dfc27:	48 8d 35 8a c2 f5 fe 	lea    rsi,[rip+0xfffffffffef5c28a]        # 43beb8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1ac4>
     14dfc2e:	48 8d 0d 43 8c f5 fe 	lea    rcx,[rip+0xfffffffffef58c43]        # 438878 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e2c7>
     14dfc35:	4c 89 ef             	mov    rdi,r13
     14dfc38:	48 89 da             	mov    rdx,rbx

## ad.canvas.type @ object 0x4387b8
Direct code xrefs: 2

### xref 0x14e02e1 in 0x14df800..0x14e06e2
     14e028c:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
     14e0291:	48 89 c7             	mov    rdi,rax
     14e0294:	e8 e7 dd 30 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     14e0299:	4c 8b a3 b0 00 00 00 	mov    r12,QWORD PTR [rbx+0xb0]
     14e02a0:	48 8b ab b8 00 00 00 	mov    rbp,QWORD PTR [rbx+0xb8]
     14e02a7:	49 39 ec             	cmp    r12,rbp
     14e02aa:	0f 84 da 01 00 00    	je     14e048a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325a0e>
     14e02b0:	4c 8d 3d 69 89 eb fe 	lea    r15,[rip+0xfffffffffeeb8969]        # 398c20 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x5801>
     14e02b7:	4c 8d 2d 72 85 f5 fe 	lea    r13,[rip+0xfffffffffef58572]        # 438830 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e27f>
     14e02be:	41 8b 44 24 1c       	mov    eax,DWORD PTR [r12+0x1c]
     14e02c3:	ff c8                	dec    eax
     14e02c5:	83 f8 03             	cmp    eax,0x3
     14e02c8:	0f 87 af 01 00 00    	ja     14e047d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325a01>
     14e02ce:	49 63 04 87          	movsxd rax,DWORD PTR [r15+rax*4]
     14e02d2:	4c 01 f8             	add    rax,r15
     14e02d5:	ff e0                	jmp    rax
     14e02d7:	49 8b 5c 24 10       	mov    rbx,QWORD PTR [r12+0x10]
     14e02dc:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14e02e1:	48 8d 35 d0 84 f5 fe 	lea    rsi,[rip+0xfffffffffef584d0]        # 4387b8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e207>
     14e02e8:	e8 37 a6 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e02ed:	48 89 c7             	mov    rdi,rax
     14e02f0:	48 8d 35 b8 b7 e8 fe 	lea    rsi,[rip+0xfffffffffee8b7b8]        # 36baaf <_ZTSSt12bad_any_cast@@Base-0x24719>
     14e02f7:	e8 84 dc 30 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     14e02fc:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14e0301:	4c 89 ee             	mov    rsi,r13
     14e0304:	e8 1b a6 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e0309:	48 89 c7             	mov    rdi,rax
     14e030c:	48 8d 35 5d 09 e7 fe 	lea    rsi,[rip+0xfffffffffee7095d]        # 350c70 <_ZTSSt12bad_any_cast@@Base-0x3f558>
     14e0313:	e8 68 dc 30 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     14e0318:	83 7b 30 04          	cmp    DWORD PTR [rbx+0x30],0x4
     14e031c:	0f 85 5b 01 00 00    	jne    14e047d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325a01>
     14e0322:	4c 8b 73 28          	mov    r14,QWORD PTR [rbx+0x28]
     14e0326:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14e032b:	48 8d 35 b6 84 f5 fe 	lea    rsi,[rip+0xfffffffffef584b6]        # 4387e8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e237>
     14e0332:	e8 ed a5 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e0337:	e9 9e 00 00 00       	jmp    14e03da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32595e>
     14e033c:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14e0341:	4c 89 ee             	mov    rsi,r13
     14e0344:	e8 db a5 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e0349:	48 8d 35 7d 3d e8 fe 	lea    rsi,[rip+0xfffffffffee83d7d]        # 3640cd <_ZTSSt12bad_any_cast@@Base-0x2c0fb>
     14e0350:	eb 14                	jmp    14e0366 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3258ea>
     14e0352:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14e0357:	4c 89 ee             	mov    rsi,r13
     14e035a:	e8 c5 a5 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e035f:	48 8d 35 c1 af e9 fe 	lea    rsi,[rip+0xfffffffffee9afc1]        # 37b327 <_ZTSSt12bad_any_cast@@Base-0x14ea1>
     14e0366:	48 89 c7             	mov    rdi,rax

### xref 0x14e037d in 0x14df800..0x14e06e2
     14e0326:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14e032b:	48 8d 35 b6 84 f5 fe 	lea    rsi,[rip+0xfffffffffef584b6]        # 4387e8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e237>
     14e0332:	e8 ed a5 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e0337:	e9 9e 00 00 00       	jmp    14e03da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32595e>
     14e033c:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14e0341:	4c 89 ee             	mov    rsi,r13
     14e0344:	e8 db a5 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e0349:	48 8d 35 7d 3d e8 fe 	lea    rsi,[rip+0xfffffffffee83d7d]        # 3640cd <_ZTSSt12bad_any_cast@@Base-0x2c0fb>
     14e0350:	eb 14                	jmp    14e0366 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3258ea>
     14e0352:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14e0357:	4c 89 ee             	mov    rsi,r13
     14e035a:	e8 c5 a5 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e035f:	48 8d 35 c1 af e9 fe 	lea    rsi,[rip+0xfffffffffee9afc1]        # 37b327 <_ZTSSt12bad_any_cast@@Base-0x14ea1>
     14e0366:	48 89 c7             	mov    rdi,rax
     14e0369:	e8 12 dc 30 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     14e036e:	e9 0a 01 00 00       	jmp    14e047d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325a01>
     14e0373:	49 8b 5c 24 10       	mov    rbx,QWORD PTR [r12+0x10]
     14e0378:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14e037d:	48 8d 35 34 84 f5 fe 	lea    rsi,[rip+0xfffffffffef58434]        # 4387b8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e207>
     14e0384:	e8 9b a5 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e0389:	48 89 c7             	mov    rdi,rax
     14e038c:	48 8d 35 53 99 e5 fe 	lea    rsi,[rip+0xfffffffffee59953]        # 339ce6 <_ZTSSt12bad_any_cast@@Base-0x564e2>
     14e0393:	e8 e8 db 30 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     14e0398:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14e039d:	4c 89 ee             	mov    rsi,r13
     14e03a0:	e8 7f a5 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e03a5:	48 89 c7             	mov    rdi,rax
     14e03a8:	48 8d 35 da 7a e8 fe 	lea    rsi,[rip+0xfffffffffee87ada]        # 367e89 <_ZTSSt12bad_any_cast@@Base-0x2833f>
     14e03af:	e8 cc db 30 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     14e03b4:	8b 43 38             	mov    eax,DWORD PTR [rbx+0x38]
     14e03b7:	83 f8 06             	cmp    eax,0x6
     14e03ba:	74 32                	je     14e03ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325972>
     14e03bc:	83 f8 05             	cmp    eax,0x5
     14e03bf:	0f 85 b8 00 00 00    	jne    14e047d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325a01>
     14e03c5:	4c 8b 73 30          	mov    r14,QWORD PTR [rbx+0x30]
     14e03c9:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14e03ce:	48 8d 35 13 84 f5 fe 	lea    rsi,[rip+0xfffffffffef58413]        # 4387e8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e237>
     14e03d5:	e8 4a a5 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e03da:	49 83 e6 fc          	and    r14,0xfffffffffffffffc
     14e03de:	48 89 c7             	mov    rdi,rax
     14e03e1:	4c 89 f6             	mov    rsi,r14
     14e03e4:	e8 97 dc 30 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     14e03e9:	e9 8f 00 00 00       	jmp    14e047d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325a01>
     14e03ee:	48 8b 73 30          	mov    rsi,QWORD PTR [rbx+0x30]
     14e03f2:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     14e03f6:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]

## ad.canvas.file_id @ object 0x4387d0
Direct code xrefs: 1

### xref 0x14e0451 in 0x14df800..0x14e06e2
     14e040b:	e8 26 b4 59 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     14e0410:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     14e0417:	00 
     14e0418:	48 89 c6             	mov    rsi,rax
     14e041b:	e8 52 41 68 ff       	call   b64572 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb1512>
     14e0420:	84 c0                	test   al,al
     14e0422:	74 4c                	je     14e0470 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3259f4>
     14e0424:	48 8d 5c 24 50       	lea    rbx,[rsp+0x50]
     14e0429:	48 89 df             	mov    rdi,rbx
     14e042c:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
     14e0433:	00 
     14e0434:	e8 e7 3e 6b ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
     14e0439:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
     14e0440:	00 
     14e0441:	4c 89 f7             	mov    rdi,r14
     14e0444:	48 89 de             	mov    rsi,rbx
     14e0447:	e8 50 0b 78 ff       	call   c60f9c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1adf3c>
     14e044c:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14e0451:	48 8d 35 78 83 f5 fe 	lea    rsi,[rip+0xfffffffffef58378]        # 4387d0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e21f>
     14e0458:	e8 c7 a4 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e045d:	48 89 c7             	mov    rdi,rax
     14e0460:	4c 89 f6             	mov    rsi,r14
     14e0463:	e8 c6 b5 59 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     14e0468:	4c 89 f7             	mov    rdi,r14
     14e046b:	e8 20 da 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14e0470:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
     14e0477:	00 
     14e0478:	e8 13 da 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14e047d:	49 83 c4 20          	add    r12,0x20
     14e0481:	49 39 ec             	cmp    r12,rbp
     14e0484:	0f 85 34 fe ff ff    	jne    14e02be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325842>
     14e048a:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14e048f:	80 78 18 00          	cmp    BYTE PTR [rax+0x18],0x0
     14e0493:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     14e0498:	74 58                	je     14e04f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325a76>
     14e049a:	48 8d 35 77 83 f5 fe 	lea    rsi,[rip+0xfffffffffef58377]        # 438818 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e267>
     14e04a1:	48 89 df             	mov    rdi,rbx
     14e04a4:	e8 7b a4 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e04a9:	48 89 c7             	mov    rdi,rax
     14e04ac:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     14e04b1:	e8 ca db 30 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     14e04b6:	48 8d 35 3b 20 51 00 	lea    rsi,[rip+0x51203b]        # 19f24f8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x5b7>
     14e04bd:	48 89 df             	mov    rdi,rbx
     14e04c0:	e8 5f a4 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e04c5:	48 8d 35 54 17 f7 fe 	lea    rsi,[rip+0xfffffffffef71754]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     14e04cc:	48 89 c7             	mov    rdi,rax

## ad.canvas.url @ object 0x4387e8
Direct code xrefs: 2

### xref 0x14e032b in 0x14df800..0x14e06e2
     14e02d5:	ff e0                	jmp    rax
     14e02d7:	49 8b 5c 24 10       	mov    rbx,QWORD PTR [r12+0x10]
     14e02dc:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14e02e1:	48 8d 35 d0 84 f5 fe 	lea    rsi,[rip+0xfffffffffef584d0]        # 4387b8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e207>
     14e02e8:	e8 37 a6 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e02ed:	48 89 c7             	mov    rdi,rax
     14e02f0:	48 8d 35 b8 b7 e8 fe 	lea    rsi,[rip+0xfffffffffee8b7b8]        # 36baaf <_ZTSSt12bad_any_cast@@Base-0x24719>
     14e02f7:	e8 84 dc 30 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     14e02fc:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14e0301:	4c 89 ee             	mov    rsi,r13
     14e0304:	e8 1b a6 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e0309:	48 89 c7             	mov    rdi,rax
     14e030c:	48 8d 35 5d 09 e7 fe 	lea    rsi,[rip+0xfffffffffee7095d]        # 350c70 <_ZTSSt12bad_any_cast@@Base-0x3f558>
     14e0313:	e8 68 dc 30 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     14e0318:	83 7b 30 04          	cmp    DWORD PTR [rbx+0x30],0x4
     14e031c:	0f 85 5b 01 00 00    	jne    14e047d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325a01>
     14e0322:	4c 8b 73 28          	mov    r14,QWORD PTR [rbx+0x28]
     14e0326:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14e032b:	48 8d 35 b6 84 f5 fe 	lea    rsi,[rip+0xfffffffffef584b6]        # 4387e8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e237>
     14e0332:	e8 ed a5 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e0337:	e9 9e 00 00 00       	jmp    14e03da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32595e>
     14e033c:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14e0341:	4c 89 ee             	mov    rsi,r13
     14e0344:	e8 db a5 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e0349:	48 8d 35 7d 3d e8 fe 	lea    rsi,[rip+0xfffffffffee83d7d]        # 3640cd <_ZTSSt12bad_any_cast@@Base-0x2c0fb>
     14e0350:	eb 14                	jmp    14e0366 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3258ea>
     14e0352:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14e0357:	4c 89 ee             	mov    rsi,r13
     14e035a:	e8 c5 a5 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e035f:	48 8d 35 c1 af e9 fe 	lea    rsi,[rip+0xfffffffffee9afc1]        # 37b327 <_ZTSSt12bad_any_cast@@Base-0x14ea1>
     14e0366:	48 89 c7             	mov    rdi,rax
     14e0369:	e8 12 dc 30 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     14e036e:	e9 0a 01 00 00       	jmp    14e047d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325a01>
     14e0373:	49 8b 5c 24 10       	mov    rbx,QWORD PTR [r12+0x10]
     14e0378:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14e037d:	48 8d 35 34 84 f5 fe 	lea    rsi,[rip+0xfffffffffef58434]        # 4387b8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e207>
     14e0384:	e8 9b a5 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e0389:	48 89 c7             	mov    rdi,rax
     14e038c:	48 8d 35 53 99 e5 fe 	lea    rsi,[rip+0xfffffffffee59953]        # 339ce6 <_ZTSSt12bad_any_cast@@Base-0x564e2>
     14e0393:	e8 e8 db 30 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     14e0398:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14e039d:	4c 89 ee             	mov    rsi,r13
     14e03a0:	e8 7f a5 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e03a5:	48 89 c7             	mov    rdi,rax
     14e03a8:	48 8d 35 da 7a e8 fe 	lea    rsi,[rip+0xfffffffffee87ada]        # 367e89 <_ZTSSt12bad_any_cast@@Base-0x2833f>
     14e03af:	e8 cc db 30 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>

### xref 0x14e03ce in 0x14df800..0x14e06e2
     14e037d:	48 8d 35 34 84 f5 fe 	lea    rsi,[rip+0xfffffffffef58434]        # 4387b8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e207>
     14e0384:	e8 9b a5 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e0389:	48 89 c7             	mov    rdi,rax
     14e038c:	48 8d 35 53 99 e5 fe 	lea    rsi,[rip+0xfffffffffee59953]        # 339ce6 <_ZTSSt12bad_any_cast@@Base-0x564e2>
     14e0393:	e8 e8 db 30 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     14e0398:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14e039d:	4c 89 ee             	mov    rsi,r13
     14e03a0:	e8 7f a5 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e03a5:	48 89 c7             	mov    rdi,rax
     14e03a8:	48 8d 35 da 7a e8 fe 	lea    rsi,[rip+0xfffffffffee87ada]        # 367e89 <_ZTSSt12bad_any_cast@@Base-0x2833f>
     14e03af:	e8 cc db 30 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     14e03b4:	8b 43 38             	mov    eax,DWORD PTR [rbx+0x38]
     14e03b7:	83 f8 06             	cmp    eax,0x6
     14e03ba:	74 32                	je     14e03ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325972>
     14e03bc:	83 f8 05             	cmp    eax,0x5
     14e03bf:	0f 85 b8 00 00 00    	jne    14e047d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325a01>
     14e03c5:	4c 8b 73 30          	mov    r14,QWORD PTR [rbx+0x30]
     14e03c9:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14e03ce:	48 8d 35 13 84 f5 fe 	lea    rsi,[rip+0xfffffffffef58413]        # 4387e8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e237>
     14e03d5:	e8 4a a5 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e03da:	49 83 e6 fc          	and    r14,0xfffffffffffffffc
     14e03de:	48 89 c7             	mov    rdi,rax
     14e03e1:	4c 89 f6             	mov    rsi,r14
     14e03e4:	e8 97 dc 30 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     14e03e9:	e9 8f 00 00 00       	jmp    14e047d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325a01>
     14e03ee:	48 8b 73 30          	mov    rsi,QWORD PTR [rbx+0x30]
     14e03f2:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     14e03f6:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
     14e03fd:	00 
     14e03fe:	e8 3d db 30 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14e0403:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
     14e040a:	00 
     14e040b:	e8 26 b4 59 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     14e0410:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     14e0417:	00 
     14e0418:	48 89 c6             	mov    rsi,rax
     14e041b:	e8 52 41 68 ff       	call   b64572 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb1512>
     14e0420:	84 c0                	test   al,al
     14e0422:	74 4c                	je     14e0470 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3259f4>
     14e0424:	48 8d 5c 24 50       	lea    rbx,[rsp+0x50]
     14e0429:	48 89 df             	mov    rdi,rbx
     14e042c:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
     14e0433:	00 
     14e0434:	e8 e7 3e 6b ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
     14e0439:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
     14e0440:	00 

## ad.skippable_ad_delay @ object 0x438800
Direct code xrefs: 1

### xref 0x14dfb72 in 0x14df800..0x14e06e2
     14dfb23:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     14dfb28:	e8 63 e3 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14dfb2d:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14dfb30:	48 89 df             	mov    rdi,rbx
     14dfb33:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
     14dfb39:	84 c0                	test   al,al
     14dfb3b:	4d 0f 45 f4          	cmovne r14,r12
     14dfb3f:	48 8d 35 22 f1 39 00 	lea    rsi,[rip+0x39f122]        # 187ec68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3b350>
     14dfb46:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     14dfb4b:	e8 5a 22 2e 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
     14dfb50:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     14dfb55:	4c 89 ef             	mov    rdi,r13
     14dfb58:	e8 c7 ad 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14dfb5d:	48 89 c7             	mov    rdi,rax
     14dfb60:	4c 89 f6             	mov    rsi,r14
     14dfb63:	e8 18 e4 30 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     14dfb68:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     14dfb6d:	e8 1e e3 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14dfb72:	48 8d 35 87 8c f5 fe 	lea    rsi,[rip+0xfffffffffef58c87]        # 438800 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e24f>
     14dfb79:	48 8d 0d d0 8d f5 fe 	lea    rcx,[rip+0xfffffffffef58dd0]        # 438950 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e39f>
     14dfb80:	4c 89 ef             	mov    rdi,r13
     14dfb83:	48 89 da             	mov    rdx,rbx
     14dfb86:	e8 57 0b 00 00       	call   14e06e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325c66>
     14dfb8b:	48 8d 35 8e 20 f7 fe 	lea    rsi,[rip+0xfffffffffef7208e]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     14dfb92:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     14dfb97:	e8 e2 9e 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14dfb9c:	4c 8d 73 20          	lea    r14,[rbx+0x20]
     14dfba0:	48 8d 35 a1 8c f5 fe 	lea    rsi,[rip+0xfffffffffef58ca1]        # 438848 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e297>
     14dfba7:	48 8d 54 24 50       	lea    rdx,[rsp+0x50]
     14dfbac:	4c 89 f7             	mov    rdi,r14
     14dfbaf:	e8 b6 2d 77 ff       	call   c5296a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19f90a>
     14dfbb4:	49 89 c7             	mov    r15,rax
     14dfbb7:	48 8d 35 e2 8b f5 fe 	lea    rsi,[rip+0xfffffffffef58be2]        # 4387a0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e1ef>
     14dfbbe:	4c 89 ef             	mov    rdi,r13
     14dfbc1:	e8 5e ad 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14dfbc6:	48 89 c7             	mov    rdi,rax
     14dfbc9:	4c 89 fe             	mov    rsi,r15
     14dfbcc:	e8 af e4 30 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     14dfbd1:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     14dfbd6:	e8 b5 e2 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14dfbdb:	48 8d 35 98 87 e9 fe 	lea    rsi,[rip+0xfffffffffee98798]        # 37837a <_ZTSSt12bad_any_cast@@Base-0x17e4e>
     14dfbe2:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     14dfbe7:	e8 92 9e 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14dfbec:	48 8d 35 6d 8c f5 fe 	lea    rsi,[rip+0xfffffffffef58c6d]        # 438860 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e2af>
     14dfbf3:	48 8d 54 24 50       	lea    rdx,[rsp+0x50]
     14dfbf8:	4c 89 f7             	mov    rdi,r14

## podcast_ads.parent_uri @ object 0x438818
Direct code xrefs: 1

### xref 0x14e049a in 0x14df800..0x14e06e2
     14e044c:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14e0451:	48 8d 35 78 83 f5 fe 	lea    rsi,[rip+0xfffffffffef58378]        # 4387d0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e21f>
     14e0458:	e8 c7 a4 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e045d:	48 89 c7             	mov    rdi,rax
     14e0460:	4c 89 f6             	mov    rsi,r14
     14e0463:	e8 c6 b5 59 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     14e0468:	4c 89 f7             	mov    rdi,r14
     14e046b:	e8 20 da 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14e0470:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
     14e0477:	00 
     14e0478:	e8 13 da 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14e047d:	49 83 c4 20          	add    r12,0x20
     14e0481:	49 39 ec             	cmp    r12,rbp
     14e0484:	0f 85 34 fe ff ff    	jne    14e02be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325842>
     14e048a:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14e048f:	80 78 18 00          	cmp    BYTE PTR [rax+0x18],0x0
     14e0493:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     14e0498:	74 58                	je     14e04f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325a76>
     14e049a:	48 8d 35 77 83 f5 fe 	lea    rsi,[rip+0xfffffffffef58377]        # 438818 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e267>
     14e04a1:	48 89 df             	mov    rdi,rbx
     14e04a4:	e8 7b a4 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e04a9:	48 89 c7             	mov    rdi,rax
     14e04ac:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     14e04b1:	e8 ca db 30 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     14e04b6:	48 8d 35 3b 20 51 00 	lea    rsi,[rip+0x51203b]        # 19f24f8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x5b7>
     14e04bd:	48 89 df             	mov    rdi,rbx
     14e04c0:	e8 5f a4 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e04c5:	48 8d 35 54 17 f7 fe 	lea    rsi,[rip+0xfffffffffef71754]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     14e04cc:	48 89 c7             	mov    rdi,rax
     14e04cf:	e8 ac da 30 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     14e04d4:	48 8d 35 2d bb f5 fe 	lea    rsi,[rip+0xfffffffffef5bb2d]        # 43c008 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1c14>
     14e04db:	48 89 df             	mov    rdi,rbx
     14e04de:	e8 41 a4 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e04e3:	48 8d 35 36 17 f7 fe 	lea    rsi,[rip+0xfffffffffef71736]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     14e04ea:	48 89 c7             	mov    rdi,rax
     14e04ed:	e8 8e da 30 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     14e04f2:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     14e04f7:	e8 94 d9 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14e04fc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14e0503:	00 00 
     14e0505:	48 3b 84 24 40 01 00 	cmp    rax,QWORD PTR [rsp+0x140]
     14e050c:	00 
     14e050d:	0f 85 ca 01 00 00    	jne    14e06dd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325c61>
     14e0513:	48 81 c4 48 01 00 00 	add    rsp,0x148
     14e051a:	5b                   	pop    rbx
     14e051b:	41 5c                	pop    r12

## ad.companion.type @ object 0x438830
Direct code xrefs: 1

### xref 0x14e02b7 in 0x14df800..0x14e06e2
     14e025c:	e8 1f de 30 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     14e0261:	48 8d 35 00 bb f5 fe 	lea    rsi,[rip+0xfffffffffef5bb00]        # 43bd68 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1974>
     14e0268:	4c 89 ef             	mov    rdi,r13
     14e026b:	e8 b4 a6 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e0270:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
     14e0275:	48 89 c7             	mov    rdi,rax
     14e0278:	e8 03 de 30 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     14e027d:	48 8d 35 fc ba f5 fe 	lea    rsi,[rip+0xfffffffffef5bafc]        # 43bd80 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x198c>
     14e0284:	4c 89 ef             	mov    rdi,r13
     14e0287:	e8 98 a6 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e028c:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
     14e0291:	48 89 c7             	mov    rdi,rax
     14e0294:	e8 e7 dd 30 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     14e0299:	4c 8b a3 b0 00 00 00 	mov    r12,QWORD PTR [rbx+0xb0]
     14e02a0:	48 8b ab b8 00 00 00 	mov    rbp,QWORD PTR [rbx+0xb8]
     14e02a7:	49 39 ec             	cmp    r12,rbp
     14e02aa:	0f 84 da 01 00 00    	je     14e048a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325a0e>
     14e02b0:	4c 8d 3d 69 89 eb fe 	lea    r15,[rip+0xfffffffffeeb8969]        # 398c20 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x5801>
     14e02b7:	4c 8d 2d 72 85 f5 fe 	lea    r13,[rip+0xfffffffffef58572]        # 438830 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e27f>
     14e02be:	41 8b 44 24 1c       	mov    eax,DWORD PTR [r12+0x1c]
     14e02c3:	ff c8                	dec    eax
     14e02c5:	83 f8 03             	cmp    eax,0x3
     14e02c8:	0f 87 af 01 00 00    	ja     14e047d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325a01>
     14e02ce:	49 63 04 87          	movsxd rax,DWORD PTR [r15+rax*4]
     14e02d2:	4c 01 f8             	add    rax,r15
     14e02d5:	ff e0                	jmp    rax
     14e02d7:	49 8b 5c 24 10       	mov    rbx,QWORD PTR [r12+0x10]
     14e02dc:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14e02e1:	48 8d 35 d0 84 f5 fe 	lea    rsi,[rip+0xfffffffffef584d0]        # 4387b8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e207>
     14e02e8:	e8 37 a6 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e02ed:	48 89 c7             	mov    rdi,rax
     14e02f0:	48 8d 35 b8 b7 e8 fe 	lea    rsi,[rip+0xfffffffffee8b7b8]        # 36baaf <_ZTSSt12bad_any_cast@@Base-0x24719>
     14e02f7:	e8 84 dc 30 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     14e02fc:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14e0301:	4c 89 ee             	mov    rsi,r13
     14e0304:	e8 1b a6 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e0309:	48 89 c7             	mov    rdi,rax
     14e030c:	48 8d 35 5d 09 e7 fe 	lea    rsi,[rip+0xfffffffffee7095d]        # 350c70 <_ZTSSt12bad_any_cast@@Base-0x3f558>
     14e0313:	e8 68 dc 30 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     14e0318:	83 7b 30 04          	cmp    DWORD PTR [rbx+0x30],0x4
     14e031c:	0f 85 5b 01 00 00    	jne    14e047d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325a01>
     14e0322:	4c 8b 73 28          	mov    r14,QWORD PTR [rbx+0x28]
     14e0326:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14e032b:	48 8d 35 b6 84 f5 fe 	lea    rsi,[rip+0xfffffffffef584b6]        # 4387e8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e237>
     14e0332:	e8 ed a5 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e0337:	e9 9e 00 00 00       	jmp    14e03da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32595e>

## skippable @ object 0x4388f0
Direct code xrefs: 2

### xref 0x145c94b in 0x145c8ba..0x145c9a8
     145c90a:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     145c90f:	6a 10                	push   0x10
     145c911:	59                   	pop    rcx
     145c912:	6a 11                	push   0x11
     145c914:	41 59                	pop    r9
     145c916:	4c 89 f7             	mov    rdi,r14
     145c919:	e8 aa ab 18 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
     145c91e:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
     145c923:	74 5a                	je     145c97f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a1f03>
     145c925:	48 8d 35 25 14 ef fe 	lea    rsi,[rip+0xfffffffffeef1425]        # 34dd51 <_ZTSSt12bad_any_cast@@Base-0x42477>
     145c92c:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     145c931:	e8 19 ef 61 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     145c936:	84 c0                	test   al,al
     145c938:	74 45                	je     145c97f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a1f03>
     145c93a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     145c93f:	e8 ec a3 64 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     145c944:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     145c947:	48 83 c7 20          	add    rdi,0x20
     145c94b:	48 8d 35 9e bf fd fe 	lea    rsi,[rip+0xfffffffffefdbf9e]        # 4388f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e33f>
     145c952:	e8 95 ca a2 ff       	call   e893ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50802>
     145c957:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     145c95e:	00 00 
     145c960:	48 3b 4c 24 28       	cmp    rcx,QWORD PTR [rsp+0x28]
     145c965:	75 3c                	jne    145c9a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a1f27>
     145c967:	48 8d 35 b2 52 ff fe 	lea    rsi,[rip+0xfffffffffeff52b2]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     145c96e:	48 89 c7             	mov    rdi,rax
     145c971:	48 83 c4 30          	add    rsp,0x30
     145c975:	5b                   	pop    rbx
     145c976:	41 5e                	pop    r14
     145c978:	41 5f                	pop    r15
     145c97a:	e9 01 16 39 00       	jmp    17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     145c97f:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     145c984:	e8 a7 a3 64 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     145c989:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     145c990:	00 00 
     145c992:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
     145c997:	75 0a                	jne    145c9a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a1f27>
     145c999:	48 83 c4 30          	add    rsp,0x30
     145c99d:	5b                   	pop    rbx
     145c99e:	41 5e                	pop    r14
     145c9a0:	41 5f                	pop    r15
     145c9a2:	c3                   	ret
     145c9a3:	e8 08 31 39 00       	call   17efab0 <__stack_chk_fail@plt>
     145c9a8:	50                   	push   rax
     145c9a9:	48 89 f8             	mov    rax,rdi
     145c9ac:	48 8b 56 20          	mov    rdx,QWORD PTR [rsi+0x20]

### xref 0x14e2476 in 0x14e2472..0x14e2489
     14e243b:	75 30                	jne    14e246d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3279f1>
     14e243d:	48 89 d8             	mov    rax,rbx
     14e2440:	48 83 c4 20          	add    rsp,0x20
     14e2444:	5b                   	pop    rbx
     14e2445:	41 5e                	pop    r14
     14e2447:	41 5f                	pop    r15
     14e2449:	c3                   	ret
     14e244a:	48 89 c3             	mov    rbx,rax
     14e244d:	48 89 e7             	mov    rdi,rsp
     14e2450:	e8 3b ba 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14e2455:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14e245c:	00 00 
     14e245e:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     14e2463:	75 08                	jne    14e246d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3279f1>
     14e2465:	48 89 df             	mov    rdi,rbx
     14e2468:	e8 63 d8 58 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     14e246d:	e8 3e d6 30 00       	call   17efab0 <__stack_chk_fail@plt>
     14e2472:	48 83 c7 20          	add    rdi,0x20
     14e2476:	48 8d 35 73 64 f5 fe 	lea    rsi,[rip+0xfffffffffef56473]        # 4388f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e33f>
     14e247d:	48 8d 15 9c f7 f6 fe 	lea    rdx,[rip+0xfffffffffef6f79c]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     14e2484:	e9 5e 01 00 00       	jmp    14e25e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b6b>
     14e2489:	cc                   	int3
     14e248a:	53                   	push   rbx
     14e248b:	b0 01                	mov    al,0x1
     14e248d:	80 bf b8 01 00 00 00 	cmp    BYTE PTR [rdi+0x1b8],0x0
     14e2494:	75 13                	jne    14e24a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327a2d>
     14e2496:	48 89 fb             	mov    rbx,rdi
     14e2499:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14e249c:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
     14e24a2:	48 85 c0             	test   rax,rax
     14e24a5:	7e 04                	jle    14e24ab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327a2f>
     14e24a7:	31 c0                	xor    eax,eax
     14e24a9:	5b                   	pop    rbx
     14e24aa:	c3                   	ret
     14e24ab:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14e24ae:	48 89 df             	mov    rdi,rbx
     14e24b1:	5b                   	pop    rbx
     14e24b2:	ff a0 c8 00 00 00    	jmp    QWORD PTR [rax+0xc8]
     14e24b8:	48 83 c7 20          	add    rdi,0x20
     14e24bc:	48 8d 35 05 65 f5 fe 	lea    rsi,[rip+0xfffffffffef56505]        # 4389c8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e417>
     14e24c3:	48 8d 15 56 f7 f6 fe 	lea    rdx,[rip+0xfffffffffef6f756]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     14e24ca:	e9 18 01 00 00       	jmp    14e25e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b6b>
     14e24cf:	cc                   	int3
     14e24d0:	48 83 c7 20          	add    rdi,0x20
     14e24d4:	48 8d 35 05 65 f5 fe 	lea    rsi,[rip+0xfffffffffef56505]        # 4389e0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e42f>
     14e24db:	48 8d 15 3e f7 f6 fe 	lea    rdx,[rip+0xfffffffffef6f73e]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>

## skippable_ad_delay @ object 0x438950
Direct code xrefs: 2

### xref 0x14dfb79 in 0x14df800..0x14e06e2
     14dfb28:	e8 63 e3 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14dfb2d:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14dfb30:	48 89 df             	mov    rdi,rbx
     14dfb33:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
     14dfb39:	84 c0                	test   al,al
     14dfb3b:	4d 0f 45 f4          	cmovne r14,r12
     14dfb3f:	48 8d 35 22 f1 39 00 	lea    rsi,[rip+0x39f122]        # 187ec68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3b350>
     14dfb46:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     14dfb4b:	e8 5a 22 2e 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
     14dfb50:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     14dfb55:	4c 89 ef             	mov    rdi,r13
     14dfb58:	e8 c7 ad 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14dfb5d:	48 89 c7             	mov    rdi,rax
     14dfb60:	4c 89 f6             	mov    rsi,r14
     14dfb63:	e8 18 e4 30 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     14dfb68:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     14dfb6d:	e8 1e e3 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14dfb72:	48 8d 35 87 8c f5 fe 	lea    rsi,[rip+0xfffffffffef58c87]        # 438800 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e24f>
     14dfb79:	48 8d 0d d0 8d f5 fe 	lea    rcx,[rip+0xfffffffffef58dd0]        # 438950 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e39f>
     14dfb80:	4c 89 ef             	mov    rdi,r13
     14dfb83:	48 89 da             	mov    rdx,rbx
     14dfb86:	e8 57 0b 00 00       	call   14e06e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325c66>
     14dfb8b:	48 8d 35 8e 20 f7 fe 	lea    rsi,[rip+0xfffffffffef7208e]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     14dfb92:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     14dfb97:	e8 e2 9e 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14dfb9c:	4c 8d 73 20          	lea    r14,[rbx+0x20]
     14dfba0:	48 8d 35 a1 8c f5 fe 	lea    rsi,[rip+0xfffffffffef58ca1]        # 438848 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e297>
     14dfba7:	48 8d 54 24 50       	lea    rdx,[rsp+0x50]
     14dfbac:	4c 89 f7             	mov    rdi,r14
     14dfbaf:	e8 b6 2d 77 ff       	call   c5296a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19f90a>
     14dfbb4:	49 89 c7             	mov    r15,rax
     14dfbb7:	48 8d 35 e2 8b f5 fe 	lea    rsi,[rip+0xfffffffffef58be2]        # 4387a0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e1ef>
     14dfbbe:	4c 89 ef             	mov    rdi,r13
     14dfbc1:	e8 5e ad 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14dfbc6:	48 89 c7             	mov    rdi,rax
     14dfbc9:	4c 89 fe             	mov    rsi,r15
     14dfbcc:	e8 af e4 30 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     14dfbd1:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     14dfbd6:	e8 b5 e2 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14dfbdb:	48 8d 35 98 87 e9 fe 	lea    rsi,[rip+0xfffffffffee98798]        # 37837a <_ZTSSt12bad_any_cast@@Base-0x17e4e>
     14dfbe2:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     14dfbe7:	e8 92 9e 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14dfbec:	48 8d 35 6d 8c f5 fe 	lea    rsi,[rip+0xfffffffffef58c6d]        # 438860 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e2af>
     14dfbf3:	48 8d 54 24 50       	lea    rdx,[rsp+0x50]
     14dfbf8:	4c 89 f7             	mov    rdi,r14
     14dfbfb:	e8 6a 2d 77 ff       	call   c5296a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19f90a>

### xref 0x14e2523 in 0x14e24e8..0x14e25cf
     14e24e2:	e9 00 01 00 00       	jmp    14e25e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b6b>
     14e24e7:	cc                   	int3
     14e24e8:	41 56                	push   r14
     14e24ea:	53                   	push   rbx
     14e24eb:	48 83 ec 38          	sub    rsp,0x38
     14e24ef:	48 89 fb             	mov    rbx,rdi
     14e24f2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14e24f9:	00 00 
     14e24fb:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     14e2500:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14e2503:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
     14e2509:	84 c0                	test   al,al
     14e250b:	74 7d                	je     14e258a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b0e>
     14e250d:	48 83 c3 20          	add    rbx,0x20
     14e2511:	48 8d 35 75 04 e9 fe 	lea    rsi,[rip+0xfffffffffee90475]        # 37298d <_ZTSSt12bad_any_cast@@Base-0x1d83b>
     14e2518:	49 89 e6             	mov    r14,rsp
     14e251b:	4c 89 f7             	mov    rdi,r14
     14e251e:	e8 5b 75 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14e2523:	48 8d 35 26 64 f5 fe 	lea    rsi,[rip+0xfffffffffef56426]        # 438950 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e39f>
     14e252a:	48 89 df             	mov    rdi,rbx
     14e252d:	4c 89 f2             	mov    rdx,r14
     14e2530:	e8 35 04 77 ff       	call   c5296a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19f90a>
     14e2535:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     14e253a:	48 89 c6             	mov    rsi,rax
     14e253d:	e8 fe b9 30 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14e2542:	48 89 e3             	mov    rbx,rsp
     14e2545:	48 89 df             	mov    rdi,rbx
     14e2548:	e8 43 b9 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14e254d:	83 23 00             	and    DWORD PTR [rbx],0x0
     14e2550:	48 8d 44 24 19       	lea    rax,[rsp+0x19]
     14e2555:	0f b6 48 ff          	movzx  ecx,BYTE PTR [rax-0x1]
     14e2559:	89 ce                	mov    esi,ecx
     14e255b:	d1 ee                	shr    esi,1
     14e255d:	f6 c1 01             	test   cl,0x1
     14e2560:	48 8b 78 0f          	mov    rdi,QWORD PTR [rax+0xf]
     14e2564:	48 0f 44 f8          	cmove  rdi,rax
     14e2568:	48 0f 45 70 07       	cmovne rsi,QWORD PTR [rax+0x7]
     14e256d:	48 01 fe             	add    rsi,rdi
     14e2570:	48 89 e3             	mov    rbx,rsp
     14e2573:	48 89 da             	mov    rdx,rbx
     14e2576:	e8 08 79 7e ff       	call   cc9e83 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x216e23>
     14e257b:	48 63 1b             	movsxd rbx,DWORD PTR [rbx]
     14e257e:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     14e2583:	e8 08 b9 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14e2588:	eb 02                	jmp    14e258c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b10>
     14e258a:	31 db                	xor    ebx,ebx

## seekable @ object 0x4389c8
Direct code xrefs: 1

### xref 0x14e24bc in 0x14e24b8..0x14e24cf
     14e2489:	cc                   	int3
     14e248a:	53                   	push   rbx
     14e248b:	b0 01                	mov    al,0x1
     14e248d:	80 bf b8 01 00 00 00 	cmp    BYTE PTR [rdi+0x1b8],0x0
     14e2494:	75 13                	jne    14e24a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327a2d>
     14e2496:	48 89 fb             	mov    rbx,rdi
     14e2499:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14e249c:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
     14e24a2:	48 85 c0             	test   rax,rax
     14e24a5:	7e 04                	jle    14e24ab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327a2f>
     14e24a7:	31 c0                	xor    eax,eax
     14e24a9:	5b                   	pop    rbx
     14e24aa:	c3                   	ret
     14e24ab:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14e24ae:	48 89 df             	mov    rdi,rbx
     14e24b1:	5b                   	pop    rbx
     14e24b2:	ff a0 c8 00 00 00    	jmp    QWORD PTR [rax+0xc8]
     14e24b8:	48 83 c7 20          	add    rdi,0x20
     14e24bc:	48 8d 35 05 65 f5 fe 	lea    rsi,[rip+0xfffffffffef56505]        # 4389c8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e417>
     14e24c3:	48 8d 15 56 f7 f6 fe 	lea    rdx,[rip+0xfffffffffef6f756]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     14e24ca:	e9 18 01 00 00       	jmp    14e25e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b6b>
     14e24cf:	cc                   	int3
     14e24d0:	48 83 c7 20          	add    rdi,0x20
     14e24d4:	48 8d 35 05 65 f5 fe 	lea    rsi,[rip+0xfffffffffef56505]        # 4389e0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e42f>
     14e24db:	48 8d 15 3e f7 f6 fe 	lea    rdx,[rip+0xfffffffffef6f73e]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     14e24e2:	e9 00 01 00 00       	jmp    14e25e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b6b>
     14e24e7:	cc                   	int3
     14e24e8:	41 56                	push   r14
     14e24ea:	53                   	push   rbx
     14e24eb:	48 83 ec 38          	sub    rsp,0x38
     14e24ef:	48 89 fb             	mov    rbx,rdi
     14e24f2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14e24f9:	00 00 
     14e24fb:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     14e2500:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14e2503:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
     14e2509:	84 c0                	test   al,al
     14e250b:	74 7d                	je     14e258a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b0e>
     14e250d:	48 83 c3 20          	add    rbx,0x20
     14e2511:	48 8d 35 75 04 e9 fe 	lea    rsi,[rip+0xfffffffffee90475]        # 37298d <_ZTSSt12bad_any_cast@@Base-0x1d83b>
     14e2518:	49 89 e6             	mov    r14,rsp
     14e251b:	4c 89 f7             	mov    rdi,r14
     14e251e:	e8 5b 75 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14e2523:	48 8d 35 26 64 f5 fe 	lea    rsi,[rip+0xfffffffffef56426]        # 438950 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e39f>
     14e252a:	48 89 df             	mov    rdi,rbx
     14e252d:	4c 89 f2             	mov    rdx,r14

## interruptible @ object 0x4389e0
Direct code xrefs: 1

### xref 0x14e24d4 in 0x14e24d0..0x14e24e7
     14e2496:	48 89 fb             	mov    rbx,rdi
     14e2499:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14e249c:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
     14e24a2:	48 85 c0             	test   rax,rax
     14e24a5:	7e 04                	jle    14e24ab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327a2f>
     14e24a7:	31 c0                	xor    eax,eax
     14e24a9:	5b                   	pop    rbx
     14e24aa:	c3                   	ret
     14e24ab:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14e24ae:	48 89 df             	mov    rdi,rbx
     14e24b1:	5b                   	pop    rbx
     14e24b2:	ff a0 c8 00 00 00    	jmp    QWORD PTR [rax+0xc8]
     14e24b8:	48 83 c7 20          	add    rdi,0x20
     14e24bc:	48 8d 35 05 65 f5 fe 	lea    rsi,[rip+0xfffffffffef56505]        # 4389c8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e417>
     14e24c3:	48 8d 15 56 f7 f6 fe 	lea    rdx,[rip+0xfffffffffef6f756]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     14e24ca:	e9 18 01 00 00       	jmp    14e25e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b6b>
     14e24cf:	cc                   	int3
     14e24d0:	48 83 c7 20          	add    rdi,0x20
     14e24d4:	48 8d 35 05 65 f5 fe 	lea    rsi,[rip+0xfffffffffef56505]        # 4389e0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e42f>
     14e24db:	48 8d 15 3e f7 f6 fe 	lea    rdx,[rip+0xfffffffffef6f73e]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     14e24e2:	e9 00 01 00 00       	jmp    14e25e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b6b>
     14e24e7:	cc                   	int3
     14e24e8:	41 56                	push   r14
     14e24ea:	53                   	push   rbx
     14e24eb:	48 83 ec 38          	sub    rsp,0x38
     14e24ef:	48 89 fb             	mov    rbx,rdi
     14e24f2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14e24f9:	00 00 
     14e24fb:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     14e2500:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14e2503:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
     14e2509:	84 c0                	test   al,al
     14e250b:	74 7d                	je     14e258a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b0e>
     14e250d:	48 83 c3 20          	add    rbx,0x20
     14e2511:	48 8d 35 75 04 e9 fe 	lea    rsi,[rip+0xfffffffffee90475]        # 37298d <_ZTSSt12bad_any_cast@@Base-0x1d83b>
     14e2518:	49 89 e6             	mov    r14,rsp
     14e251b:	4c 89 f7             	mov    rdi,r14
     14e251e:	e8 5b 75 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14e2523:	48 8d 35 26 64 f5 fe 	lea    rsi,[rip+0xfffffffffef56426]        # 438950 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e39f>
     14e252a:	48 89 df             	mov    rdi,rbx
     14e252d:	4c 89 f2             	mov    rdx,r14
     14e2530:	e8 35 04 77 ff       	call   c5296a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19f90a>
     14e2535:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     14e253a:	48 89 c6             	mov    rsi,rax
     14e253d:	e8 fe b9 30 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14e2542:	48 89 e3             	mov    rbx,rsp

## on_demand_capped @ object 0x4389f8
Direct code xrefs: 1

### xref 0x14e5a30 in 0x14e59ea..0x14e5a8c
     14e59ea:	41 56                	push   r14
     14e59ec:	53                   	push   rbx
     14e59ed:	48 83 ec 28          	sub    rsp,0x28
     14e59f1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14e59f8:	00 00 
     14e59fa:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     14e59ff:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     14e5a02:	48 8b 5f 10          	mov    rbx,QWORD PTR [rdi+0x10]
     14e5a06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14e5a09:	ff 50 10             	call   QWORD PTR [rax+0x10]
     14e5a0c:	48 8d 0d 0d c2 f6 fe 	lea    rcx,[rip+0xfffffffffef6c20d]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     14e5a13:	48 8d 35 0b c2 f6 fe 	lea    rsi,[rip+0xfffffffffef6c20b]        # 451c25 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17831>
     14e5a1a:	84 c0                	test   al,al
     14e5a1c:	48 0f 45 f1          	cmovne rsi,rcx
     14e5a20:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     14e5a25:	4c 89 f7             	mov    rdi,r14
     14e5a28:	e8 51 40 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14e5a2d:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14e5a30:	48 8d 35 c1 2f f5 fe 	lea    rsi,[rip+0xfffffffffef52fc1]        # 4389f8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e447>
     14e5a37:	48 89 df             	mov    rdi,rbx
     14e5a3a:	4c 89 f2             	mov    rdx,r14
     14e5a3d:	ff 50 20             	call   QWORD PTR [rax+0x20]
     14e5a40:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     14e5a45:	e8 46 84 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14e5a4a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14e5a51:	00 00 
     14e5a53:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     14e5a58:	75 2d                	jne    14e5a87 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32b00b>
     14e5a5a:	48 83 c4 28          	add    rsp,0x28
     14e5a5e:	5b                   	pop    rbx
     14e5a5f:	41 5e                	pop    r14
     14e5a61:	c3                   	ret
     14e5a62:	48 89 c3             	mov    rbx,rax
     14e5a65:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     14e5a6a:	e8 21 84 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14e5a6f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14e5a76:	00 00 
     14e5a78:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     14e5a7d:	75 08                	jne    14e5a87 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32b00b>
     14e5a7f:	48 89 df             	mov    rdi,rbx
     14e5a82:	e8 49 a2 58 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     14e5a87:	e8 24 a0 30 00       	call   17efab0 <__stack_chk_fail@plt>
     14e5a8c:	53                   	push   rbx
     14e5a8d:	48 89 fb             	mov    rbx,rdi
     14e5a90:	48 8d 05 51 41 39 00 	lea    rax,[rip+0x394151]        # 1879be8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x362d0>
     14e5a97:	48 89 07             	mov    QWORD PTR [rdi],rax

## Pointer-table references

